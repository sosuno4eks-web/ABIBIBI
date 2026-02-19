
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Enum /Script/MFBaseModule.EGameSceneType
/// Size: 0x01 (1 bytes)
enum class EGameSceneType : uint8_t
{
	EGameSceneType__GST_None                                                         = 0,
	EGameSceneType__GST_Lobby                                                        = 1,
	EGameSceneType__GST_InBattle                                                     = 2,
	EGameSceneType__GST_InBattleCity                                                 = 3,
	EGameSceneType__GST_CG                                                           = 4,
	EGameSceneType__GST_ShootingRoom                                                 = 5
};

/// Enum /Script/MFBaseModule.EMobileDeviceLevel
/// Size: 0x01 (1 bytes)
enum class EMobileDeviceLevel : uint8_t
{
	EMobileDeviceLevel__MobileDeviceLevel_0_VeryVeryLow                              = 0,
	EMobileDeviceLevel__MobileDeviceLevel_1_VeryLow                                  = 1,
	EMobileDeviceLevel__MobileDeviceLevel_2_Low                                      = 2,
	EMobileDeviceLevel__MobileDeviceLevel_3_Medium                                   = 3,
	EMobileDeviceLevel__MobileDeviceLevel_4_Medium                                   = 4,
	EMobileDeviceLevel__MobileDeviceLevel_5_High                                     = 5,
	EMobileDeviceLevel__MobileDeviceLevel_6_HDR                                      = 6,
	EMobileDeviceLevel__MobileDeviceLevel_7_Ultra                                    = 7,
	EMobileDeviceLevel__MobileDeviceLevel_Num                                        = 8
};

