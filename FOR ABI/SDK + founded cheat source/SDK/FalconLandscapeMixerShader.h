
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Enum /Script/FalconLandscapeMixerShader.ESubRegionReductionKernel
/// Size: 0x01 (1 bytes)
enum class ESubRegionReductionKernel : uint8_t
{
	ESubRegionReductionKernel__Min                                                   = 0,
	ESubRegionReductionKernel__Max                                                   = 1,
	ESubRegionReductionKernel__Mean                                                  = 2
};

/// Enum /Script/FalconLandscapeMixerShader.EScriptUtilityBufferFormat
/// Size: 0x01 (1 bytes)
enum class EScriptUtilityBufferFormat : uint8_t
{
	EScriptUtilityBufferFormat__Float                                                = 0,
	EScriptUtilityBufferFormat__UInt                                                 = 1
};

/// Enum /Script/FalconLandscapeMixerShader.EFalconBicubicFunction
/// Size: 0x01 (1 bytes)
enum class EFalconBicubicFunction : uint8_t
{
	EFalconBicubicFunction__BSpline                                                  = 0,
	EFalconBicubicFunction__Custom                                                   = 1,
	EFalconBicubicFunction__CatmullRom                                               = 2
};

/// Class /Script/FalconLandscapeMixerShader.FalconDataViewBPLibrary
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UFalconDataViewBPLibrary : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/FalconLandscapeMixerShader.FalconDataViewBPLibrary.TextureView_SetData
	// int32_t TextureView_SetData(FFalconScriptTextureView& TextureViewDst, FFalconScriptTextureView& TextureViewSrc);         // [0x1758480] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/FalconLandscapeMixerShader.FalconDataViewBPLibrary.TextureView_FillData
	// void TextureView_FillData(FFalconScriptTextureView& View, float Value);                                                  // [0x17583a0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/FalconLandscapeMixerShader.FalconDataViewBPLibrary.TextureView_Clip
	// FFalconScriptTextureView TextureView_Clip(FFalconScriptTextureView& TextureView, FIntPoint& Lo, FIntPoint& Hi);          // [0x1758220] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/FalconLandscapeMixerShader.FalconDataViewBPLibrary.TextureView_ClearData
	// void TextureView_ClearData(FFalconScriptTextureView& View);                                                              // [0x1758190] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/FalconLandscapeMixerShader.FalconDataViewBPLibrary.MakeTextureView
	// void MakeTextureView(class UTexture* Texture, int32_t Channel, FFalconScriptTextureView& OutputTextureView);             // [0x1758070] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/FalconLandscapeMixerShader.FalconFilterMixShaderUtil
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UFalconFilterMixShaderUtil : public UObject
{ 
public:
};

/// Class /Script/FalconLandscapeMixerShader.FalconFoliageMixShaderUtil
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UFalconFoliageMixShaderUtil : public UObject
{ 
public:
};

/// Class /Script/FalconLandscapeMixerShader.FalconGadgetScatter
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UFalconGadgetScatter : public UObject
{ 
public:
};

/// Class /Script/FalconLandscapeMixerShader.FalconGadgetScatterSdfCS
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UFalconGadgetScatterSdfCS : public UObject
{ 
public:
};

/// Class /Script/FalconLandscapeMixerShader.FalconHandcraftShaderUtils
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UFalconHandcraftShaderUtils : public UObject
{ 
public:
};

/// Class /Script/FalconLandscapeMixerShader.FalconLandscapeMediatorUtils
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UFalconLandscapeMediatorUtils : public UObject
{ 
public:
};

/// Class /Script/FalconLandscapeMixerShader.FalconLandscapeMixerShaderUtils
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UFalconLandscapeMixerShaderUtils : public UObject
{ 
public:
};

/// Class /Script/FalconLandscapeMixerShader.FalconNoiseMixShaderUtil
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UFalconNoiseMixShaderUtil : public UObject
{ 
public:
};

/// Class /Script/FalconLandscapeMixerShader.FalconPathRasterizeShaderUtil
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UFalconPathRasterizeShaderUtil : public UObject
{ 
public:
};

/// Struct /Script/FalconLandscapeMixerShader.FalconPlacementToolSphereRigidbody
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 4 pad: 0x0000
struct FFalconPlacementToolSphereRigidbody
{ 
	FVector                                            Location;                                                   // 0x0000   (0x000C)  
	FVector                                            Velocity;                                                   // 0x000C   (0x000C)  
	FVector                                            AngularVelocity;                                            // 0x0018   (0x000C)  
	float                                              Radius;                                                     // 0x0024   (0x0004)  
};

