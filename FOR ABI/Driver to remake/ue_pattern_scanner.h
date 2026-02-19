#pragma once

#include "definitions.h"
#include "safe_copy.h"
#include "unreal_structures.hpp"

/* ── Pattern Scanning for Unreal Engine Structures ───────────────────── */

/*
 * Pattern scanning functions to locate GWorld, GNames, and GObjects
 * Essential for Unreal Engine 4/5 games like Arena Breakout Infinite
 */

/* Pattern signatures for Arena Breakout Infinite */
static const UCHAR GWorldPattern[] = {
    0x48, 0x8B, 0x05, 0x00, 0x00, 0x00, 0x00, // mov rax, [GWorld]
    0x48, 0x85, 0xC0,                               // test rax, rax
    0x74, 0x0A                                      // jz short
};

static const UCHAR GNamesPattern[] = {
    0x48, 0x8B, 0x1D, 0x00, 0x00, 0x00, 0x00, // mov rbx, [GNames]
    0x48, 0x89, 0x1D, 0x00, 0x00, 0x00, 0x00, // mov [GNames], rbx
    0x48, 0x85, 0xDB                                  // test rbx, rbx
};

static const UCHAR GObjectsPattern[] = {
    0x48, 0x8B, 0x35, 0x00, 0x00, 0x00, 0x00, // mov rsi, [GObjects]
    0x48, 0x8B, 0x3D, 0x00, 0x00, 0x00, 0x00, // mov rdi, [GObjects+8]
    0x48, 0x85, 0xF6                                  // test rsi, rsi
};

/* Enhanced pattern scanning with wildcard support */
static BOOLEAN ScanPatternEx(PUCHAR base, SIZE_T size, PUCHAR pattern, SIZE_T patternSize, PULONG_PTR offset)
{
    if (!base || !pattern || !offset) return FALSE;
    
    for (SIZE_T i = 0; i < size - patternSize; i++) {
        BOOLEAN found = TRUE;
        for (SIZE_T j = 0; j < patternSize; j++) {
            // 0xCC acts as wildcard
            if (pattern[j] != 0xCC && base[i + j] != pattern[j]) {
                found = FALSE;
                break;
            }
        }
        if (found) {
            *offset = i;
            return TRUE;
        }
    }
    return FALSE;
}

/* Get module base address by name */
static PVOID GetModuleBase(PCWSTR moduleName)
{
    ULONG bytesNeeded = 0;
    
    ZwQuerySystemInformation(SystemModuleInformation, NULL, 0, &bytesNeeded);
    if (!bytesNeeded) return NULL;
    
    PRTL_PROCESS_MODULES modules = (PRTL_PROCESS_MODULES)ExAllocatePoolWithTag(
        NonPagedPool, bytesNeeded, 'tspm');
    if (!modules) return NULL;
    
    if (!NT_SUCCESS(ZwQuerySystemInformation(SystemModuleInformation, 
            modules, bytesNeeded, &bytesNeeded))) {
        ExFreePoolWithTag(modules, 'tspm');
        return NULL;
    }
    
    PVOID moduleBase = NULL;
    for (ULONG i = 0; i < modules->NumberOfModules; i++) {
        if (wcsstr(modules->Modules[i].FullPathName, moduleName)) {
            moduleBase = modules->Modules[i].ImageBase;
            break;
        }
    }
    
    ExFreePoolWithTag(modules, 'tspm');
    return moduleBase;
}

/* Find GWorld in ArenaBreakout.exe */
PUWorld FindGWorld()
{
    PVOID arenaBreakoutBase = GetModuleBase(L"ArenaBreakout.exe");
    if (!arenaBreakoutBase) {
        // Try BE version
        arenaBreakoutBase = GetModuleBase(L"ArenaBreakout_BE.exe");
    }
    
    if (!arenaBreakoutBase) return NULL;
    
    // Get module size (approximate)
    ULONG moduleSize = 0x10000000; // 256MB, adjust as needed
    
    ULONG_PTR patternOffset = 0;
    if (!ScanPatternEx((PUCHAR)arenaBreakoutBase, moduleSize,
            (PUCHAR)GWorldPattern, sizeof(GWorldPattern), &patternOffset)) {
        return NULL;
    }
    
    // Extract relative offset and calculate GWorld address
    LONG relOffset = *(PLONG)((PUCHAR)arenaBreakoutBase + patternOffset + 3);
    PUWorld gWorld = *(PUWorld*)((PUCHAR)arenaBreakoutBase + patternOffset + 7 + relOffset);
    
    return gWorld;
}

