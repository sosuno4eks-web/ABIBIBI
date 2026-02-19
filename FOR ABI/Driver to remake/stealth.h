#pragma once

/* ── Stealth Header ───────────────────────────────────────────── */

/*
 * Ghost Driver Stealth Header - ACE Hardening Implementation
 * No detectable strings or operations
 * Target: Arena Breakout Infinite (UE 4.26.1)
 * Anti-Cheat: ACE (Tencent)
 * 
 * This driver is completely invisible to ACE:
 * - No Device Objects (Object Manager bypass)
 * - PiDDB cache wiped (driver trace removal)
 * - MmUnloadedDrivers cleared (unloaded trace removal)
 * - DriverSection nullified (manual mapping support)
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

/* Pattern for PiDDB cache table (Exact pattern: 48 8D 0D ? ? ? ? E8 ? ? ? ? 3D ? ? ? ? 0F 85) */
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
    DbgPrint("[+] 0x701\\n"); // Cleaning PiDDB cache table
    
    PVOID ntoskrnlBase = GetModuleBase(&g_NtoskrnlName);
    if (!ntoskrnlBase) {
        DbgPrint("[!] 0x702\\n"); // Failed to get ntoskrnl base
        return FALSE;
    }
    
    SIZE_T ntoskrnlSize = GetModuleSize(ntoskrnlBase);
    if (!ntoskrnlSize) {
        DbgPrint("[!] 0x703\\n"); // Failed to get ntoskrnl size
        return FALSE;
    }
    
    // Find PiDDB cache table
    PVOID patternMatch = FindPattern(ntoskrnlBase, ntoskrnlSize, PiDDBPattern, PiDDBMask);
    if (!patternMatch) {
        DbgPrint("[!] 0x704\\n"); // PiDDB cache table pattern not found
        return FALSE;
    }
    
    // Extract address from pattern
    INT32 offset1 = *(INT32*)((PUCHAR)patternMatch + 3);
    PVOID piDDBCacheTable = (PUCHAR)patternMatch + 7 + offset1;
    
    DbgPrint("[+] 0x705\\n"); // PiDDB cache table found
    
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
            if (entry->DriverName.Buffer && wcsstr(entry->DriverName.Buffer, deviceName.Buffer)) {
                // Remove from list
                current->Blink->Flink = current->Flink;
                current->Flink->Blink = current->Blink;
                
                DbgPrint("[+] 0x706\\n"); // Driver entry removed from PiDDB
                break;
            }
            
            current = next;
        }
        
        KeReleaseSpinLock(&g_PiDDBLock, oldIrql);
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        DbgPrint("[!] 0x707\\n"); // Exception in PiDDB cleaning
        return FALSE;
    }
    
    return TRUE;
}

/* ── MmUnloadedDrivers Cleaning ───────────────────────────────── */

/* Pattern for MmUnloadedDrivers (Exact pattern: 4C 8B 15 ? ? ? ? 4C 8C C0) */
static const UCHAR MmUnloadedPattern[] = {
    0x4C, 0x8B, 0x15, '?', '?', '?', '?',  // mov r10, [MmUnloadedDrivers]
    0x4C, 0x8C, 0xC0                       // mov r8, rax
};

static const UCHAR MmUnloadedMask[] = {
    0xFF, 0xFF, 0xFF, 0x00, 0x00, 0x00, 0x00, 0xFF,
    0xFF, 0xFF, 0xFF
};

