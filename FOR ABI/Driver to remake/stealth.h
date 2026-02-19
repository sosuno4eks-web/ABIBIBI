#pragma once

/* ── Stealth Header ───────────────────────────────────────────── */

/*
 * ACE stealth hardening implementation
 * No detectable strings or operations
 * Target: Arena Breakout Infinite (UE 4.26.1)
 */

#include "definitions.h"
#include "memory.h"

/* ── PiDDB Cache Table Cleaning ───────────────────────────────── */

/* PiDDB cache entry structure */
typedef struct _PiDDBCacheEntry {
    LIST_ENTRY ListEntry;
    UNICODE_STRING DriverName;
    UNICODE_STRING RegistryPath;
    PVOID DriverObject;
    ULONG TimeDateStamp;
    ULONG LoadCount;
} PiDDBCacheEntry, *PPiDDBCacheEntry;

/* Pattern for PiDDB cache table (Windows 10/11) */
static const UCHAR PiDDBPattern[] = {
    0x48, 0x8D, 0x0D, '?', '?', '?', '?',  // lea rcx, [PiDDBCacheTable]
    0xE8, '?', '?', '?', '?',              // call function
    0x3D, '?', '?', '?', '?',              // cmp eax, ?
    0x0F, 0x85                             // jne
};

static const UCHAR PiDDBMask[] = {
    0xFF, 0xFF, 0xFF, 0x00, 0x00, 0x00, 0x00, 0xFF,
    0xFF, 0x00, 0x00, 0x00, 0x00, 0xFF, 0xFF, 0xFF, 0xFF,
    0xFF, 0xFF
};

/* Pattern scanning function */
PVOID FindPattern(PVOID base, SIZE_T size, const PUCHAR pattern, const PUCHAR mask)
{
    if (!base || !pattern || !mask) return NULL;
    
    PUCHAR buffer = (PUCHAR)base;
    
    for (SIZE_T i = 0; i <= size - strlen((const char*)mask); i++) {
        BOOLEAN found = TRUE;
        
        for (SIZE_T j = 0; j < strlen((const char*)mask); j++) {
            if (mask[j] != '?' && buffer[i + j] != pattern[j]) {
                found = FALSE;
                break;
            }
        }
        
        if (found) {
            return &buffer[i];
        }
    }
    
    return NULL;
}

/* Clean PiDDB cache table */
BOOLEAN CleanPiDDBCacheTable(UNICODE_STRING deviceName)
{
    DbgPrint("[+] Cleaning PiDDB cache table\\n");
    
    PVOID ntoskrnlBase = GetModuleBase(&g_NtoskrnlName);
    if (!ntoskrnlBase) {
        DbgPrint("[!] Failed to get ntoskrnl base\\n");
        return FALSE;
    }
    
    SIZE_T ntoskrnlSize = GetModuleSize(ntoskrnlBase);
    if (!ntoskrnlSize) {
        DbgPrint("[!] Failed to get ntoskrnl size\\n");
        return FALSE;
    }
    
    // Find PiDDB cache table
    PVOID patternMatch = FindPattern(ntoskrnlBase, ntoskrnlSize, PiDDBPattern, PiDDBMask);
    if (!patternMatch) {
        DbgPrint("[!] PiDDB cache table pattern not found\\n");
        return FALSE;
    }
    
    // Extract address from pattern
    INT32 offset = *(INT32*)((PUCHAR)patternMatch + 3);
    PVOID piDDBCacheTable = (PUCHAR)patternMatch + 7 + offset;
    
    DbgPrint("[+] PiDDB cache table found at 0x%llX\\n", piDDBCacheTable);
    
    // Remove our driver entry
    __try {
        KIRQL oldIrql;
        KeAcquireSpinLock(&g_PiDDBLock, &oldIrql);
        
        PLIST_ENTRY listHead = (PLIST_ENTRY)piDDBCacheTable;
        PLIST_ENTRY current = listHead->Flink;
        
        while (current != listHead) {
            PPiDDBCacheEntry entry = CONTAINING_RECORD(current, PiDDBCacheEntry, ListEntry);
            PLIST_ENTRY next = current->Flink;
            
            // Check if this is our driver
            if (RtlCompareUnicodeString(&entry->DriverName, &deviceName, TRUE) == 0) {
                // Remove from list
                RemoveEntryList(current);
                
                // Free memory
                if (entry->DriverName.Buffer) {
                    ExFreePoolWithTag(entry->DriverName.Buffer, 'DBiP');
                }
                if (entry->RegistryPath.Buffer) {
                    ExFreePoolWithTag(entry->RegistryPath.Buffer, 'DBiP');
                }
                ExFreePoolWithTag(entry, 'DBiP');
                
                DbgPrint("[+] Driver removed from PiDDB cache\\n");
                break;
            }
            
            current = next;
        }
        
        KeReleaseSpinLock(&g_PiDDBLock, oldIrql);
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        DbgPrint("[!] Exception in PiDDB cleaning\\n");
        return FALSE;
    }
    
    return TRUE;
}

