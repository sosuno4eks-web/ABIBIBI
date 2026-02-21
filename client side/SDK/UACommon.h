
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: AkAudio
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: GameplayTags
/// dependency: Paper2D
/// dependency: SGFramework
/// dependency: SlateCore
/// dependency: UADataTableModule
/// dependency: UMG

/// Enum /Script/UACommon.EDownloadFileState
/// Size: 0x01 (1 bytes)
enum class EDownloadFileState : uint8_t
{
	EDownloadFileState__DownloadFileState_None                                       = 0,
	EDownloadFileState__DownloadFileState_Failed                                     = 1,
	EDownloadFileState__DownloadFileState_Head                                       = 2,
	EDownloadFileState__DownloadFileState_Progress                                   = 3,
	EDownloadFileState__DownloadFileState_Paused                                     = 4,
	EDownloadFileState__DownloadFileState_Completed                                  = 5
};

/// Enum /Script/UACommon.ELevelDifficult
/// Size: 0x01 (1 bytes)
enum class ELevelDifficult : uint8_t
{
	ELevelDifficult__Standard                                                        = 0,
	ELevelDifficult__Block                                                           = 1,
	ELevelDifficult__Fertile                                                         = 2
};

/// Enum /Script/UACommon.ERookieTipType
/// Size: 0x01 (1 bytes)
enum class ERookieTipType : uint8_t
{
	ERookieTipType__Quest                                                            = 0,
	ERookieTipType__Dialogue                                                         = 1,
	ERookieTipType__Message                                                          = 2,
	ERookieTipType__FacePaint                                                        = 3
};

/// Enum /Script/UACommon.ELoosePointType
/// Size: 0x01 (1 bytes)
enum class ELoosePointType : uint8_t
{
	ELoosePointType__Custom                                                          = 0,
	ELoosePointType__Food_Common                                                     = 1,
	ELoosePointType__Tools_Common                                                    = 2,
	ELoosePointType__Drink_Common                                                    = 3,
	ELoosePointType__Device_Common                                                   = 4,
	ELoosePointType__Wealth_Common                                                   = 5,
	ELoosePointType__Combustibles_Common                                             = 6,
	ELoosePointType__Electronic_Common                                               = 7,
	ELoosePointType__Ammo_Lv1                                                        = 8,
	ELoosePointType__Ammo_Lv2                                                        = 9,
	ELoosePointType__Ammo_Lv3                                                        = 10,
	ELoosePointType__Ammo_Lv4                                                        = 11,
	ELoosePointType__Ammo_Lv5                                                        = 12,
	ELoosePointType__Ammo_Lv6                                                        = 13,
	ELoosePointType__Throwable_Common                                                = 14,
	ELoosePointType__Med_Common                                                      = 15,
	ELoosePointType__Key                                                             = 16,
	ELoosePointType__Money                                                           = 17,
	ELoosePointType__Attacking                                                       = 18
};

/// Enum /Script/UACommon.EUAPlayerSignEnum
/// Size: 0x01 (1 bytes)
enum class EUAPlayerSignEnum : uint8_t
{
	EUAPlayerSignEnum__None                                                          = 0,
	EUAPlayerSignEnum__EnemySign                                                     = 1,
	EUAPlayerSignEnum__LootSign                                                      = 2,
	EUAPlayerSignEnum__CommonSign                                                    = 3
};

/// Enum /Script/UACommon.EGamePadEffectTable
/// Size: 0x01 (1 bytes)
enum class EGamePadEffectTable : uint8_t
{
	EGamePadEffectTable__None                                                        = 0,
	EGamePadEffectTable__GamePadView_Fire                                            = 1,
	EGamePadEffectTable__GamePadView_LeftFire                                        = 2,
	EGamePadEffectTable__GamePadView_ChangeClip                                      = 3,
	EGamePadEffectTable__GamePadView_Crouch                                          = 4,
	EGamePadEffectTable__GamePadView_Prone                                           = 5,
	EGamePadEffectTable__GamePadView_Jump                                            = 6,
	EGamePadEffectTable__F_Guide_Lefthand                                            = 7,
	EGamePadEffectTable__F_Guide_Righthand                                           = 8,
	EGamePadEffectTable__GamePadView_ADS                                             = 9,
	EGamePadEffectTable__GamePadView_Bag                                             = 10,
	EGamePadEffectTable__GamePadView_Bigmap                                          = 11,
	EGamePadEffectTable__GamePadView_Loot                                            = 12,
	EGamePadEffectTable__GamePadView_CloseBagEffect                                  = 13,
	EGamePadEffectTable__GamePadView_SwitchGenerade                                  = 14,
	EGamePadEffectTable__GamePadView_TutorialAMagazine                               = 15,
	EGamePadEffectTable__GamePadView_TutorialAAmmo                                   = 16,
	EGamePadEffectTable__GamePadView_VestBagPageEffet                                = 17,
	EGamePadEffectTable__GamePadView_BagPageEffet                                    = 18,
	EGamePadEffectTable__GamePadView_HealthPageEffet                                 = 19,
	EGamePadEffectTable__GamePadView_CorpseBagPageEffet                              = 20,
	EGamePadEffectTable__GamePadView_DragAmmoEffect                                  = 21,
	EGamePadEffectTable__GamePadView_CorpseBagSearchEffect                           = 22,
	EGamePadEffectTable__GamePadView_Drag_MedFromCorpseBag                           = 23,
	EGamePadEffectTable__GamePadView_Drag_MedToLeg                                   = 24,
	EGamePadEffectTable__GamePadView_Drag_KeyToPocket                                = 25,
	EGamePadEffectTable__GamePadView_EscaapePoint                                    = 26,
	EGamePadEffectTable__GamePadView_SilentMove                                      = 27,
	EGamePadEffectTable__GamePadView_LegEffect                                       = 28,
	EGamePadEffectTable__GamePadView_CloseMapEffect                                  = 29,
	EGamePadEffectTable__GamePadView_WeaponCheck_Effect                              = 30,
	EGamePadEffectTable__GamePadView_FastRun_Effect                                  = 31,
	EGamePadEffectTable__GamePadView_CorpseMedItemEffect                             = 32,
	EGamePadEffectTable__GamePadView_MedinBagEffect                                  = 33,
	EGamePadEffectTable__GamePadView_FakeMapEffect                                   = 34,
	EGamePadEffectTable__GamePadView_ItemSearch_Effect                               = 35,
	EGamePadEffectTable__GamePadView_FakeMap_PlayerIcon_Effect                       = 36,
	EGamePadEffectTable__GamePadView_FakeMap_CaptainIcon_Effect                      = 37,
	EGamePadEffectTable__GamePadView_FakeMap_BlockSymble_Effect                      = 38,
	EGamePadEffectTable__GamePadView_FakeMap_EscapePoints_Effect                     = 39,
	EGamePadEffectTable__GamePadView_FakeMap_EscapeRoute_Effect                      = 40,
	EGamePadEffectTable__GamePadView_FakeMap_CloseButton_Effect                      = 41,
	EGamePadEffectTable__GamePadView_TutorialBMedItemEffect                          = 42,
	EGamePadEffectTable__GamePadView_TutorialBMedItemtobagGrid1Effect                = 43,
	EGamePadEffectTable__GamePadView_TutorialKeytoPocketEffect                       = 44,
	EGamePadEffectTable__GamePadView_TutorialPocketPageEffect                        = 45,
	EGamePadEffectTable__GamePadView_TutorialOpenDoorEffect                          = 46,
	EGamePadEffectTable__GamePadView_TutorialLootBoxGrid1Effect                      = 47,
	EGamePadEffectTable__GamePadView_Setting_Effect                                  = 48,
	EGamePadEffectTable__GamePadView_DebuffInfo_Effect                               = 49,
	EGamePadEffectTable__GamePadView_ItemQuickUse_Effect                             = 50,
	EGamePadEffectTable__GamePadView_PrimaryWeapon_Effect                            = 51,
	EGamePadEffectTable__GamePadView_SecondaryWeapon_Effect                          = 52,
	EGamePadEffectTable__GamePadView_VestArmor_Effect                                = 53,
	EGamePadEffectTable__GamePadView_Helmet_Effect                                   = 54,
	EGamePadEffectTable__GamePadView_VestIcon_Effect                                 = 55,
	EGamePadEffectTable__GamePadView_Pocket1_Effect                                  = 56,
	EGamePadEffectTable__GamePadView_CorpseVestArmor_Effect                          = 57,
	EGamePadEffectTable__GamePadView_CorpseHelmet_Effect                             = 58,
	EGamePadEffectTable__GamePadView_CorpseVestTab_Effect                            = 59,
	EGamePadEffectTable__GamePadView_CorpseVestSearch_Effect                         = 60,
	EGamePadEffectTable__GamePadView_CorpsePocketSearch_Effect                       = 61,
	EGamePadEffectTable__GamePadView_CorpseVestIcon_Effect                           = 62,
	EGamePadEffectTable__GamePadView_CorpsePocket1_Effect                            = 63,
	EGamePadEffectTable__GamePadView_LifeState_Effect                                = 64,
	EGamePadEffectTable__GamePadView_Tab_Safebox_Effect                              = 65,
	EGamePadEffectTable__GamePadView_Safebox_Effect                                  = 66,
	EGamePadEffectTable__GamePadView_Loot_Bag_Icon_Effect                            = 67,
	EGamePadEffectTable__GamePadView_Bag_Icon_Effect                                 = 68,
	EGamePadEffectTable__GamePadView_VoiceInstructions                               = 69,
	EGamePadEffectTable__GamePadView_CorpseVase                                      = 70,
	EGamePadEffectTable__GamePadView_ChangeMagaZineAnim_Effect                       = 71,
	EGamePadEffectTable__GamePadView_TutorialMag                                     = 72,
	EGamePadEffectTable__GamePadView_TutorialPushBullet                              = 73,
	EGamePadEffectTable__GamePadView_ChangeAmmoAnim_Effect                           = 74,
	EGamePadEffectTable__GamePadView_PlayerSecondaryWeaponEffect                     = 75,
	EGamePadEffectTable__GamePadView_Loot_PistolEffect                               = 76,
	EGamePadEffectTable__GamePadView_PistolEffect                                    = 77,
	EGamePadEffectTable__FirstLootInventoryEffect                                    = 78,
	EGamePadEffectTable__LootViewButtonEffect                                        = 79,
	EGamePadEffectTable__GamePadView_PickButton_Effect                               = 80,
	EGamePadEffectTable__GamePadView_GoldenLoot_Effect                               = 81,
	EGamePadEffectTable__GamePadView_FirstLootPick_Effect                            = 82,
	EGamePadEffectTable__GamePadView_GoldenInspect_Effect                            = 83,
	EGamePadEffectTable__SecondLootInventoryEffect                                   = 84,
	EGamePadEffectTable__FirstBagInventoryEffect                                     = 85,
	EGamePadEffectTable__SecondBagInventoryEffect                                    = 86,
	EGamePadEffectTable__FirstDeathBoxGunEffect                                      = 87,
	EGamePadEffectTable__SecondhudMarkMapEffect                                      = 88,
	EGamePadEffectTable__GamePadView_GUNLOOTDeathboxEffect                           = 89,
	EGamePadEffectTable__ArmorLOOTDeathboxEffect                                     = 90,
	EGamePadEffectTable__ManualLOOTEffect                                            = 91,
	EGamePadEffectTable__Mask_ArmorClickSelfEffect                                   = 92,
	EGamePadEffectTable__ArmorReplaceEffect                                          = 93,
	EGamePadEffectTable__Overseas_ArmorLOOTDeathboxEffect                            = 94,
	EGamePadEffectTable__Overseas_FirstDeathBoxGunEffect                             = 95,
	EGamePadEffectTable__Overseas_GUNLOOTDeathboxEffect                              = 96
};

/// Enum /Script/UACommon.EUAGamePadHightWidgetTable
/// Size: 0x01 (1 bytes)
enum class EUAGamePadHightWidgetTable : uint8_t
{
	EUAGamePadHightWidgetTable__None                                                 = 0,
	EUAGamePadHightWidgetTable__GuideCircle                                          = 1,
	EUAGamePadHightWidgetTable__GuideCircle3                                         = 2,
	EUAGamePadHightWidgetTable__GuideCircle4                                         = 3
};

/// Enum /Script/UACommon.EUAGamePadTable
/// Size: 0x01 (1 bytes)
enum class EUAGamePadTable : uint8_t
{
	EUAGamePadTable__None                                                            = 0,
	EUAGamePadTable__GamePadView_ADS                                                 = 1,
	EUAGamePadTable__GamePadView_Bag                                                 = 2,
	EUAGamePadTable__GamePadView_BigMap                                              = 3,
	EUAGamePadTable__GamePadView_ChangeClip                                          = 4,
	EUAGamePadTable__GamePadView_Crouch                                              = 5,
	EUAGamePadTable__GamePadView_Fire                                                = 6,
	EUAGamePadTable__GamePadView_Jump                                                = 7,
	EUAGamePadTable__GamePadView_LeftFire                                            = 8,
	EUAGamePadTable__GamePadView_Movement                                            = 9,
	EUAGamePadTable__GamePadView_Prone                                               = 10,
	EUAGamePadTable__GamePadView_Quietstep                                           = 11,
	EUAGamePadTable__GamePadView_Sprint                                              = 12,
	EUAGamePadTable__GamePadView_ItemSearch                                          = 13,
	EUAGamePadTable__GamePadView_LifeState                                           = 14,
	EUAGamePadTable__GamePadView_UseProgress                                         = 15,
	EUAGamePadTable__GamePadView_WeaponUse                                           = 16,
	EUAGamePadTable__GamePadView_DoorInteraction                                     = 17,
	EUAGamePadTable__GamePadView_ThrowCancel                                         = 18,
	EUAGamePadTable__GamePadView_SelectGrenade                                       = 19,
	EUAGamePadTable__GamePadView_QuickUseItem                                        = 20,
	EUAGamePadTable__BP_PCHUDWidget_DirectionalBar                                   = 21,
	EUAGamePadTable__GamePadView_WeaponCheck                                         = 22,
	EUAGamePadTable__GamePadView_CheckWeaponTxt                                      = 23,
	EUAGamePadTable__BPFX_Pain                                                       = 24,
	EUAGamePadTable__DoorInteraction                                                 = 25,
	EUAGamePadTable__BP_GamePadView_LockMove                                         = 26,
	EUAGamePadTable__BP_GameID                                                       = 27,
	EUAGamePadTable__BPFX_DropOfBlood                                                = 28,
	EUAGamePadTable__BPFX_Bullet_Hit                                                 = 29,
	EUAGamePadTable__BP_GamePadView_EnergyProgress                                   = 30,
	EUAGamePadTable__BPFX_Clear                                                      = 31,
	EUAGamePadTable__BPFX_Bleed                                                      = 32,
	EUAGamePadTable__GamePadView_Chat                                                = 33,
	EUAGamePadTable__BP_GamePadView_Collimator                                       = 34,
	EUAGamePadTable__BP_GamePadView_Magnitude                                        = 35,
	EUAGamePadTable__GamePadView_CustomInteractContainer                             = 36,
	EUAGamePadTable__BPFX_SmokeBomb                                                  = 37,
	EUAGamePadTable__BPFX_ArticuloMortis                                             = 38,
	EUAGamePadTable__BP_GamePadView_DBNOHealth                                       = 39,
	EUAGamePadTable__BP_GamePadView_RescueInteraction                                = 40,
	EUAGamePadTable__GamePadView_LeanL                                               = 41,
	EUAGamePadTable__GamePadView_LeanR                                               = 42,
	EUAGamePadTable__GamePadView_GetInventory                                        = 43,
	EUAGamePadTable__GamePadView_LootInventory                                       = 44,
	EUAGamePadTable__DoorInteractionTips                                             = 45,
	EUAGamePadTable__BPFX_Flash_Effect                                               = 46,
	EUAGamePadTable__GamePadView_Voice_Intercom                                      = 47,
	EUAGamePadTable__GamePadView_Voice_Reception                                     = 48,
	EUAGamePadTable__BP_GamePadView_LaserSwitch                                      = 50,
	EUAGamePadTable__BPFX_LackInSupplies                                             = 51,
	EUAGamePadTable__SoundIndicatorV2                                                = 52,
	EUAGamePadTable__GamePadView_QuestTrackCountDown                                 = 53,
	EUAGamePadTable__BP_SelfSoundIndicator                                           = 54,
	EUAGamePadTable__GamePadView_ChatHint                                            = 55,
	EUAGamePadTable__BPFX_FaceShield                                                 = 56,
	EUAGamePadTable__BP_GamePadView_ThermalSwitch                                    = 57,
	EUAGamePadTable__Temp                                                            = 58,
	EUAGamePadTable__Temp2                                                           = 59,
	EUAGamePadTable__BP_MainHud_WeaponSlotMain_First                                 = 60,
	EUAGamePadTable__BP_MainHud_WeaponSlotMain_Second                                = 61,
	EUAGamePadTable__BP_MainHud_WeaponSlot_AssisMelee                                = 62,
	EUAGamePadTable__GamePadView_PullBolt                                            = 63
};

/// Enum /Script/UACommon.EUAHUDPreInstallLoc
/// Size: 0x01 (1 bytes)
enum class EUAHUDPreInstallLoc : uint8_t
{
	EUAHUDPreInstallLoc__None                                                        = 0,
	EUAHUDPreInstallLoc__Tips_Panel_Right                                            = 1,
	EUAHUDPreInstallLoc__dialogBox_Bottom                                            = 2,
	EUAHUDPreInstallLoc__Objective_Panel                                             = 3,
	EUAHUDPreInstallLoc__Suggestive_Panel_Left                                       = 4,
	EUAHUDPreInstallLoc__WarnMessage_Panel                                           = 5,
	EUAHUDPreInstallLoc__LightTips_Panel                                             = 6,
	EUAHUDPreInstallLoc__Activity_Phase_Panel                                        = 7,
	EUAHUDPreInstallLoc__Quest_Panel                                                 = 8,
	EUAHUDPreInstallLoc__RouletteTips_Panel                                          = 9
};

/// Enum /Script/UACommon.EUAArgResolveMethod
/// Size: 0x01 (1 bytes)
enum class EUAArgResolveMethod : uint8_t
{
	EUAArgResolveMethod__None                                                        = 0,
	EUAArgResolveMethod__Inventory                                                   = 1,
	EUAArgResolveMethod__Volume                                                      = 2,
	EUAArgResolveMethod__EnvDamage                                                   = 3,
	EUAArgResolveMethod__LootBox                                                     = 4
};

/// Enum /Script/UACommon.EUAStatisParamFilterType
/// Size: 0x01 (1 bytes)
enum class EUAStatisParamFilterType : uint8_t
{
	EUAStatisParamFilterType__None                                                   = 0,
	EUAStatisParamFilterType__Equal                                                  = 1,
	EUAStatisParamFilterType__GreaterEqual                                           = 2,
	EUAStatisParamFilterType__LessEqual                                              = 3,
	EUAStatisParamFilterType__Between                                                = 4,
	EUAStatisParamFilterType__FixLenNumDivideIn                                      = 5,
	EUAStatisParamFilterType__FixLenNumDivideNotIn                                   = 6,
	EUAStatisParamFilterType__EqualArray                                             = 7
};

/// Enum /Script/UACommon.EUAStatisMethod
/// Size: 0x01 (1 bytes)
enum class EUAStatisMethod : uint8_t
{
	EUAStatisMethod__SumValue                                                        = 0,
	EUAStatisMethod__Max                                                             = 1,
	EUAStatisMethod__Min                                                             = 2,
	EUAStatisMethod__LastValue                                                       = 3,
	EUAStatisMethod__SumCount                                                        = 4
};

/// Class /Script/UACommon.AsyncTaskCopyFile
/// Size: 0x0010 (16 bytes) (0x000030 - 0x000040) align 8 pad: 0x0000
class UAsyncTaskCopyFile : public UBlueprintAsyncActionBase
{ 
public:
	SDK_UNDEFINED(16,2258) /* FMulticastInlineDelegate */ __um(OnCompleted);                                       // 0x0030   (0x0010)  


	/// Functions
	// Function /Script/UACommon.AsyncTaskCopyFile.CopyFileDelegate__DelegateSignature
	// void CopyFileDelegate__DelegateSignature(FString TargetPath, bool InResult);                                             // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/UACommon.AsyncTaskCopyFile.CopyFile
	// class UAsyncTaskCopyFile* CopyFile(FString InSource, FString InDest, bool InPhysical);                                   // [0x3243d50] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/UACommon.AsyncTaskDownloadFile
/// Size: 0x00A8 (168 bytes) (0x000030 - 0x0000D8) align 8 pad: 0x0000
class UAsyncTaskDownloadFile : public UBlueprintAsyncActionBase
{ 
public:
	SDK_UNDEFINED(16,2259) /* FMulticastInlineDelegate */ __um(DownloadFileDelegate);                              // 0x0030   (0x0010)  
	unsigned char                                      UnknownData00_7[0x98];                                      // 0x0040   (0x0098)  MISSED


	/// Functions
	// Function /Script/UACommon.AsyncTaskDownloadFile.StartDownload
	// bool StartDownload();                                                                                                    // [0x3246390] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.AsyncTaskDownloadFile.SetFileTotalSize
	// void SetFileTotalSize(int32_t InFileSize);                                                                               // [0x3246190] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.AsyncTaskDownloadFile.ResumeTask
	// bool ResumeTask();                                                                                                       // [0x3245fe0] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.AsyncTaskDownloadFile.RequestFileHead
	// void RequestFileHead(bool InDownloadOnSucceed);                                                                          // [0x3245f50] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.AsyncTaskDownloadFile.PauseTask
	// bool PauseTask();                                                                                                        // [0x3245ef0] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.AsyncTaskDownloadFile.GetTaskState
	// EDownloadFileState GetTaskState();                                                                                       // [0x3245ac0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UACommon.AsyncTaskDownloadFile.GetLastHttpCode
	// int32_t GetLastHttpCode();                                                                                               // [0x32453f0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UACommon.AsyncTaskDownloadFile.GetFileURL
	// FString GetFileURL();                                                                                                    // [0x3245080] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UACommon.AsyncTaskDownloadFile.GetFileTotalSize
	// int32_t GetFileTotalSize();                                                                                              // [0x19821d0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UACommon.AsyncTaskDownloadFile.GetFileName
	// FString GetFileName(bool bFullPath);                                                                                     // [0x3244ed0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UACommon.AsyncTaskDownloadFile.GetDownloadedSize
	// int32_t GetDownloadedSize();                                                                                             // [0x3244d40] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UACommon.AsyncTaskDownloadFile.GetCurrentSize
	// int32_t GetCurrentSize();                                                                                                // [0x3244cf0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UACommon.AsyncTaskDownloadFile.DownloadFileDelegate__DelegateSignature
	// void DownloadFileDelegate__DelegateSignature(class UAsyncTaskDownloadFile* InObj, EDownloadFileState InEventID);         // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/UACommon.AsyncTaskDownloadFile.CreateDownloadFileTask
	// class UAsyncTaskDownloadFile* CreateDownloadFileTask(FString URL, FString FileDirectory, bool InOverride);               // [0x32441b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.AsyncTaskDownloadFile.CancelTask
	// bool CancelTask();                                                                                                       // [0x3243c00] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/UACommon.BFLPlatformFile
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UBFLPlatformFile : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/UACommon.BFLPlatformFile.UnmountPak
	// bool UnmountPak(FString InPakFile);                                                                                      // [0x3246660] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.StatDirectorySize_Physical
	// int32_t StatDirectorySize_Physical(FString InDirectory, bool InWithSubDir, FString InExtName);                           // [0x3246510] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.StatDirectorySize
	// int32_t StatDirectorySize(FString InDirectory, bool InWithSubDir, FString InExtName);                                    // [0x32463c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.SortStringArray
	// TArray<FString> SortStringArray(TArray<FString>& InVal, bool InReversed);                                                // [0x3246220] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.SaveStringToFile
	// bool SaveStringToFile(FString inString, FString InFilePath);                                                             // [0x3246010] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.ReloadAssetRegistry
	// int32_t ReloadAssetRegistry();                                                                                           // [0x3245f20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.MoveFile
	// bool MoveFile(FString InSourceFile, FString InDestFile);                                                                 // [0x3245de0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.MountPak
	// bool MountPak(FString InPakFile, int32_t InOrder, FString InMountPoint);                                                 // [0x3245ca0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.LoadFileToStringArray
	// TArray<FString> LoadFileToStringArray(FString InFilePath);                                                               // [0x3245ae0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.LoadFileToString_Physical
	// FString LoadFileToString_Physical(FString InFilePath);                                                                   // [0x3245bc0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.LoadFileToString
	// FString LoadFileToString(FString InFilePath);                                                                            // [0x1a34fd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.GetStringFromIni
	// FString GetStringFromIni(FString InSection, FString InKey, FString InIniName);                                           // [0x3245930] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.GetStringArrayFromIni
	// TArray<FString> GetStringArrayFromIni(FString InSection, FString InKey, FString InIniName);                              // [0x32457a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.GetShaderProgramBinaryPath
	// FString GetShaderProgramBinaryPath();                                                                                    // [0x3245720] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.GetProjectPathForExternalAppForWrite
	// FString GetProjectPathForExternalAppForWrite();                                                                          // [0x32456a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.GetPath
	// FString GetPath(FString InFilename);                                                                                     // [0x3245570] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.GetMountedPakFilenames
	// TArray<FString> GetMountedPakFilenames();                                                                                // [0x32454f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.GetMountedFilesInPak
	// TArray<FString> GetMountedFilesInPak(FString InPakFile);                                                                 // [0x3245410] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.GetIntFromIni
	// int32_t GetIntFromIni(FString InSection, FString InKey, FString InIniName);                                              // [0x32452a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.GetInstalledAPKPath
	// FString GetInstalledAPKPath();                                                                                           // [0x16b5450] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.GetGraphicsRHI
	// FString GetGraphicsRHI();                                                                                                // [0x3245220] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.GetGlobalIniFlePath
	// FString GetGlobalIniFlePath(FString InIniName);                                                                          // [0x3245140] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.GetFileBaseName
	// FString GetFileBaseName(FString InFilename, bool InWithExt);                                                             // [0x3244d60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.GetDiskFreeSpace
	// int64_t GetDiskFreeSpace();                                                                                              // [0x3244d10] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.FindFiles_Physical
	// TArray<FString> FindFiles_Physical(FString InDirectory, FString InExtName, bool IncludeSubDir);                          // [0x3244b70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.FindFiles
	// TArray<FString> FindFiles(FString InDirectory, FString InExtName, bool IncludeSubDir);                                   // [0x32449f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.FileSize_Physical
	// int32_t FileSize_Physical(FString InFilePath);                                                                           // [0x3244950] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.FileSize
	// int32_t FileSize(FString InFilePath);                                                                                    // [0x32448b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.FileExists_Physical
	// bool FileExists_Physical(FString InFilePath);                                                                            // [0x3244810] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.FileExists
	// bool FileExists(FString InFilePath);                                                                                     // [0x1a34300] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.DumpIni
	// TArray<FString> DumpIni(FString InIniName);                                                                              // [0x3244730] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.DirectoryExists_Physical
	// bool DirectoryExists_Physical(FString InDirectory);                                                                      // [0x3244690] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.DirectoryExists
	// bool DirectoryExists(FString InDirectory);                                                                               // [0x1a33ff0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.DeleteFilesbyType
	// int32_t DeleteFilesbyType(FString InDir, FString InType, bool InIncludeSub);                                             // [0x3244550] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.DeleteFile
	// bool DeleteFile(FString InFilePath);                                                                                     // [0x32444b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.DeleteDirectoryTree
	// bool DeleteDirectoryTree(FString InDirectory);                                                                           // [0x3244410] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.DeleteDirectory
	// bool DeleteDirectory(FString InDirectory);                                                                               // [0x3244370] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.CreateDirectoryTree
	// bool CreateDirectoryTree(FString InDirectory);                                                                           // [0x3244110] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.CreateDirectory
	// bool CreateDirectory(FString InInDirectory);                                                                             // [0x3244070] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.CopyFile_Physical
	// bool CopyFile_Physical(FString InSourceFile, FString InDestFile);                                                        // [0x3243f80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.CopyFile
	// bool CopyFile(FString InSourceFile, FString InDestFile);                                                                 // [0x3243e90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.ComputeStringMD5
	// FString ComputeStringMD5(FString inString, bool InLowerResult);                                                          // [0x3243c30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.BFLPlatformFile.CheckAndroidRooted
	// int32_t CheckAndroidRooted();                                                                                            // [0x1990a20] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/UACommon.CAButtonWidget
/// Size: 0x0018 (24 bytes) (0x000288 - 0x0002A0) align 8 pad: 0x0000
class UCAButtonWidget : public UUserWidget
{ 
public:
	SDK_UNDEFINED(16,2260) /* FMulticastInlineDelegate */ __um(OnClicked);                                         // 0x0288   (0x0010)  
	class UButton*                                     _button;                                                    // 0x0298   (0x0008)  


	/// Functions
	// Function /Script/UACommon.CAButtonWidget.SetButton
	// void SetButton(class UButton* Btn);                                                                                      // [0x3246100] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.CAButtonWidget.OnButtonClick
	// void OnButtonClick();                                                                                                    // [0x3245ed0] Final|Native|Public  
};

/// Class /Script/UACommon.CACustomFixedBorder
/// Size: 0x0010 (16 bytes) (0x000268 - 0x000278) align 8 pad: 0x0000
class UCACustomFixedBorder : public UImage
{ 
public:
	int32_t                                            LeftSize;                                                   // 0x0268   (0x0004)  
	int32_t                                            RightSize;                                                  // 0x026C   (0x0004)  
	int32_t                                            TopSize;                                                    // 0x0270   (0x0004)  
	int32_t                                            BottomSize;                                                 // 0x0274   (0x0004)  
};

/// Class /Script/UACommon.CAImage
/// Size: 0x0010 (16 bytes) (0x000268 - 0x000278) align 8 pad: 0x0000
class UCAImage : public UImage
{ 
public:
	class UMaterialInterface*                          TemplateMaterail;                                           // 0x0268   (0x0008)  
	class UMaterialInstanceDynamic*                    DynamicTemplateMaterial;                                    // 0x0270   (0x0008)  


	/// Functions
	// Function /Script/UACommon.CAImage.SetTemplateMaterail
	// void SetTemplateMaterail(class UMaterialInterface* Material);                                                            // [0x324c2f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.CAImage.GetTemplateMaterail
	// class UMaterialInstanceDynamic* GetTemplateMaterail();                                                                   // [0x3249c80] Final|Native|Public  
};

/// Class /Script/UACommon.CASearchableComboBoxString
/// Size: 0x0D98 (3480 bytes) (0x000128 - 0x000EC0) align 8 pad: 0x0000
class UCASearchableComboBoxString : public UWidget
{ 
public:
	TArray<FString>                                    DefaultOptions;                                             // 0x0128   (0x0010)  
	FString                                            SelectedOption;                                             // 0x0138   (0x0010)  
	FComboBoxStyle                                     WidgetStyle;                                                // 0x0148   (0x0420)  
	FTableRowStyle                                     ItemStyle;                                                  // 0x0568   (0x0838)  
	FMargin                                            ContentPadding;                                             // 0x0DA0   (0x0010)  
	float                                              MaxListHeight;                                              // 0x0DB0   (0x0004)  
	bool                                               HasDownArrow;                                               // 0x0DB4   (0x0001)  
	bool                                               EnableGamepadNavigationMode;                                // 0x0DB5   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x0DB6   (0x0002)  MISSED
	FSlateFontInfo                                     Font;                                                       // 0x0DB8   (0x0058)  
	FSlateColor                                        ForegroundColor;                                            // 0x0E10   (0x0028)  
	bool                                               bIsFocusable;                                               // 0x0E38   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0E39   (0x0003)  MISSED
	SDK_UNDEFINED(16,2261) /* FDelegateProperty */     __um(OnGenerateWidgetEvent);                                // 0x0E3C   (0x0010)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x0E4C   (0x0004)  MISSED
	SDK_UNDEFINED(16,2262) /* FMulticastInlineDelegate */ __um(OnSelectionChanged);                                // 0x0E50   (0x0010)  
	SDK_UNDEFINED(16,2263) /* FMulticastInlineDelegate */ __um(OnOpening);                                         // 0x0E60   (0x0010)  
	unsigned char                                      UnknownData03_7[0x50];                                      // 0x0E70   (0x0050)  MISSED


	/// Functions
	// Function /Script/UACommon.CASearchableComboBoxString.SetSelectedOption
	// void SetSelectedOption(FString Option);                                                                                  // [0x324c200] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.CASearchableComboBoxString.SetSelectedIndex
	// void SetSelectedIndex(int32_t Index);                                                                                    // [0x324c170] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.CASearchableComboBoxString.RemoveOption
	// bool RemoveOption(FString Option);                                                                                       // [0x324ae70] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.CASearchableComboBoxString.RefreshOptions
	// void RefreshOptions();                                                                                                   // [0x324ae50] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.CASearchableComboBoxString.OnSelectionChangedEvent__DelegateSignature
	// void OnSelectionChangedEvent__DelegateSignature(FString SelectedItem, TEnumAsByte<ESelectInfo> SelectionType);           // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/UACommon.CASearchableComboBoxString.OnOpeningEvent__DelegateSignature
	// void OnOpeningEvent__DelegateSignature();                                                                                // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/UACommon.CASearchableComboBoxString.IsOpen
	// bool IsOpen();                                                                                                           // [0x324a8a0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UACommon.CASearchableComboBoxString.GetSelectedOption
	// FString GetSelectedOption();                                                                                             // [0x3249c00] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UACommon.CASearchableComboBoxString.GetSelectedIndex
	// int32_t GetSelectedIndex();                                                                                              // [0x3249bd0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UACommon.CASearchableComboBoxString.GetOptionCount
	// int32_t GetOptionCount();                                                                                                // [0x3249af0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UACommon.CASearchableComboBoxString.GetOptionAtIndex
	// FString GetOptionAtIndex(int32_t Index);                                                                                 // [0x3249a10] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UACommon.CASearchableComboBoxString.FindOptionIndex
	// int32_t FindOptionIndex(FString Option);                                                                                 // [0x3249710] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UACommon.CASearchableComboBoxString.ClearSelection
	// void ClearSelection();                                                                                                   // [0x3249250] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.CASearchableComboBoxString.ClearOptions
	// void ClearOptions();                                                                                                     // [0x3249230] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.CASearchableComboBoxString.AddOption
	// void AddOption(FString Option);                                                                                          // [0x3249130] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/UACommon.GeoSensitiveWidget
/// Size: 0x0028 (40 bytes) (0x000288 - 0x0002B0) align 8 pad: 0x0000
class UGeoSensitiveWidget : public UUserWidget
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0288   (0x0008)  MISSED
	SDK_UNDEFINED(16,2264) /* FMulticastInlineDelegate */ __um(OnPaintSizeChange);                                 // 0x0290   (0x0010)  
	SDK_UNDEFINED(16,2265) /* FMulticastInlineDelegate */ __um(OnViewportSizeChange);                              // 0x02A0   (0x0010)  
};

/// Class /Script/UACommon.HttpTask
/// Size: 0x0068 (104 bytes) (0x000028 - 0x000090) align 8 pad: 0x0000
class UHttpTask : public UObject
{ 
public:
	SDK_UNDEFINED(16,2266) /* FMulticastInlineDelegate */ __um(HttpResponseDelegate);                              // 0x0028   (0x0010)  
	SDK_UNDEFINED(16,2267) /* FMulticastInlineDelegate */ __um(HttpGetResponseDelegate);                           // 0x0038   (0x0010)  
	SDK_UNDEFINED(16,2268) /* FMulticastInlineDelegate */ __um(HttpGetThirdPartyChannelsFriendListDelegate);       // 0x0048   (0x0010)  
	SDK_UNDEFINED(16,2269) /* FMulticastInlineDelegate */ __um(HttpGetSupperPlayerRedPoinStateDelegate);           // 0x0058   (0x0010)  
	FString                                            ScreenNotifyName;                                           // 0x0068   (0x0010)  
	FString                                            LuaNotifyName;                                              // 0x0078   (0x0010)  
	unsigned char                                      UnknownData00_7[0x8];                                       // 0x0088   (0x0008)  MISSED


