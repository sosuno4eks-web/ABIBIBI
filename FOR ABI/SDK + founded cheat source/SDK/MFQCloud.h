
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject

/// Class /Script/MFQCloud.MFQCloudWrapper
/// Size: 0x0030 (48 bytes) (0x000028 - 0x000058) align 8 pad: 0x0000
class UMFQCloudWrapper : public UObject
{ 
public:
	SDK_UNDEFINED(16,2769) /* FMulticastInlineDelegate */ __um(OnUploadCompleted);                                 // 0x0028   (0x0010)  
	SDK_UNDEFINED(16,2770) /* FMulticastInlineDelegate */ __um(OnUploadProgress);                                  // 0x0038   (0x0010)  
	unsigned char                                      UnknownData00_7[0x10];                                      // 0x0048   (0x0010)  MISSED


	/// Functions
	// Function /Script/MFQCloud.MFQCloudWrapper.UploadFile
	// bool UploadFile(FString InFilePath, FString InCosPath);                                                                  // [0x2f648f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MFQCloud.MFQCloudWrapper.OnUploadProgress__DelegateSignature
	// void OnUploadProgress__DelegateSignature(float InProgress, FString Path);                                                // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/MFQCloud.MFQCloudWrapper.OnUploadCompleted__DelegateSignature
	// void OnUploadCompleted__DelegateSignature(FString InRetVal, FString Path);                                               // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/MFQCloud.MFQCloudWrapper.OnCosUploadProgress
	// void OnCosUploadProgress(float InProgress, FString Path);                                                                // [0x2f647c0] Final|Native|Public  
	// Function /Script/MFQCloud.MFQCloudWrapper.OnCosUploadComplete
	// void OnCosUploadComplete(FString InRetVal, FString Path);                                                                // [0x2f64640] Final|Native|Public  
	// Function /Script/MFQCloud.MFQCloudWrapper.GetDefault
	// class UMFQCloudWrapper* GetDefault();                                                                                    // [0x2f64610] Final|Native|Static|Public|BlueprintCallable 
};

static_assert(sizeof(UMFQCloudWrapper) == 0x0058); // 88 bytes (0x000028 - 0x000058)
