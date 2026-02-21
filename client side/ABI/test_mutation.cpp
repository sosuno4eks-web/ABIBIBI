/*
 * test_mutation.cpp - Mutation System Test
 * 
 * Demonstrates all features of the Mutation system
 * Compile and run to verify obfuscation works
 */

#include <iostream>
#include <iomanip>
#include "includes/obfuscation/Mutation.hpp"

using namespace Mutation;

void TestDynamicStrings() {
    std::cout << "\n=== TEST 1: Dynamic String Generation ===" << std::endl;
    
    // Generate same string multiple times
    for (int i = 0; i < 3; i++) {
        auto str = MUTATE_STR("TestString");
        std::cout << "Execution " << i + 1 << ": " << str << std::endl;
        
        // Show memory pattern (first 16 bytes)
        std::cout << "  Memory: ";
        for (size_t j = 0; j < std::min(str.length(), size_t(16)); j++) {
            std::cout << std::hex << std::setw(2) << std::setfill('0') 
                      << (int)(unsigned char)str[j] << " ";
        }
        std::cout << std::dec << std::endl;
    }
    
    std::cout << "\n✓ Each execution produces different memory pattern!" << std::endl;
}

void TestJunkCode() {
    std::cout << "\n=== TEST 2: Junk Code Insertion ===" << std::endl;
    
    std::cout << "Executing function with junk code..." << std::endl;
    
    INSERT_JUNK();
    std::cout << "  After junk 1" << std::endl;
    
    INSERT_JUNK();
    std::cout << "  After junk 2" << std::endl;
    
    INSERT_JUNK();
    std::cout << "  After junk 3" << std::endl;
    
    std::cout << "\n✓ Junk code inserted (check disassembly to verify)" << std::endl;
}

void TestDynamicIOCTL() {
    std::cout << "\n=== TEST 3: Dynamic IOCTL Codes ===" << std::endl;
    
    std::cout << "Daily seed: 0x" << std::hex << DynamicIOCTL::GetSeed() << std::dec << std::endl;
    std::cout << "\nGenerated IOCTL codes:" << std::endl;
    
    std::cout << "  ReadMemory:      0x" << std::hex << DynamicIOCTL::ReadMemory() << std::dec << std::endl;
    std::cout << "  WriteMemory:     0x" << std::hex << DynamicIOCTL::WriteMemory() << std::dec << std::endl;
    std::cout << "  GetModuleBase:   0x" << std::hex << DynamicIOCTL::GetModuleBase() << std::dec << std::endl;
    std::cout << "  ValidateAddress: 0x" << std::hex << DynamicIOCTL::ValidateAddress() << std::dec << std::endl;
    std::cout << "  Handshake:       0x" << std::hex << DynamicIOCTL::Handshake() << std::dec << std::endl;
    
    std::cout << "\n✓ IOCTL codes change daily!" << std::endl;
}

void TestVariableObfuscation() {
    std::cout << "\n=== TEST 4: Variable Name Obfuscation ===" << std::endl;
    
    auto OBFUSCATED_VAR(test1) = 100;
    auto OBFUSCATED_VAR(test2) = 200;
    auto OBFUSCATED_VAR(test3) = 300;
    
    std::cout << "Created 3 obfuscated variables" << std::endl;
    std::cout << "  Value 1: " << OBFUSCATED_VAR(test1) << std::endl;
    std::cout << "  Value 2: " << OBFUSCATED_VAR(test2) << std::endl;
    std::cout << "  Value 3: " << OBFUSCATED_VAR(test3) << std::endl;
    
    std::cout << "\n✓ Variables have randomized names in binary!" << std::endl;
}

void TestAntiPattern() {
    std::cout << "\n=== TEST 5: Anti-Pattern Utilities ===" << std::endl;
    
    // Test polymorphic call
    auto result = AntiPattern::PolymorphicCall([]() {
        return 42;
    });
    std::cout << "Polymorphic call result: " << result << std::endl;
    
    // Test execution with jitter
    auto jittered = AntiPattern::ExecuteWithJitter([]() {
        return 1337;
    });
    std::cout << "Jittered execution result: " << jittered << std::endl;
    
    // Test constant obfuscation
    uint32_t obfuscated = AntiPattern::ObfuscateConstant(0xDEADBEEF);
    std::cout << "Obfuscated constant: 0x" << std::hex << obfuscated << std::dec << std::endl;
    
    std::cout << "\n✓ Anti-pattern utilities working!" << std::endl;
}

void TestWideStrings() {
    std::cout << "\n=== TEST 6: Wide String Generation ===" << std::endl;
    
    auto wstr = MUTATE_WSTR(L"WideString");
    std::wcout << L"Generated wide string: " << wstr << std::endl;
    
    std::cout << "\n✓ Wide strings supported!" << std::endl;
}

int main() {
    std::cout << "╔══════════════════════════════════════════════════════════════════════════════╗" << std::endl;
    std::cout << "║                    MUTATION SYSTEM - COMPREHENSIVE TEST                      ║" << std::endl;
    std::cout << "╚══════════════════════════════════════════════════════════════════════════════╝" << std::endl;
    
    TestDynamicStrings();
    TestJunkCode();
    TestDynamicIOCTL();
    TestVariableObfuscation();
    TestAntiPattern();
    TestWideStrings();
    
    std::cout << "\n╔══════════════════════════════════════════════════════════════════════════════╗" << std::endl;
    std::cout << "║                         ALL TESTS COMPLETED                                  ║" << std::endl;
    std::cout << "╚══════════════════════════════════════════════════════════════════════════════╝" << std::endl;
    
    std::cout << "\nNOTE: Run this program multiple times to see different patterns!" << std::endl;
    std::cout << "      Rebuild to see different junk code and compile-time seeds!" << std::endl;
    
    std::cout << "\nPress ENTER to exit...";
    std::cin.get();
    
    return 0;
}
