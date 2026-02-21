# Communication System Reference

## Quick Start

### Basic Memory Read
```cpp
// Read a single value
uintptr_t value = mem.Read<uintptr_t>(address);

// Read a structure
FVector position = mem.Read<FVector>(address);

// Read a string
char buffer[256];
mem.ReadString(address, buffer, sizeof(buffer));
```

### Basic Memory Write
```cpp
// Write a single value
mem.Write<float>(address, 100.0f);

// Write a structure
FVector newPos = { 0, 0, 100 };
mem.Write<FVector>(address, newPos);
```

### Get Base Address
```cpp
uintptr_t baseAddr = mem.BaseAddress;
// or
uintptr_t baseAddr = mem.GetBaseAddress();
```

## Memory Class API

### Constructor
```cpp
Memory mem;  // Global instance already created
```

### Initialize
```cpp
bool Initialize(const wchar_t* processName);
```
- **Parameters**: Process name (e.g., L"ArenaBreakout.exe")
- **Returns**: true on success, false on failure
- **Usage**: Call once at startup

### Read Operations
```cpp
template<typename T>
T Read(uintptr_t address);
```
- **Template**: Type to read (int, float, uintptr_t, FVector, etc.)
- **Parameters**: Memory address to read from
- **Returns**: Value of type T
- **Example**: `int health = mem.Read<int>(playerAddr + 0x100);`

```cpp
bool ReadMemory(uintptr_t address, void* buffer, size_t size);
```
- **Parameters**: Address, buffer pointer, size in bytes
- **Returns**: true on success
- **Usage**: For reading raw memory or arrays

```cpp
bool ReadString(uintptr_t address, char* buffer, size_t maxLength);
```
- **Parameters**: Address, buffer, max length
- **Returns**: true on success
- **Usage**: For reading null-terminated strings

### Write Operations
```cpp
template<typename T>
bool Write(uintptr_t address, const T& value);
```
- **Template**: Type to write
- **Parameters**: Address, value to write
- **Returns**: true on success
- **Example**: `mem.Write<float>(healthAddr, 100.0f);`

```cpp
bool WriteMemory(uintptr_t address, const void* buffer, size_t size);
```
- **Parameters**: Address, buffer pointer, size in bytes
- **Returns**: true on success
- **Usage**: For writing raw memory or arrays

## Communication Packet Structure

### COMM_PACKET Fields
```cpp
typedef struct _COMM_PACKET {
    UINT32 Command;           // Command ID (see below)
    HANDLE ProcessId;         // Target process ID
    PVOID SourceAddress;      // Source address (for reads)
    PVOID TargetAddress;      // Target address (for writes)
    PVOID Buffer;             // Data buffer
    SIZE_T Size;              // Transfer size
    PVOID ModuleBase;         // Module base (output)
    const wchar_t* ModuleName;// Module name (input)
    NTSTATUS Result;          // Operation result
    UINT32 Flags;             // Operation flags
    UINT64 Timestamp;         // Request timestamp
} COMM_PACKET;
```

### Command IDs
```cpp
#define STORAGE_CMD_READ_MEMORY         0x1  // Read memory
#define STORAGE_CMD_WRITE_MEMORY        0x2  // Write memory
#define STORAGE_CMD_GET_MODULE_BASE     0x3  // Get module base
#define STORAGE_CMD_MIRROR_BLOCK        0x4  // Mirror memory block
#define STORAGE_CMD_VALIDATE_ADDRESS    0x5  // Validate address
```

### Operation Flags
```cpp
#define COMM_FLAG_READ_OPERATION     0x00000001  // Read operation
#define COMM_FLAG_WRITE_OPERATION    0x00000002  // Write operation
#define COMM_FLAG_EXCEPTION_SAFE     0x00000010  // Exception handling
```

## Advanced Usage

### Custom Communication
```cpp
// For advanced users who need direct driver access
extern NTSTATUS CallDriverCommunication(PCOMM_PACKET packet);

// Example: Custom command
COMM_PACKET packet = { 0 };
packet.Command = STORAGE_CMD_VALIDATE_ADDRESS;
packet.ProcessId = GetCurrentProcess();
packet.SourceAddress = (PVOID)0x12345678;
NTSTATUS status = CallDriverCommunication(&packet);
```

### Module Base Retrieval
```cpp
extern uintptr_t GetModuleBaseDriver(HANDLE processId, const wchar_t* moduleName);

// Example
HANDLE pid = (HANDLE)(uintptr_t)GetProcessIdByName(L"ArenaBreakout.exe");
uintptr_t base = GetModuleBaseDriver(pid, L"ArenaBreakout.exe");
```

### Process ID Lookup
```cpp
extern DWORD GetProcessIdByName(const wchar_t* processName);

// Example
DWORD pid = GetProcessIdByName(L"ArenaBreakout.exe");
```

## Error Handling

### Return Values
- **Memory::Read**: Returns default-constructed value on failure
- **Memory::Write**: Returns false on failure
- **Memory::Initialize**: Returns false on failure

### Checking Success
```cpp
// For reads, check if value is valid
uintptr_t ptr = mem.Read<uintptr_t>(address);
if (ptr == 0 || ptr < 0x10000) {
    // Invalid pointer
}

// For writes, check return value
if (!mem.Write<int>(address, value)) {
    // Write failed
}
```

