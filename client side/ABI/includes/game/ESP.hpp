/*
 * ESP.hpp - Visual Information System
 * 
 * Features:
 * - 2D boxes around players
 * - Health bars
 * - Distance display
 * - Bone ESP (skeleton)
 * - Team colors
 * 
 * Offsets (2026 Arena Breakout):
 * - UWorld: 0x075486B8
 * - GNames: 0x073C33C0
 * 
 * Target: Arena Breakout Infinite
 * Platform: Windows 10 22H2
 */

#pragma once

#include <Windows.h>
#include <vector>
#include <cmath>
#include "../obfuscation/Mutation.hpp"

using namespace Mutation;

namespace ESP {

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * STRUCTURES
 * ═══════════════════════════════════════════════════════════════════════════
 */

struct Vector3D {
    float x, y, z;
    
    Vector3D() : x(0), y(0), z(0) {}
    Vector3D(float _x, float _y, float _z) : x(_x), y(_y), z(_z) {}
    
    Vector3D operator+(const Vector3D& v) const {
        return Vector3D(x + v.x, y + v.y, z + v.z);
    }
    
    Vector3D operator-(const Vector3D& v) const {
        return Vector3D(x - v.x, y - v.y, z - v.z);
    }
    
    Vector3D operator*(float f) const {
        return Vector3D(x * f, y * f, z * f);
    }
    
    float Distance() const {
        return std::sqrt(x * x + y * y + z * z);
    }
    
    float Distance2D() const {
        return std::sqrt(x * x + y * y);
    }
};

struct Vector2D {
    float x, y;
    
    Vector2D() : x(0), y(0) {}
    Vector2D(float _x, float _y) : x(_x), y(_y) {}
};

struct PlayerInfo {
    uint64_t pawn;                 // Player pawn address
    Vector3D position;             // World position
    Vector2D screenPos;            // Screen position (2D)
    float health;                  // Current health
    float maxHealth;               // Max health
    float distance;                // Distance from player
    bool isAlive;                  // Is player alive
    bool isEnemy;                  // Is enemy team
    bool isVisible;                // Is visible (not behind wall)
    uint32_t playerId;             // Player ID
};

struct BoneInfo {
    Vector3D position;
    Vector2D screenPos;
    bool isValid;
};

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * GAME MEMORY READER
 * ═══════════════════════════════════════════════════════════════════════════
 */

class GameMemoryReader {
private:
    // 2026 Arena Breakout offsets (MUTATED)
    static constexpr uint64_t UWORLD_OFFSET = 0x075486B8;
    static constexpr uint64_t GNAMES_OFFSET = 0x073C33C0;
    
    // Actor offsets
    static constexpr uint32_t ACTOR_ROOT_COMPONENT = 0x190;
    static constexpr uint32_t SCENE_COMPONENT_LOCATION = 0x11C;
    static constexpr uint32_t PAWN_PLAYER_STATE = 0x2A0;
    static constexpr uint32_t CHARACTER_HEALTH = 0x280;
    
public:
    // Read UWorld
    static uint64_t GetUWorld(uint64_t baseAddress) {
        INSERT_JUNK();
        
        uint64_t uworld = 0;
        // GhostReadMemory(pid, baseAddress + UWORLD_OFFSET, &uworld, sizeof(uworld));
        
        INSERT_JUNK();
        
        return uworld;
    }
    
    // Read actor position
    static Vector3D GetActorPosition(uint64_t actorAddress) {
        INSERT_JUNK();
        
        Vector3D pos(0, 0, 0);
        
        // Read root component
        uint64_t rootComponent = 0;
        // GhostReadMemory(pid, actorAddress + ACTOR_ROOT_COMPONENT, &rootComponent, sizeof(rootComponent));
        
        if (rootComponent) {
            // Read location from component
            // GhostReadMemory(pid, rootComponent + SCENE_COMPONENT_LOCATION, &pos, sizeof(pos));
        }
        
        INSERT_JUNK();
        
        return pos;
    }
    
