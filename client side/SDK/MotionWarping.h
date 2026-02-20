
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Enum /Script/MotionWarping.EWarpPointAnimProvider
/// Size: 0x01 (1 bytes)
enum class EWarpPointAnimProvider : uint8_t
{
	EWarpPointAnimProvider__None                                                     = 0,
	EWarpPointAnimProvider__Static                                                   = 1,
	EWarpPointAnimProvider__Bone                                                     = 2
};

/// Enum /Script/MotionWarping.EMotionWarpRotationType
/// Size: 0x01 (1 bytes)
enum class EMotionWarpRotationType : uint8_t
{
	EMotionWarpRotationType__Default                                                 = 0,
	EMotionWarpRotationType__Facing                                                  = 1
};

/// Enum /Script/MotionWarping.ERootMotionModifierState
/// Size: 0x01 (1 bytes)
enum class ERootMotionModifierState : uint8_t
{
	ERootMotionModifierState__Waiting                                                = 0,
	ERootMotionModifierState__Active                                                 = 1,
	ERootMotionModifierState__MarkedForRemoval                                       = 2,
	ERootMotionModifierState__Disabled                                               = 3
};

/// Class /Script/MotionWarping.AnimNotify_WarpingTarget
/// Size: 0x0008 (8 bytes) (0x000038 - 0x000040) align 8 pad: 0x0000
class UAnimNotify_WarpingTarget : public UAnimNotify
{ 
public:
	FName                                              TargetName;                                                 // 0x0038   (0x0008)  
};

/// Class /Script/MotionWarping.AnimNotifyState_MotionWarping
/// Size: 0x0008 (8 bytes) (0x000030 - 0x000038) align 8 pad: 0x0000
class UAnimNotifyState_MotionWarping : public UAnimNotifyState
{ 
public:
	class URootMotionModifier*                         RootMotionModifier;                                         // 0x0030   (0x0008)  


	/// Functions
	// Function /Script/MotionWarping.AnimNotifyState_MotionWarping.OnWarpUpdate
	// void OnWarpUpdate(class UMotionWarpingComponent* MotionWarpingComp, class URootMotionModifier* Modifier);                // [0x3a75280] Event|Public|BlueprintEvent|Const 
	// Function /Script/MotionWarping.AnimNotifyState_MotionWarping.OnWarpEnd
	// void OnWarpEnd(class UMotionWarpingComponent* MotionWarpingComp, class URootMotionModifier* Modifier);                   // [0x3a75280] Event|Public|BlueprintEvent|Const 
	// Function /Script/MotionWarping.AnimNotifyState_MotionWarping.OnWarpBegin
	// void OnWarpBegin(class UMotionWarpingComponent* MotionWarpingComp, class URootMotionModifier* Modifier);                 // [0x3a75280] Event|Public|BlueprintEvent|Const 
	// Function /Script/MotionWarping.AnimNotifyState_MotionWarping.OnRootMotionModifierUpdate
	// void OnRootMotionModifierUpdate(class UMotionWarpingComponent* MotionWarpingComp, class URootMotionModifier* Modifier);  // [0x15f1b80] Final|Native|Public|Const 
	// Function /Script/MotionWarping.AnimNotifyState_MotionWarping.OnRootMotionModifierDeactivate
	// void OnRootMotionModifierDeactivate(class UMotionWarpingComponent* MotionWarpingComp, class URootMotionModifier* Modifier); // [0x15f1ab0] Final|Native|Public|Const 
	// Function /Script/MotionWarping.AnimNotifyState_MotionWarping.OnRootMotionModifierActivate
	// void OnRootMotionModifierActivate(class UMotionWarpingComponent* MotionWarpingComp, class URootMotionModifier* Modifier); // [0x15f19e0] Final|Native|Public|Const 
	// Function /Script/MotionWarping.AnimNotifyState_MotionWarping.AddRootMotionModifier
	// class URootMotionModifier* AddRootMotionModifier(class UMotionWarpingComponent* MotionWarpingComp, class UAnimSequenceBase* Animation, float StartTime, float EndTime); // [0x15f0380] Native|Event|Public|BlueprintEvent|Const 
};

