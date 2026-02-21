/*
 * Protocol.h - Ghost Mode Communication Protocol
 * 
 * ARCHITECTURE:
 * - NO IOCTLs, NO Device Objects
 * - Communication via hijacked syscall in win32kbase.sys
 * - Mutated packet structure (polymorphic)
 * - Zero traces in system
 * 
 * Target: Arena Breakout Infinite (ACE Anti-Cheat)
 * Mode: GHOST (Function Pointer Hijacking)
 */

#pragma once

#include <Windows.h>
#include <cstdint>

// Shared key for packet validation (must match driver)
#define PROTOCOL_MAGIC 0xDEADBEEF13371337ULL

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * MUTATED_PACKET - Polymorphic Communication Structure
 * ═══════════════════════════════════════════════════════════════════════════
 * 
 * This structure is passed to the hijacked syscall.
 * Layout changes with every compilation to avoid signatures.
 */

#pragma pack(push, 1)
typedef struct _MUTATED_PACKET {
    // Magic header (for validation)
    uint64_t Magic;
    
    // Dynamic command ID (changes every second)
    uint32_t CommandID;
    
    // Timestamp (for synchronization)
    uint64_t Timestamp;
    
    // Process ID
    uint32_t ProcessId;
    
    // Padding (random size to break patterns)
    uint8_t Padding1[16];
    
    // Source address (for read operations)
    uint64_t SourceAddress;
    
    // Target address (for write operations)
    uint64_t TargetAddress;
    
    // Buffer pointer
    uint64_t BufferAddress;
    
    // Size of operation
    uint64_t Size;
    
    // Module base (output for GetModuleBase)
    uint64_t ModuleBase;
    
    // Module name pointer
    uint64_t ModuleNameAddress;
    
    // Padding (random size to break patterns)
    uint8_t Padding2[32];
    
    // Result status
    uint32_t Status;
    
    // Flags
    uint32_t Flags;
    
    // Checksum (for integrity)
    uint64_t Checksum;
    
    // Padding (random size to break patterns)
    uint8_t Padding3[64];
    
} MUTATED_PACKET, *PMUTATED_PACKET;
#pragma pack(pop)

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * PACKET FLAGS
 * ═══════════════════════════════════════════════════════════════════════════
 */

#define PACKET_FLAG_READ            0x00000001
#define PACKET_FLAG_WRITE           0x00000002
#define PACKET_FLAG_VALIDATE        0x00000004
#define PACKET_FLAG_EXCEPTION_SAFE  0x00000008
#define PACKET_FLAG_KERNEL_MODE     0x00000010

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * PACKET UTILITIES
 * ═══════════════════════════════════════════════════════════════════════════
 */

// Calculate checksum for packet integrity
static inline uint64_t CalculatePacketChecksum(PMUTATED_PACKET packet) {
    uint64_t checksum = PROTOCOL_MAGIC;
    
    checksum ^= packet->Magic;
    checksum ^= packet->CommandID;
    checksum ^= packet->Timestamp;
    checksum ^= packet->ProcessId;
    checksum ^= packet->SourceAddress;
    checksum ^= packet->TargetAddress;
    checksum ^= packet->BufferAddress;
    checksum ^= packet->Size;
    
    // Mix with golden ratio
    checksum *= 0x9E3779B97F4A7C15ULL;
    checksum ^= (checksum >> 33);
    
    return checksum;
}

// Initialize packet with magic and timestamp
static inline void InitializePacket(PMUTATED_PACKET packet) {
    RtlZeroMemory(packet, sizeof(MUTATED_PACKET));
    
    packet->Magic = PROTOCOL_MAGIC;
    
    // Get current timestamp
    LARGE_INTEGER time;
    QueryPerformanceCounter(&time);
    packet->Timestamp = time.QuadPart;
    
    packet->ProcessId = GetCurrentProcessId();
}

// Validate packet integrity
static inline bool ValidatePacket(PMUTATED_PACKET packet) {
    if (packet->Magic != PROTOCOL_MAGIC) {
        return false;
    }
    
    uint64_t expectedChecksum = CalculatePacketChecksum(packet);
    return (packet->Checksum == expectedChecksum);
}

// Finalize packet (calculate checksum)
static inline void FinalizePacket(PMUTATED_PACKET packet) {
    packet->Checksum = CalculatePacketChecksum(packet);
}

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * SYSCALL INDICES (for hijacked syscall)
 * ═══════════════════════════════════════════════════════════════════════════
 * 
 * These are the syscall numbers we hijack in win32kbase.sys
 * The driver patches one of these to redirect to our handler
 */

// Candidate syscalls for hijacking (rarely used)
#define SYSCALL_INDEX_CANDIDATE_1   0x1000  // NtUserGetThreadState
#define SYSCALL_INDEX_CANDIDATE_2   0x1001  // NtUserGetGUIThreadInfo
#define SYSCALL_INDEX_CANDIDATE_3   0x1002  // NtUserGetAltTabInfo

// Active syscall (set by driver during initialization)
extern uint32_t g_ActiveSyscallIndex;

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * SYSCALL TRIGGER FUNCTION
 * ═══════════════════════════════════════════════════════════════════════════
 * 
 * This function triggers the hijacked syscall to communicate with driver
 */

typedef NTSTATUS (NTAPI *PFN_SYSCALL_TRIGGER)(PMUTATED_PACKET packet);

// Syscall stub (implemented in Communication.cpp)
extern "C" NTSTATUS NTAPI SyscallTrigger(PMUTATED_PACKET packet);

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * USAGE EXAMPLE
 * ═══════════════════════════════════════════════════════════════════════════
 * 
 * MUTATED_PACKET packet;
 * InitializePacket(&packet);
 * 
 * packet.CommandID = DynamicCommand::ReadMemory();
 * packet.SourceAddress = targetAddress;
 * packet.BufferAddress = (uint64_t)buffer;
 * packet.Size = size;
 * packet.Flags = PACKET_FLAG_READ;
 * 
 * FinalizePacket(&packet);
 * 
 * NTSTATUS status = SyscallTrigger(&packet);
 */

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * GHOST MODE API FUNCTIONS
 * ═══════════════════════════════════════════════════════════════════════════
 */

// Initialize Ghost Mode communication
bool InitializeGhostCommunication();

// Get module base address
uint64_t GhostGetModuleBase(uint32_t processId, const wchar_t* moduleName);

// Read memory from target process
bool GhostReadMemory(uint64_t address, void* buffer, size_t size);

// Write memory to target process
bool GhostWriteMemory(uint64_t address, const void* buffer, size_t size);

// Validate address
bool GhostValidateAddress(uint64_t address);

// Status codes
#define STATUS_SUCCESS 0x00000000
#define STATUS_UNSUCCESSFUL 0xC0000001
