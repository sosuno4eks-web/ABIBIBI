
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: InputCore
/// dependency: LevelSequence

/// Enum /Script/GLTFExporterRuntime.EGLTFCameraControlMode
/// Size: 0x01 (1 bytes)
enum class EGLTFCameraControlMode : uint8_t
{
	EGLTFCameraControlMode__FreeLook                                                 = 0,
	EGLTFCameraControlMode__Orbital                                                  = 1
};

/// Enum /Script/GLTFExporterRuntime.EGLTFMaterialPropertyGroup
/// Size: 0x01 (1 bytes)
enum class EGLTFMaterialPropertyGroup : uint8_t
{
	EGLTFMaterialPropertyGroup__None                                                 = 0,
	EGLTFMaterialPropertyGroup__BaseColorOpacity                                     = 1,
	EGLTFMaterialPropertyGroup__MetallicRoughness                                    = 2,
	EGLTFMaterialPropertyGroup__EmissiveColor                                        = 3,
	EGLTFMaterialPropertyGroup__Normal                                               = 4,
	EGLTFMaterialPropertyGroup__AmbientOcclusion                                     = 5,
	EGLTFMaterialPropertyGroup__ClearCoatRoughness                                   = 6,
	EGLTFMaterialPropertyGroup__ClearCoatBottomNormal                                = 7
};

/// Enum /Script/GLTFExporterRuntime.EGLTFMaterialBakeSizePOT
/// Size: 0x01 (1 bytes)
enum class EGLTFMaterialBakeSizePOT : uint8_t
{
	EGLTFMaterialBakeSizePOT__POT                                                    = 0,
	EGLTFMaterialBakeSizePOT__POT2                                                   = 1,
	EGLTFMaterialBakeSizePOT__POT3                                                   = 2,
	EGLTFMaterialBakeSizePOT__POT4                                                   = 3,
	EGLTFMaterialBakeSizePOT__POT5                                                   = 4,
	EGLTFMaterialBakeSizePOT__POT6                                                   = 5,
	EGLTFMaterialBakeSizePOT__POT7                                                   = 6,
	EGLTFMaterialBakeSizePOT__POT8                                                   = 7,
	EGLTFMaterialBakeSizePOT__POT9                                                   = 8,
	EGLTFMaterialBakeSizePOT__POT10                                                  = 9,
	EGLTFMaterialBakeSizePOT__POT11                                                  = 10,
	EGLTFMaterialBakeSizePOT__POT12                                                  = 11,
	EGLTFMaterialBakeSizePOT__POT13                                                  = 12,
	EGLTFMaterialBakeSizePOT__POT14                                                  = 13
};

/// Enum /Script/GLTFExporterRuntime.EGLTFMaterialBakeMode
/// Size: 0x01 (1 bytes)
enum class EGLTFMaterialBakeMode : uint8_t
{
	EGLTFMaterialBakeMode__Disabled                                                  = 0,
	EGLTFMaterialBakeMode__Simple                                                    = 1,
	EGLTFMaterialBakeMode__UseMeshData                                               = 2
};

/// Class /Script/GLTFExporterRuntime.GLTFCameraActor
/// Size: 0x0060 (96 bytes) (0x000900 - 0x000960) align 16 pad: 0x0000
class AGLTFCameraActor : public ACameraActor
{ 
public:
	EGLTFCameraControlMode                             Mode;                                                       // 0x0900   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0901   (0x0007)  MISSED
	class AActor*                                      Target;                                                     // 0x0908   (0x0008)  
	float                                              PitchAngleMin;                                              // 0x0910   (0x0004)  
	float                                              PitchAngleMax;                                              // 0x0914   (0x0004)  
	float                                              YawAngleMin;                                                // 0x0918   (0x0004)  
	float                                              YawAngleMax;                                                // 0x091C   (0x0004)  
	float                                              DistanceMin;                                                // 0x0920   (0x0004)  
	float                                              DistanceMax;                                                // 0x0924   (0x0004)  
	float                                              DollyDuration;                                              // 0x0928   (0x0004)  
	float                                              DollySensitivity;                                           // 0x092C   (0x0004)  
	float                                              RotationInertia;                                            // 0x0930   (0x0004)  
	float                                              RotationSensitivity;                                        // 0x0934   (0x0004)  
	unsigned char                                      UnknownData01_7[0x28];                                      // 0x0938   (0x0028)  MISSED


