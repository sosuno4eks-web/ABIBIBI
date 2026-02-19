
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

/// Enum /Script/INTLCore.FINTLFunnelStep
/// Size: 0x01 (1 bytes)
enum class FINTLFunnelStep : uint8_t
{
	kStartAppLaunch                                                                  = 0,
	kAgreementShowUserAgreement                                                      = 1,
	kAgreementFinishUserAgreement                                                    = 2,
	kUpdateCheckForUpdates                                                           = 3,
	kUpdateDownloadUpdates                                                           = 4,
	kUpdateUnzipFiles                                                                = 5,
	kUpdateCompleteUpdates                                                           = 6,
	kAuthConfirmLoginChannel                                                         = 7,
	kAuthChannelAuthSuccess                                                          = 8,
	kAuthLoginAuthSuccess                                                            = 9,
	kPolicyQueryCompliance                                                           = 10,
	kPolicySelectRegionAndAge                                                        = 11,
	kPolicyAgreePrivacyPolicy                                                        = 12,
	kPolicyPrivacyAuthSucess                                                         = 13,
	kNavigateShowServerList                                                          = 14,
	kNavigateSubmitArea                                                              = 15,
	kNavigateConfirmArea                                                             = 16,
	kNavigateConnectSvrSuccess                                                       = 17,
	kEnterGameShowEnterGame                                                          = 18,
	kEnterGameClickIntoGame                                                          = 19,
	kLobbyEnterLobbySuccess                                                          = 20,
	kPayAuthentication                                                               = 21,
	kPayPullUpTheListOfGoods                                                         = 22,
	kPayPullUpPriceList                                                              = 23,
	kPayStartOrder                                                                   = 24,
	kPaySuccessfulOrder                                                              = 25,
	kPayStartPayment                                                                 = 26,
	kPaySuccessfulPayment                                                            = 27,
	kPayStartDelivery                                                                = 28,
	kPaySuccessfulDelivery                                                           = 29,
	kAuthRegisterSuccess                                                             = 30
};

/// Enum /Script/INTLCore.EPGNAModule
/// Size: 0x01 (1 bytes)
enum class EPGNAModule : uint8_t
{
	EPGNAModule__kPGNAModuleUnknow                                                   = 0,
	EPGNAModule__kPGNAModuleDialTest                                                 = 1,
	EPGNAModule__kPGNAModuleAccelerator                                              = 2,
	EPGNAModule__kPGNAModuleAll                                                      = 3
};

/// Enum /Script/INTLCore.EINTLUpdateStep
/// Size: 0x01 (1 bytes)
enum class EINTLUpdateStep : uint8_t
{
	EINTLUpdateStep__kUnknown                                                        = 0,
	EINTLUpdateStep__kFirstResourceAnalyze                                           = 1,
	EINTLUpdateStep__kCheckUpdate                                                    = 2,
	EINTLUpdateStep__kDownload                                                       = 3
};

/// Enum /Script/INTLCore.EINTLUpdateResourceCopyType
/// Size: 0x01 (1 bytes)
enum class EINTLUpdateResourceCopyType : uint8_t
{
	EINTLUpdateResourceCopyType__kUnknown                                            = 0,
	EINTLUpdateResourceCopyType__kCopyAll                                            = 1,
	EINTLUpdateResourceCopyType__kCopyOnDemand                                       = 2
};

/// Enum /Script/INTLCore.EINTLUpdateActionType
/// Size: 0x01 (1 bytes)
enum class EINTLUpdateActionType : uint8_t
{
	EINTLUpdateActionType__kUnknown                                                  = 0,
	EINTLUpdateActionType__kAppUpdate                                                = 1,
	EINTLUpdateActionType__kResourceUpdate                                           = 2,
	EINTLUpdateActionType__kResourceRepair                                           = 3
};

/// Enum /Script/INTLCore.EINTLUpdateNewVersionType
/// Size: 0x01 (1 bytes)
enum class EINTLUpdateNewVersionType : uint8_t
{
	EINTLUpdateNewVersionType__kUnknown                                              = 0,
	EINTLUpdateNewVersionType__kNoNeedUpdate                                         = 1,
	EINTLUpdateNewVersionType__kOptionalUpdate                                       = 2,
	EINTLUpdateNewVersionType__kForcibleUpdate                                       = 3
};

/// Enum /Script/INTLCore.EINTLCrashLevel
/// Size: 0x01 (1 bytes)
enum class EINTLCrashLevel : uint8_t
{
	EINTLCrashLevel__LogLevelZero                                                    = 0
};

/// Enum /Script/INTLCore.EINTLWebViewOrientation
/// Size: 0x01 (1 bytes)
enum class EINTLWebViewOrientation : uint8_t
{
	EINTLWebViewOrientation__kAuto                                                   = 0,
	EINTLWebViewOrientation__kPortrait                                               = 1,
	EINTLWebViewOrientation__kLandscape                                              = 2
};

/// Enum /Script/INTLCore.EINTLFriendReqType
/// Size: 0x01 (1 bytes)
enum class EINTLFriendReqType : uint8_t
{
	EINTLFriendReqType__kReqText                                                     = 0,
	EINTLFriendReqType__kReqLink                                                     = 1,
	EINTLFriendReqType__kReqImage                                                    = 2,
	EINTLFriendReqType__kReqInvite                                                   = 3,
	EINTLFriendReqType__kReqVideo                                                    = 4
};

/// Enum /Script/INTLCore.EPermissionType
/// Size: 0x01 (1 bytes)
enum class EPermissionType : uint8_t
{
	EPermissionType__kPermissionTypeNone                                             = 0,
	EPermissionType__kPermissionTypeCamera                                           = 1,
	EPermissionType__kPermissionTypePhoto                                            = 2,
	EPermissionType__kPermissionTypeMicrophone                                       = 3,
	EPermissionType__kPermissionTypeLocation                                         = 4,
	EPermissionType__kPermissionTypeBluetooth                                        = 5,
	EPermissionType__kPermissionTypeCalendar                                         = 6,
	EPermissionType__kPermissionTypeRemind                                           = 7,
	EPermissionType__kPermissionTypeContacts                                         = 8,
	EPermissionType__kPermissionTypeTrack                                            = 99,
	EPermissionType__kPermissionTypeCameraAndroid                                    = 101,
	EPermissionType__kPermissionTypeReadPhoneState                                   = 102,
	EPermissionType__kPermissionTypeRecordAudio                                      = 103,
	EPermissionType__kPermissionTypeReadExternalStorage                              = 104,
	EPermissionType__kPermissionTypeWriteExternalStorage                             = 105,
	EPermissionType__kPermissionTypeAccessBackgroundLocation                         = 106,
	EPermissionType__kPermissionTypeAccessCoarseLocation                             = 107,
	EPermissionType__kPermissionTypeAccessFineLocation                               = 108,
	EPermissionType__kPermissionTypeAccessMediaLoaction                              = 109,
	EPermissionType__kPermissionTypeReadCalendar                                     = 110,
	EPermissionType__kPermissionTypeWriteCalendar                                    = 111,
	EPermissionType__kPermissionTypeBluetoothAdvertise                               = 112,
	EPermissionType__kPermissionTypeBluetoothConnect                                 = 113,
	EPermissionType__kPermissionTypeBluetoothScan                                    = 114,
	EPermissionType__kPermissionTypeBodySensors                                      = 115,
	EPermissionType__kPermissionTypeBodySensorsBackground                            = 116,
	EPermissionType__kPermissionTypeCallPhone                                        = 117,
	EPermissionType__kPermissionTypeReadCallLog                                      = 118,
	EPermissionType__kPermissionTypeReadContacts                                     = 119,
	EPermissionType__kPermissionTypeWriteContacts                                    = 120,
	EPermissionType__kPermissionTypeWriteCallLog                                     = 121,
	EPermissionType__kPermissionTypeAddVoicemail                                     = 122,
	EPermissionType__kPermissionTypeAnswerPhoneCalls                                 = 123,
	EPermissionType__kPermissionTypeGetAccounts                                      = 124,
	EPermissionType__kPermissionTypeNearbyWifyDevices                                = 125,
	EPermissionType__kPermissionTypePostNotifications                                = 126,
	EPermissionType__kPermissionTypeProcessOutgoingCalls                             = 127,
	EPermissionType__kPermissionTypeReadMediaAudio                                   = 128,
	EPermissionType__kPermissionTypeReadMediaImages                                  = 129,
	EPermissionType__kPermissionTypeReadMediaVideo                                   = 130,
	EPermissionType__kPermissionTypeReadPhoneNumbers                                 = 131,
	EPermissionType__kPermissionTypeReadSMS                                          = 132,
	EPermissionType__kPermissionTypeReveiveMMS                                       = 133,
	EPermissionType__kPermissionTypeRceiveSMS                                        = 134,
	EPermissionType__kPermissionTypeReceiveWapPush                                   = 135,
	EPermissionType__kPermissionTypeSendSMS                                          = 136,
	EPermissionType__kPermissionTypeUseSIP                                           = 137,
	EPermissionType__kPermissionTypeUWBRanging                                       = 138,
	EPermissionType__kPermissionTypeActivityRecognition                              = 139,
	EPermissionType__kPermissionTypeAcceptHandover                                   = 140
};

/// Enum /Script/INTLCore.EComplianceParentCertificateStatus
/// Size: 0x01 (1 bytes)
enum class EComplianceParentCertificateStatus : uint8_t
{
	EComplianceParentCertificateStatus__kDeny                                        = 0,
	EComplianceParentCertificateStatus__kUnknown                                     = 1,
	EComplianceParentCertificateStatus__kAgree                                       = 2
};

/// Enum /Script/INTLCore.EComplianceAgreeStatus
/// Size: 0x01 (1 bytes)
enum class EComplianceAgreeStatus : uint8_t
{
	EComplianceAgreeStatus__kDeny                                                    = 0,
	EComplianceAgreeStatus__kUnknown                                                 = 1,
	EComplianceAgreeStatus__kAgree                                                   = 2
};

/// Enum /Script/INTLCore.EComplianceAgeStatus
/// Size: 0x01 (1 bytes)
enum class EComplianceAgeStatus : uint8_t
{
	EComplianceAgeStatus__kMinor                                                     = 0,
	EComplianceAgeStatus__kUnknown                                                   = 1,
	EComplianceAgeStatus__kAdult                                                     = 2,
	EComplianceAgeStatus__kBelowGrade                                                = 3
};

/// Enum /Script/INTLCore.EINTLLoginChannel
/// Size: 0x01 (1 bytes)
enum class EINTLLoginChannel : uint8_t
{
	EINTLLoginChannel__kChannelDefault                                               = 0,
	EINTLLoginChannel__kChannelW                                                     = 1,
	EINTLLoginChannel__kChannelQ                                                     = 2,
	EINTLLoginChannel__kChannelGuest                                                 = 3,
	EINTLLoginChannel__kChannelFacebook                                              = 4,
	EINTLLoginChannel__kChannelGameCenter                                            = 5,
	EINTLLoginChannel__kChannelGoogle                                                = 6,
	EINTLLoginChannel__kChannelIEGPassport                                           = 7,
	EINTLLoginChannel__kChannelFirebase                                              = 8,
	EINTLLoginChannel__kChannelTwitter                                               = 9,
	EINTLLoginChannel__kChannelGarena                                                = 10,
	EINTLLoginChannel__kChannelCustomAccount                                         = 11,
	EINTLLoginChannel__kChannelEGame                                                 = 12,
	EINTLLoginChannel__kChannelSwitch                                                = 13,
	EINTLLoginChannel__kChannelLine                                                  = 14,
	EINTLLoginChannel__kChannelApple                                                 = 15,
	EINTLLoginChannel__kChannelVK                                                    = 19,
	EINTLLoginChannel__kChannelXbox                                                  = 20,
	EINTLLoginChannel__kChannelSteam                                                 = 21,
	EINTLLoginChannel__kChannelPS4                                                   = 22,
	EINTLLoginChannel__kChannelEpic                                                  = 24,
	EINTLLoginChannel__kChannelDiscord                                               = 26,
	EINTLLoginChannel__kChannelPS5                                                   = 27,
	EINTLLoginChannel__kChannelDmm                                                   = 30,
	EINTLLoginChannel__kChannelSquareEnix                                            = 32,
	EINTLLoginChannel__kChannelSupercell                                             = 33,
	EINTLLoginChannel__kChannelAppsFlyer                                             = 34,
	EINTLLoginChannel__kChannelKaKao                                                 = 35,
	EINTLLoginChannel__kChannelUbisoft                                               = 37,
	EINTLLoginChannel__kChannelVNG                                                   = 38,
	EINTLLoginChannel__kChannelGooglePGS                                             = 39,
	EINTLLoginChannel__kChannelEA                                                    = 40,
	EINTLLoginChannel__kChannelNintendo                                              = 41,
	EINTLLoginChannel__kChannelLevelInfinite                                         = 131
};

