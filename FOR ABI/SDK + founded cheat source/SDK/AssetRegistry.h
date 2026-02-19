
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject

/// Class /Script/AssetRegistry.AssetRegistryImpl
/// Size: 0x07A0 (1952 bytes) (0x000028 - 0x0007C8) align 8 pad: 0x0000
class UAssetRegistryImpl : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x7A0];                                     // 0x0028   (0x07A0)  MISSED
};

/// Class /Script/AssetRegistry.AssetRegistryHelpers
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UAssetRegistryHelpers : public UObject
{ 
public:


	/// Functions
	// Function /Script/AssetRegistry.AssetRegistryHelpers.ToSoftObjectPath
	// FSoftObjectPath ToSoftObjectPath(FAssetData& InAssetData);                                                               // [0x5053470] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/AssetRegistry.AssetRegistryHelpers.SetFilterTagsAndValues
	// FARFilter SetFilterTagsAndValues(FARFilter& InFilter, TArray<FTagAndValue>& InTagsAndValues);                            // [0x5053190] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/AssetRegistry.AssetRegistryHelpers.IsValid
	// bool IsValid(FAssetData& InAssetData);                                                                                   // [0x5052690] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/AssetRegistry.AssetRegistryHelpers.IsUAsset
	// bool IsUAsset(FAssetData& InAssetData);                                                                                  // [0x50525a0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/AssetRegistry.AssetRegistryHelpers.IsRedirector
	// bool IsRedirector(FAssetData& InAssetData);                                                                              // [0x50524b0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/AssetRegistry.AssetRegistryHelpers.IsAssetLoaded
	// bool IsAssetLoaded(FAssetData& InAssetData);                                                                             // [0x5052390] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/AssetRegistry.AssetRegistryHelpers.GetTagValue
	// bool GetTagValue(FAssetData& InAssetData, FName& InTagName, FString& OutTagValue);                                       // [0x5052110] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/AssetRegistry.AssetRegistryHelpers.GetFullName
	// FString GetFullName(FAssetData& InAssetData);                                                                            // [0x5051e50] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/AssetRegistry.AssetRegistryHelpers.GetExportTextName
	// FString GetExportTextName(FAssetData& InAssetData);                                                                      // [0x5051d10] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/AssetRegistry.AssetRegistryHelpers.GetClass
	// class UClass* GetClass(FAssetData& InAssetData);                                                                         // [0x5051c20] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/AssetRegistry.AssetRegistryHelpers.GetAssetRegistry
	// TScriptInterface<Class> GetAssetRegistry();                                                                              // [0x50513c0] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/AssetRegistry.AssetRegistryHelpers.GetAsset
	// class UObject* GetAsset(FAssetData& InAssetData);                                                                        // [0x50511a0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable|BlueprintPure 
	// Function /Script/AssetRegistry.AssetRegistryHelpers.CreateAssetData
	// FAssetData CreateAssetData(class UObject* InAsset, bool bAllowBlueprintClass);                                           // [0x5050e40] Final|Native|Static|Public|HasDefaults|BlueprintCallable|BlueprintPure 
};

