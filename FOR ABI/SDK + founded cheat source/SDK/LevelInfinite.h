
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: INTLCore
/// dependency: SlateCore
/// dependency: UMG

/// Enum /Script/LevelInfinite.ELIEventType
/// Size: 0x01 (1 bytes)
enum class ELIEventType : uint8_t
{
	ELIEventType__DEFAULT                                                            = 0,
	ELIEventType__INTL_REPEAT                                                        = 1,
	ELIEventType__GN_DISABLED                                                        = 2,
	ELIEventType__GN_READY                                                           = 3,
	ELIEventType__LOGIN_PANEL_OPEN                                                   = 4,
	ELIEventType__LOGIN_PANEL_CLOSE                                                  = 5,
	ELIEventType__ACCOUNT_CENTER_OPEN                                                = 6,
	ELIEventType__ACCOUNT_CENTER_CLOSE                                               = 7,
	ELIEventType__SET_PROVISION                                                      = 8,
	ELIEventType__COMPLIANCE_AGE_SUCESS                                              = 9,
	ELIEventType__COMPLIANCE_MINOR_SUCESS                                            = 10
};

/// Class /Script/LevelInfinite.LevelInfiniteAPI
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class ULevelInfiniteAPI : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/LevelInfinite.LevelInfiniteAPI.UpdateCountryList
	// void UpdateCountryList(TArray<FString>& allowList, TArray<FString>& blockList);                                          // [0x1841f10] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/LevelInfinite.LevelInfiniteAPI.SetUserData
	// void SetUserData(FLIUserData& UserData);                                                                                 // [0x1841d80] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/LevelInfinite.LevelInfiniteAPI.SetUIRoot
	// void SetUIRoot(class UCanvasPanel* uiRoot);                                                                              // [0x1841d00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/LevelInfinite.LevelInfiniteAPI.SetLanguage
	// void SetLanguage(FString Language);                                                                                      // [0x18417e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/LevelInfinite.LevelInfiniteAPI.OpenLoginPanel
	// void OpenLoginPanel();                                                                                                   // [0x18413e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/LevelInfinite.LevelInfiniteAPI.OpenAccountCenter
	// void OpenAccountCenter();                                                                                                // [0x18413c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/LevelInfinite.LevelInfiniteAPI.OnBackPressed
	// bool OnBackPressed();                                                                                                    // [0x1841260] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/LevelInfinite.LevelInfiniteAPI.LoginChannelWithLIPASS
	// void LoginChannelWithLIPASS(EINTLLoginChannel Channel, FString Permissions, FString extraJson);                          // [0x1841120] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/LevelInfinite.LevelInfiniteAPI.InitLI
	// int32_t InitLI(class UGameInstance* Instance, bool isTest, FString AppVersion, FString LangType);                        // [0x1840f90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/LevelInfinite.LevelInfiniteAPI.Init
	// int32_t Init(class UGameInstance* Instance, FString Host, FLIUserData& UserData, bool isTest);                           // [0x1840d10] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/LevelInfinite.LevelInfiniteAPI.FocusLIPassUI
	// bool FocusLIPassUI();                                                                                                    // [0x1840c50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/LevelInfinite.LevelInfiniteAPI.CloseLI
	// void CloseLI();                                                                                                          // [0x1840c30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/LevelInfinite.LevelInfiniteAPI.ClearGameNativeDirectory
	// bool ClearGameNativeDirectory();                                                                                         // [0x1840c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/LevelInfinite.LevelInfiniteAPI.AutoLogin
	// void AutoLogin();                                                                                                        // [0x1840be0] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/LevelInfinite.LIHyperLinkTextBlockDecorator
/// Size: 0x0538 (1336 bytes) (0x000028 - 0x000560) align 8 pad: 0x0000
class ULIHyperLinkTextBlockDecorator : public URichTextBlockDecorator
{ 
public:
	FHyperlinkStyle                                    m_Style;                                                    // 0x0028   (0x0538)  


