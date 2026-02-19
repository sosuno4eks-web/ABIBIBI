
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Enum /Script/SubstanceCore.ESubstanceInputType
/// Size: 0x01 (1 bytes)
enum class ESubstanceInputType : uint8_t
{
	SIT_Float                                                                        = 0,
	SIT_Float2                                                                       = 1,
	SIT_Float3                                                                       = 2,
	SIT_Float4                                                                       = 3,
	SIT_Integer                                                                      = 4,
	SIT_Image                                                                        = 5,
	SIT_Unused                                                                       = 6,
	SIT_Unused8                                                                      = 7,
	SIT_Integer2                                                                     = 8,
	SIT_Integer3                                                                     = 9,
	SIT_Integer4                                                                     = 10
};

/// Enum /Script/SubstanceCore.ESubstanceGenerationMode
/// Size: 0x01 (1 bytes)
enum class ESubstanceGenerationMode : uint8_t
{
	SGM_PlatformDefault                                                              = 0,
	SGM_Baked                                                                        = 1,
	SGM_OnLoadSync                                                                   = 2,
	SGM_OnLoadSyncAndCache                                                           = 3,
	SGM_OnLoadAsync                                                                  = 4,
	SGM_OnLoadAsyncAndCache                                                          = 5
};

/// Enum /Script/SubstanceCore.EDefaultSubstanceTextureSize
/// Size: 0x01 (1 bytes)
enum class EDefaultSubstanceTextureSize : uint8_t
{
	Size                                                                             = 0,
	Size2                                                                            = 4,
	Size3                                                                            = 5,
	Size4                                                                            = 6,
	Size5                                                                            = 7,
	Size6                                                                            = 8,
	Size7                                                                            = 9,
	Size8                                                                            = 10,
	Size9                                                                            = 11,
	Size10                                                                           = 12
};

/// Enum /Script/SubstanceCore.ESubstanceEngineType
/// Size: 0x01 (1 bytes)
enum class ESubstanceEngineType : uint8_t
{
	SET_CPU                                                                          = 0,
	SET_GPU                                                                          = 1
};

/// Enum /Script/SubstanceCore.ESubChannelType
/// Size: 0x01 (1 bytes)
enum class ESubChannelType : uint8_t
{
	Channel_Diffuse                                                                  = 0,
	Channel_Ambient                                                                  = 1,
	Channel_BaseColor                                                                = 2,
	Channel_Metallic                                                                 = 3,
	Channel_Roughness                                                                = 4,
	Channel_Emissive                                                                 = 5,
	Channel_Normal                                                                   = 6,
	Channel_Mask                                                                     = 7,
	Channel_Opacity                                                                  = 8,
	Channel_Refraction                                                               = 9,
	Channel_AmbientOcclusion                                                         = 10,
	Channel_Glossiness                                                               = 11,
	Channel_Height                                                                   = 12,
	Channel_Displacement                                                             = 13,
	Channel_Reflection                                                               = 14,
	Channel_Invalid                                                                  = 15
};

/// Enum /Script/SubstanceCore.ESubstanceTextureSize
/// Size: 0x01 (1 bytes)
enum class ESubstanceTextureSize : uint8_t
{
	ERL                                                                              = 0,
	ERL2                                                                             = 1,
	ERL3                                                                             = 2,
	ERL4                                                                             = 3,
	ERL5                                                                             = 4,
	ERL6                                                                             = 5,
	ERL7                                                                             = 6,
	ERL8                                                                             = 7,
	ERL9                                                                             = 8,
	ERL10                                                                            = 9
};

