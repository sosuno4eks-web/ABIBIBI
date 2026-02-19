#pragma once

#include "definitions.h"

/* ── Safe Memory Copy using KeStackAttachProcess ───────────────────────── */

/*
 * SafeCopyMemory - Bypasses ACE memory monitoring by using KeStackAttachProcess
 * More stealthy than MmCopyVirtualMemory which is monitored by ACE/Tencent
 * Uses __try/__except for safe memory access
 */

typedef struct _SAFE_COPY_CONTEXT {
    PEPROCESS SourceProcess;
    PEPROCESS TargetProcess;
    PVOID SourceAddress;
    PVOID TargetAddress;
    SIZE_T Size;
    NTSTATUS Status;
} SAFE_COPY_CONTEXT, *PSAFE_COPY_CONTEXT;

/* Get process by PID with reference */
static PEPROCESS GetProcessByPid(HANDLE pid)
{
    PEPROCESS process;
    if (!NT_SUCCESS(PsLookupProcessByProcessId(pid, &process))) {
        return NULL;
    }
    return process;
}

/* Safe memory copy using KeStackAttachProcess */
NTSTATUS SafeCopyMemory(PEPROCESS SourceProcess, PVOID SourceAddress, 
                       PEPROCESS TargetProcess, PVOID TargetAddress, SIZE_T Size)
{
    if (!SourceProcess || !TargetProcess || !SourceAddress || !TargetAddress || !Size) {
        return STATUS_INVALID_PARAMETER;
    }
    
    KAPC_STATE apcState;
    NTSTATUS status = STATUS_SUCCESS;
    
    // Attach to source process
    KeStackAttachProcess(SourceProcess, &apcState);
    
    __try {
        // Probe source memory
        ProbeForRead(SourceAddress, Size, sizeof(UCHAR));
        
        // Copy memory
        RtlCopyMemory(TargetAddress, SourceAddress, Size);
        
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
    
    // Detach from source process
    KeUnstackDetachProcess(&apcState);
    
    return status;
}

/* Safe memory write using KeStackAttachProcess */
NTSTATUS SafeWriteMemory(PEPROCESS TargetProcess, PVOID TargetAddress, 
                        PVOID SourceAddress, SIZE_T Size)
{
    if (!TargetProcess || !TargetAddress || !SourceAddress || !Size) {
        return STATUS_INVALID_PARAMETER;
    }
    
    KAPC_STATE apcState;
    NTSTATUS status = STATUS_SUCCESS;
    
    // Attach to target process
    KeStackAttachProcess(TargetProcess, &apcState);
    
    __try {
        // Probe target memory
        ProbeForWrite(TargetAddress, Size, sizeof(UCHAR));
        
        // Copy memory
        RtlCopyMemory(TargetAddress, SourceAddress, Size);
        
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
    
    // Detach from target process
    KeUnstackDetachProcess(&apcState);
    
    return status;
}

/* Cross-process safe copy (usermode to kernel) */
NTSTATUS SafeCrossProcessCopy(HANDLE SourcePid, PVOID SourceAddress, 
                             HANDLE TargetPid, PVOID TargetAddress, SIZE_T Size)
{
    PEPROCESS sourceProcess = GetProcessByPid(SourcePid);
    PEPROCESS targetProcess = GetProcessByPid(TargetPid);
    
    if (!sourceProcess || !targetProcess) {
        if (sourceProcess) ObDereferenceObject(sourceProcess);
        if (targetProcess) ObDereferenceObject(targetProcess);
        return STATUS_PROCESS_IS_TERMINATING;
    }
    
    // Allocate kernel buffer for intermediate copy
    PVOID kernelBuffer = ExAllocatePoolWithTag(NonPagedPool, Size, 'fSaC');
    if (!kernelBuffer) {
        ObDereferenceObject(sourceProcess);
        ObDereferenceObject(targetProcess);
        return STATUS_INSUFFICIENT_RESOURCES;
    }
    
    NTSTATUS status = STATUS_SUCCESS;
    
    // Copy from source process to kernel buffer
    status = SafeCopyMemory(sourceProcess, SourceAddress, PsGetCurrentProcess(), 
                           kernelBuffer, Size);
    
    if (NT_SUCCESS(status)) {
        // Copy from kernel buffer to target process
        status = SafeCopyMemory(PsGetCurrentProcess(), kernelBuffer, 
                               targetProcess, TargetAddress, Size);
    }
    
    // Cleanup
    ExFreePoolWithTag(kernelBuffer, 'fSaC');
    ObDereferenceObject(sourceProcess);
    ObDereferenceObject(targetProcess);
    
    return status;
}

/* Read process memory safely (for usermode requests) */
NTSTATUS SafeReadProcessMemory(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size)
{
    PEPROCESS targetProcess = GetProcessByPid(pid);
    if (!targetProcess) {
        return STATUS_PROCESS_IS_TERMINATING;
    }
    
    NTSTATUS status = SafeCopyMemory(targetProcess, address, PsGetCurrentProcess(), 
                                    buffer, size);
    
    ObDereferenceObject(targetProcess);
    return status;
}

/* Write process memory safely (for usermode requests) */
NTSTATUS SafeWriteProcessMemory(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size)
{
    PEPROCESS targetProcess = GetProcessByPid(pid);
    if (!targetProcess) {
        return STATUS_PROCESS_IS_TERMINATING;
    }
    
    NTSTATUS status = SafeCopyMemory(PsGetCurrentProcess(), buffer, 
                                   targetProcess, address, size);
    
    ObDereferenceObject(targetProcess);
    return status;
}
