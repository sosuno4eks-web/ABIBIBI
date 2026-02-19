
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: CoreUObject

/// Enum /Script/MFAVWrapper.EMovieCaptureState
/// Size: 0x01 (1 bytes)
enum class EMovieCaptureState : uint8_t
{
	EMovieCaptureState__NotInit                                                      = 0,
	EMovieCaptureState__Initialize                                                   = 1,
	EMovieCaptureState__Initialized                                                  = 2,
	EMovieCaptureState__Capturing                                                    = 3
};

/// Class /Script/MFAVWrapper.VideoClipManager
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UVideoClipManager : public UObject
{ 
public:


	/// Functions
	// Function /Script/MFAVWrapper.VideoClipManager.Get
	// class UVideoClipManager* Get();                                                                                          // [0x18d41f0] Final|Native|Static|Public 
};

/// Class /Script/MFAVWrapper.VideoCaptureManager
/// Size: 0x0140 (320 bytes) (0x000028 - 0x000168) align 8 pad: 0x0000
class UVideoCaptureManager : public UObject
{ 
public:
	uint32_t                                           ResolutionX;                                                // 0x0028   (0x0004)  
	uint32_t                                           ResolutionY;                                                // 0x002C   (0x0004)  
	uint32_t                                           CodeRate;                                                   // 0x0030   (0x0004)  
	EMovieCaptureState                                 CaptureState;                                               // 0x0034   (0x0001)  
	unsigned char                                      UnknownData00_6[0x12B];                                     // 0x0035   (0x012B)  MISSED
	bool                                               bForceStop;                                                 // 0x0160   (0x0001)  
	unsigned char                                      UnknownData01_7[0x7];                                       // 0x0161   (0x0007)  MISSED


	/// Functions
	// Function /Script/MFAVWrapper.VideoCaptureManager.StartVideoCapture
	// void StartVideoCapture(bool bLoop, bool bEnableAudioCapture);                                                            // [0x18d42b0] Final|Native|Public  
	// Function /Script/MFAVWrapper.VideoCaptureManager.ShutDownVideoCapture
	// void ShutDownVideoCapture(int32_t inClipDuration);                                                                       // [0x18d4220] Final|Native|Public  
	// Function /Script/MFAVWrapper.VideoCaptureManager.Get
	// class UVideoCaptureManager* Get();                                                                                       // [0x18d41c0] Final|Native|Static|Public 
	// Function /Script/MFAVWrapper.VideoCaptureManager.FinishVideoCapture
	// void FinishVideoCapture();                                                                                               // [0x18d41a0] Final|Native|Public  
	// Function /Script/MFAVWrapper.VideoCaptureManager.FinishCapturePhase
	// void FinishCapturePhase();                                                                                               // [0xd906a0] Final|Native|Public  
};

static_assert(sizeof(UVideoClipManager) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UVideoCaptureManager) == 0x0168); // 360 bytes (0x000028 - 0x000168)
static_assert(offsetof(UVideoCaptureManager, CaptureState) == 0x0034);
