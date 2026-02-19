
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: Landscape
/// dependency: ProceduralMeshComponent

/// Class /Script/MFGridLevelsRuntime.LODViewDistanceVolume
/// Size: 0x0038 (56 bytes) (0x000328 - 0x000360) align 8 pad: 0x0000
class ALODViewDistanceVolume : public APhysicsVolume
{ 
public:
	unsigned char                                      UnknownData00_3[0x10];                                      // 0x0328   (0x0010)  MISSED
	TArray<class AActor*>                              SubActors;                                                  // 0x0338   (0x0010)  
	TArray<FString>                                    LevelPathNames;                                             // 0x0348   (0x0010)  
	float                                              DrawDistanceMultiply;                                       // 0x0358   (0x0004)  
	float                                              DrawDistanceAdd;                                            // 0x035C   (0x0004)  


	/// Functions
	// Function /Script/MFGridLevelsRuntime.LODViewDistanceVolume.ActorEndOverlap
	// void ActorEndOverlap(class UPrimitiveComponent* OverlappedComponent, class AActor* OtherActor, class UPrimitiveComponent* OtherComp, int32_t OtherBodyIndex); // [0xc52b30] Native|Public        
	// Function /Script/MFGridLevelsRuntime.LODViewDistanceVolume.ActorBeginOverlap
	// void ActorBeginOverlap(class UPrimitiveComponent* OverlappedComponent, class AActor* OtherActor, class UPrimitiveComponent* OtherComp, int32_t OtherBodyIndex, bool bFromSweep, FHitResult& SweepResult); // [0xc52920] Native|Public|HasOutParms 
};

/// Class /Script/MFGridLevelsRuntime.MFFoliageBillboardMeshComponent
/// Size: 0x0000 (0 bytes) (0x000680 - 0x000680) align 16 pad: 0x0000
class UMFFoliageBillboardMeshComponent : public UProceduralMeshComponent
{ 
public:
};

/// Class /Script/MFGridLevelsRuntime.MFFoliageBillboardProxy
/// Size: 0x0090 (144 bytes) (0x0002E0 - 0x000370) align 8 pad: 0x0000
class AMFFoliageBillboardProxy : public AActor
{ 
public:
	unsigned char                                      UnknownData00_3[0x18];                                      // 0x02E0   (0x0018)  MISSED
	class UMaterialInterface*                          MaterialInterface;                                          // 0x02F8   (0x0008)  
	SDK_UNDEFINED(80,2760) /* TMap<ULevel*, FMFFoliageBillboardInstanceInfo> */ __um(LoadedLevels);                // 0x0300   (0x0050)  
	int32_t                                            TotalProcMeshSectionNums;                                   // 0x0350   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0354   (0x0004)  MISSED
	class UMFFoliageBillboardMeshComponent*            FoliageBillboardComponent;                                  // 0x0358   (0x0008)  
	unsigned char                                      UnknownData02_7[0x10];                                      // 0x0360   (0x0010)  MISSED
};

/// Struct /Script/MFGridLevelsRuntime.MFFoliageBillboardSection
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 8 pad: 0x0000
struct FMFFoliageBillboardSection
{ 
	class UStaticMesh*                                 StaticMesh;                                                 // 0x0000   (0x0008)  
	class UMaterialInterface*                          MaterialInterface;                                          // 0x0008   (0x0008)  
	TArray<FTransform>                                 PerInstanceTransform;                                       // 0x0010   (0x0010)  
	TArray<float>                                      PerInstanceCustomData;                                      // 0x0020   (0x0010)  
};

/// Class /Script/MFGridLevelsRuntime.MFFoliageBillboardSectionProxy
/// Size: 0x0038 (56 bytes) (0x0002E0 - 0x000318) align 8 pad: 0x0000
class AMFFoliageBillboardSectionProxy : public AActor
{ 
public:
	float                                              BillboardMinHeightToMerge;                                  // 0x02E0   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x02E4   (0x0004)  MISSED
	TArray<FMFFoliageBillboardSection>                 BillboardSections;                                          // 0x02E8   (0x0010)  
	unsigned char                                      UnknownData01_7[0x20];                                      // 0x02F8   (0x0020)  MISSED


