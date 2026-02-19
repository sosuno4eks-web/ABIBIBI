#pragma once

/* ── Memory Header ───────────────────────────────────────────── */

/*
 * Safe memory operations for UE 4.26.1 processes
 * No MmCopyVirtualMemory (ACE hooks this)
 * KeStackAttachProcess implementation for ABI
 * Function obfuscation for stealth
 * Target: Arena Breakout Infinite (UE 4.26.1)
 */

#include "definitions.h"

/* ── Function Obfuscation ───────────────────────────────── */

/* Generic system driver function names */
#define SataBufferUpdate ReadProcessMemory
#define DiskFilterLog WriteProcessMemory
#define DiskFilterInitialize GetProcessModuleBase
#define DiskFilterScan GetArenaBreakoutBase

/* ── Safe Memory Operations (KeStackAttachProcess) ───── */

/* Safe memory read using KeStackAttachProcess (standard safe method for ABI) */
NTSTATUS SataBufferUpdate(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size)
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
        
        // Attach to target process
        KeStackAttachProcess(process, &apcState);
        
        // Probe source memory
        ProbeForRead(address, size, sizeof(UCHAR));
        
        // Copy memory
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
        // Ignore detach exceptions
    }
    
    ObDereferenceObject(process);
    return status;
}

/* Safe memory write using KeStackAttachProcess (standard safe method for ABI) */
NTSTATUS DiskFilterLog(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size)
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
        
        // Attach to target process
        KeStackAttachProcess(process, &apcState);
        
        // Probe target memory
        ProbeForWrite(address, size, sizeof(UCHAR));
        
        // Copy memory
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
        // Ignore detach exceptions
    }
    
    ObDereferenceObject(process);
    return status;
}

/* ── Module Base Detection (PEB Walking) ───────────────── */

/* Get module base address by walking PEB */
PVOID DiskFilterInitialize(HANDLE pid, const wchar_t* moduleName)
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
        
        // Get PEB
        PPEB peb = PsGetProcessPeb(process);
        if (!peb) {
            KeUnstackDetachProcess(&apcState);
            ObDereferenceObject(process);
            return NULL;
        }
        
        // Get PEB_LDR_DATA
        PPEB_LDR_DATA ldr = peb->Ldr;
        if (!ldr) {
            KeUnstackDetachProcess(&apcState);
            ObDereferenceObject(process);
            return NULL;
        }
        
        // Walk module list
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

/* Get ArenaBreakout.exe base address */
PVOID DiskFilterScan(HANDLE pid)
{
    // Try ArenaBreakout.exe first
    PVOID base = DiskFilterInitialize(pid, L"ArenaBreakout.exe");
    if (base) {
        return base;
    }
    
    // Fallback to ArenaBreakout_BE.exe
    base = DiskFilterInitialize(pid, L"ArenaBreakout_BE.exe");
    if (base) {
        return base;
    }
    
    DbgPrint("[!] ArenaBreakout.exe not found\\n");
    return NULL;
}

/* ── UE 4.26.1 Specific Functions ───────────────────────── */

/* Read GWorld offset (UE 4.26.1) */
PVOID ReadGWorld(HANDLE pid)
{
    PVOID base = DiskFilterScan(pid);
    if (!base) {
        return NULL;
    }
    
    // GWorld offset for UE 4.26.1
    UINT64 gWorldOffset = 0x9914A28;
    PVOID gWorldAddress = (PVOID)((UINT64)base + gWorldOffset);
    
    PVOID gWorld = NULL;
    NTSTATUS status = SataBufferUpdate(pid, gWorldAddress, &gWorld, sizeof(gWorld));
    
    if (NT_SUCCESS(status) && gWorld) {
        DbgPrint("[+] GWorld found at 0x%llX\\n", gWorld);
        return gWorld;
    }
    
    return NULL;
}

/* Read actor array from GWorld */
NTSTATUS ReadActorArray(HANDLE pid, PVOID gWorld, PVOID* actorArray, UINT32* actorCount)
{
    if (!gWorld || !actorArray || !actorCount) {
        return STATUS_INVALID_PARAMETER;
    }
    
    // UWorld->PersistentLevel->AActors
    UINT64 persistentLevelOffset = 0x30;  // UWorld->PersistentLevel
    PVOID persistentLevel = NULL;
    
    NTSTATUS status = SataBufferUpdate(pid, 
                                     (PVOID)((UINT64)gWorld + persistentLevelOffset), 
                                     &persistentLevel, sizeof(persistentLevel));
    
    if (!NT_SUCCESS(status) || !persistentLevel) {
        return status;
    }
    
    // ULevel->AActors
    UINT64 actorsOffset = 0x98;  // ULevel->AActors
    PVOID actorsArray = NULL;
    
    status = SataBufferUpdate(pid, 
                            (PVOID)((UINT64)persistentLevel + actorsOffset), 
                            &actorsArray, sizeof(actorsArray));
    
    if (!NT_SUCCESS(status) || !actorsArray) {
        return status;
    }
    
    // Get actor count
    UINT64 actorCountOffset = 0xA0;  // ULevel->AActors.Num()
    UINT32 count = 0;
    
    status = SataBufferUpdate(pid, 
                            (PVOID)((UINT64)persistentLevel + actorCountOffset), 
                            &count, sizeof(count));
    
    if (NT_SUCCESS(status)) {
        *actorArray = actorsArray;
        *actorCount = count;
        DbgPrint("[+] Actor array: 0x%llX, Count: %d\\n", actorsArray, count);
    }
    
    return status;
}

/* ── Template Functions ───────────────────────────────── */

/* Template for reading any type */
template<typename T>
NTSTATUS ReadMemory(HANDLE pid, PVOID address, T* result)
{
    return SataBufferUpdate(pid, address, result, sizeof(T));
}

/* Template for writing any type */
template<typename T>
NTSTATUS WriteMemory(HANDLE pid, PVOID address, T* value)
{
    return DiskFilterLog(pid, address, value, sizeof(T));
}
