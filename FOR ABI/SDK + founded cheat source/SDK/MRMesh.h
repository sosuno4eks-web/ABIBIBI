
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Enum /Script/MRMesh.EMeshTrackerVertexColorMode
/// Size: 0x01 (1 bytes)
enum class EMeshTrackerVertexColorMode : uint8_t
{
	EMeshTrackerVertexColorMode__None                                                = 0,
	EMeshTrackerVertexColorMode__Confidence                                          = 1,
	EMeshTrackerVertexColorMode__Block                                               = 2
};

/// Class /Script/MRMesh.MeshReconstructorBase
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UMeshReconstructorBase : public UObject
{ 
public:


	/// Functions
	// Function /Script/MRMesh.MeshReconstructorBase.StopReconstruction
	// void StopReconstruction();                                                                                               // [0x1da19a0] Native|Public|BlueprintCallable 
	// Function /Script/MRMesh.MeshReconstructorBase.StartReconstruction
	// void StartReconstruction();                                                                                              // [0x1da1980] Native|Public|BlueprintCallable 
	// Function /Script/MRMesh.MeshReconstructorBase.PauseReconstruction
	// void PauseReconstruction();                                                                                              // [0x1da1da0] Native|Public|BlueprintCallable 
	// Function /Script/MRMesh.MeshReconstructorBase.IsReconstructionStarted
	// bool IsReconstructionStarted();                                                                                          // [0x2dbc380] Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MRMesh.MeshReconstructorBase.IsReconstructionPaused
	// bool IsReconstructionPaused();                                                                                           // [0x490ee50] Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MRMesh.MeshReconstructorBase.DisconnectMRMesh
	// void DisconnectMRMesh();                                                                                                 // [0x198b060] Native|Public        
	// Function /Script/MRMesh.MeshReconstructorBase.ConnectMRMesh
	// void ConnectMRMesh(class UMRMeshComponent* Mesh);                                                                        // [0x28fcfa0] Native|Public        
};

/// Class /Script/MRMesh.MockDataMeshTrackerComponent
/// Size: 0x0070 (112 bytes) (0x000220 - 0x000290) align 16 pad: 0x0000
class UMockDataMeshTrackerComponent : public USceneComponent
{ 
public:
	SDK_UNDEFINED(16,2175) /* FMulticastInlineDelegate */ __um(OnMeshTrackerUpdated);                              // 0x0220   (0x0010)  
	bool                                               ScanWorld;                                                  // 0x0230   (0x0001)  
	bool                                               RequestNormals;                                             // 0x0231   (0x0001)  
	bool                                               RequestVertexConfidence;                                    // 0x0232   (0x0001)  
	EMeshTrackerVertexColorMode                        VertexColorMode;                                            // 0x0233   (0x0001)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0234   (0x0004)  MISSED
	TArray<FColor>                                     BlockVertexColors;                                          // 0x0238   (0x0010)  
	FLinearColor                                       VertexColorFromConfidenceZero;                              // 0x0248   (0x0010)  
	FLinearColor                                       VertexColorFromConfidenceOne;                               // 0x0258   (0x0010)  
	float                                              UpdateInterval;                                             // 0x0268   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x026C   (0x0004)  MISSED
	class UMRMeshComponent*                            MRMesh;                                                     // 0x0270   (0x0008)  
	unsigned char                                      UnknownData02_7[0x18];                                      // 0x0278   (0x0018)  MISSED


	/// Functions
	// Function /Script/MRMesh.MockDataMeshTrackerComponent.OnMockDataMeshTrackerUpdated__DelegateSignature
	// void OnMockDataMeshTrackerUpdated__DelegateSignature(int32_t Index, TArray<FVector>& Vertices, TArray<int32_t>& Triangles, TArray<FVector>& Normals, TArray<float>& Confidence); // [0x3a75280] MulticastDelegate|Public|Delegate|HasOutParms 
	// Function /Script/MRMesh.MockDataMeshTrackerComponent.DisconnectMRMesh
	// void DisconnectMRMesh(class UMRMeshComponent* InMRMeshPtr);                                                              // [0x490ecf0] Final|Native|Public|BlueprintCallable 
	// Function /Script/MRMesh.MockDataMeshTrackerComponent.ConnectMRMesh
	// void ConnectMRMesh(class UMRMeshComponent* InMRMeshPtr);                                                                 // [0x490ec60] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/MRMesh.MRMeshComponent
/// Size: 0x00B8 (184 bytes) (0x0005D8 - 0x000690) align 16 pad: 0x0000
class UMRMeshComponent : public UPrimitiveComponent
{ 
public:
	unsigned char                                      UnknownData00_3[0x10];                                      // 0x05D8   (0x0010)  MISSED
	class UMaterialInterface*                          Material;                                                   // 0x05E8   (0x0008)  
	class UMaterialInterface*                          WireframeMaterial;                                          // 0x05F0   (0x0008)  
	bool                                               bCreateMeshProxySections;                                   // 0x05F8   (0x0001)  
	bool                                               bUpdateNavMeshOnMeshUpdate;                                 // 0x05F9   (0x0001)  
	bool                                               bNeverCreateCollisionMesh;                                  // 0x05FA   (0x0001)  
	unsigned char                                      UnknownData01_6[0x5];                                       // 0x05FB   (0x0005)  MISSED
	class UBodySetup*                                  CachedBodySetup;                                            // 0x0600   (0x0008)  
	TArray<class UBodySetup*>                          BodySetups;                                                 // 0x0608   (0x0010)  
	unsigned char                                      UnknownData02_7[0x78];                                      // 0x0618   (0x0078)  MISSED


