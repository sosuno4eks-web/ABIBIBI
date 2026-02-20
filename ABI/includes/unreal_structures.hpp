#pragma once

#include <ntifs.h>

/* ── Unreal Engine 4/5 Structures for Arena Breakout Infinite ───────────── */

/* Basic UE4/5 types */
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

typedef struct FMinimalViewInfo {
    FVector Location;
    FRotator Rotation;
    float FOV;
    float AspectRatio;
    float OrthoWidth;
    float OrthoNearClipPlane;
    float OrthoFarClipPlane;
} FMinimalViewInfo, *PFMinimalViewInfo;

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
    UClass* Class;
    FName Name;
    UObject* Outer;
    
    // Common offsets (may vary by game version)
    static constexpr int32_t VTableOffset = 0x0;
    static constexpr int32_t ClassOffset = 0x10;
    static constexpr int32_t NameOffset = 0x18;
    static constexpr int32_t OuterOffset = 0x20;
} UObject, *PUObject;

/* UClass - Object class information */
typedef struct UClass {
    UObject Super;
    PVOID VTable;
    
    static constexpr int32_t SuperOffset = 0x40;
} UClass, *PUClass;

/* FName - Name structure */
typedef struct FName {
    int32_t ComparisonIndex;
    int32_t Number;
    
    static constexpr int32_t ComparisonIndexOffset = 0x0;
    static constexpr int32_t NumberOffset = 0x4;
} FName, *PFName;

/* USceneComponent - Scene component base */
typedef struct USceneComponent {
    UObject Base;
    FVector RelativeLocation;
    FRotator RelativeRotation;
    FVector RelativeScale3D;
    
    static constexpr int32_t RelativeLocationOffset = 0x16C;
    static constexpr int32_t RelativeRotationOffset = 0x178;
    static constexpr int32_t RelativeScale3DOffset = 0x184;
} USceneComponent, *PUSceneComponent;

/* USkeletalMeshComponent - Skeletal mesh component */
typedef struct USkeletalMeshComponent {
    USceneComponent Base;
    PVOID AnimClass;
    PVOID AnimInstance;
    PVOID ComponentToWorld;
    
    static constexpr int32_t MeshOffset = 0x380; // ACharacter::Mesh
    static constexpr int32_t ComponentToWorldOffset = 0x220;
} USkeletalMeshComponent, *PUSkeletalMeshComponent;

/* AActor - Base actor class */
typedef struct AActor {
    UObject Base;
    USceneComponent* RootComponent;
    TArray Components;
    
    static constexpr int32_t RootComponentOffset = 0x168;
    static constexpr int32_t ComponentsOffset = 0x2E0;
} AActor, *PAActor;

/* APawn - Pawn base class */
typedef struct APawn {
    AActor Base;
    AController* Controller;
    APlayerState* PlayerState;
    
    static constexpr int32_t ControllerOffset = 0x358;
    static constexpr int32_t PlayerStateOffset = 0x340;
} APawn, *PAPawn;

/* ACharacter - Character class */
typedef struct ACharacter {
    APawn Base;
    USkeletalMeshComponent* Mesh;
    UCharacterMovementComponent* CharacterMovement;
    UCapsuleComponent* CapsuleComponent;
    
    static constexpr int32_t MeshOffset = 0x380;
    static constexpr int32_t CharacterMovementOffset = 0x388;
    static constexpr int32_t CapsuleComponentOffset = 0x390;
} ACharacter, *PACharacter;

/* AController - Controller base class */
typedef struct AController {
    AActor Base;
    APawn* Pawn;
    APlayerController* PlayerController;
    
    static constexpr int32_t PawnOffset = 0x340;
} AController, *PAController;

/* APlayerController - Player controller */
typedef struct APlayerController {
    AController Base;
    APlayerCameraManager* PlayerCameraManager;
    APawn* AcknowledgedPawn;
    
    static constexpr int32_t PlayerCameraManagerOffset = 0x3A8;
    static constexpr int32_t AcknowledgedPawnOffset = 0x390;
} APlayerController, *PAPlayerController;

/* APlayerCameraManager - Camera manager */
typedef struct APlayerCameraManager {
    AActor Base;
    FMinimalViewInfo CameraCachePrivate;
    
    static constexpr int32_t CameraCachePrivateOffset = 0x2090;
} APlayerCameraManager, *PAPlayerCameraManager;

/* ULevel - Level information */
typedef struct ULevel {
    UObject Base;
    TArray Actors;
    
    static constexpr int32_t ActorsOffset = 0x98;
} ULevel, *PULevel;

/* UWorld - World context */
typedef struct UWorld {
    UObject Base;
    UGameInstance* OwningGameInstance;
    ULevel* PersistentLevel;
    AGameStateBase* GameState;
    TArray Levels;
    
    static constexpr int32_t OwningGameInstanceOffset = 0x180;
    static constexpr int32_t PersistentLevelOffset = 0x30;
    static constexpr int32_t GameStateOffset = 0x120;
    static constexpr int32_t LevelsOffset = 0x138;
} UWorld, *PUWorld;

/* UGameInstance - Game instance */
typedef struct UGameInstance {
    UObject Base;
    TArray LocalPlayers;
    
    static constexpr int32_t LocalPlayersOffset = 0x38;
} UGameInstance, *PUGameInstance;

/* AGameStateBase - Game state base */
typedef struct AGameStateBase {
    AActor Base;
    TArray PlayerArray;
    
    static constexpr int32_t PlayerArrayOffset = 0x328;
} AGameStateBase, *PAGameStateBase;

/* APlayerState - Player state */
typedef struct APlayerState {
    AActor Base;
    FString PlayerName;
    
    static constexpr int32_t PlayerNameOffset = 0x340;
} APlayerState, *PAPlayerState;

/* UCharacterMovementComponent - Character movement */
typedef struct UCharacterMovementComponent {
    UObject Base;
    FVector Velocity;
    
    static constexpr int32_t VelocityOffset = 0x170;
} UCharacterMovementComponent, *PUCharacterMovementComponent;

/* UCapsuleComponent - Capsule collision */
typedef struct UCapsuleComponent {
    USceneComponent Base;
    float CapsuleRadius;
    float CapsuleHalfHeight;
    
    static constexpr int32_t CapsuleRadiusOffset = 0x220;
    static constexpr int32_t CapsuleHalfHeightOffset = 0x224;
} UCapsuleComponent, *PUCapsuleComponent;
