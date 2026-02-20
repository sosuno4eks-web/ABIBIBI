
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Enum /Script/ACLPlugin.ACLCompressionLevel
/// Size: 0x01 (1 bytes)
enum class ACLCompressionLevel : uint8_t
{
	ACLCL_Lowest                                                                     = 0,
	ACLCL_Low                                                                        = 1,
	ACLCL_Medium                                                                     = 2,
	ACLCL_High                                                                       = 3,
	ACLCL_Highest                                                                    = 4
};

/// Enum /Script/ACLPlugin.ACLVectorFormat
/// Size: 0x01 (1 bytes)
enum class ACLVectorFormat : uint8_t
{
	ACLVF_Vector3                                                                    = 0,
	ACLVF_Vector3_Variable                                                           = 1
};

/// Enum /Script/ACLPlugin.ACLRotationFormat
/// Size: 0x01 (1 bytes)
enum class ACLRotationFormat : uint8_t
{
	ACLRF_Quat                                                                       = 0,
	ACLRF_QuatDropW                                                                  = 1,
	ACLRF_QuatDropW_Variable                                                         = 2
};

/// Enum /Script/ACLPlugin.ACLVisualFidelityChangeResult
/// Size: 0x01 (1 bytes)
enum class ACLVisualFidelityChangeResult : uint8_t
{
	ACLVisualFidelityChangeResult__Dispatched                                        = 0,
	ACLVisualFidelityChangeResult__Completed                                         = 1,
	ACLVisualFidelityChangeResult__Failed                                            = 2
};

/// Enum /Script/ACLPlugin.ACLVisualFidelity
/// Size: 0x01 (1 bytes)
enum class ACLVisualFidelity : uint8_t
{
	ACLVisualFidelity__Highest                                                       = 0,
	ACLVisualFidelity__Medium                                                        = 1,
	ACLVisualFidelity__Lowest                                                        = 2
};

/// Class /Script/ACLPlugin.AnimationCompressionLibraryDatabase
/// Size: 0x0138 (312 bytes) (0x000028 - 0x000160) align 8 pad: 0x0000
class UAnimationCompressionLibraryDatabase : public UObject
{ 
public:
	TArray<char>                                       CookedCompressedBytes;                                      // 0x0028   (0x0010)  
	TArray<uint64_t>                                   CookedAnimSequenceMappings;                                 // 0x0038   (0x0010)  
	unsigned char                                      UnknownData00_6[0x110];                                     // 0x0048   (0x0110)  MISSED
	uint32_t                                           MaxStreamRequestSizeKB;                                     // 0x0158   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x015C   (0x0004)  MISSED


	/// Functions
	// Function /Script/ACLPlugin.AnimationCompressionLibraryDatabase.SetVisualFidelity
	// void SetVisualFidelity(class UObject* WorldContextObject, FLatentActionInfo LatentInfo, class UAnimationCompressionLibraryDatabase* DatabaseAsset, ACLVisualFidelityChangeResult& Result, ACLVisualFidelity VisualFidelity); // [0x13cdd00] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/ACLPlugin.AnimationCompressionLibraryDatabase.GetVisualFidelity
	// ACLVisualFidelity GetVisualFidelity(class UAnimationCompressionLibraryDatabase* DatabaseAsset);                          // [0x13cdc70] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/ACLPlugin.AnimBoneCompressionCodec_ACLBase
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UAnimBoneCompressionCodec_ACLBase : public UAnimBoneCompressionCodec
{ 
public:
};

/// Class /Script/ACLPlugin.AnimBoneCompressionCodec_ACL
/// Size: 0x0008 (8 bytes) (0x000038 - 0x000040) align 8 pad: 0x0000
class UAnimBoneCompressionCodec_ACL : public UAnimBoneCompressionCodec_ACLBase
{ 
public:
	class UAnimBoneCompressionCodec*                   SafetyFallbackCodec;                                        // 0x0038   (0x0008)  
};

/// Class /Script/ACLPlugin.AnimBoneCompressionCodec_ACLCustom
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UAnimBoneCompressionCodec_ACLCustom : public UAnimBoneCompressionCodec_ACLBase
{ 
public:
};

/// Class /Script/ACLPlugin.AnimBoneCompressionCodec_ACLDatabase
/// Size: 0x0008 (8 bytes) (0x000038 - 0x000040) align 8 pad: 0x0000
class UAnimBoneCompressionCodec_ACLDatabase : public UAnimBoneCompressionCodec_ACLBase
{ 
public:
	class UAnimationCompressionLibraryDatabase*        DatabaseAsset;                                              // 0x0038   (0x0008)  
};

/// Class /Script/ACLPlugin.AnimBoneCompressionCodec_ACLSafe
/// Size: 0x0000 (0 bytes) (0x000038 - 0x000038) align 8 pad: 0x0000
class UAnimBoneCompressionCodec_ACLSafe : public UAnimBoneCompressionCodec_ACLBase
{ 
public:
};

/// Class /Script/ACLPlugin.AnimCurveCompressionCodec_ACL
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UAnimCurveCompressionCodec_ACL : public UAnimCurveCompressionCodec
{ 
public:
};

static_assert(sizeof(UAnimationCompressionLibraryDatabase) == 0x0160); // 352 bytes (0x000028 - 0x000160)
static_assert(sizeof(UAnimBoneCompressionCodec_ACLBase) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAnimBoneCompressionCodec_ACL) == 0x0040); // 64 bytes (0x000038 - 0x000040)
static_assert(sizeof(UAnimBoneCompressionCodec_ACLCustom) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAnimBoneCompressionCodec_ACLDatabase) == 0x0040); // 64 bytes (0x000038 - 0x000040)
static_assert(sizeof(UAnimBoneCompressionCodec_ACLSafe) == 0x0038); // 56 bytes (0x000038 - 0x000038)
static_assert(sizeof(UAnimCurveCompressionCodec_ACL) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(offsetof(UAnimationCompressionLibraryDatabase, CookedCompressedBytes) == 0x0028);
static_assert(offsetof(UAnimationCompressionLibraryDatabase, CookedAnimSequenceMappings) == 0x0038);
static_assert(offsetof(UAnimBoneCompressionCodec_ACL, SafetyFallbackCodec) == 0x0038);
static_assert(offsetof(UAnimBoneCompressionCodec_ACLDatabase, DatabaseAsset) == 0x0038);
