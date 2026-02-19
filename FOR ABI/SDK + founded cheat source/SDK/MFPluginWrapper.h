
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: SlateCore
/// dependency: UMG

/// Enum /Script/MFPluginWrapper.EMFBoxLoginSourceType
/// Size: 0x01 (1 bytes)
enum class EMFBoxLoginSourceType : uint8_t
{
	EMFBoxLoginSourceType__NONE                                                      = 0,
	EMFBoxLoginSourceType__QQLogin                                                   = 1,
	EMFBoxLoginSourceType__WeChatLogin                                               = 2,
	EMFBoxLoginSourceType__Tourist                                                   = 3
};

/// Enum /Script/MFPluginWrapper.EMFBoxClientType
/// Size: 0x01 (1 bytes)
enum class EMFBoxClientType : uint8_t
{
	EMFBoxClientType__NONE                                                           = 0,
	EMFBoxClientType__InitBox                                                        = 1
};

/// Enum /Script/MFPluginWrapper.EMFNewNetworkState
/// Size: 0x01 (1 bytes)
enum class EMFNewNetworkState : uint8_t
{
	EMFNewNetworkState__NotReachable                                                 = 0,
	EMFNewNetworkState__WWAN                                                         = 1,
	EMFNewNetworkState__Wifi                                                         = 2,
	EMFNewNetworkState__Others                                                       = 3
};

/// Enum /Script/MFPluginWrapper.EPufferTaskState
/// Size: 0x01 (1 bytes)
enum class EPufferTaskState : uint8_t
{
	EPufferTaskState__PufferTask_None                                                = 0,
	EPufferTaskState__PufferTask_Downloading                                         = 1,
	EPufferTaskState__PufferTask_Pause                                               = 2,
	EPufferTaskState__PufferTask_Error                                               = 3,
	EPufferTaskState__PufferTask_Completed                                           = 4
};

/// Enum /Script/MFPluginWrapper.EUamDeviceRank
/// Size: 0x01 (1 bytes)
enum class EUamDeviceRank : uint8_t
{
	EUamDeviceRank__SuperFirstGear                                                   = 7,
	EUamDeviceRank__FirstGear                                                        = 6,
	EUamDeviceRank__SecondGear                                                       = 5,
	EUamDeviceRank__ThirdGear                                                        = 3,
	EUamDeviceRank__FourthGear                                                       = 2,
	EUamDeviceRank__FifthGear                                                        = 1,
	EUamDeviceRank__SixthGear                                                        = 0
};

/// Enum /Script/MFPluginWrapper.EUAGraphicStyleQuality
/// Size: 0x01 (1 bytes)
enum class EUAGraphicStyleQuality : uint8_t
{
	EUAGraphicStyleQuality__GfxStyleQualityDefault                                   = 0,
	EUAGraphicStyleQuality__GfxStyleQualityRealistic                                 = 0,
	EUAGraphicStyleQuality__GfxStyleQualityWarm                                      = 1,
	EUAGraphicStyleQuality__GfxStyleQualityCold                                      = 2,
	EUAGraphicStyleQuality__GfxStyleQualityBright                                    = 3
};

/// Enum /Script/MFPluginWrapper.EUAFrameRateLevel
/// Size: 0x01 (1 bytes)
enum class EUAFrameRateLevel : uint8_t
{
	EUAFrameRateLevel__FrameRateDefault                                              = 0,
	EUAFrameRateLevel__FrameRateLow                                                  = 0,
	EUAFrameRateLevel__FrameRateMedium                                               = 1,
	EUAFrameRateLevel__FrameRateHigh                                                 = 2,
	EUAFrameRateLevel__FrameRateSuper                                                = 3,
	EUAFrameRateLevel__FrameRateMax                                                  = 4,
	EUAFrameRateLevel__FrameRate90                                                   = 5,
	EUAFrameRateLevel__FrameRate120                                                  = 6,
	EUAFrameRateLevel__FrameRate144                                                  = 7
};

/// Enum /Script/MFPluginWrapper.EUAGrahpicsQuality
/// Size: 0x01 (1 bytes)
enum class EUAGrahpicsQuality : uint8_t
{
	EUAGrahpicsQuality__GfxQualityDefault                                            = 0,
	EUAGrahpicsQuality__GfxQualitySuperLow                                           = 0,
	EUAGrahpicsQuality__GfxQualityLow                                                = 1,
	EUAGrahpicsQuality__GfxQualityMedium                                             = 2,
	EUAGrahpicsQuality__GfxQualityHigh                                               = 3,
	EUAGrahpicsQuality__GfxQualityHDRHigh                                            = 4,
	EUAGrahpicsQuality__GfxQualitySuperHigh                                          = 5,
	EUAGrahpicsQuality__GfxQualityNum                                                = 6
};

/// Enum /Script/MFPluginWrapper.EMFLBSLocationAuthorizationStates
/// Size: 0x01 (1 bytes)
enum class EMFLBSLocationAuthorizationStates : uint8_t
{
	EMFLBSLocationAuthorizationStates__AuthorizedWhenInUse                           = 0,
	EMFLBSLocationAuthorizationStates__AuthorizedDenied                              = 1,
	EMFLBSLocationAuthorizationStates__AuthorizedNotDetermined                       = 2
};

/// Enum /Script/MFPluginWrapper.EMFTGALiveLoginSourceType
/// Size: 0x01 (1 bytes)
enum class EMFTGALiveLoginSourceType : uint8_t
{
	EMFTGALiveLoginSourceType__NONE                                                  = 0,
	EMFTGALiveLoginSourceType__QQLogin                                               = 1,
	EMFTGALiveLoginSourceType__WeChatLogin                                           = 2,
	EMFTGALiveLoginSourceType__Tourist                                               = 3
};

/// Enum /Script/MFPluginWrapper.EMFTGALiveSourceType
/// Size: 0x01 (1 bytes)
enum class EMFTGALiveSourceType : uint8_t
{
	EMFTGALiveSourceType__NONE                                                       = 0,
	EMFTGALiveSourceType__ClientClick                                                = 1,
	EMFTGALiveSourceType__ClientPopUps                                               = 2,
	EMFTGALiveSourceType__ClientActivity                                             = 3
};

/// Enum /Script/MFPluginWrapper.EMFTGALiveClientType
/// Size: 0x01 (1 bytes)
enum class EMFTGALiveClientType : uint8_t
{
	EMFTGALiveClientType__NONE                                                       = 0,
	EMFTGALiveClientType__QuitTGALive                                                = 1,
	EMFTGALiveClientType__EnterTGALive                                               = 2,
	EMFTGALiveClientType__InitTGALive                                                = 3
};

/// Enum /Script/MFPluginWrapper.EMFVoiceEvent
/// Size: 0x01 (1 bytes)
enum class EMFVoiceEvent : uint8_t
{
	kEventNoDeviceConnected                                                          = 0,
	kEventHeadsetDisconnected                                                        = 10,
	kEventHeadsetConnected                                                           = 11,
	kEventBluetoothHeadsetDisconnected                                               = 20,
	kEventBluetoothHeadsetConnected                                                  = 21,
	kEventMicStateOpenSucc                                                           = 30,
	kEventMicStateOpenErr                                                            = 31,
	kEventMicStateNoOpen                                                             = 32,
	kEventSpeakerStateOpenSucc                                                       = 40,
	kEventSpeakerStateOpenErr                                                        = 41,
	kEventSpeakerStateNoOpen                                                         = 42,
	kEventAudioInterruptBegin                                                        = 50,
	kEventAudioInterruptEnd                                                          = 51,
	kEventAudioRecoderException                                                      = 52,
	kEventAudioRenderException                                                       = 53,
	kEventPhoneCallPickUp                                                            = 54,
	kEventPhoneCallHangUp                                                            = 55
};

/// Enum /Script/MFPluginWrapper.EMFVoiceSpeechTranslateType
/// Size: 0x01 (1 bytes)
enum class EMFVoiceSpeechTranslateType : uint8_t
{
	EMFVoiceSpeechTranslateType__SPEECH_TRANSLATE_STST                               = 0,
	EMFVoiceSpeechTranslateType__SPEECH_TRANSLATE_STTT                               = 1,
	EMFVoiceSpeechTranslateType__SPEECH_TRANSLATE_STTS                               = 2
};

/// Enum /Script/MFPluginWrapper.EMFVoiceSpeechLanguageType
/// Size: 0x01 (1 bytes)
enum class EMFVoiceSpeechLanguageType : uint8_t
{
	EMFVoiceSpeechLanguageType__SPEECH_LANGUAGE_ZH                                   = 0,
	EMFVoiceSpeechLanguageType__SPEECH_LANGUAGE_EN                                   = 1,
	EMFVoiceSpeechLanguageType__SPEECH_LANGUAGE_JA                                   = 2,
	EMFVoiceSpeechLanguageType__SPEECH_LANGUAGE_KO                                   = 3,
	EMFVoiceSpeechLanguageType__SPEECH_LANGUAGE_DE                                   = 4,
	EMFVoiceSpeechLanguageType__SPEECH_LANGUAGE_FR                                   = 5,
	EMFVoiceSpeechLanguageType__SPEECH_LANGUAGE_ES                                   = 6,
	EMFVoiceSpeechLanguageType__SPEECH_LANGUAGE_IT                                   = 7,
	EMFVoiceSpeechLanguageType__SPEECH_LANGUAGE_TR                                   = 8,
	EMFVoiceSpeechLanguageType__SPEECH_LANGUAGE_RU                                   = 9,
	EMFVoiceSpeechLanguageType__SPEECH_LANGUAGE_PT                                   = 10,
	EMFVoiceSpeechLanguageType__SPEECH_LANGUAGE_VI                                   = 11,
	EMFVoiceSpeechLanguageType__SPEECH_LANGUAGE_ID                                   = 12,
	EMFVoiceSpeechLanguageType__SPEECH_LANGUAGE_MS                                   = 13,
	EMFVoiceSpeechLanguageType__SPEECH_LANGUAGE_TH                                   = 14
};

/// Enum /Script/MFPluginWrapper.EMFVoiceMemberRole
/// Size: 0x01 (1 bytes)
enum class EMFVoiceMemberRole : uint8_t
{
	EMFVoiceMemberRole__kVoiceMemberRoleNone                                         = 0,
	EMFVoiceMemberRole__kVoiceMemberRoleAnchor                                       = 1,
	EMFVoiceMemberRole__kVoiceMemberRoleAudience                                     = 2
};

/// Enum /Script/MFPluginWrapper.EMFVoiceLanguage
/// Size: 0x01 (1 bytes)
enum class EMFVoiceLanguage : uint8_t
{
	EMFVoiceLanguage__kVoiceLanguageChina                                            = 0,
	EMFVoiceLanguage__kVoiceLanguageKorean                                           = 1,
	EMFVoiceLanguage__kVoiceLanguageEnglish                                          = 2,
	EMFVoiceLanguage__kVoiceLanguageJapanese                                         = 3
};

/// Class /Script/MFPluginWrapper.MFPWObject
/// Size: 0x0018 (24 bytes) (0x000028 - 0x000040) align 8 pad: 0x0000
class UMFPWObject : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x18];                                      // 0x0028   (0x0018)  MISSED
};

/// Class /Script/MFPluginWrapper.MFPWPlugin
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UMFPWPlugin : public UMFPWObject
{ 
public:
};

/// Class /Script/MFPluginWrapper.MFACEPlugin
/// Size: 0x0008 (8 bytes) (0x000040 - 0x000048) align 8 pad: 0x0000
class UMFACEPlugin : public UMFPWPlugin
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0040   (0x0008)  MISSED


	/// Functions
	// Function /Script/MFPluginWrapper.MFACEPlugin.ShouldForceQuit
	// bool ShouldForceQuit();                                                                                                  // [0x197ee10] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFACEPlugin.LogOn
	// void LogOn(bool IsLoginSuccessful, FString PlayerId, int32_t ChannelID);                                                 // [0x197c470] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFACEPlugin.LogOff
	// void LogOff();                                                                                                           // [0x197c450] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFACEPlugin.GetPlugin
	// class UMFACEPlugin* GetPlugin(class UObject* WorldContextObject);                                                        // [0x197b770] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFGCloudService
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UMFGCloudService : public UMFPWObject
{ 
public:
};

/// Class /Script/MFPluginWrapper.MFBoxService
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UMFBoxService : public UMFGCloudService
{ 
public:


	/// Functions
	// Function /Script/MFPluginWrapper.MFBoxService.OpenCommunity
	// bool OpenCommunity(FString URL);                                                                                         // [0x197cfe0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFBoxService.OnBoxCallbackUnreal
	// void OnBoxCallbackUnreal(int32_t ClientType, FString Msg);                                                               // [0x197c730] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFBoxService.IsRunning
	// bool IsRunning();                                                                                                        // [0x197bba0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFBoxService.InitCommunity
	// void InitCommunity(FString JsonString);                                                                                  // [0x197ba00] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFComplianceService
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UMFComplianceService : public UMFGCloudService
{ 
public:


	/// Functions
	// Function /Script/MFPluginWrapper.MFComplianceService.ComplianceSetUserProfile
	// bool ComplianceSetUserProfile(FString GameId, FString Openid, FString Token, int32_t ChannelID, FString Region);         // [0x197b240] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFComplianceService.ComplianceSetParentCertificateStatus
	// void ComplianceSetParentCertificateStatus(int32_t status);                                                               // [0x197b1c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFComplianceService.ComplianceSetEUAgreeStatus
	// void ComplianceSetEUAgreeStatus(int32_t status);                                                                         // [0x16b58a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFComplianceService.ComplianceSetAdulthood
	// void ComplianceSetAdulthood(int32_t status);                                                                             // [0x16b58a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFComplianceService.ComplianceSendEmail
	// void ComplianceSendEmail(FString Email, FString userName);                                                               // [0x16b6240] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFComplianceService.ComplianceQueryUserStatus
	// void ComplianceQueryUserStatus();                                                                                        // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFComplianceService.ComplianceQueryIsEEA
	// void ComplianceQueryIsEEA(FString Region);                                                                               // [0x197b0e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFComplianceService.ComplianceCommitBirthday
	// void ComplianceCommitBirthday(int32_t BirthdayYear, int32_t BirthdayMonth, int32_t BirthdayDay);                         // [0x197afe0] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFCTIPayObserver
/// Size: 0x0048 (72 bytes) (0x000040 - 0x000088) align 8 pad: 0x0000
class UMFCTIPayObserver : public UMFPWObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x48];                                      // 0x0040   (0x0048)  MISSED
};

