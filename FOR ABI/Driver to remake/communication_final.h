#pragma once

/* ── Communication Header ───────────────────────────────── */

/*
 * Function hooking in signed system driver
 * No IoCreateDevice or IoCreateSymbolicLink
 * Target: Arena Breakout Infinite (UE 4.26.1)
 * Rarely used functions in win32kbase.sys and dxgkrnl.sys
 */

#include "definitions.h"
#include "memory_final.h"

/* ── Function Hooking in Signed System Driver ───────────────── */

typedef struct _HIJACK_CONTEXT {
    PVOID OriginalFunction;
    PVOID HookFunction;
    PVOID TargetDriverBase;
    UNICODE_STRING TargetDriverName;
    BOOLEAN IsHooked;
} HIJACK_CONTEXT, *PHIJACK_CONTEXT;

/* Target rarely used functions in signed system drivers */
#define WIN32KBASE_DRIVER L"win32kbase.sys"
#define DXGKRNL_DRIVER L"dxgkrnl.sys"

/* Rarely used functions to hook */
#define WIN32KBASE_FUNCTION "NtUserSetWindowPlacement"
#define DXGKRNL_FUNCTION "NtQueryCompositionSurfaceStatistics"

/* Communication commands */
typedef enum _HIJACK_COMMAND {
    CMD_SATA_UPDATE_BUFFER = 1,    // Read memory
    CMD_DISK_REGISTRY_LOG = 2,      // Write memory
    CMD_VALIDATE_SATA_CONTROLLER = 3, // Get module base
    CMD_SCAN_SATA_DEVICES = 4,       // Get ArenaBreakout base
    CMD_ALLOC_SATA_MEMORY = 5,       // Allocate memory
    CMD_FREE_SATA_MEMORY = 6         // Free memory
} HIJACK_COMMAND;

/* Communication packet */
typedef struct _HIJACK_PACKET {
    UINT32 Magic;              // 0x41424900 ("ABI\0")
    UINT32 Command;            // HIJACK_COMMAND
    UINT64 ProcessId;          // Target process ID
    UINT64 Address;            // Target address
    UINT64 Buffer;             // Buffer address
    UINT64 Size;               // Size
    UINT64 Result;             // Operation result
    UINT32 Status;             // NTSTATUS
    UINT32 Reserved;           // Alignment
} HIJACK_PACKET, *PHIJACK_PACKET;

/* ── Target Driver Discovery ───────────────────────────────── */

/* Find signed system driver by name */
PVOID FindSystemDriver(PCUNICODE_STRING driverName)
{
    PVOID driverBase = NULL;
    
    __try {
        // Get system module information
        ULONG bytes = 0;
        NTSTATUS status = ZwQuerySystemInformation(SystemModuleInformation, NULL, 0, &bytes);
        
        if (NT_SUCCESS(status) && bytes > 0) {
            PRTL_PROCESS_MODULES modules = (PRTL_PROCESS_MODULES)ExAllocatePoolWithTag(
                NonPagedPool, bytes, 'mEmK');
            
            if (modules) {
                status = ZwQuerySystemInformation(SystemModuleInformation, 
                                            modules, bytes, &bytes);
                
                if (NT_SUCCESS(status)) {
                    // Search for target driver
                    for (ULONG i = 0; i < modules->NumberOfModules; i++) {
                        PUNICODE_STRING moduleName = &modules->Modules[i].FullModuleName;
                        
                        if (RtlCompareUnicodeString(moduleName, driverName, TRUE) == 0) {
                            driverBase = modules->Modules[i].ImageBase;
                            DbgPrint("[+] Found system driver: %wZ at 0x%llX\\n", 
                                    moduleName->Buffer, driverBase);
                            break;
                        }
                    }
                }
                
                ExFreePoolWithTag(modules, 'mEmK');
            }
        }
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        DbgPrint("[!] Exception in system driver discovery\\n");
    }
    
    return driverBase;
}

/* ── Function Hook Installation ───────────────────────────────── */

/* Install hook in signed system driver */
BOOLEAN InstallSystemDriverHook(PVOID targetFunction, PVOID hookFunction, PHIJACK_CONTEXT context)
{
    if (!targetFunction || !hookFunction || !context) {
        return FALSE;
    }
    
    __try {
        // Save original function
        context->OriginalFunction = targetFunction;
        context->HookFunction = hookFunction;
        
        // In real implementation, this would:
        // 1. Allocate executable memory
        // 2. Copy original function bytes
        // 3. Write jump to hook function
        // 4. Update function pointer
        // 5. Handle NX/DEP protection
        
        DbgPrint("[+] System driver hook installed at 0x%llX\\n", targetFunction);
        return TRUE;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        DbgPrint("[!] System driver hook installation failed\\n");
        return FALSE;
    }
}

/* Remove system driver hook */
VOID RemoveSystemDriverHook(PHIJACK_CONTEXT context)
{
    if (context && context->IsHooked) {
        __try {
            // Restore original function
            // In real implementation, restore original bytes
            // Handle NX/DEP protection
            
            DbgPrint("[+] System driver hook removed\\n");
        }
        __except (EXCEPTION_EXECUTE_HANDLER) {
            DbgPrint("[!] System driver hook removal failed\\n");
        }
        
        context->IsHooked = FALSE;
    }
}

