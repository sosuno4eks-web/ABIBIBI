
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: GameletJsEnv
/// dependency: PixUI
/// dependency: UMG

/// Enum /Script/Gamelet.EGameletEnvironment
/// Size: 0x01 (1 bytes)
enum class EGameletEnvironment : uint8_t
{
	Gamelet_Test                                                                     = 0,
	Gamelet_Product                                                                  = 1,
	Gamelet_SingaporeTest                                                            = 2,
	Gamelet_SingaporeProduct                                                         = 3
};

/// Enum /Script/Gamelet.ECmd
/// Size: 0x04 (4 bytes)
enum class ECmd : uint32_t
{
	ECmdGSendMessageToApp                                                            = 10001,
	ECmdS2ESDKInitialized                                                            = 40001,
	ECmdS2EOnCgiProcessComplete                                                      = 40002,
	ECmdS2EStartPuertsVM                                                             = 40003,
	ECmdS2PMin                                                                       = 60000,
	ECmdS2PMax                                                                       = 69999
};

/// Class /Script/Gamelet.Gamelet
/// Size: 0x0030 (48 bytes) (0x000028 - 0x000058) align 8 pad: 0x0000
class UGamelet : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x30];                                      // 0x0028   (0x0030)  MISSED


	/// Functions
	// Function /Script/Gamelet.Gamelet.SetScriptExternalLoadDir
	// int32_t SetScriptExternalLoadDir(FString ExternalLoadDir);                                                               // [0x1a36b20] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/Gamelet.Gamelet.SetProductConfig
	// void SetProductConfig(FString ProductConfig);                                                                            // [0x1a36a80] Final|Native|Public|BlueprintCallable|Const 
	// Function /Script/Gamelet.Gamelet.SetFont
	// int32_t SetFont(FString FontName, FString FontPath);                                                                     // [0x1a36980] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/Gamelet.Gamelet.SetBuiltinResConfig
	// void SetBuiltinResConfig(FString ResConfig);                                                                             // [0x1a368e0] Final|Native|Public|BlueprintCallable|Const 
	// Function /Script/Gamelet.Gamelet.SendMessageToApp
	// int32_t SendMessageToApp(FString AppID, FString Msg);                                                                    // [0x1a367e0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/Gamelet.Gamelet.RefreshUserdata
	// int32_t RefreshUserdata(TMap<FString, FString>& UserData);                                                               // [0x1a36400] Final|Native|Public|HasOutParms|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/Gamelet.Gamelet.OpenApp
	// int32_t OpenApp(FString AppID, FString OpenArgs);                                                                        // [0x1a35ed0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/Gamelet.Gamelet.Open
	// int32_t Open(TEnumAsByte<EGameletEnvironment> Environment, TMap<FString, FString>& UserData);                            // [0x1a35d60] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/Gamelet.Gamelet.Initialize
	// int32_t Initialize(class UGameletSettings* Settings);                                                                    // [0x1a34e80] Final|Native|Public|BlueprintCallable 
	// Function /Script/Gamelet.Gamelet.GetGlobalSettings
	// class UGameletSettings* GetGlobalSettings();                                                                             // [0x1a347d0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/Gamelet.Gamelet.Get
	// class UGamelet* Get();                                                                                                   // [0x1a346c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/Gamelet.Gamelet.ExecOnSDKMessage
	// int32_t ExecOnSDKMessage(FString Msg);                                                                                   // [0x1a34250] Final|Native|Private 
	// Function /Script/Gamelet.Gamelet.ExecOnReportData
	// int32_t ExecOnReportData(FString EventName, FString Data);                                                               // [0x1a34150] Final|Native|Private 
	// Function /Script/Gamelet.Gamelet.ExecOnRefreshUserdata
	// int32_t ExecOnRefreshUserdata();                                                                                         // [0x1a34120] Final|Native|Private 
	// Function /Script/Gamelet.Gamelet.EnableLog
	// void EnableLog(bool enable);                                                                                             // [0x1a34090] Final|Native|Public|BlueprintCallable|Const 
	// Function /Script/Gamelet.Gamelet.Deinitialize
	// int32_t Deinitialize();                                                                                                  // [0x1a33e80] Final|Native|Public|BlueprintCallable 
	// Function /Script/Gamelet.Gamelet.CollectPixUILogOutput
	// void CollectPixUILogOutput(EPxLogGroups PixUILogType, EPxLogLevels PixUILogLevel, FString logContent);                   // [0x1a33c80] Final|Native|Private 
	// Function /Script/Gamelet.Gamelet.CloseApp
	// int32_t CloseApp(FString AppID);                                                                                         // [0x1a33bd0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/Gamelet.Gamelet.Close
	// int32_t Close();                                                                                                         // [0x1a33ba0] Final|Native|Public|BlueprintCallable 
	// Function /Script/Gamelet.Gamelet.AllAssetsGC
	// int32_t AllAssetsGC();                                                                                                   // [0x1a33b70] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/Gamelet.GameletMatBrush
