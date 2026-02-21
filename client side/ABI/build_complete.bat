@echo off
REM ============================================================================
REM Complete Build Script - Driver + Client
REM 
REM This script builds both the driver and client with all security fixes
REM integrated. Always use Clean + Rebuild to regenerate compile-time seeds.
REM ============================================================================

echo.
echo ========================================================================
echo  Arena Breakout Ghost Mode - Complete Build
echo ========================================================================
echo.

REM Check if Visual Studio is available
where msbuild >nul 2>&1
if %ERRORLEVEL% NEQ 0 (
    echo [ERROR] MSBuild not found. Please run this from Visual Studio Developer Command Prompt.
    pause
    exit /b 1
)

echo [1/4] Building Driver...
echo.

REM Build driver
cd ..\..\Driver
msbuild MyDriver1.sln /t:Clean /p:Configuration=Release /p:Platform=x64 /v:minimal
if %ERRORLEVEL% NEQ 0 (
    echo [ERROR] Driver clean failed
    pause
    exit /b 1
)

msbuild MyDriver1.sln /t:Rebuild /p:Configuration=Release /p:Platform=x64 /v:minimal
if %ERRORLEVEL% NEQ 0 (
    echo [ERROR] Driver build failed
    pause
    exit /b 1
)

echo.
echo [SUCCESS] Driver built: Driver\x64\Release\RtkAudioService.sys
echo.

REM Check driver size
if exist "x64\Release\RtkAudioService.sys" (
    for %%A in ("x64\Release\RtkAudioService.sys") do (
        echo Driver size: %%~zA bytes
    )
) else (
    echo [ERROR] Driver file not found
    pause
    exit /b 1
)

echo.
echo [2/4] Building Client...
echo.

REM Build client
cd "..\client side\ABI"
msbuild ABI.sln /t:Clean /p:Configuration=Release /p:Platform=x64 /v:minimal
if %ERRORLEVEL% NEQ 0 (
    echo [ERROR] Client clean failed
    pause
    exit /b 1
)

msbuild ABI.sln /t:Rebuild /p:Configuration=Release /p:Platform=x64 /v:minimal
if %ERRORLEVEL% NEQ 0 (
    echo [ERROR] Client build failed
    pause
    exit /b 1
)

echo.
echo [SUCCESS] Client built: client side\ABI\build\abi_bypass\RtkAudioUniversalService.exe
echo.

REM Check client size
if exist "build\abi_bypass\RtkAudioUniversalService.exe" (
    for %%A in ("build\abi_bypass\RtkAudioUniversalService.exe") do (
        echo Client size: %%~zA bytes
    )
) else (
    echo [ERROR] Client file not found
    pause
    exit /b 1
)

echo.
echo [3/4] Running Security Verification...
echo.

REM Verify no plaintext strings
echo Checking for plaintext strings...
strings build\abi_bypass\RtkAudioUniversalService.exe | findstr /i "insert getasynckey 0xDC 0x2B" >nul 2>&1
if %ERRORLEVEL% EQU 0 (
    echo [WARNING] Found plaintext strings in binary
) else (
    echo [OK] No plaintext strings found
)

echo.
echo [4/4] Build Summary
echo.
echo ========================================================================
echo  Build Complete
echo ========================================================================
echo.
echo Driver:  ..\..\Driver\x64\Release\RtkAudioService.sys
echo Client:  build\abi_bypass\RtkAudioUniversalService.exe
echo.
echo Security Features:
echo   [+] Ghost Mode (NO IOCTLs)
echo   [+] Polymorphic obfuscation
echo   [+] Anti-screenshot (WDA_EXCLUDEFROMCAPTURE)
echo   [+] Stale buffer technique
echo   [+] Flicker technique
echo   [+] Kernel keyboard monitoring
echo   [+] Mutated key codes
echo   [+] NO GetAsyncKeyState
echo   [+] Backslash key toggle
echo.
echo Next Steps:
echo   1. Run KDMapper Auditor to verify driver security
echo   2. Load driver: kdmapper.exe RtkAudioService.sys
echo   3. Run client: RtkAudioUniversalService.exe
echo   4. Press Backslash (\) to toggle aimbot
echo   5. Press Escape to exit
echo   6. Verify identity spoof (check file properties)
echo.
echo ========================================================================
echo.

pause
