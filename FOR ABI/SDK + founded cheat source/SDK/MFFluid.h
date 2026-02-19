
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: Niagara

/// Class /Script/MFFluid.BlueprintableWindDirectionalSource
/// Size: 0x0000 (0 bytes) (0x0002E8 - 0x0002E8) align 8 pad: 0x0000
class ABlueprintableWindDirectionalSource : public AWindDirectionalSource
{ 
public:
};

/// Class /Script/MFFluid.FluidBlueprintFunctionLibrary
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UFluidBlueprintFunctionLibrary : public UBlueprintFunctionLibrary
{ 
public:
};

/// Class /Script/MFFluid.TickEditorActor
/// Size: 0x0008 (8 bytes) (0x0002E0 - 0x0002E8) align 8 pad: 0x0000
class ATickEditorActor : public AActor
{ 
public:
	bool                                               bTickInEditor;                                              // 0x02E0   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x02E1   (0x0007)  MISSED


	/// Functions
	// Function /Script/MFFluid.TickEditorActor.ReceiveBeginEditor
	// void ReceiveBeginEditor();                                                                                               // [0x3a75280] Event|Protected|BlueprintEvent 
};

/// Class /Script/MFFluid.FluidFieldBaseActor
/// Size: 0x0000 (0 bytes) (0x0002E8 - 0x0002E8) align 8 pad: 0x0000
class AFluidFieldBaseActor : public ATickEditorActor
{ 
public:
};

/// Class /Script/MFFluid.TickEditorActorComponent
/// Size: 0x0008 (8 bytes) (0x0000F8 - 0x000100) align 8 pad: 0x0000
class UTickEditorActorComponent : public UActorComponent
{ 
public:
	bool                                               bTickEditor;                                                // 0x00F8   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x00F9   (0x0007)  MISSED


	/// Functions
	// Function /Script/MFFluid.TickEditorActorComponent.ReceiveBeginEditor
	// void ReceiveBeginEditor();                                                                                               // [0x3a75280] Event|Protected|BlueprintEvent 
};

/// Class /Script/MFFluid.FluidFieldBaseComponent
/// Size: 0x0008 (8 bytes) (0x000100 - 0x000108) align 8 pad: 0x0000
class UFluidFieldBaseComponent : public UTickEditorActorComponent
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0100   (0x0008)  MISSED


	/// Functions
	// Function /Script/MFFluid.FluidFieldBaseComponent.IsFluidSystemEnabled
	// bool IsFluidSystemEnabled();                                                                                             // [0x1e16cf0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/MFFluid.FluidInteractionManager
/// Size: 0x01E0 (480 bytes) (0x0002E8 - 0x0004C8) align 8 pad: 0x0000
class AFluidInteractionManager : public ATickEditorActor
{ 
public:
	float                                              ClipHeight;                                                 // 0x02E8   (0x0004)  
	float                                              InteractionStrength;                                        // 0x02EC   (0x0004)  
	float                                              InteractionFadeInSpeed;                                     // 0x02F0   (0x0004)  
	float                                              InteractionFadeOutSpeed;                                    // 0x02F4   (0x0004)  
	class UMaterialParameterCollection*                WindFieldMaterialParameters;                                // 0x02F8   (0x0008)  
	class UTextureRenderTarget2D*                      HeightField;                                                // 0x0300   (0x0008)  
	class UTextureRenderTarget2D*                      HeightFieldBackBuffer;                                      // 0x0308   (0x0008)  
	class UTextureRenderTarget2D*                      HeightFieldPrevFrame;                                       // 0x0310   (0x0008)  
	class UMaterialInterface*                          CopyHeightMaterial;                                         // 0x0318   (0x0008)  
	class UMaterialInterface*                          FadeOutHeightMaterial;                                      // 0x0320   (0x0008)  
	class UMaterialInterface*                          DrawBorderMaterial;                                         // 0x0328   (0x0008)  
	class UMaterialInterface*                          VisualizeMeshMaterial;                                      // 0x0330   (0x0008)  
	TArray<class UFluidInteractorComponent*>           Interactors;                                                // 0x0338   (0x0010)  
	unsigned char                                      UnknownData00_7[0x180];                                     // 0x0348   (0x0180)  MISSED
};

