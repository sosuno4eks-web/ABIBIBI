
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject

/// Enum /Script/RigVM.ERigVMParameterType
/// Size: 0x01 (1 bytes)
enum class ERigVMParameterType : uint8_t
{
	ERigVMParameterType__Input                                                       = 0,
	ERigVMParameterType__Output                                                      = 1,
	ERigVMParameterType__Invalid                                                     = 2
};

/// Enum /Script/RigVM.ERigVMOpCode
/// Size: 0x01 (1 bytes)
enum class ERigVMOpCode : uint8_t
{
	ERigVMOpCode__Execute_0_Operands                                                 = 0,
	ERigVMOpCode__Execute_1_Operands                                                 = 1,
	ERigVMOpCode__Execute_2_Operands                                                 = 2,
	ERigVMOpCode__Execute_3_Operands                                                 = 3,
	ERigVMOpCode__Execute_4_Operands                                                 = 4,
	ERigVMOpCode__Execute_5_Operands                                                 = 5,
	ERigVMOpCode__Execute_6_Operands                                                 = 6,
	ERigVMOpCode__Execute_7_Operands                                                 = 7,
	ERigVMOpCode__Execute_8_Operands                                                 = 8,
	ERigVMOpCode__Execute_9_Operands                                                 = 9,
	ERigVMOpCode__Execute_10_Operands                                                = 10,
	ERigVMOpCode__Execute_11_Operands                                                = 11,
	ERigVMOpCode__Execute_12_Operands                                                = 12,
	ERigVMOpCode__Execute_13_Operands                                                = 13,
	ERigVMOpCode__Execute_14_Operands                                                = 14,
	ERigVMOpCode__Execute_15_Operands                                                = 15,
	ERigVMOpCode__Execute_16_Operands                                                = 16,
	ERigVMOpCode__Execute_17_Operands                                                = 17,
	ERigVMOpCode__Execute_18_Operands                                                = 18,
	ERigVMOpCode__Execute_19_Operands                                                = 19,
	ERigVMOpCode__Execute_20_Operands                                                = 20,
	ERigVMOpCode__Execute_21_Operands                                                = 21,
	ERigVMOpCode__Execute_22_Operands                                                = 22,
	ERigVMOpCode__Execute_23_Operands                                                = 23,
	ERigVMOpCode__Execute_24_Operands                                                = 24,
	ERigVMOpCode__Execute_25_Operands                                                = 25,
	ERigVMOpCode__Execute_26_Operands                                                = 26,
	ERigVMOpCode__Execute_27_Operands                                                = 27,
	ERigVMOpCode__Execute_28_Operands                                                = 28,
	ERigVMOpCode__Execute_29_Operands                                                = 29,
	ERigVMOpCode__Execute_30_Operands                                                = 30,
	ERigVMOpCode__Execute_31_Operands                                                = 31,
	ERigVMOpCode__Execute_32_Operands                                                = 32,
	ERigVMOpCode__Execute_33_Operands                                                = 33,
	ERigVMOpCode__Execute_34_Operands                                                = 34,
	ERigVMOpCode__Execute_35_Operands                                                = 35,
	ERigVMOpCode__Execute_36_Operands                                                = 36,
	ERigVMOpCode__Execute_37_Operands                                                = 37,
	ERigVMOpCode__Execute_38_Operands                                                = 38,
	ERigVMOpCode__Execute_39_Operands                                                = 39,
	ERigVMOpCode__Execute_40_Operands                                                = 40,
	ERigVMOpCode__Execute_41_Operands                                                = 41,
	ERigVMOpCode__Execute_42_Operands                                                = 42,
	ERigVMOpCode__Execute_43_Operands                                                = 43,
	ERigVMOpCode__Execute_44_Operands                                                = 44,
	ERigVMOpCode__Execute_45_Operands                                                = 45,
	ERigVMOpCode__Execute_46_Operands                                                = 46,
	ERigVMOpCode__Execute_47_Operands                                                = 47,
	ERigVMOpCode__Execute_48_Operands                                                = 48,
	ERigVMOpCode__Execute_49_Operands                                                = 49,
	ERigVMOpCode__Execute_50_Operands                                                = 50,
	ERigVMOpCode__Execute_51_Operands                                                = 51,
	ERigVMOpCode__Execute_52_Operands                                                = 52,
	ERigVMOpCode__Execute_53_Operands                                                = 53,
	ERigVMOpCode__Execute_54_Operands                                                = 54,
	ERigVMOpCode__Execute_55_Operands                                                = 55,
	ERigVMOpCode__Execute_56_Operands                                                = 56,
	ERigVMOpCode__Execute_57_Operands                                                = 57,
	ERigVMOpCode__Execute_58_Operands                                                = 58,
	ERigVMOpCode__Execute_59_Operands                                                = 59,
	ERigVMOpCode__Execute_60_Operands                                                = 60,
	ERigVMOpCode__Execute_61_Operands                                                = 61,
	ERigVMOpCode__Execute_62_Operands                                                = 62,
	ERigVMOpCode__Execute_63_Operands                                                = 63,
	ERigVMOpCode__Execute_64_Operands                                                = 64,
	ERigVMOpCode__Zero                                                               = 65,
	ERigVMOpCode__BoolFalse                                                          = 66,
	ERigVMOpCode__BoolTrue                                                           = 67,
	ERigVMOpCode__Copy                                                               = 68,
	ERigVMOpCode__Increment                                                          = 69,
	ERigVMOpCode__Decrement                                                          = 70,
	ERigVMOpCode__Equals                                                             = 71,
	ERigVMOpCode__NotEquals                                                          = 72,
	ERigVMOpCode__JumpAbsolute                                                       = 73,
	ERigVMOpCode__JumpForward                                                        = 74,
	ERigVMOpCode__JumpBackward                                                       = 75,
	ERigVMOpCode__JumpAbsoluteIf                                                     = 76,
	ERigVMOpCode__JumpForwardIf                                                      = 77,
	ERigVMOpCode__JumpBackwardIf                                                     = 78,
	ERigVMOpCode__ChangeType                                                         = 79,
	ERigVMOpCode__Exit                                                               = 80,
	ERigVMOpCode__BeginBlock                                                         = 81,
	ERigVMOpCode__EndBlock                                                           = 82,
	ERigVMOpCode__Invalid                                                            = 83
};

