/*
 * Communication_Ghost.cpp - Ghost Mode Communication Implementation
 * 
 * ARCHITECTURE:
 * - NO IOCTLs, NO Device Objects, NO IRP_MJ_DEVICE_CONTROL
 * - Communication via hijacked syscall in win32kbase.sys
 * - Function pointer hijacking (Ghost Mode)
 * - Zero traces in system
 * 
 * Target: Arena Breakout Infinite (ACE Anti-Cheat)
 * Platform: Windows 10 22H2
 */

#include <Windows.h>
#include <winternl.h>
#include <TlHelp32.h>
#include <cstdint>
#include "../includes/obfuscation/Mutation.hpp"
#include "../includes/protocol/Protocol.h"

using namespace Mutation;

// Global state
static uintptr_t g_SyscallAddress = 0;
static uint32_t g_ActiveSyscallIndex = 0;
static bool g_Initialized = false;

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * SYSCALL STUB - Direct syscall invocation
 * ═══════════════════════════════════════════════════════════════════════════
 */

extern "C" {
    // Forward declaration for syscall stub
    extern "C" NTSTATUS NTAPI SyscallStub(PMUTATED_PACKET packet, uint32_t syscallNumber);
}

// External assembly stub (implemented in separate .asm file or using intrinsics)
// For now, we'll use a C++ wrapper that calls NtUserGetDC (hijacked syscall)
extern "C" NTSTATUS NTAPI SyscallStub(PMUTATED_PACKET packet, uint32_t syscallNumber) {
    // Use NtUserGetDC as our hijacked syscall entry point
    // The driver intercepts this and reads from our packet
    typedef NTSTATUS(NTAPI* pNtUserGetDC)(PMUTATED_PACKET);
    
    // Get NtUserGetDC address from win32u.dll
    static pNtUserGetDC NtUserGetDC = nullptr;
    if (!NtUserGetDC) {
        HMODULE win32u = LoadLibraryA("win32u.dll");
        if (win32u) {
            NtUserGetDC = (pNtUserGetDC)GetProcAddress(win32u, "NtUserGetDC");
        }
    }
    
    if (NtUserGetDC) {
        return NtUserGetDC(packet);
    }
    
    return STATUS_UNSUCCESSFUL;
}

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * FIND HIJACKED SYSCALL
 * ═══════════════════════════════════════════════════════════════════════════
 * 
 * Locates the hijacked syscall in win32kbase.sys
 * The driver patches one of the candidate syscalls to redirect to our handler
 */

bool FindHijackedSyscall() {
    INSERT_JUNK();
    
    // Load win32kbase.sys (use literal string to avoid C++ objects in __try)
    HMODULE hWin32kBase = LoadLibraryExW(
        L"win32kbase.sys",
        NULL,
        DONT_RESOLVE_DLL_REFERENCES
    );
    
    INSERT_JUNK();
    
    if (!hWin32kBase) {
        return false;
    }
    
    INSERT_JUNK();
    
    uintptr_t baseAddress = reinterpret_cast<uintptr_t>(hWin32kBase);
    
    // The driver leaves a signature at a known offset to indicate which syscall is hijacked
    // This is a simple marker: 0xDEADBEEF at offset + 0x1000
    
    uint32_t* marker = reinterpret_cast<uint32_t*>(baseAddress + 0x1337000);
    
    INSERT_JUNK();
    
    __try {
        if (*marker == 0xDEADBEEF) {
            // Read the syscall index from next DWORD
            g_ActiveSyscallIndex = *(marker + 1);
            g_SyscallAddress = baseAddress;
            
            FreeLibrary(hWin32kBase);
            return true;
        }
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Access violation - marker not present
    }
    
    INSERT_JUNK();
    
    FreeLibrary(hWin32kBase);
    
    // Fallback: use default candidate
    g_ActiveSyscallIndex = SYSCALL_INDEX_CANDIDATE_1;
    g_SyscallAddress = baseAddress;
    
    INSERT_JUNK();
    
    return true;
}

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * SYSCALL TRIGGER - Invoke hijacked syscall
 * ═══════════════════════════════════════════════════════════════════════════
 */

