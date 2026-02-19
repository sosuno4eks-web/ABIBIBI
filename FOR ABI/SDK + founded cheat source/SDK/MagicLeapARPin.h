
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Enum /Script/MagicLeapARPin.EMagicLeapARPinType
/// Size: 0x01 (1 bytes)
enum class EMagicLeapARPinType : uint8_t
{
	EMagicLeapARPinType__SingleUserSingleSession                                     = 0,
	EMagicLeapARPinType__SingleUserMultiSession                                      = 1,
	EMagicLeapARPinType__MultiUserMultiSession                                       = 2
};

/// Enum /Script/MagicLeapARPin.EMagicLeapAutoPinType
/// Size: 0x01 (1 bytes)
enum class EMagicLeapAutoPinType : uint8_t
{
	EMagicLeapAutoPinType__OnlyOnDataRestoration                                     = 0,
	EMagicLeapAutoPinType__Always                                                    = 1,
	EMagicLeapAutoPinType__Never                                                     = 2
};

/// Enum /Script/MagicLeapARPin.EMagicLeapPassableWorldError
/// Size: 0x01 (1 bytes)
enum class EMagicLeapPassableWorldError : uint8_t
{
	EMagicLeapPassableWorldError__None                                               = 0,
	EMagicLeapPassableWorldError__LowMapQuality                                      = 1,
	EMagicLeapPassableWorldError__UnableToLocalize                                   = 2,
	EMagicLeapPassableWorldError__Unavailable                                        = 3,
	EMagicLeapPassableWorldError__PrivilegeDenied                                    = 4,
	EMagicLeapPassableWorldError__InvalidParam                                       = 5,
	EMagicLeapPassableWorldError__UnspecifiedFailure                                 = 6,
	EMagicLeapPassableWorldError__PrivilegeRequestPending                            = 7,
	EMagicLeapPassableWorldError__StartupPending                                     = 8,
	EMagicLeapPassableWorldError__SharedWorldNotEnabled                              = 9,
	EMagicLeapPassableWorldError__NotImplemented                                     = 10,
	EMagicLeapPassableWorldError__PinNotFound                                        = 11
};

/// Class /Script/MagicLeapARPin.MagicLeapARPinComponent
/// Size: 0x01C0 (448 bytes) (0x000220 - 0x0003E0) align 16 pad: 0x0000
class UMagicLeapARPinComponent : public USceneComponent
{ 
public:
	FString                                            ObjectUID;                                                  // 0x0220   (0x0010)  
	int32_t                                            UserIndex;                                                  // 0x0230   (0x0004)  
	EMagicLeapAutoPinType                              AutoPinType;                                                // 0x0234   (0x0001)  
	bool                                               bShouldPinActor;                                            // 0x0235   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x0236   (0x0002)  MISSED
	class UClass*                                      PinDataClass;                                               // 0x0238   (0x0008)  
	SDK_UNDEFINED(80,2739) /* TSet<EMagicLeapARPinType> */ __um(SearchPinTypes);                                   // 0x0240   (0x0050)  
	class USphereComponent*                            SearchVolume;                                               // 0x0290   (0x0008)  
	SDK_UNDEFINED(16,2740) /* FMulticastInlineDelegate */ __um(OnPersistentEntityPinned);                          // 0x0298   (0x0010)  
	SDK_UNDEFINED(16,2741) /* FMulticastInlineDelegate */ __um(OnPersistentEntityPinLost);                         // 0x02A8   (0x0010)  
	SDK_UNDEFINED(16,2742) /* FMulticastInlineDelegate */ __um(OnPinDataLoadAttemptCompleted);                     // 0x02B8   (0x0010)  
	FGuid                                              PinnedCFUID;                                                // 0x02C8   (0x0010)  
	class USceneComponent*                             PinnedSceneComponent;                                       // 0x02D8   (0x0008)  
	class UMagicLeapARPinSaveGame*                     PinData;                                                    // 0x02E0   (0x0008)  
	unsigned char                                      UnknownData01_7[0xF8];                                      // 0x02E8   (0x00F8)  MISSED