/// Class /Script/MotionWarping.MotionWarpingUtilities
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMotionWarpingUtilities : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/MotionWarping.MotionWarpingUtilities.MakeMotionWarpingSyncPoint
	// FMotionWarpingSyncPoint MakeMotionWarpingSyncPoint(FVector Location, FRotator Rotation);                                 // [0x15f1810] Final|Native|Static|Public|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MotionWarping.MotionWarpingUtilities.GetMotionWarpingWindowsFromAnimation
	// void GetMotionWarpingWindowsFromAnimation(class UAnimSequenceBase* Animation, TArray<FMotionWarpingWindowData>& OutWindows); // [0x15f1730] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MotionWarping.MotionWarpingUtilities.GetMotionWarpingWindowsForSyncPointFromAnimation
	// void GetMotionWarpingWindowsForSyncPointFromAnimation(class UAnimSequenceBase* Animation, FName WarpTargetName, TArray<FMotionWarpingWindowData>& OutWindows); // [0x15f1610] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MotionWarping.MotionWarpingUtilities.ExtractRootMotionFromAnimation
	// FTransform ExtractRootMotionFromAnimation(class UAnimSequenceBase* Animation, float StartTime, float EndTime);           // [0x15f1310] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MotionWarping.MotionWarpingUtilities.BreakMotionWarpingSyncPoint
	// void BreakMotionWarpingSyncPoint(FMotionWarpingSyncPoint& SyncPoint, FVector& Location, FRotator& Rotation);             // [0x15f11c0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MotionWarping.MotionWarpingComponent
/// Size: 0x0100 (256 bytes) (0x0000F8 - 0x0001F8) align 8 pad: 0x0000
class UMotionWarpingComponent : public UActorComponent
{ 
public:
	bool                                               bSearchForWindowsInAnimsWithinMontages;                     // 0x00F8   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x00F9   (0x0007)  MISSED
	SDK_UNDEFINED(16,699) /* FMulticastInlineDelegate */ __um(OnPreUpdate);                                        // 0x0100   (0x0010)  
	bool                                               bPendingAutoResetVelocity;                                  // 0x0110   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0111   (0x0003)  MISSED
	SDK_UNDEFINED(8,700) /* TWeakObjectPtr<ACharacter*> */ __um(CharacterOwner);                                   // 0x0114   (0x0008)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x011C   (0x0004)  MISSED
	TArray<class URootMotionModifier*>                 Modifiers;                                                  // 0x0120   (0x0010)  
	SDK_UNDEFINED(80,701) /* TMap<FName, FMotionWarpingSyncPoint> */ __um(SyncPoints);                             // 0x0130   (0x0050)  
	SDK_UNDEFINED(80,702) /* TMap<FName, float> */     __um(SyncTargetToTime);                                     // 0x0180   (0x0050)  
	unsigned char                                      UnknownData03_6[0x10];                                      // 0x01D0   (0x0010)  MISSED
	class URootMotionModifier_CharacterPhysics*        CachedCharacterPhysicsModifier;                             // 0x01E0   (0x0008)  
	SDK_UNDEFINED(16,703) /* TArray<TEnumAsByte<ECollisionResponse>> */ __um(CachedCollisionResponse);             // 0x01E8   (0x0010)  


