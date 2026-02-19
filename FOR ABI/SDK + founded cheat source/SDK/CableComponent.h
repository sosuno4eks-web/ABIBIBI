
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Class /Script/CableComponent.CableActor
/// Size: 0x0008 (8 bytes) (0x0002E0 - 0x0002E8) align 8 pad: 0x0000
class ACableActor : public AActor
{ 
public:
	class UCableComponent*                             CableComponent;                                             // 0x02E0   (0x0008)  
};

/// Class /Script/CableComponent.CableComponent
/// Size: 0x0090 (144 bytes) (0x000610 - 0x0006A0) align 16 pad: 0x0000
class UCableComponent : public UMeshComponent
{ 
public:
	bool                                               bAttachStart;                                               // 0x0610   (0x0001)  
	bool                                               bAttachEnd;                                                 // 0x0611   (0x0001)  
	unsigned char                                      UnknownData00_6[0x6];                                       // 0x0612   (0x0006)  MISSED
	FComponentReference                                AttachEndTo;                                                // 0x0618   (0x0028)  
	FName                                              AttachEndToSocketName;                                      // 0x0640   (0x0008)  
	FVector                                            EndLocation;                                                // 0x0648   (0x000C)  
	float                                              CableLength;                                                // 0x0654   (0x0004)  
	int32_t                                            NumSegments;                                                // 0x0658   (0x0004)  
	float                                              SubstepTime;                                                // 0x065C   (0x0004)  
	int32_t                                            SolverIterations;                                           // 0x0660   (0x0004)  
	bool                                               bEnableStiffness;                                           // 0x0664   (0x0001)  
	bool                                               bUseSubstepping;                                            // 0x0665   (0x0001)  
	bool                                               bSkipCableUpdateWhenNotVisible;                             // 0x0666   (0x0001)  
	bool                                               bSkipCableUpdateWhenNotOwnerRecentlyRendered;               // 0x0667   (0x0001)  
	bool                                               bEnableCollision;                                           // 0x0668   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0669   (0x0003)  MISSED
	float                                              CollisionFriction;                                          // 0x066C   (0x0004)  
	FVector                                            CableForce;                                                 // 0x0670   (0x000C)  
	float                                              CableGravityScale;                                          // 0x067C   (0x0004)  
	float                                              CableWidth;                                                 // 0x0680   (0x0004)  
	int32_t                                            NumSides;                                                   // 0x0684   (0x0004)  
	float                                              TileMaterial;                                               // 0x0688   (0x0004)  
	unsigned char                                      UnknownData02_7[0x14];                                      // 0x068C   (0x0014)  MISSED


	/// Functions
	// Function /Script/CableComponent.CableComponent.SetAttachEndToComponent
	// void SetAttachEndToComponent(class USceneComponent* Component, FName SocketName);                                        // [0x175ff80] Final|Native|Public|BlueprintCallable 
	// Function /Script/CableComponent.CableComponent.SetAttachEndTo
	// void SetAttachEndTo(class AActor* Actor, FName ComponentProperty, FName SocketName);                                     // [0x175fe70] Final|Native|Public|BlueprintCallable 
	// Function /Script/CableComponent.CableComponent.GetCableParticleLocations
	// void GetCableParticleLocations(TArray<FVector>& Locations);                                                              // [0x175fdc0] Final|Native|Public|HasOutParms|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/CableComponent.CableComponent.GetAttachedComponent
	// class USceneComponent* GetAttachedComponent();                                                                           // [0x175fd90] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/CableComponent.CableComponent.GetAttachedActor
	// class AActor* GetAttachedActor();                                                                                        // [0x175fd60] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

static_assert(sizeof(ACableActor) == 0x02E8); // 744 bytes (0x0002E0 - 0x0002E8)
static_assert(sizeof(UCableComponent) == 0x06A0); // 1696 bytes (0x000610 - 0x0006A0)
static_assert(offsetof(ACableActor, CableComponent) == 0x02E0);
static_assert(offsetof(UCableComponent, AttachEndTo) == 0x0618);
static_assert(offsetof(UCableComponent, AttachEndToSocketName) == 0x0640);
static_assert(offsetof(UCableComponent, EndLocation) == 0x0648);
static_assert(offsetof(UCableComponent, CableForce) == 0x0670);
