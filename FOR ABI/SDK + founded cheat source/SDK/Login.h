
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Class /Game/Login/Blueprints/LoadRegistActor.LoadRegistActor_C
/// Size: 0x0020 (32 bytes) (0x0002E0 - 0x000300) align 8 pad: 0x0000
class ALoadRegistActor_C : public AActor
{ 
public:
	FPointerToUberGraphFrame                           UberGraphFrame;                                             // 0x02E0   (0x0008)  
	class USceneComponent*                             DefaultSceneRoot;                                           // 0x02E8   (0x0008)  
	SDK_UNDEFINED(16,2738) /* FMulticastInlineDelegate */ __um(MapLoadedEvent);                                    // 0x02F0   (0x0010)  


	/// Functions
	// Function /Game/Login/Blueprints/LoadRegistActor.LoadRegistActor_C.GetModuleName
	// FString GetModuleName();                                                                                                 // [0x3a75280] Event|Public|HasOutParms|BlueprintCallable|BlueprintEvent|Const 
	// Function /Game/Login/Blueprints/LoadRegistActor.LoadRegistActor_C.LoadMap
	// void LoadMap();                                                                                                          // [0x3a75280] BlueprintCallable|BlueprintEvent 
	// Function /Game/Login/Blueprints/LoadRegistActor.LoadRegistActor_C.OnLoadMap
	// void OnLoadMap();                                                                                                        // [0x3a75280] BlueprintCallable|BlueprintEvent 
	// Function /Game/Login/Blueprints/LoadRegistActor.LoadRegistActor_C.ExecuteUbergraph_LoadRegistActor
	// void ExecuteUbergraph_LoadRegistActor(int32_t EntryPoint);                                                               // [0x3a75280] Final                
	// Function /Game/Login/Blueprints/LoadRegistActor.LoadRegistActor_C.MapLoadedEvent__DelegateSignature
	// void MapLoadedEvent__DelegateSignature();                                                                                // [0x3a75280] Public|Delegate|BlueprintCallable|BlueprintEvent 
};

static_assert(sizeof(ALoadRegistActor_C) == 0x0300); // 768 bytes (0x0002E0 - 0x000300)
static_assert(offsetof(ALoadRegistActor_C, UberGraphFrame) == 0x02E0);
static_assert(offsetof(ALoadRegistActor_C, DefaultSceneRoot) == 0x02E8);
