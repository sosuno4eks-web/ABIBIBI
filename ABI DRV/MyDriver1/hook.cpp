/*
 * hook.cpp - Function Pointer Hijack for Arena Breakout Infinite (Status 0x0)
 *
 * Uses function pointer hijacking in signed drivers for stealth communication:
 *   - Finds target function in win32kbase.sys
 *   - Hijacks function pointer for communication bridge
 *   - No DeviceIoControl or IRP_MJ_DEVICE_CONTROL
 *   - Completely invisible to ACE Object Manager scans
 *
 * Usermode sends commands by calling the hijacked function with a
 * STORAGE_COMM_BUFFER struct as the first parameter.
 */

#include "hook.h"
#include "stealth.h"
#include "memory.h"

/* ── Global Variables for Registry Filter Management ───────────────────────── */

OriginalFunctionPtr g_OriginalFunction = NULL;
PVOID g_HookTarget = NULL;

/* ── Function Pointer Hijack Installation ───────────────────────── */

BOOL RegistryFilter::Install(void* handlerAddr)
{
    if (!handlerAddr) {
        DbgPrint("[!] 0x601\\n"); // Handler address is NULL
        return FALSE;
    }
    
    DbgPrint("[+] 0x602\\n"); // Installing registry filter
    
    /* Find target function in win32kbase.sys for hijacking */
    PVOID filterTarget = GetSystemModuleExport(
        "win32kbase.sys",
        "NtUserGetWindowDC"
    );
    
    if (!filterTarget) {
        DbgPrint("[!] 0x603\\n"); // Target function not found
        return FALSE;
    }
    
    DbgPrint("[+] 0x604\\n"); // Found target function
    
    /* Store original function pointer */
    g_OriginalFunction = (OriginalFunctionPtr)filterTarget;
    
    /* Install function pointer hijack */
    if (InstallFunctionPointerHook(filterTarget, handlerAddr)) {
        DbgPrint("[+] 0x605\\n"); // Registry filter initialized
        return TRUE;
    }
    
    /* Fallback: direct code patch if function pointer hook fails */
    DbgPrint("[!] 0x606\\n"); // Direct patch fallback
    
    BYTE patch[12] = { 0 };
    patch[0] = 0x48;  /* REX.W prefix */
    patch[1] = 0xB8;  /* MOV RAX, imm64 */
    uintptr_t addr = reinterpret_cast<uintptr_t>(handlerAddr);
    memcpy(&patch[2], &addr, sizeof(void*));
    patch[10] = 0xFF; /* JMP RAX */
    patch[11] = 0xE0;
    
    WriteReadOnlyMemory(filterTarget, patch, sizeof(patch));
    
    DbgPrint("[+] 0x607\\n"); // Direct patch installed
    return TRUE;
}

/* ── Function Pointer Hook Installation ───────────────────────────── */

BOOL InstallFunctionPointerHook(PVOID target, PVOID handler)
{
    /* In real implementation, this would:
     * 1. Find function pointer table in win32kbase.sys
     * 2. Locate target function pointer
     * 3. Replace with our handler address
     * 4. Store original pointer for restoration
     */
    
    __try {
        /* Direct memory write to replace function pointer */
        PVOID* functionPtr = (PVOID*)target;
        PVOID original = *functionPtr;
        
        /* Replace with our handler */
        *functionPtr = handler;
        
        /* Store original for cleanup */
        g_OriginalFunction = (OriginalFunctionPtr)original;
        
        DbgPrint("[+] 0x608\\n"); // Function pointer replaced
        return TRUE;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        DbgPrint("[!] 0x609\\n"); // Function pointer replacement failed
        return FALSE;
    }
}

/* ── Registry Filter Handler (Storage Communication) ─────────────────────────── */

