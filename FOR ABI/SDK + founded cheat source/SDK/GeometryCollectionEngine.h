
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: Chaos
/// dependency: ChaosSolverEngine
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: FieldSystemEngine
/// dependency: PhysicsCore

/// Enum /Script/GeometryCollectionEngine.EChaosBreakingSortMethod
/// Size: 0x01 (1 bytes)
enum class EChaosBreakingSortMethod : uint8_t
{
	EChaosBreakingSortMethod__SortNone                                               = 0,
	EChaosBreakingSortMethod__SortByHighestMass                                      = 1,
	EChaosBreakingSortMethod__SortByHighestSpeed                                     = 2,
	EChaosBreakingSortMethod__SortByNearestFirst                                     = 3,
	EChaosBreakingSortMethod__Count                                                  = 4
};

/// Enum /Script/GeometryCollectionEngine.EChaosCollisionSortMethod
/// Size: 0x01 (1 bytes)
enum class EChaosCollisionSortMethod : uint8_t
{
	EChaosCollisionSortMethod__SortNone                                              = 0,
	EChaosCollisionSortMethod__SortByHighestMass                                     = 1,
	EChaosCollisionSortMethod__SortByHighestSpeed                                    = 2,
	EChaosCollisionSortMethod__SortByHighestImpulse                                  = 3,
	EChaosCollisionSortMethod__SortByNearestFirst                                    = 4,
	EChaosCollisionSortMethod__Count                                                 = 5
};

/// Enum /Script/GeometryCollectionEngine.EChaosTrailingSortMethod
/// Size: 0x01 (1 bytes)
enum class EChaosTrailingSortMethod : uint8_t
{
	EChaosTrailingSortMethod__SortNone                                               = 0,
	EChaosTrailingSortMethod__SortByHighestMass                                      = 1,
	EChaosTrailingSortMethod__SortByHighestSpeed                                     = 2,
	EChaosTrailingSortMethod__SortByNearestFirst                                     = 3,
	EChaosTrailingSortMethod__Count                                                  = 4
};

/// Enum /Script/GeometryCollectionEngine.EGeometryCollectionDebugDrawActorHideGeometry
/// Size: 0x01 (1 bytes)
enum class EGeometryCollectionDebugDrawActorHideGeometry : uint8_t
{
	EGeometryCollectionDebugDrawActorHideGeometry__HideNone                          = 0,
	EGeometryCollectionDebugDrawActorHideGeometry__HideWithCollision                 = 1,
	EGeometryCollectionDebugDrawActorHideGeometry__HideSelected                      = 2,
	EGeometryCollectionDebugDrawActorHideGeometry__HideWholeCollection               = 3,
	EGeometryCollectionDebugDrawActorHideGeometry__HideAll                           = 4
};

/// Enum /Script/GeometryCollectionEngine.ECollectionGroupEnum
/// Size: 0x01 (1 bytes)
enum class ECollectionGroupEnum : uint8_t
{
	ECollectionGroupEnum__Chaos_Traansform                                           = 0,
	ECollectionGroupEnum__Chaos_Max                                                  = 1
};

/// Enum /Script/GeometryCollectionEngine.ECollectionAttributeEnum
/// Size: 0x01 (1 bytes)
enum class ECollectionAttributeEnum : uint8_t
{
	ECollectionAttributeEnum__Chaos_Active                                           = 0,
	ECollectionAttributeEnum__Chaos_DynamicState                                     = 1,
	ECollectionAttributeEnum__Chaos_CollisionGroup                                   = 2,
	ECollectionAttributeEnum__Chaos_Max                                              = 3
};

/// Struct /Script/GeometryCollectionEngine.ChaosCollisionEventRequestSettings
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 4 pad: 0x0000
struct FChaosCollisionEventRequestSettings
{ 
	int32_t                                            MaxNumberResults;                                           // 0x0000   (0x0004)  
	float                                              MinMass;                                                    // 0x0004   (0x0004)  
	float                                              MinSpeed;                                                   // 0x0008   (0x0004)  
	float                                              MinImpulse;                                                 // 0x000C   (0x0004)  
	float                                              MaxDistance;                                                // 0x0010   (0x0004)  
	EChaosCollisionSortMethod                          SortMethod;                                                 // 0x0014   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x0015   (0x0003)  MISSED
};

/// Struct /Script/GeometryCollectionEngine.ChaosBreakingEventRequestSettings
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 4 pad: 0x0000
struct FChaosBreakingEventRequestSettings
{ 
	int32_t                                            MaxNumberOfResults;                                         // 0x0000   (0x0004)  
	float                                              MinRadius;                                                  // 0x0004   (0x0004)  
	float                                              MinSpeed;                                                   // 0x0008   (0x0004)  
	float                                              MinMass;                                                    // 0x000C   (0x0004)  
	float                                              MaxDistance;                                                // 0x0010   (0x0004)  
	EChaosBreakingSortMethod                           SortMethod;                                                 // 0x0014   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x0015   (0x0003)  MISSED
};

/// Struct /Script/GeometryCollectionEngine.ChaosTrailingEventRequestSettings
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 4 pad: 0x0000
struct FChaosTrailingEventRequestSettings
{ 
	int32_t                                            MaxNumberOfResults;                                         // 0x0000   (0x0004)  
	float                                              MinMass;                                                    // 0x0004   (0x0004)  
	float                                              MinSpeed;                                                   // 0x0008   (0x0004)  
	float                                              MinAngularSpeed;                                            // 0x000C   (0x0004)  
	float                                              MaxDistance;                                                // 0x0010   (0x0004)  
	EChaosTrailingSortMethod                           SortMethod;                                                 // 0x0014   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x0015   (0x0003)  MISSED
};

/// Class /Script/GeometryCollectionEngine.ChaosDestructionListener
/// Size: 0x0230 (560 bytes) (0x000220 - 0x000450) align 16 pad: 0x0000
class UChaosDestructionListener : public USceneComponent
{ 
public:
	bool                                               bIsCollisionEventListeningEnabled : 1;                      // 0x0220:0 (0x0001)  
	bool                                               bIsBreakingEventListeningEnabled : 1;                       // 0x0220:1 (0x0001)  
	bool                                               bIsTrailingEventListeningEnabled : 1;                       // 0x0220:2 (0x0001)  
	unsigned char                                      UnknownData00_5[0x3];                                       // 0x0221   (0x0003)  MISSED
	FChaosCollisionEventRequestSettings                CollisionEventRequestSettings;                              // 0x0224   (0x0018)  
	FChaosBreakingEventRequestSettings                 BreakingEventRequestSettings;                               // 0x023C   (0x0018)  
	FChaosTrailingEventRequestSettings                 TrailingEventRequestSettings;                               // 0x0254   (0x0018)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x026C   (0x0004)  MISSED
	SDK_UNDEFINED(80,2219) /* TSet<AChaosSolverActor*> */ __um(ChaosSolverActors);                                 // 0x0270   (0x0050)  
	SDK_UNDEFINED(80,2220) /* TSet<AGeometryCollectionActor*> */ __um(GeometryCollectionActors);                   // 0x02C0   (0x0050)  
	SDK_UNDEFINED(16,2221) /* FMulticastInlineDelegate */ __um(OnCollisionEvents);                                 // 0x0310   (0x0010)  
	SDK_UNDEFINED(16,2222) /* FMulticastInlineDelegate */ __um(OnBreakingEvents);                                  // 0x0320   (0x0010)  
	SDK_UNDEFINED(16,2223) /* FMulticastInlineDelegate */ __um(OnTrailingEvents);                                  // 0x0330   (0x0010)  
	unsigned char                                      UnknownData02_7[0x110];                                     // 0x0340   (0x0110)  MISSED