	/// Functions
	// Function /Script/MotionWarping.MotionWarpingComponent.RemoveSyncPoint
	// int32_t RemoveSyncPoint(FName Name);                                                                                     // [0x15f1c50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MotionWarping.MotionWarpingComponent.OnCharacterPhysicsMontageEnded
	// void OnCharacterPhysicsMontageEnded(class UAnimMontage* Montage, bool bInterrupted);                                     // [0x15f1910] Final|Native|Protected 
	// Function /Script/MotionWarping.MotionWarpingComponent.AddOrUpdateSyncPoint
	// void AddOrUpdateSyncPoint(FName Name, FMotionWarpingSyncPoint& SyncPoint);                                               // [0x15f0280] Final|Native|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/MotionWarping.RootMotionModifier
/// Size: 0x0058 (88 bytes) (0x000028 - 0x000080) align 8 pad: 0x0000
class URootMotionModifier : public UObject
{ 
public:
	SDK_UNDEFINED(8,704) /* TWeakObjectPtr<UAnimSequenceBase*> */ __um(Animation);                                 // 0x0028   (0x0008)  
	float                                              StartTime;                                                  // 0x0030   (0x0004)  
	float                                              EndTime;                                                    // 0x0034   (0x0004)  
	float                                              PreviousPosition;                                           // 0x0038   (0x0004)  
	float                                              CurrentPosition;                                            // 0x003C   (0x0004)  
	float                                              Weight;                                                     // 0x0040   (0x0004)  
	bool                                               bInLocalSpace;                                              // 0x0044   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0045   (0x0003)  MISSED
	SDK_UNDEFINED(16,705) /* FDelegateProperty */      __um(OnActivateDelegate);                                   // 0x0048   (0x0010)  
	SDK_UNDEFINED(16,706) /* FDelegateProperty */      __um(OnUpdateDelegate);                                     // 0x0058   (0x0010)  
	SDK_UNDEFINED(16,707) /* FDelegateProperty */      __um(OnDeactivateDelegate);                                 // 0x0068   (0x0010)  
	ERootMotionModifierState                           State;                                                      // 0x0078   (0x0001)  
	unsigned char                                      UnknownData01_7[0x7];                                       // 0x0079   (0x0007)  MISSED
};

/// Class /Script/MotionWarping.RootMotionModifier_Warp
/// Size: 0x00E0 (224 bytes) (0x000080 - 0x000160) align 16 pad: 0x0000
class URootMotionModifier_Warp : public URootMotionModifier
{ 
public:
	FName                                              WarpTargetName;                                             // 0x0080   (0x0008)  
	EWarpPointAnimProvider                             WarpPointAnimProvider;                                      // 0x0088   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0089   (0x0007)  MISSED
	FTransform                                         WarpPointAnimTransform;                                     // 0x0090   (0x0030)  
	FName                                              WarpPointAnimBoneName;                                      // 0x00C0   (0x0008)  
	bool                                               bWarpTranslation;                                           // 0x00C8   (0x0001)  
	bool                                               bIgnoreZAxis;                                               // 0x00C9   (0x0001)  
	bool                                               bWarpRotation;                                              // 0x00CA   (0x0001)  
	EMotionWarpRotationType                            RotationType;                                               // 0x00CB   (0x0001)  
	bool                                               bAdjustPlayRate;                                            // 0x00CC   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x00CD   (0x0003)  MISSED
	float                                              MaxWarpScale;                                               // 0x00D0   (0x0004)  
	float                                              WarpPlayRateAlpha;                                          // 0x00D4   (0x0004)  
	float                                              CachedTargetTime;                                           // 0x00D8   (0x0004)  
	bool                                               bEnableInterruptByInput;                                    // 0x00DC   (0x0001)  
	bool                                               bWarpControlRotation;                                       // 0x00DD   (0x0001)  
	bool                                               bWarpControlRotationIgnorePitch;                            // 0x00DE   (0x0001)  
	bool                                               bAutoResetVelocity;                                         // 0x00DF   (0x0001)  
	float                                              WarpRotationTimeMultiplier;                                 // 0x00E0   (0x0004)  
	unsigned char                                      UnknownData02_6[0xC];                                       // 0x00E4   (0x000C)  MISSED
	FTransform                                         CachedTargetTransform;                                      // 0x00F0   (0x0030)  
	unsigned char                                      UnknownData03_7[0x40];                                      // 0x0120   (0x0040)  MISSED


