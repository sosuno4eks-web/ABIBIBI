
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Enum /Script/GameplayTasks.ETaskResourceOverlapPolicy
/// Size: 0x01 (1 bytes)
enum class ETaskResourceOverlapPolicy : uint8_t
{
	ETaskResourceOverlapPolicy__StartOnTop                                           = 0,
	ETaskResourceOverlapPolicy__StartAtEnd                                           = 1
};

/// Enum /Script/GameplayTasks.EGameplayTaskRunResult
/// Size: 0x01 (1 bytes)
enum class EGameplayTaskRunResult : uint8_t
{
	EGameplayTaskRunResult__Error                                                    = 0,
	EGameplayTaskRunResult__Failed                                                   = 1,
	EGameplayTaskRunResult__Success_Paused                                           = 2,
	EGameplayTaskRunResult__Success_Active                                           = 3,
	EGameplayTaskRunResult__Success_Finished                                         = 4
};

/// Enum /Script/GameplayTasks.EGameplayTaskState
/// Size: 0x01 (1 bytes)
enum class EGameplayTaskState : uint8_t
{
	EGameplayTaskState__Uninitialized                                                = 0,
	EGameplayTaskState__AwaitingActivation                                           = 1,
	EGameplayTaskState__Paused                                                       = 2,
	EGameplayTaskState__Active                                                       = 3,
	EGameplayTaskState__Finished                                                     = 4
};

/// Class /Script/GameplayTasks.GameplayTasksComponent
/// Size: 0x0070 (112 bytes) (0x0000F8 - 0x000168) align 8 pad: 0x0000
class UGameplayTasksComponent : public UActorComponent
{ 
public:
	unsigned char                                      UnknownData00_3[0xC];                                       // 0x00F8   (0x000C)  MISSED
	bool                                               bIsNetDirty : 1;                                            // 0x0104:1 (0x0001)  
	unsigned char                                      UnknownData01_5[0x3];                                       // 0x0105   (0x0003)  MISSED
	TArray<class UGameplayTask*>                       SimulatedTasks;                                             // 0x0108   (0x0010)  
	TArray<class UGameplayTask*>                       TaskPriorityQueue;                                          // 0x0118   (0x0010)  
	unsigned char                                      UnknownData02_6[0x10];                                      // 0x0128   (0x0010)  MISSED
	TArray<class UGameplayTask*>                       TickingTasks;                                               // 0x0138   (0x0010)  
	TArray<class UGameplayTask*>                       KnownTasks;                                                 // 0x0148   (0x0010)  
	SDK_UNDEFINED(16,359) /* FMulticastInlineDelegate */ __um(OnClaimedResourcesChange);                           // 0x0158   (0x0010)  


	/// Functions
	// Function /Script/GameplayTasks.GameplayTasksComponent.OnRep_SimulatedTasks
	// void OnRep_SimulatedTasks();                                                                                             // [0x5e99e20] Final|Native|Public  
	// Function /Script/GameplayTasks.GameplayTasksComponent.K2_RunGameplayTask
	// EGameplayTaskRunResult K2_RunGameplayTask(TScriptInterface<Class> TaskOwner, class UGameplayTask* Task, char Priority, TArray<UClass*> AdditionalRequiredResources, TArray<UClass*> AdditionalClaimedResources); // [0x5e99bd0] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/GameplayTasks.GameplayTask
/// Size: 0x0040 (64 bytes) (0x000028 - 0x000068) align 8 pad: 0x0000
class UGameplayTask : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0028   (0x0008)  MISSED
	FName                                              InstanceName;                                               // 0x0030   (0x0008)  
	unsigned char                                      UnknownData01_6[0x2];                                       // 0x0038   (0x0002)  MISSED
	ETaskResourceOverlapPolicy                         ResourceOverlapPolicy;                                      // 0x003A   (0x0001)  
	unsigned char                                      UnknownData02_6[0x25];                                      // 0x003B   (0x0025)  MISSED
	class UGameplayTask*                               ChildTask;                                                  // 0x0060   (0x0008)  