/// Class /Script/MFFluid.FluidInteractorComponent
/// Size: 0x0020 (32 bytes) (0x000220 - 0x000240) align 16 pad: 0x0008
#pragma pack(push, 0x1)
class UFluidInteractorComponent : public USceneComponent
{ 
public:
	bool                                               bInteracting;                                               // 0x0220   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0221   (0x0003)  MISSED
	float                                              InteractionStrength;                                        // 0x0224   (0x0004)  
	unsigned char                                      UnknownData01_6[0x8];                                       // 0x0228   (0x0008)  MISSED
	class UFluidInteractorGroupComponent*              InteractorGroup;                                            // 0x0230   (0x0008)  
};
#pragma pack(pop)

/// Class /Script/MFFluid.FluidInteractorGroupComponent
/// Size: 0x0020 (32 bytes) (0x000220 - 0x000240) align 16 pad: 0x0000
class UFluidInteractorGroupComponent : public USceneComponent
{ 
public:
	bool                                               bInteracting;                                               // 0x0220   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0221   (0x0003)  MISSED
	float                                              InteractionStrength;                                        // 0x0224   (0x0004)  
	float                                              Scale;                                                      // 0x0228   (0x0004)  
	unsigned char                                      UnknownData01_7[0x14];                                      // 0x022C   (0x0014)  MISSED