	/// Functions
	// Function /Script/MFGridLevelsRuntime.MFFoliageBillboardSectionProxy.ResetNoShowLOD1
	// void ResetNoShowLOD1();                                                                                                  // [0xc52fb0] Final|Native|Public  
	// Function /Script/MFGridLevelsRuntime.MFFoliageBillboardSectionProxy.ResetNoShowLOD0
	// void ResetNoShowLOD0();                                                                                                  // [0xc52f90] Final|Native|Public  
	// Function /Script/MFGridLevelsRuntime.MFFoliageBillboardSectionProxy.ResetNoShowLOD
	// void ResetNoShowLOD(char InNoShowLODCount);                                                                              // [0xc52fd0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFGridLevelsRuntime.MFFoliageBillboardSectionProxy.ClearBillboardISM
	// void ClearBillboardISM();                                                                                                // [0xc52e30] Final|Native|Public  
	// Function /Script/MFGridLevelsRuntime.MFFoliageBillboardSectionProxy.BuildBillboardSections
	// void BuildBillboardSections();                                                                                           // [0xc52e10] Final|Native|Public  
	// Function /Script/MFGridLevelsRuntime.MFFoliageBillboardSectionProxy.BuildBillboardISM
	// void BuildBillboardISM();                                                                                                // [0xc52df0] Final|Native|Public  
	// Function /Script/MFGridLevelsRuntime.MFFoliageBillboardSectionProxy.BBClearBillboardISM
	// void BBClearBillboardISM();                                                                                              // [0xc52e30] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFGridLevelsRuntime.MFFoliageBillboardSectionProxy.BBBuildBillboardSections
	// void BBBuildBillboardSections();                                                                                         // [0xc52e10] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFGridLevelsRuntime.MFFoliageBillboardSectionProxy.BBBuildBillboardISM
	// void BBBuildBillboardISM();                                                                                              // [0xc52df0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFGridLevelsRuntime.MFGeneralDynamicCombineMeshComponent
/// Size: 0x0000 (0 bytes) (0x000680 - 0x000680) align 16 pad: 0x0000
class UMFGeneralDynamicCombineMeshComponent : public UProceduralMeshComponent
{ 
public:
};

/// Class /Script/MFGridLevelsRuntime.MFGeneralDynamicCombineProxy
/// Size: 0x0158 (344 bytes) (0x0002E0 - 0x000438) align 8 pad: 0x0000
class AMFGeneralDynamicCombineProxy : public AActor
{ 
public:
	unsigned char                                      UnknownData00_3[0x10];                                      // 0x02E0   (0x0010)  MISSED
	TArray<class UMaterialInterface*>                  MaterialInterfaces;                                         // 0x02F0   (0x0010)  
	int32_t                                            MaxVertexNumsPerMesh;                                       // 0x0300   (0x0004)  
	int32_t                                            DistanceToUseMaxLOD;                                        // 0x0304   (0x0004)  
	int32_t                                            DistanceToHideMesh;                                         // 0x0308   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x030C   (0x0004)  MISSED
	SDK_UNDEFINED(80,2761) /* TMap<ULevel*, FMFStaticMeshComponentGroupForCombine> */ __um(AddStaticMeshComponentGroups); // 0x0310   (0x0050)  
	SDK_UNDEFINED(80,2762) /* TMap<UMaterialInterface*, int32_t> */ __um(AddedMaterials);                          // 0x0360   (0x0050)  
	TArray<class UMFGeneralDynamicCombineMeshComponent*> CombinedMeshComponents;                                   // 0x03B0   (0x0010)  
	SDK_UNDEFINED(80,2763) /* TMap<uint32_t, int32_t> */ __um(SectionIndexMap);                                    // 0x03C0   (0x0050)  
	unsigned char                                      UnknownData02_7[0x28];                                      // 0x0410   (0x0028)  MISSED
};

/// Class /Script/MFGridLevelsRuntime.MFWorldComposition
/// Size: 0x0180 (384 bytes) (0x000070 - 0x0001F0) align 8 pad: 0x0000
class UMFWorldComposition : public UWorldComposition
{ 
public:
	TArray<FString>                                    ClientLevelPathFilters;                                     // 0x0070   (0x0010)  
	TArray<FString>                                    ClientLevelPathIgnores;                                     // 0x0080   (0x0010)  
	TArray<FString>                                    ClientLevelPathIgnoresForStandardPackage;                   // 0x0090   (0x0010)  
	TArray<FString>                                    ClientLevelPathIgnoresForLowDevice;                         // 0x00A0   (0x0010)  
	TArray<FString>                                    ClientLevelPathIgnoresForMediumDevice;                      // 0x00B0   (0x0010)  
	TArray<FString>                                    ClientLevelPathConsider;                                    // 0x00C0   (0x0010)  
	TArray<FString>                                    ServerLevelPathFilters;                                     // 0x00D0   (0x0010)  
	TArray<FString>                                    ServerLevelPathIgnores;                                     // 0x00E0   (0x0010)  
	TArray<FString>                                    ServerLevelPathConsider;                                    // 0x00F0   (0x0010)  
	bool                                               bOverrideStreamingDistance;                                 // 0x0100   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0101   (0x0003)  MISSED
	float                                              StreamingDistance;                                          // 0x0104   (0x0004)  
	SDK_UNDEFINED(80,2764) /* TMap<FString, float> */  __um(StreamingDistanceScaleLowMemory);                      // 0x0108   (0x0050)  
	unsigned char                                      UnknownData01_6[0x20];                                      // 0x0158   (0x0020)  MISSED
	TArray<class ULevelStreaming*>                     DiscardTilesStreaming;                                      // 0x0178   (0x0010)  
	TArray<class ULevelStreaming*>                     VolumedLevelStreaming;                                      // 0x0188   (0x0010)  
	unsigned char                                      UnknownData02_6[0x10];                                      // 0x0198   (0x0010)  MISSED
	bool                                               LimitLoadLevel;                                             // 0x01A8   (0x0001)  
	unsigned char                                      UnknownData03_6[0x3];                                       // 0x01A9   (0x0003)  MISSED
	int32_t                                            MaxAsynLoadNum;                                             // 0x01AC   (0x0004)  
	TArray<class ULevelStreaming*>                     CentreLevels;                                               // 0x01B0   (0x0010)  
	unsigned char                                      UnknownData04_6[0x4];                                       // 0x01C0   (0x0004)  MISSED
	int32_t                                            PerFrameCount;                                              // 0x01C4   (0x0004)  
	unsigned char                                      UnknownData05_7[0x28];                                      // 0x01C8   (0x0028)  MISSED


