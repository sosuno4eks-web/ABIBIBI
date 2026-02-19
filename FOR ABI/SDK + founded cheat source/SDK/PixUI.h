
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: InputCore
/// dependency: Slate
/// dependency: SlateCore
/// dependency: UMG

/// Enum /Script/PixUI.EPxKeyboardTypes
/// Size: 0x01 (1 bytes)
enum class EPxKeyboardTypes : uint8_t
{
	EPxKeyboardTypes__Default                                                        = 0,
	EPxKeyboardTypes__Number                                                         = 1,
	EPxKeyboardTypes__Password                                                       = 2
};

/// Enum /Script/PixUI.EPxWidgetTransformType
/// Size: 0x01 (1 bytes)
enum class EPxWidgetTransformType : uint8_t
{
	EPxWidgetTransformType__MoveBy                                                   = 0,
	EPxWidgetTransformType__MoveTo                                                   = 1,
	EPxWidgetTransformType__ResizeBy                                                 = 2,
	EPxWidgetTransformType__ResizeTo                                                 = 3,
	EPxWidgetTransformType__ScrollBy                                                 = 4,
	EPxWidgetTransformType__ScrollTo                                                 = 5,
	EPxWidgetTransformType__Count                                                    = 6
};

/// Enum /Script/PixUI.EPxLogLevels
/// Size: 0x01 (1 bytes)
enum class EPxLogLevels : uint8_t
{
	EPxLogLevels__Log                                                                = 0,
	EPxLogLevels__Warning                                                            = 1,
	EPxLogLevels__Error                                                              = 2,
	EPxLogLevels__Debug                                                              = 3,
	EPxLogLevels__Count                                                              = 4
};

/// Enum /Script/PixUI.EPxLogGroups
/// Size: 0x01 (1 bytes)
enum class EPxLogGroups : uint8_t
{
	EPxLogGroups__Core                                                               = 0,
	EPxLogGroups__Plugin                                                             = 1,
	EPxLogGroups__Script                                                             = 2,
	EPxLogGroups__Profiler                                                           = 3,
	EPxLogGroups__Count                                                              = 4
};

/// Enum /Script/PixUI.EPxDynamicTextureUpdateMode
/// Size: 0x01 (1 bytes)
enum class EPxDynamicTextureUpdateMode : uint8_t
{
	EPxDynamicTextureUpdateMode__UpdateRegion                                        = 0,
	EPxDynamicTextureUpdateMode__UpdateBulkData                                      = 1
};

/// Enum /Script/PixUI.EPxKeyEventType
/// Size: 0x01 (1 bytes)
enum class EPxKeyEventType : uint8_t
{
	EPxKeyEventType__KeyDown                                                         = 0,
	EPxKeyEventType__KeyUp                                                           = 1
};

/// Enum /Script/PixUI.EPxTouchType
/// Size: 0x01 (1 bytes)
enum class EPxTouchType : uint8_t
{
	EPxTouchType__TouchStart                                                         = 0,
	EPxTouchType__TouchMoved                                                         = 1,
	EPxTouchType__TouchEnd                                                           = 2,
	EPxTouchType__TouchCanceled                                                      = 3
};

/// Enum /Script/PixUI.EPxDebugInfo
/// Size: 0x01 (1 bytes)
enum class EPxDebugInfo : uint8_t
{
	EPxDebugInfo__ShowMouse                                                          = 0,
	EPxDebugInfo__Count                                                              = 1
};

/// Enum /Script/PixUI.EPxWidgetBatchType
/// Size: 0x01 (1 bytes)
enum class EPxWidgetBatchType : uint8_t
{
	EPxWidgetBatchType__Default                                                      = 0,
	EPxWidgetBatchType__Auto                                                         = 1,
	EPxWidgetBatchType__NoBatch                                                      = 2
};

/// Class /Script/PixUI.PixUIBrushWrapper
/// Size: 0x0010 (16 bytes) (0x000028 - 0x000038) align 8 pad: 0x0000
class UPixUIBrushWrapper : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x10];                                      // 0x0028   (0x0010)  MISSED
};

/// Class /Script/PixUI.PixFileLoadObject
/// Size: 0x0068 (104 bytes) (0x000028 - 0x000090) align 16 pad: 0x0000
class UPixFileLoadObject : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x68];                                      // 0x0028   (0x0068)  MISSED


	/// Functions
	// Function /Script/PixUI.PixFileLoadObject.OnFileLoad
	// void OnFileLoad(TArray<char>& arrayFileData);                                                                            // [0x1a934a0] Final|Native|Public|HasOutParms 
};

