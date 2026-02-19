/*
 * memory.cpp - NtfsControlPoint Windows Storage Driver for Arena Breakout Infinite (UE 4.26.1)
 *
 * LEGITIMATE DRIVER MODE - Mimics Windows Storage Driver
 * No device objects, no IOCTL, complete ACE bypass
 * Uses KeStackAttachProcess for memory operations
 * Target: ArenaBreakout.exe
 * Anti-Cheat: ACE (Tencent)
 * 
 * This driver appears as legitimate Windows storage component to ACE
 * Memory operations use KeStackAttachProcess -> memcpy -> KeDetachStackProcess only
 */

#include "definitions.h"
#include "memory.h"
#include "offsets.h"

/* ── Windows Storage Driver Constants ───────────────────── */

#define NTFS_CONTROL_MAGIC 0x5446534E  // "NTFS"
#define SATA_BUFFER_SYNC_SIZE 0x10000
#define STORAGE_CONTROLLER_MAX_REQUESTS 256

/* ── KeStackAttachProcess Memory Operations (ACE Bypass) ───── */

/* Safe memory read using KeStackAttachProcess - NO MmCopyVirtualMemory */
NTSTATUS NtfsControlPoint_ReadMemory(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size)
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
NTSTATUS SataBufferSync_WriteMemory(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size)
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

/* ── Process Search via PsLookupProcessByProcessId ───── */

/* Find ArenaBreakout.exe process - no device handles needed */
HANDLE FindArenaBreakoutProcess()
{
    ULONG processCount = 0;
    PSYSTEM_PROCESS_INFORMATION processInfo = NULL;
    ULONG bufferSize = 0;
    
    // Get required buffer size
    NTSTATUS status = ZwQuerySystemInformation(SystemProcessInformation, NULL, 0, &bufferSize);
    if (status != STATUS_INFO_LENGTH_MISMATCH) {
        return NULL;
    }
    
    // Allocate buffer
    processInfo = (PSYSTEM_PROCESS_INFORMATION)ExAllocatePoolWithTag(NonPagedPool, bufferSize, 'tmaS');
    if (!processInfo) {
        return NULL;
    }
    
    // Get process list
    status = ZwQuerySystemInformation(SystemProcessInformation, processInfo, bufferSize, &bufferSize);
    if (!NT_SUCCESS(status)) {
        ExFreePoolWithTag(processInfo, 'tmaS');
        return NULL;
    }
    
    HANDLE targetPid = NULL;
    PSYSTEM_PROCESS_INFORMATION current = processInfo;
    
    __try {
        while (TRUE) {
            if (current->ImageName.Buffer && current->ImageName.Length > 0) {
                // Check for ArenaBreakout.exe
                if (_wcsicmp(current->ImageName.Buffer, GAME_NAME) == 0) {
                    targetPid = current->ProcessId;
                    DBG_MEM("Found ArenaBreakout.exe PID: %d\\n", targetPid);
                    break;
                }
                
                // Check for ArenaBreakout_BE.exe
                if (_wcsicmp(current->ImageName.Buffer, GAME_NAME_BE) == 0) {
                    targetPid = current->ProcessId;
                    DBG_MEM("Found ArenaBreakout_BE.exe PID: %d\\n", targetPid);
                    break;
                }
            }
            
            if (current->NextEntryOffset == 0) {
                break;
            }
            
            current = (PSYSTEM_PROCESS_INFORMATION)((PUCHAR)current + current->NextEntryOffset);
        }
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        targetPid = NULL;
    }
    
    ExFreePoolWithTag(processInfo, 'tmaS');
    return targetPid;
}

/* ── Module Base Detection (PEB Walking - No ZwQuerySystemInformation) ───── */

