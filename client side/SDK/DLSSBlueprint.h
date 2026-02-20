
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Enum /Script/DLSSBlueprint.UDLSSMode
/// Size: 0x01 (1 bytes)
enum class UDLSSMode : uint8_t
{
	UDLSSMode__Off                                                                   = 0,
	UDLSSMode__Auto                                                                  = 1,
	UDLSSMode__UltraQuality                                                          = 2,
	UDLSSMode__Quality                                                               = 3,
	UDLSSMode__Balanced                                                              = 4,
	UDLSSMode__Performance                                                           = 5,
	UDLSSMode__UltraPerformance                                                      = 6
};

/// Enum /Script/DLSSBlueprint.UDLSSSupport
/// Size: 0x01 (1 bytes)
enum class UDLSSSupport : uint8_t
{
	UDLSSSupport__Supported                                                          = 0,
	UDLSSSupport__NotSupported                                                       = 1,
	UDLSSSupport__NotSupportedIncompatibleHardware                                   = 2,
	UDLSSSupport__NotSupportedDriverOutOfDate                                        = 3,
	UDLSSSupport__NotSupportedOperatingSystemOutOfDate                               = 4,
	UDLSSSupport__NotSupportedByPlatformAtBuildTime                                  = 5
};

/// Class /Script/DLSSBlueprint.DLSSLibrary
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UDLSSLibrary : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/DLSSBlueprint.DLSSLibrary.SetDLSSSharpness
	// void SetDLSSSharpness(float Sharpness);                                                                                  // [0x16271e0] Final|RequiredAPI|Native|Static|Public|BlueprintCallable 
	// Function /Script/DLSSBlueprint.DLSSLibrary.SetDLSSMode
	// void SetDLSSMode(UDLSSMode DLSSMode);                                                                                    // [0x1627170] Final|RequiredAPI|Native|Static|Public|BlueprintCallable 
	// Function /Script/DLSSBlueprint.DLSSLibrary.QueryDLSSSupport
	// UDLSSSupport QueryDLSSSupport();                                                                                         // [0x1627140] Final|RequiredAPI|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/DLSSBlueprint.DLSSLibrary.IsDLSSSupported
	// bool IsDLSSSupported();                                                                                                  // [0x1627110] Final|RequiredAPI|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/DLSSBlueprint.DLSSLibrary.IsDLSSModeSupported
	// bool IsDLSSModeSupported(UDLSSMode DLSSMode);                                                                            // [0x1627090] Final|RequiredAPI|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/DLSSBlueprint.DLSSLibrary.GetSupportedDLSSModes
	// TArray<UDLSSMode> GetSupportedDLSSModes();                                                                               // [0x1627010] Final|RequiredAPI|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/DLSSBlueprint.DLSSLibrary.GetDLSSSharpness
	// float GetDLSSSharpness();                                                                                                // [0x1626fb0] Final|RequiredAPI|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/DLSSBlueprint.DLSSLibrary.GetDLSSScreenPercentageRange
	// void GetDLSSScreenPercentageRange(float& MinScreenPercentage, float& MaxScreenPercentage);                               // [0x1626ed0] Final|RequiredAPI|Native|Static|Public|HasOutParms|BlueprintCallable|BlueprintPure 
	// Function /Script/DLSSBlueprint.DLSSLibrary.GetDLSSModeInformation
	// void GetDLSSModeInformation(UDLSSMode DLSSMode, FVector2D ScreenResolution, bool& bIsSupported, float& OptimalScreenPercentage, bool& bIsFixedScreenPercentage, float& MinScreenPercentage, float& MaxScreenPercentage, float& OptimalSharpness); // [0x1626c30] Final|RequiredAPI|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/DLSSBlueprint.DLSSLibrary.GetDLSSMode
	// UDLSSMode GetDLSSMode();                                                                                                 // [0x1626c00] Final|RequiredAPI|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/DLSSBlueprint.DLSSLibrary.GetDLSSMinimumDriverVersion
	// void GetDLSSMinimumDriverVersion(int32_t& MinDriverVersionMajor, int32_t& MinDriverVersionMinor);                        // [0x1626b20] Final|RequiredAPI|Native|Static|Public|HasOutParms|BlueprintCallable|BlueprintPure 
	// Function /Script/DLSSBlueprint.DLSSLibrary.GetDefaultDLSSMode
	// UDLSSMode GetDefaultDLSSMode();                                                                                          // [0x1626fe0] Final|RequiredAPI|Native|Static|Public|BlueprintCallable|BlueprintPure 
};

static_assert(sizeof(UDLSSLibrary) == 0x0028); // 40 bytes (0x000028 - 0x000028)
