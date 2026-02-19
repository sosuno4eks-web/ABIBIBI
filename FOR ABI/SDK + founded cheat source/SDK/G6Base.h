
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Class /Script/G6Base.G6TickableGameObject
/// Size: 0x0008 (8 bytes) (0x000028 - 0x000030) align 8 pad: 0x0000
class UG6TickableGameObject : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0028   (0x0008)  MISSED
};

/// Class /Script/G6Base.AssetStreamingMgr
/// Size: 0x0150 (336 bytes) (0x000030 - 0x000180) align 8 pad: 0x0000
class UAssetStreamingMgr : public UG6TickableGameObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x150];                                     // 0x0030   (0x0150)  MISSED
};

/// Class /Script/G6Base.DebugConsole
/// Size: 0x0440 (1088 bytes) (0x000028 - 0x000468) align 8 pad: 0x0000
class UDebugConsole : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x10];                                      // 0x0028   (0x0010)  MISSED
	SDK_UNDEFINED(16,503) /* FMulticastInlineDelegate */ __um(OnCustomConsoleCommandCommit);                       // 0x0038   (0x0010)  
	SDK_UNDEFINED(16,504) /* FMulticastInlineDelegate */ __um(OnErrorMessageReceived);                             // 0x0048   (0x0010)  
	SDK_UNDEFINED(16,505) /* FMulticastInlineDelegate */ __um(OnNewMessageReceived);                               // 0x0058   (0x0010)  
	unsigned char                                      UnknownData01_7[0x400];                                     // 0x0068   (0x0400)  MISSED


	/// Functions
	// Function /Script/G6Base.DebugConsole.UnregisterCustomConsoleCommandInfo
	// void UnregisterCustomConsoleCommandInfo(TArray<FString>& InCustomCommandList);                                           // [0x2e5d4b0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/G6Base.DebugConsole.SetNonFilterMessagesUIDRange
	// void SetNonFilterMessagesUIDRange(int32_t InStartId, int32_t InEndId);                                                   // [0x2e5d300] Final|Native|Public|BlueprintCallable 
	// Function /Script/G6Base.DebugConsole.SetMaxMessagesCount
	// void SetMaxMessagesCount(int32_t InMaxCount);                                                                            // [0x2e5d270] Final|Native|Public|BlueprintCallable 
	// Function /Script/G6Base.DebugConsole.SetLogLevel
	// void SetLogLevel(char LogLevel);                                                                                         // [0x2e5d1f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/G6Base.DebugConsole.SetLogFilterText
	// void SetLogFilterText(FText& InFilterText);                                                                              // [0x2e5d120] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/G6Base.DebugConsole.SetLogDisplayCategory
	// void SetLogDisplayCategory(FName& CategoryName);                                                                         // [0x2e5d090] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/G6Base.DebugConsole.ResetMessageFilter
	// void ResetMessageFilter();                                                                                               // [0x2e5d070] Final|Native|Public|BlueprintCallable 
	// Function /Script/G6Base.DebugConsole.RegisterCustomConsoleCommandInfo
	// void RegisterCustomConsoleCommandInfo(TArray<FString>& InCustomCommandList);                                             // [0x2e5cfa0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/G6Base.DebugConsole.OnNewMessageReceivedEvent__DelegateSignature
	// void OnNewMessageReceivedEvent__DelegateSignature(FString MessageMarkupText);                                            // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/G6Base.DebugConsole.OnErrorMessageReceivedEvent__DelegateSignature
	// void OnErrorMessageReceivedEvent__DelegateSignature();                                                                   // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/G6Base.DebugConsole.OnCustomConsoleCommandCommittedEvent__DelegateSignature
	// void OnCustomConsoleCommandCommittedEvent__DelegateSignature(FString CommandName, FString ExtraArgs);                    // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/G6Base.DebugConsole.IsMessageFiltered
	// bool IsMessageFiltered(int32_t InMessageIndex);                                                                          // [0x2e5ca10] Final|Native|Public|BlueprintCallable 
	// Function /Script/G6Base.DebugConsole.GetMessageUID
	// int32_t GetMessageUID(int32_t InMessageIndex);                                                                           // [0x2e5c500] Final|Native|Public|BlueprintCallable 
	// Function /Script/G6Base.DebugConsole.GetMessageText
	// FString GetMessageText(int32_t InMessageIndex);                                                                          // [0x2e5c460] Final|Native|Public|BlueprintCallable 
	// Function /Script/G6Base.DebugConsole.GetCurrentMessagesCount
	// int32_t GetCurrentMessagesCount();                                                                                       // [0x18d1470] Final|Native|Public|BlueprintCallable 
	// Function /Script/G6Base.DebugConsole.GetConsoleInputHistory
	// void GetConsoleInputHistory(TArray<FString>& OutHistoryInputList);                                                       // [0x2e5c230] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/G6Base.DebugConsole.GetCommandAutoCompleteSuggestions
	// void GetCommandAutoCompleteSuggestions(FText& InInputText, TArray<FString>& OutAutoCompleteList);                        // [0x2e5c0c0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/G6Base.DebugConsole.GetAvailableLogCategories
	// TArray<FName> GetAvailableLogCategories();                                                                               // [0x2e5c030] Final|Native|Public|BlueprintCallable 
	// Function /Script/G6Base.DebugConsole.CommitConsoleCommand
	// void CommitConsoleCommand(FText& InText);                                                                                // [0x2e5bbe0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/G6Base.DebugConsole.ClearAllDisplayText
	// void ClearAllDisplayText();                                                                                              // [0x2e5bbc0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/G6Base.G6CustomScriptStatProfiler
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UG6CustomScriptStatProfiler : public UObject
{ 
public:


	/// Functions
	// Function /Script/G6Base.G6CustomScriptStatProfiler.UpdateStatProfilerData
	// void UpdateStatProfilerData();                                                                                           // [0xd906a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/G6Base.G6CustomScriptStatProfiler.StartScopeByIndex
	// void StartScopeByIndex(int32_t InStatIndex);                                                                             // [0x197ccf0] Final|Native|Public|BlueprintCallable 
	// Function /Script/G6Base.G6CustomScriptStatProfiler.StartScope
	// int32_t StartScope(FString InStatName);                                                                                  // [0x2e5d3d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/G6Base.G6CustomScriptStatProfiler.IsStatProfileEnabled
	// bool IsStatProfileEnabled();                                                                                             // [0x197bba0] Final|Native|Public|BlueprintCallable 
	// Function /Script/G6Base.G6CustomScriptStatProfiler.GetStatItemUniqueFullName
	// FString GetStatItemUniqueFullName(int32_t InStatItemIndex);                                                              // [0x2e5c810] Final|Native|Public|BlueprintCallable 
	// Function /Script/G6Base.G6CustomScriptStatProfiler.GetStatItemParentLevel
	// void GetStatItemParentLevel(int32_t InStatItemIndex, TArray<int32_t>& OutParentLevelItems);                              // [0x2e5c8f0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/G6Base.G6CustomScriptStatProfiler.GetStatItemParentIndex
	// int32_t GetStatItemParentIndex(int32_t InStatItemIndex);                                                                 // [0x198d890] Final|Native|Public|BlueprintCallable 
	// Function /Script/G6Base.G6CustomScriptStatProfiler.GetStatItemMaxChildCallDepth
	// int32_t GetStatItemMaxChildCallDepth(int32_t InStatItemIndex);                                                           // [0x198dda0] Final|Native|Public|BlueprintCallable 
	// Function /Script/G6Base.G6CustomScriptStatProfiler.GetStatItemDisplayName
	// FString GetStatItemDisplayName(int32_t InStatItemIndex);                                                                 // [0x2e5c810] Final|Native|Public|BlueprintCallable 
	// Function /Script/G6Base.G6CustomScriptStatProfiler.GetStatItemData
	// FString GetStatItemData(int32_t InStatItemIndex, TArray<float>& OutItemData);                                            // [0x2e5c6d0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/G6Base.G6CustomScriptStatProfiler.GetStatItemChildren
	// void GetStatItemChildren(int32_t InStatItemIndex, TArray<int32_t>& OutChildItems, bool bScriptOnly);                     // [0x2e5c5a0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/G6Base.G6CustomScriptStatProfiler.GetStatItemCallDepth
	// int32_t GetStatItemCallDepth(int32_t InStatItemIndex);                                                                   // [0x198dda0] Final|Native|Public|BlueprintCallable 
	// Function /Script/G6Base.G6CustomScriptStatProfiler.GetItemIndexByNameAndDepth
	// int32_t GetItemIndexByNameAndDepth(FString InName, int32_t InCallDepth, FString InFullUniqueName);                       // [0x2e5c300] Final|Native|Public|BlueprintCallable 
	// Function /Script/G6Base.G6CustomScriptStatProfiler.EndScope
	// void EndScope(FString InStatName);                                                                                       // [0x2e5bf80] Final|Native|Public|BlueprintCallable 
	// Function /Script/G6Base.G6CustomScriptStatProfiler.CreateScriptStat
	// int32_t CreateScriptStat(FString InStatName, FString InStatDesc);                                                        // [0x2e5bd60] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/G6Base.G6LogicStep
/// Size: 0x0008 (8 bytes) (0x000028 - 0x000030) align 8 pad: 0x0000
class UG6LogicStep : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0028   (0x0008)  MISSED


	/// Functions
	// Function /Script/G6Base.G6LogicStep.ShutDown
	// bool ShutDown();                                                                                                         // [0x2dbb8a0] Native|Public        
};

