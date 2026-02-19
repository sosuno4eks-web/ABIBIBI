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

#pragma comment(lib, "ntoskrnl.lib")

// PEB and LDR structure guards to prevent redefinition conflicts with Windows SDK
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

#endif // _LDR_DATA_TABLE_ENTRY_DEFINED_

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

#endif // _PEB_LDR_DATA_DEFINED_

typedef struct _PEB {
    UCHAR InheritedAddressSpace;
    UCHAR ReadImageFileExecOptions;
    UCHAR BeingDebugged;
    UCHAR BitField;
    PVOID Mutant;
    PVOID ImageBaseAddress;
    PPEB_LDR_DATA Ldr;
} PEB, *PPEB;

#endif // _PEB_DEFINED_

#ifdef __cplusplus
extern "C" {
#endif
PVOID NTAPI PsGetProcessPeb(PEPROCESS Process);
#ifdef __cplusplus
}
#endif

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
} COMM_PACKET, *PCOMMAND_PACKET;

// Legacy compatibility
typedef COMM_PACKET COMMAND_PACKET;
typedef PCOMMAND_PACKET PCOMMAND_PACKET;

// Communication packet flags
#define COMM_FLAG_READ_OPERATION     0x00000001
#define COMM_FLAG_WRITE_OPERATION    0x00000002
#define COMM_FLAG_MIRROR_OPERATION   0x00000004
#define COMM_FLAG_VALIDATE_POINTERS  0x00000008
#define COMM_FLAG_EXCEPTION_SAFE     0x00000010

// Command identifiers
#define COMM_CMD_READ_MEMORY         1
#define COMM_CMD_WRITE_MEMORY        2
#define COMM_CMD_GET_MODULE_BASE     3
#define COMM_CMD_MIRROR_BLOCK        4
#define COMM_CMD_VALIDATE_ADDRESS    5