/// Class /Script/PixUI.PixUIBPLibrary
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UPixUIBPLibrary : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_Version
	// FString PixUI_Version();                                                                                                 // [0x1a95be0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_Tick
	// void PixUI_Tick(float fDeltaTime);                                                                                       // [0x1a95b70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_Startup
	// bool PixUI_Startup(FString fstrCachePathForWrite);                                                                       // [0x1a95ad0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_Shutdown
	// bool PixUI_Shutdown();                                                                                                   // [0x1a95aa0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_SetSupportTextShape
	// void PixUI_SetSupportTextShape(bool beSupportTextShape);                                                                 // [0x1a95a20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_SetPixUIMaxLayerId
	// void PixUI_SetPixUIMaxLayerId(int32_t nMaxLayerId);                                                                      // [0x1a959a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_SetPixUIMaxDynamicTextureTotalSize
	// void PixUI_SetPixUIMaxDynamicTextureTotalSize(int32_t nMaxDynamicTextureTotalSize);                                      // [0x1a95920] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_SetPixUIMaxDynamicTextureGCSize
	// void PixUI_SetPixUIMaxDynamicTextureGCSize(int32_t nMaxDynamicTextureGCSize);                                            // [0x1a958a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_SetPixUIMaxDynamicTextureGCRate
	// void PixUI_SetPixUIMaxDynamicTextureGCRate(float fMaxGCRate);                                                            // [0x1a95830] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_SetMobileUseTouchEvent
	// void PixUI_SetMobileUseTouchEvent(bool bUseTouchEvent);                                                                  // [0x1a957b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_SetMatRootPath
	// void PixUI_SetMatRootPath(FString fstrMatRootPath);                                                                      // [0x1a95720] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_SetMatBasePath
	// void PixUI_SetMatBasePath(FString fstrMatBasePath);                                                                      // [0x1a95690] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_SetMatAsyncLoad
	// void PixUI_SetMatAsyncLoad(bool bMatAsyncLoad);                                                                          // [0x1a95610] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_SetExternalInterface
	// void PixUI_SetExternalInterface(TScriptInterface<Class> scriptInterfaceExternal);                                        // [0x1a95580] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_SetDynamicTextureUpdateMode
	// void PixUI_SetDynamicTextureUpdateMode(EPxDynamicTextureUpdateMode eUpdateMode);                                         // [0x1a95510] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_SetDynamicTextureFilter
	// void PixUI_SetDynamicTextureFilter(TEnumAsByte<TextureFilter> eTextureFilter);                                           // [0x1a954a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_SetDynamicFixFontSize
	// void PixUI_SetDynamicFixFontSize(bool bOpenDynamicFix);                                                                  // [0x1a95420] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_SetDrawEffectNoPixelSnapping
	// void PixUI_SetDrawEffectNoPixelSnapping(bool bNoPixelSnapping);                                                          // [0x1a953a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_SetDefaultFontSize
	// void PixUI_SetDefaultFontSize(int32_t nFontSize);                                                                        // [0x1a95320] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_SetDefaultFont
	// void PixUI_SetDefaultFont(FString fstrFontName);                                                                         // [0x1a95290] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_SetCoreTickDuration
	// void PixUI_SetCoreTickDuration(int32_t nDurationCount);                                                                  // [0x1a95210] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_SetAutoTick
	// void PixUI_SetAutoTick(bool bAutoTick);                                                                                  // [0x1a95190] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_RHIShaderPlatform
	// int32_t PixUI_RHIShaderPlatform();                                                                                       // [0x1a950d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_RHIShaderLevel
	// int32_t PixUI_RHIShaderLevel();                                                                                          // [0x1a950a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_RemoveSystemFont
	// void PixUI_RemoveSystemFont(FString fstrFontName);                                                                       // [0x1a95100] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_PrintProfilerInfo
	// void PixUI_PrintProfilerInfo();                                                                                          // [0x1811c00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_PlatformOSVersionCode
	// float PixUI_PlatformOSVersionCode();                                                                                     // [0x1a95070] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_PlatformOSVersion
	// FString PixUI_PlatformOSVersion();                                                                                       // [0x1a94ff0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_PlatformCode
	// int32_t PixUI_PlatformCode();                                                                                            // [0x1990a20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_Platform
	// FString PixUI_Platform();                                                                                                // [0x1a94f70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_LogEnable
	// void PixUI_LogEnable(bool bEnagble);                                                                                     // [0x1a94ef0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_IsSupportTextShape
	// bool PixUI_IsSupportTextShape();                                                                                         // [0x1a94ec0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_IsStartUp
	// bool PixUI_IsStartUp();                                                                                                  // [0x1a94e90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_IsRHIShaderVulkan
	// bool PixUI_IsRHIShaderVulkan();                                                                                          // [0x1a94e60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_IsRHIShaderOpenGLES2
	// bool PixUI_IsRHIShaderOpenGLES2();                                                                                       // [0xc12490] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_IsRHIShaderOpenGL
	// bool PixUI_IsRHIShaderOpenGL();                                                                                          // [0x1a94e30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_IsRHIShaderMetal
	// bool PixUI_IsRHIShaderMetal();                                                                                           // [0x1a94e00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_IsRHIShaderDX
	// bool PixUI_IsRHIShaderDX();                                                                                              // [0x1a94dd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_IsOsBit64
	// bool PixUI_IsOsBit64();                                                                                                  // [0xfd8a30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_IsOsBit32
	// bool PixUI_IsOsBit32();                                                                                                  // [0xc12490] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_IsMobileUseTouchEvent
	// bool PixUI_IsMobileUseTouchEvent();                                                                                      // [0x1a94da0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_IsDynamicFixFontSize
	// bool PixUI_IsDynamicFixFontSize();                                                                                       // [0x1a94d70] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_IsAutoTick
	// bool PixUI_IsAutoTick();                                                                                                 // [0x1a94d40] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_GetWindowSlotObject
	// class UObject* PixUI_GetWindowSlotObject(int32_t nWindowID, FString strTagId);                                           // [0x1a94c60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_GetPixUIWidgetSlotObject
	// class UObject* PixUI_GetPixUIWidgetSlotObject(int32_t nPxWidgetID, FString fstrSlotTagId);                               // [0x1a94b80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_GetPixUIWidgetByID
	// class UPixUIWidget* PixUI_GetPixUIWidgetByID(int32_t nPxWidgetID);                                                       // [0x1a94af0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_GetPixUIMaxLayerId
	// int32_t PixUI_GetPixUIMaxLayerId();                                                                                      // [0x1a94ac0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_GetPixUIMaxDynamicTextureTotalSize
	// int32_t PixUI_GetPixUIMaxDynamicTextureTotalSize();                                                                      // [0x1a94a90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_GetPixUIMaxDynamicTextureGCSize
	// int32_t PixUI_GetPixUIMaxDynamicTextureGCSize();                                                                         // [0x1a94a60] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_GetPixUIMaxDynamicTextureGCRate
	// float PixUI_GetPixUIMaxDynamicTextureGCRate();                                                                           // [0x1a94a30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_GetMatRootPath
	// FString PixUI_GetMatRootPath();                                                                                          // [0x1a949b0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_GetMatBasePath
	// FString PixUI_GetMatBasePath();                                                                                          // [0x1a94930] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_GetMatAsyncLoad
	// bool PixUI_GetMatAsyncLoad();                                                                                            // [0x1a94900] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_GetFontPath
	// bool PixUI_GetFontPath(FString fstrFontName, FString& fstrOutFontPath);                                                  // [0x1a94800] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_GetDynamicTextureUpdateMode
	// EPxDynamicTextureUpdateMode PixUI_GetDynamicTextureUpdateMode();                                                         // [0x1a947d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_GetDynamicTextureFilter
	// TEnumAsByte<TextureFilter> PixUI_GetDynamicTextureFilter();                                                              // [0x1a947a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_GetDrawEffectNoPixelSnapping
	// bool PixUI_GetDrawEffectNoPixelSnapping();                                                                               // [0x1a94770] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_GetDefaultFontSize
	// void PixUI_GetDefaultFontSize(int32_t& nOutFontSize);                                                                    // [0x1a946f0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_GetDefaultFont
	// void PixUI_GetDefaultFont(FString& fstrFontName);                                                                        // [0x1a94650] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_GetCoreTickDuration
	// int32_t PixUI_GetCoreTickDuration();                                                                                     // [0x1a94620] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_GetCachePath
	// void PixUI_GetCachePath(FString& fstrOutCachePath);                                                                      // [0x1a94580] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_FindByWindowID
	// class UPixUIWidget* PixUI_FindByWindowID(int32_t nWindowID);                                                             // [0x1a944f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_DebugWitch
	// void PixUI_DebugWitch(EPxDebugInfo EPxDebugInfo, bool bOpen);                                                            // [0x1a94430] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_CreateWidget
	// class UPixUIWidget* PixUI_CreateWidget();                                                                                // [0x1a94400] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_CreateViewPortWidget
	// class UPixUIViewPortWidget* PixUI_CreateViewPortWidget();                                                                // [0x1a943d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_CreateViewPortAddToCanvasEx
	// class UPixUIViewPortWidget* PixUI_CreateViewPortAddToCanvasEx(class UCanvasPanel* pParentCanvas);                        // [0x1a94340] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_CreateViewPortAddToCanvas
	// class UPixUIViewPortWidget* PixUI_CreateViewPortAddToCanvas(class UCanvasPanel* pParentCanvas, FAnchors& Anchors, FMargin& Margin); // [0x1a94200] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_CreateScriptVM
	// class UPixUIScriptVM* PixUI_CreateScriptVM();                                                                            // [0x1a941d0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_CreateAddToCanvasEx
	// class UPixUIWidget* PixUI_CreateAddToCanvasEx(class UCanvasPanel* pParentCanvas);                                        // [0x1a94140] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_CreateAddToCanvas
	// class UPixUIWidget* PixUI_CreateAddToCanvas(class UCanvasPanel* p_ParentCanvas, FAnchors& Anchors, FMargin& Margin);     // [0x1a94000] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_ClearCacheFile
	// void PixUI_ClearCacheFile();                                                                                             // [0x1a93fe0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_CallPixUIAssetGC
	// bool PixUI_CallPixUIAssetGC(int32_t nViewId);                                                                            // [0x1a93f50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_BeDebugInfoOpen
	// bool PixUI_BeDebugInfoOpen(EPxDebugInfo EPxDebugInfo);                                                                   // [0x1a93ed0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIBPLibrary.PixUI_AddSystemFont
	// void PixUI_AddSystemFont(FString fstrFontName, FString fstrFontPath);                                                    // [0x1a93de0] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/PixUI.PixUIExternalInterface
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UPixUIExternalInterface : public UInterface
{ 
public:


	/// Functions
	// Function /Script/PixUI.PixUIExternalInterface.OnWidgetLoad
	// class UWidget* OnWidgetLoad(FString fstrWidgetPath, FString fstrWidgetTag);                                              // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/PixUI.PixUIExternalInterface.OnSlateBrushLoad
	// class UPixUIBrushWrapper* OnSlateBrushLoad(FString fstrBrushPath);                                                       // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/PixUI.PixUIExternalInterface.OnFileLoad
	// bool OnFileLoad(FString fstrFilePath, FDelegateProperty& callDelegate);                                                  // [0x3a75280] Event|Public|HasOutParms|BlueprintEvent 
};

