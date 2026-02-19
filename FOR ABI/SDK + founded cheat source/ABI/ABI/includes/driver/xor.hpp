#pragma once

#include <string>

/* Simple XOR encryption for string obfuscation */
class XOR {
public:
    static std::string encrypt(const std::string& data, char key = 0xAA) {
        std::string result = data;
        for (size_t i = 0; i < result.size(); ++i) {
            result[i] ^= key;
        }
        return result;
    }
    
    static std::string decrypt(const std::string& data, char key = 0xAA) {
        return encrypt(data, key); // XOR is symmetric
    }
};

/* Macro for compile-time string encryption */
#define XORS(s) XOR::decrypt(s)
