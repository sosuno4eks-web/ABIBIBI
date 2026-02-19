#pragma once

#include <cstdint>

struct Bones{
    enum : int {
        Root = 0,
        Pelvis = 1,
        Spine_01 = 12,
        Spine_02 = 13,
        Spine_03 = 14,
        Neck = 15,
        Head = 16,

        // Left Leg
        Thigh_L = 2,
        Calf_L = 4,
        Foot_L = 5,

        // Right Leg
        Thigh_R = 7,
        Calf_R = 9,
        Foot_R = 10,

        // Left Arm
        Clavicle_L = 50,
        UpperArm_L = 51,
        LowerArm_L = 52,
        Hand_L = 54,

        // Right Arm
        Clavicle_R = 20,
        UpperArm_R = 21,
        LowerArm_R = 22,
        Hand_R = 24,

        // Hands
        Item_R = 40,
        Item_L = 70,

        // Camera
        Camera = 80
    };
};

struct FVector {
    float x, y, z;

    FVector operator-(const FVector& other) const {
        return FVector{ x - other.x, y - other.y, z - other.z };
    }

    float Dot(const FVector& other) const {
        return x * other.x + y * other.y + z * other.z;
    }

    float Distance(const FVector& other) const {
        float dx = x - other.x;
        float dy = y - other.y;
        float dz = z - other.z;

        return sqrtf(dx * dx + dy * dy + dz * dz);
    }
};

struct FRotator {
    float pitch, yaw, roll;

    FRotator operator-(const FRotator& other) const {
        return FRotator{ pitch - other.pitch, yaw - other.yaw, roll - other.roll };
    }
};

struct FVector2D {
    int x, y;
};

struct FMinimalViewInfo {
    FVector Location;      
    FRotator Rotation;     
    float FOV;             
    float ShadowFOV;       
    float DesiredFOV;      
    float OrthoWidth;
};

struct Player {
    uintptr_t actor_mesh;
    uintptr_t actor_state;
    uintptr_t actor_pawn;
    uintptr_t actor_rootcomponent;
    uint32_t actor_id;
    std::string actor_name;
    std::string player_name;
    bool bot = false;
};