	/// Functions
	// Function /Script/GeometryCollectionEngine.ChaosDestructionListener.SortTrailingEvents
	// void SortTrailingEvents(TArray<FChaosTrailingEventData>& TrailingEvents, EChaosTrailingSortMethod SortMethod);           // [0x5ec73e0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/GeometryCollectionEngine.ChaosDestructionListener.SortCollisionEvents
	// void SortCollisionEvents(TArray<FChaosCollisionEventData>& CollisionEvents, EChaosCollisionSortMethod SortMethod);       // [0x5ec72e0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/GeometryCollectionEngine.ChaosDestructionListener.SortBreakingEvents
	// void SortBreakingEvents(TArray<FChaosBreakingEventData>& BreakingEvents, EChaosBreakingSortMethod SortMethod);           // [0x5ec71e0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/GeometryCollectionEngine.ChaosDestructionListener.SetTrailingEventRequestSettings
	// void SetTrailingEventRequestSettings(FChaosTrailingEventRequestSettings& InSettings);                                    // [0x5ec7140] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/GeometryCollectionEngine.ChaosDestructionListener.SetTrailingEventEnabled
	// void SetTrailingEventEnabled(bool bIsEnabled);                                                                           // [0x5ec70b0] Final|Native|Public|BlueprintCallable 
	// Function /Script/GeometryCollectionEngine.ChaosDestructionListener.SetCollisionEventRequestSettings
	// void SetCollisionEventRequestSettings(FChaosCollisionEventRequestSettings& InSettings);                                  // [0x5ec6f80] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/GeometryCollectionEngine.ChaosDestructionListener.SetCollisionEventEnabled
	// void SetCollisionEventEnabled(bool bIsEnabled);                                                                          // [0x5ec6ef0] Final|Native|Public|BlueprintCallable 
	// Function /Script/GeometryCollectionEngine.ChaosDestructionListener.SetBreakingEventRequestSettings
	// void SetBreakingEventRequestSettings(FChaosBreakingEventRequestSettings& InSettings);                                    // [0x5ec6e50] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/GeometryCollectionEngine.ChaosDestructionListener.SetBreakingEventEnabled
	// void SetBreakingEventEnabled(bool bIsEnabled);                                                                           // [0x5ec6dc0] Final|Native|Public|BlueprintCallable 
	// Function /Script/GeometryCollectionEngine.ChaosDestructionListener.RemoveGeometryCollectionActor
	// void RemoveGeometryCollectionActor(class AGeometryCollectionActor* GeometryCollectionActor);                             // [0x5ec6d30] Final|Native|Public|BlueprintCallable 
	// Function /Script/GeometryCollectionEngine.ChaosDestructionListener.RemoveChaosSolverActor
	// void RemoveChaosSolverActor(class AChaosSolverActor* ChaosSolverActor);                                                  // [0x19a6d00] Final|Native|Public|BlueprintCallable 
	// Function /Script/GeometryCollectionEngine.ChaosDestructionListener.IsEventListening
	// bool IsEventListening();                                                                                                 // [0x5ec6a40] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/GeometryCollectionEngine.ChaosDestructionListener.AddGeometryCollectionActor
	// void AddGeometryCollectionActor(class AGeometryCollectionActor* GeometryCollectionActor);                                // [0x5ec6750] Final|Native|Public|BlueprintCallable 
	// Function /Script/GeometryCollectionEngine.ChaosDestructionListener.AddChaosSolverActor
	// void AddChaosSolverActor(class AChaosSolverActor* ChaosSolverActor);                                                     // [0x19a6d00] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/GeometryCollectionEngine.GeometryCollectionActor
/// Size: 0x0010 (16 bytes) (0x0002E0 - 0x0002F0) align 8 pad: 0x0000
class AGeometryCollectionActor : public AActor
{ 
public:
	class UGeometryCollectionComponent*                GeometryCollectionComponent;                                // 0x02E0   (0x0008)  
	class UGeometryCollectionDebugDrawComponent*       GeometryCollectionDebugDrawComponent;                       // 0x02E8   (0x0008)  


