#pragma once
/*
 * hook.h - Function Pointer Hijack for Arena Breakout Infinite (Status 0x0)
 *
 * Hijacks function pointer in win32kbase.sys for stealth communication.
 * Usermode calls hijacked function with STORAGE_COMM_BUFFER struct;
 * registry filter intercepts, processes, and returns.
 * No DeviceIoControl or IRP_MJ_DEVICE_CONTROL - completely invisible to ACE.
 */

#include "definitions.h"
#include "memory.h"
#include "stealth.h"

/* Function pointer types */
typedef PVOID(WINAPI* OriginalFunctionPtr)(PVOID param1, PVOID param2);

/* Global variables for registry filter management */
extern OriginalFunctionPtr g_OriginalFunction;
extern PVOID g_HookTarget;

namespace RegistryFilter {
    /* Install function pointer hijack in win32kbase.sys */
    BOOL Install(void* handlerAddr);
    
    /* Registry filter handler - processes storage communication requests */
    NTSTATUS Handler(PVOID callParam);
    
    /* Cleanup and restore original function pointer */
    VOID Cleanup();
}

/* Function pointer hook installation */
BOOL InstallFunctionPointerHook(PVOID target, PVOID handler);

/* Storage communication request processing */
NTSTATUS ProcessStorageRequest(PSTORAGE_COMM_BUFFER request);
