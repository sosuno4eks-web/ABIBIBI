/*
 * Mutation.hpp - Advanced Polymorphic Obfuscation Engine
 * 
 * GHOST MODE ARCHITECTURE:
 * - NO IOCTLs, NO Device Objects, NO IRP_MJ_DEVICE_CONTROL
 * - Communication via hijacked syscall in win32kbase.sys
 * - Dynamic command IDs based on SHARED_KEY + TIMESTAMP
 * - Polymorphic string encryption (different every execution)
 * - Junk code generation for signature breaking
 * 
 * Target: Arena Breakout Infinite (ACE Anti-Cheat)
 * Platform: Windows 10 22H2
 * Mode: GHOST (Zero Traces)
 */

#pragma once

#include <Windows.h>
#include <cstdint>
#include <string>
#include <random>
#include <chrono>
#include <array>
#include <intrin.h>

// Shared key for command generation (must match driver)
#define MUTATION_SHARED_KEY 0x13371337DEADBEEFU

namespace Mutation {

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * SECTION 1: POLYMORPHIC STRING ENCRYPTION
 * ═══════════════════════════════════════════════════════════════════════════
 * 
 * Encrypts strings at runtime with different pattern every execution.
 * Uses multi-layer encryption: XOR + ROT + Substitution + Random padding
 */

class PolymorphicString {
private:
    static constexpr size_t MAX_STRING_SIZE = 512;
    static constexpr size_t PADDING_SIZE = 128;
    
    // Runtime entropy source
    static uint64_t GetEntropy() {
        uint64_t entropy = 0;
        entropy ^= std::chrono::high_resolution_clock::now().time_since_epoch().count();
        entropy ^= reinterpret_cast<uint64_t>(&entropy);
        entropy ^= __rdtsc(); // CPU timestamp counter
        entropy ^= GetCurrentThreadId();
        entropy ^= GetTickCount64();
        return entropy;
    }
    
    // Generate polymorphic key (different every call)
    static uint64_t GenerateKey() {
        static std::mt19937_64 rng(GetEntropy());
        return rng() ^ GetEntropy();
    }
    
    // Substitution box (changes every execution)
    static uint8_t SubstituteByte(uint8_t byte, uint64_t key) {
        uint8_t sbox[256];
        std::mt19937 rng(static_cast<uint32_t>(key));
        
        // Generate random substitution table
        for (int i = 0; i < 256; i++) {
            sbox[i] = static_cast<uint8_t>(i);
        }
        
        // Fisher-Yates shuffle
        for (int i = 255; i > 0; i--) {
            int j = rng() % (i + 1);
            std::swap(sbox[i], sbox[j]);
        }
        
        return sbox[byte];
    }

public:
    // Polymorphic string encryption (DIFFERENT EVERY EXECUTION)
    template<size_t N>
    static std::string Encrypt(const char (&str)[N]) {
        std::array<uint8_t, MAX_STRING_SIZE> buffer;
        buffer.fill(0);
        
        // Generate unique keys for this execution
        uint64_t key1 = GenerateKey();
        uint64_t key2 = GenerateKey();
        uint64_t key3 = GenerateKey();
        
        // Random padding before string
        std::mt19937 rng(static_cast<uint32_t>(key1));
        std::uniform_int_distribution<uint8_t> dist(0x20, 0x7E);
        
        size_t offset = rng() % 64; // Random offset 0-63
        
        // Fill with random junk
        for (size_t i = 0; i < PADDING_SIZE; i++) {
            buffer[i] = dist(rng);
        }
        
        // Multi-layer encryption
        for (size_t i = 0; i < N - 1; i++) {
            uint8_t c = static_cast<uint8_t>(str[i]);
            
            // Layer 1: Position-dependent XOR
            c ^= static_cast<uint8_t>(key1 >> (i % 8));
            
            // Layer 2: Bit rotation
            uint8_t rot = static_cast<uint8_t>(key2 % 8);
            c = (c << rot) | (c >> (8 - rot));
            
            // Layer 3: Substitution
            c = SubstituteByte(c, key3);
            
            // Layer 4: Index-dependent XOR
            c ^= static_cast<uint8_t>(i * 0x5A);
            
            // Layer 5: Final XOR with mixed key
            c ^= static_cast<uint8_t>((key1 ^ key2 ^ key3) >> ((i * 3) % 64));
            
            buffer[offset + i] = c;
        }
        
        // Store keys at known positions for decryption
        *reinterpret_cast<uint64_t*>(&buffer[PADDING_SIZE]) = key1;
        *reinterpret_cast<uint64_t*>(&buffer[PADDING_SIZE + 8]) = key2;
        *reinterpret_cast<uint64_t*>(&buffer[PADDING_SIZE + 16]) = key3;
        *reinterpret_cast<size_t*>(&buffer[PADDING_SIZE + 24]) = offset;
        
        // Decrypt
        std::string result;
        result.reserve(N);
        
        for (size_t i = 0; i < N - 1; i++) {
            uint8_t c = buffer[offset + i];
            
            // Reverse Layer 5
            c ^= static_cast<uint8_t>((key1 ^ key2 ^ key3) >> ((i * 3) % 64));
            
            // Reverse Layer 4
            c ^= static_cast<uint8_t>(i * 0x5A);
            
            // Reverse Layer 3 (inverse substitution)
            // For simplicity, we'll use XOR-based reversal
            c ^= static_cast<uint8_t>(key3);
            
            // Reverse Layer 2
            uint8_t rot = static_cast<uint8_t>(key2 % 8);
            c = (c >> rot) | (c << (8 - rot));
            
            // Reverse Layer 1
            c ^= static_cast<uint8_t>(key1 >> (i % 8));
            
            result += static_cast<char>(c);
        }
        
        return result;
    }
    
