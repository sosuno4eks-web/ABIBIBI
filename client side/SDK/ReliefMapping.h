
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Enum /Script/ReliefMapping.EReliefMapping_LinearColorChannels
/// Size: 0x01 (1 bytes)
enum class EReliefMapping_LinearColorChannels : uint8_t
{
	R                                                                                = 0,
	G                                                                                = 1,
	B                                                                                = 2,
	A                                                                                = 3
};

/// Enum /Script/ReliefMapping.EReliefMapping_CommonSizes
/// Size: 0x01 (1 bytes)
enum class EReliefMapping_CommonSizes : uint8_t
{
	RMC_Custom                                                                       = 0,
	RMC_32x32                                                                        = 5,
	RMC_64x64                                                                        = 6,
	RMC_128x128                                                                      = 7,
	RMC_256x256                                                                      = 8,
	RMC_512x512                                                                      = 9,
	RMC_1024x1024                                                                    = 10,
	RMC_2048x2048                                                                    = 11,
	RMC_4096x4096                                                                    = 12
};

/// Enum /Script/ReliefMapping.EReliefMapping_Type
/// Size: 0x01 (1 bytes)
enum class EReliefMapping_Type : uint8_t
{
	RelaxedConeStepMap                                                               = 0,
	AnisotropicConeStepMap                                                           = 1,
	HeightMap                                                                        = 2
};

/// Struct /Script/ReliefMapping.ReliefMappingGeneratorInput
/// Size: 0x0040 (64 bytes) (0x000000 - 0x000040) align 16 pad: 0x0000
struct FReliefMappingGeneratorInput
{ 
	class UTexture2D*                                  HeightMap;                                                  // 0x0000   (0x0008)  
	unsigned char                                      UnknownData00_7[0x38];                                      // 0x0008   (0x0038)  MISSED
};

/// Class /Script/ReliefMapping.ReliefMappingGeneratorRCSM
/// Size: 0x0078 (120 bytes) (0x000028 - 0x0000A0) align 16 pad: 0x0000
class UReliefMappingGeneratorRCSM : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0028   (0x0008)  MISSED
	FReliefMappingGeneratorInput                       Input;                                                      // 0x0030   (0x0040)  
	class UTextureRenderTarget2D*                      Output;                                                     // 0x0070   (0x0008)  
	unsigned char                                      UnknownData01_7[0x28];                                      // 0x0078   (0x0028)  MISSED


	/// Functions
	// Function /Script/ReliefMapping.ReliefMappingGeneratorRCSM.Update
	// void Update();                                                                                                           // [0x177b160] Final|Native|Public|BlueprintCallable 
	// Function /Script/ReliefMapping.ReliefMappingGeneratorRCSM.IsCompleted
	// bool IsCompleted();                                                                                                      // [0x177b110] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/ReliefMapping.ReliefMappingGeneratorRCSM.Init
	// bool Init(FReliefMappingGeneratorInput& GeneratorInput, class UTextureRenderTarget2D* GeneratorOutput);                  // [0x177b010] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/ReliefMapping.ReliefMappingGeneratorRCSM.GetProgress
	// int32_t GetProgress();                                                                                                   // [0x177afe0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/ReliefMapping.ReliefMappingGenerator
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UReliefMappingGenerator : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/ReliefMapping.ReliefMappingGenerator.GetInputFromUserData
	// FReliefMappingGeneratorInput GetInputFromUserData(class UReliefMapUserData* Data);                                       // [0x177af20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/ReliefMapping.ReliefMappingGenerator.GetInputFromTestActor
	// FReliefMappingGeneratorInput GetInputFromTestActor(class AReliefMappingTestActor* TestActor);                            // [0x177af20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/ReliefMapping.ReliefMappingGenerator.CreateTempUserData
	// class UReliefMapUserData* CreateTempUserData();                                                                          // [0x177aef0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/ReliefMapping.ReliefMappingGenerator.CreateGeneratorRCSM
	// class UReliefMappingGeneratorRCSM* CreateGeneratorRCSM(FReliefMappingGeneratorInput& GeneratorInput, class UTextureRenderTarget2D* GeneratorOutput); // [0x177ae00] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/ReliefMapping.ReliefMappingTestActor
