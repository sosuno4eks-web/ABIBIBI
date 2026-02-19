
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: Chaos
/// dependency: CoreUObject
/// dependency: Engine

/// Class /Script/FieldSystemEngine.FieldSystemActor
/// Size: 0x0008 (8 bytes) (0x0002E0 - 0x0002E8) align 8 pad: 0x0000
class AFieldSystemActor : public AActor
{ 
public:
	class UFieldSystemComponent*                       FieldSystemComponent;                                       // 0x02E0   (0x0008)  
};

/// Class /Script/FieldSystemEngine.FieldSystem
/// Size: 0x0010 (16 bytes) (0x000028 - 0x000038) align 8 pad: 0x0000
class UFieldSystem : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x10];                                      // 0x0028   (0x0010)  MISSED
};

/// Class /Script/FieldSystemEngine.FieldSystemComponent
/// Size: 0x0038 (56 bytes) (0x0005D8 - 0x000610) align 16 pad: 0x0000
class UFieldSystemComponent : public UPrimitiveComponent
{ 
public:
	class UFieldSystem*                                FieldSystem;                                                // 0x05D8   (0x0008)  
	unsigned char                                      UnknownData00_6[0x10];                                      // 0x05E0   (0x0010)  MISSED
	SDK_UNDEFINED(16,2218) /* TArray<TWeakObjectPtr<AChaosSolverActor*>> */ __um(SupportedSolvers);                // 0x05F0   (0x0010)  
	unsigned char                                      UnknownData01_7[0x10];                                      // 0x0600   (0x0010)  MISSED


	/// Functions
	// Function /Script/FieldSystemEngine.FieldSystemComponent.ResetFieldSystem
	// void ResetFieldSystem();                                                                                                 // [0x5ea5b00] Final|Native|Public|BlueprintCallable 
	// Function /Script/FieldSystemEngine.FieldSystemComponent.ApplyUniformVectorFalloffForce
	// void ApplyUniformVectorFalloffForce(bool Enabled, FVector position, FVector Direction, float Radius, float Magnitude);   // [0x5ea5940] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/FieldSystemEngine.FieldSystemComponent.ApplyStrainField
	// void ApplyStrainField(bool Enabled, FVector position, float Radius, float Magnitude, int32_t Iterations);                // [0x5ea5770] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/FieldSystemEngine.FieldSystemComponent.ApplyStayDynamicField
	// void ApplyStayDynamicField(bool Enabled, FVector position, float Radius);                                                // [0x5ea5650] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/FieldSystemEngine.FieldSystemComponent.ApplyRadialVectorFalloffForce
	// void ApplyRadialVectorFalloffForce(bool Enabled, FVector position, float Radius, float Magnitude);                       // [0x5ea54c0] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/FieldSystemEngine.FieldSystemComponent.ApplyRadialForce
	// void ApplyRadialForce(bool Enabled, FVector position, float Magnitude);                                                  // [0x5ea53a0] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/FieldSystemEngine.FieldSystemComponent.ApplyPhysicsField
	// void ApplyPhysicsField(bool Enabled, TEnumAsByte<EFieldPhysicsType> Target, class UFieldSystemMetaData* MetaData, class UFieldNodeBase* Field); // [0x5ea5240] Final|Native|Public|BlueprintCallable 
	// Function /Script/FieldSystemEngine.FieldSystemComponent.ApplyLinearForce
	// void ApplyLinearForce(bool Enabled, FVector Direction, float Magnitude);                                                 // [0x5ea5120] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/FieldSystemEngine.FieldSystemComponent.AddFieldCommand
	// void AddFieldCommand(bool Enabled, TEnumAsByte<EFieldPhysicsType> Target, class UFieldSystemMetaData* MetaData, class UFieldNodeBase* Field); // [0x5ea4fc0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/FieldSystemEngine.FieldSystemMetaData
/// Size: 0x0000 (0 bytes) (0x0000F8 - 0x0000F8) align 8 pad: 0x0000
class UFieldSystemMetaData : public UActorComponent
{ 
public:
};

/// Class /Script/FieldSystemEngine.FieldSystemMetaDataIteration
/// Size: 0x0008 (8 bytes) (0x0000F8 - 0x000100) align 8 pad: 0x0000
class UFieldSystemMetaDataIteration : public UFieldSystemMetaData
{ 
public:
	int32_t                                            Iterations;                                                 // 0x00F8   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x00FC   (0x0004)  MISSED