/// Struct /Script/FalconLandscapeMixerShader.FalconPlacementToolPolygonRigidbody
/// Size: 0x0058 (88 bytes) (0x000000 - 0x000058) align 8 pad: 0x0000
struct FFalconPlacementToolPolygonRigidbody
{ 
	FVector                                            Location;                                                   // 0x0000   (0x000C)  
	FRotator                                           Rotation;                                                   // 0x000C   (0x000C)  
	FVector                                            Velocity;                                                   // 0x0018   (0x000C)  
	FVector                                            AngularVelocity;                                            // 0x0024   (0x000C)  
	FVector                                            BoundMin;                                                   // 0x0030   (0x000C)  
	FVector                                            BoundMax;                                                   // 0x003C   (0x000C)  
	class UVolumeTexture*                              SDFTexture;                                                 // 0x0048   (0x0008)  
	SDK_UNDEFINED(8,2230) /* TWeakObjectPtr<AStaticMeshActor*> */ __um(SMActor);                                   // 0x0050   (0x0008)  
};

/// Class /Script/FalconLandscapeMixerShader.FalconPlacementToolSimulationUtil
/// Size: 0x0108 (264 bytes) (0x000028 - 0x000130) align 8 pad: 0x0000
class UFalconPlacementToolSimulationUtil : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x48];                                      // 0x0028   (0x0048)  MISSED
	FVector                                            WorldScale;                                                 // 0x0070   (0x000C)  
	int32_t                                            GridSize;                                                   // 0x007C   (0x0004)  
	float                                              ManualTime;                                                 // 0x0080   (0x0004)  
	float                                              MinCFLTime;                                                 // 0x0084   (0x0004)  
	int32_t                                            DebugMipmaps;                                               // 0x0088   (0x0004)  
	SDK_UNDEFINED(8,2231) /* TWeakObjectPtr<UTextureRenderTarget2D*> */ __um(OutputMaskRT);                        // 0x008C   (0x0008)  
	SDK_UNDEFINED(8,2232) /* TWeakObjectPtr<UTextureRenderTarget2D*> */ __um(OutputHeightRT);                      // 0x0094   (0x0008)  
	bool                                               bDebug;                                                     // 0x009C   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x009D   (0x0003)  MISSED
	class UTextureRenderTarget2D*                      DebugGridRT;                                                // 0x00A0   (0x0008)  
	class UTextureRenderTarget2D*                      DebugInitHeightField;                                       // 0x00A8   (0x0008)  
	class UTextureRenderTarget2D*                      DebugVelocity;                                              // 0x00B0   (0x0008)  
	class UTextureRenderTarget2D*                      DebugCFLLimit;                                              // 0x00B8   (0x0008)  
	SDK_UNDEFINED(8,2233) /* TWeakObjectPtr<UTexture2D*> */ __um(LandscapeHeightField);                            // 0x00C0   (0x0008)  
	SDK_UNDEFINED(8,2234) /* TWeakObjectPtr<UTexture2D*> */ __um(ThicknessField);                                  // 0x00C8   (0x0008)  
	TArray<FFalconPlacementToolSphereRigidbody>        SphereRigidbodies;                                          // 0x00D0   (0x0010)  
	TArray<FFalconPlacementToolPolygonRigidbody>       PolygonRigidbodies;                                         // 0x00E0   (0x0010)  
	float                                              FrictionAngle;                                              // 0x00F0   (0x0004)  
	float                                              DragForce;                                                  // 0x00F4   (0x0004)  
	TArray<float>                                      OutputMaskDatas;                                            // 0x00F8   (0x0010)  
	float                                              Thickness;                                                  // 0x0108   (0x0004)  
	unsigned char                                      UnknownData02_7[0x24];                                      // 0x010C   (0x0024)  MISSED
};

/// Class /Script/FalconLandscapeMixerShader.FalconRealtimeErosionShaderUtil
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UFalconRealtimeErosionShaderUtil : public UObject
{ 
public:
};

/// Class /Script/FalconLandscapeMixerShader.FalconScriptCSUtility
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UFalconScriptCSUtility : public UObject
{ 
public:
};

/// Class /Script/FalconLandscapeMixerShader.FalconSparseRTMask
/// Size: 0x0058 (88 bytes) (0x000028 - 0x000080) align 8 pad: 0x0000
class UFalconSparseRTMask : public UObject
{ 
public:
	char                                               BaseValue;                                                  // 0x0028   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0029   (0x0003)  MISSED
	int32_t                                            BlockSize;                                                  // 0x002C   (0x0004)  
	SDK_UNDEFINED(80,2235) /* TMap<FIntPoint, FFalconRTAllocation> */ __um(XYtoAllocationMap);                     // 0x0030   (0x0050)  
};

/// Class /Script/FalconLandscapeMixerShader.FalconTextureCheckEqual
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UFalconTextureCheckEqual : public UObject
{ 
public:
};

/// Class /Script/FalconLandscapeMixerShader.FalconTextureMixShaderUtils
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UFalconTextureMixShaderUtils : public UObject
{ 
public:
};

/// Class /Script/FalconLandscapeMixerShader.FalconUtilityShaderUtils
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UFalconUtilityShaderUtils : public UObject
{ 
public:
};

/// Class /Script/FalconLandscapeMixerShader.FalconWaterShaderUtil
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UFalconWaterShaderUtil : public UObject
{ 
public:
};

