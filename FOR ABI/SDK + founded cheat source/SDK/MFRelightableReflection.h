
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: DeveloperSettings
/// dependency: Engine

/// Enum /Script/MFRelightableReflection.ERelightingMethod
/// Size: 0x04 (4 bytes)
enum class ERelightingMethod : uint32_t
{
	ERelightingMethod__None                                                          = 0,
	ERelightingMethod__MiniGBuffer                                                   = 1
};

/// Enum /Script/MFRelightableReflection.EOnlyUpdateFacesMode
/// Size: 0x01 (1 bytes)
enum class EOnlyUpdateFacesMode : uint8_t
{
	EOnlyUpdateFacesMode__Disable                                                    = 0,
	EOnlyUpdateFacesMode__GameOnly                                                   = 1,
	EOnlyUpdateFacesMode__GameAndEditor                                              = 2
};

/// Class /Script/MFRelightableReflection.MFRelightableReflectionSettings
/// Size: 0x0008 (8 bytes) (0x000038 - 0x000040) align 8 pad: 0x0000
class UMFRelightableReflectionSettings : public UDeveloperSettings
{ 
public:
	bool                                               CaptureDirectionalLight : 1;                                // 0x0038:0 (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0039   (0x0007)  MISSED
};

/// Class /Script/MFRelightableReflection.RelightableData
/// Size: 0x00C0 (192 bytes) (0x000028 - 0x0000E8) align 8 pad: 0x0000
class URelightableData : public URelightableReflectionData
{ 
public:
	int32_t                                            CapturedCubeSize;                                           // 0x0028   (0x0004)  
	float                                              StaticBrightness;                                           // 0x002C   (0x0004)  
	ERelightingMethod                                  RelightableType;                                            // 0x0030   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0034   (0x0004)  MISSED
	class UTextureCube*                                CompressedAlbedo;                                           // 0x0038   (0x0008)  
	class UTextureCube*                                CompressedAmbient;                                          // 0x0040   (0x0008)  
	class UTextureCube*                                CompressedNormalAndSkyMask;                                 // 0x0048   (0x0008)  
	class UTextureCube*                                CompressedLocalLight;                                       // 0x0050   (0x0008)  
	class UTextureCube*                                CompressedFilteredSkyMask;                                  // 0x0058   (0x0008)  
	TArray<FVector2D>                                  FacesMinMaxDepth;                                           // 0x0060   (0x0010)  
	TArray<FVector>                                    KeyedShadowDirections;                                      // 0x0070   (0x0010)  
	uint32_t                                           FaceHasForegroundMask;                                      // 0x0080   (0x0004)  
	unsigned char                                      UnknownData01_7[0x64];                                      // 0x0084   (0x0064)  MISSED
};

/// Class /Script/MFRelightableReflection.RelightableReflectionBakeTimeInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class URelightableReflectionBakeTimeInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFRelightableReflection.RelightableReflectionBakeTimeInterface.StartBaking
	// void StartBaking();                                                                                                      // [0x3a75280] Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/MFRelightableReflection.RelightableReflectionBakeTimeInterface.SetBakeTimeTo
	// void SetBakeTimeTo(int32_t KeyIndex);                                                                                    // [0x3a75280] Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/MFRelightableReflection.RelightableReflectionBakeTimeInterface.EndBaking
	// void EndBaking();                                                                                                        // [0x3a75280] Event|Public|BlueprintCallable|BlueprintEvent 
};

static_assert(sizeof(UMFRelightableReflectionSettings) == 0x0040); // 64 bytes (0x000038 - 0x000040)
static_assert(sizeof(URelightableData) == 0x00E8); // 232 bytes (0x000028 - 0x0000E8)
static_assert(sizeof(URelightableReflectionBakeTimeInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(offsetof(URelightableData, RelightableType) == 0x0030);
static_assert(offsetof(URelightableData, CompressedAlbedo) == 0x0038);
static_assert(offsetof(URelightableData, CompressedAmbient) == 0x0040);
static_assert(offsetof(URelightableData, CompressedNormalAndSkyMask) == 0x0048);
static_assert(offsetof(URelightableData, CompressedLocalLight) == 0x0050);
static_assert(offsetof(URelightableData, CompressedFilteredSkyMask) == 0x0058);
static_assert(offsetof(URelightableData, FacesMinMaxDepth) == 0x0060);
static_assert(offsetof(URelightableData, KeyedShadowDirections) == 0x0070);