/// Enum /Script/INTLCore.EVerifyCodeType
/// Size: 0x01 (1 bytes)
enum class EVerifyCodeType : uint8_t
{
	EVerifyCodeType__kVerifyCodeTypeRegister                                         = 0,
	EVerifyCodeType__kVerifyCodeTypeResetPassword                                    = 1,
	EVerifyCodeType__kVerifyCodeTypeRegisterThenLogin                                = 2,
	EVerifyCodeType__kVerifyCodeTypeModifyAccount                                    = 3,
	EVerifyCodeType__kVerifyCodeTypeUnBindLI                                         = 4,
	EVerifyCodeType__kVerifyCodeTypeUnbindThirdChannel                               = 5
};

/// Enum /Script/INTLCore.EINTLAccountType
/// Size: 0x01 (1 bytes)
enum class EINTLAccountType : uint8_t
{
	EINTLAccountType__kINTLAccountTypeNone                                           = 0,
	EINTLAccountType__kINTLAccountTypeEmail                                          = 1,
	EINTLAccountType__kINTLAccountTypeMobilePhone                                    = 2
};

/// Class /Script/INTLCore.INTLBaseUserWidget
/// Size: 0x0008 (8 bytes) (0x000288 - 0x000290) align 8 pad: 0x0000
class UINTLBaseUserWidget : public UUserWidget
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0288   (0x0008)  MISSED
};

/// Class /Script/INTLCore.INTLOutputUtility
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UINTLOutputUtility : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/INTLCore.INTLOutputUtility.FormatNoticeRet
	// void FormatNoticeRet(FINTLNoticeResult Ret, bool& IsSuccess, FText& ErrorMsg);                                           // [0x1809c80] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/INTLCore.INTLOutputUtility.FormatBaseRet
	// void FormatBaseRet(FINTLBaseResult Ret, bool& IsSuccess, FText& ErrorMsg);                                               // [0x18099e0] Final|BlueprintCosmetic|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/INTLCore.INTLOutputUtility.FormatAuthRet
	// void FormatAuthRet(FINTLAuthResult Ret, bool& IsSuccess, FText& ErrorMsg);                                               // [0x1809840] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/INTLCore.INTLPluginObserver
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UINTLPluginObserver : public UInterface
{ 
public:


	/// Functions
	// Function /Script/INTLCore.INTLPluginObserver.OnWebViewResult
	// void OnWebViewResult(FINTLWebViewResult Ret);                                                                            // [0x181c550] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnUpdateStartRepoNewVersionInfoResult
	// void OnUpdateStartRepoNewVersionInfoResult(FINTLUpdateStartRepoNewVersionInfo Ret);                                      // [0x181c380] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnUpdateResult
	// void OnUpdateResult(FINTLUpdateResult Ret);                                                                              // [0x181c190] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnUpdateProgressResult
	// void OnUpdateProgressResult(FINTLUpdateProgress Ret);                                                                    // [0x181bf20] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnUpdateOptionalRepoInitResult
	// void OnUpdateOptionalRepoInitResult(FINTLUpdateOptionalRepoInitResult Ret);                                              // [0x181bd30] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnStartUdpSocketResult
	// void OnStartUdpSocketResult(FINTLStartUdpSocketResult Ret);                                                              // [0x181bac0] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnPushResult
	// void OnPushResult(FINTLPushResult Ret);                                                                                  // [0x181b880] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnPushBaseResult
	// void OnPushBaseResult(FINTLBaseResult Ret);                                                                              // [0x181b6b0] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnPermissionResult
	// void OnPermissionResult(FINTLPermissionResult Ret);                                                                      // [0x181b480] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnNoticeRequestData
	// void OnNoticeRequestData(FINTLNoticeResult Ret);                                                                         // [0x181b1b0] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnLIBindRewardReult
	// void OnLIBindRewardReult(FINTLLIBindRewardResult Ret);                                                                   // [0x181ae30] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnIPInfoResult
	// void OnIPInfoResult(FINTLLBSIPInfoResult Ret);                                                                           // [0x181ab90] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnIDTokenResult
	// void OnIDTokenResult(FINTLIDTokenResult Ret);                                                                            // [0x181a960] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnGroupReqInfoResult
	// void OnGroupReqInfoResult(FINTLBaseResult Ret);                                                                          // [0x181a790] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnFriendResult
	// void OnFriendResult(FINTLFriendResult Ret);                                                                              // [0x181a4c0] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnFriendBaseResult
	// void OnFriendBaseResult(FINTLBaseResult Ret);                                                                            // [0x181a2f0] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnExtendResult
	// void OnExtendResult(FINTLExtendResult Ret);                                                                              // [0x181a0c0] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnDNSResult
	// void OnDNSResult(FINTLDNSResult Ret);                                                                                    // [0x18194e0] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnDismissLoginUI
	// void OnDismissLoginUI(bool Canceled);                                                                                    // [0x181a030] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnDirTreeResult
	// void OnDirTreeResult(FINTLDirTreeResult Ret);                                                                            // [0x1819d80] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnDeviceLevelResult
	// void OnDeviceLevelResult(FINTLDeviceLevelResult Ret);                                                                    // [0x1819ba0] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnDetectNetworkResult
	// void OnDetectNetworkResult(FINTLDetectNetworkResult Ret);                                                                // [0x18199a0] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnDeepLinkResult
	// void OnDeepLinkResult(FINTLBaseResult Ret);                                                                              // [0x18197d0] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnCutoutResult
	// void OnCutoutResult(FCutoutInfoResult Ret);                                                                              // [0x1819260] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnCustomerResult
	// void OnCustomerResult(FINTLCustomerResult Ret);                                                                          // [0x1819080] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnComplianceResult
	// void OnComplianceResult(FINTLComplianceResult Ret);                                                                      // [0x1818bb0] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnAuthResult
	// void OnAuthResult(FINTLAuthResult Ret);                                                                                  // [0x1818b00] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnAuthBaseResult
	// void OnAuthBaseResult(FINTLBaseResult Ret);                                                                              // [0x1818930] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnAdjustAttrsChangedResult
	// void OnAdjustAttrsChangedResult(FINTLAdjustAttrsChangedResult Ret);                                                      // [0x1818700] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/INTLCore.INTLPluginObserver.OnAccountResult
	// void OnAccountResult(FINTLAccountResult Ret);                                                                            // [0x1818650] Native|Event|Public|BlueprintCallable|BlueprintEvent 
};

