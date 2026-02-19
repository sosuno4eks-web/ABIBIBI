
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

/// Enum /Script/LISlua425.EINTLPropertyClass
/// Size: 0x01 (1 bytes)
enum class EINTLPropertyClass : uint8_t
{
	EINTLPropertyClass__Byte                                                         = 0,
	EINTLPropertyClass__Int8                                                         = 1,
	EINTLPropertyClass__Int16                                                        = 2,
	EINTLPropertyClass__Int                                                          = 3,
	EINTLPropertyClass__Int64                                                        = 4,
	EINTLPropertyClass__UInt16                                                       = 5,
	EINTLPropertyClass__UInt32                                                       = 6,
	EINTLPropertyClass__UInt64                                                       = 7,
	EINTLPropertyClass__UnsizedInt                                                   = 8,
	EINTLPropertyClass__UnsizedUInt                                                  = 9,
	EINTLPropertyClass__Float                                                        = 10,
	EINTLPropertyClass__Double                                                       = 11,
	EINTLPropertyClass__Bool                                                         = 12,
	EINTLPropertyClass__SoftClass                                                    = 13,
	EINTLPropertyClass__WeakObject                                                   = 14,
	EINTLPropertyClass__LazyObject                                                   = 15,
	EINTLPropertyClass__SoftObject                                                   = 16,
	EINTLPropertyClass__Class                                                        = 17,
	EINTLPropertyClass__Object                                                       = 18,
	EINTLPropertyClass__Interface                                                    = 19,
	EINTLPropertyClass__Name                                                         = 20,
	EINTLPropertyClass__Str                                                          = 21,
	EINTLPropertyClass__Array                                                        = 22,
	EINTLPropertyClass__Map                                                          = 23,
	EINTLPropertyClass__Set                                                          = 24,
	EINTLPropertyClass__Struct                                                       = 25,
	EINTLPropertyClass__Delegate                                                     = 26,
	EINTLPropertyClass__MulticastDelegate                                            = 27,
	EINTLPropertyClass__Text                                                         = 28,
	EINTLPropertyClass__Enum                                                         = 29
};

/// Class /Script/LISlua425.INTLLatentDelegate
/// Size: 0x0008 (8 bytes) (0x000028 - 0x000030) align 8 pad: 0x0000
class UINTLLatentDelegate : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0028   (0x0008)  MISSED


	/// Functions
	// Function /Script/LISlua425.INTLLatentDelegate.OnLatentCallback
	// void OnLatentCallback(int32_t threadRef);                                                                                // [0x5e76430] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/LISlua425.INTLLuaActor
/// Size: 0x00B0 (176 bytes) (0x0002E0 - 0x000390) align 8 pad: 0x0000
class AINTLLuaActor : public AActor
{ 
public:
	unsigned char                                      UnknownData00_3[0x90];                                      // 0x02E0   (0x0090)  MISSED
	FString                                            LuaFilePath;                                                // 0x0370   (0x0010)  
	FString                                            LuaStateName;                                               // 0x0380   (0x0010)  


	/// Functions
	// Function /Script/LISlua425.INTLLuaActor.CallLuaMember
	// FINTLLuaBPVar CallLuaMember(FString FunctionName, TArray<FINTLLuaBPVar>& Args);                                          // [0x5e741c0] Final|Native|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/LISlua425.INTLLuaPawn
/// Size: 0x00B0 (176 bytes) (0x000350 - 0x000400) align 8 pad: 0x0000
class AINTLLuaPawn : public APawn
{ 
public:
	unsigned char                                      UnknownData00_3[0x90];                                      // 0x0350   (0x0090)  MISSED
	FString                                            LuaFilePath;                                                // 0x03E0   (0x0010)  
	FString                                            LuaStateName;                                               // 0x03F0   (0x0010)  


