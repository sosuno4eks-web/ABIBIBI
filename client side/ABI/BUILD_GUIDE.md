# ABI Client Build Guide

## Prerequisites

### Required Software
1. **Visual Studio 2022** (Community or higher)
   - Workload: Desktop development with C++
   - Windows 10/11 SDK (latest)
   - C++20 or later support

2. **DirectX SDK** (included in Windows SDK)
   - D3D11
   - DXGI

3. **Windows Driver Kit (WDK)** (optional, for driver development)

### Required Libraries
- Windows.h
- TlHelp32.h
- d3d11.lib
- dxgi.lib

## Project Configuration

### Visual Studio Settings

#### General
- **Configuration Type**: Application (.exe)
- **Platform Toolset**: Visual Studio 2022 (v143)
- **Windows SDK Version**: 10.0 (latest installed)
- **C++ Language Standard**: C++20 or later

#### C/C++
- **Additional Include Directories**:
  ```
  $(ProjectDir)includes
  $(ProjectDir)src
  $(ProjectDir)src/game
  $(ProjectDir)src/overlay
  ```

- **Preprocessor Definitions**:
  ```
  WIN32
  _WINDOWS
  NDEBUG (for Release)
  _DEBUG (for Debug)
  UNICODE
  _UNICODE
  ```

- **Optimization** (Release):
  - Optimization: Maximum Optimization (/O2)
  - Inline Function Expansion: Any Suitable (/Ob2)
  - Favor Size Or Speed: Favor fast code (/Ot)
  - Whole Program Optimization: Yes

- **Code Generation**:
  - Runtime Library: Multi-threaded (/MT) for Release
  - Runtime Library: Multi-threaded Debug (/MTd) for Debug

#### Linker
- **Additional Dependencies**:
  ```
  d3d11.lib
  dxgi.lib
  kernel32.lib
  user32.lib
  gdi32.lib
  ```

- **SubSystem**: Windows (/SUBSYSTEM:WINDOWS)
- **Generate Debug Info**: Yes (for both Debug and Release)

#### Advanced
- **Character Set**: Use Unicode Character Set

## Build Steps

### 1. Clean Solution
```
Build → Clean Solution
```

### 2. Set Configuration
```
Configuration: Release
Platform: x64
```

### 3. Build
```
Build → Build Solution
or press Ctrl+Shift+B
```

### 4. Output Location
```
client side/ABI/x64/Release/ABI.exe
```

## File Structure

### Required Files
```
client side/ABI/
├── includes/
│   ├── driver/
│   │   ├── driver.hpp          ✅ Required
│   │   └── xor.hpp             ✅ Required
│   ├── skcrypt/
│   │   └── xor.hpp             ✅ Required
│   ├── d3d.h                   ✅ Required
│   ├── offsets_ue426.h         ⚠️  Reference only
│   ├── unreal_structures.hpp   ✅ Required
│   └── world_to_screen.hpp     ✅ Required
├── src/
│   ├── main.cpp                ✅ Required
│   ├── Communication.cpp       ✅ Required
│   ├── GameLogic.cpp           ✅ Required
│   ├── overlay/
│   │   └── overlay.hpp         ✅ Required
│   └── game/
│       ├── cache.hpp           ✅ Required
│       ├── sdk.hpp             ✅ Required
│       ├── offsets.hpp         ✅ Required
│       ├── structs.hpp         ✅ Required
│       ├── settings.hpp        ✅ Required
│       ├── math.hpp            ✅ Required
│       ├── esp.hpp             ⚠️  Optional
│       ├── radar.hpp           ⚠️  Optional
│       └── menu.hpp            ⚠️  Optional
└── ABI.vcxproj                 ✅ Required
```

## Common Build Errors

### Error: Cannot open include file 'driver/driver.hpp'
**Solution**: Check include directories in project settings
```
Project → Properties → C/C++ → General → Additional Include Directories
Add: $(ProjectDir)includes
```

### Error: Unresolved external symbol
**Solution**: Add missing library to linker
```
Project → Properties → Linker → Input → Additional Dependencies
Add: d3d11.lib;dxgi.lib
```

### Error: C++20 features not available
**Solution**: Update C++ language standard
```
Project → Properties → C/C++ → Language → C++ Language Standard
Set to: ISO C++20 Standard (/std:c++20)
```

### Error: std::println not found
**Solution**: Requires C++23 or use alternative
```cpp
// Option 1: Use C++23
// Project → Properties → C/C++ → Language → C++ Language Standard
// Set to: Preview - Features from the Latest C++ Working Draft

// Option 2: Replace with std::cout
#include <iostream>
std::cout << "Message" << std::endl;
```

