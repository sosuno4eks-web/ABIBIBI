@echo off
"C:\Program Files\Microsoft Visual Studio\2022\Community\MSBuild\Current\Bin\MSBuild.exe" MyDriver1.vcxproj /p:Configuration=Release /p:Platform=x64 /p:SpectreMitigation=false /t:Rebuild /v:detailed