/// Enum /Script/RigVM.ERigVMPinDirection
/// Size: 0x01 (1 bytes)
enum class ERigVMPinDirection : uint8_t
{
	ERigVMPinDirection__Input                                                        = 0,
	ERigVMPinDirection__Output                                                       = 1,
	ERigVMPinDirection__IO                                                           = 2,
	ERigVMPinDirection__Visible                                                      = 3,
	ERigVMPinDirection__Hidden                                                       = 4,
	ERigVMPinDirection__Invalid                                                      = 5
};

/// Enum /Script/RigVM.ERigVMRegisterType
/// Size: 0x01 (1 bytes)
enum class ERigVMRegisterType : uint8_t
{
	ERigVMRegisterType__Plain                                                        = 0,
	ERigVMRegisterType__String                                                       = 1,
	ERigVMRegisterType__Name                                                         = 2,
	ERigVMRegisterType__Struct                                                       = 3,
	ERigVMRegisterType__Invalid                                                      = 4
};

/// Enum /Script/RigVM.ERigVMMemoryType
/// Size: 0x01 (1 bytes)
enum class ERigVMMemoryType : uint8_t
{
	ERigVMMemoryType__Work                                                           = 0,
	ERigVMMemoryType__Literal                                                        = 1,
	ERigVMMemoryType__External                                                       = 2,
	ERigVMMemoryType__Invalid                                                        = 3
};