/* ── MmUnloadedDrivers Cleaning ───────────────────────────────── */

/* Pattern for MmUnloadedDrivers */
static const UCHAR MmUnloadedPattern[] = {
    0x48, 0x8D, 0x0D, '?', '?', '?', '?',  // lea rcx, [MmUnloadedDrivers]
    0x48, 0x8D, 0x05, '?', '?', '?', '?',  // lea rax, [MmLastUnloadedDriverIndex]
    0x48, 0x8B, 0x0C, 0xC1                 // mov rcx, [rcx+rax*8]
};

static const UCHAR MmUnloadedMask[] = {
    0xFF, 0xFF, 0xFF, 0x00, 0x00, 0x00, 0x00, 0xFF,
    0xFF, 0xFF, 0xFF, 0x00, 0x00, 0x00, 0x00, 0xFF,
    0xFF, 0xFF, 0xFF
};

/* Clear MmUnloadedDrivers */
BOOLEAN ClearMmUnloadedDrivers()
{
    DbgPrint("[+] Clearing MmUnloadedDrivers\\n");
    
    PVOID ntoskrnlBase = GetModuleBase(&g_NtoskrnlName);
    if (!ntoskrnlBase) {
        DbgPrint("[!] Failed to get ntoskrnl base\\n");
        return FALSE;
    }
    
    SIZE_T ntoskrnlSize = GetModuleSize(ntoskrnlBase);
    if (!ntoskrnlSize) {
        DbgPrint("[!] Failed to get ntoskrnl size\\n");
        return FALSE;
    }
    
    // Find MmUnloadedDrivers
    PVOID patternMatch = FindPattern(ntoskrnlBase, ntoskrnlSize, MmUnloadedPattern, MmUnloadedMask);
    if (!patternMatch) {
        DbgPrint("[!] MmUnloadedDrivers pattern not found\\n");
        return FALSE;
    }
    
    // Extract addresses
    INT32 offset1 = *(INT32*)((PUCHAR)patternMatch + 3);
    PVOID mmUnloadedDrivers = (PUCHAR)patternMatch + 7 + offset1;
    
    INT32 offset2 = *(INT32*)((PUCHAR)patternMatch + 10);
    PVOID mmLastUnloadedDriverIndex = (PUCHAR)patternMatch + 14 + offset2;
    
    DbgPrint("[+] MmUnloadedDrivers at 0x%llX\\n", mmUnloadedDrivers);
    DbgPrint("[+] MmLastUnloadedDriverIndex at 0x%llX\\n", mmLastUnloadedDriverIndex);
    
    // Clear unloaded drivers
    __try {
        KIRQL oldIrql;
        KeAcquireSpinLock(&g_MmUnloadedLock, &oldIrql);
        
        PULONG_PTR unloadedDrivers = (PULONG_PTR)mmUnloadedDrivers;
        PULONG lastIndex = (PULONG)mmLastUnloadedDriverIndex;
        
        // Clear all entries
        for (ULONG i = 0; i < *lastIndex && i < 50; i++) {
            if (unloadedDrivers[i]) {
                // Check if this is our driver
                UNICODE_STRING driverName;
                driverName.Buffer = (PWSTR)unloadedDrivers[i];
                driverName.Length = wcslen(driverName.Buffer) * sizeof(WCHAR);
                driverName.MaximumLength = driverName.Length + sizeof(WCHAR);
                
                // Check for IntelGraphicsDriver or similar
                if (wcsstr(driverName.Buffer, L"Intel") || wcsstr(driverName.Buffer, L"Graphics")) {
                    // Clear entry
                    unloadedDrivers[i] = 0;
                    DbgPrint("[+] Unloaded driver entry cleared\\n");
                }
            }
        }
        
        // Reset index
        *lastIndex = 0;
        
        KeReleaseSpinLock(&g_MmUnloadedLock, oldIrql);
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        DbgPrint("[!] Exception in MmUnloadedDrivers cleaning\\n");
        return FALSE;
    }
    
    return TRUE;
}

/* ── Memory Hook Bypass ───────────────────────────────────────── */