/// Class /Script/PixUI.PixUIInput
/// Size: 0x0038 (56 bytes) (0x000028 - 0x000060) align 8 pad: 0x0000
class UPixUIInput : public UObject
{ 
public:
	SDK_UNDEFINED(16,2634) /* FDelegateProperty */     __um(DelegateActivateInput);                                // 0x0028   (0x0010)  
	SDK_UNDEFINED(16,2635) /* FDelegateProperty */     __um(DelegateDeactivateInput);                              // 0x0038   (0x0010)  
	unsigned char                                      UnknownData00_7[0x18];                                      // 0x0048   (0x0018)  MISSED


	/// Functions
	// Function /Script/PixUI.PixUIInput.OnInputText
	// void OnInputText(FString fstrInsert, bool bEndInput, bool bLostFocus, bool bReplace);                                    // [0x1a93550] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIInput.Get
	// class UPixUIInput* Get();                                                                                                // [0x1a923e0] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/PixUI.PixUILog
/// Size: 0x0010 (16 bytes) (0x000028 - 0x000038) align 8 pad: 0x0000
class UPixUILog : public UObject
{ 
public:
	SDK_UNDEFINED(16,2636) /* FMulticastInlineDelegate */ __um(LogDelegate);                                       // 0x0028   (0x0010)  