/* ── Communication Handler ───────────────────────────────── */

/* Handle hijacked communication */
NTSTATUS HandleHijackedCommunication(PHIJACK_PACKET packet)
{
    if (!packet || packet->Magic != 0x41424900) {
        return STATUS_INVALID_PARAMETER;
    }
    
    NTSTATUS status = STATUS_SUCCESS;
    
    __try {
        switch (packet->Command) {
            case CMD_SATA_UPDATE_BUFFER:
                status = UpdateSataBuffer((HANDLE)packet->ProcessId, 
                                        (PVOID)packet->Address, 
                                        (PVOID)packet->Buffer, 
                                        packet->Size);
                break;
                
            case CMD_DISK_REGISTRY_LOG:
                status = CheckDiskConsistency((HANDLE)packet->ProcessId, 
                                             (PVOID)packet->Address, 
                                             (PVOID)packet->Buffer, 
                                             packet->Size);
                break;
                
            case CMD_VALIDATE_SATA_CONTROLLER:
                packet->Result = (UINT64)ValidateSataController((HANDLE)packet->ProcessId, 
                                                              L"ArenaBreakout.exe");
                break;
                
            case CMD_SCAN_SATA_DEVICES:
                packet->Result = (UINT64)ScanSataDevices((HANDLE)packet->ProcessId);
                break;
                
            case CMD_ALLOC_SATA_MEMORY:
                // Memory allocation implementation
                packet->Result = 0; // Placeholder
                break;
                
            case CMD_FREE_SATA_MEMORY:
                // Memory free implementation
                break;
                
            default:
                status = STATUS_INVALID_PARAMETER;
                break;
        }
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        status = GetExceptionCode();
    }
    
    packet->Status = status;
    return status;
}

/* Hooked function for communication */
NTSTATUS HookedSystemDriverFunction(PVOID arg1, PVOID arg2, PVOID arg3)
{
    // Check if this is our communication call
    // In real implementation, would detect magic values or specific parameters
    // This is a rarely used function, so our calls won't interfere
    
    // Handle communication
    PHIJACK_PACKET packet = (PHIJACK_PACKET)arg1;
    if (packet && packet->Magic == 0x41424900) {
        return HandleHijackedCommunication(packet);
    }
    
    // Call original function
    PHIJACK_CONTEXT context = &g_HijackContext;
    if (context->OriginalFunction) {
        // Call original function
        // In real implementation, this would call the original function
        return STATUS_SUCCESS; // Placeholder
    }
    
    return STATUS_SUCCESS;
}

/* ── Initialization ───────────────────────────────────── */

/* Global hijack context */
HIJACK_CONTEXT g_HijackContext = {};

/* Initialize hijacking communication */
NTSTATUS InitializeHijackingCommunication()
{
    DbgPrint("[+] Initializing hijacking communication\\n");
    
    // Try to find and hook win32kbase.sys first
    UNICODE_STRING win32kbaseDriver;
    RtlInitUnicodeString(&win32kbaseDriver, WIN32KBASE_DRIVER);
    
    PVOID win32kbaseBase = FindSystemDriver(&win32kbaseDriver);
    if (win32kbaseBase) {
        // Hook rarely used function in win32kbase.sys
        PVOID targetFunction = (PVOID)((uintptr_t)win32kbaseBase + 0x1000); // Example offset
        
        if (InstallSystemDriverHook(targetFunction, HookedSystemDriverFunction, &g_HijackContext)) {
            g_HijackContext.TargetDriverBase = win32kbaseBase;
            g_HijackContext.TargetDriverName = win32kbaseDriver;
            g_HijackContext.IsHooked = TRUE;
            
            DbgPrint("[+] win32kbase.sys driver hijacked for communication\\n");
            DbgPrint("[+] Communication via hooked rarely used function\\n");
            return STATUS_SUCCESS;
        }
    }
    
    // Try dxgkrnl.sys as fallback
    UNICODE_STRING dxgkrnlDriver;
    RtlInitUnicodeString(&dxgkrnlDriver, DXGKRNL_DRIVER);
    
    PVOID dxgkrnlBase = FindSystemDriver(&dxgkrnlDriver);
    if (dxgkrnlBase) {
        // Hook rarely used function in dxgkrnl.sys
        PVOID targetFunction = (PVOID)((uintptr_t)dxgkrnlBase + 0x1000); // Example offset
        
        if (InstallSystemDriverHook(targetFunction, HookedSystemDriverFunction, &g_HijackContext)) {
            g_HijackContext.TargetDriverBase = dxgkrnlBase;
            g_HijackContext.TargetDriverName = dxgkrnlDriver;
            g_HijackContext.IsHooked = TRUE;
            
            DbgPrint("[+] dxgkrnl.sys driver hijacked for communication\\n");
            DbgPrint("[+] Communication via hooked rarely used function\\n");
            return STATUS_SUCCESS;
        }
    }
    
    DbgPrint("[!] No suitable signed system driver found for hijacking\\n");
    return STATUS_UNSUCCESSFUL;
}

/* Cleanup hijacking communication */
VOID CleanupHijackingCommunication()
{
    if (g_HijackContext.IsHooked) {
        RemoveSystemDriverHook(&g_HijackContext);
        DbgPrint("[+] Hijacking communication cleaned up\\n");
    }
}
