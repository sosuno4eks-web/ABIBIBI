
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Class /Script/MFPropsDestruction.BreakableWinBaseActor
/// Size: 0x0000 (0 bytes) (0x0002F0 - 0x0002F0) align 8 pad: 0x0000
class ABreakableWinBaseActor : public AStaticMeshActor
{ 
public:
};

/// Struct /Script/MFPropsDestruction.GlassBoxCollisionInfo
/// Size: 0x0001 (1 bytes) (0x000000 - 0x000001) align 1 pad: 0x0000
struct FGlassBoxCollisionInfo
{ 
	bool                                               bBroken;                                                    // 0x0000   (0x0001)  
};

/// Class /Script/MFPropsDestruction.GlassBoxComponent
/// Size: 0x0020 (32 bytes) (0x000600 - 0x000620) align 16 pad: 0x0000
class UGlassBoxComponent : public UBoxComponent
{ 
public:
	int32_t                                            ColorID;                                                    // 0x0600   (0x0004)  
	FGlassBoxCollisionInfo                             GlassBoxCollisionInfo;                                      // 0x0604   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0605   (0x0003)  MISSED
	class UMFGlassCutterComponent*                     CachedGlassCutter;                                          // 0x0608   (0x0008)  
	unsigned char                                      UnknownData01_7[0x10];                                      // 0x0610   (0x0010)  MISSED


	/// Functions
	// Function /Script/MFPropsDestruction.GlassBoxComponent.TestHitGlass
	// void TestHitGlass();                                                                                                     // [0xd906a0] Final|Native|Public  
	// Function /Script/MFPropsDestruction.GlassBoxComponent.OnHitGlassOffline
	// void OnHitGlassOffline(FHitResult& Hit);                                                                                 // [0x2f3c420] Final|Native|Public|HasOutParms 
	// Function /Script/MFPropsDestruction.GlassBoxComponent.OnHitGlass
	// void OnHitGlass();                                                                                                       // [0x2f3c400] Final|Native|Public  
};

/// Struct /Script/MFPropsDestruction.MFGlassCachedImpact
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 4 pad: 0x0000
struct FMFGlassCachedImpact
{ 
	int32_t                                            ColorID;                                                    // 0x0000   (0x0004)  
	int8_t                                             WeaponType;                                                 // 0x0004   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0005   (0x0003)  MISSED
	FVector                                            Location;                                                   // 0x0008   (0x000C)  
	FVector                                            Normal;                                                     // 0x0014   (0x000C)  
};

/// Class /Script/MFPropsDestruction.MFGlassCutterComponent
/// Size: 0x02A0 (672 bytes) (0x0000F8 - 0x000398) align 8 pad: 0x0000
class UMFGlassCutterComponent : public UActorComponent
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x00F8   (0x0008)  MISSED
	class UTexture2D*                                  MaskTex;                                                    // 0x0100   (0x0008)  
	TArray<char>                                       MaskIDCache;                                                // 0x0108   (0x0010)  
	TArray<char>                                       ClientMaskIDCache;                                          // 0x0118   (0x0010)  
	bool                                               Inited;                                                     // 0x0128   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0129   (0x0003)  MISSED
	int32_t                                            IDMaxCount;                                                 // 0x012C   (0x0004)  
	int32_t                                            TestPartId;                                                 // 0x0130   (0x0004)  
	FVector                                            Scale;                                                      // 0x0134   (0x000C)  
	FVector                                            Dir;                                                        // 0x0140   (0x000C)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x014C   (0x0004)  MISSED
	TArray<FVector>                                    Pos;                                                        // 0x0150   (0x0010)  
	SDK_UNDEFINED(80,2334) /* TMap<int32_t, int32_t> */ __um(IDTriangleStartIndexMap);                             // 0x0160   (0x0050)  
	SDK_UNDEFINED(80,2335) /* TMap<int32_t, int32_t> */ __um(IDTriangleEndIndexMap);                               // 0x01B0   (0x0050)  
	bool                                               bPassable : 1;                                              // 0x0200:0 (0x0001)  
	unsigned char                                      UnknownData03_5[0x14F];                                     // 0x0201   (0x014F)  MISSED
	TArray<FMFGlassCachedImpact>                       CachedImpacts;                                              // 0x0350   (0x0010)  
	unsigned char                                      UnknownData04_6[0x20];                                      // 0x0360   (0x0020)  MISSED
	TArray<class UGlassBoxComponent*>                  GlassBoxCompList;                                           // 0x0380   (0x0010)  
	unsigned char                                      UnknownData05_7[0x8];                                       // 0x0390   (0x0008)  MISSED


	/// Functions
	// Function /Script/MFPropsDestruction.MFGlassCutterComponent.OnReplicate_MaskIDCache
	// void OnReplicate_MaskIDCache();                                                                                          // [0x2f3c520] Final|Native|Protected 
	// Function /Script/MFPropsDestruction.MFGlassCutterComponent.OnReplicate_CachedImpacts
	// void OnReplicate_CachedImpacts();                                                                                        // [0x2f3c500] Final|Native|Protected 
	// Function /Script/MFPropsDestruction.MFGlassCutterComponent.ChangeBehaviour
	// void ChangeBehaviour(int32_t ColorID, FMFGlassImpact Impact);                                                            // [0x2f3c310] Final|Native|Public  
};