	/// Functions
	// Function /Script/LISlua425.INTLLuaPawn.CallLuaMember
	// FINTLLuaBPVar CallLuaMember(FString FunctionName, TArray<FINTLLuaBPVar>& Args);                                          // [0x5e74d00] Final|Native|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/LISlua425.INTLLuaCharacter
/// Size: 0x00B8 (184 bytes) (0x0005A8 - 0x000660) align 16 pad: 0x0000
class AINTLLuaCharacter : public ACharacter
{ 
public:
	unsigned char                                      UnknownData00_3[0x90];                                      // 0x05A8   (0x0090)  MISSED
	FString                                            LuaFilePath;                                                // 0x0638   (0x0010)  
	FString                                            LuaStateName;                                               // 0x0648   (0x0010)  
	unsigned char                                      UnknownData01_7[0x8];                                       // 0x0658   (0x0008)  MISSED


	/// Functions
	// Function /Script/LISlua425.INTLLuaCharacter.CallLuaMember
	// FINTLLuaBPVar CallLuaMember(FString FunctionName, TArray<FINTLLuaBPVar>& Args);                                          // [0x5e74400] Final|Native|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/LISlua425.INTLLuaController
/// Size: 0x00B0 (176 bytes) (0x000358 - 0x000408) align 8 pad: 0x0000
class AINTLLuaController : public AController
{ 
public:
	unsigned char                                      UnknownData00_3[0x90];                                      // 0x0358   (0x0090)  MISSED
	FString                                            LuaFilePath;                                                // 0x03E8   (0x0010)  
	FString                                            LuaStateName;                                               // 0x03F8   (0x0010)  


	/// Functions
	// Function /Script/LISlua425.INTLLuaController.CallLuaMember
	// FINTLLuaBPVar CallLuaMember(FString FunctionName, TArray<FINTLLuaBPVar>& Args);                                          // [0x5e74640] Final|Native|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/LISlua425.INTLLuaPlayerController
/// Size: 0x00B0 (176 bytes) (0x000640 - 0x0006F0) align 8 pad: 0x0000
class AINTLLuaPlayerController : public APlayerController
{ 
public:
	unsigned char                                      UnknownData00_3[0x90];                                      // 0x0640   (0x0090)  MISSED
	FString                                            LuaFilePath;                                                // 0x06D0   (0x0010)  
	FString                                            LuaStateName;                                               // 0x06E0   (0x0010)  


	/// Functions
	// Function /Script/LISlua425.INTLLuaPlayerController.CallLuaMember
	// FINTLLuaBPVar CallLuaMember(FString FunctionName, TArray<FINTLLuaBPVar>& Args);                                          // [0x5e74f40] Final|Native|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/LISlua425.INTLLuaActorComponent
/// Size: 0x00C0 (192 bytes) (0x0000F8 - 0x0001B8) align 8 pad: 0x0000
class UINTLLuaActorComponent : public UActorComponent
{ 
public:
	unsigned char                                      UnknownData00_3[0xA0];                                      // 0x00F8   (0x00A0)  MISSED
	FString                                            LuaFilePath;                                                // 0x0198   (0x0010)  
	FString                                            LuaStateName;                                               // 0x01A8   (0x0010)  


	/// Functions
	// Function /Script/LISlua425.INTLLuaActorComponent.CallLuaMember
	// FINTLLuaBPVar CallLuaMember(FString FunctionName, TArray<FINTLLuaBPVar>& Args);                                          // [0x5e75180] Final|Native|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/LISlua425.INTLLuaGameModeBase
/// Size: 0x00B0 (176 bytes) (0x000380 - 0x000430) align 8 pad: 0x0000
class AINTLLuaGameModeBase : public AGameModeBase
{ 
public:
	unsigned char                                      UnknownData00_3[0x90];                                      // 0x0380   (0x0090)  MISSED
	FString                                            LuaFilePath;                                                // 0x0410   (0x0010)  
	FString                                            LuaStateName;                                               // 0x0420   (0x0010)  


	/// Functions
	// Function /Script/LISlua425.INTLLuaGameModeBase.CallLuaMember
	// FINTLLuaBPVar CallLuaMember(FString FunctionName, TArray<FINTLLuaBPVar>& Args);                                          // [0x5e74880] Final|Native|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/LISlua425.INTLLuaHUD
/// Size: 0x00B0 (176 bytes) (0x0003D0 - 0x000480) align 8 pad: 0x0000
class AINTLLuaHUD : public AHUD
{ 
public:
	unsigned char                                      UnknownData00_3[0x90];                                      // 0x03D0   (0x0090)  MISSED
	FString                                            LuaFilePath;                                                // 0x0460   (0x0010)  
	FString                                            LuaStateName;                                               // 0x0470   (0x0010)  