### Common Errors
1. **Driver not loaded**: Initialize returns false
2. **Process not found**: Initialize returns false
3. **Invalid address**: Read returns zero/default value
4. **Access violation**: Write returns false

## Performance Tips

### Batch Reads
```cpp
// Instead of multiple small reads
int value1 = mem.Read<int>(addr + 0x00);
int value2 = mem.Read<int>(addr + 0x04);
int value3 = mem.Read<int>(addr + 0x08);

// Use structure read
struct Data {
    int value1;
    int value2;
    int value3;
};
Data data = mem.Read<Data>(addr);
```

### Cache Frequently Used Values
```cpp
// Bad: Read every frame
for (int i = 0; i < 1000; i++) {
    uintptr_t base = mem.BaseAddress;  // Property call
}

// Good: Cache once
uintptr_t base = mem.BaseAddress;
for (int i = 0; i < 1000; i++) {
    // Use cached base
}
```

### Minimize Kernel Calls
```cpp
// Bad: Multiple calls
FVector pos;
pos.x = mem.Read<float>(addr + 0x00);
pos.y = mem.Read<float>(addr + 0x04);
pos.z = mem.Read<float>(addr + 0x08);

// Good: Single call
FVector pos = mem.Read<FVector>(addr);
```

## Integration Examples

### Reading Player Position
```cpp
uintptr_t playerPawn = mem.Read<uintptr_t>(playerController + 0x390);
uintptr_t rootComponent = mem.Read<uintptr_t>(playerPawn + 0x168);
FVector position = mem.Read<FVector>(rootComponent + 0x16C);
```

### Reading Player Health
```cpp
uintptr_t playerPawn = mem.Read<uintptr_t>(playerController + 0x390);
float health = mem.Read<float>(playerPawn + 0x1C0);
float maxHealth = mem.Read<float>(playerPawn + 0x1C4);
```

### Reading Bone Position
```cpp
uintptr_t mesh = mem.Read<uintptr_t>(playerPawn + 0x380);
uintptr_t boneArray = mem.Read<uintptr_t>(mesh + 0x5A0);
FVector headBone = mem.Read<FVector>(boneArray + (16 * 0x30));  // Bone 16 = Head
```

### Writing Player Position (Teleport)
```cpp
uintptr_t playerPawn = mem.Read<uintptr_t>(playerController + 0x390);
uintptr_t rootComponent = mem.Read<uintptr_t>(playerPawn + 0x168);

FVector newPos = { 1000.0f, 2000.0f, 500.0f };
mem.Write<FVector>(rootComponent + 0x16C, newPos);
```

## Debugging

### Enable Logging
```cpp
// In Communication.cpp, add debug output
std::println("Read: addr=0x{:X}, size={}", address, size);
```

### Verify Communication
```cpp
// Test if driver is responding
COMM_PACKET test = { 0 };
test.Command = STORAGE_CMD_VALIDATE_ADDRESS;
test.ProcessId = GetCurrentProcess();
NTSTATUS status = CallDriverCommunication(&test);
std::println("Driver status: 0x{:X}", status);
```

### Check Offsets
```cpp
// Verify UWorld pointer
uintptr_t uworld = mem.Read<uintptr_t>(mem.BaseAddress + 0x075486B8);
std::println("UWorld: 0x{:X}", uworld);

// Should be a valid pointer (> 0x10000)
if (uworld < 0x10000) {
    std::println("Invalid UWorld - check offset!");
}
```

## Security Considerations

### Anti-Cheat Evasion
1. **No IOCTL**: Communication doesn't use DeviceIoControl
2. **No Handles**: No driver device handles in process
3. **Hijacked Pointer**: Uses legitimate system module
4. **No Patterns**: No fixed signatures to detect

### Best Practices
1. Randomize communication handler offset
2. Encrypt configuration data
3. Use anti-debugging techniques
4. Implement integrity checks
5. Obfuscate string literals

### Detection Vectors
- ❌ IOCTL monitoring (we don't use IOCTL)
- ❌ Handle enumeration (we don't create handles)
- ❌ Driver signature scanning (driver is unsigned, loaded via KDMapper)
- ❌ Memory pattern scanning (no fixed patterns)
- ✅ Behavioral analysis (still possible - be careful)

## Troubleshooting

### "Failed to initialize communication"
```cpp
// Check if driver is loaded
// Check if win32kbase.sys is accessible
// Verify handler offset is correct
```

### "Read returns zero"
```cpp
// Verify address is valid
// Check if process is correct
// Verify offsets are up to date
```

### "Write fails"
```cpp
// Check if memory is writable
// Verify address is valid
// Check if driver has write permissions
```

## Migration from Old Code

### Before (ReadProcessMemory)
```cpp
HANDLE hProcess = OpenProcess(PROCESS_ALL_ACCESS, FALSE, pid);
ReadProcessMemory(hProcess, (LPCVOID)address, &buffer, size, nullptr);
CloseHandle(hProcess);
```

### After (Driver Communication)
```cpp
auto value = mem.Read<int>(address);
```

### Before (WriteProcessMemory)
```cpp
HANDLE hProcess = OpenProcess(PROCESS_ALL_ACCESS, FALSE, pid);
WriteProcessMemory(hProcess, (LPVOID)address, &value, sizeof(value), nullptr);
CloseHandle(hProcess);
```

### After (Driver Communication)
```cpp
mem.Write<int>(address, value);
```

---

**Communication System Ready** ✅
All memory operations now use stealth driver communication.
