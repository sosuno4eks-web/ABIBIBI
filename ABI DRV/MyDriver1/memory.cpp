/*
 * memory.cpp - Storage Driver Memory Operations
 * Windows 10 Pro 22H2 (Build 19045) Compatible
 * Target: ABI Process Memory Access
 */

#include "definitions.h"

/* ── Core Memory Sync Function (Primary Interface) ───────────────── */

NTSTATUS SyncMemory(HANDLE pid, PVOID src, PVOID dst, SIZE_T size, BOOLEAN write)
{
    if (!src || !dst || size == 0) {
        return STATUS_INVALID_PARAMETER;
    }

    PEPROCESS targetProcess = NULL;
    NTSTATUS status = PsLookupProcessByProcessId(pid, &targetProcess);
    if (!NT_SUCCESS(status)) {
        return status;
    }

    __try {
        // Try MmCopyVirtualMemory first (high-speed)
        status = StorageMmCopyVirtualMemory(
            write ? NtCurrentProcess() : pid,
            write ? src : dst,
            write ? pid : NtCurrentProcess(),
            write ? dst : src,
            size
        );

        if (NT_SUCCESS(status)) {
            ObDereferenceObject(targetProcess);
            return status;
        }

        // Fallback to KeStackAttachProcess
        KAPC_STATE apcState;
        KeStackAttachProcess(targetProcess, &apcState);

        __try {
            if (write) {
                ProbeForWrite(dst, size, 1);
                RtlCopyMemory(dst, src, size);
            } else {
                ProbeForRead(src, size, 1);
                RtlCopyMemory(dst, src, size);
            }
            status = STATUS_SUCCESS;
        }
        __except (EXCEPTION_EXECUTE_HANDLER) {
            status = STATUS_ACCESS_VIOLATION;
        }

        KeUnstackDetachProcess(&apcState);

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        status = STATUS_UNHANDLED_EXCEPTION;
    }

    ObDereferenceObject(targetProcess);
    return status;
}

/* ── Storage Driver Memory Primitive Implementation ───────────────── */

typedef NTSTATUS (*PMM_COPY_VIRTUAL_MEMORY)(
    HANDLE SourceProcess,
    PVOID SourceAddress,
    HANDLE TargetProcess,
    PVOID TargetAddress,
    SIZE_T BufferSize,
    PSIZE_T ReturnSize
);

static PMM_COPY_VIRTUAL_MEMORY g_MmCopyVirtualMemory = NULL;

/* ── Initialize MmCopyVirtualMemory Function Pointer ───────────────── */