	/// Functions
	// Function /Script/MagicLeapARPin.MagicLeapARPinComponent.UnPin
	// void UnPin();                                                                                                            // [0x30a6280] Final|Native|Public|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinComponent.TryGetPinData
	// class UMagicLeapARPinSaveGame* TryGetPinData(class UClass* InPinDataClass, bool& OutPinDataValid);                       // [0x30a6060] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinComponent.PinToRestoredOrSyncedID
	// bool PinToRestoredOrSyncedID();                                                                                          // [0x30a5d00] Final|Native|Public|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinComponent.PinToID
	// bool PinToID(FGuid& PinId);                                                                                              // [0x30a5c50] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinComponent.PinToBestFit
	// void PinToBestFit();                                                                                                     // [0x30a5c30] Final|Native|Public|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinComponent.PinSceneComponent
	// bool PinSceneComponent(class USceneComponent* ComponentToPin);                                                           // [0x30a5b90] Final|Native|Public|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinComponent.PinRestoredOrSynced
	// bool PinRestoredOrSynced();                                                                                              // [0x30a5b60] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MagicLeapARPin.MagicLeapARPinComponent.PinActor
	// bool PinActor(class AActor* ActorToPin);                                                                                 // [0x30a5ac0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinComponent.PersistentEntityPinned__DelegateSignature
	// void PersistentEntityPinned__DelegateSignature(bool bRestoredOrSynced);                                                  // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/MagicLeapARPin.MagicLeapARPinComponent.PersistentEntityPinLost__DelegateSignature
	// void PersistentEntityPinLost__DelegateSignature();                                                                       // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/MagicLeapARPin.MagicLeapARPinComponent.MagicLeapARPinDataLoadAttemptCompleted__DelegateSignature
	// void MagicLeapARPinDataLoadAttemptCompleted__DelegateSignature(bool bDataRestored);                                      // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/MagicLeapARPin.MagicLeapARPinComponent.IsPinned
	// bool IsPinned();                                                                                                         // [0x30a5970] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MagicLeapARPin.MagicLeapARPinComponent.GetPinState
	// bool GetPinState(FMagicLeapARPinState& State);                                                                           // [0x30a5810] Final|Native|Public|HasOutParms|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MagicLeapARPin.MagicLeapARPinComponent.GetPinnedPinID
	// bool GetPinnedPinID(FGuid& PinId);                                                                                       // [0x30a58c0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MagicLeapARPin.MagicLeapARPinComponent.GetPinData
	// class UMagicLeapARPinSaveGame* GetPinData(class UClass* PinDataClass);                                                   // [0x30a5770] Final|Native|Public|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinComponent.AttemptPinDataRestorationAsync
	// void AttemptPinDataRestorationAsync();                                                                                   // [0x30a4d30] Final|Native|Public|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinComponent.AttemptPinDataRestoration
	// bool AttemptPinDataRestoration();                                                                                        // [0x30a4d00] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMagicLeapARPinFunctionLibrary : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.UnBindToOnMagicLeapContentBindingFoundDelegate
	// void UnBindToOnMagicLeapContentBindingFoundDelegate(FDelegateProperty& Delegate);                                        // [0x30a61e0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.UnBindToOnMagicLeapARPinUpdatedDelegate
	// void UnBindToOnMagicLeapARPinUpdatedDelegate(FDelegateProperty& Delegate);                                               // [0x30a6140] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.SetGlobalQueryFilter
	// EMagicLeapPassableWorldError SetGlobalQueryFilter(FMagicLeapARPinQuery& InGlobalFilter);                                 // [0x30a5ef0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.SetContentBindingSaveGameUserIndex
	// void SetContentBindingSaveGameUserIndex(int32_t UserIndex);                                                              // [0x30a5e70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.QueryARPins
	// EMagicLeapPassableWorldError QueryARPins(FMagicLeapARPinQuery& Query, TArray<FGuid>& Pins);                              // [0x30a5d30] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.ParseStringToARPinId
	// bool ParseStringToARPinId(FString PinIdString, FGuid& ARPinId);                                                          // [0x30a59d0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.IsTrackerValid
	// bool IsTrackerValid();                                                                                                   // [0x30a59a0] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.GetNumAvailableARPins
	// EMagicLeapPassableWorldError GetNumAvailableARPins(int32_t& Count);                                                      // [0x30a56e0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.GetGlobalQueryFilter
	// EMagicLeapPassableWorldError GetGlobalQueryFilter(FMagicLeapARPinQuery& CurrentGlobalFilter);                            // [0x30a5600] Final|Native|Static|Public|HasOutParms|BlueprintCallable|BlueprintPure 
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.GetContentBindingSaveGameUserIndex
	// int32_t GetContentBindingSaveGameUserIndex();                                                                            // [0x30a55d0] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.GetClosestARPin
	// EMagicLeapPassableWorldError GetClosestARPin(FVector& SearchPoint, FGuid& PinId);                                        // [0x30a54e0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.GetAvailableARPins
	// EMagicLeapPassableWorldError GetAvailableARPins(int32_t NumRequested, TArray<FGuid>& Pins);                              // [0x30a53f0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.GetARPinStateToString
	// FString GetARPinStateToString(FMagicLeapARPinState& State);                                                              // [0x30a5310] Final|Native|Static|Public|HasOutParms|BlueprintCallable|BlueprintPure 
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.GetARPinState
	// EMagicLeapPassableWorldError GetARPinState(FGuid& PinId, FMagicLeapARPinState& State);                                   // [0x30a5210] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.GetARPinPositionAndOrientation_TrackingSpace
	// bool GetARPinPositionAndOrientation_TrackingSpace(FGuid& PinId, FVector& position, FRotator& Orientation, bool& PinFoundInEnvironment); // [0x30a5080] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.GetARPinPositionAndOrientation
	// bool GetARPinPositionAndOrientation(FGuid& PinId, FVector& position, FRotator& Orientation, bool& PinFoundInEnvironment); // [0x30a4ef0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.DestroyTracker
	// EMagicLeapPassableWorldError DestroyTracker();                                                                           // [0x30a4ec0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.CreateTracker
	// EMagicLeapPassableWorldError CreateTracker();                                                                            // [0x30a4e90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.BindToOnMagicLeapContentBindingFoundDelegate
	// void BindToOnMagicLeapContentBindingFoundDelegate(FDelegateProperty& Delegate);                                          // [0x30a4df0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.BindToOnMagicLeapARPinUpdatedDelegate
	// void BindToOnMagicLeapARPinUpdatedDelegate(FDelegateProperty& Delegate);                                                 // [0x30a4d50] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MagicLeapARPin.MagicLeapARPinFunctionLibrary.ARPinIdToString
	// FString ARPinIdToString(FGuid& ARPinId);                                                                                 // [0x30a4c20] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MagicLeapARPin.MagicLeapARPinInfoActorBase
/// Size: 0x0018 (24 bytes) (0x0002E0 - 0x0002F8) align 8 pad: 0x0000
class AMagicLeapARPinInfoActorBase : public AActor
{ 
public:
	FGuid                                              PinId;                                                      // 0x02E0   (0x0010)  
	bool                                               bVisibilityOverride;                                        // 0x02F0   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x02F1   (0x0007)  MISSED


