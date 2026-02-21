/*
 * physical_memory.h - Physical Memory Access via Page Table Walking
 * 
 * CRITICAL: This bypasses Windows Virtual Memory Manager entirely
 * ACE cannot spoof physical RAM access
 * 
 * ARCHITECTURE:
 * - Manual page table walking (PML4 -> PDPT -> PD -> PT)
 * - Direct physical memory access via MmMapIoSpace
 * - No MmCopyVirtualMemory (ACE hooks this)
 * - Hardware-level memory access
 * 
 * Target: Windows 10 22H2 (Build 19045)
 */

#pragma once

#include <ntifs.h>
#include <ntddk.h>

#ifdef __cplusplus
extern "C" {
#endif

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * PAGE TABLE STRUCTURES (x64)
 * ═══════════════════════════════════════════════════════════════════════════
 */

// Page table entry structure
typedef union _PTE_64 {
    struct {
        UINT64 Present : 1;              // 0: Present
        UINT64 Write : 1;                // 1: Writable
        UINT64 UserMode : 1;             // 2: User mode accessible
        UINT64 WriteThrough : 1;         // 3: Write-through caching
        UINT64 CacheDisable : 1;         // 4: Cache disabled
        UINT64 Accessed : 1;             // 5: Accessed
        UINT64 Dirty : 1;                // 6: Dirty
        UINT64 LargePage : 1;            // 7: Large page (2MB/1GB)
        UINT64 Global : 1;               // 8: Global
        UINT64 CopyOnWrite : 1;          // 9: Copy on write
        UINT64 Prototype : 1;            // 10: Prototype
        UINT64 Reserved0 : 1;            // 11: Reserved
        UINT64 PageFrameNumber : 36;     // 12-47: Physical page number
        UINT64 Reserved1 : 4;            // 48-51: Reserved
        UINT64 SoftwareWsIndex : 11;     // 52-62: Software field
        UINT64 NoExecute : 1;            // 63: No execute
    };
    UINT64 Value;
} PTE_64, *PPTE_64;

// Virtual address breakdown
typedef union _VIRT_ADDR_64 {
    struct {
        UINT64 Offset : 12;              // 0-11: Page offset
        UINT64 PT_Index : 9;             // 12-20: Page Table index
        UINT64 PD_Index : 9;             // 21-29: Page Directory index
        UINT64 PDPT_Index : 9;           // 30-38: Page Directory Pointer Table index
        UINT64 PML4_Index : 9;           // 39-47: Page Map Level 4 index
        UINT64 Reserved : 16;            // 48-63: Sign extension
    };
    UINT64 Value;
} VIRT_ADDR_64, *PVIRT_ADDR_64;

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * PHYSICAL MEMORY ACCESS
 * ═══════════════════════════════════════════════════════════════════════════
 */

// Get CR3 (Page Directory Base) for a process
static FORCEINLINE UINT64 GetProcessCR3(PEPROCESS Process) {
    __try {
        // CR3 is stored at offset 0x28 in EPROCESS (DirectoryTableBase)
        const ULONG_PTR CR3_OFFSET = 0x28;
        UINT64 cr3 = *(UINT64*)((ULONG_PTR)Process + CR3_OFFSET);
        return cr3;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return 0;
    }
}

// Map physical page to virtual address
static FORCEINLINE PVOID MapPhysicalPage(UINT64 PhysicalAddress) {
    __try {
        PHYSICAL_ADDRESS physAddr;
        physAddr.QuadPart = PhysicalAddress & ~0xFFFULL; // Align to 4KB
        
        // Map 4KB page
        PVOID virtualAddr = MmMapIoSpace(physAddr, 0x1000, MmCached);
        return virtualAddr;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return NULL;
    }
}

// Unmap physical page
static FORCEINLINE VOID UnmapPhysicalPage(PVOID VirtualAddress) {
    __try {
        if (VirtualAddress != NULL) {
            MmUnmapIoSpace(VirtualAddress, 0x1000);
        }
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        // Ignore
    }
}

// Translate virtual address to physical address via page table walking
static FORCEINLINE UINT64 VirtualToPhysical(PEPROCESS Process, UINT64 VirtualAddress) {
    __try {
        // Get CR3 (physical address of PML4)
        UINT64 cr3 = GetProcessCR3(Process);
        if (cr3 == 0) {
            return 0;
        }
        
        // Parse virtual address
        VIRT_ADDR_64 virt;
        virt.Value = VirtualAddress;
        
        // Step 1: Map PML4 table
        PVOID pml4_base = MapPhysicalPage(cr3);
        if (pml4_base == NULL) {
            return 0;
        }
        
        PTE_64* pml4_entry = (PTE_64*)((ULONG_PTR)pml4_base + (virt.PML4_Index * 8));
        if (!pml4_entry->Present) {
            UnmapPhysicalPage(pml4_base);
            return 0;
        }
        
        UINT64 pdpt_phys = pml4_entry->PageFrameNumber << 12;
        UnmapPhysicalPage(pml4_base);
        
        // Step 2: Map PDPT table
        PVOID pdpt_base = MapPhysicalPage(pdpt_phys);
        if (pdpt_base == NULL) {
            return 0;
        }
        
        PTE_64* pdpt_entry = (PTE_64*)((ULONG_PTR)pdpt_base + (virt.PDPT_Index * 8));
        if (!pdpt_entry->Present) {
            UnmapPhysicalPage(pdpt_base);
            return 0;
        }
        
        // Check for 1GB page
        if (pdpt_entry->LargePage) {
            UINT64 phys_addr = (pdpt_entry->PageFrameNumber << 12) + (VirtualAddress & 0x3FFFFFFF);
            UnmapPhysicalPage(pdpt_base);
            return phys_addr;
        }
        
        UINT64 pd_phys = pdpt_entry->PageFrameNumber << 12;
        UnmapPhysicalPage(pdpt_base);
        
        // Step 3: Map PD table
        PVOID pd_base = MapPhysicalPage(pd_phys);
        if (pd_base == NULL) {
            return 0;
        }
        
        PTE_64* pd_entry = (PTE_64*)((ULONG_PTR)pd_base + (virt.PD_Index * 8));
        if (!pd_entry->Present) {
            UnmapPhysicalPage(pd_base);
            return 0;
        }
        
        // Check for 2MB page
        if (pd_entry->LargePage) {
            UINT64 phys_addr = (pd_entry->PageFrameNumber << 12) + (VirtualAddress & 0x1FFFFF);
            UnmapPhysicalPage(pd_base);
            return phys_addr;
        }
        
        UINT64 pt_phys = pd_entry->PageFrameNumber << 12;
        UnmapPhysicalPage(pd_base);
        
        // Step 4: Map PT table
        PVOID pt_base = MapPhysicalPage(pt_phys);
        if (pt_base == NULL) {
            return 0;
        }
        
        PTE_64* pt_entry = (PTE_64*)((ULONG_PTR)pt_base + (virt.PT_Index * 8));
        if (!pt_entry->Present) {
            UnmapPhysicalPage(pt_base);
            return 0;
        }
        
        // Calculate final physical address
        UINT64 phys_addr = (pt_entry->PageFrameNumber << 12) + virt.Offset;
        UnmapPhysicalPage(pt_base);
        
        return phys_addr;
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return 0;
    }
}

// Read physical memory (bypasses ALL virtual memory hooks)
static FORCEINLINE NTSTATUS ReadPhysicalMemory(
    PEPROCESS Process,
    UINT64 VirtualAddress,
    PVOID Buffer,
    SIZE_T Size
) {
    __try {
        UCHAR* dest = (UCHAR*)Buffer;
        SIZE_T bytesRead = 0;
        
        while (bytesRead < Size) {
            // Translate current virtual address to physical
            UINT64 currentVirt = VirtualAddress + bytesRead;
            UINT64 physAddr = VirtualToPhysical(Process, currentVirt);
            
            if (physAddr == 0) {
                return STATUS_ACCESS_VIOLATION;
            }
            
            // Calculate bytes to read from this page
            UINT64 pageOffset = physAddr & 0xFFF;
            SIZE_T bytesInPage = 0x1000 - pageOffset;
            SIZE_T bytesToRead = min(bytesInPage, Size - bytesRead);
            
            // Map physical page
            PVOID mappedPage = MapPhysicalPage(physAddr);
            if (mappedPage == NULL) {
                return STATUS_INSUFFICIENT_RESOURCES;
            }
            
            // Copy data from physical memory
            RtlCopyMemory(dest + bytesRead, (UCHAR*)mappedPage + pageOffset, bytesToRead);
            
            // Unmap page
            UnmapPhysicalPage(mappedPage);
            
            bytesRead += bytesToRead;
        }
        
        return STATUS_SUCCESS;
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

// Write physical memory (bypasses ALL virtual memory hooks)
static FORCEINLINE NTSTATUS WritePhysicalMemory(
    PEPROCESS Process,
    UINT64 VirtualAddress,
    PVOID Buffer,
    SIZE_T Size
) {
    __try {
        UCHAR* src = (UCHAR*)Buffer;
        SIZE_T bytesWritten = 0;
        
        while (bytesWritten < Size) {
            // Translate current virtual address to physical
            UINT64 currentVirt = VirtualAddress + bytesWritten;
            UINT64 physAddr = VirtualToPhysical(Process, currentVirt);
            
            if (physAddr == 0) {
                return STATUS_ACCESS_VIOLATION;
            }
            
            // Calculate bytes to write to this page
            UINT64 pageOffset = physAddr & 0xFFF;
            SIZE_T bytesInPage = 0x1000 - pageOffset;
            SIZE_T bytesToWrite = min(bytesInPage, Size - bytesWritten);
            
            // Map physical page
            PVOID mappedPage = MapPhysicalPage(physAddr);
            if (mappedPage == NULL) {
                return STATUS_INSUFFICIENT_RESOURCES;
            }
            
            // Copy data to physical memory
            RtlCopyMemory((UCHAR*)mappedPage + pageOffset, src + bytesWritten, bytesToWrite);
            
            // Unmap page
            UnmapPhysicalPage(mappedPage);
            
            bytesWritten += bytesToWrite;
        }
        
        return STATUS_SUCCESS;
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return STATUS_UNHANDLED_EXCEPTION;
    }
}

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * PHYSICAL BASE ADDRESS DISCOVERY
 * ═══════════════════════════════════════════════════════════════════════════
 */

// Find game base address using physical memory scanning
static FORCEINLINE UINT64 FindBaseAddressPhysical(PEPROCESS Process) {
    __try {
        // Scan user-mode address space for MZ header
        // Start at 0x10000 (64KB) and scan up to 0x7FFFFFFFFFFF
        
        for (UINT64 testAddr = 0x10000; testAddr < 0x7FFFFFFFFFFF; testAddr += 0x10000) {
            // Translate to physical
            UINT64 physAddr = VirtualToPhysical(Process, testAddr);
            if (physAddr == 0) {
                continue;
            }
            
            // Map physical page
            PVOID mappedPage = MapPhysicalPage(physAddr);
            if (mappedPage == NULL) {
                continue;
            }
            
            // Check for MZ header
            UINT16 mzHeader = *(UINT16*)mappedPage;
            
            if (mzHeader == 0x5A4D) {  // 'MZ'
                // Verify PE header
                UINT32 peOffset = *(UINT32*)((ULONG_PTR)mappedPage + 0x3C);
                
                if (peOffset < 0x1000) {
                    // Check if PE header is in same page
                    if (peOffset < 0xFF0) {
                        UINT32 peSignature = *(UINT32*)((ULONG_PTR)mappedPage + peOffset);
                        
                        if (peSignature == 0x00004550) {  // 'PE\0\0'
                            UnmapPhysicalPage(mappedPage);
                            return testAddr;
                        }
                    }
                }
            }
            
            UnmapPhysicalPage(mappedPage);
            
            // Limit scan to first 2GB to avoid timeout
            if (testAddr > 0x80000000) {
                break;
            }
        }
        
        return 0;
        
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return 0;
    }
}

#ifdef __cplusplus
}
#endif