	/// Functions
	// Function /Script/PixUI.PixUILog.PxLogToggleSwitchLevel
	// void PxLogToggleSwitchLevel(EPxLogLevels eLogLevel, bool beOpen);                                                        // [0x1a96090] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUILog.PxLogToggleSwitchGroup
	// void PxLogToggleSwitchGroup(EPxLogGroups eLogGroup, bool beOpen);                                                        // [0x1a95fd0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUILog.PxLogEnable
	// void PxLogEnable(bool beEnable);                                                                                         // [0x1a95f50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUILog.Get
	// class UPixUILog* Get();                                                                                                  // [0x1a92410] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUILog.DispatchLog
	// void DispatchLog(EPxLogGroups eLogGroup, EPxLogLevels eLogLevel, FString fstrLogContent);                                // [0x1a91e40] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/PixUI.PixUIScriptVM
/// Size: 0x00C0 (192 bytes) (0x000028 - 0x0000E8) align 8 pad: 0x0000
class UPixUIScriptVM : public UObject
{ 
public:
	SDK_UNDEFINED(16,2637) /* FMulticastInlineDelegate */ __um(DelegateOnCreate);                                  // 0x0028   (0x0010)  
	SDK_UNDEFINED(16,2638) /* FMulticastInlineDelegate */ __um(DelegateOnClose);                                   // 0x0038   (0x0010)  
	SDK_UNDEFINED(16,2639) /* FMulticastInlineDelegate */ __um(DelegateOnDestroy);                                 // 0x0048   (0x0010)  
	SDK_UNDEFINED(16,2640) /* FMulticastInlineDelegate */ __um(DelegateOnLoaded);                                  // 0x0058   (0x0010)  
	SDK_UNDEFINED(16,2641) /* FMulticastInlineDelegate */ __um(DelegateOnScriptStateInit);                         // 0x0068   (0x0010)  
	SDK_UNDEFINED(16,2642) /* FMulticastInlineDelegate */ __um(DelegateOnInternalError);                           // 0x0078   (0x0010)  
	SDK_UNDEFINED(16,2643) /* FDelegateProperty */     __um(DelegateOnExternalOpen);                               // 0x0088   (0x0010)  
	SDK_UNDEFINED(16,2644) /* FMulticastInlineDelegate */ __um(DelegateOnExternalClose);                           // 0x0098   (0x0010)  
	SDK_UNDEFINED(16,2645) /* FMulticastInlineDelegate */ __um(DelegateOnMessage);                                 // 0x00A8   (0x0010)  
	SDK_UNDEFINED(16,2646) /* FMulticastInlineDelegate */ __um(DelegateOnAppForeground);                           // 0x00B8   (0x0010)  
	SDK_UNDEFINED(16,2647) /* FMulticastInlineDelegate */ __um(DelegateOnAppBackground);                           // 0x00C8   (0x0010)  
	unsigned char                                      UnknownData00_7[0x10];                                      // 0x00D8   (0x0010)  MISSED


