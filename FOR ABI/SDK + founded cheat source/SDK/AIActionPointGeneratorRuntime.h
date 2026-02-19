
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

/// Enum /Script/AIActionPointGeneratorRuntime.EActionPointType
/// Size: 0x01 (1 bytes)
enum class EActionPointType : uint8_t
{
	EActionPointType__None                                                           = 0,
	EActionPointType__CoverPoint                                                     = 1,
	EActionPointType__TacticPoint                                                    = 2,
	EActionPointType__KeyRoutePoint                                                  = 3,
	EActionPointType__NavSkeletonPoint                                               = 4
};

/// Enum /Script/AIActionPointGeneratorRuntime.ETakeCoverResult
/// Size: 0x01 (1 bytes)
enum class ETakeCoverResult : uint8_t
{
	ETakeCoverResult__InvalidActor                                                   = 0,
	ETakeCoverResult__AlreadyNull                                                    = 1,
	ETakeCoverResult__Occupied                                                       = 2,
	ETakeCoverResult__OtherUsing                                                     = 3,
	ETakeCoverResult__SelfUsing                                                      = 4,
	ETakeCoverResult__Released                                                       = 5,
	ETakeCoverResult__COUNT                                                          = 6
};

/// Enum /Script/AIActionPointGeneratorRuntime.ENavMeshEdgeDropReason
/// Size: 0x01 (1 bytes)
enum class ENavMeshEdgeDropReason : uint8_t
{
	ENavMeshEdgeDropReason__None                                                     = 0,
	ENavMeshEdgeDropReason__LengthTooShort                                           = 1,
	ENavMeshEdgeDropReason__InvalidHoleSide                                          = 2,
	ENavMeshEdgeDropReason__InvalidMovableRange                                      = 3,
	ENavMeshEdgeDropReason__SetupDefenceMapFailed                                    = 4,
	ENavMeshEdgeDropReason__NoAnyDefenceRegionFastTest                               = 5,
	ENavMeshEdgeDropReason__NoAnyDefenceRegion                                       = 6,
	ENavMeshEdgeDropReason__Count                                                    = 7
};

/// Enum /Script/AIActionPointGeneratorRuntime.ENavMeshTacticPointDropReason
/// Size: 0x01 (1 bytes)
enum class ENavMeshTacticPointDropReason : uint8_t
{
	ENavMeshTacticPointDropReason__None                                              = 0,
	ENavMeshTacticPointDropReason__InExclusionVolume                                 = 1,
	ENavMeshTacticPointDropReason__AbsoluteDefenceRatioNotEnough                     = 2,
	ENavMeshTacticPointDropReason__WindowDefenceRatioNotEnough                       = 3,
	ENavMeshTacticPointDropReason__LessThanRequiredMinimumDefenceAngle               = 4,
	ENavMeshTacticPointDropReason__GreaterThanLimitedMaximumDefenceAngle             = 5,
	ENavMeshTacticPointDropReason__DefenceDirectionNotInHoleSide                     = 6,
	ENavMeshTacticPointDropReason__PointsTooClose                                    = 7,
	ENavMeshTacticPointDropReason__Count                                             = 8
};

/// Enum /Script/AIActionPointGeneratorRuntime.ENPCPoseType
/// Size: 0x01 (1 bytes)
enum class ENPCPoseType : uint8_t
{
	ENPCPoseType__Invalid                                                            = 0,
	ENPCPoseType__Prone                                                              = 1,
	ENPCPoseType__Crouch                                                             = 2,
	ENPCPoseType__Stand                                                              = 3
};

/// Enum /Script/AIActionPointGeneratorRuntime.ETacticPointType
/// Size: 0x01 (1 bytes)
enum class ETacticPointType : uint8_t
{
	ETacticPointType__NONE                                                           = 0,
	ETacticPointType__FlashBag                                                       = 1,
	ETacticPointType__Smoke                                                          = 2,
	ETacticPointType__HighValue                                                      = 3,
	ETacticPointType__FatalGate                                                      = 4,
	ETacticPointType__Escape                                                         = 5,
	ETacticPointType__Trap                                                           = 6,
	ETacticPointType__OverWatch                                                      = 7,
	ETacticPointType__Prone                                                          = 8,
	ETacticPointType__Window                                                         = 9,
	ETacticPointType__Door                                                           = 10,
	ETacticPointType__Retreat                                                        = 11,
	ETacticPointType__Transfer                                                       = 12,
	ETacticPointType__DoorSafety                                                     = 13
};

/// Class /Script/AIActionPointGeneratorRuntime.ActionPointEditorActor
/// Size: 0x0028 (40 bytes) (0x0002E0 - 0x000308) align 8 pad: 0x0000
class AActionPointEditorActor : public AActor
{ 
public:
	EActionPointType                                   ActionPointType;                                            // 0x02E0   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x02E1   (0x0003)  MISSED
	float                                              ProjectDistanceOfNavigationMesh;                            // 0x02E4   (0x0004)  
	class USceneComponent*                             DRootComponent;                                             // 0x02E8   (0x0008)  
	class UPrimitiveComponent*                         SpotComponent;                                              // 0x02F0   (0x0008)  
	class UPrimitiveComponent*                         WarnComponent;                                              // 0x02F8   (0x0008)  
	class UArrowComponent*                             ArrowComponent;                                             // 0x0300   (0x0008)  
};

/// Class /Script/AIActionPointGeneratorRuntime.ActionPointSystemActor
/// Size: 0x0058 (88 bytes) (0x0002E0 - 0x000338) align 8 pad: 0x0000
class AActionPointSystemActor : public AActor
{ 
public:
	SDK_UNDEFINED(80,383) /* TMap<int64_t, float> */   __um(PointToOtherNavPathLengths);                           // 0x02E0   (0x0050)  
	float                                              MAX_NAV_PATH_DISTANCE;                                      // 0x0330   (0x0004)  
	int32_t                                            PointToOtherNavPathLengthsCount;                            // 0x0334   (0x0004)  
};

/// Struct /Script/AIActionPointGeneratorRuntime.ActionPointData
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 4 pad: 0x0000
struct FActionPointData
{ 
	int32_t                                            UniqueIndex;                                                // 0x0000   (0x0004)  
	FVector                                            Location;                                                   // 0x0004   (0x000C)  
};

/// Struct /Script/AIActionPointGeneratorRuntime.TacticPointGuardTargetAndDirection
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 4 pad: 0x0000
struct FTacticPointGuardTargetAndDirection
{ 
	FVector                                            Location;                                                   // 0x0000   (0x000C)  
	FRotator                                           Direction;                                                  // 0x000C   (0x000C)  
};

/// Struct /Script/AIActionPointGeneratorRuntime.ActionPointRadianSafe
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 4 pad: 0x0000
struct FActionPointRadianSafe
{ 
	float                                              Radian;                                                     // 0x0000   (0x0004)  
	float                                              CoverDistance;                                              // 0x0004   (0x0004)  
};

