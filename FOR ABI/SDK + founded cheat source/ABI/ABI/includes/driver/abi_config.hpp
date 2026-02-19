#pragma once

#include <string>

namespace abi_config {
    /* Process targeting configuration */
    constexpr auto TARGET_PROCESS_NAME = L"ArenaBreakout.exe";
    constexpr auto TARGET_PROCESS_BE_NAME = L"ArenaBreakout_BE.exe";  // BE version
    constexpr auto DRIVER_SYMBOLIC_LINK = L"\\\\.\\abi_driver";
    
    /* Communication protocol settings */
    constexpr auto REQUEST_MAGIC = 0x41424900;  // "ABI\0"
    
    /* Memory offsets for Arena Breakout Infinite (UE4/UE5) */
    namespace offsets {
        namespace game {
            constexpr auto OFFSET_GWORLD = 0xab9a038;
            constexpr auto OFFSET_GOBJECTS = 0xb02c3c8;
            constexpr auto OFFSET_GNAMES = 0xb011fc0;
            constexpr auto OFFSET_NAME_DECRYPTION_KEY = 0xB011C08;
        }
        
        /* ACE-specific offsets */
        namespace ace {
            constexpr auto INTEGRITY_CHECK_INTERVAL = 1000;  // ms
            constexpr auto MAX_HOOK_ATTEMPTS = 3;
        }
    }
    
    /* Feature toggles */
    namespace features {
        constexpr auto ENABLE_ESP = true;
        constexpr auto ENABLE_RADAR = true;
        constexpr auto ENABLE_AIMBOT = false;  // Disabled by default for safety
        constexpr auto ENABLE_MENU = true;
    }
    
    /* Safety settings */
    namespace safety {
        constexpr auto MAX_READ_ATTEMPTS = 3;
        constexpr auto READ_TIMEOUT_MS = 100;
        constexpr auto RECONNECT_INTERVAL_MS = 5000;
        constexpr auto STEALTH_MODE = true;  // Use minimal memory footprint
    }
    
    /* Logging configuration */
    namespace logging {
        constexpr auto ENABLE_DEBUG_LOGS = false;  // Disable in release
        constexpr auto ENABLE_ERROR_LOGS = true;
        constexpr auto LOG_TO_FILE = false;      // Disable for stealth
        constexpr auto LOG_TO_CONSOLE = true;     // Enable for debugging
    }
}
