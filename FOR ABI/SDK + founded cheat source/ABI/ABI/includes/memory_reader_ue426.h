#pragma once

/* ── Clean Memory Operations for Arena Breakout Infinite (UE 4.26.1) ───── */

/*
 * Memory reading class using KeStackAttachProcess
 * No legacy EAC methods - pure ACE bypass implementation
 * Target: ArenaBreakout.exe
 */

typedef struct _MEMORY_READER {
    HANDLE TargetProcess;
    PEPROCESS ProcessObject;
    BOOLEAN IsAttached;
    
    _MEMORY_READER() : TargetProcess(NULL), ProcessObject(NULL), IsAttached(FALSE) {}
} MEMORY_READER, *PMEMORY_READER;

/* Get process by PID with proper reference handling */
static PEPROCESS GetProcessByPid(HANDLE pid)
{
    PEPROCESS process = NULL;
    
    if (!NT_SUCCESS(PsLookupProcessByProcessId(pid, &process))) {
        return NULL;
    }
    
    return process;
}

/* Initialize memory reader for target process */
BOOLEAN InitializeMemoryReader(PMEMORY_READER reader, HANDLE pid)
{
    if (!reader) return FALSE;
    
    reader->TargetProcess = pid;
    reader->ProcessObject = GetProcessByPid(pid);
    
    if (!reader->ProcessObject) {
        DbgPrint("[!] Failed to get process object for PID: %d\\n", pid);
        return FALSE;
    }
    
    reader->IsAttached = FALSE;
    DbgPrint("[+] Memory reader initialized for PID: %d\\n", pid);
    return TRUE;
}

/* Safe memory read using KeStackAttachProcess */
NTSTATUS SafeReadMemory(PMEMORY_READER reader, PVOID address, PVOID buffer, SIZE_T size)
{
    if (!reader || !reader->ProcessObject || !address || !buffer || !size) {
        return STATUS_INVALID_PARAMETER;
    }
    
    KAPC_STATE apcState;
    NTSTATUS status = STATUS_SUCCESS;
    
    __try {
        // Attach to target process
        KeStackAttachProcess(reader->ProcessObject, &apcState);
        reader->IsAttached = TRUE;
        
        // Probe source memory for read access
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
        DbgPrint("[!] Memory read exception: 0x%X\\n", status);
    }
    
    // Detach from target process
    if (reader->IsAttached) {
        KeUnstackDetachProcess(&apcState);
        reader->IsAttached = FALSE;
    }
    
    return status;
}

/* Safe memory write using KeStackAttachProcess */
NTSTATUS SafeWriteMemory(PMEMORY_READER reader, PVOID address, PVOID buffer, SIZE_T size)
{
    if (!reader || !reader->ProcessObject || !address || !buffer || !size) {
        return STATUS_INVALID_PARAMETER;
    }
    
    KAPC_STATE apcState;
    NTSTATUS status = STATUS_SUCCESS;
    
    __try {
        // Attach to target process
        KeStackAttachProcess(reader->ProcessObject, &apcState);
        reader->IsAttached = TRUE;
        
        // Probe target memory for write access
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
        DbgPrint("[!] Memory write exception: 0x%X\\n", status);
    }
    
    // Detach from target process
    if (reader->IsAttached) {
        KeUnstackDetachProcess(&apcState);
        reader->IsAttached = FALSE;
    }
    
    return status;
}

/* Template read function */
template<typename T>
NTSTATUS ReadMemory(PMEMORY_READER reader, uintptr_t address, T* value)
{
    if (!value) return STATUS_INVALID_PARAMETER;
    
    NTSTATUS status = SafeReadMemory(reader, (PVOID)address, value, sizeof(T));
    
    if (!NT_SUCCESS(status)) {
        DbgPrint("[!] Failed to read at 0x%llX: 0x%X\\n", address, status);
    }
    
    return status;
}

/* Template write function */
template<typename T>
NTSTATUS WriteMemory(PMEMORY_READER reader, uintptr_t address, const T& value)
{
    NTSTATUS status = SafeWriteMemory(reader, (PVOID)address, (PVOID)&value, sizeof(T));
    
    if (!NT_SUCCESS(status)) {
        DbgPrint("[!] Failed to write at 0x%llX: 0x%X\\n", address, status);
    }
    
    return status;
}

/* Read string safely */
NTSTATUS ReadString(PMEMORY_READER reader, uintptr_t address, char* buffer, SIZE_T maxSize)
{
    if (!reader || !buffer || maxSize == 0) {
        return STATUS_INVALID_PARAMETER;
    }
    
    NTSTATUS status = SafeReadMemory(reader, (PVOID)address, buffer, maxSize - 1);
    
    if (NT_SUCCESS(status)) {
        // Ensure null termination
        buffer[maxSize - 1] = '\\0';
        
        // Find actual string length
        for (SIZE_T i = 0; i < maxSize - 1; i++) {
            if (buffer[i] == '\\0') {
                break;
            }
        }
    }
    
    return status;
}

/* Read Unicode string safely */
NTSTATUS ReadUnicodeString(PMEMORY_READER reader, uintptr_t address, wchar_t* buffer, SIZE_T maxChars)
{
    if (!reader || !buffer || maxChars == 0) {
        return STATUS_INVALID_PARAMETER;
    }
    
    NTSTATUS status = SafeReadMemory(reader, (PVOID)address, buffer, (maxChars - 1) * sizeof(wchar_t));
    
    if (NT_SUCCESS(status)) {
        // Ensure null termination
        buffer[maxChars - 1] = L'\\0';
    }
    
    return status;
}

/* Check if process is still running */
BOOLEAN IsProcessRunning(PMEMORY_READER reader)
{
    if (!reader || !reader->ProcessObject) {
        return FALSE;
    }
    
    __try {
        // Try to access process to check if it's still valid
        HANDLE handle = NULL;
        NTSTATUS status = ObOpenObjectByPointer(
            reader->ProcessObject,
            OBJ_KERNEL_HANDLE,
            NULL,
            GENERIC_READ,
            *PsProcessType,
            &handle
        );
        
        if (NT_SUCCESS(status)) {
            ZwClose(handle);
            return TRUE;
        }
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Process is no longer valid
    }
    
    return FALSE;
}

/* Cleanup memory reader */
VOID CleanupMemoryReader(PMEMORY_READER reader)
{
    if (!reader) return;
    
    // Detach if still attached
    if (reader->IsAttached) {
        KAPC_STATE apcState;
        KeUnstackDetachProcess(&apcState);
        reader->IsAttached = FALSE;
    }
    
    // Dereference process object
    if (reader->ProcessObject) {
        ObDereferenceObject(reader->ProcessObject);
        reader->ProcessObject = NULL;
    }
    
    reader->TargetProcess = NULL;
    DbgPrint("[+] Memory reader cleaned up\\n");
}

/* Global memory reader instance */
static MEMORY_READER g_MemoryReader = {};

/* Initialize global memory reader */
BOOLEAN InitializeGlobalMemoryReader(HANDLE pid)
{
    return InitializeMemoryReader(&g_MemoryReader, pid);
}

/* Global read template */
template<typename T>
NTSTATUS ReadGlobalMemory(uintptr_t address, T* value)
{
    return ReadMemory(&g_MemoryReader, address, value);
}

/* Global write template */
template<typename T>
NTSTATUS WriteGlobalMemory(uintptr_t address, const T& value)
{
    return WriteMemory(&g_MemoryReader, address, value);
}

/* Cleanup global memory reader */
VOID CleanupGlobalMemoryReader()
{
    CleanupMemoryReader(&g_MemoryReader);
}
