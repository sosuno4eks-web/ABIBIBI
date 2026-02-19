
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: AIActionPointGeneratorRuntime
/// dependency: AIModule
/// dependency: AkAudio
/// dependency: CoreUObject
/// dependency: CoverGenerator
/// dependency: Engine
/// dependency: NavigationSystem

/// Enum /Script/MFNPCAI.EGraphAStarResult
/// Size: 0x01 (1 bytes)
enum class EGraphAStarResult : uint8_t
{
	EGraphAStarResult__WaitToSearch                                                  = 0,
	EGraphAStarResult__SearchFail                                                    = 1,
	EGraphAStarResult__SearchInProgress                                              = 2,
	EGraphAStarResult__SearchAborted                                                 = 3,
	EGraphAStarResult__SearchDone                                                    = 4,
	EGraphAStarResult__SearchSuccess                                                 = 5,
	EGraphAStarResult__GoalUnreachable                                               = 6,
	EGraphAStarResult__InfiniteLoop                                                  = 7,
	EGraphAStarResult__NotFound                                                      = 8,
	EGraphAStarResult__RequestNotFound                                               = 9
};

/// Enum /Script/MFNPCAI.ENPCAIGoDirectlyResult
/// Size: 0x01 (1 bytes)
enum class ENPCAIGoDirectlyResult : uint8_t
{
	ENPCAIGoDirectlyResult__Success                                                  = 0,
	ENPCAIGoDirectlyResult__ReachBoundary                                            = 1,
	ENPCAIGoDirectlyResult__AIPawnNotFound                                           = 2
};

/// Enum /Script/MFNPCAI.ENPCAIPerceptibleTile
/// Size: 0x01 (1 bytes)
enum class ENPCAIPerceptibleTile : uint8_t
{
	ENPCAIPerceptibleTile__None                                                      = 0,
	ENPCAIPerceptibleTile__Bomb                                                      = 1,
	ENPCAIPerceptibleTile__Stun                                                      = 2,
	ENPCAIPerceptibleTile__Smoke                                                     = 3,
	ENPCAIPerceptibleTile__Molotov                                                   = 4,
	ENPCAIPerceptibleTile__C4                                                        = 5,
	ENPCAIPerceptibleTile__Flash                                                     = 6,
	ENPCAIPerceptibleTile__FootSounder                                               = 7,
	ENPCAIPerceptibleTile__TearGas                                                   = 8,
	ENPCAIPerceptibleTile__OffensiveGrenade                                          = 9,
	ENPCAIPerceptibleTile__TripMine                                                  = 10,
	ENPCAIPerceptibleTile__ClaymoreMine                                              = 11,
	ENPCAIPerceptibleTile__SignalDetonator                                           = 12,
	ENPCAIPerceptibleTile__CustomIndex                                               = 13,
	ENPCAIPerceptibleTile__DefaultArea                                               = 14,
	ENPCAIPerceptibleTile__AvoidanceArea                                             = 15,
	ENPCAIPerceptibleTile__ObstacleArea                                              = 16,
	ENPCAIPerceptibleTile__ParadropArea                                              = 17,
	ENPCAIPerceptibleTile__Unknown                                                   = 18,
	ENPCAIPerceptibleTile__Max                                                       = 19
};

/// Enum /Script/MFNPCAI.EAISceneEventState
/// Size: 0x01 (1 bytes)
enum class EAISceneEventState : uint8_t
{
	EAISceneEventState__Trigger                                                      = 0,
	EAISceneEventState__Completed                                                    = 1,
	EAISceneEventState__Expired                                                      = 2,
	EAISceneEventState__Removed                                                      = 3
};

/// Enum /Script/MFNPCAI.EAIAimingType
/// Size: 0x01 (1 bytes)
enum class EAIAimingType : uint8_t
{
	Normal                                                                           = 0,
	Regular                                                                          = 1
};

/// Enum /Script/MFNPCAI.EAIAimStatus
/// Size: 0x04 (4 bytes)
enum class EAIAimStatus : uint32_t
{
	EAIAimStatus__Aiming                                                             = 0,
	EAIAimStatus__NoTarget                                                           = 1,
	EAIAimStatus__AimComplete                                                        = 2
};

/// Enum /Script/MFNPCAI.ENPCAIAsyncTaskType
/// Size: 0x01 (1 bytes)
enum class ENPCAIAsyncTaskType : uint8_t
{
	ENPCAIAsyncTaskType__None                                                        = 0,
	ENPCAIAsyncTaskType__FindAmbushAgainstPoint                                      = 1,
	ENPCAIAsyncTaskType__PeekPoint                                                   = 2,
	ENPCAIAsyncTaskType__FindPathByKeyRoute                                          = 3,
	ENPCAIAsyncTaskType__QueryRoundEnvironment                                       = 4
};

/// Enum /Script/MFNPCAI.ENPCPlaceForCheckType
/// Size: 0x01 (1 bytes)
enum class ENPCPlaceForCheckType : uint8_t
{
	ENPCPlaceForCheckType__Simple                                                    = 0,
	ENPCPlaceForCheckType__Danger                                                    = 1,
	ENPCPlaceForCheckType__Suspicious                                                = 2,
	ENPCPlaceForCheckType__Fatal                                                     = 3,
	ENPCPlaceForCheckType__GrenadeHit_Near                                           = 4,
	ENPCPlaceForCheckType__GrenadeHit_Far                                            = 5,
	ENPCPlaceForCheckType__GrenadeComeing                                            = 6,
	ENPCPlaceForCheckType__FarFootStep                                               = 7,
	ENPCPlaceForCheckType__CloseFootStep                                             = 8,
	ENPCPlaceForCheckType__FarGunFire                                                = 9,
	ENPCPlaceForCheckType__CloseGunFire                                              = 10,
	ENPCPlaceForCheckType__GrenadeHolding                                            = 11,
	ENPCPlaceForCheckType__Fuzzy                                                     = 12
};

/// Enum /Script/MFNPCAI.EAIProfileEditState
/// Size: 0x01 (1 bytes)
enum class EAIProfileEditState : uint8_t
{
	EAIProfileEditState__None                                                        = 0,
	EAIProfileEditState__ChoosingProperty                                            = 1,
	EAIProfileEditState__EditingProperty                                             = 2,
	EAIProfileEditState__Comparing                                                   = 3
};

/// Enum /Script/MFNPCAI.EAIProfileCoverType
/// Size: 0x01 (1 bytes)
enum class EAIProfileCoverType : uint8_t
{
	EAIProfileCoverType__CoverType_None                                              = 0,
	EAIProfileCoverType__CoverType_int32                                             = 1,
	EAIProfileCoverType__CoverType_int64                                             = 2,
	EAIProfileCoverType__CoverType_float                                             = 3,
	EAIProfileCoverType__CoverType_bool                                              = 4,
	EAIProfileCoverType__CoverType_Byte                                              = 5,
	EAIProfileCoverType__CoverType_Enum                                              = 6,
	EAIProfileCoverType__CoverType_Set                                               = 7,
	EAIProfileCoverType__CoverType_Array                                             = 8,
	EAIProfileCoverType__CoverType_Map                                               = 9,
	EAIProfileCoverType__CoverType_Vector                                            = 10,
	EAIProfileCoverType__CoverType_AIMindGoalEnemyAngleMultiple                      = 11,
	EAIProfileCoverType__CoverType_AIBodyBulkAimingChoice                            = 12,
	EAIProfileCoverType__CoverType_AISenseSightNormal                                = 13,
	EAIProfileCoverType__CoverType_String                                            = 14,
	EAIProfileCoverType__CoverType_Object                                            = 15,
	EAIProfileCoverType__CoverType_SoftClassPtr                                      = 16
};

/// Enum /Script/MFNPCAI.EAIGroupRequestFireTarget
/// Size: 0x01 (1 bytes)
enum class EAIGroupRequestFireTarget : uint8_t
{
	EAIGroupRequestFireTarget__Fire_Enemy                                            = 0,
	EAIGroupRequestFireTarget__Fire_Point                                            = 1
};

/// Enum /Script/MFNPCAI.EAIStateWarnPlayerRequest
/// Size: 0x01 (1 bytes)
enum class EAIStateWarnPlayerRequest : uint8_t
{
	EAIStateWarnPlayerRequest__Goto                                                  = 0,
	EAIStateWarnPlayerRequest__Say                                                   = 1,
	EAIStateWarnPlayerRequest__Wait                                                  = 2,
	EAIStateWarnPlayerRequest__Shoot                                                 = 3,
	EAIStateWarnPlayerRequest__Stay                                                  = 4
};

/// Enum /Script/MFNPCAI.ENPCAIMovementKind
/// Size: 0x01 (1 bytes)
enum class ENPCAIMovementKind : uint8_t
{
	ENPCAIMovementKind__GotoPoint                                                    = 0,
	ENPCAIMovementKind__GoDirectly                                                   = 1,
	ENPCAIMovementKind__GoAccordingToWayPoints                                       = 2
};

/// Enum /Script/MFNPCAI.ENPCAIMoveResult
/// Size: 0x01 (1 bytes)
enum class ENPCAIMoveResult : uint8_t
{
	ENPCAIMoveResult__None                                                           = 0,
	ENPCAIMoveResult__WaitPerform                                                    = 1,
	ENPCAIMoveResult__Succeeded                                                      = 2,
	ENPCAIMoveResult__Failed                                                         = 3,
	ENPCAIMoveResult__Aborted                                                        = 4,
	ENPCAIMoveResult__InProgress                                                     = 5
};

/// Enum /Script/MFNPCAI.EGetLinkUsageCountStatus
/// Size: 0x01 (1 bytes)
enum class EGetLinkUsageCountStatus : uint8_t
{
	EGetLinkUsageCountStatus__Success                                                = 0,
	EGetLinkUsageCountStatus__GetNavMeshManagerFailed                                = 1,
	EGetLinkUsageCountStatus__GetSourceRegionIndexFailed                             = 2,
	EGetLinkUsageCountStatus__GetTargetRegionIndexFailed                             = 3,
	EGetLinkUsageCountStatus__RegionIndexNotValidNodeIndex                           = 4,
	EGetLinkUsageCountStatus__RegionIndexNotValidAdjacencyIndex                      = 5,
	EGetLinkUsageCountStatus__Unreachable                                            = 6
};

/// Enum /Script/MFNPCAI.ENavSkeletonPointGetterFlag
/// Size: 0x01 (1 bytes)
enum class ENavSkeletonPointGetterFlag : uint8_t
{
	ENavSkeletonPointGetterFlag__None                                                = 0,
	ENavSkeletonPointGetterFlag__LinkId                                              = 1,
	ENavSkeletonPointGetterFlag__NeighbourIndices                                    = 2,
	ENavSkeletonPointGetterFlag__VisibleIndices                                      = 3,
	ENavSkeletonPointGetterFlag__All                                                 = 255
};

/// Enum /Script/MFNPCAI.ENavSkeletonDivergenceMethod
/// Size: 0x01 (1 bytes)
enum class ENavSkeletonDivergenceMethod : uint8_t
{
	ENavSkeletonDivergenceMethod__Laplacian                                          = 0,
	ENavSkeletonDivergenceMethod__GradientFlux                                       = 1,
	ENavSkeletonDivergenceMethod__Neighbour                                          = 2
};

/// Enum /Script/MFNPCAI.ENavSkeletonSamplePointKind
/// Size: 0x01 (1 bytes)
enum class ENavSkeletonSamplePointKind : uint8_t
{
	ENavSkeletonSamplePointKind__None                                                = 0,
	ENavSkeletonSamplePointKind__Isolate                                             = 1,
	ENavSkeletonSamplePointKind__Endpoint                                            = 2,
	ENavSkeletonSamplePointKind__Normal                                              = 3,
	ENavSkeletonSamplePointKind__KeptNormal                                          = 4,
	ENavSkeletonSamplePointKind__DoorLink                                            = 5,
	ENavSkeletonSamplePointKind__Junction                                            = 6
};

/// Enum /Script/MFNPCAI.ENavSkeletonSamplePointDropReason
/// Size: 0x01 (1 bytes)
enum class ENavSkeletonSamplePointDropReason : uint8_t
{
	ENavSkeletonSamplePointDropReason__None                                          = 0,
	ENavSkeletonSamplePointDropReason__CannotBeSkeletonPoint                         = 1,
	ENavSkeletonSamplePointDropReason__FindDistanceToWallFailed                      = 2,
	ENavSkeletonSamplePointDropReason__TooCloseToWall                                = 3,
	ENavSkeletonSamplePointDropReason__InvalidWallHitNormal                          = 4,
	ENavSkeletonSamplePointDropReason__MismatchedNeighbours                          = 5,
	ENavSkeletonSamplePointDropReason__InvalidGradientSize                           = 6,
	ENavSkeletonSamplePointDropReason__InvalidDivergence                             = 7,
	ENavSkeletonSamplePointDropReason__TooLessWallCount                              = 8,
	ENavSkeletonSamplePointDropReason__Isolated                                      = 9,
	ENavSkeletonSamplePointDropReason__NotMainPoint                                  = 10,
	ENavSkeletonSamplePointDropReason__CloseToAnotherMainPoint                       = 11,
	ENavSkeletonSamplePointDropReason__CannotFindProperPointToConnect                = 12,
	ENavSkeletonSamplePointDropReason__InvalidPointKind                              = 13,
	ENavSkeletonSamplePointDropReason__BeSimplified                                  = 14,
	ENavSkeletonSamplePointDropReason__InPrunedEndBranch                             = 15,
	ENavSkeletonSamplePointDropReason__Count                                         = 16
};

/// Enum /Script/MFNPCAI.EPathExistenceTestMode
/// Size: 0x01 (1 bytes)
enum class EPathExistenceTestMode : uint8_t
{
	EPathExistenceTestMode__Regular                                                  = 0,
	EPathExistenceTestMode__Hierarchical                                             = 1
};

/// Enum /Script/MFNPCAI.ENavAreaKind
/// Size: 0x01 (1 bytes)
enum class ENavAreaKind : uint8_t
{
	Burning                                                                          = 0,
	TearGas                                                                          = 1,
	TripMine                                                                         = 2,
	Claymore                                                                         = 3,
	Paradrop                                                                         = 4
};

/// Enum /Script/MFNPCAI.ENavMeshTileLabel
/// Size: 0x01 (1 bytes)
enum class ENavMeshTileLabel : uint8_t
{
	ENavMeshTileLabel__AllPolysReachable                                             = 0,
	ENavMeshTileLabel__PartialPolysReachable                                         = 1,
	ENavMeshTileLabel__InvalidBeginIndex                                             = 2,
	ENavMeshTileLabel__ConsiderUnreachablePolys                                      = 252,
	ENavMeshTileLabel__AllPolysUneachable                                            = 253,
	ENavMeshTileLabel__InvalidHeader                                                 = 254,
	ENavMeshTileLabel__Unknown                                                       = 255
};

/// Enum /Script/MFNPCAI.EMETIS_OBJTYPE
/// Size: 0x04 (4 bytes)
enum class EMETIS_OBJTYPE : uint32_t
{
	EMETIS_OBJTYPE__METIS_OBJTYPE_CUT                                                = 0,
	EMETIS_OBJTYPE__METIS_OBJTYPE_VOL                                                = 1,
	EMETIS_OBJTYPE__METIS_OBJTYPE_NODE                                               = 2
};

/// Enum /Script/MFNPCAI.EMETIS_RTYPE
/// Size: 0x04 (4 bytes)
enum class EMETIS_RTYPE : uint32_t
{
	EMETIS_RTYPE__METIS_RTYPE_FM                                                     = 0,
	EMETIS_RTYPE__METIS_RTYPE_GREEDY                                                 = 1,
	EMETIS_RTYPE__METIS_RTYPE_SEP2SIDED                                              = 2,
	EMETIS_RTYPE__METIS_RTYPE_SEP1SIDED                                              = 3
};

/// Enum /Script/MFNPCAI.EMETIS_IPTYPE
/// Size: 0x04 (4 bytes)
enum class EMETIS_IPTYPE : uint32_t
{
	EMETIS_IPTYPE__METIS_IPTYPE_GROW                                                 = 0,
	EMETIS_IPTYPE__METIS_IPTYPE_RANDOM                                               = 1,
	EMETIS_IPTYPE__METIS_IPTYPE_EDGE                                                 = 2,
	EMETIS_IPTYPE__METIS_IPTYPE_NODE                                                 = 3,
	EMETIS_IPTYPE__METIS_IPTYPE_METISRB                                              = 4
};

/// Enum /Script/MFNPCAI.EMETIS_CTYPE
/// Size: 0x04 (4 bytes)
enum class EMETIS_CTYPE : uint32_t
{
	EMETIS_CTYPE__METIS_CTYPE_RM                                                     = 0,
	EMETIS_CTYPE__METIS_CTYPE_SHEM                                                   = 1
};

/// Enum /Script/MFNPCAI.EMETIS_PTYPE
/// Size: 0x01 (1 bytes)
enum class EMETIS_PTYPE : uint8_t
{
	EMETIS_PTYPE__METIS_PTYPE_RB                                                     = 0,
	EMETIS_PTYPE__METIS_PTYPE_KWAY                                                   = 1
};

/// Enum /Script/MFNPCAI.EnumAIGrassType
/// Size: 0x01 (1 bytes)
enum class EnumAIGrassType : uint8_t
{
	EnumAIGrassType__E_Foliage                                                       = 0,
	EnumAIGrassType__E_Landscape                                                     = 1
};

/// Enum /Script/MFNPCAI.EnumAIGrassDebugBox
/// Size: 0x01 (1 bytes)
enum class EnumAIGrassDebugBox : uint8_t
{
	EnumAIGrassDebugBox__E_NONE                                                      = 0,
	EnumAIGrassDebugBox__E_Foliage                                                   = 1,
	EnumAIGrassDebugBox__E_Landscape                                                 = 2,
	EnumAIGrassDebugBox__E_FoliageCylinders                                          = 3,
	EnumAIGrassDebugBox__E_ALL                                                       = 4
};

/// Enum /Script/MFNPCAI.EAimingType
/// Size: 0x01 (1 bytes)
enum class EAimingType : uint8_t
{
	EAimingType__Normal                                                              = 0,
	EAimingType__Regular                                                             = 1
};

/// Enum /Script/MFNPCAI.ENPCAISceneEventID
/// Size: 0x01 (1 bytes)
enum class ENPCAISceneEventID : uint8_t
{
	ENPCAISceneEventID__None                                                         = 0,
	ENPCAISceneEventID__Armory_Alarm_EscapeG1                                        = 1,
	ENPCAISceneEventID__Armory_Alarm_EscapeWater                                     = 2,
	ENPCAISceneEventID__Valley_Alarm_BossHouse                                       = 3,
	ENPCAISceneEventID__Valley_Alarm_BossFactory                                     = 4,
	ENPCAISceneEventID__CallHelp                                                     = 5,
	ENPCAISceneEventID__ArmoryAlarmEscapeMine                                        = 6,
	ENPCAISceneEventID__TVStation_Escape_Elevator                                    = 7,
	ENPCAISceneEventID__ArmoryAlarmEscapeBunker                                      = 8,
	ENPCAISceneEventID__Call_Defender_TVStation                                      = 9
};

/// Enum /Script/MFNPCAI.ESteepZoneSamplePointDropReason
/// Size: 0x01 (1 bytes)
enum class ESteepZoneSamplePointDropReason : uint8_t
{
	ESteepZoneSamplePointDropReason__None                                            = 0,
	ESteepZoneSamplePointDropReason__InvalidTrace                                    = 1,
	ESteepZoneSamplePointDropReason__StartPenetrating                                = 2,
	ESteepZoneSamplePointDropReason__WalkableFloor                                   = 3,
	ESteepZoneSamplePointDropReason__NotEnoughNeighbours                             = 4,
	ESteepZoneSamplePointDropReason__Count                                           = 5
};

/// Enum /Script/MFNPCAI.ESteepZoneNavMeshPolyDropReason
/// Size: 0x01 (1 bytes)
enum class ESteepZoneNavMeshPolyDropReason : uint8_t
{
	ESteepZoneNavMeshPolyDropReason__None                                            = 0,
	ESteepZoneNavMeshPolyDropReason__GetTileAndPolyByRefFailed                       = 1,
	ESteepZoneNavMeshPolyDropReason__NotPoly                                         = 2,
	ESteepZoneNavMeshPolyDropReason__InvalidNormal                                   = 3,
	ESteepZoneNavMeshPolyDropReason__ValidIncludedAngle                              = 4,
	ESteepZoneNavMeshPolyDropReason__AllTrianglesDropped                             = 5,
	ESteepZoneNavMeshPolyDropReason__Count                                           = 6
};

/// Enum /Script/MFNPCAI.EAIKeyRouteQueryType
/// Size: 0x01 (1 bytes)
enum class EAIKeyRouteQueryType : uint8_t
{
	EAIKeyRouteQueryType__Safe                                                       = 0,
	EAIKeyRouteQueryType__Short                                                      = 1
};

/// Enum /Script/MFNPCAI.ENPCSetPartType
/// Size: 0x01 (1 bytes)
enum class ENPCSetPartType : uint8_t
{
	ENPCSetPartType__None                                                            = 0,
	ENPCSetPartType__Close                                                           = 1,
	ENPCSetPartType__Middle                                                          = 2,
	ENPCSetPartType__Far                                                             = 3
};

/// Enum /Script/MFNPCAI.EAITrackLOGType
/// Size: 0x01 (1 bytes)
enum class EAITrackLOGType : uint8_t
{
	EAITrackLOGType__Move                                                            = 0,
	EAITrackLOGType__AimingBodyPart                                                  = 1,
	EAITrackLOGType__AimingTime                                                      = 2,
	EAITrackLOGType__AimingPredestined                                               = 3,
	EAITrackLOGType__Shoot                                                           = 4,
	EAITrackLOGType__BeHit                                                           = 5,
	EAITrackLOGType__Decision                                                        = 6,
	EAITrackLOGType__Init                                                            = 7
};

/// Enum /Script/MFNPCAI.ENPCAITactic
/// Size: 0x01 (1 bytes)
enum class ENPCAITactic : uint8_t
{
	ENPCAITactic__None                                                               = 0,
	ENPCAITactic__CloseFight                                                         = 1,
	ENPCAITactic__MidFight                                                           = 2,
	ENPCAITactic__LongFight                                                          = 3,
	ENPCAITactic__RushFace                                                           = 4,
	ENPCAITactic__FlankAttack                                                        = 5,
	ENPCAITactic__BackAround                                                         = 6,
	ENPCAITactic__Hide                                                               = 7,
	ENPCAITactic__RunAway                                                            = 8
};

/// Enum /Script/MFNPCAI.EAIMainType
/// Size: 0x01 (1 bytes)
enum class EAIMainType : uint8_t
{
	EAIMainType__EAIMainType_Scav                                                    = 0,
	EAIMainType__EAIMainType_Boss                                                    = 1,
	EAIMainType__EAIMainType_Follower                                                = 2,
	EAIMainType__EAIMainType_PMCAI                                                   = 3,
	EAIMainType__EAIMainType_TeachingAI                                              = 4,
	EAIMainType__EAIMainType_TestAI                                                  = 5,
	EAIMainType__EAIMainType_Elit                                                    = 6,
	EAIMainType__EAIMainType_Elit_PlayerScavAI                                       = 7
};

/// Enum /Script/MFNPCAI.EAIEnemyVisibilityType
/// Size: 0x01 (1 bytes)
enum class EAIEnemyVisibilityType : uint8_t
{
	EAIEnemyVisibilityType__NotVisible                                               = 0,
	EAIEnemyVisibilityType__VisibleBySense                                           = 1,
	EAIEnemyVisibilityType__Visible                                                  = 2
};

/// Enum /Script/MFNPCAI.EAIEnemyPriority
/// Size: 0x01 (1 bytes)
enum class EAIEnemyPriority : uint8_t
{
	EAIEnemyPriority__EAIEnemyPriority_High                                          = 0,
	EAIEnemyPriority__EAIEnemyPriority_Medium                                        = 1,
	EAIEnemyPriority__EAIEnemyPriority_Low                                           = 2
};

/// Enum /Script/MFNPCAI.EAIAimingBodyPartTrend
/// Size: 0x01 (1 bytes)
enum class EAIAimingBodyPartTrend : uint8_t
{
	EAIAimingBodyPartTrend__None                                                     = 0,
	EAIAimingBodyPartTrend__Armor                                                    = 1,
	EAIAimingBodyPartTrend__NoArmor                                                  = 2,
	EAIAimingBodyPartTrend__Fatal                                                    = 3,
	EAIAimingBodyPartTrend__MinDamage                                                = 4
};

/// Enum /Script/MFNPCAI.EAIBodyBulkType
/// Size: 0x01 (1 bytes)
enum class EAIBodyBulkType : uint8_t
{
	EAIBodyBulkType__HeadGroup                                                       = 0,
	EAIBodyBulkType__BodyGroup                                                       = 1,
	EAIBodyBulkType__LegsGroup                                                       = 2
};

/// Enum /Script/MFNPCAI.EAIBodyPartType
/// Size: 0x01 (1 bytes)
enum class EAIBodyPartType : uint8_t
{
	EAIBodyPartType__EAIBodyPartType_Head                                            = 0,
	EAIBodyPartType__EAIBodyPartType_Chest                                           = 1,
	EAIBodyPartType__EAIBodyPartType_LefyArm                                         = 2,
	EAIBodyPartType__EAIBodyPartType_RightArm                                        = 3,
	EAIBodyPartType__EAIBodyPartType_LeftLeg                                         = 4,
	EAIBodyPartType__EAIBodyPartType_RightLeg                                        = 5,
	EAIBodyPartType__EAIBodyPartType_Stomach                                         = 6,
	EAIBodyPartType__EAIBodyPartType_Max                                             = 7
};

/// Enum /Script/MFNPCAI.EAISoundType
/// Size: 0x01 (1 bytes)
enum class EAISoundType : uint8_t
{
	EAISoundType__EAISoundType_ConfirmTargetScream                                   = 0
};

/// Enum /Script/MFNPCAI.EAIWorkResult
/// Size: 0x01 (1 bytes)
enum class EAIWorkResult : uint8_t
{
	EAIWorkResult__Success                                                           = 0,
	EAIWorkResult__Failed                                                            = 1,
	EAIWorkResult__Wait                                                              = 2
};

/// Enum /Script/MFNPCAI.EAISenseSightConf
/// Size: 0x01 (1 bytes)
enum class EAISenseSightConf : uint8_t
{
	EAISenseSightConf__Normal                                                        = 0,
	EAISenseSightConf__Night                                                         = 1,
	EAISenseSightConf__Light                                                         = 2
};

/// Enum /Script/MFNPCAI.ENPCAISenseChannel
/// Size: 0x01 (1 bytes)
enum class ENPCAISenseChannel : uint8_t
{
	ENPCAISenseChannel__NONE                                                         = 0,
	ENPCAISenseChannel__Weapon_Channel                                               = 15,
	ENPCAISenseChannel__AISight_Channel                                              = 25
};

/// Enum /Script/MFNPCAI.EAISenseType
/// Size: 0x01 (1 bytes)
enum class EAISenseType : uint8_t
{
	EAISenseType__ALL                                                                = 0,
	EAISenseType__Sight                                                              = 1,
	EAISenseType__Hearing                                                            = 2,
	EAISenseType__Damage                                                             = 3,
	EAISenseType__ComingExplosion                                                    = 4
};

/// Enum /Script/MFNPCAI.ENPCAISenseBarrier
/// Size: 0x01 (1 bytes)
enum class ENPCAISenseBarrier : uint8_t
{
	ENPCAISenseBarrier__None                                                         = 0,
	ENPCAISenseBarrier__Normal                                                       = 1,
	ENPCAISenseBarrier__Grass                                                        = 2,
	ENPCAISenseBarrier__ALLY                                                         = 3,
	ENPCAISenseBarrier__OtherEnemy                                                   = 4,
	ENPCAISenseBarrier__Smoke                                                        = 5
};

/// Enum /Script/MFNPCAI.ENPCAIPriority
/// Size: 0x01 (1 bytes)
enum class ENPCAIPriority : uint8_t
{
	ENPCAIPriority__Low                                                              = 0,
	ENPCAIPriority__Middle                                                           = 1,
	ENPCAIPriority__High                                                             = 2,
	ENPCAIPriority__Max                                                              = 3,
	ENPCAIPriority__COUNT                                                            = 4
};

/// Enum /Script/MFNPCAI.EAIGotoPointDecision
/// Size: 0x01 (1 bytes)
enum class EAIGotoPointDecision : uint8_t
{
	EAIGotoPointDecision__Normal                                                     = 0,
	EAIGotoPointDecision__SafetyDoor                                                 = 1,
	EAIGotoPointDecision__Swing                                                      = 2
};

/// Enum /Script/MFNPCAI.EAIGroupRequestPriority
/// Size: 0x01 (1 bytes)
enum class EAIGroupRequestPriority : uint8_t
{
	EAIGroupRequestPriority__Low                                                     = 0,
	EAIGroupRequestPriority__Normal                                                  = 1,
	EAIGroupRequestPriority__Top                                                     = 2,
	EAIGroupRequestPriority__Fatal                                                   = 3
};

/// Enum /Script/MFNPCAI.EAIProfileType
/// Size: 0x01 (1 bytes)
enum class EAIProfileType : uint8_t
{
	EAIProfileType__Aiming                                                           = 0,
	EAIProfileType__AIType                                                           = 1,
	EAIProfileType__Boss                                                             = 2,
	EAIProfileType__Core                                                             = 3,
	EAIProfileType__Curve                                                            = 4,
	EAIProfileType__Global                                                           = 5,
	EAIProfileType__Grenade                                                          = 6,
	EAIProfileType__Hearing                                                          = 7,
	EAIProfileType__Lay                                                              = 8,
	EAIProfileType__Look                                                             = 9,
	EAIProfileType__Mind                                                             = 10,
	EAIProfileType__Move                                                             = 11,
	EAIProfileType__Shoot                                                            = 12,
	EAIProfileType__Sound                                                            = 13,
	EAIProfileType__Weapon                                                           = 14,
	EAIProfileType__Damage                                                           = 15,
	EAIProfileType__Health                                                           = 16,
	EAIProfileType__PlayerActionReaction                                             = 17,
	EAIProfileType__BTBlock                                                          = 18,
	EAIProfileType__Strategy                                                         = 19,
	EAIProfileType__Smart                                                            = 20,
	EAIProfileType__Tactic                                                           = 21,
	EAIProfileType__RequestRun                                                       = 22
};

/// Enum /Script/MFNPCAI.ENPCAIDecision
/// Size: 0x01 (1 bytes)
enum class ENPCAIDecision : uint8_t
{
	ENPCAIDecision__None                                                             = 0,
	ENPCAIDecision__RushFaceWhenDisable                                              = 1,
	ENPCAIDecision__ShootFromCover                                                   = 2,
	ENPCAIDecision__ShootFromGround                                                  = 3,
	ENPCAIDecision__ShootPrecisely                                                   = 4,
	ENPCAIDecision__RushFaceWithAlly                                                 = 5,
	ENPCAIDecision__FindCoverToHide                                                  = 6,
	ENPCAIDecision__ChangeCoverAfterNotSafe                                          = 7,
	ENPCAIDecision__MoveFurther                                                      = 8,
	ENPCAIDecision__MoveCloser                                                       = 9,
	ENPCAIDecision__MoveToFlank                                                      = 10,
	ENPCAIDecision__MoveToAttackPoint                                                = 11,
	ENPCAIDecision__ChangeCover                                                      = 12,
	ENPCAIDecision__SearchEnemy                                                      = 13,
	ENPCAIDecision__HoldPosition                                                     = 14,
	ENPCAIDecision__BackToCover                                                      = 15,
	ENPCAIDecision__DogFight                                                         = 16,
	ENPCAIDecision__CautionInPlace                                                   = 17,
	ENPCAIDecision__CautionInCover                                                   = 18,
	ENPCAIDecision__CheckSuspiciousPoint                                             = 19,
	ENPCAIDecision__SuspiciousPointClear                                             = 20,
	ENPCAIDecision__GoToNextPathNode                                                 = 21,
	ENPCAIDecision__FollowTargetBoss                                                 = 22,
	ENPCAIDecision__StandAndLookAround                                               = 23,
	ENPCAIDecision__PacingInPlace                                                    = 24,
	ENPCAIDecision__TakeMedicine                                                     = 25,
	ENPCAIDecision__CallHelp                                                         = 26,
	ENPCAIDecision__RushStrike                                                       = 27,
	ENPCAIDecision__RushFace                                                         = 28,
	ENPCAIDecision__LootNearby                                                       = 29,
	ENPCAIDecision__DodgeGrenade                                                     = 30,
	ENPCAIDecision__ThrowGrenade                                                     = 31,
	ENPCAIDecision__WaitInEscapeVolume                                               = 32,
	ENPCAIDecision__ShootFootstepCreator                                             = 33,
	ENPCAIDecision__KillDBNOEnemy                                                    = 34,
	ENPCAIDecision__SneakApproaching                                                 = 35,
	ENPCAIDecision__ReloadInGround                                                   = 36,
	ENPCAIDecision__ReloadInCover                                                    = 37,
	ENPCAIDecision__Overwatch                                                        = 38,
	ENPCAIDecision__ActiveAlarmDevice                                                = 39,
	ENPCAIDecision__Escape                                                           = 40,
	ENPCAIDecision__DodgeFire                                                        = 41,
	ENPCAIDecision__ThrowSmoke                                                       = 42,
	ENPCAIDecision__ProneShoot                                                       = 43,
	ENPCAIDecision__FindPronePoint                                                   = 44,
	ENPCAIDecision__CrouchShoot                                                      = 45,
	ENPCAIDecision__ProneSuppress                                                    = 46,
	ENPCAIDecision__CrouchSuppress                                                   = 47,
	ENPCAIDecision__StandSuppress                                                    = 48,
	ENPCAIDecision__DualCharge                                                       = 49,
	ENPCAIDecision__DualGuard                                                        = 50,
	ENPCAIDecision__Retreat                                                          = 51,
	ENPCAIDecision__ChangeCoverAfterNotAdvantage                                     = 52,
	ENPCAIDecision__QuickToHide                                                      = 53,
	ENPCAIDecision__ChangeCoverToCrouch                                              = 54,
	ENPCAIDecision__CrouchAimingInCover                                              = 55,
	ENPCAIDecision__CallForHelp                                                      = 56,
	ENPCAIDecision__RidiculeVoice                                                    = 57,
	ENPCAIDecision__StayInPlace                                                      = 58,
	ENPCAIDecision__PositionAdjustment                                               = 59,
	ENPCAIDecision__DodgeAttackMove                                                  = 60,
	ENPCAIDecision__MoveToLocNeedArrive                                              = 61,
	ENPCAIDecision__SmokeToAssistHide                                                = 62,
	ENPCAIDecision__TacticAction_RushFace                                            = 63,
	ENPCAIDecision__GrenadeToPeek                                                    = 64,
	ENPCAIDecision__DodgeGrenadeHold                                                 = 65,
	ENPCAIDecision__TeamMove                                                         = 66,
	ENPCAIDecision__ThrowStepCreator                                                 = 67,
	ENPCAIDecision__SuppressionChangeClose                                           = 68,
	ENPCAIDecision__SuppressionInPlace                                               = 69,
	ENPCAIDecision__SuppressionControlDistance                                       = 70,
	ENPCAIDecision__SuppressionDoor                                                  = 71,
	ENPCAIDecision__OutBattleVolume                                                  = 72,
	ENPCAIDecision__SlientDefenseDoor                                                = 73,
	ENPCAIDecision__SlientDefenseChangeFar                                           = 74,
	ENPCAIDecision__SlientDefenseControlDistance                                     = 75,
	ENPCAIDecision__HoldAreaWithWall                                                 = 76,
	ENPCAIDecision__HoldRoomWithWall                                                 = 77,
	ENPCAIDecision__FootStepCreatorMoveClose                                         = 78,
	ENPCAIDecision__FootStepCreatorMoveFar                                           = 79,
	ENPCAIDecision__OpenDoorRush                                                     = 80,
	ENPCAIDecision__OpenDoorSlient                                                   = 81,
	ENPCAIDecision__MoveToDoorSafePoint                                              = 82,
	ENPCAIDecision__EscapeRush                                                       = 83,
	ENPCAIDecision__EscapeSlient                                                     = 84,
	ENPCAIDecision__DodgeFlashProjectile                                             = 85,
	ENPCAIDecision__RandomRangeShoot                                                 = 86,
	ENPCAIDecision__GrassMove                                                        = 87,
	ENPCAIDecision__ProtectSafeBox                                                   = 88,
	ENPCAIDecision__PeekFromPeekMark                                                 = 89,
	ENPCAIDecision__PlaceTrapDevice                                                  = 90,
	ENPCAIDecision__CallHelpOnHit                                                    = 91,
	ENPCAIDecision__AroundFindEnemy                                                  = 92,
	ENPCAIDecision__AlwaysReload                                                     = 93,
	ENPCAIDecision__MeleeAttackOnReload                                              = 94,
	ENPCAIDecision__TakeMedicineOnHit                                                = 95,
	ENPCAIDecision__FoolShootOnHit                                                   = 96,
	ENPCAIDecision__BattleShow                                                       = 97,
	ENPCAIDecision__OutOfBattleAct                                                   = 98,
	ENPCAIDecision__OutOfAllyRange                                                   = 99
};

/// Enum /Script/MFNPCAI.EAIPerformance
/// Size: 0x01 (1 bytes)
enum class EAIPerformance : uint8_t
{
	EAIPerformance__None                                                             = 0,
	EAIPerformance__Camp1                                                            = 1,
	EAIPerformance__Camp2                                                            = 2,
	EAIPerformance__Camp3                                                            = 3,
	EAIPerformance__Camp4                                                            = 4,
	EAIPerformance__Camp5                                                            = 5,
	EAIPerformance__Camp6                                                            = 6,
	EAIPerformance__Camp7                                                            = 7,
	EAIPerformance__Camp8                                                            = 8,
	EAIPerformance__Camp9                                                            = 9,
	EAIPerformance__Camp10                                                           = 10,
	EAIPerformance__Camp11                                                           = 11,
	EAIPerformance__Camp12                                                           = 12,
	EAIPerformance__Boss1                                                            = 13,
	EAIPerformance__Boss2                                                            = 14,
	EAIPerformance__Boss3                                                            = 15,
	EAIPerformance__Boss4                                                            = 16,
	EAIPerformance__Boss5                                                            = 17,
	EAIPerformance__Boss519                                                          = 18,
	EAIPerformance__Boss520                                                          = 19,
	EAIPerformance__Boss                                                             = 20,
	EAIPerformance__EventBoss1                                                       = 21,
	EAIPerformance__EventBoss2                                                       = 22,
	EAIPerformance__EventFollower1                                                   = 23,
	EAIPerformance__EventFollower2                                                   = 24,
	EAIPerformance__Follower1                                                        = 25,
	EAIPerformance__Follower2                                                        = 26,
	EAIPerformance__Follower3                                                        = 27,
	EAIPerformance__Follower4                                                        = 28,
	EAIPerformance__Follower5                                                        = 29,
	EAIPerformance__Follower531                                                      = 30,
	EAIPerformance__Follower_6                                                       = 31,
	EAIPerformance__Follower_633                                                     = 32,
	EAIPerformance__Follower_634                                                     = 33,
	EAIPerformance__Follower_635                                                     = 34,
	EAIPerformance__Follower_636                                                     = 35,
	EAIPerformance__Follower_637                                                     = 36,
	EAIPerformance__PMC1                                                             = 37,
	EAIPerformance__PlayerScav1                                                      = 38
};

/// Enum /Script/MFNPCAI.EAISenseSourceType
/// Size: 0x01 (1 bytes)
enum class EAISenseSourceType : uint8_t
{
	EAISenseSourceType__EAISenseSourceType_Grenade                                   = 0
};

/// Enum /Script/MFNPCAI.EBlackboardEntryCondition
/// Size: 0x01 (1 bytes)
enum class EBlackboardEntryCondition : uint8_t
{
	EBlackboardEntryCondition__BlackboardEntryCondition_Equal                        = 0,
	EBlackboardEntryCondition__BlackboardEntryCondition_Greater                      = 1,
	EBlackboardEntryCondition__BlackboardEntryCondition_Less                         = 2
};

/// Enum /Script/MFNPCAI.ENPCKnowWeather
/// Size: 0x01 (1 bytes)
enum class ENPCKnowWeather : uint8_t
{
	ENPCKnowWeather__Normal                                                          = 0,
	ENPCKnowWeather__Fog                                                             = 1
};

/// Enum /Script/MFNPCAI.ENPCWeakenDebuffType
/// Size: 0x01 (1 bytes)
enum class ENPCWeakenDebuffType : uint8_t
{
	ENPCWeakenDebuffType__LoseSight                                                  = 0,
	ENPCWeakenDebuffType__Tinnitus                                                   = 1,
	ENPCWeakenDebuffType__Slowdown                                                   = 2
};

/// Enum /Script/MFNPCAI.ENPCPanicType
/// Size: 0x01 (1 bytes)
enum class ENPCPanicType : uint8_t
{
	ENPCPanicType__None                                                              = 0,
	ENPCPanicType__Run                                                               = 1,
	ENPCPanicType__Crouch                                                            = 2,
	ENPCPanicType__Prone                                                             = 3
};

/// Enum /Script/MFNPCAI.EAIMoveType
/// Size: 0x01 (1 bytes)
enum class EAIMoveType : uint8_t
{
	EAIMoveType__AIMoveType_Walk                                                     = 0,
	EAIMoveType__AIMoveType_Run                                                      = 1,
	EAIMoveType__AIMoveType_Sprint                                                   = 2
};

/// Enum /Script/MFNPCAI.EAILeanType
/// Size: 0x01 (1 bytes)
enum class EAILeanType : uint8_t
{
	EAILeanType__AILeanType_Center                                                   = 0,
	EAILeanType__AILeanType_Left                                                     = 1,
	EAILeanType__AILeanType_Right                                                    = 2
};

/// Enum /Script/MFNPCAI.EAIPose
/// Size: 0x01 (1 bytes)
enum class EAIPose : uint8_t
{
	EAIPose__AIPose_Stand                                                            = 0,
	EAIPose__AIPose_Crouch                                                           = 1,
	EAIPose__AIPose_Prone                                                            = 2,
	EAIPose__AIPose_Slide                                                            = 3,
	EAIPose__AIPose_Move                                                             = 4
};

/// Enum /Script/MFNPCAI.EAISpecialFireType
/// Size: 0x01 (1 bytes)
enum class EAISpecialFireType : uint8_t
{
	EAISpecialFireType__EAISpecialFireType_Miss                                      = 0
};

/// Enum /Script/MFNPCAI.EAILookPointMode
/// Size: 0x01 (1 bytes)
enum class EAILookPointMode : uint8_t
{
	EAILookPointMode__ToMovingDirection                                              = 0,
	EAILookPointMode__ToCustomPoint                                                  = 1,
	EAILookPointMode__NoSteering                                                     = 2
};

/// Class /Script/MFNPCAI.NPCBTService_BlueprintBase
/// Size: 0x0028 (40 bytes) (0x000070 - 0x000098) align 8 pad: 0x0000
class UNPCBTService_BlueprintBase : public UBTService
{ 
public:
	bool                                               bAsSharedInstance;                                          // 0x0070   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0071   (0x0007)  MISSED
	class AAIController*                               AIOwner;                                                    // 0x0078   (0x0008)  
	unsigned char                                      UnknownData01_6[0x14];                                      // 0x0080   (0x0014)  MISSED
	bool                                               bShowPropertyDetails : 1;                                   // 0x0094:0 (0x0001)  
	bool                                               bShowEventDetails : 1;                                      // 0x0094:1 (0x0001)  
	unsigned char                                      UnknownData02_7[0x3];                                       // 0x0095   (0x0003)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCBTService_BlueprintBase.ReceiveTickAI
	// void ReceiveTickAI(class AAIController* OwnerController, class APawn* ControlledPawn, float DeltaSeconds);               // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTService_BlueprintBase.ReceiveTick
	// void ReceiveTick(class AActor* OwnerActor, float DeltaSeconds);                                                          // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTService_BlueprintBase.ReceiveSearchStartAI
	// void ReceiveSearchStartAI(class AAIController* OwnerController, class APawn* ControlledPawn);                            // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTService_BlueprintBase.ReceiveSearchStart
	// void ReceiveSearchStart(class AActor* OwnerActor);                                                                       // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTService_BlueprintBase.ReceiveDeactivationAI
	// void ReceiveDeactivationAI(class AAIController* OwnerController, class APawn* ControlledPawn);                           // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTService_BlueprintBase.ReceiveDeactivation
	// void ReceiveDeactivation(class AActor* OwnerActor);                                                                      // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTService_BlueprintBase.ReceiveActivationAI
	// void ReceiveActivationAI(class AAIController* OwnerController, class APawn* ControlledPawn);                             // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTService_BlueprintBase.ReceiveActivation
	// void ReceiveActivation(class AActor* OwnerActor);                                                                        // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTService_BlueprintBase.IsServiceActive
	// bool IsServiceActive();                                                                                                  // [0x2e19560] Final|Native|Protected|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCBTService_BlueprintBase.GetOwnerPawn
	// class APawn* GetOwnerPawn();                                                                                             // [0x2e19530] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCBTService_BlueprintBase.GetOwnerController
	// class AAIController* GetOwnerController();                                                                               // [0x2e19500] Final|Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFNPCAI.NPCBTTask_BlueprintBase
/// Size: 0x0038 (56 bytes) (0x000070 - 0x0000A8) align 8 pad: 0x0000
class UNPCBTTask_BlueprintBase : public UBTTaskNode
{ 
public:
	bool                                               bAsSharedInstance;                                          // 0x0070   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0071   (0x0007)  MISSED
	class AAIController*                               AIOwner;                                                    // 0x0078   (0x0008)  
	FIntervalCountdown                                 TickInterval;                                               // 0x0080   (0x0008)  
	unsigned char                                      UnknownData01_6[0x1C];                                      // 0x0088   (0x001C)  MISSED
	bool                                               bShowPropertyDetails : 1;                                   // 0x00A4:0 (0x0001)  
	unsigned char                                      UnknownData02_7[0x3];                                       // 0x00A5   (0x0003)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCBTTask_BlueprintBase.SetFinishOnMessageWithId
	// void SetFinishOnMessageWithId(FName MessageName, int32_t RequestID);                                                     // [0x2e19680] Final|Native|Protected|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCBTTask_BlueprintBase.SetFinishOnMessage
	// void SetFinishOnMessage(FName MessageName);                                                                              // [0x2e195f0] Final|Native|Protected|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCBTTask_BlueprintBase.ReceiveTickAI
	// void ReceiveTickAI(class AAIController* OwnerController, class APawn* ControlledPawn, float DeltaSeconds);               // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTTask_BlueprintBase.ReceiveTick
	// void ReceiveTick(class AActor* OwnerActor, float DeltaSeconds);                                                          // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTTask_BlueprintBase.ReceiveExecuteAI
	// void ReceiveExecuteAI(class AAIController* OwnerController, class APawn* ControlledPawn);                                // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTTask_BlueprintBase.ReceiveExecute
	// void ReceiveExecute(class AActor* OwnerActor);                                                                           // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTTask_BlueprintBase.ReceiveAbortAI
	// void ReceiveAbortAI(class AAIController* OwnerController, class APawn* ControlledPawn);                                  // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTTask_BlueprintBase.ReceiveAbort
	// void ReceiveAbort(class AActor* OwnerActor);                                                                             // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTTask_BlueprintBase.IsTaskExecuting
	// bool IsTaskExecuting();                                                                                                  // [0x2e195c0] Final|Native|Protected|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCBTTask_BlueprintBase.IsTaskAborting
	// bool IsTaskAborting();                                                                                                   // [0x2e19590] Final|Native|Protected|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCBTTask_BlueprintBase.GetOwnerPawn
	// class APawn* GetOwnerPawn();                                                                                             // [0x2e19530] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCBTTask_BlueprintBase.GetOwnerController
	// class AAIController* GetOwnerController();                                                                               // [0x2e19500] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCBTTask_BlueprintBase.FinishExecute
	// void FinishExecute(bool bSuccess);                                                                                       // [0x2e19470] Final|Native|Protected|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCBTTask_BlueprintBase.FinishAbort
	// void FinishAbort();                                                                                                      // [0x2e19450] Final|Native|Protected|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCBTTask_LatenTaskBase
/// Size: 0x0008 (8 bytes) (0x0000A8 - 0x0000B0) align 8 pad: 0x0000
class UNPCBTTask_LatenTaskBase : public UNPCBTTask_BlueprintBase
{ 
public:
	float                                              TaskDuration;                                               // 0x00A8   (0x0004)  
	float                                              StartTime;                                                  // 0x00AC   (0x0004)  
};

/// Class /Script/MFNPCAI.NPCAINavModifierVolume
/// Size: 0x0020 (32 bytes) (0x000330 - 0x000350) align 8 pad: 0x0000
class ANPCAINavModifierVolume : public ANavModifierVolume
{ 
public:
	TArray<int64_t>                                    AffectedPolygons;                                           // 0x0330   (0x0010)  
	TArray<class ANPCAINavLinkProxy*>                  AffectedNavLinks;                                           // 0x0340   (0x0010)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAINavModifierVolume.SetupNavNodesAreaID
	// void SetupNavNodesAreaID();                                                                                              // [0x2dd2450] Final|Native|Protected 
	// Function /Script/MFNPCAI.NPCAINavModifierVolume.OnNavDataRegisteredCallback
	// void OnNavDataRegisteredCallback(class ANavigationData* NavData);                                                        // [0x2dd14e0] Final|Native|Protected 
	// Function /Script/MFNPCAI.NPCAINavModifierVolume.CollectAffectedNavNodes
	// void CollectAffectedNavNodes();                                                                                          // [0xca50c0] Native|Protected     
};

/// Class /Script/MFNPCAI.AIRuntimeMonitor
/// Size: 0x0058 (88 bytes) (0x000028 - 0x000080) align 8 pad: 0x0000
class UAIRuntimeMonitor : public UObject
{ 
public:
	SDK_UNDEFINED(80,600) /* TMap<FString, FAIRuntimeMonitorStatInfo> */ __um(StatMap);                            // 0x0028   (0x0050)  
	unsigned char                                      UnknownData00_7[0x8];                                       // 0x0078   (0x0008)  MISSED
};

/// Class /Script/MFNPCAI.AISceneEventMessage
/// Size: 0x0030 (48 bytes) (0x000028 - 0x000058) align 8 pad: 0x0000
class UAISceneEventMessage : public UObject
{ 
public:
	float                                              ValidTime;                                                  // 0x0028   (0x0004)  
	float                                              ValidScope;                                                 // 0x002C   (0x0004)  
	TArray<FString>                                    Tags;                                                       // 0x0030   (0x0010)  
	int32_t                                            EvtUniqueId;                                                // 0x0040   (0x0004)  
	float                                              StartTime;                                                  // 0x0044   (0x0004)  
	float                                              EndTime;                                                    // 0x0048   (0x0004)  
	FVector                                            TriggerLocation;                                            // 0x004C   (0x000C)  


	/// Functions
	// Function /Script/MFNPCAI.AISceneEventMessage.IsExpired
	// bool IsExpired(float CurrentTimeSec);                                                                                    // [0x2dadf50] Final|Native|Public  
};

/// Class /Script/MFNPCAI.AISceneEventsTriggerManager
/// Size: 0x0010 (16 bytes) (0x000028 - 0x000038) align 8 pad: 0x0000
class UAISceneEventsTriggerManager : public UObject
{ 
public:
	TArray<class UAISceneEventMessage*>                SceneEventsList;                                            // 0x0028   (0x0010)  


	/// Functions
	// Function /Script/MFNPCAI.AISceneEventsTriggerManager.TriggerSceneEvent
	// int32_t TriggerSceneEvent(class UAISceneEventMessage* SceneEvtMessage, FVector& TriggerLocation, float CoverInRange);    // [0x2dae8c0] Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.AISceneEventsTriggerManager.RemoveSceneEventByUniqueId
	// void RemoveSceneEventByUniqueId(int32_t EvtUniqueId);                                                                    // [0x2dae480] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.AISceneEventsTriggerManager.RemoveSceneEvent
	// void RemoveSceneEvent(class UAISceneEventMessage* SceneEvtMessage);                                                      // [0x16b0bd0] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.AISceneEventsTriggerManager.OnDSTick
	// void OnDSTick();                                                                                                         // [0x1da1980] Native|Public        
	// Function /Script/MFNPCAI.AISceneEventsTriggerManager.GetSceneEventByUniqueId
	// class UAISceneEventMessage* GetSceneEventByUniqueId(int32_t EvtUniqueId);                                                // [0x2dadbd0] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.AISceneEventsTriggerManager.FindNearSceneEvents
	// bool FindNearSceneEvents(TArray<UAISceneEventMessage*> ActivedEvents, FVector& CenterPos, float Radius);                 // [0x2dad400] Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.AISceneEventsTriggerManager.FilterExpiredSceneEvents
	// void FilterExpiredSceneEvents();                                                                                         // [0x2dad3e0] Final|Native|Public  
	// Function /Script/MFNPCAI.AISceneEventsTriggerManager.ClearExpiredSceneEventOnAI
	// void ClearExpiredSceneEventOnAI(int32_t EvtUniqueId);                                                                    // [0x2dacf00] Final|Native|Public  
};

/// Struct /Script/MFNPCAI.AISGDoorUsed
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FAISGDoorUsed
{ 
	class AActor*                                      SGDoor;                                                     // 0x0000   (0x0008)  
	class ACharacter*                                  AIPawn;                                                     // 0x0008   (0x0008)  
	float                                              UsedTime;                                                   // 0x0010   (0x0004)  
	char                                               WaitPersons;                                                // 0x0014   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x0015   (0x0003)  MISSED
};

/// Class /Script/MFNPCAI.AISGDoorManager
/// Size: 0x0028 (40 bytes) (0x000028 - 0x000050) align 8 pad: 0x0000
class UAISGDoorManager : public UObject
{ 
public:
	TArray<FAISGDoorUsed>                              AISGDoorUsedList;                                           // 0x0028   (0x0010)  
	SDK_UNDEFINED(16,601) /* TArray<TWeakObjectPtr<AActor*>> */ __um(DoorsInWorld);                                // 0x0038   (0x0010)  
	float                                              TimeFindDoorsInWorld;                                       // 0x0048   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x004C   (0x0004)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.AISGDoorManager.WantToWaitUsed
	// void WantToWaitUsed(class ACharacter* AIPawn, class AActor* SGDoor);                                                     // [0x2daebc0] Final|Native|Public  
	// Function /Script/MFNPCAI.AISGDoorManager.WantToUsedDoor
	// bool WantToUsedDoor(class ACharacter* AIPawn, class AActor* SGDoor);                                                     // [0x2daeaf0] Final|Native|Public  
	// Function /Script/MFNPCAI.AISGDoorManager.ReleaseUsedDoor
	// void ReleaseUsedDoor(class ACharacter* AIPawn);                                                                          // [0x2dae3f0] Final|Native|Public  
	// Function /Script/MFNPCAI.AISGDoorManager.InitDoorsInWorld
	// void InitDoorsInWorld(class UObject* WorldContext);                                                                      // [0x2dade90] Final|Native|Private 
	// Function /Script/MFNPCAI.AISGDoorManager.GetPawnUsedDoor
	// class AActor* GetPawnUsedDoor(class AActor* SGDoor);                                                                     // [0x2dadaf0] Final|Native|Public  
	// Function /Script/MFNPCAI.AISGDoorManager.GetDoor
	// class AActor* GetDoor(class UObject* WorldContext, FVector& DoorPoint);                                                  // [0x2dad8c0] Final|Native|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.AISGDoorManager.DoorIsBusy
	// bool DoorIsBusy(class AActor* SGDoor, class ACharacter* AIPawn);                                                         // [0x2dad310] Final|Native|Public  
	// Function /Script/MFNPCAI.AISGDoorManager.AutoRemoveInValidUsed
	// void AutoRemoveInValidUsed();                                                                                            // [0x2dace40] Final|Native|Public  
};

/// Class /Script/MFNPCAI.BehaviorTreeTooler
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UBehaviorTreeTooler : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.BehaviorTreeTooler.GetGameState
	// class AGameState* GetGameState(class UObject* World);                                                                    // [0x2dad9a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.BehaviorTreeTooler.GetClientWorld
	// class UWorld* GetClientWorld(class UObject* WorldContext);                                                               // [0x2dad760] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIActorComponent
/// Size: 0x0010 (16 bytes) (0x0000F8 - 0x000108) align 8 pad: 0x0000
class UNPCAIActorComponent : public UActorComponent
{ 
public:
	TArray<class UNPCAIProfileBaseComponent*>          PropertyComponents;                                         // 0x00F8   (0x0010)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAIActorComponent.GetAIPropertyByClass
	// class UNPCAIProfileBaseComponent* GetAIPropertyByClass(class UClass* InPropertyClass);                                   // [0x2dad5b0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/MFNPCAI.NPCAIAimingInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAIAimingInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIAimingInterface.UpdatePredestinedHit
	// void UpdatePredestinedHit();                                                                                             // [0x2daead0] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.TriggerPressedDone
	// void TriggerPressedDone(float WeaponRecoilParam);                                                                        // [0x2dae840] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.SetTargetEnemy
	// void SetTargetEnemy(class AActor* InEnemyPawn);                                                                          // [0x2a480d0] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.SetShootPartID
	// void SetShootPartID(char InShootPartID);                                                                                 // [0x2dae7c0] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.SetNextAimingDelay
	// void SetNextAimingDelay(float DelayTime);                                                                                // [0x2dae740] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.SetAimingPoint
	// void SetAimingPoint(FVector& InAimingPoint);                                                                             // [0x2dae510] Native|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIAimingInterface.NodeUpdate
	// void NodeUpdate();                                                                                                       // [0x2dae3b0] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.NextShotMiss
	// void NextShotMiss();                                                                                                     // [0x2dae390] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.NextShotHit
	// void NextShotHit();                                                                                                      // [0x2dae370] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.LoseTarget
	// void LoseTarget();                                                                                                       // [0x2dae350] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.IsWaitingStartAiming
	// bool IsWaitingStartAiming();                                                                                             // [0x2dae320] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.IsUsingPredestined
	// bool IsUsingPredestined();                                                                                               // [0x2dae2f0] Native|Public|Const  
	// Function /Script/MFNPCAI.NPCAIAimingInterface.IsReady
	// bool IsReady();                                                                                                          // [0x288bc90] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.IsNextShotMiss
	// bool IsNextShotMiss();                                                                                                   // [0x2dae1f0] Native|Public|Const  
	// Function /Script/MFNPCAI.NPCAIAimingInterface.IsNextShotHit
	// bool IsNextShotHit();                                                                                                    // [0x2dae1c0] Native|Public|Const  
	// Function /Script/MFNPCAI.NPCAIAimingInterface.IsInPullBolt
	// bool IsInPullBolt();                                                                                                     // [0x2dae190] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.IsFacingTargetPoint
	// bool IsFacingTargetPoint(FVector& TargetPoint, float AngleLimit);                                                        // [0x2dadfe0] Native|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIAimingInterface.HasAmmo
	// bool HasAmmo();                                                                                                          // [0x2dadd80] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.GetTargetEnemy
	// class AActor* GetTargetEnemy();                                                                                          // [0x28c0730] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.GetShootPartID
	// char GetShootPartID();                                                                                                   // [0x2dadc70] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.GetMaxShotCount
	// int32_t GetMaxShotCount();                                                                                               // [0x2dadac0] Native|Public|Const  
	// Function /Script/MFNPCAI.NPCAIAimingInterface.GetLastDist2Target
	// float GetLastDist2Target();                                                                                              // [0x2984220] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.GetHit
	// void GetHit(int32_t DamageInfo);                                                                                         // [0x2dada30] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.GetDimAimingPoint
	// FVector GetDimAimingPoint(float Scaler);                                                                                 // [0x2dad820] Native|Public|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIAimingInterface.GetCurrentShotCount
	// int32_t GetCurrentShotCount();                                                                                           // [0x2dad7f0] Native|Public|Const  
	// Function /Script/MFNPCAI.NPCAIAimingInterface.GetAimingPoint
	// FVector GetAimingPoint();                                                                                                // [0x2dad720] Native|Public|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIAimingInterface.GetAimingOffset
	// FVector GetAimingOffset(float WeakenTime);                                                                               // [0x2dad680] Native|Public|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIAimingInterface.GetAimingLeftTime
	// float GetAimingLeftTime();                                                                                               // [0x2dad650] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.ForceCompleteAim
	// void ForceCompleteAim();                                                                                                 // [0x2dad590] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.ClearNextShotMiss
	// void ClearNextShotMiss();                                                                                                // [0x2dacfd0] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.ClearNextShotHit
	// void ClearNextShotHit();                                                                                                 // [0x2dacfb0] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.ClearNextShotFlags
	// void ClearNextShotFlags();                                                                                               // [0x2dacf90] Native|Public        
	// Function /Script/MFNPCAI.NPCAIAimingInterface.CalculateRequiredAimingTime
	// float CalculateRequiredAimingTime(FVector& AimingPos);                                                                   // [0x2dace60] Native|Public|HasOutParms|HasDefaults 
};

/// Class /Script/MFNPCAI.NPCAIAreaVolumeInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAIAreaVolumeInterface : public UInterface
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIAsyncTaskBase
/// Size: 0x0010 (16 bytes) (0x000030 - 0x000040) align 8 pad: 0x0000
class UNPCAIAsyncTaskBase : public UBlueprintAsyncActionBase
{ 
public:
	bool                                               bSimpleTodo;                                                // 0x0030   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0031   (0x0007)  MISSED
	class AActor*                                      AIPawn;                                                     // 0x0038   (0x0008)  
};

/// Struct /Script/MFNPCAI.NPCAIAsyncTask
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FNPCAIAsyncTask
{ 
	class AActor*                                      AIPawn;                                                     // 0x0000   (0x0008)  
	ENPCAIAsyncTaskType                                Type;                                                       // 0x0008   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0009   (0x0007)  MISSED
	class UNPCAIAsyncTaskBase*                         AsyncTask;                                                  // 0x0010   (0x0008)  
};

/// Class /Script/MFNPCAI.NPCAIAsyncTaskSystem
/// Size: 0x0010 (16 bytes) (0x000030 - 0x000040) align 8 pad: 0x0000
class UNPCAIAsyncTaskSystem : public UWorldSubsystem
{ 
public:
	TArray<FNPCAIAsyncTask>                            AsyncTasks;                                                 // 0x0030   (0x0010)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAIAsyncTaskSystem.OnDSTick
	// void OnDSTick();                                                                                                         // [0x2dae3d0] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAIAsyncTaskSystem.HasTask
	// bool HasTask(class AActor* AIPawn, ENPCAIAsyncTaskType& InType);                                                         // [0x2daddb0] Final|Native|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCAIAsyncTaskSystem.GetTask
	// class UNPCAIAsyncTaskBase* GetTask(class AActor* AIPawn, ENPCAIAsyncTaskType& InType);                                   // [0x2dadca0] Final|Native|Public|HasOutParms 
};

/// Class /Script/MFNPCAI.NPCAIAttentionPoint
/// Size: 0x0078 (120 bytes) (0x000028 - 0x0000A0) align 8 pad: 0x0000
class UNPCAIAttentionPoint : public UObject
{ 
public:
	bool                                               bIsCome;                                                    // 0x0028   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0029   (0x0007)  MISSED
	class AActor*                                      Creator;                                                    // 0x0030   (0x0008)  
	unsigned char                                      UnknownData01_6[0x1];                                       // 0x0038   (0x0001)  MISSED
	bool                                               IsFootSounder;                                              // 0x0039   (0x0001)  
	unsigned char                                      UnknownData02_6[0x6];                                       // 0x003A   (0x0006)  MISSED
	class AActor*                                      FootSounderSpawnCharacter;                                  // 0x0040   (0x0008)  
	class AAIController*                               CheckingPlayer;                                             // 0x0048   (0x0008)  
	bool                                               bReachable;                                                 // 0x0050   (0x0001)  
	ENPCPlaceForCheckType                              PointType;                                                  // 0x0051   (0x0001)  
	unsigned char                                      UnknownData03_6[0x2];                                       // 0x0052   (0x0002)  MISSED
	float                                              CreatedTime;                                                // 0x0054   (0x0004)  
	float                                              DiedTime;                                                   // 0x0058   (0x0004)  
	unsigned char                                      UnknownData04_7[0x44];                                      // 0x005C   (0x0044)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIAttentionPoint.UpdatePointData
	// void UpdatePointData(float InNewCreateTime, FVector InNewPosition);                                                      // [0x2dae9f0] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIAttentionPoint.SetIsCome
	// void SetIsCome(bool InIsCome);                                                                                           // [0x2dae6b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIAttentionPoint.SetDieTime
	// void SetDieTime(float LifeTime);                                                                                         // [0x2dae630] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIAttentionPoint.SetCreator
	// void SetCreator(class AActor* InCreator);                                                                                // [0x2dae5a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIAttentionPoint.IsThisPointClose
	// bool IsThisPointClose(FVector InCheckLoc);                                                                               // [0x2dae250] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIAttentionPoint.IsOld
	// bool IsOld();                                                                                                            // [0x2dae220] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIAttentionPoint.IsGrenadeHolding
	// bool IsGrenadeHolding();                                                                                                 // [0x2dae160] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIAttentionPoint.IsGrenadeHit
	// bool IsGrenadeHit();                                                                                                     // [0x2dae130] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIAttentionPoint.IsGrenadeComing
	// bool IsGrenadeComing();                                                                                                  // [0x2dae100] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIAttentionPoint.IsFatal
	// bool IsFatal();                                                                                                          // [0x2dae0d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIAttentionPoint.IsDanger
	// bool IsDanger();                                                                                                         // [0x2dadf20] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIAttentionPoint.GetPosition
	// FVector GetPosition();                                                                                                   // [0x2dadb90] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIAttentionPoint.CreateNewAttentionPointWithCoverPointID
	// class UNPCAIAttentionPoint* CreateNewAttentionPointWithCoverPointID(class UObject* InHolder, int32_t InCoverPointID, FVector InBaseLoc, ENPCPlaceForCheckType InType, class AActor* InCreator); // [0x2dad150] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIAttentionPoint.CreateNewAttentionPoint
	// class UNPCAIAttentionPoint* CreateNewAttentionPoint(class UObject* InHolder, FVector InLoc, ENPCPlaceForCheckType InType, class AActor* InCreator); // [0x2dacff0] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIBattleVolumeInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAIBattleVolumeInterface : public UInterface
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIBehaviorHistoryDebugInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAIBehaviorHistoryDebugInterface : public UInterface
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAICharacterInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAICharacterInterface : public UInterface
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIControllerInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAIControllerInterface : public UInterface
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAICoverEnvQueryData
/// Size: 0x01A8 (424 bytes) (0x000028 - 0x0001D0) align 8 pad: 0x0000
class UNPCAICoverEnvQueryData : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0xA8];                                      // 0x0028   (0x00A8)  MISSED
	FVector                                            Generator_Location;                                         // 0x00D0   (0x000C)  
	float                                              Generator_Radius;                                           // 0x00DC   (0x0004)  
	class AVolume*                                     Generator_BotZoneVolume;                                    // 0x00E0   (0x0008)  
	float                                              IsFree_TreatAsFreeAfterSeconds;                             // 0x00E8   (0x0004)  
	float                                              IsSafe_TreatAsSafeAfterSeconds;                             // 0x00EC   (0x0004)  
	FVector                                            IsNear_Location;                                            // 0x00F0   (0x000C)  
	float                                              IsNear_Distance;                                            // 0x00FC   (0x0004)  
	bool                                               IsNear_Reversed;                                            // 0x0100   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0101   (0x0003)  MISSED
	FVector                                            CloserRatio_Location;                                       // 0x0104   (0x000C)  
	float                                              CloserRatio_Ratio;                                          // 0x0110   (0x0004)  
	FVector                                            CanContain_TargetLocation;                                  // 0x0114   (0x000C)  
	float                                              CanContain_HorizontalAngle;                                 // 0x0120   (0x0004)  
	float                                              CanContain_TopAngle;                                        // 0x0124   (0x0004)  
	float                                              CanContain_BottomAngle;                                     // 0x0128   (0x0004)  
	FVector                                            CanAttackTo_TargetLocation;                                 // 0x012C   (0x000C)  
	TArray<class AActor*>                              CanAttackTo_IgnoredActors;                                  // 0x0138   (0x0010)  
	FVector                                            PathLength_StartLocation;                                   // 0x0148   (0x000C)  
	float                                              PathLength_MaxPathLength;                                   // 0x0154   (0x0004)  
	float                                              PathLength_MaxRatio;                                        // 0x0158   (0x0004)  
	float                                              PathLength_CheckPoint;                                      // 0x015C   (0x0004)  
	float                                              DefenceRatio_MinRatio;                                      // 0x0160   (0x0004)  
	float                                              DefenceAngle_MinAngle;                                      // 0x0164   (0x0004)  
	TArray<FVector>                                    DistanceToHotPoint_Locations;                               // 0x0168   (0x0010)  
	FVector                                            DistanceToAllyCover_Location;                               // 0x0178   (0x000C)  
	float                                              DistanceToAllyCover_MinDistance;                            // 0x0184   (0x0004)  
	FVector                                            IsSameSideToTarget_TargetLocation;                          // 0x0188   (0x000C)  
	FVector                                            IsSameSideToTarget_TargetDirection;                         // 0x0194   (0x000C)  
	FVector                                            IsInCone_Location;                                          // 0x01A0   (0x000C)  
	FVector                                            IsInCone_Direction;                                         // 0x01AC   (0x000C)  
	float                                              IsInCone_Radius;                                            // 0x01B8   (0x0004)  
	float                                              IsInCone_Angle;                                             // 0x01BC   (0x0004)  
	FVector                                            CoverDist_Location;                                         // 0x01C0   (0x000C)  
	float                                              CoverDist_MaxDistance;                                      // 0x01CC   (0x0004)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAICoverEnvQueryData.SetupPathLength
	// void SetupPathLength(FVector& Location, float MaxPathLength, float MaxRatio, float CheckPointPathLength);                // [0x2db2c60] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverEnvQueryData.SetupIsSameSideToTarget
	// void SetupIsSameSideToTarget(FVector& Location, FVector& Direction);                                                     // [0x2db2b80] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverEnvQueryData.SetupIsSafe
	// void SetupIsSafe(float TreatAsSafeAfterSeconds);                                                                         // [0x2db2b00] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverEnvQueryData.SetupIsIsNear
	// void SetupIsIsNear(FVector& Location, float Distance, bool bReversed);                                                   // [0x2db29e0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverEnvQueryData.SetupIsInCone
	// void SetupIsInCone(FVector& Location, FVector& Direction, float Radius, float Angle);                                    // [0x2db2860] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverEnvQueryData.SetupIsFree
	// void SetupIsFree(float TreatAsFreeAfterSeconds);                                                                         // [0x2db27e0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverEnvQueryData.SetupIsCloserRatio
	// void SetupIsCloserRatio(FVector& Location, float Ratio);                                                                 // [0x2db2700] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverEnvQueryData.SetupGenerator
	// void SetupGenerator(FVector& Location, float Radius, class AVolume* BotZoneVolume);                                      // [0x2db25f0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverEnvQueryData.SetupDistanceToHotPoint
	// void SetupDistanceToHotPoint(TArray<FVector>& Locations);                                                                // [0x2db2540] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverEnvQueryData.SetupDistanceToAllyCover
	// void SetupDistanceToAllyCover(FVector& Location, float MinDistance);                                                     // [0x2db2460] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverEnvQueryData.SetupDefenceRatio
	// void SetupDefenceRatio(float MinRatio);                                                                                  // [0x2db23e0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverEnvQueryData.SetupDefenceAngle
	// void SetupDefenceAngle(float MinAngle);                                                                                  // [0x2db2360] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverEnvQueryData.SetupCoverDist
	// void SetupCoverDist(FVector& Location, float MaxDistance);                                                               // [0x2db2280] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverEnvQueryData.SetupCanContain
	// void SetupCanContain(FVector& Location, float HorizontalAngle, float TopAngle, float BottomAngle);                       // [0x2db2110] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverEnvQueryData.SetupCanAttackTo
	// void SetupCanAttackTo(FVector& Location, TArray<AActor*>& IgnoredActors);                                                // [0x2db1fe0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAICoverEnvQueryGenerator
/// Size: 0x0008 (8 bytes) (0x000210 - 0x000218) align 8 pad: 0x0000
class UNPCAICoverEnvQueryGenerator : public UEnvQueryGenerator_OnCircle
{ 
public:
	class UCoverSystem*                                CacheCoverSystem;                                           // 0x0210   (0x0008)  
};

/// Class /Script/MFNPCAI.NPCAICoverEnvQueryTest_CanAttackTo
/// Size: 0x0000 (0 bytes) (0x0001F8 - 0x0001F8) align 8 pad: 0x0000
class UNPCAICoverEnvQueryTest_CanAttackTo : public UEnvQueryTest
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAICoverEnvQueryTest_CanContain
/// Size: 0x0000 (0 bytes) (0x0001F8 - 0x0001F8) align 8 pad: 0x0000
class UNPCAICoverEnvQueryTest_CanContain : public UEnvQueryTest
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAICoverEnvQueryTest_CloserRatio
/// Size: 0x0000 (0 bytes) (0x0001F8 - 0x0001F8) align 8 pad: 0x0000
class UNPCAICoverEnvQueryTest_CloserRatio : public UEnvQueryTest
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAICoverEnvQueryTest_CoverDist
/// Size: 0x0000 (0 bytes) (0x0001F8 - 0x0001F8) align 8 pad: 0x0000
class UNPCAICoverEnvQueryTest_CoverDist : public UEnvQueryTest
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAICoverEnvQueryTest_DefenceAngle
/// Size: 0x0000 (0 bytes) (0x0001F8 - 0x0001F8) align 8 pad: 0x0000
class UNPCAICoverEnvQueryTest_DefenceAngle : public UEnvQueryTest
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAICoverEnvQueryTest_DefenceRatio
/// Size: 0x0000 (0 bytes) (0x0001F8 - 0x0001F8) align 8 pad: 0x0000
class UNPCAICoverEnvQueryTest_DefenceRatio : public UEnvQueryTest
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAICoverEnvQueryTest_DistanceToAllyCover
/// Size: 0x0000 (0 bytes) (0x0001F8 - 0x0001F8) align 8 pad: 0x0000
class UNPCAICoverEnvQueryTest_DistanceToAllyCover : public UEnvQueryTest
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAICoverEnvQueryTest_DistanceToHotPoint
/// Size: 0x0000 (0 bytes) (0x0001F8 - 0x0001F8) align 8 pad: 0x0000
class UNPCAICoverEnvQueryTest_DistanceToHotPoint : public UEnvQueryTest
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAICoverEnvQueryTest_IsFree
/// Size: 0x0000 (0 bytes) (0x0001F8 - 0x0001F8) align 8 pad: 0x0000
class UNPCAICoverEnvQueryTest_IsFree : public UEnvQueryTest
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAICoverEnvQueryTest_IsInCone
/// Size: 0x0000 (0 bytes) (0x0001F8 - 0x0001F8) align 8 pad: 0x0000
class UNPCAICoverEnvQueryTest_IsInCone : public UEnvQueryTest
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAICoverEnvQueryTest_IsNear
/// Size: 0x0000 (0 bytes) (0x0001F8 - 0x0001F8) align 8 pad: 0x0000
class UNPCAICoverEnvQueryTest_IsNear : public UEnvQueryTest
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAICoverEnvQueryTest_IsSafe
/// Size: 0x0000 (0 bytes) (0x0001F8 - 0x0001F8) align 8 pad: 0x0000
class UNPCAICoverEnvQueryTest_IsSafe : public UEnvQueryTest
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAICoverEnvQueryTest_IsSameSideToTarget
/// Size: 0x0000 (0 bytes) (0x0001F8 - 0x0001F8) align 8 pad: 0x0000
class UNPCAICoverEnvQueryTest_IsSameSideToTarget : public UEnvQueryTest
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAICoverEnvQueryTest_PathLength
/// Size: 0x0008 (8 bytes) (0x0001F8 - 0x000200) align 8 pad: 0x0000
class UNPCAICoverEnvQueryTest_PathLength : public UEnvQueryTest
{ 
public:
	bool                                               bEnabledDebug;                                              // 0x01F8   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x01F9   (0x0007)  MISSED
};

/// Class /Script/MFNPCAI.NPCAICoverEnvQueryTest_Protection
/// Size: 0x0008 (8 bytes) (0x0001F8 - 0x000200) align 8 pad: 0x0000
class UNPCAICoverEnvQueryTest_Protection : public UEnvQueryTest
{ 
public:
	class UClass*                                      ProtectionFrom;                                             // 0x01F8   (0x0008)  
};

/// Class /Script/MFNPCAI.NPCAICoverEnvQueryTest_ShootDistance
/// Size: 0x0008 (8 bytes) (0x0001F8 - 0x000200) align 8 pad: 0x0000
class UNPCAICoverEnvQueryTest_ShootDistance : public UEnvQueryTest
{ 
public:
	class UClass*                                      ShootDistanceTo;                                            // 0x01F8   (0x0008)  
};

/// Class /Script/MFNPCAI.NPCAICoverSystemStatics
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAICoverSystemStatics : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAICoverSystemStatics.TestCoverPoints_IsSafe
	// bool TestCoverPoints_IsSafe(TArray<int32_t>& InPoints, float SecondsAfterLastSpotted, TArray<int32_t>& PassPoints, class UObject* WorldContextObject); // [0x2db3b00] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverSystemStatics.TestCoverPoints_IsNear
	// bool TestCoverPoints_IsNear(TArray<int32_t>& InPoints, FVector& Location, float Distance, bool bReversed, TArray<int32_t>& PassPoints, class UObject* WorldContextObject); // [0x2db38d0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverSystemStatics.TestCoverPoints_IsFree
	// bool TestCoverPoints_IsFree(TArray<int32_t>& InPoints, class AActor* InActor, float TreatAsFreeAfterSeconds, TArray<int32_t>& PassPoints, class UObject* WorldContextObject); // [0x2db3700] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverSystemStatics.TestCoverPoints_HasNavPath
	// bool TestCoverPoints_HasNavPath(TArray<int32_t>& InPoints, FVector& StartLocation, float MaxPathLenght, TArray<int32_t>& PassPoints, class UObject* WorldContextObject); // [0x2db3510] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverSystemStatics.TestCoverPoints_CanProtectPose
	// bool TestCoverPoints_CanProtectPose(TArray<int32_t>& InPoints, ENPCPoseType PoseType, TArray<int32_t>& PassPoints, class UObject* WorldContextObject); // [0x2db3370] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverSystemStatics.TestCoverPoints_CanContain
	// bool TestCoverPoints_CanContain(TArray<int32_t>& InPoints, FVector& Location, float HorizontalAngle, float TopAngle, float BottomAngle, TArray<int32_t>& PassPoints, class UObject* WorldContextObject); // [0x2db3110] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverSystemStatics.TestCoverPoints_CanAttackTo
	// bool TestCoverPoints_CanAttackTo(TArray<int32_t>& InPoints, FVector& Location, TArray<AActor*>& IgnoredActors, TArray<int32_t>& PassPoints, class UObject* WorldContextObject); // [0x2db2ed0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverSystemStatics.TestCoverPoint_IsSafe
	// bool TestCoverPoint_IsSafe(int32_t InPointID, float SecondsAfterLastSpotted, class UObject* WorldContextObject);         // [0x2db2dd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverSystemStatics.SetCoverPointSpotted
	// bool SetCoverPointSpotted(int32_t PointID, class UObject* WorldContextObject);                                           // [0x2db1f10] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverSystemStatics.SetCoverPointOwner
	// bool SetCoverPointOwner(int32_t PointID, class AActor* Actor, float Radius, class UObject* WorldContextObject);          // [0x2db1dd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverSystemStatics.RunEQSQuery_FindBackUpCoverPointNearBy
	// class UEnvQueryInstanceBlueprintWrapper* RunEQSQuery_FindBackUpCoverPointNearBy(class UObject* WorldContextObject, class UEnvQuery* QueryTemplate, class AActor* Querier, FVector& InEnemyPos, float InRadiusNoCheck, TEnumAsByte<EEnvQueryRunMode> RunMode, class UClass* WrapperClass); // [0x2db1bb0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverSystemStatics.RemoveCoverPointBeTaked
	// void RemoveCoverPointBeTaked(class AActor* InAIPawn);                                                                    // [0x2db1b30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverSystemStatics.GetQueryResultsAsCoverIDs
	// bool GetQueryResultsAsCoverIDs(class UEnvQueryInstanceBlueprintWrapper* QueryInstanceBPWrapper, TArray<int32_t>& PassPoints); // [0x2db1a10] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverSystemStatics.GetCoverSystem
	// class UCoverSystem* GetCoverSystem(class UObject* WorldContextObject);                                                   // [0x2db1980] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAICoverSystemStatics.GetCoverPointPoseDataArray
	// bool GetCoverPointPoseDataArray(int32_t PointID, TArray<FCoverPoseData>& PoseDataArray, FVector& RightDirection, class UObject* WorldContextObject); // [0x2db1800] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverSystemStatics.GetCoverPointLocationAndDirection
	// bool GetCoverPointLocationAndDirection(int32_t PointID, FVector& Location, FVector& Direction, class UObject* WorldContextObject); // [0x2db1690] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverSystemStatics.GetCoverPointData
	// bool GetCoverPointData(int32_t PointID, FCoverPointOctreeData& Data, class UObject* WorldContextObject);                 // [0x2db1530] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverSystemStatics.FindNearestCoverPoint
	// bool FindNearestCoverPoint(FVector& Location, float EdgeSize, FVector& CoverLocation, class UObject* WorldContextObject); // [0x2db13c0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverSystemStatics.FindCoverPointsInSphere
	// bool FindCoverPointsInSphere(FVector Location, float Radius, TArray<int32_t>& Points, class UObject* WorldContextObject); // [0x2db1230] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAICoverSystemStatics.FindCoverPointsInPathLength
	// bool FindCoverPointsInPathLength(class AActor* AIPawn, float PathLength, TArray<FVector>& PointsPos);                    // [0x2db1100] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIDamageData
/// Size: 0x0018 (24 bytes) (0x000028 - 0x000040) align 8 pad: 0x0000
class UNPCAIDamageData : public UObject
{ 
public:
	float                                              TimeDamage;                                                 // 0x0028   (0x0004)  
	FVector                                            position;                                                   // 0x002C   (0x000C)  
	float                                              CachedMaxActiveTime;                                        // 0x0038   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x003C   (0x0004)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIDamageData.IsActive
	// bool IsActive();                                                                                                         // [0x2db1b00] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/MFNPCAI.NPCAIDoorInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAIDoorInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIDoorInterface.IsDoorLocked
	// bool IsDoorLocked();                                                                                                     // [0x29cc100] Native|Public        
	// Function /Script/MFNPCAI.NPCAIDoorInterface.IsDoorClosed
	// bool IsDoorClosed();                                                                                                     // [0x288bc90] Native|Public        
};

/// Class /Script/MFNPCAI.NPCAIDoorOpenInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAIDoorOpenInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIDoorOpenInterface.IsDoorOpened
	// bool IsDoorOpened(class AActor* InDoor);                                                                                 // [0x2db7b60] Native|Public        
};

/// Class /Script/MFNPCAI.NPCAIDynamicGroupInfo
/// Size: 0x0030 (48 bytes) (0x000028 - 0x000058) align 8 pad: 0x0000
class UNPCAIDynamicGroupInfo : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0028   (0x0008)  MISSED
	int32_t                                            DyGroupId;                                                  // 0x0030   (0x0004)  
	float                                              CreateTime;                                                 // 0x0034   (0x0004)  
	bool                                               CanAutoRelease;                                             // 0x0038   (0x0001)  
	unsigned char                                      UnknownData01_6[0x7];                                       // 0x0039   (0x0007)  MISSED
	TArray<class AActor*>                              AllyList;                                                   // 0x0040   (0x0010)  
	class UWorld*                                      WorldPrivate;                                               // 0x0050   (0x0008)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAIDynamicGroupInfo.GetTimeSeconds
	// float GetTimeSeconds();                                                                                                  // [0x288fef0] Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIDynamicGroupInfo.GetAllyList
	// TArray<AActor*> GetAllyList();                                                                                           // [0x2db7860] Native|Public|BlueprintCallable|BlueprintPure 
};

/// Struct /Script/MFNPCAI.AIShotCountStat
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 4 pad: 0x0000
struct FAIShotCountStat
{ 
	int32_t                                            Count;                                                      // 0x0000   (0x0004)  
	float                                              LastTime;                                                   // 0x0004   (0x0004)  
	float                                              FirstTime;                                                  // 0x0008   (0x0004)  
	float                                              IntervalToClear;                                            // 0x000C   (0x0004)  
};

/// Class /Script/MFNPCAI.NPCAITargetInfoBase
/// Size: 0x0038 (56 bytes) (0x000028 - 0x000060) align 8 pad: 0x0000
class UNPCAITargetInfoBase : public UObject
{ 
public:
	float                                              FirstTimeSeen;                                              // 0x0028   (0x0004)  
	float                                              TimeToForgorAboutEnemySec;                                  // 0x002C   (0x0004)  
	FAIShotCountStat                                   BeFireCount;                                                // 0x0030   (0x0010)  
	FAIShotCountStat                                   BeHitCount;                                                 // 0x0040   (0x0010)  
	float                                              EnemyStartSeenTime;                                         // 0x0050   (0x0004)  
	float                                              EnemyLastSeenTime;                                          // 0x0054   (0x0004)  
	float                                              EnemyLastKnowTime;                                          // 0x0058   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x005C   (0x0004)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAITargetInfoBase.SetTimeToForgorAboutEnemySec
	// void SetTimeToForgorAboutEnemySec(float Value);                                                                          // [0x2e09670] Native|Public        
	// Function /Script/MFNPCAI.NPCAITargetInfoBase.SetTimeLastSeen
	// void SetTimeLastSeen(float InNowTime);                                                                                   // [0x1983360] Native|Public        
	// Function /Script/MFNPCAI.NPCAITargetInfoBase.SetTimeLastKnow
	// void SetTimeLastKnow(float InNowTime);                                                                                   // [0x2e095e0] Native|Public        
	// Function /Script/MFNPCAI.NPCAITargetInfoBase.SetFirstTimeSeen
	// void SetFirstTimeSeen(float InNowTime);                                                                                  // [0x1da1d10] Native|Public        
	// Function /Script/MFNPCAI.NPCAITargetInfoBase.SetBeHitTime
	// void SetBeHitTime(float InNowTime);                                                                                      // [0x2e093a0] Native|Public        
	// Function /Script/MFNPCAI.NPCAITargetInfoBase.SetBeFireTime
	// void SetBeFireTime(float InNowTime);                                                                                     // [0x2e09310] Native|Public        
	// Function /Script/MFNPCAI.NPCAITargetInfoBase.GetTimeToForgorAboutEnemySec
	// float GetTimeToForgorAboutEnemySec();                                                                                    // [0x2e08b90] Native|Public        
	// Function /Script/MFNPCAI.NPCAITargetInfoBase.GetTimeLastSeen
	// float GetTimeLastSeen();                                                                                                 // [0x2e08b50] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfoBase.GetTimeLastKnow
	// float GetTimeLastKnow();                                                                                                 // [0x2e08b10] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfoBase.GetLastBeHitTime
	// float GetLastBeHitTime();                                                                                                // [0x2e08730] Native|Public        
	// Function /Script/MFNPCAI.NPCAITargetInfoBase.GetLastBeFireTime
	// float GetLastBeFireTime();                                                                                               // [0x2e086f0] Native|Public        
	// Function /Script/MFNPCAI.NPCAITargetInfoBase.GetFirstTimeSeen
	// float GetFirstTimeSeen();                                                                                                // [0x288feb0] Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAITargetInfoBase.GetFirstBeHitTime
	// float GetFirstBeHitTime();                                                                                               // [0x2e082c0] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfoBase.GetFirstBeFireTime
	// float GetFirstBeFireTime();                                                                                              // [0x2e08280] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfoBase.GetBeHitCount
	// int32_t GetBeHitCount();                                                                                                 // [0x2e07aa0] Native|Public        
	// Function /Script/MFNPCAI.NPCAITargetInfoBase.GetBeFireCount
	// int32_t GetBeFireCount();                                                                                                // [0x2e07a70] Native|Public        
};

/// Class /Script/MFNPCAI.NPCAIEnemyGroupSingleInfo
/// Size: 0x0048 (72 bytes) (0x000060 - 0x0000A8) align 8 pad: 0x0000
class UNPCAIEnemyGroupSingleInfo : public UNPCAITargetInfoBase
{ 
public:
	bool                                               IsTemporaryEnemy;                                           // 0x0060   (0x0001)  
	bool                                               IsTemporaryEnemyFromAlly;                                   // 0x0061   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x0062   (0x0002)  MISSED
	float                                              EndTimeOfTemporaryEnemy;                                    // 0x0064   (0x0004)  
	FVector                                            EnemyLastSeenPosition;                                      // 0x0068   (0x000C)  
	float                                              EndTimeOfSupressed;                                         // 0x0074   (0x0004)  
	float                                              LastTimeCreateSuspectedPoint;                               // 0x0078   (0x0004)  
	float                                              PersonInValidTime;                                          // 0x007C   (0x0004)  
	class AActor*                                      Person;                                                     // 0x0080   (0x0008)  
	int32_t                                            HatredValue;                                                // 0x0088   (0x0004)  
	float                                              HatredEndtime;                                              // 0x008C   (0x0004)  
	float                                              LastShootGroupAllyTime;                                     // 0x0090   (0x0004)  
	int32_t                                            SuspectedPointCreatedNum;                                   // 0x0094   (0x0004)  
	float                                              LastIncreaseTimeSuspectedPoint;                             // 0x0098   (0x0004)  
	FVector                                            EnemyLastEstimatePosition;                                  // 0x009C   (0x000C)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAIEnemyGroupSingleInfo.SetTemporaryEnemyInfo
	// void SetTemporaryEnemyInfo(bool InIsTemporaryEnemy, float InExpiredTime, bool InIsFromAlly);                             // [0x2db8140] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIEnemyGroupSingleInfo.SetSuppressEndTime
	// void SetSuppressEndTime(float InEndTime);                                                                                // [0x2db80c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIEnemyGroupSingleInfo.SetLastShootGroupAllyTime
	// void SetLastShootGroupAllyTime(float InTime);                                                                            // [0x2db8040] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIEnemyGroupSingleInfo.SetHatredValue
	// void SetHatredValue(int32_t InHatredValue, float InEndTime);                                                             // [0x2db7f70] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIEnemyGroupSingleInfo.SetEnemyLastVisibleInfo
	// void SetEnemyLastVisibleInfo(FVector InLastSeenPosition, float InLastSeenTime);                                          // [0x2db7e90] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIEnemyGroupSingleInfo.SetEnemyLastEstimatePosition
	// void SetEnemyLastEstimatePosition(class AActor* InEnemy, FVector InPosition);                                            // [0x2db7db0] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIEnemyGroupSingleInfo.IsRealValidEnemy
	// bool IsRealValidEnemy(float InNowTime);                                                                                  // [0x2db7c00] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIEnemyGroupSingleInfo.GetSuspectedPointCreatedNum
	// int32_t GetSuspectedPointCreatedNum(class AActor* InAIPawn);                                                             // [0x2db7ac0] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAIEnemyGroupSingleInfo.GetPerson
	// class AActor* GetPerson();                                                                                               // [0x2db7a00] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIEnemyGroupSingleInfo.GetLastShootGroupAllyTime
	// float GetLastShootGroupAllyTime();                                                                                       // [0x2db79d0] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIEnemyGroupSingleInfo.GetHatredValue
	// int32_t GetHatredValue(float InNowTime);                                                                                 // [0x2db7940] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIEnemyGroupSingleInfo.GetEnemyLastEstimatePosition
	// FVector GetEnemyLastEstimatePosition();                                                                                  // [0x2db78d0] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIEnemyGroupSingleInfo.CalculateSuspectedPointCreatedNum
	// void CalculateSuspectedPointCreatedNum(class AActor* InAIPawn);                                                          // [0x2db7720] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAIEnemyGroupSingleInfo.AddSuspectedPointCreatedNum
	// void AddSuspectedPointCreatedNum(class AActor* InAIPawn);                                                                // [0x2db7690] Final|Native|Public  
};

/// Class /Script/MFNPCAI.NPCAIEnvQueryGenerator_BlueprintBase
/// Size: 0x0040 (64 bytes) (0x000080 - 0x0000C0) align 8 pad: 0x0000
class UNPCAIEnvQueryGenerator_BlueprintBase : public UEnvQueryGenerator_BlueprintBase
{ 
public:
	FAIDataProviderIntValue                            IntParam;                                                   // 0x0080   (0x0038)  
	unsigned char                                      UnknownData00_7[0x8];                                       // 0x00B8   (0x0008)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIEnvQueryGenerator_BlueprintBase.GetQueryIntParam
	// int32_t GetQueryIntParam(FName& ParamName);                                                                              // [0x2db7a20] Final|Native|Public|HasOutParms|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/MFNPCAI.NPCAIEnvQueryGenerator_OnPolyCenter
/// Size: 0x00E8 (232 bytes) (0x000210 - 0x0002F8) align 8 pad: 0x0000
class UNPCAIEnvQueryGenerator_OnPolyCenter : public UEnvQueryGenerator_OnCircle
{ 
public:
	FAIDataProviderBoolValue                           OnlyCurrentRegion;                                          // 0x0210   (0x0038)  
	FAIDataProviderBoolValue                           IncludeNavMeshPolyCenters;                                  // 0x0248   (0x0038)  
	FAIDataProviderBoolValue                           IncludeNavMeshInternalEdges;                                // 0x0280   (0x0038)  
	FAIDataProviderBoolValue                           IncludeNavMeshBoundaryEdges;                                // 0x02B8   (0x0038)  
	float                                              PointZOffset;                                               // 0x02F0   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x02F4   (0x0004)  MISSED
};

/// Class /Script/MFNPCAI.NPCAIEnvQueryInstanceBlueprintWrapper
/// Size: 0x0008 (8 bytes) (0x000078 - 0x000080) align 8 pad: 0x0000
class UNPCAIEnvQueryInstanceBlueprintWrapper : public UEnvQueryInstanceBlueprintWrapper
{ 
public:
	float                                              QueryTime;                                                  // 0x0078   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x007C   (0x0004)  MISSED
};

/// Class /Script/MFNPCAI.NPCAIEnvQueryItemType_CoverPoint
/// Size: 0x0000 (0 bytes) (0x000030 - 0x000030) align 8 pad: 0x0000
class UNPCAIEnvQueryItemType_CoverPoint : public UEnvQueryItemType_VectorBase
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIEnvQueryManager
/// Size: 0x0000 (0 bytes) (0x000140 - 0x000140) align 8 pad: 0x0000
class UNPCAIEnvQueryManager : public UEnvQueryManager
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIEnvQueryTest_BlueprintBase
/// Size: 0x0020 (32 bytes) (0x0001F8 - 0x000218) align 8 pad: 0x0000
class UNPCAIEnvQueryTest_BlueprintBase : public UEnvQueryTest
{ 
public:
	class UClass*                                      Context;                                                    // 0x01F8   (0x0008)  
	FText                                              TestDescription;                                            // 0x0200   (0x0018)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAIEnvQueryTest_BlueprintBase.CalcScore
	// float CalcScore(class AActor* ItemActor, TArray<AActor*>& ContextActors);                                                // [0x3a75280] Event|Public|HasOutParms|BlueprintEvent|Const 
};

/// Class /Script/MFNPCAI.NPCAIEnvQueryTest_PathfindingFromQuerier
/// Size: 0x0040 (64 bytes) (0x0001F8 - 0x000238) align 8 pad: 0x0000
class UNPCAIEnvQueryTest_PathfindingFromQuerier : public UEnvQueryTest
{ 
public:
	TEnumAsByte<EEnvTestPathfinding>                   TestMode;                                                   // 0x01F8   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x01F9   (0x0007)  MISSED
	FAIDataProviderBoolValue                           SkipUnreachable;                                            // 0x0200   (0x0038)  
};

/// Class /Script/MFNPCAI.NPCAIEnvQueryTest_PointBase
/// Size: 0x0020 (32 bytes) (0x0001F8 - 0x000218) align 8 pad: 0x0000
class UNPCAIEnvQueryTest_PointBase : public UEnvQueryTest
{ 
public:
	class UClass*                                      Context;                                                    // 0x01F8   (0x0008)  
	FText                                              TestDescription;                                            // 0x0200   (0x0018)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAIEnvQueryTest_PointBase.CalcScore
	// float CalcScore(FVector& ItemLocation, TArray<AActor*>& ContextActors, class UObject* QueryOwner);                       // [0x3a75280] Event|Public|HasOutParms|HasDefaults|BlueprintEvent|Const 
};

/// Class /Script/MFNPCAI.NPCAIEQSSystemStatics
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAIEQSSystemStatics : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIEQSSystemStatics.UARunEQSQuery
	// class UEnvQueryInstanceBlueprintWrapper* UARunEQSQuery(class UObject* WorldContextObject, class UEnvQuery* QueryTemplate, class AActor* Querier, TEnumAsByte<EEnvQueryRunMode> RunMode, class UClass* WrapperClass, TEnumAsByte<EEnvQueryPriority> QueryPriority); // [0x2db8250] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIFactionComponent
/// Size: 0x0018 (24 bytes) (0x000108 - 0x000120) align 8 pad: 0x0000
class UNPCAIFactionComponent : public UNPCAIActorComponent
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0108   (0x0008)  MISSED
	TArray<class UNPCAIPropertyProfile*>               PropertyProfiles;                                           // 0x0110   (0x0010)  
};

/// Class /Script/MFNPCAI.NPCAIFactionPluginBase
/// Size: 0x0010 (16 bytes) (0x000028 - 0x000038) align 8 pad: 0x0000
class UNPCAIFactionPluginBase : public UObject
{ 
public:
	SDK_UNDEFINED(16,602) /* TArray<TWeakObjectPtr<UObject*>> */ __um(ObjectRefs);                                 // 0x0028   (0x0010)  
};

/// Struct /Script/MFNPCAI.NPCAIProfileCover
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 8 pad: 0x0000
struct FNPCAIProfileCover
{ 
	TArray<char>                                       Ars;                                                        // 0x0000   (0x0010)  
	unsigned char                                      UnknownData00_6[0x8];                                       // 0x0010   (0x0008)  MISSED
	FString                                            CoverName;                                                  // 0x0018   (0x0010)  
};

/// Class /Script/MFNPCAI.NPCAIFactionPlugin
/// Size: 0x0078 (120 bytes) (0x000038 - 0x0000B0) align 8 pad: 0x0000
class UNPCAIFactionPlugin : public UNPCAIFactionPluginBase
{ 
public:
	SDK_UNDEFINED(80,603) /* TMap<EAIProfileType, UClass*> */ __um(ProfileTypeMap);                                // 0x0038   (0x0050)  
	FNPCAIProfileCover                                 ProfileCover;                                               // 0x0088   (0x0028)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAIFactionPlugin.CoverFaction
	// void CoverFaction(class AAIController* AIController);                                                                    // [0x19a6d00] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIFindAmbushAgainstPointAsyncTask
/// Size: 0x0038 (56 bytes) (0x000040 - 0x000078) align 8 pad: 0x0000
class UNPCAIFindAmbushAgainstPointAsyncTask : public UNPCAIAsyncTaskBase
{ 
public:
	SDK_UNDEFINED(16,604) /* FMulticastInlineDelegate */ __um(OnSuccess);                                          // 0x0040   (0x0010)  
	SDK_UNDEFINED(16,605) /* FMulticastInlineDelegate */ __um(OnFail);                                             // 0x0050   (0x0010)  
	FVector                                            PointStart;                                                 // 0x0060   (0x000C)  
	FVector                                            PointToGo;                                                  // 0x006C   (0x000C)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAIFindAmbushAgainstPointAsyncTask.ExecuteTask
	// void ExecuteTask();                                                                                                      // [0x198b080] Native|Public        
	// Function /Script/MFNPCAI.NPCAIFindAmbushAgainstPointAsyncTask.AIFindAmbushAgainstPoint
	// class UNPCAIFindAmbushAgainstPointAsyncTask* AIFindAmbushAgainstPoint(class AActor* Pawn, FVector& PointStart, FVector& PointToGo); // [0x2db7330] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIFindPathByKeyRouteAsyncTask
/// Size: 0x00E8 (232 bytes) (0x000040 - 0x000128) align 8 pad: 0x0000
class UNPCAIFindPathByKeyRouteAsyncTask : public UNPCAIAsyncTaskBase
{ 
public:
	SDK_UNDEFINED(16,606) /* FMulticastInlineDelegate */ __um(OnSuccess);                                          // 0x0040   (0x0010)  
	SDK_UNDEFINED(16,607) /* FMulticastInlineDelegate */ __um(OnFail);                                             // 0x0050   (0x0010)  
	FKeyRoutePointData                                 FromPoint;                                                  // 0x0060   (0x0060)  
	FKeyRoutePointData                                 ToPoint;                                                    // 0x00C0   (0x0060)  
	EAIKeyRouteQueryType                               QueryType;                                                  // 0x0120   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0121   (0x0007)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIFindPathByKeyRouteAsyncTask.ExecuteTask
	// void ExecuteTask();                                                                                                      // [0x198b080] Native|Public        
	// Function /Script/MFNPCAI.NPCAIFindPathByKeyRouteAsyncTask.AIFindPathByKeyRoute
	// class UNPCAIFindPathByKeyRouteAsyncTask* AIFindPathByKeyRoute(class AActor* Pawn, FKeyRoutePointData& FromPoint, FKeyRoutePointData& ToPoint, EAIKeyRouteQueryType QueryType); // [0x2db7460] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIGameStateDebugInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAIGameStateDebugInterface : public UInterface
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIGlobalManagerInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAIGlobalManagerInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIGlobalManagerInterface.NotifySceneEvent
	// void NotifySceneEvent(class UAISceneEventMessage* SceneEvent, EAISceneEventState& EventState, class AActor* AIPawn);     // [0x2db7c90] Native|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCAIGlobalManagerInterface.GetTacticSystemActor
	// class ATacticSystemActor* GetTacticSystemActor();                                                                        // [0x16a3b10] Native|Public        
	// Function /Script/MFNPCAI.NPCAIGlobalManagerInterface.GetPerceptionDynamicActor
	// class ANPCAIPerceptionDynamicActor* GetPerceptionDynamicActor();                                                         // [0x28c08b0] Native|Public        
	// Function /Script/MFNPCAI.NPCAIGlobalManagerInterface.GetPerceptionAssistActor
	// class ANPCAIPerceptionAssistActor* GetPerceptionAssistActor();                                                           // [0x28c0880] Native|Public        
	// Function /Script/MFNPCAI.NPCAIGlobalManagerInterface.GetGrenadeMinLifeTime
	// float GetGrenadeMinLifeTime();                                                                                           // [0x2db7910] Native|Public|Const  
	// Function /Script/MFNPCAI.NPCAIGlobalManagerInterface.GetCurrentFogDensity
	// float GetCurrentFogDensity();                                                                                            // [0x2db78a0] Native|Public        
	// Function /Script/MFNPCAI.NPCAIGlobalManagerInterface.GetCoverSystemActor
	// class ACoverSystemActor* GetCoverSystemActor();                                                                          // [0x16a3460] Native|Public        
	// Function /Script/MFNPCAI.NPCAIGlobalManagerInterface.GetAISGDoorManager
	// class UAISGDoorManager* GetAISGDoorManager();                                                                            // [0x28c0820] Native|Public        
	// Function /Script/MFNPCAI.NPCAIGlobalManagerInterface.GetAISceneEventsTriggerManager
	// class UAISceneEventsTriggerManager* GetAISceneEventsTriggerManager();                                                    // [0x28c0790] Native|Public        
	// Function /Script/MFNPCAI.NPCAIGlobalManagerInterface.GetAISceneEventDataTable
	// class UDataTable* GetAISceneEventDataTable();                                                                            // [0x28c0730] Native|Public        
	// Function /Script/MFNPCAI.NPCAIGlobalManagerInterface.GetAIRuntimeMonitor
	// class UAIRuntimeMonitor* GetAIRuntimeMonitor();                                                                          // [0x28c0850] Native|Public        
	// Function /Script/MFNPCAI.NPCAIGlobalManagerInterface.GetAIGlobalShareInfo
	// class UNPCAIGlobalSharedInfo* GetAIGlobalShareInfo();                                                                    // [0x2983ae0] Native|Public        
	// Function /Script/MFNPCAI.NPCAIGlobalManagerInterface.FindAllSGDoorsInWorld
	// void FindAllSGDoorsInWorld(TArray<TWeakObjectPtr<AActor*>>& DoorsInWorld);                                               // [0x2db77b0] Native|Public|HasOutParms 
};

/// Struct /Script/MFNPCAI.AIProtectTreasureBox
/// Size: 0x0060 (96 bytes) (0x000000 - 0x000060) align 8 pad: 0x0000
struct FAIProtectTreasureBox
{ 
	class AActor*                                      BoxInstance;                                                // 0x0000   (0x0008)  
	unsigned char                                      UnknownData00_7[0x58];                                      // 0x0008   (0x0058)  MISSED
};

/// Class /Script/MFNPCAI.NPCAIGlobalSharedInfo
/// Size: 0x01F8 (504 bytes) (0x000028 - 0x000220) align 8 pad: 0x0000
class UNPCAIGlobalSharedInfo : public UObject
{ 
public:
	float                                              TimeOfRunEQS_FindBackUpCoverPoint;                          // 0x0028   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x002C   (0x0004)  MISSED
	SDK_UNDEFINED(80,608) /* TMap<UClass*, FAIGlobalCacheActors> */ __um(CacheActorsInWorld);                      // 0x0030   (0x0050)  
	SDK_UNDEFINED(80,609) /* TMap<uint32_t, FAIEnemyInfo> */ __um(AIEnemyInfos);                                   // 0x0080   (0x0050)  
	bool                                               bEnableAIPerceptionLines;                                   // 0x00D0   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x00D1   (0x0003)  MISSED
	float                                              AITrackLOGLastAutoReleaseTime;                              // 0x00D4   (0x0004)  
	SDK_UNDEFINED(80,610) /* TMap<FString, UAITrackLOGUnit*> */ __um(AITrackLOGData);                              // 0x00D8   (0x0050)  
	bool                                               bAITrackEnabled;                                            // 0x0128   (0x0001)  
	unsigned char                                      UnknownData02_6[0x7];                                       // 0x0129   (0x0007)  MISSED
	SDK_UNDEFINED(80,611) /* TMap<EAITrackLOGType, FString> */ __um(AITrackLOGTemplate);                           // 0x0130   (0x0050)  
	TArray<class AActor*>                              DSPoseUpdateWaitList;                                       // 0x0180   (0x0010)  
	TArray<class AActor*>                              DSLeanPoseUpdateWaitList;                                   // 0x0190   (0x0010)  
	class AActor*                                      DSPoseUpdateCharacter;                                      // 0x01A0   (0x0008)  
	TArray<class AActor*>                              DSIKUpdateWaitList;                                         // 0x01A8   (0x0010)  
	class AActor*                                      DSIKUpdateCharacter;                                        // 0x01B8   (0x0008)  
	TArray<FAIProtectTreasureBox>                      TreasureBoxInfos;                                           // 0x01C0   (0x0010)  
	SDK_UNDEFINED(80,612) /* TMap<UClass*, EAIProfileType> */ __um(AIPropClassTypes);                              // 0x01D0   (0x0050)  
};

/// Class /Script/MFNPCAI.NPCAIGoalTarget
/// Size: 0x0018 (24 bytes) (0x000028 - 0x000040) align 8 pad: 0x0000
class UNPCAIGoalTarget : public UObject
{ 
public:
	class UNPCAIAttentionPoint*                        AttentionPoint;                                             // 0x0028   (0x0008)  
	class AAIController*                               AIOwner;                                                    // 0x0030   (0x0008)  
	unsigned char                                      UnknownData00_7[0x8];                                       // 0x0038   (0x0008)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIGoalTarget.SetZeroGoal
	// void SetZeroGoal();                                                                                                      // [0x2dbc3b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGoalTarget.SetGoalTargetPoint
	// void SetGoalTargetPoint(class UNPCAIAttentionPoint* InPoint);                                                            // [0x2dbc220] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGoalTarget.SetAIOwner
	// void SetAIOwner(class AAIController* InOwner);                                                                           // [0x2951c30] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGoalTarget.PointLookComplete
	// void PointLookComplete(int32_t InLookingIndex);                                                                          // [0x2dbbc90] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGoalTarget.IsDanger
	// bool IsDanger();                                                                                                         // [0x2dbb9b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGoalTarget.HaveZeroTarget
	// bool HaveZeroTarget();                                                                                                   // [0xc1a920] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGoalTarget.HavePlaceTarget
	// bool HavePlaceTarget();                                                                                                  // [0x2dbb5f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGoalTarget.HaveMainTarget
	// bool HaveMainTarget();                                                                                                   // [0x2dbb5c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGoalTarget.GetPointType
	// ENPCPlaceForCheckType GetPointType();                                                                                    // [0x2dbb320] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGoalTarget.GetGoalTargetPoint
	// class UNPCAIAttentionPoint* GetGoalTargetPoint();                                                                        // [0x2dbaff0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGoalTarget.GetCreatedTime
	// float GetCreatedTime();                                                                                                  // [0x2dbaee0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGoalTarget.ClearGoalTarget
	// void ClearGoalTarget();                                                                                                  // [0x2dbad70] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGoalTarget.CanCheckBody
	// bool CanCheckBody();                                                                                                     // [0x2dba830] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIGroupBaseRequest
/// Size: 0x0080 (128 bytes) (0x000028 - 0x0000A8) align 8 pad: 0x0000
class UNPCAIGroupBaseRequest : public UObject
{ 
public:
	int32_t                                            RequestType;                                                // 0x0028   (0x0004)  
	int32_t                                            DynamicGroupId;                                             // 0x002C   (0x0004)  
	bool                                               bOnlyInDynamicGroup;                                        // 0x0030   (0x0001)  
	EAIGroupRequestPriority                            RequestPriority;                                            // 0x0031   (0x0001)  
	bool                                               bCanExecuteByMyself;                                        // 0x0032   (0x0001)  
	unsigned char                                      UnknownData00_6[0x1];                                       // 0x0033   (0x0001)  MISSED
	int32_t                                            MaxTakenCount;                                              // 0x0034   (0x0004)  
	bool                                               IsNeedAllCompleted;                                         // 0x0038   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0039   (0x0003)  MISSED
	int32_t                                            CurrentTakenCount;                                          // 0x003C   (0x0004)  
	int32_t                                            CurrentCompleteCount;                                       // 0x0040   (0x0004)  
	int32_t                                            MaxRequestCount;                                            // 0x0044   (0x0004)  
	int32_t                                            RequestTypeNeedCompletedInPast;                             // 0x0048   (0x0004)  
	float                                              StartTimeOfTake;                                            // 0x004C   (0x0004)  
	float                                              EndTimeOfTake;                                              // 0x0050   (0x0004)  
	float                                              EndTimeOfExecute;                                           // 0x0054   (0x0004)  
	unsigned char                                      UnknownData02_6[0x8];                                       // 0x0058   (0x0008)  MISSED
	class AActor*                                      Requester;                                                  // 0x0060   (0x0008)  
	class UObject*                                     WorldContext;                                               // 0x0068   (0x0008)  
	TArray<class AActor*>                              ExecuterList;                                               // 0x0070   (0x0010)  
	TArray<class AActor*>                              HistoryExecuterList;                                        // 0x0080   (0x0010)  
	TArray<class AActor*>                              PossibleExecuterList;                                       // 0x0090   (0x0010)  
	unsigned char                                      UnknownData03_7[0x8];                                       // 0x00A0   (0x0008)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.Take
	// void Take(class AActor* InExecuter);                                                                                     // [0x16b0a40] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.SetRequestTypeNeedCompletedInPast
	// bool SetRequestTypeNeedCompletedInPast();                                                                                // [0x2dbc380] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.SetPossibleExecuterList
	// void SetPossibleExecuterList(TArray<AActor*>& InExecuterList);                                                           // [0x2dbc2b0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.SetEndTimeOnTake
	// void SetEndTimeOnTake(float InEndTime);                                                                                  // [0x2dbc1a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.SetEndTimeOnExecute
	// void SetEndTimeOnExecute(float InEndTime);                                                                               // [0x2dbc120] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.RemoveFromExecuterList
	// void RemoveFromExecuterList(class AActor* InExecuter);                                                                   // [0x2dbbdb0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.IsPossibleExecuter
	// bool IsPossibleExecuter(class AActor* InExecuter);                                                                       // [0x2dbbbf0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.IsInHistoryExecuter
	// bool IsInHistoryExecuter(class AActor* InExecuter);                                                                      // [0x2dbbb50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.IsInExecuter
	// bool IsInExecuter(class AActor* InExecuter);                                                                             // [0x2dbbab0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.IsGroupAsRequester
	// bool IsGroupAsRequester();                                                                                               // [0x2dbba80] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.InitRequestType
	// bool InitRequestType();                                                                                                  // [0x2dbb8a0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.InitRequestInfo
	// void InitRequestInfo(class AActor* InRequester, int32_t InMaxTakenCount, float InEndOfTakeTime, class UObject* InWorldContext); // [0x2dbb740] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.InitRequestByBluePrint
	// bool InitRequestByBluePrint();                                                                                           // [0xfa3a40] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.GetStartTimeOfTake
	// float GetStartTimeOfTake();                                                                                              // [0x2dbb4f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.GetRequestName
	// FString GetRequestName();                                                                                                // [0x29be2a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.GetRequester
	// class AActor* GetRequester();                                                                                            // [0x2dbb4c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.GetExecuterList
	// TArray<AActor*> GetExecuterList();                                                                                       // [0x2dbaf40] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.GetEndTimeOfTake
	// float GetEndTimeOfTake();                                                                                                // [0x2dbaf10] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.Dispose
	// void Dispose();                                                                                                          // [0x2dbad90] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.CheckIsEndOfTake
	// bool CheckIsEndOfTake(float InCurrentRuntime);                                                                           // [0x2dbace0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.CheckIsEndOfExecute
	// bool CheckIsEndOfExecute(float InCurrentRuntime);                                                                        // [0x2dbac50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.CheckCanTakeRequestForLastRequestLimit
	// bool CheckCanTakeRequestForLastRequestLimit(class AActor* InExecuter);                                                   // [0x2dbabb0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.CheckCanTakeRequestForGroupLimit
	// bool CheckCanTakeRequestForGroupLimit(class AActor* InExecuter);                                                         // [0x2dbab10] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.CheckCanTakeRequestAllLimit
	// bool CheckCanTakeRequestAllLimit(class AActor* InExecuter);                                                              // [0x2dbaa70] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.CheckCanTakeRequest
	// bool CheckCanTakeRequest(class AActor* InExecuter);                                                                      // [0x2dba9d0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.CanRequest
	// bool CanRequest();                                                                                                       // [0x2dba900] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.CanProceed
	// bool CanProceed(class AActor* InExecuter);                                                                               // [0x2dba860] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAIGroupBaseRequest.AddPossibleExecuter
	// void AddPossibleExecuter(class AActor* InExecuter);                                                                      // [0x2dba670] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIGroupAttackCloseRequest
/// Size: 0x0000 (0 bytes) (0x0000A8 - 0x0000A8) align 8 pad: 0x0000
class UNPCAIGroupAttackCloseRequest : public UNPCAIGroupBaseRequest
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIGroupCustomRequest
/// Size: 0x0000 (0 bytes) (0x0000A8 - 0x0000A8) align 8 pad: 0x0000
class UNPCAIGroupCustomRequest : public UNPCAIGroupBaseRequest
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIGroupDoorOpenRequest
/// Size: 0x0008 (8 bytes) (0x0000A8 - 0x0000B0) align 8 pad: 0x0000
class UNPCAIGroupDoorOpenRequest : public UNPCAIGroupBaseRequest
{ 
public:
	class AActor*                                      Door;                                                       // 0x00A8   (0x0008)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAIGroupDoorOpenRequest.InitData
	// void InitData(class AActor* InDoor);                                                                                     // [0x2dbb620] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIGroupFollowMeRequest
/// Size: 0x0008 (8 bytes) (0x0000A8 - 0x0000B0) align 8 pad: 0x0000
class UNPCAIGroupFollowMeRequest : public UNPCAIGroupBaseRequest
{ 
public:
	float                                              TimeLimit;                                                  // 0x00A8   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x00AC   (0x0004)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIGroupFollowMeRequest.IsExecuterFar
	// bool IsExecuterFar(class AActor* InExecuter);                                                                            // [0x2dbb9e0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIGroupGoToPointRequest
/// Size: 0x0010 (16 bytes) (0x0000A8 - 0x0000B8) align 8 pad: 0x0000
class UNPCAIGroupGoToPointRequest : public UNPCAIGroupBaseRequest
{ 
public:
	FVector                                            PointToGo;                                                  // 0x00A8   (0x000C)  
	float                                              Radius;                                                     // 0x00B4   (0x0004)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAIGroupGoToPointRequest.InitTargetPoint
	// void InitTargetPoint(FVector InTargetPoint, float InRadius);                                                             // [0x2dbb8d0] Final|Native|Public|HasDefaults|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIGroupHideRequest
/// Size: 0x0000 (0 bytes) (0x0000A8 - 0x0000A8) align 8 pad: 0x0000
class UNPCAIGroupHideRequest : public UNPCAIGroupBaseRequest
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIGroupHoldRequest
/// Size: 0x0010 (16 bytes) (0x0000A8 - 0x0000B8) align 8 pad: 0x0000
class UNPCAIGroupHoldRequest : public UNPCAIGroupBaseRequest
{ 
public:
	FVector                                            Direction;                                                  // 0x00A8   (0x000C)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x00B4   (0x0004)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIGroupHoldRequest.InitData
	// void InitData(FVector InDirection);                                                                                      // [0x2dbb6b0] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupHoldRequest.GetProjectionPoint
	// FVector GetProjectionPoint(FVector InP1, FVector InP2, FVector InP3);                                                    // [0x2dbb350] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupHoldRequest.CalculateDirection
	// void CalculateDirection(class AActor* InExecuter, FVector InDirection, FVector InRequesterHeadPos);                      // [0x2dba700] Final|Native|Public|HasDefaults|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAISubSystemComponent
/// Size: 0x0010 (16 bytes) (0x0000F8 - 0x000108) align 8 pad: 0x0000
class UNPCAISubSystemComponent : public UActorComponent
{ 
public:
	class ACharacter*                                  OwnerPawn;                                                  // 0x00F8   (0x0008)  
	class AAIController*                               OwnerController;                                            // 0x0100   (0x0008)  
};

/// Class /Script/MFNPCAI.NPCAIGroupRequestComponent
/// Size: 0x0060 (96 bytes) (0x000108 - 0x000168) align 8 pad: 0x0000
class UNPCAIGroupRequestComponent : public UNPCAISubSystemComponent
{ 
public:
	bool                                               bIsLogEnabled;                                              // 0x0108   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0109   (0x0007)  MISSED
	class UClass*                                      ClassOfWarnPlayerRequest;                                   // 0x0110   (0x0008)  
	int32_t                                            LastCompletedRequestType;                                   // 0x0118   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x011C   (0x0004)  MISSED
	SDK_UNDEFINED(16,613) /* FMulticastInlineDelegate */ __um(OnRequestCompleted);                                 // 0x0120   (0x0010)  
	SDK_UNDEFINED(16,614) /* FMulticastInlineDelegate */ __um(OnRequestGiveUp);                                    // 0x0130   (0x0010)  
	float                                              NextSearchRequestTime;                                      // 0x0140   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x0144   (0x0004)  MISSED
	class UNPCAIGroupBaseRequest*                      CurrentRequest;                                             // 0x0148   (0x0008)  
	TArray<int32_t>                                    CompletedRequestTypeList;                                   // 0x0150   (0x0010)  
	class UNPCAIGroupRequestController*                GpRequestController;                                        // 0x0160   (0x0008)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAIGroupRequestComponent.Update
	// void Update();                                                                                                           // [0x2dbdac0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestComponent.TryToFindRequest
	// bool TryToFindRequest();                                                                                                 // [0x2dbda90] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestComponent.TryGiveUpCurrentRequest
	// void TryGiveUpCurrentRequest();                                                                                          // [0x2dbda70] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestComponent.TickCheckCurrentRequestIsValid
	// void TickCheckCurrentRequestIsValid();                                                                                   // [0x2dbc3d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestComponent.SetCurrentRequestCompleted
	// void SetCurrentRequestCompleted();                                                                                       // [0x2dbc100] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestComponent.SetCurrentRequest
	// void SetCurrentRequest(class UNPCAIGroupBaseRequest* InRequest);                                                         // [0x2dbc070] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestComponent.HasCompletedRequestInPast
	// bool HasCompletedRequestInPast(int32_t InRequestType);                                                                   // [0x2dbb520] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestComponent.GetGroupRequestController
	// class UNPCAIGroupRequestController* GetGroupRequestController();                                                         // [0x2dbb0c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestComponent.CheckCanReplaceHighPriorityRequest
	// bool CheckCanReplaceHighPriorityRequest(class UNPCAIGroupBaseRequest* InNewRequest);                                     // [0x2dba930] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestComponent.AcceptRequest
	// bool AcceptRequest(class UNPCAIGroupBaseRequest* InRequest);                                                             // [0x2dba5d0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIGroupRequestController
/// Size: 0x0018 (24 bytes) (0x000028 - 0x000040) align 8 pad: 0x0000
class UNPCAIGroupRequestController : public UObject
{ 
public:
	TArray<class UNPCAIGroupBaseRequest*>              GroupRequestsList;                                          // 0x0028   (0x0010)  
	float                                              LastTimeAutoFiltRequests;                                   // 0x0038   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x003C   (0x0004)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.TryAddRequest
	// bool TryAddRequest(class UNPCAIGroupBaseRequest* InRequest);                                                             // [0x2dbd9d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.TryActivateWarnPlayerRequest
	// class UNPCAIGroupBaseRequest* TryActivateWarnPlayerRequest(class AActor* InRequester, class ACharacter* InWarnPlayer, int32_t InMaxExecuterCount, class UClass* InRequestClass, bool InIsNeedAllCompleted); // [0x2dbd830] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.TryActivateThrowGrenadeRequest
	// class UNPCAIGroupBaseRequest* TryActivateThrowGrenadeRequest(class AActor* InRequester, class ACharacter* InEnemy, FVector InThrowPoint, int32_t InMaxExecuterCount, class UClass* InRequestClass, bool InIsNeedAllCompleted); // [0x2dbd650] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.TryActivateSussperssionFireRequest
	// class UNPCAIGroupBaseRequest* TryActivateSussperssionFireRequest(class AActor* InRequester, class ACharacter* InEnemy, FVector InFirePoint, int32_t InMaxExecuterCount, class UClass* InRequestClass, bool InIsNeedAllCompleted); // [0x2dbd470] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.TryActivateRequestByGroup
	// class UNPCAIGroupBaseRequest* TryActivateRequestByGroup(class UObject* InWorldContextObject, class UClass* InRequestClass, int32_t InMaxExecuterCount, bool InIsNeedAllCompleted, bool InOnlyInDynamicGroup, bool InCanExecuteByMyself, TArray<AActor*>& InPossibleExecuterList); // [0x2dbd1f0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.TryActivateRequestByClass
	// class UNPCAIGroupBaseRequest* TryActivateRequestByClass(class AActor* InRequester, class UClass* InRequestClass, int32_t InMaxExecuterCount, bool InIsNeedAllCompleted, bool InCanExecuteByMyself, TArray<AActor*>& InPossibleExecuterList); // [0x2dbcfd0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.TryActivateRequest
	// class UNPCAIGroupBaseRequest* TryActivateRequest(class AActor* InRequester, class UNPCAIGroupBaseRequest* InRequestInstance, int32_t InMaxExecuterCount, bool InIsNeedAllCompleted, bool InCanExecuteByMyself, TArray<AActor*>& InPossibleExecuterList); // [0x2dbcdb0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.TryActivateOpenDoorRequest
	// class UNPCAIGroupBaseRequest* TryActivateOpenDoorRequest(class AActor* InRequester, class AActor* InDoor, class UClass* InRequestClass, bool InIsNeedAllCompleted); // [0x2dbcc50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.TryActivateHoldRequest
	// class UNPCAIGroupBaseRequest* TryActivateHoldRequest(class AActor* InRequester, FVector InDirection, int32_t InMaxExecuterCount, class UClass* InRequestClass, bool InIsNeedAllCompleted); // [0x2dbca70] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.TryActivateHideRequest
	// class UNPCAIGroupBaseRequest* TryActivateHideRequest(class AActor* InRequester, int32_t InMaxExecuterCount, class UClass* InRequestClass, bool InIsNeedAllCompleted); // [0x2dbc910] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.TryActivateGoToPointRequest
	// class UNPCAIGroupBaseRequest* TryActivateGoToPointRequest(class AActor* InRequester, FVector InPoint, float InRadius, int32_t InMaxExecuterCount, class UClass* InRequestClass, bool InIsNeedAllCompleted); // [0x2dbc730] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.TryActivateFollowMeRequest
	// class UNPCAIGroupBaseRequest* TryActivateFollowMeRequest(class AActor* InRequester, int32_t InMaxExecuterCount, class UClass* InRequestClass, bool InIsNeedAllCompleted); // [0x2dbc5d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.TryActivateCustomRequest
	// class UNPCAIGroupBaseRequest* TryActivateCustomRequest(class AActor* InRequester, class UNPCAIGroupCustomRequest* InRequest, class AActor* PossibleExecuter, bool bResetSearchTime, bool InIsNeedAllCompleted, bool bCleanPendingRequest); // [0x2dbc3f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.RequestGiveUpToDo
	// void RequestGiveUpToDo(class UNPCAIGroupBaseRequest* InRequest, class AActor* InExecuter);                               // [0x2dbbfa0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.RequestCompletedToDo
	// void RequestCompletedToDo(class UNPCAIGroupBaseRequest* InRequest, class AActor* InExecuter);                            // [0x2dbbed0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.RemoveRequestInList
	// void RemoveRequestInList(class UNPCAIGroupBaseRequest* InRequest);                                                       // [0x2dbbe40] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.RemoveAllByRequester
	// void RemoveAllByRequester(class AActor* InRequester);                                                                    // [0x2dbbd20] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.GetGroupRequestsList
	// TArray<UNPCAIGroupBaseRequest*> GetGroupRequestsList();                                                                  // [0x2dbb290] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.GetGroupRequestListByType
	// int32_t GetGroupRequestListByType(int32_t InRequestType, TArray<UNPCAIGroupBaseRequest*>& OutRequestsList);              // [0x2dbb190] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.GetGroupRequestCountByType
	// int32_t GetGroupRequestCountByType(int32_t InRequestType);                                                               // [0x2dbb0f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.GetGroupRequestCount
	// int32_t GetGroupRequestCount();                                                                                          // [0x18d14a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.GetGroupRequestByType
	// class UNPCAIGroupBaseRequest* GetGroupRequestByType(int32_t InRequestType);                                              // [0x2dbb020] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.FindForMe
	// class UNPCAIGroupBaseRequest* FindForMe(class AActor* InExecuter);                                                       // [0x2dbae40] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupRequestController.FilterInValidRequest
	// void FilterInValidRequest(class UObject* WorldContext);                                                                  // [0x2dbadb0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIGroupSusspressionFireRequest
/// Size: 0x0020 (32 bytes) (0x0000A8 - 0x0000C8) align 8 pad: 0x0000
class UNPCAIGroupSusspressionFireRequest : public UNPCAIGroupBaseRequest
{ 
public:
	EAIGroupRequestFireTarget                          TargetType;                                                 // 0x00A8   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x00A9   (0x0007)  MISSED
	class AActor*                                      EnemyTarget;                                                // 0x00B0   (0x0008)  
	FVector                                            PointTarget;                                                // 0x00B8   (0x000C)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x00C4   (0x0004)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIGroupSusspressionFireRequest.IsEnemyLost
	// bool IsEnemyLost();                                                                                                      // [0x2dc01d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupSusspressionFireRequest.InitEnemy
	// void InitEnemy(class AActor* InEnemy, FVector InFirePoint);                                                              // [0x2dc0010] Final|Native|Public|HasDefaults|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIGroupThrowGrenadeRequest
/// Size: 0x0018 (24 bytes) (0x0000A8 - 0x0000C0) align 8 pad: 0x0000
class UNPCAIGroupThrowGrenadeRequest : public UNPCAIGroupBaseRequest
{ 
public:
	class AActor*                                      EnemyTarget;                                                // 0x00A8   (0x0008)  
	FVector                                            PointTarget;                                                // 0x00B0   (0x000C)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x00BC   (0x0004)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIGroupThrowGrenadeRequest.IsThrowEnemy
	// bool IsThrowEnemy();                                                                                                     // [0x2dc0320] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupThrowGrenadeRequest.IsEnemyLost
	// bool IsEnemyLost();                                                                                                      // [0x2dc0200] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupThrowGrenadeRequest.InitEnemy
	// void InitEnemy(class AActor* InEnemy, FVector InThrowPoint);                                                             // [0x2dc00f0] Final|Native|Public|HasDefaults|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIGroupWarnPlayerRequest
/// Size: 0x0028 (40 bytes) (0x0000A8 - 0x0000D0) align 8 pad: 0x0000
class UNPCAIGroupWarnPlayerRequest : public UNPCAIGroupBaseRequest
{ 
public:
	class AActor*                                      WarnPlayer;                                                 // 0x00A8   (0x0008)  
	EAIStateWarnPlayerRequest                          StateWarnPlayer;                                            // 0x00B0   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x00B1   (0x0003)  MISSED
	float                                              DistanceToRequester;                                        // 0x00B4   (0x0004)  
	FVector                                            PointToShoot;                                               // 0x00B8   (0x000C)  
	float                                              TimeOfStay;                                                 // 0x00C4   (0x0004)  
	int32_t                                            CountOfWarns;                                               // 0x00C8   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x00CC   (0x0004)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIGroupWarnPlayerRequest.ShallEndStay
	// bool ShallEndStay(class AActor* InExecuter);                                                                             // [0x2dc1030] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAIGroupWarnPlayerRequest.OnStateToDo
	// void OnStateToDo(class AActor* InExecuter);                                                                              // [0x16b18f0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAIGroupWarnPlayerRequest.NextState
	// void NextState(class AActor* InExecuter);                                                                                // [0x16b1ae0] Native|Event|Public|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAIGroupWarnPlayerRequest.IsWarnPlayerAwayFromRequester
	// bool IsWarnPlayerAwayFromRequester();                                                                                    // [0x2dc0350] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupWarnPlayerRequest.InitData
	// void InitData(class AActor* InTargetToWarn);                                                                             // [0x2dbb620] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupWarnPlayerRequest.GetPointToShoot
	// FVector GetPointToShoot();                                                                                               // [0x2dbffa0] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIGroupWarnPlayerRequest.CalculatePointToShoot
	// void CalculatePointToShoot();                                                                                            // [0x2dbfc10] Final|Native|Public|BlueprintCallable 
};

/// Struct /Script/MFNPCAI.MetisOptions
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 4 pad: 0x0000
struct FMetisOptions
{ 
	bool                                               bUseDefault;                                                // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	EMETIS_OBJTYPE                                     ObjectiveType;                                              // 0x0004   (0x0004)  
	EMETIS_CTYPE                                       CoarsenType;                                                // 0x0008   (0x0004)  
	EMETIS_IPTYPE                                      InitialPartitioningType;                                    // 0x000C   (0x0004)  
	EMETIS_RTYPE                                       RifinementType;                                             // 0x0010   (0x0004)  
	int32_t                                            NCuts;                                                      // 0x0014   (0x0004)  
	int32_t                                            IterateTimes;                                               // 0x0018   (0x0004)  
	bool                                               bMinimizeMaximumConnectivity;                               // 0x001C   (0x0001)  
	bool                                               bNo2Hop;                                                    // 0x001D   (0x0001)  
	bool                                               bForcesContiguousPartitions;                                // 0x001E   (0x0001)  
	unsigned char                                      UnknownData01_7[0x1];                                       // 0x001F   (0x0001)  MISSED
};

/// Struct /Script/MFNPCAI.HNavSettings
/// Size: 0x003C (60 bytes) (0x000000 - 0x00003C) align 4 pad: 0x0000
struct FHNavSettings
{ 
	bool                                               bAutoBuildAfterNavigationGenerationFinished;                // 0x0000   (0x0001)  
	bool                                               bBuildIntermediateGraph;                                    // 0x0001   (0x0001)  
	bool                                               bRemoveIntermediateGraph;                                   // 0x0002   (0x0001)  
	bool                                               bIntraPathOnlyInSelfNode;                                   // 0x0003   (0x0001)  
	bool                                               bCombineMultiEdges;                                         // 0x0004   (0x0001)  
	bool                                               bEnableEdgeWeight;                                          // 0x0005   (0x0001)  
	bool                                               bBreakNavLinkConnection;                                    // 0x0006   (0x0001)  
	unsigned char                                      UnknownData00_6[0x1];                                       // 0x0007   (0x0001)  MISSED
	int32_t                                            MaxGraphLevel;                                              // 0x0008   (0x0004)  
	int32_t                                            PartitionSize;                                              // 0x000C   (0x0004)  
	int32_t                                            ForceBuildForTopK;                                          // 0x0010   (0x0004)  
	int32_t                                            MinNodeCountToBuild;                                        // 0x0014   (0x0004)  
	int32_t                                            MaxSearchNode;                                              // 0x0018   (0x0004)  
	FMetisOptions                                      MetisOptions;                                               // 0x001C   (0x0020)  
};

/// Struct /Script/MFNPCAI.PortalEdge
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 8 pad: 0x0000
struct FPortalEdge
{ 
	uint64_t                                           PackedData;                                                 // 0x0000   (0x0008)  
};

/// Struct /Script/MFNPCAI.IntraPath
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 8 pad: 0x0000
struct FIntraPath
{ 
	uint64_t                                           PackedData;                                                 // 0x0000   (0x0008)  
	TArray<uint64_t>                                   Nodes;                                                      // 0x0008   (0x0010)  
	float                                              Length;                                                     // 0x0018   (0x0004)  
	float                                              Cost;                                                       // 0x001C   (0x0004)  
};

/// Struct /Script/MFNPCAI.HNavGraph
/// Size: 0x0150 (336 bytes) (0x000000 - 0x000150) align 8 pad: 0x0000
struct FHNavGraph
{ 
	int32_t                                            Level;                                                      // 0x0000   (0x0004)  
	int32_t                                            NodeCount;                                                  // 0x0004   (0x0004)  
	bool                                               bIntermediate;                                              // 0x0008   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0009   (0x0007)  MISSED
	TArray<int32_t>                                    ParentIndices;                                              // 0x0010   (0x0010)  
	unsigned char                                      UnknownData01_6[0x20];                                      // 0x0020   (0x0020)  MISSED
	TArray<int32_t>                                    ChildIndexOffsets;                                          // 0x0040   (0x0010)  
	TArray<int32_t>                                    ChildIndices;                                               // 0x0050   (0x0010)  
	TArray<int32_t>                                    PortalEdgeOffsets;                                          // 0x0060   (0x0010)  
	TArray<FPortalEdge>                                PortalEdges;                                                // 0x0070   (0x0010)  
	TArray<int32_t>                                    IntraPathOffsets;                                           // 0x0080   (0x0010)  
	TArray<FIntraPath>                                 IntraPaths;                                                 // 0x0090   (0x0010)  
	TArray<int32_t>                                    IntraPathSourceIndexOffsets;                                // 0x00A0   (0x0010)  
	TArray<int32_t>                                    IntraPathSourceIndices;                                     // 0x00B0   (0x0010)  
	TArray<int32_t>                                    IntraPathTargetIndexOffsets;                                // 0x00C0   (0x0010)  
	unsigned char                                      UnknownData02_6[0x10];                                      // 0x00D0   (0x0010)  MISSED
	TArray<uint64_t>                                   IntraPathCounts;                                            // 0x00E0   (0x0010)  
	TArray<int32_t>                                    IntraPathPolyRefOffsets;                                    // 0x00F0   (0x0010)  
	TArray<uint64_t>                                   IntraPathPolyRefs;                                          // 0x0100   (0x0010)  
	TArray<float>                                      IntraPathCosts;                                             // 0x0110   (0x0010)  
	TArray<float>                                      IntraPathLengths;                                           // 0x0120   (0x0010)  
	unsigned char                                      UnknownData03_7[0x20];                                      // 0x0130   (0x0020)  MISSED
};

/// Struct /Script/MFNPCAI.HNavSearchInfo
/// Size: 0x0060 (96 bytes) (0x000000 - 0x000060) align 8 pad: 0x0000
struct FHNavSearchInfo
{ 
	unsigned char                                      UnknownData00_2[0x60];                                      // 0x0000   (0x0060)  MISSED
};

/// Class /Script/MFNPCAI.NPCAIHNavActor
/// Size: 0x0190 (400 bytes) (0x0002E0 - 0x000470) align 8 pad: 0x0000
class ANPCAIHNavActor : public AActor
{ 
public:
	FHNavSettings                                      Settings;                                                   // 0x02E0   (0x003C)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x031C   (0x0004)  MISSED
	TArray<FHNavGraph>                                 Graphs;                                                     // 0x0320   (0x0010)  
	int32_t                                            MinimumPartitionCount;                                      // 0x0330   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0334   (0x0004)  MISSED
	TArray<char>                                       PortalNodeFlags;                                            // 0x0338   (0x0010)  
	unsigned char                                      UnknownData02_6[0xC0];                                      // 0x0348   (0x00C0)  MISSED
	FHNavSearchInfo                                    SearchedInfo;                                               // 0x0408   (0x0060)  
	unsigned char                                      UnknownData03_6[0x4];                                       // 0x0468   (0x0004)  MISSED
	bool                                               bUseDefaultPathfinding;                                     // 0x046C   (0x0001)  
	bool                                               bNewMaxPortalAdjacency;                                     // 0x046D   (0x0001)  
	unsigned char                                      UnknownData04_7[0x2];                                       // 0x046E   (0x0002)  MISSED
};

/// Class /Script/MFNPCAI.NPCAILaunchPad
/// Size: 0x0038 (56 bytes) (0x0002E0 - 0x000318) align 8 pad: 0x0000
class ANPCAILaunchPad : public AActor
{ 
public:
	class USceneComponent*                             Root;                                                       // 0x02E0   (0x0008)  
	class UStaticMeshComponent*                        Launchpad;                                                  // 0x02E8   (0x0008)  
	class USphereComponent*                            TriggerVolume;                                              // 0x02F0   (0x0008)  
	class UNavLinkComponent*                           NavLink;                                                    // 0x02F8   (0x0008)  
	FVector                                            Target;                                                     // 0x0300   (0x000C)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x030C   (0x0004)  MISSED
	class ACharacter*                                  LaunchedCharacter;                                          // 0x0310   (0x0008)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAILaunchPad.OnTriggerBeginOverlap
	// void OnTriggerBeginOverlap(class UPrimitiveComponent* OverlappedComp, class AActor* Other, class UPrimitiveComponent* OtherComp, int32_t OtherBodyIndex, bool bFromSweep, FHitResult& SweepResult); // [0x2dc0380] Final|Native|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCAILaunchPad.CanTriggerLaunch
	// bool CanTriggerLaunch(class ACharacter* Other);                                                                          // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAILaunchPad.CalculateLaunchVelocity
	// FVector CalculateLaunchVelocity(class AActor* LaunchedActor);                                                            // [0x2dbfb60] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAILaunchPad.BP_LaunchCharacter
	// void BP_LaunchCharacter(class ACharacter* Character);                                                                    // [0x3a75280] Event|Protected|BlueprintEvent 
};

/// Struct /Script/MFNPCAI.AIBackUpCoverPointFinder
/// Size: 0x001C (28 bytes) (0x000000 - 0x00001C) align 4 pad: 0x0000
struct FAIBackUpCoverPointFinder
{ 
	FVector                                            AIPosistion;                                                // 0x0000   (0x000C)  
	FVector                                            EnemyPosition;                                              // 0x000C   (0x000C)  
	float                                              LastTime;                                                   // 0x0018   (0x0004)  
};

/// Struct /Script/MFNPCAI.AIStackGunRecord
/// Size: 0x0044 (68 bytes) (0x000000 - 0x000044) align 4 pad: 0x0000
struct FAIStackGunRecord
{ 
	bool                                               CanStackGun;                                                // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	FVector                                            MyPosition;                                                 // 0x0004   (0x000C)  
	FVector                                            EnemyPosition;                                              // 0x0010   (0x000C)  
	EAILeanType                                        AILean;                                                     // 0x001C   (0x0001)  
	EAIPose                                            AIPose;                                                     // 0x001D   (0x0001)  
	unsigned char                                      UnknownData01_6[0x2];                                       // 0x001E   (0x0002)  MISSED
	FVector                                            GunPoint;                                                   // 0x0020   (0x000C)  
	FVector                                            EeyPoint;                                                   // 0x002C   (0x000C)  
	FVector                                            ShootPoint;                                                 // 0x0038   (0x000C)  
};

/// Struct /Script/MFNPCAI.AIRoundPathFindingNodes
/// Size: 0x0080 (128 bytes) (0x000000 - 0x000080) align 8 pad: 0x0000
struct FAIRoundPathFindingNodes
{ 
	float                                              LastTimeCheckUpdate;                                        // 0x0000   (0x0004)  
	int32_t                                            CheckUpdateCount;                                           // 0x0004   (0x0004)  
	float                                              RoundPathLength;                                            // 0x0008   (0x0004)  
	float                                              RadiusReCalcRoundPathNodes;                                 // 0x000C   (0x0004)  
	int64_t                                            CurrentPolyId;                                              // 0x0010   (0x0008)  
	FVector                                            LastLocationCalcRoundPathNodes;                             // 0x0018   (0x000C)  
	unsigned char                                      UnknownData00_7[0x5C];                                      // 0x0024   (0x005C)  MISSED
};

/// Struct /Script/MFNPCAI.NPCAIQueryRoundEnvironmentResult
/// Size: 0x005C (92 bytes) (0x000000 - 0x00005C) align 4 pad: 0x0000
struct FNPCAIQueryRoundEnvironmentResult
{ 
	FVector                                            AILocation;                                                 // 0x0000   (0x000C)  
	FVector                                            EnemyLocation;                                              // 0x000C   (0x000C)  
	bool                                               LCanMove;                                                   // 0x0018   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0019   (0x0003)  MISSED
	FVector                                            LMovePoint;                                                 // 0x001C   (0x000C)  
	bool                                               RCanMove;                                                   // 0x0028   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0029   (0x0003)  MISSED
	FVector                                            RMovePoint;                                                 // 0x002C   (0x000C)  
	bool                                               FCanMove;                                                   // 0x0038   (0x0001)  
	unsigned char                                      UnknownData02_6[0x3];                                       // 0x0039   (0x0003)  MISSED
	FVector                                            FMovePoint;                                                 // 0x003C   (0x000C)  
	bool                                               BCanMove;                                                   // 0x0048   (0x0001)  
	unsigned char                                      UnknownData03_6[0x3];                                       // 0x0049   (0x0003)  MISSED
	FVector                                            BMovePoint;                                                 // 0x004C   (0x000C)  
	bool                                               LCanDefense;                                                // 0x0058   (0x0001)  
	bool                                               RCanDefense;                                                // 0x0059   (0x0001)  
	bool                                               LCanAttack;                                                 // 0x005A   (0x0001)  
	bool                                               RCanAttack;                                                 // 0x005B   (0x0001)  
};

/// Class /Script/MFNPCAI.NPCAIMemorySystemComponent
/// Size: 0x0208 (520 bytes) (0x000108 - 0x000310) align 8 pad: 0x0000
class UNPCAIMemorySystemComponent : public UNPCAISubSystemComponent
{ 
public:
	class AAIController*                               AIOwner;                                                    // 0x0108   (0x0008)  
	unsigned char                                      UnknownData00_6[0x10];                                      // 0x0110   (0x0010)  MISSED
	bool                                               IsLockingGoalEnemy;                                         // 0x0120   (0x0001)  
	unsigned char                                      UnknownData01_6[0x7];                                       // 0x0121   (0x0007)  MISSED
	class UNPCAITargetInfo*                            GoalEnemy;                                                  // 0x0128   (0x0008)  
	class UNPCAITargetInfo*                            LastEnemy;                                                  // 0x0130   (0x0008)  
	FString                                            MemoryServiceNodeName;                                      // 0x0138   (0x0010)  
	class UNPCAIGoalTarget*                            GoalTarget;                                                 // 0x0148   (0x0008)  
	FVector                                            CheckCoverPointPosition;                                    // 0x0150   (0x000C)  
	int32_t                                            CurrentCoverPointID;                                        // 0x015C   (0x0004)  
	FAIBackUpCoverPointFinder                          BackUpCoverPointFinder;                                     // 0x0160   (0x001C)  
	int32_t                                            PeekCount;                                                  // 0x017C   (0x0004)  
	char                                               CallUpReason;                                               // 0x0180   (0x0001)  
	char                                               CallUpResult;                                               // 0x0181   (0x0001)  
	unsigned char                                      UnknownData02_6[0x2];                                       // 0x0182   (0x0002)  MISSED
	float                                              LastMolotovHurttime;                                        // 0x0184   (0x0004)  
	float                                              SightWeakenEndTime;                                         // 0x0188   (0x0004)  
	bool                                               bIsInTryLeanShoot;                                          // 0x018C   (0x0001)  
	unsigned char                                      UnknownData03_6[0x3];                                       // 0x018D   (0x0003)  MISSED
	float                                              PauseBehaviorEndTime;                                       // 0x0190   (0x0004)  
	FAIStackGunRecord                                  StackGunRecord;                                             // 0x0194   (0x0044)  
	TArray<int32_t>                                    AcceptedSceneEvtUniqueIds;                                  // 0x01D8   (0x0010)  
	FAIRoundPathFindingNodes                           RoundPathNodes;                                             // 0x01E8   (0x0080)  
	class AActor*                                      TreasureBoxWantProtect;                                     // 0x0268   (0x0008)  
	FVector                                            Cache_AmbushAgainstStartPoint;                              // 0x0270   (0x000C)  
	FVector                                            Cache_AmbushAgainstEndPoint;                                // 0x027C   (0x000C)  
	FVector                                            Cache_AmbushAgainstResultPoint;                             // 0x0288   (0x000C)  
	FNPCAIQueryRoundEnvironmentResult                  Cache_QREResult;                                            // 0x0294   (0x005C)  
	class UActorComponent*                             AIStaticComponent;                                          // 0x02F0   (0x0008)  
	class UAISceneEventsTriggerManager*                AISceneEventsTriggerManager;                                // 0x02F8   (0x0008)  
	class UNPCAIPerceptionComponent*                   CachedPerceptionComponent;                                  // 0x0300   (0x0008)  
	class UNPCAIMoverSystemComponent*                  MoverSystemComponent;                                       // 0x0308   (0x0008)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.UpdateRoundPathNodes
	// void UpdateRoundPathNodes();                                                                                             // [0x2dc10d0] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.SetStackGunRecord
	// void SetStackGunRecord(FVector& InMyPos, FVector& InEnemyPos, EAIPose& InPose, EAILeanType& InLean);                     // [0x2dc0e90] Final|Native|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.SetSightWeakenTime
	// void SetSightWeakenTime(float WeakenTime);                                                                               // [0x2dc0e10] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.SetPauseBehaviorTime
	// void SetPauseBehaviorTime(float Time);                                                                                   // [0x2dc0d90] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.SetLastCalculateBackUpCoverPointNearBy
	// void SetLastCalculateBackUpCoverPointNearBy(FVector& InEnemyPos);                                                        // [0x2dc0d00] Final|Native|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.SetIsMolotovHurted
	// void SetIsMolotovHurted(bool bInHurted);                                                                                 // [0x2dc0c70] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.SetIsInTryLeanShoot
	// void SetIsInTryLeanShoot(bool bTryLean);                                                                                 // [0x2dc0be0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.SetGoalTarget
	// void SetGoalTarget(class AActor* InOwner, class UNPCAIAttentionPoint* InPoint);                                          // [0x2dc0b20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.SetGoalEnemy
	// void SetGoalEnemy(class AActor* InOwner, class UNPCAITargetInfo* InEnemy);                                               // [0x2dc0a60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.SetCurrentCoverPoint
	// void SetCurrentCoverPoint(class AActor* InOwner, int32_t InCoverPointID);                                                // [0x2dc09a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.RemoveSceneEvent
	// void RemoveSceneEvent(int32_t EventUniqueId);                                                                            // [0x2dc0910] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.QueryPathLengthToPoint
	// float QueryPathLengthToPoint(FVector& ToPoint, int64_t& PointPolyRef, bool bTryUpdatePathNodes);                         // [0x2dc07e0] Final|Native|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.QueryNavPathPoints
	// bool QueryNavPathPoints(FVector& ToPoint, TArray<FVector>& Paths);                                                       // [0x2dc06d0] Final|Native|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.PointIsAroundAI
	// bool PointIsAroundAI(FVector& ToPoint, int64_t& PointPolyRef, bool bTryUpdatePathNodes);                                 // [0x2dc05a0] Final|Native|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.IsSightWeaken
	// bool IsSightWeaken();                                                                                                    // [0x2dc02f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.IsInCover
	// bool IsInCover();                                                                                                        // [0x2dc02c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.IsGoalEnemyThreaten
	// bool IsGoalEnemyThreaten(float ThreatenDistance);                                                                        // [0x2dc0230] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.HasGoldEnemyOrTarget
	// bool HasGoldEnemyOrTarget();                                                                                             // [0x2dbffe0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.GetSightWeakenEndTime
	// float GetSightWeakenEndTime();                                                                                           // [0x28c98b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.GetPauseBehaviorEndTime
	// float GetPauseBehaviorEndTime();                                                                                         // [0x29a2770] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.GetIsMolotovHurted
	// bool GetIsMolotovHurted();                                                                                               // [0x2dbff70] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.GetIsInTryLeanShoot
	// bool GetIsInTryLeanShoot();                                                                                              // [0x29a2610] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.GetGoalTarget
	// class UNPCAIGoalTarget* GetGoalTarget(class AActor* InOwner);                                                            // [0x2dbfee0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.GetGoalEnemy
	// class UNPCAITargetInfo* GetGoalEnemy(class AActor* InOwner);                                                             // [0x2dbfe50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.GetCurrentCoverPoint
	// bool GetCurrentCoverPoint(class AActor* InOwner, FCoverPointOctreeData& Out_CoverPoint);                                 // [0x2dbfd40] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.GetCachedPerceptionComponent
	// class UNPCAIPerceptionComponent* GetCachedPerceptionComponent();                                                         // [0x2dbfd10] Final|Native|Protected 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.CanCalculateBackUpCoverPointNearBy
	// bool CanCalculateBackUpCoverPointNearBy(FVector& InEnemyPos, float InRadiusNoCheck);                                     // [0x2dbfc30] Final|Native|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIMemorySystemComponent.AcceptSceneEvent
	// bool AcceptSceneEvent(int32_t EventUniqueId);                                                                            // [0x2dbfac0] Final|Native|Public  
};

/// Class /Script/MFNPCAI.NPCAIPropertyProfileBase
/// Size: 0x0010 (16 bytes) (0x000028 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyProfileBase : public UObject
{ 
public:
	class UClass*                                      PropertyComponentClass;                                     // 0x0028   (0x0008)  
	EAIProfileType                                     AIProfileType;                                              // 0x0030   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0031   (0x0007)  MISSED
};

/// Class /Script/MFNPCAI.NPCAIModifierProfile
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIModifierProfile : public UNPCAIPropertyProfileBase
{ 
public:
};

/// Class /Script/MFNPCAI.AIModifierAITypeProfile
/// Size: 0x0008 (8 bytes) (0x000038 - 0x000040) align 8 pad: 0x0000
class UAIModifierAITypeProfile : public UNPCAIModifierProfile
{ 
public:
	EAIMainType                                        AIMainType;                                                 // 0x0038   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0039   (0x0007)  MISSED
};

/// Class /Script/MFNPCAI.NPCAIProfileBaseComponent
/// Size: 0x0010 (16 bytes) (0x000028 - 0x000038) align 8 pad: 0x0000
class UNPCAIProfileBaseComponent : public UObject
{ 
public:
	class UNPCAIPropertyProfileBase*                   PropertyProfile;                                            // 0x0028   (0x0008)  
	class AActor*                                      Owner;                                                      // 0x0030   (0x0008)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAIProfileBaseComponent.GetTimeSeconds
	// float GetTimeSeconds();                                                                                                  // [0x2ddc130] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIProfileBaseComponent.GetOwner
	// class AActor* GetOwner();                                                                                                // [0x2ddbfb0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/MFNPCAI.NPCAIModifierComponent
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIModifierComponent : public UNPCAIProfileBaseComponent
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIModifierComponent_AIType
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIModifierComponent_AIType : public UNPCAIModifierComponent
{ 
public:
};

/// Struct /Script/MFNPCAI.AIArmorAttributeModifier
/// Size: 0x0014 (20 bytes) (0x000000 - 0x000014) align 4 pad: 0x0000
struct FAIArmorAttributeModifier
{ 
	float                                              DurabilityConsumeScale_Blocked;                             // 0x0000   (0x0004)  
	float                                              DurabilityConsumeScale_Penetrated;                          // 0x0004   (0x0004)  
	float                                              AntiPenetrationFactor;                                      // 0x0008   (0x0004)  
	float                                              DamageScaleForPenetration;                                  // 0x000C   (0x0004)  
	float                                              DamageScaleForBlock;                                        // 0x0010   (0x0004)  
};

/// Class /Script/MFNPCAI.AIModifierArmorProfile
/// Size: 0x0028 (40 bytes) (0x000038 - 0x000060) align 8 pad: 0x0000
class UAIModifierArmorProfile : public UNPCAIModifierProfile
{ 
public:
	FAIArmorAttributeModifier                          HeadArmor;                                                  // 0x0038   (0x0014)  
	FAIArmorAttributeModifier                          BodyArmor;                                                  // 0x004C   (0x0014)  
};

/// Class /Script/MFNPCAI.NPCAIModifierComponent_Armor
/// Size: 0x0008 (8 bytes) (0x000038 - 0x000040) align 8 pad: 0x0000
class UNPCAIModifierComponent_Armor : public UNPCAIModifierComponent
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0038   (0x0008)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIModifierComponent_Armor.GetHeadArmor
	// FAIArmorAttributeModifier GetHeadArmor();                                                                                // [0x2dc42f0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIModifierComponent_Armor.GetBodyArmor
	// FAIArmorAttributeModifier GetBodyArmor();                                                                                // [0x2dc3e00] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/MFNPCAI.AIModifierDamageProfile
/// Size: 0x0008 (8 bytes) (0x000038 - 0x000040) align 8 pad: 0x0000
class UAIModifierDamageProfile : public UNPCAIModifierProfile
{ 
public:
	float                                              DamageScale;                                                // 0x0038   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x003C   (0x0004)  MISSED
};

/// Class /Script/MFNPCAI.NPCAIModifierComponent_Damage
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIModifierComponent_Damage : public UNPCAIModifierComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIModifierComponent_Damage.GetDamageScale
	// float GetDamageScale();                                                                                                  // [0x2dc3fe0] Final|Native|Public|BlueprintCallable 
};

/// Struct /Script/MFNPCAI.AILocationMonitor
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 8 pad: 0x0000
struct FAILocationMonitor
{ 
	SDK_UNDEFINED(8,615) /* TWeakObjectPtr<APawn*> */  __um(Target);                                               // 0x0000   (0x0008)  
	float                                              MonitoringInterval;                                         // 0x0008   (0x0004)  
	float                                              MaxTimeAllowOutOfNavmesh;                                   // 0x000C   (0x0004)  
	unsigned char                                      UnknownData00_7[0x10];                                      // 0x0010   (0x0010)  MISSED
};

/// Class /Script/MFNPCAI.NPCAIMoverSystemComponent
/// Size: 0x01D8 (472 bytes) (0x000108 - 0x0002E0) align 8 pad: 0x0000
class UNPCAIMoverSystemComponent : public UNPCAISubSystemComponent
{ 
public:
	bool                                               bAllowStrafe;                                               // 0x0108   (0x0001)  
	bool                                               bAllowPartialPath;                                          // 0x0109   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x010A   (0x0002)  MISSED
	float                                              AcceptableRadius;                                           // 0x010C   (0x0004)  
	float                                              OffsetFromCornersDistance;                                  // 0x0110   (0x0004)  
	float                                              DisposableOffsetFromCornersDistance;                        // 0x0114   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0118   (0x0004)  MISSED
	bool                                               bReachTestIncludesAgentRadius;                              // 0x011C   (0x0001)  
	bool                                               bReachTestIncludesGoalRadius;                               // 0x011D   (0x0001)  
	bool                                               bProjectGoalLocation;                                       // 0x011E   (0x0001)  
	unsigned char                                      UnknownData02_6[0x1];                                       // 0x011F   (0x0001)  MISSED
	bool                                               bHandleLandedDelegate;                                      // 0x0120   (0x0001)  
	bool                                               bEnableMoverSystem;                                         // 0x0121   (0x0001)  
	ENPCAIMovementKind                                 MovementKind;                                               // 0x0122   (0x0001)  
	unsigned char                                      UnknownData03_6[0x1];                                       // 0x0123   (0x0001)  MISSED
	int32_t                                            GotoPointDecision;                                          // 0x0124   (0x0004)  
	TArray<class AVolume*>                             AvoidVolumes;                                               // 0x0128   (0x0010)  
	unsigned char                                      UnknownData04_6[0x40];                                      // 0x0138   (0x0040)  MISSED
	FVector                                            DirCurPoint;                                                // 0x0178   (0x000C)  
	ENPCAIMoveResult                                   LastMoveResult;                                             // 0x0184   (0x0001)  
	unsigned char                                      UnknownData05_6[0x17];                                      // 0x0185   (0x0017)  MISSED
	float                                              CurrentSprintEngery;                                        // 0x019C   (0x0004)  
	class UNPCAIPropertyComponent_Move*                MoveProperty;                                               // 0x01A0   (0x0008)  
	FAILocationMonitor                                 LocationMonitor;                                            // 0x01A8   (0x0020)  
	unsigned char                                      UnknownData06_6[0x24];                                      // 0x01C8   (0x0024)  MISSED
	SDK_UNDEFINED(8,616) /* TWeakObjectPtr<AActor*> */ __um(CaredActorWhenMoving);                                 // 0x01EC   (0x0008)  
	float                                              CaredActorEffectRadius;                                     // 0x01F4   (0x0004)  
	FVector                                            BlendingVelocity;                                           // 0x01F8   (0x000C)  
	int32_t                                            CheckPointCountOnPath;                                      // 0x0204   (0x0004)  
	SDK_UNDEFINED(16,617) /* FMulticastInlineDelegate */ __um(OnAIPathChecked);                                    // 0x0208   (0x0010)  
	SDK_UNDEFINED(16,618) /* FMulticastInlineDelegate */ __um(OnAIGoDirectlyFinished);                             // 0x0218   (0x0010)  
	SDK_UNDEFINED(16,619) /* FMulticastInlineDelegate */ __um(OnOutOfNavmesh);                                     // 0x0228   (0x0010)  
	bool                                               bEnableDrawPathPoints;                                      // 0x0238   (0x0001)  
	bool                                               bUseFlanking;                                               // 0x0239   (0x0001)  
	unsigned char                                      UnknownData07_6[0x2];                                       // 0x023A   (0x0002)  MISSED
	FVector                                            DangerPoint;                                                // 0x023C   (0x000C)  
	FVector                                            DangerPointDirection;                                       // 0x0248   (0x000C)  
	float                                              DangerPointEffectRadius;                                    // 0x0254   (0x0004)  
	unsigned char                                      UnknownData08_6[0x4];                                       // 0x0258   (0x0004)  MISSED
	float                                              MaxTurnDistance;                                            // 0x025C   (0x0004)  
	float                                              MinTurnDistance;                                            // 0x0260   (0x0004)  
	float                                              DistanceCheck;                                              // 0x0264   (0x0004)  
	float                                              SwayWidthCheck;                                             // 0x0268   (0x0004)  
	float                                              SwayWidth;                                                  // 0x026C   (0x0004)  
	float                                              RandSwayWidthRate;                                          // 0x0270   (0x0004)  
	float                                              PathOffset;                                                 // 0x0274   (0x0004)  
	int32_t                                            SampleTimes;                                                // 0x0278   (0x0004)  
	int32_t                                            RegionWhereNavLinksNeedDisable;                             // 0x027C   (0x0004)  
	class UActorComponent*                             AIDoorOpenerComponent;                                      // 0x0280   (0x0008)  
	class UActorComponent*                             AIPoseComponent;                                            // 0x0288   (0x0008)  
	int32_t                                            Blending_Count;                                             // 0x0290   (0x0004)  
	float                                              Blending_Time;                                              // 0x0294   (0x0004)  
	unsigned char                                      UnknownData09_7[0x48];                                      // 0x0298   (0x0048)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.SetupRegionWhereNavLinksNeedDisable
	// void SetupRegionWhereNavLinksNeedDisable(int32_t RegionIndex);                                                           // [0x2dc69b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.SetupFlanking
	// void SetupFlanking(FVector& InDangerPoint, FVector& InDangerPointDirection, float InDangerPointEffectRadius);            // [0x2dc6880] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.SetIgnoreGotoPoint
	// void SetIgnoreGotoPoint(float IgnoreTime);                                                                               // [0x2dc6610] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.SetDisposableOffsetFromCornersDistance
	// void SetDisposableOffsetFromCornersDistance(float OffsetDistance);                                                       // [0x2dc6590] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.SetDestination
	// void SetDestination(FVector InPosition);                                                                                 // [0x2dc6500] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.SetCurrentMoveType
	// void SetCurrentMoveType(EAIMoveType InMoveType);                                                                         // [0x2dc6480] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.SetAvoidVolumes
	// void SetAvoidVolumes(TArray<AVolume*> Volumes);                                                                          // [0x2dc6280] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.PauseMovement
	// void PauseMovement(float PauseTime);                                                                                     // [0x2dc5da0] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.OnMovementModeChanged
	// void OnMovementModeChanged(class ACharacter* MovedCharacter, TEnumAsByte<EMovementMode> PrevMovementMode, char PreviousCustomMode); // [0x2dc5ac0] Final|Native|Protected 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.OnMoveCompleted
	// void OnMoveCompleted(FAIRequestID RequestID, TEnumAsByte<EPathFollowingResult> MovementResult);                          // [0x2dc59f0] Final|Native|Protected 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.OnLanded
	// void OnLanded(FHitResult& Hit);                                                                                          // [0x2dc5910] Final|Native|Protected|HasOutParms 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.IsSprintEnergyEnough
	// bool IsSprintEnergyEnough(bool bSprinting);                                                                              // [0x2dc5600] Final|Native|Protected|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.IsPauseMovement
	// bool IsPauseMovement();                                                                                                  // [0x2dc5170] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.IsMovingMayBlocking
	// bool IsMovingMayBlocking();                                                                                              // [0x2dc50a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.IsLastPathPassDoor
	// bool IsLastPathPassDoor();                                                                                               // [0x2dc5070] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.IsLastMoveSuccess
	// bool IsLastMoveSuccess();                                                                                                // [0x2dc5040] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.IsInIgnoreGotoPoint
	// bool IsInIgnoreGotoPoint();                                                                                              // [0x2dc4f70] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.IsGoalPositionReached
	// bool IsGoalPositionReached();                                                                                            // [0x2dc4da0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.IsComeTo
	// bool IsComeTo(bool OnCover);                                                                                             // [0x2dc4d00] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.IsCloseToDestination
	// bool IsCloseToDestination(float InRadius);                                                                               // [0x2dc4c70] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.IsAnyLegBroken
	// bool IsAnyLegBroken();                                                                                                   // [0x2dc4b60] Final|Native|Protected|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.GoToPoint
	// void GoToPoint(FVector InPosition, bool bSlowAtTheEnd, float InReachDist, bool bShoudGetUp, bool bGetUpWithCheck, class AActor* CaredActor, float CaredActorEffectRadius, int32_t GoDecision); // [0x2dc4800] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.GoDirectly
	// void GoDirectly(FVector& Direction, float Seconds, FVector& InBlendingVelocity);                                         // [0x2dc46d0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.GoAccordingToWayPoints
	// void GoAccordingToWayPoints(FNavSkeletonGraphFindResult& PathResult, FNavSkeletonMoveSettings& Settings);                // [0x2dc45a0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.GetNearestDoorState
	// int32_t GetNearestDoorState();                                                                                           // [0x29a2120] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.GetNearestDoorLocation
	// FVector GetNearestDoorLocation();                                                                                        // [0x2dc4420] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.GetMoveType
	// EAIMoveType GetMoveType();                                                                                               // [0x2dc43c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.GetMoveProperty
	// class UNPCAIPropertyComponent_Move* GetMoveProperty();                                                                   // [0x2dc4390] Final|Native|Protected|Const 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.GetMovementKind
	// ENPCAIMovementKind GetMovementKind();                                                                                    // [0x2dc43f0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.GetLastMoveResult
	// ENPCAIMoveResult GetLastMoveResult();                                                                                    // [0x2dc4360] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.GetFromPosition
	// FVector GetFromPosition();                                                                                               // [0x2dc41b0] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.GetDirCurPoint
	// FVector GetDirCurPoint();                                                                                                // [0x2dc4070] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.GetDestinationUpdateTime
	// float GetDestinationUpdateTime();                                                                                        // [0x2dc4050] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.GetDestination
	// FVector GetDestination();                                                                                                // [0x2dc4010] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.ClearMovement
	// void ClearMovement();                                                                                                    // [0x2dc3a30] Final|Native|Protected|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMoverSystemComponent.ClearLastPathPassDoorFlag
	// void ClearLastPathPassDoorFlag();                                                                                        // [0x2dc3a10] Final|Native|Public  
};

/// Class /Script/MFNPCAI.NPCAIMultiTargetSystemComponent
/// Size: 0x0098 (152 bytes) (0x000108 - 0x0001A0) align 8 pad: 0x0000
class UNPCAIMultiTargetSystemComponent : public UNPCAISubSystemComponent
{ 
public:
	bool                                               bDebugSuspectedPoint;                                       // 0x0108   (0x0001)  
	bool                                               bDebugShootOffsetScope;                                     // 0x0109   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x010A   (0x0002)  MISSED
	float                                              TimeOfShootOffsetScopeDraw;                                 // 0x010C   (0x0004)  
	bool                                               bDebugShootScopeTestPoints;                                 // 0x0110   (0x0001)  
	bool                                               bLogGoalEnemyScore;                                         // 0x0111   (0x0001)  
	bool                                               bWantCalculateGoalTargetPoint;                              // 0x0112   (0x0001)  
	bool                                               bWantCalculateGoalEnemy;                                    // 0x0113   (0x0001)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0114   (0x0004)  MISSED
	class UNPCAIZoneGroupInfo*                         ZoneGroupInfo;                                              // 0x0118   (0x0008)  
	int32_t                                            DynamicGroupId;                                             // 0x0120   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x0124   (0x0004)  MISSED
	TArray<class UNPCAITargetInfo*>                    AllTargetInfoList;                                          // 0x0128   (0x0010)  
	float                                              LastChangeEnemyTime;                                        // 0x0138   (0x0004)  
	float                                              LastWantCalcEnemyTime;                                      // 0x013C   (0x0004)  
	unsigned char                                      UnknownData03_6[0x8];                                       // 0x0140   (0x0008)  MISSED
	class UNPCAIMemorySystemComponent*                 MemoryComponent;                                            // 0x0148   (0x0008)  
	class UNPCAIPerceptionComponent*                   PerceptionComponent;                                        // 0x0150   (0x0008)  
	class UActorComponent*                             AIStaticComponent;                                          // 0x0158   (0x0008)  
	class UNPCAIGlobalSharedInfo*                      SharedInfo;                                                 // 0x0160   (0x0008)  
	class UNPCAIPropertyComponent_Mind*                MindProps;                                                  // 0x0168   (0x0008)  
	class UNPCAIPropertyComponent_Hearing*             HearProps;                                                  // 0x0170   (0x0008)  
	class UNPCAIPropertyComponent_Aiming*              AimingProps;                                                // 0x0178   (0x0008)  
	class UNPCAIPropertyComponent_Health*              HealthProps;                                                // 0x0180   (0x0008)  
	class UNPCAIPropertyComponent_Grenade*             GrenadeProps;                                               // 0x0188   (0x0008)  
	class UNPCAIPropertyComponent_Damage*              DamageProps;                                                // 0x0190   (0x0008)  
	float                                              CD_CHANGE_GOALENEMY_IF_BOTH_NOT_SEE;                        // 0x0198   (0x0004)  
	unsigned char                                      UnknownData04_7[0x4];                                       // 0x019C   (0x0004)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.WantToCalculateGoalEnemy
	// void WantToCalculateGoalEnemy();                                                                                         // [0x2dc6d70] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.UpdateGroupEnemyVisibleInfo
	// void UpdateGroupEnemyVisibleInfo(class AActor* InEnemy, FVector InLastSeenPosition, float SeenTime);                     // [0x2dc6c50] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.SwitchToTemporaryEnemy
	// bool SwitchToTemporaryEnemy(class AActor* InNeutral, float InEndTime);                                                   // [0x2dc6b80] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.SwitchEnemyToNeutral
	// bool SwitchEnemyToNeutral(class AActor* InEnemy);                                                                        // [0x2dc6ae0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.SwitchEnemyToAlly
	// bool SwitchEnemyToAlly(class AActor* InEnemy);                                                                           // [0x2dc6a40] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.SetZoneGroupInfo
	// void SetZoneGroupInfo(class UNPCAIZoneGroupInfo* InGroupInfo);                                                           // [0x2dc67f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.SetKnowEnemySeenTimeAndPosition
	// void SetKnowEnemySeenTimeAndPosition(class AActor* InTargetPawn, bool bCanSeenSoon);                                     // [0x2dc6690] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.SearchDangerPoint
	// class UNPCAIAttentionPoint* SearchDangerPoint();                                                                         // [0x2dc61c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.SearchDangerEnemy
	// class UNPCAITargetInfo* SearchDangerEnemy();                                                                             // [0x2dc6190] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.RemoveSuspectedPointByType
	// void RemoveSuspectedPointByType(ENPCPlaceForCheckType InPlaceType, class AActor* InCreator);                             // [0x2dc60c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.RemoveSuspectedPoint
	// void RemoveSuspectedPoint(class UNPCAIAttentionPoint* InAttentionPoint, bool bRemoveNearCanSee);                         // [0x2dc5ff0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.RemoveNeutral
	// void RemoveNeutral(class AActor* InNeutral);                                                                             // [0x2dc5f60] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.RemoveEnemy
	// void RemoveEnemy(class AActor* InEnemy);                                                                                 // [0x2dc5ed0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.RemoveAlly
	// void RemoveAlly(class AActor* InAlly);                                                                                   // [0x2dc5e40] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.QuitToDynamicGroup
	// void QuitToDynamicGroup();                                                                                               // [0x2dc5e20] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.JoinToDynamicGroup
	// bool JoinToDynamicGroup(int32_t DyGroupId);                                                                              // [0x2dc56a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.IsPointInVShootScope
	// bool IsPointInVShootScope(FVector& GunPoint, FVector& ShootPoint, float HRadin, float VTopRadin, float VLowRadin, FVector& InPoint); // [0x2dc53d0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.IsPointInHShootScope
	// bool IsPointInHShootScope(FVector& GunPoint, FVector& ShootPoint, float HRadin, float VTopRadin, float VLowRadin, FVector& InPoint); // [0x2dc51a0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.IsNeutral
	// bool IsNeutral(class AActor* InNeutral);                                                                                 // [0x2dc50d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.IsInSameZoneGroup
	// bool IsInSameZoneGroup(class AActor* InTarget);                                                                          // [0x2dc4fa0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.IsGroupEnemy
	// bool IsGroupEnemy(class AActor* InEnemy);                                                                                // [0x2dc4dd0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.IsAlly
	// bool IsAlly(class AActor* InAlly);                                                                                       // [0x2dc4ac0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.HasOthersAllyInShootScope
	// bool HasOthersAllyInShootScope();                                                                                        // [0x2dc4a90] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.GetZoneGroupInfo
	// class UNPCAIZoneGroupInfo* GetZoneGroupInfo();                                                                           // [0x286ae70] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.GetYoungestSuspectedPoint
	// class UNPCAIAttentionPoint* GetYoungestSuspectedPoint(class AActor* InCharacter, float InRadius, bool InPriorityDanger); // [0x2dc4490] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.GetNeutralsNum
	// int32_t GetNeutralsNum();                                                                                                // [0x2dc4460] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.GetEnemyNum
	// int32_t GetEnemyNum();                                                                                                   // [0x2dc4150] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.GetEnemyGroupInfo
	// class UNPCAIEnemyGroupSingleInfo* GetEnemyGroupInfo(class AActor* InTarget);                                             // [0x2dc40b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.GetDynamicGroupId
	// int32_t GetDynamicGroupId();                                                                                             // [0x2aad290] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.GetBulletFireDangerPower
	// int32_t GetBulletFireDangerPower(bool IsHitNoise, FVector InNoisePosition, float InNoiseDistance, FVector InBulletVelocity); // [0x2dc3e40] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.GetAllyNum
	// int32_t GetAllyNum();                                                                                                    // [0x2dc3da0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.GetAllTargetInfoList
	// TArray<UNPCAITargetInfo*> GetAllTargetInfoList();                                                                        // [0x2dc3d10] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.GetAllInSightEnemys
	// void GetAllInSightEnemys(TArray<AActor*>& OutEnemys);                                                                    // [0x2dc3c40] Final|Native|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.GetAllHadSeenEnemys
	// void GetAllHadSeenEnemys(TArray<AActor*>& OutEnemys);                                                                    // [0x2dc3b70] Final|Native|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.FilterNotValidEnemyOrPoints
	// void FilterNotValidEnemyOrPoints();                                                                                      // [0x2dc3b50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.CanHeardNoise
	// bool CanHeardNoise(float InNoiseDistance, float InNoisePower);                                                           // [0x2dc3930] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.CalculateShootScope
	// bool CalculateShootScope(FVector& GunPoint, FVector& ShootPoint, float& HRadian, float& VTopRadian, float& VLowRadian, FVector& HMaxPoint1, FVector& HMaxPoint2, FVector& VTopPoint, FVector& VLowPoint); // [0x2dc3610] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.CalculateGoalPointForBot
	// void CalculateGoalPointForBot();                                                                                         // [0x2dc35f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.CalculateGoalForBot
	// void CalculateGoalForBot();                                                                                              // [0x2dc35d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.CalculateGoalEnemyForBot
	// void CalculateGoalEnemyForBot();                                                                                         // [0x2dc35b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.AddSuspectedPointToSearch
	// class UNPCAIAttentionPoint* AddSuspectedPointToSearch(FVector InPoint, ENPCPlaceForCheckType InPlaceType, class AActor* InCreator, bool bIsAutoReCalculate, bool bIsAddSuspectedNum); // [0x2dc33d0] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.AddNeutral
	// void AddNeutral(class AActor* InNeutral);                                                                                // [0x2dc3340] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.AddEnemy
	// class UNPCAIEnemyGroupSingleInfo* AddEnemy(class AActor* InEnemy);                                                       // [0x2dc32a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.AddAllyGoalEnemyIfNotTarget
	// class UNPCAITargetInfo* AddAllyGoalEnemyIfNotTarget(float InRange);                                                      // [0x2dc3210] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSystemComponent.AddAlly
	// void AddAlly(class AActor* InAlly);                                                                                      // [0x2dc3180] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIMultiTargetSelectorComponent
/// Size: 0x0108 (264 bytes) (0x0001A0 - 0x0002A8) align 8 pad: 0x0000
class UNPCAIMultiTargetSelectorComponent : public UNPCAIMultiTargetSystemComponent
{ 
public:
	FString                                            PerceptionTag1;                                             // 0x01A0   (0x0010)  
	FString                                            PerceptionTag2;                                             // 0x01B0   (0x0010)  
	FString                                            PerceptionTag3;                                             // 0x01C0   (0x0010)  
	float                                              DistanceToPercActor;                                        // 0x01D0   (0x0004)  
	float                                              DistanceToPercLoc;                                          // 0x01D4   (0x0004)  
	class AActor*                                      PerceptionActor;                                            // 0x01D8   (0x0008)  
	FAIStimulus                                        PerceptionStimulus;                                         // 0x01E0   (0x003C)  
	bool                                               bIsTeamEnemy;                                               // 0x021C   (0x0001)  
	bool                                               bIsTeamFriendly;                                            // 0x021D   (0x0001)  
	bool                                               bIsGroupEnemy;                                              // 0x021E   (0x0001)  
	bool                                               bIsGroupAlly;                                               // 0x021F   (0x0001)  
	bool                                               bIsSounder;                                                 // 0x0220   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0221   (0x0007)  MISSED
	class AActor*                                      SounderThrower;                                             // 0x0228   (0x0008)  
	bool                                               bIsCheatGhost;                                              // 0x0230   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0231   (0x0003)  MISSED
	float                                              LastCalculateWarnPlayerTime;                                // 0x0234   (0x0004)  
	float                                              LastCalculateGoalEnemyTime;                                 // 0x0238   (0x0004)  
	float                                              LastCalculateGoalPointTime;                                 // 0x023C   (0x0004)  
	float                                              NextLeanAutoRelaxTime;                                      // 0x0240   (0x0004)  
	float                                              LastTodoHearingTime;                                        // 0x0244   (0x0004)  
	unsigned char                                      UnknownData02_6[0x8];                                       // 0x0248   (0x0008)  MISSED
	class AActor*                                      LastFireToMePerson;                                         // 0x0250   (0x0008)  
	float                                              LastFireToMeTime;                                           // 0x0258   (0x0004)  
	unsigned char                                      UnknownData03_6[0x4];                                       // 0x025C   (0x0004)  MISSED
	class AActor*                                      LastShootMePerson;                                          // 0x0260   (0x0008)  
	FVector                                            LastShootMePersonLocation;                                  // 0x0268   (0x000C)  
	FVector                                            LastShootMeSelfLocation;                                    // 0x0274   (0x000C)  
	float                                              LastShootMeDamageValue;                                     // 0x0280   (0x0004)  
	float                                              LastBeenShootTime;                                          // 0x0284   (0x0004)  
	FAIShotCountStat                                   BeHitCount;                                                 // 0x0288   (0x0010)  
	float                                              TEMPORARY_ENEMY_DURATION_TIME;                              // 0x0298   (0x0004)  
	float                                              SWITCH_TO_ENEMY_IF_ATK_INRADIUS;                            // 0x029C   (0x0004)  
	float                                              SWITCH_TO_ENEMY_IF_NEARBY_BETRAYER;                         // 0x02A0   (0x0004)  
	unsigned char                                      UnknownData04_7[0x4];                                       // 0x02A4   (0x0004)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIMultiTargetSelectorComponent.SetScavPlayerTeamAsGroupEnemy
	// void SetScavPlayerTeamAsGroupEnemy(class AActor* InScavPlayer);                                                          // [0x2dc6760] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSelectorComponent.SetBeHitDetail
	// void SetBeHitDetail(class AActor* DamageCauser, float DamageValue, float InTimeSec);                                     // [0x2dc6370] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSelectorComponent.SeparateMultiTags
	// void SeparateMultiTags(FName InTotalTag);                                                                                // [0x2dc61f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSelectorComponent.OnSmokeExplosionToDo
	// void OnSmokeExplosionToDo();                                                                                             // [0x2dc5d80] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSelectorComponent.OnSightToDo
	// void OnSightToDo();                                                                                                      // [0x2dc5d60] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSelectorComponent.OnPerceptionUpdated
	// void OnPerceptionUpdated(class AActor* InTarget, FAIStimulus InAIStimulus);                                              // [0x2dc5bd0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSelectorComponent.OnHearingToDo
	// void OnHearingToDo();                                                                                                    // [0x2dc58f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSelectorComponent.OnDamageToDo
	// void OnDamageToDo();                                                                                                     // [0x2dc58d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSelectorComponent.OnBulletFireToDo
	// void OnBulletFireToDo(class AActor* InInstigator, FVector InBulletLocation, FVector InBulletVelocity, FName InNoiseType); // [0x2dc5740] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSelectorComponent.IsGunNoise
	// bool IsGunNoise(FString InTag);                                                                                          // [0x2dc4e70] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSelectorComponent.IsBeingFireHited
	// bool IsBeingFireHited(float InTime, class AActor*& OutWhoFire);                                                          // [0x2dc4b90] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSelectorComponent.GetLastBeHitTime
	// float GetLastBeHitTime();                                                                                                // [0x2dc4330] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSelectorComponent.GetFuzzyPointCoef
	// float GetFuzzyPointCoef(FString InHearTag);                                                                              // [0x2dc41f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSelectorComponent.GetFirstBeHitTime
	// float GetFirstBeHitTime();                                                                                               // [0x2dc4180] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSelectorComponent.GetBeHitCount
	// int32_t GetBeHitCount();                                                                                                 // [0x2dc3dd0] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIMultiTargetSelectorComponent.CreateFuzzyPoint
	// FVector CreateFuzzyPoint(FVector InCenterPoint, float InFuzzyRadius);                                                    // [0x2dc3a50] Final|Native|Public|HasDefaults|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAINavSubsystemBase
/// Size: 0x0000 (0 bytes) (0x000030 - 0x000030) align 8 pad: 0x0000
class UNPCAINavSubsystemBase : public UWorldSubsystem
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAINavSubsystemBase.IsNavTileDataPrepared
	// bool IsNavTileDataPrepared(class UObject* WorldContextObject);                                                           // [0x2dd7190] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavSubsystemBase.IsLocationOnNavLink
	// bool IsLocationOnNavLink(class UObject* WorldContextObject, FVector& Location);                                          // [0x2dd70c0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavSubsystemBase.GetNavLinkById
	// class ANPCAINavLinkProxy* GetNavLinkById(class UObject* WorldContextObject, int32_t LinkID);                             // [0x2dd6de0] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAINavConnectivitySystem
/// Size: 0x0000 (0 bytes) (0x000030 - 0x000030) align 8 pad: 0x0000
class UNPCAINavConnectivitySystem : public UNPCAINavSubsystemBase
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAINavConnectivitySystem.GetNavLinkCylinderLocation
	// bool GetNavLinkCylinderLocation(class ANPCAINavLinkProxy* NavLink, int32_t RegionIndex, FVector& OutLocation);           // [0x2dc8c80] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAINavConnectivitySystem.GetLinkUsageCount
	// int32_t GetLinkUsageCount(FVector& SourceLocation, FVector& TargetLocation, int32_t& OutSourceRegionIndex, int32_t& OutTargetRegionIndex, int32_t& OutSourceRegionSize, int32_t& OutTargetRegionSize, EGetLinkUsageCountStatus& OutStatus); // [0x2dc88e0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAINavConnectivitySystem.GetDoorNavLinksInRegion
	// TArray<ANPCAINavLinkProxy*> GetDoorNavLinksInRegion(int32_t RegionIndex);                                                // [0x2dc8740] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAINavConnectivitySystem.GetDoorNavLinksBetweenAdjacentRegions
	// TArray<ANPCAINavLinkProxy*> GetDoorNavLinksBetweenAdjacentRegions(int32_t SourceRegionIndex, int32_t TargetRegionIndex); // [0x2dc8630] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/MFNPCAI.NPCAINavDebugSystem
/// Size: 0x0000 (0 bytes) (0x000030 - 0x000030) align 8 pad: 0x0000
class UNPCAINavDebugSystem : public UNPCAINavSubsystemBase
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAINavDebugSystem.TestDoorPath
	// bool TestDoorPath(class UObject* WorldContextObject, class ANPCAINavLinkProxy* NavLinkProxy);                            // [0x2dc9e50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavDebugSystem.ProjectPointToNavMesh
	// bool ProjectPointToNavMesh(class UObject* WorldContextObject, FVector& Location, FVector& QueryExtent, int32_t& OutPolyIndex, FVector& OutProjectedLocation); // [0x2dc9bf0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavDebugSystem.PrintNavMeshPolygonSlope
	// void PrintNavMeshPolygonSlope(class UObject* WorldContextObject, FVector& Location);                                     // [0x2dc9a90] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavDebugSystem.PlaceActorsOnNodes
	// void PlaceActorsOnNodes(class UObject* WorldContextObject, FString NodeIndicesString, bool bUseNodeIndexAsPolyRef, TArray<AActor*>& OutActors); // [0x2dc98f0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavDebugSystem.LabelTiles
	// TArray<ENavMeshTileLabel> LabelTiles(class UObject* WorldContextObject, TMap<int32_t, int32_t>& LabeledPolys, bool bConsiderUnreachablePoints); // [0x2dc9300] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavDebugSystem.LabelPolys
	// TMap<int32_t, int32_t> LabelPolys(class UObject* WorldContextObject, TArray<int32_t>& PolyIndices, TArray<FVector>& SeedLocations, FVector& QueryExtent, bool bHintProjection2D); // [0x2dc9090] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavDebugSystem.IsLocationOnNavLinkDebug
	// void IsLocationOnNavLinkDebug(class UObject* WorldContextObject, FVector& Location);                                     // [0x2dc8e60] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavDebugSystem.GetSeedTravelLocations
	// TArray<FVector> GetSeedTravelLocations(class UObject* WorldContextObject);                                               // [0x2dc8d90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavDebugSystem.GetLinkUsageCountDebug
	// void GetLinkUsageCountDebug(class UObject* WorldContextObject, FVector& SourceLocation, FVector& TargetLocation);        // [0x2dc8b60] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavDebugSystem.GetDoorNavLinksInRegionDebug
	// void GetDoorNavLinksInRegionDebug(class UObject* WorldContextObject, FVector& SourceLocation);                           // [0x2dc8820] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavDebugSystem.GetAllPolyIndices
	// TArray<int32_t> GetAllPolyIndices(class UObject* WorldContextObject);                                                    // [0x2dc8560] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavDebugSystem.DestroyPlacedActors
	// void DestroyPlacedActors(TArray<AActor*>& OutActors);                                                                    // [0x2dc82b0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavDebugSystem.CalculateBoundaryEdgeLength
	// void CalculateBoundaryEdgeLength(class UObject* WorldContextObject);                                                     // [0x2dc8230] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAINavExperimentSystem
/// Size: 0x0000 (0 bytes) (0x000030 - 0x000030) align 8 pad: 0x0000
class UNPCAINavExperimentSystem : public UNPCAINavSubsystemBase
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAINavExperimentSystem.TestRaycastToNavSkeletonPoints
	// TArray<bool> TestRaycastToNavSkeletonPoints(class UObject* WorldContextObject, FVector& StartLocation, TArray<int32_t>& PointIDs); // [0x2dca170] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavExperimentSystem.TestNavSkeletonFloodFrom
	// TArray<bool> TestNavSkeletonFloodFrom(class UObject* WorldContextObject, FVector& StartLocation, float MaxPathLength);   // [0x2dca020] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavExperimentSystem.TestNavRaycast
	// void TestNavRaycast(class UObject* WorldContextObject);                                                                  // [0x2dc9dd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavExperimentSystem.TestMoveDirectly
	// void TestMoveDirectly(class UObject* WorldContextObject);                                                                // [0x2dc9fa0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavExperimentSystem.TestMoveAlongSurface
	// void TestMoveAlongSurface(class UObject* WorldContextObject);                                                            // [0x2dc9f20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavExperimentSystem.TestLimitMoveInRegion
	// void TestLimitMoveInRegion(class UObject* WorldContextObject);                                                           // [0x2dc9dd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavExperimentSystem.TestArrangeStandPositions
	// void TestArrangeStandPositions(class UObject* WorldContextObject);                                                       // [0x2dc9dd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavExperimentSystem.TestAIMoveDirectly
	// void TestAIMoveDirectly(class UObject* WorldContextObject);                                                              // [0x2dc9dd0] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAINavigationStatics
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAINavigationStatics : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAINavigationStatics.PathNodesToNeighborPathNodes
	// void PathNodesToNeighborPathNodes(class UObject* WorldContext, TArray<int32_t>& TargetPathNodes, int32_t Step, TArray<int32_t>& Result); // [0x2dc9760] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavigationStatics.PathNodesToDistAndNeighborPathNodes
	// void PathNodesToDistAndNeighborPathNodes(class UObject* WorldContext, TArray<int32_t>& TargetPathNodes, float PathLength, TArray<int32_t>& NodesInPathLength, TArray<int32_t>& NodesNeighbor, bool& IsTimeOut); // [0x2dc9520] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavigationStatics.IsNavigationPlanarFloor
	// bool IsNavigationPlanarFloor(class UObject* WorldContext, FVector& StartPoint, FVector& Direction, float Distance);      // [0x2dc8f20] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavigationStatics.FindCloserToMePoints
	// void FindCloserToMePoints(class UObject* WorldContext, TArray<int32_t>& PathNodeIds, FVector& MyLocation, FVector& EnemyLocation, TArray<int32_t>& Result); // [0x2dc8370] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAINavigationSystem
/// Size: 0x0000 (0 bytes) (0x0015F8 - 0x0015F8) align 8 pad: 0x0000
class UNPCAINavigationSystem : public UNavigationSystemV1
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAINavigationSystemConfig
/// Size: 0x0000 (0 bytes) (0x000058 - 0x000058) align 8 pad: 0x0000
class UNPCAINavigationSystemConfig : public UNavigationSystemModuleConfig
{ 
public:
};

/// Struct /Script/MFNPCAI.NavSkeletonBuildSettings
/// Size: 0x008C (140 bytes) (0x000000 - 0x00008C) align 4 pad: 0x0000
struct FNavSkeletonBuildSettings
{ 
	FVector                                            NavQueryExtent;                                             // 0x0000   (0x000C)  
	float                                              SampleSpacing;                                              // 0x000C   (0x0004)  
	float                                              DeltaLength;                                                // 0x0010   (0x0004)  
	int32_t                                            GradientNeighbourRadius;                                    // 0x0014   (0x0004)  
	float                                              DivergenceFilterThreshold;                                  // 0x0018   (0x0004)  
	float                                              DivergenceNeighbourRadius;                                  // 0x001C   (0x0004)  
	float                                              CoarseCoverageNeighbourRadius;                              // 0x0020   (0x0004)  
	float                                              RefinedCoverageNeighbourRadius;                             // 0x0024   (0x0004)  
	float                                              PolylineSimplificationDistanceThreshold;                    // 0x0028   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x002C   (0x0004)  MISSED
	bool                                               bUseNewBuilder;                                             // 0x0030   (0x0001)  
	bool                                               bCheckEdgeOnNavMesh;                                        // 0x0031   (0x0001)  
	bool                                               bRemoveUnreachablePoints;                                   // 0x0032   (0x0001)  
	bool                                               bHintProjection2D;                                          // 0x0033   (0x0001)  
	bool                                               bAddRegionConnection;                                       // 0x0034   (0x0001)  
	bool                                               bEnableCollapseShortPolylines;                              // 0x0035   (0x0001)  
	bool                                               bEnableParallelFindWallsInNeighbourhood;                    // 0x0036   (0x0001)  
	bool                                               bEnableParallelCalculateWallDistance;                       // 0x0037   (0x0001)  
	bool                                               bEnableParallelGenerateRawPoints;                           // 0x0038   (0x0001)  
	bool                                               bEnableParallelCalculateGradient;                           // 0x0039   (0x0001)  
	bool                                               bEnableParallelCalculateDivergence;                         // 0x003A   (0x0001)  
	bool                                               bEnableParallelCalculateOutdoors;                           // 0x003B   (0x0001)  
	bool                                               bEnableParallelPruneSamplePoints;                           // 0x003C   (0x0001)  
	bool                                               bEnableParallelCalculateProtection;                         // 0x003D   (0x0001)  
	bool                                               bEnableParallelCalculateVisibility;                         // 0x003E   (0x0001)  
	bool                                               bEnableParallelCalculateThrowing;                           // 0x003F   (0x0001)  
	bool                                               bEnableParallelCalculateMoving;                             // 0x0040   (0x0001)  
	bool                                               bEnablePruneSamplePoints;                                   // 0x0041   (0x0001)  
	bool                                               bEnableRemoveTooCloseMainPointAtCoverageStage;              // 0x0042   (0x0001)  
	bool                                               bEnableRefineCoverage;                                      // 0x0043   (0x0001)  
	bool                                               bEnablePruneEndBranch;                                      // 0x0044   (0x0001)  
	bool                                               bEnableCalculateVisibilityStage;                            // 0x0045   (0x0001)  
	bool                                               bEnableCalculateThrowingStage;                              // 0x0046   (0x0001)  
	ENavSkeletonDivergenceMethod                       DivergenceMethod;                                           // 0x0047   (0x0001)  
	float                                              FindWallInRadius;                                           // 0x0048   (0x0004)  
	int32_t                                            MaxWallCount;                                               // 0x004C   (0x0004)  
	float                                              PolylineLengthLowerBound;                                   // 0x0050   (0x0004)  
	float                                              RegionConnectionDistanceTolerance;                          // 0x0054   (0x0004)  
	float                                              VisiblityQueryZExtent;                                      // 0x0058   (0x0004)  
	float                                              VisiblityTraceZOffset;                                      // 0x005C   (0x0004)  
	float                                              VisiblityMaxRange;                                          // 0x0060   (0x0004)  
	float                                              ProtectionTraceAngleStep;                                   // 0x0064   (0x0004)  
	float                                              ProtectionTraceZOffset;                                     // 0x0068   (0x0004)  
	float                                              ProtectionTraceMaxRange;                                    // 0x006C   (0x0004)  
	float                                              EndpointProtectionLowerBound;                               // 0x0070   (0x0004)  
	float                                              ThrowingInitialSpeed;                                       // 0x0074   (0x0004)  
	float                                              ThrowingMaxRange;                                           // 0x0078   (0x0004)  
	float                                              MovingMaxRange;                                             // 0x007C   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0080   (0x0004)  MISSED
	float                                              CheckOutdoorsRadius;                                        // 0x0084   (0x0004)  
	float                                              CheckOutdoorsHeight;                                        // 0x0088   (0x0004)  
};

/// Struct /Script/MFNPCAI.NavSkeletonPoint
/// Size: 0x0090 (144 bytes) (0x000010 - 0x0000A0) align 8 pad: 0x0000
struct FNavSkeletonPoint : FActionPointData
{ 
	bool                                               Outdoors;                                                   // 0x0010   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0011   (0x0003)  MISSED
	float                                              Radius;                                                     // 0x0014   (0x0004)  
	float                                              EffectiveRange;                                             // 0x0018   (0x0004)  
	int32_t                                            LinkID;                                                     // 0x001C   (0x0004)  
	uint64_t                                           AtPolyRef;                                                  // 0x0020   (0x0008)  
	FVector                                            ProtectionDirection;                                        // 0x0028   (0x000C)  
	float                                              ProtectionHalfAngle;                                        // 0x0034   (0x0004)  
	int32_t                                            BattleIntensityExpectation;                                 // 0x0038   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x003C   (0x0004)  MISSED
	TArray<int32_t>                                    NeighbourIndices;                                           // 0x0040   (0x0010)  
	TArray<float>                                      NeighbourDistances;                                         // 0x0050   (0x0010)  
	TArray<int32_t>                                    VisibleIndices;                                             // 0x0060   (0x0010)  
	TArray<int32_t>                                    ThrowableIndices;                                           // 0x0070   (0x0010)  
	TArray<int32_t>                                    MovableIndices;                                             // 0x0080   (0x0010)  
	TArray<int32_t>                                    FriendIndices;                                              // 0x0090   (0x0010)  
};

/// Struct /Script/MFNPCAI.NavSkeletonData
/// Size: 0x0060 (96 bytes) (0x000000 - 0x000060) align 8 pad: 0x0000
struct FNavSkeletonData
{ 
	TArray<FNavSkeletonPoint>                          Points;                                                     // 0x0000   (0x0010)  
	SDK_UNDEFINED(80,620) /* TMap<uint64_t, FNavSkeletonPatchedPath> */ __um(UnstableSegmentPatchPaths);           // 0x0010   (0x0050)  
};

/// Class /Script/MFNPCAI.NPCAINavMeshManager
/// Size: 0x02B0 (688 bytes) (0x0002E0 - 0x000590) align 8 pad: 0x0000
class ANPCAINavMeshManager : public AActor
{ 
public:
	unsigned char                                      UnknownData00_3[0x198];                                     // 0x02E0   (0x0198)  MISSED
	FNavSkeletonBuildSettings                          SkeletonBuildSettings;                                      // 0x0478   (0x008C)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0504   (0x0004)  MISSED
	TArray<FNavSkeletonPoint>                          NavSkeletonPoints;                                          // 0x0508   (0x0010)  
	FNavSkeletonData                                   NavSkeletonData;                                            // 0x0518   (0x0060)  
	unsigned char                                      UnknownData02_6[0x8];                                       // 0x0578   (0x0008)  MISSED
	TArray<class ANPCAINavLinkProxy*>                  CachedNavLinkProxies;                                       // 0x0580   (0x0010)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAINavMeshManager.PrintSkeletonPointRadiusStat
	// void PrintSkeletonPointRadiusStat();                                                                                     // [0x2dc9bd0] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAINavMeshManager.PrintSkeletonPointDegreeStat
	// void PrintSkeletonPointDegreeStat();                                                                                     // [0x2dc9bb0] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAINavMeshManager.PrintSkeletonMemoryUsage
	// void PrintSkeletonMemoryUsage();                                                                                         // [0x2dc9b90] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAINavMeshManager.PrintSkeletonInfo
	// void PrintSkeletonInfo();                                                                                                // [0x2dc9b70] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAINavMeshManager.PrintSkeletonEdgeLengthStat
	// void PrintSkeletonEdgeLengthStat();                                                                                      // [0x2dc9b50] Final|Native|Public  
};

/// Class /Script/MFNPCAI.NPCAITestingRenderingComponent
/// Size: 0x0008 (8 bytes) (0x0005D8 - 0x0005E0) align 16 pad: 0x0000
class UNPCAITestingRenderingComponent : public UPrimitiveComponent
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x05D8   (0x0008)  MISSED
};

/// Class /Script/MFNPCAI.NPCAINavMeshRenderingComponent
/// Size: 0x0000 (0 bytes) (0x0005E0 - 0x0005E0) align 16 pad: 0x0000
class UNPCAINavMeshRenderingComponent : public UNPCAITestingRenderingComponent
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAITestingActor
/// Size: 0x0038 (56 bytes) (0x0002E0 - 0x000318) align 8 pad: 0x0000
class ANPCAITestingActor : public AActor
{ 
public:
	class UCapsuleComponent*                           CapsuleComponent;                                           // 0x02E0   (0x0008)  
	FNavAgentProperties                                NavAgentProps;                                              // 0x02E8   (0x0030)  
};

/// Class /Script/MFNPCAI.NPCAINavMeshTestingActor
/// Size: 0x03C8 (968 bytes) (0x000318 - 0x0006E0) align 16 pad: 0x0000
class ANPCAINavMeshTestingActor : public ANPCAITestingActor
{ 
public:
	float                                              ToWallCylinderHeight;                                       // 0x0318   (0x0004)  
	float                                              RadiusMultiplier;                                           // 0x031C   (0x0004)  
	float                                              DistanceHeightMultiplier;                                   // 0x0320   (0x0004)  
	float                                              DistanceLineThickness;                                      // 0x0324   (0x0004)  
	float                                              ShowGradientThreshold;                                      // 0x0328   (0x0004)  
	float                                              GradientZOffset;                                            // 0x032C   (0x0004)  
	float                                              UpdateGradientFlowAnimInterval;                             // 0x0330   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0334   (0x0004)  MISSED
	float                                              ShowDivergenceThreshold;                                    // 0x0338   (0x0004)  
	float                                              DivergenceHeightMultiplier;                                 // 0x033C   (0x0004)  
	float                                              DivergenceLineThickness;                                    // 0x0340   (0x0004)  
	float                                              ConnectionLineThickness;                                    // 0x0344   (0x0004)  
	float                                              SimlifiedConnectionZOffset;                                 // 0x0348   (0x0004)  
	int32_t                                            ShowCoverageLevel;                                          // 0x034C   (0x0004)  
	int32_t                                            ShowWallLevel;                                              // 0x0350   (0x0004)  
	bool                                               bEnableRefreshData : 1;                                     // 0x0354:0 (0x0001)  
	bool                                               bDrawSamplePoints : 1;                                      // 0x0354:1 (0x0001)  
	bool                                               bDrawWallCountMap : 1;                                      // 0x0354:2 (0x0001)  
	bool                                               bDrawDistanceMap : 1;                                       // 0x0354:3 (0x0001)  
	bool                                               bDrawGradient : 1;                                          // 0x0354:4 (0x0001)  
	bool                                               bShowAllGradient : 1;                                       // 0x0354:5 (0x0001)  
	bool                                               bDrawGradientFlowAnim : 1;                                  // 0x0354:6 (0x0001)  
	bool                                               bDrawCoverage : 1;                                          // 0x0354:7 (0x0001)  
	bool                                               bAlwaysShowMainCoverage : 1;                                // 0x0355:0 (0x0001)  
	bool                                               bDrawOriginalConnection : 1;                                // 0x0355:1 (0x0001)  
	bool                                               bDrawSimplifiedConnection : 1;                              // 0x0355:2 (0x0001)  
	bool                                               bOnlyDrawMainSimplifiedConnection : 1;                      // 0x0355:3 (0x0001)  
	unsigned char                                      UnknownData01_5[0x2];                                       // 0x0356   (0x0002)  MISSED
	int32_t                                            NearestMainCoverageSampleIndex;                             // 0x0358   (0x0004)  
	int32_t                                            PolyMeshCount;                                              // 0x035C   (0x0004)  
	int32_t                                            PolylineCount;                                              // 0x0360   (0x0004)  
	int32_t                                            CurrentTileIndex;                                           // 0x0364   (0x0004)  
	FVector                                            ClosestPointOnWall;                                         // 0x0368   (0x000C)  
	unsigned char                                      UnknownData02_6[0x14];                                      // 0x0374   (0x0014)  MISSED
	int32_t                                            NeighbourWallEdgeCount;                                     // 0x0388   (0x0004)  
	float                                              DistanceToWall;                                             // 0x038C   (0x0004)  
	FVector4                                           SamplePointCountStat;                                       // 0x0390   (0x0010)  
	FVector4                                           WallStat;                                                   // 0x03A0   (0x0010)  
	FVector4                                           DistanceStat;                                               // 0x03B0   (0x0010)  
	FVector4                                           DivergenceStat;                                             // 0x03C0   (0x0010)  
	FVector4                                           FilteredDistanceStat;                                       // 0x03D0   (0x0010)  
	FVector4                                           FilteredDivergenceStat;                                     // 0x03E0   (0x0010)  
	int32_t                                            CoverageStats[5];                                           // 0x03F0   (0x0014)  
	int32_t                                            ConnectionStats[13];                                        // 0x0404   (0x0034)  
	float                                              MaxPathLength;                                              // 0x0438   (0x0004)  
	FNavSkeletonBuildSettings                          BuildSettings;                                              // 0x043C   (0x008C)  
	bool                                               bDrawPersistent : 1;                                        // 0x04C8:0 (0x0001)  
	bool                                               bDrawTextInfo : 1;                                          // 0x04C8:1 (0x0001)  
	bool                                               bDrawProtection : 1;                                        // 0x04C8:2 (0x0001)  
	bool                                               bDrawNearestPoint : 1;                                      // 0x04C8:3 (0x0001)  
	bool                                               bDrawPointNeighbours : 1;                                   // 0x04C8:4 (0x0001)  
	bool                                               bDrawFindResultPoints : 1;                                  // 0x04C8:5 (0x0001)  
	bool                                               bDrawOutDoorsPoints : 1;                                    // 0x04C8:6 (0x0001)  
	unsigned char                                      UnknownData03_5[0x7];                                       // 0x04C9   (0x0007)  MISSED
	FNavSkeletonPoint                                  NavSkeletonPoint;                                           // 0x04D0   (0x00A0)  
	FNavSkeletonPoint                                  TargetNavSkeletonPoint;                                     // 0x0570   (0x00A0)  
	TArray<int32_t>                                    FoundPointIDs;                                              // 0x0610   (0x0010)  
	float                                              CostLimit;                                                  // 0x0620   (0x0004)  
	float                                              HalfAngleOfView;                                            // 0x0624   (0x0004)  
	class AActor*                                      TargetDebugActor;                                           // 0x0628   (0x0008)  
	unsigned char                                      UnknownData04_7[0xB0];                                      // 0x0630   (0x00B0)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAINavMeshTestingActor.UpdateDrawing
	// void UpdateDrawing();                                                                                                    // [0xd906a0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAINavRuntimeSystem
/// Size: 0x0368 (872 bytes) (0x000030 - 0x000398) align 8 pad: 0x0000
class UNPCAINavRuntimeSystem : public UNPCAINavSubsystemBase
{ 
public:
	unsigned char                                      UnknownData00_3[0x48];                                      // 0x0030   (0x0048)  MISSED
	SDK_UNDEFINED(80,621) /* TMap<ENPCAIPerceptibleTile, FNavCostDescriptor> */ __um(PerceptibleTileToNavCostDescriptor); // 0x0078   (0x0050)  
	SDK_UNDEFINED(80,622) /* TMap<UObject*, FNavPolyRefArray> */ __um(BurningPolyRefs);                            // 0x00C8   (0x0050)  
	SDK_UNDEFINED(80,623) /* TMap<UObject*, FNavPolyRefArray> */ __um(TearGasPolyRefs);                            // 0x0118   (0x0050)  
	SDK_UNDEFINED(80,624) /* TMap<UObject*, FNavPolyRefArray> */ __um(TripMinePolyRefs);                           // 0x0168   (0x0050)  
	SDK_UNDEFINED(80,625) /* TMap<UObject*, FNavPolyRefArray> */ __um(ClaymorePolyRefs);                           // 0x01B8   (0x0050)  
	SDK_UNDEFINED(80,626) /* TMap<UObject*, FNavPolyRefArray> */ __um(ParadropPolyRefs);                           // 0x0208   (0x0050)  
	SDK_UNDEFINED(80,627) /* TMap<UObject*, ANPCAINavModifierVolume*> */ __um(ObjectToNavModifierVolume);          // 0x0258   (0x0050)  
	SDK_UNDEFINED(80,628) /* TMap<UObject*, FNavCostModifierSharedPointer> */ __um(ObjectToNavCostModifier);       // 0x02A8   (0x0050)  
	SDK_UNDEFINED(80,629) /* TMap<AVolume*, FNavPolyRefArray> */ __um(AvoidPolyRefs);                              // 0x02F8   (0x0050)  
	SDK_UNDEFINED(80,630) /* TMap<int32_t, ENPCAIPerceptibleTile> */ __um(AreaIDToPerceptibleTile);                // 0x0348   (0x0050)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAINavRuntimeSystem.SetupTripMineAreas
	// void SetupTripMineAreas(class UObject* Object, FVector& StartPoint, FVector& EndPoint, bool bEnabled);                   // [0x2dd26c0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavRuntimeSystem.SetupTearGasAreas
	// void SetupTearGasAreas(class UObject* TearGasObject, FVector& CenterPos, FVector& EffectExtent, bool bActiving);         // [0x2dd2540] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavRuntimeSystem.SetupRegionWhereNavLinksNeedDisable
	// bool SetupRegionWhereNavLinksNeedDisable(class AActor* AIPawnOrController, int32_t RegionIndex);                         // [0x2dd2470] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavRuntimeSystem.SetupBurningAreas
	// void SetupBurningAreas(class UObject* Object, TArray<FVector>& Centers, float Radius, bool bEnable);                     // [0x2dd22d0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavRuntimeSystem.SetupAvoidAreas
	// void SetupAvoidAreas(class AAIController* AIController, TArray<AVolume*>& Volumes, bool bAvoid);                         // [0x2dd21a0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavRuntimeSystem.MapAreaIDToPerceptibleTile
	// ENPCAIPerceptibleTile MapAreaIDToPerceptibleTile(int32_t AreaID);                                                        // [0x2dd1440] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAINavRuntimeSystem.IsAreaBombing
	// int32_t IsAreaBombing(FVector& Location, bool bCheckMolotov, bool bCheckTearGas);                                        // [0x2dd1310] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavRuntimeSystem.GetNavRuntimeSystem
	// class UNPCAINavRuntimeSystem* GetNavRuntimeSystem(class UObject* WorldContextObject);                                    // [0x2dd1080] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAINavRuntimeSystem.ArrangeStandPositions
	// TArray<FAICandidateStandPosition> ArrangeStandPositions(class UObject* WorldContextObject, FVector& Location, float MaxRange, float MinGap); // [0x2dd00e0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAINavSkeletonSystem
/// Size: 0x00A8 (168 bytes) (0x000030 - 0x0000D8) align 8 pad: 0x0000
class UNPCAINavSkeletonSystem : public UNPCAINavSubsystemBase
{ 
public:
	unsigned char                                      UnknownData00_1[0xA8];                                      // 0x0030   (0x00A8)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.SetupTryBestToIncludePointIDs
	// FNavSkeletonGraphAStarFilter SetupTryBestToIncludePointIDs(FNavSkeletonGraphAStarFilter& Filter, TArray<int32_t>& PointIDs); // [0x2dd2840] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.QueryVisiblePointIDs
	// TArray<int32_t> QueryVisiblePointIDs(FVector& Location, FVector& Direction, float HalfAngle, float MaxDistance);         // [0x2dd1fc0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.QueryThrowablePointIDs
	// TArray<int32_t> QueryThrowablePointIDs(int32_t TargetPointID);                                                           // [0x2dd1ee0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.QueryProtectablePointIDs
	// TArray<int32_t> QueryProtectablePointIDs(FVector& Location, float MaxPathLength, int32_t KeepTopK);                      // [0x2dd1d60] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.QueryPointIDs
	// TArray<int32_t> QueryPointIDs(FVector& Location, float QueryLength);                                                     // [0x2dd1c40] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.QueryOutdoorsPointIDs
	// TArray<int32_t> QueryOutdoorsPointIDs(FVector& Location, FVector& Extent);                                               // [0x2dd1b00] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.QueryNearestPointIDs
	// TArray<int32_t> QueryNearestPointIDs(FVector& Location, float MaxPathLength);                                            // [0x2dd19e0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.QueryNearestPointID
	// int32_t QueryNearestPointID(FVector& Location, float MaxPathLength);                                                     // [0x2dd1900] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.QueryNearestDoorPointID
	// int32_t QueryNearestDoorPointID(FVector& Location, float MaxPathLength);                                                 // [0x2dd1820] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.QueryBranchyPointIDs
	// TArray<int32_t> QueryBranchyPointIDs(FVector& Location, float MaxPathLength, int32_t KeepTopK);                          // [0x2dd16a0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.OptimizePathResult
	// FNavSkeletonGraphFindResult OptimizePathResult(FNavSkeletonGraphFindResult& PathResult);                                 // [0x2dd1570] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.GetPointData
	// FNavSkeletonPoint GetPointData(int32_t PointID);                                                                         // [0x2dd11a0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.GetNavSkeletonSystem
	// class UNPCAINavSkeletonSystem* GetNavSkeletonSystem(class UObject* WorldContextObject);                                  // [0x2dd1110] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.GetFindPathStatus
	// EGraphAStarResult GetFindPathStatus(class UObject* Querier);                                                             // [0x2dd0fe0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.FloodFromPointID
	// TArray<int32_t> FloodFromPointID(int32_t PointID, FNavSkeletonGraphAStarFilter& Filter);                                 // [0x2dd0e50] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.FindStepBackPointIDs
	// FNavSkeletonGraphFindResult FindStepBackPointIDs(int32_t PointID, TArray<int32_t>& CandidatePointIDs, FNavSkeletonGraphAStarFilter& Filter); // [0x2dd0c60] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.FindPathAsync
	// bool FindPathAsync(int32_t StartPointID, int32_t EndPointID, FNavSkeletonGraphAStarFilter& Filter, FGraphAStarPolicy& Policy, FDelegateProperty Callback, class UObject* Caller); // [0x2dd09c0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.FindPath
	// FNavSkeletonGraphFindResult FindPath(int32_t StartPointID, int32_t EndPointID, FNavSkeletonGraphAStarFilter& Filter, class UObject* Caller); // [0x2dd07b0] Final|Native|Public|HasOutParms|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.FindOutsidePointIDs
	// FNavSkeletonGraphFindResult FindOutsidePointIDs(int32_t PointID, FNavSkeletonGraphAStarFilter& Filter);                  // [0x2dd0620] Final|Native|Public|HasOutParms|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.ClearUnreachablePointIDs
	// FNavSkeletonGraphAStarFilter ClearUnreachablePointIDs(FNavSkeletonGraphAStarFilter& Filter);                             // [0x2dd04d0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.CalculatePathLengthToEachPoint
	// TArray<FNavSkeletonGraphResultNode> CalculatePathLengthToEachPoint(TArray<int32_t>& PointIDs, FVector& Location, float MaxPathLength); // [0x2dd0320] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.BuildSkeleton
	// void BuildSkeleton(class UObject* WorldContextObject);                                                                   // [0x2dd02a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.AddUnreachablePointIDs
	// FNavSkeletonGraphAStarFilter AddUnreachablePointIDs(FNavSkeletonGraphAStarFilter& Filter, TArray<int32_t>& PointIDs);    // [0x2dcff30] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.AddUnreachablePointID
	// FNavSkeletonGraphAStarFilter AddUnreachablePointID(FNavSkeletonGraphAStarFilter& Filter, int32_t PointID);               // [0x2dcfda0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavSkeletonSystem.AbortFindPathRequest
	// bool AbortFindPathRequest(class UObject* Querier);                                                                       // [0x2dcfd00] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAINavSteepZoneSystem
/// Size: 0x0000 (0 bytes) (0x000030 - 0x000030) align 8 pad: 0x0000
class UNPCAINavSteepZoneSystem : public UNPCAINavSubsystemBase
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAINavSteepZoneSystem.RunDeleter
	// void RunDeleter(FSteepZoneDeleteSettings& Settings);                                                                     // [0x2dd7460] Final|Native|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NavArea_Burning
/// Size: 0x0000 (0 bytes) (0x000048 - 0x000048) align 8 pad: 0x0000
class UNavArea_Burning : public UNavArea
{ 
public:
};

/// Class /Script/MFNPCAI.NavArea_TearGas
/// Size: 0x0000 (0 bytes) (0x000048 - 0x000048) align 8 pad: 0x0000
class UNavArea_TearGas : public UNavArea
{ 
public:
};

/// Class /Script/MFNPCAI.NavArea_TripMine
/// Size: 0x0000 (0 bytes) (0x000048 - 0x000048) align 8 pad: 0x0000
class UNavArea_TripMine : public UNavArea
{ 
public:
};

/// Class /Script/MFNPCAI.NavArea_Claymore
/// Size: 0x0000 (0 bytes) (0x000048 - 0x000048) align 8 pad: 0x0000
class UNavArea_Claymore : public UNavArea
{ 
public:
};

/// Class /Script/MFNPCAI.NavArea_Paradrop
/// Size: 0x0000 (0 bytes) (0x000048 - 0x000048) align 8 pad: 0x0000
class UNavArea_Paradrop : public UNavArea
{ 
public:
};

/// Class /Script/MFNPCAI.NavArea_Avoid
/// Size: 0x0000 (0 bytes) (0x000048 - 0x000048) align 8 pad: 0x0000
class UNavArea_Avoid : public UNavArea
{ 
public:
};

/// Class /Script/MFNPCAI.NavArea_Color0
/// Size: 0x0000 (0 bytes) (0x000048 - 0x000048) align 8 pad: 0x0000
class UNavArea_Color0 : public UNavArea
{ 
public:
};

/// Class /Script/MFNPCAI.NavArea_Color1
/// Size: 0x0000 (0 bytes) (0x000048 - 0x000048) align 8 pad: 0x0000
class UNavArea_Color1 : public UNavArea
{ 
public:
};

/// Class /Script/MFNPCAI.NavArea_Color2
/// Size: 0x0000 (0 bytes) (0x000048 - 0x000048) align 8 pad: 0x0000
class UNavArea_Color2 : public UNavArea
{ 
public:
};

/// Class /Script/MFNPCAI.NavArea_Color3
/// Size: 0x0000 (0 bytes) (0x000048 - 0x000048) align 8 pad: 0x0000
class UNavArea_Color3 : public UNavArea
{ 
public:
};

/// Class /Script/MFNPCAI.NavArea_Color4
/// Size: 0x0000 (0 bytes) (0x000048 - 0x000048) align 8 pad: 0x0000
class UNavArea_Color4 : public UNavArea
{ 
public:
};

/// Class /Script/MFNPCAI.NavArea_Color5
/// Size: 0x0000 (0 bytes) (0x000048 - 0x000048) align 8 pad: 0x0000
class UNavArea_Color5 : public UNavArea
{ 
public:
};

/// Class /Script/MFNPCAI.NavArea_Color6
/// Size: 0x0000 (0 bytes) (0x000048 - 0x000048) align 8 pad: 0x0000
class UNavArea_Color6 : public UNavArea
{ 
public:
};

/// Class /Script/MFNPCAI.NavPathPointActor
/// Size: 0x0030 (48 bytes) (0x0002E0 - 0x000310) align 8 pad: 0x0000
class ANavPathPointActor : public ANote
{ 
public:
	int32_t                                            NodeIndex;                                                  // 0x02E0   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x02E4   (0x0004)  MISSED
	uint64_t                                           NodeRef;                                                    // 0x02E8   (0x0008)  
	FVector                                            NodeLocation;                                               // 0x02F0   (0x000C)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x02FC   (0x0004)  MISSED
	TArray<class ANavPathPointActor*>                  NextPathPointArray;                                         // 0x0300   (0x0010)  
};

/// Class /Script/MFNPCAI.NPCAINavUtilitySystem
/// Size: 0x0010 (16 bytes) (0x000030 - 0x000040) align 8 pad: 0x0000
class UNPCAINavUtilitySystem : public UNPCAINavSubsystemBase
{ 
public:
	class ANPCAINavMeshManager*                        CachedNavMeshManager;                                       // 0x0030   (0x0008)  
	class UCoverSystem*                                CachedCoverSystem;                                          // 0x0038   (0x0008)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAINavUtilitySystem.ValidateTacticPointLocations
	// void ValidateTacticPointLocations(class UObject* WorldContextObject);                                                    // [0x2dd7500] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavUtilitySystem.NavigationRaycast
	// bool NavigationRaycast(class UObject* WorldContextObject, FVector& RayStart, FVector& RayEnd, FVector& HitLocation, FVector& OriginalHitLocation, bool& bIsRaycastEndInCorridor); // [0x2dd7220] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavUtilitySystem.IsDefaultNavArea
	// bool IsDefaultNavArea(class UObject* WorldContextObject, FVector Location, bool& bOnNavMesh, ENPCAIPerceptibleTile& NavMeshType); // [0x2dd6f40] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavUtilitySystem.GetNavUtilitySystem
	// class UNPCAINavUtilitySystem* GetNavUtilitySystem(class UObject* WorldContextObject);                                    // [0x2dd6eb0] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAINavUtilitySystem.FindDistanceToWall
	// bool FindDistanceToWall(class UObject* WorldContextObject, FVector& Location, float SearchRadius, FVector& OutClosestPointOnWall, float& OutDistanceToWall); // [0x2dd6c10] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavUtilitySystem.DoesPathExist
	// bool DoesPathExist(class UObject* WorldContextObject, FVector& Start, FVector& End, float CostLimit, EPathExistenceTestMode TestMode); // [0x2dd6a40] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAINavUtilitySystem.CalculatePathLengthToEachCoverPoint
	// TArray<FCoverPointPathLengthResult> CalculatePathLengthToEachCoverPoint(class UObject* WorldContextObject, FVector& Location, float MaxPathLength); // [0x2dd68f0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIPathFollowingComponent
/// Size: 0x0018 (24 bytes) (0x000298 - 0x0002B0) align 8 pad: 0x0000
class UNPCAIPathFollowingComponent : public UPathFollowingComponent
{ 
public:
	unsigned char                                      UnknownData00_1[0x18];                                      // 0x0298   (0x0018)  MISSED
};

/// Class /Script/MFNPCAI.NPCAIPeekPointAsyncTask
/// Size: 0x0050 (80 bytes) (0x000040 - 0x000090) align 8 pad: 0x0000
class UNPCAIPeekPointAsyncTask : public UNPCAIAsyncTaskBase
{ 
public:
	SDK_UNDEFINED(16,631) /* FMulticastInlineDelegate */ __um(OnSuccess);                                          // 0x0040   (0x0010)  
	SDK_UNDEFINED(16,632) /* FMulticastInlineDelegate */ __um(OnFail);                                             // 0x0050   (0x0010)  
	FVector                                            TargetPoint;                                                // 0x0060   (0x000C)  
	FVector                                            DangerPoint;                                                // 0x006C   (0x000C)  
	float                                              PeekLength;                                                 // 0x0078   (0x0004)  
	FVector                                            PeekPoint;                                                  // 0x007C   (0x000C)  
	bool                                               bWillExpose;                                                // 0x0088   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0089   (0x0007)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPeekPointAsyncTask.GetNavPath
	// void GetNavPath(TArray<FVector>& OutPath, int32_t& StartIndex);                                                          // [0x2ddbe80] Final|Native|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCAIPeekPointAsyncTask.ExecuteTask
	// void ExecuteTask();                                                                                                      // [0x198b080] Native|Public        
	// Function /Script/MFNPCAI.NPCAIPeekPointAsyncTask.AIPeekPoint
	// class UNPCAIPeekPointAsyncTask* AIPeekPoint(class AActor* Pawn, FVector& TargetPoint, FVector& DangerPoint, float PeekLength); // [0x2ddb600] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
};

/// Struct /Script/MFNPCAI.AIGrassMapInfo
/// Size: 0x0088 (136 bytes) (0x000000 - 0x000088) align 8 pad: 0x0000
struct FAIGrassMapInfo
{ 
	FString                                            MapName;                                                    // 0x0000   (0x0010)  
	float                                              MapTopX;                                                    // 0x0010   (0x0004)  
	float                                              MapTopY;                                                    // 0x0014   (0x0004)  
	float                                              MapSizeX;                                                   // 0x0018   (0x0004)  
	float                                              MapSizeY;                                                   // 0x001C   (0x0004)  
	int32_t                                            MapLandscapeGrassCellCountX;                                // 0x0020   (0x0004)  
	int32_t                                            MapLandscapeGrassCellCountY;                                // 0x0024   (0x0004)  
	float                                              LandscapeGrassCellSize;                                     // 0x0028   (0x0004)  
	int32_t                                            MinLandscapeGrassCountInCell;                               // 0x002C   (0x0004)  
	float                                              MinCellCoverPercent;                                        // 0x0030   (0x0004)  
	float                                              MinLandscapeGrassHeight;                                    // 0x0034   (0x0004)  
	float                                              LandscapeGrassZGapLimit;                                    // 0x0038   (0x0004)  
	float                                              MinGrassHeight;                                             // 0x003C   (0x0004)  
	float                                              AverageDensityLimit;                                        // 0x0040   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0044   (0x0004)  MISSED
	FString                                            IgnoreFoliageTags;                                          // 0x0048   (0x0010)  
	bool                                               bIsGenerateMeshGrass;                                       // 0x0058   (0x0001)  
	unsigned char                                      UnknownData01_6[0x7];                                       // 0x0059   (0x0007)  MISSED
	FString                                            MeshGrassTags;                                              // 0x0060   (0x0010)  
	FString                                            SaveLevelName;                                              // 0x0070   (0x0010)  
	bool                                               bShouldSkipMainLevel;                                       // 0x0080   (0x0001)  
	unsigned char                                      UnknownData02_7[0x7];                                       // 0x0081   (0x0007)  MISSED
};

/// Struct /Script/MFNPCAI.AIFoliageGrassBlock
/// Size: 0x003C (60 bytes) (0x000000 - 0x00003C) align 4 pad: 0x0000
struct FAIFoliageGrassBlock
{ 
	int32_t                                            Index;                                                      // 0x0000   (0x0004)  
	FBox                                               Bounds;                                                     // 0x0004   (0x001C)  
	FVector                                            Location;                                                   // 0x0020   (0x000C)  
	float                                              RotatonYaw;                                                 // 0x002C   (0x0004)  
	char                                               Density;                                                    // 0x0030   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0031   (0x0003)  MISSED
	float                                              ScaleValue;                                                 // 0x0034   (0x0004)  
	bool                                               bSlowDownCharacter;                                         // 0x0038   (0x0001)  
	unsigned char                                      UnknownData01_7[0x3];                                       // 0x0039   (0x0003)  MISSED
};

/// Struct /Script/MFNPCAI.AILandscapeGrassBlock
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 4 pad: 0x0000
struct FAILandscapeGrassBlock
{ 
	FBox                                               Bounds;                                                     // 0x0000   (0x001C)  
	FVector                                            Location;                                                   // 0x001C   (0x000C)  
};

/// Struct /Script/MFNPCAI.AIGrassBox
/// Size: 0x001C (28 bytes) (0x000000 - 0x00001C) align 4 pad: 0x0000
struct FAIGrassBox
{ 
	FVector                                            Center;                                                     // 0x0000   (0x000C)  
	FVector                                            Extent;                                                     // 0x000C   (0x000C)  
	float                                              Density;                                                    // 0x0018   (0x0004)  
};

/// Struct /Script/MFNPCAI.AIGrassCylinder
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 8 pad: 0x0000
struct FAIGrassCylinder
{ 
	float                                              ZCenter;                                                    // 0x0000   (0x0004)  
	float                                              HalfHeight;                                                 // 0x0004   (0x0004)  
	float                                              Radius;                                                     // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	TArray<char>                                       PartsDensities;                                             // 0x0010   (0x0010)  
};

/// Struct /Script/MFNPCAI.AIGrassBlock
/// Size: 0x0050 (80 bytes) (0x000028 - 0x000078) align 8 pad: 0x0000
struct FAIGrassBlock : FAILandscapeGrassBlock
{ 
	FName                                              AIGrassName;                                                // 0x0028   (0x0008)  
	char                                               Density;                                                    // 0x0030   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0031   (0x0007)  MISSED
	TArray<FAIGrassBox>                                GrassBoxList;                                               // 0x0038   (0x0010)  
	TArray<FAIGrassCylinder>                           GrassCylinderList;                                          // 0x0048   (0x0010)  
	bool                                               bSlowDownCharacter;                                         // 0x0058   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0059   (0x0003)  MISSED
	FBox                                               SlowDownBounds;                                             // 0x005C   (0x001C)  
};

/// Class /Script/MFNPCAI.NPCAIPerceptionAssistActor
/// Size: 0x00D8 (216 bytes) (0x0002E0 - 0x0003B8) align 8 pad: 0x0000
class ANPCAIPerceptionAssistActor : public AActor
{ 
public:
	FAIGrassMapInfo                                    MapInfo;                                                    // 0x02E0   (0x0088)  
	TArray<FAIFoliageGrassBlock>                       FoliageGrassBlockList;                                      // 0x0368   (0x0010)  
	TArray<FAILandscapeGrassBlock>                     LandscapeGrassBlockList;                                    // 0x0378   (0x0010)  
	TArray<FAIGrassBlock>                              GrassBlockAssets;                                           // 0x0388   (0x0010)  
	bool                                               bIsDebugAIGrass;                                            // 0x0398   (0x0001)  
	EnumAIGrassDebugBox                                DebugAIGrassBox;                                            // 0x0399   (0x0001)  
	unsigned char                                      UnknownData00_6[0x16];                                      // 0x039A   (0x0016)  MISSED
	float                                              SlowdownEdgePercent;                                        // 0x03B0   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x03B4   (0x0004)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPerceptionAssistActor.DebugShowAIGrassCluster
	// void DebugShowAIGrassCluster(EnumAIGrassDebugBox Type);                                                                  // [0x2ddb890] Final|Native|Public|BlueprintCallable 
};

/// Struct /Script/MFNPCAI.AIGrassOctreeElement
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 8 pad: 0x0000
struct FAIGrassOctreeElement
{ 
	unsigned char                                      UnknownData00_2[0x30];                                      // 0x0000   (0x0030)  MISSED
};

/// Class /Script/MFNPCAI.NPCAIPerceptionComponent
/// Size: 0x00F8 (248 bytes) (0x0001D8 - 0x0002D0) align 8 pad: 0x0000
class UNPCAIPerceptionComponent : public UAIPerceptionComponent
{ 
public:
	bool                                               EnabledRecedeSightWhileRotate;                              // 0x01D8   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x01D9   (0x0003)  MISSED
	float                                              RateDrawLine;                                               // 0x01DC   (0x0004)  
	bool                                               bIsDebugSightRadius;                                        // 0x01E0   (0x0001)  
	bool                                               bIsLogShootPart;                                            // 0x01E1   (0x0001)  
	bool                                               bIsDebugFogRange;                                           // 0x01E2   (0x0001)  
	bool                                               bEnabledDebugCanSeePoint;                                   // 0x01E3   (0x0001)  
	float                                              LastTimeCheckFlashBlocks;                                   // 0x01E4   (0x0004)  
	FVector                                            FlashLightPos;                                              // 0x01E8   (0x000C)  
	float                                              CheckAutoLeanInterval;                                      // 0x01F4   (0x0004)  
	float                                              SightAngleScaleValue;                                       // 0x01F8   (0x0004)  
	float                                              SightRadiusScaleValue;                                      // 0x01FC   (0x0004)  
	float                                              HearRadiusScaleValue;                                       // 0x0200   (0x0004)  
	unsigned char                                      UnknownData01_6[0xC];                                       // 0x0204   (0x000C)  MISSED
	class ACharacter*                                  AIOwnerPawn;                                                // 0x0210   (0x0008)  
	ENPCAISenseChannel                                 WeaponChannel;                                              // 0x0218   (0x0001)  
	ENPCAISenseChannel                                 AISightChannel;                                             // 0x0219   (0x0001)  
	unsigned char                                      UnknownData02_6[0x6];                                       // 0x021A   (0x0006)  MISSED
	class ANPCAIPerceptionAssistActor*                 PerceptionAssistActor;                                      // 0x0220   (0x0008)  
	class ANPCAIPerceptionDynamicActor*                PerceptionDynamicActor;                                     // 0x0228   (0x0008)  
	class UNPCAIMoverSystemComponent*                  OwnerMoverComponent;                                        // 0x0230   (0x0008)  
	class UNPCAIMemorySystemComponent*                 OwnerMemoryComponent;                                       // 0x0238   (0x0008)  
	class UNPCAIMultiTargetSystemComponent*            OwnerMultiTargetComponent;                                  // 0x0240   (0x0008)  
	class UNPCAIPropertyComponent_Shoot*               ShootProps;                                                 // 0x0248   (0x0008)  
	class UNPCAIPropertyComponent_Look*                LookProps;                                                  // 0x0250   (0x0008)  
	class UActorComponent*                             AIFireComponent;                                            // 0x0258   (0x0008)  
	class UActorComponent*                             AIStaticsComponent;                                         // 0x0260   (0x0008)  
	class UActorComponent*                             AIPoseComponent;                                            // 0x0268   (0x0008)  
	class UActorComponent*                             IKComponent;                                                // 0x0270   (0x0008)  
	class UActorComponent*                             AISenseAbilityComponent;                                    // 0x0278   (0x0008)  
	class UNPCAIGlobalSharedInfo*                      AISharedInfo;                                               // 0x0280   (0x0008)  
	class UActorComponent*                             AITurnComponent;                                            // 0x0288   (0x0008)  
	float                                              NextCheckLeanCanShootTime;                                  // 0x0290   (0x0004)  
	float                                              SelfIKFootOffsets;                                          // 0x0294   (0x0004)  
	float                                              TargetIKFootOffsets;                                        // 0x0298   (0x0004)  
	float                                              TurnSightWeakenScale;                                       // 0x029C   (0x0004)  
	float                                              LastTimeRecoverSight;                                       // 0x02A0   (0x0004)  
	EAILeanType                                        AutoLeanType;                                               // 0x02A4   (0x0001)  
	EAIPose                                            AIPoseType;                                                 // 0x02A5   (0x0001)  
	EAIPose                                            TargetPoseType;                                             // 0x02A6   (0x0001)  
	EAILeanType                                        AILeanType;                                                 // 0x02A7   (0x0001)  
	bool                                               bInitAIGrassElements;                                       // 0x02A8   (0x0001)  
	unsigned char                                      UnknownData03_6[0x7];                                       // 0x02A9   (0x0007)  MISSED
	TArray<FAIGrassOctreeElement>                      AIGrassElements;                                            // 0x02B0   (0x0010)  
	unsigned char                                      UnknownData04_7[0x10];                                      // 0x02C0   (0x0010)  MISSED
};

/// Struct /Script/MFNPCAI.AIBlockArea
/// Size: 0x0060 (96 bytes) (0x000000 - 0x000060) align 4 pad: 0x0000
struct FAIBlockArea
{ 
	ENPCAIPerceptibleTile                              TileType;                                                   // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	FBox                                               BlockBox;                                                   // 0x0004   (0x001C)  
	FBox                                               EffectiveBox;                                               // 0x0020   (0x001C)  
	FVector                                            Center;                                                     // 0x003C   (0x000C)  
	float                                              Radius;                                                     // 0x0048   (0x0004)  
	float                                              Heigh;                                                      // 0x004C   (0x0004)  
	float                                              StartTime;                                                  // 0x0050   (0x0004)  
	float                                              EndTime;                                                    // 0x0054   (0x0004)  
	float                                              BlockStartTime;                                             // 0x0058   (0x0004)  
	float                                              BlockEndTime;                                               // 0x005C   (0x0004)  
};

/// Struct /Script/MFNPCAI.AISenseFlashBlock
/// Size: 0x0044 (68 bytes) (0x000000 - 0x000044) align 4 pad: 0x0000
struct FAISenseFlashBlock
{ 
	unsigned char                                      UnknownData00_7[0x8];                                       // 0x0000   (0x0008)  MISSED
	FVector                                            StartPos;                                                   // 0x0008   (0x000C)  
	FVector                                            Dir;                                                        // 0x0014   (0x000C)  
	float                                              FarDim;                                                     // 0x0020   (0x0004)  
	float                                              NearDim;                                                    // 0x0024   (0x0004)  
	float                                              ZoneAngle;                                                  // 0x0028   (0x0004)  
	float                                              FaceAngle;                                                  // 0x002C   (0x0004)  
	float                                              SevereDebuffDistance;                                       // 0x0030   (0x0004)  
	float                                              ModerateDebuffDistance;                                     // 0x0034   (0x0004)  
	float                                              MildDebuffDistance;                                         // 0x0038   (0x0004)  
	float                                              Height;                                                     // 0x003C   (0x0004)  
	float                                              MaxHeight;                                                  // 0x0040   (0x0004)  
};

/// Class /Script/MFNPCAI.NPCAIPerceptionDynamicActor
/// Size: 0x0030 (48 bytes) (0x0002E0 - 0x000310) align 8 pad: 0x0000
class ANPCAIPerceptionDynamicActor : public AActor
{ 
public:
	TArray<FAIBlockArea>                               DynamicAreaList;                                            // 0x02E0   (0x0010)  
	TArray<FAISenseFlashBlock>                         SenseFlashBlockList;                                        // 0x02F0   (0x0010)  
	bool                                               bDebugBlock;                                                // 0x0300   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0301   (0x0003)  MISSED
	int32_t                                            IndexOfUpdateFlashBlock;                                    // 0x0304   (0x0004)  
	int32_t                                            IndexOfCheckEnemyFlashBlock;                                // 0x0308   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x030C   (0x0004)  MISSED
};

/// Class /Script/MFNPCAI.NPCAIPerceptionSystem
/// Size: 0x0000 (0 bytes) (0x000130 - 0x000130) align 8 pad: 0x0000
class UNPCAIPerceptionSystem : public UAIPerceptionSystem
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPerceptionSystem.OnSourceActorEndPlay
	// void OnSourceActorEndPlay(class AActor* InActor, TEnumAsByte<EEndPlayReason> InEndPlayReason);                           // [0x2ddcc50] Native|Public        
	// Function /Script/MFNPCAI.NPCAIPerceptionSystem.ModifySenseRangeInRuntime
	// bool ModifySenseRangeInRuntime(class AActor* InAIController, float InCatchRadiusScale, float InLossRadiusScale, EAISenseType InSenseType); // [0x2ddcaf0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIProfile
/// Size: 0x0010 (16 bytes) (0x000028 - 0x000038) align 8 pad: 0x0000
class UNPCAIProfile : public UObject
{ 
public:
	class UClass*                                      FactionClass;                                               // 0x0028   (0x0008)  
	class UClass*                                      RoleClass;                                                  // 0x0030   (0x0008)  
};

/// Class /Script/MFNPCAI.NPCAIPropertyProfile
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyProfile : public UNPCAIPropertyProfileBase
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent : public UNPCAIProfileBaseComponent
{ 
public:
};

/// Struct /Script/MFNPCAI.AIBodyPartAimingChoice
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 4 pad: 0x0000
struct FAIBodyPartAimingChoice
{ 
	EAIBodyPartType                                    BodyPart;                                                   // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	float                                              Weight;                                                     // 0x0004   (0x0004)  
};

/// Struct /Script/MFNPCAI.AIBodyBulkAimingChoice
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FAIBodyBulkAimingChoice
{ 
	EAIBodyBulkType                                    BodyBulk;                                                   // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	float                                              Weight;                                                     // 0x0004   (0x0004)  
	TArray<FAIBodyPartAimingChoice>                    BodyParts;                                                  // 0x0008   (0x0010)  
};

/// Class /Script/MFNPCAI.AIPropertyAimingProfile
/// Size: 0x0148 (328 bytes) (0x000038 - 0x000180) align 8 pad: 0x0000
class UAIPropertyAimingProfile : public UNPCAIPropertyProfile
{ 
public:
	float                                              UA_QUICK_AIM_OFFSET_DIS_RATE;                               // 0x0038   (0x0004)  
	float                                              UA_QUICK_AIM_UNDER_SEEN_TIME;                               // 0x003C   (0x0004)  
	float                                              UA_QUICK_AIM_TIME_CALC_COEF;                                // 0x0040   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0044   (0x0004)  MISSED
	class UCurveFloat*                                 UA_AIM_TIME_TO_DIST_MULTIPLIER_CURVE;                       // 0x0048   (0x0008)  
	class UCurveFloat*                                 UA_SCATTERING_DIST_CURVE;                                   // 0x0050   (0x0008)  
	class UCurveFloat*                                 UA_FAKE_RANDOM_HIT_RATE_CURVE;                              // 0x0058   (0x0008)  
	TArray<float>                                      UA_SHOOT_HIT_RATES;                                         // 0x0060   (0x0010)  
	TArray<float>                                      UA_SHOOT_HIT_RATES_AI;                                      // 0x0070   (0x0010)  
	class UCurveFloat*                                 UA_SHOOT_HIT_RATE_DISTANCE_TO_PLAYER_CURVE;                 // 0x0080   (0x0008)  
	class UCurveFloat*                                 UA_SHOOT_HIT_RATE_DISTANCE_TO_AI_CURVE;                     // 0x0088   (0x0008)  
	class UCurveFloat*                                 UA_SHOOT_HIT_RATE_DISTANCE_NOT_ADS;                         // 0x0090   (0x0008)  
	float                                              UA_ADD_AIMING_TICK_WHEN_ANGLE_SMALLER_THAN;                 // 0x0098   (0x0004)  
	float                                              UA_ADD_AIMING_TICK_WHEN_ANGLE_SMALLER_THAN_COS;             // 0x009C   (0x0004)  
	bool                                               IS_USE_PREDESTINED_FAKE_RANDOM;                             // 0x00A0   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x00A1   (0x0003)  MISSED
	float                                              UA_SHOOT_HIT_RATE_IF_AIMOVE;                                // 0x00A4   (0x0004)  
	float                                              UA_SHOOT_HIT_RATE_IF_ENEMY_MOVE_SPEED;                      // 0x00A8   (0x0004)  
	float                                              UA_SHOOT_HIT_RATE_IF_ENEMY_MOVE;                            // 0x00AC   (0x0004)  
	float                                              UA_SHOOT_HIT_RATE_IF_ARM_BROKEN;                            // 0x00B0   (0x0004)  
	float                                              UA_SHOOT_HIT_RATE_IF_INCOVER_SAFE;                          // 0x00B4   (0x0004)  
	float                                              UA_SHOOT_HIT_RATE_IF_BE_HITED;                              // 0x00B8   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x00BC   (0x0004)  MISSED
	class UCurveFloat*                                 UA_SHOOT_HIT_RATE_IF_BATTLE_DURATION_CURVE;                 // 0x00C0   (0x0008)  
	class UCurveFloat*                                 UA_SHOOT_HIT_RATE_IF_WEAPON_ADSMOA_BIAS_CURVE;              // 0x00C8   (0x0008)  
	float                                              UA_SHOOT_HIT_RATE_IF_SHOOT_HEAD;                            // 0x00D0   (0x0004)  
	float                                              UA_SHOOT_HIT_RATE_IF_UNDER_FLASH_LIGHT;                     // 0x00D4   (0x0004)  
	float                                              UA_SHOOT_HEAD_FACE_RATE_IF_USE_PREDESTINED;                 // 0x00D8   (0x0004)  
	float                                              UA_SHOOT_HIT_LIMITED_TIME;                                  // 0x00DC   (0x0004)  
	float                                              UA_MIN_AIM_TIME;                                            // 0x00E0   (0x0004)  
	float                                              MAX_AIM_TIME;                                               // 0x00E4   (0x0004)  
	float                                              UA_SPREAD_OFFSET_XY_CLAMP;                                  // 0x00E8   (0x0004)  
	float                                              UA_SPREAD_OFFSET_MIN_Z_CLAMP;                               // 0x00EC   (0x0004)  
	float                                              UA_SPREAD_OFFSET_MAX_Z_CLAMP;                               // 0x00F0   (0x0004)  
	unsigned char                                      UnknownData03_6[0x4];                                       // 0x00F4   (0x0004)  MISSED
	TArray<FAIBodyBulkAimingChoice>                    AIMING_BULK_FOR_PLAYER;                                     // 0x00F8   (0x0010)  
	TArray<FAIBodyBulkAimingChoice>                    AIMING_BULK_FOR_AI;                                         // 0x0108   (0x0010)  
	bool                                               IS_FILTER_NOT_SEEN_PART_TO_AIMING;                          // 0x0118   (0x0001)  
	EAIAimingBodyPartTrend                             AIMING_BODYPART_TREND;                                      // 0x0119   (0x0001)  
	unsigned char                                      UnknownData04_6[0x2];                                       // 0x011A   (0x0002)  MISSED
	float                                              SHOOT_TO_CHANGE_RND_PART_DELTA;                             // 0x011C   (0x0004)  
	float                                              ANY_PART_SHOOT_TIME;                                        // 0x0120   (0x0004)  
	float                                              MAX_AIM_PRECICING;                                          // 0x0124   (0x0004)  
	float                                              BETTER_PRECICING_COEF;                                      // 0x0128   (0x0004)  
	float                                              RECLC_Z_DIST;                                               // 0x012C   (0x0004)  
	float                                              RECALC_DIST;                                                // 0x0130   (0x0004)  
	float                                              RECALC_SQR_DIST;                                            // 0x0134   (0x0004)  
	float                                              COEF_FROM_COVER;                                            // 0x0138   (0x0004)  
	int32_t                                            RECALC_MUST_TIME_MIN;                                       // 0x013C   (0x0004)  
	int32_t                                            RECALC_MUST_TIME_MAX;                                       // 0x0140   (0x0004)  
	float                                              MAX_AIMING_UPGRADE_BY_TIME;                                 // 0x0144   (0x0004)  
	float                                              DAMAGE_TO_DISCARD_AIM_0;                                    // 0x0148   (0x0004)  
	float                                              MIN_TIME_DISCARD_AIM_SEC;                                   // 0x014C   (0x0004)  
	float                                              MAX_TIME_DISCARD_AIM_SEC;                                   // 0x0150   (0x0004)  
	float                                              XZ_COEF;                                                    // 0x0154   (0x0004)  
	float                                              BOTTOM_COEF;                                                // 0x0158   (0x0004)  
	float                                              FIRST_CONTACT_ADD_SEC;                                      // 0x015C   (0x0004)  
	float                                              FIRST_CONTACT_ADD_CHANCE;                                   // 0x0160   (0x0004)  
	float                                              DIST_TO_SHOOT_NO_OFFSET;                                    // 0x0164   (0x0004)  
	float                                              COEF_IF_MOVE;                                               // 0x0168   (0x0004)  
	float                                              TIME_COEF_IF_MOVE;                                          // 0x016C   (0x0004)  
	float                                              NEXT_SHOT_MISS_Y_OFFSET;                                    // 0x0170   (0x0004)  
	float                                              Y_TOP_OFFSET_COEF;                                          // 0x0174   (0x0004)  
	float                                              Y_BOTTOM_OFFSET_COEF;                                       // 0x0178   (0x0004)  
	EAimingType                                        AimingType;                                                 // 0x017C   (0x0001)  
	unsigned char                                      UnknownData05_7[0x3];                                       // 0x017D   (0x0003)  MISSED
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_Aiming
/// Size: 0x0010 (16 bytes) (0x000038 - 0x000048) align 8 pad: 0x0000
class UNPCAIPropertyComponent_Aiming : public UNPCAIPropertyComponent
{ 
public:
	unsigned char                                      UnknownData00_1[0x10];                                      // 0x0038   (0x0010)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.SetMaxAimTime
	// float SetMaxAimTime(float Value);                                                                                        // [0x2ddcfa0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.SetAimingBodyPartWeightInRuntime
	// void SetAimingBodyPartWeightInRuntime(EAIBodyPartType InBodyPart, float InWeight, bool bIsForPlayer);                    // [0x2ddce80] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.SetAimingBodyPartTrend
	// EAIAimingBodyPartTrend SetAimingBodyPartTrend(EAIAimingBodyPartTrend AimingTrend);                                       // [0x2ddcdf0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.RemoveAimingTypeInRuntime
	// void RemoveAimingTypeInRuntime(EAIBodyBulkType InBulkType, bool bIsForPlayer);                                           // [0x2ddcd20] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.IsUsePerdestinedFakeRandom
	// bool IsUsePerdestinedFakeRandom();                                                                                       // [0x2ddcac0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.IsAimingChoicesContains
	// bool IsAimingChoicesContains(EAIBodyPartType InBodyPartType, bool bIsForPlayer);                                         // [0x2ddc9f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetYTopOffsetCoef
	// float GetYTopOffsetCoef();                                                                                               // [0x2ddc9c0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetYBottomOffsetCoef
	// float GetYBottomOffsetCoef();                                                                                            // [0x2ddc990] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetXzCoef
	// float GetXzCoef();                                                                                                       // [0x2ddc960] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUaSpreadOffsetXYClamp
	// float GetUaSpreadOffsetXYClamp();                                                                                        // [0x2ddc930] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUaSpreadOffsetMinZClamp
	// float GetUaSpreadOffsetMinZClamp();                                                                                      // [0x2ddc900] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUaSpreadOffsetMaxZClamp
	// float GetUaSpreadOffsetMaxZClamp();                                                                                      // [0x2ddc8d0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUaShootHitRatesAI
	// TArray<float> GetUaShootHitRatesAI();                                                                                    // [0x2ddc890] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUaShootHitRates
	// TArray<float> GetUaShootHitRates();                                                                                      // [0x2ddc850] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUAShootHitRateIfWeaponAdsMoaBias
	// float GetUAShootHitRateIfWeaponAdsMoaBias(float AdsMoaBias);                                                             // [0x2ddc580] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUAShootHitRateIfUnderFlashLight
	// float GetUAShootHitRateIfUnderFlashLight();                                                                              // [0x2ddc550] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUAShootHitRateIfShootHead
	// float GetUAShootHitRateIfShootHead();                                                                                    // [0x2ddc520] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUAShootHitRateIfInCoverSafe
	// float GetUAShootHitRateIfInCoverSafe();                                                                                  // [0x2ddc4f0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUAShootHitRateIfEnemyMoveSpeed
	// float GetUAShootHitRateIfEnemyMoveSpeed();                                                                               // [0x2ddc4c0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUAShootHitRateIfEnemyMove
	// float GetUAShootHitRateIfEnemyMove();                                                                                    // [0x2ddc490] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUAShootHitRateIfBeHited
	// float GetUAShootHitRateIfBeHited();                                                                                      // [0x2ddc460] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUAShootHitRateIfBattleDuration
	// float GetUAShootHitRateIfBattleDuration(float BattleDurationTime);                                                       // [0x2ddc3d0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUAShootHitRateIfArmBroken
	// float GetUAShootHitRateIfArmBroken();                                                                                    // [0x2ddc3a0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUAShootHitRateIfAIMove
	// float GetUAShootHitRateIfAIMove();                                                                                       // [0x2ddc370] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUAShootHitRateForDistanceToPlayer
	// float GetUAShootHitRateForDistanceToPlayer(float InDistance);                                                            // [0x2ddc2e0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUAShootHitRateForDistanceToAI
	// float GetUAShootHitRateForDistanceToAI(float InDistance);                                                                // [0x2ddc250] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUAShootHitRateForDistanceIfNotADS
	// float GetUAShootHitRateForDistanceIfNotADS(float InDistance);                                                            // [0x2ddc1c0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUAShootHitLimitedTime
	// float GetUAShootHitLimitedTime();                                                                                        // [0x2ddc190] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUAShootHeadFaceRateIfUsedPredstined
	// float GetUAShootHeadFaceRateIfUsedPredstined();                                                                          // [0x2ddc160] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUaScatteringByDist
	// float GetUaScatteringByDist(float Distance);                                                                             // [0x2ddc7c0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUaQuickAimUnderSeenTime
	// float GetUaQuickAimUnderSeenTime();                                                                                      // [0x2ddc790] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUaQuickAimTimeCalcCoef
	// float GetUaQuickAimTimeCalcCoef();                                                                                       // [0x2ddc760] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUaQuickAimOffsetDisRate
	// float GetUaQuickAimOffsetDisRate();                                                                                      // [0x2ddc730] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUaMinAimTime
	// float GetUaMinAimTime();                                                                                                 // [0x2ddc700] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUaFakeRandomHitRate
	// float GetUaFakeRandomHitRate(float HitRate);                                                                             // [0x2ddc670] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUaAimTime2DistMultiplierCurve
	// class UCurveFloat* GetUaAimTime2DistMultiplierCurve();                                                                   // [0x2ddc640] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetUaAddAimingTickWhenAngleSmallerThan_Cos
	// float GetUaAddAimingTickWhenAngleSmallerThan_Cos();                                                                      // [0x2ddc610] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetTimeCoefIfMove
	// float GetTimeCoefIfMove();                                                                                               // [0x2ddc100] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetShootToChangeRndPartDelta
	// float GetShootToChangeRndPartDelta();                                                                                    // [0x2ddc0d0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetReclcZDist
	// float GetReclcZDist();                                                                                                   // [0x2ddc0a0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetRecalcSqrDist
	// float GetRecalcSqrDist();                                                                                                // [0x2ddc070] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetRecalcMustTimeMin
	// int32_t GetRecalcMustTimeMin();                                                                                          // [0x2ddc040] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetRecalcMustTimeMax
	// int32_t GetRecalcMustTimeMax();                                                                                          // [0x2ddc010] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetRecalcDist
	// float GetRecalcDist();                                                                                                   // [0x2ddbfe0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetNextShotMissYOffset
	// float GetNextShotMissYOffset();                                                                                          // [0x2ddbf80] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetMinTimeDiscardAimSec
	// float GetMinTimeDiscardAimSec();                                                                                         // [0x2ddbe50] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetMaxTimeDiscardAimSec
	// float GetMaxTimeDiscardAimSec();                                                                                         // [0x2ddbe20] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetMaxAimTime
	// float GetMaxAimTime();                                                                                                   // [0x2ddbdc0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetMaxAimPrecicing
	// float GetMaxAimPrecicing();                                                                                              // [0x2ddbd90] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetMaxAimingUpgradeByTime
	// float GetMaxAimingUpgradeByTime();                                                                                       // [0x2ddbdf0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetIsFilterNotSeenPartToAiming
	// bool GetIsFilterNotSeenPartToAiming();                                                                                   // [0x2ddbd60] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetFirstContactAddSec
	// float GetFirstContactAddSec();                                                                                           // [0x2ddbd30] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetFirstContactAddChance100
	// float GetFirstContactAddChance100();                                                                                     // [0x2ddbd00] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetDistToShootNoOffset
	// float GetDistToShootNoOffset();                                                                                          // [0x2ddbcd0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetDamageToDiscardAim0100
	// float GetDamageToDiscardAim0100();                                                                                       // [0x2ddbca0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetCoefIfMove
	// float GetCoefIfMove();                                                                                                   // [0x2ddbc70] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetCoefFromCover
	// float GetCoefFromCover();                                                                                                // [0x2ddbc40] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetBottomCoef
	// float GetBottomCoef();                                                                                                   // [0x2ddbc10] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetBetterPrecicingCoef
	// float GetBetterPrecicingCoef();                                                                                          // [0x2ddbbe0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetAnyPartShootTime
	// float GetAnyPartShootTime();                                                                                             // [0x2ddbbb0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetAimingTypeWeightInRuntime
	// float GetAimingTypeWeightInRuntime(EAIBodyBulkType InBulkType, bool bIsForPlayer);                                       // [0x2ddbae0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetAimingType
	// EAimingType GetAimingType();                                                                                             // [0x2ddbab0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetAimingBulks
	// TArray<FAIBodyBulkAimingChoice> GetAimingBulks(bool bIsForPlayer);                                                       // [0x2ddb940] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.GetAimingBodyPartTrend
	// EAIAimingBodyPartTrend GetAimingBodyPartTrend();                                                                         // [0x2ddb910] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Aiming.AddAimingTypeInRuntime
	// void AddAimingTypeInRuntime(EAIBodyBulkType InBulkType, float InWeight, bool bIsForPlayer);                              // [0x2ddb770] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.AIPropertyAITypeProfile
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UAIPropertyAITypeProfile : public UNPCAIPropertyProfile
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_AIType
/// Size: 0x0008 (8 bytes) (0x000038 - 0x000040) align 8 pad: 0x0000
class UNPCAIPropertyComponent_AIType : public UNPCAIPropertyComponent
{ 
public:
	class UNPCAIModifierComponent_AIType*              Modifier_AIType;                                            // 0x0038   (0x0008)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_AIType.InitModifierComponents
	// bool InitModifierComponents();                                                                                           // [0x2de04c0] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_AIType.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_AIType.GetAIMainType
	// EAIMainType GetAIMainType();                                                                                             // [0x2ddf730] Final|Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFNPCAI.AIPropertyBlockProfile
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UAIPropertyBlockProfile : public UNPCAIPropertyProfile
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_Block
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_Block : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Block.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Block.GetAimTimeAfterTurn
	// float GetAimTimeAfterTurn(float Angle);                                                                                  // [0x3a75280] Event|Public|BlueprintCallable|BlueprintEvent|BlueprintPure 
};

/// Class /Script/MFNPCAI.AIPropertyBossProfile
/// Size: 0x0018 (24 bytes) (0x000038 - 0x000050) align 8 pad: 0x0000
class UAIPropertyBossProfile : public UNPCAIPropertyProfile
{ 
public:
	bool                                               BOSS_SHALL_WARNING_SCAVPLAYER;                              // 0x0038   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0039   (0x0003)  MISSED
	float                                              BOSS_DIST_TO_WARNING;                                       // 0x003C   (0x0004)  
	float                                              BOSS_WARNING_TIME;                                          // 0x0040   (0x0004)  
	float                                              BOSS_DIST_TO_SHOOT;                                         // 0x0044   (0x0004)  
	float                                              BOSS_DIST_TO_WARNING_OUT;                                   // 0x0048   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x004C   (0x0004)  MISSED
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_Boss
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_Boss : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Boss.IsBossShallWarningScavPlayer
	// bool IsBossShallWarningScavPlayer();                                                                                     // [0x2de04f0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Boss.GetBossWarningTime
	// float GetBossWarningTime();                                                                                              // [0x2ddf8b0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Boss.GetBossDistToWarningOut
	// float GetBossDistToWarningOut();                                                                                         // [0x2ddf880] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Boss.GetBossDistToWarning
	// float GetBossDistToWarning();                                                                                            // [0x2ddf850] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Boss.GetBossDistToShoot
	// float GetBossDistToShoot();                                                                                              // [0x2ddf820] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Boss.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFNPCAI.AIPropertyCoreProfile
/// Size: 0x0008 (8 bytes) (0x000038 - 0x000040) align 8 pad: 0x0000
class UAIPropertyCoreProfile : public UNPCAIPropertyProfile
{ 
public:
	EAimingType                                        AimingType;                                                 // 0x0038   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0039   (0x0003)  MISSED
	float                                              AccuratySpeed;                                              // 0x003C   (0x0004)  
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_Core
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_Core : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Core.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Core.GetAimingType
	// EAimingType GetAimingType();                                                                                             // [0x2ddf790] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Core.GetAccuratySpeed
	// float GetAccuratySpeed();                                                                                                // [0x2ddf760] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/MFNPCAI.AIPropertyCurveProfile
/// Size: 0x0010 (16 bytes) (0x000038 - 0x000048) align 8 pad: 0x0000
class UAIPropertyCurveProfile : public UNPCAIPropertyProfile
{ 
public:
	class UCurveFloat*                                 SightCurveDaytime;                                          // 0x0038   (0x0008)  
	class UCurveFloat*                                 SightCureOutLight;                                          // 0x0040   (0x0008)  


	/// Functions
	// Function /Script/MFNPCAI.AIPropertyCurveProfile.GetSightCurveDaytime
	// class UCurveFloat* GetSightCurveDaytime();                                                                               // [0x2de0150] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.AIPropertyCurveProfile.GetSightCureOutLight
	// class UCurveFloat* GetSightCureOutLight();                                                                               // [0x2de00f0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_Curve
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_Curve : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Curve.GetSightCurveDaytime
	// class UCurveFloat* GetSightCurveDaytime();                                                                               // [0x2de0180] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Curve.GetSightCureOutLight
	// class UCurveFloat* GetSightCureOutLight();                                                                               // [0x2de0120] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Curve.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFNPCAI.AIPropertyDamageProfile
/// Size: 0x0038 (56 bytes) (0x000038 - 0x000070) align 8 pad: 0x0000
class UAIPropertyDamageProfile : public UNPCAIPropertyProfile
{ 
public:
	float                                              DamageScale;                                                // 0x0038   (0x0004)  
	float                                              ArmorDamageScale;                                           // 0x003C   (0x0004)  
	float                                              BulletArmorPenetrationNotHurt;                              // 0x0040   (0x0004)  
	bool                                               EnabledTeamGrenadeHarm;                                     // 0x0044   (0x0001)  
	bool                                               EnabledFactionGrenadeHarm;                                  // 0x0045   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x0046   (0x0002)  MISSED
	int32_t                                            DamageLimit;                                                // 0x0048   (0x0004)  
	float                                              DamageLimitTime;                                            // 0x004C   (0x0004)  
	float                                              DamageLimitPercentage;                                      // 0x0050   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0054   (0x0004)  MISSED
	TArray<EAIBodyPartType>                            DamageNoZeroHPParts;                                        // 0x0058   (0x0010)  
	float                                              DamageBleedExtraProbability;                                // 0x0068   (0x0004)  
	unsigned char                                      UnknownData02_7[0x4];                                       // 0x006C   (0x0004)  MISSED
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_Damage
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_Damage : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Damage.SetDamageScale
	// void SetDamageScale(float Value);                                                                                        // [0x2de06d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Damage.SetArmorDamageScale
	// void SetArmorDamageScale(float Value);                                                                                   // [0x2de05c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Damage.IsInDamageNoZeroHPPart
	// bool IsInDamageNoZeroHPPart(EAIBodyPartType& BodyPart);                                                                  // [0x2de0520] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Damage.GetTeamGrenadeHarmEnable
	// bool GetTeamGrenadeHarmEnable();                                                                                         // [0x2de02a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Damage.GetFactionGrenadeHarmEnable
	// bool GetFactionGrenadeHarmEnable();                                                                                      // [0x2ddfbb0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Damage.GetDamageScale
	// float GetDamageScale();                                                                                                  // [0x2ddfaf0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Damage.GetDamageLimitTime
	// float GetDamageLimitTime();                                                                                              // [0x2ddfac0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Damage.GetDamageLimitPercentage
	// float GetDamageLimitPercentage();                                                                                        // [0x2ddfa90] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Damage.GetDamageLimit
	// int32_t GetDamageLimit();                                                                                                // [0x2ddfa60] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Damage.GetDamageBleedExtraProbability
	// float GetDamageBleedExtraProbability();                                                                                  // [0x2ddfa30] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Damage.GetBulletArmorPenetrationNotHurt
	// float GetBulletArmorPenetrationNotHurt();                                                                                // [0x2ddf8e0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Damage.GetArmorDamageScale
	// float GetArmorDamageScale();                                                                                             // [0x2ddf7c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Damage.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFNPCAI.AIPropertyGlobalProfile
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UAIPropertyGlobalProfile : public UNPCAIPropertyProfile
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_Global
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_Global : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Global.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFNPCAI.AIPropertyGrenadeProfile
/// Size: 0x0068 (104 bytes) (0x000038 - 0x0000A0) align 8 pad: 0x0000
class UAIPropertyGrenadeProfile : public UNPCAIPropertyProfile
{ 
public:
	FVector                                            UA_THROW_POSITION_OFFSET_STAND;                             // 0x0038   (0x000C)  
	FVector                                            UA_THROW_POSITION_OFFSET_STAND_LLEAN;                       // 0x0044   (0x000C)  
	FVector                                            UA_THROW_POSITION_OFFSET_STAND_RLEAN;                       // 0x0050   (0x000C)  
	FVector                                            UA_THROW_POSITION_OFFSET_CROUCH;                            // 0x005C   (0x000C)  
	FVector                                            UA_THROW_POSITION_OFFSET_CROUCH_LLEAN;                      // 0x0068   (0x000C)  
	FVector                                            UA_THROW_POSITION_OFFSET_CROUCH_RLEAN;                      // 0x0074   (0x000C)  
	FVector                                            UA_THROW_POSITION_OFFSET_PRONE;                             // 0x0080   (0x000C)  
	float                                              EXTRA_PROJECTILE_PLAY_EFFECT_TIME;                          // 0x008C   (0x0004)  
	float                                              CLOSE_GRENADE_HIT_DISTANCE;                                 // 0x0090   (0x0004)  
	float                                              COMING_GRENADE_BE_KONW_IF_FALL_IN_DISTANCE;                 // 0x0094   (0x0004)  
	float                                              HOLDING_GRENADE_BE_KONW_IF_IN_DISTANCE;                     // 0x0098   (0x0004)  
	float                                              SELF_HOLDING_GRENADE_PROBABILITY;                           // 0x009C   (0x0004)  
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_Grenade
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_Grenade : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Grenade.GetUaThrowPositionOffsetByPosture
	// FVector GetUaThrowPositionOffsetByPosture(EAIPose PoseType, EAILeanType LeanType, FRotator& Rotator);                    // [0x2de0380] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Grenade.GetUaThrowPositionOffset
	// FVector GetUaThrowPositionOffset(FRotator& Rotator);                                                                     // [0x2de02d0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Grenade.GetSelfHoldingGrenadeProbability
	// float GetSelfHoldingGrenadeProbability();                                                                                // [0x2de00c0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Grenade.GetHoldingGrenadeBeKonwIfInDistance
	// float GetHoldingGrenadeBeKonwIfInDistance();                                                                             // [0x2ddfd30] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Grenade.GetExtraProjectilePlayEffectTime
	// float GetExtraProjectilePlayEffectTime();                                                                                // [0x2ddfb80] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Grenade.GetComingGrenadeBeKonwIfFallInDistance
	// float GetComingGrenadeBeKonwIfFallInDistance();                                                                          // [0x2ddfa00] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Grenade.GetCloseGrenadeHitDistance
	// float GetCloseGrenadeHitDistance();                                                                                      // [0x2ddf940] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Grenade.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFNPCAI.AIPropertyHealthProfile
/// Size: 0x0028 (40 bytes) (0x000038 - 0x000060) align 8 pad: 0x0000
class UAIPropertyHealthProfile : public UNPCAIPropertyProfile
{ 
public:
	float                                              HeadEnduranceMax;                                           // 0x0038   (0x0004)  
	float                                              ChestEnduranceMax;                                          // 0x003C   (0x0004)  
	float                                              StomachEnduranceMax;                                        // 0x0040   (0x0004)  
	float                                              LeftArmEnduranceMax;                                        // 0x0044   (0x0004)  
	float                                              RightArmEnduranceMax;                                       // 0x0048   (0x0004)  
	float                                              LeftLegEnduranceMax;                                        // 0x004C   (0x0004)  
	float                                              RightLegEnduranceMax;                                       // 0x0050   (0x0004)  
	float                                              MaxHealthAdjustment;                                        // 0x0054   (0x0004)  
	bool                                               bEnableDBNO;                                                // 0x0058   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0059   (0x0003)  MISSED
	float                                              DangerCoefOfDBNO;                                           // 0x005C   (0x0004)  
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_Health
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_Health : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Health.SetEnableDBNO
	// void SetEnableDBNO(bool InEnabled);                                                                                      // [0x2de0750] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Health.GetStomachEnduranceMax
	// float GetStomachEnduranceMax();                                                                                          // [0x2de01b0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Health.GetRightLegEnduranceMax
	// float GetRightLegEnduranceMax();                                                                                         // [0x2de0090] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Health.GetRightArmEnduranceMax
	// float GetRightArmEnduranceMax();                                                                                         // [0x2de0060] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Health.GetMaxHealthAdjustment
	// float GetMaxHealthAdjustment();                                                                                          // [0x2ddfdc0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Health.GetLeftLegEnduranceMax
	// float GetLeftLegEnduranceMax();                                                                                          // [0x2ddfd90] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Health.GetLeftArmEnduranceMax
	// float GetLeftArmEnduranceMax();                                                                                          // [0x2ddfd60] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Health.GetHeadEnduranceMax
	// float GetHeadEnduranceMax();                                                                                             // [0x2ddfcd0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Health.GetEnableDBNO
	// bool GetEnableDBNO();                                                                                                    // [0x2ddfb50] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Health.GetDangerCoefOfDBNO
	// float GetDangerCoefOfDBNO();                                                                                             // [0x2ddfb20] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Health.GetChestEnduranceMax
	// float GetChestEnduranceMax();                                                                                            // [0x2ddf910] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Health.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFNPCAI.AIPropertyHearingProfile
/// Size: 0x0070 (112 bytes) (0x000038 - 0x0000A8) align 8 pad: 0x0000
class UAIPropertyHearingProfile : public UNPCAIPropertyProfile
{ 
public:
	bool                                               AUTO_BE_ENEMY_IF_CREATE_DANAGE_NOISE;                       // 0x0038   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0039   (0x0003)  MISSED
	float                                              NOISE_POWER_SPRINT;                                         // 0x003C   (0x0004)  
	float                                              NOISE_POWER_PRONE;                                          // 0x0040   (0x0004)  
	float                                              NOISE_POWER_CROUCH;                                         // 0x0044   (0x0004)  
	float                                              NOISE_POWER_WALK;                                           // 0x0048   (0x0004)  
	float                                              NOISE_POWER_SLIENT_WALK;                                    // 0x004C   (0x0004)  
	float                                              NOISE_POWER_SLIENT_CROUCH;                                  // 0x0050   (0x0004)  
	float                                              NOISE_POWER_GUN_FIRE;                                       // 0x0054   (0x0004)  
	float                                              NOISE_POWER_SILENCED_FIRE;                                  // 0x0058   (0x0004)  
	float                                              NOISE_POWER_DOOR_OPEN;                                      // 0x005C   (0x0004)  
	float                                              NOISE_POWER_DOOR_WRECK;                                     // 0x0060   (0x0004)  
	float                                              NOISE_POWER_GRENADE_EXPLOSIVE;                              // 0x0064   (0x0004)  
	float                                              NOISE_POWER_FOOT_STEP_SOUNDER;                              // 0x0068   (0x0004)  
	float                                              POWER_DANGER;                                               // 0x006C   (0x0004)  
	float                                              HEARING_POWER_COEF;                                         // 0x0070   (0x0004)  
	float                                              FOOT_STEP_FAR_DIST;                                         // 0x0074   (0x0004)  
	float                                              GUN_FAR_DIST;                                               // 0x0078   (0x0004)  
	float                                              GUN_HIT_CLOSE_DIST;                                         // 0x007C   (0x0004)  
	float                                              GUN_BULLET_TRACK_FROM_ME_RADIUS;                            // 0x0080   (0x0004)  
	float                                              GUN_BULLET_TRACK_CHECK_IN_FIRE_DISTANCE;                    // 0x0084   (0x0004)  
	float                                              COEF_FOOTSTEP_SUSPECTED_POINT_OFFSET;                       // 0x0088   (0x0004)  
	float                                              COEF_GUN_SUSPECTED_POINT_OFFSET;                            // 0x008C   (0x0004)  
	float                                              COEF_SILENT_GUN_SUSPECTED_POINT_OFFSET;                     // 0x0090   (0x0004)  
	float                                              SUSPECTED_POINT_ACCURACY_INCREASE_GAP_TIME;                 // 0x0094   (0x0004)  
	float                                              SUSPECTED_POINT_ACCURACY_DAMPING_GAP_TIME;                  // 0x0098   (0x0004)  
	int32_t                                            SUSPECTED_POINT_ACCURACY_MAX_NUM;                           // 0x009C   (0x0004)  
	float                                              SUSPECTED_POINT_POS_UPDATE_INTERVAL;                        // 0x00A0   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x00A4   (0x0004)  MISSED
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_Hearing
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_Hearing : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.SetAutoBeEnemyIfCreateDanageNoise
	// void SetAutoBeEnemyIfCreateDanageNoise(bool bCanAutoBeEnemy);                                                            // [0x2de0640] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetSuspectedPointPosUpdateInterval
	// float GetSuspectedPointPosUpdateInterval();                                                                              // [0x2de0270] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetSuspectedPointAccuracyMaxNum
	// int32_t GetSuspectedPointAccuracyMaxNum();                                                                               // [0x2de0240] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetSuspectedPointAccuracyIncreaseGapTime
	// float GetSuspectedPointAccuracyIncreaseGapTime();                                                                        // [0x2de0210] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetSuspectedPointAccuracyDampingGapTime
	// float GetSuspectedPointAccuracyDampingGapTime();                                                                         // [0x2de01e0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetPowerDanger
	// float GetPowerDanger();                                                                                                  // [0x2de0030] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetNoisePowerWalk
	// float GetNoisePowerWalk();                                                                                               // [0x2de0000] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetNoisePowerSprint
	// float GetNoisePowerSprint();                                                                                             // [0x2ddffd0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetNoisePowerSlientWalk
	// float GetNoisePowerSlientWalk();                                                                                         // [0x2ddffa0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetNoisePowerSlientCrouch
	// float GetNoisePowerSlientCrouch();                                                                                       // [0x2ddff70] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetNoisePowerSilencedFire
	// float GetNoisePowerSilencedFire();                                                                                       // [0x2ddff40] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetNoisePowerProne
	// float GetNoisePowerProne();                                                                                              // [0x2ddff10] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetNoisePowerGunFire
	// float GetNoisePowerGunFire();                                                                                            // [0x2ddfee0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetNoisePowerGrenadeExplosive
	// float GetNoisePowerGrenadeExplosive();                                                                                   // [0x2ddfeb0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetNoisePowerFootStepSounder
	// float GetNoisePowerFootStepSounder();                                                                                    // [0x2ddfe80] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetNoisePowerDoorWreck
	// float GetNoisePowerDoorWreck();                                                                                          // [0x2ddfe50] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetNoisePowerDoorOpen
	// float GetNoisePowerDoorOpen();                                                                                           // [0x2ddfe20] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetNoisePowerCrouch
	// float GetNoisePowerCrouch();                                                                                             // [0x2ddfdf0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetHearingPowerCoef
	// float GetHearingPowerCoef();                                                                                             // [0x2ddfd00] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetGunHitCloseDist
	// float GetGunHitCloseDist();                                                                                              // [0x2ddfca0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetGunFarDist
	// float GetGunFarDist();                                                                                                   // [0x2ddfc70] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetGunBulletTrackFromMeRadius
	// float GetGunBulletTrackFromMeRadius();                                                                                   // [0x2ddfc40] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetGunBulletTrackCheckInFireDistance
	// float GetGunBulletTrackCheckInFireDistance();                                                                            // [0x2ddfc10] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetFootStepFarDist
	// float GetFootStepFarDist();                                                                                              // [0x2ddfbe0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetCoefSilentGunSuspectedPointOffset
	// float GetCoefSilentGunSuspectedPointOffset();                                                                            // [0x2ddf9d0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetCoefGunSuspectedPointOffset
	// float GetCoefGunSuspectedPointOffset();                                                                                  // [0x2ddf9a0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetCoefFootStepSuspectedPointOffset
	// float GetCoefFootStepSuspectedPointOffset();                                                                             // [0x2ddf970] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetAutoBeEnemyIfCreateDanageNoise
	// bool GetAutoBeEnemyIfCreateDanageNoise();                                                                                // [0x2ddf7f0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Hearing.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFNPCAI.AIPropertyLayProfile
/// Size: 0x0018 (24 bytes) (0x000038 - 0x000050) align 8 pad: 0x0000
class UAIPropertyLayProfile : public UNPCAIPropertyProfile
{ 
public:
	float                                              DELTA_LAY_CHECK;                                            // 0x0038   (0x0004)  
	float                                              DELTA_GETUP;                                                // 0x003C   (0x0004)  
	float                                              DELTA_AFTER_GETUP;                                          // 0x0040   (0x0004)  
	float                                              DIST_ENEMY_CAN_LAY;                                         // 0x0044   (0x0004)  
	float                                              DIST_ENEMY_CAN_LAY_SQRT;                                    // 0x0048   (0x0004)  
	float                                              LAY_AIM;                                                    // 0x004C   (0x0004)  
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_Lay
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_Lay : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Lay.GetLayAim
	// float GetLayAim();                                                                                                       // [0x2de2240] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Lay.GetDistEnemyCanLaySqrt
	// float GetDistEnemyCanLaySqrt();                                                                                          // [0x2de1d20] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Lay.GetDistEnemyCanLay
	// float GetDistEnemyCanLay();                                                                                              // [0x2de1cf0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Lay.GetDeltaLayCheck
	// float GetDeltaLayCheck();                                                                                                // [0x2de1c90] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Lay.GetDeltaGetup
	// float GetDeltaGetup();                                                                                                   // [0x2de1c60] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Lay.GetDeltaAfterGetup
	// float GetDeltaAfterGetup();                                                                                              // [0x2de1c30] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Lay.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
};

/// Struct /Script/MFNPCAI.AISenseSightNormal
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 4 pad: 0x0000
struct FAISenseSightNormal
{ 
	float                                              Angle;                                                      // 0x0000   (0x0004)  
	float                                              VisionRadius;                                               // 0x0004   (0x0004)  
	float                                              LostVisionRadius;                                           // 0x0008   (0x0004)  
	float                                              AngleCos;                                                   // 0x000C   (0x0004)  
	float                                              VisionRadiusSqr;                                            // 0x0010   (0x0004)  
	float                                              LostVisionRadiusSqr;                                        // 0x0014   (0x0004)  
};

/// Class /Script/MFNPCAI.AIPropertyLookProfile
/// Size: 0x0110 (272 bytes) (0x000038 - 0x000148) align 8 pad: 0x0000
class UAIPropertyLookProfile : public UNPCAIPropertyProfile
{ 
public:
	ENPCAIPriority                                     SIGHT_PRIORITY;                                             // 0x0038   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0039   (0x0007)  MISSED
	TArray<FAISenseSightNormal>                        VISION_NORMAL;                                              // 0x0040   (0x0010)  
	float                                              VISIBLE_ANG_NORMAL;                                         // 0x0050   (0x0004)  
	float                                              NORMAL_VISION_RADIUS;                                       // 0x0054   (0x0004)  
	float                                              NORMAL_VISION_RADIUS_LOST;                                  // 0x0058   (0x0004)  
	float                                              FOG_DENSITY_AFFECT_LIMIT;                                   // 0x005C   (0x0004)  
	class UCurveVector*                                FOG_VISION_CURVE;                                           // 0x0060   (0x0008)  
	float                                              FOG_DELAY_SEE_TIME_MAX;                                     // 0x0068   (0x0004)  
	float                                              FOG_SHOT_IN_TIME_CAN_IGNORE_FOGVISION;                      // 0x006C   (0x0004)  
	float                                              SMOKE_SIGHT_IGNORE_DISTANCE;                                // 0x0070   (0x0004)  
	float                                              GRASS_SIGHT_IGNORE_DISTANCE;                                // 0x0074   (0x0004)  
	float                                              LANDSCAPE_GRASS_SIGHT_IGNORE_ANGLE;                         // 0x0078   (0x0004)  
	float                                              GRASS_SIGHT_BLOCK_POWER;                                    // 0x007C   (0x0004)  
	float                                              GRASS_SIGHT_BLOCK_DENSITY100;                               // 0x0080   (0x0004)  
	float                                              RAINY_SIGHT_RADIUS_MIN;                                     // 0x0084   (0x0004)  
	float                                              RAINY_SIGHT_RADIUS_MAX;                                     // 0x0088   (0x0004)  
	float                                              INGORE_NOLIGHT_RADIUS;                                      // 0x008C   (0x0004)  
	float                                              DIST_NORMAL_SUSPECTED_POINT_INTERVAL;                       // 0x0090   (0x0004)  
	float                                              DIST_DANGER_SUSPECTED_POINT_INTERVAL;                       // 0x0094   (0x0004)  
	float                                              FAR_DISTANCE;                                               // 0x0098   (0x0004)  
	float                                              MIDDLE_DIST;                                                // 0x009C   (0x0004)  
	float                                              CLOSE_DIST;                                                 // 0x00A0   (0x0004)  
	float                                              GOAL_TO_FULL_DISSAPEAR;                                     // 0x00A4   (0x0004)  
	float                                              GOAL_NEED_TO_CALCULATE_FIRST_APPEAR_DISTANCE;               // 0x00A8   (0x0004)  
	float                                              GOAL_FIRST_APPEAR_CALCULATE_COEF;                           // 0x00AC   (0x0004)  
	float                                              GOAL_FIRST_APPEAR_ANGLE_CALCULATE_COEF;                     // 0x00B0   (0x0004)  
	float                                              GOAL_FIRST_APPEAR_MIN_TIME;                                 // 0x00B4   (0x0004)  
	float                                              GOAL_FIRST_APPEAR_MAX_TIME;                                 // 0x00B8   (0x0004)  
	float                                              TIME_CAN_SEE_ENEMY_IF_BEEN_SHOOT;                           // 0x00BC   (0x0004)  
	float                                              TIME_CAN_SEE_ENEMY_IF_FLASH_LIGHT;                          // 0x00C0   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x00C4   (0x0004)  MISSED
	class UCurveFloat*                                 FLASH_LIGHT_BURN_LOSS_SIGHT_CURVE;                          // 0x00C8   (0x0008)  
	float                                              WEAKEN_VISION_RADIUS_SCALE_WHILE_ROTATE;                    // 0x00D0   (0x0004)  
	float                                              WEAKEN_VISION_RADIUS_SCALE_MAX_WHILE_ROTATE;                // 0x00D4   (0x0004)  
	float                                              RECOVER_VISION_RADIUS_SPEED_AFTER_WEAKEN;                   // 0x00D8   (0x0004)  
	float                                              DISTANCE_CHECK_IF_OUTSIDE_SIGHT_PIE;                        // 0x00DC   (0x0004)  
	float                                              TIME_CREATE_SUSPECTED_POINT_CHECK_IF_OUTSIDE_SIGHT_PIE;     // 0x00E0   (0x0004)  
	float                                              INTERVAL_CHECK_IF_OUTSIDE_SIGHT_PIE;                        // 0x00E4   (0x0004)  
	FVector                                            LOOK_POSITION_OFFSET_STAND;                                 // 0x00E8   (0x000C)  
	FVector                                            LOOK_POSITION_OFFSET_STAND_LLEAN;                           // 0x00F4   (0x000C)  
	FVector                                            LOOK_POSITION_OFFSET_STAND_RLEAN;                           // 0x0100   (0x000C)  
	FVector                                            LOOK_POSITION_OFFSET_CROUCH;                                // 0x010C   (0x000C)  
	FVector                                            LOOK_POSITION_OFFSET_CROUCH_LLEAN;                          // 0x0118   (0x000C)  
	FVector                                            LOOK_POSITION_OFFSET_CROUCH_RLEAN;                          // 0x0124   (0x000C)  
	FVector                                            LOOK_POSITION_OFFSET_PRONE;                                 // 0x0130   (0x000C)  
	FVector                                            LEAN_CHECK_BLOCK_WALL_OFFSET;                               // 0x013C   (0x000C)  
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_Look
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_Look : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetWeakenVisionRadiusScaleWhileRotate
	// float GetWeakenVisionRadiusScaleWhileRotate();                                                                           // [0x2de2a60] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetWeakenVisionRadiusScaleMaxWhileRotate
	// float GetWeakenVisionRadiusScaleMaxWhileRotate();                                                                        // [0x2de2a30] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetVisibleAngNormal
	// float GetVisibleAngNormal();                                                                                             // [0x2de2a00] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetVisibleAngCosNormal
	// float GetVisibleAngCosNormal(float DistanceSqr, bool bLastInSight);                                                      // [0x2de2920] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetTimeCreateSuspectedPointCheckIfOutSideSightPIE
	// float GetTimeCreateSuspectedPointCheckIfOutSideSightPIE();                                                               // [0x2de2800] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetTimeCanSeeEnemyIfFlashLight
	// float GetTimeCanSeeEnemyIfFlashLight();                                                                                  // [0x2de27d0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetTimeCanSeeEnemyIfBeenShoot
	// float GetTimeCanSeeEnemyIfBeenShoot();                                                                                   // [0x2de27a0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetSmokeSightIgnoreDistance
	// float GetSmokeSightIgnoreDistance();                                                                                     // [0x2de2770] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetSightPriority
	// ENPCAIPriority GetSightPriority();                                                                                       // [0x2de2740] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetRecoverVisionRadiusSpeedAfterWeaken
	// float GetRecoverVisionRadiusSpeedAfterWeaken();                                                                          // [0x2de25c0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetRainySightRadiusMin
	// float GetRainySightRadiusMin();                                                                                          // [0x2de2590] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetRainySightRadiusMax
	// float GetRainySightRadiusMax();                                                                                          // [0x2de2560] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetNormalVisionRadiusLost
	// float GetNormalVisionRadiusLost();                                                                                       // [0x2de2530] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetNormalVisionRadius
	// float GetNormalVisionRadius();                                                                                           // [0x2de2500] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetMiddleDistance
	// float GetMiddleDistance();                                                                                               // [0x2de2470] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetLostSightRatioByFlashLightBurn
	// float GetLostSightRatioByFlashLightBurn(float FlashBurnValue);                                                           // [0x2de23e0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetLookPositionOffsetByPosture
	// FVector GetLookPositionOffsetByPosture(EAIPose PoseType, EAILeanType LeanType);                                          // [0x2de22f0] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetLookPositionOffset
	// FVector GetLookPositionOffset();                                                                                         // [0x2de22b0] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetLeanCheckBlockWallOffset
	// FVector GetLeanCheckBlockWallOffset();                                                                                   // [0x2de2270] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetLandscapeGrassSightIgnoreAngle
	// float GetLandscapeGrassSightIgnoreAngle();                                                                               // [0x2de2210] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetIntervalCheckIfOutSideSightPIE
	// float GetIntervalCheckIfOutSideSightPIE();                                                                               // [0x2de21b0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetIngoreNolightRadius
	// float GetIngoreNolightRadius();                                                                                          // [0x2de2180] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetGrassSightIgnoreDistance
	// float GetGrassSightIgnoreDistance();                                                                                     // [0x2de2120] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetGrassSightBlockPowner
	// float GetGrassSightBlockPowner();                                                                                        // [0x2de20f0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetGrassSightBlockDensity100
	// float GetGrassSightBlockDensity100();                                                                                    // [0x2de20c0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetGoalToFullDissapear
	// float GetGoalToFullDissapear();                                                                                          // [0x2de2090] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetGoalNeedToCalculateFirstAppearDistance
	// float GetGoalNeedToCalculateFirstAppearDistance();                                                                       // [0x2de2060] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetGoalFirstAppearMinTime
	// float GetGoalFirstAppearMinTime();                                                                                       // [0x2de2030] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetGoalFirstAppearMaxTime
	// float GetGoalFirstAppearMaxTime();                                                                                       // [0x2de2000] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetGoalFirstAppearCalculateCoef
	// float GetGoalFirstAppearCalculateCoef();                                                                                 // [0x2de1fd0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetGoalFirstAppearAngleCalculateCoef
	// float GetGoalFirstAppearAngleCalculateCoef();                                                                            // [0x2de1fa0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetFogVisionInfo
	// void GetFogVisionInfo(float FogDensity, float& OutFogMin, float& OutFogMax);                                             // [0x2de1e70] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetFogShotInTimeCanIgnoreFogVision
	// float GetFogShotInTimeCanIgnoreFogVision();                                                                              // [0x2de1e40] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetFogDensityAffectLimit
	// float GetFogDensityAffectLimit();                                                                                        // [0x2de1e10] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetFogDelayTimeToSeeMax
	// float GetFogDelayTimeToSeeMax();                                                                                         // [0x2de1de0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetFarDistance
	// float GetFarDistance();                                                                                                  // [0x2de1db0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetDistNormalSuspectedPointInterval
	// float GetDistNormalSuspectedPointInterval();                                                                             // [0x2de1d50] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetDistDangerSuspectedPointInterval
	// float GetDistDangerSuspectedPointInterval();                                                                             // [0x2de1cc0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetDistanceCheckIfOutSideSightPIE
	// float GetDistanceCheckIfOutSideSightPIE();                                                                               // [0x2de1d80] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetCloseDistance
	// float GetCloseDistance();                                                                                                // [0x2de1c00] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Look.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
};

/// Struct /Script/MFNPCAI.AIMindGoalEnemyAngleMultiple
/// Size: 0x000C (12 bytes) (0x000000 - 0x00000C) align 4 pad: 0x0000
struct FAIMindGoalEnemyAngleMultiple
{ 
	float                                              Angle;                                                      // 0x0000   (0x0004)  
	float                                              ScoreMultiple;                                              // 0x0004   (0x0004)  
	float                                              AngleCos;                                                   // 0x0008   (0x0004)  
};

/// Class /Script/MFNPCAI.AIPropertyMindProfile
/// Size: 0x0050 (80 bytes) (0x000038 - 0x000088) align 8 pad: 0x0000
class UAIPropertyMindProfile : public UNPCAIPropertyProfile
{ 
public:
	ENPCAIPriority                                     CALCULATE_GOAL_ENEMY_PRIORITY_INTERVAL;                     // 0x0038   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0039   (0x0003)  MISSED
	float                                              HATRED_VALUE_TO_DIST;                                       // 0x003C   (0x0004)  
	float                                              SCORE_TO_DISTANCE_FOR_GOAL_ENEMY;                           // 0x0040   (0x0004)  
	float                                              TIME_OF_HIT_FOR_GOAL_ENEMY;                                 // 0x0044   (0x0004)  
	float                                              SCORE_CUT_OF_HIT_ME_FOR_GOAL_ENEMY;                         // 0x0048   (0x0004)  
	float                                              SCORE_CUT_OF_HIT_ALLY_FOR_GOAL_ENEMY;                       // 0x004C   (0x0004)  
	float                                              SCORE_CUT_OF_ZOOM_WEAPON_FOR_GOAL_ENEMY;                    // 0x0050   (0x0004)  
	float                                              CARE_TARGET_HAS_ZOOM_WEAPON_DSITANCE;                       // 0x0054   (0x0004)  
	TArray<FAIMindGoalEnemyAngleMultiple>              SCORE_MULTIPLE_FACE_ANGLE_FOR_GOAL_ENEMY;                   // 0x0058   (0x0010)  
	float                                              TIME_NOT_SEE_FOR_GOAL_ENEMY;                                // 0x0068   (0x0004)  
	float                                              TIME_TO_FORGOR_ABOUT_ENEMY_SEC;                             // 0x006C   (0x0004)  
	float                                              TIME_ENEMY_DEAD_PASS_CAN_CONFIRM;                           // 0x0070   (0x0004)  
	float                                              TIME_ENEMY_DEAD_PASS_CAN_DELETE;                            // 0x0074   (0x0004)  
	int32_t                                            ITEM_CHEAP_PRICE_CAN_DESTORY_WHEN_PICKUP;                   // 0x0078   (0x0004)  
	float                                              NO_REPEAT_QRE_MYSELF_AT_DISTANCE;                           // 0x007C   (0x0004)  
	float                                              NO_REPEAT_QRE_ENEMY_AT_DISTANCE;                            // 0x0080   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x0084   (0x0004)  MISSED
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_Mind
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_Mind : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Mind.GetTimeToForgorAboutEnemySec
	// float GetTimeToForgorAboutEnemySec();                                                                                    // [0x2de28f0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Mind.GetTimeOfHitForGoalEnemy
	// float GetTimeOfHitForGoalEnemy();                                                                                        // [0x2de28c0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Mind.GetTimeNotSeeForGoalEnemy
	// float GetTimeNotSeeForGoalEnemy();                                                                                       // [0x2de2890] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Mind.GetTimeEnemyDeadPassCanDelete
	// float GetTimeEnemyDeadPassCanDelete();                                                                                   // [0x2de2860] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Mind.GetTimeEnemyDeadPassCanConfirm
	// float GetTimeEnemyDeadPassCanConfirm();                                                                                  // [0x2de2830] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Mind.GetScoreToDistanceForGoalEnemy
	// float GetScoreToDistanceForGoalEnemy();                                                                                  // [0x2de2710] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Mind.GetScoreMultipleFaceAngleForGoalEnemyByCos
	// float GetScoreMultipleFaceAngleForGoalEnemyByCos(float AngleCos);                                                        // [0x2de2680] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Mind.GetScoreCutOfZoomWeaponForGoalEnemy
	// float GetScoreCutOfZoomWeaponForGoalEnemy();                                                                             // [0x2de2650] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Mind.GetScoreCutOfHitMeForGoalEnemy
	// float GetScoreCutOfHitMeForGoalEnemy();                                                                                  // [0x2de2620] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Mind.GetScoreCutOfHitAllyForGoalEnemy
	// float GetScoreCutOfHitAllyForGoalEnemy();                                                                                // [0x2de25f0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Mind.GetNoRepeatQREMyselfAtDistance
	// float GetNoRepeatQREMyselfAtDistance();                                                                                  // [0x2de24d0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Mind.GetNoRepeatQREEnemyAtDistance
	// float GetNoRepeatQREEnemyAtDistance();                                                                                   // [0x2de24a0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Mind.GetItemCheapPriceCanDestoryWhenPickUp
	// int32_t GetItemCheapPriceCanDestoryWhenPickUp();                                                                         // [0x2de21e0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Mind.GetHatredValueToDist
	// float GetHatredValueToDist();                                                                                            // [0x2de2150] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Mind.GetCareTargetHasZoomWeaponDistance
	// float GetCareTargetHasZoomWeaponDistance();                                                                              // [0x2de1bd0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Mind.GetCalculateGoalEnemyPriporityInterval
	// float GetCalculateGoalEnemyPriporityInterval();                                                                          // [0x2de1ba0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Mind.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFNPCAI.AIPropertyMoveProfile
/// Size: 0x0048 (72 bytes) (0x000038 - 0x000080) align 8 pad: 0x0000
class UAIPropertyMoveProfile : public UNPCAIPropertyProfile
{ 
public:
	float                                              REACH_DIST;                                                 // 0x0038   (0x0004)  
	float                                              Y_APPROXIMATION;                                            // 0x003C   (0x0004)  
	float                                              MAX_SPRINT_DURATION;                                        // 0x0040   (0x0004)  
	float                                              MIN_REQUIRED_TIME_TO_SPRINT;                                // 0x0044   (0x0004)  
	float                                              MAX_REQUIRED_TIME_TO_RECOVER;                               // 0x0048   (0x0004)  
	float                                              RECOVER_POINT_PER_SECOND;                                   // 0x004C   (0x0004)  
	float                                              MIN_ROTATE_SPEED;                                           // 0x0050   (0x0004)  
	bool                                               ENABLED_USE_ROTATE_ANGLE_LIMIT;                             // 0x0054   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0055   (0x0003)  MISSED
	float                                              MAX_ROTATE_ANGLE;                                           // 0x0058   (0x0004)  
	float                                              ROTATE_ANGLE_INTERVAL;                                      // 0x005C   (0x0004)  
	float                                              ROTATE_ANGLE_MIN_DEVIATION;                                 // 0x0060   (0x0004)  
	float                                              ROTATE_ANGLE_MAX_DEVIATION;                                 // 0x0064   (0x0004)  
	bool                                               ENABLED_QUICKLY_TURN_IN_PLACE;                              // 0x0068   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0069   (0x0003)  MISSED
	float                                              CAN_MOVE_TEST_DISTANCE;                                     // 0x006C   (0x0004)  
	float                                              SOUND_DIFFUSION_LEVEL_FACTOR;                               // 0x0070   (0x0004)  
	float                                              SOUND_DIFFUSION_MAX_DISTANCE_FACTOR;                        // 0x0074   (0x0004)  
	float                                              WEAPON_SHOOTING_MOVING_SCALE;                               // 0x0078   (0x0004)  
	unsigned char                                      UnknownData02_7[0x4];                                       // 0x007C   (0x0004)  MISSED
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_Move
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_Move : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Move.IsEnabledQuicklyTurnInPlace
	// bool IsEnabledQuicklyTurnInPlace();                                                                                      // [0x2de57c0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Move.GetYApproximation
	// float GetYApproximation();                                                                                               // [0x2de5760] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Move.GetWeaponShootingMovingScale
	// float GetWeaponShootingMovingScale();                                                                                    // [0x2de56f0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Move.GetSoundDiffusionMaxDistanceFactor
	// float GetSoundDiffusionMaxDistanceFactor();                                                                              // [0x2de5410] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Move.GetSoundDiffusionLevelFactor
	// float GetSoundDiffusionLevelFactor();                                                                                    // [0x2de53e0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Move.GetRotateAngleMinDeviation
	// float GetRotateAngleMinDeviation();                                                                                      // [0x2de5380] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Move.GetRotateAngleMaxDeviation
	// float GetRotateAngleMaxDeviation();                                                                                      // [0x2de5350] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Move.GetRotateAngleInterval
	// float GetRotateAngleInterval();                                                                                          // [0x2de5320] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Move.GetRecoverPointPerSecond
	// float GetRecoverPointPerSecond();                                                                                        // [0x2de5290] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Move.GetReachDist
	// float GetReachDist();                                                                                                    // [0x2de5200] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Move.GetMinRotateSpeed
	// float GetMinRotateSpeed();                                                                                               // [0x2de51d0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Move.GetMinRequiredTimeToSrpint
	// float GetMinRequiredTimeToSrpint();                                                                                      // [0x2de51a0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Move.GetMaxSprintDuration
	// float GetMaxSprintDuration();                                                                                            // [0x2de5110] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Move.GetMaxRotateAngle
	// float GetMaxRotateAngle();                                                                                               // [0x2de50e0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Move.GetMaxRequiredTimeToRecover
	// float GetMaxRequiredTimeToRecover();                                                                                     // [0x2de50b0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Move.GetEnabledUseRotateAngleLimit
	// bool GetEnabledUseRotateAngleLimit();                                                                                    // [0x2de4d70] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Move.GetCanMoveTestDistance
	// float GetCanMoveTestDistance();                                                                                          // [0x2de4c20] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Move.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFNPCAI.AIPropertyPlayerActionReactionProfile
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UAIPropertyPlayerActionReactionProfile : public UNPCAIPropertyProfile
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_PlayerActionReaction
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_PlayerActionReaction : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_PlayerActionReaction.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFNPCAI.AIPropertyRequestRunProfile
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UAIPropertyRequestRunProfile : public UNPCAIPropertyProfile
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_RequestRun
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_RequestRun : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_RequestRun.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFNPCAI.AIPropertyShootProfile
/// Size: 0x00B0 (176 bytes) (0x000038 - 0x0000E8) align 8 pad: 0x0000
class UAIPropertyShootProfile : public UNPCAIPropertyProfile
{ 
public:
	class UCurveFloat*                                 UA_Curve_ShootAccuracyByRecoil;                             // 0x0038   (0x0008)  
	float                                              RECOIL_TIME_NORMALIZE;                                      // 0x0040   (0x0004)  
	float                                              UA_MAX_RECOIL_TIME;                                         // 0x0044   (0x0004)  
	float                                              RECOIL_PER_METER;                                           // 0x0048   (0x0004)  
	float                                              MAX_RECOIL_PER_METER;                                       // 0x004C   (0x0004)  
	float                                              UA_SHOOT_POSITION_ZOFFSET;                                  // 0x0050   (0x0004)  
	FVector                                            UA_SHOOT_POSITION_OFFSET_STAND;                             // 0x0054   (0x000C)  
	FVector                                            UA_SHOOT_POSITION_OFFSET_STAND_LLEAN;                       // 0x0060   (0x000C)  
	FVector                                            UA_SHOOT_POSITION_OFFSET_STAND_RLEAN;                       // 0x006C   (0x000C)  
	FVector                                            UA_SHOOT_POSITION_OFFSET_CROUCH;                            // 0x0078   (0x000C)  
	FVector                                            UA_SHOOT_POSITION_OFFSET_CROUCH_LLEAN;                      // 0x0084   (0x000C)  
	FVector                                            UA_SHOOT_POSITION_OFFSET_CROUCH_RLEAN;                      // 0x0090   (0x000C)  
	FVector                                            UA_SHOOT_POSITION_OFFSET_PRONE;                             // 0x009C   (0x000C)  
	float                                              HORIZONT_RECOIL_COEF;                                       // 0x00A8   (0x0004)  
	int32_t                                            HORIZONT_RECOIL_STEP_SZIE_NUM;                              // 0x00AC   (0x0004)  
	bool                                               ENABLED_TRANSFTER_HIT_BETTER_PART;                          // 0x00B0   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x00B1   (0x0003)  MISSED
	int32_t                                            COUNT_IF_HIT_HEAD_TRANSFER_TO_OTHER;                        // 0x00B4   (0x0004)  
	int32_t                                            COUNT_IF_HIT_CHEST_TRANSFER_TO_OTHER;                       // 0x00B8   (0x0004)  
	float                                              INSTANT_BULLET_VAILD_DISTANCE;                              // 0x00BC   (0x0004)  
	float                                              TRY_LEAN_RAY_CHECK_DISTANCE;                                // 0x00C0   (0x0004)  
	float                                              TRY_LEAN_RAY_CHECK_DISTANCE_SQR;                            // 0x00C4   (0x0004)  
	float                                              STAND_SHOOT_Z_LOCATION;                                     // 0x00C8   (0x0004)  
	float                                              CROUCH_HEAD_TOP_Z_LOCATION;                                 // 0x00CC   (0x0004)  
	float                                              FACE_TO_TARGET_ANGLE_LIMIT_CAN_FIRE;                        // 0x00D0   (0x0004)  
	float                                              HIT_INTERVAL_RATE;                                          // 0x00D4   (0x0004)  
	int32_t                                            HIT_INTERVAL_INCREASE_BY_SHOOT;                             // 0x00D8   (0x0004)  
	int32_t                                            HIT_INTERVAL_COUNT_BASE;                                    // 0x00DC   (0x0004)  
	bool                                               ENABLED_HIT_INTERVAL_BY_GROUP;                              // 0x00E0   (0x0001)  
	unsigned char                                      UnknownData01_7[0x7];                                       // 0x00E1   (0x0007)  MISSED
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_Shoot
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_Shoot : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.SetHitIntervalRate
	// void SetHitIntervalRate(float Value);                                                                                    // [0x2de57f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.IsEnabledHitIntervalByGroup
	// bool IsEnabledHitIntervalByGroup();                                                                                      // [0x2de5790] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetUaShootPositionZOffset
	// float GetUaShootPositionZOffset();                                                                                       // [0x2de5660] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetUaShootPositionOffsetByPosture
	// FVector GetUaShootPositionOffsetByPosture(EAIPose PoseType, EAILeanType LeanType);                                       // [0x2de5570] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetUaShootPositionOffset
	// FVector GetUaShootPositionOffset();                                                                                      // [0x2de5530] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetUaMaxRecoilTime
	// float GetUaMaxRecoilTime();                                                                                              // [0x2de5500] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetUaCurveShootAccuracyByRecoil
	// class UCurveFloat* GetUaCurveShootAccuracyByRecoil();                                                                    // [0x2de54d0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetTryLeanRayCheckDistanceSqr
	// float GetTryLeanRayCheckDistanceSqr();                                                                                   // [0x2de54a0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetTryLeanRayCheckDistance
	// float GetTryLeanRayCheckDistance();                                                                                      // [0x2de5470] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetStandShootZLocation
	// float GetStandShootZLocation();                                                                                          // [0x2de5440] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetRecoilTimeNormalize
	// float GetRecoilTimeNormalize();                                                                                          // [0x2de5260] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetRecoilPerMeter
	// float GetRecoilPerMeter();                                                                                               // [0x2de5230] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetMaxRecoilPerMeter
	// float GetMaxRecoilPerMeter();                                                                                            // [0x2de5080] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetInstantBulletVaildDistance
	// float GetInstantBulletVaildDistance();                                                                                   // [0x2de5050] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetHorizontRecoilStepSizeNum
	// int32_t GetHorizontRecoilStepSizeNum();                                                                                  // [0x2de5020] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetHorizontRecoilCoef
	// float GetHorizontRecoilCoef();                                                                                           // [0x2de4ff0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetHitIntervalRate
	// float GetHitIntervalRate();                                                                                              // [0x2de4fc0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetHitIntervalIncreaseByShoot
	// int32_t GetHitIntervalIncreaseByShoot();                                                                                 // [0x2de4f90] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetHitIntervalCountBase
	// int32_t GetHitIntervalCountBase();                                                                                       // [0x2de4f60] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetFaceToTargetAngleLimitCanFire
	// float GetFaceToTargetAngleLimitCanFire();                                                                                // [0x2de4da0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetEnabledTransfterHitBetterPart
	// bool GetEnabledTransfterHitBetterPart();                                                                                 // [0x2de4d40] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetCrouchHeadTopZLocation
	// float GetCrouchHeadTopZLocation();                                                                                       // [0x2de4cb0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetCountIfHitHeadTransferToOther
	// int32_t GetCountIfHitHeadTransferToOther();                                                                              // [0x2de4c80] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetCountIfHitChestTransferToOther
	// int32_t GetCountIfHitChestTransferToOther();                                                                             // [0x2de4c50] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Shoot.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFNPCAI.AIPropertySmartProfile
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UAIPropertySmartProfile : public UNPCAIPropertyProfile
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_Smart
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_Smart : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Smart.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFNPCAI.AIPropertySoundProfile
/// Size: 0x0018 (24 bytes) (0x000038 - 0x000050) align 8 pad: 0x0000
class UAIPropertySoundProfile : public UNPCAIPropertyProfile
{ 
public:
	class UDataTable*                                  DataTableOfAI;                                              // 0x0038   (0x0008)  
	float                                              SelfYellCD;                                                 // 0x0040   (0x0004)  
	float                                              AreaYellCD;                                                 // 0x0044   (0x0004)  
	float                                              AIVoiceRadius;                                              // 0x0048   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x004C   (0x0004)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.AIPropertySoundProfile.GetDataTableOfAI
	// class UDataTable* GetDataTableOfAI();                                                                                    // [0x2de4ce0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_Sound
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_Sound : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Sound.GetSelfYellCD
	// float GetSelfYellCD();                                                                                                   // [0x2de53b0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Sound.GetDataTableOfAI
	// class UDataTable* GetDataTableOfAI();                                                                                    // [0x2de4d10] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Sound.GetAreaYellCD
	// float GetAreaYellCD();                                                                                                   // [0x2de4bf0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Sound.GetAIVoiceRadius
	// float GetAIVoiceRadius();                                                                                                // [0x2de4bc0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Sound.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFNPCAI.AIPropertyStrategyProfile
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UAIPropertyStrategyProfile : public UNPCAIPropertyProfile
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_Strategy
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_Strategy : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Strategy.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFNPCAI.AIPropertyTacticProfile
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UAIPropertyTacticProfile : public UNPCAIPropertyProfile
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_Tactic
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_Tactic : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Tactic.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFNPCAI.AIPropertyWeaponProfile
/// Size: 0x0070 (112 bytes) (0x000038 - 0x0000A8) align 8 pad: 0x0000
class UAIPropertyWeaponProfile : public UNPCAIPropertyProfile
{ 
public:
	float                                              WeaponBaseSpread;                                           // 0x0038   (0x0004)  
	float                                              WeaponBaseRecoil;                                           // 0x003C   (0x0004)  
	float                                              ReloadMinPercentage;                                        // 0x0040   (0x0004)  
	float                                              ReloadMaxPercentage;                                        // 0x0044   (0x0004)  
	float                                              MinFillBulletTime;                                          // 0x0048   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x004C   (0x0004)  MISSED
	int64_t                                            MeleeWeaponID;                                              // 0x0050   (0x0008)  
	FName                                              WeaponTorrBodyBoneName;                                     // 0x0058   (0x0008)  
	FVector                                            GunShieldPositionOffset_Stand;                              // 0x0060   (0x000C)  
	FVector                                            GunShieldPositionOffset_Crouch;                             // 0x006C   (0x000C)  
	FVector                                            GunShieldPositionOffset_Prone;                              // 0x0078   (0x000C)  
	FVector                                            GunShieldPositionOffset_LeftLean;                           // 0x0084   (0x000C)  
	FVector                                            GunShieldPositionOffset_RightLean;                          // 0x0090   (0x000C)  
	float                                              GunShieldSphereRadius;                                      // 0x009C   (0x0004)  
	float                                              GunShieldDistFromBody;                                      // 0x00A0   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x00A4   (0x0004)  MISSED
};

/// Class /Script/MFNPCAI.NPCAIPropertyComponent_Weapon
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UNPCAIPropertyComponent_Weapon : public UNPCAIPropertyComponent
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Weapon.GetWeaponTorrBodyBoneName
	// FName GetWeaponTorrBodyBoneName();                                                                                       // [0x2de5720] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Weapon.GetWeaponBaseSpread
	// float GetWeaponBaseSpread();                                                                                             // [0x2de56c0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Weapon.GetWeaponBaseRecoil
	// float GetWeaponBaseRecoil();                                                                                             // [0x2de5690] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Weapon.GetReloadMinPercentage
	// float GetReloadMinPercentage();                                                                                          // [0x2de52f0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Weapon.GetReloadMaxPercentage
	// float GetReloadMaxPercentage();                                                                                          // [0x2de52c0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Weapon.GetMinFillBulletTime
	// float GetMinFillBulletTime();                                                                                            // [0x2de5170] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Weapon.GetMeleeWeaponID
	// int64_t GetMeleeWeaponID();                                                                                              // [0x2de5140] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Weapon.GetGunShieldSphereRadius
	// float GetGunShieldSphereRadius();                                                                                        // [0x2de4f30] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Weapon.GetGunShieldPositionOffset
	// FVector GetGunShieldPositionOffset(class ACharacter* Character, EAIPose AIPose, EAILeanType AILeanType);                 // [0x2de4e00] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Weapon.GetGunShieldDistFromBody
	// float GetGunShieldDistFromBody();                                                                                        // [0x2de4dd0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAIPropertyComponent_Weapon.GetAIProfileType
	// EAIProfileType GetAIProfileType();                                                                                       // [0xfa3a40] Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFNPCAI.NPCAIQueryRoundEnvironmentAsyncTask
/// Size: 0x0038 (56 bytes) (0x000040 - 0x000078) align 8 pad: 0x0000
class UNPCAIQueryRoundEnvironmentAsyncTask : public UNPCAIAsyncTaskBase
{ 
public:
	SDK_UNDEFINED(16,633) /* FMulticastInlineDelegate */ __um(OnSuccess);                                          // 0x0040   (0x0010)  
	SDK_UNDEFINED(16,634) /* FMulticastInlineDelegate */ __um(OnFail);                                             // 0x0050   (0x0010)  
	FVector                                            EnemyLocation;                                              // 0x0060   (0x000C)  
	float                                              LRDistance;                                                 // 0x006C   (0x0004)  
	float                                              FBDistance;                                                 // 0x0070   (0x0004)  
	bool                                               bCheckLRDefense;                                            // 0x0074   (0x0001)  
	bool                                               bCheckLRAttack;                                             // 0x0075   (0x0001)  
	unsigned char                                      UnknownData00_7[0x2];                                       // 0x0076   (0x0002)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIQueryRoundEnvironmentAsyncTask.ExecuteTask
	// void ExecuteTask();                                                                                                      // [0x198b080] Native|Public        
	// Function /Script/MFNPCAI.NPCAIQueryRoundEnvironmentAsyncTask.CheckCanUseMemoryData
	// bool CheckCanUseMemoryData(class AActor* Pawn, FVector& EnemyLocation, FNPCAIQueryRoundEnvironmentResult& OutResult);    // [0x2de86c0] Native|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIQueryRoundEnvironmentAsyncTask.AIQueryRoundEnvironment
	// class UNPCAIQueryRoundEnvironmentAsyncTask* AIQueryRoundEnvironment(class AActor* Pawn, class AActor* EnemyPawn, float LRDistance, float FBDistance, bool bCheckLRDefense, bool bCheckLRAttack); // [0x2de84f0] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIRecastNavMesh
/// Size: 0x0010 (16 bytes) (0x000598 - 0x0005A8) align 8 pad: 0x0000
class ANPCAIRecastNavMesh : public ARecastNavMesh
{ 
public:
	class ANPCAIHNavActor*                             HNavActor;                                                  // 0x0598   (0x0008)  
	unsigned char                                      UnknownData00_7[0x8];                                       // 0x05A0   (0x0008)  MISSED
};

/// Class /Script/MFNPCAI.NPCAIRecoilInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAIRecoilInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIRecoilInterface.UpdatePressureWeaponPower
	// void UpdatePressureWeaponPower(float HitRate, bool bNextHit);                                                            // [0x2de9110] Native|Public        
	// Function /Script/MFNPCAI.NPCAIRecoilInterface.SetExactAimingPoint
	// void SetExactAimingPoint(FVector& AimingPoint, float TurnTime);                                                          // [0x2de8fb0] Native|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIRecoilInterface.SetEnabledAIRecoilControl
	// void SetEnabledAIRecoilControl(bool Enabled);                                                                            // [0x2de8f20] Native|Public        
	// Function /Script/MFNPCAI.NPCAIRecoilInterface.SetDimAimingPoint
	// void SetDimAimingPoint(FVector& DimAimingPoint, float TurnTime);                                                         // [0x2de8e40] Native|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIRecoilInterface.Recoil
	// float Recoil(int32_t CurrentShotCount);                                                                                  // [0x2de8990] Native|Public        
	// Function /Script/MFNPCAI.NPCAIRecoilInterface.LosingRecoil
	// void LosingRecoil(float DeltaTime);                                                                                      // [0x2de8910] Native|Public        
	// Function /Script/MFNPCAI.NPCAIRecoilInterface.IsInPressureWeapon
	// bool IsInPressureWeapon();                                                                                               // [0x2de88e0] Native|Public        
	// Function /Script/MFNPCAI.NPCAIRecoilInterface.GetRecoilOffset
	// FVector GetRecoilOffset();                                                                                               // [0x2a20d00] Native|Public|HasDefaults|Const 
};

/// Class /Script/MFNPCAI.NPCAIRLAgentComponentInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAIRLAgentComponentInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIRLAgentComponentInterface.TestChangeRLMode
	// void TestChangeRLMode(char TragetRLMode);                                                                                // [0x2de9090] Native|Public        
	// Function /Script/MFNPCAI.NPCAIRLAgentComponentInterface.IsAIRLActionReload
	// bool IsAIRLActionReload();                                                                                               // [0x29cc100] Native|Public        
};

/// Class /Script/MFNPCAI.NPCAIRoleComponent
/// Size: 0x0010 (16 bytes) (0x000108 - 0x000118) align 8 pad: 0x0000
class UNPCAIRoleComponent : public UNPCAIActorComponent
{ 
public:
	TArray<class UNPCAIModifierProfile*>               PropertyProfiles;                                           // 0x0108   (0x0010)  
};

/// Class /Script/MFNPCAI.NPCAIRoleModifierComponent
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAIRoleModifierComponent : public UObject
{ 
public:
};

/// Struct /Script/MFNPCAI.NPCAIComingExplosionEvent
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 8 pad: 0x0000
struct FNPCAIComingExplosionEvent
{ 
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0000   (0x0004)  MISSED
	FVector                                            ExplosionLocation;                                          // 0x0004   (0x000C)  
	float                                              Damage;                                                     // 0x0010   (0x0004)  
	float                                              MaxRange;                                                   // 0x0014   (0x0004)  
	class AActor*                                      Instigator;                                                 // 0x0018   (0x0008)  
	FName                                              Tag;                                                        // 0x0020   (0x0008)  
	unsigned char                                      UnknownData01_7[0x8];                                       // 0x0028   (0x0008)  MISSED
};

/// Class /Script/MFNPCAI.NPCAISense_ComingExplosion
/// Size: 0x0068 (104 bytes) (0x000080 - 0x0000E8) align 8 pad: 0x0000
class UNPCAISense_ComingExplosion : public UAISense
{ 
public:
	TArray<FNPCAIComingExplosionEvent>                 ExplosionEvents;                                            // 0x0080   (0x0010)  
	unsigned char                                      UnknownData00_7[0x58];                                      // 0x0090   (0x0058)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAISense_ComingExplosion.ReportComingExplosionEvent
	// void ReportComingExplosionEvent(class UObject* WorldContextObject, FVector NoiseLocation, float Damage, class AActor* Instigator, float MaxRange, FName Tag); // [0x2de8a30] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
};

/// Struct /Script/MFNPCAI.NPCAIDamageEvent
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
struct FNPCAIDamageEvent : FAIDamageEvent
{ 
};

/// Class /Script/MFNPCAI.NPCAISense_Damage
/// Size: 0x0010 (16 bytes) (0x000080 - 0x000090) align 8 pad: 0x0000
class UNPCAISense_Damage : public UAISense
{ 
public:
	TArray<FNPCAIDamageEvent>                          RegisteredEvents;                                           // 0x0080   (0x0010)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAISense_Damage.ReportDamageEvent
	// void ReportDamageEvent(class UObject* WorldContextObject, class AActor* DamagedActor, class AActor* Instigator, float DamageAmount, FVector EventLocation, FVector HitLocation, FName Tag); // [0x2de8c10] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISense_Damage.IsDamageStimulus
	// bool IsDamageStimulus(FAIStimulus& Stimulus);                                                                            // [0x2de8800] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAISense_Hearing
/// Size: 0x0058 (88 bytes) (0x0000E8 - 0x000140) align 8 pad: 0x0000
class UNPCAISense_Hearing : public UAISense_Hearing
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x00E8   (0x0008)  MISSED
	SDK_UNDEFINED(80,635) /* TMap<AActor*, FAINoiseMakerInfo> */ __um(NoiseMakerMap);                              // 0x00F0   (0x0050)  
};

/// Class /Script/MFNPCAI.NPCAISense_Sight
/// Size: 0x0028 (40 bytes) (0x000170 - 0x000198) align 8 pad: 0x0000
class UNPCAISense_Sight : public UAISense_Sight
{ 
public:
	unsigned char                                      UnknownData00_1[0x28];                                      // 0x0170   (0x0028)  MISSED
};

/// Class /Script/MFNPCAI.NPCAISenseConfig_ComingExplosion
/// Size: 0x0010 (16 bytes) (0x000048 - 0x000058) align 8 pad: 0x0000
class UNPCAISenseConfig_ComingExplosion : public UAISenseConfig
{ 
public:
	class UClass*                                      Implementation;                                             // 0x0048   (0x0008)  
	float                                              AwareRange;                                                 // 0x0050   (0x0004)  
	FAISenseAffiliationFilter                          DetectionByAffiliation;                                     // 0x0054   (0x0004)  
};

/// Class /Script/MFNPCAI.NPCAISenseConfig_Damage
/// Size: 0x0008 (8 bytes) (0x000048 - 0x000050) align 8 pad: 0x0000
class UNPCAISenseConfig_Damage : public UAISenseConfig
{ 
public:
	class UClass*                                      Implementation;                                             // 0x0048   (0x0008)  
};

/// Class /Script/MFNPCAI.NPCAISenseConfig_Hearing
/// Size: 0x0008 (8 bytes) (0x000060 - 0x000068) align 8 pad: 0x0000
class UNPCAISenseConfig_Hearing : public UAISenseConfig_Hearing
{ 
public:
	bool                                               IsDebugHearingScope;                                        // 0x0060   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0061   (0x0007)  MISSED
};

/// Class /Script/MFNPCAI.NPCAISenseConfig_Sight
/// Size: 0x0008 (8 bytes) (0x000070 - 0x000078) align 8 pad: 0x0000
class UNPCAISenseConfig_Sight : public UAISenseConfig_Sight
{ 
public:
	ENPCAISenseChannel                                 AISightUseChannel;                                          // 0x0070   (0x0001)  
	ENPCAISenseChannel                                 WeaponUseChannel;                                           // 0x0071   (0x0001)  
	unsigned char                                      UnknownData00_7[0x6];                                       // 0x0072   (0x0006)  MISSED
};

/// Class /Script/MFNPCAI.NPCAISenseEvent_ComingExplosion
/// Size: 0x0030 (48 bytes) (0x000028 - 0x000058) align 8 pad: 0x0000
class UNPCAISenseEvent_ComingExplosion : public UAISenseEvent
{ 
public:
	FNPCAIComingExplosionEvent                         Event;                                                      // 0x0028   (0x0030)  
};

/// Class /Script/MFNPCAI.NPCAISenseEvent_Damage
/// Size: 0x0038 (56 bytes) (0x000028 - 0x000060) align 8 pad: 0x0000
class UNPCAISenseEvent_Damage : public UAISenseEvent
{ 
public:
	FNPCAIDamageEvent                                  Event;                                                      // 0x0028   (0x0038)  
};

/// Class /Script/MFNPCAI.NPCAISenseSourceInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAISenseSourceInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAISenseSourceInterface.GetAISenseSourceType
	// EAISenseSourceType GetAISenseSourceType();                                                                               // [0x288bc90] Native|Public        
};

/// Struct /Script/MFNPCAI.AimingSettings
/// Size: 0x00D0 (208 bytes) (0x000000 - 0x0000D0) align 4 pad: 0x0000
struct FAimingSettings
{ 
	float                                              MAX_AIM_PRECICING;                                          // 0x0000   (0x0004)  
	float                                              BETTER_PRECICING_COEF;                                      // 0x0004   (0x0004)  
	float                                              RECLC_Y_DIST;                                               // 0x0008   (0x0004)  
	float                                              RECALC_DIST;                                                // 0x000C   (0x0004)  
	float                                              RECALC_SQR_DIST;                                            // 0x0010   (0x0004)  
	float                                              COEF_FROM_COVER;                                            // 0x0014   (0x0004)  
	float                                              PANIC_COEF;                                                 // 0x0018   (0x0004)  
	float                                              PANIC_ACCURATY_COEF;                                        // 0x001C   (0x0004)  
	float                                              HARD_AIM;                                                   // 0x0020   (0x0004)  
	float                                              PANIC_TIME;                                                 // 0x0024   (0x0004)  
	float                                              SHOOT_TO_CHANGE_RND_PART_DELTA;                             // 0x0028   (0x0004)  
	float                                              ANY_PART_SHOOT_TIME;                                        // 0x002C   (0x0004)  
	int32_t                                            RECALC_MUST_TIME_MIN;                                       // 0x0030   (0x0004)  
	int32_t                                            RECALC_MUST_TIME_MAX;                                       // 0x0034   (0x0004)  
	float                                              DAMAGE_PANIC_TIME;                                          // 0x0038   (0x0004)  
	float                                              DANGER_UP_POINT;                                            // 0x003C   (0x0004)  
	float                                              MAX_AIMING_UPGRADE_BY_TIME;                                 // 0x0040   (0x0004)  
	float                                              DAMAGE_TO_DISCARD_AIM_0;                                    // 0x0044   (0x0004)  
	float                                              MIN_TIME_DISCARD_AIM_SEC;                                   // 0x0048   (0x0004)  
	float                                              MAX_TIME_DISCARD_AIM_SEC;                                   // 0x004C   (0x0004)  
	float                                              XZ_COEF;                                                    // 0x0050   (0x0004)  
	float                                              XZ_COEF_STATIONARY_BULLET;                                  // 0x0054   (0x0004)  
	float                                              XZ_COEF_STATIONARY_GRENADE;                                 // 0x0058   (0x0004)  
	float                                              BOTTOM_COEF;                                                // 0x005C   (0x0004)  
	float                                              FIRST_CONTACT_ADD_SEC;                                      // 0x0060   (0x0004)  
	float                                              FIRST_CONTACT_ADD_CHANCE;                                   // 0x0064   (0x0004)  
	float                                              BASE_HIT_AFFECTION_DELAY_SEC;                               // 0x0068   (0x0004)  
	float                                              BASE_HIT_AFFECTION_MIN_ANG;                                 // 0x006C   (0x0004)  
	float                                              BASE_HIT_AFFECTION_MAX_ANG;                                 // 0x0070   (0x0004)  
	float                                              BASE_SHIEF;                                                 // 0x0074   (0x0004)  
	float                                              BASE_SHIEF_STATIONARY_BULLET;                               // 0x0078   (0x0004)  
	float                                              BASE_SHIEF_STATIONARY_GRENADE;                              // 0x007C   (0x0004)  
	float                                              SCATTERING_DIST_MODIF;                                      // 0x0080   (0x0004)  
	float                                              SCATTERING_DIST_MODIF_CLOSE;                                // 0x0084   (0x0004)  
	int32_t                                            AIMING_TYPE;                                                // 0x0088   (0x0004)  
	float                                              DIST_TO_SHOOT_TO_CENTER;                                    // 0x008C   (0x0004)  
	float                                              DIST_TO_SHOOT_NO_OFFSET;                                    // 0x0090   (0x0004)  
	float                                              SHPERE_FRIENDY_FIRE_SIZE;                                   // 0x0094   (0x0004)  
	float                                              COEF_IF_MOVE;                                               // 0x0098   (0x0004)  
	float                                              TIME_COEF_IF_MOVE;                                          // 0x009C   (0x0004)  
	float                                              BOT_MOVE_IF_DELTA;                                          // 0x00A0   (0x0004)  
	float                                              NEXT_SHOT_MISS_CHANCE;                                      // 0x00A4   (0x0004)  
	float                                              NEXT_SHOT_MISS_Y_OFFSET;                                    // 0x00A8   (0x0004)  
	float                                              ANYTIME_LIGHT_WHEN_AIM;                                     // 0x00AC   (0x0004)  
	float                                              WEAPON_ROOT_OFFSET;                                         // 0x00B0   (0x0004)  
	float                                              MIN_DAMAGE_TO_GET_HIT_AFFETS;                               // 0x00B4   (0x0004)  
	float                                              MAX_AIM_TIME;                                               // 0x00B8   (0x0004)  
	float                                              OFFSET_RECAL_ANYWAY_TIME;                                   // 0x00BC   (0x0004)  
	float                                              Y_TOP_OFFSET_COEF;                                          // 0x00C0   (0x0004)  
	float                                              Y_BOTTOM_OFFSET_COEF;                                       // 0x00C4   (0x0004)  
	float                                              STATIONARY_LEAVE_HALF_DEGREE;                               // 0x00C8   (0x0004)  
	float                                              START_TIME_COEF;                                            // 0x00CC   (0x0004)  
};

/// Struct /Script/MFNPCAI.BossSettings
/// Size: 0x0118 (280 bytes) (0x000000 - 0x000118) align 8 pad: 0x0000
struct FBossSettings
{ 
	bool                                               BOSS_SHALL_WARNING_PLAYER;                                  // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	float                                              BOSS_DIST_TO_WARNING;                                       // 0x0004   (0x0004)  
	float                                              BOSS_DIST_TO_SHOOT;                                         // 0x0008   (0x0004)  
	float                                              BOSS_DIST_TO_WARNING_OUT;                                   // 0x000C   (0x0004)  
	float                                              CHANCE_TO_SEND_GRENADE;                                     // 0x0010   (0x0004)  
	float                                              MAX_DIST_COVER_BOSS;                                        // 0x0014   (0x0004)  
	float                                              MAX_DIST_COVER_BOSS_SQRT;                                   // 0x0018   (0x0004)  
	float                                              MAX_DIST_DECIDER_TO_SEND;                                   // 0x001C   (0x0004)  
	float                                              MAX_DIST_DECIDER_TO_SEND_SQRT;                              // 0x0020   (0x0004)  
	float                                              TIME_AFTER_LOSE;                                            // 0x0024   (0x0004)  
	float                                              TIME_AFTER_LOSE_DELTA;                                      // 0x0028   (0x0004)  
	int32_t                                            PERSONS_SEND;                                               // 0x002C   (0x0004)  
	float                                              DELTA_SEARCH_TIME;                                          // 0x0030   (0x0004)  
	bool                                               COVER_TO_SEND;                                              // 0x0034   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0035   (0x0003)  MISSED
	float                                              WAIT_NO_ATTACK_SAVAGE;                                      // 0x0038   (0x0004)  
	float                                              CHANCE_USE_RESERVE_PATROL;                                  // 0x003C   (0x0004)  
	float                                              KILLA_Y_DELTA_TO_BE_ENEMY_BOSS;                             // 0x0040   (0x0004)  
	float                                              KILLA_DITANCE_TO_BE_ENEMY_BOSS;                             // 0x0044   (0x0004)  
	float                                              KILLA_START_SEARCH_SEC;                                     // 0x0048   (0x0004)  
	float                                              KILLA_CONTUTION_TIME;                                       // 0x004C   (0x0004)  
	float                                              KILLA_CLOSE_ATTACK_DIST;                                    // 0x0050   (0x0004)  
	float                                              KILLA_MIDDLE_ATTACK_DIST;                                   // 0x0054   (0x0004)  
	float                                              KILLA_LARGE_ATTACK_DIST;                                    // 0x0058   (0x0004)  
	float                                              KILLA_SEARCH_METERS;                                        // 0x005C   (0x0004)  
	float                                              KILLA_DEF_DIST_SQRT;                                        // 0x0060   (0x0004)  
	float                                              KILLA_SEARCH_SEC_STOP_AFTER_COMING;                         // 0x0064   (0x0004)  
	float                                              KILLA_DIST_TO_GO_TO_SUPPRESS;                               // 0x0068   (0x0004)  
	float                                              KILLA_AFTER_GRENADE_SUPPRESS_DELAY;                         // 0x006C   (0x0004)  
	int32_t                                            KILLA_CLOSEATTACK_TIMES;                                    // 0x0070   (0x0004)  
	float                                              KILLA_CLOSEATTACK_DELAY;                                    // 0x0074   (0x0004)  
	float                                              KILLA_HOLD_DELAY;                                           // 0x0078   (0x0004)  
	int32_t                                            KILLA_BULLET_TO_RELOAD;                                     // 0x007C   (0x0004)  
	int32_t                                            KILLA_ENEMIES_TO_ATTACK;                                    // 0x0080   (0x0004)  
	float                                              KILLA_ONE_IS_CLOSE;                                         // 0x0084   (0x0004)  
	float                                              KILLA_TRIGGER_DOWN_DELAY;                                   // 0x0088   (0x0004)  
	float                                              KILLA_WAIT_IN_COVER_COEF;                                   // 0x008C   (0x0004)  
	float                                              KOJANIY_DIST_WHEN_READY;                                    // 0x0090   (0x0004)  
	float                                              KOJANIY_DIST_TO_BE_ENEMY;                                   // 0x0094   (0x0004)  
	float                                              KOJANIY_MIN_DIST_TO_LOOT;                                   // 0x0098   (0x0004)  
	float                                              KOJANIY_MIN_DIST_TO_LOOT_SQRT;                              // 0x009C   (0x0004)  
	float                                              KOJANIY_DIST_ENEMY_TOO_CLOSE;                               // 0x00A0   (0x0004)  
	float                                              KOJANIY_MANY_ENEMIES_COEF;                                  // 0x00A4   (0x0004)  
	bool                                               KOJANIY_FIGHT_CENTER_POS_ME;                                // 0x00A8   (0x0001)  
	unsigned char                                      UnknownData02_6[0x3];                                       // 0x00A9   (0x0003)  MISSED
	float                                              KOJANIY_DIST_CORE_SPOS_RECALC;                              // 0x00AC   (0x0004)  
	float                                              KOJANIY_DIST_CORE_SPOS_RECALC_SQRT;                         // 0x00B0   (0x0004)  
	float                                              KOJANIY_START_SUPPERS_SHOOTS_SEC;                           // 0x00B4   (0x0004)  
	float                                              KOJANIY_START_NEXT_SUPPERS_SHOOTS_SEC;                      // 0x00B8   (0x0004)  
	int32_t                                            KOJANIY_SAFE_ENEMIES;                                       // 0x00BC   (0x0004)  
	float                                              KOJANIY_TAKE_CARE_ABOULT_ENEMY_DELTA;                       // 0x00C0   (0x0004)  
	float                                              KOJANIY_WANNA_GO_TO_CLOSEST_COVER;                          // 0x00C4   (0x0004)  
	FString                                            GLUHAR_FOLLOWER_PATH_NAME;                                  // 0x00C8   (0x0010)  
	float                                              GLUHAR_FOLLOWER_SCOUT_DIST_START_ATTACK;                    // 0x00D8   (0x0004)  
	float                                              GLUHAR_FOLLOWER_SCOUT_DIST_END_ATTACK;                      // 0x00DC   (0x0004)  
	float                                              GLUHAR_BOSS_WANNA_ATTACK_CHANCE_0;                          // 0x00E0   (0x0004)  
	float                                              GLUHAR_ASSAULT_ATTACK_DIST;                                 // 0x00E4   (0x0004)  
	float                                              GLUHAR_STOP_ASSAULT_ATTACK_DIST;                            // 0x00E8   (0x0004)  
	float                                              GLUHAR_TIME_TO_ASSAULT;                                     // 0x00EC   (0x0004)  
	float                                              DIST_TO_PROTECT_BOSS;                                       // 0x00F0   (0x0004)  
	float                                              GLUHAR_SEC_TO_REINFORSMENTS;                                // 0x00F4   (0x0004)  
	bool                                               GLUHAR_REINFORSMENTS_BY_EXIT;                               // 0x00F8   (0x0001)  
	bool                                               GLUHAR_REINFORSMENTS_BY_EVENT;                              // 0x00F9   (0x0001)  
	bool                                               GLUHAR_REINFORSMENTS_BY_PLAYER_COME_TO_ZONE;                // 0x00FA   (0x0001)  
	unsigned char                                      UnknownData03_6[0x1];                                       // 0x00FB   (0x0001)  MISSED
	int32_t                                            GLUHAR_FOLLOWERS_TO_REINFORSMENTS;                          // 0x00FC   (0x0004)  
	int32_t                                            GLUHAR_FOLLOWERS_SECURITY;                                  // 0x0100   (0x0004)  
	int32_t                                            GLUHAR_FOLLOWERS_ASSAULT;                                   // 0x0104   (0x0004)  
	int32_t                                            GLUHAR_FOLLOWERS_SCOUT;                                     // 0x0108   (0x0004)  
	int32_t                                            GLUHAR_FOLLOWERS_SNIPE;                                     // 0x010C   (0x0004)  
	float                                              GLUHAR_BOSS_DIST_TO_ENEMY_WANT_KILL;                        // 0x0110   (0x0004)  
	float                                              IF_I_HITTED_GO_AWAY_SEC_HIT;                                // 0x0114   (0x0004)  
};

/// Struct /Script/MFNPCAI.ChangeSettings
/// Size: 0x003C (60 bytes) (0x000000 - 0x00003C) align 4 pad: 0x0000
struct FChangeSettings
{ 
	float                                              SMOKE_VISION_DIST;                                          // 0x0000   (0x0004)  
	float                                              SMOKE_GAIN_SIGHT;                                           // 0x0004   (0x0004)  
	float                                              SMOKE_SCATTERING;                                           // 0x0008   (0x0004)  
	float                                              SMOKE_PRECICING;                                            // 0x000C   (0x0004)  
	float                                              SMOKE_HEARING;                                              // 0x0010   (0x0004)  
	float                                              SMOKE_ACCURATY;                                             // 0x0014   (0x0004)  
	float                                              SMOKE_LAY_CHANCE;                                           // 0x0018   (0x0004)  
	float                                              FLASH_VISION_DIST;                                          // 0x001C   (0x0004)  
	float                                              FLASH_GAIN_SIGHT;                                           // 0x0020   (0x0004)  
	float                                              FLASH_SCATTERING;                                           // 0x0024   (0x0004)  
	float                                              FLASH_PRECICING;                                            // 0x0028   (0x0004)  
	float                                              FLASH_HEARING;                                              // 0x002C   (0x0004)  
	float                                              FLASH_ACCURATY;                                             // 0x0030   (0x0004)  
	float                                              FLASH_LAY_CHANCE;                                           // 0x0034   (0x0004)  
	float                                              STUN_HEARING;                                               // 0x0038   (0x0004)  
};

/// Struct /Script/MFNPCAI.CoreSettings
/// Size: 0x002C (44 bytes) (0x000000 - 0x00002C) align 4 pad: 0x0000
struct FCoreSettings
{ 
	float                                              GainSightCoef;                                              // 0x0000   (0x0004)  
	float                                              ScatteringPerMeter;                                         // 0x0004   (0x0004)  
	float                                              ScatteringClosePerMeter;                                    // 0x0008   (0x0004)  
	float                                              DamageCoeff;                                                // 0x000C   (0x0004)  
	float                                              HearingSense;                                               // 0x0010   (0x0004)  
	bool                                               CanRun;                                                     // 0x0014   (0x0001)  
	bool                                               CanGrenade;                                                 // 0x0015   (0x0001)  
	EAimingType                                        AimingType;                                                 // 0x0016   (0x0001)  
	unsigned char                                      UnknownData00_6[0x1];                                       // 0x0017   (0x0001)  MISSED
	float                                              PistolFireDistancePref;                                     // 0x0018   (0x0004)  
	float                                              ShotgunFireDistancePref;                                    // 0x001C   (0x0004)  
	float                                              RifleFireDistancePref;                                      // 0x0020   (0x0004)  
	float                                              AccuratySpeed;                                              // 0x0024   (0x0004)  
	float                                              WaitInCoverBetweenShotsSec;                                 // 0x0028   (0x0004)  
};

/// Struct /Script/MFNPCAI.CoverSettings
/// Size: 0x00C8 (200 bytes) (0x000000 - 0x0000C8) align 4 pad: 0x0000
struct FCoverSettings
{ 
	float                                              RETURN_TO_ATTACK_AFTER_AMBUSH_MIN;                          // 0x0000   (0x0004)  
	float                                              RETURN_TO_ATTACK_AFTER_AMBUSH_MAX;                          // 0x0004   (0x0004)  
	float                                              SOUND_TO_GET_SPOTTED;                                       // 0x0008   (0x0004)  
	float                                              TIME_TO_MOVE_TO_COVER;                                      // 0x000C   (0x0004)  
	float                                              MAX_DIST_OF_COVER;                                          // 0x0010   (0x0004)  
	float                                              CHANGE_RUN_TO_COVER_SEC;                                    // 0x0014   (0x0004)  
	float                                              CHANGE_RUN_TO_COVER_SEC_GREANDE;                            // 0x0018   (0x0004)  
	float                                              DIST_CANT_CHANGE_WAY;                                       // 0x001C   (0x0004)  
	float                                              DIST_CHECK_SFETY;                                           // 0x0020   (0x0004)  
	float                                              TIME_CHECK_SAFE;                                            // 0x0024   (0x0004)  
	float                                              HIDE_TO_COVER_TIME;                                         // 0x0028   (0x0004)  
	float                                              MAX_DIST_OF_COVER_SQR;                                      // 0x002C   (0x0004)  
	float                                              DIST_CANT_CHANGE_WAY_SQR;                                   // 0x0030   (0x0004)  
	float                                              SPOTTED_COVERS_RADIUS;                                      // 0x0034   (0x0004)  
	float                                              LOOK_LAST_ENEMY_POS_HOLDING;                                // 0x0038   (0x0004)  
	float                                              LOOK_LAST_ENEMY_POS_MOVING;                                 // 0x003C   (0x0004)  
	float                                              LOOK_LAST_ENEMY_POS_LOOKAROUND;                             // 0x0040   (0x0004)  
	int32_t                                            OFFSET_LOOK_ALONG_WALL_ANG;                                 // 0x0044   (0x0004)  
	float                                              SPOTTED_GRENADE_RADIUS;                                     // 0x0048   (0x0004)  
	float                                              MAX_SPOTTED_TIME_SEC;                                       // 0x004C   (0x0004)  
	float                                              WAIT_INT_COVER_FINDING_ENEMY;                               // 0x0050   (0x0004)  
	float                                              CLOSE_DIST_POINT_SQRT;                                      // 0x0054   (0x0004)  
	float                                              DELTA_SEEN_FROM_COVE_LAST_POS;                              // 0x0058   (0x0004)  
	bool                                               MOVE_TO_COVER_WHEN_TARGET;                                  // 0x005C   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x005D   (0x0003)  MISSED
	float                                              SPOTTED_GRENADE_TIME;                                       // 0x0060   (0x0004)  
	bool                                               DEPENDS_Y_DIST_TO_BOT;                                      // 0x0064   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0065   (0x0003)  MISSED
	float                                              RUN_IF_FAR;                                                 // 0x0068   (0x0004)  
	float                                              RUN_IF_FAR_SQRT;                                            // 0x006C   (0x0004)  
	float                                              STAY_IF_FAR;                                                // 0x0070   (0x0004)  
	float                                              STAY_IF_FAR_SQRT;                                           // 0x0074   (0x0004)  
	bool                                               CHECK_COVER_ENEMY_LOOK;                                     // 0x0078   (0x0001)  
	unsigned char                                      UnknownData02_6[0x3];                                       // 0x0079   (0x0003)  MISSED
	int32_t                                            SHOOT_NEAR_TO_LEAVE;                                        // 0x007C   (0x0004)  
	float                                              SHOOT_NEAR_SEC_PERIOD;                                      // 0x0080   (0x0004)  
	int32_t                                            HITS_TO_LEAVE_COVER;                                        // 0x0084   (0x0004)  
	float                                              DOG_FIGHT_AFTER_LEAVE;                                      // 0x0088   (0x0004)  
	float                                              MIN_DEFENCE_LEVEL;                                          // 0x008C   (0x0004)  
	bool                                               REWORK_NOT_TO_SHOOT;                                        // 0x0090   (0x0001)  
	bool                                               DELETE_POINTS_BEHIND_ENEMIES;                               // 0x0091   (0x0001)  
	unsigned char                                      UnknownData03_6[0x2];                                       // 0x0092   (0x0002)  MISSED
	float                                              GOOD_DIST_TO_POINT_COEF;                                    // 0x0094   (0x0004)  
	float                                              ENEMY_DIST_TO_GO_OUT;                                       // 0x0098   (0x0004)  
	bool                                               CHECK_CLOSEST_FRIEND;                                       // 0x009C   (0x0001)  
	unsigned char                                      UnknownData04_6[0x3];                                       // 0x009D   (0x0003)  MISSED
	float                                              MIN_TO_ENEMY_TO_BE_NOT_SAFE_SQRT;                           // 0x00A0   (0x0004)  
	float                                              MIN_TO_ENEMY_TO_BE_NOT_SAFE;                                // 0x00A4   (0x0004)  
	bool                                               CAN_LOOK_OUT_WHEN_HOLDING;                                  // 0x00A8   (0x0001)  
	bool                                               SIT_DOWN_WHEN_HOLDING;                                      // 0x00A9   (0x0001)  
	unsigned char                                      UnknownData05_6[0x2];                                       // 0x00AA   (0x0002)  MISSED
	float                                              STATIONARY_WEAPON_NO_ENEMY_GETUP;                           // 0x00AC   (0x0004)  
	float                                              STATIONARY_WEAPON_MAX_DIST_TO_USE;                          // 0x00B0   (0x0004)  
	int32_t                                            STATIONARY_SPOTTED_TIMES_TO_LEAVE;                          // 0x00B4   (0x0004)  
	bool                                               STATIONARY_CAN_USE;                                         // 0x00B8   (0x0001)  
	bool                                               CAN_END_SHOOT_FROM_COVER_CAUSE_STATIONARY;                  // 0x00B9   (0x0001)  
	unsigned char                                      UnknownData06_6[0x2];                                       // 0x00BA   (0x0002)  MISSED
	float                                              CAN_END_SHOOT_FROM_COVER_CAUSE_STATIONARY_DELTA;            // 0x00BC   (0x0004)  
	float                                              CAN_END_SHOOT_FROM_COVER_CAUSE_STATIONARY_RADIUS;           // 0x00C0   (0x0004)  
	float                                              END_HOLD_IF_ENEMY_CLOSE_AND_VISIBLE;                        // 0x00C4   (0x0004)  
};

/// Struct /Script/MFNPCAI.GlobalSettings
/// Size: 0x01D4 (468 bytes) (0x000000 - 0x0001D4) align 4 pad: 0x0000
struct FGlobalSettings
{ 
	int32_t                                            SAVAGE_KILL_DIST;                                           // 0x0000   (0x0004)  
	float                                              SOUND_DOOR_BREACH_METERS;                                   // 0x0004   (0x0004)  
	float                                              SOUND_DOOR_OPEN_METERS;                                     // 0x0008   (0x0004)  
	float                                              STEP_NOISE_DELTA;                                           // 0x000C   (0x0004)  
	float                                              JUMP_NOISE_DELTA;                                           // 0x0010   (0x0004)  
	int32_t                                            GUNSHOT_SPREAD;                                             // 0x0014   (0x0004)  
	int32_t                                            GUNSHOT_SPREAD_SILENCE;                                     // 0x0018   (0x0004)  
	float                                              BASE_WALK_SPEREAD2;                                         // 0x001C   (0x0004)  
	float                                              G;                                                          // 0x0020   (0x0004)  
	float                                              STAY_COEF;                                                  // 0x0024   (0x0004)  
	float                                              SIT_COEF;                                                   // 0x0028   (0x0004)  
	float                                              LAY_COEF;                                                   // 0x002C   (0x0004)  
	int32_t                                            MAX_ITERATIONS;                                             // 0x0030   (0x0004)  
	float                                              START_DIST_TO_COV;                                          // 0x0034   (0x0004)  
	float                                              MAX_DIST_TO_COV;                                            // 0x0038   (0x0004)  
	float                                              STAY_HEIGHT;                                                // 0x003C   (0x0004)  
	float                                              CLOSE_POINTS;                                               // 0x0040   (0x0004)  
	int32_t                                            COUNT_TURNS;                                                // 0x0044   (0x0004)  
	float                                              SIMPLE_POINT_LIFE_TIME_SEC;                                 // 0x0048   (0x0004)  
	float                                              DANGER_POINT_LIFE_TIME_SEC;                                 // 0x004C   (0x0004)  
	float                                              DANGER_POWER;                                               // 0x0050   (0x0004)  
	float                                              COVER_DIST_CLOSE;                                           // 0x0054   (0x0004)  
	float                                              GOOD_DIST_TO_POINT;                                         // 0x0058   (0x0004)  
	float                                              COVER_TOOFAR_FROM_BOSS;                                     // 0x005C   (0x0004)  
	float                                              COVER_TOOFAR_FROM_BOSS_SQRT;                                // 0x0060   (0x0004)  
	float                                              MAX_Y_DIFF_TO_PROTECT;                                      // 0x0064   (0x0004)  
	float                                              FLARE_POWER;                                                // 0x0068   (0x0004)  
	float                                              MOVE_COEF;                                                  // 0x006C   (0x0004)  
	float                                              PRONE_POSE;                                                 // 0x0070   (0x0004)  
	float                                              LOWER_POSE;                                                 // 0x0074   (0x0004)  
	float                                              MAX_POSE;                                                   // 0x0078   (0x0004)  
	float                                              FLARE_TIME;                                                 // 0x007C   (0x0004)  
	int32_t                                            MAX_REQUESTS__PER_GROUP;                                    // 0x0080   (0x0004)  
	float                                              UPDATE_GOAL_TIMER_SEC;                                      // 0x0084   (0x0004)  
	float                                              DIST_NOT_TO_GROUP;                                          // 0x0088   (0x0004)  
	float                                              DIST_NOT_TO_GROUP_SQR;                                      // 0x008C   (0x0004)  
	float                                              LAST_SEEN_POS_LIFETIME;                                     // 0x0090   (0x0004)  
	float                                              DELTA_GRENADE_END_TIME;                                     // 0x0094   (0x0004)  
	float                                              DELTA_GRENADE_RUN_DIST;                                     // 0x0098   (0x0004)  
	float                                              DELTA_GRENADE_RUN_DIST_SQRT;                                // 0x009C   (0x0004)  
	float                                              PATROL_MIN_LIGHT_DIST;                                      // 0x00A0   (0x0004)  
	float                                              HOLD_MIN_LIGHT_DIST;                                        // 0x00A4   (0x0004)  
	float                                              ARMOR_CLASS_COEF;                                           // 0x00A8   (0x0004)  
	float                                              SHOTGUN_POWER;                                              // 0x00AC   (0x0004)  
	float                                              RIFLE_POWER;                                                // 0x00B0   (0x0004)  
	float                                              PISTOL_POWER;                                               // 0x00B4   (0x0004)  
	float                                              SMG_POWER;                                                  // 0x00B8   (0x0004)  
	float                                              SNIPE_POWER;                                                // 0x00BC   (0x0004)  
	float                                              GESTUS_PERIOD_SEC;                                          // 0x00C0   (0x0004)  
	float                                              GESTUS_AIMING_DELAY;                                        // 0x00C4   (0x0004)  
	float                                              GESTUS_REQUEST_LIFETIME;                                    // 0x00C8   (0x0004)  
	float                                              GESTUS_FIRST_STAGE_MAX_TIME;                                // 0x00CC   (0x0004)  
	float                                              GESTUS_SECOND_STAGE_MAX_TIME;                               // 0x00D0   (0x0004)  
	int32_t                                            GESTUS_MAX_ANSWERS;                                         // 0x00D4   (0x0004)  
	int32_t                                            GESTUS_FUCK_TO_SHOOT;                                       // 0x00D8   (0x0004)  
	float                                              GESTUS_DIST_ANSWERS;                                        // 0x00DC   (0x0004)  
	float                                              GESTUS_DIST_ANSWERS_SQRT;                                   // 0x00E0   (0x0004)  
	float                                              GESTUS_ANYWAY_CHANCE;                                       // 0x00E4   (0x0004)  
	float                                              TALK_DELAY;                                                 // 0x00E8   (0x0004)  
	bool                                               CAN_SHOOT_TO_HEAD;                                          // 0x00EC   (0x0001)  
	bool                                               CAN_TILT;                                                   // 0x00ED   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x00EE   (0x0002)  MISSED
	float                                              TILT_CHANCE;                                                // 0x00F0   (0x0004)  
	float                                              COVER_SECONDS_AFTER_LOSE_VISION;                            // 0x00F4   (0x0004)  
	float                                              MIN_ARG_COEF;                                               // 0x00F8   (0x0004)  
	float                                              MAX_ARG_COEF;                                               // 0x00FC   (0x0004)  
	float                                              DEAD_AGR_DIST;                                              // 0x0100   (0x0004)  
	float                                              MAX_DANGER_CARE_DIST_SQRT;                                  // 0x0104   (0x0004)  
	float                                              MAX_DANGER_CARE_DIST;                                       // 0x0108   (0x0004)  
	int32_t                                            MIN_MAX_PERSON_SEARCH;                                      // 0x010C   (0x0004)  
	float                                              PERCENT_PERSON_SEARCH;                                      // 0x0110   (0x0004)  
	float                                              LOOK_ANYSIDE_BY_WALL_SEC_OF_ENEMY;                          // 0x0114   (0x0004)  
	float                                              CLOSE_TO_WALL_ROTATE_BY_WALL_SQRT;                          // 0x0118   (0x0004)  
	float                                              FORMUL_COEF_DELTA_DIST;                                     // 0x011C   (0x0004)  
	float                                              FORMUL_COEF_DELTA_SHOOT;                                    // 0x0120   (0x0004)  
	float                                              FORMUL_COEF_DELTA_FRIEND_COVER;                             // 0x0124   (0x0004)  
	float                                              SUSPETION_POINT_DIST_CHECK;                                 // 0x0128   (0x0004)  
	int32_t                                            MAX_BASE_REQUESTS_PER_PLAYER;                               // 0x012C   (0x0004)  
	int32_t                                            MAX_HOLD_REQUESTS_PER_PLAYER;                               // 0x0130   (0x0004)  
	int32_t                                            MAX_GO_TO_REQUESTS_PER_PLAYER;                              // 0x0134   (0x0004)  
	int32_t                                            MAX_COME_WITH_ME_REQUESTS_PER_PLAYER;                       // 0x0138   (0x0004)  
	int32_t                                            CORE_POINTS_MAX;                                            // 0x013C   (0x0004)  
	int32_t                                            CORE_POINTS_MIN;                                            // 0x0140   (0x0004)  
	bool                                               BORN_POINSTS_FREE_ONLY_FAREST_PLAYER;                       // 0x0144   (0x0001)  
	bool                                               SCAV_GROUPS_TOGETHER;                                       // 0x0145   (0x0001)  
	unsigned char                                      UnknownData01_6[0x2];                                       // 0x0146   (0x0002)  MISSED
	float                                              LAY_DOWN_ANG_SHOOT;                                         // 0x0148   (0x0004)  
	float                                              HOLD_REQUEST_TIME_SEC;                                      // 0x014C   (0x0004)  
	int32_t                                            TRIGGERS_DOWN_TO_RUN_WHEN_MOVE;                             // 0x0150   (0x0004)  
	float                                              MIN_DIST_TO_RUN_WHILE_ATTACK_MOVING;                        // 0x0154   (0x0004)  
	float                                              MIN_DIST_TO_RUN_WHILE_ATTACK_MOVING_OTHER_ENEMIS;           // 0x0158   (0x0004)  
	float                                              MIN_DIST_TO_STOP_RUN;                                       // 0x015C   (0x0004)  
	float                                              JUMP_SPREAD_DIST;                                           // 0x0160   (0x0004)  
	int32_t                                            LOOK_TIMES_TO_KILL;                                         // 0x0164   (0x0004)  
	int32_t                                            COME_INSIDE_TIMES;                                          // 0x0168   (0x0004)  
	float                                              TOTAL_TIME_KILL;                                            // 0x016C   (0x0004)  
	float                                              TOTAL_TIME_KILL_AFTER_WARN;                                 // 0x0170   (0x0004)  
	float                                              VERTICAL_DIST_TO_IGNORE_SOUND;                              // 0x0174   (0x0004)  
	float                                              DEFENCE_LEVEL_SHIFT;                                        // 0x0178   (0x0004)  
	float                                              MIN_DIST_CLOSE_DEF;                                         // 0x017C   (0x0004)  
	float                                              SMOKE_GRENADE_RADIUS_COEF;                                  // 0x0180   (0x0004)  
	int32_t                                            GRENADE_PRECISION;                                          // 0x0184   (0x0004)  
	int32_t                                            MAX_WARNS_BEFORE_KILL;                                      // 0x0188   (0x0004)  
	float                                              CARE_ENEMY_ONLY_TIME;                                       // 0x018C   (0x0004)  
	float                                              MIDDLE_POINT_COEF;                                          // 0x0190   (0x0004)  
	bool                                               MAIN_TACTIC_ONLY_ATTACK;                                    // 0x0194   (0x0001)  
	unsigned char                                      UnknownData02_6[0x3];                                       // 0x0195   (0x0003)  MISSED
	float                                              LAST_DAMAGE_ACTIVE;                                         // 0x0198   (0x0004)  
	float                                              DELTA_SUPRESS_DISTANCE_SQRT;                                // 0x019C   (0x0004)  
	float                                              DELTA_SUPRESS_DISTANCE;                                     // 0x01A0   (0x0004)  
	float                                              WAVE_COEF_LOW;                                              // 0x01A4   (0x0004)  
	float                                              WAVE_COEF_MID;                                              // 0x01A8   (0x0004)  
	float                                              WAVE_COEF_HIGH;                                             // 0x01AC   (0x0004)  
	float                                              WAVE_COEF_HORDE;                                            // 0x01B0   (0x0004)  
	bool                                               WAVE_ONLY_AS_ONLINE;                                        // 0x01B4   (0x0001)  
	unsigned char                                      UnknownData03_6[0x3];                                       // 0x01B5   (0x0003)  MISSED
	float                                              AI_DATA_POWER_RECALC;                                       // 0x01B8   (0x0004)  
	int32_t                                            LOCAL_BOTS_COUNT;                                           // 0x01BC   (0x0004)  
	float                                              ENEMY_TO_BE_CURRENT;                                        // 0x01C0   (0x0004)  
	float                                              DELAY_BEFORE_ENEMY;                                         // 0x01C4   (0x0004)  
	float                                              DIST_TO_BECOME_ENEMY;                                       // 0x01C8   (0x0004)  
	float                                              PERIOD_NEXT_ACTION_SEC;                                     // 0x01CC   (0x0004)  
	float                                              PERIOD_NEXT_HELLO_ACTION_SEC;                               // 0x01D0   (0x0004)  
};

/// Struct /Script/MFNPCAI.GrenadeSettings
/// Size: 0x00AC (172 bytes) (0x000000 - 0x0000AC) align 4 pad: 0x0000
struct FGrenadeSettings
{ 
	float                                              DELTA_NEXT_ATTEMPT_FROM_COVER;                              // 0x0000   (0x0004)  
	float                                              DELTA_NEXT_ATTEMPT;                                         // 0x0004   (0x0004)  
	float                                              MIN_DIST_NOT_TO_THROW;                                      // 0x0008   (0x0004)  
	float                                              NEAR_DELTA_THROW_TIME_SEC;                                  // 0x000C   (0x0004)  
	float                                              MIN_THROW_GRENADE_DIST;                                     // 0x0010   (0x0004)  
	float                                              MIN_THROW_GRENADE_DIST_SQRT;                                // 0x0014   (0x0004)  
	float                                              MIN_DIST_NOT_TO_THROW_SQR;                                  // 0x0018   (0x0004)  
	float                                              RUN_AWAY;                                                   // 0x001C   (0x0004)  
	float                                              RUN_AWAY_SQR;                                               // 0x0020   (0x0004)  
	float                                              ADD_GRENADE_AS_DANGER;                                      // 0x0024   (0x0004)  
	float                                              ADD_GRENADE_AS_DANGER_SQR;                                  // 0x0028   (0x0004)  
	float                                              CHANCE_TO_NOTIFY_ENEMY_GR;                                  // 0x002C   (0x0004)  
	float                                              REQUEST_DIST_MUST_THROW_SQRT;                               // 0x0030   (0x0004)  
	float                                              REQUEST_DIST_MUST_THROW;                                    // 0x0034   (0x0004)  
	int32_t                                            BEWARE_TYPE;                                                // 0x0038   (0x0004)  
	float                                              SHOOT_TO_SMOKE_CHANCE;                                      // 0x003C   (0x0004)  
	float                                              CHANCE_RUN_FLASHED;                                         // 0x0040   (0x0004)  
	float                                              MAX_FLASHED_DIST_TO_SHOOT;                                  // 0x0044   (0x0004)  
	float                                              MAX_FLASHED_DIST_TO_SHOOT_SQRT;                             // 0x0048   (0x0004)  
	float                                              FLASH_GRENADE_TIME_COEF;                                    // 0x004C   (0x0004)  
	float                                              SIZE_SPOTTED_COEF;                                          // 0x0050   (0x0004)  
	float                                              BE_ATTENTION_COEF;                                          // 0x0054   (0x0004)  
	float                                              TIME_SHOOT_TO_FLASH;                                        // 0x0058   (0x0004)  
	float                                              CLOSE_TO_SMOKE_TO_SHOOT;                                    // 0x005C   (0x0004)  
	float                                              CLOSE_TO_SMOKE_TO_SHOOT_SQRT;                               // 0x0060   (0x0004)  
	float                                              CLOSE_TO_SMOKE_TIME_DELTA;                                  // 0x0064   (0x0004)  
	float                                              SMOKE_CHECK_DELTA;                                          // 0x0068   (0x0004)  
	float                                              DELTA_GRENADE_START_TIME;                                   // 0x006C   (0x0004)  
	float                                              AMBUSH_IF_SMOKE_IN_ZONE;                                    // 0x0070   (0x0004)  
	float                                              AMBUSH_IF_SMOKE_RETURN_TO_ATTACK_SEC;                       // 0x0074   (0x0004)  
	bool                                               NO_RUN_FROM_AI_GRENADES;                                    // 0x0078   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0079   (0x0003)  MISSED
	float                                              MAX_THROW_POWER;                                            // 0x007C   (0x0004)  
	float                                              GrenadePrecision;                                           // 0x0080   (0x0004)  
	bool                                               STOP_WHEN_THROW_GRENADE;                                    // 0x0084   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0085   (0x0003)  MISSED
	float                                              WAIT_TIME_TURN_AWAY;                                        // 0x0088   (0x0004)  
	float                                              SMOKE_SUPPRESS_DELTA;                                       // 0x008C   (0x0004)  
	float                                              DAMAGE_GRENADE_SUPPRESS_DELTA;                              // 0x0090   (0x0004)  
	float                                              STUN_SUPPRESS_DELTA;                                        // 0x0094   (0x0004)  
	bool                                               CAN_THROW_STRAIGHT_CONTACT;                                 // 0x0098   (0x0001)  
	unsigned char                                      UnknownData02_6[0x3];                                       // 0x0099   (0x0003)  MISSED
	float                                              STRAIGHT_CONTACT_DELTA_SEC;                                 // 0x009C   (0x0004)  
	int32_t                                            ANG_TYPE;                                                   // 0x00A0   (0x0004)  
	float                                              MIN_THROW_DIST_PERCENT_0;                                   // 0x00A4   (0x0004)  
	float                                              FLASH_MODIF_IS_NIGHTVISION;                                 // 0x00A8   (0x0004)  
};

/// Struct /Script/MFNPCAI.HearingSettings
/// Size: 0x006C (108 bytes) (0x000000 - 0x00006C) align 4 pad: 0x0000
struct FHearingSettings
{ 
	float                                              NOISE_POWER_SPRINT;                                         // 0x0000   (0x0004)  
	float                                              NOISE_POWER_PRONE;                                          // 0x0004   (0x0004)  
	float                                              NOISE_POWER_CROUCH;                                         // 0x0008   (0x0004)  
	float                                              NOISE_POWER_WALK;                                           // 0x000C   (0x0004)  
	float                                              NOISE_POWER_GUN_FIRE;                                       // 0x0010   (0x0004)  
	float                                              NOISE_POWER_SILENCED_FIRE;                                  // 0x0014   (0x0004)  
	float                                              NOISE_POWER_DOOR_OPEN;                                      // 0x0018   (0x0004)  
	float                                              NOISE_POWER_DOOR_WRECK;                                     // 0x001C   (0x0004)  
	float                                              NOISE_POWER_GRENADE_EXPLOSIVE;                              // 0x0020   (0x0004)  
	float                                              POWER_DANGER;                                               // 0x0024   (0x0004)  
	float                                              HEARING_POWER_COEF;                                         // 0x0028   (0x0004)  
	float                                              FOOT_STEP_CLOSE_DIST;                                       // 0x002C   (0x0004)  
	float                                              FOOT_STEP_FAR_DIST;                                         // 0x0030   (0x0004)  
	float                                              GUN_CLOSE_DIST;                                             // 0x0034   (0x0004)  
	float                                              GUN_FAR_DIST;                                               // 0x0038   (0x0004)  
	float                                              GUN_HIT_CLOSE_DIST;                                         // 0x003C   (0x0004)  
	float                                              BOT_CLOSE_PANIC_DIST;                                       // 0x0040   (0x0004)  
	float                                              DISPERSION_COEF;                                            // 0x0044   (0x0004)  
	float                                              DISPERSION_COEF_GUN;                                        // 0x0048   (0x0004)  
	float                                              SOUND_DIR_DEEFREE;                                          // 0x004C   (0x0004)  
	float                                              DIST_PLACE_TO_FIND_POINT;                                   // 0x0050   (0x0004)  
	float                                              DEAD_BODY_SOUND_RAD;                                        // 0x0054   (0x0004)  
	float                                              RESET_TIMER_DIST;                                           // 0x0058   (0x0004)  
	float                                              HEAR_DELAY_WHEN_PEACE;                                      // 0x005C   (0x0004)  
	float                                              HEAR_DELAY_WHEN_HAVE_SMT;                                   // 0x0060   (0x0004)  
	float                                              LOOK_ONLY_DANGER_DELTA;                                     // 0x0064   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0068   (0x0004)  MISSED
};

/// Struct /Script/MFNPCAI.LaySettings
/// Size: 0x004C (76 bytes) (0x000000 - 0x00004C) align 4 pad: 0x0000
struct FLaySettings
{ 
	float                                              DELTA_LAY_CHECK;                                            // 0x0000   (0x0004)  
	float                                              DELTA_GETUP;                                                // 0x0004   (0x0004)  
	float                                              DELTA_AFTER_GETUP;                                          // 0x0008   (0x0004)  
	float                                              CLEAR_POINTS_OF_SCARE_SEC;                                  // 0x000C   (0x0004)  
	float                                              MAX_LAY_TIME;                                               // 0x0010   (0x0004)  
	float                                              DIST_TO_COVER_TO_LAY;                                       // 0x0014   (0x0004)  
	float                                              DIST_TO_COVER_TO_LAY_SQRT;                                  // 0x0018   (0x0004)  
	float                                              DIST_ENEMY_NULL_DANGER_LAY;                                 // 0x001C   (0x0004)  
	float                                              DIST_ENEMY_NULL_DANGER_LAY_SQRT;                            // 0x0020   (0x0004)  
	float                                              DIST_ENEMY_GETUP_LAY;                                       // 0x0024   (0x0004)  
	float                                              DIST_ENEMY_GETUP_LAY_SQRT;                                  // 0x0028   (0x0004)  
	float                                              DIST_ENEMY_CAN_LAY;                                         // 0x002C   (0x0004)  
	float                                              DIST_ENEMY_CAN_LAY_SQRT;                                    // 0x0030   (0x0004)  
	float                                              LAY_AIM;                                                    // 0x0034   (0x0004)  
	float                                              MIN_CAN_LAY_DIST_SQRT;                                      // 0x0038   (0x0004)  
	float                                              MIN_CAN_LAY_DIST;                                           // 0x003C   (0x0004)  
	float                                              MAX_CAN_LAY_DIST_SQRT;                                      // 0x0040   (0x0004)  
	float                                              MAX_CAN_LAY_DIST;                                           // 0x0044   (0x0004)  
	int32_t                                            DAMAGE_TIME_TO_GETUP;                                       // 0x0048   (0x0004)  
};

/// Struct /Script/MFNPCAI.LookSettings
/// Size: 0x00E0 (224 bytes) (0x000000 - 0x0000E0) align 4 pad: 0x0000
struct FLookSettings
{ 
	float                                              VISIBLE_ANG_NORMAL;                                         // 0x0000   (0x0004)  
	float                                              NORMAL_VISION_RADIUS;                                       // 0x0004   (0x0004)  
	float                                              NORMAL_VISION_RADIUS_LOST;                                  // 0x0008   (0x0004)  
	float                                              VISIBLE_ANG_NIGHT;                                          // 0x000C   (0x0004)  
	float                                              NIGHT_VISION_RADIUS;                                        // 0x0010   (0x0004)  
	float                                              NIGHT_VISION_RADIUS_LOST;                                   // 0x0014   (0x0004)  
	float                                              VISIBLE_ANG_LIGHT;                                          // 0x0018   (0x0004)  
	float                                              LIGHT_VISION_RADIUS;                                        // 0x001C   (0x0004)  
	float                                              LIGHT_VISION_RADIUS_LOST;                                   // 0x0020   (0x0004)  
	float                                              NORMAL_VISION_COEF;                                         // 0x0024   (0x0004)  
	float                                              GRASS_SIGHT_IGNORE_DISTANCE;                                // 0x0028   (0x0004)  
	float                                              GRASS_SIGHT_IGNORE_Z_COORDINATE;                            // 0x002C   (0x0004)  
	float                                              INGRASS_SIGHT_RADIUS_MIN;                                   // 0x0030   (0x0004)  
	float                                              INGRASS_SIGHT_RADIUS_MAX;                                   // 0x0034   (0x0004)  
	float                                              RAINY_SIGHT_RADIUS_MIN;                                     // 0x0038   (0x0004)  
	float                                              RAINY_SIGHT_RADIUS_MAX;                                     // 0x003C   (0x0004)  
	float                                              INGORE_NOLIGHT_RADIUS;                                      // 0x0040   (0x0004)  
	float                                              DIST_NORMAL_SUSPECTED_POINT_INTERVAL;                       // 0x0044   (0x0004)  
	float                                              DIST_DANGER_SUSPECTED_POINT_INTERVAL;                       // 0x0048   (0x0004)  
	float                                              FAR_DISTANCE;                                               // 0x004C   (0x0004)  
	float                                              MIDDLE_DIST;                                                // 0x0050   (0x0004)  
	float                                              CLOSE_DIST;                                                 // 0x0054   (0x0004)  
	float                                              OLD_TIME_POINT;                                             // 0x0058   (0x0004)  
	float                                              WAIT_NEW_SENSOR;                                            // 0x005C   (0x0004)  
	float                                              WAIT_NEW__LOOK_SENSOR;                                      // 0x0060   (0x0004)  
	float                                              LOOK_AROUND_DELTA;                                          // 0x0064   (0x0004)  
	float                                              MAX_VISION_GRASS_METERS;                                    // 0x0068   (0x0004)  
	float                                              MAX_VISION_GRASS_METERS_FLARE;                              // 0x006C   (0x0004)  
	float                                              MAX_VISION_GRASS_METERS_OPT;                                // 0x0070   (0x0004)  
	float                                              MAX_VISION_GRASS_METERS_FLARE_OPT;                          // 0x0074   (0x0004)  
	float                                              LightOnVisionDistance;                                      // 0x0078   (0x0004)  
	float                                              POSIBLE_VISION_SPACE;                                       // 0x007C   (0x0004)  
	float                                              GOAL_TO_FULL_DISSAPEAR;                                     // 0x0080   (0x0004)  
	float                                              GOAL_TO_FULL_DISSAPEAR_GREEN;                               // 0x0084   (0x0004)  
	float                                              GOAL_TO_FULL_DISSAPEAR_SHOOT;                               // 0x0088   (0x0004)  
	float                                              BODY_DELTA_TIME_SEARCH_SEC;                                 // 0x008C   (0x0004)  
	float                                              ENEMY_LIGHT_ADD;                                            // 0x0090   (0x0004)  
	float                                              ENEMY_LIGHT_START_DIST;                                     // 0x0094   (0x0004)  
	float                                              DIST_NOT_TO_IGNORE_WALL;                                    // 0x0098   (0x0004)  
	float                                              DIST_CHECK_WALL;                                            // 0x009C   (0x0004)  
	float                                              LOOK_LAST_POSENEMY_IF_NO_DANGER_SEC;                        // 0x00A0   (0x0004)  
	float                                              MIN_LOOK_AROUD_TIME;                                        // 0x00A4   (0x0004)  
	bool                                               LOOK_THROUGH_GRASS;                                         // 0x00A8   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x00A9   (0x0003)  MISSED
	float                                              SEC_REPEATED_SEEN;                                          // 0x00AC   (0x0004)  
	float                                              DIST_SQRT_REPEATED_SEEN;                                    // 0x00B0   (0x0004)  
	float                                              DIST_REPEATED_SEEN;                                         // 0x00B4   (0x0004)  
	float                                              COEF_REPEATED_SEEN;                                         // 0x00B8   (0x0004)  
	float                                              MAX_DIST_CLAMP_TO_SEEN_SPEED;                               // 0x00BC   (0x0004)  
	float                                              NIGHT_VISION_ON;                                            // 0x00C0   (0x0004)  
	float                                              NIGHT_VISION_OFF;                                           // 0x00C4   (0x0004)  
	float                                              NO_GREEN_DIST;                                              // 0x00C8   (0x0004)  
	float                                              NO_GRASS_DIST;                                              // 0x00CC   (0x0004)  
	float                                              INSIDE_BUSH_COEF;                                           // 0x00D0   (0x0004)  
	unsigned char                                      UnknownData01_7[0xC];                                       // 0x00D4   (0x000C)  MISSED
};

/// Struct /Script/MFNPCAI.MindSettings
/// Size: 0x00F8 (248 bytes) (0x000000 - 0x0000F8) align 4 pad: 0x0000
struct FMindSettings
{ 
	int32_t                                            MIN_SHOOTS_TIME;                                            // 0x0000   (0x0004)  
	int32_t                                            MAX_SHOOTS_TIME;                                            // 0x0004   (0x0004)  
	float                                              TIME_TO_RUN_TO_COVER_CAUSE_SHOOT_SEC;                       // 0x0008   (0x0004)  
	float                                              MIN_DAMAGE_SCARE;                                           // 0x000C   (0x0004)  
	float                                              TIME_TO_FORGOR_ABOUT_ENEMY_SEC;                             // 0x0010   (0x0004)  
	float                                              TIME_TO_FIND_ENEMY;                                         // 0x0014   (0x0004)  
	float                                              MAX_AGGRO_BOT_DIST;                                         // 0x0018   (0x0004)  
	float                                              HIT_POINT_DETECTION;                                        // 0x001C   (0x0004)  
	float                                              DANGER_POINT_CHOOSE_COEF;                                   // 0x0020   (0x0004)  
	float                                              SIMPLE_POINT_CHOOSE_COEF;                                   // 0x0024   (0x0004)  
	float                                              LASTSEEN_POINT_CHOOSE_COEF;                                 // 0x0028   (0x0004)  
	float                                              COVER_DIST_COEF;                                            // 0x002C   (0x0004)  
	float                                              DIST_TO_FOUND_SQRT;                                         // 0x0030   (0x0004)  
	float                                              MAX_AGGRO_BOT_DIST_SQR;                                     // 0x0034   (0x0004)  
	float                                              DIST_TO_STOP_RUN_ENEMY;                                     // 0x0038   (0x0004)  
	float                                              ENEMY_LOOK_AT_ME_ANG;                                       // 0x003C   (0x0004)  
	float                                              MIN_START_AGGRESION_COEF;                                   // 0x0040   (0x0004)  
	float                                              MAX_START_AGGRESION_COEF;                                   // 0x0044   (0x0004)  
	float                                              BULLET_FEEL_DIST;                                           // 0x0048   (0x0004)  
	float                                              BULLET_FEEL_CLOSE_SDIST;                                    // 0x004C   (0x0004)  
	float                                              ATTACK_IMMEDIATLY_CHANCE_0;                                 // 0x0050   (0x0004)  
	float                                              CHANCE_FUCK_YOU_ON_CONTACT;                                 // 0x0054   (0x0004)  
	float                                              FRIEND_DEAD_AGR_LOW;                                        // 0x0058   (0x0004)  
	float                                              FRIEND_AGR_KILL;                                            // 0x005C   (0x0004)  
	float                                              LAST_ENEMY_LOOK_TO;                                         // 0x0060   (0x0004)  
	bool                                               CAN_RECIVE_PLAYER_REQUESTS;                                 // 0x0064   (0x0001)  
	bool                                               CAN_USE_MEDS;                                               // 0x0065   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x0066   (0x0002)  MISSED
	float                                              SUSPETION_POINT_CHANCE_ADD100;                              // 0x0068   (0x0004)  
	bool                                               AMBUSH_WHEN_UNDER_FIRE;                                     // 0x006C   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x006D   (0x0003)  MISSED
	float                                              AMBUSH_WHEN_UNDER_FIRE_TIME_RESIST;                         // 0x0070   (0x0004)  
	float                                              ATTACK_ENEMY_IF_PROTECT_DELTA_LAST_TIME_SEEN;               // 0x0074   (0x0004)  
	float                                              HOLD_IF_PROTECT_DELTA_LAST_TIME_SEEN;                       // 0x0078   (0x0004)  
	float                                              FIND_COVER_TO_GET_POSITION_WITH_SHOOT;                      // 0x007C   (0x0004)  
	bool                                               PROTECT_TIME_REAL;                                          // 0x0080   (0x0001)  
	unsigned char                                      UnknownData02_6[0x3];                                       // 0x0081   (0x0003)  MISSED
	float                                              CHANCE_SHOOT_WHEN_WARN_PLAYER;                              // 0x0084   (0x0004)  
	bool                                               CAN_PANIC_IS_PROTECT;                                       // 0x0088   (0x0001)  
	bool                                               NO_RUN_AWAY_FOR_SAFE;                                       // 0x0089   (0x0001)  
	unsigned char                                      UnknownData03_6[0x2];                                       // 0x008A   (0x0002)  MISSED
	float                                              PART_PERCENT_TO_HEAL;                                       // 0x008C   (0x0004)  
	float                                              PROTECT_DELTA_HEAL_SEC;                                     // 0x0090   (0x0004)  
	bool                                               CAN_STAND_BY;                                               // 0x0094   (0x0001)  
	bool                                               CAN_THROW_REQUESTS;                                         // 0x0095   (0x0001)  
	unsigned char                                      UnknownData04_6[0x2];                                       // 0x0096   (0x0002)  MISSED
	float                                              GROUP_ANY_PHRASE_DELAY;                                     // 0x0098   (0x0004)  
	float                                              GROUP_EXACTLY_PHRASE_DELAY;                                 // 0x009C   (0x0004)  
	float                                              DIST_TO_ENEMY_YO_CAN_HEAL;                                  // 0x00A0   (0x0004)  
	float                                              CHANCE_TO_STAY_WHEN_WARN_PLAYER;                            // 0x00A4   (0x0004)  
	float                                              DOG_FIGHT_OUT;                                              // 0x00A8   (0x0004)  
	float                                              DOG_FIGHT_IN;                                               // 0x00AC   (0x0004)  
	float                                              PISTOL_SHOTGUN_AMBUSH_DIST;                                 // 0x00B0   (0x0004)  
	float                                              STANDART_AMBUSH_DIST;                                       // 0x00B4   (0x0004)  
	bool                                               COVER_SELF_ALWAYS_IF_DAMAGED;                               // 0x00B8   (0x0001)  
	unsigned char                                      UnknownData05_6[0x3];                                       // 0x00B9   (0x0003)  MISSED
	float                                              SEC_TO_MORE_DIST_TO_RUN;                                    // 0x00BC   (0x0004)  
	float                                              HEAL_DELAY_SEC;                                             // 0x00C0   (0x0004)  
	float                                              HIT_DELAY_WHEN_HAVE_SMT;                                    // 0x00C4   (0x0004)  
	float                                              HIT_DELAY_WHEN_PEACE;                                       // 0x00C8   (0x0004)  
	bool                                               TALK_WITH_QUERY;                                            // 0x00CC   (0x0001)  
	unsigned char                                      UnknownData06_6[0x3];                                       // 0x00CD   (0x0003)  MISSED
	float                                              DANGER_EXPIRE_TIME_MIN;                                     // 0x00D0   (0x0004)  
	float                                              DANGER_EXPIRE_TIME_MAX;                                     // 0x00D4   (0x0004)  
	float                                              PANIC_RUN_WEIGHT;                                           // 0x00D8   (0x0004)  
	float                                              PANIC_SIT_WEIGHT;                                           // 0x00DC   (0x0004)  
	float                                              PANIC_LAY_WEIGHT;                                           // 0x00E0   (0x0004)  
	float                                              PANIC_NONE_WEIGHT;                                          // 0x00E4   (0x0004)  
	float                                              PANIC_SIT_WEIGHT_PEACE;                                     // 0x00E8   (0x0004)  
	bool                                               CAN_EXECUTE_REQUESTS;                                       // 0x00EC   (0x0001)  
	unsigned char                                      UnknownData07_6[0x3];                                       // 0x00ED   (0x0003)  MISSED
	float                                              DIST_TO_ENEMY_SPOTTED_ON_HIT;                               // 0x00F0   (0x0004)  
	float                                              UNDER_FIRE_PERIOD;                                          // 0x00F4   (0x0004)  
};

/// Struct /Script/MFNPCAI.MoveSettings
/// Size: 0x0058 (88 bytes) (0x000000 - 0x000058) align 4 pad: 0x0000
struct FMoveSettings
{ 
	float                                              BASE_ROTATE_SPEED;                                          // 0x0000   (0x0004)  
	float                                              REACH_DIST;                                                 // 0x0004   (0x0004)  
	float                                              REACH_DIST_RUN;                                             // 0x0008   (0x0004)  
	float                                              START_SLOW_DIST;                                            // 0x000C   (0x0004)  
	float                                              BASESTART_SLOW_DIST;                                        // 0x0010   (0x0004)  
	float                                              SLOW_COEF;                                                  // 0x0014   (0x0004)  
	float                                              DIST_TO_CAN_CHANGE_WAY;                                     // 0x0018   (0x0004)  
	float                                              DIST_TO_START_RAYCAST;                                      // 0x001C   (0x0004)  
	float                                              BASE_START_SERACH;                                          // 0x0020   (0x0004)  
	float                                              UPDATE_TIME_RECAL_WAY;                                      // 0x0024   (0x0004)  
	float                                              FAR_DIST;                                                   // 0x0028   (0x0004)  
	float                                              FAR_DIST_SQR;                                               // 0x002C   (0x0004)  
	float                                              DIST_TO_CAN_CHANGE_WAY_SQR;                                 // 0x0030   (0x0004)  
	float                                              DIST_TO_START_RAYCAST_SQR;                                  // 0x0034   (0x0004)  
	float                                              BASE_SQRT_START_SERACH;                                     // 0x0038   (0x0004)  
	float                                              Y_APPROXIMATION;                                            // 0x003C   (0x0004)  
	float                                              RUN_TO_COVER_MIN;                                           // 0x0040   (0x0004)  
	float                                              CHANCE_TO_RUN_IF_NO_AMMO_0;                                 // 0x0044   (0x0004)  
	bool                                               RUN_IF_CANT_SHOOT;                                          // 0x0048   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0049   (0x0003)  MISSED
	float                                              RUN_IF_GAOL_FAR_THEN;                                       // 0x004C   (0x0004)  
	float                                              SEC_TO_CHANGE_TO_RUN;                                       // 0x0050   (0x0004)  
	bool                                               ETERNITY_STAMINA;                                           // 0x0054   (0x0001)  
	unsigned char                                      UnknownData01_7[0x3];                                       // 0x0055   (0x0003)  MISSED
};

/// Struct /Script/MFNPCAI.PatrolSettings
/// Size: 0x0074 (116 bytes) (0x000000 - 0x000074) align 4 pad: 0x0000
struct FPatrolSettings
{ 
	float                                              LOOK_TIME_BASE;                                             // 0x0000   (0x0004)  
	float                                              RESERVE_TIME_STAY;                                          // 0x0004   (0x0004)  
	float                                              RESERVE_LOOT_TIME_STAY;                                     // 0x0008   (0x0004)  
	float                                              FRIEND_SEARCH_SEC;                                          // 0x000C   (0x0004)  
	float                                              TALK_DELAY;                                                 // 0x0010   (0x0004)  
	float                                              MIN_TALK_DELAY;                                             // 0x0014   (0x0004)  
	float                                              TALK_DELAY_BIG;                                             // 0x0018   (0x0004)  
	float                                              CHANGE_WAY_TIME;                                            // 0x001C   (0x0004)  
	float                                              MIN_DIST_TO_CLOSE_TALK;                                     // 0x0020   (0x0004)  
	float                                              VISION_DIST_COEF_PEACE;                                     // 0x0024   (0x0004)  
	float                                              MIN_DIST_TO_CLOSE_TALK_SQR;                                 // 0x0028   (0x0004)  
	float                                              CHANCE_TO_CUT_WAY_0;                                        // 0x002C   (0x0004)  
	float                                              CUT_WAY_MIN_0;                                              // 0x0030   (0x0004)  
	float                                              CUT_WAY_MAX_0;                                              // 0x0034   (0x0004)  
	float                                              CHANCE_TO_CHANGE_WAY_0;                                     // 0x0038   (0x0004)  
	int32_t                                            CHANCE_TO_SHOOT_DEADBODY;                                   // 0x003C   (0x0004)  
	float                                              SUSPETION_PLACE_LIFETIME;                                   // 0x0040   (0x0004)  
	float                                              RESERVE_OUT_TIME;                                           // 0x0044   (0x0004)  
	float                                              CLOSE_TO_SELECT_RESERV_WAY;                                 // 0x0048   (0x0004)  
	float                                              MAX_YDIST_TO_START_WARN_REQUEST_TO_REQUESTER;               // 0x004C   (0x0004)  
	bool                                               CAN_CHOOSE_RESERV;                                          // 0x0050   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0051   (0x0003)  MISSED
	float                                              HEAD_PERIOD_TIME;                                           // 0x0054   (0x0004)  
	float                                              HEAD_FRONT_PERIOD_TIME;                                     // 0x0058   (0x0004)  
	float                                              CHANCE_TO_PLAY_GESTURE_WHEN_CLOSE;                          // 0x005C   (0x0004)  
	float                                              HEAD_TURN_SPEED;                                            // 0x0060   (0x0004)  
	float                                              HEAD_ANG_ROTATE;                                            // 0x0064   (0x0004)  
	float                                              CHANCE_TO_PLAY_VOICE_WHEN_CLOSE;                            // 0x0068   (0x0004)  
	float                                              GO_TO_NEXT_POINT_DELTA;                                     // 0x006C   (0x0004)  
	float                                              GO_TO_NEXT_POINT_DELTA_RESERV_WAY;                          // 0x0070   (0x0004)  
};

/// Struct /Script/MFNPCAI.ScatteringSettings
/// Size: 0x0078 (120 bytes) (0x000000 - 0x000078) align 4 pad: 0x0000
struct FScatteringSettings
{ 
	float                                              MinScatter;                                                 // 0x0000   (0x0004)  
	float                                              WorkingScatter;                                             // 0x0004   (0x0004)  
	float                                              MaxScatter;                                                 // 0x0008   (0x0004)  
	float                                              SpeedUp;                                                    // 0x000C   (0x0004)  
	float                                              SpeedUpAim;                                                 // 0x0010   (0x0004)  
	float                                              SpeedDown;                                                  // 0x0014   (0x0004)  
	float                                              ToSlowBotSpeed;                                             // 0x0018   (0x0004)  
	float                                              ToLowBotSpeed;                                              // 0x001C   (0x0004)  
	float                                              ToUpBotSpeed;                                               // 0x0020   (0x0004)  
	float                                              MovingSlowCoef;                                             // 0x0024   (0x0004)  
	float                                              ToLowBotAngularSpeed;                                       // 0x0028   (0x0004)  
	float                                              ToStopBotAngularSpeed;                                      // 0x002C   (0x0004)  
	float                                              FromShot;                                                   // 0x0030   (0x0004)  
	float                                              TracerCoef;                                                 // 0x0034   (0x0004)  
	float                                              HandDamageScatteringMinMax;                                 // 0x0038   (0x0004)  
	float                                              HandDamageAccuracySpeed;                                    // 0x003C   (0x0004)  
	float                                              Caution;                                                    // 0x0040   (0x0004)  
	float                                              ToCaution;                                                  // 0x0044   (0x0004)  
	float                                              RecoilControlCoefShootDone;                                 // 0x0048   (0x0004)  
	float                                              RecoilControlCoefShootDoneAuto;                             // 0x004C   (0x0004)  
	float                                              AMPLITUDE_FACTOR;                                           // 0x0050   (0x0004)  
	float                                              AMPLITUDE_SPEED;                                            // 0x0054   (0x0004)  
	float                                              DIST_FROM_OLD_POINT_TO_NOT_AIM;                             // 0x0058   (0x0004)  
	float                                              DIST_FROM_OLD_POINT_TO_NOT_AIM_SQRT;                        // 0x005C   (0x0004)  
	float                                              DIST_NOT_TO_SHOOT;                                          // 0x0060   (0x0004)  
	float                                              PoseChnageCoef;                                             // 0x0064   (0x0004)  
	float                                              LayFactor;                                                  // 0x0068   (0x0004)  
	float                                              RecoilYCoef;                                                // 0x006C   (0x0004)  
	float                                              RecoilYCoefSppedDown;                                       // 0x0070   (0x0004)  
	float                                              RecoilYMax;                                                 // 0x0074   (0x0004)  
};

/// Struct /Script/MFNPCAI.ShootSettings
/// Size: 0x0094 (148 bytes) (0x000000 - 0x000094) align 4 pad: 0x0000
struct FShootSettings
{ 
	float                                              UA_MAX_RECOIL_TIME;                                         // 0x0000   (0x0004)  
	float                                              UA_SHOOT_POSITION_ZOFFSET;                                  // 0x0004   (0x0004)  
	float                                              RECOIL_TIME_NORMALIZE;                                      // 0x0008   (0x0004)  
	float                                              RECOIL_PER_METER;                                           // 0x000C   (0x0004)  
	float                                              MAX_RECOIL_PER_METER;                                       // 0x0010   (0x0004)  
	float                                              HORIZONT_RECOIL_COEF;                                       // 0x0014   (0x0004)  
	float                                              WAIT_NEXT_SINGLE_SHOT;                                      // 0x0018   (0x0004)  
	float                                              WAIT_NEXT_STATIONARY_BULLET;                                // 0x001C   (0x0004)  
	float                                              WAIT_NEXT_STATIONARY_GRENADE;                               // 0x0020   (0x0004)  
	float                                              WAIT_NEXT_SINGLE_SHOT_LONG_MAX;                             // 0x0024   (0x0004)  
	float                                              WAIT_NEXT_SINGLE_SHOT_LONG_MIN;                             // 0x0028   (0x0004)  
	float                                              MARKSMAN_DIST_SEK_COEF;                                     // 0x002C   (0x0004)  
	float                                              FINGER_HOLD_SINGLE_SHOT;                                    // 0x0030   (0x0004)  
	float                                              FINGER_HOLD_STATIONARY_BULLET;                              // 0x0034   (0x0004)  
	float                                              FINGER_HOLD_STATIONARY_GRENADE;                             // 0x0038   (0x0004)  
	float                                              BASE_AUTOMATIC_TIME;                                        // 0x003C   (0x0004)  
	float                                              AUTOMATIC_FIRE_SCATTERING_COEF;                             // 0x0040   (0x0004)  
	float                                              CHANCE_TO_CHANGE_TO_AUTOMATIC_FIRE;                         // 0x0044   (0x0004)  
	float                                              FAR_DIST_ENEMY;                                             // 0x0048   (0x0004)  
	int32_t                                            SHOOT_FROM_COVER;                                           // 0x004C   (0x0004)  
	float                                              FAR_DIST_ENEMY_SQR;                                         // 0x0050   (0x0004)  
	float                                              MAX_DIST_COEF;                                              // 0x0054   (0x0004)  
	float                                              RECOIL_DELTA_PRESS;                                         // 0x0058   (0x0004)  
	float                                              RUN_DIST_NO_AMMO;                                           // 0x005C   (0x0004)  
	float                                              RUN_DIST_NO_AMMO_SQRT;                                      // 0x0060   (0x0004)  
	int32_t                                            CAN_SHOOTS_TIME_TO_AMBUSH;                                  // 0x0064   (0x0004)  
	float                                              NOT_TO_SEE_ENEMY_TO_WANT_RELOAD_PERCENT;                    // 0x0068   (0x0004)  
	float                                              NOT_TO_SEE_ENEMY_TO_WANT_RELOAD_SEC;                        // 0x006C   (0x0004)  
	float                                              RELOAD_PECNET_NO_ENEMY;                                     // 0x0070   (0x0004)  
	float                                              CHANCE_TO_CHANGE_WEAPON;                                    // 0x0074   (0x0004)  
	float                                              CHANCE_TO_CHANGE_WEAPON_WITH_HELMET;                        // 0x0078   (0x0004)  
	float                                              LOW_DIST_TO_CHANGE_WEAPON;                                  // 0x007C   (0x0004)  
	float                                              FAR_DIST_TO_CHANGE_WEAPON;                                  // 0x0080   (0x0004)  
	float                                              SUPPRESS_BY_SHOOT_TIME;                                     // 0x0084   (0x0004)  
	int32_t                                            SUPPRESS_TRIGGERS_DOWN;                                     // 0x0088   (0x0004)  
	float                                              DIST_TO_CHANGE_TO_MAIN;                                     // 0x008C   (0x0004)  
	float                                              AGS_17_DIST_TO_LEAVE;                                       // 0x0090   (0x0004)  
};

/// Struct /Script/MFNPCAI.CurrentSettings
/// Size: 0x0004 (4 bytes) (0x000000 - 0x000004) align 4 pad: 0x0000
struct FCurrentSettings
{ 
	float                                              LayChanceDangerCoef;                                        // 0x0000   (0x0004)  
};

/// Struct /Script/MFNPCAI.CurveSettings
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FCurveSettings
{ 
	class UCurveFloat*                                 SightCurveDaytime;                                          // 0x0000   (0x0008)  
	class UCurveFloat*                                 SightCureOutLight;                                          // 0x0008   (0x0008)  
};

/// Struct /Script/MFNPCAI.NPCAIWeaponConfigTableRow
/// Size: 0x0068 (104 bytes) (0x000008 - 0x000070) align 8 pad: 0x0000
struct FNPCAIWeaponConfigTableRow : FTableRowBase
{ 
	FString                                            WeaponBlueprintName;                                        // 0x0008   (0x0010)  
	int64_t                                            WeaponId;                                                   // 0x0018   (0x0008)  
	float                                              WeaponBaseSpread;                                           // 0x0020   (0x0004)  
	float                                              WeaponBaseRecoil;                                           // 0x0024   (0x0004)  
	int32_t                                            RecalcMustTimeMin;                                          // 0x0028   (0x0004)  
	int32_t                                            RecalcMustTimeMax;                                          // 0x002C   (0x0004)  
	float                                              FireDistanceMin;                                            // 0x0030   (0x0004)  
	float                                              FireDistanceMax;                                            // 0x0034   (0x0004)  
	float                                              FireIntervalMin;                                            // 0x0038   (0x0004)  
	float                                              FireIntervalMax;                                            // 0x003C   (0x0004)  
	int32_t                                            ReloadCountMin;                                             // 0x0040   (0x0004)  
	int32_t                                            ReloadCountMax;                                             // 0x0044   (0x0004)  
	SDK_UNDEFINED(40,636) /* TWeakObjectPtr<UClass*> */ __um(DefaultBulletClass);                                  // 0x0048   (0x0028)  
};

/// Class /Script/MFNPCAI.NPCAISettingsComponent
/// Size: 0x0A88 (2696 bytes) (0x0000F8 - 0x000B80) align 8 pad: 0x0000
class UNPCAISettingsComponent : public UActorComponent
{ 
public:
	FAimingSettings                                    Aiming;                                                     // 0x00F8   (0x00D0)  
	FBossSettings                                      Boss;                                                       // 0x01C8   (0x0118)  
	FChangeSettings                                    Change;                                                     // 0x02E0   (0x003C)  
	FCoreSettings                                      Core;                                                       // 0x031C   (0x002C)  
	FCoverSettings                                     Cover;                                                      // 0x0348   (0x00C8)  
	FGlobalSettings                                    Global;                                                     // 0x0410   (0x01D4)  
	FGrenadeSettings                                   Grenade;                                                    // 0x05E4   (0x00AC)  
	FHearingSettings                                   Hearing;                                                    // 0x0690   (0x006C)  
	FLaySettings                                       Lay;                                                        // 0x06FC   (0x004C)  
	FLookSettings                                      Look;                                                       // 0x0748   (0x00E0)  
	FMindSettings                                      Mind;                                                       // 0x0828   (0x00F8)  
	FMoveSettings                                      Move;                                                       // 0x0920   (0x0058)  
	FPatrolSettings                                    Patrol;                                                     // 0x0978   (0x0074)  
	FScatteringSettings                                Scattering;                                                 // 0x09EC   (0x0078)  
	FShootSettings                                     Shoot;                                                      // 0x0A64   (0x0094)  
	FCurrentSettings                                   Current;                                                    // 0x0AF8   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0AFC   (0x0004)  MISSED
	FCurveSettings                                     Curve;                                                      // 0x0B00   (0x0010)  
	FNPCAIWeaponConfigTableRow                         Weapon;                                                     // 0x0B10   (0x0070)  
};

/// Class /Script/MFNPCAI.NPCAIStatics
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAIStatics : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIStatics.VectorsIsClosed
	// bool VectorsIsClosed(FVector& A, FVector& B, float XYRange, float ZRange);                                               // [0x2df2090] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.VectorClockwiseAngleR
	// float VectorClockwiseAngleR(FVector& A, FVector& B);                                                                     // [0x2df1fa0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIStatics.VectorAngleR
	// float VectorAngleR(FVector& A, FVector& B, bool bDoNomalize);                                                            // [0x2df1e70] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIStatics.VectorAngleIsClockwise
	// bool VectorAngleIsClockwise(FVector& A, FVector& B);                                                                     // [0x2df1d80] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIStatics.VectorAngleD
	// float VectorAngleD(FVector& A, FVector& B, bool bDoNomalize);                                                            // [0x2df1c50] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIStatics.UnProne
	// void UnProne(class ACharacter* AICharacter);                                                                             // [0x2df1bd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.UnCrouch
	// void UnCrouch(class ACharacter* AICharacter);                                                                            // [0x2df1bd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.TakeDamage
	// float TakeDamage(class AActor* Actor, float Damage, FDamageEvent& DamageEvent, class AController* EventInstigator, class AActor* DamageCauser); // [0x2df1a00] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.StopToTakeCover
	// void StopToTakeCover(class ACharacter* AICharacter);                                                                     // [0x2df1980] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.StopActiveMovement
	// void StopActiveMovement(class ACharacter* AICharacter);                                                                  // [0x2df1900] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.SortIntArraySelf
	// void SortIntArraySelf(TArray<int32_t>& InVal, bool bUpped);                                                              // [0x2df1810] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.SortIntArrayCopy
	// void SortIntArrayCopy(TArray<int32_t>& InVal, TArray<int32_t>& out_ref, bool bUpped);                                    // [0x2df16b0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.SortFloatArraySelf
	// void SortFloatArraySelf(TArray<float>& InVal, bool bUpped);                                                              // [0x2df15c0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.SortFloatArrayCopy
	// void SortFloatArrayCopy(TArray<float>& InVal, TArray<float>& out_ref, bool bUpped);                                      // [0x2df1460] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.SetShootCountRnage
	// bool SetShootCountRnage(class ACharacter* AICharacter, int32_t MinRecalcCount, int32_t MaxRecalcCount);                  // [0x2df1360] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.SetCollisionByFBox
	// void SetCollisionByFBox(class UBoxComponent* BoxCollision, FBox& Box);                                                   // [0x2df12a0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.RotateOnAngleUp
	// FVector RotateOnAngleUp(FVector& InVector, float InAngleDegree);                                                         // [0x2df11b0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIStatics.RInterpTo
	// FRotator RInterpTo(FRotator& Current, FRotator& Target, float DeltaTime, float InterpSpeedV, float InterpSpeedH);        // [0x2df0d10] Final|Native|Static|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIStatics.RInterpConstantTo
	// FRotator RInterpConstantTo(FRotator& Current, FRotator& Target, float DeltaTime, float InterpSpeedV, float InterpSpeedH); // [0x2df0b30] Final|Native|Static|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIStatics.RemoveItemsFromVectors
	// void RemoveItemsFromVectors(TArray<FVector>& inArray, FVector& Location, float XYRange, float ZRange);                   // [0x2df1040] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.RegisterPawnToSenseSource
	// void RegisterPawnToSenseSource(class AActor* InAIPawn);                                                                  // [0x2df0fc0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.RandomNormal
	// float RandomNormal(float Min, float Max);                                                                                // [0x2df0ef0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.Prone
	// void Prone(class ACharacter* AICharacter);                                                                               // [0x2df0ab0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.PrintBTNodeExecuteMessageWithEventName
	// void PrintBTNodeExecuteMessageWithEventName(class AActor* InActor, class UBTNode* InNode, FString Tag, FString Message, bool bLogTime, FString FnName); // [0x2df08b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.PrintBTNodeExecuteMessage
	// void PrintBTNodeExecuteMessage(class AActor* InActor, class UBTNode* InNode, FString Tag, FString Message, bool bLogTime); // [0x2df0700] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.PrintBPLog
	// void PrintBPLog(FString Content);                                                                                        // [0x2df0670] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.PlayAISoundByType
	// void PlayAISoundByType(class ACharacter* AICharacter, EAISoundType CurrType);                                            // [0x2df05b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.OnAIBeginToRunBT
	// void OnAIBeginToRunBT(class AAIController* InAIController);                                                              // [0x2df0530] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.LogBPEnumDefaultNames
	// void LogBPEnumDefaultNames(class UObject* BPEnum);                                                                       // [0x2df04b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.LineTraceIsHitWithResult
	// bool LineTraceIsHitWithResult(class UObject* WorldContext, FVector& StartPos, FVector& EndPos, TEnumAsByte<ECollisionChannel> TraceChannel, bool bTraceComplex, TArray<AActor*>& ActorsToIgnore, bool bIgnoreSelf, FHitResult& HitResult); // [0x2df0190] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.LineTraceIsHitFoliageOrSmoke
	// bool LineTraceIsHitFoliageOrSmoke(class AActor* AIPawn, FVector& StartPos, FVector& EndPos);                             // [0x2df0060] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.LineTraceIsHit
	// bool LineTraceIsHit(class UObject* WorldContext, FVector& StartPos, FVector& EndPos, TEnumAsByte<ECollisionChannel> TraceChannel, bool bTraceComplex, TArray<AActor*>& ActorsToIgnore); // [0x2defe30] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.LineCylinderIntersection
	// bool LineCylinderIntersection(FVector& LineStartPoint, FVector& LineEndPoint, FVector& CylinderCenter, float& CylinderZExtent, float& CylinderRadius); // [0x2defc40] Final|Native|Static|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIStatics.IsVolumeEncompassesPoint
	// bool IsVolumeEncompassesPoint(class AVolume* Volume, FVector& Point, float SphereRadius, float& OutDistance);            // [0x2defae0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsValidLocation
	// bool IsValidLocation(FVector& Location);                                                                                 // [0x2defa50] Final|Native|Static|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIStatics.IsTeamFriendly
	// bool IsTeamFriendly(class AActor* AIPawn, class AActor* InTarget);                                                       // [0x2def980] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsTeamEnemy
	// bool IsTeamEnemy(class AActor* AIPawn, class AActor* InTarget);                                                          // [0x2def8b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsTeamAlly
	// bool IsTeamAlly(class AActor* AIPawn, class AActor* InTarget);                                                           // [0x2def7e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsTeachingAI
	// bool IsTeachingAI(class AActor* InPawnOrCtrl);                                                                           // [0x2def750] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsTargetDead
	// bool IsTargetDead(class AActor* AIPawn, class AActor* TargetPawn);                                                       // [0x2def680] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsTakingCover
	// bool IsTakingCover(class ACharacter* AICharacter);                                                                       // [0x2def5f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsStandaloneTutorialGame
	// bool IsStandaloneTutorialGame(class UObject* WorldContext);                                                              // [0x2def560] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsSameFrame
	// bool IsSameFrame(float T1, float T2);                                                                                    // [0x2def490] Final|Native|Static|Public 
	// Function /Script/MFNPCAI.NPCAIStatics.IsReady
	// bool IsReady(class AActor* Actor);                                                                                       // [0x2def400] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsPMCAI
	// bool IsPMCAI(class AActor* InPawnOrCtrl);                                                                                // [0x2def2e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsPlayingAnimation
	// bool IsPlayingAnimation(class ACharacter* InAI);                                                                         // [0x2def370] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsNPCBoss
	// bool IsNPCBoss(class AActor* InAIPawn);                                                                                  // [0x2def250] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsNPCAICharacter
	// bool IsNPCAICharacter(class AActor* InAIPawn);                                                                           // [0x2def1c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsMoving
	// bool IsMoving(class ACharacter* Character);                                                                              // [0x2def130] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsLastMoveSuccess
	// bool IsLastMoveSuccess(class ACharacter* InAI);                                                                          // [0x2def0a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsInGrass
	// bool IsInGrass(class ACharacter* InCharacter, class ANPCAIPerceptionAssistActor* PerceptionAssist);                      // [0x2deefd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsInAbilityState
	// bool IsInAbilityState(class ACharacter* AIPawn, FName& GameplayTagName);                                                 // [0x2deeef0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsFacingTargetPoint
	// bool IsFacingTargetPoint(class AActor* AIPawn, FVector& ToPoint, float AngleDLimit, char UseCtrlROrActorR);              // [0x2deed90] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsEnemy
	// bool IsEnemy(class AActor* AIPawn, class AActor* InTarget);                                                              // [0x2deecc0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsEnabledBTNodeShared
	// bool IsEnabledBTNodeShared();                                                                                            // [0x2deec90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsEnabledBTNodeOptimize
	// bool IsEnabledBTNodeOptimize();                                                                                          // [0xc12490] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsDead
	// bool IsDead(class AActor* Actor);                                                                                        // [0x2deec00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.IsActive
	// bool IsActive(class AActor* Actor);                                                                                      // [0x2deeb70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.HasAnyPlayerAround
	// bool HasAnyPlayerAround(class AActor* Actor);                                                                            // [0x2deeae0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetWeaponUseTraceChannel
	// TEnumAsByte<ECollisionChannel> GetWeaponUseTraceChannel(class ACharacter* AICharacter);                                  // [0x2deea50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetTimeSeconds
	// float GetTimeSeconds(class UObject* WorldContext);                                                                       // [0x2dee9c0] Final|Native|Static|Public 
	// Function /Script/MFNPCAI.NPCAIStatics.GetTacticSystemActor
	// class ATacticSystemActor* GetTacticSystemActor(class UObject* WorldContext);                                             // [0x2dee930] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetSingleBodyPartLocation
	// FVector GetSingleBodyPartLocation(class ACharacter* InAICharacter, class ACharacter* InCheckTarget, EAIBodyPartType InBodyPartType); // [0x2dee820] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetRandomFoliageTree
	// bool GetRandomFoliageTree(class UObject* WorldContext, FVector& InCenter, FVector& OutLocation, FVector& OutExtent, float InRadiusScope, float TreeMinHeight, float TreeMaxHeight); // [0x2dee5e0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetPerceptionAssistInWorld
	// class ANPCAIPerceptionAssistActor* GetPerceptionAssistInWorld(class UObject* WorldContext);                              // [0x2dee550] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetPerceptionAssistActor
	// class ANPCAIPerceptionAssistActor* GetPerceptionAssistActor(class UObject* WorldContext);                                // [0x2dee4c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetOrCreateGroupRequestController
	// class UNPCAIGroupRequestController* GetOrCreateGroupRequestController(class ACharacter* InAICharacter);                  // [0x2dee430] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetLookSightUseTraceChannel
	// TEnumAsByte<ECollisionChannel> GetLookSightUseTraceChannel(class ACharacter* AICharacter);                               // [0x2dee3a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetLocation
	// FVector GetLocation(class AActor* InAI);                                                                                 // [0x2dee300] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetHierarchicalNavigation
	// class ANPCAIHNavActor* GetHierarchicalNavigation(class UObject* WorldContextObject);                                     // [0x2dee270] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetHealthMax
	// float GetHealthMax(class AActor* Actor);                                                                                 // [0x2dee1e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetHealth
	// float GetHealth(class AActor* Actor);                                                                                    // [0x2dee150] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetGroupRequestController
	// class UNPCAIGroupRequestController* GetGroupRequestController(class ACharacter* InAICharacter);                          // [0x2dee0c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetFBoxVertexs2D
	// void GetFBoxVertexs2D(FBox& Box, TArray<FVector2D>& Vertexs);                                                            // [0x2dedee0] Final|Native|Static|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIStatics.GetFBoxVertexs
	// void GetFBoxVertexs(FBox& Box, TArray<FVector>& Vertexs);                                                                // [0x2dedfd0] Final|Native|Static|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIStatics.GetEQSData
	// class UNPCAICoverEnvQueryData* GetEQSData(class AActor* AIPawn, int32_t QueryID);                                        // [0x2dede10] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetCurrentWeatherAIKnown
	// float GetCurrentWeatherAIKnown(class AActor* AIPawn);                                                                    // [0x2dedd80] Final|Native|Static|Public 
	// Function /Script/MFNPCAI.NPCAIStatics.GetCurrentFogDensity
	// float GetCurrentFogDensity(class UObject* WorldContext);                                                                 // [0x2dedcf0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetCoverSystemActor
	// class ACoverSystemActor* GetCoverSystemActor(class UObject* WorldContext);                                               // [0x2dedc60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetBodyPartEndurace
	// float GetBodyPartEndurace(class AActor* InAIPawn, class AActor* InTargetPawn, EAIBodyPartType InBodyPart);               // [0x2dedb60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetAngOfNormazedVectors
	// float GetAngOfNormazedVectors(FVector& v1, FVector& v2, bool ToAngle, bool ToAbs);                                       // [0x2ded9e0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetAISGDoorManager
	// class UAISGDoorManager* GetAISGDoorManager(class UObject* WorldContext);                                                 // [0x2ded8c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetAISceneEventsTriggerManager
	// class UAISceneEventsTriggerManager* GetAISceneEventsTriggerManager(class UObject* WorldContext);                         // [0x2ded950] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetAIPropertyComponentByClass
	// class UNPCAIPropertyComponent* GetAIPropertyComponentByClass(class AAIController* InAIController, class UClass* InPropertyClass); // [0x2ded7f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetAIPerceptionDynamicActor
	// class ANPCAIPerceptionDynamicActor* GetAIPerceptionDynamicActor(class UObject* WorldContext);                            // [0x2ded760] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetAIMainType
	// EAIMainType GetAIMainType(class AActor* InPawnOrCtrl);                                                                   // [0x2ded6d0] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAIStatics.GetAIController
	// class AAIController* GetAIController(class AActor* InAI);                                                                // [0x2ded640] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetAICharacter
	// class ACharacter* GetAICharacter(class AActor* InAI);                                                                    // [0x2ded5b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.GetAIBodyPartTypeByHitGroupType
	// EAIBodyPartType GetAIBodyPartTypeByHitGroupType(class AActor* InAIPawn, char HitGroupType);                              // [0x2ded4e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.FindNearestFromVectors
	// bool FindNearestFromVectors(TArray<FVector>& inArray, FVector& Location, FVector& OutPoint, float& OutMinDistance);      // [0x2ded340] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.Crouch
	// void Crouch(class ACharacter* AICharacter);                                                                              // [0x2ded2c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.CreateSimpleUniqueID
	// int32_t CreateSimpleUniqueID();                                                                                          // [0x2ded290] Final|Native|Static|Public 
	// Function /Script/MFNPCAI.NPCAIStatics.CreateRandom
	// float CreateRandom(float Value, float Fraction);                                                                         // [0x2ded1c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.CalculateCharacterInLightValue
	// int32_t CalculateCharacterInLightValue(class ACharacter* InAICharacter, class ACharacter* InTarget);                     // [0x2ded0f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.BoxMullerNormal
	// double BoxMullerNormal();                                                                                                // [0x2ded0c0] Final|Native|Static|Public 
	// Function /Script/MFNPCAI.NPCAIStatics.BoxMuller
	// double BoxMuller(double Mean, double StdDev);                                                                            // [0x2decfe0] Final|Native|Static|Public 
	// Function /Script/MFNPCAI.NPCAIStatics.BoardcastDrawDebugLine
	// void BoardcastDrawDebugLine(class AAIController* InAIController, int32_t InDrawID, FVector InStart, FVector InEnd, FColor InColor, float InTime, float InThickness); // [0x2decdb0] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.BeginToTakeCoverCrouch
	// void BeginToTakeCoverCrouch(class ACharacter* AICharacter);                                                              // [0x2decd30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.BeginToTakeCover
	// void BeginToTakeCover(class ACharacter* AICharacter);                                                                    // [0x2deccb0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.AngleNormalized360
	// float AngleNormalized360(float& Value);                                                                                  // [0x2decc10] Final|Native|Static|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCAIStatics.AIDebugPrintSingleMessage
	// void AIDebugPrintSingleMessage(class UObject* WorldContext, FString Tag, FString Content, bool ToScreen, bool ToLog, bool ToShippingLog, FLinearColor LinearColor, float Duration, class AActor* AIActor); // [0x2dec930] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIStatics.AIDebugPrintMultiMessage
	// void AIDebugPrintMultiMessage(class UObject* WorldContext, FString Tag, TArray<FString>& Content, bool ToScreen, bool ToLog, bool ToShippingLog, FLinearColor LinearColor, float Duration, class AActor* AIActor); // [0x2dec610] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIStaticsInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAIStaticsInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.SetAIFactionType
	// void SetAIFactionType(char InFactionType);                                                                               // [0x2e02110] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.ModifyCurrentEndurance
	// bool ModifyCurrentEndurance(float MaxRatio);                                                                             // [0x2e00ca0] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.IsTeamFriendly
	// bool IsTeamFriendly(class AActor* InTarget);                                                                             // [0x2e004d0] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.IsTeamEnemy
	// bool IsTeamEnemy(class AActor* InTarget);                                                                                // [0x2e00430] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.IsTeamAlly
	// bool IsTeamAlly(class AActor* InTarget);                                                                                 // [0x2e00390] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.IsTargetInGhost
	// bool IsTargetInGhost(class AActor* TargetPawn);                                                                          // [0x2e002f0] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.IsScavPlayer
	// bool IsScavPlayer(class ACharacter* InPawn);                                                                             // [0x2dfffc0] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.IsInTransitionAnim
	// bool IsInTransitionAnim(class ACharacter* Character);                                                                    // [0x2dffa60] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.IsInTacticalSwitchWeapon
	// bool IsInTacticalSwitchWeapon();                                                                                         // [0x2dffa30] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.IsInGhost
	// bool IsInGhost();                                                                                                        // [0x28c1d10] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.IsInAbilityState
	// bool IsInAbilityState(class ACharacter* InPawn, FName& GameplayTagName);                                                 // [0x2dff680] Native|Public|HasOutParms|Const 
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.IsFriendlyFactionType
	// bool IsFriendlyFactionType(char RelationType);                                                                           // [0x2dff260] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.IsEnemyArmorCanProtected
	// bool IsEnemyArmorCanProtected(class AActor* InTarget);                                                                   // [0x2dfed60] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.IsAIReady
	// bool IsAIReady(class AActor* TargetPawn);                                                                                // [0x2dfe630] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.IsAIActive
	// bool IsAIActive(class AActor* TargetPawn);                                                                               // [0x2dfe300] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.InitAITrackLOGTemplateStr
	// void InitAITrackLOGTemplateStr(EAITrackLOGType LogType, FString& TemplateStr);                                           // [0x2dfe210] Native|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.GetTargetBodyPartEnduranceRatios
	// void GetTargetBodyPartEnduranceRatios(class AActor* InTarget, TArray<float>& OutEnduranceRatios);                        // [0x2dfd270] Native|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.GetPawnViewLocationIfStand
	// FVector GetPawnViewLocationIfStand();                                                                                    // [0x2dfc9e0] Native|Public|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.GetPawnViewLocationIfCrouch
	// FVector GetPawnViewLocationIfCrouch();                                                                                   // [0x2dfc9a0] Native|Public|HasDefaults 
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.GetNearestPlayerList
	// void GetNearestPlayerList(float InRadius, bool InSight, TArray<AActor*>& PlayerList, char TeamType);                     // [0x2dfc1d0] Native|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.GetNearestPlayer
	// class AActor* GetNearestPlayer(float InRadius, bool InSight, char TeamType);                                             // [0x2dfc0b0] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.GetFootSounderThrower
	// class AActor* GetFootSounderThrower(class AActor* Projectile, bool& OutbAttractAI);                                      // [0x2dfabb0] Native|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.GetFactionRelationTypeWithTarget
	// char GetFactionRelationTypeWithTarget(class ACharacter* TargetPawn);                                                     // [0x2dfaa80] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.GetEQSData
	// class UNPCAICoverEnvQueryData* GetEQSData(int32_t QueryID);                                                              // [0x2dfa910] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.GetCurrentWeather
	// float GetCurrentWeather();                                                                                               // [0x2dfa590] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.GetCurrentWeaponZoomInTimes
	// float GetCurrentWeaponZoomInTimes(class AActor* TargetPawn);                                                             // [0x2dfa4f0] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.GetCurrentWeaponPenetrationLevel
	// int32_t GetCurrentWeaponPenetrationLevel();                                                                              // [0x2dfa4c0] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.GetBulletArmorPenetrationNotHurt
	// float GetBulletArmorPenetrationNotHurt();                                                                                // [0x2dfa200] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.GetBodyPartInArmorProtected
	// bool GetBodyPartInArmorProtected(class AActor* InTarget, TArray<EAIBodyPartType>& OutBodyParts);                         // [0x2dfa100] Native|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.GetBodyPartEndurace
	// float GetBodyPartEndurace(class AActor* InTarget, EAIBodyPartType InBodyPart);                                           // [0x2dfa030] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.GetAliveTeamMembers
	// void GetAliveTeamMembers(class ACharacter* Player, TArray<ACharacter*>& OutTeamMembers);                                 // [0x2df9740] Native|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.GetAIPathGroupID
	// int64_t GetAIPathGroupID();                                                                                              // [0x28c0820] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.GetAIMainType
	// EAIMainType GetAIMainType();                                                                                             // [0x2df93f0] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.GetAIID
	// int64_t GetAIID();                                                                                                       // [0x28c0790] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.GetAIFactionType
	// char GetAIFactionType();                                                                                                 // [0x2df93c0] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.GetAIBodyPartTypeByHitGroupType
	// EAIBodyPartType GetAIBodyPartTypeByHitGroupType(char HitGroupType);                                                      // [0x2df9210] Native|Public        
	// Function /Script/MFNPCAI.NPCAIStaticsInterface.ChangeAIProfileFaction
	// bool ChangeAIProfileFaction(TWeakObjectPtr<UClass*> FactionClass);                                                       // [0x2df7fd0] Native|Public        
};

/// Class /Script/MFNPCAI.NPCAISteepZoneRenderingComponent
/// Size: 0x0000 (0 bytes) (0x0005E0 - 0x0005E0) align 16 pad: 0x0000
class UNPCAISteepZoneRenderingComponent : public UNPCAITestingRenderingComponent
{ 
public:
};

/// Struct /Script/MFNPCAI.SteepZoneDeleteSettings
/// Size: 0x0034 (52 bytes) (0x000000 - 0x000034) align 4 pad: 0x0000
struct FSteepZoneDeleteSettings
{ 
	FVector                                            NavQueryExtent;                                             // 0x0000   (0x000C)  
	bool                                               bHintProjection2D;                                          // 0x000C   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x000D   (0x0003)  MISSED
	float                                              SampleSpacing;                                              // 0x0010   (0x0004)  
	float                                              TraceRadius;                                                // 0x0014   (0x0004)  
	float                                              IncludedAngleTolerance;                                     // 0x0018   (0x0004)  
	float                                              WalkableFloorAngle;                                         // 0x001C   (0x0004)  
	float                                              DensityQuerySize;                                           // 0x0020   (0x0004)  
	unsigned char                                      UnknownData01_6[0x8];                                       // 0x0024   (0x0008)  MISSED
	TEnumAsByte<ECollisionChannel>                     TraceChannel;                                               // 0x002C   (0x0001)  
	bool                                               bTraceComplex;                                              // 0x002D   (0x0001)  
	bool                                               bParallelCollectNavMeshPoly;                                // 0x002E   (0x0001)  
	bool                                               bParallelCalculatePolyNormal;                               // 0x002F   (0x0001)  
	bool                                               bParallelGenerateSamplePoint;                               // 0x0030   (0x0001)  
	bool                                               bParallelCalculatePointNormal;                              // 0x0031   (0x0001)  
	bool                                               bParallelCalculateSteepDensity;                             // 0x0032   (0x0001)  
	bool                                               bParallelModifyTileCache;                                   // 0x0033   (0x0001)  
};

/// Struct /Script/MFNPCAI.NPCAISteepZoneDeleter
/// Size: 0x0180 (384 bytes) (0x000000 - 0x000180) align 16 pad: 0x0000
struct FNPCAISteepZoneDeleter
{ 
	class UObject*                                     WorldContextObject;                                         // 0x0000   (0x0008)  
	unsigned char                                      UnknownData00_6[0x18];                                      // 0x0008   (0x0018)  MISSED
	class UWorld*                                      World;                                                      // 0x0020   (0x0008)  
	unsigned char                                      UnknownData01_6[0x8];                                       // 0x0028   (0x0008)  MISSED
	class ARecastNavMesh*                              MainNavData;                                                // 0x0030   (0x0008)  
	class ANPCAINavMeshManager*                        NavMeshManager;                                             // 0x0038   (0x0008)  
	unsigned char                                      UnknownData02_7[0x140];                                     // 0x0040   (0x0140)  MISSED
};

/// Class /Script/MFNPCAI.NPCAISteepZoneTestingActor
/// Size: 0x01D8 (472 bytes) (0x000318 - 0x0004F0) align 16 pad: 0x0000
class ANPCAISteepZoneTestingActor : public ANPCAITestingActor
{ 
public:
	FSteepZoneDeleteSettings                           Settings;                                                   // 0x0318   (0x0034)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x034C   (0x0004)  MISSED
	FNPCAISteepZoneDeleter                             Deleter;                                                    // 0x0350   (0x0180)  
	float                                              PolyZOffset;                                                // 0x04D0   (0x0004)  
	float                                              NormalScaling;                                              // 0x04D4   (0x0004)  
	float                                              NormalThickness;                                            // 0x04D8   (0x0004)  
	float                                              PolyNormalIncludedAngleTolerance;                           // 0x04DC   (0x0004)  
	float                                              PointNormalIncludedAngleTolerance;                          // 0x04E0   (0x0004)  
	float                                              DisplayableSteepDensity;                                    // 0x04E4   (0x0004)  
	bool                                               bEnableDrawing : 1;                                         // 0x04E8:0 (0x0001)  
	bool                                               bDrawNavMeshPoly : 1;                                       // 0x04E8:1 (0x0001)  
	bool                                               bDrawDetailTriangle : 1;                                    // 0x04E8:2 (0x0001)  
	bool                                               bDrawDetailTriangleNormal : 1;                              // 0x04E8:3 (0x0001)  
	bool                                               bDrawSamplePoint : 1;                                       // 0x04E8:4 (0x0001)  
	bool                                               bDrawSamplePointNormal : 1;                                 // 0x04E8:5 (0x0001)  
	bool                                               bDrawSteepZone : 1;                                         // 0x04E8:6 (0x0001)  
	unsigned char                                      UnknownData01_7[0x7];                                       // 0x04E9   (0x0007)  MISSED
};

/// Class /Script/MFNPCAI.NPCAISteeringInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAISteeringInterface : public UInterface
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAISubSystemStatics
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAISubSystemStatics : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.WantToReCalcGoalEnemy
	// void WantToReCalcGoalEnemy(class AActor* AIPawn);                                                                        // [0x2e047e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.UpdateTargetInfoOnTakeDamage
	// void UpdateTargetInfoOnTakeDamage(class AActor* Casuer, class AActor* Taker, float DamageValue);                         // [0x2e046e0] Final|Native|Static|Public 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.UpdateTargetInfoOnCauseDamage
	// void UpdateTargetInfoOnCauseDamage(class AActor* Casuer, class AActor* Taker, float DamageValue);                        // [0x2e045e0] Final|Native|Static|Public 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.UpdatePersistentFireSetting
	// void UpdatePersistentFireSetting(class AActor* AIPawn, bool CalcShoot, bool CalcSight, class AActor* EnemyTarget, FVector& FireLocation, float FireInterval, bool bIgnoreAimingTime); // [0x2e043b0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.UpdateNaturalFireSetting
	// void UpdateNaturalFireSetting(class AActor* AIPawn, FVector& FireLocation, bool bEnabledRecoilControl, bool bEnabledHitRateControl, bool bIgnoreAimingTime); // [0x2e041f0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.UpdateAIPeekCount
	// void UpdateAIPeekCount(class AActor* AIPawn, int32_t PeekCount);                                                         // [0x2e04130] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.UnregisterSceneEvent
	// void UnregisterSceneEvent(class UObject* WorldContext, class UAISceneEventMessage* SceneEvent);                          // [0x2e04070] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.UnLockGoalEnemy
	// void UnLockGoalEnemy(class AActor* AIPawn);                                                                              // [0x2e03ff0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.TryProne
	// bool TryProne(class AActor* AIOwner);                                                                                    // [0x2e03f60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.TryLean
	// bool TryLean(class AActor* AIOwner, EAILeanType LeanType);                                                               // [0x2e03e90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.TryJump
	// bool TryJump(class AActor* AIPawn, FVector JumpDirection, float JumpSpeed, bool bUseNowVelocity);                        // [0x2e03d30] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.TryCrouchSliding
	// bool TryCrouchSliding(class AActor* AIOwner);                                                                            // [0x2e03ca0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.TryCrouch
	// bool TryCrouch(class AActor* AIOwner);                                                                                   // [0x2e03c10] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.TryCasualStandingPose
	// bool TryCasualStandingPose(class AActor* AIOwner, bool bCasual);                                                         // [0x2e03b40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.TriggerSceneEventDIY
	// int32_t TriggerSceneEventDIY(class UObject* WorldContext, ENPCAISceneEventID eventId, FVector& Location, float ValidScope, float ValidTime, TArray<int64_t>& AIIDs, TArray<int64_t>& AIPathGroupIDs, float CoverRange); // [0x2e03890] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.TriggerSceneEvent
	// int32_t TriggerSceneEvent(class UObject* WorldContext, ENPCAISceneEventID eventId, FVector& Location, float CoverRange); // [0x2e03730] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.TestDir
	// bool TestDir(class UObject* WorldContextObject, FVector& HeadPosition, FVector& Direction, float Distance, FVector& OutPosition); // [0x2e03560] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.Test4Sides
	// FVector Test4Sides(class UObject* WorldContextObject, FVector Direction, FVector& HeadPosition, float PATROL_MIN_LIGHT_DIST); // [0x2e033c0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.StopRescueOtherDBNOTeammate
	// void StopRescueOtherDBNOTeammate(class AActor* InAIPawn);                                                                // [0x2e03340] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.StopPickUpBoxContainer
	// void StopPickUpBoxContainer(class AActor* InAIPawn);                                                                     // [0x2e032c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.StopPersistentFire
	// void StopPersistentFire(class AActor* AIPawn);                                                                           // [0x2e03240] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.StartPersistentFire
	// void StartPersistentFire(class AActor* AIPawn, float DurationTime);                                                      // [0x2e03180] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.ShouldTriggerMine
	// bool ShouldTriggerMine(class AActor* AIPawnOrController);                                                                // [0x2e030f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.ShortQueryPathToPoint
	// void ShortQueryPathToPoint(class AActor* AIPawn, FVector& InPointToGo, TArray<FVector>& PathPoints);                     // [0x2e02fc0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.SetupTearGasAreas
	// void SetupTearGasAreas(class UObject* WorldContextObject, FVector& Center, FVector& EffectExtent, bool bActiving);       // [0x2e02e60] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.SetupFlanking
	// void SetupFlanking(class AActor* InOwner, FVector& InDangerPoint, FVector& InDangerPointDirection, float InDangerPointEffectRange); // [0x2e02d00] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.SetSightWeakenTime
	// void SetSightWeakenTime(class AActor* AIPawn, float WeakenTime);                                                         // [0x2e02c40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.SetOpenWeaponADS
	// void SetOpenWeaponADS(class AActor* AIPawn, bool bOpenOrClose);                                                          // [0x2e02b80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.SetIsInTryLeanShoot
	// void SetIsInTryLeanShoot(class AActor* InAIPawn, bool bTryLean, float CheckInterval);                                    // [0x2e02a70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.SetGroupEnemyHatredValue
	// void SetGroupEnemyHatredValue(class AActor* InAIOwner, class AActor* InEnemy, int32_t InHatredValue, float IndateTime, bool InbCalucateGoalEnemy); // [0x2e028e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.SetEnemyHatredValue
	// void SetEnemyHatredValue(class AActor* InAIPawn, class AActor* InEnemy, int32_t InHatredValue, float IndateTime, bool bEffectGroup, bool InbCalucateGoalEnemy); // [0x2e02710] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.SetCurrentMoveType
	// void SetCurrentMoveType(class AActor* AIOwner, EAIMoveType InMoveType);                                                  // [0x2e02650] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.SetAvoidNavAreas
	// void SetAvoidNavAreas(class UObject* WorldContext, TArray<int64_t>& AvoidPolyRefs, bool bAvoid);                         // [0x2e02520] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.SetAIProtectTreasureBox
	// void SetAIProtectTreasureBox(class AActor* AIPawn, class AActor* TreasureBox);                                           // [0x2e02190] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.SetAimingPoint
	// void SetAimingPoint(class AActor* AIPawn, FVector& AimingPoint);                                                         // [0x2e02460] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.SetAimingBodyPartWeightInRuntime
	// void SetAimingBodyPartWeightInRuntime(class AActor* InAIPawn, EAIBodyPartType InBodyPart, float InWeight, bool bIsForPlayer); // [0x2e02310] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.SetAimingBodyPartTrend
	// void SetAimingBodyPartTrend(class AActor* AIPawn, EAIAimingBodyPartTrend AimingTrend);                                   // [0x2e02250] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.SetAICallUpResult
	// void SetAICallUpResult(class AActor* AIPawn, char Result);                                                               // [0x2e02050] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.SetAICallUpReason
	// void SetAICallUpReason(class AActor* AIPawn, char reason);                                                               // [0x2e01f90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.SearchBehaviorService
	// class UBTService* SearchBehaviorService(class AAIController* InAIController, FString InNodeName);                        // [0x2e01e60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.ResumeAIBehaviorLogic
	// void ResumeAIBehaviorLogic(class AActor* AIPawn, FString reason);                                                        // [0x2e01d90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.RescueDBNOAITeammate
	// bool RescueDBNOAITeammate(class AActor* InAIPawn, class AActor* InTarget);                                               // [0x2e01cc0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.RequestStopMovement
	// void RequestStopMovement(class AActor* InOwner);                                                                         // [0x2e01c40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.RemoveSuspectedPoint
	// void RemoveSuspectedPoint(class AActor* AIPawn, class UNPCAIAttentionPoint* InAttentionPoint, bool bRemoveNearCanSee);   // [0x2e01b40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.RemoveEnemyInAllGroup
	// void RemoveEnemyInAllGroup(class AActor* InEnemy);                                                                       // [0x2e01ac0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.RemoveAimingTypeInRuntime
	// void RemoveAimingTypeInRuntime(class AActor* InAIPawn, EAIBodyBulkType InBodyBulk, bool bIsForPlayer);                   // [0x2e019c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.RegisterSceneEvent
	// int32_t RegisterSceneEvent(class UObject* WorldContext, class UAISceneEventMessage* SceneEvent, FVector& Location, float CoverRange); // [0x2e01860] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.RefreshNavigationMainData
	// void RefreshNavigationMainData(class UObject* WorldContext);                                                             // [0x2e017e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.QuitToDynamicGroup
	// void QuitToDynamicGroup(class AActor* InAIPawn);                                                                         // [0x2e01760] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.QueryPathLengthFromAIToPoint
	// float QueryPathLengthFromAIToPoint(class AActor* AIPawn, FVector& PointToGo, int64_t PointPolyRef);                      // [0x2e01640] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.PointIsInMolotov
	// bool PointIsInMolotov(class AActor* InAIPawn, FVector InPoint);                                                          // [0x2e01560] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.PointIsInBombRange
	// bool PointIsInBombRange(class UObject* WorldContext, FVector InPoint, ENPCAIPerceptibleTile InTile);                     // [0x2e01440] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.PointIsAroundAI
	// bool PointIsAroundAI(class AActor* AIPawn, FVector& PointToGo, int64_t PointPolyRef);                                    // [0x2e01320] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.PickupInventory
	// bool PickupInventory(class AActor* InAIPawn, class AActor* Inventory, bool bCheckIsCanAdd, float WaitSeconds);           // [0x2e011c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.PickUpBoxContainer
	// void PickUpBoxContainer(class AActor* InAIPawn, class AActor* BoxContainer, bool bCheckIsCanAdd, float InDelayStarttime, float InPickUpInterval); // [0x2e01020] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.PauseAIBehaviorLogic
	// void PauseAIBehaviorLogic(class AActor* AIPawn, FString reason, float PauseTime);                                        // [0x2e00f00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.OpenDoor
	// void OpenDoor(class AActor* InAIPawn, class AActor* InDoor);                                                             // [0x2e00e40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.MultiJoinToDynamicGroup
	// void MultiJoinToDynamicGroup(int32_t DyGroupId, TArray<AActor*>& InAIPawns);                                             // [0x2e00d40] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.ModifyAICurrentEndurance
	// bool ModifyAICurrentEndurance(class AActor* AIPawn, float MaxRatio);                                                     // [0x2e00bd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.LookToPoint
	// void LookToPoint(class AActor* AIOwner, FVector InPoint, float InRotateSpeedInDegree, float AcceleratedSpeedInDegree, bool bQuickly); // [0x2e00a20] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.LookToMovingDirection
	// void LookToMovingDirection(class AActor* AIOwner, float RotateSpeedInDegree, float AcceleratedSpeedInDegree);            // [0x2e00920] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.LockLookToPoint
	// void LockLookToPoint(class AActor* AIOwner, float LockTime);                                                             // [0x2e00860] Final|Native|Static|Public 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.LockGoalEnemy
	// class UNPCAITargetInfo* LockGoalEnemy(class AActor* AIPawn, class AActor* EnemyPawn);                                    // [0x2e00790] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.JoinToGroupTogetherForTest
	// void JoinToGroupTogetherForTest(TArray<AActor*>& AIPawns);                                                               // [0x2e006d0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.JoinToDynamicGroup
	// bool JoinToDynamicGroup(int32_t DyGroupId, class AActor* InAIPawn);                                                      // [0x2e00600] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsWaitingStartAiming
	// bool IsWaitingStartAiming(class AActor* AIPawn);                                                                         // [0x2e00570] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsSightWeakenByFlashProjectile
	// void IsSightWeakenByFlashProjectile(class AActor* AIPawn, bool& IsWeaken, float& RemainTime);                            // [0x2e001d0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsSightWeakenByFlashLight
	// bool IsSightWeakenByFlashLight(class AActor* AIPawn, float& SightWeaknScaleValue, FVector& LightLocation, class ACharacter*& LightOwnerCharacter); // [0x2e00060] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsRecentlyFire
	// bool IsRecentlyFire(class AActor* AIPawn, float InSeconds);                                                              // [0x2dffef0] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsPersistentFiring
	// bool IsPersistentFiring(class AActor* AIPawn);                                                                           // [0x2dffe60] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsOpeningDoor
	// bool IsOpeningDoor(class AActor* AIPawn);                                                                                // [0x2dffdd0] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsLODStatus
	// bool IsLODStatus(class AActor* AIPawn);                                                                                  // [0x2dffb90] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsLockingGoalEnemy
	// class UNPCAITargetInfo* IsLockingGoalEnemy(class AActor* AIPawn, bool& IsLocking);                                       // [0x2dffcf0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsLockDoor
	// bool IsLockDoor(class AActor* InAIPawn, class AActor* InDoor);                                                           // [0x2dffc20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsJumping
	// bool IsJumping(class AActor* AIPawn);                                                                                    // [0x2dffb00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsInPullBolt
	// bool IsInPullBolt(class AActor* AIPawn);                                                                                 // [0x2dff9a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsInOpenDoorStatus
	// bool IsInOpenDoorStatus(class AActor* InAIPawn);                                                                         // [0x2dff910] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsInMolotovHurted
	// bool IsInMolotovHurted(class AActor* InAIPawn);                                                                          // [0x2dff880] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsInDynamicGroup
	// bool IsInDynamicGroup(class AActor* InAIPawn);                                                                           // [0x2dff7f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsInCrossFireState
	// bool IsInCrossFireState(class AActor* AIPawn);                                                                           // [0x2dff760] Final|Native|Static|Public 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsImmuneTearGas
	// bool IsImmuneTearGas(class AActor* AIPawn);                                                                              // [0x2dff5f0] Final|Native|Static|Public 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsGroupEnemy
	// bool IsGroupEnemy(class AActor* InAIOwner, class AActor* InTarget);                                                      // [0x2dff520] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsGroupAlly
	// bool IsGroupAlly(class AActor* InAIOwner, class AActor* InTarget);                                                       // [0x2dff450] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsGoalPositionReached
	// bool IsGoalPositionReached(class AActor* InOwner);                                                                       // [0x2dff3c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsGoalEnemyThreaten
	// bool IsGoalEnemyThreaten(class AActor* InAIPawn, float ThreatenDistance);                                                // [0x2dff2f0] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsFaceToPoint
	// bool IsFaceToPoint(class AActor* InAIPawn, FVector InPoint);                                                             // [0x2dff180] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsEnoughAllyKillInRange
	// bool IsEnoughAllyKillInRange(class AActor* InAIPawn, FVector& InSearchCenter, float InSearchRange, float InSearchTime, int32_t InSearchCount); // [0x2dfefc0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsEnoughAllyDeathInRange
	// bool IsEnoughAllyDeathInRange(class AActor* InAIPawn, FVector& InSearchCenter, float InSearchRange, float InSearchTime, int32_t InSearchCount); // [0x2dfee00] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsEnabledAimingBodyPartLOGDebug
	// bool IsEnabledAimingBodyPartLOGDebug(class AActor* AIPawn);                                                              // [0x1dfa670] Final|Native|Static|Public 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsDynamicGroupExist
	// bool IsDynamicGroupExist(class AActor* InAIPawn, int32_t DyGroupId);                                                     // [0x2dfec90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsDoorOpened
	// bool IsDoorOpened(class AActor* InAIPawn, class AActor* InDoor);                                                         // [0x2dfebc0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsDoorInDirectionOfMe
	// class AActor* IsDoorInDirectionOfMe(class AActor* InAIPawn, FVector& InDirection, float InRange);                        // [0x2dfeaa0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsDBNO
	// bool IsDBNO(class AActor* InAIPawn, class AActor* InTargetPawn);                                                         // [0x2dfe9d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsCrouchSliding
	// bool IsCrouchSliding(class AActor* AIOwner);                                                                             // [0x2dfe940] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsCompletedPickUpBoxContainer
	// bool IsCompletedPickUpBoxContainer(class AActor* InAIPawn);                                                              // [0x2dfe8b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsCloseToDestination
	// bool IsCloseToDestination(class AActor* InOwner, float InCloseRadius);                                                   // [0x2dfe7e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsBeingFireHited
	// bool IsBeingFireHited(class AActor* InAIPawn, float InTime, class AActor*& OutFirePawn);                                 // [0x2dfe6d0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsAIRLAgentActionReload
	// bool IsAIRLAgentActionReload(class AAIController* AIController);                                                         // [0x2dfe5a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsAIProtectingTreasureBox
	// bool IsAIProtectingTreasureBox(class AActor* AIPawn, class AActor*& TreaureBox);                                         // [0x2dfe4c0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsAIInBombRange
	// bool IsAIInBombRange(class AActor* AIPawn);                                                                              // [0x2dfe430] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.IsAIDBNO
	// bool IsAIDBNO(class AActor* InAIPawn);                                                                                   // [0x2dfe3a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.HasPlacePickUpInventory
	// bool HasPlacePickUpInventory(class AActor* InAIPawn, class AActor* Inventory);                                           // [0x2dfe140] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.HasOthersAllyInShootScope
	// bool HasOthersAllyInShootScope(class AActor* InAIPawn);                                                                  // [0x2dfe0b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.HasNoDBNOAllyInGroup
	// bool HasNoDBNOAllyInGroup(class AActor* InAIOwner);                                                                      // [0x2dfe020] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GroupAllyDeathToDo
	// void GroupAllyDeathToDo(class AActor* InAIPawn, FVector& InKillerLocation);                                              // [0x2dfdf60] Final|Native|Static|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GoToPoint
	// void GoToPoint(class AActor* InOwner, FVector InPosition, TArray<AVolume*>& AvoidVolumes, bool bSlowAtTheEnd, float InReachDist, bool bShoudGetUp, bool bGetUpWithCheck, class AActor* CaredActor, float CaredActorEffectRadius, int32_t GoDecision); // [0x2dfdc30] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GoDirectly
	// void GoDirectly(class AActor* InOwner, FVector& Direction, float Seconds, FVector InBlendingVelocity);                   // [0x2dfdac0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GoAccordingToWayPoints
	// void GoAccordingToWayPoints(class AActor* InOwner, FNavSkeletonGraphFindResult& PathResult, FNavSkeletonMoveSettings& Settings); // [0x2dfd960] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GiveInventoryToAI
	// bool GiveInventoryToAI(class AActor* AIPawn, int64_t ItemID);                                                            // [0x2dfd890] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetZoneGroupInfo
	// class UNPCAIZoneGroupInfo* GetZoneGroupInfo(class AActor* InAIOwner);                                                    // [0x2dfd800] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetZoneGroupAllyTotalDeathNum
	// int32_t GetZoneGroupAllyTotalDeathNum(class AActor* AIPawn);                                                             // [0x2dfd770] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetYoungestSuspectedPoint
	// class UNPCAIAttentionPoint* GetYoungestSuspectedPoint(class AActor* InCharacter, float InRadius, bool InPriorityDanger); // [0x2dfd670] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetUp
	// void GetUp(class AActor* AIOwner, bool bWithCheck);                                                                      // [0x2dfd5b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetTargetInSightBodyPartsLocation
	// float GetTargetInSightBodyPartsLocation(class AActor* AIPawn, class AActor* TargetPawn, TArray<FVector>& BodyPartsLocation); // [0x2dfd480] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetTargetBodyPartEnduranceRatios
	// void GetTargetBodyPartEnduranceRatios(class AActor* AIPawn, class AActor* InTarget, TArray<float>& OutEnduranceRatios);  // [0x2dfd360] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetSightLookStartPointByPose
	// FVector GetSightLookStartPointByPose(class AActor* InAIPawn, EAIPose& AIPose, EAILeanType& AILean, class UNPCAIPropertyComponent_Look* InLookProps); // [0x2dfd0d0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetSceneEventInfo
	// bool GetSceneEventInfo(class UObject* WorldContext, int32_t EvtUniqueId, FNPCAISceneEventInfo& OutEvent);                // [0x2dfcf70] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetSceneEvent
	// class UAISceneEventMessage* GetSceneEvent(class UObject* WorldContext, int32_t EvtUniqueId);                             // [0x2dfcea0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetRandomReachablePointUseFilter
	// FVector GetRandomReachablePointUseFilter(class UObject* WorldContext, FVector InPoint, float InRadius, class UClass* FilterClass); // [0x2dfcd10] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetRandomReachablePoint
	// FVector GetRandomReachablePoint(class AActor* InAIPawn, FVector InCenter, float InRadius);                               // [0x2dfcbe0] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetRandomNavigationPoint
	// FVector GetRandomNavigationPoint(class AActor* InAIPawn, FVector InCenter, float InRadius);                              // [0x2dfcab0] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetPoseType
	// EAIPose GetPoseType(class ACharacter* Character);                                                                        // [0x2dfca20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetPathAcrossLastDoorInfo
	// bool GetPathAcrossLastDoorInfo(class AActor* AIPawn, FAISafetyOpenDoorResp& AcrossDoorInfo);                             // [0x2dfc8d0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetOpenDoorSuitableLocation
	// FVector GetOpenDoorSuitableLocation(class AActor* InAIPawn, class AActor* InDoor);                                       // [0x2dfc7f0] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetOpenDoorSafetyPoints
	// void GetOpenDoorSafetyPoints(class AActor* AIPawn, class AActor* InDoor, FVector NavLinkPoint, TArray<FAIDoorSingleSafetyPoint>& SafetyPoints, int32_t& PointsNum); // [0x2dfc630] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetNearReachablePointEscapeBombArea
	// FVector GetNearReachablePointEscapeBombArea(class UObject* WorldContext, FVector InPoint, float InRadius, TArray<ENPCAIPerceptibleTile>& EscapeTiles); // [0x2dfbad0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetNearestScavPlayerList
	// void GetNearestScavPlayerList(class AActor* InAIPawn, TArray<AActor*>& ScavPlayerList, float InRadius, bool InSight);    // [0x2dfc490] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetNearestScavPlayer
	// class AActor* GetNearestScavPlayer(class AActor* InAIPawn, float InRadius, bool InSight);                                // [0x2dfc390] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetNearestPMCPlayer
	// class AActor* GetNearestPMCPlayer(class AActor* InAIPawn, float InRadius, bool InSight);                                 // [0x2dfbfb0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetNearestInventoryCanPickUp
	// class AActor* GetNearestInventoryCanPickUp(class AActor* InAIPawn, float InRange, bool bIgnoreChecked, float PathLength); // [0x2dfbe50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetNearestDBNOAITeammate
	// class AActor* GetNearestDBNOAITeammate(class AActor* InAIPawn, float InRange);                                           // [0x2dfbd80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetNearbyDoor
	// class AActor* GetNearbyDoor(class AActor* InAIPawn, float InRadius, bool bWantNearest);                                  // [0x2dfbc80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetLeanType
	// EAILeanType GetLeanType(class AActor* AIOwner);                                                                          // [0x2dfba40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetLatestAllyDeathInfo
	// bool GetLatestAllyDeathInfo(class AActor* InAIPawn, FAIGroupAllyDeathInfo& OutDeathInfo);                                // [0x2dfb970] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetLastMoveResult
	// ENPCAIMoveResult GetLastMoveResult(class AActor* AIOwner);                                                               // [0x2dfb8e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetLastBeHitedTime
	// float GetLastBeHitedTime(class AActor* InAIPawn);                                                                        // [0x2dfb850] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetIsInTryLeanShoot
	// bool GetIsInTryLeanShoot(class AActor* InAIPawn);                                                                        // [0x2dfb7c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetInventorysCanPickUp
	// bool GetInventorysCanPickUp(class AActor* InAIPawn, float InRange, float PathLength, bool bIgnoreChecked, TArray<AActor*>& OutInventorys); // [0x2dfb5f0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetIfOverlapOther
	// class ACharacter* GetIfOverlapOther(class AActor* InAIPawn, float InRadius);                                             // [0x2dfb520] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetGunShootStartPointByPose
	// FVector GetGunShootStartPointByPose(class AActor* InAIPawn, EAIPose& AIPose, EAILeanType& AILean, class UNPCAIPropertyComponent_Shoot* InShootProps); // [0x2dfb380] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetGunShootStartPointAtLocation
	// FVector GetGunShootStartPointAtLocation(class AActor* InAIPawn, FVector& InActorLocation, EAIPose& AIPose, EAILeanType& AILean); // [0x2dfb1d0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetGunShootStartPoint
	// FVector GetGunShootStartPoint(class AActor* AIPawn);                                                                     // [0x2dfb130] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetGroupSharedEnemySingleInfoByTarget
	// class UNPCAIEnemyGroupSingleInfo* GetGroupSharedEnemySingleInfoByTarget(class AActor* InAIPawn, class AActor* InTargetPawn); // [0x2dfb060] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetGroupSharedEnemySingleInfo
	// class UNPCAIEnemyGroupSingleInfo* GetGroupSharedEnemySingleInfo(class AActor* InAIOwner, class UNPCAITargetInfo* InEnemyInfo); // [0x2dfaf90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetGroupEnemyHartedValue
	// int32_t GetGroupEnemyHartedValue(class AActor* InAIOwner, class AActor* InEnemy);                                        // [0x2dfaec0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetGoalEnemyPerson
	// class ACharacter* GetGoalEnemyPerson(class AActor* InAIPawn);                                                            // [0x2dfae30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetGoalEnemyInfo
	// class UNPCAITargetInfo* GetGoalEnemyInfo(class AActor* InAIPawn);                                                        // [0x2dfada0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetFootSounderThrower
	// class AActor* GetFootSounderThrower(class AActor* AIPawn, class AActor* FootSounder, bool& OutbAttractAI);               // [0x2dfac90] Final|Native|Static|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetFireHitEnemyLastTimeUsePredestined
	// float GetFireHitEnemyLastTimeUsePredestined(class AActor* InAIPawn);                                                     // [0x2dfab20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetEnemyHartedValue
	// int32_t GetEnemyHartedValue(class AActor* InAIPawn, class AActor* InEnemy);                                              // [0x2dfa9b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetDynamicGroupRequestController
	// class UNPCAIGroupRequestController* GetDynamicGroupRequestController(int32_t DyGroupId, class UObject* InWorldContext);  // [0x2dfa840] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetDynamicGroupInfo
	// class UNPCAIDynamicGroupInfo* GetDynamicGroupInfo(class AActor* InAIPawn);                                               // [0x2dfa7b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetDSGetMuzzleFlashSocketLocation
	// FVector GetDSGetMuzzleFlashSocketLocation(class ACharacter* Character);                                                  // [0x2dfa670] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetDestination
	// FVector GetDestination(class AActor* InOwner);                                                                           // [0x2dfa710] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetDBNOBeRescureLocation
	// FVector GetDBNOBeRescureLocation(class AActor* InAIPawnWhoDBNO);                                                         // [0x2dfa5d0] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetCurrentMoveType
	// EAIMoveType GetCurrentMoveType(class AActor* AIOwner);                                                                   // [0x2dfa430] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetCurrentDynamicGroupId
	// int32_t GetCurrentDynamicGroupId(class AActor* InAIPawn);                                                                // [0x2dfa3a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetCharactersIfOverlapOther
	// bool GetCharactersIfOverlapOther(class AActor* InAIPawn, float InRadius, TArray<AActor*>& OverlapCharacters);            // [0x2dfa240] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetAllSceneEvents
	// void GetAllSceneEvents(class UObject* WorldContext, TArray<UAISceneEventMessage*>& SceneEvents);                         // [0x2df9f50] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetAllSceneEventInfoListWithAI
	// void GetAllSceneEventInfoListWithAI(class UObject* WorldContext, int64_t AIID, int64_t AIPathGroupID, FVector& AILocation, TArray<FNPCAISceneEventInfo>& OutEventInfos); // [0x2df9d70] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetAllInSightEnemysBySelf
	// TArray<AActor*> GetAllInSightEnemysBySelf(class AActor* InAIPawn);                                                       // [0x2df9ca0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetAllInSightEnemysByGroup
	// TArray<AActor*> GetAllInSightEnemysByGroup(class AActor* InAIPawn);                                                      // [0x2df9bd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetAllHadSeenEnemysBySelf
	// TArray<AActor*> GetAllHadSeenEnemysBySelf(class AActor* InAIPawn);                                                       // [0x2df9b00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetAllHadSeenEnemysByGroup
	// TArray<AActor*> GetAllHadSeenEnemysByGroup(class AActor* InAIPawn);                                                      // [0x2df9a30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetAllAllyDeathInfo
	// void GetAllAllyDeathInfo(class AActor* InAIPawn, TArray<FAIGroupAllyDeathInfo>& OutDeathInfoList);                       // [0x2df9950] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetAliveTeamMembers
	// void GetAliveTeamMembers(class AActor* AIPawn, class AActor* Player, TArray<ACharacter*>& OutTeamMembers);               // [0x2df9830] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetAIPeekCount
	// int32_t GetAIPeekCount(class AActor* AIPawn);                                                                            // [0x2df9420] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetAimingTypeWeightInRuntime
	// float GetAimingTypeWeightInRuntime(class AActor* InAIPawn, EAIBodyBulkType InBodyBulk, bool bIsForPlayer);               // [0x2df9630] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetAimingPoint
	// FVector GetAimingPoint(class AActor* AIPawn);                                                                            // [0x2df9590] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetAimingOffset
	// FVector GetAimingOffset(class AActor* AIPawn, float WeakenTime);                                                         // [0x2df94b0] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetAICallUpResult
	// char GetAICallUpResult(class AActor* AIPawn);                                                                            // [0x2df9330] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetAICallUpReason
	// char GetAICallUpReason(class AActor* AIPawn);                                                                            // [0x2df92a0] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetAIBeTakeDamageDetail
	// void GetAIBeTakeDamageDetail(class AActor* AIPawn, class ACharacter*& DamageCauser, FVector& CauserLocation, FVector& TakerLocation, float& DamageValue); // [0x2df8fa0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetAIBeenHitCount
	// int32_t GetAIBeenHitCount(class AActor* AIPawn);                                                                         // [0x2df9180] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.GetAIAcceptedSceneEventsInProgress
	// void GetAIAcceptedSceneEventsInProgress(class AActor* AIPawn, TArray<UAISceneEventMessage*>& SceneEvents);               // [0x2df8ec0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.FindTargetInfo
	// class UNPCAITargetInfo* FindTargetInfo(class AActor* InAIPawn, class AActor* InTargetPawn);                              // [0x2df8df0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.FindRushDangerCanStopPoint
	// bool FindRushDangerCanStopPoint(class AActor* InAIPawn, FVector& InCheckPoint, FVector& StopPoint, float InBackDist);    // [0x2df8c80] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.FindPathToPoint
	// TArray<FVector> FindPathToPoint(class AActor* InAIPawn, FVector& InPointStart, FVector& InPointToGo);                    // [0x2df8b10] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.FindAmbushAgainstPoint
	// bool FindAmbushAgainstPoint(class AActor* InAIPawn, FVector InPointStart, FVector InPointToGo, FVector& OutPoint);       // [0x2df8980] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.DismissDynamicGroupById
	// void DismissDynamicGroupById(int32_t DyGroupId, class UObject* InWorldContext);                                          // [0x2df88c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.DismissDynamicGroup
	// void DismissDynamicGroup(class AActor* InAIPawn);                                                                        // [0x2df8840] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.DisableFlanking
	// void DisableFlanking(class AActor* InOwner);                                                                             // [0x2df87c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.CreateDynamicGroup
	// class UNPCAIDynamicGroupInfo* CreateDynamicGroup(class AActor* InAIPawn, class UClass* DynamicGroupClass);               // [0x2df86f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.CloseDoor
	// void CloseDoor(class AActor* InAIPawn, class AActor* InDoor);                                                            // [0x2df8630] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.CheckFireCanHitPenetration
	// bool CheckFireCanHitPenetration(class AActor* InAIPawn, FHitResult& InHitResult);                                        // [0x2df8500] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.CheckCanStackGun
	// bool CheckCanStackGun(class AActor* InAIPawn, class AActor* InTargetPawn, EAIPose& OutAIPose, EAILeanType& OutAILean, FVector& OutShotPoint, float InCheckTargetRadius); // [0x2df82d0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.CheckCanGotoPoint
	// bool CheckCanGotoPoint(class UObject* WorldContext, FVector& InPointStart, FVector& InPointToGo, float LimitLenght);     // [0x2df8160] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.CheckAIGroupDBNOWipeOut
	// void CheckAIGroupDBNOWipeOut(class AActor* InAIPawn);                                                                    // [0x2df80e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.CanTryProne
	// bool CanTryProne(class AActor* AIPawn);                                                                                  // [0x2df7ec0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.CanShootPointIfOnStandPoint
	// bool CanShootPointIfOnStandPoint(class AActor* AIPawn, FVector& StandPoint, FVector& TargetPoint, class AActor* IgnoreActor, bool bIgnoreCharacters); // [0x2df7cf0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.CanShootPoint
	// bool CanShootPoint(class AActor* InAIPawn, FVector InShootPoint, class AActor* IgnoreActor, bool bIgnoreCharacters);     // [0x2df7b90] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.CanSeePointIfOnStandPoint
	// bool CanSeePointIfOnStandPoint(class AActor* AIPawn, FVector& StandPoint, FVector& TargetPoint, class AActor* IgnoreActor, bool bIgnoreCharacters); // [0x2df79c0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.CanSeePoint
	// bool CanSeePoint(class AActor* InAIPawn, FVector InPoint, class AActor* IgnoreActor, bool bIgnoreCharacters);            // [0x2df7860] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.CanOpenDoor
	// bool CanOpenDoor(class AActor* InAIPawn, class AActor* InDoor);                                                          // [0x2df7790] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.CanclePickUpInventory
	// void CanclePickUpInventory(class AActor* InAIPawn);                                                                      // [0x2df7f50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.CalculateRequiredAimingTime
	// float CalculateRequiredAimingTime(class AActor* AIPawn, FVector& AimingPoint);                                           // [0x2df76c0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.CalculatePathLengthToPoint
	// float CalculatePathLengthToPoint(class UObject* WorldContext, FVector& InPointStart, FVector& InPointToGo);              // [0x2df7590] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.CalculateGroupMembersGoalEnemy
	// void CalculateGroupMembersGoalEnemy(class AActor* InAIOwner);                                                            // [0x2df7510] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.AIUseInventoryByClass
	// bool AIUseInventoryByClass(class AActor* InAIPawn, class UClass* InventoryClass);                                        // [0x2df6fd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.AIStopFire
	// void AIStopFire(class AActor* AIPawn);                                                                                   // [0x2df6f50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.AIStartFire
	// bool AIStartFire(class AActor* AIPawn);                                                                                  // [0x2df6ec0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.AIGiveUpSceneEvent
	// void AIGiveUpSceneEvent(class AActor* AIPawn, class UAISceneEventMessage* SceneEvent);                                   // [0x2df6e00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.AICompleteSceneEvent
	// void AICompleteSceneEvent(class AActor* AIPawn, class UAISceneEventMessage* SceneEvent);                                 // [0x2df6d40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.AIAcceptSceneEvent
	// bool AIAcceptSceneEvent(class AActor* AIPawn, class UAISceneEventMessage* SceneEvent);                                   // [0x2df6c70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.AddToGroupEnemy
	// void AddToGroupEnemy(class AActor* InAIPawn, class AActor* InEnemy, bool IsTemporary, float TemporaryTime, bool IsLetOthersAllyKnow); // [0x2df7370] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.AddToGroupAlly
	// void AddToGroupAlly(class AActor* InAIPawn, class AActor* InTargetPawn);                                                 // [0x2df72b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.AddInventoryToIgnorePickUp
	// void AddInventoryToIgnorePickUp(class AActor* InAIPawn, class AActor* Inventory);                                        // [0x2df71f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAISubSystemStatics.AddAimingTypeInRuntime
	// void AddAimingTypeInRuntime(class AActor* InAIPawn, EAIBodyBulkType InBodyBulk, float InWeight, bool bIsForPlayer);      // [0x2df70a0] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAISystem
/// Size: 0x0008 (8 bytes) (0x000148 - 0x000150) align 8 pad: 0x0000
class UNPCAISystem : public UAISystem
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0148   (0x0008)  MISSED
};

/// Class /Script/MFNPCAI.NPCAITacticSystemComponent
/// Size: 0x0018 (24 bytes) (0x000108 - 0x000120) align 8 pad: 0x0000
class UNPCAITacticSystemComponent : public UNPCAISubSystemComponent
{ 
public:
	int32_t                                            OccupyPointID;                                              // 0x0108   (0x0004)  
	float                                              TimeGetEnemyList;                                           // 0x010C   (0x0004)  
	class UCoverSystem*                                CoverSystem;                                                // 0x0110   (0x0008)  
	class ATacticSystemActor*                          TacticSystemActor;                                          // 0x0118   (0x0008)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.UnOccupyTacticPoint
	// bool UnOccupyTacticPoint(int32_t PointID);                                                                               // [0x2e09880] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.SetCurrentTacticPointID
	// void SetCurrentTacticPointID(int32_t PointID);                                                                           // [0x2e094c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.PointIsOccupy
	// bool PointIsOccupy(int32_t PointID);                                                                                     // [0x2e09210] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.OccupyTacticPoint
	// bool OccupyTacticPoint(int32_t PointID);                                                                                 // [0x2e09170] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.IsSafeForOneEnemy
	// bool IsSafeForOneEnemy(FVector& InPointLocation, TArray<FActionPointRadianSafe>& InOrientRadianSafetys, FVector& InEnemyPos); // [0x2e08f30] Final|Native|Protected|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.IsSafeForAllEnemy
	// bool IsSafeForAllEnemy(FVector& InPointLocation, TArray<FActionPointRadianSafe>& InOrientRadianSafetys);                 // [0x2e08e20] Final|Native|Protected|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.GetTotalTacticPointNum
	// int32_t GetTotalTacticPointNum();                                                                                        // [0x2e08bd0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.GetTacticPointData
	// bool GetTacticPointData(int32_t PointID, FTacticPointData& PointData);                                                   // [0x2e089e0] Final|Native|Public|HasOutParms|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.GetPointOccupiedTaker
	// class AActor* GetPointOccupiedTaker(int32_t PointID);                                                                    // [0x2e08940] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.GetKeyRoutePointDataByUniqueIndex
	// bool GetKeyRoutePointDataByUniqueIndex(int32_t PointUniqueIndex, FKeyRoutePointData& PointData);                         // [0x2e085b0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.GetKeyRoutePointData
	// bool GetKeyRoutePointData(int32_t PointID, FKeyRoutePointData& PointData);                                               // [0x2e08470] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.GetFarthestTacticPointInList
	// bool GetFarthestTacticPointInList(FVector InCenter, TArray<FTacticPointData>& InPointsList, FTacticPointData& OutPoint); // [0x2e080a0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.GetCurrentTacticPointID
	// int32_t GetCurrentTacticPointID();                                                                                       // [0x29ae320] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.GetCurrentTacticPointData
	// bool GetCurrentTacticPointData(FTacticPointData& PointData);                                                             // [0x2e07ec0] Final|Native|Public|HasOutParms|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.GetClosestTacticPointInList
	// bool GetClosestTacticPointInList(FVector InCenter, TArray<FTacticPointData>& InPointsList, FTacticPointData& OutPoint);  // [0x2e07ca0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.FindTacticPointsInRadius
	// bool FindTacticPointsInRadius(FVector InCenter, float InRadius, TArray<FTacticPointData>& OutPoints, TArray<ETacticPointType>& InFindType, float ZLimit); // [0x2e07790] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.FindSafeToPointByKeyRoute
	// bool FindSafeToPointByKeyRoute(FVector& ToPoint, float InRadius, TArray<FKeyRoutePointData>& OutPaths, int32_t InDepth); // [0x2e075a0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.FindPathByKeyRoute
	// bool FindPathByKeyRoute(FKeyRoutePointData& FromPoint, FKeyRoutePointData& ToPoint, EAIKeyRouteQueryType QueryType, TArray<FKeyRoutePointData>& OutPaths); // [0x2e072f0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.FindNearestSingleTacticPoint
	// bool FindNearestSingleTacticPoint(FVector InCenter, float InRadius, FTacticPointData& OutPoint, TArray<ETacticPointType>& InFindType, float ZLimit); // [0x2e070b0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.FindBestKeyRoutePoint
	// bool FindBestKeyRoutePoint(FVector& InCenter, float InRadius, FKeyRoutePointData& OutPointData, EAIKeyRouteQueryType QueryType); // [0x2e06ed0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.CheckPointIsAvailable
	// bool CheckPointIsAvailable(int32_t PointID);                                                                             // [0x2e06e30] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.CheckPointIsActivationForAim
	// bool CheckPointIsActivationForAim(int32_t PointID, class AActor* ThreatTarget, FVector ThreatTargetLoc, FRotator& AimRot); // [0x2e06ca0] Native|Event|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.CheckActivation
	// bool CheckActivation(int32_t PointID);                                                                                   // [0x2e06c00] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.CanShootToTarget
	// bool CanShootToTarget(int32_t PointID, class AActor* InEnemy);                                                           // [0x2e06b30] Native|Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.CanOverWatch
	// bool CanOverWatch(int32_t PointID, class AActor* ThreatTarget, FVector InThreatTargetLocation, FRotator& OutAimRot);     // [0x2e06970] Native|Event|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.CanEscape
	// bool CanEscape(int32_t PointID, FVector InPosition);                                                                     // [0x2e06880] Native|Event|Public|HasDefaults|BlueprintCallable|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.CalculateTacticPointIsSafeById
	// bool CalculateTacticPointIsSafeById(int32_t PointID);                                                                    // [0x2e067e0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.CalculateTacticPointIsSafe
	// bool CalculateTacticPointIsSafe(FTacticPointData& PointData);                                                            // [0x2e066e0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.CalculateKeyRouteSaftyInDepth
	// bool CalculateKeyRouteSaftyInDepth(FKeyRoutePointData& InKeyRoutePointData, TArray<int32_t>& OutPointsIndexs, int32_t InDepth, bool bSort); // [0x2e06450] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITacticSystemComponent.CalculateKeyRoutePointIsSafe
	// bool CalculateKeyRoutePointIsSafe(FKeyRoutePointData& InKeyRoutePointData);                                              // [0x2e06340] Final|Native|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAITargetInfo
/// Size: 0x02D8 (728 bytes) (0x000060 - 0x000338) align 8 pad: 0x0000
class UNPCAITargetInfo : public UNPCAITargetInfoBase
{ 
public:
	TArray<EAIBodyPartType>                            BodyPartsInArmor;                                           // 0x0060   (0x0010)  
	float                                              LastCalculateBodyPartsInArmorTime;                          // 0x0070   (0x0004)  
	unsigned char                                      UnknownData00_6[0x254];                                     // 0x0074   (0x0254)  MISSED
	class AActor*                                      Person;                                                     // 0x02C8   (0x0008)  
	class AActor*                                      AIPawn;                                                     // 0x02D0   (0x0008)  
	class UNPCAIEnemyGroupSingleInfo*                  EnemyGroupSingleInfo;                                       // 0x02D8   (0x0008)  
	class UNPCAIPropertyComponent_Look*                LookProps;                                                  // 0x02E0   (0x0008)  
	class UNPCAIPropertyComponent_Aiming*              AimingProps;                                                // 0x02E8   (0x0008)  
	EAIEnemyVisibilityType                             VisibileOnlyBySense;                                        // 0x02F0   (0x0001)  
	unsigned char                                      UnknownData01_7[0x47];                                      // 0x02F1   (0x0047)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAITargetInfo.ShallSeenEnemy
	// bool ShallSeenEnemy();                                                                                                   // [0x2e09850] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAITargetInfo.ShallKnowEnemy
	// bool ShallKnowEnemy();                                                                                                   // [0x2e09820] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAITargetInfo.SetVisibleFlashLight
	// void SetVisibleFlashLight(bool InVisible);                                                                               // [0x2e09790] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.SetVisible
	// void SetVisible(bool InVisible);                                                                                         // [0x2e09700] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.SetEnemyGroupSingleInfo
	// void SetEnemyGroupSingleInfo(class UNPCAIEnemyGroupSingleInfo* Info);                                                    // [0x2e09550] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAITargetInfo.SetCanShoot
	// void SetCanShoot(bool Value);                                                                                            // [0x2e09430] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.ResetCalculatePartInterval
	// void ResetCalculatePartInterval();                                                                                       // [0x2e092f0] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAITargetInfo.RandomUpperPartToShoot
	// void RandomUpperPartToShoot();                                                                                           // [0x2e092d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.RandomArmToShoot
	// void RandomArmToShoot();                                                                                                 // [0x2e092b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.IsWantShootArmorPart
	// bool IsWantShootArmorPart();                                                                                             // [0x2e09150] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAITargetInfo.IsVisibleFlashLight
	// bool IsVisibleFlashLight(float FlashLightSeeDuration);                                                                   // [0x2e090c0] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAITargetInfo.IsVisible
	// bool IsVisible();                                                                                                        // [0x2e09090] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.IsRealVisible
	// bool IsRealVisible();                                                                                                    // [0x2e08df0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.IsPersonValid
	// bool IsPersonValid();                                                                                                    // [0x2e08dc0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.IsInShotProtectedTime
	// bool IsInShotProtectedTime();                                                                                            // [0x2e08d90] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.IsHideInGrassOrSmoke
	// bool IsHideInGrassOrSmoke();                                                                                             // [0x2e08d60] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAITargetInfo.IsDBNO
	// bool IsDBNO();                                                                                                           // [0x2e08d30] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.IsArmorCanProtected
	// bool IsArmorCanProtected(EAIBodyPartType PartType, bool bReCalculate);                                                   // [0x2e08c60] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.HaveSeenPerson
	// bool HaveSeenPerson();                                                                                                   // [0x2e08c30] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetVisibleOnlyBySense
	// EAIEnemyVisibilityType GetVisibleOnlyBySense();                                                                          // [0x2e08c00] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetPersonDeadTime
	// float GetPersonDeadTime();                                                                                               // [0x2e08910] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetPersonActorLocation
	// FVector GetPersonActorLocation();                                                                                        // [0x2e088d0] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetPerson
	// class AActor* GetPerson();                                                                                               // [0x2e088a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetPartTypeToShoot
	// EAIBodyPartType GetPartTypeToShoot();                                                                                    // [0x2e08870] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetPartToShootOfGrassRatio
	// float GetPartToShootOfGrassRatio();                                                                                      // [0x2e08840] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetPartToShootOfBarrier
	// ENPCAISenseBarrier GetPartToShootOfBarrier();                                                                            // [0x2e08810] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetPartToShoot
	// FVector GetPartToShoot();                                                                                                // [0x2e087d0] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetLastFireTime
	// float GetLastFireTime();                                                                                                 // [0x2e087a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetLastFireMeTime
	// float GetLastFireMeTime();                                                                                               // [0x2e08770] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetInSightBodyPartsLocation
	// float GetInSightBodyPartsLocation(TArray<FVector>& BodyPartsLocation);                                                   // [0x2e083b0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetGroupSharedTimeLastSeen
	// float GetGroupSharedTimeLastSeen();                                                                                      // [0x2e08380] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetGroupSharedPositionLastSeen
	// FVector GetGroupSharedPositionLastSeen();                                                                                // [0x2e08340] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetGroupSharedPositionEstimate
	// FVector GetGroupSharedPositionEstimate();                                                                                // [0x2e08300] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetEnemyLastPosition
	// FVector GetEnemyLastPosition();                                                                                          // [0x2e08060] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetEnemyGroupSingleInfo
	// class UNPCAIEnemyGroupSingleInfo* GetEnemyGroupSingleInfo();                                                             // [0x2e08030] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetEnemyEstimatePosition
	// FVector GetEnemyEstimatePosition();                                                                                      // [0x2e07ff0] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetDistance
	// float GetDistance();                                                                                                     // [0x2e07fc0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetCurrentPositon
	// FVector GetCurrentPositon();                                                                                             // [0x2e07e80] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetCanSeeBodyPartsNum
	// int32_t GetCanSeeBodyPartsNum();                                                                                         // [0x2e07c70] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetBodyPartVisibleInfo
	// bool GetBodyPartVisibleInfo(EAIBodyPartType InBodyPart, FAIBodyPartVisibilityInfo& OutInfo);                             // [0x2e07b70] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetBodyPartCanShoot
	// bool GetBodyPartCanShoot(EAIBodyPartType& InBodyPart);                                                                   // [0x2e07ad0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetAllBodyPartVisibleInfo
	// TArray<FAIBodyPartVisibilityInfo> GetAllBodyPartVisibleInfo();                                                           // [0x2e079f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.GetAlivePerson
	// class AActor* GetAlivePerson();                                                                                          // [0x2e079c0] Final|Native|Public|BlueprintCallable|Const 
	// Function /Script/MFNPCAI.NPCAITargetInfo.CanShoot
	// bool CanShoot();                                                                                                         // [0x2e06b00] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.CalculatePartToShoot
	// void CalculatePartToShoot(bool bIgnoreInterval);                                                                         // [0x2e06650] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITargetInfo.CalculateBodyPartForShoot
	// void CalculateBodyPartForShoot(bool InCanHead, bool InCanChest, bool InStomach, bool InCanLArm, bool InCanRArm, bool InCanLLeg, bool InCanRLeg); // [0x2e060f0] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAITargetInfo.CalculateBodyPartByEnemyArmor
	// void CalculateBodyPartByEnemyArmor();                                                                                    // [0x2e060d0] Final|Native|Public  
};

/// Struct /Script/MFNPCAI.AIGroupAllyDeathInfo
/// Size: 0x001C (28 bytes) (0x000000 - 0x00001C) align 4 pad: 0x0000
struct FAIGroupAllyDeathInfo
{ 
	float                                              DeathTime;                                                  // 0x0000   (0x0004)  
	FVector                                            DeathLocation;                                              // 0x0004   (0x000C)  
	FVector                                            KillerLocation;                                             // 0x0010   (0x000C)  
};

/// Class /Script/MFNPCAI.NPCAITeam
/// Size: 0x0098 (152 bytes) (0x000028 - 0x0000C0) align 8 pad: 0x0000
class UNPCAITeam : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x10];                                      // 0x0028   (0x0010)  MISSED
	FAIShotCountStat                                   AllyBeHitCount;                                             // 0x0038   (0x0010)  
	TArray<class AActor*>                              AllyList;                                                   // 0x0048   (0x0010)  
	TArray<class AActor*>                              PlayerAllyList;                                             // 0x0058   (0x0010)  
	TArray<class UNPCAIEnemyGroupSingleInfo*>          EnemyInfoList;                                              // 0x0068   (0x0010)  
	TArray<class AActor*>                              NeutralList;                                                // 0x0078   (0x0010)  
	TArray<class UNPCAIAttentionPoint*>                SuspectedPoints;                                            // 0x0088   (0x0010)  
	TArray<FAIGroupAllyDeathInfo>                      AllyDeathList;                                              // 0x0098   (0x0010)  
	class UNPCAIGroupRequestController*                GroupRequestController;                                     // 0x00A8   (0x0008)  
	class UActorComponent*                             FactionComponent;                                           // 0x00B0   (0x0008)  
	unsigned char                                      UnknownData01_7[0x8];                                       // 0x00B8   (0x0008)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAITeam.UpdateTemporaryEnemyEndTime
	// void UpdateTemporaryEnemyEndTime(class AActor* InEnemy, float InEndTime);                                                // [0x2e0ff50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.UpdateGroupEnemyEstimatePosition
	// void UpdateGroupEnemyEstimatePosition(class AActor* InEnemy, FVector InPosition);                                        // [0x2e0fe70] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.UpdateEnemyVisibleInfo
	// void UpdateEnemyVisibleInfo(class AActor* InEnemy, FVector InLastSeenPosition, float InLastSeenTime);                    // [0x2e0fd50] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.SwitchToEnemy
	// bool SwitchToEnemy(class AActor* InMember);                                                                              // [0x2e0eca0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.SwitchEnemyToNeutral
	// bool SwitchEnemyToNeutral(class AActor* InEnemy);                                                                        // [0x2e0ec00] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.SwitchEnemyToAlly
	// bool SwitchEnemyToAlly(class AActor* InEnemy);                                                                           // [0x2e0eb60] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.SetTemporaryEnemyInfo
	// void SetTemporaryEnemyInfo(class AActor* InEnemy, bool InIsTemporaryEnemy, float InEndTime, bool InIsFromAlly);          // [0x2e0ea00] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.SetEnemyHartedValue
	// void SetEnemyHartedValue(class AActor* InEnemy, int32_t InHartedValue, float IndateTime);                                // [0x2e0e8f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.RemoveSuspectedPointByType
	// void RemoveSuspectedPointByType(ENPCPlaceForCheckType InPlaceType, class AActor* InCreator);                             // [0x2e0e820] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.RemoveSuspectedPoint
	// void RemoveSuspectedPoint(class ACharacter* AIPawn, class UNPCAIAttentionPoint* InAttentionPoint, bool bRemoveNearCanSee); // [0x2e0e710] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.RemoveNeutral
	// void RemoveNeutral(class AActor* InNeutral);                                                                             // [0x2e0e680] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.RemoveNearSuspectedPoint
	// void RemoveNearSuspectedPoint(class UObject* WorldContext, FVector& InLocation, float XYRange, float ZRange, float PointExistTime); // [0x2e0e4d0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.RemoveFromTeam
	// bool RemoveFromTeam(class AActor* C, bool bRemoveAll);                                                                   // [0x2e0e400] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.RemoveEnemyInfo
	// void RemoveEnemyInfo(class UNPCAIEnemyGroupSingleInfo* SingleInfo);                                                      // [0x2e0e370] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.RemoveEnemy
	// void RemoveEnemy(class AActor* InEnemy);                                                                                 // [0x2e0e2e0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.RemoveAlly
	// void RemoveAlly(class AActor* InAlly);                                                                                   // [0x2e0e250] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.IsNeutral
	// bool IsNeutral(class AActor* InNeutral);                                                                                 // [0x2e0dd50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.IsGroupEnemy
	// bool IsGroupEnemy(class AActor* InEnemy);                                                                                // [0x2e0dcb0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.IsEnoughAllyKillInRange
	// bool IsEnoughAllyKillInRange(class UObject* WorldContext, FVector& InSearchCenter, float& InSearchRange, float& InSearchTime, int32_t& InSearchCount); // [0x2e0dac0] Final|Native|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAITeam.IsEnoughAllyDeathInRange
	// bool IsEnoughAllyDeathInRange(class UObject* WorldContext, FVector& InSearchCenter, float& InSearchRange, float& InSearchTime, int32_t& InSearchCount); // [0x2e0d8d0] Final|Native|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAITeam.IsAlly
	// bool IsAlly(class AActor* InAlly);                                                                                       // [0x2e0d830] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.GetYoungestSuspectedPoint
	// class UNPCAIAttentionPoint* GetYoungestSuspectedPoint(class AActor* InPawn, float InRadius, bool InPriorityDanger);      // [0x2e0d680] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.GetValidPointsCount
	// int32_t GetValidPointsCount();                                                                                           // [0x2e0d650] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.GetTeamMembers
	// TArray<AActor*> GetTeamMembers();                                                                                        // [0x2e0d4d0] Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCAITeam.GetSuspectedPointsNum
	// int32_t GetSuspectedPointsNum();                                                                                         // [0x2e0d4a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.GetSuspectedPoints
	// TArray<UNPCAIAttentionPoint*> GetSuspectedPoints();                                                                      // [0x2e0d420] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.GetPlayerAllyList
	// TArray<AActor*> GetPlayerAllyList();                                                                                     // [0x2e0d3e0] Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAITeam.GetNeutralsNum
	// int32_t GetNeutralsNum();                                                                                                // [0x2e0d3b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.GetNearestSuspectedPoint
	// class UNPCAIAttentionPoint* GetNearestSuspectedPoint(FVector& InLocation, float Range, float& OutMinDist);               // [0x2e0d280] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.GetNearEnemyNum
	// int32_t GetNearEnemyNum(FVector InCenter, float InRadius);                                                               // [0x2e0d0c0] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.GetLatestAllyDeathInfo
	// bool GetLatestAllyDeathInfo(FAIGroupAllyDeathInfo& OutDeathInfo);                                                        // [0x2e0d020] Final|Native|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCAITeam.GetGroupRequestController
	// class UNPCAIGroupRequestController* GetGroupRequestController();                                                         // [0x2e0cf50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.GetGroupKnowEnemys
	// void GetGroupKnowEnemys(class AActor* AIPawn, float InRange, TArray<AActor*>& Enemys, int32_t& EnemysNum, bool bIncludeEnemys); // [0x2e0cd60] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.GetFactionComp
	// class UActorComponent* GetFactionComp();                                                                                 // [0x2e0c890] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.GetEnemyNum
	// int32_t GetEnemyNum();                                                                                                   // [0x18d1470] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.GetEnemyInfoList
	// TArray<UNPCAIEnemyGroupSingleInfo*> GetEnemyInfoList();                                                                  // [0x2e0c800] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.GetEnemyInfo
	// class UNPCAIEnemyGroupSingleInfo* GetEnemyInfo(class AActor* InTarget);                                                  // [0x2e0c760] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.GetEnemyHartedValue
	// int32_t GetEnemyHartedValue(class AActor* InEnemy);                                                                      // [0x2e0c6c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.GetAllyTotalDeathNum
	// int32_t GetAllyTotalDeathNum();                                                                                          // [0x2e0c4c0] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAITeam.GetAllyList
	// TArray<AActor*> GetAllyList();                                                                                           // [0x2db7860] Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCAITeam.GetAllInSightEnemys
	// void GetAllInSightEnemys(float InWorldTimeSeconds, TArray<AActor*>& InEnemys);                                           // [0x2e0c1b0] Final|Native|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCAITeam.GetAllHadSeenEnemys
	// void GetAllHadSeenEnemys(float InWorldTimeSeconds, TArray<AActor*>& InEnemys);                                           // [0x2e0c090] Final|Native|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCAITeam.GetAllAllyDeathInfo
	// void GetAllAllyDeathInfo(TArray<FAIGroupAllyDeathInfo>& OutDeathInfoList);                                               // [0x2e0bfe0] Final|Native|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCAITeam.FilterInValidTemporaryEnemys
	// void FilterInValidTemporaryEnemys(float InTimeSeconds);                                                                  // [0x2e0bd30] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAITeam.FilterInValidSuspectedPoints
	// void FilterInValidSuspectedPoints();                                                                                     // [0x2e0bd10] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAITeam.FilterInValidEnemys
	// void FilterInValidEnemys(float DeleteInterval);                                                                          // [0x2e0bc90] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAITeam.FilterInValidAllyAndNeutrals
	// void FilterInValidAllyAndNeutrals();                                                                                     // [0x2e0bc70] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAITeam.AddToTeam
	// bool AddToTeam(class AActor* C);                                                                                         // [0x2e0bbd0] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.AddPointToSearch
	// class UNPCAIAttentionPoint* AddPointToSearch(class AActor* InActor, FVector InPosition, ENPCPlaceForCheckType InPlaceType, class AActor* InCreator); // [0x2e0ba50] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.AddNeutral
	// void AddNeutral(class AActor* InNeutral);                                                                                // [0x2e0b9c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.AddEnemyForAllyKnow
	// void AddEnemyForAllyKnow(class AActor* InEnemy);                                                                         // [0x2e0b930] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.AddEnemy
	// class UNPCAIEnemyGroupSingleInfo* AddEnemy(class AActor* InEnemy);                                                       // [0x2e0b890] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeam.AddAllyDeathInfo
	// void AddAllyDeathInfo(FVector& InDeathLocation, FVector& InKillerLocation, float InNowTime);                             // [0x2e0b760] Final|Native|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAITeam.AddAlly
	// void AddAlly(class AActor* InAlly);                                                                                      // [0x2e0b6d0] Native|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAITeamInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAITeamInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAITeamInterface.RemoveAlly
	// void RemoveAlly(class AActor* InAlly);                                                                                   // [0x2867d60] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeamInterface.IsAlly
	// bool IsAlly(class AActor* InAlly);                                                                                       // [0x2e0d790] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeamInterface.HasNoDBNOAlly
	// bool HasNoDBNOAlly(class AActor* InSelf);                                                                                // [0x2dfe630] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeamInterface.GetNearestAlly
	// class AActor* GetNearestAlly(class AActor* AIPawn, float MaxRange);                                                      // [0x2e0d1b0] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeamInterface.GetHealthyAllyNum
	// int32_t GetHealthyAllyNum(class AActor* IgnorePawn);                                                                     // [0x2e0cf80] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeamInterface.GetAllyNum
	// int32_t GetAllyNum();                                                                                                    // [0x2e0c490] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeamInterface.GetAllyList
	// TArray<AActor*> GetAllyList();                                                                                           // [0x2e0c450] Native|Public        
	// Function /Script/MFNPCAI.NPCAITeamInterface.GetAllyGoalEnemys
	// void GetAllyGoalEnemys(TArray<UNPCAITargetInfo*>& GoalEnemysList);                                                       // [0x2e0c3a0] Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeamInterface.GetAllyGoalEnemyNearest
	// class UNPCAITargetInfo* GetAllyGoalEnemyNearest(class AActor* AIPawn, float InRange);                                    // [0x2e0c2d0] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeamInterface.GetAliveAllysNum
	// int32_t GetAliveAllysNum(class AActor* IgnorePawn, bool bContainDBNO);                                                   // [0x2e0bf10] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeamInterface.GetAliveAllys
	// void GetAliveAllys(class AActor* IgnorePawn, bool bContainDBNO, TArray<AActor*>& AliveAllys);                            // [0x2e0bdb0] Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeamInterface.FilterInValidAllys
	// void FilterInValidAllys();                                                                                               // [0x2dae3b0] Native|Public        
	// Function /Script/MFNPCAI.NPCAITeamInterface.AllyPostDied
	// void AllyPostDied(class AActor* InAlly);                                                                                 // [0x29cc070] Native|Public|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITeamInterface.AddAlly
	// void AddAlly(class AActor* InAlly);                                                                                      // [0x28673f0] Native|Public|BlueprintCallable 
};

/// Class /Script/MFNPCAI.NPCAIThrowSystem
/// Size: 0x0008 (8 bytes) (0x000030 - 0x000038) align 8 pad: 0x0000
class UNPCAIThrowSystem : public UWorldSubsystem
{ 
public:
	float                                              INVALID_THROW_ANGLE_BP;                                     // 0x0030   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0034   (0x0004)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCAIThrowSystem.PretestGrenadeTrajectory
	// FHitResult PretestGrenadeTrajectory(class UObject* WorldContextObject, class AActor* AttackerActor, FVector& ThrowLocation, FVector& TargetLocation, float InitSpeed, float ThrowAngle, float& FlyingTime); // [0x2e0ddf0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIThrowSystem.GetThrowRotator
	// FRotator GetThrowRotator(FVector& ActorLocation, FVector& TargetLocation, float ThrowAngle);                             // [0x2e0d510] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIThrowSystem.GetFlyingTime
	// float GetFlyingTime(FVector& ThrowLocation, FVector& TargetLocation, float InitSpeed, float ThrowAngle);                 // [0x2e0cbf0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIThrowSystem.GetFesiableGrenadeThrowAngle
	// float GetFesiableGrenadeThrowAngle(class UObject* WorldContextObject, class AActor* AttackerActor, FVector& ActorLocation, FVector& TargetLocation, float InitSpeed, EAIPose PoseType, EAILeanType LeanType, bool bMustThrow, bool bHigherFirst, float& FlyingTime); // [0x2e0c8d0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAIThrowSystem.GetCandidateGrenadeThrowAngles
	// TArray<float> GetCandidateGrenadeThrowAngles(class UObject* WorldContextObject, FVector& ThrowLocation, FVector& TargetLocation, float InitSpeed); // [0x2e0c4f0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
};

/// Struct /Script/MFNPCAI.AITrackLOG
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 8 pad: 0x0000
struct FAITrackLOG
{ 
	EAITrackLOGType                                    LogType;                                                    // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0001   (0x0007)  MISSED
	int64_t                                            LOGTime;                                                    // 0x0008   (0x0008)  
	FString                                            LOGKValues;                                                 // 0x0010   (0x0010)  
};

/// Class /Script/MFNPCAI.AITrackLOGUnit
/// Size: 0x0028 (40 bytes) (0x000028 - 0x000050) align 8 pad: 0x0000
class UAITrackLOGUnit : public UObject
{ 
public:
	class AActor*                                      AIPawn;                                                     // 0x0028   (0x0008)  
	FString                                            AIName;                                                     // 0x0030   (0x0010)  
	TArray<FAITrackLOG>                                TrackLOGList;                                               // 0x0040   (0x0010)  
};

/// Class /Script/MFNPCAI.NPCAITrackLogger
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAITrackLogger : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAITrackLogger.TrackLOG_Shoot
	// void TrackLOG_Shoot(class AActor* AIPawn, FString EnemyName, bool bUsePredestined, char PartWantToShoot, FVector& PositionWantToShoot, char PartActualShoot, FVector& PositionActualShoot); // [0x2e0fb10] Final|Native|Static|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCAITrackLogger.TrackLOG_AimingTime
	// void TrackLOG_AimingTime(class AActor* AIPawn, FString EnemyName, float OffsetRatio, float ElapsedAimingTime, float RequiredAimingTime, float AimingProgress, float RawRatio, float MaxAimPrecicing, float CurrPrecicingSpd); // [0x2e0f850] Final|Native|Static|Public 
	// Function /Script/MFNPCAI.NPCAITrackLogger.TrackLOG_AimingPredestined
	// void TrackLOG_AimingPredestined(class AActor* AIPawn, FString EnemyName, bool IsHit, float FinalRate, float RandomValue, float PredestinedRate, int32_t RepeatIndex, float ShotHeadRate, float AIMoveRate, float EnemyMoveRate, float ArmBrokenRate, int32_t ArmBrokenCount, float BattleDurationRate, float InCoverSafeRate, float BeHitedRate, float WeaponAdsMoaBiasRate, float GrassRate, float FlashLightRate); // [0x2e0f320] Final|Native|Static|Public 
	// Function /Script/MFNPCAI.NPCAITrackLogger.TrackLOG_AimingBodyPart
	// void TrackLOG_AimingBodyPart(class AActor* AIPawn, FString EnemyName, char PartAiming, int8_t bHeadCanSee, int8_t bChestCanSee, int8_t bStomachCanSee, int8_t bLArmCanSee, int8_t bRArmCanSee, int8_t bLLegCanSee, int8_t bRLegCanSee); // [0x2e0f030] Final|Native|Static|Public 
	// Function /Script/MFNPCAI.NPCAITrackLogger.TrackLOG
	// void TrackLOG(class AActor* AIPawn, EAITrackLOGType& LogType, TArray<FString>& KValues);                                 // [0x2e0eed0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFNPCAI.NPCAITrackLogger.ToTrackLOGString
	// FString ToTrackLOGString(FAITrackLOG& LOGData, FString TemplateStr, bool bIncludeTime);                                  // [0x2e0ed40] Final|Native|Static|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCAITrackLogger.PrintTrackLOG
	// void PrintTrackLOG(class AActor* AIPawn, class UNPCAIGlobalSharedInfo* SharedVariables, EAITrackLOGType& LogType, TArray<FString>& KValues); // [0x2e0e0b0] Final|Native|Static|Public|HasOutParms 
};

/// Class /Script/MFNPCAI.AIPortraitBase
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UAIPortraitBase : public UObject
{ 
public:
};

/// Class /Script/MFNPCAI.AIPortraitDefault
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UAIPortraitDefault : public UAIPortraitBase
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIUALootSubAreaVolumeInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAIUALootSubAreaVolumeInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCAIUALootSubAreaVolumeInterface.GetBattleIntensityExpectation
	// int32_t GetBattleIntensityExpectation();                                                                                 // [0x2e12e00] Native|Public|Const  
};

/// Class /Script/MFNPCAI.NPCAIVolumeInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCAIVolumeInterface : public UInterface
{ 
public:
};

/// Class /Script/MFNPCAI.NPCAIZoneGroupInfo
/// Size: 0x0028 (40 bytes) (0x0000C0 - 0x0000E8) align 8 pad: 0x0000
class UNPCAIZoneGroupInfo : public UNPCAITeam
{ 
public:
	int32_t                                            FactionType;                                                // 0x00C0   (0x0004)  
	int32_t                                            GroupType;                                                  // 0x00C4   (0x0004)  
	int32_t                                            SquadID;                                                    // 0x00C8   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x00CC   (0x0004)  MISSED
	TArray<class UNPCAIDynamicGroupInfo*>              DynamicGroupList;                                           // 0x00D0   (0x0010)  
	class UWorld*                                      WorldPrivate;                                               // 0x00E0   (0x0008)  


	/// Functions
	// Function /Script/MFNPCAI.NPCAIZoneGroupInfo.GetDynamicGroupInfo
	// class UNPCAIDynamicGroupInfo* GetDynamicGroupInfo(int32_t GroupID);                                                      // [0x2e15af0] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAIZoneGroupInfo.CreateDynamicGroup
	// class UNPCAIDynamicGroupInfo* CreateDynamicGroup(class AActor* InCreator, class UClass* DynamicGroupClass);              // [0x2e15900] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCAIZoneGroupInfo.BP_OnInitGroupMessage
	// void BP_OnInitGroupMessage(int32_t InGroupType);                                                                         // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAIZoneGroupInfo.BP_OnAllyRemoved
	// void BP_OnAllyRemoved(class AActor* InAlly);                                                                             // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAIZoneGroupInfo.BP_OnAllyDied
	// void BP_OnAllyDied(class AActor* InAlly);                                                                                // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAIZoneGroupInfo.BP_OnAllyAdded
	// void BP_OnAllyAdded(class AActor* InAlly);                                                                               // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCAIZoneGroupInfo.AutoReleaseDynamicGroup
	// void AutoReleaseDynamicGroup();                                                                                          // [0x2e158e0] Final|Native|Public  
};

/// Class /Script/MFNPCAI.NPCBehaviorLOD
/// Size: 0x0030 (48 bytes) (0x000028 - 0x000058) align 8 pad: 0x0000
class UNPCBehaviorLOD : public UObject
{ 
public:
	class ACharacter*                                  OwnerPawn;                                                  // 0x0028   (0x0008)  
	bool                                               bConsiderDistance;                                          // 0x0030   (0x0001)  
	bool                                               bConsiderVisible;                                           // 0x0031   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x0032   (0x0002)  MISSED
	float                                              MinDistance;                                                // 0x0034   (0x0004)  
	float                                              MaxDistance;                                                // 0x0038   (0x0004)  
	bool                                               bConsiderVisionAngle;                                       // 0x003C   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x003D   (0x0003)  MISSED
	float                                              VisionAngleInDegree;                                        // 0x0040   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x0044   (0x0004)  MISSED
	TArray<class UNPCBehaviorLODActionTick*>           Actions;                                                    // 0x0048   (0x0010)  
};

/// Class /Script/MFNPCAI.NPCBehaviorLODAction
/// Size: 0x0018 (24 bytes) (0x000028 - 0x000040) align 8 pad: 0x0000
class UNPCBehaviorLODAction : public UObject
{ 
public:
	bool                                               bLoop;                                                      // 0x0028   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0029   (0x0003)  MISSED
	float                                              LoopInterval;                                               // 0x002C   (0x0004)  
	unsigned char                                      UnknownData01_6[0x8];                                       // 0x0030   (0x0008)  MISSED
	class ACharacter*                                  OwnerPawn;                                                  // 0x0038   (0x0008)  


	/// Functions
	// Function /Script/MFNPCAI.NPCBehaviorLODAction.OnLoopActionTimer
	// void OnLoopActionTimer();                                                                                                // [0x1da1da0] Native|Protected     
};

/// Class /Script/MFNPCAI.NPCBehaviorLODActionTick
/// Size: 0x0018 (24 bytes) (0x000028 - 0x000040) align 8 pad: 0x0000
class UNPCBehaviorLODActionTick : public UObject
{ 
public:
	class ACharacter*                                  OwnerPawn;                                                  // 0x0028   (0x0008)  
	class UNPCBehaviorLODSystemComponent*              LODSysComp;                                                 // 0x0030   (0x0008)  
	float                                              ControllerTickInterval;                                     // 0x0038   (0x0004)  
	float                                              CharacterTickInterval;                                      // 0x003C   (0x0004)  
};

/// Struct /Script/MFNPCAI.ComponentInfo
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FComponentInfo
{ 
	class UActorComponent*                             Component;                                                  // 0x0000   (0x0008)  
	unsigned char                                      UnknownData00_7[0x10];                                      // 0x0008   (0x0010)  MISSED
};

/// Class /Script/MFNPCAI.NPCBehaviorLODSystemComponent
/// Size: 0x0070 (112 bytes) (0x000108 - 0x000178) align 8 pad: 0x0000
class UNPCBehaviorLODSystemComponent : public UNPCAISubSystemComponent
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0108   (0x0008)  MISSED
	float                                              UpdateLODInterval;                                          // 0x0110   (0x0004)  
	bool                                               bPMCAIAsPlayer;                                             // 0x0114   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0115   (0x0003)  MISSED
	TArray<class UNPCBehaviorLOD*>                     LODs;                                                       // 0x0118   (0x0010)  
	float                                              EnemyLeaveTimeCanLODEnabled;                                // 0x0128   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x012C   (0x0004)  MISSED
	class UNPCBehaviorLOD*                             CurrLODCache;                                               // 0x0130   (0x0008)  
	bool                                               bIgnoreUpdate;                                              // 0x0138   (0x0001)  
	bool                                               bControllerOringinalTickEnabled;                            // 0x0139   (0x0001)  
	unsigned char                                      UnknownData03_6[0x2];                                       // 0x013A   (0x0002)  MISSED
	float                                              ControllerOringinalTickInterval;                            // 0x013C   (0x0004)  
	bool                                               bCharacterOringinalTickEnabled;                             // 0x0140   (0x0001)  
	unsigned char                                      UnknownData04_6[0x3];                                       // 0x0141   (0x0003)  MISSED
	float                                              CharacterOringinalTickInterval;                             // 0x0144   (0x0004)  
	TArray<FComponentInfo>                             CharacterCachedCompList;                                    // 0x0148   (0x0010)  
	TArray<FComponentInfo>                             ControllerCachedCompList;                                   // 0x0158   (0x0010)  
	bool                                               bHasAnyPlayerAround;                                        // 0x0168   (0x0001)  
	unsigned char                                      UnknownData05_6[0x7];                                       // 0x0169   (0x0007)  MISSED
	class UNPCAIMemorySystemComponent*                 MemroySystemComponent;                                      // 0x0170   (0x0008)  


	/// Functions
	// Function /Script/MFNPCAI.NPCBehaviorLODSystemComponent.UpdateBehaviorLODTimer
	// void UpdateBehaviorLODTimer();                                                                                           // [0xc2fd90] Native|Protected     
	// Function /Script/MFNPCAI.NPCBehaviorLODSystemComponent.ShouldRunLODTimer
	// bool ShouldRunLODTimer();                                                                                                // [0x2e15cc0] Final|Native|Protected|Const 
	// Function /Script/MFNPCAI.NPCBehaviorLODSystemComponent.RestoreTick
	// void RestoreTick();                                                                                                      // [0x2e15ca0] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCBehaviorLODSystemComponent.OnAIBeginToRunBT
	// void OnAIBeginToRunBT();                                                                                                 // [0x2e15c80] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCBehaviorLODSystemComponent.HasAnyPlayerAround
	// bool HasAnyPlayerAround();                                                                                               // [0x2e15bf0] Final|Native|Protected|Const 
	// Function /Script/MFNPCAI.NPCBehaviorLODSystemComponent.EnableTick
	// void EnableTick();                                                                                                       // [0x2e15ad0] Final|Native|Public  
	// Function /Script/MFNPCAI.NPCBehaviorLODSystemComponent.EnableCharacterTick
	// void EnableCharacterTick(class ACharacter* Character);                                                                   // [0x2e15a50] Final|Native|Static|Public 
	// Function /Script/MFNPCAI.NPCBehaviorLODSystemComponent.DisableCharacterTick
	// void DisableCharacterTick(class ACharacter* Character);                                                                  // [0x2e159d0] Final|Native|Static|Public 
};

/// Class /Script/MFNPCAI.NPCBTDecorator
/// Size: 0x0028 (40 bytes) (0x000068 - 0x000090) align 8 pad: 0x0000
class UNPCBTDecorator : public UBTDecorator
{ 
public:
	bool                                               bWithTime : 1;                                              // 0x0068:0 (0x0001)  
	unsigned char                                      UnknownData00_5[0x7];                                       // 0x0069   (0x0007)  MISSED
	FString                                            TagText;                                                    // 0x0070   (0x0010)  
	FString                                            Message;                                                    // 0x0080   (0x0010)  
};

/// Class /Script/MFNPCAI.NPCBTDecorator_AIPropertyComparison
/// Size: 0x0038 (56 bytes) (0x000090 - 0x0000C8) align 8 pad: 0x0000
class UNPCBTDecorator_AIPropertyComparison : public UBTDecorator_BlackboardBase
{ 
public:
	class UClass*                                      AIPropertyComponent;                                        // 0x0090   (0x0008)  
	FString                                            ComponentFunctionName;                                      // 0x0098   (0x0010)  
	TEnumAsByte<EBasicKeyOperation>                    BoolOperation;                                              // 0x00A8   (0x0001)  
	TEnumAsByte<EArithmeticKeyOperation>               ArithmeticOperation;                                        // 0x00A9   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x00AA   (0x0002)  MISSED
	float                                              FloatValue;                                                 // 0x00AC   (0x0004)  
	int32_t                                            IntValue;                                                   // 0x00B0   (0x0004)  
	bool                                               bUseBlackboardValue;                                        // 0x00B4   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x00B5   (0x0003)  MISSED
	FString                                            CachedDescription;                                          // 0x00B8   (0x0010)  
};

/// Class /Script/MFNPCAI.NPCBTDecorator_BBConditionBase
/// Size: 0x0058 (88 bytes) (0x000090 - 0x0000E8) align 8 pad: 0x0000
class UNPCBTDecorator_BBConditionBase : public UNPCBTDecorator
{ 
public:
	bool                                               bUseTargetValue;                                            // 0x0090   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0091   (0x0007)  MISSED
	FBlackboardKeySelector                             SourceBlackboardKey;                                        // 0x0098   (0x0028)  
	FBlackboardKeySelector                             TargetBlackboardKey;                                        // 0x00C0   (0x0028)  
};

/// Class /Script/MFNPCAI.NPCBTDecorator_BBConditionBool
/// Size: 0x0030 (48 bytes) (0x000090 - 0x0000C0) align 8 pad: 0x0000
class UNPCBTDecorator_BBConditionBool : public UNPCBTDecorator
{ 
public:
	FBlackboardKeySelector                             BlackboardKey;                                              // 0x0090   (0x0028)  
	TEnumAsByte<EArithmeticKeyOperation>               ConditionType;                                              // 0x00B8   (0x0001)  
	bool                                               TargetValue;                                                // 0x00B9   (0x0001)  
	unsigned char                                      UnknownData00_7[0x6];                                       // 0x00BA   (0x0006)  MISSED
};

/// Class /Script/MFNPCAI.NPCBTDecorator_BBConditionFloat
/// Size: 0x0058 (88 bytes) (0x000090 - 0x0000E8) align 8 pad: 0x0000
class UNPCBTDecorator_BBConditionFloat : public UNPCBTDecorator
{ 
public:
	FBlackboardKeySelector                             SourceBlackboardKey;                                        // 0x0090   (0x0028)  
	FBlackboardKeySelector                             TargetBlackboardKey;                                        // 0x00B8   (0x0028)  
	float                                              TargetValue;                                                // 0x00E0   (0x0004)  
	bool                                               bUseBBTargetValue;                                          // 0x00E4   (0x0001)  
	TEnumAsByte<EArithmeticKeyOperation>               ConditionType;                                              // 0x00E5   (0x0001)  
	unsigned char                                      UnknownData00_7[0x2];                                       // 0x00E6   (0x0002)  MISSED
};

/// Class /Script/MFNPCAI.NPCBTDecorator_BBConditionInt
/// Size: 0x0008 (8 bytes) (0x0000E8 - 0x0000F0) align 8 pad: 0x0000
class UNPCBTDecorator_BBConditionInt : public UNPCBTDecorator_BBConditionBase
{ 
public:
	TEnumAsByte<EArithmeticKeyOperation>               OperationType;                                              // 0x00E8   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x00E9   (0x0003)  MISSED
	int32_t                                            TargetValue;                                                // 0x00EC   (0x0004)  
};

/// Class /Script/MFNPCAI.NPCBTDecorator_BBConditionObject
/// Size: 0x0000 (0 bytes) (0x0000C0 - 0x0000C0) align 8 pad: 0x0000
class UNPCBTDecorator_BBConditionObject : public UBTDecorator_CompareBBEntries
{ 
public:
};

/// Class /Script/MFNPCAI.NPCBTDecorator_BBConditionString
/// Size: 0x0018 (24 bytes) (0x0000E8 - 0x000100) align 8 pad: 0x0000
class UNPCBTDecorator_BBConditionString : public UNPCBTDecorator_BBConditionBase
{ 
public:
	TEnumAsByte<ETextKeyOperation>                     OperationType;                                              // 0x00E8   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x00E9   (0x0007)  MISSED
	FString                                            TargetValue;                                                // 0x00F0   (0x0010)  
};

/// Class /Script/MFNPCAI.NPCBTDecorator_BlueprintBase
/// Size: 0x0038 (56 bytes) (0x000068 - 0x0000A0) align 8 pad: 0x0000
class UNPCBTDecorator_BlueprintBase : public UBTDecorator
{ 
public:
	bool                                               bAsSharedInstance;                                          // 0x0068   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0069   (0x0007)  MISSED
	class AAIController*                               AIOwner;                                                    // 0x0070   (0x0008)  
	TArray<FName>                                      ObservedKeyNames;                                           // 0x0078   (0x0010)  
	unsigned char                                      UnknownData01_6[0x14];                                      // 0x0088   (0x0014)  MISSED
	bool                                               bShowPropertyDetails : 1;                                   // 0x009C:0 (0x0001)  
	bool                                               bCheckConditionOnlyBlackBoardChanges : 1;                   // 0x009C:1 (0x0001)  
	bool                                               bIsObservingBB : 1;                                         // 0x009C:2 (0x0001)  
	unsigned char                                      UnknownData02_7[0x3];                                       // 0x009D   (0x0003)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCBTDecorator_BlueprintBase.ReceiveTickAI
	// void ReceiveTickAI(class AAIController* OwnerController, class APawn* ControlledPawn, float DeltaSeconds);               // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_BlueprintBase.ReceiveTick
	// void ReceiveTick(class AActor* OwnerActor, float DeltaSeconds);                                                          // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_BlueprintBase.ReceiveObserverDeactivatedAI
	// void ReceiveObserverDeactivatedAI(class AAIController* OwnerController, class APawn* ControlledPawn);                    // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_BlueprintBase.ReceiveObserverDeactivated
	// void ReceiveObserverDeactivated(class AActor* OwnerActor);                                                               // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_BlueprintBase.ReceiveObserverActivatedAI
	// void ReceiveObserverActivatedAI(class AAIController* OwnerController, class APawn* ControlledPawn);                      // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_BlueprintBase.ReceiveObserverActivated
	// void ReceiveObserverActivated(class AActor* OwnerActor);                                                                 // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_BlueprintBase.ReceiveExecutionStartAI
	// void ReceiveExecutionStartAI(class AAIController* OwnerController, class APawn* ControlledPawn);                         // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_BlueprintBase.ReceiveExecutionStart
	// void ReceiveExecutionStart(class AActor* OwnerActor);                                                                    // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_BlueprintBase.ReceiveExecutionFinishAI
	// void ReceiveExecutionFinishAI(class AAIController* OwnerController, class APawn* ControlledPawn, TEnumAsByte<EBTNodeResult> NodeResult); // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_BlueprintBase.ReceiveExecutionFinish
	// void ReceiveExecutionFinish(class AActor* OwnerActor, TEnumAsByte<EBTNodeResult> NodeResult);                            // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_BlueprintBase.PerformConditionCheckAI
	// bool PerformConditionCheckAI(class AAIController* OwnerController, class APawn* ControlledPawn);                         // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_BlueprintBase.PerformConditionCheck
	// bool PerformConditionCheck(class AActor* OwnerActor);                                                                    // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_BlueprintBase.IsDecoratorObserverActive
	// bool IsDecoratorObserverActive();                                                                                        // [0x2e15c50] Final|Native|Protected|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCBTDecorator_BlueprintBase.IsDecoratorExecutionActive
	// bool IsDecoratorExecutionActive();                                                                                       // [0x2e15c20] Final|Native|Protected|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCBTDecorator_BlueprintBase.GetOwnerPawn
	// class APawn* GetOwnerPawn();                                                                                             // [0x2e15bc0] Final|Native|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/MFNPCAI.NPCBTDecorator_BlueprintBase.GetOwnerController
	// class AAIController* GetOwnerController();                                                                               // [0x2e15b90] Final|Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/MFNPCAI.NPCBTDecorator_HasSuspectPoints
/// Size: 0x0018 (24 bytes) (0x000090 - 0x0000A8) align 8 pad: 0x0000
class UNPCBTDecorator_HasSuspectPoints : public UNPCBTDecorator
{ 
public:
	float                                              Radius;                                                     // 0x0090   (0x0004)  
	float                                              HalfHeight;                                                 // 0x0094   (0x0004)  
	float                                              HalfAngle;                                                  // 0x0098   (0x0004)  
	FVector                                            Offset;                                                     // 0x009C   (0x000C)  
};

/// Class /Script/MFNPCAI.NPCBTDecorator_IsCloseEnough
/// Size: 0x0008 (8 bytes) (0x000090 - 0x000098) align 8 pad: 0x0000
class UNPCBTDecorator_IsCloseEnough : public UNPCBTDecorator
{ 
public:
	float                                              CloseEnoughDistance;                                        // 0x0090   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0094   (0x0004)  MISSED
};

/// Class /Script/MFNPCAI.NPCBTDecorator_ShouldWaitAtPathNode
/// Size: 0x0000 (0 bytes) (0x000090 - 0x000090) align 8 pad: 0x0000
class UNPCBTDecorator_ShouldWaitAtPathNode : public UNPCBTDecorator
{ 
public:
};

/// Class /Script/MFNPCAI.NPCBTDecorator_SingletonBlueprintBase
/// Size: 0x0030 (48 bytes) (0x000068 - 0x000098) align 8 pad: 0x0000
class UNPCBTDecorator_SingletonBlueprintBase : public UBTDecorator
{ 
public:
	class AAIController*                               AIOwner;                                                    // 0x0068   (0x0008)  
	TArray<FName>                                      ObservedKeyNames;                                           // 0x0070   (0x0010)  
	unsigned char                                      UnknownData00_6[0x10];                                      // 0x0080   (0x0010)  MISSED
	bool                                               bShowPropertyDetails : 1;                                   // 0x0090:0 (0x0001)  
	bool                                               bCheckConditionOnlyBlackBoardChanges : 1;                   // 0x0090:1 (0x0001)  
	bool                                               bIsObservingBB : 1;                                         // 0x0090:2 (0x0001)  
	unsigned char                                      UnknownData01_7[0x7];                                       // 0x0091   (0x0007)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCBTDecorator_SingletonBlueprintBase.ReceiveTickAI
	// void ReceiveTickAI(class AAIController* OwnerController, class APawn* ControlledPawn, float DeltaSeconds);               // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_SingletonBlueprintBase.ReceiveTick
	// void ReceiveTick(class AActor* OwnerActor, float DeltaSeconds);                                                          // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_SingletonBlueprintBase.ReceiveObserverDeactivatedAI
	// void ReceiveObserverDeactivatedAI(class AAIController* OwnerController, class APawn* ControlledPawn);                    // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_SingletonBlueprintBase.ReceiveObserverDeactivated
	// void ReceiveObserverDeactivated(class AActor* OwnerActor);                                                               // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_SingletonBlueprintBase.ReceiveObserverActivatedAI
	// void ReceiveObserverActivatedAI(class AAIController* OwnerController, class APawn* ControlledPawn);                      // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_SingletonBlueprintBase.ReceiveObserverActivated
	// void ReceiveObserverActivated(class AActor* OwnerActor);                                                                 // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_SingletonBlueprintBase.ReceiveExecutionStartAI
	// void ReceiveExecutionStartAI(class AAIController* OwnerController, class APawn* ControlledPawn);                         // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_SingletonBlueprintBase.ReceiveExecutionStart
	// void ReceiveExecutionStart(class AActor* OwnerActor);                                                                    // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_SingletonBlueprintBase.ReceiveExecutionFinishAI
	// void ReceiveExecutionFinishAI(class AAIController* OwnerController, class APawn* ControlledPawn, TEnumAsByte<EBTNodeResult> NodeResult); // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_SingletonBlueprintBase.ReceiveExecutionFinish
	// void ReceiveExecutionFinish(class AActor* OwnerActor, TEnumAsByte<EBTNodeResult> NodeResult);                            // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_SingletonBlueprintBase.PerformConditionCheckAI
	// bool PerformConditionCheckAI(class AAIController* OwnerController, class APawn* ControlledPawn);                         // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_SingletonBlueprintBase.PerformConditionCheck
	// bool PerformConditionCheck(class AActor* OwnerActor);                                                                    // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTDecorator_SingletonBlueprintBase.IsDecoratorObserverActive
	// bool IsDecoratorObserverActive();                                                                                        // [0x2e15c50] Final|Native|Protected|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MFNPCAI.NPCBTDecorator_SingletonBlueprintBase.IsDecoratorExecutionActive
	// bool IsDecoratorExecutionActive();                                                                                       // [0x2e15c20] Final|Native|Protected|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/MFNPCAI.NPCBTDecorator_TickIntervalBase
/// Size: 0x0008 (8 bytes) (0x0000A0 - 0x0000A8) align 8 pad: 0x0000
class UNPCBTDecorator_TickIntervalBase : public UNPCBTDecorator_BlueprintBase
{ 
public:
	float                                              Interval;                                                   // 0x00A0   (0x0004)  
	float                                              RandomDeviation;                                            // 0x00A4   (0x0004)  
};

/// Class /Script/MFNPCAI.NPCBTDecorator_Wait
/// Size: 0x0008 (8 bytes) (0x000070 - 0x000078) align 8 pad: 0x0000
class UNPCBTDecorator_Wait : public UBTDecorator_Cooldown
{ 
public:
	bool                                               bWaitFirstTime;                                             // 0x0070   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0071   (0x0007)  MISSED
};

/// Class /Script/MFNPCAI.NPCBTService
/// Size: 0x0028 (40 bytes) (0x000070 - 0x000098) align 8 pad: 0x0000
class UNPCBTService : public UBTService
{ 
public:
	bool                                               bWithTime : 1;                                              // 0x0070:0 (0x0001)  
	bool                                               bOnActivation : 1;                                          // 0x0070:1 (0x0001)  
	bool                                               bOnDeactivation : 1;                                        // 0x0070:2 (0x0001)  
	bool                                               bOnTick : 1;                                                // 0x0070:3 (0x0001)  
	bool                                               bOnSearchStart : 1;                                         // 0x0070:4 (0x0001)  
	unsigned char                                      UnknownData00_5[0x7];                                       // 0x0071   (0x0007)  MISSED
	FString                                            TagText;                                                    // 0x0078   (0x0010)  
	FString                                            Message;                                                    // 0x0088   (0x0010)  
};

/// Class /Script/MFNPCAI.NPCBTService_FindRandomPosition
/// Size: 0x0058 (88 bytes) (0x000098 - 0x0000F0) align 8 pad: 0x0000
class UNPCBTService_FindRandomPosition : public UNPCBTService
{ 
public:
	FBlackboardKeySelector                             CenterTarget;                                               // 0x0098   (0x0028)  
	FBlackboardKeySelector                             RandomLocation;                                             // 0x00C0   (0x0028)  
	float                                              MinRange;                                                   // 0x00E8   (0x0004)  
	float                                              MaxRange;                                                   // 0x00EC   (0x0004)  
};

/// Class /Script/MFNPCAI.NPCBTService_SetSenseRangeScale
/// Size: 0x0010 (16 bytes) (0x000098 - 0x0000A8) align 8 pad: 0x0000
class UNPCBTService_SetSenseRangeScale : public UNPCBTService
{ 
public:
	float                                              CatchSenseScale;                                            // 0x0098   (0x0004)  
	float                                              LossSenseScale;                                             // 0x009C   (0x0004)  
	EAISenseType                                       AISenseType;                                                // 0x00A0   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x00A1   (0x0007)  MISSED
};

/// Class /Script/MFNPCAI.NPCBTService_SetVisionHalfAngle
/// Size: 0x0008 (8 bytes) (0x000098 - 0x0000A0) align 8 pad: 0x0000
class UNPCBTService_SetVisionHalfAngle : public UNPCBTService
{ 
public:
	float                                              LookAngleScale;                                             // 0x0098   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x009C   (0x0004)  MISSED
};

/// Class /Script/MFNPCAI.NPCBTService_SingletonBlueprintBase
/// Size: 0x0020 (32 bytes) (0x000070 - 0x000090) align 8 pad: 0x0000
class UNPCBTService_SingletonBlueprintBase : public UBTService
{ 
public:
	class AAIController*                               AIOwner;                                                    // 0x0070   (0x0008)  
	unsigned char                                      UnknownData00_6[0x10];                                      // 0x0078   (0x0010)  MISSED
	bool                                               bShowPropertyDetails : 1;                                   // 0x0088:0 (0x0001)  
	bool                                               bShowEventDetails : 1;                                      // 0x0088:1 (0x0001)  
	unsigned char                                      UnknownData01_7[0x7];                                       // 0x0089   (0x0007)  MISSED


	/// Functions
	// Function /Script/MFNPCAI.NPCBTService_SingletonBlueprintBase.ReceiveTickAI
	// void ReceiveTickAI(class AAIController* OwnerController, class APawn* ControlledPawn, float DeltaSeconds);               // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTService_SingletonBlueprintBase.ReceiveTick
	// void ReceiveTick(class AActor* OwnerActor, float DeltaSeconds);                                                          // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTService_SingletonBlueprintBase.ReceiveSearchStartAI
	// void ReceiveSearchStartAI(class AAIController* OwnerController, class APawn* ControlledPawn);                            // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTService_SingletonBlueprintBase.ReceiveSearchStart
	// void ReceiveSearchStart(class AActor* OwnerActor);                                                                       // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTService_SingletonBlueprintBase.ReceiveDeactivationAI
	// void ReceiveDeactivationAI(class AAIController* OwnerController, class APawn* ControlledPawn);                           // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTService_SingletonBlueprintBase.ReceiveDeactivation
	// void ReceiveDeactivation(class AActor* OwnerActor);                                                                      // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTService_SingletonBlueprintBase.ReceiveActivationAI
	// void ReceiveActivationAI(class AAIController* OwnerController, class APawn* ControlledPawn);                             // [0x3a75280] Event|Protected|BlueprintEvent 
	// Function /Script/MFNPCAI.NPCBTService_SingletonBlueprintBase.ReceiveActivation
	// void ReceiveActivation(class AActor* OwnerActor);                                                                        // [0x3a75280] Event|Protected|BlueprintEvent 
};

/// Class /Script/MFNPCAI.NPCBTTask_AimAndFireEnemy
/// Size: 0x00A8 (168 bytes) (0x0000B0 - 0x000158) align 8 pad: 0x0000
class UNPCBTTask_AimAndFireEnemy : public UNPCBTTask_LatenTaskBase
{ 
public:
	FBlackboardKeySelector                             FireTarget;                                                 // 0x00B0   (0x0028)  
	FBlackboardKeySelector                             ShootOneRound;                                              // 0x00D8   (0x0028)  
	FBlackboardKeySelector                             SkipFirstRoundAim;                                          // 0x0100   (0x0028)  
	bool                                               IsShotEnemy;                                                // 0x0128   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0129   (0x0007)  MISSED
	class ACharacter*                                  FireTargetPawn;                                             // 0x0130   (0x0008)  
	FVector                                            FireTargetLoc;                                              // 0x0138   (0x000C)  
	bool                                               bIsFiring;                                                  // 0x0144   (0x0001)  
	bool                                               bPressureAim;                                               // 0x0145   (0x0001)  
	bool                                               bSkipFirstRoundAim;                                         // 0x0146   (0x0001)  
	EAIBodyPartType                                    ShootPartID;                                                // 0x0147   (0x0001)  
	char                                               LastCheckedShotCount;                                       // 0x0148   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0149   (0x0003)  MISSED
	int32_t                                            ShootRound;                                                 // 0x014C   (0x0004)  
	unsigned char                                      UnknownData02_7[0x8];                                       // 0x0150   (0x0008)  MISSED
};

/// Class /Script/MFNPCAI.NPCBTTaskNode
/// Size: 0x0028 (40 bytes) (0x000070 - 0x000098) align 8 pad: 0x0000
class UNPCBTTaskNode : public UBTTaskNode
{ 
public:
	bool                                               bWithTime : 1;                                              // 0x0070:0 (0x0001)  
	unsigned char                                      UnknownData00_5[0x7];                                       // 0x0071   (0x0007)  MISSED
	FString                                            TagText;                                                    // 0x0078   (0x0010)  
	FString                                            Message;                                                    // 0x0088   (0x0010)  
};

/// Class /Script/MFNPCAI.NPCBTTask_AttackEnemy
/// Size: 0x0000 (0 bytes) (0x000098 - 0x000098) align 8 pad: 0x0000
class UNPCBTTask_AttackEnemy : public UNPCBTTaskNode
{ 
public:
};

/// Class /Script/MFNPCAI.NPCBTTask_CalcNextAttackPosition
/// Size: 0x0020 (32 bytes) (0x000098 - 0x0000B8) align 8 pad: 0x0000
class UNPCBTTask_CalcNextAttackPosition : public UNPCBTTaskNode
{ 
public:
	bool                                               bDebugMoveTrace;                                            // 0x0098   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0099   (0x0003)  MISSED
	int32_t                                            MaxTryTimes;                                                // 0x009C   (0x0004)  
	float                                              MinMoveDistance;                                            // 0x00A0   (0x0004)  
	float                                              MaxMoveDistance;                                            // 0x00A4   (0x0004)  
	float                                              MoveDistanceThreshold;                                      // 0x00A8   (0x0004)  
	float                                              MinDistanceToPlayer;                                        // 0x00AC   (0x0004)  
	class UClass*                                      FilterClass;                                                // 0x00B0   (0x0008)  
};

/// Class /Script/MFNPCAI.NPCBTTask_CalcNextWanderPathNode
/// Size: 0x0000 (0 bytes) (0x000098 - 0x000098) align 8 pad: 0x0000
class UNPCBTTask_CalcNextWanderPathNode : public UNPCBTTaskNode
{ 
public:
};

/// Class /Script/MFNPCAI.NPCBTTask_ClearFocalPoint
/// Size: 0x0000 (0 bytes) (0x000098 - 0x000098) align 8 pad: 0x0000
class UNPCBTTask_ClearFocalPoint : public UNPCBTTaskNode
{ 
public:
};

/// Class /Script/MFNPCAI.NPCBTTask_DBNORescue
/// Size: 0x0028 (40 bytes) (0x0000A8 - 0x0000D0) align 8 pad: 0x0000
class UNPCBTTask_DBNORescue : public UNPCBTTask_BlueprintBase
{ 
public:
	FBlackboardKeySelector                             Tgt_DBNOTarget;                                             // 0x00A8   (0x0028)  
};

/// Class /Script/MFNPCAI.NPCBTTask_Decision
/// Size: 0x0000 (0 bytes) (0x0000A8 - 0x0000A8) align 8 pad: 0x0000
class UNPCBTTask_Decision : public UNPCBTTask_BlueprintBase
{ 
public:
};

/// Class /Script/MFNPCAI.NPCBTTask_FireEnemy
/// Size: 0x00C8 (200 bytes) (0x0000B0 - 0x000178) align 8 pad: 0x0000
class UNPCBTTask_FireEnemy : public UNPCBTTask_LatenTaskBase
{ 
public:
	FBlackboardKeySelector                             FireTarget;                                                 // 0x00B0   (0x0028)  
	FBlackboardKeySelector                             MovementMultiplier;                                         // 0x00D8   (0x0028)  
	FBlackboardKeySelector                             AimingMultiplier;                                           // 0x0100   (0x0028)  
	FBlackboardKeySelector                             BurstMultiplier;                                            // 0x0128   (0x0028)  
	FBlackboardKeySelector                             TargetStateMultiplier;                                      // 0x0150   (0x0028)  
};

/// Class /Script/MFNPCAI.NPCBTTask_FireEnemyEx
/// Size: 0x0038 (56 bytes) (0x0000B0 - 0x0000E8) align 8 pad: 0x0000
class UNPCBTTask_FireEnemyEx : public UNPCBTTask_LatenTaskBase
{ 
public:
	FBlackboardKeySelector                             FireTarget;                                                 // 0x00B0   (0x0028)  
	EAISpecialFireType                                 FireType;                                                   // 0x00D8   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x00D9   (0x0003)  MISSED
	float                                              MissRadiusMin;                                              // 0x00DC   (0x0004)  
	float                                              MissRadiusMax;                                              // 0x00E0   (0x0004)  
	float                                              SpeedThreshold;                                             // 0x00E4   (0x0004)  
};

/// Class /Script/MFNPCAI.NPCBTTask_FollowPathNode
/// Size: 0x0050 (80 bytes) (0x000098 - 0x0000E8) align 8 pad: 0x0000
class UNPCBTTask_FollowPathNode : public UNPCBTTaskNode
{ 
public:
	FBlackboardKeySelector                             WanderLocationKey;                                          // 0x0098   (0x0028)  
	FBlackboardKeySelector                             WaitTimeKey;                                                // 0x00C0   (0x0028)  
};

/// Class /Script/MFNPCAI.NPCBTTask_MeleeAttackEnemy
/// Size: 0x0048 (72 bytes) (0x0000B0 - 0x0000F8) align 8 pad: 0x0000
class UNPCBTTask_MeleeAttackEnemy : public UNPCBTTask_LatenTaskBase
{ 
public:
	FBlackboardKeySelector                             FireTarget;                                                 // 0x00B0   (0x0028)  
	class ACharacter*                                  FireTargetPawn;                                             // 0x00D8   (0x0008)  
	FVector                                            FireTargetLoc;                                              // 0x00E0   (0x000C)  
	bool                                               IsShotEnemy;                                                // 0x00EC   (0x0001)  
	bool                                               bIsFiring;                                                  // 0x00ED   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x00EE   (0x0002)  MISSED
	float                                              StartFireTimestamp;                                         // 0x00F0   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x00F4   (0x0004)  MISSED
};

/// Class /Script/MFNPCAI.NPCBTTask_MoveToEx
/// Size: 0x0030 (48 bytes) (0x0000B0 - 0x0000E0) align 8 pad: 0x0000
class UNPCBTTask_MoveToEx : public UBTTask_MoveTo
{ 
public:
	EAIMoveType                                        MoveType;                                                   // 0x00B0   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x00B1   (0x0003)  MISSED
	float                                              RandomReachableRadius;                                      // 0x00B4   (0x0004)  
	bool                                               bWithTime : 1;                                              // 0x00B8:0 (0x0001)  
	unsigned char                                      UnknownData01_5[0x7];                                       // 0x00B9   (0x0007)  MISSED
	FString                                            TagText;                                                    // 0x00C0   (0x0010)  
	FString                                            Message;                                                    // 0x00D0   (0x0010)  
};

/// Class /Script/MFNPCAI.NPCBTTask_PlayAkSound
/// Size: 0x0010 (16 bytes) (0x000098 - 0x0000A8) align 8 pad: 0x0000
class UNPCBTTask_PlayAkSound : public UNPCBTTaskNode
{ 
public:
	class UAkAudioEvent*                               SoundToPlay;                                                // 0x0098   (0x0008)  
	bool                                               bSoundAttached;                                             // 0x00A0   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x00A1   (0x0007)  MISSED
};

/// Class /Script/MFNPCAI.NPCBTTask_ResetTargetLocation
/// Size: 0x0000 (0 bytes) (0x000098 - 0x000098) align 8 pad: 0x0000
class UNPCBTTask_ResetTargetLocation : public UNPCBTTaskNode
{ 
public:
};

/// Class /Script/MFNPCAI.NPCBTTask_SetAIPose
/// Size: 0x0008 (8 bytes) (0x000098 - 0x0000A0) align 8 pad: 0x0000
class UNPCBTTask_SetAIPose : public UNPCBTTaskNode
{ 
public:
	EAIPose                                            TargetAIPose;                                               // 0x0098   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0099   (0x0007)  MISSED
};

/// Class /Script/MFNPCAI.NPCBTTask_SetBlackboardValue
/// Size: 0x0050 (80 bytes) (0x000098 - 0x0000E8) align 8 pad: 0x0000
class UNPCBTTask_SetBlackboardValue : public UNPCBTTaskNode
{ 
public:
	FBlackboardKeySelector                             SourceValue;                                                // 0x0098   (0x0028)  
	FBlackboardKeySelector                             TargetValue;                                                // 0x00C0   (0x0028)  
};

/// Class /Script/MFNPCAI.NPCBTTask_SetFocalPoint
/// Size: 0x0028 (40 bytes) (0x000098 - 0x0000C0) align 8 pad: 0x0000
class UNPCBTTask_SetFocalPoint : public UBTTask_BlackboardBase
{ 
public:
	bool                                               bWithTime : 1;                                              // 0x0098:0 (0x0001)  
	unsigned char                                      UnknownData00_5[0x7];                                       // 0x0099   (0x0007)  MISSED
	FString                                            TagText;                                                    // 0x00A0   (0x0010)  
	FString                                            Message;                                                    // 0x00B0   (0x0010)  
};

/// Class /Script/MFNPCAI.NPCBTTask_SetMovementSpeed
/// Size: 0x0010 (16 bytes) (0x000098 - 0x0000A8) align 8 pad: 0x0000
class UNPCBTTask_SetMovementSpeed : public UNPCBTTaskNode
{ 
public:
	float                                              BasicStandSpeed;                                            // 0x0098   (0x0004)  
	float                                              BasicCrouchSpeed;                                           // 0x009C   (0x0004)  
	float                                              BasicProneSpeed;                                            // 0x00A0   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x00A4   (0x0004)  MISSED
};

/// Class /Script/MFNPCAI.NPCBTTask_SetSenseRangeScale
/// Size: 0x0010 (16 bytes) (0x000098 - 0x0000A8) align 8 pad: 0x0000
class UNPCBTTask_SetSenseRangeScale : public UNPCBTTaskNode
{ 
public:
	float                                              CatchSenseScale;                                            // 0x0098   (0x0004)  
	float                                              LossSenseScale;                                             // 0x009C   (0x0004)  
	EAISenseType                                       AISenseType;                                                // 0x00A0   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x00A1   (0x0007)  MISSED
};

/// Class /Script/MFNPCAI.NPCBTTask_SetTargetHatred
/// Size: 0x0038 (56 bytes) (0x0000A8 - 0x0000E0) align 8 pad: 0x0000
class UNPCBTTask_SetTargetHatred : public UNPCBTTask_BlueprintBase
{ 
public:
	FBlackboardKeySelector                             EnemyTargetKey;                                             // 0x00A8   (0x0028)  
	int32_t                                            HatredValue;                                                // 0x00D0   (0x0004)  
	float                                              Hatred_IndateTime;                                          // 0x00D4   (0x0004)  
	bool                                               NeedToCalucateGoalEnemy;                                    // 0x00D8   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x00D9   (0x0007)  MISSED
};

/// Class /Script/MFNPCAI.NPCBTTask_SetVisionHalfAngle
/// Size: 0x0008 (8 bytes) (0x000098 - 0x0000A0) align 8 pad: 0x0000
class UNPCBTTask_SetVisionHalfAngle : public UNPCBTTaskNode
{ 
public:
	float                                              VisionHalfAngle;                                            // 0x0098   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x009C   (0x0004)  MISSED
};

/// Class /Script/MFNPCAI.NPCBTTask_StartShoulderAimingTarget
/// Size: 0x0000 (0 bytes) (0x0000B0 - 0x0000B0) align 8 pad: 0x0000
class UNPCBTTask_StartShoulderAimingTarget : public UNPCBTTask_LatenTaskBase
{ 
public:
};

/// Class /Script/MFNPCAI.NPCBTTask_StopShoulderAimingTarget
/// Size: 0x0000 (0 bytes) (0x0000B0 - 0x0000B0) align 8 pad: 0x0000
class UNPCBTTask_StopShoulderAimingTarget : public UNPCBTTask_LatenTaskBase
{ 
public:
};

/// Class /Script/MFNPCAI.NPCCharacterAIDBNOInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCCharacterAIDBNOInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCCharacterAIDBNOInterface.IsTargetDBNO
	// bool IsTargetDBNO(class AActor* TargetPawn);                                                                             // [0x2e1c470] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIDBNOInterface.IsSelfDBNO
	// bool IsSelfDBNO();                                                                                                       // [0x288bc90] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIDBNOInterface.GetBeRescueLocation
	// FVector GetBeRescueLocation();                                                                                           // [0x2e1bc70] Native|Public|HasDefaults 
	// Function /Script/MFNPCAI.NPCCharacterAIDBNOInterface.CheckAIGroupDBNOWipeOut
	// void CheckAIGroupDBNOWipeOut();                                                                                          // [0x296f9d0] Native|Public        
};

/// Class /Script/MFNPCAI.NPCCharacterAIDeathInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCCharacterAIDeathInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCCharacterAIDeathInterface.IsDead
	// bool IsDead();                                                                                                           // [0x288bc90] Native|Public|Const  
};

/// Class /Script/MFNPCAI.NPCCharacterAIDebugInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCCharacterAIDebugInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCCharacterAIDebugInterface.BoardcastDrawDebugLine
	// void BoardcastDrawDebugLine(int32_t InDrawID, FVector InStart, FVector InEnd, FColor Color, float InTime, float InThickness); // [0x2e1b810] Native|Public|HasDefaults 
};

/// Class /Script/MFNPCAI.NPCCharacterAIExplodeInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCCharacterAIExplodeInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCCharacterAIExplodeInterface.SetExplodeParams
	// void SetExplodeParams(float InMinDamage, float InMaxDamage, float InDamageRange, bool bInExplodeAtDeath);                // [0x2e1ca20] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIExplodeInterface.NetMulticastExplode
	// void NetMulticastExplode();                                                                                              // [0x2a7ed80] Native|Public        
};

/// Class /Script/MFNPCAI.NPCCharacterAIFireInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCCharacterAIFireInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.UpdatePersistentFireSetting
	// void UpdatePersistentFireSetting(bool CalcShoot, bool CalcSight, class AActor* EnemyTarget, FVector& FireLocation, float FireInterval, bool bIgnoreAimingTime); // [0x2e1d6f0] Native|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.UpdateNaturalFireSetting
	// void UpdateNaturalFireSetting(FVector& FireLocation, bool bEnabledRecoilControl, bool bEnabledHitRateControl, bool bIgnoreAimingTime); // [0x2e1d570] Native|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.StopPersistentFire
	// void StopPersistentFire();                                                                                               // [0x2daead0] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.StopFireDirectly
	// void StopFireDirectly();                                                                                                 // [0x2e1d240] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.StopFire
	// void StopFire(int32_t FireMode);                                                                                         // [0x2e1d1b0] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.StartPersistentFire
	// bool StartPersistentFire(float Duration);                                                                                // [0x2e1d120] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.StartFireNextTick
	// void StartFireNextTick();                                                                                                // [0x2dae350] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.StartFireDirectly
	// bool StartFireDirectly();                                                                                                // [0x2de88e0] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.StartFire
	// void StartFire(int32_t FireMode);                                                                                        // [0x2e1d090] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.SetFireAimingPoint
	// void SetFireAimingPoint(FVector& AimingPoint);                                                                           // [0x2e1cb80] Native|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.PrepareToFire
	// EAIWorkResult PrepareToFire(FNPCAIFireSetting& FireSetting);                                                             // [0x2e1c850] Native|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.IsRecentlyFire
	// bool IsRecentlyFire(float InSeconds);                                                                                    // [0x2e1c3d0] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.IsPersistentFiring
	// bool IsPersistentFiring();                                                                                               // [0x2e1c370] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.IsInFiringState
	// bool IsInFiringState();                                                                                                  // [0x2dae1c0] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.GetWeaponUseTraceChannel
	// TEnumAsByte<ECollisionChannel> GetWeaponUseTraceChannel();                                                               // [0x2e1bb20] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.GetSingleBodyPartLocation
	// FVector GetSingleBodyPartLocation(class ACharacter* InCharacter, EAIBodyPartType InBodyPartType);                        // [0x2e1c120] Native|Public|HasDefaults 
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.GetMuzzleFlashSocketLocation
	// FVector GetMuzzleFlashSocketLocation();                                                                                  // [0x2e1bfc0] Native|Public|HasDefaults 
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.GetLookSightUseTraceChannel
	// TEnumAsByte<ECollisionChannel> GetLookSightUseTraceChannel();                                                            // [0x2e1bf90] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.GetLastStopFireTime
	// float GetLastStopFireTime();                                                                                             // [0x2e1bcb0] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.GetLastFireTime
	// float GetLastFireTime();                                                                                                 // [0x2e1bf50] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.GetFireHitEnemyLastTimeUsePredestined
	// float GetFireHitEnemyLastTimeUsePredestined();                                                                           // [0x2e1bcf0] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.ForcePullBoltReady
	// void ForcePullBoltReady();                                                                                               // [0x296f9d0] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.CheckFireCanHitPenetration
	// bool CheckFireCanHitPenetration(FHitResult& InHitResult);                                                                // [0x2e1bb80] Native|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.CanStartPersistentFire
	// bool CanStartPersistentFire();                                                                                           // [0x2e1bb50] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.CanMeleeFire
	// bool CanMeleeFire();                                                                                                     // [0x29cc100] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIFireInterface.CanFire
	// bool CanFire();                                                                                                          // [0x288bc90] Native|Public        
};

/// Class /Script/MFNPCAI.NPCCharacterAIIKInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCCharacterAIIKInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCCharacterAIIKInterface.UpdateDSIKFootHighDiff
	// void UpdateDSIKFootHighDiff();                                                                                           // [0x2a7ed80] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIIKInterface.ShouldDSEnableFootIK
	// bool ShouldDSEnableFootIK();                                                                                             // [0x288c780] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIIKInterface.GetIKFootHighDiffValue
	// float GetIKFootHighDiffValue();                                                                                          // [0x2e1bd30] Native|Public        
};

/// Class /Script/MFNPCAI.NPCCharacterAIInventoryInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCCharacterAIInventoryInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCCharacterAIInventoryInterface.GiveInventoryToAI
	// bool GiveInventoryToAI(uint64_t ItemID);                                                                                 // [0x2e1c230] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIInventoryInterface.AIUseInventoryByClass
	// bool AIUseInventoryByClass(class UClass* InventoryClass);                                                                // [0x2db7b60] Native|Public        
};

/// Class /Script/MFNPCAI.NPCCharacterAIMoveInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCCharacterAIMoveInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCCharacterAIMoveInterface.StopActiveMovement
	// void StopActiveMovement();                                                                                               // [0xdaf460] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIMoveInterface.SetSprint
	// void SetSprint(bool bInSprint);                                                                                          // [0x2e1d000] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIMoveInterface.SetSilentWalk
	// void SetSilentWalk(bool bInSilentWalk);                                                                                  // [0x2e1cf70] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIMoveInterface.SetMovementSpeed
	// void SetMovementSpeed(float BasicStandSpeed, float BasicCrouchSpeed, float BasicProneSpeed);                             // [0x2e1cd30] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIMoveInterface.SetEnabledSliding
	// void SetEnabledSliding(bool bEnabled);                                                                                   // [0x2e1c990] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIMoveInterface.IsSprinting
	// bool IsSprinting();                                                                                                      // [0x288c720] Native|Public|Const  
	// Function /Script/MFNPCAI.NPCCharacterAIMoveInterface.IsBraking
	// bool IsBraking();                                                                                                        // [0x288bc90] Native|Public|Const  
	// Function /Script/MFNPCAI.NPCCharacterAIMoveInterface.IsAnyLegBroken
	// bool IsAnyLegBroken();                                                                                                   // [0x29cc100] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIMoveInterface.GetSlidingDistance
	// float GetSlidingDistance();                                                                                              // [0x2e1c200] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIMoveInterface.CanMove
	// bool CanMove();                                                                                                          // [0x2e1baf0] Native|Public        
};

/// Class /Script/MFNPCAI.NPCCharacterAIPathNodeInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCCharacterAIPathNodeInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCCharacterAIPathNodeInterface.ShouldWaitAtNode
	// bool ShouldWaitAtNode();                                                                                                 // [0x29cc100] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPathNodeInterface.GetWaitTimeAtNode
	// float GetWaitTimeAtNode();                                                                                               // [0x2e1c200] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPathNodeInterface.GetTargetWanderPathLocation
	// FVector GetTargetWanderPathLocation();                                                                                   // [0x2e1bc70] Native|Public|HasDefaults 
	// Function /Script/MFNPCAI.NPCCharacterAIPathNodeInterface.CalcNextPathNode
	// bool CalcNextPathNode();                                                                                                 // [0x288bc90] Native|Public        
};

/// Class /Script/MFNPCAI.NPCCharacterAIPerceptionInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCCharacterAIPerceptionInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCCharacterAIPerceptionInterface.GetTouchConfig
	// class UAISenseConfig_Touch* GetTouchConfig();                                                                            // [0x16a3b10] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPerceptionInterface.GetSightConfig
	// class UAISenseConfig_Sight* GetSightConfig();                                                                            // [0x16a3460] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPerceptionInterface.GetHearingConfig
	// class UAISenseConfig_Hearing* GetHearingConfig();                                                                        // [0x28c08b0] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPerceptionInterface.GetDamageConfig
	// class UAISenseConfig_Damage* GetDamageConfig();                                                                          // [0x28c0880] Native|Public        
};

/// Class /Script/MFNPCAI.NPCCharacterAIPickUpInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCCharacterAIPickUpInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCCharacterAIPickUpInterface.StopPickUpBoxContainer
	// void StopPickUpBoxContainer();                                                                                           // [0x2dae350] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPickUpInterface.SetInventoryHasChecked
	// void SetInventoryHasChecked(class AActor* Inventory);                                                                    // [0x2e1cc10] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPickUpInterface.PickupInventory
	// bool PickupInventory(class AActor* Inventory, bool bCheckIsCanAdd, float WaitSeconds, bool bFromBoxContainer, bool bIgnoreDistance); // [0x2e1c670] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPickUpInterface.PickUpBoxContainer
	// void PickUpBoxContainer(class AActor* BoxContainer, bool bCheckIsCanAdd, float InDelayStarttime, float InPickUpInterval); // [0x2e1c510] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPickUpInterface.IsCompletedPickUpBoxContainer
	// bool IsCompletedPickUpBoxContainer();                                                                                    // [0x2de88e0] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPickUpInterface.IsCanAddUnitInventory
	// bool IsCanAddUnitInventory();                                                                                            // [0x2e1bb50] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPickUpInterface.HasPlacePickUpInventoryIml
	// bool HasPlacePickUpInventoryIml(class AActor* Inventory);                                                                // [0x2e1c2d0] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPickUpInterface.GetNearestInventoryCanPickUp
	// class AActor* GetNearestInventoryCanPickUp(float InRange, float PathLength, bool bIgnoreChecked);                        // [0x2e1c000] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPickUpInterface.GetInventorysCanPickUp
	// bool GetInventorysCanPickUp(float InRange, float PathLength, bool bIgnoreChecked, TArray<AActor*>& OutInventorys);       // [0x2e1bd60] Native|Public|HasOutParms 
	// Function /Script/MFNPCAI.NPCCharacterAIPickUpInterface.CanclePickUpInventory
	// void CanclePickUpInventory();                                                                                            // [0x2867280] Native|Public        
};

/// Class /Script/MFNPCAI.NPCCharacterAIPoseCacheInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCCharacterAIPoseCacheInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCCharacterAIPoseCacheInterface.GetPoseAIType
	// EAIPose GetPoseAIType();                                                                                                 // [0x288bc90] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPoseCacheInterface.GetLeanAIType
	// EAILeanType GetLeanAIType();                                                                                             // [0x29cc100] Native|Public        
};

/// Class /Script/MFNPCAI.NPCCharacterAIPoseInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCCharacterAIPoseInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.UpdateDSPose
	// bool UpdateDSPose();                                                                                                     // [0x288c780] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.UpdateDSLeanPose
	// bool UpdateDSLeanPose();                                                                                                 // [0x288c750] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.TryProne
	// bool TryProne();                                                                                                         // [0x28c1d10] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.TryLean
	// bool TryLean(EAILeanType NewLeanType, bool bCheckBlockByWall);                                                           // [0x2e1d490] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.TryJump
	// bool TryJump(FVector& InJumpDirection, float InJumpSpeed, bool bUseNowVelocity);                                         // [0x2e1d360] Native|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.TryCrouchSliding
	// bool TryCrouchSliding();                                                                                                 // [0x2e1d330] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.TryCrouch
	// bool TryCrouch();                                                                                                        // [0x2e1d300] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.TryCasualStandingPose
	// bool TryCasualStandingPose(bool bCasual);                                                                                // [0x2e1d260] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.StopCrouchSliding
	// void StopCrouchSliding();                                                                                                // [0x2dae390] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.SetPoseToProne
	// void SetPoseToProne(bool bNewProne);                                                                                     // [0x2e1cee0] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.SetPoseToCrouch
	// void SetPoseToCrouch(bool bNewCrouch);                                                                                   // [0x2e1ce50] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.SetIsCasual
	// void SetIsCasual(bool bCasual);                                                                                          // [0x2e1cca0] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.SetAIPose
	// void SetAIPose(EAIPose InAIPose);                                                                                        // [0x2e1c910] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.IsJumping
	// bool IsJumping();                                                                                                        // [0x2df93c0] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.IsInTransitionAnimation
	// bool IsInTransitionAnimation();                                                                                          // [0x2e1c3a0] Native|Public|Const  
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.IsCrouchSliding
	// bool IsCrouchSliding();                                                                                                  // [0x2e1c370] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.GetUp
	// void GetUp(bool bWithCheck);                                                                                             // [0x2de8f20] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.GetLeanType
	// EAILeanType GetLeanType();                                                                                               // [0x2e1bf90] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.GetIsCasual
	// bool GetIsCasual();                                                                                                      // [0x2e1bf20] Native|Public|Const  
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.GetCrouchSlidingStartTime
	// float GetCrouchSlidingStartTime();                                                                                       // [0x2e1bcb0] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.GetAIPose
	// EAIPose GetAIPose();                                                                                                     // [0x29cc100] Native|Public|Const  
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.CanProneInCurrentEnvironment
	// bool CanProneInCurrentEnvironment();                                                                                     // [0x2e1bb20] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAIPoseInterface.CanJump
	// bool CanJump(FVector& InJumpDirection, float InJumpSpeed);                                                               // [0x2e1ba00] Native|Public|HasOutParms|HasDefaults 
};

/// Class /Script/MFNPCAI.NPCCharacterAISenseAbilityInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCCharacterAISenseAbilityInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCCharacterAISenseAbilityInterface.ProcessOnEnterInventoryFlash
	// void ProcessOnEnterInventoryFlash(bool bInSevere, bool bInModerate, bool bInMild, float CharFaceAngleDegree, FVector SocketLoc); // [0x2e1f240] Native|Public|HasDefaults 
	// Function /Script/MFNPCAI.NPCCharacterAISenseAbilityInterface.IsInGasArea
	// bool IsInGasArea();                                                                                                      // [0x288bc90] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAISenseAbilityInterface.IsImmuneTearGas
	// bool IsImmuneTearGas();                                                                                                  // [0x29cc100] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAISenseAbilityInterface.GetFlashBurnValue
	// float GetFlashBurnValue();                                                                                               // [0x2e1c200] Native|Public        
};

/// Class /Script/MFNPCAI.NPCCharacterAISoundInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCCharacterAISoundInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCCharacterAISoundInterface.PlaySoundAtLocation
	// void PlaySoundAtLocation(class UObject* WorldContextObject, class UAkAudioEvent* AudioEvent, FVector Location, FRotator Rotation); // [0x2e1f0b0] Native|Public|HasDefaults 
	// Function /Script/MFNPCAI.NPCCharacterAISoundInterface.PlayAISoundByType
	// void PlayAISoundByType(EAISoundType CurrType);                                                                           // [0x2e1f030] Native|Public        
};

/// Class /Script/MFNPCAI.NPCCharacterAITakeCoverInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCCharacterAITakeCoverInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCCharacterAITakeCoverInterface.StopToTakeCover
	// void StopToTakeCover();                                                                                                  // [0x296f9d0] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAITakeCoverInterface.IsTakingCover
	// bool IsTakingCover();                                                                                                    // [0x288c750] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAITakeCoverInterface.BeginToTakeCoverCrouch
	// void BeginToTakeCoverCrouch();                                                                                           // [0x2a20fb0] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAITakeCoverInterface.BeginToTakeCover
	// void BeginToTakeCover();                                                                                                 // [0x2a7ed80] Native|Public        
};

/// Class /Script/MFNPCAI.NPCCharacterAITeamRescueInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCCharacterAITeamRescueInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCCharacterAITeamRescueInterface.StopRescueTeammate
	// void StopRescueTeammate();                                                                                               // [0x2867280] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAITeamRescueInterface.RescueDBNOTeammate
	// bool RescueDBNOTeammate(class AActor* InTarget);                                                                         // [0x2e1c470] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAITeamRescueInterface.GetNearestDBNOTeammate
	// class AActor* GetNearestDBNOTeammate(float InRange);                                                                     // [0x2e1ec40] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAITeamRescueInterface.GetIsRescuingTeammate
	// bool GetIsRescuingTeammate();                                                                                            // [0x288c780] Native|Public        
};

/// Class /Script/MFNPCAI.NPCCharacterAITurnInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCCharacterAITurnInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCCharacterAITurnInterface.LookToPoint
	// void LookToPoint(FVector& Point, float RotateSpeedInDegree, float AcceleratedSpeedInDegree, bool bQuickly);              // [0x2e1eed0] Native|Public|HasOutParms|HasDefaults 
	// Function /Script/MFNPCAI.NPCCharacterAITurnInterface.LookToMovingDirection
	// void LookToMovingDirection(float RotateSpeedInDegree, float AcceleratedSpeedInDegree);                                   // [0x2e1ee00] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAITurnInterface.LockLookToPoint
	// void LockLookToPoint(float LockTime);                                                                                    // [0x2e1ed80] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAITurnInterface.IsTurning
	// bool IsTurning();                                                                                                        // [0x288bc90] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterAITurnInterface.GetActualActorTurnSpeed
	// float GetActualActorTurnSpeed();                                                                                         // [0x2e1bd30] Native|Public        
};

/// Class /Script/MFNPCAI.NPCCharacterHealthInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCCharacterHealthInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCCharacterHealthInterface.SetHealthMax
	// void SetHealthMax(float Value, class AActor* Instigator);                                                                // [0x2e1f5d0] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterHealthInterface.SetHealth
	// void SetHealth(float Value, class AActor* Instigator);                                                                   // [0x2e1f500] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterHealthInterface.GetHealthMax
	// float GetHealthMax();                                                                                                    // [0x2e1ec10] Native|Public        
	// Function /Script/MFNPCAI.NPCCharacterHealthInterface.GetHealth
	// float GetHealth();                                                                                                       // [0x2e1bd30] Native|Public        
};

/// Class /Script/MFNPCAI.NPCCharacterTakeDamageInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UNPCCharacterTakeDamageInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.NPCCharacterTakeDamageInterface.TakeDamage
	// float TakeDamage(float DamageAmount, FDamageEvent& DamageEvent, class AController* EventInstigator, class AActor* DamageCauser); // [0x2e1f6a0] Native|Public|HasOutParms 
};

/// Class /Script/MFNPCAI.NPCGrassIdentificationVolume
/// Size: 0x0000 (0 bytes) (0x000318 - 0x000318) align 8 pad: 0x0000
class ANPCGrassIdentificationVolume : public ATriggerVolume
{ 
public:
};

/// Class /Script/MFNPCAI.SGActorFactionCompInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class USGActorFactionCompInterface : public UInterface
{ 
public:
};

/// Class /Script/MFNPCAI.SGFactionInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class USGFactionInterface : public UInterface
{ 
public:
};

/// Class /Script/MFNPCAI.SGTeamInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class USGTeamInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/MFNPCAI.SGTeamInterface.RemoveFromTeam
	// bool RemoveFromTeam(class AActor* C, bool bRemoveAll);                                                                   // [0x2e1f430] Native|Public        
	// Function /Script/MFNPCAI.SGTeamInterface.GetTeamMembers
	// TArray<AActor*> GetTeamMembers();                                                                                        // [0x2e1ecd0] Native|Public|Const  
	// Function /Script/MFNPCAI.SGTeamInterface.GetFactionComp
	// class UActorComponent* GetFactionComp();                                                                                 // [0x28c08b0] Native|Public        
	// Function /Script/MFNPCAI.SGTeamInterface.FactionChanged
	// void FactionChanged(char NewFactionType);                                                                                // [0x2e1eb90] Native|Public        
	// Function /Script/MFNPCAI.SGTeamInterface.AddToTeam
	// bool AddToTeam(class AActor* C);                                                                                         // [0x2e1c470] Native|Public        
};

/// Struct /Script/MFNPCAI.NavSkeletonGraphResultNode
/// Size: 0x000C (12 bytes) (0x000000 - 0x00000C) align 4 pad: 0x0000
struct FNavSkeletonGraphResultNode
{ 
	int32_t                                            PointID;                                                    // 0x0000   (0x0004)  
	int32_t                                            ParentID;                                                   // 0x0004   (0x0004)  
	float                                              PathLength;                                                 // 0x0008   (0x0004)  
};

/// Struct /Script/MFNPCAI.NavSkeletonGraphFindResult
/// Size: 0x0038 (56 bytes) (0x000000 - 0x000038) align 8 pad: 0x0000
struct FNavSkeletonGraphFindResult
{ 
	EGraphAStarResult                                  status;                                                     // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0001   (0x0007)  MISSED
	TArray<FNavSkeletonGraphResultNode>                Nodes;                                                      // 0x0008   (0x0010)  
	TArray<int32_t>                                    DesiredNodeIndices;                                         // 0x0018   (0x0010)  
	TArray<int32_t>                                    DesiredPointIDs;                                            // 0x0028   (0x0010)  
};

/// Struct /Script/MFNPCAI.NPCAIFindAmbushAgainstPointResult
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 4 pad: 0x0000
struct FNPCAIFindAmbushAgainstPointResult
{ 
	FVector                                            AgainstPoint;                                               // 0x0000   (0x000C)  
	bool                                               bCanFind;                                                   // 0x000C   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x000D   (0x0003)  MISSED
};

/// Struct /Script/MFNPCAI.NPCAIFindPathByKeyRouteResult
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FNPCAIFindPathByKeyRouteResult
{ 
	TArray<FKeyRoutePointData>                         Path;                                                       // 0x0000   (0x0010)  
};

/// Struct /Script/MFNPCAI.NPCAIPeekPointResult
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 4 pad: 0x0000
struct FNPCAIPeekPointResult
{ 
	FVector                                            PeekPoint;                                                  // 0x0000   (0x000C)  
	bool                                               bWillExpose;                                                // 0x000C   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x000D   (0x0003)  MISSED
};

/// Struct /Script/MFNPCAI.AIRuntimeMonitorStatInfo
/// Size: 0x002C (44 bytes) (0x000000 - 0x00002C) align 4 pad: 0x0000
struct FAIRuntimeMonitorStatInfo
{ 
	float                                              HistoryIncAvg;                                              // 0x0000   (0x0004)  
	float                                              HistoryIncMax;                                              // 0x0004   (0x0004)  
	int32_t                                            HistoryMaxCallCount;                                        // 0x0008   (0x0004)  
	float                                              HistoryAvgCallCount;                                        // 0x000C   (0x0004)  
	int32_t                                            TotalIncCount;                                              // 0x0010   (0x0004)  
	float                                              TotalIncExeTime;                                            // 0x0014   (0x0004)  
	int32_t                                            TotalSavedNum;                                              // 0x0018   (0x0004)  
	uint32_t                                           NowFrame32;                                                 // 0x001C   (0x0004)  
	int32_t                                            NowFrameCallCount;                                          // 0x0020   (0x0004)  
	float                                              NowFrameExeUseTime;                                         // 0x0024   (0x0004)  
	float                                              WarningTopCost;                                             // 0x0028   (0x0004)  
};

/// Struct /Script/MFNPCAI.NPCAIActivityAIIDModifierTableRow
/// Size: 0x0038 (56 bytes) (0x000008 - 0x000040) align 8 pad: 0x0000
struct FNPCAIActivityAIIDModifierTableRow : FTableRowBase
{ 
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0008   (0x0008)  MISSED
	int64_t                                            ActivityID;                                                 // 0x0010   (0x0008)  
	int32_t                                            Priority;                                                   // 0x0018   (0x0004)  
	int32_t                                            SourceCategory;                                             // 0x001C   (0x0004)  
	int32_t                                            SourceCareer;                                               // 0x0020   (0x0004)  
	int32_t                                            SourceTendency;                                             // 0x0024   (0x0004)  
	int32_t                                            SourceDifficulty;                                           // 0x0028   (0x0004)  
	int32_t                                            TargetCategory;                                             // 0x002C   (0x0004)  
	int32_t                                            TargetCareer;                                               // 0x0030   (0x0004)  
	int32_t                                            TargetTendency;                                             // 0x0034   (0x0004)  
	int32_t                                            TargetDifficulty;                                           // 0x0038   (0x0004)  
	int32_t                                            TargetEquipPoolID;                                          // 0x003C   (0x0004)  
};

/// Struct /Script/MFNPCAI.AIDataProviderFVectorValue
/// Size: 0x0010 (16 bytes) (0x000030 - 0x000040) align 8 pad: 0x0000
struct FAIDataProviderFVectorValue : FAIDataProviderTypedValue
{ 
	FVector                                            DefaultValue;                                               // 0x0030   (0x000C)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x003C   (0x0004)  MISSED
};

/// Struct /Script/MFNPCAI.AIDoorSingleSafetyPoint
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 4 pad: 0x0000
struct FAIDoorSingleSafetyPoint
{ 
	FVector                                            Location;                                                   // 0x0000   (0x000C)  
	float                                              DangerValue;                                                // 0x000C   (0x0004)  
};

/// Struct /Script/MFNPCAI.AISafetyOpenDoorResp
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 8 pad: 0x0000
struct FAISafetyOpenDoorResp
{ 
	class AActor*                                      SGDoor;                                                     // 0x0000   (0x0008)  
	FVector                                            NavLinkPoint;                                               // 0x0008   (0x000C)  
	FVector                                            SafetyWaitPoint;                                            // 0x0014   (0x000C)  
};

/// Struct /Script/MFNPCAI.NPCAIProfileCoverTag
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FNPCAIProfileCoverTag
{ 
	class UClass*                                      ProfileClass;                                               // 0x0000   (0x0008)  
	EAIProfileType                                     ProfileType;                                                // 0x0008   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0009   (0x0003)  MISSED
	FName                                              VarName;                                                    // 0x000C   (0x0008)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x0014   (0x0004)  MISSED
};

/// Struct /Script/MFNPCAI.AIEnemyInfo
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 4 pad: 0x0000
struct FAIEnemyInfo
{ 
	float                                              FireTime;                                                   // 0x0000   (0x0004)  
	float                                              TimeInterval;                                               // 0x0004   (0x0004)  
	FVector                                            FireLocation;                                               // 0x0008   (0x000C)  
	FVector                                            FireDirection;                                              // 0x0014   (0x000C)  
};

/// Struct /Script/MFNPCAI.AIGlobalCacheActors
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FAIGlobalCacheActors
{ 
	float                                              LastTimeSeconds;                                            // 0x0000   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0004   (0x0004)  MISSED
	SDK_UNDEFINED(16,637) /* TArray<TWeakObjectPtr<AActor*>> */ __um(CacheActors);                                 // 0x0008   (0x0010)  
};

/// Struct /Script/MFNPCAI.GraphAStarPolicy
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 4 pad: 0x0000
struct FGraphAStarPolicy
{ 
	int32_t                                            NodePoolSize;                                               // 0x0000   (0x0004)  
	int32_t                                            OpenSetSize;                                                // 0x0004   (0x0004)  
	int32_t                                            MaxPathNodeCount;                                           // 0x0008   (0x0004)  
	bool                                               bReuseNodePoolInSubsequentSearches;                         // 0x000C   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x000D   (0x0003)  MISSED
};

/// Struct /Script/MFNPCAI.NPCAIIDModifierTableRow
/// Size: 0x0008 (8 bytes) (0x000008 - 0x000010) align 8 pad: 0x0000
struct FNPCAIIDModifierTableRow : FTableRowBase
{ 
	int64_t                                            TargetAIID;                                                 // 0x0008   (0x0008)  
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonBuildStage
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonBuildStage
{ 
	unsigned char                                      UnknownData00_2[0x20];                                      // 0x0000   (0x0020)  MISSED
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonAddRegionConnectionStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonAddRegionConnectionStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonBuilder
/// Size: 0x0480 (1152 bytes) (0x000000 - 0x000480) align 16 pad: 0x0000
struct FNPCAINavSkeletonBuilder
{ 
	class UObject*                                     WorldContextObject;                                         // 0x0000   (0x0008)  
	unsigned char                                      UnknownData00_6[0xB0];                                      // 0x0008   (0x00B0)  MISSED
	class UWorld*                                      World;                                                      // 0x00B8   (0x0008)  
	unsigned char                                      UnknownData01_6[0x8];                                       // 0x00C0   (0x0008)  MISSED
	class ARecastNavMesh*                              MainNavData;                                                // 0x00C8   (0x0008)  
	class ANPCAINavMeshManager*                        NavMeshManager;                                             // 0x00D0   (0x0008)  
	unsigned char                                      UnknownData02_6[0x8];                                       // 0x00D8   (0x0008)  MISSED
	TArray<class ANPCAINavLinkProxy*>                  LinkProxies;                                                // 0x00E0   (0x0010)  
	unsigned char                                      UnknownData03_7[0x390];                                     // 0x00F0   (0x0390)  MISSED
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonCalculateCoverageStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonCalculateCoverageStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonCalculateDivergenceStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonCalculateDivergenceStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonCalculateGradientStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonCalculateGradientStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonCalculateSymmetricAttributeStage
/// Size: 0x0008 (8 bytes) (0x000020 - 0x000028) align 8 pad: 0x0000
struct FNPCAINavSkeletonCalculateSymmetricAttributeStage : FNPCAINavSkeletonBuildStage
{ 
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0020   (0x0008)  MISSED
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonCalculateMovingStage
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
struct FNPCAINavSkeletonCalculateMovingStage : FNPCAINavSkeletonCalculateSymmetricAttributeStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonCalculateOutdoorsStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonCalculateOutdoorsStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonCalculateProtectionStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonCalculateProtectionStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonCalculateThrowingStage
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
struct FNPCAINavSkeletonCalculateThrowingStage : FNPCAINavSkeletonCalculateSymmetricAttributeStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonCalculateVisibilityStage
/// Size: 0x0080 (128 bytes) (0x000028 - 0x0000A8) align 8 pad: 0x0000
struct FNPCAINavSkeletonCalculateVisibilityStage : FNPCAINavSkeletonCalculateSymmetricAttributeStage
{ 
	unsigned char                                      UnknownData00_1[0x80];                                      // 0x0028   (0x0080)  MISSED
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonCalculateWallDistanceStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonCalculateWallDistanceStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonCheckEdgeOnNavMeshStage
/// Size: 0x0008 (8 bytes) (0x000020 - 0x000028) align 8 pad: 0x0000
struct FNPCAINavSkeletonCheckEdgeOnNavMeshStage : FNPCAINavSkeletonBuildStage
{ 
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0020   (0x0008)  MISSED
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonCollectConnectionInfoStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonCollectConnectionInfoStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonCollectNeighbourInfoStage
/// Size: 0x0008 (8 bytes) (0x000020 - 0x000028) align 8 pad: 0x0000
struct FNPCAINavSkeletonCollectNeighbourInfoStage : FNPCAINavSkeletonBuildStage
{ 
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0020   (0x0008)  MISSED
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonFindPathForUnstableSegmentStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonFindPathForUnstableSegmentStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonFindWallsInNeighbourhoodStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonFindWallsInNeighbourhoodStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonGeneratePolylineStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonGeneratePolylineStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonGenerateRawPointStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonGenerateRawPointStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NavSkeletonPathFindingQueue
/// Size: 0x0088 (136 bytes) (0x000000 - 0x000088) align 8 pad: 0x0000
struct FNavSkeletonPathFindingQueue
{ 
	unsigned char                                      UnknownData00_7[0x18];                                      // 0x0000   (0x0018)  MISSED
	SDK_UNDEFINED(80,638) /* TMap<TWeakObjectPtr<UObject*>, FNavSkeletonPathFindingRequest> */ __um(QuerierToRequest); // 0x0018   (0x0050)  
	unsigned char                                      UnknownData01_7[0x20];                                      // 0x0068   (0x0020)  MISSED
};

/// Struct /Script/MFNPCAI.NavSkeletonPathFindingRequest
/// Size: 0x0198 (408 bytes) (0x000000 - 0x000198) align 8 pad: 0x0000
struct FNavSkeletonPathFindingRequest
{ 
	unsigned char                                      UnknownData00_2[0x198];                                     // 0x0000   (0x0198)  MISSED
};

/// Struct /Script/MFNPCAI.NavSkeletonGraphAStarFilter
/// Size: 0x00C0 (192 bytes) (0x000000 - 0x0000C0) align 8 pad: 0x0000
struct FNavSkeletonGraphAStarFilter
{ 
	SDK_UNDEFINED(8,639) /* TWeakObjectPtr<UObject*> */ __um(WeakOwner);                                           // 0x0000   (0x0008)  
	int32_t                                            MaxSearchNodes;                                             // 0x0008   (0x0004)  
	float                                              CostLimit;                                                  // 0x000C   (0x0004)  
	float                                              TimeLimit;                                                  // 0x0010   (0x0004)  
	bool                                               bShouldIncludeStartNodeInPath;                              // 0x0014   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0015   (0x0003)  MISSED
	SDK_UNDEFINED(80,640) /* TSet<int32_t> */          __um(UnreachablePointIDs);                                  // 0x0018   (0x0050)  
	bool                                               bOnTryBestToIncludePointIDs;                                // 0x0068   (0x0001)  
	unsigned char                                      UnknownData01_6[0x7];                                       // 0x0069   (0x0007)  MISSED
	SDK_UNDEFINED(80,641) /* TSet<int32_t> */          __um(TryBestToIncludePointIDs);                             // 0x0070   (0x0050)  
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonInitializePointExtraAttributeStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonInitializePointExtraAttributeStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonLabelNavMeshStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonLabelNavMeshStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonPrunePointStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonPrunePointStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonRemoveIsolatedPointStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonRemoveIsolatedPointStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonRemoveTriangleConnectionStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonRemoveTriangleConnectionStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonSavePointStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonSavePointStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonSetupPointBattleIntensityExpectation
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonSetupPointBattleIntensityExpectation : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonSetupPointBattleVolumeStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonSetupPointBattleVolumeStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonSetupPointKindStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonSetupPointKindStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAINavSkeletonSimplifyPolylineStage
/// Size: 0x0000 (0 bytes) (0x000020 - 0x000020) align 8 pad: 0x0000
struct FNPCAINavSkeletonSimplifyPolylineStage : FNPCAINavSkeletonBuildStage
{ 
};

/// Struct /Script/MFNPCAI.NavSkeletonMoveSettings
/// Size: 0x0001 (1 bytes) (0x000000 - 0x000001) align 1 pad: 0x0000
struct FNavSkeletonMoveSettings
{ 
	bool                                               bWantPathOptimization;                                      // 0x0000   (0x0001)  
};

/// Struct /Script/MFNPCAI.NavSkeletonPathPoint
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 8 pad: 0x0000
struct FNavSkeletonPathPoint
{ 
	FVector                                            Location;                                                   // 0x0000   (0x000C)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	uint64_t                                           NodeRef;                                                    // 0x0010   (0x0008)  
	uint32_t                                           Flags;                                                      // 0x0018   (0x0004)  
	uint32_t                                           CustomLinkId;                                               // 0x001C   (0x0004)  
	FNavLinkId                                         CustomNavLinkId;                                            // 0x0020   (0x0008)  
};

/// Struct /Script/MFNPCAI.NavSkeletonPatchedPath
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FNavSkeletonPatchedPath
{ 
	TArray<FNavSkeletonPathPoint>                      PathPoints;                                                 // 0x0000   (0x0010)  
};

/// Struct /Script/MFNPCAI.NavSkeletonPolyline
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FNavSkeletonPolyline
{ 
	TArray<int32_t>                                    PointIDs;                                                   // 0x0000   (0x0010)  
	float                                              PolylineLength;                                             // 0x0010   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0014   (0x0004)  MISSED
};

/// Struct /Script/MFNPCAI.NavSkeletonSamplePoint
/// Size: 0x0058 (88 bytes) (0x000000 - 0x000058) align 8 pad: 0x0000
struct FNavSkeletonSamplePoint
{ 
	unsigned char                                      UnknownData00_2[0x58];                                      // 0x0000   (0x0058)  MISSED
};

/// Struct /Script/MFNPCAI.NavSkeletonSamplePolyline
/// Size: 0x0040 (64 bytes) (0x000000 - 0x000040) align 8 pad: 0x0000
struct FNavSkeletonSamplePolyline
{ 
	unsigned char                                      UnknownData00_2[0x40];                                      // 0x0000   (0x0040)  MISSED
};

/// Struct /Script/MFNPCAI.NavCostModifierSharedPointer
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FNavCostModifierSharedPointer
{ 
	unsigned char                                      UnknownData00_2[0x10];                                      // 0x0000   (0x0010)  MISSED
};

/// Struct /Script/MFNPCAI.NavCostModifier
/// Size: 0x0040 (64 bytes) (0x000000 - 0x000040) align 8 pad: 0x0000
struct FNavCostModifier
{ 
	ENPCAIPerceptibleTile                              Kind;                                                       // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	SDK_UNDEFINED(8,642) /* TWeakObjectPtr<UObject*> */ __um(Instigator);                                          // 0x0004   (0x0008)  
	float                                              BeginTime;                                                  // 0x000C   (0x0004)  
	float                                              EndTime;                                                    // 0x0010   (0x0004)  
	FBox                                               Boundary;                                                   // 0x0014   (0x001C)  
	TArray<uint64_t>                                   AffectedPolyRefs;                                           // 0x0030   (0x0010)  
};

/// Struct /Script/MFNPCAI.NavCostDescriptor
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FNavCostDescriptor
{ 
	unsigned char                                      UnknownData00_2[0x10];                                      // 0x0000   (0x0010)  MISSED
};

/// Struct /Script/MFNPCAI.NavPolyRefArray
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FNavPolyRefArray
{ 
	unsigned char                                      UnknownData00_2[0x10];                                      // 0x0000   (0x0010)  MISSED
};

/// Struct /Script/MFNPCAI.NavConnectivityInfo
/// Size: 0x0058 (88 bytes) (0x000000 - 0x000058) align 8 pad: 0x0000
struct FNavConnectivityInfo
{ 
	unsigned char                                      UnknownData00_2[0x58];                                      // 0x0000   (0x0058)  MISSED
};

/// Struct /Script/MFNPCAI.SoAStorage
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FSoAStorage
{ 
	TArray<int32_t>                                    Offsets;                                                    // 0x0000   (0x0010)  
};

/// Struct /Script/MFNPCAI.PortalEdgeStorage
/// Size: 0x0010 (16 bytes) (0x000010 - 0x000020) align 8 pad: 0x0000
struct FPortalEdgeStorage : FSoAStorage
{ 
	TArray<FPortalEdge>                                Items;                                                      // 0x0010   (0x0010)  
};

/// Struct /Script/MFNPCAI.UInt64Storage
/// Size: 0x0010 (16 bytes) (0x000010 - 0x000020) align 8 pad: 0x0000
struct FUInt64Storage : FSoAStorage
{ 
	TArray<uint64_t>                                   Items;                                                      // 0x0010   (0x0010)  
};

/// Struct /Script/MFNPCAI.Int32Storage
/// Size: 0x0010 (16 bytes) (0x000010 - 0x000020) align 8 pad: 0x0000
struct FInt32Storage : FSoAStorage
{ 
	TArray<int32_t>                                    Items;                                                      // 0x0010   (0x0010)  
};

/// Struct /Script/MFNPCAI.NavLinkInfo
/// Size: 0x001C (28 bytes) (0x000000 - 0x00001C) align 4 pad: 0x0000
struct FNavLinkInfo
{ 
	bool                                               bValid;                                                     // 0x0000   (0x0001)  
	bool                                               bEnabled;                                                   // 0x0001   (0x0001)  
	char                                               Direction;                                                  // 0x0002   (0x0001)  
	ENavLinkType                                       LinkType;                                                   // 0x0003   (0x0001)  
	uint32_t                                           LinkID;                                                     // 0x0004   (0x0004)  
	int32_t                                            LinkIndex;                                                  // 0x0008   (0x0004)  
	int32_t                                            LeftIndex;                                                  // 0x000C   (0x0004)  
	int32_t                                            RightIndex;                                                 // 0x0010   (0x0004)  
	int32_t                                            LeftRegionIndex;                                            // 0x0014   (0x0004)  
	int32_t                                            RightRegionIndex;                                           // 0x0018   (0x0004)  
};

/// Struct /Script/MFNPCAI.CoverPointPathLengthResult
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 4 pad: 0x0000
struct FCoverPointPathLengthResult
{ 
	int32_t                                            PointID;                                                    // 0x0000   (0x0004)  
	float                                              PathLength;                                                 // 0x0004   (0x0004)  
};

/// Struct /Script/MFNPCAI.AICandidateStandPosition
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 4 pad: 0x0000
struct FAICandidateStandPosition
{ 
	float                                              PathLength;                                                 // 0x0000   (0x0004)  
	FVector                                            Location;                                                   // 0x0004   (0x000C)  
};

/// Struct /Script/MFNPCAI.AIGrassOctreeData
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 4 pad: 0x0000
struct FAIGrassOctreeData
{ 
	int32_t                                            GrassBlockIndex;                                            // 0x0000   (0x0004)  
	FVector                                            Location;                                                   // 0x0004   (0x000C)  
};

/// Struct /Script/MFNPCAI.AINearGrassBounds
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 8 pad: 0x0000
struct FAINearGrassBounds
{ 
	FVector                                            Center;                                                     // 0x0000   (0x000C)  
	float                                              Radius;                                                     // 0x000C   (0x0004)  
	TArray<int32_t>                                    GrassIndexs;                                                // 0x0010   (0x0010)  
};

/// Struct /Script/MFNPCAI.AIGrassClusterInfo
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 8 pad: 0x0000
struct FAIGrassClusterInfo
{ 
	FBox                                               Bounds;                                                     // 0x0000   (0x001C)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x001C   (0x0004)  MISSED
	TArray<FBox>                                       BoxList;                                                    // 0x0020   (0x0010)  
};

/// Struct /Script/MFNPCAI.AIGrassGrayBMP
/// Size: 0x0050 (80 bytes) (0x000000 - 0x000050) align 8 pad: 0x0000
struct FAIGrassGrayBMP
{ 
	int32_t                                            BMPWidth;                                                   // 0x0000   (0x0004)  
	int32_t                                            BMPHeight;                                                  // 0x0004   (0x0004)  
	TArray<FColor>                                     Colors;                                                     // 0x0008   (0x0010)  
	FVector2D                                          ZeroPoint;                                                  // 0x0018   (0x0008)  
	float                                              ScaleValue;                                                 // 0x0020   (0x0004)  
	int32_t                                            MinLine;                                                    // 0x0024   (0x0004)  
	int32_t                                            MaxLine;                                                    // 0x0028   (0x0004)  
	int32_t                                            MinRow;                                                     // 0x002C   (0x0004)  
	int32_t                                            MaxRow;                                                     // 0x0030   (0x0004)  
	FBox                                               OriginBoundBox;                                             // 0x0034   (0x001C)  
};

/// Struct /Script/MFNPCAI.AIGrassEditorBlock
/// Size: 0x0008 (8 bytes) (0x000078 - 0x000080) align 8 pad: 0x0000
struct FAIGrassEditorBlock : FAIGrassBlock
{ 
	class UStaticMesh*                                 StaticMesh;                                                 // 0x0078   (0x0008)  
};

/// Struct /Script/MFNPCAI.NPCAIPortraitToIDTableRow
/// Size: 0x0030 (48 bytes) (0x000008 - 0x000038) align 8 pad: 0x0000
struct FNPCAIPortraitToIDTableRow : FTableRowBase
{ 
	SDK_UNDEFINED(40,643) /* TWeakObjectPtr<UClass*> */ __um(PortraitClass);                                       // 0x0008   (0x0028)  
	int64_t                                            AIID;                                                       // 0x0030   (0x0008)  
};

/// Struct /Script/MFNPCAI.NPCAISceneEventInfo
/// Size: 0x0040 (64 bytes) (0x000000 - 0x000040) align 8 pad: 0x0000
struct FNPCAISceneEventInfo
{ 
	int32_t                                            UniqueID;                                                   // 0x0000   (0x0004)  
	ENPCAISceneEventID                                 eventId;                                                    // 0x0004   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0005   (0x0003)  MISSED
	float                                              StartTime;                                                  // 0x0008   (0x0004)  
	float                                              EndTime;                                                    // 0x000C   (0x0004)  
	float                                              ValidScope;                                                 // 0x0010   (0x0004)  
	FVector                                            TriggerLocation;                                            // 0x0014   (0x000C)  
	TArray<int64_t>                                    AIIDs;                                                      // 0x0020   (0x0010)  
	TArray<int64_t>                                    AIPathGroupIDs;                                             // 0x0030   (0x0010)  
};

/// Struct /Script/MFNPCAI.NPCAISceneEventTableRow
/// Size: 0x0040 (64 bytes) (0x000008 - 0x000048) align 8 pad: 0x0000
struct FNPCAISceneEventTableRow : FTableRowBase
{ 
	ENPCAISceneEventID                                 eventId;                                                    // 0x0008   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0009   (0x0003)  MISSED
	float                                              ValidTime;                                                  // 0x000C   (0x0004)  
	float                                              ValidScope;                                                 // 0x0010   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0014   (0x0004)  MISSED
	TArray<int64_t>                                    AIIDs;                                                      // 0x0018   (0x0010)  
	TArray<int64_t>                                    PathGroupIDs;                                               // 0x0028   (0x0010)  
	FString                                            Comments;                                                   // 0x0038   (0x0010)  
};

/// Struct /Script/MFNPCAI.NPCAINoiseEvent
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
struct FNPCAINoiseEvent : FAINoiseEvent
{ 
};

/// Struct /Script/MFNPCAI.NPCAISteepZoneDeleteStage
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FNPCAISteepZoneDeleteStage
{ 
	unsigned char                                      UnknownData00_2[0x10];                                      // 0x0000   (0x0010)  MISSED
};

/// Struct /Script/MFNPCAI.NPCAISteepZoneCalculatePointNormalStage
/// Size: 0x0000 (0 bytes) (0x000010 - 0x000010) align 8 pad: 0x0000
struct FNPCAISteepZoneCalculatePointNormalStage : FNPCAISteepZoneDeleteStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAISteepZoneCalculatePointSteepDensityStage
/// Size: 0x0000 (0 bytes) (0x000010 - 0x000010) align 8 pad: 0x0000
struct FNPCAISteepZoneCalculatePointSteepDensityStage : FNPCAISteepZoneDeleteStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAISteepZoneCalculatePolyNormalStage
/// Size: 0x0000 (0 bytes) (0x000010 - 0x000010) align 8 pad: 0x0000
struct FNPCAISteepZoneCalculatePolyNormalStage : FNPCAISteepZoneDeleteStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAISteepZoneCollectNavMeshPolyStage
/// Size: 0x0000 (0 bytes) (0x000010 - 0x000010) align 8 pad: 0x0000
struct FNPCAISteepZoneCollectNavMeshPolyStage : FNPCAISteepZoneDeleteStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAISteepZoneGenerateSamplePointStage
/// Size: 0x0000 (0 bytes) (0x000010 - 0x000010) align 8 pad: 0x0000
struct FNPCAISteepZoneGenerateSamplePointStage : FNPCAISteepZoneDeleteStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAISteepZoneModifyTileCacheStage
/// Size: 0x0000 (0 bytes) (0x000010 - 0x000010) align 8 pad: 0x0000
struct FNPCAISteepZoneModifyTileCacheStage : FNPCAISteepZoneDeleteStage
{ 
};

/// Struct /Script/MFNPCAI.NPCAISteepZoneRebuildNavMeshStage
/// Size: 0x0000 (0 bytes) (0x000010 - 0x000010) align 8 pad: 0x0000
struct FNPCAISteepZoneRebuildNavMeshStage : FNPCAISteepZoneDeleteStage
{ 
};

/// Struct /Script/MFNPCAI.SteepZoneSamplePoint
/// Size: 0x0050 (80 bytes) (0x000000 - 0x000050) align 8 pad: 0x0000
struct FSteepZoneSamplePoint
{ 
	unsigned char                                      UnknownData00_2[0x50];                                      // 0x0000   (0x0050)  MISSED
};

/// Struct /Script/MFNPCAI.SteepZoneNavMeshPoly
/// Size: 0x0048 (72 bytes) (0x000000 - 0x000048) align 8 pad: 0x0000
struct FSteepZoneNavMeshPoly
{ 
	unsigned char                                      UnknownData00_2[0x48];                                      // 0x0000   (0x0048)  MISSED
};

/// Struct /Script/MFNPCAI.SteepZoneDetailTriangle
/// Size: 0x0070 (112 bytes) (0x000000 - 0x000070) align 8 pad: 0x0000
struct FSteepZoneDetailTriangle
{ 
	unsigned char                                      UnknownData00_2[0x70];                                      // 0x0000   (0x0070)  MISSED
};

/// Struct /Script/MFNPCAI.AITrackLOGTemplateForDataTable
/// Size: 0x0018 (24 bytes) (0x000008 - 0x000020) align 8 pad: 0x0000
struct FAITrackLOGTemplateForDataTable : FTableRowBase
{ 
	EAITrackLOGType                                    LogType;                                                    // 0x0008   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0009   (0x0007)  MISSED
	FString                                            Template;                                                   // 0x0010   (0x0010)  
};

/// Struct /Script/MFNPCAI.AILocationRecord
/// Size: 0x0014 (20 bytes) (0x000000 - 0x000014) align 4 pad: 0x0000
struct FAILocationRecord
{ 
	unsigned char                                      UnknownData00_2[0x14];                                      // 0x0000   (0x0014)  MISSED
};

/// Struct /Script/MFNPCAI.AIDebugLineStruct
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 4 pad: 0x0000
struct FAIDebugLineStruct
{ 
	int32_t                                            ID;                                                         // 0x0000   (0x0004)  
	FVector                                            StartLocation;                                              // 0x0004   (0x000C)  
	FVector                                            EndLocation;                                                // 0x0010   (0x000C)  
	FColor                                             Color;                                                      // 0x001C   (0x0004)  
	float                                              DurationTime;                                               // 0x0020   (0x0004)  
	float                                              EndTime;                                                    // 0x0024   (0x0004)  
};

/// Struct /Script/MFNPCAI.AIDebugDrawSphereInfo
/// Size: 0x0024 (36 bytes) (0x000000 - 0x000024) align 4 pad: 0x0000
struct FAIDebugDrawSphereInfo
{ 
	FVector                                            Loc;                                                        // 0x0000   (0x000C)  
	float                                              Radius;                                                     // 0x000C   (0x0004)  
	FLinearColor                                       LineColor;                                                  // 0x0010   (0x0010)  
	float                                              Duration;                                                   // 0x0020   (0x0004)  
};

/// Struct /Script/MFNPCAI.AIDebugDrawLineInfo
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 4 pad: 0x0000
struct FAIDebugDrawLineInfo
{ 
	FVector                                            StartLoc;                                                   // 0x0000   (0x000C)  
	FVector                                            EndLoc;                                                     // 0x000C   (0x000C)  
	FLinearColor                                       LineColor;                                                  // 0x0018   (0x0010)  
	float                                              Duration;                                                   // 0x0028   (0x0004)  
	float                                              Thickness;                                                  // 0x002C   (0x0004)  
};

/// Struct /Script/MFNPCAI.PMCAISpawnInfo_ForSearchPath
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FPMCAISpawnInfo_ForSearchPath
{ 
	class AActor*                                      SourcePoint;                                                // 0x0000   (0x0008)  
	float                                              TotalCost;                                                  // 0x0008   (0x0004)  
	bool                                               Checked;                                                    // 0x000C   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x000D   (0x0003)  MISSED
};

/// Struct /Script/MFNPCAI.CheckCoverPointFinder
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 8 pad: 0x0000
struct FCheckCoverPointFinder
{ 
	class AActor*                                      AIPawn;                                                     // 0x0000   (0x0008)  
	float                                              CheckPathLength;                                            // 0x0008   (0x0004)  
	int32_t                                            IndexFind;                                                  // 0x000C   (0x0004)  
	float                                              LastTimestamp;                                              // 0x0010   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0014   (0x0004)  MISSED
	TArray<FCoverPointOctreeElement>                   Elements;                                                   // 0x0018   (0x0010)  
};

/// Struct /Script/MFNPCAI.AICoverPointInfo
/// Size: 0x0048 (72 bytes) (0x000000 - 0x000048) align 8 pad: 0x0000
struct FAICoverPointInfo
{ 
	int32_t                                            ID;                                                         // 0x0000   (0x0004)  
	bool                                               IsFree;                                                     // 0x0004   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0005   (0x0003)  MISSED
	class AActor*                                      OwnerActor;                                                 // 0x0008   (0x0008)  
	FVector                                            Location;                                                   // 0x0010   (0x000C)  
	FVector                                            ToWallVector;                                               // 0x001C   (0x000C)  
	EAIPose                                            ProtectedStance;                                            // 0x0028   (0x0001)  
	bool                                               IsSafe;                                                     // 0x0029   (0x0001)  
	unsigned char                                      UnknownData01_6[0x2];                                       // 0x002A   (0x0002)  MISSED
	float                                              LastSpottedTime;                                            // 0x002C   (0x0004)  
	FVector                                            FirePosition;                                               // 0x0030   (0x000C)  
	EAIPose                                            FireStance;                                                 // 0x003C   (0x0001)  
	EAILeanType                                        TiltType;                                                   // 0x003D   (0x0001)  
	unsigned char                                      UnknownData02_6[0x2];                                       // 0x003E   (0x0002)  MISSED
	float                                              BaseWeight;                                                 // 0x0040   (0x0004)  
	unsigned char                                      UnknownData03_7[0x4];                                       // 0x0044   (0x0004)  MISSED
};

/// Struct /Script/MFNPCAI.AICharacterConfig
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 4 pad: 0x0000
struct FAICharacterConfig
{ 
	float                                              FireInterval;                                               // 0x0000   (0x0004)  
	float                                              PerBurstReduce;                                             // 0x0004   (0x0004)  
};

/// Struct /Script/MFNPCAI.AIIDSegInfoData
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FAIIDSegInfoData
{ 
	int64_t                                            Div;                                                        // 0x0000   (0x0008)  
	int64_t                                            Mod;                                                        // 0x0008   (0x0008)  
};

/// Struct /Script/MFNPCAI.AIIDSegInfo
/// Size: 0x0040 (64 bytes) (0x000000 - 0x000040) align 8 pad: 0x0000
struct FAIIDSegInfo
{ 
	FAIIDSegInfoData                                   MainCategory;                                               // 0x0000   (0x0010)  
	FAIIDSegInfoData                                   Career;                                                     // 0x0010   (0x0010)  
	FAIIDSegInfoData                                   Tendency;                                                   // 0x0020   (0x0010)  
	FAIIDSegInfoData                                   Difficulty;                                                 // 0x0030   (0x0010)  
};

/// Struct /Script/MFNPCAI.NPCAIRollDecisionStruct
/// Size: 0x0010 (16 bytes) (0x000008 - 0x000018) align 8 pad: 0x0000
struct FNPCAIRollDecisionStruct : FTableRowBase
{ 
	ENPCAIDecision                                     Decision;                                                   // 0x0008   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0009   (0x0003)  MISSED
	float                                              BaseTendency;                                               // 0x000C   (0x0004)  
	float                                              BasePerceive;                                               // 0x0010   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x0014   (0x0004)  MISSED
};

/// Struct /Script/MFNPCAI.NPCAIMoveRequest
/// Size: 0x0008 (8 bytes) (0x000040 - 0x000048) align 8 pad: 0x0000
struct FNPCAIMoveRequest : FAIMoveRequest
{ 
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0040   (0x0008)  MISSED
};

/// Struct /Script/MFNPCAI.NPCAIFireSetting
/// Size: 0x0040 (64 bytes) (0x000000 - 0x000040) align 8 pad: 0x0000
struct FNPCAIFireSetting
{ 
	FVector                                            Location;                                                   // 0x0000   (0x000C)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	class AActor*                                      EnemyTarget;                                                // 0x0010   (0x0008)  
	bool                                               bCalcSight;                                                 // 0x0018   (0x0001)  
	bool                                               bCalcShoot;                                                 // 0x0019   (0x0001)  
	unsigned char                                      UnknownData01_6[0x2];                                       // 0x001A   (0x0002)  MISSED
	float                                              FireInterval;                                               // 0x001C   (0x0004)  
	bool                                               bIgnoreAimingTime;                                          // 0x0020   (0x0001)  
	bool                                               bEnabledHitRateControl;                                     // 0x0021   (0x0001)  
	bool                                               bEnabledRecoilControl;                                      // 0x0022   (0x0001)  
	EAIBodyPartType                                    ShootPartID;                                                // 0x0023   (0x0001)  
	EAIBodyPartType                                    LastShootPartID;                                            // 0x0024   (0x0001)  
	bool                                               bPressureAim;                                               // 0x0025   (0x0001)  
	unsigned char                                      UnknownData02_6[0x2];                                       // 0x0026   (0x0002)  MISSED
	float                                              WaitEndtime;                                                // 0x0028   (0x0004)  
	FVector                                            LastFireLocation;                                           // 0x002C   (0x000C)  
	class UNPCAITargetInfo*                            EnemyInfo;                                                  // 0x0038   (0x0008)  
};

/// Struct /Script/MFNPCAI.NPCAIFireOrder
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 4 pad: 0x0000
struct FNPCAIFireOrder
{ 
	bool                                               bValidOrder;                                                // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	FVector                                            FirePoint;                                                  // 0x0004   (0x000C)  
	EAIBodyPartType                                    HitPart;                                                    // 0x0010   (0x0001)  
	bool                                               IsUsingPredestined;                                         // 0x0011   (0x0001)  
	bool                                               IsHit;                                                      // 0x0012   (0x0001)  
	bool                                               bShotLimited;                                               // 0x0013   (0x0001)  
	bool                                               bFakeShot;                                                  // 0x0014   (0x0001)  
	unsigned char                                      UnknownData01_7[0x3];                                       // 0x0015   (0x0003)  MISSED
};

/// Struct /Script/MFNPCAI.AIBodyPartVisibilityInfo
/// Size: 0x0014 (20 bytes) (0x000000 - 0x000014) align 4 pad: 0x0000
struct FAIBodyPartVisibilityInfo
{ 
	EAIBodyPartType                                    BodyPartType;                                               // 0x0000   (0x0001)  
	bool                                               bIsVisible;                                                 // 0x0001   (0x0001)  
	bool                                               bCanShoot;                                                  // 0x0002   (0x0001)  
	unsigned char                                      UnknownData00_6[0x1];                                       // 0x0003   (0x0001)  MISSED
	float                                              LastCanSeeTime;                                             // 0x0004   (0x0004)  
	int32_t                                            GrassWeight;                                                // 0x0008   (0x0004)  
	int32_t                                            ShootCalculateCount;                                        // 0x000C   (0x0004)  
	ENPCAISenseBarrier                                 Barrier;                                                    // 0x0010   (0x0001)  
	unsigned char                                      UnknownData01_7[0x3];                                       // 0x0011   (0x0003)  MISSED
};

/// Struct /Script/MFNPCAI.AIBodyPartHitInfo
/// Size: 0x0014 (20 bytes) (0x000000 - 0x000014) align 4 pad: 0x0000
struct FAIBodyPartHitInfo
{ 
	EAIBodyPartType                                    BodyPartType;                                               // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	float                                              HitDurationStartTime;                                       // 0x0004   (0x0004)  
	float                                              HitDurationValues;                                          // 0x0008   (0x0004)  
	float                                              FirstHitTime;                                               // 0x000C   (0x0004)  
	float                                              LastHitTime;                                                // 0x0010   (0x0004)  
};

/// Struct /Script/MFNPCAI.AINoiseMakerInfo
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 4 pad: 0x0000
struct FAINoiseMakerInfo
{ 
	float                                              lasttime_footstep;                                          // 0x0000   (0x0004)  
	float                                              lasttime_gunfire;                                           // 0x0004   (0x0004)  
	float                                              lasttime_bulletfire;                                        // 0x0008   (0x0004)  
	float                                              lasttime_bullethit;                                         // 0x000C   (0x0004)  
};

/// Struct /Script/MFNPCAI.AIVisibleResult
/// Size: 0x000C (12 bytes) (0x000000 - 0x00000C) align 4 pad: 0x0000
struct FAIVisibleResult
{ 
	bool                                               IsVisible;                                                  // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	int32_t                                            BlockWeight;                                                // 0x0004   (0x0004)  
	ENPCAISenseBarrier                                 Barrier;                                                    // 0x0008   (0x0001)  
	unsigned char                                      UnknownData01_7[0x3];                                       // 0x0009   (0x0003)  MISSED
};

static_assert(sizeof(UNPCBTService_BlueprintBase) == 0x0098); // 152 bytes (0x000070 - 0x000098)
static_assert(sizeof(UNPCBTTask_BlueprintBase) == 0x00A8); // 168 bytes (0x000070 - 0x0000A8)
static_assert(sizeof(UNPCBTTask_LatenTaskBase) == 0x00B0); // 176 bytes (0x0000A8 - 0x0000B0)
static_assert(sizeof(ANPCAINavModifierVolume) == 0x0350); // 848 bytes (0x000330 - 0x000350)
static_assert(sizeof(UAIRuntimeMonitor) == 0x0080); // 128 bytes (0x000028 - 0x000080)
static_assert(sizeof(UAISceneEventMessage) == 0x0058); // 88 bytes (0x000028 - 0x000058)
static_assert(sizeof(UAISceneEventsTriggerManager) == 0x0038); // 56 bytes (0x000028 - 0x000038)
static_assert(sizeof(FAISGDoorUsed) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(UAISGDoorManager) == 0x0050); // 80 bytes (0x000028 - 0x000050)
static_assert(sizeof(UBehaviorTreeTooler) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAIActorComponent) == 0x0108); // 264 bytes (0x0000F8 - 0x000108)
static_assert(sizeof(UNPCAIAimingInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAIAreaVolumeInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAIAsyncTaskBase) == 0x0040); // 64 bytes (0x000030 - 0x000040)
static_assert(sizeof(FNPCAIAsyncTask) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(UNPCAIAsyncTaskSystem) == 0x0040); // 64 bytes (0x000030 - 0x000040)
static_assert(sizeof(UNPCAIAttentionPoint) == 0x00A0); // 160 bytes (0x000028 - 0x0000A0)
static_assert(sizeof(UNPCAIBattleVolumeInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAIBehaviorHistoryDebugInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAICharacterInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAIControllerInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAICoverEnvQueryData) == 0x01D0); // 464 bytes (0x000028 - 0x0001D0)
static_assert(sizeof(UNPCAICoverEnvQueryGenerator) == 0x0218); // 536 bytes (0x000210 - 0x000218)
static_assert(sizeof(UNPCAICoverEnvQueryTest_CanAttackTo) == 0x01F8); // 504 bytes (0x0001F8 - 0x0001F8)
static_assert(sizeof(UNPCAICoverEnvQueryTest_CanContain) == 0x01F8); // 504 bytes (0x0001F8 - 0x0001F8)
static_assert(sizeof(UNPCAICoverEnvQueryTest_CloserRatio) == 0x01F8); // 504 bytes (0x0001F8 - 0x0001F8)
static_assert(sizeof(UNPCAICoverEnvQueryTest_CoverDist) == 0x01F8); // 504 bytes (0x0001F8 - 0x0001F8)
static_assert(sizeof(UNPCAICoverEnvQueryTest_DefenceAngle) == 0x01F8); // 504 bytes (0x0001F8 - 0x0001F8)
static_assert(sizeof(UNPCAICoverEnvQueryTest_DefenceRatio) == 0x01F8); // 504 bytes (0x0001F8 - 0x0001F8)
static_assert(sizeof(UNPCAICoverEnvQueryTest_DistanceToAllyCover) == 0x01F8); // 504 bytes (0x0001F8 - 0x0001F8)
static_assert(sizeof(UNPCAICoverEnvQueryTest_DistanceToHotPoint) == 0x01F8); // 504 bytes (0x0001F8 - 0x0001F8)
static_assert(sizeof(UNPCAICoverEnvQueryTest_IsFree) == 0x01F8); // 504 bytes (0x0001F8 - 0x0001F8)
static_assert(sizeof(UNPCAICoverEnvQueryTest_IsInCone) == 0x01F8); // 504 bytes (0x0001F8 - 0x0001F8)
static_assert(sizeof(UNPCAICoverEnvQueryTest_IsNear) == 0x01F8); // 504 bytes (0x0001F8 - 0x0001F8)
static_assert(sizeof(UNPCAICoverEnvQueryTest_IsSafe) == 0x01F8); // 504 bytes (0x0001F8 - 0x0001F8)
static_assert(sizeof(UNPCAICoverEnvQueryTest_IsSameSideToTarget) == 0x01F8); // 504 bytes (0x0001F8 - 0x0001F8)
static_assert(sizeof(UNPCAICoverEnvQueryTest_PathLength) == 0x0200); // 512 bytes (0x0001F8 - 0x000200)
static_assert(sizeof(UNPCAICoverEnvQueryTest_Protection) == 0x0200); // 512 bytes (0x0001F8 - 0x000200)
static_assert(sizeof(UNPCAICoverEnvQueryTest_ShootDistance) == 0x0200); // 512 bytes (0x0001F8 - 0x000200)
static_assert(sizeof(UNPCAICoverSystemStatics) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAIDamageData) == 0x0040); // 64 bytes (0x000028 - 0x000040)
static_assert(sizeof(UNPCAIDoorInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAIDoorOpenInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAIDynamicGroupInfo) == 0x0058); // 88 bytes (0x000028 - 0x000058)
static_assert(sizeof(FAIShotCountStat) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(UNPCAITargetInfoBase) == 0x0060); // 96 bytes (0x000028 - 0x000060)
static_assert(sizeof(UNPCAIEnemyGroupSingleInfo) == 0x00A8); // 168 bytes (0x000060 - 0x0000A8)
static_assert(sizeof(UNPCAIEnvQueryGenerator_BlueprintBase) == 0x00C0); // 192 bytes (0x000080 - 0x0000C0)
static_assert(sizeof(UNPCAIEnvQueryGenerator_OnPolyCenter) == 0x02F8); // 760 bytes (0x000210 - 0x0002F8)
static_assert(sizeof(UNPCAIEnvQueryInstanceBlueprintWrapper) == 0x0080); // 128 bytes (0x000078 - 0x000080)
static_assert(sizeof(UNPCAIEnvQueryItemType_CoverPoint) == 0x0030); // 48 bytes (0x000030 - 0x000030)
static_assert(sizeof(UNPCAIEnvQueryManager) == 0x0140); // 320 bytes (0x000140 - 0x000140)
static_assert(sizeof(UNPCAIEnvQueryTest_BlueprintBase) == 0x0218); // 536 bytes (0x0001F8 - 0x000218)
static_assert(sizeof(UNPCAIEnvQueryTest_PathfindingFromQuerier) == 0x0238); // 568 bytes (0x0001F8 - 0x000238)
static_assert(sizeof(UNPCAIEnvQueryTest_PointBase) == 0x0218); // 536 bytes (0x0001F8 - 0x000218)
static_assert(sizeof(UNPCAIEQSSystemStatics) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAIFactionComponent) == 0x0120); // 288 bytes (0x000108 - 0x000120)
static_assert(sizeof(UNPCAIFactionPluginBase) == 0x0038); // 56 bytes (0x000028 - 0x000038)
static_assert(sizeof(FNPCAIProfileCover) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(UNPCAIFactionPlugin) == 0x00B0); // 176 bytes (0x000038 - 0x0000B0)
static_assert(sizeof(UNPCAIFindAmbushAgainstPointAsyncTask) == 0x0078); // 120 bytes (0x000040 - 0x000078)
static_assert(sizeof(UNPCAIFindPathByKeyRouteAsyncTask) == 0x0128); // 296 bytes (0x000040 - 0x000128)
static_assert(sizeof(UNPCAIGameStateDebugInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAIGlobalManagerInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FAIProtectTreasureBox) == 0x0060); // 96 bytes (0x000000 - 0x000060)
static_assert(sizeof(UNPCAIGlobalSharedInfo) == 0x0220); // 544 bytes (0x000028 - 0x000220)
static_assert(sizeof(UNPCAIGoalTarget) == 0x0040); // 64 bytes (0x000028 - 0x000040)
static_assert(sizeof(UNPCAIGroupBaseRequest) == 0x00A8); // 168 bytes (0x000028 - 0x0000A8)
static_assert(sizeof(UNPCAIGroupAttackCloseRequest) == 0x00A8); // 168 bytes (0x0000A8 - 0x0000A8)
static_assert(sizeof(UNPCAIGroupCustomRequest) == 0x00A8); // 168 bytes (0x0000A8 - 0x0000A8)
static_assert(sizeof(UNPCAIGroupDoorOpenRequest) == 0x00B0); // 176 bytes (0x0000A8 - 0x0000B0)
static_assert(sizeof(UNPCAIGroupFollowMeRequest) == 0x00B0); // 176 bytes (0x0000A8 - 0x0000B0)
static_assert(sizeof(UNPCAIGroupGoToPointRequest) == 0x00B8); // 184 bytes (0x0000A8 - 0x0000B8)
static_assert(sizeof(UNPCAIGroupHideRequest) == 0x00A8); // 168 bytes (0x0000A8 - 0x0000A8)
static_assert(sizeof(UNPCAIGroupHoldRequest) == 0x00B8); // 184 bytes (0x0000A8 - 0x0000B8)
static_assert(sizeof(UNPCAISubSystemComponent) == 0x0108); // 264 bytes (0x0000F8 - 0x000108)
static_assert(sizeof(UNPCAIGroupRequestComponent) == 0x0168); // 360 bytes (0x000108 - 0x000168)
static_assert(sizeof(UNPCAIGroupRequestController) == 0x0040); // 64 bytes (0x000028 - 0x000040)
static_assert(sizeof(UNPCAIGroupSusspressionFireRequest) == 0x00C8); // 200 bytes (0x0000A8 - 0x0000C8)
static_assert(sizeof(UNPCAIGroupThrowGrenadeRequest) == 0x00C0); // 192 bytes (0x0000A8 - 0x0000C0)
static_assert(sizeof(UNPCAIGroupWarnPlayerRequest) == 0x00D0); // 208 bytes (0x0000A8 - 0x0000D0)
static_assert(sizeof(FMetisOptions) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(FHNavSettings) == 0x003C); // 60 bytes (0x000000 - 0x00003C)
static_assert(sizeof(FPortalEdge) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(sizeof(FIntraPath) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(FHNavGraph) == 0x0150); // 336 bytes (0x000000 - 0x000150)
static_assert(sizeof(FHNavSearchInfo) == 0x0060); // 96 bytes (0x000000 - 0x000060)
static_assert(sizeof(ANPCAIHNavActor) == 0x0470); // 1136 bytes (0x0002E0 - 0x000470)
static_assert(sizeof(ANPCAILaunchPad) == 0x0318); // 792 bytes (0x0002E0 - 0x000318)
static_assert(sizeof(FAIBackUpCoverPointFinder) == 0x001C); // 28 bytes (0x000000 - 0x00001C)
static_assert(sizeof(FAIStackGunRecord) == 0x0044); // 68 bytes (0x000000 - 0x000044)
static_assert(sizeof(FAIRoundPathFindingNodes) == 0x0080); // 128 bytes (0x000000 - 0x000080)
static_assert(sizeof(FNPCAIQueryRoundEnvironmentResult) == 0x005C); // 92 bytes (0x000000 - 0x00005C)
static_assert(sizeof(UNPCAIMemorySystemComponent) == 0x0310); // 784 bytes (0x000108 - 0x000310)
static_assert(sizeof(UNPCAIPropertyProfileBase) == 0x0038); // 56 bytes (0x000028 - 0x000038)
static_assert(sizeof(UNPCAIModifierProfile) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAIModifierAITypeProfile) == 0x0040); // 64 bytes (0x000038 - 0x000040)
static_assert(sizeof(UNPCAIProfileBaseComponent) == 0x0038); // 56 bytes (0x000028 - 0x000038)
static_assert(sizeof(UNPCAIModifierComponent) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UNPCAIModifierComponent_AIType) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(FAIArmorAttributeModifier) == 0x0014); // 20 bytes (0x000000 - 0x000014)
static_assert(sizeof(UAIModifierArmorProfile) == 0x0060); // 96 bytes (0x000038 - 0x000060)
static_assert(sizeof(UNPCAIModifierComponent_Armor) == 0x0040); // 64 bytes (0x000038 - 0x000040)
static_assert(sizeof(UAIModifierDamageProfile) == 0x0040); // 64 bytes (0x000038 - 0x000040)
static_assert(sizeof(UNPCAIModifierComponent_Damage) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(FAILocationMonitor) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(UNPCAIMoverSystemComponent) == 0x02E0); // 736 bytes (0x000108 - 0x0002E0)
static_assert(sizeof(UNPCAIMultiTargetSystemComponent) == 0x01A0); // 416 bytes (0x000108 - 0x0001A0)
static_assert(sizeof(UNPCAIMultiTargetSelectorComponent) == 0x02A8); // 680 bytes (0x0001A0 - 0x0002A8)
static_assert(sizeof(UNPCAINavSubsystemBase) == 0x0030); // 48 bytes (0x000030 - 0x000030)
static_assert(sizeof(UNPCAINavConnectivitySystem) == 0x0030); // 48 bytes (0x000030 - 0x000030)
static_assert(sizeof(UNPCAINavDebugSystem) == 0x0030); // 48 bytes (0x000030 - 0x000030)
static_assert(sizeof(UNPCAINavExperimentSystem) == 0x0030); // 48 bytes (0x000030 - 0x000030)
static_assert(sizeof(UNPCAINavigationStatics) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAINavigationSystem) == 0x15F8); // 5624 bytes (0x0015F8 - 0x0015F8)
static_assert(sizeof(UNPCAINavigationSystemConfig) == 0x0058); // 88 bytes (0x000058 - 0x000058)
static_assert(sizeof(FNavSkeletonBuildSettings) == 0x008C); // 140 bytes (0x000000 - 0x00008C)
static_assert(sizeof(FNavSkeletonPoint) == 0x00A0); // 160 bytes (0x000010 - 0x0000A0)
static_assert(sizeof(FNavSkeletonData) == 0x0060); // 96 bytes (0x000000 - 0x000060)
static_assert(sizeof(ANPCAINavMeshManager) == 0x0590); // 1424 bytes (0x0002E0 - 0x000590)
static_assert(sizeof(UNPCAITestingRenderingComponent) == 0x05E0); // 1504 bytes (0x0005D8 - 0x0005E0)
static_assert(sizeof(UNPCAINavMeshRenderingComponent) == 0x05E0); // 1504 bytes (0x0005E0 - 0x0005E0)
static_assert(sizeof(ANPCAITestingActor) == 0x0318); // 792 bytes (0x0002E0 - 0x000318)
static_assert(sizeof(ANPCAINavMeshTestingActor) == 0x06E0); // 1760 bytes (0x000318 - 0x0006E0)
static_assert(sizeof(UNPCAINavRuntimeSystem) == 0x0398); // 920 bytes (0x000030 - 0x000398)
static_assert(sizeof(UNPCAINavSkeletonSystem) == 0x00D8); // 216 bytes (0x000030 - 0x0000D8)
static_assert(sizeof(UNPCAINavSteepZoneSystem) == 0x0030); // 48 bytes (0x000030 - 0x000030)
static_assert(sizeof(UNavArea_Burning) == 0x0048); // 72 bytes (0x000048 - 0x000048)
static_assert(sizeof(UNavArea_TearGas) == 0x0048); // 72 bytes (0x000048 - 0x000048)
static_assert(sizeof(UNavArea_TripMine) == 0x0048); // 72 bytes (0x000048 - 0x000048)
static_assert(sizeof(UNavArea_Claymore) == 0x0048); // 72 bytes (0x000048 - 0x000048)
static_assert(sizeof(UNavArea_Paradrop) == 0x0048); // 72 bytes (0x000048 - 0x000048)
static_assert(sizeof(UNavArea_Avoid) == 0x0048); // 72 bytes (0x000048 - 0x000048)
static_assert(sizeof(UNavArea_Color0) == 0x0048); // 72 bytes (0x000048 - 0x000048)
static_assert(sizeof(UNavArea_Color1) == 0x0048); // 72 bytes (0x000048 - 0x000048)
static_assert(sizeof(UNavArea_Color2) == 0x0048); // 72 bytes (0x000048 - 0x000048)
static_assert(sizeof(UNavArea_Color3) == 0x0048); // 72 bytes (0x000048 - 0x000048)
static_assert(sizeof(UNavArea_Color4) == 0x0048); // 72 bytes (0x000048 - 0x000048)
static_assert(sizeof(UNavArea_Color5) == 0x0048); // 72 bytes (0x000048 - 0x000048)
static_assert(sizeof(UNavArea_Color6) == 0x0048); // 72 bytes (0x000048 - 0x000048)
static_assert(sizeof(ANavPathPointActor) == 0x0310); // 784 bytes (0x0002E0 - 0x000310)
static_assert(sizeof(UNPCAINavUtilitySystem) == 0x0040); // 64 bytes (0x000030 - 0x000040)
static_assert(sizeof(UNPCAIPathFollowingComponent) == 0x02B0); // 688 bytes (0x000298 - 0x0002B0)
static_assert(sizeof(UNPCAIPeekPointAsyncTask) == 0x0090); // 144 bytes (0x000040 - 0x000090)
static_assert(sizeof(FAIGrassMapInfo) == 0x0088); // 136 bytes (0x000000 - 0x000088)
static_assert(sizeof(FAIFoliageGrassBlock) == 0x003C); // 60 bytes (0x000000 - 0x00003C)
static_assert(sizeof(FAILandscapeGrassBlock) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(FAIGrassBox) == 0x001C); // 28 bytes (0x000000 - 0x00001C)
static_assert(sizeof(FAIGrassCylinder) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(FAIGrassBlock) == 0x0078); // 120 bytes (0x000028 - 0x000078)
static_assert(sizeof(ANPCAIPerceptionAssistActor) == 0x03B8); // 952 bytes (0x0002E0 - 0x0003B8)
static_assert(sizeof(FAIGrassOctreeElement) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(sizeof(UNPCAIPerceptionComponent) == 0x02D0); // 720 bytes (0x0001D8 - 0x0002D0)
static_assert(sizeof(FAIBlockArea) == 0x0060); // 96 bytes (0x000000 - 0x000060)
static_assert(sizeof(FAISenseFlashBlock) == 0x0044); // 68 bytes (0x000000 - 0x000044)
static_assert(sizeof(ANPCAIPerceptionDynamicActor) == 0x0310); // 784 bytes (0x0002E0 - 0x000310)
static_assert(sizeof(UNPCAIPerceptionSystem) == 0x0130); // 304 bytes (0x000130 - 0x000130)
static_assert(sizeof(UNPCAIProfile) == 0x0038); // 56 bytes (0x000028 - 0x000038)
static_assert(sizeof(UNPCAIPropertyProfile) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UNPCAIPropertyComponent) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(FAIBodyPartAimingChoice) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(sizeof(FAIBodyBulkAimingChoice) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(UAIPropertyAimingProfile) == 0x0180); // 384 bytes (0x000038 - 0x000180)
static_assert(sizeof(UNPCAIPropertyComponent_Aiming) == 0x0048); // 72 bytes (0x000038 - 0x000048)
static_assert(sizeof(UAIPropertyAITypeProfile) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UNPCAIPropertyComponent_AIType) == 0x0040); // 64 bytes (0x000038 - 0x000040)
static_assert(sizeof(UAIPropertyBlockProfile) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UNPCAIPropertyComponent_Block) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAIPropertyBossProfile) == 0x0050); // 80 bytes (0x000038 - 0x000050)
static_assert(sizeof(UNPCAIPropertyComponent_Boss) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAIPropertyCoreProfile) == 0x0040); // 64 bytes (0x000038 - 0x000040)
static_assert(sizeof(UNPCAIPropertyComponent_Core) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAIPropertyCurveProfile) == 0x0048); // 72 bytes (0x000038 - 0x000048)
static_assert(sizeof(UNPCAIPropertyComponent_Curve) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAIPropertyDamageProfile) == 0x0070); // 112 bytes (0x000038 - 0x000070)
static_assert(sizeof(UNPCAIPropertyComponent_Damage) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAIPropertyGlobalProfile) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UNPCAIPropertyComponent_Global) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAIPropertyGrenadeProfile) == 0x00A0); // 160 bytes (0x000038 - 0x0000A0)
static_assert(sizeof(UNPCAIPropertyComponent_Grenade) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAIPropertyHealthProfile) == 0x0060); // 96 bytes (0x000038 - 0x000060)
static_assert(sizeof(UNPCAIPropertyComponent_Health) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAIPropertyHearingProfile) == 0x00A8); // 168 bytes (0x000038 - 0x0000A8)
static_assert(sizeof(UNPCAIPropertyComponent_Hearing) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAIPropertyLayProfile) == 0x0050); // 80 bytes (0x000038 - 0x000050)
static_assert(sizeof(UNPCAIPropertyComponent_Lay) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(FAISenseSightNormal) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(UAIPropertyLookProfile) == 0x0148); // 328 bytes (0x000038 - 0x000148)
static_assert(sizeof(UNPCAIPropertyComponent_Look) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(FAIMindGoalEnemyAngleMultiple) == 0x000C); // 12 bytes (0x000000 - 0x00000C)
static_assert(sizeof(UAIPropertyMindProfile) == 0x0088); // 136 bytes (0x000038 - 0x000088)
static_assert(sizeof(UNPCAIPropertyComponent_Mind) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAIPropertyMoveProfile) == 0x0080); // 128 bytes (0x000038 - 0x000080)
static_assert(sizeof(UNPCAIPropertyComponent_Move) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAIPropertyPlayerActionReactionProfile) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UNPCAIPropertyComponent_PlayerActionReaction) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAIPropertyRequestRunProfile) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UNPCAIPropertyComponent_RequestRun) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAIPropertyShootProfile) == 0x00E8); // 232 bytes (0x000038 - 0x0000E8)
static_assert(sizeof(UNPCAIPropertyComponent_Shoot) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAIPropertySmartProfile) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UNPCAIPropertyComponent_Smart) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAIPropertySoundProfile) == 0x0050); // 80 bytes (0x000038 - 0x000050)
static_assert(sizeof(UNPCAIPropertyComponent_Sound) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAIPropertyStrategyProfile) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UNPCAIPropertyComponent_Strategy) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAIPropertyTacticProfile) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UNPCAIPropertyComponent_Tactic) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAIPropertyWeaponProfile) == 0x00A8); // 168 bytes (0x000038 - 0x0000A8)
static_assert(sizeof(UNPCAIPropertyComponent_Weapon) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UNPCAIQueryRoundEnvironmentAsyncTask) == 0x0078); // 120 bytes (0x000040 - 0x000078)
static_assert(sizeof(ANPCAIRecastNavMesh) == 0x05A8); // 1448 bytes (0x000598 - 0x0005A8)
static_assert(sizeof(UNPCAIRecoilInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAIRLAgentComponentInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAIRoleComponent) == 0x0118); // 280 bytes (0x000108 - 0x000118)
static_assert(sizeof(UNPCAIRoleModifierComponent) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FNPCAIComingExplosionEvent) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(sizeof(UNPCAISense_ComingExplosion) == 0x00E8); // 232 bytes (0x000080 - 0x0000E8)
static_assert(sizeof(FNPCAIDamageEvent) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UNPCAISense_Damage) == 0x0090); // 144 bytes (0x000080 - 0x000090)
static_assert(sizeof(UNPCAISense_Hearing) == 0x0140); // 320 bytes (0x0000E8 - 0x000140)
static_assert(sizeof(UNPCAISense_Sight) == 0x0198); // 408 bytes (0x000170 - 0x000198)
static_assert(sizeof(UNPCAISenseConfig_ComingExplosion) == 0x0058); // 88 bytes (0x000048 - 0x000058)
static_assert(sizeof(UNPCAISenseConfig_Damage) == 0x0050); // 80 bytes (0x000048 - 0x000050)
static_assert(sizeof(UNPCAISenseConfig_Hearing) == 0x0068); // 104 bytes (0x000060 - 0x000068)
static_assert(sizeof(UNPCAISenseConfig_Sight) == 0x0078); // 120 bytes (0x000070 - 0x000078)
static_assert(sizeof(UNPCAISenseEvent_ComingExplosion) == 0x0058); // 88 bytes (0x000028 - 0x000058)
static_assert(sizeof(UNPCAISenseEvent_Damage) == 0x0060); // 96 bytes (0x000028 - 0x000060)
static_assert(sizeof(UNPCAISenseSourceInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FAimingSettings) == 0x00D0); // 208 bytes (0x000000 - 0x0000D0)
static_assert(sizeof(FBossSettings) == 0x0118); // 280 bytes (0x000000 - 0x000118)
static_assert(sizeof(FChangeSettings) == 0x003C); // 60 bytes (0x000000 - 0x00003C)
static_assert(sizeof(FCoreSettings) == 0x002C); // 44 bytes (0x000000 - 0x00002C)
static_assert(sizeof(FCoverSettings) == 0x00C8); // 200 bytes (0x000000 - 0x0000C8)
static_assert(sizeof(FGlobalSettings) == 0x01D4); // 468 bytes (0x000000 - 0x0001D4)
static_assert(sizeof(FGrenadeSettings) == 0x00AC); // 172 bytes (0x000000 - 0x0000AC)
static_assert(sizeof(FHearingSettings) == 0x006C); // 108 bytes (0x000000 - 0x00006C)
static_assert(sizeof(FLaySettings) == 0x004C); // 76 bytes (0x000000 - 0x00004C)
static_assert(sizeof(FLookSettings) == 0x00E0); // 224 bytes (0x000000 - 0x0000E0)
static_assert(sizeof(FMindSettings) == 0x00F8); // 248 bytes (0x000000 - 0x0000F8)
static_assert(sizeof(FMoveSettings) == 0x0058); // 88 bytes (0x000000 - 0x000058)
static_assert(sizeof(FPatrolSettings) == 0x0074); // 116 bytes (0x000000 - 0x000074)
static_assert(sizeof(FScatteringSettings) == 0x0078); // 120 bytes (0x000000 - 0x000078)
static_assert(sizeof(FShootSettings) == 0x0094); // 148 bytes (0x000000 - 0x000094)
static_assert(sizeof(FCurrentSettings) == 0x0004); // 4 bytes (0x000000 - 0x000004)
static_assert(sizeof(FCurveSettings) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FNPCAIWeaponConfigTableRow) == 0x0070); // 112 bytes (0x000008 - 0x000070)
static_assert(sizeof(UNPCAISettingsComponent) == 0x0B80); // 2944 bytes (0x0000F8 - 0x000B80)
static_assert(sizeof(UNPCAIStatics) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAIStaticsInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAISteepZoneRenderingComponent) == 0x05E0); // 1504 bytes (0x0005E0 - 0x0005E0)
static_assert(sizeof(FSteepZoneDeleteSettings) == 0x0034); // 52 bytes (0x000000 - 0x000034)
static_assert(sizeof(FNPCAISteepZoneDeleter) == 0x0180); // 384 bytes (0x000000 - 0x000180)
static_assert(sizeof(ANPCAISteepZoneTestingActor) == 0x04F0); // 1264 bytes (0x000318 - 0x0004F0)
static_assert(sizeof(UNPCAISteeringInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAISubSystemStatics) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAISystem) == 0x0150); // 336 bytes (0x000148 - 0x000150)
static_assert(sizeof(UNPCAITacticSystemComponent) == 0x0120); // 288 bytes (0x000108 - 0x000120)
static_assert(sizeof(UNPCAITargetInfo) == 0x0338); // 824 bytes (0x000060 - 0x000338)
static_assert(sizeof(FAIGroupAllyDeathInfo) == 0x001C); // 28 bytes (0x000000 - 0x00001C)
static_assert(sizeof(UNPCAITeam) == 0x00C0); // 192 bytes (0x000028 - 0x0000C0)
static_assert(sizeof(UNPCAITeamInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAIThrowSystem) == 0x0038); // 56 bytes (0x000030 - 0x000038)
static_assert(sizeof(FAITrackLOG) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(UAITrackLOGUnit) == 0x0050); // 80 bytes (0x000028 - 0x000050)
static_assert(sizeof(UNPCAITrackLogger) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UAIPortraitBase) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UAIPortraitDefault) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAIUALootSubAreaVolumeInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAIVolumeInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCAIZoneGroupInfo) == 0x00E8); // 232 bytes (0x0000C0 - 0x0000E8)
static_assert(sizeof(UNPCBehaviorLOD) == 0x0058); // 88 bytes (0x000028 - 0x000058)
static_assert(sizeof(UNPCBehaviorLODAction) == 0x0040); // 64 bytes (0x000028 - 0x000040)
static_assert(sizeof(UNPCBehaviorLODActionTick) == 0x0040); // 64 bytes (0x000028 - 0x000040)
static_assert(sizeof(FComponentInfo) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(UNPCBehaviorLODSystemComponent) == 0x0178); // 376 bytes (0x000108 - 0x000178)
static_assert(sizeof(UNPCBTDecorator) == 0x0090); // 144 bytes (0x000068 - 0x000090)
static_assert(sizeof(UNPCBTDecorator_AIPropertyComparison) == 0x00C8); // 200 bytes (0x000090 - 0x0000C8)
static_assert(sizeof(UNPCBTDecorator_BBConditionBase) == 0x00E8); // 232 bytes (0x000090 - 0x0000E8)
static_assert(sizeof(UNPCBTDecorator_BBConditionBool) == 0x00C0); // 192 bytes (0x000090 - 0x0000C0)
static_assert(sizeof(UNPCBTDecorator_BBConditionFloat) == 0x00E8); // 232 bytes (0x000090 - 0x0000E8)
static_assert(sizeof(UNPCBTDecorator_BBConditionInt) == 0x00F0); // 240 bytes (0x0000E8 - 0x0000F0)
static_assert(sizeof(UNPCBTDecorator_BBConditionObject) == 0x00C0); // 192 bytes (0x0000C0 - 0x0000C0)
static_assert(sizeof(UNPCBTDecorator_BBConditionString) == 0x0100); // 256 bytes (0x0000E8 - 0x000100)
static_assert(sizeof(UNPCBTDecorator_BlueprintBase) == 0x00A0); // 160 bytes (0x000068 - 0x0000A0)
static_assert(sizeof(UNPCBTDecorator_HasSuspectPoints) == 0x00A8); // 168 bytes (0x000090 - 0x0000A8)
static_assert(sizeof(UNPCBTDecorator_IsCloseEnough) == 0x0098); // 152 bytes (0x000090 - 0x000098)
static_assert(sizeof(UNPCBTDecorator_ShouldWaitAtPathNode) == 0x0090); // 144 bytes (0x000090 - 0x000090)
static_assert(sizeof(UNPCBTDecorator_SingletonBlueprintBase) == 0x0098); // 152 bytes (0x000068 - 0x000098)
static_assert(sizeof(UNPCBTDecorator_TickIntervalBase) == 0x00A8); // 168 bytes (0x0000A0 - 0x0000A8)
static_assert(sizeof(UNPCBTDecorator_Wait) == 0x0078); // 120 bytes (0x000070 - 0x000078)
static_assert(sizeof(UNPCBTService) == 0x0098); // 152 bytes (0x000070 - 0x000098)
static_assert(sizeof(UNPCBTService_FindRandomPosition) == 0x00F0); // 240 bytes (0x000098 - 0x0000F0)
static_assert(sizeof(UNPCBTService_SetSenseRangeScale) == 0x00A8); // 168 bytes (0x000098 - 0x0000A8)
static_assert(sizeof(UNPCBTService_SetVisionHalfAngle) == 0x00A0); // 160 bytes (0x000098 - 0x0000A0)
static_assert(sizeof(UNPCBTService_SingletonBlueprintBase) == 0x0090); // 144 bytes (0x000070 - 0x000090)
static_assert(sizeof(UNPCBTTask_AimAndFireEnemy) == 0x0158); // 344 bytes (0x0000B0 - 0x000158)
static_assert(sizeof(UNPCBTTaskNode) == 0x0098); // 152 bytes (0x000070 - 0x000098)
static_assert(sizeof(UNPCBTTask_AttackEnemy) == 0x0098); // 152 bytes (0x000098 - 0x000098)
static_assert(sizeof(UNPCBTTask_CalcNextAttackPosition) == 0x00B8); // 184 bytes (0x000098 - 0x0000B8)
static_assert(sizeof(UNPCBTTask_CalcNextWanderPathNode) == 0x0098); // 152 bytes (0x000098 - 0x000098)
static_assert(sizeof(UNPCBTTask_ClearFocalPoint) == 0x0098); // 152 bytes (0x000098 - 0x000098)
static_assert(sizeof(UNPCBTTask_DBNORescue) == 0x00D0); // 208 bytes (0x0000A8 - 0x0000D0)
static_assert(sizeof(UNPCBTTask_Decision) == 0x00A8); // 168 bytes (0x0000A8 - 0x0000A8)
static_assert(sizeof(UNPCBTTask_FireEnemy) == 0x0178); // 376 bytes (0x0000B0 - 0x000178)
static_assert(sizeof(UNPCBTTask_FireEnemyEx) == 0x00E8); // 232 bytes (0x0000B0 - 0x0000E8)
static_assert(sizeof(UNPCBTTask_FollowPathNode) == 0x00E8); // 232 bytes (0x000098 - 0x0000E8)
static_assert(sizeof(UNPCBTTask_MeleeAttackEnemy) == 0x00F8); // 248 bytes (0x0000B0 - 0x0000F8)
static_assert(sizeof(UNPCBTTask_MoveToEx) == 0x00E0); // 224 bytes (0x0000B0 - 0x0000E0)
static_assert(sizeof(UNPCBTTask_PlayAkSound) == 0x00A8); // 168 bytes (0x000098 - 0x0000A8)
static_assert(sizeof(UNPCBTTask_ResetTargetLocation) == 0x0098); // 152 bytes (0x000098 - 0x000098)
static_assert(sizeof(UNPCBTTask_SetAIPose) == 0x00A0); // 160 bytes (0x000098 - 0x0000A0)
static_assert(sizeof(UNPCBTTask_SetBlackboardValue) == 0x00E8); // 232 bytes (0x000098 - 0x0000E8)
static_assert(sizeof(UNPCBTTask_SetFocalPoint) == 0x00C0); // 192 bytes (0x000098 - 0x0000C0)
static_assert(sizeof(UNPCBTTask_SetMovementSpeed) == 0x00A8); // 168 bytes (0x000098 - 0x0000A8)
static_assert(sizeof(UNPCBTTask_SetSenseRangeScale) == 0x00A8); // 168 bytes (0x000098 - 0x0000A8)
static_assert(sizeof(UNPCBTTask_SetTargetHatred) == 0x00E0); // 224 bytes (0x0000A8 - 0x0000E0)
static_assert(sizeof(UNPCBTTask_SetVisionHalfAngle) == 0x00A0); // 160 bytes (0x000098 - 0x0000A0)
static_assert(sizeof(UNPCBTTask_StartShoulderAimingTarget) == 0x00B0); // 176 bytes (0x0000B0 - 0x0000B0)
static_assert(sizeof(UNPCBTTask_StopShoulderAimingTarget) == 0x00B0); // 176 bytes (0x0000B0 - 0x0000B0)
static_assert(sizeof(UNPCCharacterAIDBNOInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCCharacterAIDeathInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCCharacterAIDebugInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCCharacterAIExplodeInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCCharacterAIFireInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCCharacterAIIKInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCCharacterAIInventoryInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCCharacterAIMoveInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCCharacterAIPathNodeInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCCharacterAIPerceptionInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCCharacterAIPickUpInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCCharacterAIPoseCacheInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCCharacterAIPoseInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCCharacterAISenseAbilityInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCCharacterAISoundInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCCharacterAITakeCoverInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCCharacterAITeamRescueInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCCharacterAITurnInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCCharacterHealthInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UNPCCharacterTakeDamageInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(ANPCGrassIdentificationVolume) == 0x0318); // 792 bytes (0x000318 - 0x000318)
static_assert(sizeof(USGActorFactionCompInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(USGFactionInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(USGTeamInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FNavSkeletonGraphResultNode) == 0x000C); // 12 bytes (0x000000 - 0x00000C)
static_assert(sizeof(FNavSkeletonGraphFindResult) == 0x0038); // 56 bytes (0x000000 - 0x000038)
static_assert(sizeof(FNPCAIFindAmbushAgainstPointResult) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FNPCAIFindPathByKeyRouteResult) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FNPCAIPeekPointResult) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FAIRuntimeMonitorStatInfo) == 0x002C); // 44 bytes (0x000000 - 0x00002C)
static_assert(sizeof(FNPCAIActivityAIIDModifierTableRow) == 0x0040); // 64 bytes (0x000008 - 0x000040)
static_assert(sizeof(FAIDataProviderFVectorValue) == 0x0040); // 64 bytes (0x000030 - 0x000040)
static_assert(sizeof(FAIDoorSingleSafetyPoint) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FAISafetyOpenDoorResp) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(FNPCAIProfileCoverTag) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FAIEnemyInfo) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(FAIGlobalCacheActors) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FGraphAStarPolicy) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FNPCAIIDModifierTableRow) == 0x0010); // 16 bytes (0x000008 - 0x000010)
static_assert(sizeof(FNPCAINavSkeletonBuildStage) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonAddRegionConnectionStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonBuilder) == 0x0480); // 1152 bytes (0x000000 - 0x000480)
static_assert(sizeof(FNPCAINavSkeletonCalculateCoverageStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonCalculateDivergenceStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonCalculateGradientStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonCalculateSymmetricAttributeStage) == 0x0028); // 40 bytes (0x000020 - 0x000028)
static_assert(sizeof(FNPCAINavSkeletonCalculateMovingStage) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FNPCAINavSkeletonCalculateOutdoorsStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonCalculateProtectionStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonCalculateThrowingStage) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FNPCAINavSkeletonCalculateVisibilityStage) == 0x00A8); // 168 bytes (0x000028 - 0x0000A8)
static_assert(sizeof(FNPCAINavSkeletonCalculateWallDistanceStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonCheckEdgeOnNavMeshStage) == 0x0028); // 40 bytes (0x000020 - 0x000028)
static_assert(sizeof(FNPCAINavSkeletonCollectConnectionInfoStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonCollectNeighbourInfoStage) == 0x0028); // 40 bytes (0x000020 - 0x000028)
static_assert(sizeof(FNPCAINavSkeletonFindPathForUnstableSegmentStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonFindWallsInNeighbourhoodStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonGeneratePolylineStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonGenerateRawPointStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNavSkeletonPathFindingQueue) == 0x0088); // 136 bytes (0x000000 - 0x000088)
static_assert(sizeof(FNavSkeletonPathFindingRequest) == 0x0198); // 408 bytes (0x000000 - 0x000198)
static_assert(sizeof(FNavSkeletonGraphAStarFilter) == 0x00C0); // 192 bytes (0x000000 - 0x0000C0)
static_assert(sizeof(FNPCAINavSkeletonInitializePointExtraAttributeStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonLabelNavMeshStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonPrunePointStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonRemoveIsolatedPointStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonRemoveTriangleConnectionStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonSavePointStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonSetupPointBattleIntensityExpectation) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonSetupPointBattleVolumeStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonSetupPointKindStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNPCAINavSkeletonSimplifyPolylineStage) == 0x0020); // 32 bytes (0x000020 - 0x000020)
static_assert(sizeof(FNavSkeletonMoveSettings) == 0x0001); // 1 bytes (0x000000 - 0x000001)
static_assert(sizeof(FNavSkeletonPathPoint) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(FNavSkeletonPatchedPath) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FNavSkeletonPolyline) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FNavSkeletonSamplePoint) == 0x0058); // 88 bytes (0x000000 - 0x000058)
static_assert(sizeof(FNavSkeletonSamplePolyline) == 0x0040); // 64 bytes (0x000000 - 0x000040)
static_assert(sizeof(FNavCostModifierSharedPointer) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FNavCostModifier) == 0x0040); // 64 bytes (0x000000 - 0x000040)
static_assert(sizeof(FNavCostDescriptor) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FNavPolyRefArray) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FNavConnectivityInfo) == 0x0058); // 88 bytes (0x000000 - 0x000058)
static_assert(sizeof(FSoAStorage) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FPortalEdgeStorage) == 0x0020); // 32 bytes (0x000010 - 0x000020)
static_assert(sizeof(FUInt64Storage) == 0x0020); // 32 bytes (0x000010 - 0x000020)
static_assert(sizeof(FInt32Storage) == 0x0020); // 32 bytes (0x000010 - 0x000020)
static_assert(sizeof(FNavLinkInfo) == 0x001C); // 28 bytes (0x000000 - 0x00001C)
static_assert(sizeof(FCoverPointPathLengthResult) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(sizeof(FAICandidateStandPosition) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FAIGrassOctreeData) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FAINearGrassBounds) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(FAIGrassClusterInfo) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(sizeof(FAIGrassGrayBMP) == 0x0050); // 80 bytes (0x000000 - 0x000050)
static_assert(sizeof(FAIGrassEditorBlock) == 0x0080); // 128 bytes (0x000078 - 0x000080)
static_assert(sizeof(FNPCAIPortraitToIDTableRow) == 0x0038); // 56 bytes (0x000008 - 0x000038)
static_assert(sizeof(FNPCAISceneEventInfo) == 0x0040); // 64 bytes (0x000000 - 0x000040)
static_assert(sizeof(FNPCAISceneEventTableRow) == 0x0048); // 72 bytes (0x000008 - 0x000048)
static_assert(sizeof(FNPCAINoiseEvent) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(FNPCAISteepZoneDeleteStage) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FNPCAISteepZoneCalculatePointNormalStage) == 0x0010); // 16 bytes (0x000010 - 0x000010)
static_assert(sizeof(FNPCAISteepZoneCalculatePointSteepDensityStage) == 0x0010); // 16 bytes (0x000010 - 0x000010)
static_assert(sizeof(FNPCAISteepZoneCalculatePolyNormalStage) == 0x0010); // 16 bytes (0x000010 - 0x000010)
static_assert(sizeof(FNPCAISteepZoneCollectNavMeshPolyStage) == 0x0010); // 16 bytes (0x000010 - 0x000010)
static_assert(sizeof(FNPCAISteepZoneGenerateSamplePointStage) == 0x0010); // 16 bytes (0x000010 - 0x000010)
static_assert(sizeof(FNPCAISteepZoneModifyTileCacheStage) == 0x0010); // 16 bytes (0x000010 - 0x000010)
static_assert(sizeof(FNPCAISteepZoneRebuildNavMeshStage) == 0x0010); // 16 bytes (0x000010 - 0x000010)
static_assert(sizeof(FSteepZoneSamplePoint) == 0x0050); // 80 bytes (0x000000 - 0x000050)
static_assert(sizeof(FSteepZoneNavMeshPoly) == 0x0048); // 72 bytes (0x000000 - 0x000048)
static_assert(sizeof(FSteepZoneDetailTriangle) == 0x0070); // 112 bytes (0x000000 - 0x000070)
static_assert(sizeof(FAITrackLOGTemplateForDataTable) == 0x0020); // 32 bytes (0x000008 - 0x000020)
static_assert(sizeof(FAILocationRecord) == 0x0014); // 20 bytes (0x000000 - 0x000014)
static_assert(sizeof(FAIDebugLineStruct) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(FAIDebugDrawSphereInfo) == 0x0024); // 36 bytes (0x000000 - 0x000024)
static_assert(sizeof(FAIDebugDrawLineInfo) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(sizeof(FPMCAISpawnInfo_ForSearchPath) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FCheckCoverPointFinder) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(FAICoverPointInfo) == 0x0048); // 72 bytes (0x000000 - 0x000048)
static_assert(sizeof(FAICharacterConfig) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(sizeof(FAIIDSegInfoData) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FAIIDSegInfo) == 0x0040); // 64 bytes (0x000000 - 0x000040)
static_assert(sizeof(FNPCAIRollDecisionStruct) == 0x0018); // 24 bytes (0x000008 - 0x000018)
static_assert(sizeof(FNPCAIMoveRequest) == 0x0048); // 72 bytes (0x000040 - 0x000048)
static_assert(sizeof(FNPCAIFireSetting) == 0x0040); // 64 bytes (0x000000 - 0x000040)
static_assert(sizeof(FNPCAIFireOrder) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FAIBodyPartVisibilityInfo) == 0x0014); // 20 bytes (0x000000 - 0x000014)
static_assert(sizeof(FAIBodyPartHitInfo) == 0x0014); // 20 bytes (0x000000 - 0x000014)
static_assert(sizeof(FAINoiseMakerInfo) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FAIVisibleResult) == 0x000C); // 12 bytes (0x000000 - 0x00000C)
static_assert(offsetof(UNPCBTService_BlueprintBase, AIOwner) == 0x0078);
static_assert(offsetof(UNPCBTTask_BlueprintBase, AIOwner) == 0x0078);
static_assert(offsetof(UNPCBTTask_BlueprintBase, TickInterval) == 0x0080);
static_assert(offsetof(ANPCAINavModifierVolume, AffectedPolygons) == 0x0330);
static_assert(offsetof(ANPCAINavModifierVolume, AffectedNavLinks) == 0x0340);
static_assert(offsetof(UAISceneEventMessage, Tags) == 0x0030);
static_assert(offsetof(UAISceneEventMessage, TriggerLocation) == 0x004C);
static_assert(offsetof(UAISceneEventsTriggerManager, SceneEventsList) == 0x0028);
static_assert(offsetof(FAISGDoorUsed, SGDoor) == 0x0000);
static_assert(offsetof(FAISGDoorUsed, AIPawn) == 0x0008);
static_assert(offsetof(UAISGDoorManager, AISGDoorUsedList) == 0x0028);
static_assert(offsetof(UNPCAIActorComponent, PropertyComponents) == 0x00F8);
static_assert(offsetof(UNPCAIAsyncTaskBase, AIPawn) == 0x0038);
static_assert(offsetof(FNPCAIAsyncTask, AIPawn) == 0x0000);
static_assert(offsetof(FNPCAIAsyncTask, Type) == 0x0008);
static_assert(offsetof(FNPCAIAsyncTask, AsyncTask) == 0x0010);
static_assert(offsetof(UNPCAIAsyncTaskSystem, AsyncTasks) == 0x0030);
static_assert(offsetof(UNPCAIAttentionPoint, Creator) == 0x0030);
static_assert(offsetof(UNPCAIAttentionPoint, FootSounderSpawnCharacter) == 0x0040);
static_assert(offsetof(UNPCAIAttentionPoint, CheckingPlayer) == 0x0048);
static_assert(offsetof(UNPCAIAttentionPoint, PointType) == 0x0051);
static_assert(offsetof(UNPCAICoverEnvQueryData, Generator_Location) == 0x00D0);
static_assert(offsetof(UNPCAICoverEnvQueryData, Generator_BotZoneVolume) == 0x00E0);
static_assert(offsetof(UNPCAICoverEnvQueryData, IsNear_Location) == 0x00F0);
static_assert(offsetof(UNPCAICoverEnvQueryData, CloserRatio_Location) == 0x0104);
static_assert(offsetof(UNPCAICoverEnvQueryData, CanContain_TargetLocation) == 0x0114);
static_assert(offsetof(UNPCAICoverEnvQueryData, CanAttackTo_TargetLocation) == 0x012C);
static_assert(offsetof(UNPCAICoverEnvQueryData, CanAttackTo_IgnoredActors) == 0x0138);
static_assert(offsetof(UNPCAICoverEnvQueryData, PathLength_StartLocation) == 0x0148);
static_assert(offsetof(UNPCAICoverEnvQueryData, DistanceToHotPoint_Locations) == 0x0168);
static_assert(offsetof(UNPCAICoverEnvQueryData, DistanceToAllyCover_Location) == 0x0178);
static_assert(offsetof(UNPCAICoverEnvQueryData, IsSameSideToTarget_TargetLocation) == 0x0188);
static_assert(offsetof(UNPCAICoverEnvQueryData, IsSameSideToTarget_TargetDirection) == 0x0194);
static_assert(offsetof(UNPCAICoverEnvQueryData, IsInCone_Location) == 0x01A0);
static_assert(offsetof(UNPCAICoverEnvQueryData, IsInCone_Direction) == 0x01AC);
static_assert(offsetof(UNPCAICoverEnvQueryData, CoverDist_Location) == 0x01C0);
static_assert(offsetof(UNPCAICoverEnvQueryGenerator, CacheCoverSystem) == 0x0210);
static_assert(offsetof(UNPCAICoverEnvQueryTest_Protection, ProtectionFrom) == 0x01F8);
static_assert(offsetof(UNPCAICoverEnvQueryTest_ShootDistance, ShootDistanceTo) == 0x01F8);
static_assert(offsetof(UNPCAIDamageData, position) == 0x002C);
static_assert(offsetof(UNPCAIDynamicGroupInfo, AllyList) == 0x0040);
static_assert(offsetof(UNPCAIDynamicGroupInfo, WorldPrivate) == 0x0050);
static_assert(offsetof(UNPCAITargetInfoBase, BeFireCount) == 0x0030);
static_assert(offsetof(UNPCAITargetInfoBase, BeHitCount) == 0x0040);
static_assert(offsetof(UNPCAIEnemyGroupSingleInfo, EnemyLastSeenPosition) == 0x0068);
static_assert(offsetof(UNPCAIEnemyGroupSingleInfo, Person) == 0x0080);
static_assert(offsetof(UNPCAIEnemyGroupSingleInfo, EnemyLastEstimatePosition) == 0x009C);
static_assert(offsetof(UNPCAIEnvQueryGenerator_BlueprintBase, IntParam) == 0x0080);
static_assert(offsetof(UNPCAIEnvQueryGenerator_OnPolyCenter, OnlyCurrentRegion) == 0x0210);
static_assert(offsetof(UNPCAIEnvQueryGenerator_OnPolyCenter, IncludeNavMeshPolyCenters) == 0x0248);
static_assert(offsetof(UNPCAIEnvQueryGenerator_OnPolyCenter, IncludeNavMeshInternalEdges) == 0x0280);
static_assert(offsetof(UNPCAIEnvQueryGenerator_OnPolyCenter, IncludeNavMeshBoundaryEdges) == 0x02B8);
static_assert(offsetof(UNPCAIEnvQueryTest_BlueprintBase, Context) == 0x01F8);
static_assert(offsetof(UNPCAIEnvQueryTest_BlueprintBase, TestDescription) == 0x0200);
static_assert(offsetof(UNPCAIEnvQueryTest_PathfindingFromQuerier, TestMode) == 0x01F8);
static_assert(offsetof(UNPCAIEnvQueryTest_PathfindingFromQuerier, SkipUnreachable) == 0x0200);
static_assert(offsetof(UNPCAIEnvQueryTest_PointBase, Context) == 0x01F8);
static_assert(offsetof(UNPCAIEnvQueryTest_PointBase, TestDescription) == 0x0200);
static_assert(offsetof(UNPCAIFactionComponent, PropertyProfiles) == 0x0110);
static_assert(offsetof(FNPCAIProfileCover, Ars) == 0x0000);
static_assert(offsetof(FNPCAIProfileCover, CoverName) == 0x0018);
static_assert(offsetof(UNPCAIFactionPlugin, ProfileCover) == 0x0088);
static_assert(offsetof(UNPCAIFindAmbushAgainstPointAsyncTask, PointStart) == 0x0060);
static_assert(offsetof(UNPCAIFindAmbushAgainstPointAsyncTask, PointToGo) == 0x006C);
static_assert(offsetof(UNPCAIFindPathByKeyRouteAsyncTask, FromPoint) == 0x0060);
static_assert(offsetof(UNPCAIFindPathByKeyRouteAsyncTask, ToPoint) == 0x00C0);
static_assert(offsetof(UNPCAIFindPathByKeyRouteAsyncTask, QueryType) == 0x0120);
static_assert(offsetof(FAIProtectTreasureBox, BoxInstance) == 0x0000);
static_assert(offsetof(UNPCAIGlobalSharedInfo, DSPoseUpdateWaitList) == 0x0180);
static_assert(offsetof(UNPCAIGlobalSharedInfo, DSLeanPoseUpdateWaitList) == 0x0190);
static_assert(offsetof(UNPCAIGlobalSharedInfo, DSPoseUpdateCharacter) == 0x01A0);
static_assert(offsetof(UNPCAIGlobalSharedInfo, DSIKUpdateWaitList) == 0x01A8);
static_assert(offsetof(UNPCAIGlobalSharedInfo, DSIKUpdateCharacter) == 0x01B8);
static_assert(offsetof(UNPCAIGlobalSharedInfo, TreasureBoxInfos) == 0x01C0);
static_assert(offsetof(UNPCAIGoalTarget, AttentionPoint) == 0x0028);
static_assert(offsetof(UNPCAIGoalTarget, AIOwner) == 0x0030);
static_assert(offsetof(UNPCAIGroupBaseRequest, RequestPriority) == 0x0031);
static_assert(offsetof(UNPCAIGroupBaseRequest, Requester) == 0x0060);
static_assert(offsetof(UNPCAIGroupBaseRequest, WorldContext) == 0x0068);
static_assert(offsetof(UNPCAIGroupBaseRequest, ExecuterList) == 0x0070);
static_assert(offsetof(UNPCAIGroupBaseRequest, HistoryExecuterList) == 0x0080);
static_assert(offsetof(UNPCAIGroupBaseRequest, PossibleExecuterList) == 0x0090);
static_assert(offsetof(UNPCAIGroupDoorOpenRequest, Door) == 0x00A8);
static_assert(offsetof(UNPCAIGroupGoToPointRequest, PointToGo) == 0x00A8);
static_assert(offsetof(UNPCAIGroupHoldRequest, Direction) == 0x00A8);
static_assert(offsetof(UNPCAISubSystemComponent, OwnerPawn) == 0x00F8);
static_assert(offsetof(UNPCAISubSystemComponent, OwnerController) == 0x0100);
static_assert(offsetof(UNPCAIGroupRequestComponent, ClassOfWarnPlayerRequest) == 0x0110);
static_assert(offsetof(UNPCAIGroupRequestComponent, CurrentRequest) == 0x0148);
static_assert(offsetof(UNPCAIGroupRequestComponent, CompletedRequestTypeList) == 0x0150);
static_assert(offsetof(UNPCAIGroupRequestComponent, GpRequestController) == 0x0160);
static_assert(offsetof(UNPCAIGroupRequestController, GroupRequestsList) == 0x0028);
static_assert(offsetof(UNPCAIGroupSusspressionFireRequest, TargetType) == 0x00A8);
static_assert(offsetof(UNPCAIGroupSusspressionFireRequest, EnemyTarget) == 0x00B0);
static_assert(offsetof(UNPCAIGroupSusspressionFireRequest, PointTarget) == 0x00B8);
static_assert(offsetof(UNPCAIGroupThrowGrenadeRequest, EnemyTarget) == 0x00A8);
static_assert(offsetof(UNPCAIGroupThrowGrenadeRequest, PointTarget) == 0x00B0);
static_assert(offsetof(UNPCAIGroupWarnPlayerRequest, WarnPlayer) == 0x00A8);
static_assert(offsetof(UNPCAIGroupWarnPlayerRequest, StateWarnPlayer) == 0x00B0);
static_assert(offsetof(UNPCAIGroupWarnPlayerRequest, PointToShoot) == 0x00B8);
static_assert(offsetof(FMetisOptions, ObjectiveType) == 0x0004);
static_assert(offsetof(FMetisOptions, CoarsenType) == 0x0008);
static_assert(offsetof(FMetisOptions, InitialPartitioningType) == 0x000C);
static_assert(offsetof(FMetisOptions, RifinementType) == 0x0010);
static_assert(offsetof(FHNavSettings, MetisOptions) == 0x001C);
static_assert(offsetof(FIntraPath, Nodes) == 0x0008);
static_assert(offsetof(FHNavGraph, ParentIndices) == 0x0010);
static_assert(offsetof(FHNavGraph, ChildIndexOffsets) == 0x0040);
static_assert(offsetof(FHNavGraph, ChildIndices) == 0x0050);
static_assert(offsetof(FHNavGraph, PortalEdgeOffsets) == 0x0060);
static_assert(offsetof(FHNavGraph, PortalEdges) == 0x0070);
static_assert(offsetof(FHNavGraph, IntraPathOffsets) == 0x0080);
static_assert(offsetof(FHNavGraph, IntraPaths) == 0x0090);
static_assert(offsetof(FHNavGraph, IntraPathSourceIndexOffsets) == 0x00A0);
static_assert(offsetof(FHNavGraph, IntraPathSourceIndices) == 0x00B0);
static_assert(offsetof(FHNavGraph, IntraPathTargetIndexOffsets) == 0x00C0);
static_assert(offsetof(FHNavGraph, IntraPathCounts) == 0x00E0);
static_assert(offsetof(FHNavGraph, IntraPathPolyRefOffsets) == 0x00F0);
static_assert(offsetof(FHNavGraph, IntraPathPolyRefs) == 0x0100);
static_assert(offsetof(FHNavGraph, IntraPathCosts) == 0x0110);
static_assert(offsetof(FHNavGraph, IntraPathLengths) == 0x0120);
static_assert(offsetof(ANPCAIHNavActor, Settings) == 0x02E0);
static_assert(offsetof(ANPCAIHNavActor, Graphs) == 0x0320);
static_assert(offsetof(ANPCAIHNavActor, PortalNodeFlags) == 0x0338);
static_assert(offsetof(ANPCAIHNavActor, SearchedInfo) == 0x0408);
static_assert(offsetof(ANPCAILaunchPad, Root) == 0x02E0);
static_assert(offsetof(ANPCAILaunchPad, Launchpad) == 0x02E8);
static_assert(offsetof(ANPCAILaunchPad, TriggerVolume) == 0x02F0);
static_assert(offsetof(ANPCAILaunchPad, NavLink) == 0x02F8);
static_assert(offsetof(ANPCAILaunchPad, Target) == 0x0300);
static_assert(offsetof(ANPCAILaunchPad, LaunchedCharacter) == 0x0310);
static_assert(offsetof(FAIBackUpCoverPointFinder, AIPosistion) == 0x0000);
static_assert(offsetof(FAIBackUpCoverPointFinder, EnemyPosition) == 0x000C);
static_assert(offsetof(FAIStackGunRecord, MyPosition) == 0x0004);
static_assert(offsetof(FAIStackGunRecord, EnemyPosition) == 0x0010);
static_assert(offsetof(FAIStackGunRecord, AILean) == 0x001C);
static_assert(offsetof(FAIStackGunRecord, AIPose) == 0x001D);
static_assert(offsetof(FAIStackGunRecord, GunPoint) == 0x0020);
static_assert(offsetof(FAIStackGunRecord, EeyPoint) == 0x002C);
static_assert(offsetof(FAIStackGunRecord, ShootPoint) == 0x0038);
static_assert(offsetof(FAIRoundPathFindingNodes, LastLocationCalcRoundPathNodes) == 0x0018);
static_assert(offsetof(FNPCAIQueryRoundEnvironmentResult, AILocation) == 0x0000);
static_assert(offsetof(FNPCAIQueryRoundEnvironmentResult, EnemyLocation) == 0x000C);
static_assert(offsetof(FNPCAIQueryRoundEnvironmentResult, LMovePoint) == 0x001C);
static_assert(offsetof(FNPCAIQueryRoundEnvironmentResult, RMovePoint) == 0x002C);
static_assert(offsetof(FNPCAIQueryRoundEnvironmentResult, FMovePoint) == 0x003C);
static_assert(offsetof(FNPCAIQueryRoundEnvironmentResult, BMovePoint) == 0x004C);
static_assert(offsetof(UNPCAIMemorySystemComponent, AIOwner) == 0x0108);
static_assert(offsetof(UNPCAIMemorySystemComponent, GoalEnemy) == 0x0128);
static_assert(offsetof(UNPCAIMemorySystemComponent, LastEnemy) == 0x0130);
static_assert(offsetof(UNPCAIMemorySystemComponent, MemoryServiceNodeName) == 0x0138);
static_assert(offsetof(UNPCAIMemorySystemComponent, GoalTarget) == 0x0148);
static_assert(offsetof(UNPCAIMemorySystemComponent, CheckCoverPointPosition) == 0x0150);
static_assert(offsetof(UNPCAIMemorySystemComponent, BackUpCoverPointFinder) == 0x0160);
static_assert(offsetof(UNPCAIMemorySystemComponent, StackGunRecord) == 0x0194);
static_assert(offsetof(UNPCAIMemorySystemComponent, AcceptedSceneEvtUniqueIds) == 0x01D8);
static_assert(offsetof(UNPCAIMemorySystemComponent, RoundPathNodes) == 0x01E8);
static_assert(offsetof(UNPCAIMemorySystemComponent, TreasureBoxWantProtect) == 0x0268);
static_assert(offsetof(UNPCAIMemorySystemComponent, Cache_AmbushAgainstStartPoint) == 0x0270);
static_assert(offsetof(UNPCAIMemorySystemComponent, Cache_AmbushAgainstEndPoint) == 0x027C);
static_assert(offsetof(UNPCAIMemorySystemComponent, Cache_AmbushAgainstResultPoint) == 0x0288);
static_assert(offsetof(UNPCAIMemorySystemComponent, Cache_QREResult) == 0x0294);
static_assert(offsetof(UNPCAIMemorySystemComponent, AIStaticComponent) == 0x02F0);
static_assert(offsetof(UNPCAIMemorySystemComponent, AISceneEventsTriggerManager) == 0x02F8);
static_assert(offsetof(UNPCAIMemorySystemComponent, CachedPerceptionComponent) == 0x0300);
static_assert(offsetof(UNPCAIMemorySystemComponent, MoverSystemComponent) == 0x0308);
static_assert(offsetof(UNPCAIPropertyProfileBase, PropertyComponentClass) == 0x0028);
static_assert(offsetof(UNPCAIPropertyProfileBase, AIProfileType) == 0x0030);
static_assert(offsetof(UAIModifierAITypeProfile, AIMainType) == 0x0038);
static_assert(offsetof(UNPCAIProfileBaseComponent, PropertyProfile) == 0x0028);
static_assert(offsetof(UNPCAIProfileBaseComponent, Owner) == 0x0030);
static_assert(offsetof(UAIModifierArmorProfile, HeadArmor) == 0x0038);
static_assert(offsetof(UAIModifierArmorProfile, BodyArmor) == 0x004C);
static_assert(offsetof(UNPCAIMoverSystemComponent, MovementKind) == 0x0122);
static_assert(offsetof(UNPCAIMoverSystemComponent, AvoidVolumes) == 0x0128);
static_assert(offsetof(UNPCAIMoverSystemComponent, DirCurPoint) == 0x0178);
static_assert(offsetof(UNPCAIMoverSystemComponent, LastMoveResult) == 0x0184);
static_assert(offsetof(UNPCAIMoverSystemComponent, MoveProperty) == 0x01A0);
static_assert(offsetof(UNPCAIMoverSystemComponent, LocationMonitor) == 0x01A8);
static_assert(offsetof(UNPCAIMoverSystemComponent, BlendingVelocity) == 0x01F8);
static_assert(offsetof(UNPCAIMoverSystemComponent, DangerPoint) == 0x023C);
static_assert(offsetof(UNPCAIMoverSystemComponent, DangerPointDirection) == 0x0248);
static_assert(offsetof(UNPCAIMoverSystemComponent, AIDoorOpenerComponent) == 0x0280);
static_assert(offsetof(UNPCAIMoverSystemComponent, AIPoseComponent) == 0x0288);
static_assert(offsetof(UNPCAIMultiTargetSystemComponent, ZoneGroupInfo) == 0x0118);
static_assert(offsetof(UNPCAIMultiTargetSystemComponent, AllTargetInfoList) == 0x0128);
static_assert(offsetof(UNPCAIMultiTargetSystemComponent, MemoryComponent) == 0x0148);
static_assert(offsetof(UNPCAIMultiTargetSystemComponent, PerceptionComponent) == 0x0150);
static_assert(offsetof(UNPCAIMultiTargetSystemComponent, AIStaticComponent) == 0x0158);
static_assert(offsetof(UNPCAIMultiTargetSystemComponent, SharedInfo) == 0x0160);
static_assert(offsetof(UNPCAIMultiTargetSystemComponent, MindProps) == 0x0168);
static_assert(offsetof(UNPCAIMultiTargetSystemComponent, HearProps) == 0x0170);
static_assert(offsetof(UNPCAIMultiTargetSystemComponent, AimingProps) == 0x0178);
static_assert(offsetof(UNPCAIMultiTargetSystemComponent, HealthProps) == 0x0180);
static_assert(offsetof(UNPCAIMultiTargetSystemComponent, GrenadeProps) == 0x0188);
static_assert(offsetof(UNPCAIMultiTargetSystemComponent, DamageProps) == 0x0190);
static_assert(offsetof(UNPCAIMultiTargetSelectorComponent, PerceptionTag1) == 0x01A0);
static_assert(offsetof(UNPCAIMultiTargetSelectorComponent, PerceptionTag2) == 0x01B0);
static_assert(offsetof(UNPCAIMultiTargetSelectorComponent, PerceptionTag3) == 0x01C0);
static_assert(offsetof(UNPCAIMultiTargetSelectorComponent, PerceptionActor) == 0x01D8);
static_assert(offsetof(UNPCAIMultiTargetSelectorComponent, PerceptionStimulus) == 0x01E0);
static_assert(offsetof(UNPCAIMultiTargetSelectorComponent, SounderThrower) == 0x0228);
static_assert(offsetof(UNPCAIMultiTargetSelectorComponent, LastFireToMePerson) == 0x0250);
static_assert(offsetof(UNPCAIMultiTargetSelectorComponent, LastShootMePerson) == 0x0260);
static_assert(offsetof(UNPCAIMultiTargetSelectorComponent, LastShootMePersonLocation) == 0x0268);
static_assert(offsetof(UNPCAIMultiTargetSelectorComponent, LastShootMeSelfLocation) == 0x0274);
static_assert(offsetof(UNPCAIMultiTargetSelectorComponent, BeHitCount) == 0x0288);
static_assert(offsetof(FNavSkeletonBuildSettings, NavQueryExtent) == 0x0000);
static_assert(offsetof(FNavSkeletonBuildSettings, DivergenceMethod) == 0x0047);
static_assert(offsetof(FNavSkeletonPoint, ProtectionDirection) == 0x0028);
static_assert(offsetof(FNavSkeletonPoint, NeighbourIndices) == 0x0040);
static_assert(offsetof(FNavSkeletonPoint, NeighbourDistances) == 0x0050);
static_assert(offsetof(FNavSkeletonPoint, VisibleIndices) == 0x0060);
static_assert(offsetof(FNavSkeletonPoint, ThrowableIndices) == 0x0070);
static_assert(offsetof(FNavSkeletonPoint, MovableIndices) == 0x0080);
static_assert(offsetof(FNavSkeletonPoint, FriendIndices) == 0x0090);
static_assert(offsetof(FNavSkeletonData, Points) == 0x0000);
static_assert(offsetof(ANPCAINavMeshManager, SkeletonBuildSettings) == 0x0478);
static_assert(offsetof(ANPCAINavMeshManager, NavSkeletonPoints) == 0x0508);
static_assert(offsetof(ANPCAINavMeshManager, NavSkeletonData) == 0x0518);
static_assert(offsetof(ANPCAINavMeshManager, CachedNavLinkProxies) == 0x0580);
static_assert(offsetof(ANPCAITestingActor, CapsuleComponent) == 0x02E0);
static_assert(offsetof(ANPCAITestingActor, NavAgentProps) == 0x02E8);
static_assert(offsetof(ANPCAINavMeshTestingActor, ClosestPointOnWall) == 0x0368);
static_assert(offsetof(ANPCAINavMeshTestingActor, SamplePointCountStat) == 0x0390);
static_assert(offsetof(ANPCAINavMeshTestingActor, WallStat) == 0x03A0);
static_assert(offsetof(ANPCAINavMeshTestingActor, DistanceStat) == 0x03B0);
static_assert(offsetof(ANPCAINavMeshTestingActor, DivergenceStat) == 0x03C0);
static_assert(offsetof(ANPCAINavMeshTestingActor, FilteredDistanceStat) == 0x03D0);
static_assert(offsetof(ANPCAINavMeshTestingActor, FilteredDivergenceStat) == 0x03E0);
static_assert(offsetof(ANPCAINavMeshTestingActor, BuildSettings) == 0x043C);
static_assert(offsetof(ANPCAINavMeshTestingActor, NavSkeletonPoint) == 0x04D0);
static_assert(offsetof(ANPCAINavMeshTestingActor, TargetNavSkeletonPoint) == 0x0570);
static_assert(offsetof(ANPCAINavMeshTestingActor, FoundPointIDs) == 0x0610);
static_assert(offsetof(ANPCAINavMeshTestingActor, TargetDebugActor) == 0x0628);
static_assert(offsetof(ANavPathPointActor, NodeLocation) == 0x02F0);
static_assert(offsetof(ANavPathPointActor, NextPathPointArray) == 0x0300);
static_assert(offsetof(UNPCAINavUtilitySystem, CachedNavMeshManager) == 0x0030);
static_assert(offsetof(UNPCAINavUtilitySystem, CachedCoverSystem) == 0x0038);
static_assert(offsetof(UNPCAIPeekPointAsyncTask, TargetPoint) == 0x0060);
static_assert(offsetof(UNPCAIPeekPointAsyncTask, DangerPoint) == 0x006C);
static_assert(offsetof(UNPCAIPeekPointAsyncTask, PeekPoint) == 0x007C);
static_assert(offsetof(FAIGrassMapInfo, MapName) == 0x0000);
static_assert(offsetof(FAIGrassMapInfo, IgnoreFoliageTags) == 0x0048);
static_assert(offsetof(FAIGrassMapInfo, MeshGrassTags) == 0x0060);
static_assert(offsetof(FAIGrassMapInfo, SaveLevelName) == 0x0070);
static_assert(offsetof(FAIFoliageGrassBlock, Bounds) == 0x0004);
static_assert(offsetof(FAIFoliageGrassBlock, Location) == 0x0020);
static_assert(offsetof(FAILandscapeGrassBlock, Bounds) == 0x0000);
static_assert(offsetof(FAILandscapeGrassBlock, Location) == 0x001C);
static_assert(offsetof(FAIGrassBox, Center) == 0x0000);
static_assert(offsetof(FAIGrassBox, Extent) == 0x000C);
static_assert(offsetof(FAIGrassCylinder, PartsDensities) == 0x0010);
static_assert(offsetof(FAIGrassBlock, AIGrassName) == 0x0028);
static_assert(offsetof(FAIGrassBlock, GrassBoxList) == 0x0038);
static_assert(offsetof(FAIGrassBlock, GrassCylinderList) == 0x0048);
static_assert(offsetof(FAIGrassBlock, SlowDownBounds) == 0x005C);
static_assert(offsetof(ANPCAIPerceptionAssistActor, MapInfo) == 0x02E0);
static_assert(offsetof(ANPCAIPerceptionAssistActor, FoliageGrassBlockList) == 0x0368);
static_assert(offsetof(ANPCAIPerceptionAssistActor, LandscapeGrassBlockList) == 0x0378);
static_assert(offsetof(ANPCAIPerceptionAssistActor, GrassBlockAssets) == 0x0388);
static_assert(offsetof(ANPCAIPerceptionAssistActor, DebugAIGrassBox) == 0x0399);
static_assert(offsetof(UNPCAIPerceptionComponent, FlashLightPos) == 0x01E8);
static_assert(offsetof(UNPCAIPerceptionComponent, AIOwnerPawn) == 0x0210);
static_assert(offsetof(UNPCAIPerceptionComponent, WeaponChannel) == 0x0218);
static_assert(offsetof(UNPCAIPerceptionComponent, AISightChannel) == 0x0219);
static_assert(offsetof(UNPCAIPerceptionComponent, PerceptionAssistActor) == 0x0220);
static_assert(offsetof(UNPCAIPerceptionComponent, PerceptionDynamicActor) == 0x0228);
static_assert(offsetof(UNPCAIPerceptionComponent, OwnerMoverComponent) == 0x0230);
static_assert(offsetof(UNPCAIPerceptionComponent, OwnerMemoryComponent) == 0x0238);
static_assert(offsetof(UNPCAIPerceptionComponent, OwnerMultiTargetComponent) == 0x0240);
static_assert(offsetof(UNPCAIPerceptionComponent, ShootProps) == 0x0248);
static_assert(offsetof(UNPCAIPerceptionComponent, LookProps) == 0x0250);
static_assert(offsetof(UNPCAIPerceptionComponent, AIFireComponent) == 0x0258);
static_assert(offsetof(UNPCAIPerceptionComponent, AIStaticsComponent) == 0x0260);
static_assert(offsetof(UNPCAIPerceptionComponent, AIPoseComponent) == 0x0268);
static_assert(offsetof(UNPCAIPerceptionComponent, IKComponent) == 0x0270);
static_assert(offsetof(UNPCAIPerceptionComponent, AISenseAbilityComponent) == 0x0278);
static_assert(offsetof(UNPCAIPerceptionComponent, AISharedInfo) == 0x0280);
static_assert(offsetof(UNPCAIPerceptionComponent, AITurnComponent) == 0x0288);
static_assert(offsetof(UNPCAIPerceptionComponent, AutoLeanType) == 0x02A4);
static_assert(offsetof(UNPCAIPerceptionComponent, AIPoseType) == 0x02A5);
static_assert(offsetof(UNPCAIPerceptionComponent, TargetPoseType) == 0x02A6);
static_assert(offsetof(UNPCAIPerceptionComponent, AILeanType) == 0x02A7);
static_assert(offsetof(UNPCAIPerceptionComponent, AIGrassElements) == 0x02B0);
static_assert(offsetof(FAIBlockArea, TileType) == 0x0000);
static_assert(offsetof(FAIBlockArea, BlockBox) == 0x0004);
static_assert(offsetof(FAIBlockArea, EffectiveBox) == 0x0020);
static_assert(offsetof(FAIBlockArea, Center) == 0x003C);
static_assert(offsetof(FAISenseFlashBlock, StartPos) == 0x0008);
static_assert(offsetof(FAISenseFlashBlock, Dir) == 0x0014);
static_assert(offsetof(ANPCAIPerceptionDynamicActor, DynamicAreaList) == 0x02E0);
static_assert(offsetof(ANPCAIPerceptionDynamicActor, SenseFlashBlockList) == 0x02F0);
static_assert(offsetof(UNPCAIProfile, FactionClass) == 0x0028);
static_assert(offsetof(UNPCAIProfile, RoleClass) == 0x0030);
static_assert(offsetof(FAIBodyPartAimingChoice, BodyPart) == 0x0000);
static_assert(offsetof(FAIBodyBulkAimingChoice, BodyBulk) == 0x0000);
static_assert(offsetof(FAIBodyBulkAimingChoice, BodyParts) == 0x0008);
static_assert(offsetof(UAIPropertyAimingProfile, UA_AIM_TIME_TO_DIST_MULTIPLIER_CURVE) == 0x0048);
static_assert(offsetof(UAIPropertyAimingProfile, UA_SCATTERING_DIST_CURVE) == 0x0050);
static_assert(offsetof(UAIPropertyAimingProfile, UA_FAKE_RANDOM_HIT_RATE_CURVE) == 0x0058);
static_assert(offsetof(UAIPropertyAimingProfile, UA_SHOOT_HIT_RATES) == 0x0060);
static_assert(offsetof(UAIPropertyAimingProfile, UA_SHOOT_HIT_RATES_AI) == 0x0070);
static_assert(offsetof(UAIPropertyAimingProfile, UA_SHOOT_HIT_RATE_DISTANCE_TO_PLAYER_CURVE) == 0x0080);
static_assert(offsetof(UAIPropertyAimingProfile, UA_SHOOT_HIT_RATE_DISTANCE_TO_AI_CURVE) == 0x0088);
static_assert(offsetof(UAIPropertyAimingProfile, UA_SHOOT_HIT_RATE_DISTANCE_NOT_ADS) == 0x0090);
static_assert(offsetof(UAIPropertyAimingProfile, UA_SHOOT_HIT_RATE_IF_BATTLE_DURATION_CURVE) == 0x00C0);
static_assert(offsetof(UAIPropertyAimingProfile, UA_SHOOT_HIT_RATE_IF_WEAPON_ADSMOA_BIAS_CURVE) == 0x00C8);
static_assert(offsetof(UAIPropertyAimingProfile, AIMING_BULK_FOR_PLAYER) == 0x00F8);
static_assert(offsetof(UAIPropertyAimingProfile, AIMING_BULK_FOR_AI) == 0x0108);
static_assert(offsetof(UAIPropertyAimingProfile, AIMING_BODYPART_TREND) == 0x0119);
static_assert(offsetof(UAIPropertyAimingProfile, AimingType) == 0x017C);
static_assert(offsetof(UNPCAIPropertyComponent_AIType, Modifier_AIType) == 0x0038);
static_assert(offsetof(UAIPropertyCoreProfile, AimingType) == 0x0038);
static_assert(offsetof(UAIPropertyCurveProfile, SightCurveDaytime) == 0x0038);
static_assert(offsetof(UAIPropertyCurveProfile, SightCureOutLight) == 0x0040);
static_assert(offsetof(UAIPropertyDamageProfile, DamageNoZeroHPParts) == 0x0058);
static_assert(offsetof(UAIPropertyGrenadeProfile, UA_THROW_POSITION_OFFSET_STAND) == 0x0038);
static_assert(offsetof(UAIPropertyGrenadeProfile, UA_THROW_POSITION_OFFSET_STAND_LLEAN) == 0x0044);
static_assert(offsetof(UAIPropertyGrenadeProfile, UA_THROW_POSITION_OFFSET_STAND_RLEAN) == 0x0050);
static_assert(offsetof(UAIPropertyGrenadeProfile, UA_THROW_POSITION_OFFSET_CROUCH) == 0x005C);
static_assert(offsetof(UAIPropertyGrenadeProfile, UA_THROW_POSITION_OFFSET_CROUCH_LLEAN) == 0x0068);
static_assert(offsetof(UAIPropertyGrenadeProfile, UA_THROW_POSITION_OFFSET_CROUCH_RLEAN) == 0x0074);
static_assert(offsetof(UAIPropertyGrenadeProfile, UA_THROW_POSITION_OFFSET_PRONE) == 0x0080);
static_assert(offsetof(UAIPropertyLookProfile, SIGHT_PRIORITY) == 0x0038);
static_assert(offsetof(UAIPropertyLookProfile, VISION_NORMAL) == 0x0040);
static_assert(offsetof(UAIPropertyLookProfile, FOG_VISION_CURVE) == 0x0060);
static_assert(offsetof(UAIPropertyLookProfile, FLASH_LIGHT_BURN_LOSS_SIGHT_CURVE) == 0x00C8);
static_assert(offsetof(UAIPropertyLookProfile, LOOK_POSITION_OFFSET_STAND) == 0x00E8);
static_assert(offsetof(UAIPropertyLookProfile, LOOK_POSITION_OFFSET_STAND_LLEAN) == 0x00F4);
static_assert(offsetof(UAIPropertyLookProfile, LOOK_POSITION_OFFSET_STAND_RLEAN) == 0x0100);
static_assert(offsetof(UAIPropertyLookProfile, LOOK_POSITION_OFFSET_CROUCH) == 0x010C);
static_assert(offsetof(UAIPropertyLookProfile, LOOK_POSITION_OFFSET_CROUCH_LLEAN) == 0x0118);
static_assert(offsetof(UAIPropertyLookProfile, LOOK_POSITION_OFFSET_CROUCH_RLEAN) == 0x0124);
static_assert(offsetof(UAIPropertyLookProfile, LOOK_POSITION_OFFSET_PRONE) == 0x0130);
static_assert(offsetof(UAIPropertyLookProfile, LEAN_CHECK_BLOCK_WALL_OFFSET) == 0x013C);
static_assert(offsetof(UAIPropertyMindProfile, CALCULATE_GOAL_ENEMY_PRIORITY_INTERVAL) == 0x0038);
static_assert(offsetof(UAIPropertyMindProfile, SCORE_MULTIPLE_FACE_ANGLE_FOR_GOAL_ENEMY) == 0x0058);
static_assert(offsetof(UAIPropertyShootProfile, UA_Curve_ShootAccuracyByRecoil) == 0x0038);
static_assert(offsetof(UAIPropertyShootProfile, UA_SHOOT_POSITION_OFFSET_STAND) == 0x0054);
static_assert(offsetof(UAIPropertyShootProfile, UA_SHOOT_POSITION_OFFSET_STAND_LLEAN) == 0x0060);
static_assert(offsetof(UAIPropertyShootProfile, UA_SHOOT_POSITION_OFFSET_STAND_RLEAN) == 0x006C);
static_assert(offsetof(UAIPropertyShootProfile, UA_SHOOT_POSITION_OFFSET_CROUCH) == 0x0078);
static_assert(offsetof(UAIPropertyShootProfile, UA_SHOOT_POSITION_OFFSET_CROUCH_LLEAN) == 0x0084);
static_assert(offsetof(UAIPropertyShootProfile, UA_SHOOT_POSITION_OFFSET_CROUCH_RLEAN) == 0x0090);
static_assert(offsetof(UAIPropertyShootProfile, UA_SHOOT_POSITION_OFFSET_PRONE) == 0x009C);
static_assert(offsetof(UAIPropertySoundProfile, DataTableOfAI) == 0x0038);
static_assert(offsetof(UAIPropertyWeaponProfile, WeaponTorrBodyBoneName) == 0x0058);
static_assert(offsetof(UAIPropertyWeaponProfile, GunShieldPositionOffset_Stand) == 0x0060);
static_assert(offsetof(UAIPropertyWeaponProfile, GunShieldPositionOffset_Crouch) == 0x006C);
static_assert(offsetof(UAIPropertyWeaponProfile, GunShieldPositionOffset_Prone) == 0x0078);
static_assert(offsetof(UAIPropertyWeaponProfile, GunShieldPositionOffset_LeftLean) == 0x0084);
static_assert(offsetof(UAIPropertyWeaponProfile, GunShieldPositionOffset_RightLean) == 0x0090);
static_assert(offsetof(UNPCAIQueryRoundEnvironmentAsyncTask, EnemyLocation) == 0x0060);
static_assert(offsetof(ANPCAIRecastNavMesh, HNavActor) == 0x0598);
static_assert(offsetof(UNPCAIRoleComponent, PropertyProfiles) == 0x0108);
static_assert(offsetof(FNPCAIComingExplosionEvent, ExplosionLocation) == 0x0004);
static_assert(offsetof(FNPCAIComingExplosionEvent, Instigator) == 0x0018);
static_assert(offsetof(FNPCAIComingExplosionEvent, Tag) == 0x0020);
static_assert(offsetof(UNPCAISense_ComingExplosion, ExplosionEvents) == 0x0080);
static_assert(offsetof(UNPCAISense_Damage, RegisteredEvents) == 0x0080);
static_assert(offsetof(UNPCAISenseConfig_ComingExplosion, Implementation) == 0x0048);
static_assert(offsetof(UNPCAISenseConfig_ComingExplosion, DetectionByAffiliation) == 0x0054);
static_assert(offsetof(UNPCAISenseConfig_Damage, Implementation) == 0x0048);
static_assert(offsetof(UNPCAISenseConfig_Sight, AISightUseChannel) == 0x0070);
static_assert(offsetof(UNPCAISenseConfig_Sight, WeaponUseChannel) == 0x0071);
static_assert(offsetof(UNPCAISenseEvent_ComingExplosion, Event) == 0x0028);
static_assert(offsetof(UNPCAISenseEvent_Damage, Event) == 0x0028);
static_assert(offsetof(FBossSettings, GLUHAR_FOLLOWER_PATH_NAME) == 0x00C8);
static_assert(offsetof(FCoreSettings, AimingType) == 0x0016);
static_assert(offsetof(FCurveSettings, SightCurveDaytime) == 0x0000);
static_assert(offsetof(FCurveSettings, SightCureOutLight) == 0x0008);
static_assert(offsetof(FNPCAIWeaponConfigTableRow, WeaponBlueprintName) == 0x0008);
static_assert(offsetof(UNPCAISettingsComponent, Aiming) == 0x00F8);
static_assert(offsetof(UNPCAISettingsComponent, Boss) == 0x01C8);
static_assert(offsetof(UNPCAISettingsComponent, Change) == 0x02E0);
static_assert(offsetof(UNPCAISettingsComponent, Core) == 0x031C);
static_assert(offsetof(UNPCAISettingsComponent, Cover) == 0x0348);
static_assert(offsetof(UNPCAISettingsComponent, Global) == 0x0410);
static_assert(offsetof(UNPCAISettingsComponent, Grenade) == 0x05E4);
static_assert(offsetof(UNPCAISettingsComponent, Hearing) == 0x0690);
static_assert(offsetof(UNPCAISettingsComponent, Lay) == 0x06FC);
static_assert(offsetof(UNPCAISettingsComponent, Look) == 0x0748);
static_assert(offsetof(UNPCAISettingsComponent, Mind) == 0x0828);
static_assert(offsetof(UNPCAISettingsComponent, Move) == 0x0920);
static_assert(offsetof(UNPCAISettingsComponent, Patrol) == 0x0978);
static_assert(offsetof(UNPCAISettingsComponent, Scattering) == 0x09EC);
static_assert(offsetof(UNPCAISettingsComponent, Shoot) == 0x0A64);
static_assert(offsetof(UNPCAISettingsComponent, Current) == 0x0AF8);
static_assert(offsetof(UNPCAISettingsComponent, Curve) == 0x0B00);
static_assert(offsetof(UNPCAISettingsComponent, Weapon) == 0x0B10);
static_assert(offsetof(FSteepZoneDeleteSettings, NavQueryExtent) == 0x0000);
static_assert(offsetof(FSteepZoneDeleteSettings, TraceChannel) == 0x002C);
static_assert(offsetof(FNPCAISteepZoneDeleter, WorldContextObject) == 0x0000);
static_assert(offsetof(FNPCAISteepZoneDeleter, World) == 0x0020);
static_assert(offsetof(FNPCAISteepZoneDeleter, MainNavData) == 0x0030);
static_assert(offsetof(FNPCAISteepZoneDeleter, NavMeshManager) == 0x0038);
static_assert(offsetof(ANPCAISteepZoneTestingActor, Settings) == 0x0318);
static_assert(offsetof(ANPCAISteepZoneTestingActor, Deleter) == 0x0350);
static_assert(offsetof(UNPCAITacticSystemComponent, CoverSystem) == 0x0110);
static_assert(offsetof(UNPCAITacticSystemComponent, TacticSystemActor) == 0x0118);
static_assert(offsetof(UNPCAITargetInfo, BodyPartsInArmor) == 0x0060);
static_assert(offsetof(UNPCAITargetInfo, Person) == 0x02C8);
static_assert(offsetof(UNPCAITargetInfo, AIPawn) == 0x02D0);
static_assert(offsetof(UNPCAITargetInfo, EnemyGroupSingleInfo) == 0x02D8);
static_assert(offsetof(UNPCAITargetInfo, LookProps) == 0x02E0);
static_assert(offsetof(UNPCAITargetInfo, AimingProps) == 0x02E8);
static_assert(offsetof(UNPCAITargetInfo, VisibileOnlyBySense) == 0x02F0);
static_assert(offsetof(FAIGroupAllyDeathInfo, DeathLocation) == 0x0004);
static_assert(offsetof(FAIGroupAllyDeathInfo, KillerLocation) == 0x0010);
static_assert(offsetof(UNPCAITeam, AllyBeHitCount) == 0x0038);
static_assert(offsetof(UNPCAITeam, AllyList) == 0x0048);
static_assert(offsetof(UNPCAITeam, PlayerAllyList) == 0x0058);
static_assert(offsetof(UNPCAITeam, EnemyInfoList) == 0x0068);
static_assert(offsetof(UNPCAITeam, NeutralList) == 0x0078);
static_assert(offsetof(UNPCAITeam, SuspectedPoints) == 0x0088);
static_assert(offsetof(UNPCAITeam, AllyDeathList) == 0x0098);
static_assert(offsetof(UNPCAITeam, GroupRequestController) == 0x00A8);
static_assert(offsetof(UNPCAITeam, FactionComponent) == 0x00B0);
static_assert(offsetof(FAITrackLOG, LogType) == 0x0000);
static_assert(offsetof(FAITrackLOG, LOGKValues) == 0x0010);
static_assert(offsetof(UAITrackLOGUnit, AIPawn) == 0x0028);
static_assert(offsetof(UAITrackLOGUnit, AIName) == 0x0030);
static_assert(offsetof(UAITrackLOGUnit, TrackLOGList) == 0x0040);
static_assert(offsetof(UNPCAIZoneGroupInfo, DynamicGroupList) == 0x00D0);
static_assert(offsetof(UNPCAIZoneGroupInfo, WorldPrivate) == 0x00E0);
static_assert(offsetof(UNPCBehaviorLOD, OwnerPawn) == 0x0028);
static_assert(offsetof(UNPCBehaviorLOD, Actions) == 0x0048);
static_assert(offsetof(UNPCBehaviorLODAction, OwnerPawn) == 0x0038);
static_assert(offsetof(UNPCBehaviorLODActionTick, OwnerPawn) == 0x0028);
static_assert(offsetof(UNPCBehaviorLODActionTick, LODSysComp) == 0x0030);
static_assert(offsetof(FComponentInfo, Component) == 0x0000);
static_assert(offsetof(UNPCBehaviorLODSystemComponent, LODs) == 0x0118);
static_assert(offsetof(UNPCBehaviorLODSystemComponent, CurrLODCache) == 0x0130);
static_assert(offsetof(UNPCBehaviorLODSystemComponent, CharacterCachedCompList) == 0x0148);
static_assert(offsetof(UNPCBehaviorLODSystemComponent, ControllerCachedCompList) == 0x0158);
static_assert(offsetof(UNPCBehaviorLODSystemComponent, MemroySystemComponent) == 0x0170);
static_assert(offsetof(UNPCBTDecorator, TagText) == 0x0070);
static_assert(offsetof(UNPCBTDecorator, Message) == 0x0080);
static_assert(offsetof(UNPCBTDecorator_AIPropertyComparison, AIPropertyComponent) == 0x0090);
static_assert(offsetof(UNPCBTDecorator_AIPropertyComparison, ComponentFunctionName) == 0x0098);
static_assert(offsetof(UNPCBTDecorator_AIPropertyComparison, BoolOperation) == 0x00A8);
static_assert(offsetof(UNPCBTDecorator_AIPropertyComparison, ArithmeticOperation) == 0x00A9);
static_assert(offsetof(UNPCBTDecorator_AIPropertyComparison, CachedDescription) == 0x00B8);
static_assert(offsetof(UNPCBTDecorator_BBConditionBase, SourceBlackboardKey) == 0x0098);
static_assert(offsetof(UNPCBTDecorator_BBConditionBase, TargetBlackboardKey) == 0x00C0);
static_assert(offsetof(UNPCBTDecorator_BBConditionBool, BlackboardKey) == 0x0090);
static_assert(offsetof(UNPCBTDecorator_BBConditionBool, ConditionType) == 0x00B8);
static_assert(offsetof(UNPCBTDecorator_BBConditionFloat, SourceBlackboardKey) == 0x0090);
static_assert(offsetof(UNPCBTDecorator_BBConditionFloat, TargetBlackboardKey) == 0x00B8);
static_assert(offsetof(UNPCBTDecorator_BBConditionFloat, ConditionType) == 0x00E5);
static_assert(offsetof(UNPCBTDecorator_BBConditionInt, OperationType) == 0x00E8);
static_assert(offsetof(UNPCBTDecorator_BBConditionString, OperationType) == 0x00E8);
static_assert(offsetof(UNPCBTDecorator_BBConditionString, TargetValue) == 0x00F0);
static_assert(offsetof(UNPCBTDecorator_BlueprintBase, AIOwner) == 0x0070);
static_assert(offsetof(UNPCBTDecorator_BlueprintBase, ObservedKeyNames) == 0x0078);
static_assert(offsetof(UNPCBTDecorator_HasSuspectPoints, Offset) == 0x009C);
static_assert(offsetof(UNPCBTDecorator_SingletonBlueprintBase, AIOwner) == 0x0068);
static_assert(offsetof(UNPCBTDecorator_SingletonBlueprintBase, ObservedKeyNames) == 0x0070);
static_assert(offsetof(UNPCBTService, TagText) == 0x0078);
static_assert(offsetof(UNPCBTService, Message) == 0x0088);
static_assert(offsetof(UNPCBTService_FindRandomPosition, CenterTarget) == 0x0098);
static_assert(offsetof(UNPCBTService_FindRandomPosition, RandomLocation) == 0x00C0);
static_assert(offsetof(UNPCBTService_SetSenseRangeScale, AISenseType) == 0x00A0);
static_assert(offsetof(UNPCBTService_SingletonBlueprintBase, AIOwner) == 0x0070);
static_assert(offsetof(UNPCBTTask_AimAndFireEnemy, FireTarget) == 0x00B0);
static_assert(offsetof(UNPCBTTask_AimAndFireEnemy, ShootOneRound) == 0x00D8);
static_assert(offsetof(UNPCBTTask_AimAndFireEnemy, SkipFirstRoundAim) == 0x0100);
static_assert(offsetof(UNPCBTTask_AimAndFireEnemy, FireTargetPawn) == 0x0130);
static_assert(offsetof(UNPCBTTask_AimAndFireEnemy, FireTargetLoc) == 0x0138);
static_assert(offsetof(UNPCBTTask_AimAndFireEnemy, ShootPartID) == 0x0147);
static_assert(offsetof(UNPCBTTaskNode, TagText) == 0x0078);
static_assert(offsetof(UNPCBTTaskNode, Message) == 0x0088);
static_assert(offsetof(UNPCBTTask_CalcNextAttackPosition, FilterClass) == 0x00B0);
static_assert(offsetof(UNPCBTTask_DBNORescue, Tgt_DBNOTarget) == 0x00A8);
static_assert(offsetof(UNPCBTTask_FireEnemy, FireTarget) == 0x00B0);
static_assert(offsetof(UNPCBTTask_FireEnemy, MovementMultiplier) == 0x00D8);
static_assert(offsetof(UNPCBTTask_FireEnemy, AimingMultiplier) == 0x0100);
static_assert(offsetof(UNPCBTTask_FireEnemy, BurstMultiplier) == 0x0128);
static_assert(offsetof(UNPCBTTask_FireEnemy, TargetStateMultiplier) == 0x0150);
static_assert(offsetof(UNPCBTTask_FireEnemyEx, FireTarget) == 0x00B0);
static_assert(offsetof(UNPCBTTask_FireEnemyEx, FireType) == 0x00D8);
static_assert(offsetof(UNPCBTTask_FollowPathNode, WanderLocationKey) == 0x0098);
static_assert(offsetof(UNPCBTTask_FollowPathNode, WaitTimeKey) == 0x00C0);
static_assert(offsetof(UNPCBTTask_MeleeAttackEnemy, FireTarget) == 0x00B0);
static_assert(offsetof(UNPCBTTask_MeleeAttackEnemy, FireTargetPawn) == 0x00D8);
static_assert(offsetof(UNPCBTTask_MeleeAttackEnemy, FireTargetLoc) == 0x00E0);
static_assert(offsetof(UNPCBTTask_MoveToEx, MoveType) == 0x00B0);
static_assert(offsetof(UNPCBTTask_MoveToEx, TagText) == 0x00C0);
static_assert(offsetof(UNPCBTTask_MoveToEx, Message) == 0x00D0);
static_assert(offsetof(UNPCBTTask_PlayAkSound, SoundToPlay) == 0x0098);
static_assert(offsetof(UNPCBTTask_SetAIPose, TargetAIPose) == 0x0098);
static_assert(offsetof(UNPCBTTask_SetBlackboardValue, SourceValue) == 0x0098);
static_assert(offsetof(UNPCBTTask_SetBlackboardValue, TargetValue) == 0x00C0);
static_assert(offsetof(UNPCBTTask_SetFocalPoint, TagText) == 0x00A0);
static_assert(offsetof(UNPCBTTask_SetFocalPoint, Message) == 0x00B0);
static_assert(offsetof(UNPCBTTask_SetSenseRangeScale, AISenseType) == 0x00A0);
static_assert(offsetof(UNPCBTTask_SetTargetHatred, EnemyTargetKey) == 0x00A8);
static_assert(offsetof(FNavSkeletonGraphFindResult, status) == 0x0000);
static_assert(offsetof(FNavSkeletonGraphFindResult, Nodes) == 0x0008);
static_assert(offsetof(FNavSkeletonGraphFindResult, DesiredNodeIndices) == 0x0018);
static_assert(offsetof(FNavSkeletonGraphFindResult, DesiredPointIDs) == 0x0028);
static_assert(offsetof(FNPCAIFindAmbushAgainstPointResult, AgainstPoint) == 0x0000);
static_assert(offsetof(FNPCAIFindPathByKeyRouteResult, Path) == 0x0000);
static_assert(offsetof(FNPCAIPeekPointResult, PeekPoint) == 0x0000);
static_assert(offsetof(FAIDataProviderFVectorValue, DefaultValue) == 0x0030);
static_assert(offsetof(FAIDoorSingleSafetyPoint, Location) == 0x0000);
static_assert(offsetof(FAISafetyOpenDoorResp, SGDoor) == 0x0000);
static_assert(offsetof(FAISafetyOpenDoorResp, NavLinkPoint) == 0x0008);
static_assert(offsetof(FAISafetyOpenDoorResp, SafetyWaitPoint) == 0x0014);
static_assert(offsetof(FNPCAIProfileCoverTag, ProfileClass) == 0x0000);
static_assert(offsetof(FNPCAIProfileCoverTag, ProfileType) == 0x0008);
static_assert(offsetof(FNPCAIProfileCoverTag, VarName) == 0x000C);
static_assert(offsetof(FAIEnemyInfo, FireLocation) == 0x0008);
static_assert(offsetof(FAIEnemyInfo, FireDirection) == 0x0014);
static_assert(offsetof(FNPCAINavSkeletonBuilder, WorldContextObject) == 0x0000);
static_assert(offsetof(FNPCAINavSkeletonBuilder, World) == 0x00B8);
static_assert(offsetof(FNPCAINavSkeletonBuilder, MainNavData) == 0x00C8);
static_assert(offsetof(FNPCAINavSkeletonBuilder, NavMeshManager) == 0x00D0);
static_assert(offsetof(FNPCAINavSkeletonBuilder, LinkProxies) == 0x00E0);
static_assert(offsetof(FNavSkeletonPathPoint, Location) == 0x0000);
static_assert(offsetof(FNavSkeletonPathPoint, CustomNavLinkId) == 0x0020);
static_assert(offsetof(FNavSkeletonPatchedPath, PathPoints) == 0x0000);
static_assert(offsetof(FNavSkeletonPolyline, PointIDs) == 0x0000);
static_assert(offsetof(FNavCostModifier, Kind) == 0x0000);
static_assert(offsetof(FNavCostModifier, Boundary) == 0x0014);
static_assert(offsetof(FNavCostModifier, AffectedPolyRefs) == 0x0030);
static_assert(offsetof(FSoAStorage, Offsets) == 0x0000);
static_assert(offsetof(FPortalEdgeStorage, Items) == 0x0010);
static_assert(offsetof(FUInt64Storage, Items) == 0x0010);
static_assert(offsetof(FInt32Storage, Items) == 0x0010);
static_assert(offsetof(FNavLinkInfo, LinkType) == 0x0003);
static_assert(offsetof(FAICandidateStandPosition, Location) == 0x0004);
static_assert(offsetof(FAIGrassOctreeData, Location) == 0x0004);
static_assert(offsetof(FAINearGrassBounds, Center) == 0x0000);
static_assert(offsetof(FAINearGrassBounds, GrassIndexs) == 0x0010);
static_assert(offsetof(FAIGrassClusterInfo, Bounds) == 0x0000);
static_assert(offsetof(FAIGrassClusterInfo, BoxList) == 0x0020);
static_assert(offsetof(FAIGrassGrayBMP, Colors) == 0x0008);
static_assert(offsetof(FAIGrassGrayBMP, ZeroPoint) == 0x0018);
static_assert(offsetof(FAIGrassGrayBMP, OriginBoundBox) == 0x0034);
static_assert(offsetof(FAIGrassEditorBlock, StaticMesh) == 0x0078);
static_assert(offsetof(FNPCAISceneEventInfo, eventId) == 0x0004);
static_assert(offsetof(FNPCAISceneEventInfo, TriggerLocation) == 0x0014);
static_assert(offsetof(FNPCAISceneEventInfo, AIIDs) == 0x0020);
static_assert(offsetof(FNPCAISceneEventInfo, AIPathGroupIDs) == 0x0030);
static_assert(offsetof(FNPCAISceneEventTableRow, eventId) == 0x0008);
static_assert(offsetof(FNPCAISceneEventTableRow, AIIDs) == 0x0018);
static_assert(offsetof(FNPCAISceneEventTableRow, PathGroupIDs) == 0x0028);
static_assert(offsetof(FNPCAISceneEventTableRow, Comments) == 0x0038);
static_assert(offsetof(FAITrackLOGTemplateForDataTable, LogType) == 0x0008);
static_assert(offsetof(FAITrackLOGTemplateForDataTable, Template) == 0x0010);
static_assert(offsetof(FAIDebugLineStruct, StartLocation) == 0x0004);
static_assert(offsetof(FAIDebugLineStruct, EndLocation) == 0x0010);
static_assert(offsetof(FAIDebugLineStruct, Color) == 0x001C);
static_assert(offsetof(FAIDebugDrawSphereInfo, Loc) == 0x0000);
static_assert(offsetof(FAIDebugDrawSphereInfo, LineColor) == 0x0010);
static_assert(offsetof(FAIDebugDrawLineInfo, StartLoc) == 0x0000);
static_assert(offsetof(FAIDebugDrawLineInfo, EndLoc) == 0x000C);
static_assert(offsetof(FAIDebugDrawLineInfo, LineColor) == 0x0018);
static_assert(offsetof(FPMCAISpawnInfo_ForSearchPath, SourcePoint) == 0x0000);
static_assert(offsetof(FCheckCoverPointFinder, AIPawn) == 0x0000);
static_assert(offsetof(FCheckCoverPointFinder, Elements) == 0x0018);
static_assert(offsetof(FAICoverPointInfo, OwnerActor) == 0x0008);
static_assert(offsetof(FAICoverPointInfo, Location) == 0x0010);
static_assert(offsetof(FAICoverPointInfo, ToWallVector) == 0x001C);
static_assert(offsetof(FAICoverPointInfo, ProtectedStance) == 0x0028);
static_assert(offsetof(FAICoverPointInfo, FirePosition) == 0x0030);
static_assert(offsetof(FAICoverPointInfo, FireStance) == 0x003C);
static_assert(offsetof(FAICoverPointInfo, TiltType) == 0x003D);
static_assert(offsetof(FAIIDSegInfo, MainCategory) == 0x0000);
static_assert(offsetof(FAIIDSegInfo, Career) == 0x0010);
static_assert(offsetof(FAIIDSegInfo, Tendency) == 0x0020);
static_assert(offsetof(FAIIDSegInfo, Difficulty) == 0x0030);
static_assert(offsetof(FNPCAIRollDecisionStruct, Decision) == 0x0008);
static_assert(offsetof(FNPCAIFireSetting, Location) == 0x0000);
static_assert(offsetof(FNPCAIFireSetting, EnemyTarget) == 0x0010);
static_assert(offsetof(FNPCAIFireSetting, ShootPartID) == 0x0023);
static_assert(offsetof(FNPCAIFireSetting, LastShootPartID) == 0x0024);
static_assert(offsetof(FNPCAIFireSetting, LastFireLocation) == 0x002C);
static_assert(offsetof(FNPCAIFireSetting, EnemyInfo) == 0x0038);
static_assert(offsetof(FNPCAIFireOrder, FirePoint) == 0x0004);
static_assert(offsetof(FNPCAIFireOrder, HitPart) == 0x0010);
static_assert(offsetof(FAIBodyPartVisibilityInfo, BodyPartType) == 0x0000);
static_assert(offsetof(FAIBodyPartVisibilityInfo, Barrier) == 0x0010);
static_assert(offsetof(FAIBodyPartHitInfo, BodyPartType) == 0x0000);
static_assert(offsetof(FAIVisibleResult, Barrier) == 0x0008);
