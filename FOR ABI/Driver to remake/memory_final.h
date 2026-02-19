#pragma once

/* ── Memory Header ───────────────────────────────────────────── */

/*
 * Safe memory operations for UE 4.26.1 processes
 * No detectable ZwQuerySystemInformation calls
 * Function obfuscation for stealth
 * Target: Arena Breakout Infinite (UE 4.26.1)
 */

#include "definitions.h"

/* ── Function Obfuscation ───────────────────────────────────── */

/* Inconspicuous function names */
#define UpdateSataBuffer ReadProcessMemory
#define CheckDiskConsistency WriteProcessMemory
#define ValidateSataController GetProcessModuleBase
#define ScanSataDevices GetArenaBreakoutBase

/* ── Module Base Detection (No ZwQuerySystemInformation) ───── */

/* PEB structure for module enumeration */
typedef struct _PEB_KM {
    BOOLEAN Reserved1[2];
    BOOLEAN BeingDebugged;
    BOOLEAN Reserved2[1];
    PVOID Reserved3[2];
    PVOID Ldr;
    PVOID ProcessParameters;
    PVOID Reserved4[3];
    PVOID AtlThunkSListPtr;
    PVOID Reserved5;
    ULONG Reserved6;
    PVOID Reserved7;
    ULONG Reserved8;
    PVOID Reserved9[45];
    BYTE Reserved10[96];
    PVOID PostProcessInitRoutine;
    PVOID Reserved11[128];
    PVOID Reserved12[1];
    PVOID Reserved13[3];
    BYTE Reserved14;
    BOOLEAN BeingDebugged2;
    BOOLEAN Reserved15[7];
    PVOID Reserved16[2];
    PVOID Reserved17[11];
    PVOID Reserved18[5];
    PVOID Reserved19[2];
    PVOID Reserved20[2];
    PVOID Reserved21[2];
} PEB_KM, *PPEB_KM;

/* LDR structure */
typedef struct _PEB_LDR_DATA_KM {
    ULONG Length;
    BOOLEAN Initialized;
    PVOID SsHandle;
    LIST_ENTRY InLoadOrderModuleList;
    LIST_ENTRY InMemoryOrderModuleList;
    LIST_ENTRY InInitializationOrderModuleList;
} PEB_LDR_DATA_KM, *PPEB_LDR_DATA_KM;

/* Module entry */
typedef struct _LDR_DATA_TABLE_ENTRY_KM {
    LIST_ENTRY InLoadOrderLinks;
    LIST_ENTRY InMemoryOrderLinks;
    LIST_ENTRY InInitializationOrderLinks;
    PVOID DllBase;
    PVOID EntryPoint;
    ULONG SizeOfImage;
    UNICODE_STRING FullDllName;
    UNICODE_STRING BaseDllName;
    ULONG Flags;
    USHORT LoadCount;
    USHORT TlsIndex;
    LIST_ENTRY HashLinks;
    PVOID SectionPointer;
    ULONG CheckSum;
    PVOID LoadedImports;
    PVOID EntryPointActivationContext;
    PVOID PatchInformation;
} LDR_DATA_TABLE_ENTRY_KM, *PLDR_DATA_TABLE_ENTRY_KM;

/* ── Safe Module Base Function ───────────────────────────────── */

