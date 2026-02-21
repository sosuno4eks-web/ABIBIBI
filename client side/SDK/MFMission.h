
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: MFGlobalEventParameterTags

/// Enum /Script/MFMission.EMissionTimeLimitType
/// Size: 0x01 (1 bytes)
enum class EMissionTimeLimitType : uint8_t
{
	EMissionTimeLimitType__None                                                      = 0,
	EMissionTimeLimitType__EnterGame                                                 = 1,
	EMissionTimeLimitType__TimeRecord                                                = 2
};

/// Enum /Script/MFMission.EMissionFlowConnectionType
/// Size: 0x01 (1 bytes)
enum class EMissionFlowConnectionType : uint8_t
{
	EMissionFlowConnectionType__ProgressChanged                                      = 0,
	EMissionFlowConnectionType__StatusSucceed                                        = 1,
	EMissionFlowConnectionType__StatusFailed                                         = 2
};

/// Enum /Script/MFMission.EMFMissionFlowTextKeyOperation
/// Size: 0x01 (1 bytes)
enum class EMFMissionFlowTextKeyOperation : uint8_t
{
	EMFMissionFlowTextKeyOperation__Equal                                            = 0,
	EMFMissionFlowTextKeyOperation__NotEqual                                         = 1,
	EMFMissionFlowTextKeyOperation__Contain                                          = 2,
	EMFMissionFlowTextKeyOperation__NotContain                                       = 3
};

/// Enum /Script/MFMission.EMFMissionFlowArithmeticKeyOperation
/// Size: 0x01 (1 bytes)
enum class EMFMissionFlowArithmeticKeyOperation : uint8_t
{
	EMFMissionFlowArithmeticKeyOperation__Equal                                      = 0,
	EMFMissionFlowArithmeticKeyOperation__NotEqual                                   = 1,
	EMFMissionFlowArithmeticKeyOperation__Less                                       = 2,
	EMFMissionFlowArithmeticKeyOperation__LessOrEqual                                = 3,
	EMFMissionFlowArithmeticKeyOperation__Greater                                    = 4,
	EMFMissionFlowArithmeticKeyOperation__GreaterOrEqual                             = 5
};

/// Enum /Script/MFMission.EMFMissionFlowBasicKeyOperation
/// Size: 0x01 (1 bytes)
enum class EMFMissionFlowBasicKeyOperation : uint8_t
{
	EMFMissionFlowBasicKeyOperation__Set                                             = 0,
	EMFMissionFlowBasicKeyOperation__NotSet                                          = 1
};

/// Enum /Script/MFMission.EMissionFlowCompleteType
/// Size: 0x01 (1 bytes)
enum class EMissionFlowCompleteType : uint8_t
{
	EMissionFlowCompleteType__OneBattle                                              = 0,
	EMissionFlowCompleteType__MultipleBattle                                         = 1
};

/// Enum /Script/MFMission.EMissionFlowType
/// Size: 0x01 (1 bytes)
enum class EMissionFlowType : uint8_t
{
	EMissionFlowType__Normal                                                         = 0,
	EMissionFlowType__Activity                                                       = 1
};

/// Enum /Script/MFMission.EMissionFlowNodeStatus
/// Size: 0x01 (1 bytes)
enum class EMissionFlowNodeStatus : uint8_t
{
	EMissionFlowNodeStatus__Inactive                                                 = 0,
	EMissionFlowNodeStatus__Active                                                   = 1
};

/// Enum /Script/MFMission.EMissionFlowNodeType
/// Size: 0x01 (1 bytes)
enum class EMissionFlowNodeType : uint8_t
{
	EMissionFlowNodeType__BaseNode                                                   = 0,
	EMissionFlowNodeType__CheckNode                                                  = 1,
	EMissionFlowNodeType__RelationNode                                               = 2,
	EMissionFlowNodeType__AssembleNode                                               = 3,
	EMissionFlowNodeType__AffiliateNode                                              = 4,
	EMissionFlowNodeType__BehaviorNode                                               = 5
};

/// Enum /Script/MFMission.EMissionObjectiveConditionCheckType
/// Size: 0x01 (1 bytes)
enum class EMissionObjectiveConditionCheckType : uint8_t
{
	EMissionObjectiveConditionCheckType__And                                         = 0,
	EMissionObjectiveConditionCheckType__Or                                          = 1
};

/// Enum /Script/MFMission.EMissionRelatedTeamType
/// Size: 0x01 (1 bytes)
enum class EMissionRelatedTeamType : uint8_t
{
	EMissionRelatedTeamType__TargetTeammateOnly                                      = 0,
	EMissionRelatedTeamType__RandomTeam                                              = 1
};

/// Enum /Script/MFMission.EMissionRelatedTargetType
/// Size: 0x01 (1 bytes)
enum class EMissionRelatedTargetType : uint8_t
{
	EMissionRelatedTargetType__TargetOnly                                            = 0,
	EMissionRelatedTargetType__TargetTeammateOnly                                    = 1,
	EMissionRelatedTargetType__RandomTeam                                            = 2,
	EMissionRelatedTargetType__AllPMC                                                = 3,
	EMissionRelatedTargetType__AllSCAV                                               = 4
};

/// Enum /Script/MFMission.EMissionCompareType
/// Size: 0x01 (1 bytes)
enum class EMissionCompareType : uint8_t
{
	EMissionCompareType__CMP_None                                                    = 0,
	EMissionCompareType__CMP_Equals                                                  = 1,
	EMissionCompareType__CMP_NotEqual                                                = 2,
	EMissionCompareType__CMP_Greater                                                 = 3,
	EMissionCompareType__CMP_Less                                                    = 4,
	EMissionCompareType__CMP_GreaterEqual                                            = 5,
	EMissionCompareType__CMP_LessEqual                                               = 6,
	EMissionCompareType__CMP_Between                                                 = 7
};

/// Enum /Script/MFMission.EMissionInstigatorType
/// Size: 0x01 (1 bytes)
enum class EMissionInstigatorType : uint8_t
{
	EMissionInstigatorType__None                                                     = 0,
	EMissionInstigatorType__Individual                                               = 1,
	EMissionInstigatorType__Team                                                     = 2,
	EMissionInstigatorType__Public                                                   = 3
};

/// Enum /Script/MFMission.EMissionConditionCheckType
/// Size: 0x01 (1 bytes)
enum class EMissionConditionCheckType : uint8_t
{
	EMissionConditionCheckType__Event                                                = 0,
	EMissionConditionCheckType__Tick                                                 = 1,
	EMissionConditionCheckType__Both                                                 = 2
};

/// Enum /Script/MFMission.EMissionConditionType
/// Size: 0x01 (1 bytes)
enum class EMissionConditionType : uint8_t
{
	EMissionConditionType__Keeping                                                   = 0,
	EMissionConditionType__Filter                                                    = 1
};

/// Enum /Script/MFMission.EMissionFailedType
/// Size: 0x01 (1 bytes)
enum class EMissionFailedType : uint8_t
{
	EMissionFailedType__Normal                                                       = 0,
	EMissionFailedType__TimeOut                                                      = 1
};

/// Enum /Script/MFMission.EMissionHelpType
/// Size: 0x01 (1 bytes)
enum class EMissionHelpType : uint8_t
{
	EMissionHelpType__Alone                                                          = 0,
	EMissionHelpType__Teammate                                                       = 1,
	EMissionHelpType__Anyone                                                         = 2
};

/// Enum /Script/MFMission.EMissionDataType
/// Size: 0x01 (1 bytes)
enum class EMissionDataType : uint8_t
{
	EMissionDataType__Person                                                         = 0,
	EMissionDataType__Team                                                           = 1,
	EMissionDataType__Faction                                                        = 2,
	EMissionDataType__World                                                          = 3
};

/// Enum /Script/MFMission.ERunMissionResult
/// Size: 0x01 (1 bytes)
enum class ERunMissionResult : uint8_t
{
	ERunMissionResult__Success                                                       = 0,
	ERunMissionResult__Failed                                                        = 1
};

/// Enum /Script/MFMission.EMissionStatus
/// Size: 0x01 (1 bytes)
enum class EMissionStatus : uint8_t
{
	EMissionStatus__Inactive                                                         = 0,
	EMissionStatus__InProcess                                                        = 1,
	EMissionStatus__Success                                                          = 2,
	EMissionStatus__Failed                                                           = 3
};

/// Enum /Script/MFMission.EMFMissionDataChangeType
/// Size: 0x01 (1 bytes)
enum class EMFMissionDataChangeType : uint8_t
{
	EMFMissionDataChangeType__MissionFlowStatus                                      = 0,
	EMFMissionDataChangeType__MissionStatus                                          = 1,
	EMFMissionDataChangeType__CurProgress                                            = 2,
	EMFMissionDataChangeType__RemainTime                                             = 3
};

/// Class /Script/MFMission.MFMission
/// Size: 0x0008 (8 bytes) (0x000028 - 0x000030) align 8 pad: 0x0000
class UMFMission : public UObject
{ 
public:
	class UMFMissionObjective*                         Objective;                                                  // 0x0028   (0x0008)  


	/// Functions
	// Function /Script/MFMission.MFMission.GetObjective
	// class UMFMissionObjective* GetObjective();                                                                               // [0x1426870] Final|Native|Public  
};

/// Class /Script/MFMission.MFMissionNode
/// Size: 0x0018 (24 bytes) (0x000028 - 0x000040) align 8 pad: 0x0000
class UMFMissionNode : public UObject
{ 
public:
	class UMFMission*                                  Mission;                                                    // 0x0028   (0x0008)  
	class UMFMissionFlowNode*                          MissionFlowNode;                                            // 0x0030   (0x0008)  
	FMFGlobalEventParameterTag                         InstigatorTag;                                              // 0x0038   (0x0008)  


	/// Functions
	// Function /Script/MFMission.MFMissionNode.ShowLog
	// void ShowLog(FString LogStr, bool bImportant);                                                                           // [0x16b1a00] Final|Native|Public  
	// Function /Script/MFMission.MFMissionNode.OnMissionStatusChanged
	// void OnMissionStatusChanged(class UMFMissionFlowComponent* InInstigator, EMissionStatus NewStatus, EMissionStatus OldStatus); // [0x16b17e0] Native|Public        
	// Function /Script/MFMission.MFMissionNode.OnMissionProgressChanged
	// void OnMissionProgressChanged(class UMFMissionFlowComponent* InInstigator, int32_t NewProgress, int32_t OldProgress);    // [0x16b16e0] Native|Public        
	// Function /Script/MFMission.MFMissionNode.InitializeNode
	// void InitializeNode(class UMFMissionFlowNode* InNode);                                                                   // [0x16b15d0] Native|Public        
	// Function /Script/MFMission.MFMissionNode.GetMissionName
	// FString GetMissionName();                                                                                                // [0x16b14c0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionNode.GetMissionIndex
	// int32_t GetMissionIndex();                                                                                               // [0x16b1490] Final|Native|Public  
	// Function /Script/MFMission.MFMissionNode.GetMissionFlowNode
	// class UMFMissionFlowNode* GetMissionFlowNode();                                                                          // [0x16b1470] Final|Native|Public  
	// Function /Script/MFMission.MFMissionNode.GetMissionFlowName
	// FString GetMissionFlowName();                                                                                            // [0x16b13f0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionNode.GetMissionFlowIndex
	// int32_t GetMissionFlowIndex();                                                                                           // [0x16b13c0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionNode.GetMissionFlow
	// class UMFMissionFlow* GetMissionFlow();                                                                                  // [0x16b1300] Final|Native|Public  
	// Function /Script/MFMission.MFMissionNode.GetMission
	// class UMFMission* GetMission();                                                                                          // [0x1426870] Final|Native|Public  
	// Function /Script/MFMission.MFMissionNode.ExecuteNode
	// void ExecuteNode(class UMFMissionFlowComponent* InInstigator);                                                           // [0x16b0bd0] Native|Public        
	// Function /Script/MFMission.MFMissionNode.DestroyNode
	// void DestroyNode();                                                                                                      // [0x16b0bb0] Native|Public        
	// Function /Script/MFMission.MFMissionNode.DeactivateNode
	// void DeactivateNode(class UMFMissionFlowComponent* InInstigator, EMissionStatus& InStatus);                              // [0x16b0ad0] Native|Public|HasOutParms 
	// Function /Script/MFMission.MFMissionNode.ActivateNode
	// void ActivateNode(class UMFMissionFlowComponent* InInstigator);                                                          // [0x16b0a40] Native|Public        
};

