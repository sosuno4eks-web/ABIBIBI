
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: GameplayTags

/// Enum /Script/MFQuestSystem.EQuestStatus
/// Size: 0x01 (1 bytes)
enum class EQuestStatus : uint8_t
{
	EQuestStatus__EQuestStatus_Inactive                                              = 0,
	EQuestStatus__EQuestStatus_InProcess                                             = 1,
	EQuestStatus__EQuestStatus_Success                                               = 2,
	EQuestStatus__EQuestStatus_Failed                                                = 3
};

/// Enum /Script/MFQuestSystem.EQuestNodeType
/// Size: 0x01 (1 bytes)
enum class EQuestNodeType : uint8_t
{
	EQuestNodeType__BaseNode                                                         = 0,
	EQuestNodeType__CheckNode                                                        = 1,
	EQuestNodeType__AssembleNode                                                     = 2,
	EQuestNodeType__AffiliateNode                                                    = 3
};

/// Enum /Script/MFQuestSystem.ERecoveryAttributeChangeType
/// Size: 0x01 (1 bytes)
enum class ERecoveryAttributeChangeType : uint8_t
{
	ERecoveryAttributeChangeType__Recover                                            = 0,
	ERecoveryAttributeChangeType__Lose                                               = 1
};

/// Enum /Script/MFQuestSystem.ETaskType
/// Size: 0x01 (1 bytes)
enum class ETaskType : uint8_t
{
	ETaskType__E_TASK_TYPE_NONE                                                      = 0,
	ETaskType__E_TASK_TYPE_MAIN                                                      = 1,
	ETaskType__E_TASK_TYPE_DAILY                                                     = 2,
	ETaskType__E_TASK_TYPE_ACT                                                       = 3,
	ETaskType__E_TASK_TYPE_WEEKLY                                                    = 4,
	ETaskType__E_TASK_TYPE_ERGENT                                                    = 5,
	ETaskType__E_TASK_TYPE_SEASON_WEEK                                               = 6,
	ETaskType__E_TASK_TYPE_SEASON                                                    = 7,
	ETaskType__E_TASK_TYPE_MENTOR                                                    = 8
};

/// Enum /Script/MFQuestSystem.EQuestType
/// Size: 0x01 (1 bytes)
enum class EQuestType : uint8_t
{
	EQuestType__Normal                                                               = 0,
	EQuestType__Distributer                                                          = 1,
	EQuestType__Activity                                                             = 2,
	EQuestType__Achievement                                                          = 3
};

/// Enum /Script/MFQuestSystem.EQuestObjectiveType
/// Size: 0x01 (1 bytes)
enum class EQuestObjectiveType : uint8_t
{
	EQuestObjectiveType__Percentage                                                  = 0,
	EQuestObjectiveType__ClearArea                                                   = 1,
	EQuestObjectiveType__OccupiedArea                                                = 2
};

/// Enum /Script/MFQuestSystem.ERelatedTargetType
/// Size: 0x01 (1 bytes)
enum class ERelatedTargetType : uint8_t
{
	ERelatedTargetType__TargetOnly                                                   = 0,
	ERelatedTargetType__TargetTeammateOnly                                           = 1,
	ERelatedTargetType__RandomTeam                                                   = 2,
	ERelatedTargetType__AllPMC                                                       = 3,
	ERelatedTargetType__AllSCAV                                                      = 4
};

/// Enum /Script/MFQuestSystem.ENumberCompareType
/// Size: 0x01 (1 bytes)
enum class ENumberCompareType : uint8_t
{
	ENumberCompareType__CMP_Equals                                                   = 0,
	ENumberCompareType__CMP_NotEqual                                                 = 1,
	ENumberCompareType__CMP_Greater                                                  = 2,
	ENumberCompareType__CMP_Less                                                     = 3,
	ENumberCompareType__CMP_GreaterEqual                                             = 4,
	ENumberCompareType__CMP_LessEqual                                                = 5,
	ENumberCompareType__CMP_Between                                                  = 6
};

/// Enum /Script/MFQuestSystem.ERunQuestResult
/// Size: 0x01 (1 bytes)
enum class ERunQuestResult : uint8_t
{
	ERunQuestResult__Success                                                         = 0,
	ERunQuestResult__Failed                                                          = 1
};

/// Enum /Script/MFQuestSystem.EQuestNodeStatus
/// Size: 0x01 (1 bytes)
enum class EQuestNodeStatus : uint8_t
{
	EQuestNodeStatus__EQuestNodeStatus_Active                                        = 0,
	EQuestNodeStatus__EQuestNodeStatus_Inactive                                      = 1
};

/// Enum /Script/MFQuestSystem.EQuestNodeConnectionType
/// Size: 0x01 (1 bytes)
enum class EQuestNodeConnectionType : uint8_t
{
	EQuestNodeConnectionType__EQuestNodeConnectionType_And                           = 0,
	EQuestNodeConnectionType__EQuestNodeConnectionType_Or                            = 1
};

/// Enum /Script/MFQuestSystem.EQuestInstigatorType
/// Size: 0x01 (1 bytes)
enum class EQuestInstigatorType : uint8_t
{
	EQuestInstigatorType__EQuestInstigatorType_None                                  = 0,
	EQuestInstigatorType__EQuestInstigatorType_Individual                            = 1,
	EQuestInstigatorType__EQuestInstigatorType_Team                                  = 2,
	EQuestInstigatorType__EQuestInstigatorType_Public                                = 3
};

/// Enum /Script/MFQuestSystem.EQuestConditionCheckType
/// Size: 0x01 (1 bytes)
enum class EQuestConditionCheckType : uint8_t
{
	EQuestConditionCheckType__EQuestConditionCheckType_Event                         = 0,
	EQuestConditionCheckType__EQuestConditionCheckType_Tick                          = 1,
	EQuestConditionCheckType__EQuestConditionCheckType_Both                          = 2
};

/// Enum /Script/MFQuestSystem.EQuestConditionType
/// Size: 0x01 (1 bytes)
enum class EQuestConditionType : uint8_t
{
	EQuestConditionType__EQuestConditionType_Keeping                                 = 0,
	EQuestConditionType__EQuestConditionType_Filter                                  = 1
};

/// Enum /Script/MFQuestSystem.EQuestFailedType
/// Size: 0x01 (1 bytes)
enum class EQuestFailedType : uint8_t
{
	EQuestFailedType__EQuestFailed_Normal                                            = 0,
	EQuestFailedType__EQuestFailed_TimeOut                                           = 1
};

/// Class /Script/MFQuestSystem.MFQuestComponentBase
/// Size: 0x0008 (8 bytes) (0x0000F8 - 0x000100) align 8 pad: 0x0000
class UMFQuestComponentBase : public UActorComponent
{ 
public:
	class AMFQuestBase*                                OwnerQuest;                                                 // 0x00F8   (0x0008)  


	/// Functions
	// Function /Script/MFQuestSystem.MFQuestComponentBase.InitializeQuestComponent
	// void InitializeQuestComponent(class AMFQuestBase* InOwner);                                                              // [0x28d0eb0] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestComponentBase.DeactivateQuestComponent
	// void DeactivateQuestComponent(EQuestStatus InResult);                                                                    // [0x2a2a3c0] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestComponentBase.ActivateQuestComponent
	// void ActivateQuestComponent();                                                                                           // [0xc2fd90] Native|Public        
};

/// Class /Script/MFQuestSystem.MFQuestActionComponentBase
/// Size: 0x0000 (0 bytes) (0x000100 - 0x000100) align 8 pad: 0x0000
class UMFQuestActionComponentBase : public UMFQuestComponentBase
{ 
public:
};

/// Class /Script/MFQuestSystem.MFBPQuestActionComponentBase
/// Size: 0x0000 (0 bytes) (0x000100 - 0x000100) align 8 pad: 0x0000
class UMFBPQuestActionComponentBase : public UMFQuestActionComponentBase
{ 
public:


	/// Functions
	// Function /Script/MFQuestSystem.MFBPQuestActionComponentBase.BP_InitializeQuestComponent
	// void BP_InitializeQuestComponent(class AMFQuestBase* InOwner);                                                           // [0x3a75280] Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/MFQuestSystem.MFBPQuestActionComponentBase.BP_DeactivateQuestComponent
	// void BP_DeactivateQuestComponent(EQuestStatus InResult);                                                                 // [0x3a75280] Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/MFQuestSystem.MFBPQuestActionComponentBase.BP_ActivateQuestComponentBP
	// void BP_ActivateQuestComponentBP();                                                                                      // [0x3a75280] Event|Public|BlueprintCallable|BlueprintEvent 
};

/// Class /Script/MFQuestSystem.MFQuestActivationComponentBase
/// Size: 0x0000 (0 bytes) (0x000100 - 0x000100) align 8 pad: 0x0000
class UMFQuestActivationComponentBase : public UMFQuestComponentBase
{ 
public:
};

/// Class /Script/MFQuestSystem.MFQuestActivationComp_TriggerVolume
/// Size: 0x0008 (8 bytes) (0x000100 - 0x000108) align 8 pad: 0x0000
class UMFQuestActivationComp_TriggerVolume : public UMFQuestActivationComponentBase
{ 
public:
	class AVolume*                                     TriggerVolume;                                              // 0x0100   (0x0008)  


	/// Functions
	// Function /Script/MFQuestSystem.MFQuestActivationComp_TriggerVolume.OnTrigger
	// void OnTrigger(class UPrimitiveComponent* OverlappedComp, class AActor* Other, class UPrimitiveComponent* OtherComp, int32_t OtherBodyIndex, bool bFromSweep, FHitResult& OverlapInfo); // [0x2f2a4a0] Final|Native|Public|HasOutParms 
};

