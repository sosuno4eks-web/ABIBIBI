# KDMapper Auditor Integration Guide

## Overview
This guide explains how to integrate the KDMapper Auditor into your Arena Breakout cheat development workflow.

## Project Structure

```
custom KM/
├── kdmapper/                    # Your modified KDMapper
├── HelloWorld/                  # Your driver source
├── HelloWorld.sys               # Compiled driver
├── KDMapperAuditor/            # NEW - Stealth verification tool
│   ├── KDMapperAuditor.cpp
│   ├── KDMapperAuditor.vcxproj
│   ├── README.md
│   ├── USAGE_GUIDE.txt
│   ├── CHECKLIST.md
│   ├── SUMMARY.txt
│   └── run_auditor.bat
└── KDMAPPER_AUDITOR_INTEGRATION.md  # This file
```

## Complete Workflow

### Phase 1: Preparation
```
1. Modify KDMapper
   ├─ Change vulnerable driver (not iqvw64e.sys)
   ├─ Rename all internal strings
   ├─ Change device names
   ├─ Change IOCTL codes
   └─ Obfuscate string literals

2. Modify Driver (HelloWorld.sys)
   ├─ Implement MmUnloadedDrivers clearing
   ├─ Implement PiDDB cache clearing
   ├─ Remove debug strings
   └─ Add stealth features

3. Build Everything
   ├─ Build modified KDMapper
   ├─ Build HelloWorld.sys driver
   └─ Build KDMapperAuditor
```

### Phase 2: Testing (CRITICAL)
```
1. Load Driver
   cd "custom KM"
   kdmapper.exe HelloWorld.sys

2. Run Auditor
   cd "custom KM/KDMapperAuditor"
   run_auditor.bat
   
3. Review Results
   ├─ 7/7 Pass → Proceed to Phase 3
   └─ Failures → Fix issues, return to Phase 1
```

### Phase 3: Deployment
```
1. Load Driver (if not already loaded)
   cd "custom KM"
   kdmapper.exe HelloWorld.sys

2. Verify with Auditor
   cd "custom KM/KDMapperAuditor"
   run_auditor.bat
   
3. Load Client
   cd "client side/ABI/x64/Release"
   ABI.exe
   
4. Start Game
   Launch Arena Breakout
```

## Integration Points

### 1. KDMapper → Auditor
After loading driver with KDMapper, immediately run auditor:
```batch
@echo off
echo Loading driver...
kdmapper.exe HelloWorld.sys

if %ERRORLEVEL% EQU 0 (
    echo Driver loaded successfully
    echo Running auditor...
    cd KDMapperAuditor
    run_auditor.bat
) else (
    echo Driver load failed!
    pause
)
```

### 2. Auditor → Client
Only start client if auditor passes:
```batch
@echo off
cd KDMapperAuditor
KDMapperAuditor.exe > audit_result.txt

findstr /C:"Tests Passed: 7/7" audit_result.txt
if %ERRORLEVEL% EQU 0 (
    echo Auditor passed - starting client
    cd "../client side/ABI/x64/Release"
    ABI.exe
) else (
    echo Auditor failed - DO NOT START CLIENT
    type audit_result.txt
    pause
)
```

### 3. Complete Automation Script
Create `custom KM/launch_secure.bat`:
```batch
@echo off
echo ========================================
echo   Secure Launch Script
echo ========================================
echo.

REM Step 1: Load driver
echo [1/4] Loading driver...
kdmapper.exe HelloWorld.sys
if %ERRORLEVEL% NEQ 0 (
    echo [ERROR] Driver load failed!
    pause
    exit /b 1
)
echo [OK] Driver loaded
echo.

REM Step 2: Run auditor
echo [2/4] Running security audit...
cd KDMapperAuditor
KDMapperAuditor.exe > audit_result.txt
cd ..

REM Step 3: Check results
findstr /C:"Tests Passed: 7/7" KDMapperAuditor\audit_result.txt
if %ERRORLEVEL% NEQ 0 (
    echo [ERROR] Security audit failed!
    echo [ERROR] DO NOT PROCEED!
    type KDMapperAuditor\audit_result.txt
    pause
    exit /b 1
)
echo [OK] Security audit passed (7/7)
echo.

REM Step 4: Start client
echo [3/4] Starting client...
cd "client side/ABI/x64/Release"
start ABI.exe
cd "../../../../custom KM"
echo [OK] Client started
echo.

echo [4/4] Ready to launch game
echo.
echo ========================================
echo   All systems secure - ready to play
echo ========================================
pause
```

## Auditor Customization for Your Setup

### Add Your Driver Name
Edit `KDMapperAuditor/KDMapperAuditor.cpp`:
```cpp
const char* VULNERABLE_DRIVERS[] = {
    "HelloWorld.sys",        // Add your driver name
    "YourCustomDriver.sys",  // Add any custom names
    // ... existing entries
    nullptr
};
```

