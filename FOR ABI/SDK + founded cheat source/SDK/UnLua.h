
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: InputCore
/// dependency: SGFramework

/// Class /Script/UnLua.UnLuaInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UUnLuaInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/UnLua.UnLuaInterface.GetModuleName
	// FString GetModuleName();                                                                                                 // [0x2c701f0] Native|Event|Public|BlueprintEvent|Const 
};

/// Class /Script/UnLua.UnLuaLatentAction
/// Size: 0x0020 (32 bytes) (0x000028 - 0x000048) align 8 pad: 0x0000
class UUnLuaLatentAction : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0028   (0x0008)  MISSED
	SDK_UNDEFINED(16,2797) /* FDelegateProperty */     __um(Callback);                                             // 0x0030   (0x0010)  
	bool                                               bTickEvenWhenPaused : 1;                                    // 0x0040:0 (0x0001)  
	unsigned char                                      UnknownData01_7[0x7];                                       // 0x0041   (0x0007)  MISSED


	/// Functions
	// Function /Script/UnLua.UnLuaLatentAction.SetTickableWhenPaused
	// void SetTickableWhenPaused(bool bTickableWhenPaused);                                                                    // [0x2c706a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/UnLua.UnLuaLatentAction.OnLegacyCallback
	// void OnLegacyCallback(int32_t InLinkage);                                                                                // [0x2c70510] Final|Native|Public  
	// Function /Script/UnLua.UnLuaLatentAction.OnCompleted
	// void OnCompleted(int32_t InLinkage);                                                                                     // [0x2c703f0] Final|Native|Public|Const 
	// Function /Script/UnLua.UnLuaLatentAction.GetTickableWhenPaused
	// bool GetTickableWhenPaused();                                                                                            // [0x2c70300] Final|Native|Public|BlueprintCallable 
	// Function /Script/UnLua.UnLuaLatentAction.CreateInfoForLegacy
	// FLatentActionInfo CreateInfoForLegacy();                                                                                 // [0x2c6fe30] Final|Native|Public|BlueprintCallable 
	// Function /Script/UnLua.UnLuaLatentAction.CreateInfo
	// FLatentActionInfo CreateInfo(int32_t Linkage);                                                                           // [0x2c6fd80] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/UnLua.UnLuaManager
/// Size: 0x0458 (1112 bytes) (0x000028 - 0x000480) align 8 pad: 0x0000
class UUnLuaManager : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0028   (0x0008)  MISSED
	SDK_UNDEFINED(80,2798) /* TMap<UClass*, FString> */ __um(ModuleNames);                                         // 0x0030   (0x0050)  
	SDK_UNDEFINED(80,2799) /* TMap<FString, UClass*> */ __um(Classes);                                             // 0x0080   (0x0050)  
	unsigned char                                      UnknownData01_6[0x1E0];                                     // 0x00D0   (0x01E0)  MISSED
	SDK_UNDEFINED(80,2800) /* TMap<UClass*, UClass*> */ __um(Derived2BaseClasses);                                 // 0x02B0   (0x0050)  
	unsigned char                                      UnknownData02_6[0x100];                                     // 0x0300   (0x0100)  MISSED
	SDK_UNDEFINED(80,2801) /* TSet<AActor*> */         __um(AttachedActors);                                       // 0x0400   (0x0050)  
	class UFunction*                                   InputActionFunc;                                            // 0x0450   (0x0008)  
	class UFunction*                                   InputAxisFunc;                                              // 0x0458   (0x0008)  
	class UFunction*                                   InputTouchFunc;                                             // 0x0460   (0x0008)  
	class UFunction*                                   InputVectorAxisFunc;                                        // 0x0468   (0x0008)  
	class UFunction*                                   InputGestureFunc;                                           // 0x0470   (0x0008)  
	class UFunction*                                   AnimNotifyFunc;                                             // 0x0478   (0x0008)  


	/// Functions
	// Function /Script/UnLua.UnLuaManager.TriggerAnimNotify
	// void TriggerAnimNotify();                                                                                                // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/UnLua.UnLuaManager.OnLatentActionCompleted
	// void OnLatentActionCompleted(int32_t LinkID);                                                                            // [0x2c70480] Final|Native|Public  
	// Function /Script/UnLua.UnLuaManager.OnActorDestroyed
	// void OnActorDestroyed(class AActor* Actor);                                                                              // [0x2c70360] Final|Native|Public  
	// Function /Script/UnLua.UnLuaManager.InputVectorAxis
	// void InputVectorAxis(FVector& AxisValue);                                                                                // [0x3a75280] Event|Public|HasOutParms|HasDefaults|BlueprintEvent 
	// Function /Script/UnLua.UnLuaManager.InputTouch
	// void InputTouch(TEnumAsByte<ETouchIndex> FingerIndex, FVector& Location);                                                // [0x3a75280] Event|Public|HasOutParms|HasDefaults|BlueprintEvent 
	// Function /Script/UnLua.UnLuaManager.InputGesture
	// void InputGesture(float Value);                                                                                          // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/UnLua.UnLuaManager.InputAxis
	// void InputAxis(float AxisValue);                                                                                         // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/UnLua.UnLuaManager.InputAction
	// void InputAction(FKey Key);                                                                                              // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/UnLua.UnLuaManager.HasPostEngineInited
	// bool HasPostEngineInited();                                                                                              // [0x2c70330] Final|Native|Static|Public 
};