/// Struct /Script/RigVM.RigVMRegister
/// Size: 0x0024 (36 bytes) (0x000000 - 0x000024) align 4 pad: 0x0000
struct FRigVMRegister
{ 
	ERigVMRegisterType                                 Type;                                                       // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	uint32_t                                           ByteIndex;                                                  // 0x0004   (0x0004)  
	uint16_t                                           ElementSize;                                                // 0x0008   (0x0002)  
	uint16_t                                           ElementCount;                                               // 0x000A   (0x0002)  
	uint16_t                                           SliceCount;                                                 // 0x000C   (0x0002)  
	char                                               AlignmentBytes;                                             // 0x000E   (0x0001)  
	unsigned char                                      UnknownData01_6[0x1];                                       // 0x000F   (0x0001)  MISSED
	uint16_t                                           TrailingBytes;                                              // 0x0010   (0x0002)  
	unsigned char                                      UnknownData02_6[0x2];                                       // 0x0012   (0x0002)  MISSED
	FName                                              Name;                                                       // 0x0014   (0x0008)  
	int32_t                                            ScriptStructIndex;                                          // 0x001C   (0x0004)  
	bool                                               bIsArray;                                                   // 0x0020   (0x0001)  
	bool                                               bIsDynamic;                                                 // 0x0021   (0x0001)  
	unsigned char                                      UnknownData03_7[0x2];                                       // 0x0022   (0x0002)  MISSED
};

/// Struct /Script/RigVM.RigVMRegisterOffset
/// Size: 0x0048 (72 bytes) (0x000000 - 0x000048) align 8 pad: 0x0000
struct FRigVMRegisterOffset
{ 
	TArray<int32_t>                                    Segments;                                                   // 0x0000   (0x0010)  
	ERigVMRegisterType                                 Type;                                                       // 0x0010   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0011   (0x0003)  MISSED
	FName                                              CPPType;                                                    // 0x0014   (0x0008)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x001C   (0x0004)  MISSED
	class UScriptStruct*                               ScriptStruct;                                               // 0x0020   (0x0008)  
	class UScriptStruct*                               ParentScriptStruct;                                         // 0x0028   (0x0008)  
	int32_t                                            ArrayIndex;                                                 // 0x0030   (0x0004)  
	uint16_t                                           ElementSize;                                                // 0x0034   (0x0002)  
	unsigned char                                      UnknownData02_6[0x2];                                       // 0x0036   (0x0002)  MISSED
	FString                                            CachedSegmentPath;                                          // 0x0038   (0x0010)  
};

/// Struct /Script/RigVM.RigVMMemoryContainer
/// Size: 0x00A0 (160 bytes) (0x000000 - 0x0000A0) align 8 pad: 0x0000
struct FRigVMMemoryContainer
{ 
	bool                                               bUseNameMap;                                                // 0x0000   (0x0001)  
	ERigVMMemoryType                                   MemoryType;                                                 // 0x0001   (0x0001)  
	unsigned char                                      UnknownData00_6[0x6];                                       // 0x0002   (0x0006)  MISSED
	TArray<FRigVMRegister>                             Registers;                                                  // 0x0008   (0x0010)  
	TArray<FRigVMRegisterOffset>                       RegisterOffsets;                                            // 0x0018   (0x0010)  
	TArray<char>                                       Data;                                                       // 0x0028   (0x0010)  
	TArray<class UScriptStruct*>                       ScriptStructs;                                              // 0x0038   (0x0010)  
	SDK_UNDEFINED(80,471) /* TMap<FName, int32_t> */   __um(NameMap);                                              // 0x0048   (0x0050)  
	bool                                               bEncounteredErrorDuringLoad;                                // 0x0098   (0x0001)  
	unsigned char                                      UnknownData01_7[0x7];                                       // 0x0099   (0x0007)  MISSED
};

/// Struct /Script/RigVM.RigVMByteCodeEntry
/// Size: 0x000C (12 bytes) (0x000000 - 0x00000C) align 4 pad: 0x0000
struct FRigVMByteCodeEntry
{ 
	FName                                              Name;                                                       // 0x0000   (0x0008)  
	int32_t                                            InstructionIndex;                                           // 0x0008   (0x0004)  
};

