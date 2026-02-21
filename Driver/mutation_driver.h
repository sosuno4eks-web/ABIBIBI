/*
 * mutation_driver.h - Driver-side Dynamic Obfuscation
 * 
 * Synchronizes with client-side Mutation.hpp for dynamic IOCTL codes
 * Implements same daily seed algorithm for command verification
 * 
 * Target: Windows 10 22H2 (Build 19045)
 * Anti-Cheat: ACE (Tencent)
 */

#pragma once

#include <ntifs.h>
#include <ntddk.h>

#ifdef __cplusplus
extern "C" {
#endif

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * DYNAMIC IOCTL SYNCHRONIZATION
 * ═══════════════════════════════════════════════════════════════════════════
 */

// Base command IDs (must match client-side)
#define BASE_READ_MEMORY        0x1000
#define BASE_WRITE_MEMORY       0x2000
#define BASE_GET_MODULE_BASE    0x3000
#define BASE_VALIDATE_ADDRESS   0x4000
#define BASE_HANDSHAKE          0x5000

// Compile-time seed (from build time)
static FORCEINLINE UINT32 GetCompileTimeSeed() {
    // Simple compile-time seed based on date/time
    // In production, use more sophisticated method
    return 0x13371337; // Placeholder - should match client
}

// Get daily seed (changes every day)
static FORCEINLINE UINT32 GetDailySeed() {
    LARGE_INTEGER systemTime;
    KeQuerySystemTime(&systemTime);
    
    // Convert to days since epoch
    UINT64 days = systemTime.QuadPart / (10000000ULL * 60 * 60 * 24);
    
    // Mix with compile-time seed
    UINT32 seed = (UINT32)days ^ GetCompileTimeSeed() ^ 0xDEADBEEF;
    
    return seed;
}

// Generate dynamic IOCTL code from base
static FORCEINLINE UINT32 GenerateDynamicCode(UINT32 base) {
    UINT32 seed = GetDailySeed();
    
    // Apply same transformations as client
    UINT32 code = base;
    code ^= seed;
    code = (code << 13) | (code >> 19); // Rotate left 13
    code ^= (seed >> 16);
    code += 0x13371337;
    code ^= (code >> 8);
    
    return code;
}

// Verify if received code matches expected base
static FORCEINLINE BOOLEAN VerifyDynamicCode(UINT32 received, UINT32 base) {
    UINT32 expected = GenerateDynamicCode(base);
    return (received == expected);
}

// Decode dynamic code back to base command
static FORCEINLINE UINT32 DecodeDynamicCode(UINT32 received) {
    // Try each base command
    if (VerifyDynamicCode(received, BASE_READ_MEMORY)) {
        return BASE_READ_MEMORY;
    }
    if (VerifyDynamicCode(received, BASE_WRITE_MEMORY)) {
        return BASE_WRITE_MEMORY;
    }
    if (VerifyDynamicCode(received, BASE_GET_MODULE_BASE)) {
        return BASE_GET_MODULE_BASE;
    }
    if (VerifyDynamicCode(received, BASE_VALIDATE_ADDRESS)) {
        return BASE_VALIDATE_ADDRESS;
    }
    if (VerifyDynamicCode(received, BASE_HANDSHAKE)) {
        return BASE_HANDSHAKE;
    }
    
    // Unknown command
    return 0;
}

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * JUNK CODE MACROS (Driver-side)
 * ═══════════════════════════════════════════════════════════════════════════
 */

// Junk code for driver (different from client to avoid patterns)
#define DRIVER_JUNK_1 do { \
    volatile UINT32 _junk = 0; \
    _junk = _junk + 1; \
    _junk = _junk - 1; \
} while(0)

#define DRIVER_JUNK_2 do { \
    volatile PVOID _ptr = NULL; \
    _ptr = &_ptr; \
    _ptr = NULL; \
} while(0)

#define DRIVER_JUNK_3 do { \
    volatile UINT64 _val = KeQueryTimeIncrement(); \
    _val ^= _val; \
} while(0)

#define INSERT_DRIVER_JUNK() do { \
    DRIVER_JUNK_1; \
    DRIVER_JUNK_2; \
    DRIVER_JUNK_3; \
} while(0)

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * USAGE IN DRIVER
 * ═══════════════════════════════════════════════════════════════════════════
 */

// Example: Command handler with dynamic code verification
static FORCEINLINE NTSTATUS HandleDynamicCommand(PCOMM_PACKET packet) {
    INSERT_DRIVER_JUNK();
    
    // Decode dynamic command to base command
    UINT32 baseCommand = DecodeDynamicCode(packet->Command);
    
    INSERT_DRIVER_JUNK();
    
    if (baseCommand == 0) {
        // Invalid or unknown command
        return STATUS_INVALID_PARAMETER;
    }
    
    INSERT_DRIVER_JUNK();
    
    // Process based on base command
    switch (baseCommand) {
        case BASE_READ_MEMORY:
            INSERT_DRIVER_JUNK();
            // Handle read
            return HandleReadMemory(packet);
            
        case BASE_WRITE_MEMORY:
            INSERT_DRIVER_JUNK();
            // Handle write
            return HandleWriteMemory(packet);
            
        case BASE_GET_MODULE_BASE:
            INSERT_DRIVER_JUNK();
            // Handle get module
            return HandleGetModuleBase(packet);
            
        case BASE_VALIDATE_ADDRESS:
            INSERT_DRIVER_JUNK();
            // Handle validate
            return HandleValidateAddress(packet);
            
        case BASE_HANDSHAKE:
            INSERT_DRIVER_JUNK();
            // Handle handshake
            return HandleHandshake(packet);
            
        default:
            return STATUS_NOT_SUPPORTED;
    }
}

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * INTEGRATION NOTES
 * ═══════════════════════════════════════════════════════════════════════════
 * 
 * 1. Include this header in your driver's communication handler
 * 2. Replace static command checks with DecodeDynamicCode()
 * 3. Add INSERT_DRIVER_JUNK() between critical operations
 * 4. Ensure GetCompileTimeSeed() matches client build
 * 
 * Example integration in protocol.cpp:
 * 
 * NTSTATUS DiskSectorSataInternalHandler(PCOMMAND_PACKET packet) {
 *     INSERT_DRIVER_JUNK();
 *     
 *     // Decode dynamic command
 *     UINT32 baseCmd = DecodeDynamicCode(packet->Command);
 *     
 *     INSERT_DRIVER_JUNK();
 *     
 *     switch (baseCmd) {
 *         case BASE_READ_MEMORY:
 *             return StorageSafeCopy(...);
 *         // ... other cases
 *     }
 * }
 */

#ifdef __cplusplus
}
#endif
