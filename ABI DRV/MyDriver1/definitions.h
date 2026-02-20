#pragma once

// Architecture definition for kernel headers
#define _AMD64_

// Windows SDK compatibility version
#define WINDOWS_SDK_VERSION 0x0A000000  // 10.0.26100.0

#include <ntifs.h>
#include <windef.h>
#include <ntimage.h>
#include <intrin.h>
#include <ntstrsafe.h>

// Standard Communication Packet for internal data exchange
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

// Legacy compatibility - use SDK definitions if available
#ifndef COMMAND_PACKET_DEFINED
#define COMMAND_PACKET_DEFINED
typedef COMM_PACKET COMMAND_PACKET;
typedef COMM_PACKET* PCOMMAND_PACKET;
#endif

// Prevent redefinition conflicts
#ifndef _PEB_DEFINED_
#define _PEB_DEFINED_

#ifndef _LDR_DATA_TABLE_ENTRY_DEFINED_
#define _LDR_DATA_TABLE_ENTRY_DEFINED_

typedef struct _LDR_DATA_TABLE_ENTRY {
    LIST_ENTRY InLoadOrderLinks;
    LIST_ENTRY InMemoryOrderLinks;
    LIST_ENTRY InInitializationOrderLinks;
    PVOID DllBase;
    PVOID EntryPoint;
    ULONG SizeOfImage;
    UNICODE_STRING FullDllName;
    UNICODE_STRING BaseDllName;
} LDR_DATA_TABLE_ENTRY, *PLDR_DATA_TABLE_ENTRY;

#endif 

#ifndef _PEB_LDR_DATA_DEFINED_
#define _PEB_LDR_DATA_DEFINED_

typedef struct _PEB_LDR_DATA {
    ULONG Length;
    UCHAR Initialized;
    PVOID SsHandle;
    LIST_ENTRY InLoadOrderModuleList;
    LIST_ENTRY InMemoryOrderModuleList;
    LIST_ENTRY InInitializationOrderModuleList;
} PEB_LDR_DATA, *PPEB_LDR_DATA;

#endif 

typedef struct _PEB {
    UCHAR InheritedAddressSpace;
    UCHAR ReadImageFileExecOptions;
    UCHAR BeingDebugged;
    UCHAR BitField;
    PVOID Mutant;
    PVOID ImageBaseAddress;
    PPEB_LDR_DATA Ldr;
} PEB, *PPEB;

#endif 

// Additional linker dependencies for stealth operations
#pragma comment(lib, "ntoskrnl.lib")
#pragma comment(lib, "hal.lib")
#pragma comment(lib, "wmilib.lib")

// Windows 10 Pro 22H2 (Build 19045) Structure Offsets
#define EPROCESS_PsLoadedModuleListOffset 0x0188
#define EPROCESS_PebOffset               0x550
#define EPROCESS_ProcessLockOffset        0x2F8
#define EPROCESS_VadRootOffset           0x7D8
#define EPROCESS_AweInfoOffset           0x5A8
#define EPROCESS_ObjectTableOffset       0x580
#define EPROCESS_DebugPortOffset          0x3E8
#define EPROCESS_ExceptionPortOffset      0x3F0
#define EPROCESS_UniqueProcessIdOffset    0x650

// Windows 10 22H2 KAPC_STATE Offsets
#define KAPC_STATE_ApcListEntry        0x98
#define KAPC_STATE_Process             0xA0
#define KAPC_STATE_KernelApcInProgress 0x128
#define KAPC_STATE_UserApcPending     0x129

// Windows 10 22H2 DRIVER_OBJECT Offsets
#define DRIVER_OBJECT_Type               0x018
#define DRIVER_OBJECT_Size                0x01C
#define DRIVER_OBJECT_DeviceObject        0x038
#define DRIVER_OBJECT_DriverSection      0x020
#define DRIVER_OBJECT_DriverName          0x030
#define DRIVER_OBJECT_DriverStart        0x070
#define DRIVER_OBJECT_DriverSize          0x078
#define DRIVER_OBJECT_DriverInit         0x080

// Windows 10 22H2 OBJECT_HEADER Offsets
#define OBJECT_HEADER_TypeOffset         0x018
#define OBJECT_HEADER_HandleCountOffset   0x020
#define OBJECT_HEADER_QuotaChargesOffset 0x050

