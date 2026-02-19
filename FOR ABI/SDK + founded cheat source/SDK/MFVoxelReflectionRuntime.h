
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: SGFramework

/// Enum /Script/MFVoxelReflectionRuntime.EMFDoorSwitchMode
/// Size: 0x01 (1 bytes)
enum class EMFDoorSwitchMode : uint8_t
{
	EMFDoorSwitchMode__Disabled                                                      = 0,
	EMFDoorSwitchMode__AlwaysOpen                                                    = 1,
	EMFDoorSwitchMode__AlwaysClose                                                   = 2,
	EMFDoorSwitchMode__Default                                                       = 3
};

/// Enum /Script/MFVoxelReflectionRuntime.EMFReflectionState
/// Size: 0x01 (1 bytes)
enum class EMFReflectionState : uint8_t
{
	EMFReflectionState__None                                                         = 0,
	EMFReflectionState__DoorOpen                                                     = 1,
	EMFReflectionState__DoorClose                                                    = 2
};

/// Enum /Script/MFVoxelReflectionRuntime.EInteriorBiasFloorDecalMode
/// Size: 0x01 (1 bytes)
enum class EInteriorBiasFloorDecalMode : uint8_t
{
	EInteriorBiasFloorDecalMode__None                                                = 0,
	EInteriorBiasFloorDecalMode__AllDirection                                        = 1,
	EInteriorBiasFloorDecalMode__VerticalOnly                                        = 2
};

/// Enum /Script/MFVoxelReflectionRuntime.EInteriorBiasMode
/// Size: 0x01 (1 bytes)
enum class EInteriorBiasMode : uint8_t
{
	EInteriorBiasMode__Debug                                                         = -1,
	EInteriorBiasMode__BiasOnly                                                      = 0,
	EInteriorBiasMode__BlurOnly                                                      = 1,
	EInteriorBiasMode__Hybrid                                                        = 2
};

/// Enum /Script/MFVoxelReflectionRuntime.ESkyLightMode
/// Size: 0x01 (1 bytes)
enum class ESkyLightMode : uint8_t
{
	ESkyLightMode__None                                                              = 0,
	ESkyLightMode__LineTrace                                                         = 1,
	ESkyLightMode__Embree                                                            = 2
};

/// Enum /Script/MFVoxelReflectionRuntime.EInteriorMode
/// Size: 0x01 (1 bytes)
enum class EInteriorMode : uint8_t
{
	EInteriorMode__None                                                              = 0,
	EInteriorMode__Default                                                           = 1,
	EInteriorMode__RaycastOnly                                                       = 2,
	EInteriorMode__DawnInteriorVolumeOnly                                            = 3,
	EInteriorMode__TaggedReflectionCaptureOnly                                       = 4
};

/// Class /Script/MFVoxelReflectionRuntime.MFVoxelReflectionDoorSwitch
/// Size: 0x0048 (72 bytes) (0x000318 - 0x000360) align 8 pad: 0x0000
class AMFVoxelReflectionDoorSwitch : public AVolume
{ 
public:
	SDK_UNDEFINED(28,2771) /* TLazyObjectPtr<ASGDoorBase*> */ __um(Door);                                          // 0x0318   (0x001C)  
	EMFDoorSwitchMode                                  SwitchMode;                                                 // 0x0334   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0335   (0x0003)  MISSED
	SDK_UNDEFINED(8,2772) /* TWeakObjectPtr<AReflectionCapture*> */ __um(ReflectionCaptureDoorOpened);             // 0x0338   (0x0008)  
	SDK_UNDEFINED(8,2773) /* TWeakObjectPtr<AReflectionCapture*> */ __um(ReflectionCaptureDoorClosed);             // 0x0340   (0x0008)  
	int32_t                                            VoxelReflectionID;                                          // 0x0348   (0x0004)  
	unsigned char                                      UnknownData01_7[0x14];                                      // 0x034C   (0x0014)  MISSED


