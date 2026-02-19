
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: AkAudio
/// dependency: CoreUObject
/// dependency: Engine

/// Class /Wwise/AnimNotify_AkEvent.AnimNotify_AkEvent_C
/// Size: 0x0030 (48 bytes) (0x000038 - 0x000068) align 8 pad: 0x0000
class UAnimNotify_AkEvent_C : public UAnimNotify
{ 
public:
	FString                                            Attach_Name;                                                // 0x0038   (0x0010)  
	class UAkAudioEvent*                               Event;                                                      // 0x0048   (0x0008)  
	bool                                               Follow;                                                     // 0x0050   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0051   (0x0007)  MISSED
	FString                                            EventName;                                                  // 0x0058   (0x0010)  


	/// Functions
	// Function /Wwise/AnimNotify_AkEvent.AnimNotify_AkEvent_C.Received_Notify
	// bool Received_Notify(class USkeletalMeshComponent* MeshComp, class UAnimSequenceBase* Animation);                        // [0x3a75280] Event|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintEvent|Const 
};

static_assert(sizeof(UAnimNotify_AkEvent_C) == 0x0068); // 104 bytes (0x000038 - 0x000068)
static_assert(offsetof(UAnimNotify_AkEvent_C, Attach_Name) == 0x0038);
static_assert(offsetof(UAnimNotify_AkEvent_C, Event) == 0x0048);
static_assert(offsetof(UAnimNotify_AkEvent_C, EventName) == 0x0058);