/// Class /Script/MFQuestSystem.MFQuestNode
/// Size: 0x0030 (48 bytes) (0x000028 - 0x000058) align 8 pad: 0x0000
class UMFQuestNode : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x22];                                      // 0x0028   (0x0022)  MISSED
	bool                                               bFailedWhenAndParallelNodeFailed;                           // 0x004A   (0x0001)  
	unsigned char                                      UnknownData01_6[0xA];                                       // 0x004B   (0x000A)  MISSED
	bool                                               bForceCheck;                                                // 0x0055   (0x0001)  
	unsigned char                                      UnknownData02_7[0x2];                                       // 0x0056   (0x0002)  MISSED


	/// Functions
	// Function /Script/MFQuestSystem.MFQuestNode.TickNode
	// EQuestNodeStatus TickNode();                                                                                             // [0x2dba900] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestNode.ShouldFailedWhenAndParallelNodeFailed
	// bool ShouldFailedWhenAndParallelNodeFailed();                                                                            // [0x2f2ee20] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNode.SetupPrevConnections
	// void SetupPrevConnections(TArray<UMFQuestNode*>& InNodeList);                                                            // [0x2f2eaa0] Native|Public|HasOutParms 
	// Function /Script/MFQuestSystem.MFQuestNode.SetupNextConnection
	// void SetupNextConnection(class UMFQuestNode* InNode);                                                                    // [0x16b0a40] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestNode.SetForceCheck
	// void SetForceCheck(bool State);                                                                                          // [0x2f2ebe0] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNode.IsMyQuest
	// bool IsMyQuest(class AMFQuestBase* InQuest);                                                                             // [0x2f2e970] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNode.InitQuestNode
	// void InitQuestNode(class AMFQuestBase* InQuest, EQuestNodeConnectionType InType, bool InFailedWhenAndParallelNodeFailed); // [0x2f2e860] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestNode.HasPrevConnection
	// bool HasPrevConnection();                                                                                                // [0x2f2e830] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNode.GetQuestNodeType
	// EQuestNodeType GetQuestNodeType();                                                                                       // [0x2f2e810] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFQuestSystem.MFQuestNode.GetPrevConnections
	// TArray<UMFQuestNode*> GetPrevConnections();                                                                              // [0x2f2e530] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNode.GetNodeQuestStatus
	// EQuestStatus GetNodeQuestStatus(class UMFQuestNode* GetNode);                                                            // [0x2dba9d0] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestNode.GetNodeQuestCustomIndex
	// int32_t GetNodeQuestCustomIndex();                                                                                       // [0x2f2e4d0] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNode.GetNextConnections
	// TArray<UMFQuestNode*> GetNextConnections();                                                                              // [0x2f2e450] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNode.GetForceCheck
	// bool GetForceCheck();                                                                                                    // [0x2f2e3d0] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNode.GetConnectionType
	// EQuestNodeConnectionType GetConnectionType();                                                                            // [0x2f2e3a0] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNode.DestroyNode
	// void DestroyNode();                                                                                                      // [0xd909a0] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestNode.DeactivateNode
	// void DeactivateNode(EQuestStatus InResult);                                                                              // [0x2f2e230] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestNode.CheckQuestNode
	// bool CheckQuestNode();                                                                                                   // [0x2f2db20] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestNode.CheckPrevConnections
	// void CheckPrevConnections(bool& bFail, bool& bSuccess);                                                                  // [0x2f2da40] Native|Public|HasOutParms 
	// Function /Script/MFQuestSystem.MFQuestNode.ActivateNode
	// void ActivateNode();                                                                                                     // [0x19833f0] Native|Public        
};

/// Class /Script/MFQuestSystem.MFQuestAffiliateNode
/// Size: 0x0000 (0 bytes) (0x000058 - 0x000058) align 8 pad: 0x0000
class UMFQuestAffiliateNode : public UMFQuestNode
{ 
public:
};

/// Class /Script/MFQuestSystem.MFQuestAssembleNode
/// Size: 0x0010 (16 bytes) (0x000058 - 0x000068) align 8 pad: 0x0000
class UMFQuestAssembleNode : public UMFQuestNode
{ 
public:
	TArray<class UMFQuestAffiliateNode*>               QuestAffiliateNodeArray;                                    // 0x0058   (0x0010)  


	/// Functions
	// Function /Script/MFQuestSystem.MFQuestAssembleNode.GetAffiliateQuestNodes
	// void GetAffiliateQuestNodes(TArray<UMFQuestAffiliateNode*>& QuestAffiliateNodeArray);                                    // [0x2f29e40] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFQuestSystem.MFQuestAssembleNode.AddAffiliateQuestNode
	// void AddAffiliateQuestNode(class UMFQuestAffiliateNode* QuestNode);                                                      // [0x2f29a20] Final|Native|Public|BlueprintCallable 
};

/// Struct /Script/MFQuestSystem.QuestState
/// Size: 0x0002 (2 bytes) (0x000000 - 0x000002) align 1 pad: 0x0000
struct FQuestState
{ 
	EQuestStatus                                       CurrQuestStatus;                                            // 0x0000   (0x0001)  
	EQuestStatus                                       OldQuestStatus;                                             // 0x0001   (0x0001)  
};

/// Class /Script/MFQuestSystem.MFQuestBase
/// Size: 0x00E0 (224 bytes) (0x0002E0 - 0x0003C0) align 8 pad: 0x0000
class AMFQuestBase : public AActor
{ 
public:
	unsigned char                                      UnknownData00_3[0x30];                                      // 0x02E0   (0x0030)  MISSED
	SDK_UNDEFINED(16,2336) /* FMulticastInlineDelegate */ __um(OnQuestStateChange);                                // 0x0310   (0x0010)  
	unsigned char                                      UnknownData01_6[0x10];                                      // 0x0320   (0x0010)  MISSED
	TArray<class UMFQuestActionComponentBase*>         ActionComponents;                                           // 0x0330   (0x0010)  
	TArray<class UMFQuestActionComponentBase*>         LevelUnrelatedActionComponents;                             // 0x0340   (0x0010)  
	TArray<class UMFQuestActivationComponentBase*>     ActivationComponents;                                       // 0x0350   (0x0010)  
	bool                                               CanRunOnClient;                                             // 0x0360   (0x0001)  
	unsigned char                                      UnknownData02_6[0x7];                                       // 0x0361   (0x0007)  MISSED
	class UMFQuestObjectiveComponentBase*              ObjectiveComponent;                                         // 0x0368   (0x0008)  
	unsigned char                                      UnknownData03_6[0x8];                                       // 0x0370   (0x0008)  MISSED
	int32_t                                            CustomIndex;                                                // 0x0378   (0x0004)  
	int32_t                                            GraphID;                                                    // 0x037C   (0x0004)  
	FQuestState                                        QuestStatus;                                                // 0x0380   (0x0002)  
	EQuestFailedType                                   QuestFailedType;                                            // 0x0382   (0x0001)  
	bool                                               IsAffiliateQuest;                                           // 0x0383   (0x0001)  
	unsigned char                                      UnknownData04_6[0x4];                                       // 0x0384   (0x0004)  MISSED
	TArray<int32_t>                                    AssembleCustomIndexList;                                    // 0x0388   (0x0010)  
	TArray<int32_t>                                    QuestTemplateParams;                                        // 0x0398   (0x0010)  
	bool                                               bIsTemplate;                                                // 0x03A8   (0x0001)  
	unsigned char                                      UnknownData05_6[0x3];                                       // 0x03A9   (0x0003)  MISSED
	float                                              ActivateTime;                                               // 0x03AC   (0x0004)  
	float                                              FinishTime;                                                 // 0x03B0   (0x0004)  
	unsigned char                                      UnknownData06_6[0x4];                                       // 0x03B4   (0x0004)  MISSED
	class ACharacter*                                  CacheCharacter;                                             // 0x03B8   (0x0008)  