	/// Functions
	// Function /Script/MFVoxelReflectionRuntime.MFVoxelReflectionDoorSwitch.OnDoorStateChange
	// void OnDoorStateChange(class ASGDoorBase* InDoor, ESGDoorState NewState);                                                // [0x2fb3970] Final|Native|Protected 
	// Function /Script/MFVoxelReflectionRuntime.MFVoxelReflectionDoorSwitch.OnDoorBeginChange
	// void OnDoorBeginChange(class ASGDoorBase* InDoor, ESGDoorState CurrentState);                                            // [0x2fb38a0] Final|Native|Protected 
};

/// Class /Script/MFVoxelReflectionRuntime.MFVoxelReflectionPatchVolume
/// Size: 0x0038 (56 bytes) (0x000318 - 0x000350) align 8 pad: 0x0000
class AMFVoxelReflectionPatchVolume : public AVolume
{ 
public:
	bool                                               bInterior;                                                  // 0x0318   (0x0001)  
	bool                                               bInteriorAmbientGI;                                         // 0x0319   (0x0001)  
	bool                                               bNoSkyLightCompensation;                                    // 0x031A   (0x0001)  
	bool                                               bEraseVoxels;                                               // 0x031B   (0x0001)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x031C   (0x0004)  MISSED
	SDK_UNDEFINED(16,2774) /* TArray<TWeakObjectPtr<AReflectionCapture*>> */ __um(IgnoredReflectionCaptures);      // 0x0320   (0x0010)  
	SDK_UNDEFINED(16,2775) /* TArray<TWeakObjectPtr<AReflectionCapture*>> */ __um(ForcedReflectionCaptures);       // 0x0330   (0x0010)  
	unsigned char                                      UnknownData01_7[0x10];                                      // 0x0340   (0x0010)  MISSED
};

/// Class /Script/MFVoxelReflectionRuntime.MFVoxelReflectionSystem
/// Size: 0x0148 (328 bytes) (0x0002E0 - 0x000428) align 8 pad: 0x0000
class AMFVoxelReflectionSystem : public AActor
{ 
public:
	float                                              VoxelSampleBiasScale;                                       // 0x02E0   (0x0004)  
	float                                              IndoorAntiLeakBiasScale;                                    // 0x02E4   (0x0004)  
	float                                              InteriorBiasDiscardThresholdStart;                          // 0x02E8   (0x0004)  
	float                                              InteriorBiasDiscardThresholdEnd;                            // 0x02EC   (0x0004)  
	int32_t                                            InteriorBiasFallbackSvnVersion;                             // 0x02F0   (0x0004)  
	EInteriorBiasMode                                  InteriorBiasMethod;                                         // 0x02F4   (0x0001)  
	bool                                               InteriorBiasNormalBiasDoubleCheck;                          // 0x02F5   (0x0001)  
	EInteriorBiasFloorDecalMode                        InteriorBiasFixFloorDecal;                                  // 0x02F6   (0x0001)  
	bool                                               InteriorBiasSmoothing;                                      // 0x02F7   (0x0001)  
	int32_t                                            InteriorBiasDiscardMode;                                    // 0x02F8   (0x0004)  
	float                                              InteriorBiasIndoorSkylightThreshold;                        // 0x02FC   (0x0004)  
	float                                              InteriorBiasOutdoorSkylightThreshold;                       // 0x0300   (0x0004)  
	float                                              InteriorBiasCameraThreshold;                                // 0x0304   (0x0004)  
	float                                              InteriorBiasBlurWeight;                                     // 0x0308   (0x0004)  
	float                                              ReflectionCaptureFadePower;                                 // 0x030C   (0x0004)  
	float                                              VoxelVolumeBoundFadeDistance;                               // 0x0310   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0314   (0x0004)  MISSED
	class UVoxelDataAsset*                             VoxelDataAsset;                                             // 0x0318   (0x0008)  
	class USparseVoxelDataAsset*                       SparseVoxelDataAsset;                                       // 0x0320   (0x0008)  
	FIntVector                                         VoxelDimensions;                                            // 0x0328   (0x000C)  
	FBox                                               VoxelBounds;                                                // 0x0334   (0x001C)  
	float                                              VoxelGridSize;                                              // 0x0350   (0x0004)  
	float                                              FadeInSpeed;                                                // 0x0354   (0x0004)  
	float                                              FadeOutSpeed;                                               // 0x0358   (0x0004)  
	int32_t                                            VoxelTreeBranchingFactor;                                   // 0x035C   (0x0004)  
	class UBoxComponent*                               BoxComponent;                                               // 0x0360   (0x0008)  
	unsigned char                                      UnknownData01_7[0xC0];                                      // 0x0368   (0x00C0)  MISSED