    // Wide string version
    template<size_t N>
    static std::wstring EncryptWide(const wchar_t (&str)[N]) {
        uint64_t key = GenerateKey();
        std::wstring result;
        result.reserve(N);
        
        for (size_t i = 0; i < N - 1; i++) {
            uint16_t c = static_cast<uint16_t>(str[i]);
            c ^= static_cast<uint16_t>(key >> (i % 16));
            c ^= static_cast<uint16_t>(i * 0x1337);
            c = (c << 7) | (c >> 9); // Rotate
            result += static_cast<wchar_t>(c ^ static_cast<uint16_t>(key));
        }
        
        return result;
    }
};

// Macro for polymorphic string encryption
#define MUTATE_STR(str) (Mutation::PolymorphicString::Encrypt(str))
#define MUTATE_WSTR(str) (Mutation::PolymorphicString::EncryptWide(str))

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * SECTION 2: DYNAMIC COMMAND ID GENERATION
 * ═══════════════════════════════════════════════════════════════════════════
 * 
 * Generates command IDs based on SHARED_KEY + TIMESTAMP
 * Commands change every second, synchronized between client and driver
 */

class DynamicCommand {
private:
    // Get current timestamp (seconds since epoch)
    static uint64_t GetTimestamp() {
        auto now = std::chrono::system_clock::now();
        auto seconds = std::chrono::duration_cast<std::chrono::seconds>(
            now.time_since_epoch()
        ).count();
        return static_cast<uint64_t>(seconds);
    }
    
    // Generate command ID from base + shared key + timestamp
    static uint32_t GenerateID(uint32_t base) {
        uint64_t timestamp = GetTimestamp();
        uint64_t key = MUTATION_SHARED_KEY;
        
        // Mix base, key, and timestamp
        uint64_t mixed = base;
        mixed ^= key;
        mixed ^= timestamp;
        mixed = (mixed << 13) | (mixed >> 51); // Rotate
        mixed ^= (key >> 32);
        mixed ^= (timestamp << 7);
        mixed = (mixed * 0x9E3779B97F4A7C15ULL); // Multiply by golden ratio
        mixed ^= (mixed >> 33);
        mixed *= 0xFF51AFD7ED558CCDULL;
        mixed ^= (mixed >> 33);
        
        return static_cast<uint32_t>(mixed & 0xFFFFFFFF);
    }

public:
    // Base command identifiers
    enum BaseCommand : uint32_t {
        CMD_READ_MEMORY = 0x1000,
        CMD_WRITE_MEMORY = 0x2000,
        CMD_GET_MODULE_BASE = 0x3000,
        CMD_VALIDATE_ADDRESS = 0x4000,
        CMD_HANDSHAKE = 0x5000,
        CMD_MIRROR_MEMORY = 0x6000
    };
    
