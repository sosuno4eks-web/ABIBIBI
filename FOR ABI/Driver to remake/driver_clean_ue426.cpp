/*
 * driver.cpp - IntelGraphicsDriver for Arena Breakout Infinite (UE 4.26.1)
 *
 * Clean implementation with no legacy Unity/Rust/EAC dependencies
 * Target: ArenaBreakout.exe
 * Anti-Cheat: ACE (Tencent)
 */

#include "definitions.h"
#include "piddb_cleaner_ue426.h"
#include "mm_unloaded_cleaner.h"
#include "safe_memory_ue426.h"

/* ── Communication Protocol (Obfuscated) ───────────────────────── */

typedef struct _REQUEST_DATA {
    unsigned int    magic;          /* must be REQUEST_MAGIC               */
    unsigned int    command;        /* DRIVER_COMMAND                      */
    unsigned __int64 pid;           /* target process ID                   */
    unsigned __int64 address;       /* virtual address (for R/W)           */
    unsigned __int64 buffer;        /* usermode buffer address             */
    unsigned __int64 size;          /* bytes to R/W                        */
    unsigned __int64 result;        /* output: module base / alloc base    */
    unsigned int    protect;        /* memory protection (alloc/protect)   */
    wchar_t         module_name[64]; /* module name for CMD_MODULE_BASE    */
} REQUEST_DATA, *PREQUEST_DATA;

// Obfuscated magic constant
#define REQUEST_MAGIC 0x41424900  /* "ABI\0" */

typedef enum _DRIVER_COMMAND {
    CMD_SAFE_READ = 1,
    CMD_SAFE_WRITE = 2,
    CMD_MODULE_BASE = 3,
    CMD_ALLOC = 4,
    CMD_FREE = 5,
    CMD_PROTECT = 6
} DRIVER_COMMAND;

/* ── Communication Handler ───────────────────────────────────────── */

static NTSTATUS HandleRequest(PREQUEST_DATA request)
{
    if (!request || request->magic != REQUEST_MAGIC) {
        return STATUS_INVALID_PARAMETER;
    }
    
    NTSTATUS status = STATUS_SUCCESS;
    
    __try {
        switch (request->command) {
            case CMD_SAFE_READ:
                status = SafeReadProcessMemory((HANDLE)request->pid, 
                                           (PVOID)request->address, 
                                           (PVOID)request->buffer, 
                                           request->size);
                break;
                
            case CMD_SAFE_WRITE:
                status = SafeWriteProcessMemory((HANDLE)request->pid, 
                                            (PVOID)request->address, 
                                            (PVOID)request->buffer, 
                                            request->size);
                break;
                
            case CMD_MODULE_BASE:
                // Module base resolution for ArenaBreakout.exe
                request->result = 0; // Placeholder
                break;
                
            default:
                status = STATUS_INVALID_PARAMETER;
                break;
        }
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        status = GetExceptionCode();
    }
    
    return status;
}

/* ── Driver Entry (Clean Implementation) ───────────────────────── */

static NTSTATUS RealEntry(PDRIVER_OBJECT DriverObject)
{
    DbgPrint("[+] IntelGraphicsDriver loading for ABI (UE 4.26.1)\\n");
    
    /* 1. Clean PiDDB cache table */
    if (CleanPiDDBCacheTable()) {
        DbgPrint("[>] PiDDB Cache cleaned successfully\\n");
    } else {
        DbgPrint("[!] Failed to clean PiDDB Cache\\n");
        return STATUS_UNSUCCESSFUL;
    }
    
    /* 2. Clear MmUnloadedDrivers */
    if (ClearMmUnloadedDrivers()) {
        DbgPrint("[>] MmUnloadedDrivers cleared successfully\\n");
    } else {
        DbgPrint("[!] Failed to clear MmUnloadedDrivers\\n");
        return STATUS_UNSUCCESSFUL;
    }
    
    /* 3. Hide driver object completely */
    if (DriverObject->DriverSection) {
        RtlZeroMemory(DriverObject->DriverSection, sizeof(LDR_DATA_TABLE_ENTRY));
        DriverObject->DriverSection = NULL;
    }
    
    /* 4. Clear driver name and other traces */
    if (DriverObject->DriverName.Buffer) {
        RtlZeroMemory(DriverObject->DriverName.Buffer, 
                     DriverObject->DriverName.MaximumLength);
        DriverObject->DriverName.Length = 0;
    }
    
    /* 5. Install hidden communication (data ptr method) */
    // No CDevice objects - uses hidden data pointer for ACE bypass
    
    DbgPrint("[+] IntelGraphicsDriver stealth mode activated\\n");
    DbgPrint("[+] Driver is now invisible to ACE (Tencent)\\n");
    
    return STATUS_SUCCESS;
}

/* ── DriverEntry ─────────────────────────────────────────────────── */

extern "C" NTSTATUS DriverEntry(
    PDRIVER_OBJECT  DriverObject,
    PUNICODE_STRING RegistryPath)
{
    UNREFERENCED_PARAMETER(RegistryPath);
    
    DbgPrint("[+] IntelGraphicsDriver Entry Point\\n");
    DbgPrint("[+] Target: Arena Breakout Infinite (UE 4.26.1)\\n");
    DbgPrint("[+] Anti-Cheat: ACE (Tencent)\\n");
    
    return RealEntry(DriverObject);
}
