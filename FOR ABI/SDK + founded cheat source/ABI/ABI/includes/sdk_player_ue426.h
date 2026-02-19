#pragma once

/* ── SDK::Player Class for Arena Breakout Infinite (UE 4.26.1) ───── */

/*
 * Refactored Entity class: APawn -> USkeletalMeshComponent
 * No legacy BasePlayer references
 * Target: ArenaBreakout.exe
 */

#include "bones_ue426.h"
#include "memory_reader_ue426.h"
#include "offsets_ue426.h"

typedef struct FVector {
    float X, Y, Z;
    
    FVector() : X(0), Y(0), Z(0) {}
    FVector(float x, float y, float z) : X(x), Y(y), Z(z) {}
    
    float Distance(const FVector& other) const {
        float dx = X - other.X;
        float dy = Y - other.Y;
        float dz = Z - other.Z;
        return sqrtf(dx*dx + dy*dy + dz*dz);
    }
} FVector, *PFVector;

typedef struct FRotator {
    float Pitch, Yaw, Roll;
    
    FRotator() : Pitch(0), Yaw(0), Roll(0) {}
    FRotator(float pitch, float yaw, float roll) : Pitch(pitch), Yaw(yaw), Roll(roll) {}
} FRotator, *PFRotator;

typedef struct FVector2D {
    float X, Y;
    
    FVector2D() : X(0), Y(0) {}
    FVector2D(float x, float y) : X(x), Y(y) {}
} FVector2D, *PFVector2D;

/* TArray structure */
typedef struct TArray {
    PVOID Data;
    int32_t Count;
    int32_t Max;
    
    PVOID Get(int index) {
        if (index < 0 || index >= Count) return nullptr;
        return (PVOID)((PUCHAR)Data + (index * sizeof(PVOID)));
    }
} TArray, *PTArray;

/* SDK namespace for clean implementation */
namespace SDK {
    
    /* Player class - replaces legacy BasePlayer */
    class Player {
    private:
        PVOID Pawn;
        PVOID SkeletalMeshComponent;
        PVOID RootComponent;
        PVOID PlayerState;
        PVOID HealthComponent;
        
        FVector Location;
        FVector2D ScreenPosition;
        float Distance;
        float Health;
        float MaxHealth;
        BOOLEAN IsValid;
        BOOLEAN IsLocalPlayer;
        BOOLEAN IsTeammate;
        
        BoneManager BoneMgr;
        
    public:
        Player() : Pawn(nullptr), SkeletalMeshComponent(nullptr), RootComponent(nullptr),
                   PlayerState(nullptr), HealthComponent(nullptr), Location{}, 
                   ScreenPosition{}, Distance(0.0f), Health(0.0f), MaxHealth(100.0f),
                   IsValid(FALSE), IsLocalPlayer(FALSE), IsTeammate(FALSE) {}
        
        /* Initialize player from APawn */
        BOOLEAN Initialize(PVOID pawn, PVOID localPawn) {
            if (!pawn) return FALSE;
            
            Pawn = pawn;
            IsLocalPlayer = (pawn == localPawn);
            
            // Read RootComponent offset (0x168)
            uintptr_t rootOffset = (uintptr_t)pawn + abi_offsets::aactor::RootComponent;
            if (!ReadGlobalMemory(rootOffset, &RootComponent)) {
                return FALSE;
            }
            
            // Read SkeletalMeshComponent offset (0x380)
            uintptr_t meshOffset = (uintptr_t)pawn + abi_offsets::acharacter::Mesh;
            if (!ReadGlobalMemory(meshOffset, &SkeletalMeshComponent)) {
                SkeletalMeshComponent = nullptr;
            }
            
            // Read PlayerState offset (0x340)
            uintptr_t stateOffset = (uintptr_t)pawn + abi_offsets::apawn::PlayerState;
            if (!ReadGlobalMemory(stateOffset, &PlayerState)) {
                PlayerState = nullptr;
            }
            
            // Get location from RootComponent
            if (RootComponent) {
                uintptr_t locationOffset = (uintptr_t)RootComponent + abi_offsets::uscenecomponent::RelativeLocation;
                if (!ReadGlobalMemory(locationOffset, &Location)) {
                    return FALSE;
                }
            }
            
            // Initialize bone manager if skeletal mesh exists
            if (SkeletalMeshComponent) {
                BoneMgr.Initialize(SkeletalMeshComponent);
            }
            
            // Read health (game-specific implementation)
            Health = 100.0f; // Placeholder - would read from actual health component
            MaxHealth = 100.0f;
            
            IsValid = TRUE;
            return TRUE;
        }
        
        /* Update player information */
        VOID Update(PVOID localPawn, PVOID localController) {
            if (!IsValid) return;
            
            // Calculate distance from local player
            if (!IsLocalPlayer && localPawn) {
                PVOID localRoot = nullptr;
                uintptr_t localRootOffset = (uintptr_t)localPawn + abi_offsets::aactor::RootComponent;
                
                if (ReadGlobalMemory(localRootOffset, &localRoot)) {
                    FVector localLocation;
                    uintptr_t localLocationOffset = (uintptr_t)localRoot + abi_offsets::uscenecomponent::RelativeLocation;
                    
                    if (ReadGlobalMemory(localLocationOffset, &localLocation)) {
                        Distance = Location.Distance(localLocation);
                    }
                }
            }
            
            // Convert to screen coordinates
            if (!IsLocalPlayer && localController) {
                // WorldToScreen would be called here
                // For now, set placeholder screen position
                ScreenPosition = FVector2D(960.0f, 540.0f);
            }
            
            // Update team status (game-specific)
            IsTeammate = FALSE; // Placeholder
        }
        