	/// Functions
	// Function /Script/MFVoxelReflectionRuntime.MFVoxelReflectionSystem.SurroundReflectionProbePlacement
	// void SurroundReflectionProbePlacement();                                                                                 // [0xd906a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFVoxelReflectionRuntime.MFVoxelReflectionSystem.BakeVoxels
	// void BakeVoxels();                                                                                                       // [0xd906a0] Final|Native|Public|BlueprintCallable 
};

/// Struct /Script/MFVoxelReflectionRuntime.ReflectionVoxelTreeNode
/// Size: 0x000C (12 bytes) (0x000000 - 0x00000C) align 4 pad: 0x0000
struct FReflectionVoxelTreeNode
{ 
	uint32_t                                           ChildMaskL;                                                 // 0x0000   (0x0004)  
	uint32_t                                           ChildMaskH;                                                 // 0x0004   (0x0004)  
	uint32_t                                           ChildStartIndex;                                            // 0x0008   (0x0004)  
};

/// Struct /Script/MFVoxelReflectionRuntime.ReflectionVoxel
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 8 pad: 0x0000
struct FReflectionVoxel
{ 
	TArray<int32_t>                                    ReflectionCaptureIDs;                                       // 0x0000   (0x0010)  
	uint32_t                                           CornerNeighbourFlags;                                       // 0x0010   (0x0004)  
	uint32_t                                           CornerInteriorFlags;                                        // 0x0014   (0x0004)  
	uint32_t                                           CornerSkyLightFlags;                                        // 0x0018   (0x0004)  
	uint32_t                                           CornerInteriorFlagsAmbientGI;                               // 0x001C   (0x0004)  
};

/// Class /Script/MFVoxelReflectionRuntime.SparseVoxelDataAsset
/// Size: 0x0038 (56 bytes) (0x000030 - 0x000068) align 8 pad: 0x0000
class USparseVoxelDataAsset : public UDataAsset
{ 
public:
	int32_t                                            Version;                                                    // 0x0030   (0x0004)  
	FIntVector                                         TreeRootDimensions;                                         // 0x0034   (0x000C)  
	int32_t                                            TreeHeight;                                                 // 0x0040   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0044   (0x0004)  MISSED
	TArray<FReflectionVoxelTreeNode>                   SparseTree;                                                 // 0x0048   (0x0010)  
	TArray<FReflectionVoxel>                           Voxels;                                                     // 0x0058   (0x0010)  
};

/// Class /Script/MFVoxelReflectionRuntime.VoxelBoundsVisualizer
/// Size: 0x0060 (96 bytes) (0x000630 - 0x000690) align 16 pad: 0x0000
class UVoxelBoundsVisualizer : public UDebugDrawComponent
{ 
public:
	unsigned char                                      UnknownData00_1[0x60];                                      // 0x0630   (0x0060)  MISSED
};

/// Class /Script/MFVoxelReflectionRuntime.VoxelDataAsset
/// Size: 0x0010 (16 bytes) (0x000030 - 0x000040) align 8 pad: 0x0000
class UVoxelDataAsset : public UDataAsset
{ 
public:
	TArray<FReflectionVoxel>                           Voxels;                                                     // 0x0030   (0x0010)  
};

/// Class /Script/MFVoxelReflectionRuntime.VoxelVisualizer
/// Size: 0x0000 (0 bytes) (0x000630 - 0x000630) align 16 pad: 0x0000
class UVoxelVisualizer : public UDebugDrawComponent
{ 
public:
};