/// Class /Script/MFMission.MFMissionAction
/// Size: 0x0008 (8 bytes) (0x000040 - 0x000048) align 8 pad: 0x0000
class UMFMissionAction : public UMFMissionNode
{ 
public:
	class UMFMissionObjective*                         Objective;                                                  // 0x0040   (0x0008)  
};

/// Class /Script/MFMission.MFMissionCondition
/// Size: 0x0010 (16 bytes) (0x000040 - 0x000050) align 8 pad: 0x0000
class UMFMissionCondition : public UMFMissionNode
{ 
public:
	class UMFMissionObjective*                         Objective;                                                  // 0x0040   (0x0008)  
	bool                                               bEqualCondition;                                            // 0x0048   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0049   (0x0007)  MISSED
};

/// Struct /Script/MFMission.MFMissionFlowReplicateData
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 8 pad: 0x0000
struct FMFMissionFlowReplicateData
{ 
	class AActor*                                      Instigator;                                                 // 0x0000   (0x0008)  
	FString                                            MissionFlowName;                                            // 0x0008   (0x0010)  
	EMissionStatus                                     MissionFlowStatus;                                          // 0x0018   (0x0001)  
	EMissionStatus                                     OldMissionFlowStatus;                                       // 0x0019   (0x0001)  
	bool                                               bBeforeState;                                               // 0x001A   (0x0001)  
	unsigned char                                      UnknownData00_6[0x1];                                       // 0x001B   (0x0001)  MISSED
	float                                              StatusChangeTime;                                           // 0x001C   (0x0004)  
};

/// Struct /Script/MFMission.MFMissionReplicateData
/// Size: 0x0058 (88 bytes) (0x000000 - 0x000058) align 8 pad: 0x0000
struct FMFMissionReplicateData
{ 
	class AActor*                                      Instigator;                                                 // 0x0000   (0x0008)  
	FString                                            MissionName;                                                // 0x0008   (0x0010)  
	FString                                            MissionFlowName;                                            // 0x0018   (0x0010)  
	EMissionStatus                                     MissionStatus;                                              // 0x0028   (0x0001)  
	EMissionStatus                                     OldMissionStatus;                                           // 0x0029   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x002A   (0x0002)  MISSED
	int32_t                                            OldProgress;                                                // 0x002C   (0x0004)  
	int32_t                                            CurProgress;                                                // 0x0030   (0x0004)  
	float                                              RemainTime;                                                 // 0x0034   (0x0004)  
	float                                              RemainTimeUpdateServerTime;                                 // 0x0038   (0x0004)  
	bool                                               bFailWhenAchieved;                                          // 0x003C   (0x0001)  
	bool                                               bNeedReport;                                                // 0x003D   (0x0001)  
	bool                                               bNeedReportProgress;                                        // 0x003E   (0x0001)  
	unsigned char                                      UnknownData01_6[0x1];                                       // 0x003F   (0x0001)  MISSED
	TArray<FString>                                    AffiliateMissionList;                                       // 0x0040   (0x0010)  
	bool                                               bValid;                                                     // 0x0050   (0x0001)  
	unsigned char                                      UnknownData02_7[0x7];                                       // 0x0051   (0x0007)  MISSED
};

/// Class /Script/MFMission.MFMissionDataComponent
/// Size: 0x0110 (272 bytes) (0x0000F8 - 0x000208) align 8 pad: 0x0000
class UMFMissionDataComponent : public UActorComponent
{ 
public:
	SDK_UNDEFINED(80,584) /* TMap<TWeakObjectPtr<UMFMissionFlow*>, FMFMissionFlowInstanceData> */ __um(MissionFlowInstanceDataMap); // 0x00F8   (0x0050)  
	SDK_UNDEFINED(80,585) /* TMap<TWeakObjectPtr<UMFMissionFlowNode*>, FMFMissionFlowNodeInstanceData> */ __um(NodeInstanceDataMap); // 0x0148   (0x0050)  
	TArray<FMFMissionFlowReplicateData>                MissionFlowReplicateDatas;                                  // 0x0198   (0x0010)  
	TArray<FMFMissionReplicateData>                    MissionReplicateDatas;                                      // 0x01A8   (0x0010)  
	SDK_UNDEFINED(80,586) /* TMap<TWeakObjectPtr<UMFMissionFlow*>, FMFMissionFlowVariableInstanceData> */ __um(VariableInstanceDataMap); // 0x01B8   (0x0050)  


	/// Functions
	// Function /Script/MFMission.MFMissionDataComponent.SetMissionReplicateValid
	// void SetMissionReplicateValid(FString InMissionName, bool bValid);                                                       // [0x16a8420] Native|Public        
	// Function /Script/MFMission.MFMissionDataComponent.SetMissionReplicateStatus
	// void SetMissionReplicateStatus(FString InMissionName, int32_t InNewStatus, int32_t InOldStatus);                         // [0x16a82f0] Native|Public        
	// Function /Script/MFMission.MFMissionDataComponent.SetMissionReplicateRemainTime
	// void SetMissionReplicateRemainTime(FString InMissionName, float InRemainTime, float InRemainTimeUpdateServerTime);       // [0x16a81c0] Native|Public        
	// Function /Script/MFMission.MFMissionDataComponent.SetMissionReplicateCurProgress
	// void SetMissionReplicateCurProgress(FString InMissionName, int32_t InPorgress);                                          // [0x16a80e0] Native|Public        
	// Function /Script/MFMission.MFMissionDataComponent.SetMissionFlowReplicateStatusChangeTime
	// void SetMissionFlowReplicateStatusChangeTime(FString InMissionFlowName, int32_t InTime);                                 // [0x16a7e20] Native|Public        
	// Function /Script/MFMission.MFMissionDataComponent.SetMissionFlowReplicateStatus
	// void SetMissionFlowReplicateStatus(FString InMissionFlowName, int32_t InStatus);                                         // [0x16a7d40] Native|Public        
	// Function /Script/MFMission.MFMissionDataComponent.SetMissionFlowReplicateBeforeState
	// void SetMissionFlowReplicateBeforeState(FString InMissionFlowName, bool bBeforeState);                                   // [0x16a7c50] Native|Public        
	// Function /Script/MFMission.MFMissionDataComponent.ResetMissionReplicateData
	// void ResetMissionReplicateData(class UMFMissionFlowNode* InMissionFlowNode);                                             // [0x16a7350] Final|Native|Public  
	// Function /Script/MFMission.MFMissionDataComponent.ResetMissionFlowReplicateData
	// void ResetMissionFlowReplicateData(class UMFMissionFlow* InMissionFlow);                                                 // [0x16a71f0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionDataComponent.ResetMissionFlowNodeInstanceData
	// void ResetMissionFlowNodeInstanceData(class UMFMissionFlowNode* InMissionFlowNode);                                      // [0x16a7160] Native|Public        
	// Function /Script/MFMission.MFMissionDataComponent.ResetMissionFlowInstanceData
	// void ResetMissionFlowInstanceData(class UMFMissionFlow* InMissionFlow);                                                  // [0x16a70d0] Native|Public        
	// Function /Script/MFMission.MFMissionDataComponent.OnRep_MissionReplicateDatas
	// void OnRep_MissionReplicateDatas();                                                                                      // [0x16a6e40] Native|Protected     
	// Function /Script/MFMission.MFMissionDataComponent.OnRep_MissionFlowReplicateDatas
	// void OnRep_MissionFlowReplicateDatas();                                                                                  // [0x16a6e20] Native|Protected     
	// Function /Script/MFMission.MFMissionDataComponent.NotifyMissionReplicateDataChanged
	// void NotifyMissionReplicateDataChanged(EMFMissionDataChangeType InChangeType, FMFMissionReplicateData InMissionReplicateData, class ACharacter* InSharerCharacter); // [0x16a6940] Native|Public        
	// Function /Script/MFMission.MFMissionDataComponent.NotifyMissionInstanceDataChanged
	// void NotifyMissionInstanceDataChanged(EMFMissionDataChangeType InChangeType, FMFMissionFlowNodeInstanceData InMissionInstanceData); // [0x16a6800] Native|Public        
	// Function /Script/MFMission.MFMissionDataComponent.NotifyMissionFlowReplicateDataChanged
	// void NotifyMissionFlowReplicateDataChanged(EMFMissionDataChangeType InChangeType, FMFMissionFlowReplicateData InMissionFlowReplicateData); // [0x16a66a0] Native|Public        
	// Function /Script/MFMission.MFMissionDataComponent.MulticastMissionReplicateDataChanged
	// void MulticastMissionReplicateDataChanged(EMFMissionDataChangeType InChangeType, FMFMissionReplicateData InMissionReplicateData, class ACharacter* InSharerCharacter); // [0x16a6360] Net|Native|Event|NetMulticast|Public 
	// Function /Script/MFMission.MFMissionDataComponent.MulticastMissionFlowReplicateDataChanged
	// void MulticastMissionFlowReplicateDataChanged(EMFMissionDataChangeType InChangeType, FMFMissionFlowReplicateData InMissionFlowReplicateData, TArray<FMFMissionReplicateData> InMissionReplicateDataList); // [0x16a6140] Net|Native|Event|NetMulticast|Public 
	// Function /Script/MFMission.MFMissionDataComponent.InitQuestReplicateData
	// void InitQuestReplicateData(FString InMissionName, int32_t InCurPorgress);                                               // [0x16a5a60] Native|Public        
	// Function /Script/MFMission.MFMissionDataComponent.InitMissionReplicateData
	// void InitMissionReplicateData(class UMFMissionFlowNode* InMissionFlowNode, FMFMissionFlowNodeInstanceData& NodeInstanceData); // [0x16a5940] Final|Native|Public|HasOutParms 
	// Function /Script/MFMission.MFMissionDataComponent.InitMissionFlowReplicateData
	// void InitMissionFlowReplicateData(class UMFMissionFlow* InMissionFlow, FMFMissionFlowInstanceData& MissionFlowInstanceData); // [0x16a5850] Final|Native|Public|HasOutParms 
	// Function /Script/MFMission.MFMissionDataComponent.GetRefMissionReplicateData
	// FMFMissionReplicateData GetRefMissionReplicateData(class UMFMissionFlowNode* InMissionFlowNode);                         // [0x16a55b0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionDataComponent.GetRefMissionFlowReplicateDataByName
	// FMFMissionFlowReplicateData GetRefMissionFlowReplicateDataByName(FString InMissionFlowName);                             // [0x16a54d0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionDataComponent.GetRefMissionFlowReplicateData
	// FMFMissionFlowReplicateData GetRefMissionFlowReplicateData(class UMFMissionFlow* InMissionFlow);                         // [0x16a5400] Final|Native|Public  
	// Function /Script/MFMission.MFMissionDataComponent.GetRefMissionFlowNodeInstanceData
	// FMFMissionFlowNodeInstanceData GetRefMissionFlowNodeInstanceData(class UMFMissionFlowNode* InMissionFlowNode);           // [0x16a5330] Native|Public        
	// Function /Script/MFMission.MFMissionDataComponent.GetRefMissionFlowInstanceData
	// FMFMissionFlowInstanceData GetRefMissionFlowInstanceData(class UMFMissionFlow* InMissionFlow);                           // [0x16a5280] Native|Public        
	// Function /Script/MFMission.MFMissionDataComponent.GetMissionReplicateDatasByStatus
	// void GetMissionReplicateDatasByStatus(FString InMissionFlowName, TArray<EMissionStatus>& InStatusList, TArray<FMFMissionReplicateData>& OutDataList); // [0x16a4cc0] Final|Native|Public|HasOutParms 
	// Function /Script/MFMission.MFMissionDataComponent.GetMissionReplicateDatas
	// void GetMissionReplicateDatas(FString InMissionFlowName, TArray<FMFMissionReplicateData>& OutDataList);                  // [0x16a49d0] Final|Native|Public|HasOutParms 
	// Function /Script/MFMission.MFMissionDataComponent.GetMissionReplicateData
	// FMFMissionReplicateData GetMissionReplicateData(FString InMissionName);                                                  // [0x16a47a0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionDataComponent.GetMissionFlowReplicateData
	// FMFMissionFlowReplicateData GetMissionFlowReplicateData(FString InMissionFlowName);                                      // [0x16a4460] Final|Native|Public  
	// Function /Script/MFMission.MFMissionDataComponent.GetMissionFlowNodeInstanceData
	// FMFMissionFlowNodeInstanceData GetMissionFlowNodeInstanceData(class UMFMissionFlowNode* InMissionFlowNode);              // [0x16a4160] Native|Public        
	// Function /Script/MFMission.MFMissionDataComponent.GetMissionFlowInstanceData
	// FMFMissionFlowInstanceData GetMissionFlowInstanceData(class UMFMissionFlow* InMissionFlow);                              // [0x16a3df0] Native|Public        
	// Function /Script/MFMission.MFMissionDataComponent.GetAllMissionFlowReplicateDatas
	// TArray<FMFMissionFlowReplicateData> GetAllMissionFlowReplicateDatas();                                                   // [0x16a3610] Final|Native|Public  
	// Function /Script/MFMission.MFMissionDataComponent.ClientNotifyMissionReplicateDataChanged
	// void ClientNotifyMissionReplicateDataChanged(EMFMissionDataChangeType InChangeType, FMFMissionReplicateData InMissionReplicateData, class ACharacter* InSharerCharacter); // [0x16a3120] Net|NetReliableNative|Event|Public|NetClient 
	// Function /Script/MFMission.MFMissionDataComponent.ClientNotifyMissionFlowReplicateDataChanged
	// void ClientNotifyMissionFlowReplicateDataChanged(EMFMissionDataChangeType InChangeType, FMFMissionFlowReplicateData InMissionFlowReplicateData, TArray<FMFMissionReplicateData> InMissionReplicateDataList); // [0x16a2f00] Net|NetReliableNative|Event|Public|NetClient 
	// Function /Script/MFMission.MFMissionDataComponent.AddMissionReplicateData
	// void AddMissionReplicateData(FMFMissionReplicateData& InData);                                                           // [0x16a2860] Native|Public|HasOutParms 
	// Function /Script/MFMission.MFMissionDataComponent.AddMissionReplicateAffiliateIndex
	// void AddMissionReplicateAffiliateIndex(FString InAssembleMissionName, FString InAffiliateMissionName);                   // [0x16a2760] Native|Public        
	// Function /Script/MFMission.MFMissionDataComponent.AddMissionFlowReplicateData
	// void AddMissionFlowReplicateData(FMFMissionFlowReplicateData& InData);                                                   // [0x16a2580] Native|Public|HasOutParms 
	// Function /Script/MFMission.MFMissionDataComponent.Add_GetRefMissionFlowNodeInstanceData
	// FMFMissionFlowNodeInstanceData Add_GetRefMissionFlowNodeInstanceData(class UMFMissionFlowNode* InMissionFlowNode);       // [0x16a2bf0] Native|Public        
	// Function /Script/MFMission.MFMissionDataComponent.Add_GetRefMissionFlowInstanceData
	// FMFMissionFlowInstanceData Add_GetRefMissionFlowInstanceData(class UMFMissionFlow* InMissionFlow);                       // [0x16a2b40] Native|Public        
};