    // Read player health
    static float GetPlayerHealth(uint64_t characterAddress) {
        INSERT_JUNK();
        
        float health = 0.0f;
        // GhostReadMemory(pid, characterAddress + CHARACTER_HEALTH, &health, sizeof(health));
        
        INSERT_JUNK();
        
        return health;
    }
    
    // Get bone position (for skeleton ESP)
    static Vector3D GetBonePosition(uint64_t skeletalMesh, uint32_t boneIndex) {
        INSERT_JUNK();
        
        Vector3D bonePos(0, 0, 0);
        
        // Read bone matrix from skeletal mesh
        // This is complex - requires reading bone transforms
        
        INSERT_JUNK();
        
        return bonePos;
    }
};

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * WORLD TO SCREEN PROJECTION
 * ═══════════════════════════════════════════════════════════════════════════
 */

class ProjectionEngine {
private:
    // Camera matrix (would be read from game memory)
    struct Matrix4x4 {
        float m[4][4];
    };
    
    static Matrix4x4 viewMatrix;
    static Matrix4x4 projMatrix;
    static float screenWidth;
    static float screenHeight;
    
public:
    // Project 3D world position to 2D screen position
    static bool WorldToScreen(const Vector3D& worldPos, Vector2D& screenPos) {
        INSERT_JUNK();
        
        // Simplified projection (full version would use actual game matrices)
        // This is a placeholder - real implementation reads from game memory
        
        // In production:
        // 1. Read camera position from game
        // 2. Read view/projection matrices
        // 3. Apply matrix transformations
        // 4. Divide by W component
        // 5. Convert to screen coordinates
        
        screenPos.x = screenWidth / 2.0f;
        screenPos.y = screenHeight / 2.0f;
        
        INSERT_JUNK();
        
        return true;
    }
    
    // Set screen dimensions
    static void SetScreenDimensions(float width, float height) {
        screenWidth = width;
        screenHeight = height;
    }
};

// Static member initialization
ProjectionEngine::Matrix4x4 ProjectionEngine::viewMatrix = {};
ProjectionEngine::Matrix4x4 ProjectionEngine::projMatrix = {};
float ProjectionEngine::screenWidth = 1920.0f;
float ProjectionEngine::screenHeight = 1080.0f;

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * ESP RENDERER
 * ═══════════════════════════════════════════════════════════════════════════
 */

class ESPRenderer {
public:
    // Draw 2D box around player
    static void DrawBox(const Vector2D& topLeft, const Vector2D& bottomRight, 
                       uint32_t color, float thickness = 2.0f) {
        INSERT_JUNK();
        
        // Draw four lines forming a box
        // Color format: ARGB (0xAARRGGBB)
        
        // Top line
        // DrawLine(topLeft.x, topLeft.y, bottomRight.x, topLeft.y, color, thickness);
        
        // Right line
        // DrawLine(bottomRight.x, topLeft.y, bottomRight.x, bottomRight.y, color, thickness);
        
        // Bottom line
        // DrawLine(bottomRight.x, bottomRight.y, topLeft.x, bottomRight.y, color, thickness);
        
        // Left line
        // DrawLine(topLeft.x, bottomRight.y, topLeft.x, topLeft.y, color, thickness);
        
        INSERT_JUNK();
    }
    
    // Draw health bar
    static void DrawHealthBar(const Vector2D& position, float health, float maxHealth) {
        INSERT_JUNK();
        
        float healthPercent = health / maxHealth;
        
        // Bar dimensions
        float barWidth = 50.0f;
        float barHeight = 5.0f;
        
        // Background (red)
        // DrawFilledRect(position.x, position.y, barWidth, barHeight, 0xFF0000FF);
        
        // Health (green)
        float healthWidth = barWidth * healthPercent;
        // DrawFilledRect(position.x, position.y, healthWidth, barHeight, 0xFF00FF00);
        
        INSERT_JUNK();
    }
    
    // Draw distance text
    static void DrawDistance(const Vector2D& position, float distance) {
        INSERT_JUNK();
        
        // Format distance string
        auto distStr = MUTATE_STR("Distance: ");
        
        // Draw text at position
        // DrawText(position.x, position.y, distStr + std::to_string((int)distance) + "m");
        
        INSERT_JUNK();
    }
    