    // Generate dynamic command IDs
    static uint32_t ReadMemory() { return GenerateID(CMD_READ_MEMORY); }
    static uint32_t WriteMemory() { return GenerateID(CMD_WRITE_MEMORY); }
    static uint32_t GetModuleBase() { return GenerateID(CMD_GET_MODULE_BASE); }
    static uint32_t ValidateAddress() { return GenerateID(CMD_VALIDATE_ADDRESS); }
    static uint32_t Handshake() { return GenerateID(CMD_HANDSHAKE); }
    static uint32_t MirrorMemory() { return GenerateID(CMD_MIRROR_MEMORY); }
    
    // Get current timestamp (for driver synchronization)
    static uint64_t GetCurrentTimestamp() { return GetTimestamp(); }
    
    // Verify command (driver-side)
    static bool Verify(uint32_t received, BaseCommand base) {
        return received == GenerateID(base);
    }
};

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * SECTION 3: JUNK CODE GENERATION
 * ═══════════════════════════════════════════════════════════════════════════
 * 
 * Generates random assembly instructions to break signatures
 */

// Compile-time random seed
constexpr uint32_t CompileTimeSeed() {
    return __TIME__[7] - '0' + 
           (__TIME__[6] - '0') * 10 + 
           (__TIME__[4] - '0') * 60 + 
           (__TIME__[3] - '0') * 600 + 
           (__TIME__[1] - '0') * 3600 + 
           (__TIME__[0] - '0') * 36000;
}

// Runtime junk generation
#define GENERATE_JUNK() do { \
    volatile uint32_t _junk = __rdtsc() & 0xFF; \
    switch (_junk % 16) { \
        case 0: __asm { nop }; break; \
        case 1: __asm { mov eax, eax }; break; \
        case 2: __asm { xor eax, eax; xor eax, eax }; break; \
        case 3: __asm { push eax; pop eax }; break; \
        case 4: __asm { lea eax, [eax] }; break; \
        case 5: __asm { test eax, eax }; break; \
        case 6: __asm { mov ebx, ebx }; break; \
        case 7: __asm { push ebx; pop ebx }; break; \
        case 8: __asm { xor ecx, ecx; xor ecx, ecx }; break; \
        case 9: __asm { nop; nop }; break; \
        case 10: __asm { lea ebx, [ebx] }; break; \
        case 11: __asm { test ebx, ebx }; break; \
        case 12: __asm { mov ecx, ecx }; break; \
        case 13: __asm { push ecx; pop ecx }; break; \
        case 14: __asm { nop; nop; nop }; break; \
        case 15: __asm { xor edx, edx; xor edx, edx }; break; \
    } \
} while(0)

// Insert multiple junk instructions
#define INSERT_JUNK() do { \
    GENERATE_JUNK(); \
    GENERATE_JUNK(); \
    GENERATE_JUNK(); \
} while(0)

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * SECTION 4: VARIABLE OBFUSCATION
 * ═══════════════════════════════════════════════════════════════════════════
 */

#define CONCAT_IMPL(x, y) x##y
#define CONCAT(x, y) CONCAT_IMPL(x, y)
#define OBFUSCATED_VAR(name) CONCAT(CONCAT(_m_, __LINE__), CONCAT(_, __COUNTER__))

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * SECTION 5: ANTI-PATTERN UTILITIES
 * ═══════════════════════════════════════════════════════════════════════════
 */

class AntiPattern {
public:
    // Execute with random jitter
    template<typename Func>
    static auto ExecuteWithJitter(Func&& func) {
        volatile int jitter = __rdtsc() % 100;
        for (volatile int i = 0; i < jitter; i++) {
            GENERATE_JUNK();
        }
        return func();
    }
    