	/// Functions
	// Function /Script/MFFluid.FluidInteractorGroupComponent.IsInteracting
	// bool IsInteracting();                                                                                                    // [0x1e16d50] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFFluid.FluidInteractorGroupComponent.GetScale
	// float GetScale();                                                                                                        // [0x1e16c30] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFFluid.FluidInteractorGroupComponent.GetInteractionStrength
	// float GetInteractionStrength();                                                                                          // [0x1e16b80] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/MFFluid.FluidMeshInteractorComponent
/// Size: 0x0038 (56 bytes) (0x000238 - 0x000270) align 16 pad: 0x0000
class UFluidMeshInteractorComponent : public UFluidInteractorComponent
{ 
public:
	class UStaticMesh*                                 Mesh;                                                       // 0x0238   (0x0008)  
	class UCharacterMovementComponent*                 CharacterMovement;                                          // 0x0240   (0x0008)  
	class UMaterialInterface*                          DrawHeightMaterial;                                         // 0x0248   (0x0008)  
	unsigned char                                      UnknownData00_7[0x20];                                      // 0x0250   (0x0020)  MISSED
};

/// Class /Script/MFFluid.FluidSimpleInteractorComponent
/// Size: 0x0028 (40 bytes) (0x000238 - 0x000260) align 16 pad: 0x0000
class UFluidSimpleInteractorComponent : public UFluidInteractorComponent
{ 
public:
	float                                              PawnRadius;                                                 // 0x0238   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x023C   (0x0004)  MISSED
	class UMaterialInterface*                          DrawHeightMaterial;                                         // 0x0240   (0x0008)  
	unsigned char                                      UnknownData01_7[0x18];                                      // 0x0248   (0x0018)  MISSED
};

/// Class /Script/MFFluid.FluidSystemManager
/// Size: 0x0288 (648 bytes) (0x0002E8 - 0x000570) align 8 pad: 0x0000
class AFluidSystemManager : public ATickEditorActor
{ 
public:
	SDK_UNDEFINED(16,2756) /* FMulticastInlineDelegate */ __um(OnCPUReadBack);                                     // 0x02E8   (0x0010)  
	SDK_UNDEFINED(16,2757) /* FMulticastInlineDelegate */ __um(OnCPUReadBackSingle);                               // 0x02F8   (0x0010)  
	bool                                               bEnableDebug : 1;                                           // 0x0308:0 (0x0001)  
	unsigned char                                      UnknownData00_3[0x3];                                       // 0x0309   (0x0003)  MISSED
	bool                                               bUseFastRenderMethod : 1;                                   // 0x030C:0 (0x0001)  
	unsigned char                                      UnknownData01_5[0x3];                                       // 0x030D   (0x0003)  MISSED
	float                                              WindLevel;                                                  // 0x0310   (0x0004)  
	FVector                                            StaticWindDirection;                                        // 0x0314   (0x000C)  
	float                                              WindSpeedUniformScale;                                      // 0x0320   (0x0004)  
	float                                              WindNoiseStrength;                                          // 0x0324   (0x0004)  
	float                                              PlayerWalkWindRadius;                                       // 0x0328   (0x0004)  
	float                                              InteractionStrength;                                        // 0x032C   (0x0004)  
	float                                              InteractionRegionSize;                                      // 0x0330   (0x0004)  
	float                                              InteractionSwayFrequency;                                   // 0x0334   (0x0004)  
	float                                              InteractionSwayStrength;                                    // 0x0338   (0x0004)  
	int32_t                                            InteractionNumPreallocatedMaterialInstances;                // 0x033C   (0x0004)  
	class UStaticMesh*                                 WindOccluderMesh;                                           // 0x0340   (0x0008)  
	FVector                                            WindOccluderScale;                                          // 0x0348   (0x000C)  
	FVector2D                                          WindOccluderFalloffScale;                                   // 0x0354   (0x0008)  
	float                                              WindOccluderMaxFalloffDistance;                             // 0x035C   (0x0004)  
	float                                              WindOccluderMaxHeight;                                      // 0x0360   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x0364   (0x0004)  MISSED
	class UMaterial*                                   WindOccluderMaterial;                                       // 0x0368   (0x0008)  
	class URuntimeVirtualTexture*                      WindOccluderHeightRVT;                                      // 0x0370   (0x0008)  
	bool                                               bRVTIncludeMeshBounds;                                      // 0x0378   (0x0001)  
	bool                                               bRVTIncludeMeshHeights;                                     // 0x0379   (0x0001)  
	unsigned char                                      UnknownData03_6[0x2];                                       // 0x037A   (0x0002)  MISSED
	FVector2D                                          WindOccluderRVTScreenSizeScale;                             // 0x037C   (0x0008)  
	SDK_UNDEFINED(8,2758) /* TWeakObjectPtr<ARuntimeVirtualTextureVolume*> */ __um(OccluderHeightRVTVolume);       // 0x0384   (0x0008)  
	unsigned char                                      UnknownData04_6[0x4];                                       // 0x038C   (0x0004)  MISSED
	SDK_UNDEFINED(16,2759) /* TArray<TWeakObjectPtr<AStaticMeshActor*>> */ __um(WindOccluderActors);               // 0x0390   (0x0010)  
	class USceneComponent*                             SceneComponent;                                             // 0x03A0   (0x0008)  
	class USpeedtreeWindFieldComponent*                SpeedtreeWindFieldComponent;                                // 0x03A8   (0x0008)  
	bool                                               DisturbWaterWhenPlayerStill : 1;                            // 0x03B0:0 (0x0001)  
	unsigned char                                      UnknownData05_5[0x3];                                       // 0x03B1   (0x0003)  MISSED
	float                                              WaterForceSize;                                             // 0x03B4   (0x0004)  
	float                                              WaterForceStrength;                                         // 0x03B8   (0x0004)  
	float                                              WaterTravelSpeed;                                           // 0x03BC   (0x0004)  
	float                                              WaterDampening;                                             // 0x03C0   (0x0004)  
	float                                              WaterCollisionThreshold;                                    // 0x03C4   (0x0004)  
	float                                              WaterForwardOffset;                                         // 0x03C8   (0x0004)  
	float                                              WaterBurstRadiusScale;                                      // 0x03CC   (0x0004)  
	FVector                                            WindRippleDirection;                                        // 0x03D0   (0x000C)  
	float                                              WindRippleCenterDistance;                                   // 0x03DC   (0x0004)  
	float                                              WindRippleRadiusScale;                                      // 0x03E0   (0x0004)  
	float                                              WindRippleSpeed;                                            // 0x03E4   (0x0004)  
	float                                              WindRippleStrength;                                         // 0x03E8   (0x0004)  
	float                                              WindRippleNoiseSize;                                        // 0x03EC   (0x0004)  
	unsigned char                                      UnknownData06_6[0x40];                                      // 0x03F0   (0x0040)  MISSED
	class UMaterialParameterCollection*                WindField_MPC;                                              // 0x0430   (0x0008)  
	class UNiagaraParameterCollection*                 WindField_NPC;                                              // 0x0438   (0x0008)  
	class UTextureRenderTarget2D*                      WindFieldGlobal;                                            // 0x0440   (0x0008)  
	class UTextureRenderTarget2D*                      WindFieldGlobalPrev;                                        // 0x0448   (0x0008)  
	float                                              OffsetFromSimAreaMotion;                                    // 0x0450   (0x0004)  
	FVector2D                                          VelocityOffset;                                             // 0x0454   (0x0008)  
	unsigned char                                      UnknownData07_6[0x4];                                       // 0x045C   (0x0004)  MISSED
	class UMaterialInterface*                          WaterPlayerInteractionMat;                                  // 0x0460   (0x0008)  
	class UMaterialInterface*                          WaterBurstInteractionMat;                                   // 0x0468   (0x0008)  
	TArray<class UMaterial*>                           InputMaterials;                                             // 0x0470   (0x0010)  
	TArray<class UMaterialInterface*>                  WaterBurstMaterials;                                        // 0x0480   (0x0010)  
	TArray<class UMaterialInstanceDynamic*>            WaterBurstMaterials_MID;                                    // 0x0490   (0x0010)  
	class UMaterialInstanceDynamic*                    WaterPlayerInteraction_MID;                                 // 0x04A0   (0x0008)  
	TArray<class UMaterialInstanceDynamic*>            InputMaterialDynamicInstances;                              // 0x04A8   (0x0010)  
	TArray<class AFluidInteractionManager*>            InteractionManagers;                                        // 0x04B8   (0x0010)  
	TArray<class UFluidInteractorComponent*>           Interactors;                                                // 0x04C8   (0x0010)  
	unsigned char                                      UnknownData08_7[0x98];                                      // 0x04D8   (0x0098)  MISSED


