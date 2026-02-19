
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Enum /Script/DawnRuntimeComponents.EDawnInteriorVolumePlaneBiasMode
/// Size: 0x01 (1 bytes)
enum class EDawnInteriorVolumePlaneBiasMode : uint8_t
{
	EDawnInteriorVolumePlaneBiasMode__None                                           = 0,
	EDawnInteriorVolumePlaneBiasMode__ForceEnable                                    = 1,
	EDawnInteriorVolumePlaneBiasMode__ForceDisable                                   = 2
};

/// Class /Script/DawnRuntimeComponents.DawnInteriorPortalActor
/// Size: 0x0010 (16 bytes) (0x0002E0 - 0x0002F0) align 8 pad: 0x0000
class ADawnInteriorPortalActor : public AActor
{ 
public:
	EInteriorPortalType                                PortalType;                                                 // 0x02E0   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x02E1   (0x0007)  MISSED
	class UDawnInteriorVolumePlaneGroupComponent*      InteriorVolumePlaneGroupComponent;                          // 0x02E8   (0x0008)  
};

/// Class /Script/DawnRuntimeComponents.DawnInteriorVolume
/// Size: 0x0008 (8 bytes) (0x000318 - 0x000320) align 8 pad: 0x0000
class ADawnInteriorVolume : public AVolume
{ 
public:
	class UDawnInteriorVolumePlaneGroupComponent*      InteriorVolumePlaneGroupComponent;                          // 0x0318   (0x0008)  
};

/// Class /Script/DawnRuntimeComponents.DawnInteriorVolumeMeshProxy
/// Size: 0x0008 (8 bytes) (0x0002E0 - 0x0002E8) align 8 pad: 0x0000
class ADawnInteriorVolumeMeshProxy : public AActor
{ 
public:
	class UDawnInteriorVolumePlaneGroupComponent*      InteriorVolumePlaneGroupComponent;                          // 0x02E0   (0x0008)  
};

/// Class /Script/DawnRuntimeComponents.DawnInteriorVolumeMeshProxyPreviewComponent
/// Size: 0x0028 (40 bytes) (0x0005D8 - 0x000600) align 16 pad: 0x0000
class UDawnInteriorVolumeMeshProxyPreviewComponent : public UPrimitiveComponent
{ 
public:
	FBoxSphereBounds                                   MeshBounds;                                                 // 0x05D8   (0x001C)  
	unsigned char                                      UnknownData00_7[0xC];                                       // 0x05F4   (0x000C)  MISSED
};

/// Struct /Script/DawnRuntimeComponents.DawnInteriorVolumePlane
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 4 pad: 0x0000
struct FDawnInteriorVolumePlane
{ 
	int32_t                                            Index0;                                                     // 0x0000   (0x0004)  
	int32_t                                            Index1;                                                     // 0x0004   (0x0004)  
	int32_t                                            Index2;                                                     // 0x0008   (0x0004)  
	float                                              ExtraBrickTextureUVBias;                                    // 0x000C   (0x0004)  
	float                                              BrickTextureUVBias;                                         // 0x0010   (0x0004)  
	EDawnInteriorVolumePlaneBiasMode                   OverrideBiasMode;                                           // 0x0014   (0x0001)  
	bool                                               bEnableBias : 1;                                            // 0x0015:0 (0x0001)  
	unsigned char                                      UnknownData00_7[0x2];                                       // 0x0016   (0x0002)  MISSED
};

/// Struct /Script/DawnRuntimeComponents.DawnInteriorVolumePlaneGroup
/// Size: 0x0050 (80 bytes) (0x000000 - 0x000050) align 8 pad: 0x0000
struct FDawnInteriorVolumePlaneGroup
{ 
	TArray<FDawnInteriorVolumePlane>                   Planes;                                                     // 0x0000   (0x0010)  
	TArray<FVector>                                    LocalVertices;                                              // 0x0010   (0x0010)  
	TArray<int32_t>                                    Indices;                                                    // 0x0020   (0x0010)  
	FBox                                               LocalBounds;                                                // 0x0030   (0x001C)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x004C   (0x0004)  MISSED
};

