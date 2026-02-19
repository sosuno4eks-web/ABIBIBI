
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
/// dependency: LevelSequence
/// dependency: PhysicsCore
/// dependency: ProceduralMeshComponent
/// dependency: UMG

/// Enum /Script/MFClimateRuntime.EMFClimateCelestialOrbitType
/// Size: 0x04 (4 bytes)
enum class EMFClimateCelestialOrbitType : uint32_t
{
	EMFClimateCelestialOrbitType__Sun                                                = 0,
	EMFClimateCelestialOrbitType__SunCounter                                         = 1,
	EMFClimateCelestialOrbitType__Satellite                                          = 2,
	EMFClimateCelestialOrbitType__Distant                                            = 3,
	EMFClimateCelestialOrbitType__Manual                                             = 4
};

/// Enum /Script/MFClimateRuntime.EMFClimateCloudNoiseGroupTier
/// Size: 0x01 (1 bytes)
enum class EMFClimateCloudNoiseGroupTier : uint8_t
{
	EMFClimateCloudNoiseGroupTier__Desktop                                           = 0,
	EMFClimateCloudNoiseGroupTier__Mobile                                            = 1
};

/// Enum /Script/MFClimateRuntime.EMFClimateNoiseType
/// Size: 0x04 (4 bytes)
enum class EMFClimateNoiseType : uint32_t
{
	EMFClimateNoiseType__PerlinWorley                                                = 0,
	EMFClimateNoiseType__WorleyCloud                                                 = 1,
	EMFClimateNoiseType__NRCCloud                                                    = 2
};

/// Enum /Script/MFClimateRuntime.EMFClimateTickBudgetAdvice
/// Size: 0x01 (1 bytes)
enum class EMFClimateTickBudgetAdvice : uint8_t
{
	EMFClimateTickBudgetAdvice__DontTick                                             = 0,
	EMFClimateTickBudgetAdvice__Tick                                                 = 1,
	EMFClimateTickBudgetAdvice__FullUpdate                                           = 2
};

/// Enum /Script/MFClimateRuntime.EAutoAutoStepMode
/// Size: 0x01 (1 bytes)
enum class EAutoAutoStepMode : uint8_t
{
	EAutoAutoStepMode__Close                                                         = 0,
	EAutoAutoStepMode__Fixed                                                         = 1,
	EAutoAutoStepMode__Custom                                                        = 2
};

/// Enum /Script/MFClimateRuntime.EWeatherLayerEvaluationMode
/// Size: 0x04 (4 bytes)
enum class EWeatherLayerEvaluationMode : uint32_t
{
	EWeatherLayerEvaluationMode__TimeOfDay                                           = 0,
	EWeatherLayerEvaluationMode__SunAngle                                            = 1,
	EWeatherLayerEvaluationMode__Constant                                            = 2,
	EWeatherLayerEvaluationMode__NUM_EVALUATION_MODE                                 = 3
};

/// Enum /Script/MFClimateRuntime.EMFClimateCloudMaskType
/// Size: 0x04 (4 bytes)
enum class EMFClimateCloudMaskType : uint32_t
{
	EMFClimateCloudMaskType__Normal                                                  = 0,
	EMFClimateCloudMaskType__FullCover                                               = 1
};

/// Enum /Script/MFClimateRuntime.EMFClimateGetFeatureErrorMode
/// Size: 0x01 (1 bytes)
enum class EMFClimateGetFeatureErrorMode : uint8_t
{
	EMFClimateGetFeatureErrorMode__ReturnNull                                        = 0,
	EMFClimateGetFeatureErrorMode__LogAndReturnNull                                  = 1,
	EMFClimateGetFeatureErrorMode__Assert                                            = 2
};

/// Class /Script/MFClimateRuntime.MFClimateActor
/// Size: 0x0010 (16 bytes) (0x0002E0 - 0x0002F0) align 8 pad: 0x0000
class AMFClimateActor : public AActor
{ 
public:
	class UMFClimateWorldSubSystem*                    System;                                                     // 0x02E0   (0x0008)  
	unsigned char                                      UnknownData00_7[0x8];                                       // 0x02E8   (0x0008)  MISSED
};

/// Class /Script/MFClimateRuntime.MFClimateComponent
/// Size: 0x0018 (24 bytes) (0x0000F8 - 0x000110) align 8 pad: 0x0000
class UMFClimateComponent : public UActorComponent
{ 
public:
	class UMFClimateWorldSubSystem*                    System;                                                     // 0x00F8   (0x0008)  
	unsigned char                                      UnknownData00_7[0x10];                                      // 0x0100   (0x0010)  MISSED
};

/// Class /Script/MFClimateRuntime.MFClimateBakeModeComponent
/// Size: 0x0088 (136 bytes) (0x000110 - 0x000198) align 8 pad: 0x0000
class UMFClimateBakeModeComponent : public UMFClimateComponent
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0110   (0x0008)  MISSED
	TArray<class UMFClimateBaseBakeProcedure*>         RegisteredBakeProcedures;                                   // 0x0118   (0x0010)  
	unsigned char                                      UnknownData01_6[0x60];                                      // 0x0128   (0x0060)  MISSED
	bool                                               bBakeMode;                                                  // 0x0188   (0x0001)  
	unsigned char                                      UnknownData02_6[0x7];                                       // 0x0189   (0x0007)  MISSED
	class UMFClimateBaseBakeProcedure*                 RunningBakeProcedure;                                       // 0x0190   (0x0008)  


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateBakeModeComponent.ToggleBakeMode
	// void ToggleBakeMode(bool bBakeModeOn);                                                                                   // [0x1da1dc0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateBakeModeComponent.RunBakeProcedure
	// void RunBakeProcedure(class UMFClimateBaseBakeProcedure* BakeProcedure);                                                 // [0x1da19c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateBakeModeComponent.IsBakeMode
	// bool IsBakeMode();                                                                                                       // [0x1da1940] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateBakeModeComponent.BakeUpdate
	// void BakeUpdate();                                                                                                       // [0x1da14b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateBakeModeComponent.AbortBakeProcedure
	// void AbortBakeProcedure();                                                                                               // [0x1da1490] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFClimateRuntime.MFClimateBakeMode
/// Size: 0x0008 (8 bytes) (0x0002E0 - 0x0002E8) align 8 pad: 0x0000
class AMFClimateBakeMode : public AActor
{ 
public:
	class UMFClimateBakeModeComponent*                 BakeMode;                                                   // 0x02E0   (0x0008)  
};

/// Class /Script/MFClimateRuntime.MFClimateBaseBakeProcedure
/// Size: 0x0018 (24 bytes) (0x000028 - 0x000040) align 8 pad: 0x0000
class UMFClimateBaseBakeProcedure : public UObject
{ 
public:
	bool                                               bEditorOnly;                                                // 0x0028   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0029   (0x0007)  MISSED
	class UMFClimateBakeModeComponent*                 Baker;                                                      // 0x0030   (0x0008)  
	bool                                               bBakeDone;                                                  // 0x0038   (0x0001)  
	unsigned char                                      UnknownData01_7[0x7];                                       // 0x0039   (0x0007)  MISSED


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateBaseBakeProcedure.TickBaking
	// void TickBaking();                                                                                                       // [0x1da1da0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFClimateRuntime.MFClimateBaseBakeProcedure.OnFinalizeBaking
	// void OnFinalizeBaking();                                                                                                 // [0x1da19a0] Native|Event|Protected|BlueprintEvent 
	// Function /Script/MFClimateRuntime.MFClimateBaseBakeProcedure.OnBeginBake
	// void OnBeginBake();                                                                                                      // [0x19833f0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFClimateRuntime.MFClimateBaseBakeProcedure.OnAbortBaking
	// void OnAbortBaking();                                                                                                    // [0x1da1980] Native|Event|Protected|BlueprintEvent 
	// Function /Script/MFClimateRuntime.MFClimateBaseBakeProcedure.IsBakingDone
	// bool IsBakingDone();                                                                                                     // [0x1da1960] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateBaseBakeProcedure.FinishBaking
	// void FinishBaking();                                                                                                     // [0x1da14d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateBaseBakeProcedure.BakeUpdate
	// void BakeUpdate();                                                                                                       // [0x198b080] Native|Protected|BlueprintCallable 
};

/// Class /Script/MFClimateRuntime.MFClimateBakeProcedure
/// Size: 0x0078 (120 bytes) (0x000040 - 0x0000B8) align 8 pad: 0x0000
class UMFClimateBakeProcedure : public UMFClimateBaseBakeProcedure
{ 
public:
	TArray<float>                                      TodsToBake;                                                 // 0x0040   (0x0010)  
	bool                                               bIterateWeatherPresets;                                     // 0x0050   (0x0001)  
	bool                                               bHideCelestials;                                            // 0x0051   (0x0001)  
	bool                                               bHideLightning;                                             // 0x0052   (0x0001)  
	bool                                               bHideRain;                                                  // 0x0053   (0x0001)  
	float                                              PrepareTime;                                                // 0x0054   (0x0004)  
	bool                                               bDisableVolumetricFog;                                      // 0x0058   (0x0001)  
	bool                                               bDisableRealTimeSkyLightTimeSlicing;                        // 0x0059   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x005A   (0x0002)  MISSED
	int32_t                                            OuterLoopCount;                                             // 0x005C   (0x0004)  
	int32_t                                            CurrentOuterLoop;                                           // 0x0060   (0x0004)  
	int32_t                                            CurrentTODIndex;                                            // 0x0064   (0x0004)  
	float                                              CurrentTOD;                                                 // 0x0068   (0x0004)  
	int32_t                                            CurrentWeatherIndex;                                        // 0x006C   (0x0004)  
	FString                                            CurrentWeatherName;                                         // 0x0070   (0x0010)  
	int32_t                                            BackupTimeSlicingEnabled;                                   // 0x0080   (0x0004)  
	int32_t                                            BackupVolumetricFog;                                        // 0x0084   (0x0004)  
	float                                              BackupTOD;                                                  // 0x0088   (0x0004)  
	bool                                               bBackupEventProducerActive;                                 // 0x008C   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x008D   (0x0003)  MISSED
	TArray<float>                                      BackupWeatherLayers;                                        // 0x0090   (0x0010)  
	unsigned char                                      UnknownData02_7[0x18];                                      // 0x00A0   (0x0018)  MISSED


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateBakeProcedure.SetupBake
	// void SetupBake();                                                                                                        // [0x16b0bb0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFClimateRuntime.MFClimateBakeProcedure.DoBake
	// void DoBake();                                                                                                           // [0x198b060] Native|Event|Public|BlueprintEvent 
};

/// Class /Script/MFClimateRuntime.MFClimateBaseLightningEventProducer
/// Size: 0x0008 (8 bytes) (0x000028 - 0x000030) align 8 pad: 0x0000
class UMFClimateBaseLightningEventProducer : public UObject
{ 
public:
	class UMFClimateLightningDirectorComponent*        Director;                                                   // 0x0028   (0x0008)  


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateBaseLightningEventProducer.Tick
	// void Tick(float DeltaTime);                                                                                              // [0x1da1d10] Native|Event|Public|BlueprintEvent 
};

