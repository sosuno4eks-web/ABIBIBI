#pragma once

#include <game/structs.hpp>
#include <game/settings.hpp>
#include <game/math.hpp>
#include <driver/driver.hpp>
#include <driver/xor.hpp>
#include <d3d.h>
#include <game/offsets.hpp>

namespace sdk {
    bool W2S(FMinimalViewInfo cameraManager, FVector WorldLocation, FVector2D* ScreenPosition, float Zoom = 1.0f) {
        D3DMATRIX tempMatrix = math::Matrix(cameraManager.Rotation);

        FVector vAxisX = FVector(tempMatrix._11, tempMatrix._12, tempMatrix._13);
        FVector vAxisY = FVector(tempMatrix._21, tempMatrix._22, tempMatrix._23);
        FVector vAxisZ = FVector(tempMatrix._31, tempMatrix._32, tempMatrix._33);

        FVector vDelta = WorldLocation - cameraManager.Location;
        FVector vTransformed = FVector(vDelta.Dot(vAxisY), vDelta.Dot(vAxisZ), vDelta.Dot(vAxisX));

        if (vTransformed.z < 1.f)
            vTransformed.z = 1.f;

        float ScreenCenterX = settings::system::screen_x / 2.0f;
        float ScreenCenterY = settings::system::screen_y / 2.0f;
        float ratio = (float)settings::system::screen_x / settings::system::screen_y;

        if (ratio < 4.0f / 3.0f)
            ratio = 4.0f / 3.0f;

        if (Zoom == 0)
            Zoom = 1;

        float fov = (ratio / (16.0f / 9.0f) * (float)tanf(cameraManager.FOV * (float)M_PI / 360.0f)) / Zoom;

        ScreenPosition->x = ScreenCenterX + vTransformed.x * ScreenCenterX / fov / vTransformed.z;
        ScreenPosition->y = ScreenCenterY - vTransformed.y * ScreenCenterX / fov / vTransformed.z;

        return ScreenPosition->x < settings::system::screen_x && ScreenPosition->x > 0 &&
            ScreenPosition->y < settings::system::screen_y && ScreenPosition->y > 0;
    }


    static void FNameDecrypt(char* inputBuf, int namelength)
    {
        const char xor_key = mem.Read<BYTE>(mem.BaseAddress + 0xB011C08); // the decryption key
        char a2 = ((unsigned __int8)xor_key >> 5) & 2;

        if (namelength)
        {
            __int64 v3 = namelength;
            do
            {
                char v4 = xor_key ^ a2 ^ (32 * ((xor_key ^ a2) & 2));
                char result = v4 ^ *(BYTE*)(inputBuf) ^ ((v4 >> 5) & 2) ^ 0x55;
                *inputBuf = result;

                --v3;
                ++inputBuf;
                a2 = ((unsigned __int8)xor_key >> 5) & 2;
            } while (v3);
        }
    }

    std::string GetNameFromFName(int key)
    {
        auto chunkOffset = (UINT)((int)(key) >> 16);
        auto nameOffset = (USHORT)key;
        auto namePoolChunk = mem.Read<uintptr_t>(mem.BaseAddress + offsets::game::OFFSET_GNAMES + ((chunkOffset + 2) * 8));
        auto entryOffset = namePoolChunk + (ULONG)(2 * nameOffset);
        auto nameEntry = mem.Read<INT16>(entryOffset);
        auto nameLength = nameEntry >> 6;
        char buff[1028]{};
        if ((DWORD)nameLength && nameLength > 0)
        {
            mem.ReadString(entryOffset + 2, buff, nameLength);
            buff[nameLength] = '\0';
            FNameDecrypt(buff, nameLength);
            return std::string(buff, nameLength);
        }
        else return "";
    }

    FVector ComponentToWorld(uintptr_t SkeletalMeshComponent) {
        uintptr_t c2w_ptr = mem.Read<uintptr_t>(SkeletalMeshComponent + offsets::USkeletalMeshComponent::ComponentToWorld);
        if (c2w_ptr) {
            return mem.Read<FVector>(c2w_ptr);
        }
    }
}