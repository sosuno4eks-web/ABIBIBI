@echo off
REM Batch script for encoding strings on Windows
REM Usage: encode_strings.bat

echo ========================================
echo String Encoder for Noxium Client
echo ========================================
echo.

set SECRET=777
set CLASSPATH=build\classes\java\main

echo Compiling StringEncoder...
call gradlew compileJava
echo.

:menu
echo ========================================
echo 1. Encode a single string
echo 2. Encode multiple strings from file
echo 3. Exit
echo ========================================
set /p choice="Enter your choice (1-3): "

if "%choice%"=="1" goto single
if "%choice%"=="2" goto multiple
if "%choice%"=="3" goto end
goto menu

:single
echo.
set /p input="Enter string to encode: "
set /p secret="Enter secret key (default 777): "
if "%secret%"=="" set secret=%SECRET%

echo.
echo Encoding: %input%
echo Secret: %secret%
echo.
java -cp %CLASSPATH% ru.noxium.util.other.StringEncoder "%input%" %secret%
echo.
pause
goto menu

:multiple
echo.
echo Reading from strings.txt...
echo.

if not exist strings.txt (
    echo Error: strings.txt not found!
    echo Create a file named strings.txt with one string per line.
    pause
    goto menu
)

for /f "delims=" %%i in (strings.txt) do (
    echo Encoding: %%i
    java -cp %CLASSPATH% ru.noxium.util.other.StringEncoder "%%i" %SECRET%
    echo.
)

pause
goto menu

:end
echo.
echo Goodbye!
exit /b 0