/* Get module base using PEB walk (no detectable calls) */
PVOID ValidateSataController(HANDLE pid, const wchar_t* moduleName)
{
    if (!moduleName) return NULL;
    
    PEPROCESS process = NULL;
    if (!NT_SUCCESS(PsLookupProcessByProcessId(pid, &process))) {
        return NULL;
    }
    
    /*
     * CRITICAL: moduleName points to usermode memory of CALLING process.
     * After KeStackAttachProcess, address space switches to TARGET
     * process, making that pointer invalid. Copy to kernel stack first.
     */
    WCHAR nameBuffer[64] = { 0 };
    __try {
        wcsncpy(nameBuffer, moduleName, 63);
        nameBuffer[63] = L'\0';
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        ObDereferenceObject(process);
        return NULL;
    }
    
    PVOID result = NULL;
    
    KAPC_STATE apc;
    KeStackAttachProcess(process, &apc);
    
    __try {
        PPEB_KM peb = PsGetProcessPeb(process);
        if (peb && peb->Ldr) {
            PPEB_LDR_DATA_KM ldr = (PPEB_LDR_DATA_KM)peb->Ldr;
            
            // Walk through loaded modules
            PLIST_ENTRY listHead = &ldr->InLoadOrderModuleList;
            PLIST_ENTRY current = listHead->Flink;
            
            while (current != listHead) {
                PLDR_DATA_TABLE_ENTRY_KM entry = CONTAINING_RECORD(current, LDR_DATA_TABLE_ENTRY_KM, InLoadOrderLinks);
                PLIST_ENTRY next = current->Flink;
                
                // Compare module name
                if (entry->BaseDllName.Buffer && entry->BaseDllName.Length > 0) {
                    if (wcsstr(entry->BaseDllName.Buffer, nameBuffer)) {
                        result = entry->DllBase;
                        DbgPrint("[+] Module %ws found at 0x%llX\\n", nameBuffer, result);
                        break;
                    }
                }
                
                current = next;
            }
        }
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        result = NULL;
    }
    
    KeUnstackDetachProcess(&apc);
    ObDereferenceObject(process);
    
    return result;
}

/* ── Arena Breakout Base Address ───────────────────────────── */

/* Get ArenaBreakout.exe base address */
PVOID ScanSataDevices(HANDLE pid)
{
    // Try ArenaBreakout.exe first
    PVOID base = ValidateSataController(pid, L"ArenaBreakout.exe");
    if (base) {
        DbgPrint("[+] ArenaBreakout.exe found at 0x%llX\\n", base);
        return base;
    }
    
    // Try BE version
    base = ValidateSataController(pid, L"ArenaBreakout_BE.exe");
    if (base) {
        DbgPrint("[+] ArenaBreakout_BE.exe found at 0x%llX\\n", base);
        return base;
    }
    
    DbgPrint("[!] ArenaBreakout.exe not found\\n");
    return NULL;
}

/* ── Process Handle Operations ─────────────────────────────────── */

/* Get process handle without detectable calls */
HANDLE GetProcessHandle(HANDLE pid)
{
    PEPROCESS process = NULL;
    if (!NT_SUCCESS(PsLookupProcessByProcessId(pid, &process))) {
        return NULL;
    }
    
    HANDLE hProcess = NULL;
    NTSTATUS status = ObOpenObjectByPointer(
        process, OBJ_KERNEL_HANDLE, NULL,
        PROCESS_ALL_ACCESS, *PsProcessType,
        KernelMode, &hProcess);
    
    ObDereferenceObject(process);
    return NT_SUCCESS(status) ? hProcess : NULL;
}

/* ── Memory Operations (ACE Bypass) ─────────────────────────── */

/* Safe memory read using KeStackAttachProcess (obfuscated name) */
NTSTATUS UpdateSataBuffer(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size)
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

/* Safe memory write using KeStackAttachProcess (obfuscated name) */
NTSTATUS CheckDiskConsistency(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size)
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

/* ── Template Memory Functions ───────────────────────────────── */

/* Template read function */
template<typename T>
NTSTATUS ReadSataBuffer(HANDLE pid, uintptr_t address, T* value)
{
    if (!value) return STATUS_INVALID_PARAMETER;
    
    NTSTATUS status = UpdateSataBuffer(pid, (PVOID)address, value, sizeof(T));
    
    if (!NT_SUCCESS(status)) {
        DbgPrint("[!] Failed to read at 0x%llX: 0x%X\\n", address, status);
    }
    
    return status;
}

/* Template write function */
template<typename T>
NTSTATUS WriteSataBuffer(HANDLE pid, uintptr_t address, const T& value)
{
    NTSTATUS status = CheckDiskConsistency(pid, (PVOID)address, (PVOID)&value, sizeof(T));
    
    if (!NT_SUCCESS(status)) {
        DbgPrint("[!] Failed to write at 0x%llX: 0x%X\\n", address, status);
    }
    
    return status;
}