	/// Functions
	// Function /Script/MotionWarping.RootMotionModifier_Warp.AddRootMotionModifierSimpleWarp
	// class URootMotionModifier_Warp* AddRootMotionModifierSimpleWarp(class UMotionWarpingComponent* InMotionWarpingComp, class UAnimSequenceBase* InAnimation, float InStartTime, float InEndTime, FName InWarpTargetName, EWarpPointAnimProvider InWarpPointAnimProvider, FTransform InWarpPointAnimTransform, FName InWarpPointAnimBoneName, bool bInWarpTranslation, bool bInIgnoreZAxis, bool bInWarpRotation, EMotionWarpRotationType InRotationType, float InWarpRotationTimeMultiplier); // [0x15f0940] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
};

/// Class /Script/MotionWarping.RootMotionModifier_Scale
/// Size: 0x0010 (16 bytes) (0x000080 - 0x000090) align 8 pad: 0x0000
class URootMotionModifier_Scale : public URootMotionModifier
{ 
public:
	FVector                                            Scale;                                                      // 0x0080   (0x000C)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x008C   (0x0004)  MISSED
};

/// Class /Script/MotionWarping.RootMotionModifier_CharacterPhysics
/// Size: 0x0020 (32 bytes) (0x000080 - 0x0000A0) align 8 pad: 0x0000
class URootMotionModifier_CharacterPhysics : public URootMotionModifier
{ 
public:
	bool                                               bIgnoreCollision;                                           // 0x0080   (0x0001)  
	bool                                               bIgnoreGravity;                                             // 0x0081   (0x0001)  
	bool                                               bRevertWalkMovementMode;                                    // 0x0082   (0x0001)  
	bool                                               bRevertCharacterPhysicsEffect;                              // 0x0083   (0x0001)  
	TEnumAsByte<EMovementMode>                         MovementMode;                                               // 0x0084   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0085   (0x0003)  MISSED
	SDK_UNDEFINED(16,708) /* TArray<TEnumAsByte<ECollisionChannel>> */ __um(ProcessedCollisionChannels);           // 0x0088   (0x0010)  
	unsigned char                                      UnknownData01_7[0x8];                                       // 0x0098   (0x0008)  MISSED
};

/// Class /Script/MotionWarping.RootMotionModifier_WarpWithoutRootMotion
/// Size: 0x0090 (144 bytes) (0x000160 - 0x0001F0) align 16 pad: 0x0000
class URootMotionModifier_WarpWithoutRootMotion : public URootMotionModifier_Warp
{ 
public:
	unsigned char                                      UnknownData00_1[0x90];                                      // 0x0160   (0x0090)  MISSED
};

/// Class /Script/MotionWarping.RootMotionModifier_OnlyWarpControlRotation
/// Size: 0x0008 (8 bytes) (0x000080 - 0x000088) align 8 pad: 0x0000
class URootMotionModifier_OnlyWarpControlRotation : public URootMotionModifier
{ 
public:
	float                                              LerpPitchAlpha;                                             // 0x0080   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0084   (0x0004)  MISSED
};

/// Class /Script/MotionWarping.RootMotionModifier_AdjustmentBlendWarp
/// Size: 0x00E0 (224 bytes) (0x000160 - 0x000240) align 16 pad: 0x0000
class URootMotionModifier_AdjustmentBlendWarp : public URootMotionModifier_Warp
{ 
public:
	bool                                               bWarpIKBones;                                               // 0x0160   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0161   (0x0007)  MISSED
	TArray<FName>                                      IKBones;                                                    // 0x0168   (0x0010)  
	unsigned char                                      UnknownData01_6[0x8];                                       // 0x0178   (0x0008)  MISSED
	FTransform                                         CachedMeshTransform;                                        // 0x0180   (0x0030)  
	FTransform                                         CachedMeshRelativeTransform;                                // 0x01B0   (0x0030)  
	FTransform                                         CachedRootMotion;                                           // 0x01E0   (0x0030)  
	FAnimSequenceTrackContainer                        Result;                                                     // 0x0210   (0x0020)  
	float                                              ActualStartTime;                                            // 0x0230   (0x0004)  
	unsigned char                                      UnknownData02_7[0xC];                                       // 0x0234   (0x000C)  MISSED