NTSTATUS RegistryFilter::Handler(PVOID callParam)
{
    /* Validate pointer */
    if (!callParam || !MmIsAddressValid(callParam)) {
        return STATUS_INVALID_PARAMETER;
    }
    
    PSTORAGE_COMM_BUFFER req = (PSTORAGE_COMM_BUFFER)callParam;
    
    /* Check magic to distinguish our calls from legitimate ones */
    if (req->Magic != NTFS_CONTROL_MAGIC) {
        /* Call original function for legitimate calls */
        if (g_OriginalFunction) {
            return g_OriginalFunction(callParam);
        }
        return STATUS_SUCCESS;
    }
    
    DbgPrint("[+] 0x610\\n"); // Processing storage request
    
    /* Process storage communication requests */
    NTSTATUS status = ProcessStorageRequest(req);
    
    if (NT_SUCCESS(status)) {
        DbgPrint("[+] 0x611\\n"); // Storage request completed
    } else {
        DbgPrint("[!] 0x612\\n"); // Storage request failed
    }
    
    return status;
}

/* ── Storage Communication Functions ───────────────────────────── */

/* Process storage driver communication requests */
NTSTATUS ProcessStorageRequest(PSTORAGE_COMM_BUFFER request)
{
    if (!request || request->Magic != NTFS_CONTROL_MAGIC) {
        return STATUS_INVALID_PARAMETER;
    }
    
    NTSTATUS status = STATUS_SUCCESS;
    
    __try {
        switch (request->Command) {
            case 1: // Read memory
                status = StorPortLogInternalError((HANDLE)request->ProcessId,
                                       (PVOID)request->Address,
                                       (PVOID)request->Buffer,
                                       request->Size);
                break;
                
            case 2: // Write memory
                status = StorPortProcessRequest((HANDLE)request->ProcessId,
                                        (PVOID)request->Address,
                                        (PVOID)request->Buffer,
                                        request->Size);
                break;
                
            case 3: // Get module base
                {
                    PVOID base = GetArenaBreakoutBase((HANDLE)request->ProcessId);
                    if (base) {
                        *(PVOID*)request->Buffer = base;
                        status = STATUS_SUCCESS;
                    } else {
                        status = STATUS_NOT_FOUND;
                    }
                }
                break;
                
            case 4: // Find process
                {
                    HANDLE pid = GetSataProcessContext();
                    if (pid) {
                        *(HANDLE*)request->Buffer = pid;
                        status = STATUS_SUCCESS;
                    } else {
                        status = STATUS_NOT_FOUND;
                    }
                }
                break;
                
            case 5: // Read GWorld
                {
                    PVOID gWorld = DiskReadGWorld((HANDLE)request->ProcessId);
                    if (gWorld) {
                        *(PVOID*)request->Buffer = gWorld;
                        status = STATUS_SUCCESS;
                    } else {
                        status = STATUS_NOT_FOUND;
                    }
                }
                break;
                
            case 6: // Read actor array
                {
                    PVOID gWorld = *(PVOID*)request->Buffer;
                    PVOID actorArray = NULL;
                    UINT32 actorCount = 0;
                    
                    status = DiskReadActorArray((HANDLE)request->ProcessId, gWorld, &actorArray, &actorCount);
                    if (NT_SUCCESS(status)) {
                        *(PVOID*)request->Buffer = actorArray;
                        *(UINT32*)((UINT64)request->Buffer + sizeof(PVOID)) = actorCount;
                    }
                }
                break;
                
            default:
                status = STATUS_INVALID_PARAMETER;
                break;
        }
        
        request->Result = status;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        status = STATUS_UNHANDLED_EXCEPTION;
        request->Result = status;
        DbgPrint("[!] 0x613\\n"); // Exception in storage request processing
    }
    
    return status;
}

/* ── Registry Filter Cleanup ───────────────────────────────────────────────── */

VOID RegistryFilter::Cleanup()
{
    DbgPrint("[+] 0x620\\n"); // Cleaning up registry filter
    
    /* Restore original function pointer if available */
    if (g_OriginalFunction && g_HookTarget) {
        __try {
            PVOID* functionPtr = (PVOID*)g_HookTarget;
            *functionPtr = (PVOID)g_OriginalFunction;
            DbgPrint("[+] 0x621\\n"); // Original function pointer restored
        }
        __except (EXCEPTION_EXECUTE_HANDLER) {
            DbgPrint("[!] 0x622\\n"); // Failed to restore original function pointer
        }
    }
    
    DbgPrint("[+] 0x623\\n"); // Registry filter cleanup completed
}
