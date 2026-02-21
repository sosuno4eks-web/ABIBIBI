#include "definitions.h"
#include "memory.h"

/* ── Missing Function Implementations ───────────────────────── */

NTSTATUS DiskSectorMirrorBlock(HANDLE sourcePid, HANDLE targetPid, PVOID sourceAddress, PVOID targetAddress, SIZE_T size)
{
    return SyncMemory(sourcePid, sourceAddress, targetAddress, size, FALSE);
}

NTSTATUS DiskSectorValidateAddress(HANDLE processId, PVOID address)
{
    if (!address) {
        return STATUS_INVALID_PARAMETER;
    }
    
    // Basic validation - check if address is in user space
    if (address > (PVOID)0x7FFFFFFFFFFF) {
        return STATUS_INVALID_PARAMETER;
    }
    
    return STATUS_SUCCESS;
}

NTSTATUS DiskSectorWriteReadOnlyMemory(PVOID address, PVOID data, SIZE_T size)
{
    StorageWriteReadOnlyMemory(address, data, size);
    return STATUS_SUCCESS;
}

/* ── Function Pointer Hijack Structures ───────────────────────── */

typedef struct _DISK_SECTOR_HOOK_CONTEXT {
    PVOID OriginalFunction;
    PVOID HookFunction;
    PVOID HookLocation;
    BOOLEAN IsInstalled;
    KSPIN_LOCK HookLock;
} DISK_SECTOR_HOOK_CONTEXT, *PDISK_SECTOR_HOOK_CONTEXT;

static DISK_SECTOR_HOOK_CONTEXT g_DiskSectorHookContext = { 0 };

/* ── Rarely Used Function Targets in win32kbase.sys ───────────── */

// Target: GreSetDesktopColor (rarely used, perfect for hijack)
#define TARGET_FUNCTION_NAME L"GreSetDesktopColor"
#define TARGET_MODULE_NAME L"win32kbase.sys"

/* ── Pattern Scanning for Function Location ───────────────────── */

PVOID DiskSectorFindFunctionInModule(PVOID moduleBase, const char* functionName)
{
    if (!moduleBase || !functionName) {
        return NULL;
    }

    __try {
        PIMAGE_DOS_HEADER dosHeader = (PIMAGE_DOS_HEADER)moduleBase;
        if (dosHeader->e_magic != IMAGE_DOS_SIGNATURE) {
            return NULL;
        }

        PIMAGE_NT_HEADERS64 ntHeaders = (PIMAGE_NT_HEADERS64)((PUCHAR)moduleBase + dosHeader->e_lfanew);
        if (ntHeaders->Signature != IMAGE_NT_SIGNATURE) {
            return NULL;
        }

        PIMAGE_EXPORT_DIRECTORY exportDir = NULL;
        PIMAGE_DATA_DIRECTORY exportDataDir = &ntHeaders->OptionalHeader.DataDirectory[IMAGE_DIRECTORY_ENTRY_EXPORT];
        
        if (exportDataDir->VirtualAddress) {
            exportDir = (PIMAGE_EXPORT_DIRECTORY)((PUCHAR)moduleBase + exportDataDir->VirtualAddress);
        }

        if (!exportDir) {
            return NULL;
        }

        PDWORD nameTable = (PDWORD)((PUCHAR)moduleBase + exportDir->AddressOfNames);
        PDWORD ordinalTable = (PDWORD)((PUCHAR)moduleBase + exportDir->AddressOfNameOrdinals);
        PDWORD functionTable = (PDWORD)((PUCHAR)moduleBase + exportDir->AddressOfFunctions);
        
        for (DWORD i = 0; i < exportDir->NumberOfNames; i++) {
            char* currentName = (char*)((PUCHAR)moduleBase + nameTable[i]);
            
            if (strcmp(currentName, functionName) == 0) {
                WORD ordinal = ordinalTable[i];
                PVOID functionAddress = (PVOID)((PUCHAR)moduleBase + functionTable[ordinal]);
                
                // Ensure it's not a forwarder
                if ((ULONG_PTR)functionAddress >= (ULONG_PTR)moduleBase && 
                    (ULONG_PTR)functionAddress < (ULONG_PTR)moduleBase + ntHeaders->OptionalHeader.SizeOfImage) {
                    return functionAddress;
                }
            }
        }
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return NULL;
    }

    return NULL;
}

/* ── SataInternalHandler Implementation ───────────────────────── */