	/// Functions
	// Function /Script/MFQuestSystem.MFQuestBase.ShowLog
	// void ShowLog(FString LogStr, bool bImportant);                                                                           // [0x2f2ac50] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestBase.SetQuestTemplateParams
	// void SetQuestTemplateParams(TArray<int32_t>& InQuestTemplateParams);                                                     // [0x2f2aba0] Native|Public|HasOutParms 
	// Function /Script/MFQuestSystem.MFQuestBase.SetQuestStatus
	// void SetQuestStatus(EQuestStatus InNewStatus);                                                                           // [0x2f2ab20] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestBase.SetQuestObjective
	// void SetQuestObjective(class UMFQuestObjectiveComponentBase* QuestObjective);                                            // [0x2f2aa90] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestBase.SetQuestFailedType
	// void SetQuestFailedType(EQuestFailedType InFailedType);                                                                  // [0x2f2aa10] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestBase.SetMissionStatus
	// void SetMissionStatus(EQuestStatus InNewStatus);                                                                         // [0x2f2a990] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestBase.SetMissionCurProgress
	// void SetMissionCurProgress(int32_t CurProgress);                                                                         // [0x2f2a900] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestBase.SetIsTemplateQuest
	// void SetIsTemplateQuest(bool bIsTemplateQuest);                                                                          // [0x2f2a870] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestBase.SetInGraphID
	// void SetInGraphID(int32_t InGraphID);                                                                                    // [0x2f2a7e0] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestBase.SetCustomIndex
	// void SetCustomIndex(int32_t InIndex);                                                                                    // [0x2f2a750] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestBase.SetAffiliate
	// void SetAffiliate(bool Value);                                                                                           // [0x2f2a6c0] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestBase.OnReq_QuestStatus
	// void OnReq_QuestStatus();                                                                                                // [0x2862280] Native|Protected     
	// Function /Script/MFQuestSystem.MFQuestBase.OnProgressChange
	// void OnProgressChange(int32_t AddProgress, int32_t CurrpProgress, int32_t MaxProgress);                                  // [0x2f2a3a0] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestBase.OnObjectiveStateChanged
	// void OnObjectiveStateChanged(EQuestStatus NewState, EQuestStatus OldState);                                              // [0x2f2a2d0] Native|Protected     
	// Function /Script/MFQuestSystem.MFQuestBase.IsTemplateQuest
	// bool IsTemplateQuest();                                                                                                  // [0x2f2a2a0] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestBase.IsAffiliate
	// bool IsAffiliate();                                                                                                      // [0x2f2a280] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFQuestSystem.MFQuestBase.IsActive
	// bool IsActive();                                                                                                         // [0x2f2a250] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestBase.GetQuestTemplateParamByIndex
	// int32_t GetQuestTemplateParamByIndex(int32_t InParamIndex);                                                              // [0x2f2a1b0] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFQuestSystem.MFQuestBase.GetQuestStatus
	// EQuestStatus GetQuestStatus();                                                                                           // [0x2f2a180] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFQuestSystem.MFQuestBase.GetQuestState
	// FQuestState GetQuestState();                                                                                             // [0x2f2a150] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFQuestSystem.MFQuestBase.GetQuestObjectiveType
	// EQuestObjectiveType GetQuestObjectiveType();                                                                             // [0x2f2a120] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestBase.GetQuestObjective
	// class UMFQuestObjectiveComponentBase* GetQuestObjective();                                                               // [0x2f2a0f0] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFQuestSystem.MFQuestBase.GetQuestInstigator
	// class UMFQuestInstigatorComponentBase* GetQuestInstigator();                                                             // [0x2f2a0c0] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestBase.GetQuestFailedType
	// EQuestFailedType GetQuestFailedType();                                                                                   // [0x2f2a090] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestBase.GetOldQuestStatus
	// int32_t GetOldQuestStatus();                                                                                             // [0x2f2a070] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFQuestSystem.MFQuestBase.GetInstigatorCharacter
	// class ACharacter* GetInstigatorCharacter();                                                                              // [0x2f2a040] Final|Native|Protected|BlueprintCallable|BlueprintPure 
	// Function /Script/MFQuestSystem.MFQuestBase.GetInGraphID
	// int32_t GetInGraphID();                                                                                                  // [0x2f2a010] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFQuestSystem.MFQuestBase.GetFinishTime
	// float GetFinishTime();                                                                                                   // [0x2f29ff0] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFQuestSystem.MFQuestBase.GetCustomIndex
	// int32_t GetCustomIndex();                                                                                                // [0x2f29fc0] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFQuestSystem.MFQuestBase.GetCurrQuestStatus
	// int32_t GetCurrQuestStatus();                                                                                            // [0x2f29fa0] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFQuestSystem.MFQuestBase.GetAssembleCustomIndexList
	// void GetAssembleCustomIndexList(TArray<int32_t>& OutList);                                                               // [0x2f29ef0] Final|Native|Public|HasOutParms|BlueprintCallable|BlueprintPure 
	// Function /Script/MFQuestSystem.MFQuestBase.GetAffiliateMissionList
	// void GetAffiliateMissionList(TArray<FString>& OutList);                                                                  // [0x2f29d70] Final|Native|Public|HasOutParms|BlueprintCallable|BlueprintPure 
	// Function /Script/MFQuestSystem.MFQuestBase.GetActivateTime
	// float GetActivateTime();                                                                                                 // [0x2f29d50] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFQuestSystem.MFQuestBase.DeactivateQuest
	// void DeactivateQuest(EQuestStatus InResult);                                                                             // [0x2f29cd0] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestBase.ClientShowLog
	// void ClientShowLog(bool bImportant, FString LogStr);                                                                     // [0x2f29bd0] Net|Native|Event|Public|NetClient 
	// Function /Script/MFQuestSystem.MFQuestBase.AssignQuestInstigator
	// void AssignQuestInstigator(class UMFQuestInstigatorComponentBase* InInstigator);                                         // [0x2f29b40] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestBase.AddAssembleCustomIndex
	// void AddAssembleCustomIndex(int32_t InCustomIndex);                                                                      // [0x2f29ab0] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestBase.ActivateQuest
	// void ActivateQuest();                                                                                                    // [0xdaf3b0] Native|Public        
};

/// Class /Script/MFQuestSystem.MFQuestCheckNode
/// Size: 0x0008 (8 bytes) (0x000058 - 0x000060) align 8 pad: 0x0000
class UMFQuestCheckNode : public UMFQuestNode
{ 
public:
	bool                                               bSuccessWhenParallelNodeSuccess;                            // 0x0058   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0059   (0x0007)  MISSED


	/// Functions
	// Function /Script/MFQuestSystem.MFQuestCheckNode.InitCheckQuestNode
	// void InitCheckQuestNode(bool InSuccessWhenParallelNodeSuccess);                                                          // [0x19832d0] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestCheckNode.GetSuccessWhenParallelNodeSuccess
	// bool GetSuccessWhenParallelNodeSuccess();                                                                                // [0x1987a10] Final|Native|Public  
};

/// Class /Script/MFQuestSystem.CheckActorParamBase
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UCheckActorParamBase : public UObject
{ 
public:
};

/// Class /Script/MFQuestSystem.CheckActorClass
/// Size: 0x0028 (40 bytes) (0x000028 - 0x000050) align 8 pad: 0x0000
class UCheckActorClass : public UCheckActorParamBase
{ 
public:
	SDK_UNDEFINED(40,2337) /* TWeakObjectPtr<UClass*> */ __um(ParentClass);                                        // 0x0028   (0x0028)  
};

/// Class /Script/MFQuestSystem.CheckActorLocation
/// Size: 0x0010 (16 bytes) (0x000028 - 0x000038) align 8 pad: 0x0000
class UCheckActorLocation : public UCheckActorParamBase
{ 
public:
	FVector                                            Center;                                                     // 0x0028   (0x000C)  
	float                                              Radius;                                                     // 0x0034   (0x0004)  
};

/// Class /Script/MFQuestSystem.MFQuestConditionComponentBase
/// Size: 0x0028 (40 bytes) (0x000028 - 0x000050) align 8 pad: 0x0000
class UMFQuestConditionComponentBase : public UObject
{ 
public:
	SDK_UNDEFINED(16,2338) /* FMulticastInlineDelegate */ __um(OnGenerateDebugInfo);                               // 0x0028   (0x0010)  
	class AMFQuestBase*                                OwnerQuest;                                                 // 0x0038   (0x0008)  
	bool                                               bAdvanceEdit;                                               // 0x0040   (0x0001)  
	EQuestConditionType                                ConditionType;                                              // 0x0041   (0x0001)  
	EQuestConditionCheckType                           CheckType;                                                  // 0x0042   (0x0001)  
	bool                                               bExpectConditionResult;                                     // 0x0043   (0x0001)  
	float                                              CustomTickInterval;                                         // 0x0044   (0x0004)  
	FTimerHandle                                       CustomTickTimerHandle;                                      // 0x0048   (0x0008)  


	/// Functions
	// Function /Script/MFQuestSystem.MFQuestConditionComponentBase.CustomTick
	// void CustomTick();                                                                                                       // [0x16b0bb0] Native|Protected     
};

/// Class /Script/MFQuestSystem.MFQuestConditionComp_CheckActorProperty
/// Size: 0x0018 (24 bytes) (0x000050 - 0x000068) align 8 pad: 0x0000
class UMFQuestConditionComp_CheckActorProperty : public UMFQuestConditionComponentBase
{ 
public:
	class UClass*                                      CheckTargetContextSource;                                   // 0x0050   (0x0008)  
	TArray<class UCheckActorParamBase*>                CheckParams;                                                // 0x0058   (0x0010)  
};

/// Class /Script/MFQuestSystem.CheckBlackboardBase
/// Size: 0x0008 (8 bytes) (0x000028 - 0x000030) align 8 pad: 0x0000
class UCheckBlackboardBase : public UObject
{ 
public:
	class UClass*                                      TargetActor;                                                // 0x0028   (0x0008)  
};

/// Class /Script/MFQuestSystem.CheckIntMapValue
/// Size: 0x0018 (24 bytes) (0x000030 - 0x000048) align 8 pad: 0x0000
class UCheckIntMapValue : public UCheckBlackboardBase
{ 
public:
	FGameplayTag                                       Key;                                                        // 0x0030   (0x0008)  
	ENumberCompareType                                 CompareType;                                                // 0x0038   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0039   (0x0003)  MISSED
	int32_t                                            Value1;                                                     // 0x003C   (0x0004)  
	int32_t                                            Value2;                                                     // 0x0040   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x0044   (0x0004)  MISSED
};

/// Class /Script/MFQuestSystem.CheckIntArrayMapNum
/// Size: 0x0018 (24 bytes) (0x000030 - 0x000048) align 8 pad: 0x0000
class UCheckIntArrayMapNum : public UCheckBlackboardBase
{ 
public:
	FGameplayTag                                       Key;                                                        // 0x0030   (0x0008)  
	ENumberCompareType                                 CompareType;                                                // 0x0038   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0039   (0x0003)  MISSED
	int32_t                                            Value1;                                                     // 0x003C   (0x0004)  
	int32_t                                            Value2;                                                     // 0x0040   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x0044   (0x0004)  MISSED
};

/// Class /Script/MFQuestSystem.CheckObjectArrayMapNum
/// Size: 0x0018 (24 bytes) (0x000030 - 0x000048) align 8 pad: 0x0000
class UCheckObjectArrayMapNum : public UCheckBlackboardBase
{ 
public:
	FGameplayTag                                       Key;                                                        // 0x0030   (0x0008)  
	ENumberCompareType                                 CompareType;                                                // 0x0038   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0039   (0x0003)  MISSED
	int32_t                                            Value1;                                                     // 0x003C   (0x0004)  
	int32_t                                            Value2;                                                     // 0x0040   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x0044   (0x0004)  MISSED
};

