
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Class /Script/WindowsDevicePermission.WindowsDevicePermissionHelper
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UWindowsDevicePermissionHelper : public UObject
{ 
public:


	/// Functions
	// Function /Script/WindowsDevicePermission.WindowsDevicePermissionHelper.JumpPermissionPage
	// void JumpPermissionPage();                                                                                               // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/WindowsDevicePermission.WindowsDevicePermissionHelper.GetDeviceId
	// FString GetDeviceId();                                                                                                   // [0x19adfd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/WindowsDevicePermission.WindowsDevicePermissionHelper.CheckNotificationPermission
	// bool CheckNotificationPermission();                                                                                      // [0xc12490] Final|Native|Static|Public|BlueprintCallable 
};

/// Struct /Script/WindowsDevicePermission.HardwareBlacklistTableRow
/// Size: 0x0018 (24 bytes) (0x000008 - 0x000020) align 8 pad: 0x0000
struct FHardwareBlacklistTableRow : FTableRowBase
{ 
	uint32_t                                           HardwareId;                                                 // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FString                                            HardwareName;                                               // 0x0010   (0x0010)  
};

/// Struct /Script/WindowsDevicePermission.HardwareCheckConfigTableRow
/// Size: 0x0028 (40 bytes) (0x000008 - 0x000030) align 8 pad: 0x0000
struct FHardwareCheckConfigTableRow : FTableRowBase
{ 
	FString                                            DeviceName;                                                 // 0x0008   (0x0010)  
	int32_t                                            IntValue;                                                   // 0x0018   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x001C   (0x0004)  MISSED
	FString                                            Comment;                                                    // 0x0020   (0x0010)  
};

/// Struct /Script/WindowsDevicePermission.SystemLocalizationMsgTableRow
/// Size: 0x0030 (48 bytes) (0x000008 - 0x000038) align 8 pad: 0x0000
struct FSystemLocalizationMsgTableRow : FTableRowBase
{ 
	uint32_t                                           MsgID;                                                      // 0x0008   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	FString                                            culture;                                                    // 0x0010   (0x0010)  
	FText                                              MsgText;                                                    // 0x0020   (0x0018)  
};

static_assert(sizeof(UWindowsDevicePermissionHelper) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FHardwareBlacklistTableRow) == 0x0020); // 32 bytes (0x000008 - 0x000020)
static_assert(sizeof(FHardwareCheckConfigTableRow) == 0x0030); // 48 bytes (0x000008 - 0x000030)
static_assert(sizeof(FSystemLocalizationMsgTableRow) == 0x0038); // 56 bytes (0x000008 - 0x000038)
static_assert(offsetof(FHardwareBlacklistTableRow, HardwareName) == 0x0010);
static_assert(offsetof(FHardwareCheckConfigTableRow, DeviceName) == 0x0008);
static_assert(offsetof(FHardwareCheckConfigTableRow, Comment) == 0x0020);
static_assert(offsetof(FSystemLocalizationMsgTableRow, culture) == 0x0010);
static_assert(offsetof(FSystemLocalizationMsgTableRow, MsgText) == 0x0020);
