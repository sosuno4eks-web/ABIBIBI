
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: AnimGraphRuntime
/// dependency: CoreUObject
/// dependency: Engine

/// Enum /Script/AnimationWarpingRuntime.EStrideWarpingAxisMode
/// Size: 0x01 (1 bytes)
enum class EStrideWarpingAxisMode : uint8_t
{
	EStrideWarpingAxisMode__IKFootRootLocalX                                         = 0,
	EStrideWarpingAxisMode__IKFootRootLocalY                                         = 1,
	EStrideWarpingAxisMode__IKFootRootLocalZ                                         = 2,
	EStrideWarpingAxisMode__WorldSpaceVectorInput                                    = 3,
	EStrideWarpingAxisMode__ComponentSpaceVectorInput                                = 4,
	EStrideWarpingAxisMode__ActorSpaceVectorInput                                    = 5
};

/// Struct /Script/AnimationWarpingRuntime.OrientationWarpingSpineBoneSettings
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 4 pad: 0x0000
struct FOrientationWarpingSpineBoneSettings
{ 
	FBoneReference                                     Bone;                                                       // 0x0000   (0x0010)  
};

/// Struct /Script/AnimationWarpingRuntime.OrientationWarpingSettings
/// Size: 0x0038 (56 bytes) (0x000000 - 0x000038) align 8 pad: 0x0000
struct FOrientationWarpingSettings
{ 
	TEnumAsByte<EAxis>                                 YawRotationAxis;                                            // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	float                                              BodyOrientationAlpha;                                       // 0x0004   (0x0004)  
	TArray<FOrientationWarpingSpineBoneSettings>       SpineBones;                                                 // 0x0008   (0x0010)  
	FBoneReference                                     IkFootRootBone;                                             // 0x0018   (0x0010)  
	TArray<FBoneReference>                             IKFootBones;                                                // 0x0028   (0x0010)  
};

/// Struct /Script/AnimationWarpingRuntime.OrientationWarpingSpineBoneData
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 4 pad: 0x0000
struct FOrientationWarpingSpineBoneData
{ 
	unsigned char                                      UnknownData00_2[0x8];                                       // 0x0000   (0x0008)  MISSED
};

/// Struct /Script/AnimationWarpingRuntime.AnimNode_OrientationWarping
/// Size: 0x0098 (152 bytes) (0x0000D0 - 0x000168) align 8 pad: 0x0000
struct FAnimNode_OrientationWarping : FAnimNode_SkeletalControlBase
{ 
	float                                              LocomotionAngle;                                            // 0x00D0   (0x0004)  
	float                                              ActualLocomotionAngle;                                      // 0x00D4   (0x0004)  
	FInputScaleBiasClamp                               LocomotionAngleBiasClamp;                                   // 0x00D8   (0x0030)  
	FOrientationWarpingSettings                        Settings;                                                   // 0x0108   (0x0038)  
	TArray<FOrientationWarpingSpineBoneData>           SpineBoneDataArray;                                         // 0x0140   (0x0010)  
	unsigned char                                      UnknownData00_6[0x14];                                      // 0x0150   (0x0014)  MISSED
	float                                              CachedDeltaTime;                                            // 0x0164   (0x0004)  
};

/// Struct /Script/AnimationWarpingRuntime.SlopeWarpingFootDefinition
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 4 pad: 0x0000
struct FSlopeWarpingFootDefinition
{ 
	FBoneReference                                     IKFootBone;                                                 // 0x0000   (0x0010)  
	FBoneReference                                     FKFootBone;                                                 // 0x0010   (0x0010)  
	int32_t                                            NumBonesInLimb;                                             // 0x0020   (0x0004)  
	float                                              FootSize;                                                   // 0x0024   (0x0004)  
};

/// Struct /Script/AnimationWarpingRuntime.SlopeWarpingFootData
/// Size: 0x0060 (96 bytes) (0x000000 - 0x000060) align 16 pad: 0x0000
struct FSlopeWarpingFootData
{ 
	unsigned char                                      UnknownData00_2[0x60];                                      // 0x0000   (0x0060)  MISSED
};