	/// Functions
	// Function /Script/GeometryCollectionEngine.GeometryCollectionActor.RaycastSingle
	// bool RaycastSingle(FVector Start, FVector End, FHitResult& OutHit);                                                      // [0x5ec6bb0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/GeometryCollectionEngine.GeometryCollectionCache
/// Size: 0x0028 (40 bytes) (0x000028 - 0x000050) align 8 pad: 0x0000
class UGeometryCollectionCache : public UObject
{ 
public:
	FRecordedTransformTrack                            RecordedData;                                               // 0x0028   (0x0010)  
	class UGeometryCollection*                         SupportedCollection;                                        // 0x0038   (0x0008)  
	FGuid                                              CompatibleCollectionState;                                  // 0x0040   (0x0010)  
};

/// Struct /Script/GeometryCollectionEngine.GeomComponentCacheParameters
/// Size: 0x0050 (80 bytes) (0x000000 - 0x000050) align 8 pad: 0x0000
struct FGeomComponentCacheParameters
{ 
	EGeometryCollectionCacheType                       CacheMode;                                                  // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0001   (0x0007)  MISSED
	class UGeometryCollectionCache*                    TargetCache;                                                // 0x0008   (0x0008)  
	float                                              ReverseCacheBeginTime;                                      // 0x0010   (0x0004)  
	bool                                               SaveCollisionData;                                          // 0x0014   (0x0001)  
	bool                                               DoGenerateCollisionData;                                    // 0x0015   (0x0001)  
	unsigned char                                      UnknownData01_6[0x2];                                       // 0x0016   (0x0002)  MISSED
	int32_t                                            CollisionDataSizeMax;                                       // 0x0018   (0x0004)  
	bool                                               DoCollisionDataSpatialHash;                                 // 0x001C   (0x0001)  
	unsigned char                                      UnknownData02_6[0x3];                                       // 0x001D   (0x0003)  MISSED
	float                                              CollisionDataSpatialHashRadius;                             // 0x0020   (0x0004)  
	int32_t                                            MaxCollisionPerCell;                                        // 0x0024   (0x0004)  
	bool                                               SaveBreakingData;                                           // 0x0028   (0x0001)  
	bool                                               DoGenerateBreakingData;                                     // 0x0029   (0x0001)  
	unsigned char                                      UnknownData03_6[0x2];                                       // 0x002A   (0x0002)  MISSED
	int32_t                                            BreakingDataSizeMax;                                        // 0x002C   (0x0004)  
	bool                                               DoBreakingDataSpatialHash;                                  // 0x0030   (0x0001)  
	unsigned char                                      UnknownData04_6[0x3];                                       // 0x0031   (0x0003)  MISSED
	float                                              BreakingDataSpatialHashRadius;                              // 0x0034   (0x0004)  
	int32_t                                            MaxBreakingPerCell;                                         // 0x0038   (0x0004)  
	bool                                               SaveTrailingData;                                           // 0x003C   (0x0001)  
	bool                                               DoGenerateTrailingData;                                     // 0x003D   (0x0001)  
	unsigned char                                      UnknownData05_6[0x2];                                       // 0x003E   (0x0002)  MISSED
	int32_t                                            TrailingDataSizeMax;                                        // 0x0040   (0x0004)  
	float                                              TrailingMinSpeedThreshold;                                  // 0x0044   (0x0004)  
	float                                              TrailingMinVolumeThreshold;                                 // 0x0048   (0x0004)  
	unsigned char                                      UnknownData06_7[0x4];                                       // 0x004C   (0x0004)  MISSED
};

/// Struct /Script/GeometryCollectionEngine.GeometryCollectionRepData
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FGeometryCollectionRepData
{ 
	unsigned char                                      UnknownData00_2[0x18];                                      // 0x0000   (0x0018)  MISSED
};

/// Class /Script/GeometryCollectionEngine.GeometryCollectionComponent
/// Size: 0x0490 (1168 bytes) (0x000610 - 0x000AA0) align 16 pad: 0x0000
class UGeometryCollectionComponent : public UMeshComponent
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0610   (0x0008)  MISSED
	class AChaosSolverActor*                           ChaosSolverActor;                                           // 0x0618   (0x0008)  
	unsigned char                                      UnknownData01_6[0xE0];                                      // 0x0620   (0x00E0)  MISSED
	class UGeometryCollection*                         RestCollection;                                             // 0x0700   (0x0008)  
	TArray<class AFieldSystemActor*>                   InitializationFields;                                       // 0x0708   (0x0010)  
	bool                                               Simulating;                                                 // 0x0718   (0x0001)  
	unsigned char                                      UnknownData02_6[0x7];                                       // 0x0719   (0x0007)  MISSED
	EObjectStateTypeEnum                               ObjectType;                                                 // 0x0720   (0x0001)  
	bool                                               EnableClustering;                                           // 0x0721   (0x0001)  
	unsigned char                                      UnknownData03_6[0x2];                                       // 0x0722   (0x0002)  MISSED
	int32_t                                            ClusterGroupIndex;                                          // 0x0724   (0x0004)  
	int32_t                                            MaxClusterLevel;                                            // 0x0728   (0x0004)  
	unsigned char                                      UnknownData04_6[0x4];                                       // 0x072C   (0x0004)  MISSED
	TArray<float>                                      DamageThreshold;                                            // 0x0730   (0x0010)  
	EClusterConnectionTypeEnum                         ClusterConnectionType;                                      // 0x0740   (0x0001)  
	unsigned char                                      UnknownData05_6[0x3];                                       // 0x0741   (0x0003)  MISSED
	int32_t                                            CollisionGroup;                                             // 0x0744   (0x0004)  
	float                                              CollisionSampleFraction;                                    // 0x0748   (0x0004)  
	float                                              LinearEtherDrag;                                            // 0x074C   (0x0004)  
	float                                              AngularEtherDrag;                                           // 0x0750   (0x0004)  
	unsigned char                                      UnknownData06_6[0x4];                                       // 0x0754   (0x0004)  MISSED
	class UChaosPhysicalMaterial*                      PhysicalMaterial;                                           // 0x0758   (0x0008)  
	EInitialVelocityTypeEnum                           InitialVelocityType;                                        // 0x0760   (0x0001)  
	unsigned char                                      UnknownData07_6[0x3];                                       // 0x0761   (0x0003)  MISSED
	FVector                                            InitialLinearVelocity;                                      // 0x0764   (0x000C)  
	FVector                                            InitialAngularVelocity;                                     // 0x0770   (0x000C)  
	unsigned char                                      UnknownData08_6[0x4];                                       // 0x077C   (0x0004)  MISSED
	class UPhysicalMaterial*                           PhysicalMaterialOverride;                                   // 0x0780   (0x0008)  
	FGeomComponentCacheParameters                      CacheParameters;                                            // 0x0788   (0x0050)  
	SDK_UNDEFINED(16,2224) /* FMulticastInlineDelegate */ __um(NotifyGeometryCollectionPhysicsStateChange);        // 0x07D8   (0x0010)  
	SDK_UNDEFINED(16,2225) /* FMulticastInlineDelegate */ __um(NotifyGeometryCollectionPhysicsLoadingStateChange); // 0x07E8   (0x0010)  
	unsigned char                                      UnknownData09_6[0x18];                                      // 0x07F8   (0x0018)  MISSED
	SDK_UNDEFINED(16,2226) /* FMulticastInlineDelegate */ __um(OnChaosBreakEvent);                                 // 0x0810   (0x0010)  
	float                                              DesiredCacheTime;                                           // 0x0820   (0x0004)  
	bool                                               CachePlayback;                                              // 0x0824   (0x0001)  
	unsigned char                                      UnknownData10_6[0x3];                                       // 0x0825   (0x0003)  MISSED
	SDK_UNDEFINED(16,2227) /* FMulticastInlineDelegate */ __um(OnChaosPhysicsCollision);                           // 0x0828   (0x0010)  
	bool                                               bNotifyBreaks;                                              // 0x0838   (0x0001)  
	bool                                               bNotifyCollisions;                                          // 0x0839   (0x0001)  
	bool                                               bEnableReplication;                                         // 0x083A   (0x0001)  
	bool                                               bEnableAbandonAfterLevel;                                   // 0x083B   (0x0001)  
	int32_t                                            ReplicationAbandonClusterLevel;                             // 0x083C   (0x0004)  
	FGeometryCollectionRepData                         RepData;                                                    // 0x0840   (0x0018)  
	unsigned char                                      UnknownData11_6[0x218];                                     // 0x0858   (0x0218)  MISSED
	class UBodySetup*                                  DummyBodySetup;                                             // 0x0A70   (0x0008)  
	unsigned char                                      UnknownData12_7[0x28];                                      // 0x0A78   (0x0028)  MISSED