/// Class /Script/UnLua.UnLuaPerformanceTestProxy
/// Size: 0x0060 (96 bytes) (0x0002E0 - 0x000340) align 8 pad: 0x0000
class AUnLuaPerformanceTestProxy : public AActor
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x02E0   (0x0008)  MISSED
	int32_t                                            MeshID;                                                     // 0x02E8   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x02EC   (0x0004)  MISSED
	FString                                            MeshName;                                                   // 0x02F0   (0x0010)  
	FVector                                            COM;                                                        // 0x0300   (0x000C)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x030C   (0x0004)  MISSED
	TArray<int32_t>                                    Indices;                                                    // 0x0310   (0x0010)  
	TArray<FVector>                                    Positions;                                                  // 0x0320   (0x0010)  
	TArray<FVector>                                    PredictedPositions;                                         // 0x0330   (0x0010)  


	/// Functions
	// Function /Script/UnLua.UnLuaPerformanceTestProxy.UpdatePositions
	// void UpdatePositions(TArray<FVector>& NewPositions);                                                                     // [0x19a6b40] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UnLua.UnLuaPerformanceTestProxy.UpdateMeshName
	// FString UpdateMeshName(FString NewName);                                                                                 // [0x2c707d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/UnLua.UnLuaPerformanceTestProxy.UpdateMeshID
	// int32_t UpdateMeshID(int32_t NewID);                                                                                     // [0x2c70730] Final|Native|Public|BlueprintCallable 
	// Function /Script/UnLua.UnLuaPerformanceTestProxy.UpdateIndices
	// void UpdateIndices(TArray<int32_t>& NewIndices);                                                                         // [0x19a6b40] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UnLua.UnLuaPerformanceTestProxy.Simulate
	// void Simulate(float DeltaTime);                                                                                          // [0x1e16e10] Final|Native|Public|BlueprintCallable 
	// Function /Script/UnLua.UnLuaPerformanceTestProxy.Raycast
	// bool Raycast(FVector& Origin, FVector& Direction);                                                                       // [0x2c705a0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UnLua.UnLuaPerformanceTestProxy.NOP
	// void NOP();                                                                                                              // [0xd906a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/UnLua.UnLuaPerformanceTestProxy.GetPredictedPositions
	// TArray<FVector> GetPredictedPositions();                                                                                 // [0x2c70270] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UnLua.UnLuaPerformanceTestProxy.GetPositions
	// void GetPositions(TArray<FVector>& OutPositions);                                                                        // [0x19a6b40] Final|Native|Public|HasOutParms|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UnLua.UnLuaPerformanceTestProxy.GetMeshName
	// FString GetMeshName();                                                                                                   // [0x2c70160] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UnLua.UnLuaPerformanceTestProxy.GetMeshInfo
	// bool GetMeshInfo(int32_t& OutMeshID, FString& OutMeshName, FVector& OutCOM, TArray<int32_t>& OutIndices, TArray<FVector>& OutPositions, TArray<FVector>& OutPredictedPositions); // [0x2c6fee0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UnLua.UnLuaPerformanceTestProxy.GetMeshID
	// int32_t GetMeshID();                                                                                                     // [0x2c6feb0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UnLua.UnLuaPerformanceTestProxy.GetIndices
	// void GetIndices(TArray<int32_t>& OutIndices);                                                                            // [0x19a6b40] Final|Native|Public|HasOutParms|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UnLua.UnLuaPerformanceTestProxy.GetCOM
	// FVector GetCOM();                                                                                                        // [0x2c6fe70] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
};

/// Struct /Script/UnLua.PropertyCollector
/// Size: 0x0001 (1 bytes) (0x000000 - 0x000001) align 1 pad: 0x0000
struct FPropertyCollector
{ 
	FSGAvatarData                                      None;                                                       // 0x0000   (0x0020)  
	FInputAxisKeyMapping                               None0;                                                      // 0x0000   (0x0028)  
	FInputActionKeyMapping                             None1;                                                      // 0x0000   (0x0028)  
	class USGPlayerItemInfoBase*                       None2;                                                      // 0x0000   (0x0008)  
	FString                                            None3;                                                      // 0x0000   (0x0010)  
};

static_assert(sizeof(UUnLuaInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UUnLuaLatentAction) == 0x0048); // 72 bytes (0x000028 - 0x000048)
static_assert(sizeof(UUnLuaManager) == 0x0480); // 1152 bytes (0x000028 - 0x000480)
static_assert(sizeof(AUnLuaPerformanceTestProxy) == 0x0340); // 832 bytes (0x0002E0 - 0x000340)
static_assert(sizeof(FPropertyCollector) == 0x0001); // 1 bytes (0x000000 - 0x000001)
static_assert(offsetof(UUnLuaManager, InputActionFunc) == 0x0450);
static_assert(offsetof(UUnLuaManager, InputAxisFunc) == 0x0458);
static_assert(offsetof(UUnLuaManager, InputTouchFunc) == 0x0460);
static_assert(offsetof(UUnLuaManager, InputVectorAxisFunc) == 0x0468);
static_assert(offsetof(UUnLuaManager, InputGestureFunc) == 0x0470);
static_assert(offsetof(UUnLuaManager, AnimNotifyFunc) == 0x0478);
static_assert(offsetof(AUnLuaPerformanceTestProxy, MeshName) == 0x02F0);
static_assert(offsetof(AUnLuaPerformanceTestProxy, COM) == 0x0300);
static_assert(offsetof(AUnLuaPerformanceTestProxy, Indices) == 0x0310);
static_assert(offsetof(AUnLuaPerformanceTestProxy, Positions) == 0x0320);
static_assert(offsetof(AUnLuaPerformanceTestProxy, PredictedPositions) == 0x0330);
static_assert(offsetof(FPropertyCollector, None) == 0x0000);
static_assert(offsetof(FPropertyCollector, None0) == 0x0000);
static_assert(offsetof(FPropertyCollector, None1) == 0x0000);
static_assert(offsetof(FPropertyCollector, None2) == 0x0000);
static_assert(offsetof(FPropertyCollector, None3) == 0x0000);