#ifdef __cplusplus
extern "C" {
#endif
PVOID NTAPI PsGetProcessPeb(PEPROCESS Process);

// System information query
typedef enum _SYSTEM_INFORMATION_CLASS {
    SystemModuleInformation = 11
} SYSTEM_INFORMATION_CLASS;

NTSTATUS NTAPI ZwQuerySystemInformation(
    SYSTEM_INFORMATION_CLASS SystemInformationClass,
    PVOID SystemInformation,
    ULONG SystemInformationLength,
    PULONG ReturnLength
);

#ifdef __cplusplus
}
#endif

// Communication packet flags
#define COMM_FLAG_READ_OPERATION     0x00000001
#define COMM_FLAG_WRITE_OPERATION    0x00000002
#define COMM_FLAG_MIRROR_OPERATION   0x00000004
#define COMM_FLAG_VALIDATE_POINTERS  0x00000008
#define COMM_FLAG_EXCEPTION_SAFE     0x00000010

// Command identifiers for Storage Driver
#define STORAGE_CMD_READ_MEMORY         0x1
#define STORAGE_CMD_WRITE_MEMORY        0x2
#define STORAGE_CMD_GET_MODULE_BASE     0x3
#define STORAGE_CMD_MIRROR_BLOCK        0x4
#define STORAGE_CMD_VALIDATE_ADDRESS    0x5

// Memory operation constants
#define MEMORY_ALLOCATION_ALIGNMENT  0x1000
#define MAX_MEMORY_TRANSFER_SIZE     0x100000  // 1MB

// System module information
typedef struct _SYSTEM_MODULE_INFORMATION {
    ULONG Reserved[2];
    PVOID Base;
    ULONG Size;
    ULONG Flags;
    USHORT Index;
    USHORT Unknown;
    USHORT LoadCount;
    USHORT ModuleNameOffset;
    CHAR ImageName[256];
} SYSTEM_MODULE_INFORMATION, *PSYSTEM_MODULE_INFORMATION;

typedef struct _SYSTEM_MODULE_INFORMATION_EX {
    ULONG ModulesCount;
    SYSTEM_MODULE_INFORMATION Modules[1];
} SYSTEM_MODULE_INFORMATION_EX, *PSYSTEM_MODULE_INFORMATION_EX;

// Function prototypes for stealth operations
PVOID GetSystemModuleBase(const char* moduleName);
PVOID GetSystemModuleExport(const char* moduleName, LPCSTR routineName);
NTSTATUS InitializeStorageCommunication();

// Storage Driver function prototypes
NTSTATUS SyncMemory(HANDLE pid, PVOID src, PVOID dst, SIZE_T size, BOOLEAN write);
NTSTATUS StorageSafeCopy(HANDLE processId, PVOID targetAddress, PVOID buffer, SIZE_T size, BOOLEAN isWrite);
NTSTATUS StorageMmCopyVirtualMemory(HANDLE sourcePid, PVOID sourceAddress, HANDLE targetPid, PVOID targetAddress, SIZE_T size);
NTSTATUS StorageGetModuleBase(HANDLE processId, PVOID* moduleBase);
VOID StorageWriteReadOnlyMemory(PVOID address, PVOID data, SIZE_T size);

// Hook function prototypes
NTSTATUS StorageInstallHook();
NTSTATUS StorageUninstallHook();
NTSTATUS StorageInitializeHijackedCommunication();
NTSTATUS StorageExternalCommInterface(PCOMM_PACKET packet);
NTSTATUS SataInternalHandler(PCOMM_PACKET packet);
NTSTATUS DiskSectorSataInternalHandler(PCOMMAND_PACKET packet);

// Stealth function prototypes
BOOLEAN HideDriverModule(PDRIVER_OBJECT DriverObject);
BOOLEAN StorageEraseFromPsLoadedModuleList(PDRIVER_OBJECT DriverObject);
VOID StorageZeroDriverNames(PDRIVER_OBJECT DriverObject);
BOOLEAN StorageWipePiDDBCacheTable();
BOOLEAN StorageClearMmUnloadedDrivers();
VOID StorageScrubHeaders(PVOID driverBase);
PVOID StorageFindPattern(PVOID base, SIZE_T size, const UCHAR* pattern, const char* mask);
