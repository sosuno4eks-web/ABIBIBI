#pragma once

#include "definitions.h"

/* ── ACE Bypass - PiDDB Cache Cleaning ───────────────────────── */

/*
 * PiDDB Cache cleaning for Arena Breakout Infinite (UE 4.26.1)
 * Uses specific pattern: 48 8D 0D ? ? ? E8 ? ? ? 3D ? ? ? 0F 85
 */

typedef struct _PI_DDB_CACHE_ENTRY {
    LIST_ENTRY List;
    UNICODE_STRING DriverName;
    ULONG TimeDateStamp;
    NTSTATUS LoadStatus;
    CHAR _pad[16];
} PI_DDB_CACHE_ENTRY, *PPI_DDB_CACHE_ENTRY;

/* PiDDB Lock Pattern for Windows 10/11 */
static const UCHAR PiDDBLockPattern[] = {
    0x48, 0x8D, 0x0D, 0x00, 0x00, 0x00, 0x00, // lea rcx, [PiDDBLock]
    0x48, 0x89, 0x0D, 0x00, 0x00, 0x00, 0x00, // mov [PiDDBLock], rcx
    0x0F, 0x85, 0x3D, 0x00, 0x00, 0x00, 0x00  // test r15, [PiDDBLock]
};

/* Pattern scanning with wildcard support */
static BOOLEAN ScanPattern(PUCHAR base, SIZE_T size, PUCHAR pattern, SIZE_T patternSize, PULONG_PTR offset)
{
    if (!base || !pattern || !offset) return FALSE;
    
    __try {
        for (SIZE_T i = 0; i < size - patternSize; i++) {
            BOOLEAN found = TRUE;
            for (SIZE_T j = 0; j < patternSize; j++) {
                // 0x?? acts as 2-byte wildcard
                if (pattern[j] != 0x?? && base[i + j] != pattern[j]) {
                    found = FALSE;
                    break;
                }
            }
            if (found) {
                *offset = i;
                return TRUE;
            }
        }
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return FALSE;
    }
    
    return FALSE;
}

/* Get ntoskrnl base address */
static PVOID GetNtoskrnlBase()
{
    ULONG bytesNeeded = 0;
    
    ZwQuerySystemInformation(SystemModuleInformation, NULL, 0, &bytesNeeded);
    if (!bytesNeeded) return NULL;
    
    PRTL_PROCESS_MODULES modules = (PRTL_PROCESS_MODULES)ExAllocatePoolWithTag(
        NonPagedPool, bytesNeeded, 'lnKN');
    if (!modules) return NULL;
    
    if (!NT_SUCCESS(ZwQuerySystemInformation(SystemModuleInformation, 
            modules, bytesNeeded, &bytesNeeded))) {
        ExFreePoolWithTag(modules, 'lnKN');
        return NULL;
    }
    
    PVOID ntoskrnlBase = modules->Modules[0].ImageBase;
    ExFreePoolWithTag(modules, 'lnKN');
    
    return ntoskrnlBase;
}

/* Locate PiDDB structures */
static BOOLEAN LocatePiDDBStructures(PERESOURCE* PiDDBLock, PRTL_AVL_TABLE* PiDDBCacheTable)
{
    PVOID ntoskrnlBase = GetNtoskrnlBase();
    if (!ntoskrnlBase) return FALSE;
    
    ULONG ntoskrnlSize = 0x2000000; // 32MB
    
    ULONG_PTR patternOffset = 0;
    if (!ScanPattern((PUCHAR)ntoskrnlBase, ntoskrnlSize,
            (PUCHAR)PiDDBLockPattern, sizeof(PiDDBLockPattern), &patternOffset)) {
        return FALSE;
    }
    
    __try {
        // Extract relative offset for PiDDBLock
        LONG lockRelOffset = *(PLONG)((PUCHAR)ntoskrnlBase + patternOffset + 3);
        *PiDDBLock = *(PERESOURCE*)((PUCHAR)ntoskrnlBase + patternOffset + 7 + lockRelOffset);
        
        // PiDDBCacheTable is usually at PiDDBLock + 0x20 (may vary)
        *PiDDBCacheTable = *(PRTL_AVL_TABLE*)((PUCHAR)ntoskrnlBase + patternOffset + 0x20);
        
        return (*PiDDBLock != NULL && *PiDDBCacheTable != NULL);
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return FALSE;
    }
}

/* Main PiDDB cleaning function */
BOOLEAN CleanPiDDBCacheTable()
{
    PERESOURCE PiDDBLock = NULL;
    PRTL_AVL_TABLE PiDDBCacheTable = NULL;
    
    if (!LocatePiDDBStructures(&PiDDBLock, &PiDDBCacheTable)) {
        DbgPrint("[!] Failed to locate PiDDB structures\\n");
        return FALSE;
    }
    
    __try {
        // Create entry to remove (IntelGraphicsDriver for ABI)
        PI_DDB_CACHE_ENTRY lookupEntry;
        UNICODE_STRING driverName = RTL_CONSTANT_STRING(L"IntelGraphicsDriver.sys");
        lookupEntry.DriverName = driverName;
        lookupEntry.TimeDateStamp = 0x42494E54; // "BIN" timestamp for ABI
        lookupEntry.LoadStatus = STATUS_SUCCESS;
        RtlZeroMemory(lookupEntry._pad, sizeof(lookupEntry._pad));
        
        ExAcquireResourceExclusiveLite(PiDDBLock, TRUE);
        
        // Search and remove entry
        PPI_DDB_CACHE_ENTRY foundEntry = (PPI_DDB_CACHE_ENTRY)RtlLookupElementGenericTableAvl(
            PiDDBCacheTable, &lookupEntry);
        
        if (foundEntry) {
            RemoveEntryList(&foundEntry->List);
            RtlDeleteElementGenericTableAvl(PiDDBCacheTable, foundEntry);
            DbgPrint("[>] PiDDB Cache cleaned successfully\\n");
        } else {
            DbgPrint("[!] Driver entry not found in PiDDB\\n");
        }
        
        ExReleaseResourceLite(PiDDBLock);
        return (foundEntry != NULL);
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        if (PiDDBLock) ExReleaseResourceLite(PiDDBLock);
        DbgPrint("[!] Exception in PiDDB cleaning\\n");
        return FALSE;
    }
}