	/// Functions
	// Function /Script/GLTFExporterRuntime.GLTFCameraActor.OnMouseY
	// void OnMouseY(float AxisValue);                                                                                          // [0x18bccb0] Final|Native|Private 
	// Function /Script/GLTFExporterRuntime.GLTFCameraActor.OnMouseX
	// void OnMouseX(float AxisValue);                                                                                          // [0x18bcc30] Final|Native|Private 
	// Function /Script/GLTFExporterRuntime.GLTFCameraActor.OnMouseWheelAxis
	// void OnMouseWheelAxis(float AxisValue);                                                                                  // [0x18bcbb0] Final|Native|Private 
};

/// Class /Script/GLTFExporterRuntime.GLTFHotspotActor
/// Size: 0x00A0 (160 bytes) (0x0002E0 - 0x000380) align 8 pad: 0x0000
class AGLTFHotspotActor : public AActor
{ 
public:
	class ASkeletalMeshActor*                          SkeletalMeshActor;                                          // 0x02E0   (0x0008)  
	class UAnimSequence*                               AnimationSequence;                                          // 0x02E8   (0x0008)  
	class ULevelSequence*                              LevelSequence;                                              // 0x02F0   (0x0008)  
	class UTexture2D*                                  Image;                                                      // 0x02F8   (0x0008)  
	class UTexture2D*                                  HoveredImage;                                               // 0x0300   (0x0008)  
	class UTexture2D*                                  ToggledImage;                                               // 0x0308   (0x0008)  
	class UTexture2D*                                  ToggledHoveredImage;                                        // 0x0310   (0x0008)  
	class UMaterialBillboardComponent*                 BillboardComponent;                                         // 0x0318   (0x0008)  
	class USphereComponent*                            SphereComponent;                                            // 0x0320   (0x0008)  
	class UMaterialInterface*                          DefaultMaterial;                                            // 0x0328   (0x0008)  
	class UTexture2D*                                  DefaultImage;                                               // 0x0330   (0x0008)  
	class UTexture2D*                                  DefaultHoveredImage;                                        // 0x0338   (0x0008)  
	class UTexture2D*                                  DefaultToggledImage;                                        // 0x0340   (0x0008)  
	class UTexture2D*                                  DefaultToggledHoveredImage;                                 // 0x0348   (0x0008)  
	class UMaterialInterface*                          DefaultIconMaterial;                                        // 0x0350   (0x0008)  
	class UTexture*                                    ActiveImage;                                                // 0x0358   (0x0008)  
	class ULevelSequencePlayer*                        LevelSequencePlayer;                                        // 0x0360   (0x0008)  
	unsigned char                                      UnknownData00_7[0x18];                                      // 0x0368   (0x0018)  MISSED


	/// Functions
	// Function /Script/GLTFExporterRuntime.GLTFHotspotActor.EndCursorOver
	// void EndCursorOver(class UPrimitiveComponent* TouchedComponent);                                                         // [0x18bcb20] Final|Native|Private 
	// Function /Script/GLTFExporterRuntime.GLTFHotspotActor.Clicked
	// void Clicked(class UPrimitiveComponent* TouchedComponent, FKey ButtonPressed);                                           // [0x18bc9f0] Final|Native|Private 
	// Function /Script/GLTFExporterRuntime.GLTFHotspotActor.BeginCursorOver
	// void BeginCursorOver(class UPrimitiveComponent* TouchedComponent);                                                       // [0x18bc960] Final|Native|Private 
};