/// Struct /Script/AIActionPointGeneratorRuntime.TacticPointData
/// Size: 0x0060 (96 bytes) (0x000010 - 0x000070) align 8 pad: 0x0000
struct FTacticPointData : FActionPointData
{ 
	ETacticPointType                                   TacticPointType;                                            // 0x0010   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0011   (0x0003)  MISSED
	int32_t                                            PointID;                                                    // 0x0014   (0x0004)  
	float                                              Interval;                                                   // 0x0018   (0x0004)  
	bool                                               AlwaysActivated;                                            // 0x001C   (0x0001)  
	bool                                               ShouldCrouch;                                               // 0x001D   (0x0001)  
	unsigned char                                      UnknownData01_6[0x2];                                       // 0x001E   (0x0002)  MISSED
	TArray<FTacticPointGuardTargetAndDirection>        GuardTargetAndDirections;                                   // 0x0020   (0x0010)  
	bool                                               FieldTrace;                                                 // 0x0030   (0x0001)  
	unsigned char                                      UnknownData02_6[0x3];                                       // 0x0031   (0x0003)  MISSED
	float                                              Radius;                                                     // 0x0034   (0x0004)  
	bool                                               bCustomized : 1;                                            // 0x0038:0 (0x0001)  
	unsigned char                                      UnknownData03_5[0x3];                                       // 0x0039   (0x0003)  MISSED
	uint32_t                                           ActorID;                                                    // 0x003C   (0x0004)  
	int8_t                                             IndRelatedToActor;                                          // 0x0040   (0x0001)  
	unsigned char                                      UnknownData04_6[0x3];                                       // 0x0041   (0x0003)  MISSED
	float                                              CustomValue;                                                // 0x0044   (0x0004)  
	FVector                                            CustomVector;                                               // 0x0048   (0x000C)  
	FRotator                                           Rotation;                                                   // 0x0054   (0x000C)  
	TArray<FActionPointRadianSafe>                     OrientSafetys;                                              // 0x0060   (0x0010)  
};

/// Class /Script/AIActionPointGeneratorRuntime.BPTacticPointEditorActor
/// Size: 0x0080 (128 bytes) (0x0002E0 - 0x000360) align 8 pad: 0x0000
class ABPTacticPointEditorActor : public AActor
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x02E0   (0x0008)  MISSED
	int32_t                                            BPTacticType;                                               // 0x02E8   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x02EC   (0x0004)  MISSED
	FTacticPointData                                   PointData;                                                  // 0x02F0   (0x0070)  


	/// Functions
	// Function /Script/AIActionPointGeneratorRuntime.BPTacticPointEditorActor.CheckActivationCPlus
	// bool CheckActivationCPlus(class AActor* ThreatTarget, FVector ThreatTargetLoc, bool bOccupied, FRotator& AimRot);        // [0x2e3bf80] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
};

/// Class /Script/AIActionPointGeneratorRuntime.ChangeNotifyingRecastNavMesh
/// Size: 0x0108 (264 bytes) (0x000598 - 0x0006A0) align 8 pad: 0x0000
class AChangeNotifyingRecastNavMesh : public ARecastNavMesh
{ 
public:
	unsigned char                                      UnknownData00_3[0xD8];                                      // 0x0598   (0x00D8)  MISSED
	SDK_UNDEFINED(16,384) /* FMulticastInlineDelegate */ __um(NavmeshTilesUpdatedImmediateDelegate);               // 0x0670   (0x0010)  
	SDK_UNDEFINED(16,385) /* FMulticastInlineDelegate */ __um(NavmeshTilesUpdatedBufferedDelegate);                // 0x0680   (0x0010)  
	SDK_UNDEFINED(16,386) /* FMulticastInlineDelegate */ __um(NavmeshTilesUpdatedUntilFinishedDelegate);           // 0x0690   (0x0010)  


	/// Functions
	// Function /Script/AIActionPointGeneratorRuntime.ChangeNotifyingRecastNavMesh.ProcessQueuedTiles
	// void ProcessQueuedTiles();                                                                                               // [0x2e3c3a0] Final|Native|Public  
	// Function /Script/AIActionPointGeneratorRuntime.ChangeNotifyingRecastNavMesh.OnNavmeshGenerationFinishedHandler
	// void OnNavmeshGenerationFinishedHandler(class ANavigationData* NavData);                                                 // [0x2e3c310] Final|Native|Public  
};

/// Struct /Script/AIActionPointGeneratorRuntime.DebugPoint
/// Size: 0x0014 (20 bytes) (0x000000 - 0x000014) align 4 pad: 0x0000
struct FDebugPoint
{ 
	FVector                                            Location;                                                   // 0x0000   (0x000C)  
	FColor                                             Color;                                                      // 0x000C   (0x0004)  
	bool                                               bGenericOrUnitDebugData;                                    // 0x0010   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x0011   (0x0003)  MISSED
};

/// Struct /Script/AIActionPointGeneratorRuntime.DebugArrow
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 4 pad: 0x0000
struct FDebugArrow
{ 
	FVector                                            Start;                                                      // 0x0000   (0x000C)  
	FVector                                            End;                                                        // 0x000C   (0x000C)  
	FColor                                             Color;                                                      // 0x0018   (0x0004)  
	bool                                               bGenericOrUnitDebugData;                                    // 0x001C   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x001D   (0x0003)  MISSED
};

/// Class /Script/AIActionPointGeneratorRuntime.CoverFinderVisData
/// Size: 0x0020 (32 bytes) (0x000028 - 0x000048) align 8 pad: 0x0000
class UCoverFinderVisData : public UObject
{ 
public:
	TArray<FDebugPoint>                                DebugPoints;                                                // 0x0028   (0x0010)  
	TArray<FDebugArrow>                                DebugArrows;                                                // 0x0038   (0x0010)  
};

/// Class /Script/AIActionPointGeneratorRuntime.CoverFinderVisualizerService
/// Size: 0x0020 (32 bytes) (0x000070 - 0x000090) align 8 pad: 0x0000
class UCoverFinderVisualizerService : public UBTService
{ 
public:
	unsigned char                                      UnknownData00_1[0x20];                                      // 0x0070   (0x0020)  MISSED
};

/// Class /Script/AIActionPointGeneratorRuntime.CoverPointEditorActor
/// Size: 0x0000 (0 bytes) (0x000308 - 0x000308) align 8 pad: 0x0000
class ACoverPointEditorActor : public AActionPointEditorActor
{ 
public:
};

/// Class /Script/AIActionPointGeneratorRuntime.CoverPointGeneratorStatics
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UCoverPointGeneratorStatics : public UBlueprintFunctionLibrary
{ 
public:
};

/// Class /Script/AIActionPointGeneratorRuntime.CoverPointRenderingComponent
/// Size: 0x0008 (8 bytes) (0x0005D8 - 0x0005E0) align 16 pad: 0x0000
class UCoverPointRenderingComponent : public UPrimitiveComponent
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x05D8   (0x0008)  MISSED
};

/// Struct /Script/AIActionPointGeneratorRuntime.NavMeshEdgeCoverDataEditor
/// Size: 0x0001 (1 bytes) (0x000000 - 0x000001) align 1 pad: 0x0000
struct FNavMeshEdgeCoverDataEditor
{ 
	unsigned char                                      UnknownData00_2[0x1];                                       // 0x0000   (0x0001)  MISSED
};

/// Struct /Script/AIActionPointGeneratorRuntime.DTOCoverDataEditor
/// Size: 0x0001 (1 bytes) (0x000000 - 0x000001) align 1 pad: 0x0000
struct FDTOCoverDataEditor
{ 
	unsigned char                                      UnknownData00_2[0x1];                                       // 0x0000   (0x0001)  MISSED
};