/// Struct /Script/RigVM.RigVMByteCode
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 8 pad: 0x0000
struct FRigVMByteCode
{ 
	TArray<char>                                       ByteCode;                                                   // 0x0000   (0x0010)  
	int32_t                                            NumInstructions;                                            // 0x0010   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0014   (0x0004)  MISSED
	TArray<FRigVMByteCodeEntry>                        Entries;                                                    // 0x0018   (0x0010)  
	unsigned char                                      UnknownData01_7[0x8];                                       // 0x0028   (0x0008)  MISSED
};

/// Struct /Script/RigVM.RigVMInstruction
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FRigVMInstruction
{ 
	uint64_t                                           ByteCodeIndex;                                              // 0x0000   (0x0008)  
	ERigVMOpCode                                       OpCode;                                                     // 0x0008   (0x0001)  
	char                                               OperandAlignment;                                           // 0x0009   (0x0001)  
	unsigned char                                      UnknownData00_7[0x6];                                       // 0x000A   (0x0006)  MISSED
};

/// Struct /Script/RigVM.RigVMInstructionArray
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FRigVMInstructionArray
{ 
	TArray<FRigVMInstruction>                          Instructions;                                               // 0x0000   (0x0010)  
};

/// Struct /Script/RigVM.RigVMExecuteContext
/// Size: 0x0058 (88 bytes) (0x000000 - 0x000058) align 8 pad: 0x0000
struct FRigVMExecuteContext
{ 
	unsigned char                                      UnknownData00_2[0x58];                                      // 0x0000   (0x0058)  MISSED
};

/// Struct /Script/RigVM.RigVMParameter
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 8 pad: 0x0000
struct FRigVMParameter
{ 
	ERigVMParameterType                                Type;                                                       // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	FName                                              Name;                                                       // 0x0004   (0x0008)  
	int32_t                                            RegisterIndex;                                              // 0x000C   (0x0004)  
	FString                                            CPPType;                                                    // 0x0010   (0x0010)  
	class UScriptStruct*                               ScriptStruct;                                               // 0x0020   (0x0008)  
	FName                                              ScriptStructPath;                                           // 0x0028   (0x0008)  
};

/// Class /Script/RigVM.RigVM
/// Size: 0x02D0 (720 bytes) (0x000028 - 0x0002F8) align 8 pad: 0x0000
class URigVM : public UObject
{ 
public:
	FRigVMMemoryContainer                              WorkMemoryStorage;                                          // 0x0028   (0x00A0)  
	unsigned char                                      UnknownData00_6[0x8];                                       // 0x00C8   (0x0008)  MISSED
	FRigVMMemoryContainer                              LiteralMemoryStorage;                                       // 0x00D0   (0x00A0)  
	unsigned char                                      UnknownData01_6[0x8];                                       // 0x0170   (0x0008)  MISSED
	FRigVMByteCode                                     ByteCodeStorage;                                            // 0x0178   (0x0030)  
	unsigned char                                      UnknownData02_6[0x8];                                       // 0x01A8   (0x0008)  MISSED
	FRigVMInstructionArray                             Instructions;                                               // 0x01B0   (0x0010)  
	FRigVMExecuteContext                               Context;                                                    // 0x01C0   (0x0058)  
	TArray<FName>                                      FunctionNamesStorage;                                       // 0x0218   (0x0010)  
	unsigned char                                      UnknownData03_6[0x20];                                      // 0x0228   (0x0020)  MISSED
	TArray<FRigVMParameter>                            Parameters;                                                 // 0x0248   (0x0010)  
	SDK_UNDEFINED(80,472) /* TMap<FName, int32_t> */   __um(ParametersNameMap);                                    // 0x0258   (0x0050)  
	unsigned char                                      UnknownData04_6[0x48];                                      // 0x02A8   (0x0048)  MISSED
	class URigVM*                                      DeferredVMToCopy;                                           // 0x02F0   (0x0008)  


