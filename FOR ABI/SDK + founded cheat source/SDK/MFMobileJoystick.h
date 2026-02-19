
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: SGFramework
/// dependency: UMG

/// Enum /Script/MFMobileJoystick.EAcceptOP
/// Size: 0x01 (1 bytes)
enum class EAcceptOP : uint8_t
{
	EAcceptOP__EAOP_Direct                                                           = 0,
	EAcceptOP__EAOP_ScaleBySpeed                                                     = 1
};

/// Enum /Script/MFMobileJoystick.EBlendOP
/// Size: 0x01 (1 bytes)
enum class EBlendOP : uint8_t
{
	EBlendOP__EOP_BlendFactor                                                        = 0,
	EBlendOP__EOP_BlendFactor_Interp                                                 = 1,
	EBlendOP__EOP_BlendFactor_Curve                                                  = 2,
	EBlendOP__EOP_BlendFactor_MagicMin                                               = 3,
	EBlendOP__EOP_BlendFactor_MagicMax                                               = 4
};

/// Class /Script/MFMobileJoystick.MFMobileCircleUserWidget
/// Size: 0x0050 (80 bytes) (0x000288 - 0x0002D8) align 8 pad: 0x0000
class UMFMobileCircleUserWidget : public UUserWidget
{ 
public:
	int32_t                                            WidgetPointIndex;                                           // 0x0288   (0x0004)  
	bool                                               bOpenTouchTick;                                             // 0x028C   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x028D   (0x0003)  MISSED
	SDK_UNDEFINED(16,2238) /* FMulticastInlineDelegate */ __um(OnTouchStart);                                      // 0x0290   (0x0010)  
	SDK_UNDEFINED(16,2239) /* FMulticastInlineDelegate */ __um(OnTouchEnd);                                        // 0x02A0   (0x0010)  
	SDK_UNDEFINED(16,2240) /* FMulticastInlineDelegate */ __um(OnTouchOutCircle);                                  // 0x02B0   (0x0010)  
	SDK_UNDEFINED(16,2241) /* FMulticastInlineDelegate */ __um(OnOutOfButtonTouchEnded);                           // 0x02C0   (0x0010)  
	EButtonAcceptInputType                             AcceptInputType;                                            // 0x02D0   (0x0001)  
	EButtonAcceptInputType                             CurrentAcceptInputType;                                     // 0x02D1   (0x0001)  
	unsigned char                                      UnknownData01_7[0x6];                                       // 0x02D2   (0x0006)  MISSED


	/// Functions
	// Function /Script/MFMobileJoystick.MFMobileCircleUserWidget.SetFingerIndexDisableMoveAndRotate
	// void SetFingerIndexDisableMoveAndRotate(int32_t CustomWidgetPointIndex, bool bDisable);                                  // [0x2f5a990] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobileCircleUserWidget.OnInputTouchEnded
	// void OnInputTouchEnded(TEnumAsByte<ETouchIndex> FingerIndex);                                                            // [0x2f5a450] Final|Native|Public  
	// Function /Script/MFMobileJoystick.MFMobileCircleUserWidget.IsPressed
	// bool IsPressed();                                                                                                        // [0x2f5a140] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobileCircleUserWidget.InMovementArea
	// bool InMovementArea(class UWidget* Widget);                                                                              // [0x2f59f70] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobileCircleUserWidget.GetCurrentWidgetPointIndex
	// int32_t GetCurrentWidgetPointIndex();                                                                                    // [0x2f59910] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobileCircleUserWidget.DebugCallOnTouchStart
	// void DebugCallOnTouchStart();                                                                                            // [0xd906a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobileCircleUserWidget.DebugCallOnTouchEnd
	// void DebugCallOnTouchEnd();                                                                                              // [0xd906a0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFMobileJoystick.MFMobileCircleUserWidget_Fire
/// Size: 0x0038 (56 bytes) (0x0002D8 - 0x000310) align 8 pad: 0x0000
class UMFMobileCircleUserWidget_Fire : public UMFMobileCircleUserWidget
{ 
public:
	SDK_UNDEFINED(16,2242) /* FMulticastInlineDelegate */ __um(PostStartFireByTouch);                              // 0x02D8   (0x0010)  
	bool                                               bIsLeftFireBtn;                                             // 0x02E8   (0x0001)  
	unsigned char                                      UnknownData00_6[0xF];                                       // 0x02E9   (0x000F)  MISSED
	class ASGPlayerController*                         CachedPlayerController;                                     // 0x02F8   (0x0008)  
	class ASGCharacter*                                CachedCharacter;                                            // 0x0300   (0x0008)  
	unsigned char                                      UnknownData01_7[0x8];                                       // 0x0308   (0x0008)  MISSED