/// Class /Script/G6Base.G6LogicStep_SwitchLevel
/// Size: 0x0020 (32 bytes) (0x000030 - 0x000050) align 8 pad: 0x0000
class UG6LogicStep_SwitchLevel : public UG6LogicStep
{ 
public:
	unsigned char                                      UnknownData00_1[0x20];                                      // 0x0030   (0x0020)  MISSED
};

/// Class /Script/G6Base.G6LogicStepProcessor
/// Size: 0x0080 (128 bytes) (0x000028 - 0x0000A8) align 8 pad: 0x0000
class UG6LogicStepProcessor : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x10];                                      // 0x0028   (0x0010)  MISSED
	class UG6LogicStep*                                m_Cur_Running_LogicStep;                                    // 0x0038   (0x0008)  
	unsigned char                                      UnknownData01_7[0x68];                                      // 0x0040   (0x0068)  MISSED
};

/// Class /Script/G6Base.G6LuaUEUtil
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UG6LuaUEUtil : public UObject
{ 
public:


	/// Functions
	// Function /Script/G6Base.G6LuaUEUtil.TestEnsure
	// void TestEnsure();                                                                                                       // [0x1811c00] Final|Native|Static|Public 
	// Function /Script/G6Base.G6LuaUEUtil.TestCrash
	// void TestCrash();                                                                                                        // [0x2e5d490] Final|Native|Static|Public 
	// Function /Script/G6Base.G6LuaUEUtil.ParseCommandLineString
	// bool ParseCommandLineString(FString StrKey, FString& OutValue);                                                          // [0x2e5ce90] Final|Native|Static|Public|HasOutParms 
	// Function /Script/G6Base.G6LuaUEUtil.ParseCommandLineInt
	// bool ParseCommandLineInt(FString StrKey, int64_t& OutValue);                                                             // [0x2e5cda0] Final|Native|Static|Public|HasOutParms 
	// Function /Script/G6Base.G6LuaUEUtil.ParseCommandLineFloat
	// bool ParseCommandLineFloat(FString StrKey, float& OutValue);                                                             // [0x2e5cca0] Final|Native|Static|Public|HasOutParms 
	// Function /Script/G6Base.G6LuaUEUtil.ParseCommandLineBool
	// bool ParseCommandLineBool(FString StrKey, bool& OutValue);                                                               // [0x2e5cbb0] Final|Native|Static|Public|HasOutParms 
	// Function /Script/G6Base.G6LuaUEUtil.GetUnixTimeMillisecond
	// int64_t GetUnixTimeMillisecond();                                                                                        // [0x2e5c9e0] Final|Native|Static|Public 
};