/// Class /Script/AIActionPointGeneratorRuntime.CoverPointTestingActor
/// Size: 0x01E0 (480 bytes) (0x0002E0 - 0x0004C0) align 8 pad: 0x0000
class ACoverPointTestingActor : public AActor
{ 
public:
	class UCapsuleComponent*                           CapsuleComponent;                                           // 0x02E0   (0x0008)  
	class ACoverSystemActor*                           GeneratorActor;                                             // 0x02E8   (0x0008)  
	unsigned char                                      UnknownData00_6[0x78];                                      // 0x02F0   (0x0078)  MISSED
	FNavAgentProperties                                NavAgentProps;                                              // 0x0368   (0x0030)  
	FVector                                            QueryingExtent;                                             // 0x0398   (0x000C)  
	float                                              GroundOffset;                                               // 0x03A4   (0x0004)  
	float                                              EndPointSize;                                               // 0x03A8   (0x0004)  
	float                                              EdgeThickness;                                              // 0x03AC   (0x0004)  
	float                                              CoverPointSize;                                             // 0x03B0   (0x0004)  
	bool                                               bDrawCoverPoint : 1;                                        // 0x03B4:0 (0x0001)  
	bool                                               bDrawDefenceMap : 1;                                        // 0x03B4:1 (0x0001)  
	bool                                               bDrawDefenceWall : 1;                                       // 0x03B4:2 (0x0001)  
	bool                                               bDrawDefenceAngle : 1;                                      // 0x03B4:3 (0x0001)  
	bool                                               bDrawFireTrace : 1;                                         // 0x03B4:4 (0x0001)  
	bool                                               bEdgeChanged;                                               // 0x03B5   (0x0001)  
	unsigned char                                      UnknownData01_6[0x2];                                       // 0x03B6   (0x0002)  MISSED
	class AActor*                                      TargetActor;                                                // 0x03B8   (0x0008)  
	unsigned char                                      UnknownData02_6[0x70];                                      // 0x03C0   (0x0070)  MISSED
	FNavMeshEdgeCoverDataEditor                        EdgeDataEditor;                                             // 0x0430   (0x0001)  
	unsigned char                                      UnknownData03_6[0x67];                                      // 0x0431   (0x0067)  MISSED
	FDTOCoverDataEditor                                PointDataEditor;                                            // 0x0498   (0x0001)  
	unsigned char                                      UnknownData04_6[0x3];                                       // 0x0499   (0x0003)  MISSED
	FVector                                            SincePoint;                                                 // 0x049C   (0x000C)  
	FVector                                            UntilPoint;                                                 // 0x04A8   (0x000C)  
	float                                              SegmentRatio;                                               // 0x04B4   (0x0004)  
	float                                              SegmentLength;                                              // 0x04B8   (0x0004)  
	unsigned char                                      UnknownData05_7[0x4];                                       // 0x04BC   (0x0004)  MISSED
};

/// Class /Script/AIActionPointGeneratorRuntime.CoverPointExclusionVolume
/// Size: 0x0000 (0 bytes) (0x000318 - 0x000318) align 8 pad: 0x0000
class ACoverPointExclusionVolume : public AVolume
{ 
public:
};

/// Class /Script/AIActionPointGeneratorRuntime.CoverSystem
/// Size: 0x0180 (384 bytes) (0x000028 - 0x0001A8) align 8 pad: 0x0000
class UCoverSystem : public UBlueprintFunctionLibrary
{ 
public:
	unsigned char                                      UnknownData00_3[0x70];                                      // 0x0028   (0x0070)  MISSED
	SDK_UNDEFINED(80,387) /* TMap<int32_t, FCoverPointRuntimeInfo> */ __um(CoverPointRuntimeInfoMap);              // 0x0098   (0x0050)  
	SDK_UNDEFINED(80,388) /* TMap<TWeakObjectPtr<AActor*>, FTakeCoverPointIDListInfo> */ __um(ActorTakeCoverPointMap); // 0x00E8   (0x0050)  
	unsigned char                                      UnknownData01_6[0x50];                                      // 0x0138   (0x0050)  MISSED
	class AChangeNotifyingRecastNavMesh*               NavMesh;                                                    // 0x0188   (0x0008)  
	unsigned char                                      UnknownData02_6[0x1];                                       // 0x0190   (0x0001)  MISSED
	bool                                               bDebugDraw;                                                 // 0x0191   (0x0001)  
	unsigned char                                      UnknownData03_6[0x6];                                       // 0x0192   (0x0006)  MISSED
	class ACoverSystemActor*                           CoverPointGenerator;                                        // 0x0198   (0x0008)  
	class ATacticSystemActor*                          TacticPointGenerator;                                       // 0x01A0   (0x0008)  


	/// Functions
	// Function /Script/AIActionPointGeneratorRuntime.CoverSystem.RemoveStaleCoverPoints
	// void RemoveStaleCoverPoints(FVector Origin, FVector Extent);                                                             // [0x2e3c470] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/AIActionPointGeneratorRuntime.CoverSystem.RemoveCoverPointsOfObject
	// void RemoveCoverPointsOfObject(class AActor* CoverObject);                                                               // [0x2e3c3e0] Final|Native|Public|BlueprintCallable 
	// Function /Script/AIActionPointGeneratorRuntime.CoverSystem.RemoveAll
	// void RemoveAll();                                                                                                        // [0x2e3c3c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/AIActionPointGeneratorRuntime.CoverSystem.OnNavMeshTilesUpdated
	// void OnNavMeshTilesUpdated(TSet<uint32_t>& UpdatedTiles);                                                                // [0x2e3c1d0] Final|Native|Public|HasOutParms 
	// Function /Script/AIActionPointGeneratorRuntime.CoverSystem.OnBeginPlay
	// void OnBeginPlay();                                                                                                      // [0x2e3c1b0] Final|Native|Private 
	// Function /Script/AIActionPointGeneratorRuntime.CoverSystem.NotifyCoverActorDied
	// void NotifyCoverActorDied(class AActor* InCheckActor);                                                                   // [0x2e3c120] Final|Native|Public|BlueprintCallable 
};

/// Struct /Script/AIActionPointGeneratorRuntime.CoverPoseData
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 4 pad: 0x0000
struct FCoverPoseData
{ 
	ENPCPoseType                                       PoseType;                                                   // 0x0000   (0x0001)  
	bool                                               bLShootable : 1;                                            // 0x0001:0 (0x0001)  
	bool                                               bRShootable : 1;                                            // 0x0001:1 (0x0001)  
	bool                                               bMShootable : 1;                                            // 0x0001:2 (0x0001)  
	unsigned char                                      UnknownData00_5[0x2];                                       // 0x0002   (0x0002)  MISSED
	FVector                                            Location;                                                   // 0x0004   (0x000C)  
	FVector                                            Direction;                                                  // 0x0010   (0x000C)  
	float                                              DefenceRatio;                                               // 0x001C   (0x0004)  
	float                                              LDefenceAngle;                                              // 0x0020   (0x0004)  
	float                                              RDefenceAngle;                                              // 0x0024   (0x0004)  
};