/// Class /Script/MFVoxelReflectionRuntime.VoxelReflectionSystemVisualizer
/// Size: 0x0080 (128 bytes) (0x000630 - 0x0006B0) align 16 pad: 0x0000
class UVoxelReflectionSystemVisualizer : public UVoxelVisualizer
{ 
public:
	unsigned char                                      UnknownData00_1[0x80];                                      // 0x0630   (0x0080)  MISSED
};

/// Class /Script/MFVoxelReflectionRuntime.VoxelReflectionWorldSubsystem
/// Size: 0x00F0 (240 bytes) (0x000030 - 0x000120) align 8 pad: 0x0000
class UVoxelReflectionWorldSubsystem : public UWorldSubsystem
{ 
public:
	unsigned char                                      UnknownData00_3[0x10];                                      // 0x0030   (0x0010)  MISSED
	class AMFVoxelReflectionSystem*                    VoxelReflectionSystem;                                      // 0x0040   (0x0008)  
	unsigned char                                      UnknownData01_7[0xD8];                                      // 0x0048   (0x00D8)  MISSED


	/// Functions
	// Function /Script/MFVoxelReflectionRuntime.VoxelReflectionWorldSubsystem.GetVoxelReflectionSystem
	// class AMFVoxelReflectionSystem* GetVoxelReflectionSystem();                                                              // [0x2fb3870] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

static_assert(sizeof(AMFVoxelReflectionDoorSwitch) == 0x0360); // 864 bytes (0x000318 - 0x000360)
static_assert(sizeof(AMFVoxelReflectionPatchVolume) == 0x0350); // 848 bytes (0x000318 - 0x000350)
static_assert(sizeof(AMFVoxelReflectionSystem) == 0x0428); // 1064 bytes (0x0002E0 - 0x000428)
static_assert(sizeof(FReflectionVoxelTreeNode) == 0x000C); // 12 bytes (0x000000 - 0x00000C)
static_assert(sizeof(FReflectionVoxel) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(USparseVoxelDataAsset) == 0x0068); // 104 bytes (0x000030 - 0x000068)
static_assert(sizeof(UVoxelBoundsVisualizer) == 0x0690); // 1680 bytes (0x000630 - 0x000690)
static_assert(sizeof(UVoxelDataAsset) == 0x0040); // 64 bytes (0x000030 - 0x000040)
static_assert(sizeof(UVoxelVisualizer) == 0x0630); // 1584 bytes (0x000630 - 0x000630)
static_assert(sizeof(UVoxelReflectionSystemVisualizer) == 0x06B0); // 1712 bytes (0x000630 - 0x0006B0)
static_assert(sizeof(UVoxelReflectionWorldSubsystem) == 0x0120); // 288 bytes (0x000030 - 0x000120)
static_assert(offsetof(AMFVoxelReflectionDoorSwitch, SwitchMode) == 0x0334);
static_assert(offsetof(AMFVoxelReflectionSystem, InteriorBiasMethod) == 0x02F4);
static_assert(offsetof(AMFVoxelReflectionSystem, InteriorBiasFixFloorDecal) == 0x02F6);
static_assert(offsetof(AMFVoxelReflectionSystem, VoxelDataAsset) == 0x0318);
static_assert(offsetof(AMFVoxelReflectionSystem, SparseVoxelDataAsset) == 0x0320);
static_assert(offsetof(AMFVoxelReflectionSystem, VoxelDimensions) == 0x0328);
static_assert(offsetof(AMFVoxelReflectionSystem, VoxelBounds) == 0x0334);
static_assert(offsetof(AMFVoxelReflectionSystem, BoxComponent) == 0x0360);
static_assert(offsetof(FReflectionVoxel, ReflectionCaptureIDs) == 0x0000);
static_assert(offsetof(USparseVoxelDataAsset, TreeRootDimensions) == 0x0034);
static_assert(offsetof(USparseVoxelDataAsset, SparseTree) == 0x0048);
static_assert(offsetof(USparseVoxelDataAsset, Voxels) == 0x0058);
static_assert(offsetof(UVoxelDataAsset, Voxels) == 0x0030);
static_assert(offsetof(UVoxelReflectionWorldSubsystem, VoxelReflectionSystem) == 0x0040);
