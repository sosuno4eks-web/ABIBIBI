#include <iostream>
#include <print>
#include "skcrypt/xor.hpp"
#include "game/cache.hpp"
#include "overlay/overlay.hpp"
#include "game/settings.hpp"
#include "../includes/obfuscation/Mutation.hpp"

// Ghost Mode communication functions
extern bool InitializeGhostCommunication();
extern bool InitializeGameLogic();
extern void GameLogicLoop();

using namespace Mutation;

int main() {
	// Dynamic strings for stealth
	auto OBFUSCATED_VAR(banner1) = MUTATE_STR("=== ABI Client - Ghost Mode Edition ===");
	auto OBFUSCATED_VAR(banner2) = MUTATE_STR("Driver: MyDriver1 (KDMapper loaded)");
	auto OBFUSCATED_VAR(banner3) = MUTATE_STR("Communication: Ghost Mode (Syscall Hijacking)");
	auto OBFUSCATED_VAR(banner4) = MUTATE_STR("Offsets: 2026 Dumpspace (UWorld: 0x075486B8, GNames: 0x073C33C0)");
	
	std::println(OBFUSCATED_VAR(banner1));
	std::println(OBFUSCATED_VAR(banner2));
	std::println(OBFUSCATED_VAR(banner3));
	std::println(OBFUSCATED_VAR(banner4));
	std::println("");
	
	INSERT_JUNK();
	
	// NO driver loading code - driver is already mapped by KDMapper
	// NO manual map logic - we use the pre-loaded driver
	// NO IOCTLs - we use Ghost Mode syscall hijacking
	
	// Initialize Ghost Mode communication
	auto OBFUSCATED_VAR(initMsg) = MUTATE_STR("Initializing Ghost Mode communication...");
	std::println(OBFUSCATED_VAR(initMsg));
	
	INSERT_JUNK();
	
	if (!InitializeGhostCommunication()) {
		auto OBFUSCATED_VAR(failMsg) = MUTATE_STR("Failed to initialize Ghost Mode");
		auto OBFUSCATED_VAR(check1) = MUTATE_STR("Make sure:");
		auto OBFUSCATED_VAR(check2) = MUTATE_STR("  1. MyDriver1 is loaded via KDMapper");
		auto OBFUSCATED_VAR(check3) = MUTATE_STR("  2. ArenaBreakout.exe is running");
		auto OBFUSCATED_VAR(check4) = MUTATE_STR("  3. Syscall hijack is installed");
		
		std::println(OBFUSCATED_VAR(failMsg));
		std::println(OBFUSCATED_VAR(check1));
		std::println(OBFUSCATED_VAR(check2));
		std::println(OBFUSCATED_VAR(check3));
		std::println(OBFUSCATED_VAR(check4));
		std::cin.get();
		return 1;
	}
	
	INSERT_JUNK();
	
	// Initialize game logic
	auto OBFUSCATED_VAR(gameMsg) = MUTATE_STR("Initializing game logic...");
	std::println(OBFUSCATED_VAR(gameMsg));
	
	INSERT_JUNK();
	
	if (!InitializeGameLogic()) {
		auto OBFUSCATED_VAR(failMsg) = MUTATE_STR("Failed to initialize game logic");
		std::println(OBFUSCATED_VAR(failMsg));
		std::cin.get();
		return 1;
	}
	
	INSERT_JUNK();
	
	// Initialize overlay with anti-screenshot protection
	auto OBFUSCATED_VAR(overlayMsg) = MUTATE_STR("Initializing overlay...");
	std::println(OBFUSCATED_VAR(overlayMsg));
	
	INSERT_JUNK();
	
	if (!overlay::InitializeOverlay()) {
		auto OBFUSCATED_VAR(failMsg) = MUTATE_STR("Failed to initialize overlay");
		std::println(OBFUSCATED_VAR(failMsg));
		std::cin.get();
		return 1;
	}
	
	INSERT_JUNK();
	
	// Start cache threads
	auto OBFUSCATED_VAR(cacheMsg) = MUTATE_STR("Starting cache threads...");
	std::println(OBFUSCATED_VAR(cacheMsg));
	
	INSERT_JUNK();
	
	std::thread(cache::cache_loop).detach();
	std::thread(cache::cache_important_loop).detach();
	std::thread(cache::cache_player_loop).detach();
	
	INSERT_JUNK();
	
	// Start game logic thread
	auto OBFUSCATED_VAR(logicMsg) = MUTATE_STR("Starting game logic thread...");
	std::println(OBFUSCATED_VAR(logicMsg));
	
	INSERT_JUNK();
	
	std::thread(GameLogicLoop).detach();
	
	INSERT_JUNK();
	
	auto OBFUSCATED_VAR(runMsg) = MUTATE_STR("=== ABI Client Running (Ghost Mode) ===");
	auto OBFUSCATED_VAR(exitMsg) = MUTATE_STR("Press ENTER to exit");
	
	std::println("");
	std::println(OBFUSCATED_VAR(runMsg));
	std::println(OBFUSCATED_VAR(exitMsg));
	std::println("");
	
	// Main loop
	while (settings::running && overlay::g_Running) {
		INSERT_JUNK();
		
		overlay::ProcessMessages();
		overlay::BeginFrame();
		
		INSERT_JUNK();
		
		// Rendering code goes here
		// ESP, radar, etc.
		
		INSERT_JUNK();
		
		overlay::EndFrame();
		std::this_thread::sleep_for(std::chrono::milliseconds(16)); // ~60 FPS
	}
	
	INSERT_JUNK();
	
	// Cleanup
	auto OBFUSCATED_VAR(shutdownMsg) = MUTATE_STR("Shutting down...");
	std::println(OBFUSCATED_VAR(shutdownMsg));
	
	INSERT_JUNK();
	
	settings::running = false;
	overlay::CleanupOverlay();
	
	INSERT_JUNK();
	
	std::cin.get();
	return 0;
}