/// Struct /Script/AIActionPointGeneratorRuntime.DTOCoverData
/// Size: 0x0040 (64 bytes) (0x000010 - 0x000050) align 8 pad: 0x0000
struct FDTOCoverData : FActionPointData
{ 
	uint64_t                                           NavPolyRef;                                                 // 0x0010   (0x0008)  
	int32_t                                            EdgeIndex;                                                  // 0x0018   (0x0004)  
	bool                                               bCustomized : 1;                                            // 0x001C:0 (0x0001)  
	bool                                               bMarked : 1;                                                // 0x001C:1 (0x0001)  
	bool                                               bAddable : 1;                                               // 0x001C:2 (0x0001)  
	bool                                               bLMovable : 1;                                              // 0x001C:3 (0x0001)  
	bool                                               bRMovable : 1;                                              // 0x001C:4 (0x0001)  
	unsigned char                                      UnknownData00_5[0x3];                                       // 0x001D   (0x0003)  MISSED
	float                                              BaseWeight;                                                 // 0x0020   (0x0004)  
	FRotator                                           Rotation;                                                   // 0x0024   (0x000C)  
	FVector                                            RightDir;                                                   // 0x0030   (0x000C)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x003C   (0x0004)  MISSED
	TArray<FCoverPoseData>                             PoseData;                                                   // 0x0040   (0x0010)  
};

/// Struct /Script/AIActionPointGeneratorRuntime.NavMeshCoverPointPoseSamplingConfig
/// Size: 0x001C (28 bytes) (0x000000 - 0x00001C) align 4 pad: 0x0000
struct FNavMeshCoverPointPoseSamplingConfig
{ 
	ENPCPoseType                                       PoseType;                                                   // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	float                                              DefenceHeight;                                              // 0x0004   (0x0004)  
	float                                              DefenceRatio;                                               // 0x0008   (0x0004)  
	float                                              FireHeight;                                                 // 0x000C   (0x0004)  
	float                                              RequiredMinimumDefenceAngle;                                // 0x0010   (0x0004)  
	float                                              LimitedMaximumDefenceAngle;                                 // 0x0014   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x0018   (0x0004)  MISSED
};

/// Class /Script/AIActionPointGeneratorRuntime.CoverSystemActor
/// Size: 0x01B0 (432 bytes) (0x000338 - 0x0004E8) align 8 pad: 0x0000
class ACoverSystemActor : public AActionPointSystemActor
{ 
public:
	class UCoverSystem*                                CoverSystem;                                                // 0x0338   (0x0008)  
	TArray<FDTOCoverData>                              RawCoverPoints;                                             // 0x0340   (0x0010)  
	unsigned char                                      UnknownData00_6[0xF8];                                      // 0x0350   (0x00F8)  MISSED
	int32_t                                            GeneratorVersion;                                           // 0x0448   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x044C   (0x0004)  MISSED
	TArray<FNavMeshCoverPointPoseSamplingConfig>       PoseSamplingConfigs;                                        // 0x0450   (0x0010)  
	bool                                               bTestEndpointMovable;                                       // 0x0460   (0x0001)  
	bool                                               bTraceComplex;                                              // 0x0461   (0x0001)  
	TEnumAsByte<ECollisionChannel>                     TraceChannel;                                               // 0x0462   (0x0001)  
	unsigned char                                      UnknownData02_6[0x5];                                       // 0x0463   (0x0005)  MISSED
	TArray<FString>                                    RejectedActorNames;                                         // 0x0468   (0x0010)  
	TArray<class AVolume*>                             ExclusionVolumes;                                           // 0x0478   (0x0010)  
	float                                              GeneratableEdgeMinLength;                                   // 0x0488   (0x0004)  
	float                                              HoleTestOffset;                                             // 0x048C   (0x0004)  
	float                                              SamplingHeight;                                             // 0x0490   (0x0004)  
	float                                              SamplingWidth;                                              // 0x0494   (0x0004)  
	float                                              HalfAbsoluteWidth;                                          // 0x0498   (0x0004)  
	float                                              HalfShoulderWidth;                                          // 0x049C   (0x0004)  
	float                                              ScanStep;                                                   // 0x04A0   (0x0004)  
	float                                              ScanReach;                                                  // 0x04A4   (0x0004)  
	float                                              CoverPointMinDistance;                                      // 0x04A8   (0x0004)  
	float                                              CoverPointGroundOffset;                                     // 0x04AC   (0x0004)  
	float                                              FireTestOffset;                                             // 0x04B0   (0x0004)  
	float                                              FireLineRadius;                                             // 0x04B4   (0x0004)  
	float                                              FireLineLength;                                             // 0x04B8   (0x0004)  
	float                                              DefenceTraceLength;                                         // 0x04BC   (0x0004)  
	float                                              DefenceAngleStep;                                           // 0x04C0   (0x0004)  
	float                                              RemoveDistance;                                             // 0x04C4   (0x0004)  
	float                                              RemoveAngle;                                                // 0x04C8   (0x0004)  
	float                                              CliffEdgeDistance;                                          // 0x04CC   (0x0004)  
	float                                              StraightCliffErrorTolerance;                                // 0x04D0   (0x0004)  
	bool                                               bEnableNavmeshHeightCorrection;                             // 0x04D4   (0x0001)  
	bool                                               bUseFastTestNoDefenceRegion;                                // 0x04D5   (0x0001)  
	bool                                               bParallelNavMeshTile;                                       // 0x04D6   (0x0001)  
	bool                                               bParallelDefenceTest;                                       // 0x04D7   (0x0001)  
	bool                                               bParallelDefenceAngle;                                      // 0x04D8   (0x0001)  
	bool                                               bParallelCollectBoundaryEdge;                               // 0x04D9   (0x0001)  
	bool                                               bParallelGenerateSamplePoint;                               // 0x04DA   (0x0001)  
	bool                                               bParallelGenerateDefenceMapPoint;                           // 0x04DB   (0x0001)  
	bool                                               bParallelCalculatePointDefenceRatio;                        // 0x04DC   (0x0001)  
	bool                                               bParallelCalculatePointDefenceAngle;                        // 0x04DD   (0x0001)  
	unsigned char                                      UnknownData03_6[0x2];                                       // 0x04DE   (0x0002)  MISSED
	float                                              CoverPointRuntimeInfoExpireTime;                            // 0x04E0   (0x0004)  
	bool                                               bInitOctree;                                                // 0x04E4   (0x0001)  
	bool                                               bKeepRemoved;                                               // 0x04E5   (0x0001)  
	bool                                               bDebugDraw;                                                 // 0x04E6   (0x0001)  
	unsigned char                                      UnknownData04_7[0x1];                                       // 0x04E7   (0x0001)  MISSED
};

/// Class /Script/AIActionPointGeneratorRuntime.DoorPointEditorActor
/// Size: 0x0000 (0 bytes) (0x000308 - 0x000308) align 8 pad: 0x0000
class ADoorPointEditorActor : public AActionPointEditorActor
{ 
public:
};

/// Class /Script/AIActionPointGeneratorRuntime.GuardPointVolume
/// Size: 0x0000 (0 bytes) (0x000318 - 0x000318) align 8 pad: 0x0000
class AGuardPointVolume : public AVolume
{ 
public:


	/// Functions
	// Function /Script/AIActionPointGeneratorRuntime.GuardPointVolume.SaveToTaticSystemActor
	// void SaveToTaticSystemActor();                                                                                           // [0xd906a0] Final|Native|Public  
	// Function /Script/AIActionPointGeneratorRuntime.GuardPointVolume.GenTacticalPoints
	// void GenTacticalPoints();                                                                                                // [0xd906a0] Final|Native|Public  
};

/// Class /Script/AIActionPointGeneratorRuntime.KeyRouteAssistActor
/// Size: 0x0008 (8 bytes) (0x0002E0 - 0x0002E8) align 8 pad: 0x0000
class AKeyRouteAssistActor : public AActor
{ 
public:
	class AActor*                                      ParentPointEdActor;                                         // 0x02E0   (0x0008)  
};