	/// Functions
	// Function /Script/FieldSystemEngine.FieldSystemMetaDataIteration.SetMetaDataIteration
	// class UFieldSystemMetaDataIteration* SetMetaDataIteration(int32_t Iterations);                                           // [0x5ea5e80] Final|Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/FieldSystemEngine.FieldSystemMetaDataProcessingResolution
/// Size: 0x0008 (8 bytes) (0x0000F8 - 0x000100) align 8 pad: 0x0000
class UFieldSystemMetaDataProcessingResolution : public UFieldSystemMetaData
{ 
public:
	TEnumAsByte<EFieldResolutionType>                  ResolutionType;                                             // 0x00F8   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x00F9   (0x0007)  MISSED


	/// Functions
	// Function /Script/FieldSystemEngine.FieldSystemMetaDataProcessingResolution.SetMetaDataaProcessingResolutionType
	// class UFieldSystemMetaDataProcessingResolution* SetMetaDataaProcessingResolutionType(TEnumAsByte<EFieldResolutionType> ResolutionType); // [0x5ea5f20] Final|Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/FieldSystemEngine.FieldNodeBase
/// Size: 0x0000 (0 bytes) (0x0000F8 - 0x0000F8) align 8 pad: 0x0000
class UFieldNodeBase : public UActorComponent
{ 
public:
};

/// Class /Script/FieldSystemEngine.FieldNodeInt
/// Size: 0x0000 (0 bytes) (0x0000F8 - 0x0000F8) align 8 pad: 0x0000
class UFieldNodeInt : public UFieldNodeBase
{ 
public:
};

/// Class /Script/FieldSystemEngine.FieldNodeFloat
/// Size: 0x0000 (0 bytes) (0x0000F8 - 0x0000F8) align 8 pad: 0x0000
class UFieldNodeFloat : public UFieldNodeBase
{ 
public:
};

/// Class /Script/FieldSystemEngine.FieldNodeVector
/// Size: 0x0000 (0 bytes) (0x0000F8 - 0x0000F8) align 8 pad: 0x0000
class UFieldNodeVector : public UFieldNodeBase
{ 
public:
};

/// Class /Script/FieldSystemEngine.UniformInteger
/// Size: 0x0008 (8 bytes) (0x0000F8 - 0x000100) align 8 pad: 0x0000
class UUniformInteger : public UFieldNodeInt
{ 
public:
	int32_t                                            Magnitude;                                                  // 0x00F8   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x00FC   (0x0004)  MISSED


	/// Functions
	// Function /Script/FieldSystemEngine.UniformInteger.SetUniformInteger
	// class UUniformInteger* SetUniformInteger(int32_t Magnitude);                                                             // [0x5ea5e80] Final|Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/FieldSystemEngine.RadialIntMask
/// Size: 0x0020 (32 bytes) (0x0000F8 - 0x000118) align 8 pad: 0x0000
class URadialIntMask : public UFieldNodeInt
{ 
public:
	float                                              Radius;                                                     // 0x00F8   (0x0004)  
	FVector                                            position;                                                   // 0x00FC   (0x000C)  
	int32_t                                            InteriorValue;                                              // 0x0108   (0x0004)  
	int32_t                                            ExteriorValue;                                              // 0x010C   (0x0004)  
	TEnumAsByte<ESetMaskConditionType>                 SetMaskCondition;                                           // 0x0110   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0111   (0x0007)  MISSED


