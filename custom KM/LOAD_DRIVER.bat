@echo off
echo ========================================
echo  Realtek Audio Driver Loader
echo ========================================
echo.

cd /d "C:\Users\Lev\Desktop\realteck"

echo [*] Loading RtkAudioService.sys driver...
echo.

rtkaudio.exe RtkAudioService.sys

echo.
if %ERRORLEVEL% EQU 0 (
    echo [SUCCESS] Driver loaded successfully!
) else (
    echo [ERROR] Driver loading failed! Error code: %ERRORLEVEL%
    echo.
    echo Possible causes:
    echo  - Run as Administrator
    echo  - Disable Secure Boot in BIOS
    echo  - Disable Driver Signature Enforcement
    echo  - Check if vulnerable driver is present
)

echo.
echo Press any key to exit...
pause >nul
