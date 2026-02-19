
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: AIModule
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: NavigationSystem

/// Enum /Script/MFVoxelEnv.EMFVoxelEnvFindCoverCallResult
/// Size: 0x01 (1 bytes)
enum class EMFVoxelEnvFindCoverCallResult : uint8_t
{
	EMFVoxelEnvFindCoverCallResult__Success                                          = 0,
	EMFVoxelEnvFindCoverCallResult__NoVolume                                         = 1,
	EMFVoxelEnvFindCoverCallResult__NoOctree                                         = 2,
	EMFVoxelEnvFindCoverCallResult__CoverMapNotEnabled                               = 3,
	EMFVoxelEnvFindCoverCallResult__CoverMapInvalid                                  = 4
};

/// Enum /Script/MFVoxelEnv.EMFVoxelEnvCoverSearchType
/// Size: 0x01 (1 bytes)
enum class EMFVoxelEnvCoverSearchType : uint8_t
{
	EMFVoxelEnvCoverSearchType__Nearest                                              = 0,
	EMFVoxelEnvCoverSearchType__Furthest                                             = 1,
	EMFVoxelEnvCoverSearchType__Random                                               = 2
};

/// Enum /Script/MFVoxelEnv.EMFVoxelEnvPathPruning
/// Size: 0x01 (1 bytes)
enum class EMFVoxelEnvPathPruning : uint8_t
{
	EMFVoxelEnvPathPruning__None                                                     = 0,
	EMFVoxelEnvPathPruning__WithClearance                                            = 1,
	EMFVoxelEnvPathPruning__WithoutClearance                                         = 2
};

/// Enum /Script/MFVoxelEnv.EMFVoxelEnvFindLineOfSightCallResult
/// Size: 0x01 (1 bytes)
enum class EMFVoxelEnvFindLineOfSightCallResult : uint8_t
{
	EMFVoxelEnvFindLineOfSightCallResult__Success                                    = 0,
	EMFVoxelEnvFindLineOfSightCallResult__Visible                                    = 1,
	EMFVoxelEnvFindLineOfSightCallResult__NoVolume                                   = 2,
	EMFVoxelEnvFindLineOfSightCallResult__NoOctree                                   = 3,
	EMFVoxelEnvFindLineOfSightCallResult__NoStart                                    = 4,
	EMFVoxelEnvFindLineOfSightCallResult__NoTarget                                   = 5
};

/// Enum /Script/MFVoxelEnv.EMFVoxelEnvPathFindingCallResult
/// Size: 0x01 (1 bytes)
enum class EMFVoxelEnvPathFindingCallResult : uint8_t
{
	EMFVoxelEnvPathFindingCallResult__Success                                        = 0,
	EMFVoxelEnvPathFindingCallResult__Reachable                                      = 1,
	EMFVoxelEnvPathFindingCallResult__NoVolume                                       = 2,
	EMFVoxelEnvPathFindingCallResult__NoOctree                                       = 3,
	EMFVoxelEnvPathFindingCallResult__NoStart                                        = 4,
	EMFVoxelEnvPathFindingCallResult__NoTarget                                       = 5
};

/// Enum /Script/MFVoxelEnv.EMFVoxelEnvHeuristic
/// Size: 0x01 (1 bytes)
enum class EMFVoxelEnvHeuristic : uint8_t
{
	EMFVoxelEnvHeuristic__Manhattan                                                  = 0,
	EMFVoxelEnvHeuristic__Euclidean                                                  = 1
};

/// Class /Script/MFVoxelEnv.EnvQueryTest_NodeWeight
/// Size: 0x0008 (8 bytes) (0x0001F8 - 0x000200) align 8 pad: 0x0000
class UEnvQueryTest_NodeWeight : public UEnvQueryTest
{ 
public:
	float                                              WeightScale;                                                // 0x01F8   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x01FC   (0x0004)  MISSED
};

/// Class /Script/MFVoxelEnv.MFVoxelEnvComponent
/// Size: 0x0040 (64 bytes) (0x0000F8 - 0x000138) align 8 pad: 0x0000
class UMFVoxelEnvComponent : public UActorComponent
{ 
public:
	EMFVoxelEnvHeuristic                               Heuristic;                                                  // 0x00F8   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x00F9   (0x0003)  MISSED
	float                                              HeuristicWeight;                                            // 0x00FC   (0x0004)  
	float                                              NodeSizePreference;                                         // 0x0100   (0x0004)  
	EMFVoxelEnvPathPruning                             PathPruning;                                                // 0x0104   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0105   (0x0003)  MISSED
	int32_t                                            PathSmoothing;                                              // 0x0108   (0x0004)  
	unsigned char                                      UnknownData02_6[0x24];                                      // 0x010C   (0x0024)  MISSED
	class AMFVoxelEnvVolume*                           Volume;                                                     // 0x0130   (0x0008)  


