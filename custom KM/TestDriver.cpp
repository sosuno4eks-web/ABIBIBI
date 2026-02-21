#include <ntddk.h>

// Тестовый драйвер который создает файл для проверки
NTSTATUS DriverEntry(
    _In_ PDRIVER_OBJECT  DriverObject,
    _In_ PUNICODE_STRING RegistryPath
)
{
    UNREFERENCED_PARAMETER(DriverObject);
    UNREFERENCED_PARAMETER(RegistryPath);
    
    // Выводим в kernel debug log
    DbgPrintEx(0, 0, "[TEST] Driver loaded successfully!\n");
    
    // Создаем файл на диске для проверки
    UNICODE_STRING fileName;
    RtlInitUnicodeString(&fileName, L"\\??\\C:\\test_driver_loaded.txt");
    
    OBJECT_ATTRIBUTES objAttr;
    InitializeObjectAttributes(&objAttr, &fileName, OBJ_CASE_INSENSITIVE | OBJ_KERNEL_HANDLE, NULL, NULL);
    
    HANDLE fileHandle;
    IO_STATUS_BLOCK ioStatusBlock;
    
    NTSTATUS status = ZwCreateFile(
        &fileHandle,
        GENERIC_WRITE,
        &objAttr,
        &ioStatusBlock,
        NULL,
        FILE_ATTRIBUTE_NORMAL,
        0,
        FILE_OVERWRITE_IF,
        FILE_SYNCHRONOUS_IO_NONALERT,
        NULL,
        0
    );
    
    if (NT_SUCCESS(status))
    {
        // Записываем текст в файл
        char buffer[] = "Driver was successfully mapped and executed!\r\nKDMapper Stealth Edition works!\r\n";
        ULONG length = sizeof(buffer) - 1;
        
        ZwWriteFile(fileHandle, NULL, NULL, NULL, &ioStatusBlock, buffer, length, NULL, NULL);
        ZwClose(fileHandle);
        
        DbgPrintEx(0, 0, "[TEST] File created: C:\\test_driver_loaded.txt\n");
    }
    else
    {
        DbgPrintEx(0, 0, "[TEST] Failed to create file, status: 0x%X\n", status);
    }
    
    return STATUS_SUCCESS;
}
