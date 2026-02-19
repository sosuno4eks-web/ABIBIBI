/*
 * main.cpp - IntelGraphicsDriver for Arena Breakout Infinite (UE 4.26.1)
 *
 * Complete ACE bypass implementation with stealth communication
 * Target: ArenaBreakout.exe
 * Anti-Cheat: ACE (Tencent)
 */

#include "definitions.h"
#include "communication.h"
#include "stealth.h"

/* ── Driver Entry ─────────────────────────────────────────────────── */

extern "C" NTSTATUS DriverEntry(
    PDRIVER_OBJECT  DriverObject,
    PUNICODE_STRING RegistryPath)
{
    UNREFERENCED_PARAMETER(RegistryPath);
    
    DbgPrint("[+] IntelGraphicsDriver Entry Point\\n");
    DbgPrint("[+] Target: Arena Breakout Infinite (UE 4.26.1)\\n");
    DbgPrint("[+] Anti-Cheat: ACE (Tencent)\\n");
    
    /* Apply ACE stealth hardening */
    NTSTATUS status = ApplyACEStealth(DriverObject);
    if (!NT_SUCCESS(status)) {
        DbgPrint("[!] ACE stealth hardening failed: 0x%X\\n", status);
        return status;
    }
    
    /* Initialize stealth communication */
    status = InitializeStealthCommunication();
    if (!NT_SUCCESS(status)) {
        DbgPrint("[!] Stealth communication failed: 0x%X\\n", status);
        return status;
    }
    
    DbgPrint("[+] IntelGraphicsDriver loaded successfully\\n");
    DbgPrint("[+] Driver is now invisible to ACE (Tencent)\\n");
    
    return STATUS_SUCCESS;
}
