#pragma once

#include "definitions.h"

/* ── PiDDB Cache Table Cleaning with Pattern Scanning ───────────────────── */

/*
 * CleanPiDDBCacheTable - Removes driver entries from PiDDB cache
 * Uses pattern scanning to locate PiDDBLock and PiDDBCacheTable
 * Essential for manual mapped drivers to avoid detection
 */

typedef struct _PI_DDB_CACHE_ENTRY {
    LIST_ENTRY List;
    UNICODE_STRING DriverName;
    ULONG TimeDateStamp;
    NTSTATUS LoadStatus;
    CHAR _pad[16];
} PI_DDB_CACHE_ENTRY, *PPI_DDB_CACHE_ENTRY;

/* Pattern for PiDDBLock detection */
static const UCHAR PiDDBLockPattern[] = {
    0x48, 0x8D, 0x0D, 0x00, 0x00, 0x00, 0x00, 0x00, // lea rcx, [PiDDBLock]
    0x48, 0x89, 0x0D, 0x00, 0x00, 0x00, 0x00, 0x00, // mov [PiDDBLock], rcx
    0x4C, 0x8B, 0x0D, 0x00, 0x00, 0x00, 0x00, 0x00  // mov r9, [PiDDBCacheTable]
};

static const UCHAR PiDDBCacheTablePattern[] = {
    0x48, 0x8B, 0x1D, 0x00, 0x00, 0x00, 0x00, 0x00, // mov rbx, [PiDDBCacheTable]
    0x48, 0x85, 0xDB,                               // test rbx, rbx
    0x74, 0x0A,                                   // jz short
    0x48, 0x83, 0xC3, 0x28,                         // add rbx, 28h
    0x48, 0x89, 0x1D, 0x00, 0x00, 0x00, 0x00, 0x00  // mov [PiDDBCacheTable], rbx
};

/* Pattern scanning function */
static BOOLEAN ScanPattern(PUCHAR base, SIZE_T size, PUCHAR pattern, SIZE_T patternSize, PULONG_PTR offset)
{
    if (!base || !pattern || !offset) return FALSE;
    
    for (SIZE_T i = 0; i < size - patternSize; i++) {
        BOOLEAN found = TRUE;
        for (SIZE_T j = 0; j < patternSize; j++) {
            if (pattern[j] != 0xCC && base[i + j] != pattern[j]) {
                found = FALSE;
                break;
            }
        }
        if (found) {
            *offset = i;
            return TRUE;
        }
    }
    return FALSE;
}

/* Locate PiDDB structures via pattern scanning */
static BOOLEAN LocatePiDDB(PERESOURCE* PiDDBLock, PRTL_AVL_TABLE* PiDDBCacheTable)
{
    ULONG bytesNeeded = 0;
    
    // Get ntoskrnl base
    ZwQuerySystemInformation(SystemModuleInformation, NULL, 0, &bytesNeeded);
    if (!bytesNeeded) return FALSE;
    
    PRTL_PROCESS_MODULES modules = (PRTL_PROCESS_MODULES)ExAllocatePoolWithTag(
        NonPagedPool, bytesNeeded, 'dbiP');
    if (!modules) return FALSE;
    
    if (!NT_SUCCESS(ZwQuerySystemInformation(SystemModuleInformation, 
            modules, bytesNeeded, &bytesNeeded))) {
        ExFreePoolWithTag(modules, 'dbiP');
        return FALSE;
    }
    
    PVOID ntoskrnlBase = modules->Modules[0].ImageBase;
    ULONG ntoskrnlSize = modules->Modules[0].ImageSize;
    ExFreePoolWithTag(modules, 'dbiP');
    
    if (!ntoskrnlBase) return FALSE;
    
    // Scan for PiDDBLock
    ULONG_PTR lockOffset = 0;
    if (!ScanPattern((PUCHAR)ntoskrnlBase, ntoskrnlSize, 
            (PUCHAR)PiDDBLockPattern, sizeof(PiDDBLockPattern), &lockOffset)) {
        return FALSE;
    }
    
    // Extract relative offset
    LONG lockRelOffset = *(PLONG)((PUCHAR)ntoskrnlBase + lockOffset + 3);
    *PiDDBLock = *(PERESOURCE*)((PUCHAR)ntoskrnlBase + lockOffset + 7 + lockRelOffset);
    
    // Scan for PiDDBCacheTable
    ULONG_PTR cacheOffset = 0;
    if (!ScanPattern((PUCHAR)ntoskrnlBase, ntoskrnlSize,
            (PUCHAR)PiDDBCacheTablePattern, sizeof(PiDDBCacheTablePattern), &cacheOffset)) {
        return FALSE;
    }
    
    // Extract relative offset
    LONG cacheRelOffset = *(PLONG)((PUCHAR)ntoskrnlBase + cacheOffset + 3);
    *PiDDBCacheTable = *(PRTL_AVL_TABLE*)((PUCHAR)ntoskrnlBase + cacheOffset + 7 + cacheRelOffset);
    
    return (*PiDDBLock != NULL && *PiDDBCacheTable != NULL);
}

/* Main PiDDB cleaning function */
BOOLEAN CleanPiDDBCacheTable()
{
    PERESOURCE PiDDBLock = NULL;
    PRTL_AVL_TABLE PiDDBCacheTable = NULL;
    
    // Locate PiDDB structures
    if (!LocatePiDDB(&PiDDBLock, &PiDDBCacheTable)) {
        return FALSE;
    }
    
    // Create entry to remove (IntelGraphicsDriver.sys for ABI disguise)
    PI_DDB_CACHE_ENTRY lookupEntry;
    UNICODE_STRING driverName = RTL_CONSTANT_STRING(L"IntelGraphicsDriver.sys");
    lookupEntry.DriverName = driverName;
    lookupEntry.TimeDateStamp = 0x42494E54; // "BIN" timestamp
    
    ExAcquireResourceExclusiveLite(PiDDBLock, TRUE);
    
    // Search and remove entry
    PPI_DDB_CACHE_ENTRY foundEntry = (PPI_DDB_CACHE_ENTRY)RtlLookupElementGenericTableAvl(
        PiDDBCacheTable, &lookupEntry);
    
    if (foundEntry) {
        RemoveEntryList(&foundEntry->List);
        RtlDeleteElementGenericTableAvl(PiDDBCacheTable, foundEntry);
    }
    
    ExReleaseResourceLite(PiDDBLock);
    return (foundEntry != NULL);
}
