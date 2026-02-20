/*
 * protocol.cpp - Storage Driver Protocol Communication
 * Windows 10 Pro 22H2 (Build 19045) Compatible
 * Target: ABI Process Memory Access
 */

#include "definitions.h"
#include "memory.h"

/* ── Storage Driver Protocol Communication Bridge ───────────────── */

typedef struct _STORAGE_COMM_CONTEXT {
    PVOID SharedMemory;
    SIZE_T SharedMemorySize;
    BOOLEAN IsInitialized;
    UNICODE_STRING TargetProcess;
    KSPIN_LOCK CommLock;
    UINT64 RequestCounter;
    UINT64 ResponseCounter;
} STORAGE_COMM_CONTEXT, *PSTORAGE_COMM_CONTEXT;

static STORAGE_COMM_CONTEXT g_StorageCommContext = { 0 };

/* ── Communication Handler Function Pointer ───────────────────── */

typedef NTSTATUS (*PSTORAGE_COMM_HANDLER)(PCOMM_PACKET packet);

static PSTORAGE_COMM_HANDLER g_StorageCommHandler = NULL;
static PVOID g_HandlerLocation = NULL;

/* ── Storage Driver Communication Handler Implementation ───────── */

NTSTATUS StorageCommHandler(PCOMM_PACKET packet)
{
    if (!packet) {
        return STATUS_INVALID_PARAMETER;
    }

    __try {
        // Validate packet structure
        if (packet->Size > MAX_MEMORY_TRANSFER_SIZE) {
            return STATUS_INVALID_PARAMETER;
        }

        // Add timestamp and increment counters
        packet->Timestamp = KeQueryTimeIncrement();
        packet->Flags |= COMM_FLAG_EXCEPTION_SAFE;
        InterlockedIncrement64((LONG64*)&g_StorageCommContext.RequestCounter);

        NTSTATUS result = SataInternalHandler(packet);

        InterlockedIncrement64((LONG64*)&g_StorageCommContext.ResponseCounter);
        return result;

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        if (packet) {
            packet->Result = STATUS_UNHANDLED_EXCEPTION;
        }
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

/* ── Handler Installation in System Module ───────────────────── */

PVOID StorageFindHandlerLocation()
{
    // Look for win32kbase.sys or other suitable system module
    PVOID win32kBase = GetSystemModuleBase("win32kbase.sys");
    if (!win32kBase) {
        // Fallback to ntoskrnl.exe
        return GetSystemModuleBase("ntoskrnl.exe");
    }
    return win32kBase;
}

NTSTATUS StorageInstallCommunicationHandler()
{
    __try {
        // Find a suitable location in system module
        PVOID moduleBase = StorageFindHandlerLocation();
        if (!moduleBase) {
            return STATUS_NOT_FOUND;
        }

        // In a real implementation, we would:
        // 1. Find a callable function pointer location in the module
        // 2. Replace it with our handler address
        // 3. Store original pointer for restoration
        
        // For now, we'll use a simple approach
        g_HandlerLocation = moduleBase;
        g_StorageCommHandler = StorageCommHandler;

        // In production, this would involve:
        // - Finding unused function pointer in .data section
        // - Using StorageWriteReadOnlyMemory to install handler
        // - Setting up proper calling conventions

        return STATUS_SUCCESS;

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

/* ── Shared Memory Management ───────────────────────────────── */

NTSTATUS StorageCreateSharedMemory(SIZE_T size)
{
    __try {
        PVOID sharedMemory = ExAllocatePoolWithTag(NonPagedPool, size, 'kcuS');
        if (!sharedMemory) {
            return STATUS_INSUFFICIENT_RESOURCES;
        }

        RtlZeroMemory(sharedMemory, size);

        g_StorageCommContext.SharedMemory = sharedMemory;
        g_StorageCommContext.SharedMemorySize = size;
        g_StorageCommContext.IsInitialized = TRUE;

        KeInitializeSpinLock(&g_StorageCommContext.CommLock);
        RtlInitUnicodeString(&g_StorageCommContext.TargetProcess, L"ABI.exe");

        return STATUS_SUCCESS;

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

VOID StorageDestroySharedMemory()
{
    __try {
        if (g_StorageCommContext.SharedMemory) {
            ExFreePoolWithTag(g_StorageCommContext.SharedMemory, 'kcuS');
            g_StorageCommContext.SharedMemory = NULL;
        }

        g_StorageCommContext.IsInitialized = FALSE;
        g_StorageCommContext.SharedMemorySize = 0;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Silent failure
    }
}

/* ── Storage Communication Initialization ───────────────────────── */

NTSTATUS InitializeStorageCommunication()
{
    __try {
        // Create shared memory for communication
        NTSTATUS status = StorageCreateSharedMemory(0x10000); // 64KB
        if (!NT_SUCCESS(status)) {
            return status;
        }

        // Install communication handler
        status = StorageInstallCommunicationHandler();
        if (!NT_SUCCESS(status)) {
            StorageDestroySharedMemory();
            return status;
        }

        return STATUS_SUCCESS;

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

/* ── SataProtocolStart Main Function (Storage Driver) ─────── */

extern "C" NTSTATUS SataProtocolStart()
{
    __try {
        // Initialize storage communication subsystem
        NTSTATUS status = InitializeStorageCommunication();
        if (!NT_SUCCESS(status)) {
            return status;
        }

        // Install our custom communication handler
        status = StorageInitializeHijackedCommunication();
        if (!NT_SUCCESS(status)) {
            return status;
        }

        // Set up handler pointer for external invocation
        // This would be called from user mode or another system module
        if (g_StorageCommHandler && g_HandlerLocation) {
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
NTSTATUS StorageExternalCommInterface(PCOMM_PACKET packet)
{
    if (g_StorageCommHandler) {
        return g_StorageCommHandler(packet);
    }
    return STATUS_DEVICE_NOT_READY;
}

/* ── Communication Statistics ─────────────────────────────────── */

typedef struct _STORAGE_COMM_STATS {
    UINT64 TotalRequests;
    UINT64 TotalResponses;
    UINT64 FailedRequests;
    UINT64 AverageResponseTime;
    SIZE_T SharedMemoryUsage;
} STORAGE_COMM_STATS, *PSTORAGE_COMM_STATS;

NTSTATUS StorageGetCommunicationStats(PSTORAGE_COMM_STATS stats)
{
    if (!stats) {
        return STATUS_INVALID_PARAMETER;
    }

    __try {
        stats->TotalRequests = g_StorageCommContext.RequestCounter;
        stats->TotalResponses = g_StorageCommContext.ResponseCounter;
        stats->FailedRequests = 0; // Would track failures in production
        stats->AverageResponseTime = 0; // Would calculate in production
        stats->SharedMemoryUsage = g_StorageCommContext.SharedMemorySize;

        return STATUS_SUCCESS;

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}