/// Class /Script/MFMission.MFMissionDataInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFMissionDataInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFMission.MFMissionDataInterface.GetMissionDataComponent
	// class UMFMissionDataComponent* GetMissionDataComponent();                                                                // [0x16a3b10] Native|Public        
	// Function /Script/MFMission.MFMissionDataInterface.CreateMissionDataComponent
	// class UMFMissionDataComponent* CreateMissionDataComponent();                                                             // [0x16a3460] Native|Public        
};

/// Class /Script/MFMission.MFMissionFlow
/// Size: 0x0070 (112 bytes) (0x000028 - 0x000098) align 8 pad: 0x0000
class UMFMissionFlow : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0028   (0x0008)  MISSED
	class UWorld*                                      WorldPrivate;                                               // 0x0030   (0x0008)  
	class UMFMissionFlowNode_Start*                    StartNode;                                                  // 0x0038   (0x0008)  
	class UMFMissionFlowNode_End*                      EndNode;                                                    // 0x0040   (0x0008)  
	TArray<class UMFMissionFlowNode*>                  NodeList;                                                   // 0x0048   (0x0010)  
	SDK_UNDEFINED(16,587) /* TArray<TWeakObjectPtr<UMFMissionFlowComponent*>> */ __um(InstigatorList);             // 0x0058   (0x0010)  
	bool                                               bCustomName;                                                // 0x0068   (0x0001)  
	unsigned char                                      UnknownData01_6[0x7];                                       // 0x0069   (0x0007)  MISSED
	FString                                            MissionFlowName;                                            // 0x0070   (0x0010)  
	EMissionDataType                                   DataType;                                                   // 0x0080   (0x0001)  
	unsigned char                                      UnknownData02_6[0x3];                                       // 0x0081   (0x0003)  MISSED
	int32_t                                            LoopTimes;                                                  // 0x0084   (0x0004)  
	class UMFMissionFlowVariableData*                  VariableAsset;                                              // 0x0088   (0x0008)  
	EMissionFlowCompleteType                           CompleteType;                                               // 0x0090   (0x0001)  
	unsigned char                                      UnknownData03_7[0x7];                                       // 0x0091   (0x0007)  MISSED


	/// Functions
	// Function /Script/MFMission.MFMissionFlow.UnRegisterInstigator
	// void UnRegisterInstigator(class UMFMissionFlowComponent* InInstigator);                                                  // [0x16a8970] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.SetVariableAsset
	// void SetVariableAsset(class UMFMissionFlowVariableData* NewAsset);                                                       // [0x16a87c0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.SetStartNode
	// void SetStartNode(class UMFMissionFlowNode_Start* InStartNode);                                                          // [0x16a8730] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.SetMissionFlowName
	// void SetMissionFlowName(FString InName);                                                                                 // [0x16a7b60] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.SetEndNode
	// void SetEndNode(class UMFMissionFlowNode_End* InEndNode);                                                                // [0x16a7520] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.SetDataType
	// void SetDataType(EMissionDataType InType);                                                                               // [0x16a74a0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.SetCustomName
	// void SetCustomName(bool bFlag);                                                                                          // [0x16a7410] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.ResetNodeList
	// void ResetNodeList();                                                                                                    // [0x16a73e0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.RegisterInstigator
	// void RegisterInstigator(class UMFMissionFlowComponent* InInstigator, bool bReplicate);                                   // [0x16a6e60] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.OnMissionFlowStatusChange
	// void OnMissionFlowStatusChange(class UMFMissionFlowComponent* InInstigator, EMissionStatus InStatus);                    // [0x16a6c80] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.IsValidMissionFlow
	// bool IsValidMissionFlow();                                                                                               // [0x16a6050] Final|Native|Public|Const 
	// Function /Script/MFMission.MFMissionFlow.IsCustomName
	// bool IsCustomName();                                                                                                     // [0x16a5bd0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.InitializeMissionFlow
	// void InitializeMissionFlow(class UWorld* InWorld);                                                                       // [0x16a5b40] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.GetVariableAsset
	// class UMFMissionFlowVariableData* GetVariableAsset();                                                                    // [0x16a5670] Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFMission.MFMissionFlow.GetStartNode
	// class UMFMissionFlowNode_Start* GetStartNode();                                                                          // [0x16a5650] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.GetNodeList
	// TArray<UMFMissionFlowNode*> GetNodeList();                                                                               // [0x16a5120] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.GetMissionFlowNode
	// class UMFMissionFlowNode* GetMissionFlowNode(FString InName);                                                            // [0x16a40b0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.GetMissionFlowName
	// FString GetMissionFlowName();                                                                                            // [0x16a3ff0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.GetLoopTimes
	// int32_t GetLoopTimes();                                                                                                  // [0x16a39b0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.GetInstigatorList
	// TArray<TWeakObjectPtr<UMFMissionFlowComponent*>> GetInstigatorList();                                                    // [0x16a38d0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.GetEndNode
	// class UMFMissionFlowNode_End* GetEndNode();                                                                              // [0x16a38b0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.GetDataType
	// EMissionDataType GetDataType();                                                                                          // [0x16a3890] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.DestroyFlow
	// void DestroyFlow();                                                                                                      // [0x16a3560] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlow.AddNode
	// void AddNode(class UMFMissionFlowNode* InNode);                                                                          // [0x16a2990] Final|Native|Public  
};

/// Class /Script/MFMission.MFMissionFlowComponent
/// Size: 0x0148 (328 bytes) (0x0000F8 - 0x000240) align 8 pad: 0x0000
class UMFMissionFlowComponent : public UActorComponent
{ 
public:
	EMissionDataType                                   InstigatorType;                                             // 0x00F8   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x00F9   (0x0007)  MISSED
	SDK_UNDEFINED(80,588) /* TMap<FString, UMFMissionFlow*> */ __um(MissionFlowMap);                               // 0x0100   (0x0050)  
	SDK_UNDEFINED(80,589) /* TMap<EMissionDataType, UMFMissionDataComponent*> */ __um(DataComponentMap);           // 0x0150   (0x0050)  
	SDK_UNDEFINED(80,590) /* TMap<EMissionDataType, UMFMissionFlowComponent*> */ __um(AccessibleComponents);       // 0x01A0   (0x0050)  
	SDK_UNDEFINED(80,591) /* TMap<UMFMissionFlow*, FMFMissionFlowExecutingNodeConfig> */ __um(MissionFlowExecutingNodes); // 0x01F0   (0x0050)  


