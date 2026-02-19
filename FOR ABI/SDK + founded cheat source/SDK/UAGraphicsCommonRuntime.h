
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Enum /Script/UAGraphicsCommonRuntime.EShadowMode
/// Size: 0x01 (1 bytes)
enum class EShadowMode : uint8_t
{
	SM_Normal                                                                        = 0,
	SM_CustomBounds                                                                  = 1
};

/// Struct /Script/UAGraphicsCommonRuntime.ScalarParameterSetting
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FScalarParameterSetting
{ 
	FString                                            Name;                                                       // 0x0000   (0x0010)  
	float                                              Value;                                                      // 0x0010   (0x0004)  
	float                                              ResetValue;                                                 // 0x0014   (0x0004)  
};

/// Struct /Script/UAGraphicsCommonRuntime.VectorParameterSetting
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 8 pad: 0x0000
struct FVectorParameterSetting
{ 
	FString                                            Name;                                                       // 0x0000   (0x0010)  
	FLinearColor                                       Value;                                                      // 0x0010   (0x0010)  
	FLinearColor                                       ResetValue;                                                 // 0x0020   (0x0010)  
};

/// Class /Script/UAGraphicsCommonRuntime.MFCSettingsComponent
/// Size: 0x0030 (48 bytes) (0x0000F8 - 0x000128) align 8 pad: 0x0000
class UMFCSettingsComponent : public UActorComponent
{ 
public:
	class UMaterialParameterCollection*                TargetMFC;                                                  // 0x00F8   (0x0008)  
	TArray<FScalarParameterSetting>                    ScalarParameterSettings;                                    // 0x0100   (0x0010)  
	TArray<FVectorParameterSetting>                    VectorParameterSettings;                                    // 0x0110   (0x0010)  
	unsigned char                                      UnknownData00_7[0x8];                                       // 0x0120   (0x0008)  MISSED


	/// Functions
	// Function /Script/UAGraphicsCommonRuntime.MFCSettingsComponent.UpdateMFCParamValues
	// void UpdateMFCParamValues(bool bUseResetValue);                                                                          // [0x2fe7f20] Final|Native|Protected|BlueprintCallable 
};

/// Class /Script/UAGraphicsCommonRuntime.UASceneCheckComponent
/// Size: 0x0080 (128 bytes) (0x0000F8 - 0x000178) align 8 pad: 0x0000
class UUASceneCheckComponent : public UActorComponent
{ 
public:
	unsigned char                                      UnknownData00_1[0x80];                                      // 0x00F8   (0x0080)  MISSED


	/// Functions
	// Function /Script/UAGraphicsCommonRuntime.UASceneCheckComponent.RegisterSelfToSingleton
	// void RegisterSelfToSingleton();                                                                                          // [0x2fe7f00] Final|Native|Public  
};

/// Class /Script/UAGraphicsCommonRuntime.UAShadowSettingComponent
/// Size: 0x0020 (32 bytes) (0x000220 - 0x000240) align 16 pad: 0x0000
class UUAShadowSettingComponent : public USceneComponent
{ 
public:
	TEnumAsByte<EShadowMode>                           ShadowMode;                                                 // 0x0220   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0221   (0x0003)  MISSED
	int32_t                                            CSMResolutionScale;                                         // 0x0224   (0x0004)  
	bool                                               bEnableCSMCache;                                            // 0x0228   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0229   (0x0003)  MISSED
	float                                              BoundsRadius;                                               // 0x022C   (0x0004)  
	class UDrawSphereComponent*                        PreviewInfluenceRadius;                                     // 0x0230   (0x0008)  
	class UDirectionalLightComponent*                  DirectionalLightComponent;                                  // 0x0238   (0x0008)  
};

static_assert(sizeof(FScalarParameterSetting) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FVectorParameterSetting) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(sizeof(UMFCSettingsComponent) == 0x0128); // 296 bytes (0x0000F8 - 0x000128)
static_assert(sizeof(UUASceneCheckComponent) == 0x0178); // 376 bytes (0x0000F8 - 0x000178)
static_assert(sizeof(UUAShadowSettingComponent) == 0x0240); // 576 bytes (0x000220 - 0x000240)
static_assert(offsetof(FScalarParameterSetting, Name) == 0x0000);
static_assert(offsetof(FVectorParameterSetting, Name) == 0x0000);
static_assert(offsetof(FVectorParameterSetting, Value) == 0x0010);
static_assert(offsetof(FVectorParameterSetting, ResetValue) == 0x0020);
static_assert(offsetof(UMFCSettingsComponent, TargetMFC) == 0x00F8);
static_assert(offsetof(UMFCSettingsComponent, ScalarParameterSettings) == 0x0100);
static_assert(offsetof(UMFCSettingsComponent, VectorParameterSettings) == 0x0110);
static_assert(offsetof(UUAShadowSettingComponent, ShadowMode) == 0x0220);
static_assert(offsetof(UUAShadowSettingComponent, PreviewInfluenceRadius) == 0x0230);
static_assert(offsetof(UUAShadowSettingComponent, DirectionalLightComponent) == 0x0238);