/// Class /Script/SubstanceCore.SubstanceGraphInstance
/// Size: 0x00F0 (240 bytes) (0x000028 - 0x000118) align 8 pad: 0x0000
class USubstanceGraphInstance : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x10];                                      // 0x0028   (0x0010)  MISSED
	FString                                            PackageURL;                                                 // 0x0038   (0x0010)  
	class USubstanceInstanceFactory*                   ParentFactory;                                              // 0x0048   (0x0008)  
	SDK_UNDEFINED(80,2795) /* TMap<uint32_t, USubstanceImageInput*> */ __um(ImageSources);                         // 0x0050   (0x0050)  
	class UMaterial*                                   CreatedMaterial;                                            // 0x00A0   (0x0008)  
	SDK_UNDEFINED(80,2796) /* TMap<int32_t, FGuid> */  __um(OutputTextureLinkData);                                // 0x00A8   (0x0050)  
	bool                                               bIsFrozen;                                                  // 0x00F8   (0x0001)  
	unsigned char                                      UnknownData01_7[0x1F];                                      // 0x00F9   (0x001F)  MISSED


	/// Functions
	// Function /Script/SubstanceCore.SubstanceGraphInstance.SetInputString
	// void SetInputString(FString Identifier, FString Value);                                                                  // [0x13b0040] Final|Native|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceGraphInstance.SetInputInt
	// void SetInputInt(FString Identifier, TArray<int32_t>& InputValues);                                                      // [0x13afee0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceGraphInstance.SetInputImg
	// bool SetInputImg(FString InputName, class UObject* Value);                                                               // [0x13afdf0] Final|Native|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceGraphInstance.SetInputFloat
	// void SetInputFloat(FString Identifier, TArray<float>& InputValues);                                                      // [0x13afc90] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceGraphInstance.SetInputColor
	// void SetInputColor(FString Identifier, FLinearColor& Color);                                                             // [0x13afb50] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceGraphInstance.SetInputBool
	// void SetInputBool(FString Identifier, bool bool0);                                                                       // [0x13afa20] Final|Native|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceGraphInstance.GetIntInputDesc
	// FSubstanceIntInputDesc GetIntInputDesc(FString Identifier);                                                              // [0x13af3c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceGraphInstance.GetInstanceDesc
	// FSubstanceInstanceDesc GetInstanceDesc();                                                                                // [0x13af290] Final|Native|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceGraphInstance.GetInputType
	// TEnumAsByte<ESubstanceInputType> GetInputType(FString InputName);                                                        // [0x13af190] Final|Native|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceGraphInstance.GetInputString
	// FString GetInputString(FString Identifier);                                                                              // [0x13af050] Final|Native|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceGraphInstance.GetInputNames
	// TArray<FString> GetInputNames();                                                                                         // [0x13aef70] Final|Native|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceGraphInstance.GetInputInt
	// TArray<int32_t> GetInputInt(FString Identifier);                                                                         // [0x13aee30] Final|Native|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceGraphInstance.GetInputFloat
	// TArray<float> GetInputFloat(FString Identifier);                                                                         // [0x13aecf0] Final|Native|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceGraphInstance.GetInputColor
	// FLinearColor GetInputColor(FString Identifier);                                                                          // [0x13aebf0] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceGraphInstance.GetInputBool
	// bool GetInputBool(FString Identifier);                                                                                   // [0x13aeaf0] Final|Native|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceGraphInstance.GetFloatInputDesc
	// FSubstanceFloatInputDesc GetFloatInputDesc(FString Identifier);                                                          // [0x13ae810] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/SubstanceCore.SubstanceImageInput
/// Size: 0x00A0 (160 bytes) (0x000028 - 0x0000C8) align 8 pad: 0x0000
class USubstanceImageInput : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x58];                                      // 0x0028   (0x0058)  MISSED
	int32_t                                            CompressionLevelRGB;                                        // 0x0080   (0x0004)  
	int32_t                                            CompressionLevelAlpha;                                      // 0x0084   (0x0004)  
	int32_t                                            SizeX;                                                      // 0x0088   (0x0004)  
	int32_t                                            SizeY;                                                      // 0x008C   (0x0004)  
	int32_t                                            NumComponents;                                              // 0x0090   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0094   (0x0004)  MISSED
	FString                                            SourceFilePath;                                             // 0x0098   (0x0010)  
	FString                                            SourceFileTimestamp;                                        // 0x00A8   (0x0010)  
	TArray<class USubstanceGraphInstance*>             Consumers;                                                  // 0x00B8   (0x0010)  
};

/// Class /Script/SubstanceCore.SubstanceInstanceFactory
/// Size: 0x0060 (96 bytes) (0x000028 - 0x000088) align 8 pad: 0x0000
class USubstanceInstanceFactory : public UObject
{ 
public:
	TArray<class USubstanceGraphInstance*>             mGraphInstances;                                            // 0x0028   (0x0010)  
	unsigned char                                      UnknownData00_6[0x18];                                      // 0x0038   (0x0018)  MISSED
	FString                                            RelativeSourceFilePath;                                     // 0x0050   (0x0010)  
	FString                                            AbsoluteSourceFilePath;                                     // 0x0060   (0x0010)  
	FString                                            SourceFileTimestamp;                                        // 0x0070   (0x0010)  
	TEnumAsByte<ESubstanceGenerationMode>              GenerationMode;                                             // 0x0080   (0x0001)  
	unsigned char                                      UnknownData01_7[0x7];                                       // 0x0081   (0x0007)  MISSED
};