	/// Functions
	// Function /Script/MFMobileJoystick.MFMobileCircleUserWidget_Fire.TouchFireStarted
	// void TouchFireStarted();                                                                                                 // [0x2f5b720] Final|Native|Public  
	// Function /Script/MFMobileJoystick.MFMobileCircleUserWidget_Fire.OnZoomChanged
	// void OnZoomChanged(bool bInZoomChanged);                                                                                 // [0x2f5a4d0] Final|Native|Private 
	// Function /Script/MFMobileJoystick.MFMobileCircleUserWidget_Fire.OnCheckFireDown
	// void OnCheckFireDown();                                                                                                  // [0x2f5a230] Final|Native|Private 
	// Function /Script/MFMobileJoystick.MFMobileCircleUserWidget_Fire.NativeStartFire
	// void NativeStartFire();                                                                                                  // [0x2f5a210] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobileCircleUserWidget_Fire.NativeEndFire
	// void NativeEndFire();                                                                                                    // [0x2f5a1f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobileCircleUserWidget_Fire.GetUseAutoZoom
	// bool GetUseAutoZoom();                                                                                                   // [0x2f59f40] Final|Native|Public  
	// Function /Script/MFMobileJoystick.MFMobileCircleUserWidget_Fire.GetPressedScreenSpacePosition
	// FVector2D GetPressedScreenSpacePosition();                                                                               // [0x2f59d10] Final|Native|Public|HasDefaults|BlueprintCallable 
};

/// Class /Script/MFMobileJoystick.MFMobileCustomShapeButton
/// Size: 0x0010 (16 bytes) (0x000490 - 0x0004A0) align 8 pad: 0x0000
class UMFMobileCustomShapeButton : public UButton
{ 
public:
	class UTexture2D*                                  AdvancedHitTexture;                                         // 0x0490   (0x0008)  
	int32_t                                            AdvancedHitAlpha;                                           // 0x0498   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x049C   (0x0004)  MISSED


	/// Functions
	// Function /Script/MFMobileJoystick.MFMobileCustomShapeButton.SetAdvancedHitTexture
	// void SetAdvancedHitTexture(class UTexture2D* InTexture);                                                                 // [0x2f5a740] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobileCustomShapeButton.SetAdvancedHitAlpha
	// void SetAdvancedHitAlpha(int32_t InAlpha);                                                                               // [0x2f5a6a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobileCustomShapeButton.CheckIfLastMouseButtonUpInZone
	// bool CheckIfLastMouseButtonUpInZone();                                                                                   // [0x2f59780] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFMobileJoystick.MFMobileDragDropUserWidget
/// Size: 0x0088 (136 bytes) (0x0002D0 - 0x000358) align 8 pad: 0x0000
class UMFMobileDragDropUserWidget : public USGUserWidget
{ 
public:
	SDK_UNDEFINED(16,2243) /* FMulticastInlineDelegate */ __um(OnDropEvent);                                       // 0x02D0   (0x0010)  
	SDK_UNDEFINED(16,2244) /* FMulticastInlineDelegate */ __um(OnDragDetectedEvent);                               // 0x02E0   (0x0010)  
	SDK_UNDEFINED(16,2245) /* FMulticastInlineDelegate */ __um(OnDragOverEvent);                                   // 0x02F0   (0x0010)  
	SDK_UNDEFINED(16,2246) /* FMulticastInlineDelegate */ __um(OnDragEnterEvent);                                  // 0x0300   (0x0010)  
	SDK_UNDEFINED(16,2247) /* FMulticastInlineDelegate */ __um(OnDragLeaveEvent);                                  // 0x0310   (0x0010)  
	SDK_UNDEFINED(16,2248) /* FMulticastInlineDelegate */ __um(OnDragCancelledEvent);                              // 0x0320   (0x0010)  
	SDK_UNDEFINED(16,2249) /* FMulticastInlineDelegate */ __um(OnTouchStartedEvent);                               // 0x0330   (0x0010)  
	SDK_UNDEFINED(16,2250) /* FMulticastInlineDelegate */ __um(OnTouchEndedEvent);                                 // 0x0340   (0x0010)  
	bool                                               bDropable;                                                  // 0x0350   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0351   (0x0007)  MISSED
};

/// Class /Script/MFMobileJoystick.MFMobileDraggableButton
/// Size: 0x0008 (8 bytes) (0x000490 - 0x000498) align 8 pad: 0x0000
class UMFMobileDraggableButton : public UButton
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0490   (0x0008)  MISSED
};

/// Class /Script/MFMobileJoystick.MFMobileGameHandle
/// Size: 0x01B0 (432 bytes) (0x000028 - 0x0001D8) align 8 pad: 0x0000
class UMFMobileGameHandle : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x28];                                      // 0x0028   (0x0028)  MISSED
	class UMFMobileInputButton*                        MovementButton;                                             // 0x0050   (0x0008)  
	class UMFMobileInputButton*                        RotationButton;                                             // 0x0058   (0x0008)  
	class UMFMobileMoveHandleImpl*                     MoveHandleImpl;                                             // 0x0060   (0x0008)  
	unsigned char                                      UnknownData01_6[0x130];                                     // 0x0068   (0x0130)  MISSED
	class UMFMobilePlayerInput*                        CachedPlayerInput;                                          // 0x0198   (0x0008)  
	unsigned char                                      UnknownData02_7[0x38];                                      // 0x01A0   (0x0038)  MISSED
};

