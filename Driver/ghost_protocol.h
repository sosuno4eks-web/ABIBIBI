/*
 * ghost_protocol.h - Driver-side Ghost Mode Protocol
 * 
 * Synchronizes with client-side Protocol.h
 * Implements syscall hijacking and packet handling
 * 
 * ARCHITECTURE:
 * - Hijacks syscall in win32kbase.sys
 * - Validates mutated packets
 * - Processes dynamic command IDs
 * - Zero traces
 * 
 * Target: Windows 10 22H2 (Build 19045)
 */

#pragma once

#include <ntifs.h>
#include <ntddk.h>

#ifdef __cplusplus
extern "C" {
#endif

// Shared constants (must match client)
#define PROTOCOL_MAGIC 0xDEADBEEF13371337ULL
#define MUTATION_SHARED_KEY 0x13371337DEADBEEFU

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * MUTATED_PACKET (Driver-side)
 * ═══════════════════════════════════════════════════════════════════════════
 */

#pragma pack(push, 1)
typedef struct _MUTATED_PACKET {
    UINT64 Magic;
    UINT32 CommandID;
    UINT64 Timestamp;
    UINT32 ProcessId;
    UINT8 Padding1[16];
    UINT64 SourceAddress;
    UINT64 TargetAddress;
    UINT64 BufferAddress;
    UINT64 Size;
    UINT64 ModuleBase;
    UINT64 ModuleNameAddress;
    UINT8 Padding2[32];
    UINT32 Status;
    UINT32 Flags;
    UINT64 Checksum;
    UINT8 Padding3[64];
} MUTATED_PACKET, *PMUTATED_PACKET;
#pragma pack(pop)

// Packet flags
#define PACKET_FLAG_READ            0x00000001
#define PACKET_FLAG_WRITE           0x00000002
#define PACKET_FLAG_VALIDATE        0x00000004
#define PACKET_FLAG_EXCEPTION_SAFE  0x00000008
#define PACKET_FLAG_KERNEL_MODE     0x00000010

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * DYNAMIC COMMAND GENERATION (Driver-side)
 * ═══════════════════════════════════════════════════════════════════════════
 */

// Base commands
#define CMD_READ_MEMORY         0x1000
#define CMD_WRITE_MEMORY        0x2000
#define CMD_GET_MODULE_BASE     0x3000
#define CMD_VALIDATE_ADDRESS    0x4000
#define CMD_HANDSHAKE           0x5000
#define CMD_MIRROR_MEMORY       0x6000

// Get current timestamp (seconds since epoch)
static FORCEINLINE UINT64 GetTimestamp() {
    LARGE_INTEGER systemTime;
    KeQuerySystemTimePrecise(&systemTime);
    
    // Convert to seconds
    UINT64 seconds = systemTime.QuadPart / 10000000ULL;
    return seconds;
}

// Generate dynamic command ID (must match client algorithm)
static FORCEINLINE UINT32 GenerateDynamicCommandID(UINT32 base) {
    UINT64 timestamp = GetTimestamp();
    UINT64 key = MUTATION_SHARED_KEY;
    
    // Same algorithm as client
    UINT64 mixed = base;
    mixed ^= key;
    mixed ^= timestamp;
    mixed = (mixed << 13) | (mixed >> 51);
    mixed ^= (key >> 32);
    mixed ^= (timestamp << 7);
    mixed = (mixed * 0x9E3779B97F4A7C15ULL);
    mixed ^= (mixed >> 33);
    mixed *= 0xFF51AFD7ED558CCDULL;
    mixed ^= (mixed >> 33);
    
    return (UINT32)(mixed & 0xFFFFFFFF);
}

// Decode dynamic command ID to base command
static FORCEINLINE UINT32 DecodeDynamicCommandID(UINT32 commandID) {
    // Try each base command
    UINT32 bases[] = {
        CMD_READ_MEMORY,
        CMD_WRITE_MEMORY,
        CMD_GET_MODULE_BASE,
        CMD_VALIDATE_ADDRESS,
        CMD_HANDSHAKE,
        CMD_MIRROR_MEMORY
    };
    
    for (int i = 0; i < sizeof(bases) / sizeof(bases[0]); i++) {
        if (GenerateDynamicCommandID(bases[i]) == commandID) {
            return bases[i];
        }
    }
    
    return 0; // Unknown command
}

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * PACKET VALIDATION
 * ═══════════════════════════════════════════════════════════════════════════
 */

// Calculate packet checksum
static FORCEINLINE UINT64 CalculatePacketChecksum(PMUTATED_PACKET packet) {
    UINT64 checksum = PROTOCOL_MAGIC;
    
    checksum ^= packet->Magic;
    checksum ^= packet->CommandID;
    checksum ^= packet->Timestamp;
    checksum ^= packet->ProcessId;
    checksum ^= packet->SourceAddress;
    checksum ^= packet->TargetAddress;
    checksum ^= packet->BufferAddress;
    checksum ^= packet->Size;
    
    checksum *= 0x9E3779B97F4A7C15ULL;
    checksum ^= (checksum >> 33);
    
    return checksum;
}

// Validate packet
static FORCEINLINE BOOLEAN ValidatePacket(PMUTATED_PACKET packet) {
    __try {
        // Check magic
        if (packet->Magic != PROTOCOL_MAGIC) {
            return FALSE;
        }
        
        // Check checksum
        UINT64 expectedChecksum = CalculatePacketChecksum(packet);
        if (packet->Checksum != expectedChecksum) {
            return FALSE;
        }
        
        // Check timestamp (must be within 5 seconds)
        UINT64 currentTime = GetTimestamp();
        UINT64 packetTime = packet->Timestamp / 10000000ULL; // Convert to seconds
        
        if (currentTime > packetTime + 5 || packetTime > currentTime + 5) {
            return FALSE; // Timestamp too old or too new
        }
        
        return TRUE;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return FALSE;
    }
}

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * SYSCALL HIJACKING
 * ═══════════════════════════════════════════════════════════════════════════
 */

// Original syscall handler (saved before hijacking)
typedef NTSTATUS (*PFN_ORIGINAL_SYSCALL)(PVOID);
extern PFN_ORIGINAL_SYSCALL g_OriginalSyscallHandler;

// Our hijacked syscall handler
NTSTATUS NTAPI HijackedSyscallHandler(PMUTATED_PACKET packet);

// Install syscall hijack
NTSTATUS InstallSyscallHijack();

// Remove syscall hijack
VOID RemoveSyscallHijack();

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * COMMAND HANDLERS (Implementations)
 * ═══════════════════════════════════════════════════════════════════════════
 */

// Read memory from target process
static FORCEINLINE NTSTATUS HandleReadMemory(PMUTATED_PACKET packet) {
    __try {
        PEPROCESS targetProcess = NULL;
        NTSTATUS status = PsLookupProcessByProcessId((HANDLE)(ULONG_PTR)packet->ProcessId, &targetProcess);
        
        if (!NT_SUCCESS(status)) {
            return status;
        }
        
        // Attach to target process
        KAPC_STATE apcState;
        KeStackAttachProcess(targetProcess, &apcState);
        
        // Copy memory using safe method
        __try {
            ProbeForWrite((PVOID)packet->BufferAddress, packet->Size, 1);
            RtlCopyMemory((PVOID)packet->BufferAddress, (PVOID)packet->SourceAddress, packet->Size);
            status = STATUS_SUCCESS;
        }
        __except (EXCEPTION_EXECUTE_HANDLER) {
            status = STATUS_ACCESS_VIOLATION;
        }
        
        KeUnstackDetachProcess(&apcState);
        ObDereferenceObject(targetProcess);
        
        packet->Status = NT_SUCCESS(status) ? 0 : 1;
        return status;
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

// Write memory to target process
static FORCEINLINE NTSTATUS HandleWriteMemory(PMUTATED_PACKET packet) {
    __try {
        PEPROCESS targetProcess = NULL;
        NTSTATUS status = PsLookupProcessByProcessId((HANDLE)(ULONG_PTR)packet->ProcessId, &targetProcess);
        
        if (!NT_SUCCESS(status)) {
            return status;
        }
        
        // Attach to target process
        KAPC_STATE apcState;
        KeStackAttachProcess(targetProcess, &apcState);
        
        // Copy memory using safe method
        __try {
            ProbeForRead((PVOID)packet->BufferAddress, packet->Size, 1);
            RtlCopyMemory((PVOID)packet->TargetAddress, (PVOID)packet->BufferAddress, packet->Size);
            status = STATUS_SUCCESS;
        }
        __except (EXCEPTION_EXECUTE_HANDLER) {
            status = STATUS_ACCESS_VIOLATION;
        }
        
        KeUnstackDetachProcess(&apcState);
        ObDereferenceObject(targetProcess);
        
        packet->Status = NT_SUCCESS(status) ? 0 : 1;
        return status;
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

// Get module base address (THREAD STACK WALK METHOD - Ultimate reliability)
static FORCEINLINE NTSTATUS HandleGetModuleBase(PMUTATED_PACKET packet) {
    __try {
        PEPROCESS targetProcess = NULL;
        NTSTATUS status = PsLookupProcessByProcessId((HANDLE)(ULONG_PTR)packet->ProcessId, &targetProcess);
        
        if (!NT_SUCCESS(status)) {
            packet->Status = 0xDEAD0001; // KERN_BASE_FAIL: Process lookup failed
            packet->ModuleBase = 0;
            return status;
        }
        
        // THREAD STACK WALK METHOD
        // This method finds the base address by analyzing thread start addresses
        // ACE cannot zero these out without breaking the game
        // This is the most reliable method against anti-cheat protection
        
        PVOID foundBase = NULL;
        UINT64 lowestStartAddress = 0xFFFFFFFFFFFFFFFFULL;
        ULONG threadCount = 0;
        
        __try {
            // Windows 10 Build 19045 (22H2) EPROCESS offsets
            const ULONG_PTR THREAD_LIST_HEAD_OFFSET = 0x5E0;  // ThreadListHead offset
            
            // Get ThreadListHead from EPROCESS
            PLIST_ENTRY threadListHead = (PLIST_ENTRY)((ULONG_PTR)targetProcess + THREAD_LIST_HEAD_OFFSET);
            PLIST_ENTRY currentEntry = threadListHead->Flink;
            
            // Iterate through all threads in the process
            while (currentEntry != threadListHead && threadCount < 1000) {
                __try {
                    // Calculate ETHREAD address from list entry
                    // ThreadListEntry is at offset 0x6F8 in ETHREAD
                    const ULONG_PTR THREAD_LIST_ENTRY_OFFSET = 0x6F8;
                    PETHREAD currentThread = (PETHREAD)((ULONG_PTR)currentEntry - THREAD_LIST_ENTRY_OFFSET);
                    
                    // Get thread start address from ETHREAD structure
                    // Win32StartAddress is at offset 0x620 in ETHREAD on Windows 10 Build 19045
                    const ULONG_PTR WIN32_START_ADDRESS_OFFSET = 0x620;
                    PVOID startAddress = *(PVOID*)((ULONG_PTR)currentThread + WIN32_START_ADDRESS_OFFSET);
                    
                    if (startAddress != NULL) {
                        UINT64 startAddr = (UINT64)startAddress;
                        
                        // Check if this is in user-mode range
                        if (startAddr >= 0x0000000000010000ULL && 
                            startAddr < 0x00007FFFFFFFFFFFULL) {
                            
                            // Track the lowest start address
                            if (startAddr < lowestStartAddress) {
                                lowestStartAddress = startAddr;
                            }
                            
                            threadCount++;
                        }
                    }
                    
                    // Move to next thread
                    currentEntry = currentEntry->Flink;
                    
                }
                __except (EXCEPTION_EXECUTE_HANDLER) {
                    // Skip this thread and continue
                    break;
                }
            }
            
            // If we found thread start addresses, calculate base address
            if (lowestStartAddress != 0xFFFFFFFFFFFFFFFFULL && threadCount > 0) {
                // Align down to 64KB boundary (typical module alignment)
                UINT64 potentialBase = lowestStartAddress & ~0xFFFFULL;
                
                // Attach to process context to read memory
                KAPC_STATE apcState;
                KeStackAttachProcess(targetProcess, &apcState);
                
                __try {
                    // Try a few aligned addresses around the lowest start address
                    for (INT32 i = 0; i >= -16; i--) {
                        UINT64 testBase = potentialBase + (i * 0x10000);
                        
                        // Validate address range
                        if (testBase < 0x0000000000010000ULL || 
                            testBase >= 0x00007FFFFFFFFFFFULL) {
                            continue;
                        }
                        
                        // Check if memory is accessible
                        if (MmIsAddressValid((PVOID)testBase)) {
                            __try {
                                // Check for MZ header
                                UINT16 mzHeader = *(UINT16*)testBase;
                                
                                if (mzHeader == 0x5A4D) {  // 'MZ'
                                    // Verify PE header
                                    UINT32 peOffset = *(UINT32*)(testBase + 0x3C);
                                    
                                    if (peOffset < 0x1000) {  // Reasonable PE offset
                                        UINT64 peAddress = testBase + peOffset;
                                        
                                        if (MmIsAddressValid((PVOID)peAddress)) {
                                            UINT32 peSignature = *(UINT32*)peAddress;
                                            
                                            if (peSignature == 0x00004550) {  // 'PE\0\0'
                                                foundBase = (PVOID)testBase;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            __except (EXCEPTION_EXECUTE_HANDLER) {
                                continue;
                            }
                        }
                    }
                }
                __except (EXCEPTION_EXECUTE_HANDLER) {
                    foundBase = NULL;
                }
                
                KeUnstackDetachProcess(&apcState);
            }
            
        }
        __except (EXCEPTION_EXECUTE_HANDLER) {
            foundBase = NULL;
        }
        
        ObDereferenceObject(targetProcess);
        
        if (foundBase != NULL) {
            packet->ModuleBase = (UINT64)foundBase;
            packet->Status = 0; // SUCCESS
            return STATUS_SUCCESS;
        }
        
        // Return specific error codes
        if (threadCount == 0) {
            packet->Status = 0xDEAD0006; // KERN_BASE_FAIL: No threads found
        } else if (lowestStartAddress == 0xFFFFFFFFFFFFFFFFULL) {
            packet->Status = 0xDEAD0007; // KERN_BASE_FAIL: No valid start addresses
        } else {
            packet->Status = 0xDEAD0008; // KERN_BASE_FAIL: No MZ header found
        }
        
        packet->ModuleBase = 0;
        return STATUS_NOT_FOUND;
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        packet->Status = 0xDEAD0009; // KERN_BASE_FAIL: Exception in handler
        packet->ModuleBase = 0;
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

// Validate address
static FORCEINLINE NTSTATUS HandleValidateAddress(PMUTATED_PACKET packet) {
    __try {
        PEPROCESS targetProcess = NULL;
        NTSTATUS status = PsLookupProcessByProcessId((HANDLE)(ULONG_PTR)packet->ProcessId, &targetProcess);
        
        if (!NT_SUCCESS(status)) {
            return status;
        }
        
        // Attach to target process
        KAPC_STATE apcState;
        KeStackAttachProcess(targetProcess, &apcState);
        
        // Probe address
        __try {
            ProbeForRead((PVOID)packet->SourceAddress, 1, 1);
            status = STATUS_SUCCESS;
        }
        __except (EXCEPTION_EXECUTE_HANDLER) {
            status = STATUS_ACCESS_VIOLATION;
        }
        
        KeUnstackDetachProcess(&apcState);
        ObDereferenceObject(targetProcess);
        
        packet->Status = NT_SUCCESS(status) ? 0 : 1;
        return status;
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

// Mirror memory (copy between processes)
static FORCEINLINE NTSTATUS HandleMirrorMemory(PMUTATED_PACKET packet) {
    __try {
        // For now, just return success
        // In production, this would copy memory between two processes
        packet->Status = 0;
        return STATUS_SUCCESS;
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * PACKET HANDLER
 * ═══════════════════════════════════════════════════════════════════════════
 */

// Handle mutated packet
static FORCEINLINE NTSTATUS HandleMutatedPacket(PMUTATED_PACKET packet) {
    __try {
        // Validate packet
        if (!ValidatePacket(packet)) {
            return STATUS_INVALID_PARAMETER;
        }
        
        // Decode dynamic command
        UINT32 baseCommand = DecodeDynamicCommandID(packet->CommandID);
        
        if (baseCommand == 0) {
            return STATUS_NOT_SUPPORTED;
        }
        
        // Process command
        switch (baseCommand) {
            case CMD_READ_MEMORY:
                // Handle read memory
                return HandleReadMemory(packet);
                
            case CMD_WRITE_MEMORY:
                // Handle write memory
                return HandleWriteMemory(packet);
                
            case CMD_GET_MODULE_BASE:
                // Handle get module base
                return HandleGetModuleBase(packet);
                
            case CMD_VALIDATE_ADDRESS:
                // Handle validate address
                return HandleValidateAddress(packet);
                
            case CMD_HANDSHAKE:
                // Handle handshake
                packet->Status = 0;
                return STATUS_SUCCESS;
                
            case CMD_MIRROR_MEMORY:
                // Handle mirror memory
                return HandleMirrorMemory(packet);
                
            default:
                return STATUS_NOT_SUPPORTED;
        }
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * JUNK CODE (Driver-side)
 * ═══════════════════════════════════════════════════════════════════════════
 */

#define DRIVER_JUNK() do { \
    volatile UINT64 _junk = KeQueryTimeIncrement(); \
    _junk ^= _junk; \
} while(0)

#define INSERT_DRIVER_JUNK() do { \
    DRIVER_JUNK(); \
    DRIVER_JUNK(); \
    DRIVER_JUNK(); \
} while(0)

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * USAGE IN DRIVER
 * ═══════════════════════════════════════════════════════════════════════════
 * 
 * // In DriverEntry:
 * NTSTATUS status = InstallSyscallHijack();
 * if (!NT_SUCCESS(status)) {
 *     return status;
 * }
 * 
 * // In DriverUnload:
 * RemoveSyscallHijack();
 * 
 * // Hijacked syscall handler:
 * NTSTATUS NTAPI HijackedSyscallHandler(PMUTATED_PACKET packet) {
 *     INSERT_DRIVER_JUNK();
 *     return HandleMutatedPacket(packet);
 * }
 */

#ifdef __cplusplus
}
#endif