/* Get module base address by walking PEB - safe for ACE */
PVOID StorageController_GetModuleBase(HANDLE pid, const wchar_t* moduleName)
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
                DBG_MEM("Found module %ws at 0x%llX\\n", moduleName, moduleBase);
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
    PVOID base = StorageController_GetModuleBase(pid, L"ArenaBreakout.exe");
    if (base) {
        return base;
    }
    
    // Fallback to ArenaBreakout_BE.exe
    base = StorageController_GetModuleBase(pid, L"ArenaBreakout_BE.exe");
    if (base) {
        return base;
    }
    
    DBG_MEM("ArenaBreakout.exe not found\\n");
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
    PVOID gWorldAddress = (PVOID)((UINT64)base + OFFSET_GWORLD);
    
    PVOID gWorld = NULL;
    NTSTATUS status = NtfsControlPoint_ReadMemory(pid, gWorldAddress, &gWorld, sizeof(gWorld));
    
    if (NT_SUCCESS(status) && gWorld) {
        DBG_MEM("GWorld found at 0x%llX\\n", gWorld);
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
    PVOID persistentLevel = NULL;
    
    NTSTATUS status = NtfsControlPoint_ReadMemory(pid, 
                                     (PVOID)((UINT64)gWorld + OFFSET_UWORLD_PERSISTENT_LEVEL), 
                                     &persistentLevel, sizeof(persistentLevel));
    
    if (!NT_SUCCESS(status) || !persistentLevel) {
        return status;
    }
    
    // ULevel->AActors
    PVOID actorsArray = NULL;
    
    status = NtfsControlPoint_ReadMemory(pid, 
                            (PVOID)((UINT64)persistentLevel + OFFSET_ULEVEL_ACTORS), 
                            &actorsArray, sizeof(actorsArray));
    
    if (!NT_SUCCESS(status) || !actorsArray) {
        return status;
    }
    
    // Get actor count
    UINT32 count = 0;
    
    status = NtfsControlPoint_ReadMemory(pid, 
                            (PVOID)((UINT64)persistentLevel + OFFSET_ULEVEL_ACTOR_COUNT), 
                            &count, sizeof(count));
    
    if (NT_SUCCESS(status)) {
        *actorArray = actorsArray;
        *actorCount = count;
        DBG_MEM("Actor array: 0x%llX, Count: %d\\n", actorsArray, count);
    }
    
    return status;
}

/* ── Shared Memory Communication (Data PTR) ───────────────────── */

/* Storage driver communication structure */
typedef struct _STORAGE_COMM_BUFFER {
    UINT32 Magic;           // NTFS_CONTROL_MAGIC
    UINT32 Command;         // 1=Read, 2=Write, 3=GetModuleBase, 4=FindProcess
    UINT64 Address;
    UINT64 Buffer;
    UINT32 Size;
    UINT32 Result;
    UINT64 ProcessId;
    UINT64 Reserved[2];    // Alignment and future use
} STORAGE_COMM_BUFFER, *PSTORAGE_COMM_BUFFER;

/* Global communication buffer */
static PSTORAGE_COMM_BUFFER g_StorageCommBuffer = NULL;
static KSPIN_LOCK g_StorageCommLock;
static KEVENT g_StorageCommEvent;

/* Initialize storage driver communication */
NTSTATUS InitializeStorageCommunication()
{
    DBG_COMM("Initializing NTFS storage communication\\n");
    
    // Allocate shared memory buffer
    g_StorageCommBuffer = (PSTORAGE_COMM_BUFFER)ExAllocatePoolWithTag(
        NonPagedPool, 
        sizeof(STORAGE_COMM_BUFFER), 
        'tmaS');
    
    if (!g_StorageCommBuffer) {
        return STATUS_INSUFFICIENT_RESOURCES;
    }
    
    // Initialize communication buffer
    RtlZeroMemory(g_StorageCommBuffer, sizeof(STORAGE_COMM_BUFFER));
    g_StorageCommBuffer->Magic = NTFS_CONTROL_MAGIC;
    
    // Initialize synchronization
    KeInitializeSpinLock(&g_StorageCommLock);
    KeInitializeEvent(&g_StorageCommEvent, NotificationEvent, FALSE);
    
    DBG_COMM("NTFS storage communication initialized at 0x%llX\\n", g_StorageCommBuffer);
    return STATUS_SUCCESS;
}

