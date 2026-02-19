
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: UMG

/// Enum /Script/MFInputReplayTool.ECharacterRecordDataType
/// Size: 0x01 (1 bytes)
enum class ECharacterRecordDataType : uint8_t
{
	ECharacterRecordDataType__InputAxis                                              = 0,
	ECharacterRecordDataType__InputTouch                                             = 1,
	ECharacterRecordDataType__InputKey                                               = 2,
	ECharacterRecordDataType__Clicked                                                = 3,
	ECharacterRecordDataType__Pressed                                                = 4,
	ECharacterRecordDataType__Released                                               = 5,
	ECharacterRecordDataType__Hovered                                                = 6,
	ECharacterRecordDataType__Unhovered                                              = 7,
	ECharacterRecordDataType__State                                                  = 8,
	ECharacterRecordDataType__Move                                                   = 9,
	ECharacterRecordDataType__Pitch                                                  = 10,
	ECharacterRecordDataType__Yaw                                                    = 11,
	ECharacterRecordDataType__Roll                                                   = 12,
	ECharacterRecordDataType__CPitch                                                 = 13,
	ECharacterRecordDataType__CYaw                                                   = 14,
	ECharacterRecordDataType__CRoll                                                  = 15,
	ECharacterRecordDataType__TouchStart                                             = 16,
	ECharacterRecordDataType__TouchEnd                                               = 17,
	ECharacterRecordDataType__Scroll                                                 = 18,
	ECharacterRecordDataType__Endurance                                              = 19,
	ECharacterRecordDataType__CharacterInfo                                          = 20,
	ECharacterRecordDataType__ExecUE4Command                                         = 21,
	ECharacterRecordDataType__GrabUIFeature                                          = 22,
	ECharacterRecordDataType__DoLuaString                                            = 23,
	ECharacterRecordDataType__RemoteSendBack                                         = 24,
	ECharacterRecordDataType__KeyUp                                                  = 25,
	ECharacterRecordDataType__KeyDown                                                = 26,
	ECharacterRecordDataType__KeyChar                                                = 27,
	ECharacterRecordDataType__MouseButtonDown                                        = 28,
	ECharacterRecordDataType__MouseButtonUp                                          = 29
};

/// Class /Script/MFInputReplayTool.MFInputBaseComponent
/// Size: 0x0220 (544 bytes) (0x0000F8 - 0x000318) align 8 pad: 0x0000
class UMFInputBaseComponent : public UActorComponent
{ 
public:
	unsigned char                                      UnknownData00_3[0xE0];                                      // 0x00F8   (0x00E0)  MISSED
	class APlayerController*                           Controller;                                                 // 0x01D8   (0x0008)  
	unsigned char                                      UnknownData01_6[0x8];                                       // 0x01E0   (0x0008)  MISSED
	class UMfInputControlGameInstanceSubsystem*        pGameInstanceSubsystem;                                     // 0x01E8   (0x0008)  
	unsigned char                                      UnknownData02_6[0x118];                                     // 0x01F0   (0x0118)  MISSED
	SDK_UNDEFINED(16,2766) /* FMulticastInlineDelegate */ __um(ComponentEventDelegate);                            // 0x0308   (0x0010)  


	/// Functions
	// Function /Script/MFInputReplayTool.MFInputBaseComponent.HandleInfoFromServer
	// void HandleInfoFromServer(FString RspContent);                                                                           // [0x1e5ccc0] Final|Native|Protected 
};

/// Class /Script/MFInputReplayTool.MfInputControlActor
/// Size: 0x0038 (56 bytes) (0x0002E0 - 0x000318) align 8 pad: 0x0000
class AMfInputControlActor : public AActor
{ 
public:
	SDK_UNDEFINED(16,2767) /* FMulticastInlineDelegate */ __um(RecordEventDelegate);                               // 0x02E0   (0x0010)  
	class UClass*                                      RecordReplayHudWidgetClass;                                 // 0x02F0   (0x0008)  
	FSoftClassPath                                     SoftRecordReplayHudWidgetClassPath;                         // 0x02F8   (0x0018)  
	class UUserWidget*                                 RecordReplayHudUserWidget;                                  // 0x0310   (0x0008)  


