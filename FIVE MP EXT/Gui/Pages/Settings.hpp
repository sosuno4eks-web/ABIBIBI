#pragma once
#include <Includes/Includes.hpp>
#include <windows.h>
#include <iostream>
#include <thread>
#include <declar/declar.hpp>

using namespace std;

namespace Settings {

	static int iSubTabCount = 0;
	static float SubTabAlpha = 0.f;
	static int iSubTab = 0;

	void Render() {
		// Definir los sub-tabs correctamente
		ImGui::SetCursorPosX(850);
		if (Custom::SubTab(xorstr("Main"), iSubTabCount == 0)) {
			iSubTabCount = 0;
			iSubTab = iSubTabCount;
		}

		// Animación de transición entre sub-tabs
		SubTabAlpha = ImClamp(SubTabAlpha + (5.f * ImGui::GetIO().DeltaTime * (iSubTabCount == iSubTab ? 1.f : -1.f)), 0.f, 1.f);

		if (SubTabAlpha == 0.f)
			iSubTab = iSubTabCount;

		ImGui::PushStyleVar(ImGuiStyleVar_Alpha, SubTabAlpha * ImGui::GetStyle().Alpha);

		ImGui::SetCursorPos(ImVec2(226, 76));
		ImGui::BeginGroup();
		{
			switch (iSubTab)
			{
			case 0: // Main Settings
				ImGui::BeginGroup();
				{
					ImGui::BeginChild(xorstr("Globals"), ImVec2(340, 400), false, 0);
					{
						Custom::CheckBox(xorstr("WaterMark"), &g_Config.General->WaterMark);

						if (Custom::CheckBox(xorstr("Stream Proof"), &g_Config.General->StreamProof))
						{
							if (g_Config.General->StreamProof)
							{
								SetWindowDisplayAffinity(g_Variables.g_hCheatWindow, WDA_EXCLUDEFROMCAPTURE);
							}
							else
							{
								SetWindowDisplayAffinity(g_Variables.g_hCheatWindow, WDA_NONE);
							}
						}

						static int KeyMode = 1;
						ImGui::Keybind(xorstr("Menu Key"), &g_Config.General->MenuKey, &KeyMode);

						static bool bindingKey = false;  // Indica si estamos asignando una tecla
						static bool keyBindCompleted = false; // Flag para saber si ya terminó de asignar la tecla
						static bool keyPressedOnce = false;   // Flag para saber si la tecla ya fue presionada

						// Dibujar el keybind para Panic Key
						if (ImGui::Keybind(xorstr("Panic Key"), &g_Config.General->UnloadKey, &KeyMode))
						{
							bindingKey = true;   // Se ha iniciado el proceso de bind
							keyBindCompleted = false;
						}

						// Cuando se suelta el keybind, marcamos que terminó el proceso
						if (bindingKey && !ImGui::IsItemActive())
						{
							bindingKey = false;
							keyBindCompleted = true;  // Se completó el bind
							keyPressedOnce = false;   // Reiniciamos el flag
						}

						// Verificar pulsación solo si ya terminó el bind
						if (keyBindCompleted && (GetAsyncKeyState(g_Config.General->UnloadKey) & 1))
						{
							if (!keyPressedOnce)
							{
								keyPressedOnce = true;  // Primera pulsación detectada
							}
							else
							{
								exit(0);  // Segunda pulsación ejecuta el cierre
							}
						}


						if (ImGui::ColorEdit4(xorstr("Menu Color"), accent_color, ImGuiColorEditFlags_AlphaBar))
						{
							printf("Nuevo color: R: %.2f, G: %.2f, B: %.2f, A: %.2f\n",
								accent_color[0], accent_color[1], accent_color[2], accent_color[3]);
						}


						if (Custom::Button(xorstr("Unload"), ImVec2(-1, 30), 0))
						{
							exit(0);
						}





					}
					ImGui::EndChild();
				}
				ImGui::EndGroup();
				ImGui::SameLine();
				ImGui::BeginGroup();
				{
					ImGui::BeginChild(xorstr("Configs"), ImVec2(340, 400), false, 0);
					{
						ImGui::PushStyleVar(ImGuiStyleVar_ItemSpacing, ImVec2(14, 8));
						if (Custom::Button(xorstr("Export Config"), ImVec2(-1, 30), 0))
						{
							std::thread cfgExport([] {
								std::string CfgMsg = g_Config.SaveCurrentConfig(xorstr("..."));
								NotifyManager::Send(CfgMsg.c_str(), 3000);
								});

							cfgExport.detach();
						}
						if (Custom::Button(xorstr("Import Config"), ImVec2(-1, 30), 0))
						{
							std::thread cfgImport([] { NotifyManager::Send(g_Config.LoadCfg(xorstr("..."), Utils::GetClipboard()).c_str(), 3000); });

							cfgImport.detach();
						}
						ImGui::PopStyleVar();
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
