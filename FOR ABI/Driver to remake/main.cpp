/*
 * main.cpp - NtQueryDiskInformation Ghost Driver for Arena Breakout Infinite (UE 4.26.1)
 *
 * GHOST DRIVER MODE - No device objects, no IOCTL, complete stealth
 * Communication via function pointer hijack in win32kbase.sys
 * Target: ArenaBreakout.exe
 * Anti-Cheat: ACE (Tencent)
 * 
 * This driver is completely invisible to ACE Object Manager scans
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
    
    DbgPrint("[+] NtQueryDiskInformation Ghost Driver Entry Point\\n");
    DbgPrint("[+] Target: Arena Breakout Infinite (UE 4.26.1)\\n");
    DbgPrint("[+] Anti-Cheat: ACE (Tencent)\\n");
    DbgPrint("[+] GHOST MODE - No Device Objects\\n");
    DbgPrint("[+] ACE Object Manager scan bypass\\n");
    
    /* 1. Immediately wipe all traces via stealth functions */
    DbgPrint("[+] Applying ACE stealth hardening\\n");
    
    // Clean PiDDB cache table
    if (!CleanPiDDBCacheTable()) {
        DbgPrint("[!] PiDDB cache cleaning failed\\n");
        return STATUS_UNSUCCESSFUL;
    }
    
    // Clear MmUnloadedDrivers
    if (!ClearMmUnloadedDrivers()) {
        DbgPrint("[!] MmUnloadedDrivers clearing failed\\n");
        return STATUS_UNSUCCESSFUL;
    }
    
    // Nullify driver section for manual mapping support
    if (!NullifyDriverSection(DriverObject)) {
        DbgPrint("[!] Driver section nullification failed\\n");
        return STATUS_UNSUCCESSFUL;
    }
    
    DbgPrint("[+] All traces wiped successfully\\n");
    
    /* 2. Install function pointer hijack for communication */
    DbgPrint("[+] Installing function pointer hijack\\n");
    
    if (!Hook::Install(&Hook::Handler)) {
        DbgPrint("[!] Function pointer hijack failed - critical error\\n");
        return STATUS_UNSUCCESSFUL;
    }
    
    DbgPrint("[+] Function pointer hijack installed\\n");
    
    /* 3. Initialize storage communication */
    NTSTATUS status = InitializeStorageCommunication();
    if (!NT_SUCCESS(status)) {
        DbgPrint("[!] Storage communication failed: 0x%X\\n", status);
        return status;
    }
    
    DbgPrint("[+] NtQueryDiskInformation Ghost Driver loaded successfully\\n");
    DbgPrint("[+] Driver is now INVISIBLE to ACE (Tencent)\\n");
    DbgPrint("[+] Communication via function pointer hijack in win32kbase.sys\\n");
    DbgPrint("[+] ZERO device objects created\\n");
    DbgPrint("[+] ALL traces wiped from PiDDB and MmUnloadedDrivers\\n");
    DbgPrint("[+] DriverSection and LDR_DATA_TABLE_ENTRY nullified\\n");
    DbgPrint("[+] ACE Object Manager scan completely bypassed\\n");
    DbgPrint("[+] Ghost Driver active - ready for UE 4.26.1\\n");
    
    return STATUS_SUCCESS;
}