	/// Functions
	// Function /Script/GeometryCollectionEngine.GeometryCollectionComponent.SetNotifyBreaks
	// void SetNotifyBreaks(bool bNewNotifyBreaks);                                                                             // [0x5ec7020] Final|Native|Public|BlueprintCallable 
	// Function /Script/GeometryCollectionEngine.GeometryCollectionComponent.ReceivePhysicsCollision
	// void ReceivePhysicsCollision(FChaosPhysicsCollisionInfo& CollisionInfo);                                                 // [0x3a75280] Event|Public|HasOutParms|BlueprintEvent 
	// Function /Script/GeometryCollectionEngine.GeometryCollectionComponent.OnRep_RepData
	// void OnRep_RepData(FGeometryCollectionRepData& OldData);                                                                 // [0x5ec6b00] Final|Native|Protected|HasOutParms 
	// Function /Script/GeometryCollectionEngine.GeometryCollectionComponent.NotifyGeometryCollectionPhysicsStateChange__DelegateSignature
	// void NotifyGeometryCollectionPhysicsStateChange__DelegateSignature(class UGeometryCollectionComponent* FracturedComponent); // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/GeometryCollectionEngine.GeometryCollectionComponent.NotifyGeometryCollectionPhysicsLoadingStateChange__DelegateSignature
	// void NotifyGeometryCollectionPhysicsLoadingStateChange__DelegateSignature(class UGeometryCollectionComponent* FracturedComponent); // [0x3a75280] MulticastDelegate|Public|Delegate 
	// Function /Script/GeometryCollectionEngine.GeometryCollectionComponent.NetAbandonCluster
	// void NetAbandonCluster(int32_t TransformIndex);                                                                          // [0x5ec6a70] Final|Net|NetReliableNative|Event|NetMulticast|Private 
	// Function /Script/GeometryCollectionEngine.GeometryCollectionComponent.ApplyPhysicsField
	// void ApplyPhysicsField(bool Enabled, EGeometryCollectionPhysicsTypeEnum Target, class UFieldSystemMetaData* MetaData, class UFieldNodeBase* Field); // [0x5ec68c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/GeometryCollectionEngine.GeometryCollectionComponent.ApplyKinematicField
	// void ApplyKinematicField(float Radius, FVector position);                                                                // [0x5ec67e0] Final|Native|Public|HasDefaults|BlueprintCallable 
};

/// Struct /Script/GeometryCollectionEngine.GeometryCollectionDebugDrawWarningMessage
/// Size: 0x0001 (1 bytes) (0x000000 - 0x000001) align 1 pad: 0x0000
struct FGeometryCollectionDebugDrawWarningMessage
{ 
	unsigned char                                      UnknownData00_2[0x1];                                       // 0x0000   (0x0001)  MISSED
};

/// Struct /Script/GeometryCollectionEngine.GeometryCollectionDebugDrawActorSelectedRigidBody
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FGeometryCollectionDebugDrawActorSelectedRigidBody
{ 
	int32_t                                            ID;                                                         // 0x0000   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0004   (0x0004)  MISSED
	class AChaosSolverActor*                           Solver;                                                     // 0x0008   (0x0008)  
	class AGeometryCollectionActor*                    GeometryCollection;                                         // 0x0010   (0x0008)  
};

/// Class /Script/GeometryCollectionEngine.GeometryCollectionDebugDrawActor
/// Size: 0x00E8 (232 bytes) (0x0002E0 - 0x0003C8) align 8 pad: 0x0000
class AGeometryCollectionDebugDrawActor : public AActor
{ 
public:
	FGeometryCollectionDebugDrawWarningMessage         WarningMessage;                                             // 0x02E0   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x02E1   (0x0007)  MISSED
	FGeometryCollectionDebugDrawActorSelectedRigidBody SelectedRigidBody;                                          // 0x02E8   (0x0018)  
	bool                                               bDebugDrawWholeCollection;                                  // 0x0300   (0x0001)  
	bool                                               bDebugDrawHierarchy;                                        // 0x0301   (0x0001)  
	bool                                               bDebugDrawClustering;                                       // 0x0302   (0x0001)  
	EGeometryCollectionDebugDrawActorHideGeometry      HideGeometry;                                               // 0x0303   (0x0001)  
	bool                                               bShowRigidBodyId;                                           // 0x0304   (0x0001)  
	bool                                               bShowRigidBodyCollision;                                    // 0x0305   (0x0001)  
	bool                                               bCollisionAtOrigin;                                         // 0x0306   (0x0001)  
	bool                                               bShowRigidBodyTransform;                                    // 0x0307   (0x0001)  
	bool                                               bShowRigidBodyInertia;                                      // 0x0308   (0x0001)  
	bool                                               bShowRigidBodyVelocity;                                     // 0x0309   (0x0001)  
	bool                                               bShowRigidBodyForce;                                        // 0x030A   (0x0001)  
	bool                                               bShowRigidBodyInfos;                                        // 0x030B   (0x0001)  
	bool                                               bShowTransformIndex;                                        // 0x030C   (0x0001)  
	bool                                               bShowTransform;                                             // 0x030D   (0x0001)  
	bool                                               bShowParent;                                                // 0x030E   (0x0001)  
	bool                                               bShowLevel;                                                 // 0x030F   (0x0001)  
	bool                                               bShowConnectivityEdges;                                     // 0x0310   (0x0001)  
	bool                                               bShowGeometryIndex;                                         // 0x0311   (0x0001)  
	bool                                               bShowGeometryTransform;                                     // 0x0312   (0x0001)  
	bool                                               bShowBoundingBox;                                           // 0x0313   (0x0001)  
	bool                                               bShowFaces;                                                 // 0x0314   (0x0001)  
	bool                                               bShowFaceIndices;                                           // 0x0315   (0x0001)  
	bool                                               bShowFaceNormals;                                           // 0x0316   (0x0001)  
	bool                                               bShowSingleFace;                                            // 0x0317   (0x0001)  
	int32_t                                            SingleFaceIndex;                                            // 0x0318   (0x0004)  
	bool                                               bShowVertices;                                              // 0x031C   (0x0001)  
	bool                                               bShowVertexIndices;                                         // 0x031D   (0x0001)  
	bool                                               bShowVertexNormals;                                         // 0x031E   (0x0001)  
	bool                                               bUseActiveVisualization;                                    // 0x031F   (0x0001)  
	float                                              PointThickness;                                             // 0x0320   (0x0004)  
	float                                              LineThickness;                                              // 0x0324   (0x0004)  
	bool                                               bTextShadow;                                                // 0x0328   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0329   (0x0003)  MISSED
	float                                              TextScale;                                                  // 0x032C   (0x0004)  
	float                                              NormalScale;                                                // 0x0330   (0x0004)  
	float                                              AxisScale;                                                  // 0x0334   (0x0004)  
	float                                              ArrowScale;                                                 // 0x0338   (0x0004)  
	FColor                                             RigidBodyIdColor;                                           // 0x033C   (0x0004)  
	float                                              RigidBodyTransformScale;                                    // 0x0340   (0x0004)  
	FColor                                             RigidBodyCollisionColor;                                    // 0x0344   (0x0004)  
	FColor                                             RigidBodyInertiaColor;                                      // 0x0348   (0x0004)  
	FColor                                             RigidBodyVelocityColor;                                     // 0x034C   (0x0004)  
	FColor                                             RigidBodyForceColor;                                        // 0x0350   (0x0004)  
	FColor                                             RigidBodyInfoColor;                                         // 0x0354   (0x0004)  
	FColor                                             TransformIndexColor;                                        // 0x0358   (0x0004)  
	float                                              TransformScale;                                             // 0x035C   (0x0004)  
	FColor                                             LevelColor;                                                 // 0x0360   (0x0004)  
	FColor                                             ParentColor;                                                // 0x0364   (0x0004)  
	float                                              ConnectivityEdgeThickness;                                  // 0x0368   (0x0004)  
	FColor                                             GeometryIndexColor;                                         // 0x036C   (0x0004)  
	float                                              GeometryTransformScale;                                     // 0x0370   (0x0004)  
	FColor                                             BoundingBoxColor;                                           // 0x0374   (0x0004)  
	FColor                                             FaceColor;                                                  // 0x0378   (0x0004)  
	FColor                                             FaceIndexColor;                                             // 0x037C   (0x0004)  
	FColor                                             FaceNormalColor;                                            // 0x0380   (0x0004)  
	FColor                                             SingleFaceColor;                                            // 0x0384   (0x0004)  
	FColor                                             VertexColor;                                                // 0x0388   (0x0004)  
	FColor                                             VertexIndexColor;                                           // 0x038C   (0x0004)  
	FColor                                             VertexNormalColor;                                          // 0x0390   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x0394   (0x0004)  MISSED
	class UBillboardComponent*                         SpriteComponent;                                            // 0x0398   (0x0008)  
	unsigned char                                      UnknownData03_7[0x28];                                      // 0x03A0   (0x0028)  MISSED
};

/// Class /Script/GeometryCollectionEngine.GeometryCollectionDebugDrawComponent
/// Size: 0x0018 (24 bytes) (0x0000F8 - 0x000110) align 8 pad: 0x0000
class UGeometryCollectionDebugDrawComponent : public UActorComponent
{ 
public:
	class AGeometryCollectionDebugDrawActor*           GeometryCollectionDebugDrawActor;                           // 0x00F8   (0x0008)  
	class AGeometryCollectionRenderLevelSetActor*      GeometryCollectionRenderLevelSetActor;                      // 0x0100   (0x0008)  
	unsigned char                                      UnknownData00_7[0x8];                                       // 0x0108   (0x0008)  MISSED
};

/// Struct /Script/GeometryCollectionEngine.GeometryCollectionSource
/// Size: 0x0060 (96 bytes) (0x000000 - 0x000060) align 16 pad: 0x0000
struct FGeometryCollectionSource
{ 
	FSoftObjectPath                                    SourceGeometryObject;                                       // 0x0000   (0x0018)  
	unsigned char                                      UnknownData00_6[0x8];                                       // 0x0018   (0x0008)  MISSED
	FTransform                                         LocalTransform;                                             // 0x0020   (0x0030)  
	TArray<class UMaterialInterface*>                  SourceMaterial;                                             // 0x0050   (0x0010)  
};

/// Struct /Script/GeometryCollectionEngine.GeometryCollectionSizeSpecificData
/// Size: 0x0024 (36 bytes) (0x000000 - 0x000024) align 4 pad: 0x0000
struct FGeometryCollectionSizeSpecificData
{ 
	float                                              MaxSize;                                                    // 0x0000   (0x0004)  
	ECollisionTypeEnum                                 CollisionType;                                              // 0x0004   (0x0001)  
	EImplicitTypeEnum                                  ImplicitType;                                               // 0x0005   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x0006   (0x0002)  MISSED
	int32_t                                            MinLevelSetResolution;                                      // 0x0008   (0x0004)  
	int32_t                                            MaxLevelSetResolution;                                      // 0x000C   (0x0004)  
	int32_t                                            MinClusterLevelSetResolution;                               // 0x0010   (0x0004)  
	int32_t                                            MaxClusterLevelSetResolution;                               // 0x0014   (0x0004)  
	int32_t                                            CollisionObjectReductionPercentage;                         // 0x0018   (0x0004)  
	float                                              CollisionParticlesFraction;                                 // 0x001C   (0x0004)  
	int32_t                                            MaximumCollisionParticles;                                  // 0x0020   (0x0004)  
};

/// Class /Script/GeometryCollectionEngine.GeometryCollection
/// Size: 0x00B8 (184 bytes) (0x000028 - 0x0000E0) align 8 pad: 0x0000
class UGeometryCollection : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0028   (0x0008)  MISSED
	TArray<FGeometryCollectionSource>                  GeometrySource;                                             // 0x0030   (0x0010)  
	TArray<class UMaterialInterface*>                  Materials;                                                  // 0x0040   (0x0010)  
	ECollisionTypeEnum                                 CollisionType;                                              // 0x0050   (0x0001)  
	EImplicitTypeEnum                                  ImplicitType;                                               // 0x0051   (0x0001)  
	unsigned char                                      UnknownData01_6[0x2];                                       // 0x0052   (0x0002)  MISSED
	int32_t                                            MinLevelSetResolution;                                      // 0x0054   (0x0004)  
	int32_t                                            MaxLevelSetResolution;                                      // 0x0058   (0x0004)  
	int32_t                                            MinClusterLevelSetResolution;                               // 0x005C   (0x0004)  
	int32_t                                            MaxClusterLevelSetResolution;                               // 0x0060   (0x0004)  
	float                                              CollisionObjectReductionPercentage;                         // 0x0064   (0x0004)  
	bool                                               bMassAsDensity;                                             // 0x0068   (0x0001)  
	unsigned char                                      UnknownData02_6[0x3];                                       // 0x0069   (0x0003)  MISSED
	float                                              Mass;                                                       // 0x006C   (0x0004)  
	float                                              MinimumMassClamp;                                           // 0x0070   (0x0004)  
	float                                              CollisionParticlesFraction;                                 // 0x0074   (0x0004)  
	int32_t                                            MaximumCollisionParticles;                                  // 0x0078   (0x0004)  
	unsigned char                                      UnknownData03_6[0x4];                                       // 0x007C   (0x0004)  MISSED
	TArray<FGeometryCollectionSizeSpecificData>        SizeSpecificData;                                           // 0x0080   (0x0010)  
	bool                                               EnableRemovePiecesOnFracture;                               // 0x0090   (0x0001)  
	unsigned char                                      UnknownData04_6[0x7];                                       // 0x0091   (0x0007)  MISSED
	TArray<class UMaterialInterface*>                  RemoveOnFractureMaterials;                                  // 0x0098   (0x0010)  
	FGuid                                              PersistentGuid;                                             // 0x00A8   (0x0010)  
	FGuid                                              StateGuid;                                                  // 0x00B8   (0x0010)  
	int32_t                                            BoneSelectedMaterialIndex;                                  // 0x00C8   (0x0004)  
	unsigned char                                      UnknownData05_7[0x14];                                      // 0x00CC   (0x0014)  MISSED
};