/// Class /Script/MFMobileJoystick.MFMobileFixedFireGameHandle
/// Size: 0x0000 (0 bytes) (0x0001D8 - 0x0001D8) align 8 pad: 0x0000
class UMFMobileFixedFireGameHandle : public UMFMobileGameHandle
{ 
public:
};

/// Class /Script/MFMobileJoystick.MFMobileGamePad
/// Size: 0x0050 (80 bytes) (0x000028 - 0x000078) align 8 pad: 0x0000
class UMFMobileGamePad : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0028   (0x0008)  MISSED
	class UMFMobilePlayerInput*                        CachedPlayerInput;                                          // 0x0030   (0x0008)  
	TArray<class UMFMobileGamePadView*>                VisibleViewCache;                                           // 0x0038   (0x0010)  
	TArray<class UClass*>                              MobileGamePadViewClasses;                                   // 0x0048   (0x0010)  
	int32_t                                            MobileGamePadViewZorder;                                    // 0x0058   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x005C   (0x0004)  MISSED
	TArray<class UMFMobileGamePadView*>                MobileGamePadViews;                                         // 0x0060   (0x0010)  
	unsigned char                                      UnknownData02_7[0x8];                                       // 0x0070   (0x0008)  MISSED
};

/// Class /Script/MFMobileJoystick.MFMobileGamePadView
/// Size: 0x0030 (48 bytes) (0x0002D0 - 0x000300) align 8 pad: 0x0000
class UMFMobileGamePadView : public USGUserWidget
{ 
public:
	int32_t                                            GamePadId;                                                  // 0x02D0   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x02D4   (0x0004)  MISSED
	class UMFMobileGamePad*                            CachedGamePad;                                              // 0x02D8   (0x0008)  
	TArray<class UMFMobileDraggableButton*>            DraggableBtns;                                              // 0x02E0   (0x0010)  
	unsigned char                                      UnknownData01_7[0x10];                                      // 0x02F0   (0x0010)  MISSED


	/// Functions
	// Function /Script/MFMobileJoystick.MFMobileGamePadView.SetGamePad
	// void SetGamePad(class UMFMobileGamePad* InGamePad);                                                                      // [0x2f5ac00] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFMobileJoystick.MFMobileInputButton
/// Size: 0x0018 (24 bytes) (0x000028 - 0x000040) align 8 pad: 0x0000
class UMFMobileInputButton : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x18];                                      // 0x0028   (0x0018)  MISSED
};

/// Class /Script/MFMobileJoystick.MFMobileMoveHandleImpl
/// Size: 0x0018 (24 bytes) (0x000028 - 0x000040) align 8 pad: 0x0000
class UMFMobileMoveHandleImpl : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x18];                                      // 0x0028   (0x0018)  MISSED
};

