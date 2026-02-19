#pragma once

#include "definitions.h"

/* ── ACE Trace Erasure Utility for Arena Breakout Infinite ───────────────── */

/*
 * Comprehensive driver trace removal for ACE (Anti-Cheat Expert) bypass
 * Implements PiDDB cleaning, MmUnloadedDrivers clearing, and kernel struct nullification
 * Uses pattern scanning for Windows 10/11 compatibility
 */

/* Windows 10/11 PiDDB Lock Pattern (ntoskrnl.exe) */
static const UCHAR PiDDBLockPattern_Win10[] = {
    0x48, 0x8D, 0x0D, 0x00, 0x00, 0x00, 0x00, // lea rcx, [PiDDBLock]
    0x48, 0x89, 0x0D, 0x00, 0x00, 0x00, 0x00, // mov [PiDDBLock], rcx
    0x4C, 0x8B, 0x0D, 0x00, 0x00, 0x00, 0x00, // mov r9, [PiDDBCacheTable]
    0x41, 0x54, 0x48, 0x8B, 0x4C, 0x24, 0x20  // push r12; mov rax, [rsp+20h]
};

/* Windows 11 PiDDB Lock Pattern (updated) */
static const UCHAR PiDDBLockPattern_Win11[] = {
    0x48, 0x8D, 0x0D, 0x00, 0x00, 0x00, 0x00, // lea rcx, [PiDDBLock]
    0x48, 0x89, 0x0D, 0x00, 0x00, 0x00, 0x00, // mov [PiDDBLock], rcx
    0x4C, 0x8B, 0x15, 0x00, 0x00, 0x00, 0x00, // mov r10, [PiDDBCacheTable]
    0x41, 0x54, 0x48, 0x8B, 0x4C, 0x24, 0x20  // push r12; mov rax, [rsp+20h]
};

/* PiDDB Cache Table Pattern */
static const UCHAR PiDDBCacheTablePattern[] = {
    0x48, 0x8B, 0x1D, 0x00, 0x00, 0x00, 0x00, // mov rbx, [PiDDBCacheTable]
    0x48, 0x85, 0xDB,                               // test rbx, rbx
    0x74, 0x0A,                                   // jz short
    0x48, 0x83, 0xC3, 0x28,                         // add rbx, 28h
    0x48, 0x89, 0x1D, 0x00, 0x00, 0x00, 0x00  // mov [PiDDBCacheTable], rbx
};

/* MmUnloadedDrivers Pattern */
static const UCHAR MmUnloadedDriversPattern[] = {
    0x48, 0x8B, 0x0D, 0x00, 0x00, 0x00, 0x00, // mov rcx, [MmUnloadedDrivers]
    0x48, 0x8B, 0x15, 0x00, 0x00, 0x00, 0x00, // mov rdx, [MmLastUnloadedDriverIndex]
    0x4C, 0x8B, 0x0D, 0x00, 0x00, 0x00, 0x00, // mov r9, [MmUnloadedDrivers+8]
    0x44, 0x8B, 0x4C, 0x24, 0x20             // mov r8d, [rsp+20h]
};

/* MmLastUnloadedDriverIndex Pattern */
static const UCHAR MmLastUnloadedDriverIndexPattern[] = {
    0x48, 0x8B, 0x1D, 0x00, 0x00, 0x00, 0x00, // mov rbx, [MmLastUnloadedDriverIndex]
    0x48, 0x83, 0xC3, 0x01,                         // add rbx, 1h
    0x48, 0x89, 0x1D, 0x00, 0x00, 0x00, 0x00  // mov [MmLastUnloadedDriverIndex], rbx
};

/* Driver entry structure for PiDDB */
typedef struct _PI_DDB_CACHE_ENTRY {
    LIST_ENTRY List;
    UNICODE_STRING DriverName;
    ULONG TimeDateStamp;
    NTSTATUS LoadStatus;
    CHAR _pad[16];
} PI_DDB_CACHE_ENTRY, *PPI_DDB_CACHE_ENTRY;

/* MmUnloadedDrivers structure */
typedef struct _MM_UNLOADED_DRIVER {
    UNICODE_STRING Name;
    PVOID DriverStart;
    PVOID DriverSize;
    PVOID DriverSection;
    ULONG TimeStamp;
} MM_UNLOADED_DRIVER, *PMM_UNLOADED_DRIVER;