/// Class /Script/INTLCore.INTLSDKAPI
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UINTLSDKAPI : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/INTLCore.INTLSDKAPI.UpgradeSaccToLI
	// void UpgradeSaccToLI();                                                                                                  // [0x18253c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.UpdateUserInfo
	// void UpdateUserInfo(FINTLCustomerUserProfile& userProfile);                                                              // [0x18251a0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.UpdateStop
	// bool UpdateStop(int32_t RepoID, int32_t TaskId);                                                                         // [0x18250d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.UpdateStart
	// bool UpdateStart(FINTLUpdateInitInfo Info);                                                                              // [0x1824f60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.UpdateLanguage
	// void UpdateLanguage(FString lan);                                                                                        // [0x1824ec0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.UpdateContinue
	// bool UpdateContinue(int32_t RepoID);                                                                                     // [0x1824e30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.UpdateConfig
	// bool UpdateConfig(TMap<FString, FString> Cfg, FString Project);                                                          // [0x1824c30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.UnregisterPush
	// void UnregisterPush(FString Channel);                                                                                    // [0x1824b40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.Unbind
	// bool Unbind(EINTLLoginChannel Channel, FString uid, FString extraJson);                                                  // [0x1824980] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.TransferAccount
	// void TransferAccount(FString TransferCode, FString password);                                                            // [0x1824880] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ToggleBackgroundUpdate
	// bool ToggleBackgroundUpdate(bool enable);                                                                                // [0x18247f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.TestJudgeCustomDeviceLevel
	// int32_t TestJudgeCustomDeviceLevel(FString parseJson);                                                                   // [0x18246f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.TabSwitchGuid
	// void TabSwitchGuid(FString Guid);                                                                                        // [0x1824600] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.TabStart
	// void TabStart();                                                                                                         // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.TabRefresh
	// void TabRefresh();                                                                                                       // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.TabInit
	// void TabInit(FString Guid, FString SceneId, bool IsAutoPoll, bool IsAutoReport);                                         // [0x18243e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.TabGetExpInfoByName
	// bool TabGetExpInfoByName(FINTLTabExpEntity& entity, FString ExpName, bool IsReport);                                     // [0x18240a0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.TabGetExpInfoByLayerCode
	// bool TabGetExpInfoByLayerCode(FINTLTabExpEntity& entity, FString LayerCode, bool IsReport);                              // [0x18240a0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.StopTraceRoute
	// FString StopTraceRoute();                                                                                                // [0x1824020] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.StopAnalytics
	// void StopAnalytics();                                                                                                    // [0x1824000] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.StartUdpSocket
	// void StartUdpSocket(FString ID, int32_t Count, FString extraJson);                                                       // [0x1823e40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.StartTraceRoute
	// FString StartTraceRoute(FString ID);                                                                                     // [0x1823d00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.StartDetectNetwork
	// void StartDetectNetwork(FString ID);                                                                                     // [0x1823c10] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ShutDown
	// void ShutDown();                                                                                                         // [0x1823bf0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ShowSingleFAQ
	// void ShowSingleFAQ(FString faqId);                                                                                       // [0x1823b50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ShowRatingAlert
	// void ShowRatingAlert();                                                                                                  // [0x1823b30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ShowGroupChatRoom
	// void ShowGroupChatRoom(FINTLGroupReqInfo req_info, FString Channel);                                                     // [0x18237f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ShowGroupAgreementWindow
	// void ShowGroupAgreementWindow(FString Channel);                                                                          // [0x1823700] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ShowFaqSection
	// void ShowFaqSection(FString SectionID);                                                                                  // [0x1823660] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ShowAllFAQSections
	// void ShowAllFAQSections();                                                                                               // [0x1823640] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ShowAccountPicker
	// bool ShowAccountPicker();                                                                                                // [0x1823610] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.Share
	// bool Share(FINTLFriendReqInfo Info, FString Channel);                                                                    // [0x18231c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.SetTag
	// void SetTag(FString Channel, FString Tag);                                                                               // [0x1823040] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.SetSessionExtraParam
	// void SetSessionExtraParam(FString extra_json);                                                                           // [0x1822f50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.SetRewardExtraJson
	// void SetRewardExtraJson(FString extraJson);                                                                              // [0x1822e60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.SetProvision
	// bool SetProvision(FString UserAgreedGameTos, FString UserAgreedGamePP, FString UserAgreedLiPP, FString UserAgreedLiDt, FString UserAgreedLiTos, int32_t IsRecvEmail); // [0x1822a90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.SetMaxDownloadSpeed
	// void SetMaxDownloadSpeed(int32_t Speed);                                                                                 // [0x1822a10] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.SetLogPath
	// void SetLogPath(FString log_path);                                                                                       // [0x1822970] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.SetDNSRegion
	// void SetDNSRegion(FString Region);                                                                                       // [0x18226c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.SetDeviceLevel
	// void SetDeviceLevel(int32_t Level);                                                                                      // [0x18228f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.SetDefaultUserStorageDirectory
	// void SetDefaultUserStorageDirectory(FString Dir);                                                                        // [0x1822850] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.SetDefaultSharedStorageDirectory
	// void SetDefaultSharedStorageDirectory(FString Dir);                                                                      // [0x18227b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.SetCrashUserValue
	// void SetCrashUserValue(FString Key, FString Value);                                                                      // [0x1822540] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.SetCrashUserId
	// void SetCrashUserId(FString UserId);                                                                                     // [0x1822450] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.SetCrashSightAppVersion
	// void SetCrashSightAppVersion(FString AppVersion);                                                                        // [0x18223b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.SetBackgroundUpdateNotificationContentTitle
	// void SetBackgroundUpdateNotificationContentTitle(FString Title);                                                         // [0x1822310] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.SetAuthEncryptData
	// bool SetAuthEncryptData(FString auth_data, bool overwrite);                                                              // [0x1822220] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.SetAppVersion
	// void SetAppVersion(FString AppVersion);                                                                                  // [0x1822180] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.SetAccountInfo
	// void SetAccountInfo(EINTLLoginChannel Channel, int32_t ChannelID, FString LangType, int32_t AccountPlatType);            // [0x1821fe0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.SendMessage
	// bool SendMessage(FINTLFriendReqInfo Info, FString Channel);                                                              // [0x1821b90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.SendBindReward
	// void SendBindReward(FString eventId, FString extraJson);                                                                 // [0x1821a10] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.RevokeChannelToken
	// void RevokeChannelToken();                                                                                               // [0x18219f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.RestartAnalytics
	// void RestartAnalytics();                                                                                                 // [0x18219d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.Restart
	// void Restart();                                                                                                          // [0x18219b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ResetPasswordWithVerifyCode
	// bool ResetPasswordWithVerifyCode(FString Account, FString VerifyCode, FString PhoneAreaCode, FString NewPassword, FString extraJson); // [0x1821630] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ResetPasswordWithOldPassword
	// bool ResetPasswordWithOldPassword(FString Account, FString OldPassword, FString PhoneAreaCode, FString NewPassword, FString extraJson); // [0x18212b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ResetGuest
	// bool ResetGuest();                                                                                                       // [0x1821280] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.RequestVerifyCode
	// bool RequestVerifyCode(FString Account, EVerifyCodeType CodeType, FString PhoneAreaCode, FString extraJson, int32_t OnlyLoginType); // [0x1820fd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.RequestTrackingAuthorization
	// void RequestTrackingAuthorization();                                                                                     // [0x1820fb0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.RequestTracking
	// void RequestTracking();                                                                                                  // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.RequestPermission
	// void RequestPermission(TArray<EPermissionType>& permissionTypeArray);                                                    // [0x1811b60] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.RequestIPInfo
	// void RequestIPInfo();                                                                                                    // [0x1820f90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.RequestGetRecentLoginDays
	// void RequestGetRecentLoginDays(FString RecentDay, FString extraJson);                                                    // [0x1820e10] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.RequestBindDataForAccount
	// void RequestBindDataForAccount(FString uid, FString Token, FString extraJson);                                           // [0x1820be0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.RequestAccountInfo
	// void RequestAccountInfo(FString extraJson);                                                                              // [0x1820af0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ReportRevenue
	// void ReportRevenue(FString EventName, FString Currency, FString RevenueValue, TMap<FString, FString> ParamsMap, FString SpecificChannel, FString extraJson); // [0x1820620] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ReportPayStep
	// void ReportPayStep(int32_t Step, FString StepName, bool Result, int32_t ErrorCode, TMap<FString, FString> ParamsMap);    // [0x1820340] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ReportLoginStep
	// void ReportLoginStep(int32_t Step, FString StepName, bool Result, int32_t ErrorCode, TMap<FString, FString> ParamsMap);  // [0x1820060] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ReportFunnelWithCustomField
	// void ReportFunnelWithCustomField(TEnumAsByte<FINTLFunnelStep> step_name, int32_t error_code, TMap<FString, FString>& params_map); // [0x181fed0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ReportFunnelCustomEventWithCustomField
	// void ReportFunnelCustomEventWithCustomField(FString l1_event_name, FString l2_event_name, int32_t error_code, TMap<FString, FString>& params_map); // [0x181fcc0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ReportFunnelCustomEvent
	// void ReportFunnelCustomEvent(FString l1_event_name, FString l2_event_name, int32_t error_code);                          // [0x181fb80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ReportFunnel
	// void ReportFunnel(TEnumAsByte<FINTLFunnelStep> step_name, int32_t error_code);                                           // [0x181fac0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ReportException
	// void ReportException(int32_t Type, FString ExceptionName, FString ExceptionMsg, FString ExceptionStack, TMap<FString, FString> ExtInfo); // [0x181f720] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ReportEvent
	// void ReportEvent(FString EventName, TMap<FString, FString> ParamsMap, FString SpecificChannel, FString extraJson);       // [0x181f3c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ReportCustomEventStep
	// void ReportCustomEventStep(FString EventName, int32_t Step, FString StepName, bool Result, int32_t ErrorCode, TMap<FString, FString> ParamsMap); // [0x181f030] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ReportBinary
	// void ReportBinary(FString EventName, FString Data, int32_t Length, FString SpecificChannel);                             // [0x181edc0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.RemoveObserver
	// void RemoveObserver(TScriptInterface<Class> Observer);                                                                   // [0x181ed30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.RemoveHostCache
	// void RemoveHostCache(FString Host);                                                                                      // [0x181ec40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.RegisterPush
	// void RegisterPush(FString Channel, FString Account);                                                                     // [0x181eac0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.Register
	// bool Register(FString Account, FString password, FString VerifyCode, FString PhoneAreaCode, FINTLAccountProfile userProfile); // [0x181e210] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryVerifyCodeStatus
	// bool QueryVerifyCodeStatus(FString Account, FString VerifyCode, EVerifyCodeType CodeType, FString PhoneAreaCode, FString extraJson); // [0x181def0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryUserNameStatus
	// void QueryUserNameStatus(FString userName);                                                                              // [0x181de50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryUserInfoWithOpenId
	// void QueryUserInfoWithOpenId(FString Openid, bool& is_openid, int32_t& channel_id);                                      // [0x181dcd0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryUserInfo
	// bool QueryUserInfo();                                                                                                    // [0x181dca0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryTransferCode
	// void QueryTransferCode();                                                                                                // [0x181dc80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryRewardListStatus
	// void QueryRewardListStatus(FString eventIds, FString extraJson);                                                         // [0x181db00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryRegisterStatus
	// bool QueryRegisterStatus(FString Account, FString PhoneAreaCode, FString extraJson);                                     // [0x181d8d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryNeedUpgradeAndProvisionInfo
	// bool QueryNeedUpgradeAndProvisionInfo();                                                                                 // [0x181d8a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryLoginRecord
	// void QueryLoginRecord();                                                                                                 // [0x181d880] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryLegalDocumentsAcceptedVersion
	// bool QueryLegalDocumentsAcceptedVersion();                                                                               // [0x181d850] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryIsReceiveEmail
	// bool QueryIsReceiveEmail(FString Account, FString PhoneAreaCode, FString extraJson);                                     // [0x181d620] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryIsEEA
	// void QueryIsEEA(FString Region);                                                                                         // [0x181d530] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryIpByHost
	// void QueryIpByHost(FString Host);                                                                                        // [0x181d440] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryIDToken
	// void QueryIDToken();                                                                                                     // [0x181d420] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryFriends
	// bool QueryFriends(EINTLLoginChannel Channel, int32_t Page, int32_t Count, bool IsInGame, FString extraJson);             // [0x181d220] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryDirTree
	// void QueryDirTree(int32_t TreeId);                                                                                       // [0x181d1a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryDirNode
	// void QueryDirNode(int32_t TreeId, int32_t NodeId);                                                                       // [0x181d0e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryDeviceLevel
	// void QueryDeviceLevel();                                                                                                 // [0x181d0c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryDataProtectionAcceptance
	// void QueryDataProtectionAcceptance();                                                                                    // [0x181d0a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryCanBind
	// bool QueryCanBind(int32_t ChannelID, int32_t AccountPlatType, FString Account, FString PhoneAreaCode, FString extraJson); // [0x181cdf0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryBindRewardStatus
	// void QueryBindRewardStatus(FString eventId);                                                                             // [0x181cd00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryBindInfo
	// bool QueryBindInfo();                                                                                                    // [0x181ccd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryActiveUser
	// bool QueryActiveUser();                                                                                                  // [0x181cca0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryAccountRegistrationInfo
	// bool QueryAccountRegistrationInfo();                                                                                     // [0x181cc70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.QueryAccountProfile
	// bool QueryAccountProfile();                                                                                              // [0x181cc40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.PostNetworkLatencyInSession
	// void PostNetworkLatencyInSession(int32_t LatencyMs);                                                                     // [0x181cbc0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.PostFrameTimeInSession
	// void PostFrameTimeInSession(float DeltaSeconds);                                                                         // [0x181cb50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.OpenUrl
	// void OpenUrl(FString URL, EINTLWebViewOrientation ScreenOrientation, bool FullScreenEnable, bool EncryptEnable, bool SystemBrowserEnable, FString extraJson); // [0x181c890] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.OpenUnreadMessage
	// void OpenUnreadMessage(FString uid, FString push_token);                                                                 // [0x181c790] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.OnTickEvent
	// bool OnTickEvent();                                                                                                      // [0x181bd00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.NoticeRequestData
	// FString NoticeRequestData(FString Region, FString LangType, FString extraJson);                                          // [0x18183e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ModifyProfile
	// bool ModifyProfile(FINTLAccountProfile userProfile);                                                                     // [0x1817e30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ModifyLegalDocumentsAcceptedVersion
	// bool ModifyLegalDocumentsAcceptedVersion(FString acceptedVersionsJson);                                                  // [0x1817d80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ModifyDownloadPriority
	// bool ModifyDownloadPriority(int32_t RepoID, int32_t TaskId, int32_t DownloadPriority);                                   // [0x1817c80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ModifyDataProtectionAcceptance
	// void ModifyDataProtectionAcceptance(FString PPVersion, FString TOSVersion);                                              // [0x1817b80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ModifyAccountWithVerifyCode
	// bool ModifyAccountWithVerifyCode(FString OldAccount, FString OldAccountVerifyCode, FString OldPhoneAreaCode, FString NewAccount, FString NewAccountVerifyCode, FString NewPhoneAreaCode, FString extraJson); // [0x1817680] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ModifyAccountWithPassword
	// bool ModifyAccountWithPassword(FString OldAccount, FString OldPhoneAreaCode, FString password, FString NewAccount, FString NewAccountVerifyCode, FString NewPhoneAreaCode, FString extraJson); // [0x1817180] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ModifyAccountWithLoginState
	// bool ModifyAccountWithLoginState(FString OldPhoneAreaCode, FString NewAccount, FString NewAccountVerifyCode, FString NewPhoneAreaCode, FString extraJson); // [0x1816e00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.MarkSessionLoad
	// void MarkSessionLoad(FString SessionName, FString extra_json);                                                           // [0x1816c80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.MarkSessionClosed
	// void MarkSessionClosed();                                                                                                // [0x1816c60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.Logout
	// bool Logout(EINTLLoginChannel Channel, bool ChannelOnly);                                                                // [0x1816b90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.LoginWithVerifyCode
	// bool LoginWithVerifyCode(EINTLLoginChannel Channel, FString Account, FString password, FString VerifyCode, FString PhoneAreaCode, FString PermissionList, char OnlyLoginType); // [0x1816780] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.LoginWithPassword
	// bool LoginWithPassword(EINTLLoginChannel Channel, FString Account, FString password, FString PhoneAreaCode, FString PermissionList, int32_t SupportCaptcha, int32_t MachineCheckType, FString TencentResponse, FString GoogleResponse); // [0x1816250] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.LoginWithMappedChannel
	// bool LoginWithMappedChannel(EINTLLoginChannel Channel, FString LoginMode, FString Permissions);                          // [0x1816090] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.LoginWithConfirmCodeForMail
	// void LoginWithConfirmCodeForMail(FString ChannelID, FString ConfirmCode, FString extraJson);                             // [0x1815e60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.LoginWithConfirmCode
	// bool LoginWithConfirmCode(int32_t ActionType, FString ConfirmCode, FString extraJson);                                   // [0x1815ca0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.LoginWithChannel
	// bool LoginWithChannel(EINTLLoginChannel Channel, FString LoginMode);                                                     // [0x1815b70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.LoginWithBoundChannel
	// bool LoginWithBoundChannel(EINTLLoginChannel Channel, FString LoginMode);                                                // [0x1815a40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.LoginUsePluginCache
	// void LoginUsePluginCache(int32_t request_mode);                                                                          // [0x18159c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.LoginForLI
	// bool LoginForLI(EINTLLoginChannel Channel, FString Permissions, FString extraJson);                                      // [0x1815800] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.LoginChannelWithLIPASS
	// void LoginChannelWithLIPASS(EINTLLoginChannel Channel, FString Permissions, FString extraJson);                          // [0x1815640] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.LoginChannelOnly
	// void LoginChannelOnly(EINTLLoginChannel Channel, FString Permissions, FString extraJson);                                // [0x1815480] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.Login
	// bool Login(EINTLLoginChannel Channel, FString Permissions, FString extraJson);                                           // [0x18152c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.LogCrashInfo
	// void LogCrashInfo(EINTLCrashLevel Level, FString Tag, FString Log);                                                      // [0x1815100] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.LoadCutoutData
	// void LoadCutoutData();                                                                                                   // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.LaunchLoginUI
	// void LaunchLoginUI();                                                                                                    // [0x18150e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.LaunchAccountUI
	// bool LaunchAccountUI(int32_t Type, FString extraJson);                                                                   // [0x1814fb0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.IsAppInstalled
	// bool IsAppInstalled(FString Channel, FString extraJson);                                                                 // [0x1814e20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.InitFirebaseSDK
	// void InitFirebaseSDK();                                                                                                  // [0x1814e00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.InitCustomer
	// void InitCustomer(FINTLCustomerUserProfile& userProfile);                                                                // [0x1814be0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.InitAnalytics
	// void InitAnalytics();                                                                                                    // [0x1814bc0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.Init
	// void Init();                                                                                                             // [0x1814ba0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GotoSystemSetting
	// void GotoSystemSetting(TArray<EPermissionType>& permissionTypeArray);                                                    // [0x1811b60] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GetUserStorage
	// FString GetUserStorage();                                                                                                // [0x1814b20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GetStoreChannel
	// int32_t GetStoreChannel();                                                                                               // [0x1814af0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GetSDKVersion
	// FString GetSDKVersion();                                                                                                 // [0x1814a70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GetRewardExtraJson
	// FString GetRewardExtraJson();                                                                                            // [0x18149f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GetLIUidAndTokenForAdultCert
	// void GetLIUidAndTokenForAdultCert();                                                                                     // [0x18149d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GetIpByHost
	// FString GetIpByHost(FString Host);                                                                                       // [0x1814890] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GetInstanceIDAsync
	// FString GetInstanceIDAsync(FString Channel);                                                                             // [0x1814750] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GetInstanceID
	// FString GetInstanceID(FString Channel);                                                                                  // [0x1814610] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GetIDTokenResult
	// bool GetIDTokenResult(FINTLIDTokenResult& jwtRet);                                                                       // [0x1814500] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GetFINTLAuthResult
	// FINTLAuthResult GetFINTLAuthResult();                                                                                    // [0x18144b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GetEncryptUrl
	// FString GetEncryptUrl(FString URL);                                                                                      // [0x1814370] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GetDeviceLevel
	// int32_t GetDeviceLevel();                                                                                                // [0x1814340] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GetDeviceInfo
	// FString GetDeviceInfo(FString extra_json);                                                                               // [0x1814200] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GetCurrentResourceVersion
	// FString GetCurrentResourceVersion();                                                                                     // [0x1814180] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GetCurrentAppVersion
	// FString GetCurrentAppVersion();                                                                                          // [0x1814100] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GetConfig
	// FString GetConfig(FString Key, FString DefaultVal, FString Project);                                                     // [0x1813e90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GetChannelVersion
	// FString GetChannelVersion(FString Channel);                                                                              // [0x1813d50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GetAuthResult
	// bool GetAuthResult(FINTLAuthResult& LoginRet);                                                                           // [0x1813ca0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GetAuthEncryptData
	// FString GetAuthEncryptData();                                                                                            // [0x1813c20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GetAuthDeviceInfo
	// FString GetAuthDeviceInfo();                                                                                             // [0x1813ba0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.GenerateTransferCode
	// void GenerateTransferCode(FString password);                                                                             // [0x1813b00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.FlushINTLEvents
	// void FlushINTLEvents();                                                                                                  // [0x1813ae0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.Fetch
	// FString Fetch();                                                                                                         // [0x1813a60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ExtendInvoke
	// FString ExtendInvoke(EINTLLoginChannel Channel, FString ExtendMethodName, FString ParamsJson);                           // [0x1813860] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.EnterGameFailed
	// void EnterGameFailed(FINTLAuthResult Ret);                                                                               // [0x18137c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.EnterGame
	// void EnterGame();                                                                                                        // [0x18137a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.DownloadOptionalRepoFiles
	// int32_t DownloadOptionalRepoFiles(int32_t RepoID, int32_t DownloadPriority, TArray<FString>& FilesPath, bool isbig);     // [0x1813600] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.DismissLoginUI
	// void DismissLoginUI(bool Canceled);                                                                                      // [0x1813580] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.DeleteTag
	// void DeleteTag(FString Channel, FString Tag);                                                                            // [0x1813400] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.DeleteLocalNotifications
	// void DeleteLocalNotifications(FString Key);                                                                              // [0x1813310] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ComplianceVerifyRealName
	// void ComplianceVerifyRealName();                                                                                         // [0x18132f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ComplianceVerifyParentAndCertificate
	// void ComplianceVerifyParentAndCertificate();                                                                             // [0x18132d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ComplianceVerifyCreditCard
	// void ComplianceVerifyCreditCard();                                                                                       // [0x18132b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ComplianceSetUserProfile
	// bool ComplianceSetUserProfile(FString GameId, FString Openid, FString Token, int32_t ChannelID, FString Region);         // [0x1812f90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ComplianceSetUserInfoWithBirthday
	// void ComplianceSetUserInfoWithBirthday(FString Region, int32_t BirthdayYear, int32_t BirthdayMonth, int32_t BirthdayDay); // [0x1812df0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ComplianceSetUserInfoWithBirthAge
	// void ComplianceSetUserInfoWithBirthAge(FString Region, int32_t BirthAge);                                                // [0x1812cc0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ComplianceSetUserInfoWithAgeStatus
	// void ComplianceSetUserInfoWithAgeStatus(FString Region, EComplianceAgeStatus status);                                    // [0x1812b90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ComplianceSetParentCertificateStatus
	// void ComplianceSetParentCertificateStatus(EComplianceParentCertificateStatus status);                                    // [0x1812b20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ComplianceSetEUAgreeStatus
	// void ComplianceSetEUAgreeStatus(EComplianceAgreeStatus status);                                                          // [0x1812ab0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ComplianceSetAdulthood
	// void ComplianceSetAdulthood(EComplianceAgeStatus status);                                                                // [0x1812a40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ComplianceSendEmail
	// void ComplianceSendEmail(FString Email, FString userName);                                                               // [0x18128c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ComplianceSendConsoleEmail
	// void ComplianceSendConsoleEmail(FString Email, int32_t Scene, FString URL, FString userName);                            // [0x1812650] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ComplianceQueryUserStatus
	// void ComplianceQueryUserStatus();                                                                                        // [0x1812630] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ComplianceQueryUserInfo
	// void ComplianceQueryUserInfo();                                                                                          // [0x1812610] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ComplianceQueryStrategy
	// void ComplianceQueryStrategy(FString Region);                                                                            // [0x1812520] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ComplianceInitWithParams
	// bool ComplianceInitWithParams(FString GameId, FString Openid, FString Token, int32_t ChannelID);                         // [0x18122b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ComplianceInit
	// bool ComplianceInit();                                                                                                   // [0x1812280] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ComplianceGetConsoleRealNameVerifyUrl
	// FString ComplianceGetConsoleRealNameVerifyUrl();                                                                         // [0x1812200] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ComplianceGetConsoleCreditCardVerifyUrl
	// FString ComplianceGetConsoleCreditCardVerifyUrl();                                                                       // [0x1812180] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ComplianceCommitBirthday
	// void ComplianceCommitBirthday(int32_t BirthdayYear, int32_t BirthdayMonth, int32_t BirthdayDay);                         // [0x1812080] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.CollectionStop
	// void CollectionStop();                                                                                                   // [0x1812060] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.CollectionResume
	// void CollectionResume();                                                                                                 // [0x1812040] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ClearUserStorage
	// bool ClearUserStorage(FString sub_dir);                                                                                  // [0x1811f40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ClearLocalNotifications
	// void ClearLocalNotifications(FString Channel);                                                                           // [0x1811e50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.CheckTwoFALoginForLI
	// void CheckTwoFALoginForLI(FString two_fa_confirm_code, FString two_fa_verify_code, FString two_fa_li_email);             // [0x1811c20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.CheckTracking
	// void CheckTracking();                                                                                                    // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.CheckPermissionStatus
	// void CheckPermissionStatus(TArray<EPermissionType>& permissionTypeArray);                                                // [0x1811b60] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.CheckOptionalRepoFiles
	// TArray<FINTLUpdateOptionalRepoFilesStatus> CheckOptionalRepoFiles(int32_t RepoID, TArray<FString>& FilesPath);           // [0x1811990] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.CheckActiveUser
	// bool CheckActiveUser();                                                                                                  // [0x1811960] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.ChangeIsReceiveEmail
	// bool ChangeIsReceiveEmail(int32_t recv_email);                                                                           // [0x18118d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.CancelLogin
	// void CancelLogin(FString Channel, FString extra_json);                                                                   // [0x18117d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.CancelLIAccountDeletion
	// void CancelLIAccountDeletion();                                                                                          // [0x18117b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.CancelAccountDeletion
	// void CancelAccountDeletion();                                                                                            // [0x1811790] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.CallJS
	// void CallJS(FString JsonJsParam);                                                                                        // [0x18116a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.BuildMapWithLoggedinChannel
	// bool BuildMapWithLoggedinChannel();                                                                                      // [0x1811670] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.BindWithThirdChannel
	// void BindWithThirdChannel();                                                                                             // [0x1811650] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.BindWithLoggedinChannel
	// bool BindWithLoggedinChannel();                                                                                          // [0x1811620] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.BindUsePluginCache
	// void BindUsePluginCache();                                                                                               // [0x1811600] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.Bind
	// bool Bind(EINTLLoginChannel Channel, FString Permissions, FString extraJson);                                            // [0x1811440] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.AutoLoginForLI
	// bool AutoLoginForLI();                                                                                                   // [0x1811410] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.AutoLogin
	// bool AutoLogin();                                                                                                        // [0x18113e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.AuthLoginWithThirdChannel
	// void AuthLoginWithThirdChannel();                                                                                        // [0x18113c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.AddObserver
	// void AddObserver(TScriptInterface<Class> Observer);                                                                      // [0x1811330] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.AddLocalNotificationIOS
	// void AddLocalNotificationIOS(FString Channel, FINTLLocalNotificationIOS LocalNotification);                              // [0x1810f90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.AddLocalNotification
	// void AddLocalNotification(FString Channel, FINTLLocalNotification LocalNotification);                                    // [0x1810bf0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLSDKAPI.AccountLoginWithLIPASS
	// void AccountLoginWithLIPASS(EINTLLoginChannel Channel, FString Permissions, FString extraJson);                          // [0x1810a30] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/INTLCore.INTLUtility
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UINTLUtility : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/INTLCore.INTLUtility.Regular
	// bool Regular(FString Str, FString Reg);                                                                                  // [0x1825810] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLUtility.RefreshCurToastCnt
	// int32_t RefreshCurToastCnt(int32_t ChangeCnt);                                                                           // [0x1825780] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLUtility.GetNewToastOrder
	// int32_t GetNewToastOrder();                                                                                              // [0x1825750] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLUtility.ForceCrash
	// void ForceCrash();                                                                                                       // [0x1825730] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/INTLCore.INTLUtility.AddSystemBrowserFireWallRule
	// void AddSystemBrowserFireWallRule(int32_t Port, FString RuleName);                                                       // [0x1825600] Final|Native|Static|Public|BlueprintCallable 
};