	/// Functions
	// Function /Script/PixUI.PixUIScriptVM.SendPxMessage
	// FString SendPxMessage(FString fstrMessage, int32_t nWaitMS);                                                             // [0x1a96150] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIScriptVM.PostPxMessage
	// int32_t PostPxMessage(FString fstrMessage, int32_t nWaitMS);                                                             // [0x1a95c60] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIScriptVM.LoadUrl
	// int32_t LoadUrl(FString fstrUrl, int32_t nWaitMS);                                                                       // [0x1a92df0] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIScriptVM.IsValid
	// bool IsValid();                                                                                                          // [0x1a92640] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIScriptVM.GetPxVMId
	// int32_t GetPxVMId();                                                                                                     // [0x1a924a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIScriptVM.DoFile
	// int32_t DoFile(FString fstrFilePath, int32_t nWaitMS);                                                                   // [0x1a922f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIScriptVM.DoBufferByAssetPath
	// int32_t DoBufferByAssetPath(FString fstrAssetPath, FString fstrName, FString fstrModuleName, int32_t nWaitMS);           // [0x1a92160] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIScriptVM.DoBuffer
	// int32_t DoBuffer(TArray<char>& ArrayData, FString fstrBasePath, FString fstrName, FString fstrModuleName, int32_t nWaitMS); // [0x1a91f60] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/PixUI.PixUIScriptVM.DestroyVM
	// void DestroyVM(int32_t nWaitMS);                                                                                         // [0x1a91db0] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIScriptVM.Create
	// int32_t Create(bool bAsyncMode, int32_t nWaitMS);                                                                        // [0x1a91cb0] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIScriptVM.CloseVM
	// void CloseVM(int32_t nWaitMS);                                                                                           // [0x1a91c20] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/PixUI.PixUIViewPortWidget
/// Size: 0x0038 (56 bytes) (0x000288 - 0x0002C0) align 8 pad: 0x0000
class UPixUIViewPortWidget : public UUserWidget
{ 
public:
	SDK_UNDEFINED(16,2648) /* FDelegateProperty */     __um(PixUIWidgetOpenDelegate);                              // 0x0288   (0x0010)  
	SDK_UNDEFINED(16,2649) /* FDelegateProperty */     __um(PixUIWidgetConfirmDelegate);                           // 0x0298   (0x0010)  
	SDK_UNDEFINED(16,2650) /* FDelegateProperty */     __um(PixUIWidgetPromptDelegate);                            // 0x02A8   (0x0010)  
	unsigned char                                      UnknownData00_7[0x8];                                       // 0x02B8   (0x0008)  MISSED


