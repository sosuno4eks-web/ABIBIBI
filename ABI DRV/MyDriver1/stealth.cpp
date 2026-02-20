/* ── Windows 11 22H2/23H2 Structure Offsets ───────────────────── */

#define EPROCESS_PsLoadedModuleListOffset 0x0188
#define EPROCESS_PebOffset               0x550
#define DRIVER_OBJECT_DriverSection      0x020
#define DRIVER_OBJECT_DriverName         0x030
#define DRIVER_OBJECT_DeviceObject       0x038

/* ── Module Hiding Functions ───────────────────────────────────── */

BOOLEAN StorageEraseFromPsLoadedModuleList(PDRIVER_OBJECT DriverObject)
{
    if (!DriverObject) {
        return FALSE;
    }

    __try {
        // Get PsLoadedModuleList
        PLIST_ENTRY psLoadedModuleList = (PLIST_ENTRY)PsGetProcessPeb(PsInitialSystemProcess);
        if (!psLoadedModuleList) {
            return FALSE;
        }

        // Get our driver's LDR_DATA_TABLE_ENTRY
        PLDR_DATA_TABLE_ENTRY ourEntry = (PLDR_DATA_TABLE_ENTRY)DriverObject->DriverSection;
        if (!ourEntry) {
            return FALSE;
        }

        // Unlink from InLoadOrderLinks
        PLIST_ENTRY ourList = &ourEntry->InLoadOrderLinks;
        ourList->Blink->Flink = ourList->Flink;
        ourList->Flink->Blink = ourList->Blink;

        // Clear the list entries
        ourList->Flink = ourList;
        ourList->Blink = ourList;

        return TRUE;

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return FALSE;
    }
}

/* ── Zero Driver Names ───────────────────────────────────────── */

VOID StorageZeroDriverNames(PDRIVER_OBJECT DriverObject)
{
    if (!DriverObject) {
        return;
    }

    __try {
        // Clear DriverName
        if (DriverObject->DriverName.Buffer) {
            RtlZeroMemory(DriverObject->DriverName.Buffer, DriverObject->DriverName.Length);
            DriverObject->DriverName.Length = 0;
            DriverObject->DriverName.MaximumLength = 0;
        }

        // Clear DeviceObject references
        if (DriverObject->DeviceObject) {
            DriverObject->DeviceObject = NULL;
        }

        // Clear hardware database references
        if (DriverObject->HardwareDatabase) {
            DriverObject->HardwareDatabase = NULL;
        }

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Silent failure
    }
}

/* ── PiDDB Cache Eraser (iqvw64e.sys Target) ───────────────── */

BOOLEAN StorageWipePiDDBCacheTable()
{
    __try {
        // Find PiDDBCacheTable in ntoskrnl
        PVOID ntoskrnlBase = GetSystemModuleBase("ntoskrnl.exe");
        if (!ntoskrnlBase) {
            return FALSE;
        }

        // Pattern for PiDDBCacheTable (Windows 10 22H2)
        UCHAR pattern[] = {
            0x48, 0x8D, 0x0D, 0x00, 0x00, 0x00, 0x00,  // lea rcx, [PiDDBCacheTable]
            0xE8, 0x00, 0x00, 0x00, 0x00,              // call
            0x3D, 0x00, 0x00, 0x00, 0x00,              // cmp eax
            0x0F, 0x85                                 // jne
        };
        char mask[] = "xxx????x????x????xx";

        PVOID patternMatch = StorageFindPattern(ntoskrnlBase, 0x1000000, pattern, mask);
        if (!patternMatch) {
            return FALSE;
        }

        // Extract PiDDBCacheTable address
        INT32 offset = *(INT32*)((PUCHAR)patternMatch + 3);
        PVOID piDDBCacheTable = (PUCHAR)patternMatch + 7 + offset;

        // Remove our entry and iqvw64e.sys entry
        KIRQL oldIrql = KeRaiseIrqlToDpcLevel();

        __try {
            PLIST_ENTRY listHead = (PLIST_ENTRY)piDDBCacheTable;
            PLIST_ENTRY current = listHead->Flink;

            while (current != listHead) {
                // Use standard PiDDB cache entry structure
                typedef struct _PIDDB_CACHE_ENTRY {
                    LIST_ENTRY ListEntry;
                    UNICODE_STRING DriverName;
                    UNICODE_STRING RegistryPath;
                    PVOID DriverObject;
                    ULONG TimeDateStamp;
                    ULONG LoadCount;
                } PIDDB_CACHE_ENTRY, *PPIDDB_CACHE_ENTRY;
                
                PPIDDB_CACHE_ENTRY entry = CONTAINING_RECORD(current, PIDDB_CACHE_ENTRY, ListEntry);
                PLIST_ENTRY next = current->Flink;

                // Check for our driver AND iqvw64e.sys (anti-cheat bypass)
                if (entry->DriverName.Buffer && 
                    (wcsstr(entry->DriverName.Buffer, L"storage") || 
                     wcsstr(entry->DriverName.Buffer, L"driver") ||
                     wcsstr(entry->DriverName.Buffer, L"diagnostic") ||
                     wcsstr(entry->DriverName.Buffer, L"iqvw64e") ||  // Intel anti-cheat driver
                     wcsstr(entry->DriverName.Buffer, L"igdk") ||       // Intel graphics driver
                     wcsstr(entry->DriverName.Buffer, L"igfx"))) {      // Intel graphics driver
                    
                    // Remove from list
                    current->Blink->Flink = current->Flink;
                    current->Flink->Blink = current->Blink;
                    
                    // Zero out entry completely
                    RtlZeroMemory(entry, sizeof(PIDDB_CACHE_ENTRY));
                    
                    // Continue scanning for more entries
                }

                current = next;
            }

        }
        __finally {
            KeLowerIrql(oldIrql);
        }

        return TRUE;

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return FALSE;
    }
}

