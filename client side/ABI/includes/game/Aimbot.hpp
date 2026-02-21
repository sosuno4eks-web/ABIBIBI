/*
 * Aimbot.hpp - Kernel-Level Humanized Aimbot
 * 
 * CRITICAL REQUIREMENTS:
 * - NO mouse_event() calls (instant detection)
 * - NO memory aimbot (ACE detects pattern)
 * - Kernel input injection via driver
 * - Logarithmic smoothing (human-like)
 * - Random jitter & Bezier curves
 * - Random delays between actions
 * - Dynamic target bone selection
 * - FOV circle with customizable radius
 * 
 * Target: Arena Breakout Infinite (ACE Anti-Cheat)
 * Platform: Windows 10 22H2
 */

#pragma once

#include <Windows.h>
#include <cmath>
#include <random>
#include <chrono>
#include <vector>
#include "../obfuscation/Mutation.hpp"

using namespace Mutation;

namespace Aimbot {

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * CONFIGURATION
 * ═══════════════════════════════════════════════════════════════════════════
 */

struct AimbotConfig {
    // Smoothing parameters (humanization)
    float fSmoothFactor = 0.15f;           // Logarithmic smoothing (0.1-0.3)
    float fRandomSmooth = 0.05f;           // Random variation in smoothing
    float fJitterAmount = 0.8f;            // Micro-jitter (pixels)
    float fRandomJitter = 0.3f;            // Random jitter variation
    
    // Timing
    uint32_t uMinDelay = 50;               // Min ms between actions
    uint32_t uMaxDelay = 200;              // Max ms between actions
    uint32_t uReactionTime = 100;          // Reaction time simulation
    
    // FOV
    float fFOVRadius = 150.0f;             // FOV circle radius (pixels)
    bool bShowFOV = true;                  // Draw FOV circle
    
    // Targeting
    bool bEnabled = false;                 // Aimbot enabled
    bool bAutoFire = false;                // Auto-fire when locked
    float fHeadBoneOffset = 0.0f;          // Random offset from head center
    
    // Bezier curve parameters
    uint32_t uBezierPoints = 5;            // Number of curve points
    float fCurveDeviation = 2.0f;          // Max deviation from straight line
};

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * VECTOR MATH (Humanization)
 * ═══════════════════════════════════════════════════════════════════════════
 */

struct Vector2D {
    float x, y;
    
    Vector2D() : x(0), y(0) {}
    Vector2D(float _x, float _y) : x(_x), y(_y) {}
    
    Vector2D operator+(const Vector2D& v) const {
        return Vector2D(x + v.x, y + v.y);
    }
    
    Vector2D operator-(const Vector2D& v) const {
        return Vector2D(x - v.x, y - v.y);
    }
    
    Vector2D operator*(float f) const {
        return Vector2D(x * f, y * f);
    }
    
    float Distance() const {
        return std::sqrt(x * x + y * y);
    }
    
    Vector2D Normalize() const {
        float dist = Distance();
        if (dist < 0.001f) return Vector2D(0, 0);
        return Vector2D(x / dist, y / dist);
    }
};

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * HUMANIZATION ENGINE
 * ═══════════════════════════════════════════════════════════════════════════
 */

class HumanizationEngine {
private:
    static std::mt19937 rng;
    static std::uniform_real_distribution<float> dist_smooth;
    static std::uniform_real_distribution<float> dist_jitter;
    static std::uniform_int_distribution<uint32_t> dist_delay;
    
public:
    // Logarithmic smoothing (NOT linear - human-like)
    static float LogarithmicSmoothing(float current, float target, float smoothFactor) {
        INSERT_JUNK();
        
        // Logarithmic interpolation: smoother at start, faster at end
        float diff = target - current;
        
        // Add random variation to smoothing
        float randomSmooth = dist_smooth(rng) * 0.1f;
        float actualSmooth = smoothFactor + randomSmooth;
        
        // Logarithmic curve: log(1 + x) for smooth acceleration
        float logSmooth = std::log(1.0f + std::abs(diff)) * actualSmooth;
        
        INSERT_JUNK();
        
        if (diff > 0) {
            return current + logSmooth;
        } else {
            return current - logSmooth;
        }
    }
    
    // Add micro-jitter (human hand tremor)
    static Vector2D AddJitter(const Vector2D& pos, float jitterAmount) {
        INSERT_JUNK();
        
        float jitterX = (dist_jitter(rng) - 0.5f) * jitterAmount * 2.0f;
        float jitterY = (dist_jitter(rng) - 0.5f) * jitterAmount * 2.0f;
        
        INSERT_JUNK();
        
        return Vector2D(pos.x + jitterX, pos.y + jitterY);
    }
    
    // Bezier curve interpolation (smooth, non-linear path)
    static Vector2D BezierInterpolate(const Vector2D& start, const Vector2D& end, float t) {
        INSERT_JUNK();
        
        // Quadratic Bezier with random control point
        float randomDeviation = (dist_jitter(rng) - 0.5f) * 4.0f;
        Vector2D controlPoint = (start + end) * 0.5f;
        controlPoint.y += randomDeviation;
        
        // Bezier formula: B(t) = (1-t)²P0 + 2(1-t)tP1 + t²P2
        float mt = 1.0f - t;
        float mt2 = mt * mt;
        float t2 = t * t;
        float mt2t2 = 2.0f * mt * t;
        
        Vector2D result = start * mt2 + controlPoint * mt2t2 + end * t2;
        
        INSERT_JUNK();
        
        return result;
    }
    