	/// Functions
	// Function /Script/RigVM.RigVM.SetParameterValueVector2D
	// void SetParameterValueVector2D(FName& InParameterName, FVector2D& InValue, int32_t InArrayIndex);                        // [0x5ed9f70] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/RigVM.RigVM.SetParameterValueVector
	// void SetParameterValueVector(FName& InParameterName, FVector& InValue, int32_t InArrayIndex);                            // [0x5eda0a0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/RigVM.RigVM.SetParameterValueTransform
	// void SetParameterValueTransform(FName& InParameterName, FTransform& InValue, int32_t InArrayIndex);                      // [0x5ed9d80] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/RigVM.RigVM.SetParameterValueString
	// void SetParameterValueString(FName& InParameterName, FString InValue, int32_t InArrayIndex);                             // [0x5ed9c50] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/RigVM.RigVM.SetParameterValueQuat
	// void SetParameterValueQuat(FName& InParameterName, FQuat& InValue, int32_t InArrayIndex);                                // [0x5ed9b20] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/RigVM.RigVM.SetParameterValueName
	// void SetParameterValueName(FName& InParameterName, FName& InValue, int32_t InArrayIndex);                                // [0x5ed99f0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/RigVM.RigVM.SetParameterValueInt
	// void SetParameterValueInt(FName& InParameterName, int32_t InValue, int32_t InArrayIndex);                                // [0x5ed98d0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/RigVM.RigVM.SetParameterValueFloat
	// void SetParameterValueFloat(FName& InParameterName, float InValue, int32_t InArrayIndex);                                // [0x5ed97b0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/RigVM.RigVM.SetParameterValueBool
	// void SetParameterValueBool(FName& InParameterName, bool InValue, int32_t InArrayIndex);                                  // [0x5ed9680] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/RigVM.RigVM.GetRigVMFunctionName
	// FString GetRigVMFunctionName(int32_t InFunctionIndex);                                                                   // [0x5ed95a0] Final|Native|Public|Const 
	// Function /Script/RigVM.RigVM.GetParameterValueVector2D
	// FVector2D GetParameterValueVector2D(FName& InParameterName, int32_t InArrayIndex);                                       // [0x5ed9390] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/RigVM.RigVM.GetParameterValueVector
	// FVector GetParameterValueVector(FName& InParameterName, int32_t InArrayIndex);                                           // [0x5ed9480] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/RigVM.RigVM.GetParameterValueTransform
	// FTransform GetParameterValueTransform(FName& InParameterName, int32_t InArrayIndex);                                     // [0x5ed91a0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/RigVM.RigVM.GetParameterValueString
	// FString GetParameterValueString(FName& InParameterName, int32_t InArrayIndex);                                           // [0x5ed8f80] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/RigVM.RigVM.GetParameterValueQuat
	// FQuat GetParameterValueQuat(FName& InParameterName, int32_t InArrayIndex);                                               // [0x5ed8e70] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/RigVM.RigVM.GetParameterValueName
	// FName GetParameterValueName(FName& InParameterName, int32_t InArrayIndex);                                               // [0x5ed8d80] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/RigVM.RigVM.GetParameterValueInt
	// int32_t GetParameterValueInt(FName& InParameterName, int32_t InArrayIndex);                                              // [0x5ed8c90] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/RigVM.RigVM.GetParameterValueFloat
	// float GetParameterValueFloat(FName& InParameterName, int32_t InArrayIndex);                                              // [0x5ed8ba0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/RigVM.RigVM.GetParameterValueBool
	// bool GetParameterValueBool(FName& InParameterName, int32_t InArrayIndex);                                                // [0x5ed8ab0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/RigVM.RigVM.GetParameterArraySize
	// int32_t GetParameterArraySize(FName& InParameterName);                                                                   // [0x5ed8930] Final|Native|Public|HasOutParms|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/RigVM.RigVM.Execute
	// bool Execute(FName& InEntryName);                                                                                        // [0x5ed8890] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/RigVM.RigVM.AddRigVMFunction
	// int32_t AddRigVMFunction(class UScriptStruct* InRigVMStruct, FName& InMethodName);                                       // [0x5ed87b0] Final|Native|Public|HasOutParms 
};