/// Class /Script/SubstanceCore.SubstanceSettings
/// Size: 0x0018 (24 bytes) (0x000028 - 0x000040) align 8 pad: 0x0000
class USubstanceSettings : public UObject
{ 
public:
	int32_t                                            MemoryBudgetMb;                                             // 0x0028   (0x0004)  
	int32_t                                            CPUCores;                                                   // 0x002C   (0x0004)  
	int32_t                                            AsyncLoadMipClip;                                           // 0x0030   (0x0004)  
	int32_t                                            MaxAsyncSubstancesRenderedPerFrame;                         // 0x0034   (0x0004)  
	TEnumAsByte<ESubstanceGenerationMode>              DefaultGenerationMode;                                      // 0x0038   (0x0001)  
	TEnumAsByte<ESubstanceEngineType>                  SubstanceEngine;                                            // 0x0039   (0x0001)  
	TEnumAsByte<EDefaultSubstanceTextureSize>          DefaultSubstanceOutputSizeX;                                // 0x003A   (0x0001)  
	TEnumAsByte<EDefaultSubstanceTextureSize>          DefaultSubstanceOutputSizeY;                                // 0x003B   (0x0001)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x003C   (0x0004)  MISSED
};

/// Class /Script/SubstanceCore.SubstanceTexture2D
/// Size: 0x0058 (88 bytes) (0x000100 - 0x000158) align 8 pad: 0x0000
class USubstanceTexture2D : public UTexture2DDynamic
{ 
public:
	unsigned char                                      UnknownData00_3[0x30];                                      // 0x0100   (0x0030)  MISSED
	class USubstanceGraphInstance*                     ParentInstance;                                             // 0x0130   (0x0008)  
	TEnumAsByte<TextureAddress>                        AddressX;                                                   // 0x0138   (0x0001)  
	TEnumAsByte<TextureAddress>                        AddressY;                                                   // 0x0139   (0x0001)  
	bool                                               bCooked;                                                    // 0x013A   (0x0001)  
	unsigned char                                      UnknownData01_7[0x1D];                                      // 0x013B   (0x001D)  MISSED