/// Class /Script/MFPluginWrapper.MFCustomerService
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UMFCustomerService : public UMFGCloudService
{ 
public:


	/// Functions
	// Function /Script/MFPluginWrapper.MFCustomerService.LaunchCustomerUI
	// void LaunchCustomerUI(FString LangType, FString Sign, FString Openid, FString GameLevel, FString NickName);              // [0x197bbd0] Native|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFGCloudCommonStatics
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFGCloudCommonStatics : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/MFPluginWrapper.MFGCloudCommonStatics.IsEnableWeGameSDK
	// bool IsEnableWeGameSDK();                                                                                                // [0xfd8a30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCommonStatics.GetNetworkConnectionType
	// FString GetNetworkConnectionType();                                                                                      // [0x197b6f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCommonStatics.GetCarrier
	// FString GetCarrier();                                                                                                    // [0x197b670] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFGCloudCrashObserver
/// Size: 0x00F0 (240 bytes) (0x000040 - 0x000130) align 8 pad: 0x0000
class UMFGCloudCrashObserver : public UMFPWObject
{ 
public:
	unsigned char                                      UnknownData00_1[0xF0];                                      // 0x0040   (0x00F0)  MISSED
};

/// Class /Script/MFPluginWrapper.MFGCloudCrashService
/// Size: 0x00D0 (208 bytes) (0x000040 - 0x000110) align 8 pad: 0x0000
class UMFGCloudCrashService : public UMFGCloudService
{ 
public:
	class UMFGCloudCrashObserver*                      CrashObserver;                                              // 0x0040   (0x0008)  
	unsigned char                                      UnknownData00_7[0xC8];                                      // 0x0048   (0x00C8)  MISSED


	/// Functions
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.UACrastTest
	// void UACrastTest();                                                                                                      // [0x197ee30] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.SetWaterMarkInfo
	// void SetWaterMarkInfo(FString Info);                                                                                     // [0x197e980] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.SetUserValue
	// void SetUserValue(FString Key, FString Value);                                                                           // [0x197e880] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.SetUserId
	// void SetUserId(FString UserId);                                                                                          // [0x197cc50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.ReportWithLogLua
	// void ReportWithLogLua(class UObject* WorldContextObject, FString Name, FString buf);                                     // [0x197d5c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.ReportUserOperation
	// void ReportUserOperation(FString OperationKey, FString OperationValue);                                                  // [0x197d4d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.reportLastOutOfMemory
	// void reportLastOutOfMemory(int32_t Step);                                                                                // [0x197ccf0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.ReportException
	// void ReportException(int32_t Type, FString ExceptionName, FString ExceptionMsg, FString ExceptionStack, TMap<FString, FString>& ExtInfo, int32_t repFlag); // [0x197d230] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.recordGameNeed
	// void recordGameNeed(bool bRead, int32_t Index, int32_t Value, int32_t delVal, FString& reason);                          // [0x197ee50] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.OnStepToGameCall
	// void OnStepToGameCall();                                                                                                 // [0x197cfc0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.OnMatrixiOSHelperDumplastRecord
	// void OnMatrixiOSHelperDumplastRecord(int32_t Param);                                                                     // [0x197ccf0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.OnMatrixiOSHelperCmd
	// void OnMatrixiOSHelperCmd(FString Cmd);                                                                                  // [0x197cc50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.OnMatrixiOSHelper_stopTrackCPU
	// void OnMatrixiOSHelper_stopTrackCPU();                                                                                   // [0xd906a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.OnMatrixiOSHelper_stopDisplayLink
	// void OnMatrixiOSHelper_stopDisplayLink();                                                                                // [0xd906a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.OnMatrixiOSHelper_stopBlockMonitor
	// void OnMatrixiOSHelper_stopBlockMonitor();                                                                               // [0xd906a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.OnMatrixiOSHelper_startTrackCPU
	// void OnMatrixiOSHelper_startTrackCPU();                                                                                  // [0xd906a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.OnMatrixiOSHelper_startDisplayLink
	// void OnMatrixiOSHelper_startDisplayLink(FString strSense);                                                               // [0x197cc50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.OnMatrixiOSHelper_startBlockMonitor
	// void OnMatrixiOSHelper_startBlockMonitor();                                                                              // [0xd906a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.OnMatrixiOSHelper_setShouldSuspendAllThreads
	// void OnMatrixiOSHelper_setShouldSuspendAllThreads(bool shouldSuspendAllThreads);                                         // [0x197b510] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.OnMatrixiOSHelper_setRunloopThreshold
	// void OnMatrixiOSHelper_setRunloopThreshold(int32_t Seconds);                                                             // [0x197ccf0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.OnMatrixiOSHelper_setCustomInfo
	// void OnMatrixiOSHelper_setCustomInfo(int32_t Index, int32_t Value, int32_t Delete);                                      // [0x197ceb0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.OnMatrixiOSHelper_recoverRunloopThreshold
	// void OnMatrixiOSHelper_recoverRunloopThreshold();                                                                        // [0xd906a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.OnMatrixiOSHelper_recoverCPUUsage
	// void OnMatrixiOSHelper_recoverCPUUsage();                                                                                // [0xd906a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.OnMatrixiOSHelper_lowerRunloopThreshold
	// void OnMatrixiOSHelper_lowerRunloopThreshold();                                                                          // [0xd906a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.OnMatrixiOSHelper_lowerCPUUsage
	// void OnMatrixiOSHelper_lowerCPUUsage();                                                                                  // [0xd906a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.OnMatrixiOSHelper_isBackgroundCPUTooSmall
	// void OnMatrixiOSHelper_isBackgroundCPUTooSmall();                                                                        // [0xd906a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.OnMatrixiOSHelper_Init
	// void OnMatrixiOSHelper_Init();                                                                                           // [0xd906a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.OnMatrixiOSHelper_generateLiveReportWithDumpType
	// void OnMatrixiOSHelper_generateLiveReportWithDumpType(int32_t dumpType1, FString reason, bool bSelfDefined);             // [0x197cd80] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.OnConsoleDumphitches
	// void OnConsoleDumphitches(int32_t from, bool bStart);                                                                    // [0x197c830] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.LogMonitorInfo
	// void LogMonitorInfo(FString Info);                                                                                       // [0x197c360] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.LogInfo
	// void LogInfo(int32_t Level, FString Tag, FString Log);                                                                   // [0x197c220] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.is_RUNNING_WITH_ASAN
	// bool is_RUNNING_WITH_ASAN();                                                                                             // [0x1365460] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.GetWaterMarkInfo
	// FString GetWaterMarkInfo();                                                                                              // [0x197b8d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudCrashService.ConsoleDumphitches
	// void ConsoleDumphitches(bool bStart);                                                                                    // [0x197b510] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFGCloudDolphinService
/// Size: 0x0060 (96 bytes) (0x000040 - 0x0000A0) align 8 pad: 0x0000
class UMFGCloudDolphinService : public UMFGCloudService
{ 
public:
	unsigned char                                      UnknownData00_1[0x60];                                      // 0x0040   (0x0060)  MISSED


	/// Functions
	// Function /Script/MFPluginWrapper.MFGCloudDolphinService.SetPreDownloadDir
	// void SetPreDownloadDir(FString InDir);                                                                                   // [0x197e7e0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudDolphinService.SetGrayInfo
	// void SetGrayInfo(FString InUserID, FString InWorldID);                                                                   // [0x197e6e0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudDolphinService.OnNoticeInstallApk
	// void OnNoticeInstallApk(FString InApkPath, bool InResult);                                                               // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudDolphinService.OnDolphinVersionInfoImplement
	// void OnDolphinVersionInfoImplement(bool isAppUpdating, bool isNeedUpdating, bool isForcedUpdating, FString InGameVersion, int64_t NeedDownloadSize, FString userDefineStr); // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudDolphinService.OnDolphinStageChanged
	// void OnDolphinStageChanged(int32_t InNewStage);                                                                          // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudDolphinService.OnDolphinRestart
	// void OnDolphinRestart();                                                                                                 // [0x197c990] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudDolphinService.OnDolphinProgress
	// void OnDolphinProgress(int64_t TotalSize, int64_t currentSize);                                                          // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudDolphinService.OnDolphinCallBackSuccess
	// void OnDolphinCallBackSuccess();                                                                                         // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudDolphinService.OnDolphinCallBackError
	// void OnDolphinCallBackError(int32_t VersionStage, int32_t ErrorCode);                                                    // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudDolphinService.OnContinueDolphin
	// void OnContinueDolphin(bool bContinue);                                                                                  // [0x197c900] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudDolphinService.OnCancelDolphin
	// void OnCancelDolphin();                                                                                                  // [0x197c810] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudDolphinService.InstallApk
	// bool InstallApk(FString InApkPath);                                                                                      // [0x197baf0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudDolphinService.InAppInstalled
	// bool InAppInstalled(FString InPackageName);                                                                              // [0x197b950] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudDolphinService.GetPreDownloadDir
	// FString GetPreDownloadDir();                                                                                             // [0x197b850] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudDolphinService.GetCacheDir
	// FString GetCacheDir();                                                                                                   // [0x197b5f0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudDolphinService.CheckUpdate
	// void CheckUpdate(int32_t InUpdateType, int32_t InChannelId, FString InAppVersion, FString InAssetVersion, FString InRemoteURL, FString InUpdateDir, bool InFixupMode); // [0x197ac80] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFGCloudFriendObserver
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UMFGCloudFriendObserver : public UMFPWObject
{ 
public:
};

/// Class /Script/MFPluginWrapper.MFGCloudFriendService
/// Size: 0x00C8 (200 bytes) (0x000040 - 0x000108) align 8 pad: 0x0000
class UMFGCloudFriendService : public UMFGCloudService
{ 
public:
	unsigned char                                      UnknownData00_3[0xA0];                                      // 0x0040   (0x00A0)  MISSED
	class UImage*                                      Image;                                                      // 0x00E0   (0x0008)  
	class UTexture2DDynamic*                           InDyTexture;                                                // 0x00E8   (0x0008)  
	unsigned char                                      UnknownData01_6[0x10];                                      // 0x00F0   (0x0010)  MISSED
	class UMFGCloudFriendObserver*                     MFGCloudFriendObserver;                                     // 0x0100   (0x0008)  


	/// Functions
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.ShareQQZone
	// void ShareQQZone(FString ThumbPath, FString Link);                                                                       // [0x197dd50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.ShareOversea
	// bool ShareOversea(FString Channel, int32_t shareType, FString Link, FString img, FString desc);                          // [0x197ec20] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.ShareMiniApp
	// void ShareMiniApp(FString ExtralJson, FString ThumbPath, FString Link, FString Title, FString desc);                     // [0x197ea20] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.ShareLink
	// void ShareLink(FString Channel, FString Link, FString Thumb, FString Title, FString desc);                               // [0x197ea20] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.ShareImgWeChat
	// void ShareImgWeChat(FString ImgPath);                                                                                    // [0x197cc50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.ShareImgQQ
	// void ShareImgQQ(FString ImgPath);                                                                                        // [0x197cc50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.SendVLog
	// void SendVLog(FString MediaPath);                                                                                        // [0x197cc50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.SendText
	// void SendText(FString Channel, FString User, FString desc, FString extraJson);                                           // [0x197e540] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.SendResultImg
	// void SendResultImg(int32_t Window, FString ThumbPath, FString img);                                                      // [0x197e400] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.SendMiniApp
	// void SendMiniApp(FString extraJson, FString Channel, FString Thumb, FString Link, FString Title, FString desc, FString MediaPath, FString User); // [0x197e100] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.SendLink
	// void SendLink(FString Channel, FString User, FString Link, FString Thumb, FString Openid, FString Title, FString desc);  // [0x197de50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.SendInviteSilent
	// void SendInviteSilent(FString ImgPath, FString User);                                                                    // [0x197dd50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.SendInvite
	// void SendInvite(FString ImgPath, int32_t Type, FString extraJson, FString Link, FString Channel, FString desc, FString User, FString Title); // [0x197da60] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.SendImgWeChat
	// void SendImgWeChat(FString ImgPath, FString User, FString ThumbPath);                                                    // [0x197d0e0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.SendImgQQ
	// void SendImgQQ(FString ImgPath, FString User, FString ThumbPath);                                                        // [0x197d0e0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.ScreenShotEvent
	// void ScreenShotEvent(bool IsWindow, bool SavePhoto);                                                                     // [0x197d990] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.SaveResultImg
	// void SaveResultImg(int32_t X, int32_t Y, int32_t Width, int32_t Height, int32_t Window);                                 // [0x197d7f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.RobotOpen
	// void RobotOpen(bool IsOpen);                                                                                             // [0x197d760] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.RequestStoragePermissions
	// void RequestStoragePermissions();                                                                                        // [0xd906a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.PullUpMiniApp
	// void PullUpMiniApp(FString MediaPath, FString ExtralJson, FString Channel);                                              // [0x197d0e0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.OnShare
	// void OnShare();                                                                                                          // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.OnScreenShotPanel
	// void OnScreenShotPanel();                                                                                                // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.OnScreenShotPandora
	// void OnScreenShotPandora(FString ImgPath);                                                                               // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.OnLoadUrlFinish
	// void OnLoadUrlFinish(FString miniPath, FString bgPath, int32_t bErWeiMa, float Scale);                                   // [0x197cad0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.OnIOSPhotoPermissionsRequestReturn
	// void OnIOSPhotoPermissionsRequestReturn(bool status);                                                                    // [0x197ca40] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.OnIOSPhotoPermissionsCallback
	// void OnIOSPhotoPermissionsCallback(bool status);                                                                         // [0x197c9b0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.OnImageFinish
	// void OnImageFinish(class UObject* Image1);                                                                               // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.OnAndroidExternalStagePermissionRequestReturn
	// void OnAndroidExternalStagePermissionRequestReturn(TArray<FString>& Permissions, TArray<bool>& GrantResults);            // [0x197c5f0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.LoadLogoFinish
	// bool LoadLogoFinish(FString Path);                                                                                       // [0x197c120] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.LoadImageFromScreenShot
	// void LoadImageFromScreenShot(class UImage* img, int32_t Type, bool specifyRect, int32_t minX, int32_t minY, int32_t maxX, int32_t maxY); // [0x197bf00] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.GenerateLogoImg
	// bool GenerateLogoImg();                                                                                                  // [0x197b5c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.DestroyDynamicImage
	// void DestroyDynamicImage();                                                                                              // [0x197b5a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.CheckStoragePermission
	// int32_t CheckStoragePermission();                                                                                        // [0x197ac50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.BindResult
	// void BindResult(int32_t RetCode);                                                                                        // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudFriendService.Bind
	// bool Bind(int32_t channelType, FString subChannel, FString extraJson);                                                   // [0x197aa90] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFGCloudGroupObserver
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UMFGCloudGroupObserver : public UMFPWObject
{ 
public:
};

/// Class /Script/MFPluginWrapper.MFGCloudGroupService
/// Size: 0x0008 (8 bytes) (0x000040 - 0x000048) align 8 pad: 0x0000
class UMFGCloudGroupService : public UMFGCloudService
{ 
public:
	class UMFGCloudGroupObserver*                      MFGCloudGroupObserver;                                      // 0x0040   (0x0008)  


	/// Functions
	// Function /Script/MFPluginWrapper.MFGCloudGroupService.UnbindGroup
	// void UnbindGroup(FString Channel, FString unionID, FString unionName, FString ZoneId, FString RoleId, FString AreaID);   // [0x1982850] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudGroupService.SendGroupMessage
	// void SendGroupMessage(FString Channel, FString unionID, FString Link, FString extraJson, FString AreaID, FString Title, FString desc); // [0x197de50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudGroupService.RemindToBindGroup
	// void RemindToBindGroup(FString unionID, FString ZoneId, FString RoleId, FString RoleName, FString leaderOpenID, FString leaderRoleID, FString AreaID); // [0x197de50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudGroupService.OnUnBindGroup
	// void OnUnBindGroup(int32_t status, int32_t ThirdCode, FString ThirdMsg);                                                 // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudGroupService.OnRemindToBindGroup
	// void OnRemindToBindGroup(int32_t status, int32_t ThirdCode, FString ThirdMsg);                                           // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudGroupService.OnJoinGroup
	// void OnJoinGroup(int32_t status, int32_t ThirdCode, FString ThirdMsg);                                                   // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudGroupService.OnGetGroupState
	// void OnGetGroupState(int32_t status, FString GroupID);                                                                   // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudGroupService.OnGetGroupRelation
	// void OnGetGroupRelation(int32_t status);                                                                                 // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudGroupService.OnCreateGroup
	// void OnCreateGroup(int32_t status, int32_t ThirdCode, FString ThirdMsg);                                                 // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudGroupService.JoinGroup
	// void JoinGroup(FString Channel, FString unionID, FString ZoneId, FString RoleId, FString GroupID, FString AreaID);       // [0x1982850] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudGroupService.GetGroupState
	// void GetGroupState(FString Channel, FString unionID, FString ZoneId, FString AreaID);                                    // [0x197e540] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudGroupService.GetGroupRelation
	// void GetGroupRelation(FString Channel, FString groupIDOrUnionID, FString AreaID);                                        // [0x197d0e0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudGroupService.CreateGroup
	// void CreateGroup(FString Channel, FString unionID, FString unionName, FString RoleName, FString ZoneId, FString RoleId, FString AreaID); // [0x197de50] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFGCloudLoginObserver
/// Size: 0x0010 (16 bytes) (0x000040 - 0x000050) align 8 pad: 0x0000
class UMFGCloudLoginObserver : public UMFPWObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x10];                                      // 0x0040   (0x0010)  MISSED
};

/// Class /Script/MFPluginWrapper.MFGCloudLoginService
/// Size: 0x0078 (120 bytes) (0x000040 - 0x0000B8) align 8 pad: 0x0000
class UMFGCloudLoginService : public UMFGCloudService
{ 
public:
	class UMFGCloudLoginObserver*                      LoginObserver;                                              // 0x0040   (0x0008)  
	class UMFIntlLoginObserver*                        IntlLoginObserver;                                          // 0x0048   (0x0008)  
	SDK_UNDEFINED(16,644) /* FMulticastInlineDelegate */ __um(HttpPostDelegate);                                   // 0x0050   (0x0010)  
	unsigned char                                      UnknownData00_7[0x58];                                      // 0x0060   (0x0058)  MISSED


	/// Functions
	// Function /Script/MFPluginWrapper.MFGCloudLoginService.SwitchUser
	// void SwitchUser(bool bSwitch);                                                                                           // [0x19832d0] Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudLoginService.SetLoginServiceSubClass
	// bool SetLoginServiceSubClass(class UClass* InSubClass);                                                                  // [0x1983160] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudLoginService.OnWakeUpProc
	// void OnWakeUpProc(int32_t RetCode, FString extraJson);                                                                   // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudLoginService.OnLIEventCallback
	// void OnLIEventCallback(int32_t Event);                                                                                   // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudLoginService.OnINTLAccountResult
	// void OnINTLAccountResult(int32_t RetCode, int32_t ThirdCode, int32_t methodId, FString userName, FString uid, int32_t isRegister, int32_t isReceiveEmail, int32_t isSetPassword); // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudLoginService.OnAccountLoginProc
	// void OnAccountLoginProc(int32_t Result, int32_t ThirdCode, FString reason, int32_t channelType, FString strOpenID, FString strUserID, FString strTokenAccess, FString strTokenRefresh, FString strTokenPay, FString strPF, FString strPFKey, FString strSTKey, FString regChannel, int32_t FirstLogin, FString ChannelInfo, FString extraJson, int32_t DeleteAccountStatus); // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudLoginService.Logout
	// void Logout();                                                                                                           // [0x19820f0] Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudLoginService.Login
	// bool Login(int32_t channelType, FString fakeOpenID, FString subChannel, FString extraJson);                              // [0x1982ab0] Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudLoginService.LIAuthResult
	// void LIAuthResult(int32_t RetCode, int32_t ThirdCode);                                                                   // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudLoginService.HttpPostRequest
	// void HttpPostRequest(FString URL, FString StrContent);                                                                   // [0x1982670] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudLoginService.HttpPostDelegate__DelegateSignature
	// void HttpPostDelegate__DelegateSignature(FString RspContent);                                                            // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/MFPluginWrapper.MFGCloudLoginService.GetLoginRet
	// void GetLoginRet();                                                                                                      // [0xd909a0] Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudLoginService.GetCachedToken
	// FString GetCachedToken();                                                                                                // [0x16a3ff0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudLoginService.GetCachedSigKey
	// FString GetCachedSigKey();                                                                                               // [0x19822b0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudLoginService.GetCachedOpenID
	// FString GetCachedOpenID();                                                                                               // [0x19821f0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudLoginService.GetCachedLoginChannel
	// int32_t GetCachedLoginChannel();                                                                                         // [0x19821d0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudLoginService.GetCachedHeadURL
	// FString GetCachedHeadURL();                                                                                              // [0x1982110] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudLoginService.BindResult
	// void BindResult(int32_t RetCode);                                                                                        // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudLoginService.Bind
	// bool Bind(int32_t channelType, FString subChannel, FString extraJson);                                                   // [0x19818c0] Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudLoginService.AutoLogin
	// void AutoLogin(FString fakeOpenID);                                                                                      // [0x19817d0] Native|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFGCloudMessageHandler
/// Size: 0x0008 (8 bytes) (0x000028 - 0x000030) align 8 pad: 0x0000
class UMFGCloudMessageHandler : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0028   (0x0008)  MISSED


	/// Functions
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.UnInitialize
	// void UnInitialize();                                                                                                     // [0x19833f0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.Tick
	// void Tick(float DeltaSeconds);                                                                                           // [0x1983360] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.SetSendPkgHeaderZoneID
	// void SetSendPkgHeaderZoneID(FString ID);                                                                                 // [0x1983230] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.SetDevUrl
	// void SetDevUrl(FString Ip, FString Port);                                                                                // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.SetClientType
	// void SetClientType(int32_t ClientType);                                                                                  // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.RequestLogin
	// void RequestLogin(FString inPlayerName, bool isReconnected, float overTimeSeconds);                                      // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.RelayConnect
	// void RelayConnect();                                                                                                     // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.OnWaitingReliableNumChanged
	// void OnWaitingReliableNumChanged(int32_t NewWaitingReliableNum);                                                         // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.OnStateChangedProc
	// void OnStateChangedProc(int32_t connectorState, int32_t ErrorCode, int32_t extend1, int32_t extend2);                    // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.OnRelayConnectedProc
	// void OnRelayConnectedProc(int32_t ErrorCode);                                                                            // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.OnOverTime
	// void OnOverTime(int32_t MsgID, int32_t SerialID, int32_t overtimes, bool isShowError);                                   // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.OnDisconnectProc
	// void OnDisconnectProc(int32_t ErrorCode);                                                                                // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.OnDataRecvedProc
	// void OnDataRecvedProc(int32_t ErrorCode);                                                                                // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.OnConnectorInvalid
	// void OnConnectorInvalid();                                                                                               // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.OnConnected
	// void OnConnected(int32_t ErrorCode);                                                                                     // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.OnAddictionNotify
	// void OnAddictionNotify(int32_t Messageid, FString Title, FString Content);                                               // [0x1982e60] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.OnAcquiredWeGameToken
	// void OnAcquiredWeGameToken(FString PlayerId, FString PlayerName, FString Token);                                         // [0x1982d10] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.IsConnectedTest
	// bool IsConnectedTest();                                                                                                  // [0x1982820] Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.IsConnected
	// bool IsConnected();                                                                                                      // [0x19827f0] Native|Public        
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.HasAcquiredWeGameToken
	// bool HasAcquiredWeGameToken();                                                                                           // [0x1982640] Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.GetService
	// class UMFGCloudService* GetService();                                                                                    // [0x1982610] Native|Public        
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.GetIP
	// FString GetIP();                                                                                                         // [0x1982470] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.GetConnectInfo
	// FString GetConnectInfo();                                                                                                // [0x1982370] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.Disconnect
	// void Disconnect();                                                                                                       // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.DevConnect
	// bool DevConnect(int32_t Channel, FString uin, FString pwd, TArray<FString>& urlList, bool Clear);                        // [0x3a75280] Event|Public|HasOutParms|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudMessageHandler.Connect
	// bool Connect(int32_t Channel, TArray<FString>& urlList, bool Clear, FString Openid, FString openKey, FString ExtInfo);   // [0x3a75280] Event|Public|HasOutParms|BlueprintEvent 
};

/// Class /Script/MFPluginWrapper.MFGCloudMessageHandlerAce
/// Size: 0x0000 (0 bytes) (0x000030 - 0x000030) align 8 pad: 0x0000
class UMFGCloudMessageHandlerAce : public UMFGCloudMessageHandler
{ 
public:
};

/// Class /Script/MFPluginWrapper.MFGCloudMessageHandlerChildTss
/// Size: 0x0030 (48 bytes) (0x000030 - 0x000060) align 8 pad: 0x0000
class UMFGCloudMessageHandlerChildTss : public UMFGCloudMessageHandler
{ 
public:
	unsigned char                                      UnknownData00_1[0x30];                                      // 0x0030   (0x0030)  MISSED
};

/// Class /Script/MFPluginWrapper.MFGCloudMessageObserver
/// Size: 0x0120 (288 bytes) (0x000040 - 0x000160) align 8 pad: 0x0000
class UMFGCloudMessageObserver : public UMFPWObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x20];                                      // 0x0040   (0x0020)  MISSED
	class UMFPWMessageHeader*                          SendPkgHeader;                                              // 0x0060   (0x0008)  
	class UMFPWMessageHeader*                          RecvPkgHeader;                                              // 0x0068   (0x0008)  
	unsigned char                                      UnknownData01_6[0x91];                                      // 0x0070   (0x0091)  MISSED
	bool                                               IsDebug;                                                    // 0x0101   (0x0001)  
	bool                                               IsNetworkOptimizationOn;                                    // 0x0102   (0x0001)  
	unsigned char                                      UnknownData02_7[0x5D];                                      // 0x0103   (0x005D)  MISSED
};

/// Class /Script/MFPluginWrapper.MFGCloudMessageService
/// Size: 0x0018 (24 bytes) (0x000040 - 0x000058) align 8 pad: 0x0000
class UMFGCloudMessageService : public UMFGCloudService
{ 
public:
	TArray<class UMFGCloudMessageHandler*>             MsgHandlerArr;                                              // 0x0040   (0x0010)  
	class UMFGCloudMessageObserver*                    ConnectorObserver;                                          // 0x0050   (0x0008)  


	/// Functions
	// Function /Script/MFPluginWrapper.MFGCloudMessageService.UnRegisterMessageHandlerByClass
	// bool UnRegisterMessageHandlerByClass(class UClass* InClass);                                                             // [0x1983430] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudMessageService.UnRegisterAllMessageHandler
	// void UnRegisterAllMessageHandler();                                                                                      // [0x1983410] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudMessageService.SetRecvMessage
	// void SetRecvMessage(bool recvMsg);                                                                                       // [0xdaab70] Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudMessageService.SetKickOffState
	// void SetKickOffState(bool IsKickOff);                                                                                    // [0x19830d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudMessageService.SetClientType
	// void SetClientType(int32_t ClientType);                                                                                  // [0x1983040] Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudMessageService.RelayConnect
	// void RelayConnect();                                                                                                     // [0xd90980] Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudMessageService.RegisterMessageHandlerByClass
	// class UMFGCloudMessageHandler* RegisterMessageHandlerByClass(class UClass* InClass);                                     // [0x1982fa0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudMessageService.ManualReconnect
	// bool ManualReconnect();                                                                                                  // [0x1982640] Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudMessageService.GetMsgHandlerByType
	// class UMFGCloudMessageHandler* GetMsgHandlerByType(class UClass* classType);                                             // [0x1982570] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudMessageService.GetIP
	// FString GetIP();                                                                                                         // [0x19824f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudMessageService.GetConnectInfo
	// FString GetConnectInfo();                                                                                                // [0x19823f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudMessageService.Disconnect
	// void Disconnect();                                                                                                       // [0x19820f0] Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudMessageService.DevConnect
	// bool DevConnect(int32_t Channel, FString uin, FString pwd, TArray<FString>& urlList, bool Clear);                        // [0x1981e60] Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudMessageService.Connect
	// bool Connect(int32_t Channel, TArray<FString>& urlList, bool Clear, FString Openid, FString openKey, FString ExtInfo);   // [0x1981b30] Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudMessageService.ClipPendingResponseArr
	// void ClipPendingResponseArr(bool IsReconnect);                                                                           // [0x1981aa0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudMessageService.ClearAckID
	// void ClearAckID();                                                                                                       // [0x1981a80] Native|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFGCloudNetWorkStateObserver
/// Size: 0x0018 (24 bytes) (0x000040 - 0x000058) align 8 pad: 0x0000
class UMFGCloudNetWorkStateObserver : public UMFPWObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x18];                                      // 0x0040   (0x0018)  MISSED
};