	/// Functions
	// Function /Script/MRMesh.MRMeshComponent.SetWireframeMaterial
	// void SetWireframeMaterial(class UMaterialInterface* InMaterial);                                                         // [0x10809a0] Native|Public|BlueprintCallable 
	// Function /Script/MRMesh.MRMeshComponent.SetWireframeColor
	// void SetWireframeColor(FLinearColor& InColor);                                                                           // [0x490efa0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/MRMesh.MRMeshComponent.SetUseWireframe
	// void SetUseWireframe(bool bUseWireframe);                                                                                // [0x490ef10] Final|Native|Public|BlueprintCallable 
	// Function /Script/MRMesh.MRMeshComponent.SetEnableMeshOcclusion
	// void SetEnableMeshOcclusion(bool bEnable);                                                                               // [0x490ee80] Final|Native|Public|BlueprintCallable 
	// Function /Script/MRMesh.MRMeshComponent.IsConnected
	// bool IsConnected();                                                                                                      // [0x490ee10] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MRMesh.MRMeshComponent.GetWireframeColor
	// FLinearColor GetWireframeColor();                                                                                        // [0x490ede0] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MRMesh.MRMeshComponent.GetUseWireframe
	// bool GetUseWireframe();                                                                                                  // [0x490edc0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MRMesh.MRMeshComponent.GetEnableMeshOcclusion
	// bool GetEnableMeshOcclusion();                                                                                           // [0x490eda0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/MRMesh.MRMeshComponent.ForceNavMeshUpdate
	// void ForceNavMeshUpdate();                                                                                               // [0x490ed80] Final|Native|Public|BlueprintCallable 
	// Function /Script/MRMesh.MRMeshComponent.Clear
	// void Clear();                                                                                                            // [0x490ec30] Final|Native|Public|BlueprintCallable 
};

/// Struct /Script/MRMesh.MRMeshConfiguration
/// Size: 0x0001 (1 bytes) (0x000000 - 0x000001) align 1 pad: 0x0000
struct FMRMeshConfiguration
{ 
	unsigned char                                      UnknownData00_2[0x1];                                       // 0x0000   (0x0001)  MISSED
};

static_assert(sizeof(UMeshReconstructorBase) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UMockDataMeshTrackerComponent) == 0x0290); // 656 bytes (0x000220 - 0x000290)
static_assert(sizeof(UMRMeshComponent) == 0x0690); // 1680 bytes (0x0005D8 - 0x000690)
static_assert(sizeof(FMRMeshConfiguration) == 0x0001); // 1 bytes (0x000000 - 0x000001)
static_assert(offsetof(UMockDataMeshTrackerComponent, VertexColorMode) == 0x0233);
static_assert(offsetof(UMockDataMeshTrackerComponent, BlockVertexColors) == 0x0238);
static_assert(offsetof(UMockDataMeshTrackerComponent, VertexColorFromConfidenceZero) == 0x0248);
static_assert(offsetof(UMockDataMeshTrackerComponent, VertexColorFromConfidenceOne) == 0x0258);
static_assert(offsetof(UMockDataMeshTrackerComponent, MRMesh) == 0x0270);
static_assert(offsetof(UMRMeshComponent, Material) == 0x05E8);
static_assert(offsetof(UMRMeshComponent, WireframeMaterial) == 0x05F0);
static_assert(offsetof(UMRMeshComponent, CachedBodySetup) == 0x0600);
static_assert(offsetof(UMRMeshComponent, BodySetups) == 0x0608);
