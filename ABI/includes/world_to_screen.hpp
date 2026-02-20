#pragma once

#include "unreal_structures.hpp"
#include <cmath>

/* ── World to Screen Projection for Unreal Engine ───────────────────────── */

/*
 * WorldToScreen - Converts 3D world coordinates to 2D screen coordinates
 * Updated for Unreal Engine coordinate system and camera projection
 */

/* Matrix structure for view projection */
typedef struct D3DMATRIX {
    float _11, _12, _13, _14;
    float _21, _22, _23, _24;
    float _31, _32, _33, _34;
    float _41, _42, _43, _44;
} D3DMATRIX, *PD3DMATRIX;

/* Matrix operations */
namespace MatrixMath {
    /* Create rotation matrix from rotator */
    D3DMATRIX Matrix(const FRotator& rot) {
        float radX = rot.Pitch * (M_PI / 180.0f);
        float radY = rot.Yaw * (M_PI / 180.0f);
        float radZ = rot.Roll * (M_PI / 180.0f);
        
        float cosX = cosf(radX);
        float sinX = sinf(radX);
        float cosY = cosf(radY);
        float sinY = sinf(radY);
        float cosZ = cosf(radZ);
        float sinZ = sinf(radZ);
        
        D3DMATRIX result = {};
        
        // Combined rotation matrix (ZYX order)
        result._11 = cosY * cosZ;
        result._12 = sinX * sinY * cosZ - cosX * sinZ;
        result._13 = cosX * sinY * cosZ + sinX * sinZ;
        
        result._21 = cosY * sinZ;
        result._22 = sinX * sinY * sinZ + cosX * cosZ;
        result._23 = cosX * sinY * sinZ - sinX * cosZ;
        
        result._31 = -sinY;
        result._32 = sinX * cosY;
        result._33 = cosX * cosY;
        
        result._44 = 1.0f;
        
        return result;
    }
    
    /* Vector dot product */
    float Dot(const FVector& a, const FVector& b) {
        return a.X * b.X + a.Y * b.Y + a.Z * b.Z;
    }
}

/* Main WorldToScreen function */
BOOLEAN WorldToScreen(const FMinimalViewInfo& camera, const FVector& worldPos, 
                     FVector2D* screenPos, float screenWidth, float screenHeight) 
{
    if (!screenPos) return FALSE;
    
    // Get camera rotation matrix
    D3DMATRIX rotMatrix = MatrixMath::Matrix(camera.Rotation);
    
    // Extract camera axes
    FVector vAxisX = { rotMatrix._11, rotMatrix._12, rotMatrix._13 };
    FVector vAxisY = { rotMatrix._21, rotMatrix._22, rotMatrix._23 };
    FVector vAxisZ = { rotMatrix._31, rotMatrix._32, rotMatrix._33 };
    
    // Calculate delta from camera to world position
    FVector vDelta = {
        worldPos.X - camera.Location.X,
        worldPos.Y - camera.Location.Y,
        worldPos.Z - camera.Location.Z
    };
    
    // Transform to camera space
    FVector vTransformed = {
        MatrixMath::Dot(vDelta, vAxisY),
        MatrixMath::Dot(vDelta, vAxisZ),
        MatrixMath::Dot(vDelta, vAxisX)
    };
    
    // Check if behind camera
    if (vTransformed.Z < 1.0f) {
        vTransformed.Z = 1.0f;
    }
    
    // Calculate screen center
    float screenCenterX = screenWidth * 0.5f;
    float screenCenterY = screenHeight * 0.5f;
    
    // Calculate aspect ratio
    float aspectRatio = screenWidth / screenHeight;
    if (aspectRatio < 4.0f / 3.0f) {
        aspectRatio = 4.0f / 3.0f;
    }
    
    // Calculate FOV scaling
    float fovScale = (aspectRatio / (16.0f / 9.0f)) * tanf(camera.FOV * (M_PI / 360.0f));
    
    // Project to screen coordinates
    screenPos->X = screenCenterX + (vTransformed.X * screenCenterX) / (fovScale * vTransformed.Z);
    screenPos->Y = screenCenterY - (vTransformed.Y * screenCenterX) / (fovScale * vTransformed.Z);
    
    // Check if on screen
    return (screenPos->X >= 0.0f && screenPos->X <= screenWidth &&
            screenPos->Y >= 0.0f && screenPos->Y <= screenHeight);
}

/* Enhanced WorldToScreen with distance check */
BOOLEAN WorldToScreenEx(const FMinimalViewInfo& camera, const FVector& worldPos,
                        FVector2D* screenPos, float screenWidth, float screenHeight,
                        float* distance = nullptr, float maxDistance = 1000.0f)
{
    if (!screenPos) return FALSE;
    
    // Calculate distance
    if (distance) {
        FVector delta = {
            worldPos.X - camera.Location.X,
            worldPos.Y - camera.Location.Y,
            worldPos.Z - camera.Location.Z
        };
        *distance = sqrtf(delta.X * delta.X + delta.Y * delta.Y + delta.Z * delta.Z);
        
        // Check max distance
        if (*distance > maxDistance) {
            return FALSE;
        }
    }
    
    return WorldToScreen(camera, worldPos, screenPos, screenWidth, screenHeight);
}

/* WorldToScreen for bone positions */
BOOLEAN BoneToScreen(const FMinimalViewInfo& camera, const FVector& bonePos,
                    FVector2D* screenPos, float screenWidth, float screenHeight)
{
    return WorldToScreenEx(camera, bonePos, screenPos, screenWidth, screenHeight);
}

/* Check if point is in screen bounds */
BOOLEAN IsOnScreen(const FVector2D& screenPos, float screenWidth, float screenHeight,
                   float margin = 0.0f)
{
    return (screenPos.X >= -margin && screenPos.X <= screenWidth + margin &&
            screenPos.Y >= -margin && screenPos.Y <= screenHeight + margin);
}

/* Get screen distance from center (for ESP sizing) */
float GetScreenDistance(const FVector2D& screenPos, float screenWidth, float screenHeight)
{
    float centerX = screenWidth * 0.5f;
    float centerY = screenHeight * 0.5f;
    
    float dx = screenPos.X - centerX;
    float dy = screenPos.Y - centerY;
    
    return sqrtf(dx * dx + dy * dy);
}

/* Calculate box size based on distance */
void CalculateBoxSize(float distance, FVector2D* min, FVector2D* max, 
                     float screenWidth, float screenHeight, float baseSize = 50.0f)
{
    if (!min || !max) return;
    
    // Scale size based on distance
    float scaleFactor = max(100.0f, 5000.0f / distance);
    float boxSize = baseSize * scaleFactor;
    
    // Calculate box corners (centered at origin for now)
    min->X = -boxSize * 0.5f;
    min->Y = -boxSize * 0.5f;
    max->X = boxSize * 0.5f;
    max->Y = boxSize * 0.5f;
}

/* Convert screen coordinates to normalized (0.0-1.0) */
FVector2D NormalizeScreenCoords(const FVector2D& screenPos, float screenWidth, float screenHeight)
{
    return FVector2D(
        screenPos.X / screenWidth,
        screenPos.Y / screenHeight
    );
}

/* Convert normalized coordinates back to screen */
FVector2D DenormalizeScreenCoords(const FVector2D& normalizedPos, float screenWidth, float screenHeight)
{
    return FVector2D(
        normalizedPos.X * screenWidth,
        normalizedPos.Y * screenHeight
    );
}
