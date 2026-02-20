
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: UMG

/// Class /Script/UIParticleSystem.ParticleSystemWidget
/// Size: 0x0030 (48 bytes) (0x000128 - 0x000158) align 8 pad: 0x0000
class UParticleSystemWidget : public UWidget
{ 
public:
	class UParticleSystem*                             ParticleSystemTemplate;                                     // 0x0128   (0x0008)  
	bool                                               bAutoActivate;                                              // 0x0130   (0x0001)  
	bool                                               bReactivate;                                                // 0x0131   (0x0001)  
	unsigned char                                      UnknownData00_6[0x6];                                       // 0x0132   (0x0006)  MISSED
	class UUIParticleComponent*                        WorldParticleComponent;                                     // 0x0138   (0x0008)  
	class AActor*                                      WorldParticleActor;                                         // 0x0140   (0x0008)  
	unsigned char                                      UnknownData01_7[0x10];                                      // 0x0148   (0x0010)  MISSED


	/// Functions
	// Function /Script/UIParticleSystem.ParticleSystemWidget.SetReactivate
	// void SetReactivate(bool bActivateAndReset);                                                                              // [0x1607330] Final|Native|Public|BlueprintCallable 
	// Function /Script/UIParticleSystem.ParticleSystemWidget.GetParticleComponent
	// class UParticleSystemComponent* GetParticleComponent();                                                                  // [0x1607300] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/UIParticleSystem.ParticleSystemWidget.ActivateParticles
	// void ActivateParticles(bool bActive, bool bReset);                                                                       // [0x1607230] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/UIParticleSystem.UIParticleComponent
/// Size: 0x0000 (0 bytes) (0x000840 - 0x000840) align 16 pad: 0x0000
class UUIParticleComponent : public UParticleSystemComponent
{ 
public:
};

/// Class /Script/UIParticleSystem.UIParticleActor
/// Size: 0x0000 (0 bytes) (0x0002E0 - 0x0002E0) align 8 pad: 0x0000
class AUIParticleActor : public AActor
{ 
public:
};

static_assert(sizeof(UParticleSystemWidget) == 0x0158); // 344 bytes (0x000128 - 0x000158)
static_assert(sizeof(UUIParticleComponent) == 0x0840); // 2112 bytes (0x000840 - 0x000840)
static_assert(sizeof(AUIParticleActor) == 0x02E0); // 736 bytes (0x0002E0 - 0x0002E0)
static_assert(offsetof(UParticleSystemWidget, ParticleSystemTemplate) == 0x0128);
static_assert(offsetof(UParticleSystemWidget, WorldParticleComponent) == 0x0138);
static_assert(offsetof(UParticleSystemWidget, WorldParticleActor) == 0x0140);