	/// Functions
	// Function /Script/MFFluid.FluidSystemManager.TransformWorldLocationToTextureLocation
	// FVector TransformWorldLocationToTextureLocation(FVector WorldLocation, class UWaterFieldBaseComponent* WaterFieldComponent); // [0x1e16e90] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFFluid.FluidSystemManager.QueryVelocityAtLocation
	// void QueryVelocityAtLocation(FVector Location);                                                                          // [0x1e16d80] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFFluid.FluidSystemManager.IsFluidSystemEnabled
	// bool IsFluidSystemEnabled();                                                                                             // [0x1e16cc0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFFluid.FluidSystemManager.GetGlobalWindFieldComponentInWorld
	// class UWindFieldBaseComponent* GetGlobalWindFieldComponentInWorld(bool bShowLog);                                        // [0x1e16a40] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFFluid.FluidSystemManager.GenerateWindOccluders
	// void GenerateWindOccluders();                                                                                            // [0x1e16920] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFFluid.FluidSystemManager.CPUReadBackSingleBindFunctionTest
	// void CPUReadBackSingleBindFunctionTest(int32_t QueryID, FVector2D FluidVelocity, FVector2D FinalFluidVelocity);          // [0x1e16580] Final|Native|Public|HasDefaults 
	// Function /Script/MFFluid.FluidSystemManager.CPUReadBackBindFunctionTest
	// void CPUReadBackBindFunctionTest(int32_t QueryID, TArray<FVector2D>& FluidVelocity);                                     // [0x1e16490] Final|Native|Public|HasOutParms 
	// Function /Script/MFFluid.FluidSystemManager.BeaufortScale_Default
	// FVector2D BeaufortScale_Default(FVector2D InVelocity);                                                                   // [0x1e16400] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFFluid.FluidSystemManager.BeaufortScale
	// FVector2D BeaufortScale(FVector2D InVelocity, float InWindSpeedUniformScale, float InWindLevel);                         // [0x1e162e0] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFFluid.FluidSystemManager.AddPlayerAtLocation
	// void AddPlayerAtLocation(FVector PlayerLocation, FVector PlayerPrevLocation, int32_t Duration);                          // [0x1e16080] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFFluid.FluidSystemManager.AddBurstAtLocationWithType
	// void AddBurstAtLocationWithType(FVector WorldPosition, int32_t Type, float BurstRadius, int32_t Duration);               // [0x1e15d80] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFFluid.FluidSystemManager.AddBurstAtLocation
	// void AddBurstAtLocation(FVector WorldPosition, float BurstRadius, int32_t Duration);                                     // [0x1e15b20] Final|Native|Public|HasDefaults|BlueprintCallable 
};

/// Class /Script/MFFluid.LandscapeGrassManageComponent
/// Size: 0x0018 (24 bytes) (0x0000F8 - 0x000110) align 8 pad: 0x0000
class ULandscapeGrassManageComponent : public UActorComponent
{ 
public:
	bool                                               bPrintLandscapeInfoOnBeginPlay : 1;                         // 0x00F8:0 (0x0001)  
	bool                                               bPrintLandscapeInfoOnTick : 1;                              // 0x00F8:1 (0x0001)  
	unsigned char                                      UnknownData00_5[0x7];                                       // 0x00F9   (0x0007)  MISSED
	TArray<class UMaterialInstanceDynamic*>            SavedLandscapeMaterials;                                    // 0x0100   (0x0010)  


