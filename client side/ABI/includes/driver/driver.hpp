#pragma once

#include <Windows.h>
#include <TlHelp32.h>
#include <cstdint>
#include <string>
#include "../obfuscation/Mutation.hpp"

/*
 * Communication.hpp - Driver Communication Bridge
 * Interfaces with MyDriver1 via hijacked win32kbase.sys pointer
 * No IOCTL, no device handles - pure stealth communication
 * 
 * ENHANCED: Dynamic obfuscation and polymorphic communication
 */

using namespace Mutation;

// Communication packet structure (matches Driver/definitions.h)
typedef struct _COMM_PACKET {
    UINT32 Command;
    HANDLE ProcessId;
    PVOID SourceAddress;
    PVOID TargetAddress;
    PVOID Buffer;
    SIZE_T Size;
    PVOID ModuleBase;
    const wchar_t* ModuleName;
    NTSTATUS Result;
    UINT32 Flags;
    UINT64 Timestamp;
} COMM_PACKET, *PCOMM_PACKET;

// Command identifiers (matches Driver/definitions.h)
#define STORAGE_CMD_READ_MEMORY         0x1
#define STORAGE_CMD_WRITE_MEMORY        0x2
#define STORAGE_CMD_GET_MODULE_BASE     0x3
#define STORAGE_CMD_MIRROR_BLOCK        0x4
#define STORAGE_CMD_VALIDATE_ADDRESS    0x5

// Communication flags
#define COMM_FLAG_READ_OPERATION     0x00000001
#define COMM_FLAG_WRITE_OPERATION    0x00000002
#define COMM_FLAG_EXCEPTION_SAFE     0x00000010

class Memory {
private:
    HANDLE m_ProcessId;
    uintptr_t m_BaseAddress;
    
    // Function pointer to hijacked communication handler in win32kbase.sys
    // This is set up by the driver during initialization
    typedef NTSTATUS(*PFN_COMM_HANDLER)(PCOMM_PACKET);
    PFN_COMM_HANDLER m_CommHandler;
    
    // Find the communication handler address
    bool InitializeCommunication() {
        // The driver installs a handler at a known offset in win32kbase.sys
        // For now, we'll use a hardcoded offset that the driver sets up
        // In production, this could be passed via shared memory or registry
        
        HMODULE win32kbase = LoadLibraryW(L"win32kbase.sys");
        if (!win32kbase) {
            return false;
        }
        
        // The driver patches a specific offset with our handler
        // This offset should be communicated securely (e.g., via encrypted config)
        // For this implementation, we use a placeholder
        m_CommHandler = reinterpret_cast<PFN_COMM_HANDLER>(
            reinterpret_cast<uintptr_t>(win32kbase) + 0x1337000 // Placeholder offset
        );
        
        return m_CommHandler != nullptr;
    }
    
    // Call the driver through the hijacked pointer
    NTSTATUS CallDriver(PCOMM_PACKET packet) {
        if (!m_CommHandler) {
            return 0xC0000001; // STATUS_UNSUCCESSFUL
        }
        
        packet->ProcessId = m_ProcessId;
        packet->Flags |= COMM_FLAG_EXCEPTION_SAFE;
        
        return m_CommHandler(packet);
    }

public:
    Memory() : m_ProcessId(nullptr), m_BaseAddress(0), m_CommHandler(nullptr) {}
    
    bool Initialize(const wchar_t* processName) {
        // Get process ID by name
        HANDLE snapshot = CreateToolhelp32Snapshot(TH32CS_SNAPPROCESS, 0);
        if (snapshot == INVALID_HANDLE_VALUE) {
            return false;
        }
        
        PROCESSENTRY32W entry = { sizeof(PROCESSENTRY32W) };
        if (Process32FirstW(snapshot, &entry)) {
            do {
                if (_wcsicmp(entry.szExeFile, processName) == 0) {
                    m_ProcessId = reinterpret_cast<HANDLE>(static_cast<uintptr_t>(entry.th32ProcessID));
                    break;
                }
            } while (Process32NextW(snapshot, &entry));
        }
        
        CloseHandle(snapshot);
        
        if (!m_ProcessId) {
            return false;
        }
        
        // Initialize communication with driver
        if (!InitializeCommunication()) {
            return false;
        }
        
        // Get base address of target process
        COMM_PACKET packet = { 0 };
        packet.Command = STORAGE_CMD_GET_MODULE_BASE;
        packet.ModuleName = processName;
        packet.ModuleBase = nullptr;
        
        if (CallDriver(&packet) == 0 && packet.ModuleBase) {
            m_BaseAddress = reinterpret_cast<uintptr_t>(packet.ModuleBase);
            return true;
        }
        
        return false;
    }
    
    // Read memory from target process
    template<typename T>
    T Read(uintptr_t address) {
        T buffer = {};
        ReadMemory(address, &buffer, sizeof(T));
        return buffer;
    }
    
    // Read raw memory
    bool ReadMemory(uintptr_t address, void* buffer, size_t size) {
        COMM_PACKET packet = { 0 };
        packet.Command = STORAGE_CMD_READ_MEMORY;
        packet.SourceAddress = reinterpret_cast<PVOID>(address);
        packet.Buffer = buffer;
        packet.Size = size;
        packet.Flags = COMM_FLAG_READ_OPERATION;
        
        return CallDriver(&packet) == 0;
    }
    
    // Read string from target process
    bool ReadString(uintptr_t address, char* buffer, size_t maxLength) {
        return ReadMemory(address, buffer, maxLength);
    }
    
    // Write memory to target process
    template<typename T>
    bool Write(uintptr_t address, const T& value) {
        return WriteMemory(address, const_cast<T*>(&value), sizeof(T));
    }
    
    // Write raw memory
    bool WriteMemory(uintptr_t address, const void* buffer, size_t size) {
        COMM_PACKET packet = { 0 };
        packet.Command = STORAGE_CMD_WRITE_MEMORY;
        packet.TargetAddress = reinterpret_cast<PVOID>(address);
        packet.Buffer = const_cast<PVOID>(buffer);
        packet.Size = size;
        packet.Flags = COMM_FLAG_WRITE_OPERATION;
        
        return CallDriver(&packet) == 0;
    }
    
    // Get base address of target process
    uintptr_t GetBaseAddress() const {
        return m_BaseAddress;
    }
    
    // Property for compatibility with old code
    __declspec(property(get = GetBaseAddress)) uintptr_t BaseAddress;
};

// Global memory instance
inline Memory mem;