/* ── MmUnloadedDrivers Cleaner (Intel Driver Target) ───────────── */

BOOLEAN StorageClearMmUnloadedDrivers()
{
    __try {
        // Find MmUnloadedDrivers in ntoskrnl
        PVOID ntoskrnlBase = GetSystemModuleBase("ntoskrnl.exe");
        if (!ntoskrnlBase) {
            return FALSE;
        }

        // Pattern for MmUnloadedDrivers (Windows 10 22H2)
        UCHAR pattern[] = {
            0x48, 0x8D, 0x0D, 0x00, 0x00, 0x00, 0x00,  // lea rcx, [MmUnloadedDrivers]
            0x48, 0x8B, 0x05, 0x00, 0x00, 0x00, 0x00,  // mov rax, [MmUnloadedDrivers]
            0x48, 0x89, 0x0C, 0xC8                      // mov [rax+rcx*8], rcx
        };
        char mask[] = "xxx????xxx????xxx";

        PVOID patternMatch = StorageFindPattern(ntoskrnlBase, 0x1000000, pattern, mask);
        if (!patternMatch) {
            return FALSE;
        }

        // Extract MmUnloadedDrivers address
        INT32 offset = *(INT32*)((PUCHAR)patternMatch + 3);
        PVOID mmUnloadedDrivers = (PUCHAR)patternMatch + 7 + offset;

        // Get count
        offset = *(INT32*)((PUCHAR)patternMatch + 11);
        PULONG mmUnloadedDriversCount = (PULONG)((PUCHAR)patternMatch + 15 + offset);

        // Clear array and specifically target Intel/vulnerable drivers
        KIRQL oldIrql = KeRaiseIrqlToDpcLevel();

        __try {
            // Scan through entries and selectively wipe
            PUNICODE_STRING driverArray = (PUNICODE_STRING)mmUnloadedDrivers;
            ULONG count = *mmUnloadedDriversCount;

            for (ULONG i = 0; i < count; i++) {
                if (driverArray[i].Buffer) {
                    // Target Intel drivers and vulnerable drivers
                    if (wcsstr(driverArray[i].Buffer, L"iqvw64e") ||  // Intel anti-cheat
                        wcsstr(driverArray[i].Buffer, L"igdk") ||       // Intel graphics
                        wcsstr(driverArray[i].Buffer, L"igfx") ||       // Intel graphics
                        wcsstr(driverArray[i].Buffer, L"intel") ||      // Intel general
                        wcsstr(driverArray[i].Buffer, L"storage") ||   // Our driver
                        wcsstr(driverArray[i].Buffer, L"driver")) {      // Generic
                        
                        // Zero this entry
                        RtlZeroMemory(&driverArray[i], sizeof(UNICODE_STRING));
                    }
                }
            }

            // Finally clear the entire array
            RtlZeroMemory(mmUnloadedDrivers, count * sizeof(UNICODE_STRING));
            *mmUnloadedDriversCount = 0;
        }
        __finally {
            KeLowerIrql(oldIrql);
        }

        return TRUE;

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return FALSE;
    }
}