/// Class /Script/MFQuestSystem.MFQuestConditionComp_CheckBlackboard
/// Size: 0x0010 (16 bytes) (0x000050 - 0x000060) align 8 pad: 0x0000
class UMFQuestConditionComp_CheckBlackboard : public UMFQuestConditionComponentBase
{ 
public:
	TArray<class UCheckBlackboardBase*>                CheckParams;                                                // 0x0050   (0x0010)  
};

/// Class /Script/MFQuestSystem.MFQuestConditionComp_Dist
/// Size: 0x0018 (24 bytes) (0x000050 - 0x000068) align 8 pad: 0x0000
class UMFQuestConditionComp_Dist : public UMFQuestConditionComponentBase
{ 
public:
	class UClass*                                      SourceActorContextConfig;                                   // 0x0050   (0x0008)  
	class UClass*                                      DestActorContextConfig;                                     // 0x0058   (0x0008)  
	float                                              MinDist;                                                    // 0x0060   (0x0004)  
	float                                              MaxDist;                                                    // 0x0064   (0x0004)  
};

/// Class /Script/MFQuestSystem.MFQuestConditionComp_RandomProbability
/// Size: 0x0008 (8 bytes) (0x000050 - 0x000058) align 8 pad: 0x0000
class UMFQuestConditionComp_RandomProbability : public UMFQuestConditionComponentBase
{ 
public:
	float                                              ProbabilityPercent;                                         // 0x0050   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0054   (0x0004)  MISSED
};

/// Class /Script/MFQuestSystem.MFQuestContextBase
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFQuestContextBase : public UObject
{ 
public:
};

/// Class /Script/MFQuestSystem.MFQuestContext_Actor
/// Size: 0x0008 (8 bytes) (0x000028 - 0x000030) align 8 pad: 0x0000
class UMFQuestContext_Actor : public UMFQuestContextBase
{ 
public:
	class AActor*                                      ContextActor;                                               // 0x0028   (0x0008)  
};

/// Class /Script/MFQuestSystem.MFQuestContext_GameplayTag
/// Size: 0x0008 (8 bytes) (0x000028 - 0x000030) align 8 pad: 0x0000
class UMFQuestContext_GameplayTag : public UMFQuestContextBase
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0028   (0x0008)  MISSED
};

/// Class /Script/MFQuestSystem.MFQuestContext_Number
/// Size: 0x0010 (16 bytes) (0x000028 - 0x000038) align 8 pad: 0x0000
class UMFQuestContext_Number : public UMFQuestContextBase
{ 
public:
	unsigned char                                      UnknownData00_1[0x10];                                      // 0x0028   (0x0010)  MISSED
};

/// Class /Script/MFQuestSystem.MFQuestContext_Object
/// Size: 0x0008 (8 bytes) (0x000028 - 0x000030) align 8 pad: 0x0000
class UMFQuestContext_Object : public UMFQuestContextBase
{ 
public:
	class UObject*                                     Object;                                                     // 0x0028   (0x0008)  
};

/// Class /Script/MFQuestSystem.MFQuestContextSourceBase
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFQuestContextSourceBase : public UObject
{ 
public:
};

/// Class /Script/MFQuestSystem.MFQuestContextSource_BlackboardKey
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFQuestContextSource_BlackboardKey : public UMFQuestContextSourceBase
{ 
public:
};

/// Class /Script/MFQuestSystem.MFQuestContextSource_BlackboardTarget
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFQuestContextSource_BlackboardTarget : public UMFQuestContextSourceBase
{ 
public:
};

/// Class /Script/MFQuestSystem.MFQuestContextSource_CurrentValue
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFQuestContextSource_CurrentValue : public UMFQuestContextSourceBase
{ 
public:
};

/// Class /Script/MFQuestSystem.MFQuestContextSource_ObjectiveInstigator
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFQuestContextSource_ObjectiveInstigator : public UMFQuestContextSourceBase
{ 
public:
};

/// Class /Script/MFQuestSystem.MFQuestContextSource_ObjectiveTarget
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFQuestContextSource_ObjectiveTarget : public UMFQuestContextSourceBase
{ 
public:
};

/// Class /Script/MFQuestSystem.MFQuestContextSource_PreviousValue
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFQuestContextSource_PreviousValue : public UMFQuestContextSourceBase
{ 
public:
};

/// Class /Script/MFQuestSystem.MFQuestContextSource_QuestDistributer
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFQuestContextSource_QuestDistributer : public UMFQuestContextSourceBase
{ 
public:
};

/// Class /Script/MFQuestSystem.QuestConditionEffectContainer
/// Size: 0x0040 (64 bytes) (0x000028 - 0x000068) align 8 pad: 0x0000
class UQuestConditionEffectContainer : public UObject
{ 
public:
	class AMFQuestDistributerBase*                     QuestDistributer;                                           // 0x0028   (0x0008)  
	class UMFQuestPrimaryConditionBase*                PrimaryCondition;                                           // 0x0030   (0x0008)  
	TArray<class UMFQuestConditionComponentBase*>      SubConditions;                                              // 0x0038   (0x0010)  
	TArray<class UMFQuestEffectBase*>                  QuestEffects;                                               // 0x0048   (0x0010)  
	TArray<class UMFQuestEffectBase*>                  FailQuestEffects;                                           // 0x0058   (0x0010)  


	/// Functions
	// Function /Script/MFQuestSystem.QuestConditionEffectContainer.OnTriggerPrimaryCondition
	// void OnTriggerPrimaryCondition(TArray<FQuestContextPair>& QuestContextList);                                             // [0x2f2eaa0] Native|Public|HasOutParms 
};

/// Class /Script/MFQuestSystem.MFQuestDistributerBase
/// Size: 0x00A0 (160 bytes) (0x0002E0 - 0x000380) align 8 pad: 0x0000
class AMFQuestDistributerBase : public AActor
{ 
public:
	EQuestType                                         QuestType;                                                  // 0x02E0   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x02E1   (0x0007)  MISSED
	TArray<class UQuestConditionEffectContainer*>      QuestConditionEffectContainers;                             // 0x02E8   (0x0010)  
	SDK_UNDEFINED(80,2339) /* TMap<AActor*, FQuestDistributerBlackboard> */ __um(ActorBlackboards);                // 0x02F8   (0x0050)  
	SDK_UNDEFINED(16,2340) /* FMulticastInlineDelegate */ __um(OnBlackboardIntMapChanged);                         // 0x0348   (0x0010)  
	SDK_UNDEFINED(16,2341) /* FMulticastInlineDelegate */ __um(OnBlackboardIntArrayMapChanged);                    // 0x0358   (0x0010)  
	SDK_UNDEFINED(16,2342) /* FMulticastInlineDelegate */ __um(OnBlackboardObjectArrayMapChanged);                 // 0x0368   (0x0010)  
	class ACharacter*                                  LastTriggerCharacter;                                       // 0x0378   (0x0008)  


	/// Functions
	// Function /Script/MFQuestSystem.MFQuestDistributerBase.ShowLog
	// void ShowLog(FString LogStr, bool bImportant);                                                                           // [0x2f2ee50] Final|Native|Public  
};

/// Class /Script/MFQuestSystem.BlackboardOperatorBase
/// Size: 0x0010 (16 bytes) (0x000028 - 0x000038) align 8 pad: 0x0000
class UBlackboardOperatorBase : public UObject
{ 
public:
	class UClass*                                      TargetActor;                                                // 0x0028   (0x0008)  
	bool                                               BTeamInfo;                                                  // 0x0030   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0031   (0x0007)  MISSED
};

/// Class /Script/MFQuestSystem.IntMapAddValue
/// Size: 0x0018 (24 bytes) (0x000038 - 0x000050) align 8 pad: 0x0000
class UIntMapAddValue : public UBlackboardOperatorBase
{ 
public:
	FGameplayTag                                       Key;                                                        // 0x0038   (0x0008)  
	class UClass*                                      ModifyValueSource;                                          // 0x0040   (0x0008)  
	int32_t                                            ModifyValue;                                                // 0x0048   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x004C   (0x0004)  MISSED
};

/// Class /Script/MFQuestSystem.IntMapSetValue
/// Size: 0x0018 (24 bytes) (0x000038 - 0x000050) align 8 pad: 0x0000
class UIntMapSetValue : public UBlackboardOperatorBase
{ 
public:
	FGameplayTag                                       Key;                                                        // 0x0038   (0x0008)  
	class UClass*                                      ValueSource;                                                // 0x0040   (0x0008)  
	int32_t                                            Value;                                                      // 0x0048   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x004C   (0x0004)  MISSED
};

/// Class /Script/MFQuestSystem.IntArrayMapAddValue
/// Size: 0x0018 (24 bytes) (0x000038 - 0x000050) align 8 pad: 0x0000
class UIntArrayMapAddValue : public UBlackboardOperatorBase
{ 
public:
	FGameplayTag                                       Key;                                                        // 0x0038   (0x0008)  
	class UClass*                                      ModifyValueSource;                                          // 0x0040   (0x0008)  
	int32_t                                            ModifyValue;                                                // 0x0048   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x004C   (0x0004)  MISSED
};

/// Class /Script/MFQuestSystem.IntArrayMapRemoveValue
/// Size: 0x0010 (16 bytes) (0x000038 - 0x000048) align 8 pad: 0x0000
class UIntArrayMapRemoveValue : public UBlackboardOperatorBase
{ 
public:
	FGameplayTag                                       Key;                                                        // 0x0038   (0x0008)  
	int32_t                                            RemoveIndex;                                                // 0x0040   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0044   (0x0004)  MISSED
};

/// Class /Script/MFQuestSystem.ObjectArrayMapAddUnique
/// Size: 0x0010 (16 bytes) (0x000038 - 0x000048) align 8 pad: 0x0000
class UObjectArrayMapAddUnique : public UBlackboardOperatorBase
{ 
public:
	FGameplayTag                                       Key;                                                        // 0x0038   (0x0008)  
	class UClass*                                      TargetContextSource;                                        // 0x0040   (0x0008)  
};

