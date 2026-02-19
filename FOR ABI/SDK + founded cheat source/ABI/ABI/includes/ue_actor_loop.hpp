#pragma once

#include "unreal_structures.hpp"
#include "world_to_screen.hpp"
#include "ue_pattern_scanner.hpp"
#include "safe_copy.h"

/* ── Basic Unreal Engine Actor Loop Template ───────────────────────── */

/*
 * UEActorLoop - Replaces old Rust game loop with Unreal Engine actor iteration
 * Designed for Arena Breakout Infinite (ACE/Tencent)
 * Uses safe memory operations and pattern scanning
 */

/* Player information structure */
typedef struct UEPlayer {
    PACharacter Character;
    PUSkeletalMeshComponent Mesh;
    PUSceneComponent RootComponent;
    PAPlayerState PlayerState;
    FVector Location;
    FVector2D ScreenPosition;
    float Distance;
    BOOLEAN IsLocalPlayer;
    BOOLEAN IsValid;
    
    UEPlayer() : Character(nullptr), Mesh(nullptr), RootComponent(nullptr),
                  PlayerState(nullptr), Location{}, ScreenPosition{},
                  Distance(0.0f), IsLocalPlayer(FALSE), IsValid(FALSE) {}
} UEPlayer, *PUEPlayer;

/* Actor loop context */
typedef struct ActorLoopContext {
    PUWorld World;
    PULevel Level;
    PAPlayerController LocalController;
    PACharacter LocalCharacter;
    TArray ActorArray;
    int32_t ActorCount;
    FMinimalViewInfo Camera;
    
    ActorLoopContext() : World(nullptr), Level(nullptr), LocalController(nullptr),
                        LocalCharacter(nullptr), ActorArray{}, ActorCount(0),
                        Camera{} {}
} ActorLoopContext, *PActorLoopContext;

/* Initialize actor loop context */
BOOLEAN InitializeActorLoop(PActorLoopContext context)
{
    if (!context) return FALSE;
    
    // Find current world
    context->World = GetCurrentWorld();
    if (!context->World) {
        return FALSE;
    }
    
    // Get persistent level
    context->Level = context->World->PersistentLevel;
    if (!context->Level) {
        return FALSE;
    }
    
    // Get actor array
    context->ActorArray = context->Level->Actors;
    context->ActorCount = context->ActorArray.Count;
    
    // Find local player controller
    PUGameInstance gameInstance = context->World->OwningGameInstance;
    if (!gameInstance) return FALSE;
    
    // Get local players
    TArray localPlayers = gameInstance->LocalPlayers;
    if (localPlayers.Count <= 0) return FALSE;
    
    // Get first local player
    PULocalPlayer localPlayer = (PULocalPlayer)localPlayers.Get(0);
    if (!localPlayer) return FALSE;
    
    context->LocalController = localPlayer->PlayerController;
    if (!context->LocalController) return FALSE;
    
    // Get local character
    context->LocalCharacter = context->LocalController->AcknowledgedPawn;
    if (!context->LocalCharacter) {
        // Player might not be in game yet
        return FALSE;
    }
    
    // Get camera info
    PAPlayerCameraManager cameraManager = context->LocalController->PlayerCameraManager;
    if (!cameraManager) return FALSE;
    
    context->Camera = cameraManager->CameraCachePrivate;
    
    return TRUE;
}

/* Validate actor is a player character */
BOOLEAN IsValidPlayerCharacter(PAActor actor, PUEPlayer playerInfo)
{
    if (!actor || !playerInfo) return FALSE;
    
    __try {
        // Check if actor is a character
        UClass* actorClass = actor->Class;
        if (!actorClass) return FALSE;
        
        // Get actor name (simplified - in real implementation would use GNames)
        // For ABI, we'd check for specific character class names
        // This is a placeholder for the actual name checking logic
        
        // Check if character has required components
        playerInfo->Character = (PACharacter)actor;
        playerInfo->Mesh = playerInfo->Character->Mesh;
        playerInfo->RootComponent = actor->RootComponent;
        playerInfo->PlayerState = playerInfo->Character->PlayerState;
        
        if (!playerInfo->Mesh || !playerInfo->RootComponent) {
            return FALSE;
        }
        
        // Get location
        playerInfo->Location = playerInfo->RootComponent->RelativeLocation;
        
        playerInfo->IsValid = TRUE;
        return TRUE;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        playerInfo->IsValid = FALSE;
        return FALSE;
    }
}