	/// Functions
	// Function /Script/MFMission.MFMissionFlowComponent.UpdateLastTriggerCharacter
	// void UpdateLastTriggerCharacter(class UMFMissionFlowNode* InMissionFlowNode, class ACharacter* InCharacter);             // [0x16a8a00] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.StopMissionFlow
	// void StopMissionFlow(class UMFMissionFlow* InMissionFlow);                                                               // [0x16a88e0] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.StartMissionFlow
	// void StartMissionFlow(class UMFMissionFlow* InMissionFlow);                                                              // [0x16a8850] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.SetNodeStatus
	// void SetNodeStatus(class UMFMissionFlowNode* InMissionFlowNode, EMissionFlowNodeStatus InStatus);                        // [0x16a8660] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.SetMissionStatus
	// void SetMissionStatus(class UMFMissionFlowNode* InMissionFlowNode, EMissionStatus InStatus, class ACharacter* InSharerCharacter, bool bExecuteNode); // [0x16a8510] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.SetMissionRemainTime
	// void SetMissionRemainTime(class UMFMissionFlowNode* InMissionFlowNode, float InRemainTime, float InRemainTimeUpdateServerTime); // [0x16a7fd0] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.SetMissionHasTryInteract
	// void SetMissionHasTryInteract(class UMFMissionFlowNode* InMissionFlowNode, bool bHasTry);                                // [0x16a7f00] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.SetMissionFlowLoopCount
	// void SetMissionFlowLoopCount(class UMFMissionFlow* InMissionFlow, int32_t InLoopCount);                                  // [0x16a7a90] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowComponent.SetMissionFlowLastTriggerCharacter
	// void SetMissionFlowLastTriggerCharacter(class UMFMissionFlow* InMissionFlow, class ACharacter* InCharacter);             // [0x16a79c0] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.SetMissionFlowBeforeState
	// void SetMissionFlowBeforeState(class UMFMissionFlow* InMissionFlow, bool bBeforeState);                                  // [0x16a78f0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowComponent.SetMissionFinishTime
	// void SetMissionFinishTime(class UMFMissionFlowNode* InMissionFlowNode, float InFinishTime);                              // [0x16a7820] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.SetMissionFailedType
	// void SetMissionFailedType(class UMFMissionFlowNode* InMissionFlowNode, EMissionFailedType FailedType);                   // [0x16a7750] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.SetMissionCurProgress
	// int32_t SetMissionCurProgress(class UMFMissionFlowNode* InMissionFlowNode, int32_t InPorgress, class ACharacter* InSharerCharacter); // [0x16a7630] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.SetInstigatorType
	// void SetInstigatorType(EMissionDataType InType);                                                                         // [0x16a75b0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowComponent.ResetMissionProgress
	// int32_t ResetMissionProgress(class UMFMissionFlowNode* InMissionFlowNode, class ACharacter* InSharerCharacter);          // [0x16a7280] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.ResetMissionFlow
	// void ResetMissionFlow(class UMFMissionFlow* InMissionFlow, bool bStartImmediately);                                      // [0x16a7000] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.RegisterMissionFlow
	// void RegisterMissionFlow(class UMFMissionFlow* InMissionFlow, bool bReplicate);                                          // [0x16a6f30] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.OnMissionFlowStatusChange
	// void OnMissionFlowStatusChange(class UMFMissionFlow* InMissionFlow, EMissionStatus InStatus);                            // [0x16a6d50] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.IsWorldMember
	// bool IsWorldMember(class UMFMissionFlowComponent* Other);                                                                // [0x16a60a0] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.IsTeamMember
	// bool IsTeamMember(class UMFMissionFlowComponent* Other);                                                                 // [0x16a5fb0] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.IsSameWorld
	// bool IsSameWorld(class UMFMissionFlowComponent* Other);                                                                  // [0x16a5f10] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.IsSameTeam
	// bool IsSameTeam(class UMFMissionFlowComponent* Other);                                                                   // [0x16a5e70] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.IsReachEndNotComplete
	// bool IsReachEndNotComplete(class UMFMissionFlowNode* InMissionFlowNode);                                                 // [0x16a5dd0] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.IsOwnerWorld
	// bool IsOwnerWorld(class UMFMissionFlowComponent* Other);                                                                 // [0x16a5d30] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.IsOwnerTeam
	// bool IsOwnerTeam(class UMFMissionFlowComponent* Other);                                                                  // [0x16a5c90] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.IsFailWhenAchieved
	// bool IsFailWhenAchieved(class UMFMissionFlowNode* InMissionFlowNode);                                                    // [0x16a5bf0] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.InitMissionEndProgress
	// int32_t InitMissionEndProgress(class UMFMissionFlowNode* InMissionFlowNode, int32_t InPorgress);                         // [0x16a5780] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.InitMissionCurProgress
	// int32_t InitMissionCurProgress(class UMFMissionFlowNode* InMissionFlowNode, int32_t InPorgress);                         // [0x16a56b0] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.GetNodeStatus
	// EMissionFlowNodeStatus GetNodeStatus(class UMFMissionFlowNode* InMissionFlowNode);                                       // [0x16a51e0] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.GetMissionStatus
	// EMissionStatus GetMissionStatus(class UMFMissionFlowNode* InMissionFlowNode);                                            // [0x16a5080] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.GetMissionReplicateDatasByStatus
	// void GetMissionReplicateDatasByStatus(FString InMissionFlowName, TArray<EMissionStatus>& InStatusList, TArray<FMFMissionReplicateData>& OutDataList); // [0x16a4ea0] Native|Public|HasOutParms 
	// Function /Script/MFMission.MFMissionFlowComponent.GetMissionReplicateDatas
	// void GetMissionReplicateDatas(FString InMissionFlowName, TArray<FMFMissionReplicateData>& OutDataList);                  // [0x16a4b40] Native|Public|HasOutParms 
	// Function /Script/MFMission.MFMissionFlowComponent.GetMissionReplicateData
	// FMFMissionReplicateData GetMissionReplicateData(FString InMissionName);                                                  // [0x16a48b0] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.GetMissionFlowStatusByName
	// bool GetMissionFlowStatusByName(FString InMissionFlowName, EMissionStatus& OutStatus);                                   // [0x16a46a0] Native|Public|HasOutParms 
	// Function /Script/MFMission.MFMissionFlowComponent.GetMissionFlowStatus
	// EMissionStatus GetMissionFlowStatus(class UMFMissionFlow* InMissionFlow);                                                // [0x16a4600] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.GetMissionFlowReplicateData
	// FMFMissionFlowReplicateData GetMissionFlowReplicateData(FString InMissionFlowName);                                      // [0x16a4530] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.GetMissionFlowNodeInstanceDataByName
	// FMFMissionFlowNodeInstanceData GetMissionFlowNodeInstanceDataByName(FString InMissionFlowName, FString InNodeName);      // [0x16a4320] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.GetMissionFlowNodeInstanceData
	// FMFMissionFlowNodeInstanceData GetMissionFlowNodeInstanceData(class UMFMissionFlowNode* InMissionFlowNode);              // [0x16a4240] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.GetMissionFlowLoopCount
	// int32_t GetMissionFlowLoopCount(class UMFMissionFlow* InMissionFlow);                                                    // [0x16a3f50] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowComponent.GetMissionFlowLastTriggerCharacter
	// class ACharacter* GetMissionFlowLastTriggerCharacter(class UMFMissionFlow* InMissionFlow);                               // [0x16a3eb0] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.GetMissionFlowComponent
	// class UMFMissionFlowComponent* GetMissionFlowComponent(EMissionDataType& InDataType);                                    // [0x16a3d40] Native|Public|HasOutParms|Const 
	// Function /Script/MFMission.MFMissionFlowComponent.GetMissionFlowByName
	// class UMFMissionFlow* GetMissionFlowByName(FString InMissionFlowName);                                                   // [0x16a3c90] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.GetMissionFinisTime
	// float GetMissionFinisTime(class UMFMissionFlowNode* InMissionFlowNode);                                                  // [0x16a3bf0] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.GetMissionDataComponent
	// class UMFMissionDataComponent* GetMissionDataComponent(EMissionDataType& InDataType);                                    // [0x16a3b40] Native|Public|HasOutParms|Const 
	// Function /Script/MFMission.MFMissionFlowComponent.GetMissionCurProgress
	// int32_t GetMissionCurProgress(class UMFMissionFlowNode* InMissionFlowNode);                                              // [0x16a3a70] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.GetMissionActivationTime
	// float GetMissionActivationTime(class UMFMissionFlowNode* InMissionFlowNode);                                             // [0x16a39d0] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.GetInstigatorType
	// EMissionDataType GetInstigatorType();                                                                                    // [0x16a3990] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowComponent.GetAllMissionFlowReplicateDatas
	// void GetAllMissionFlowReplicateDatas(TArray<FMFMissionFlowReplicateData>& OutDataList);                                  // [0x16a37b0] Native|Public|HasOutParms 
	// Function /Script/MFMission.MFMissionFlowComponent.ExecuteNode
	// void ExecuteNode(class UMFMissionFlowNode* InMissionFlowNode);                                                           // [0x16a3580] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.DeactivateNode
	// void DeactivateNode(class UMFMissionFlowNode* InMissionFlowNode, EMissionStatus InStatus);                               // [0x16a3490] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.ClientDebugInfos
	// void ClientDebugInfos(TArray<FString> InInfos);                                                                          // [0x16a2e30] Net|Native|Event|Public|NetClient 
	// Function /Script/MFMission.MFMissionFlowComponent.ClearMissionProgress
	// int32_t ClearMissionProgress(class UMFMissionFlowNode* InMissionFlowNode, class ACharacter* InSharerCharacter);          // [0x16a2d60] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.CheckMissionAchieved
	// bool CheckMissionAchieved(class UMFMissionFlowNode* InMissionFlowNode);                                                  // [0x16a2cc0] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.AddParentMissionProgress
	// int32_t AddParentMissionProgress(class UMFMissionFlowNode* InMissionFlowNode, int32_t InProgressToAdd, class ACharacter* InSharerCharacter); // [0x16a2a20] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.AddMissionProgress
	// int32_t AddMissionProgress(class UMFMissionFlowNode* InMissionFlowNode, int32_t InProgressToAdd, class ACharacter* InSharerCharacter); // [0x16a2640] Native|Public        
	// Function /Script/MFMission.MFMissionFlowComponent.ActivateNode
	// void ActivateNode(class UMFMissionFlowNode* InMissionFlowNode, EMissionStatus InStatus);                                 // [0x16a24b0] Native|Public        
};

/// Class /Script/MFMission.MFMissionFlowInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFMissionFlowInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFMission.MFMissionFlowInterface.GetMissionFlowComponent
	// class UMFMissionFlowComponent* GetMissionFlowComponent();                                                                // [0x16a3b10] Native|Public        
	// Function /Script/MFMission.MFMissionFlowInterface.CreateMissionFlowComponent
	// class UMFMissionFlowComponent* CreateMissionFlowComponent();                                                             // [0x16a3460] Native|Public        
};

/// Struct /Script/MFMission.MissionFlowConnection
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 8 pad: 0x0000
struct FMissionFlowConnection
{ 
	class UMFMissionFlowNode*                          ConnectNode;                                                // 0x0000   (0x0008)  
};

/// Struct /Script/MFMission.MissionFlowPrevConnection
/// Size: 0x0008 (8 bytes) (0x000008 - 0x000010) align 8 pad: 0x0000
struct FMissionFlowPrevConnection : FMissionFlowConnection
{ 
	EMissionFlowConnectionType                         PrevConnectionType;                                         // 0x0008   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0009   (0x0007)  MISSED
};

/// Class /Script/MFMission.MFMissionFlowNode
/// Size: 0x0118 (280 bytes) (0x000028 - 0x000140) align 8 pad: 0x0000
class UMFMissionFlowNode : public UObject
{ 
public:
	class UMFMissionFlow*                              MissionFlowAsset;                                           // 0x0028   (0x0008)  
	SDK_UNDEFINED(8,592) /* TWeakObjectPtr<UMFMissionFlowNode*> */ __um(ParentNode);                               // 0x0030   (0x0008)  
	TArray<FMissionFlowPrevConnection>                 PrevConnections;                                            // 0x0038   (0x0010)  
	SDK_UNDEFINED(80,593) /* TMap<char, FMissionFlowConnections> */ __um(NextConnectionsMap);                      // 0x0048   (0x0050)  
	TArray<FMissionFlowConnection>                     NextConnections;                                            // 0x0098   (0x0010)  
	TArray<FMissionFlowConnection>                     FailedConnections;                                          // 0x00A8   (0x0010)  
	SDK_UNDEFINED(16,594) /* TArray<TWeakObjectPtr<UMFMissionFlowComponent*>> */ __um(InstigatorList);             // 0x00B8   (0x0010)  
	bool                                               bCustomName;                                                // 0x00C8   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x00C9   (0x0007)  MISSED
	FString                                            MissionName;                                                // 0x00D0   (0x0010)  
	class UMFMissionObjective*                         Objective;                                                  // 0x00E0   (0x0008)  
	EMissionFlowNodeType                               NodeType;                                                   // 0x00E8   (0x0001)  
	unsigned char                                      UnknownData01_6[0x7];                                       // 0x00E9   (0x0007)  MISSED
	FString                                            NodeName;                                                   // 0x00F0   (0x0010)  
	EMissionDataType                                   DataType;                                                   // 0x0100   (0x0001)  
	unsigned char                                      UnknownData02_6[0x7];                                       // 0x0101   (0x0007)  MISSED
	SDK_UNDEFINED(40,595) /* TWeakObjectPtr<UClass*> */ __um(MissionClass);                                        // 0x0108   (0x0028)  
	EMissionHelpType                                   HelpType;                                                   // 0x0130   (0x0001)  
	EMissionCompareType                                CompareType;                                                // 0x0131   (0x0001)  
	unsigned char                                      UnknownData03_6[0x2];                                       // 0x0132   (0x0002)  MISSED
	int32_t                                            BeginProgress;                                              // 0x0134   (0x0004)  
	int32_t                                            EndProgress;                                                // 0x0138   (0x0004)  
	bool                                               bNeedReportProgress;                                        // 0x013C   (0x0001)  
	bool                                               bReachEndNotComplete;                                       // 0x013D   (0x0001)  
	bool                                               bFailWhenAchieved;                                          // 0x013E   (0x0001)  
	unsigned char                                      UnknownData04_7[0x1];                                       // 0x013F   (0x0001)  MISSED