/// Class /Script/MFPluginWrapper.MFGCloudNetWorkStateService
/// Size: 0x0008 (8 bytes) (0x000040 - 0x000048) align 8 pad: 0x0000
class UMFGCloudNetWorkStateService : public UMFGCloudService
{ 
public:
	class UMFGCloudNetWorkStateObserver*               NetworkObserver;                                            // 0x0040   (0x0008)  


	/// Functions
	// Function /Script/MFPluginWrapper.MFGCloudNetWorkStateService.OnNetworkStateChanged
	// void OnNetworkStateChanged(int32_t State);                                                                               // [0x3a75280] Event|Public|BlueprintEvent 
};

/// Struct /Script/MFPluginWrapper.MSDKNoticeTextInfo
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 8 pad: 0x0000
struct FMSDKNoticeTextInfo
{ 
	FString                                            NoticeTitle;                                                // 0x0000   (0x0010)  
	FString                                            NoticeContent;                                              // 0x0010   (0x0010)  
	FString                                            NoticeRedirectUrl;                                          // 0x0020   (0x0010)  
};

/// Struct /Script/MFPluginWrapper.MSDKNoticePictureInfo
/// Size: 0x0048 (72 bytes) (0x000000 - 0x000048) align 8 pad: 0x0000
struct FMSDKNoticePictureInfo
{ 
	FString                                            NoticePicUrl;                                               // 0x0000   (0x0010)  
	FString                                            NoticePicHashcode;                                          // 0x0010   (0x0010)  
	FString                                            NoticePicTitle;                                             // 0x0020   (0x0010)  
	FString                                            NoticePicSize;                                              // 0x0030   (0x0010)  
	int32_t                                            ScreenDir;                                                  // 0x0040   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0044   (0x0004)  MISSED
};

/// Struct /Script/MFPluginWrapper.MSDKNoticeInfo
/// Size: 0x00A0 (160 bytes) (0x000000 - 0x0000A0) align 8 pad: 0x0000
struct FMSDKNoticeInfo
{ 
	int32_t                                            NoticeID;                                                   // 0x0000   (0x0004)  
	int32_t                                            NoticeType;                                                 // 0x0004   (0x0004)  
	FString                                            NoticeGroup;                                                // 0x0008   (0x0010)  
	int32_t                                            BeginTime;                                                  // 0x0018   (0x0004)  
	int32_t                                            EndTime;                                                    // 0x001C   (0x0004)  
	int32_t                                            UpdateTime;                                                 // 0x0020   (0x0004)  
	int32_t                                            Order;                                                      // 0x0024   (0x0004)  
	int32_t                                            ContentType;                                                // 0x0028   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x002C   (0x0004)  MISSED
	FString                                            Language;                                                   // 0x0030   (0x0010)  
	FMSDKNoticeTextInfo                                TextInfo;                                                   // 0x0040   (0x0030)  
	TArray<FMSDKNoticePictureInfo>                     PicUrlList;                                                 // 0x0070   (0x0010)  
	FString                                            WebUrl;                                                     // 0x0080   (0x0010)  
	FString                                            extraJson;                                                  // 0x0090   (0x0010)  
};

/// Struct /Script/MFPluginWrapper.MSDKNoticeReturnData
/// Size: 0x0060 (96 bytes) (0x000000 - 0x000060) align 8 pad: 0x0000
struct FMSDKNoticeReturnData
{ 
	int32_t                                            MethodNameID;                                               // 0x0000   (0x0004)  
	int32_t                                            RetCode;                                                    // 0x0004   (0x0004)  
	FString                                            RetMsg;                                                     // 0x0008   (0x0010)  
	int32_t                                            ThirdCode;                                                  // 0x0018   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x001C   (0x0004)  MISSED
	FString                                            ThirdMsg;                                                   // 0x0020   (0x0010)  
	FString                                            extraJson;                                                  // 0x0030   (0x0010)  
	FString                                            RequestID;                                                  // 0x0040   (0x0010)  
	TArray<FMSDKNoticeInfo>                            NoticeInfoList;                                             // 0x0050   (0x0010)  
};

/// Class /Script/MFPluginWrapper.MFGCloudNotice
/// Size: 0x00C0 (192 bytes) (0x000040 - 0x000100) align 8 pad: 0x0000
class UMFGCloudNotice : public UMFGCloudService
{ 
public:
	SDK_UNDEFINED(16,645) /* FDelegateProperty */      __um(OnLoadNoticeCompleted);                                // 0x0040   (0x0010)  
	FMSDKNoticeReturnData                              LastReturnData;                                             // 0x0050   (0x0060)  
	FString                                            CachedGroup;                                                // 0x00B0   (0x0010)  
	FString                                            CachedLanguage;                                             // 0x00C0   (0x0010)  
	FString                                            CachedRegion;                                               // 0x00D0   (0x0010)  
	FString                                            CachedPartition;                                            // 0x00E0   (0x0010)  
	FString                                            CachedExtra;                                                // 0x00F0   (0x0010)  


	/// Functions
	// Function /Script/MFPluginWrapper.MFGCloudNotice.OnNotificationPermissionsGrantedDynamic
	// void OnNotificationPermissionsGrantedDynamic(bool status);                                                               // [0x1987c90] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudNotice.OnLoadNoticeCompleted__DelegateSignature
	// void OnLoadNoticeCompleted__DelegateSignature();                                                                         // [0x3a75280] Public|Delegate      
	// Function /Script/MFPluginWrapper.MFGCloudNotice.LoadNotice
	// FString LoadNotice(FString InGroup, FString InLanguage, FString InRegion, FString InPartition, FString InExtra);         // [0x1987a40] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFGCloudPlugin
/// Size: 0x0050 (80 bytes) (0x000040 - 0x000090) align 8 pad: 0x0000
class UMFGCloudPlugin : public UMFPWPlugin
{ 
public:
	SDK_UNDEFINED(80,646) /* TMap<UClass*, UMFGCloudService*> */ __um(ServiceMap);                                 // 0x0040   (0x0050)  


	/// Functions
	// Function /Script/MFPluginWrapper.MFGCloudPlugin.GetGCloudXGService
	// class UMFGCloudXGService* GetGCloudXGService();                                                                          // [0x1987200] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPlugin.GetGCloudToolsService
	// class UMFGCloudToolsService* GetGCloudToolsService();                                                                    // [0x19871d0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudPlugin.GetGCloudPufferService
	// class UMFGCloudPufferService* GetGCloudPufferService();                                                                  // [0x19871a0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudPlugin.GetGCloudPlugin
	// class UMFGCloudPlugin* GetGCloudPlugin(class UObject* WorldContextObject);                                               // [0x19870c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPlugin.GetGCloudNoticeService
	// class UMFGCloudNotice* GetGCloudNoticeService();                                                                         // [0x1987090] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudPlugin.GetGCloudMessageService
	// class UMFGCloudMessageService* GetGCloudMessageService();                                                                // [0x1987060] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPlugin.GetGCloudLoginService
	// class UMFGCloudLoginService* GetGCloudLoginService();                                                                    // [0x1987030] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudPlugin.GetGCloudGroupService
	// class UMFGCloudGroupService* GetGCloudGroupService();                                                                    // [0x1987000] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPlugin.GetGCloudFriendService
	// class UMFGCloudFriendService* GetGCloudFriendService();                                                                  // [0x1986fd0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPlugin.GetGCloudDolphinService
	// class UMFGCloudDolphinService* GetGCloudDolphinService();                                                                // [0x1986fa0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudPlugin.GetGCloudCrashService
	// class UMFGCloudCrashService* GetGCloudCrashService();                                                                    // [0x1986f70] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPlugin.GetCustomerService
	// class UMFCustomerService* GetCustomerService();                                                                          // [0x1986be0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudPlugin.AddServiceByClass
	// class UMFGCloudService* AddServiceByClass(class UClass* InClass);                                                        // [0x1986310] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFGCloudPufferService
/// Size: 0x0120 (288 bytes) (0x000040 - 0x000160) align 8 pad: 0x0000
class UMFGCloudPufferService : public UMFGCloudService
{ 
public:
	unsigned char                                      UnknownData00_1[0x120];                                     // 0x0040   (0x0120)  MISSED