	/// Functions
	// Function /Script/MFFluid.LandscapeGrassManageComponent.GetLandscapeMobileMaterials
	// TArray<UMaterialInstanceDynamic*> GetLandscapeMobileMaterials();                                                         // [0x1e16bb0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFFluid.LandscapeGrassManageComponent.CreateAndGetDynamicGrassMaterials
	// TArray<UMaterialInstanceDynamic*> CreateAndGetDynamicGrassMaterials();                                                   // [0x1e16690] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFFluid.SpeedtreeWindFieldComponent
/// Size: 0x0010 (16 bytes) (0x000240 - 0x000250) align 16 pad: 0x0000
class USpeedtreeWindFieldComponent : public UWindDirectionalSourceComponent
{ 
public:
	unsigned char                                      UnknownData00_1[0x10];                                      // 0x0240   (0x0010)  MISSED
};

/// Class /Script/MFFluid.VisualizeMeshComponent
/// Size: 0x0018 (24 bytes) (0x0005D8 - 0x0005F0) align 16 pad: 0x0000
class UVisualizeMeshComponent : public UPrimitiveComponent
{ 
public:
	bool                                               bEnable;                                                    // 0x05D8   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x05D9   (0x0007)  MISSED
	class UStaticMesh*                                 Mesh;                                                       // 0x05E0   (0x0008)  
	unsigned char                                      UnknownData01_7[0x8];                                       // 0x05E8   (0x0008)  MISSED
};

/// Class /Script/MFFluid.WaterFieldBaseActor
/// Size: 0x0000 (0 bytes) (0x0002E8 - 0x0002E8) align 8 pad: 0x0000
class AWaterFieldBaseActor : public AFluidFieldBaseActor
{ 
public:
};

/// Class /Script/MFFluid.WaterFieldBaseComponent
/// Size: 0x0018 (24 bytes) (0x000108 - 0x000120) align 8 pad: 0x0000
class UWaterFieldBaseComponent : public UFluidFieldBaseComponent
{ 
public:
	TArray<class UTextureRenderTarget2D*>              HeightMaps;                                                 // 0x0108   (0x0010)  
	int32_t                                            HeightMapIndex;                                             // 0x0118   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x011C   (0x0004)  MISSED