/// Struct /Script/MFPropsDestruction.MFGlassImpact
/// Size: 0x001C (28 bytes) (0x000000 - 0x00001C) align 4 pad: 0x0000
struct FMFGlassImpact
{ 
	int8_t                                             WeaponType;                                                 // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	FVector                                            Location;                                                   // 0x0004   (0x000C)  
	FVector                                            Normal;                                                     // 0x0010   (0x000C)  
};

/// Struct /Script/MFPropsDestruction.GlassHitEffectInfo
/// Size: 0x0038 (56 bytes) (0x000000 - 0x000038) align 8 pad: 0x0000
struct FGlassHitEffectInfo
{ 
	TArray<int32_t>                                    IDList;                                                     // 0x0000   (0x0010)  
	TArray<FVector>                                    DirList;                                                    // 0x0010   (0x0010)  
	TArray<int32_t>                                    WeaponTypeList;                                             // 0x0020   (0x0010)  
	int32_t                                            Count;                                                      // 0x0030   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0034   (0x0004)  MISSED
};

static_assert(sizeof(ABreakableWinBaseActor) == 0x02F0); // 752 bytes (0x0002F0 - 0x0002F0)
static_assert(sizeof(FGlassBoxCollisionInfo) == 0x0001); // 1 bytes (0x000000 - 0x000001)
static_assert(sizeof(UGlassBoxComponent) == 0x0620); // 1568 bytes (0x000600 - 0x000620)
static_assert(sizeof(FMFGlassCachedImpact) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(UMFGlassCutterComponent) == 0x0398); // 920 bytes (0x0000F8 - 0x000398)
static_assert(sizeof(FMFGlassImpact) == 0x001C); // 28 bytes (0x000000 - 0x00001C)
static_assert(sizeof(FGlassHitEffectInfo) == 0x0038); // 56 bytes (0x000000 - 0x000038)
static_assert(offsetof(UGlassBoxComponent, GlassBoxCollisionInfo) == 0x0604);
static_assert(offsetof(UGlassBoxComponent, CachedGlassCutter) == 0x0608);
static_assert(offsetof(FMFGlassCachedImpact, Location) == 0x0008);
static_assert(offsetof(FMFGlassCachedImpact, Normal) == 0x0014);
static_assert(offsetof(UMFGlassCutterComponent, MaskTex) == 0x0100);
static_assert(offsetof(UMFGlassCutterComponent, MaskIDCache) == 0x0108);
static_assert(offsetof(UMFGlassCutterComponent, ClientMaskIDCache) == 0x0118);
static_assert(offsetof(UMFGlassCutterComponent, Scale) == 0x0134);
static_assert(offsetof(UMFGlassCutterComponent, Dir) == 0x0140);
static_assert(offsetof(UMFGlassCutterComponent, Pos) == 0x0150);
static_assert(offsetof(UMFGlassCutterComponent, CachedImpacts) == 0x0350);
static_assert(offsetof(UMFGlassCutterComponent, GlassBoxCompList) == 0x0380);
static_assert(offsetof(FMFGlassImpact, Location) == 0x0004);
static_assert(offsetof(FMFGlassImpact, Normal) == 0x0010);
static_assert(offsetof(FGlassHitEffectInfo, IDList) == 0x0000);
static_assert(offsetof(FGlassHitEffectInfo, DirList) == 0x0010);
static_assert(offsetof(FGlassHitEffectInfo, WeaponTypeList) == 0x0020);