	/// Functions
	// Function /Script/FieldSystemEngine.RadialIntMask.SetRadialIntMask
	// class URadialIntMask* SetRadialIntMask(float Radius, FVector position, int32_t InteriorValue, int32_t ExteriorValue, TEnumAsByte<ESetMaskConditionType> SetMaskConditionIn); // [0x5ea6790] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure 
};

/// Class /Script/FieldSystemEngine.UniformScalar
/// Size: 0x0008 (8 bytes) (0x0000F8 - 0x000100) align 8 pad: 0x0000
class UUniformScalar : public UFieldNodeFloat
{ 
public:
	float                                              Magnitude;                                                  // 0x00F8   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x00FC   (0x0004)  MISSED


	/// Functions
	// Function /Script/FieldSystemEngine.UniformScalar.SetUniformScalar
	// class UUniformScalar* SetUniformScalar(float Magnitude);                                                                 // [0x5ea6a60] Final|Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/FieldSystemEngine.RadialFalloff
/// Size: 0x0028 (40 bytes) (0x0000F8 - 0x000120) align 8 pad: 0x0000
class URadialFalloff : public UFieldNodeFloat
{ 
public:
	float                                              Magnitude;                                                  // 0x00F8   (0x0004)  
	float                                              MinRange;                                                   // 0x00FC   (0x0004)  
	float                                              MaxRange;                                                   // 0x0100   (0x0004)  
	float                                              Default;                                                    // 0x0104   (0x0004)  
	float                                              Radius;                                                     // 0x0108   (0x0004)  
	FVector                                            position;                                                   // 0x010C   (0x000C)  
	TEnumAsByte<EFieldFalloffType>                     Falloff;                                                    // 0x0118   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0119   (0x0007)  MISSED


	/// Functions
	// Function /Script/FieldSystemEngine.RadialFalloff.SetRadialFalloff
	// class URadialFalloff* SetRadialFalloff(float Magnitude, float MinRange, float MaxRange, float Default, float Radius, FVector position, TEnumAsByte<EFieldFalloffType> Falloff); // [0x5ea6540] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure 
};

/// Class /Script/FieldSystemEngine.PlaneFalloff
/// Size: 0x0030 (48 bytes) (0x0000F8 - 0x000128) align 8 pad: 0x0000
class UPlaneFalloff : public UFieldNodeFloat
{ 
public:
	float                                              Magnitude;                                                  // 0x00F8   (0x0004)  
	float                                              MinRange;                                                   // 0x00FC   (0x0004)  
	float                                              MaxRange;                                                   // 0x0100   (0x0004)  
	float                                              Default;                                                    // 0x0104   (0x0004)  
	float                                              Distance;                                                   // 0x0108   (0x0004)  
	FVector                                            position;                                                   // 0x010C   (0x000C)  
	FVector                                            Normal;                                                     // 0x0118   (0x000C)  
	TEnumAsByte<EFieldFalloffType>                     Falloff;                                                    // 0x0124   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x0125   (0x0003)  MISSED


	/// Functions
	// Function /Script/FieldSystemEngine.PlaneFalloff.SetPlaneFalloff
	// class UPlaneFalloff* SetPlaneFalloff(float Magnitude, float MinRange, float MaxRange, float Default, float Distance, FVector position, FVector Normal, TEnumAsByte<EFieldFalloffType> Falloff); // [0x5ea62a0] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure 
};

/// Class /Script/FieldSystemEngine.BoxFalloff
/// Size: 0x0058 (88 bytes) (0x0000F8 - 0x000150) align 16 pad: 0x0000
class UBoxFalloff : public UFieldNodeFloat
{ 
public:
	float                                              Magnitude;                                                  // 0x00F8   (0x0004)  
	float                                              MinRange;                                                   // 0x00FC   (0x0004)  
	float                                              MaxRange;                                                   // 0x0100   (0x0004)  
	float                                              Default;                                                    // 0x0104   (0x0004)  
	unsigned char                                      UnknownData00_6[0x8];                                       // 0x0108   (0x0008)  MISSED
	FTransform                                         Transform;                                                  // 0x0110   (0x0030)  
	TEnumAsByte<EFieldFalloffType>                     Falloff;                                                    // 0x0140   (0x0001)  
	unsigned char                                      UnknownData01_7[0xF];                                       // 0x0141   (0x000F)  MISSED


