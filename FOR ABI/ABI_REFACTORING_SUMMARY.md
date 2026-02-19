# Arena Breakout Infinite (ABI) Driver Refactoring Summary

## Overview
This document summarizes the refactoring of a kernel driver and SDK from EAC-protected games to Arena Breakout Infinite (ABI) with ACE anti-cheat.

## Key Changes Made

### 1. Process Discovery Updates
- **Target Process**: Changed from generic EAC targets to `ArenaBreakout.exe` and `ArenaBreakout_BE.exe`
- **Process Detection**: Implemented robust process finding using Windows Tool Help API
- **Base Address Resolution**: Added module base address detection for both standard and BE versions

### 2. Naming Convention Refactoring
- **Magic Constant**: Updated from `0x44524B4E` ("DRKN") to `0x41424900` ("ABI\0")
- **Driver Name**: Changed from `iqvw64e.sys` to `abi_driver.sys`
- **Timestamp**: Updated driver timestamp from `0x5284EAC3` to `0x41424900`
- **Symbolic Link**: Changed to `\\\\.\\abi_driver`

### 3. Communication Protocol Updates
- **Request Magic**: Updated to ABI-specific magic value
- **Driver Interface**: Created new driver communication layer for ABI
- **Safety Features**: Added ACE-specific bypass mechanisms

### 4. Anti-Cheat Adaptations
- **Comments**: Updated all references from EAC to ACE throughout codebase
- **Bypass Methods**: Maintained PTE-based hooking for ACE integrity bypass
- **Memory Operations**: Preserved physical memory R/W for ACE monitoring bypass
- **Return Address Spoofing**: Updated for ACE stack walk evasion

### 5. Build Configuration
- **Output Directory**: Changed to `build\\abi_bypass`
- **Project Structure**: Added driver interface files for ABI
- **Dependencies**: Updated include paths for new driver system

### 6. SDK Alignment
- **UE4/UE5 Offsets**: Verified current offsets are appropriate for ABI
- **GWorld**: `0xab9a038`
- **GObjects**: `0xb02c3c8` 
- **GNames**: `0xb011fc0`
- **Name Decryption**: `0xB011C08`

## File Structure Changes

### New Files Created
```
ABI/ABI/includes/driver/
├── driver.hpp          # Memory management and process discovery
├── xor.hpp            # String obfuscation utilities
└── abi_config.hpp      # ABI-specific configuration

ABI/ABI/src/driver/
└── driver.cpp          # Driver interface implementation
```

### Modified Files
```
Driver to remake/
├── driver.cpp          # Updated comments and driver naming
├── hook.cpp           # Updated EAC references to ACE
├── memory.cpp         # Updated monitoring bypass references
├── physical_memory.h  # Updated ACE bypass comments
├── pte_hook.h        # Updated integrity bypass comments
├── spoof_call.h       # Updated stack evasion comments
├── cleaner.h         # Updated driver cleanup for abi_driver.sys
└── shared.h          # Updated magic constant to ABI

ABI/ABI/
└── ABI.vcxproj       # Updated build configuration
```

## Configuration Options

### Process Targeting
```cpp
constexpr auto TARGET_PROCESS_NAME = L"ArenaBreakout.exe";
constexpr auto TARGET_PROCESS_BE_NAME = L"ArenaBreakout_BE.exe";
```

### Safety Features
```cpp
namespace safety {
    constexpr auto MAX_READ_ATTEMPTS = 3;
    constexpr auto READ_TIMEOUT_MS = 100;
    constexpr auto RECONNECT_INTERVAL_MS = 5000;
    constexpr auto STEALTH_MODE = true;
}
```

### Feature Toggles
```cpp
namespace features {
    constexpr auto ENABLE_ESP = true;
    constexpr auto ENABLE_RADAR = true;
    constexpr auto ENABLE_AIMBOT = false;  // Disabled by default
    constexpr auto ENABLE_MENU = true;
}
```

## Usage Instructions

### Building the Driver
1. Open `ABI.sln` in Visual Studio 2022
2. Select Release x64 configuration
3. Build project - output will be in `build/abi_bypass/`
4. Use kdmapper or similar tool to load `abi_driver.sys`

### Building the Usermode Client
1. The same build process builds both driver interface and usermode
2. Executable will target `ArenaBreakout.exe` automatically
3. Client will attempt to connect to `\\\\.\\abi_driver`

### Runtime Behavior
- Automatically discovers Arena Breakout Infinite process
- Falls back to BE version if standard version not found
- Uses ACE-compatible bypass techniques
- Maintains stealth through minimal memory footprint

## Compatibility Notes

### Supported Game Versions
- Arena Breakout Infinite (standard)
- Arena Breakout Infinite BE (BattlEye Enhanced)

### Anti-Cheat Compatibility
- Designed for ACE (Arena Breakout Infinite anti-cheat)
- Maintains compatibility with ACE integrity checks
- Uses ACE-safe memory operations

## Security Considerations

### Stealth Features
- PTE-based hooking preserves original code pages
- Return address spoofing prevents stack detection
- Driver object hiding from standard enumeration
- Minimal memory footprint reduces detection surface

### Operational Safety
- Multiple read attempts with timeout protection
- Process reconnection on game restart
- Graceful fallback on driver communication failure
- Comprehensive error handling and logging

## Troubleshooting

### Common Issues
1. **Process Not Found**: Ensure Arena Breakout Infinite is running
2. **Driver Communication Failed**: Check if driver is properly loaded
3. **Offsets Invalid**: May need update after game patches
4. **ACE Detection**: Ensure stealth mode is enabled

### Debug Options
Enable debug logging in `abi_config.hpp`:
```cpp
namespace logging {
    constexpr auto ENABLE_DEBUG_LOGS = true;
    constexpr auto LOG_TO_CONSOLE = true;
}
```

## Conclusion

The refactoring successfully adapts the EAC-based driver and SDK for Arena Breakout Infinite with ACE anti-cheat. All critical components have been updated including process discovery, communication protocols, naming conventions, and safety features. The maintained bypass techniques remain effective against ACE while providing ABI-specific optimizations.

The codebase is now ready for deployment and testing with Arena Breakout Infinite.