/// Class /Script/GeometryCollectionEngine.GeometryCollectionRenderLevelSetActor
/// Size: 0x00A0 (160 bytes) (0x0002E0 - 0x000380) align 16 pad: 0x0000
class AGeometryCollectionRenderLevelSetActor : public AActor
{ 
public:
	class UVolumeTexture*                              TargetVolumeTexture;                                        // 0x02E0   (0x0008)  
	class UMaterial*                                   RayMarchMaterial;                                           // 0x02E8   (0x0008)  
	float                                              SurfaceTolerance;                                           // 0x02F0   (0x0004)  
	float                                              Isovalue;                                                   // 0x02F4   (0x0004)  
	bool                                               Enabled;                                                    // 0x02F8   (0x0001)  
	bool                                               RenderVolumeBoundingBox;                                    // 0x02F9   (0x0001)  
	unsigned char                                      UnknownData00_7[0x86];                                      // 0x02FA   (0x0086)  MISSED
};

/// Class /Script/GeometryCollectionEngine.SkeletalMeshSimulationComponent
/// Size: 0x0088 (136 bytes) (0x0000F8 - 0x000180) align 8 pad: 0x0000
class USkeletalMeshSimulationComponent : public UActorComponent
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x00F8   (0x0008)  MISSED
	class UChaosPhysicalMaterial*                      PhysicalMaterial;                                           // 0x0100   (0x0008)  
	class AChaosSolverActor*                           ChaosSolverActor;                                           // 0x0108   (0x0008)  
	class UPhysicsAsset*                               OverridePhysicsAsset;                                       // 0x0110   (0x0008)  
	bool                                               bSimulating;                                                // 0x0118   (0x0001)  
	bool                                               bNotifyCollisions;                                          // 0x0119   (0x0001)  
	EObjectStateTypeEnum                               ObjectType;                                                 // 0x011A   (0x0001)  
	unsigned char                                      UnknownData01_6[0x1];                                       // 0x011B   (0x0001)  MISSED
	float                                              Density;                                                    // 0x011C   (0x0004)  
	float                                              MinMass;                                                    // 0x0120   (0x0004)  
	float                                              MaxMass;                                                    // 0x0124   (0x0004)  
	ECollisionTypeEnum                                 CollisionType;                                              // 0x0128   (0x0001)  
	unsigned char                                      UnknownData02_6[0x3];                                       // 0x0129   (0x0003)  MISSED
	float                                              ImplicitShapeParticlesPerUnitArea;                          // 0x012C   (0x0004)  
	int32_t                                            ImplicitShapeMinNumParticles;                               // 0x0130   (0x0004)  
	int32_t                                            ImplicitShapeMaxNumParticles;                               // 0x0134   (0x0004)  
	int32_t                                            MinLevelSetResolution;                                      // 0x0138   (0x0004)  
	int32_t                                            MaxLevelSetResolution;                                      // 0x013C   (0x0004)  
	int32_t                                            CollisionGroup;                                             // 0x0140   (0x0004)  
	EInitialVelocityTypeEnum                           InitialVelocityType;                                        // 0x0144   (0x0001)  
	unsigned char                                      UnknownData03_6[0x3];                                       // 0x0145   (0x0003)  MISSED
	FVector                                            InitialLinearVelocity;                                      // 0x0148   (0x000C)  
	FVector                                            InitialAngularVelocity;                                     // 0x0154   (0x000C)  
	SDK_UNDEFINED(16,2228) /* FMulticastInlineDelegate */ __um(OnChaosPhysicsCollision);                           // 0x0160   (0x0010)  
	unsigned char                                      UnknownData04_7[0x10];                                      // 0x0170   (0x0010)  MISSED


	/// Functions
	// Function /Script/GeometryCollectionEngine.SkeletalMeshSimulationComponent.ReceivePhysicsCollision
	// void ReceivePhysicsCollision(FChaosPhysicsCollisionInfo& CollisionInfo);                                                 // [0x3a75280] Event|Public|HasOutParms|BlueprintEvent 
};