/// Class /Script/AIActionPointGeneratorRuntime.KeyRoutePointEditorActor
/// Size: 0x0000 (0 bytes) (0x000308 - 0x000308) align 8 pad: 0x0000
class AKeyRoutePointEditorActor : public AActionPointEditorActor
{ 
public:
};

/// Class /Script/AIActionPointGeneratorRuntime.KeyRouteVolume
/// Size: 0x0000 (0 bytes) (0x000318 - 0x000318) align 8 pad: 0x0000
class AKeyRouteVolume : public AVolume
{ 
public:


	/// Functions
	// Function /Script/AIActionPointGeneratorRuntime.KeyRouteVolume.IsInVolume
	// bool IsInVolume(FVector& Point);                                                                                         // [0x2e3f090] Final|Native|Public|HasOutParms|HasDefaults 
};

/// Class /Script/AIActionPointGeneratorRuntime.SeekPointStatics
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class USeekPointStatics : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/AIActionPointGeneratorRuntime.SeekPointStatics.GetKeyRoutePointIndexsOfDepth
	// bool GetKeyRoutePointIndexsOfDepth(int32_t FromIndex, TArray<FKeyRoutePointData>& KeyRoutePoints, int32_t Depth, TArray<int32_t>& OutPointIndexs); // [0x2e3eec0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AIActionPointGeneratorRuntime.SeekPointStatics.FindKeyRoutePath
	// bool FindKeyRoutePath(class ATacticSystemActor* TacticSystem, int32_t FromIndex, int32_t ToIndex, TArray<FKeyRoutePointData>& KeyRoutePoints, TArray<int32_t>& OutPath); // [0x2e3ecc0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AIActionPointGeneratorRuntime.SeekPointStatics.CalculateNavPathLength
	// float CalculateNavPathLength(class UObject* InWorldContext, FVector& InFromPoint, FVector& InToPoint);                   // [0x2e3eb90] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
};

/// Class /Script/AIActionPointGeneratorRuntime.TacticPointEditorActor
/// Size: 0x0008 (8 bytes) (0x000308 - 0x000310) align 8 pad: 0x0000
class ATacticPointEditorActor : public AActionPointEditorActor
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0308   (0x0008)  MISSED
};

/// Class /Script/AIActionPointGeneratorRuntime.TacticPointEditorActorInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UTacticPointEditorActorInterface : public UInterface
{ 
public:
};

/// Class /Script/AIActionPointGeneratorRuntime.TacticPointGuardDotActor
/// Size: 0x0010 (16 bytes) (0x0002E0 - 0x0002F0) align 8 pad: 0x0000
class ATacticPointGuardDotActor : public AActor
{ 
public:
	class ATacticPointEditorActor*                     ParentEditPoint;                                            // 0x02E0   (0x0008)  
	int32_t                                            IndexOfGuard;                                               // 0x02E8   (0x0004)  
	bool                                               bArrowDir;                                                  // 0x02EC   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x02ED   (0x0003)  MISSED
};

/// Struct /Script/AIActionPointGeneratorRuntime.TacticPointTypeColor
/// Size: 0x00D0 (208 bytes) (0x000000 - 0x0000D0) align 4 pad: 0x0000
struct FTacticPointTypeColor
{ 
	FLinearColor                                       None_Color;                                                 // 0x0000   (0x0010)  
	FLinearColor                                       FlashBag_Color;                                             // 0x0010   (0x0010)  
	FLinearColor                                       Smoke_Color;                                                // 0x0020   (0x0010)  
	FLinearColor                                       HighValue_Color;                                            // 0x0030   (0x0010)  
	FLinearColor                                       FatalGate_Color;                                            // 0x0040   (0x0010)  
	FLinearColor                                       Escape_Color;                                               // 0x0050   (0x0010)  
	FLinearColor                                       Trap_Color;                                                 // 0x0060   (0x0010)  
	FLinearColor                                       OverWatch_Color;                                            // 0x0070   (0x0010)  
	FLinearColor                                       Prone_Color;                                                // 0x0080   (0x0010)  
	FLinearColor                                       Window_Color;                                               // 0x0090   (0x0010)  
	FLinearColor                                       Door_Color;                                                 // 0x00A0   (0x0010)  
	FLinearColor                                       Retreat_Color;                                              // 0x00B0   (0x0010)  
	FLinearColor                                       Transfer_Color;                                             // 0x00C0   (0x0010)  
};

/// Struct /Script/AIActionPointGeneratorRuntime.KeyRoutePointLink
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 4 pad: 0x0000
struct FKeyRoutePointLink
{ 
	int32_t                                            Index;                                                      // 0x0000   (0x0004)  
	float                                              NavPathLength;                                              // 0x0004   (0x0004)  
};

/// Struct /Script/AIActionPointGeneratorRuntime.KeyRoutePointData
/// Size: 0x0050 (80 bytes) (0x000010 - 0x000060) align 8 pad: 0x0000
struct FKeyRoutePointData : FActionPointData
{ 
	int32_t                                            PointID;                                                    // 0x0010   (0x0004)  
	float                                              Radius;                                                     // 0x0014   (0x0004)  
	float                                              MaxNavPathForMultipleOfRadius;                              // 0x0018   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x001C   (0x0004)  MISSED
	TArray<FKeyRoutePointLink>                         LinkPoints;                                                 // 0x0020   (0x0010)  
	TArray<FActionPointRadianSafe>                     OrientSafetys;                                              // 0x0030   (0x0010)  
	float                                              DangerValue;                                                // 0x0040   (0x0004)  
	float                                              CalculateDangerTime;                                        // 0x0044   (0x0004)  
	int64_t                                            PolyRef;                                                    // 0x0048   (0x0008)  
	TArray<int64_t>                                    NeighborPolyRefs;                                           // 0x0050   (0x0010)  
};

/// Class /Script/AIActionPointGeneratorRuntime.TacticSystemActor
/// Size: 0x0190 (400 bytes) (0x000338 - 0x0004C8) align 8 pad: 0x0000
class ATacticSystemActor : public AActionPointSystemActor
{ 
public:
	class UCoverSystem*                                CoverSystem;                                                // 0x0338   (0x0008)  
	TArray<FTacticPointData>                           TacticPoints;                                               // 0x0340   (0x0010)  
	TArray<FTacticPointData>                           DoorTacticPoints;                                           // 0x0350   (0x0010)  
	TArray<FTacticPointData>                           WindowTacticPoints;                                         // 0x0360   (0x0010)  
	TArray<FTacticPointData>                           EscapeTacticPoints;                                         // 0x0370   (0x0010)  
	FTacticPointTypeColor                              TacticPointTypeColor;                                       // 0x0380   (0x00D0)  
	TArray<ETacticPointType>                           GenerateOrientSafetyTypes;                                  // 0x0450   (0x0010)  
	TArray<FKeyRoutePointData>                         KeyRoutePoints;                                             // 0x0460   (0x0010)  
	SDK_UNDEFINED(80,389) /* TMap<int32_t, float> */   __um(KeyRoutePointsChians);                                 // 0x0470   (0x0050)  
	int32_t                                            NumOfOrientPointSafe;                                       // 0x04C0   (0x0004)  
	int32_t                                            LengthOfOrientPointSafe;                                    // 0x04C4   (0x0004)  
};

/// Class /Script/AIActionPointGeneratorRuntime.WindowPointEditorActor
/// Size: 0x0000 (0 bytes) (0x000308 - 0x000308) align 8 pad: 0x0000
class AWindowPointEditorActor : public AActionPointEditorActor
{ 
public:
};