### Error: Cannot find TlHelp32.h
**Solution**: Install Windows SDK
```
Visual Studio Installer → Modify → Individual Components
Check: Windows 10/11 SDK
```

## Optimization Tips

### Release Build Optimizations
1. **Link-Time Code Generation**: Yes (/LTCG)
2. **Whole Program Optimization**: Yes (/GL)
3. **Inline Function Expansion**: Any Suitable (/Ob2)
4. **Intrinsic Functions**: Yes (/Oi)
5. **Favor Size Or Speed**: Favor fast code (/Ot)

### Size Reduction
1. **Remove Debug Info**: No (keep for troubleshooting)
2. **Strip Symbols**: Use strip tool after build
3. **Compress**: Use UPX or similar (may trigger AV)

### Anti-Debug
1. **Disable Debug Info**: For final release
2. **Strip Symbols**: Remove all debugging symbols
3. **Obfuscate**: Use code obfuscation tools

## Post-Build Steps

### 1. Test Build
```batch
cd "client side/ABI/x64/Release"
ABI.exe
```

### 2. Verify Dependencies
```batch
dumpbin /dependents ABI.exe
```

Expected output:
```
KERNEL32.dll
USER32.dll
GDI32.dll
d3d11.dll
dxgi.dll
```

### 3. Check Size
```batch
dir ABI.exe
```

Expected size: ~200-500 KB (depending on optimizations)

## Deployment

### Required Files
```
ABI.exe                 - Main executable
(No additional DLLs required if statically linked)
```

### Optional Files
```
config.ini              - Configuration file
offsets.txt             - Offset configuration
```

### Installation
1. Copy ABI.exe to desired location
2. Ensure MyDriver1 is loaded via KDMapper
3. Start Arena Breakout
4. Run ABI.exe

## Debugging

### Debug Build
```
Configuration: Debug
Platform: x64
Build → Build Solution
```

### Debug Output
```cpp
// Add to code for debugging
#ifdef _DEBUG
    std::println("Debug: {}", message);
#endif
```

### Attach Debugger
```
Debug → Attach to Process
Select: ABI.exe
```

### Breakpoints
- Set breakpoints in Visual Studio
- Press F5 to start debugging
- Press F10 to step over
- Press F11 to step into

## Performance Profiling

### Visual Studio Profiler
```
Debug → Performance Profiler
Select: CPU Usage
Start
```

### Memory Profiling
```
Debug → Performance Profiler
Select: Memory Usage
Start
```

## Continuous Integration

### Automated Build Script
```batch
@echo off
echo Building ABI Client...

REM Set paths
set MSBUILD="C:\Program Files\Microsoft Visual Studio\2022\Community\MSBuild\Current\Bin\MSBuild.exe"
set PROJECT="client side\ABI\ABI.vcxproj"

REM Clean
%MSBUILD% %PROJECT% /t:Clean /p:Configuration=Release /p:Platform=x64

REM Build
%MSBUILD% %PROJECT% /t:Build /p:Configuration=Release /p:Platform=x64

if %ERRORLEVEL% EQU 0 (
    echo Build successful!
    echo Output: client side\ABI\x64\Release\ABI.exe
) else (
    echo Build failed!
    exit /b 1
)
```

## Version Control

### .gitignore
```gitignore
# Build outputs
x64/
Debug/
Release/
*.exe
*.pdb
*.ilk
*.obj
*.log

# Visual Studio
.vs/
*.user
*.suo
*.sdf
*.opensdf

# Temporary files
*.tmp
*.temp
```

### Recommended Commits
```
git add includes/driver/
git add src/Communication.cpp
git add src/GameLogic.cpp
git add src/overlay/
git commit -m "Brain transplant: Driver communication implementation"
```

## Troubleshooting Build Issues

### Issue: Build succeeds but exe crashes
**Check**:
1. Runtime library mismatch
2. Missing DLL dependencies
3. Incorrect platform (x86 vs x64)

### Issue: Linker errors
**Check**:
1. All .cpp files added to project
2. All libraries linked
3. Correct platform toolset

### Issue: Include errors
**Check**:
1. Include directories configured
2. Files exist in correct locations
3. File names match includes

## Final Checklist

Before release:
- [ ] Build in Release configuration
- [ ] Test with driver loaded
- [ ] Test with game running
- [ ] Verify no debug output
- [ ] Check file size
- [ ] Test on clean system
- [ ] Verify anti-screenshot works
- [ ] Test offset accuracy
- [ ] Check memory leaks
- [ ] Verify no crashes

---

**Build System Ready** ✅
Follow this guide for successful compilation.