	/// Functions
	// Function /Script/UACommon.HttpTask.StartSuperPlayerRedPointHttpGetTask
	// void StartSuperPlayerRedPointHttpGetTask(FString PipelineUrl);                                                           // [0x324c720] Final|Native|Public  
	// Function /Script/UACommon.HttpTask.StartHttpGetTask
	// void StartHttpGetTask(FString PipelineUrl);                                                                              // [0x324c630] Final|Native|Public  
	// Function /Script/UACommon.HttpTask.StartDevopsTask
	// void StartDevopsTask(FString PipelineUrl);                                                                               // [0x324c540] Final|Native|Public  
	// Function /Script/UACommon.HttpTask.StartCppvmDevopsTask
	// void StartCppvmDevopsTask(FString PipelineUrl);                                                                          // [0x324c450] Final|Native|Public  
	// Function /Script/UACommon.HttpTask.SendScreenTask
	// void SendScreenTask(FString NotifyName);                                                                                 // [0x324bed0] Final|Native|Public  
	// Function /Script/UACommon.HttpTask.SendScreenExtranetTask
	// void SendScreenExtranetTask(FString NotifyName);                                                                         // [0x324bde0] Final|Native|Public  
	// Function /Script/UACommon.HttpTask.SendProfileStat
	// void SendProfileStat(FString NotifyName);                                                                                // [0x324bb70] Final|Native|Public  
	// Function /Script/UACommon.HttpTask.SendMemReport
	// void SendMemReport(FString NotifyName);                                                                                  // [0x324ba80] Final|Native|Public  
	// Function /Script/UACommon.HttpTask.SendLogTask
	// void SendLogTask(FString NotifyName, FString URL, FString LogName);                                                      // [0x324b870] Final|Native|Public  
	// Function /Script/UACommon.HttpTask.SendLogReportLoginError
	// void SendLogReportLoginError(FString NotifyName, FString URL, FString LogName);                                          // [0x324b660] Final|Native|Public  
	// Function /Script/UACommon.HttpTask.SendLogExtranetTask
	// void SendLogExtranetTask(FString NotifyName, FString CosPath);                                                           // [0x324b4e0] Final|Native|Public  
	// Function /Script/UACommon.HttpTask.SendGCloudLogTask
	// void SendGCloudLogTask(FString NotifyName, FString URL, FString LogName);                                                // [0x324af40] Final|Native|Public  
	// Function /Script/UACommon.HttpTask.HttpUpLoadFileWithParams
	// bool HttpUpLoadFileWithParams(FString URL, FString FilePath, TMap<FString, FString> Params);                             // [0x324a620] Final|Native|Public  
	// Function /Script/UACommon.HttpTask.HttpUpLoadDelegate__DelegateSignature
	// void HttpUpLoadDelegate__DelegateSignature(FString RspContent);                                                          // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/UACommon.HttpTask.HttpPostRequest
	// void HttpPostRequest(FString URL, FString StrContent, FString AuthString);                                               // [0x324a410] Final|Native|Public  
	// Function /Script/UACommon.HttpTask.HttpPostLandun
	// void HttpPostLandun(FString URL);                                                                                        // [0x324a320] Final|Native|Public  
	// Function /Script/UACommon.HttpTask.HttpDownLoadLuaFile
	// void HttpDownLoadLuaFile(FString NotifyName, bool bFirstRequest);                                                        // [0x324a1f0] Final|Native|Public  
	// Function /Script/UACommon.HttpTask.HttpDownLoadDebugFile
	// void HttpDownLoadDebugFile(FString NotifyName);                                                                          // [0x324a100] Final|Native|Public  
	// Function /Script/UACommon.HttpTask.GetThirdPartyChannelsFriendList
	// void GetThirdPartyChannelsFriendList(FString InputChannelid, FString GameId, FString Os, FString Token, FString Openid); // [0x3249cb0] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.HttpTask.GetSaveLogDir
	// FString GetSaveLogDir();                                                                                                 // [0x3249b50] Final|Native|Static|Public 
	// Function /Script/UACommon.HttpTask.Get
	// class UHttpTask* Get();                                                                                                  // [0x32497c0] Final|Native|Static|Public 
	// Function /Script/UACommon.HttpTask.DownloadRTXPakPackage
	// void DownloadRTXPakPackage(FString RTX);                                                                                 // [0x32492a0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/UACommon.ImageLoader
/// Size: 0x0050 (80 bytes) (0x000028 - 0x000078) align 8 pad: 0x0000
class UImageLoader : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x10];                                      // 0x0028   (0x0010)  MISSED
	SDK_UNDEFINED(16,2270) /* FMulticastInlineDelegate */ __um(LoadCompleted);                                     // 0x0038   (0x0010)  
	SDK_UNDEFINED(16,2271) /* FMulticastInlineDelegate */ __um(LoadFailed);                                        // 0x0048   (0x0010)  
	class UTexture2DDynamic*                           Texture;                                                    // 0x0058   (0x0008)  
	unsigned char                                      UnknownData01_7[0x18];                                      // 0x0060   (0x0018)  MISSED