/// Class /Script/GeometryCollectionEngine.StaticMeshSimulationComponent
/// Size: 0x0088 (136 bytes) (0x0000F8 - 0x000180) align 8 pad: 0x0000
class UStaticMeshSimulationComponent : public UActorComponent
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x00F8   (0x0008)  MISSED
	bool                                               Simulating;                                                 // 0x0100   (0x0001)  
	bool                                               bNotifyCollisions;                                          // 0x0101   (0x0001)  
	EObjectStateTypeEnum                               ObjectType;                                                 // 0x0102   (0x0001)  
	unsigned char                                      UnknownData01_6[0x1];                                       // 0x0103   (0x0001)  MISSED
	float                                              Mass;                                                       // 0x0104   (0x0004)  
	ECollisionTypeEnum                                 CollisionType;                                              // 0x0108   (0x0001)  
	EImplicitTypeEnum                                  ImplicitType;                                               // 0x0109   (0x0001)  
	unsigned char                                      UnknownData02_6[0x2];                                       // 0x010A   (0x0002)  MISSED
	int32_t                                            MinLevelSetResolution;                                      // 0x010C   (0x0004)  
	int32_t                                            MaxLevelSetResolution;                                      // 0x0110   (0x0004)  
	EInitialVelocityTypeEnum                           InitialVelocityType;                                        // 0x0114   (0x0001)  
	unsigned char                                      UnknownData03_6[0x3];                                       // 0x0115   (0x0003)  MISSED
	FVector                                            InitialLinearVelocity;                                      // 0x0118   (0x000C)  
	FVector                                            InitialAngularVelocity;                                     // 0x0124   (0x000C)  
	float                                              DamageThreshold;                                            // 0x0130   (0x0004)  
	unsigned char                                      UnknownData04_6[0x4];                                       // 0x0134   (0x0004)  MISSED
	class UChaosPhysicalMaterial*                      PhysicalMaterial;                                           // 0x0138   (0x0008)  
	class AChaosSolverActor*                           ChaosSolverActor;                                           // 0x0140   (0x0008)  
	SDK_UNDEFINED(16,2229) /* FMulticastInlineDelegate */ __um(OnChaosPhysicsCollision);                           // 0x0148   (0x0010)  
	unsigned char                                      UnknownData05_6[0x10];                                      // 0x0158   (0x0010)  MISSED
	TArray<class UPrimitiveComponent*>                 SimulatedComponents;                                        // 0x0168   (0x0010)  
	unsigned char                                      UnknownData06_7[0x8];                                       // 0x0178   (0x0008)  MISSED


	/// Functions
	// Function /Script/GeometryCollectionEngine.StaticMeshSimulationComponent.ReceivePhysicsCollision
	// void ReceivePhysicsCollision(FChaosPhysicsCollisionInfo& CollisionInfo);                                                 // [0x3a75280] Event|Public|HasOutParms|BlueprintEvent 
	// Function /Script/GeometryCollectionEngine.StaticMeshSimulationComponent.ForceRecreatePhysicsState
	// void ForceRecreatePhysicsState();                                                                                        // [0x5ec6a20] Final|Native|Public|BlueprintCallable 
};