/* ── String Operations ───────────────────────────────────────── */

/* Read string safely */
NTSTATUS ReadSataString(HANDLE pid, uintptr_t address, char* buffer, SIZE_T maxSize)
{
    if (!buffer || maxSize == 0) {
        return STATUS_INVALID_PARAMETER;
    }
    
    NTSTATUS status = UpdateSataBuffer(pid, (PVOID)address, buffer, maxSize - 1);
    
    if (NT_SUCCESS(status)) {
        // Ensure null termination
        buffer[maxSize - 1] = '\0';
        
        // Find actual string length
        for (SIZE_T i = 0; i < maxSize - 1; i++) {
            if (buffer[i] == '\0') {
                break;
            }
        }
    }
    
    return status;
}

/* Read Unicode string safely */
NTSTATUS ReadSataUnicodeString(HANDLE pid, uintptr_t address, wchar_t* buffer, SIZE_T maxChars)
{
    if (!buffer || maxChars == 0) {
        return STATUS_INVALID_PARAMETER;
    }
    
    NTSTATUS status = UpdateSataBuffer(pid, (PVOID)address, buffer, (maxChars - 1) * sizeof(wchar_t));
    
    if (NT_SUCCESS(status)) {
        // Ensure null termination
        buffer[maxChars - 1] = L'\0';
    }
    
    return status;
}

/* ── Module Information ───────────────────────────────────────── */

/* Get module size */
SIZE_T GetModuleSize(PVOID moduleBase)
{
    if (!moduleBase) return 0;
    
    __try {
        // Read PE header
        PIMAGE_DOS_HEADER dosHeader = (PIMAGE_DOS_HEADER)moduleBase;
        if (dosHeader->e_magic != IMAGE_DOS_SIGNATURE) {
            return 0;
        }
        
        PIMAGE_NT_HEADERS ntHeaders = (PIMAGE_NT_HEADERS)((PUCHAR)moduleBase + dosHeader->e_lfanew);
        if (ntHeaders->Signature != IMAGE_NT_SIGNATURE) {
            return 0;
        }
        
        return ntHeaders->OptionalHeader.SizeOfImage;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return 0;
    }
}

/* Find module base by name */
PVOID FindModuleBase(PUNICODE_STRING moduleName)
{
    PVOID ntoskrnlBase = ValidateSataController((HANDLE)4, L"ntoskrnl.exe");
    if (!ntoskrnlBase) {
        return NULL;
    }
    
    // In a real implementation, this would scan through loaded modules
    // For now, return ntoskrnl base as placeholder
    return ntoskrnlBase;
}

/* ── UE 4.26.1 Specific Functions ───────────────────────────────── */

/* Read UE 4.26.1 GWorld offset */
NTSTATUS ReadGWorldOffset(HANDLE pid, PVOID baseAddress, PVOID* gWorld)
{
    if (!gWorld) return STATUS_INVALID_PARAMETER;
    
    // GWorld offset for UE 4.26.1: 0x9914A28
    uintptr_t gWorldOffset = (uintptr_t)baseAddress + 0x9914A28;
    
    return ReadSataBuffer(pid, gWorldOffset, gWorld);
}

/* Read UE 4.26.1 actor array */
NTSTATUS ReadActorArray(HANDLE pid, PVOID level, PVOID* actorArray, ULONG* actorCount)
{
    if (!level || !actorArray || !actorCount) {
        return STATUS_INVALID_PARAMETER;
    }
    
    // Read Actors array offset (0x98)
    uintptr_t actorsOffset = (uintptr_t)level + 0x98;
    NTSTATUS status = ReadSataBuffer(pid, actorsOffset, actorArray);
    
    if (NT_SUCCESS(status)) {
        // Read actor count offset (0xA0)
        uintptr_t countOffset = (uintptr_t)level + 0xA0;
        status = ReadSataBuffer(pid, countOffset, actorCount);
    }
    
    return status;
}
