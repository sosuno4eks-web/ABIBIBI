
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Class /Script/MFSceneryRuntime.LandscapeComponentDataBase
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class ULandscapeComponentDataBase : public UAssetUserData
{ 
public:
};

/// Class /Script/MFSceneryRuntime.IndexMapData
/// Size: 0x0018 (24 bytes) (0x000028 - 0x000040) align 8 pad: 0x0000
class UIndexMapData : public ULandscapeComponentDataBase
{ 
public:
	class UTexture2D*                                  IndexMap;                                                   // 0x0028   (0x0008)  
	FLinearColor                                       LandscapeInfo;                                              // 0x0030   (0x0010)  
};

/// Class /Script/MFSceneryRuntime.PigmentData
/// Size: 0x0008 (8 bytes) (0x000028 - 0x000030) align 8 pad: 0x0000
class UPigmentData : public ULandscapeComponentDataBase
{ 
public:
	class UTexture2D*                                  PigmentMap;                                                 // 0x0028   (0x0008)  
};

/// Class /Script/MFSceneryRuntime.HeightMapComponentData
/// Size: 0x0018 (24 bytes) (0x000028 - 0x000040) align 8 pad: 0x0000
class UHeightMapComponentData : public ULandscapeComponentDataBase
{ 
public:
	class UTexture2D*                                  HeightMap;                                                  // 0x0028   (0x0008)  
	FVector                                            TexOffset;                                                  // 0x0030   (0x000C)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x003C   (0x0004)  MISSED
};

/// Class /Script/MFSceneryRuntime.IndexMapStreamingLoadSubsystem
/// Size: 0x0070 (112 bytes) (0x000030 - 0x0000A0) align 8 pad: 0x0000
class UIndexMapStreamingLoadSubsystem : public UWorldSubsystem
{ 
public:
	unsigned char                                      UnknownData00_1[0x70];                                      // 0x0030   (0x0070)  MISSED
};

/// Struct /Script/MFSceneryRuntime.MFSceneryStreamingAsset
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FMFSceneryStreamingAsset
{ 
	class UTextureRenderTarget2DArray*                 StreamingTexture;                                           // 0x0000   (0x0008)  
	class UClass*                                      StreamingTextureType;                                       // 0x0008   (0x0008)  
};

/// Class /Script/MFSceneryRuntime.MFSceneryRuntimeSettingsActor
/// Size: 0x00A0 (160 bytes) (0x0002E0 - 0x000380) align 16 pad: 0x0000
class AMFSceneryRuntimeSettingsActor : public AActor
{ 
public:
	float                                              LayerNum;                                                   // 0x02E0   (0x0004)  
	float                                              LodMipBegin;                                                // 0x02E4   (0x0004)  
	float                                              LodMipEnd;                                                  // 0x02E8   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x02EC   (0x0004)  MISSED
	class UMaterialParameterCollection*                IndexMapMPC;                                                // 0x02F0   (0x0008)  
	class UTextureRenderTarget2D*                      IndirectTexture;                                            // 0x02F8   (0x0008)  
	TArray<FMFSceneryStreamingAsset>                   StreamingAssets;                                            // 0x0300   (0x0010)  
	unsigned char                                      UnknownData01_7[0x70];                                      // 0x0310   (0x0070)  MISSED
};

static_assert(sizeof(ULandscapeComponentDataBase) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UIndexMapData) == 0x0040); // 64 bytes (0x000028 - 0x000040)
static_assert(sizeof(UPigmentData) == 0x0030); // 48 bytes (0x000028 - 0x000030)
static_assert(sizeof(UHeightMapComponentData) == 0x0040); // 64 bytes (0x000028 - 0x000040)
static_assert(sizeof(UIndexMapStreamingLoadSubsystem) == 0x00A0); // 160 bytes (0x000030 - 0x0000A0)
static_assert(sizeof(FMFSceneryStreamingAsset) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(AMFSceneryRuntimeSettingsActor) == 0x0380); // 896 bytes (0x0002E0 - 0x000380)
static_assert(offsetof(UIndexMapData, IndexMap) == 0x0028);
static_assert(offsetof(UIndexMapData, LandscapeInfo) == 0x0030);
static_assert(offsetof(UPigmentData, PigmentMap) == 0x0028);
static_assert(offsetof(UHeightMapComponentData, HeightMap) == 0x0028);
static_assert(offsetof(UHeightMapComponentData, TexOffset) == 0x0030);
static_assert(offsetof(FMFSceneryStreamingAsset, StreamingTexture) == 0x0000);
static_assert(offsetof(FMFSceneryStreamingAsset, StreamingTextureType) == 0x0008);
static_assert(offsetof(AMFSceneryRuntimeSettingsActor, IndexMapMPC) == 0x02F0);
static_assert(offsetof(AMFSceneryRuntimeSettingsActor, IndirectTexture) == 0x02F8);
static_assert(offsetof(AMFSceneryRuntimeSettingsActor, StreamingAssets) == 0x0300);