	/// Functions
	// Function /Script/LISlua425.INTLLuaHUD.CallLuaMember
	// FINTLLuaBPVar CallLuaMember(FString FunctionName, TArray<FINTLLuaBPVar>& Args);                                          // [0x5e74ac0] Final|Native|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/LISlua425.LuaTableObjectInterfaceINTL
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class ULuaTableObjectInterfaceINTL : public UInterface
{ 
public:
};

/// Class /Script/LISlua425.INTLLuaBlueprintLibrary
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UINTLLuaBlueprintLibrary : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/LISlua425.INTLLuaBlueprintLibrary.GetStringFromVar
	// FString GetStringFromVar(FINTLLuaBPVar Value, int32_t Index);                                                            // [0x5e762d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/LISlua425.INTLLuaBlueprintLibrary.GetObjectFromVar
	// class UObject* GetObjectFromVar(FINTLLuaBPVar Value, int32_t Index);                                                     // [0x5e761c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/LISlua425.INTLLuaBlueprintLibrary.GetNumberFromVar
	// float GetNumberFromVar(FINTLLuaBPVar Value, int32_t Index);                                                              // [0x5e760b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/LISlua425.INTLLuaBlueprintLibrary.GetIntFromVar
	// int32_t GetIntFromVar(FINTLLuaBPVar Value, int32_t Index);                                                               // [0x5e75fa0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/LISlua425.INTLLuaBlueprintLibrary.GetBoolFromVar
	// bool GetBoolFromVar(FINTLLuaBPVar Value, int32_t Index);                                                                 // [0x5e75e90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/LISlua425.INTLLuaBlueprintLibrary.CreateVarFromString
	// FINTLLuaBPVar CreateVarFromString(FString Value);                                                                        // [0x5e75d70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/LISlua425.INTLLuaBlueprintLibrary.CreateVarFromObject
	// FINTLLuaBPVar CreateVarFromObject(class UObject* WorldContextObject, class UObject* Value);                              // [0x5e75c80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/LISlua425.INTLLuaBlueprintLibrary.CreateVarFromNumber
	// FINTLLuaBPVar CreateVarFromNumber(float Value);                                                                          // [0x5e75bd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/LISlua425.INTLLuaBlueprintLibrary.CreateVarFromInt
	// FINTLLuaBPVar CreateVarFromInt(int32_t Value);                                                                           // [0x5e75b20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/LISlua425.INTLLuaBlueprintLibrary.CreateVarFromBool
	// FINTLLuaBPVar CreateVarFromBool(bool Value);                                                                             // [0x5e75a70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/LISlua425.INTLLuaBlueprintLibrary.CallToLuaWithArgs
	// FINTLLuaBPVar CallToLuaWithArgs(class UObject* WorldContextObject, FString FunctionName, TArray<FINTLLuaBPVar>& Args, FString StateName); // [0x5e757f0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/LISlua425.INTLLuaBlueprintLibrary.CallToLua
	// FINTLLuaBPVar CallToLua(class UObject* WorldContextObject, FString FunctionName, FString StateName);                     // [0x5e75600] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/LISlua425.INTLLuaDelegate
/// Size: 0x0010 (16 bytes) (0x000028 - 0x000038) align 8 pad: 0x0000
class UINTLLuaDelegate : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x10];                                      // 0x0028   (0x0010)  MISSED


	/// Functions
	// Function /Script/LISlua425.INTLLuaDelegate.EventTrigger
	// void EventTrigger();                                                                                                     // [0xd906a0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/LISlua425.INTLLuaUserWidget
/// Size: 0x00E8 (232 bytes) (0x000288 - 0x000370) align 8 pad: 0x0000
class UINTLLuaUserWidget : public UUserWidget
{ 
public:
	unsigned char                                      UnknownData00_3[0x90];                                      // 0x0288   (0x0090)  MISSED
	FString                                            LuaFilePath;                                                // 0x0318   (0x0010)  
	FString                                            LuaStateName;                                               // 0x0328   (0x0010)  
	unsigned char                                      UnknownData01_7[0x38];                                      // 0x0338   (0x0038)  MISSED