/// Size: 0x0018 (24 bytes) (0x0002E0 - 0x0002F8) align 8 pad: 0x0000
class AReliefMappingTestActor : public AActor
{ 
public:
	class UTexture2D*                                  Input;                                                      // 0x02E0   (0x0008)  
	TEnumAsByte<EReliefMapping_LinearColorChannels>    InputChannel;                                               // 0x02E8   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x02E9   (0x0007)  MISSED
	class UTextureRenderTarget2D*                      Output;                                                     // 0x02F0   (0x0008)  


	/// Functions
	// Function /Script/ReliefMapping.ReliefMappingTestActor.TestGenerateRelaxedConeMap
	// void TestGenerateRelaxedConeMap();                                                                                       // [0x177b140] Final|Native|Public  
};

/// Class /Script/ReliefMapping.ReliefMapUserData
/// Size: 0x0058 (88 bytes) (0x000028 - 0x000080) align 8 pad: 0x0000
class UReliefMapUserData : public UAssetUserData
{ 
public:
	TEnumAsByte<EReliefMapping_Type>                   ReliefMapType;                                              // 0x0028   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0029   (0x0007)  MISSED
	SDK_UNDEFINED(40,2778) /* TWeakObjectPtr<UTexture2D*> */ __um(HeightMap);                                      // 0x0030   (0x0028)  
	TEnumAsByte<EReliefMapping_LinearColorChannels>    HeightMapChannel;                                           // 0x0058   (0x0001)  
	TEnumAsByte<EReliefMapping_CommonSizes>            CommonResolutions;                                          // 0x0059   (0x0001)  
	unsigned char                                      UnknownData01_6[0x2];                                       // 0x005A   (0x0002)  MISSED
	FIntPoint                                          Resolution;                                                 // 0x005C   (0x0008)  
	int32_t                                            IterationBucketSize;                                        // 0x0064   (0x0004)  
	float                                              BlackPoint;                                                 // 0x0068   (0x0004)  
	float                                              WhitePoint;                                                 // 0x006C   (0x0004)  
	float                                              Floor;                                                      // 0x0070   (0x0004)  
	float                                              Ceiling;                                                    // 0x0074   (0x0004)  
	float                                              Bias;                                                       // 0x0078   (0x0004)  
	float                                              MinHeight;                                                  // 0x007C   (0x0004)  
};

static_assert(sizeof(FReliefMappingGeneratorInput) == 0x0040); // 64 bytes (0x000000 - 0x000040)
static_assert(sizeof(UReliefMappingGeneratorRCSM) == 0x00A0); // 160 bytes (0x000028 - 0x0000A0)
static_assert(sizeof(UReliefMappingGenerator) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(AReliefMappingTestActor) == 0x02F8); // 760 bytes (0x0002E0 - 0x0002F8)
static_assert(sizeof(UReliefMapUserData) == 0x0080); // 128 bytes (0x000028 - 0x000080)
static_assert(offsetof(FReliefMappingGeneratorInput, HeightMap) == 0x0000);
static_assert(offsetof(UReliefMappingGeneratorRCSM, Input) == 0x0030);
static_assert(offsetof(UReliefMappingGeneratorRCSM, Output) == 0x0070);
static_assert(offsetof(AReliefMappingTestActor, Input) == 0x02E0);
static_assert(offsetof(AReliefMappingTestActor, InputChannel) == 0x02E8);
static_assert(offsetof(AReliefMappingTestActor, Output) == 0x02F0);
static_assert(offsetof(UReliefMapUserData, ReliefMapType) == 0x0028);
static_assert(offsetof(UReliefMapUserData, HeightMapChannel) == 0x0058);
static_assert(offsetof(UReliefMapUserData, CommonResolutions) == 0x0059);
static_assert(offsetof(UReliefMapUserData, Resolution) == 0x005C);
