#pragma once
/*
 * memory.h - Kernel-mode memory operation prototypes
 */

#include "definitions.h"

/* System module helpers */
PVOID GetSystemModuleBase(const char* moduleName);
PVOID GetSystemModuleExport(const char* moduleName, LPCSTR routineName);

/* Write to read-only kernel memory (for hooking) */
BOOL WriteReadOnlyMemory(void* address, void* buffer, size_t size);
BOOL WriteMemory(void* address, void* buffer, size_t size);

/* Process memory R/W */
BOOL myReadProcessMemory(HANDLE pid, PVOID address, PVOID buffer, DWORD size);
BOOL myWriteProcessMemory(HANDLE pid, PVOID address, PVOID buffer, DWORD size);

/* Memory operations using KeStackAttachProcess */
NTSTATUS MemoryMirrorBlock(HANDLE sourcePid, HANDLE targetPid, PVOID sourceAddress, PVOID targetAddress, SIZE_T size);
NTSTATUS StorPortLogInternalError(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size);
NTSTATUS StorPortProcessRequest(HANDLE pid, PVOID address, PVOID buffer, SIZE_T size);

/* Module base detection via PEB walking */
PVOID StorPortInitialize(HANDLE pid, const wchar_t* moduleName);
PVOID StorPortGetDeviceBase(HANDLE pid);

/* Virtual memory management */
PVOID AllocateVirtualMemory(HANDLE pid, ULONGLONG size, DWORD protect);
VOID  FreeVirtualMemory(HANDLE pid, PVOID base);
BOOL  ProtectVirtualMemory(HANDLE pid, UINT_PTR base, ULONGLONG size, DWORD protection);

/* Process handle */
PVOID GetProcessHandle(HANDLE pid);

/* Module base via PEB walk */
PVOID GetProcessModuleBase(HANDLE pid, const wchar_t* moduleName);

/* Legacy function name mapping */
#define ReadProcessMemory StorPortLogInternalError
#define WriteProcessMemory StorPortProcessRequest
#define GetProcessModuleBase StorPortInitialize
#define GetTargetModuleBase StorPortGetDeviceBase