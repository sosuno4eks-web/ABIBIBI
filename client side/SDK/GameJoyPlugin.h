
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Class /Script/GameJoyPlugin.BP_GameJoyPluginLibrary
/// Size: 0x0020 (32 bytes) (0x000028 - 0x000048) align 8 pad: 0x0000
class UBP_GameJoyPluginLibrary : public UBlueprintFunctionLibrary
{ 
public:
	unsigned char                                      UnknownData00_3[0x10];                                      // 0x0028   (0x0010)  MISSED
	SDK_UNDEFINED(16,2633) /* FMulticastInlineDelegate */ __um(onGameJoyEvent);                                    // 0x0038   (0x0010)  


	/// Functions
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.UpdateRedDot
	// void UpdateRedDot(bool showRedDot);                                                                                      // [0x16b4cc0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.UnLockRecorderPosition
	// void UnLockRecorderPosition();                                                                                           // [0x16b49e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.StopRecorder
	// void StopRecorder();                                                                                                     // [0x16b49e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.StartRecorder
	// bool StartRecorder();                                                                                                    // [0x16b67e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.ShowRecorderDialog
	// void ShowRecorderDialog(float X, float Y);                                                                               // [0x16b6720] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.ShowConsole
	// void ShowConsole();                                                                                                      // [0x16b49e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.SetWwiseListenerStatus
	// void SetWwiseListenerStatus(bool isMultiple);                                                                            // [0x16b4cc0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.SetWatermark
	// void SetWatermark(FString Path, float X, float Y);                                                                       // [0x16b65c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.SetVideoResolution
	// void SetVideoResolution(int32_t Type, int32_t Resolution);                                                               // [0x16b6480] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.SetVideoQuality
	// void SetVideoQuality(int32_t quality);                                                                                   // [0x16b6540] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.SetVideoBitrate
	// void SetVideoBitrate(int32_t Type, int32_t bitrate);                                                                     // [0x16b6480] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.SetMinAvailableSpaceMB
	// void SetMinAvailableSpaceMB(int32_t minAvailableSpaceMB);                                                                // [0x16b6540] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.SetFrameRate
	// void SetFrameRate(int32_t FrameRate);                                                                                    // [0x16b6540] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.SetCoverSize
	// void SetCoverSize(int32_t Width, int32_t Height);                                                                        // [0x16b6480] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.SetAutoProfileLevel
	// void SetAutoProfileLevel(bool Enabled);                                                                                  // [0x16b4cc0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.SetAlbumName
	// void SetAlbumName(FString albumName);                                                                                    // [0x16b4d40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.RequestSDKPermission
	// void RequestSDKPermission(int32_t eventId, FString Type);                                                                // [0x16b4e20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.PlayLocalVideo
	// void PlayLocalVideo(FString Path, int32_t Type);                                                                         // [0x16b63b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.NotifySpaceNotEnough
	// void NotifySpaceNotEnough();                                                                                             // [0x16b49e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.MoveVideoToAlbum
	// void MoveVideoToAlbum(int32_t eventId, FString albumName, FString srcPath);                                              // [0x16b4b20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.MoveFileToDocument
	// void MoveFileToDocument(FString fromPath, FString toSubPath);                                                            // [0x16b6240] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.MoveFile
	// bool MoveFile(FString& from, FString& dst);                                                                              // [0x16b6120] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.MoveAlbumToLocal
	// void MoveAlbumToLocal(int32_t eventId, FString albumPath, FString localPath);                                            // [0x16b5f80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.MergeVideoWithImageAndVideo
	// void MergeVideoWithImageAndVideo(int32_t eventId, FString videopath, FString headerVideo, FString ImagePath);            // [0x16b5d50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.LockRecorderPosition
	// void LockRecorderPosition();                                                                                             // [0x16b49e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.IsRecording
	// bool IsRecording();                                                                                                      // [0x16b5d20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.IsRecorderDialogShow
	// bool IsRecorderDialogShow();                                                                                             // [0x16b5d20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.IsIOSFileExist
	// bool IsIOSFileExist(FString FilePath);                                                                                   // [0x16b5c30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.IsFileExist
	// bool IsFileExist(FString FilePath);                                                                                      // [0x16b5b40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.IsDirExist
	// bool IsDirExist(FString Path);                                                                                           // [0x16b5a50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.InitGameJoyBPLib
	// void InitGameJoyBPLib();                                                                                                 // [0x16b49e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.GetVideoMd5
	// void GetVideoMd5(int32_t eventId, FString videoPathJson);                                                                // [0x16b4e20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.GetVideoInfo
	// void GetVideoInfo(int32_t eventId, FString videoPathJson);                                                               // [0x16b5980] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.GetTimeSeconds
	// int32_t GetTimeSeconds();                                                                                                // [0x16b5950] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.GetTimeMilliSeconds
	// int32_t GetTimeMilliSeconds();                                                                                           // [0x16b5920] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.GetSandboxPath
	// void GetSandboxPath(int32_t eventId);                                                                                    // [0x16b58a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.GetPaths
	// FString GetPaths(int32_t pathType, bool relative);                                                                       // [0x16b5790] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.GetPathRelativeTo
	// FString GetPathRelativeTo(FString fromPath, FString RelativeTo);                                                         // [0x16b55e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.GetOldVideoFromAlbumName
	// void GetOldVideoFromAlbumName(FString albumName);                                                                        // [0x16b5500] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.GetInstance
	// class UBP_GameJoyPluginLibrary* GetInstance();                                                                           // [0x16b54d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.GetGFilePathBase
	// FString GetGFilePathBase();                                                                                              // [0x16b5450] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.GetFreeDiskSpace
	// int32_t GetFreeDiskSpace();                                                                                              // [0x16b5420] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.GetFilesInDir
	// FString GetFilesInDir(FString Path);                                                                                     // [0x16b52f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.GetFilesFromPath
	// void GetFilesFromPath(int32_t eventId, FString Path, bool isIncludeChildren);                                            // [0x16b5190] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.GetFilePathFromUri
	// FString GetFilePathFromUri(FString uriPath);                                                                             // [0x16b5060] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.GetFdFromUri
	// int32_t GetFdFromUri(FString Uri);                                                                                       // [0x16b4fc0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.GetDeviceInfo
	// FString GetDeviceInfo();                                                                                                 // [0x16b4f40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.GenerateVideoCover
	// void GenerateVideoCover(int32_t eventId, FString videopath);                                                             // [0x16b4e20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.GenerateMomentsVideo
	// void GenerateMomentsVideo(FString videoTimeStampListJson);                                                               // [0x16b4d40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.EnableInGameAudio
	// void EnableInGameAudio(bool enable);                                                                                     // [0x16b4cc0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.EnableBgmMix
	// void EnableBgmMix(bool mixing);                                                                                          // [0x16b4cc0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.DeleteVideoByAlbum
	// void DeleteVideoByAlbum(int32_t eventId, FString albumName, FString srcPath);                                            // [0x16b4b20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.CopyFile
	// bool CopyFile(FString& from, FString& dst);                                                                              // [0x16b4a00] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.CloseRecorderDialog
	// void CloseRecorderDialog();                                                                                              // [0x16b49e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.CloseFd
	// int32_t CloseFd(int32_t fd);                                                                                             // [0x16b4950] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.CheckSDKPermission
	// int32_t CheckSDKPermission(FString Type);                                                                                // [0x16b4860] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/GameJoyPlugin.BP_GameJoyPluginLibrary.CheckAlbumVideoExist
	// bool CheckAlbumVideoExist(FString Path);                                                                                 // [0x16b47c0] Final|Native|Static|Public|BlueprintCallable 
};

static_assert(sizeof(UBP_GameJoyPluginLibrary) == 0x0048); // 72 bytes (0x000028 - 0x000048)