	/// Functions
	// Function /Script/FieldSystemEngine.BoxFalloff.SetBoxFalloff
	// class UBoxFalloff* SetBoxFalloff(float Magnitude, float MinRange, float MaxRange, float Default, FTransform Transform, TEnumAsByte<EFieldFalloffType> Falloff); // [0x5ea5b20] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure 
};

/// Class /Script/FieldSystemEngine.NoiseField
/// Size: 0x0038 (56 bytes) (0x0000F8 - 0x000130) align 16 pad: 0x0000
class UNoiseField : public UFieldNodeFloat
{ 
public:
	float                                              MinRange;                                                   // 0x00F8   (0x0004)  
	float                                              MaxRange;                                                   // 0x00FC   (0x0004)  
	FTransform                                         Transform;                                                  // 0x0100   (0x0030)  


	/// Functions
	// Function /Script/FieldSystemEngine.NoiseField.SetNoiseField
	// class UNoiseField* SetNoiseField(float MinRange, float MaxRange, FTransform Transform);                                  // [0x5ea5fb0] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure 
};

/// Class /Script/FieldSystemEngine.UniformVector
/// Size: 0x0010 (16 bytes) (0x0000F8 - 0x000108) align 8 pad: 0x0000
class UUniformVector : public UFieldNodeVector
{ 
public:
	float                                              Magnitude;                                                  // 0x00F8   (0x0004)  
	FVector                                            Direction;                                                  // 0x00FC   (0x000C)  


	/// Functions
	// Function /Script/FieldSystemEngine.UniformVector.SetUniformVector
	// class UUniformVector* SetUniformVector(float Magnitude, FVector Direction);                                              // [0x5ea6970] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure 
};

/// Class /Script/FieldSystemEngine.RadialVector
/// Size: 0x0010 (16 bytes) (0x0000F8 - 0x000108) align 8 pad: 0x0000
class URadialVector : public UFieldNodeVector
{ 
public:
	float                                              Magnitude;                                                  // 0x00F8   (0x0004)  
	FVector                                            position;                                                   // 0x00FC   (0x000C)  


	/// Functions
	// Function /Script/FieldSystemEngine.RadialVector.SetRadialVector
	// class URadialVector* SetRadialVector(float Magnitude, FVector position);                                                 // [0x5ea6970] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure 
};

/// Class /Script/FieldSystemEngine.RandomVector
/// Size: 0x0008 (8 bytes) (0x0000F8 - 0x000100) align 8 pad: 0x0000
class URandomVector : public UFieldNodeVector
{ 
public:
	float                                              Magnitude;                                                  // 0x00F8   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x00FC   (0x0004)  MISSED


	/// Functions
	// Function /Script/FieldSystemEngine.RandomVector.SetRandomVector
	// class URandomVector* SetRandomVector(float Magnitude);                                                                   // [0x5ea6a60] Final|Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/FieldSystemEngine.OperatorField
/// Size: 0x0020 (32 bytes) (0x0000F8 - 0x000118) align 8 pad: 0x0000
class UOperatorField : public UFieldNodeBase
{ 
public:
	float                                              Magnitude;                                                  // 0x00F8   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x00FC   (0x0004)  MISSED
	class UFieldNodeBase*                              RightField;                                                 // 0x0100   (0x0008)  
	class UFieldNodeBase*                              LeftField;                                                  // 0x0108   (0x0008)  
	TEnumAsByte<EFieldOperationType>                   Operation;                                                  // 0x0110   (0x0001)  
	unsigned char                                      UnknownData01_7[0x7];                                       // 0x0111   (0x0007)  MISSED