/// Struct /Script/GeometryCollectionEngine.ChaosCollisionEventData
/// Size: 0x0058 (88 bytes) (0x000000 - 0x000058) align 8 pad: 0x0000
struct FChaosCollisionEventData
{ 
	FVector                                            Location;                                                   // 0x0000   (0x000C)  
	FVector                                            Normal;                                                     // 0x000C   (0x000C)  
	FVector                                            Velocity1;                                                  // 0x0018   (0x000C)  
	FVector                                            Velocity2;                                                  // 0x0024   (0x000C)  
	float                                              Mass1;                                                      // 0x0030   (0x0004)  
	float                                              Mass2;                                                      // 0x0034   (0x0004)  
	FVector                                            Impulse;                                                    // 0x0038   (0x000C)  
	unsigned char                                      UnknownData00_7[0x14];                                      // 0x0044   (0x0014)  MISSED
};

/// Struct /Script/GeometryCollectionEngine.ChaosBreakingEventData
/// Size: 0x001C (28 bytes) (0x000000 - 0x00001C) align 4 pad: 0x0000
struct FChaosBreakingEventData
{ 
	FVector                                            Location;                                                   // 0x0000   (0x000C)  
	FVector                                            Velocity;                                                   // 0x000C   (0x000C)  
	float                                              Mass;                                                       // 0x0018   (0x0004)  
};

/// Struct /Script/GeometryCollectionEngine.ChaosTrailingEventData
/// Size: 0x002C (44 bytes) (0x000000 - 0x00002C) align 4 pad: 0x0000
struct FChaosTrailingEventData
{ 
	FVector                                            Location;                                                   // 0x0000   (0x000C)  
	FVector                                            Velocity;                                                   // 0x000C   (0x000C)  
	FVector                                            AngularVelocity;                                            // 0x0018   (0x000C)  
	float                                              Mass;                                                       // 0x0024   (0x0004)  
	int32_t                                            ParticleIndex;                                              // 0x0028   (0x0004)  
};