NTSTATUS DiskSectorSataInternalHandler(PCOMMAND_PACKET packet)
{
    if (!packet) {
        return STATUS_INVALID_PARAMETER;
    }

    __try {
        // Validate packet integrity
        if (packet->Size > 0x100000) { // 1MB limit
            return STATUS_INVALID_PARAMETER;
        }

        NTSTATUS result = STATUS_SUCCESS;
        
        switch (packet->Command) {
            case STORAGE_CMD_READ_MEMORY: // 0x1
                result = SyncMemory(
                    packet->ProcessId,
                    packet->TargetAddress,
                    packet->Buffer,
                    packet->Size,
                    FALSE // Read operation
                );
                break;

            case STORAGE_CMD_WRITE_MEMORY: // 0x2
                result = SyncMemory(
                    packet->ProcessId,
                    packet->Buffer,
                    packet->TargetAddress,
                    packet->Size,
                    TRUE // Write operation
                );
                break;

            case STORAGE_CMD_GET_MODULE_BASE: // 0x3
                {
                    PVOID moduleBase = NULL;
                    result = StorageGetModuleBase(packet->ProcessId, &moduleBase);
                    if (NT_SUCCESS(result) && moduleBase) {
                        *(PVOID*)packet->Buffer = moduleBase;
                    }
                }
                break;

            case 0x4: // MIRROR_BLOCK
                packet->Flags |= COMM_FLAG_MIRROR_OPERATION;
                result = DiskSectorMirrorBlock(
                    (HANDLE)packet->ProcessId,
                    (HANDLE)packet->ModuleBase,
                    packet->SourceAddress,
                    packet->TargetAddress,
                    packet->Size
                );
                break;

            case 0x5: // VALIDATE_ADDRESS
                packet->Flags |= COMM_FLAG_VALIDATE_POINTERS;
                result = DiskSectorValidateAddress(packet->ProcessId, packet->TargetAddress);
                break;

            default:
                result = STATUS_INVALID_PARAMETER;
                break;
        }

        packet->Result = result;
        return result;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        if (packet) {
            packet->Result = STATUS_UNHANDLED_EXCEPTION;
        }
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

/* ── Hook Installation and Management ─────────────────────────── */

NTSTATUS DiskSectorInstallHook()
{
    __try {
        // Find win32kbase.sys module
        PVOID win32kBase = GetSystemModuleBase("win32kbase.sys");
        if (!win32kBase) {
            return STATUS_NOT_FOUND;
        }

        // Find target function
        PVOID targetFunction = DiskSectorFindFunctionInModule(win32kBase, "NtUserGetForegroundWindow");
        if (!targetFunction) {
            // Fallback to another rarely used function
            targetFunction = DiskSectorFindFunctionInModule(win32kBase, "NtUserGetWindowDC");
            if (!targetFunction) {
                return STATUS_PROCEDURE_NOT_FOUND;
            }
        }

        // Initialize hook context
        KeInitializeSpinLock(&g_DiskSectorHookContext.HookLock);
        g_DiskSectorHookContext.OriginalFunction = targetFunction;
        g_DiskSectorHookContext.HookFunction = DiskSectorSataInternalHandler;
        g_DiskSectorHookContext.HookLocation = targetFunction;
        g_DiskSectorHookContext.IsInstalled = TRUE;

        // Install hook using write protection bypass
        KIRQL oldIrql = KeRaiseIrqlToDpcLevel();
        
        __try {
            // Save original bytes (first 8 bytes for x64)
            RtlCopyMemory(&g_DiskSectorHookContext.OriginalFunction, 
                         targetFunction, 8);
            
            // Create jump to our handler
            UCHAR jumpCode[12];
            jumpCode[0] = 0x48; // rex.W
            jumpCode[1] = 0xB8; // mov rax, imm64
            jumpCode[2] = 0x00; // 
            jumpCode[3] = 0x00; // 
            jumpCode[4] = 0x00; // 
            jumpCode[5] = 0x00; // 
            jumpCode[6] = 0x00; // 
            jumpCode[7] = 0x00; // 
            jumpCode[8] = 0x00; // 
            jumpCode[9] = 0x00; // 
            *(UINT64*)&jumpCode[2] = (UINT64)DiskSectorSataInternalHandler;
            jumpCode[10] = 0xFF; // jmp rax
            jumpCode[11] = 0xE0; // 
            
            // Write jump
            DiskSectorWriteReadOnlyMemory(targetFunction, jumpCode, sizeof(jumpCode));
        }
        __except (EXCEPTION_EXECUTE_HANDLER) {
            KeLowerIrql(oldIrql);
            return STATUS_ACCESS_VIOLATION;
        }
        
        KeLowerIrql(oldIrql);
        return STATUS_SUCCESS;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

NTSTATUS DiskSectorUninstallHook()
{
    if (g_DiskSectorHookContext.IsInstalled) {
        __try {
            // Restore original function
            if (g_DiskSectorHookContext.OriginalFunction && g_DiskSectorHookContext.HookLocation) {
                DiskSectorWriteReadOnlyMemory(g_DiskSectorHookContext.HookLocation, 
                                         &g_DiskSectorHookContext.OriginalFunction, 8);
            }
            
            g_DiskSectorHookContext.IsInstalled = FALSE;
        }
        __except (EXCEPTION_EXECUTE_HANDLER) {
            // Silent failure
        }
    }
    
    return STATUS_SUCCESS;
}

/* ── SataProtocolStart (Main Entry Point) ─────────────────────── */

NTSTATUS SataProtocolStart()
{
    __try {
        // Install function pointer hook
        NTSTATUS status = DiskSectorInstallHook();
        if (!NT_SUCCESS(status)) {
            return status;
        }

        // Initialize communication subsystem
        status = InitializeStorageCommunication();
        if (!NT_SUCCESS(status)) {
            DiskSectorUninstallHook();
            return status;
        }

        return STATUS_SUCCESS;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}
