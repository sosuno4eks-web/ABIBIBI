
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: CoreUObject
/// dependency: G6Base

/// Class /Script/G6.G6LogicStep_CleanGameEnv
/// Size: 0x0000 (0 bytes) (0x000030 - 0x000030) align 8 pad: 0x0000
class UG6LogicStep_CleanGameEnv : public UG6LogicStep
{ 
public:
};

/// Class /Script/G6.G6LogicStep_GlobalInitialize
/// Size: 0x0000 (0 bytes) (0x000030 - 0x000030) align 8 pad: 0x0000
class UG6LogicStep_GlobalInitialize : public UG6LogicStep
{ 
public:
};

/// Class /Script/G6.G6LogicStep_LanchLua
/// Size: 0x0000 (0 bytes) (0x000030 - 0x000030) align 8 pad: 0x0000
class UG6LogicStep_LanchLua : public UG6LogicStep
{ 
public:
};

/// Class /Script/G6.G6LogicStep_Update
/// Size: 0x0000 (0 bytes) (0x000030 - 0x000030) align 8 pad: 0x0000
class UG6LogicStep_Update : public UG6LogicStep
{ 
public:
};

/// Class /Script/G6.G6LuaAppMain
/// Size: 0x0020 (32 bytes) (0x000028 - 0x000048) align 8 pad: 0x0000
class UG6LuaAppMain : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x20];                                      // 0x0028   (0x0020)  MISSED
};

/// Class /Script/G6.G6LuaScriptManager
/// Size: 0x0010 (16 bytes) (0x000028 - 0x000038) align 8 pad: 0x0000
class UG6LuaScriptManager : public UObject
{ 
public:
	bool                                               bIsGCLock;                                                  // 0x0028   (0x0001)  
	unsigned char                                      UnknownData00_7[0xF];                                       // 0x0029   (0x000F)  MISSED
};

static_assert(sizeof(UG6LogicStep_CleanGameEnv) == 0x0030); // 48 bytes (0x000030 - 0x000030)
static_assert(sizeof(UG6LogicStep_GlobalInitialize) == 0x0030); // 48 bytes (0x000030 - 0x000030)
static_assert(sizeof(UG6LogicStep_LanchLua) == 0x0030); // 48 bytes (0x000030 - 0x000030)
static_assert(sizeof(UG6LogicStep_Update) == 0x0030); // 48 bytes (0x000030 - 0x000030)
static_assert(sizeof(UG6LuaAppMain) == 0x0048); // 72 bytes (0x000028 - 0x000048)
static_assert(sizeof(UG6LuaScriptManager) == 0x0038); // 56 bytes (0x000028 - 0x000038)