/// Struct /Script/RigVM.RigVMStruct
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 8 pad: 0x0000
struct FRigVMStruct
{ 
	unsigned char                                      UnknownData00_2[0x8];                                       // 0x0000   (0x0008)  MISSED
};

/// Struct /Script/RigVM.RigVMBaseOp
/// Size: 0x0001 (1 bytes) (0x000000 - 0x000001) align 1 pad: 0x0000
struct FRigVMBaseOp
{ 
	unsigned char                                      UnknownData00_2[0x1];                                       // 0x0000   (0x0001)  MISSED
};

/// Struct /Script/RigVM.RigVMUnaryOp
/// Size: 0x0007 (7 bytes) (0x000001 - 0x000008) align 2 pad: 0x0000
struct FRigVMUnaryOp : FRigVMBaseOp
{ 
	unsigned char                                      UnknownData00_1[0x7];                                       // 0x0001   (0x0007)  MISSED
};

/// Struct /Script/RigVM.RigVMChangeTypeOp
/// Size: 0x0008 (8 bytes) (0x000008 - 0x000010) align 2 pad: 0x0000
struct FRigVMChangeTypeOp : FRigVMUnaryOp
{ 
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0008   (0x0008)  MISSED
};

/// Struct /Script/RigVM.RigVMJumpIfOp
/// Size: 0x0008 (8 bytes) (0x000008 - 0x000010) align 4 pad: 0x0000
struct FRigVMJumpIfOp : FRigVMUnaryOp
{ 
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0008   (0x0008)  MISSED
};

/// Struct /Script/RigVM.RigVMJumpOp
/// Size: 0x0007 (7 bytes) (0x000001 - 0x000008) align 4 pad: 0x0000
struct FRigVMJumpOp : FRigVMBaseOp
{ 
	unsigned char                                      UnknownData00_1[0x7];                                       // 0x0001   (0x0007)  MISSED
};

/// Struct /Script/RigVM.RigVMComparisonOp
/// Size: 0x0013 (19 bytes) (0x000001 - 0x000014) align 2 pad: 0x0000
struct FRigVMComparisonOp : FRigVMBaseOp
{ 
	unsigned char                                      UnknownData00_1[0x13];                                      // 0x0001   (0x0013)  MISSED
};

/// Struct /Script/RigVM.RigVMCopyOp
/// Size: 0x000D (13 bytes) (0x000001 - 0x00000E) align 2 pad: 0x0000
struct FRigVMCopyOp : FRigVMBaseOp
{ 
	unsigned char                                      UnknownData00_1[0xD];                                       // 0x0001   (0x000D)  MISSED
};

/// Struct /Script/RigVM.RigVMBinaryOp
/// Size: 0x000D (13 bytes) (0x000001 - 0x00000E) align 2 pad: 0x0000
struct FRigVMBinaryOp : FRigVMBaseOp
{ 
	unsigned char                                      UnknownData00_1[0xD];                                       // 0x0001   (0x000D)  MISSED
};

/// Struct /Script/RigVM.RigVMExecuteOp
/// Size: 0x0003 (3 bytes) (0x000001 - 0x000004) align 2 pad: 0x0000
struct FRigVMExecuteOp : FRigVMBaseOp
{ 
	unsigned char                                      UnknownData00_1[0x3];                                       // 0x0001   (0x0003)  MISSED
};

/// Struct /Script/RigVM.RigVMSlice
/// Size: 0x000C (12 bytes) (0x000000 - 0x00000C) align 4 pad: 0x0000
struct FRigVMSlice
{ 
	unsigned char                                      UnknownData00_2[0xC];                                       // 0x0000   (0x000C)  MISSED
};