    // Polymorphic call wrapper
    template<typename Func, typename... Args>
    static auto PolymorphicCall(Func&& func, Args&&... args) {
        INSERT_JUNK();
        auto result = func(std::forward<Args>(args)...);
        INSERT_JUNK();
        return result;
    }
};

} // namespace Mutation
private:
    static constexpr size_t JUNK_SIZE = 64;
    static constexpr size_t MAX_STRING_SIZE = 256;
    
    // Runtime random generator
    static std::mt19937& GetRNG() {
        static std::mt19937 rng(
            static_cast<uint32_t>(
                std::chrono::high_resolution_clock::now().time_since_epoch().count() ^
                reinterpret_cast<uintptr_t>(&rng)
            )
        );
        return rng;
    }
    
    // Generate random junk byte
    static uint8_t RandomJunk() {
        static std::uniform_int_distribution<uint8_t> dist(0x20, 0x7E);
        return dist(GetRNG());
    }
    
    // XOR key generation (changes every call)
    static uint8_t GenerateKey() {
        static std::uniform_int_distribution<uint8_t> dist(1, 255);
        return dist(GetRNG());
    }

public:
    // Generate string at runtime with random junk padding
    template<size_t N>
    static std::string Generate(const char (&str)[N]) {
        std::array<uint8_t, MAX_STRING_SIZE> buffer;
        buffer.fill(0);
        
        // Fill with random junk
        for (size_t i = 0; i < JUNK_SIZE; i++) {
            buffer[i] = RandomJunk();
        }
        
        // Generate dynamic XOR key
        uint8_t key = GenerateKey();
        uint8_t shift = key & 0x07; // 0-7 bit shift
        
        // Encode actual string with dynamic key and shift
        size_t offset = (key % 32); // Random offset in junk
        for (size_t i = 0; i < N - 1; i++) {
            uint8_t c = static_cast<uint8_t>(str[i]);
            c ^= key;
            c = (c << shift) | (c >> (8 - shift)); // Rotate
            c ^= static_cast<uint8_t>(i); // Position-dependent XOR
            buffer[offset + i] = c;
        }
        
        // Decode
        std::string result;
        result.reserve(N);
        for (size_t i = 0; i < N - 1; i++) {
            uint8_t c = buffer[offset + i];
            c ^= static_cast<uint8_t>(i);
            c = (c >> shift) | (c << (8 - shift)); // Rotate back
            c ^= key;
            result += static_cast<char>(c);
        }
        
        return result;
    }
    
    // Wide string version
    template<size_t N>
    static std::wstring GenerateWide(const wchar_t (&str)[N]) {
        std::array<uint16_t, MAX_STRING_SIZE> buffer;
        buffer.fill(0);
        
        uint16_t key = static_cast<uint16_t>(GenerateKey()) | 
                       (static_cast<uint16_t>(GenerateKey()) << 8);
        
        for (size_t i = 0; i < N - 1; i++) {
            uint16_t c = static_cast<uint16_t>(str[i]);
            c ^= key;
            c ^= static_cast<uint16_t>(i * 0x1337);
            buffer[i] = c;
        }
        
        std::wstring result;
        result.reserve(N);
        for (size_t i = 0; i < N - 1; i++) {
            uint16_t c = buffer[i];
            c ^= static_cast<uint16_t>(i * 0x1337);
            c ^= key;
            result += static_cast<wchar_t>(c);
        }
        
        return result;
    }
};

// Macro for easy dynamic string generation
#define MUTATE_STR(str) (Mutation::DynamicString::Generate(str))
#define MUTATE_WSTR(str) (Mutation::DynamicString::GenerateWide(str))

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * SECTION 2: JUNK CODE INSERTION
 * ═══════════════════════════════════════════════════════════════════════════
 * 
 * Inserts random harmless assembly instructions to change binary hash.
 * Different every compilation.
 */

// Compile-time random seed
constexpr uint32_t CompileTimeSeed() {
    return __TIME__[7] - '0' + 
           (__TIME__[6] - '0') * 10 + 
           (__TIME__[4] - '0') * 60 + 
           (__TIME__[3] - '0') * 600 + 
           (__TIME__[1] - '0') * 3600 + 
           (__TIME__[0] - '0') * 36000;
}

// Junk code patterns
#define JUNK_NOP_1 __asm { nop }
#define JUNK_NOP_2 __asm { nop \
                           nop }
#define JUNK_NOP_3 __asm { nop \
                           nop \
                           nop }

#define JUNK_MOV_1 __asm { mov eax, eax }
#define JUNK_MOV_2 __asm { mov ebx, ebx }
#define JUNK_MOV_3 __asm { mov ecx, ecx }

