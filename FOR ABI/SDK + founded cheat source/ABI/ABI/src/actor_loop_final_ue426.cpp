#include "sdk_player_ue426.h"
#include "memory_reader_ue426.h"
#include "offsets_ue426.h"
#include "world_to_screen_ue426.h"

/* ── New ActorLoop using GWorld (0x9914A28) ───────────────── */

/*
 * Clean UE 4.26.1 implementation
 * No legacy Unity/Rust/EAC references
 * Target: ArenaBreakout.exe
 */

/* Global player manager */
SDK::PlayerManager g_PlayerManager;

/* Get GWorld using offset 0x9914A28 */
PVOID GetGWorld()
{
    PVOID gWorld = nullptr;
    uintptr_t gWorldPtr = abi_offsets::global::GWorld; // 0x9914A28
    
    if (ReadGlobalMemory(gWorldPtr, &gWorld)) {
        DbgPrint("[+] GWorld found at 0x%llX\\n", gWorld);
        return gWorld;
    }
    
    DbgPrint("[!] Failed to read GWorld at offset 0x%llX\\n", gWorldPtr);
    return nullptr;
}

/* Get persistent level from world */
PVOID GetPersistentLevel(PVOID world)
{
    if (!world) return nullptr;
    
    PVOID persistentLevel = nullptr;
    uintptr_t levelOffset = (uintptr_t)world + abi_offsets::uworld::PersistentLevel;
    
    if (ReadGlobalMemory(levelOffset, &persistentLevel)) {
        DbgPrint("[+] PersistentLevel found at 0x%llX\\n", persistentLevel);
        return persistentLevel;
    }
    
    return nullptr;
}

/* Get actor array from level */
BOOLEAN GetActorArray(PVOID level, TArray* actorArray)
{
    if (!level || !actorArray) return FALSE;
    
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
    
    PVOID gameInstance = nullptr;
    uintptr_t instanceOffset = (uintptr_t)world + abi_offsets::uworld::OwningGameInstance;
    
    if (!ReadGlobalMemory(instanceOffset, &gameInstance)) {
        return nullptr;
    }
    
    TArray localPlayers;
    uintptr_t playersOffset = (uintptr_t)gameInstance + abi_offsets::ugameinstance::LocalPlayers;
    
    if (!ReadGlobalMemory(playersOffset, &localPlayers)) {
        return nullptr;
    }
    
    if (localPlayers.Count <= 0) {
        return nullptr;
    }
    
    PVOID localPlayer = localPlayers.Get(0);
    if (!localPlayer) {
        return nullptr;
    }
    
    PVOID playerController = nullptr;
    uintptr_t controllerOffset = (uintptr_t)localPlayer + abi_offsets::ulocalplayer::PlayerController;
    
    return ReadGlobalMemory(controllerOffset, &playerController) ? playerController : nullptr;
}

/* Get local player pawn */
PVOID GetLocalPlayerPawn()
{
    PVOID controller = GetLocalPlayerController();
    if (!controller) return nullptr;
    
    PVOID pawn = nullptr;
    uintptr_t pawnOffset = (uintptr_t)controller + abi_offsets::aplayercontroller::AcknowledgedPawn;
    
    return ReadGlobalMemory(pawnOffset, &pawn) ? pawn : nullptr;
}

/* Validate actor is a player character */
BOOLEAN IsValidPlayerCharacter(PVOID actor, SDK::Player* player)
{
    if (!actor || !player) return FALSE;
    
    __try {
        // Check if actor has required components
        PVOID rootComponent = nullptr;
        uintptr_t rootOffset = (uintptr_t)actor + abi_offsets::aactor::RootComponent;
        
        if (!ReadGlobalMemory(rootOffset, &rootComponent)) {
            return FALSE;
        }
        
        // Check if actor has skeletal mesh component (character)
        PVOID skeletalMesh = nullptr;
        uintptr_t meshOffset = (uintptr_t)actor + abi_offsets::acharacter::Mesh;
        
        if (!ReadGlobalMemory(meshOffset, &skeletalMesh)) {
            skeletalMesh = nullptr;
        }
        
        // Initialize player with APawn data
        if (!player->Initialize(actor, GetLocalPlayerPawn())) {
            return FALSE;
        }
        
        DbgPrint("[+] Valid player character found\\n");
        return TRUE;
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        player->SetIsValid(FALSE);
        return FALSE;
    }
}