	/// Functions
	// Function /Script/PixUI.PixUIViewPortWidget.SendPxMessage
	// FString SendPxMessage(FString fstrMessage);                                                                              // [0x1a96280] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIViewPortWidget.PostPxViewMessage
	// void PostPxViewMessage(FString fstrMessage);                                                                             // [0x1a95eb0] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIViewPortWidget.PostPxMessage
	// int32_t PostPxMessage(FString fstrMessage);                                                                              // [0x1a95d50] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIViewPortWidget.OnPixUITransformDelegate
	// void OnPixUITransformDelegate(EPxWidgetTransformType EPxWidgetTransformType, int32_t nParam1, int32_t nParam2);          // [0x1a93a50] Final|Native|Public  
	// Function /Script/PixUI.PixUIViewPortWidget.OnPixUIPromptDelegate
	// FString OnPixUIPromptDelegate(FString fstrTip, FString fstrDefault);                                                     // [0x1a93900] Final|Native|Public  
	// Function /Script/PixUI.PixUIViewPortWidget.OnPixUIOpenDelegate
	// int32_t OnPixUIOpenDelegate(FString fstrUrl, FString fstrName, FString fstrFeatures, bool bReplace);                     // [0x1a93770] Final|Native|Public  
	// Function /Script/PixUI.PixUIViewPortWidget.OnPixUIConfirmDelegate
	// bool OnPixUIConfirmDelegate(FString fstrConfirmMsg);                                                                     // [0x1a936c0] Final|Native|Public  
	// Function /Script/PixUI.PixUIViewPortWidget.LoadPxViewFromUrl
	// int32_t LoadPxViewFromUrl(FString fstrUrl);                                                                              // [0x1a92d40] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIViewPortWidget.LoadPxViewFromGameAssetPath
	// int32_t LoadPxViewFromGameAssetPath(FString fstrAssetPath);                                                              // [0x1a92c90] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIViewPortWidget.LoadPxViewFromData
	// int32_t LoadPxViewFromData(TArray<char>& ArrayData, FString fstrRootPath);                                               // [0x1a92b70] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/PixUI.PixUIViewPortWidget.LoadPageFromUrl
	// int32_t LoadPageFromUrl(FString fstrUrl);                                                                                // [0x1a92a10] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIViewPortWidget.LoadPageFromGameAssetPath
	// int32_t LoadPageFromGameAssetPath(FString fstrAssetPath);                                                                // [0x1a928b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIViewPortWidget.LoadPageFromData
	// int32_t LoadPageFromData(TArray<char>& ArrayData, FString fstrRootPath);                                                 // [0x1a92670] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/PixUI.PixUIViewPortWidget.GetPixUIWidget
	// class UPixUIWidget* GetPixUIWidget();                                                                                    // [0x1a92470] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIViewPortWidget.ClosePxView
	// void ClosePxView();                                                                                                      // [0x1a91c00] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIViewPortWidget.ClosePage
	// void ClosePage();                                                                                                        // [0x1a91bc0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/PixUI.PixUIWidget
/// Size: 0x0190 (400 bytes) (0x000150 - 0x0002E0) align 8 pad: 0x0000
class UPixUIWidget : public UCanvasPanel
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0150   (0x0008)  MISSED
	SDK_UNDEFINED(16,2651) /* FMulticastInlineDelegate */ __um(DelegateOnCreate);                                  // 0x0158   (0x0010)  
	SDK_UNDEFINED(16,2652) /* FMulticastInlineDelegate */ __um(DelegateOnClose);                                   // 0x0168   (0x0010)  
	SDK_UNDEFINED(16,2653) /* FMulticastInlineDelegate */ __um(DelegateOnDestroy);                                 // 0x0178   (0x0010)  
	SDK_UNDEFINED(16,2654) /* FMulticastInlineDelegate */ __um(DelegateOnLoaded);                                  // 0x0188   (0x0010)  
	SDK_UNDEFINED(16,2655) /* FMulticastInlineDelegate */ __um(DelegateOnScriptStateInit);                         // 0x0198   (0x0010)  
	SDK_UNDEFINED(16,2656) /* FMulticastInlineDelegate */ __um(DelegateOnInternalError);                           // 0x01A8   (0x0010)  
	SDK_UNDEFINED(16,2657) /* FDelegateProperty */     __um(DelegateOnExternalOpen);                               // 0x01B8   (0x0010)  
	SDK_UNDEFINED(16,2658) /* FMulticastInlineDelegate */ __um(DelegateOnExternalClose);                           // 0x01C8   (0x0010)  
	SDK_UNDEFINED(16,2659) /* FMulticastInlineDelegate */ __um(DelegateOnMessage);                                 // 0x01D8   (0x0010)  
	SDK_UNDEFINED(16,2660) /* FMulticastInlineDelegate */ __um(DelegateOnAlert);                                   // 0x01E8   (0x0010)  
	SDK_UNDEFINED(16,2661) /* FDelegateProperty */     __um(DelegateOnConfirm);                                    // 0x01F8   (0x0010)  
	SDK_UNDEFINED(16,2662) /* FDelegateProperty */     __um(DelegateOnPrompt);                                     // 0x0208   (0x0010)  
	SDK_UNDEFINED(16,2663) /* FMulticastInlineDelegate */ __um(DelegateOnTransform);                               // 0x0218   (0x0010)  
	SDK_UNDEFINED(16,2664) /* FMulticastInlineDelegate */ __um(DelegateOnAppForeground);                           // 0x0228   (0x0010)  
	SDK_UNDEFINED(16,2665) /* FMulticastInlineDelegate */ __um(DelegateOnAppBackground);                           // 0x0238   (0x0010)  
	SDK_UNDEFINED(16,2666) /* FDelegateProperty */     __um(DelegateHookKeyEvent);                                 // 0x0248   (0x0010)  
	bool                                               bIsRHIRender;                                               // 0x0258   (0x0001)  
	bool                                               bIsAsync;                                                   // 0x0259   (0x0001)  
	bool                                               bIsForcePaint;                                              // 0x025A   (0x0001)  
	EPxWidgetBatchType                                 batchType;                                                  // 0x025B   (0x0001)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x025C   (0x0004)  MISSED
	FText                                              TextDefaultUrl;                                             // 0x0260   (0x0018)  
	unsigned char                                      UnknownData02_7[0x68];                                      // 0x0278   (0x0068)  MISSED