/// Struct /Script/AIActionPointGeneratorRuntime.CoverPointOctreeElement
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 8 pad: 0x0000
struct FCoverPointOctreeElement
{ 
	unsigned char                                      UnknownData00_2[0x30];                                      // 0x0000   (0x0030)  MISSED
};

/// Struct /Script/AIActionPointGeneratorRuntime.DoorPointTmpBuildData
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 4 pad: 0x0000
struct FDoorPointTmpBuildData
{ 
	FVector                                            Location;                                                   // 0x0000   (0x000C)  
	bool                                               IsSafety;                                                   // 0x000C   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x000D   (0x0003)  MISSED
	int32_t                                            RelevanceIndex;                                             // 0x0010   (0x0004)  
	int32_t                                            DangerValue;                                                // 0x0014   (0x0004)  
};

/// Struct /Script/AIActionPointGeneratorRuntime.CoverPointOctreeData
/// Size: 0x0050 (80 bytes) (0x000000 - 0x000050) align 8 pad: 0x0000
struct FCoverPointOctreeData
{ 
	int32_t                                            CoverID;                                                    // 0x0000   (0x0004)  
	EActionPointType                                   PointType;                                                  // 0x0004   (0x0001)  
	unsigned char                                      UnknownData00_6[0xB];                                       // 0x0005   (0x000B)  MISSED
	FVector                                            Location;                                                   // 0x0010   (0x000C)  
	FVector                                            Direction;                                                  // 0x001C   (0x000C)  
	FVector                                            RightDirection;                                             // 0x0028   (0x000C)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0034   (0x0004)  MISSED
	TArray<FCoverPoseData>                             PoseData;                                                   // 0x0038   (0x0010)  
	unsigned char                                      UnknownData02_7[0x8];                                       // 0x0048   (0x0008)  MISSED
};

/// Struct /Script/AIActionPointGeneratorRuntime.TakeCoverPointIDListInfo
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FTakeCoverPointIDListInfo
{ 
	TArray<int32_t>                                    List;                                                       // 0x0000   (0x0010)  
};

/// Struct /Script/AIActionPointGeneratorRuntime.CoverPointRuntimeInfo
/// Size: 0x0014 (20 bytes) (0x000000 - 0x000014) align 4 pad: 0x0000
struct FCoverPointRuntimeInfo
{ 
	SDK_UNDEFINED(8,390) /* TWeakObjectPtr<AActor*> */ __um(TakenActor);                                           // 0x0000   (0x0008)  
	float                                              TakenBeginTime;                                             // 0x0008   (0x0004)  
	float                                              NextAvailableTime;                                          // 0x000C   (0x0004)  
	float                                              LastSpottedTime;                                            // 0x0010   (0x0004)  
};

/// Struct /Script/AIActionPointGeneratorRuntime.NavMeshTacticPointSampleData
/// Size: 0x0008 (8 bytes) (0x000050 - 0x000058) align 8 pad: 0x0000
struct FNavMeshTacticPointSampleData : FDTOCoverData
{ 
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0050   (0x0008)  MISSED
};

/// Struct /Script/AIActionPointGeneratorRuntime.KeyRouteSkeletonEditPoint
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 8 pad: 0x0000
struct FKeyRouteSkeletonEditPoint
{ 
	unsigned char                                      UnknownData00_7[0x8];                                       // 0x0000   (0x0008)  MISSED
	int32_t                                            UniqueID;                                                   // 0x0008   (0x0004)  
	FVector                                            Location;                                                   // 0x000C   (0x000C)  
	float                                              DistanceToWall;                                             // 0x0018   (0x0004)  
	bool                                               bDistanceToWallSmall;                                       // 0x001C   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x001D   (0x0003)  MISSED
	int32_t                                            ConnectionCount;                                            // 0x0020   (0x0004)  
	float                                              Score;                                                      // 0x0024   (0x0004)  
	bool                                               IsJunction;                                                 // 0x0028   (0x0001)  
	unsigned char                                      UnknownData02_7[0x7];                                       // 0x0029   (0x0007)  MISSED
};

/// Struct /Script/AIActionPointGeneratorRuntime.NavMeshTacticPointBuilder
/// Size: 0x0078 (120 bytes) (0x000000 - 0x000078) align 8 pad: 0x0000
struct FNavMeshTacticPointBuilder
{ 
	class ACoverSystemActor*                           CoverSystemActor;                                           // 0x0000   (0x0008)  
	unsigned char                                      UnknownData00_6[0x20];                                      // 0x0008   (0x0020)  MISSED
	class UWorld*                                      World;                                                      // 0x0028   (0x0008)  
	class ARecastNavMesh*                              MainNavData;                                                // 0x0030   (0x0008)  
	unsigned char                                      UnknownData01_7[0x40];                                      // 0x0038   (0x0040)  MISSED
};

/// Struct /Script/AIActionPointGeneratorRuntime.NavMeshTacticPointBuildStage
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FNavMeshTacticPointBuildStage
{ 
	unsigned char                                      UnknownData00_2[0x10];                                      // 0x0000   (0x0010)  MISSED
};

/// Struct /Script/AIActionPointGeneratorRuntime.NavMeshTacticPointCalculatePointDefenceAngleStage
/// Size: 0x0000 (0 bytes) (0x000010 - 0x000010) align 8 pad: 0x0000
struct FNavMeshTacticPointCalculatePointDefenceAngleStage : FNavMeshTacticPointBuildStage
{ 
};

/// Struct /Script/AIActionPointGeneratorRuntime.NavMeshTacticPointCalculatePointDefenceRatioStage
/// Size: 0x0000 (0 bytes) (0x000010 - 0x000010) align 8 pad: 0x0000
struct FNavMeshTacticPointCalculatePointDefenceRatioStage : FNavMeshTacticPointBuildStage
{ 
};

/// Struct /Script/AIActionPointGeneratorRuntime.NavMeshTacticPointCollectBoundaryEdgeStage
/// Size: 0x0000 (0 bytes) (0x000010 - 0x000010) align 8 pad: 0x0000
struct FNavMeshTacticPointCollectBoundaryEdgeStage : FNavMeshTacticPointBuildStage
{ 
};

/// Struct /Script/AIActionPointGeneratorRuntime.NavMeshTacticPointGenerateEdgeDefenceMapStage
/// Size: 0x0000 (0 bytes) (0x000010 - 0x000010) align 8 pad: 0x0000
struct FNavMeshTacticPointGenerateEdgeDefenceMapStage : FNavMeshTacticPointBuildStage
{ 
};

/// Struct /Script/AIActionPointGeneratorRuntime.NavMeshTacticPointGenerateSamplePointStage
/// Size: 0x0008 (8 bytes) (0x000010 - 0x000018) align 8 pad: 0x0000
struct FNavMeshTacticPointGenerateSamplePointStage : FNavMeshTacticPointBuildStage
{ 
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0010   (0x0008)  MISSED
};

/// Struct /Script/AIActionPointGeneratorRuntime.NavMeshTacticPointMergeParallelEdgeStage
/// Size: 0x0000 (0 bytes) (0x000010 - 0x000010) align 8 pad: 0x0000
struct FNavMeshTacticPointMergeParallelEdgeStage : FNavMeshTacticPointBuildStage
{ 
};