/// Class /Script/MFQuestSystem.ObjectArrayMapEmpty
/// Size: 0x0008 (8 bytes) (0x000038 - 0x000040) align 8 pad: 0x0000
class UObjectArrayMapEmpty : public UBlackboardOperatorBase
{ 
public:
	FGameplayTag                                       Key;                                                        // 0x0038   (0x0008)  
};

/// Class /Script/MFQuestSystem.MFQuestEffectBase
/// Size: 0x0010 (16 bytes) (0x000028 - 0x000038) align 8 pad: 0x0000
class UMFQuestEffectBase : public UObject
{ 
public:
	SDK_UNDEFINED(16,2343) /* FMulticastInlineDelegate */ __um(OnGenerateDebugInfo);                               // 0x0028   (0x0010)  
};

/// Class /Script/MFQuestSystem.MFQuestEffect_ModifyBlackboard
/// Size: 0x0010 (16 bytes) (0x000038 - 0x000048) align 8 pad: 0x0000
class UMFQuestEffect_ModifyBlackboard : public UMFQuestEffectBase
{ 
public:
	TArray<class UBlackboardOperatorBase*>             BlackboardOperators;                                        // 0x0038   (0x0010)  
};

/// Class /Script/MFQuestSystem.MFQuestEndNode
/// Size: 0x0008 (8 bytes) (0x000058 - 0x000060) align 8 pad: 0x0000
class UMFQuestEndNode : public UMFQuestNode
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0058   (0x0008)  MISSED


	/// Functions
	// Function /Script/MFQuestSystem.MFQuestEndNode.GetFinalNodeQuestStatus
	// EQuestStatus GetFinalNodeQuestStatus();                                                                                  // [0x1982640] Native|Public        
};

/// Class /Script/MFQuestSystem.MFQuestEventManager
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFQuestEventManager : public UObject
{ 
public:
};

/// Class /Script/MFQuestSystem.MFQuestInstigatorComponentBase
/// Size: 0x0008 (8 bytes) (0x000100 - 0x000108) align 8 pad: 0x0000
class UMFQuestInstigatorComponentBase : public UMFQuestComponentBase
{ 
public:
	bool                                               bLogToClient;                                               // 0x0100   (0x0001)  
	EQuestInstigatorType                               InstigatorType;                                             // 0x0101   (0x0001)  
	unsigned char                                      UnknownData00_7[0x6];                                       // 0x0102   (0x0006)  MISSED


	/// Functions
	// Function /Script/MFQuestSystem.MFQuestInstigatorComponentBase.IsObjectiveInstigatorSupported
	// bool IsObjectiveInstigatorSupported(class AActor* InQuestInstigator);                                                    // [0x16a5c90] Native|Event|Public|BlueprintEvent|Const 
	// Function /Script/MFQuestSystem.MFQuestInstigatorComponentBase.GetQuestInstigatorType
	// EQuestInstigatorType GetQuestInstigatorType();                                                                           // [0x197bba0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFQuestSystem.MFQuestInstigatorComponentBase.ClientSetQuestDistInfos
	// void ClientSetQuestDistInfos(TArray<FString> Infos);                                                                     // [0x2f2db50] Net|Native|Event|Public|NetClient 
};

/// Class /Script/MFQuestSystem.MFQuestManagerActor
/// Size: 0x0010 (16 bytes) (0x0002E0 - 0x0002F0) align 8 pad: 0x0000
class AMFQuestManagerActor : public AActor
{ 
public:
	TArray<class UMFQuestNodeGraph*>                   QuestGraphList;                                             // 0x02E0   (0x0010)  


	/// Functions
	// Function /Script/MFQuestSystem.MFQuestManagerActor.GetQuestNodeGraphFromPC
	// void GetQuestNodeGraphFromPC(class APlayerController* InOwnerPC, TArray<UMFQuestNodeGraph*>& InGraphList);               // [0x2f2e720] Native|Public|HasOutParms 
	// Function /Script/MFQuestSystem.MFQuestManagerActor.CreateNewQuestGraph
	// class UMFQuestNodeGraph* CreateNewQuestGraph(class AController* InOwnerController);                                      // [0x2f2e040] Native|Public        
};

/// Class /Script/MFQuestSystem.MFQuestManagerComponent
/// Size: 0x0010 (16 bytes) (0x0000F8 - 0x000108) align 8 pad: 0x0000
class UMFQuestManagerComponent : public UActorComponent
{ 
public:
	class UClass*                                      QuestManagerActorClass;                                     // 0x00F8   (0x0008)  
	class AMFQuestManagerActor*                        QuestManagerActor;                                          // 0x0100   (0x0008)  


	/// Functions
	// Function /Script/MFQuestSystem.MFQuestManagerComponent.GetQuestManagerActor
	// class AMFQuestManagerActor* GetQuestManagerActor();                                                                      // [0x2f2e650] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestManagerComponent.CreateQuestManagerActor
	// class AMFQuestManagerActor* CreateQuestManagerActor();                                                                   // [0x2f2e200] Final|Native|Private 
};

/// Class /Script/MFQuestSystem.MFQuestNodeGraph
/// Size: 0x0088 (136 bytes) (0x000028 - 0x0000B0) align 8 pad: 0x0000
class UMFQuestNodeGraph : public UObject
{ 
public:
	SDK_UNDEFINED(16,2344) /* FMulticastInlineDelegate */ __um(OnGraphStatusChange);                               // 0x0028   (0x0010)  
	bool                                               bOwnedQuestStateChanged;                                    // 0x0038   (0x0001)  
	bool                                               bCompleteInOneBattle;                                       // 0x0039   (0x0001)  
	bool                                               bIsActTask;                                                 // 0x003A   (0x0001)  
	unsigned char                                      UnknownData00_6[0x5];                                       // 0x003B   (0x0005)  MISSED
	TArray<class UMFQuestNode*>                        NodeList;                                                   // 0x0040   (0x0010)  
	TArray<class UMFQuestAffiliateNode*>               QuestAffiliateNodeList;                                     // 0x0050   (0x0010)  
	TArray<class AMFQuestBase*>                        QuestList;                                                  // 0x0060   (0x0010)  
	class UMFQuestStartNode*                           StartNode;                                                  // 0x0070   (0x0008)  
	class UMFQuestEndNode*                             EndNode;                                                    // 0x0078   (0x0008)  
	int32_t                                            CustomIndex;                                                // 0x0080   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0084   (0x0004)  MISSED
	class AController*                                 OwnerController;                                            // 0x0088   (0x0008)  
	unsigned char                                      UnknownData02_6[0x8];                                       // 0x0090   (0x0008)  MISSED
	TArray<class UMFQuestNode*>                        CheckNodeArray;                                             // 0x0098   (0x0010)  
	unsigned char                                      UnknownData03_7[0x8];                                       // 0x00A8   (0x0008)  MISSED


	/// Functions
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.TickQuestNodeGraph
	// void TickQuestNodeGraph();                                                                                               // [0x2f2ef30] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.SetOwnerController
	// void SetOwnerController(class AController* InPC);                                                                        // [0x2f2ed90] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.SetIsCompleteInOneBattle
	// void SetIsCompleteInOneBattle(bool In);                                                                                  // [0x2f2ed00] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.SetIsActTask
	// void SetIsActTask(bool In);                                                                                              // [0x2f2ec70] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.SetCustomIndex
	// void SetCustomIndex(int32_t InIndex);                                                                                    // [0x2f2eb50] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.NodeGraphCheck
	// void NodeGraphCheck(class AMFQuestBase* QuestBase);                                                                      // [0x2f2ea10] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.GetQuestNodeFromNodeQuest
	// class UMFQuestNode* GetQuestNodeFromNodeQuest(class AMFQuestBase* InQuest);                                              // [0x2f2e680] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.GetQuestFromCustomIndex
	// class AMFQuestBase* GetQuestFromCustomIndex(int32_t InIndex);                                                            // [0x2f2e5b0] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.GetOwnerController
	// class AController* GetOwnerController();                                                                                 // [0x2f2e500] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.GetIsCompleteInOneBattle
	// bool GetIsCompleteInOneBattle();                                                                                         // [0x2f2e420] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.GetIsActTask
	// bool GetIsActTask();                                                                                                     // [0x2f2e3f0] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.GetEndNode
	// class UMFQuestEndNode* GetEndNode();                                                                                     // [0x18d1750] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.GetCustomIndex
	// int32_t GetCustomIndex();                                                                                                // [0x2e0d3b0] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.GetAllQuest
	// void GetAllQuest(TArray<AMFQuestBase*>& InQuestList);                                                                    // [0x2f2e2f0] Final|Native|Public|HasOutParms 
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.DestroyGraph
	// void DestroyGraph();                                                                                                     // [0x2f2e2d0] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.DeactivateQuestNodeGraph
	// void DeactivateQuestNodeGraph();                                                                                         // [0x2f2e2b0] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.CreateNewQuestNode
	// void CreateNewQuestNode(class AMFQuestBase* InNewQuest, EQuestNodeConnectionType InType, bool InFailedWhenAndParallelNodeFailed); // [0x2f2e0e0] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.CreateNewQuestCheckNode
	// void CreateNewQuestCheckNode(class AMFQuestBase* InNewQuest, EQuestNodeConnectionType InType, bool InFailedWhenAndParallelNodeFailed, bool InSuccessWhenParallelNodeSuccess); // [0x2f2dee0] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.CreateNewQuestAssembleNode
	// void CreateNewQuestAssembleNode(class AMFQuestBase* InNewQuest, EQuestNodeConnectionType InType, bool InFailedWhenAndParallelNodeFailed); // [0x2f2ddc0] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.CreateNewQuestAffiliateNode
	// void CreateNewQuestAffiliateNode(class AMFQuestBase* InNewQuest, EQuestNodeConnectionType InType, bool InFailedWhenAndParallelNodeFailed); // [0x2f2dca0] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.CompleteQuestNodeGraph
	// void CompleteQuestNodeGraph(EQuestNodeConnectionType InType);                                                            // [0x2f2dc20] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.BuildQuestNodeRelation
	// void BuildQuestNodeRelation(class AMFQuestBase* TargetNodeQuest, TArray<AMFQuestBase*> PrevNodeQuestList);               // [0x2f2d910] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.BeginGraph
	// void BeginGraph();                                                                                                       // [0x2f2d8f0] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestNodeGraph.ActivateQuestNodeGraph
	// void ActivateQuestNodeGraph();                                                                                           // [0x2f2d8d0] Final|Native|Public  
};