NTSTATUS StorageInitializeMmCopyVirtualMemory()
{
    if (g_MmCopyVirtualMemory) {
        return STATUS_SUCCESS;
    }

    __try {
        UNICODE_STRING functionName;
        RtlInitUnicodeString(&functionName, L"MmCopyVirtualMemory");
        
        g_MmCopyVirtualMemory = (PMM_COPY_VIRTUAL_MEMORY)MmGetSystemRoutineAddress(&functionName);
        
        return g_MmCopyVirtualMemory ? STATUS_SUCCESS : STATUS_PROCEDURE_NOT_FOUND;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

/* ── High-Speed Memory Copy with MmCopyVirtualMemory ───────────────── */

NTSTATUS StorageMmCopyVirtualMemory(HANDLE sourcePid, PVOID sourceAddress, HANDLE targetPid, PVOID targetAddress, SIZE_T size)
{
    if (!g_MmCopyVirtualMemory) {
        NTSTATUS status = StorageInitializeMmCopyVirtualMemory();
        if (!NT_SUCCESS(status)) {
            return status;
        }
    }

    __try {
        PEPROCESS sourceProcess = NULL;
        PEPROCESS targetProcess = NULL;
        NTSTATUS status;

        // Get source process
        if (sourcePid) {
            status = PsLookupProcessByProcessId(sourcePid, &sourceProcess);
            if (!NT_SUCCESS(status)) {
                return status;
            }
        } else {
            sourceProcess = PsGetCurrentProcess();
        }

        // Get target process
        if (targetPid) {
            status = PsLookupProcessByProcessId(targetPid, &targetProcess);
            if (!NT_SUCCESS(status)) {
                if (sourceProcess) ObDereferenceObject(sourceProcess);
                return status;
            }
        } else {
            targetProcess = PsGetCurrentProcess();
        }

        SIZE_T returnSize = 0;
        status = g_MmCopyVirtualMemory(sourceProcess, sourceAddress, targetProcess, targetAddress, size, &returnSize);

        if (sourceProcess) ObDereferenceObject(sourceProcess);
        if (targetProcess) ObDereferenceObject(targetProcess);

        return status;

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

/* ── Legacy Compatibility Functions ───────────────────────────────── */

NTSTATUS StorageSafeCopy(HANDLE processId, PVOID targetAddress, PVOID buffer, SIZE_T size, BOOLEAN isWrite)
{
    return SyncMemory(processId, isWrite ? buffer : targetAddress, isWrite ? targetAddress : buffer, size, isWrite);
}

NTSTATUS StorageGetModuleBase(HANDLE processId, PVOID* moduleBase)
{
    if (!moduleBase) {
        return STATUS_INVALID_PARAMETER;
    }

    *moduleBase = NULL;
    PEPROCESS targetProcess = NULL;
    NTSTATUS status = STATUS_SUCCESS;

    __try {
        status = PsLookupProcessByProcessId(processId, &targetProcess);
        if (!NT_SUCCESS(status)) {
            return status;
        }

        // Get PEB
        PPEB peb = (PPEB)PsGetProcessPeb(targetProcess);
        if (!peb) {
            status = STATUS_NOT_FOUND;
            goto cleanup;
        }

        // Attach to target process to access PEB
        KAPC_STATE apcState;
        KeStackAttachProcess(targetProcess, &apcState);

        __try {
            // Get first module from PEB
            if (peb->Ldr && peb->Ldr->InLoadOrderModuleList.Flink) {
                PLDR_DATA_TABLE_ENTRY entry = CONTAINING_RECORD(
                    peb->Ldr->InLoadOrderModuleList.Flink,
                    LDR_DATA_TABLE_ENTRY,
                    InLoadOrderLinks
                );
                
                *moduleBase = entry->DllBase;
                status = STATUS_SUCCESS;
            } else {
                status = STATUS_NOT_FOUND;
            }
        }
        __except (EXCEPTION_EXECUTE_HANDLER) {
            status = STATUS_ACCESS_VIOLATION;
        }

        KeUnstackDetachProcess(&apcState);

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        status = STATUS_UNHANDLED_EXCEPTION;
    }

cleanup:
    if (targetProcess) {
        ObDereferenceObject(targetProcess);
    }

    return status;
}

VOID StorageWriteReadOnlyMemory(PVOID address, PVOID data, SIZE_T size)
{
    if (!address || !data || size == 0) {
        return;
    }

    __try {
        KIRQL oldIrql = KeRaiseIrqlToDpcLevel();
        
        // Disable write protection
        ULONG_PTR cr0 = __readcr0();
        __writecr0(cr0 & ~0x10000); // Clear WP bit
        
        __try {
            RtlCopyMemory(address, data, size);
        }
        __finally {
            // Restore write protection
            __writecr0(cr0);
        }
        
        KeLowerIrql(oldIrql);
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Silent failure
    }
}
}

/* ── MmCopyVirtualMemory Implementation (Anti-Detection) ─────── */

typedef NTSTATUS(NTAPI* PMM_COPY_VIRTUAL_MEMORY)(
    PEPROCESS SourceProcess,
    PVOID SourceAddress,
    PEPROCESS TargetProcess,
    PVOID TargetAddress,
    SIZE_T BufferSize,
    KPROCESSOR_MODE PreviousMode,
    PSIZE_T ReturnSize
);

static PMM_COPY_VIRTUAL_MEMORY g_pMmCopyVirtualMemory = NULL;

NTSTATUS DiskSectorMmCopyVirtualMemory(HANDLE sourcePid, PVOID sourceAddress, HANDLE targetPid, PVOID targetAddress, SIZE_T size)
{
    if (!g_pMmCopyVirtualMemory) {
        // Find MmCopyVirtualMemory in ntoskrnl
        PVOID ntoskrnlBase = GetSystemModuleBase("ntoskrnl.exe");
        if (!ntoskrnlBase) {
            return STATUS_NOT_FOUND;
        }

        g_pMmCopyVirtualMemory = (PMM_COPY_VIRTUAL_MEMORY)GetSystemModuleExport("ntoskrnl.exe", "MmCopyVirtualMemory");
        if (!g_pMmCopyVirtualMemory) {
            return STATUS_NOT_FOUND;
        }
    }

    PEPROCESS sourceProcess = NULL;
    PEPROCESS targetProcess = NULL;
    NTSTATUS status;

    status = PsLookupProcessByProcessId(sourcePid, &sourceProcess);
    if (!NT_SUCCESS(status)) {
        return status;
    }

    status = PsLookupProcessByProcessId(targetPid, &targetProcess);
    if (!NT_SUCCESS(status)) {
        ObDereferenceObject(sourceProcess);
        return status;
    }

    __try {
        SIZE_T returnSize = 0;
        status = g_pMmCopyVirtualMemory(
            sourceProcess,
            sourceAddress,
            targetProcess,
            targetAddress,
            size,
            KernelMode,
            &returnSize
        );
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        status = STATUS_UNHANDLED_EXCEPTION;
    }

    ObDereferenceObject(sourceProcess);
    ObDereferenceObject(targetProcess);
    return status;
}

/* ── Enhanced Memory Mirror Block ───────────────────────────────── */

NTSTATUS DiskSectorMirrorBlock(HANDLE sourcePid, HANDLE targetPid, PVOID sourceAddress, PVOID targetAddress, SIZE_T size)
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

        // Attach to source process
        KeStackAttachProcess(sourceProcess, &apcState);
        __try {
            ProbeForRead(sourceAddress, size, MEMORY_ALLOCATION_ALIGNMENT);
            RtlCopyMemory(tempBuffer, sourceAddress, size);
        }
        __except (EXCEPTION_EXECUTE_HANDLER) {
            status = STATUS_ACCESS_VIOLATION;
            KeUnstackDetachProcess(&apcState);
            goto cleanup;
        }
        KeUnstackDetachProcess(&apcState);

        // Attach to target process
        KeStackAttachProcess(targetProcess, &apcState);
        __try {
            ProbeForWrite(targetAddress, size, MEMORY_ALLOCATION_ALIGNMENT);
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

/* ── Address Validation ───────────────────────────────────────────── */

NTSTATUS DiskSectorValidateAddress(HANDLE processId, PVOID address)
{
    PEPROCESS process = NULL;
    NTSTATUS status = PsLookupProcessByProcessId(processId, &process);
    if (!NT_SUCCESS(status)) {
        return status;
    }

    __try {
        KAPC_STATE apcState;
        KeStackAttachProcess(process, &apcState);

        __try {
            ProbeForRead(address, 1, 1);
            KeUnstackDetachProcess(&apcState);
            ObDereferenceObject(process);
            return STATUS_SUCCESS;
        }
        __except (EXCEPTION_EXECUTE_HANDLER) {
            KeUnstackDetachProcess(&apcState);
            ObDereferenceObject(process);
            return STATUS_ACCESS_VIOLATION;
        }
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        ObDereferenceObject(process);
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

/* ── Module Base Detection (Enhanced PEB Walking) ───────────── */

PVOID DiskSectorGetModuleBase(HANDLE processId)
{
    if (!processId) {
        return NULL;
    }

    PEPROCESS process = NULL;
    NTSTATUS status = PsLookupProcessByProcessId(processId, &process);
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

/* ── Write-Protected Memory Bypass ───────────────────────────────── */

VOID DiskSectorWriteReadOnlyMemory(PVOID address, PVOID data, SIZE_T size)
{
    if (!address || !data || size == 0) {
        return;
    }

    __try {
        KIRQL oldIrql = KeRaiseIrqlToDpcLevel();

        __try {
            // Disable write protection
            ULONG_PTR cr0 = __readcr0();
            __writecr0(cr0 & ~0x10000); // Clear WP bit

            // Write data
            RtlCopyMemory(address, data, size);

            // Restore write protection
            __writecr0(cr0);
        }
        __except (EXCEPTION_EXECUTE_HANDLER) {
            // Restore write protection even if write fails
            ULONG_PTR cr0 = __readcr0();
            __writecr0(cr0 | 0x10000); // Set WP bit
        }

        KeLowerIrql(oldIrql);
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Silent failure
    }
}

/* ── Legacy Function Compatibility ───────────────────────────────── */

NTSTATUS StorPortLogInternalError(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size)
{
    return DiskSectorSafeCopy(pid, address, buffer, size, FALSE);
}

NTSTATUS StorPortProcessRequest(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size)
{
    return DiskSectorSafeCopy(pid, address, buffer, size, TRUE);
}

PVOID StorPortInitialize(HANDLE pid, const wchar_t* moduleName)
{
    UNREFERENCED_PARAMETER(moduleName);
    return DiskSectorGetModuleBase(pid);
}

PVOID StorPortGetDeviceBase(HANDLE pid)
{
    return DiskSectorGetModuleBase(pid);
}

NTSTATUS MemoryMirrorBlock(HANDLE sourcePid, HANDLE targetPid, PVOID sourceAddress, PVOID targetAddress, SIZE_T size)
{
    return DiskSectorMirrorBlock(sourcePid, targetPid, sourceAddress, targetAddress, size);
}

/* ── Storage Driver Memory Primitive Implementation ───────────────── */

typedef NTSTATUS (*PMM_COPY_VIRTUAL_MEMORY)(
    HANDLE SourceProcess,
    PVOID SourceAddress,
    HANDLE TargetProcess,
    PVOID TargetAddress,
    SIZE_T BufferSize,
    PSIZE_T ReturnSize
);

static PMM_COPY_VIRTUAL_MEMORY g_MmCopyVirtualMemory = NULL;

/* ── Initialize MmCopyVirtualMemory Function Pointer ───────────────── */

NTSTATUS StorageInitializeMmCopyVirtualMemory()
{
    if (g_MmCopyVirtualMemory) {
        return STATUS_SUCCESS;
    }

    __try {
        UNICODE_STRING functionName;
        RtlInitUnicodeString(&functionName, L"MmCopyVirtualMemory");
        
        g_MmCopyVirtualMemory = (PMM_COPY_VIRTUAL_MEMORY)MmGetSystemRoutineAddress(&functionName);
        
        return g_MmCopyVirtualMemory ? STATUS_SUCCESS : STATUS_PROCEDURE_NOT_FOUND;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

/* ── High-Speed Memory Copy with MmCopyVirtualMemory ───────────────── */

NTSTATUS StorageMmCopyVirtualMemory(HANDLE sourcePid, PVOID sourceAddress, HANDLE targetPid, PVOID targetAddress, SIZE_T size)
{
    if (!g_MmCopyVirtualMemory) {
        NTSTATUS status = StorageInitializeMmCopyVirtualMemory();
        if (!NT_SUCCESS(status)) {
            return status;
        }
    }

    __try {
        PEPROCESS sourceProcess = NULL;
        PEPROCESS targetProcess = NULL;
        NTSTATUS status;

        // Get source process
        if (sourcePid) {
            status = PsLookupProcessByProcessId(sourcePid, &sourceProcess);
            if (!NT_SUCCESS(status)) {
                return status;
            }
        } else {
            sourceProcess = PsGetCurrentProcess();
        }

        // Get target process
        if (targetPid) {
            status = PsLookupProcessByProcessId(targetPid, &targetProcess);
            if (!NT_SUCCESS(status)) {
                if (sourceProcess) ObDereferenceObject(sourceProcess);
                return status;
            }
        } else {
            targetProcess = PsGetCurrentProcess();
        }

        SIZE_T returnSize = 0;
        status = g_MmCopyVirtualMemory(sourceProcess, sourceAddress, targetProcess, targetAddress, size, &returnSize);

        if (sourceProcess) ObDereferenceObject(sourceProcess);
        if (targetProcess) ObDereferenceObject(targetProcess);

        return status;

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

/* ── Fallback Memory Copy with KeStackAttachProcess ─────────────────── */

NTSTATUS StorageSafeCopy(HANDLE processId, PVOID targetAddress, PVOID buffer, SIZE_T size, BOOLEAN isWrite)
{
    if (!targetAddress || !buffer || size == 0) {
        return STATUS_INVALID_PARAMETER;
    }

    PEPROCESS targetProcess = NULL;
    NTSTATUS status = STATUS_SUCCESS;

    __try {
        // Get target process
        status = PsLookupProcessByProcessId(processId, &targetProcess);
        if (!NT_SUCCESS(status)) {
            return status;
        }

        // Try MmCopyVirtualMemory first (high-speed)
        if (g_MmCopyVirtualMemory) {
            if (isWrite) {
                status = StorageMmCopyVirtualMemory(
                    NtCurrentProcess(), buffer,
                    processId, targetAddress, size
                );
            } else {
                status = StorageMmCopyVirtualMemory(
                    processId, targetAddress,
                    NtCurrentProcess(), buffer, size
                );
            }

            if (NT_SUCCESS(status)) {
                ObDereferenceObject(targetProcess);
                return status;
            }
        }

        // Fallback to KeStackAttachProcess
        KAPC_STATE apcState;
        KeStackAttachProcess(targetProcess, &apcState);

        __try {
            if (isWrite) {
                ProbeForWrite(targetAddress, size, 1);
                RtlCopyMemory(targetAddress, buffer, size);
            } else {
                ProbeForRead(targetAddress, size, 1);
                RtlCopyMemory(buffer, targetAddress, size);
            }
        }
        __except (EXCEPTION_EXECUTE_HANDLER) {
            status = STATUS_ACCESS_VIOLATION;
        }

        KeUnstackDetachProcess(&apcState);

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        status = STATUS_UNHANDLED_EXCEPTION;
    }

    if (targetProcess) {
        ObDereferenceObject(targetProcess);
    }

    return status;
}

/* ── Get Module Base Address via PEB Walking ───────────────────── */

NTSTATUS StorageGetModuleBase(HANDLE processId, PVOID* moduleBase)
{
    if (!moduleBase) {
        return STATUS_INVALID_PARAMETER;
    }

    *moduleBase = NULL;
    PEPROCESS targetProcess = NULL;
    NTSTATUS status = STATUS_SUCCESS;

    __try {
        status = PsLookupProcessByProcessId(processId, &targetProcess);
        if (!NT_SUCCESS(status)) {
            return status;
        }

        // Get PEB
        PPEB peb = (PPEB)PsGetProcessPeb(targetProcess);
        if (!peb) {
            status = STATUS_NOT_FOUND;
            goto cleanup;
        }

        // Attach to target process to access PEB
        KAPC_STATE apcState;
        KeStackAttachProcess(targetProcess, &apcState);

        __try {
            // Get first module from PEB
            if (peb->Ldr && peb->Ldr->InLoadOrderModuleList.Flink) {
                PLDR_DATA_TABLE_ENTRY entry = CONTAINING_RECORD(
                    peb->Ldr->InLoadOrderModuleList.Flink,
                    LDR_DATA_TABLE_ENTRY,
                    InLoadOrderLinks
                );
                
                *moduleBase = entry->DllBase;
                status = STATUS_SUCCESS;
            } else {
                status = STATUS_NOT_FOUND;
            }
        }
        __except (EXCEPTION_EXECUTE_HANDLER) {
            status = STATUS_ACCESS_VIOLATION;
        }

        KeUnstackDetachProcess(&apcState);

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        status = STATUS_UNHANDLED_EXCEPTION;
    }

cleanup:
    if (targetProcess) {
        ObDereferenceObject(targetProcess);
    }

    return status;
}

/* ── Write-Protected Memory Bypass ───────────────────────────────── */

VOID StorageWriteReadOnlyMemory(PVOID address, PVOID data, SIZE_T size)
{
    if (!address || !data || size == 0) {
        return;
    }

    __try {
        KIRQL oldIrql = KeRaiseIrqlToDpcLevel();
        
        // Disable write protection
        ULONG_PTR cr0 = __readcr0();
        __writecr0(cr0 & ~0x10000); // Clear WP bit
        
        __try {
            RtlCopyMemory(address, data, size);
        }
        __finally {
            // Restore write protection
            __writecr0(cr0);
        }
        
        KeLowerIrql(oldIrql);
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Silent failure
    }
}

/* ── Legacy Compatibility Functions ───────────────────────────────── */

NTSTATUS StorPortLogInternalError(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size)
{
    return StorageSafeCopy(pid, address, buffer, size, FALSE);
}

NTSTATUS StorPortProcessRequest(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size)
{
    return StorageSafeCopy(pid, address, buffer, size, TRUE);
}

PVOID StorPortGetDeviceBase(HANDLE pid)
{
    PVOID moduleBase = NULL;
    StorageGetModuleBase(pid, &moduleBase);
    return moduleBase;
}