	/// Functions
	// Function /Script/UACommon.ImageLoader.OnImageLoadFailed__DelegateSignature
	// void OnImageLoadFailed__DelegateSignature();                                                                             // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/UACommon.ImageLoader.OnImageLoadCompleted__DelegateSignature
	// void OnImageLoadCompleted__DelegateSignature(class UTexture2DDynamic* Texture);                                          // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/UACommon.ImageLoader.LoadImageAsync
	// void LoadImageAsync(FString ImagePath);                                                                                  // [0x324abc0] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.ImageLoader.CreateImageLoader
	// class UImageLoader* CreateImageLoader();                                                                                 // [0x3249270] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.ImageLoader.ClearImageLoaderArray
	// void ClearImageLoaderArray();                                                                                            // [0x3249210] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.ImageLoader.Clear
	// void Clear();                                                                                                            // [0x32491f0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/UACommon.LaunchHelper
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class ULaunchHelper : public UObject
{ 
public:


	/// Functions
	// Function /Script/UACommon.LaunchHelper.LaunchURL
	// FString LaunchURL(FString InURL, FString InParam);                                                                       // [0x324aa80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.LaunchHelper.LaunchAndroidPackage
	// bool LaunchAndroidPackage(FString InPackageName, FString InParamName, FString InParamValue);                             // [0x324a930] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.LaunchHelper.IsAndroidPackageInstalled
	// bool IsAndroidPackageInstalled(FString InPackageName);                                                                   // [0x16b47c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.LaunchHelper.GotoAndroidAppStore
	// bool GotoAndroidAppStore(FString InStorePkgName, FString InUri);                                                         // [0x324a010] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.LaunchHelper.GetLaunchParam
	// FString GetLaunchParam(FString InKey);                                                                                   // [0x3249930] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/UACommon.LoopedPanel
/// Size: 0x0058 (88 bytes) (0x000150 - 0x0001A8) align 8 pad: 0x0000
class ULoopedPanel : public UCanvasPanel
{ 
public:
	int32_t                                            DefaultElementIndex;                                        // 0x0150   (0x0004)  
	int32_t                                            NextElementIndex;                                           // 0x0154   (0x0004)  
	FMargin                                            SlotPadding;                                                // 0x0158   (0x0010)  
	float                                              AnimTime;                                                   // 0x0168   (0x0004)  
	bool                                               EnableTouchEvent;                                           // 0x016C   (0x0001)  
	bool                                               bTestAnimation;                                             // 0x016D   (0x0001)  
	bool                                               bReverseAnim;                                               // 0x016E   (0x0001)  
	unsigned char                                      UnknownData00_6[0x1];                                       // 0x016F   (0x0001)  MISSED
	float                                              MinTouchDelta;                                              // 0x0170   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0174   (0x0004)  MISSED
	SDK_UNDEFINED(16,2272) /* FMulticastInlineDelegate */ __um(OnScrollEvent);                                     // 0x0178   (0x0010)  
	SDK_UNDEFINED(16,2273) /* FMulticastInlineDelegate */ __um(OnAnimEndEvent);                                    // 0x0188   (0x0010)  
	SDK_UNDEFINED(16,2274) /* FMulticastInlineDelegate */ __um(OnButtonClickedEvent);                              // 0x0198   (0x0010)  


	/// Functions
	// Function /Script/UACommon.LoopedPanel.SyncProperties
	// void SyncProperties();                                                                                                   // [0x324cb10] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.LoopedPanel.OnScrollEvent__DelegateSignature
	// void OnScrollEvent__DelegateSignature(float InValue);                                                                    // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/UACommon.LoopedPanel.OnAnimEndEvent__DelegateSignature
	// void OnAnimEndEvent__DelegateSignature(int32_t InValue);                                                                 // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/UACommon.LoopedPanel.MoveToPrevioudElement
	// void MoveToPrevioudElement(bool bUseAnim);                                                                               // [0x324adc0] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.LoopedPanel.MoveToNextElement
	// void MoveToNextElement(bool bUseAnim);                                                                                   // [0x324ad30] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.LoopedPanel.MoveToElementByIndex
	// void MoveToElementByIndex(int32_t InIndex, bool bUseAnim);                                                               // [0x324ac60] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.LoopedPanel.IsPlayAnim
	// bool IsPlayAnim();                                                                                                       // [0x324a8d0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UACommon.LoopedPanel.GetViewElementIndex
	// int32_t GetViewElementIndex();                                                                                           // [0x3249fe0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Struct /Script/UACommon.MapRuleConfig
/// Size: 0x000C (12 bytes) (0x000000 - 0x00000C) align 4 pad: 0x0000
struct FMapRuleConfig
{ 
	int32_t                                            RuleID;                                                     // 0x0000   (0x0004)  
	int32_t                                            MinCount;                                                   // 0x0004   (0x0004)  
	int32_t                                            MaxCount;                                                   // 0x0008   (0x0004)  
};

/// Class /Script/UACommon.LoosePointManager
/// Size: 0x0068 (104 bytes) (0x0002E0 - 0x000348) align 8 pad: 0x0000
class ALoosePointManager : public AActor
{ 
public:
	class UDataTable*                                  LoosePointMapMessageTable;                                  // 0x02E0   (0x0008)  
	class UDataTable*                                  AliasesTables;                                              // 0x02E8   (0x0008)  
	class UDataTable*                                  MapLootTable;                                               // 0x02F0   (0x0008)  
	class UDataTable*                                  LootDetailTable;                                            // 0x02F8   (0x0008)  
	class UDataTable*                                  LoosePointsTable;                                           // 0x0300   (0x0008)  
	class UDataTable*                                  LoosePointsDetailTable;                                     // 0x0308   (0x0008)  
	class UDataTable*                                  StaticContainersTable;                                      // 0x0310   (0x0008)  
	int32_t                                            MapID;                                                      // 0x0318   (0x0004)  
	int32_t                                            RuleID;                                                     // 0x031C   (0x0004)  
	int32_t                                            TargetCount;                                                // 0x0320   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0324   (0x0004)  MISSED
	TArray<FMapRuleConfig>                             LooseRuleConfig;                                            // 0x0328   (0x0010)  
	unsigned char                                      UnknownData01_7[0x10];                                      // 0x0338   (0x0010)  MISSED


	/// Functions
	// Function /Script/UACommon.LoosePointManager.SpawnRandomPointList
	// void SpawnRandomPointList(int32_t Num);                                                                                  // [0x324c3c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.LoosePointManager.SpawnLootItem
	// void SpawnLootItem();                                                                                                    // [0x324c3a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.LoosePointManager.SpawnItem
	// void SpawnItem();                                                                                                        // [0x324c380] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.LoosePointManager.GetRandomLoosePointCount
	// int32_t GetRandomLoosePointCount();                                                                                      // [0x3249b20] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/UACommon.PosSensitiveWidget
/// Size: 0x0020 (32 bytes) (0x000288 - 0x0002A8) align 8 pad: 0x0000
class UPosSensitiveWidget : public UUserWidget
{ 
public:
	unsigned char                                      UnknownData00_3[0x10];                                      // 0x0288   (0x0010)  MISSED
	SDK_UNDEFINED(16,2275) /* FMulticastInlineDelegate */ __um(OnPaintPosChange);                                  // 0x0298   (0x0010)  
};

/// Class /Script/UACommon.RichTextBlockInlineDecorator
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class URichTextBlockInlineDecorator : public URichTextBlockDecorator
{ 
public:
};

/// Class /Script/UACommon.ShowBtnOutlineHelper
/// Size: 0x0110 (272 bytes) (0x0002E0 - 0x0003F0) align 8 pad: 0x0000
class AShowBtnOutlineHelper : public AActor
{ 
public:
	class UMaterial*                                   TheOutlineMaterial;                                         // 0x02E0   (0x0008)  
	int32_t                                            ButtonTempId;                                               // 0x02E8   (0x0004)  
	unsigned char                                      UnknownData00_6[0x54];                                      // 0x02EC   (0x0054)  MISSED
	SDK_UNDEFINED(80,2276) /* TMap<UButton*, FSlateBrush> */ __um(BtnOriginFSlateBrush);                           // 0x0340   (0x0050)  
	SDK_UNDEFINED(80,2277) /* TMap<UButton*, float> */ __um(BtnOriginAlpha);                                       // 0x0390   (0x0050)  
	float                                              RefreshTimerValue;                                          // 0x03E0   (0x0004)  
	float                                              RefreshTimerThreshold;                                      // 0x03E4   (0x0004)  
	bool                                               ShouldTransSize;                                            // 0x03E8   (0x0001)  
	bool                                               IsAutomat;                                                  // 0x03E9   (0x0001)  
	bool                                               IsOutlineOn;                                                // 0x03EA   (0x0001)  
	unsigned char                                      UnknownData01_7[0x5];                                       // 0x03EB   (0x0005)  MISSED


	/// Functions
	// Function /Script/UACommon.ShowBtnOutlineHelper.TransSizeToButtonMaterials
	// void TransSizeToButtonMaterials();                                                                                       // [0x324cb30] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.ShowBtnOutlineHelper.SetOutlineOn
	// void SetOutlineOn();                                                                                                     // [0x324c150] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.ShowBtnOutlineHelper.SetOutlineOff
	// void SetOutlineOff();                                                                                                    // [0x324c130] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.ShowBtnOutlineHelper.RevertAllButtonOutline
	// void RevertAllButtonOutline();                                                                                           // [0x324af20] Final|Native|Protected|BlueprintCallable 
	// Function /Script/UACommon.ShowBtnOutlineHelper.ActiveAllButtonOutline
	// void ActiveAllButtonOutline();                                                                                           // [0x3249110] Final|Native|Protected|BlueprintCallable 
};

/// Class /Script/UACommon.ShowTouch
/// Size: 0x0070 (112 bytes) (0x000028 - 0x000098) align 8 pad: 0x0000
class UShowTouch : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x70];                                      // 0x0028   (0x0070)  MISSED


	/// Functions
	// Function /Script/UACommon.ShowTouch.StopShow
	// void StopShow();                                                                                                         // [0x1811c00] Final|Native|Static|Public 
	// Function /Script/UACommon.ShowTouch.StartShow
	// void StartShow();                                                                                                        // [0x1811c00] Final|Native|Static|Public 
	// Function /Script/UACommon.ShowTouch.SetIsPrintToScreen
	// void SetIsPrintToScreen(bool inState);                                                                                   // [0x324c0b0] Final|Native|Static|Public 
};

/// Class /Script/UACommon.StatUMGWidget
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UStatUMGWidget : public UObject
{ 
public:


	/// Functions
	// Function /Script/UACommon.StatUMGWidget.ExecWidgetStat
	// void ExecWidgetStat(FString UMGName);                                                                                    // [0x3249620] Final|Native|Public  
	// Function /Script/UACommon.StatUMGWidget.DumpDetailWidgetInfo
	// void DumpDetailWidgetInfo(TArray<FString>& Results);                                                                     // [0x3249560] Final|Native|Static|Public|HasOutParms 
};

/// Class /Script/UACommon.UASubmitBug
/// Size: 0x0080 (128 bytes) (0x000028 - 0x0000A8) align 8 pad: 0x0000
class UUASubmitBug : public UObject
{ 
public:
	SDK_UNDEFINED(16,2278) /* FMulticastInlineDelegate */ __um(ScreenShotEvent);                                   // 0x0028   (0x0010)  
	SDK_UNDEFINED(16,2279) /* FMulticastInlineDelegate */ __um(SubmitHttpResponseDelegate);                        // 0x0038   (0x0010)  
	unsigned char                                      UnknownData00_7[0x60];                                      // 0x0048   (0x0060)  MISSED


	/// Functions
	// Function /Script/UACommon.UASubmitBug.SubmitHttpUpLoadDelegate__DelegateSignature
	// void SubmitHttpUpLoadDelegate__DelegateSignature(FString RspContent);                                                    // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/UACommon.UASubmitBug.SubmitContent
	// void SubmitContent(FString BugContent);                                                                                  // [0x324ca20] Final|Native|Public  
	// Function /Script/UACommon.UASubmitBug.SubmitBug
	// void SubmitBug(FString BugContent);                                                                                      // [0x324c930] Final|Native|Public  
	// Function /Script/UACommon.UASubmitBug.StopVideoCapture
	// void StopVideoCapture(int32_t Duration);                                                                                 // [0x324c8a0] Final|Native|Public  
	// Function /Script/UACommon.UASubmitBug.StartVideoCapture
	// void StartVideoCapture(bool bEnableAudio);                                                                               // [0x324c810] Final|Native|Public  
	// Function /Script/UACommon.UASubmitBug.SetRTXName
	// void SetRTXName(FString InRTXName);                                                                                      // [0xd90890] Final|Native|Public  
	// Function /Script/UACommon.UASubmitBug.SetMftToken
	// void SetMftToken(FString InMftToken);                                                                                    // [0xd90890] Final|Native|Public  
	// Function /Script/UACommon.UASubmitBug.SendVideo
	// void SendVideo(FString CosVideoPath);                                                                                    // [0x324bfc0] Final|Native|Public  
	// Function /Script/UACommon.UASubmitBug.SendScreen
	// void SendScreen(FString CosScreenPath, FString CosBugContentPath);                                                       // [0x324bc60] Final|Native|Public  
	// Function /Script/UACommon.UASubmitBug.SendLogAndVideo
	// void SendLogAndVideo(FString CosLogPath, FString CosVideoPath, FString CosScreenPath, FString CosBugContentPath);        // [0x324b240] Final|Native|Public  
	// Function /Script/UACommon.UASubmitBug.SendLog
	// void SendLog(FString CosLogPath);                                                                                        // [0x324b150] Final|Native|Public  
	// Function /Script/UACommon.UASubmitBug.ScreenCaptureDelegate__DelegateSignature
	// void ScreenCaptureDelegate__DelegateSignature();                                                                         // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/UACommon.UASubmitBug.IsVideoReady
	// bool IsVideoReady();                                                                                                     // [0x324a900] Final|Native|Public  
	// Function /Script/UACommon.UASubmitBug.GetForceStop
	// bool GetForceStop();                                                                                                     // [0x3249900] Final|Native|Public  
	// Function /Script/UACommon.UASubmitBug.GetCaptureTime
	// float GetCaptureTime();                                                                                                  // [0x32498d0] Final|Native|Public  
	// Function /Script/UACommon.UASubmitBug.GetCaptureState
	// bool GetCaptureState();                                                                                                  // [0x32498a0] Final|Native|Public  
	// Function /Script/UACommon.UASubmitBug.GetBugField
	// FString GetBugField();                                                                                                   // [0x3249820] Final|Native|Public  
	// Function /Script/UACommon.UASubmitBug.Get
	// class UUASubmitBug* Get();                                                                                               // [0x32497f0] Final|Native|Static|Public 
	// Function /Script/UACommon.UASubmitBug.DragWidget
	// void DragWidget(class UUserWidget* panel, FGeometry& InGeometry, FPointerEvent& InMouseEvent);                           // [0x3249390] Final|Native|Public|HasOutParms 
	// Function /Script/UACommon.UASubmitBug.DeleteLocalVideo
	// bool DeleteLocalVideo();                                                                                                 // [0x197b5c0] Final|Native|Public  
	// Function /Script/UACommon.UASubmitBug.ClipVideo
	// bool ClipVideo();                                                                                                        // [0x197b5c0] Final|Native|Public  
	// Function /Script/UACommon.UASubmitBug.CaptureScreen
	// void CaptureScreen();                                                                                                    // [0x32491d0] Final|Native|Public  
};

/// Class /Script/UACommon.TinyHotfixFile
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UTinyHotfixFile : public UObject
{ 
public:


	/// Functions
	// Function /Script/UACommon.TinyHotfixFile.HotfixIniFile
	// int32_t HotfixIniFile(FString Filename);                                                                                 // [0x3250b40] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/UACommon.TutorialModeInputProcessor
/// Size: 0x0048 (72 bytes) (0x000028 - 0x000070) align 8 pad: 0x0000
class UTutorialModeInputProcessor : public UObject
{ 
public:
	SDK_UNDEFINED(16,2280) /* FDelegateProperty */     __um(OnPointerDownEvent);                                   // 0x0028   (0x0010)  
	SDK_UNDEFINED(16,2281) /* FDelegateProperty */     __um(OnPointerUpEvent);                                     // 0x0038   (0x0010)  
	unsigned char                                      UnknownData00_7[0x28];                                      // 0x0048   (0x0028)  MISSED


	/// Functions
	// Function /Script/UACommon.TutorialModeInputProcessor.UnhookInputProcessor
	// bool UnhookInputProcessor();                                                                                             // [0x3252a00] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.TutorialModeInputProcessor.SetNextHookAreaRect
	// void SetNextHookAreaRect(FVector2D InLeftTop, FVector2D InRightBottom);                                                  // [0x3252750] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/UACommon.TutorialModeInputProcessor.SetContext
	// void SetContext(class UObject* InContext);                                                                               // [0x3252630] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.TutorialModeInputProcessor.ResumeHook
	// void ResumeHook();                                                                                                       // [0x3251de0] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.TutorialModeInputProcessor.PauseHook
	// void PauseHook();                                                                                                        // [0x3251c30] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.TutorialModeInputProcessor.HookInputProcessor
	// bool HookInputProcessor();                                                                                               // [0x3250b10] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/UACommon.UABuglyHelper
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UUABuglyHelper : public UObject
{ 
public:


	/// Functions
	// Function /Script/UACommon.UABuglyHelper.SendBuglyResultHandler
	// void SendBuglyResultHandler(FString Result, FString Path);                                                               // [0x3252380] Final|Native|Static|Private|BlueprintCallable 
	// Function /Script/UACommon.UABuglyHelper.SaveUrl
	// void SaveUrl(FString Md5, FString URL);                                                                                  // [0x3252210] Final|Native|Static|Private|BlueprintCallable 
	// Function /Script/UACommon.UABuglyHelper.SaveTime
	// void SaveTime(FString Md5, FString Time);                                                                                // [0x32520a0] Final|Native|Static|Private|BlueprintCallable 
	// Function /Script/UACommon.UABuglyHelper.SaveMd5
	// void SaveMd5(FString Md5);                                                                                               // [0x3251fc0] Final|Native|Static|Private|BlueprintCallable 
	// Function /Script/UACommon.UABuglyHelper.SaveGcloudBugly
	// void SaveGcloudBugly(FString URL);                                                                                       // [0x3251ee0] Final|Native|Static|Private|BlueprintCallable 
	// Function /Script/UACommon.UABuglyHelper.SaveBugly
	// void SaveBugly(FString URL);                                                                                             // [0x3251e00] Final|Native|Static|Private|BlueprintCallable 
	// Function /Script/UACommon.UABuglyHelper.RestartSend
	// void RestartSend();                                                                                                      // [0x3251dc0] Final|Native|Static|Private|BlueprintCallable 
	// Function /Script/UACommon.UABuglyHelper.RemoveMd5
	// void RemoveMd5(FString Md5);                                                                                             // [0x3251c50] Final|Native|Static|Private|BlueprintCallable 
	// Function /Script/UACommon.UABuglyHelper.IsContainMd5
	// bool IsContainMd5(FString Md5);                                                                                          // [0x3250e80] Final|Native|Static|Private|BlueprintCallable 
	// Function /Script/UACommon.UABuglyHelper.InitLogTime
	// FString InitLogTime();                                                                                                   // [0x3250e00] Final|Native|Static|Private|BlueprintCallable 
	// Function /Script/UACommon.UABuglyHelper.HasTimeInFile
	// bool HasTimeInFile(FString LOGTime, FString LogName);                                                                    // [0x32509a0] Final|Native|Static|Private|BlueprintCallable 
	// Function /Script/UACommon.UABuglyHelper.GetMd5Table
	// TArray<FString> GetMd5Table();                                                                                           // [0x32508a0] Final|Native|Static|Private|BlueprintCallable 
	// Function /Script/UACommon.UABuglyHelper.GetMd5ByUrl
	// FString GetMd5ByUrl(FString URL);                                                                                        // [0x3250770] Final|Native|Static|Private|BlueprintCallable 
	// Function /Script/UACommon.UABuglyHelper.GetBuglyInfo
	// FBuglyData GetBuglyInfo(FString Md5);                                                                                    // [0x3250560] Final|Native|Static|Private|BlueprintCallable 
	// Function /Script/UACommon.UABuglyHelper.CombineUrlKey
	// FString CombineUrlKey(FString Md5);                                                                                      // [0x32503e0] Final|Native|Static|Private|BlueprintCallable 
	// Function /Script/UACommon.UABuglyHelper.CombineTimeKey
	// FString CombineTimeKey(FString Md5);                                                                                     // [0x32502b0] Final|Native|Static|Private|BlueprintCallable 
};

/// Class /Script/UACommon.UAButtonWidget
/// Size: 0x01A8 (424 bytes) (0x000288 - 0x000430) align 8 pad: 0x0000
class UUAButtonWidget : public UUserWidget
{ 
public:
	float                                              ClickTime;                                                  // 0x0288   (0x0004)  
	bool                                               BannedClick;                                                // 0x028C   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x028D   (0x0003)  MISSED
	FLinearColor                                       normalTxtShowColor;                                         // 0x0290   (0x0010)  
	FLinearColor                                       pressTxtShowColor;                                          // 0x02A0   (0x0010)  
	FVector2D                                          normalShadowOffect;                                         // 0x02B0   (0x0008)  
	FVector2D                                          pressShadowOffect;                                          // 0x02B8   (0x0008)  
	bool                                               ForceUpper;                                                 // 0x02C0   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x02C1   (0x0003)  MISSED
	float                                              ImagePaddingLeft;                                           // 0x02C4   (0x0004)  
	float                                              ImagePaddingTop;                                            // 0x02C8   (0x0004)  
	float                                              ImagePaddingRight;                                          // 0x02CC   (0x0004)  
	float                                              ImagePaddingButtom;                                         // 0x02D0   (0x0004)  
	float                                              TxtPaddingLeft;                                             // 0x02D4   (0x0004)  
	float                                              TxtPaddingTop;                                              // 0x02D8   (0x0004)  
	float                                              TxtPaddingRight;                                            // 0x02DC   (0x0004)  
	float                                              TxtPaddingButtom;                                           // 0x02E0   (0x0004)  
	float                                              PressedPaddingLeft;                                         // 0x02E4   (0x0004)  
	float                                              PressedPaddingTop;                                          // 0x02E8   (0x0004)  
	float                                              PressedPaddingRight;                                        // 0x02EC   (0x0004)  
	float                                              PressedPaddingButtom;                                       // 0x02F0   (0x0004)  
	bool                                               isGray;                                                     // 0x02F4   (0x0001)  
	unsigned char                                      UnknownData02_6[0x3];                                       // 0x02F5   (0x0003)  MISSED
	SDK_UNDEFINED(16,2282) /* FMulticastInlineDelegate */ __um(OnClicked);                                         // 0x02F8   (0x0010)  
	SDK_UNDEFINED(16,2283) /* FMulticastInlineDelegate */ __um(OnPressed);                                         // 0x0308   (0x0010)  
	SDK_UNDEFINED(16,2284) /* FMulticastInlineDelegate */ __um(OnReleased);                                        // 0x0318   (0x0010)  
	SDK_UNDEFINED(16,2285) /* FMulticastInlineDelegate */ __um(OnHovered);                                         // 0x0328   (0x0010)  
	SDK_UNDEFINED(16,2286) /* FMulticastInlineDelegate */ __um(OnUnhovered);                                       // 0x0338   (0x0010)  
	class UButton*                                     _button;                                                    // 0x0348   (0x0008)  
	class UImage*                                      _imageNormal;                                               // 0x0350   (0x0008)  
	class UImage*                                      _imagePress;                                                // 0x0358   (0x0008)  
	class UImage*                                      _imageHover;                                                // 0x0360   (0x0008)  
	class UTextBlock*                                  _textNormal;                                                // 0x0368   (0x0008)  
	class UTextBlock*                                  _textPress;                                                 // 0x0370   (0x0008)  
	class UTextBlock*                                  _textHover;                                                 // 0x0378   (0x0008)  
	class UOverlaySlot*                                _imageNormalSlot;                                           // 0x0380   (0x0008)  
	class UOverlaySlot*                                _imagePressSlot;                                            // 0x0388   (0x0008)  
	class UOverlaySlot*                                _imageHoverSlot;                                            // 0x0390   (0x0008)  
	class UOverlaySlot*                                _textNormalSlot;                                            // 0x0398   (0x0008)  
	class UOverlaySlot*                                _textPressSlot;                                             // 0x03A0   (0x0008)  
	class UOverlaySlot*                                _textHoverSlot;                                             // 0x03A8   (0x0008)  
	unsigned char                                      UnknownData03_7[0x80];                                      // 0x03B0   (0x0080)  MISSED


	/// Functions
	// Function /Script/UACommon.UAButtonWidget.SetGray
	// void SetGray(bool gray);                                                                                                 // [0x32526c0] Final|Native|Public  
	// Function /Script/UACommon.UAButtonWidget.OnRefreshPressState
	// void OnRefreshPressState(int32_t IsPressed);                                                                             // [0x3a75280] Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/UACommon.UAButtonWidget.OnRefreshHoverState
	// void OnRefreshHoverState(int32_t isHover);                                                                               // [0x3a75280] Event|Public|BlueprintCallable|BlueprintEvent 
	// Function /Script/UACommon.UAButtonWidget.OnButtonUnHovered
	// void OnButtonUnHovered();                                                                                                // [0x3251090] Final|Native|Public  
	// Function /Script/UACommon.UAButtonWidget.OnButtonReleased
	// void OnButtonReleased();                                                                                                 // [0x3251070] Final|Native|Public  
	// Function /Script/UACommon.UAButtonWidget.OnButtonPress
	// void OnButtonPress();                                                                                                    // [0x3251050] Final|Native|Public  
	// Function /Script/UACommon.UAButtonWidget.OnButtonHovered
	// void OnButtonHovered();                                                                                                  // [0x3251030] Final|Native|Public  
	// Function /Script/UACommon.UAButtonWidget.OnButtonClick
	// void OnButtonClick();                                                                                                    // [0x3251010] Final|Native|Public  
};

/// Class /Script/UACommon.UACharacterDefaultInventoryCompBase
/// Size: 0x01A8 (424 bytes) (0x000138 - 0x0002E0) align 8 pad: 0x0000
class UUACharacterDefaultInventoryCompBase : public USGCharacterDefaultInventoryComponent
{ 
public:
	bool                                               bOwnedByAI;                                                 // 0x0138   (0x0001)  
	bool                                               bUseSlicedInit;                                             // 0x0139   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x013A   (0x0002)  MISSED
	float                                              MaxSlicedinterval;                                          // 0x013C   (0x0004)  
	SDK_UNDEFINED(16,2287) /* TArray<TWeakObjectPtr<UClass*>> */ __um(FakeAvatar_Head);                            // 0x0140   (0x0010)  
	SDK_UNDEFINED(16,2288) /* TArray<TWeakObjectPtr<UClass*>> */ __um(FakeAvatar_Torse);                           // 0x0150   (0x0010)  
	SDK_UNDEFINED(16,2289) /* TArray<TWeakObjectPtr<UClass*>> */ __um(FakeAvatar_Gloves);                          // 0x0160   (0x0010)  
	SDK_UNDEFINED(16,2290) /* TArray<TWeakObjectPtr<UClass*>> */ __um(FakeAvatar_Legs);                            // 0x0170   (0x0010)  
	SDK_UNDEFINED(16,2291) /* TArray<TWeakObjectPtr<UClass*>> */ __um(FakeAvatar_Shoes);                           // 0x0180   (0x0010)  
	SDK_UNDEFINED(16,2292) /* TArray<TWeakObjectPtr<UClass*>> */ __um(FakeAvatar_Watch);                           // 0x0190   (0x0010)  
	bool                                               bTestMultiAvatar;                                           // 0x01A0   (0x0001)  
	bool                                               bSpawnSecondMainWeapon;                                     // 0x01A1   (0x0001)  
	unsigned char                                      UnknownData01_6[0x6];                                       // 0x01A2   (0x0006)  MISSED
	SDK_UNDEFINED(80,2293) /* TMap<uint64_t, ASGInventory*> */ __um(PlayerItemIdtoInventoryMap);                   // 0x01A8   (0x0050)  
	class USlicedInitParams*                           SlicedInitParams;                                           // 0x01F8   (0x0008)  
	class USGCharacterInventoryGiveComponent*          InventoryGiveComponent;                                     // 0x0200   (0x0008)  
	unsigned char                                      UnknownData02_6[0x18];                                      // 0x0208   (0x0018)  MISSED
	TArray<class USGPlayerItemInfoBase*>               CachedDropItems;                                            // 0x0220   (0x0010)  
	SDK_UNDEFINED(80,2294) /* TMap<int64_t, int32_t> */ __um(CacheInventoryValues);                                // 0x0230   (0x0050)  
	SDK_UNDEFINED(16,2295) /* TArray<TWeakObjectPtr<UClass*>> */ __um(TestInventoryPool_Weapon);                   // 0x0280   (0x0010)  
	SDK_UNDEFINED(16,2296) /* TArray<TWeakObjectPtr<UClass*>> */ __um(TestInventoryPool_MeleeWeapon);              // 0x0290   (0x0010)  
	SDK_UNDEFINED(16,2297) /* TArray<TWeakObjectPtr<UClass*>> */ __um(TestInventoryPool_Bag);                      // 0x02A0   (0x0010)  
	SDK_UNDEFINED(16,2298) /* TArray<TWeakObjectPtr<UClass*>> */ __um(TestInventoryPool_VestBag);                  // 0x02B0   (0x0010)  
	SDK_UNDEFINED(16,2299) /* TArray<TWeakObjectPtr<UClass*>> */ __um(TestInventoryPool_Helmet);                   // 0x02C0   (0x0010)  
	SDK_UNDEFINED(16,2300) /* TArray<TWeakObjectPtr<UClass*>> */ __um(TestInventoryPool_Vest);                     // 0x02D0   (0x0010)  


	/// Functions
	// Function /Script/UACommon.UACharacterDefaultInventoryCompBase.IsInSlicedInit
	// bool IsInSlicedInit();                                                                                                   // [0x3250fa0] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.UACharacterDefaultInventoryCompBase.InitCharacterBadges
	// void InitCharacterBadges(TArray<FSGBadgeInfo>& BadgeItems);                                                              // [0x3250d50] Final|Native|Public|HasOutParms 
	// Function /Script/UACommon.UACharacterDefaultInventoryCompBase.InitCharacterAvatarsWithStates
	// void InitCharacterAvatarsWithStates(TArray<FSGAvatarInfo>& InAvatarInfos);                                               // [0x3250ca0] Final|Native|Public|HasOutParms 
	// Function /Script/UACommon.UACharacterDefaultInventoryCompBase.InitCharacterAvatars
	// void InitCharacterAvatars(TArray<uint64_t>& InAvatarItemIds);                                                            // [0x3250bf0] Final|Native|Public|HasOutParms 
	// Function /Script/UACommon.UACharacterDefaultInventoryCompBase.GetCurLoadEquipmentProgress
	// float GetCurLoadEquipmentProgress();                                                                                     // [0x32506d0] Final|Native|Public|BlueprintCallable 
};

/// Struct /Script/UACommon.ItemInfoForRand
/// Size: 0x0058 (88 bytes) (0x000000 - 0x000058) align 8 pad: 0x0000
struct FItemInfoForRand
{ 
	SDK_UNDEFINED(80,2301) /* TMap<int32_t, int32_t> */ __um(SuitItemsInfo);                                       // 0x0000   (0x0050)  
	int32_t                                            Weight;                                                     // 0x0050   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0054   (0x0004)  MISSED
};

/// Class /Script/UACommon.UACharacterAIRandomInventoryComponent
/// Size: 0x00A8 (168 bytes) (0x0002E0 - 0x000388) align 8 pad: 0x0000
class UUACharacterAIRandomInventoryComponent : public UUACharacterDefaultInventoryCompBase
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x02E0   (0x0008)  MISSED
	int32_t                                            TryTimesBeforeUsingDefault;                                 // 0x02E8   (0x0004)  
	float                                              TryInterval;                                                // 0x02EC   (0x0004)  
	int32_t                                            TryTimesBeforeUsingDefault_WeaponConfig;                    // 0x02F0   (0x0004)  
	float                                              TryInterval_WeaponConfig;                                   // 0x02F4   (0x0004)  
	class ASGInventory*                                InitWeapon;                                                 // 0x02F8   (0x0008)  
	unsigned char                                      UnknownData01_6[0x58];                                      // 0x0300   (0x0058)  MISSED
	TArray<FItemInfoForRand>                           SuitArray;                                                  // 0x0358   (0x0010)  
	TArray<FItemInfoForRand>                           SuitArrayNoRandomTest;                                      // 0x0368   (0x0010)  
	class ASGInventory*                                InventoryInUsing;                                           // 0x0378   (0x0008)  
	float                                              LastTimeUseInventory;                                       // 0x0380   (0x0004)  
	unsigned char                                      UnknownData02_7[0x4];                                       // 0x0384   (0x0004)  MISSED


	/// Functions
	// Function /Script/UACommon.UACharacterAIRandomInventoryComponent.GiveRandSuit
	// void GiveRandSuit();                                                                                                     // [0x3250980] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.UACharacterAIRandomInventoryComponent.GetGivenInventoryCountInfo
	// FString GetGivenInventoryCountInfo();                                                                                    // [0x32506f0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/UACommon.UACharacterDefaultInventoryComp
/// Size: 0x0020 (32 bytes) (0x0002E0 - 0x000300) align 8 pad: 0x0000
class UUACharacterDefaultInventoryComp : public UUACharacterDefaultInventoryCompBase
{ 
public:
	bool                                               bForceGiveInventory;                                        // 0x02E0   (0x0001)  
	bool                                               bDelayBeginPlayOver;                                        // 0x02E1   (0x0001)  
	unsigned char                                      UnknownData00_6[0x6];                                       // 0x02E2   (0x0006)  MISSED
	TArray<int64_t>                                    StandAloneAvatarArray;                                      // 0x02E8   (0x0010)  
	unsigned char                                      UnknownData01_7[0x8];                                       // 0x02F8   (0x0008)  MISSED


	/// Functions
	// Function /Script/UACommon.UACharacterDefaultInventoryComp.SpawnRandomAwardsResultDoToast
	// void SpawnRandomAwardsResultDoToast(TArray<int32_t>& SpawnItemIDs, TArray<int32_t>& SpawnItemNums);                      // [0x32528a0] Native|Event|Protected|HasOutParms|BlueprintEvent 
	// Function /Script/UACommon.UACharacterDefaultInventoryComp.ServerSaveMinimumEquipInfo
	// void ServerSaveMinimumEquipInfo();                                                                                       // [0x32524f0] Net|NetReliableNative|Event|Public|NetServer|NetValidate 
	// Function /Script/UACommon.UACharacterDefaultInventoryComp.ResetEndurance
	// void ResetEndurance(class ASGPlayerState* PS);                                                                           // [0x3251d30] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.UACharacterDefaultInventoryComp.PostInit
	// void PostInit();                                                                                                         // [0x28624c0] Native|Event|Public|BlueprintEvent 
	// Function /Script/UACommon.UACharacterDefaultInventoryComp.OnUsedInventory
	// void OnUsedInventory(class ACharacter* Character, class ASGInventory* Inventory);                                        // [0x3251ad0] Native|Protected     
	// Function /Script/UACommon.UACharacterDefaultInventoryComp.OnPlayerFinishGame
	// void OnPlayerFinishGame(class APlayerController* PlayerController, EPlayerEndGameType FinishType, class AActor* EscapeVolume); // [0x32517f0] Final|Native|Protected 
	// Function /Script/UACommon.UACharacterDefaultInventoryComp.OnCharacterPostDied
	// void OnCharacterPostDied(class ACharacter* DeadCharacter, class AController* Killer, class UDamageEventObject* DamageEventObject); // [0x3251260] Final|Native|Public  
	// Function /Script/UACommon.UACharacterDefaultInventoryComp.MarkInHighRatio
	// void MarkInHighRatio();                                                                                                  // [0x3250fd0] Final|Native|Public  
	// Function /Script/UACommon.UACharacterDefaultInventoryComp.InitStandaloneCharacterAvatars
	// void InitStandaloneCharacterAvatars();                                                                                   // [0x2862520] Native|Event|Public|BlueprintEvent 
	// Function /Script/UACommon.UACharacterDefaultInventoryComp.ClientReceiveSpawnRandomAwardsResult
	// void ClientReceiveSpawnRandomAwardsResult(TArray<int32_t> SpawnItemIDs, TArray<int32_t> SpawnItemNums);                  // [0x32501b0] Net|Native|Event|Protected|NetClient 
	// Function /Script/UACommon.UACharacterDefaultInventoryComp.CheckisInTutorialLevel
	// bool CheckisInTutorialLevel();                                                                                           // [0x28c9b90] Native|Event|Public|BlueprintEvent 
};

/// Struct /Script/UACommon.InitInventoryParams
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FInitInventoryParams
{ 
	class USGPlayerItemInfoBase*                       item;                                                       // 0x0000   (0x0008)  
	class AActor*                                      ParentInventory;                                            // 0x0008   (0x0008)  
	unsigned char                                      UnknownData00_7[0x8];                                       // 0x0010   (0x0008)  MISSED
};

/// Class /Script/UACommon.SlicedInitParams
/// Size: 0x0038 (56 bytes) (0x000028 - 0x000060) align 8 pad: 0x0000
class USlicedInitParams : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x18];                                      // 0x0028   (0x0018)  MISSED
	TArray<FInitInventoryParams>                       InitEquipmentParamsList;                                    // 0x0040   (0x0010)  
	TArray<FInitInventoryParams>                       InitItemParamsList;                                         // 0x0050   (0x0010)  
};

/// Class /Script/UACommon.UACharacterPreviewComponent
/// Size: 0x0218 (536 bytes) (0x0001E8 - 0x000400) align 8 pad: 0x0000
class UUACharacterPreviewComponent : public USGCharacterPreviewComponent
{ 
public:
	class UMaterialParameterCollection*                CaptureMaterialParameterCollection;                         // 0x01E8   (0x0008)  
	FLinearColor                                       HairSpecularLight;                                          // 0x01F0   (0x0010)  
	SDK_UNDEFINED(80,2302) /* TMap<FString, FSceneCaptureConfig> */ __um(SceneCaptureConfigs);                     // 0x0200   (0x0050)  
	class UClass*                                      CaptureLightSets;                                           // 0x0250   (0x0008)  
	SDK_UNDEFINED(80,2303) /* TMap<FString, FString> */ __um(CaptureCharacterFacialSequenceName);                  // 0x0258   (0x0050)  
	SDK_UNDEFINED(40,2304) /* TWeakObjectPtr<USkeletalMesh*> */ __um(BadgeVelcroAsset);                            // 0x02A8   (0x0028)  
	SDK_UNDEFINED(80,2305) /* TMap<FString, FString> */ __um(CaptureCharacterSequenceName);                        // 0x02D0   (0x0050)  
	FName                                              PreviewCharacterFPTag;                                      // 0x0320   (0x0008)  
	FName                                              BadgeVelcroAttachBoneTag;                                   // 0x0328   (0x0008)  
	FName                                              BadgeAttachBoneTag;                                         // 0x0330   (0x0008)  
	FString                                            CurCaptureSceneName;                                        // 0x0338   (0x0010)  
	bool                                               bPistolGrip;                                                // 0x0348   (0x0001)  
	bool                                               IsStopCapture;                                              // 0x0349   (0x0001)  
	unsigned char                                      UnknownData00_6[0x6];                                       // 0x034A   (0x0006)  MISSED
	class USkeletalMeshComponent*                      BadgeMeshComponent;                                         // 0x0350   (0x0008)  
	class USkeletalMeshComponent*                      BadgeVelcroMeshComponent;                                   // 0x0358   (0x0008)  
	unsigned char                                      UnknownData01_6[0x20];                                      // 0x0360   (0x0020)  MISSED
	class ASGCaptureCharacterLights*                   CaptureLight;                                               // 0x0380   (0x0008)  
	class UAnimNotify_CaptureCharacterConfig*          AnimNotifyConfig;                                           // 0x0388   (0x0008)  
	unsigned char                                      UnknownData02_7[0x70];                                      // 0x0390   (0x0070)  MISSED


	/// Functions
	// Function /Script/UACommon.UACharacterPreviewComponent.WaitAnimationUpdate
	// void WaitAnimationUpdate();                                                                                              // [0x3252a70] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.UpdateSceneCaptureTextureTargetSize
	// void UpdateSceneCaptureTextureTargetSize();                                                                              // [0x3252a50] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.UpdateCharacterSequence
	// void UpdateCharacterSequence();                                                                                          // [0x3252a30] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.SwitchCaptureCameraConfig
	// void SwitchCaptureCameraConfig();                                                                                        // [0x32529e0] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.StopCaptureEveryFrame
	// void StopCaptureEveryFrame();                                                                                            // [0x32529c0] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.SetTimerCheckMeshFullyStreamedIn
	// void SetTimerCheckMeshFullyStreamedIn(bool bStart);                                                                      // [0x3252810] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.SetAsyncLoadingTaskNum
	// void SetAsyncLoadingTaskNum(int32_t Num, bool bInventoryRemoved);                                                        // [0x3252560] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.SetAnimationLoaded
	// void SetAnimationLoaded();                                                                                               // [0x3252540] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.UACharacterPreviewComponent.OnWeaponAllMeshLoaded
	// void OnWeaponAllMeshLoaded(class ASGWeapon* TargetWeapon);                                                               // [0x3251ba0] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.OnUpdateInventoryTaskFinished
	// void OnUpdateInventoryTaskFinished(int32_t InAsyncId);                                                                   // [0x3251a40] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.OnUpdateAvatarsFinish
	// void OnUpdateAvatarsFinish();                                                                                            // [0x3251a20] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.OnUpdateAvatarsAddInventory
	// void OnUpdateAvatarsAddInventory(class ASGInventory* AvatarInventory);                                                   // [0x3251990] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.OnSetCurrentWeapon
	// void OnSetCurrentWeapon(class ASGInventory* Weapon);                                                                     // [0x3251900] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.OnOwnerEquipSkeletalMeshLoadCompleted
	// void OnOwnerEquipSkeletalMeshLoadCompleted(class ASGInventory* Inv, class USkeletalMeshComponent* SkeletalMeshComp);     // [0x284a5a0] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.OnInvMeshDecideLoadAnimInstance
	// void OnInvMeshDecideLoadAnimInstance(class ASGInventory* Inventory, bool& bUseGameAnimInLobby);                          // [0x3251680] Final|Native|Public|HasOutParms 
	// Function /Script/UACommon.UACharacterPreviewComponent.OnInventoryLoadComplete
	// void OnInventoryLoadComplete(int32_t TaskId);                                                                            // [0x3251760] Final|Native|Protected 
	// Function /Script/UACommon.UACharacterPreviewComponent.OnEquipMeshDecideLoadSkeletalMesh
	// void OnEquipMeshDecideLoadSkeletalMesh(class ASGInventory* AvatarInventory, bool& bUseGameMeshInLobby);                  // [0x32515a0] Final|Native|Public|HasOutParms 
	// Function /Script/UACommon.UACharacterPreviewComponent.OnDressPreviewCharacterStarted
	// void OnDressPreviewCharacterStarted();                                                                                   // [0x3251580] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.UACharacterPreviewComponent.OnCharacterStaticMeshLoaded
	// void OnCharacterStaticMeshLoaded(class UStaticMesh* StaticMesh);                                                         // [0x32514f0] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.OnCharacterSkeletalMeshLoaded
	// void OnCharacterSkeletalMeshLoaded(class USkeletalMesh* SkeletalMesh);                                                   // [0x3251460] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.OnCharacterRemoveInventoryEvent
	// void OnCharacterRemoveInventoryEvent(class ACharacter* Character, class ASGInventory* Inventory);                        // [0x3251390] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.OnCharacterPreUpdateAvatars
	// void OnCharacterPreUpdateAvatars();                                                                                      // [0x3251370] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.OnCharacterAvatarRemove
	// void OnCharacterAvatarRemove(class ASGInventory* Inv);                                                                   // [0x32511d0] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.OnCharacterAvatarMeshLoaded
	// void OnCharacterAvatarMeshLoaded(class UMeshComponent* MeshComp);                                                        // [0x3251140] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.OnCharacterAllAvatarMeshLoaded
	// void OnCharacterAllAvatarMeshLoaded(int32_t AvatarCount);                                                                // [0x32510b0] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.OnAllMeshLoaded
	// void OnAllMeshLoaded();                                                                                                  // [0x3250ff0] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.OnAllAvatarsMeshLoadFinish
	// void OnAllAvatarsMeshLoadFinish(int32_t AvatarCount);                                                                    // [0x197ccf0] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.IsDuringDressingAvatar
	// bool IsDuringDressingAvatar();                                                                                           // [0x3250f70] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UACommon.UACharacterPreviewComponent.GetAsyncId
	// int32_t GetAsyncId();                                                                                                    // [0x3250530] Final|Native|Public|Const 
	// Function /Script/UACommon.UACharacterPreviewComponent.DelayCheckDressAvatarFinished
	// void DelayCheckDressAvatarFinished();                                                                                    // [0x3250510] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.CheckDressAvatarFinished
	// void CheckDressAvatarFinished();                                                                                         // [0x3250190] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.CheckCaptureMeshIsFullyStreamedIn
	// bool CheckCaptureMeshIsFullyStreamedIn();                                                                                // [0x3250160] Final|Native|Protected 
	// Function /Script/UACommon.UACharacterPreviewComponent.CallLuaOnDressAvatarCompleted
	// void CallLuaOnDressAvatarCompleted();                                                                                    // [0x3250140] Final|Native|Public  
	// Function /Script/UACommon.UACharacterPreviewComponent.AddInventoryItemInfo
	// bool AddInventoryItemInfo(class USGPlayerItemInfoBase* ItemInfoBase);                                                    // [0x32500a0] Final|Native|Public  
};

/// Class /Script/UACommon.UAClipImageWidget
/// Size: 0x0000 (0 bytes) (0x000288 - 0x000288) align 8 pad: 0x0000
class UUAClipImageWidget : public UUserWidget
{ 
public:


	/// Functions
	// Function /Script/UACommon.UAClipImageWidget.OnTextureLoadCompleted
	// void OnTextureLoadCompleted(class UTexture* Tex);                                                                        // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/UACommon.UAClipImageWidget.AsyncLoadTexture
	// void AsyncLoadTexture(FString TexPath);                                                                                  // [0x3254010] Final|Native|Private|BlueprintCallable 
};

/// Class /Script/UACommon.UACommonConfigStatics
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UUACommonConfigStatics : public UObject
{ 
public:


	/// Functions
	// Function /Script/UACommon.UACommonConfigStatics.SaveLoginDataConfig
	// void SaveLoginDataConfig();                                                                                              // [0x3258e40] Final|Native|Static|Public 
	// Function /Script/UACommon.UACommonConfigStatics.ReloadVersionIni
	// bool ReloadVersionIni(bool InForce);                                                                                     // [0x3258db0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.PatchVersionIni
	// bool PatchVersionIni(FString InResVersion);                                                                              // [0x3258d10] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.LobbySetPing
	// bool LobbySetPing(class UWorld* WorldContext, char Ping);                                                                // [0x3258c40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.IsOverWritePacket
	// bool IsOverWritePacket();                                                                                                // [0x3258c10] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.IsForDistribution
	// bool IsForDistribution();                                                                                                // [0x3258be0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.IsFirstTimeLaunch
	// bool IsFirstTimeLaunch();                                                                                                // [0x3258bb0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.IsExpClient
	// bool IsExpClient();                                                                                                      // [0x3258b80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.InitConfigFiles
	// void InitConfigFiles();                                                                                                  // [0x3258b60] Final|Native|Static|Public 
	// Function /Script/UACommon.UACommonConfigStatics.GetWXAppID
	// FString GetWXAppID();                                                                                                    // [0x3258ae0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetVersionCode
	// FString GetVersionCode();                                                                                                // [0x3258a60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetVersionBuildTimestamp
	// FString GetVersionBuildTimestamp();                                                                                      // [0x32589e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetVersionBuildBranchNames
	// FString GetVersionBuildBranchNames();                                                                                    // [0x3258960] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetUserAgreementURL
	// FString GetUserAgreementURL();                                                                                           // [0x32588e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetUObjectLeakWhiteList
	// TArray<FString> GetUObjectLeakWhiteList();                                                                               // [0x3258860] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetUAMOLobbyIpListConfig
	// void GetUAMOLobbyIpListConfig(TArray<FString>& UAMOLobbyIpListArr);                                                      // [0x32587a0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetTGALiveIsDebug
	// int32_t GetTGALiveIsDebug();                                                                                             // [0x3258770] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetSvnVersion
	// FString GetSvnVersion();                                                                                                 // [0x32586f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetSplashFlowTimeOutSeconds
	// int32_t GetSplashFlowTimeOutSeconds();                                                                                   // [0x32586c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetServerIPConfig
	// void GetServerIPConfig(TArray<FString>& ServerIPArr);                                                                    // [0x3258600] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetRegisterFlowTimeOutSeconds
	// int32_t GetRegisterFlowTimeOutSeconds();                                                                                 // [0x32585d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetQQWXLobbyIpListConfig
	// void GetQQWXLobbyIpListConfig(TArray<FString>& QQLobbyIpListArr, TArray<FString>& WXLobbyIpListArr);                     // [0x3258480] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetQQAppID
	// FString GetQQAppID();                                                                                                    // [0x3258400] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetPufferUpdateUrl
	// FString GetPufferUpdateUrl(bool InPrePuffer);                                                                            // [0x3258330] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetPufferProductID
	// int32_t GetPufferProductID();                                                                                            // [0x3258300] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetPrivacySDKURL
	// FString GetPrivacySDKURL();                                                                                              // [0x3258280] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetPrivacyGuideURL
	// FString GetPrivacyGuideURL();                                                                                            // [0x3258200] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetPrivacyGuideChildrenURL
	// FString GetPrivacyGuideChildrenURL();                                                                                    // [0x3258180] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetPCServerIPConfig
	// void GetPCServerIPConfig(TArray<FString>& ServerIPArr);                                                                  // [0x3258040] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetPackageVersion
	// FString GetPackageVersion();                                                                                             // [0x3258100] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetMSDKGameID
	// FString GetMSDKGameID();                                                                                                 // [0x3257c60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetMobileQQWXIpConfig
	// void GetMobileQQWXIpConfig(TArray<FString>& MobileQQLobbyUrlArr, TArray<FString>& MobileWXLobbyUrlArr, bool bPreRelease); // [0x3257e90] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetMobileLoginIpConfig
	// void GetMobileLoginIpConfig(TArray<FString>& EditorMobileLobbyUrlArr, TArray<FString>& MobileLobbyUrlArr, bool bPreRelease); // [0x3257ce0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetLoginIpConfig
	// void GetLoginIpConfig(TArray<FString>& EditorLobbyUrlArr, TArray<FString>& PCLobbyUrlArr);                               // [0x3257b10] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetLoginFlowTimeOutSeconds
	// int32_t GetLoginFlowTimeOutSeconds();                                                                                    // [0x3257ae0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetLastProgramVersion
	// FString GetLastProgramVersion();                                                                                         // [0x3257a60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetIntlUpdateReleaseID
	// int32_t GetIntlUpdateReleaseID();                                                                                        // [0x3257a30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetIntlUpdatePreReleaseID
	// int32_t GetIntlUpdatePreReleaseID();                                                                                     // [0x3257a00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetGuestAppID
	// FString GetGuestAppID();                                                                                                 // [0x3257980] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetGMESDKGamekey
	// FString GetGMESDKGamekey();                                                                                              // [0x3257800] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetGMESDKGameID
	// FString GetGMESDKGameID();                                                                                               // [0x3257780] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetGamekey
	// FString GetGamekey();                                                                                                    // [0x3257900] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetGameId
	// FString GetGameId();                                                                                                     // [0x3257880] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetFlowSettingNextOpenMapName_Startup_UAM
	// FString GetFlowSettingNextOpenMapName_Startup_UAM();                                                                     // [0x3257700] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetFlowSettingNextOpenMapName_Startup_UA
	// FString GetFlowSettingNextOpenMapName_Startup_UA();                                                                      // [0x3257680] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetFlowSettingNextOpenMapName_Login
	// FString GetFlowSettingNextOpenMapName_Login();                                                                           // [0x3257600] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetDolphinUpdateUrl
	// FString GetDolphinUpdateUrl(bool InPreDolphin);                                                                          // [0x3257530] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetDolphinResourceVersion
	// FString GetDolphinResourceVersion();                                                                                     // [0x32574b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetDolphinProgramVersion
	// FString GetDolphinProgramVersion();                                                                                      // [0x3257430] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetDolphinChannelID
	// int32_t GetDolphinChannelID();                                                                                           // [0x3257400] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetCookedMapList
	// void GetCookedMapList(TArray<FString>& CookMapList, TArray<FString>& TestMapList);                                       // [0x32572b0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetComplianceFlagC
	// bool GetComplianceFlagC();                                                                                               // [0x3257280] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetComplianceFlagB
	// bool GetComplianceFlagB();                                                                                               // [0x3257250] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetComplianceFlagA
	// bool GetComplianceFlagA();                                                                                               // [0x3257220] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetCDNUrl
	// FString GetCDNUrl();                                                                                                     // [0x32571a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetAppVersionDisplayFromVersionID
	// FString GetAppVersionDisplayFromVersionID(uint64_t ClientVersionID);                                                     // [0x32570d0] Final|Native|Static|Public 
	// Function /Script/UACommon.UACommonConfigStatics.GetAppVersionDisplay
	// FString GetAppVersionDisplay();                                                                                          // [0x3257050] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.GetAppVersion64
	// FString GetAppVersion64();                                                                                               // [0x3256f50] Final|Native|Static|Public 
	// Function /Script/UACommon.UACommonConfigStatics.GetAppVersion
	// FString GetAppVersion();                                                                                                 // [0x3256fd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushTutorialTipsIndex
	// TArray<FString> FlushTutorialTipsIndex(bool bIsRead, TArray<FString> TutorialTipsIndexList);                             // [0x3256d60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushTutorialTimesInCareer
	// int32_t FlushTutorialTimesInCareer(bool bIsRead, FString TutorialName, int32_t TutorialTimesInCareer);                   // [0x3256bf0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushTaskDoneList
	// TArray<FString> FlushTaskDoneList(bool isRead, TArray<FString> taskDoneIdList);                                          // [0x3256a00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushSZLobbyUrl
	// FString FlushSZLobbyUrl(bool bIsRead, FString SZLobbyUrl);                                                               // [0x32564b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushSystemTriggerList
	// TArray<FString> FlushSystemTriggerList(bool bIsRead, TArray<FString> sysTriggerList);                                    // [0x3256810] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushSystemTriggerDoneList
	// TArray<FString> FlushSystemTriggerDoneList(bool bIsRead, TArray<FString> sysTriggerDoneList);                            // [0x3256620] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushSHLobbyUrl
	// FString FlushSHLobbyUrl(bool bIsRead, FString SHLobbyUrl);                                                               // [0x3256340] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushRegionCode
	// FString FlushRegionCode(bool bIsRead, FString code);                                                                     // [0x32561d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushOpenPhoneLimitation
	// bool FlushOpenPhoneLimitation(bool bIsRead, bool bPhoneLimitationSetting);                                               // [0x3256100] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushOpenBestLobbyUrlPC
	// bool FlushOpenBestLobbyUrlPC(bool bIsRead, bool bOpenBestLobbyUrlPC);                                                    // [0x3256030] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushOpenBestLobbyUrl
	// bool FlushOpenBestLobbyUrl(bool bIsRead, bool bOpenBestLobbuUrl);                                                        // [0x3255f60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushNeedAutoLogin
	// bool FlushNeedAutoLogin(bool bIsRead, bool needAutoLogin);                                                               // [0x3255e90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushMSDKUrl
	// FString FlushMSDKUrl(bool bIsRead, FString MSDKUrl);                                                                     // [0x3255b30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushMailReceiveList
	// TArray<FString> FlushMailReceiveList(bool isRead, TArray<FString> mailReceivedTypeList);                                 // [0x3255ca0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushLastServerName
	// FString FlushLastServerName(bool bIsRead, FString LastServerIndex);                                                      // [0x32559c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushLastNickName
	// FString FlushLastNickName(bool bIsRead, FString LastNickName);                                                           // [0x3255850] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushLastLoginName
	// FString FlushLastLoginName(bool bIsRead, FString LastLoginName);                                                         // [0x32556e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushLastCrashInfo
	// FString FlushLastCrashInfo(bool bIsRead, FString LastLastCrashInfo);                                                     // [0x3255570] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushLastChannelType
	// int32_t FlushLastChannelType(bool bIsRead, int32_t LastChannelNum);                                                      // [0x32554a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushItemPickList
	// TArray<FString> FlushItemPickList(bool isRead, TArray<FString> itemIDAndTypeList);                                       // [0x32552b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushIsFirstOpenGame
	// bool FlushIsFirstOpenGame(bool bIsRead, bool bIsFirstOpenGame);                                                          // [0x32551e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushIsFinishCPoint
	// bool FlushIsFinishCPoint(bool bIsRead, bool isFinshCPoint);                                                              // [0x3255110] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushIsAgreeAuthorizationOversea
	// FString FlushIsAgreeAuthorizationOversea(bool bIsRead, FString AuthState);                                               // [0x3254fa0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushIsAgreeAuthorization
	// bool FlushIsAgreeAuthorization(bool bIsRead, bool bIsAgreeAuthorization);                                                // [0x3254ed0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushFreeTrafficSystemEnable
	// bool FlushFreeTrafficSystemEnable(bool bIsRead, bool bFreeTrafficSystemEnable);                                          // [0x3254e00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushFreeTrafficLobbyAddressInfo
	// void FlushFreeTrafficLobbyAddressInfo(bool bIsRead, TArray<FString>& InfoArr);                                           // [0x3254cf0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushFreeTrafficBuyUrl
	// FString FlushFreeTrafficBuyUrl(bool bIsRead, FString FreeTrafficBuyUrl);                                                 // [0x3254b80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushFirstTimeToRange
	// bool FlushFirstTimeToRange(bool bIsRead, bool bFirstTimeToRange);                                                        // [0x3254ab0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushEventTriggerList
	// TArray<FString> FlushEventTriggerList(bool bIsRead, TArray<FString> eventTriggerList);                                   // [0x32548c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushEEAAgree
	// bool FlushEEAAgree(bool bIsRead, bool bAgree);                                                                           // [0x32547f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushCheckPointIndex
	// int32_t FlushCheckPointIndex(bool bIsRead, int32_t PointIndex);                                                          // [0x3254720] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushCheckIsFirstLose
	// bool FlushCheckIsFirstLose(bool isRead, bool isFirstLose);                                                               // [0x3254650] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushCheckIsDefaultGamepadSetting
	// bool FlushCheckIsDefaultGamepadSetting(bool bIsRead, bool bIsDefaultGamepadSetting);                                     // [0x3254580] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushCatchIPRegionCode
	// FString FlushCatchIPRegionCode(bool bIsRead, FString code);                                                              // [0x3254410] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.FlushBCheckDebuffEffect
	// TArray<FString> FlushBCheckDebuffEffect(bool bIsRead, TArray<FString> DebuffCheckArray);                                 // [0x3254220] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonConfigStatics.ConvertToDolphinVersion
	// FString ConvertToDolphinVersion(FString InFiveNumVersion, bool InToAssetVersion);                                        // [0x3254100] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/UACommon.UACommonStatics
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UUACommonStatics : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/UACommon.UACommonStatics.Wrapper_MPE_HasWorkloadBalance
	// bool Wrapper_MPE_HasWorkloadBalance();                                                                                   // [0x3262570] Final|Native|Static|Public 
	// Function /Script/UACommon.UACommonStatics.WidgetToTextureNew
	// void WidgetToTextureNew(class UWidget* Widget, FVector2D& DrawSize, FString savePath, int32_t CompressionQuality, bool bSave, float Scale); // [0x3262340] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.WidgetToTexture
	// FString WidgetToTexture(class UWidget* Widget, FVector2D DrawSize, FString savePath, int32_t CompressionQuality, bool bSave, float Scale, FString PandoraImgName, bool bRT, class UTextureRenderTarget2D* NewTextureRenderTarget, bool bReverse); // [0x3261f50] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.ValidateAvatars
	// bool ValidateAvatars(class ASGCharacter* Character, ECharacterSex InCharacterSex, TArray<int64_t>& AvatarItemIds, TArray<int64_t>& InvalidAvatarItemIDs); // [0x3261dc0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.UsrDebug
	// void UsrDebug();                                                                                                         // [0x3261da0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.UploadInnerCosFile
	// void UploadInnerCosFile(FString Cos, FString Str);                                                                       // [0x16b6240] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.UploadCosFile
	// void UploadCosFile(FString cosFile, FString srcFile);                                                                    // [0x16b6240] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.UpdateItemSkin
	// void UpdateItemSkin(class ASGCharacter* Character, int64_t SkinID, bool bGiveItem);                                      // [0x3261ca0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.UpdateInventoryNew
	// void UpdateInventoryNew(class ASGCharacter* PreviewCharacter, TArray<USGPlayerItemInfoBase*>& InventoryArray, bool bForceUpdateAnimation); // [0x3261b70] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.UpdateBadge
	// void UpdateBadge(class ASGCharacter* Character, int64_t ItemID, ESGBadgeAttach AttachPos);                               // [0x3261a70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.UpdateAvatarFromConsoleByString
	// void UpdateAvatarFromConsoleByString(class ASGCharacter* Character, ECharacterSex InCharacterSex, FString InAvatarsIdStr); // [0x3261910] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.UpdateAvatarFromConsole
	// void UpdateAvatarFromConsole(class ASGCharacter* Character, ECharacterSex InCharacterSex, TArray<FSGAvatarData>& AvatarDatas); // [0x32617c0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.UpdateAvatar
	// void UpdateAvatar(class ASGCharacter* Character, ECharacterSex InCharacterSex, TArray<FSGAvatarData>& AvatarDatas);      // [0x3261670] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.UObjectHasAnyFlags
	// bool UObjectHasAnyFlags(class UObject* Obj, int32_t flag);                                                               // [0x32615a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.UnloadWidgetRender
	// void UnloadWidgetRender();                                                                                               // [0xd906a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.TurnOnOffSceneCapture2D
	// void TurnOnOffSceneCapture2D(class ASGCharacter* PreviewCharacter, bool bCapture);                                       // [0x32614e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.TryReportString
	// void TryReportString(FString InStr);                                                                                     // [0x3261400] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.TryPerformanceReport
	// void TryPerformanceReport();                                                                                             // [0x32613e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.TryPerformanceRender
	// void TryPerformanceRender();                                                                                             // [0x32613c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.TryHotFix
	// void TryHotFix();                                                                                                        // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.TryConditionReport
	// void TryConditionReport();                                                                                               // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.TestReportCrash
	// void TestReportCrash(class UObject* World);                                                                              // [0x2dc9dd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.TestNotifyMpe
	// void TestNotifyMpe(bool Condition);                                                                                      // [0x3261340] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.TestHotfix
	// void TestHotfix();                                                                                                       // [0x3261320] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.TestFatal
	// void TestFatal();                                                                                                        // [0x3261300] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.TestEnsure
	// void TestEnsure();                                                                                                       // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.TestCrash
	// void TestCrash();                                                                                                        // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.TestAssert
	// void TestAssert();                                                                                                       // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.TestASanCrash
	// int32_t TestASanCrash();                                                                                                 // [0x1990a20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.SwitchShowButtonOutline
	// void SwitchShowButtonOutline(class UWorld* InWorld);                                                                     // [0x3261280] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.StopLevelSequence
	// void StopLevelSequence(class UObject* World, FName Tag);                                                                 // [0x32611c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.StartUploadCPPVM
	// void StartUploadCPPVM();                                                                                                 // [0x32611a0] Final|Native|Static|Private|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.SnapshotCustomTable
	// void SnapshotCustomTable(FString& Table, int32_t SearchMode);                                                            // [0x32610b0] Final|Native|Static|Private|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.Snapshot
	// void Snapshot();                                                                                                         // [0x3261090] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.ShutdownShaderPipeline
	// bool ShutdownShaderPipeline();                                                                                           // [0x3261060] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.SetWrapAtOfTextBlock
	// void SetWrapAtOfTextBlock(class UTextBlock* theTextBlock, float InWrapTextAt);                                           // [0x3260fa0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.SetWidgetFPropertyMargin
	// void SetWidgetFPropertyMargin(FString PropertyName, FMargin& MarginTable, class UUserWidget* Widget);                    // [0x3260e70] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.SetUseJavaIsPlayingMethod
	// void SetUseJavaIsPlayingMethod(bool Condition);                                                                          // [0x3260df0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.SetUseJavaGetCurrentPosition
	// void SetUseJavaGetCurrentPosition(bool Condition);                                                                       // [0x3260d70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.SetTencentWebViewShown
	// void SetTencentWebViewShown(bool InFlag);                                                                                // [0xc29eb0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.SetScreenOrientationIOS
	// void SetScreenOrientationIOS(int32_t InValue);                                                                           // [0x16b58a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.SetScreenOrientation
	// void SetScreenOrientation(int32_t InValue);                                                                              // [0x16b58a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.SetSceneRenderingEnable
	// void SetSceneRenderingEnable(bool enable);                                                                               // [0x3260cf0] Final|Native|Static|Public 
	// Function /Script/UACommon.UACommonStatics.SetNextBootFile
	// bool SetNextBootFile(int32_t Os, int32_t Step, FString Path);                                                            // [0x3260b90] Final|Native|Static|Public 
	// Function /Script/UACommon.UACommonStatics.SetMemberWidgetByName
	// void SetMemberWidgetByName(class UUserWidget* OwnerWidget, class UWidget* MemberWidget, FString MemberName);             // [0x3260a70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.SetMaterialTextureForImage
	// void SetMaterialTextureForImage(class UImage* Image, class UObject* NewTexture, FString ParamName);                      // [0x3260950] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.SetIsMediaPlaying
	// void SetIsMediaPlaying(bool Condition);                                                                                  // [0xc29eb0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.SetDynamicLogLevel
	// void SetDynamicLogLevel(int32_t InLogLevel);                                                                             // [0x32608d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.SetCulture
	// bool SetCulture(FString culture);                                                                                        // [0x3260830] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.SetCharacterType
	// void SetCharacterType(class ACharacter* PreviewCharacter, ECharacterType InCharacterType);                               // [0x3260770] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.SaveWidgetTexture
	// bool SaveWidgetTexture(FString Path, class UTextureRenderTarget2D* TargetRT, int32_t CompressionQuality);                // [0x3260610] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.SaveStringArray
	// void SaveStringArray(TArray<FString> stringArr, FString Path);                                                           // [0x3260420] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.SaveServiceTable
	// void SaveServiceTable(TArray<FServiceConfTableRow> serviceConfs);                                                        // [0x3260160] Final|Native|Static|Public 
	// Function /Script/UACommon.UACommonStatics.SaveRenderTargetToFile
	// bool SaveRenderTargetToFile(class UTextureRenderTarget2D* rt, FString fileDestination);                                  // [0x3260080] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.SavePanelTable
	// void SavePanelTable(TArray<FPanelConfTableRow> panelConfs);                                                              // [0x325ff10] Final|Native|Static|Public 
	// Function /Script/UACommon.UACommonStatics.SaveModuleTable
	// void SaveModuleTable(TArray<FModuleConfTableRow> moduleConfs);                                                           // [0x325fce0] Final|Native|Static|Public 
	// Function /Script/UACommon.UACommonStatics.SaveImageFromTexture2DDy
	// void SaveImageFromTexture2DDy(class UTexture2DDynamic* InDyTex, FString DesPath);                                        // [0x325fc10] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.ResetSlateBrush
	// void ResetSlateBrush(FSlateBrush& Brush, class UObject* icon);                                                           // [0x325fa50] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.RequestExit
	// void RequestExit(bool bInForce);                                                                                         // [0x325f9d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.RenderWidgetToUTexture2D
	// void RenderWidgetToUTexture2D(class UWidget* Widget, FVector2D& DrawSize, class UTextureRenderTarget2D* NewTextureRenderTarget); // [0x325f8c0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.RenderWidgetToRenderTarget
	// void RenderWidgetToRenderTarget(class UWidget* Widget, FVector2D& DrawSize, class UTextureRenderTarget2D* RenderTarget); // [0x325f7b0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.RenderWidget
	// void RenderWidget(class UWidget* Widget, FVector2D& DrawSize);                                                           // [0x325f6f0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.RemoveInventoryNew
	// void RemoveInventoryNew(class ASGCharacter* PreviewCharacter, class USGPlayerItemInfoBase* Inventory);                   // [0x325f630] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.RemoveInventory
	// void RemoveInventory(class ASGCharacter* PreviewCharacter, int64_t InventoryID);                                         // [0x325f570] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.RemoveInventoriesNew
	// void RemoveInventoriesNew(class ASGCharacter* PreviewCharacter, TArray<USGPlayerItemInfoBase*>& InventoryList);          // [0x325f490] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.RemoveInventories
	// void RemoveInventories(class ASGCharacter* PreviewCharacter, TArray<int64_t>& InventoryIdList);                          // [0x325f3b0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.RemoveAllInventories
	// void RemoveAllInventories(class ASGCharacter* PreviewCharacter);                                                         // [0x325f330] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.RefreshIconOfImage
	// void RefreshIconOfImage(class UImage* Image, class UObject* icon);                                                       // [0x325f270] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.RefreshAssembleTagItemIDMap
	// void RefreshAssembleTagItemIDMap();                                                                                      // [0x325f250] Final|Native|Static|Private 
	// Function /Script/UACommon.UACommonStatics.PreloadAvatars
	// void PreloadAvatars(class ASGCharacter* Character, TArray<int64_t>& AvatarItemIds, ECharacterSex CharacterSex, int32_t MaxPreloadNum); // [0x325f0e0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.PlayListViewAnimOfPanel
	// void PlayListViewAnimOfPanel(class UUserWidget* UserWidget);                                                             // [0x325f060] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.PlayLevelSequenceReverse
	// void PlayLevelSequenceReverse(class UObject* World, FName Tag);                                                          // [0x325efa0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.PlayLevelSequence
	// void PlayLevelSequence(class UObject* World, FName Tag);                                                                 // [0x325eee0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.PlayInitAnimation
	// void PlayInitAnimation(class UUserWidget* UserWidget);                                                                   // [0x325ee60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.OpenShaderCodeLibrary
	// bool OpenShaderCodeLibrary(FString InName, FString InDir);                                                               // [0x325ed70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.OpenPipelineFileCache
	// bool OpenPipelineFileCache(FString InName);                                                                              // [0x325ecd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.OpenAnimationEndBroadcast
	// void OpenAnimationEndBroadcast(class UObject* InWorldContextObject, FString AnimationName);                              // [0x325ec00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.OnOpenAnimationBegin
	// void OnOpenAnimationBegin(class UUserWidget* UserWidget);                                                                // [0x325eb80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.NumPrecompilesRemaining
	// int32_t NumPrecompilesRemaining();                                                                                       // [0x325eb50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.LogAssetLoadingInfo
	// void LogAssetLoadingInfo();                                                                                              // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.LoadImageToTexture2DDy
	// class UObject* LoadImageToTexture2DDy(FString ImagePath);                                                                // [0x325eab0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.LoadImageToTexture2D
	// class UObject* LoadImageToTexture2D(FString ImagePath);                                                                  // [0x325ea10] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.LoadCppPatch
	// void LoadCppPatch();                                                                                                     // [0x1811c00] Final|Native|Static|Private|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.IsWorldInDsMode
	// bool IsWorldInDsMode(class UWorld* TheWorld);                                                                            // [0x1dfa670] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.IsBadgeByInventoryId
	// bool IsBadgeByInventoryId(class UWorld* World, int64_t InventoryID);                                                     // [0x325e940] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.is_RUNNING_WITH_ASAN_DS
	// bool is_RUNNING_WITH_ASAN_DS();                                                                                          // [0x32625a0] Final|Native|Static|Public 
	// Function /Script/UACommon.UACommonStatics.InitFourTapUploadFeature
	// void InitFourTapUploadFeature();                                                                                         // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.HideAvatar
	// void HideAvatar(class ASGCharacter* Character, ESGAvatarType avatarType, bool bHide);                                    // [0x325e840] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.HackPrecompilesRemaining
	// void HackPrecompilesRemaining(int32_t InValue);                                                                          // [0x325e7c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GoToTrainLevelWithWeapon
	// void GoToTrainLevelWithWeapon(class UObject* World, class ASGCharacter* PreviewCharacter, TArray<USGPlayerItemInfoBase*>& InventoryArray); // [0x325e6a0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GlobalLockUiEvents
	// void GlobalLockUiEvents(bool isLock);                                                                                    // [0x325e620] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GiveItemToOneAI
	// bool GiveItemToOneAI(class ASGAICharacter* SGCharacter, int64_t ItemID, int32_t Num, bool bAmmoAutoLoad, bool bBagFullDestroyItem); // [0x325e480] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GiveItemToNearestAI
	// bool GiveItemToNearestAI(class UObject* WorldContextObject, int64_t ItemID, int32_t Num, bool bAmmoAutoLoad, bool bBagFullDestroyItem); // [0x325e480] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GiveItemToAllAI
	// bool GiveItemToAllAI(class UObject* WorldContextObject, int64_t ItemID, int32_t Num, bool bAmmoAutoLoad, bool bBagFullDestroyItem); // [0x325e480] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GiveItem
	// bool GiveItem(class ACharacter* SGCharacter, int64_t ItemID, int32_t Num, bool bAmmoAutoLoad, bool bBagFullDestroyItem, int32_t SkinID); // [0x325e2a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GiveInventoryNew
	// void GiveInventoryNew(class ASGCharacter* PreviewCharacter, class USGPlayerItemInfoBase* Inventory);                     // [0x325e1e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GiveInventory
	// void GiveInventory(class ASGCharacter* PreviewCharacter, int64_t InventoryID);                                           // [0x325e120] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GiveInventoriesNew
	// void GiveInventoriesNew(class ASGCharacter* PreviewCharacter, TArray<USGPlayerItemInfoBase*>& InventoryList);            // [0x325e040] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GiveInventories
	// void GiveInventories(class ASGCharacter* PreviewCharacter, TArray<int64_t>& InventoryIdList);                            // [0x325df60] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetWigdetHierarchyInfo
	// FString GetWigdetHierarchyInfo(class UWidget* InWidget);                                                                 // [0x325de90] Final|Native|Static|Public 
	// Function /Script/UACommon.UACommonStatics.GetWidgetGeometryScale
	// float GetWidgetGeometryScale(class UWidget* Widget);                                                                     // [0x325de00] Final|Native|Static|Private|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetUserWidgetByName
	// class UUserWidget* GetUserWidgetByName(class UUserWidget* UserWidget, FName WidgetName);                                 // [0x325dd30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetUIMode
	// EUAUIMode GetUIMode(class UObject* InWorldContextObject);                                                                // [0x325dca0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetTextureResolution
	// FVector2D GetTextureResolution(class UTexture2DDynamic* Tex);                                                            // [0x325dc10] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetTextureMemorySize
	// int32_t GetTextureMemorySize(class UTexture2DDynamic* Tex, TEnumAsByte<ETextureMipCount> Enum);                          // [0x325db40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetServiceTable
	// TArray<FServiceConfTableRow> GetServiceTable();                                                                          // [0x325da40] Final|Native|Static|Public 
	// Function /Script/UACommon.UACommonStatics.GetRootWeaponItemID
	// int64_t GetRootWeaponItemID(FWeaponAssembleConfTableRow Row);                                                            // [0x325d8d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetRefCanvasPanelSlotPosition
	// void GetRefCanvasPanelSlotPosition(class UCanvasPanelSlot* Slot, FVector2D& postion);                                    // [0x325d810] Final|Native|Static|Public|HasOutParms|HasDefaults 
	// Function /Script/UACommon.UACommonStatics.GetPrimaryGPUBrand
	// FString GetPrimaryGPUBrand();                                                                                            // [0x325d790] Final|Native|Static|Private 
	// Function /Script/UACommon.UACommonStatics.GetPlatformDeviceId
	// FString GetPlatformDeviceId();                                                                                           // [0x325d710] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetPipedSvrAddress
	// FString GetPipedSvrAddress();                                                                                            // [0x325d690] Final|Native|Static|Private 
	// Function /Script/UACommon.UACommonStatics.GetPersistentDownloadDir
	// FString GetPersistentDownloadDir();                                                                                      // [0x325d610] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetPanelTable
	// TArray<FPanelConfTableRow> GetPanelTable();                                                                              // [0x325d4d0] Final|Native|Static|Public 
	// Function /Script/UACommon.UACommonStatics.GetPackageDependencies
	// TArray<FString> GetPackageDependencies(FString InPackage);                                                               // [0x325d380] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetOSVersions
	// void GetOSVersions(TArray<FString>& OSVersionList);                                                                      // [0x325d120] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetOSVersion
	// FString GetOSVersion();                                                                                                  // [0x325d0a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetObjPathName
	// FString GetObjPathName(class UObject* InObj);                                                                            // [0x325d2b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetObjFullName
	// FString GetObjFullName(class UObject* InObj);                                                                            // [0x325d1e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetOACAID
	// FString GetOACAID();                                                                                                     // [0x325c880] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetNowMillisecondParty
	// int32_t GetNowMillisecondParty();                                                                                        // [0x325d070] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetNetworkConnectionType
	// int32_t GetNetworkConnectionType();                                                                                      // [0x1990a20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetMotionEventRotation
	// FVector GetMotionEventRotation(FMotionEvent InMotionEvent);                                                              // [0x325cf30] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetModuleTable
	// TArray<FModuleConfTableRow> GetModuleTable();                                                                            // [0x325ce00] Final|Native|Static|Public 
	// Function /Script/UACommon.UACommonStatics.GetMediaServerErrorCode
	// int32_t GetMediaServerErrorCode();                                                                                       // [0x1990a20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetLocalSizeByPaintGeo
	// FVector2D GetLocalSizeByPaintGeo(class UUserWidget* UserWidget);                                                         // [0x325cd70] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetIsUserWidget
	// bool GetIsUserWidget(class UWidget* Widget);                                                                             // [0x325cce0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetIPString
	// FString GetIPString();                                                                                                   // [0x325cae0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetIPAddress
	// FString GetIPAddress();                                                                                                  // [0x325ca60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetInventoryById
	// class ASGInventory* GetInventoryById(class UObject* WorldContextObject, int64_t ItemID);                                 // [0x325cc10] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetImageResolution
	// FVector2D GetImageResolution(FString ImagePath);                                                                         // [0x325cb60] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetGraphicMemeorySize
	// float GetGraphicMemeorySize();                                                                                           // [0x325ca30] Final|Native|Static|Private 
	// Function /Script/UACommon.UACommonStatics.GetGPUFamily
	// FString GetGPUFamily();                                                                                                  // [0x16b5450] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetGPUDriverVersion
	// FString GetGPUDriverVersion();                                                                                           // [0x325c9b0] Final|Native|Static|Private 
	// Function /Script/UACommon.UACommonStatics.GetGLVersion
	// FString GetGLVersion();                                                                                                  // [0x16b5450] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetEnableCPPVM
	// bool GetEnableCPPVM();                                                                                                   // [0xc12490] Final|Native|Static|Private|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetDynamicLogLevel
	// int32_t GetDynamicLogLevel();                                                                                            // [0x325c980] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetDeviceMake
	// FString GetDeviceMake();                                                                                                 // [0x325c900] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetDeviceInfo
	// FString GetDeviceInfo(FString strDeviceName);                                                                            // [0x3249930] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetDeviceId
	// FString GetDeviceId();                                                                                                   // [0x325c880] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetDeskDefaultFreeSpace
	// bool GetDeskDefaultFreeSpace(FString InPath, int64_t& TotalnumberOfBytes, int64_t& NumberOfFreeBytes);                   // [0x325c740] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetDefaultDeviceProfileName
	// FString GetDefaultDeviceProfileName();                                                                                   // [0x325c6c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetCulture
	// FString GetCulture();                                                                                                    // [0x325c640] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetCpuInfo
	// FString GetCpuInfo();                                                                                                    // [0x325c5c0] Final|Native|Static|Private 
	// Function /Script/UACommon.UACommonStatics.GetCPUBrand
	// FString GetCPUBrand();                                                                                                   // [0x16b5450] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetCosUploadURL
	// FString GetCosUploadURL();                                                                                               // [0x325c540] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetContainerConfSizes
	// FString GetContainerConfSizes(FName ItemID);                                                                             // [0x325c470] Final|Native|Static|Private 
	// Function /Script/UACommon.UACommonStatics.GetClassDefaultObject
	// class UObject* GetClassDefaultObject(class UClass* InClass);                                                             // [0x325c3e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetCharacter
	// class ASGCharacter* GetCharacter(class UObject* InWorldContextObject);                                                   // [0x325c350] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetCarrier
	// FString GetCarrier();                                                                                                    // [0x16b5450] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetBulletItemIdsByAssembleTag
	// TArray<uint32_t> GetBulletItemIdsByAssembleTag(FString AssembleTag);                                                     // [0x325c220] Final|Native|Static|Private 
	// Function /Script/UACommon.UACommonStatics.GetBuildConfiguration
	// FString GetBuildConfiguration();                                                                                         // [0x325c1a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetAvatarTypeByInventoryId
	// ESGAvatarType GetAvatarTypeByInventoryId(class UWorld* World, int64_t InventoryID);                                      // [0x325c0d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.GetAnimationByName
	// class UWidgetAnimation* GetAnimationByName(class UUserWidget* UserWidget, FName AnimationName);                          // [0x325c000] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/UACommon.UACommonStatics.GetAccountBanStringByKey
	// FText GetAccountBanStringByKey(FString InBanKey);                                                                        // [0x325bf00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.ForceInputBoxTop
	// void ForceInputBoxTop(int32_t InValue);                                                                                  // [0x16b58a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.ForceFlushRHIResource
	// void ForceFlushRHIResource();                                                                                            // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.FixAndroidWindowSize
	// void FixAndroidWindowSize(int32_t InValue);                                                                              // [0x16b58a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.EnableSensor
	// void EnableSensor();                                                                                                     // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.DumpFName
	// void DumpFName();                                                                                                        // [0x325bee0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.DisableSensor
	// void DisableSensor();                                                                                                    // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.CreateUImage
	// class UImage* CreateUImage();                                                                                            // [0x325beb0] Final|Native|Static|Private 
	// Function /Script/UACommon.UACommonStatics.CreateCurrentWordWidgetInstance
	// class UUserWidget* CreateCurrentWordWidgetInstance(class UWorld* World, class UClass* UserWidgetClass, FName WidgetName); // [0x325bdb0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.ContainsAvatar
	// bool ContainsAvatar(int64_t AvatarItemID, ESGAvatarType avatarType);                                                     // [0x325bce0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.CloseShaderCodeLibrary
	// void CloseShaderCodeLibrary(FString InName);                                                                             // [0x325bc50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.ClosePipelineFileCache
	// void ClosePipelineFileCache();                                                                                           // [0x325bc30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.ClearPreloadAvatars
	// void ClearPreloadAvatars(class ASGCharacter* Character);                                                                 // [0x325bbb0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.CleanAllFontCache
	// void CleanAllFontCache();                                                                                                // [0x325bb90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.CheckMedicine_DestroyAndEnergy
	// void CheckMedicine_DestroyAndEnergy(bool& destroy, bool& Energy, TArray<FName> item_ids);                                // [0x325ba10] Final|Native|Static|Private|HasOutParms 
	// Function /Script/UACommon.UACommonStatics.CheckIconValid
	// bool CheckIconValid(class UObject* ResourceObject);                                                                      // [0x325b980] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.CheckEquipmentHiddenConflict
	// void CheckEquipmentHiddenConflict(class UObject* WorldContextObject, int64_t ItemID, TArray<int64_t>& AvatarItemIds, TArray<int64_t>& ConflictItemIdList); // [0x325b7f0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.CaptureScreen
	// void CaptureScreen(FString Path);                                                                                        // [0x325b710] Final|Native|Static|Public 
	// Function /Script/UACommon.UACommonStatics.CanAttachBadge
	// bool CanAttachBadge(class ACharacter* Character, int64_t ItemID, ESGBadgeAttach AttachPos);                              // [0x325b610] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.CalcTimeBetweenMarkedFrameInSequence
	// float CalcTimeBetweenMarkedFrameInSequence(class UObject* World, FName Tag, FString MarkedFrame1, FString MarkedFrame2); // [0x325b420] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UACommonStatics.CacuContainerSizeByItemId
	// int32_t CacuContainerSizeByItemId(FName ItemID);                                                                         // [0x325b390] Final|Native|Static|Private 
	// Function /Script/UACommon.UACommonStatics.BuildSGPlayerItemTree
	// void BuildSGPlayerItemTree(TArray<USGPlayerItemInfoBase*> InSGPlayerItems, TArray<USGPlayerItemInfoBase*>& InResultList, int64_t InCharacterParentId); // [0x325b210] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/UACommon.UADataTableManager
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UUADataTableManager : public USGConfigUtil
{ 
public:


	/// Functions
	// Function /Script/UACommon.UADataTableManager.GetMapDetailTableRowBPProxy
	// FMapDetailTableRowBPProxy GetMapDetailTableRowBPProxy(FMapDetailTableRow MapDetailTableRow);                             // [0x326ff70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UADataTableManager.GetLootDropTableRowBPProxy
	// FLootDropTableRowBPProxy GetLootDropTableRowBPProxy(FLootDropTableRow LootDropTableRow);                                 // [0x326fb70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UADataTableManager.GetItemConfTableRowBPProxy
	// FItemConfTableRowBPProxy GetItemConfTableRowBPProxy(FItemConfTableRow ItemConfTableRow);                                 // [0x326f790] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UADataTableManager.Get
	// class UUADataTableManager* Get();                                                                                        // [0x326d130] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/UACommon.UAFontMeasure
/// Size: 0x0048 (72 bytes) (0x000028 - 0x000070) align 8 pad: 0x0000
class UUAFontMeasure : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x10];                                      // 0x0028   (0x0010)  MISSED
	bool                                               bSingleMode;                                                // 0x0038   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0039   (0x0003)  MISSED
	uint32_t                                           SelectIndex;                                                // 0x003C   (0x0004)  
	FString                                            ExtraInfo;                                                  // 0x0040   (0x0010)  
	unsigned char                                      UnknownData02_7[0x20];                                      // 0x0050   (0x0020)  MISSED


	/// Functions
	// Function /Script/UACommon.UAFontMeasure.SubmitBugTask
	// void SubmitBugTask(FString Content, FString Path);                                                                       // [0x32722f0] Final|Native|Public  
	// Function /Script/UACommon.UAFontMeasure.GetTextJustification
	// TEnumAsByte<ETextJustify> GetTextJustification(class UTextLayoutWidget* LayoutWidget);                                   // [0x3270740] Final|Native|Public  
	// Function /Script/UACommon.UAFontMeasure.GetTextAndImageWidgets
	// void GetTextAndImageWidgets(class UWidget* Widget, TArray<UWidget*>& TextWidgets, TArray<UWidget*>& ImageWidgets, bool bCliping); // [0x3270590] Final|Native|Public|HasOutParms 
	// Function /Script/UACommon.UAFontMeasure.GetCurrentPanel
	// class UUserWidget* GetCurrentPanel(class UUserWidget* RootCanvasPanel);                                                  // [0x326dfd0] Final|Native|Public  
	// Function /Script/UACommon.UAFontMeasure.Get
	// class UUAFontMeasure* Get();                                                                                             // [0x326d160] Final|Native|Static|Public 
	// Function /Script/UACommon.UAFontMeasure.DrawFontMeasure
	// void DrawFontMeasure(FPaintContext& Context, class UWidgetTree* WidgetTree);                                             // [0x326ce50] Final|Native|Public|HasOutParms 
	// Function /Script/UACommon.UAFontMeasure.DragWidget
	// void DragWidget(class UUserWidget* panel, FGeometry& InGeometry, FPointerEvent& InMouseEvent);                           // [0x326cc80] Final|Native|Public|HasOutParms 
};

/// Class /Script/UACommon.UAGridScroll
/// Size: 0x0020 (32 bytes) (0x000908 - 0x000928) align 8 pad: 0x0000
class UUAGridScroll : public UScrollBox
{ 
public:
	SDK_UNDEFINED(16,2306) /* FMulticastInlineDelegate */ __um(OnContentSizeChange);                               // 0x0908   (0x0010)  
	SDK_UNDEFINED(16,2307) /* FMulticastInlineDelegate */ __um(ScrollWidgetAnimationEnd2);                         // 0x0918   (0x0010)  


	/// Functions
	// Function /Script/UACommon.UAGridScroll.OnScrollWidgetAnimationEnd
	// void OnScrollWidgetAnimationEnd();                                                                                       // [0x3271af0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/UACommon.UAInventoryStatics
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UUAInventoryStatics : public USGInventoryStatics
{ 
public:


	/// Functions
	// Function /Script/UACommon.UAInventoryStatics.UpdateInventories
	// void UpdateInventories(TArray<USGPlayerItemInfoBase*>& InventoryArray, class ACharacter* Character);                     // [0x3272470] Final|Native|Static|Public|HasOutParms 
	// Function /Script/UACommon.UAInventoryStatics.SpawnItemByID
	// class ASGInventory* SpawnItemByID(class UObject* WorldContextObject, int64_t ItemID);                                    // [0x3272220] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UAInventoryStatics.SpawnInventoryByItemID
	// class ASGInventory* SpawnInventoryByItemID(class UObject* WorldContextObject, int32_t ItemID, int32_t ItemNum, FVector Location, FRotator Rotator); // [0x3272080] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/UACommon.UAInventoryStatics.RemoveSpecificInventory
	// void RemoveSpecificInventory(class ASGInventory* TargetInventory, class ACharacter* Character);                          // [0x3271fc0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.RemoveInventory
	// void RemoveInventory(class USGPlayerItemInfoBase* item, class ACharacter* Character);                                    // [0x3271f00] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.RefreshInvMap
	// void RefreshInvMap(TMap<ASGInventory*, int32_t>& InvMap, TMap<int64_t, bool>& bIsInspectedMap, class ASGCharacter* SGCharacter); // [0x3271b90] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UAInventoryStatics.RefreshInventory
	// void RefreshInventory(class USGPlayerItemInfoBase* item, class ACharacter* Character, class ASGInventory* Inventory);    // [0x3271e00] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.ParsePendantItemInfo
	// void ParsePendantItemInfo(class USGPlayerItemInfoBase* PlayerItemInfoBase);                                              // [0x3271b10] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UAInventoryStatics.OnInventoryLoadCompleteNotify
	// void OnInventoryLoadCompleteNotify(int32_t InTaskID);                                                                    // [0x3271a70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UAInventoryStatics.MergeInv
	// void MergeInv(TMap<ASGInventory*, int32_t>& InvMap, TMap<int64_t, bool>& bIsInspectedMap, TArray<AActor*> InvArray);     // [0x3271750] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UAInventoryStatics.IsCharHasInventoryByAttachPosition
	// bool IsCharHasInventoryByAttachPosition(class ASGCharacter* SGCharacter, EAttachPosition AttachPosition, class ASGInventory* Inventory); // [0x3271650] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/UACommon.UAInventoryStatics.GiveWeaponToPlayerByWeaponActor
	// void GiveWeaponToPlayerByWeaponActor(class ASGInventory* Weapon, class ACharacter* Character);                           // [0x3271590] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GiveWeaponToPlayer
	// void GiveWeaponToPlayer(class USGPlayerItemInfoBase* item, class ACharacter* Character);                                 // [0x32714d0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GiveWeaponBP
	// void GiveWeaponBP(class ACharacter* Character, int64_t ItemID, EAttachPosition AttachPosition);                          // [0x32713d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UAInventoryStatics.GiveWeapon
	// void GiveWeapon(class ACharacter* Character, uint64_t ItemID, EAttachPosition AttachPosition);                           // [0x32712d0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GiveMagaWithAmmoBP
	// void GiveMagaWithAmmoBP(class ACharacter* Character, int64_t MagaId);                                                    // [0x3271210] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UAInventoryStatics.GiveItemToContainer
	// class ASGInventory* GiveItemToContainer(class ASGInventory* ContainerInv, int32_t ItemID, int32_t ItemNum);              // [0x3271110] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UAInventoryStatics.GiveItem
	// void GiveItem(class ACharacter* Character, int64_t ItemID, int32_t Num, bool bAmmoAutoLoad);                             // [0x3270fc0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UAInventoryStatics.GiveCharacterByInventoryList
	// void GiveCharacterByInventoryList(class ACharacter* Character, TArray<UClass*> InventoryList);                           // [0x3270ea0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GiveAndGetItem
	// class ASGInventory* GiveAndGetItem(class ACharacter* Character, int64_t ItemID, int32_t Num, bool bAmmoAutoLoad);        // [0x3270d50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UAInventoryStatics.GiveAndEquipWeaponBP
	// void GiveAndEquipWeaponBP(class ACharacter* Character, int64_t WeaponId, char WeaponSlot);                               // [0x3270c50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UAInventoryStatics.GetWeaponZeroDropDistance
	// float GetWeaponZeroDropDistance(class APawn* Pawn, bool bWithBulletModifier);                                            // [0x3270b80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UAInventoryStatics.GetWeaponSocketsAndAmmoCapacity
	// uint32_t GetWeaponSocketsAndAmmoCapacity(uint64_t ItemID, TArray<FWeaponSocket>& InSockets);                             // [0x32709d0] Final|Native|Static|Public|HasOutParms 
	// Function /Script/UACommon.UAInventoryStatics.GetWeaponMovementSpeedScale
	// float GetWeaponMovementSpeedScale(class ASGInventory* Inventory);                                                        // [0x3270940] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/UACommon.UAInventoryStatics.GetUseSound
	// FString GetUseSound(class ASGInventory* Inventory);                                                                      // [0x3270870] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/UACommon.UAInventoryStatics.GetTotalValueOfCharacter
	// uint32_t GetTotalValueOfCharacter(class ASGCharacter* Character);                                                        // [0x32707e0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetTestPlayerItemInfoBase
	// class USGPlayerItemInfoBase* GetTestPlayerItemInfoBase(uint64_t ParentID, uint64_t ChildID);                             // [0x32704c0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetSecondMainWeaponValue
	// uint32_t GetSecondMainWeaponValue(class ASGCharacter* Character);                                                        // [0x3270430] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetRuningInventoryStaticsTaskById
	// class UObject* GetRuningInventoryStaticsTaskById(int32_t ID);                                                            // [0x32703a0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetPlayerItemInfoBaseFormInstID
	// class USGPlayerItemInfoBase* GetPlayerItemInfoBaseFormInstID(class ACharacter* Character, uint64_t InstId);              // [0x32702d0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetOneInventoryByAttachPosition
	// class ASGInventory* GetOneInventoryByAttachPosition(class ASGCharacter* SGCharacter, EAttachPosition AttachPosition);    // [0x3270200] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/UACommon.UAInventoryStatics.GetLoseValueOfCharacter
	// uint32_t GetLoseValueOfCharacter(class ASGCharacter* SGCharacter);                                                       // [0x326fee0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetItemInstIdModded
	// int32_t GetItemInstIdModded(class ASGInventory* SGInventory, int32_t Mod);                                               // [0x326faa0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetItemInstId
	// uint64_t GetItemInstId(class ASGInventory* SGInventory);                                                                 // [0x326fa10] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetInventoryValuePropagateTrade
	// void GetInventoryValuePropagateTrade(class ASGInventory* Inventory, int32_t& OutValue, bool bIncludeSelf, bool bIncludeChild, bool bIncludeBullet); // [0x326f4c0] Final|Native|Static|Public|HasOutParms 
	// Function /Script/UACommon.UAInventoryStatics.GetInventoryValuePropagate
	// void GetInventoryValuePropagate(class ASGInventory* Inventory, int32_t& OutValue, bool bIncludeSelf, bool bIncludeChild, bool bIncludeBullet); // [0x326f4c0] Final|Native|Static|Public|HasOutParms 
	// Function /Script/UACommon.UAInventoryStatics.GetInventoryValue
	// int32_t GetInventoryValue(class ASGInventory* Inventory);                                                                // [0x326f430] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetInventoryTypeTotalCount
	// int32_t GetInventoryTypeTotalCount(class ACharacter* Character, int32_t typeId, TArray<EAttachPosition> PositionArr);    // [0x326f2d0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetInventoryTotalCount
	// int32_t GetInventoryTotalCount(class ACharacter* Character, int64_t InventoryID, TArray<EAttachPosition> PositionArr);   // [0x326f170] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UAInventoryStatics.GetInventoryStackMaxFromCommonItemTable
	// int32_t GetInventoryStackMaxFromCommonItemTable(uint64_t item_id);                                                       // [0x326f0e0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetInventorysFromWeaponAssembleTable
	// TArray<UClass*> GetInventorysFromWeaponAssembleTable(class UObject* WorldContextObject, uint64_t QueryID);               // [0x326f680] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetInventoryNameFromCommonItemTable
	// FString GetInventoryNameFromCommonItemTable(uint64_t ItemID);                                                            // [0x326f010] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetInventoryDynamicValue
	// uint32_t GetInventoryDynamicValue(class ASGInventory* Inv);                                                              // [0x326ef80] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetInventoryCountPropagate
	// void GetInventoryCountPropagate(class ASGInventory* Inventory, int32_t& OutValue, bool bIncludeSelf, bool bIncludeChild); // [0x326ee20] Final|Native|Static|Public|HasOutParms 
	// Function /Script/UACommon.UAInventoryStatics.GetInventoryCached
	// class ASGInventory* GetInventoryCached(class ASGAssembleBase* AssembleObj);                                              // [0x326ed90] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetInventoryAsync
	// int32_t GetInventoryAsync(class USGPlayerItemInfoBase* item, class ACharacter* Character, class AActor* ParentActor, int32_t InContainerIndex); // [0x326ec50] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetInventory
	// class ASGInventory* GetInventory(class USGPlayerItemInfoBase* item, class ACharacter* Character, class AActor* ParentActor, int32_t InContainerIndex); // [0x326eb00] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetInventoriesByGameplayTagList
	// TArray<uint64_t> GetInventoriesByGameplayTagList(TArray<FString>& TagList);                                              // [0x326e9f0] Final|Native|Static|Public|HasOutParms 
	// Function /Script/UACommon.UAInventoryStatics.GetInventoriesByGameplayTagContainer
	// TArray<uint64_t> GetInventoriesByGameplayTagContainer(FGameplayTagContainer TagContainer);                               // [0x326e8d0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetInventoriesByAttachPosition
	// TArray<uint64_t> GetInventoriesByAttachPosition(EAttachPosition position);                                               // [0x326e800] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetIconPathTryReadFromTable
	// FString GetIconPathTryReadFromTable(class ASGInventory* Inventory, bool bReadFromTableIfFailed);                         // [0x326e6f0] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/UACommon.UAInventoryStatics.GetHelmetSoundMaxDistanceInfluenceFactor
	// float GetHelmetSoundMaxDistanceInfluenceFactor(uint64_t ItemID);                                                         // [0x326e660] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetHelmetSoundLevelInfluenceFactor
	// float GetHelmetSoundLevelInfluenceFactor(uint64_t ItemID);                                                               // [0x326e5d0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetHelmetSoundIndicatorMaxDistanceInfluenceFactor
	// float GetHelmetSoundIndicatorMaxDistanceInfluenceFactor(uint64_t ItemID);                                                // [0x326e540] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetHelmetSoundIndicatorLevelInfluence
	// float GetHelmetSoundIndicatorLevelInfluence(uint64_t ItemID);                                                            // [0x326e4b0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetHelmetSoundBlockLevelFromDetailConfTable
	// int32_t GetHelmetSoundBlockLevelFromDetailConfTable(uint64_t ItemID);                                                    // [0x326e420] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetGridInfoByItemID
	// FItemGridInfo GetGridInfoByItemID(int64_t ItemID);                                                                       // [0x326e380] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetFullWeaponValueTrade
	// int32_t GetFullWeaponValueTrade(class UObject* WorldContextObject, uint64_t WeaponAssembleID);                           // [0x326e2b0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetFullWeaponValue
	// int32_t GetFullWeaponValue(uint64_t WeaponAssembleID);                                                                   // [0x326e220] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetFirstMainWeaponValue
	// uint32_t GetFirstMainWeaponValue(class ASGCharacter* Character);                                                         // [0x326e190] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetEquipAttachPositionById
	// EAttachPosition GetEquipAttachPositionById(uint64_t ItemID);                                                             // [0x326e100] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetDrugValue
	// uint32_t GetDrugValue(class ASGCharacter* Character);                                                                    // [0x326e070] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetCurWeaponValue
	// uint32_t GetCurWeaponValue(class ASGCharacter* Character);                                                               // [0x326df40] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetCurInventory
	// class ASGInventory* GetCurInventory(class ACharacter* Character);                                                        // [0x326deb0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetCommonItemValueTrade
	// int32_t GetCommonItemValueTrade(class UObject* WorldContextObject, uint64_t ItemID, int32_t Count);                      // [0x326ddb0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetCommonItemValueByID
	// int32_t GetCommonItemValueByID(int64_t ItemID, int32_t Count);                                                           // [0x326dce0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UAInventoryStatics.GetCommonItemValue
	// int32_t GetCommonItemValue(uint64_t ItemID, int32_t Count);                                                              // [0x326dc10] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetCommonItemDynamicValue
	// int32_t GetCommonItemDynamicValue(uint64_t ItemID, int32_t Count);                                                       // [0x326db40] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetCaseValue
	// uint32_t GetCaseValue(class ASGCharacter* Character);                                                                    // [0x326dab0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetCachedInventoryAsync
	// class ASGInventory* GetCachedInventoryAsync(class USGPlayerItemInfoBase* item, class ACharacter* Character, class ASGAssembleBase* AssembleObj, int32_t& TaskId); // [0x326d960] Final|Native|Static|Public|HasOutParms 
	// Function /Script/UACommon.UAInventoryStatics.GetCachedInventory
	// class ASGInventory* GetCachedInventory(class USGPlayerItemInfoBase* item, class ACharacter* Character, class ASGAssembleBase* AssembleObj); // [0x326d860] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetBulletValue
	// uint32_t GetBulletValue(class ASGCharacter* Character);                                                                  // [0x326d7d0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetBossTokenItemIDFromGroupID
	// uint32_t GetBossTokenItemIDFromGroupID(FName& GroupIDName);                                                              // [0x326d740] Final|Native|Static|Public|HasOutParms 
	// Function /Script/UACommon.UAInventoryStatics.GetAssistWeaponValue
	// uint32_t GetAssistWeaponValue(class ASGCharacter* Character);                                                            // [0x326d6b0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetAssembleInventoryValue
	// void GetAssembleInventoryValue(class ASGInventory* Inventory, int32_t& OutValue, bool bIncludeChild);                    // [0x326d590] Final|Native|Static|Public|HasOutParms 
	// Function /Script/UACommon.UAInventoryStatics.GetArmorValue
	// uint32_t GetArmorValue(class ASGCharacter* Character);                                                                   // [0x326d500] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetArmorLevelFromDetailConfTable
	// int32_t GetArmorLevelFromDetailConfTable(uint64_t ItemID);                                                               // [0x326d470] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetAllSafeBoxValue
	// uint32_t GetAllSafeBoxValue(class ASGCharacter* Character);                                                              // [0x326d3e0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetAllEquipmentValue
	// uint32_t GetAllEquipmentValue(class ASGCharacter* Character);                                                            // [0x326d350] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetAllEquipArmorValue
	// int32_t GetAllEquipArmorValue(class ASGCharacter* Character);                                                            // [0x326d2c0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.GetAdviseInv
	// class ASGInventory* GetAdviseInv(TArray<ASGInventory*> InvMap, class ASGCharacter* SGCharacter);                         // [0x326d190] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UAInventoryStatics.FindItemIDByInventoryClass
	// uint64_t FindItemIDByInventoryClass(class UClass* SGInventory);                                                          // [0x326d0a0] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.FindItemIDByDataTable
	// uint64_t FindItemIDByDataTable(class ASGInventory* SGInventory);                                                         // [0x326d010] Final|Native|Static|Public 
	// Function /Script/UACommon.UAInventoryStatics.FindInventoryFromGID
	// class ASGInventory* FindInventoryFromGID(uint64_t InventoryGid, class ACharacter* Character);                            // [0x326cf40] Final|Native|Static|Public 
};

/// Class /Script/UACommon.UAListView
/// Size: 0x0580 (1408 bytes) (0x0003B0 - 0x000930) align 16 pad: 0x0000
class UUAListView : public UListView
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x03B0   (0x0008)  MISSED
	TArray<class UAkAudioEvent*>                       ClickAudioEvents;                                           // 0x03B8   (0x0010)  
	bool                                               bScrollable;                                                // 0x03C8   (0x0001)  
	ESlateVisibility                                   ScrollBarVisibility;                                        // 0x03C9   (0x0001)  
	bool                                               CanRightClickScrolling;                                     // 0x03CA   (0x0001)  
	unsigned char                                      UnknownData01_6[0x1];                                       // 0x03CB   (0x0001)  MISSED
	float                                              AnimationDelay;                                             // 0x03CC   (0x0004)  
	FScrollBarStyle                                    WidgetBarStyle;                                             // 0x03D0   (0x0518)  
	unsigned char                                      UnknownData02_7[0x48];                                      // 0x08E8   (0x0048)  MISSED


	/// Functions
	// Function /Script/UACommon.UAListView.StopDelayAnimation
	// void StopDelayAnimation();                                                                                               // [0x32788a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.UAListView.SetPlayAnimationInitIndex
	// void SetPlayAnimationInitIndex(int32_t Index);                                                                           // [0x3278810] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.UAListView.PlayDelayAnimation
	// void PlayDelayAnimation();                                                                                               // [0x32784f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.UAListView.OnListEntryInitialized
	// void OnListEntryInitialized(class UObject* item, class UUserWidget* Widget);                                             // [0x3278370] Final|Native|Private 
};

/// Class /Script/UACommon.UALocalizationStatic
/// Size: 0x0330 (816 bytes) (0x000028 - 0x000358) align 8 pad: 0x0000
class UUALocalizationStatic : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x330];                                     // 0x0028   (0x0330)  MISSED


