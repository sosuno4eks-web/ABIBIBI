@echo off
REM KDMapper Auditor - Quick Launch Script
REM Automatically runs as Administrator

echo ========================================
echo   KDMapper Auditor - Quick Launch
echo ========================================
echo.

REM Check if running as Administrator
net session >nul 2>&1
if %errorLevel% == 0 (
    echo [OK] Running as Administrator
    echo.
    goto :run_auditor
) else (
    echo [!] Not running as Administrator
    echo [!] Requesting elevation...
    echo.
    
    REM Re-launch as Administrator
    powershell -Command "Start-Process '%~f0' -Verb RunAs"
    exit /b
)

:run_auditor
REM Check if executable exists
if exist "x64\Release\KDMapperAuditor.exe" (
    echo [OK] Found KDMapperAuditor.exe
    echo.
    echo Starting auditor...
    echo.
    
    REM Run the auditor
    "x64\Release\KDMapperAuditor.exe"
    
    echo.
    echo Auditor finished.
    pause
) else if exist "KDMapperAuditor.exe" (
    echo [OK] Found KDMapperAuditor.exe
    echo.
    echo Starting auditor...
    echo.
    
    REM Run the auditor
    "KDMapperAuditor.exe"
    
    echo.
    echo Auditor finished.
    pause
) else (
    echo [ERROR] KDMapperAuditor.exe not found!
    echo.
    echo Please build the project first:
    echo 1. Open KDMapperAuditor.vcxproj in Visual Studio 2022
    echo 2. Set configuration to Release x64
    echo 3. Build -^> Build Solution
    echo 4. Run this script again
    echo.
    pause
    exit /b 1
)
