
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

/// Enum /Script/CoverGenerator.ENavLinkType
/// Size: 0x01 (1 bytes)
enum class ENavLinkType : uint8_t
{
	ENavLinkType__None                                                               = 0,
	ENavLinkType__Door                                                               = 1,
	ENavLinkType__Cabinet                                                            = 2,
	ENavLinkType__JumpingDown                                                        = 3,
	ENavLinkType__JumpingOver                                                        = 4
};

/// Class /Script/CoverGenerator.NPCAINavLinkProxy
/// Size: 0x0018 (24 bytes) (0x000330 - 0x000348) align 8 pad: 0x0000
class ANPCAINavLinkProxy : public ANavLinkProxy
{ 
public:
	ENavLinkType                                       LinkType;                                                   // 0x0330   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0331   (0x0007)  MISSED
	uint64_t                                           PolyRef;                                                    // 0x0338   (0x0008)  
	int32_t                                            NodeIndex;                                                  // 0x0340   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x0344   (0x0004)  MISSED


	/// Functions
	// Function /Script/CoverGenerator.NPCAINavLinkProxy.GetSmartLinkRightLocation
	// FVector GetSmartLinkRightLocation();                                                                                     // [0x2e48f30] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/CoverGenerator.NPCAINavLinkProxy.GetSmartLinkLeftLocation
	// FVector GetSmartLinkLeftLocation();                                                                                      // [0x2e48ef0] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/CoverGenerator.NPCAINavLinkProxy.GetSmartLinkComponent
	// class UNavLinkCustomComponent* GetSmartLinkComponent();                                                                  // [0x2e48ec0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/CoverGenerator.CoverGenerator
/// Size: 0x00A0 (160 bytes) (0x0002E0 - 0x000380) align 8 pad: 0x0000
class ACoverGenerator : public AInfo
{ 
public:
	bool                                               bRegenerateAtBeginPlay;                                     // 0x02E0   (0x0001)  
	bool                                               bRegenerateAtNavigationRebuilt;                             // 0x02E1   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x02E2   (0x0002)  MISSED
	float                                              SegmentLength;                                              // 0x02E4   (0x0004)  
	float                                              MaxSegDist;                                                 // 0x02E8   (0x0004)  
	float                                              CharHeight;                                                 // 0x02EC   (0x0004)  
	float                                              StepDistTrace;                                              // 0x02F0   (0x0004)  
	float                                              TraceLength;                                                // 0x02F4   (0x0004)  
	float                                              MinSpaceBetweenValidPoints;                                 // 0x02F8   (0x0004)  
	float                                              SphereSize;                                                 // 0x02FC   (0x0004)  
	float                                              WidthMaxAgent;                                              // 0x0300   (0x0004)  
	float                                              HeightMaxCrouching;                                         // 0x0304   (0x0004)  
	float                                              HeightMaxStanding;                                          // 0x0308   (0x0004)  
	float                                              OffsetWhenLeaningSides;                                     // 0x030C   (0x0004)  
	float                                              OffsetFrontAim;                                             // 0x0310   (0x0004)  
	float                                              EscapeRadius;                                               // 0x0314   (0x0004)  
	int32_t                                            MinCoverNum;                                                // 0x0318   (0x0004)  
	float                                              MinEscapeStep;                                              // 0x031C   (0x0004)  
	class UClass*                                      VolumeClass;                                                // 0x0320   (0x0008)  
	bool                                               bDraw1AllSegmentPointsTested;                               // 0x0328   (0x0001)  
	bool                                               bDraw2SegmentPointsWithinBounds;                            // 0x0329   (0x0001)  
	bool                                               bDraw3SimpleCoverGeometryTest;                              // 0x032A   (0x0001)  
	bool                                               bDraw4SecondPassTracesSides;                                // 0x032B   (0x0001)  
	bool                                               bDraw4SecondPassTracesSidesFrontAndBottom;                  // 0x032C   (0x0001)  
	bool                                               bDraw5SecondPassArrows;                                     // 0x032D   (0x0001)  
	bool                                               DebugDrawAllPoints;                                         // 0x032E   (0x0001)  
	bool                                               DebugDrawAllBusyPoints;                                     // 0x032F   (0x0001)  
	bool                                               DebugDisplayLog;                                            // 0x0330   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0331   (0x0003)  MISSED
	float                                              DebugDistance;                                              // 0x0334   (0x0004)  
	bool                                               bDrawOctreeBounds;                                          // 0x0338   (0x0001)  
	bool                                               bDebugVerts;                                                // 0x0339   (0x0001)  
	bool                                               bDebugEdgeVerts;                                            // 0x033A   (0x0001)  
	bool                                               bDebugPolyVerts;                                            // 0x033B   (0x0001)  
	unsigned char                                      UnknownData02_6[0xC];                                       // 0x033C   (0x000C)  MISSED
	TArray<class UCoverPoint*>                         AllCoverPoints;                                             // 0x0348   (0x0010)  
	TArray<class UCoverPoint*>                         CoverPointsCurrentlyUsed;                                   // 0x0358   (0x0010)  
	TArray<FVector>                                    EscapesPoints;                                              // 0x0368   (0x0010)  
	unsigned char                                      UnknownData03_7[0x8];                                       // 0x0378   (0x0008)  MISSED