/// Struct /Script/INTLCore.INTLBaseResult
/// Size: 0x0040 (64 bytes) (0x000000 - 0x000040) align 8 pad: 0x0000
struct FINTLBaseResult
{ 
	int32_t                                            methodId;                                                   // 0x0000   (0x0004)  
	int32_t                                            RetCode;                                                    // 0x0004   (0x0004)  
	FString                                            RetMsg;                                                     // 0x0008   (0x0010)  
	int32_t                                            ThirdCode;                                                  // 0x0018   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x001C   (0x0004)  MISSED
	FString                                            ThirdMsg;                                                   // 0x0020   (0x0010)  
	FString                                            extraJson;                                                  // 0x0030   (0x0010)  
};

/// Struct /Script/INTLCore.INTLAdjustAttrsChangedResult
/// Size: 0x0010 (16 bytes) (0x000040 - 0x000050) align 8 pad: 0x0000
struct FINTLAdjustAttrsChangedResult : FINTLBaseResult
{ 
	FString                                            AdjustAttribution;                                          // 0x0040   (0x0010)  
};

/// Struct /Script/INTLCore.INTLTabExpEntity
/// Size: 0x0120 (288 bytes) (0x000000 - 0x000120) align 8 pad: 0x0000
struct FINTLTabExpEntity
{ 
	FString                                            ExpName;                                                    // 0x0000   (0x0010)  
	FString                                            Assignment;                                                 // 0x0010   (0x0010)  
	FString                                            ExpGrayId;                                                  // 0x0020   (0x0010)  
	FString                                            LayerName;                                                  // 0x0030   (0x0010)  
	SDK_UNDEFINED(80,2718) /* TMap<FString, FString> */ __um(ExpParams);                                           // 0x0040   (0x0050)  
	int32_t                                            ExpId;                                                      // 0x0090   (0x0004)  
	int32_t                                            Bucket;                                                     // 0x0094   (0x0004)  
	int32_t                                            ModuleBucketNum;                                            // 0x0098   (0x0004)  
	float                                              Percentage;                                                 // 0x009C   (0x0004)  
	FString                                            ExpKey;                                                     // 0x00A0   (0x0010)  
	FString                                            ExpGroupKey;                                                // 0x00B0   (0x0010)  
	FString                                            ModuleCode;                                                 // 0x00C0   (0x0010)  
	SDK_UNDEFINED(80,2719) /* TMap<FString, FString> */ __um(Params);                                              // 0x00D0   (0x0050)  
};

/// Struct /Script/INTLCore.INTLRewardItem
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 8 pad: 0x0000
struct FINTLRewardItem
{ 
	FString                                            desc;                                                       // 0x0000   (0x0010)  
	FString                                            icon;                                                       // 0x0010   (0x0010)  
	int32_t                                            ID;                                                         // 0x0020   (0x0004)  
	int32_t                                            Num;                                                        // 0x0024   (0x0004)  
};

/// Struct /Script/INTLCore.INTLEventsInfoItem
/// Size: 0x0040 (64 bytes) (0x000000 - 0x000040) align 8 pad: 0x0000
struct FINTLEventsInfoItem
{ 
	char                                               CanSend;                                                    // 0x0000   (0x0001)  
	char                                               IsSent;                                                     // 0x0001   (0x0001)  
	unsigned char                                      UnknownData00_6[0x6];                                       // 0x0002   (0x0006)  MISSED
	FString                                            Image;                                                      // 0x0008   (0x0010)  
	FString                                            Content;                                                    // 0x0018   (0x0010)  
	int32_t                                            eventId;                                                    // 0x0028   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x002C   (0x0004)  MISSED
	TArray<FINTLRewardItem>                            rewards;                                                    // 0x0030   (0x0010)  
};

