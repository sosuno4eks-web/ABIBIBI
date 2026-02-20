
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Class /Script/GameNative.INTLGameNativeAPI
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UINTLGameNativeAPI : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/GameNative.INTLGameNativeAPI.UpdatePlayerLevel
	// void UpdatePlayerLevel(int32_t PlayerLevel);                                                                             // [0x185aec0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameNative.INTLGameNativeAPI.TestLuaError
	// void TestLuaError();                                                                                                     // [0x185aea0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameNative.INTLGameNativeAPI.StartLI
	// int32_t StartLI();                                                                                                       // [0x185ae70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameNative.INTLGameNativeAPI.Start
	// int32_t Start();                                                                                                         // [0x185ae40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameNative.INTLGameNativeAPI.ShareResult
	// void ShareResult(FString shareType, FString ModuleName, bool Success);                                                   // [0x185ad00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameNative.INTLGameNativeAPI.SetXWID
	// void SetXWID(FString xwid);                                                                                              // [0x185ac60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameNative.INTLGameNativeAPI.SetUserData
	// int32_t SetUserData(FINTLUserData UserData);                                                                             // [0x185a650] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameNative.INTLGameNativeAPI.SetLuaReportEnable
	// void SetLuaReportEnable(bool enable);                                                                                    // [0x185a5d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameNative.INTLGameNativeAPI.SetLIPASSVersion
	// void SetLIPASSVersion(FString Version);                                                                                  // [0x185a530] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameNative.INTLGameNativeAPI.OnBackPressed
	// bool OnBackPressed();                                                                                                    // [0x185a500] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameNative.INTLGameNativeAPI.NotifyGameTaskCompleted
	// void NotifyGameTaskCompleted(FString TaskName, FString ExtraParams);                                                     // [0x185a400] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameNative.INTLGameNativeAPI.LoadLIAsset
	// int32_t LoadLIAsset();                                                                                                   // [0x185a3d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameNative.INTLGameNativeAPI.IsPopPanelAllowedResult
	// void IsPopPanelAllowedResult(FString ModuleName, bool allowed, FString activityClassification);                          // [0x185a280] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameNative.INTLGameNativeAPI.IsLoadDefaultActivityFromApp
	// bool IsLoadDefaultActivityFromApp();                                                                                     // [0x185a250] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameNative.INTLGameNativeAPI.Init
	// int32_t Init(class UGameInstance* Instance, FString Host, bool isTest, FString DefaultActivity);                         // [0x185a0c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameNative.INTLGameNativeAPI.InformGameEvent
	// void InformGameEvent(FString EventName, FString ExtraParams);                                                            // [0x1859fc0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameNative.INTLGameNativeAPI.FocusLIPassUI
	// bool FocusLIPassUI();                                                                                                    // [0x1859f90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameNative.INTLGameNativeAPI.CmdToGameNative
	// int32_t CmdToGameNative(FString jsonMsg);                                                                                // [0x1859ee0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameNative.INTLGameNativeAPI.Close
	// int32_t Close();                                                                                                         // [0x1859eb0] Final|Native|Static|Public|BlueprintCallable 
};

/// Struct /Script/GameNative.INTLUserData
/// Size: 0x00E8 (232 bytes) (0x000000 - 0x0000E8) align 8 pad: 0x0000
struct FINTLUserData
{ 
	int32_t                                            GameId;                                                     // 0x0000   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0004   (0x0004)  MISSED
	FString                                            ChannelID;                                                  // 0x0008   (0x0010)  
	FString                                            Openid;                                                     // 0x0018   (0x0010)  
	FString                                            Token;                                                      // 0x0028   (0x0010)  
	FString                                            RoleId;                                                     // 0x0038   (0x0010)  
	FString                                            Region;                                                     // 0x0048   (0x0010)  
	int32_t                                            AreaID;                                                     // 0x0058   (0x0004)  
	int32_t                                            ZoneId;                                                     // 0x005C   (0x0004)  
	int32_t                                            Os;                                                         // 0x0060   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0064   (0x0004)  MISSED
	FString                                            LangType;                                                   // 0x0068   (0x0010)  
	FString                                            DefLangType;                                                // 0x0078   (0x0010)  
	FString                                            RoleName;                                                   // 0x0088   (0x0010)  
	FString                                            PayToken;                                                   // 0x0098   (0x0010)  
	FString                                            HeadUrl;                                                    // 0x00A8   (0x0010)  
	FString                                            PlayerLevel;                                                // 0x00B8   (0x0010)  
	FString                                            AppVersion;                                                 // 0x00C8   (0x0010)  
	FString                                            extraJson;                                                  // 0x00D8   (0x0010)  
};

/// Struct /Script/GameNative.INTLFrameInfo
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 8 pad: 0x0000
struct FINTLFrameInfo
{ 
	FString                                            Path;                                                       // 0x0000   (0x0010)  
	FString                                            Md5;                                                        // 0x0010   (0x0010)  
	int32_t                                            Size;                                                       // 0x0020   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0024   (0x0004)  MISSED
};

static_assert(sizeof(UINTLGameNativeAPI) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FINTLUserData) == 0x00E8); // 232 bytes (0x000000 - 0x0000E8)
static_assert(sizeof(FINTLFrameInfo) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(offsetof(FINTLUserData, ChannelID) == 0x0008);
static_assert(offsetof(FINTLUserData, Openid) == 0x0018);
static_assert(offsetof(FINTLUserData, Token) == 0x0028);
static_assert(offsetof(FINTLUserData, RoleId) == 0x0038);
static_assert(offsetof(FINTLUserData, Region) == 0x0048);
static_assert(offsetof(FINTLUserData, LangType) == 0x0068);
static_assert(offsetof(FINTLUserData, DefLangType) == 0x0078);
static_assert(offsetof(FINTLUserData, RoleName) == 0x0088);
static_assert(offsetof(FINTLUserData, PayToken) == 0x0098);
static_assert(offsetof(FINTLUserData, HeadUrl) == 0x00A8);
static_assert(offsetof(FINTLUserData, PlayerLevel) == 0x00B8);
static_assert(offsetof(FINTLUserData, AppVersion) == 0x00C8);
static_assert(offsetof(FINTLUserData, extraJson) == 0x00D8);
static_assert(offsetof(FINTLFrameInfo, Path) == 0x0000);
static_assert(offsetof(FINTLFrameInfo, Md5) == 0x0010);