	/// Functions
	// Function /Script/SubstanceCore.SubstanceTexture2D.GetChannel
	// TEnumAsByte<ESubChannelType> GetChannel();                                                                               // [0x13ae710] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/SubstanceCore.SubstanceUtility
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class USubstanceUtility : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/SubstanceCore.SubstanceUtility.SyncRendering
	// void SyncRendering(class USubstanceGraphInstance* InstancesToRender);                                                    // [0x13b0180] Final|RequiredAPI|Native|Static|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceUtility.SetGraphInstanceOutputSizeInt
	// void SetGraphInstanceOutputSizeInt(class USubstanceGraphInstance* GraphInstance, int32_t Width, int32_t Height);         // [0x13af920] Final|RequiredAPI|Native|Static|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceUtility.SetGraphInstanceOutputSize
	// void SetGraphInstanceOutputSize(class USubstanceGraphInstance* GraphInstance, TEnumAsByte<ESubstanceTextureSize> Width, TEnumAsByte<ESubstanceTextureSize> Height); // [0x13af820] Final|RequiredAPI|Native|Static|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceUtility.ResetInputParameters
	// void ResetInputParameters(class USubstanceGraphInstance* GraphInstance);                                                 // [0x13af7a0] Final|RequiredAPI|Native|Static|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceUtility.GetSubstanceTextures
	// TArray<USubstanceTexture2D*> GetSubstanceTextures(class USubstanceGraphInstance* GraphInstance);                         // [0x13af600] Final|RequiredAPI|Native|Static|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceUtility.GetSubstances
	// TArray<USubstanceGraphInstance*> GetSubstances(class UMaterialInterface* Material);                                      // [0x13af6d0] Final|RequiredAPI|Native|Static|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceUtility.GetSubstanceLoadingProgress
	// float GetSubstanceLoadingProgress();                                                                                     // [0x13af5d0] Final|RequiredAPI|Native|Static|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceUtility.GetGraphName
	// FString GetGraphName(class USubstanceGraphInstance* GraphInstance);                                                      // [0x13aea20] Final|RequiredAPI|Native|Static|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceUtility.GetFactoryName
	// FString GetFactoryName(class USubstanceGraphInstance* GraphInstance);                                                    // [0x13ae740] Final|RequiredAPI|Native|Static|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceUtility.EnableInstanceOutputs
	// void EnableInstanceOutputs(class UObject* WorldContextObject, class USubstanceGraphInstance* GraphInstance, TArray<int32_t> OutputIndices); // [0x13ae5b0] Final|RequiredAPI|Native|Static|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceUtility.DuplicateGraphInstance
	// class USubstanceGraphInstance* DuplicateGraphInstance(class UObject* WorldContextObject, class USubstanceGraphInstance* GraphInstance); // [0x13ae4e0] Final|RequiredAPI|Native|Static|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceUtility.DisableInstanceOutputs
	// void DisableInstanceOutputs(class UObject* WorldContextObject, class USubstanceGraphInstance* GraphInstance, TArray<int32_t> OutputIndices); // [0x13ae380] Final|RequiredAPI|Native|Static|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceUtility.CreateGraphInstance
	// class USubstanceGraphInstance* CreateGraphInstance(class UObject* WorldContextObject, class USubstanceInstanceFactory* Factory, int32_t GraphDescIndex, FString InstanceName); // [0x13ae1f0] Final|RequiredAPI|Native|Static|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceUtility.CreateAggregateSubstanceFactory
	// class USubstanceInstanceFactory* CreateAggregateSubstanceFactory(class USubstanceInstanceFactory* OutputFactory, int32_t OutputFactoryGraphIndex, class USubstanceInstanceFactory* InputFactory, int32_t InputFactoryGraphIndex, TArray<FSubstanceConnection>& Connections); // [0x13ae010] Final|RequiredAPI|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceUtility.CopyInputParameters
	// void CopyInputParameters(class USubstanceGraphInstance* SourceGraphInstance, class USubstanceGraphInstance* DestGraphInstance); // [0x13adf50] Final|RequiredAPI|Native|Static|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceUtility.ClearCache
	// void ClearCache();                                                                                                       // [0x13adf30] Final|RequiredAPI|Native|Static|Public|BlueprintCallable 
	// Function /Script/SubstanceCore.SubstanceUtility.AsyncRendering
	// void AsyncRendering(class USubstanceGraphInstance* InstancesToRender);                                                   // [0x13adeb0] Final|RequiredAPI|Native|Static|Public|BlueprintCallable 
};

/// Struct /Script/SubstanceCore.SubstanceInputDesc
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FSubstanceInputDesc
{ 
	FString                                            Name;                                                       // 0x0000   (0x0010)  
	TEnumAsByte<ESubstanceInputType>                   Type;                                                       // 0x0010   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0011   (0x0007)  MISSED
};

/// Struct /Script/SubstanceCore.SubstanceInstanceDesc
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 8 pad: 0x0000
struct FSubstanceInstanceDesc
{ 
	FString                                            Name;                                                       // 0x0000   (0x0010)  
	TArray<FSubstanceInputDesc>                        Inputs;                                                     // 0x0010   (0x0010)  
};

/// Struct /Script/SubstanceCore.SubstanceFloatInputDesc
/// Size: 0x0030 (48 bytes) (0x000018 - 0x000048) align 8 pad: 0x0000
struct FSubstanceFloatInputDesc : FSubstanceInputDesc
{ 
	TArray<float>                                      Min;                                                        // 0x0018   (0x0010)  
	TArray<float>                                      Max;                                                        // 0x0028   (0x0010)  
	TArray<float>                                      Default;                                                    // 0x0038   (0x0010)  
};

/// Struct /Script/SubstanceCore.SubstanceIntInputDesc
/// Size: 0x0030 (48 bytes) (0x000018 - 0x000048) align 8 pad: 0x0000
struct FSubstanceIntInputDesc : FSubstanceInputDesc
{ 
	TArray<int32_t>                                    Min;                                                        // 0x0018   (0x0010)  
	TArray<int32_t>                                    Max;                                                        // 0x0028   (0x0010)  
	TArray<int32_t>                                    Default;                                                    // 0x0038   (0x0010)  
};

