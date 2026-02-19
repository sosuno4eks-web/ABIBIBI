
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Enum /Script/LandscapeGrassHDRuntime.EGrassHDBuildState
/// Size: 0x01 (1 bytes)
enum class EGrassHDBuildState : uint8_t
{
	EGrassHDBuildState__CullOBBs_Started_GameThread                                  = 0,
	EGrassHDBuildState__CullOBBs_Started_RenderThread                                = 1,
	EGrassHDBuildState__CullOBBs_NeedRetry                                           = 2,
	EGrassHDBuildState__CullOBBs_PreparingNormalizedOBBs                             = 3,
	EGrassHDBuildState__CullOBBs_WaitingForOBBsFilling                               = 4,
	EGrassHDBuildState__CullOBBs_WaitingForNextFrame                                 = 5,
	EGrassHDBuildState__CullOBBs_WaitingForReadbackReady                             = 6,
	EGrassHDBuildState__CullOBBs_WaitingForResult                                    = 7,
	EGrassHDBuildState__OBBsReady                                                    = 8,
	EGrassHDBuildState__Completed                                                    = 9
};

/// Class /Script/LandscapeGrassHDRuntime.GrassHDBuildData
/// Size: 0x0428 (1064 bytes) (0x000028 - 0x000450) align 16 pad: 0x0000
class UGrassHDBuildData : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x3D8];                                     // 0x0028   (0x03D8)  MISSED
	EGrassHDBuildState                                 State;                                                      // 0x0400   (0x0001)  
	unsigned char                                      UnknownData01_6[0x7];                                       // 0x0401   (0x0007)  MISSED
	FString                                            Description;                                                // 0x0408   (0x0010)  
	unsigned char                                      UnknownData02_7[0x38];                                      // 0x0418   (0x0038)  MISSED
};

/// Class /Script/LandscapeGrassHDRuntime.GrassHDComponent
/// Size: 0x0018 (24 bytes) (0x0000F8 - 0x000110) align 8 pad: 0x0000
class UGrassHDComponent : public UActorComponent
{ 
public:
	TArray<class UGrassHDBuildData*>                   BuildDataCollection;                                        // 0x00F8   (0x0010)  
	unsigned char                                      UnknownData00_7[0x8];                                       // 0x0108   (0x0008)  MISSED
};

/// Class /Script/LandscapeGrassHDRuntime.GrassHDData
/// Size: 0x0078 (120 bytes) (0x000028 - 0x0000A0) align 8 pad: 0x0000
class UGrassHDData : public UAssetUserData
{ 
public:
	SDK_UNDEFINED(80,2728) /* TMap<FGrassHDCompKey, UGrassHDRuntimeData*> */ __um(RuntimeDataMap);                 // 0x0028   (0x0050)  
	unsigned char                                      UnknownData00_7[0x28];                                      // 0x0078   (0x0028)  MISSED
};

/// Class /Script/LandscapeGrassHDRuntime.GrassHDRuntimeData
/// Size: 0x0108 (264 bytes) (0x000028 - 0x000130) align 8 pad: 0x0000
class UGrassHDRuntimeData : public UObject
{ 
public:
	TArray<char>                                       CompressedData;                                             // 0x0028   (0x0010)  
	int32_t                                            OBBsNum;                                                    // 0x0038   (0x0004)  
	char                                               CompressionVersion;                                         // 0x003C   (0x0001)  
	bool                                               bRequireCPUAccess;                                          // 0x003D   (0x0001)  
	bool                                               bUseLandscapeLightmap;                                      // 0x003E   (0x0001)  
	unsigned char                                      UnknownData00_6[0x1];                                       // 0x003F   (0x0001)  MISSED
	FVector                                            ComponentOrigin;                                            // 0x0040   (0x000C)  
	FVector2D                                          LightmapBaseBias;                                           // 0x004C   (0x0008)  
	FVector2D                                          LightmapBaseScale;                                          // 0x0054   (0x0008)  
	FVector2D                                          ShadowmapBaseBias;                                          // 0x005C   (0x0008)  
	FVector2D                                          ShadowmapBaseScale;                                         // 0x0064   (0x0008)  
	FVector2D                                          LightMapComponentBias;                                      // 0x006C   (0x0008)  
	FVector2D                                          LightMapComponentScale;                                     // 0x0074   (0x0008)  
	FVector                                            MeshBoxMin;                                                 // 0x007C   (0x000C)  
	FVector                                            MeshBoxMax;                                                 // 0x0088   (0x000C)  
	int32_t                                            DesiredInstancesPerLeaf;                                    // 0x0094   (0x0004)  
	int32_t                                            RandomSeed;                                                 // 0x0098   (0x0004)  
	FVector                                            DrawScale;                                                  // 0x009C   (0x000C)  
	FIntPoint                                          SectionBase;                                                // 0x00A8   (0x0008)  
	FIntPoint                                          LandscapeSectionOffset;                                     // 0x00B0   (0x0008)  
	FVector                                            LandscapeLocationOffset;                                    // 0x00B8   (0x000C)  
	unsigned char                                      UnknownData01_7[0x6C];                                      // 0x00C4   (0x006C)  MISSED
};

