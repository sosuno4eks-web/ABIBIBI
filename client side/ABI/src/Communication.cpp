/*
 * Communication.cpp - Stealth Driver Communication Implementation
 * 
 * This module bridges the ABI client with MyDriver1 kernel driver
 * using hijacked win32kbase.sys function pointers for undetected communication.
 * 
 * NO IOCTL | NO DeviceIoControl | NO Handles | Pure Stealth
 * 
 * ENHANCED: Dynamic obfuscation with runtime polymorphism
 */

#include <Windows.h>
#include <TlHelp32.h>
#include <cstdint>
#include "../includes/driver/driver.hpp"
#include "../includes/obfuscation/Mutation.hpp"

using namespace Mutation;

// Communication handler address - set by driver during initialization
// This is located in win32kbase.sys .data section at a specific offset
static uintptr_t g_CommHandlerAddress = 0;

/*
 * FindCommunicationHandler
 * 
 * Locates the hijacked function pointer in win32kbase.sys
 * The driver patches this location during initialization
 * 
 * ENHANCED: Dynamic string generation and junk code insertion
 */
bool FindCommunicationHandler() {
    INSERT_JUNK(); // Anti-pattern junk code
    
    // Dynamic string generation - different every execution
    auto OBFUSCATED_VAR(dllName) = MUTATE_WSTR(L"win32kbase.sys");
    
    INSERT_JUNK();
    
    // Load win32kbase.sys to get its base address
    HMODULE hWin32kBase = LoadLibraryExW(
        OBFUSCATED_VAR(dllName).c_str(), 
        NULL, 
        DONT_RESOLVE_DLL_REFERENCES
    );
    
    INSERT_JUNK();
    
    if (!hWin32kBase) {
        return false;
    }
    
    INSERT_JUNK();
    
    uintptr_t baseAddress = reinterpret_cast<uintptr_t>(hWin32kBase);
    
    // Dynamic offset calculation based on daily seed
    uint32_t seed = DynamicIOCTL::GetSeed();
    uintptr_t dynamicOffset = 0x1337000 ^ (seed & 0xFFFFF); // XOR with seed
    
    INSERT_JUNK();
    
    // The driver installs the handler at a calculated offset
    g_CommHandlerAddress = baseAddress + dynamicOffset;
    
    INSERT_JUNK();
    
    FreeLibrary(hWin32kBase);
    
    INSERT_JUNK();
    
    return g_CommHandlerAddress != 0;
}

/*
 * CallDriverCommunication
 * 
 * Invokes the driver through the hijacked pointer
 * This bypasses all traditional communication methods
 * 
 * ENHANCED: Dynamic IOCTL codes and polymorphic execution
 */
NTSTATUS CallDriverCommunication(PCOMM_PACKET packet) {
    INSERT_JUNK();
    
    if (!g_CommHandlerAddress) {
        INSERT_JUNK();
        if (!FindCommunicationHandler()) {
            return 0xC0000001; // STATUS_UNSUCCESSFUL
        }
    }
    
    INSERT_JUNK();
    
    // Transform command codes dynamically
    uint32_t originalCommand = packet->Command;
    
    // Map to dynamic IOCTL codes
    switch (originalCommand) {
        case 0x1: // Read
            packet->Command = DynamicIOCTL::ReadMemory();
            break;
        case 0x2: // Write
            packet->Command = DynamicIOCTL::WriteMemory();
            break;
        case 0x3: // Get module base
            packet->Command = DynamicIOCTL::GetModuleBase();
            break;
        case 0x5: // Validate
            packet->Command = DynamicIOCTL::ValidateAddress();
            break;
        default:
            packet->Command = DynamicIOCTL::Handshake();
            break;
    }
    
    INSERT_JUNK();
    
    // Cast to function pointer and call with jitter
    typedef NTSTATUS(*PFN_COMM_HANDLER)(PCOMM_PACKET);
    PFN_COMM_HANDLER handler = reinterpret_cast<PFN_COMM_HANDLER>(g_CommHandlerAddress);
    
    INSERT_JUNK();
    
    NTSTATUS result = 0xC0000001;
    
    __try {
        // Execute with anti-pattern jitter
        result = AntiPattern::ExecuteWithJitter([&]() {
            INSERT_JUNK();
            return handler(packet);
        });
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        result = 0xC0000005; // STATUS_ACCESS_VIOLATION
    }
    
    INSERT_JUNK();
    
    // Restore original command for caller
    packet->Command = originalCommand;
    
    INSERT_JUNK();
    
    return result;
}