    // Random reaction time (human-like delay)
    static uint32_t GetRandomDelay(uint32_t minMs, uint32_t maxMs) {
        INSERT_JUNK();
        
        uint32_t delay = dist_delay(rng) % (maxMs - minMs + 1) + minMs;
        
        // Add occasional longer delays (human behavior)
        if (dist_jitter(rng) < 0.1f) {
            delay += 100 + (dist_delay(rng) % 200);
        }
        
        INSERT_JUNK();
        
        return delay;
    }
    
    // Random target bone offset (not always perfect head center)
    static Vector2D GetRandomBoneOffset(float maxOffset) {
        INSERT_JUNK();
        
        float offsetX = (dist_jitter(rng) - 0.5f) * maxOffset * 2.0f;
        float offsetY = (dist_jitter(rng) - 0.5f) * maxOffset * 2.0f;
        
        INSERT_JUNK();
        
        return Vector2D(offsetX, offsetY);
    }
};

// Static member initialization
std::mt19937 HumanizationEngine::rng(
    static_cast<uint32_t>(
        std::chrono::high_resolution_clock::now().time_since_epoch().count()
    )
);
std::uniform_real_distribution<float> HumanizationEngine::dist_smooth(0.0f, 1.0f);
std::uniform_real_distribution<float> HumanizationEngine::dist_jitter(0.0f, 1.0f);
std::uniform_int_distribution<uint32_t> HumanizationEngine::dist_delay(0, 1000);

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * AIMBOT CORE
 * ═══════════════════════════════════════════════════════════════════════════
 */

class AimbotCore {
private:
    AimbotConfig config;
    Vector2D currentAim;
    Vector2D targetAim;
    uint32_t lastUpdateTime;
    bool isLocked;
    
public:
    AimbotCore() : currentAim(0, 0), targetAim(0, 0), lastUpdateTime(0), isLocked(false) {}
    
    // Update aimbot state
    void Update(const Vector2D& targetPos) {
        INSERT_JUNK();
        
        if (!config.bEnabled) {
            return;
        }
        
        INSERT_JUNK();
        
        // Check if target is in FOV
        Vector2D diff = targetPos - currentAim;
        float distance = diff.Distance();
        
        if (distance > config.fFOVRadius) {
            isLocked = false;
            return;
        }
        
        INSERT_JUNK();
        
        isLocked = true;
        targetAim = targetPos;
        
        // Apply humanized smoothing
        currentAim.x = HumanizationEngine::LogarithmicSmoothing(
            currentAim.x,
            targetAim.x,
            config.fSmoothFactor + config.fRandomSmooth
        );
        
        currentAim.y = HumanizationEngine::LogarithmicSmoothing(
            currentAim.y,
            targetAim.y,
            config.fSmoothFactor + config.fRandomSmooth
        );
        
        INSERT_JUNK();
        
        // Add micro-jitter
        currentAim = HumanizationEngine::AddJitter(currentAim, config.fJitterAmount);
        
        INSERT_JUNK();
    }
    
    // Get current aim position
    Vector2D GetAimPosition() const {
        return currentAim;
    }
    
    // Check if locked on target
    bool IsLocked() const {
        return isLocked;
    }
    
    // Set configuration
    void SetConfig(const AimbotConfig& cfg) {
        config = cfg;
    }
    
    // Get configuration
    const AimbotConfig& GetConfig() const {
        return config;
    }
};

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * KERNEL INPUT INJECTION (NO mouse_event!)
 * ═══════════════════════════════════════════════════════════════════════════
 */

class KernelInputInjector {
public:
    // Send aim coordinates to driver (NOT mouse_event)
    static bool SendAimToDriver(const Vector2D& aimPos) {
        INSERT_JUNK();
        
        // This would call the driver via Ghost Mode
        // The driver injects directly into mouse stack
        // NO mouse_event() - that's instant detection!
        
        // Placeholder: In production, this calls GhostWriteMemory
        // to update mouse position in kernel space
        
        INSERT_JUNK();
        
        return true;
    }
    
    // Send fire command to driver
    static bool SendFireCommand() {
        INSERT_JUNK();
        
        // Driver injects mouse click directly
        // NOT mouse_event() - that's detected
        
        INSERT_JUNK();
        
        return true;
    }
};

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * FOV VISUALIZATION
 * ═══════════════════════════════════════════════════════════════════════════
 */

class FOVVisualizer {
public:
    // Draw FOV circle on overlay
    static void DrawFOVCircle(float centerX, float centerY, float radius) {
        INSERT_JUNK();
        
        // Draw circle using line segments
        const int segments = 32;
        const float angleStep = 6.28318f / segments; // 2π / segments
        
        for (int i = 0; i < segments; i++) {
            float angle1 = angleStep * i;
            float angle2 = angleStep * (i + 1);
            
            float x1 = centerX + radius * std::cos(angle1);
            float y1 = centerY + radius * std::sin(angle1);
            float x2 = centerX + radius * std::cos(angle2);
            float y2 = centerY + radius * std::sin(angle2);
            
            // Draw line from (x1,y1) to (x2,y2)
            // Color: Green if locked, Yellow if not
            // This would use overlay rendering
        }
        
        INSERT_JUNK();
    }
};

} // namespace Aimbot

// Global aimbot instance
extern Aimbot::AimbotCore g_Aimbot;
extern Aimbot::AimbotConfig g_AimbotConfig;
