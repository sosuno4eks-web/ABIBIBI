#pragma once
#include <Includes/includes.hpp>
#include <windows.h>
#include <iostream>
#include <thread>
#include <Includes/CustomWidgets/Preview.hpp>

#include <Core/Core.hpp>

using namespace std;

namespace Visuals {

    static int iSubTabCount = 0;
    static float SubTabAlpha = 0.f;
    static int iSubTab = 0;

    void Render() {

        ImGui::SetCursorPosX(700 - 50);
        if (Custom::SubTab(xorstr("Players"), 0 == iSubTabCount)) {
            iSubTabCount = 0;
        }
        ImGui::SameLine();
        if (Custom::SubTab(xorstr("Vehicles"), 1 == iSubTabCount)) {
            iSubTabCount = 1;
        }
        ImGui::SameLine();
        if (Custom::SubTab(xorstr("Others"), 2 == iSubTabCount)) {
            iSubTabCount = 2;
        }


        SubTabAlpha = ImClamp(SubTabAlpha + (5.f * ImGui::GetIO().DeltaTime * (iSubTabCount == iSubTab ? 1.f : -1.f)), 0.f, 1.f);

        if (SubTabAlpha == 0.f) iSubTab = iSubTabCount;

        ImGui::PushStyleVar(ImGuiStyleVar_Alpha, SubTabAlpha * ImGui::GetStyle().Alpha);

        ImGui::SetCursorPos(ImVec2(226, 76));
        ImGui::BeginGroup();
        {
            switch (iSubTab)
            {
            case 0: // Players
                ImGui::BeginGroup();
                {
                    ImGui::BeginChild(xorstr("Globals#ESP"), ImVec2(340, 400), false, 0);
                    {
                        Custom::CheckBox(xorstr("Enable"), &g_Config.ESP->Enabled);
                        if (Custom::CheckBox(xorstr("Box"), &g_Config.ESP->Box)) {}

                        if (Custom::CheckBox(xorstr("Skeleton"), &g_Config.ESP->Skeleton))
                        {
                            Core::SDK::Pointers::pLocalPlayer->RemoveKinematics();
                        }

                        Custom::CheckBox(xorstr("Weapon Names"), &g_Config.ESP->WeaponName);
                        Custom::CheckBox(xorstr("Player Names"), &g_Config.ESP->UserNames);
                        Custom::CheckBox(xorstr("Distance"), &g_Config.ESP->DistanceFromMe);
                        Custom::CheckBox(xorstr("Health Bar"), &g_Config.ESP->HealthBar);
                        Custom::CheckBox(xorstr("Armor Bar"), &g_Config.ESP->ArmorBar);
                    }
                    ImGui::EndChild();
                }
                ImGui::EndGroup();
                ImGui::SameLine();
                ImGui::BeginGroup();
                {
                    ImGui::BeginChild(xorstr("Preview"), ImVec2(340, 400), false, ImGuiWindowFlags_NoScrollbar);
                    {
                        Custom::g_EspPreview.DragDropHandler();
                        Custom::g_EspPreview.Draw();
                    }
                    ImGui::EndChild();
                }
                ImGui::EndGroup();
                break;

            case 1: // Vehicles
                ImGui::BeginGroup();
                {
                    ImGui::BeginChild(xorstr("Globals"), ImVec2(340, 400), false, 0);
                    {
                        Custom::CheckBox(xorstr("Toggle"), &g_Config.VehicleESP->Enabled);
                        Custom::CheckBox(xorstr("Vehicle Names"), &g_Config.VehicleESP->VehName);
                        Custom::CheckBox(xorstr("Locked/Unlocked"), &g_Config.VehicleESP->ShowLockUnlock);
                        Custom::CheckBox(xorstr("SnapLines"), &g_Config.VehicleESP->SnapLines);
                        Custom::CheckBox(xorstr("Distance"), &g_Config.VehicleESP->DistanceFromMe);
                    }
                    ImGui::EndChild();
                }
                ImGui::EndGroup();
                ImGui::SameLine();
                ImGui::BeginGroup();
                {
                    ImGui::BeginChild(xorstr("Settings"), ImVec2(340, 400), false, 0);
                    {
                        ImGui::SliderInt(xorstr("Max Distance"), &g_Config.VehicleESP->MaxDistance, 0, 1000, xorstr("%dm"), 0);
                    }
                    ImGui::EndChild();
                }
                ImGui::EndGroup();
                break;

            case 2: // Settings
                ImGui::BeginGroup();
                {
                    ImGui::BeginChild(xorstr("Visual Settings"), ImVec2(340, 400), false, 0);
                    {

                        Custom::CheckBox(xorstr("Show LocalPlayer"), &g_Config.ESP->ShowLocalPlayer);
                        Custom::CheckBox(xorstr("Ignore Dead"), &g_Config.ESP->IgnoreDead);
                        Custom::CheckBox(xorstr("Ignore NPCs"), &g_Config.ESP->IgnoreNPCs);

                        Custom::CheckBoxCfg(xorstr("Friend Marker"), &g_Config.ESP->FriendsMarker, []
                            {
                                static int KeyMode = 1;
                                ImGui::Keybind(xorstr("Bind"), &g_Config.ESP->FriendsMarkerBind, &KeyMode);
                            });

                        ImGui::SliderInt(xorstr("Max Distance"), &g_Config.ESP->MaxDistance, 0, 1000, xorstr("%dm"), 0);

                    }
                    ImGui::EndChild();
                }
                ImGui::EndGroup();
                ImGui::SameLine();
                ImGui::BeginGroup();
                {
                    ImGui::BeginChild(xorstr("Colors"), ImVec2(340, 400), false, 0);
                    {
                        static float box_col[4] = { g_Config.ESP->BoxCol.Value.x, g_Config.ESP->BoxCol.Value.y, g_Config.ESP->BoxCol.Value.z,g_Config.ESP->BoxCol.Value.w };
                        if (ImGui::ColorEdit4(xorstr("Box"), box_col, ImGuiColorEditFlags_AlphaBar))
                        {
                            g_Config.ESP->BoxCol.Value.x = box_col[0];
                            g_Config.ESP->BoxCol.Value.y = box_col[1];
                            g_Config.ESP->BoxCol.Value.z = box_col[2];
                            g_Config.ESP->BoxCol.Value.w = box_col[3];
                        }

                        static float skeleton_col[4] = { g_Config.ESP->SkeletonCol.Value.x, g_Config.ESP->SkeletonCol.Value.y, g_Config.ESP->SkeletonCol.Value.z,g_Config.ESP->SkeletonCol.Value.w };
                        if (ImGui::ColorEdit4(xorstr("Skeleton"), skeleton_col, ImGuiColorEditFlags_AlphaBar))
                        {
                            g_Config.ESP->SkeletonCol.Value.x = skeleton_col[0];
                            g_Config.ESP->SkeletonCol.Value.y = skeleton_col[1];
                            g_Config.ESP->SkeletonCol.Value.z = skeleton_col[2];
                            g_Config.ESP->SkeletonCol.Value.w = skeleton_col[3];
                        }

                        static float lines_col[4] = { g_Config.ESP->SnapLinesCol.Value.x, g_Config.ESP->SnapLinesCol.Value.y, g_Config.ESP->SnapLinesCol.Value.z,g_Config.ESP->SnapLinesCol.Value.w };
                        if (ImGui::ColorEdit4(xorstr("SnapLines"), lines_col, ImGuiColorEditFlags_AlphaBar))
                        {
                            g_Config.ESP->SnapLinesCol.Value.x = lines_col[0];
                            g_Config.ESP->SnapLinesCol.Value.y = lines_col[1];
                            g_Config.ESP->SnapLinesCol.Value.z = lines_col[2];
                            g_Config.ESP->SnapLinesCol.Value.w = lines_col[3];
                        }

                        static float names_col[4] = { g_Config.ESP->UserNamesCol.Value.x, g_Config.ESP->UserNamesCol.Value.y, g_Config.ESP->UserNamesCol.Value.z,g_Config.ESP->UserNamesCol.Value.w };
                        if (ImGui::ColorEdit4(xorstr("Names"), names_col, ImGuiColorEditFlags_AlphaBar))
                        {
                            g_Config.ESP->UserNamesCol.Value.x = names_col[0];
                            g_Config.ESP->UserNamesCol.Value.y = names_col[1];
                            g_Config.ESP->UserNamesCol.Value.z = names_col[2];
                            g_Config.ESP->UserNamesCol.Value.w = names_col[3];
                        }

                        static float weapon_names_col[4] = { g_Config.ESP->WeaponNameCol.Value.x, g_Config.ESP->WeaponNameCol.Value.y, g_Config.ESP->WeaponNameCol.Value.z,g_Config.ESP->WeaponNameCol.Value.w };
                        if (ImGui::ColorEdit4(xorstr("Weapon Names"), weapon_names_col, ImGuiColorEditFlags_AlphaBar))
                        {
                            g_Config.ESP->WeaponNameCol.Value.x = weapon_names_col[0];
                            g_Config.ESP->WeaponNameCol.Value.y = weapon_names_col[1];
                            g_Config.ESP->WeaponNameCol.Value.z = weapon_names_col[2];
                            g_Config.ESP->WeaponNameCol.Value.w = weapon_names_col[3];
                        }

                        static float dist_col[4] = { g_Config.ESP->DistanceCol.Value.x, g_Config.ESP->DistanceCol.Value.y, g_Config.ESP->DistanceCol.Value.z,g_Config.ESP->DistanceCol.Value.w };
                        if (ImGui::ColorEdit4(xorstr("Distance"), dist_col, ImGuiColorEditFlags_AlphaBar))
                        {
                            g_Config.ESP->DistanceCol.Value.x = dist_col[0];
                            g_Config.ESP->DistanceCol.Value.y = dist_col[1];
                            g_Config.ESP->DistanceCol.Value.z = dist_col[2];
                            g_Config.ESP->DistanceCol.Value.w = dist_col[3];
                        }

                    }
                    ImGui::EndChild();
                }
                ImGui::EndGroup();
                break;

            default:
                break;
            }

        }
        ImGui::EndGroup();
        ImGui::PopStyleVar();
    }
}