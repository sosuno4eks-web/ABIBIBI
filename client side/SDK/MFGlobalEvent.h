
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: CoreUObject
/// dependency: Engine

/// Enum /Script/MFGlobalEvent.EMFGlobalEventTriggerType
/// Size: 0x01 (1 bytes)
enum class EMFGlobalEventTriggerType : uint8_t
{
	EMFGlobalEventTriggerType__Owner                                                 = 0,
	EMFGlobalEventTriggerType__Global                                                = 1
};

/// Class /Script/MFGlobalEvent.MFGlobalEventSubsystem
/// Size: 0x0050 (80 bytes) (0x000030 - 0x000080) align 8 pad: 0x0000
class UMFGlobalEventSubsystem : public UWorldSubsystem
{ 
public:
	unsigned char                                      UnknownData00_1[0x50];                                      // 0x0030   (0x0050)  MISSED
};

/// Struct /Script/MFGlobalEvent.MFGlobalEventListenerData
/// Size: 0x0070 (112 bytes) (0x000000 - 0x000070) align 16 pad: 0x0000
struct FMFGlobalEventListenerData
{ 
	unsigned char                                      UnknownData00_2[0x70];                                      // 0x0000   (0x0070)  MISSED
};

static_assert(sizeof(UMFGlobalEventSubsystem) == 0x0080); // 128 bytes (0x000030 - 0x000080)
static_assert(sizeof(FMFGlobalEventListenerData) == 0x0070); // 112 bytes (0x000000 - 0x000070)