	/// Functions
	// Function /Script/LevelInfinite.LIHyperLinkTextBlockDecorator.OnHyperLinkClick
	// void OnHyperLinkClick(TMap<FString, FString>& MetaData);                                                                 // [0x1841290] Native|Event|Public|HasOutParms|BlueprintEvent 
};

/// Class /Script/LevelInfinite.LIPanelBase
/// Size: 0x0070 (112 bytes) (0x000288 - 0x0002F8) align 8 pad: 0x0000
class ULIPanelBase : public UUserWidget
{ 
public:
	SDK_UNDEFINED(16,2729) /* FDelegateProperty */     __um(OnTickDelegate);                                       // 0x0288   (0x0010)  
	SDK_UNDEFINED(16,2730) /* FDelegateProperty */     __um(OnKeyDownDelegate);                                    // 0x0298   (0x0010)  
	SDK_UNDEFINED(16,2731) /* FDelegateProperty */     __um(OnKeyUpDelegate);                                      // 0x02A8   (0x0010)  
	SDK_UNDEFINED(16,2732) /* FDelegateProperty */     __um(OnAddedToFocusPathDelegate);                           // 0x02B8   (0x0010)  
	SDK_UNDEFINED(16,2733) /* FDelegateProperty */     __um(OnRemovedFromFocusPathDelegate);                       // 0x02C8   (0x0010)  
	SDK_UNDEFINED(16,2734) /* FDelegateProperty */     __um(OnAnimationStartedDelegate);                           // 0x02D8   (0x0010)  
	SDK_UNDEFINED(16,2735) /* FDelegateProperty */     __um(OnAnimationFinishedDelegate);                          // 0x02E8   (0x0010)  


	/// Functions
	// Function /Script/LevelInfinite.LIPanelBase.SetLIUIFocus
	// void SetLIUIFocus(class UWidget* InWidgetToFocus);                                                                       // [0x1841750] Final|Native|Public|BlueprintCallable 
	// Function /Script/LevelInfinite.LIPanelBase.LITickEvent__DelegateSignature
	// void LITickEvent__DelegateSignature(FGeometry& MyGeometry, float InDeltaTime);                                           // [0x3a75280] Public|Delegate|HasOutParms 
	// Function /Script/LevelInfinite.LIPanelBase.LIKeyActionEvent__DelegateSignature
	// bool LIKeyActionEvent__DelegateSignature(FGeometry& InGeometry, FString InKeyName);                                      // [0x3a75280] Public|Delegate|HasOutParms 
	// Function /Script/LevelInfinite.LIPanelBase.LIFocusActionEvent__DelegateSignature
	// void LIFocusActionEvent__DelegateSignature(FFocusEvent& InFocusEvent);                                                   // [0x3a75280] Public|Delegate|HasOutParms 
	// Function /Script/LevelInfinite.LIPanelBase.LIAnimationEvent__DelegateSignature
	// void LIAnimationEvent__DelegateSignature(class UWidgetAnimation* Animation);                                             // [0x3a75280] Public|Delegate      
};

/// Class /Script/LevelInfinite.LISubSystem
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class ULISubSystem : public UObject
{ 
public:
};

/// Class /Script/LevelInfinite.RadarChartWidget
/// Size: 0x0078 (120 bytes) (0x000128 - 0x0001A0) align 8 pad: 0x0000
class URadarChartWidget : public UWidget
{ 
public:
	FVector2D                                          Offset;                                                     // 0x0128   (0x0008)  
	float                                              Rotation;                                                   // 0x0130   (0x0004)  
	float                                              Radius;                                                     // 0x0134   (0x0004)  
	char                                               Segmentation;                                               // 0x0138   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0139   (0x0003)  MISSED
	float                                              SegmentationThickness;                                      // 0x013C   (0x0004)  
	FColor                                             SegmentationColor;                                          // 0x0140   (0x0004)  
	float                                              PlateOutlineThickness;                                      // 0x0144   (0x0004)  
	FColor                                             PlateOutlineColor;                                          // 0x0148   (0x0004)  
	FColor                                             PlateColor;                                                 // 0x014C   (0x0004)  
	FColor                                             ChartColor;                                                 // 0x0150   (0x0004)  
	FColor                                             ChartOutlineColor;                                          // 0x0154   (0x0004)  
	float                                              ChartOutlineThickness;                                      // 0x0158   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x015C   (0x0004)  MISSED
	TArray<float>                                      ChartValues;                                                // 0x0160   (0x0010)  
	SDK_UNDEFINED(16,2736) /* FDelegateProperty */     __um(RadiusDelegate);                                       // 0x0170   (0x0010)  
	SDK_UNDEFINED(16,2737) /* FDelegateProperty */     __um(SegmentationDelegate);                                 // 0x0180   (0x0010)  
	unsigned char                                      UnknownData02_7[0x10];                                      // 0x0190   (0x0010)  MISSED


