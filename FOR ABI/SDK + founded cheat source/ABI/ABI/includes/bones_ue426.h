#pragma once

/* ── Clean UE 4.26.1 Bone Structure for Arena Breakout Infinite ───── */

/*
 * Bone structure implementation using provided IDs
 * No legacy Unity/Rust dependencies
 * Target: Arena Breakout Infinite (UE 4.26.1)
 */

typedef struct FVector {
    float X, Y, Z;
    
    FVector() : X(0), Y(0), Z(0) {}
    FVector(float x, float y, float z) : X(x), Y(y), Z(z) {}
    
    FVector operator+(const FVector& other) const {
        return FVector(X + other.X, Y + other.Y, Z + other.Z);
    }
    
    FVector operator-(const FVector& other) const {
        return FVector(X - other.X, Y - other.Y, Z - other.Z);
    }
    
    float Distance(const FVector& other) const {
        float dx = X - other.X;
        float dy = Y - other.Y;
        float dz = Z - other.Z;
        return sqrtf(dx*dx + dy*dy + dz*dz);
    }
} FVector, *PFVector;

typedef struct FRotator {
    float Pitch, Yaw, Roll;
    
    FRotator() : Pitch(0), Yaw(0), Roll(0) {}
    FRotator(float pitch, float yaw, float roll) : Pitch(pitch), Yaw(yaw), Roll(roll) {}
} FRotator, *PFRotator;

typedef struct FQuat {
    float X, Y, Z, W;
    
    FQuat() : X(0), Y(0), Z(0), W(1) {}
    FQuat(float x, float y, float z, float w) : X(x), Y(y), Z(z), W(w) {}
} FQuat, *PFQuat;

/* FTransform for bone matrices */
typedef struct FTransform {
    FVector Translation;
    FQuat Rotation;
    FVector Scale3D;
    
    FTransform() : Translation(), Rotation(), Scale3D(1, 1, 1) {}
    
    /* Get 4x4 matrix from transform */
    void ToMatrix(float matrix[4][4]) const {
        // Convert quaternion to rotation matrix
        float xx = Rotation.X * Rotation.X;
        float yy = Rotation.Y * Rotation.Y;
        float zz = Rotation.Z * Rotation.Z;
        float xy = Rotation.X * Rotation.Y;
        float xz = Rotation.X * Rotation.Z;
        float yz = Rotation.Y * Rotation.Z;
        float wx = Rotation.W * Rotation.X;
        float wy = Rotation.W * Rotation.Y;
        float wz = Rotation.W * Rotation.Z;
        
        matrix[0][0] = 1 - 2 * (yy + zz);
        matrix[0][1] = 2 * (xy - wz);
        matrix[0][2] = 2 * (xz + wy);
        matrix[0][3] = 0;
        
        matrix[1][0] = 2 * (xy + wz);
        matrix[1][1] = 1 - 2 * (xx + zz);
        matrix[1][2] = 2 * (yz - wx);
        matrix[1][3] = 0;
        
        matrix[2][0] = 2 * (xz - wy);
        matrix[2][1] = 2 * (yz + wx);
        matrix[2][2] = 1 - 2 * (xx + yy);
        matrix[2][3] = 0;
        
        matrix[3][0] = Translation.X;
        matrix[3][1] = Translation.Y;
        matrix[3][2] = Translation.Z;
        matrix[3][3] = 1;
    }
} FTransform, *PFTransform;

/* TArray structure */
typedef struct TArray {
    PVOID Data;
    int32_t Count;
    int32_t Max;
    
    PVOID Get(int index) {
        if (index < 0 || index >= Count) return nullptr;
        return (PVOID)((PUCHAR)Data + (index * sizeof(PVOID)));
    }
} TArray, *PTArray;

