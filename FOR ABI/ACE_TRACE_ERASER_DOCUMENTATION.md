# ACE Trace Eraser - Usage Documentation

## Overview
Comprehensive kernel-mode utility for erasing traces of manually mapped drivers to bypass ACE (Anti-Cheat Expert) in Arena Breakout Infinite.

## Key Functions

### 1. CleanPiDDBCacheTable()
**Purpose**: Removes driver entry from PiDDB cache table to prevent ACE from detecting loaded drivers.

**Usage**:
```cpp
#include "ace_trace_eraser.h"

// In your driver initialization
NTSTATUS DriverEntry(PDRIVER_OBJECT DriverObject, PUNICODE_STRING RegistryPath) {
    // Clean PiDDB traces
    if (!CleanPiDDBCacheTable()) {
        DbgPrint("Failed to clean PiDDB cache table\\n");
        return STATUS_UNSUCCESSFUL;
    }
    
    DbgPrint("PiDDB cache cleaned successfully\\n");
    return STATUS_SUCCESS;
}
```

**Features**:
- Pattern scanning for Windows 10/11 compatibility
- Version-specific PiDDB lock patterns
- IntelGraphicsDriver.sys disguise
- Exception handling for ACE monitoring regions

### 2. ClearMmUnloadedDrivers()
**Purpose**: Clears the MmUnloadedDrivers array to prevent "Unloaded Driver" detection.

**Usage**:
```cpp
// After PiDDB cleaning
if (!ClearMmUnloadedDrivers()) {
    DbgPrint("Failed to clear MmUnloadedDrivers\\n");
    return STATUS_UNSUCCESSFUL;
}

DbgPrint("MmUnloadedDrivers cleared successfully\\n");
```

**Features**:
- Locates MmUnloadedDrivers via pattern scanning
- Safely shifts array or wipes specific entries
- Updates MmLastUnloadedDriverIndex
- Multiple driver name matching (IntelGraphicsDriver, IntelGraphics, GraphicsDriver)

### 3. ClearDriverSection()
**Purpose**: Nullifies DriverSection in DRIVER_OBJECT to hide from LDR enumeration.

**Usage**:
```cpp
// Hide from module enumeration
ClearDriverSection(DriverObject);
DbgPrint("DriverSection cleared\\n");
```

**Features**:
- Safe LDR_DATA_TABLE_ENTRY manipulation
- Nullifies DllBase, EntryPoint, SizeOfImage
- Clears FullDllName and BaseDllName
- Exception handling for protected memory regions

### 4. SpoofDriverInfo()
**Purpose**: Spoofs driver information to appear as legitimate Intel driver.

**Usage**:
```cpp
// Spoof as legitimate Intel graphics driver
SpoofDriverInfo(DriverObject);
DbgPrint("Driver information spoofed\\n");
```

**Features**:
- Disguises as igdkmd64.sys
- Sets legitimate size (1.25MB)
- Maintains plausible driver characteristics

### 5. CleanAllDriverTraces()
**Purpose**: Comprehensive trace cleaning combining all methods.

**Usage**:
```cpp
// Complete trace cleaning
if (!CleanAllDriverTraces(DriverObject)) {
    DbgPrint("Comprehensive trace cleaning failed\\n");
    return STATUS_UNSUCCESSFUL;
}

DbgPrint("All driver traces cleaned successfully\\n");
```

### 6. ValidateTraceCleaning()
**Purpose**: Validates that trace cleaning was successful.

**Usage**:
```cpp
// Verify cleaning worked
if (!ValidateTraceCleaning()) {
    DbgPrint("Trace cleaning validation failed\\n");
    return STATUS_UNSUCCESSFUL;
}

DbgPrint("Trace cleaning validation passed\\n");
```

## Pattern Signatures

### Windows 10 PiDDB Lock Pattern
```cpp
static const UCHAR PiDDBLockPattern_Win10[] = {
    0x48, 0x8D, 0x0D, 0x00, 0x00, 0x00, 0x00, // lea rcx, [PiDDBLock]
    0x48, 0x89, 0x0D, 0x00, 0x00, 0x00, 0x00, // mov [PiDDBLock], rcx
    0x4C, 0x8B, 0x0D, 0x00, 0x00, 0x00, 0x00, // mov r9, [PiDDBCacheTable]
    0x41, 0x54, 0x48, 0x8B, 0x4C, 0x24, 0x20  // push r12; mov rax, [rsp+20h]
};
```