	/// Functions
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.StartRestoreFiles
	// int64_t StartRestoreFiles(int32_t Priority);                                                                             // [0x19884c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.SetTaskPriority
	// bool SetTaskPriority(int64_t TaskId, int32_t Priority);                                                                  // [0x19883f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.SetImmDLMaxTask
	// bool SetImmDLMaxTask(int32_t InTaskNum);                                                                                 // [0x1988350] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.SetImmDLMaxSpeed
	// bool SetImmDLMaxSpeed(int32_t InMaxSpeed);                                                                               // [0x19882b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.SaveTaskProgress
	// void SaveTaskProgress(FString InTaskName, int32_t InNowSize, int32_t InTotalSize);                                       // [0x1988190] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.ResumeTask
	// bool ResumeTask(int64_t TaskId);                                                                                         // [0x19880f0] Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.ResumeAllTask
	// int32_t ResumeAllTask();                                                                                                 // [0x19880c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.RestartPuffer
	// bool RestartPuffer(int32_t InRestoreFlag);                                                                               // [0x1988020] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.RemoveTask
	// bool RemoveTask(int64_t InTaskID);                                                                                       // [0x1987f80] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.RemoveAllTask
	// int32_t RemoveAllTask();                                                                                                 // [0x1987f50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.ReceiveTick
	// void ReceiveTick(float InDeltaTime);                                                                                     // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.ReadCachedTotalSizeByName
	// int32_t ReadCachedTotalSizeByName(FString InTaskName);                                                                   // [0x1987ea0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.ReadCachedCurrentSizeByName
	// int32_t ReadCachedCurrentSizeByName(FString InTaskName);                                                                 // [0x1987df0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.PauseTask
	// bool PauseTask(int64_t TaskId);                                                                                          // [0x1987d50] Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.PauseAllTask
	// int32_t PauseAllTask();                                                                                                  // [0x1987d20] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.OnStageChanged
	// void OnStageChanged(int32_t InOldStage, int32_t InNewStage);                                                             // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.OnRestoreReturn
	// void OnRestoreReturn(bool IsSuccess, int32_t ErrorCode);                                                                 // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.OnRestoreProgress
	// void OnRestoreProgress(int32_t Stage, int32_t NowSize, int32_t TotalSize);                                               // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.OnPufferFileListItem
	// void OnPufferFileListItem(FString InFilename, int32_t inState);                                                          // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.OnInitReturn
	// void OnInitReturn(bool IsSuccess, int32_t ErrorCode);                                                                    // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.OnInitProgress
	// void OnInitProgress(int32_t Stage, int32_t NowSize, int32_t TotalSize);                                                  // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.OnDownloadReturn
	// void OnDownloadReturn(int64_t TaskId, int32_t fileID, bool IsSuccess, int32_t ErrorCode);                                // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.OnDownloadProgress
	// void OnDownloadProgress(int64_t TaskId, int64_t NowSize, int64_t TotalSize);                                             // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.OnDownloadIOSBackgroundDone
	// void OnDownloadIOSBackgroundDone();                                                                                      // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.OnDownloadBatchReturn
	// void OnDownloadBatchReturn(int64_t batchTaskId, int32_t fileID, bool IsSuccess, int32_t ErrorCode, int32_t batchType, FString strRet); // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.OnDownloadBatchProgress
	// void OnDownloadBatchProgress(int64_t batchTaskId, int64_t NowSize, int64_t TotalSize);                                   // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.IsInitDone
	// bool IsInitDone();                                                                                                       // [0x1987a10] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.IsFileReadyByName
	// bool IsFileReadyByName(FString InFile);                                                                                  // [0x1987960] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.IsFileReady
	// bool IsFileReady(int64_t InFileID);                                                                                      // [0x19878c0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.IsBatchDirReady
	// bool IsBatchDirReady(FString Dir, bool blSubDir, int32_t& nTotal, int32_t& nReady, int32_t& nNotReady);                  // [0x19876a0] Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.InitPufferConfig
	// bool InitPufferConfig(FPufferInitConfigData& InParam);                                                                   // [0x1987530] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.GetTaskState
	// EPufferTaskState GetTaskState(int32_t InTaskID);                                                                         // [0x1987490] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.GetTaskInfoByTaskName
	// FPufferTaskInfo GetTaskInfoByTaskName(FString InTaskName);                                                               // [0x19873c0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.GetTaskInfoByTaskID
	// FPufferTaskInfo GetTaskInfoByTaskID(int32_t InTaskID);                                                                   // [0x1987310] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.GetRestoreTaskName
	// FString GetRestoreTaskName();                                                                                            // [0x1987290] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.GetRestoreTaskID
	// int32_t GetRestoreTaskID();                                                                                              // [0x1987260] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.GetLastProgressState
	// int32_t GetLastProgressState();                                                                                          // [0x1987230] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.GetFileSizeCompressed
	// int32_t GetFileSizeCompressed(int64_t fileID);                                                                           // [0x1986ed0] Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.GetFileMd5
	// FString GetFileMd5(int32_t fileID);                                                                                      // [0x1986df0] Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.GetFileId
	// int64_t GetFileId(FString InFile);                                                                                       // [0x1986d40] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.GetDownloadingTaskInfoList
	// TArray<FPufferTaskInfo> GetDownloadingTaskInfoList(bool bIncludePaused);                                                 // [0x1986c10] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.GetCurrentSpeed
	// float GetCurrentSpeed();                                                                                                 // [0x1986bb0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.GetCurrentDownloadingTaskNum
	// int32_t GetCurrentDownloadingTaskNum(bool bIncludePaused);                                                               // [0x1986b10] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.GetBatchDirSizeCompressed
	// int64_t GetBatchDirSizeCompressed(FString Dir, bool blSubDir);                                                           // [0x19869c0] Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.GetBatchDirFileCount
	// int32_t GetBatchDirFileCount(FString Dir, bool blSubDir);                                                                // [0x19868c0] Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.DownloadFile
	// int64_t DownloadFile(FString InFile, bool InForceSync, int32_t InPriority, FString InTaskName);                          // [0x1986720] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.DownloadBatchList
	// int64_t DownloadBatchList(FString InFileList, bool forceSync, int32_t Priority, FString InTaskName);                     // [0x1986580] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudPufferService.DownloadBatchDir
	// int64_t DownloadBatchDir(FString Dir, bool blSubDir, bool forceSync, int32_t Priority, FString InTaskName);              // [0x19863b0] Native|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFGCloudRobotService
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UMFGCloudRobotService : public UMFGCloudService
{ 
public:


	/// Functions
	// Function /Script/MFPluginWrapper.MFGCloudRobotService.ShowRobot
	// bool ShowRobot(class UObject* InWorldContext, FString RoleId, FString Question, FString Scene, FString ext, int32_t isLandscape, int32_t newActivity); // [0x198de40] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudRobotService.OnURLCallback
	// void OnURLCallback(FString InParam);                                                                                     // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudRobotService.OnShowCallback
	// void OnShowCallback();                                                                                                   // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudRobotService.OnCloseCallback
	// void OnCloseCallback();                                                                                                  // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudRobotService.GetDefault
	// class UMFGCloudRobotService* GetDefault();                                                                               // [0x198b680] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudRobotService.CloseRobot
	// void CloseRobot();                                                                                                       // [0xd906a0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFGCloudSetting
/// Size: 0x00F8 (248 bytes) (0x000028 - 0x000120) align 8 pad: 0x0000
class UMFGCloudSetting : public UObject
{ 
public:
	FString                                            TbusppProjectName;                                          // 0x0028   (0x0010)  
	FString                                            TbusppGameID;                                               // 0x0038   (0x0010)  
	FString                                            TbusppServiceName;                                          // 0x0048   (0x0010)  
	FString                                            GameId;                                                     // 0x0058   (0x0010)  
	FString                                            GameKey;                                                    // 0x0068   (0x0010)  
	FString                                            QQAppID;                                                    // 0x0078   (0x0010)  
	FString                                            QQAppKey;                                                   // 0x0088   (0x0010)  
	FString                                            WeiXinAppID;                                                // 0x0098   (0x0010)  
	FString                                            WeiXinAppKey;                                               // 0x00A8   (0x0010)  
	FString                                            MSDK_GAME_ID;                                               // 0x00B8   (0x0010)  
	FString                                            MSDK_SDK_Key;                                               // 0x00C8   (0x0010)  
	FString                                            ConnectorDHP;                                               // 0x00D8   (0x0010)  
	int32_t                                            Dumphitches;                                                // 0x00E8   (0x0004)  
	int32_t                                            TssSDKID;                                                   // 0x00EC   (0x0004)  
	int32_t                                            GRobotGameID;                                               // 0x00F0   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x00F4   (0x0004)  MISSED
	FString                                            GRobotGameCode;                                             // 0x00F8   (0x0010)  
	bool                                               SkipAuth;                                                   // 0x0108   (0x0001)  
	unsigned char                                      UnknownData01_6[0x7];                                       // 0x0109   (0x0007)  MISSED
	FString                                            WeGameID;                                                   // 0x0110   (0x0010)  


	/// Functions
	// Function /Script/MFPluginWrapper.MFGCloudSetting.GetWeiXinAppID
	// FString GetWeiXinAppID();                                                                                                // [0x198bc90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudSetting.GetWeGameID
	// FString GetWeGameID();                                                                                                   // [0x198bc10] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFGCloudSetting.GetTssSDKID
	// int32_t GetTssSDKID();                                                                                                   // [0x198bbe0] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFGCloudSetting.GetTbusppProjectName
	// FString GetTbusppProjectName();                                                                                          // [0x198bb60] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFGCloudSetting.GetQQAppID
	// FString GetQQAppID();                                                                                                    // [0x198ba30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudSetting.GetMSDKSDKKey
	// FString GetMSDKSDKKey();                                                                                                 // [0x198b8b0] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFGCloudSetting.GetMSDKGameID
	// FString GetMSDKGameID();                                                                                                 // [0x198b830] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFGCloudSetting.GetGameId
	// FString GetGameId();                                                                                                     // [0x198b7b0] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFGCloudTGPAObserver
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UMFGCloudTGPAObserver : public UMFPWObject
{ 
public:
};

/// Class /Script/MFPluginWrapper.MFGCloudTGPAService
/// Size: 0x0008 (8 bytes) (0x000040 - 0x000048) align 8 pad: 0x0000
class UMFGCloudTGPAService : public UMFGCloudService
{ 
public:
	class UMFGCloudTGPAObserver*                       GCLoudTGPAObserver;                                         // 0x0040   (0x0008)  


	/// Functions
	// Function /Script/MFPluginWrapper.MFGCloudTGPAService.OnNotifySystemInfo
	// void OnNotifySystemInfo(FString& Json);                                                                                  // [0x3a75280] Event|Public|HasOutParms|BlueprintEvent 
};

/// Class /Script/MFPluginWrapper.MFGCloudToolsObserver
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UMFGCloudToolsObserver : public UMFPWObject
{ 
public:
};

/// Class /Script/MFPluginWrapper.MFGCloudToolsService
/// Size: 0x0008 (8 bytes) (0x000040 - 0x000048) align 8 pad: 0x0000
class UMFGCloudToolsService : public UMFGCloudService
{ 
public:
	class UMFGCloudToolsObserver*                      ToolsObserver;                                              // 0x0040   (0x0008)  


	/// Functions
	// Function /Script/MFPluginWrapper.MFGCloudToolsService.OpenPrajnaWebView
	// void OpenPrajnaWebView(FString jsonStr);                                                                                 // [0x198d3d0] Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudToolsService.IsAppInstall
	// bool IsAppInstall(FString Channel, FString Extra);                                                                       // [0x198bf20] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudToolsService.GetConfigChannelID
	// FString GetConfigChannelID();                                                                                            // [0x198b600] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFGCloudTssService
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UMFGCloudTssService : public UMFGCloudService
{ 
public:
};

/// Class /Script/MFPluginWrapper.MFGCloudWebViewObserver
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UMFGCloudWebViewObserver : public UMFPWObject
{ 
public:
};

/// Class /Script/MFPluginWrapper.MFGCloudWebViewService
/// Size: 0x0010 (16 bytes) (0x000040 - 0x000050) align 8 pad: 0x0000
class UMFGCloudWebViewService : public UMFGCloudService
{ 
public:
	class UMFGCloudWebViewObserver*                    WebViewObserver;                                            // 0x0040   (0x0008)  
	class UMFIntlWebViewObserver*                      IntlWebViewObserver;                                        // 0x0048   (0x0008)  


	/// Functions
	// Function /Script/MFPluginWrapper.MFGCloudWebViewService.OnWebViewPreClose
	// void OnWebViewPreClose();                                                                                                // [0x198b060] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudWebViewService.OnWebViewBackCall
	// void OnWebViewBackCall(int32_t methodId, int32_t MsgType, FString MsgJsonData);                                          // [0x198d2a0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGCloudWebViewService.OnCustomerServiceBackCall
	// void OnCustomerServiceBackCall(int32_t MsgType, FString MsgJsonData);                                                    // [0x197c730] Native|Event|Public|BlueprintEvent 
};

/// Class /Script/MFPluginWrapper.MFGCloudXGObserver
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UMFGCloudXGObserver : public UMFPWObject
{ 
public:
};

/// Class /Script/MFPluginWrapper.MFGCloudXGService
/// Size: 0x0020 (32 bytes) (0x000040 - 0x000060) align 8 pad: 0x0000
class UMFGCloudXGService : public UMFGCloudService
{ 
public:
	class UMFGCloudXGObserver*                         XGObserver;                                                 // 0x0040   (0x0008)  
	unsigned char                                      UnknownData00_7[0x18];                                      // 0x0048   (0x0018)  MISSED


	/// Functions
	// Function /Script/MFPluginWrapper.MFGCloudXGService.UnregisterPush
	// void UnregisterPush(FString Channel);                                                                                    // [0x198e0a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudXGService.SetTag
	// void SetTag(FString Channel, FString Tag);                                                                               // [0x198dca0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudXGService.SetAccount
	// void SetAccount(FString Channel, FString Account);                                                                       // [0x197dd50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudXGService.RegisterPush
	// void RegisterPush(FString Channel, FString Account);                                                                     // [0x198d4c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudXGService.DeleteTag
	// void DeleteTag(FString Channel, FString Tag);                                                                            // [0x198b1a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudXGService.DeleteAccount
	// void DeleteAccount(FString Channel, FString Account);                                                                    // [0x197dd50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGCloudXGService.AddLocalNotification
	// void AddLocalNotification(int32_t Year, int32_t Month, int32_t Day, int32_t Hour, int32_t Min, FString Title, FString Content, FString content_ios); // [0x198ad10] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFGMEObserver
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UMFGMEObserver : public UMFPWObject
{ 
public:
};

/// Class /Script/MFPluginWrapper.MFGMEService
/// Size: 0x0070 (112 bytes) (0x000040 - 0x0000B0) align 8 pad: 0x0000
class UMFGMEService : public UMFGCloudService
{ 
public:
	unsigned char                                      UnknownData00_3[0x20];                                      // 0x0040   (0x0020)  MISSED
	class UMFGMEObserver*                              gmeObserver;                                                // 0x0060   (0x0008)  
	unsigned char                                      UnknownData01_6[0x30];                                      // 0x0068   (0x0030)  MISSED
	FString                                            mRoomId;                                                    // 0x0098   (0x0010)  
	int32_t                                            mRoomQualityType;                                           // 0x00A8   (0x0004)  
	unsigned char                                      UnknownData02_7[0x4];                                       // 0x00AC   (0x0004)  MISSED


	/// Functions
	// Function /Script/MFPluginWrapper.MFGMEService.UploadRecordedFile
	// int32_t UploadRecordedFile(FString FilePath);                                                                            // [0x198b930] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.UnInitMFVoiceEngine
	// int32_t UnInitMFVoiceEngine();                                                                                           // [0x198b0d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.TestMic
	// int32_t TestMic();                                                                                                       // [0x198b0d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.StopRecording
	// int32_t StopRecording();                                                                                                 // [0x198b0d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.StopPlayFile
	// int32_t StopPlayFile();                                                                                                  // [0x198b0d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.StartRecording
	// int32_t StartRecording(FString FilePath);                                                                                // [0x198b930] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.SpeechToText
	// int32_t SpeechToText(FString fileID, FString SpeechLanguage, FString TranslateLanguage);                                 // [0x198bd10] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.SetVoiceMode
	// int32_t SetVoiceMode(int32_t VoiceMode);                                                                                 // [0x198dda0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.SetSpeakerVolume
	// int32_t SetSpeakerVolume(int32_t Volume);                                                                                // [0x198d890] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.SetReportedPlayerInfo
	// int32_t SetReportedPlayerInfo(TArray<FString> cszOpenID, TArray<int32_t> nMemberID, int32_t nCount);                     // [0x198da60] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.SetReportBufferTime
	// void SetReportBufferTime(int32_t nTimeSec);                                                                              // [0x197ccf0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.SetPlayerVolume
	// int32_t SetPlayerVolume(FString PlayerId, int32_t vol);                                                                  // [0x198d930] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.SetMicVolume
	// int32_t SetMicVolume(int32_t Volume);                                                                                    // [0x198d890] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.SetLogLevel
	// int32_t SetLogLevel(int32_t LevelWrite, int32_t LevelPrint);                                                             // [0x198d7c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.SetAppInfo
	// int32_t SetAppInfo(FString AppID, FString AppKey, FString Openid);                                                       // [0x198bd10] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.ReportPlayer
	// int32_t ReportPlayer(TArray<FString> cszOpenID, int32_t nCount, FString cszInfo);                                        // [0x198d5c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.QuitRoom
	// int32_t QuitRoom(FString RoomName);                                                                                      // [0x198b930] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.QueryPermission
	// int32_t QueryPermission();                                                                                               // [0x197ac50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.PlayRecordedFile
	// int32_t PlayRecordedFile(FString FilePath);                                                                              // [0x198b930] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.OpenSpeaker
	// int32_t OpenSpeaker();                                                                                                   // [0x198b0d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.OpenMic
	// int32_t OpenMic();                                                                                                       // [0x198b0d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.OnVoiceRecording
	// void OnVoiceRecording();                                                                                                 // [0x198d280] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGMEService.OnUploadedFile
	// void OnUploadedFile(int32_t code, FString FilePath, FString fileID);                                                     // [0x198d140] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGMEService.OnStreamSpeechToTextDone
	// void OnStreamSpeechToTextDone(int32_t code, int32_t Error, FString Result, FString VoicePath);                           // [0x198cfc0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGMEService.OnStatusUpdate
	// void OnStatusUpdate(int32_t status, FString RoomName, int32_t memberID);                                                 // [0x198ce90] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGMEService.OnSpeechToTextDone
	// void OnSpeechToTextDone(int32_t code, FString fileID, FString Result);                                                   // [0x198cd50] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGMEService.OnRoomMemberInfo
	// void OnRoomMemberInfo(int32_t code, FString RoomName, int32_t memid, FString Openid);                                    // [0x198cbd0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGMEService.OnQuitedRoom
	// void OnQuitedRoom(int32_t code, FString RoomName);                                                                       // [0x198caf0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGMEService.OnPlayedRecordedFile
	// void OnPlayedRecordedFile(int32_t code, FString FilePath);                                                               // [0x198ca10] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGMEService.OnMultiRoomMemberVoice
	// void OnMultiRoomMemberVoice(FString RoomName, int32_t memid, int32_t status);                                            // [0x198c8e0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGMEService.OnMemberVoice
	// void OnMemberVoice(int32_t memid, int32_t status);                                                                       // [0x198c810] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGMEService.OnJoinedRoom
	// void OnJoinedRoom(int32_t code, FString RoomName, int32_t memberID);                                                     // [0x198c6e0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGMEService.OnIOSPermissionRequestReturn
	// void OnIOSPermissionRequestReturn(bool status);                                                                          // [0x198c650] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.OnEvent
	// void OnEvent(int32_t Event, FString Info);                                                                               // [0x198c570] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGMEService.OnDownloadedFile
	// void OnDownloadedFile(int32_t code, FString FilePath, FString fileID);                                                   // [0x198c430] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGMEService.OnAppliedMessageKey
	// void OnAppliedMessageKey(int32_t code);                                                                                  // [0x198c3a0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGMEService.OnAndroidPermissionRequestReturn
	// void OnAndroidPermissionRequestReturn(TArray<FString>& Permissions, TArray<bool>& GrantResults);                         // [0x198c260] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.JoinTeamRoom3
	// int32_t JoinTeamRoom3(FString RoomName, TArray<int32_t> authbuffer, int32_t Length);                                     // [0x198c0a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.JoinTeamRoom
	// int32_t JoinTeamRoom(FString RoomName);                                                                                  // [0x198b930] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.JoinRangeRoom
	// int32_t JoinRangeRoom(FString RoomName);                                                                                 // [0x198b930] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.JoinNationRoom
	// int32_t JoinNationRoom(FString RoomName);                                                                                // [0x198b930] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.IsSpeaking
	// bool IsSpeaking();                                                                                                       // [0x197b5c0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFGMEService.IsRoomEntered
	// bool IsRoomEntered();                                                                                                    // [0x197bba0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.InitMFVoiceEngine
	// int32_t InitMFVoiceEngine(FString AppID, FString AppKey, FString Openid);                                                // [0x198bd10] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.GetVoiceFileSize
	// int32_t GetVoiceFileSize(FString FilePath);                                                                              // [0x198bab0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.GetVoiceFileDuration
	// int32_t GetVoiceFileDuration(FString FilePath);                                                                          // [0x198bab0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.GetSpeakerState
	// int32_t GetSpeakerState();                                                                                               // [0x198b0d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.GetSpeakerLevel
	// int32_t GetSpeakerLevel();                                                                                               // [0x198b0d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.GetRoomMembers
	// int32_t GetRoomMembers(FString RoomName);                                                                                // [0x198bab0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.GetRecvStreamLevel
	// int32_t GetRecvStreamLevel(FString Openid);                                                                              // [0x198b930] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.GetPlayerVolume
	// int32_t GetPlayerVolume(FString PlayerId);                                                                               // [0x198b930] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.GetMicState
	// int32_t GetMicState();                                                                                                   // [0x198b0d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.GetMicLevel
	// int32_t GetMicLevel(bool bFadeOut);                                                                                      // [0x198b100] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.GetFileTime
	// float GetFileTime(FString FilePath);                                                                                     // [0x198b6b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.GetAudioDeviceConnectionState
	// int32_t GetAudioDeviceConnectionState();                                                                                 // [0x198b0d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.GameResume
	// int32_t GameResume();                                                                                                    // [0x198b0d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.GamePause
	// int32_t GamePause();                                                                                                     // [0x198b0d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.EnableSpeakerOn
	// int32_t EnableSpeakerOn(bool bEnable);                                                                                   // [0x198b100] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.EnableRoomSpeaker
	// int32_t EnableRoomSpeaker(FString RoomName, bool enable);                                                                // [0x198b4c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.EnableRoomMicrophone
	// int32_t EnableRoomMicrophone(FString RoomName, bool enable);                                                             // [0x198b4c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.EnableReportALLAbroad
	// int32_t EnableReportALLAbroad(bool bEnable);                                                                             // [0x198b100] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.EnableReportALL
	// int32_t EnableReportALL(bool bEnable);                                                                                   // [0x198b100] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.EnableMultiRoom
	// int32_t EnableMultiRoom(bool enable);                                                                                    // [0x198b100] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.EnableLogCallBack
	// int32_t EnableLogCallBack(bool bEnable);                                                                                 // [0x198b100] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.EnableLog
	// void EnableLog(bool bEnable);                                                                                            // [0x197b510] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.EnableCivilVoice
	// int32_t EnableCivilVoice(bool bEnable);                                                                                  // [0x198b100] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.EnableBluetoothSCO
	// int32_t EnableBluetoothSCO(bool bEnable);                                                                                // [0x198b420] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.DownloadRecordedFile
	// int32_t DownloadRecordedFile(FString fileID, FString DownloadFilePath);                                                  // [0x198b2a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.CloseSpeaker
	// int32_t CloseSpeaker();                                                                                                  // [0x198b0d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.CloseMic
	// int32_t CloseMic();                                                                                                      // [0x198b0d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.CheckPermission
	// int32_t CheckPermission();                                                                                               // [0x197ac50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.CheckMicPermission
	// int32_t CheckMicPermission();                                                                                            // [0x198b0d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.CaptureMicrophoneData
	// int32_t CaptureMicrophoneData(bool bCapture);                                                                            // [0x198b100] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.CancelRecording
	// int32_t CancelRecording();                                                                                               // [0x198b0d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.ApplyPTTAuthbuffer
	// int32_t ApplyPTTAuthbuffer();                                                                                            // [0x198b0d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.ApplyMessageKey
	// int32_t ApplyMessageKey();                                                                                               // [0x198b0a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGMEService.ApplicationWillEnterBackground
	// void ApplicationWillEnterBackground();                                                                                   // [0x19820f0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGMEService.ApplicationWillDeactivate
	// void ApplicationWillDeactivate();                                                                                        // [0x16b0bb0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGMEService.ApplicationHasReactivated
	// void ApplicationHasReactivated();                                                                                        // [0x198b080] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFGMEService.ApplicationHasEnteredForeground
	// void ApplicationHasEnteredForeground();                                                                                  // [0x198b060] Native|Event|Public|BlueprintEvent 
};

/// Class /Script/MFPluginWrapper.MFGPMAgent
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFGPMAgent : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/MFPluginWrapper.MFGPMAgent.WriteMpeFrameInterpolation
	// void WriteMpeFrameInterpolation(char bEnable);                                                                           // [0x19939d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.WriteGraphicStyleQualityLevel
	// void WriteGraphicStyleQualityLevel(char InGraphicStyleQualityLevel);                                                     // [0x19938f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.WriteGraphicsQualityLevel
	// void WriteGraphicsQualityLevel(char GraphicsQualityLevel);                                                               // [0x1993960] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.WriteFrameRateLevel
	// void WriteFrameRateLevel(char InFrameRateLevel);                                                                         // [0x1993880] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.WriteAntiAliasingState
	// void WriteAntiAliasingState(bool bOpen);                                                                                 // [0x1993800] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.UamSetFrameRateStrategy
	// void UamSetFrameRateStrategy(EUamDeviceRank InDeviceRank, EUAFrameRateLevel InTargetFrameRateLevel, bool bIsDisableGearTwoMpe); // [0x19936f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.SetMpeFrameInterpolation
	// void SetMpeFrameInterpolation(char bEnable);                                                                             // [0x1992f10] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.SetGraphicStyleQualityLevel
	// void SetGraphicStyleQualityLevel(char GraphicStyleQualityLevel, class UWorld* World);                                    // [0x1992d90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.SetGraphicsQualityLevel
	// void SetGraphicsQualityLevel(char InQuality, class UWorld* World);                                                       // [0x1992e50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.SetFrameRateLevel
	// void SetFrameRateLevel(char InFrameRateLevel, class UWorld* World);                                                      // [0x1992cd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.SetForceBlockFXAA
	// void SetForceBlockFXAA(bool bBlock, class UWorld* World);                                                                // [0x1992c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.SetCurrentHapticPlayerType
	// void SetCurrentHapticPlayerType(int32_t PlayerType);                                                                     // [0x16b58a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.SetAntiAliasingState
	// void SetAntiAliasingState(bool bOpen, class UWorld* World);                                                              // [0x1992aa0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.ReportNetworkReconnectTimes
	// void ReportNetworkReconnectTimes(int32_t ReconnectTimes);                                                                // [0x16b58a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.ReportMemInfo
	// void ReportMemInfo();                                                                                                    // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.ReadMpeFrameInterpolation
	// char ReadMpeFrameInterpolation();                                                                                        // [0x19920c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.ReadGraphicStyleQualityLevel
	// char ReadGraphicStyleQualityLevel();                                                                                     // [0x1992060] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.ReadGraphicsQualityLevel
	// char ReadGraphicsQualityLevel();                                                                                         // [0x1992090] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.ReadFrameRateLevel
	// char ReadFrameRateLevel();                                                                                               // [0x1992030] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.ReadAntiAliasingState
	// bool ReadAntiAliasingState();                                                                                            // [0x1992000] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.InitGraphicsQualityLevel
	// void InitGraphicsQualityLevel();                                                                                         // [0x1990d70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.InitContext
	// void InitContext();                                                                                                      // [0x1990cb0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.HapticStop
	// void HapticStop();                                                                                                       // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.HapticPlayWithFile
	// void HapticPlayWithFile(FString heJson, int32_t Loop, int32_t Interval, int32_t Amplitude);                              // [0x1990b50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.HapticPlay
	// void HapticPlay(FString heJson, int32_t Loop, int32_t Interval, int32_t Amplitude);                                      // [0x1990b50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.GPUMorphTargetsBlackListHit
	// void GPUMorphTargetsBlackListHit();                                                                                      // [0x19902a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.GetMinGraphicsQualityLevel
	// char GetMinGraphicsQualityLevel();                                                                                       // [0x1990940] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.GetMaxGraphicsQualityLevel
	// char GetMaxGraphicsQualityLevel();                                                                                       // [0x1990910] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.GetGraphicStyleQualityLevel
	// char GetGraphicStyleQualityLevel();                                                                                      // [0x19908b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.GetGraphicsQualityLevel
	// char GetGraphicsQualityLevel();                                                                                          // [0x19908e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.GetFrameRateLevel
	// char GetFrameRateLevel();                                                                                                // [0x1990880] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.GetFrameRateFromFrameRateLevel
	// int32_t GetFrameRateFromFrameRateLevel(char InFrameRateLevel);                                                           // [0x1990800] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.GetForceBlockFXAA
	// bool GetForceBlockFXAA();                                                                                                // [0x19907d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.GetDefaultGraphicsQualityLevel
	// char GetDefaultGraphicsQualityLevel();                                                                                   // [0x19906b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.GetDefaultFrameRateLevel
	// char GetDefaultFrameRateLevel();                                                                                         // [0x1990680] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.GetCurrentMpeFrameInterpolation
	// char GetCurrentMpeFrameInterpolation();                                                                                  // [0x19904a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.GetAntiAliasingState
	// bool GetAntiAliasingState();                                                                                             // [0x1990470] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.GetAndroidGPUFamily
	// FString GetAndroidGPUFamily();                                                                                           // [0x16b5450] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.GameSwitchConfig
	// void GameSwitchConfig(class UWorld* World);                                                                              // [0x19902c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.FPS90BlackListHit
	// void FPS90BlackListHit(int32_t TargetFrameLevel);                                                                        // [0x1990220] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.FPS120BlackListHit
	// void FPS120BlackListHit(int32_t TargetFrameLevel);                                                                       // [0x19901a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.DeviceLevelToGraphicsQualityLevel
	// char DeviceLevelToGraphicsQualityLevel(int32_t DeviceLevel);                                                             // [0x19900b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.CheckHapticPlayerSupport
	// int32_t CheckHapticPlayerSupport(int32_t HapticPlayerType);                                                              // [0x1990020] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.CheckHapticAmplitudeSupport
	// int32_t CheckHapticAmplitudeSupport();                                                                                   // [0x198fff0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMAgent.BlackListHitReport
	// void BlackListHitReport();                                                                                               // [0x198ffd0] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFGPMHelperFunctionLibrary : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.TGPAUpdateGameInfoStringMap
	// void TGPAUpdateGameInfoStringMap(FString Key, TMap<FString, FString> mapData);                                           // [0x1993530] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.TGPAUpdateGameInfoIntString
	// void TGPAUpdateGameInfoIntString(int32_t Key, FString Value);                                                            // [0x1993410] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.TGPAUpdateGameInfo2String
	// void TGPAUpdateGameInfo2String(FString Key, FString Value);                                                              // [0x19932a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.TGPAUpdateGameInfo2Int
	// void TGPAUpdateGameInfo2Int(int32_t Key, int32_t Value);                                                                 // [0x19931e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.SetVersionIden
	// void SetVersionIden(FString versionName);                                                                                // [0x1993150] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.SetSwitcher
	// void SetSwitcher(int32_t switcher, int32_t places);                                                                      // [0x1993090] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.SetServerInfo
	// void SetServerInfo(FString ZoneId, FString roomIp);                                                                      // [0x1990fc0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.SetQuality
	// void SetQuality(int32_t quality);                                                                                        // [0x1993010] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.SetOpenId
	// void SetOpenId(FString InOpenID);                                                                                        // [0x1992f80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.SetAppVersion
	// void SetAppVersion(FString AppVersion);                                                                                  // [0x1992b70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.ReportPayStep
	// void ReportPayStep(int32_t Step, bool Result, int32_t ErrorCode, FString StepName, FString Key, FString Value, bool authorize, bool Finish); // [0x19927b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.ReportLoginStep
	// void ReportLoginStep(TMap<FString, FString> ParamsMap, int32_t Step, bool Result, int32_t ErrorCode, FString StepName, FString StepComment, FString Key, FString Value, bool authorize, bool Finish); // [0x1992320] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.ReportEvent
	// void ReportEvent(FString EventName, FString SpecialChannel, TMap<FString, FString> ParamsMap, FString extraJson);        // [0x19920f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.ReleaseStepEventContext
	// void ReleaseStepEventContext();                                                                                          // [0x1990d90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.PostValueS
	// void PostValueS(FString Category, FString Key, FString InVal);                                                           // [0x1991ec0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.PostValueI
	// void PostValueI(FString Category, FString Key, int32_t A);                                                               // [0x1991d90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.PostValueF
	// void PostValueF(FString Category, FString Key, float A);                                                                 // [0x1991c60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.PostValue3I
	// void PostValue3I(FString Category, FString Key, int32_t A, int32_t B, int32_t C);                                        // [0x1991ab0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.PostValue3F
	// void PostValue3F(FString Category, FString Key, float A, float B, float C);                                              // [0x1991900] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.PostValue2I
	// void PostValue2I(FString Category, FString Key, int32_t A, int32_t B);                                                   // [0x1991790] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.PostValue2F
	// void PostValue2F(FString Category, FString Key, float A, float B);                                                       // [0x1991620] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.PostStepEvent
	// void PostStepEvent(FString eventCategory, int32_t stepId, int32_t status, int32_t code, FString Msg, FString extraKey, TMap<FString, FString> ParamsMap, bool authorize, bool Finish); // [0x19911b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.PostNTL
	// void PostNTL(int32_t latency);                                                                                           // [0x1991130] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.PostFrame
	// bool PostFrame(float DeltaTime);                                                                                         // [0x19910b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.PostEventSS
	// void PostEventSS(FString Key, FString Value);                                                                            // [0x1990fc0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.PostEventIS
	// void PostEventIS(int32_t Key, FString Info);                                                                             // [0x1990ea0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.MarkStartUpFinish
	// void MarkStartUpFinish();                                                                                                // [0x1990e80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.MarkLevelLoadCompleted
	// void MarkLevelLoadCompleted();                                                                                           // [0x1990e60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.MarkLevelLoad
	// void MarkLevelLoad(FString sceneName);                                                                                   // [0x1990dd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.MarkLevelFin
	// void MarkLevelFin();                                                                                                     // [0x1990db0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.IsUseGPM
	// bool IsUseGPM();                                                                                                         // [0xfd8a30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.InitStepEventContext
	// void InitStepEventContext();                                                                                             // [0x1990d90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.InitContext
	// int32_t InitContext(FString AppID);                                                                                      // [0x1990cd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.GetSDKVersion
	// FString GetSDKVersion();                                                                                                 // [0x19909a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.GetReportType
	// int32_t GetReportType();                                                                                                 // [0x1990970] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.GetDeviceLevel
	// int32_t GetDeviceLevel(FString ConfigName, FString FilePath);                                                            // [0x19906e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.GetDataFromTGPA
	// FString GetDataFromTGPA(FString Key, FString Value);                                                                     // [0x19904d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.GetAPMQuality
	// int32_t GetAPMQuality();                                                                                                 // [0x1990340] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.EndTupleWrap
	// void EndTupleWrap();                                                                                                     // [0x1990180] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.EndTag
	// void EndTag();                                                                                                           // [0x1990160] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.EndExclude
	// void EndExclude();                                                                                                       // [0x1990140] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.detectInTimeout
	// void detectInTimeout();                                                                                                  // [0x1990d90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.BeginTupleWrap
	// void BeginTupleWrap(FString Key);                                                                                        // [0x198ff40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.BeginTag
	// void BeginTag(FString TagName);                                                                                          // [0x198feb0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.BeginExclude
	// void BeginExclude();                                                                                                     // [0x198fe90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFGPMHelperFunctionLibrary.AddReportLoginStepParams
	// void AddReportLoginStepParams(FString eventCategory, TMap<FString, FString> ParamsMap);                                  // [0x198fcd0] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFIntlLoginObserver
/// Size: 0x0028 (40 bytes) (0x000040 - 0x000068) align 8 pad: 0x0000
class UMFIntlLoginObserver : public UMFPWObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x28];                                      // 0x0040   (0x0028)  MISSED
};

/// Class /Script/MFPluginWrapper.MFIntlWebViewObserver
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UMFIntlWebViewObserver : public UMFPWObject
{ 
public:
};

/// Class /Script/MFPluginWrapper.MFIOSRuntimeHelper
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFIOSRuntimeHelper : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/MFPluginWrapper.MFIOSRuntimeHelper.RequestUserAgent
	// void RequestUserAgent();                                                                                                 // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFIOSRuntimeHelper.RequestASAAttribution
	// void RequestASAAttribution();                                                                                            // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFIOSRuntimeHelper.GetUserAgentError
	// FString GetUserAgentError();                                                                                             // [0x1990ad0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFIOSRuntimeHelper.GetUserAgent
	// FString GetUserAgent();                                                                                                  // [0x1990a50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFIOSRuntimeHelper.GetUniversalLinkActivityID
	// int32_t GetUniversalLinkActivityID();                                                                                    // [0x1990a20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFIOSRuntimeHelper.GetASAInfoError
	// FString GetASAInfoError();                                                                                               // [0x19903f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFIOSRuntimeHelper.GetASAInfo
	// FString GetASAInfo();                                                                                                    // [0x1990370] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFIOSRuntimeHelper.ClearUniversalLinkActivityID
	// void ClearUniversalLinkActivityID();                                                                                     // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFLBSObserver
/// Size: 0x0010 (16 bytes) (0x000040 - 0x000050) align 8 pad: 0x0000
class UMFLBSObserver : public UMFPWObject
{ 
public:
	SDK_UNDEFINED(16,647) /* FMulticastInlineDelegate */ __um(OnAuthorizationStatusChanged);                       // 0x0040   (0x0010)  
};

/// Class /Script/MFPluginWrapper.MFLBSService
/// Size: 0x0008 (8 bytes) (0x000040 - 0x000048) align 8 pad: 0x0000
class UMFLBSService : public UMFGCloudService
{ 
public:
	class UMFLBSObserver*                              LBSObserver;                                                // 0x0040   (0x0008)  


	/// Functions
	// Function /Script/MFPluginWrapper.MFLBSService.RequestIPInfo
	// void RequestIPInfo();                                                                                                    // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFLBSService.QueryLocationPermission
	// void QueryLocationPermission();                                                                                          // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFLBSService.QueryLocation
	// void QueryLocation();                                                                                                    // [0x199a880] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFLBSService.OnIOSLocationPermissionRequestReturn
	// void OnIOSLocationPermissionRequestReturn(int32_t AuthorizationStatus);                                                  // [0x197ccf0] Final|Native|Public  
	// Function /Script/MFPluginWrapper.MFLBSService.OnAndroidLocationPermissionRequestReturn
	// void OnAndroidLocationPermissionRequestReturn(TArray<FString>& Permissions, TArray<bool>& GrantResults);                 // [0x1998c60] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFLBSService.CheckLocationServices
	// bool CheckLocationServices();                                                                                            // [0xc12490] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFLBSService.CheckLocationPermission
	// int32_t CheckLocationPermission();                                                                                       // [0x1990a20] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFMidasObserver
/// Size: 0x0028 (40 bytes) (0x000040 - 0x000068) align 8 pad: 0x0000
class UMFMidasObserver : public UMFPWObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x28];                                      // 0x0040   (0x0028)  MISSED
};

/// Class /Script/MFPluginWrapper.MFMidasService
/// Size: 0x0060 (96 bytes) (0x000040 - 0x0000A0) align 16 pad: 0x0000
class UMFMidasService : public UMFGCloudService
{ 
public:
	unsigned char                                      UnknownData00_3[0x48];                                      // 0x0040   (0x0048)  MISSED
	class UMFMidasObserver*                            MFMidasObserver;                                            // 0x0088   (0x0008)  
	class UMFCTIPayObserver*                           MFCTIPayObserver;                                           // 0x0090   (0x0008)  
	unsigned char                                      UnknownData01_7[0x8];                                       // 0x0098   (0x0008)  MISSED


	/// Functions
	// Function /Script/MFPluginWrapper.MFMidasService.PayMonthCard
	// void PayMonthCard(FString ProductId, int32_t price, int32_t Time, FString callBackData, FString ServiceName, FString ServiceCode, bool bAutoPay); // [0x199a550] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMidasService.PayGoods
	// void PayGoods(FString GoodsTokenUrl, int32_t GoodsPrice, int32_t GoodsNum, FString callBackData, int32_t ZoneId, FString OfferId, FString Pf, FString PfExt, FString ChannelExtras); // [0x199a240] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMidasService.PayCoin
	// void PayCoin(FString ProductId, int32_t GoodsNum);                                                                       // [0x199a160] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMidasService.OnMidasReprovideFinished
	// void OnMidasReprovideFinished(FString resultJson);                                                                       // [0x1999230] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFMidasService.OnMidasPayFinished
	// void OnMidasPayFinished(int32_t ResultCode, FString payChannel, FString realSaveNum, FString resultMsg, FString callBackData); // [0x1999040] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFMidasService.OnMidasOvertime
	// void OnMidasOvertime(bool overtimeState);                                                                                // [0x197c9b0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFMidasService.OnMidasLoginExpired
	// void OnMidasLoginExpired();                                                                                              // [0x1999020] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFMidasService.OnMidasInitFinished
	// void OnMidasInitFinished(FString resultJson);                                                                            // [0x1998f80] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFMidasService.OnMidasGetLocalPrice
	// void OnMidasGetLocalPrice(FString Result);                                                                               // [0x1998ee0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFMidasService.OnMidasGetIntroPrice
	// void OnMidasGetIntroPrice(FString Result);                                                                               // [0x1998e40] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFMidasService.OnMidasGetInfoFinished
	// void OnMidasGetInfoFinished(FString Result);                                                                             // [0x1998da0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFMidasService.Init
	// bool Init(bool IsSandBox, bool EnableLog, int32_t GoodsZoneId, FString InPayChannel, FString InOfferId);                 // [0x1997990] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMidasService.GetLocalPriceInfo
	// void GetLocalPriceInfo(TArray<FString>& ProductIds, FString ProductType);                                                // [0x19974b0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMidasService.GetChargeInfo
	// void GetChargeInfo();                                                                                                    // [0x19973a0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFMNAService
/// Size: 0x0010 (16 bytes) (0x000040 - 0x000050) align 8 pad: 0x0000
class UMFMNAService : public UMFGCloudService
{ 
public:
	class UClass*                                      StartingWidgetClass;                                        // 0x0040   (0x0008)  
	class UUserWidget*                                 CurrentWidget;                                              // 0x0048   (0x0008)  


	/// Functions
	// Function /Script/MFPluginWrapper.MFMNAService.TransportInfo
	// void TransportInfo();                                                                                                    // [0x199d070] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.StopMNA
	// void StopMNA();                                                                                                          // [0x199b210] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.StartSpeedEnterMapLoading
	// void StartSpeedEnterMapLoading();                                                                                        // [0x199b1f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.StartSpeed
	// void StartSpeed(FString VipIP, int32_t VipPort);                                                                         // [0x199b0c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.SetZoneId
	// void SetZoneId(int32_t ZoneId);                                                                                          // [0x199b030] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.SetUserName
	// void SetUserName(int32_t channelType, FString Openid);                                                                   // [0x199af00] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.SetPvpSpeedIp
	// void SetPvpSpeedIp(FString VipIP, int32_t VipPort);                                                                      // [0x199ad30] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.SetObserver
	// void SetObserver(FString Tag, class UClass* InClass);                                                                    // [0x199ac50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.SetGameIp
	// void SetGameIp();                                                                                                        // [0x199ac30] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.SetControlDomain
	// void SetControlDomain(FString ControlDomain, int64_t ControlPort);                                                       // [0x199aa00] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.QueryPreciseKartin
	// void QueryPreciseKartin(int64_t curServTime, int64_t pvpDurationTime, FString triggerDelay);                             // [0x199a8a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.QueryKartin
	// void QueryKartin(FString Tag);                                                                                           // [0x199a7e0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.Ping
	// void Ping();                                                                                                             // [0x199a7c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.OnWebViewBackCall
	// void OnWebViewBackCall(int32_t methodId, int32_t MsgType, FString MsgJsonData);                                          // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFMNAService.OnNetWorkTestCall
	// void OnNetWorkTestCall(int32_t flag, int32_t jump_network, int32_t jump_signal, int32_t jump_direct, int32_t direct_status, FString direct_desc, int32_t jump_export, int32_t export_status, FString export_desc, int32_t jump_terminal, int32_t terminal_status, FString terminal_desc, int32_t jump_router, int32_t router_status, FString router_desc); // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFMNAService.IsQOSWork
	// void IsQOSWork();                                                                                                        // [0x1997be0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.IsAnyVPNOpen
	// bool IsAnyVPNOpen();                                                                                                     // [0x1997b90] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.Init
	// void Init(FString QQAppID);                                                                                              // [0x19978a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.GoFront
	// void GoFront();                                                                                                          // [0x1997880] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.GoBack
	// void GoBack();                                                                                                           // [0x1997860] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.GetStaticMNAService
	// class UMFMNAService* GetStaticMNAService();                                                                              // [0x19977e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.GetIpGroupDelays
	// void GetIpGroupDelays();                                                                                                 // [0x1997490] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.GetDelay
	// int32_t GetDelay();                                                                                                      // [0x19973c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.EndSpeed
	// void EndSpeed();                                                                                                         // [0x1997280] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.ChangeMenuWidget
	// void ChangeMenuWidget(class UClass* NewWidgetClass);                                                                     // [0x1996b40] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFMNAService.AddServiceByClass
	// class UMFMNAService* AddServiceByClass(class UClass* InClass);                                                           // [0x1996aa0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFPandoraService
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UMFPandoraService : public UMFGCloudService
{ 
public:


	/// Functions
	// Function /Script/MFPluginWrapper.MFPandoraService.ShowItemTips
	// void ShowItemTips(class UCanvasPanel* Anchor, FString ItemID);                                                           // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFPandoraService.ShowItemIcon
	// void ShowItemIcon(class UImage* Image, FString ItemID);                                                                  // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFPandoraService.ShowItemEx
	// void ShowItemEx(class UCanvasPanel* Anchor, FString ItemID, int32_t itemCnt);                                            // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFPandoraService.SetSDKVersion
	// void SetSDKVersion(int32_t InVersion);                                                                                   // [0x197ccf0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPandoraService.SetScriptExternalLoadDir
	// void SetScriptExternalLoadDir(FString InFilePath);                                                                       // [0x199ae60] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPandoraService.SetFont
	// void SetFont(FString FontName, FString FontPath);                                                                        // [0x199ab30] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPandoraService.PlaySound
	// void PlaySound(FString ID);                                                                                              // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFPandoraService.PandoraLoadBrush
	// void PandoraLoadBrush(class UObject* Obj, FSlateBrush& Brush, FString InPath);                                           // [0x3a75280] Event|Public|HasOutParms|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFPandoraService.PandoraCreateUWidget
	// class UWidget* PandoraCreateUWidget(FString InPath);                                                                     // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFPandoraService.OpenApp
	// void OpenApp(FString AppID, FString OpenArgs);                                                                           // [0x19995f0] Final|Native|Public|BlueprintCallable|Const 
	// Function /Script/MFPluginWrapper.MFPandoraService.Open
	// void Open(int32_t Env, TMap<FString, FString>& UserData);                                                                // [0x1999480] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPandoraService.OnViewCreated
	// void OnViewCreated(class UUserWidget* Widget, FString AppInfo);                                                          // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFPandoraService.OnViewAboutToDestroy
	// void OnViewAboutToDestroy(class UUserWidget* Widget, FString AppInfo);                                                   // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFPandoraService.OnSDKMessage
	// int32_t OnSDKMessage(FString Msg);                                                                                       // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFPandoraService.OnReportData
	// int32_t OnReportData(FString EventName, FString Data);                                                                   // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFPandoraService.OnRefreshUserdata
	// int32_t OnRefreshUserdata();                                                                                             // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFPandoraService.Jump
	// void Jump(FString Type, FString Content);                                                                                // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFPandoraService.Init
	// bool Init();                                                                                                             // [0x1997b60] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPandoraService.GetCurrency
	// void GetCurrency(TMap<FString, FString>& Results);                                                                       // [0x3a75280] Event|Public|HasOutParms|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFPandoraService.GetAccountToken
	// void GetAccountToken(TMap<FString, FString>& Results);                                                                   // [0x3a75280] Event|Public|HasOutParms|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFPandoraService.DoCmdWithParams
	// void DoCmdWithParams(TMap<FString, FString>& Cmd);                                                                       // [0x1997160] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPandoraService.DoCmd
	// void DoCmd(FString Cmd);                                                                                                 // [0x19970c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPandoraService.Close
	// bool Close();                                                                                                            // [0x1996bd0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPandoraService.CallGameCmd
	// int32_t CallGameCmd(FString InCmd, int32_t Type);                                                                        // [0x3a75280] Event|Public|BlueprintEvent 
};

/// Class /Script/MFPluginWrapper.MFPWGetPluginManagerInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFPWGetPluginManagerInterface : public UInterface
{ 
public:
};

/// Class /Script/MFPluginWrapper.MFPWMessageHeader
/// Size: 0x0030 (48 bytes) (0x000028 - 0x000058) align 8 pad: 0x0000
class UMFPWMessageHeader : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x30];                                      // 0x0028   (0x0030)  MISSED
};

/// Class /Script/MFPluginWrapper.MFPWPluginManager
/// Size: 0x0068 (104 bytes) (0x000028 - 0x000090) align 8 pad: 0x0000
class UMFPWPluginManager : public UObject
{ 
public:
	SDK_UNDEFINED(80,648) /* TMap<UClass*, UMFPWPlugin*> */ __um(PluginMap);                                       // 0x0028   (0x0050)  
	unsigned char                                      UnknownData00_7[0x18];                                      // 0x0078   (0x0018)  MISSED


	/// Functions
	// Function /Script/MFPluginWrapper.MFPWPluginManager.TextFormatInterfaceIF
	// FText TextFormatInterfaceIF(FString FormatString, FString Parm1, int32_t Parm2, FString Parm3, float Parm4);             // [0x199cd90] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.TextFormatInterfaceI3
	// FText TextFormatInterfaceI3(FString FormatString, FString Parm1, int32_t Parm2, FString Parm3, int32_t Parm4, FString Parm5, int32_t Parm6); // [0x199c7e0] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.TextFormatInterfaceI2f
	// FText TextFormatInterfaceI2f(FString FormatString, FString Parm1, int32_t Parm2, FString Parm3, int32_t Parm4, FString Parm5, float Parm6); // [0x199c440] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.TextFormatInterfaceI2
	// FText TextFormatInterfaceI2(FString FormatString, FString Parm1, int32_t Parm2, FString Parm3, int32_t Parm4);           // [0x199c160] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.TextFormatInterfaceI
	// FText TextFormatInterfaceI(FString FormatString, FString Parm1, int32_t Parm2);                                          // [0x199cb80] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.TextFormatInterfaceFI
	// FText TextFormatInterfaceFI(FString FormatString, FString Parm1, float Parm2, FString Parm3, int32_t Parm4);             // [0x199be80] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.TextFormatInterfaceF3
	// FText TextFormatInterfaceF3(FString FormatString, FString Parm1, float Parm2, FString Parm3, float Parm4, FString Parm5, float Parm6); // [0x199b8c0] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.TextFormatInterfaceF2I
	// FText TextFormatInterfaceF2I(FString FormatString, FString Parm1, float Parm2, FString Parm3, float Parm4, FString Parm5, int32_t Parm6); // [0x199b510] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.TextFormatInterfaceF2
	// FText TextFormatInterfaceF2(FString FormatString, FString Parm1, float Parm2, FString Parm3, float Parm4);               // [0x199b230] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.TextFormatInterfaceF
	// FText TextFormatInterfaceF(FString FormatString, FString Parm1, float Parm2);                                            // [0x199bc70] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.OpenWebViewWithoutEncode
	// void OpenWebViewWithoutEncode(FString URL);                                                                              // [0x199a080] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.OpenWebViewWithEncodeDebug
	// void OpenWebViewWithEncodeDebug(FString URL, int32_t InOrientation);                                                     // [0x1999f60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.OpenWebViewWithEncode
	// void OpenWebViewWithEncode(FString URL, int32_t InOrientation);                                                          // [0x1999e40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.OpenWebViewInterface
	// void OpenWebViewInterface(FString URL, int32_t InOrientation, bool IsEncode, bool ShowDebugUrl, bool IsEmbedWebView);    // [0x1999c40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.OpenWebViewEx
	// void OpenWebViewEx(FString URL, int32_t InOrientation, bool bEncodeUrl);                                                 // [0x1999ae0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.OpenWebViewCustomerService
	// void OpenWebViewCustomerService(FString ScenceId, FString GameZone, FString ZoneName, FString RoleName, FString RoleId); // [0x19997d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.OpenWebView
	// void OpenWebView(FString URL);                                                                                           // [0x19996f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.OpenRateWindow
	// void OpenRateWindow();                                                                                                   // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.OpenGetIntelSDKVersion
	// FString OpenGetIntelSDKVersion();                                                                                        // [0x16b5450] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.OnTssServerLogin
	// void OnTssServerLogin(FString feature_name, int32_t feature_name_len, FString Data, int32_t data_len, int32_t data_crc); // [0x19992d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.NicoTest2
	// void NicoTest2(int32_t nParam, FString strParam, int32_t nParam2);                                                       // [0x1998a70] Final|Exec|Native|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.NicoTest
	// void NicoTest(int32_t nParam);                                                                                           // [0x1998bd0] Final|Exec|Native|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.L10NAsTimespan
	// FText L10NAsTimespan(FString Type, int32_t Hour, int32_t Minute, int32_t Second);                                        // [0x1998880] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.L10NAsTime
	// FText L10NAsTime(FString TimeZone, FString Type, int32_t Year, int32_t Month, int32_t Day, int32_t Hour, int32_t Minute, int32_t Second, int32_t Millisecond); // [0x19984f0] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.L10NAsNumberInt
	// FText L10NAsNumberInt(int64_t InputNumber);                                                                              // [0x1998400] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.L10NAsNumberFloat
	// FText L10NAsNumberFloat(double InputNumber);                                                                             // [0x1998320] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.L10NAsDateTime
	// FText L10NAsDateTime(FString TimeZone, FString Type, int32_t Year, int32_t Month, int32_t Day, int32_t Hour, int32_t Minute, int32_t Second, int32_t Millisecond); // [0x1997f90] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.L10NAsDate
	// FText L10NAsDate(FString TimeZone, FString Type, int32_t Year, int32_t Month, int32_t Day, int32_t Hour, int32_t Minute, int32_t Second, int32_t Millisecond); // [0x1997c00] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.IsEmulator
	// bool IsEmulator();                                                                                                       // [0x1997bc0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.GetMSDKEncodeUrl
	// FString GetMSDKEncodeUrl(FString URL);                                                                                   // [0x19976b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.GetMFPWPluginByClass
	// class UMFPWPlugin* GetMFPWPluginByClass(class UObject* WorldContextObject, class UClass* InClass);                       // [0x19975e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.GetEmulatorName
	// FString GetEmulatorName();                                                                                               // [0x1997410] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.GetDeviceId
	// void GetDeviceId();                                                                                                      // [0x19973f0] Final|Exec|Native|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.GetAdultType
	// FString GetAdultType();                                                                                                  // [0x1997320] Final|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.GenerateGuid
	// FString GenerateGuid();                                                                                                  // [0x19972a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.CustomPostValueS
	// void CustomPostValueS(FString Category, FString Key, FString InVal);                                                     // [0x1996f80] Final|Exec|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.CustomPostValueI
	// void CustomPostValueI(FString Category, FString Key, int32_t A);                                                         // [0x1996e50] Final|Exec|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.CustomPostValueF
	// void CustomPostValueF(FString Category, FString Key, float A);                                                           // [0x1996d20] Final|Exec|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.CustomEndTupleWrap
	// void CustomEndTupleWrap();                                                                                               // [0x1811c00] Final|Exec|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.CustomBeginTupleWrap
	// void CustomBeginTupleWrap(FString Category);                                                                             // [0x1996c90] Final|Exec|Native|Static|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.CppVMTest
	// void CppVMTest(int32_t nParam);                                                                                          // [0x1996c00] Final|Exec|Native|Public 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.CloseWebView
	// void CloseWebView();                                                                                                     // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.ChangeWebView
	// void ChangeWebView(FString Json);                                                                                        // [0x197b0e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFPWPluginManager.AddFriend
	// void AddFriend(FString Openid, class UObject* WorldContextObject, FString Channel);                                      // [0x1996970] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFTDMService
/// Size: 0x0008 (8 bytes) (0x000040 - 0x000048) align 8 pad: 0x0000
class UMFTDMService : public UMFGCloudService
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0040   (0x0008)  MISSED


	/// Functions
	// Function /Script/MFPluginWrapper.MFTDMService.UploadMessage
	// void UploadMessage(int32_t SrcId, FString EventName);                                                                    // [0x19a7990] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFTDMService.SetRouter
	// void SetRouter(bool bTest, FString URL);                                                                                 // [0x19a40a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFTDMService.InitTDM
	// bool InitTDM(FString& AppID, FString& AppChannel, FString& AppKey, bool bEnableReport, bool bEnableDeviceInfo);          // [0x19a1850] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFTDMService.Add
	// void Add(FString Key, FString Value, bool bIntKey);                                                                      // [0x19a0130] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFTGALiveService
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UMFTGALiveService : public UMFGCloudService
{ 
public:


	/// Functions
	// Function /Script/MFPluginWrapper.MFTGALiveService.OnTGACallbackUnreal
	// void OnTGACallbackUnreal(int32_t ClientType, FString Msg);                                                               // [0x197c730] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFTGALiveService.MFTGALiveSDKUpdateUserInfo
	// void MFTGALiveSDKUpdateUserInfo(FString JsonString);                                                                     // [0xd90890] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFTGALiveService.MFTGALiveSDKUpdateStartParams
	// void MFTGALiveSDKUpdateStartParams(FString JsonString);                                                                  // [0xd90890] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFTGALiveService.MFTGALiveSDKTVAvailable
	// bool MFTGALiveSDKTVAvailable(FString ProductId);                                                                         // [0x197cfe0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFTGALiveService.MFTGALiveSDKStartTV
	// bool MFTGALiveSDKStartTV(FString ProductId, int32_t SourceType);                                                         // [0x19a1f00] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFTGALiveService.MFTGALiveSDKQuitTGALiveSDK
	// bool MFTGALiveSDKQuitTGALiveSDK(FString JsonString);                                                                     // [0x197cfe0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFTGALiveService.MFTGALiveSDKInitialize
	// void MFTGALiveSDKInitialize(FString JsonString);                                                                         // [0x19a1e10] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFTGALiveService.MFTGALiveGetUrl
	// FString MFTGALiveGetUrl();                                                                                               // [0x19a1d90] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFPluginWrapper.MFVoiceObserver
/// Size: 0x0010 (16 bytes) (0x000040 - 0x000050) align 8 pad: 0x0000
class UMFVoiceObserver : public UMFPWObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x10];                                      // 0x0040   (0x0010)  MISSED
};

/// Class /Script/MFPluginWrapper.MFVoiceService
/// Size: 0x0028 (40 bytes) (0x000040 - 0x000068) align 8 pad: 0x0000
class UMFVoiceService : public UMFGCloudService
{ 
public:
	unsigned char                                      UnknownData00_3[0x20];                                      // 0x0040   (0x0020)  MISSED
	class UMFVoiceObserver*                            MFVoiceObserver;                                            // 0x0060   (0x0008)  


	/// Functions
	// Function /Script/MFPluginWrapper.MFVoiceService.UploadRecordedFile
	// int32_t UploadRecordedFile(FString FilePath);                                                                            // [0x19a7ac0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.UpdateCoordinate
	// int32_t UpdateCoordinate(FString RoomName, int64_t X, int64_t Y, int64_t Z, int64_t R);                                  // [0x19a77a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TextTranslate
	// int32_t TextTranslate(FString Text, int32_t srcLang, int32_t targetLang, int32_t nTimeoutMS);                            // [0x19a4450] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TextToStreamSpeechStop
	// int32_t TextToStreamSpeechStop();                                                                                        // [0x197ac50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TextToStreamSpeechStart
	// int32_t TextToStreamSpeechStart(FString Text, FString VoiceType, int32_t nTimeoutMS, FString FilePath);                  // [0x19a7550] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TextToSpeechFile
	// int32_t TextToSpeechFile(FString Text, int32_t lang, FString FilePath, int32_t VoiceType, float voiceRate, float Volume, int32_t nTimeoutMS); // [0x19a7280] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TextToSpeech
	// int32_t TextToSpeech(FString Text, int32_t lang, int32_t VoiceType, int32_t nTimeoutMS);                                 // [0x19a4450] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TestMic
	// int32_t TestMic();                                                                                                       // [0x19a7250] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TestHotFixOverloadReturnChild4
	// class UUserWidget* TestHotFixOverloadReturnChild4();                                                                     // [0xfa4030] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TestHotFixOverloadReturnChild2
	// TArray<int32_t> TestHotFixOverloadReturnChild2();                                                                        // [0x19a1d90] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TestHotFixOverloadReturnChild1
	// int32_t TestHotFixOverloadReturnChild1();                                                                                // [0x197ac50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TestHotFixOverloadParent
	// void TestHotFixOverloadParent(int32_t test1, bool test2, TArray<int32_t> test3, TMap<int32_t, FString> test4, TSet<FString> test5, FString test6, FMyHotfixStruct test7, FMyHotfixStruct& test8); // [0x19a6d90] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TestHotFixOverloadParamChild8
	// void TestHotFixOverloadParamChild8(class UMFVoiceService* test);                                                         // [0x19a6d00] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TestHotFixOverloadParamChild7
	// void TestHotFixOverloadParamChild7(FMyHotfixStruct& test);                                                               // [0x19a6c70] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TestHotFixOverloadParamChild6
	// void TestHotFixOverloadParamChild6(FMyHotfixStruct test);                                                                // [0x19a6bf0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TestHotFixOverloadParamChild5
	// void TestHotFixOverloadParamChild5(TArray<int32_t>& test);                                                               // [0x19a6b40] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TestHotFixOverloadParamChild4
	// void TestHotFixOverloadParamChild4(TArray<int32_t> test);                                                                // [0x19a6a50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TestHotFixOverloadParamChild3
	// void TestHotFixOverloadParamChild3(int32_t& test);                                                                       // [0x19a69c0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TestHotFixOverloadParamChild2
	// void TestHotFixOverloadParamChild2(int32_t test);                                                                        // [0x197ccf0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TestHotFixOverloadParamChild1
	// void TestHotFixOverloadParamChild1();                                                                                    // [0xd906a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TestHotFix7
	// class UObject* TestHotFix7(int32_t test1, bool test2, TArray<int32_t> test3, TMap<int32_t, FString> test4, TSet<FString> test5, FString test6, FMyHotfixStruct test7, FMyHotfixStruct& test8, class UUserWidget* test9); // [0x19a64b0] Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TestHotFix6
	// FMyHotfixStruct TestHotFix6(int32_t test1, bool test2, TArray<int32_t> test3, TMap<int32_t, FString> test4, TSet<FString> test5, FString test6, FMyHotfixStruct test7, FMyHotfixStruct& test8); // [0x19a5fe0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TestHotFix5
	// FString TestHotFix5(int32_t test1, bool test2, TArray<int32_t> test3, TMap<int32_t, FString> test4, TSet<FString> test5, FString test6, FMyHotfixStruct test7, FMyHotfixStruct& test8); // [0x19a5580] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TestHotFix4
	// TMap<int32_t, FString> TestHotFix4(int32_t test1, bool test2, TArray<int32_t> test3, TMap<int32_t, FString> test4, TSet<FString> test5, FString test6, FMyHotfixStruct test7, FMyHotfixStruct& test8); // [0x19a5a90] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TestHotFix3
	// TArray<int32_t> TestHotFix3(int32_t test1, bool test2, TArray<int32_t> test3, TMap<int32_t, FString> test4, TSet<FString> test5, FString test6, FMyHotfixStruct test7, FMyHotfixStruct& test8); // [0x19a5580] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TestHotFix2
	// bool TestHotFix2(int32_t& test1, bool& test2, TArray<int32_t>& test3, TMap<int32_t, FString>& test4, TSet<FString>& test5, FString& test6, FMyHotfixStruct test7, FMyHotfixStruct& test8); // [0x19a51a0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.TestHotFix1
	// int32_t TestHotFix1(int32_t test1, bool test2, TArray<int32_t> test3, TMap<int32_t, FString> test4, TSet<FString> test5, FString test6, FMyHotfixStruct test7, FMyHotfixStruct& test8); // [0x19a4ce0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.StopRecording
	// int32_t StopRecording();                                                                                                 // [0x19a4cb0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.StopPlayFile
	// int32_t StopPlayFile();                                                                                                  // [0x19a4c80] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.StartRecording
	// int32_t StartRecording(FString FilePath);                                                                                // [0x19a4b80] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.SpeechTranslate
	// int32_t SpeechTranslate(FString fileID, int32_t srcLang, int32_t targetLang, int32_t transType, int32_t nTimeoutMS);     // [0x19a4990] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.SpeechToText
	// int32_t SpeechToText(FString fileID, EMFVoiceLanguage Language);                                                         // [0x19a4860] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.SpeechFileTranslate
	// int32_t SpeechFileTranslate(FString FilePath, int32_t srcLang, int32_t targetLang, int32_t VoiceType, float voiceRate, float Volume, int32_t nTimeoutMS); // [0x19a45f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.SpeechFileToText
	// int32_t SpeechFileToText(FString FilePath, int32_t srcLang, int32_t targetLang, int32_t nTimeoutMS);                     // [0x19a4450] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.SetVoiceMode
	// int32_t SetVoiceMode(int32_t VoiceMode);                                                                                 // [0x19a43b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.SetTransSecInfo
	// void SetTransSecInfo(FString secInfo);                                                                                   // [0xd90890] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.SetSpeakerVolume
	// int32_t SetSpeakerVolume(int32_t Volume);                                                                                // [0x19a4310] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.SetServerInfo
	// int32_t SetServerInfo(FString URL, FString defaultipsvr);                                                                // [0x19a4190] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.SetRSTTServerInfo
	// int32_t SetRSTTServerInfo(FString RSTTUrl, FString httpDnsIPs, FString wxAppID);                                         // [0x19a3bc0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.SetReportedPlayerInfo
	// int32_t SetReportedPlayerInfo(TArray<FString> cszOpenID, TArray<int32_t> nMemberID, int32_t nCount);                     // [0x19a3e60] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.SetReportBufferTime
	// void SetReportBufferTime(int32_t nTimeSec);                                                                              // [0x19a3dd0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.SetPlayerVolume
	// int32_t SetPlayerVolume(FString PlayerId, int32_t vol);                                                                  // [0x19a3ad0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.SetMicVolume
	// int32_t SetMicVolume(int32_t Volume);                                                                                    // [0x19a3a30] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.SetCivilBinPath
	// int32_t SetCivilBinPath(FString pPath);                                                                                  // [0x19a3930] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.SetBitRate
	// int32_t SetBitRate(int32_t bitrate);                                                                                     // [0x198dda0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.SetAudience
	// int32_t SetAudience(TArray<int32_t> members, int32_t Count, FString RoomName);                                           // [0x19a3770] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.SetAppInfo
	// int32_t SetAppInfo(FString AppID, FString AppKey, FString Openid);                                                       // [0x19a3560] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.Set3DUpward
	// int32_t Set3DUpward(float X, float Y, float Z);                                                                          // [0x19a3440] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.Set3DPosition
	// int32_t Set3DPosition(float X, float Y, float Z);                                                                        // [0x19a3320] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.Set3DForward
	// int32_t Set3DForward(float X, float Y, float Z);                                                                         // [0x19a3200] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.Set3DDistProperties
	// int32_t Set3DDistProperties(int32_t attenuationModel, float minDis, float maxDis, float rollOff);                        // [0x19a30a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.RSTSSpeechToText
	// int32_t RSTSSpeechToText(int32_t srcLang, TArray<int32_t> pTargetLangs, int32_t nTargetLangCnt, int32_t nTimeoutMS);     // [0x19a2d00] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.RSTSSpeechToSpeech
	// int32_t RSTSSpeechToSpeech(int32_t srcLang, TArray<int32_t> pTargetLangs, int32_t nTargetLangCnt, FString dirPath, int32_t VoiceType, float voiceRate, float Volume, int32_t nTimeoutMS); // [0x19a29f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.ReportPlayer
	// int32_t ReportPlayer(TArray<FString> cszOpenID, int32_t nCount, FString cszInfo);                                        // [0x19a2ea0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.QuitRoom
	// int32_t QuitRoom(FString RoomName);                                                                                      // [0x19a28f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.QueryPermission
	// int32_t QueryPermission();                                                                                               // [0x197ac50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.PlayRecordedFile
	// int32_t PlayRecordedFile(FString FilePath);                                                                              // [0x19a27f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.OpenSpeaker
	// int32_t OpenSpeaker();                                                                                                   // [0x19a27c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.OpenMic
	// int32_t OpenMic();                                                                                                       // [0x19a2790] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.OnVoiceRecording
	// void OnVoiceRecording();                                                                                                 // [0x198d280] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFVoiceService.OnUploadedFile
	// void OnUploadedFile(int32_t code, FString FilePath, FString fileID);                                                     // [0x198d140] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFVoiceService.OnStreamSpeechToTextDone
	// void OnStreamSpeechToTextDone(int32_t code, int32_t Error, FString Result, FString VoicePath);                           // [0x198cfc0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFVoiceService.OnStatusUpdate
	// void OnStatusUpdate(int32_t status, FString RoomName, int32_t memberID);                                                 // [0x198c6e0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFVoiceService.OnSpeechToTextDone
	// void OnSpeechToTextDone(int32_t code, FString fileID, FString Result);                                                   // [0x198cd50] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFVoiceService.OnRoomMemberInfo
	// void OnRoomMemberInfo(int32_t code, FString RoomName, int32_t memid, FString Openid);                                    // [0x19a2610] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFVoiceService.OnReportPlayer
	// void OnReportPlayer(int32_t code, FString cszInfo);                                                                      // [0x19a2530] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFVoiceService.OnQuitedRoom
	// void OnQuitedRoom(int32_t code, FString RoomName);                                                                       // [0x198caf0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFVoiceService.OnPlayedRecordedFile
	// void OnPlayedRecordedFile(int32_t code, FString FilePath);                                                               // [0x198ca10] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFVoiceService.OnMultiRoomMemberVoice
	// void OnMultiRoomMemberVoice(FString RoomName, int32_t memid, int32_t status);                                            // [0x19a2400] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFVoiceService.OnMemberVoice
	// void OnMemberVoice(int32_t memid, int32_t status);                                                                       // [0x19a2330] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFVoiceService.OnJoinedRoom
	// void OnJoinedRoom(int32_t code, FString RoomName, int32_t memberID);                                                     // [0x19a2200] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFVoiceService.OnIOSPermissionRequestReturn
	// void OnIOSPermissionRequestReturn(bool status);                                                                          // [0x19a2170] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.OnEvent
	// void OnEvent(int32_t Event, FString Info);                                                                               // [0x198c570] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFVoiceService.OnDownloadedFile
	// void OnDownloadedFile(int32_t code, FString FilePath, FString fileID);                                                   // [0x198c430] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFVoiceService.OnAppliedMessageKey
	// void OnAppliedMessageKey(int32_t code);                                                                                  // [0x198c3a0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFVoiceService.OnAndroidPermissionRequestReturn
	// void OnAndroidPermissionRequestReturn(TArray<FString>& Permissions, TArray<bool>& GrantResults);                         // [0x19a2030] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.JoinTeamRoom
	// int32_t JoinTeamRoom(FString RoomName);                                                                                  // [0x19a1c90] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.JoinRangeRoom
	// int32_t JoinRangeRoom(FString RoomName);                                                                                 // [0x19a1b90] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.JoinNationalRoom
	// int32_t JoinNationalRoom(FString RoomName);                                                                              // [0x19a1a90] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.IsSpeaking
	// bool IsSpeaking();                                                                                                       // [0x19a1a60] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFPluginWrapper.MFVoiceService.InitMFVoiceEngine
	// int32_t InitMFVoiceEngine(FString AppID, FString AppKey, FString Openid);                                                // [0x19a1640] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.GetSpeakerState
	// int32_t GetSpeakerState();                                                                                               // [0x19a1610] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.GetSpeakerLevel
	// int32_t GetSpeakerLevel();                                                                                               // [0x19a15e0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.GetRoomMembers
	// int32_t GetRoomMembers(FString RoomName);                                                                                // [0x19a1530] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.GetPlayerVolume
	// int32_t GetPlayerVolume(FString PlayerId);                                                                               // [0x19a1480] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.GetMicState
	// int32_t GetMicState();                                                                                                   // [0x19a1450] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.GetMicLevel
	// int32_t GetMicLevel(bool FadeOut);                                                                                       // [0x19a13b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.GetFileTime
	// float GetFileTime(FString FilePath);                                                                                     // [0x19a12b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.GetAudioDeviceConnectionState
	// int32_t GetAudioDeviceConnectionState();                                                                                 // [0x19a1280] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.GameResume
	// int32_t GameResume();                                                                                                    // [0x19a1250] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.GamePause
	// int32_t GamePause();                                                                                                     // [0x19a1220] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.ForbidMemberVoice
	// int32_t ForbidMemberVoice(int32_t member, bool enable, FString RoomName);                                                // [0x19a10a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.EnableTranslate
	// int32_t EnableTranslate(FString RoomName, bool bEnable, int32_t myLang, int32_t transType);                              // [0x19a0ef0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.EnableSpeakerOn
	// int32_t EnableSpeakerOn(bool enable);                                                                                    // [0x19a0e50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.EnableRoomSpeaker
	// int32_t EnableRoomSpeaker(FString RoomName, bool enable);                                                                // [0x19a0d10] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.EnableRoomMicrophone
	// int32_t EnableRoomMicrophone(FString RoomName, bool enable);                                                             // [0x19a0bd0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.EnableReportALLAbroad
	// int32_t EnableReportALLAbroad(bool bEnable);                                                                             // [0x19a0b30] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.EnableReportALL
	// int32_t EnableReportALL(bool bEnable);                                                                                   // [0x19a0a90] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.EnableMultiRoom
	// int32_t EnableMultiRoom(bool enable);                                                                                    // [0x19a09f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.EnableLogCallBack
	// int32_t EnableLogCallBack(bool bEnable);                                                                                 // [0x19a0950] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.EnableLog
	// void EnableLog(bool bEnable);                                                                                            // [0x19a08c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.EnableCivilVoice
	// int32_t EnableCivilVoice(bool bEnable);                                                                                  // [0x19a0820] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.EnableCivilFile
	// int32_t EnableCivilFile(bool bEnable);                                                                                   // [0x19a0780] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.EnableBluetoothSCO
	// int32_t EnableBluetoothSCO(bool enable);                                                                                 // [0x19a06e0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.Enable3DVoiceRoom
	// int32_t Enable3DVoiceRoom(FString RoomName, bool bEnable);                                                               // [0x19a05a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.Enable3DVoice
	// int32_t Enable3DVoice(bool bEnable);                                                                                     // [0x19a0500] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.DownloadRecordedFile
	// int32_t DownloadRecordedFile(FString fileID, FString DownloadFilePath);                                                  // [0x19a0380] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.CloseSpeaker
	// int32_t CloseSpeaker();                                                                                                  // [0x19a0350] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.CloseMic
	// int32_t CloseMic();                                                                                                      // [0x19a0320] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.CheckPermission
	// int32_t CheckPermission();                                                                                               // [0x197ac50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.ApplyMessageKey
	// int32_t ApplyMessageKey();                                                                                               // [0x19a02f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFVoiceService.ApplicationWillEnterBackground
	// void ApplicationWillEnterBackground();                                                                                   // [0x19820f0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFVoiceService.ApplicationWillDeactivate
	// void ApplicationWillDeactivate();                                                                                        // [0x16b0bb0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFVoiceService.ApplicationHasReactivated
	// void ApplicationHasReactivated();                                                                                        // [0x198b080] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFPluginWrapper.MFVoiceService.ApplicationHasEnteredForeground
	// void ApplicationHasEnteredForeground();                                                                                  // [0x198b060] Native|Event|Public|BlueprintEvent 
};

/// Class /Script/MFPluginWrapper.MFWeGameObserver
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UMFWeGameObserver : public UMFPWObject
{ 
public:
};

/// Class /Script/MFPluginWrapper.MFWeGamePlugin
/// Size: 0x0030 (48 bytes) (0x000040 - 0x000070) align 8 pad: 0x0000
class UMFWeGamePlugin : public UMFPWPlugin
{ 
public:
	unsigned char                                      UnknownData00_3[0x20];                                      // 0x0040   (0x0020)  MISSED
	class UMFWeGameObserver*                           WeGameObserver;                                             // 0x0060   (0x0008)  
	unsigned char                                      UnknownData01_7[0x8];                                       // 0x0068   (0x0008)  MISSED


	/// Functions
	// Function /Script/MFPluginWrapper.MFWeGamePlugin.IsWeGameInited
	// bool IsWeGameInited();                                                                                                   // [0x19a8430] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFWeGamePlugin.GetPlugin
	// class UMFWeGamePlugin* GetPlugin(class UObject* WorldContextObject);                                                     // [0x19a8350] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFWeGamePlugin.GetPlayerIDString
	// FString GetPlayerIDString();                                                                                             // [0x19a82d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFWeGamePlugin.GetCurrentServerName
	// FString GetCurrentServerName();                                                                                          // [0x19a8250] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFWeGamePlugin.GetCurrentServerAddress
	// FString GetCurrentServerAddress();                                                                                       // [0x19a81d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFWeGamePlugin.AsyncCreateBrowser
	// bool AsyncCreateBrowser(FString URL, int32_t Width, int32_t Height);                                                     // [0x19a8060] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFPluginWrapper.MFWeGamePlugin.AquireGameToken
	// void AquireGameToken();                                                                                                  // [0x19a8040] Final|Native|Public|BlueprintCallable 
};

/// Struct /Script/MFPluginWrapper.PufferTaskInfo
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 8 pad: 0x0000
struct FPufferTaskInfo
{ 
	int32_t                                            TaskId;                                                     // 0x0000   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0004   (0x0004)  MISSED
	FString                                            TaskName;                                                   // 0x0008   (0x0010)  
	EPufferTaskState                                   TaskState;                                                  // 0x0018   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0019   (0x0003)  MISSED
	int32_t                                            NowSize;                                                    // 0x001C   (0x0004)  
	int32_t                                            TotalSize;                                                  // 0x0020   (0x0004)  
	bool                                               bIsFileTask;                                                // 0x0024   (0x0001)  
	bool                                               bIsBatchTask;                                               // 0x0025   (0x0001)  
	bool                                               bIsRestoreTask;                                             // 0x0026   (0x0001)  
	unsigned char                                      UnknownData02_7[0x1];                                       // 0x0027   (0x0001)  MISSED
};

/// Struct /Script/MFPluginWrapper.PufferInitConfigData
/// Size: 0x00A8 (168 bytes) (0x000000 - 0x0000A8) align 8 pad: 0x0000
struct FPufferInitConfigData
{ 
	int32_t                                            MaxDownloadSpeed;                                           // 0x0000   (0x0004)  
	int32_t                                            MaxDownTask;                                                // 0x0004   (0x0004)  
	int32_t                                            MaxDownloadsPerTask;                                        // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	int64_t                                            PufferProductId;                                            // 0x0010   (0x0008)  
	int32_t                                            NeedCheck;                                                  // 0x0018   (0x0004)  
	int32_t                                            NeedFileRestore;                                            // 0x001C   (0x0004)  
	int32_t                                            RemoveOldWhenUpdate;                                        // 0x0020   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0024   (0x0004)  MISSED
	FString                                            StrSourceDir;                                               // 0x0028   (0x0010)  
	FString                                            StrPufferServerUrl;                                         // 0x0038   (0x0010)  
	FString                                            StrPufferGroupMarkId;                                       // 0x0048   (0x0010)  
	FString                                            strUserID;                                                  // 0x0058   (0x0010)  
	int64_t                                            PufferGameId;                                               // 0x0068   (0x0008)  
	int32_t                                            PufferUpdateType;                                           // 0x0070   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x0074   (0x0004)  MISSED
	int64_t                                            PufferDolphinProductId;                                     // 0x0078   (0x0008)  
	FString                                            StrDolphinAppVersion;                                       // 0x0080   (0x0010)  
	FString                                            StrDolphinResVersion;                                       // 0x0090   (0x0010)  
	int32_t                                            EnableIOSBGDownload;                                        // 0x00A0   (0x0004)  
	int32_t                                            ShowFileList;                                               // 0x00A4   (0x0004)  
};

/// Struct /Script/MFPluginWrapper.MyHotfixStruct
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 4 pad: 0x0000
struct FMyHotfixStruct
{ 
	int32_t                                            A;                                                          // 0x0000   (0x0004)  
	int32_t                                            B;                                                          // 0x0004   (0x0004)  
};

static_assert(sizeof(UMFPWObject) == 0x0040); // 64 bytes (0x000028 - 0x000040)
static_assert(sizeof(UMFPWPlugin) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UMFACEPlugin) == 0x0048); // 72 bytes (0x000040 - 0x000048)
static_assert(sizeof(UMFGCloudService) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UMFBoxService) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UMFComplianceService) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UMFCTIPayObserver) == 0x0088); // 136 bytes (0x000040 - 0x000088)
static_assert(sizeof(UMFCustomerService) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UMFGCloudCommonStatics) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFGCloudCrashObserver) == 0x0130); // 304 bytes (0x000040 - 0x000130)
static_assert(sizeof(UMFGCloudCrashService) == 0x0110); // 272 bytes (0x000040 - 0x000110)
static_assert(sizeof(UMFGCloudDolphinService) == 0x00A0); // 160 bytes (0x000040 - 0x0000A0)
static_assert(sizeof(UMFGCloudFriendObserver) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UMFGCloudFriendService) == 0x0108); // 264 bytes (0x000040 - 0x000108)
static_assert(sizeof(UMFGCloudGroupObserver) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UMFGCloudGroupService) == 0x0048); // 72 bytes (0x000040 - 0x000048)
static_assert(sizeof(UMFGCloudLoginObserver) == 0x0050); // 80 bytes (0x000040 - 0x000050)
static_assert(sizeof(UMFGCloudLoginService) == 0x00B8); // 184 bytes (0x000040 - 0x0000B8)
static_assert(sizeof(UMFGCloudMessageHandler) == 0x0030); // 48 bytes (0x000028 - 0x000030)
static_assert(sizeof(UMFGCloudMessageHandlerAce) == 0x0030); // 48 bytes (0x000030 - 0x000030)
static_assert(sizeof(UMFGCloudMessageHandlerChildTss) == 0x0060); // 96 bytes (0x000030 - 0x000060)
static_assert(sizeof(UMFGCloudMessageObserver) == 0x0160); // 352 bytes (0x000040 - 0x000160)
static_assert(sizeof(UMFGCloudMessageService) == 0x0058); // 88 bytes (0x000040 - 0x000058)
static_assert(sizeof(UMFGCloudNetWorkStateObserver) == 0x0058); // 88 bytes (0x000040 - 0x000058)
static_assert(sizeof(UMFGCloudNetWorkStateService) == 0x0048); // 72 bytes (0x000040 - 0x000048)
static_assert(sizeof(FMSDKNoticeTextInfo) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(sizeof(FMSDKNoticePictureInfo) == 0x0048); // 72 bytes (0x000000 - 0x000048)
static_assert(sizeof(FMSDKNoticeInfo) == 0x00A0); // 160 bytes (0x000000 - 0x0000A0)
static_assert(sizeof(FMSDKNoticeReturnData) == 0x0060); // 96 bytes (0x000000 - 0x000060)
static_assert(sizeof(UMFGCloudNotice) == 0x0100); // 256 bytes (0x000040 - 0x000100)
static_assert(sizeof(UMFGCloudPlugin) == 0x0090); // 144 bytes (0x000040 - 0x000090)
static_assert(sizeof(UMFGCloudPufferService) == 0x0160); // 352 bytes (0x000040 - 0x000160)
static_assert(sizeof(UMFGCloudRobotService) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UMFGCloudSetting) == 0x0120); // 288 bytes (0x000028 - 0x000120)
static_assert(sizeof(UMFGCloudTGPAObserver) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UMFGCloudTGPAService) == 0x0048); // 72 bytes (0x000040 - 0x000048)
static_assert(sizeof(UMFGCloudToolsObserver) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UMFGCloudToolsService) == 0x0048); // 72 bytes (0x000040 - 0x000048)
static_assert(sizeof(UMFGCloudTssService) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UMFGCloudWebViewObserver) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UMFGCloudWebViewService) == 0x0050); // 80 bytes (0x000040 - 0x000050)
static_assert(sizeof(UMFGCloudXGObserver) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UMFGCloudXGService) == 0x0060); // 96 bytes (0x000040 - 0x000060)
static_assert(sizeof(UMFGMEObserver) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UMFGMEService) == 0x00B0); // 176 bytes (0x000040 - 0x0000B0)
static_assert(sizeof(UMFGPMAgent) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFGPMHelperFunctionLibrary) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFIntlLoginObserver) == 0x0068); // 104 bytes (0x000040 - 0x000068)
static_assert(sizeof(UMFIntlWebViewObserver) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UMFIOSRuntimeHelper) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFLBSObserver) == 0x0050); // 80 bytes (0x000040 - 0x000050)
static_assert(sizeof(UMFLBSService) == 0x0048); // 72 bytes (0x000040 - 0x000048)
static_assert(sizeof(UMFMidasObserver) == 0x0068); // 104 bytes (0x000040 - 0x000068)
static_assert(sizeof(UMFMidasService) == 0x00A0); // 160 bytes (0x000040 - 0x0000A0)
static_assert(sizeof(UMFMNAService) == 0x0050); // 80 bytes (0x000040 - 0x000050)
static_assert(sizeof(UMFPandoraService) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UMFPWGetPluginManagerInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFPWMessageHeader) == 0x0058); // 88 bytes (0x000028 - 0x000058)
static_assert(sizeof(UMFPWPluginManager) == 0x0090); // 144 bytes (0x000028 - 0x000090)
static_assert(sizeof(UMFTDMService) == 0x0048); // 72 bytes (0x000040 - 0x000048)
static_assert(sizeof(UMFTGALiveService) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UMFVoiceObserver) == 0x0050); // 80 bytes (0x000040 - 0x000050)
static_assert(sizeof(UMFVoiceService) == 0x0068); // 104 bytes (0x000040 - 0x000068)
static_assert(sizeof(UMFWeGameObserver) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UMFWeGamePlugin) == 0x0070); // 112 bytes (0x000040 - 0x000070)
static_assert(sizeof(FPufferTaskInfo) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(FPufferInitConfigData) == 0x00A8); // 168 bytes (0x000000 - 0x0000A8)
static_assert(sizeof(FMyHotfixStruct) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(offsetof(UMFGCloudCrashService, CrashObserver) == 0x0040);
static_assert(offsetof(UMFGCloudFriendService, Image) == 0x00E0);
static_assert(offsetof(UMFGCloudFriendService, InDyTexture) == 0x00E8);
static_assert(offsetof(UMFGCloudFriendService, MFGCloudFriendObserver) == 0x0100);
static_assert(offsetof(UMFGCloudGroupService, MFGCloudGroupObserver) == 0x0040);
static_assert(offsetof(UMFGCloudLoginService, LoginObserver) == 0x0040);
static_assert(offsetof(UMFGCloudLoginService, IntlLoginObserver) == 0x0048);
static_assert(offsetof(UMFGCloudMessageObserver, SendPkgHeader) == 0x0060);
static_assert(offsetof(UMFGCloudMessageObserver, RecvPkgHeader) == 0x0068);
static_assert(offsetof(UMFGCloudMessageService, MsgHandlerArr) == 0x0040);
static_assert(offsetof(UMFGCloudMessageService, ConnectorObserver) == 0x0050);
static_assert(offsetof(UMFGCloudNetWorkStateService, NetworkObserver) == 0x0040);
static_assert(offsetof(FMSDKNoticeTextInfo, NoticeTitle) == 0x0000);
static_assert(offsetof(FMSDKNoticeTextInfo, NoticeContent) == 0x0010);
static_assert(offsetof(FMSDKNoticeTextInfo, NoticeRedirectUrl) == 0x0020);
static_assert(offsetof(FMSDKNoticePictureInfo, NoticePicUrl) == 0x0000);
static_assert(offsetof(FMSDKNoticePictureInfo, NoticePicHashcode) == 0x0010);
static_assert(offsetof(FMSDKNoticePictureInfo, NoticePicTitle) == 0x0020);
static_assert(offsetof(FMSDKNoticePictureInfo, NoticePicSize) == 0x0030);
static_assert(offsetof(FMSDKNoticeInfo, NoticeGroup) == 0x0008);
static_assert(offsetof(FMSDKNoticeInfo, Language) == 0x0030);
static_assert(offsetof(FMSDKNoticeInfo, TextInfo) == 0x0040);
static_assert(offsetof(FMSDKNoticeInfo, PicUrlList) == 0x0070);
static_assert(offsetof(FMSDKNoticeInfo, WebUrl) == 0x0080);
static_assert(offsetof(FMSDKNoticeInfo, extraJson) == 0x0090);
static_assert(offsetof(FMSDKNoticeReturnData, RetMsg) == 0x0008);
static_assert(offsetof(FMSDKNoticeReturnData, ThirdMsg) == 0x0020);
static_assert(offsetof(FMSDKNoticeReturnData, extraJson) == 0x0030);
static_assert(offsetof(FMSDKNoticeReturnData, RequestID) == 0x0040);
static_assert(offsetof(FMSDKNoticeReturnData, NoticeInfoList) == 0x0050);
static_assert(offsetof(UMFGCloudNotice, LastReturnData) == 0x0050);
static_assert(offsetof(UMFGCloudNotice, CachedGroup) == 0x00B0);
static_assert(offsetof(UMFGCloudNotice, CachedLanguage) == 0x00C0);
static_assert(offsetof(UMFGCloudNotice, CachedRegion) == 0x00D0);
static_assert(offsetof(UMFGCloudNotice, CachedPartition) == 0x00E0);
static_assert(offsetof(UMFGCloudNotice, CachedExtra) == 0x00F0);
static_assert(offsetof(UMFGCloudSetting, TbusppProjectName) == 0x0028);
static_assert(offsetof(UMFGCloudSetting, TbusppGameID) == 0x0038);
static_assert(offsetof(UMFGCloudSetting, TbusppServiceName) == 0x0048);
static_assert(offsetof(UMFGCloudSetting, GameId) == 0x0058);
static_assert(offsetof(UMFGCloudSetting, GameKey) == 0x0068);
static_assert(offsetof(UMFGCloudSetting, QQAppID) == 0x0078);
static_assert(offsetof(UMFGCloudSetting, QQAppKey) == 0x0088);
static_assert(offsetof(UMFGCloudSetting, WeiXinAppID) == 0x0098);
static_assert(offsetof(UMFGCloudSetting, WeiXinAppKey) == 0x00A8);
static_assert(offsetof(UMFGCloudSetting, MSDK_GAME_ID) == 0x00B8);
static_assert(offsetof(UMFGCloudSetting, MSDK_SDK_Key) == 0x00C8);
static_assert(offsetof(UMFGCloudSetting, ConnectorDHP) == 0x00D8);
static_assert(offsetof(UMFGCloudSetting, GRobotGameCode) == 0x00F8);
static_assert(offsetof(UMFGCloudSetting, WeGameID) == 0x0110);
static_assert(offsetof(UMFGCloudTGPAService, GCLoudTGPAObserver) == 0x0040);
static_assert(offsetof(UMFGCloudToolsService, ToolsObserver) == 0x0040);
static_assert(offsetof(UMFGCloudWebViewService, WebViewObserver) == 0x0040);
static_assert(offsetof(UMFGCloudWebViewService, IntlWebViewObserver) == 0x0048);
static_assert(offsetof(UMFGCloudXGService, XGObserver) == 0x0040);
static_assert(offsetof(UMFGMEService, gmeObserver) == 0x0060);
static_assert(offsetof(UMFGMEService, mRoomId) == 0x0098);
static_assert(offsetof(UMFLBSService, LBSObserver) == 0x0040);
static_assert(offsetof(UMFMidasService, MFMidasObserver) == 0x0088);
static_assert(offsetof(UMFMidasService, MFCTIPayObserver) == 0x0090);
static_assert(offsetof(UMFMNAService, StartingWidgetClass) == 0x0040);
static_assert(offsetof(UMFMNAService, CurrentWidget) == 0x0048);
static_assert(offsetof(UMFVoiceService, MFVoiceObserver) == 0x0060);
static_assert(offsetof(UMFWeGamePlugin, WeGameObserver) == 0x0060);
static_assert(offsetof(FPufferTaskInfo, TaskName) == 0x0008);
static_assert(offsetof(FPufferTaskInfo, TaskState) == 0x0018);
static_assert(offsetof(FPufferInitConfigData, StrSourceDir) == 0x0028);
static_assert(offsetof(FPufferInitConfigData, StrPufferServerUrl) == 0x0038);
static_assert(offsetof(FPufferInitConfigData, StrPufferGroupMarkId) == 0x0048);
static_assert(offsetof(FPufferInitConfigData, strUserID) == 0x0058);
static_assert(offsetof(FPufferInitConfigData, StrDolphinAppVersion) == 0x0080);
static_assert(offsetof(FPufferInitConfigData, StrDolphinResVersion) == 0x0090);