/* Bone IDs for Arena Breakout Infinite */
enum BoneID {
    BONE_ROOT = 0,
    BONE_PELVIS = 1,
    BONE_SPINE_01 = 2,
    BONE_SPINE_02 = 3,
    BONE_SPINE_03 = 4,
    BONE_SPINE_04 = 5,
    BONE_SPINE_05 = 6,
    BONE_NECK_01 = 7,
    BONE_NECK_02 = 8,
    BONE_NECK_03 = 9,
    BONE_NECK_04 = 10,
    BONE_NECK_05 = 11,
    BONE_NECK_06 = 12,
    BONE_NECK_07 = 13,
    BONE_NECK_08 = 14,
    BONE_NECK = 15,
    BONE_HEAD = 16,
    BONE_LEFT_CLAVICLE = 17,
    BONE_LEFT_UPPER_ARM = 18,
    BONE_LEFT_FOREARM = 19,
    BONE_LEFT_HAND = 20,
    BONE_LEFT_THUMB_01 = 21,
    BONE_LEFT_THUMB_02 = 22,
    BONE_LEFT_THUMB_03 = 23,
    BONE_LEFT_INDEX_01 = 24,
    BONE_LEFT_INDEX_02 = 25,
    BONE_LEFT_INDEX_03 = 26,
    BONE_LEFT_MIDDLE_01 = 27,
    BONE_LEFT_MIDDLE_02 = 28,
    BONE_LEFT_MIDDLE_03 = 29,
    BONE_LEFT_RING_01 = 30,
    BONE_LEFT_RING_02 = 31,
    BONE_LEFT_RING_03 = 32,
    BONE_LEFT_PINKY_01 = 33,
    BONE_LEFT_PINKY_02 = 34,
    BONE_LEFT_PINKY_03 = 35,
    BONE_LEFT_PINKY_04 = 36,
    BONE_RIGHT_CLAVICLE = 37,
    BONE_RIGHT_UPPER_ARM = 38,
    BONE_RIGHT_FOREARM = 39,
    BONE_RIGHT_HAND = 40,
    BONE_RIGHT_THUMB_01 = 41,
    BONE_RIGHT_THUMB_02 = 42,
    BONE_RIGHT_THUMB_03 = 43,
    BONE_RIGHT_INDEX_01 = 44,
    BONE_RIGHT_INDEX_02 = 45,
    BONE_RIGHT_INDEX_03 = 46,
    BONE_RIGHT_MIDDLE_01 = 47,
    BONE_RIGHT_MIDDLE_02 = 48,
    BONE_RIGHT_MIDDLE_03 = 49,
    BONE_RIGHT_RING_01 = 50,
    BONE_RIGHT_RING_02 = 51,
    BONE_RIGHT_RING_03 = 52,
    BONE_RIGHT_PINKY_01 = 53,
    BONE_RIGHT_PINKY_02 = 54,
    BONE_RIGHT_PINKY_03 = 55,
    BONE_RIGHT_PINKY_04 = 56,
    BONE_LEFT_THIGH = 57,
    BONE_LEFT_CALF = 58,
    BONE_LEFT_FOOT = 59,
    BONE_LEFT_TOE_01 = 60,
    BONE_LEFT_TOE_02 = 61,
    BONE_RIGHT_THIGH = 62,
    BONE_RIGHT_CALF = 63,
    BONE_RIGHT_FOOT = 64,
    BONE_RIGHT_TOE_01 = 65,
    BONE_RIGHT_TOE_02 = 66
};

/* Bone structure for ESP */
typedef struct BoneInfo {
    FVector Position;
    FRotator Rotation;
    BOOLEAN IsValid;
    
    BoneInfo() : Position(), Rotation(), IsValid(FALSE) {}
    BoneInfo(const FVector& pos, const FRotator& rot) : Position(pos), Rotation(rot), IsValid(TRUE) {}
} BoneInfo, *PBoneInfo;