/// Class /Script/G6Base.G6OnlineSession
/// Size: 0x0018 (24 bytes) (0x000028 - 0x000040) align 8 pad: 0x0000
class UG6OnlineSession : public UOnlineSession
{ 
public:
	unsigned char                                      UnknownData00_1[0x18];                                      // 0x0028   (0x0018)  MISSED
};

/// Class /Script/G6Base.G6PlatformGameInstance
/// Size: 0x0058 (88 bytes) (0x000028 - 0x000080) align 8 pad: 0x0000
class UG6PlatformGameInstance : public UObject
{ 
public:
	class UDebugConsole*                               DebugConsole;                                               // 0x0028   (0x0008)  
	class UG6CustomScriptStatProfiler*                 Profiler;                                                   // 0x0030   (0x0008)  
	unsigned char                                      UnknownData00_6[0x18];                                      // 0x0038   (0x0018)  MISSED
	bool                                               bUseG6OnlineSession;                                        // 0x0050   (0x0001)  
	unsigned char                                      UnknownData01_6[0x1F];                                      // 0x0051   (0x001F)  MISSED
	class UG6LogicStepProcessor*                       LogicStepProcessor;                                         // 0x0070   (0x0008)  
	unsigned char                                      UnknownData02_7[0x8];                                       // 0x0078   (0x0008)  MISSED