/// Struct /Script/SubstanceCore.SubstanceConnection
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 8 pad: 0x0000
struct FSubstanceConnection
{ 
	FString                                            OutputIdentifier;                                           // 0x0000   (0x0010)  
	FString                                            InputImageIdentifier;                                       // 0x0010   (0x0010)  
};

static_assert(sizeof(USubstanceGraphInstance) == 0x0118); // 280 bytes (0x000028 - 0x000118)
static_assert(sizeof(USubstanceImageInput) == 0x00C8); // 200 bytes (0x000028 - 0x0000C8)
static_assert(sizeof(USubstanceInstanceFactory) == 0x0088); // 136 bytes (0x000028 - 0x000088)
static_assert(sizeof(USubstanceSettings) == 0x0040); // 64 bytes (0x000028 - 0x000040)
static_assert(sizeof(USubstanceTexture2D) == 0x0158); // 344 bytes (0x000100 - 0x000158)
static_assert(sizeof(USubstanceUtility) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FSubstanceInputDesc) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FSubstanceInstanceDesc) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(FSubstanceFloatInputDesc) == 0x0048); // 72 bytes (0x000018 - 0x000048)
static_assert(sizeof(FSubstanceIntInputDesc) == 0x0048); // 72 bytes (0x000018 - 0x000048)
static_assert(sizeof(FSubstanceConnection) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(offsetof(USubstanceGraphInstance, PackageURL) == 0x0038);
static_assert(offsetof(USubstanceGraphInstance, ParentFactory) == 0x0048);
static_assert(offsetof(USubstanceGraphInstance, CreatedMaterial) == 0x00A0);
static_assert(offsetof(USubstanceImageInput, SourceFilePath) == 0x0098);
static_assert(offsetof(USubstanceImageInput, SourceFileTimestamp) == 0x00A8);
static_assert(offsetof(USubstanceImageInput, Consumers) == 0x00B8);
static_assert(offsetof(USubstanceInstanceFactory, mGraphInstances) == 0x0028);
static_assert(offsetof(USubstanceInstanceFactory, RelativeSourceFilePath) == 0x0050);
static_assert(offsetof(USubstanceInstanceFactory, AbsoluteSourceFilePath) == 0x0060);
static_assert(offsetof(USubstanceInstanceFactory, SourceFileTimestamp) == 0x0070);
static_assert(offsetof(USubstanceInstanceFactory, GenerationMode) == 0x0080);
static_assert(offsetof(USubstanceSettings, DefaultGenerationMode) == 0x0038);
static_assert(offsetof(USubstanceSettings, SubstanceEngine) == 0x0039);
static_assert(offsetof(USubstanceSettings, DefaultSubstanceOutputSizeX) == 0x003A);
static_assert(offsetof(USubstanceSettings, DefaultSubstanceOutputSizeY) == 0x003B);
static_assert(offsetof(USubstanceTexture2D, ParentInstance) == 0x0130);
static_assert(offsetof(USubstanceTexture2D, AddressX) == 0x0138);
static_assert(offsetof(USubstanceTexture2D, AddressY) == 0x0139);
static_assert(offsetof(FSubstanceInputDesc, Name) == 0x0000);
static_assert(offsetof(FSubstanceInputDesc, Type) == 0x0010);
static_assert(offsetof(FSubstanceInstanceDesc, Name) == 0x0000);
static_assert(offsetof(FSubstanceInstanceDesc, Inputs) == 0x0010);
static_assert(offsetof(FSubstanceFloatInputDesc, Min) == 0x0018);
static_assert(offsetof(FSubstanceFloatInputDesc, Max) == 0x0028);
static_assert(offsetof(FSubstanceFloatInputDesc, Default) == 0x0038);
static_assert(offsetof(FSubstanceIntInputDesc, Min) == 0x0018);
static_assert(offsetof(FSubstanceIntInputDesc, Max) == 0x0028);
static_assert(offsetof(FSubstanceIntInputDesc, Default) == 0x0038);
static_assert(offsetof(FSubstanceConnection, OutputIdentifier) == 0x0000);
static_assert(offsetof(FSubstanceConnection, InputImageIdentifier) == 0x0010);