/* Bone manager class */
typedef struct BoneManager {
    PVOID SkeletalMeshComponent;
    TArray BoneArray;
    int32_t BoneCount;
    
    BoneManager() : SkeletalMeshComponent(nullptr), BoneArray{}, BoneCount(0) {}
    
    /* Initialize bone manager with skeletal mesh component */
    BOOLEAN Initialize(PVOID meshComponent) {
        if (!meshComponent) return FALSE;
        
        SkeletalMeshComponent = meshComponent;
        
        // In a real implementation, this would read bone array from memory
        // For now, we'll use placeholder values
        BoneCount = 67; // Total bones in our enum
        BoneArray.Data = nullptr; // Would point to actual bone array
        BoneArray.Count = BoneCount;
        BoneArray.Max = BoneCount;
        
        return TRUE;
    }
    
    /* Get bone matrix by bone ID */
    BOOLEAN GetBoneMatrix(BoneID boneId, FTransform& outTransform) {
        if (boneId < 0 || boneId >= BoneCount) {
            return FALSE;
        }
        
        // In a real implementation, this would read from BoneArray
        // For now, return identity transform
        outTransform = FTransform();
        return TRUE;
    }
    
    /* Get bone position by ID */
    BOOLEAN GetBonePosition(BoneID boneId, FVector& outPosition) {
        FTransform boneTransform;
        if (!GetBoneMatrix(boneId, boneTransform)) {
            return FALSE;
        }
        
        outPosition = boneTransform.Translation;
        return TRUE;
    }
    
    /* Get bone with rotation by ID */
    BOOLEAN GetBoneWithRotation(BoneID boneId, FVector& outPosition, FRotator& outRotation) {
        FTransform boneTransform;
        if (!GetBoneMatrix(boneId, boneTransform)) {
            return FALSE;
        }
        
        outPosition = boneTransform.Translation;
        
        // Convert quaternion to rotator (simplified)
        // In a real implementation, this would do proper quaternion to euler conversion
        outRotation = FRotator(0, 0, 0);
        
        return TRUE;
    }
    
    /* Get multiple bones for skeleton ESP */
    BOOLEAN GetSkeletonBones(BoneInfo bones[], int32_t maxBones) {
        if (!bones || maxBones == 0) return FALSE;
        
        int32_t boneCount = 0;
        
        // Get key bones for skeleton
        BoneID keyBones[] = {
            BONE_HEAD,
            BONE_NECK,
            BONE_PELVIS,
            BONE_LEFT_CLAVICLE,
            BONE_LEFT_UPPER_ARM,
            BONE_LEFT_FOREARM,
            BONE_LEFT_HAND,
            BONE_RIGHT_CLAVICLE,
            BONE_RIGHT_UPPER_ARM,
            BONE_RIGHT_FOREARM,
            BONE_RIGHT_HAND,
            BONE_LEFT_THIGH,
            BONE_LEFT_CALF,
            BONE_LEFT_FOOT,
            BONE_RIGHT_THIGH,
            BONE_RIGHT_CALF,
            BONE_RIGHT_FOOT
        };
        
        int32_t keyBoneCount = sizeof(keyBones) / sizeof(BoneID);
        
        for (int32_t i = 0; i < keyBoneCount && boneCount < maxBones; i++) {
            FVector position;
            FRotator rotation;
            
            if (GetBoneWithRotation(keyBones[i], position, rotation)) {
                bones[boneCount] = BoneInfo(position, rotation);
                boneCount++;
            }
        }
        
        return (boneCount > 0);
    }
    
    /* Check if bone ID is valid */
    BOOLEAN IsValidBoneID(BoneID boneId) {
        return (boneId >= BONE_ROOT && boneId <= BONE_RIGHT_TOE_02);
    }
    
    /* Get bone name for debugging */
    const char* GetBoneName(BoneID boneId) {
        switch (boneId) {
            case BONE_ROOT: return "Root";
            case BONE_PELVIS: return "Pelvis";
            case BONE_SPINE_01: return "Spine_01";
            case BONE_SPINE_02: return "Spine_02";
            case BONE_SPINE_03: return "Spine_03";
            case BONE_SPINE_04: return "Spine_04";
            case BONE_SPINE_05: return "Spine_05";
            case BONE_NECK_01: return "Neck_01";
            case BONE_NECK_02: return "Neck_02";
            case BONE_NECK_03: return "Neck_03";
            case BONE_NECK_04: return "Neck_04";
            case BONE_NECK_05: return "Neck_05";
            case BONE_NECK_06: return "Neck_06";
            case BONE_NECK_07: return "Neck_07";
            case BONE_NECK_08: return "Neck_08";
            case BONE_NECK: return "Neck";
            case BONE_HEAD: return "Head";
            case BONE_LEFT_CLAVICLE: return "Left_Clavicle";
            case BONE_LEFT_UPPER_ARM: return "Left_Upper_Arm";
            case BONE_LEFT_FOREARM: return "Left_Forearm";
            case BONE_LEFT_HAND: return "Left_Hand";
            case BONE_RIGHT_CLAVICLE: return "Right_Clavicle";
            case BONE_RIGHT_UPPER_ARM: return "Right_Upper_Arm";
            case BONE_RIGHT_FOREARM: return "Right_Forearm";
            case BONE_RIGHT_HAND: return "Right_Hand";
            case BONE_LEFT_THIGH: return "Left_Thigh";
            case BONE_LEFT_CALF: return "Left_Calf";
            case BONE_LEFT_FOOT: return "Left_Foot";
            case BONE_RIGHT_THIGH: return "Right_Thigh";
            case BONE_RIGHT_CALF: return "Right_Calf";
            case BONE_RIGHT_FOOT: return "Right_Foot";
            default: return "Unknown";
        }
    }
} BoneManager, *PBoneManager;