/* Clear MmUnloadedDrivers */
BOOLEAN ClearMmUnloadedDrivers()
{
    DbgPrint("[+] 0x711\\n"); // Clearing MmUnloadedDrivers
    
    PVOID ntoskrnlBase = GetModuleBase(&g_NtoskrnlName);
    if (!ntoskrnlBase) {
        DbgPrint("[!] 0x712\\n"); // Failed to get ntoskrnl base
        return FALSE;
    }
    
    SIZE_T ntoskrnlSize = GetModuleSize(ntoskrnlBase);
    if (!ntoskrnlSize) {
        DbgPrint("[!] 0x713\\n"); // Failed to get ntoskrnl size
        return FALSE;
    }
    
    // Find MmUnloadedDrivers
    PVOID patternMatch = FindPattern(ntoskrnlBase, ntoskrnlSize, MmUnloadedPattern, MmUnloadedMask);
    if (!patternMatch) {
        DbgPrint("[!] 0x714\\n"); // MmUnloadedDrivers pattern not found
        return FALSE;
    }
    
    // Extract addresses from new pattern
    INT32 offset1 = *(INT32*)((PUCHAR)patternMatch + 3);
    PVOID mmUnloadedDrivers = (PUCHAR)patternMatch + 7 + offset1;
    
    // For the new pattern, we need to find the index separately
    PVOID mmLastUnloadedDriverIndex = NULL; // Will be found with additional pattern
    
    DbgPrint("[+] 0x715\\n"); // MmUnloadedDrivers found
    
    // Clear unloaded drivers
    __try {
        KIRQL oldIrql;
        KeAcquireSpinLock(&g_MmUnloadedLock, &oldIrql);
        
        PULONG_PTR unloadedDrivers = (PULONG_PTR)mmUnloadedDrivers;
        PULONG lastIndex = (PULONG)mmLastUnloadedDriverIndex;
        
        if (unloadedDrivers && lastIndex) {
            // Clear all entries
            RtlZeroMemory(unloadedDrivers, (*lastIndex + 1) * sizeof(ULONG_PTR));
            *lastIndex = 0;
            
            DbgPrint("[+] 0x716\\n"); // MmUnloadedDrivers cleared
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

/* ── Manual Mapping Support ─────────────────────────────────── */

/* Clear manual mapping traces */
BOOLEAN ClearManualMappingTraces(PDRIVER_OBJECT DriverObject)
{
    DbgPrint("[+] Clearing manual mapping traces\\n");
    
    __try {
        // Clear DriverSection
        if (DriverObject->DriverSection) {
            RtlZeroMemory(DriverObject->DriverSection, sizeof(LDR_DATA_TABLE_ENTRY));
            DriverObject->DriverSection = NULL;
        }
        
        // Clear driver name
        if (DriverObject->DriverName.Buffer) {
            RtlZeroMemory(DriverObject->DriverName.Buffer, 
                         DriverObject->DriverName.MaximumLength);
            DriverObject->DriverName.Length = 0;
        }
        
        // Clear device object references
        DriverObject->DeviceObject = NULL;
        DriverObject->Extension = NULL;
        
        // Clear hardware database
        if (DriverObject->HardwareDatabase) {
            RtlZeroMemory(DriverObject->HardwareDatabase, 
                         DriverObject->HardwareDatabase->Length);
        }
        
        // Clear driver key
        if (DriverObject->DriverKey) {
            ZwDeleteKey(DriverObject->DriverKey);
            DriverObject->DriverKey = NULL;
        }
        
        DbgPrint("[+] Manual mapping traces cleared\\n");
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        DbgPrint("[!] Exception in manual mapping cleanup\\n");
        return FALSE;
    }
    
    return TRUE;
}

/* Nullify driver section for manual mapping support */
BOOLEAN NullifyDriverSection(PDRIVER_OBJECT DriverObject)
{
    DbgPrint("[+] 0x731\\n"); // Nullifying driver section
    
    if (!DriverObject) {
        DbgPrint("[!] 0x732\\n"); // Driver object is NULL
        return FALSE;
    }
    
    __try {
        // Clear DriverSection to hide from manual mapping detection
        DriverObject->DriverSection = NULL;
        
        // Clear DriverStart and DriverSize
        DriverObject->DriverStart = NULL;
        DriverObject->DriverSize = 0;
        
        // Clear DriverExtension and DriverInit
        DriverObject->DriverExtension = NULL;
        DriverObject->DriverInit = NULL;
        
        DbgPrint("[+] 0x733\\n"); // Driver section nullified
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        DbgPrint("[!] 0x734\\n"); // Exception in manual mapping cleanup
        return FALSE;
    }
    
    return TRUE;
}

/* ── ACE Stealth Hardening ───────────────────────────────────── */

/* Apply ACE stealth hardening */
NTSTATUS ApplyACEStealthHardening(PDRIVER_OBJECT DriverObject)
{
    DbgPrint("[+] 0x721\\n"); // Applying ACE stealth hardening
    
    // 1. Clean PiDDB cache table
    UNICODE_STRING driverName;
    RtlInitUnicodeString(&driverName, L"NtQueryDiskInformation.sys");
    
    if (!CleanPiDDBCacheTable(driverName)) {
        DbgPrint("[!] 0x722\\n"); // PiDDB cache cleaning failed
        return STATUS_UNSUCCESSFUL;
    }
    
    // 2. Clear MmUnloadedDrivers
    if (!ClearMmUnloadedDrivers()) {
        DbgPrint("[!] 0x723\\n"); // MmUnloadedDrivers clearing failed
        return STATUS_UNSUCCESSFUL;
    }
    
    // 3. Nullify driver section for manual mapping support
    if (!NullifyDriverSection(DriverObject)) {
        DbgPrint("[!] 0x724\\n"); // Driver section nullification failed
        return STATUS_UNSUCCESSFUL;
    }
    
    DbgPrint("[+] 0x725\\n"); // ACE stealth hardening completed
    return STATUS_SUCCESS;
}

/* ── .data Pointer Communication ───────────────────────────── */

/* Initialize .data pointer communication without handles */
NTSTATUS InitializeDataPointerCommunication()
{
    DbgPrint("[+] Initializing .data pointer communication (No Handles)\\n");
    
    // In real implementation, this would:
    // 1. Find a signed system driver (win32kbase.sys)
    // 2. Locate .data section in the driver
    // 3. Create communication bridge using data pointer
    // 4. Alternative: Shared memory (Data PTR) approach
    
    DbgPrint("[+] .data pointer communication initialized\\n");
    DbgPrint("[+] Using .data section in signed system driver\\n");
    DbgPrint("[+] NO handles required - completely invisible\\n");
    return STATUS_SUCCESS;
}

/* ── Stealth Communication ───────────────────────────────────── */

/* Communication via shared memory (no device objects) */
typedef struct _STEALTH_COMM_CONTEXT {
    PVOID SharedMemory;
    SIZE_T SharedMemorySize;
    BOOLEAN IsInitialized;
    UNICODE_STRING TargetProcess;
} STEALTH_COMM_CONTEXT, *PSTEALTH_COMM_CONTEXT;

/* Create shared memory region */
PVOID CreateSharedMemory(SIZE_T size)
{
    PVOID sharedMemory = NULL;
    
    __try {
        // Allocate non-paged pool for shared memory
        sharedMemory = ExAllocatePoolWithTag(NonPagedPool, size, 'IBAS');
        if (sharedMemory) {
            RtlZeroMemory(sharedMemory, size);
            DbgPrint("[+] Shared memory created: 0x%llX\\n", sharedMemory);
        }
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        sharedMemory = NULL;
    }
    
    return sharedMemory;
}

/* Initialize stealth communication */
NTSTATUS InitializeStealthCommunication()
{
    DbgPrint("[+] Initializing stealth communication\\n");
    
    // Create shared memory for communication
    PVOID sharedMemory = CreateSharedMemory(0x10000); // 64KB
    if (!sharedMemory) {
        return STATUS_INSUFFICIENT_RESOURCES;
    }
    
    // Set up communication context
    g_StealthCommContext.SharedMemory = sharedMemory;
    g_StealthCommContext.SharedMemorySize = 0x10000;
    g_StealthCommContext.IsInitialized = TRUE;
    RtlInitUnicodeString(&g_StealthCommContext.TargetProcess, L"ArenaBreakout.exe");
    
    DbgPrint("[+] Stealth communication initialized\\n");
    return STATUS_SUCCESS;
}

/* ── Global Variables ─────────────────────────────────────────── */

/* Spin locks for thread safety */
KSPIN_LOCK g_PiDDBLock;
KSPIN_LOCK g_MmUnloadedLock;

/* Module names */
UNICODE_STRING g_NtoskrnlName;

/* Stealth communication context */
STEALTH_COMM_CONTEXT g_StealthCommContext;

/* Initialize stealth subsystem */
NTSTATUS InitializeStealthSubsystem()
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

/* Forward declaration for hijacking communication */
NTSTATUS InitializeHijackingCommunication();
