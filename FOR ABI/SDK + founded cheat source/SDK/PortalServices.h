
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType

/// Enum /Script/PortalServices.EEntitlementCacheLevelRetrieved
/// Size: 0x01 (1 bytes)
enum class EEntitlementCacheLevelRetrieved : uint8_t
{
	EEntitlementCacheLevelRetrieved__None                                            = 0,
	EEntitlementCacheLevelRetrieved__Memory                                          = 1,
	EEntitlementCacheLevelRetrieved__Disk                                            = 2
};

/// Enum /Script/PortalServices.EEntitlementCacheLevelRequest
/// Size: 0x01 (1 bytes)
enum class EEntitlementCacheLevelRequest : uint8_t
{
	EEntitlementCacheLevelRequest__Memory                                            = 1,
	EEntitlementCacheLevelRequest__Disk                                              = 2
};

/// Struct /Script/PortalServices.PortalUserIsEntitledToItemResult
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FPortalUserIsEntitledToItemResult
{ 
	FString                                            ItemID;                                                     // 0x0000   (0x0010)  
	bool                                               IsEntitled;                                                 // 0x0010   (0x0001)  
	EEntitlementCacheLevelRetrieved                    RetrievedFromCacheLevel;                                    // 0x0011   (0x0001)  
	unsigned char                                      UnknownData00_7[0x6];                                       // 0x0012   (0x0006)  MISSED
};

/// Struct /Script/PortalServices.PortalUserDetails
/// Size: 0x0050 (80 bytes) (0x000000 - 0x000050) align 8 pad: 0x0000
struct FPortalUserDetails
{ 
	FText                                              DisplayName;                                                // 0x0000   (0x0018)  
	FText                                              Email;                                                      // 0x0018   (0x0018)  
	FText                                              RealName;                                                   // 0x0030   (0x0018)  
	bool                                               IsSignedIn;                                                 // 0x0048   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0049   (0x0007)  MISSED
};

static_assert(sizeof(FPortalUserIsEntitledToItemResult) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FPortalUserDetails) == 0x0050); // 80 bytes (0x000000 - 0x000050)
static_assert(offsetof(FPortalUserIsEntitledToItemResult, ItemID) == 0x0000);
static_assert(offsetof(FPortalUserIsEntitledToItemResult, RetrievedFromCacheLevel) == 0x0011);
static_assert(offsetof(FPortalUserDetails, DisplayName) == 0x0000);
static_assert(offsetof(FPortalUserDetails, Email) == 0x0018);
static_assert(offsetof(FPortalUserDetails, RealName) == 0x0030);
