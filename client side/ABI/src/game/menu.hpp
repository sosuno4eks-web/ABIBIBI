#pragma once
#include "settings.hpp"
#include "overlay/overlay.hpp"

namespace menu {
    void render() {
        ImGui::SetNextWindowSize(ImVec2(400, 300), ImGuiCond_FirstUseEver);

        if (ImGui::Begin("Arena Breakout", &settings::running, ImGuiWindowFlags_NoCollapse)) {

            if (ImGui::BeginTabBar("MainTabs")) {

                // ESP Tab
                if (ImGui::BeginTabItem("ESP")) {
                    ImGui::Checkbox("Enable ESP", &settings::esp::on);
                    ImGui::SliderFloat("Max Distance", &settings::esp::max_distance, 0.0f, 500.0f, "%.0f m");
                    ImGui::EndTabItem();
                }

                // Radar Tab
                if (ImGui::BeginTabItem("Radar")) {
                    ImGui::Checkbox("Enable Radar", &settings::radar::on);
                    ImGui::SliderFloat("Max Distance", &settings::radar::max_distance, 0.0f, 500.0f, "%.0f m");
                    ImGui::EndTabItem();
                }

                // Misc Tab
                if (ImGui::BeginTabItem("Misc")) {
                    ImGui::Text("Screen Resolution: %dx%d", settings::system::screen_x, settings::system::screen_y);
                    ImGui::Separator();
                    ImGui::Text("No misc settings yet");
                    ImGui::EndTabItem();
                }

                ImGui::EndTabBar();
            }
        }
        ImGui::End();
    }
}