
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: OnlineSubsystemUtils
/// dependency: PacketHandler

/// Enum /Script/MFWeakNetwork.EMFNetworkState
/// Size: 0x01 (1 bytes)
enum class EMFNetworkState : uint8_t
{
	EMFNetworkState__NotReachable                                                    = 0,
	EMFNetworkState__WWAN                                                            = 1,
	EMFNetworkState__Wifi                                                            = 2,
	EMFNetworkState__Others                                                          = 3
};

/// Class /Script/MFWeakNetwork.MFGCloudNetworkObserver
/// Size: 0x0030 (48 bytes) (0x000028 - 0x000058) align 8 pad: 0x0000
class UMFGCloudNetworkObserver : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x30];                                      // 0x0028   (0x0030)  MISSED
};

/// Class /Script/MFWeakNetwork.MFWeakNetworkEngineHandlerComponentFactory
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFWeakNetworkEngineHandlerComponentFactory : public UEngineHandlerComponentFactory
{ 
public:
};

/// Class /Script/MFWeakNetwork.MFWeakNetworkIpNetDriver
/// Size: 0x0010 (16 bytes) (0x000908 - 0x000918) align 8 pad: 0x0000
class UMFWeakNetworkIpNetDriver : public UIpNetDriver
{ 
public:
	bool                                               UseReservedNetworkGUIDMap;                                  // 0x0908   (0x0001)  
	unsigned char                                      UnknownData00_7[0xF];                                       // 0x0909   (0x000F)  MISSED
};

/// Class /Script/MFWeakNetwork.MFWeakNetworkNetConnection
/// Size: 0x0058 (88 bytes) (0x001C18 - 0x001C70) align 8 pad: 0x0000
class UMFWeakNetworkNetConnection : public UIpConnection
{ 
public:
	unsigned char                                      UnknownData00_3[0x18];                                      // 0x1C18   (0x0018)  MISSED
	float                                              ReconnectTimeForNotify;                                     // 0x1C30   (0x0004)  
	unsigned char                                      UnknownData01_6[0x14];                                      // 0x1C34   (0x0014)  MISSED
	float                                              SingleReconnectTime;                                        // 0x1C48   (0x0004)  
	int32_t                                            SingleMaxReconnectCount;                                    // 0x1C4C   (0x0004)  
	float                                              MaxReconnectCount;                                          // 0x1C50   (0x0004)  
	float                                              ClientConnectionTimeout;                                    // 0x1C54   (0x0004)  
	bool                                               EnableInitSocketFix;                                        // 0x1C58   (0x0001)  
	unsigned char                                      UnknownData02_6[0x3];                                       // 0x1C59   (0x0003)  MISSED
	float                                              SocketFixTime;                                              // 0x1C5C   (0x0004)  
	unsigned char                                      UnknownData03_7[0x10];                                      // 0x1C60   (0x0010)  MISSED


	/// Functions
	// Function /Script/MFWeakNetwork.MFWeakNetworkNetConnection.UseNewSocketReconnect
	// void UseNewSocketReconnect();                                                                                            // [0x2e8d9d0] Native|Public        
	// Function /Script/MFWeakNetwork.MFWeakNetworkNetConnection.PostLoadMap
	// void PostLoadMap(class UWorld* World);                                                                                   // [0x2e8d7c0] Native|Public        
};

/// Class /Script/MFWeakNetwork.MFWeakNetworkStatics
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFWeakNetworkStatics : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/MFWeakNetwork.MFWeakNetworkStatics.UseNewSocketReconnect
	// void UseNewSocketReconnect(class UObject* WorldContextObject);                                                           // [0x2e8d9f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFWeakNetwork.MFWeakNetworkStatics.SetNotSendCloseBunchEnable
	// void SetNotSendCloseBunchEnable(class UObject* WorldContextObject, bool enable);                                         // [0x2e8d910] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFWeakNetwork.MFWeakNetworkStatics.SetAsyncLoad
	// void SetAsyncLoad(class UObject* WorldContextObject, bool bEnable);                                                      // [0x2e8d850] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFWeakNetwork.MFWeakNetworkStatics.IsPlayerReconnecting
	// bool IsPlayerReconnecting(class APlayerController* PC);                                                                  // [0x2e8d730] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFWeakNetwork.MFWeakNetworkStatics.GetSingleReconnectTime
	// float GetSingleReconnectTime(class UObject* WorldContextObject);                                                         // [0x2e8d6a0] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFWeakNetwork.MFWeakNetworkStatics.GetSingleMaxReconnectCount
	// int32_t GetSingleMaxReconnectCount(class UObject* WorldContextObject);                                                   // [0x2e8d610] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFWeakNetwork.MFWeakNetworkStatics.GetMaxReconnectCount
	// int32_t GetMaxReconnectCount(class UObject* WorldContextObject);                                                         // [0x2e8d580] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFWeakNetwork.MFWeakNetworkTypes
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFWeakNetworkTypes : public UObject
{ 
public:
};

static_assert(sizeof(UMFGCloudNetworkObserver) == 0x0058); // 88 bytes (0x000028 - 0x000058)
static_assert(sizeof(UMFWeakNetworkEngineHandlerComponentFactory) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFWeakNetworkIpNetDriver) == 0x0918); // 2328 bytes (0x000908 - 0x000918)
static_assert(sizeof(UMFWeakNetworkNetConnection) == 0x1C70); // 7280 bytes (0x001C18 - 0x001C70)
static_assert(sizeof(UMFWeakNetworkStatics) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFWeakNetworkTypes) == 0x0028); // 40 bytes (0x000028 - 0x000028)
