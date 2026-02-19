#pragma once

#include "offsets_ue426.h"
#include <cmath>

/* ── UE 4.26.1 SDK Structures for Arena Breakout Infinite ───────────── */

/* Basic UE4.26.1 types */
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
    
    FVector operator+(const FVector& other) const {
        return FVector(X + other.X, Y + other.Y, Z + other.Z);
    }
    
    FVector operator-(const FVector& other) const {
        return FVector(X - other.X, Y - other.Y, Z - other.Z);
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

typedef struct FQuat {
    float X, Y, Z, W;
    
    FQuat() : X(0), Y(0), Z(0), W(1) {}
    FQuat(float x, float y, float z, float w) : X(x), Y(y), Z(z), W(w) {}
} FQuat, *PFQuat;

/* FTransform for bone matrices */
typedef struct FTransform {
    FVector Translation;
    FQuat Rotation;
    FVector Scale3D;
    
    FTransform() : Translation(), Rotation(), Scale3D(1, 1, 1) {}
    
    /* Get 4x4 matrix from transform */
    void ToMatrix(float matrix[4][4]) const {
        // Convert quaternion to rotation matrix
        float xx = Rotation.X * Rotation.X;
        float yy = Rotation.Y * Rotation.Y;
        float zz = Rotation.Z * Rotation.Z;
        float xy = Rotation.X * Rotation.Y;
        float xz = Rotation.X * Rotation.Z;
        float yz = Rotation.Y * Rotation.Z;
        float wx = Rotation.W * Rotation.X;
        float wy = Rotation.W * Rotation.Y;
        float wz = Rotation.W * Rotation.Z;
        
        matrix[0][0] = 1 - 2 * (yy + zz);
        matrix[0][1] = 2 * (xy - wz);
        matrix[0][2] = 2 * (xz + wy);
        matrix[0][3] = 0;
        
        matrix[1][0] = 2 * (xy + wz);
        matrix[1][1] = 1 - 2 * (xx + zz);
        matrix[1][2] = 2 * (yz - wx);
        matrix[1][3] = 0;
        
        matrix[2][0] = 2 * (xz - wy);
        matrix[2][1] = 2 * (yz + wx);
        matrix[2][2] = 1 - 2 * (xx + yy);
        matrix[2][3] = 0;
        
        matrix[3][0] = Translation.X;
        matrix[3][1] = Translation.Y;
        matrix[3][2] = Translation.Z;
        matrix[3][3] = 1;
    }
} FTransform, *PFTransform;

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

/* FString structure */
typedef struct FString {
    PVOID Data;
    int32_t Count;
    int32_t Max;
    
    FString() : Data(nullptr), Count(0), Max(0) {}
} FString, *PFString;

/* UObject - Base class for all UE objects */
typedef struct UObject {
    PVOID VTable;
    int32_t ObjectFlags;
    int32_t InternalIndex;
    PVOID Class;
    PVOID Name;
    PVOID Outer;
} UObject, *PUObject;

/* UClass - Object class information */
typedef struct UClass {
    UObject Super;
    PVOID VTable;
} UClass, *PUClass;

/* USceneComponent - Scene component base */
typedef struct USceneComponent {
    UObject Base;
    FVector RelativeLocation;
    FRotator RelativeRotation;
    FVector RelativeScale3D;
    float ComponentToWorld[4][4];
    
    FVector GetWorldLocation() {
        // Apply component to world transformation
        FVector worldPos = RelativeLocation;
        // In a real implementation, this would use ComponentToWorld matrix
        return worldPos;
    }
} USceneComponent, *PUSceneComponent;

/* USkeletalMeshComponent - Skeletal mesh component */
typedef struct USkeletalMeshComponent {
    USceneComponent Base;
    PVOID SkeletalMesh;
    PVOID AnimInstance;
    TArray BoneArray;
    int32_t BoneCount;
    
    /* Get bone matrix by bone index */
    BOOLEAN GetBoneMatrix(int32_t boneIndex, FTransform& outTransform) {
        if (boneIndex < 0 || boneIndex >= BoneCount) return FALSE;
        
        // In a real implementation, this would read from BoneArray
        // For now, return identity transform
        outTransform = FTransform();
        return TRUE;
    }
    
    /* Get bone position with rotation */
    BOOLEAN GetBoneWithRotation(int32_t boneIndex, FVector& outPosition, FRotator& outRotation) {
        FTransform boneTransform;
        if (!GetBoneMatrix(boneIndex, boneTransform)) return FALSE;
        
        outPosition = boneTransform.Translation;
        // Convert quaternion to rotator
        // Simplified conversion
        outRotation = FRotator(0, 0, 0);
        
        return TRUE;
    }
} USkeletalMeshComponent, *PUSkeletalMeshComponent;

/* AActor - Base actor class */
typedef struct AActor {
    UObject Base;
    PUSceneComponent RootComponent;
    TArray Components;
    
    FVector GetLocation() {
        if (RootComponent) {
            return RootComponent->GetWorldLocation();
        }
        return FVector(0, 0, 0);
    }
} AActor, *PAActor;

/* APawn - Pawn base class */
typedef struct APawn {
    AActor Base;
    PVOID Controller;
    PVOID PlayerState;
    PVOID HealthComponent;
    
    /* Get health (game-specific) */
    float GetHealth() {
        if (HealthComponent) {
            // Read health from component
            float health = 0;
            // In real implementation: ReadProcessMemory(HealthComponent + health::Health, &health, sizeof(float));
            return health;
        }
        return 0.0f;
    }
    
    /* Get max health */
    float GetMaxHealth() {
        if (HealthComponent) {
            float maxHealth = 100.0f;
            // In real implementation: ReadProcessMemory(HealthComponent + health::MaxHealth, &maxHealth, sizeof(float));
            return maxHealth;
        }
        return 100.0f;
    }
} APawn, *PAPawn;

/* ACharacter - Character class */
typedef struct ACharacter {
    APawn Base;
    PUSkeletalMeshComponent Mesh;
    PVOID CharacterMovement;
    PVOID CapsuleComponent;
    
    /* Get bone position by ID */
    BOOLEAN GetBonePosition(int32_t boneId, FVector& outPosition) {
        if (!Mesh) return FALSE;
        
        FTransform boneTransform;
        if (Mesh->GetBoneMatrix(boneId, boneTransform)) {
            outPosition = boneTransform.Translation;
            return TRUE;
        }
        return FALSE;
    }
    
    /* Get bone with rotation */
    BOOLEAN GetBoneWithRotation(int32_t boneId, FVector& outPosition, FRotator& outRotation) {
        if (!Mesh) return FALSE;
        
        return Mesh->GetBoneWithRotation(boneId, outPosition, outRotation);
    }
} ACharacter, *PACharacter;

/* APlayerController - Player controller */
typedef struct APlayerController {
    PVOID Base;
    PVOID AcknowledgedPawn;
    PVOID PlayerCameraManager;
    FRotator ControlRotation;
    
    /* Get camera location */
    FVector GetCameraLocation() {
        if (PlayerCameraManager) {
            // Read camera location from manager
            FVector location(0, 0, 0);
            // In real implementation: ReadProcessMemory(PlayerCameraManager + fminimalviewinfo::Location, &location, sizeof(FVector));
            return location;
        }
        return FVector(0, 0, 0);
    }
    
    /* Get camera rotation */
    FRotator GetCameraRotation() {
        if (PlayerCameraManager) {
            FRotator rotation(0, 0, 0);
            // In real implementation: ReadProcessMemory(PlayerCameraManager + fminimalviewinfo::Rotation, &rotation, sizeof(FRotator));
            return rotation;
        }
        return ControlRotation;
    }
    
    /* Get camera FOV */
    float GetCameraFOV() {
        if (PlayerCameraManager) {
            float fov = 90.0f;
            // In real implementation: ReadProcessMemory(PlayerCameraManager + fminimalviewinfo::FOV, &fov, sizeof(float));
            return fov;
        }
        return 90.0f;
    }
} APlayerController, *PAPlayerController;

/* ULevel - Level information */
typedef struct ULevel {
    UObject Base;
    TArray Actors;
    int32_t ActorCount;
    
    /* Get actor by index */
    PAActor GetActor(int index) {
        if (index < 0 || index >= ActorCount) return nullptr;
        return (PAActor)Actors.Get(index);
    }
} ULevel, *PULevel;

/* UWorld - World context */
typedef struct UWorld {
    UObject Base;
    PVOID OwningGameInstance;
    PULevel PersistentLevel;
    PVOID GameState;
    TArray Levels;
    
    /* Get all actors in persistent level */
    TArray GetAllActors() {
        if (PersistentLevel) {
            return PersistentLevel->Actors;
        }
        return TArray();
    }
} UWorld, *PUWorld;

/* UGameInstance - Game instance */
typedef struct UGameInstance {
    UObject Base;
    TArray LocalPlayers;
    
    /* Get local player controller */
    PAPlayerController GetLocalPlayerController() {
        if (LocalPlayers.Count > 0) {
            PVOID localPlayer = LocalPlayers.Get(0);
            if (localPlayer) {
                PAPlayerController controller = nullptr;
                // In real implementation: ReadProcessMemory(localPlayer + ulocalplayer::PlayerController, &controller, sizeof(PAPlayerController));
                return controller;
            }
        }
        return nullptr;
    }
} UGameInstance, *PUGameInstance;

/* FMinimalViewInfo - Camera view information */
typedef struct FMinimalViewInfo {
    FVector Location;
    FRotator Rotation;
    float FOV;
    float AspectRatio;
    
    FMinimalViewInfo() : Location(), Rotation(), FOV(90.0f), AspectRatio(16.0f/9.0f) {}
} FMinimalViewInfo, *PFMinimalViewInfo;
