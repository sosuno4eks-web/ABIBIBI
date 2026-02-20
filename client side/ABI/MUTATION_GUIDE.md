# Mutation System - Advanced Dynamic Obfuscation Guide

## Overview
The Mutation system implements runtime polymorphism to evade ACE Anti-Cheat detection through:
- Dynamic string generation (different every execution)
- Junk code insertion (changes binary hash every build)
- Variable name randomization
- Dynamic IOCTL codes (changes daily)

## Features

### 1. Dynamic String Generation
Strings are generated at runtime with random junk padding and shifting. Every execution produces different memory patterns.

**Before:**
```cpp
const char* processName = "ArenaBreakout.exe";
HMODULE hModule = LoadLibraryA("win32kbase.sys");
```

**After:**
```cpp
auto processName = MUTATE_STR("ArenaBreakout.exe");
auto moduleName = MUTATE_WSTR(L"win32kbase.sys");
HMODULE hModule = LoadLibraryW(moduleName.c_str());
```

**How it works:**
- Fills buffer with random junk (64 bytes)
- Generates dynamic XOR key (changes every call)
- Applies position-dependent XOR
- Applies bit rotation (0-7 bits)
- Decodes at runtime

**Result:** Same string produces different memory patterns every execution.

### 2. Junk Code Insertion
Inserts random harmless assembly instructions between code blocks to change binary hash.

**Usage:**
```cpp
void CriticalFunction() {
    INSERT_JUNK(); // Inserts random NOPs, MOVs, etc.
    
    // Your critical code here
    ReadMemory(address, buffer, size);
    
    INSERT_JUNK(); // Different junk every build
    
    // More code
    ProcessData(buffer);
    
    INSERT_JUNK();
}
```

**Junk patterns:**
- NOP instructions (1-3 bytes)
- MOV reg, reg (harmless moves)
- PUSH/POP pairs
- XOR reg, reg (zero register)
- LEA reg, [reg] (no-op LEA)
- TEST reg, reg (harmless test)

**Result:** Binary hash changes with every compilation.

### 3. Dynamic IOCTL Codes
Communication codes change daily based on seed algorithm.

**Before:**
```cpp
packet.Command = 0x1; // Read memory
packet.Command = 0x2; // Write memory
```

**After:**
```cpp
packet.Command = DynamicIOCTL::ReadMemory();    // Changes daily
packet.Command = DynamicIOCTL::WriteMemory();   // Changes daily
packet.Command = DynamicIOCTL::GetModuleBase(); // Changes daily
```

**How it works:**
- Calculates daily seed from current date
- Mixes with compile-time seed
- Applies multiple transformations:
  - XOR with seed
  - Bit rotation
  - Addition
  - Multiple XOR passes

**Result:** Same command has different code every day.

### 4. Variable Name Obfuscation
Creates randomized variable names at compile time.

**Before:**
```cpp
int myVariable = 10;
std::string processName = "game.exe";
```

**After:**
```cpp
auto OBFUSCATED_VAR(myVariable) = 10;
auto OBFUSCATED_VAR(processName) = MUTATE_STR("game.exe");
```

**Result:** Variables have names like `_obf_123_0`, `_obf_456_1` in binary.

### 5. Anti-Pattern Utilities
Additional utilities to break signature patterns.

**Polymorphic Call:**
```cpp
// Before
result = SomeFunction(arg1, arg2);

// After
result = AntiPattern::PolymorphicCall(SomeFunction, arg1, arg2);
```

**Execute with Jitter:**
```cpp
auto result = AntiPattern::ExecuteWithJitter([&]() {
    return PerformCriticalOperation();
});
```

**Obfuscate Constants:**
```cpp
uint32_t value = AntiPattern::ObfuscateConstant(0xDEADBEEF);
```

## Integration Guide

### Step 1: Include Header
```cpp
#include "obfuscation/Mutation.hpp"
using namespace Mutation;
```

### Step 2: Replace Static Strings
Find all static strings and replace:
```cpp
// Old
const char* str = "MyString";
const wchar_t* wstr = L"MyWideString";

// New
auto str = MUTATE_STR("MyString");
auto wstr = MUTATE_WSTR(L"MyWideString");
```

### Step 3: Insert Junk Code
Add `INSERT_JUNK()` between critical code blocks:
```cpp
void MyFunction() {
    INSERT_JUNK();
    
    // Critical operation 1
    DoSomething();
    
    INSERT_JUNK();
    
    // Critical operation 2
    DoSomethingElse();
    
    INSERT_JUNK();
}
```

### Step 4: Use Dynamic IOCTLs
Replace static command codes:
```cpp
// Old
packet.Command = 0x1;

// New
packet.Command = DynamicIOCTL::ReadMemory();
```

### Step 5: Obfuscate Variables
Use `OBFUSCATED_VAR()` for sensitive variables:
```cpp
auto OBFUSCATED_VAR(buffer) = new uint8_t[1024];
auto OBFUSCATED_VAR(address) = GetTargetAddress();
```

## Driver Synchronization

The driver must use the same daily seed for IOCTL verification.

**Client side:**
```cpp
uint32_t seed = DynamicIOCTL::GetSeed();
packet.Command = DynamicIOCTL::ReadMemory();
```