/// Struct /Script/AnimationWarpingRuntime.AnimNode_SlopeWarping
/// Size: 0x0160 (352 bytes) (0x0000D0 - 0x000230) align 8 pad: 0x0000
struct FAnimNode_SlopeWarping : FAnimNode_SkeletalControlBase
{ 
	unsigned char                                      UnknownData00_3[0x18];                                      // 0x00D0   (0x0018)  MISSED
	FBoneReference                                     IkFootRootBone;                                             // 0x00E8   (0x0010)  
	FBoneReference                                     PelvisBone;                                                 // 0x00F8   (0x0010)  
	TArray<FSlopeWarpingFootDefinition>                FeetDefinitions;                                            // 0x0108   (0x0010)  
	TArray<FSlopeWarpingFootData>                      FeetData;                                                   // 0x0118   (0x0010)  
	FVectorRK4SpringInterpolator                       PelvisOffsetInterpolator;                                   // 0x0128   (0x0008)  
	unsigned char                                      UnknownData01_6[0x34];                                      // 0x0130   (0x0034)  MISSED
	FVector                                            GravityDir;                                                 // 0x0164   (0x000C)  
	FVector                                            CustomFloorOffset;                                          // 0x0170   (0x000C)  
	float                                              CachedDeltaTime;                                            // 0x017C   (0x0004)  
	FVector                                            TargetFloorNormalWorldSpace;                                // 0x0180   (0x000C)  
	FVectorRK4SpringInterpolator                       FloorNormalInterpolator;                                    // 0x018C   (0x0008)  
	unsigned char                                      UnknownData02_6[0x34];                                      // 0x0194   (0x0034)  MISSED
	FVector                                            TargetFloorOffsetLocalSpace;                                // 0x01C8   (0x000C)  
	FVectorRK4SpringInterpolator                       FloorOffsetInterpolator;                                    // 0x01D4   (0x0008)  
	unsigned char                                      UnknownData03_6[0x34];                                      // 0x01DC   (0x0034)  MISSED
	float                                              MaxStepHeight;                                              // 0x0210   (0x0004)  
	bool                                               bKeepMeshInsideOfCapsule : 1;                               // 0x0214:0 (0x0001)  
	bool                                               bPullPelvisDown : 1;                                        // 0x0214:1 (0x0001)  
	bool                                               bUseCustomFloorOffset : 1;                                  // 0x0214:2 (0x0001)  
	bool                                               bWasOnGround : 1;                                           // 0x0214:3 (0x0001)  
	bool                                               bShowDebug : 1;                                             // 0x0214:4 (0x0001)  
	bool                                               bFloorSmoothingInitialized : 1;                             // 0x0214:5 (0x0001)  
	unsigned char                                      UnknownData04_5[0x3];                                       // 0x0215   (0x0003)  MISSED
	FVector                                            ActorLocation;                                              // 0x0218   (0x000C)  
	FVector                                            GravityDirCompSpace;                                        // 0x0224   (0x000C)  
};

/// Struct /Script/AnimationWarpingRuntime.StrideWarpingFootDefinition
/// Size: 0x0024 (36 bytes) (0x000000 - 0x000024) align 4 pad: 0x0000
struct FStrideWarpingFootDefinition
{ 
	FBoneReference                                     IKFootBone;                                                 // 0x0000   (0x0010)  
	FBoneReference                                     FKFootBone;                                                 // 0x0010   (0x0010)  
	int32_t                                            NumBonesInLimb;                                             // 0x0020   (0x0004)  
};

/// Struct /Script/AnimationWarpingRuntime.StrideWarpingFootData
/// Size: 0x0040 (64 bytes) (0x000000 - 0x000040) align 16 pad: 0x0000
struct FStrideWarpingFootData
{ 
	unsigned char                                      UnknownData00_2[0x40];                                      // 0x0000   (0x0040)  MISSED
};

