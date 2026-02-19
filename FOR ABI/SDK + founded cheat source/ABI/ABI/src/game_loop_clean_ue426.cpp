#include "bones_ue426.h"
#include "memory_reader_ue426.h"
#include "offsets_ue426.h"
#include "world_to_screen_ue426.h"

/* ── Clean UE 4.26.1 Game Loop for Arena Breakout Infinite ───── */

/*
 * New game loop using GWorld -> PersistentLevel -> AActors
 * Offset: 0x9914A28
 * No legacy Unity/Rust/EAC dependencies
 */

typedef struct UEPlayer {
    PVOID Character;
    PVOID Controller;
    PVOID RootComponent;
    PVOID PlayerState;
    FVector Location;
    FVector2D ScreenPosition;
    float Distance;
    float Health;
    float MaxHealth;
    BOOLEAN IsLocalPlayer;
    BOOLEAN IsValid;
    BOOLEAN IsTeammate;
    BoneManager BoneMgr;
    
    UEPlayer() : Character(nullptr), Controller(nullptr), RootComponent(nullptr),
                  PlayerState(nullptr), Location{}, ScreenPosition{},
                  Distance(0.0f), Health(0.0f), MaxHealth(100.0f),
                  IsLocalPlayer(FALSE), IsValid(FALSE), IsTeammate(FALSE) {}
} UEPlayer, *PUEPlayer;

/* Game loop context */
typedef struct GameLoopContext {
    PVOID World;
    PVOID PersistentLevel;
    PVOID LocalController;
    PVOID LocalCharacter;
    TArray ActorArray;
    int32_t ActorCount;
    float ScreenWidth;
    float ScreenHeight;
    BOOLEAN IsInitialized;
    
    GameLoopContext() : World(nullptr), PersistentLevel(nullptr), LocalController(nullptr),
                        LocalCharacter(nullptr), ActorArray{}, ActorCount(0),
                        ScreenWidth(1920.0f), ScreenHeight(1080.0f),
                        IsInitialized(FALSE) {}
} GameLoopContext, *PGameLoopContext;

/* Global game loop context */
static GameLoopContext g_GameContext = {};

/* Get GWorld using offset 0x9914A28 */
PVOID GetGWorld()
{
    // Read GWorld from global offset
    PVOID gWorld = nullptr;
    uintptr_t gWorldPtr = abi_offsets::global::GWorld;
    
    if (ReadGlobalMemory(gWorldPtr, &gWorld)) {
        return gWorld;
    }
    
    return nullptr;
}

/* Get persistent level from world */
PVOID GetPersistentLevel(PVOID world)
{
    if (!world) return nullptr;
    
    // Read PersistentLevel offset (0x30)
    PVOID persistentLevel = nullptr;
    uintptr_t levelOffset = (uintptr_t)world + abi_offsets::uworld::PersistentLevel;
    
    if (ReadGlobalMemory(levelOffset, &persistentLevel)) {
        return persistentLevel;
    }
    
    return nullptr;
}

/* Get actor array from level */
BOOLEAN GetActorArray(PVOID level, TArray* actorArray)
{
    if (!level || !actorArray) return FALSE;
    
    // Read Actors array offset (0x98)
    uintptr_t actorsOffset = (uintptr_t)level + abi_offsets::ulevel::Actors;
    
    if (ReadGlobalMemory(actorsOffset, actorArray)) {
        // Read actor count
        uintptr_t countOffset = (uintptr_t)level + abi_offsets::ulevel::ActorCount;
        return ReadGlobalMemory(countOffset, &actorArray->Count);
    }
    
    return FALSE;
}