	/// Functions
	// Function /Script/MFInputReplayTool.MfInputControlActor.ProcessCommandSimple
	// void ProcessCommandSimple(FString Context);                                                                              // [0x1e5de00] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFInputReplayTool.MfInputControlActor.ProcessCommand
	// void ProcessCommand(FString Type, FString arg, FString Arg2);                                                            // [0x1e5dbf0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFInputReplayTool.MfInputControlActor.OnChangeRecordReplayState
	// void OnChangeRecordReplayState(FString Type);                                                                            // [0x1e5db50] Final|Native|Public  
};

/// Class /Script/MFInputReplayTool.MfInputControlGameInstanceSubsystem
/// Size: 0x0090 (144 bytes) (0x000030 - 0x0000C0) align 8 pad: 0x0000
class UMfInputControlGameInstanceSubsystem : public UGameInstanceSubsystem
{ 
public:
	unsigned char                                      UnknownData00_1[0x90];                                      // 0x0030   (0x0090)  MISSED
};

/// Class /Script/MFInputReplayTool.MfInputControlUtils
/// Size: 0x0030 (48 bytes) (0x000028 - 0x000058) align 8 pad: 0x0000
class UMfInputControlUtils : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x30];                                      // 0x0028   (0x0030)  MISSED


	/// Functions
	// Function /Script/MFInputReplayTool.MfInputControlUtils.GrabWidgetFeaturesFromTree
	// bool GrabWidgetFeaturesFromTree(FString& Ret);                                                                           // [0x1e5c4a0] Final|Native|Public|HasOutParms 
	// Function /Script/MFInputReplayTool.MfInputControlUtils.GrabWidgetFeatures
	// bool GrabWidgetFeatures(FString& Ret);                                                                                   // [0x1e5c3e0] Final|Native|Public|HasOutParms 
	// Function /Script/MFInputReplayTool.MfInputControlUtils.GetVersionDisplay
	// FString GetVersionDisplay();                                                                                             // [0x1e5c360] Final|Native|Public  
	// Function /Script/MFInputReplayTool.MfInputControlUtils.GetSimpleDeviceName
	// FString GetSimpleDeviceName();                                                                                           // [0x19a1d90] Final|Native|Public  
	// Function /Script/MFInputReplayTool.MfInputControlUtils.GetDeviceName
	// FString GetDeviceName();                                                                                                 // [0x1e5c2e0] Final|Native|Public  
	// Function /Script/MFInputReplayTool.MfInputControlUtils.Get
	// class UMfInputControlUtils* Get();                                                                                       // [0x1e5c280] Final|Native|Static|Public 
	// Function /Script/MFInputReplayTool.MfInputControlUtils.ExecDoString
	// FString ExecDoString(FString Funcparams);                                                                                // [0x1e5c080] Final|Native|Public  
	// Function /Script/MFInputReplayTool.MfInputControlUtils.CallGameInstance
	// FString CallGameInstance(FName& Funcname, FString Funcparams);                                                           // [0x1e5bf40] Final|Native|Public|HasOutParms 
};

/// Class /Script/MFInputReplayTool.MfInputControlWorldSubsystem
/// Size: 0x0000 (0 bytes) (0x000030 - 0x000030) align 8 pad: 0x0000
class UMfInputControlWorldSubsystem : public UWorldSubsystem
{ 
public:
};