/* ── Memory Header Wipe (DOS/NT Headers) ───────────────────── */

VOID StorageScrubHeaders(PVOID driverBase)
{
    if (!driverBase) {
        return;
    }

    __try {
        // Get DOS header
        PIMAGE_DOS_HEADER dosHeader = (PIMAGE_DOS_HEADER)driverBase;
        if (dosHeader->e_magic != IMAGE_DOS_SIGNATURE) {
            return;
        }

        // Get NT headers
        PIMAGE_NT_HEADERS ntHeaders = (PIMAGE_NT_HEADERS)((PUCHAR)driverBase + dosHeader->e_lfanew);
        if (ntHeaders->Signature != IMAGE_NT_SIGNATURE) {
            return;
        }

        KIRQL oldIrql = KeRaiseIrqlToDpcLevel();

        __try {
            // 1. Clear DOS header completely
            RtlZeroMemory(dosHeader, sizeof(IMAGE_DOS_HEADER));

            // 2. Clear NT headers signature and file header
            ntHeaders->Signature = 0;
            RtlZeroMemory(&ntHeaders->FileHeader, sizeof(IMAGE_FILE_HEADER));

            // 3. Clear optional header
            RtlZeroMemory(&ntHeaders->OptionalHeader, sizeof(IMAGE_OPTIONAL_HEADER));

            // 4. Clear all section headers
            PIMAGE_SECTION_HEADER sectionHeaders = IMAGE_FIRST_SECTION(ntHeaders);
            for (WORD i = 0; i < ntHeaders->FileHeader.NumberOfSections; i++) {
                RtlZeroMemory(&sectionHeaders[i], sizeof(IMAGE_SECTION_HEADER));
            }

            // 5. Additional anti-signature measures
            // Clear first 4KB of the image to break pattern scanning
            RtlZeroMemory(driverBase, 0x1000);

        }
        __finally {
            KeLowerIrql(oldIrql);
        }

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Silent failure
    }
}

/* ── Pattern Scanning Utility ───────────────────────────────────── */

PVOID StorageFindPattern(PVOID base, SIZE_T size, const UCHAR* pattern, const char* mask)
{
    if (!base || !pattern || !mask) {
        return NULL;
    }

    __try {
        SIZE_T patternLength = strlen(mask);

        for (SIZE_T i = 0; i <= size - patternLength; i++) {
            BOOLEAN found = TRUE;
            
            for (SIZE_T j = 0; j < patternLength; j++) {
                if (mask[j] != '?' && ((PUCHAR)base)[i + j] != pattern[j]) {
                    found = FALSE;
                    break;
                }
            }

            if (found) {
                return (PUCHAR)base + i;
            }
        }

        return NULL;

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return NULL;
    }
}

/* ── Primary Stealth Function (Main Interface) ───────────────────── */

BOOLEAN HideDriverModule(PDRIVER_OBJECT DriverObject)
{
    if (!DriverObject) {
        return FALSE;
    }

    __try {
        // 1. Erase from PsLoadedModuleList
        if (!StorageEraseFromPsLoadedModuleList(DriverObject)) {
            return FALSE;
        }

        // 2. Zero driver names
        StorageZeroDriverNames(DriverObject);

        // 3. Wipe PiDDB cache table
        StorageWipePiDDBCacheTable();

        // 4. Clear MmUnloadedDrivers
        StorageClearMmUnloadedDrivers();

        // 5. Scrub headers to break signature scanners
        StorageScrubHeaders(DriverObject->DriverStart);

        // 6. Additional cleanup
        DriverObject->DriverStart = NULL;
        DriverObject->DriverSize = 0;
        DriverObject->DriverInit = NULL;
        DriverObject->DriverExtension = NULL;

        return TRUE;

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Complete silent failure
        return FALSE;
    }
}