/// Class /Script/AssetRegistry.AssetRegistry
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UAssetRegistry : public UInterface
{ 
public:


	/// Functions
	// Function /Script/AssetRegistry.AssetRegistry.WaitForCompletion
	// void WaitForCompletion();                                                                                                // [0x50538a0] Native|Public|BlueprintCallable 
	// Function /Script/AssetRegistry.AssetRegistry.UseFilterToExcludeAssets
	// void UseFilterToExcludeAssets(TArray<FAssetData>& AssetDataList, FARFilter& Filter);                                     // [0x50535b0] Native|Public|HasOutParms|HasDefaults|BlueprintCallable|Const 
	// Function /Script/AssetRegistry.AssetRegistry.SearchAllAssets
	// void SearchAllAssets(bool bSynchronousSearch);                                                                           // [0x5053100] Native|Public|BlueprintCallable 
	// Function /Script/AssetRegistry.AssetRegistry.ScanPathsSynchronous
	// void ScanPathsSynchronous(TArray<FString>& InPaths, bool bForceRescan);                                                  // [0x5052fd0] Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AssetRegistry.AssetRegistry.ScanModifiedAssetFiles
	// void ScanModifiedAssetFiles(TArray<FString>& InFilePaths);                                                               // [0x5052f00] Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AssetRegistry.AssetRegistry.ScanFilesSynchronous
	// void ScanFilesSynchronous(TArray<FString>& InFilePaths, bool bForceRescan);                                              // [0x5052dd0] Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AssetRegistry.AssetRegistry.RunAssetsThroughFilter
	// void RunAssetsThroughFilter(TArray<FAssetData>& AssetDataList, FARFilter& Filter);                                       // [0x5052ae0] Native|Public|HasOutParms|HasDefaults|BlueprintCallable|Const 
	// Function /Script/AssetRegistry.AssetRegistry.PrioritizeSearchPath
	// void PrioritizeSearchPath(FString PathToPrioritize);                                                                     // [0x5052a40] Native|Public|BlueprintCallable 
	// Function /Script/AssetRegistry.AssetRegistry.K2_GetReferencers
	// bool K2_GetReferencers(FName PackageName, FAssetRegistryDependencyOptions& ReferenceOptions, TArray<FName>& OutReferencers); // [0x50528e0] Native|Public|HasOutParms|BlueprintCallable|Const 
	// Function /Script/AssetRegistry.AssetRegistry.K2_GetDependencies
	// bool K2_GetDependencies(FName PackageName, FAssetRegistryDependencyOptions& DependencyOptions, TArray<FName>& OutDependencies); // [0x5052780] Native|Public|HasOutParms|BlueprintCallable|Const 
	// Function /Script/AssetRegistry.AssetRegistry.IsLoadingAssets
	// bool IsLoadingAssets();                                                                                                  // [0x5052480] Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/AssetRegistry.AssetRegistry.HasAssets
	// bool HasAssets(FName PackagePath, bool bRecursive);                                                                      // [0x50522c0] Native|Public|BlueprintCallable|Const 
	// Function /Script/AssetRegistry.AssetRegistry.GetSubPaths
	// void GetSubPaths(FString InBasePath, TArray<FString>& OutPathList, bool bInRecurse);                                     // [0x5051f90] Native|Public|HasOutParms|BlueprintCallable|Const 
	// Function /Script/AssetRegistry.AssetRegistry.GetAssetsByPath
	// bool GetAssetsByPath(FName PackagePath, TArray<FAssetData>& OutAssetData, bool bRecursive, bool bIncludeOnlyOnDiskAssets); // [0x5051a30] Native|Public|HasOutParms|BlueprintCallable|Const 
	// Function /Script/AssetRegistry.AssetRegistry.GetAssetsByPackageName
	// bool GetAssetsByPackageName(FName PackageName, TArray<FAssetData>& OutAssetData, bool bIncludeOnlyOnDiskAssets);         // [0x5051890] Native|Public|HasOutParms|BlueprintCallable|Const 
	// Function /Script/AssetRegistry.AssetRegistry.GetAssetsByClass
	// bool GetAssetsByClass(FName ClassName, TArray<FAssetData>& OutAssetData, bool bSearchSubClasses);                        // [0x50516f0] Native|Public|HasOutParms|BlueprintCallable|Const 
	// Function /Script/AssetRegistry.AssetRegistry.GetAssets
	// bool GetAssets(FARFilter& Filter, TArray<FAssetData>& OutAssetData);                                                     // [0x5051400] Native|Public|HasOutParms|HasDefaults|BlueprintCallable|Const 
	// Function /Script/AssetRegistry.AssetRegistry.GetAssetByObjectPath
	// FAssetData GetAssetByObjectPath(FName ObjectPath, bool bIncludeOnlyOnDiskAssets);                                        // [0x5051290] Native|Public|HasDefaults|BlueprintCallable|Const 
	// Function /Script/AssetRegistry.AssetRegistry.GetAllCachedPaths
	// void GetAllCachedPaths(TArray<FString>& OutPathList);                                                                    // [0x50510d0] Native|Public|HasOutParms|BlueprintCallable|Const 
	// Function /Script/AssetRegistry.AssetRegistry.GetAllAssets
	// bool GetAllAssets(TArray<FAssetData>& OutAssetData, bool bIncludeOnlyOnDiskAssets);                                      // [0x5050f70] Native|Public|HasOutParms|BlueprintCallable|Const 
};

/// Struct /Script/AssetRegistry.TagAndValue
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FTagAndValue
{ 
	FName                                              Tag;                                                        // 0x0000   (0x0008)  
	FString                                            Value;                                                      // 0x0008   (0x0010)  
};

/// Struct /Script/AssetRegistry.AssetRegistryDependencyOptions
/// Size: 0x0005 (5 bytes) (0x000000 - 0x000005) align 1 pad: 0x0000
struct FAssetRegistryDependencyOptions
{ 
	bool                                               bIncludeSoftPackageReferences;                              // 0x0000   (0x0001)  
	bool                                               bIncludeHardPackageReferences;                              // 0x0001   (0x0001)  
	bool                                               bIncludeSearchableNames;                                    // 0x0002   (0x0001)  
	bool                                               bIncludeSoftManagementReferences;                           // 0x0003   (0x0001)  
	bool                                               bIncludeHardManagementReferences;                           // 0x0004   (0x0001)  
};

static_assert(sizeof(UAssetRegistryImpl) == 0x07C8); // 1992 bytes (0x000028 - 0x0007C8)
static_assert(sizeof(UAssetRegistryHelpers) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UAssetRegistry) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FTagAndValue) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FAssetRegistryDependencyOptions) == 0x0005); // 5 bytes (0x000000 - 0x000005)
static_assert(offsetof(FTagAndValue, Tag) == 0x0000);
static_assert(offsetof(FTagAndValue, Value) == 0x0008);