/// Struct /Script/RigVM.RigVMOperand
/// Size: 0x0006 (6 bytes) (0x000000 - 0x000006) align 2 pad: 0x0000
struct FRigVMOperand
{ 
	ERigVMMemoryType                                   MemoryType;                                                 // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x1];                                       // 0x0001   (0x0001)  MISSED
	uint16_t                                           RegisterIndex;                                              // 0x0002   (0x0002)  
	uint16_t                                           RegisterOffset;                                             // 0x0004   (0x0002)  
};

/// Struct /Script/RigVM.RigVMMemoryStatistics
/// Size: 0x000C (12 bytes) (0x000000 - 0x00000C) align 4 pad: 0x0000
struct FRigVMMemoryStatistics
{ 
	uint32_t                                           RegisterCount;                                              // 0x0000   (0x0004)  
	uint32_t                                           DataBytes;                                                  // 0x0004   (0x0004)  
	uint32_t                                           TotalBytes;                                                 // 0x0008   (0x0004)  
};

/// Struct /Script/RigVM.RigVMByteCodeStatistics
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 4 pad: 0x0000
struct FRigVMByteCodeStatistics
{ 
	uint32_t                                           InstructionCount;                                           // 0x0000   (0x0004)  
	uint32_t                                           DataBytes;                                                  // 0x0004   (0x0004)  
};

/// Struct /Script/RigVM.RigVMStatistics
/// Size: 0x002C (44 bytes) (0x000000 - 0x00002C) align 4 pad: 0x0000
struct FRigVMStatistics
{ 
	uint32_t                                           BytesForCDO;                                                // 0x0000   (0x0004)  
	uint32_t                                           BytesPerInstance;                                           // 0x0004   (0x0004)  
	FRigVMMemoryStatistics                             LiteralMemory;                                              // 0x0008   (0x000C)  
	FRigVMMemoryStatistics                             WorkMemory;                                                 // 0x0014   (0x000C)  
	uint32_t                                           BytesForCaching;                                            // 0x0020   (0x0004)  
	FRigVMByteCodeStatistics                           ByteCode;                                                   // 0x0024   (0x0008)  
};

