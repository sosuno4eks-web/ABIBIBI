
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: MFPluginWrapper
/// dependency: SGFramework
/// dependency: UAGame

/// Class /Game/Startup/GameBase/BPC_GAS_GlobalComponent.BPC_GAS_GlobalComponent_C
/// Size: 0x0000 (0 bytes) (0x000080 - 0x000080) align 8 pad: 0x0000
class UBPC_GAS_GlobalComponent_C : public USGGIGASGlobalComponent
{ 
public:
};

/// Class /Game/Startup/GameBase/BPC_GameinstanceWeakNetworkComponent.BPC_GameInstanceWeakNetworkComponent_C
/// Size: 0x0000 (0 bytes) (0x0000B0 - 0x0000B0) align 8 pad: 0x0000
class UBPC_GameInstanceWeakNetworkComponent_C : public USGGameInstanceWeakNetworkComponent
{ 
public:
};

/// Class /Game/Startup/GameBase/BPC_GameInstancePluginManagerComponent.BPC_GameInstancePluginManagerComponent_C
/// Size: 0x0000 (0 bytes) (0x000068 - 0x000068) align 8 pad: 0x0000
class UBPC_GameInstancePluginManagerComponent_C : public USGGameInstancePluginManagerComponent
{ 
public:
};

/// Class /Game/Startup/GameBase/BPC_GameInstanceGameInfoComponent.BPC_GameInstanceGameInfoComponent_C
/// Size: 0x0000 (0 bytes) (0x000060 - 0x000060) align 8 pad: 0x0000
class UBPC_GameInstanceGameInfoComponent_C : public UUAGameInstanceGameInfoComponent
{ 
public:
};

/// Class /Game/Startup/GameBase/BPC_GameInstanceG6PlatformComponent.BPC_GameInstanceG6PlatformComponent_C
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UBPC_GameInstanceG6PlatformComponent_C : public USGGameInstanceG6PlatformComponent
{ 
public:
};

/// Class /Game/Startup/GameBase/BP_GameInstance.BP_GameInstance_C
/// Size: 0x0010 (16 bytes) (0x0002F0 - 0x000300) align 8 pad: 0x0000
class UBP_GameInstance_C : public USGGameInstance
{ 
public:
	SDK_UNDEFINED(16,2794) /* FMulticastInlineDelegate */ __um(OnAndroidBackPressed);                              // 0x02F0   (0x0010)  


	/// Functions
	// Function /Game/Startup/GameBase/BP_GameInstance.BP_GameInstance_C.OnAndroidBackPressed__DelegateSignature
	// void OnAndroidBackPressed__DelegateSignature();                                                                          // [0x3a75280] Public|Delegate|BlueprintCallable|BlueprintEvent 
};

/// Class /Game/Startup/GameBase/BP_GameInstance_HD.BP_GameInstance_HD_C
/// Size: 0x0000 (0 bytes) (0x000300 - 0x000300) align 8 pad: 0x0000
class UBP_GameInstance_HD_C : public UBP_GameInstance_C
{ 
public:
};

/// Class /Game/Startup/Launcher/Blueprints/BP_GCloudDolphin.BP_GCloudDolphin_C
/// Size: 0x0000 (0 bytes) (0x0000A0 - 0x0000A0) align 8 pad: 0x0000
class UBP_GCloudDolphin_C : public UMFGCloudDolphinService
{ 
public:


	/// Functions
	// Function /Game/Startup/Launcher/Blueprints/BP_GCloudDolphin.BP_GCloudDolphin_C.GetModuleName
	// FString GetModuleName();                                                                                                 // [0x3a75280] Event|Public|HasOutParms|BlueprintCallable|BlueprintEvent|Const 
};

/// Class /Game/Startup/Launcher/Blueprints/BP_GcloudPuffer.BP_GcloudPuffer_C
/// Size: 0x0000 (0 bytes) (0x000160 - 0x000160) align 8 pad: 0x0000
class UBP_GcloudPuffer_C : public UMFGCloudPufferService
{ 
public:


	/// Functions
	// Function /Game/Startup/Launcher/Blueprints/BP_GcloudPuffer.BP_GcloudPuffer_C.GetModuleName
	// FString GetModuleName();                                                                                                 // [0x3a75280] Event|Public|HasOutParms|BlueprintCallable|BlueprintEvent|Const 
};

static_assert(sizeof(UBPC_GAS_GlobalComponent_C) == 0x0080); // 128 bytes (0x000080 - 0x000080)
static_assert(sizeof(UBPC_GameInstanceWeakNetworkComponent_C) == 0x00B0); // 176 bytes (0x0000B0 - 0x0000B0)
static_assert(sizeof(UBPC_GameInstancePluginManagerComponent_C) == 0x0068); // 104 bytes (0x000068 - 0x000068)
static_assert(sizeof(UBPC_GameInstanceGameInfoComponent_C) == 0x0060); // 96 bytes (0x000060 - 0x000060)
static_assert(sizeof(UBPC_GameInstanceG6PlatformComponent_C) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UBP_GameInstance_C) == 0x0300); // 768 bytes (0x0002F0 - 0x000300)
static_assert(sizeof(UBP_GameInstance_HD_C) == 0x0300); // 768 bytes (0x000300 - 0x000300)
static_assert(sizeof(UBP_GCloudDolphin_C) == 0x00A0); // 160 bytes (0x0000A0 - 0x0000A0)
static_assert(sizeof(UBP_GcloudPuffer_C) == 0x0160); // 352 bytes (0x000160 - 0x000160)