	/// Functions
	// Function /Script/UACommon.UALocalizationStatic.SetLocalizationCulture
	// void SetLocalizationCulture(FString& culture);                                                                           // [0x3278760] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UALocalizationStatic.ReloadTextLocalization
	// void ReloadTextLocalization();                                                                                           // [0x3278720] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.UALocalizationStatic.PreviewLocalizationCulture
	// void PreviewLocalizationCulture(FString& culture);                                                                       // [0x19a6b40] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/UACommon.UALocalizationStatic.PatchTextLocalization
	// int32_t PatchTextLocalization(FString InPatchFile);                                                                      // [0x3278440] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.UALocalizationStatic.LoadLocalization
	// void LoadLocalization();                                                                                                 // [0x3278350] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.UALocalizationStatic.IsOverseasPackage
	// bool IsOverseasPackage();                                                                                                // [0x3258be0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UALocalizationStatic.GetValue
	// FText GetValue(FString Key);                                                                                             // [0x3278240] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.UALocalizationStatic.GetLocalizationCulture
	// FString GetLocalizationCulture();                                                                                        // [0x3278140] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.UALocalizationStatic.GetLocalizationBP
	// class UUALocalizationStatic* GetLocalizationBP();                                                                        // [0x3278110] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UALocalizationStatic.GetImageLocalization
	// bool GetImageLocalization(class UImage* Image);                                                                          // [0x3278070] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.UALocalizationStatic.GetDisplayString
	// FString GetDisplayString(FString InNamespace, FString InKey);                                                            // [0x3277f20] Final|Native|Public|BlueprintCallable 
	// Function /Script/UACommon.UALocalizationStatic.CanShowLanguagSetting
	// bool CanShowLanguagSetting();                                                                                            // [0x3277bb0] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/UACommon.UAOverlay
/// Size: 0x0000 (0 bytes) (0x000150 - 0x000150) align 8 pad: 0x0000
class UUAOverlay : public UOverlay
{ 
public:
};

/// Class /Script/UACommon.UAOverlaySlot
/// Size: 0x0008 (8 bytes) (0x000080 - 0x000088) align 8 pad: 0x0000
class UUAOverlaySlot : public UOverlaySlot
{ 
public:
	int32_t                                            ZOrder;                                                     // 0x0080   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0084   (0x0004)  MISSED
};

/// Class /Script/UACommon.UAPanelProfiler
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UUAPanelProfiler : public UObject
{ 
public:


	/// Functions
	// Function /Script/UACommon.UAPanelProfiler.ResetProfileDepth
	// void ResetProfileDepth();                                                                                                // [0x3278740] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UAPanelProfiler.PrintProfileInfo
	// void PrintProfileInfo(FString panelName);                                                                                // [0x3278510] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UAPanelProfiler.IsTestOrShipping
	// bool IsTestOrShipping();                                                                                                 // [0xfd8a30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UAPanelProfiler.EndProfiler
	// int32_t EndProfiler(FString panelName, FString phaseName, int32_t animStandardTime);                                     // [0x3277ce0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UAPanelProfiler.BeginProfiler
	// void BeginProfiler(FString panelName, FString phaseName);                                                                // [0x3277ac0] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/UACommon.UAPhotoTakerCommon
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UUAPhotoTakerCommon : public UObject
{ 
public:


	/// Functions
	// Function /Script/UACommon.UAPhotoTakerCommon.TakePhoto
	// FString TakePhoto();                                                                                                     // [0x32788c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UAPhotoTakerCommon.ReleaseLoadedPhotos
	// void ReleaseLoadedPhotos();                                                                                              // [0x3278700] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UAPhotoTakerCommon.GetPhotoSavePath
	// FString GetPhotoSavePath();                                                                                              // [0x32781c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/UACommon.UAPhotoTakerCommon.AsyncLoadPhoto
	// void AsyncLoadPhoto(FString InPhotoName, class UImage* Image);                                                           // [0x32779f0] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/UACommon.UARedPointWidget
/// Size: 0x0018 (24 bytes) (0x000288 - 0x0002A0) align 8 pad: 0x0000
class UUARedPointWidget : public UUserWidget
{ 
public:
	FString                                            RedPointType;                                               // 0x0288   (0x0010)  
	bool                                               AutoRegist;                                                 // 0x0298   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0299   (0x0007)  MISSED
};

/// Class /Script/UACommon.UATileView
/// Size: 0x0010 (16 bytes) (0x0003E0 - 0x0003F0) align 8 pad: 0x0000
class UUATileView : public UTileView
{ 
public:
	TArray<class UAkAudioEvent*>                       ClickAudioEvents;                                           // 0x03E0   (0x0010)  
};

/// Class /Script/UACommon.UATreeView
/// Size: 0x0010 (16 bytes) (0x000408 - 0x000418) align 8 pad: 0x0000
class UUATreeView : public UTreeView
{ 
public:
	TArray<class UAkAudioEvent*>                       ClickAudioEvents;                                           // 0x0408   (0x0010)  
};

/// Class /Script/UACommon.UAWareHouseComponent
/// Size: 0x0010 (16 bytes) (0x0000F8 - 0x000108) align 8 pad: 0x0000
class UUAWareHouseComponent : public UActorComponent
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x00F8   (0x0008)  MISSED
	class UClass*                                      DefaulWareHouseInventory;                                   // 0x0100   (0x0008)  
};

/// Class /Script/UACommon.UMGHelperLibrary
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UUMGHelperLibrary : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/UACommon.UMGHelperLibrary.FindWidgetByName
	// class UWidget* FindWidgetByName(class UUserWidget* InUMGWidget, FName Name);                                             // [0x3277e20] Final|BlueprintAuthorityOnly|Native|Static|Public 
	// Function /Script/UACommon.UMGHelperLibrary.CreateUserWidgetWithName
	// class UUserWidget* CreateUserWidgetWithName(class APlayerController* OwnerPC, class UClass* UserWidgetClass, FName WidgetName); // [0x3277be0] Final|BlueprintAuthorityOnly|Native|Static|Public 
};

/// Class /Script/UACommon.VideoManager
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UVideoManager : public UObject
{ 
public:


	/// Functions
	// Function /Script/UACommon.VideoManager.StopRecorder
	// void StopRecorder();                                                                                                     // [0xd906a0] Final|Native|Public  
	// Function /Script/UACommon.VideoManager.StartRecorder
	// bool StartRecorder();                                                                                                    // [0x197bba0] Final|Native|Public  
	// Function /Script/UACommon.VideoManager.RecordNotify
	// void RecordNotify(int32_t eventId, int32_t ErrorCode, FString Info);                                                     // [0x32785a0] Final|Native|Public  
	// Function /Script/UACommon.VideoManager.IsRecording
	// bool IsRecording();                                                                                                      // [0x197bba0] Final|Native|Public  
	// Function /Script/UACommon.VideoManager.Init
	// void Init();                                                                                                             // [0xd906a0] Final|Native|Public  
	// Function /Script/UACommon.VideoManager.Get
	// class UVideoManager* Get();                                                                                              // [0x3277ef0] Final|Native|Static|Public 
};

/// Struct /Script/UACommon.TaskDescription
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FTaskDescription
{ 
	FString                                            ETag;                                                       // 0x0000   (0x0010)  
	int32_t                                            FileSize;                                                   // 0x0010   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0014   (0x0004)  MISSED
};

/// Struct /Script/UACommon.KeyInputBlockingConfTableRow
/// Size: 0x0008 (8 bytes) (0x000008 - 0x000010) align 8 pad: 0x0000
struct FKeyInputBlockingConfTableRow : FTableRowBase
{ 
	EPCInputButton                                     ActionName;                                                 // 0x0008   (0x0001)  
	bool                                               FrontEnd;                                                   // 0x0009   (0x0001)  
	bool                                               InBattle;                                                   // 0x000A   (0x0001)  
	bool                                               notBagOpen;                                                 // 0x000B   (0x0001)  
	bool                                               notMapOpen;                                                 // 0x000C   (0x0001)  
	bool                                               notGamesettingOpen;                                         // 0x000D   (0x0001)  
	unsigned char                                      UnknownData00_7[0x2];                                       // 0x000E   (0x0002)  MISSED
};

/// Struct /Script/UACommon.CommonActionKeyNameConfTableRow
/// Size: 0x0080 (128 bytes) (0x000008 - 0x000088) align 8 pad: 0x0000
struct FCommonActionKeyNameConfTableRow : FTableRowBase
{ 
	uint32_t                                           ID;                                                         // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FText                                              ActionName;                                                 // 0x0010   (0x0018)  
	FText                                              OperationName;                                              // 0x0028   (0x0018)  
	int32_t                                            Scale;                                                      // 0x0040   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0044   (0x0004)  MISSED
	FText                                              KeyDescribeName;                                            // 0x0048   (0x0018)  
	int32_t                                            typeId;                                                     // 0x0060   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x0064   (0x0004)  MISSED
	FText                                              KeyTypeName;                                                // 0x0068   (0x0018)  
	int32_t                                            subTypeId;                                                  // 0x0080   (0x0004)  
	int32_t                                            RelationCounts;                                             // 0x0084   (0x0004)  
};

/// Struct /Script/UACommon.CAMapAreaTextureInfo
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FCAMapAreaTextureInfo
{ 
	int32_t                                            AreaID;                                                     // 0x0000   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0004   (0x0004)  MISSED
	class UTexture2D*                                  MapTexture;                                                 // 0x0008   (0x0008)  
};

/// Struct /Script/UACommon.CALevelMapInfoTableRow
/// Size: 0x0088 (136 bytes) (0x000008 - 0x000090) align 8 pad: 0x0000
struct FCALevelMapInfoTableRow : FTableRowBase
{ 
	int32_t                                            MapID;                                                      // 0x0008   (0x0004)  
	FVector                                            WorldCenter;                                                // 0x000C   (0x000C)  
	FVector                                            MapTopLeftLocation;                                         // 0x0018   (0x000C)  
	FVector                                            WorldNorthAngleOffset;                                      // 0x0024   (0x000C)  
	class UTexture2D*                                  MapTexture;                                                 // 0x0030   (0x0008)  
	class UTexture2D*                                  Map2LTexture;                                               // 0x0038   (0x0008)  
	SDK_UNDEFINED(40,2308) /* TWeakObjectPtr<UTexture2D*> */ __um(CoreAreaTexturePath);                            // 0x0040   (0x0028)  
	TArray<FCAMapAreaTextureInfo>                      MapAreaTextureInfos;                                        // 0x0068   (0x0010)  
	TArray<char>                                       CoreRawData;                                                // 0x0078   (0x0010)  
	int32_t                                            CoreWidth;                                                  // 0x0088   (0x0004)  
	int32_t                                            CoreHeight;                                                 // 0x008C   (0x0004)  
};

/// Struct /Script/UACommon.MagazineIconConfTable
/// Size: 0x0008 (8 bytes) (0x000008 - 0x000010) align 8 pad: 0x0000
struct FMagazineIconConfTable : FTableRowBase
{ 
	int32_t                                            item_id;                                                    // 0x0008   (0x0004)  
	int32_t                                            min_num;                                                    // 0x000C   (0x0004)  
};

/// Struct /Script/UACommon.ItemIntervalTable
/// Size: 0x0058 (88 bytes) (0x000008 - 0x000060) align 8 pad: 0x0000
struct FItemIntervalTable : FTableRowBase
{ 
	int32_t                                            Item_type;                                                  // 0x0008   (0x0004)  
	float                                              Interval;                                                   // 0x000C   (0x0004)  
	SDK_UNDEFINED(80,2309) /* TMap<int32_t, float> */  __um(item_id_interval_map);                                 // 0x0010   (0x0050)  
};

/// Struct /Script/UACommon.SystemUnlockTable
/// Size: 0x0008 (8 bytes) (0x000008 - 0x000010) align 8 pad: 0x0000
struct FSystemUnlockTable : FTableRowBase
{ 
	int32_t                                            sys_id;                                                     // 0x0008   (0x0004)  
	bool                                               NeedUnlockAnim;                                             // 0x000C   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x000D   (0x0003)  MISSED
};

/// Struct /Script/UACommon.LootStaticPointDetailTable
/// Size: 0x0068 (104 bytes) (0x000008 - 0x000070) align 8 pad: 0x0000
struct FLootStaticPointDetailTable : FTableRowBase
{ 
	int32_t                                            ID;                                                         // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FString                                            desc;                                                       // 0x0010   (0x0010)  
	SDK_UNDEFINED(80,2310) /* TMap<ELevelDifficult, FLootDetailTable> */ __um(LootDetail);                         // 0x0020   (0x0050)  
};

/// Struct /Script/UACommon.NumDistribute
/// Size: 0x0008 (8 bytes) (0x000008 - 0x000010) align 8 pad: 0x0000
struct FNumDistribute : FTableRowBase
{ 
	int32_t                                            Distribution;                                               // 0x0008   (0x0004)  
	int32_t                                            Num;                                                        // 0x000C   (0x0004)  
};

/// Struct /Script/UACommon.LoosePoint
/// Size: 0x0010 (16 bytes) (0x000008 - 0x000018) align 8 pad: 0x0000
struct FLoosePoint : FTableRowBase
{ 
	int32_t                                            Distribution;                                               // 0x0008   (0x0004)  
	int32_t                                            ItemID;                                                     // 0x000C   (0x0004)  
	int32_t                                            MinCount;                                                   // 0x0010   (0x0004)  
	int32_t                                            MaxCount;                                                   // 0x0014   (0x0004)  
};

/// Struct /Script/UACommon.ActiveLoosePoint
/// Size: 0x0020 (32 bytes) (0x000008 - 0x000028) align 8 pad: 0x0000
struct FActiveLoosePoint : FTableRowBase
{ 
	FLoosePoint                                        LoosePoint;                                                 // 0x0008   (0x0018)  
	int32_t                                            ActiveId;                                                   // 0x0020   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0024   (0x0004)  MISSED
};

/// Struct /Script/UACommon.LootDetailTable
/// Size: 0x0048 (72 bytes) (0x000008 - 0x000050) align 8 pad: 0x0000
struct FLootDetailTable : FTableRowBase
{ 
	int32_t                                            ID;                                                         // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	TArray<FNumDistribute>                             Count;                                                      // 0x0010   (0x0010)  
	TArray<FLoosePoint>                                LoosePoints;                                                // 0x0020   (0x0010)  
	TArray<FLoosePoint>                                FixedLoosePoints;                                           // 0x0030   (0x0010)  
	TArray<FActiveLoosePoint>                          ActivateLoosePoints;                                        // 0x0040   (0x0010)  
};

/// Struct /Script/UACommon.MapStaticPointTable
/// Size: 0x0088 (136 bytes) (0x000008 - 0x000090) align 16 pad: 0x0000
struct FMapStaticPointTable : FTableRowBase
{ 
	int32_t                                            MapID;                                                      // 0x0008   (0x0004)  
	int32_t                                            RuleID;                                                     // 0x000C   (0x0004)  
	ELevelDifficult                                    LevelDifficult;                                             // 0x0010   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0011   (0x0007)  MISSED
	FString                                            PointName;                                                  // 0x0018   (0x0010)  
	unsigned char                                      UnknownData01_6[0x8];                                       // 0x0028   (0x0008)  MISSED
	FTransform                                         Transform;                                                  // 0x0030   (0x0030)  
	int32_t                                            LootPointType;                                              // 0x0060   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x0064   (0x0004)  MISSED
	class UClass*                                      InvClass;                                                   // 0x0068   (0x0008)  
	int32_t                                            LinkStaticPointDetailId;                                    // 0x0070   (0x0004)  
	unsigned char                                      UnknownData03_6[0x4];                                       // 0x0074   (0x0004)  MISSED
	FString                                            Comments;                                                   // 0x0078   (0x0010)  
	unsigned char                                      UnknownData04_7[0x8];                                       // 0x0088   (0x0008)  MISSED
};

/// Struct /Script/UACommon.RookieTipTable
/// Size: 0x0080 (128 bytes) (0x000008 - 0x000088) align 8 pad: 0x0000
struct FRookieTipTable : FTableRowBase
{ 
	int32_t                                            tip_id;                                                     // 0x0008   (0x0004)  
	ERookieTipType                                     Type;                                                       // 0x000C   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x000D   (0x0003)  MISSED
	FText                                              Text;                                                       // 0x0010   (0x0018)  
	FString                                            listen_action;                                              // 0x0028   (0x0010)  
	TArray<int32_t>                                    next_ids;                                                   // 0x0038   (0x0010)  
	bool                                               is_key;                                                     // 0x0048   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0049   (0x0003)  MISSED
	int32_t                                            talkcharacter;                                              // 0x004C   (0x0004)  
	FString                                            sound_name;                                                 // 0x0050   (0x0010)  
	float                                              remain_time;                                                // 0x0060   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x0064   (0x0004)  MISSED
	TArray<FString>                                    exec_action;                                                // 0x0068   (0x0010)  
	TArray<int32_t>                                    face_paint_ids;                                             // 0x0078   (0x0010)  
};

/// Struct /Script/UACommon.RookieLimitTable
/// Size: 0x0058 (88 bytes) (0x000008 - 0x000060) align 8 pad: 0x0000
struct FRookieLimitTable : FTableRowBase
{ 
	int32_t                                            ID;                                                         // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	SDK_UNDEFINED(80,2311) /* TMap<int32_t, bool> */   __um(sys_id_changes);                                       // 0x0010   (0x0050)  
};

/// Struct /Script/UACommon.RicochetTable
/// Size: 0x0010 (16 bytes) (0x000008 - 0x000018) align 8 pad: 0x0000
struct FRicochetTable : FTableRowBase
{ 
	float                                              armor_ricochetangle;                                        // 0x0008   (0x0004)  
	float                                              armor_ricochetprobabilitymin;                               // 0x000C   (0x0004)  
	float                                              armor_ricochetprobabilitymax;                               // 0x0010   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0014   (0x0004)  MISSED
};

/// Struct /Script/UACommon.AliasesTableMessage
/// Size: 0x0060 (96 bytes) (0x000000 - 0x000060) align 8 pad: 0x0000
struct FAliasesTableMessage
{ 
	SDK_UNDEFINED(80,2312) /* TMap<int32_t, FAliases> */ __um(AliasesTable);                                       // 0x0000   (0x0050)  
	TArray<FLoosePoint>                                LoosePointMessages;                                         // 0x0050   (0x0010)  
};

/// Struct /Script/UACommon.LoosePointAliasesTable
/// Size: 0x0068 (104 bytes) (0x000008 - 0x000070) align 8 pad: 0x0000
struct FLoosePointAliasesTable : FTableRowBase
{ 
	FName                                              LinkLoosePointDetailID;                                     // 0x0008   (0x0008)  
	FAliasesTableMessage                               AliasesTableMessage;                                        // 0x0010   (0x0060)  
};

/// Struct /Script/UACommon.Aliases
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 4 pad: 0x0000
struct FAliases
{ 
	float                                              Rate;                                                       // 0x0000   (0x0004)  
	int32_t                                            Idx;                                                        // 0x0004   (0x0004)  
};

/// Struct /Script/UACommon.MapLoosePoint
/// Size: 0x0088 (136 bytes) (0x000008 - 0x000090) align 16 pad: 0x0000
struct FMapLoosePoint : FTableRowBase
{ 
	int32_t                                            MapID;                                                      // 0x0008   (0x0004)  
	int32_t                                            RuleID;                                                     // 0x000C   (0x0004)  
	FString                                            PointName;                                                  // 0x0010   (0x0010)  
	FTransform                                         Root;                                                       // 0x0020   (0x0030)  
	ELoosePointType                                    LoosePointType;                                             // 0x0050   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0051   (0x0007)  MISSED
	FString                                            Comments;                                                   // 0x0058   (0x0010)  
	TArray<FTransform>                                 RandomPos;                                                  // 0x0068   (0x0010)  
	FName                                              LinkLoosePointDetailID;                                     // 0x0078   (0x0008)  
	int32_t                                            Distributed;                                                // 0x0080   (0x0004)  
	unsigned char                                      UnknownData01_7[0xC];                                       // 0x0084   (0x000C)  MISSED
};

/// Struct /Script/UACommon.LoosePointMapMessage
/// Size: 0x0018 (24 bytes) (0x000008 - 0x000020) align 8 pad: 0x0000
struct FLoosePointMapMessage : FTableRowBase
{ 
	int32_t                                            MapID;                                                      // 0x0008   (0x0004)  
	int32_t                                            TotalWeight;                                                // 0x000C   (0x0004)  
	TArray<FMapLoosePoint>                             SortLoosePoints;                                            // 0x0010   (0x0010)  
};

/// Struct /Script/UACommon.LoosePointDetail
/// Size: 0x0028 (40 bytes) (0x000008 - 0x000030) align 8 pad: 0x0000
struct FLoosePointDetail : FTableRowBase
{ 
	int32_t                                            ID;                                                         // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FString                                            desc;                                                       // 0x0010   (0x0010)  
	TArray<FLoosePoint>                                LoosePoints;                                                // 0x0020   (0x0010)  
};

/// Struct /Script/UACommon.ItemCamOffsetOverrideConf
/// Size: 0x0010 (16 bytes) (0x000008 - 0x000018) align 8 pad: 0x0000
struct FItemCamOffsetOverrideConf : FTableRowBase
{ 
	uint32_t                                           ItemID;                                                     // 0x0008   (0x0004)  
	FVector                                            Offset;                                                     // 0x000C   (0x000C)  
};

/// Struct /Script/UACommon.ItemCornerIconConf
/// Size: 0x0018 (24 bytes) (0x000008 - 0x000020) align 8 pad: 0x0000
struct FItemCornerIconConf : FTableRowBase
{ 
	FString                                            TypeName;                                                   // 0x0008   (0x0010)  
	class UPaperSprite*                                icon;                                                       // 0x0018   (0x0008)  
};

/// Struct /Script/UACommon.ItemColorConf
/// Size: 0x0040 (64 bytes) (0x000008 - 0x000048) align 8 pad: 0x0000
struct FItemColorConf : FTableRowBase
{ 
	FLinearColor                                       Color;                                                      // 0x0008   (0x0010)  
	TArray<uint32_t>                                   SupportTypes;                                               // 0x0018   (0x0010)  
	TArray<uint32_t>                                   IgnoreTypes;                                                // 0x0028   (0x0010)  
	TArray<int32_t>                                    rarity;                                                     // 0x0038   (0x0010)  
};

/// Struct /Script/UACommon.IniFileBackup
/// Size: 0x0160 (352 bytes) (0x000000 - 0x000160) align 8 pad: 0x0000
struct FIniFileBackup
{ 
	FString                                            IniName;                                                    // 0x0000   (0x0010)  
	TArray<FString>                                    ClassesReloaded;                                            // 0x0010   (0x0010)  
	unsigned char                                      UnknownData00_7[0x140];                                     // 0x0020   (0x0140)  MISSED
};

/// Struct /Script/UACommon.BuglyData
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 8 pad: 0x0000
struct FBuglyData
{ 
	FString                                            URL;                                                        // 0x0000   (0x0010)  
	FString                                            Time;                                                       // 0x0010   (0x0010)  
};

/// Struct /Script/UACommon.SceneCaptureConfig
/// Size: 0x00B0 (176 bytes) (0x000000 - 0x0000B0) align 16 pad: 0x0000
struct FSceneCaptureConfig
{ 
	FTransform                                         CameraTransform;                                            // 0x0000   (0x0030)  
	float                                              FOV;                                                        // 0x0030   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0034   (0x0004)  MISSED
	class UTextureRenderTarget2D*                      TextureTarget;                                              // 0x0038   (0x0008)  
	bool                                               bIsCasual;                                                  // 0x0040   (0x0001)  
	unsigned char                                      UnknownData01_6[0x7];                                       // 0x0041   (0x0007)  MISSED
	FString                                            Light_Rifle_Male;                                           // 0x0048   (0x0010)  
	FString                                            Light_Pistol_Male;                                          // 0x0058   (0x0010)  
	FString                                            Light_Melee_Male;                                           // 0x0068   (0x0010)  
	FString                                            Light_Rifle_Female;                                         // 0x0078   (0x0010)  
	FString                                            Light_Pistol_Female;                                        // 0x0088   (0x0010)  
	FString                                            Light_Melee_Female;                                         // 0x0098   (0x0010)  
	unsigned char                                      UnknownData02_7[0x8];                                       // 0x00A8   (0x0008)  MISSED
};

/// Struct /Script/UACommon.UAFrontEndStageTableRow
/// Size: 0x0058 (88 bytes) (0x000008 - 0x000060) align 8 pad: 0x0000
struct FUAFrontEndStageTableRow : FTableRowBase
{ 
	uint32_t                                           ID;                                                         // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FString                                            SequenceTag;                                                // 0x0010   (0x0010)  
	bool                                               bReversePlay;                                               // 0x0020   (0x0001)  
	unsigned char                                      UnknownData01_6[0x7];                                       // 0x0021   (0x0007)  MISSED
	FString                                            CameraStartFocus;                                           // 0x0028   (0x0010)  
	FString                                            CameraEndFocus;                                             // 0x0038   (0x0010)  
	float                                              CameraMoveSpeed;                                            // 0x0048   (0x0004)  
	bool                                               bNeedSfx;                                                   // 0x004C   (0x0001)  
	unsigned char                                      UnknownData02_6[0x3];                                       // 0x004D   (0x0003)  MISSED
	FString                                            Comment;                                                    // 0x0050   (0x0010)  
};

/// Struct /Script/UACommon.UAGamePadVisibilityTableRow
/// Size: 0x0038 (56 bytes) (0x000008 - 0x000040) align 8 pad: 0x0000
struct FUAGamePadVisibilityTableRow : FTableRowBase
{ 
	uint32_t                                           ID;                                                         // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FString                                            WidgetName;                                                 // 0x0010   (0x0010)  
	uint32_t                                           TutorialActive;                                             // 0x0020   (0x0004)  
	uint32_t                                           RangeActive;                                                // 0x0024   (0x0004)  
	uint32_t                                           NormalActive;                                               // 0x0028   (0x0004)  
	uint32_t                                           DBNOActive;                                                 // 0x002C   (0x0004)  
	uint32_t                                           SpectatingActive;                                           // 0x0030   (0x0004)  
	uint32_t                                           OBActive;                                                   // 0x0034   (0x0004)  
	uint32_t                                           OBFreeView;                                                 // 0x0038   (0x0004)  
	uint32_t                                           VehicleView;                                                // 0x003C   (0x0004)  
};

/// Struct /Script/UACommon.UATutorialEventTable
/// Size: 0x0068 (104 bytes) (0x000008 - 0x000070) align 8 pad: 0x0000
struct FUATutorialEventTable : FTableRowBase
{ 
	FString                                            EventName;                                                  // 0x0008   (0x0010)  
	int32_t                                            MaxTimesInGame;                                             // 0x0018   (0x0004)  
	int32_t                                            MaxTimesInCareer;                                           // 0x001C   (0x0004)  
	int32_t                                            NotTriggerTimesInCareer;                                    // 0x0020   (0x0004)  
	int32_t                                            CD;                                                         // 0x0024   (0x0004)  
	FString                                            ExtraParaText1;                                             // 0x0028   (0x0010)  
	int32_t                                            ExtraPara1;                                                 // 0x0038   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x003C   (0x0004)  MISSED
	FString                                            ExtraParaText2;                                             // 0x0040   (0x0010)  
	int32_t                                            ExtraPara2;                                                 // 0x0050   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0054   (0x0004)  MISSED
	FString                                            ExtraParaText3;                                             // 0x0058   (0x0010)  
	int32_t                                            ExtraPara3;                                                 // 0x0068   (0x0004)  
	unsigned char                                      UnknownData02_7[0x4];                                       // 0x006C   (0x0004)  MISSED
};

/// Struct /Script/UACommon.UAAdviseInvPriorityTable
/// Size: 0x00C0 (192 bytes) (0x000008 - 0x0000C8) align 8 pad: 0x0000
struct FUAAdviseInvPriorityTable : FTableRowBase
{ 
	FString                                            characterState;                                             // 0x0008   (0x0010)  
	FString                                            AdviseInvType1;                                             // 0x0018   (0x0010)  
	FString                                            AdviseInvType2;                                             // 0x0028   (0x0010)  
	FString                                            AdviseInvType3;                                             // 0x0038   (0x0010)  
	FString                                            AdviseInvType4;                                             // 0x0048   (0x0010)  
	FString                                            AdviseInvType5;                                             // 0x0058   (0x0010)  
	FString                                            AdviseInvType6;                                             // 0x0068   (0x0010)  
	FString                                            AdviseInvType7;                                             // 0x0078   (0x0010)  
	FString                                            AdviseInvType8;                                             // 0x0088   (0x0010)  
	FString                                            AdviseInvType9;                                             // 0x0098   (0x0010)  
	FString                                            AdviseInvType10;                                            // 0x00A8   (0x0010)  
	FString                                            AdviseInvTypeEnd;                                           // 0x00B8   (0x0010)  
};

/// Struct /Script/UACommon.UAAIUniqueItemInfoTable
/// Size: 0x0008 (8 bytes) (0x000008 - 0x000010) align 8 pad: 0x0000
struct FUAAIUniqueItemInfoTable : FTableRowBase
{ 
	int32_t                                            ItemID;                                                     // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x000C   (0x0004)  MISSED
};

/// Struct /Script/UACommon.UAFactionRelationTable
/// Size: 0x0010 (16 bytes) (0x000008 - 0x000018) align 8 pad: 0x0000
struct FUAFactionRelationTable : FTableRowBase
{ 
	EFactionRelationType                               NormalPMC;                                                  // 0x0008   (0x0001)  
	EFactionRelationType                               NormalScav;                                                 // 0x0009   (0x0001)  
	EFactionRelationType                               PlayerScav;                                                 // 0x000A   (0x0001)  
	EFactionRelationType                               RebelFaction;                                               // 0x000B   (0x0001)  
	EFactionRelationType                               LakeFaction;                                                // 0x000C   (0x0001)  
	EFactionRelationType                               GangsterFaction;                                            // 0x000D   (0x0001)  
	EFactionRelationType                               KurtTeam;                                                   // 0x000E   (0x0001)  
	EFactionRelationType                               NavyFaction;                                                // 0x000F   (0x0001)  
	EFactionRelationType                               Blackgold;                                                  // 0x0010   (0x0001)  
	EFactionRelationType                               Gnesk;                                                      // 0x0011   (0x0001)  
	unsigned char                                      UnknownData00_7[0x6];                                       // 0x0012   (0x0006)  MISSED
};

/// Struct /Script/UACommon.UAMultiModeWidgetTable
/// Size: 0x0040 (64 bytes) (0x000008 - 0x000048) align 8 pad: 0x0000
struct FUAMultiModeWidgetTable : FTableRowBase
{ 
	int32_t                                            ID;                                                         // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FText                                              Name;                                                       // 0x0010   (0x0018)  
	FString                                            sysIds;                                                     // 0x0028   (0x0010)  
	bool                                               isShowMode;                                                 // 0x0038   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0039   (0x0003)  MISSED
	int32_t                                            use_ticket;                                                 // 0x003C   (0x0004)  
	int32_t                                            need_take_in_threshold;                                     // 0x0040   (0x0004)  
	int32_t                                            default_avatar_set_id;                                      // 0x0044   (0x0004)  
};

/// Struct /Script/UACommon.UATraceStyleTable
/// Size: 0x01E8 (488 bytes) (0x000008 - 0x0001F0) align 8 pad: 0x0000
struct FUATraceStyleTable : FTableRowBase
{ 
	int32_t                                            StyleID;                                                    // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FString                                            Annotation;                                                 // 0x0010   (0x0010)  
	SDK_UNDEFINED(40,2313) /* TWeakObjectPtr<UClass*> */ __um(TemplateUMG_Resource);                               // 0x0020   (0x0028)  
	int32_t                                            ZOrder;                                                     // 0x0048   (0x0004)  
	float                                              EffectDistance;                                             // 0x004C   (0x0004)  
	float                                              OpacityOnVisible;                                           // 0x0050   (0x0004)  
	float                                              OpacityOnInvisible;                                         // 0x0054   (0x0004)  
	FSlateColor                                        Image_Circle_Color_Normal;                                  // 0x0058   (0x0028)  
	FSlateColor                                        Image_Circle_Color_Teamate;                                 // 0x0080   (0x0028)  
	FSlateColor                                        Image_Circle_Color_Enemy;                                   // 0x00A8   (0x0028)  
	FString                                            Image_BG_Path;                                              // 0x00D0   (0x0010)  
	FSlateColor                                        Image_BG_Color_Normal;                                      // 0x00E0   (0x0028)  
	FSlateColor                                        Image_BG_Color_Teamate;                                     // 0x0108   (0x0028)  
	FSlateColor                                        Image_BG_Color_Enemy;                                       // 0x0130   (0x0028)  
	FString                                            Image_Icon_Path;                                            // 0x0158   (0x0010)  
	FSlateColor                                        Image_Icon_Color_Normal;                                    // 0x0168   (0x0028)  
	FSlateColor                                        Image_Icon_Color_Teamate;                                   // 0x0190   (0x0028)  
	FSlateColor                                        Image_Icon_Color_Enemy;                                     // 0x01B8   (0x0028)  
	TArray<FString>                                    Params;                                                     // 0x01E0   (0x0010)  
};

/// Struct /Script/UACommon.UATraceSceneStyleParams
/// Size: 0x0038 (56 bytes) (0x000000 - 0x000038) align 8 pad: 0x0000
struct FUATraceSceneStyleParams
{ 
	float                                              OpactiyInVision;                                            // 0x0000   (0x0004)  
	float                                              OpactiyNotInVision;                                         // 0x0004   (0x0004)  
	float                                              OpacityOutofDistance;                                       // 0x0008   (0x0004)  
	float                                              ShortShowDistance;                                          // 0x000C   (0x0004)  
	FString                                            HighlightAniName;                                           // 0x0010   (0x0010)  
	int32_t                                            AniLoopTimes;                                               // 0x0020   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0024   (0x0004)  MISSED
	TArray<FString>                                    Params;                                                     // 0x0028   (0x0010)  
};

/// Struct /Script/UACommon.UATraceNewMapStyleParams
/// Size: 0x0060 (96 bytes) (0x000000 - 0x000060) align 8 pad: 0x0000
struct FUATraceNewMapStyleParams
{ 
	SDK_UNDEFINED(40,2314) /* TWeakObjectPtr<UClass*> */ __um(UMGType);                                            // 0x0000   (0x0028)  
	int32_t                                            ZOrder;                                                     // 0x0028   (0x0004)  
	bool                                               HighLightMapIcon;                                           // 0x002C   (0x0001)  
	bool                                               bShowArea;                                                  // 0x002D   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x002E   (0x0002)  MISSED
	float                                              DisplayAnimationInterval;                                   // 0x0030   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0034   (0x0004)  MISSED
	FString                                            HighlightAniName;                                           // 0x0038   (0x0010)  
	int32_t                                            AniLoopTimes;                                               // 0x0048   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x004C   (0x0004)  MISSED
	TArray<FString>                                    Params;                                                     // 0x0050   (0x0010)  
};

/// Struct /Script/UACommon.UATraceDirectionalBarStyleParams
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 8 pad: 0x0000
struct FUATraceDirectionalBarStyleParams
{ 
	FString                                            HighlightAniName;                                           // 0x0000   (0x0010)  
	int32_t                                            AniLoopTimes;                                               // 0x0010   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0014   (0x0004)  MISSED
	TArray<FString>                                    Params;                                                     // 0x0018   (0x0010)  
};

/// Struct /Script/UACommon.UANewTraceStyleTable
/// Size: 0x0128 (296 bytes) (0x000008 - 0x000130) align 8 pad: 0x0000
struct FUANewTraceStyleTable : FTableRowBase
{ 
	FString                                            Annotation;                                                 // 0x0008   (0x0010)  
	FSlateColor                                        Color;                                                      // 0x0018   (0x0028)  
	FSoftObjectPath                                    MarkIconResource;                                           // 0x0040   (0x0018)  
	FSoftObjectPath                                    BackgroundResource;                                         // 0x0058   (0x0018)  
	FUATraceSceneStyleParams                           SceneStyleParams;                                           // 0x0070   (0x0038)  
	FUATraceNewMapStyleParams                          NewMapStyleParams;                                          // 0x00A8   (0x0060)  
	FUATraceDirectionalBarStyleParams                  DirectionalBarStyleParams;                                  // 0x0108   (0x0028)  
};

/// Struct /Script/UACommon.UATraceSceneRuleParams
/// Size: 0x000C (12 bytes) (0x000000 - 0x00000C) align 4 pad: 0x0000
struct FUATraceSceneRuleParams
{ 
	bool                                               bCanShow;                                                   // 0x0000   (0x0001)  
	bool                                               bActiveCanShow;                                             // 0x0001   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x0002   (0x0002)  MISSED
	float                                              ShowDistance;                                               // 0x0004   (0x0004)  
	float                                              DrawInverval;                                               // 0x0008   (0x0004)  
};

/// Struct /Script/UACommon.UATraceNewMapRuleParams
/// Size: 0x000C (12 bytes) (0x000000 - 0x00000C) align 4 pad: 0x0000
struct FUATraceNewMapRuleParams
{ 
	bool                                               bCanShow;                                                   // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	float                                              ShowDistance;                                               // 0x0004   (0x0004)  
	float                                              DrawInverval;                                               // 0x0008   (0x0004)  
};

/// Struct /Script/UACommon.UATraceDirectionalBarRuleParams
/// Size: 0x000C (12 bytes) (0x000000 - 0x00000C) align 4 pad: 0x0000
struct FUATraceDirectionalBarRuleParams
{ 
	bool                                               bCanShow;                                                   // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	float                                              ShowDistance;                                               // 0x0004   (0x0004)  
	float                                              DrawInverval;                                               // 0x0008   (0x0004)  
};

/// Struct /Script/UACommon.UANewTraceRuleTable
/// Size: 0x0028 (40 bytes) (0x000008 - 0x000030) align 8 pad: 0x0000
struct FUANewTraceRuleTable : FTableRowBase
{ 
	ENewTraceSyncRule                                  SyncRule;                                                   // 0x0008   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0009   (0x0003)  MISSED
	FUATraceSceneRuleParams                            SceneRuleParams;                                            // 0x000C   (0x000C)  
	FUATraceNewMapRuleParams                           NewMapRuleParams;                                           // 0x0018   (0x000C)  
	FUATraceDirectionalBarRuleParams                   DirectionalBarRuleParams;                                   // 0x0024   (0x000C)  
};

/// Struct /Script/UACommon.UANewTraceConfigTable
/// Size: 0x0088 (136 bytes) (0x000008 - 0x000090) align 8 pad: 0x0000
struct FUANewTraceConfigTable : FTableRowBase
{ 
	ENewTraceableMarkType                              MarkType;                                                   // 0x0008   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0009   (0x0007)  MISSED
	FString                                            TraceRuleRowName;                                           // 0x0010   (0x0010)  
	int32_t                                            TraceStyleID;                                               // 0x0020   (0x0004)  
	float                                              DataSyncInverval;                                           // 0x0024   (0x0004)  
	bool                                               CanInteract;                                                // 0x0028   (0x0001)  
	bool                                               bAutoSelected;                                              // 0x0029   (0x0001)  
	unsigned char                                      UnknownData01_6[0x6];                                       // 0x002A   (0x0006)  MISSED
	FText                                              TraceTitle;                                                 // 0x0030   (0x0018)  
	FText                                              TraceDesc;                                                  // 0x0048   (0x0018)  
	FText                                              TargetTitle;                                                // 0x0060   (0x0018)  
	FText                                              TargetDesc;                                                 // 0x0078   (0x0018)  
};

/// Struct /Script/UACommon.UATraceTargetTable
/// Size: 0x0088 (136 bytes) (0x000008 - 0x000090) align 8 pad: 0x0000
struct FUATraceTargetTable : FTableRowBase
{ 
	int32_t                                            TargetId;                                                   // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FText                                              TargetTitle;                                                // 0x0010   (0x0018)  
	FText                                              TargetDesc;                                                 // 0x0028   (0x0018)  
	bool                                               bShowTrace;                                                 // 0x0040   (0x0001)  
	bool                                               bIsClick;                                                   // 0x0041   (0x0001)  
	bool                                               bIsAutoSelect;                                              // 0x0042   (0x0001)  
	unsigned char                                      UnknownData01_6[0x5];                                       // 0x0043   (0x0005)  MISSED
	FText                                              TraceTitle;                                                 // 0x0048   (0x0018)  
	FText                                              TraceDesc;                                                  // 0x0060   (0x0018)  
	FString                                            AnimName;                                                   // 0x0078   (0x0010)  
	int32_t                                            StyleID;                                                    // 0x0088   (0x0004)  
	unsigned char                                      UnknownData02_7[0x4];                                       // 0x008C   (0x0004)  MISSED
};

/// Struct /Script/UACommon.UALootDataInfosTable
/// Size: 0x0028 (40 bytes) (0x000008 - 0x000030) align 8 pad: 0x0000
struct FUALootDataInfosTable : FTableRowBase
{ 
	int32_t                                            LootDataInfoID;                                             // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FString                                            Description;                                                // 0x0010   (0x0010)  
	int32_t                                            LootPointType;                                              // 0x0020   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0024   (0x0004)  MISSED
	class UPaperSprite*                                LootPointIcon;                                              // 0x0028   (0x0008)  
};

/// Struct /Script/UACommon.UABrilliantTimeReplayTableRow
/// Size: 0x0038 (56 bytes) (0x000008 - 0x000040) align 8 pad: 0x0000
struct FUABrilliantTimeReplayTableRow : FTableRowBase
{ 
	int32_t                                            typeId;                                                     // 0x0008   (0x0004)  
	int32_t                                            MapID;                                                      // 0x000C   (0x0004)  
	SDK_UNDEFINED(40,2315) /* TWeakObjectPtr<UMFMissionFlow*> */ __um(MissionFlow);                                // 0x0010   (0x0028)  
	int32_t                                            MinCountToSubmit;                                           // 0x0038   (0x0004)  
	bool                                               NeedEscapeAliveToSubmit;                                    // 0x003C   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x003D   (0x0003)  MISSED
};

/// Struct /Script/UACommon.UASubTitleTextTable
/// Size: 0x0028 (40 bytes) (0x000008 - 0x000030) align 8 pad: 0x0000
struct FUASubTitleTextTable : FTableRowBase
{ 
	int32_t                                            TextMessageId;                                              // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FText                                              Text;                                                       // 0x0010   (0x0018)  
	int32_t                                            GameHUDTypeID;                                              // 0x0028   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x002C   (0x0004)  MISSED
};

/// Struct /Script/UACommon.UASubTitleVOTable
/// Size: 0x0028 (40 bytes) (0x000008 - 0x000030) align 8 pad: 0x0000
struct FUASubTitleVOTable : FTableRowBase
{ 
	int32_t                                            Messageid;                                                  // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FString                                            SoundResource;                                              // 0x0010   (0x0010)  
	int32_t                                            TextMessageId;                                              // 0x0020   (0x0004)  
	FName                                              SoundType;                                                  // 0x0024   (0x0008)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x002C   (0x0004)  MISSED
};

/// Struct /Script/UACommon.ItemConfTableRowBPProxy
/// Size: 0x00C8 (200 bytes) (0x000008 - 0x0000D0) align 8 pad: 0x0000
struct FItemConfTableRowBPProxy : FTableRowBase
{ 
	int32_t                                            ItemID;                                                     // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FString                                            Name;                                                       // 0x0010   (0x0010)  
	FString                                            ShortName;                                                  // 0x0020   (0x0010)  
	uint32_t                                           IconId;                                                     // 0x0030   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0034   (0x0004)  MISSED
	FString                                            Describe;                                                   // 0x0038   (0x0010)  
	int32_t                                            SizeX;                                                      // 0x0048   (0x0004)  
	int32_t                                            SizeY;                                                      // 0x004C   (0x0004)  
	float                                              Weight;                                                     // 0x0050   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x0054   (0x0004)  MISSED
	FString                                            pickup_sound;                                               // 0x0058   (0x0010)  
	FString                                            use_sound;                                                  // 0x0068   (0x0010)  
	FString                                            drop_sound;                                                 // 0x0078   (0x0010)  
	int32_t                                            sell_price;                                                 // 0x0088   (0x0004)  
	uint32_t                                           can_sell;                                                   // 0x008C   (0x0004)  
	int32_t                                            standard_price;                                             // 0x0090   (0x0004)  
	uint32_t                                           StackMax;                                                   // 0x0094   (0x0004)  
	uint32_t                                           not_discard;                                                // 0x0098   (0x0004)  
	uint32_t                                           Bind;                                                       // 0x009C   (0x0004)  
	uint32_t                                           rarity;                                                     // 0x00A0   (0x0004)  
	uint32_t                                           Durability;                                                 // 0x00A4   (0x0004)  
	uint32_t                                           UseExp;                                                     // 0x00A8   (0x0004)  
	int32_t                                            LootExp;                                                    // 0x00AC   (0x0004)  
	TArray<char>                                       RejectSlot;                                                 // 0x00B0   (0x0010)  
	uint32_t                                           sort;                                                       // 0x00C0   (0x0004)  
	uint32_t                                           jump_goto;                                                  // 0x00C4   (0x0004)  
	uint32_t                                           RarityColorIndex;                                           // 0x00C8   (0x0004)  
	unsigned char                                      UnknownData03_7[0x4];                                       // 0x00CC   (0x0004)  MISSED
};

/// Struct /Script/UACommon.LootDropTableRowBPProxy
/// Size: 0x0090 (144 bytes) (0x000008 - 0x000098) align 8 pad: 0x0000
struct FLootDropTableRowBPProxy : FTableRowBase
{ 
	int64_t                                            ID;                                                         // 0x0008   (0x0008)  
	FString                                            desc;                                                       // 0x0010   (0x0010)  
	char                                               ItemType;                                                   // 0x0020   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0021   (0x0007)  MISSED
	int64_t                                            ItemID;                                                     // 0x0028   (0x0008)  
	TArray<int32_t>                                    ItemNum;                                                    // 0x0030   (0x0010)  
	TArray<int64_t>                                    SubItemTable;                                               // 0x0040   (0x0010)  
	int32_t                                            Weight;                                                     // 0x0050   (0x0004)  
	float                                              Percent;                                                    // 0x0054   (0x0004)  
	float                                              RandTimes;                                                  // 0x0058   (0x0004)  
	char                                               OperationType;                                              // 0x005C   (0x0001)  
	char                                               IsPermanent;                                                // 0x005D   (0x0001)  
	unsigned char                                      UnknownData01_6[0x2];                                       // 0x005E   (0x0002)  MISSED
	uint32_t                                           ActID;                                                      // 0x0060   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x0064   (0x0004)  MISSED
	TArray<uint64_t>                                   LootPointWhite;                                             // 0x0068   (0x0010)  
	TArray<uint64_t>                                   LootPointBlack;                                             // 0x0078   (0x0010)  
	FString                                            Describe;                                                   // 0x0088   (0x0010)  
};

/// Struct /Script/UACommon.MapDetailTableRowBPProxy
/// Size: 0x0090 (144 bytes) (0x000008 - 0x000098) align 8 pad: 0x0000
struct FMapDetailTableRowBPProxy : FTableRowBase
{ 
	int32_t                                            ID;                                                         // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FString                                            map_level;                                                  // 0x0010   (0x0010)  
	FString                                            mobile_map_level;                                           // 0x0020   (0x0010)  
	FString                                            Name;                                                       // 0x0030   (0x0010)  
	FString                                            level_path;                                                 // 0x0040   (0x0010)  
	FString                                            Picture;                                                    // 0x0050   (0x0010)  
	FString                                            desc;                                                       // 0x0060   (0x0010)  
	FVector2D                                          MapSize;                                                    // 0x0070   (0x0008)  
	TArray<FVector2D>                                  SampleScenePoints;                                          // 0x0078   (0x0010)  
	TArray<FVector2D>                                  SampleMapPoints;                                            // 0x0088   (0x0010)  
};

/// Struct /Script/UACommon.UACaptureTableRow
/// Size: 0x0010 (16 bytes) (0x000008 - 0x000018) align 8 pad: 0x0000
struct FUACaptureTableRow : FTableRowBase
{ 
	uint32_t                                           ID;                                                         // 0x0008   (0x0004)  
	int32_t                                            X;                                                          // 0x000C   (0x0004)  
	int32_t                                            Y;                                                          // 0x0010   (0x0004)  
	int32_t                                            Z;                                                          // 0x0014   (0x0004)  
};

/// Struct /Script/UACommon.UAEscapeInteractTextTable
/// Size: 0x0020 (32 bytes) (0x000008 - 0x000028) align 8 pad: 0x0000
struct FUAEscapeInteractTextTable : FTableRowBase
{ 
	int32_t                                            EscapeInteractID;                                           // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FText                                              InteractText;                                               // 0x0010   (0x0018)  
};

/// Struct /Script/UACommon.UAPlayerEscapeShowRow
/// Size: 0x0020 (32 bytes) (0x000008 - 0x000028) align 8 pad: 0x0000
struct FUAPlayerEscapeShowRow : FTableRowBase
{ 
	bool                                               enable;                                                     // 0x0008   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0009   (0x0003)  MISSED
	int32_t                                            EscapePointID;                                              // 0x000C   (0x0004)  
	int32_t                                            MaxPlayerNum;                                               // 0x0010   (0x0004)  
	float                                              PlayTime;                                                   // 0x0014   (0x0004)  
	TArray<class APlayerController*>                   PCArr;                                                      // 0x0018   (0x0010)  
};

/// Struct /Script/UACommon.UAEscapeTextTableRow
/// Size: 0x0140 (320 bytes) (0x000008 - 0x000148) align 8 pad: 0x0000
struct FUAEscapeTextTableRow : FTableRowBase
{ 
	int32_t                                            EscapePointID;                                              // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FText                                              EscapeName;                                                 // 0x0010   (0x0018)  
	FText                                              ConditionDescription;                                       // 0x0028   (0x0018)  
	FText                                              ConditionDescShort;                                         // 0x0040   (0x0018)  
	FText                                              ConditionPassText;                                          // 0x0058   (0x0018)  
	FText                                              EscapeDescription;                                          // 0x0070   (0x0018)  
	FText                                              RemainTimeText;                                             // 0x0088   (0x0018)  
	FText                                              AlreadyFailText;                                            // 0x00A0   (0x0018)  
	int32_t                                            EscapeReportID;                                             // 0x00B8   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x00BC   (0x0004)  MISSED
	FText                                              PersonHitContent;                                           // 0x00C0   (0x0018)  
	FText                                              GlobalHitContent;                                           // 0x00D8   (0x0018)  
	FText                                              GlobalCloseHitContent;                                      // 0x00F0   (0x0018)  
	FVector                                            Location;                                                   // 0x0108   (0x000C)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x0114   (0x0004)  MISSED
	FText                                              GlobalLeftTimeHitContent_OpenEscape;                        // 0x0118   (0x0018)  
	FText                                              GlobalLeftTimeHitContent_CloseEscape;                       // 0x0130   (0x0018)  
};

/// Struct /Script/UACommon.PanelLayerTableRow
/// Size: 0x0018 (24 bytes) (0x000008 - 0x000020) align 8 pad: 0x0000
struct FPanelLayerTableRow : FTableRowBase
{ 
	FString                                            LayerName;                                                  // 0x0008   (0x0010)  
	uint32_t                                           StartZOrder;                                                // 0x0018   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x001C   (0x0004)  MISSED
};

/// Struct /Script/UACommon.PanelConfTableRow
/// Size: 0x0050 (80 bytes) (0x000008 - 0x000058) align 8 pad: 0x0000
struct FPanelConfTableRow : FTableRowBase
{ 
	FString                                            Name;                                                       // 0x0008   (0x0010)  
	FString                                            OwnerModule;                                                // 0x0018   (0x0010)  
	FString                                            AssetMobileName;                                            // 0x0028   (0x0010)  
	FString                                            LayerName;                                                  // 0x0038   (0x0010)  
	TArray<FString>                                    OwnerPanel;                                                 // 0x0048   (0x0010)  
};

/// Struct /Script/UACommon.ServiceConfTableRow
/// Size: 0x0050 (80 bytes) (0x000008 - 0x000058) align 8 pad: 0x0000
struct FServiceConfTableRow : FTableRowBase
{ 
	FString                                            Name;                                                       // 0x0008   (0x0010)  
	FString                                            InitContext;                                                // 0x0018   (0x0010)  
	FString                                            ResetContext;                                               // 0x0028   (0x0010)  
	FString                                            desc;                                                       // 0x0038   (0x0010)  
	FString                                            ServiceType;                                                // 0x0048   (0x0010)  
};

/// Struct /Script/UACommon.ModuleContextConfTableRow
/// Size: 0x0030 (48 bytes) (0x000008 - 0x000038) align 8 pad: 0x0000
struct FModuleContextConfTableRow : FTableRowBase
{ 
	FString                                            Name;                                                       // 0x0008   (0x0010)  
	FString                                            LevelPath;                                                  // 0x0018   (0x0010)  
	FString                                            desc;                                                       // 0x0028   (0x0010)  
};

/// Struct /Script/UACommon.ModuleConfTableRow
/// Size: 0x0030 (48 bytes) (0x000008 - 0x000038) align 8 pad: 0x0000
struct FModuleConfTableRow : FTableRowBase
{ 
	FString                                            Name;                                                       // 0x0008   (0x0010)  
	FString                                            Context;                                                    // 0x0018   (0x0010)  
	FString                                            desc;                                                       // 0x0028   (0x0010)  
};

/// Struct /Script/UACommon.UAGameBigMapModuleModeTable
/// Size: 0x0048 (72 bytes) (0x000008 - 0x000050) align 8 pad: 0x0000
struct FUAGameBigMapModuleModeTable : FTableRowBase
{ 
	SDK_UNDEFINED(40,2316) /* TWeakObjectPtr<UClass*> */ __um(BigMapModule);                                       // 0x0008   (0x0028)  
	FText                                              DisplayName;                                                // 0x0030   (0x0018)  
	bool                                               enable;                                                     // 0x0048   (0x0001)  
	bool                                               Switchable;                                                 // 0x0049   (0x0001)  
	bool                                               DefaultState;                                               // 0x004A   (0x0001)  
	unsigned char                                      UnknownData00_7[0x5];                                       // 0x004B   (0x0005)  MISSED
};

/// Struct /Script/UACommon.UAGameLandmarkTable
/// Size: 0x0028 (40 bytes) (0x000008 - 0x000030) align 8 pad: 0x0000
struct FUAGameLandmarkTable : FTableRowBase
{ 
	int32_t                                            MapID;                                                      // 0x0008   (0x0004)  
	int32_t                                            LandMarkId;                                                 // 0x000C   (0x0004)  
	FText                                              LandMarkName;                                               // 0x0010   (0x0018)  
	FVector2D                                          WorldLocation;                                              // 0x0028   (0x0008)  
};

/// Struct /Script/UACommon.UAGameBigMapEffectTable
/// Size: 0x0058 (88 bytes) (0x000008 - 0x000060) align 8 pad: 0x0000
struct FUAGameBigMapEffectTable : FTableRowBase
{ 
	int32_t                                            Messageid;                                                  // 0x0008   (0x0004)  
	int32_t                                            MapID;                                                      // 0x000C   (0x0004)  
	int32_t                                            LandMarkId;                                                 // 0x0010   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0014   (0x0004)  MISSED
	SDK_UNDEFINED(40,2317) /* TWeakObjectPtr<UClass*> */ __um(TemplateUMG_Resource);                               // 0x0018   (0x0028)  
	float                                              StartAtScale;                                               // 0x0040   (0x0004)  
	float                                              EndAtScale;                                                 // 0x0044   (0x0004)  
	bool                                               ShowAtInit;                                                 // 0x0048   (0x0001)  
	bool                                               DynamicSize;                                                // 0x0049   (0x0001)  
	unsigned char                                      UnknownData01_6[0x2];                                       // 0x004A   (0x0002)  MISSED
	int32_t                                            InitSize;                                                   // 0x004C   (0x0004)  
	TArray<int32_t>                                    AreaIDs;                                                    // 0x0050   (0x0010)  
};

/// Struct /Script/UACommon.UALootPointInfo
/// Size: 0x0050 (80 bytes) (0x000008 - 0x000058) align 8 pad: 0x0000
struct FUALootPointInfo : FTableRowBase
{ 
	int32_t                                            MapID;                                                      // 0x0008   (0x0004)  
	int32_t                                            LootPointID;                                                // 0x000C   (0x0004)  
	FVector                                            Location;                                                   // 0x0010   (0x000C)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x001C   (0x0004)  MISSED
	FText                                              AreaName;                                                   // 0x0020   (0x0018)  
	int32_t                                            AreaID;                                                     // 0x0038   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x003C   (0x0004)  MISSED
	FString                                            LevelPath;                                                  // 0x0040   (0x0010)  
	int32_t                                            LootPointType;                                              // 0x0050   (0x0004)  
	int32_t                                            InBigMapAreaID;                                             // 0x0054   (0x0004)  
};

/// Struct /Script/UACommon.UABattleQuickChat
/// Size: 0x0060 (96 bytes) (0x000008 - 0x000068) align 8 pad: 0x0000
struct FUABattleQuickChat : FTableRowBase
{ 
	int32_t                                            Messageid;                                                  // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FString                                            ChatType;                                                   // 0x0010   (0x0010)  
	FText                                              ListName;                                                   // 0x0020   (0x0018)  
	FText                                              ChatContent;                                                // 0x0038   (0x0018)  
	FText                                              ChatSound;                                                  // 0x0050   (0x0018)  
};

/// Struct /Script/UACommon.UAGamePadMessageTable
/// Size: 0x0008 (8 bytes) (0x000008 - 0x000010) align 8 pad: 0x0000
struct FUAGamePadMessageTable : FTableRowBase
{ 
	int32_t                                            Messageid;                                                  // 0x0008   (0x0004)  
	EUAGamePadTable                                    GamePadWidgets;                                             // 0x000C   (0x0001)  
	bool                                               GamePadWidgetVisibility;                                    // 0x000D   (0x0001)  
	EGamePadEffectTable                                GamePadEffectWidgets;                                       // 0x000E   (0x0001)  
	bool                                               GamePadEffectWidgetVisibility;                              // 0x000F   (0x0001)  
};

/// Struct /Script/UACommon.UAGameHUDTable
/// Size: 0x00E0 (224 bytes) (0x000008 - 0x0000E8) align 8 pad: 0x0000
struct FUAGameHUDTable : FTableRowBase
{ 
	int32_t                                            Messageid;                                                  // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	SDK_UNDEFINED(40,2318) /* TWeakObjectPtr<UClass*> */ __um(TemplateUMG_Resource);                               // 0x0010   (0x0028)  
	EUAHUDPreInstallLoc                                Location_Type;                                              // 0x0038   (0x0001)  
	unsigned char                                      UnknownData01_6[0x7];                                       // 0x0039   (0x0007)  MISSED
	SDK_UNDEFINED(40,2319) /* TWeakObjectPtr<UObject*> */ __um(BackGround_Img);                                    // 0x0040   (0x0028)  
	SDK_UNDEFINED(40,2320) /* TWeakObjectPtr<UObject*> */ __um(Content_Img);                                       // 0x0068   (0x0028)  
	bool                                               bUseContent_Img_Color;                                      // 0x0090   (0x0001)  
	unsigned char                                      UnknownData02_6[0x7];                                       // 0x0091   (0x0007)  MISSED
	FSlateColor                                        Content_Img_Color;                                          // 0x0098   (0x0028)  
	FText                                              Normal_Text;                                                // 0x00C0   (0x0018)  
	int32_t                                            RemainTime;                                                 // 0x00D8   (0x0004)  
	bool                                               bWaitWidgetFinish;                                          // 0x00DC   (0x0001)  
	unsigned char                                      UnknownData03_6[0x3];                                       // 0x00DD   (0x0003)  MISSED
	class UAkAudioEvent*                               AudioEvent;                                                 // 0x00E0   (0x0008)  
};

/// Struct /Script/UACommon.UATaskTypeTable
/// Size: 0x0030 (48 bytes) (0x000008 - 0x000038) align 8 pad: 0x0000
struct FUATaskTypeTable : FTableRowBase
{ 
	uint32_t                                           Type;                                                       // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FText                                              TypeDesc;                                                   // 0x0010   (0x0018)  
	FString                                            iconPath;                                                   // 0x0028   (0x0010)  
};

/// Struct /Script/UACommon.UAStatisParamInfo
/// Size: 0x0030 (48 bytes) (0x000008 - 0x000038) align 8 pad: 0x0000
struct FUAStatisParamInfo : FTableRowBase
{ 
	EUAStatisParamFilterType                           CompareType;                                                // 0x0008   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0009   (0x0007)  MISSED
	int64_t                                            CompareValue;                                               // 0x0010   (0x0008)  
	int64_t                                            CompareValueExt;                                            // 0x0018   (0x0008)  
	bool                                               Detail;                                                     // 0x0020   (0x0001)  
	unsigned char                                      UnknownData01_6[0x7];                                       // 0x0021   (0x0007)  MISSED
	TArray<int64_t>                                    ValueList;                                                  // 0x0028   (0x0010)  
};

/// Struct /Script/UACommon.UACutTrendArgs
/// Size: 0x0010 (16 bytes) (0x000008 - 0x000018) align 8 pad: 0x0000
struct FUACutTrendArgs : FTableRowBase
{ 
	float                                              A;                                                          // 0x0008   (0x0004)  
	float                                              B;                                                          // 0x000C   (0x0004)  
	float                                              N;                                                          // 0x0010   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0014   (0x0004)  MISSED
};

/// Struct /Script/UACommon.UADescribeWordArgs
/// Size: 0x0018 (24 bytes) (0x000008 - 0x000020) align 8 pad: 0x0000
struct FUADescribeWordArgs : FTableRowBase
{ 
	FString                                            arg;                                                        // 0x0008   (0x0010)  
	EUAArgResolveMethod                                ResolveMethod;                                              // 0x0018   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0019   (0x0007)  MISSED
};

/// Struct /Script/UACommon.UABattleEventTable
/// Size: 0x00B0 (176 bytes) (0x000008 - 0x0000B8) align 8 pad: 0x0000
struct FUABattleEventTable : FTableRowBase
{ 
	FString                                            Describe;                                                   // 0x0008   (0x0010)  
	bool                                               Enabled;                                                    // 0x0018   (0x0001)  
	EUAStatisMethod                                    StatisMethod;                                               // 0x0019   (0x0001)  
	bool                                               ExcludeSameTeam;                                            // 0x001A   (0x0001)  
	unsigned char                                      UnknownData00_6[0x5];                                       // 0x001B   (0x0005)  MISSED
	TArray<FUAStatisParamInfo>                         Params;                                                     // 0x0020   (0x0010)  
	int32_t                                            MaxTimesInSecond;                                           // 0x0030   (0x0004)  
	int32_t                                            CutGroup;                                                   // 0x0034   (0x0004)  
	bool                                               ShouldCombine;                                              // 0x0038   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0039   (0x0003)  MISSED
	int32_t                                            Weight;                                                     // 0x003C   (0x0004)  
	float                                              CutTrendArgsOnConstant;                                     // 0x0040   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x0044   (0x0004)  MISSED
	TArray<FUACutTrendArgs>                            CutTrendArgsOnDistance;                                     // 0x0048   (0x0010)  
	TArray<FUACutTrendArgs>                            CutTrendArgsOnDeltaTime;                                    // 0x0058   (0x0010)  
	TArray<FUACutTrendArgs>                            CutTrendArgsOnEventValue;                                   // 0x0068   (0x0010)  
	FString                                            DescribeWord;                                               // 0x0078   (0x0010)  
	TArray<FUADescribeWordArgs>                        DescribeWordArgsList;                                       // 0x0088   (0x0010)  
	FString                                            CombinedDescribeWord;                                       // 0x0098   (0x0010)  
	TArray<FUADescribeWordArgs>                        CombinedDescribeWordArgsList;                               // 0x00A8   (0x0010)  
};

/// Struct /Script/UACommon.UAStatisTable
/// Size: 0x0050 (80 bytes) (0x000008 - 0x000058) align 8 pad: 0x0000
struct FUAStatisTable : FTableRowBase
{ 
	FText                                              Describe;                                                   // 0x0008   (0x0018)  
	EUAStatisMethod                                    StatisMethod;                                               // 0x0020   (0x0001)  
	bool                                               ExcludeSameTeam;                                            // 0x0021   (0x0001)  
	bool                                               ExcludeSameInst;                                            // 0x0022   (0x0001)  
	bool                                               RecordEvent;                                                // 0x0023   (0x0001)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0024   (0x0004)  MISSED
	TArray<FUAStatisParamInfo>                         Params;                                                     // 0x0028   (0x0010)  
	int32_t                                            EventCount;                                                 // 0x0038   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x003C   (0x0004)  MISSED
	FSoftClassPath                                     ExpCaculator;                                               // 0x0040   (0x0018)  
};

/// Struct /Script/UACommon.UAServiceTable
/// Size: 0x0020 (32 bytes) (0x000008 - 0x000028) align 8 pad: 0x0000
struct FUAServiceTable : FTableRowBase
{ 
	FString                                            InitContext;                                                // 0x0008   (0x0010)  
	FString                                            ResetContext;                                               // 0x0018   (0x0010)  
};

/// Struct /Script/UACommon.UAModuleTable
/// Size: 0x0020 (32 bytes) (0x000008 - 0x000028) align 8 pad: 0x0000
struct FUAModuleTable : FTableRowBase
{ 
	FString                                            Context;                                                    // 0x0008   (0x0010)  
	FString                                            DefaultPanel;                                               // 0x0018   (0x0010)  
};

/// Struct /Script/UACommon.UAModuleContextTable
/// Size: 0x0020 (32 bytes) (0x000008 - 0x000028) align 8 pad: 0x0000
struct FUAModuleContextTable : FTableRowBase
{ 
	FString                                            Name;                                                       // 0x0008   (0x0010)  
	FString                                            LevelPath;                                                  // 0x0018   (0x0010)  
};

/// Struct /Script/UACommon.UAGachaMapTable
/// Size: 0x0018 (24 bytes) (0x000008 - 0x000020) align 8 pad: 0x0000
struct FUAGachaMapTable : FTableRowBase
{ 
	uint64_t                                           ItemID;                                                     // 0x0008   (0x0008)  
	uint32_t                                           WeaponId;                                                   // 0x0010   (0x0004)  
	uint32_t                                           Num;                                                        // 0x0014   (0x0004)  
	uint32_t                                           Weight;                                                     // 0x0018   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x001C   (0x0004)  MISSED
};

/// Struct /Script/UACommon.UAVestBagGridTable
/// Size: 0x0108 (264 bytes) (0x000008 - 0x000110) align 8 pad: 0x0000
struct FUAVestBagGridTable : FTableRowBase
{ 
	FString                                            Name;                                                       // 0x0008   (0x0010)  
	uint32_t                                           Seperated;                                                  // 0x0018   (0x0004)  
	uint32_t                                           SizeX;                                                      // 0x001C   (0x0004)  
	uint32_t                                           SizeY;                                                      // 0x0020   (0x0004)  
	float                                              PosX;                                                       // 0x0024   (0x0004)  
	float                                              PosY;                                                       // 0x0028   (0x0004)  
	uint32_t                                           SizeX0;                                                     // 0x002C   (0x0004)  
	uint32_t                                           SizeY1;                                                     // 0x0030   (0x0004)  
	float                                              PosX2;                                                      // 0x0034   (0x0004)  
	float                                              PosY3;                                                      // 0x0038   (0x0004)  
	uint32_t                                           SizeX4;                                                     // 0x003C   (0x0004)  
	uint32_t                                           SizeY5;                                                     // 0x0040   (0x0004)  
	float                                              PosX6;                                                      // 0x0044   (0x0004)  
	float                                              PosY7;                                                      // 0x0048   (0x0004)  
	uint32_t                                           SizeX8;                                                     // 0x004C   (0x0004)  
	uint32_t                                           SizeY9;                                                     // 0x0050   (0x0004)  
	float                                              PosX10;                                                     // 0x0054   (0x0004)  
	float                                              PosY11;                                                     // 0x0058   (0x0004)  
	uint32_t                                           SizeX12;                                                    // 0x005C   (0x0004)  
	uint32_t                                           SizeY13;                                                    // 0x0060   (0x0004)  
	float                                              PosX14;                                                     // 0x0064   (0x0004)  
	float                                              PosY15;                                                     // 0x0068   (0x0004)  
	uint32_t                                           SizeX16;                                                    // 0x006C   (0x0004)  
	uint32_t                                           SizeY17;                                                    // 0x0070   (0x0004)  
	float                                              PosX18;                                                     // 0x0074   (0x0004)  
	float                                              PosY19;                                                     // 0x0078   (0x0004)  
	uint32_t                                           SizeX20;                                                    // 0x007C   (0x0004)  
	uint32_t                                           SizeY21;                                                    // 0x0080   (0x0004)  
	float                                              PosX22;                                                     // 0x0084   (0x0004)  
	float                                              PosY23;                                                     // 0x0088   (0x0004)  
	uint32_t                                           SizeX24;                                                    // 0x008C   (0x0004)  
	uint32_t                                           SizeY25;                                                    // 0x0090   (0x0004)  
	float                                              PosX26;                                                     // 0x0094   (0x0004)  
	float                                              PosY27;                                                     // 0x0098   (0x0004)  
	uint32_t                                           SizeX28;                                                    // 0x009C   (0x0004)  
	uint32_t                                           SizeY29;                                                    // 0x00A0   (0x0004)  
	float                                              PosX30;                                                     // 0x00A4   (0x0004)  
	float                                              PosY31;                                                     // 0x00A8   (0x0004)  
	uint32_t                                           SizeX32;                                                    // 0x00AC   (0x0004)  
	uint32_t                                           SizeY33;                                                    // 0x00B0   (0x0004)  
	float                                              PosX34;                                                     // 0x00B4   (0x0004)  
	float                                              PosY35;                                                     // 0x00B8   (0x0004)  
	uint32_t                                           SizeX36;                                                    // 0x00BC   (0x0004)  
	uint32_t                                           SizeY37;                                                    // 0x00C0   (0x0004)  
	float                                              PosX38;                                                     // 0x00C4   (0x0004)  
	float                                              PosY39;                                                     // 0x00C8   (0x0004)  
	uint32_t                                           SizeX40;                                                    // 0x00CC   (0x0004)  
	uint32_t                                           SizeY41;                                                    // 0x00D0   (0x0004)  
	float                                              PosX42;                                                     // 0x00D4   (0x0004)  
	float                                              PosY43;                                                     // 0x00D8   (0x0004)  
	uint32_t                                           SizeX44;                                                    // 0x00DC   (0x0004)  
	uint32_t                                           SizeY45;                                                    // 0x00E0   (0x0004)  
	float                                              PosX46;                                                     // 0x00E4   (0x0004)  
	float                                              PosY47;                                                     // 0x00E8   (0x0004)  
	uint32_t                                           SizeX48;                                                    // 0x00EC   (0x0004)  
	uint32_t                                           SizeY49;                                                    // 0x00F0   (0x0004)  
	float                                              PosX50;                                                     // 0x00F4   (0x0004)  
	float                                              PosY51;                                                     // 0x00F8   (0x0004)  
	uint32_t                                           SizeX52;                                                    // 0x00FC   (0x0004)  
	uint32_t                                           SizeY53;                                                    // 0x0100   (0x0004)  
	float                                              PosX54;                                                     // 0x0104   (0x0004)  
	float                                              PosY55;                                                     // 0x0108   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x010C   (0x0004)  MISSED
};

/// Struct /Script/UACommon.UABattleMapTable
/// Size: 0x0090 (144 bytes) (0x000008 - 0x000098) align 8 pad: 0x0000
struct FUABattleMapTable : FTableRowBase
{ 
	FString                                            MapLevel;                                                   // 0x0008   (0x0010)  
	FString                                            MobileMapLevel;                                             // 0x0018   (0x0010)  
	uint32_t                                           ShowIndex;                                                  // 0x0028   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x002C   (0x0004)  MISSED
	FString                                            Name;                                                       // 0x0030   (0x0010)  
	FString                                            Picture;                                                    // 0x0040   (0x0010)  
	FString                                            desc;                                                       // 0x0050   (0x0010)  
	uint32_t                                           Time;                                                       // 0x0060   (0x0004)  
	uint32_t                                           DayStartTime;                                               // 0x0064   (0x0004)  
	uint32_t                                           MinPMC;                                                     // 0x0068   (0x0004)  
	uint32_t                                           MaxPMC;                                                     // 0x006C   (0x0004)  
	uint32_t                                           IsScavJoin;                                                 // 0x0070   (0x0004)  
	uint32_t                                           ScavJoinTimeBegin;                                          // 0x0074   (0x0004)  
	uint32_t                                           ScavJoinTimeEnd;                                            // 0x0078   (0x0004)  
	uint32_t                                           NormalBeginTime;                                            // 0x007C   (0x0004)  
	uint32_t                                           NormalBeginPersonNum;                                       // 0x0080   (0x0004)  
	uint32_t                                           LongTimeBeginTime;                                          // 0x0084   (0x0004)  
	uint32_t                                           LongTimeBeginPersonNum;                                     // 0x0088   (0x0004)  
	uint32_t                                           TimeoutTime;                                                // 0x008C   (0x0004)  
	uint32_t                                           SpawnAIPersonNum;                                           // 0x0090   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x0094   (0x0004)  MISSED
};

/// Struct /Script/UACommon.UAGlobalNumTable
/// Size: 0x0020 (32 bytes) (0x000008 - 0x000028) align 8 pad: 0x0000
struct FUAGlobalNumTable : FTableRowBase
{ 
	FText                                              Name;                                                       // 0x0008   (0x0018)  
	float                                              Val;                                                        // 0x0020   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0024   (0x0004)  MISSED
};

/// Struct /Script/UACommon.UABattleresultTable
/// Size: 0x0020 (32 bytes) (0x000008 - 0x000028) align 8 pad: 0x0000
struct FUABattleresultTable : FTableRowBase
{ 
	uint32_t                                           dataid;                                                     // 0x0008   (0x0004)  
	uint32_t                                           AttributeType;                                              // 0x000C   (0x0004)  
	uint32_t                                           Proportion;                                                 // 0x0010   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0014   (0x0004)  MISSED
	FString                                            Describe;                                                   // 0x0018   (0x0010)  
};

/// Struct /Script/UACommon.UAItemContextMenuTable
/// Size: 0x0030 (48 bytes) (0x000008 - 0x000038) align 8 pad: 0x0000
struct FUAItemContextMenuTable : FTableRowBase
{ 
	FText                                              DisplayName;                                                // 0x0008   (0x0018)  
	uint32_t                                           DisplayIconID;                                              // 0x0020   (0x0004)  
	uint32_t                                           ShowIndex;                                                  // 0x0024   (0x0004)  
	FString                                            UseTip;                                                     // 0x0028   (0x0010)  
};

/// Struct /Script/UACommon.TextLocalizationPatch
/// Size: 0x0090 (144 bytes) (0x000000 - 0x000090) align 8 pad: 0x0000
struct FTextLocalizationPatch
{ 
	FString                                            NativeCulture;                                              // 0x0000   (0x0010)  
	FString                                            Namespace;                                                  // 0x0010   (0x0010)  
	FString                                            Key;                                                        // 0x0020   (0x0010)  
	FString                                            NativeString;                                               // 0x0030   (0x0010)  
	SDK_UNDEFINED(80,2321) /* TMap<FString, FString> */ __um(LocalizedStrings);                                    // 0x0040   (0x0050)  
};

/// Struct /Script/UACommon.UAModeActivityMissionTable
/// Size: 0x0050 (80 bytes) (0x000020 - 0x000070) align 8 pad: 0x0000
struct FUAModeActivityMissionTable : FModeTableRowBase
{ 
	SDK_UNDEFINED(80,2322) /* TMap<int32_t, FActivityMissionConfig> */ __um(ActivityMissionMap);                   // 0x0020   (0x0050)  
};

/// Struct /Script/UACommon.MissionClassProbabilityConfig
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 8 pad: 0x0000
struct FMissionClassProbabilityConfig
{ 
	SDK_UNDEFINED(40,2323) /* TWeakObjectPtr<UMFMissionFlow*> */ __um(MissionFlowAsset);                           // 0x0000   (0x0028)  
	float                                              Probability;                                                // 0x0028   (0x0004)  
	bool                                               bIgnoreActivitiy;                                           // 0x002C   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x002D   (0x0003)  MISSED
};

/// Struct /Script/UACommon.ActivityResidentMissionConfig
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FActivityResidentMissionConfig
{ 
	TArray<FMissionClassProbabilityConfig>             MissionList;                                                // 0x0000   (0x0010)  
};

/// Struct /Script/UACommon.MissionClassWeightConfig
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 8 pad: 0x0000
struct FMissionClassWeightConfig
{ 
	SDK_UNDEFINED(40,2324) /* TWeakObjectPtr<UMFMissionFlow*> */ __um(MissionFlowAsset);                           // 0x0000   (0x0028)  
	int32_t                                            Weight;                                                     // 0x0028   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x002C   (0x0004)  MISSED
};

/// Struct /Script/UACommon.ActivityRandomMissionConfig
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FActivityRandomMissionConfig
{ 
	float                                              Probability;                                                // 0x0000   (0x0004)  
	int32_t                                            RandomTimes;                                                // 0x0004   (0x0004)  
	TArray<FMissionClassWeightConfig>                  MissionList;                                                // 0x0008   (0x0010)  
};

/// Struct /Script/UACommon.ActivityMissionConfig
/// Size: 0x0040 (64 bytes) (0x000000 - 0x000040) align 8 pad: 0x0000
struct FActivityMissionConfig
{ 
	FActivityResidentMissionConfig                     ResidentMission;                                            // 0x0000   (0x0010)  
	FActivityRandomMissionConfig                       RandomMission;                                              // 0x0010   (0x0018)  
	int32_t                                            MaxActivityTaskNum;                                         // 0x0028   (0x0004)  
	bool                                               bCloseDynamicMission;                                       // 0x002C   (0x0001)  
	bool                                               bCloseOtherActivities;                                      // 0x002D   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x002E   (0x0002)  MISSED
	TArray<int32_t>                                    CloseOtherActivityIDs;                                      // 0x0030   (0x0010)  
};

/// Struct /Script/UACommon.DynamicResidentMissionConfig
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FDynamicResidentMissionConfig
{ 
	TArray<FMissionClassProbabilityConfig>             MissionList;                                                // 0x0000   (0x0010)  
};

/// Struct /Script/UACommon.DynamicRandomMissionConfig
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FDynamicRandomMissionConfig
{ 
	float                                              Probability;                                                // 0x0000   (0x0004)  
	int32_t                                            RandomTimes;                                                // 0x0004   (0x0004)  
	TArray<FMissionClassWeightConfig>                  MissionList;                                                // 0x0008   (0x0010)  
};

/// Struct /Script/UACommon.UAModeDynamicMissionTable
/// Size: 0x0040 (64 bytes) (0x000020 - 0x000060) align 8 pad: 0x0000
struct FUAModeDynamicMissionTable : FModeTableRowBase
{ 
	FString                                            LevelName;                                                  // 0x0020   (0x0010)  
	FDynamicResidentMissionConfig                      ResidentMission;                                            // 0x0030   (0x0010)  
	FDynamicRandomMissionConfig                        RandomMission;                                              // 0x0040   (0x0018)  
	int32_t                                            MaxDynamicTaskNum;                                          // 0x0058   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x005C   (0x0004)  MISSED
};

/// Struct /Script/UACommon.QuestDistributerClassWithWeight
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 8 pad: 0x0000
struct FQuestDistributerClassWithWeight
{ 
	SDK_UNDEFINED(40,2325) /* TWeakObjectPtr<UClass*> */ __um(QuestDistributerClass);                              // 0x0000   (0x0028)  
	int32_t                                            Weight;                                                     // 0x0028   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x002C   (0x0004)  MISSED
};

/// Struct /Script/UACommon.UAModeQuestDistributerConfigTable
/// Size: 0x0078 (120 bytes) (0x000020 - 0x000098) align 8 pad: 0x0000
struct FUAModeQuestDistributerConfigTable : FModeTableRowBase
{ 
	float                                              LoadDistributerProbability;                                 // 0x0020   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0024   (0x0004)  MISSED
	TArray<FQuestDistributerClassWithWeight>           NeedLoadQuestDistributer;                                   // 0x0028   (0x0010)  
	int32_t                                            RandomTimes;                                                // 0x0038   (0x0004)  
	float                                              ActivityLoadDistributerProbability;                         // 0x003C   (0x0004)  
	SDK_UNDEFINED(80,2326) /* TMap<int32_t, FActivityQuestDistributer> */ __um(ActivityNeedLoadQuestDistributer);  // 0x0040   (0x0050)  
	int32_t                                            ActivityRandomTimes;                                        // 0x0090   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x0094   (0x0004)  MISSED
};

/// Struct /Script/UACommon.ActivityQuestDistributer
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FActivityQuestDistributer
{ 
	TArray<FQuestDistributerClassWithWeight>           ActivityQuestDistributers;                                  // 0x0000   (0x0010)  
};

/// Struct /Script/UACommon.UAModeBigMapModuleConfigTable
/// Size: 0x0020 (32 bytes) (0x000020 - 0x000040) align 8 pad: 0x0000
struct FUAModeBigMapModuleConfigTable : FModeTableRowBase
{ 
	SDK_UNDEFINED(16,2327) /* TArray<TWeakObjectPtr<UClass*>> */ __um(AdditionModules);                            // 0x0020   (0x0010)  
	SDK_UNDEFINED(16,2328) /* TArray<TWeakObjectPtr<UClass*>> */ __um(RemoveModules);                              // 0x0030   (0x0010)  
};

/// Struct /Script/UACommon.UAScriptLevelTable
/// Size: 0x0020 (32 bytes) (0x000020 - 0x000040) align 8 pad: 0x0000
struct FUAScriptLevelTable : FModeTableRowBase
{ 
	TArray<FString>                                    ScriptMaps;                                                 // 0x0020   (0x0010)  
	TArray<FString>                                    AdditionIgnores;                                            // 0x0030   (0x0010)  
};

/// Struct /Script/UACommon.UAModeLootConfigTable
/// Size: 0x0048 (72 bytes) (0x000020 - 0x000068) align 8 pad: 0x0000
struct FUAModeLootConfigTable : FModeTableRowBase
{ 
	int32_t                                            LootID;                                                     // 0x0020   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0024   (0x0004)  MISSED
	SDK_UNDEFINED(40,2329) /* TWeakObjectPtr<UDataTable*> */ __um(LootDropSubTable);                               // 0x0028   (0x0028)  
	TArray<FString>                                    LootMaps;                                                   // 0x0050   (0x0010)  
	float                                              RoughSearchModifyScale;                                     // 0x0060   (0x0004)  
	float                                              DetailSearchModifyScale;                                    // 0x0064   (0x0004)  
};

/// Struct /Script/UACommon.UAPlayerStartGroupData
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 8 pad: 0x0000
struct FUAPlayerStartGroupData
{ 
	int32_t                                            GroupIndex;                                                 // 0x0000   (0x0004)  
	EPlayerTeamType                                    StartPointType;                                             // 0x0004   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0005   (0x0003)  MISSED
	int32_t                                            BigGroup;                                                   // 0x0008   (0x0004)  
	int32_t                                            SecondGroup;                                                // 0x000C   (0x0004)  
	int32_t                                            Priority;                                                   // 0x0010   (0x0004)  
	int32_t                                            Weight;                                                     // 0x0014   (0x0004)  
	FString                                            EscapePreset;                                               // 0x0018   (0x0010)  
	int32_t                                            ExclusiveGroup;                                             // 0x0028   (0x0004)  
	int32_t                                            ExclusiveGroupWeight;                                       // 0x002C   (0x0004)  
};

/// Struct /Script/UACommon.UAAIStartGroupData
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 4 pad: 0x0000
struct FUAAIStartGroupData
{ 
	int32_t                                            GroupIndex;                                                 // 0x0000   (0x0004)  
	EPlayerTeamType                                    StartPointType;                                             // 0x0004   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x0005   (0x0003)  MISSED
};

/// Struct /Script/UACommon.UAModeStartAndEscapeTable
/// Size: 0x00F0 (240 bytes) (0x000020 - 0x000110) align 8 pad: 0x0000
struct FUAModeStartAndEscapeTable : FModeTableRowBase
{ 
	FString                                            LevelName;                                                  // 0x0020   (0x0010)  
	TArray<FString>                                    AdditionLevelName;                                          // 0x0030   (0x0010)  
	TArray<FUAPlayerStartGroupData>                    PlayerStart;                                                // 0x0040   (0x0010)  
	TArray<FUAAIStartGroupData>                        AIStartAddition;                                            // 0x0050   (0x0010)  
	SDK_UNDEFINED(80,2330) /* TMap<FString, FEscapePreset> */ __um(EscapePresetMap);                               // 0x0060   (0x0050)  
	SDK_UNDEFINED(80,2331) /* TMap<int32_t, FEscapeProbabilityReset> */ __um(EscapeProbabilityResetMap);           // 0x00B0   (0x0050)  
	float                                              PMCCheckRadius;                                             // 0x0100   (0x0004)  
	float                                              EnemyCheckRadius;                                           // 0x0104   (0x0004)  
	float                                              SecondEnemyCheckRadius;                                     // 0x0108   (0x0004)  
	float                                              TeamCheckRadius;                                            // 0x010C   (0x0004)  
};

/// Struct /Script/UACommon.EscapeProbabilityReset
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 4 pad: 0x0000
struct FEscapeProbabilityReset
{ 
	float                                              OpenProbability;                                            // 0x0000   (0x0004)  
	float                                              ShowProbability;                                            // 0x0004   (0x0004)  
};

/// Struct /Script/UACommon.UAEscapeRandomWeightStruct
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 4 pad: 0x0000
struct FUAEscapeRandomWeightStruct
{ 
	int32_t                                            EscapePointID;                                              // 0x0000   (0x0004)  
	int32_t                                            Weight;                                                     // 0x0004   (0x0004)  
};

/// Struct /Script/UACommon.UAEscapeRandomStruct
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FUAEscapeRandomStruct
{ 
	TArray<FUAEscapeRandomWeightStruct>                EscapePointIDs;                                             // 0x0000   (0x0010)  
	int32_t                                            RandomNum;                                                  // 0x0010   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0014   (0x0004)  MISSED
};

/// Struct /Script/UACommon.EscapePreset
/// Size: 0x0048 (72 bytes) (0x000000 - 0x000048) align 8 pad: 0x0000
struct FEscapePreset
{ 
	int32_t                                            PresetIndex;                                                // 0x0000   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0004   (0x0004)  MISSED
	TArray<int32_t>                                    ConstantEscapePointIDs;                                     // 0x0008   (0x0010)  
	int32_t                                            ConstantNum;                                                // 0x0018   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x001C   (0x0004)  MISSED
	TArray<int32_t>                                    RandomEscapePointIDs;                                       // 0x0020   (0x0010)  
	int32_t                                            RandomNum;                                                  // 0x0030   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x0034   (0x0004)  MISSED
	TArray<FUAEscapeRandomStruct>                      RandomArr;                                                  // 0x0038   (0x0010)  
};

/// Struct /Script/UACommon.UAGameModeTableRow
/// Size: 0x0090 (144 bytes) (0x000008 - 0x000098) align 8 pad: 0x0000
struct FUAGameModeTableRow : FTableRowBase
{ 
	uint32_t                                           Index;                                                      // 0x0008   (0x0004)  
	uint32_t                                           MainModeID;                                                 // 0x000C   (0x0004)  
	FText                                              MainModeName;                                               // 0x0010   (0x0018)  
	uint32_t                                           SubModeID;                                                  // 0x0028   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x002C   (0x0004)  MISSED
	FText                                              SubModeName;                                                // 0x0030   (0x0018)  
	SDK_UNDEFINED(40,2332) /* TWeakObjectPtr<UClass*> */ __um(GameModeClass);                                      // 0x0048   (0x0028)  
	SDK_UNDEFINED(40,2333) /* TWeakObjectPtr<UClass*> */ __um(GameStateClass);                                     // 0x0070   (0x0028)  
};

/// Struct /Script/UACommon.PanelProfilerStack
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FPanelProfilerStack
{ 
	TArray<double>                                     theStack;                                                   // 0x0000   (0x0010)  
};

static_assert(sizeof(UAsyncTaskCopyFile) == 0x0040); // 64 bytes (0x000030 - 0x000040)
static_assert(sizeof(UAsyncTaskDownloadFile) == 0x00D8); // 216 bytes (0x000030 - 0x0000D8)
static_assert(sizeof(UBFLPlatformFile) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UCAButtonWidget) == 0x02A0); // 672 bytes (0x000288 - 0x0002A0)
static_assert(sizeof(UCACustomFixedBorder) == 0x0278); // 632 bytes (0x000268 - 0x000278)
static_assert(sizeof(UCAImage) == 0x0278); // 632 bytes (0x000268 - 0x000278)
static_assert(sizeof(UCASearchableComboBoxString) == 0x0EC0); // 3776 bytes (0x000128 - 0x000EC0)
static_assert(sizeof(UGeoSensitiveWidget) == 0x02B0); // 688 bytes (0x000288 - 0x0002B0)
static_assert(sizeof(UHttpTask) == 0x0090); // 144 bytes (0x000028 - 0x000090)
static_assert(sizeof(UImageLoader) == 0x0078); // 120 bytes (0x000028 - 0x000078)
static_assert(sizeof(ULaunchHelper) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(ULoopedPanel) == 0x01A8); // 424 bytes (0x000150 - 0x0001A8)
static_assert(sizeof(FMapRuleConfig) == 0x000C); // 12 bytes (0x000000 - 0x00000C)
static_assert(sizeof(ALoosePointManager) == 0x0348); // 840 bytes (0x0002E0 - 0x000348)
static_assert(sizeof(UPosSensitiveWidget) == 0x02A8); // 680 bytes (0x000288 - 0x0002A8)
static_assert(sizeof(URichTextBlockInlineDecorator) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(AShowBtnOutlineHelper) == 0x03F0); // 1008 bytes (0x0002E0 - 0x0003F0)
static_assert(sizeof(UShowTouch) == 0x0098); // 152 bytes (0x000028 - 0x000098)
static_assert(sizeof(UStatUMGWidget) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UUASubmitBug) == 0x00A8); // 168 bytes (0x000028 - 0x0000A8)
static_assert(sizeof(UTinyHotfixFile) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UTutorialModeInputProcessor) == 0x0070); // 112 bytes (0x000028 - 0x000070)
static_assert(sizeof(UUABuglyHelper) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UUAButtonWidget) == 0x0430); // 1072 bytes (0x000288 - 0x000430)
static_assert(sizeof(UUACharacterDefaultInventoryCompBase) == 0x02E0); // 736 bytes (0x000138 - 0x0002E0)
static_assert(sizeof(FItemInfoForRand) == 0x0058); // 88 bytes (0x000000 - 0x000058)
static_assert(sizeof(UUACharacterAIRandomInventoryComponent) == 0x0388); // 904 bytes (0x0002E0 - 0x000388)
static_assert(sizeof(UUACharacterDefaultInventoryComp) == 0x0300); // 768 bytes (0x0002E0 - 0x000300)
static_assert(sizeof(FInitInventoryParams) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(USlicedInitParams) == 0x0060); // 96 bytes (0x000028 - 0x000060)
static_assert(sizeof(UUACharacterPreviewComponent) == 0x0400); // 1024 bytes (0x0001E8 - 0x000400)
static_assert(sizeof(UUAClipImageWidget) == 0x0288); // 648 bytes (0x000288 - 0x000288)
static_assert(sizeof(UUACommonConfigStatics) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UUACommonStatics) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UUADataTableManager) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UUAFontMeasure) == 0x0070); // 112 bytes (0x000028 - 0x000070)
static_assert(sizeof(UUAGridScroll) == 0x0928); // 2344 bytes (0x000908 - 0x000928)
static_assert(sizeof(UUAInventoryStatics) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UUAListView) == 0x0930); // 2352 bytes (0x0003B0 - 0x000930)
static_assert(sizeof(UUALocalizationStatic) == 0x0358); // 856 bytes (0x000028 - 0x000358)
static_assert(sizeof(UUAOverlay) == 0x0150); // 336 bytes (0x000150 - 0x000150)
static_assert(sizeof(UUAOverlaySlot) == 0x0088); // 136 bytes (0x000080 - 0x000088)
static_assert(sizeof(UUAPanelProfiler) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UUAPhotoTakerCommon) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UUARedPointWidget) == 0x02A0); // 672 bytes (0x000288 - 0x0002A0)
static_assert(sizeof(UUATileView) == 0x03F0); // 1008 bytes (0x0003E0 - 0x0003F0)
static_assert(sizeof(UUATreeView) == 0x0418); // 1048 bytes (0x000408 - 0x000418)
static_assert(sizeof(UUAWareHouseComponent) == 0x0108); // 264 bytes (0x0000F8 - 0x000108)
static_assert(sizeof(UUMGHelperLibrary) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UVideoManager) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FTaskDescription) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FKeyInputBlockingConfTableRow) == 0x0010); // 16 bytes (0x000008 - 0x000010)
static_assert(sizeof(FCommonActionKeyNameConfTableRow) == 0x0088); // 136 bytes (0x000008 - 0x000088)
static_assert(sizeof(FCAMapAreaTextureInfo) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FCALevelMapInfoTableRow) == 0x0090); // 144 bytes (0x000008 - 0x000090)
static_assert(sizeof(FMagazineIconConfTable) == 0x0010); // 16 bytes (0x000008 - 0x000010)
static_assert(sizeof(FItemIntervalTable) == 0x0060); // 96 bytes (0x000008 - 0x000060)
static_assert(sizeof(FSystemUnlockTable) == 0x0010); // 16 bytes (0x000008 - 0x000010)
static_assert(sizeof(FLootStaticPointDetailTable) == 0x0070); // 112 bytes (0x000008 - 0x000070)
static_assert(sizeof(FNumDistribute) == 0x0010); // 16 bytes (0x000008 - 0x000010)
static_assert(sizeof(FLoosePoint) == 0x0018); // 24 bytes (0x000008 - 0x000018)
static_assert(sizeof(FActiveLoosePoint) == 0x0028); // 40 bytes (0x000008 - 0x000028)
static_assert(sizeof(FLootDetailTable) == 0x0050); // 80 bytes (0x000008 - 0x000050)
static_assert(sizeof(FMapStaticPointTable) == 0x0090); // 144 bytes (0x000008 - 0x000090)
static_assert(sizeof(FRookieTipTable) == 0x0088); // 136 bytes (0x000008 - 0x000088)
static_assert(sizeof(FRookieLimitTable) == 0x0060); // 96 bytes (0x000008 - 0x000060)
static_assert(sizeof(FRicochetTable) == 0x0018); // 24 bytes (0x000008 - 0x000018)
static_assert(sizeof(FAliasesTableMessage) == 0x0060); // 96 bytes (0x000000 - 0x000060)
static_assert(sizeof(FLoosePointAliasesTable) == 0x0070); // 112 bytes (0x000008 - 0x000070)
static_assert(sizeof(FAliases) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(sizeof(FMapLoosePoint) == 0x0090); // 144 bytes (0x000008 - 0x000090)
static_assert(sizeof(FLoosePointMapMessage) == 0x0020); // 32 bytes (0x000008 - 0x000020)
static_assert(sizeof(FLoosePointDetail) == 0x0030); // 48 bytes (0x000008 - 0x000030)
static_assert(sizeof(FItemCamOffsetOverrideConf) == 0x0018); // 24 bytes (0x000008 - 0x000018)
static_assert(sizeof(FItemCornerIconConf) == 0x0020); // 32 bytes (0x000008 - 0x000020)
static_assert(sizeof(FItemColorConf) == 0x0048); // 72 bytes (0x000008 - 0x000048)
static_assert(sizeof(FIniFileBackup) == 0x0160); // 352 bytes (0x000000 - 0x000160)
static_assert(sizeof(FBuglyData) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(FSceneCaptureConfig) == 0x00B0); // 176 bytes (0x000000 - 0x0000B0)
static_assert(sizeof(FUAFrontEndStageTableRow) == 0x0060); // 96 bytes (0x000008 - 0x000060)
static_assert(sizeof(FUAGamePadVisibilityTableRow) == 0x0040); // 64 bytes (0x000008 - 0x000040)
static_assert(sizeof(FUATutorialEventTable) == 0x0070); // 112 bytes (0x000008 - 0x000070)
static_assert(sizeof(FUAAdviseInvPriorityTable) == 0x00C8); // 200 bytes (0x000008 - 0x0000C8)
static_assert(sizeof(FUAAIUniqueItemInfoTable) == 0x0010); // 16 bytes (0x000008 - 0x000010)
static_assert(sizeof(FUAFactionRelationTable) == 0x0018); // 24 bytes (0x000008 - 0x000018)
static_assert(sizeof(FUAMultiModeWidgetTable) == 0x0048); // 72 bytes (0x000008 - 0x000048)
static_assert(sizeof(FUATraceStyleTable) == 0x01F0); // 496 bytes (0x000008 - 0x0001F0)
static_assert(sizeof(FUATraceSceneStyleParams) == 0x0038); // 56 bytes (0x000000 - 0x000038)
static_assert(sizeof(FUATraceNewMapStyleParams) == 0x0060); // 96 bytes (0x000000 - 0x000060)
static_assert(sizeof(FUATraceDirectionalBarStyleParams) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(FUANewTraceStyleTable) == 0x0130); // 304 bytes (0x000008 - 0x000130)
static_assert(sizeof(FUATraceSceneRuleParams) == 0x000C); // 12 bytes (0x000000 - 0x00000C)
static_assert(sizeof(FUATraceNewMapRuleParams) == 0x000C); // 12 bytes (0x000000 - 0x00000C)
static_assert(sizeof(FUATraceDirectionalBarRuleParams) == 0x000C); // 12 bytes (0x000000 - 0x00000C)
static_assert(sizeof(FUANewTraceRuleTable) == 0x0030); // 48 bytes (0x000008 - 0x000030)
static_assert(sizeof(FUANewTraceConfigTable) == 0x0090); // 144 bytes (0x000008 - 0x000090)
static_assert(sizeof(FUATraceTargetTable) == 0x0090); // 144 bytes (0x000008 - 0x000090)
static_assert(sizeof(FUALootDataInfosTable) == 0x0030); // 48 bytes (0x000008 - 0x000030)
static_assert(sizeof(FUABrilliantTimeReplayTableRow) == 0x0040); // 64 bytes (0x000008 - 0x000040)
static_assert(sizeof(FUASubTitleTextTable) == 0x0030); // 48 bytes (0x000008 - 0x000030)
static_assert(sizeof(FUASubTitleVOTable) == 0x0030); // 48 bytes (0x000008 - 0x000030)
static_assert(sizeof(FItemConfTableRowBPProxy) == 0x00D0); // 208 bytes (0x000008 - 0x0000D0)
static_assert(sizeof(FLootDropTableRowBPProxy) == 0x0098); // 152 bytes (0x000008 - 0x000098)
static_assert(sizeof(FMapDetailTableRowBPProxy) == 0x0098); // 152 bytes (0x000008 - 0x000098)
static_assert(sizeof(FUACaptureTableRow) == 0x0018); // 24 bytes (0x000008 - 0x000018)
static_assert(sizeof(FUAEscapeInteractTextTable) == 0x0028); // 40 bytes (0x000008 - 0x000028)
static_assert(sizeof(FUAPlayerEscapeShowRow) == 0x0028); // 40 bytes (0x000008 - 0x000028)
static_assert(sizeof(FUAEscapeTextTableRow) == 0x0148); // 328 bytes (0x000008 - 0x000148)
static_assert(sizeof(FPanelLayerTableRow) == 0x0020); // 32 bytes (0x000008 - 0x000020)
static_assert(sizeof(FPanelConfTableRow) == 0x0058); // 88 bytes (0x000008 - 0x000058)
static_assert(sizeof(FServiceConfTableRow) == 0x0058); // 88 bytes (0x000008 - 0x000058)
static_assert(sizeof(FModuleContextConfTableRow) == 0x0038); // 56 bytes (0x000008 - 0x000038)
static_assert(sizeof(FModuleConfTableRow) == 0x0038); // 56 bytes (0x000008 - 0x000038)
static_assert(sizeof(FUAGameBigMapModuleModeTable) == 0x0050); // 80 bytes (0x000008 - 0x000050)
static_assert(sizeof(FUAGameLandmarkTable) == 0x0030); // 48 bytes (0x000008 - 0x000030)
static_assert(sizeof(FUAGameBigMapEffectTable) == 0x0060); // 96 bytes (0x000008 - 0x000060)
static_assert(sizeof(FUALootPointInfo) == 0x0058); // 88 bytes (0x000008 - 0x000058)
static_assert(sizeof(FUABattleQuickChat) == 0x0068); // 104 bytes (0x000008 - 0x000068)
static_assert(sizeof(FUAGamePadMessageTable) == 0x0010); // 16 bytes (0x000008 - 0x000010)
static_assert(sizeof(FUAGameHUDTable) == 0x00E8); // 232 bytes (0x000008 - 0x0000E8)
static_assert(sizeof(FUATaskTypeTable) == 0x0038); // 56 bytes (0x000008 - 0x000038)
static_assert(sizeof(FUAStatisParamInfo) == 0x0038); // 56 bytes (0x000008 - 0x000038)
static_assert(sizeof(FUACutTrendArgs) == 0x0018); // 24 bytes (0x000008 - 0x000018)
static_assert(sizeof(FUADescribeWordArgs) == 0x0020); // 32 bytes (0x000008 - 0x000020)
static_assert(sizeof(FUABattleEventTable) == 0x00B8); // 184 bytes (0x000008 - 0x0000B8)
static_assert(sizeof(FUAStatisTable) == 0x0058); // 88 bytes (0x000008 - 0x000058)
static_assert(sizeof(FUAServiceTable) == 0x0028); // 40 bytes (0x000008 - 0x000028)
static_assert(sizeof(FUAModuleTable) == 0x0028); // 40 bytes (0x000008 - 0x000028)
static_assert(sizeof(FUAModuleContextTable) == 0x0028); // 40 bytes (0x000008 - 0x000028)
static_assert(sizeof(FUAGachaMapTable) == 0x0020); // 32 bytes (0x000008 - 0x000020)
static_assert(sizeof(FUAVestBagGridTable) == 0x0110); // 272 bytes (0x000008 - 0x000110)
static_assert(sizeof(FUABattleMapTable) == 0x0098); // 152 bytes (0x000008 - 0x000098)
static_assert(sizeof(FUAGlobalNumTable) == 0x0028); // 40 bytes (0x000008 - 0x000028)
static_assert(sizeof(FUABattleresultTable) == 0x0028); // 40 bytes (0x000008 - 0x000028)
static_assert(sizeof(FUAItemContextMenuTable) == 0x0038); // 56 bytes (0x000008 - 0x000038)
static_assert(sizeof(FTextLocalizationPatch) == 0x0090); // 144 bytes (0x000000 - 0x000090)
static_assert(sizeof(FUAModeActivityMissionTable) == 0x0070); // 112 bytes (0x000020 - 0x000070)
static_assert(sizeof(FMissionClassProbabilityConfig) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(sizeof(FActivityResidentMissionConfig) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FMissionClassWeightConfig) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(sizeof(FActivityRandomMissionConfig) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FActivityMissionConfig) == 0x0040); // 64 bytes (0x000000 - 0x000040)
static_assert(sizeof(FDynamicResidentMissionConfig) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FDynamicRandomMissionConfig) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FUAModeDynamicMissionTable) == 0x0060); // 96 bytes (0x000020 - 0x000060)
static_assert(sizeof(FQuestDistributerClassWithWeight) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(sizeof(FUAModeQuestDistributerConfigTable) == 0x0098); // 152 bytes (0x000020 - 0x000098)
static_assert(sizeof(FActivityQuestDistributer) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FUAModeBigMapModuleConfigTable) == 0x0040); // 64 bytes (0x000020 - 0x000040)
static_assert(sizeof(FUAScriptLevelTable) == 0x0040); // 64 bytes (0x000020 - 0x000040)
static_assert(sizeof(FUAModeLootConfigTable) == 0x0068); // 104 bytes (0x000020 - 0x000068)
static_assert(sizeof(FUAPlayerStartGroupData) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(sizeof(FUAAIStartGroupData) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(sizeof(FUAModeStartAndEscapeTable) == 0x0110); // 272 bytes (0x000020 - 0x000110)
static_assert(sizeof(FEscapeProbabilityReset) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(sizeof(FUAEscapeRandomWeightStruct) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(sizeof(FUAEscapeRandomStruct) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FEscapePreset) == 0x0048); // 72 bytes (0x000000 - 0x000048)
static_assert(sizeof(FUAGameModeTableRow) == 0x0098); // 152 bytes (0x000008 - 0x000098)
static_assert(sizeof(FPanelProfilerStack) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(offsetof(UCAButtonWidget, _button) == 0x0298);
static_assert(offsetof(UCAImage, TemplateMaterail) == 0x0268);
static_assert(offsetof(UCAImage, DynamicTemplateMaterial) == 0x0270);
static_assert(offsetof(UCASearchableComboBoxString, DefaultOptions) == 0x0128);
static_assert(offsetof(UCASearchableComboBoxString, SelectedOption) == 0x0138);
static_assert(offsetof(UCASearchableComboBoxString, WidgetStyle) == 0x0148);
static_assert(offsetof(UCASearchableComboBoxString, ItemStyle) == 0x0568);
static_assert(offsetof(UCASearchableComboBoxString, ContentPadding) == 0x0DA0);
static_assert(offsetof(UCASearchableComboBoxString, Font) == 0x0DB8);
static_assert(offsetof(UCASearchableComboBoxString, ForegroundColor) == 0x0E10);
static_assert(offsetof(UHttpTask, ScreenNotifyName) == 0x0068);
static_assert(offsetof(UHttpTask, LuaNotifyName) == 0x0078);
static_assert(offsetof(UImageLoader, Texture) == 0x0058);
static_assert(offsetof(ULoopedPanel, SlotPadding) == 0x0158);
static_assert(offsetof(ALoosePointManager, LoosePointMapMessageTable) == 0x02E0);
static_assert(offsetof(ALoosePointManager, AliasesTables) == 0x02E8);
static_assert(offsetof(ALoosePointManager, MapLootTable) == 0x02F0);
static_assert(offsetof(ALoosePointManager, LootDetailTable) == 0x02F8);
static_assert(offsetof(ALoosePointManager, LoosePointsTable) == 0x0300);
static_assert(offsetof(ALoosePointManager, LoosePointsDetailTable) == 0x0308);
static_assert(offsetof(ALoosePointManager, StaticContainersTable) == 0x0310);
static_assert(offsetof(ALoosePointManager, LooseRuleConfig) == 0x0328);
static_assert(offsetof(AShowBtnOutlineHelper, TheOutlineMaterial) == 0x02E0);
static_assert(offsetof(UUAButtonWidget, normalTxtShowColor) == 0x0290);
static_assert(offsetof(UUAButtonWidget, pressTxtShowColor) == 0x02A0);
static_assert(offsetof(UUAButtonWidget, normalShadowOffect) == 0x02B0);
static_assert(offsetof(UUAButtonWidget, pressShadowOffect) == 0x02B8);
static_assert(offsetof(UUAButtonWidget, _button) == 0x0348);
static_assert(offsetof(UUAButtonWidget, _imageNormal) == 0x0350);
static_assert(offsetof(UUAButtonWidget, _imagePress) == 0x0358);
static_assert(offsetof(UUAButtonWidget, _imageHover) == 0x0360);
static_assert(offsetof(UUAButtonWidget, _textNormal) == 0x0368);
static_assert(offsetof(UUAButtonWidget, _textPress) == 0x0370);
static_assert(offsetof(UUAButtonWidget, _textHover) == 0x0378);
static_assert(offsetof(UUAButtonWidget, _imageNormalSlot) == 0x0380);
static_assert(offsetof(UUAButtonWidget, _imagePressSlot) == 0x0388);
static_assert(offsetof(UUAButtonWidget, _imageHoverSlot) == 0x0390);
static_assert(offsetof(UUAButtonWidget, _textNormalSlot) == 0x0398);
static_assert(offsetof(UUAButtonWidget, _textPressSlot) == 0x03A0);
static_assert(offsetof(UUAButtonWidget, _textHoverSlot) == 0x03A8);
static_assert(offsetof(UUACharacterDefaultInventoryCompBase, SlicedInitParams) == 0x01F8);
static_assert(offsetof(UUACharacterDefaultInventoryCompBase, InventoryGiveComponent) == 0x0200);
static_assert(offsetof(UUACharacterDefaultInventoryCompBase, CachedDropItems) == 0x0220);
static_assert(offsetof(UUACharacterAIRandomInventoryComponent, InitWeapon) == 0x02F8);
static_assert(offsetof(UUACharacterAIRandomInventoryComponent, SuitArray) == 0x0358);
static_assert(offsetof(UUACharacterAIRandomInventoryComponent, SuitArrayNoRandomTest) == 0x0368);
static_assert(offsetof(UUACharacterAIRandomInventoryComponent, InventoryInUsing) == 0x0378);
static_assert(offsetof(UUACharacterDefaultInventoryComp, StandAloneAvatarArray) == 0x02E8);
static_assert(offsetof(FInitInventoryParams, item) == 0x0000);
static_assert(offsetof(FInitInventoryParams, ParentInventory) == 0x0008);
static_assert(offsetof(USlicedInitParams, InitEquipmentParamsList) == 0x0040);
static_assert(offsetof(USlicedInitParams, InitItemParamsList) == 0x0050);
static_assert(offsetof(UUACharacterPreviewComponent, CaptureMaterialParameterCollection) == 0x01E8);
static_assert(offsetof(UUACharacterPreviewComponent, HairSpecularLight) == 0x01F0);
static_assert(offsetof(UUACharacterPreviewComponent, CaptureLightSets) == 0x0250);
static_assert(offsetof(UUACharacterPreviewComponent, PreviewCharacterFPTag) == 0x0320);
static_assert(offsetof(UUACharacterPreviewComponent, BadgeVelcroAttachBoneTag) == 0x0328);
static_assert(offsetof(UUACharacterPreviewComponent, BadgeAttachBoneTag) == 0x0330);
static_assert(offsetof(UUACharacterPreviewComponent, CurCaptureSceneName) == 0x0338);
static_assert(offsetof(UUACharacterPreviewComponent, BadgeMeshComponent) == 0x0350);
static_assert(offsetof(UUACharacterPreviewComponent, BadgeVelcroMeshComponent) == 0x0358);
static_assert(offsetof(UUACharacterPreviewComponent, CaptureLight) == 0x0380);
static_assert(offsetof(UUACharacterPreviewComponent, AnimNotifyConfig) == 0x0388);
static_assert(offsetof(UUAFontMeasure, ExtraInfo) == 0x0040);
static_assert(offsetof(UUAListView, ClickAudioEvents) == 0x03B8);
static_assert(offsetof(UUAListView, ScrollBarVisibility) == 0x03C9);
static_assert(offsetof(UUAListView, WidgetBarStyle) == 0x03D0);
static_assert(offsetof(UUARedPointWidget, RedPointType) == 0x0288);
static_assert(offsetof(UUATileView, ClickAudioEvents) == 0x03E0);
static_assert(offsetof(UUATreeView, ClickAudioEvents) == 0x0408);
static_assert(offsetof(UUAWareHouseComponent, DefaulWareHouseInventory) == 0x0100);
static_assert(offsetof(FTaskDescription, ETag) == 0x0000);
static_assert(offsetof(FKeyInputBlockingConfTableRow, ActionName) == 0x0008);
static_assert(offsetof(FCommonActionKeyNameConfTableRow, ActionName) == 0x0010);
static_assert(offsetof(FCommonActionKeyNameConfTableRow, OperationName) == 0x0028);
static_assert(offsetof(FCommonActionKeyNameConfTableRow, KeyDescribeName) == 0x0048);
static_assert(offsetof(FCommonActionKeyNameConfTableRow, KeyTypeName) == 0x0068);
static_assert(offsetof(FCAMapAreaTextureInfo, MapTexture) == 0x0008);
static_assert(offsetof(FCALevelMapInfoTableRow, WorldCenter) == 0x000C);
static_assert(offsetof(FCALevelMapInfoTableRow, MapTopLeftLocation) == 0x0018);
static_assert(offsetof(FCALevelMapInfoTableRow, WorldNorthAngleOffset) == 0x0024);
static_assert(offsetof(FCALevelMapInfoTableRow, MapTexture) == 0x0030);
static_assert(offsetof(FCALevelMapInfoTableRow, Map2LTexture) == 0x0038);
static_assert(offsetof(FCALevelMapInfoTableRow, MapAreaTextureInfos) == 0x0068);
static_assert(offsetof(FCALevelMapInfoTableRow, CoreRawData) == 0x0078);
static_assert(offsetof(FLootStaticPointDetailTable, desc) == 0x0010);
static_assert(offsetof(FActiveLoosePoint, LoosePoint) == 0x0008);
static_assert(offsetof(FLootDetailTable, Count) == 0x0010);
static_assert(offsetof(FLootDetailTable, LoosePoints) == 0x0020);
static_assert(offsetof(FLootDetailTable, FixedLoosePoints) == 0x0030);
static_assert(offsetof(FLootDetailTable, ActivateLoosePoints) == 0x0040);
static_assert(offsetof(FMapStaticPointTable, LevelDifficult) == 0x0010);
static_assert(offsetof(FMapStaticPointTable, PointName) == 0x0018);
static_assert(offsetof(FMapStaticPointTable, Transform) == 0x0030);
static_assert(offsetof(FMapStaticPointTable, InvClass) == 0x0068);
static_assert(offsetof(FMapStaticPointTable, Comments) == 0x0078);
static_assert(offsetof(FRookieTipTable, Type) == 0x000C);
static_assert(offsetof(FRookieTipTable, Text) == 0x0010);
static_assert(offsetof(FRookieTipTable, listen_action) == 0x0028);
static_assert(offsetof(FRookieTipTable, next_ids) == 0x0038);
static_assert(offsetof(FRookieTipTable, sound_name) == 0x0050);
static_assert(offsetof(FRookieTipTable, exec_action) == 0x0068);
static_assert(offsetof(FRookieTipTable, face_paint_ids) == 0x0078);
static_assert(offsetof(FAliasesTableMessage, LoosePointMessages) == 0x0050);
static_assert(offsetof(FLoosePointAliasesTable, LinkLoosePointDetailID) == 0x0008);
static_assert(offsetof(FLoosePointAliasesTable, AliasesTableMessage) == 0x0010);
static_assert(offsetof(FMapLoosePoint, PointName) == 0x0010);
static_assert(offsetof(FMapLoosePoint, Root) == 0x0020);
static_assert(offsetof(FMapLoosePoint, LoosePointType) == 0x0050);
static_assert(offsetof(FMapLoosePoint, Comments) == 0x0058);
static_assert(offsetof(FMapLoosePoint, RandomPos) == 0x0068);
static_assert(offsetof(FMapLoosePoint, LinkLoosePointDetailID) == 0x0078);
static_assert(offsetof(FLoosePointMapMessage, SortLoosePoints) == 0x0010);
static_assert(offsetof(FLoosePointDetail, desc) == 0x0010);
static_assert(offsetof(FLoosePointDetail, LoosePoints) == 0x0020);
static_assert(offsetof(FItemCamOffsetOverrideConf, Offset) == 0x000C);
static_assert(offsetof(FItemCornerIconConf, TypeName) == 0x0008);
static_assert(offsetof(FItemCornerIconConf, icon) == 0x0018);
static_assert(offsetof(FItemColorConf, Color) == 0x0008);
static_assert(offsetof(FItemColorConf, SupportTypes) == 0x0018);
static_assert(offsetof(FItemColorConf, IgnoreTypes) == 0x0028);
static_assert(offsetof(FItemColorConf, rarity) == 0x0038);
static_assert(offsetof(FIniFileBackup, IniName) == 0x0000);
static_assert(offsetof(FIniFileBackup, ClassesReloaded) == 0x0010);
static_assert(offsetof(FBuglyData, URL) == 0x0000);
static_assert(offsetof(FBuglyData, Time) == 0x0010);
static_assert(offsetof(FSceneCaptureConfig, CameraTransform) == 0x0000);
static_assert(offsetof(FSceneCaptureConfig, TextureTarget) == 0x0038);
static_assert(offsetof(FSceneCaptureConfig, Light_Rifle_Male) == 0x0048);
static_assert(offsetof(FSceneCaptureConfig, Light_Pistol_Male) == 0x0058);
static_assert(offsetof(FSceneCaptureConfig, Light_Melee_Male) == 0x0068);
static_assert(offsetof(FSceneCaptureConfig, Light_Rifle_Female) == 0x0078);
static_assert(offsetof(FSceneCaptureConfig, Light_Pistol_Female) == 0x0088);
static_assert(offsetof(FSceneCaptureConfig, Light_Melee_Female) == 0x0098);
static_assert(offsetof(FUAFrontEndStageTableRow, SequenceTag) == 0x0010);
static_assert(offsetof(FUAFrontEndStageTableRow, CameraStartFocus) == 0x0028);
static_assert(offsetof(FUAFrontEndStageTableRow, CameraEndFocus) == 0x0038);
static_assert(offsetof(FUAFrontEndStageTableRow, Comment) == 0x0050);
static_assert(offsetof(FUAGamePadVisibilityTableRow, WidgetName) == 0x0010);
static_assert(offsetof(FUATutorialEventTable, EventName) == 0x0008);
static_assert(offsetof(FUATutorialEventTable, ExtraParaText1) == 0x0028);
static_assert(offsetof(FUATutorialEventTable, ExtraParaText2) == 0x0040);
static_assert(offsetof(FUATutorialEventTable, ExtraParaText3) == 0x0058);
static_assert(offsetof(FUAAdviseInvPriorityTable, characterState) == 0x0008);
static_assert(offsetof(FUAAdviseInvPriorityTable, AdviseInvType1) == 0x0018);
static_assert(offsetof(FUAAdviseInvPriorityTable, AdviseInvType2) == 0x0028);
static_assert(offsetof(FUAAdviseInvPriorityTable, AdviseInvType3) == 0x0038);
static_assert(offsetof(FUAAdviseInvPriorityTable, AdviseInvType4) == 0x0048);
static_assert(offsetof(FUAAdviseInvPriorityTable, AdviseInvType5) == 0x0058);
static_assert(offsetof(FUAAdviseInvPriorityTable, AdviseInvType6) == 0x0068);
static_assert(offsetof(FUAAdviseInvPriorityTable, AdviseInvType7) == 0x0078);
static_assert(offsetof(FUAAdviseInvPriorityTable, AdviseInvType8) == 0x0088);
static_assert(offsetof(FUAAdviseInvPriorityTable, AdviseInvType9) == 0x0098);
static_assert(offsetof(FUAAdviseInvPriorityTable, AdviseInvType10) == 0x00A8);
static_assert(offsetof(FUAAdviseInvPriorityTable, AdviseInvTypeEnd) == 0x00B8);
static_assert(offsetof(FUAFactionRelationTable, NormalPMC) == 0x0008);
static_assert(offsetof(FUAFactionRelationTable, NormalScav) == 0x0009);
static_assert(offsetof(FUAFactionRelationTable, PlayerScav) == 0x000A);
static_assert(offsetof(FUAFactionRelationTable, RebelFaction) == 0x000B);
static_assert(offsetof(FUAFactionRelationTable, LakeFaction) == 0x000C);
static_assert(offsetof(FUAFactionRelationTable, GangsterFaction) == 0x000D);
static_assert(offsetof(FUAFactionRelationTable, KurtTeam) == 0x000E);
static_assert(offsetof(FUAFactionRelationTable, NavyFaction) == 0x000F);
static_assert(offsetof(FUAFactionRelationTable, Blackgold) == 0x0010);
static_assert(offsetof(FUAFactionRelationTable, Gnesk) == 0x0011);
static_assert(offsetof(FUAMultiModeWidgetTable, Name) == 0x0010);
static_assert(offsetof(FUAMultiModeWidgetTable, sysIds) == 0x0028);
static_assert(offsetof(FUATraceStyleTable, Annotation) == 0x0010);
static_assert(offsetof(FUATraceStyleTable, Image_Circle_Color_Normal) == 0x0058);
static_assert(offsetof(FUATraceStyleTable, Image_Circle_Color_Teamate) == 0x0080);
static_assert(offsetof(FUATraceStyleTable, Image_Circle_Color_Enemy) == 0x00A8);
static_assert(offsetof(FUATraceStyleTable, Image_BG_Path) == 0x00D0);
static_assert(offsetof(FUATraceStyleTable, Image_BG_Color_Normal) == 0x00E0);
static_assert(offsetof(FUATraceStyleTable, Image_BG_Color_Teamate) == 0x0108);
static_assert(offsetof(FUATraceStyleTable, Image_BG_Color_Enemy) == 0x0130);
static_assert(offsetof(FUATraceStyleTable, Image_Icon_Path) == 0x0158);
static_assert(offsetof(FUATraceStyleTable, Image_Icon_Color_Normal) == 0x0168);
static_assert(offsetof(FUATraceStyleTable, Image_Icon_Color_Teamate) == 0x0190);
static_assert(offsetof(FUATraceStyleTable, Image_Icon_Color_Enemy) == 0x01B8);
static_assert(offsetof(FUATraceStyleTable, Params) == 0x01E0);
static_assert(offsetof(FUATraceSceneStyleParams, HighlightAniName) == 0x0010);
static_assert(offsetof(FUATraceSceneStyleParams, Params) == 0x0028);
static_assert(offsetof(FUATraceNewMapStyleParams, HighlightAniName) == 0x0038);
static_assert(offsetof(FUATraceNewMapStyleParams, Params) == 0x0050);
static_assert(offsetof(FUATraceDirectionalBarStyleParams, HighlightAniName) == 0x0000);
static_assert(offsetof(FUATraceDirectionalBarStyleParams, Params) == 0x0018);
static_assert(offsetof(FUANewTraceStyleTable, Annotation) == 0x0008);
static_assert(offsetof(FUANewTraceStyleTable, Color) == 0x0018);
static_assert(offsetof(FUANewTraceStyleTable, MarkIconResource) == 0x0040);
static_assert(offsetof(FUANewTraceStyleTable, BackgroundResource) == 0x0058);
static_assert(offsetof(FUANewTraceStyleTable, SceneStyleParams) == 0x0070);
static_assert(offsetof(FUANewTraceStyleTable, NewMapStyleParams) == 0x00A8);
static_assert(offsetof(FUANewTraceStyleTable, DirectionalBarStyleParams) == 0x0108);
static_assert(offsetof(FUANewTraceRuleTable, SyncRule) == 0x0008);
static_assert(offsetof(FUANewTraceRuleTable, SceneRuleParams) == 0x000C);
static_assert(offsetof(FUANewTraceRuleTable, NewMapRuleParams) == 0x0018);
static_assert(offsetof(FUANewTraceRuleTable, DirectionalBarRuleParams) == 0x0024);
static_assert(offsetof(FUANewTraceConfigTable, MarkType) == 0x0008);
static_assert(offsetof(FUANewTraceConfigTable, TraceRuleRowName) == 0x0010);
static_assert(offsetof(FUANewTraceConfigTable, TraceTitle) == 0x0030);
static_assert(offsetof(FUANewTraceConfigTable, TraceDesc) == 0x0048);
static_assert(offsetof(FUANewTraceConfigTable, TargetTitle) == 0x0060);
static_assert(offsetof(FUANewTraceConfigTable, TargetDesc) == 0x0078);
static_assert(offsetof(FUATraceTargetTable, TargetTitle) == 0x0010);
static_assert(offsetof(FUATraceTargetTable, TargetDesc) == 0x0028);
static_assert(offsetof(FUATraceTargetTable, TraceTitle) == 0x0048);
static_assert(offsetof(FUATraceTargetTable, TraceDesc) == 0x0060);
static_assert(offsetof(FUATraceTargetTable, AnimName) == 0x0078);
static_assert(offsetof(FUALootDataInfosTable, Description) == 0x0010);
static_assert(offsetof(FUALootDataInfosTable, LootPointIcon) == 0x0028);
static_assert(offsetof(FUASubTitleTextTable, Text) == 0x0010);
static_assert(offsetof(FUASubTitleVOTable, SoundResource) == 0x0010);
static_assert(offsetof(FUASubTitleVOTable, SoundType) == 0x0024);
static_assert(offsetof(FItemConfTableRowBPProxy, Name) == 0x0010);
static_assert(offsetof(FItemConfTableRowBPProxy, ShortName) == 0x0020);
static_assert(offsetof(FItemConfTableRowBPProxy, Describe) == 0x0038);
static_assert(offsetof(FItemConfTableRowBPProxy, pickup_sound) == 0x0058);
static_assert(offsetof(FItemConfTableRowBPProxy, use_sound) == 0x0068);
static_assert(offsetof(FItemConfTableRowBPProxy, drop_sound) == 0x0078);
static_assert(offsetof(FItemConfTableRowBPProxy, RejectSlot) == 0x00B0);
static_assert(offsetof(FLootDropTableRowBPProxy, desc) == 0x0010);
static_assert(offsetof(FLootDropTableRowBPProxy, ItemNum) == 0x0030);
static_assert(offsetof(FLootDropTableRowBPProxy, SubItemTable) == 0x0040);
static_assert(offsetof(FLootDropTableRowBPProxy, LootPointWhite) == 0x0068);
static_assert(offsetof(FLootDropTableRowBPProxy, LootPointBlack) == 0x0078);
static_assert(offsetof(FLootDropTableRowBPProxy, Describe) == 0x0088);
static_assert(offsetof(FMapDetailTableRowBPProxy, map_level) == 0x0010);
static_assert(offsetof(FMapDetailTableRowBPProxy, mobile_map_level) == 0x0020);
static_assert(offsetof(FMapDetailTableRowBPProxy, Name) == 0x0030);
static_assert(offsetof(FMapDetailTableRowBPProxy, level_path) == 0x0040);
static_assert(offsetof(FMapDetailTableRowBPProxy, Picture) == 0x0050);
static_assert(offsetof(FMapDetailTableRowBPProxy, desc) == 0x0060);
static_assert(offsetof(FMapDetailTableRowBPProxy, MapSize) == 0x0070);
static_assert(offsetof(FMapDetailTableRowBPProxy, SampleScenePoints) == 0x0078);
static_assert(offsetof(FMapDetailTableRowBPProxy, SampleMapPoints) == 0x0088);
static_assert(offsetof(FUAEscapeInteractTextTable, InteractText) == 0x0010);
static_assert(offsetof(FUAPlayerEscapeShowRow, PCArr) == 0x0018);
static_assert(offsetof(FUAEscapeTextTableRow, EscapeName) == 0x0010);
static_assert(offsetof(FUAEscapeTextTableRow, ConditionDescription) == 0x0028);
static_assert(offsetof(FUAEscapeTextTableRow, ConditionDescShort) == 0x0040);
static_assert(offsetof(FUAEscapeTextTableRow, ConditionPassText) == 0x0058);
static_assert(offsetof(FUAEscapeTextTableRow, EscapeDescription) == 0x0070);
static_assert(offsetof(FUAEscapeTextTableRow, RemainTimeText) == 0x0088);
static_assert(offsetof(FUAEscapeTextTableRow, AlreadyFailText) == 0x00A0);
static_assert(offsetof(FUAEscapeTextTableRow, PersonHitContent) == 0x00C0);
static_assert(offsetof(FUAEscapeTextTableRow, GlobalHitContent) == 0x00D8);
static_assert(offsetof(FUAEscapeTextTableRow, GlobalCloseHitContent) == 0x00F0);
static_assert(offsetof(FUAEscapeTextTableRow, Location) == 0x0108);
static_assert(offsetof(FUAEscapeTextTableRow, GlobalLeftTimeHitContent_OpenEscape) == 0x0118);
static_assert(offsetof(FUAEscapeTextTableRow, GlobalLeftTimeHitContent_CloseEscape) == 0x0130);
static_assert(offsetof(FPanelLayerTableRow, LayerName) == 0x0008);
static_assert(offsetof(FPanelConfTableRow, Name) == 0x0008);
static_assert(offsetof(FPanelConfTableRow, OwnerModule) == 0x0018);
static_assert(offsetof(FPanelConfTableRow, AssetMobileName) == 0x0028);
static_assert(offsetof(FPanelConfTableRow, LayerName) == 0x0038);
static_assert(offsetof(FPanelConfTableRow, OwnerPanel) == 0x0048);
static_assert(offsetof(FServiceConfTableRow, Name) == 0x0008);
static_assert(offsetof(FServiceConfTableRow, InitContext) == 0x0018);
static_assert(offsetof(FServiceConfTableRow, ResetContext) == 0x0028);
static_assert(offsetof(FServiceConfTableRow, desc) == 0x0038);
static_assert(offsetof(FServiceConfTableRow, ServiceType) == 0x0048);
static_assert(offsetof(FModuleContextConfTableRow, Name) == 0x0008);
static_assert(offsetof(FModuleContextConfTableRow, LevelPath) == 0x0018);
static_assert(offsetof(FModuleContextConfTableRow, desc) == 0x0028);
static_assert(offsetof(FModuleConfTableRow, Name) == 0x0008);
static_assert(offsetof(FModuleConfTableRow, Context) == 0x0018);
static_assert(offsetof(FModuleConfTableRow, desc) == 0x0028);
static_assert(offsetof(FUAGameBigMapModuleModeTable, DisplayName) == 0x0030);
static_assert(offsetof(FUAGameLandmarkTable, LandMarkName) == 0x0010);
static_assert(offsetof(FUAGameLandmarkTable, WorldLocation) == 0x0028);
static_assert(offsetof(FUAGameBigMapEffectTable, AreaIDs) == 0x0050);
static_assert(offsetof(FUALootPointInfo, Location) == 0x0010);
static_assert(offsetof(FUALootPointInfo, AreaName) == 0x0020);
static_assert(offsetof(FUALootPointInfo, LevelPath) == 0x0040);
static_assert(offsetof(FUABattleQuickChat, ChatType) == 0x0010);
static_assert(offsetof(FUABattleQuickChat, ListName) == 0x0020);
static_assert(offsetof(FUABattleQuickChat, ChatContent) == 0x0038);
static_assert(offsetof(FUABattleQuickChat, ChatSound) == 0x0050);
static_assert(offsetof(FUAGamePadMessageTable, GamePadWidgets) == 0x000C);
static_assert(offsetof(FUAGamePadMessageTable, GamePadEffectWidgets) == 0x000E);
static_assert(offsetof(FUAGameHUDTable, Location_Type) == 0x0038);
static_assert(offsetof(FUAGameHUDTable, Content_Img_Color) == 0x0098);
static_assert(offsetof(FUAGameHUDTable, Normal_Text) == 0x00C0);
static_assert(offsetof(FUAGameHUDTable, AudioEvent) == 0x00E0);
static_assert(offsetof(FUATaskTypeTable, TypeDesc) == 0x0010);
static_assert(offsetof(FUATaskTypeTable, iconPath) == 0x0028);
static_assert(offsetof(FUAStatisParamInfo, CompareType) == 0x0008);
static_assert(offsetof(FUAStatisParamInfo, ValueList) == 0x0028);
static_assert(offsetof(FUADescribeWordArgs, arg) == 0x0008);
static_assert(offsetof(FUADescribeWordArgs, ResolveMethod) == 0x0018);
static_assert(offsetof(FUABattleEventTable, Describe) == 0x0008);
static_assert(offsetof(FUABattleEventTable, StatisMethod) == 0x0019);
static_assert(offsetof(FUABattleEventTable, Params) == 0x0020);
static_assert(offsetof(FUABattleEventTable, CutTrendArgsOnDistance) == 0x0048);
static_assert(offsetof(FUABattleEventTable, CutTrendArgsOnDeltaTime) == 0x0058);
static_assert(offsetof(FUABattleEventTable, CutTrendArgsOnEventValue) == 0x0068);
static_assert(offsetof(FUABattleEventTable, DescribeWord) == 0x0078);
static_assert(offsetof(FUABattleEventTable, DescribeWordArgsList) == 0x0088);
static_assert(offsetof(FUABattleEventTable, CombinedDescribeWord) == 0x0098);
static_assert(offsetof(FUABattleEventTable, CombinedDescribeWordArgsList) == 0x00A8);
static_assert(offsetof(FUAStatisTable, Describe) == 0x0008);
static_assert(offsetof(FUAStatisTable, StatisMethod) == 0x0020);
static_assert(offsetof(FUAStatisTable, Params) == 0x0028);
static_assert(offsetof(FUAStatisTable, ExpCaculator) == 0x0040);
static_assert(offsetof(FUAServiceTable, InitContext) == 0x0008);
static_assert(offsetof(FUAServiceTable, ResetContext) == 0x0018);
static_assert(offsetof(FUAModuleTable, Context) == 0x0008);
static_assert(offsetof(FUAModuleTable, DefaultPanel) == 0x0018);
static_assert(offsetof(FUAModuleContextTable, Name) == 0x0008);
static_assert(offsetof(FUAModuleContextTable, LevelPath) == 0x0018);
static_assert(offsetof(FUAVestBagGridTable, Name) == 0x0008);
static_assert(offsetof(FUABattleMapTable, MapLevel) == 0x0008);
static_assert(offsetof(FUABattleMapTable, MobileMapLevel) == 0x0018);
static_assert(offsetof(FUABattleMapTable, Name) == 0x0030);
static_assert(offsetof(FUABattleMapTable, Picture) == 0x0040);
static_assert(offsetof(FUABattleMapTable, desc) == 0x0050);
static_assert(offsetof(FUAGlobalNumTable, Name) == 0x0008);
static_assert(offsetof(FUABattleresultTable, Describe) == 0x0018);
static_assert(offsetof(FUAItemContextMenuTable, DisplayName) == 0x0008);
static_assert(offsetof(FUAItemContextMenuTable, UseTip) == 0x0028);
static_assert(offsetof(FTextLocalizationPatch, NativeCulture) == 0x0000);
static_assert(offsetof(FTextLocalizationPatch, Namespace) == 0x0010);
static_assert(offsetof(FTextLocalizationPatch, Key) == 0x0020);
static_assert(offsetof(FTextLocalizationPatch, NativeString) == 0x0030);
static_assert(offsetof(FActivityResidentMissionConfig, MissionList) == 0x0000);
static_assert(offsetof(FActivityRandomMissionConfig, MissionList) == 0x0008);
static_assert(offsetof(FActivityMissionConfig, ResidentMission) == 0x0000);
static_assert(offsetof(FActivityMissionConfig, RandomMission) == 0x0010);
static_assert(offsetof(FActivityMissionConfig, CloseOtherActivityIDs) == 0x0030);
static_assert(offsetof(FDynamicResidentMissionConfig, MissionList) == 0x0000);
static_assert(offsetof(FDynamicRandomMissionConfig, MissionList) == 0x0008);
static_assert(offsetof(FUAModeDynamicMissionTable, LevelName) == 0x0020);
static_assert(offsetof(FUAModeDynamicMissionTable, ResidentMission) == 0x0030);
static_assert(offsetof(FUAModeDynamicMissionTable, RandomMission) == 0x0040);
static_assert(offsetof(FUAModeQuestDistributerConfigTable, NeedLoadQuestDistributer) == 0x0028);
static_assert(offsetof(FActivityQuestDistributer, ActivityQuestDistributers) == 0x0000);
static_assert(offsetof(FUAScriptLevelTable, ScriptMaps) == 0x0020);
static_assert(offsetof(FUAScriptLevelTable, AdditionIgnores) == 0x0030);
static_assert(offsetof(FUAModeLootConfigTable, LootMaps) == 0x0050);
static_assert(offsetof(FUAPlayerStartGroupData, StartPointType) == 0x0004);
static_assert(offsetof(FUAPlayerStartGroupData, EscapePreset) == 0x0018);
static_assert(offsetof(FUAAIStartGroupData, StartPointType) == 0x0004);
static_assert(offsetof(FUAModeStartAndEscapeTable, LevelName) == 0x0020);
static_assert(offsetof(FUAModeStartAndEscapeTable, AdditionLevelName) == 0x0030);
static_assert(offsetof(FUAModeStartAndEscapeTable, PlayerStart) == 0x0040);
static_assert(offsetof(FUAModeStartAndEscapeTable, AIStartAddition) == 0x0050);
static_assert(offsetof(FUAEscapeRandomStruct, EscapePointIDs) == 0x0000);
static_assert(offsetof(FEscapePreset, ConstantEscapePointIDs) == 0x0008);
static_assert(offsetof(FEscapePreset, RandomEscapePointIDs) == 0x0020);
static_assert(offsetof(FEscapePreset, RandomArr) == 0x0038);
static_assert(offsetof(FUAGameModeTableRow, MainModeName) == 0x0010);
static_assert(offsetof(FUAGameModeTableRow, SubModeName) == 0x0030);
static_assert(offsetof(FPanelProfilerStack, theStack) == 0x0000);