/// Class /Script/MFInputReplayTool.MfInputRecordComponent
/// Size: 0x0008 (8 bytes) (0x000318 - 0x000320) align 8 pad: 0x0000
class UMfInputRecordComponent : public UMFInputBaseComponent
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0318   (0x0008)  MISSED


	/// Functions
	// Function /Script/MFInputReplayTool.MfInputRecordComponent.StopRecord
	// void StopRecord();                                                                                                       // [0x1e5e530] Final|Native|Public  
	// Function /Script/MFInputReplayTool.MfInputRecordComponent.StartRecord
	// void StartRecord(FString _TestId, FString _DeviceId);                                                                    // [0x1e5e230] Final|Native|Public  
	// Function /Script/MFInputReplayTool.MfInputRecordComponent.RunUE4Command
	// bool RunUE4Command(FString Command);                                                                                     // [0x1e5df50] Final|Native|Public  
	// Function /Script/MFInputReplayTool.MfInputRecordComponent.RunGrabUIFeature
	// bool RunGrabUIFeature(FString Command);                                                                                  // [0x1e5dea0] Final|Native|Public  
	// Function /Script/MFInputReplayTool.MfInputRecordComponent.HandleScrollEvent
	// void HandleScrollEvent(FString Type, FString Name, FVector2D& Pos, FVector2D& Size, FString OtherName, float Offset, float OffsetOfEnd); // [0x1e5d120] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFInputReplayTool.MfInputRecordComponent.HandlePureClickEvent
	// void HandlePureClickEvent(FString EventName, FString MoreValue);                                                         // [0x1e5cfa0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFInputReplayTool.MfInputRecordComponent.HandleKeyBoadEvent
	// void HandleKeyBoadEvent(FString EventName, int32_t CharacterCode, int32_t KeyCode, FString MoreValue);                   // [0x1e5cdb0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFInputReplayTool.MfInputRecordComponent.HandleEndurance
	// void HandleEndurance();                                                                                                  // [0x1e5cca0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFInputReplayTool.MfInputRecordComponent.HandleControllerEvent
	// void HandleControllerEvent(FString Type, FVector WorldDirection, float ScaleValue, bool bForce);                         // [0x1e5c930] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFInputReplayTool.MfInputRecordComponent.HandleCharacterStateEvent
	// void HandleCharacterStateEvent(FVector& position, FRotator& Roation, FVector& Velocity, bool bSprint);                   // [0x1e5c7a0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFInputReplayTool.MfInputRecordComponent.HandleButtonEvent
	// void HandleButtonEvent(FString Type, FString Name, FVector2D& GeoPos, FVector2D& GeoSize, FVector2D& TouchPos, FString OtherName); // [0x1e5c560] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFInputReplayTool.MfInputRecordComponent.ExecDoString
	// bool ExecDoString(FString Command, FString& Ret);                                                                        // [0x1e5c170] Final|Native|Public|HasOutParms 
	// Function /Script/MFInputReplayTool.MfInputRecordComponent.AddTag
	// bool AddTag(FString Type, FString Value);                                                                                // [0x1e5be40] Final|Native|Public  
};

/// Class /Script/MFInputReplayTool.MfInputReplayComponent
/// Size: 0x0200 (512 bytes) (0x000318 - 0x000518) align 8 pad: 0x0000
class UMfInputReplayComponent : public UMFInputBaseComponent
{ 
public:
	unsigned char                                      UnknownData00_3[0x1C0];                                     // 0x0318   (0x01C0)  MISSED
	class UClass*                                      WidgetClass;                                                // 0x04D8   (0x0008)  
	FSoftClassPath                                     SoftHudWidgetClassPath;                                     // 0x04E0   (0x0018)  
	class UUserWidget*                                 WidgetInstance;                                             // 0x04F8   (0x0008)  
	class UCanvasPanelSlot*                            TouchCanvasPanelSlot;                                       // 0x0500   (0x0008)  
	class UImage*                                      TouchImage;                                                 // 0x0508   (0x0008)  
	unsigned char                                      UnknownData01_7[0x8];                                       // 0x0510   (0x0008)  MISSED


	/// Functions
	// Function /Script/MFInputReplayTool.MfInputReplayComponent.StopReplay2
	// void StopReplay2(int32_t Type);                                                                                          // [0x1e5e550] Final|Native|Public  
	// Function /Script/MFInputReplayTool.MfInputReplayComponent.StopReplay
	// void StopReplay(int32_t Type);                                                                                           // [0x1e5e5e0] Final|Native|Public  
	// Function /Script/MFInputReplayTool.MfInputReplayComponent.StartReplay2
	// void StartReplay2(FString TestId, FString DeviceID);                                                                     // [0x1e5e330] Final|Native|Public  
	// Function /Script/MFInputReplayTool.MfInputReplayComponent.StartReplay
	// void StartReplay(FString TestId, FString DeviceID);                                                                      // [0x1e5e430] Final|Native|Public  
	// Function /Script/MFInputReplayTool.MfInputReplayComponent.HandleStartReplayFromServer
	// void HandleStartReplayFromServer(FString RspContent);                                                                    // [0x1e5d390] Final|Native|Public  
	// Function /Script/MFInputReplayTool.MfInputReplayComponent.HandleDownloadFromServer2
	// void HandleDownloadFromServer2(FString RspContent);                                                                      // [0x1e5cac0] Final|Native|Public  
	// Function /Script/MFInputReplayTool.MfInputReplayComponent.HandleDownloadFromServer
	// void HandleDownloadFromServer(FString RspContent);                                                                       // [0x1e5cbb0] Final|Native|Public  
};

