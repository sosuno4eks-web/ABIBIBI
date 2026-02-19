#pragma once

#include "definitions.h"

/* ── ACE Bypass - MmUnloadedDrivers Cleaning ───────────────────── */

/*
 * MmUnloadedDrivers cleaning for Arena Breakout Infinite
 * Prevents ACE from detecting traces of manual driver mapping
 */

typedef struct _MM_UNLOADED_DRIVER {
    UNICODE_STRING Name;
    PVOID DriverStart;
    PVOID DriverSize;
    PVOID DriverSection;
    ULONG TimeStamp;
} MM_UNLOADED_DRIVER, *PMM_UNLOADED_DRIVER;

/* Pattern to find MmUnloadedDrivers array */
static const UCHAR MmUnloadedDriversPattern[] = {
    0x48, 0x8B, 0x0D, 0x00, 0x00, 0x00, 0x00, // mov rcx, [MmUnloadedDrivers]
    0x48, 0x8B, 0x15, 0x00, 0x00, 0x00, 0x00, // mov rdx, [MmLastUnloadedDriverIndex]
    0x4C, 0x8B, 0x0D, 0x00, 0x00, 0x00, 0x00, // mov r9, [MmUnloadedDrivers+8]
    0x44, 0x8B, 0x4C, 0x24, 0x20             // mov r8d, [rsp+20h]
};

/* Pattern to find MmLastUnloadedDriverIndex */
static const UCHAR MmLastUnloadedDriverIndexPattern[] = {
    0x48, 0x8B, 0x1D, 0x00, 0x00, 0x00, 0x00, // mov rbx, [MmLastUnloadedDriverIndex]
    0x48, 0x83, 0xC3, 0x01,                         // add rbx, 1h
    0x48, 0x89, 0x1D, 0x00, 0x00, 0x00, 0x00  // mov [MmLastUnloadedDriverIndex], rbx
};

/* Pattern scanning function */
static BOOLEAN ScanPattern(PUCHAR base, SIZE_T size, PUCHAR pattern, SIZE_T patternSize, PULONG_PTR offset)
{
    if (!base || !pattern || !offset) return FALSE;
    
    __try {
        for (SIZE_T i = 0; i < size - patternSize; i++) {
            BOOLEAN found = TRUE;
            for (SIZE_T j = 0; j < patternSize; j++) {
                if (base[i + j] != pattern[j]) {
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

/* Get ntoskrnl base */
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

/* Locate MmUnloadedDrivers structures */
static BOOLEAN LocateMmUnloadedDrivers(PMM_UNLOADED_DRIVER** UnloadedDrivers, 
                                     PULONG* LastUnloadedDriverIndex)
{
    PVOID ntoskrnlBase = GetNtoskrnlBase();
    if (!ntoskrnlBase) return FALSE;
    
    ULONG ntoskrnlSize = 0x2000000; // 32MB
    
    ULONG_PTR unloadedOffset = 0;
    ULONG_PTR lastIndexOffset = 0;
    
    __try {
        // Scan for MmUnloadedDrivers
        if (!ScanPattern((PUCHAR)ntoskrnlBase, ntoskrnlSize,
                (PUCHAR)MmUnloadedDriversPattern, sizeof(MmUnloadedDriversPattern), &unloadedOffset)) {
            return FALSE;
        }
        
        // Scan for MmLastUnloadedDriverIndex
        if (!ScanPattern((PUCHAR)ntoskrnlBase, ntoskrnlSize,
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
        DbgPrint("[!] Failed to locate MmUnloadedDrivers\\n");
        return FALSE;
    }
    
    __try {
        BOOLEAN cleaned = FALSE;
        
        // Iterate through unloaded drivers array (max 50 entries)
        for (ULONG i = 0; i < 50; i++) {
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
                DbgPrint("[>] Removed IntelGraphicsDriver from MmUnloadedDrivers\\n");
            }
        }
        
        return cleaned;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        DbgPrint("[!] Exception in MmUnloadedDrivers cleaning\\n");
        return FALSE;
    }
}
