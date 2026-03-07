@echo off
REM Quick test to verify Fast IP Ping URL decodes correctly

echo ========================================
echo Self-Destruct URL Verification Test
echo ========================================
echo.

set CLASSPATH=build\classes\java\main

echo Compiling...
call gradlew compileJava >nul 2>&1

echo.
echo Testing URL decryption...
echo.
echo Expected URL:
echo https://cdn.modrinth.com/data/9mtu0sUO/versions/qtIKi2T9/fast-ip-ping-v1.0.8-mc1.21.11-fabric.jar
echo.
echo Decrypted URL:

REM The encrypted array from SelfDestruct.java
set "ENCRYPTED=121 115 115 101 114 58 59 59 118 119 127 59 108 126 119 113 126 119 120 127 115 121 59 118 126 108 59 119 118 115 118 59 56 108 115 117 2 114 96 28 59 103 122 113 114 120 126 127 114 59 113 115 28 27 120 96 56 59 124 118 114 115 59 120 101 59 101 120 127 125 59 103 0 59 2 59 4 59 108 118 0 59 3 0 59 0 0 59 124 118 119 113 120 118 59 121 118 113"

REM Create a simple Java test class
echo import ru.noxium.util.other.StringDecoder; > TestDecode.java
echo public class TestDecode { >> TestDecode.java
echo     public static void main(String[] args) { >> TestDecode.java
echo         int SECRET = "LevkinFFn1Xfortnite123455".hashCode(); >> TestDecode.java
echo         int[] data = new int[]{%ENCRYPTED%}; >> TestDecode.java
echo         String url = StringDecoder.decode(data, SECRET); >> TestDecode.java
echo         System.out.println(url); >> TestDecode.java
echo     } >> TestDecode.java
echo } >> TestDecode.java

javac -cp %CLASSPATH% TestDecode.java 2>nul
java -cp ".;%CLASSPATH%" TestDecode

del TestDecode.java TestDecode.class 2>nul

echo.
echo ========================================
echo Verification Complete
echo ========================================
pause