	/// Functions
	// Function /Script/MFFluid.WaterFieldBaseComponent.GetIntVariableValue
	// int32_t GetIntVariableValue(FName& VariableName);                                                                        // [0x1e16ae0] Final|Native|Public|HasOutParms 
	// Function /Script/MFFluid.WaterFieldBaseComponent.GetFloatVariableValue
	// float GetFloatVariableValue(FName& VariableName);                                                                        // [0x1e16970] Final|Native|Public|HasOutParms 
};

/// Class /Script/MFFluid.WindFieldBaseActor
/// Size: 0x0000 (0 bytes) (0x0002E8 - 0x0002E8) align 8 pad: 0x0000
class AWindFieldBaseActor : public AFluidFieldBaseActor
{ 
public:
};

/// Class /Script/MFFluid.WindFieldBaseComponent
/// Size: 0x0058 (88 bytes) (0x000108 - 0x000160) align 8 pad: 0x0000
class UWindFieldBaseComponent : public UFluidFieldBaseComponent
{ 
public:
	unsigned char                                      UnknownData00_1[0x58];                                      // 0x0108   (0x0058)  MISSED


	/// Functions
	// Function /Script/MFFluid.WindFieldBaseComponent.HasInitialized
	// bool HasInitialized();                                                                                                   // [0x1e16c90] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFFluid.WindFieldBaseComponent.GetVelocityField
	// class UTextureRenderTarget2D* GetVelocityField();                                                                        // [0x3a75280] Event|Public|BlueprintCallable|BlueprintEvent 
};

/// Class /Script/MFFluid.WindFieldWorldSubsystem
/// Size: 0x0028 (40 bytes) (0x000030 - 0x000058) align 8 pad: 0x0000
class UWindFieldWorldSubsystem : public UWorldSubsystem
{ 
public:
	unsigned char                                      UnknownData00_3[0x10];                                      // 0x0030   (0x0010)  MISSED
	class UDataAsset*                                  WindField_DataAsset;                                        // 0x0040   (0x0008)  
	int32_t                                            WindLevel;                                                  // 0x0048   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x004C   (0x0004)  MISSED
	class UMaterialParameterCollection*                WindField_MPC;                                              // 0x0050   (0x0008)  