	/// Functions
	// Function /Script/MFVoxelEnv.MFVoxelEnvComponent.GetPath
	// void GetPath(TArray<FVector>& Path);                                                                                     // [0x2fc6690] Final|Native|Public|HasOutParms|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFVoxelEnv.MFVoxelEnvComponent.GetCoverLocation
	// void GetCoverLocation(FMFVoxelEnvCoverLocation& CoverLocation);                                                          // [0x2fc65a0] Final|Native|Public|HasOutParms|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFVoxelEnv.MFVoxelEnvComponent.FindPath
	// void FindPath(FVector& StartLocation, FVector& TargetLocation, bool bCheckLineOfSight, FDelegateProperty OnComplete, EMFVoxelEnvPathFindingCallResult& Result); // [0x2fc63a0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFVoxelEnv.MFVoxelEnvComponent.FindLineOfSight
	// void FindLineOfSight(FVector& StartLocation, class AActor* TargetActor, float MinimumDistance, bool bCheckLineOfSight, FDelegateProperty OnComplete, EMFVoxelEnvFindLineOfSightCallResult& Result); // [0x2fc6190] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFVoxelEnv.MFVoxelEnvComponent.FindCoverMultipleOpponents
	// void FindCoverMultipleOpponents(FVector SearchOrigin, float MaxRadius, TArray<AActor*> Opponents, EMFVoxelEnvCoverSearchType SearchType, bool bPerformLineTraces, FDelegateProperty OnComplete, EMFVoxelEnvFindCoverCallResult& Result); // [0x2fc5e90] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFVoxelEnv.MFVoxelEnvComponent.FindCover
	// void FindCover(FVector SearchOrigin, float MaxRadius, class AActor* Opponent, EMFVoxelEnvCoverSearchType SearchType, bool bPerformLineTraces, FDelegateProperty OnComplete, EMFVoxelEnvFindCoverCallResult& Result); // [0x2fc5c30] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
};

/// Class /Script/MFVoxelEnv.MFVoxelEnvModifierVolume
/// Size: 0x0010 (16 bytes) (0x000318 - 0x000328) align 8 pad: 0x0000
class AMFVoxelEnvModifierVolume : public AVolume
{ 
public:
	float                                              PathCostModifier;                                           // 0x0318   (0x0004)  
	bool                                               bInvalidateCoverLocations;                                  // 0x031C   (0x0001)  
	bool                                               bEnabled;                                                   // 0x031D   (0x0001)  
	bool                                               bDisplayVolumeBounds;                                       // 0x031E   (0x0001)  
	bool                                               bDisplayOverlaps;                                           // 0x031F   (0x0001)  
	FColor                                             VolumeBoundsColour;                                         // 0x0320   (0x0004)  
	FColor                                             OverlapColour;                                              // 0x0324   (0x0004)  
};

/// Class /Script/MFVoxelEnv.MFVoxelEnvOcclusionComponent
/// Size: 0x00B8 (184 bytes) (0x0000F8 - 0x0001B0) align 16 pad: 0x0000
class UMFVoxelEnvOcclusionComponent : public UActorComponent
{ 
public:
	float                                              TransformTriggerTolerance;                                  // 0x00F8   (0x0004)  
	bool                                               bEnableCover;                                               // 0x00FC   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x00FD   (0x0003)  MISSED
	class AMFVoxelEnvVolume*                           Volume;                                                     // 0x0100   (0x0008)  
	unsigned char                                      UnknownData01_6[0x8];                                       // 0x0108   (0x0008)  MISSED
	FTransform                                         CachedTransform;                                            // 0x0110   (0x0030)  
	bool                                               bEnabled;                                                   // 0x0140   (0x0001)  
	unsigned char                                      UnknownData02_7[0x6F];                                      // 0x0141   (0x006F)  MISSED