/// Class /Script/LandscapeGrassHDRuntime.GrassHDSettingsActor
/// Size: 0x0008 (8 bytes) (0x0002E0 - 0x0002E8) align 8 pad: 0x0000
class AGrassHDSettingsActor : public AActor
{ 
public:
	char                                               CompressionVersion;                                         // 0x02E0   (0x0001)  
	bool                                               bEnabled;                                                   // 0x02E1   (0x0001)  
	bool                                               bNormalFixEnabled;                                          // 0x02E2   (0x0001)  
	unsigned char                                      UnknownData00_7[0x5];                                       // 0x02E3   (0x0005)  MISSED
};

/// Class /Script/LandscapeGrassHDRuntime.MaterialExpressionLandscapeGrassHDOutput
/// Size: 0x0028 (40 bytes) (0x000040 - 0x000068) align 8 pad: 0x0000
class UMaterialExpressionLandscapeGrassHDOutput : public UMaterialExpressionCustomOutput
{ 
public:
	FExpressionInput                                   MinGrassWeight;                                             // 0x0040   (0x000C)  
	unsigned char                                      UnknownData00_6[0x8];                                       // 0x004C   (0x0008)  MISSED
	FExpressionInput                                   Tolerance;                                                  // 0x0054   (0x000C)  
	unsigned char                                      UnknownData01_7[0x8];                                       // 0x0060   (0x0008)  MISSED
};

/// Struct /Script/LandscapeGrassHDRuntime.GrassHDCompKey
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 4 pad: 0x0000
struct FGrassHDCompKey
{ 
	unsigned char                                      UnknownData00_2[0x28];                                      // 0x0000   (0x0028)  MISSED
};

static_assert(sizeof(UGrassHDBuildData) == 0x0450); // 1104 bytes (0x000028 - 0x000450)
static_assert(sizeof(UGrassHDComponent) == 0x0110); // 272 bytes (0x0000F8 - 0x000110)
static_assert(sizeof(UGrassHDData) == 0x00A0); // 160 bytes (0x000028 - 0x0000A0)
static_assert(sizeof(UGrassHDRuntimeData) == 0x0130); // 304 bytes (0x000028 - 0x000130)
static_assert(sizeof(AGrassHDSettingsActor) == 0x02E8); // 744 bytes (0x0002E0 - 0x0002E8)
static_assert(sizeof(UMaterialExpressionLandscapeGrassHDOutput) == 0x0068); // 104 bytes (0x000040 - 0x000068)
static_assert(sizeof(FGrassHDCompKey) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(offsetof(UGrassHDBuildData, State) == 0x0400);
static_assert(offsetof(UGrassHDBuildData, Description) == 0x0408);
static_assert(offsetof(UGrassHDComponent, BuildDataCollection) == 0x00F8);
static_assert(offsetof(UGrassHDRuntimeData, CompressedData) == 0x0028);
static_assert(offsetof(UGrassHDRuntimeData, ComponentOrigin) == 0x0040);
static_assert(offsetof(UGrassHDRuntimeData, LightmapBaseBias) == 0x004C);
static_assert(offsetof(UGrassHDRuntimeData, LightmapBaseScale) == 0x0054);
static_assert(offsetof(UGrassHDRuntimeData, ShadowmapBaseBias) == 0x005C);
static_assert(offsetof(UGrassHDRuntimeData, ShadowmapBaseScale) == 0x0064);
static_assert(offsetof(UGrassHDRuntimeData, LightMapComponentBias) == 0x006C);
static_assert(offsetof(UGrassHDRuntimeData, LightMapComponentScale) == 0x0074);
static_assert(offsetof(UGrassHDRuntimeData, MeshBoxMin) == 0x007C);
static_assert(offsetof(UGrassHDRuntimeData, MeshBoxMax) == 0x0088);
static_assert(offsetof(UGrassHDRuntimeData, DrawScale) == 0x009C);
static_assert(offsetof(UGrassHDRuntimeData, SectionBase) == 0x00A8);
static_assert(offsetof(UGrassHDRuntimeData, LandscapeSectionOffset) == 0x00B0);
static_assert(offsetof(UGrassHDRuntimeData, LandscapeLocationOffset) == 0x00B8);
static_assert(offsetof(UMaterialExpressionLandscapeGrassHDOutput, MinGrassWeight) == 0x0040);
static_assert(offsetof(UMaterialExpressionLandscapeGrassHDOutput, Tolerance) == 0x0054);
