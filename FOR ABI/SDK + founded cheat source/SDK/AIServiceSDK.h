
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: AIModule
/// dependency: CoreUObject
/// dependency: DeveloperSettings
/// dependency: Engine

/// Enum /Script/AIServiceSDK.EMFAIRLMode
/// Size: 0x01 (1 bytes)
enum class EMFAIRLMode : uint8_t
{
	EMFAIRLMode__DisableRL                                                           = 0,
	EMFAIRLMode__Training                                                            = 1,
	EMFAIRLMode__Inference                                                           = 2
};

/// Class /Script/AIServiceSDK.AIRLAgentComponent
/// Size: 0x0090 (144 bytes) (0x0000F8 - 0x000188) align 8 pad: 0x0000
class UAIRLAgentComponent : public UActorComponent
{ 
public:
	bool                                               bAuto;                                                      // 0x00F8   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x00F9   (0x0003)  MISSED
	int32_t                                            EpisodeID;                                                  // 0x00FC   (0x0004)  
	int32_t                                            AIType;                                                     // 0x0100   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0104   (0x0004)  MISSED
	class UAIRLSettings*                               Settings;                                                   // 0x0108   (0x0008)  
	int32_t                                            AgentID;                                                    // 0x0110   (0x0004)  
	unsigned char                                      UnknownData02_6[0x6C];                                      // 0x0114   (0x006C)  MISSED
	int32_t                                            ActionDataLenDefault;                                       // 0x0180   (0x0004)  
	unsigned char                                      UnknownData03_7[0x4];                                       // 0x0184   (0x0004)  MISSED


	/// Functions
	// Function /Script/AIServiceSDK.AIRLAgentComponent.TrySendState
	// bool TrySendState();                                                                                                     // [0x1706470] Final|Native|Public|BlueprintCallable 
	// Function /Script/AIServiceSDK.AIRLAgentComponent.TryGetAction
	// bool TryGetAction();                                                                                                     // [0x1706440] Final|Native|Public|BlueprintCallable 
	// Function /Script/AIServiceSDK.AIRLAgentComponent.Inference
	// bool Inference();                                                                                                        // [0x1706300] Final|Native|Public|BlueprintCallable 
	// Function /Script/AIServiceSDK.AIRLAgentComponent.DestroyAgent
	// int32_t DestroyAgent();                                                                                                  // [0x17060c0] Native|Public|BlueprintCallable 
	// Function /Script/AIServiceSDK.AIRLAgentComponent.CreateAgent
	// int32_t CreateAgent();                                                                                                   // [0x1706060] Native|Public|BlueprintCallable 
	// Function /Script/AIServiceSDK.AIRLAgentComponent.BP_MakeState
	// bool BP_MakeState();                                                                                                     // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/AIServiceSDK.AIRLAgentComponent.BP_InitEpisodeID
	// void BP_InitEpisodeID(int32_t& OutID);                                                                                   // [0x3a75280] Event|Public|HasOutParms|BlueprintEvent 
};

/// Class /Script/AIServiceSDK.AIRLEpisodeComponent
/// Size: 0x0018 (24 bytes) (0x0000F8 - 0x000110) align 8 pad: 0x0000
class UAIRLEpisodeComponent : public UActorComponent
{ 
public:
	bool                                               bAuto;                                                      // 0x00F8   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x00F9   (0x0003)  MISSED
	int32_t                                            EpisodeID;                                                  // 0x00FC   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0100   (0x0004)  MISSED
	int32_t                                            EpisodeStartDataLen;                                        // 0x0104   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x0108   (0x0004)  MISSED
	int32_t                                            EpisodeEndDataLen;                                          // 0x010C   (0x0004)  


	/// Functions
	// Function /Script/AIServiceSDK.AIRLEpisodeComponent.GetEpisodeID
	// int32_t GetEpisodeID();                                                                                                  // [0x1706150] Final|Native|Public|BlueprintCallable 
	// Function /Script/AIServiceSDK.AIRLEpisodeComponent.DestroyEpisode
	// int32_t DestroyEpisode();                                                                                                // [0x1706060] Native|Public|BlueprintCallable 
	// Function /Script/AIServiceSDK.AIRLEpisodeComponent.CreateEpisode
	// int32_t CreateEpisode();                                                                                                 // [0x1706090] Native|Public|BlueprintCallable 
};

/// Class /Script/AIServiceSDK.AIRLManager
/// Size: 0x0018 (24 bytes) (0x0002E0 - 0x0002F8) align 8 pad: 0x0000
class AAIRLManager : public AActor
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x02E0   (0x0008)  MISSED
	int32_t                                            InitDataLength;                                             // 0x02E8   (0x0004)  
	unsigned char                                      UnknownData01_7[0xC];                                       // 0x02EC   (0x000C)  MISSED
};

/// Class /Script/AIServiceSDK.AIRLSettings
/// Size: 0x00F8 (248 bytes) (0x000038 - 0x000130) align 8 pad: 0x0000
class UAIRLSettings : public UDeveloperSettings
{ 
public:
	FString                                            ClientVersion;                                              // 0x0038   (0x0010)  
	FString                                            RouterIP;                                                   // 0x0048   (0x0010)  
	int32_t                                            RouterPort;                                                 // 0x0058   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x005C   (0x0004)  MISSED
	FString                                            BussName;                                                   // 0x0060   (0x0010)  
	float                                              UpdateIntervalSeconds;                                      // 0x0070   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0074   (0x0004)  MISSED
	FSoftObjectPath                                    SubLevelForTraining;                                        // 0x0078   (0x0018)  
	SDK_UNDEFINED(80,391) /* TMap<FMapRule, TEnumAsByte<EMFAIRLMode>> */ __um(LevelAssetToRLMode);                 // 0x0090   (0x0050)  
	unsigned char                                      UnknownData02_7[0x50];                                      // 0x00E0   (0x0050)  MISSED
};