	/// Functions
	// Function /Script/MFVoxelEnv.MFVoxelEnvOcclusionComponent.SetOcclusionEnabled
	// void SetOcclusionEnabled(bool bOcclusionEnabled);                                                                        // [0x2fc6a40] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFVoxelEnv.MFVoxelEnvVolume
/// Size: 0x0DA8 (3496 bytes) (0x000318 - 0x0010C0) align 8 pad: 0x0000
class AMFVoxelEnvVolume : public AVolume
{ 
public:
	float                                              VolumeSize;                                                 // 0x0318   (0x0004)  
	float                                              VoxelSize;                                                  // 0x031C   (0x0004)  
	TEnumAsByte<ECollisionChannel>                     CollisionChannel;                                           // 0x0320   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0321   (0x0003)  MISSED
	float                                              Clearance;                                                  // 0x0324   (0x0004)  
	float                                              TickInterval;                                               // 0x0328   (0x0004)  
	bool                                               bEnableCoverMap;                                            // 0x032C   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x032D   (0x0003)  MISSED
	float                                              MinimumObjectRadius;                                        // 0x0330   (0x0004)  
	float                                              MinimumDensity;                                             // 0x0334   (0x0004)  
	float                                              DebugDistance;                                              // 0x0338   (0x0004)  
	bool                                               bDisplayVolumeBounds;                                       // 0x033C   (0x0001)  
	unsigned char                                      UnknownData02_6[0x3];                                       // 0x033D   (0x0003)  MISSED
	FColor                                             VolumeBoundsColour;                                         // 0x0340   (0x0004)  
	bool                                               bDisplayLayers;                                             // 0x0344   (0x0001)  
	bool                                               bDisplayLeafs;                                              // 0x0345   (0x0001)  
	bool                                               bDisplayWalkable;                                           // 0x0346   (0x0001)  
	bool                                               bDisplayLeafOcclusion;                                      // 0x0347   (0x0001)  
	bool                                               bDisplayEdgeAdjacency;                                      // 0x0348   (0x0001)  
	bool                                               bDisplayCustomVoxel;                                        // 0x0349   (0x0001)  
	unsigned char                                      UnknownData03_6[0x2];                                       // 0x034A   (0x0002)  MISSED
	float                                              LineScale;                                                  // 0x034C   (0x0004)  
	TArray<FColor>                                     LayerColours;                                               // 0x0350   (0x0010)  
	FColor                                             LeafOcclusionColour;                                        // 0x0360   (0x0004)  
	bool                                               bDisplayMortonCodes;                                        // 0x0364   (0x0001)  
	unsigned char                                      UnknownData04_6[0x3];                                       // 0x0365   (0x0003)  MISSED
	FColor                                             MortonCodeColour;                                           // 0x0368   (0x0004)  
	float                                              MortonCodeScale;                                            // 0x036C   (0x0004)  
	bool                                               bDisplayCoverMap;                                           // 0x0370   (0x0001)  
	unsigned char                                      UnknownData05_6[0x3];                                       // 0x0371   (0x0003)  MISSED
	int32_t                                            VoxelExponent;                                              // 0x0374   (0x0004)  
	float                                              ActualVolumeSize;                                           // 0x0378   (0x0004)  
	char                                               NumLayers;                                                  // 0x037C   (0x0001)  
	unsigned char                                      UnknownData06_6[0x3];                                       // 0x037D   (0x0003)  MISSED
	int32_t                                            NumBytes;                                                   // 0x0380   (0x0004)  
	unsigned char                                      UnknownData07_6[0xBC];                                      // 0x0384   (0x00BC)  MISSED
	TArray<class UMFVoxelEnvOcclusionComponent*>       OcclusionComponents;                                        // 0x0440   (0x0010)  
	TArray<class AMFVoxelEnvModifierVolume*>           ModifierVolumes;                                            // 0x0450   (0x0010)  
	unsigned char                                      UnknownData08_6[0x410];                                     // 0x0460   (0x0410)  MISSED
	float                                              MFVoxelEnvAgentHeight;                                      // 0x0870   (0x0004)  
	float                                              DampingUpdateInterval;                                      // 0x0874   (0x0004)  
	unsigned char                                      UnknownData09_6[0x4];                                       // 0x0878   (0x0004)  MISSED
	uint16_t                                           NodeWeightUpdaterDampingTimestamp;                          // 0x087C   (0x0002)  
	uint16_t                                           NodeUpdaterExpireTimestamp;                                 // 0x087E   (0x0002)  
	bool                                               bEnableRuntimeDebugShow;                                    // 0x0880   (0x0001)  
	unsigned char                                      UnknownData10_6[0x3];                                       // 0x0881   (0x0003)  MISSED
	float                                              RuntimeDebugShowInterval;                                   // 0x0884   (0x0004)  
	unsigned char                                      UnknownData11_6[0x8];                                       // 0x0888   (0x0008)  MISSED
	class UNavigationSystemV1*                         CachedNavSys;                                               // 0x0890   (0x0008)  
	unsigned char                                      UnknownData12_6[0x818];                                     // 0x0898   (0x0818)  MISSED
	TArray<class UClass*>                              WalkableIgnoreClassList;                                    // 0x10B0   (0x0010)  


