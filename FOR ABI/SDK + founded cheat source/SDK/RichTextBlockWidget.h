
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: SlateCore
/// dependency: UMG

/// Class /Script/RichTextBlockWidget.DynamicRichTextBlockDecorator
/// Size: 0x0020 (32 bytes) (0x000028 - 0x000048) align 8 pad: 0x0000
class UDynamicRichTextBlockDecorator : public UObject
{ 
public:
	bool                                               bReveal;                                                    // 0x0028   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0029   (0x0003)  MISSED
	int32_t                                            RevealedIndex;                                              // 0x002C   (0x0004)  
	class URichTextBox*                                ParentRichTextBox;                                          // 0x0030   (0x0008)  
	TArray<class UObject*>                             m_UObjectRefArray;                                          // 0x0038   (0x0010)  
};

/// Class /Script/RichTextBlockWidget.RichTextBox
/// Size: 0x0390 (912 bytes) (0x000148 - 0x0004D8) align 8 pad: 0x0000
class URichTextBox : public UTextLayoutWidget
{ 
public:
	FText                                              Text;                                                       // 0x0148   (0x0018)  
	SDK_UNDEFINED(16,2779) /* FDelegateProperty */     __um(TextDelegate);                                         // 0x0160   (0x0010)  
	FSlateFontInfo                                     Font;                                                       // 0x0170   (0x0058)  
	FLinearColor                                       Color;                                                      // 0x01C8   (0x0010)  
	TArray<class UDynamicRichTextBlockDecorator*>      Decorators;                                                 // 0x01D8   (0x0010)  
	SDK_UNDEFINED(16,2780) /* FMulticastInlineDelegate */ __um(OnHyperlinkClicked);                                // 0x01E8   (0x0010)  
	SDK_UNDEFINED(16,2781) /* FMulticastInlineDelegate */ __um(OnDynamicTextAppended);                             // 0x01F8   (0x0010)  
	FText                                              HighLightText;                                              // 0x0208   (0x0018)  
	unsigned char                                      UnknownData00_7[0x2B8];                                     // 0x0220   (0x02B8)  MISSED


	/// Functions
	// Function /Script/RichTextBlockWidget.RichTextBox.SetText
	// void SetText(FText& InText);                                                                                             // [0x19b8df0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/RichTextBlockWidget.RichTextBox.SetHighlightText
	// void SetHighlightText(FText& InHighlightText);                                                                           // [0x19b8d20] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/RichTextBlockWidget.RichTextBox.RemoveFrontTextLines
	// void RemoveFrontTextLines(int32_t RemovedLineCount);                                                                     // [0x19b8c90] Final|Native|Public|BlueprintCallable 
	// Function /Script/RichTextBlockWidget.RichTextBox.OnRichTextHyperlinkClicked__DelegateSignature
	// void OnRichTextHyperlinkClicked__DelegateSignature(TArray<FString>& MetaData);                                           // [0x3a75280] MulticastDelegate|Public|Delegate|HasOutParms 
	// Function /Script/RichTextBlockWidget.RichTextBox.OnDynamicTextAppendedEvent__DelegateSignature
	// void OnDynamicTextAppendedEvent__DelegateSignature(FString AppendString);                                                // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/RichTextBlockWidget.RichTextBox.ClearAllDisplayText
	// void ClearAllDisplayText();                                                                                              // [0x19b8c70] Final|Native|Public|BlueprintCallable 
	// Function /Script/RichTextBlockWidget.RichTextBox.AppendDynamicTextString
	// int32_t AppendDynamicTextString(FString AppendString);                                                                   // [0x19b8bc0] Final|Native|Public|BlueprintCallable 
};

static_assert(sizeof(UDynamicRichTextBlockDecorator) == 0x0048); // 72 bytes (0x000028 - 0x000048)
static_assert(sizeof(URichTextBox) == 0x04D8); // 1240 bytes (0x000148 - 0x0004D8)
static_assert(offsetof(UDynamicRichTextBlockDecorator, ParentRichTextBox) == 0x0030);
static_assert(offsetof(UDynamicRichTextBlockDecorator, m_UObjectRefArray) == 0x0038);
static_assert(offsetof(URichTextBox, Text) == 0x0148);
static_assert(offsetof(URichTextBox, Font) == 0x0170);
static_assert(offsetof(URichTextBox, Color) == 0x01C8);
static_assert(offsetof(URichTextBox, Decorators) == 0x01D8);
static_assert(offsetof(URichTextBox, HighLightText) == 0x0208);