extern "C" NTSTATUS NTAPI SyscallTrigger(PMUTATED_PACKET packet) {
    INSERT_JUNK();
    
    if (!g_Initialized) {
        INSERT_JUNK();
        if (!FindHijackedSyscall()) {
            return 0xC0000001; // STATUS_UNSUCCESSFUL
        }
        g_Initialized = true;
    }
    
    INSERT_JUNK();
    
    // Validate packet
    if (!ValidatePacket(packet)) {
        return 0xC000000D; // STATUS_INVALID_PARAMETER
    }
    
    INSERT_JUNK();
    
    // Execute syscall with jitter
    NTSTATUS status = AntiPattern::ExecuteWithJitter([&]() {
        INSERT_JUNK();
        return SyscallStub(packet, g_ActiveSyscallIndex);
    });
    
    INSERT_JUNK();
    
    return status;
}

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * HIGH-LEVEL API - Memory Operations
 * ═══════════════════════════════════════════════════════════════════════════
 */

// Read memory from target process
bool GhostReadMemory(uint32_t processId, uintptr_t address, void* buffer, size_t size) {
    INSERT_JUNK();
    
    MUTATED_PACKET packet;
    InitializePacket(&packet);
    
    INSERT_JUNK();
    
    // Set command (dynamic, changes every second)
    packet.CommandID = DynamicCommand::ReadMemory();
    packet.ProcessId = processId;
    packet.SourceAddress = address;
    packet.BufferAddress = reinterpret_cast<uint64_t>(buffer);
    packet.Size = size;
    packet.Flags = PACKET_FLAG_READ | PACKET_FLAG_EXCEPTION_SAFE;
    
    INSERT_JUNK();
    
    FinalizePacket(&packet);
    
    INSERT_JUNK();
    
    NTSTATUS status = SyscallTrigger(&packet);
    
    INSERT_JUNK();
    
    return (status == 0);
}

// Write memory to target process
bool GhostWriteMemory(uint32_t processId, uintptr_t address, const void* buffer, size_t size) {
    INSERT_JUNK();
    
    MUTATED_PACKET packet;
    InitializePacket(&packet);
    
    INSERT_JUNK();
    
    packet.CommandID = DynamicCommand::WriteMemory();
    packet.ProcessId = processId;
    packet.TargetAddress = address;
    packet.BufferAddress = reinterpret_cast<uint64_t>(buffer);
    packet.Size = size;
    packet.Flags = PACKET_FLAG_WRITE | PACKET_FLAG_EXCEPTION_SAFE;
    
    INSERT_JUNK();
    
    FinalizePacket(&packet);
    
    INSERT_JUNK();
    
    NTSTATUS status = SyscallTrigger(&packet);
    
    INSERT_JUNK();
    
    return (status == 0);
}

// Get module base address
uintptr_t GhostGetModuleBase(uint32_t processId, const wchar_t* moduleName) {
    INSERT_JUNK();
    
    MUTATED_PACKET packet;
    InitializePacket(&packet);
    
    INSERT_JUNK();
    
    packet.CommandID = DynamicCommand::GetModuleBase();
    packet.ProcessId = processId;
    packet.ModuleNameAddress = reinterpret_cast<uint64_t>(moduleName);
    packet.Flags = PACKET_FLAG_EXCEPTION_SAFE;
    
    INSERT_JUNK();
    
    FinalizePacket(&packet);
    
    INSERT_JUNK();
    
    NTSTATUS status = SyscallTrigger(&packet);
    
    INSERT_JUNK();
    
    if (status == 0) {
        return static_cast<uintptr_t>(packet.ModuleBase);
    }
    
    return 0;
}