/// Class /Script/DawnRuntimeComponents.DawnInteriorVolumePlaneGroupComponent
/// Size: 0x0050 (80 bytes) (0x000220 - 0x000270) align 16 pad: 0x0000
class UDawnInteriorVolumePlaneGroupComponent : public USceneComponent
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0220   (0x0008)  MISSED
	EInteriorPortalType                                PortalType;                                                 // 0x0228   (0x0001)  
	EInteriorPortalShapeType                           PortalShapeType;                                            // 0x0229   (0x0001)  
	unsigned char                                      UnknownData01_6[0x2];                                       // 0x022A   (0x0002)  MISSED
	FVector                                            InnerScale;                                                 // 0x022C   (0x000C)  
	float                                              Weight;                                                     // 0x0238   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x023C   (0x0004)  MISSED
	TArray<FDawnInteriorVolumePlaneGroup>              PlaneGroups;                                                // 0x0240   (0x0010)  
	float                                              FadeoutThickness;                                           // 0x0250   (0x0004)  
	FBoxSphereBounds                                   PlaneGroupBounds;                                           // 0x0254   (0x001C)  


	/// Functions
	// Function /Script/DawnRuntimeComponents.DawnInteriorVolumePlaneGroupComponent.SetWeight
	// void SetWeight(float InWeight);                                                                                          // [0x3060dc0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/DawnRuntimeComponents.DawnProbeDistanceMapModifierActor
/// Size: 0x0008 (8 bytes) (0x0002E0 - 0x0002E8) align 8 pad: 0x0000
class ADawnProbeDistanceMapModifierActor : public AActor
{ 
public:
	class UDawnProbeDistanceMapModifierComponent*      ModifierComponent;                                          // 0x02E0   (0x0008)  
};

/// Class /Script/DawnRuntimeComponents.DawnRelightingPortalComponentBase
/// Size: 0x0000 (0 bytes) (0x0002D0 - 0x0002D0) align 16 pad: 0x0000
class UDawnRelightingPortalComponentBase : public UPrtRelightingPortalComponent
{ 
public:
};

/// Class /Script/DawnRuntimeComponents.DawnProbeDistanceMapModifierComponent
/// Size: 0x0000 (0 bytes) (0x0002D0 - 0x0002D0) align 16 pad: 0x0000
class UDawnProbeDistanceMapModifierComponent : public UDawnRelightingPortalComponentBase
{ 
public:
};

/// Class /Script/DawnRuntimeComponents.DawnRelightingPortalActor
/// Size: 0x0008 (8 bytes) (0x0002E0 - 0x0002E8) align 8 pad: 0x0000
class ADawnRelightingPortalActor : public AActor
{ 
public:
	class UDawnRelightingPortalComponent*              RelightingPortal;                                           // 0x02E0   (0x0008)  
};

/// Class /Script/DawnRuntimeComponents.DawnRelightingPortalComponent
/// Size: 0x0010 (16 bytes) (0x0002D0 - 0x0002E0) align 16 pad: 0x0000
class UDawnRelightingPortalComponent : public UDawnRelightingPortalComponentBase
{ 
public:
	bool                                               bInjectSunLight : 1;                                        // 0x02D0:0 (0x0001)  
	bool                                               bInjectSkyLight : 1;                                        // 0x02D0:1 (0x0001)  
	bool                                               bInjectTransfer : 1;                                        // 0x02D0:2 (0x0001)  
	unsigned char                                      UnknownData00_5[0x3];                                       // 0x02D1   (0x0003)  MISSED
	float                                              SkyOcclusionBoost;                                          // 0x02D4   (0x0004)  
	float                                              TransferBoost;                                              // 0x02D8   (0x0004)  
	bool                                               bCastShadowMap : 1;                                         // 0x02DC:0 (0x0001)  
	unsigned char                                      UnknownData01_7[0x3];                                       // 0x02DD   (0x0003)  MISSED
};