/* Get local player controller */
PVOID GetLocalPlayerController()
{
    PVOID world = GetGWorld();
    if (!world) return nullptr;
    
    // Read GameInstance offset (0x180)
    PVOID gameInstance = nullptr;
    uintptr_t instanceOffset = (uintptr_t)world + abi_offsets::uworld::OwningGameInstance;
    
    if (!ReadGlobalMemory(instanceOffset, &gameInstance)) {
        return nullptr;
    }
    
    // Read LocalPlayers array offset (0x38)
    TArray localPlayers;
    uintptr_t playersOffset = (uintptr_t)gameInstance + abi_offsets::ugameinstance::LocalPlayers;
    
    if (!ReadGlobalMemory(playersOffset, &localPlayers)) {
        return nullptr;
    }
    
    if (localPlayers.Count <= 0) {
        return nullptr;
    }
    
    // Get first local player
    PVOID localPlayer = localPlayers.Get(0);
    if (!localPlayer) return nullptr;
    
    // Read PlayerController offset (0x30)
    PVOID playerController = nullptr;
    uintptr_t controllerOffset = (uintptr_t)localPlayer + abi_offsets::ulocalplayer::PlayerController;
    
    return ReadGlobalMemory(controllerOffset, &playerController) ? playerController : nullptr;
}

