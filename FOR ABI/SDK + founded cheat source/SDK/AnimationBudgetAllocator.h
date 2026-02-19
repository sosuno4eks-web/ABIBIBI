
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Class /Script/AnimationBudgetAllocator.AnimationBudgetBlueprintLibrary
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UAnimationBudgetBlueprintLibrary : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/AnimationBudgetAllocator.AnimationBudgetBlueprintLibrary.SetAnimationBudgetParameters
	// void SetAnimationBudgetParameters(class UObject* WorldContextObject, FAnimationBudgetAllocatorParameters& InParameters); // [0x1601c10] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AnimationBudgetAllocator.AnimationBudgetBlueprintLibrary.EnableAnimationBudget
	// void EnableAnimationBudget(class UObject* WorldContextObject, bool bEnabled);                                            // [0x1601b50] Final|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/AnimationBudgetAllocator.SkeletalMeshComponentBudgeted
/// Size: 0x0030 (48 bytes) (0x001100 - 0x001130) align 16 pad: 0x0000
class USkeletalMeshComponentBudgeted : public USkeletalMeshComponent
{ 
public:
	unsigned char                                      UnknownData00_3[0x18];                                      // 0x1100   (0x0018)  MISSED
	bool                                               bAutoRegisterWithBudgetAllocator : 1;                       // 0x1118:0 (0x0001)  
	bool                                               bAutoCalculateSignificance : 1;                             // 0x1118:1 (0x0001)  
	bool                                               bShouldUseActorRenderedFlag : 1;                            // 0x1118:2 (0x0001)  
	unsigned char                                      UnknownData01_5[0x7];                                       // 0x1119   (0x0007)  MISSED
	TArray<float>                                      BaseVisibleDistanceFactorThesholds;                         // 0x1120   (0x0010)  


	/// Functions
	// Function /Script/AnimationBudgetAllocator.SkeletalMeshComponentBudgeted.SetAutoRegisterWithBudgetAllocator
	// void SetAutoRegisterWithBudgetAllocator(bool bInAutoRegisterWithBudgetAllocator);                                        // [0x1601d60] Final|Native|Public|BlueprintCallable 
};

/// Struct /Script/AnimationBudgetAllocator.AnimationBudgetAllocatorParameters
/// Size: 0x0050 (80 bytes) (0x000000 - 0x000050) align 4 pad: 0x0000
struct FAnimationBudgetAllocatorParameters
{ 
	float                                              BudgetInMs;                                                 // 0x0000   (0x0004)  
	float                                              MinQuality;                                                 // 0x0004   (0x0004)  
	int32_t                                            MaxTickRate;                                                // 0x0008   (0x0004)  
	float                                              WorkUnitSmoothingSpeed;                                     // 0x000C   (0x0004)  
	float                                              AlwaysTickFalloffAggression;                                // 0x0010   (0x0004)  
	float                                              InterpolationFalloffAggression;                             // 0x0014   (0x0004)  
	int32_t                                            InterpolationMaxRate;                                       // 0x0018   (0x0004)  
	int32_t                                            MaxInterpolatedComponents;                                  // 0x001C   (0x0004)  
	float                                              InterpolationTickMultiplier;                                // 0x0020   (0x0004)  
	float                                              InitialEstimatedWorkUnitTimeMs;                             // 0x0024   (0x0004)  
	int32_t                                            MaxTickedOffsreenComponents;                                // 0x0028   (0x0004)  
	int32_t                                            StateChangeThrottleInFrames;                                // 0x002C   (0x0004)  
	float                                              BudgetFactorBeforeReducedWork;                              // 0x0030   (0x0004)  
	float                                              BudgetFactorBeforeReducedWorkEpsilon;                       // 0x0034   (0x0004)  
	float                                              BudgetPressureSmoothingSpeed;                               // 0x0038   (0x0004)  
	int32_t                                            ReducedWorkThrottleMinInFrames;                             // 0x003C   (0x0004)  
	int32_t                                            ReducedWorkThrottleMaxInFrames;                             // 0x0040   (0x0004)  
	float                                              BudgetFactorBeforeAggressiveReducedWork;                    // 0x0044   (0x0004)  
	int32_t                                            ReducedWorkThrottleMaxPerFrame;                             // 0x0048   (0x0004)  
	float                                              BudgetPressureBeforeEmergencyReducedWork;                   // 0x004C   (0x0004)  
};

static_assert(sizeof(UAnimationBudgetBlueprintLibrary) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(USkeletalMeshComponentBudgeted) == 0x1130); // 4400 bytes (0x001100 - 0x001130)
static_assert(sizeof(FAnimationBudgetAllocatorParameters) == 0x0050); // 80 bytes (0x000000 - 0x000050)
static_assert(offsetof(USkeletalMeshComponentBudgeted, BaseVisibleDistanceFactorThesholds) == 0x1120);