	/// Functions
	// Function /Script/GameplayTasks.GameplayTask.ReadyForActivation
	// void ReadyForActivation();                                                                                               // [0x5e99e40] Final|Native|Public|BlueprintCallable 
	// Function /Script/GameplayTasks.GameplayTask.GenericGameplayTaskDelegate__DelegateSignature
	// void GenericGameplayTaskDelegate__DelegateSignature();                                                                   // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/GameplayTasks.GameplayTask.EndTask
	// void EndTask();                                                                                                          // [0x5e99bb0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/GameplayTasks.GameplayTask_ClaimResource
/// Size: 0x0000 (0 bytes) (0x000068 - 0x000068) align 8 pad: 0x0000
class UGameplayTask_ClaimResource : public UGameplayTask
{ 
public:


	/// Functions
	// Function /Script/GameplayTasks.GameplayTask_ClaimResource.ClaimResources
	// class UGameplayTask_ClaimResource* ClaimResources(TScriptInterface<Class> InTaskOwner, TArray<UClass*> ResourceClasses, char Priority, FName TaskInstanceName); // [0x5e999f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameplayTasks.GameplayTask_ClaimResource.ClaimResource
	// class UGameplayTask_ClaimResource* ClaimResource(TScriptInterface<Class> InTaskOwner, class UClass* ResourceClass, char Priority, FName TaskInstanceName); // [0x5e99880] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/GameplayTasks.GameplayTask_SpawnActor
/// Size: 0x0040 (64 bytes) (0x000068 - 0x0000A8) align 8 pad: 0x0000
class UGameplayTask_SpawnActor : public UGameplayTask
{ 
public:
	SDK_UNDEFINED(16,360) /* FMulticastInlineDelegate */ __um(Success);                                            // 0x0068   (0x0010)  
	SDK_UNDEFINED(16,361) /* FMulticastInlineDelegate */ __um(DidNotSpawn);                                        // 0x0078   (0x0010)  
	unsigned char                                      UnknownData00_6[0x18];                                      // 0x0088   (0x0018)  MISSED
	class UClass*                                      ClassToSpawn;                                               // 0x00A0   (0x0008)  


	/// Functions
	// Function /Script/GameplayTasks.GameplayTask_SpawnActor.SpawnActor
	// class UGameplayTask_SpawnActor* SpawnActor(TScriptInterface<Class> TaskOwner, FVector SpawnLocation, FRotator SpawnRotation, class UClass* Class, bool bSpawnOnlyOnAuthority); // [0x5e99e60] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/GameplayTasks.GameplayTask_SpawnActor.FinishSpawningActor
	// void FinishSpawningActor(class UObject* WorldContextObject, class AActor* SpawnedActor);                                 // [0x29667d0] Native|Public|BlueprintCallable 
	// Function /Script/GameplayTasks.GameplayTask_SpawnActor.BeginSpawningActor
	// bool BeginSpawningActor(class UObject* WorldContextObject, class AActor*& SpawnedActor);                                 // [0x5e997a0] Native|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/GameplayTasks.GameplayTask_TimeLimitedExecution
/// Size: 0x0030 (48 bytes) (0x000068 - 0x000098) align 8 pad: 0x0000
class UGameplayTask_TimeLimitedExecution : public UGameplayTask
{ 
public:
	SDK_UNDEFINED(16,362) /* FMulticastInlineDelegate */ __um(OnFinished);                                         // 0x0068   (0x0010)  
	SDK_UNDEFINED(16,363) /* FMulticastInlineDelegate */ __um(OnTimeExpired);                                      // 0x0078   (0x0010)  
	unsigned char                                      UnknownData00_7[0x10];                                      // 0x0088   (0x0010)  MISSED
};

/// Class /Script/GameplayTasks.GameplayTask_WaitDelay
/// Size: 0x0018 (24 bytes) (0x000068 - 0x000080) align 8 pad: 0x0000
class UGameplayTask_WaitDelay : public UGameplayTask
{ 
public:
	SDK_UNDEFINED(16,364) /* FMulticastInlineDelegate */ __um(OnFinish);                                           // 0x0068   (0x0010)  
	unsigned char                                      UnknownData00_7[0x8];                                       // 0x0078   (0x0008)  MISSED


