#pragma once

#include <overlay/overlay.hpp>
#include <game/cache.hpp>
#include "settings.hpp"
#include <algorithm>

namespace esp {
    void Draw2DBox(ImDrawList* drawList, const ImVec2& min, const ImVec2& max, ImU32 color, float thickness) {
            float width = max.x - min.x;
            float height = max.y - min.y;
            float cornerSize = fminf(20, fminf(width * 0.25f, height * 0.25f));

            drawList->AddLine(ImVec2(min.x, min.y), ImVec2(min.x + cornerSize, min.y), color, thickness);
            drawList->AddLine(ImVec2(min.x, min.y), ImVec2(min.x, min.y + cornerSize), color, thickness);

            drawList->AddLine(ImVec2(max.x - cornerSize, min.y), ImVec2(max.x, min.y), color, thickness);
            drawList->AddLine(ImVec2(max.x, min.y), ImVec2(max.x, min.y + cornerSize), color, thickness);

            drawList->AddLine(ImVec2(min.x, max.y - cornerSize), ImVec2(min.x, max.y), color, thickness);
            drawList->AddLine(ImVec2(min.x, max.y), ImVec2(min.x + cornerSize, max.y), color, thickness);

            drawList->AddLine(ImVec2(max.x - cornerSize, max.y), ImVec2(max.x, max.y), color, thickness);
            drawList->AddLine(ImVec2(max.x, max.y - cornerSize), ImVec2(max.x, max.y), color, thickness);
    }

    void render() {
        auto* drawList = ImGui::GetBackgroundDrawList();
        FVector my_location = mem.Read<FVector>(cache::Local::LocalRootComponent + offsets::USceneComponent::RelativeLocation);
        FMinimalViewInfo cam = cache::Local::CameraData::Camera;

        for (const auto& p : cache::ActorList) {
            FVector enemy_location = mem.Read<FVector>(p.actor_rootcomponent + offsets::USceneComponent::RelativeLocation);
            float distance = my_location.Distance(enemy_location);

            if (distance / 100.0f > settings::esp::max_distance)
                continue;

            FVector2D esp_point;
            if (!sdk::W2S(cam, enemy_location, &esp_point, 1.0f)) continue;

            ImU32 color = p.bot ? IM_COL32(0, 100, 255, 255) : IM_COL32(255, 0, 0, 255);

            float clamped_distance = max(distance, 30000.0f);
            float box_height = std::clamp(15000.0f / clamped_distance, 80.0f, 250.0f);
            float box_width = box_height * 0.35f;

            ImVec2 min = ImVec2(esp_point.x - box_width / 2, esp_point.y - box_height / 2);
            ImVec2 max = ImVec2(esp_point.x + box_width / 2, esp_point.y + box_height / 2);

            esp::Draw2DBox(drawList, min, max, color, 2.0f);

            std::string distance_text = p.bot ?
                std::format("BOT: {:.0f}m", distance / 100.0f) :
                std::format("{:.0f}m", distance / 100.0f);

            ImVec2 text_pos = ImVec2(esp_point.x - ImGui::CalcTextSize(distance_text.c_str()).x / 2, min.y - 20);
            drawList->AddText(text_pos, IM_COL32(255, 255, 255, 255), distance_text.c_str());
        }
    }
}