#include "definitions.h"
#include "memory.h"

/* ── Communication Handler Function Pointer ───────────────────── */

typedef NTSTATUS (*PCOMM_HANDLER)(PCOMM_PACKET packet);

static PCOMM_HANDLER g_CommHandler = NULL;
static PVOID g_HandlerLocation = NULL;

/* ── Communication Handler Implementation ───────────────────── */

NTSTATUS HandleCommPacket(PCOMM_PACKET packet)
{
    if (!packet) {
        return STATUS_INVALID_PARAMETER;
    }

    __try {
        // Validate packet structure
        if (packet->Size > 0x100000) { // 1MB max size
            return STATUS_INVALID_PARAMETER;
        }

        // Add timestamp for debugging
        packet->Timestamp = KeQueryTimeIncrement();

        switch (packet->Command) {
            case COMM_CMD_READ_MEMORY:
                packet->Flags |= COMM_FLAG_READ_OPERATION;
                packet->Result = StorPortLogInternalError(
                    packet->ProcessId,
                    packet->TargetAddress,
                    packet->Buffer,
                    packet->Size
                );
                break;

            case COMM_CMD_WRITE_MEMORY:
                packet->Flags |= COMM_FLAG_WRITE_OPERATION;
                packet->Result = StorPortProcessRequest(
                    packet->ProcessId,
                    packet->TargetAddress,
                    packet->Buffer,
                    packet->Size
                );
                break;

            case COMM_CMD_GET_MODULE_BASE:
                {
                    PVOID base = StorPortGetDeviceBase(packet->ProcessId);
                    if (base) {
                        *(PVOID*)packet->Buffer = base;
                        packet->Result = STATUS_SUCCESS;
                    } else {
                        packet->Result = STATUS_NOT_FOUND;
                    }
                }
                break;

            case COMM_CMD_MIRROR_BLOCK:
                packet->Flags |= COMM_FLAG_MIRROR_OPERATION;
                packet->Result = MemoryMirrorBlock(
                    (HANDLE)packet->ProcessId, // Source PID
                    (HANDLE)packet->ModuleBase, // Target PID (reuse field)
                    packet->SourceAddress,
                    packet->TargetAddress,
                    packet->Size
                );
                break;

            case COMM_CMD_VALIDATE_ADDRESS:
                packet->Flags |= COMM_FLAG_VALIDATE_POINTERS;
                // Basic validation - check if address is readable
                __try {
                    ProbeForRead(packet->TargetAddress, 1, 1);
                    packet->Result = STATUS_SUCCESS;
                }
                __except (EXCEPTION_EXECUTE_HANDLER) {
                    packet->Result = STATUS_ACCESS_VIOLATION;
                }
                break;

            default:
                packet->Result = STATUS_INVALID_PARAMETER;
                break;
        }

        packet->Flags |= COMM_FLAG_EXCEPTION_SAFE;
        return packet->Result;

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

/* ── Handler Installation in System Module ───────────────────── */

PVOID FindSuitableHandlerLocation()
{
    // Look for win32kbase.sys or other suitable system module
    PVOID win32kBase = StorPortInitialize((HANDLE)4, L"win32kbase.sys");
    if (!win32kBase) {
        // Fallback to ntoskrnl.exe
        return GetSystemModuleBase("ntoskrnl.exe");
    }
    return win32kBase;
}

NTSTATUS InstallCommunicationHandler()
{
    __try {
        // Find a suitable location in system module
        PVOID moduleBase = FindSuitableHandlerLocation();
        if (!moduleBase) {
            return STATUS_NOT_FOUND;
        }

        // In a real implementation, we would:
        // 1. Find a callable function pointer location in the module
        // 2. Replace it with our handler address
        // 3. Store original pointer for restoration
        
        // For now, we'll use a simple approach
        g_HandlerLocation = moduleBase;
        g_CommHandler = HandleCommPacket;

        // In production, this would involve:
        // - Finding unused function pointer in .data section
        // - Using WriteReadOnlyMemory to install handler
        // - Setting up proper calling conventions

        return STATUS_SUCCESS;

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

/* ── SataProtocolStart Main Function ───────────────────────── */

extern "C" NTSTATUS SataProtocolStart()
{
    __try {
        // Initialize storage communication subsystem
        NTSTATUS status = InitializeStorageCommunication();
        if (!NT_SUCCESS(status)) {
            return status;
        }

        // Install our custom communication handler
        status = InstallCommunicationHandler();
        if (!NT_SUCCESS(status)) {
            return status;
        }

        // Set up handler pointer for external invocation
        // This would be called from user mode or another system module
        if (g_CommHandler && g_HandlerLocation) {
            // Store handler pointer at known location for external access
            // In production, this would be a carefully chosen location
            // that can be safely accessed from user mode
        }

        return STATUS_SUCCESS;

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

/* ── External Access Point ───────────────────────────────────── */

// This function would be called from external modules
// In production, this would be at a known offset in system module
NTSTATUS ExternalCommInterface(PCOMM_PACKET packet)
{
    if (g_CommHandler) {
        return g_CommHandler(packet);
    }
    return STATUS_DEVICE_NOT_READY;
}