/// Struct /Script/GLTFExporterRuntime.GLTFOverrideMaterialBakeSettings
/// Size: 0x0006 (6 bytes) (0x000000 - 0x000006) align 1 pad: 0x0000
struct FGLTFOverrideMaterialBakeSettings
{ 
	bool                                               bOverrideSize;                                              // 0x0000   (0x0001)  
	EGLTFMaterialBakeSizePOT                           Size;                                                       // 0x0001   (0x0001)  
	bool                                               bOverrideFilter;                                            // 0x0002   (0x0001)  
	TEnumAsByte<TextureFilter>                         Filter;                                                     // 0x0003   (0x0001)  
	bool                                               bOverrideTiling;                                            // 0x0004   (0x0001)  
	TEnumAsByte<TextureAddress>                        Tiling;                                                     // 0x0005   (0x0001)  
};

/// Class /Script/GLTFExporterRuntime.GLTFMaterialExportOptions
/// Size: 0x0058 (88 bytes) (0x000028 - 0x000080) align 8 pad: 0x0000
class UGLTFMaterialExportOptions : public UAssetUserData
{ 
public:
	FGLTFOverrideMaterialBakeSettings                  Default;                                                    // 0x0028   (0x0006)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x002E   (0x0002)  MISSED
	SDK_UNDEFINED(80,2673) /* TMap<EGLTFMaterialPropertyGroup, FGLTFOverrideMaterialBakeSettings> */ __um(Inputs); // 0x0030   (0x0050)  
};

static_assert(sizeof(AGLTFCameraActor) == 0x0960); // 2400 bytes (0x000900 - 0x000960)
static_assert(sizeof(AGLTFHotspotActor) == 0x0380); // 896 bytes (0x0002E0 - 0x000380)
static_assert(sizeof(FGLTFOverrideMaterialBakeSettings) == 0x0006); // 6 bytes (0x000000 - 0x000006)
static_assert(sizeof(UGLTFMaterialExportOptions) == 0x0080); // 128 bytes (0x000028 - 0x000080)
static_assert(offsetof(AGLTFCameraActor, Mode) == 0x0900);
static_assert(offsetof(AGLTFCameraActor, Target) == 0x0908);
static_assert(offsetof(AGLTFHotspotActor, SkeletalMeshActor) == 0x02E0);
static_assert(offsetof(AGLTFHotspotActor, AnimationSequence) == 0x02E8);
static_assert(offsetof(AGLTFHotspotActor, LevelSequence) == 0x02F0);
static_assert(offsetof(AGLTFHotspotActor, Image) == 0x02F8);
static_assert(offsetof(AGLTFHotspotActor, HoveredImage) == 0x0300);
static_assert(offsetof(AGLTFHotspotActor, ToggledImage) == 0x0308);
static_assert(offsetof(AGLTFHotspotActor, ToggledHoveredImage) == 0x0310);
static_assert(offsetof(AGLTFHotspotActor, BillboardComponent) == 0x0318);
static_assert(offsetof(AGLTFHotspotActor, SphereComponent) == 0x0320);
static_assert(offsetof(AGLTFHotspotActor, DefaultMaterial) == 0x0328);
static_assert(offsetof(AGLTFHotspotActor, DefaultImage) == 0x0330);
static_assert(offsetof(AGLTFHotspotActor, DefaultHoveredImage) == 0x0338);
static_assert(offsetof(AGLTFHotspotActor, DefaultToggledImage) == 0x0340);
static_assert(offsetof(AGLTFHotspotActor, DefaultToggledHoveredImage) == 0x0348);
static_assert(offsetof(AGLTFHotspotActor, DefaultIconMaterial) == 0x0350);
static_assert(offsetof(AGLTFHotspotActor, ActiveImage) == 0x0358);
static_assert(offsetof(AGLTFHotspotActor, LevelSequencePlayer) == 0x0360);
static_assert(offsetof(FGLTFOverrideMaterialBakeSettings, Size) == 0x0001);
static_assert(offsetof(FGLTFOverrideMaterialBakeSettings, Filter) == 0x0003);
static_assert(offsetof(FGLTFOverrideMaterialBakeSettings, Tiling) == 0x0005);
static_assert(offsetof(UGLTFMaterialExportOptions, Default) == 0x0028);