/* Update player information */
VOID UpdatePlayerInfo(PUEPlayer playerInfo, PAActor actor, 
                      PACharacter localCharacter, float screenWidth, float screenHeight)
{
    if (!playerInfo || !actor) return;
    
    // Check if this is local player
    playerInfo->IsLocalPlayer = (actor == (PAActor)localCharacter);
    
    // Calculate distance from local player
    if (!playerInfo->IsLocalPlayer && localCharacter) {
        PUSceneComponent localRoot = localCharacter->RootComponent;
        if (localRoot) {
            FVector localLocation = localRoot->RelativeLocation;
            playerInfo->Distance = playerInfo->Location.Distance(localLocation);
        }
    }
    
    // Convert to screen coordinates
    if (!playerInfo->IsLocalPlayer) {
        WorldToScreenEx(playerInfo->Camera, playerInfo->Location, 
                      &playerInfo->ScreenPosition, screenWidth, screenHeight, 
                      &playerInfo->Distance);
    }
}

/* Main actor loop function */
VOID ProcessActorLoop(PActorLoopContext context, float screenWidth, float screenHeight)
{
    if (!context || !context->Level) return;
    
    // Clear previous actor list (in real implementation, would maintain dynamic array)
    static UEPlayer players[64];
    int32_t playerCount = 0;
    
    // Iterate through actors
    for (int32_t i = 0; i < context->ActorCount && playerCount < 64; i++) {
        PAActor actor = (PAActor)context->ActorArray.Get(i);
        if (!actor) continue;
        
        UEPlayer playerInfo = {};
        
        // Check if actor is a valid player character
        if (IsValidPlayerCharacter(actor, &playerInfo)) {
            UpdatePlayerInfo(&playerInfo, actor, context->LocalCharacter, 
                           screenWidth, screenHeight);
            
            // Add to player list (skip local player for ESP)
            if (!playerInfo.IsLocalPlayer && playerInfo.IsValid) {
                players[playerCount++] = playerInfo;
            }
        }
    }
    
    // Now you can process the players array for ESP, aimbot, etc.
    // Example: Render ESP for all valid players
    for (int32_t i = 0; i < playerCount; i++) {
        UEPlayer* player = &players[i];
        
        if (player->IsValid && IsOnScreen(player->ScreenPosition, screenWidth, screenHeight)) {
            // ESP rendering would go here
            // Example: DrawBox(player->ScreenPosition, player->Distance);
            // Example: DrawName(player->ScreenPosition, player->PlayerState->PlayerName);
        }
    }
}

/* Update actor loop (call this regularly) */
BOOLEAN UpdateActorLoop(PActorLoopContext context, float screenWidth, float screenHeight)
{
    if (!context) return FALSE;
    
    // Re-initialize if world changed
    PUWorld currentWorld = GetCurrentWorld();
    if (currentWorld != context->World) {
        if (!InitializeActorLoop(context)) {
            return FALSE;
        }
    }
    
    // Update camera info
    if (context->LocalController && context->LocalController->PlayerCameraManager) {
        context->Camera = context->LocalController->PlayerCameraManager->CameraCachePrivate;
    }
    
    // Process actors
    ProcessActorLoop(context, screenWidth, screenHeight);
    
    return TRUE;
}

/* Cleanup actor loop */
VOID CleanupActorLoop(PActorLoopContext context)
{
    if (!context) return;
    
    context->World = nullptr;
    context->Level = nullptr;
    context->LocalController = nullptr;
    context->LocalCharacter = nullptr;
    context->ActorArray = {};
    context->ActorCount = 0;
}

/* Example usage function */
VOID ExampleActorLoopUsage()
{
    ActorLoopContext context = {};
    
    // Initialize
    if (!InitializeActorLoop(&context)) {
        // Failed to initialize - maybe not in game
        return;
    }
    
    // Main loop (this would be called from your main thread)
    float screenWidth = 1920.0f;  // Get from game window
    float screenHeight = 1080.0f;
    
    for (int32_t iteration = 0; iteration < 1000; iteration++) {
        // Update actor loop
        if (!UpdateActorLoop(&context, screenWidth, screenHeight)) {
            // Failed to update - reinitialize
            if (!InitializeActorLoop(&context)) {
                break; // Exit if can't reinitialize
            }
        }
        
        // Your ESP/aimbot logic would go here
        // For now, just process actors
        ProcessActorLoop(&context, screenWidth, screenHeight);
        
        // Sleep to prevent CPU overload
        LARGE_INTEGER interval;
        interval.QuadPart = -10000; // 1ms
        KeDelayExecutionThread(FALSE, &interval);
    }
    
    // Cleanup
    CleanupActorLoop(&context);
}
