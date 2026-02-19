
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine

/// Class /Script/BlueprintFileUtils.BlueprintFileUtilsBPLibrary
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UBlueprintFileUtilsBPLibrary : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/BlueprintFileUtils.BlueprintFileUtilsBPLibrary.MoveFile
	// bool MoveFile(FString DestFilename, FString SrcFilename, bool bReplace, bool bEvenIfReadOnly);                           // [0x16df980] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/BlueprintFileUtils.BlueprintFileUtilsBPLibrary.MakeDirectory
	// bool MakeDirectory(FString Path, bool bCreateTree);                                                                      // [0x16df8a0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/BlueprintFileUtils.BlueprintFileUtilsBPLibrary.GetUserDirectory
	// FString GetUserDirectory();                                                                                              // [0x16df820] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/BlueprintFileUtils.BlueprintFileUtilsBPLibrary.FindRecursive
	// bool FindRecursive(FString StartDirectory, TArray<FString>& FoundPaths, FString Wildcard, bool bFindFiles, bool bFindDirectories); // [0x16df620] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/BlueprintFileUtils.BlueprintFileUtilsBPLibrary.FindFiles
	// bool FindFiles(FString Directory, TArray<FString>& FoundFiles, FString FileExtension);                                   // [0x16df490] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/BlueprintFileUtils.BlueprintFileUtilsBPLibrary.FileExists
	// bool FileExists(FString Filename);                                                                                       // [0x16df3f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/BlueprintFileUtils.BlueprintFileUtilsBPLibrary.DirectoryExists
	// bool DirectoryExists(FString Directory);                                                                                 // [0x16df350] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/BlueprintFileUtils.BlueprintFileUtilsBPLibrary.DeleteFile
	// bool DeleteFile(FString Filename, bool bMustExist, bool bEvenIfReadOnly);                                                // [0x16df220] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/BlueprintFileUtils.BlueprintFileUtilsBPLibrary.DeleteDirectory
	// bool DeleteDirectory(FString Directory, bool bMustExist, bool bDeleteRecursively);                                       // [0x16df0f0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/BlueprintFileUtils.BlueprintFileUtilsBPLibrary.CopyFile
	// bool CopyFile(FString DestFilename, FString SrcFilename, bool bReplace, bool bEvenIfReadOnly);                           // [0x16def70] Final|Native|Static|Public|BlueprintCallable 
};

static_assert(sizeof(UBlueprintFileUtilsBPLibrary) == 0x0028); // 40 bytes (0x000028 - 0x000028)