/// Class /Script/MFMobileJoystick.MFMobileMoveJoystickHandleImpl
/// Size: 0x0008 (8 bytes) (0x000040 - 0x000048) align 8 pad: 0x0000
class UMFMobileMoveJoystickHandleImpl : public UMFMobileMoveHandleImpl
{ 
public:
	class UMFMobileGameHandle*                         OuterGameHandle;                                            // 0x0040   (0x0008)  
};

/// Class /Script/MFMobileJoystick.MFMobileMutilSlider
/// Size: 0x0008 (8 bytes) (0x000548 - 0x000550) align 8 pad: 0x0000
class UMFMobileMutilSlider : public USlider
{ 
public:
	int32_t                                            SliderBarNum;                                               // 0x0548   (0x0004)  
	bool                                               bCanCross;                                                  // 0x054C   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x054D   (0x0003)  MISSED
};

/// Class /Script/MFMobileJoystick.MFMobilePlayerInput
/// Size: 0x0208 (520 bytes) (0x000658 - 0x000860) align 8 pad: 0x0000
class UMFMobilePlayerInput : public USGPlayerInput
{ 
public:
	float                                              NormalSensitivityX;                                         // 0x0658   (0x0004)  
	float                                              NormalSensitivityY;                                         // 0x065C   (0x0004)  
	float                                              SwimmingSensitivityX;                                       // 0x0660   (0x0004)  
	float                                              SwimmingSensitivityY;                                       // 0x0664   (0x0004)  
	float                                              DrivingSensitivityX;                                        // 0x0668   (0x0004)  
	float                                              DrivingSensitivityY;                                        // 0x066C   (0x0004)  
	bool                                               bDisableMoveAndRotate;                                      // 0x0670   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0671   (0x0007)  MISSED
	SDK_UNDEFINED(80,2251) /* TMap<TEnumAsByte<ETouchIndex>, bool> */ __um(FingerIndexDisableMoveAndRotateMap);    // 0x0678   (0x0050)  
	SDK_UNDEFINED(80,2252) /* TSet<TEnumAsByte<ETouchIndex>> */ __um(FingerIndexFullScreenRotateSet);              // 0x06C8   (0x0050)  
	SDK_UNDEFINED(80,2253) /* TMap<TEnumAsByte<ETouchIndex>, bool> */ __um(FingerIndexIgnoreMap);                  // 0x0718   (0x0050)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0768   (0x0004)  MISSED
	float                                              FixedSensitivityFactor;                                     // 0x076C   (0x0004)  
	float                                              DisAccSensitivityFactor;                                    // 0x0770   (0x0004)  
	float                                              DisFixedInputSensitivityFactor;                             // 0x0774   (0x0004)  
	float                                              MaxAccumulateAxis;                                          // 0x0778   (0x0004)  
	float                                              SpeedAccSensitivityFactor;                                  // 0x077C   (0x0004)  
	float                                              SpeedAccFixedInputSensitivityFactor;                        // 0x0780   (0x0004)  
	float                                              NewSpeedAccSensitivityFactor;                               // 0x0784   (0x0004)  
	float                                              NewSpeedAccFixedInputSensitivityFactor;                     // 0x0788   (0x0004)  
	ERotateSensitivityMode                             UseSensitivityMode;                                         // 0x078C   (0x0001)  
	unsigned char                                      UnknownData02_6[0x3];                                       // 0x078D   (0x0003)  MISSED
	float                                              EmulatorScale;                                              // 0x0790   (0x0004)  
	unsigned char                                      UnknownData03_6[0x1];                                       // 0x0794   (0x0001)  MISSED
	bool                                               bCullingYRotaion;                                           // 0x0795   (0x0001)  
	unsigned char                                      UnknownData04_6[0xA];                                       // 0x0796   (0x000A)  MISSED
	float                                              DefaultFixedSensitivityValue;                               // 0x07A0   (0x0004)  
	unsigned char                                      UnknownData05_6[0x4];                                       // 0x07A4   (0x0004)  MISSED
	float                                              DefaultDisAccSensitivityValue;                              // 0x07A8   (0x0004)  
	unsigned char                                      UnknownData06_6[0x4];                                       // 0x07AC   (0x0004)  MISSED
	float                                              DefaultSpeedAccSensitivityValue;                            // 0x07B0   (0x0004)  
	unsigned char                                      UnknownData07_6[0x4];                                       // 0x07B4   (0x0004)  MISSED
	class UMFMobileGameHandle*                         GameHandle;                                                 // 0x07B8   (0x0008)  
	class UClass*                                      GamePadClassSoft;                                           // 0x07C0   (0x0008)  
	class UMFMobileGamePad*                            Gamepad;                                                    // 0x07C8   (0x0008)  
	unsigned char                                      UnknownData08_6[0x14];                                      // 0x07D0   (0x0014)  MISSED
	int32_t                                            CurrentInputModeNum;                                        // 0x07E4   (0x0004)  
	TArray<FMobileInputData>                           MobileInputDataList;                                        // 0x07E8   (0x0010)  
	TArray<FMobileInputData>                           TempMobileInputDataList;                                    // 0x07F8   (0x0010)  
	unsigned char                                      UnknownData09_6[0x4];                                       // 0x0808   (0x0004)  MISSED
	EAcceptOP                                          AcceptOP;                                                   // 0x080C   (0x0001)  
	unsigned char                                      UnknownData10_6[0x3];                                       // 0x080D   (0x0003)  MISSED
	class UCurveFloat*                                 DeltaMoveSpeedScaleCurve;                                   // 0x0810   (0x0008)  
	EBlendOP                                           BlendOP;                                                    // 0x0818   (0x0001)  
	unsigned char                                      UnknownData11_6[0x3];                                       // 0x0819   (0x0003)  MISSED
	float                                              DeltaMoveBlendFactor;                                       // 0x081C   (0x0004)  
	float                                              InterpSpeed;                                                // 0x0820   (0x0004)  
	unsigned char                                      UnknownData12_6[0x4];                                       // 0x0824   (0x0004)  MISSED
	class UCurveFloat*                                 DeltaMoveBlendFactorCurve;                                  // 0x0828   (0x0008)  
	float                                              MagicMin_X1;                                                // 0x0830   (0x0004)  
	float                                              MagicMin_X2;                                                // 0x0834   (0x0004)  
	float                                              MagicMax_X1;                                                // 0x0838   (0x0004)  
	float                                              MagicMax_X2;                                                // 0x083C   (0x0004)  
	float                                              MagicMax_X3;                                                // 0x0840   (0x0004)  
	unsigned char                                      UnknownData13_7[0x1C];                                      // 0x0844   (0x001C)  MISSED