/// Class /Script/MFInputReplayTool.MftHttpTask
/// Size: 0x00B8 (184 bytes) (0x000028 - 0x0000E0) align 8 pad: 0x0000
class UMftHttpTask : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x80];                                      // 0x0028   (0x0080)  MISSED
	FString                                            ScreenNotifyName;                                           // 0x00A8   (0x0010)  
	FString                                            LuaNotifyName;                                              // 0x00B8   (0x0010)  
	unsigned char                                      UnknownData01_7[0x18];                                      // 0x00C8   (0x0018)  MISSED


	/// Functions
	// Function /Script/MFInputReplayTool.MftHttpTask.SendLogTask
	// void SendLogTask(FString URL, FString LogName, TMap<FString, FString>& Param);                                           // [0x1e5e000] Final|Native|Public|HasOutParms 
	// Function /Script/MFInputReplayTool.MftHttpTask.HttpUpLoadFileWithParams
	// bool HttpUpLoadFileWithParams(FString URL, FString FilePath, TMap<FString, FString> Params);                             // [0x1e5d8d0] Final|Native|Public  
	// Function /Script/MFInputReplayTool.MftHttpTask.HttpUpLoadDelegate__DelegateSignature
	// void HttpUpLoadDelegate__DelegateSignature(FString RspContent);                                                          // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/MFInputReplayTool.MftHttpTask.HttpGetWithParams
	// void HttpGetWithParams(FString URL, TMap<FString, FString> Params);                                                      // [0x1e5d700] Final|Native|Public  
	// Function /Script/MFInputReplayTool.MftHttpTask.HttpDownLoadRecordFileWithParams
	// void HttpDownLoadRecordFileWithParams(FString URL, FString Filename, TMap<FString, FString> Params);                     // [0x1e5d480] Final|Native|Public  
	// Function /Script/MFInputReplayTool.MftHttpTask.Get
	// class UMftHttpTask* Get();                                                                                               // [0x1e5c2b0] Final|Native|Static|Public 
};

static_assert(sizeof(UMFInputBaseComponent) == 0x0318); // 792 bytes (0x0000F8 - 0x000318)
static_assert(sizeof(AMfInputControlActor) == 0x0318); // 792 bytes (0x0002E0 - 0x000318)
static_assert(sizeof(UMfInputControlGameInstanceSubsystem) == 0x00C0); // 192 bytes (0x000030 - 0x0000C0)
static_assert(sizeof(UMfInputControlUtils) == 0x0058); // 88 bytes (0x000028 - 0x000058)
static_assert(sizeof(UMfInputControlWorldSubsystem) == 0x0030); // 48 bytes (0x000030 - 0x000030)
static_assert(sizeof(UMfInputRecordComponent) == 0x0320); // 800 bytes (0x000318 - 0x000320)
static_assert(sizeof(UMfInputReplayComponent) == 0x0518); // 1304 bytes (0x000318 - 0x000518)
static_assert(sizeof(UMftHttpTask) == 0x00E0); // 224 bytes (0x000028 - 0x0000E0)
static_assert(offsetof(UMFInputBaseComponent, Controller) == 0x01D8);
static_assert(offsetof(UMFInputBaseComponent, pGameInstanceSubsystem) == 0x01E8);
static_assert(offsetof(AMfInputControlActor, RecordReplayHudWidgetClass) == 0x02F0);
static_assert(offsetof(AMfInputControlActor, SoftRecordReplayHudWidgetClassPath) == 0x02F8);
static_assert(offsetof(AMfInputControlActor, RecordReplayHudUserWidget) == 0x0310);
static_assert(offsetof(UMfInputReplayComponent, WidgetClass) == 0x04D8);
static_assert(offsetof(UMfInputReplayComponent, SoftHudWidgetClassPath) == 0x04E0);
static_assert(offsetof(UMfInputReplayComponent, WidgetInstance) == 0x04F8);
static_assert(offsetof(UMfInputReplayComponent, TouchCanvasPanelSlot) == 0x0500);
static_assert(offsetof(UMfInputReplayComponent, TouchImage) == 0x0508);
static_assert(offsetof(UMftHttpTask, ScreenNotifyName) == 0x00A8);
static_assert(offsetof(UMftHttpTask, LuaNotifyName) == 0x00B8);