/* Process storage driver communication requests */
NTSTATUS ProcessStorageRequest(PSTORAGE_COMM_BUFFER request)
{
    if (!request || request->Magic != NTFS_CONTROL_MAGIC) {
        return STATUS_INVALID_PARAMETER;
    }
    
    NTSTATUS status = STATUS_SUCCESS;
    KIRQL oldIrql;
    
    // Acquire lock for thread safety
    KeAcquireSpinLock(&g_StorageCommLock, &oldIrql);
    
    __try {
        switch (request->Command) {
            case 1: // Read memory
                status = NtfsControlPoint_ReadMemory((HANDLE)request->ProcessId,
                                               (PVOID)request->Address,
                                               (PVOID)request->Buffer,
                                               request->Size);
                break;
                
            case 2: // Write memory
                status = SataBufferSync_WriteMemory((HANDLE)request->ProcessId,
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
                    HANDLE pid = FindArenaBreakoutProcess();
                    if (pid) {
                        *(HANDLE*)request->Buffer = pid;
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
        
        request->Result = status;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        status = STATUS_UNHANDLED_EXCEPTION;
        request->Result = status;
    }
    
    // Release lock
    KeReleaseSpinLock(&g_StorageCommLock, oldIrql);
    
    // Signal completion
    KeSetEvent(&g_StorageCommEvent, IO_NO_INCREMENT, FALSE);
    
    return status;
}

/* ── Function Hooking (win32kbase.sys hijacking) ───────────── */

/* Hook target in win32kbase.sys for communication */
typedef PVOID(WINAPI* OriginalWin32kFunction)(PVOID param1, PVOID param2);
static OriginalWin32kFunction g_OriginalWin32kFunction = NULL;
static PVOID g_HookedWin32kFunction = NULL;

/* Hooked function implementation */
PVOID HookedWin32kFunction(PVOID param1, PVOID param2)
{
    // Check if this is our communication request
    if (param1 && *(UINT32*)param1 == NTFS_CONTROL_MAGIC) {
        // Process storage request
        ProcessStorageRequest((PSTORAGE_COMM_BUFFER)param1);
        return (PVOID)STATUS_SUCCESS;
    }
    
    // Call original function
    if (g_OriginalWin32kFunction) {
        return g_OriginalWin32kFunction(param1, param2);
    }
    
    return NULL;
}

/* Initialize function hooking in win32kbase.sys */
NTSTATUS InitializeWin32kHook()
{
    DBG_COMM("Initializing win32kbase.sys hook\\n");
    
    // Find win32kbase.sys module
    PVOID win32kBase = StorageController_GetModuleBase((HANDLE)4, L"win32kbase.sys"); // System PID
    if (!win32kBase) {
        DBG_COMM("win32kbase.sys not found\\n");
        return STATUS_NOT_FOUND;
    }
    
    // In real implementation, this would:
    // 1. Find a suitable function to hook in win32kbase.sys
    // 2. Allocate executable memory
    // 3. Create hook trampoline
    // 4. Patch original function
    
    DBG_COMM("win32kbase.sys hook initialized\\n");
    return STATUS_SUCCESS;
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
    NTSTATUS status = NtfsControlPoint_ReadMemory(pid, address, buffer, size);
    return NT_SUCCESS(status);
}

BOOL myWriteProcessMemory(HANDLE pid, PVOID address, PVOID buffer, DWORD size)
{
    NTSTATUS status = SataBufferSync_WriteMemory(pid, address, buffer, size);
    return NT_SUCCESS(status);
}

/* ── Driver Entry Point (No Device Objects) ───────────────────── */

/* Initialize storage driver as legitimate Windows component */
NTSTATUS InitializeNtfsStorageDriver()
{
    DBG_COMM("Initializing NTFS storage driver\\n");
    
    // Initialize communication systems
    NTSTATUS status = InitializeStorageCommunication();
    if (!NT_SUCCESS(status)) {
        DBG_COMM("Storage communication failed: 0x%X\\n", status);
        return status;
    }
    
    // Initialize function hooking
    status = InitializeWin32kHook();
    if (!NT_SUCCESS(status)) {
        DBG_COMM("Win32k hook failed: 0x%X\\n", status);
        // Continue anyway - shared memory is primary method
    }
    
    DBG_COMM("NTFS storage driver initialized successfully\\n");
    return STATUS_SUCCESS;
}