	/// Functions
	// Function /Script/MotionWarping.RootMotionModifier_AdjustmentBlendWarp.GetAdjustmentBlendIKBoneTransformAndAlpha
	// void GetAdjustmentBlendIKBoneTransformAndAlpha(class ACharacter* Character, FName BoneName, FTransform& OutTransform, float& OutAlpha); // [0x15f1460] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MotionWarping.RootMotionModifier_AdjustmentBlendWarp.AddRootMotionModifierAdjustmentBlendWarp
	// class URootMotionModifier_AdjustmentBlendWarp* AddRootMotionModifierAdjustmentBlendWarp(class UMotionWarpingComponent* InMotionWarpingComp, class UAnimSequenceBase* InAnimation, float InStartTime, float InEndTime, FName InWarpTargetName, EWarpPointAnimProvider InWarpPointAnimProvider, FTransform InWarpPointAnimTransform, FName InWarpPointAnimBoneName, bool bInWarpTranslation, bool bInIgnoreZAxis, bool bInWarpRotation, bool bInWarpIKBones, TArray<FName>& InIKBones); // [0x15f04e0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
};

/// Class /Script/MotionWarping.RootMotionModifier_SkewWarp
/// Size: 0x0000 (0 bytes) (0x000160 - 0x000160) align 16 pad: 0x0000
class URootMotionModifier_SkewWarp : public URootMotionModifier_Warp
{ 
public:


	/// Functions
	// Function /Script/MotionWarping.RootMotionModifier_SkewWarp.AddRootMotionModifierSkewWarp
	// class URootMotionModifier_SkewWarp* AddRootMotionModifierSkewWarp(class UMotionWarpingComponent* InMotionWarpingComp, class UAnimSequenceBase* InAnimation, float InStartTime, float InEndTime, FName InWarpTargetName, EWarpPointAnimProvider InWarpPointAnimProvider, FTransform InWarpPointAnimTransform, FName InWarpPointAnimBoneName, bool bInWarpTranslation, bool bInIgnoreZAxis, bool bInWarpRotation, EMotionWarpRotationType InRotationType, float InWarpRotationTimeMultiplier); // [0x15f0d80] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
};

/// Struct /Script/MotionWarping.MotionWarpingWindowData
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FMotionWarpingWindowData
{ 
	class UAnimNotifyState_MotionWarping*              AnimNotify;                                                 // 0x0000   (0x0008)  
	float                                              StartTime;                                                  // 0x0008   (0x0004)  
	float                                              EndTime;                                                    // 0x000C   (0x0004)  
};

/// Struct /Script/MotionWarping.MotionWarpingSyncPoint
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 16 pad: 0x0000
struct FMotionWarpingSyncPoint
{ 
	FVector                                            Location;                                                   // 0x0000   (0x000C)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FQuat                                              Rotation;                                                   // 0x0010   (0x0010)  
};

/// Struct /Script/MotionWarping.MotionDeltaTrack
/// Size: 0x0048 (72 bytes) (0x000000 - 0x000048) align 8 pad: 0x0000
struct FMotionDeltaTrack
{ 
	TArray<FTransform>                                 BoneTransformTrack;                                         // 0x0000   (0x0010)  
	TArray<FVector>                                    DeltaTranslationTrack;                                      // 0x0010   (0x0010)  
	TArray<FRotator>                                   DeltaRotationTrack;                                         // 0x0020   (0x0010)  
	FVector                                            TotalTranslation;                                           // 0x0030   (0x000C)  
	FRotator                                           TotalRotation;                                              // 0x003C   (0x000C)  
};

/// Struct /Script/MotionWarping.MotionDeltaTrackContainer
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FMotionDeltaTrackContainer
{ 
	TArray<FMotionDeltaTrack>                          Tracks;                                                     // 0x0000   (0x0010)  
};

static_assert(sizeof(UAnimNotify_WarpingTarget) == 0x0040); // 64 bytes (0x000038 - 0x000040)
static_assert(sizeof(UAnimNotifyState_MotionWarping) == 0x0038); // 56 bytes (0x000030 - 0x000038)
static_assert(sizeof(UMotionWarpingUtilities) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMotionWarpingComponent) == 0x01F8); // 504 bytes (0x0000F8 - 0x0001F8)
static_assert(sizeof(URootMotionModifier) == 0x0080); // 128 bytes (0x000028 - 0x000080)
static_assert(sizeof(URootMotionModifier_Warp) == 0x0160); // 352 bytes (0x000080 - 0x000160)
static_assert(sizeof(URootMotionModifier_Scale) == 0x0090); // 144 bytes (0x000080 - 0x000090)
static_assert(sizeof(URootMotionModifier_CharacterPhysics) == 0x00A0); // 160 bytes (0x000080 - 0x0000A0)
static_assert(sizeof(URootMotionModifier_WarpWithoutRootMotion) == 0x01F0); // 496 bytes (0x000160 - 0x0001F0)
static_assert(sizeof(URootMotionModifier_OnlyWarpControlRotation) == 0x0088); // 136 bytes (0x000080 - 0x000088)
static_assert(sizeof(URootMotionModifier_AdjustmentBlendWarp) == 0x0240); // 576 bytes (0x000160 - 0x000240)
static_assert(sizeof(URootMotionModifier_SkewWarp) == 0x0160); // 352 bytes (0x000160 - 0x000160)
static_assert(sizeof(FMotionWarpingWindowData) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FMotionWarpingSyncPoint) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(FMotionDeltaTrack) == 0x0048); // 72 bytes (0x000000 - 0x000048)
static_assert(sizeof(FMotionDeltaTrackContainer) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(offsetof(UAnimNotify_WarpingTarget, TargetName) == 0x0038);
static_assert(offsetof(UAnimNotifyState_MotionWarping, RootMotionModifier) == 0x0030);
static_assert(offsetof(UMotionWarpingComponent, Modifiers) == 0x0120);
static_assert(offsetof(UMotionWarpingComponent, CachedCharacterPhysicsModifier) == 0x01E0);
static_assert(offsetof(URootMotionModifier, State) == 0x0078);
static_assert(offsetof(URootMotionModifier_Warp, WarpTargetName) == 0x0080);
static_assert(offsetof(URootMotionModifier_Warp, WarpPointAnimProvider) == 0x0088);
static_assert(offsetof(URootMotionModifier_Warp, WarpPointAnimTransform) == 0x0090);
static_assert(offsetof(URootMotionModifier_Warp, WarpPointAnimBoneName) == 0x00C0);
static_assert(offsetof(URootMotionModifier_Warp, RotationType) == 0x00CB);
static_assert(offsetof(URootMotionModifier_Warp, CachedTargetTransform) == 0x00F0);
static_assert(offsetof(URootMotionModifier_Scale, Scale) == 0x0080);
static_assert(offsetof(URootMotionModifier_CharacterPhysics, MovementMode) == 0x0084);
static_assert(offsetof(URootMotionModifier_AdjustmentBlendWarp, IKBones) == 0x0168);
static_assert(offsetof(URootMotionModifier_AdjustmentBlendWarp, CachedMeshTransform) == 0x0180);
static_assert(offsetof(URootMotionModifier_AdjustmentBlendWarp, CachedMeshRelativeTransform) == 0x01B0);
static_assert(offsetof(URootMotionModifier_AdjustmentBlendWarp, CachedRootMotion) == 0x01E0);
static_assert(offsetof(URootMotionModifier_AdjustmentBlendWarp, Result) == 0x0210);
static_assert(offsetof(FMotionWarpingWindowData, AnimNotify) == 0x0000);
static_assert(offsetof(FMotionWarpingSyncPoint, Location) == 0x0000);
static_assert(offsetof(FMotionWarpingSyncPoint, Rotation) == 0x0010);
static_assert(offsetof(FMotionDeltaTrack, BoneTransformTrack) == 0x0000);
static_assert(offsetof(FMotionDeltaTrack, DeltaTranslationTrack) == 0x0010);
static_assert(offsetof(FMotionDeltaTrack, DeltaRotationTrack) == 0x0020);
static_assert(offsetof(FMotionDeltaTrack, TotalTranslation) == 0x0030);
static_assert(offsetof(FMotionDeltaTrack, TotalRotation) == 0x003C);
static_assert(offsetof(FMotionDeltaTrackContainer, Tracks) == 0x0000);