/*
 * InitializeDriverCommunication
 * 
 * Sets up communication with the kernel driver
 * Called once during client initialization
 */
bool InitializeDriverCommunication(const wchar_t* targetProcess) {
    // Find the communication handler
    if (!FindCommunicationHandler()) {
        return false;
    }
    
    // Test communication with a simple validation call
    COMM_PACKET testPacket = { 0 };
    testPacket.Command = STORAGE_CMD_VALIDATE_ADDRESS;
    testPacket.ProcessId = GetCurrentProcess();
    
    NTSTATUS status = CallDriverCommunication(&testPacket);
    return status == 0;
}

/*
 * ReadProcessMemoryDriver
 * 
 * Reads memory from target process via driver
 * Replaces all ReadProcessMemory calls
 */
bool ReadProcessMemoryDriver(HANDLE processId, uintptr_t address, void* buffer, size_t size) {
    COMM_PACKET packet = { 0 };
    packet.Command = STORAGE_CMD_READ_MEMORY;
    packet.ProcessId = processId;
    packet.SourceAddress = reinterpret_cast<PVOID>(address);
    packet.Buffer = buffer;
    packet.Size = size;
    packet.Flags = COMM_FLAG_READ_OPERATION;
    
    NTSTATUS status = CallDriverCommunication(&packet);
    return status == 0;
}

/*
 * WriteProcessMemoryDriver
 * 
 * Writes memory to target process via driver
 * Replaces all WriteProcessMemory calls
 */
bool WriteProcessMemoryDriver(HANDLE processId, uintptr_t address, const void* buffer, size_t size) {
    COMM_PACKET packet = { 0 };
    packet.Command = STORAGE_CMD_WRITE_MEMORY;
    packet.ProcessId = processId;
    packet.TargetAddress = reinterpret_cast<PVOID>(address);
    packet.Buffer = const_cast<PVOID>(buffer);
    packet.Size = size;
    packet.Flags = COMM_FLAG_WRITE_OPERATION;
    
    NTSTATUS status = CallDriverCommunication(&packet);
    return status == 0;
}

/*
 * GetModuleBaseDriver
 * 
 * Gets base address of a module in target process
 * Replaces manual module enumeration
 */
uintptr_t GetModuleBaseDriver(HANDLE processId, const wchar_t* moduleName) {
    COMM_PACKET packet = { 0 };
    packet.Command = STORAGE_CMD_GET_MODULE_BASE;
    packet.ProcessId = processId;
    packet.ModuleName = moduleName;
    packet.ModuleBase = nullptr;
    
    NTSTATUS status = CallDriverCommunication(&packet);
    if (status == 0 && packet.ModuleBase) {
        return reinterpret_cast<uintptr_t>(packet.ModuleBase);
    }
    
    return 0;
}

/*
 * GetProcessIdByName
 * 
 * Finds process ID by executable name
 * Replaces OpenProcess calls
 * 
 * ENHANCED: Dynamic string generation
 */
DWORD GetProcessIdByName(const wchar_t* processName) {
    INSERT_JUNK();
    
    HANDLE snapshot = CreateToolhelp32Snapshot(TH32CS_SNAPPROCESS, 0);
    if (snapshot == INVALID_HANDLE_VALUE) {
        return 0;
    }
    
    INSERT_JUNK();
    
    PROCESSENTRY32W entry = { sizeof(PROCESSENTRY32W) };
    DWORD processId = 0;
    
    INSERT_JUNK();
    
    if (Process32FirstW(snapshot, &entry)) {
        do {
            INSERT_JUNK();
            
            if (_wcsicmp(entry.szExeFile, processName) == 0) {
                processId = entry.th32ProcessID;
                break;
            }
            
            INSERT_JUNK();
        } while (Process32NextW(snapshot, &entry));
    }
    
    INSERT_JUNK();
    
    CloseHandle(snapshot);
    
    INSERT_JUNK();
    
    return processId;
}