static_assert(sizeof(ADawnInteriorPortalActor) == 0x02F0); // 752 bytes (0x0002E0 - 0x0002F0)
static_assert(sizeof(ADawnInteriorVolume) == 0x0320); // 800 bytes (0x000318 - 0x000320)
static_assert(sizeof(ADawnInteriorVolumeMeshProxy) == 0x02E8); // 744 bytes (0x0002E0 - 0x0002E8)
static_assert(sizeof(UDawnInteriorVolumeMeshProxyPreviewComponent) == 0x0600); // 1536 bytes (0x0005D8 - 0x000600)
static_assert(sizeof(FDawnInteriorVolumePlane) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FDawnInteriorVolumePlaneGroup) == 0x0050); // 80 bytes (0x000000 - 0x000050)
static_assert(sizeof(UDawnInteriorVolumePlaneGroupComponent) == 0x0270); // 624 bytes (0x000220 - 0x000270)
static_assert(sizeof(ADawnProbeDistanceMapModifierActor) == 0x02E8); // 744 bytes (0x0002E0 - 0x0002E8)
static_assert(sizeof(UDawnRelightingPortalComponentBase) == 0x02D0); // 720 bytes (0x0002D0 - 0x0002D0)
static_assert(sizeof(UDawnProbeDistanceMapModifierComponent) == 0x02D0); // 720 bytes (0x0002D0 - 0x0002D0)
static_assert(sizeof(ADawnRelightingPortalActor) == 0x02E8); // 744 bytes (0x0002E0 - 0x0002E8)
static_assert(sizeof(UDawnRelightingPortalComponent) == 0x02E0); // 736 bytes (0x0002D0 - 0x0002E0)
static_assert(offsetof(ADawnInteriorPortalActor, PortalType) == 0x02E0);
static_assert(offsetof(ADawnInteriorPortalActor, InteriorVolumePlaneGroupComponent) == 0x02E8);
static_assert(offsetof(ADawnInteriorVolume, InteriorVolumePlaneGroupComponent) == 0x0318);
static_assert(offsetof(ADawnInteriorVolumeMeshProxy, InteriorVolumePlaneGroupComponent) == 0x02E0);
static_assert(offsetof(UDawnInteriorVolumeMeshProxyPreviewComponent, MeshBounds) == 0x05D8);
static_assert(offsetof(FDawnInteriorVolumePlane, OverrideBiasMode) == 0x0014);
static_assert(offsetof(FDawnInteriorVolumePlaneGroup, Planes) == 0x0000);
static_assert(offsetof(FDawnInteriorVolumePlaneGroup, LocalVertices) == 0x0010);
static_assert(offsetof(FDawnInteriorVolumePlaneGroup, Indices) == 0x0020);
static_assert(offsetof(FDawnInteriorVolumePlaneGroup, LocalBounds) == 0x0030);
static_assert(offsetof(UDawnInteriorVolumePlaneGroupComponent, PortalType) == 0x0228);
static_assert(offsetof(UDawnInteriorVolumePlaneGroupComponent, PortalShapeType) == 0x0229);
static_assert(offsetof(UDawnInteriorVolumePlaneGroupComponent, InnerScale) == 0x022C);
static_assert(offsetof(UDawnInteriorVolumePlaneGroupComponent, PlaneGroups) == 0x0240);
static_assert(offsetof(UDawnInteriorVolumePlaneGroupComponent, PlaneGroupBounds) == 0x0254);
static_assert(offsetof(ADawnProbeDistanceMapModifierActor, ModifierComponent) == 0x02E0);
static_assert(offsetof(ADawnRelightingPortalActor, RelightingPortal) == 0x02E0);
