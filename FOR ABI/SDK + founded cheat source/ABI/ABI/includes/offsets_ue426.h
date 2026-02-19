#pragma once

/* ── UE 4.26.1 Offsets for Arena Breakout Infinite ───────────────────── */

/*
 * Global offsets for Arena Breakout Infinite (UE 4.26.1)
 * Target Process: ArenaBreakout.exe
 * Anti-Cheat: ACE (Tencent)
 */

namespace abi_offsets {
    /* Global UE Offsets */
    namespace global {
        constexpr auto GEngine = 0x9910F70;
        constexpr auto GWorld = 0x9914A28;
        constexpr auto GObjects = 0x9757E48;
        constexpr auto GNames = 0x973D8C0;
    }
    
    /* ProcessEvent Function */
    namespace process_event {
        constexpr auto ProcessEvent = 0x3A74BD0;
        constexpr auto Index = 0x46;
    }
    
    /* UWorld Offsets */
    namespace uworld {
        constexpr auto OwningGameInstance = 0x180;
        constexpr auto PersistentLevel = 0x30;
        constexpr auto GameState = 0x120;
        constexpr auto Levels = 0x138;
        constexpr auto NetDriver = 0x38;
    }
    
    /* ULevel Offsets */
    namespace ulevel {
        constexpr auto Actors = 0x98;
        constexpr auto ActorCount = 0xA0;
        constexpr auto OwningWorld = 0x20;
    }
    
    /* AActor Offsets */
    namespace aactor {
        constexpr auto RootComponent = 0x168;
        constexpr auto Components = 0x2E0;
        constexpr auto Class = 0x10;
        constexpr auto UniqueID = 0x18;
        constexpr auto Outer = 0x20;
    }
    
    /* UGameInstance Offsets */
    namespace ugameinstance {
        constexpr auto LocalPlayers = 0x38;
    }
    
    /* ULocalPlayer Offsets */
    namespace ulocalplayer {
        constexpr auto PlayerController = 0x30;
    }
    
    /* APlayerController Offsets */
    namespace aplayercontroller {
        constexpr auto AcknowledgedPawn = 0x390;
        constexpr auto PlayerCameraManager = 0x3A8;
        constexpr auto ControlRotation = 0x418;
        constexpr auto Pawn = 0x340;
    }
    
    /* APawn Offsets */
    namespace apawn {
        constexpr auto PlayerState = 0x340;
        constexpr auto Controller = 0x358;
    }
    
    /* ACharacter Offsets */
    namespace acharacter {
        constexpr auto Mesh = 0x380;
        constexpr auto CharacterMovement = 0x388;
        constexpr auto CapsuleComponent = 0x390;
    }
    
    /* USkeletalMeshComponent Offsets */
    namespace uskeletalmesh {
        constexpr auto ComponentToWorld = 0x220;
        constexpr auto SkeletalMesh = 0x590;
        constexpr auto AnimInstance = 0x718;
        constexpr auto BoneArray = 0x5A0;
        constexpr auto BoneCount = 0x5A8;
    }
    
    /* USceneComponent Offsets */
    namespace uscenecomponent {
        constexpr auto RelativeLocation = 0x16C;
        constexpr auto RelativeRotation = 0x178;
        constexpr auto RelativeScale3D = 0x184;
        constexpr auto ComponentToWorld = 0x220;
    }
    
    /* APlayerState Offsets */
    namespace aplayerstate {
        constexpr auto PlayerName = 0x340;
        constexpr auto Score = 0x348;
        constexpr auto Ping = 0x350;
    }
    
    /* APlayerCameraManager Offsets */
    namespace aplayercameramanager {
        constexpr auto CameraCachePrivate = 0x2090;
        constexpr auto ViewTarget = 0x10;
    }
    
    /* FMinimalViewInfo Offsets */
    namespace fminimalviewinfo {
        constexpr auto Location = 0x0;
        constexpr auto Rotation = 0x18;
        constexpr auto FOV = 0x30;
        constexpr auto AspectRatio = 0x34;
    }
    
    /* FTransform Offsets */
    namespace ftransform {
        constexpr auto Translation = 0x0;
        constexpr auto Rotation = 0x10;
        constexpr auto Scale3D = 0x20;
    }
    
    /* Bone Indices for ESP */
    namespace bones {
        enum BoneID {
            BONE_ROOT = 0,
            BONE_PELVIS = 1,
            BONE_SPINE_01 = 2,
            BONE_SPINE_02 = 3,
            BONE_SPINE_03 = 4,
            BONE_NECK = 15,
            BONE_HEAD = 16,
            BONE_LEFT_CLAVICLE = 17,
            BONE_LEFT_UPPER_ARM = 18,
            BONE_LEFT_FOREARM = 19,
            BONE_LEFT_HAND = 20,
            BONE_RIGHT_CLAVICLE = 33,
            BONE_RIGHT_UPPER_ARM = 34,
            BONE_RIGHT_FOREARM = 35,
            BONE_RIGHT_HAND = 36,
            BONE_LEFT_THIGH = 57,
            BONE_LEFT_CALF = 58,
            BONE_LEFT_FOOT = 59,
            BONE_RIGHT_THIGH = 62,
            BONE_RIGHT_CALF = 63,
            BONE_RIGHT_FOOT = 64
        };
    }
    
    /* Health/Status Offsets (game-specific) */
    namespace health {
        constexpr auto Health = 0x1C0;  // Example offset
        constexpr auto MaxHealth = 0x1C4;
        constexpr auto Shield = 0x1C8;
        constexpr auto MaxShield = 0x1CC;
    }
    
    /* Team/Visibility Offsets */
    namespace team {
        constexpr auto TeamID = 0x780;  // Example offset
        constexpr auto bIsPlayer = 0x280;
        constexpr auto bIsBot = 0x284;
    }
}