/// Struct /Script/AIActionPointGeneratorRuntime.NavMeshTacticPointRemoveTooClosePointStage
/// Size: 0x0000 (0 bytes) (0x000010 - 0x000010) align 8 pad: 0x0000
struct FNavMeshTacticPointRemoveTooClosePointStage : FNavMeshTacticPointBuildStage
{ 
};

/// Struct /Script/AIActionPointGeneratorRuntime.NavMeshTacticPointSetupEdgeDataStage
/// Size: 0x0000 (0 bytes) (0x000010 - 0x000010) align 8 pad: 0x0000
struct FNavMeshTacticPointSetupEdgeDataStage : FNavMeshTacticPointBuildStage
{ 
};

/// Struct /Script/AIActionPointGeneratorRuntime.SeekANode
/// Size: 0x0014 (20 bytes) (0x000000 - 0x000014) align 4 pad: 0x0000
struct FSeekANode
{ 
	int32_t                                            Index;                                                      // 0x0000   (0x0004)  
	int32_t                                            ParentIndex;                                                // 0x0004   (0x0004)  
	float                                              NowCost;                                                    // 0x0008   (0x0004)  
	float                                              CostFromBot;                                                // 0x000C   (0x0004)  
	float                                              CostEstimate;                                               // 0x0010   (0x0004)  
};

