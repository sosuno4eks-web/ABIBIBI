/*
 * main.cpp - Windows Storage Driver
 *
 * GHOST DRIVER MODE - No device objects, no IOCTL, complete stealth
 * Communication via function pointer hijack in win32kbase.sys
 * Memory operations use KeStackAttachProcess only
 */

#include "definitions.h"

// Эти функции SWE-1.5 напишет тебе по промтам выше
extern "C" NTSTATUS SataProtocolStart(); 
extern "C" VOID FinalizeLoading(PDRIVER_OBJECT obj);

/* ── Driver Entry (Stealth Mode - SWE Replacement) ───── */

extern "C" NTSTATUS DriverEntry(
    PDRIVER_OBJECT  DriverObject,
    PUNICODE_STRING RegistryPath)
{
    UNREFERENCED_PARAMETER(RegistryPath);

    // 1. Скрываемся сразу после запуска
    FinalizeLoading(DriverObject);

    // 2. Запускаем протокол общения
    return SataProtocolStart();
}