	/// Functions
	// Function /Script/MFMission.MFMissionFlowNode.UnRegisterInstigator
	// void UnRegisterInstigator(class UMFMissionFlowComponent* InInstigator);                                                  // [0x16acc20] Native|Public        
	// Function /Script/MFMission.MFMissionFlowNode.ShowLog
	// void ShowLog(FString LogStr, bool bImportant);                                                                           // [0x16acb40] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowNode.SetParentNode
	// void SetParentNode(class UMFMissionFlowNode* InParentNode);                                                              // [0x16acab0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowNode.SetObjective
	// void SetObjective(class UMFMissionObjective* InObjective);                                                               // [0x16aca20] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowNode.SetMissionName
	// void SetMissionName(FString InName);                                                                                     // [0x16ac930] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowNode.SetCustomName
	// void SetCustomName(bool bFlag);                                                                                          // [0x16ac810] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowNode.RegisterInstigator
	// void RegisterInstigator(class UMFMissionFlowComponent* InInstigator, bool bReplicate);                                   // [0x16ac740] Native|Public        
	// Function /Script/MFMission.MFMissionFlowNode.OnMissionStatusChanged
	// void OnMissionStatusChanged(class UMFMissionFlowComponent* InInstigator, EMissionStatus NewStatus, EMissionStatus OldStatus); // [0x16ac630] Native|Public        
	// Function /Script/MFMission.MFMissionFlowNode.IsValidMission
	// bool IsValidMission();                                                                                                   // [0x16ac5d0] Final|Native|Public|Const 
	// Function /Script/MFMission.MFMissionFlowNode.IsCustomName
	// bool IsCustomName();                                                                                                     // [0x16ac5b0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowNode.HasPrevConnection
	// bool HasPrevConnection();                                                                                                // [0x16ac4c0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowNode.GetSucceedConnections
	// TArray<UMFMissionFlowNode*> GetSucceedConnections();                                                                     // [0x16ac440] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowNode.GetPrevConnections
	// TArray<UMFMissionFlowNode*> GetPrevConnections();                                                                        // [0x16ac2c0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowNode.GetParentNode
	// class UMFMissionFlowNode* GetParentNode();                                                                               // [0x16ac290] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowNode.GetObjective
	// class UMFMissionObjective* GetObjective();                                                                               // [0x16ac250] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowNode.GetNodeMissionStatus
	// EMissionStatus GetNodeMissionStatus(class UMFMissionFlowComponent* InInstigator);                                        // [0x16ac1b0] Native|Public        
	// Function /Script/MFMission.MFMissionFlowNode.GetMissionName
	// FString GetMissionName();                                                                                                // [0x16ac130] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowNode.GetMissionFlowName
	// FString GetMissionFlowName();                                                                                            // [0x16ac0b0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowNode.GetMissionFlow
	// class UMFMissionFlow* GetMissionFlow();                                                                                  // [0x1426870] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowNode.GetInstigatorList
	// TArray<TWeakObjectPtr<UMFMissionFlowComponent*>> GetInstigatorList();                                                    // [0x16abff0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowNode.GetFailedConnections
	// TArray<UMFMissionFlowNode*> GetFailedConnections();                                                                      // [0x16abf70] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowNode.GetDataType
	// EMissionDataType GetDataType();                                                                                          // [0x16abf40] Final|Native|Public|Const 
	// Function /Script/MFMission.MFMissionFlowNode.ExecuteNode
	// bool ExecuteNode(class UMFMissionFlowComponent* InInstigator);                                                           // [0x16abd60] Native|Public        
	// Function /Script/MFMission.MFMissionFlowNode.EnableActivate
	// bool EnableActivate(class UMFMissionFlowComponent* InInstigator, EMissionStatus ActivatorStatus);                        // [0x16abc90] Native|Public        
	// Function /Script/MFMission.MFMissionFlowNode.DestroyNode
	// void DestroyNode();                                                                                                      // [0xd909a0] Native|Public        
	// Function /Script/MFMission.MFMissionFlowNode.DeactivateNode
	// void DeactivateNode(class UMFMissionFlowComponent* InInstigator, EMissionStatus& InMissionStatus);                       // [0x16abbb0] Native|Public|HasOutParms 
	// Function /Script/MFMission.MFMissionFlowNode.DeactivateNextConnections
	// void DeactivateNextConnections(class UMFMissionFlowComponent* InInstigator, EMissionStatus& InMissionStatus, TArray<UMFMissionFlowNode*>& NextNodeList); // [0x16aba70] Native|Protected|HasOutParms 
	// Function /Script/MFMission.MFMissionFlowNode.AddPrevConnection
	// void AddPrevConnection(class UMFMissionFlowNode* InNode, char InConnectionType);                                         // [0x16ab9a0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowNode.AddNextConnection
	// void AddNextConnection(class UMFMissionFlowNode* InNode, char InConnectionType);                                         // [0x16ab8d0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowNode.ActivateNode
	// void ActivateNode(class UMFMissionFlowComponent* InInstigator, EMissionStatus ActivatorStatus);                          // [0x16ab770] Native|Public        
	// Function /Script/MFMission.MFMissionFlowNode.ActivateNextConnections
	// void ActivateNextConnections(class UMFMissionFlowComponent* InInstigator, EMissionStatus& InMissionStatus, TArray<UMFMissionFlowNode*>& NextNodeList); // [0x16ab630] Native|Protected|HasOutParms 
};

/// Class /Script/MFMission.MFMissionFlowNode_Affiliate
/// Size: 0x0000 (0 bytes) (0x000140 - 0x000140) align 8 pad: 0x0000
class UMFMissionFlowNode_Affiliate : public UMFMissionFlowNode
{ 
public:
};

/// Class /Script/MFMission.MFMissionFlowNode_Composite
/// Size: 0x0000 (0 bytes) (0x000140 - 0x000140) align 8 pad: 0x0000
class UMFMissionFlowNode_Composite : public UMFMissionFlowNode
{ 
public:
};

/// Class /Script/MFMission.MFMissionFlowNode_And
/// Size: 0x0000 (0 bytes) (0x000140 - 0x000140) align 8 pad: 0x0000
class UMFMissionFlowNode_And : public UMFMissionFlowNode_Composite
{ 
public:
};

/// Class /Script/MFMission.MFMissionFlowNode_Assemble
/// Size: 0x0010 (16 bytes) (0x000140 - 0x000150) align 8 pad: 0x0000
class UMFMissionFlowNode_Assemble : public UMFMissionFlowNode
{ 
public:
	TArray<class UMFMissionFlowNode_Affiliate*>        AffiliateNodeList;                                          // 0x0140   (0x0010)  


	/// Functions
	// Function /Script/MFMission.MFMissionFlowNode_Assemble.GetAffiliateNodes
	// void GetAffiliateNodes(TArray<UMFMissionFlowNode_Affiliate*>& OutAffiliateNodeList);                                     // [0x16abe90] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFMission.MFMissionFlowNode_Assemble.GetAffiliateNodeList
	// TArray<UMFMissionFlowNode_Affiliate*> GetAffiliateNodeList();                                                            // [0x16abe00] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMission.MFMissionFlowNode_Assemble.AddAffiliateNode
	// void AddAffiliateNode(class UMFMissionFlowNode_Affiliate* InMissionFlowNode);                                            // [0x16ab840] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFMission.MFMissionFlowNode_End
/// Size: 0x0000 (0 bytes) (0x000140 - 0x000140) align 8 pad: 0x0000
class UMFMissionFlowNode_End : public UMFMissionFlowNode
{ 
public:
};

/// Struct /Script/MFMission.MFMissionFlowVariableKeySelector
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 8 pad: 0x0000
struct FMFMissionFlowVariableKeySelector
{ 
	TArray<class UMFMissionFlowVariableKeyType*>       AllowedTypes;                                               // 0x0000   (0x0010)  
	FName                                              SelectedKeyName;                                            // 0x0010   (0x0008)  
	class UClass*                                      SelectedKeyType;                                            // 0x0018   (0x0008)  
	char                                               SelectedKeyID;                                              // 0x0020   (0x0001)  
	bool                                               bNoneIsAllowedValue;                                        // 0x0021   (0x0001)  
	unsigned char                                      UnknownData00_7[0x6];                                       // 0x0022   (0x0006)  MISSED
};

/// Class /Script/MFMission.MFMissionFlowNode_Variable
/// Size: 0x0028 (40 bytes) (0x000140 - 0x000168) align 8 pad: 0x0000
class UMFMissionFlowNode_Variable : public UMFMissionFlowNode
{ 
public:
	FMFMissionFlowVariableKeySelector                  VariableKey;                                                // 0x0140   (0x0028)  
};

/// Class /Script/MFMission.MFMissionFlowNode_IntVariable
/// Size: 0x0008 (8 bytes) (0x000168 - 0x000170) align 8 pad: 0x0000
class UMFMissionFlowNode_IntVariable : public UMFMissionFlowNode_Variable
{ 
public:
	int64_t                                            Value;                                                      // 0x0168   (0x0008)  
};

/// Class /Script/MFMission.MFMissionFlowNode_Mission
/// Size: 0x0000 (0 bytes) (0x000140 - 0x000140) align 8 pad: 0x0000
class UMFMissionFlowNode_Mission : public UMFMissionFlowNode
{ 
public:
};

/// Class /Script/MFMission.MFMissionFlowNode_MissionFlow
/// Size: 0x0008 (8 bytes) (0x000140 - 0x000148) align 8 pad: 0x0000
class UMFMissionFlowNode_MissionFlow : public UMFMissionFlowNode
{ 
public:
	class UMFMissionFlow*                              OwnMissionFlow;                                             // 0x0140   (0x0008)  


	/// Functions
	// Function /Script/MFMission.MFMissionFlowNode_MissionFlow.GetOwnMissionFlow
	// class UMFMissionFlow* GetOwnMissionFlow();                                                                               // [0x16ac270] Final|Native|Public  
};

/// Class /Script/MFMission.MFMissionFlowNode_ObjectVariable
/// Size: 0x0008 (8 bytes) (0x000168 - 0x000170) align 8 pad: 0x0000
class UMFMissionFlowNode_ObjectVariable : public UMFMissionFlowNode_Variable
{ 
public:
	class UObject*                                     Value;                                                      // 0x0168   (0x0008)  
};

/// Class /Script/MFMission.MFMissionFlowNode_Or
/// Size: 0x0000 (0 bytes) (0x000140 - 0x000140) align 8 pad: 0x0000
class UMFMissionFlowNode_Or : public UMFMissionFlowNode_Composite
{ 
public:
};

/// Struct /Script/MFMission.MissionFlowConnectionWeight
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 4 pad: 0x0000
struct FMissionFlowConnectionWeight
{ 
	char                                               Index;                                                      // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	int32_t                                            Weight;                                                     // 0x0004   (0x0004)  
};

/// Class /Script/MFMission.MFMissionFlowNode_Random
/// Size: 0x0018 (24 bytes) (0x000140 - 0x000158) align 8 pad: 0x0000
class UMFMissionFlowNode_Random : public UMFMissionFlowNode
{ 
public:
	TArray<FMissionFlowConnectionWeight>               NextConnectionWeights;                                      // 0x0140   (0x0010)  
	char                                               RandomTimes;                                                // 0x0150   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0151   (0x0007)  MISSED


	/// Functions
	// Function /Script/MFMission.MFMissionFlowNode_Random.SetDebugIndex
	// void SetDebugIndex(int32_t Index);                                                                                       // [0x16ac8a0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowNode_Random.InsertNextConnection
	// void InsertNextConnection(char InIndex, class UMFMissionFlowNode* InNode);                                               // [0x16ac4e0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionFlowNode_Random.GetRandomConnections
	// TArray<UMFMissionFlowNode*> GetRandomConnections(FMissionFlowConnections& InConnections);                                // [0x16ac340] Final|Native|Public|HasOutParms 
};

/// Class /Script/MFMission.MFMissionFlowNode_RotatorVariable
/// Size: 0x0010 (16 bytes) (0x000168 - 0x000178) align 8 pad: 0x0000
class UMFMissionFlowNode_RotatorVariable : public UMFMissionFlowNode_Variable
{ 
public:
	FRotator                                           Value;                                                      // 0x0168   (0x000C)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0174   (0x0004)  MISSED
};

/// Class /Script/MFMission.MFMissionFlowNode_Start
/// Size: 0x0000 (0 bytes) (0x000140 - 0x000140) align 8 pad: 0x0000
class UMFMissionFlowNode_Start : public UMFMissionFlowNode
{ 
public:
};

/// Class /Script/MFMission.MFMissionFlowNode_StringVariable
/// Size: 0x0010 (16 bytes) (0x000168 - 0x000178) align 8 pad: 0x0000
class UMFMissionFlowNode_StringVariable : public UMFMissionFlowNode_Variable
{ 
public:
	FString                                            Value;                                                      // 0x0168   (0x0010)  
};

/// Class /Script/MFMission.MFMissionFlowNode_VectorVariable
/// Size: 0x0010 (16 bytes) (0x000168 - 0x000178) align 8 pad: 0x0000
class UMFMissionFlowNode_VectorVariable : public UMFMissionFlowNode_Variable
{ 
public:
	FVector                                            Value;                                                      // 0x0168   (0x000C)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0174   (0x0004)  MISSED
};

/// Class /Script/MFMission.MFMissionFlowTypes
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFMissionFlowTypes : public UObject
{ 
public:
};

/// Class /Script/MFMission.MFMissionFlowVariableAssetProvider
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFMissionFlowVariableAssetProvider : public UInterface
{ 
public:
};

/// Struct /Script/MFMission.MFMissionFlowVariableEntry
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 8 pad: 0x0000
struct FMFMissionFlowVariableEntry
{ 
	FName                                              EntryName;                                                  // 0x0000   (0x0008)  
	class UMFMissionFlowVariableKeyType*               KeyType;                                                    // 0x0008   (0x0008)  
	bool                                               bInstanceSynced : 1;                                        // 0x0010:0 (0x0001)  
	unsigned char                                      UnknownData00_5[0x3];                                       // 0x0011   (0x0003)  MISSED
	FName                                              Category;                                                   // 0x0014   (0x0008)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x001C   (0x0004)  MISSED
};

/// Class /Script/MFMission.MFMissionFlowVariableData
/// Size: 0x0020 (32 bytes) (0x000030 - 0x000050) align 8 pad: 0x0000
class UMFMissionFlowVariableData : public UDataAsset
{ 
public:
	class UMFMissionFlowVariableData*                  Parent;                                                     // 0x0030   (0x0008)  
	TArray<FMFMissionFlowVariableEntry>                Keys;                                                       // 0x0038   (0x0010)  
	bool                                               bHasSynchronizedKeys : 1;                                   // 0x0048:0 (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0049   (0x0007)  MISSED
};

/// Class /Script/MFMission.MFMissionFlowVariableKeyType
/// Size: 0x0008 (8 bytes) (0x000028 - 0x000030) align 8 pad: 0x0000
class UMFMissionFlowVariableKeyType : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0028   (0x0008)  MISSED
};