/* LDR_DATA_TABLE_ENTRY structure */
typedef struct _LDR_DATA_TABLE_ENTRY {
    LIST_ENTRY InLoadOrderLinks;
    PVOID ExceptionTable;
    PVOID ExceptionTableSize;
    PVOID GpValue;
    PVOID NonPagedDebugInfo;
    PVOID DllBase;
    PVOID EntryPoint;
    PVOID SizeOfImage;
    UNICODE_STRING FullDllName;
    UNICODE_STRING BaseDllName;
    PVOID Reserved;
} LDR_DATA_TABLE_ENTRY, *PLDR_DATA_TABLE_ENTRY;

/* Enhanced pattern scanning with wildcard support */
static BOOLEAN ScanPatternEx(PUCHAR base, SIZE_T size, PUCHAR pattern, SIZE_T patternSize, PULONG_PTR offset)
{
    if (!base || !pattern || !offset) return FALSE;
    
    __try {
        for (SIZE_T i = 0; i < size - patternSize; i++) {
            BOOLEAN found = TRUE;
            for (SIZE_T j = 0; j < patternSize; j++) {
                // 0xCC acts as wildcard, 0x?? acts as 2-byte wildcard
                if (pattern[j] != 0xCC && pattern[j] != 0x?? && base[i + j] != pattern[j]) {
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

/* Get ntoskrnl base with version detection */
static PVOID GetNtoskrnlBase()
{
    ULONG bytesNeeded = 0;
    
    __try {
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
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return NULL;
    }
}

/* Locate PiDDB structures with version-specific patterns */
static BOOLEAN LocatePiDDBStructures(PERESOURCE* PiDDBLock, PRTL_AVL_TABLE* PiDDBCacheTable)
{
    PVOID ntoskrnlBase = GetNtoskrnlBase();
    if (!ntoskrnlBase) return FALSE;
    
    // Get ntoskrnl size (approximate)
    ULONG ntoskrnlSize = 0x2000000; // 32MB, adjust as needed
    
    ULONG_PTR lockOffset = 0;
    ULONG_PTR cacheOffset = 0;
    
    __try {
        // Try Windows 11 pattern first
        if (ScanPatternEx((PUCHAR)ntoskrnlBase, ntoskrnlSize,
                (PUCHAR)PiDDBLockPattern_Win11, sizeof(PiDDBLockPattern_Win11), &lockOffset)) {
            
            // Fallback to Windows 10 pattern
            if (!ScanPatternEx((PUCHAR)ntoskrnlBase, ntoskrnlSize,
                    (PUCHAR)PiDDBLockPattern_Win10, sizeof(PiDDBLockPattern_Win10), &lockOffset)) {
                return FALSE;
            }
        }
        
        // Scan for PiDDBCacheTable
        if (!ScanPatternEx((PUCHAR)ntoskrnlBase, ntoskrnlSize,
                (PUCHAR)PiDDBCacheTablePattern, sizeof(PiDDBCacheTablePattern), &cacheOffset)) {
            return FALSE;
        }
        
        // Extract relative offsets
        LONG lockRelOffset = *(PLONG)((PUCHAR)ntoskrnlBase + lockOffset + 3);
        LONG cacheRelOffset = *(PLONG)((PUCHAR)ntoskrnlBase + cacheOffset + 3);
        
        // Calculate actual addresses
        *PiDDBLock = *(PERESOURCE*)((PUCHAR)ntoskrnlBase + lockOffset + 7 + lockRelOffset);
        *PiDDBCacheTable = *(PRTL_AVL_TABLE*)((PUCHAR)ntoskrnlBase + cacheOffset + 7 + cacheRelOffset);
        
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
    
    // Locate PiDDB structures
    if (!LocatePiDDBStructures(&PiDDBLock, &PiDDBCacheTable)) {
        return FALSE;
    }
    
    __try {
        // Create entry to remove (IntelGraphicsDriver.sys for ABI disguise)
        PI_DDB_CACHE_ENTRY lookupEntry;
        UNICODE_STRING driverName = RTL_CONSTANT_STRING(L"IntelGraphicsDriver.sys");
        lookupEntry.DriverName = driverName;
        lookupEntry.TimeDateStamp = 0x42494E54; // "BIN" timestamp for ABI
        lookupEntry.LoadStatus = STATUS_SUCCESS;
        RtlZeroMemory(lookupEntry._pad, sizeof(lookupEntry._pad));
        
        ExAcquireResourceExclusiveLite(PiDDBLock, TRUE);
        
        // Search and remove entry by name or timestamp
        PPI_DDB_CACHE_ENTRY foundEntry = (PPI_DDB_CACHE_ENTRY)RtlLookupElementGenericTableAvl(
            PiDDBCacheTable, &lookupEntry);
        
        if (foundEntry) {
            // Remove from AVL table and list
            RemoveEntryList(&foundEntry->List);
            RtlDeleteElementGenericTableAvl(PiDDBCacheTable, foundEntry);
        }
        
        ExReleaseResourceLite(PiDDBLock);
        return (foundEntry != NULL);
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        if (PiDDBLock) ExReleaseResourceLite(PiDDBLock);
        return FALSE;
    }
}

/* Locate MmUnloadedDrivers structures */
static BOOLEAN LocateMmUnloadedDrivers(PMM_UNLOADED_DRIVER** UnloadedDrivers, 
                                     PULONG* LastUnloadedDriverIndex)
{
    PVOID ntoskrnlBase = GetNtoskrnlBase();
    if (!ntoskrnlBase) return FALSE;
    
    ULONG ntoskrnlSize = 0x2000000;
    
    ULONG_PTR unloadedOffset = 0;
    ULONG_PTR lastIndexOffset = 0;
    
    __try {
        // Scan for MmUnloadedDrivers
        if (!ScanPatternEx((PUCHAR)ntoskrnlBase, ntoskrnlSize,
                (PUCHAR)MmUnloadedDriversPattern, sizeof(MmUnloadedDriversPattern), &unloadedOffset)) {
            return FALSE;
        }
        
        // Scan for MmLastUnloadedDriverIndex
        if (!ScanPatternEx((PUCHAR)ntoskrnlBase, ntoskrnlSize,
                (PUCHAR)MmLastUnloadedDriverIndexPattern, sizeof(MmLastUnloadedDriverIndexPattern), &lastIndexOffset)) {
            return FALSE;
        }
        
        // Extract relative offsets
        LONG unloadedRelOffset = *(PLONG)((PUCHAR)ntoskrnlBase + unloadedOffset + 3);
        LONG lastIndexRelOffset = *(PLONG)((PUCHAR)ntoskrnlBase + lastIndexOffset + 3);
        
        // Calculate actual addresses
        *UnloadedDrivers = *(PMM_UNLOADED_DRIVER*)((PUCHAR)ntoskrnlBase + unloadedOffset + 7 + unloadedRelOffset);
        *LastUnloadedDriverIndex = *(PULONG*)((PUCHAR)ntoskrnlBase + lastIndexOffset + 7 + lastIndexRelOffset);
        
        return (*UnloadedDrivers != NULL && *LastUnloadedDriverIndex != NULL);
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return FALSE;
    }
}

/* Clear MmUnloadedDrivers list */
BOOLEAN ClearMmUnloadedDrivers()
{
    PMM_UNLOADED_DRIVER UnloadedDrivers = NULL;
    ULONG LastUnloadedDriverIndex = 0;
    
    if (!LocateMmUnloadedDrivers(&UnloadedDrivers, &LastUnloadedDriverIndex)) {
        return FALSE;
    }
    
    __try {
        BOOLEAN cleaned = FALSE;
        
        // Iterate through unloaded drivers array
        for (ULONG i = 0; i < 50; i++) {  // Max 50 entries
            if (UnloadedDrivers[i].Name.Buffer == NULL ||
                UnloadedDrivers[i].Name.Length == 0) {
                continue;
            }
            
            // Check if it's our IntelGraphicsDriver
            if (wcsstr(UnloadedDrivers[i].Name.Buffer, L"IntelGraphicsDriver") ||
                wcsstr(UnloadedDrivers[i].Name.Buffer, L"IntelGraphics") ||
                wcsstr(UnloadedDrivers[i].Name.Buffer, L"GraphicsDriver")) {
                
                // Zero out the entire entry
                RtlZeroMemory(&UnloadedDrivers[i], sizeof(MM_UNLOADED_DRIVER));
                
                // Update last index to point to a clean slot
                *LastUnloadedDriverIndex = i;
                
                cleaned = TRUE;
            }
        }
        
        return cleaned;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return FALSE;
    }
}

/* Clear DriverSection in DRIVER_OBJECT */
VOID ClearDriverSection(PDRIVER_OBJECT DriverObject)
{
    if (!DriverObject) return;
    
    __try {
        // Check if DriverSection exists
        if (DriverObject->DriverSection) {
            // Get LDR_DATA_TABLE_ENTRY
            PLDR_DATA_TABLE_ENTRY ldrEntry = (PLDR_DATA_TABLE_ENTRY)DriverObject->DriverSection;
            
            if (ldrEntry) {
                // Nullify critical fields
                ldrEntry->DllBase = NULL;
                ldrEntry->EntryPoint = NULL;
                ldrEntry->SizeOfImage = 0;
                
                // Clear names
                RtlZeroMemory(ldrEntry->FullDllName.Buffer, ldrEntry->FullDllName.Length);
                RtlZeroMemory(ldrEntry->BaseDllName.Buffer, ldrEntry->BaseDllName.Length);
                ldrEntry->FullDllName.Length = 0;
                ldrEntry->BaseDllName.Length = 0;
            }
            
            // Nullify DriverSection
            DriverObject->DriverSection = NULL;
        }
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Driver object might be corrupted, but we continue
    }
}

/* Spoof driver information in LDR entry */
VOID SpoofDriverInfo(PDRIVER_OBJECT DriverObject)
{
    if (!DriverObject) return;
    
    __try {
        PLDR_DATA_TABLE_ENTRY ldrEntry = (PLDR_DATA_TABLE_ENTRY)DriverObject->DriverSection;
        if (!ldrEntry) return;
        
        // Spoof as legitimate Intel driver
        UNICODE_STRING spoofName = RTL_CONSTANT_STRING(L"igdkmd64.sys");
        UNICODE_STRING spoofBase = RTL_CONSTANT_STRING(L"igdkmd64.sys");
        
        // Copy spoofed names
        RtlZeroMemory(ldrEntry->FullDllName.Buffer, ldrEntry->FullDllName.MaximumLength);
        RtlZeroMemory(ldrEntry->BaseDllName.Buffer, ldrEntry->BaseDllName.MaximumLength);
        
        ldrEntry->FullDllName = spoofName;
        ldrEntry->BaseDllName = spoofBase;
        
        // Spoof size and timestamp
        ldrEntry->SizeOfImage = (PVOID)0x150000; // 1.25MB (legitimate size)
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Continue if LDR is protected
    }
}

/* Comprehensive trace cleaning function */
BOOLEAN CleanAllDriverTraces(PDRIVER_OBJECT DriverObject)
{
    BOOLEAN success = TRUE;
    
    // 1. Clean PiDDB cache table
    if (!CleanPiDDBCacheTable()) {
        success = FALSE;
    }
    
    // 2. Clear MmUnloadedDrivers
    if (!ClearMmUnloadedDrivers()) {
        success = FALSE;
    }
    
    // 3. Clear DriverSection
    ClearDriverSection(DriverObject);
    
    // 4. Spoof driver information
    SpoofDriverInfo(DriverObject);
    
    return success;
}

/* Validate cleaning was successful */
BOOLEAN ValidateTraceCleaning()
{
    // Check if our driver is still visible in common locations
    // This would be called after cleaning to verify success
    
    PVOID ntoskrnlBase = GetNtoskrnlBase();
    if (!ntoskrnlBase) return FALSE;
    
    // Try to locate our driver in PiDDB (should fail if cleaning worked)
    PERESOURCE PiDDBLock = NULL;
    PRTL_AVL_TABLE PiDDBCacheTable = NULL;
    
    if (LocatePiDDBStructures(&PiDDBLock, &PiDDBCacheTable)) {
        PI_DDB_CACHE_ENTRY lookupEntry;
        UNICODE_STRING driverName = RTL_CONSTANT_STRING(L"IntelGraphicsDriver.sys");
        lookupEntry.DriverName = driverName;
        lookupEntry.TimeDateStamp = 0x42494E54;
        
        ExAcquireResourceExclusiveLite(PiDDBLock, TRUE);
        
        PPI_DDB_CACHE_ENTRY foundEntry = (PPI_DDB_CACHE_ENTRY)RtlLookupElementGenericTableAvl(
            PiDDBCacheTable, &lookupEntry);
        
        ExReleaseResourceLite(PiDDBLock);
        
        // If found, cleaning failed
        return (foundEntry == NULL);
    }
    
    return TRUE;
}