/// Size: 0x0008 (8 bytes) (0x000038 - 0x000040) align 8 pad: 0x0000
class UGameletMatBrush : public UPixUIBrushWrapper
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0038   (0x0008)  MISSED
};

/// Class /Script/Gamelet.GameletEnvMgr
/// Size: 0x0070 (112 bytes) (0x000028 - 0x000098) align 8 pad: 0x0000
class UGameletEnvMgr : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x70];                                      // 0x0028   (0x0070)  MISSED


	/// Functions
	// Function /Script/Gamelet.GameletEnvMgr.OnEnvToGameMessage
	// int32_t OnEnvToGameMessage(FString Msg);                                                                                 // [0x1a35880] Final|Native|Public  
	// Function /Script/Gamelet.GameletEnvMgr.OnEnvToEntryMessage
	// int32_t OnEnvToEntryMessage(FString Msg);                                                                                // [0x1a357d0] Final|Native|Public  
	// Function /Script/Gamelet.GameletEnvMgr.OnEnvReportData
	// int32_t OnEnvReportData(FString EventName, FString Data);                                                                // [0x1a356d0] Final|Native|Public|Const 
	// Function /Script/Gamelet.GameletEnvMgr.OnEnvRefreshUserdata
	// int32_t OnEnvRefreshUserdata();                                                                                          // [0x1a356a0] Final|Native|Public|Const 
	// Function /Script/Gamelet.GameletEnvMgr.OnEnvLoaded
	// void OnEnvLoaded(FString URL, bool IsSuccess);                                                                           // [0x1a35440] Final|Native|Public  
	// Function /Script/Gamelet.GameletEnvMgr.OnEnvInternalError
	// void OnEnvInternalError(int32_t ErrorCode, FString ErrorMsg);                                                            // [0x1a35360] Final|Native|Public|Const 
};

/// Class /Script/Gamelet.GameletFile
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UGameletFile : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/Gamelet.GameletFile.WriteFile
	// bool WriteFile(FString Path, FGameletArrayBuffer& ArrayBuffer);                                                          // [0x1a36dd0] Final|Native|Static|Public|HasOutParms 
	// Function /Script/Gamelet.GameletFile.SaveStringToFile
	// bool SaveStringToFile(FString Path, FString Content);                                                                    // [0x1a366f0] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletFile.ReadFile
	// FGameletArrayBuffer ReadFile(FString Path);                                                                              // [0x1a36350] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletFile.LoadFileToString
	// FString LoadFileToString(FString Path);                                                                                  // [0x1a34fd0] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletFile.FileSize
	// int64_t FileSize(FString Path);                                                                                          // [0x1a343a0] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletFile.FileExists
	// bool FileExists(FString Path);                                                                                           // [0x1a34300] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletFile.DirectoryExists
	// bool DirectoryExists(FString Path);                                                                                      // [0x1a33ff0] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletFile.DeleteFile
	// bool DeleteFile(FString Path);                                                                                           // [0x1a33f50] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletFile.DeleteDirectory
	// bool DeleteDirectory(FString Path);                                                                                      // [0x1a33eb0] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletFile.CreateDirectory
	// bool CreateDirectory(FString Path);                                                                                      // [0x1a33de0] Final|Native|Static|Public 
};

