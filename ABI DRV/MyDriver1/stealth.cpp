#include "definitions.h"

extern "C" VOID FinalizeLoading(PDRIVER_OBJECT DriverObject)
{
    if (!DriverObject) {
        return;
    }

    __try {
        PLDR_DATA_TABLE_ENTRY ldrEntry = (PLDR_DATA_TABLE_ENTRY)DriverObject->DriverSection;
        if (!ldrEntry) {
            return;
        }

        KIRQL oldIrql = KeRaiseIrqlToDpcLevel();

        __try {
            RemoveEntryList(&ldrEntry->InLoadOrderLinks);
            RemoveEntryList(&ldrEntry->InMemoryOrderLinks);
            RemoveEntryList(&ldrEntry->InInitializationOrderLinks);
        }
        __except (EXCEPTION_EXECUTE_HANDLER) {
            KeLowerIrql(oldIrql);
            return;
        }

        KeLowerIrql(oldIrql);

        __try {
            if (ldrEntry->FullDllName.Buffer) {
                RtlZeroMemory(ldrEntry->FullDllName.Buffer, 
                             ldrEntry->FullDllName.Length);
                ldrEntry->FullDllName.Length = 0;
                ldrEntry->FullDllName.MaximumLength = 0;
            }

            if (ldrEntry->BaseDllName.Buffer) {
                RtlZeroMemory(ldrEntry->BaseDllName.Buffer, 
                             ldrEntry->BaseDllName.Length);
                ldrEntry->BaseDllName.Length = 0;
                ldrEntry->BaseDllName.MaximumLength = 0;
            }
        }
        __except (EXCEPTION_EXECUTE_HANDLER) {
            // Continue even if string clearing fails
        }

    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Silently fail to prevent system instability
    }
}