	/// Functions
	// Function /Script/MagicLeapARPin.MagicLeapARPinInfoActorBase.OnUpdateARPinState
	// void OnUpdateARPinState();                                                                                               // [0x3a75280] Event|Public|BlueprintCallable|BlueprintEvent 
};

/// Class /Script/MagicLeapARPin.MagicLeapARPinRenderer
/// Size: 0x0068 (104 bytes) (0x0002E0 - 0x000348) align 8 pad: 0x0000
class AMagicLeapARPinRenderer : public AActor
{ 
public:
	bool                                               bInfoActorsVisibilityOverride;                              // 0x02E0   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x02E1   (0x0007)  MISSED
	SDK_UNDEFINED(80,2743) /* TMap<FGuid, AMagicLeapARPinInfoActorBase*> */ __um(AllInfoActors);                   // 0x02E8   (0x0050)  
	unsigned char                                      UnknownData01_6[0x8];                                       // 0x0338   (0x0008)  MISSED
	class UClass*                                      ClassToSpawn;                                               // 0x0340   (0x0008)  


	/// Functions
	// Function /Script/MagicLeapARPin.MagicLeapARPinRenderer.SetVisibilityOverride
	// void SetVisibilityOverride(bool InVisibilityOverride);                                                                   // [0x30a5fd0] Final|Native|Private|BlueprintCallable 
};

/// Struct /Script/MagicLeapARPin.MagicLeapARPinState
/// Size: 0x0014 (20 bytes) (0x000000 - 0x000014) align 4 pad: 0x0000
struct FMagicLeapARPinState
{ 
	float                                              Confidence;                                                 // 0x0000   (0x0004)  
	float                                              ValidRadius;                                                // 0x0004   (0x0004)  
	float                                              RotationError;                                              // 0x0008   (0x0004)  
	float                                              TranslationError;                                           // 0x000C   (0x0004)  
	EMagicLeapARPinType                                PinType;                                                    // 0x0010   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x0011   (0x0003)  MISSED
};

/// Class /Script/MagicLeapARPin.MagicLeapARPinSettings
/// Size: 0x0018 (24 bytes) (0x000028 - 0x000040) align 8 pad: 0x0000
class UMagicLeapARPinSettings : public UObject
{ 
public:
	float                                              UpdateCheckFrequency;                                       // 0x0028   (0x0004)  
	FMagicLeapARPinState                               OnUpdatedEventTriggerDelta;                                 // 0x002C   (0x0014)  
};

/// Class /Script/MagicLeapARPin.MagicLeapARPinSaveGame
/// Size: 0x0088 (136 bytes) (0x000028 - 0x0000B0) align 16 pad: 0x0000
class UMagicLeapARPinSaveGame : public USaveGame
{ 
public:
	FGuid                                              PinnedID;                                                   // 0x0028   (0x0010)  
	unsigned char                                      UnknownData00_6[0x8];                                       // 0x0038   (0x0008)  MISSED
	FTransform                                         ComponentWorldTransform;                                    // 0x0040   (0x0030)  
	FTransform                                         PinTransform;                                               // 0x0070   (0x0030)  
	bool                                               bShouldPinActor;                                            // 0x00A0   (0x0001)  
	unsigned char                                      UnknownData01_7[0xF];                                       // 0x00A1   (0x000F)  MISSED
};

/// Class /Script/MagicLeapARPin.MagicLeapARPinContentBindings
/// Size: 0x0050 (80 bytes) (0x000028 - 0x000078) align 8 pad: 0x0000
class UMagicLeapARPinContentBindings : public USaveGame
{ 
public:
	SDK_UNDEFINED(80,2744) /* TMap<FGuid, FMagicLeapARPinObjectIdList> */ __um(AllContentBindings);                // 0x0028   (0x0050)  
};

/// Struct /Script/MagicLeapARPin.MagicLeapARPinQuery
/// Size: 0x0068 (104 bytes) (0x000000 - 0x000068) align 8 pad: 0x0000
struct FMagicLeapARPinQuery
{ 
	SDK_UNDEFINED(80,2745) /* TSet<EMagicLeapARPinType> */ __um(Types);                                            // 0x0000   (0x0050)  
	int32_t                                            MaxResults;                                                 // 0x0050   (0x0004)  
	FVector                                            TargetPoint;                                                // 0x0054   (0x000C)  
	float                                              Radius;                                                     // 0x0060   (0x0004)  
	bool                                               bSorted;                                                    // 0x0064   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x0065   (0x0003)  MISSED
};

/// Struct /Script/MagicLeapARPin.MagicLeapARPinObjectIdList
/// Size: 0x0050 (80 bytes) (0x000000 - 0x000050) align 8 pad: 0x0000
struct FMagicLeapARPinObjectIdList
{ 
	SDK_UNDEFINED(80,2746) /* TSet<FString> */         __um(ObjectIdList);                                         // 0x0000   (0x0050)  
};

static_assert(sizeof(UMagicLeapARPinComponent) == 0x03E0); // 992 bytes (0x000220 - 0x0003E0)
static_assert(sizeof(UMagicLeapARPinFunctionLibrary) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(AMagicLeapARPinInfoActorBase) == 0x02F8); // 760 bytes (0x0002E0 - 0x0002F8)
static_assert(sizeof(AMagicLeapARPinRenderer) == 0x0348); // 840 bytes (0x0002E0 - 0x000348)
static_assert(sizeof(FMagicLeapARPinState) == 0x0014); // 20 bytes (0x000000 - 0x000014)
static_assert(sizeof(UMagicLeapARPinSettings) == 0x0040); // 64 bytes (0x000028 - 0x000040)
static_assert(sizeof(UMagicLeapARPinSaveGame) == 0x00B0); // 176 bytes (0x000028 - 0x0000B0)
static_assert(sizeof(UMagicLeapARPinContentBindings) == 0x0078); // 120 bytes (0x000028 - 0x000078)
static_assert(sizeof(FMagicLeapARPinQuery) == 0x0068); // 104 bytes (0x000000 - 0x000068)
static_assert(sizeof(FMagicLeapARPinObjectIdList) == 0x0050); // 80 bytes (0x000000 - 0x000050)
static_assert(offsetof(UMagicLeapARPinComponent, ObjectUID) == 0x0220);
static_assert(offsetof(UMagicLeapARPinComponent, AutoPinType) == 0x0234);
static_assert(offsetof(UMagicLeapARPinComponent, PinDataClass) == 0x0238);
static_assert(offsetof(UMagicLeapARPinComponent, SearchVolume) == 0x0290);
static_assert(offsetof(UMagicLeapARPinComponent, PinnedCFUID) == 0x02C8);
static_assert(offsetof(UMagicLeapARPinComponent, PinnedSceneComponent) == 0x02D8);
static_assert(offsetof(UMagicLeapARPinComponent, PinData) == 0x02E0);
static_assert(offsetof(AMagicLeapARPinInfoActorBase, PinId) == 0x02E0);
static_assert(offsetof(AMagicLeapARPinRenderer, ClassToSpawn) == 0x0340);
static_assert(offsetof(FMagicLeapARPinState, PinType) == 0x0010);
static_assert(offsetof(UMagicLeapARPinSettings, OnUpdatedEventTriggerDelta) == 0x002C);
static_assert(offsetof(UMagicLeapARPinSaveGame, PinnedID) == 0x0028);
static_assert(offsetof(UMagicLeapARPinSaveGame, ComponentWorldTransform) == 0x0040);
static_assert(offsetof(UMagicLeapARPinSaveGame, PinTransform) == 0x0070);
static_assert(offsetof(FMagicLeapARPinQuery, TargetPoint) == 0x0054);