/// Class /Script/Gamelet.GameletPaths
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UGameletPaths : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/Gamelet.GameletPaths.ToAbsolutePathForWrite
	// FString ToAbsolutePathForWrite(FString Path);                                                                            // [0x1a36bd0] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPaths.ToAbsolutePathForRead
	// FString ToAbsolutePathForRead(FString Path);                                                                             // [0x1a36bd0] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPaths.RootDir
	// FString RootDir();                                                                                                       // [0x1a36670] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPaths.ProjectUserDir
	// FString ProjectUserDir();                                                                                                // [0x1a362d0] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPaths.ProjectSavedDir
	// FString ProjectSavedDir();                                                                                               // [0x1a36250] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPaths.ProjectModsDir
	// FString ProjectModsDir();                                                                                                // [0x1a361d0] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPaths.ProjectIntermediateDir
	// FString ProjectIntermediateDir();                                                                                        // [0x1a36150] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPaths.ProjectDir
	// FString ProjectDir();                                                                                                    // [0x1a360d0] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPaths.ProjectContentDir
	// FString ProjectContentDir();                                                                                             // [0x1a36050] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPaths.ProjectConfigDir
	// FString ProjectConfigDir();                                                                                              // [0x1a35fd0] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPaths.LaunchDir
	// FString LaunchDir();                                                                                                     // [0x1a34f50] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPaths.GetPuertsScriptFolderName
	// FString GetPuertsScriptFolderName();                                                                                     // [0x1a34c80] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPaths.GetPuertsEntrancePath
	// FString GetPuertsEntrancePath(FString PakName);                                                                          // [0x1a34ba0] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPaths.GetPuertsAppScriptPath
	// FString GetPuertsAppScriptPath(FString AppFolderName);                                                                   // [0x1a34ac0] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPaths.GetPuertsAppNameByPakName
	// FString GetPuertsAppNameByPakName(FString PakName);                                                                      // [0x1a349e0] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPaths.GetPuertsAppIndexPath
	// FString GetPuertsAppIndexPath(FString AppFolderName);                                                                    // [0x1a34900] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPaths.GameletSavedRoot
	// FString GameletSavedRoot();                                                                                              // [0x1a34640] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPaths.GameletFolderName
	// FString GameletFolderName();                                                                                             // [0x1a345c0] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPaths.GameletContentRoot
	// FString GameletContentRoot();                                                                                            // [0x1a34540] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPaths.GameletAppArchiveRoot
	// FString GameletAppArchiveRoot(FString AppID);                                                                            // [0x1a34460] Final|Native|Static|Public 
};

/// Class /Script/Gamelet.GameletPuertsEnvMgr
/// Size: 0x0060 (96 bytes) (0x000028 - 0x000088) align 8 pad: 0x0000
class UGameletPuertsEnvMgr : public UObject
{ 
public:
	SDK_UNDEFINED(16,2667) /* FMulticastInlineDelegate */ __um(OnPostMessage);                                     // 0x0028   (0x0010)  
	unsigned char                                      UnknownData00_7[0x50];                                      // 0x0038   (0x0050)  MISSED


	/// Functions
	// Function /Script/Gamelet.GameletPuertsEnvMgr.OnEnvMessage
	// void OnEnvMessage(FString Msg);                                                                                          // [0x1a35600] Final|Native|Public  
	// Function /Script/Gamelet.GameletPuertsEnvMgr.OnEnvLoaded
	// void OnEnvLoaded(FString URL, bool IsSuccess);                                                                           // [0x1a35520] Final|Native|Public  
	// Function /Script/Gamelet.GameletPuertsEnvMgr.Get
	// class UGameletPuertsEnvMgr* Get();                                                                                       // [0x1a346f0] Final|Native|Static|Public 
};

/// Class /Script/Gamelet.GameletPuertsUtilities
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UGameletPuertsUtilities : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/Gamelet.GameletPuertsUtilities.UpdateTextureResources
	// void UpdateTextureResources(class UTexture2D* Texture);                                                                  // [0x1a36d50] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPuertsUtilities.UnmountPak
	// int32_t UnmountPak(FString PakPath);                                                                                     // [0x1a36cb0] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPuertsUtilities.RemoveUserWidgetFromGame
	// void RemoveUserWidgetFromGame(class UUserWidget* UserWidget, FString PanelInfo);                                         // [0x1a365a0] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPuertsUtilities.ReleaseTextureResource
	// void ReleaseTextureResource(class UTexture2D* Texture);                                                                  // [0x1a36520] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPuertsUtilities.MountPak
	// int32_t MountPak(FString PakPath);                                                                                       // [0x1a352c0] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPuertsUtilities.LoadUI
	// class UUserWidget* LoadUI(FString Ref, class UObject* Obj);                                                              // [0x1a351e0] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPuertsUtilities.LoadImageToTexture2D
	// class UTexture2D* LoadImageToTexture2D(FString Path, TEnumAsByte<TextureGroup> LODGroup, char IsSRGB);                   // [0x1a350b0] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPuertsUtilities.IsWithEditor
	// bool IsWithEditor();                                                                                                     // [0xc12490] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPuertsUtilities.HelloWorld
	// void HelloWorld();                                                                                                       // [0x1a34e60] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPuertsUtilities.GetWidgetAnimationByName
	// class UWidgetAnimation* GetWidgetAnimationByName(class UUserWidget* Widget, FString Name);                               // [0x1a34d80] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPuertsUtilities.GetSDKVersion
	// FString GetSDKVersion();                                                                                                 // [0x1a34d00] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPuertsUtilities.GetPlatformDesc
	// FString GetPlatformDesc();                                                                                               // [0x1a34880] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPuertsUtilities.GetNetworkType
	// char GetNetworkType();                                                                                                   // [0xc12490] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPuertsUtilities.GetHardwareInfo
	// FString GetHardwareInfo();                                                                                               // [0x1a34800] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPuertsUtilities.GetEngineVersion
	// FString GetEngineVersion();                                                                                              // [0x1a34750] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPuertsUtilities.FlushPuertsVMMessages
	// void FlushPuertsVMMessages();                                                                                            // [0x1a34440] Final|Native|Static|Public 
	// Function /Script/Gamelet.GameletPuertsUtilities.AddUserWidgetToGame
	// void AddUserWidgetToGame(class UUserWidget* UserWidget, FString PanelInfo);                                              // [0x1a33aa0] Final|Native|Static|Public 
};