/* Main actor loop function */
VOID ProcessActorLoop()
{
    DbgPrint("[+] Processing actor loop with GWorld (0x9914A28)\\n");
    
    // Get GWorld
    PVOID world = GetGWorld();
    if (!world) {
        DbgPrint("[!] Failed to get GWorld\\n");
        return;
    }
    
    // Get persistent level
    PVOID level = GetPersistentLevel(world);
    if (!level) {
        DbgPrint("[!] Failed to get PersistentLevel\\n");
        return;
    }
    
    // Get actor array
    TArray actorArray;
    if (!GetActorArray(level, &actorArray)) {
        DbgPrint("[!] Failed to get Actor array\\n");
        return;
    }
    
    DbgPrint("[+] Found %d actors in level\\n", actorArray.Count);
    
    // Clear previous players
    g_PlayerManager.ClearPlayers();
    
    // Get local player pawn
    PVOID localPawn = GetLocalPlayerPawn();
    PVOID localController = GetLocalPlayerController();
    
    // Iterate through actors
    int32_t validPlayers = 0;
    for (int32_t i = 0; i < actorArray.Count; i++) {
        PVOID actor = actorArray.Get(i);
        if (!actor) continue;
        
        SDK::Player player;
        
        // Check if actor is a valid player character
        if (IsValidPlayerCharacter(actor, &player)) {
            // Update player with local player info
            player.Update(localPawn, localController);
            
            // Add to player manager
            if (g_PlayerManager.AddPlayer(actor, localPawn, localController)) {
                validPlayers++;
                
                DbgPrint("[+] Player %d: Health=%.1f, Distance=%.1f\\n", 
                        validPlayers, player.GetHealth(), player.GetDistance());
            }
        }
    }
    
    DbgPrint("[+] Processed %d valid players\\n", validPlayers);
    
    // Now you can process players for ESP/aimbot
    SDK::Player enemyPlayers[64];
    int32_t enemyCount = g_PlayerManager.GetEnemyPlayers(enemyPlayers, 64);
    
    for (int32_t i = 0; i < enemyCount; i++) {
        SDK::Player* enemy = &enemyPlayers[i];
        
        if (enemy->GetIsValid() && IsOnScreen(enemy->GetScreenPosition(), 1920.0f, 1080.0f)) {
            // ESP rendering would go here
            
            // Bone ESP example using provided IDs
            FVector headPos, neckPos, pelvisPos;
            
            if (enemy->GetHeadPosition(headPos)) {
                FVector2D headScreen;
                if (WorldToScreen(localController, headPos, &headScreen, 1920.0f, 1080.0f)) {
                    // Draw head ESP
                    DbgPrint("[+] Head bone (ID 16) at screen: (%.1f, %.1f)\\n", 
                            headScreen.X, headScreen.Y);
                }
            }
            
            if (enemy->GetNeckPosition(neckPos)) {
                FVector2D neckScreen;
                if (WorldToScreen(localController, neckPos, &neckScreen, 1920.0f, 1080.0f)) {
                    DbgPrint("[+] Neck bone (ID 15) at screen: (%.1f, %.1f)\\n", 
                            neckScreen.X, neckScreen.Y);
                }
            }
            
            if (enemy->GetPelvisPosition(pelvisPos)) {
                FVector2D pelvisScreen;
                if (WorldToScreen(localController, pelvisPos, &pelvisScreen, 1920.0f, 1080.0f)) {
                    DbgPrint("[+] Pelvis bone (ID 1) at screen: (%.1f, %.1f)\\n", 
                            pelvisScreen.X, pelvisScreen.Y);
                }
            }
            
            // Draw skeleton lines
            if (enemy->GetHeadPosition(headPos) && enemy->GetPelvisPosition(pelvisPos)) {
                FVector2D headScreen, pelvisScreen;
                if (WorldToScreen(localController, headPos, &headScreen, 1920.0f, 1080.0f) &&
                    WorldToScreen(localController, pelvisPos, &pelvisScreen, 1920.0f, 1080.0f)) {
                    // Draw skeleton line from pelvis to head
                    DbgPrint("[+] Skeleton: pelvis->head line\\n");
                }
            }
            
            // Health bar
            DbgPrint("[+] Player health: %.1f/%.1f (%.1f%%)\\n", 
                    enemy->GetHealth(), enemy->GetMaxHealth(), enemy->GetHealthPercent() * 100.0f);
        }
    }
}

/* Initialize actor loop */
BOOLEAN InitializeActorLoop()
{
    DbgPrint("[+] Initializing actor loop for ABI\\n");
    
    // Initialize global memory reader
    if (!InitializeGlobalMemoryReader((HANDLE)GetCurrentProcessId())) {
        DbgPrint("[!] Failed to initialize memory reader\\n");
        return FALSE;
    }
    
    // Verify GWorld offset
    PVOID gWorld = GetGWorld();
    if (!gWorld) {
        DbgPrint("[!] GWorld check failed - offset 0x9914A28\\n");
        return FALSE;
    }
    
    DbgPrint("[+] Actor loop initialized successfully\\n");
    return TRUE;
}

/* Update actor loop (call this regularly) */
BOOLEAN UpdateActorLoop()
{
    // Re-initialize if world changed
    PVOID currentWorld = GetGWorld();
    if (!currentWorld) {
        return InitializeActorLoop();
    }
    
    // Process actors
    ProcessActorLoop();
    
    return TRUE;
}

/* Cleanup actor loop */
VOID CleanupActorLoop()
{
    g_PlayerManager.ClearPlayers();
    CleanupGlobalMemoryReader();
    
    DbgPrint("[+] Actor loop cleaned up\\n");
}

/* Main actor loop function */
VOID MainActorLoop()
{
    DbgPrint("[+] Starting main actor loop for ABI\\n");
    DbgPrint("[+] Using GWorld offset: 0x9914A28\\n");
    DbgPrint("[+] Using bone IDs: Head=16, Neck=15, Pelvis=1\\n");
    
    // Initialize
    if (!InitializeActorLoop()) {
        DbgPrint("[!] Failed to initialize actor loop\\n");
        return;
    }
    
    // Main loop
    for (int32_t iteration = 0; iteration < 10000; iteration++) {
        // Update actor loop
        if (!UpdateActorLoop()) {
            DbgPrint("[!] Actor loop update failed\\n");
        }
        
        // Sleep to prevent CPU overload
        LARGE_INTEGER interval;
        interval.QuadPart = -10000; // 1ms
        KeDelayExecutionThread(FALSE, &interval);
    }
    
    // Cleanup
    CleanupActorLoop();
    
    DbgPrint("[+] Main actor loop completed\\n");
}