	/// Functions
	// Function /Script/LevelInfinite.RadarChartWidget.SetSegmentationThickness
	// void SetSegmentationThickness(float InThickness);                                                                        // [0x1841c80] Final|Native|Public|BlueprintCallable 
	// Function /Script/LevelInfinite.RadarChartWidget.SetSegmentationColor
	// void SetSegmentationColor(FColor InColor);                                                                               // [0x1841c00] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/LevelInfinite.RadarChartWidget.SetSegmentation
	// void SetSegmentation(char InSegmentation);                                                                               // [0x1841b80] Final|Native|Public|BlueprintCallable 
	// Function /Script/LevelInfinite.RadarChartWidget.SetRotation
	// void SetRotation(float InRotation);                                                                                      // [0x1841b00] Final|Native|Public|BlueprintCallable 
	// Function /Script/LevelInfinite.RadarChartWidget.SetRadius
	// void SetRadius(float InRadius);                                                                                          // [0x1841a80] Final|Native|Public|BlueprintCallable 
	// Function /Script/LevelInfinite.RadarChartWidget.SetPlateOutlineThickness
	// void SetPlateOutlineThickness(float InThickness);                                                                        // [0x1841a00] Final|Native|Public|BlueprintCallable 
	// Function /Script/LevelInfinite.RadarChartWidget.SetPlateOutlineColor
	// void SetPlateOutlineColor(FColor InColor);                                                                               // [0x1841980] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/LevelInfinite.RadarChartWidget.SetPlateColor
	// void SetPlateColor(FColor InColor);                                                                                      // [0x1841900] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/LevelInfinite.RadarChartWidget.SetOffset
	// void SetOffset(FVector2D InOffset);                                                                                      // [0x1841880] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/LevelInfinite.RadarChartWidget.SetChartValues
	// void SetChartValues(TArray<float> InValues);                                                                             // [0x1841650] Final|Native|Public|BlueprintCallable 
	// Function /Script/LevelInfinite.RadarChartWidget.SetChartValue
	// void SetChartValue(char Index, float InValue);                                                                           // [0x1841580] Final|Native|Public|BlueprintCallable 
	// Function /Script/LevelInfinite.RadarChartWidget.SetChartOutlineThickness
	// void SetChartOutlineThickness(float InThickness);                                                                        // [0x1841500] Final|Native|Public|BlueprintCallable 
	// Function /Script/LevelInfinite.RadarChartWidget.SetChartOutlineColor
	// void SetChartOutlineColor(FColor InColor);                                                                               // [0x1841480] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/LevelInfinite.RadarChartWidget.SetChartColor
	// void SetChartColor(FColor InColor);                                                                                      // [0x1841400] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/LevelInfinite.RadarChartWidget.GetUInt8__DelegateSignature
	// char GetUInt8__DelegateSignature();                                                                                      // [0x3a75280] Public|Delegate      
	// Function /Script/LevelInfinite.RadarChartWidget.GetChartValue
	// float GetChartValue(char Index);                                                                                         // [0x1840c80] Final|Native|Public|BlueprintCallable 
};