	/// Functions
	// Function /Script/MFFluid.WindFieldWorldSubsystem.UpdateWindFieldParameters
	// void UpdateWindFieldParameters();                                                                                        // [0x1e16f90] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFFluid.WindFieldWorldSubsystem.Tick
	// void Tick(float DeltaTime);                                                                                              // [0x1e16e10] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFFluid.WindFieldWorldSubsystem.IsFluidSystemEnabled
	// bool IsFluidSystemEnabled();                                                                                             // [0x1e16d20] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFFluid.WindFieldWorldSubsystem.InitializeFromBP
	// void InitializeFromBP();                                                                                                 // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFFluid.WindFieldWorldSubsystem.GetVelocityField
	// class UTextureRenderTarget2D* GetVelocityField();                                                                        // [0x1e16c60] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFFluid.WindFieldWorldSubsystem.GetFluidSystemManager
	// class AFluidSystemManager* GetFluidSystemManager();                                                                      // [0x1e16a10] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFFluid.WindFieldWorldSubsystem.GetFirstGlobalWindFieldBaseComponentInWorld
	// class UWindFieldBaseComponent* GetFirstGlobalWindFieldBaseComponentInWorld();                                            // [0x1e16940] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFFluid.WindFieldWorldSubsystem.GetAllFoliages
	// void GetAllFoliages();                                                                                                   // [0xd906a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFFluid.WindFieldWorldSubsystem.DrawMaterialToRenderTarget_SubArea
	// void DrawMaterialToRenderTarget_SubArea(class UObject* WorldContextObject, class UTextureRenderTarget2D* TextureRenderTarget, class UMaterialInterface* Material, FVector2D ScreenPosition, FVector2D ScreenSize, FVector2D CoordinatePosition, FVector2D CoordinateSize); // [0x1e16710] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFFluid.WindFieldWorldSubsystem.AddPlayerAtLocation
	// void AddPlayerAtLocation(FVector PlayerLocation, FVector PlayerPrevLocation, int32_t Duration);                          // [0x1e161b0] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFFluid.WindFieldWorldSubsystem.AddBurstAtLocationWithType
	// void AddBurstAtLocationWithType(FVector WorldPosition, int32_t Type, float BurstRadius, int32_t Duration);               // [0x1e15f00] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFFluid.WindFieldWorldSubsystem.AddBurstAtLocation
	// void AddBurstAtLocation(FVector WorldPosition, float BurstRadius, int32_t Duration);                                     // [0x1e15c50] Final|Native|Public|HasDefaults|BlueprintCallable 
};

static_assert(sizeof(ABlueprintableWindDirectionalSource) == 0x02E8); // 744 bytes (0x0002E8 - 0x0002E8)
static_assert(sizeof(UFluidBlueprintFunctionLibrary) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(ATickEditorActor) == 0x02E8); // 744 bytes (0x0002E0 - 0x0002E8)
static_assert(sizeof(AFluidFieldBaseActor) == 0x02E8); // 744 bytes (0x0002E8 - 0x0002E8)
static_assert(sizeof(UTickEditorActorComponent) == 0x0100); // 256 bytes (0x0000F8 - 0x000100)
static_assert(sizeof(UFluidFieldBaseComponent) == 0x0108); // 264 bytes (0x000100 - 0x000108)
static_assert(sizeof(AFluidInteractionManager) == 0x04C8); // 1224 bytes (0x0002E8 - 0x0004C8)
static_assert(sizeof(UFluidInteractorComponent) == 0x0238); // 568 bytes (0x000220 - 0x000238)
static_assert(sizeof(UFluidInteractorGroupComponent) == 0x0240); // 576 bytes (0x000220 - 0x000240)
static_assert(sizeof(UFluidMeshInteractorComponent) == 0x0270); // 624 bytes (0x000238 - 0x000270)
static_assert(sizeof(UFluidSimpleInteractorComponent) == 0x0260); // 608 bytes (0x000238 - 0x000260)
static_assert(sizeof(AFluidSystemManager) == 0x0570); // 1392 bytes (0x0002E8 - 0x000570)
static_assert(sizeof(ULandscapeGrassManageComponent) == 0x0110); // 272 bytes (0x0000F8 - 0x000110)
static_assert(sizeof(USpeedtreeWindFieldComponent) == 0x0250); // 592 bytes (0x000240 - 0x000250)
static_assert(sizeof(UVisualizeMeshComponent) == 0x05F0); // 1520 bytes (0x0005D8 - 0x0005F0)
static_assert(sizeof(AWaterFieldBaseActor) == 0x02E8); // 744 bytes (0x0002E8 - 0x0002E8)
static_assert(sizeof(UWaterFieldBaseComponent) == 0x0120); // 288 bytes (0x000108 - 0x000120)
static_assert(sizeof(AWindFieldBaseActor) == 0x02E8); // 744 bytes (0x0002E8 - 0x0002E8)
static_assert(sizeof(UWindFieldBaseComponent) == 0x0160); // 352 bytes (0x000108 - 0x000160)
static_assert(sizeof(UWindFieldWorldSubsystem) == 0x0058); // 88 bytes (0x000030 - 0x000058)
static_assert(offsetof(AFluidInteractionManager, WindFieldMaterialParameters) == 0x02F8);
static_assert(offsetof(AFluidInteractionManager, HeightField) == 0x0300);
static_assert(offsetof(AFluidInteractionManager, HeightFieldBackBuffer) == 0x0308);
static_assert(offsetof(AFluidInteractionManager, HeightFieldPrevFrame) == 0x0310);
static_assert(offsetof(AFluidInteractionManager, CopyHeightMaterial) == 0x0318);
static_assert(offsetof(AFluidInteractionManager, FadeOutHeightMaterial) == 0x0320);
static_assert(offsetof(AFluidInteractionManager, DrawBorderMaterial) == 0x0328);
static_assert(offsetof(AFluidInteractionManager, VisualizeMeshMaterial) == 0x0330);
static_assert(offsetof(AFluidInteractionManager, Interactors) == 0x0338);
static_assert(offsetof(UFluidInteractorComponent, InteractorGroup) == 0x0230);
static_assert(offsetof(UFluidMeshInteractorComponent, Mesh) == 0x0238);
static_assert(offsetof(UFluidMeshInteractorComponent, CharacterMovement) == 0x0240);
static_assert(offsetof(UFluidMeshInteractorComponent, DrawHeightMaterial) == 0x0248);
static_assert(offsetof(UFluidSimpleInteractorComponent, DrawHeightMaterial) == 0x0240);
static_assert(offsetof(AFluidSystemManager, StaticWindDirection) == 0x0314);
static_assert(offsetof(AFluidSystemManager, WindOccluderMesh) == 0x0340);
static_assert(offsetof(AFluidSystemManager, WindOccluderScale) == 0x0348);
static_assert(offsetof(AFluidSystemManager, WindOccluderFalloffScale) == 0x0354);
static_assert(offsetof(AFluidSystemManager, WindOccluderMaterial) == 0x0368);
static_assert(offsetof(AFluidSystemManager, WindOccluderHeightRVT) == 0x0370);
static_assert(offsetof(AFluidSystemManager, WindOccluderRVTScreenSizeScale) == 0x037C);
static_assert(offsetof(AFluidSystemManager, SceneComponent) == 0x03A0);
static_assert(offsetof(AFluidSystemManager, SpeedtreeWindFieldComponent) == 0x03A8);
static_assert(offsetof(AFluidSystemManager, WindRippleDirection) == 0x03D0);
static_assert(offsetof(AFluidSystemManager, WindField_MPC) == 0x0430);
static_assert(offsetof(AFluidSystemManager, WindField_NPC) == 0x0438);
static_assert(offsetof(AFluidSystemManager, WindFieldGlobal) == 0x0440);
static_assert(offsetof(AFluidSystemManager, WindFieldGlobalPrev) == 0x0448);
static_assert(offsetof(AFluidSystemManager, VelocityOffset) == 0x0454);
static_assert(offsetof(AFluidSystemManager, WaterPlayerInteractionMat) == 0x0460);
static_assert(offsetof(AFluidSystemManager, WaterBurstInteractionMat) == 0x0468);
static_assert(offsetof(AFluidSystemManager, InputMaterials) == 0x0470);
static_assert(offsetof(AFluidSystemManager, WaterBurstMaterials) == 0x0480);
static_assert(offsetof(AFluidSystemManager, WaterBurstMaterials_MID) == 0x0490);
static_assert(offsetof(AFluidSystemManager, WaterPlayerInteraction_MID) == 0x04A0);
static_assert(offsetof(AFluidSystemManager, InputMaterialDynamicInstances) == 0x04A8);
static_assert(offsetof(AFluidSystemManager, InteractionManagers) == 0x04B8);
static_assert(offsetof(AFluidSystemManager, Interactors) == 0x04C8);
static_assert(offsetof(ULandscapeGrassManageComponent, SavedLandscapeMaterials) == 0x0100);
static_assert(offsetof(UVisualizeMeshComponent, Mesh) == 0x05E0);
static_assert(offsetof(UWaterFieldBaseComponent, HeightMaps) == 0x0108);
static_assert(offsetof(UWindFieldWorldSubsystem, WindField_DataAsset) == 0x0040);
static_assert(offsetof(UWindFieldWorldSubsystem, WindField_MPC) == 0x0050);
