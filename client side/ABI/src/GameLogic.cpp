/*
 * GameLogic.cpp - Arena Breakout Game Logic Implementation
 * 
 * Bridges the old math/rendering with new stealth driver communication
 * Updated for 2026 Arena Breakout build with fresh Dumpspace offsets
 */

#include <Windows.h>
#include <iostream>
#include <vector>
#include <thread>
#include <chrono>
#include "../includes/driver/driver.hpp"
#include "game/structs.hpp"
#include "game/offsets.hpp"
#include "game/sdk.hpp"
#include "game/cache.hpp"
#include "game/settings.hpp"

// External communication functions
extern bool InitializeDriverCommunication(const wchar_t* targetProcess);
extern DWORD GetProcessIdByName(const wchar_t* processName);
extern uintptr_t GetModuleBaseDriver(HANDLE processId, const wchar_t* moduleName);

/*
 * InitializeGameMemory
 * 
 * Initializes memory access to Arena Breakout process
 * Uses driver communication instead of ReadProcessMemory
 */
bool InitializeGameMemory() {
    const wchar_t* targetProcess = L"ArenaBreakout.exe";
    
    // Get process ID
    DWORD pid = GetProcessIdByName(targetProcess);
    if (!pid) {
        std::println("Failed to find process: {}", "ArenaBreakout.exe");
        return false;
    }
    
    // Initialize driver communication
    if (!InitializeDriverCommunication(targetProcess)) {
        std::println("Failed to initialize driver communication");
        return false;
    }
    
    // Initialize memory class with process info
    if (!mem.Initialize(targetProcess)) {
        std::println("Failed to initialize memory interface");
        return false;
    }
    
    std::println("Memory initialized successfully");
    std::println("Base Address: 0x{:X}", mem.BaseAddress);
    std::println("UWorld Offset: 0x{:X}", offsets::game::OFFSET_GWORLD);
    std::println("GNames Offset: 0x{:X}", offsets::game::OFFSET_GNAMES);
    
    return true;
}

/*
 * ValidateOffsets
 * 
 * Validates that the 2026 offsets are correct
 * Checks UWorld and GNames pointers
 */
bool ValidateOffsets() {
    // Read UWorld pointer
    uintptr_t uworld = mem.Read<uintptr_t>(mem.BaseAddress + offsets::game::OFFSET_GWORLD);
    if (!uworld || uworld < 0x10000) {
        std::println("Invalid UWorld pointer: 0x{:X}", uworld);
        return false;
    }
    
    // Read GNames pointer
    uintptr_t gnames = mem.Read<uintptr_t>(mem.BaseAddress + offsets::game::OFFSET_GNAMES);
    if (!gnames || gnames < 0x10000) {
        std::println("Invalid GNames pointer: 0x{:X}", gnames);
        return false;
    }
    
    std::println("Offset validation successful");
    std::println("UWorld: 0x{:X}", uworld);
    std::println("GNames: 0x{:X}", gnames);
    
    return true;
}

/*
 * GetPlayerPosition
 * 
 * Reads local player position from game memory
 * Uses new driver communication
 */
FVector GetPlayerPosition() {
    if (!cache::Local::LocalRootComponent) {
        return FVector{ 0, 0, 0 };
    }
    
    return mem.Read<FVector>(
        cache::Local::LocalRootComponent + offsets::USceneComponent::RelativeLocation
    );
}

/*
 * GetPlayerCamera
 * 
 * Reads camera information for world-to-screen calculations
 */
FMinimalViewInfo GetPlayerCamera() {
    if (!cache::Local::LocalPlayerCameraManager) {
        return FMinimalViewInfo{};
    }
    
    return mem.Read<FMinimalViewInfo>(
        cache::Local::LocalPlayerCameraManager + 
        offsets::APlayerCameraManager::CameraCachePrivate + 0x10
    );
}

/*
 * GetBonePosition
 * 
 * Reads bone position from skeletal mesh
 * Used for ESP skeleton rendering
 */