/// Class /Script/MFMission.MFMissionVariableWriteBase
/// Size: 0x0028 (40 bytes) (0x000028 - 0x000050) align 8 pad: 0x0000
class UMFMissionVariableWriteBase : public UObject
{ 
public:
	FMFMissionFlowVariableKeySelector                  Key;                                                        // 0x0028   (0x0028)  


	/// Functions
	// Function /Script/MFMission.MFMissionVariableWriteBase.Write
	// void Write(class UMFMissionFlowComponent* Instigator);                                                                   // [0x16b1b70] Native|Public        
	// Function /Script/MFMission.MFMissionVariableWriteBase.GetOuterNode
	// class UMFMissionFlowNode* GetOuterNode();                                                                                // [0x16b1560] Final|Native|Public  
};

/// Class /Script/MFMission.MFMissionFlowVariableKeyType_Int
/// Size: 0x0000 (0 bytes) (0x000030 - 0x000030) align 8 pad: 0x0000
class UMFMissionFlowVariableKeyType_Int : public UMFMissionFlowVariableKeyType
{ 
public:
};

/// Class /Script/MFMission.MFMissionVariableWrite_Int
/// Size: 0x0008 (8 bytes) (0x000050 - 0x000058) align 8 pad: 0x0000
class UMFMissionVariableWrite_Int : public UMFMissionVariableWriteBase
{ 
public:
	int32_t                                            Value;                                                      // 0x0050   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0054   (0x0004)  MISSED
};

/// Class /Script/MFMission.MFMissionFlowVariableKeyType_Object
/// Size: 0x0008 (8 bytes) (0x000030 - 0x000038) align 8 pad: 0x0000
class UMFMissionFlowVariableKeyType_Object : public UMFMissionFlowVariableKeyType
{ 
public:
	class UClass*                                      BaseClass;                                                  // 0x0030   (0x0008)  
};

/// Class /Script/MFMission.MFMissionVariableWrite_Object
/// Size: 0x0008 (8 bytes) (0x000050 - 0x000058) align 8 pad: 0x0000
class UMFMissionVariableWrite_Object : public UMFMissionVariableWriteBase
{ 
public:
	class UObject*                                     Value;                                                      // 0x0050   (0x0008)  
};

/// Class /Script/MFMission.MFMissionFlowVariableKeyType_Rotator
/// Size: 0x0000 (0 bytes) (0x000030 - 0x000030) align 8 pad: 0x0000
class UMFMissionFlowVariableKeyType_Rotator : public UMFMissionFlowVariableKeyType
{ 
public:
};

/// Class /Script/MFMission.MFMissionVariableWrite_Rotator
/// Size: 0x0010 (16 bytes) (0x000050 - 0x000060) align 8 pad: 0x0000
class UMFMissionVariableWrite_Rotator : public UMFMissionVariableWriteBase
{ 
public:
	FRotator                                           Value;                                                      // 0x0050   (0x000C)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x005C   (0x0004)  MISSED
};

/// Class /Script/MFMission.MFMissionFlowVariableKeyType_String
/// Size: 0x0010 (16 bytes) (0x000030 - 0x000040) align 8 pad: 0x0000
class UMFMissionFlowVariableKeyType_String : public UMFMissionFlowVariableKeyType
{ 
public:
	FString                                            StringValue;                                                // 0x0030   (0x0010)  
};

/// Class /Script/MFMission.MFMissionVariableWrite_String
/// Size: 0x0010 (16 bytes) (0x000050 - 0x000060) align 8 pad: 0x0000
class UMFMissionVariableWrite_String : public UMFMissionVariableWriteBase
{ 
public:
	FString                                            Value;                                                      // 0x0050   (0x0010)  
};

/// Class /Script/MFMission.MFMissionFlowVariableKeyType_Vector
/// Size: 0x0000 (0 bytes) (0x000030 - 0x000030) align 8 pad: 0x0000
class UMFMissionFlowVariableKeyType_Vector : public UMFMissionFlowVariableKeyType
{ 
public:
};

/// Class /Script/MFMission.MFMissionVariableWrite_Vector
/// Size: 0x0010 (16 bytes) (0x000050 - 0x000060) align 8 pad: 0x0000
class UMFMissionVariableWrite_Vector : public UMFMissionVariableWriteBase
{ 
public:
	FVector                                            Value;                                                      // 0x0050   (0x000C)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x005C   (0x0004)  MISSED
};

/// Struct /Script/MFMission.MissionObjectiveConditionContainer
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FMissionObjectiveConditionContainer
{ 
	EMissionObjectiveConditionCheckType                CheckType;                                                  // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0001   (0x0007)  MISSED
	TArray<class UMFMissionCondition*>                 Conditions;                                                 // 0x0008   (0x0010)  
};

/// Struct /Script/MFMission.MissionObjectiveCheckConditions
/// Size: 0x0060 (96 bytes) (0x000000 - 0x000060) align 8 pad: 0x0000
struct FMissionObjectiveCheckConditions
{ 
	EMissionHelpType                                   HelpType;                                                   // 0x0000   (0x0001)  
	EMissionCompareType                                CompareType;                                                // 0x0001   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x0002   (0x0002)  MISSED
	int32_t                                            BeginProgress;                                              // 0x0004   (0x0004)  
	int32_t                                            EndProgress;                                                // 0x0008   (0x0004)  
	int32_t                                            ProgressUnit;                                               // 0x000C   (0x0004)  
	int32_t                                            ProgressFactor;                                             // 0x0010   (0x0004)  
	bool                                               bNeedReportProgress;                                        // 0x0014   (0x0001)  
	bool                                               bNeedReport;                                                // 0x0015   (0x0001)  
	bool                                               bReachEndNotComplete;                                       // 0x0016   (0x0001)  
	unsigned char                                      UnknownData01_6[0x1];                                       // 0x0017   (0x0001)  MISSED
	int32_t                                            OneBattleMaxAddProgress;                                    // 0x0018   (0x0004)  
	bool                                               bFailWhenAchieved;                                          // 0x001C   (0x0001)  
	EMissionObjectiveConditionCheckType                CheckType;                                                  // 0x001D   (0x0001)  
	unsigned char                                      UnknownData02_6[0x2];                                       // 0x001E   (0x0002)  MISSED
	TArray<FMissionObjectiveConditionContainer>        ConditionContainers;                                        // 0x0020   (0x0010)  
	TArray<class UMFMissionAction*>                    ProgressActions;                                            // 0x0030   (0x0010)  
	TArray<class UMFMissionAction*>                    SuccessActions;                                             // 0x0040   (0x0010)  
	TArray<class UMFMissionAction*>                    FailedActions;                                              // 0x0050   (0x0010)  
};

/// Struct /Script/MFMission.MissionObjectivePreConditions
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 8 pad: 0x0000
struct FMissionObjectivePreConditions
{ 
	EMissionObjectiveConditionCheckType                CheckType;                                                  // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0001   (0x0007)  MISSED
	TArray<FMissionObjectiveConditionContainer>        ConditionContainers;                                        // 0x0008   (0x0010)  
	TArray<class UMFMissionAction*>                    ActivateActions;                                            // 0x0018   (0x0010)  
};

/// Class /Script/MFMission.MFMissionObjective
/// Size: 0x00E0 (224 bytes) (0x000040 - 0x000120) align 8 pad: 0x0000
class UMFMissionObjective : public UMFMissionNode
{ 
public:
	EMissionDataType                                   InstigatorType;                                             // 0x0040   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0041   (0x0007)  MISSED
	FMissionObjectiveCheckConditions                   CheckConditions;                                            // 0x0048   (0x0060)  
	FMissionObjectivePreConditions                     PreConditions;                                              // 0x00A8   (0x0028)  
	SDK_UNDEFINED(80,596) /* TMap<TWeakObjectPtr<UMFMissionFlowComponent*>, EMissionStatus> */ __um(InstigatorStatus); // 0x00D0   (0x0050)  


	/// Functions
	// Function /Script/MFMission.MFMissionObjective.UnRegisterInstigator
	// void UnRegisterInstigator(class UMFMissionFlowComponent* InInstigator);                                                  // [0x16b1ae0] Native|Public        
	// Function /Script/MFMission.MFMissionObjective.SetHelpType
	// void SetHelpType(EMissionHelpType InHelpType);                                                                           // [0x16b1980] Final|Native|Public  
	// Function /Script/MFMission.MFMissionObjective.RegisterInstigator
	// void RegisterInstigator(class UMFMissionFlowComponent* InInstigator);                                                    // [0x16b18f0] Native|Public        
	// Function /Script/MFMission.MFMissionObjective.IsReachEndNotComplete
	// bool IsReachEndNotComplete();                                                                                            // [0x16b16c0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionObjective.IsNeedReportProgress
	// bool IsNeedReportProgress();                                                                                             // [0x16b16a0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionObjective.IsNeedReport
	// bool IsNeedReport();                                                                                                     // [0x16b1680] Final|Native|Public  
	// Function /Script/MFMission.MFMissionObjective.IsFailWhenAchieved
	// bool IsFailWhenAchieved();                                                                                               // [0x16b1660] Final|Native|Public  
	// Function /Script/MFMission.MFMissionObjective.GetProgressUnit
	// int32_t GetProgressUnit();                                                                                               // [0x16b15b0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionObjective.GetProgressFactor
	// int32_t GetProgressFactor();                                                                                             // [0x16b1590] Final|Native|Public  
	// Function /Script/MFMission.MFMissionObjective.GetOneBattleMaxAddProgress
	// int32_t GetOneBattleMaxAddProgress();                                                                                    // [0x16b1540] Final|Native|Public  
	// Function /Script/MFMission.MFMissionObjective.GetInstigatorStatus
	// TMap<TWeakObjectPtr<UMFMissionFlowComponent*>, EMissionStatus> GetInstigatorStatus();                                    // [0x16b1110] Final|Native|Public  
	// Function /Script/MFMission.MFMissionObjective.GetHelpType
	// EMissionHelpType GetHelpType();                                                                                          // [0x16b10f0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionObjective.GetEndProgress
	// int32_t GetEndProgress();                                                                                                // [0x16b10d0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionObjective.GetCompareType
	// EMissionCompareType GetCompareType();                                                                                    // [0x16b0dd0] Final|Native|Public  
	// Function /Script/MFMission.MFMissionObjective.GetBeginProgress
	// int32_t GetBeginProgress();                                                                                              // [0x16b0c60] Final|Native|Public  
};

/// Class /Script/MFMission.MFMissionStatics
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFMissionStatics : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/MFMission.MFMissionStatics.GetMissionFlowComponent
	// class UMFMissionFlowComponent* GetMissionFlowComponent(class AActor* Actor);                                             // [0x16b1330] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFMission.MFMissionStatics.GetMissionDataComponent
	// class UMFMissionDataComponent* GetMissionDataComponent(class AActor* Actor);                                             // [0x16b1270] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFMission.MFMissionStatics.GetCompareResult
	// bool GetCompareResult(EMissionCompareType CompareType, int64_t CheckNum, int64_t Value1, int64_t Value2);                // [0x16b0c80] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFMission.MFMissionSubsystem
