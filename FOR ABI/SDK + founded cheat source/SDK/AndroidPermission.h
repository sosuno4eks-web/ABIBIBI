
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Class /Script/AndroidPermission.AndroidPermissionCallbackProxy
/// Size: 0x0040 (64 bytes) (0x000028 - 0x000068) align 8 pad: 0x0000
class UAndroidPermissionCallbackProxy : public UObject
{ 
public:
	SDK_UNDEFINED(16,443) /* FMulticastInlineDelegate */ __um(OnPermissionsGrantedDynamicDelegate);                // 0x0028   (0x0010)  
	SDK_UNDEFINED(16,444) /* FMulticastInlineDelegate */ __um(OnExternalStagePermissionsGrantedDynamicDelegate);   // 0x0038   (0x0010)  
	SDK_UNDEFINED(16,445) /* FMulticastInlineDelegate */ __um(OnLocationPermissionsGrantedDynamicDelegate);        // 0x0048   (0x0010)  
	unsigned char                                      UnknownData00_7[0x10];                                      // 0x0058   (0x0010)  MISSED
};

/// Class /Script/AndroidPermission.AndroidPermissionFunctionLibrary
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UAndroidPermissionFunctionLibrary : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/AndroidPermission.AndroidPermissionFunctionLibrary.CheckPermission
	// bool CheckPermission(FString permission);                                                                                // [0x30f8c20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AndroidPermission.AndroidPermissionFunctionLibrary.AcquirePermissions
	// class UAndroidPermissionCallbackProxy* AcquirePermissions(TArray<FString>& Permissions);                                 // [0x30f8b50] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
};

static_assert(sizeof(UAndroidPermissionCallbackProxy) == 0x0068); // 104 bytes (0x000028 - 0x000068)
static_assert(sizeof(UAndroidPermissionFunctionLibrary) == 0x0028); // 40 bytes (0x000028 - 0x000028)