	/// Functions
	// Function /Script/MFVoxelEnv.MFVoxelEnvVolume.UpdateTaskComplete
	// void UpdateTaskComplete();                                                                                               // [0x2fc6be0] Final|Native|Public  
	// Function /Script/MFVoxelEnv.MFVoxelEnvVolume.UnregisterWeightActorUpdateInfo
	// void UnregisterWeightActorUpdateInfo(class AActor* InUpdateOwner, char InGroupID, char InSourceID);                      // [0x2fc6ad0] Final|Native|Private|BlueprintCallable 
	// Function /Script/MFVoxelEnv.MFVoxelEnvVolume.ShowWalkableVoxcel
	// void ShowWalkableVoxcel();                                                                                               // [0xd906a0] Final|Native|Private|BlueprintCallable 
	// Function /Script/MFVoxelEnv.MFVoxelEnvVolume.ShowOctreeVoxel
	// void ShowOctreeVoxel();                                                                                                  // [0xd906a0] Final|Native|Private|BlueprintCallable 
	// Function /Script/MFVoxelEnv.MFVoxelEnvVolume.ShowAdjWaklableVoxel
	// void ShowAdjWaklableVoxel();                                                                                             // [0xd906a0] Final|Native|Private|BlueprintCallable 
	// Function /Script/MFVoxelEnv.MFVoxelEnvVolume.RegisterWeightActorUpdateInfo
	// void RegisterWeightActorUpdateInfo(float InUpdateInterval, class AActor* InUpdateOwner, char InGroupID, char InSourceID, float InDampingValue, float InRadius, float InCenterWeight); // [0x2fc6820] Final|Native|Private|BlueprintCallable 
	// Function /Script/MFVoxelEnv.MFVoxelEnvVolume.OnActorDestroyed
	// void OnActorDestroyed(class AActor* DestroyedActor);                                                                     // [0x2fc6790] Final|Native|Private 
	// Function /Script/MFVoxelEnv.MFVoxelEnvVolume.ClearShowOctreeVoxel
	// void ClearShowOctreeVoxel();                                                                                             // [0x2fc5c10] Final|Native|Private|BlueprintCallable 
	// Function /Script/MFVoxelEnv.MFVoxelEnvVolume.ClearAllNodeWeight
	// void ClearAllNodeWeight();                                                                                               // [0x2fc5c10] Final|Native|Private|BlueprintCallable 
	// Function /Script/MFVoxelEnv.MFVoxelEnvVolume.AddNodeWeight
	// void AddNodeWeight(FVector StartLoc, char GroupID, char SourceID, char Weight, float Radius);                            // [0x2fc5a50] Final|Native|Private|HasDefaults|BlueprintCallable 
};

/// Struct /Script/MFVoxelEnv.MFVoxelEnvCoverLocation
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 8 pad: 0x0000
struct FMFVoxelEnvCoverLocation
{ 
	class AActor*                                      Actor;                                                      // 0x0000   (0x0008)  
	FVector                                            Location;                                                   // 0x0008   (0x000C)  
	FVector                                            Normal;                                                     // 0x0014   (0x000C)  
};

/// Struct /Script/MFVoxelEnv.MFVoxelEnvPathPointFindingConfig
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 4 pad: 0x0000
struct FMFVoxelEnvPathPointFindingConfig
{ 
	float                                              EstimateWeight;                                             // 0x0000   (0x0004)  
	float                                              NodeSizePreference;                                         // 0x0004   (0x0004)  
	EMFVoxelEnvHeuristic                               Heuristic;                                                  // 0x0008   (0x0001)  
	EMFVoxelEnvPathPruning                             PathPruning;                                                // 0x0009   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x000A   (0x0002)  MISSED
	int32_t                                            PathSmoothing;                                              // 0x000C   (0x0004)  
};

/// Struct /Script/MFVoxelEnv.MFVoxelEnvDebugLocation
/// Size: 0x0014 (20 bytes) (0x000000 - 0x000014) align 4 pad: 0x0000
struct FMFVoxelEnvDebugLocation
{ 
	FVector                                            Location;                                                   // 0x0000   (0x000C)  
	FColor                                             Colour;                                                     // 0x000C   (0x0004)  
	float                                              LineScale;                                                  // 0x0010   (0x0004)  
};

/// Struct /Script/MFVoxelEnv.MFVoxelEnvDebugPath
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FMFVoxelEnvDebugPath
{ 
	TArray<FVector>                                    Points;                                                     // 0x0000   (0x0010)  
	FColor                                             Colour;                                                     // 0x0010   (0x0004)  
	float                                              LineScale;                                                  // 0x0014   (0x0004)  
};

/// Struct /Script/MFVoxelEnv.MFVoxelEnvPathPoint
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 4 pad: 0x0000
struct FMFVoxelEnvPathPoint
{ 
	FVector                                            Location;                                                   // 0x0000   (0x000C)  
	int32_t                                            Layer;                                                      // 0x000C   (0x0004)  
};

/// Struct /Script/MFVoxelEnv.MFVoxelEnvPath
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FMFVoxelEnvPath
{ 
	TArray<FMFVoxelEnvPathPoint>                       Points;                                                     // 0x0000   (0x0010)  
};

static_assert(sizeof(UEnvQueryTest_NodeWeight) == 0x0200); // 512 bytes (0x0001F8 - 0x000200)
static_assert(sizeof(UMFVoxelEnvComponent) == 0x0138); // 312 bytes (0x0000F8 - 0x000138)
static_assert(sizeof(AMFVoxelEnvModifierVolume) == 0x0328); // 808 bytes (0x000318 - 0x000328)
static_assert(sizeof(UMFVoxelEnvOcclusionComponent) == 0x01B0); // 432 bytes (0x0000F8 - 0x0001B0)
static_assert(sizeof(AMFVoxelEnvVolume) == 0x10C0); // 4288 bytes (0x000318 - 0x0010C0)
static_assert(sizeof(FMFVoxelEnvCoverLocation) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(FMFVoxelEnvPathPointFindingConfig) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FMFVoxelEnvDebugLocation) == 0x0014); // 20 bytes (0x000000 - 0x000014)
static_assert(sizeof(FMFVoxelEnvDebugPath) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FMFVoxelEnvPathPoint) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FMFVoxelEnvPath) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(offsetof(UMFVoxelEnvComponent, Heuristic) == 0x00F8);
static_assert(offsetof(UMFVoxelEnvComponent, PathPruning) == 0x0104);
static_assert(offsetof(UMFVoxelEnvComponent, Volume) == 0x0130);
static_assert(offsetof(AMFVoxelEnvModifierVolume, VolumeBoundsColour) == 0x0320);
static_assert(offsetof(AMFVoxelEnvModifierVolume, OverlapColour) == 0x0324);
static_assert(offsetof(UMFVoxelEnvOcclusionComponent, Volume) == 0x0100);
static_assert(offsetof(UMFVoxelEnvOcclusionComponent, CachedTransform) == 0x0110);
static_assert(offsetof(AMFVoxelEnvVolume, CollisionChannel) == 0x0320);
static_assert(offsetof(AMFVoxelEnvVolume, VolumeBoundsColour) == 0x0340);
static_assert(offsetof(AMFVoxelEnvVolume, LayerColours) == 0x0350);
static_assert(offsetof(AMFVoxelEnvVolume, LeafOcclusionColour) == 0x0360);
static_assert(offsetof(AMFVoxelEnvVolume, MortonCodeColour) == 0x0368);
static_assert(offsetof(AMFVoxelEnvVolume, OcclusionComponents) == 0x0440);
static_assert(offsetof(AMFVoxelEnvVolume, ModifierVolumes) == 0x0450);
static_assert(offsetof(AMFVoxelEnvVolume, CachedNavSys) == 0x0890);
static_assert(offsetof(AMFVoxelEnvVolume, WalkableIgnoreClassList) == 0x10B0);
static_assert(offsetof(FMFVoxelEnvCoverLocation, Actor) == 0x0000);
static_assert(offsetof(FMFVoxelEnvCoverLocation, Location) == 0x0008);
static_assert(offsetof(FMFVoxelEnvCoverLocation, Normal) == 0x0014);
static_assert(offsetof(FMFVoxelEnvPathPointFindingConfig, Heuristic) == 0x0008);
static_assert(offsetof(FMFVoxelEnvPathPointFindingConfig, PathPruning) == 0x0009);
static_assert(offsetof(FMFVoxelEnvDebugLocation, Location) == 0x0000);
static_assert(offsetof(FMFVoxelEnvDebugLocation, Colour) == 0x000C);
static_assert(offsetof(FMFVoxelEnvDebugPath, Points) == 0x0000);
static_assert(offsetof(FMFVoxelEnvDebugPath, Colour) == 0x0010);
static_assert(offsetof(FMFVoxelEnvPathPoint, Location) == 0x0000);
static_assert(offsetof(FMFVoxelEnvPath, Points) == 0x0000);