/// Struct /Script/AnimationWarpingRuntime.AnimNode_StrideWarping
/// Size: 0x00F0 (240 bytes) (0x0000D0 - 0x0001C0) align 8 pad: 0x0000
struct FAnimNode_StrideWarping : FAnimNode_SkeletalControlBase
{ 
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x00D0   (0x0008)  MISSED
	FBoneReference                                     IkFootRootBone;                                             // 0x00D8   (0x0010)  
	TArray<FStrideWarpingFootDefinition>               FeetDefinitions;                                            // 0x00E8   (0x0010)  
	TArray<FStrideWarpingFootData>                     FeetData;                                                   // 0x00F8   (0x0010)  
	FBoneReference                                     PelvisBone;                                                 // 0x0108   (0x0010)  
	EStrideWarpingAxisMode                             StrideWarpingAxisMode;                                      // 0x0118   (0x0001)  
	EStrideWarpingAxisMode                             FloorNormalAxisMode;                                        // 0x0119   (0x0001)  
	EStrideWarpingAxisMode                             GravityDirAxisMode;                                         // 0x011A   (0x0001)  
	unsigned char                                      UnknownData01_6[0x1];                                       // 0x011B   (0x0001)  MISSED
	float                                              StrideScaling;                                              // 0x011C   (0x0004)  
	FInputScaleBiasClamp                               StrideScalingScaleBiasClamp;                                // 0x0120   (0x0030)  
	FVector                                            ManualStrideWarpingDir;                                     // 0x0150   (0x000C)  
	FVector                                            ManualFloorNormalInput;                                     // 0x015C   (0x000C)  
	FVector                                            ManualGravityDirInput;                                      // 0x0168   (0x000C)  
	float                                              PelvisPostAdjustmentAlpha;                                  // 0x0174   (0x0004)  
	int32_t                                            PelvisAdjustmentMaxIter;                                    // 0x0178   (0x0004)  
	FVectorRK4SpringInterpolator                       PelvisAdjustmentInterp;                                     // 0x017C   (0x0008)  
	unsigned char                                      UnknownData02_6[0x34];                                      // 0x0184   (0x0034)  MISSED
	bool                                               bAdjustThighBonesRotation : 1;                              // 0x01B8:0 (0x0001)  
	bool                                               bClampIKUsingFKLeg : 1;                                     // 0x01B8:1 (0x0001)  
	bool                                               bOrientStrideWarpingAxisBasedOnFloorNormal : 1;             // 0x01B8:2 (0x0001)  
	unsigned char                                      UnknownData03_5[0x3];                                       // 0x01B9   (0x0003)  MISSED
	float                                              CachedDeltaTime;                                            // 0x01BC   (0x0004)  
};

