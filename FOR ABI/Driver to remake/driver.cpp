/*
 * driver.cpp - SataData Storage Driver for Arena Breakout Infinite (UE 4.26.1)
 *
 * Loaded by kdmapper. On entry:
 *   1. Clean all traces (PiDDB, MmUnloadedDrivers) via stealth.cpp
 *   2. Install communication bridge via hook.cpp
 *   3. Hide driver object completely
 *
 * After this, SataData driver is invisible to all standard
 * enumeration tools and ACE scanning.
 */

#include "driver.h"
#include "hook.h"
#include "stealth.h"
#include "memory.h"

/* ── Real Entry (called after DriverEntry) ───────────────────────── */

static NTSTATUS RealEntry(PDRIVER_OBJECT DriverObject)
{
    DbgPrint("[+] SataData Storage Driver - Real Entry\\n");
    DbgPrint("[+] Target: Arena Breakout Infinite (UE 4.26.1)\\n");
    DbgPrint("[+] Anti-Cheat: ACE (Tencent)\\n");
    
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
    
    /* 2. Install communication bridge via hook.cpp */
    DbgPrint("[+] Installing communication bridge\\n");
    
    if (!Hook::Install(&Hook::Handler)) {
        DbgPrint("[!] Hook installation failed - critical error\\n");
        return STATUS_UNSUCCESSFUL;
    }
    
    DbgPrint("[+] Communication bridge installed\\n");
    
    /* 3. Initialize storage communication */
    NTSTATUS status = InitializeStorageCommunication();
    if (!NT_SUCCESS(status)) {
        DbgPrint("[!] Storage communication failed: 0x%X\\n", status);
        return status;
    }
    
    /* Driver is now:
     *   - Hidden from PiDDB cache table
     *   - MmUnloadedDrivers entry cleaned
     *   - Driver section nullified
     *   - Communication via hooked function
     *   - Ready for Arena Breakout Infinite
     */
    
    DbgPrint("[+] SataData Storage Driver initialized successfully\\n");
    DbgPrint("[+] Driver is invisible to ACE (Tencent)\\n");
    DbgPrint("[+] Communication bridge active\\n");
    DbgPrint("[+] Ready for UE 4.26.1 operations\\n");
    
    return STATUS_SUCCESS;
}

/* ── DriverEntry (No Device Objects) ─────────────────────────────────── */

extern "C" NTSTATUS DriverEntry(
    PDRIVER_OBJECT  DriverObject,
    PUNICODE_STRING RegistryPath)
{
    UNREFERENCED_PARAMETER(RegistryPath);
    
    DbgPrint("[+] SataData Storage Driver Entry Point\\n");
    DbgPrint("[+] GHOST MODE - No device objects\\n");
    DbgPrint("[+] Immediate ACE bypass activation\\n");
    
    // Immediately call real entry for trace wiping
    return RealEntry(DriverObject);
}