/* Validate actor is a player character */
BOOLEAN IsValidPlayerCharacter(PVOID actor, PUEPlayer playerInfo)
{
    if (!actor || !playerInfo) return FALSE;
    
    __try {
        // Read RootComponent offset (0x168)
        PVOID rootComponent = nullptr;
        uintptr_t rootOffset = (uintptr_t)actor + abi_offsets::aactor::RootComponent;
        
        if (!ReadGlobalMemory(rootOffset, &rootComponent)) {
            return FALSE;
        }
        
        // Read component location
        FVector location;
        uintptr_t locationOffset = (uintptr_t)rootComponent + abi_offsets::uscenecomponent::RelativeLocation;
        
        if (!ReadGlobalMemory(locationOffset, &location)) {
            return FALSE;
        }
        
        // Check if actor has skeletal mesh component (character)
        PVOID skeletalMesh = nullptr;
        uintptr_t meshOffset = (uintptr_t)actor + abi_offsets::acharacter::Mesh;
        
        if (!ReadGlobalMemory(meshOffset, &skeletalMesh)) {
            // Not a character, but could still be a valid actor
            skeletalMesh = nullptr;
        }
        
        // Fill player info
        playerInfo->Character = actor;
        playerInfo->RootComponent = rootComponent;
        playerInfo->Location = location;
        
        // Initialize bone manager if character has skeletal mesh
        if (skeletalMesh) {
            playerInfo->BoneMgr.Initialize(skeletalMesh);
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
VOID UpdatePlayerInfo(PUEPlayer playerInfo, PVOID actor, PVOID localCharacter, PVOID localController)
{
    if (!playerInfo || !actor) return;
    
    // Check if this is local player
    playerInfo->IsLocalPlayer = (actor == localCharacter);
    
    // Calculate distance from local player
    if (!playerInfo->IsLocalPlayer && localCharacter) {
        // Get local player location
        PVOID localRoot = nullptr;
        uintptr_t localRootOffset = (uintptr_t)localCharacter + abi_offsets::aactor::RootComponent;
        
        if (ReadGlobalMemory(localRootOffset, &localRoot)) {
            FVector localLocation;
            uintptr_t localLocationOffset = (uintptr_t)localRoot + abi_offsets::uscenecomponent::RelativeLocation;
            
            if (ReadGlobalMemory(localLocationOffset, &localLocation)) {
                playerInfo->Distance = playerInfo->Location.Distance(localLocation);
            }
        }
    }
    
    // Convert to screen coordinates
    if (!playerInfo->IsLocalPlayer && localController) {
        // Get camera info from local controller
        FVector cameraLocation;
        FRotator cameraRotation;
        float fov = 90.0f;
        
        // Read camera information (simplified)
        PVOID cameraManager = nullptr;
        uintptr_t cameraOffset = (uintptr_t)localController + abi_offsets::aplayercontroller::PlayerCameraManager;
        
        if (ReadGlobalMemory(cameraOffset, &cameraManager) && cameraManager) {
            uintptr_t viewOffset = (uintptr_t)cameraManager + abi_offsets::aplayercameramanager::CameraCachePrivate;
            
            // Read view info
            struct {
                FVector Location;
                FRotator Rotation;
                float FOV;
            } viewInfo;
            
            if (ReadGlobalMemory(viewOffset, &viewInfo)) {
                cameraLocation = viewInfo.Location;
                cameraRotation = viewInfo.Rotation;
                fov = viewInfo.FOV;
            }
        }
        
        // Convert to screen
        WorldToScreen(localController, playerInfo->Location, 
                    &playerInfo->ScreenPosition, 
                    1920.0f, 1080.0f);
    }
    
    // Get health (simplified - would use game-specific health component)
    playerInfo->Health = 100.0f; // Placeholder
    playerInfo->MaxHealth = 100.0f;
    
    // Check team (simplified)
    playerInfo->IsTeammate = FALSE; // Placeholder
}

/* Main game loop function */
VOID ProcessGameLoop()
{
    if (!g_GameContext.IsInitialized) {
        DbgPrint("[!] Game loop not initialized\\n");
        return;
    }
    
    // Clear previous player list
    static UEPlayer players[64];
    int32_t playerCount = 0;
    
    DbgPrint("[+] Processing %d actors\\n", g_GameContext.ActorCount);
    
    // Iterate through actors
    for (int32_t i = 0; i < g_GameContext.ActorCount && playerCount < 64; i++) {
        PVOID actor = g_GameContext.ActorArray.Get(i);
        if (!actor) continue;
        
        UEPlayer playerInfo = {};
        
        // Check if actor is a valid player character
        if (IsValidPlayerCharacter(actor, &playerInfo)) {
            UpdatePlayerInfo(&playerInfo, actor, 
                           g_GameContext.LocalCharacter, 
                           g_GameContext.LocalController);
            
            // Add to player list (skip local player for ESP)
            if (!playerInfo.IsLocalPlayer && playerInfo.IsValid) {
                players[playerCount++] = playerInfo;
                
                DbgPrint("[+] Found player: Distance=%.1f\\n", playerInfo.Distance);
            }
        }
    }
    
    // Process players for ESP/aimbot
    for (int32_t i = 0; i < playerCount; i++) {
        UEPlayer* player = &players[i];
        
        if (player->IsValid && IsOnScreen(player->ScreenPosition, 1920.0f, 1080.0f)) {
            // ESP rendering would go here
            
            // Bone ESP example
            if (player->BoneMgr.SkeletalMeshComponent) {
                // Get head bone (ID 16)
                FVector2D headScreen;
                FVector headPos;
                
                if (player->BoneMgr.GetBonePosition(BONE_HEAD, headPos)) {
                    if (WorldToScreen(g_GameContext.LocalController, headPos, 
                                    &headScreen, 1920.0f, 1080.0f)) {
                        // Draw head ESP
                        // DrawCircle(headScreen, 5.0f, ESP_COLOR_RED);
                    }
                }
                
                // Get pelvis bone (ID 1)
                FVector2D pelvisScreen;
                FVector pelvisPos;
                
                if (player->BoneMgr.GetBonePosition(BONE_PELVIS, pelvisPos)) {
                    if (WorldToScreen(g_GameContext.LocalController, pelvisPos, 
                                    &pelvisScreen, 1920.0f, 1080.0f)) {
                        // Draw pelvis ESP
                        // DrawCircle(pelvisScreen, 3.0f, ESP_COLOR_GREEN);
                        
                        // Draw skeleton line from pelvis to head
                        // DrawLine(pelvisScreen, headScreen, ESP_COLOR_WHITE);
                    }
                }
            }
            
            // Health bar example
            if (player->Health > 0 && player->MaxHealth > 0) {
                float healthPercent = player->Health / player->MaxHealth;
                // DrawHealthBar(player->ScreenPosition, healthPercent);
            }
        }
    }
    
    DbgPrint("[+] Processed %d valid players\\n", playerCount);
}

/* Initialize game loop */
BOOLEAN InitializeGameLoop()
{
    DbgPrint("[+] Initializing game loop for ABI\\n");
    
    // Get GWorld using offset 0x9914A28
    g_GameContext.World = GetGWorld();
    if (!g_GameContext.World) {
        DbgPrint("[!] Failed to get GWorld\\n");
        return FALSE;
    }
    
    // Get persistent level
    g_GameContext.PersistentLevel = GetPersistentLevel(g_GameContext.World);
    if (!g_GameContext.PersistentLevel) {
        DbgPrint("[!] Failed to get PersistentLevel\\n");
        return FALSE;
    }
    
    // Get actor array
    if (!GetActorArray(g_GameContext.PersistentLevel, &g_GameContext.ActorArray)) {
        DbgPrint("[!] Failed to get Actor array\\n");
        return FALSE;
    }
    
    g_GameContext.ActorCount = g_GameContext.ActorArray.Count;
    
    // Get local player controller
    g_GameContext.LocalController = GetLocalPlayerController();
    if (!g_GameContext.LocalController) {
        DbgPrint("[!] Failed to get LocalPlayerController\\n");
        return FALSE;
    }
    
    // Get local character
    uintptr_t pawnOffset = (uintptr_t)g_GameContext.LocalController + abi_offsets::aplayercontroller::AcknowledgedPawn;
    if (!ReadGlobalMemory(pawnOffset, &g_GameContext.LocalCharacter)) {
        DbgPrint("[!] Local player not in game\\n");
        return FALSE;
    }
    
    g_GameContext.IsInitialized = TRUE;
    DbgPrint("[+] Game loop initialized successfully\\n");
    return TRUE;
}

/* Update game loop (call this regularly) */
BOOLEAN UpdateGameLoop()
{
    if (!g_GameContext.IsInitialized) {
        return InitializeGameLoop();
    }
    
    // Re-initialize if world changed
    PVOID currentWorld = GetGWorld();
    if (currentWorld != g_GameContext.World) {
        g_GameContext.IsInitialized = FALSE;
        return InitializeGameLoop();
    }
    
    // Update screen dimensions (would get from game window)
    g_GameContext.ScreenWidth = 1920.0f;
    g_GameContext.ScreenHeight = 1080.0f;
    
    // Process game loop
    ProcessGameLoop();
    
    return TRUE;
}

/* Cleanup game loop */
VOID CleanupGameLoop()
{
    g_GameContext.World = nullptr;
    g_GameContext.PersistentLevel = nullptr;
    g_GameContext.LocalController = nullptr;
    g_GameContext.LocalCharacter = nullptr;
    g_GameContext.ActorArray = {};
    g_GameContext.ActorCount = 0;
    g_GameContext.IsInitialized = FALSE;
    
    DbgPrint("[+] Game loop cleaned up\\n");
}

/* Main game loop function */
VOID MainGameLoop()
{
    DbgPrint("[+] Starting main game loop for ABI\\n");
    
    // Initialize global memory reader
    if (!InitializeGlobalMemoryReader((HANDLE)GetCurrentProcessId())) {
        DbgPrint("[!] Failed to initialize memory reader\\n");
        return;
    }
    
    // Initialize game loop
    if (!InitializeGameLoop()) {
        DbgPrint("[!] Failed to initialize game loop\\n");
        CleanupGlobalMemoryReader();
        return;
    }
    
    // Main loop
    for (int32_t iteration = 0; iteration < 10000; iteration++) {
        // Update game loop
        if (!UpdateGameLoop()) {
            DbgPrint("[!] Game loop update failed\\n");
        }
        
        // Sleep to prevent CPU overload
        LARGE_INTEGER interval;
        interval.QuadPart = -10000; // 1ms
        KeDelayExecutionThread(FALSE, &interval);
    }
    
    // Cleanup
    CleanupGameLoop();
    CleanupGlobalMemoryReader();
    
    DbgPrint("[+] Main game loop completed\\n");
}
