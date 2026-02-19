/*
 * memory.cpp - Windows Storage Driver Memory Operations
 *
 * GHOST DRIVER MODE - No device objects, no IOCTL, complete stealth
 * Uses KeStackAttachProcess for memory operations
 */

#include "definitions.h"
#include "memory.h"
#include "offsets.h"

/* ── Constants ───────────────────────────────────────────────────── */

#define NTFS_CONTROL_MAGIC 0x5446534E  // "NTFS"

/* ── Global Variables ───────────────────────────────────────────── */

PCOMMAND_PACKET g_StorageCommBuffer = NULL;
KSPIN_LOCK g_StorageCommLock;
KEVENT g_StorageCommEvent;

/* ── Core Memory Operations (KeStackAttachProcess) ───────────────── */

NTSTATUS MemoryMirrorBlock(HANDLE sourcePid, HANDLE targetPid, PVOID sourceAddress, PVOID targetAddress, SIZE_T size)
{
    if (!sourceAddress || !targetAddress || size == 0) {
        return STATUS_INVALID_PARAMETER;
    }
    
    if (sourcePid == targetPid) {
        return STATUS_INVALID_PARAMETER_MIX;
    }
    
    PEPROCESS sourceProcess = NULL;
    PEPROCESS targetProcess = NULL;
    NTSTATUS status = STATUS_SUCCESS;
    PVOID tempBuffer = NULL;
    
    status = PsLookupProcessByProcessId(sourcePid, &sourceProcess);
    if (!NT_SUCCESS(status)) {
        return status;
    }
    
    status = PsLookupProcessByProcessId(targetPid, &targetProcess);
    if (!NT_SUCCESS(status)) {
        ObDereferenceObject(sourceProcess);
        return status;
    }
    
    tempBuffer = ExAllocatePoolWithTag(NonPagedPool, size, 'mirM');
    if (!tempBuffer) {
        status = STATUS_INSUFFICIENT_RESOURCES;
        goto cleanup;
    }
    
    __try {
        KAPC_STATE apcState;
        
        KeStackAttachProcess(sourceProcess, &apcState);
        __try {
            ProbeForRead(sourceAddress, size, 1);
            RtlCopyMemory(tempBuffer, sourceAddress, size);
        }
        __except (EXCEPTION_EXECUTE_HANDLER) {
            status = STATUS_ACCESS_VIOLATION;
            KeUnstackDetachProcess(&apcState);
            goto cleanup;
        }
        KeUnstackDetachProcess(&apcState);
        
        KeStackAttachProcess(targetProcess, &apcState);
        __try {
            ProbeForWrite(targetAddress, size, 1);
            RtlCopyMemory(targetAddress, tempBuffer, size);
        }
        __except (EXCEPTION_EXECUTE_HANDLER) {
            status = STATUS_ACCESS_VIOLATION;
            KeUnstackDetachProcess(&apcState);
            goto cleanup;
        }
        KeUnstackDetachProcess(&apcState);
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        status = STATUS_UNHANDLED_EXCEPTION;
    }
    
cleanup:
    if (tempBuffer) {
        ExFreePoolWithTag(tempBuffer, 'mirM');
    }
    if (sourceProcess) {
        ObDereferenceObject(sourceProcess);
    }
    if (targetProcess) {
        ObDereferenceObject(targetProcess);
    }
    
    return status;
}

NTSTATUS StorPortLogInternalError(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size)
{
    if (!address || !buffer || size == 0) {
        return STATUS_INVALID_PARAMETER;
    }
    
    PEPROCESS process = NULL;
    NTSTATUS status = PsLookupProcessByProcessId(pid, &process);
    if (!NT_SUCCESS(status)) {
        return status;
    }
    
    __try {
        KAPC_STATE apcState;
        KeStackAttachProcess(process, &apcState);
        
        ProbeForRead(address, size, 1);
        ProbeForWrite(buffer, size, 1);
        
        RtlCopyMemory(buffer, address, size);
        
        KeUnstackDetachProcess(&apcState);
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        status = STATUS_UNHANDLED_EXCEPTION;
    }
    
    ObDereferenceObject(process);
    return status;
}