/// Struct /Script/INTLCore.INTLLIBindRewardResult
/// Size: 0x0040 (64 bytes) (0x000040 - 0x000080) align 8 pad: 0x0000
struct FINTLLIBindRewardResult : FINTLBaseResult
{ 
	FString                                            Image;                                                      // 0x0040   (0x0010)  
	FString                                            Content;                                                    // 0x0050   (0x0010)  
	int32_t                                            CanSend;                                                    // 0x0060   (0x0004)  
	int32_t                                            IsSent;                                                     // 0x0064   (0x0004)  
	bool                                               FromNetwork;                                                // 0x0068   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0069   (0x0003)  MISSED
	int32_t                                            eventId;                                                    // 0x006C   (0x0004)  
	TArray<FINTLEventsInfoItem>                        Events;                                                     // 0x0070   (0x0010)  
};

/// Struct /Script/INTLCore.INTLPermissionResult
/// Size: 0x0010 (16 bytes) (0x000040 - 0x000050) align 8 pad: 0x0000
struct FINTLPermissionResult : FINTLBaseResult
{ 
	FString                                            permission_json_;                                           // 0x0040   (0x0010)  
};

/// Struct /Script/INTLCore.CutoutRect
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 4 pad: 0x0000
struct FCutoutRect
{ 
	int32_t                                            Top;                                                        // 0x0000   (0x0004)  
	int32_t                                            Bottom;                                                     // 0x0004   (0x0004)  
	int32_t                                            Left;                                                       // 0x0008   (0x0004)  
	int32_t                                            Right;                                                      // 0x000C   (0x0004)  
};

/// Struct /Script/INTLCore.CutoutInfoResult
/// Size: 0x0030 (48 bytes) (0x000040 - 0x000070) align 8 pad: 0x0000
struct FCutoutInfoResult : FINTLBaseResult
{ 
	bool                                               HasCutout;                                                  // 0x0040   (0x0001)  
	bool                                               IsCutoutHidden;                                             // 0x0041   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x0042   (0x0002)  MISSED
	int32_t                                            ScreenHeight;                                               // 0x0044   (0x0004)  
	int32_t                                            ScreenWidth;                                                // 0x0048   (0x0004)  
	int32_t                                            StatusBarHeight;                                            // 0x004C   (0x0004)  
	TArray<FCutoutRect>                                CutoutRects;                                                // 0x0050   (0x0010)  
	FCutoutRect                                        SafeArea;                                                   // 0x0060   (0x0010)  
};

/// Struct /Script/INTLCore.INTLExtendResult
/// Size: 0x0018 (24 bytes) (0x000040 - 0x000058) align 8 pad: 0x0000
struct FINTLExtendResult : FINTLBaseResult
{ 
	EINTLLoginChannel                                  Channel;                                                    // 0x0040   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0041   (0x0007)  MISSED
	FString                                            ExtendMethodName;                                           // 0x0048   (0x0010)  
};

/// Struct /Script/INTLCore.INTLDNSResult
/// Size: 0x0030 (48 bytes) (0x000040 - 0x000070) align 8 pad: 0x0000
struct FINTLDNSResult : FINTLBaseResult
{ 
	FString                                            V4;                                                         // 0x0040   (0x0010)  
	FString                                            V6;                                                         // 0x0050   (0x0010)  
	FString                                            Host;                                                       // 0x0060   (0x0010)  
};

/// Struct /Script/INTLCore.INTLToolsResult
/// Size: 0x0020 (32 bytes) (0x000040 - 0x000060) align 8 pad: 0x0000
struct FINTLToolsResult : FINTLBaseResult
{ 
	FString                                            DeepLinkUrl;                                                // 0x0040   (0x0010)  
	FString                                            ShortLinkUrl;                                               // 0x0050   (0x0010)  
};

/// Struct /Script/INTLCore.INTLStartUdpSocketResult
/// Size: 0x0018 (24 bytes) (0x000040 - 0x000058) align 8 pad: 0x0000
struct FINTLStartUdpSocketResult : FINTLBaseResult
{ 
	FString                                            Ip;                                                         // 0x0040   (0x0010)  
	int32_t                                            Net_delay;                                                  // 0x0050   (0x0004)  
	int32_t                                            Port;                                                       // 0x0054   (0x0004)  
};

/// Struct /Script/INTLCore.INTLDetectNetworkResult
/// Size: 0x0010 (16 bytes) (0x000040 - 0x000050) align 8 pad: 0x0000
struct FINTLDetectNetworkResult : FINTLBaseResult
{ 
	float                                              LocalRouterTime;                                            // 0x0040   (0x0004)  
	float                                              InternetRouterTime;                                         // 0x0044   (0x0004)  
	int32_t                                            InternetDelay;                                              // 0x0048   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x004C   (0x0004)  MISSED
};

/// Struct /Script/INTLCore.INTLLBSIPInfoResult
/// Size: 0x0028 (40 bytes) (0x000040 - 0x000068) align 8 pad: 0x0000
struct FINTLLBSIPInfoResult : FINTLBaseResult
{ 
	FString                                            Region;                                                     // 0x0040   (0x0010)  
	FString                                            Alpha2;                                                     // 0x0050   (0x0010)  
	int32_t                                            Timestamp;                                                  // 0x0060   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0064   (0x0004)  MISSED
};

/// Struct /Script/INTLCore.INTLDirTreeNode
/// Size: 0x0060 (96 bytes) (0x000000 - 0x000060) align 8 pad: 0x0000
struct FINTLDirTreeNode
{ 
	int32_t                                            NodeId;                                                     // 0x0000   (0x0004)  
	int32_t                                            ParentID;                                                   // 0x0004   (0x0004)  
	bool                                               IsLeaf;                                                     // 0x0008   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0009   (0x0007)  MISSED
	FString                                            Name;                                                       // 0x0010   (0x0010)  
	FString                                            URL;                                                        // 0x0020   (0x0010)  
	int32_t                                            status;                                                     // 0x0030   (0x0004)  
	int32_t                                            Tag;                                                        // 0x0034   (0x0004)  
	int32_t                                            CustomInt1;                                                 // 0x0038   (0x0004)  
	int32_t                                            CustomInt2;                                                 // 0x003C   (0x0004)  
	FString                                            CustomStr;                                                  // 0x0040   (0x0010)  
	TArray<int32_t>                                    ChildrenIdSet;                                              // 0x0050   (0x0010)  
};

/// Struct /Script/INTLCore.INTLDirTreeResult
/// Size: 0x0030 (48 bytes) (0x000040 - 0x000070) align 8 pad: 0x0000
struct FINTLDirTreeResult : FINTLBaseResult
{ 
	int32_t                                            TreeId;                                                     // 0x0040   (0x0004)  
	int32_t                                            NodeId;                                                     // 0x0044   (0x0004)  
	FString                                            TreeInfo;                                                   // 0x0048   (0x0010)  
	FString                                            RoleInfo;                                                   // 0x0058   (0x0010)  
	int32_t                                            ExpireTime;                                                 // 0x0068   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x006C   (0x0004)  MISSED
};

/// Struct /Script/INTLCore.INTLUpdateOptionalRepoFilesStatus
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 8 pad: 0x0000
struct FINTLUpdateOptionalRepoFilesStatus
{ 
	FString                                            FilePath;                                                   // 0x0000   (0x0010)  
	int32_t                                            TotalFileNum;                                               // 0x0010   (0x0004)  
	int32_t                                            ValidFileNum;                                               // 0x0014   (0x0004)  
	FString                                            NeedDownloadSize;                                           // 0x0018   (0x0010)  
};

/// Struct /Script/INTLCore.INTLUpdateInitInfo
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 8 pad: 0x0000
struct FINTLUpdateInitInfo
{ 
	EINTLUpdateActionType                              ActionType;                                                 // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	int32_t                                            RepoID;                                                     // 0x0004   (0x0004)  
	int32_t                                            ResourceCopyType;                                           // 0x0008   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FString                                            ResourceSavePath;                                           // 0x0010   (0x0010)  
	FString                                            FirstResourceDirPath;                                       // 0x0020   (0x0010)  
};

/// Struct /Script/INTLCore.INTLUpdateOptionalRepoInitResult
/// Size: 0x0008 (8 bytes) (0x000040 - 0x000048) align 8 pad: 0x0000
struct FINTLUpdateOptionalRepoInitResult : FINTLBaseResult
{ 
	EINTLUpdateActionType                              ActionType;                                                 // 0x0040   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0041   (0x0003)  MISSED
	int32_t                                            RepoID;                                                     // 0x0044   (0x0004)  
};

/// Struct /Script/INTLCore.INTLUpdateResult
/// Size: 0x0010 (16 bytes) (0x000040 - 0x000050) align 8 pad: 0x0000
struct FINTLUpdateResult : FINTLBaseResult
{ 
	EINTLUpdateActionType                              ActionType;                                                 // 0x0040   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0041   (0x0003)  MISSED
	int32_t                                            RepoID;                                                     // 0x0044   (0x0004)  
	int32_t                                            TaskId;                                                     // 0x0048   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x004C   (0x0004)  MISSED
};

/// Struct /Script/INTLCore.INTLUpdateProgress
/// Size: 0x0068 (104 bytes) (0x000000 - 0x000068) align 8 pad: 0x0000
struct FINTLUpdateProgress
{ 
	int32_t                                            methodId;                                                   // 0x0000   (0x0004)  
	EINTLUpdateActionType                              ActionType;                                                 // 0x0004   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0005   (0x0003)  MISSED
	int32_t                                            UpdateStep;                                                 // 0x0008   (0x0004)  
	int32_t                                            RepoID;                                                     // 0x000C   (0x0004)  
	int32_t                                            TaskId;                                                     // 0x0010   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0014   (0x0004)  MISSED
	FString                                            FinishedSize;                                               // 0x0018   (0x0010)  
	FString                                            TotalSize;                                                  // 0x0028   (0x0010)  
	FString                                            Speed;                                                      // 0x0038   (0x0010)  
	int32_t                                            RemainTime;                                                 // 0x0048   (0x0004)  
	float                                              StepProgress;                                               // 0x004C   (0x0004)  
	float                                              TotalProgress;                                              // 0x0050   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x0054   (0x0004)  MISSED
	FString                                            ErrorMsg;                                                   // 0x0058   (0x0010)  
};

/// Struct /Script/INTLCore.INTLUpdateStartRepoNewVersionInfo
/// Size: 0x0040 (64 bytes) (0x000000 - 0x000040) align 8 pad: 0x0000
struct FINTLUpdateStartRepoNewVersionInfo
{ 
	int32_t                                            methodId;                                                   // 0x0000   (0x0004)  
	EINTLUpdateActionType                              ActionType;                                                 // 0x0004   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0005   (0x0003)  MISSED
	int32_t                                            NewVersionType;                                             // 0x0008   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FString                                            Version;                                                    // 0x0010   (0x0010)  
	FString                                            NeedDownloadSize;                                           // 0x0020   (0x0010)  
	FString                                            GameDefinedStr;                                             // 0x0030   (0x0010)  
};

/// Struct /Script/INTLCore.INTLCustomerUserProfile
/// Size: 0x0100 (256 bytes) (0x000000 - 0x000100) align 8 pad: 0x0000
struct FINTLCustomerUserProfile
{ 
	FString                                            LangType;                                                   // 0x0000   (0x0010)  
	FString                                            Sign;                                                       // 0x0010   (0x0010)  
	FString                                            Openid;                                                     // 0x0020   (0x0010)  
	FString                                            GameLevel;                                                  // 0x0030   (0x0010)  
	FString                                            NickName;                                                   // 0x0040   (0x0010)  
	FString                                            RoleId;                                                     // 0x0050   (0x0010)  
	FString                                            AreaID;                                                     // 0x0060   (0x0010)  
	FString                                            ZoneId;                                                     // 0x0070   (0x0010)  
	FString                                            GameSvrId;                                                  // 0x0080   (0x0010)  
	FString                                            Region;                                                     // 0x0090   (0x0010)  
	FString                                            PictureUrl;                                                 // 0x00A0   (0x0010)  
	FString                                            CustomParam1;                                               // 0x00B0   (0x0010)  
	FString                                            CustomParam2;                                               // 0x00C0   (0x0010)  
	FString                                            CustomParam3;                                               // 0x00D0   (0x0010)  
	FString                                            CustomParam4;                                               // 0x00E0   (0x0010)  
	FString                                            CustomParam5;                                               // 0x00F0   (0x0010)  
};

/// Struct /Script/INTLCore.INTLCustomerResult
/// Size: 0x0008 (8 bytes) (0x000040 - 0x000048) align 8 pad: 0x0000
struct FINTLCustomerResult : FINTLBaseResult
{ 
	int32_t                                            MsgType;                                                    // 0x0040   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0044   (0x0004)  MISSED
};

