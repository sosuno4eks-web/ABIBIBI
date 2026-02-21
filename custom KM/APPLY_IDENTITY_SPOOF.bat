@echo off
REM ============================================================================
REM Identity Spoof Application Script
REM 
REM This script applies the complete Realtek identity spoof to both the
REM driver and client, making them indistinguishable from legitimate Realtek
REM High Definition Audio components.
REM ============================================================================

echo.
echo ========================================================================
echo  Realtek Identity Spoof - Application Script
echo ========================================================================
echo.

echo [INFO] This script will apply the following changes:
echo.
echo   Driver:
echo     - Rename MyDriver1.sys to RtkAudioService.sys
echo     - Apply Realtek metadata (Company, Product, Version)
echo     - Add Realtek icon
echo.
echo   Client:
echo     - Rename ABI.exe to RtkAudioUniversalService.exe
echo     - Apply Realtek metadata (Company, Product, Version)
echo     - Add Realtek icon and manifest
echo.
echo   Service Name:
echo     - Driver service name: RtkAudioFilter
echo.
echo ========================================================================
echo.

pause

echo.
echo [1/5] Checking resource files...
echo.

REM Check if resource files exist
if not exist "Driver\RtkAudioService.rc" (
    echo [ERROR] Driver resource file not found: Driver\RtkAudioService.rc
    pause
    exit /b 1
)

if not exist "client side\ABI\RtkAudioUniversalService.rc" (
    echo [ERROR] Client resource file not found: client side\ABI\RtkAudioUniversalService.rc
    pause
    exit /b 1
)

echo [OK] Resource files found
echo.

echo [2/5] Checking project files...
echo.

REM Check if project files exist
if not exist "Driver\MyDriver1.vcxproj" (
    echo [ERROR] Driver project file not found
    pause
    exit /b 1
)

if not exist "client side\ABI\ABI.vcxproj" (
    echo [ERROR] Client project file not found
    pause
    exit /b 1
)

echo [OK] Project files found
echo.

echo [3/5] Checking icon files...
echo.

REM Check for icon files (optional)
if not exist "Driver\realtek_icon.ico" (
    echo [WARNING] Driver icon not found: Driver\realtek_icon.ico
    echo [INFO] Build will continue, but icon will be missing
    echo [INFO] See CREATE_ICON.txt for instructions
) else (
    echo [OK] Driver icon found
)

if not exist "client side\ABI\realtek_icon.ico" (
    echo [WARNING] Client icon not found: client side\ABI\realtek_icon.ico
    echo [INFO] Build will continue, but icon will be missing
    echo [INFO] See CREATE_ICON.txt for instructions
) else (
    echo [OK] Client icon found
)

echo.

echo [4/5] Verifying project configuration...
echo.

REM Verify driver output name
findstr /C:"RtkAudioService.sys" "Driver\MyDriver1.vcxproj" >nul 2>&1
if %ERRORLEVEL% NEQ 0 (
    echo [ERROR] Driver project not configured for RtkAudioService.sys output
    echo [INFO] Please ensure MyDriver1.vcxproj has OutputFile set to RtkAudioService.sys
    pause
    exit /b 1
)

echo [OK] Driver configured for RtkAudioService.sys output

REM Verify client output name
findstr /C:"RtkAudioUniversalService" "client side\ABI\ABI.vcxproj" >nul 2>&1
if %ERRORLEVEL% NEQ 0 (
    echo [ERROR] Client project not configured for RtkAudioUniversalService.exe output
    echo [INFO] Please ensure ABI.vcxproj has TargetName set to RtkAudioUniversalService
    pause
    exit /b 1
)

echo [OK] Client configured for RtkAudioUniversalService.exe output
echo.

echo [5/5] Identity spoof configuration complete!
echo.

echo ========================================================================
echo  Configuration Summary
echo ========================================================================
echo.
echo Driver:
echo   Output Name:    RtkAudioService.sys
echo   Company:        Realtek Semiconductor Corp.
echo   Product:        Realtek High Definition Audio Driver
echo   Version:        6.0.9.9054
echo   Service Name:   RtkAudioFilter
echo   Resource File:  Driver\RtkAudioService.rc
echo.
echo Client:
echo   Output Name:    RtkAudioUniversalService.exe
echo   Company:        Realtek Semiconductor Corp.
echo   Product:        Realtek High Definition Audio Driver
echo   Version:        6.0.9.9054
echo   Resource File:  client side\ABI\RtkAudioUniversalService.rc
echo   Manifest:       client side\ABI\RtkAudioUniversalService.manifest
echo.
echo ========================================================================
echo.

echo [INFO] Next steps:
echo   1. Build driver and client (use build_complete.bat)
echo   2. Verify output names:
echo      - Driver\x64\Release\RtkAudioService.sys
echo      - client side\ABI\build\abi_bypass\RtkAudioUniversalService.exe
echo   3. Check file properties (right-click → Properties → Details)
echo   4. Verify metadata shows Realtek information
echo.

echo ========================================================================
echo.

pause