/// Struct /Script/MFQuestSystem.QuestContextPairConfig
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FQuestContextPairConfig
{ 
	class UClass*                                      ContextSourceClass;                                         // 0x0000   (0x0008)  
	class UClass*                                      ContextClass;                                               // 0x0008   (0x0008)  
};

/// Struct /Script/MFQuestSystem.QuestContextPair
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FQuestContextPair
{ 
	class UMFQuestContextSourceBase*                   ContextSource;                                              // 0x0000   (0x0008)  
	class UMFQuestContextBase*                         Context;                                                    // 0x0008   (0x0008)  
};

/// Class /Script/MFQuestSystem.MFQuestObjectiveComponentBase
/// Size: 0x0068 (104 bytes) (0x000100 - 0x000168) align 8 pad: 0x0000
class UMFQuestObjectiveComponentBase : public UMFQuestComponentBase
{ 
public:
	SDK_UNDEFINED(16,2345) /* FMulticastInlineDelegate */ __um(OnObjectiveStateChanged);                           // 0x0100   (0x0010)  
	TArray<FQuestContextPairConfig>                    QuestContextPairConfigList;                                 // 0x0110   (0x0010)  
	EQuestObjectiveType                                QuestObjectiveType;                                         // 0x0120   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0121   (0x0007)  MISSED
	TArray<class UMFQuestConditionComponentBase*>      AndObjectiveConditionList;                                  // 0x0128   (0x0010)  
	TArray<class UMFQuestConditionComponentBase*>      OrObjectiveConditionList;                                   // 0x0138   (0x0010)  
	class UMFQuestProgressComponentBase*               QuestProgress;                                              // 0x0148   (0x0008)  
	bool                                               FailWhenAchieved;                                           // 0x0150   (0x0001)  
	EQuestStatus                                       CurrQuestCompStatus;                                        // 0x0151   (0x0001)  
	unsigned char                                      UnknownData01_6[0x6];                                       // 0x0152   (0x0006)  MISSED
	TArray<FQuestContextPair>                          QuestContextList;                                           // 0x0158   (0x0010)  


	/// Functions
	// Function /Script/MFQuestSystem.MFQuestObjectiveComponentBase.SetQuestCompStatus
	// void SetQuestCompStatus(EQuestStatus InNewStatus);                                                                       // [0x2f31a90] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestObjectiveComponentBase.SetObjectiveProgress
	// void SetObjectiveProgress(int32_t MaxCount, int32_t CurrCount);                                                          // [0x2f319c0] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestObjectiveComponentBase.SetBringInObjectiveProgress
	// void SetBringInObjectiveProgress(int32_t MaxCount, int32_t CurrCount);                                                   // [0x2f318f0] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestObjectiveComponentBase.OnQuestProgressedChanged
	// void OnQuestProgressedChanged(int32_t ProgressToAdd, int32_t CurrentProgress);                                           // [0x2f315e0] Final|Native|Protected 
	// Function /Script/MFQuestSystem.MFQuestObjectiveComponentBase.IsQuestCompActive
	// bool IsQuestCompActive();                                                                                                // [0x2a26420] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestObjectiveComponentBase.IsFailWhenAchieved
	// bool IsFailWhenAchieved();                                                                                               // [0x2a01f00] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestObjectiveComponentBase.GetQuestObjectiveType
	// EQuestObjectiveType GetQuestObjectiveType();                                                                             // [0x2f31200] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestObjectiveComponentBase.GetQuestCompStatus
	// EQuestStatus GetQuestCompStatus();                                                                                       // [0x28e91f0] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestObjectiveComponentBase.GetOrConditionList
	// TArray<UMFQuestConditionComponentBase*> GetOrConditionList();                                                            // [0x2f31060] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestObjectiveComponentBase.GetObjectiveProgress
	// void GetObjectiveProgress(int32_t& Out_MaxCount, int32_t& Out_CurrCount);                                                // [0x2f30f80] Native|Public|HasOutParms 
	// Function /Script/MFQuestSystem.MFQuestObjectiveComponentBase.GetMaxObjectiveProgress
	// int32_t GetMaxObjectiveProgress();                                                                                       // [0x28f6350] Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFQuestSystem.MFQuestObjectiveComponentBase.GetBringInObjectiveProgress
	// int32_t GetBringInObjectiveProgress();                                                                                   // [0x2f30e00] Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFQuestSystem.MFQuestObjectiveComponentBase.GetAndConditionList
	// TArray<UMFQuestConditionComponentBase*> GetAndConditionList();                                                           // [0x2f30d80] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestObjectiveComponentBase.GetActivationTime
	// float GetActivationTime();                                                                                               // [0x2f30d60] Final|Native|Public  
	// Function /Script/MFQuestSystem.MFQuestObjectiveComponentBase.ClearCurrQuestProgress
	// void ClearCurrQuestProgress();                                                                                           // [0x2f30c70] Final|Native|Public  
};

/// Class /Script/MFQuestSystem.MFQuestPrimaryConditionBase
/// Size: 0x0050 (80 bytes) (0x000028 - 0x000078) align 8 pad: 0x0000
class UMFQuestPrimaryConditionBase : public UObject
{ 
public:
	SDK_UNDEFINED(16,2346) /* FMulticastInlineDelegate */ __um(OnTriggerPrimaryCondition);                         // 0x0028   (0x0010)  
	SDK_UNDEFINED(16,2347) /* FMulticastInlineDelegate */ __um(OnGenerateDebugInfo);                               // 0x0038   (0x0010)  
	TArray<FQuestContextPairConfig>                    QuestContextPairConfigList;                                 // 0x0048   (0x0010)  
	class UQuestConditionEffectContainer*              ConditionEffectContainer;                                   // 0x0058   (0x0008)  
	class AMFQuestDistributerBase*                     QuestDistributer;                                           // 0x0060   (0x0008)  
	TArray<FQuestContextPair>                          QuestContextList;                                           // 0x0068   (0x0010)  


	/// Functions
	// Function /Script/MFQuestSystem.MFQuestPrimaryConditionBase.RemoveEventListener
	// void RemoveEventListener();                                                                                              // [0x1da19a0] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestPrimaryConditionBase.Initialize
	// void Initialize(class UQuestConditionEffectContainer* InConditionEffectContainer, class AMFQuestDistributerBase* InQuestDistributer); // [0x2f31220] Native|Public        
	// Function /Script/MFQuestSystem.MFQuestPrimaryConditionBase.AddEventListener
	// void AddEventListener();                                                                                                 // [0x1da1da0] Native|Public        
};

/// Class /Script/MFQuestSystem.MFQuestPrimaryCondition_IntMapChanged
/// Size: 0x0000 (0 bytes) (0x000078 - 0x000078) align 8 pad: 0x0000
class UMFQuestPrimaryCondition_IntMapChanged : public UMFQuestPrimaryConditionBase
{ 
public:


	/// Functions
	// Function /Script/MFQuestSystem.MFQuestPrimaryCondition_IntMapChanged.OnBlackboardIntMapChanged
	// void OnBlackboardIntMapChanged(class AActor* ObjectiveInstigator, class AActor* TargetActor, FGameplayTag& Key, int32_t CurrentValue, int32_t PreviousValue); // [0x2f312f0] Final|Native|Public|HasOutParms 
};

/// Class /Script/MFQuestSystem.MFQuestPrimaryCondition_ObjArrMapChanged
/// Size: 0x0000 (0 bytes) (0x000078 - 0x000078) align 8 pad: 0x0000
class UMFQuestPrimaryCondition_ObjArrMapChanged : public UMFQuestPrimaryConditionBase
{ 
public:


	/// Functions
	// Function /Script/MFQuestSystem.MFQuestPrimaryCondition_ObjArrMapChanged.OnBlackboardObjectArrayMapChanged
	// void OnBlackboardObjectArrayMapChanged(class AActor* TargetActor, FGameplayTag& Key, TArray<UObject*>& ObjectArray);     // [0x2f314a0] Final|Native|Public|HasOutParms 
};

/// Class /Script/MFQuestSystem.MFQuestProgressComponentBase
/// Size: 0x0018 (24 bytes) (0x000100 - 0x000118) align 8 pad: 0x0000
class UMFQuestProgressComponentBase : public UMFQuestComponentBase
{ 
public:
	int32_t                                            BringInProgress;                                            // 0x0100   (0x0004)  
	int32_t                                            CurrProgress;                                               // 0x0104   (0x0004)  
	int32_t                                            MaxProgress;                                                // 0x0108   (0x0004)  
	int32_t                                            OldProgress;                                                // 0x010C   (0x0004)  
	bool                                               bClearWhenFail;                                             // 0x0110   (0x0001)  
	bool                                               bCanBringInProgress;                                        // 0x0111   (0x0001)  
	unsigned char                                      UnknownData00_7[0x6];                                       // 0x0112   (0x0006)  MISSED


