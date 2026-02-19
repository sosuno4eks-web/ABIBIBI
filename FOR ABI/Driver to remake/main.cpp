/*
 * main.cpp - IntelGraphicsDriver for Arena Breakout Infinite (UE 4.26.1)
 *
 * Complete ACE bypass with stealth communication
 * No IoCreateDevice or IoCreateSymbolicLink
 * Target: ArenaBreakout.exe
 */

#include "definitions.h"
#include "stealth.h"
#include "memory_final.h"

/* ── Driver Entry (No Device Objects) ───────────────────────── */

extern "C" NTSTATUS DriverEntry(
    PDRIVER_OBJECT  DriverObject,
    PUNICODE_STRING RegistryPath)
{
    UNREFERENCED_PARAMETER(RegistryPath);
    
    DbgPrint("[+] IntelGraphicsDriver Entry Point\\n");
    DbgPrint("[+] Target: Arena Breakout Infinite (UE 4.26.1)\\n");
    DbgPrint("[+] Anti-Cheat: ACE (Tencent)\\n");
    
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
    
    /* Initialize stealth communication (no device objects) */
    status = InitializeStealthCommunication();
    if (!NT_SUCCESS(status)) {
        DbgPrint("[!] Stealth communication failed: 0x%X\\n", status);
        return status;
    }
    
    DbgPrint("[+] IntelGraphicsDriver loaded successfully\\n");
    DbgPrint("[+] Driver is now invisible to ACE (Tencent)\\n");
    DbgPrint("[+] No device objects created\\n");
    
    return STATUS_SUCCESS;
}