static_assert(sizeof(FOrientationWarpingSpineBoneSettings) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FOrientationWarpingSettings) == 0x0038); // 56 bytes (0x000000 - 0x000038)
static_assert(sizeof(FOrientationWarpingSpineBoneData) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(sizeof(FAnimNode_OrientationWarping) == 0x0168); // 360 bytes (0x0000D0 - 0x000168)
static_assert(sizeof(FSlopeWarpingFootDefinition) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(FSlopeWarpingFootData) == 0x0060); // 96 bytes (0x000000 - 0x000060)
static_assert(sizeof(FAnimNode_SlopeWarping) == 0x0230); // 560 bytes (0x0000D0 - 0x000230)
static_assert(sizeof(FStrideWarpingFootDefinition) == 0x0024); // 36 bytes (0x000000 - 0x000024)
static_assert(sizeof(FStrideWarpingFootData) == 0x0040); // 64 bytes (0x000000 - 0x000040)
static_assert(sizeof(FAnimNode_StrideWarping) == 0x01C0); // 448 bytes (0x0000D0 - 0x0001C0)
static_assert(offsetof(FOrientationWarpingSpineBoneSettings, Bone) == 0x0000);
static_assert(offsetof(FOrientationWarpingSettings, YawRotationAxis) == 0x0000);
static_assert(offsetof(FOrientationWarpingSettings, SpineBones) == 0x0008);
static_assert(offsetof(FOrientationWarpingSettings, IkFootRootBone) == 0x0018);
static_assert(offsetof(FOrientationWarpingSettings, IKFootBones) == 0x0028);
static_assert(offsetof(FAnimNode_OrientationWarping, LocomotionAngleBiasClamp) == 0x00D8);
static_assert(offsetof(FAnimNode_OrientationWarping, Settings) == 0x0108);
static_assert(offsetof(FAnimNode_OrientationWarping, SpineBoneDataArray) == 0x0140);
static_assert(offsetof(FSlopeWarpingFootDefinition, IKFootBone) == 0x0000);
static_assert(offsetof(FSlopeWarpingFootDefinition, FKFootBone) == 0x0010);
static_assert(offsetof(FAnimNode_SlopeWarping, IkFootRootBone) == 0x00E8);
static_assert(offsetof(FAnimNode_SlopeWarping, PelvisBone) == 0x00F8);
static_assert(offsetof(FAnimNode_SlopeWarping, FeetDefinitions) == 0x0108);
static_assert(offsetof(FAnimNode_SlopeWarping, FeetData) == 0x0118);
static_assert(offsetof(FAnimNode_SlopeWarping, PelvisOffsetInterpolator) == 0x0128);
static_assert(offsetof(FAnimNode_SlopeWarping, GravityDir) == 0x0164);
static_assert(offsetof(FAnimNode_SlopeWarping, CustomFloorOffset) == 0x0170);
static_assert(offsetof(FAnimNode_SlopeWarping, TargetFloorNormalWorldSpace) == 0x0180);
static_assert(offsetof(FAnimNode_SlopeWarping, FloorNormalInterpolator) == 0x018C);
static_assert(offsetof(FAnimNode_SlopeWarping, TargetFloorOffsetLocalSpace) == 0x01C8);
static_assert(offsetof(FAnimNode_SlopeWarping, FloorOffsetInterpolator) == 0x01D4);
static_assert(offsetof(FAnimNode_SlopeWarping, ActorLocation) == 0x0218);
static_assert(offsetof(FAnimNode_SlopeWarping, GravityDirCompSpace) == 0x0224);
static_assert(offsetof(FStrideWarpingFootDefinition, IKFootBone) == 0x0000);
static_assert(offsetof(FStrideWarpingFootDefinition, FKFootBone) == 0x0010);
static_assert(offsetof(FAnimNode_StrideWarping, IkFootRootBone) == 0x00D8);
static_assert(offsetof(FAnimNode_StrideWarping, FeetDefinitions) == 0x00E8);
static_assert(offsetof(FAnimNode_StrideWarping, FeetData) == 0x00F8);
static_assert(offsetof(FAnimNode_StrideWarping, PelvisBone) == 0x0108);
static_assert(offsetof(FAnimNode_StrideWarping, StrideWarpingAxisMode) == 0x0118);
static_assert(offsetof(FAnimNode_StrideWarping, FloorNormalAxisMode) == 0x0119);
static_assert(offsetof(FAnimNode_StrideWarping, GravityDirAxisMode) == 0x011A);
static_assert(offsetof(FAnimNode_StrideWarping, StrideScalingScaleBiasClamp) == 0x0120);
static_assert(offsetof(FAnimNode_StrideWarping, ManualStrideWarpingDir) == 0x0150);
static_assert(offsetof(FAnimNode_StrideWarping, ManualFloorNormalInput) == 0x015C);
static_assert(offsetof(FAnimNode_StrideWarping, ManualGravityDirInput) == 0x0168);
static_assert(offsetof(FAnimNode_StrideWarping, PelvisAdjustmentInterp) == 0x017C);
