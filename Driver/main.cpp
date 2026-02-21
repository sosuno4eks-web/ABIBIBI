/*
 * main.cpp - Storage Driver (Windows 10 Pro 22H2 Compatible)
 *
 * GHOST DRIVER MODE - Complete stealth implementation
 * Target: ABI Process Memory Access
 * 
 * Features:
 * - No device objects, no IOCTL, complete stealth
 * - Syscall hijacking in win32kbase.sys
 * - MmCopyVirtualMemory for high-speed data transfer
 * - KeStackAttachProcess fallback for compatibility
 * - Windows 10 22H2 (Build 19045) structure offsets
 * - Generic "Storage Driver" naming for stealth
 * - Dynamic command IDs synchronized with client
 */

#pragma comment(linker, "/ENTRY:DriverEntry")
#pragma comment(linker, "/SUBSYSTEM:NATIVE")
#pragma comment(linker, "/DRIVER")

#include "definitions.h"
#include "ghost_protocol.h"

// These functions are implemented in their respective modules
extern "C" NTSTATUS SataProtocolStart(); 
extern "C" VOID FinalizeLoading(PDRIVER_OBJECT obj);

/* ── Driver Entry (Complete Ghost Mode - Storage Driver) ───── */

extern "C" NTSTATUS DriverEntry(
    PDRIVER_OBJECT  DriverObject,
    PUNICODE_STRING RegistryPath)
{
    UNREFERENCED_PARAMETER(RegistryPath);

    __try {
        // Phase 1: Complete stealth initialization
        // This must happen BEFORE any system operations
        if (!HideDriverModule(DriverObject)) {
            // Stealth failed - return success but remain hidden
            return STATUS_SUCCESS;
        }

        // Phase 2: Install SSDT hook for NtQuerySystemInformation
        // NOTE: KeServiceDescriptorTable is not exported on x64 Windows
        // This would require pattern scanning to find SSDT
        // For now, we rely on DKOM (process unlinking) only
        /*
        NTSTATUS status = InstallNtQuerySystemInformationHook();
        if (!NT_SUCCESS(status)) {
            // Continue even if SSDT hook fails - not critical
        }
        */

        // Phase 3: Install syscall hijack for Ghost Mode communication
        NTSTATUS status = InstallSyscallHijack();
        if (!NT_SUCCESS(status)) {
            // Silent failure - driver remains hidden
            return STATUS_SUCCESS;
        }

        // Phase 4: Initialize legacy communication bridge (fallback)
        status = SataProtocolStart();
        if (!NT_SUCCESS(status)) {
            // Continue even if legacy fails - Ghost Mode is primary
        }

        // Phase 5: Additional stealth hardening (optional)
        // In production, this would add more evasion layers

        // Return success only if stealth initialization succeeds
        return STATUS_SUCCESS;

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Complete silent failure - no traces left
        return STATUS_SUCCESS;
    }
}

/* ── Driver Unload (Cleanup) ───── */

extern "C" VOID DriverUnload(PDRIVER_OBJECT DriverObject)
{
    UNREFERENCED_PARAMETER(DriverObject);

    __try {
        // Remove SSDT hook (disabled on x64)
        // RemoveNtQuerySystemInformationHook();
        
        // Remove syscall hijack
        RemoveSyscallHijack();

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Silent failure
    }
}
