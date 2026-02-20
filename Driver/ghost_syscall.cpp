/*
 * ghost_syscall.cpp - Syscall Hijacking Implementation
 * 
 * Implements syscall hijacking in win32kbase.sys for Ghost Mode communication
 * NO IOCTLs, NO Device Objects - Pure syscall-based communication
 * 
 * Target: Windows 10 22H2 (Build 19045)
 */

#include "definitions.h"
#include "ghost_protocol.h"

// Global state
PFN_ORIGINAL_SYSCALL g_OriginalSyscallHandler = NULL;
static PVOID g_HijackedSyscallAddress = NULL;
static BOOLEAN g_SyscallHijackInstalled = FALSE;

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * SYSCALL TABLE MANIPULATION
 * ═══════════════════════════════════════════════════════════════════════════
 */

// Find win32kbase.sys base address
static PVOID FindWin32kBase() {
    __try {
        UNICODE_STRING moduleName;
        RtlInitUnicodeString(&moduleName, L"\\SystemRoot\\System32\\win32kbase.sys");
        
        // In production, use MmGetSystemRoutineAddress or similar
        // For now, return a placeholder
        return NULL;
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return NULL;
    }
}

// Write to read-only memory (for patching)
static NTSTATUS WriteReadOnlyMemory(PVOID destination, PVOID source, SIZE_T size) {
    __try {
        // Disable write protection
        KIRQL irql = KeRaiseIrqlToDpcLevel();
        UINT64 cr0 = __readcr0();
        __writecr0(cr0 & ~0x10000); // Clear WP bit
        
        // Copy memory
        RtlCopyMemory(destination, source, size);
        
        // Re-enable write protection
        __writecr0(cr0);
        KeLowerIrql(irql);
        
        return STATUS_SUCCESS;
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * HIJACKED SYSCALL HANDLER
 * ═══════════════════════════════════════════════════════════════════════════
 */

NTSTATUS NTAPI HijackedSyscallHandler(PMUTATED_PACKET packet) {
    INSERT_DRIVER_JUNK();
    
    __try {
        // Validate packet from user-mode
        if (!packet) {
            return STATUS_INVALID_PARAMETER;
        }
        
        INSERT_DRIVER_JUNK();
        
        // Probe user-mode pointer
        if (ExGetPreviousMode() == UserMode) {
            ProbeForRead(packet, sizeof(MUTATED_PACKET), sizeof(ULONG));
        }
        
        INSERT_DRIVER_JUNK();
        
        // Handle the packet
        NTSTATUS status = HandleMutatedPacket(packet);
        
        INSERT_DRIVER_JUNK();
        
        return status;
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * INSTALL SYSCALL HIJACK
 * ═══════════════════════════════════════════════════════════════════════════
 */

NTSTATUS InstallSyscallHijack() {
    __try {
        if (g_SyscallHijackInstalled) {
            return STATUS_SUCCESS;
        }
        
        INSERT_DRIVER_JUNK();
        
        // Find win32kbase.sys
        PVOID win32kBase = FindWin32kBase();
        if (!win32kBase) {
            // Fallback: use a known offset in ntoskrnl.exe
            // In production, this would be more sophisticated
            return STATUS_NOT_FOUND;
        }
        
        INSERT_DRIVER_JUNK();
        
        // Calculate syscall table offset
        // This is a placeholder - in production, you would:
        // 1. Parse PE headers to find .data section
        // 2. Locate syscall table (KeServiceDescriptorTable)
        // 3. Find an unused or rarely-used syscall
        // 4. Replace its handler with ours
        
        PVOID syscallTableEntry = (PVOID)((ULONG_PTR)win32kBase + 0x1337000);
        
        INSERT_DRIVER_JUNK();
        
        // Save original handler
        g_OriginalSyscallHandler = *(PFN_ORIGINAL_SYSCALL*)syscallTableEntry;
        g_HijackedSyscallAddress = syscallTableEntry;
        
        INSERT_DRIVER_JUNK();
        
        // Install our handler
        PVOID newHandler = (PVOID)HijackedSyscallHandler;
        NTSTATUS status = WriteReadOnlyMemory(
            syscallTableEntry,
            &newHandler,
            sizeof(PVOID)
        );
        
        if (!NT_SUCCESS(status)) {
            return status;
        }
        
        INSERT_DRIVER_JUNK();
        
        // Leave a marker for client to find
        // This tells the client which syscall we hijacked
        PVOID markerAddress = (PVOID)((ULONG_PTR)win32kBase + 0x1337000);
        UINT32 marker = 0xDEADBEEF;
        WriteReadOnlyMemory(markerAddress, &marker, sizeof(marker));
        
        UINT32 syscallIndex = 0x1000; // Default syscall index
        WriteReadOnlyMemory(
            (PVOID)((ULONG_PTR)markerAddress + 4),
            &syscallIndex,
            sizeof(syscallIndex)
        );
        
        INSERT_DRIVER_JUNK();
        
        g_SyscallHijackInstalled = TRUE;
        
        return STATUS_SUCCESS;
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * REMOVE SYSCALL HIJACK
 * ═══════════════════════════════════════════════════════════════════════════
 */

VOID RemoveSyscallHijack() {
    __try {
        if (!g_SyscallHijackInstalled || !g_HijackedSyscallAddress) {
            return;
        }
        
        INSERT_DRIVER_JUNK();
        
        // Restore original handler
        if (g_OriginalSyscallHandler) {
            WriteReadOnlyMemory(
                g_HijackedSyscallAddress,
                &g_OriginalSyscallHandler,
                sizeof(PVOID)
            );
        }
        
        INSERT_DRIVER_JUNK();
        
        g_SyscallHijackInstalled = FALSE;
        g_HijackedSyscallAddress = NULL;
        g_OriginalSyscallHandler = NULL;
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Silent failure
    }
}