/// Struct /Script/FalconLandscapeMixerShader.FalconScriptTextureView
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 8 pad: 0x0000
struct FFalconScriptTextureView
{ 
	unsigned char                                      UnknownData00_2[0x20];                                      // 0x0000   (0x0020)  MISSED
};

/// Struct /Script/FalconLandscapeMixerShader.Scatter3DPattern
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 8 pad: 0x0000
struct FScatter3DPattern
{ 
	TArray<FVector>                                    PointCloud;                                                 // 0x0000   (0x0010)  
	FVector                                            Size;                                                       // 0x0010   (0x000C)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x001C   (0x0004)  MISSED
};

/// Struct /Script/FalconLandscapeMixerShader.FalconRingVertex
/// Size: 0x000C (12 bytes) (0x000000 - 0x00000C) align 4 pad: 0x0000
struct FFalconRingVertex
{ 
	FVector                                            position;                                                   // 0x0000   (0x000C)  
};

/// Struct /Script/FalconLandscapeMixerShader.FalconRTAllocation
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FFalconRTAllocation
{ 
	class UTextureRenderTarget2D*                      Texture;                                                    // 0x0000   (0x0008)  
	FIntPoint                                          BasePoint;                                                  // 0x0008   (0x0008)  
};

static_assert(sizeof(UFalconDataViewBPLibrary) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UFalconFilterMixShaderUtil) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UFalconFoliageMixShaderUtil) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UFalconGadgetScatter) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UFalconGadgetScatterSdfCS) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UFalconHandcraftShaderUtils) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UFalconLandscapeMediatorUtils) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UFalconLandscapeMixerShaderUtils) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UFalconNoiseMixShaderUtil) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UFalconPathRasterizeShaderUtil) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FFalconPlacementToolSphereRigidbody) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(FFalconPlacementToolPolygonRigidbody) == 0x0058); // 88 bytes (0x000000 - 0x000058)
static_assert(sizeof(UFalconPlacementToolSimulationUtil) == 0x0130); // 304 bytes (0x000028 - 0x000130)
static_assert(sizeof(UFalconRealtimeErosionShaderUtil) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UFalconScriptCSUtility) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UFalconSparseRTMask) == 0x0080); // 128 bytes (0x000028 - 0x000080)
static_assert(sizeof(UFalconTextureCheckEqual) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UFalconTextureMixShaderUtils) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UFalconUtilityShaderUtils) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UFalconWaterShaderUtil) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FFalconScriptTextureView) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(FScatter3DPattern) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(FFalconRingVertex) == 0x000C); // 12 bytes (0x000000 - 0x00000C)
static_assert(sizeof(FFalconRTAllocation) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(offsetof(FFalconPlacementToolSphereRigidbody, Location) == 0x0000);
static_assert(offsetof(FFalconPlacementToolSphereRigidbody, Velocity) == 0x000C);
static_assert(offsetof(FFalconPlacementToolSphereRigidbody, AngularVelocity) == 0x0018);
static_assert(offsetof(FFalconPlacementToolPolygonRigidbody, Location) == 0x0000);
static_assert(offsetof(FFalconPlacementToolPolygonRigidbody, Rotation) == 0x000C);
static_assert(offsetof(FFalconPlacementToolPolygonRigidbody, Velocity) == 0x0018);
static_assert(offsetof(FFalconPlacementToolPolygonRigidbody, AngularVelocity) == 0x0024);
static_assert(offsetof(FFalconPlacementToolPolygonRigidbody, BoundMin) == 0x0030);
static_assert(offsetof(FFalconPlacementToolPolygonRigidbody, BoundMax) == 0x003C);
static_assert(offsetof(FFalconPlacementToolPolygonRigidbody, SDFTexture) == 0x0048);
static_assert(offsetof(UFalconPlacementToolSimulationUtil, WorldScale) == 0x0070);
static_assert(offsetof(UFalconPlacementToolSimulationUtil, DebugGridRT) == 0x00A0);
static_assert(offsetof(UFalconPlacementToolSimulationUtil, DebugInitHeightField) == 0x00A8);
static_assert(offsetof(UFalconPlacementToolSimulationUtil, DebugVelocity) == 0x00B0);
static_assert(offsetof(UFalconPlacementToolSimulationUtil, DebugCFLLimit) == 0x00B8);
static_assert(offsetof(UFalconPlacementToolSimulationUtil, SphereRigidbodies) == 0x00D0);
static_assert(offsetof(UFalconPlacementToolSimulationUtil, PolygonRigidbodies) == 0x00E0);
static_assert(offsetof(UFalconPlacementToolSimulationUtil, OutputMaskDatas) == 0x00F8);
static_assert(offsetof(FScatter3DPattern, PointCloud) == 0x0000);
static_assert(offsetof(FScatter3DPattern, Size) == 0x0010);
static_assert(offsetof(FFalconRingVertex, position) == 0x0000);
static_assert(offsetof(FFalconRTAllocation, Texture) == 0x0000);
static_assert(offsetof(FFalconRTAllocation, BasePoint) == 0x0008);
