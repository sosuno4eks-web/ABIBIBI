#pragma once

#include <windows.h>
#include <iostream>
#include <TlHelp32.h>
#include <string>
#include <vector>

/* ── Process Discovery for Arena Breakout Infinite ───────────────────── */

class Memory {
private:
    HANDLE process_handle = nullptr;
    DWORD process_id = 0;
    uintptr_t base_address = 0;
    
    /* Driver communication handle */
    HANDLE driver_handle = nullptr;
    
    /* Find ArenaBreakout.exe process */
    bool FindProcess() {
        HANDLE snapshot = CreateToolhelp32Snapshot(TH32CS_SNAPPROCESS, 0);
        if (snapshot == INVALID_HANDLE_VALUE) return false;
        
        PROCESSENTRY32 pe32;
        pe32.dwSize = sizeof(PROCESSENTRY32);
        
        if (Process32First(snapshot, &pe32)) {
            do {
                std::wstring process_name = pe32.szExeFile;
                if (process_name == L"ArenaBreakout.exe" || process_name == L"ArenaBreakout_BE.exe") {
                    process_id = pe32.th32ProcessID;
                    process_handle = OpenProcess(PROCESS_ALL_ACCESS, FALSE, process_id);
                    if (process_handle) {
                        base_address = GetModuleBaseAddress(L"ArenaBreakout.exe");
                        if (!base_address) {
                            base_address = GetModuleBaseAddress(L"ArenaBreakout_BE.exe");
                        }
                        CloseHandle(snapshot);
                        return base_address != 0;
                    }
                }
            } while (Process32Next(snapshot, &pe32));
        }
        
        CloseHandle(snapshot);
        return false;
    }
    
    /* Get module base address */
    uintptr_t GetModuleBaseAddress(const std::wstring& module_name) {
        HANDLE snapshot = CreateToolhelp32Snapshot(TH32CS_SNAPMODULE | TH32CS_SNAPMODULE32, process_id);
        if (snapshot == INVALID_HANDLE_VALUE) return 0;
        
        MODULEENTRY32 me32;
        me32.dwSize = sizeof(MODULEENTRY32);
        
        if (Module32First(snapshot, &me32)) {
            do {
                if (me32.szModule == module_name) {
                    CloseHandle(snapshot);
                    return (uintptr_t)me32.modBaseAddr;
                }
            } while (Module32Next(snapshot, &me32));
        }
        
        CloseHandle(snapshot);
        return 0;
    }
    
    /* Initialize driver communication */
    bool InitDriver() {
        /* This would interface with the kernel driver */
        /* For now, we'll use direct memory access as fallback */
        driver_handle = CreateFileW(L"\\\\.\\abi_driver", GENERIC_READ | GENERIC_WRITE, 
                                   0, nullptr, OPEN_EXISTING, FILE_ATTRIBUTE_NORMAL, nullptr);
        return driver_handle != INVALID_HANDLE_VALUE;
    }

public:
    uintptr_t BaseAddress = 0;
    
    Memory() {
        if (FindProcess()) {
            BaseAddress = base_address;
            InitDriver();
        }
    }
    
    ~Memory() {
        if (process_handle) CloseHandle(process_handle);
        if (driver_handle && driver_handle != INVALID_HANDLE_VALUE) CloseHandle(driver_handle);
    }
    
    /* Template read function */
    template<typename T>
    T Read(uintptr_t address) {
        T buffer = {};
        if (!process_handle) return buffer;
        
        ReadProcessMemory(process_handle, (LPCVOID)address, &buffer, sizeof(T), nullptr);
        return buffer;
    }
    
    /* Read string */
    bool ReadString(uintptr_t address, char* buffer, size_t size) {
        if (!process_handle) return false;
        return ReadProcessMemory(process_handle, (LPCVOID)address, buffer, size, nullptr);
    }
    
    /* Template write function */
    template<typename T>
    bool Write(uintptr_t address, const T& value) {
        if (!process_handle) return false;
        return WriteProcessMemory(process_handle, (LPVOID)address, &value, sizeof(T), nullptr);
    }
    
    /* Check if process is still running */
    bool IsProcessRunning() {
        if (!process_handle) return false;
        DWORD exit_code;
        return GetExitCodeProcess(process_handle, &exit_code) && exit_code == STILL_ACTIVE;
    }
    
    /* Reconnect if process restarted */
    bool Reconnect() {
        if (process_handle) {
            CloseHandle(process_handle);
            process_handle = nullptr;
        }
        return FindProcess();
    }
};

/* Global memory instance */
extern Memory mem;