	/// Functions
	// Function /Script/LISlua425.INTLLuaUserWidget.CallLuaMember
	// FINTLLuaBPVar CallLuaMember(FString FunctionName, TArray<FINTLLuaBPVar>& Args);                                          // [0x5e753c0] Final|Native|Public|HasOutParms|BlueprintCallable 
};

/// Struct /Script/LISlua425.INTLLuaBPVar
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 8 pad: 0x0000
struct FINTLLuaBPVar
{ 
	unsigned char                                      UnknownData00_2[0x20];                                      // 0x0000   (0x0020)  MISSED
};

static_assert(sizeof(UINTLLatentDelegate) == 0x0030); // 48 bytes (0x000028 - 0x000030)
static_assert(sizeof(AINTLLuaActor) == 0x0390); // 912 bytes (0x0002E0 - 0x000390)
static_assert(sizeof(AINTLLuaPawn) == 0x0400); // 1024 bytes (0x000350 - 0x000400)
static_assert(sizeof(AINTLLuaCharacter) == 0x0660); // 1632 bytes (0x0005A8 - 0x000660)
static_assert(sizeof(AINTLLuaController) == 0x0408); // 1032 bytes (0x000358 - 0x000408)
static_assert(sizeof(AINTLLuaPlayerController) == 0x06F0); // 1776 bytes (0x000640 - 0x0006F0)
static_assert(sizeof(UINTLLuaActorComponent) == 0x01B8); // 440 bytes (0x0000F8 - 0x0001B8)
static_assert(sizeof(AINTLLuaGameModeBase) == 0x0430); // 1072 bytes (0x000380 - 0x000430)
static_assert(sizeof(AINTLLuaHUD) == 0x0480); // 1152 bytes (0x0003D0 - 0x000480)
static_assert(sizeof(ULuaTableObjectInterfaceINTL) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UINTLLuaBlueprintLibrary) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UINTLLuaDelegate) == 0x0038); // 56 bytes (0x000028 - 0x000038)
static_assert(sizeof(UINTLLuaUserWidget) == 0x0370); // 880 bytes (0x000288 - 0x000370)
static_assert(sizeof(FINTLLuaBPVar) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(offsetof(AINTLLuaActor, LuaFilePath) == 0x0370);
static_assert(offsetof(AINTLLuaActor, LuaStateName) == 0x0380);
static_assert(offsetof(AINTLLuaPawn, LuaFilePath) == 0x03E0);
static_assert(offsetof(AINTLLuaPawn, LuaStateName) == 0x03F0);
static_assert(offsetof(AINTLLuaCharacter, LuaFilePath) == 0x0638);
static_assert(offsetof(AINTLLuaCharacter, LuaStateName) == 0x0648);
static_assert(offsetof(AINTLLuaController, LuaFilePath) == 0x03E8);
static_assert(offsetof(AINTLLuaController, LuaStateName) == 0x03F8);
static_assert(offsetof(AINTLLuaPlayerController, LuaFilePath) == 0x06D0);
static_assert(offsetof(AINTLLuaPlayerController, LuaStateName) == 0x06E0);
static_assert(offsetof(UINTLLuaActorComponent, LuaFilePath) == 0x0198);
static_assert(offsetof(UINTLLuaActorComponent, LuaStateName) == 0x01A8);
static_assert(offsetof(AINTLLuaGameModeBase, LuaFilePath) == 0x0410);
static_assert(offsetof(AINTLLuaGameModeBase, LuaStateName) == 0x0420);
static_assert(offsetof(AINTLLuaHUD, LuaFilePath) == 0x0460);
static_assert(offsetof(AINTLLuaHUD, LuaStateName) == 0x0470);
static_assert(offsetof(UINTLLuaUserWidget, LuaFilePath) == 0x0318);
static_assert(offsetof(UINTLLuaUserWidget, LuaStateName) == 0x0328);