static_assert(sizeof(FChaosCollisionEventRequestSettings) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FChaosBreakingEventRequestSettings) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FChaosTrailingEventRequestSettings) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(UChaosDestructionListener) == 0x0450); // 1104 bytes (0x000220 - 0x000450)
static_assert(sizeof(AGeometryCollectionActor) == 0x02F0); // 752 bytes (0x0002E0 - 0x0002F0)
static_assert(sizeof(UGeometryCollectionCache) == 0x0050); // 80 bytes (0x000028 - 0x000050)
static_assert(sizeof(FGeomComponentCacheParameters) == 0x0050); // 80 bytes (0x000000 - 0x000050)
static_assert(sizeof(FGeometryCollectionRepData) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(UGeometryCollectionComponent) == 0x0AA0); // 2720 bytes (0x000610 - 0x000AA0)
static_assert(sizeof(FGeometryCollectionDebugDrawWarningMessage) == 0x0001); // 1 bytes (0x000000 - 0x000001)
static_assert(sizeof(FGeometryCollectionDebugDrawActorSelectedRigidBody) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(AGeometryCollectionDebugDrawActor) == 0x03C8); // 968 bytes (0x0002E0 - 0x0003C8)
static_assert(sizeof(UGeometryCollectionDebugDrawComponent) == 0x0110); // 272 bytes (0x0000F8 - 0x000110)
static_assert(sizeof(FGeometryCollectionSource) == 0x0060); // 96 bytes (0x000000 - 0x000060)
static_assert(sizeof(FGeometryCollectionSizeSpecificData) == 0x0024); // 36 bytes (0x000000 - 0x000024)
static_assert(sizeof(UGeometryCollection) == 0x00E0); // 224 bytes (0x000028 - 0x0000E0)
static_assert(sizeof(AGeometryCollectionRenderLevelSetActor) == 0x0380); // 896 bytes (0x0002E0 - 0x000380)
static_assert(sizeof(USkeletalMeshSimulationComponent) == 0x0180); // 384 bytes (0x0000F8 - 0x000180)
static_assert(sizeof(UStaticMeshSimulationComponent) == 0x0180); // 384 bytes (0x0000F8 - 0x000180)
static_assert(sizeof(FChaosCollisionEventData) == 0x0058); // 88 bytes (0x000000 - 0x000058)
static_assert(sizeof(FChaosBreakingEventData) == 0x001C); // 28 bytes (0x000000 - 0x00001C)
static_assert(sizeof(FChaosTrailingEventData) == 0x002C); // 44 bytes (0x000000 - 0x00002C)
static_assert(offsetof(FChaosCollisionEventRequestSettings, SortMethod) == 0x0014);
static_assert(offsetof(FChaosBreakingEventRequestSettings, SortMethod) == 0x0014);
static_assert(offsetof(FChaosTrailingEventRequestSettings, SortMethod) == 0x0014);
static_assert(offsetof(UChaosDestructionListener, CollisionEventRequestSettings) == 0x0224);
static_assert(offsetof(UChaosDestructionListener, BreakingEventRequestSettings) == 0x023C);
static_assert(offsetof(UChaosDestructionListener, TrailingEventRequestSettings) == 0x0254);
static_assert(offsetof(AGeometryCollectionActor, GeometryCollectionComponent) == 0x02E0);
static_assert(offsetof(AGeometryCollectionActor, GeometryCollectionDebugDrawComponent) == 0x02E8);
static_assert(offsetof(UGeometryCollectionCache, RecordedData) == 0x0028);
static_assert(offsetof(UGeometryCollectionCache, SupportedCollection) == 0x0038);
static_assert(offsetof(UGeometryCollectionCache, CompatibleCollectionState) == 0x0040);
static_assert(offsetof(FGeomComponentCacheParameters, CacheMode) == 0x0000);
static_assert(offsetof(FGeomComponentCacheParameters, TargetCache) == 0x0008);
static_assert(offsetof(UGeometryCollectionComponent, ChaosSolverActor) == 0x0618);
static_assert(offsetof(UGeometryCollectionComponent, RestCollection) == 0x0700);
static_assert(offsetof(UGeometryCollectionComponent, InitializationFields) == 0x0708);
static_assert(offsetof(UGeometryCollectionComponent, ObjectType) == 0x0720);
static_assert(offsetof(UGeometryCollectionComponent, DamageThreshold) == 0x0730);
static_assert(offsetof(UGeometryCollectionComponent, ClusterConnectionType) == 0x0740);
static_assert(offsetof(UGeometryCollectionComponent, PhysicalMaterial) == 0x0758);
static_assert(offsetof(UGeometryCollectionComponent, InitialVelocityType) == 0x0760);
static_assert(offsetof(UGeometryCollectionComponent, InitialLinearVelocity) == 0x0764);
static_assert(offsetof(UGeometryCollectionComponent, InitialAngularVelocity) == 0x0770);
static_assert(offsetof(UGeometryCollectionComponent, PhysicalMaterialOverride) == 0x0780);
static_assert(offsetof(UGeometryCollectionComponent, CacheParameters) == 0x0788);
static_assert(offsetof(UGeometryCollectionComponent, RepData) == 0x0840);
static_assert(offsetof(UGeometryCollectionComponent, DummyBodySetup) == 0x0A70);
static_assert(offsetof(FGeometryCollectionDebugDrawActorSelectedRigidBody, Solver) == 0x0008);
static_assert(offsetof(FGeometryCollectionDebugDrawActorSelectedRigidBody, GeometryCollection) == 0x0010);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, WarningMessage) == 0x02E0);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, SelectedRigidBody) == 0x02E8);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, HideGeometry) == 0x0303);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, RigidBodyIdColor) == 0x033C);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, RigidBodyCollisionColor) == 0x0344);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, RigidBodyInertiaColor) == 0x0348);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, RigidBodyVelocityColor) == 0x034C);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, RigidBodyForceColor) == 0x0350);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, RigidBodyInfoColor) == 0x0354);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, TransformIndexColor) == 0x0358);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, LevelColor) == 0x0360);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, ParentColor) == 0x0364);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, GeometryIndexColor) == 0x036C);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, BoundingBoxColor) == 0x0374);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, FaceColor) == 0x0378);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, FaceIndexColor) == 0x037C);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, FaceNormalColor) == 0x0380);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, SingleFaceColor) == 0x0384);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, VertexColor) == 0x0388);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, VertexIndexColor) == 0x038C);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, VertexNormalColor) == 0x0390);
static_assert(offsetof(AGeometryCollectionDebugDrawActor, SpriteComponent) == 0x0398);
static_assert(offsetof(UGeometryCollectionDebugDrawComponent, GeometryCollectionDebugDrawActor) == 0x00F8);
static_assert(offsetof(UGeometryCollectionDebugDrawComponent, GeometryCollectionRenderLevelSetActor) == 0x0100);
static_assert(offsetof(FGeometryCollectionSource, SourceGeometryObject) == 0x0000);
static_assert(offsetof(FGeometryCollectionSource, LocalTransform) == 0x0020);
static_assert(offsetof(FGeometryCollectionSource, SourceMaterial) == 0x0050);
static_assert(offsetof(FGeometryCollectionSizeSpecificData, CollisionType) == 0x0004);
static_assert(offsetof(FGeometryCollectionSizeSpecificData, ImplicitType) == 0x0005);
static_assert(offsetof(UGeometryCollection, GeometrySource) == 0x0030);
static_assert(offsetof(UGeometryCollection, Materials) == 0x0040);
static_assert(offsetof(UGeometryCollection, CollisionType) == 0x0050);
static_assert(offsetof(UGeometryCollection, ImplicitType) == 0x0051);
static_assert(offsetof(UGeometryCollection, SizeSpecificData) == 0x0080);
static_assert(offsetof(UGeometryCollection, RemoveOnFractureMaterials) == 0x0098);
static_assert(offsetof(UGeometryCollection, PersistentGuid) == 0x00A8);
static_assert(offsetof(UGeometryCollection, StateGuid) == 0x00B8);
static_assert(offsetof(AGeometryCollectionRenderLevelSetActor, TargetVolumeTexture) == 0x02E0);
static_assert(offsetof(AGeometryCollectionRenderLevelSetActor, RayMarchMaterial) == 0x02E8);
static_assert(offsetof(USkeletalMeshSimulationComponent, PhysicalMaterial) == 0x0100);
static_assert(offsetof(USkeletalMeshSimulationComponent, ChaosSolverActor) == 0x0108);
static_assert(offsetof(USkeletalMeshSimulationComponent, OverridePhysicsAsset) == 0x0110);
static_assert(offsetof(USkeletalMeshSimulationComponent, ObjectType) == 0x011A);
static_assert(offsetof(USkeletalMeshSimulationComponent, CollisionType) == 0x0128);
static_assert(offsetof(USkeletalMeshSimulationComponent, InitialVelocityType) == 0x0144);
static_assert(offsetof(USkeletalMeshSimulationComponent, InitialLinearVelocity) == 0x0148);
static_assert(offsetof(USkeletalMeshSimulationComponent, InitialAngularVelocity) == 0x0154);
static_assert(offsetof(UStaticMeshSimulationComponent, ObjectType) == 0x0102);
static_assert(offsetof(UStaticMeshSimulationComponent, CollisionType) == 0x0108);
static_assert(offsetof(UStaticMeshSimulationComponent, ImplicitType) == 0x0109);
static_assert(offsetof(UStaticMeshSimulationComponent, InitialVelocityType) == 0x0114);
static_assert(offsetof(UStaticMeshSimulationComponent, InitialLinearVelocity) == 0x0118);
static_assert(offsetof(UStaticMeshSimulationComponent, InitialAngularVelocity) == 0x0124);
static_assert(offsetof(UStaticMeshSimulationComponent, PhysicalMaterial) == 0x0138);
static_assert(offsetof(UStaticMeshSimulationComponent, ChaosSolverActor) == 0x0140);
static_assert(offsetof(UStaticMeshSimulationComponent, SimulatedComponents) == 0x0168);
static_assert(offsetof(FChaosCollisionEventData, Location) == 0x0000);
static_assert(offsetof(FChaosCollisionEventData, Normal) == 0x000C);
static_assert(offsetof(FChaosCollisionEventData, Velocity1) == 0x0018);
static_assert(offsetof(FChaosCollisionEventData, Velocity2) == 0x0024);
static_assert(offsetof(FChaosCollisionEventData, Impulse) == 0x0038);
static_assert(offsetof(FChaosBreakingEventData, Location) == 0x0000);
static_assert(offsetof(FChaosBreakingEventData, Velocity) == 0x000C);
static_assert(offsetof(FChaosTrailingEventData, Location) == 0x0000);
static_assert(offsetof(FChaosTrailingEventData, Velocity) == 0x000C);
static_assert(offsetof(FChaosTrailingEventData, AngularVelocity) == 0x0018);
