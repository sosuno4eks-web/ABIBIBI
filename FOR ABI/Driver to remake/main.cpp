/*
 * main.cpp - NetFilterUtils Driver for Arena Breakout Infinite (UE 4.26.1)
 *
 * STEALTH MODE - No IoCreateDevice or IoCreateSymbolicLink
 * Uses function hijacking in legitimate signed driver
 * Target: ArenaBreakout.exe
 * Anti-Cheat: ACE (Tencent)
 */

#include "definitions.h"
#include "stealth.h"
#include "memory_final.h"
#include "communication_new.h"

/* ── Driver Entry (No Device Objects - Stealth Mode) ───────────────── */

extern "C" NTSTATUS DriverEntry(
    PDRIVER_OBJECT  DriverObject,
    PUNICODE_STRING RegistryPath)
{
    UNREFERENCED_PARAMETER(RegistryPath);
    
    DbgPrint("[+] NetFilterUtils Driver Entry Point\\n");
    DbgPrint("[+] Target: Arena Breakout Infinite (UE 4.26.1)\\n");
    DbgPrint("[+] Anti-Cheat: ACE (Tencent)\\n");
    DbgPrint("[+] STEALTH MODE - No device objects\\n");
    
    /* Initialize stealth subsystem */
    NTSTATUS status = InitializeStealthSubsystem();
    if (!NT_SUCCESS(status)) {
        DbgPrint("[!] Stealth subsystem initialization failed: 0x%X\\n", status);
        return status;
    }
    
    /* Apply ACE stealth hardening */
    status = ApplyACEStealthHardening(DriverObject);
    if (!NT_SUCCESS(status)) {
        DbgPrint("[!] ACE stealth hardening failed: 0x%X\\n", status);
        return status;
    }
    
    /* Initialize stealth communication via function hijacking */
    status = InitializeHijackingCommunication();
    if (!NT_SUCCESS(status)) {
        DbgPrint("[!] Hijacking communication failed: 0x%X\\n", status);
        return status;
    }
    
    DbgPrint("[+] NetFilterUtils Driver loaded successfully\\n");
    DbgPrint("[+] Driver is now invisible to ACE (Tencent)\\n");
    DbgPrint("[+] Communication via hijacked function\\n");
    DbgPrint("[+] NO device objects created\\n");
    
    return STATUS_SUCCESS;
}