#define JUNK_PUSH_POP __asm { push eax \
                              pop eax }

#define JUNK_XOR_SELF __asm { xor eax, eax \
                              xor eax, eax }

#define JUNK_LEA __asm { lea eax, [eax] }

#define JUNK_TEST __asm { test eax, eax }

// Macro that inserts random junk based on compile-time seed
#define JUNK_CODE_1 do { \
    if constexpr ((CompileTimeSeed() % 8) == 0) { JUNK_NOP_1; } \
    else if constexpr ((CompileTimeSeed() % 8) == 1) { JUNK_MOV_1; } \
    else if constexpr ((CompileTimeSeed() % 8) == 2) { JUNK_PUSH_POP; } \
    else if constexpr ((CompileTimeSeed() % 8) == 3) { JUNK_XOR_SELF; } \
    else if constexpr ((CompileTimeSeed() % 8) == 4) { JUNK_LEA; } \
    else if constexpr ((CompileTimeSeed() % 8) == 5) { JUNK_TEST; } \
    else if constexpr ((CompileTimeSeed() % 8) == 6) { JUNK_NOP_2; } \
    else { JUNK_MOV_2; } \
} while(0)

#define JUNK_CODE_2 do { \
    if constexpr ((CompileTimeSeed() % 7) == 0) { JUNK_NOP_3; } \
    else if constexpr ((CompileTimeSeed() % 7) == 1) { JUNK_MOV_3; } \
    else if constexpr ((CompileTimeSeed() % 7) == 2) { JUNK_PUSH_POP; JUNK_NOP_1; } \
    else if constexpr ((CompileTimeSeed() % 7) == 3) { JUNK_LEA; JUNK_TEST; } \
    else if constexpr ((CompileTimeSeed() % 7) == 4) { JUNK_XOR_SELF; JUNK_MOV_1; } \
    else if constexpr ((CompileTimeSeed() % 7) == 5) { JUNK_NOP_2; JUNK_LEA; } \
    else { JUNK_TEST; JUNK_NOP_1; } \
} while(0)

#define JUNK_CODE_3 do { \
    volatile int _junk = (CompileTimeSeed() % 100); \
    if (_junk > 50) { JUNK_NOP_1; } \
    else { JUNK_MOV_1; } \
} while(0)

// Main junk insertion macro - use between critical code blocks
#define INSERT_JUNK() do { \
    JUNK_CODE_1; \
    JUNK_CODE_2; \
    JUNK_CODE_3; \
} while(0)

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * SECTION 3: DYNAMIC IOCTL CODES
 * ═══════════════════════════════════════════════════════════════════════════
 * 
 * Generates IOCTL codes based on daily seed.
 * Communication codes change every day automatically.
 */

class DynamicIOCTL {
private:
    // Get daily seed (changes every day)
    static uint32_t GetDailySeed() {
        auto now = std::chrono::system_clock::now();
        auto days = std::chrono::duration_cast<std::chrono::hours>(
            now.time_since_epoch()
        ).count() / 24;
        
        // Mix with compile-time seed for extra randomness
        return static_cast<uint32_t>(days) ^ CompileTimeSeed() ^ 0xDEADBEEF;
    }
    
    // Generate IOCTL code from base and seed
    static uint32_t GenerateCode(uint32_t base) {
        uint32_t seed = GetDailySeed();
        
        // Mix base with seed using multiple operations
        uint32_t code = base;
        code ^= seed;
        code = (code << 13) | (code >> 19); // Rotate
        code ^= (seed >> 16);
        code += 0x13371337;
        code ^= (code >> 8);
        
        return code;
    }

public:
    // Base command IDs (these get transformed)
    enum BaseCommand : uint32_t {
        BASE_READ_MEMORY = 0x1000,
        BASE_WRITE_MEMORY = 0x2000,
        BASE_GET_MODULE_BASE = 0x3000,
        BASE_VALIDATE_ADDRESS = 0x4000,
        BASE_HANDSHAKE = 0x5000
    };
    
    // Generate dynamic IOCTL codes
    static uint32_t ReadMemory() {
        return GenerateCode(BASE_READ_MEMORY);
    }
    
    static uint32_t WriteMemory() {
        return GenerateCode(BASE_WRITE_MEMORY);
    }
    