/// Struct /Script/INTLCore.INTLComplianceResult
/// Size: 0x0098 (152 bytes) (0x000040 - 0x0000D8) align 8 pad: 0x0000
struct FINTLComplianceResult : FINTLBaseResult
{ 
	int32_t                                            AdultStatus;                                                // 0x0040   (0x0004)  
	int32_t                                            ParentCertificateStatus;                                    // 0x0044   (0x0004)  
	FString                                            ParentCertificateStatusExpiration;                          // 0x0048   (0x0010)  
	int32_t                                            EUUserAgreeStatus;                                          // 0x0058   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x005C   (0x0004)  MISSED
	FString                                            CountryCode;                                                // 0x0060   (0x0010)  
	int32_t                                            AdultAge;                                                   // 0x0070   (0x0004)  
	int32_t                                            GameGrade;                                                  // 0x0074   (0x0004)  
	int32_t                                            CertificateType;                                            // 0x0078   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x007C   (0x0004)  MISSED
	FString                                            AdultStatusExpiration;                                      // 0x0080   (0x0010)  
	FString                                            TS;                                                         // 0x0090   (0x0010)  
	bool                                               IsEEA;                                                      // 0x00A0   (0x0001)  
	unsigned char                                      UnknownData02_6[0x7];                                       // 0x00A1   (0x0007)  MISSED
	FString                                            Region;                                                     // 0x00A8   (0x0010)  
	FString                                            Email;                                                      // 0x00B8   (0x0010)  
	int32_t                                            RealNameAuthStatus;                                         // 0x00C8   (0x0004)  
	int32_t                                            NeedRealNameAuth;                                           // 0x00CC   (0x0004)  
	bool                                               NeedLICertification;                                        // 0x00D0   (0x0001)  
	unsigned char                                      UnknownData03_7[0x7];                                       // 0x00D1   (0x0007)  MISSED
};

/// Struct /Script/INTLCore.INTLWebViewResult
/// Size: 0x0018 (24 bytes) (0x000040 - 0x000058) align 8 pad: 0x0000
struct FINTLWebViewResult : FINTLBaseResult
{ 
	int32_t                                            MsgType;                                                    // 0x0040   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0044   (0x0004)  MISSED
	FString                                            MsgJsonData;                                                // 0x0048   (0x0010)  
};

/// Struct /Script/INTLCore.INTLPushResult
/// Size: 0x0018 (24 bytes) (0x000040 - 0x000058) align 8 pad: 0x0000
struct FINTLPushResult : FINTLBaseResult
{ 
	int32_t                                            Type;                                                       // 0x0040   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0044   (0x0004)  MISSED
	FString                                            Notification;                                               // 0x0048   (0x0010)  
};

/// Struct /Script/INTLCore.INTLLocalNotificationIOS
/// Size: 0x00A0 (160 bytes) (0x000000 - 0x0000A0) align 8 pad: 0x0000
struct FINTLLocalNotificationIOS
{ 
	int32_t                                            RepeatType;                                                 // 0x0000   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0004   (0x0004)  MISSED
	FString                                            AlertTitle;                                                 // 0x0008   (0x0010)  
	int32_t                                            FireTime;                                                   // 0x0018   (0x0004)  
	int32_t                                            Badge;                                                      // 0x001C   (0x0004)  
	FString                                            AlertBody;                                                  // 0x0020   (0x0010)  
	FString                                            AlertAction;                                                // 0x0030   (0x0010)  
	FString                                            NotificationID;                                             // 0x0040   (0x0010)  
	SDK_UNDEFINED(80,2720) /* TMap<FString, FString> */ __um(UserInfo);                                            // 0x0050   (0x0050)  
};

/// Struct /Script/INTLCore.INTLLocalNotification
/// Size: 0x0078 (120 bytes) (0x000000 - 0x000078) align 8 pad: 0x0000
struct FINTLLocalNotification
{ 
	int32_t                                            NotificationID;                                             // 0x0000   (0x0004)  
	int32_t                                            ActionType;                                                 // 0x0004   (0x0004)  
	int32_t                                            SoundEnabled;                                               // 0x0008   (0x0004)  
	int32_t                                            Lights;                                                     // 0x000C   (0x0004)  
	int32_t                                            Vibrate;                                                    // 0x0010   (0x0004)  
	int32_t                                            FireTime;                                                   // 0x0014   (0x0004)  
	FString                                            Title;                                                      // 0x0018   (0x0010)  
	FString                                            Content;                                                    // 0x0028   (0x0010)  
	FString                                            TickerText;                                                 // 0x0038   (0x0010)  
	FString                                            ActionParameter;                                            // 0x0048   (0x0010)  
	FString                                            RingUri;                                                    // 0x0058   (0x0010)  
	FString                                            SmallIcon;                                                  // 0x0068   (0x0010)  
};

/// Struct /Script/INTLCore.INTLFriendReqInfo
/// Size: 0x0088 (136 bytes) (0x000000 - 0x000088) align 8 pad: 0x0000
struct FINTLFriendReqInfo
{ 
	int32_t                                            Type;                                                       // 0x0000   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0004   (0x0004)  MISSED
	FString                                            User;                                                       // 0x0008   (0x0010)  
	FString                                            Title;                                                      // 0x0018   (0x0010)  
	FString                                            Description;                                                // 0x0028   (0x0010)  
	FString                                            ImagePath;                                                  // 0x0038   (0x0010)  
	FString                                            ThumbPath;                                                  // 0x0048   (0x0010)  
	FString                                            MediaPath;                                                  // 0x0058   (0x0010)  
	FString                                            Link;                                                       // 0x0068   (0x0010)  
	FString                                            extraJson;                                                  // 0x0078   (0x0010)  
};

/// Struct /Script/INTLCore.INTLPersonInfo
/// Size: 0x0088 (136 bytes) (0x000000 - 0x000088) align 8 pad: 0x0000
struct FINTLPersonInfo
{ 
	FString                                            Openid;                                                     // 0x0000   (0x0010)  
	FString                                            userName;                                                   // 0x0010   (0x0010)  
	int32_t                                            Gender;                                                     // 0x0020   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0024   (0x0004)  MISSED
	FString                                            PictureUrl;                                                 // 0x0028   (0x0010)  
	FString                                            Country;                                                    // 0x0038   (0x0010)  
	FString                                            Province;                                                   // 0x0048   (0x0010)  
	FString                                            City;                                                       // 0x0058   (0x0010)  
	FString                                            Language;                                                   // 0x0068   (0x0010)  
	FString                                            extraJson;                                                  // 0x0078   (0x0010)  
};

/// Struct /Script/INTLCore.INTLFriendResult
/// Size: 0x0010 (16 bytes) (0x000040 - 0x000050) align 8 pad: 0x0000
struct FINTLFriendResult : FINTLBaseResult
{ 
	TArray<FINTLPersonInfo>                            FriendInfoList;                                             // 0x0040   (0x0010)  
};

/// Struct /Script/INTLCore.INTLNoticePicture
/// Size: 0x0040 (64 bytes) (0x000000 - 0x000040) align 8 pad: 0x0000
struct FINTLNoticePicture
{ 
	FString                                            URL;                                                        // 0x0000   (0x0010)  
	FString                                            Hash;                                                       // 0x0010   (0x0010)  
	FString                                            RedirectURL;                                                // 0x0020   (0x0010)  
	FString                                            ExtraData;                                                  // 0x0030   (0x0010)  
};

/// Struct /Script/INTLCore.INTLNoticeContent
/// Size: 0x0070 (112 bytes) (0x000000 - 0x000070) align 8 pad: 0x0000
struct FINTLNoticeContent
{ 
	int32_t                                            ContentId;                                                  // 0x0000   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0004   (0x0004)  MISSED
	FString                                            AppContentId;                                               // 0x0008   (0x0010)  
	FString                                            Title;                                                      // 0x0018   (0x0010)  
	FString                                            Content;                                                    // 0x0028   (0x0010)  
	FString                                            LangType;                                                   // 0x0038   (0x0010)  
	int32_t                                            UpdateTime;                                                 // 0x0048   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x004C   (0x0004)  MISSED
	FString                                            ExtraData;                                                  // 0x0050   (0x0010)  
	TArray<FINTLNoticePicture>                         PictureList;                                                // 0x0060   (0x0010)  
};

/// Struct /Script/INTLCore.INTLNoticeInfo
/// Size: 0x0078 (120 bytes) (0x000000 - 0x000078) align 8 pad: 0x0000
struct FINTLNoticeInfo
{ 
	int32_t                                            NoticeID;                                                   // 0x0000   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0004   (0x0004)  MISSED
	FString                                            AppID;                                                      // 0x0008   (0x0010)  
	FString                                            AppNoticeId;                                                // 0x0018   (0x0010)  
	int32_t                                            status;                                                     // 0x0028   (0x0004)  
	int32_t                                            StartTime;                                                  // 0x002C   (0x0004)  
	int32_t                                            EndTime;                                                    // 0x0030   (0x0004)  
	int32_t                                            UpdateTime;                                                 // 0x0034   (0x0004)  
	FString                                            AreaList;                                                   // 0x0038   (0x0010)  
	TArray<FINTLNoticePicture>                         PictureList;                                                // 0x0048   (0x0010)  
	FString                                            ExtraData;                                                  // 0x0058   (0x0010)  
	TArray<FINTLNoticeContent>                         ContentList;                                                // 0x0068   (0x0010)  
};

/// Struct /Script/INTLCore.INTLNoticeResult
/// Size: 0x0020 (32 bytes) (0x000040 - 0x000060) align 8 pad: 0x0000
struct FINTLNoticeResult : FINTLBaseResult
{ 
	FString                                            SeqId;                                                      // 0x0040   (0x0010)  
	TArray<FINTLNoticeInfo>                            NoticeInfoList;                                             // 0x0050   (0x0010)  
};

/// Struct /Script/INTLCore.INTLAccountProfile
/// Size: 0x00D8 (216 bytes) (0x000000 - 0x0000D8) align 8 pad: 0x0000
struct FINTLAccountProfile
{ 
	FString                                            userName;                                                   // 0x0000   (0x0010)  
	FString                                            Birthday;                                                   // 0x0010   (0x0010)  
	int32_t                                            BirthdayYear;                                               // 0x0020   (0x0004)  
	int32_t                                            BirthdayMonth;                                              // 0x0024   (0x0004)  
	int32_t                                            BirthdayDay;                                                // 0x0028   (0x0004)  
	int32_t                                            isReceiveEmail;                                             // 0x002C   (0x0004)  
	FString                                            Region;                                                     // 0x0030   (0x0010)  
	FString                                            LangType;                                                   // 0x0040   (0x0010)  
	FString                                            extraJson;                                                  // 0x0050   (0x0010)  
	FString                                            Email;                                                      // 0x0060   (0x0010)  
	FString                                            Phone;                                                      // 0x0070   (0x0010)  
	FString                                            PhoneAreaCode;                                              // 0x0080   (0x0010)  
	int32_t                                            AccountType;                                                // 0x0090   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0094   (0x0004)  MISSED
	FString                                            NickName;                                                   // 0x0098   (0x0010)  
	FString                                            PrivacyPolicy;                                              // 0x00A8   (0x0010)  
	FString                                            TermsOfService;                                             // 0x00B8   (0x0010)  
	int32_t                                            PrivacyUpdateTime;                                          // 0x00C8   (0x0004)  
	int32_t                                            TermsUpdateTime;                                            // 0x00CC   (0x0004)  
	int32_t                                            UsernamePassVerify;                                         // 0x00D0   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x00D4   (0x0004)  MISSED
};