/// Class /Script/AIServiceSDK.AIRLSubsystem
/// Size: 0x0030 (48 bytes) (0x000030 - 0x000060) align 8 pad: 0x0000
class UAIRLSubsystem : public UGameInstanceSubsystem
{ 
public:
	unsigned char                                      UnknownData00_3[0x18];                                      // 0x0030   (0x0018)  MISSED
	class AAIRLManager*                                CachedAIRLManager;                                          // 0x0048   (0x0008)  
	unsigned char                                      UnknownData01_7[0x10];                                      // 0x0050   (0x0010)  MISSED


	/// Functions
	// Function /Script/AIServiceSDK.AIRLSubsystem.UnRegisterAIRLManager
	// void UnRegisterAIRLManager();                                                                                            // [0x17064a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/AIServiceSDK.AIRLSubsystem.SetCachedRLMode
	// void SetCachedRLMode(TEnumAsByte<EMFAIRLMode> TragetRLMode);                                                             // [0x17063c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/AIServiceSDK.AIRLSubsystem.RegisterAIRLManager
	// void RegisterAIRLManager(class AAIRLManager* InAIRLManager);                                                             // [0x1706330] Final|Native|Public|BlueprintCallable 
	// Function /Script/AIServiceSDK.AIRLSubsystem.GetSubLevelForTraining
	// FSoftObjectPath GetSubLevelForTraining();                                                                                // [0x1706270] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/AIServiceSDK.AIRLSubsystem.GetRLModeOfLevel
	// TEnumAsByte<EMFAIRLMode> GetRLModeOfLevel(FString InLevelName, int32_t RuleID);                                          // [0x1706180] Final|Native|Public|BlueprintCallable 
	// Function /Script/AIServiceSDK.AIRLSubsystem.GetCachedRLMode
	// TEnumAsByte<EMFAIRLMode> GetCachedRLMode();                                                                              // [0x1706120] Final|Native|Public|BlueprintCallable 
	// Function /Script/AIServiceSDK.AIRLSubsystem.GetAIRLManager
	// class AAIRLManager* GetAIRLManager();                                                                                    // [0x17060f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/AIServiceSDK.AIRLSubsystem.CheckRLModeOfLevel
	// bool CheckRLModeOfLevel(FString InLevelName, int32_t RuleID, TEnumAsByte<EMFAIRLMode> TragetRLMode);                     // [0x1705f40] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/AIServiceSDK.BTDecorator_AIRLMode
/// Size: 0x0020 (32 bytes) (0x000068 - 0x000088) align 8 pad: 0x0000
class UBTDecorator_AIRLMode : public UBTDecorator
{ 
public:
	bool                                               IsAIRLEnabled;                                              // 0x0068   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0069   (0x0007)  MISSED
	class UBehaviorTreeComponent*                      CachedBTComp;                                               // 0x0070   (0x0008)  
	unsigned char                                      UnknownData01_7[0x10];                                      // 0x0078   (0x0010)  MISSED
};

/// Struct /Script/AIServiceSDK.MapRule
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 8 pad: 0x0000
struct FMapRule
{ 
	FSoftObjectPath                                    MapPath;                                                    // 0x0000   (0x0018)  
	TArray<int32_t>                                    RuleIDs;                                                    // 0x0018   (0x0010)  
};

static_assert(sizeof(UAIRLAgentComponent) == 0x0188); // 392 bytes (0x0000F8 - 0x000188)
static_assert(sizeof(UAIRLEpisodeComponent) == 0x0110); // 272 bytes (0x0000F8 - 0x000110)
static_assert(sizeof(AAIRLManager) == 0x02F8); // 760 bytes (0x0002E0 - 0x0002F8)
static_assert(sizeof(UAIRLSettings) == 0x0130); // 304 bytes (0x000038 - 0x000130)
static_assert(sizeof(UAIRLSubsystem) == 0x0060); // 96 bytes (0x000030 - 0x000060)
static_assert(sizeof(UBTDecorator_AIRLMode) == 0x0088); // 136 bytes (0x000068 - 0x000088)
static_assert(sizeof(FMapRule) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(offsetof(UAIRLAgentComponent, Settings) == 0x0108);
static_assert(offsetof(UAIRLSettings, ClientVersion) == 0x0038);
static_assert(offsetof(UAIRLSettings, RouterIP) == 0x0048);
static_assert(offsetof(UAIRLSettings, BussName) == 0x0060);
static_assert(offsetof(UAIRLSettings, SubLevelForTraining) == 0x0078);
static_assert(offsetof(UAIRLSubsystem, CachedAIRLManager) == 0x0048);
static_assert(offsetof(UBTDecorator_AIRLMode, CachedBTComp) == 0x0070);
static_assert(offsetof(FMapRule, MapPath) == 0x0000);
static_assert(offsetof(FMapRule, RuleIDs) == 0x0018);