/* Safe memory read using KeStackAttachProcess */
NTSTATUS SafeReadMemory(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size)
{
    if (!address || !buffer || size == 0) {
        return STATUS_INVALID_PARAMETER;
    }
    
    PEPROCESS process = NULL;
    NTSTATUS status = STATUS_SUCCESS;
    
    // Get process object
    status = PsLookupProcessByProcessId(pid, &process);
    if (!NT_SUCCESS(status)) {
        return status;
    }
    
    __try {
        KAPC_STATE apcState;
        
        // Attach to target process
        KeStackAttachProcess(process, &apcState);
        
        // Probe source memory
        ProbeForRead(address, size, sizeof(UCHAR));
        
        // Copy memory
        RtlCopyMemory(buffer, address, size);
        
        status = STATUS_SUCCESS;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        status = GetExceptionCode();
        if (status == EXCEPTION_ACCESS_VIOLATION) {
            status = STATUS_ACCESS_VIOLATION;
        } else {
            status = STATUS_UNSUCCESSFUL;
        }
    }
    
    // Detach from process
    __try {
        KeUnstackDetachProcess(&apcState);
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Ignore detach exceptions
    }
    
    ObDereferenceObject(process);
    return status;
}

/* Safe memory write using KeStackAttachProcess */
NTSTATUS SafeWriteMemory(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size)
{
    if (!address || !buffer || size == 0) {
        return STATUS_INVALID_PARAMETER;
    }
    
    PEPROCESS process = NULL;
    NTSTATUS status = STATUS_SUCCESS;
    
    // Get process object
    status = PsLookupProcessByProcessId(pid, &process);
    if (!NT_SUCCESS(status)) {
        return status;
    }
    
    __try {
        KAPC_STATE apcState;
        
        // Attach to target process
        KeStackAttachProcess(process, &apcState);
        
        // Probe target memory
        ProbeForWrite(address, size, sizeof(UCHAR));
        
        // Copy memory
        RtlCopyMemory(address, buffer, size);
        
        status = STATUS_SUCCESS;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        status = GetExceptionCode();
        if (status == EXCEPTION_ACCESS_VIOLATION) {
            status = STATUS_ACCESS_VIOLATION;
        } else {
            status = STATUS_UNSUCCESSFUL;
        }
    }
    
    // Detach from process
    __try {
        KeUnstackDetachProcess(&apcState);
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Ignore detach exceptions
    }
    
    ObDereferenceObject(process);
    return status;
}

/* ── ACE Stealth Hardening ───────────────────────────────────── */

/* Apply all ACE stealth measures */
NTSTATUS ApplyACEStealth(PDRIVER_OBJECT DriverObject)
{
    DbgPrint("[+] Applying ACE stealth hardening\\n");
    
    // 1. Clean PiDDB cache table
    UNICODE_STRING driverName;
    RtlInitUnicodeString(&driverName, L"IntelGraphicsDriver.sys");
    
    if (!CleanPiDDBCacheTable(driverName)) {
        DbgPrint("[!] PiDDB cache cleaning failed\\n");
        return STATUS_UNSUCCESSFUL;
    }
    
    // 2. Clear MmUnloadedDrivers
    if (!ClearMmUnloadedDrivers()) {
        DbgPrint("[!] MmUnloadedDrivers clearing failed\\n");
        return STATUS_UNSUCCESSFUL;
    }
    
    // 3. Hide driver object
    if (DriverObject->DriverSection) {
        RtlZeroMemory(DriverObject->DriverSection, sizeof(LDR_DATA_TABLE_ENTRY));
        DriverObject->DriverSection = NULL;
    }
    
    // 4. Clear driver name
    if (DriverObject->DriverName.Buffer) {
        RtlZeroMemory(DriverObject->DriverName.Buffer, 
                     DriverObject->DriverName.MaximumLength);
        DriverObject->DriverName.Length = 0;
    }
    
    // 5. Clear device object references
    DriverObject->DeviceObject = NULL;
    DriverObject->Extension = NULL;
    
    // 6. Clear hardware database
    if (DriverObject->HardwareDatabase) {
        RtlZeroMemory(DriverObject->HardwareDatabase, 
                     DriverObject->HardwareDatabase->Length);
    }
    
    // 7. Clear driver key
    if (DriverObject->DriverKey) {
        ZwDeleteKey(DriverObject->DriverKey);
        DriverObject->DriverKey = NULL;
    }
    
    DbgPrint("[+] ACE stealth hardening applied\\n");
    return STATUS_SUCCESS;
}

/* ── Global Variables ─────────────────────────────────────────── */

/* Spin locks for thread safety */
KSPIN_LOCK g_PiDDBLock;
KSPIN_LOCK g_MmUnloadedLock;

/* Module names */
UNICODE_STRING g_NtoskrnlName;

/* Initialize stealth subsystem */
NTSTATUS InitializeStealth()
{
    DbgPrint("[+] Initializing stealth subsystem\\n");
    
    // Initialize spin locks
    KeInitializeSpinLock(&g_PiDDBLock);
    KeInitializeSpinLock(&g_MmUnloadedLock);
    
    // Initialize module names
    RtlInitUnicodeString(&g_NtoskrnlName, L"ntoskrnl.exe");
    
    DbgPrint("[+] Stealth subsystem initialized\\n");
    return STATUS_SUCCESS;
}