        /* Get bone position by ID */
        BOOLEAN GetBonePosition(int32_t boneId, FVector& outPosition) {
            if (!IsValid || !BoneMgr.SkeletalMeshComponent) {
                return FALSE;
            }
            
            return BoneMgr.GetBonePosition((BoneID)boneId, outPosition);
        }
        
        /* Get bone with rotation */
        BOOLEAN GetBoneWithRotation(int32_t boneId, FVector& outPosition, FRotator& outRotation) {
            if (!IsValid || !BoneMgr.SkeletalMeshComponent) {
                return FALSE;
            }
            
            return BoneMgr.GetBoneWithRotation((BoneID)boneId, outPosition, outRotation);
        }
        
        /* Get head bone position (ID 16) */
        BOOLEAN GetHeadPosition(FVector& outPosition) {
            return GetBonePosition(16, outPosition); // Head = 16
        }
        
        /* Get neck bone position (ID 15) */
        BOOLEAN GetNeckPosition(FVector& outPosition) {
            return GetBonePosition(15, outPosition); // Neck = 15
        }
        
        /* Get pelvis bone position (ID 1) */
        BOOLEAN GetPelvisPosition(FVector& outPosition) {
            return GetBonePosition(1, outPosition); // Pelvis = 1
        }
        
        /* Get all skeleton bones for ESP */
        BOOLEAN GetSkeletonBones(BoneInfo bones[], int32_t maxBones) {
            if (!IsValid || !BoneMgr.SkeletalMeshComponent) {
                return FALSE;
            }
            
            return BoneMgr.GetSkeletonBones(bones, maxBones);
        }
        
        /* Getters */
        BOOLEAN GetIsValid() const { return IsValid; }
        BOOLEAN GetIsLocalPlayer() const { return IsLocalPlayer; }
        BOOLEAN GetIsTeammate() const { return IsTeammate; }
        FVector GetLocation() const { return Location; }
        FVector2D GetScreenPosition() const { return ScreenPosition; }
        float GetDistance() const { return Distance; }
        float GetHealth() const { return Health; }
        float GetMaxHealth() const { return MaxHealth; }
        float GetHealthPercent() const { return MaxHealth > 0 ? Health / MaxHealth : 0.0f; }
        PVOID GetPawn() const { return Pawn; }
        PVOID GetSkeletalMeshComponent() const { return SkeletalMeshComponent; }
        
        /* Setters */
        VOID SetScreenPosition(const FVector2D& pos) { ScreenPosition = pos; }
        VOID SetHealth(float health) { Health = health; }
        VOID SetMaxHealth(float maxHealth) { MaxHealth = maxHealth; }
        VOID SetIsTeammate(BOOL isTeammate) { IsTeammate = isTeammate; }
    };
    
    /* Player manager class */
    class PlayerManager {
    private:
        static const int MAX_PLAYERS = 64;
        Player Players[MAX_PLAYERS];
        int32_t PlayerCount;
        
    public:
        PlayerManager() : PlayerCount(0) {}
        
        /* Add player to manager */
        BOOLEAN AddPlayer(PVOID pawn, PVOID localPawn, PVOID localController) {
            if (PlayerCount >= MAX_PLAYERS) return FALSE;
            
            if (Players[PlayerCount].Initialize(pawn, localPawn)) {
                Players[PlayerCount].Update(localPawn, localController);
                PlayerCount++;
                return TRUE;
            }
            
            return FALSE;
        }
        
        /* Clear all players */
        VOID ClearPlayers() {
            PlayerCount = 0;
            for (int32_t i = 0; i < MAX_PLAYERS; i++) {
                Players[i] = Player();
            }
        }
        
        /* Get player by index */
        Player* GetPlayer(int32_t index) {
            if (index < 0 || index >= PlayerCount) return nullptr;
            return &Players[index];
        }
        
        /* Get player count */
        int32_t GetPlayerCount() const { return PlayerCount; }
        
        /* Get valid players (excluding local player) */
        int32_t GetValidPlayers(Player* validPlayers[], int32_t maxPlayers) {
            int32_t count = 0;
            
            for (int32_t i = 0; i < PlayerCount && count < maxPlayers; i++) {
                if (Players[i].GetIsValid() && !Players[i].GetIsLocalPlayer()) {
                    validPlayers[count] = Players[i];
                    count++;
                }
            }
            
            return count;
        }
        
        /* Get enemy players only */
        int32_t GetEnemyPlayers(Player* enemyPlayers[], int32_t maxPlayers) {
            int32_t count = 0;
            
            for (int32_t i = 0; i < PlayerCount && count < maxPlayers; i++) {
                if (Players[i].GetIsValid() && !Players[i].GetIsLocalPlayer() && !Players[i].GetIsTeammate()) {
                    enemyPlayers[count] = Players[i];
                    count++;
                }
            }
            
            return count;
        }
        
        /* Get teammate players only */
        int32_t GetTeammatePlayers(Player* teammatePlayers[], int32_t maxPlayers) {
            int32_t count = 0;
            
            for (int32_t i = 0; i < PlayerCount && count < maxPlayers; i++) {
                if (Players[i].GetIsValid() && !Players[i].GetIsLocalPlayer() && Players[i].GetIsTeammate()) {
                    teammatePlayers[count] = Players[i];
                    count++;
                }
            }
            
            return count;
        }
    };
}

/* Global player manager instance */
extern SDK::PlayerManager g_PlayerManager;
