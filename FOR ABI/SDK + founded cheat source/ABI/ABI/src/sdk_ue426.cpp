#include "sdk_ue426.h"
#include "offsets_ue426.h"
#include "world_to_screen_ue426.h"
#include "safe_memory_ue426.h"

/* ── UE 4.26.1 Actor Loop for Arena Breakout Infinite ───────────── */

/*
 * Clean C++ loop to iterate through AActor array in ULevel
 * Filters for players and extracts coordinates and health
 */

/* Player information structure */
typedef struct UEPlayer {
    PACharacter Character;
    PAPlayerController Controller;
    PUSceneComponent RootComponent;
    PVOID PlayerState;
    FVector Location;
    FVector2D ScreenPosition;
    float Distance;
    float Health;
    float MaxHealth;
    BOOLEAN IsLocalPlayer;
    BOOLEAN IsValid;
    BOOLEAN IsTeammate;
    
    UEPlayer() : Character(nullptr), Controller(nullptr), RootComponent(nullptr),
                  PlayerState(nullptr), Location{}, ScreenPosition{},
                  Distance(0.0f), Health(0.0f), MaxHealth(100.0f),
                  IsLocalPlayer(FALSE), IsValid(FALSE), IsTeammate(FALSE) {}
} UEPlayer, *PUEPlayer;

/* Actor loop context */
typedef struct ActorLoopContext {
    PUWorld World;
    PULevel Level;
    PAPlayerController LocalController;
    PACharacter LocalCharacter;
    TArray ActorArray;
    int32_t ActorCount;
    float ScreenWidth;
    float ScreenHeight;
    
    ActorLoopContext() : World(nullptr), Level(nullptr), LocalController(nullptr),
                        LocalCharacter(nullptr), ActorArray{}, ActorCount(0),
                        ScreenWidth(1920.0f), ScreenHeight(1080.0f) {}
} ActorLoopContext, *PActorLoopContext;

/* Initialize actor loop context */
BOOLEAN InitializeActorLoop(PActorLoopContext context)
{
    if (!context) return FALSE;
    
    // Get GWorld from global offset
    PUWorld gWorld = (PUWorld)(abi_offsets::global::GWorld);
    if (!gWorld) {
        DbgPrint("[!] Failed to get GWorld\\n");
        return FALSE;
    }
    
    context->World = gWorld;
    
    // Get persistent level
    context->Level = gWorld->PersistentLevel;
    if (!context->Level) {
        DbgPrint("[!] Failed to get PersistentLevel\\n");
        return FALSE;
    }
    
    // Get actor array
    context->ActorArray = context->Level->Actors;
    context->ActorCount = context->Level->ActorCount;
    
    // Find local player controller
    PUGameInstance gameInstance = gWorld->OwningGameInstance;
    if (!gameInstance) {
        DbgPrint("[!] Failed to get GameInstance\\n");
        return FALSE;
    }
    
    context->LocalController = gameInstance->GetLocalPlayerController();
    if (!context->LocalController) {
        DbgPrint("[!] Failed to get LocalPlayerController\\n");
        return FALSE;
    }
    
    // Get local character
    context->LocalCharacter = (PACharacter)context->LocalController->AcknowledgedPawn;
    if (!context->LocalCharacter) {
        DbgPrint("[!] Local player not in game\\n");
        return FALSE;
    }
    
    DbgPrint("[+] Actor loop initialized successfully\\n");
    return TRUE;
}