	/// Functions
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.UserSetSpeedAccSensitivity
	// void UserSetSpeedAccSensitivity(float Value);                                                                            // [0x2f5b840] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.UserSetFixedSensitivity
	// void UserSetFixedSensitivity(float Value);                                                                               // [0x2f5b7c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.UserSetDisAccSensitivity
	// void UserSetDisAccSensitivity(float Value);                                                                              // [0x2f5b740] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.SwitchInputMode
	// void SwitchInputMode(int32_t ModeNum);                                                                                   // [0x2f5b690] Final|Exec|Native|Public 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.ShowGamepad
	// void ShowGamepad(bool bShowGamepad);                                                                                     // [0x2f5b3e0] Final|Exec|Native|Public 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.SetTouchFreeView
	// void SetTouchFreeView(bool bIsTouch);                                                                                    // [0x2f5b350] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.SetTestMobileInputScale
	// void SetTestMobileInputScale(float Value);                                                                               // [0x2f5b2d0] Final|Exec|Native|Public 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.SetSimulateMultiRoatationInputDelay
	// void SetSimulateMultiRoatationInputDelay(float Delay);                                                                   // [0x2f5b250] Final|Exec|Native|Public 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.SetSensitivityMode
	// void SetSensitivityMode(ERotateSensitivityMode Mode);                                                                    // [0x2f5b1d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.SetMovementButtonUnfixed
	// void SetMovementButtonUnfixed();                                                                                         // [0x2f5b1b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.SetMovementButtonFixed
	// void SetMovementButtonFixed(FVector2D position, FVector2D Size);                                                         // [0x2f5b0f0] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.SetInputMagicMin
	// void SetInputMagicMin(float x1, float x2);                                                                               // [0x2f5aff0] Final|Exec|Native|Public 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.SetInputMagicMax
	// void SetInputMagicMax(float x1, float x2, float X3);                                                                     // [0x2f5aeb0] Final|Exec|Native|Public 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.SetInputInterpSpeed
	// void SetInputInterpSpeed(float Speed);                                                                                   // [0x2f5ae30] Final|Exec|Native|Public 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.SetInputBlendOP
	// void SetInputBlendOP(int32_t Type);                                                                                      // [0x2f5ada0] Final|Exec|Native|Public 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.SetInputBlendFactor
	// void SetInputBlendFactor(float Value);                                                                                   // [0x2f5ad20] Final|Exec|Native|Public 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.SetInputAcceptOP
	// void SetInputAcceptOP(int32_t Type);                                                                                     // [0x2f5ac90] Final|Exec|Native|Public 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.SetFingerIndexIgnore
	// void SetFingerIndexIgnore(TEnumAsByte<ETouchIndex> FingerIndex, bool bIgnore);                                           // [0x2f5ab30] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.SetFingerIndexDisableMoveAndRotate
	// void SetFingerIndexDisableMoveAndRotate(TEnumAsByte<ETouchIndex> FingerIndex, bool bDisable);                            // [0x2f5aa60] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.SetExchangeMoveAndRotate
	// void SetExchangeMoveAndRotate(bool bExchange);                                                                           // [0x2f5a900] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.SetEnableRotateCam
	// void SetEnableRotateCam(bool bEnable);                                                                                   // [0x2f5a870] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.SetDisableMoveAndRotate
	// void SetDisableMoveAndRotate(bool bDisable);                                                                             // [0x2f5a7e0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.ResetMovementButton
	// void ResetMovementButton(FVector2D InAbsSize, FVector2D InAbsPostion);                                                   // [0x2f5a5e0] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.RemoveFingerIndexFullScreenRotate
	// void RemoveFingerIndexFullScreenRotate(TEnumAsByte<ETouchIndex> FingerIndex);                                            // [0x2f5a560] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.OnGamePadClassSoftLoadCompleted
	// void OnGamePadClassSoftLoadCompleted(FSoftObjectPath Path);                                                              // [0x2f5a250] Final|Native|Protected|HasDefaults 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.MobileInputShowLog
	// void MobileInputShowLog(bool MobileInputShowLog);                                                                        // [0x2f5a160] Final|Exec|Native|Public 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.IsFingerIndexFullScreenRotate
	// bool IsFingerIndexFullScreenRotate(TEnumAsByte<ETouchIndex> FingerIndex);                                                // [0x2f5a0b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.InMovementArea
	// bool InMovementArea(FVector2D& Pos);                                                                                     // [0x2f5a010] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.GetRefRotationInputData
	// void GetRefRotationInputData(FMobileInputData& Data);                                                                    // [0x2f59e90] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.GetRefMovementInputData
	// void GetRefMovementInputData(FMobileInputData& Data);                                                                    // [0x2f59de0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.GetRealAccelY
	// float GetRealAccelY();                                                                                                   // [0x2f59db0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.GetRealAccelX
	// float GetRealAccelX();                                                                                                   // [0x2f59d80] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.GetRealAccel
	// FVector2D GetRealAccel();                                                                                                // [0x2f59d40] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.GetPointIndexInputData
	// bool GetPointIndexInputData(int32_t PointIndex, FMobileInputData& PointIndexInputData);                                  // [0x2f59c00] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.GetMovementInputData_Location
	// FVector2D GetMovementInputData_Location();                                                                               // [0x2f59bc0] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.GetMovementInputData_DeltaY
	// float GetMovementInputData_DeltaY();                                                                                     // [0x2f59b90] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.GetMovementInputData_DeltaX
	// float GetMovementInputData_DeltaX();                                                                                     // [0x2f59b60] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.GetMovementInputData_Delta
	// FVector2D GetMovementInputData_Delta();                                                                                  // [0x2f59b20] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.GetMovementInputData_BeginLocation
	// FVector2D GetMovementInputData_BeginLocation();                                                                          // [0x2f59ae0] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.GetMovementInputData
	// FMobileInputData GetMovementInputData();                                                                                 // [0x2f59a80] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.GetMoveHandleType
	// TEnumAsByte<ESGMobileMoveHandle> GetMoveHandleType();                                                                    // [0x2f59a50] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.GetMobileInputDataListLength
	// int32_t GetMobileInputDataListLength();                                                                                  // [0x2f59a30] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.GetLastRotationVector
	// FVector2D GetLastRotationVector();                                                                                       // [0x2f599f0] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.GetLastRotationInput
	// FVector2D GetLastRotationInput();                                                                                        // [0x2f599b0] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.GetInputModeNum
	// int32_t GetInputModeNum();                                                                                               // [0x2f59990] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.GetFreeViewInputData
	// FMobileInputData GetFreeViewInputData();                                                                                 // [0x2f59930] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.ClearInputFlags
	// void ClearInputFlags();                                                                                                  // [0x2f598f0] Final|Native|Public  
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.ClearAllInput
	// void ClearAllInput();                                                                                                    // [0x2f59850] Final|Native|Public  
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.CheckPointIndexHasInput
	// bool CheckPointIndexHasInput(int32_t PointIndex);                                                                        // [0x2f597b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInput.AddFingerIndexFullScreenRotate
	// void AddFingerIndexFullScreenRotate(TEnumAsByte<ETouchIndex> FingerIndex);                                               // [0x2f59700] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFMobileJoystick.MFMobilePlayerInputStatics
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMFMobilePlayerInputStatics : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/MFMobileJoystick.MFMobilePlayerInputStatics.SimulateStartTouch
	// void SimulateStartTouch(class UObject* WorldContextObject, int32_t TouchIndex, FVector Location);                        // [0x2f5b580] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInputStatics.SimulateEndTouch
	// void SimulateEndTouch(class UObject* WorldContextObject, int32_t TouchIndex, FVector Location);                          // [0x2f5b470] Final|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/MFMobileJoystick.MFMobilePlayerInputStatics.ClearAllInput
	// void ClearAllInput(class UObject* WorldContextObject);                                                                   // [0x2f59870] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/MFMobileJoystick.MFPCPlayerInput
/// Size: 0x0040 (64 bytes) (0x000658 - 0x000698) align 8 pad: 0x0000
class UMFPCPlayerInput : public USGPlayerInput
{ 
public:
	class UMFMobileGamePad*                            Gamepad;                                                    // 0x0658   (0x0008)  
	SDK_UNDEFINED(40,2254) /* TWeakObjectPtr<UClass*> */ __um(GamePadClassSoft);                                   // 0x0660   (0x0028)  
	unsigned char                                      UnknownData00_7[0x10];                                      // 0x0688   (0x0010)  MISSED