static_assert(sizeof(FRigVMRegister) == 0x0024); // 36 bytes (0x000000 - 0x000024)
static_assert(sizeof(FRigVMRegisterOffset) == 0x0048); // 72 bytes (0x000000 - 0x000048)
static_assert(sizeof(FRigVMMemoryContainer) == 0x00A0); // 160 bytes (0x000000 - 0x0000A0)
static_assert(sizeof(FRigVMByteCodeEntry) == 0x000C); // 12 bytes (0x000000 - 0x00000C)
static_assert(sizeof(FRigVMByteCode) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(sizeof(FRigVMInstruction) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FRigVMInstructionArray) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FRigVMExecuteContext) == 0x0058); // 88 bytes (0x000000 - 0x000058)
static_assert(sizeof(FRigVMParameter) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(sizeof(URigVM) == 0x02F8); // 760 bytes (0x000028 - 0x0002F8)
static_assert(sizeof(FRigVMStruct) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(sizeof(FRigVMBaseOp) == 0x0001); // 1 bytes (0x000000 - 0x000001)
static_assert(sizeof(FRigVMUnaryOp) == 0x0008); // 8 bytes (0x000001 - 0x000008)
static_assert(sizeof(FRigVMChangeTypeOp) == 0x0010); // 16 bytes (0x000008 - 0x000010)
static_assert(sizeof(FRigVMJumpIfOp) == 0x0010); // 16 bytes (0x000008 - 0x000010)
static_assert(sizeof(FRigVMJumpOp) == 0x0008); // 8 bytes (0x000001 - 0x000008)
static_assert(sizeof(FRigVMComparisonOp) == 0x0014); // 20 bytes (0x000001 - 0x000014)
static_assert(sizeof(FRigVMCopyOp) == 0x000E); // 14 bytes (0x000001 - 0x00000E)
static_assert(sizeof(FRigVMBinaryOp) == 0x000E); // 14 bytes (0x000001 - 0x00000E)
static_assert(sizeof(FRigVMExecuteOp) == 0x0004); // 4 bytes (0x000001 - 0x000004)
static_assert(sizeof(FRigVMSlice) == 0x000C); // 12 bytes (0x000000 - 0x00000C)
static_assert(sizeof(FRigVMOperand) == 0x0006); // 6 bytes (0x000000 - 0x000006)
static_assert(sizeof(FRigVMMemoryStatistics) == 0x000C); // 12 bytes (0x000000 - 0x00000C)
static_assert(sizeof(FRigVMByteCodeStatistics) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(sizeof(FRigVMStatistics) == 0x002C); // 44 bytes (0x000000 - 0x00002C)
static_assert(offsetof(FRigVMRegister, Type) == 0x0000);
static_assert(offsetof(FRigVMRegister, Name) == 0x0014);
static_assert(offsetof(FRigVMRegisterOffset, Segments) == 0x0000);
static_assert(offsetof(FRigVMRegisterOffset, Type) == 0x0010);
static_assert(offsetof(FRigVMRegisterOffset, CPPType) == 0x0014);
static_assert(offsetof(FRigVMRegisterOffset, ScriptStruct) == 0x0020);
static_assert(offsetof(FRigVMRegisterOffset, ParentScriptStruct) == 0x0028);
static_assert(offsetof(FRigVMRegisterOffset, CachedSegmentPath) == 0x0038);
static_assert(offsetof(FRigVMMemoryContainer, MemoryType) == 0x0001);
static_assert(offsetof(FRigVMMemoryContainer, Registers) == 0x0008);
static_assert(offsetof(FRigVMMemoryContainer, RegisterOffsets) == 0x0018);
static_assert(offsetof(FRigVMMemoryContainer, Data) == 0x0028);
static_assert(offsetof(FRigVMMemoryContainer, ScriptStructs) == 0x0038);
static_assert(offsetof(FRigVMByteCodeEntry, Name) == 0x0000);
static_assert(offsetof(FRigVMByteCode, ByteCode) == 0x0000);
static_assert(offsetof(FRigVMByteCode, Entries) == 0x0018);
static_assert(offsetof(FRigVMInstruction, OpCode) == 0x0008);
static_assert(offsetof(FRigVMInstructionArray, Instructions) == 0x0000);
static_assert(offsetof(FRigVMParameter, Type) == 0x0000);
static_assert(offsetof(FRigVMParameter, Name) == 0x0004);
static_assert(offsetof(FRigVMParameter, CPPType) == 0x0010);
static_assert(offsetof(FRigVMParameter, ScriptStruct) == 0x0020);
static_assert(offsetof(FRigVMParameter, ScriptStructPath) == 0x0028);
static_assert(offsetof(URigVM, WorkMemoryStorage) == 0x0028);
static_assert(offsetof(URigVM, LiteralMemoryStorage) == 0x00D0);
static_assert(offsetof(URigVM, ByteCodeStorage) == 0x0178);
static_assert(offsetof(URigVM, Instructions) == 0x01B0);
static_assert(offsetof(URigVM, Context) == 0x01C0);
static_assert(offsetof(URigVM, FunctionNamesStorage) == 0x0218);
static_assert(offsetof(URigVM, Parameters) == 0x0248);
static_assert(offsetof(URigVM, DeferredVMToCopy) == 0x02F0);
static_assert(offsetof(FRigVMOperand, MemoryType) == 0x0000);
static_assert(offsetof(FRigVMStatistics, LiteralMemory) == 0x0008);
static_assert(offsetof(FRigVMStatistics, WorkMemory) == 0x0014);
static_assert(offsetof(FRigVMStatistics, ByteCode) == 0x0024);
