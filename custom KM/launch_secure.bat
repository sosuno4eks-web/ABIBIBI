@echo off
REM ============================================================================
REM Secure Launch Script for Arena Breakout Cheat
REM Integrates: KDMapper → Auditor → Client → Game
REM ============================================================================

title Arena Breakout - Secure Launch

REM Check for Administrator privileges
net session >nul 2>&1
if %errorLevel% NEQ 0 (
    echo [ERROR] This script requires Administrator privileges!
    echo [ERROR] Right-click and select "Run as Administrator"
    pause
    exit /b 1
)

echo.
echo ╔══════════════════════════════════════════════════════════════════════════════╗
echo ║                    Arena Breakout - Secure Launch                            ║
echo ║                         Integrated Workflow                                  ║
echo ╚══════════════════════════════════════════════════════════════════════════════╝
echo.

REM ============================================================================
REM STEP 1: Pre-Flight Checks
REM ============================================================================
echo [STEP 1/5] Pre-Flight Checks
echo ────────────────────────────────────────────────────────────────────────────────

REM Check if driver exists
if not exist "HelloWorld.sys" (
    echo [ERROR] HelloWorld.sys not found!
    echo [ERROR] Please build the driver first.
    pause
    exit /b 1
)
echo [OK] Driver file found

REM Check if kdmapper exists
if not exist "kdmapper.exe" (
    echo [ERROR] kdmapper.exe not found!
    echo [ERROR] Please build KDMapper first.
    pause
    exit /b 1
)
echo [OK] KDMapper found

REM Check if auditor exists
if not exist "KDMapperAuditor\x64\Release\KDMapperAuditor.exe" (
    if not exist "KDMapperAuditor\KDMapperAuditor.exe" (
        echo [ERROR] KDMapperAuditor.exe not found!
        echo [ERROR] Please build the auditor first.
        pause
        exit /b 1
    )
)
echo [OK] Auditor found

REM Check if client exists
if not exist "..\client side\ABI\x64\Release\ABI.exe" (
    echo [ERROR] ABI.exe not found!
    echo [ERROR] Please build the client first.
    pause
    exit /b 1
)
echo [OK] Client found

echo [OK] All files present
echo.

REM ============================================================================
REM STEP 2: Load Driver
REM ============================================================================
echo [STEP 2/5] Loading Driver
echo ────────────────────────────────────────────────────────────────────────────────

echo [INFO] Loading HelloWorld.sys via KDMapper...
kdmapper.exe HelloWorld.sys

if %ERRORLEVEL% NEQ 0 (
    echo [ERROR] Driver load failed!
    echo [ERROR] Check kdmapper output above for details.
    echo.
    echo Possible causes:
    echo   - Vulnerable driver not found
    echo   - Driver signature issues
    echo   - System incompatibility
    echo   - Anti-cheat blocking
    pause
    exit /b 1
)

echo [OK] Driver loaded successfully
echo.

REM Wait for driver to initialize
echo [INFO] Waiting for driver initialization...
timeout /t 2 /nobreak >nul
echo [OK] Driver initialized
echo.

REM ============================================================================
REM STEP 3: Security Audit (CRITICAL)
REM ============================================================================
echo [STEP 3/5] Security Audit
echo ────────────────────────────────────────────────────────────────────────────────

echo [INFO] Running KDMapper Auditor...
echo [INFO] This will verify no traces remain...
echo.

REM Run auditor and save results
if exist "KDMapperAuditor\x64\Release\KDMapperAuditor.exe" (
    cd KDMapperAuditor\x64\Release
    KDMapperAuditor.exe > ..\..\..\audit_result.txt
    cd ..\..\..
) else (
    cd KDMapperAuditor
    KDMapperAuditor.exe > ..\audit_result.txt
    cd ..
)

echo.
echo [INFO] Analyzing audit results...