	/// Functions
	// Function /Script/MFMobileJoystick.MFPCPlayerInput.ShowGamepad
	// void ShowGamepad(bool bShowGamepad);                                                                                     // [0x197b510] Final|Exec|Native|Public 
	// Function /Script/MFMobileJoystick.MFPCPlayerInput.OnGamePadClassSoftLoadCompleted
	// void OnGamePadClassSoftLoadCompleted(FSoftObjectPath Path);                                                              // [0x2f5a350] Final|Native|Protected|HasDefaults 
};

/// Struct /Script/MFMobileJoystick.InputRotationInfo
/// Size: 0x00C0 (192 bytes) (0x000000 - 0x0000C0) align 8 pad: 0x0000
struct FInputRotationInfo
{ 
	unsigned char                                      UnknownData00_2[0xC0];                                      // 0x0000   (0x00C0)  MISSED
};

static_assert(sizeof(UMFMobileCircleUserWidget) == 0x02D8); // 728 bytes (0x000288 - 0x0002D8)
static_assert(sizeof(UMFMobileCircleUserWidget_Fire) == 0x0310); // 784 bytes (0x0002D8 - 0x000310)
static_assert(sizeof(UMFMobileCustomShapeButton) == 0x04A0); // 1184 bytes (0x000490 - 0x0004A0)
static_assert(sizeof(UMFMobileDragDropUserWidget) == 0x0358); // 856 bytes (0x0002D0 - 0x000358)
static_assert(sizeof(UMFMobileDraggableButton) == 0x0498); // 1176 bytes (0x000490 - 0x000498)
static_assert(sizeof(UMFMobileGameHandle) == 0x01D8); // 472 bytes (0x000028 - 0x0001D8)
static_assert(sizeof(UMFMobileFixedFireGameHandle) == 0x01D8); // 472 bytes (0x0001D8 - 0x0001D8)
static_assert(sizeof(UMFMobileGamePad) == 0x0078); // 120 bytes (0x000028 - 0x000078)
static_assert(sizeof(UMFMobileGamePadView) == 0x0300); // 768 bytes (0x0002D0 - 0x000300)
static_assert(sizeof(UMFMobileInputButton) == 0x0040); // 64 bytes (0x000028 - 0x000040)
static_assert(sizeof(UMFMobileMoveHandleImpl) == 0x0040); // 64 bytes (0x000028 - 0x000040)
static_assert(sizeof(UMFMobileMoveJoystickHandleImpl) == 0x0048); // 72 bytes (0x000040 - 0x000048)
static_assert(sizeof(UMFMobileMutilSlider) == 0x0550); // 1360 bytes (0x000548 - 0x000550)
static_assert(sizeof(UMFMobilePlayerInput) == 0x0860); // 2144 bytes (0x000658 - 0x000860)
static_assert(sizeof(UMFMobilePlayerInputStatics) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMFPCPlayerInput) == 0x0698); // 1688 bytes (0x000658 - 0x000698)
static_assert(sizeof(FInputRotationInfo) == 0x00C0); // 192 bytes (0x000000 - 0x0000C0)
static_assert(offsetof(UMFMobileCircleUserWidget, AcceptInputType) == 0x02D0);
static_assert(offsetof(UMFMobileCircleUserWidget, CurrentAcceptInputType) == 0x02D1);
static_assert(offsetof(UMFMobileCircleUserWidget_Fire, CachedPlayerController) == 0x02F8);
static_assert(offsetof(UMFMobileCircleUserWidget_Fire, CachedCharacter) == 0x0300);
static_assert(offsetof(UMFMobileCustomShapeButton, AdvancedHitTexture) == 0x0490);
static_assert(offsetof(UMFMobileGameHandle, MovementButton) == 0x0050);
static_assert(offsetof(UMFMobileGameHandle, RotationButton) == 0x0058);
static_assert(offsetof(UMFMobileGameHandle, MoveHandleImpl) == 0x0060);
static_assert(offsetof(UMFMobileGameHandle, CachedPlayerInput) == 0x0198);
static_assert(offsetof(UMFMobileGamePad, CachedPlayerInput) == 0x0030);
static_assert(offsetof(UMFMobileGamePad, VisibleViewCache) == 0x0038);
static_assert(offsetof(UMFMobileGamePad, MobileGamePadViewClasses) == 0x0048);
static_assert(offsetof(UMFMobileGamePad, MobileGamePadViews) == 0x0060);
static_assert(offsetof(UMFMobileGamePadView, CachedGamePad) == 0x02D8);
static_assert(offsetof(UMFMobileGamePadView, DraggableBtns) == 0x02E0);
static_assert(offsetof(UMFMobileMoveJoystickHandleImpl, OuterGameHandle) == 0x0040);
static_assert(offsetof(UMFMobilePlayerInput, UseSensitivityMode) == 0x078C);
static_assert(offsetof(UMFMobilePlayerInput, GameHandle) == 0x07B8);
static_assert(offsetof(UMFMobilePlayerInput, GamePadClassSoft) == 0x07C0);
static_assert(offsetof(UMFMobilePlayerInput, Gamepad) == 0x07C8);
static_assert(offsetof(UMFMobilePlayerInput, MobileInputDataList) == 0x07E8);
static_assert(offsetof(UMFMobilePlayerInput, TempMobileInputDataList) == 0x07F8);
static_assert(offsetof(UMFMobilePlayerInput, AcceptOP) == 0x080C);
static_assert(offsetof(UMFMobilePlayerInput, DeltaMoveSpeedScaleCurve) == 0x0810);
static_assert(offsetof(UMFMobilePlayerInput, BlendOP) == 0x0818);
static_assert(offsetof(UMFMobilePlayerInput, DeltaMoveBlendFactorCurve) == 0x0828);
static_assert(offsetof(UMFPCPlayerInput, Gamepad) == 0x0658);