/// Class /Script/MFClimateRuntime.MFClimateCelestialOrbit
/// Size: 0x0050 (80 bytes) (0x000220 - 0x000270) align 16 pad: 0x0000
class UMFClimateCelestialOrbit : public USceneComponent
{ 
public:
	EMFClimateCelestialOrbitType                       OrbitType;                                                  // 0x0220   (0x0004)  
	char                                               SatelliteOrbitFrequencyYear;                                // 0x0224   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0225   (0x0003)  MISSED
	float                                              AscendingNodeLongitude;                                     // 0x0228   (0x0004)  
	float                                              OrbitalInclination;                                         // 0x022C   (0x0004)  
	float                                              OrbitOffset;                                                // 0x0230   (0x0004)  
	float                                              DistantOrbitLatitude;                                       // 0x0234   (0x0004)  
	float                                              DistantOrbitLongitude;                                      // 0x0238   (0x0004)  
	float                                              ExtraHorizontalOffset;                                      // 0x023C   (0x0004)  
	FRotator                                           CelestialRotation;                                          // 0x0240   (0x000C)  
	FRotator                                           CelestialPosition;                                          // 0x024C   (0x000C)  
	FRotator                                           CelestialToEarthEcliptic;                                   // 0x0258   (0x000C)  
	unsigned char                                      UnknownData01_7[0xC];                                       // 0x0264   (0x000C)  MISSED


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateCelestialOrbit.GetCelestialToEarthEcliptic
	// FRotator GetCelestialToEarthEcliptic();                                                                                  // [0x1da15a0] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateCelestialOrbit.GetCelestialRotationInScene
	// FRotator GetCelestialRotationInScene();                                                                                  // [0x1da1570] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateCelestialOrbit.GetCelestialPositionInScene
	// FRotator GetCelestialPositionInScene();                                                                                  // [0x1da1540] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateCelestialOrbit.GetCelestialFacingSceneDirection
	// FVector GetCelestialFacingSceneDirection();                                                                              // [0x1da14f0] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/MFClimateRuntime.MFClimateCelestialBody
/// Size: 0x0028 (40 bytes) (0x0002E0 - 0x000308) align 8 pad: 0x0000
class AMFClimateCelestialBody : public AActor
{ 
public:
	bool                                               bSpriteMode;                                                // 0x02E0   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x02E1   (0x0003)  MISSED
	FColor                                             Color;                                                      // 0x02E4   (0x0004)  
	float                                              Intensity;                                                  // 0x02E8   (0x0004)  
	float                                              AngularDiameter;                                            // 0x02EC   (0x0004)  
	float                                              Distance;                                                   // 0x02F0   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x02F4   (0x0004)  MISSED
	class UMFClimateCelestialOrbit*                    OrbitComponent;                                             // 0x02F8   (0x0008)  
	class USceneComponent*                             RotatedPivot;                                               // 0x0300   (0x0008)  


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateCelestialBody.SystemTexturesRefreshed
	// void SystemTexturesRefreshed();                                                                                          // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFClimateRuntime.MFClimateCelestialBody.SetIntensity
	// void SetIntensity(float NewValue);                                                                                       // [0x1da1ad0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateCelestialBody.SetColor
	// void SetColor(FColor NewValue);                                                                                          // [0x1da1a50] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateCelestialBody.GetOrbitComponent
	// class UMFClimateCelestialOrbit* GetOrbitComponent();                                                                     // [0x1da16d0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateCelestialBody.GetIrradiance
	// FLinearColor GetIrradiance();                                                                                            // [0x1da1650] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateCelestialBody.GetIntensity
	// float GetIntensity();                                                                                                    // [0x1da1630] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateCelestialBody.GetColor
	// FColor GetColor();                                                                                                       // [0x1da1610] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateCelestialBody.GetCenterDir
	// FVector GetCenterDir();                                                                                                  // [0x1da15d0] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/MFClimateRuntime.MFClimateCirrusCloud
/// Size: 0x0048 (72 bytes) (0x000110 - 0x000158) align 8 pad: 0x0000
class UMFClimateCirrusCloud : public UMFClimateComponent
{ 
public:
	bool                                               bAutoColorFromSystem;                                       // 0x0110   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0111   (0x0003)  MISSED
	FLinearColor                                       EnvironmentLightColor;                                      // 0x0114   (0x0010)  
	FVector                                            EnvironmentLightDir;                                        // 0x0124   (0x000C)  
	float                                              Height;                                                     // 0x0130   (0x0004)  
	float                                              Fill;                                                       // 0x0134   (0x0004)  
	FColor                                             Albedo;                                                     // 0x0138   (0x0004)  
	FLinearColor                                       Emissive;                                                   // 0x013C   (0x0010)  
	float                                              ExtinctionCoefficient;                                      // 0x014C   (0x0004)  
	float                                              FirstLobeG;                                                 // 0x0150   (0x0004)  
	float                                              SecondLobeG;                                                // 0x0154   (0x0004)  
};

/// Class /Script/MFClimateRuntime.MFClimateCloudCustomVolume
/// Size: 0x0038 (56 bytes) (0x0002E0 - 0x000318) align 8 pad: 0x0000
class AMFClimateCloudCustomVolume : public AActor
{ 
public:
	int32_t                                            TextureIndex;                                               // 0x02E0   (0x0004)  
	float                                              EdgeThreshold;                                              // 0x02E4   (0x0004)  
	float                                              BaseTiling;                                                 // 0x02E8   (0x0004)  
	float                                              DetailStrength;                                             // 0x02EC   (0x0004)  
	float                                              DetailTiling;                                               // 0x02F0   (0x0004)  
	float                                              CurlStrength;                                               // 0x02F4   (0x0004)  
	float                                              CurlTiling;                                                 // 0x02F8   (0x0004)  
	FVector2D                                          DetailOffset;                                               // 0x02FC   (0x0008)  
	float                                              BaseNoiseCenter;                                            // 0x0304   (0x0004)  
	float                                              BaseNoiseVariation;                                         // 0x0308   (0x0004)  
	float                                              ExtinctionScale;                                            // 0x030C   (0x0004)  
	float                                              Erosion;                                                    // 0x0310   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0314   (0x0004)  MISSED
};

/// Class /Script/MFClimateRuntime.MFClimateCloudCustomVolumesManager
/// Size: 0x0048 (72 bytes) (0x0002E0 - 0x000328) align 8 pad: 0x0000
class AMFClimateCloudCustomVolumesManager : public AActor
{ 
public:
	TArray<class UVolumeTexture*>                      CloudTextures;                                              // 0x02E0   (0x0010)  
	bool                                               bShowCloudBoundingBoxes;                                    // 0x02F0   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x02F1   (0x0007)  MISSED
	class UVolumeTexture*                              CloudTextureAtlas;                                          // 0x02F8   (0x0008)  
	unsigned char                                      UnknownData01_7[0x28];                                      // 0x0300   (0x0028)  MISSED
};

/// Class /Script/MFClimateRuntime.MFClimateCloudNoiseGeneratorV2
/// Size: 0x0058 (88 bytes) (0x000030 - 0x000088) align 8 pad: 0x0000
class UMFClimateCloudNoiseGeneratorV2 : public UDataAsset
{ 
public:
	FIntVector                                         NoiseTextureSize;                                           // 0x0030   (0x000C)  
	bool                                               bSingleChannel;                                             // 0x003C   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x003D   (0x0003)  MISSED
	int32_t                                            WorleyFbmOctaves;                                           // 0x0040   (0x0004)  
	int32_t                                            PerlinFbmOctaves;                                           // 0x0044   (0x0004)  
	int32_t                                            WorleyNoiseCells_Channel1;                                  // 0x0048   (0x0004)  
	int32_t                                            PerlinNoiseCells_Channel1;                                  // 0x004C   (0x0004)  
	float                                              PerlinWeight_Channel1;                                      // 0x0050   (0x0004)  
	int32_t                                            WorleyNoiseCells_Channel2;                                  // 0x0054   (0x0004)  
	int32_t                                            PerlinNoiseCells_Channel2;                                  // 0x0058   (0x0004)  
	float                                              PerlinWeight_Channel2;                                      // 0x005C   (0x0004)  
	int32_t                                            WorleyNoiseCells_Channel3;                                  // 0x0060   (0x0004)  
	int32_t                                            PerlinNoiseCells_Channel3;                                  // 0x0064   (0x0004)  
	float                                              PerlinWeight_Channel3;                                      // 0x0068   (0x0004)  
	int32_t                                            WorleyNoiseCells_Channel4;                                  // 0x006C   (0x0004)  
	int32_t                                            PerlinNoiseCells_Channel4;                                  // 0x0070   (0x0004)  
	float                                              PerlinWeight_Channel4;                                      // 0x0074   (0x0004)  
	class UVolumeTexture*                              OutputTexture3D;                                            // 0x0078   (0x0008)  
	class UTexture2D*                                  OutputTexture2D;                                            // 0x0080   (0x0008)  


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateCloudNoiseGeneratorV2.GenerateNoise
	// void GenerateNoise();                                                                                                    // [0xd906a0] Final|Native|Public  
};

/// Struct /Script/MFClimateRuntime.MFClimatePlatformNoiseGenerationSettings
/// Size: 0x0038 (56 bytes) (0x000000 - 0x000038) align 4 pad: 0x0000
struct FMFClimatePlatformNoiseGenerationSettings
{ 
	FIntVector                                         BaseNoiseTextureSize;                                       // 0x0000   (0x000C)  
	FIntVector                                         DetailNoiseTextureSize;                                     // 0x000C   (0x000C)  
	FIntPoint                                          BaseNoise2DTextureSize;                                     // 0x0018   (0x0008)  
	FIntPoint                                          DetailNoise2DTextureSize;                                   // 0x0020   (0x0008)  
	FIntPoint                                          WeatherMapNoiseTextureSize;                                 // 0x0028   (0x0008)  
	FIntPoint                                          CurlNoiseTextureSize;                                       // 0x0030   (0x0008)  
};

/// Class /Script/MFClimateRuntime.MFClimateCloudNoiseGroup
/// Size: 0x0058 (88 bytes) (0x000030 - 0x000088) align 8 pad: 0x0000
class UMFClimateCloudNoiseGroup : public UDataAsset
{ 
public:
	FMFClimatePlatformNoiseGenerationSettings          PlatformSettings;                                           // 0x0030   (0x0038)  
	class UVolumeTexture*                              SavedBaseNoise;                                             // 0x0068   (0x0008)  
	class UVolumeTexture*                              SavedDetailNoise;                                           // 0x0070   (0x0008)  
	class UTexture2D*                                  SavedWeatherMapNoise;                                       // 0x0078   (0x0008)  
	class UTexture2D*                                  SavedCurlNoise;                                             // 0x0080   (0x0008)  


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateCloudNoiseGroup.CreateAssets
	// void CreateAssets();                                                                                                     // [0xd906a0] Final|Native|Public  
};

/// Class /Script/MFClimateRuntime.MFClimateCloudNoiseGroupPlatformSwitcher
/// Size: 0x0008 (8 bytes) (0x000030 - 0x000038) align 8 pad: 0x0000
class UMFClimateCloudNoiseGroupPlatformSwitcher : public UDataAsset
{ 
public:
	class UMFClimateCloudNoiseGroup*                   CookedAsset;                                                // 0x0030   (0x0008)  


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateCloudNoiseGroupPlatformSwitcher.UpdateAllNoise
	// void UpdateAllNoise();                                                                                                   // [0xd906a0] Final|Native|Public  
};

/// Struct /Script/MFClimateRuntime.MFClimateCloudTypeDescriptor
/// Size: 0x0228 (552 bytes) (0x000000 - 0x000228) align 8 pad: 0x0000
struct FMFClimateCloudTypeDescriptor
{ 
	float                                              TypeWeight;                                                 // 0x0000   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0004   (0x0004)  MISSED
	FRuntimeFloatCurve                                 BaseNoiseCenter;                                            // 0x0008   (0x0088)  
	FRuntimeFloatCurve                                 BaseNoiseVariation;                                         // 0x0090   (0x0088)  
	FRuntimeFloatCurve                                 ExtinctionScale;                                            // 0x0118   (0x0088)  
	FRuntimeFloatCurve                                 Erosion;                                                    // 0x01A0   (0x0088)  
};

/// Class /Script/MFClimateRuntime.MFClimateCloudProfile
/// Size: 0x0048 (72 bytes) (0x000030 - 0x000078) align 8 pad: 0x0000
class UMFClimateCloudProfile : public UDataAsset
{ 
public:
	TArray<FMFClimateCloudTypeDescriptor>              TypeDescriptors;                                            // 0x0030   (0x0010)  
	class UTexture2D*                                  LUT0;                                                       // 0x0040   (0x0008)  
	uint32_t                                           LUT0SizeX;                                                  // 0x0048   (0x0004)  
	uint32_t                                           LUT0SizeY;                                                  // 0x004C   (0x0004)  
	float                                              LUTMSApproxMaxOpticalDepth;                                 // 0x0050   (0x0004)  
	float                                              LUTMSApproxRangeCompress;                                   // 0x0054   (0x0004)  
	uint32_t                                           LUTMSApproxSizeX;                                           // 0x0058   (0x0004)  
	uint32_t                                           LUTMSApproxSizeY;                                           // 0x005C   (0x0004)  
	uint32_t                                           LUTMSApproxIterationCount;                                  // 0x0060   (0x0004)  
	float                                              CloudMSApproxA;                                             // 0x0064   (0x0004)  
	float                                              CloudMSApproxB;                                             // 0x0068   (0x0004)  
	float                                              CloudMSApproxC;                                             // 0x006C   (0x0004)  
	float                                              CloudMSApproxLobeG1;                                        // 0x0070   (0x0004)  
	float                                              CloudMSApproxLobeG2;                                        // 0x0074   (0x0004)  
};

/// Class /Script/MFClimateRuntime.MFClimateDemoGameMode
/// Size: 0x0000 (0 bytes) (0x0003C8 - 0x0003C8) align 8 pad: 0x0000
class AMFClimateDemoGameMode : public AGameMode
{ 
public:
};

/// Class /Script/MFClimateRuntime.MFClimateGlobalWindComponent
/// Size: 0x0020 (32 bytes) (0x000110 - 0x000130) align 8 pad: 0x0000
class UMFClimateGlobalWindComponent : public UMFClimateComponent
{ 
public:
	FVector2D                                          Direction;                                                  // 0x0110   (0x0008)  
	float                                              Level;                                                      // 0x0118   (0x0004)  
	FVector2D                                          WindTravel;                                                 // 0x011C   (0x0008)  
	float                                              WindFrequency;                                              // 0x0124   (0x0004)  
	float                                              WindAmplitude;                                              // 0x0128   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x012C   (0x0004)  MISSED


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateGlobalWindComponent.SetWindLevel
	// void SetWindLevel(float WindLevel);                                                                                      // [0x1da1c80] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateGlobalWindComponent.SetWindDirection
	// void SetWindDirection(FVector2D WindDir);                                                                                // [0x1da1b60] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateGlobalWindComponent.GetWindVelocityInMeter
	// FVector2D GetWindVelocityInMeter();                                                                                      // [0x1da1830] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateGlobalWindComponent.GetWindTravel
	// FVector2D GetWindTravel();                                                                                               // [0x1da1800] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateGlobalWindComponent.GetWindLevel
	// float GetWindLevel();                                                                                                    // [0x1da17d0] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateGlobalWindComponent.GetWindDirection
	// FVector2D GetWindDirection();                                                                                            // [0x1da16f0] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFClimateRuntime.MFClimateGlobalWind
/// Size: 0x0008 (8 bytes) (0x0002E0 - 0x0002E8) align 8 pad: 0x0000
class AMFClimateGlobalWind : public AActor
{ 
public:
	class UMFClimateGlobalWindComponent*               GlobalWindComponent;                                        // 0x02E0   (0x0008)  
};

/// Class /Script/MFClimateRuntime.MFClimateSceneLightInterfaceComponent
/// Size: 0x0008 (8 bytes) (0x000110 - 0x000118) align 8 pad: 0x0000
class UMFClimateSceneLightInterfaceComponent : public UMFClimateComponent
{ 
public:
	bool                                               bHasMainLightControl;                                       // 0x0110   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0111   (0x0003)  MISSED
	float                                              MobileForceUpdateTimer;                                     // 0x0114   (0x0004)  


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateSceneLightInterfaceComponent.GetMainLight
	// bool GetMainLight(class UDirectionalLightComponent*& OutLightComponent);                                                 // [0x1da7940] Native|Public|HasOutParms|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateSceneLightInterfaceComponent.GetLightInfoForLightingCloud
	// bool GetLightInfoForLightingCloud(FVector& OutDir, float BottomHeight, FLinearColor& OutColorBottom, float TopHeight, FLinearColor& OutColorTop); // [0x1da7740] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateSceneLightInterfaceComponent.GetGroundLevelIrradiance
	// FLinearColor GetGroundLevelIrradiance();                                                                                 // [0x1da76e0] Native|Public|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateSceneLightInterfaceComponent.GetCloudLightingAtHeight
	// bool GetCloudLightingAtHeight(float Height, FVector& LightDir, FLinearColor& Color);                                     // [0x1da7260] Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateSceneLightInterfaceComponent.GetAtmosphereLight
	// bool GetAtmosphereLight(FVector& OutDir, FLinearColor& OutColoredBrightness, int32_t LightIndex);                        // [0x1da6e40] Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFClimateRuntime.MFClimateHDSunMoonSceneLightComponent
/// Size: 0x00B0 (176 bytes) (0x000118 - 0x0001C8) align 8 pad: 0x0000
class UMFClimateHDSunMoonSceneLightComponent : public UMFClimateSceneLightInterfaceComponent
{ 
public:
	class ADirectionalLight*                           SunLight;                                                   // 0x0118   (0x0008)  
	class ADirectionalLight*                           MoonLight;                                                  // 0x0120   (0x0008)  
	class AMFClimateCelestialBody*                     BindSun;                                                    // 0x0128   (0x0008)  
	class AMFClimateCelestialBody*                     BindMoon;                                                   // 0x0130   (0x0008)  
	FVector                                            SunDirection;                                               // 0x0138   (0x000C)  
	FVector                                            MoonDirection;                                              // 0x0144   (0x000C)  
	FLinearColor                                       SunColoredBrightness;                                       // 0x0150   (0x0010)  
	FLinearColor                                       MoonColoredBrightness;                                      // 0x0160   (0x0010)  
	bool                                               bAutoUpdateCloudCastShadow;                                 // 0x0170   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0171   (0x0003)  MISSED
	float                                              CastCloudShadowTransferTime;                                // 0x0174   (0x0004)  
	float                                              CloudShadowValue;                                           // 0x0178   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x017C   (0x0004)  MISSED
	class UDirectionalLightComponent*                  SunLightComponent;                                          // 0x0180   (0x0008)  
	class UDirectionalLightComponent*                  MoonLightComponent;                                         // 0x0188   (0x0008)  
	FLinearColor                                       SunScatteredIrradiance;                                     // 0x0190   (0x0010)  
	FLinearColor                                       MoonScatteredIrradiance;                                    // 0x01A0   (0x0010)  
	FLinearColor                                       CurrentLightningSceneLightColor;                            // 0x01B0   (0x0010)  
	class UDirectionalLightComponent*                  LightningFakeLight;                                         // 0x01C0   (0x0008)  
};

/// Class /Script/MFClimateRuntime.MFClimateHDSunMoonSceneLight
/// Size: 0x0008 (8 bytes) (0x0002E0 - 0x0002E8) align 8 pad: 0x0000
class AMFClimateHDSunMoonSceneLight : public AActor
{ 
public:
	class UMFClimateHDSunMoonSceneLightComponent*      MFClimateLight;                                             // 0x02E0   (0x0008)  
};

/// Class /Script/MFClimateRuntime.MFClimateIrcCamera
/// Size: 0x0018 (24 bytes) (0x0002E0 - 0x0002F8) align 8 pad: 0x0000
class AMFClimateIrcCamera : public AActor
{ 
public:
	class UCameraComponent*                            CameraComponent;                                            // 0x02E0   (0x0008)  
	FString                                            CameraTag;                                                  // 0x02E8   (0x0010)  


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateIrcCamera.GetCameraTag
	// FString GetCameraTag();                                                                                                  // [0x1da3a70] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Struct /Script/MFClimateRuntime.MFClimateFractalLightningGenerateParams
/// Size: 0x0034 (52 bytes) (0x000000 - 0x000034) align 4 pad: 0x0000
struct FMFClimateFractalLightningGenerateParams
{ 
	int32_t                                            RandomSeed;                                                 // 0x0000   (0x0004)  
	float                                              InitialBranchProb;                                          // 0x0004   (0x0004)  
	float                                              BranchProbAttenuation;                                      // 0x0008   (0x0004)  
	FVector                                            TargetOffset;                                               // 0x000C   (0x000C)  
	float                                              MinSegmentLength;                                           // 0x0018   (0x0004)  
	int32_t                                            MaxFracTimes;                                               // 0x001C   (0x0004)  
	float                                              WidthFactor;                                                // 0x0020   (0x0004)  
	float                                              BranchShortenFactor;                                        // 0x0024   (0x0004)  
	FVector2D                                          MinMaxBranchLiftAngleDegrees;                               // 0x0028   (0x0008)  
	float                                              MinChannelCreationDistance;                                 // 0x0030   (0x0004)  
};

/// Class /Script/MFClimateRuntime.MFClimateLightningChannelActor
/// Size: 0x0090 (144 bytes) (0x0002E0 - 0x000370) align 8 pad: 0x0000
class AMFClimateLightningChannelActor : public AActor
{ 
public:
	class UMaterialInterface*                          LightningMaterial;                                          // 0x02E0   (0x0008)  
	class UMaterialInstanceDynamic*                    Mid;                                                        // 0x02E8   (0x0008)  
	FMFClimateFractalLightningGenerateParams           Params;                                                     // 0x02F0   (0x0034)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0324   (0x0004)  MISSED
	class UProceduralMeshComponent*                    PMC;                                                        // 0x0328   (0x0008)  
	float                                              Width;                                                      // 0x0330   (0x0004)  
	float                                              MinObserveDegree;                                           // 0x0334   (0x0004)  
	bool                                               bEnableMockRange;                                           // 0x0338   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0339   (0x0003)  MISSED
	float                                              MockRange;                                                  // 0x033C   (0x0004)  
	unsigned char                                      UnknownData02_7[0x30];                                      // 0x0340   (0x0030)  MISSED


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateLightningChannelActor.RefreshChannel
	// void RefreshChannel(FVector InStart, FVector InEnd, int32_t InRandomSeed, float NormalizedEnergy);                       // [0x1da4020] Final|Native|Public|HasDefaults 
	// Function /Script/MFClimateRuntime.MFClimateLightningChannelActor.ReceiveOnReturnStrike
	// void ReceiveOnReturnStrike(float NormalizedEnergy, FVector StartInKM, FVector EndInKM, int32_t InRandomSeed, FVector MockActorLocation, FVector MockActorScale); // [0x3a75280] Event|Protected|HasDefaults|BlueprintEvent 
	// Function /Script/MFClimateRuntime.MFClimateLightningChannelActor.ReceiveOnRefreshChannel
	// void ReceiveOnRefreshChannel(float NormalizedEnergy, FVector StartInKM, FVector EndInKM, int32_t InRandomSeed, FVector MockActorLocation, FVector MockActorScale); // [0x3a75280] Event|Protected|HasDefaults|BlueprintEvent 
	// Function /Script/MFClimateRuntime.MFClimateLightningChannelActor.ReceiveOnLightningHidden
	// void ReceiveOnLightningHidden();                                                                                         // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFClimateRuntime.MFClimateLightningChannelActor.GenerateFractalTree
	// void GenerateFractalTree();                                                                                              // [0x1da3a10] Final|Native|Public  
};

/// Struct /Script/MFClimateRuntime.MFClimateLightningEvent
/// Size: 0x0024 (36 bytes) (0x000000 - 0x000024) align 4 pad: 0x0000
struct FMFClimateLightningEvent
{ 
	bool                                               bForceRejectPrevious;                                       // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	FVector                                            StartPosition;                                              // 0x0004   (0x000C)  
	FVector                                            EndPosition;                                                // 0x0010   (0x000C)  
	float                                              NormalizedReturnStrikeEnergy;                               // 0x001C   (0x0004)  
	int32_t                                            ReStrikeCount;                                              // 0x0020   (0x0004)  
};

/// Class /Script/MFClimateRuntime.MFClimateLightningDirectorComponent
/// Size: 0x0108 (264 bytes) (0x000110 - 0x000218) align 8 pad: 0x0000
class UMFClimateLightningDirectorComponent : public UMFClimateComponent
{ 
public:
	class AMFClimateLightningChannelActor*             InstantiatedLightningActor;                                 // 0x0110   (0x0008)  
	FMFClimateLightningEvent                           ExecutingLightningEvent;                                    // 0x0118   (0x0024)  
	float                                              LightningLeaderProgress;                                    // 0x013C   (0x0004)  
	float                                              CurrentEnergy;                                              // 0x0140   (0x0004)  
	int32_t                                            RemainingReStrike;                                          // 0x0144   (0x0004)  
	float                                              ReStrikeTimer;                                              // 0x0148   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x014C   (0x0004)  MISSED
	class UMFClimateBaseLightningEventProducer*        EventProducer;                                              // 0x0150   (0x0008)  
	class UClass*                                      LightningChannelType;                                       // 0x0158   (0x0008)  
	float                                              LightningFrequency;                                         // 0x0160   (0x0004)  
	float                                              ReturnStrikeEnergyMean;                                     // 0x0164   (0x0004)  
	float                                              ReturnStrikeEnergyStdDev;                                   // 0x0168   (0x0004)  
	float                                              StrikeEnergyBoost;                                          // 0x016C   (0x0004)  
	float                                              LightningDecayAlpha;                                        // 0x0170   (0x0004)  
	FLinearColor                                       LightningTint;                                              // 0x0174   (0x0010)  
	float                                              EventOverEnergyThreshold;                                   // 0x0184   (0x0004)  
	bool                                               bAllowLightningEventOverride;                               // 0x0188   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0189   (0x0003)  MISSED
	float                                              ReStrikeFrequency;                                          // 0x018C   (0x0004)  
	float                                              ReStrikeCountMean;                                          // 0x0190   (0x0004)  
	float                                              ReStrikeCountStdDev;                                        // 0x0194   (0x0004)  
	float                                              ReStrikeEnergyMean;                                         // 0x0198   (0x0004)  
	float                                              ReStrikeEnergyStdDev;                                       // 0x019C   (0x0004)  
	float                                              ReStrikeTickInterval;                                       // 0x01A0   (0x0004)  
	float                                              LightningLeaderDuration;                                    // 0x01A4   (0x0004)  
	float                                              LightningLeaderRelativeEv;                                  // 0x01A8   (0x0004)  
	bool                                               bRelativeToCamera;                                          // 0x01AC   (0x0001)  
	unsigned char                                      UnknownData02_6[0x3];                                       // 0x01AD   (0x0003)  MISSED
	float                                              LightningCloudLayerHeight;                                  // 0x01B0   (0x0004)  
	float                                              MaxDistance;                                                // 0x01B4   (0x0004)  
	float                                              MinDistance;                                                // 0x01B8   (0x0004)  
	float                                              MaxGroundOffset;                                            // 0x01BC   (0x0004)  
	float                                              SceneLightEVScale;                                          // 0x01C0   (0x0004)  
	bool                                               bDevelopmentModeEnable;                                     // 0x01C4   (0x0001)  
	bool                                               bDevelopmentModeAutoLightning;                              // 0x01C5   (0x0001)  
	unsigned char                                      UnknownData03_6[0x2];                                       // 0x01C6   (0x0002)  MISSED
	float                                              DevelopmentModeAutoLightningInterval;                       // 0x01C8   (0x0004)  
	unsigned char                                      UnknownData04_6[0x4];                                       // 0x01CC   (0x0004)  MISSED
	bool                                               bEventProducerActive;                                       // 0x01D0   (0x0001)  
	unsigned char                                      UnknownData05_6[0x7];                                       // 0x01D1   (0x0007)  MISSED
	SDK_UNDEFINED(16,576) /* FMulticastInlineDelegate */ __um(OnLightningEventRegistered);                         // 0x01D8   (0x0010)  
	SDK_UNDEFINED(16,577) /* FMulticastInlineDelegate */ __um(OnLightningStrike);                                  // 0x01E8   (0x0010)  
	unsigned char                                      UnknownData06_7[0x20];                                      // 0x01F8   (0x0020)  MISSED


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.SetReStrikeRandomSeed
	// void SetReStrikeRandomSeed(int32_t Seed);                                                                                // [0x1da4590] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.SetLightningFrequency
	// void SetLightningFrequency(float InValue);                                                                               // [0x1da4510] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.SampleLightningEvent
	// FMFClimateLightningEvent SampleLightningEvent(int32_t Seed);                                                             // [0x1da4360] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.RegisterLightningEventDetermined
	// void RegisterLightningEventDetermined(FMFClimateLightningEvent& Evt, int32_t RandomSeed);                                // [0x1da4270] Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.RegisterLightningEvent
	// void RegisterLightningEvent(FMFClimateLightningEvent& Evt);                                                              // [0x1da41d0] Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.LightningStrikeEventDelegate__DelegateSignature
	// void LightningStrikeEventDelegate__DelegateSignature(FMFClimateLightningEvent& Event, float NormStrikeEnergy);           // [0x3a75280] MulticastDelegate|Public|Delegate|HasOutParms 
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.LightningEventGoingOn
	// bool LightningEventGoingOn();                                                                                            // [0x1da3e20] Final|Native|Protected|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.LightningEventDelegate__DelegateSignature
	// void LightningEventDelegate__DelegateSignature(FMFClimateLightningEvent& Event);                                         // [0x3a75280] MulticastDelegate|Public|Delegate|HasOutParms 
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.GetSceneLightIntensityScale
	// float GetSceneLightIntensityScale();                                                                                     // [0x1da3de0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.GetSceneLightEVScale
	// float GetSceneLightEVScale();                                                                                            // [0x1da3dc0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.GetReStrikeCountStdDev
	// float GetReStrikeCountStdDev();                                                                                          // [0x1da3da0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.GetReStrikeCountMean
	// float GetReStrikeCountMean();                                                                                            // [0x1da3d80] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.GetMinDistance
	// float GetMinDistance();                                                                                                  // [0x1da3c90] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.GetMaxGroundOffset
	// float GetMaxGroundOffset();                                                                                              // [0x1da3c70] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.GetMaxDistance
	// float GetMaxDistance();                                                                                                  // [0x1da3c50] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.GetLocalToCamera
	// bool GetLocalToCamera();                                                                                                 // [0x1da3c30] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.GetLightningTint
	// FLinearColor GetLightningTint();                                                                                         // [0x1da3c00] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.GetLightningFrequency
	// float GetLightningFrequency();                                                                                           // [0x1da3be0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.GetLightningChannelActor
	// class AMFClimateLightningChannelActor* GetLightningChannelActor();                                                       // [0x1da3bb0] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.GetEnergyNormalDistribution
	// FVector2D GetEnergyNormalDistribution();                                                                                 // [0x1da3b30] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateLightningDirectorComponent.DevelopmentModeCallLightning
	// void DevelopmentModeCallLightning();                                                                                     // [0x1da39f0] Final|Native|Protected|BlueprintCallable 
};

/// Class /Script/MFClimateRuntime.MFClimateLightningEventProducer
/// Size: 0x0010 (16 bytes) (0x000030 - 0x000040) align 8 pad: 0x0000
class UMFClimateLightningEventProducer : public UMFClimateBaseLightningEventProducer
{ 
public:
	bool                                               bDeterministicByTOD;                                        // 0x0030   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0031   (0x0003)  MISSED
	float                                              TestIntervalInTodSeconds;                                   // 0x0034   (0x0004)  
	bool                                               bDisableDeterministicInEditor;                              // 0x0038   (0x0001)  
	unsigned char                                      UnknownData01_7[0x7];                                       // 0x0039   (0x0007)  MISSED
};

/// Class /Script/MFClimateRuntime.MFClimateMovableRainWetnessComponent
/// Size: 0x0110 (272 bytes) (0x0000F8 - 0x000208) align 8 pad: 0x0000
class UMFClimateMovableRainWetnessComponent : public UActorComponent
{ 
public:
	class UPhysicalMaterial*                           LastOccludePhysicalMaterial;                                // 0x00F8   (0x0008)  
	float                                              WetSpeed;                                                   // 0x0100   (0x0004)  
	float                                              DrySpeed;                                                   // 0x0104   (0x0004)  
	float                                              OcclusionSmoothRate;                                        // 0x0108   (0x0004)  
	bool                                               bUpdateMaterialParam;                                       // 0x010C   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x010D   (0x0003)  MISSED
	FName                                              AccumulationParameterName;                                  // 0x0110   (0x0008)  
	FName                                              OcclusionParameterName;                                     // 0x0118   (0x0008)  
	bool                                               bUpdatePrimitiveData;                                       // 0x0120   (0x0001)  
	char                                               PrimitiveDataIndex;                                         // 0x0121   (0x0001)  
	unsigned char                                      UnknownData01_6[0x2];                                       // 0x0122   (0x0002)  MISSED
	float                                              OcclusionRate;                                              // 0x0124   (0x0004)  
	float                                              CurrentAccumulation;                                        // 0x0128   (0x0004)  
	float                                              SmoothedOcclusion;                                          // 0x012C   (0x0004)  
	float                                              AppliedVisualAccumulation;                                  // 0x0130   (0x0004)  
	float                                              AppliedVisualOcclusion;                                     // 0x0134   (0x0004)  
	unsigned char                                      UnknownData02_6[0x10];                                      // 0x0138   (0x0010)  MISSED
	class UMFClimateWorldSubSystem*                    MFClimateSystem;                                            // 0x0148   (0x0008)  
	class AMFClimateRain*                              RainActor;                                                  // 0x0150   (0x0008)  
	TArray<class UMaterialInstanceDynamic*>            CollectedMaterials;                                         // 0x0158   (0x0010)  
	SDK_UNDEFINED(80,578) /* TSet<UPrimitiveComponent*> */ __um(CollectedPrimitive);                               // 0x0168   (0x0050)  
	SDK_UNDEFINED(80,579) /* TSet<AActor*> */          __um(CollectedProtective);                                  // 0x01B8   (0x0050)  


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateMovableRainWetnessComponent.UpdateWetnessParameter
	// void UpdateWetnessParameter(float GlobalRainAmount, float DeltaTime);                                                    // [0x1da46d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateMovableRainWetnessComponent.UpdateVisualEffects
	// void UpdateVisualEffects(bool bForceUpdate);                                                                             // [0x1da4640] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateMovableRainWetnessComponent.UpdateOcclusionRateByLineTrace
	// void UpdateOcclusionRateByLineTrace();                                                                                   // [0x1da4620] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateMovableRainWetnessComponent.RefreshPrimitiveMaterialCollection
	// void RefreshPrimitiveMaterialCollection();                                                                               // [0x1da41b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateMovableRainWetnessComponent.GetOcclusionRate
	// float GetOcclusionRate();                                                                                                // [0x1da3cf0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateMovableRainWetnessComponent.GetOcclusionDetectionPosition
	// FVector GetOcclusionDetectionPosition();                                                                                 // [0x1da3cb0] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateMovableRainWetnessComponent.GetLastOccludeMaterial
	// class UPhysicalMaterial* GetLastOccludeMaterial();                                                                       // [0x1da3b60] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateMovableRainWetnessComponent.AddExtraPrimitive
	// void AddExtraPrimitive(class AActor* Actor);                                                                             // [0x1da3960] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFClimateRuntime.MFClimateRain
/// Size: 0x00E0 (224 bytes) (0x0002F0 - 0x0003D0) align 16 pad: 0x0000
class AMFClimateRain : public AMFClimateActor
{ 
public:
	char                                               DynamicObjectPrimitiveIndex;                                // 0x02F0   (0x0001)  
	bool                                               bIsUsePrimitiveCustomData;                                  // 0x02F1   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x02F2   (0x0002)  MISSED
	float                                              PuddleDisturbSpeed;                                         // 0x02F4   (0x0004)  
	float                                              PuddleDisturbTiling;                                        // 0x02F8   (0x0004)  
	float                                              PuddleDisturbStrength;                                      // 0x02FC   (0x0004)  
	float                                              PuddleRippleStrength;                                       // 0x0300   (0x0004)  
	unsigned char                                      UnknownData01_6[0xC];                                       // 0x0304   (0x000C)  MISSED
	FVector4                                           PuddleRippleFrequencies;                                    // 0x0310   (0x0010)  
	float                                              PuddleRippleTiling;                                         // 0x0320   (0x0004)  
	float                                              AmountOfRain;                                               // 0x0324   (0x0004)  
	float                                              Accumulation;                                               // 0x0328   (0x0004)  
	float                                              MaxAccumulation;                                            // 0x032C   (0x0004)  
	bool                                               bRainAutoUpdateAccumulation;                                // 0x0330   (0x0001)  
	unsigned char                                      UnknownData02_6[0x3];                                       // 0x0331   (0x0003)  MISSED
	float                                              AccumulateSpeed;                                            // 0x0334   (0x0004)  
	float                                              DecaySpeed;                                                 // 0x0338   (0x0004)  
	float                                              WindTiltMultiplier;                                         // 0x033C   (0x0004)  
	class UMFClimatePlayerTransformComponent*          PlayerPosition;                                             // 0x0340   (0x0008)  
	class UMFClimatePlayerTransformComponent*          PlayerRotation;                                             // 0x0348   (0x0008)  
	class USceneComponent*                             WindAlignedPivot;                                           // 0x0350   (0x0008)  
	class UMFClimateMovableRainWetnessComponent*       WetnessComponent;                                           // 0x0358   (0x0008)  
	bool                                               bTraceComplex;                                              // 0x0360   (0x0001)  
	TEnumAsByte<EDrawDebugTrace>                       DebugType;                                                  // 0x0361   (0x0001)  
	bool                                               bUseObjectChannels;                                         // 0x0362   (0x0001)  
	TEnumAsByte<ETraceTypeQuery>                       DetectChannel;                                              // 0x0363   (0x0001)  
	unsigned char                                      UnknownData03_6[0x4];                                       // 0x0364   (0x0004)  MISSED
	SDK_UNDEFINED(16,580) /* TArray<TEnumAsByte<EObjectTypeQuery>> */ __um(ObjectChannels);                        // 0x0368   (0x0010)  
	float                                              DetectRange;                                                // 0x0378   (0x0004)  
	unsigned char                                      UnknownData04_6[0x4];                                       // 0x037C   (0x0004)  MISSED
	class UMFClimateRainOcclusionTestManager*          RainOcclusionTestManager;                                   // 0x0380   (0x0008)  
	unsigned char                                      UnknownData05_7[0x48];                                      // 0x0388   (0x0048)  MISSED


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateRain.SetAmountOfRain
	// void SetAmountOfRain(float NewValue);                                                                                    // [0x1da4490] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateRain.SetAccumulation
	// void SetAccumulation(float NewValue);                                                                                    // [0x1da4410] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateRain.OnParameterUpdated
	// void OnParameterUpdated();                                                                                               // [0x1126c90] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFClimateRuntime.MFClimateRain.LineTraceRainOcclusion
	// bool LineTraceRainOcclusion(FVector position, TArray<AActor*>& ActorsToIgnore, FHitResult& OutHitResult);                // [0x1da3e60] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateRain.GetRainOcclusionRate
	// float GetRainOcclusionRate();                                                                                            // [0x1da3d50] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateRain.GetRainDownVector
	// FVector GetRainDownVector();                                                                                             // [0x1da3d10] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateRain.GetLastOcclusionMaterial
	// class UPhysicalMaterial* GetLastOcclusionMaterial();                                                                     // [0x1da3b80] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateRain.GetAmountOfRain
	// float GetAmountOfRain();                                                                                                 // [0x1da3a50] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateRain.GetAccumulation
	// float GetAccumulation();                                                                                                 // [0x1da3a30] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/MFClimateRuntime.MFClimateParticleRain
/// Size: 0x0110 (272 bytes) (0x0003D0 - 0x0004E0) align 16 pad: 0x0000
class AMFClimateParticleRain : public AMFClimateRain
{ 
public:
	class UActorComponent*                             RainShadowCapture;                                          // 0x03D0   (0x0008)  
	class UActorComponent*                             WideShadowCapture;                                          // 0x03D8   (0x0008)  
	TArray<class UNiagaraComponent*>                   NiagaraComponents;                                          // 0x03E0   (0x0010)  
	TArray<class UParticleSystemComponent*>            CascadesComponents;                                         // 0x03F0   (0x0010)  
	unsigned char                                      UnknownData00_7[0xE0];                                      // 0x0400   (0x00E0)  MISSED


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateParticleRain.OnWideShadowCaptureUpdated
	// void OnWideShadowCaptureUpdated(FMatrix Matrix);                                                                         // [0x3a75280] Event|Protected|HasDefaults|BlueprintEvent 
	// Function /Script/MFClimateRuntime.MFClimateParticleRain.OnRainShadowCaptureUpdated
	// void OnRainShadowCaptureUpdated(FMatrix Matrix);                                                                         // [0x3a75280] Event|Protected|HasDefaults|BlueprintEvent 
};

/// Class /Script/MFClimateRuntime.MFClimatePlayerTransformComponent
/// Size: 0x0050 (80 bytes) (0x000220 - 0x000270) align 16 pad: 0x0000
class UMFClimatePlayerTransformComponent : public USceneComponent
{ 
public:
	bool                                               bCameraOrPawn;                                              // 0x0220   (0x0001)  
	bool                                               bSyncPosition;                                              // 0x0221   (0x0001)  
	bool                                               bSyncRotation;                                              // 0x0222   (0x0001)  
	bool                                               bIgnorePitchRotation;                                       // 0x0223   (0x0001)  
	unsigned char                                      UnknownData00_7[0x4C];                                      // 0x0224   (0x004C)  MISSED
};

/// Struct /Script/MFClimateRuntime.MFClimateRainOcclusionTestQueueItem
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FMFClimateRainOcclusionTestQueueItem
{ 
	class UMFClimateMovableRainWetnessComponent*       Component;                                                  // 0x0000   (0x0008)  
	unsigned char                                      UnknownData00_7[0x10];                                      // 0x0008   (0x0010)  MISSED
};

/// Class /Script/MFClimateRuntime.MFClimateRainOcclusionTestManager
/// Size: 0x0038 (56 bytes) (0x0000F8 - 0x000130) align 8 pad: 0x0000
class UMFClimateRainOcclusionTestManager : public UActorComponent
{ 
public:
	class AMFClimateRain*                              Rain;                                                       // 0x00F8   (0x0008)  
	float                                              TickBudget;                                                 // 0x0100   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0104   (0x0004)  MISSED
	class UMFClimateMovableRainWetnessComponent*       LocalObservingTargetComponent;                              // 0x0108   (0x0008)  
	TArray<FMFClimateRainOcclusionTestQueueItem>       MovableObjectQueue;                                         // 0x0110   (0x0010)  
	TArray<FMFClimateRainOcclusionTestQueueItem>       MovableObjectQueue_Off;                                     // 0x0120   (0x0010)  
};

/// Class /Script/MFClimateRuntime.MFClimateSDFCanvas
/// Size: 0x0020 (32 bytes) (0x0002E0 - 0x000300) align 8 pad: 0x0000
class AMFClimateSDFCanvas : public AActor
{ 
public:
	class UStaticMeshComponent*                        Root;                                                       // 0x02E0   (0x0008)  
	class UStaticMesh*                                 SourceMesh;                                                 // 0x02E8   (0x0008)  
	class UVolumeTexture*                              TargetTexture;                                              // 0x02F0   (0x0008)  
	float                                              SaveDistanceFieldPortion;                                   // 0x02F8   (0x0004)  
	bool                                               bSaveEveryFrame;                                            // 0x02FC   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x02FD   (0x0003)  MISSED
};

/// Class /Script/MFClimateRuntime.MFClimateSettings
/// Size: 0x0010 (16 bytes) (0x000038 - 0x000048) align 8 pad: 0x0000
class UMFClimateSettings : public UDeveloperSettings
{ 
public:
	TArray<FSoftObjectPath>                            MFClimateMPCPaths;                                          // 0x0038   (0x0010)  
};

/// Class /Script/MFClimateRuntime.MFClimateSingleSceneLightComponent
/// Size: 0x0020 (32 bytes) (0x000118 - 0x000138) align 8 pad: 0x0000
class UMFClimateSingleSceneLightComponent : public UMFClimateSceneLightInterfaceComponent
{ 
public:
	class AMFClimateCelestialBody*                     BoundCelestialBody;                                         // 0x0118   (0x0008)  
	float                                              LongShadowFixDegrees;                                       // 0x0120   (0x0004)  
	float                                              LongShadowPower;                                            // 0x0124   (0x0004)  
	class ADirectionalLight*                           MainLight;                                                  // 0x0128   (0x0008)  
	class UDirectionalLightComponent*                  Light;                                                      // 0x0130   (0x0008)  
};

/// Class /Script/MFClimateRuntime.MFClimateSimpleLight
/// Size: 0x0008 (8 bytes) (0x0002E0 - 0x0002E8) align 8 pad: 0x0000
class AMFClimateSimpleLight : public AActor
{ 
public:
	class UMFClimateSingleSceneLightComponent*         MFClimateLight;                                             // 0x02E0   (0x0008)  
};

/// Class /Script/MFClimateRuntime.MFClimateSkyAtmosphereComponent
/// Size: 0x02C8 (712 bytes) (0x000110 - 0x0003D8) align 8 pad: 0x0000
class UMFClimateSkyAtmosphereComponent : public UMFClimateComponent
{ 
public:
	unsigned char                                      UnknownData00_3[0x240];                                     // 0x0110   (0x0240)  MISSED
	class USkyAtmosphereComponent*                     RawSkyAtmosphere;                                           // 0x0350   (0x0008)  
	FLinearColor                                       SkyAtmosphereTransmittanceAtZenith;                         // 0x0358   (0x0010)  
	FLinearColor                                       SkyAtmosphereTransmittanceCurrent[2];                       // 0x0368   (0x0020)  
	class UTexture2D*                                  CpuSkyAtmosphereSkyTex;                                     // 0x0388   (0x0008)  
	class UTexture2D*                                  CpuSkyAtmosphereTransmittanceTex;                           // 0x0390   (0x0008)  
	unsigned char                                      UnknownData01_7[0x40];                                      // 0x0398   (0x0040)  MISSED
};

/// Class /Script/MFClimateRuntime.MFClimateBaseSkyMesh
/// Size: 0x0008 (8 bytes) (0x0002E0 - 0x0002E8) align 8 pad: 0x0000
class AMFClimateBaseSkyMesh : public AActor
{ 
public:
	bool                                               bCenterAtCamera;                                            // 0x02E0   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x02E1   (0x0007)  MISSED


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateBaseSkyMesh.OnSystemTexturesUpdated
	// void OnSystemTexturesUpdated();                                                                                          // [0x1126c90] Native|Event|Public|BlueprintEvent 
};

/// Class /Script/MFClimateRuntime.MFClimateSingleMeshSky
/// Size: 0x0028 (40 bytes) (0x0002E8 - 0x000310) align 8 pad: 0x0000
class AMFClimateSingleMeshSky : public AMFClimateBaseSkyMesh
{ 
public:
	class UMaterialInterface*                          Material;                                                   // 0x02E8   (0x0008)  
	class UStaticMeshComponent*                        ShadingMesh;                                                // 0x02F0   (0x0008)  
	FVector                                            SkySphereScale;                                             // 0x02F8   (0x000C)  
	FVector                                            SkySphereLocation;                                          // 0x0304   (0x000C)  
};

/// Class /Script/MFClimateRuntime.MFClimateStatics
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFClimateStatics : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateStatics.StepTimeOfDay
	// void StepTimeOfDay(class UObject* WorldContextObject, float StepInHours);                                                // [0x1da9790] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateStatics.SetWindLevel
	// void SetWindLevel(class UObject* WorldContextObject, float WindLevel);                                                   // [0x1da9560] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateStatics.SetWindDirection
	// void SetWindDirection(class UObject* WorldContextObject, FVector2D WindDir);                                             // [0x1da94a0] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateStatics.SetWeatherPresetWeights
	// void SetWeatherPresetWeights(class UObject* WorldContextObject, TArray<float>& Params);                                  // [0x1da93c0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateStatics.SetTimeOfDay
	// void SetTimeOfDay(class UObject* WorldContextObject, float InTODTime);                                                   // [0x1da91b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateStatics.SetSystemTextures
	// void SetSystemTextures(class UObject* WorldContextObject, class UMaterialInstanceDynamic* Mid);                          // [0x1da90f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateStatics.SetNorthVector
	// void SetNorthVector(class UObject* WorldContextObject, FVector NorthVector);                                             // [0x1da8fa0] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateStatics.SetMatrixRowAsMPCVectorParameter
	// void SetMatrixRowAsMPCVectorParameter(class UObject* WorldContextObject, class UMaterialParameterCollection* MPC, FMatrix& InMatrix, FVector Translation, FName RowName0, FName RowName1, FName RowName2, FName RowName3); // [0x1da8d30] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateStatics.SetMatrixRowAsMIDVectorParameter
	// void SetMatrixRowAsMIDVectorParameter(class UMaterialInstanceDynamic* Mid, FMatrix& InMatrix, FVector Translation, FName RowName0, FName RowName1, FName RowName2, FName RowName3); // [0x1da8b00] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateStatics.SetEditorViewportRotation
	// void SetEditorViewportRotation(FRotator Rotation);                                                                       // [0x1da8920] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateStatics.SetEditorViewportLocation
	// void SetEditorViewportLocation(FVector position);                                                                        // [0x1da8920] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateStatics.SetAutoStepTimeRate
	// void SetAutoStepTimeRate(class UObject* WorldContextObject, float InAutoStepTimeRate);                                   // [0x1da86c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateStatics.ProjectPointOnCircleLayer
	// float ProjectPointOnCircleLayer(float PointExtent, float CircleRadius);                                                  // [0x1da8460] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.ModuloWarpNegative
	// float ModuloWarpNegative(float Value, float Mod);                                                                        // [0x1da8390] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetWindVelocity
	// FVector2D GetWindVelocity(class UObject* WorldContextObject);                                                            // [0x1da82e0] Final|Native|Static|Public|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetWindLevel
	// float GetWindLevel(class UObject* WorldContextObject);                                                                   // [0x1da8250] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetWindDirection
	// FVector2D GetWindDirection(class UObject* WorldContextObject);                                                           // [0x1da81c0] Final|Native|Static|Public|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetWeatherPresetWeights
	// void GetWeatherPresetWeights(class UObject* WorldContextObject, TArray<float>& Params);                                  // [0x1da80e0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetTimeOfDay
	// float GetTimeOfDay(class UObject* WorldContextObject);                                                                   // [0x1da8010] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetSystem
	// class UMFClimateWorldSubSystem* GetSystem(class UObject* WorldContextObject);                                            // [0x1da7650] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetQualityLevel
	// int32_t GetQualityLevel();                                                                                               // [0x1da7f00] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetPlayerRotation
	// FRotator GetPlayerRotation(class UObject* WorldContextObject);                                                           // [0x1da7e60] Final|Native|Static|Public|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetPlayerLocation
	// FVector GetPlayerLocation(class UObject* WorldContextObject);                                                            // [0x1da7dc0] Final|Native|Static|Public|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetNumWeatherPresets
	// int32_t GetNumWeatherPresets(class UObject* WorldContextObject);                                                         // [0x1da7d30] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetNorthVector
	// FVector GetNorthVector(class UObject* WorldContextObject);                                                               // [0x1da7c60] Final|Native|Static|Public|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetNorthAngleOffset
	// float GetNorthAngleOffset(class UObject* WorldContextObject);                                                            // [0x1da7bd0] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetMatrixRow
	// FVector4 GetMatrixRow(FMatrix& Matrix, int32_t Row);                                                                     // [0x1da79f0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetFirstSystem
	// class UMFClimateWorldSubSystem* GetFirstSystem(class UObject* WorldContextObject);                                       // [0x1da7650] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetFeature
	// class UObject* GetFeature(class UObject* WorldContextObject, class UClass* FeatureType);                                 // [0x1da7580] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetEastVector
	// FVector GetEastVector(class UObject* WorldContextObject);                                                                // [0x1da7450] Final|Native|Static|Public|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetEastAngleOffset
	// float GetEastAngleOffset(class UObject* WorldContextObject);                                                             // [0x1da73c0] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetCameraRotation
	// FRotator GetCameraRotation(class UObject* WorldContextObject);                                                           // [0x1da71c0] Final|Native|Static|Public|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetCameraLocation
	// FVector GetCameraLocation(class UObject* WorldContextObject);                                                            // [0x1da7120] Final|Native|Static|Public|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetCameraAspect
	// float GetCameraAspect(class UObject* WorldContextObject);                                                                // [0x1da7090] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GetAutoStepTimeRate
	// float GetAutoStepTimeRate(class UObject* WorldContextObject);                                                            // [0x1da6fe0] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GaussianSampleFromStream
	// float GaussianSampleFromStream(FRandomStream& Stream, float Mean, float StdDev);                                         // [0x1da6d20] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.GaussianSample
	// float GaussianSample(float Mean, float StdDev);                                                                          // [0x1da6c50] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.ComputeCubemapBrightness
	// FVector ComputeCubemapBrightness(class UTextureCube* InCubemap);                                                         // [0x1da6bb0] Final|Native|Static|Public|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateStatics.ChangeToWeatherPreset
	// void ChangeToWeatherPreset(class UObject* WorldContextObject, int32_t WeatherIndex);                                     // [0x1da6af0] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFClimateRuntime.MFClimateSunMoonSceneLightComponent
/// Size: 0x0078 (120 bytes) (0x000118 - 0x000190) align 8 pad: 0x0000
class UMFClimateSunMoonSceneLightComponent : public UMFClimateSceneLightInterfaceComponent
{ 
public:
	class AMFClimateCelestialBody*                     BindSun;                                                    // 0x0118   (0x0008)  
	class AMFClimateCelestialBody*                     BindMoon;                                                   // 0x0120   (0x0008)  
	float                                              MainLightTransferTime;                                      // 0x0128   (0x0004)  
	float                                              LongShadowFixDegrees;                                       // 0x012C   (0x0004)  
	float                                              LongShadowFixPower;                                         // 0x0130   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0134   (0x0004)  MISSED
	class ADirectionalLight*                           MainDirectionalLight;                                       // 0x0138   (0x0008)  
	class UDirectionalLightComponent*                  MainDirectionalLightComponent;                              // 0x0140   (0x0008)  
	FLinearColor                                       LightningColor;                                             // 0x0148   (0x0010)  
	class UDirectionalLightComponent*                  FakeAtmLight1;                                              // 0x0158   (0x0008)  
	class UDirectionalLightComponent*                  FakeAtmLight2;                                              // 0x0160   (0x0008)  
	float                                              SunWeight;                                                  // 0x0168   (0x0004)  
	FLinearColor                                       SunScatteredIrradiance;                                     // 0x016C   (0x0010)  
	FLinearColor                                       MoonScatteredIrradiance;                                    // 0x017C   (0x0010)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x018C   (0x0004)  MISSED
};

/// Class /Script/MFClimateRuntime.MFClimateSunMoonSceneLight
/// Size: 0x0008 (8 bytes) (0x0002E0 - 0x0002E8) align 8 pad: 0x0000
class AMFClimateSunMoonSceneLight : public AActor
{ 
public:
	class UMFClimateSunMoonSceneLightComponent*        MFClimateLight;                                             // 0x02E0   (0x0008)  
};

/// Class /Script/MFClimateRuntime.MFClimateTimeGeographyComponent
/// Size: 0x0100 (256 bytes) (0x000110 - 0x000210) align 16 pad: 0x0000
class UMFClimateTimeGeographyComponent : public UMFClimateComponent
{ 
public:
	float                                              TimeZone;                                                   // 0x0110   (0x0004)  
	float                                              YearPercent;                                                // 0x0114   (0x0004)  
	float                                              TimeOfDay;                                                  // 0x0118   (0x0004)  
	float                                              Longitude;                                                  // 0x011C   (0x0004)  
	float                                              Latitude;                                                   // 0x0120   (0x0004)  
	float                                              EarthAxialTilt;                                             // 0x0124   (0x0004)  
	float                                              EarthRadiusKM;                                              // 0x0128   (0x0004)  
	FVector2D                                          SceneNorthVector;                                           // 0x012C   (0x0008)  
	bool                                               bAutoStepTime;                                              // 0x0134   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0135   (0x0003)  MISSED
	float                                              AutoStepTimeRate;                                           // 0x0138   (0x0004)  
	EAutoAutoStepMode                                  AutoStepInEditor;                                           // 0x013C   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x013D   (0x0003)  MISSED
	float                                              AutoStepRateInEditor;                                       // 0x0140   (0x0004)  
	unsigned char                                      UnknownData02_7[0xCC];                                      // 0x0144   (0x00CC)  MISSED


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.TransformSceneVectorToEcliptic
	// FVector TransformSceneVectorToEcliptic(FVector Vector);                                                                  // [0x1da99b0] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.TransformEclipticVectorToScene
	// FVector TransformEclipticVectorToScene(FVector Vector);                                                                  // [0x1da9900] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.StepTimeOfDay
	// void StepTimeOfDay(float DeltaHour);                                                                                     // [0x1da9850] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.SetYearPercentFromMonthAndDay
	// float SetYearPercentFromMonthAndDay(int32_t InMonth, int32_t InDay);                                                     // [0x1da96c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.SetYearPercent
	// void SetYearPercent(float NewValue);                                                                                     // [0x1da9620] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.SetTimeZone
	// void SetTimeZone(float NewValue);                                                                                        // [0x1da9310] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.SetTimeOfDay
	// void SetTimeOfDay(float NewValue);                                                                                       // [0x1da9270] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.SetNorthVector
	// void SetNorthVector(FVector2D NewNorthVector);                                                                           // [0x1da9070] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.SetLongitude
	// void SetLongitude(float NewValue);                                                                                       // [0x1da8a50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.SetLatitude
	// void SetLatitude(float NewValue);                                                                                        // [0x1da89a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.SetEarthRadiusKM
	// void SetEarthRadiusKM(float NewValue);                                                                                   // [0x1da8890] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.SetEarthAxialTilt
	// void SetEarthAxialTilt(float NewValue);                                                                                  // [0x1da8800] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.SetAutoStepTimeRate
	// void SetAutoStepTimeRate(float InValue);                                                                                 // [0x1da8780] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.SetAutoStepTimeEditorRate
	// void SetAutoStepTimeEditorRate(float InValue);                                                                           // [0x1da8640] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.SetAutoStepTimeEditor
	// void SetAutoStepTimeEditor(EAutoAutoStepMode InValue);                                                                   // [0x1da85c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.SetAutoStepTime
	// void SetAutoStepTime(bool InValue);                                                                                      // [0x1da8530] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.GetYearPercent
	// float GetYearPercent();                                                                                                  // [0x1da8370] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.GetTimeZone
	// float GetTimeZone();                                                                                                     // [0x1da80c0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.GetTimeOfDay
	// float GetTimeOfDay();                                                                                                    // [0x1da80a0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.GetSunRotationProgressPingPong
	// float GetSunRotationProgressPingPong();                                                                                  // [0x1da7fe0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.GetSunRotationProgress
	// float GetSunRotationProgress();                                                                                          // [0x1da7fb0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.GetSunHorizonAngle
	// float GetSunHorizonAngle();                                                                                              // [0x1da7f80] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.GetSceneToEclipticMatrix
	// FMatrix GetSceneToEclipticMatrix();                                                                                      // [0x1da7f30] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.GetNorthVector
	// FVector2D GetNorthVector();                                                                                              // [0x1da7d00] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.GetMonthAndDay
	// void GetMonthAndDay(int32_t& OutMonth, int32_t& OutDay);                                                                 // [0x1da7af0] Final|Native|Public|HasOutParms|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.GetLongitude
	// float GetLongitude();                                                                                                    // [0x1da7920] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.GetLatitude
	// float GetLatitude();                                                                                                     // [0x1da7720] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.GetEclipticToSceneMatrix
	// FMatrix GetEclipticToSceneMatrix();                                                                                      // [0x1da7530] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.GetEastVector
	// FVector2D GetEastVector();                                                                                               // [0x1da74f0] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.GetEarthRadiusKM
	// float GetEarthRadiusKM();                                                                                                // [0x1da73a0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.GetEarthAxialTilt
	// float GetEarthAxialTilt();                                                                                               // [0x1da3cf0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.GetAutoStepTimeRate
	// float GetAutoStepTimeRate();                                                                                             // [0x1da7070] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.GetAutoStepTimeEditorRate
	// float GetAutoStepTimeEditorRate();                                                                                       // [0x1da6fc0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.GetAutoStepTimeEditor
	// EAutoAutoStepMode GetAutoStepTimeEditor();                                                                               // [0x1da6fa0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.GetAutoStepTime
	// bool GetAutoStepTime();                                                                                                  // [0x1da6f80] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateTimeGeographyComponent.CalculateEclipticToSceneMatrixAtTimeOfDay
	// void CalculateEclipticToSceneMatrixAtTimeOfDay(float InTimeOfDay, float InYearPercent, FRotator& OutEarthToEclipticRotator, FMatrix& OutSceneToEarthMatrix, FMatrix& OutSceneToEclipticMatrix, FMatrix& OutEclipticToSceneMatrix); // [0x1da68b0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/MFClimateRuntime.MFClimateTimeGeography
/// Size: 0x0008 (8 bytes) (0x0002E0 - 0x0002E8) align 8 pad: 0x0000
class AMFClimateTimeGeography : public AActor
{ 
public:
	class UMFClimateTimeGeographyComponent*            TimeGeographyComponent;                                     // 0x02E0   (0x0008)  
};

/// Class /Script/MFClimateRuntime.MFClimateTodIrcBase
/// Size: 0x0060 (96 bytes) (0x0000B8 - 0x000118) align 8 pad: 0x0000
class UMFClimateTodIrcBase : public UMFClimateBakeProcedure
{ 
public:
	FString                                            OutputFolder;                                               // 0x00B8   (0x0010)  
	FString                                            FileNameFormat;                                             // 0x00C8   (0x0010)  
	TArray<FString>                                    CameraTagFilter;                                            // 0x00D8   (0x0010)  
	bool                                               bSyncEditorViewportWithCamera;                              // 0x00E8   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x00E9   (0x0007)  MISSED
	TArray<class AMFClimateIrcCamera*>                 Cameras;                                                    // 0x00F0   (0x0010)  
	FVector                                            BackupCameraLocation;                                       // 0x0100   (0x000C)  
	FRotator                                           BackupCameraRotation;                                       // 0x010C   (0x000C)  


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateTodIrcBase.GetOutputFileName
	// FString GetOutputFileName();                                                                                             // [0x1dac080] Final|Native|Protected|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFClimateRuntime.MFClimateTodIrc2D
/// Size: 0x0010 (16 bytes) (0x000118 - 0x000128) align 8 pad: 0x0000
class UMFClimateTodIrc2D : public UMFClimateTodIrcBase
{ 
public:
	bool                                               bSuperFastEyeAdaption;                                      // 0x0118   (0x0001)  
	bool                                               bHDR;                                                       // 0x0119   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x011A   (0x0002)  MISSED
	int32_t                                            Width;                                                      // 0x011C   (0x0004)  
	int32_t                                            Height;                                                     // 0x0120   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x0124   (0x0004)  MISSED
};

/// Class /Script/MFClimateRuntime.MFClimateTodIrcPanorama
/// Size: 0x0008 (8 bytes) (0x000118 - 0x000120) align 8 pad: 0x0000
class UMFClimateTodIrcPanorama : public UMFClimateTodIrcBase
{ 
public:
	int32_t                                            Size;                                                       // 0x0118   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x011C   (0x0004)  MISSED
};

/// Class /Script/MFClimateRuntime.MFClimateTodSequenceMixer
/// Size: 0x0010 (16 bytes) (0x0002E0 - 0x0002F0) align 8 pad: 0x0000
class AMFClimateTodSequenceMixer : public AActor
{ 
public:
	class UMFClimateWeatherComponent*                  WeatherComponent;                                           // 0x02E0   (0x0008)  
	class UMFClimateWeatherLayerPresetsComponent*      PresetsComponent;                                           // 0x02E8   (0x0008)  
};

/// Class /Script/MFClimateRuntime.MFClimateTypes
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFClimateTypes : public UObject
{ 
public:
};

/// Class /Script/MFClimateRuntime.MFClimateUIBase
/// Size: 0x0008 (8 bytes) (0x000288 - 0x000290) align 8 pad: 0x0000
class UMFClimateUIBase : public UUserWidget
{ 
public:
	class UMFClimateWorldSubSystem*                    MFClimateSystem;                                            // 0x0288   (0x0008)  


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateUIBase.SetWeatherConditionWeight
	// void SetWeatherConditionWeight(int32_t Index, float Weight);                                                             // [0x1dacf60] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateUIBase.SetTimeOfDay
	// void SetTimeOfDay(float TimeOfDay);                                                                                      // [0x1dacee0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateUIBase.OnTODChanged
	// void OnTODChanged(FText& NewTime);                                                                                       // [0x1dac7f0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateUIBase.GetWeatherConditionWeight
	// float GetWeatherConditionWeight(int32_t Index);                                                                          // [0x1dac6f0] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateUIBase.GetWeatherConditionName
	// FString GetWeatherConditionName(int32_t SequenceIndex);                                                                  // [0x1dac610] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateUIBase.GetTODText
	// FText GetTODText(float InValue);                                                                                         // [0x1dac460] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateUIBase.GetTimeOfDay
	// float GetTimeOfDay();                                                                                                    // [0x1dac580] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFClimateRuntime.MFClimateUIBase.GetMFClimateSystem
	// class UMFClimateWorldSubSystem* GetMFClimateSystem();                                                                    // [0x1dac050] Final|Native|Public|BlueprintCallable|BlueprintPure 
};

/// Struct /Script/MFClimateRuntime.MFClimateCloudSettings
/// Size: 0x008C (140 bytes) (0x000000 - 0x00008C) align 4 pad: 0x0000
struct FMFClimateCloudSettings
{ 
	float                                              CloudBaseTilingVertical;                                    // 0x0000   (0x0004)  
	float                                              CloudBaseTilingHorizontal;                                  // 0x0004   (0x0004)  
	float                                              CloudDetailTiling;                                          // 0x0008   (0x0004)  
	float                                              CloudDetailStrength;                                        // 0x000C   (0x0004)  
	float                                              CloudCurlStrength;                                          // 0x0010   (0x0004)  
	float                                              CloudCurlTiling;                                            // 0x0014   (0x0004)  
	float                                              DetailWindMultiply;                                         // 0x0018   (0x0004)  
	float                                              CloudBottomHeight;                                          // 0x001C   (0x0004)  
	float                                              CloudThickness;                                             // 0x0020   (0x0004)  
	float                                              CloudDetailFadeStart;                                       // 0x0024   (0x0004)  
	float                                              CloudDetailFadeEnd;                                         // 0x0028   (0x0004)  
	float                                              HorizonAARange;                                             // 0x002C   (0x0004)  
	float                                              HorizonAAValue;                                             // 0x0030   (0x0004)  
	FLinearColor                                       CloudAlbedo;                                                // 0x0034   (0x0010)  
	float                                              CloudExtinction;                                            // 0x0044   (0x0004)  
	float                                              CloudFirstLobeG;                                            // 0x0048   (0x0004)  
	float                                              CloudSecondLobeG;                                           // 0x004C   (0x0004)  
	float                                              MaxShadowRayLength;                                         // 0x0050   (0x0004)  
	float                                              ShadowAttenuation;                                          // 0x0054   (0x0004)  
	float                                              CloudAmbientOcclusionSky;                                   // 0x0058   (0x0004)  
	float                                              CloudAmbientOcclusionGround;                                // 0x005C   (0x0004)  
	float                                              CloudOpacityScale;                                          // 0x0060   (0x0004)  
	FLinearColor                                       CloudEmissive;                                              // 0x0064   (0x0010)  
	FLinearColor                                       LightningTint;                                              // 0x0074   (0x0010)  
	float                                              EarthShadowSharpness;                                       // 0x0084   (0x0004)  
	float                                              InscatteringBrightness;                                     // 0x0088   (0x0004)  
};

/// Class /Script/MFClimateRuntime.MFClimateVolumeCloudComponent
/// Size: 0x03B8 (952 bytes) (0x000110 - 0x0004C8) align 8 pad: 0x0000
class UMFClimateVolumeCloudComponent : public UMFClimateComponent
{ 
public:
	bool                                               bAutoColorFromSystem;                                       // 0x0110   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0111   (0x0003)  MISSED
	FLinearColor                                       SunColorTop;                                                // 0x0114   (0x0010)  
	FLinearColor                                       SunColorBottom;                                             // 0x0124   (0x0010)  
	FVector                                            SunDirection;                                               // 0x0134   (0x000C)  
	FLinearColor                                       CloudAmbientGround;                                         // 0x0140   (0x0010)  
	FLinearColor                                       CloudAmbientSky;                                            // 0x0150   (0x0010)  
	float                                              PreExposureSmoothness;                                      // 0x0160   (0x0004)  
	bool                                               bAutoWindFromSystem;                                        // 0x0164   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0165   (0x0003)  MISSED
	float                                              SystemWindMultiplier;                                       // 0x0168   (0x0004)  
	FVector2D                                          CloudWind;                                                  // 0x016C   (0x0008)  
	float                                              CloudVerticalWind;                                          // 0x0174   (0x0004)  
	class AMFClimateWeatherMapGenerator*               WeatherMapGenerator;                                        // 0x0178   (0x0008)  
	class UTexture*                                    CustomWeatherMap;                                           // 0x0180   (0x0008)  
	float                                              CustomWeatherMapSize;                                       // 0x0188   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x018C   (0x0004)  MISSED
	class UMFClimateCloudProfile*                      CloudProfile;                                               // 0x0190   (0x0008)  
	FMFClimateCloudSettings                            CloudSettings;                                              // 0x0198   (0x008C)  
	unsigned char                                      UnknownData03_6[0x21C];                                     // 0x0224   (0x021C)  MISSED
	float                                              HibernateUpdateRemain;                                      // 0x0440   (0x0004)  
	unsigned char                                      UnknownData04_6[0x4];                                       // 0x0444   (0x0004)  MISSED
	class UMFClimateCloudNoiseGroupPlatformSwitcher*   NoiseGroupSwitcher;                                         // 0x0448   (0x0008)  
	class UTextureRenderTarget2D*                      MSApproxRT;                                                 // 0x0450   (0x0008)  
	class UTextureRenderTarget2D*                      RaymarchRTFull;                                             // 0x0458   (0x0008)  
	class UTextureRenderTarget2D*                      RaymarchRTCheckerboard;                                     // 0x0460   (0x0008)  
	class UTextureRenderTarget2D*                      ResolveRT;                                                  // 0x0468   (0x0008)  
	class UVolumeTexture*                              CachedBaseNoiseTexture;                                     // 0x0470   (0x0008)  
	class UVolumeTexture*                              CachedDetailNoiseTexture;                                   // 0x0478   (0x0008)  
	class UTexture2D*                                  CachedCurlNoiseTexture;                                     // 0x0480   (0x0008)  
	class UTexture2D*                                  CachedLUT0Texture;                                          // 0x0488   (0x0008)  
	TArray<class AMFClimateCloudCustomVolume*>         CustomVolumes;                                              // 0x0490   (0x0010)  
	unsigned char                                      UnknownData05_6[0x8];                                       // 0x04A0   (0x0008)  MISSED
	class AMFClimateCloudCustomVolumesManager*         SDFManager;                                                 // 0x04A8   (0x0008)  
	class UTextureRenderTarget2D*                      SDFCloudRTFull;                                             // 0x04B0   (0x0008)  
	class UTextureRenderTarget2D*                      SDFCloudRTCheckerboard;                                     // 0x04B8   (0x0008)  
	class UTextureRenderTarget2D*                      SDFCloudResolveRT;                                          // 0x04C0   (0x0008)  


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateVolumeCloudComponent.GetSDFCloudRaymarchResult
	// class UTexture* GetSDFCloudRaymarchResult();                                                                             // [0x1dac360] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateVolumeCloudComponent.GetRaymarchResult
	// class UTexture* GetRaymarchResult();                                                                                     // [0x1dac340] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/MFClimateRuntime.MFClimateVolumeCloud
/// Size: 0x0008 (8 bytes) (0x0002E0 - 0x0002E8) align 8 pad: 0x0000
class AMFClimateVolumeCloud : public AActor
{ 
public:
	class UMFClimateVolumeCloudComponent*              VolumeCloud;                                                // 0x02E0   (0x0008)  
};

/// Struct /Script/MFClimateRuntime.MFClimateWeatherLayer
/// Size: 0x0058 (88 bytes) (0x000000 - 0x000058) align 8 pad: 0x0000
struct FMFClimateWeatherLayer
{ 
	float                                              BlendWeight;                                                // 0x0000   (0x0004)  
	float                                              EffectiveBlendWeight;                                       // 0x0004   (0x0004)  
	class ULevelSequence*                              TimeOfDaySequence;                                          // 0x0008   (0x0008)  
	EWeatherLayerEvaluationMode                        EvaluationMode;                                             // 0x0010   (0x0004)  
	bool                                               bIgnorePresetSystem;                                        // 0x0014   (0x0001)  
	unsigned char                                      UnknownData00_7[0x43];                                      // 0x0015   (0x0043)  MISSED
};

/// Class /Script/MFClimateRuntime.MFClimateWeatherComponent
/// Size: 0x0090 (144 bytes) (0x000110 - 0x0001A0) align 8 pad: 0x0000
class UMFClimateWeatherComponent : public UMFClimateComponent
{ 
public:
	class AMFClimateWeatherLayerSceneBindings*         SceneBindings;                                              // 0x0110   (0x0008)  
	TArray<FMFClimateWeatherLayer>                     Layers;                                                     // 0x0118   (0x0010)  
	unsigned char                                      UnknownData00_6[0x70];                                      // 0x0128   (0x0070)  MISSED
	bool                                               bBindingsDirty;                                             // 0x0198   (0x0001)  
	unsigned char                                      UnknownData01_7[0x7];                                       // 0x0199   (0x0007)  MISSED


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateWeatherComponent.SetSequenceWeight
	// void SetSequenceWeight(class ULevelSequence* Sequence, float NewWeight);                                                 // [0x1dace10] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateWeatherComponent.GetSequenceCurrentWeight
	// float GetSequenceCurrentWeight(class ULevelSequence* Sequence);                                                          // [0x1dac3c0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateWeatherComponent.EvaluateAndUpdateValuesImmediately
	// void EvaluateAndUpdateValuesImmediately();                                                                               // [0x1dabf30] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateWeatherComponent.BlendInSequencesAndFadeOthers
	// void BlendInSequencesAndFadeOthers(TArray<ULevelSequence*> ToBlendIn, float MaxDelta);                                   // [0x1dabe00] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateWeatherComponent.AddSequenceWeight
	// void AddSequenceWeight(class ULevelSequence* Sequence, float Delta);                                                     // [0x1dabd30] Final|Native|Public|BlueprintCallable 
};

/// Struct /Script/MFClimateRuntime.MFClimateWeatherLayerPresetItem
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FMFClimateWeatherLayerPresetItem
{ 
	class ULevelSequence*                              Sequence;                                                   // 0x0000   (0x0008)  
	float                                              Weight;                                                     // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x000C   (0x0004)  MISSED
};

/// Struct /Script/MFClimateRuntime.MFClimateLayerPreset
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 8 pad: 0x0000
struct FMFClimateLayerPreset
{ 
	FString                                            PresetName;                                                 // 0x0000   (0x0010)  
	TArray<FMFClimateWeatherLayerPresetItem>           Items;                                                      // 0x0010   (0x0010)  
	float                                              Weight;                                                     // 0x0020   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0024   (0x0004)  MISSED
};

/// Class /Script/MFClimateRuntime.MFClimateWeatherLayerPresetsComponent
/// Size: 0x0018 (24 bytes) (0x000110 - 0x000128) align 8 pad: 0x0000
class UMFClimateWeatherLayerPresetsComponent : public UMFClimateComponent
{ 
public:
	TArray<FMFClimateLayerPreset>                      ActivatedPresets;                                           // 0x0110   (0x0010)  
	class UMFClimateWeatherComponent*                  WeatherComponent;                                           // 0x0120   (0x0008)  


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateWeatherLayerPresetsComponent.UpdateLayerWeights
	// void UpdateLayerWeights(bool bEvaluateImmediately);                                                                      // [0x1dad030] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateWeatherLayerPresetsComponent.SetPresetWeights
	// void SetPresetWeights(TArray<float>& Weights, bool bEvaluateImmediately);                                                // [0x1dacd10] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateWeatherLayerPresetsComponent.SetPresetWeightByName
	// void SetPresetWeightByName(FString PresetName, float NewWeight, bool bEvaluateImmediately);                              // [0x1dacb90] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateWeatherLayerPresetsComponent.SetPresetWeight
	// void SetPresetWeight(int32_t PresetID, float NewWeight, bool bEvaluateImmediately);                                      // [0x1daca80] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateWeatherLayerPresetsComponent.SaveCurrentLayersAsPreset
	// int32_t SaveCurrentLayersAsPreset(int32_t PresetID);                                                                     // [0x1dac8c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateWeatherLayerPresetsComponent.GetPresetWeight
	// float GetPresetWeight(int32_t PresetID);                                                                                 // [0x1dac240] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateWeatherLayerPresetsComponent.GetPresetName
	// FString GetPresetName(int32_t PresetID);                                                                                 // [0x1dac100] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateWeatherLayerPresetsComponent.GetPresetCount
	// int32_t GetPresetCount();                                                                                                // [0x1da80a0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateWeatherLayerPresetsComponent.AddPresetWeight
	// void AddPresetWeight(int32_t PresetID, float DeltaWeight);                                                               // [0x1dabc60] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFClimateRuntime.MFClimateWeatherLayerSceneBindings
/// Size: 0x0068 (104 bytes) (0x0002E0 - 0x000348) align 8 pad: 0x0000
class AMFClimateWeatherLayerSceneBindings : public AInfo
{ 
public:
	unsigned char                                      UnknownData00_3[0x18];                                      // 0x02E0   (0x0018)  MISSED
	SDK_UNDEFINED(80,581) /* TMap<FName, TLazyObjectPtr<AActor*>> */ __um(PersistentMappings_New);                 // 0x02F8   (0x0050)  
};

/// Class /Script/MFClimateRuntime.MFClimateWeatherListEntry
/// Size: 0x0008 (8 bytes) (0x000290 - 0x000298) align 8 pad: 0x0000
class UMFClimateWeatherListEntry : public UMFClimateUIBase
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0290   (0x0008)  MISSED
};

/// Class /Script/MFClimateRuntime.MFClimateWeatherMapGenerator
/// Size: 0x0030 (48 bytes) (0x0002E0 - 0x000310) align 8 pad: 0x0000
class AMFClimateWeatherMapGenerator : public AActor
{ 
public:
	bool                                               bRefreshEveryFrame;                                         // 0x02E0   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x02E1   (0x0003)  MISSED
	int32_t                                            WeatherMapScaleInKM;                                        // 0x02E4   (0x0004)  
	class UTextureRenderTarget2D*                      OutputTarget;                                               // 0x02E8   (0x0008)  
	unsigned char                                      UnknownData01_6[0x10];                                      // 0x02F0   (0x0010)  MISSED
	float                                              GlobalCoverage;                                             // 0x0300   (0x0004)  
	float                                              GlobalCloudType;                                            // 0x0304   (0x0004)  
	bool                                               bGeometryDirty;                                             // 0x0308   (0x0001)  
	bool                                               bRenderingDirty;                                            // 0x0309   (0x0001)  
	unsigned char                                      UnknownData02_7[0x6];                                       // 0x030A   (0x0006)  MISSED


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateWeatherMapGenerator.SetGlobalCoverage
	// void SetGlobalCoverage(float NewValue);                                                                                  // [0x1dac9f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFClimateRuntime.MFClimateWeatherMapGenerator.SetGlobalCloudType
	// void SetGlobalCloudType(float NewValue);                                                                                 // [0x1dac960] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFClimateRuntime.MFClimateWeatherMapCloudMask
/// Size: 0x0030 (48 bytes) (0x0002E0 - 0x000310) align 16 pad: 0x0000
class AMFClimateWeatherMapCloudMask : public AActor
{ 
public:
	int32_t                                            DrawLayer;                                                  // 0x02E0   (0x0004)  
	EMFClimateCloudMaskType                            DrawType;                                                   // 0x02E4   (0x0004)  
	class UMaterialInterface*                          Material;                                                   // 0x02E8   (0x0008)  
	class UMaterialInstanceDynamic*                    Mid;                                                        // 0x02F0   (0x0008)  
	unsigned char                                      UnknownData00_6[0x8];                                       // 0x02F8   (0x0008)  MISSED
	FVector4                                           MaterialParameter;                                          // 0x0300   (0x0010)  
};

/// Struct /Script/MFClimateRuntime.MFClimateMPCItem
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FMFClimateMPCItem
{ 
	class UMaterialParameterCollection*                PublicMPC;                                                  // 0x0000   (0x0008)  
	class UMaterialParameterCollectionInstance*        MPCI;                                                       // 0x0008   (0x0008)  
};

/// Class /Script/MFClimateRuntime.MFClimateWorldSubSystem
/// Size: 0x00A0 (160 bytes) (0x000030 - 0x0000D0) align 8 pad: 0x0000
class UMFClimateWorldSubSystem : public UWorldSubsystem
{ 
public:
	unsigned char                                      UnknownData00_3[0x60];                                      // 0x0030   (0x0060)  MISSED
	TArray<class UObject*>                             DuplicatedFeatures;                                         // 0x0090   (0x0010)  
	TArray<class UObject*>                             FeatureTable;                                               // 0x00A0   (0x0010)  
	unsigned char                                      UnknownData01_6[0x10];                                      // 0x00B0   (0x0010)  MISSED
	TArray<FMFClimateMPCItem>                          PublicMPCs;                                                 // 0x00C0   (0x0010)  


