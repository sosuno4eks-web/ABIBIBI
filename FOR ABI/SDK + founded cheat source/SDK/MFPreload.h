
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Class /Script/MFPreload.PreloadSubsystem
/// Size: 0x0078 (120 bytes) (0x000030 - 0x0000A8) align 8 pad: 0x0000
class UPreloadSubsystem : public UGameInstanceSubsystem
{ 
public:
	SDK_UNDEFINED(80,2768) /* TMap<UClass*, FObjPool> */ __um(ObjPoolMap);                                         // 0x0030   (0x0050)  
	unsigned char                                      UnknownData00_7[0x28];                                      // 0x0080   (0x0028)  MISSED
};

/// Struct /Script/MFPreload.ObjPool
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FObjPool
{ 
	TArray<class UObject*>                             ObjPool;                                                    // 0x0000   (0x0010)  
	unsigned char                                      UnknownData00_7[0x8];                                       // 0x0010   (0x0008)  MISSED
};

static_assert(sizeof(UPreloadSubsystem) == 0x00A8); // 168 bytes (0x000030 - 0x0000A8)
static_assert(sizeof(FObjPool) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(offsetof(FObjPool, ObjPool) == 0x0000);