/// Struct /Script/INTLCore.INTLAccountResult
/// Size: 0x0238 (568 bytes) (0x000040 - 0x000278) align 8 pad: 0x0000
struct FINTLAccountResult : FINTLBaseResult
{ 
	int32_t                                            ChannelID;                                                  // 0x0040   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0044   (0x0004)  MISSED
	FString                                            Channel;                                                    // 0x0048   (0x0010)  
	FString                                            SeqId;                                                      // 0x0058   (0x0010)  
	FString                                            userName;                                                   // 0x0068   (0x0010)  
	FString                                            uid;                                                        // 0x0078   (0x0010)  
	FString                                            Token;                                                      // 0x0088   (0x0010)  
	int32_t                                            ExpireTime;                                                 // 0x0098   (0x0004)  
	int32_t                                            isRegister;                                                 // 0x009C   (0x0004)  
	int32_t                                            isSetPassword;                                              // 0x00A0   (0x0004)  
	int32_t                                            isReceiveEmail;                                             // 0x00A4   (0x0004)  
	int32_t                                            VerifyCodeExpireTime;                                       // 0x00A8   (0x0004)  
	bool                                               RequestIsLogin;                                             // 0x00AC   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x00AD   (0x0003)  MISSED
	int32_t                                            CanBind;                                                    // 0x00B0   (0x0004)  
	int32_t                                            LoginDays;                                                  // 0x00B4   (0x0004)  
	FString                                            PpAcceptanceVersion;                                        // 0x00B8   (0x0010)  
	FString                                            TosAcceptanceVersion;                                       // 0x00C8   (0x0010)  
	FDateTime                                          PpAcceptanceTime;                                           // 0x00D8   (0x0008)  
	FDateTime                                          TosAcceptanceTime;                                          // 0x00E0   (0x0008)  
	FINTLAccountProfile                                Profile;                                                    // 0x00E8   (0x00D8)  
	int32_t                                            IsUserNameAvailable;                                        // 0x01C0   (0x0004)  
	bool                                               HasGameSaccUid;                                             // 0x01C4   (0x0001)  
	unsigned char                                      UnknownData02_6[0x3];                                       // 0x01C5   (0x0003)  MISSED
	FString                                            GameSaccUid;                                                // 0x01C8   (0x0010)  
	bool                                               HasGameSaccOpenId;                                          // 0x01D8   (0x0001)  
	unsigned char                                      UnknownData03_6[0x7];                                       // 0x01D9   (0x0007)  MISSED
	FString                                            GameSaccOpenId;                                             // 0x01E0   (0x0010)  
	bool                                               HasLiUid;                                                   // 0x01F0   (0x0001)  
	unsigned char                                      UnknownData04_6[0x7];                                       // 0x01F1   (0x0007)  MISSED
	FString                                            LiUid;                                                      // 0x01F8   (0x0010)  
	bool                                               HasLiOpenId;                                                // 0x0208   (0x0001)  
	unsigned char                                      UnknownData05_6[0x7];                                       // 0x0209   (0x0007)  MISSED
	FString                                            LiOpenId;                                                   // 0x0210   (0x0010)  
	bool                                               NeedNotify;                                                 // 0x0220   (0x0001)  
	unsigned char                                      UnknownData06_6[0x7];                                       // 0x0221   (0x0007)  MISSED
	FString                                            UserAgreedGameTos;                                          // 0x0228   (0x0010)  
	FString                                            UserAgreedGamePP;                                           // 0x0238   (0x0010)  
	FString                                            UserAgreedLiPP;                                             // 0x0248   (0x0010)  
	FString                                            UserAgreedLiDt;                                             // 0x0258   (0x0010)  
	FString                                            UserAgreedLiTos;                                            // 0x0268   (0x0010)  
};

/// Struct /Script/INTLCore.INTLDeviceLevelResult
/// Size: 0x0008 (8 bytes) (0x000040 - 0x000048) align 8 pad: 0x0000
struct FINTLDeviceLevelResult : FINTLBaseResult
{ 
	int32_t                                            DeviceLevel;                                                // 0x0040   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0044   (0x0004)  MISSED
};

/// Struct /Script/INTLCore.INTLIDTokenResult
/// Size: 0x0010 (16 bytes) (0x000040 - 0x000050) align 8 pad: 0x0000
struct FINTLIDTokenResult : FINTLBaseResult
{ 
	FString                                            IdToken;                                                    // 0x0040   (0x0010)  
};

/// Struct /Script/INTLCore.INTLAuthResult
/// Size: 0x0130 (304 bytes) (0x000040 - 0x000170) align 8 pad: 0x0000
struct FINTLAuthResult : FINTLBaseResult
{ 
	FString                                            Openid;                                                     // 0x0040   (0x0010)  
	FString                                            Token;                                                      // 0x0050   (0x0010)  
	int32_t                                            TokenExpireTime;                                            // 0x0060   (0x0004)  
	int32_t                                            FirstLogin;                                                 // 0x0064   (0x0004)  
	FString                                            RegChannelDis;                                              // 0x0068   (0x0010)  
	FString                                            userName;                                                   // 0x0078   (0x0010)  
	int32_t                                            Gender;                                                     // 0x0088   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x008C   (0x0004)  MISSED
	FString                                            Birthday;                                                   // 0x0090   (0x0010)  
	FString                                            PicUrl;                                                     // 0x00A0   (0x0010)  
	FString                                            Pf;                                                         // 0x00B0   (0x0010)  
	FString                                            PfKey;                                                      // 0x00C0   (0x0010)  
	bool                                               NeedRealNameAuth;                                           // 0x00D0   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x00D1   (0x0003)  MISSED
	int32_t                                            ChannelID;                                                  // 0x00D4   (0x0004)  
	EINTLLoginChannel                                  ChannelName;                                                // 0x00D8   (0x0001)  
	unsigned char                                      UnknownData02_6[0x7];                                       // 0x00D9   (0x0007)  MISSED
	FString                                            ChannelInfo;                                                // 0x00E0   (0x0010)  
	FString                                            ConfirmCode;                                                // 0x00F0   (0x0010)  
	int32_t                                            ConfirmCodeExpireTime;                                      // 0x0100   (0x0004)  
	unsigned char                                      UnknownData03_6[0x4];                                       // 0x0104   (0x0004)  MISSED
	FString                                            BindList;                                                   // 0x0108   (0x0010)  
	FString                                            LegalDocumentsAcceptedVersion;                              // 0x0118   (0x0010)  
	int32_t                                            DeleteAccountStatus;                                        // 0x0128   (0x0004)  
	unsigned char                                      UnknownData04_6[0x4];                                       // 0x012C   (0x0004)  MISSED
	FString                                            DeleteAccountInfo;                                          // 0x0130   (0x0010)  
	int32_t                                            DeleteLIAccountStatus;                                      // 0x0140   (0x0004)  
	unsigned char                                      UnknownData05_6[0x4];                                       // 0x0144   (0x0004)  MISSED
	FString                                            TransferCode;                                               // 0x0148   (0x0010)  
	int32_t                                            TransferCodeExpireTime;                                     // 0x0158   (0x0004)  
	unsigned char                                      UnknownData06_6[0x4];                                       // 0x015C   (0x0004)  MISSED
	FString                                            Email;                                                      // 0x0160   (0x0010)  
};

/// Struct /Script/INTLCore.INTLGroupReqInfo
/// Size: 0x0020 (32 bytes) (0x000040 - 0x000060) align 8 pad: 0x0000
struct FINTLGroupReqInfo : FINTLBaseResult
{ 
	FString                                            worldId;                                                    // 0x0040   (0x0010)  
	FString                                            guildId;                                                    // 0x0050   (0x0010)  
};

