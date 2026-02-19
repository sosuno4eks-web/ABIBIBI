
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: UMG

/// Class /MFInputReplayTool/BP_InputreplayWidget.BP_InputReplayWidget_C
/// Size: 0x0088 (136 bytes) (0x000288 - 0x000310) align 8 pad: 0x0000
class UBP_InputReplayWidget_C : public UUserWidget
{ 
public:
	FPointerToUberGraphFrame                           UberGraphFrame;                                             // 0x0288   (0x0008)  
	class UButton*                                     AddTag;                                                     // 0x0290   (0x0008)  
	class UButton*                                     Button_confirm;                                             // 0x0298   (0x0008)  
	class UCanvasPanel*                                dist_msg;                                                   // 0x02A0   (0x0008)  
	class UTextBlock*                                  distmsg;                                                    // 0x02A8   (0x0008)  
	class UImage*                                      Image;                                                      // 0x02B0   (0x0008)  
	class UImage*                                      Image0;                                                     // 0x02B8   (0x0008)  
	class UCanvasPanel*                                msg_dialog;                                                 // 0x02C0   (0x0008)  
	class UTextBlock*                                  msg_text;                                                   // 0x02C8   (0x0008)  
	class UButton*                                     StartRecord;                                                // 0x02D0   (0x0008)  
	class UButton*                                     StartReplay;                                                // 0x02D8   (0x0008)  
	class UObject*                                     Array_Element;                                              // 0x02E0   (0x0008)  
	bool                                               isrecord;                                                   // 0x02E8   (0x0001)  
	bool                                               isreplay;                                                   // 0x02E9   (0x0001)  
	unsigned char                                      UnknownData00_6[0x6];                                       // 0x02EA   (0x0006)  MISSED
	class UTextBlock*                                  recordcontent;                                              // 0x02F0   (0x0008)  
	class UTextBlock*                                  replaycontent;                                              // 0x02F8   (0x0008)  
	FString                                            RecordEvent;                                                // 0x0300   (0x0010)  


	/// Functions
	// Function /MFInputReplayTool/BP_InputreplayWidget.BP_InputReplayWidget_C.Construct
	// void Construct();                                                                                                        // [0x3a75280] BlueprintCosmetic|Event|Public|BlueprintEvent 
	// Function /MFInputReplayTool/BP_InputreplayWidget.BP_InputReplayWidget_C.BndEvt__startrecord_K2Node_ComponentBoundEvent_0_OnButtonClickedEvent__DelegateSignature
	// void BndEvt__startrecord_K2Node_ComponentBoundEvent_0_OnButtonClickedEvent__DelegateSignature();                         // [0x3a75280] BlueprintEvent       
	// Function /MFInputReplayTool/BP_InputreplayWidget.BP_InputReplayWidget_C.BndEvt__startreplay_K2Node_ComponentBoundEvent_1_OnButtonClickedEvent__DelegateSignature
	// void BndEvt__startreplay_K2Node_ComponentBoundEvent_1_OnButtonClickedEvent__DelegateSignature();                         // [0x3a75280] BlueprintEvent       
	// Function /MFInputReplayTool/BP_InputreplayWidget.BP_InputReplayWidget_C.RecordStateChange
	// void RecordStateChange(FString Event);                                                                                   // [0x3a75280] BlueprintCallable|BlueprintEvent 
	// Function /MFInputReplayTool/BP_InputreplayWidget.BP_InputReplayWidget_C.BndEvt__Button_confirm_K2Node_ComponentBoundEvent_2_OnButtonClickedEvent__DelegateSignature
	// void BndEvt__Button_confirm_K2Node_ComponentBoundEvent_2_OnButtonClickedEvent__DelegateSignature();                      // [0x3a75280] BlueprintEvent       
	// Function /MFInputReplayTool/BP_InputreplayWidget.BP_InputReplayWidget_C.BndEvt__addtag_K2Node_ComponentBoundEvent_3_OnButtonClickedEvent__DelegateSignature
	// void BndEvt__addtag_K2Node_ComponentBoundEvent_3_OnButtonClickedEvent__DelegateSignature();                              // [0x3a75280] BlueprintEvent       
	// Function /MFInputReplayTool/BP_InputreplayWidget.BP_InputReplayWidget_C.ExecuteUbergraph_BP_InputReplayWidget
	// void ExecuteUbergraph_BP_InputReplayWidget(int32_t EntryPoint);                                                          // [0x3a75280] Final|HasDefaults    
};

static_assert(sizeof(UBP_InputReplayWidget_C) == 0x0310); // 784 bytes (0x000288 - 0x000310)
static_assert(offsetof(UBP_InputReplayWidget_C, UberGraphFrame) == 0x0288);
static_assert(offsetof(UBP_InputReplayWidget_C, AddTag) == 0x0290);
static_assert(offsetof(UBP_InputReplayWidget_C, Button_confirm) == 0x0298);
static_assert(offsetof(UBP_InputReplayWidget_C, dist_msg) == 0x02A0);
static_assert(offsetof(UBP_InputReplayWidget_C, distmsg) == 0x02A8);
static_assert(offsetof(UBP_InputReplayWidget_C, Image) == 0x02B0);
static_assert(offsetof(UBP_InputReplayWidget_C, Image0) == 0x02B8);
static_assert(offsetof(UBP_InputReplayWidget_C, msg_dialog) == 0x02C0);
static_assert(offsetof(UBP_InputReplayWidget_C, msg_text) == 0x02C8);
static_assert(offsetof(UBP_InputReplayWidget_C, StartRecord) == 0x02D0);
static_assert(offsetof(UBP_InputReplayWidget_C, StartReplay) == 0x02D8);
static_assert(offsetof(UBP_InputReplayWidget_C, Array_Element) == 0x02E0);
static_assert(offsetof(UBP_InputReplayWidget_C, recordcontent) == 0x02F0);
static_assert(offsetof(UBP_InputReplayWidget_C, replaycontent) == 0x02F8);
static_assert(offsetof(UBP_InputReplayWidget_C, RecordEvent) == 0x0300);