NTSTATUS StorPortProcessRequest(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size)
{
    if (!address || !buffer || size == 0) {
        return STATUS_INVALID_PARAMETER;
    }
    
    PEPROCESS process = NULL;
    NTSTATUS status = PsLookupProcessByProcessId(pid, &process);
    if (!NT_SUCCESS(status)) {
        return status;
    }
    
    __try {
        KAPC_STATE apcState;
        KeStackAttachProcess(process, &apcState);
        
        ProbeForRead(buffer, size, 1);
        ProbeForWrite(address, size, 1);
        
        RtlCopyMemory(address, buffer, size);
        
        KeUnstackDetachProcess(&apcState);
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        status = STATUS_UNHANDLED_EXCEPTION;
    }
    
    ObDereferenceObject(process);
    return status;
}

/* ── Module Base Detection (PEB Walking) ───────────────────── */

PVOID StorPortInitialize(HANDLE pid, const wchar_t* moduleName)
{
    if (!pid) {
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
        
        PPEB peb = (PPEB)PsGetProcessPeb(process);
        if (!peb) {
            KeUnstackDetachProcess(&apcState);
            ObDereferenceObject(process);
            return NULL;
        }
        
        PPEB_LDR_DATA ldr = peb->Ldr;
        if (!ldr) {
            KeUnstackDetachProcess(&apcState);
            ObDereferenceObject(process);
            return NULL;
        }
        
        PLIST_ENTRY listHead = &ldr->InLoadOrderModuleList;
        PLIST_ENTRY current = listHead->Flink;
        
        while (current != listHead) {
            PLDR_DATA_TABLE_ENTRY entry = CONTAINING_RECORD(current, LDR_DATA_TABLE_ENTRY, InLoadOrderLinks);
            PLIST_ENTRY next = current->Flink;
            
            if (entry->FullDllName.Buffer && wcsstr(entry->FullDllName.Buffer, L"ArenaBreakout.exe")) {
                moduleBase = entry->DllBase;
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

PVOID StorPortGetDeviceBase(HANDLE pid)
{
    return StorPortInitialize(pid, L"ArenaBreakout.exe");
}

/* ── UE 4.26.1 Specific Functions ───────────────────────── */

PVOID DiskReadGWorld(HANDLE pid)
{
    PVOID base = StorPortInitialize(pid, L"ArenaBreakout.exe");
    if (!base) {
        return NULL;
    }
    
    PVOID gWorldAddress = (PVOID)((UINT64)base + OFFSET_GWORLD);
    PVOID gWorld = NULL;
    NTSTATUS status = StorPortLogInternalError(pid, gWorldAddress, &gWorld, sizeof(gWorld));
    
    if (NT_SUCCESS(status) && gWorld) {
        return gWorld;
    }
    
    return NULL;
}

NTSTATUS DiskReadActorArray(HANDLE pid, PVOID gWorld, PVOID* actorArray, UINT32* actorCount)
{
    if (!gWorld || !actorArray || !actorCount) {
        return STATUS_INVALID_PARAMETER;
    }
    
    PVOID persistentLevel = NULL;
    NTSTATUS status = StorPortLogInternalError(pid, 
                                     (PVOID)((UINT64)gWorld + OFFSET_UWORLD_PERSISTENT_LEVEL), 
                                     &persistentLevel, sizeof(persistentLevel));
    
    if (!NT_SUCCESS(status) || !persistentLevel) {
        return status;
    }
    
    PVOID actorsArray = NULL;
    status = StorPortLogInternalError(pid, 
                            (PVOID)((UINT64)persistentLevel + OFFSET_ULEVEL_ACTORS), 
                            &actorsArray, sizeof(actorsArray));
    
    if (!NT_SUCCESS(status) || !actorsArray) {
        return status;
    }
    
    UINT32 count = 0;
    status = StorPortLogInternalError(pid, 
                            (PVOID)((UINT64)persistentLevel + OFFSET_ULEVEL_ACTOR_COUNT), 
                            &count, sizeof(count));
    
    if (NT_SUCCESS(status)) {
        *actorArray = actorsArray;
        *actorCount = count;
    }
    
    return status;
}

/* ── Storage Communication ───────────────────────────────────── */

NTSTATUS InitializeStorageCommunication()
{
    g_StorageCommBuffer = (PCOMMAND_PACKET)ExAllocatePoolWithTag(
        NonPagedPool, 
        sizeof(COMMAND_PACKET), 
        'tmaS');

    if (!g_StorageCommBuffer) {
        return STATUS_INSUFFICIENT_RESOURCES;
    }

    RtlZeroMemory(g_StorageCommBuffer, sizeof(COMMAND_PACKET));
    KeInitializeSpinLock(&g_StorageCommLock);
    KeInitializeEvent(&g_StorageCommEvent, NotificationEvent, FALSE);

    return STATUS_SUCCESS;
}

NTSTATUS ProcessStorageRequest(PCOMMAND_PACKET request)
{
    if (!request) {
        return STATUS_INVALID_PARAMETER;
    }

    NTSTATUS status = STATUS_SUCCESS;
    KIRQL oldIrql;

    KeAcquireSpinLock(&g_StorageCommLock, &oldIrql);

    __try {
        switch (request->Command) {
            case 1: // Read memory
                status = StorPortLogInternalError((HANDLE)request->ProcessId,
                                       (PVOID)request->TargetAddress,
                                       (PVOID)request->Buffer,
                                       request->Size);
                break;
                
            case 2: // Write memory
                status = StorPortProcessRequest((HANDLE)request->ProcessId,
                                        (PVOID)request->TargetAddress,
                                        (PVOID)request->Buffer,
                                        request->Size);
                break;
                
            case 3: // Get module base
                {
                    PVOID base = StorPortGetDeviceBase((HANDLE)request->ProcessId);
                    if (base) {
                        *(PVOID*)request->Buffer = base;
                        status = STATUS_SUCCESS;
                    } else {
                        status = STATUS_NOT_FOUND;
                    }
                }
                break;
                
            default:
                status = STATUS_INVALID_PARAMETER;
                break;
        }
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        status = STATUS_UNHANDLED_EXCEPTION;
    }
    
    KeReleaseSpinLock(&g_StorageCommLock, oldIrql);
    KeSetEvent(&g_StorageCommEvent, IO_NO_INCREMENT, FALSE);
        
    return status;
}

/* ── Function Hooking ─────────────────────────────────────────── */

typedef PVOID(WINAPI* OriginalWin32kFunction)(PVOID param1, PVOID param2);
OriginalWin32kFunction g_OriginalWin32kFunction = NULL;
PVOID g_HookedWin32kFunction = NULL;

PVOID HookedWin32kFunction(PVOID param1, PVOID param2)
{
    if (param1 && *(UINT32*)param1 == NTFS_CONTROL_MAGIC) {
        NTSTATUS status = StorPortLogInternalError((HANDLE)((PCOMMAND_PACKET)param1)->ProcessId,
                                              ((PCOMMAND_PACKET)param1)->TargetAddress,
                                              ((PCOMMAND_PACKET)param1)->Buffer,
                                              ((PCOMMAND_PACKET)param1)->Size);
        return (PVOID)STATUS_SUCCESS;
    }
    
    if (g_OriginalWin32kFunction) {
        return g_OriginalWin32kFunction(param1, param2);
    }
    
    return NULL;
}

NTSTATUS InitializeDiskControllerHook()
{
    PVOID win32kBase = StorPortInitialize((HANDLE)4, L"win32kbase.sys");
    if (!win32kBase) {
        return STATUS_NOT_FOUND;
    }
    
    return STATUS_SUCCESS;
}

/* ── Utility Functions ─────────────────────────────────────────── */

BOOL WriteReadOnlyMemory(void* address, void* buffer, size_t size)
{
    if (!address || !buffer || !size) return FALSE;

    __try {
        KIRQL oldIrql = KeRaiseIrqlToDpcLevel();
        RtlCopyMemory(address, buffer, size);
        KeLowerIrql(oldIrql);
        return TRUE;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return FALSE;
    }
}

BOOL WriteMemory(void* address, void* buffer, size_t size)
{
    if (!address || !buffer) return FALSE;

    __try {
        RtlCopyMemory(address, buffer, size);
        return TRUE;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return FALSE;
    }
}

BOOL myReadProcessMemory(HANDLE pid, PVOID address, PVOID buffer, DWORD size)
{
    NTSTATUS status = StorPortLogInternalError(pid, address, buffer, size);
    return NT_SUCCESS(status);
}

BOOL myWriteProcessMemory(HANDLE pid, PVOID address, PVOID buffer, DWORD size)
{
    NTSTATUS status = StorPortProcessRequest(pid, address, buffer, size);
    return NT_SUCCESS(status);
}

/* ── Driver Initialization ───────────────────────────────────── */

NTSTATUS InitializeDiskDriver()
{
    NTSTATUS status = InitializeStorageCommunication();
    if (!NT_SUCCESS(status)) {
        return status;
    }
    
    status = InitializeDiskControllerHook();
    if (!NT_SUCCESS(status)) {
        // Continue anyway - shared memory is primary method
    }
    
    return STATUS_SUCCESS;
}
