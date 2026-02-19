
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject

/// Class /Script/RenderingHooker.RenderingHookerSettings
/// Size: 0x0010 (16 bytes) (0x000028 - 0x000038) align 8 pad: 0x0000
class URenderingHookerSettings : public UObject
{ 
public:
	TArray<FString>                                    Materials;                                                  // 0x0028   (0x0010)  
};

static_assert(sizeof(URenderingHookerSettings) == 0x0038); // 56 bytes (0x000028 - 0x000038)
static_assert(offsetof(URenderingHookerSettings, Materials) == 0x0028);