	/// Functions
	// Function /Script/MFClimateRuntime.MFClimateWorldSubSystem.GetWindComponent
	// class UMFClimateGlobalWindComponent* GetWindComponent();                                                                 // [0x1dac7c0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateWorldSubSystem.GetWeatherLayerPresetComponent
	// class UMFClimateWeatherLayerPresetsComponent* GetWeatherLayerPresetComponent();                                          // [0x1dac790] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateWorldSubSystem.GetWeatherComponent
	// class UMFClimateWeatherComponent* GetWeatherComponent();                                                                 // [0x1dac5e0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateWorldSubSystem.GetVolumeCloud
	// class UMFClimateVolumeCloudComponent* GetVolumeCloud();                                                                  // [0x1dac5b0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateWorldSubSystem.GetTimeAndGeographyComponent
	// class UMFClimateTimeGeographyComponent* GetTimeAndGeographyComponent();                                                  // [0x1dac550] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateWorldSubSystem.GetSceneLightInterface
	// class UMFClimateSceneLightInterfaceComponent* GetSceneLightInterface();                                                  // [0x1dac390] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateWorldSubSystem.GetRain
	// class AMFClimateRain* GetRain();                                                                                         // [0x1dac310] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateWorldSubSystem.GetFeature
	// class UObject* GetFeature(class UClass* FeatureType, EMFClimateGetFeatureErrorMode ErrorMode);                           // [0x1dabf80] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFClimateRuntime.MFClimateWorldSubSystem.GetClimateSkyAtmosphere
	// class UMFClimateSkyAtmosphereComponent* GetClimateSkyAtmosphere();                                                       // [0x1dabf50] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Struct /Script/MFClimateRuntime.MFClimateNoiseGenerationParams
/// Size: 0x0014 (20 bytes) (0x000000 - 0x000014) align 4 pad: 0x0000
struct FMFClimateNoiseGenerationParams
{ 
	EMFClimateNoiseType                                NoiseType;                                                  // 0x0000   (0x0004)  
	int32_t                                            CellNoiseCells;                                             // 0x0004   (0x0004)  
	float                                              CellNoiseScale;                                             // 0x0008   (0x0004)  
	bool                                               bCellNoiseUseSmoothMin : 1;                                 // 0x000C:0 (0x0001)  
	unsigned char                                      UnknownData00_5[0x3];                                       // 0x000D   (0x0003)  MISSED
	float                                              CellNoiseSmoothMinK;                                        // 0x0010   (0x0004)  
};

/// Struct /Script/MFClimateRuntime.MFClimateCurlCloudNoiseGenerationParams
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 4 pad: 0x0000
struct FMFClimateCurlCloudNoiseGenerationParams
{ 
	int32_t                                            CurlCells;                                                  // 0x0000   (0x0004)  
	float                                              CurlBrightness;                                             // 0x0004   (0x0004)  
};

/// Struct /Script/MFClimateRuntime.MFClimateWeatherMapCloudNoiseGenerationParams
/// Size: 0x000C (12 bytes) (0x000000 - 0x00000C) align 4 pad: 0x0000
struct FMFClimateWeatherMapCloudNoiseGenerationParams
{ 
	int32_t                                            CoverageWorleyCellNum;                                      // 0x0000   (0x0004)  
	int32_t                                            CoveragePerlinFreq;                                         // 0x0004   (0x0004)  
	int32_t                                            CloudTypePerlinFreq;                                        // 0x0008   (0x0004)  
};

/// Struct /Script/MFClimateRuntime.MFClimateSharedNoiseGenerationSettings
/// Size: 0x0064 (100 bytes) (0x000000 - 0x000064) align 4 pad: 0x0000
struct FMFClimateSharedNoiseGenerationSettings
{ 
	FMFClimateNoiseGenerationParams                    BaseNoiseGenerationParams;                                  // 0x0000   (0x0014)  
	FMFClimateNoiseGenerationParams                    DetailNoiseGenerationParams;                                // 0x0014   (0x0014)  
	FMFClimateNoiseGenerationParams                    BaseNoise2DGenerationParams;                                // 0x0028   (0x0014)  
	FMFClimateNoiseGenerationParams                    DetailNoise2DGenerationParams;                              // 0x003C   (0x0014)  
	FMFClimateCurlCloudNoiseGenerationParams           CurlNoiseParams;                                            // 0x0050   (0x0008)  
	FMFClimateWeatherMapCloudNoiseGenerationParams     WeatherMapParams;                                           // 0x0058   (0x000C)  
};

/// Struct /Script/MFClimateRuntime.MFClimateRainParameterUpdateTick
/// Size: 0x0008 (8 bytes) (0x000038 - 0x000040) align 8 pad: 0x0000
struct FMFClimateRainParameterUpdateTick : FTickFunction
{ 
	class AMFClimateRain*                              Rain;                                                       // 0x0038   (0x0008)  
};

static_assert(sizeof(AMFClimateActor) == 0x02F0); // 752 bytes (0x0002E0 - 0x0002F0)
static_assert(sizeof(UMFClimateComponent) == 0x0110); // 272 bytes (0x0000F8 - 0x000110)
static_assert(sizeof(UMFClimateBakeModeComponent) == 0x0198); // 408 bytes (0x000110 - 0x000198)
static_assert(sizeof(AMFClimateBakeMode) == 0x02E8); // 744 bytes (0x0002E0 - 0x0002E8)
static_assert(sizeof(UMFClimateBaseBakeProcedure) == 0x0040); // 64 bytes (0x000028 - 0x000040)
static_assert(sizeof(UMFClimateBakeProcedure) == 0x00B8); // 184 bytes (0x000040 - 0x0000B8)
static_assert(sizeof(UMFClimateBaseLightningEventProducer) == 0x0030); // 48 bytes (0x000028 - 0x000030)
static_assert(sizeof(UMFClimateCelestialOrbit) == 0x0270); // 624 bytes (0x000220 - 0x000270)
static_assert(sizeof(AMFClimateCelestialBody) == 0x0308); // 776 bytes (0x0002E0 - 0x000308)
static_assert(sizeof(UMFClimateCirrusCloud) == 0x0158); // 344 bytes (0x000110 - 0x000158)
static_assert(sizeof(AMFClimateCloudCustomVolume) == 0x0318); // 792 bytes (0x0002E0 - 0x000318)
static_assert(sizeof(AMFClimateCloudCustomVolumesManager) == 0x0328); // 808 bytes (0x0002E0 - 0x000328)
static_assert(sizeof(UMFClimateCloudNoiseGeneratorV2) == 0x0088); // 136 bytes (0x000030 - 0x000088)
static_assert(sizeof(FMFClimatePlatformNoiseGenerationSettings) == 0x0038); // 56 bytes (0x000000 - 0x000038)
static_assert(sizeof(UMFClimateCloudNoiseGroup) == 0x0088); // 136 bytes (0x000030 - 0x000088)
static_assert(sizeof(UMFClimateCloudNoiseGroupPlatformSwitcher) == 0x0038); // 56 bytes (0x000030 - 0x000038)
static_assert(sizeof(FMFClimateCloudTypeDescriptor) == 0x0228); // 552 bytes (0x000000 - 0x000228)
static_assert(sizeof(UMFClimateCloudProfile) == 0x0078); // 120 bytes (0x000030 - 0x000078)
static_assert(sizeof(AMFClimateDemoGameMode) == 0x03C8); // 968 bytes (0x0003C8 - 0x0003C8)
static_assert(sizeof(UMFClimateGlobalWindComponent) == 0x0130); // 304 bytes (0x000110 - 0x000130)
static_assert(sizeof(AMFClimateGlobalWind) == 0x02E8); // 744 bytes (0x0002E0 - 0x0002E8)
static_assert(sizeof(UMFClimateSceneLightInterfaceComponent) == 0x0118); // 280 bytes (0x000110 - 0x000118)
static_assert(sizeof(UMFClimateHDSunMoonSceneLightComponent) == 0x01C8); // 456 bytes (0x000118 - 0x0001C8)
static_assert(sizeof(AMFClimateHDSunMoonSceneLight) == 0x02E8); // 744 bytes (0x0002E0 - 0x0002E8)
static_assert(sizeof(AMFClimateIrcCamera) == 0x02F8); // 760 bytes (0x0002E0 - 0x0002F8)
static_assert(sizeof(FMFClimateFractalLightningGenerateParams) == 0x0034); // 52 bytes (0x000000 - 0x000034)
static_assert(sizeof(AMFClimateLightningChannelActor) == 0x0370); // 880 bytes (0x0002E0 - 0x000370)
static_assert(sizeof(FMFClimateLightningEvent) == 0x0024); // 36 bytes (0x000000 - 0x000024)
static_assert(sizeof(UMFClimateLightningDirectorComponent) == 0x0218); // 536 bytes (0x000110 - 0x000218)
static_assert(sizeof(UMFClimateLightningEventProducer) == 0x0040); // 64 bytes (0x000030 - 0x000040)
static_assert(sizeof(UMFClimateMovableRainWetnessComponent) == 0x0208); // 520 bytes (0x0000F8 - 0x000208)
static_assert(sizeof(AMFClimateRain) == 0x03D0); // 976 bytes (0x0002F0 - 0x0003D0)
static_assert(sizeof(AMFClimateParticleRain) == 0x04E0); // 1248 bytes (0x0003D0 - 0x0004E0)
static_assert(sizeof(UMFClimatePlayerTransformComponent) == 0x0270); // 624 bytes (0x000220 - 0x000270)
static_assert(sizeof(FMFClimateRainOcclusionTestQueueItem) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(UMFClimateRainOcclusionTestManager) == 0x0130); // 304 bytes (0x0000F8 - 0x000130)
static_assert(sizeof(AMFClimateSDFCanvas) == 0x0300); // 768 bytes (0x0002E0 - 0x000300)
static_assert(sizeof(UMFClimateSettings) == 0x0048); // 72 bytes (0x000038 - 0x000048)
static_assert(sizeof(UMFClimateSingleSceneLightComponent) == 0x0138); // 312 bytes (0x000118 - 0x000138)
static_assert(sizeof(AMFClimateSimpleLight) == 0x02E8); // 744 bytes (0x0002E0 - 0x0002E8)
static_assert(sizeof(UMFClimateSkyAtmosphereComponent) == 0x03D8); // 984 bytes (0x000110 - 0x0003D8)
static_assert(sizeof(AMFClimateBaseSkyMesh) == 0x02E8); // 744 bytes (0x0002E0 - 0x0002E8)
static_assert(sizeof(AMFClimateSingleMeshSky) == 0x0310); // 784 bytes (0x0002E8 - 0x000310)
static_assert(sizeof(UMFClimateStatics) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFClimateSunMoonSceneLightComponent) == 0x0190); // 400 bytes (0x000118 - 0x000190)
static_assert(sizeof(AMFClimateSunMoonSceneLight) == 0x02E8); // 744 bytes (0x0002E0 - 0x0002E8)
static_assert(sizeof(UMFClimateTimeGeographyComponent) == 0x0210); // 528 bytes (0x000110 - 0x000210)
static_assert(sizeof(AMFClimateTimeGeography) == 0x02E8); // 744 bytes (0x0002E0 - 0x0002E8)
static_assert(sizeof(UMFClimateTodIrcBase) == 0x0118); // 280 bytes (0x0000B8 - 0x000118)
static_assert(sizeof(UMFClimateTodIrc2D) == 0x0128); // 296 bytes (0x000118 - 0x000128)
static_assert(sizeof(UMFClimateTodIrcPanorama) == 0x0120); // 288 bytes (0x000118 - 0x000120)
static_assert(sizeof(AMFClimateTodSequenceMixer) == 0x02F0); // 752 bytes (0x0002E0 - 0x0002F0)
static_assert(sizeof(UMFClimateTypes) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFClimateUIBase) == 0x0290); // 656 bytes (0x000288 - 0x000290)
static_assert(sizeof(FMFClimateCloudSettings) == 0x008C); // 140 bytes (0x000000 - 0x00008C)
static_assert(sizeof(UMFClimateVolumeCloudComponent) == 0x04C8); // 1224 bytes (0x000110 - 0x0004C8)
static_assert(sizeof(AMFClimateVolumeCloud) == 0x02E8); // 744 bytes (0x0002E0 - 0x0002E8)
static_assert(sizeof(FMFClimateWeatherLayer) == 0x0058); // 88 bytes (0x000000 - 0x000058)
static_assert(sizeof(UMFClimateWeatherComponent) == 0x01A0); // 416 bytes (0x000110 - 0x0001A0)
static_assert(sizeof(FMFClimateWeatherLayerPresetItem) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FMFClimateLayerPreset) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(UMFClimateWeatherLayerPresetsComponent) == 0x0128); // 296 bytes (0x000110 - 0x000128)
static_assert(sizeof(AMFClimateWeatherLayerSceneBindings) == 0x0348); // 840 bytes (0x0002E0 - 0x000348)
static_assert(sizeof(UMFClimateWeatherListEntry) == 0x0298); // 664 bytes (0x000290 - 0x000298)
static_assert(sizeof(AMFClimateWeatherMapGenerator) == 0x0310); // 784 bytes (0x0002E0 - 0x000310)
static_assert(sizeof(AMFClimateWeatherMapCloudMask) == 0x0310); // 784 bytes (0x0002E0 - 0x000310)
static_assert(sizeof(FMFClimateMPCItem) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(UMFClimateWorldSubSystem) == 0x00D0); // 208 bytes (0x000030 - 0x0000D0)
static_assert(sizeof(FMFClimateNoiseGenerationParams) == 0x0014); // 20 bytes (0x000000 - 0x000014)
static_assert(sizeof(FMFClimateCurlCloudNoiseGenerationParams) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(sizeof(FMFClimateWeatherMapCloudNoiseGenerationParams) == 0x000C); // 12 bytes (0x000000 - 0x00000C)
static_assert(sizeof(FMFClimateSharedNoiseGenerationSettings) == 0x0064); // 100 bytes (0x000000 - 0x000064)
static_assert(sizeof(FMFClimateRainParameterUpdateTick) == 0x0040); // 64 bytes (0x000038 - 0x000040)
static_assert(offsetof(AMFClimateActor, System) == 0x02E0);
static_assert(offsetof(UMFClimateComponent, System) == 0x00F8);
static_assert(offsetof(UMFClimateBakeModeComponent, RegisteredBakeProcedures) == 0x0118);
static_assert(offsetof(UMFClimateBakeModeComponent, RunningBakeProcedure) == 0x0190);
static_assert(offsetof(AMFClimateBakeMode, BakeMode) == 0x02E0);
static_assert(offsetof(UMFClimateBaseBakeProcedure, Baker) == 0x0030);
static_assert(offsetof(UMFClimateBakeProcedure, TodsToBake) == 0x0040);
static_assert(offsetof(UMFClimateBakeProcedure, CurrentWeatherName) == 0x0070);
static_assert(offsetof(UMFClimateBakeProcedure, BackupWeatherLayers) == 0x0090);
static_assert(offsetof(UMFClimateBaseLightningEventProducer, Director) == 0x0028);
static_assert(offsetof(UMFClimateCelestialOrbit, OrbitType) == 0x0220);
static_assert(offsetof(UMFClimateCelestialOrbit, CelestialRotation) == 0x0240);
static_assert(offsetof(UMFClimateCelestialOrbit, CelestialPosition) == 0x024C);
static_assert(offsetof(UMFClimateCelestialOrbit, CelestialToEarthEcliptic) == 0x0258);
static_assert(offsetof(AMFClimateCelestialBody, Color) == 0x02E4);
static_assert(offsetof(AMFClimateCelestialBody, OrbitComponent) == 0x02F8);
static_assert(offsetof(AMFClimateCelestialBody, RotatedPivot) == 0x0300);
static_assert(offsetof(UMFClimateCirrusCloud, EnvironmentLightColor) == 0x0114);
static_assert(offsetof(UMFClimateCirrusCloud, EnvironmentLightDir) == 0x0124);
static_assert(offsetof(UMFClimateCirrusCloud, Albedo) == 0x0138);
static_assert(offsetof(UMFClimateCirrusCloud, Emissive) == 0x013C);
static_assert(offsetof(AMFClimateCloudCustomVolume, DetailOffset) == 0x02FC);
static_assert(offsetof(AMFClimateCloudCustomVolumesManager, CloudTextures) == 0x02E0);
static_assert(offsetof(AMFClimateCloudCustomVolumesManager, CloudTextureAtlas) == 0x02F8);
static_assert(offsetof(UMFClimateCloudNoiseGeneratorV2, NoiseTextureSize) == 0x0030);
static_assert(offsetof(UMFClimateCloudNoiseGeneratorV2, OutputTexture3D) == 0x0078);
static_assert(offsetof(UMFClimateCloudNoiseGeneratorV2, OutputTexture2D) == 0x0080);
static_assert(offsetof(FMFClimatePlatformNoiseGenerationSettings, BaseNoiseTextureSize) == 0x0000);
static_assert(offsetof(FMFClimatePlatformNoiseGenerationSettings, DetailNoiseTextureSize) == 0x000C);
static_assert(offsetof(FMFClimatePlatformNoiseGenerationSettings, BaseNoise2DTextureSize) == 0x0018);
static_assert(offsetof(FMFClimatePlatformNoiseGenerationSettings, DetailNoise2DTextureSize) == 0x0020);
static_assert(offsetof(FMFClimatePlatformNoiseGenerationSettings, WeatherMapNoiseTextureSize) == 0x0028);
static_assert(offsetof(FMFClimatePlatformNoiseGenerationSettings, CurlNoiseTextureSize) == 0x0030);
static_assert(offsetof(UMFClimateCloudNoiseGroup, PlatformSettings) == 0x0030);
static_assert(offsetof(UMFClimateCloudNoiseGroup, SavedBaseNoise) == 0x0068);
static_assert(offsetof(UMFClimateCloudNoiseGroup, SavedDetailNoise) == 0x0070);
static_assert(offsetof(UMFClimateCloudNoiseGroup, SavedWeatherMapNoise) == 0x0078);
static_assert(offsetof(UMFClimateCloudNoiseGroup, SavedCurlNoise) == 0x0080);
static_assert(offsetof(UMFClimateCloudNoiseGroupPlatformSwitcher, CookedAsset) == 0x0030);
static_assert(offsetof(FMFClimateCloudTypeDescriptor, BaseNoiseCenter) == 0x0008);
static_assert(offsetof(FMFClimateCloudTypeDescriptor, BaseNoiseVariation) == 0x0090);
static_assert(offsetof(FMFClimateCloudTypeDescriptor, ExtinctionScale) == 0x0118);
static_assert(offsetof(FMFClimateCloudTypeDescriptor, Erosion) == 0x01A0);
static_assert(offsetof(UMFClimateCloudProfile, TypeDescriptors) == 0x0030);
static_assert(offsetof(UMFClimateCloudProfile, LUT0) == 0x0040);
static_assert(offsetof(UMFClimateGlobalWindComponent, Direction) == 0x0110);
static_assert(offsetof(UMFClimateGlobalWindComponent, WindTravel) == 0x011C);
static_assert(offsetof(AMFClimateGlobalWind, GlobalWindComponent) == 0x02E0);
static_assert(offsetof(UMFClimateHDSunMoonSceneLightComponent, SunLight) == 0x0118);
static_assert(offsetof(UMFClimateHDSunMoonSceneLightComponent, MoonLight) == 0x0120);
static_assert(offsetof(UMFClimateHDSunMoonSceneLightComponent, BindSun) == 0x0128);
static_assert(offsetof(UMFClimateHDSunMoonSceneLightComponent, BindMoon) == 0x0130);
static_assert(offsetof(UMFClimateHDSunMoonSceneLightComponent, SunDirection) == 0x0138);
static_assert(offsetof(UMFClimateHDSunMoonSceneLightComponent, MoonDirection) == 0x0144);
static_assert(offsetof(UMFClimateHDSunMoonSceneLightComponent, SunColoredBrightness) == 0x0150);
static_assert(offsetof(UMFClimateHDSunMoonSceneLightComponent, MoonColoredBrightness) == 0x0160);
static_assert(offsetof(UMFClimateHDSunMoonSceneLightComponent, SunLightComponent) == 0x0180);
static_assert(offsetof(UMFClimateHDSunMoonSceneLightComponent, MoonLightComponent) == 0x0188);
static_assert(offsetof(UMFClimateHDSunMoonSceneLightComponent, SunScatteredIrradiance) == 0x0190);
static_assert(offsetof(UMFClimateHDSunMoonSceneLightComponent, MoonScatteredIrradiance) == 0x01A0);
static_assert(offsetof(UMFClimateHDSunMoonSceneLightComponent, CurrentLightningSceneLightColor) == 0x01B0);
static_assert(offsetof(UMFClimateHDSunMoonSceneLightComponent, LightningFakeLight) == 0x01C0);
static_assert(offsetof(AMFClimateHDSunMoonSceneLight, MFClimateLight) == 0x02E0);
static_assert(offsetof(AMFClimateIrcCamera, CameraComponent) == 0x02E0);
static_assert(offsetof(AMFClimateIrcCamera, CameraTag) == 0x02E8);
static_assert(offsetof(FMFClimateFractalLightningGenerateParams, TargetOffset) == 0x000C);
static_assert(offsetof(FMFClimateFractalLightningGenerateParams, MinMaxBranchLiftAngleDegrees) == 0x0028);
static_assert(offsetof(AMFClimateLightningChannelActor, LightningMaterial) == 0x02E0);
static_assert(offsetof(AMFClimateLightningChannelActor, Mid) == 0x02E8);
static_assert(offsetof(AMFClimateLightningChannelActor, Params) == 0x02F0);
static_assert(offsetof(AMFClimateLightningChannelActor, PMC) == 0x0328);
static_assert(offsetof(FMFClimateLightningEvent, StartPosition) == 0x0004);
static_assert(offsetof(FMFClimateLightningEvent, EndPosition) == 0x0010);
static_assert(offsetof(UMFClimateLightningDirectorComponent, InstantiatedLightningActor) == 0x0110);
static_assert(offsetof(UMFClimateLightningDirectorComponent, ExecutingLightningEvent) == 0x0118);
static_assert(offsetof(UMFClimateLightningDirectorComponent, EventProducer) == 0x0150);
static_assert(offsetof(UMFClimateLightningDirectorComponent, LightningChannelType) == 0x0158);
static_assert(offsetof(UMFClimateLightningDirectorComponent, LightningTint) == 0x0174);
static_assert(offsetof(UMFClimateMovableRainWetnessComponent, LastOccludePhysicalMaterial) == 0x00F8);
static_assert(offsetof(UMFClimateMovableRainWetnessComponent, AccumulationParameterName) == 0x0110);
static_assert(offsetof(UMFClimateMovableRainWetnessComponent, OcclusionParameterName) == 0x0118);
static_assert(offsetof(UMFClimateMovableRainWetnessComponent, MFClimateSystem) == 0x0148);
static_assert(offsetof(UMFClimateMovableRainWetnessComponent, RainActor) == 0x0150);
static_assert(offsetof(UMFClimateMovableRainWetnessComponent, CollectedMaterials) == 0x0158);
static_assert(offsetof(AMFClimateRain, PuddleRippleFrequencies) == 0x0310);
static_assert(offsetof(AMFClimateRain, PlayerPosition) == 0x0340);
static_assert(offsetof(AMFClimateRain, PlayerRotation) == 0x0348);
static_assert(offsetof(AMFClimateRain, WindAlignedPivot) == 0x0350);
static_assert(offsetof(AMFClimateRain, WetnessComponent) == 0x0358);
static_assert(offsetof(AMFClimateRain, DebugType) == 0x0361);
static_assert(offsetof(AMFClimateRain, DetectChannel) == 0x0363);
static_assert(offsetof(AMFClimateRain, RainOcclusionTestManager) == 0x0380);
static_assert(offsetof(AMFClimateParticleRain, RainShadowCapture) == 0x03D0);
static_assert(offsetof(AMFClimateParticleRain, WideShadowCapture) == 0x03D8);
static_assert(offsetof(AMFClimateParticleRain, NiagaraComponents) == 0x03E0);
static_assert(offsetof(AMFClimateParticleRain, CascadesComponents) == 0x03F0);
static_assert(offsetof(FMFClimateRainOcclusionTestQueueItem, Component) == 0x0000);
static_assert(offsetof(UMFClimateRainOcclusionTestManager, Rain) == 0x00F8);
static_assert(offsetof(UMFClimateRainOcclusionTestManager, LocalObservingTargetComponent) == 0x0108);
static_assert(offsetof(UMFClimateRainOcclusionTestManager, MovableObjectQueue) == 0x0110);
static_assert(offsetof(UMFClimateRainOcclusionTestManager, MovableObjectQueue_Off) == 0x0120);
static_assert(offsetof(AMFClimateSDFCanvas, Root) == 0x02E0);
static_assert(offsetof(AMFClimateSDFCanvas, SourceMesh) == 0x02E8);
static_assert(offsetof(AMFClimateSDFCanvas, TargetTexture) == 0x02F0);
static_assert(offsetof(UMFClimateSettings, MFClimateMPCPaths) == 0x0038);
static_assert(offsetof(UMFClimateSingleSceneLightComponent, BoundCelestialBody) == 0x0118);
static_assert(offsetof(UMFClimateSingleSceneLightComponent, MainLight) == 0x0128);
static_assert(offsetof(UMFClimateSingleSceneLightComponent, Light) == 0x0130);
static_assert(offsetof(AMFClimateSimpleLight, MFClimateLight) == 0x02E0);
static_assert(offsetof(UMFClimateSkyAtmosphereComponent, RawSkyAtmosphere) == 0x0350);
static_assert(offsetof(UMFClimateSkyAtmosphereComponent, SkyAtmosphereTransmittanceAtZenith) == 0x0358);
static_assert(offsetof(UMFClimateSkyAtmosphereComponent, SkyAtmosphereTransmittanceCurrent) == 0x0368);
static_assert(offsetof(UMFClimateSkyAtmosphereComponent, CpuSkyAtmosphereSkyTex) == 0x0388);
static_assert(offsetof(UMFClimateSkyAtmosphereComponent, CpuSkyAtmosphereTransmittanceTex) == 0x0390);
static_assert(offsetof(AMFClimateSingleMeshSky, Material) == 0x02E8);
static_assert(offsetof(AMFClimateSingleMeshSky, ShadingMesh) == 0x02F0);
static_assert(offsetof(AMFClimateSingleMeshSky, SkySphereScale) == 0x02F8);
static_assert(offsetof(AMFClimateSingleMeshSky, SkySphereLocation) == 0x0304);
static_assert(offsetof(UMFClimateSunMoonSceneLightComponent, BindSun) == 0x0118);
static_assert(offsetof(UMFClimateSunMoonSceneLightComponent, BindMoon) == 0x0120);
static_assert(offsetof(UMFClimateSunMoonSceneLightComponent, MainDirectionalLight) == 0x0138);
static_assert(offsetof(UMFClimateSunMoonSceneLightComponent, MainDirectionalLightComponent) == 0x0140);
static_assert(offsetof(UMFClimateSunMoonSceneLightComponent, LightningColor) == 0x0148);
static_assert(offsetof(UMFClimateSunMoonSceneLightComponent, FakeAtmLight1) == 0x0158);
static_assert(offsetof(UMFClimateSunMoonSceneLightComponent, FakeAtmLight2) == 0x0160);
static_assert(offsetof(UMFClimateSunMoonSceneLightComponent, SunScatteredIrradiance) == 0x016C);
static_assert(offsetof(UMFClimateSunMoonSceneLightComponent, MoonScatteredIrradiance) == 0x017C);
static_assert(offsetof(AMFClimateSunMoonSceneLight, MFClimateLight) == 0x02E0);
static_assert(offsetof(UMFClimateTimeGeographyComponent, SceneNorthVector) == 0x012C);
static_assert(offsetof(UMFClimateTimeGeographyComponent, AutoStepInEditor) == 0x013C);
static_assert(offsetof(AMFClimateTimeGeography, TimeGeographyComponent) == 0x02E0);
static_assert(offsetof(UMFClimateTodIrcBase, OutputFolder) == 0x00B8);
static_assert(offsetof(UMFClimateTodIrcBase, FileNameFormat) == 0x00C8);
static_assert(offsetof(UMFClimateTodIrcBase, CameraTagFilter) == 0x00D8);
static_assert(offsetof(UMFClimateTodIrcBase, Cameras) == 0x00F0);
static_assert(offsetof(UMFClimateTodIrcBase, BackupCameraLocation) == 0x0100);
static_assert(offsetof(UMFClimateTodIrcBase, BackupCameraRotation) == 0x010C);
static_assert(offsetof(AMFClimateTodSequenceMixer, WeatherComponent) == 0x02E0);
static_assert(offsetof(AMFClimateTodSequenceMixer, PresetsComponent) == 0x02E8);
static_assert(offsetof(UMFClimateUIBase, MFClimateSystem) == 0x0288);
static_assert(offsetof(FMFClimateCloudSettings, CloudAlbedo) == 0x0034);
static_assert(offsetof(FMFClimateCloudSettings, CloudEmissive) == 0x0064);
static_assert(offsetof(FMFClimateCloudSettings, LightningTint) == 0x0074);
static_assert(offsetof(UMFClimateVolumeCloudComponent, SunColorTop) == 0x0114);
static_assert(offsetof(UMFClimateVolumeCloudComponent, SunColorBottom) == 0x0124);
static_assert(offsetof(UMFClimateVolumeCloudComponent, SunDirection) == 0x0134);
static_assert(offsetof(UMFClimateVolumeCloudComponent, CloudAmbientGround) == 0x0140);
static_assert(offsetof(UMFClimateVolumeCloudComponent, CloudAmbientSky) == 0x0150);
static_assert(offsetof(UMFClimateVolumeCloudComponent, CloudWind) == 0x016C);
static_assert(offsetof(UMFClimateVolumeCloudComponent, WeatherMapGenerator) == 0x0178);
static_assert(offsetof(UMFClimateVolumeCloudComponent, CustomWeatherMap) == 0x0180);
static_assert(offsetof(UMFClimateVolumeCloudComponent, CloudProfile) == 0x0190);
static_assert(offsetof(UMFClimateVolumeCloudComponent, CloudSettings) == 0x0198);
static_assert(offsetof(UMFClimateVolumeCloudComponent, NoiseGroupSwitcher) == 0x0448);
static_assert(offsetof(UMFClimateVolumeCloudComponent, MSApproxRT) == 0x0450);
static_assert(offsetof(UMFClimateVolumeCloudComponent, RaymarchRTFull) == 0x0458);
static_assert(offsetof(UMFClimateVolumeCloudComponent, RaymarchRTCheckerboard) == 0x0460);
static_assert(offsetof(UMFClimateVolumeCloudComponent, ResolveRT) == 0x0468);
static_assert(offsetof(UMFClimateVolumeCloudComponent, CachedBaseNoiseTexture) == 0x0470);
static_assert(offsetof(UMFClimateVolumeCloudComponent, CachedDetailNoiseTexture) == 0x0478);
static_assert(offsetof(UMFClimateVolumeCloudComponent, CachedCurlNoiseTexture) == 0x0480);
static_assert(offsetof(UMFClimateVolumeCloudComponent, CachedLUT0Texture) == 0x0488);
static_assert(offsetof(UMFClimateVolumeCloudComponent, CustomVolumes) == 0x0490);
static_assert(offsetof(UMFClimateVolumeCloudComponent, SDFManager) == 0x04A8);
static_assert(offsetof(UMFClimateVolumeCloudComponent, SDFCloudRTFull) == 0x04B0);
static_assert(offsetof(UMFClimateVolumeCloudComponent, SDFCloudRTCheckerboard) == 0x04B8);
static_assert(offsetof(UMFClimateVolumeCloudComponent, SDFCloudResolveRT) == 0x04C0);
static_assert(offsetof(AMFClimateVolumeCloud, VolumeCloud) == 0x02E0);
static_assert(offsetof(FMFClimateWeatherLayer, TimeOfDaySequence) == 0x0008);
static_assert(offsetof(FMFClimateWeatherLayer, EvaluationMode) == 0x0010);
static_assert(offsetof(UMFClimateWeatherComponent, SceneBindings) == 0x0110);
static_assert(offsetof(UMFClimateWeatherComponent, Layers) == 0x0118);
static_assert(offsetof(FMFClimateWeatherLayerPresetItem, Sequence) == 0x0000);
static_assert(offsetof(FMFClimateLayerPreset, PresetName) == 0x0000);
static_assert(offsetof(FMFClimateLayerPreset, Items) == 0x0010);
static_assert(offsetof(UMFClimateWeatherLayerPresetsComponent, ActivatedPresets) == 0x0110);
static_assert(offsetof(UMFClimateWeatherLayerPresetsComponent, WeatherComponent) == 0x0120);
static_assert(offsetof(AMFClimateWeatherMapGenerator, OutputTarget) == 0x02E8);
static_assert(offsetof(AMFClimateWeatherMapCloudMask, DrawType) == 0x02E4);
static_assert(offsetof(AMFClimateWeatherMapCloudMask, Material) == 0x02E8);
static_assert(offsetof(AMFClimateWeatherMapCloudMask, Mid) == 0x02F0);
static_assert(offsetof(AMFClimateWeatherMapCloudMask, MaterialParameter) == 0x0300);
static_assert(offsetof(FMFClimateMPCItem, PublicMPC) == 0x0000);
static_assert(offsetof(FMFClimateMPCItem, MPCI) == 0x0008);
static_assert(offsetof(UMFClimateWorldSubSystem, DuplicatedFeatures) == 0x0090);
static_assert(offsetof(UMFClimateWorldSubSystem, FeatureTable) == 0x00A0);
static_assert(offsetof(UMFClimateWorldSubSystem, PublicMPCs) == 0x00C0);
static_assert(offsetof(FMFClimateNoiseGenerationParams, NoiseType) == 0x0000);
static_assert(offsetof(FMFClimateSharedNoiseGenerationSettings, BaseNoiseGenerationParams) == 0x0000);
static_assert(offsetof(FMFClimateSharedNoiseGenerationSettings, DetailNoiseGenerationParams) == 0x0014);
static_assert(offsetof(FMFClimateSharedNoiseGenerationSettings, BaseNoise2DGenerationParams) == 0x0028);
static_assert(offsetof(FMFClimateSharedNoiseGenerationSettings, DetailNoise2DGenerationParams) == 0x003C);
static_assert(offsetof(FMFClimateSharedNoiseGenerationSettings, CurlNoiseParams) == 0x0050);
static_assert(offsetof(FMFClimateSharedNoiseGenerationSettings, WeatherMapParams) == 0x0058);
static_assert(offsetof(FMFClimateRainParameterUpdateTick, Rain) == 0x0038);
