/*
 * memory.cpp - SATA_DATA Driver for Arena Breakout Infinite (UE 4.26.1)
 *
 * GHOST DRIVER MODE - No IoCreateDevice or IoCreateSymbolicLink
 * Uses KeStackAttachProcess for ACE bypass
 * Target: ArenaBreakout.exe
 * Anti-Cheat: ACE (Tencent)
 */

#include "definitions.h"
#include "memory.h"

/* ── KeStackAttachProcess Memory Operations (ACE Bypass) ───── */

/* Safe memory read using KeStackAttachProcess - NO MmCopyVirtualMemory */
NTSTATUS SATA_DATA_ReadMemory(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size)
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
NTSTATUS IO_PORT_WriteMemory(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size)
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

/* ── Module Base Detection (PEB Walking - No ZwQuerySystemInformation) ───── */

/* Get module base address by walking PEB - safe for ACE */
PVOID DEVICE_INDEX_GetModuleBase(HANDLE pid, const wchar_t* moduleName)
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
PVOID GetArenaBreakoutBase(HANDLE pid)
{
    // Try ArenaBreakout.exe first
    PVOID base = DEVICE_INDEX_GetModuleBase(pid, L"ArenaBreakout.exe");
    if (base) {
        return base;
    }
    
    // Fallback to ArenaBreakout_BE.exe
    base = DEVICE_INDEX_GetModuleBase(pid, L"ArenaBreakout_BE.exe");
    if (base) {
        return base;
    }
    
    DbgPrint("[!] ArenaBreakout.exe not found\\n");
    return NULL;
}

/* ── UE 4.26.1 Specific Functions ───────────────────────── */

/* Read GWorld offset (UE 4.26.1) - using safe memory operations */
PVOID ReadGWorld(HANDLE pid)
{
    PVOID base = GetArenaBreakoutBase(pid);
    if (!base) {
        return NULL;
    }
    
    // GWorld offset for UE 4.26.1
    UINT64 gWorldOffset = 0x9914A28;
    PVOID gWorldAddress = (PVOID)((UINT64)base + gWorldOffset);
    
    PVOID gWorld = NULL;
    NTSTATUS status = SATA_DATA_ReadMemory(pid, gWorldAddress, &gWorld, sizeof(gWorld));
    
    if (NT_SUCCESS(status) && gWorld) {
        DbgPrint("[+] GWorld found at 0x%llX\\n", gWorld);
        return gWorld;
    }
    
    return NULL;
}

/* Read actor array from GWorld - using safe memory operations */
NTSTATUS ReadActorArray(HANDLE pid, PVOID gWorld, PVOID* actorArray, UINT32* actorCount)
{
    if (!gWorld || !actorArray || !actorCount) {
        return STATUS_INVALID_PARAMETER;
    }
    
    // UWorld->PersistentLevel->AActors
    UINT64 persistentLevelOffset = 0x30;  // UWorld->PersistentLevel
    PVOID persistentLevel = NULL;
    
    NTSTATUS status = SATA_DATA_ReadMemory(pid, 
                                     (PVOID)((UINT64)gWorld + persistentLevelOffset), 
                                     &persistentLevel, sizeof(persistentLevel));
    
    if (!NT_SUCCESS(status) || !persistentLevel) {
        return status;
    }
    
    // ULevel->AActors
    UINT64 actorsOffset = 0x98;  // ULevel->AActors
    PVOID actorsArray = NULL;
    
    status = SATA_DATA_ReadMemory(pid, 
                            (PVOID)((UINT64)persistentLevel + actorsOffset), 
                            &actorsArray, sizeof(actorsArray));
    
    if (!NT_SUCCESS(status) || !actorsArray) {
        return status;
    }
    
    // Get actor count
    UINT64 actorCountOffset = 0xA0;  // ULevel->AActors.Num()
    UINT32 count = 0;
    
    status = SATA_DATA_ReadMemory(pid, 
                            (PVOID)((UINT64)persistentLevel + actorCountOffset), 
                            &count, sizeof(count));
    
    if (NT_SUCCESS(status)) {
        *actorArray = actorsArray;
        *actorCount = count;
        DbgPrint("[+] Actor array: 0x%llX, Count: %d\\n", actorsArray, count);
    }
    
    return status;
}

/* ── Write to Read-Only Memory (For Hooking) ───────────────────── */

BOOL WriteReadOnlyMemory(void* address, void* buffer, size_t size)
{
    if (!address || !buffer || !size) return FALSE;

    PMDL mdl = IoAllocateMdl(address, (ULONG)size, FALSE, FALSE, NULL);
    if (!mdl) return FALSE;

    MmProbeAndLockPages(mdl, KernelMode, IoReadAccess);
    PVOID mapped = MmMapLockedPagesSpecifyCache(
        mdl, KernelMode, MmNonCached, NULL, FALSE, NormalPagePriority);

    if (!mapped) {
        MmUnlockPages(mdl);
        IoFreeMdl(mdl);
        return FALSE;
    }

    NTSTATUS status = MmProtectMdlSystemAddress(mdl, PAGE_READWRITE);
    if (NT_SUCCESS(status)) {
        memcpy(mapped, buffer, size);
    }

    MmUnmapLockedPages(mapped, mdl);
    MmUnlockPages(mdl);
    IoFreeMdl(mdl);

    return NT_SUCCESS(status);
}

BOOL WriteMemory(void* address, void* buffer, size_t size)
{
    if (!address || !buffer) return FALSE;

    __try {
        RtlCopyMemory(address, buffer, size);
        return TRUE;
    } __except (EXCEPTION_EXECUTE_HANDLER) {
        return FALSE;
    }
}

/* ── Legacy Functions (Compatibility) ───────────────────────── */

BOOL myReadProcessMemory(HANDLE pid, PVOID address, PVOID buffer, DWORD size)
{
    NTSTATUS status = SATA_DATA_ReadMemory(pid, address, buffer, size);
    return NT_SUCCESS(status);
}

BOOL myWriteProcessMemory(HANDLE pid, PVOID address, PVOID buffer, DWORD size)
{
    NTSTATUS status = IO_PORT_WriteMemory(pid, address, buffer, size);
    return NT_SUCCESS(status);
}