FVector GetBonePosition(uintptr_t mesh, int boneIndex) {
    if (!mesh) {
        return FVector{ 0, 0, 0 };
    }
    
    // Read ComponentToWorld pointer
    uintptr_t c2w_ptr = mem.Read<uintptr_t>(
        mesh + offsets::USkeletalMeshComponent::ComponentToWorld
    );
    
    if (!c2w_ptr) {
        return FVector{ 0, 0, 0 };
    }
    
    // Read bone array
    uintptr_t boneArray = mem.Read<uintptr_t>(mesh + 0x5A0); // BoneArray offset
    if (!boneArray) {
        return FVector{ 0, 0, 0 };
    }
    
    // Read bone transform
    FVector bonePos = mem.Read<FVector>(boneArray + (boneIndex * 0x30));
    FVector worldPos = mem.Read<FVector>(c2w_ptr);
    
    return FVector{
        worldPos.x + bonePos.x,
        worldPos.y + bonePos.y,
        worldPos.z + bonePos.z
    };
}

/*
 * IsPlayerValid
 * 
 * Validates player actor before processing
 */
bool IsPlayerValid(const Player& player) {
    if (!player.actor_pawn || !player.actor_mesh) {
        return false;
    }
    
    if (!player.actor_rootcomponent) {
        return false;
    }
    
    return true;
}

/*
 * GetPlayerDistance
 * 
 * Calculates distance between local player and target
 */
float GetPlayerDistance(const Player& player) {
    if (!IsPlayerValid(player)) {
        return 999999.0f;
    }
    
    FVector targetPos = mem.Read<FVector>(
        player.actor_rootcomponent + offsets::USceneComponent::RelativeLocation
    );
    
    return cache::Local::Location.Distance(targetPos);
}

/*
 * GetPlayerHealth
 * 
 * Reads player health value
 * Offset may need adjustment based on game version
 */
float GetPlayerHealth(const Player& player) {
    if (!IsPlayerValid(player)) {
        return 0.0f;
    }
    
    // Health offset may vary - this is a placeholder
    // Needs to be dumped from current game version
    return mem.Read<float>(player.actor_pawn + 0x1C0);
}

/*
 * IsPlayerBot
 * 
 * Checks if player is AI bot
 */
bool IsPlayerBot(const Player& player) {
    return player.bot || 
           player.actor_name.find("BP_UamAICharacter") != std::string::npos;
}

/*
 * GameLogicLoop
 * 
 * Main game logic processing loop
 * Runs continuously while cheat is active
 */
void GameLogicLoop() {
    std::println("Game logic loop started");
    
    while (settings::running) {
        // Wait for cache to be populated
        if (!cache::UWorld || !cache::Local::LocalUPawn) {
            std::this_thread::sleep_for(std::chrono::milliseconds(100));
            continue;
        }
        
        // Process player list
        for (const auto& player : cache::ActorList) {
            if (!IsPlayerValid(player)) {
                continue;
            }
            
            // Calculate distance
            float distance = GetPlayerDistance(player);
            if (distance > 500.0f) { // Max render distance
                continue;
            }
            
            // Get bone positions for ESP
            FVector headPos = GetBonePosition(player.actor_mesh, Bones::Head);
            FVector rootPos = mem.Read<FVector>(
                player.actor_rootcomponent + offsets::USceneComponent::RelativeLocation
            );
            
            // World-to-screen conversion handled by rendering thread
            // This is just data gathering
        }
        
        std::this_thread::sleep_for(std::chrono::milliseconds(10));
    }
    
    std::println("Game logic loop stopped");
}

/*
 * InitializeGameLogic
 * 
 * Main initialization function
 * Called from main.cpp
 */
bool InitializeGameLogic() {
    std::println("Initializing game logic...");
    
    // Initialize memory access
    if (!InitializeGameMemory()) {
        return false;
    }
    
    // Validate offsets
    if (!ValidateOffsets()) {
        std::println("Warning: Offset validation failed - offsets may be incorrect");
        // Continue anyway for testing
    }
    
    // Wait for cache to initialize
    std::this_thread::sleep_for(std::chrono::seconds(2));
    
    std::println("Game logic initialized successfully");
    return true;
}