REM Check if all tests passed
findstr /C:"Tests Passed: 7/7" audit_result.txt >nul
if %ERRORLEVEL% NEQ 0 (
    echo.
    echo ╔══════════════════════════════════════════════════════════════════════════════╗
    echo ║                          SECURITY AUDIT FAILED                               ║
    echo ╚══════════════════════════════════════════════════════════════════════════════╝
    echo.
    echo [ERROR] Security audit did not pass all tests!
    echo [ERROR] DO NOT PROCEED - traces detected!
    echo.
    echo Audit results:
    echo ────────────────────────────────────────────────────────────────────────────────
    type audit_result.txt
    echo ────────────────────────────────────────────────────────────────────────────────
    echo.
    echo [ACTION REQUIRED]
    echo 1. Review failed tests above
    echo 2. Fix identified issues
    echo 3. Rebuild driver/mapper
    echo 4. Run this script again
    echo.
    pause
    exit /b 1
)

echo [OK] Security audit passed (7/7 tests)
echo [OK] No traces detected
echo [OK] Safe to proceed
echo.

REM ============================================================================
REM STEP 4: Start Client
REM ============================================================================
echo [STEP 4/5] Starting Client
echo ────────────────────────────────────────────────────────────────────────────────

echo [INFO] Launching ABI client...
cd "..\client side\ABI\x64\Release"
start "" ABI.exe
cd "..\..\..\..\custom KM"

REM Wait for client to initialize
timeout /t 3 /nobreak >nul

REM Check if client is running
tasklist /FI "IMAGENAME eq ABI.exe" 2>NUL | find /I /N "ABI.exe">NUL
if %ERRORLEVEL% NEQ 0 (
    echo [ERROR] Client failed to start!
    echo [ERROR] Check client output for errors.
    pause
    exit /b 1
)

echo [OK] Client started successfully
echo.

REM ============================================================================
REM STEP 5: Ready to Launch Game
REM ============================================================================
echo [STEP 5/5] Ready for Game
echo ────────────────────────────────────────────────────────────────────────────────

echo.
echo ╔══════════════════════════════════════════════════════════════════════════════╗
echo ║                         ALL SYSTEMS SECURE                                   ║
echo ╚══════════════════════════════════════════════════════════════════════════════╝
echo.
echo [✓] Driver loaded and verified
echo [✓] Security audit passed (7/7)
echo [✓] Client running
echo [✓] Ready to launch Arena Breakout
echo.
echo ────────────────────────────────────────────────────────────────────────────────
echo   NEXT STEPS:
echo   1. Launch Arena Breakout normally
echo   2. Wait for game to reach main menu
echo   3. Client will automatically connect
echo   4. Enjoy the game!
echo ────────────────────────────────────────────────────────────────────────────────
echo.
echo [WARNING] Do NOT close this window - it contains important logs
echo.

REM Save launch log
echo Launch successful at %date% %time% > launch_log.txt
echo Driver: HelloWorld.sys >> launch_log.txt
echo Audit: PASSED (7/7) >> launch_log.txt
echo Client: ABI.exe >> launch_log.txt

echo [INFO] Launch log saved to launch_log.txt
echo.

REM Wait for user to launch game
echo Press any key when you're ready to launch the game...
pause >nul

echo.
echo [INFO] You can now launch Arena Breakout
echo [INFO] This window will remain open for monitoring
echo.

REM Monitor for issues
:monitor_loop
timeout /t 10 /nobreak >nul

REM Check if client is still running
tasklist /FI "IMAGENAME eq ABI.exe" 2>NUL | find /I /N "ABI.exe">NUL
if %ERRORLEVEL% NEQ 0 (
    echo.
    echo [WARNING] Client has stopped!
    echo [WARNING] Check for crashes or detection
    echo.
    goto :end_monitor
)

REM Check if game is running
tasklist /FI "IMAGENAME eq ArenaBreakout.exe" 2>NUL | find /I /N "ArenaBreakout.exe">NUL
if %ERRORLEVEL% EQU 0 (
    echo [%time%] Game and client running normally
)

goto :monitor_loop

:end_monitor
echo.
echo ────────────────────────────────────────────────────────────────────────────────
echo   Session ended
echo ────────────────────────────────────────────────────────────────────────────────
echo.
pause
exit /b 0