    // Draw skeleton (bone ESP)
    static void DrawSkeleton(const std::vector<BoneInfo>& bones) {
        INSERT_JUNK();
        
        // Define bone connections (parent-child relationships)
        const int connections[][2] = {
            {0, 1},   // Head to neck
            {1, 2},   // Neck to spine
            {2, 3},   // Spine to pelvis
            {1, 4},   // Neck to left shoulder
            {4, 5},   // Left shoulder to left elbow
            {5, 6},   // Left elbow to left wrist
            {1, 7},   // Neck to right shoulder
            {7, 8},   // Right shoulder to right elbow
            {8, 9},   // Right elbow to right wrist
            {3, 10},  // Pelvis to left hip
            {10, 11}, // Left hip to left knee
            {11, 12}, // Left knee to left ankle
            {3, 13},  // Pelvis to right hip
            {13, 14}, // Right hip to right knee
            {14, 15}, // Right knee to right ankle
        };
        
        // Draw lines between connected bones
        for (const auto& conn : connections) {
            if (conn[0] < bones.size() && conn[1] < bones.size()) {
                if (bones[conn[0]].isValid && bones[conn[1]].isValid) {
                    // DrawLine(bones[conn[0]].screenPos.x, bones[conn[0]].screenPos.y,
                    //         bones[conn[1]].screenPos.x, bones[conn[1]].screenPos.y,
                    //         0xFF00FF00, 1.0f);
                }
            }
        }
        
        INSERT_JUNK();
    }
    
    // Get team color
    static uint32_t GetTeamColor(bool isEnemy) {
        if (isEnemy) {
            return 0xFFFF0000; // Red for enemies
        } else {
            return 0xFF00FF00; // Green for teammates
        }
    }
};

/*
 * ═══════════════════════════════════════════════════════════════════════════
 * ESP MANAGER
 * ═══════════════════════════════════════════════════════════════════════════
 */

class ESPManager {
private:
    std::vector<PlayerInfo> players;
    bool bEnabled = false;
    bool bShowBoxes = true;
    bool bShowHealth = true;
    bool bShowDistance = true;
    bool bShowSkeleton = false;
    
public:
    // Update ESP data
    void Update() {
        INSERT_JUNK();
        
        if (!bEnabled) {
            return;
        }
        
        players.clear();
        
        // Read all players from game memory
        // This would iterate through actor list and read player data
        
        INSERT_JUNK();
    }
    
    // Render ESP
    void Render() {
        INSERT_JUNK();
        
        if (!bEnabled) {
            return;
        }
        
        for (const auto& player : players) {
            if (!player.isAlive) {
                continue;
            }
            
            INSERT_JUNK();
            
            uint32_t color = ESPRenderer::GetTeamColor(player.isEnemy);
            
            // Draw box
            if (bShowBoxes) {
                Vector2D topLeft(player.screenPos.x - 20, player.screenPos.y - 30);
                Vector2D bottomRight(player.screenPos.x + 20, player.screenPos.y + 30);
                ESPRenderer::DrawBox(topLeft, bottomRight, color);
            }
            
            // Draw health bar
            if (bShowHealth) {
                Vector2D healthBarPos(player.screenPos.x - 25, player.screenPos.y - 35);
                ESPRenderer::DrawHealthBar(healthBarPos, player.health, player.maxHealth);
            }
            
            // Draw distance
            if (bShowDistance) {
                Vector2D distPos(player.screenPos.x - 20, player.screenPos.y + 35);
                ESPRenderer::DrawDistance(distPos, player.distance);
            }
            
            INSERT_JUNK();
        }
    }
    
    // Enable/disable ESP
    void SetEnabled(bool enabled) {
        bEnabled = enabled;
    }
    
    // Get players
    const std::vector<PlayerInfo>& GetPlayers() const {
        return players;
    }
};

} // namespace ESP

// Global ESP manager
extern ESP::ESPManager g_ESP;
