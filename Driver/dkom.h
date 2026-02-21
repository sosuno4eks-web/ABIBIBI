/*
 * dkom.h - Direct Kernel Object Manipulation
 * 
 * CRITICAL: Hides our client process from ACE detection
 * 
 * TECHNIQUES:
 * - Unlink from ActiveProcessLinks (EPROCESS list)
 * - Hide from NtQuerySystemInformation
 * - Remove from PspCidTable
 * - Zero out process name
 * 
 * Target: Windows 10 22H2 (Build 19045)
 */

#pragma once

#include <ntifs.h>
#include <ntddk.h>

#ifdef __cplusplus
extern "C" {
#endif

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * EPROCESS OFFSETS (Windows 10 Build 19045)
 * ═══════════════════════════════════════════════════════════════════════════
 */

#define EPROCESS_ACTIVEPROCESSLINKS_OFFSET  0x448  // ActiveProcessLinks
#define EPROCESS_IMAGEFILENAME_OFFSET       0x5A8  // ImageFileName
#define EPROCESS_UNIQUEPROCESSID_OFFSET     0x440  // UniqueProcessId

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * PROCESS HIDING (DKOM)
 * ═══════════════════════════════════════════════════════════════════════════
 */

// Unlink process from ActiveProcessLinks
static FORCEINLINE NTSTATUS HideProcessFromList(PEPROCESS Process) {
    __try {
        // Get ActiveProcessLinks
        PLIST_ENTRY activeLinks = (PLIST_ENTRY)((ULONG_PTR)Process + EPROCESS_ACTIVEPROCESSLINKS_OFFSET);
        
        // Unlink from list (classic DKOM)
        PLIST_ENTRY flink = activeLinks->Flink;
        PLIST_ENTRY blink = activeLinks->Blink;
        
        // Remove from list
        flink->Blink = blink;
        blink->Flink = flink;
        
        // Point to self (avoid NULL pointers)
        activeLinks->Flink = activeLinks;
        activeLinks->Blink = activeLinks;
        
        return STATUS_SUCCESS;
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

// Zero out process name (hide from string searches)
static FORCEINLINE NTSTATUS HideProcessName(PEPROCESS Process) {
    __try {
        // Get ImageFileName pointer
        CHAR* imageName = (CHAR*)((ULONG_PTR)Process + EPROCESS_IMAGEFILENAME_OFFSET);
        
        // Zero out name (15 bytes max)
        RtlZeroMemory(imageName, 15);
        
        // Set fake name
        RtlCopyMemory(imageName, "System\0", 7);
        
        return STATUS_SUCCESS;
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

// Full process ghosting
static FORCEINLINE NTSTATUS GhostProcess(UINT32 ProcessId) {
    __try {
        PEPROCESS targetProcess = NULL;
        NTSTATUS status = PsLookupProcessByProcessId((HANDLE)(ULONG_PTR)ProcessId, &targetProcess);
        
        if (!NT_SUCCESS(status)) {
            return status;
        }
        
        // Hide from ActiveProcessLinks
        status = HideProcessFromList(targetProcess);
        if (!NT_SUCCESS(status)) {
            ObDereferenceObject(targetProcess);
            return status;
        }
        
        // Hide process name
        status = HideProcessName(targetProcess);
        
        ObDereferenceObject(targetProcess);
        
        return status;
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * NTQUERYSYSTEMINFORMATION HOOK
 * ═══════════════════════════════════════════════════════════════════════════
 */

// Use the SYSTEM_INFORMATION_CLASS from definitions.h (already defined)
// No need to redefine it here

// Original NtQuerySystemInformation
typedef NTSTATUS (*PFN_NTQUERYSYSTEMINFORMATION)(
    SYSTEM_INFORMATION_CLASS SystemInformationClass,
    PVOID SystemInformation,
    ULONG SystemInformationLength,
    PULONG ReturnLength
);

// Global: Original function pointer
static PFN_NTQUERYSYSTEMINFORMATION g_OriginalNtQuerySystemInformation = NULL;

// Global: Our client process ID to hide
static UINT32 g_HiddenProcessId = 0;

// System process information structure
typedef struct _SYSTEM_PROCESS_INFORMATION {
    ULONG NextEntryOffset;
    ULONG NumberOfThreads;
    LARGE_INTEGER Reserved[3];
    LARGE_INTEGER CreateTime;
    LARGE_INTEGER UserTime;
    LARGE_INTEGER KernelTime;
    UNICODE_STRING ImageName;
    LONG BasePriority;
    HANDLE UniqueProcessId;
    HANDLE InheritedFromUniqueProcessId;
    ULONG HandleCount;
    ULONG SessionId;
    ULONG_PTR PageDirectoryBase;
    SIZE_T PeakVirtualSize;
    SIZE_T VirtualSize;
    ULONG PageFaultCount;
    SIZE_T PeakWorkingSetSize;
    SIZE_T WorkingSetSize;
    SIZE_T QuotaPeakPagedPoolUsage;
    SIZE_T QuotaPagedPoolUsage;
    SIZE_T QuotaPeakNonPagedPoolUsage;
    SIZE_T QuotaNonPagedPoolUsage;
    SIZE_T PagefileUsage;
    SIZE_T PeakPagefileUsage;
    SIZE_T PrivatePageCount;
} SYSTEM_PROCESS_INFORMATION, *PSYSTEM_PROCESS_INFORMATION;

// Hooked NtQuerySystemInformation
static NTSTATUS NTAPI HookedNtQuerySystemInformation(
    SYSTEM_INFORMATION_CLASS SystemInformationClass,
    PVOID SystemInformation,
    ULONG SystemInformationLength,
    PULONG ReturnLength
) {
    __try {
        // Call original function
        NTSTATUS status = g_OriginalNtQuerySystemInformation(
            SystemInformationClass,
            SystemInformation,
            SystemInformationLength,
            ReturnLength
        );
        
        if (!NT_SUCCESS(status)) {
            return status;
        }
        
        // Filter SystemProcessInformation
        if (SystemInformationClass == (SYSTEM_INFORMATION_CLASS)5 && g_HiddenProcessId != 0) {
            PSYSTEM_PROCESS_INFORMATION current = (PSYSTEM_PROCESS_INFORMATION)SystemInformation;
            PSYSTEM_PROCESS_INFORMATION previous = NULL;
            
            while (current != NULL) {
                // Check if this is our hidden process
                if ((UINT32)(ULONG_PTR)current->UniqueProcessId == g_HiddenProcessId) {
                    // Remove from list
                    if (previous != NULL) {
                        if (current->NextEntryOffset == 0) {
                            previous->NextEntryOffset = 0;
                        } else {
                            previous->NextEntryOffset += current->NextEntryOffset;
                        }
                    } else {
                        // First entry - skip to next
                        if (current->NextEntryOffset != 0) {
                            RtlCopyMemory(
                                current,
                                (UCHAR*)current + current->NextEntryOffset,
                                SystemInformationLength - current->NextEntryOffset
                            );
                        }
                    }
                    break;
                }
                
                // Move to next entry
                previous = current;
                
                if (current->NextEntryOffset == 0) {
                    break;
                }
                
                current = (PSYSTEM_PROCESS_INFORMATION)((UCHAR*)current + current->NextEntryOffset);
            }
        }
        
        return status;
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * SSDT HOOKING (for NtQuerySystemInformation)
 * ═══════════════════════════════════════════════════════════════════════════
 */

// SSDT structure
typedef struct _SYSTEM_SERVICE_DESCRIPTOR_TABLE {
    PULONG ServiceTableBase;
    PULONG ServiceCounterTableBase;
    ULONG NumberOfServices;
    PUCHAR ParamTableBase;
} SYSTEM_SERVICE_DESCRIPTOR_TABLE, *PSYSTEM_SERVICE_DESCRIPTOR_TABLE;

// External SSDT (declare but don't define - linker will find it)
__declspec(dllimport) SYSTEM_SERVICE_DESCRIPTOR_TABLE KeServiceDescriptorTable;

// Install NtQuerySystemInformation hook
static FORCEINLINE NTSTATUS InstallNtQuerySystemInformationHook() {
    __try {
        // Get SSDT
        PSYSTEM_SERVICE_DESCRIPTOR_TABLE ssdt = &KeServiceDescriptorTable;
        if (ssdt == NULL) {
            return STATUS_NOT_FOUND;
        }
        
        // NtQuerySystemInformation is at index 0x36 in SSDT
        const ULONG NtQuerySystemInformation_Index = 0x36;
        
        // Save original function
        g_OriginalNtQuerySystemInformation = (PFN_NTQUERYSYSTEMINFORMATION)ssdt->ServiceTableBase[NtQuerySystemInformation_Index];
        
        // Disable write protection
        KIRQL oldIrql = KeRaiseIrqlToDpcLevel();
        UINT64 cr0 = __readcr0();
        __writecr0(cr0 & ~0x10000);  // Clear WP bit
        
        // Hook function (store as pointer, not ULONG)
        InterlockedExchangePointer(
            (PVOID*)&ssdt->ServiceTableBase[NtQuerySystemInformation_Index],
            (PVOID)HookedNtQuerySystemInformation
        );
        
        // Restore write protection
        __writecr0(cr0);
        KeLowerIrql(oldIrql);
        
        return STATUS_SUCCESS;
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

// Remove NtQuerySystemInformation hook
static FORCEINLINE VOID RemoveNtQuerySystemInformationHook() {
    __try {
        if (g_OriginalNtQuerySystemInformation == NULL) {
            return;
        }
        
        // Get SSDT
        PSYSTEM_SERVICE_DESCRIPTOR_TABLE ssdt = &KeServiceDescriptorTable;
        if (ssdt == NULL) {
            return;
        }
        
        const ULONG NtQuerySystemInformation_Index = 0x36;
        
        // Disable write protection
        KIRQL oldIrql = KeRaiseIrqlToDpcLevel();
        UINT64 cr0 = __readcr0();
        __writecr0(cr0 & ~0x10000);
        
        // Restore original function (store as pointer, not ULONG)
        InterlockedExchangePointer(
            (PVOID*)&ssdt->ServiceTableBase[NtQuerySystemInformation_Index],
            (PVOID)g_OriginalNtQuerySystemInformation
        );
        
        // Restore write protection
        __writecr0(cr0);
        KeLowerIrql(oldIrql);
        
        g_OriginalNtQuerySystemInformation = NULL;
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Ignore
    }
}

#ifdef __cplusplus
}
#endif
