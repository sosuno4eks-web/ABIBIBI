#pragma once
#include <Windows.h>
#include <winternl.h>

namespace anti_debug {
    
    // Проверка на отладчик через IsDebuggerPresent
    inline bool check_debugger_present() {
        return IsDebuggerPresent();
    }
    
    // Проверка через PEB
    inline bool check_remote_debugger() {
        BOOL isDebuggerPresent = FALSE;
        CheckRemoteDebuggerPresent(GetCurrentProcess(), &isDebuggerPresent);
        return isDebuggerPresent;
    }
    
    // Проверка через NtQueryInformationProcess
    inline bool check_debug_port() {
        typedef NTSTATUS(WINAPI* pNtQueryInformationProcess)(
            HANDLE ProcessHandle,
            DWORD ProcessInformationClass,
            PVOID ProcessInformation,
            DWORD ProcessInformationLength,
            PDWORD ReturnLength
        );
        
        HMODULE hNtdll = GetModuleHandleA("ntdll.dll");
        if (!hNtdll) return false;
        
        pNtQueryInformationProcess NtQueryInformationProcess = 
            (pNtQueryInformationProcess)GetProcAddress(hNtdll, "NtQueryInformationProcess");
        
        if (!NtQueryInformationProcess) return false;
        
        DWORD debugPort = 0;
        NTSTATUS status = NtQueryInformationProcess(
            GetCurrentProcess(),
            7, // ProcessDebugPort
            &debugPort,
            sizeof(debugPort),
            NULL
        );
        
        return (status == 0 && debugPort != 0);
    }
    
    // Проверка на виртуальную машину через CPUID
    inline bool check_vm_cpuid() {
        int cpuInfo[4] = { 0 };
        __cpuid(cpuInfo, 1);
        
        // Проверяем hypervisor bit
        return (cpuInfo[2] >> 31) & 1;
    }
    
    // Проверка на Sandboxie
    inline bool check_sandboxie() {
        HMODULE hSbieDll = GetModuleHandleA("SbieDll.dll");
        return (hSbieDll != NULL);
    }
    
    // Комплексная проверка
    inline bool is_being_debugged() {
        if (check_debugger_present()) return true;
        if (check_remote_debugger()) return true;
        if (check_debug_port()) return true;
        if (check_sandboxie()) return true;
        return false;
    }
    
    // Случайная задержка для усложнения анализа
    inline void random_delay() {
        srand((unsigned)time(NULL) * GetCurrentThreadId());
        int delay = (rand() % 500) + 100; // 100-600ms
        Sleep(delay);
    }
    
    // Проверка на ускоренное время (sandbox detection)
    inline bool check_timing() {
        DWORD start = GetTickCount();
        Sleep(1000);
        DWORD end = GetTickCount();
        
        // Если прошло меньше 900ms, возможно sandbox ускоряет время
        return (end - start) < 900;
    }
}