### Add Your Custom Strings
```cpp
const char* SUSPICIOUS_STRINGS[] = {
    "HelloWorld",            // Add your driver strings
    "YourMapperName",        // Add your mapper name
    // ... existing entries
    nullptr
};
```

### Add Your IOCTL Codes
```cpp
#define IOCTL_YOUR_MAPPER_READ  CTL_CODE(FILE_DEVICE_UNKNOWN, 0xYYY, METHOD_BUFFERED, FILE_ANY_ACCESS)
// Add your custom IOCTLs
```

## Testing Schedule

### Before Each Session
```
1. Run auditor
2. Verify 7/7 pass
3. If pass → proceed
4. If fail → investigate and fix
```

### After Modifications
```
1. Modify mapper/driver
2. Rebuild
3. Load driver
4. Run auditor
5. Verify 7/7 pass
6. Document changes
```

### After Updates
```
Windows Update:
├─ Run auditor
├─ Check for new detection methods
└─ Update stealth if needed

Game Update:
├─ Run auditor
├─ Update offsets (client side)
└─ Test functionality

Anti-Cheat Update:
├─ Run auditor immediately
├─ Check for new traces
└─ Update stealth techniques
```

## Troubleshooting Integration

### Issue: Auditor fails after mapper works
**Cause**: Mapper left traces  
**Fix**: Review failed tests, implement cleanup

### Issue: Client fails after auditor passes
**Cause**: Communication issue, not stealth issue  
**Fix**: Check driver communication, not auditor

### Issue: Auditor passes but game detects
**Cause**: New detection method not covered by auditor  
**Fix**: Investigate detection, update auditor tests

## Best Practices

### 1. Always Run Auditor
- Before each gaming session
- After any modifications
- After system updates
- If anything seems suspicious

### 2. Document Results
- Save auditor output
- Note any failures
- Track fixes applied
- Monitor trends

### 3. Maintain Backups
- Working mapper configuration
- Working driver build
- Auditor results
- Clean system state

### 4. Test in Safe Environment
- Use test account first
- Monitor for detection
- Verify functionality
- Document behavior

## Integration with Client

### Client Startup Check
Add to `client side/ABI/src/main.cpp`:
```cpp
bool VerifyDriverStealth() {
    // Run auditor programmatically
    STARTUPINFO si = { sizeof(si) };
    PROCESS_INFORMATION pi;
    
    if (CreateProcess(
        "..\\..\\..\\custom KM\\KDMapperAuditor\\x64\\Release\\KDMapperAuditor.exe",
        NULL, NULL, NULL, FALSE, 0, NULL, NULL, &si, &pi)) {
        
        WaitForSingleObject(pi.hProcess, INFINITE);
        
        DWORD exitCode;
        GetExitCodeProcess(pi.hProcess, &exitCode);
        
        CloseHandle(pi.hProcess);
        CloseHandle(pi.hThread);
        
        return exitCode == 0; // 0 = all tests passed
    }
    
    return false;
}

int main() {
    // ... existing code ...
    
    if (!VerifyDriverStealth()) {
        std::println("[ERROR] Driver stealth verification failed!");
        std::println("[ERROR] DO NOT PROCEED - traces detected!");
        std::cin.get();
        return 1;
    }
    
    // ... continue with normal startup ...
}
```

## Continuous Monitoring

### Daily Checks
```batch
REM daily_check.bat
@echo off
echo Running daily security check...
cd "custom KM/KDMapperAuditor"
KDMapperAuditor.exe > daily_check_%date:~-4,4%%date:~-10,2%%date:~-7,2%.txt
echo Results saved to daily_check_%date:~-4,4%%date:~-10,2%%date:~-7,2%.txt
```

### Automated Monitoring
```batch
REM monitor.bat
@echo off
:loop
echo [%time%] Running security check...
cd "custom KM/KDMapperAuditor"
KDMapperAuditor.exe > monitor_log.txt

findstr /C:"Tests Passed: 7/7" monitor_log.txt
if %ERRORLEVEL% NEQ 0 (
    echo [ALERT] Security check failed!
    echo [ALERT] Stopping all processes!
    taskkill /F /IM ABI.exe
    taskkill /F /IM ArenaBreakout.exe
    pause
    exit /b 1
)

timeout /t 3600 /nobreak
goto loop
```

## Summary

### Critical Integration Points
1. **After driver load** → Run auditor
2. **Before client start** → Verify auditor passed
3. **Before game launch** → Confirm all secure
4. **During session** → Monitor for issues

### Success Criteria
- ✅ Auditor passes (7/7)
- ✅ Driver loads successfully
- ✅ Client connects to driver
- ✅ Game runs without detection

### Failure Response
- ❌ Auditor fails → DO NOT PROCEED
- ❌ Fix issues immediately
- ❌ Re-test until 7/7 pass
- ❌ Document what was fixed

---

**Integration Complete** - KDMapper Auditor is now part of your secure workflow.