/* Find GNames in ArenaBreakout.exe */
PVOID FindGNames()
{
    PVOID arenaBreakoutBase = GetModuleBase(L"ArenaBreakout.exe");
    if (!arenaBreakoutBase) {
        arenaBreakoutBase = GetModuleBase(L"ArenaBreakout_BE.exe");
    }
    
    if (!arenaBreakoutBase) return NULL;
    
    ULONG moduleSize = 0x10000000;
    
    ULONG_PTR patternOffset = 0;
    if (!ScanPatternEx((PUCHAR)arenaBreakoutBase, moduleSize,
            (PUCHAR)GNamesPattern, sizeof(GNamesPattern), &patternOffset)) {
        return NULL;
    }
    
    // Extract relative offset and calculate GNames address
    LONG relOffset = *(PLONG)((PUCHAR)arenaBreakoutBase + patternOffset + 3);
    PVOID gNames = *(PVOID*)((PUCHAR)arenaBreakoutBase + patternOffset + 7 + relOffset);
    
    return gNames;
}

/* Find GObjects in ArenaBreakout.exe */
PVOID FindGObjects()
{
    PVOID arenaBreakoutBase = GetModuleBase(L"ArenaBreakout.exe");
    if (!arenaBreakoutBase) {
        arenaBreakoutBase = GetModuleBase(L"ArenaBreakout_BE.exe");
    }
    
    if (!arenaBreakoutBase) return NULL;
    
    ULONG moduleSize = 0x10000000;
    
    ULONG_PTR patternOffset = 0;
    if (!ScanPatternEx((PUCHAR)arenaBreakoutBase, moduleSize,
            (PUCHAR)GObjectsPattern, sizeof(GObjectsPattern), &patternOffset)) {
        return NULL;
    }
    
    // Extract relative offset and calculate GObjects address
    LONG relOffset = *(PLONG)((PUCHAR)arenaBreakoutBase + patternOffset + 3);
    PVOID gObjects = *(PVOID*)((PUCHAR)arenaBreakoutBase + patternOffset + 7 + relOffset);
    
    return gObjects;
}

/* Validate GWorld by checking its structure */
BOOLEAN ValidateGWorld(PUWorld gWorld)
{
    if (!gWorld) return FALSE;
    
    __try {
        // Check if OwningGameInstance is valid
        PUGameInstance gameInstance = gWorld->OwningGameInstance;
        if (!gameInstance) return FALSE;
        
        // Check if PersistentLevel is valid
        PULevel persistentLevel = gWorld->PersistentLevel;
        if (!persistentLevel) return FALSE;
        
        // Check if GameState is valid
        PAGameStateBase gameState = gWorld->GameState;
        if (!gameState) return FALSE;
        
        return TRUE;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return FALSE;
    }
}

/* Initialize all UE globals */
BOOLEAN InitializeUEGlobals()
{
    PUWorld gWorld = FindGWorld();
    PVOID gNames = FindGNames();
    PVOID gObjects = FindGObjects();
    
    if (!gWorld || !gNames || !gObjects) {
        return FALSE;
    }
    
    // Validate GWorld
    if (!ValidateGWorld(gWorld)) {
        return FALSE;
    }
    
    // Store globals for later use (could be stored in global variables)
    // This would typically be done in driver initialization
    
    return TRUE;
}

/* Get current world context (runtime check) */
PUWorld GetCurrentWorld()
{
    PUWorld gWorld = FindGWorld();
    return ValidateGWorld(gWorld) ? gWorld : NULL;
}