	/// Functions
	// Function /Script/G6Base.G6PlatformGameInstance.Lua
	// void Lua(FString strLua);                                                                                                // [0x2e5cab0] Final|Exec|Native|Public 
	// Function /Script/G6Base.G6PlatformGameInstance.DAWLua
	// void DAWLua(FString strLua);                                                                                             // [0x2e5be80] Final|Exec|Native|Public 
	// Function /Script/G6Base.G6PlatformGameInstance.ConsoleCMD
	// void ConsoleCMD(FString& Cmd);                                                                                           // [0x2e5bcb0] Final|Exec|Native|Public|HasOutParms 
};

/// Class /Script/G6Base.G6PlatformGameInstanceManager
/// Size: 0x00B8 (184 bytes) (0x000028 - 0x0000E0) align 8 pad: 0x0000
class UG6PlatformGameInstanceManager : public UObject
{ 
public:
	SDK_UNDEFINED(80,506) /* TMap<int32_t, UG6PlatformGameInstance*> */ __um(mContainer);                          // 0x0028   (0x0050)  
	unsigned char                                      UnknownData00_7[0x68];                                      // 0x0078   (0x0068)  MISSED
};

static_assert(sizeof(UG6TickableGameObject) == 0x0030); // 48 bytes (0x000028 - 0x000030)
static_assert(sizeof(UAssetStreamingMgr) == 0x0180); // 384 bytes (0x000030 - 0x000180)
static_assert(sizeof(UDebugConsole) == 0x0468); // 1128 bytes (0x000028 - 0x000468)
static_assert(sizeof(UG6CustomScriptStatProfiler) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UG6LogicStep) == 0x0030); // 48 bytes (0x000028 - 0x000030)
static_assert(sizeof(UG6LogicStep_SwitchLevel) == 0x0050); // 80 bytes (0x000030 - 0x000050)
static_assert(sizeof(UG6LogicStepProcessor) == 0x00A8); // 168 bytes (0x000028 - 0x0000A8)
static_assert(sizeof(UG6LuaUEUtil) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UG6OnlineSession) == 0x0040); // 64 bytes (0x000028 - 0x000040)
static_assert(sizeof(UG6PlatformGameInstance) == 0x0080); // 128 bytes (0x000028 - 0x000080)
static_assert(sizeof(UG6PlatformGameInstanceManager) == 0x00E0); // 224 bytes (0x000028 - 0x0000E0)
static_assert(offsetof(UG6LogicStepProcessor, m_Cur_Running_LogicStep) == 0x0038);
static_assert(offsetof(UG6PlatformGameInstance, DebugConsole) == 0x0028);
static_assert(offsetof(UG6PlatformGameInstance, Profiler) == 0x0030);
static_assert(offsetof(UG6PlatformGameInstance, LogicStepProcessor) == 0x0070);