/// Size: 0x00F8 (248 bytes) (0x000030 - 0x000128) align 8 pad: 0x0000
class UMFMissionSubsystem : public UWorldSubsystem
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0030   (0x0008)  MISSED
	SDK_UNDEFINED(80,597) /* TMap<TWeakObjectPtr<UMFMissionFlow*>, UMFMissionFlow*> */ __um(MissionFlowObjectMap); // 0x0038   (0x0050)  
	SDK_UNDEFINED(80,598) /* TMap<UClass*, UMFMissionFlow*> */ __um(ClassMissionFlowObjectMap);                    // 0x0088   (0x0050)  
	SDK_UNDEFINED(80,599) /* TMap<UClass*, UMFMission*> */ __um(ClassMissionObjectMap);                            // 0x00D8   (0x0050)  


	/// Functions
	// Function /Script/MFMission.MFMissionSubsystem.GetDebugMissionFlowNodeInfos
	// void GetDebugMissionFlowNodeInfos(class UMFMissionFlowComponent* InMissionFlowComponent, class UMFMissionFlowNode* InMissionFlowNode, FMFMissionFlowNodeInstanceData& NodeInstanceData, FString& OutMissionFlowInfo); // [0x16b0f20] Final|Native|Public|HasOutParms 
	// Function /Script/MFMission.MFMissionSubsystem.GetDebugMissionFlowInfo
	// void GetDebugMissionFlowInfo(class UMFMissionFlowComponent* InMissionFlowComponent, class UMFMissionFlow* InMissionFlow, FString& OutMissionFlowInfo); // [0x16b0df0] Final|Native|Public|HasOutParms 
};

/// Class /Script/MFMission.MissionFlowTypes
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMissionFlowTypes : public UObject
{ 
public:
};

/// Struct /Script/MFMission.MFMissionFlowNodeInstanceData
/// Size: 0x0058 (88 bytes) (0x000000 - 0x000058) align 8 pad: 0x0000
struct FMFMissionFlowNodeInstanceData
{ 
	class AActor*                                      Instigator;                                                 // 0x0000   (0x0008)  
	class UMFMissionFlowNode*                          MissionFlowNode;                                            // 0x0008   (0x0008)  
	EMissionFlowNodeStatus                             NodeStatus;                                                 // 0x0010   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0011   (0x0007)  MISSED
	class UMFMissionObjective*                         Objective;                                                  // 0x0018   (0x0008)  
	EMissionStatus                                     MissionStatus;                                              // 0x0020   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0021   (0x0003)  MISSED
	int32_t                                            InitialProgress;                                            // 0x0024   (0x0004)  
	int32_t                                            OldProgress;                                                // 0x0028   (0x0004)  
	int32_t                                            CurProgress;                                                // 0x002C   (0x0004)  
	int32_t                                            BeginProgress;                                              // 0x0030   (0x0004)  
	int32_t                                            EndProgress;                                                // 0x0034   (0x0004)  
	int32_t                                            CachedProgress;                                             // 0x0038   (0x0004)  
	int32_t                                            OneBattleAddedProgress;                                     // 0x003C   (0x0004)  
	float                                              ActivationTime;                                             // 0x0040   (0x0004)  
	float                                              FinishTime;                                                 // 0x0044   (0x0004)  
	float                                              RemainTime;                                                 // 0x0048   (0x0004)  
	float                                              RemainTimeUpdateServerTime;                                 // 0x004C   (0x0004)  
	bool                                               bHasTryInteract;                                            // 0x0050   (0x0001)  
	EMissionFailedType                                 FailedType;                                                 // 0x0051   (0x0001)  
	unsigned char                                      UnknownData02_7[0x6];                                       // 0x0052   (0x0006)  MISSED
};

/// Struct /Script/MFMission.MFMissionFlowExecutingNodeConfig
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FMFMissionFlowExecutingNodeConfig
{ 
	bool                                               bExecutingFlow;                                             // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0001   (0x0007)  MISSED
	TArray<class UMFMissionFlowNode*>                  NodeList;                                                   // 0x0008   (0x0010)  
};

/// Struct /Script/MFMission.MFMissionFlowInstanceData
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 8 pad: 0x0000
struct FMFMissionFlowInstanceData
{ 
	class AActor*                                      Instigator;                                                 // 0x0000   (0x0008)  
	class UMFMissionFlow*                              MissionFlow;                                                // 0x0008   (0x0008)  
	EMissionFlowNodeStatus                             NodeStatus;                                                 // 0x0010   (0x0001)  
	EMissionStatus                                     MissionStatus;                                              // 0x0011   (0x0001)  
	bool                                               bBeforeState;                                               // 0x0012   (0x0001)  
	unsigned char                                      UnknownData00_6[0x5];                                       // 0x0013   (0x0005)  MISSED
	class ACharacter*                                  LastTriggerCharacter;                                       // 0x0018   (0x0008)  
	int32_t                                            LoopCount;                                                  // 0x0020   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x0024   (0x0004)  MISSED
};

/// Struct /Script/MFMission.MFMissionFlowVariableInstanceData
/// Size: 0x0108 (264 bytes) (0x000000 - 0x000108) align 8 pad: 0x0000
struct FMFMissionFlowVariableInstanceData
{ 
	class UMFMissionDataComponent*                     DataComp;                                                   // 0x0000   (0x0008)  
	class UMFMissionFlow*                              MissionFlow;                                                // 0x0008   (0x0008)  
	class UMFMissionFlowVariableData*                  VariableAsset;                                              // 0x0010   (0x0008)  
	unsigned char                                      UnknownData00_6[0x20];                                      // 0x0018   (0x0020)  MISSED
	TArray<class UMFMissionFlowVariableKeyType*>       KeyInstances;                                               // 0x0038   (0x0010)  
	unsigned char                                      UnknownData01_7[0xC0];                                      // 0x0048   (0x00C0)  MISSED
};

/// Struct /Script/MFMission.MissionFlowConnections
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FMissionFlowConnections
{ 
	TArray<FMissionFlowConnection>                     Connections;                                                // 0x0000   (0x0010)  
};

/// Struct /Script/MFMission.MFMissionVariableReadBase
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 8 pad: 0x0000
struct FMFMissionVariableReadBase
{ 
	FMFMissionFlowVariableKeySelector                  Key;                                                        // 0x0000   (0x0028)  
};

/// Struct /Script/MFMission.MFMissionVariableRead_Int
/// Size: 0x0008 (8 bytes) (0x000028 - 0x000030) align 8 pad: 0x0000
struct FMFMissionVariableRead_Int : FMFMissionVariableReadBase
{ 
	int32_t                                            ConfigValue;                                                // 0x0028   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x002C   (0x0004)  MISSED
};

/// Struct /Script/MFMission.MFMissionVariableRead_Object
/// Size: 0x0008 (8 bytes) (0x000028 - 0x000030) align 8 pad: 0x0000
struct FMFMissionVariableRead_Object : FMFMissionVariableReadBase
{ 
	class UObject*                                     ConfigValue;                                                // 0x0028   (0x0008)  
};

/// Struct /Script/MFMission.MFMissionVariableRead_Rotator
/// Size: 0x0010 (16 bytes) (0x000028 - 0x000038) align 8 pad: 0x0000
struct FMFMissionVariableRead_Rotator : FMFMissionVariableReadBase
{ 
	FRotator                                           ConfigValue;                                                // 0x0028   (0x000C)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0034   (0x0004)  MISSED
};

/// Struct /Script/MFMission.MFMissionVariableRead_String
/// Size: 0x0010 (16 bytes) (0x000028 - 0x000038) align 8 pad: 0x0000
struct FMFMissionVariableRead_String : FMFMissionVariableReadBase
{ 
	FString                                            ConfigValue;                                                // 0x0028   (0x0010)  
};

/// Struct /Script/MFMission.MFMissionVariableRead_Vector
/// Size: 0x0010 (16 bytes) (0x000028 - 0x000038) align 8 pad: 0x0000
struct FMFMissionVariableRead_Vector : FMFMissionVariableReadBase
{ 
	FVector                                            ConfigValue;                                                // 0x0028   (0x000C)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0034   (0x0004)  MISSED
};

/// Struct /Script/MFMission.MissionInstigatorInfo
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FMissionInstigatorInfo
{ 
	TArray<class UObject*>                             Instigators;                                                // 0x0000   (0x0010)  
};

/// Struct /Script/MFMission.MFGlobalEventMessage_MissionActivate
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 8 pad: 0x0000
struct FMFGlobalEventMessage_MissionActivate
{ 
	class AActor*                                      Instigator;                                                 // 0x0000   (0x0008)  
};