	/// Functions
	// Function /Script/CoverGenerator.CoverGenerator.ReleaseCover
	// void ReleaseCover(class UCoverPoint* CoverPoint);                                                                        // [0x2e49170] Final|Native|Public|BlueprintCallable 
	// Function /Script/CoverGenerator.CoverGenerator.OnNavigationGenerationFinished
	// void OnNavigationGenerationFinished(class ANavigationData* NavData);                                                     // [0x2e490e0] Final|Native|Private 
	// Function /Script/CoverGenerator.CoverGenerator.OccupyCover
	// bool OccupyCover(class UCoverPoint* CoverPoint, class AController* Controller);                                          // [0x2e49010] Final|Native|Public|BlueprintCallable 
	// Function /Script/CoverGenerator.CoverGenerator.IsFreeCoverPoint
	// bool IsFreeCoverPoint(class UCoverPoint* CoverPoint);                                                                    // [0x2e48f70] Final|Native|Public|BlueprintCallable 
	// Function /Script/CoverGenerator.CoverGenerator.GetCoverWithinBox
	// TArray<UCoverPoint*> GetCoverWithinBox(FBox& BoxIn);                                                                     // [0x2e48de0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/CoverGenerator.CoverGenerator.GetCoverGenerator
	// class ACoverGenerator* GetCoverGenerator(class UObject* WorldContextObject);                                             // [0x2e48d50] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/CoverGenerator.CoverGenerator.CoverExistWithinBox
	// bool CoverExistWithinBox(FBox& BoxIn);                                                                                   // [0x2e48cb0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
};

/// Class /Script/CoverGenerator.CoverPoint
/// Size: 0x0038 (56 bytes) (0x000028 - 0x000060) align 8 pad: 0x0000
class UCoverPoint : public UObject
{ 
public:
	FVector                                            Location;                                                   // 0x0028   (0x000C)  
	FVector                                            _DirectionToWall;                                           // 0x0034   (0x000C)  
	FRotator                                           RotatorXToWall;                                             // 0x0040   (0x000C)  
	bool                                               bLeftCoverStanding;                                         // 0x004C   (0x0001)  
	bool                                               bRightCoverStanding;                                        // 0x004D   (0x0001)  
	bool                                               bLeftCoverCrouched;                                         // 0x004E   (0x0001)  
	bool                                               bRightCoverCrouched;                                        // 0x004F   (0x0001)  
	bool                                               bFrontCoverCrouched;                                        // 0x0050   (0x0001)  
	bool                                               bCrouchedCover;                                             // 0x0051   (0x0001)  
	unsigned char                                      UnknownData00_6[0x6];                                       // 0x0052   (0x0006)  MISSED
	class AController*                                 OccupiedBy;                                                 // 0x0058   (0x0008)  
};

/// Class /Script/CoverGenerator.EnvQueryGenerator_CoverFMemory
/// Size: 0x0078 (120 bytes) (0x000050 - 0x0000C8) align 8 pad: 0x0000
class UEnvQueryGenerator_CoverFMemory : public UEnvQueryGenerator
{ 
public:
	FAIDataProviderFloatValue                          SquareExtent;                                               // 0x0050   (0x0038)  
	FAIDataProviderFloatValue                          BoxHeight;                                                  // 0x0088   (0x0038)  
	class UClass*                                      GenerateAround;                                             // 0x00C0   (0x0008)  
};

/// Class /Script/CoverGenerator.EnvQueryItemType_Cover
/// Size: 0x0000 (0 bytes) (0x000030 - 0x000030) align 8 pad: 0x0000
class UEnvQueryItemType_Cover : public UEnvQueryItemType_VectorBase
{ 
public:
};

/// Class /Script/CoverGenerator.EnvQueryTest_CoverPointFree
/// Size: 0x0000 (0 bytes) (0x0001F8 - 0x0001F8) align 8 pad: 0x0000
class UEnvQueryTest_CoverPointFree : public UEnvQueryTest
{ 
public:
};

/// Class /Script/CoverGenerator.EnvQueryTest_IsCoverPosition
/// Size: 0x00E0 (224 bytes) (0x0001F8 - 0x0002D8) align 8 pad: 0x0000
class UEnvQueryTest_IsCoverPosition : public UEnvQueryTest
{ 
public:
	FEnvTraceData                                      TraceData;                                                  // 0x01F8   (0x0030)  
	class UClass*                                      Context;                                                    // 0x0228   (0x0008)  
	FAIDataProviderFloatValue                          ContextHorizontalDistanceOffset;                            // 0x0230   (0x0038)  
	FAIDataProviderFloatValue                          ContextVerticalDistanceOffset;                              // 0x0268   (0x0038)  
	FAIDataProviderBoolValue                           DebugData;                                                  // 0x02A0   (0x0038)  
};

/// Class /Script/CoverGenerator.EnvQueryTest_ParallelToCoverDirection
/// Size: 0x0040 (64 bytes) (0x0001F8 - 0x000238) align 8 pad: 0x0000
class UEnvQueryTest_ParallelToCoverDirection : public UEnvQueryTest
{ 
public:
	class UClass*                                      Context;                                                    // 0x01F8   (0x0008)  
	FAIDataProviderFloatValue                          MaxEpsilon;                                                 // 0x0200   (0x0038)  
};

/// Class /Script/CoverGenerator.EnvQueryTest_TraceDistance
/// Size: 0x00A8 (168 bytes) (0x0001F8 - 0x0002A0) align 8 pad: 0x0000
class UEnvQueryTest_TraceDistance : public UEnvQueryTest
{ 
public:
	FEnvTraceData                                      TraceData;                                                  // 0x01F8   (0x0030)  
	class UClass*                                      Context;                                                    // 0x0228   (0x0008)  
	FAIDataProviderFloatValue                          MaxTraceDistance;                                           // 0x0230   (0x0038)  
	FAIDataProviderFloatValue                          VerticalOffset;                                             // 0x0268   (0x0038)  
};

/// Class /Script/CoverGenerator.NavLinkProxyGenerator
/// Size: 0x0050 (80 bytes) (0x0002E0 - 0x000330) align 8 pad: 0x0000
class ANavLinkProxyGenerator : public AInfo
{ 
public:
	float                                              EdgeDivisor;                                                // 0x02E0   (0x0004)  
	float                                              JumpHeight;                                                 // 0x02E4   (0x0004)  
	float                                              SlantDegree;                                                // 0x02E8   (0x0004)  
	float                                              MinHeight;                                                  // 0x02EC   (0x0004)  
	float                                              MaxHeight;                                                  // 0x02F0   (0x0004)  
	float                                              MaxZHeight;                                                 // 0x02F4   (0x0004)  
	float                                              MaxJumpDistance;                                            // 0x02F8   (0x0004)  
	float                                              MinFenceHeight;                                             // 0x02FC   (0x0004)  
	float                                              MinFenceWidth;                                              // 0x0300   (0x0004)  
	bool                                               bDrawDebugLine;                                             // 0x0304   (0x0001)  
	bool                                               bGenerateJumpingDown;                                       // 0x0305   (0x0001)  
	bool                                               bGenerateJumpingOver;                                       // 0x0306   (0x0001)  
	unsigned char                                      UnknownData00_6[0x21];                                      // 0x0307   (0x0021)  MISSED
	class UClass*                                      BPNavLinkClass;                                             // 0x0328   (0x0008)  
};

/// Class /Script/CoverGenerator.SimpleNavLinkProxy
/// Size: 0x0000 (0 bytes) (0x000348 - 0x000348) align 8 pad: 0x0000
class ASimpleNavLinkProxy : public ANPCAINavLinkProxy
{ 
public:
};

static_assert(sizeof(ANPCAINavLinkProxy) == 0x0348); // 840 bytes (0x000330 - 0x000348)
static_assert(sizeof(ACoverGenerator) == 0x0380); // 896 bytes (0x0002E0 - 0x000380)
static_assert(sizeof(UCoverPoint) == 0x0060); // 96 bytes (0x000028 - 0x000060)
static_assert(sizeof(UEnvQueryGenerator_CoverFMemory) == 0x00C8); // 200 bytes (0x000050 - 0x0000C8)
static_assert(sizeof(UEnvQueryItemType_Cover) == 0x0030); // 48 bytes (0x000030 - 0x000030)
static_assert(sizeof(UEnvQueryTest_CoverPointFree) == 0x01F8); // 504 bytes (0x0001F8 - 0x0001F8)
static_assert(sizeof(UEnvQueryTest_IsCoverPosition) == 0x02D8); // 728 bytes (0x0001F8 - 0x0002D8)
static_assert(sizeof(UEnvQueryTest_ParallelToCoverDirection) == 0x0238); // 568 bytes (0x0001F8 - 0x000238)
static_assert(sizeof(UEnvQueryTest_TraceDistance) == 0x02A0); // 672 bytes (0x0001F8 - 0x0002A0)
static_assert(sizeof(ANavLinkProxyGenerator) == 0x0330); // 816 bytes (0x0002E0 - 0x000330)
static_assert(sizeof(ASimpleNavLinkProxy) == 0x0348); // 840 bytes (0x000348 - 0x000348)
static_assert(offsetof(ANPCAINavLinkProxy, LinkType) == 0x0330);
static_assert(offsetof(ACoverGenerator, VolumeClass) == 0x0320);
static_assert(offsetof(ACoverGenerator, AllCoverPoints) == 0x0348);
static_assert(offsetof(ACoverGenerator, CoverPointsCurrentlyUsed) == 0x0358);
static_assert(offsetof(ACoverGenerator, EscapesPoints) == 0x0368);
static_assert(offsetof(UCoverPoint, Location) == 0x0028);
static_assert(offsetof(UCoverPoint, _DirectionToWall) == 0x0034);
static_assert(offsetof(UCoverPoint, RotatorXToWall) == 0x0040);
static_assert(offsetof(UCoverPoint, OccupiedBy) == 0x0058);
static_assert(offsetof(UEnvQueryGenerator_CoverFMemory, SquareExtent) == 0x0050);
static_assert(offsetof(UEnvQueryGenerator_CoverFMemory, BoxHeight) == 0x0088);
static_assert(offsetof(UEnvQueryGenerator_CoverFMemory, GenerateAround) == 0x00C0);
static_assert(offsetof(UEnvQueryTest_IsCoverPosition, TraceData) == 0x01F8);
static_assert(offsetof(UEnvQueryTest_IsCoverPosition, Context) == 0x0228);
static_assert(offsetof(UEnvQueryTest_IsCoverPosition, ContextHorizontalDistanceOffset) == 0x0230);
static_assert(offsetof(UEnvQueryTest_IsCoverPosition, ContextVerticalDistanceOffset) == 0x0268);
static_assert(offsetof(UEnvQueryTest_IsCoverPosition, DebugData) == 0x02A0);
static_assert(offsetof(UEnvQueryTest_ParallelToCoverDirection, Context) == 0x01F8);
static_assert(offsetof(UEnvQueryTest_ParallelToCoverDirection, MaxEpsilon) == 0x0200);
static_assert(offsetof(UEnvQueryTest_TraceDistance, TraceData) == 0x01F8);
static_assert(offsetof(UEnvQueryTest_TraceDistance, Context) == 0x0228);
static_assert(offsetof(UEnvQueryTest_TraceDistance, MaxTraceDistance) == 0x0230);
static_assert(offsetof(UEnvQueryTest_TraceDistance, VerticalOffset) == 0x0268);
static_assert(offsetof(ANavLinkProxyGenerator, BPNavLinkClass) == 0x0328);
