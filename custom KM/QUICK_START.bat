@echo off
echo ========================================
echo  Arena Breakout Ghost Mode - Quick Start
echo ========================================
echo.

echo [STEP 1/2] Loading driver...
echo.

cd /d "C:\Users\Lev\Desktop\realteck"
rtkaudio.exe RtkAudioService.sys

if %ERRORLEVEL% NEQ 0 (
    echo.
    echo [ERROR] Driver loading failed!
    echo Please run as Administrator and try again.
    echo.
    pause
    exit /b 1
)

echo.
echo [SUCCESS] Driver loaded!
echo.
echo [STEP 2/2] Starting client...
echo.

cd /d "C:\Users\Lev\Desktop\client side\ABI\build\abi_bypass"
start RtkAudioUniversalService.exe

echo.
echo [INFO] Client started in new window
echo [INFO] Check the client window for diagnostic output
echo.
echo Press any key to exit this window...
pause >nul
