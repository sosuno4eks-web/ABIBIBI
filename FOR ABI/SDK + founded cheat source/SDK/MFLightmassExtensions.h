
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: CoreUObject
/// dependency: Engine

/// Class /Script/MFLightmassExtensions.MFVLMOffsetSampleStaticMeshComponent
/// Size: 0x0040 (64 bytes) (0x000680 - 0x0006C0) align 16 pad: 0x0000
class UMFVLMOffsetSampleStaticMeshComponent : public UStaticMeshComponent
{ 
public:
	float                                              ZClampHeight;                                               // 0x0680   (0x0004)  
	FVector                                            PlaneCenter;                                                // 0x0684   (0x000C)  
	unsigned char                                      UnknownData00_7[0x30];                                      // 0x0690   (0x0030)  MISSED
};

/// Class /Script/MFLightmassExtensions.MFILCDebugSamplePointActor
/// Size: 0x0000 (0 bytes) (0x0002E0 - 0x0002E0) align 8 pad: 0x0000
class AMFILCDebugSamplePointActor : public AActor
{ 
public:
};

/// Class /Script/MFLightmassExtensions.MFILCDebugSamplePointComponent
/// Size: 0x0008 (8 bytes) (0x0005D8 - 0x0005E0) align 16 pad: 0x0000
class UMFILCDebugSamplePointComponent : public UPrimitiveComponent
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x05D8   (0x0008)  MISSED
};

/// Class /Script/MFLightmassExtensions.MFILCDynamicScaleComponent
/// Size: 0x0018 (24 bytes) (0x000228 - 0x000240) align 16 pad: 0x0000
class UMFILCDynamicScaleComponent : public UIndirectLightingDynamicInjectionComponent
{ 
public:
	float                                              CenterRadius;                                               // 0x0228   (0x0004)  
	float                                              SkyLightLerpFactor;                                         // 0x022C   (0x0004)  
	float                                              ILCScaleFactor;                                             // 0x0230   (0x0004)  
	float                                              SkyLightScaleFactor;                                        // 0x0234   (0x0004)  
	unsigned char                                      UnknownData00_7[0x8];                                       // 0x0238   (0x0008)  MISSED


	/// Functions
	// Function /Script/MFLightmassExtensions.MFILCDynamicScaleComponent.SetSkyLightScaleFactor
	// void SetSkyLightScaleFactor(float SkyLightScaleFactor);                                                                  // [0x2f44ce0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFLightmassExtensions.MFILCDynamicScaleComponent.SetSkyLightLerpFactor
	// void SetSkyLightLerpFactor(float SkyLightLerpFactor);                                                                    // [0x2f44c60] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFLightmassExtensions.MFILCDynamicScaleComponent.SetILCScaleFactor
	// void SetILCScaleFactor(float ILCScaleFactor);                                                                            // [0x2f44be0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFLightmassExtensions.MFILCDynamicScaleVolume
/// Size: 0x0008 (8 bytes) (0x0002E0 - 0x0002E8) align 8 pad: 0x0000
class AMFILCDynamicScaleVolume : public AActor
{ 
public:
	class UMFILCDynamicScaleComponent*                 ILCDynamicScaleComponent;                                   // 0x02E0   (0x0008)  
};

/// Class /Script/MFLightmassExtensions.MFILCMaskVolume
/// Size: 0x0008 (8 bytes) (0x000328 - 0x000330) align 8 pad: 0x0000
class AMFILCMaskVolume : public ALightmassInteriorMaskActor
{ 
public:
	bool                                               bEnableDivideILC : 1;                                       // 0x0328:0 (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0329   (0x0007)  MISSED
};

/// Class /Script/MFLightmassExtensions.MFILCTwoSideSampleStaticMeshComponent
/// Size: 0x0050 (80 bytes) (0x000680 - 0x0006D0) align 16 pad: 0x0000
class UMFILCTwoSideSampleStaticMeshComponent : public UStaticMeshComponent
{ 
public:
	bool                                               bUseTwoSideILCSample : 1;                                   // 0x0680:0 (0x0001)  
	unsigned char                                      UnknownData00_5[0x3];                                       // 0x0681   (0x0003)  MISSED
	float                                              ForwardSampleHeightOffset;                                  // 0x0684   (0x0004)  
	float                                              BackSampleHeightOffset;                                     // 0x0688   (0x0004)  
	float                                              ForwardSampleDistanceOffset;                                // 0x068C   (0x0004)  
	float                                              BackSampleDistanceOffset;                                   // 0x0690   (0x0004)  
	float                                              ForwardSampleHorizontalOffset;                              // 0x0694   (0x0004)  
	float                                              BackSampleHorizontalOffset;                                 // 0x0698   (0x0004)  
	float                                              IndoorSkyVisibilityCompensation;                            // 0x069C   (0x0004)  
	float                                              ForwardBackLerpMin;                                         // 0x06A0   (0x0004)  
	float                                              ForwardBackLerpMax;                                         // 0x06A4   (0x0004)  
	float                                              BrightnessMultiplierForward;                                // 0x06A8   (0x0004)  
	float                                              BrightnessMultiplierBack;                                   // 0x06AC   (0x0004)  
	FVector                                            CachedActorForwardDirection;                                // 0x06B0   (0x000C)  
	FVector                                            CachedActorRightDirection;                                  // 0x06BC   (0x000C)  
	unsigned char                                      UnknownData01_7[0x8];                                       // 0x06C8   (0x0008)  MISSED
};

static_assert(sizeof(UMFVLMOffsetSampleStaticMeshComponent) == 0x06C0); // 1728 bytes (0x000680 - 0x0006C0)
static_assert(sizeof(AMFILCDebugSamplePointActor) == 0x02E0); // 736 bytes (0x0002E0 - 0x0002E0)
static_assert(sizeof(UMFILCDebugSamplePointComponent) == 0x05E0); // 1504 bytes (0x0005D8 - 0x0005E0)
static_assert(sizeof(UMFILCDynamicScaleComponent) == 0x0240); // 576 bytes (0x000228 - 0x000240)
static_assert(sizeof(AMFILCDynamicScaleVolume) == 0x02E8); // 744 bytes (0x0002E0 - 0x0002E8)
static_assert(sizeof(AMFILCMaskVolume) == 0x0330); // 816 bytes (0x000328 - 0x000330)
static_assert(sizeof(UMFILCTwoSideSampleStaticMeshComponent) == 0x06D0); // 1744 bytes (0x000680 - 0x0006D0)
static_assert(offsetof(UMFVLMOffsetSampleStaticMeshComponent, PlaneCenter) == 0x0684);
static_assert(offsetof(AMFILCDynamicScaleVolume, ILCDynamicScaleComponent) == 0x02E0);
static_assert(offsetof(UMFILCTwoSideSampleStaticMeshComponent, CachedActorForwardDirection) == 0x06B0);
static_assert(offsetof(UMFILCTwoSideSampleStaticMeshComponent, CachedActorRightDirection) == 0x06BC);