	/// Functions
	// Function /Script/MFQuestSystem.MFQuestProgressComponentBase.OnReq_MaxProgress
	// void OnReq_MaxProgress();                                                                                                // [0x2861f90] Native|Protected     
	// Function /Script/MFQuestSystem.MFQuestProgressComponentBase.OnReq_CurrProgress
	// void OnReq_CurrProgress();                                                                                               // [0x28617c0] Native|Protected     
	// Function /Script/MFQuestSystem.MFQuestProgressComponentBase.IsQuestProgressFinished
	// bool IsQuestProgressFinished();                                                                                          // [0x28e4930] Native|Public        
};

/// Class /Script/MFQuestSystem.MFQuestProgressComp_Count
/// Size: 0x0018 (24 bytes) (0x000118 - 0x000130) align 8 pad: 0x0000
class UMFQuestProgressComp_Count : public UMFQuestProgressComponentBase
{ 
public:
	int32_t                                            ProgressUnit;                                               // 0x0118   (0x0004)  
	int32_t                                            CachedProgress;                                             // 0x011C   (0x0004)  
	bool                                               bReachMaxNotComplete;                                       // 0x0120   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0121   (0x0003)  MISSED
	int32_t                                            OneBattleMaxAddProgress;                                    // 0x0124   (0x0004)  
	int32_t                                            OneBattleAddedProgress;                                     // 0x0128   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x012C   (0x0004)  MISSED
};

/// Class /Script/MFQuestSystem.MFQuestStartNode
/// Size: 0x0008 (8 bytes) (0x000058 - 0x000060) align 8 pad: 0x0000
class UMFQuestStartNode : public UMFQuestNode
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0058   (0x0008)  MISSED
};

/// Class /Script/MFQuestSystem.MFQuestStatics
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFQuestStatics : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/MFQuestSystem.MFQuestStatics.RunQuest
	// void RunQuest(class AMFQuestBase* InQuest, class AActor* InInsitigator, bool bGiveUpOldQuest, FLatentActionInfo LatentInfo, ERunQuestResult& RunResult); // [0x2f31730] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFQuestSystem.MFQuestStatics.ResetQuest
	// void ResetQuest(class AMFQuestBase* InQuest);                                                                            // [0x2f316b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFQuestSystem.MFQuestStatics.GetQuestManagerComponent
	// class UMFQuestManagerComponent* GetQuestManagerComponent(class UObject* WorldContextObject);                             // [0x2f31170] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFQuestSystem.MFQuestStatics.GetQuestManagerActor
	// class AMFQuestManagerActor* GetQuestManagerActor(class UObject* WorldContextObject);                                     // [0x2f310e0] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFQuestSystem.MFQuestStatics.GetCompareResult
	// bool GetCompareResult(int64_t CheckNum, ENumberCompareType CompareType, int64_t Value1, int64_t Value2);                 // [0x2f30e30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFQuestSystem.MFQuestStatics.CreateNewQuestFromClass
	// class AMFQuestBase* CreateNewQuestFromClass(class UObject* WorldContextObject, class UClass* InQuestClass);              // [0x2f30c90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFQuestSystem.MFQuestStatics.AssignQuestInstigator
	// void AssignQuestInstigator(class AMFQuestBase* InQuest, class AActor* InInstigator, bool bGiveUpOldQuest);               // [0x2f30b70] Final|Native|Static|Public|BlueprintCallable 
};

/// Struct /Script/MFQuestSystem.QuestDistributerBlackboard
/// Size: 0x0140 (320 bytes) (0x000000 - 0x000140) align 8 pad: 0x0000
struct FQuestDistributerBlackboard
{ 
	SDK_UNDEFINED(80,2348) /* TMap<FGameplayTag, int32_t> */ __um(IntMap);                                         // 0x0000   (0x0050)  
	SDK_UNDEFINED(80,2349) /* TMap<FGameplayTag, FNestedIntArray> */ __um(IntArrayMap);                            // 0x0050   (0x0050)  
	SDK_UNDEFINED(80,2350) /* TMap<FGameplayTag, FNestedObjectArray> */ __um(ObjectArrayMap);                      // 0x00A0   (0x0050)  
	SDK_UNDEFINED(80,2351) /* TMap<FGameplayTag, UObject*> */ __um(ObjectMap);                                     // 0x00F0   (0x0050)  
};

/// Struct /Script/MFQuestSystem.NestedObjectArray
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FNestedObjectArray
{ 
	TArray<class UObject*>                             ObjectArray;                                                // 0x0000   (0x0010)  
};

/// Struct /Script/MFQuestSystem.NestedIntArray
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FNestedIntArray
{ 
	TArray<int32_t>                                    IntArray;                                                   // 0x0000   (0x0010)  
};

/// Struct /Script/MFQuestSystem.QuestGraphConnection
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 4 pad: 0x0000
struct FQuestGraphConnection
{ 
	unsigned char                                      UnknownData00_2[0x8];                                       // 0x0000   (0x0008)  MISSED
};