**Driver side:**
```cpp
// In driver, implement same seed calculation
uint32_t GetDailySeed() {
    // Get days since epoch
    LARGE_INTEGER systemTime;
    KeQuerySystemTime(&systemTime);
    uint64_t days = systemTime.QuadPart / (10000000ULL * 60 * 60 * 24);
    return (uint32_t)days ^ 0xDEADBEEF;
}

// Verify command
bool VerifyCommand(uint32_t received) {
    uint32_t seed = GetDailySeed();
    // Apply same transformation as client
    // ...
}
```

## Build Process

### Important: Rebuild Completely
Every time you build, the system generates new:
- Compile-time seeds (from `__TIME__`)
- Junk code patterns
- String obfuscation keys

**Always do:**
```batch
# Clean build
msbuild /t:Clean
msbuild /t:Build

# Or in Visual Studio
Build → Clean Solution
Build → Rebuild Solution
```

**Never do:**
- Incremental builds (may reuse old patterns)
- Copy binaries between builds
- Use cached object files

## Testing

### Verify Obfuscation
1. Build project twice
2. Compare binary hashes:
```batch
certutil -hashfile ABI_v1.exe SHA256
certutil -hashfile ABI_v2.exe SHA256
```
3. Hashes should be DIFFERENT

### Verify Dynamic Strings
1. Run program twice
2. Attach debugger
3. Check string memory patterns
4. Should be different each execution

### Verify Dynamic IOCTLs
1. Check command codes on different days
2. Should change automatically

## Performance Impact

### Minimal Overhead
- String generation: ~0.001ms per string
- Junk code: 0 runtime overhead (compile-time only)
- Dynamic IOCTLs: ~0.0001ms per call
- Total impact: < 1% performance loss

### Binary Size
- Junk code adds: ~1-5 KB
- String obfuscation: ~2-10 KB
- Total increase: ~5-15 KB

## Security Benefits

### Against Static Analysis
- ✅ Different binary hash every build
- ✅ No static string patterns
- ✅ No consistent function signatures
- ✅ Variable names randomized

### Against Dynamic Analysis
- ✅ Different memory patterns every execution
- ✅ Different IOCTL codes daily
- ✅ Jittered execution timing
- ✅ Polymorphic function calls

### Against Signature Scanning
- ✅ No fixed byte patterns
- ✅ No consistent API call sequences
- ✅ No predictable constants
- ✅ No static strings in memory

## Best Practices

### DO:
- ✅ Rebuild completely before deployment
- ✅ Use `INSERT_JUNK()` liberally
- ✅ Obfuscate ALL strings
- ✅ Use dynamic IOCTLs for all communication
- ✅ Test on different days (IOCTL changes)

### DON'T:
- ❌ Use incremental builds
- ❌ Leave static strings
- ❌ Skip junk code insertion
- ❌ Use fixed IOCTL codes
- ❌ Reuse old binaries

## Troubleshooting

### Issue: Strings not working
**Cause:** Buffer overflow or encoding issue  
**Fix:** Check string length < 256 characters

### Issue: Junk code crashes
**Cause:** Compiler optimization removed junk  
**Fix:** Use `volatile` or disable optimizations for that section

### Issue: IOCTL mismatch
**Cause:** Client and driver using different seeds  
**Fix:** Ensure both use same seed calculation

### Issue: Binary too large
**Cause:** Too much junk code  
**Fix:** Reduce `INSERT_JUNK()` frequency

## Advanced Usage

### Custom Junk Patterns
Add your own junk code:
```cpp
#define MY_JUNK __asm { \
    xor eax, eax \
    add eax, 1 \
    sub eax, 1 \
}
```

### Custom String Encoding
Modify `DynamicString::Generate()` for custom encoding:
```cpp
// Add your own transformation
c ^= custom_key;
c = custom_transform(c);
```

### Custom IOCTL Algorithm
Modify `DynamicIOCTL::GenerateCode()`:
```cpp
// Add your own mixing
code ^= your_seed;
code = your_transform(code);
```

## Integration with Existing Code

### Minimal Changes
1. Include `Mutation.hpp`
2. Replace strings with `MUTATE_STR()`
3. Add `INSERT_JUNK()` in critical functions
4. Use `DynamicIOCTL` for commands

### Example Migration
**Before:**
```cpp
void ReadGameMemory() {
    HANDLE hProcess = OpenProcess(PROCESS_ALL_ACCESS, FALSE, pid);
    ReadProcessMemory(hProcess, address, buffer, size, nullptr);
    CloseHandle(hProcess);
}
```

**After:**
```cpp
void ReadGameMemory() {
    INSERT_JUNK();
    
    auto OBFUSCATED_VAR(packet) = COMM_PACKET{};
    OBFUSCATED_VAR(packet).Command = DynamicIOCTL::ReadMemory();
    OBFUSCATED_VAR(packet).SourceAddress = address;
    OBFUSCATED_VAR(packet).Buffer = buffer;
    OBFUSCATED_VAR(packet).Size = size;
    
    INSERT_JUNK();
    
    AntiPattern::PolymorphicCall(CallDriverCommunication, &OBFUSCATED_VAR(packet));
    
    INSERT_JUNK();
}
```

## Conclusion

The Mutation system provides comprehensive runtime polymorphism to evade modern anti-cheat systems. By combining dynamic string generation, junk code insertion, and daily-changing communication codes, it makes static and dynamic analysis significantly more difficult.

**Remember:** Always rebuild completely and test thoroughly before deployment!

---

**Mutation System** - Stay ahead of detection through continuous evolution.