/// Class /Script/Gamelet.GameletSettings
/// Size: 0x0058 (88 bytes) (0x000028 - 0x000080) align 8 pad: 0x0000
class UGameletSettings : public UObject
{ 
public:
	SDK_UNDEFINED(16,2668) /* FDelegateProperty */     __um(OnSDKMessage);                                         // 0x0028   (0x0010)  
	SDK_UNDEFINED(16,2669) /* FDelegateProperty */     __um(OnRefreshUserdata);                                    // 0x0038   (0x0010)  
	SDK_UNDEFINED(16,2670) /* FDelegateProperty */     __um(OnViewCreated);                                        // 0x0048   (0x0010)  
	SDK_UNDEFINED(16,2671) /* FDelegateProperty */     __um(OnViewAboutToDestroy);                                 // 0x0058   (0x0010)  
	SDK_UNDEFINED(16,2672) /* FDelegateProperty */     __um(OnReportData);                                         // 0x0068   (0x0010)  
	bool                                               DisableJsErrReport;                                         // 0x0078   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0079   (0x0007)  MISSED


	/// Functions
	// Function /Script/Gamelet.GameletSettings.IsValidSetting
	// bool IsValidSetting();                                                                                                   // [0x1a34f20] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/Gamelet.GameletSettings.Get
	// class UGameletSettings* Get();                                                                                           // [0x1a34720] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/Gamelet.GameletWidget
/// Size: 0x0020 (32 bytes) (0x000150 - 0x000170) align 8 pad: 0x0000
class UGameletWidget : public UCanvasPanel
{ 
public:
	unsigned char                                      UnknownData00_1[0x20];                                      // 0x0150   (0x0020)  MISSED
};

/// Class /Script/Gamelet.GameletWindow
/// Size: 0x0120 (288 bytes) (0x000028 - 0x000148) align 8 pad: 0x0000
class UGameletWindow : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x120];                                     // 0x0028   (0x0120)  MISSED


	/// Functions
	// Function /Script/Gamelet.GameletWindow.OnPxWidgetScriptStateInit
	// void OnPxWidgetScriptStateInit();                                                                                        // [0x1a35d40] Final|Native|Private 
	// Function /Script/Gamelet.GameletWindow.OnPxWidgetRequestOpen
	// bool OnPxWidgetRequestOpen(FString URL, FString Name, FString Features, bool bReplace);                                  // [0x1a35bb0] Final|Native|Private|Const 
	// Function /Script/Gamelet.GameletWindow.OnPxWidgetMessage
	// void OnPxWidgetMessage(FString Msg);                                                                                     // [0x1a35b10] Final|Native|Private|Const 
	// Function /Script/Gamelet.GameletWindow.OnPxWidgetLoaded
	// void OnPxWidgetLoaded(FString URL, int32_t ErrorCode);                                                                   // [0x1a35a30] Final|Native|Private|Const 
	// Function /Script/Gamelet.GameletWindow.OnPxWidgetInternalError
	// void OnPxWidgetInternalError(int32_t ErrorCode, FString ErrorMsg);                                                       // [0x1a35950] Final|Native|Private|Const 
	// Function /Script/Gamelet.GameletWindow.OnPxWidgetClose
	// void OnPxWidgetClose();                                                                                                  // [0x1a35930] Final|Native|Private|Const 
};

static_assert(sizeof(UGamelet) == 0x0058); // 88 bytes (0x000028 - 0x000058)
static_assert(sizeof(UGameletMatBrush) == 0x0040); // 64 bytes (0x000038 - 0x000040)
static_assert(sizeof(UGameletEnvMgr) == 0x0098); // 152 bytes (0x000028 - 0x000098)
static_assert(sizeof(UGameletFile) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UGameletPaths) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UGameletPuertsEnvMgr) == 0x0088); // 136 bytes (0x000028 - 0x000088)
static_assert(sizeof(UGameletPuertsUtilities) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UGameletSettings) == 0x0080); // 128 bytes (0x000028 - 0x000080)
static_assert(sizeof(UGameletWidget) == 0x0170); // 368 bytes (0x000150 - 0x000170)
static_assert(sizeof(UGameletWindow) == 0x0148); // 328 bytes (0x000028 - 0x000148)