	/// Functions
	// Function /Script/MFGridLevelsRuntime.MFWorldComposition.UnLoadLevel
	// void UnLoadLevel(FString LevelName);                                                                                     // [0xc535c0] Final|Native|Public  
	// Function /Script/MFGridLevelsRuntime.MFWorldComposition.SetOverrideStreamingDistance
	// void SetOverrideStreamingDistance(bool bOverride, float StreamingDistance);                                              // [0xc53320] Final|Native|Public  
	// Function /Script/MFGridLevelsRuntime.MFWorldComposition.RestoreLevel
	// void RestoreLevel(FString LevelName);                                                                                    // [0xc53050] Final|Native|Public  
	// Function /Script/MFGridLevelsRuntime.MFWorldComposition.IsCenterLevelLoadComplete
	// bool IsCenterLevelLoadComplete();                                                                                        // [0xc52e50] Final|Native|Public  
	// Function /Script/MFGridLevelsRuntime.MFWorldComposition.AddtionFilterTiles
	// void AddtionFilterTiles(TArray<FString> AddtionIgnores);                                                                 // [0xc52c80] Final|Native|Public  
};

/// Class /Script/MFGridLevelsRuntime.MFWorldCompositionActor
/// Size: 0x0128 (296 bytes) (0x0002E0 - 0x000408) align 8 pad: 0x0000
class AMFWorldCompositionActor : public AActor
{ 
public:
	TArray<FString>                                    ClientLevelPathFilters;                                     // 0x02E0   (0x0010)  
	TArray<FString>                                    ClientLevelPathIgnores;                                     // 0x02F0   (0x0010)  
	TArray<FString>                                    ClientLevelPathIgnoresForStandardPackage;                   // 0x0300   (0x0010)  
	TArray<FString>                                    ClientLevelPathIgnoresForLowDevice;                         // 0x0310   (0x0010)  
	TArray<FString>                                    ClientLevelPathIgnoresForMediumDevice;                      // 0x0320   (0x0010)  
	TArray<FString>                                    ClientLevelPathConsider;                                    // 0x0330   (0x0010)  
	TArray<FString>                                    ServerLevelPathFilters;                                     // 0x0340   (0x0010)  
	TArray<FString>                                    ServerLevelPathIgnores;                                     // 0x0350   (0x0010)  
	TArray<FString>                                    ServerLevelPathConsider;                                    // 0x0360   (0x0010)  
	bool                                               bUseLandscapeMeshProxy;                                     // 0x0370   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0371   (0x0007)  MISSED
	class ALandscapeMeshProxyActor*                    CachedLandscapeMeshProxyActor;                              // 0x0378   (0x0008)  
	TArray<class ULandscapeComponent*>                 CachedLandscapeComponents;                                  // 0x0380   (0x0010)  
	TArray<class ALODActor*>                           CachedLODActors;                                            // 0x0390   (0x0010)  
	class UMaterialParameterCollection*                MPC_LandscapeRegion;                                        // 0x03A0   (0x0008)  
	float                                              LandscapeViewDistance;                                      // 0x03A8   (0x0004)  
	bool                                               bOverrideStreamingDistance;                                 // 0x03AC   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x03AD   (0x0003)  MISSED
	float                                              StreamingDistance;                                          // 0x03B0   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x03B4   (0x0004)  MISSED
	SDK_UNDEFINED(80,2765) /* TMap<FString, float> */  __um(StreamingDistanceScaleLowMemory);                      // 0x03B8   (0x0050)  
};

/// Class /Script/MFGridLevelsRuntime.MFWorldCompositionStatics
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFWorldCompositionStatics : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/MFGridLevelsRuntime.MFWorldCompositionStatics.UnLoadLevel
	// void UnLoadLevel(class UObject* WorldContextObject, FString LevelName);                                                  // [0xc536b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFGridLevelsRuntime.MFWorldCompositionStatics.UnLimitLevelLoad
	// void UnLimitLevelLoad(class UObject* WorldContextObject, bool bEnabled);                                                 // [0xc53500] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFGridLevelsRuntime.MFWorldCompositionStatics.SetOverrideStreamingDistance
	// void SetOverrideStreamingDistance(class UObject* WorldContextObject, bool bOverride, float StreamingDistance);           // [0xc533f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFGridLevelsRuntime.MFWorldCompositionStatics.SetLimitLoadLevelEnable
	// void SetLimitLoadLevelEnable(class UObject* WorldContextObject, bool bEnable);                                           // [0xc53260] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFGridLevelsRuntime.MFWorldCompositionStatics.RestoreLevel
	// void RestoreLevel(class UObject* WorldContextObject, FString LevelName);                                                 // [0xc53140] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFGridLevelsRuntime.MFWorldCompositionStatics.ReloadLimitLoadLevel
	// void ReloadLimitLoadLevel(class UObject* WorldContextObject);                                                            // [0xc52f10] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFGridLevelsRuntime.MFWorldCompositionStatics.IsCenterLevelLoadComplete
	// bool IsCenterLevelLoadComplete(class UObject* WorldContextObject);                                                       // [0xc52e80] Final|Native|Static|Public|BlueprintCallable 
};

