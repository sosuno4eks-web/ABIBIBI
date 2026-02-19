
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: SlateCore
/// dependency: UMG

/// Class /Script/MFNumKeyboard.MFNumKeyboardWidget
/// Size: 0x0020 (32 bytes) (0x000288 - 0x0002A8) align 8 pad: 0x0000
class UMFNumKeyboardWidget : public UUserWidget
{ 
public:
	unsigned char                                      UnknownData00_1[0x20];                                      // 0x0288   (0x0020)  MISSED


	/// Functions
	// Function /Script/MFNumKeyboard.MFNumKeyboardWidget.Show
	// void Show(FGeometry TextGeom);                                                                                           // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/MFNumKeyboard.MFNumKeyboardWidget.SetText
	// void SetText(FString Text);                                                                                              // [0x19db9e0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNumKeyboard.MFNumKeyboardWidget.OnTouch
	// void OnTouch(TEnumAsByte<ETouchIndex> FingerIndex, FVector Location);                                                    // [0x3a75280] Event|Public|HasDefaults|BlueprintEvent 
	// Function /Script/MFNumKeyboard.MFNumKeyboardWidget.OnHide
	// void OnHide();                                                                                                           // [0x19db9c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNumKeyboard.MFNumKeyboardWidget.GetText
	// FString GetText();                                                                                                       // [0x19db940] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNumKeyboard.MFNumKeyboardWidget.DeleteKeyChar
	// void DeleteKeyChar();                                                                                                    // [0x19db920] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNumKeyboard.MFNumKeyboardWidget.ClearText
	// void ClearText();                                                                                                        // [0x19db900] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFNumKeyboard.MFNumKeyboardWidget.AddkeyChar
	// void AddkeyChar(FString S);                                                                                              // [0x19db810] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MFNumKeyboard.NumKeyboardComponent
/// Size: 0x0010 (16 bytes) (0x0000F8 - 0x000108) align 8 pad: 0x0000
class UNumKeyboardComponent : public UActorComponent
{ 
public:
	class UClass*                                      WidgetClass;                                                // 0x00F8   (0x0008)  
	class UMFNumKeyboardWidget*                        KeyboardPanel;                                              // 0x0100   (0x0008)  
};

static_assert(sizeof(UMFNumKeyboardWidget) == 0x02A8); // 680 bytes (0x000288 - 0x0002A8)
static_assert(sizeof(UNumKeyboardComponent) == 0x0108); // 264 bytes (0x0000F8 - 0x000108)
static_assert(offsetof(UNumKeyboardComponent, WidgetClass) == 0x00F8);
static_assert(offsetof(UNumKeyboardComponent, KeyboardPanel) == 0x0100);
