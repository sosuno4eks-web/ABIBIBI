#include "world_to_screen_ue426.h"

/* ── UE 4.26.1 World to Screen Projection ───────────────────────── */

/*
 * Rewritten for UE 4.26.1 projection matrix logic
 * No legacy Unity/Rust/EAC references
 * Target: ArenaBreakout.exe
 */

/* Matrix operations for UE 4.26.1 */
namespace MatrixMath {
    /* Create view matrix from camera */
    void CreateViewMatrix(const FVector& location, const FRotator& rotation, float matrix[4][4]) {
        // Convert rotation to radians
        float pitch = rotation.Pitch * (M_PI / 180.0f);
        float yaw = rotation.Yaw * (M_PI / 180.0f);
        float roll = rotation.Roll * (M_PI / 180.0f);
        
        float cosPitch = cosf(pitch);
        float sinPitch = sinf(pitch);
        float cosYaw = cosf(yaw);
        float sinYaw = sinf(yaw);
        float cosRoll = cosf(roll);
        float sinRoll = sinf(roll);
        
        // UE 4.26.1 view matrix (right-handed coordinate system)
        matrix[0][0] = cosRoll * cosYaw;
        matrix[0][1] = cosRoll * sinPitch * cosYaw - sinRoll * sinYaw;
        matrix[0][2] = cosRoll * sinPitch * sinYaw + sinRoll * cosYaw;
        matrix[0][3] = 0.0f;
        
        matrix[1][0] = sinRoll * cosPitch + cosRoll * sinYaw;
        matrix[1][1] = cosRoll * cosPitch * cosYaw - sinRoll * sinPitch * sinYaw;
        matrix[1][2] = -cosRoll * sinPitch;
        matrix[1][3] = 0.0f;
        
        matrix[2][0] = -sinPitch * cosYaw;
        matrix[2][1] = sinPitch * sinYaw;
        matrix[2][2] = cosPitch * cosYaw;
        matrix[2][3] = 0.0f;
        
        matrix[3][0] = location.X;
        matrix[3][1] = location.Y;
        matrix[3][2] = location.Z;
        matrix[3][3] = 1.0f;
    }
    
    /* Create projection matrix for UE 4.26.1 */
    void CreateProjectionMatrix(float fov, float aspectRatio, float nearPlane, float farPlane, float matrix[4][4]) {
        float yScale = 1.0f / tanf(fov * 0.5f * (M_PI / 180.0f));
        float xScale = yScale / aspectRatio;
        
        // UE 4.26.1 projection matrix (right-handed, depth range 0-1)
        matrix[0][0] = xScale;
        matrix[0][1] = 0.0f;
        matrix[0][2] = 0.0f;
        matrix[0][3] = 0.0f;
        
        matrix[1][0] = 0.0f;
        matrix[1][1] = yScale;
        matrix[1][2] = 0.0f;
        matrix[1][3] = 0.0f;
        
        matrix[2][0] = 0.0f;
        matrix[2][1] = 0.0f;
        matrix[2][2] = farPlane / (farPlane - nearPlane);
        matrix[2][3] = 1.0f;
        
        matrix[3][0] = 0.0f;
        matrix[3][1] = 0.0f;
        matrix[3][2] = -nearPlane * farPlane / (farPlane - nearPlane);
        matrix[3][3] = 0.0f;
    }
    