/// Struct /Script/LevelInfinite.LIUserData
/// Size: 0x00B0 (176 bytes) (0x000000 - 0x0000B0) align 8 pad: 0x0000
struct FLIUserData
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
	FString                                            LangType;                                                   // 0x0060   (0x0010)  
	FString                                            DefLangType;                                                // 0x0070   (0x0010)  
	FString                                            RoleName;                                                   // 0x0080   (0x0010)  
	FString                                            AppVersion;                                                 // 0x0090   (0x0010)  
	FString                                            extraJson;                                                  // 0x00A0   (0x0010)  
};

/// Struct /Script/LevelInfinite.LIBaseEvent
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FLIBaseEvent
{ 
	ELIEventType                                       EventType;                                                  // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0001   (0x0007)  MISSED
	FString                                            extraJson;                                                  // 0x0008   (0x0010)  
};

/// Struct /Script/LevelInfinite.GNPanelReadyEventExtraParam
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FGNPanelReadyEventExtraParam
{ 
	FString                                            asset_version;                                              // 0x0000   (0x0010)  
	bool                                               is_cdn_asset;                                               // 0x0010   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0011   (0x0007)  MISSED
};

/// Struct /Script/LevelInfinite.GNPanelReadyEventParam
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 8 pad: 0x0000
struct FGNPanelReadyEventParam
{ 
	FString                                            Module;                                                     // 0x0000   (0x0010)  
	bool                                               isPopPanel;                                                 // 0x0010   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0011   (0x0007)  MISSED
	FGNPanelReadyEventExtraParam                       ExtraParams;                                                // 0x0018   (0x0018)  
};

static_assert(sizeof(ULevelInfiniteAPI) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(ULIHyperLinkTextBlockDecorator) == 0x0560); // 1376 bytes (0x000028 - 0x000560)
static_assert(sizeof(ULIPanelBase) == 0x02F8); // 760 bytes (0x000288 - 0x0002F8)
static_assert(sizeof(ULISubSystem) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(URadarChartWidget) == 0x01A0); // 416 bytes (0x000128 - 0x0001A0)
static_assert(sizeof(FLIUserData) == 0x00B0); // 176 bytes (0x000000 - 0x0000B0)
static_assert(sizeof(FLIBaseEvent) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FGNPanelReadyEventExtraParam) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FGNPanelReadyEventParam) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(offsetof(ULIHyperLinkTextBlockDecorator, m_Style) == 0x0028);
static_assert(offsetof(URadarChartWidget, Offset) == 0x0128);
static_assert(offsetof(URadarChartWidget, SegmentationColor) == 0x0140);
static_assert(offsetof(URadarChartWidget, PlateOutlineColor) == 0x0148);
static_assert(offsetof(URadarChartWidget, PlateColor) == 0x014C);
static_assert(offsetof(URadarChartWidget, ChartColor) == 0x0150);
static_assert(offsetof(URadarChartWidget, ChartOutlineColor) == 0x0154);
static_assert(offsetof(URadarChartWidget, ChartValues) == 0x0160);
static_assert(offsetof(FLIUserData, ChannelID) == 0x0008);
static_assert(offsetof(FLIUserData, Openid) == 0x0018);
static_assert(offsetof(FLIUserData, Token) == 0x0028);
static_assert(offsetof(FLIUserData, RoleId) == 0x0038);
static_assert(offsetof(FLIUserData, Region) == 0x0048);
static_assert(offsetof(FLIUserData, LangType) == 0x0060);
static_assert(offsetof(FLIUserData, DefLangType) == 0x0070);
static_assert(offsetof(FLIUserData, RoleName) == 0x0080);
static_assert(offsetof(FLIUserData, AppVersion) == 0x0090);
static_assert(offsetof(FLIUserData, extraJson) == 0x00A0);
static_assert(offsetof(FLIBaseEvent, EventType) == 0x0000);
static_assert(offsetof(FLIBaseEvent, extraJson) == 0x0008);
static_assert(offsetof(FGNPanelReadyEventExtraParam, asset_version) == 0x0000);
static_assert(offsetof(FGNPanelReadyEventParam, Module) == 0x0000);
static_assert(offsetof(FGNPanelReadyEventParam, ExtraParams) == 0x0018);