	/// Functions
	// Function /Script/GameplayTasks.GameplayTask_WaitDelay.TaskWaitDelay
	// class UGameplayTask_WaitDelay* TaskWaitDelay(TScriptInterface<Class> TaskOwner, float Time, char Priority);              // [0x5e9a030] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameplayTasks.GameplayTask_WaitDelay.TaskDelayDelegate__DelegateSignature
	// void TaskDelayDelegate__DelegateSignature();                                                                             // [0x3a75280] MulticastDelegate|Public|Delegate 
};

/// Class /Script/GameplayTasks.GameplayTaskOwnerInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UGameplayTaskOwnerInterface : public UInterface
{ 
public:
};

/// Class /Script/GameplayTasks.GameplayTaskResource
/// Size: 0x0010 (16 bytes) (0x000028 - 0x000038) align 8 pad: 0x0000
class UGameplayTaskResource : public UObject
{ 
public:
	int32_t                                            ManualResourceID;                                           // 0x0028   (0x0004)  
	int8_t                                             AutoResourceID;                                             // 0x002C   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x002D   (0x0003)  MISSED
	bool                                               bManuallySetID : 1;                                         // 0x0030:0 (0x0001)  
	unsigned char                                      UnknownData01_7[0x7];                                       // 0x0031   (0x0007)  MISSED
};

/// Struct /Script/GameplayTasks.GameplayResourceSet
/// Size: 0x0002 (2 bytes) (0x000000 - 0x000002) align 2 pad: 0x0000
struct FGameplayResourceSet
{ 
	unsigned char                                      UnknownData00_2[0x2];                                       // 0x0000   (0x0002)  MISSED
};

static_assert(sizeof(UGameplayTasksComponent) == 0x0168); // 360 bytes (0x0000F8 - 0x000168)
static_assert(sizeof(UGameplayTask) == 0x0068); // 104 bytes (0x000028 - 0x000068)
static_assert(sizeof(UGameplayTask_ClaimResource) == 0x0068); // 104 bytes (0x000068 - 0x000068)
static_assert(sizeof(UGameplayTask_SpawnActor) == 0x00A8); // 168 bytes (0x000068 - 0x0000A8)
static_assert(sizeof(UGameplayTask_TimeLimitedExecution) == 0x0098); // 152 bytes (0x000068 - 0x000098)
static_assert(sizeof(UGameplayTask_WaitDelay) == 0x0080); // 128 bytes (0x000068 - 0x000080)
static_assert(sizeof(UGameplayTaskOwnerInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UGameplayTaskResource) == 0x0038); // 56 bytes (0x000028 - 0x000038)
static_assert(sizeof(FGameplayResourceSet) == 0x0002); // 2 bytes (0x000000 - 0x000002)
static_assert(offsetof(UGameplayTasksComponent, SimulatedTasks) == 0x0108);
static_assert(offsetof(UGameplayTasksComponent, TaskPriorityQueue) == 0x0118);
static_assert(offsetof(UGameplayTasksComponent, TickingTasks) == 0x0138);
static_assert(offsetof(UGameplayTasksComponent, KnownTasks) == 0x0148);
static_assert(offsetof(UGameplayTask, InstanceName) == 0x0030);
static_assert(offsetof(UGameplayTask, ResourceOverlapPolicy) == 0x003A);
static_assert(offsetof(UGameplayTask, ChildTask) == 0x0060);
static_assert(offsetof(UGameplayTask_SpawnActor, ClassToSpawn) == 0x00A0);