	/// Functions
	// Function /Script/PixUI.PixUIWidget.ShowNextDrawBatch
	// void ShowNextDrawBatch();                                                                                                // [0xd906a0] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIWidget.SetBackgroundBlur
	// void SetBackgroundBlur(float fBlurStrength);                                                                             // [0x1a964f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIWidget.SetAutoTransform
	// void SetAutoTransform(bool bAutoTransform);                                                                              // [0x1a96460] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIWidget.SendPxMessage
	// FString SendPxMessage(FString fstrMessage);                                                                              // [0x1a96370] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIWidget.PostPxMessage
	// int32_t PostPxMessage(FString fstrMessage);                                                                              // [0x1a95e00] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIWidget.OpenPageFromUrl
	// int32_t OpenPageFromUrl(FString fstrUrl);                                                                                // [0x1a93d30] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIWidget.OpenPageFromGameAssetPath
	// int32_t OpenPageFromGameAssetPath(FString fstrAssetPath);                                                                // [0x1a93c80] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIWidget.OpenPageFromData
	// int32_t OpenPageFromData(TArray<char>& ArrayData, FString fstrBasePath);                                                 // [0x1a93b60] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/PixUI.PixUIWidget.OnExternalTouchEvent
	// void OnExternalTouchEvent(FVector2D& v2dPosTouch, int32_t nPointerIndex, EPxTouchType ETouchType);                       // [0x1a93390] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/PixUI.PixUIWidget.OnExternalTextInput
	// void OnExternalTextInput(FString fstrNewInput, bool beEndInput, bool beLostFocus, bool beReplace);                       // [0x1a93200] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIWidget.OnExternalMouseEvent
	// void OnExternalMouseEvent(FVector2D& v2dPosMouse, FVector2D& v2dOffsetWheel, FKey& Key, EPxKeyEventType uEvent);         // [0x1a93030] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/PixUI.PixUIWidget.OnExternalKeyBoardEvent
	// void OnExternalKeyBoardEvent(FKeyEvent& KeyEvent, EPxKeyEventType eEventType);                                           // [0x1a92ee0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/PixUI.PixUIWidget.LoadPageFromUrl
	// int32_t LoadPageFromUrl(FString fstrUrl);                                                                                // [0x1a92ac0] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIWidget.LoadPageFromGameAssetPath
	// int32_t LoadPageFromGameAssetPath(FString fstrAssetPath);                                                                // [0x1a92960] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIWidget.LoadPageFromData
	// int32_t LoadPageFromData(TArray<char>& ArrayData, FString fstrBasePath);                                                 // [0x1a92790] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/PixUI.PixUIWidget.HistoryGo
	// void HistoryGo(int32_t nStep);                                                                                           // [0x1a925b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIWidget.GetSlotObjectByTagId
	// class UObject* GetSlotObjectByTagId(FString fstrSlotTagId);                                                              // [0x1a92500] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIWidget.GetPxWinId
	// int32_t GetPxWinId();                                                                                                    // [0x1a924d0] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIWidget.GetCtrlWidget
	// class UWidget* GetCtrlWidget();                                                                                          // [0x1a92440] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIWidget.DestroyPage
	// void DestroyPage();                                                                                                      // [0x1a91d90] Final|Native|Public|BlueprintCallable 
	// Function /Script/PixUI.PixUIWidget.ClosePage
	// void ClosePage();                                                                                                        // [0x1a91be0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/PixUI.PxSubLayerWidget
/// Size: 0x0020 (32 bytes) (0x000128 - 0x000148) align 8 pad: 0x0000
class UPxSubLayerWidget : public UWidget
{ 
public:
	unsigned char                                      UnknownData00_1[0x20];                                      // 0x0128   (0x0020)  MISSED
};

/// Class /Script/PixUI.PxSubCtrlWidget
/// Size: 0x0010 (16 bytes) (0x000148 - 0x000158) align 8 pad: 0x0000
class UPxSubCtrlWidget : public UPxSubLayerWidget
{ 
public:
	unsigned char                                      UnknownData00_1[0x10];                                      // 0x0148   (0x0010)  MISSED
};

static_assert(sizeof(UPixUIBrushWrapper) == 0x0038); // 56 bytes (0x000028 - 0x000038)
static_assert(sizeof(UPixFileLoadObject) == 0x0090); // 144 bytes (0x000028 - 0x000090)
static_assert(sizeof(UPixUIBPLibrary) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UPixUIExternalInterface) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UPixUIInput) == 0x0060); // 96 bytes (0x000028 - 0x000060)
static_assert(sizeof(UPixUILog) == 0x0038); // 56 bytes (0x000028 - 0x000038)
static_assert(sizeof(UPixUIScriptVM) == 0x00E8); // 232 bytes (0x000028 - 0x0000E8)
static_assert(sizeof(UPixUIViewPortWidget) == 0x02C0); // 704 bytes (0x000288 - 0x0002C0)
static_assert(sizeof(UPixUIWidget) == 0x02E0); // 736 bytes (0x000150 - 0x0002E0)
static_assert(sizeof(UPxSubLayerWidget) == 0x0148); // 328 bytes (0x000128 - 0x000148)
static_assert(sizeof(UPxSubCtrlWidget) == 0x0158); // 344 bytes (0x000148 - 0x000158)
static_assert(offsetof(UPixUIWidget, batchType) == 0x025B);
static_assert(offsetof(UPixUIWidget, TextDefaultUrl) == 0x0260);