/// Class /Script/MFBaseModule.MFBaseServices
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFBaseServices : public UObject
{ 
public:


	/// Functions
	// Function /Script/MFBaseModule.MFBaseServices.ZipLogFile
	// bool ZipLogFile();                                                                                                       // [0x19d0980] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.ZipLogDirectory
	// int32_t ZipLogDirectory(FString InZipName, int32_t IgnoreBigFile, int32_t MaxFileCount);                                 // [0x19d0860] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.ZipFilesEx
	// int32_t ZipFilesEx(FString InZipName, TArray<FString>& InFiles, bool InAppendMode);                                      // [0x19d06e0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.ZipFiles
	// int32_t ZipFiles(FString InZipName, TArray<FString>& InFiles);                                                           // [0x19d05b0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.SavePNGToDCIM_Android
	// bool SavePNGToDCIM_Android(FString InImagePath, FString InFolderName, FString InDisplayName);                            // [0x19d02f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.RestartApplication
	// bool RestartApplication();                                                                                               // [0xc12490] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.MountPak
	// bool MountPak(FString InPakFile, int32_t InOrder, FString InMountPoint);                                                 // [0x19d0180] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.IsUAGameDebugMode
	// bool IsUAGameDebugMode();                                                                                                // [0xc12490] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.IsEditorRuntime
	// bool IsEditorRuntime();                                                                                                  // [0xc12490] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.IsEditor
	// bool IsEditor();                                                                                                         // [0xc12490] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.GetScreenSize
	// FIntPoint GetScreenSize();                                                                                               // [0x19cffc0] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.GetPublishedVersionType
	// FString GetPublishedVersionType();                                                                                       // [0x19cff40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.GetPlatform
	// FString GetPlatform();                                                                                                   // [0x19cfec0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.GetNetModeByWorldContextObject
	// FString GetNetModeByWorldContextObject(class UObject* WorldContextObject);                                               // [0x19cfdf0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.GetNetMode
	// FString GetNetMode();                                                                                                    // [0x19cfd70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.GetLocalIPAddress
	// FString GetLocalIPAddress();                                                                                             // [0x19cfc90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.GetGameUserSettings
	// class UGameUserSettings* GetGameUserSettings();                                                                          // [0x19cfa90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.GetGameSceneType
	// EGameSceneType GetGameSceneType(class UWorld* InWorld);                                                                  // [0x19cfa00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.GetExecutablePath
	// FString GetExecutablePath();                                                                                             // [0x19cf8a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.GetEngine
	// class UEngine* GetEngine();                                                                                              // [0x19cf870] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.GetDeviceModel
	// FString GetDeviceModel();                                                                                                // [0x19cf7f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.GetAppVersionDisplay
	// FString GetAppVersionDisplay();                                                                                          // [0x19cf740] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.EncodeBase64
	// FString EncodeBase64(FString Source);                                                                                    // [0x19cf600] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.DownloadVersionPakPackage
	// void DownloadVersionPakPackage();                                                                                        // [0x19cf5e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.DownloadLuaFixPackage
	// void DownloadLuaFixPackage();                                                                                            // [0x19cf5c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFBaseServices.CreateProc
	// void CreateProc(FString URL, FString Parms);                                                                             // [0x19cf450] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFBaseModule.MFDeviceConsole
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFDeviceConsole : public UObject
{ 
public:


	/// Functions
	// Function /Script/MFBaseModule.MFDeviceConsole.InitDeviceConsoleConfig
	// void InitDeviceConsoleConfig();                                                                                          // [0x1811c00] Final|Native|Static|Public 
};

/// Class /Script/MFBaseModule.MFDeviceQualityScalability
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFDeviceQualityScalability : public UObject
{ 
public:


	/// Functions
	// Function /Script/MFBaseModule.MFDeviceQualityScalability.InitQualitySettingConfig
	// void InitQualitySettingConfig();                                                                                         // [0x19d0070] Final|Native|Static|Public 
};

/// Class /Script/MFBaseModule.MFMemoryScalability
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFMemoryScalability : public UObject
{ 
public:


	/// Functions
	// Function /Script/MFBaseModule.MFMemoryScalability.SetMemoryScalabilityIndex
	// void SetMemoryScalabilityIndex(int32_t Index);                                                                           // [0x16b58a0] Final|Native|Static|Public 
	// Function /Script/MFBaseModule.MFMemoryScalability.InitMemorySettingConfig
	// void InitMemorySettingConfig();                                                                                          // [0x19d0030] Final|Native|Static|Public 
	// Function /Script/MFBaseModule.MFMemoryScalability.GetTotalMemoryInGB
	// int32_t GetTotalMemoryInGB();                                                                                            // [0x19d0000] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFMemoryScalability.GetIntValue
	// int32_t GetIntValue(FString Key, int32_t DefaultValue);                                                                  // [0x19cfac0] Final|Native|Static|Public 
	// Function /Script/MFBaseModule.MFMemoryScalability.GetFloatValue
	// float GetFloatValue(FString Key, float DefaultValue);                                                                    // [0x19cf920] Final|Native|Static|Public 
	// Function /Script/MFBaseModule.MFMemoryScalability.ExecConsoleVarsInLobby
	// void ExecConsoleVarsInLobby();                                                                                           // [0x19cf720] Final|Native|Static|Public 
	// Function /Script/MFBaseModule.MFMemoryScalability.ExecConsoleVarsInBattleCity
	// void ExecConsoleVarsInBattleCity();                                                                                      // [0x19cf700] Final|Native|Static|Public 
	// Function /Script/MFBaseModule.MFMemoryScalability.ExecConsoleVarsInBattle
	// void ExecConsoleVarsInBattle();                                                                                          // [0x19cf6e0] Final|Native|Static|Public 
};

/// Class /Script/MFBaseModule.MFPhoneModelLimitation
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFPhoneModelLimitation : public UObject
{ 
public:


	/// Functions
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.UpdateMobileQCCConfig
	// void UpdateMobileQCCConfig();                                                                                            // [0x19d0590] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.SetTargetDisplayRefreshRate
	// bool SetTargetDisplayRefreshRate(int32_t TargetFrameRate);                                                               // [0x19d0500] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.NeedEnableAA
	// bool NeedEnableAA();                                                                                                     // [0x19d02c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.IsVeryVeryLowDevice
	// bool IsVeryVeryLowDevice();                                                                                              // [0xc12490] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.IsVeryLowDevice
	// bool IsVeryLowDevice();                                                                                                  // [0xc12490] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.IsLowPowerMode
	// bool IsLowPowerMode();                                                                                                   // [0xc12490] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.IsFrameRateLevelSupported
	// bool IsFrameRateLevelSupported(int32_t TargetFrameRate);                                                                 // [0x19d00f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.IsConfigLoaded
	// bool IsConfigLoaded();                                                                                                   // [0x19d00c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.IsAndroidLite
	// bool IsAndroidLite();                                                                                                    // [0x19d0090] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.IOSSetUpFrameRateCalculator
	// void IOSSetUpFrameRateCalculator();                                                                                      // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.InitMobileQCCConfig
	// void InitMobileQCCConfig();                                                                                              // [0x19d0050] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.GetModelName
	// FString GetModelName();                                                                                                  // [0x16b5450] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.GetMobileMaxFrameRate
	// int32_t GetMobileMaxFrameRate();                                                                                         // [0x19cfd10] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.GetMobileLimition
	// bool GetMobileLimition();                                                                                                // [0xc12490] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.GetMobileDeviceLevel
	// int32_t GetMobileDeviceLevel();                                                                                          // [0x19cfd40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.GetMobileCurrentFrameRate
	// int32_t GetMobileCurrentFrameRate();                                                                                     // [0x19cfd10] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.GetIsInMpeUse1cha1List
	// bool GetIsInMpeUse1cha1List();                                                                                           // [0x19cfc60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.GetIsInHighFPSBlackList
	// bool GetIsInHighFPSBlackList();                                                                                          // [0x19cfc30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.GetIsInFPS90WhiteList
	// bool GetIsInFPS90WhiteList();                                                                                            // [0x19cfc00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.GetIsInFPS144WhiteList
	// bool GetIsInFPS144WhiteList();                                                                                           // [0x19cfbd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.GetIsInFPS120WhiteList
	// bool GetIsInFPS120WhiteList();                                                                                           // [0x19cfba0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.GetCurrentFPS
	// int32_t GetCurrentFPS();                                                                                                 // [0x19cf7c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFBaseModule.MFPhoneModelLimitation.CheckVulkanWhiteList
	// bool CheckVulkanWhiteList();                                                                                             // [0x19cf420] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFBaseModule.MFUObjectCheckTool
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFUObjectCheckTool : public UObject
{ 
public:


	/// Functions
	// Function /Script/MFBaseModule.MFUObjectCheckTool.CheckUObjectLeak
	// TMap<FString, FString> CheckUObjectLeak(TArray<FString>& WhiteList);                                                     // [0x19cf2a0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
};

/// Struct /Script/MFBaseModule.DeviceConsoleConfig
/// Size: 0x0080 (128 bytes) (0x000000 - 0x000080) align 8 pad: 0x0000
struct FDeviceConsoleConfig
{ 
	unsigned char                                      UnknownData00_2[0x80];                                      // 0x0000   (0x0080)  MISSED
};

/// Struct /Script/MFBaseModule.DeviceQualityConfig
/// Size: 0x0040 (64 bytes) (0x000000 - 0x000040) align 8 pad: 0x0000
struct FDeviceQualityConfig
{ 
	unsigned char                                      UnknownData00_2[0x40];                                      // 0x0000   (0x0040)  MISSED
};

/// Struct /Script/MFBaseModule.MemorySettingConfig
/// Size: 0x00E0 (224 bytes) (0x000000 - 0x0000E0) align 8 pad: 0x0000
struct FMemorySettingConfig
{ 
	unsigned char                                      UnknownData00_2[0xE0];                                      // 0x0000   (0x00E0)  MISSED
};

static_assert(sizeof(UMFBaseServices) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFDeviceConsole) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFDeviceQualityScalability) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFMemoryScalability) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFPhoneModelLimitation) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFUObjectCheckTool) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FDeviceConsoleConfig) == 0x0080); // 128 bytes (0x000000 - 0x000080)
static_assert(sizeof(FDeviceQualityConfig) == 0x0040); // 64 bytes (0x000000 - 0x000040)
static_assert(sizeof(FMemorySettingConfig) == 0x00E0); // 224 bytes (0x000000 - 0x0000E0)