    /* Multiply matrices */
    void MultiplyMatrices(const float a[4][4], const float b[4][4], float result[4][4]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                result[i][j] = 0.0f;
                for (int k = 0; k < 4; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }
    
    /* Transform vector by matrix */
    FVector TransformVector(const FVector& vec, const float matrix[4][4]) {
        float w = matrix[3][0] * vec.X + matrix[3][1] * vec.Y + matrix[3][2] * vec.Z + matrix[3][3];
        
        return FVector(
            (matrix[0][0] * vec.X + matrix[0][1] * vec.Y + matrix[0][2] * vec.Z + matrix[0][3]) / w,
            (matrix[1][0] * vec.X + matrix[1][1] * vec.Y + matrix[1][2] * vec.Z + matrix[1][3]) / w,
            (matrix[2][0] * vec.X + matrix[2][1] * vec.Y + matrix[2][2] * vec.Z + matrix[2][3]) / w
        );
    }
}

/* Main WorldToScreen function for UE 4.26.1 */
BOOLEAN WorldToScreen(PVOID controller, const FVector& worldPos, 
                     FVector2D* screenPos, float screenWidth, float screenHeight)
{
    if (!controller || !screenPos) return FALSE;
    
    // Get camera information from controller
    FVector cameraLocation;
    FRotator cameraRotation;
    float fov = 90.0f;
    
    // Read camera data (simplified for UE 4.26.1)
    __try {
        PVOID cameraManager = nullptr;
        uintptr_t cameraOffset = (uintptr_t)controller + abi_offsets::aplayercontroller::PlayerCameraManager;
        
        if (ReadGlobalMemory(cameraOffset, &cameraManager) && cameraManager) {
            uintptr_t viewOffset = (uintptr_t)cameraManager + abi_offsets::aplayercameramanager::CameraCachePrivate;
            
            struct {
                FVector Location;
                FRotator Rotation;
                float FOV;
            } viewInfo;
            
            if (ReadGlobalMemory(viewOffset, &viewInfo)) {
                cameraLocation = viewInfo.Location;
                cameraRotation = viewInfo.Rotation;
                fov = viewInfo.FOV;
            }
        }
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return FALSE;
    }
    
    // Create view matrix
    float viewMatrix[4][4];
    MatrixMath::CreateViewMatrix(cameraLocation, cameraRotation, viewMatrix);
    
    // Create projection matrix
    float aspectRatio = screenWidth / screenHeight;
    float projMatrix[4][4];
    MatrixMath::CreateProjectionMatrix(fov, aspectRatio, 0.1f, 10000.0f, projMatrix);
    
    // Combine matrices
    float viewProjMatrix[4][4];
    MatrixMath::MultiplyMatrices(viewMatrix, projMatrix, viewProjMatrix);
    
    // Transform world position to screen space
    FVector screenSpace = MatrixMath::TransformVector(worldPos, viewProjMatrix);
    
    // Convert to screen coordinates (UE 4.26.1 uses different screen space)
    screenPos->X = (screenSpace.X * 0.5f + 0.5f) * screenWidth;
    screenPos->Y = (-screenSpace.Y * 0.5f + 0.5f) * screenHeight;
    
    // Check if on screen and in front of camera
    return (screenPos->X >= 0.0f && screenPos->X <= screenWidth &&
            screenPos->Y >= 0.0f && screenPos->Y <= screenHeight &&
            screenSpace.Z > 0.0f && screenSpace.Z < 1.0f);
}

/* Enhanced WorldToScreen with distance check */
BOOLEAN WorldToScreenEx(PVOID controller, const FVector& worldPos,
                        FVector2D* screenPos, float screenWidth, float screenHeight,
                        float* distance = nullptr, float maxDistance = 1000.0f)
{
    if (!controller || !screenPos) return FALSE;
    
    // Calculate distance from camera
    FVector cameraLocation;
    float camDist = 0.0f;
    
    __try {
        PVOID cameraManager = nullptr;
        uintptr_t cameraOffset = (uintptr_t)controller + abi_offsets::aplayercontroller::PlayerCameraManager;
        
        if (ReadGlobalMemory(cameraOffset, &cameraManager) && cameraManager) {
            uintptr_t viewOffset = (uintptr_t)cameraManager + abi_offsets::aplayercameramanager::CameraCachePrivate;
            
            struct {
                FVector Location;
                FRotator Rotation;
                float FOV;
            } viewInfo;
            
            if (ReadGlobalMemory(viewOffset, &viewInfo)) {
                FVector delta = {
                    worldPos.X - viewInfo.Location.X,
                    worldPos.Y - viewInfo.Location.Y,
                    worldPos.Z - viewInfo.Location.Z
                };
                camDist = sqrtf(delta.X * delta.X + delta.Y * delta.Y + delta.Z * delta.Z);
            }
        }
    }
    __except (EXCEPTION_EXECUTE_HANDLER) {
        return FALSE;
    }
    
    if (distance) {
        *distance = camDist;
        
        // Check max distance
        if (camDist > maxDistance) {
            return FALSE;
        }
    }
    
    return WorldToScreen(controller, worldPos, screenPos, screenWidth, screenHeight);
}

/* WorldToScreen for bone positions */
BOOLEAN BoneToScreen(PVOID controller, PVOID character, 
                    int32_t boneId, FVector2D* screenPos, 
                    float screenWidth, float screenHeight)
{
    if (!controller || !character || !screenPos) return FALSE;
    
    FVector bonePos;
    if (!SDK::Player::GetBonePositionFromCharacter(character, boneId, bonePos)) {
        return FALSE;
    }
    
    return WorldToScreenEx(controller, bonePos, screenPos, screenWidth, screenHeight);
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
    
    // Scale size based on distance (UE 4.26.1 perspective)
    float scaleFactor = max(100.0f, 5000.0f / distance);
    float boxSize = baseSize * scaleFactor;
    
    // Calculate box corners
    min->X = -boxSize * 0.5f;
    min->Y = -boxSize * 0.5f;
    max->X = boxSize * 0.5f;
    max->Y = boxSize * 0.5f;
}
