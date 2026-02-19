
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Class /Script/MFBenchmark.MFBenchmarkManager
/// Size: 0x0118 (280 bytes) (0x0002E0 - 0x0003F8) align 8 pad: 0x0000
class AMFBenchmarkManager : public AActor
{ 
public:
	bool                                               bTickTrs;                                                   // 0x02E0   (0x0001)  
	unsigned char                                      UnknownData00_7[0x117];                                     // 0x02E1   (0x0117)  MISSED


	/// Functions
	// Function /Script/MFBenchmark.MFBenchmarkManager.PerformBenchmark
	// void PerformBenchmark();                                                                                                 // [0x18de120] Final|Native|Public  
};

/// Class /Script/MFBenchmark.MFBenchmarkMarker
/// Size: 0x0008 (8 bytes) (0x000308 - 0x000310) align 8 pad: 0x0000
class AMFBenchmarkMarker : public ANavigationObjectBase
{ 
public:
	FName                                              GamePerfPositionTag;                                        // 0x0308   (0x0008)  
};

/// Class /Script/MFBenchmark.MFMarkerDataWriter
/// Size: 0x0008 (8 bytes) (0x0002E0 - 0x0002E8) align 8 pad: 0x0000
class AMFMarkerDataWriter : public AActor
{ 
public:
	class UDataTable*                                  TargetTable;                                                // 0x02E0   (0x0008)  


	/// Functions
	// Function /Script/MFBenchmark.MFMarkerDataWriter.WriteTestData
	// void WriteTestData();                                                                                                    // [0x18de140] Final|Native|Public  
	// Function /Script/MFBenchmark.MFMarkerDataWriter.WriteMarkerData
	// void WriteMarkerData();                                                                                                  // [0xd906a0] Final|Native|Public  
};

/// Struct /Script/MFBenchmark.MFMarkerPosDataTabelData
/// Size: 0x0018 (24 bytes) (0x000008 - 0x000020) align 8 pad: 0x0000
struct FMFMarkerPosDataTabelData : FTableRowBase
{ 
	float                                              PosX;                                                       // 0x0008   (0x0004)  
	float                                              PosY;                                                       // 0x000C   (0x0004)  
	float                                              PosZ;                                                       // 0x0010   (0x0004)  
	float                                              RotX;                                                       // 0x0014   (0x0004)  
	float                                              RotY;                                                       // 0x0018   (0x0004)  
	float                                              RotZ;                                                       // 0x001C   (0x0004)  
};

static_assert(sizeof(AMFBenchmarkManager) == 0x03F8); // 1016 bytes (0x0002E0 - 0x0003F8)
static_assert(sizeof(AMFBenchmarkMarker) == 0x0310); // 784 bytes (0x000308 - 0x000310)
static_assert(sizeof(AMFMarkerDataWriter) == 0x02E8); // 744 bytes (0x0002E0 - 0x0002E8)
static_assert(sizeof(FMFMarkerPosDataTabelData) == 0x0020); // 32 bytes (0x000008 - 0x000020)
static_assert(offsetof(AMFBenchmarkMarker, GamePerfPositionTag) == 0x0308);
static_assert(offsetof(AMFMarkerDataWriter, TargetTable) == 0x02E0);
