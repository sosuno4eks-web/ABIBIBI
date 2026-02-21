# KDMapper Auditor

## Overview
KDMapper Auditor is a comprehensive stealth verification tool designed to detect traces left by kernel driver mappers. It's specifically tailored to test against ACE Anti-Cheat (Tencent) used in Arena Breakout Infinite.

## Purpose
After modifying KDMapper to use a different vulnerable driver and renaming internal strings, this tool verifies that no detectable traces remain on Windows 10 22H2 that could be flagged by anti-cheat systems.

## Features

### 7 Comprehensive Tests

#### 1. String Scan in System Memory
- Scans all loaded kernel modules for suspicious strings
- Checks for common mapper-related terms: "kdmapper", "intel_driver", "manual map", etc.
- Detects vulnerable driver names: iqvw64e.sys, capcom.sys, gdrv.sys, etc.
- **Detection Method**: Enumerates loaded kernel modules via NtQuerySystemInformation

#### 2. MmUnloadedDrivers Trace Check
- Verifies if vulnerable driver traces remain in the unloaded driver list
- Checks registry for driver service entries
- Looks for remnants that ACE might scan
- **Detection Method**: Registry enumeration and service key checks

#### 3. PiDDBCacheTable Verification
- Checks if driver entries are properly removed from PiDDB cache
- Scans for driver files in System32\drivers
- Verifies Code Integrity database entries
- **Detection Method**: File system and CI registry checks

#### 4. System Event Log Scan
- Scans Windows Event Viewer for driver load events
- Checks Event IDs: 7045 (Service Install), 7036 (Service State), 219 (Driver Load)
- Searches for suspicious driver names and mapper strings
- **Detection Method**: Event log enumeration (last 1000 events)

#### 5. IOCTL Verification
- Attempts to communicate with standard KDMapper IOCTLs
- Tests common device names: \\\\.\\iqvw64e, \\\\.\\kdmapper, etc.
- Verifies if "ghost" handlers are still responding
- **Detection Method**: CreateFile and DeviceIoControl attempts

#### 6. Handle Enumeration
- Checks for suspicious driver handles in system processes
- Enumerates all running processes
- Looks for handles to vulnerable drivers
- **Detection Method**: Process and handle enumeration

#### 7. Driver Signature Check
- Verifies if test signing is enabled (suspicious)
- Checks Code Integrity configuration
- Detects unsigned or test-signed drivers
- **Detection Method**: Registry CI configuration check

## Usage

### Prerequisites
- Windows 10 22H2 (Build 19045)
- Administrator privileges (required for most checks)
- Visual Studio 2022 (for building)

### Building
```batch
# Open in Visual Studio
Open KDMapperAuditor.vcxproj

# Or build from command line
msbuild KDMapperAuditor.vcxproj /p:Configuration=Release /p:Platform=x64
```

### Running
```batch
# Run as Administrator
KDMapperAuditor.exe
```

### Expected Output
```
╔══════════════════════════════════════════════════════════════════════════════╗
║                        KDMapper Auditor v1.0                                 ║
║                   Stealth Verification Tool for ACE                          ║
║                        Windows 10 22H2 Compatible                            ║
╚══════════════════════════════════════════════════════════════════════════════╝

[INFO] Target: Arena Breakout Infinite (ACE Anti-Cheat)
[INFO] System: Windows 10 22H2 (Build 19045)
[INFO] Debug privilege enabled

=== TEST 1: String Scan in System Memory ===
[INFO] Scanning loaded kernel modules for suspicious strings...
[INFO] No suspicious strings found in loaded modules
[SECURE] String Scan

=== TEST 2: MmUnloadedDrivers Trace Check ===
[INFO] Checking for unloaded driver traces...
[INFO] No suspicious registry service entries found
[SECURE] MmUnloadedDrivers Check

=== TEST 3: PiDDBCacheTable Verification ===
[INFO] Checking PiDDB cache for driver traces...
[INFO] No PiDDB cache traces found
[SECURE] PiDDBCache Check

=== TEST 4: System Event Log Scan ===
[INFO] Scanning Windows Event Logs for driver load events...
[INFO] No suspicious event log entries found
[SECURE] Event Log Scan

=== TEST 5: IOCTL Verification ===
[INFO] Testing for active KDMapper IOCTL handlers...
[INFO] No active KDMapper IOCTL handlers found
[SECURE] IOCTL Verification

=== TEST 6: Handle Enumeration Check ===
[INFO] Checking for suspicious driver handles...
[INFO] No suspicious handles detected
[SECURE] Handle Enumeration

=== TEST 7: Driver Signature Verification ===
[INFO] Checking for unsigned or test-signed drivers...
[INFO] Test signing is disabled (good)
[SECURE] Driver Signature Check

=== AUDIT SUMMARY ===

Tests Passed: 7/7

[✓] ALL TESTS PASSED - Mapper appears SECURE
[✓] No obvious traces detected
[✓] Should be safe against ACE detection
```

## Color Coding
- **GREEN [SECURE]**: Test passed, no traces detected
- **RED [VULNERABLE]**: Test failed, traces detected
- **YELLOW [WARNING]**: Non-critical warning
- **CYAN**: Headers and titles
- **WHITE**: General information

## What Each Test Detects

### ACE Anti-Cheat Detection Vectors

#### String Scanning
ACE scans kernel memory for known mapper strings. This test verifies your renamed strings aren't detectable.

#### MmUnloadedDrivers
ACE checks the unloaded driver list for vulnerable drivers. This test ensures proper cleanup.

#### PiDDBCache
ACE may check the driver database cache. This test verifies entries are removed, not just hidden.