### Windows 11 PiDDB Lock Pattern
```cpp
static const UCHAR PiDDBLockPattern_Win11[] = {
    0x48, 0x8D, 0x0D, 0x00, 0x00, 0x00, 0x00, // lea rcx, [PiDDBLock]
    0x48, 0x89, 0x0D, 0x00, 0x00, 0x00, 0x00, // mov [PiDDBLock], rcx
    0x4C, 0x8B, 0x15, 0x00, 0x00, 0x00, 0x00, // mov r10, [PiDDBCacheTable]
    0x41, 0x54, 0x48, 0x8B, 0x4C, 0x24, 0x20  // push r12; mov rax, [rsp+20h]
};
```

### MmUnloadedDrivers Pattern
```cpp
static const UCHAR MmUnloadedDriversPattern[] = {
    0x48, 0x8B, 0x0D, 0x00, 0x00, 0x00, 0x00, // mov rcx, [MmUnloadedDrivers]
    0x48, 0x8B, 0x15, 0x00, 0x00, 0x00, 0x00, // mov rdx, [MmLastUnloadedDriverIndex]
    0x4C, 0x8B, 0x0D, 0x00, 0x00, 0x00, 0x00, // mov r9, [MmUnloadedDrivers+8]
    0x44, 0x8B, 0x4C, 0x24, 0x20             // mov r8d, [rsp+20h]
};
```

## Integration Example

### Complete Driver Integration
```cpp
#include "ace_trace_eraser.h"

extern "C" NTSTATUS DriverEntry(PDRIVER_OBJECT DriverObject, PUNICODE_STRING RegistryPath) {
    UNREFERENCED_PARAMETER(RegistryPath);
    
    DbgPrint("IntelGraphicsDriver loading...\\n");
    
    // 1. Clean all traces
    if (!CleanAllDriverTraces(DriverObject)) {
        DbgPrint("Critical: Trace cleaning failed\\n");
        return STATUS_UNSUCCESSFUL;
    }
    
    // 2. Validate cleaning
    if (!ValidateTraceCleaning()) {
        DbgPrint("Warning: Trace cleaning validation failed\\n");
        // Continue anyway, but log warning
    }
    
    // 3. Continue with your driver initialization
    // ... your hook installation, communication setup, etc.
    
    DbgPrint("IntelGraphicsDriver loaded successfully\\n");
    return STATUS_SUCCESS;
}
```

## ACE Bypass Explanation

### Why This Works Against ACE

1. **PiDDB Cache Table**: ACE checks this list to see if any "unauthorized" drivers are loaded. By removing our entry, ACE thinks no additional drivers are present.

2. **MmUnloadedDrivers**: ACE monitors this array to detect recently unloaded drivers (common with manual mapping). Clearing it removes this detection vector.

3. **DriverSection Hiding**: ACE can enumerate loaded modules via LDR. Nullifying DriverSection removes us from this enumeration.

4. **Driver Spoofing**: By appearing as "igdkmd64.sys" (legitimate Intel driver), ACE is less likely to flag us as suspicious.

5. **Pattern Scanning**: Using patterns instead of hardcoded offsets ensures compatibility across Windows versions and makes detection harder.

## Safety Considerations

### Exception Handling
All functions use `__try/__except` blocks to prevent BSOD if ACE is monitoring the memory regions we're accessing.

### Version Compatibility
Separate patterns for Windows 10 and 11 ensure the utility works across different system versions.

### Stealth Operation
The utility operates in a way that minimizes detection surface:
- No direct calls to monitored APIs
- Pattern-based location finding
- Legitimate driver disguise
- Complete trace removal

## Troubleshooting

### Common Issues

1. **Pattern Scan Fails**
   - **Cause**: Windows version updated, patterns changed
   - **Solution**: Update patterns with new kernel dump

2. **PiDDB Cleaning Fails**
   - **Cause**: PiDDB structure location changed
   - **Solution**: Use Windows 11 pattern or update patterns

3. **BSOD on Loading**
   - **Cause**: ACE protecting kernel structures
   - **Solution**: Add more exception handling, check system integrity

4. **Driver Still Detected**
   - **Cause**: Incomplete cleaning or new detection methods
   - **Solution**: Use comprehensive cleaning, add additional spoofing

### Debug Mode
Enable debug logging by defining:
```cpp
#define DEBUG_TRACE_ERASER 1

#if DEBUG_TRACE_ERASER
#define DBG_PRINT(x) DbgPrint x
#else
#define DBG_PRINT(x)
#endif
```

## Conclusion

This utility provides comprehensive ACE bypass capabilities for Arena Breakout Infinite by:

- Removing all common detection vectors
- Using safe, exception-handled operations
- Maintaining compatibility across Windows versions
- Providing legitimate driver disguise

When integrated properly with your driver, it significantly reduces the risk of detection by ACE (Anti-Cheat Expert).