static_assert(sizeof(AActionPointEditorActor) == 0x0308); // 776 bytes (0x0002E0 - 0x000308)
static_assert(sizeof(AActionPointSystemActor) == 0x0338); // 824 bytes (0x0002E0 - 0x000338)
static_assert(sizeof(FActionPointData) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FTacticPointGuardTargetAndDirection) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FActionPointRadianSafe) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(sizeof(FTacticPointData) == 0x0070); // 112 bytes (0x000010 - 0x000070)
static_assert(sizeof(ABPTacticPointEditorActor) == 0x0360); // 864 bytes (0x0002E0 - 0x000360)
static_assert(sizeof(AChangeNotifyingRecastNavMesh) == 0x06A0); // 1696 bytes (0x000598 - 0x0006A0)
static_assert(sizeof(FDebugPoint) == 0x0014); // 20 bytes (0x000000 - 0x000014)
static_assert(sizeof(FDebugArrow) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(UCoverFinderVisData) == 0x0048); // 72 bytes (0x000028 - 0x000048)
static_assert(sizeof(UCoverFinderVisualizerService) == 0x0090); // 144 bytes (0x000070 - 0x000090)
static_assert(sizeof(ACoverPointEditorActor) == 0x0308); // 776 bytes (0x000308 - 0x000308)
static_assert(sizeof(UCoverPointGeneratorStatics) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UCoverPointRenderingComponent) == 0x05E0); // 1504 bytes (0x0005D8 - 0x0005E0)
static_assert(sizeof(FNavMeshEdgeCoverDataEditor) == 0x0001); // 1 bytes (0x000000 - 0x000001)
static_assert(sizeof(FDTOCoverDataEditor) == 0x0001); // 1 bytes (0x000000 - 0x000001)
static_assert(sizeof(ACoverPointTestingActor) == 0x04C0); // 1216 bytes (0x0002E0 - 0x0004C0)
static_assert(sizeof(ACoverPointExclusionVolume) == 0x0318); // 792 bytes (0x000318 - 0x000318)
static_assert(sizeof(UCoverSystem) == 0x01A8); // 424 bytes (0x000028 - 0x0001A8)
static_assert(sizeof(FCoverPoseData) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(FDTOCoverData) == 0x0050); // 80 bytes (0x000010 - 0x000050)
static_assert(sizeof(FNavMeshCoverPointPoseSamplingConfig) == 0x001C); // 28 bytes (0x000000 - 0x00001C)
static_assert(sizeof(ACoverSystemActor) == 0x04E8); // 1256 bytes (0x000338 - 0x0004E8)
static_assert(sizeof(ADoorPointEditorActor) == 0x0308); // 776 bytes (0x000308 - 0x000308)
static_assert(sizeof(AGuardPointVolume) == 0x0318); // 792 bytes (0x000318 - 0x000318)
static_assert(sizeof(AKeyRouteAssistActor) == 0x02E8); // 744 bytes (0x0002E0 - 0x0002E8)
static_assert(sizeof(AKeyRoutePointEditorActor) == 0x0308); // 776 bytes (0x000308 - 0x000308)
static_assert(sizeof(AKeyRouteVolume) == 0x0318); // 792 bytes (0x000318 - 0x000318)
static_assert(sizeof(USeekPointStatics) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(ATacticPointEditorActor) == 0x0310); // 784 bytes (0x000308 - 0x000310)
static_assert(sizeof(UTacticPointEditorActorInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(ATacticPointGuardDotActor) == 0x02F0); // 752 bytes (0x0002E0 - 0x0002F0)
static_assert(sizeof(FTacticPointTypeColor) == 0x00D0); // 208 bytes (0x000000 - 0x0000D0)
static_assert(sizeof(FKeyRoutePointLink) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(sizeof(FKeyRoutePointData) == 0x0060); // 96 bytes (0x000010 - 0x000060)
static_assert(sizeof(ATacticSystemActor) == 0x04C8); // 1224 bytes (0x000338 - 0x0004C8)
static_assert(sizeof(AWindowPointEditorActor) == 0x0308); // 776 bytes (0x000308 - 0x000308)
static_assert(sizeof(FCoverPointOctreeElement) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(sizeof(FDoorPointTmpBuildData) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FCoverPointOctreeData) == 0x0050); // 80 bytes (0x000000 - 0x000050)
static_assert(sizeof(FTakeCoverPointIDListInfo) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FCoverPointRuntimeInfo) == 0x0014); // 20 bytes (0x000000 - 0x000014)
static_assert(sizeof(FNavMeshTacticPointSampleData) == 0x0058); // 88 bytes (0x000050 - 0x000058)
static_assert(sizeof(FKeyRouteSkeletonEditPoint) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(sizeof(FNavMeshTacticPointBuilder) == 0x0078); // 120 bytes (0x000000 - 0x000078)
static_assert(sizeof(FNavMeshTacticPointBuildStage) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FNavMeshTacticPointCalculatePointDefenceAngleStage) == 0x0010); // 16 bytes (0x000010 - 0x000010)
static_assert(sizeof(FNavMeshTacticPointCalculatePointDefenceRatioStage) == 0x0010); // 16 bytes (0x000010 - 0x000010)
static_assert(sizeof(FNavMeshTacticPointCollectBoundaryEdgeStage) == 0x0010); // 16 bytes (0x000010 - 0x000010)
static_assert(sizeof(FNavMeshTacticPointGenerateEdgeDefenceMapStage) == 0x0010); // 16 bytes (0x000010 - 0x000010)
static_assert(sizeof(FNavMeshTacticPointGenerateSamplePointStage) == 0x0018); // 24 bytes (0x000010 - 0x000018)
static_assert(sizeof(FNavMeshTacticPointMergeParallelEdgeStage) == 0x0010); // 16 bytes (0x000010 - 0x000010)
static_assert(sizeof(FNavMeshTacticPointRemoveTooClosePointStage) == 0x0010); // 16 bytes (0x000010 - 0x000010)
static_assert(sizeof(FNavMeshTacticPointSetupEdgeDataStage) == 0x0010); // 16 bytes (0x000010 - 0x000010)
static_assert(sizeof(FSeekANode) == 0x0014); // 20 bytes (0x000000 - 0x000014)
static_assert(offsetof(AActionPointEditorActor, ActionPointType) == 0x02E0);
static_assert(offsetof(AActionPointEditorActor, DRootComponent) == 0x02E8);
static_assert(offsetof(AActionPointEditorActor, SpotComponent) == 0x02F0);
static_assert(offsetof(AActionPointEditorActor, WarnComponent) == 0x02F8);
static_assert(offsetof(AActionPointEditorActor, ArrowComponent) == 0x0300);
static_assert(offsetof(FActionPointData, Location) == 0x0004);
static_assert(offsetof(FTacticPointGuardTargetAndDirection, Location) == 0x0000);
static_assert(offsetof(FTacticPointGuardTargetAndDirection, Direction) == 0x000C);
static_assert(offsetof(FTacticPointData, TacticPointType) == 0x0010);
static_assert(offsetof(FTacticPointData, GuardTargetAndDirections) == 0x0020);
static_assert(offsetof(FTacticPointData, CustomVector) == 0x0048);
static_assert(offsetof(FTacticPointData, Rotation) == 0x0054);
static_assert(offsetof(FTacticPointData, OrientSafetys) == 0x0060);
static_assert(offsetof(ABPTacticPointEditorActor, PointData) == 0x02F0);
static_assert(offsetof(FDebugPoint, Location) == 0x0000);
static_assert(offsetof(FDebugPoint, Color) == 0x000C);
static_assert(offsetof(FDebugArrow, Start) == 0x0000);
static_assert(offsetof(FDebugArrow, End) == 0x000C);
static_assert(offsetof(FDebugArrow, Color) == 0x0018);
static_assert(offsetof(UCoverFinderVisData, DebugPoints) == 0x0028);
static_assert(offsetof(UCoverFinderVisData, DebugArrows) == 0x0038);
static_assert(offsetof(ACoverPointTestingActor, CapsuleComponent) == 0x02E0);
static_assert(offsetof(ACoverPointTestingActor, GeneratorActor) == 0x02E8);
static_assert(offsetof(ACoverPointTestingActor, NavAgentProps) == 0x0368);
static_assert(offsetof(ACoverPointTestingActor, QueryingExtent) == 0x0398);
static_assert(offsetof(ACoverPointTestingActor, TargetActor) == 0x03B8);
static_assert(offsetof(ACoverPointTestingActor, EdgeDataEditor) == 0x0430);
static_assert(offsetof(ACoverPointTestingActor, PointDataEditor) == 0x0498);
static_assert(offsetof(ACoverPointTestingActor, SincePoint) == 0x049C);
static_assert(offsetof(ACoverPointTestingActor, UntilPoint) == 0x04A8);
static_assert(offsetof(UCoverSystem, NavMesh) == 0x0188);
static_assert(offsetof(UCoverSystem, CoverPointGenerator) == 0x0198);
static_assert(offsetof(UCoverSystem, TacticPointGenerator) == 0x01A0);
static_assert(offsetof(FCoverPoseData, PoseType) == 0x0000);
static_assert(offsetof(FCoverPoseData, Location) == 0x0004);
static_assert(offsetof(FCoverPoseData, Direction) == 0x0010);
static_assert(offsetof(FDTOCoverData, Rotation) == 0x0024);
static_assert(offsetof(FDTOCoverData, RightDir) == 0x0030);
static_assert(offsetof(FDTOCoverData, PoseData) == 0x0040);
static_assert(offsetof(FNavMeshCoverPointPoseSamplingConfig, PoseType) == 0x0000);
static_assert(offsetof(ACoverSystemActor, CoverSystem) == 0x0338);
static_assert(offsetof(ACoverSystemActor, RawCoverPoints) == 0x0340);
static_assert(offsetof(ACoverSystemActor, PoseSamplingConfigs) == 0x0450);
static_assert(offsetof(ACoverSystemActor, TraceChannel) == 0x0462);
static_assert(offsetof(ACoverSystemActor, RejectedActorNames) == 0x0468);
static_assert(offsetof(ACoverSystemActor, ExclusionVolumes) == 0x0478);
static_assert(offsetof(AKeyRouteAssistActor, ParentPointEdActor) == 0x02E0);
static_assert(offsetof(ATacticPointGuardDotActor, ParentEditPoint) == 0x02E0);
static_assert(offsetof(FTacticPointTypeColor, None_Color) == 0x0000);
static_assert(offsetof(FTacticPointTypeColor, FlashBag_Color) == 0x0010);
static_assert(offsetof(FTacticPointTypeColor, Smoke_Color) == 0x0020);
static_assert(offsetof(FTacticPointTypeColor, HighValue_Color) == 0x0030);
static_assert(offsetof(FTacticPointTypeColor, FatalGate_Color) == 0x0040);
static_assert(offsetof(FTacticPointTypeColor, Escape_Color) == 0x0050);
static_assert(offsetof(FTacticPointTypeColor, Trap_Color) == 0x0060);
static_assert(offsetof(FTacticPointTypeColor, OverWatch_Color) == 0x0070);
static_assert(offsetof(FTacticPointTypeColor, Prone_Color) == 0x0080);
static_assert(offsetof(FTacticPointTypeColor, Window_Color) == 0x0090);
static_assert(offsetof(FTacticPointTypeColor, Door_Color) == 0x00A0);
static_assert(offsetof(FTacticPointTypeColor, Retreat_Color) == 0x00B0);
static_assert(offsetof(FTacticPointTypeColor, Transfer_Color) == 0x00C0);
static_assert(offsetof(FKeyRoutePointData, LinkPoints) == 0x0020);
static_assert(offsetof(FKeyRoutePointData, OrientSafetys) == 0x0030);
static_assert(offsetof(FKeyRoutePointData, NeighborPolyRefs) == 0x0050);
static_assert(offsetof(ATacticSystemActor, CoverSystem) == 0x0338);
static_assert(offsetof(ATacticSystemActor, TacticPoints) == 0x0340);
static_assert(offsetof(ATacticSystemActor, DoorTacticPoints) == 0x0350);
static_assert(offsetof(ATacticSystemActor, WindowTacticPoints) == 0x0360);
static_assert(offsetof(ATacticSystemActor, EscapeTacticPoints) == 0x0370);
static_assert(offsetof(ATacticSystemActor, TacticPointTypeColor) == 0x0380);
static_assert(offsetof(ATacticSystemActor, GenerateOrientSafetyTypes) == 0x0450);
static_assert(offsetof(ATacticSystemActor, KeyRoutePoints) == 0x0460);
static_assert(offsetof(FDoorPointTmpBuildData, Location) == 0x0000);
static_assert(offsetof(FCoverPointOctreeData, PointType) == 0x0004);
static_assert(offsetof(FCoverPointOctreeData, Location) == 0x0010);
static_assert(offsetof(FCoverPointOctreeData, Direction) == 0x001C);
static_assert(offsetof(FCoverPointOctreeData, RightDirection) == 0x0028);
static_assert(offsetof(FCoverPointOctreeData, PoseData) == 0x0038);
static_assert(offsetof(FTakeCoverPointIDListInfo, List) == 0x0000);
static_assert(offsetof(FKeyRouteSkeletonEditPoint, Location) == 0x000C);
static_assert(offsetof(FNavMeshTacticPointBuilder, CoverSystemActor) == 0x0000);
static_assert(offsetof(FNavMeshTacticPointBuilder, World) == 0x0028);
static_assert(offsetof(FNavMeshTacticPointBuilder, MainNavData) == 0x0030);
