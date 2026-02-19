
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: ProceduralMeshComponent

/// Class /Script/MFSubMeshDecal.MFSubMeshDecalActor
/// Size: 0x0010 (16 bytes) (0x0002E0 - 0x0002F0) align 8 pad: 0x0000
class AMFSubMeshDecalActor : public AActor
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x02E0   (0x0008)  MISSED
	class UMFSubMeshDecalComponent*                    SubMeshDecalComponent;                                      // 0x02E8   (0x0008)  


	/// Functions
	// Function /Script/MFSubMeshDecal.MFSubMeshDecalActor.RegenSubMeshCheckTimerTick
	// void RegenSubMeshCheckTimerTick();                                                                                       // [0x2f9e6a0] Final|Native|Protected 
	// Function /Script/MFSubMeshDecal.MFSubMeshDecalActor.GetSubMeshDecalComponent
	// class UMFSubMeshDecalComponent* GetSubMeshDecalComponent();                                                              // [0x2f9e590] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/MFSubMeshDecal.MFSubMeshDecalComponent
/// Size: 0x0050 (80 bytes) (0x000220 - 0x000270) align 16 pad: 0x0000
class UMFSubMeshDecalComponent : public USceneComponent
{ 
public:
	class UMaterialInterface*                          DecalMaterial;                                              // 0x0220   (0x0008)  
	FVector                                            DecalSize;                                                  // 0x0228   (0x000C)  
	float                                              MaxCullingDegree;                                           // 0x0234   (0x0004)  
	float                                              VertNormalOffsetForStaticMesh;                              // 0x0238   (0x0004)  
	float                                              VertNormalOffsetForLandscape;                               // 0x023C   (0x0004)  
	class UProceduralMeshComponent*                    StaticProcMeshComponent;                                    // 0x0240   (0x0008)  
	TArray<class UProceduralMeshComponent*>            DynamicProcMeshComponents;                                  // 0x0248   (0x0010)  
	unsigned char                                      UnknownData00_7[0x18];                                      // 0x0258   (0x0018)  MISSED


	/// Functions
	// Function /Script/MFSubMeshDecal.MFSubMeshDecalComponent.WaitTasksCompeleteAndClearAllDatas
	// void WaitTasksCompeleteAndClearAllDatas();                                                                               // [0x2f9e960] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFSubMeshDecal.MFSubMeshDecalComponent.SetVertNormalOffsetForStaticMesh
	// void SetVertNormalOffsetForStaticMesh(float InOffset);                                                                   // [0x2f9e8e0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFSubMeshDecal.MFSubMeshDecalComponent.SetVertNormalOffsetForLandscape
	// void SetVertNormalOffsetForLandscape(float InOffset);                                                                    // [0x2f9e860] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFSubMeshDecal.MFSubMeshDecalComponent.SetMaxCullingDegree
	// void SetMaxCullingDegree(float InMaxCullingDegree);                                                                      // [0x2f9e7e0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFSubMeshDecal.MFSubMeshDecalComponent.SetDecalSize
	// void SetDecalSize(FVector& InDecalSize);                                                                                 // [0x2f9e750] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFSubMeshDecal.MFSubMeshDecalComponent.SetDecalMaterial
	// void SetDecalMaterial(class UMaterialInterface* InMaterial);                                                             // [0x2f9e6c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFSubMeshDecal.MFSubMeshDecalComponent.MarkNeedForRecreateDecal
	// void MarkNeedForRecreateDecal(bool bForce);                                                                              // [0x2f9e610] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFSubMeshDecal.MFSubMeshDecalComponent.GetVertPositionNormalOffset
	// float GetVertPositionNormalOffset();                                                                                     // [0x2f9e5e0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFSubMeshDecal.MFSubMeshDecalComponent.GetVertNormalOffsetForLandscape
	// float GetVertNormalOffsetForLandscape();                                                                                 // [0x2f9e5b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFSubMeshDecal.MFSubMeshDecalComponent.GetStaticProceduralMeshComponent
	// class UProceduralMeshComponent* GetStaticProceduralMeshComponent();                                                      // [0x2f9e570] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFSubMeshDecal.MFSubMeshDecalComponent.GetProjectionDirection
	// FVector GetProjectionDirection();                                                                                        // [0x2f9e530] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFSubMeshDecal.MFSubMeshDecalComponent.GetMaxCullingDegree
	// float GetMaxCullingDegree();                                                                                             // [0x2f9e500] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFSubMeshDecal.MFSubMeshDecalComponent.GetDynamicProceduralMeshComponents
	// TArray<UProceduralMeshComponent*> GetDynamicProceduralMeshComponents();                                                  // [0x2f9e470] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFSubMeshDecal.MFSubMeshDecalComponent.GetDecalSize
	// FVector GetDecalSize();                                                                                                  // [0x2f9e430] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFSubMeshDecal.MFSubMeshDecalComponent.GetDecalMaterial
	// class UMaterialInterface* GetDecalMaterial();                                                                            // [0x2f9e400] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

static_assert(sizeof(AMFSubMeshDecalActor) == 0x02F0); // 752 bytes (0x0002E0 - 0x0002F0)
static_assert(sizeof(UMFSubMeshDecalComponent) == 0x0270); // 624 bytes (0x000220 - 0x000270)
static_assert(offsetof(AMFSubMeshDecalActor, SubMeshDecalComponent) == 0x02E8);
static_assert(offsetof(UMFSubMeshDecalComponent, DecalMaterial) == 0x0220);
static_assert(offsetof(UMFSubMeshDecalComponent, DecalSize) == 0x0228);
static_assert(offsetof(UMFSubMeshDecalComponent, StaticProcMeshComponent) == 0x0240);
static_assert(offsetof(UMFSubMeshDecalComponent, DynamicProcMeshComponents) == 0x0248);
