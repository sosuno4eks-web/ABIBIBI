#pragma once

/* ── Offsets Header for Arena Breakout Infinite (UE 4.26.1) ───── */

/*
 * UE 4.26.1 specific offsets for Arena Breakout Infinite
 * Target: ArenaBreakout.exe
 * Anti-Cheat: Status 0x0
 * 
 * These offsets are used with KeStackAttachProcess memory operations
 * No MmCopyVirtualMemory - completely bypassed
 */

/* ── Core UE 4.26.1 Offsets ───────────────────────────── */

/* GWorld offset - primary game world pointer */
#define OFFSET_GWORLD 0x9914A28

/* UWorld structure offsets */
#define OFFSET_UWORLD_PERSISTENT_LEVEL 0x30
#define OFFSET_UWORLD_OWNING_GAME_INSTANCE 0x38
#define OFFSET_UWORLD_GAME_STATE 0x148

/* ULevel structure offsets */
#define OFFSET_ULEVEL_ACTORS 0x98
#define OFFSET_ULEVEL_ACTOR_COUNT 0xA0

/* AActor structure offsets */
#define OFFSET_ACTOR_ROOT_COMPONENT 0x48
#define OFFSET_ACTOR_COMPONENT 0x0
#define OFFSET_ACTOR_POSITION 0x1C0

/* USceneComponent structure offsets */
#define OFFSET_SCENE_COMPONENT_RELATIVE_LOCATION 0x1C0

/* ── Game Specific Offsets ───────────────────────────────── */

/* Player controller offsets */
#define OFFSET_PLAYER_CONTROLLER_CAMERA_MANAGER 0x4C8
#define OFFSET_PLAYER_CONTROLLER_PAWN 0x4A0

/* Camera manager offsets */
#define OFFSET_CAMERA_MANAGER_CAMERA_CACHE 0x4B0
#define OFFSET_CAMERA_CACHE_POV 0x10
#define OFFSET_CAMERA_POV_LOCATION 0x20
#define OFFSET_CAMERA_POV_ROTATION 0x30
#define OFFSET_CAMERA_POV_FOV 0x40

/* Pawn offsets */
#define OFFSET_PAWN_PLAYER_STATE 0x4A8
#define OFFSET_PAWN_HEALTH 0x8B0

/* ── Memory Reading Offsets ─────────────────────────────── */

/* Process module detection offsets */
#define OFFSET_PEB_LDR_DATA 0x18
#define OFFSET_LDR_IN_LOAD_ORDER_MODULE_LIST 0x10
#define OFFSET_LDR_DATA_TABLE_ENTRY_DLL_BASE 0x30

/* ── Stealth Communication Offsets ─────────────────────────── */

/* .data pointer communication offsets */
#define OFFSET_DATA_PTR_COMMUNICATION 0x1000
#define OFFSET_DATA_PTR_SIZE 0x10000

/* Signed system driver hook offsets */
#define OFFSET_WIN32K_HOOK_TARGET 0x200000
#define OFFSET_DXGKRNL_HOOK_TARGET 0x300000

/* ── ACE Bypass Offsets ─────────────────────────────────── */

/* PiDDB cache table pattern offsets */
#define OFFSET_PIDDB_PATTERN_MATCH 0x7
#define OFFSET_PIDDB_CACHE_TABLE 0x0

/* MmUnloadedDrivers pattern offsets */
#define OFFSET_MMUNLOADED_PATTERN_MATCH 0x7
#define OFFSET_MMUNLOADED_DRIVERS_LIST 0x0

/* Driver section cleaning offsets */
#define OFFSET_DRIVER_SECTION_SIZE sizeof(LDR_DATA_TABLE_ENTRY)
#define OFFSET_DRIVER_NAME_BUFFER 0x14

/* ── Utility Macros ───────────────────────────────────────── */

/* Safe pointer reading macro */
#define SAFE_READ(ptr, offset) \
    (((PVOID)((UINT64)(ptr) + (offset)))

/* Size macros */
#define SIZE_UE4_NAME 64
#define SIZE_UE4_STRING 256
#define SIZE_ACTOR_ARRAY 0x10000

/* Alignment macros */
#define ALIGN_4K(addr) (((UINT64)(addr) + 0xFFF) & ~0xFFF)
#define ALIGN_64K(addr) (((UINT64)(addr) + 0xFFFF) & ~0xFFFF)

/* ── Debug Macros ─────────────────────────────────────────── */

/* Debug print macros for ACE bypass verification */
#define DEBUG_PIDDB_CLEANING 1
#define DEBUG_MMUNLOADED_CLEANING 1
#define DEBUG_COMMUNICATION_SETUP 1
#define DEBUG_MEMORY_OPERATIONS 1

#if DEBUG_PIDDB_CLEANING
#define DBG_PIDDB(fmt, ...) DbgPrint("[PIDDB] " fmt, ##__VA_ARGS__)
#else
#define DBG_PIDDB(fmt, ...)
#endif

#if DEBUG_MMUNLOADED_CLEANING
#define DBG_MMUNLOADED(fmt, ...) DbgPrint("[MMUNLOADED] " fmt, ##__VA_ARGS__)
#else
#define DBG_MMUNLOADED(fmt, ...)
#endif

#if DEBUG_COMMUNICATION_SETUP
#define DBG_COMM(fmt, ...) DbgPrint("[COMM] " fmt, ##__VA_ARGS__)
#else
#define DBG_COMM(fmt, ...)
#endif

#if DEBUG_MEMORY_OPERATIONS
#define DBG_MEM(fmt, ...) DbgPrint("[MEM] " fmt, ##__VA_ARGS__)
#else
#define DBG_MEM(fmt, ...)
#endif

/* ── Version Information ───────────────────────────────────── */

/* UE 4.26.1 specific version info */
#define UE_VERSION_MAJOR 4
#define UE_VERSION_MINOR 26
#define UE_VERSION_PATCH 1

/* ACE bypass version */
#define ACE_BYPASS_VERSION 1
#define ACE_BYPASS_SUBVERSION 0

/* Game information */
#define GAME_NAME L"ArenaBreakout.exe"
#define GAME_NAME_BE L"ArenaBreakout_BE.exe"
#define GAME_ENGINE L"Unreal Engine 4.26.1"
#define ANTICHEAT_NAME L"Status 0x0"
