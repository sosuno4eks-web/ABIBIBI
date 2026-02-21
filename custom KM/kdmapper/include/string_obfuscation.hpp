#pragma once
#include <string>
#include <Windows.h>

// Простая XOR обфускация строк для защиты от статического анализа
namespace obf {
    constexpr char key = 0x7A; // XOR ключ

    // Compile-time XOR шифрование
    template<size_t N>
    struct ObfuscatedString {
        char data[N];
        
        constexpr ObfuscatedString(const char(&str)[N]) : data{} {
            for (size_t i = 0; i < N; i++) {
                data[i] = str[i] ^ key;
            }
        }
        
        std::string decrypt() const {
            std::string result;
            result.reserve(N);
            for (size_t i = 0; i < N - 1; i++) { // -1 чтобы не включать null terminator
                result += (data[i] ^ key);
            }
            return result;
        }
        
        std::wstring decryptW() const {
            std::wstring result;
            result.reserve(N);
            for (size_t i = 0; i < N - 1; i++) {
                result += static_cast<wchar_t>(data[i] ^ key);
            }
            return result;
        }
    };
    
    // Helper для создания обфусцированных строк
    #define OBF_STR(str) (obf::ObfuscatedString<sizeof(str)>(str).decrypt())
    #define OBF_WSTR(str) (obf::ObfuscatedString<sizeof(str)>(str).decryptW())
}

// Генератор случайных имен для драйвера
namespace random_names {
    inline std::string generate_driver_name() {
        static const char* prefixes[] = {
            "Rtk", "Intel", "Nvidia", "AMD", "Asus", "MSI", "Gigabyte"
        };
        static const char* suffixes[] = {
            "Audio", "Network", "USB", "PCI", "ACPI", "Service", "Driver"
        };
        static const char* versions[] = {
            "64", "x64", "v2", "v3", "HD", "Pro"
        };
        
        srand((unsigned)time(NULL) * GetCurrentThreadId());
        
        std::string name;
        name += prefixes[rand() % (sizeof(prefixes) / sizeof(prefixes[0]))];
        name += suffixes[rand() % (sizeof(suffixes) / sizeof(suffixes[0]))];
        name += versions[rand() % (sizeof(versions) / sizeof(versions[0]))];
        
        return name;
    }
    
    inline std::wstring generate_driver_nameW() {
        std::string name = generate_driver_name();
        return std::wstring(name.begin(), name.end());
    }
    
    inline std::string generate_device_name() {
        static const char* device_names[] = {
            "RtkAudioService",
            "IntelAudioHD",
            "NvidiaAudioHD",
            "RealtekHDAudio",
            "AsusAudioService",
            "MSIAudioBoost",
            "AudioEnhancement"
        };
        
        srand((unsigned)time(NULL) * GetCurrentThreadId() * rand());
        return device_names[rand() % (sizeof(device_names) / sizeof(device_names[0]))];
    }
    
    inline std::wstring generate_device_nameW() {
        std::string name = generate_device_name();
        return std::wstring(name.begin(), name.end());
    }
}