/* Validate actor is a player character */
BOOLEAN IsValidPlayerCharacter(PAActor actor, PUEPlayer playerInfo)
{
    if (!actor || !playerInfo) return FALSE;
    
    __try {
        // Check if actor is a character
        PVOID actorClass = actor->Class;
        if (!actorClass) return FALSE;
        
        // Get actor name (simplified - in real implementation would use GNames)
        // For ABI, we'd check for specific character class names
        // This is a placeholder for actual name checking logic
        
        // Check if character has required components
        playerInfo->Character = (PACharacter)actor;
        playerInfo->RootComponent = actor->RootComponent;
        playerInfo->PlayerState = ((PACharacter)actor)->PlayerState;
        
        if (!playerInfo->RootComponent) {
            return FALSE;
        }
        
        // Get location
        playerInfo->Location = playerInfo->RootComponent->GetWorldLocation();
        
        // Get health
        if (playerInfo->Character) {
            playerInfo->Health = playerInfo->Character->GetHealth();
            playerInfo->MaxHealth = playerInfo->Character->GetMaxHealth();
        }
        
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
                      PACharacter localCharacter, PAPlayerController localController)
{
    if (!playerInfo || !actor) return;
    
    // Check if this is local player
    playerInfo->IsLocalPlayer = (actor == (PAActor)localCharacter);
    
    // Calculate distance from local player
    if (!playerInfo->IsLocalPlayer && localCharacter && localCharacter->RootComponent) {
        FVector localLocation = localCharacter->RootComponent->GetWorldLocation();
        playerInfo->Distance = playerInfo->Location.Distance(localLocation);
    }
    
    // Convert to screen coordinates
    if (!playerInfo->IsLocalPlayer && localController) {
        WorldToScreenEx(localController, playerInfo->Location, 
                      &playerInfo->ScreenPosition, 
                      1920.0f, 1080.0f, 
                      &playerInfo->Distance);
    }
    
    // Check team (simplified - would use game-specific team logic)
    playerInfo->IsTeammate = FALSE; // Placeholder
}

/* Main actor loop function */
VOID ProcessActorLoop(PActorLoopContext context)
{
    if (!context || !context->Level) return;
    
    // Clear previous actor list (in real implementation, would maintain dynamic array)
    static UEPlayer players[64];
    int32_t playerCount = 0;
    
    DbgPrint("[+] Processing %d actors\\n", context->ActorCount);
    
    // Iterate through actors
    for (int32_t i = 0; i < context->ActorCount && playerCount < 64; i++) {
        PAActor actor = (PAActor)context->ActorArray.Get(i);
        if (!actor) continue;
        
        UEPlayer playerInfo = {};
        
        // Check if actor is a valid player character
        if (IsValidPlayerCharacter(actor, &playerInfo)) {
            UpdatePlayerInfo(&playerInfo, actor, 
                           context->LocalCharacter, 
                           context->LocalController);
            
            // Add to player list (skip local player for ESP)
            if (!playerInfo.IsLocalPlayer && playerInfo.IsValid) {
                players[playerCount++] = playerInfo;
                
                DbgPrint("[+] Found player: Health=%.1f, Distance=%.1f\\n", 
                        playerInfo.Health, playerInfo.Distance);
            }
        }
    }
    
    // Now you can process the players array for ESP, aimbot, etc.
    // Example: Render ESP for all valid players
    for (int32_t i = 0; i < playerCount; i++) {
        UEPlayer* player = &players[i];
        
        if (player->IsValid && IsOnScreen(player->ScreenPosition, 1920.0f, 1080.0f)) {
            // ESP rendering would go here
            // Example: DrawBox(player->ScreenPosition, player->Distance);
            // Example: DrawHealthBar(player->ScreenPosition, player->Health, player->MaxHealth);
            // Example: DrawName(player->ScreenPosition, player->PlayerState->PlayerName);
            
            // Bone ESP example
            if (player->Character) {
                FVector2D headPos, pelvisPos;
                
                if (BoneToScreen(context->LocalController, player->Character, 
                              abi_offsets::bones::BONE_HEAD, &headPos, 1920.0f, 1080.0f) &&
                    BoneToScreen(context->LocalController, player->Character, 
                              abi_offsets::bones::BONE_PELVIS, &pelvisPos, 1920.0f, 1080.0f)) {
                    
                    // Draw skeleton line from pelvis to head
                    // DrawLine(pelvisPos, headPos, ESP_COLOR_WHITE);
                }
            }
        }
    }
    
    DbgPrint("[+] Processed %d valid players\\n", playerCount);
}

/* Update actor loop (call this regularly) */
BOOLEAN UpdateActorLoop(PActorLoopContext context)
{
    if (!context) return FALSE;
    
    // Re-initialize if world changed
    PUWorld currentWorld = (PUWorld)(abi_offsets::global::GWorld);
    if (currentWorld != context->World) {
        if (!InitializeActorLoop(context)) {
            return FALSE;
        }
    }
    
    // Update screen dimensions (would get from game window)
    context->ScreenWidth = 1920.0f;
    context->ScreenHeight = 1080.0f;
    
    // Process actors
    ProcessActorLoop(context);
    
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
        DbgPrint("[!] Failed to initialize actor loop\\n");
        return;
    }
    
    DbgPrint("[+] Starting actor loop for ABI\\n");
    
    // Main loop (this would be called from your main thread)
    for (int32_t iteration = 0; iteration < 1000; iteration++) {
        // Update actor loop
        if (!UpdateActorLoop(&context)) {
            DbgPrint("[!] Failed to update actor loop, reinitializing\\n");
            if (!InitializeActorLoop(&context)) {
                break; // Exit if can't reinitialize
            }
        }
        
        // Your ESP/aimbot logic would go here
        // For now, just process actors
        
        // Sleep to prevent CPU overload
        LARGE_INTEGER interval;
        interval.QuadPart = -10000; // 1ms
        KeDelayExecutionThread(FALSE, &interval);
    }
    
    // Cleanup
    CleanupActorLoop(&context);
    DbgPrint("[+] Actor loop completed\\n");
}
