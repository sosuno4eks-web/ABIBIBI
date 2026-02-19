/*
 * main.cpp - NtQueryDiskInformation Ghost Driver for Arena Breakout Infinite (UE 4.26.1)
 *
 * GHOST DRIVER MODE - No device objects, no IOCTL, complete stealth
 * Communication via function pointer hijack in win32kbase.sys
 * Target: ArenaBreakout.exe
 * Anti-Cheat: Status 0x0
 * 
 * This driver is completely invisible to Status 0x0 Object Manager scans
 * Memory operations use KeStackAttachProcess only
 */

#include "definitions.h"
#include "stealth.h"
#include "memory.h"
#include "hook.h"

/* ── Driver Entry (No Device Objects - Complete Ghost Mode) ───── */

extern "C" NTSTATUS DriverEntry(
    PDRIVER_OBJECT  DriverObject,
    PUNICODE_STRING RegistryPath)
{
    UNREFERENCED_PARAMETER(RegistryPath);
    
    DbgPrint("[+] 0x900\\n"); // Entry point
    DbgPrint("[+] 0x901\\n"); // Target: Arena Breakout Infinite
    DbgPrint("[+] 0x902\\n"); // Status 0x0
    DbgPrint("[+] 0x903\\n"); // Ghost mode
    DbgPrint("[+] 0x904\\n"); // Object Manager bypass
    
    /* 1. Immediately wipe all traces via stealth functions */
    DbgPrint("[+] 0x905\\n"); // Applying stealth hardening
    
    // Clean PiDDB cache table
    if (!CleanPiDDBCacheTable()) {
        DbgPrint("[!] 0x906\\n"); // PiDDB failed
        return STATUS_UNSUCCESSFUL;
    }
    
    // Clear MmUnloadedDrivers
    if (!ClearMmUnloadedDrivers()) {
        DbgPrint("[!] 0x907\\n"); // MmUnloadedDrivers failed
        return STATUS_UNSUCCESSFUL;
    }
    
    // Nullify driver section for manual mapping support
    if (!NullifyDriverSection(DriverObject)) {
        DbgPrint("[!] 0x908\\n"); // Driver section failed
        return STATUS_UNSUCCESSFUL;
    }
    
    DbgPrint("[+] 0x909\\n"); // Traces wiped
    
    /* 2. Install function pointer hijack for communication */
    DbgPrint("[+] 0x801\\n"); // Installing registry filter
    
    if (!RegistryFilter::Install(&RegistryFilter::Handler)) {
        DbgPrint("[!] 0x802\\n"); // Registry filter failed
        return STATUS_UNSUCCESSFUL;
    }
    
    DbgPrint("[+] 0x803\\n"); // Registry filter installed
    
    /* 3. Initialize storage communication */
    NTSTATUS status = InitializeStorageCommunication();
    if (!NT_SUCCESS(status)) {
        DbgPrint("[!] 0x804\\n"); // Storage communication failed
        return status;
    }
    
    DbgPrint("[+] 0x805\\n"); // Driver loaded successfully
    DbgPrint("[+] 0x806\\n"); // Status 0x0
    DbgPrint("[+] 0x807\\n"); // Communication active
    DbgPrint("[+] 0x808\\n"); // Zero device objects
    DbgPrint("[+] 0x809\\n"); // Traces wiped
    DbgPrint("[+] 0x810\\n"); // Object Manager bypassed
    DbgPrint("[+] 0x811\\n"); // Ready for UE 4.26.1
    
    return STATUS_SUCCESS;
}
