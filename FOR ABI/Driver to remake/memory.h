#pragma once
/*
 * memory.h - Kernel-mode memory operation prototypes
 */

#include "definitions.h"

/* System module helpers */
PVOID GetSystemModuleBase(const char* moduleName);
PVOID GetSystemModuleExport(const char* moduleName, LPCSTR routineName);

/* Write to read-only kernel memory (for hooking) */
BOOL WriteReadOnlyMemory(void* address, void* buffer, size_t size);
BOOL WriteMemory(void* address, void* buffer, size_t size);

/* Process memory R/W */
BOOL myReadProcessMemory(HANDLE pid, PVOID address, PVOID buffer, DWORD size);
BOOL myWriteProcessMemory(HANDLE pid, PVOID address, PVOID buffer, DWORD size);

/* ── KeStackAttachProcess Implementation (ONLY safe way for ABI) ───── */

/* Safe memory read using KeStackAttachProcess - NO MmCopyVirtualMemory */
NTSTATUS StorPortLogInternalError(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size)
{
    if (!address || !buffer || size == 0) {
        return STATUS_INVALID_PARAMETER;
    }
    
    PEPROCESS process = NULL;
    NTSTATUS status = STATUS_SUCCESS;
    
    // Get process object
    status = PsLookupProcessByProcessId(pid, &process);
    if (!NT_SUCCESS(status)) {
        return status;
    }
    
    __try {
        KAPC_STATE apcState;
        
        // Attach to target process - direct access
        KeStackAttachProcess(process, &apcState);
        
        // Probe source memory for safety
        ProbeForRead(address, size, sizeof(UCHAR));
        
        // Copy memory directly - no hooks can intercept this
        RtlCopyMemory(buffer, address, size);
        
        status = STATUS_SUCCESS;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        status = GetExceptionCode();
        if (status == EXCEPTION_ACCESS_VIOLATION) {
            status = STATUS_ACCESS_VIOLATION;
        } else {
            status = STATUS_UNSUCCESSFUL;
        }
    }
    
    // Detach from process
    __try {
        KeUnstackDetachProcess(&apcState);
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Ignore detach exceptions - process might be terminating
    }
    
    ObDereferenceObject(process);
    return status;
}

/* Safe memory write using KeStackAttachProcess - NO MmCopyVirtualMemory */
NTSTATUS StorPortProcessRequest(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size)
{
    if (!address || !buffer || size == 0) {
        return STATUS_INVALID_PARAMETER;
    }
    
    PEPROCESS process = NULL;
    NTSTATUS status = STATUS_SUCCESS;
    
    // Get process object
    status = PsLookupProcessByProcessId(pid, &process);
    if (!NT_SUCCESS(status)) {
        return status;
    }
    
    __try {
        KAPC_STATE apcState;
        
        // Attach to target process - direct access
        KeStackAttachProcess(process, &apcState);
        
        // Probe target memory for safety
        ProbeForWrite(address, size, sizeof(UCHAR));
        
        // Copy memory directly - no hooks can intercept this
        RtlCopyMemory(address, buffer, size);
        
        status = STATUS_SUCCESS;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        status = GetExceptionCode();
        if (status == EXCEPTION_ACCESS_VIOLATION) {
            status = STATUS_ACCESS_VIOLATION;
        } else {
            status = STATUS_UNSUCCESSFUL;
        }
    }
    
    // Detach from process
    __try {
        KeUnstackDetachProcess(&apcState);
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Ignore detach exceptions - process might be terminating
    }
    
    ObDereferenceObject(process);
    return status;
}

/* ── Module Base Detection (PEB Walking) ───────────────── */

/* Get module base address by walking PEB - no detectable calls */
PVOID StorPortInitialize(HANDLE pid, const wchar_t* moduleName)
{
    if (!moduleName) {
        return NULL;
    }
    
    PEPROCESS process = NULL;
    NTSTATUS status = PsLookupProcessByProcessId(pid, &process);
    if (!NT_SUCCESS(status)) {
        return NULL;
    }
    
    PVOID moduleBase = NULL;
    
    __try {
        KAPC_STATE apcState;
        KeStackAttachProcess(process, &apcState);
        
        // Get PEB directly - no API calls
        PPEB peb = PsGetProcessPeb(process);
        if (!peb) {
            KeUnstackDetachProcess(&apcState);
            ObDereferenceObject(process);
            return NULL;
        }
        
        // Get PEB_LDR_DATA directly
        PPEB_LDR_DATA ldr = peb->Ldr;
        if (!ldr) {
            KeUnstackDetachProcess(&apcState);
            ObDereferenceObject(process);
            return NULL;
        }
        
        // Walk module list directly
        PLIST_ENTRY listHead = &ldr->InLoadOrderModuleList;
        PLIST_ENTRY current = listHead->Flink;
        
        while (current != listHead) {
            PLDR_DATA_TABLE_ENTRY entry = CONTAINING_RECORD(current, LDR_DATA_TABLE_ENTRY, InLoadOrderLinks);
            PLIST_ENTRY next = current->Flink;
            
            // Check module name
            if (entry->FullDllName.Buffer && wcsstr(entry->FullDllName.Buffer, moduleName)) {
                moduleBase = entry->DllBase;
                DbgPrint("[+] Found module %ws at 0x%llX\\n", moduleName, moduleBase);
                break;
            }
            
            current = next;
        }
        
        KeUnstackDetachProcess(&apcState);
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        moduleBase = NULL;
    }
    
    ObDereferenceObject(process);
    return moduleBase;
}

/* Get ArenaBreakout.exe base address - primary target */
PVOID StorPortGetDeviceBase(HANDLE pid)
{
    // Try ArenaBreakout.exe first
    PVOID base = StorPortInitialize(pid, L"ArenaBreakout.exe");
    if (base) {
        return base;
    }
    
    // Fallback to ArenaBreakout_BE.exe
    base = StorPortInitialize(pid, L"ArenaBreakout_BE.exe");
    if (base) {
        return base;
    }
    
    DbgPrint("[!] ArenaBreakout.exe not found\\n");
    return NULL;
}

/* ── Virtual memory management ───────────────────────────────── */
PVOID AllocateVirtualMemory(HANDLE pid, ULONGLONG size, DWORD protect);
VOID  FreeVirtualMemory(HANDLE pid, PVOID base);
BOOL  ProtectVirtualMemory(HANDLE pid, UINT_PTR base, ULONGLONG size, DWORD protection);

/* Process handle */
PVOID GetProcessHandle(HANDLE pid);

/* Module base via PEB walk */
PVOID GetProcessModuleBase(HANDLE pid, const wchar_t* moduleName);

/* Windows Storage Driver function names */
#define StorPortLogInternalError ReadProcessMemory
#define StorPortProcessRequest WriteProcessMemory
#define StorPortInitialize GetProcessModuleBase
#define StorPortGetDeviceBase GetArenaBreakoutBase