static_assert(sizeof(UINTLBaseUserWidget) == 0x0290); // 656 bytes (0x000288 - 0x000290)
static_assert(sizeof(UINTLOutputUtility) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UINTLPluginObserver) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UINTLSDKAPI) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UINTLUtility) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FINTLBaseResult) == 0x0040); // 64 bytes (0x000000 - 0x000040)
static_assert(sizeof(FINTLAdjustAttrsChangedResult) == 0x0050); // 80 bytes (0x000040 - 0x000050)
static_assert(sizeof(FINTLTabExpEntity) == 0x0120); // 288 bytes (0x000000 - 0x000120)
static_assert(sizeof(FINTLRewardItem) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(FINTLEventsInfoItem) == 0x0040); // 64 bytes (0x000000 - 0x000040)
static_assert(sizeof(FINTLLIBindRewardResult) == 0x0080); // 128 bytes (0x000040 - 0x000080)
static_assert(sizeof(FINTLPermissionResult) == 0x0050); // 80 bytes (0x000040 - 0x000050)
static_assert(sizeof(FCutoutRect) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FCutoutInfoResult) == 0x0070); // 112 bytes (0x000040 - 0x000070)
static_assert(sizeof(FINTLExtendResult) == 0x0058); // 88 bytes (0x000040 - 0x000058)
static_assert(sizeof(FINTLDNSResult) == 0x0070); // 112 bytes (0x000040 - 0x000070)
static_assert(sizeof(FINTLToolsResult) == 0x0060); // 96 bytes (0x000040 - 0x000060)
static_assert(sizeof(FINTLStartUdpSocketResult) == 0x0058); // 88 bytes (0x000040 - 0x000058)
static_assert(sizeof(FINTLDetectNetworkResult) == 0x0050); // 80 bytes (0x000040 - 0x000050)
static_assert(sizeof(FINTLLBSIPInfoResult) == 0x0068); // 104 bytes (0x000040 - 0x000068)
static_assert(sizeof(FINTLDirTreeNode) == 0x0060); // 96 bytes (0x000000 - 0x000060)
static_assert(sizeof(FINTLDirTreeResult) == 0x0070); // 112 bytes (0x000040 - 0x000070)
static_assert(sizeof(FINTLUpdateOptionalRepoFilesStatus) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(FINTLUpdateInitInfo) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(sizeof(FINTLUpdateOptionalRepoInitResult) == 0x0048); // 72 bytes (0x000040 - 0x000048)
static_assert(sizeof(FINTLUpdateResult) == 0x0050); // 80 bytes (0x000040 - 0x000050)
static_assert(sizeof(FINTLUpdateProgress) == 0x0068); // 104 bytes (0x000000 - 0x000068)
static_assert(sizeof(FINTLUpdateStartRepoNewVersionInfo) == 0x0040); // 64 bytes (0x000000 - 0x000040)
static_assert(sizeof(FINTLCustomerUserProfile) == 0x0100); // 256 bytes (0x000000 - 0x000100)
static_assert(sizeof(FINTLCustomerResult) == 0x0048); // 72 bytes (0x000040 - 0x000048)
static_assert(sizeof(FINTLComplianceResult) == 0x00D8); // 216 bytes (0x000040 - 0x0000D8)
static_assert(sizeof(FINTLWebViewResult) == 0x0058); // 88 bytes (0x000040 - 0x000058)
static_assert(sizeof(FINTLPushResult) == 0x0058); // 88 bytes (0x000040 - 0x000058)
static_assert(sizeof(FINTLLocalNotificationIOS) == 0x00A0); // 160 bytes (0x000000 - 0x0000A0)
static_assert(sizeof(FINTLLocalNotification) == 0x0078); // 120 bytes (0x000000 - 0x000078)
static_assert(sizeof(FINTLFriendReqInfo) == 0x0088); // 136 bytes (0x000000 - 0x000088)
static_assert(sizeof(FINTLPersonInfo) == 0x0088); // 136 bytes (0x000000 - 0x000088)
static_assert(sizeof(FINTLFriendResult) == 0x0050); // 80 bytes (0x000040 - 0x000050)
static_assert(sizeof(FINTLNoticePicture) == 0x0040); // 64 bytes (0x000000 - 0x000040)
static_assert(sizeof(FINTLNoticeContent) == 0x0070); // 112 bytes (0x000000 - 0x000070)
static_assert(sizeof(FINTLNoticeInfo) == 0x0078); // 120 bytes (0x000000 - 0x000078)
static_assert(sizeof(FINTLNoticeResult) == 0x0060); // 96 bytes (0x000040 - 0x000060)
static_assert(sizeof(FINTLAccountProfile) == 0x00D8); // 216 bytes (0x000000 - 0x0000D8)
static_assert(sizeof(FINTLAccountResult) == 0x0278); // 632 bytes (0x000040 - 0x000278)
static_assert(sizeof(FINTLDeviceLevelResult) == 0x0048); // 72 bytes (0x000040 - 0x000048)
static_assert(sizeof(FINTLIDTokenResult) == 0x0050); // 80 bytes (0x000040 - 0x000050)
static_assert(sizeof(FINTLAuthResult) == 0x0170); // 368 bytes (0x000040 - 0x000170)
static_assert(sizeof(FINTLGroupReqInfo) == 0x0060); // 96 bytes (0x000040 - 0x000060)
static_assert(offsetof(FINTLBaseResult, RetMsg) == 0x0008);
static_assert(offsetof(FINTLBaseResult, ThirdMsg) == 0x0020);
static_assert(offsetof(FINTLBaseResult, extraJson) == 0x0030);
static_assert(offsetof(FINTLAdjustAttrsChangedResult, AdjustAttribution) == 0x0040);
static_assert(offsetof(FINTLTabExpEntity, ExpName) == 0x0000);
static_assert(offsetof(FINTLTabExpEntity, Assignment) == 0x0010);
static_assert(offsetof(FINTLTabExpEntity, ExpGrayId) == 0x0020);
static_assert(offsetof(FINTLTabExpEntity, LayerName) == 0x0030);
static_assert(offsetof(FINTLTabExpEntity, ExpKey) == 0x00A0);
static_assert(offsetof(FINTLTabExpEntity, ExpGroupKey) == 0x00B0);
static_assert(offsetof(FINTLTabExpEntity, ModuleCode) == 0x00C0);
static_assert(offsetof(FINTLRewardItem, desc) == 0x0000);
static_assert(offsetof(FINTLRewardItem, icon) == 0x0010);
static_assert(offsetof(FINTLEventsInfoItem, Image) == 0x0008);
static_assert(offsetof(FINTLEventsInfoItem, Content) == 0x0018);
static_assert(offsetof(FINTLEventsInfoItem, rewards) == 0x0030);
static_assert(offsetof(FINTLLIBindRewardResult, Image) == 0x0040);
static_assert(offsetof(FINTLLIBindRewardResult, Content) == 0x0050);
static_assert(offsetof(FINTLLIBindRewardResult, Events) == 0x0070);
static_assert(offsetof(FINTLPermissionResult, permission_json_) == 0x0040);
static_assert(offsetof(FCutoutInfoResult, CutoutRects) == 0x0050);
static_assert(offsetof(FCutoutInfoResult, SafeArea) == 0x0060);
static_assert(offsetof(FINTLExtendResult, Channel) == 0x0040);
static_assert(offsetof(FINTLExtendResult, ExtendMethodName) == 0x0048);
static_assert(offsetof(FINTLDNSResult, V4) == 0x0040);
static_assert(offsetof(FINTLDNSResult, V6) == 0x0050);
static_assert(offsetof(FINTLDNSResult, Host) == 0x0060);
static_assert(offsetof(FINTLToolsResult, DeepLinkUrl) == 0x0040);
static_assert(offsetof(FINTLToolsResult, ShortLinkUrl) == 0x0050);
static_assert(offsetof(FINTLStartUdpSocketResult, Ip) == 0x0040);
static_assert(offsetof(FINTLLBSIPInfoResult, Region) == 0x0040);
static_assert(offsetof(FINTLLBSIPInfoResult, Alpha2) == 0x0050);
static_assert(offsetof(FINTLDirTreeNode, Name) == 0x0010);
static_assert(offsetof(FINTLDirTreeNode, URL) == 0x0020);
static_assert(offsetof(FINTLDirTreeNode, CustomStr) == 0x0040);
static_assert(offsetof(FINTLDirTreeNode, ChildrenIdSet) == 0x0050);
static_assert(offsetof(FINTLDirTreeResult, TreeInfo) == 0x0048);
static_assert(offsetof(FINTLDirTreeResult, RoleInfo) == 0x0058);
static_assert(offsetof(FINTLUpdateOptionalRepoFilesStatus, FilePath) == 0x0000);
static_assert(offsetof(FINTLUpdateOptionalRepoFilesStatus, NeedDownloadSize) == 0x0018);
static_assert(offsetof(FINTLUpdateInitInfo, ActionType) == 0x0000);
static_assert(offsetof(FINTLUpdateInitInfo, ResourceSavePath) == 0x0010);
static_assert(offsetof(FINTLUpdateInitInfo, FirstResourceDirPath) == 0x0020);
static_assert(offsetof(FINTLUpdateOptionalRepoInitResult, ActionType) == 0x0040);
static_assert(offsetof(FINTLUpdateResult, ActionType) == 0x0040);
static_assert(offsetof(FINTLUpdateProgress, ActionType) == 0x0004);
static_assert(offsetof(FINTLUpdateProgress, FinishedSize) == 0x0018);
static_assert(offsetof(FINTLUpdateProgress, TotalSize) == 0x0028);
static_assert(offsetof(FINTLUpdateProgress, Speed) == 0x0038);
static_assert(offsetof(FINTLUpdateProgress, ErrorMsg) == 0x0058);
static_assert(offsetof(FINTLUpdateStartRepoNewVersionInfo, ActionType) == 0x0004);
static_assert(offsetof(FINTLUpdateStartRepoNewVersionInfo, Version) == 0x0010);
static_assert(offsetof(FINTLUpdateStartRepoNewVersionInfo, NeedDownloadSize) == 0x0020);
static_assert(offsetof(FINTLUpdateStartRepoNewVersionInfo, GameDefinedStr) == 0x0030);
static_assert(offsetof(FINTLCustomerUserProfile, LangType) == 0x0000);
static_assert(offsetof(FINTLCustomerUserProfile, Sign) == 0x0010);
static_assert(offsetof(FINTLCustomerUserProfile, Openid) == 0x0020);
static_assert(offsetof(FINTLCustomerUserProfile, GameLevel) == 0x0030);
static_assert(offsetof(FINTLCustomerUserProfile, NickName) == 0x0040);
static_assert(offsetof(FINTLCustomerUserProfile, RoleId) == 0x0050);
static_assert(offsetof(FINTLCustomerUserProfile, AreaID) == 0x0060);
static_assert(offsetof(FINTLCustomerUserProfile, ZoneId) == 0x0070);
static_assert(offsetof(FINTLCustomerUserProfile, GameSvrId) == 0x0080);
static_assert(offsetof(FINTLCustomerUserProfile, Region) == 0x0090);
static_assert(offsetof(FINTLCustomerUserProfile, PictureUrl) == 0x00A0);
static_assert(offsetof(FINTLCustomerUserProfile, CustomParam1) == 0x00B0);
static_assert(offsetof(FINTLCustomerUserProfile, CustomParam2) == 0x00C0);
static_assert(offsetof(FINTLCustomerUserProfile, CustomParam3) == 0x00D0);
static_assert(offsetof(FINTLCustomerUserProfile, CustomParam4) == 0x00E0);
static_assert(offsetof(FINTLCustomerUserProfile, CustomParam5) == 0x00F0);
static_assert(offsetof(FINTLComplianceResult, ParentCertificateStatusExpiration) == 0x0048);
static_assert(offsetof(FINTLComplianceResult, CountryCode) == 0x0060);
static_assert(offsetof(FINTLComplianceResult, AdultStatusExpiration) == 0x0080);
static_assert(offsetof(FINTLComplianceResult, TS) == 0x0090);
static_assert(offsetof(FINTLComplianceResult, Region) == 0x00A8);
static_assert(offsetof(FINTLComplianceResult, Email) == 0x00B8);
static_assert(offsetof(FINTLWebViewResult, MsgJsonData) == 0x0048);
static_assert(offsetof(FINTLPushResult, Notification) == 0x0048);
static_assert(offsetof(FINTLLocalNotificationIOS, AlertTitle) == 0x0008);
static_assert(offsetof(FINTLLocalNotificationIOS, AlertBody) == 0x0020);
static_assert(offsetof(FINTLLocalNotificationIOS, AlertAction) == 0x0030);
static_assert(offsetof(FINTLLocalNotificationIOS, NotificationID) == 0x0040);
static_assert(offsetof(FINTLLocalNotification, Title) == 0x0018);
static_assert(offsetof(FINTLLocalNotification, Content) == 0x0028);
static_assert(offsetof(FINTLLocalNotification, TickerText) == 0x0038);
static_assert(offsetof(FINTLLocalNotification, ActionParameter) == 0x0048);
static_assert(offsetof(FINTLLocalNotification, RingUri) == 0x0058);
static_assert(offsetof(FINTLLocalNotification, SmallIcon) == 0x0068);
static_assert(offsetof(FINTLFriendReqInfo, User) == 0x0008);
static_assert(offsetof(FINTLFriendReqInfo, Title) == 0x0018);
static_assert(offsetof(FINTLFriendReqInfo, Description) == 0x0028);
static_assert(offsetof(FINTLFriendReqInfo, ImagePath) == 0x0038);
static_assert(offsetof(FINTLFriendReqInfo, ThumbPath) == 0x0048);
static_assert(offsetof(FINTLFriendReqInfo, MediaPath) == 0x0058);
static_assert(offsetof(FINTLFriendReqInfo, Link) == 0x0068);
static_assert(offsetof(FINTLFriendReqInfo, extraJson) == 0x0078);
static_assert(offsetof(FINTLPersonInfo, Openid) == 0x0000);
static_assert(offsetof(FINTLPersonInfo, userName) == 0x0010);
static_assert(offsetof(FINTLPersonInfo, PictureUrl) == 0x0028);
static_assert(offsetof(FINTLPersonInfo, Country) == 0x0038);
static_assert(offsetof(FINTLPersonInfo, Province) == 0x0048);
static_assert(offsetof(FINTLPersonInfo, City) == 0x0058);
static_assert(offsetof(FINTLPersonInfo, Language) == 0x0068);
static_assert(offsetof(FINTLPersonInfo, extraJson) == 0x0078);
static_assert(offsetof(FINTLFriendResult, FriendInfoList) == 0x0040);
static_assert(offsetof(FINTLNoticePicture, URL) == 0x0000);
static_assert(offsetof(FINTLNoticePicture, Hash) == 0x0010);
static_assert(offsetof(FINTLNoticePicture, RedirectURL) == 0x0020);
static_assert(offsetof(FINTLNoticePicture, ExtraData) == 0x0030);
static_assert(offsetof(FINTLNoticeContent, AppContentId) == 0x0008);
static_assert(offsetof(FINTLNoticeContent, Title) == 0x0018);
static_assert(offsetof(FINTLNoticeContent, Content) == 0x0028);
static_assert(offsetof(FINTLNoticeContent, LangType) == 0x0038);
static_assert(offsetof(FINTLNoticeContent, ExtraData) == 0x0050);
static_assert(offsetof(FINTLNoticeContent, PictureList) == 0x0060);
static_assert(offsetof(FINTLNoticeInfo, AppID) == 0x0008);
static_assert(offsetof(FINTLNoticeInfo, AppNoticeId) == 0x0018);
static_assert(offsetof(FINTLNoticeInfo, AreaList) == 0x0038);
static_assert(offsetof(FINTLNoticeInfo, PictureList) == 0x0048);
static_assert(offsetof(FINTLNoticeInfo, ExtraData) == 0x0058);
static_assert(offsetof(FINTLNoticeInfo, ContentList) == 0x0068);
static_assert(offsetof(FINTLNoticeResult, SeqId) == 0x0040);
static_assert(offsetof(FINTLNoticeResult, NoticeInfoList) == 0x0050);
static_assert(offsetof(FINTLAccountProfile, userName) == 0x0000);
static_assert(offsetof(FINTLAccountProfile, Birthday) == 0x0010);
static_assert(offsetof(FINTLAccountProfile, Region) == 0x0030);
static_assert(offsetof(FINTLAccountProfile, LangType) == 0x0040);
static_assert(offsetof(FINTLAccountProfile, extraJson) == 0x0050);
static_assert(offsetof(FINTLAccountProfile, Email) == 0x0060);
static_assert(offsetof(FINTLAccountProfile, Phone) == 0x0070);
static_assert(offsetof(FINTLAccountProfile, PhoneAreaCode) == 0x0080);
static_assert(offsetof(FINTLAccountProfile, NickName) == 0x0098);
static_assert(offsetof(FINTLAccountProfile, PrivacyPolicy) == 0x00A8);
static_assert(offsetof(FINTLAccountProfile, TermsOfService) == 0x00B8);
static_assert(offsetof(FINTLAccountResult, Channel) == 0x0048);
static_assert(offsetof(FINTLAccountResult, SeqId) == 0x0058);
static_assert(offsetof(FINTLAccountResult, userName) == 0x0068);
static_assert(offsetof(FINTLAccountResult, uid) == 0x0078);
static_assert(offsetof(FINTLAccountResult, Token) == 0x0088);
static_assert(offsetof(FINTLAccountResult, PpAcceptanceVersion) == 0x00B8);
static_assert(offsetof(FINTLAccountResult, TosAcceptanceVersion) == 0x00C8);
static_assert(offsetof(FINTLAccountResult, PpAcceptanceTime) == 0x00D8);
static_assert(offsetof(FINTLAccountResult, TosAcceptanceTime) == 0x00E0);
static_assert(offsetof(FINTLAccountResult, Profile) == 0x00E8);
static_assert(offsetof(FINTLAccountResult, GameSaccUid) == 0x01C8);
static_assert(offsetof(FINTLAccountResult, GameSaccOpenId) == 0x01E0);
static_assert(offsetof(FINTLAccountResult, LiUid) == 0x01F8);
static_assert(offsetof(FINTLAccountResult, LiOpenId) == 0x0210);
static_assert(offsetof(FINTLAccountResult, UserAgreedGameTos) == 0x0228);
static_assert(offsetof(FINTLAccountResult, UserAgreedGamePP) == 0x0238);
static_assert(offsetof(FINTLAccountResult, UserAgreedLiPP) == 0x0248);
static_assert(offsetof(FINTLAccountResult, UserAgreedLiDt) == 0x0258);
static_assert(offsetof(FINTLAccountResult, UserAgreedLiTos) == 0x0268);
static_assert(offsetof(FINTLIDTokenResult, IdToken) == 0x0040);
static_assert(offsetof(FINTLAuthResult, Openid) == 0x0040);
static_assert(offsetof(FINTLAuthResult, Token) == 0x0050);
static_assert(offsetof(FINTLAuthResult, RegChannelDis) == 0x0068);
static_assert(offsetof(FINTLAuthResult, userName) == 0x0078);
static_assert(offsetof(FINTLAuthResult, Birthday) == 0x0090);
static_assert(offsetof(FINTLAuthResult, PicUrl) == 0x00A0);
static_assert(offsetof(FINTLAuthResult, Pf) == 0x00B0);
static_assert(offsetof(FINTLAuthResult, PfKey) == 0x00C0);
static_assert(offsetof(FINTLAuthResult, ChannelName) == 0x00D8);
static_assert(offsetof(FINTLAuthResult, ChannelInfo) == 0x00E0);
static_assert(offsetof(FINTLAuthResult, ConfirmCode) == 0x00F0);
static_assert(offsetof(FINTLAuthResult, BindList) == 0x0108);
static_assert(offsetof(FINTLAuthResult, LegalDocumentsAcceptedVersion) == 0x0118);
static_assert(offsetof(FINTLAuthResult, DeleteAccountInfo) == 0x0130);
static_assert(offsetof(FINTLAuthResult, TransferCode) == 0x0148);
static_assert(offsetof(FINTLAuthResult, Email) == 0x0160);
static_assert(offsetof(FINTLGroupReqInfo, worldId) == 0x0040);
static_assert(offsetof(FINTLGroupReqInfo, guildId) == 0x0050);