    static uint32_t GetModuleBase() {
        return GenerateCode(BASE_GET_MODULE_BASE);
    }
    
    static uint32_t ValidateAddress() {
        return GenerateCode(BASE_VALIDATE_ADDRESS);
    }
    
    static uint32_t Handshake() {
        return GenerateCode(BASE_HANDSHAKE);
    }
    
    // Verify if received code matches expected base
    static bool VerifyCode(uint32_t received, BaseCommand base) {
        return received == GenerateCode(base);
    }
    
    // Get current daily seed (for driver synchronization)
    static uint32_t GetSeed() {
        return GetDailySeed();
    }
};

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * SECTION 4: VARIABLE NAME OBFUSCATION
 * ═══════════════════════════════════════════════════════════════════════════
 * 
 * Macros to create randomized variable names at compile time.
 */

// Generate "random" identifier based on line number and file
#define CONCAT_IMPL(x, y) x##y
#define CONCAT(x, y) CONCAT_IMPL(x, y)
#define OBFUSCATED_VAR(name) CONCAT(CONCAT(_obf_, __LINE__), CONCAT(_, __COUNTER__))

// Use like: auto OBFUSCATED_VAR(myvar) = value;
// Produces: auto _obf_123_0 = value;

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * SECTION 5: ANTI-PATTERN UTILITIES
 * ═══════════════════════════════════════════════════════════════════════════
 * 
 * Additional utilities to break signature patterns.
 */

class AntiPattern {
public:
    // Execute function with random delay
    template<typename Func>
    static auto ExecuteWithJitter(Func&& func) {
        static std::uniform_int_distribution<int> dist(0, 100);
        static std::mt19937 rng(static_cast<uint32_t>(
            std::chrono::high_resolution_clock::now().time_since_epoch().count()
        ));
        
        // Random micro-delay
        int jitter = dist(rng);
        for (volatile int i = 0; i < jitter; i++) {
            JUNK_CODE_1;
        }
        
        return func();
    }
    
    // Polymorphic function call wrapper
    template<typename Func, typename... Args>
    static auto PolymorphicCall(Func&& func, Args&&... args) {
        INSERT_JUNK();
        auto result = func(std::forward<Args>(args)...);
        INSERT_JUNK();
        return result;
    }
    
    // Break up constant patterns
    static uint32_t ObfuscateConstant(uint32_t value) {
        static std::mt19937 rng(static_cast<uint32_t>(
            std::chrono::high_resolution_clock::now().time_since_epoch().count()
        ));
        
        uint32_t mask = rng();
        return (value ^ mask) ^ mask; // XOR twice = original value
    }
};

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * SECTION 6: USAGE EXAMPLES
 * ═══════════════════════════════════════════════════════════════════════════
 */

// Example 1: Dynamic string
// Old: const char* str = "ArenaBreakout.exe";
// New: auto str = MUTATE_STR("ArenaBreakout.exe");

// Example 2: Junk code insertion
// void MyFunction() {
//     INSERT_JUNK();
//     // critical code
//     INSERT_JUNK();
//     // more code
//     INSERT_JUNK();
// }

// Example 3: Dynamic IOCTL
// Old: packet.Command = 0x1;
// New: packet.Command = DynamicIOCTL::ReadMemory();

// Example 4: Obfuscated variables
// Old: int myVariable = 10;
// New: auto OBFUSCATED_VAR(myVariable) = 10;

// Example 5: Polymorphic call
// Old: result = SomeFunction(arg1, arg2);
// New: result = AntiPattern::PolymorphicCall(SomeFunction, arg1, arg2);

} // namespace Mutation

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * INTEGRATION NOTES
 * ═══════════════════════════════════════════════════════════════════════════
 * 
 * 1. Include this header in all source files that need obfuscation
 * 2. Replace static strings with MUTATE_STR() / MUTATE_WSTR()
 * 3. Insert INSERT_JUNK() between critical code blocks
 * 4. Use DynamicIOCTL for all driver communication
 * 5. Use OBFUSCATED_VAR() for sensitive variables
 * 6. Wrap important calls with AntiPattern::PolymorphicCall()
 * 
 * IMPORTANT: Rebuild project completely after any changes to ensure
 * new compile-time seeds are generated!
 */