#### Event Logs
ACE can check Windows Event Viewer for driver load events. This test scans for suspicious entries.

#### IOCTL Handlers
ACE may attempt to communicate with known mapper IOCTLs. This test verifies handlers are removed.

#### Handle Enumeration
ACE can enumerate handles to detect driver access. This test checks for suspicious handles.

#### Signature Verification
ACE checks if test signing is enabled (red flag). This test verifies proper configuration.

## Interpreting Results

### All Tests Pass (7/7)
✅ Your mapper modifications are effective  
✅ No obvious traces remain  
✅ Should be safe against ACE detection  
✅ Ready for deployment

### Some Tests Fail
❌ Traces detected - review failed tests  
❌ Clean up identified issues  
❌ Re-run auditor after cleanup  
❌ Do NOT use until all tests pass

## Common Issues and Fixes

### Test 1 Fails (String Scan)
**Issue**: Suspicious strings found in loaded modules  
**Fix**: 
- Rename all internal strings in your mapper
- Change device names
- Obfuscate string literals
- Rebuild and reload driver

### Test 2 Fails (MmUnloadedDrivers)
**Issue**: Driver traces in unloaded list or registry  
**Fix**:
- Implement MmUnloadedDrivers clearing in driver
- Delete registry service keys
- Use StorageClearMmUnloadedDrivers() function

### Test 3 Fails (PiDDBCache)
**Issue**: Driver entries remain in PiDDB cache  
**Fix**:
- Implement PiDDB cache clearing in driver
- Delete driver files after use
- Use StorageWipePiDDBCacheTable() function

### Test 4 Fails (Event Log)
**Issue**: Driver load events in Event Viewer  
**Fix**:
- Clear System event log after driver load
- Use event log manipulation techniques
- Load driver before game starts

### Test 5 Fails (IOCTL)
**Issue**: IOCTL handlers still responding  
**Fix**:
- Change IOCTL codes in your mapper
- Rename device objects
- Ensure proper cleanup on unload

### Test 6 Fails (Handle Enumeration)
**Issue**: Suspicious handles detected  
**Fix**:
- Close all handles before unloading
- Don't leave handles open in processes
- Use handle obfuscation techniques

### Test 7 Fails (Signature Check)
**Issue**: Test signing enabled  
**Fix**:
- Disable test signing: `bcdedit /set testsigning off`
- Use proper vulnerable driver exploit
- Don't rely on test-signed drivers

## Advanced Usage

### Custom String List
Edit `SUSPICIOUS_STRINGS[]` array to add your own strings to scan for:
```cpp
const char* SUSPICIOUS_STRINGS[] = {
    "your_custom_string",
    "your_driver_name",
    // ...
};
```

### Custom Driver List
Edit `VULNERABLE_DRIVERS[]` array to add your vulnerable driver:
```cpp
const char* VULNERABLE_DRIVERS[] = {
    "your_driver.sys",
    // ...
};
```

### Custom IOCTL Codes
Edit IOCTL definitions to match your mapper:
```cpp
#define IOCTL_YOUR_MAPPER_READ  CTL_CODE(FILE_DEVICE_UNKNOWN, 0xXXX, METHOD_BUFFERED, FILE_ANY_ACCESS)
```

## Integration with Workflow

### Recommended Workflow
1. Modify KDMapper (rename strings, change driver, etc.)
2. Build modified mapper
3. Load driver via modified mapper
4. **Run KDMapper Auditor**
5. If all tests pass → proceed to load game
6. If tests fail → fix issues and repeat

### Continuous Testing
- Run auditor after every mapper modification
- Run auditor before each gaming session
- Run auditor after Windows updates
- Run auditor if anti-cheat updates

## Limitations

### What This Tool CANNOT Detect
- Behavioral analysis by anti-cheat
- Kernel-mode anti-cheat scanning
- Hardware-based detection (TPM, etc.)
- Network-based detection
- Advanced heuristics

### What This Tool CAN Detect
- Static traces in memory
- Registry artifacts
- File system artifacts
- Event log entries
- Active IOCTL handlers
- Suspicious handles
- Configuration issues

## Security Considerations

### Running the Auditor
- Run as Administrator (required)
- Run on clean system (no other cheats)
- Run before starting game
- Don't run while game is active

### False Positives
- Some legitimate drivers may trigger warnings
- Review each detection carefully
- Verify if it's related to your mapper

### False Negatives
- Tool may not detect all traces
- Anti-cheat may use unknown detection methods
- Always test in safe environment first

## Building from Source

### Requirements
- Visual Studio 2022
- Windows 10 SDK
- C++20 support

### Build Steps
```batch
# Clone or extract source
cd KDMapperAuditor

# Open project
start KDMapperAuditor.vcxproj

# Build in Visual Studio
# Or use MSBuild:
msbuild KDMapperAuditor.vcxproj /p:Configuration=Release /p:Platform=x64
```

### Output
```
KDMapperAuditor/x64/Release/KDMapperAuditor.exe
```

## Troubleshooting

### "Failed to enable debug privilege"
- Run as Administrator
- Check User Account Control settings

### "Failed to query system module information"
- Run as Administrator
- Check Windows security settings

### "Failed to open System event log"
- Run as Administrator
- Check Event Log service is running

### No output or crashes
- Check Windows version (requires 10 22H2)
- Verify x64 architecture
- Run in compatibility mode if needed

## Credits
- **Target**: Arena Breakout Infinite
- **Anti-Cheat**: ACE (Tencent)
- **Platform**: Windows 10 22H2
- **Purpose**: Stealth verification

## License
For educational and testing purposes only. Use at your own risk.

---

**KDMapper Auditor** - Verify your mapper's stealth before deployment.