// Validate address
bool GhostValidateAddress(uint32_t processId, uintptr_t address) {
    INSERT_JUNK();
    
    MUTATED_PACKET packet;
    InitializePacket(&packet);
    
    INSERT_JUNK();
    
    packet.CommandID = DynamicCommand::ValidateAddress();
    packet.ProcessId = processId;
    packet.SourceAddress = address;
    packet.Flags = PACKET_FLAG_VALIDATE | PACKET_FLAG_EXCEPTION_SAFE;
    
    INSERT_JUNK();
    
    FinalizePacket(&packet);
    
    INSERT_JUNK();
    
    NTSTATUS status = SyscallTrigger(&packet);
    
    INSERT_JUNK();
    
    return (status == 0);
}

// Handshake with driver
bool GhostHandshake() {
    INSERT_JUNK();
    
    MUTATED_PACKET packet;
    InitializePacket(&packet);
    
    INSERT_JUNK();
    
    packet.CommandID = DynamicCommand::Handshake();
    packet.Flags = PACKET_FLAG_EXCEPTION_SAFE;
    
    INSERT_JUNK();
    
    FinalizePacket(&packet);
    
    INSERT_JUNK();
    
    NTSTATUS status = SyscallTrigger(&packet);
    
    INSERT_JUNK();
    
    return (status == 0);
}

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * PROCESS UTILITIES
 * ═══════════════════════════════════════════════════════════════════════════
 */

// Get process ID by name (with obfuscation)
uint32_t GhostGetProcessId(const wchar_t* processName) {
    INSERT_JUNK();
    
    HANDLE snapshot = CreateToolhelp32Snapshot(TH32CS_SNAPPROCESS, 0);
    if (snapshot == INVALID_HANDLE_VALUE) {
        return 0;
    }
    
    INSERT_JUNK();
    
    PROCESSENTRY32W entry = { sizeof(PROCESSENTRY32W) };
    uint32_t processId = 0;
    
    INSERT_JUNK();
    
    if (Process32FirstW(snapshot, &entry)) {
        do {
            INSERT_JUNK();
            
            if (_wcsicmp(entry.szExeFile, processName) == 0) {
                processId = entry.th32ProcessID;
                break;
            }
            
            INSERT_JUNK();
        } while (Process32NextW(snapshot, &entry));
    }
    
    INSERT_JUNK();
    
    CloseHandle(snapshot);
    
    INSERT_JUNK();
    
    return processId;
}

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * INITIALIZATION
 * ═══════════════════════════════════════════════════════════════════════════
 */

// Initialize Ghost Mode communication
bool InitializeGhostCommunication() {
    INSERT_JUNK();
    
    // Find hijacked syscall
    if (!FindHijackedSyscall()) {
        return false;
    }
    
    INSERT_JUNK();
    
    // Perform handshake with driver
    if (!GhostHandshake()) {
        return false;
    }
    
    INSERT_JUNK();
    
    g_Initialized = true;
    
    INSERT_JUNK();
    
    return true;
}

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * USAGE EXAMPLE
 * ═══════════════════════════════════════════════════════════════════════════
 * 
 * // Initialize
 * if (!InitializeGhostCommunication()) {
 *     // Failed to initialize
 *     return false;
 * }
 * 
 * // Get process ID
 * auto processName = MUTATE_WSTR(L"ArenaBreakout.exe");
 * uint32_t pid = GhostGetProcessId(processName.c_str());
 * 
 * // Get module base
 * uintptr_t base = GhostGetModuleBase(pid, processName.c_str());
 * 
 * // Read memory
 * uint32_t value;
 * GhostReadMemory(pid, base + 0x1000, &value, sizeof(value));
 * 
 * // Write memory
 * uint32_t newValue = 1337;
 * GhostWriteMemory(pid, base + 0x1000, &newValue, sizeof(newValue));
 */