/// Struct /Script/MFGridLevelsRuntime.MFFoliageBillboardInstanceInfo
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 4 pad: 0x0000
struct FMFFoliageBillboardInstanceInfo
{ 
	int32_t                                            SectionIndex;                                               // 0x0000   (0x0004)  
	bool                                               bVisibile : 1;                                              // 0x0004:0 (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x0005   (0x0003)  MISSED
};

/// Struct /Script/MFGridLevelsRuntime.MFStaticMeshComponentForCombine
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 8 pad: 0x0000
struct FMFStaticMeshComponentForCombine
{ 
	class UStaticMeshComponent*                        Component;                                                  // 0x0000   (0x0008)  
	class UMaterialInterface*                          Material;                                                   // 0x0008   (0x0008)  
	uint32_t                                           HashCode;                                                   // 0x0010   (0x0004)  
	unsigned char                                      UnknownData00_7[0x1C];                                      // 0x0014   (0x001C)  MISSED
};

/// Struct /Script/MFGridLevelsRuntime.MFStaticMeshComponentGroupForCombine
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FMFStaticMeshComponentGroupForCombine
{ 
	TArray<FMFStaticMeshComponentForCombine>           StaticMeshComponents;                                       // 0x0000   (0x0010)  
};

static_assert(sizeof(ALODViewDistanceVolume) == 0x0360); // 864 bytes (0x000328 - 0x000360)
static_assert(sizeof(UMFFoliageBillboardMeshComponent) == 0x0680); // 1664 bytes (0x000680 - 0x000680)
static_assert(sizeof(AMFFoliageBillboardProxy) == 0x0370); // 880 bytes (0x0002E0 - 0x000370)
static_assert(sizeof(FMFFoliageBillboardSection) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(sizeof(AMFFoliageBillboardSectionProxy) == 0x0318); // 792 bytes (0x0002E0 - 0x000318)
static_assert(sizeof(UMFGeneralDynamicCombineMeshComponent) == 0x0680); // 1664 bytes (0x000680 - 0x000680)
static_assert(sizeof(AMFGeneralDynamicCombineProxy) == 0x0438); // 1080 bytes (0x0002E0 - 0x000438)
static_assert(sizeof(UMFWorldComposition) == 0x01F0); // 496 bytes (0x000070 - 0x0001F0)
static_assert(sizeof(AMFWorldCompositionActor) == 0x0408); // 1032 bytes (0x0002E0 - 0x000408)
static_assert(sizeof(UMFWorldCompositionStatics) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FMFFoliageBillboardInstanceInfo) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(sizeof(FMFStaticMeshComponentForCombine) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(sizeof(FMFStaticMeshComponentGroupForCombine) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(offsetof(ALODViewDistanceVolume, SubActors) == 0x0338);
static_assert(offsetof(ALODViewDistanceVolume, LevelPathNames) == 0x0348);
static_assert(offsetof(AMFFoliageBillboardProxy, MaterialInterface) == 0x02F8);
static_assert(offsetof(AMFFoliageBillboardProxy, FoliageBillboardComponent) == 0x0358);
static_assert(offsetof(FMFFoliageBillboardSection, StaticMesh) == 0x0000);
static_assert(offsetof(FMFFoliageBillboardSection, MaterialInterface) == 0x0008);
static_assert(offsetof(FMFFoliageBillboardSection, PerInstanceTransform) == 0x0010);
static_assert(offsetof(FMFFoliageBillboardSection, PerInstanceCustomData) == 0x0020);
static_assert(offsetof(AMFFoliageBillboardSectionProxy, BillboardSections) == 0x02E8);
static_assert(offsetof(AMFGeneralDynamicCombineProxy, MaterialInterfaces) == 0x02F0);
static_assert(offsetof(AMFGeneralDynamicCombineProxy, CombinedMeshComponents) == 0x03B0);
static_assert(offsetof(UMFWorldComposition, ClientLevelPathFilters) == 0x0070);
static_assert(offsetof(UMFWorldComposition, ClientLevelPathIgnores) == 0x0080);
static_assert(offsetof(UMFWorldComposition, ClientLevelPathIgnoresForStandardPackage) == 0x0090);
static_assert(offsetof(UMFWorldComposition, ClientLevelPathIgnoresForLowDevice) == 0x00A0);
static_assert(offsetof(UMFWorldComposition, ClientLevelPathIgnoresForMediumDevice) == 0x00B0);
static_assert(offsetof(UMFWorldComposition, ClientLevelPathConsider) == 0x00C0);
static_assert(offsetof(UMFWorldComposition, ServerLevelPathFilters) == 0x00D0);
static_assert(offsetof(UMFWorldComposition, ServerLevelPathIgnores) == 0x00E0);
static_assert(offsetof(UMFWorldComposition, ServerLevelPathConsider) == 0x00F0);
static_assert(offsetof(UMFWorldComposition, DiscardTilesStreaming) == 0x0178);
static_assert(offsetof(UMFWorldComposition, VolumedLevelStreaming) == 0x0188);
static_assert(offsetof(UMFWorldComposition, CentreLevels) == 0x01B0);
static_assert(offsetof(AMFWorldCompositionActor, ClientLevelPathFilters) == 0x02E0);
static_assert(offsetof(AMFWorldCompositionActor, ClientLevelPathIgnores) == 0x02F0);
static_assert(offsetof(AMFWorldCompositionActor, ClientLevelPathIgnoresForStandardPackage) == 0x0300);
static_assert(offsetof(AMFWorldCompositionActor, ClientLevelPathIgnoresForLowDevice) == 0x0310);
static_assert(offsetof(AMFWorldCompositionActor, ClientLevelPathIgnoresForMediumDevice) == 0x0320);
static_assert(offsetof(AMFWorldCompositionActor, ClientLevelPathConsider) == 0x0330);
static_assert(offsetof(AMFWorldCompositionActor, ServerLevelPathFilters) == 0x0340);
static_assert(offsetof(AMFWorldCompositionActor, ServerLevelPathIgnores) == 0x0350);
static_assert(offsetof(AMFWorldCompositionActor, ServerLevelPathConsider) == 0x0360);
static_assert(offsetof(AMFWorldCompositionActor, CachedLandscapeMeshProxyActor) == 0x0378);
static_assert(offsetof(AMFWorldCompositionActor, CachedLandscapeComponents) == 0x0380);
static_assert(offsetof(AMFWorldCompositionActor, CachedLODActors) == 0x0390);
static_assert(offsetof(AMFWorldCompositionActor, MPC_LandscapeRegion) == 0x03A0);
static_assert(offsetof(FMFStaticMeshComponentForCombine, Component) == 0x0000);
static_assert(offsetof(FMFStaticMeshComponentForCombine, Material) == 0x0008);
static_assert(offsetof(FMFStaticMeshComponentGroupForCombine, StaticMeshComponents) == 0x0000);