static_assert(sizeof(UMFQuestComponentBase) == 0x0100); // 256 bytes (0x0000F8 - 0x000100)
static_assert(sizeof(UMFQuestActionComponentBase) == 0x0100); // 256 bytes (0x000100 - 0x000100)
static_assert(sizeof(UMFBPQuestActionComponentBase) == 0x0100); // 256 bytes (0x000100 - 0x000100)
static_assert(sizeof(UMFQuestActivationComponentBase) == 0x0100); // 256 bytes (0x000100 - 0x000100)
static_assert(sizeof(UMFQuestActivationComp_TriggerVolume) == 0x0108); // 264 bytes (0x000100 - 0x000108)
static_assert(sizeof(UMFQuestNode) == 0x0058); // 88 bytes (0x000028 - 0x000058)
static_assert(sizeof(UMFQuestAffiliateNode) == 0x0058); // 88 bytes (0x000058 - 0x000058)
static_assert(sizeof(UMFQuestAssembleNode) == 0x0068); // 104 bytes (0x000058 - 0x000068)
static_assert(sizeof(FQuestState) == 0x0002); // 2 bytes (0x000000 - 0x000002)
static_assert(sizeof(AMFQuestBase) == 0x03C0); // 960 bytes (0x0002E0 - 0x0003C0)
static_assert(sizeof(UMFQuestCheckNode) == 0x0060); // 96 bytes (0x000058 - 0x000060)
static_assert(sizeof(UCheckActorParamBase) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UCheckActorClass) == 0x0050); // 80 bytes (0x000028 - 0x000050)
static_assert(sizeof(UCheckActorLocation) == 0x0038); // 56 bytes (0x000028 - 0x000038)
static_assert(sizeof(UMFQuestConditionComponentBase) == 0x0050); // 80 bytes (0x000028 - 0x000050)
static_assert(sizeof(UMFQuestConditionComp_CheckActorProperty) == 0x0068); // 104 bytes (0x000050 - 0x000068)
static_assert(sizeof(UCheckBlackboardBase) == 0x0030); // 48 bytes (0x000028 - 0x000030)
static_assert(sizeof(UCheckIntMapValue) == 0x0048); // 72 bytes (0x000030 - 0x000048)
static_assert(sizeof(UCheckIntArrayMapNum) == 0x0048); // 72 bytes (0x000030 - 0x000048)
static_assert(sizeof(UCheckObjectArrayMapNum) == 0x0048); // 72 bytes (0x000030 - 0x000048)
static_assert(sizeof(UMFQuestConditionComp_CheckBlackboard) == 0x0060); // 96 bytes (0x000050 - 0x000060)
static_assert(sizeof(UMFQuestConditionComp_Dist) == 0x0068); // 104 bytes (0x000050 - 0x000068)
static_assert(sizeof(UMFQuestConditionComp_RandomProbability) == 0x0058); // 88 bytes (0x000050 - 0x000058)
static_assert(sizeof(UMFQuestContextBase) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFQuestContext_Actor) == 0x0030); // 48 bytes (0x000028 - 0x000030)
static_assert(sizeof(UMFQuestContext_GameplayTag) == 0x0030); // 48 bytes (0x000028 - 0x000030)
static_assert(sizeof(UMFQuestContext_Number) == 0x0038); // 56 bytes (0x000028 - 0x000038)
static_assert(sizeof(UMFQuestContext_Object) == 0x0030); // 48 bytes (0x000028 - 0x000030)
static_assert(sizeof(UMFQuestContextSourceBase) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFQuestContextSource_BlackboardKey) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFQuestContextSource_BlackboardTarget) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFQuestContextSource_CurrentValue) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFQuestContextSource_ObjectiveInstigator) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFQuestContextSource_ObjectiveTarget) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFQuestContextSource_PreviousValue) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFQuestContextSource_QuestDistributer) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UQuestConditionEffectContainer) == 0x0068); // 104 bytes (0x000028 - 0x000068)
static_assert(sizeof(AMFQuestDistributerBase) == 0x0380); // 896 bytes (0x0002E0 - 0x000380)
static_assert(sizeof(UBlackboardOperatorBase) == 0x0038); // 56 bytes (0x000028 - 0x000038)
static_assert(sizeof(UIntMapAddValue) == 0x0050); // 80 bytes (0x000038 - 0x000050)
static_assert(sizeof(UIntMapSetValue) == 0x0050); // 80 bytes (0x000038 - 0x000050)
static_assert(sizeof(UIntArrayMapAddValue) == 0x0050); // 80 bytes (0x000038 - 0x000050)
static_assert(sizeof(UIntArrayMapRemoveValue) == 0x0048); // 72 bytes (0x000038 - 0x000048)
static_assert(sizeof(UObjectArrayMapAddUnique) == 0x0048); // 72 bytes (0x000038 - 0x000048)
static_assert(sizeof(UObjectArrayMapEmpty) == 0x0040); // 64 bytes (0x000038 - 0x000040)
static_assert(sizeof(UMFQuestEffectBase) == 0x0038); // 56 bytes (0x000028 - 0x000038)
static_assert(sizeof(UMFQuestEffect_ModifyBlackboard) == 0x0048); // 72 bytes (0x000038 - 0x000048)
static_assert(sizeof(UMFQuestEndNode) == 0x0060); // 96 bytes (0x000058 - 0x000060)
static_assert(sizeof(UMFQuestEventManager) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFQuestInstigatorComponentBase) == 0x0108); // 264 bytes (0x000100 - 0x000108)
static_assert(sizeof(AMFQuestManagerActor) == 0x02F0); // 752 bytes (0x0002E0 - 0x0002F0)
static_assert(sizeof(UMFQuestManagerComponent) == 0x0108); // 264 bytes (0x0000F8 - 0x000108)
static_assert(sizeof(UMFQuestNodeGraph) == 0x00B0); // 176 bytes (0x000028 - 0x0000B0)
static_assert(sizeof(FQuestContextPairConfig) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FQuestContextPair) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(UMFQuestObjectiveComponentBase) == 0x0168); // 360 bytes (0x000100 - 0x000168)
static_assert(sizeof(UMFQuestPrimaryConditionBase) == 0x0078); // 120 bytes (0x000028 - 0x000078)
static_assert(sizeof(UMFQuestPrimaryCondition_IntMapChanged) == 0x0078); // 120 bytes (0x000078 - 0x000078)
static_assert(sizeof(UMFQuestPrimaryCondition_ObjArrMapChanged) == 0x0078); // 120 bytes (0x000078 - 0x000078)
static_assert(sizeof(UMFQuestProgressComponentBase) == 0x0118); // 280 bytes (0x000100 - 0x000118)
static_assert(sizeof(UMFQuestProgressComp_Count) == 0x0130); // 304 bytes (0x000118 - 0x000130)
static_assert(sizeof(UMFQuestStartNode) == 0x0060); // 96 bytes (0x000058 - 0x000060)
static_assert(sizeof(UMFQuestStatics) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FQuestDistributerBlackboard) == 0x0140); // 320 bytes (0x000000 - 0x000140)
static_assert(sizeof(FNestedObjectArray) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FNestedIntArray) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FQuestGraphConnection) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(offsetof(UMFQuestComponentBase, OwnerQuest) == 0x00F8);
static_assert(offsetof(UMFQuestActivationComp_TriggerVolume, TriggerVolume) == 0x0100);
static_assert(offsetof(UMFQuestAssembleNode, QuestAffiliateNodeArray) == 0x0058);
static_assert(offsetof(FQuestState, CurrQuestStatus) == 0x0000);
static_assert(offsetof(FQuestState, OldQuestStatus) == 0x0001);
static_assert(offsetof(AMFQuestBase, ActionComponents) == 0x0330);
static_assert(offsetof(AMFQuestBase, LevelUnrelatedActionComponents) == 0x0340);
static_assert(offsetof(AMFQuestBase, ActivationComponents) == 0x0350);
static_assert(offsetof(AMFQuestBase, ObjectiveComponent) == 0x0368);
static_assert(offsetof(AMFQuestBase, QuestStatus) == 0x0380);
static_assert(offsetof(AMFQuestBase, QuestFailedType) == 0x0382);
static_assert(offsetof(AMFQuestBase, AssembleCustomIndexList) == 0x0388);
static_assert(offsetof(AMFQuestBase, QuestTemplateParams) == 0x0398);
static_assert(offsetof(AMFQuestBase, CacheCharacter) == 0x03B8);
static_assert(offsetof(UCheckActorLocation, Center) == 0x0028);
static_assert(offsetof(UMFQuestConditionComponentBase, OwnerQuest) == 0x0038);
static_assert(offsetof(UMFQuestConditionComponentBase, ConditionType) == 0x0041);
static_assert(offsetof(UMFQuestConditionComponentBase, CheckType) == 0x0042);
static_assert(offsetof(UMFQuestConditionComponentBase, CustomTickTimerHandle) == 0x0048);
static_assert(offsetof(UMFQuestConditionComp_CheckActorProperty, CheckTargetContextSource) == 0x0050);
static_assert(offsetof(UMFQuestConditionComp_CheckActorProperty, CheckParams) == 0x0058);
static_assert(offsetof(UCheckBlackboardBase, TargetActor) == 0x0028);
static_assert(offsetof(UCheckIntMapValue, Key) == 0x0030);
static_assert(offsetof(UCheckIntMapValue, CompareType) == 0x0038);
static_assert(offsetof(UCheckIntArrayMapNum, Key) == 0x0030);
static_assert(offsetof(UCheckIntArrayMapNum, CompareType) == 0x0038);
static_assert(offsetof(UCheckObjectArrayMapNum, Key) == 0x0030);
static_assert(offsetof(UCheckObjectArrayMapNum, CompareType) == 0x0038);
static_assert(offsetof(UMFQuestConditionComp_CheckBlackboard, CheckParams) == 0x0050);
static_assert(offsetof(UMFQuestConditionComp_Dist, SourceActorContextConfig) == 0x0050);
static_assert(offsetof(UMFQuestConditionComp_Dist, DestActorContextConfig) == 0x0058);
static_assert(offsetof(UMFQuestContext_Actor, ContextActor) == 0x0028);
static_assert(offsetof(UMFQuestContext_Object, Object) == 0x0028);
static_assert(offsetof(UQuestConditionEffectContainer, QuestDistributer) == 0x0028);
static_assert(offsetof(UQuestConditionEffectContainer, PrimaryCondition) == 0x0030);
static_assert(offsetof(UQuestConditionEffectContainer, SubConditions) == 0x0038);
static_assert(offsetof(UQuestConditionEffectContainer, QuestEffects) == 0x0048);
static_assert(offsetof(UQuestConditionEffectContainer, FailQuestEffects) == 0x0058);
static_assert(offsetof(AMFQuestDistributerBase, QuestType) == 0x02E0);
static_assert(offsetof(AMFQuestDistributerBase, QuestConditionEffectContainers) == 0x02E8);
static_assert(offsetof(AMFQuestDistributerBase, LastTriggerCharacter) == 0x0378);
static_assert(offsetof(UBlackboardOperatorBase, TargetActor) == 0x0028);
static_assert(offsetof(UIntMapAddValue, Key) == 0x0038);
static_assert(offsetof(UIntMapAddValue, ModifyValueSource) == 0x0040);
static_assert(offsetof(UIntMapSetValue, Key) == 0x0038);
static_assert(offsetof(UIntMapSetValue, ValueSource) == 0x0040);
static_assert(offsetof(UIntArrayMapAddValue, Key) == 0x0038);
static_assert(offsetof(UIntArrayMapAddValue, ModifyValueSource) == 0x0040);
static_assert(offsetof(UIntArrayMapRemoveValue, Key) == 0x0038);
static_assert(offsetof(UObjectArrayMapAddUnique, Key) == 0x0038);
static_assert(offsetof(UObjectArrayMapAddUnique, TargetContextSource) == 0x0040);
static_assert(offsetof(UObjectArrayMapEmpty, Key) == 0x0038);
static_assert(offsetof(UMFQuestEffect_ModifyBlackboard, BlackboardOperators) == 0x0038);
static_assert(offsetof(UMFQuestInstigatorComponentBase, InstigatorType) == 0x0101);
static_assert(offsetof(AMFQuestManagerActor, QuestGraphList) == 0x02E0);
static_assert(offsetof(UMFQuestManagerComponent, QuestManagerActorClass) == 0x00F8);
static_assert(offsetof(UMFQuestManagerComponent, QuestManagerActor) == 0x0100);
static_assert(offsetof(UMFQuestNodeGraph, NodeList) == 0x0040);
static_assert(offsetof(UMFQuestNodeGraph, QuestAffiliateNodeList) == 0x0050);
static_assert(offsetof(UMFQuestNodeGraph, QuestList) == 0x0060);
static_assert(offsetof(UMFQuestNodeGraph, StartNode) == 0x0070);
static_assert(offsetof(UMFQuestNodeGraph, EndNode) == 0x0078);
static_assert(offsetof(UMFQuestNodeGraph, OwnerController) == 0x0088);
static_assert(offsetof(UMFQuestNodeGraph, CheckNodeArray) == 0x0098);
static_assert(offsetof(FQuestContextPairConfig, ContextSourceClass) == 0x0000);
static_assert(offsetof(FQuestContextPairConfig, ContextClass) == 0x0008);
static_assert(offsetof(FQuestContextPair, ContextSource) == 0x0000);
static_assert(offsetof(FQuestContextPair, Context) == 0x0008);
static_assert(offsetof(UMFQuestObjectiveComponentBase, QuestContextPairConfigList) == 0x0110);
static_assert(offsetof(UMFQuestObjectiveComponentBase, QuestObjectiveType) == 0x0120);
static_assert(offsetof(UMFQuestObjectiveComponentBase, AndObjectiveConditionList) == 0x0128);
static_assert(offsetof(UMFQuestObjectiveComponentBase, OrObjectiveConditionList) == 0x0138);
static_assert(offsetof(UMFQuestObjectiveComponentBase, QuestProgress) == 0x0148);
static_assert(offsetof(UMFQuestObjectiveComponentBase, CurrQuestCompStatus) == 0x0151);
static_assert(offsetof(UMFQuestObjectiveComponentBase, QuestContextList) == 0x0158);
static_assert(offsetof(UMFQuestPrimaryConditionBase, QuestContextPairConfigList) == 0x0048);
static_assert(offsetof(UMFQuestPrimaryConditionBase, ConditionEffectContainer) == 0x0058);
static_assert(offsetof(UMFQuestPrimaryConditionBase, QuestDistributer) == 0x0060);
static_assert(offsetof(UMFQuestPrimaryConditionBase, QuestContextList) == 0x0068);
static_assert(offsetof(FNestedObjectArray, ObjectArray) == 0x0000);
static_assert(offsetof(FNestedIntArray, IntArray) == 0x0000);