	/// Functions
	// Function /Script/FieldSystemEngine.OperatorField.SetOperatorField
	// class UOperatorField* SetOperatorField(float Magnitude, class UFieldNodeBase* RightField, class UFieldNodeBase* LeftField, TEnumAsByte<EFieldOperationType> Operation); // [0x5ea6140] Final|Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/FieldSystemEngine.ToIntegerField
/// Size: 0x0008 (8 bytes) (0x0000F8 - 0x000100) align 8 pad: 0x0000
class UToIntegerField : public UFieldNodeInt
{ 
public:
	class UFieldNodeFloat*                             FloatField;                                                 // 0x00F8   (0x0008)  


	/// Functions
	// Function /Script/FieldSystemEngine.ToIntegerField.SetToIntegerField
	// class UToIntegerField* SetToIntegerField(class UFieldNodeFloat* FloatField);                                             // [0x5ea6b20] Final|Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/FieldSystemEngine.ToFloatField
/// Size: 0x0008 (8 bytes) (0x0000F8 - 0x000100) align 8 pad: 0x0000
class UToFloatField : public UFieldNodeFloat
{ 
public:
	class UFieldNodeInt*                               IntField;                                                   // 0x00F8   (0x0008)  


	/// Functions
	// Function /Script/FieldSystemEngine.ToFloatField.SetToFloatField
	// class UToFloatField* SetToFloatField(class UFieldNodeInt* IntegerField);                                                 // [0x5ea6b20] Final|Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/FieldSystemEngine.CullingField
/// Size: 0x0018 (24 bytes) (0x0000F8 - 0x000110) align 8 pad: 0x0000
class UCullingField : public UFieldNodeBase
{ 
public:
	class UFieldNodeBase*                              Culling;                                                    // 0x00F8   (0x0008)  
	class UFieldNodeBase*                              Field;                                                      // 0x0100   (0x0008)  
	TEnumAsByte<EFieldCullingOperationType>            Operation;                                                  // 0x0108   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0109   (0x0007)  MISSED


	/// Functions
	// Function /Script/FieldSystemEngine.CullingField.SetCullingField
	// class UCullingField* SetCullingField(class UFieldNodeBase* Culling, class UFieldNodeBase* Field, TEnumAsByte<EFieldCullingOperationType> Operation); // [0x5ea5d70] Final|Native|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/FieldSystemEngine.ReturnResultsTerminal
/// Size: 0x0000 (0 bytes) (0x0000F8 - 0x0000F8) align 8 pad: 0x0000
class UReturnResultsTerminal : public UFieldNodeBase
{ 
public:


	/// Functions
	// Function /Script/FieldSystemEngine.ReturnResultsTerminal.SetReturnResultsTerminal
	// class UReturnResultsTerminal* SetReturnResultsTerminal();                                                                // [0x5ea6af0] Final|Native|Public|BlueprintCallable|BlueprintPure 
};

static_assert(sizeof(AFieldSystemActor) == 0x02E8); // 744 bytes (0x0002E0 - 0x0002E8)
static_assert(sizeof(UFieldSystem) == 0x0038); // 56 bytes (0x000028 - 0x000038)
static_assert(sizeof(UFieldSystemComponent) == 0x0610); // 1552 bytes (0x0005D8 - 0x000610)
static_assert(sizeof(UFieldSystemMetaData) == 0x00F8); // 248 bytes (0x0000F8 - 0x0000F8)
static_assert(sizeof(UFieldSystemMetaDataIteration) == 0x0100); // 256 bytes (0x0000F8 - 0x000100)
static_assert(sizeof(UFieldSystemMetaDataProcessingResolution) == 0x0100); // 256 bytes (0x0000F8 - 0x000100)
static_assert(sizeof(UFieldNodeBase) == 0x00F8); // 248 bytes (0x0000F8 - 0x0000F8)
static_assert(sizeof(UFieldNodeInt) == 0x00F8); // 248 bytes (0x0000F8 - 0x0000F8)
static_assert(sizeof(UFieldNodeFloat) == 0x00F8); // 248 bytes (0x0000F8 - 0x0000F8)
static_assert(sizeof(UFieldNodeVector) == 0x00F8); // 248 bytes (0x0000F8 - 0x0000F8)
static_assert(sizeof(UUniformInteger) == 0x0100); // 256 bytes (0x0000F8 - 0x000100)
static_assert(sizeof(URadialIntMask) == 0x0118); // 280 bytes (0x0000F8 - 0x000118)
static_assert(sizeof(UUniformScalar) == 0x0100); // 256 bytes (0x0000F8 - 0x000100)
static_assert(sizeof(URadialFalloff) == 0x0120); // 288 bytes (0x0000F8 - 0x000120)
static_assert(sizeof(UPlaneFalloff) == 0x0128); // 296 bytes (0x0000F8 - 0x000128)
static_assert(sizeof(UBoxFalloff) == 0x0150); // 336 bytes (0x0000F8 - 0x000150)
static_assert(sizeof(UNoiseField) == 0x0130); // 304 bytes (0x0000F8 - 0x000130)
static_assert(sizeof(UUniformVector) == 0x0108); // 264 bytes (0x0000F8 - 0x000108)
static_assert(sizeof(URadialVector) == 0x0108); // 264 bytes (0x0000F8 - 0x000108)
static_assert(sizeof(URandomVector) == 0x0100); // 256 bytes (0x0000F8 - 0x000100)
static_assert(sizeof(UOperatorField) == 0x0118); // 280 bytes (0x0000F8 - 0x000118)
static_assert(sizeof(UToIntegerField) == 0x0100); // 256 bytes (0x0000F8 - 0x000100)
static_assert(sizeof(UToFloatField) == 0x0100); // 256 bytes (0x0000F8 - 0x000100)
static_assert(sizeof(UCullingField) == 0x0110); // 272 bytes (0x0000F8 - 0x000110)
static_assert(sizeof(UReturnResultsTerminal) == 0x00F8); // 248 bytes (0x0000F8 - 0x0000F8)
static_assert(offsetof(AFieldSystemActor, FieldSystemComponent) == 0x02E0);
static_assert(offsetof(UFieldSystemComponent, FieldSystem) == 0x05D8);
static_assert(offsetof(UFieldSystemMetaDataProcessingResolution, ResolutionType) == 0x00F8);
static_assert(offsetof(URadialIntMask, position) == 0x00FC);
static_assert(offsetof(URadialIntMask, SetMaskCondition) == 0x0110);
static_assert(offsetof(URadialFalloff, position) == 0x010C);
static_assert(offsetof(URadialFalloff, Falloff) == 0x0118);
static_assert(offsetof(UPlaneFalloff, position) == 0x010C);
static_assert(offsetof(UPlaneFalloff, Normal) == 0x0118);
static_assert(offsetof(UPlaneFalloff, Falloff) == 0x0124);
static_assert(offsetof(UBoxFalloff, Transform) == 0x0110);
static_assert(offsetof(UBoxFalloff, Falloff) == 0x0140);
static_assert(offsetof(UNoiseField, Transform) == 0x0100);
static_assert(offsetof(UUniformVector, Direction) == 0x00FC);
static_assert(offsetof(URadialVector, position) == 0x00FC);
static_assert(offsetof(UOperatorField, RightField) == 0x0100);
static_assert(offsetof(UOperatorField, LeftField) == 0x0108);
static_assert(offsetof(UOperatorField, Operation) == 0x0110);
static_assert(offsetof(UToIntegerField, FloatField) == 0x00F8);
static_assert(offsetof(UToFloatField, IntField) == 0x00F8);
static_assert(offsetof(UCullingField, Culling) == 0x00F8);
static_assert(offsetof(UCullingField, Field) == 0x0100);
static_assert(offsetof(UCullingField, Operation) == 0x0108);
