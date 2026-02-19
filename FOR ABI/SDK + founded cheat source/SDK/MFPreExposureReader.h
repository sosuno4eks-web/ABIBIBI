
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: Niagara

/// Class /Script/MFPreExposureReader.MFPreExposureReadSystem
/// Size: 0x0030 (48 bytes) (0x000030 - 0x000060) align 8 pad: 0x0000
class UMFPreExposureReadSystem : public UWorldSubsystem
{ 
public:
	unsigned char                                      UnknownData00_3[0x20];                                      // 0x0030   (0x0020)  MISSED
	class UNiagaraParameterCollection*                 NPC;                                                        // 0x0050   (0x0008)  
	class UNiagaraParameterCollectionInstance*         NPCI;                                                       // 0x0058   (0x0008)  


	/// Functions
	// Function /Script/MFPreExposureReader.MFPreExposureReadSystem.GetMainViewPreExposure
	// float GetMainViewPreExposure();                                                                                          // [0x2f5bff0] Final|Native|Public|BlueprintCallable|BlueprintPure 
};

static_assert(sizeof(UMFPreExposureReadSystem) == 0x0060); // 96 bytes (0x000030 - 0x000060)
static_assert(offsetof(UMFPreExposureReadSystem, NPC) == 0x0050);
static_assert(offsetof(UMFPreExposureReadSystem, NPCI) == 0x0058);