static_assert(sizeof(UMFMission) == 0x0030); // 48 bytes (0x000028 - 0x000030)
static_assert(sizeof(UMFMissionNode) == 0x0040); // 64 bytes (0x000028 - 0x000040)
static_assert(sizeof(UMFMissionAction) == 0x0048); // 72 bytes (0x000040 - 0x000048)
static_assert(sizeof(UMFMissionCondition) == 0x0050); // 80 bytes (0x000040 - 0x000050)
static_assert(sizeof(FMFMissionFlowReplicateData) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(FMFMissionReplicateData) == 0x0058); // 88 bytes (0x000000 - 0x000058)
static_assert(sizeof(UMFMissionDataComponent) == 0x0208); // 520 bytes (0x0000F8 - 0x000208)
static_assert(sizeof(UMFMissionDataInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFMissionFlow) == 0x0098); // 152 bytes (0x000028 - 0x000098)
static_assert(sizeof(UMFMissionFlowComponent) == 0x0240); // 576 bytes (0x0000F8 - 0x000240)
static_assert(sizeof(UMFMissionFlowInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FMissionFlowConnection) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(sizeof(FMissionFlowPrevConnection) == 0x0010); // 16 bytes (0x000008 - 0x000010)
static_assert(sizeof(UMFMissionFlowNode) == 0x0140); // 320 bytes (0x000028 - 0x000140)
static_assert(sizeof(UMFMissionFlowNode_Affiliate) == 0x0140); // 320 bytes (0x000140 - 0x000140)
static_assert(sizeof(UMFMissionFlowNode_Composite) == 0x0140); // 320 bytes (0x000140 - 0x000140)
static_assert(sizeof(UMFMissionFlowNode_And) == 0x0140); // 320 bytes (0x000140 - 0x000140)
static_assert(sizeof(UMFMissionFlowNode_Assemble) == 0x0150); // 336 bytes (0x000140 - 0x000150)
static_assert(sizeof(UMFMissionFlowNode_End) == 0x0140); // 320 bytes (0x000140 - 0x000140)
static_assert(sizeof(FMFMissionFlowVariableKeySelector) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(UMFMissionFlowNode_Variable) == 0x0168); // 360 bytes (0x000140 - 0x000168)
static_assert(sizeof(UMFMissionFlowNode_IntVariable) == 0x0170); // 368 bytes (0x000168 - 0x000170)
static_assert(sizeof(UMFMissionFlowNode_Mission) == 0x0140); // 320 bytes (0x000140 - 0x000140)
static_assert(sizeof(UMFMissionFlowNode_MissionFlow) == 0x0148); // 328 bytes (0x000140 - 0x000148)
static_assert(sizeof(UMFMissionFlowNode_ObjectVariable) == 0x0170); // 368 bytes (0x000168 - 0x000170)
static_assert(sizeof(UMFMissionFlowNode_Or) == 0x0140); // 320 bytes (0x000140 - 0x000140)
static_assert(sizeof(FMissionFlowConnectionWeight) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(sizeof(UMFMissionFlowNode_Random) == 0x0158); // 344 bytes (0x000140 - 0x000158)
static_assert(sizeof(UMFMissionFlowNode_RotatorVariable) == 0x0178); // 376 bytes (0x000168 - 0x000178)
static_assert(sizeof(UMFMissionFlowNode_Start) == 0x0140); // 320 bytes (0x000140 - 0x000140)
static_assert(sizeof(UMFMissionFlowNode_StringVariable) == 0x0178); // 376 bytes (0x000168 - 0x000178)
static_assert(sizeof(UMFMissionFlowNode_VectorVariable) == 0x0178); // 376 bytes (0x000168 - 0x000178)
static_assert(sizeof(UMFMissionFlowTypes) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFMissionFlowVariableAssetProvider) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FMFMissionFlowVariableEntry) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(UMFMissionFlowVariableData) == 0x0050); // 80 bytes (0x000030 - 0x000050)
static_assert(sizeof(UMFMissionFlowVariableKeyType) == 0x0030); // 48 bytes (0x000028 - 0x000030)
static_assert(sizeof(UMFMissionVariableWriteBase) == 0x0050); // 80 bytes (0x000028 - 0x000050)
static_assert(sizeof(UMFMissionFlowVariableKeyType_Int) == 0x0030); // 48 bytes (0x000030 - 0x000030)
static_assert(sizeof(UMFMissionVariableWrite_Int) == 0x0058); // 88 bytes (0x000050 - 0x000058)
static_assert(sizeof(UMFMissionFlowVariableKeyType_Object) == 0x0038); // 56 bytes (0x000030 - 0x000038)
static_assert(sizeof(UMFMissionVariableWrite_Object) == 0x0058); // 88 bytes (0x000050 - 0x000058)
static_assert(sizeof(UMFMissionFlowVariableKeyType_Rotator) == 0x0030); // 48 bytes (0x000030 - 0x000030)
static_assert(sizeof(UMFMissionVariableWrite_Rotator) == 0x0060); // 96 bytes (0x000050 - 0x000060)
static_assert(sizeof(UMFMissionFlowVariableKeyType_String) == 0x0040); // 64 bytes (0x000030 - 0x000040)
static_assert(sizeof(UMFMissionVariableWrite_String) == 0x0060); // 96 bytes (0x000050 - 0x000060)
static_assert(sizeof(UMFMissionFlowVariableKeyType_Vector) == 0x0030); // 48 bytes (0x000030 - 0x000030)
static_assert(sizeof(UMFMissionVariableWrite_Vector) == 0x0060); // 96 bytes (0x000050 - 0x000060)
static_assert(sizeof(FMissionObjectiveConditionContainer) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FMissionObjectiveCheckConditions) == 0x0060); // 96 bytes (0x000000 - 0x000060)
static_assert(sizeof(FMissionObjectivePreConditions) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(UMFMissionObjective) == 0x0120); // 288 bytes (0x000040 - 0x000120)
static_assert(sizeof(UMFMissionStatics) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFMissionSubsystem) == 0x0128); // 296 bytes (0x000030 - 0x000128)
static_assert(sizeof(UMissionFlowTypes) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FMFMissionFlowNodeInstanceData) == 0x0058); // 88 bytes (0x000000 - 0x000058)
static_assert(sizeof(FMFMissionFlowExecutingNodeConfig) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FMFMissionFlowInstanceData) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(FMFMissionFlowVariableInstanceData) == 0x0108); // 264 bytes (0x000000 - 0x000108)
static_assert(sizeof(FMissionFlowConnections) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FMFMissionVariableReadBase) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(FMFMissionVariableRead_Int) == 0x0030); // 48 bytes (0x000028 - 0x000030)
static_assert(sizeof(FMFMissionVariableRead_Object) == 0x0030); // 48 bytes (0x000028 - 0x000030)
static_assert(sizeof(FMFMissionVariableRead_Rotator) == 0x0038); // 56 bytes (0x000028 - 0x000038)
static_assert(sizeof(FMFMissionVariableRead_String) == 0x0038); // 56 bytes (0x000028 - 0x000038)
static_assert(sizeof(FMFMissionVariableRead_Vector) == 0x0038); // 56 bytes (0x000028 - 0x000038)
static_assert(sizeof(FMissionInstigatorInfo) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FMFGlobalEventMessage_MissionActivate) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(offsetof(UMFMission, Objective) == 0x0028);
static_assert(offsetof(UMFMissionNode, Mission) == 0x0028);
static_assert(offsetof(UMFMissionNode, MissionFlowNode) == 0x0030);
static_assert(offsetof(UMFMissionNode, InstigatorTag) == 0x0038);
static_assert(offsetof(UMFMissionAction, Objective) == 0x0040);
static_assert(offsetof(UMFMissionCondition, Objective) == 0x0040);
static_assert(offsetof(FMFMissionFlowReplicateData, Instigator) == 0x0000);
static_assert(offsetof(FMFMissionFlowReplicateData, MissionFlowName) == 0x0008);
static_assert(offsetof(FMFMissionFlowReplicateData, MissionFlowStatus) == 0x0018);
static_assert(offsetof(FMFMissionFlowReplicateData, OldMissionFlowStatus) == 0x0019);
static_assert(offsetof(FMFMissionReplicateData, Instigator) == 0x0000);
static_assert(offsetof(FMFMissionReplicateData, MissionName) == 0x0008);
static_assert(offsetof(FMFMissionReplicateData, MissionFlowName) == 0x0018);
static_assert(offsetof(FMFMissionReplicateData, MissionStatus) == 0x0028);
static_assert(offsetof(FMFMissionReplicateData, OldMissionStatus) == 0x0029);
static_assert(offsetof(FMFMissionReplicateData, AffiliateMissionList) == 0x0040);
static_assert(offsetof(UMFMissionDataComponent, MissionFlowReplicateDatas) == 0x0198);
static_assert(offsetof(UMFMissionDataComponent, MissionReplicateDatas) == 0x01A8);
static_assert(offsetof(UMFMissionFlow, WorldPrivate) == 0x0030);
static_assert(offsetof(UMFMissionFlow, StartNode) == 0x0038);
static_assert(offsetof(UMFMissionFlow, EndNode) == 0x0040);
static_assert(offsetof(UMFMissionFlow, NodeList) == 0x0048);
static_assert(offsetof(UMFMissionFlow, MissionFlowName) == 0x0070);
static_assert(offsetof(UMFMissionFlow, DataType) == 0x0080);
static_assert(offsetof(UMFMissionFlow, VariableAsset) == 0x0088);
static_assert(offsetof(UMFMissionFlow, CompleteType) == 0x0090);
static_assert(offsetof(UMFMissionFlowComponent, InstigatorType) == 0x00F8);
static_assert(offsetof(FMissionFlowConnection, ConnectNode) == 0x0000);
static_assert(offsetof(FMissionFlowPrevConnection, PrevConnectionType) == 0x0008);
static_assert(offsetof(UMFMissionFlowNode, MissionFlowAsset) == 0x0028);
static_assert(offsetof(UMFMissionFlowNode, PrevConnections) == 0x0038);
static_assert(offsetof(UMFMissionFlowNode, NextConnections) == 0x0098);
static_assert(offsetof(UMFMissionFlowNode, FailedConnections) == 0x00A8);
static_assert(offsetof(UMFMissionFlowNode, MissionName) == 0x00D0);
static_assert(offsetof(UMFMissionFlowNode, Objective) == 0x00E0);
static_assert(offsetof(UMFMissionFlowNode, NodeType) == 0x00E8);
static_assert(offsetof(UMFMissionFlowNode, NodeName) == 0x00F0);
static_assert(offsetof(UMFMissionFlowNode, DataType) == 0x0100);
static_assert(offsetof(UMFMissionFlowNode, HelpType) == 0x0130);
static_assert(offsetof(UMFMissionFlowNode, CompareType) == 0x0131);
static_assert(offsetof(UMFMissionFlowNode_Assemble, AffiliateNodeList) == 0x0140);
static_assert(offsetof(FMFMissionFlowVariableKeySelector, AllowedTypes) == 0x0000);
static_assert(offsetof(FMFMissionFlowVariableKeySelector, SelectedKeyName) == 0x0010);
static_assert(offsetof(FMFMissionFlowVariableKeySelector, SelectedKeyType) == 0x0018);
static_assert(offsetof(UMFMissionFlowNode_Variable, VariableKey) == 0x0140);
static_assert(offsetof(UMFMissionFlowNode_MissionFlow, OwnMissionFlow) == 0x0140);
static_assert(offsetof(UMFMissionFlowNode_ObjectVariable, Value) == 0x0168);
static_assert(offsetof(UMFMissionFlowNode_Random, NextConnectionWeights) == 0x0140);
static_assert(offsetof(UMFMissionFlowNode_RotatorVariable, Value) == 0x0168);
static_assert(offsetof(UMFMissionFlowNode_StringVariable, Value) == 0x0168);
static_assert(offsetof(UMFMissionFlowNode_VectorVariable, Value) == 0x0168);
static_assert(offsetof(FMFMissionFlowVariableEntry, EntryName) == 0x0000);
static_assert(offsetof(FMFMissionFlowVariableEntry, KeyType) == 0x0008);
static_assert(offsetof(FMFMissionFlowVariableEntry, Category) == 0x0014);
static_assert(offsetof(UMFMissionFlowVariableData, Parent) == 0x0030);
static_assert(offsetof(UMFMissionFlowVariableData, Keys) == 0x0038);
static_assert(offsetof(UMFMissionVariableWriteBase, Key) == 0x0028);
static_assert(offsetof(UMFMissionFlowVariableKeyType_Object, BaseClass) == 0x0030);
static_assert(offsetof(UMFMissionVariableWrite_Object, Value) == 0x0050);
static_assert(offsetof(UMFMissionVariableWrite_Rotator, Value) == 0x0050);
static_assert(offsetof(UMFMissionFlowVariableKeyType_String, StringValue) == 0x0030);
static_assert(offsetof(UMFMissionVariableWrite_String, Value) == 0x0050);
static_assert(offsetof(UMFMissionVariableWrite_Vector, Value) == 0x0050);
static_assert(offsetof(FMissionObjectiveConditionContainer, CheckType) == 0x0000);
static_assert(offsetof(FMissionObjectiveConditionContainer, Conditions) == 0x0008);
static_assert(offsetof(FMissionObjectiveCheckConditions, HelpType) == 0x0000);
static_assert(offsetof(FMissionObjectiveCheckConditions, CompareType) == 0x0001);
static_assert(offsetof(FMissionObjectiveCheckConditions, CheckType) == 0x001D);
static_assert(offsetof(FMissionObjectiveCheckConditions, ConditionContainers) == 0x0020);
static_assert(offsetof(FMissionObjectiveCheckConditions, ProgressActions) == 0x0030);
static_assert(offsetof(FMissionObjectiveCheckConditions, SuccessActions) == 0x0040);
static_assert(offsetof(FMissionObjectiveCheckConditions, FailedActions) == 0x0050);
static_assert(offsetof(FMissionObjectivePreConditions, CheckType) == 0x0000);
static_assert(offsetof(FMissionObjectivePreConditions, ConditionContainers) == 0x0008);
static_assert(offsetof(FMissionObjectivePreConditions, ActivateActions) == 0x0018);
static_assert(offsetof(UMFMissionObjective, InstigatorType) == 0x0040);
static_assert(offsetof(UMFMissionObjective, CheckConditions) == 0x0048);
static_assert(offsetof(UMFMissionObjective, PreConditions) == 0x00A8);
static_assert(offsetof(FMFMissionFlowNodeInstanceData, Instigator) == 0x0000);
static_assert(offsetof(FMFMissionFlowNodeInstanceData, MissionFlowNode) == 0x0008);
static_assert(offsetof(FMFMissionFlowNodeInstanceData, NodeStatus) == 0x0010);
static_assert(offsetof(FMFMissionFlowNodeInstanceData, Objective) == 0x0018);
static_assert(offsetof(FMFMissionFlowNodeInstanceData, MissionStatus) == 0x0020);
static_assert(offsetof(FMFMissionFlowNodeInstanceData, FailedType) == 0x0051);
static_assert(offsetof(FMFMissionFlowExecutingNodeConfig, NodeList) == 0x0008);
static_assert(offsetof(FMFMissionFlowInstanceData, Instigator) == 0x0000);
static_assert(offsetof(FMFMissionFlowInstanceData, MissionFlow) == 0x0008);
static_assert(offsetof(FMFMissionFlowInstanceData, NodeStatus) == 0x0010);
static_assert(offsetof(FMFMissionFlowInstanceData, MissionStatus) == 0x0011);
static_assert(offsetof(FMFMissionFlowInstanceData, LastTriggerCharacter) == 0x0018);
static_assert(offsetof(FMFMissionFlowVariableInstanceData, DataComp) == 0x0000);
static_assert(offsetof(FMFMissionFlowVariableInstanceData, MissionFlow) == 0x0008);
static_assert(offsetof(FMFMissionFlowVariableInstanceData, VariableAsset) == 0x0010);
static_assert(offsetof(FMFMissionFlowVariableInstanceData, KeyInstances) == 0x0038);
static_assert(offsetof(FMissionFlowConnections, Connections) == 0x0000);
static_assert(offsetof(FMFMissionVariableReadBase, Key) == 0x0000);
static_assert(offsetof(FMFMissionVariableRead_Object, ConfigValue) == 0x0028);
static_assert(offsetof(FMFMissionVariableRead_Rotator, ConfigValue) == 0x0028);
static_assert(offsetof(FMFMissionVariableRead_String, ConfigValue) == 0x0028);
static_assert(offsetof(FMFMissionVariableRead_Vector, ConfigValue) == 0x0028);
static_assert(offsetof(FMissionInstigatorInfo, Instigators) == 0x0000);
static_assert(offsetof(FMFGlobalEventMessage_MissionActivate, Instigator) == 0x0000);
