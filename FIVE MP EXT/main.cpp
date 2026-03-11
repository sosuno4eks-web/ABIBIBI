#pragma once
#include <Gui/Overlay/Overlay.hpp>
#include <Includes/Includes.hpp>
#include <Core/SDK/Memory.hpp>
#include <Includes/Utils.hpp>
#include <Core/SDK/SDK.hpp>
#include <Core/Core.hpp>
#include <Gui/gui.hpp>
#include <winternl.h>
#include <windows.h>
#include <dwmapi.h>
#include <tchar.h>
#include <vector>
#include <regex>
#include <tlhelp32.h>
#include <iostream>
#include <fstream>
#include <string>

#include <Security/AntiCrack.hpp>
#include <Security/Api/Auth/api/api.hh>
#include <Includes/CustomWidgets/Custom.hpp>
#include <Includes/ImGui/Fonts.hpp>
#include <../Security/api.hpp>
#include <../Globals.hpp>
#include "../Includes/keyauth/auth.hpp"
#include "../Security/xorstr.hpp"
using namespace Core;
using namespace KeyAuth;





RECT rc;

void style() {
	ImGuiStyle* style = &ImGui::GetStyle();

	style->WindowRounding = 10.0f;
	style->WindowPadding = ImVec2(0.f, 0.f);
	style->WindowBorderSize = 1.f;
	style->Alpha = 1.1f;

	style->Colors[ImGuiCol_WindowBg] = ImVec4(ImColor(17,17,21));
	style->Colors[ImGuiCol_ChildBg] = ImVec4(ImColor(255, 255, 255, 255));
	style->Colors[ImGuiCol_Border] = ImVec4(22, 22, 22, 0);
	//style->WindowBorderSize = 0.1f;
}

inline std::string trim(const std::string& str) {
	size_t first = str.find_first_not_of(' ');
	if (first == std::string::npos) return "";
	size_t last = str.find_last_not_of(' ');
	return str.substr(first, last - first + 1);
}


ID3D11Device* g_pd3dDevice = NULL;
ID3D11DeviceContext* g_pd3dDeviceContext = NULL;
IDXGISwapChain* g_pSwapChain = NULL;
ID3D11RenderTargetView* g_mainRenderTargetView = NULL;

D3DX11_IMAGE_LOAD_INFO info;
ID3DX11ThreadPump* pump{ nullptr };
HWND hwnd;

bool CreateDeviceD3D(HWND hWnd);
void CleanupDeviceD3D();
void CreateRenderTarget();
void CleanupRenderTarget();
LRESULT WINAPI WndProc(HWND hWnd, UINT msg, WPARAM wParam, LPARAM lParam);
ImVec2 window_size = ImVec2(440, 320);

void move_window() {
	ImGui::SetCursorPos(ImVec2(0, 0));
	if (ImGui::InvisibleButton("Move_detector", ImVec2(window_size.x, window_size.y)));
	if (ImGui::IsItemActive()) {

		GetWindowRect(hwnd, &rc);
		MoveWindow(hwnd, rc.left + ImGui::GetMouseDragDelta().x, rc.top + ImGui::GetMouseDragDelta().y, window_size.x, window_size.y, TRUE);
	}
}


 bool flag = false;
 c_globals globals;
 static enum PANELS
	{
		login_panel,
		register_panel,

	} panel;
 bool render() {
	 ImGui::SetNextWindowSize(ImVec2(window_size));
	 ImGui::SetNextWindowPos(ImVec2(0, 0));

	 ImGui::Begin("##menu", nullptr, ImGuiWindowFlags_NoDecoration | ImGuiWindowFlags_NoMove | ImGuiWindowFlags_NoScrollWithMouse);
	 {
		 switch (panel)
		 {
			 case login_panel:
			 {
				 // Centraliza "login page"
				 ImVec2 textSize = ImGui::CalcTextSize("login page");
				 float textY = 280 + (25 - textSize.y) * 0.5f;
				 float rectHeight = 10.0f;

				 // Retângulo atrás do texto
				 ImGui::GetWindowDrawList()->AddRectFilled(
					 ImVec2(0, textY + 10),                             
					 ImVec2(window_size.x, textY + rectHeight + 25),   
					 IM_COL32(20, 20, 25, 255),                         
					 10.0f                                              
				 );


				 // Texto centralizado sobre o retângulo
				 ImGui::GetWindowDrawList()->AddText(
					 ImVec2((window_size.x - textSize.x) * 0.5f, textY + 13),
					 IM_COL32(255, 255, 255, 255),
					 "login page"
				 );

				 ImGui::PushStyleColor(ImGuiCol_Text, ImVec4(133.0f / 255.0f, 133.0f / 255.0f, 133.0f / 255.0f, 1.0f));
				 ImGui::PushFont(globals.open_sans_sm);

				 ImVec2 welcomeTextSize = ImGui::CalcTextSize("Welcome, write your credentials");
				 ImGui::SetCursorPos({ (window_size.x - welcomeTextSize.x) * 0.5f, 101 });
				 ImGui::Text("Welcome, write your credentials");

				 ImGui::PopFont();
				 ImGui::PopStyleColor();

				 ImGui::PushFont(globals.open_sans);

				 float inputWidth = 220.0f;
				 ImVec2 inputSize(inputWidth, 25);

				 ImGui::SetCursorPos({ (window_size.x - inputWidth) * 0.5f, 131 });
				 ImGui::InputTextEx("##User", "Username", globals.userLogin, IM_ARRAYSIZE(globals.userLogin), inputSize, NULL);

				 ImGui::SetCursorPos({ (window_size.x - inputWidth) * 0.5f, 161 });
				 ImGui::InputTextEx("##Pass", "Password", globals.passLogin, IM_ARRAYSIZE(globals.passLogin), inputSize, NULL);

				 ImGui::SetCursorPos({ (window_size.x - inputWidth) * 0.5f, 196 });
				 if (ImGui::ButtonEx("verify", ImVec2(inputWidth, 25))) {
								 flag = true;
				 }
				 ImGui::PopFont();

				 break;
			 }
		 }
		 move_window();
	 }
	 ImGui::End();
	 return flag;
 }


int gay()
{

	if (!Mem.GetMaxPrivileges(GetCurrentProcess()))
	{
		return 0;
	}


	//Utils::OpenConsole( );



	while (!g_Variables.g_hGameWindow)
	{

		g_Variables.g_hGameWindow = FindWindowA(xorstr("grcWindow"), nullptr);
		if (g_Variables.g_hGameWindow)
		{
			auto WindowInfo = Utils::GetWindowPosAndSize(g_Variables.g_hGameWindow);
			g_Variables.g_vGameWindowSize = WindowInfo.second;
			g_Variables.g_vGameWindowPos = WindowInfo.first;
			g_Variables.g_vGameWindowCenter = { g_Variables.g_vGameWindowSize.x / 2, g_Variables.g_vGameWindowSize.y / 2 };
			break;
		}

	}

		std::thread(&AntiCrack::DoProtect).detach();
		Core::SetupOffsets();
		Gui::cOverlay.Render();

	return 0;
}
// Verifica se o Brave (brave.exe) está rodando
bool IsBraveRunning() {
	HANDLE hSnapshot = CreateToolhelp32Snapshot(TH32CS_SNAPPROCESS, 0);
	if (hSnapshot == INVALID_HANDLE_VALUE) return false;

	PROCESSENTRY32 pe32;
	pe32.dwSize = sizeof(PROCESSENTRY32);

	bool found = false;
	if (Process32First(hSnapshot, &pe32)) {
		do {
			std::string exeName = pe32.szExeFile;
			if (exeName == "brave.exe") {
				found = true;
				break;
			}
		} while (Process32Next(hSnapshot, &pe32));
	}
	CloseHandle(hSnapshot);
	return found;
}

// Callback para verificar se há uma janela com "YouTube" no título
BOOL CALLBACK EnumWindowsProc(HWND hwnd, LPARAM lParam) {
	wchar_t title[256];
	GetWindowTextW(hwnd, title, sizeof(title) / sizeof(wchar_t));

	std::wstring windowTitle = title;
	if (windowTitle.find(L"YouTube") != std::wstring::npos) {
		*(bool*)lParam = true;
		return FALSE;
	}
	return TRUE;
}

// Verifica se o YouTube está aberto em alguma janela
bool IsYouTubeOpen() {
	bool found = false;
	EnumWindows(EnumWindowsProc, (LPARAM)&found);
	return found;
}



int APIENTRY WinMain(HINSTANCE, HINSTANCE, LPSTR, int)
{
	/*if (!IsBraveRunning()) {

		return 0;
	}

	if (!IsYouTubeOpen()) {

		return 0;
	}*/

	/*AllocConsole();
	FILE* fDummy;
	freopen_s(&fDummy, "CONIN$", "r", stdin);
	freopen_s(&fDummy, "CONOUT$", "w", stderr);
	freopen_s(&fDummy, "CONOUT$", "w", stdout);*/

	WNDCLASSEXW wc;
	wc.cbSize = sizeof(WNDCLASSEXW);
	wc.style = CS_CLASSDC;
	wc.lpfnWndProc = WndProc;
	wc.cbClsExtra = NULL;
	wc.cbWndExtra = NULL;
	wc.hInstance = nullptr;
	wc.hIcon = LoadIcon(0, IDI_APPLICATION);
	wc.hCursor = LoadCursor(0, IDC_ARROW);
	wc.hbrBackground = nullptr;
	wc.lpszMenuName = L" ";
	wc.lpszClassName = L" ";
	wc.hIconSm = LoadIcon(0, IDI_APPLICATION);

	RegisterClassExW(&wc);
	hwnd = CreateWindowExW(NULL, wc.lpszClassName, L" ", WS_POPUP, (GetSystemMetrics(SM_CXSCREEN) / 2) - (window_size.x / 2), (GetSystemMetrics(SM_CYSCREEN) / 2) - (window_size.y / 2), window_size.x,window_size.y, 0, 0, 0, 0);
	//gui::RenderBlur( globals.hwnd );

	//SetWindowDisplayAffinity(globals.hwnd, WDA_EXCLUDEFROMCAPTURE);

	SetWindowLongA(hwnd, GWL_EXSTYLE, GetWindowLong(hwnd, GWL_EXSTYLE) | WS_EX_LAYERED);
	SetLayeredWindowAttributes(hwnd, RGB(0, 0, 0), 255, LWA_ALPHA);

	MARGINS margins = { -1 };
	DwmExtendFrameIntoClientArea(hwnd, &margins);

	POINT mouse;
	rc = { 0 };
	GetWindowRect(hwnd, &rc);

	if (!CreateDeviceD3D(hwnd))
	{
		CleanupDeviceD3D();
		::UnregisterClassW(wc.lpszClassName, wc.hInstance);
		return 1;
	}


	::ShowWindow(hwnd, SW_SHOWDEFAULT);
	::UpdateWindow(hwnd);


	IMGUI_CHECKVERSION();
	ImGui::CreateContext(); {
		ImGui::StyleColorsDark();


		style();
		
	}
	ImGuiIO& io = ImGui::GetIO(); (void)io;

	ImFontConfig cfg;
	cfg.FontBuilderFlags = ImGuiBackendFlags_None; 
	cfg.FontDataOwnedByAtlas = false;
	//io.Fonts->AddFontFromMemoryTTF(InterSemiBold, sizeof(InterSemiBold), 18.f, &cfg, io.Fonts->GetGlyphRangesCyrillic());

	//globals.open_sans = io.Fonts->AddFontFromMemoryTTF(open_sans, sizeof(open_sans), 14.f, &cfg, io.Fonts->GetGlyphRangesCyrillic());
	globals.open_sans = io.Fonts->AddFontFromMemoryCompressedBase85TTF(open_sans.data(), 18);
	globals.open_sans_sm = io.Fonts->AddFontFromMemoryCompressedBase85TTF(open_sans.data(), 21);

	static const ImWchar icons_ranges[] = { 0xe000, 0xf8ff, 0 };
	ImFontConfig icons_config;
	icons_config.MergeMode = true;
	icons_config.PixelSnapH = true;
	icons_config.OversampleH = 3;
	icons_config.OversampleV = 3;

	static const ImWchar FontAwesomeRanges[] = { ICON_MIN_FA, ICON_MAX_FA, 0 };
	static const ImWchar FontAwesomeRangesBrands[] = { ICON_MIN_FAB, ICON_MAX_FAB, 0 };

	ImFontConfig FontAwesomeConfig;
	FontAwesomeConfig.MergeMode = true;
	FontAwesomeConfig.PixelSnapH = true;
	FontAwesomeConfig.GlyphMinAdvanceX = 17.f;

	//globals.FontAwesomeSolid = io.Fonts->AddFontFromMemoryCompressedTTF(FontAwesome6Solid_compressed_data, sizeof(FontAwesome6Solid_compressed_size), 17.f, &FontAwesomeConfig, FontAwesomeRanges);
	//globals.FontAwesomeRegular = io.Fonts->AddFontFromMemoryCompressedTTF(FontAwesome6Regular_compressed_data, sizeof(FontAwesome6Regular_compressed_size), 17.f, &FontAwesomeConfig, FontAwesomeRanges);
	//globals.FontAwesomeBrands = io.Fonts->AddFontFromMemoryCompressedTTF(FontAwesome6Brands_compressed_data, sizeof(FontAwesome6Brands_compressed_size), 17.f, &FontAwesomeConfig, FontAwesomeRangesBrands);

	io.IniFilename = nullptr;

	ImGui_ImplWin32_Init(hwnd);
	ImGui_ImplDX11_Init(g_pd3dDevice, g_pd3dDeviceContext);

	ImVec4 clear_color = ImVec4(0.45f, 0.55f, 0.60f, 1.00f);
	static bool done = false;
	while (!done)
	{

		MSG msg;
		while (::PeekMessage(&msg, NULL, 0U, 0U, PM_REMOVE))
		{
			::TranslateMessage(&msg);
			::DispatchMessage(&msg);
			if (msg.message == WM_QUIT)
				done = true;
		}

		if (done)
			break;

		ImGui_ImplDX11_NewFrame();
		ImGui_ImplWin32_NewFrame();

		static bool hide = true;
		static int opticaly = 255;
		/*if ( GetAsyncKeyState( VK_INSERT ) & 0x1 ) hide = !hide;
		if ( GetAsyncKeyState( VK_DELETE ) & 1 ) { exit( 0 ); }*/
		opticaly = ImLerp(opticaly, opticaly <= 255 && hide ? 300 : 0, ImGui::GetIO().DeltaTime * 8.f);
		if (opticaly > 255) opticaly = 255;

		SetLayeredWindowAttributes(hwnd, RGB(0, 0, 0), opticaly, LWA_ALPHA);

		//SetWindowDisplayAffinity(globals.hwnd, WDA_EXCLUDEFROMCAPTURE);

		ShowWindow(hwnd, opticaly > 0 ? SW_SHOW : SW_HIDE);

		ImGui::NewFrame();
		{
			ImGui::SetNextWindowPos({ 0, 0 }, ImGuiCond_Once);
			ImGui::SetNextWindowSize({window_size.x, window_size.y }, ImGuiCond_Once);

			ImGui::Begin(" ", &done, ImGuiWindowFlags_NoResize | ImGuiWindowFlags_NoSavedSettings | ImGuiWindowFlags_NoCollapse | ImGuiWindowFlags_NoScrollbar | ImGuiWindowFlags_::ImGuiWindowFlags_NoTitleBar);
			{

				if (!flag) {
					render();
					move_window();
					
				}
				else
				{
					ShowWindow(hwnd, SW_HIDE);
					done = true;
					gay();
				}
			
			}
			ImGui::End();
		}

		ImGui::Render();


		const float clear_color_with_alpha[4] = { 0 };
		g_pd3dDeviceContext->OMSetRenderTargets(1, &g_mainRenderTargetView, NULL);
		g_pd3dDeviceContext->ClearRenderTargetView(g_mainRenderTargetView, clear_color_with_alpha);
		ImGui_ImplDX11_RenderDrawData(ImGui::GetDrawData());

		g_pSwapChain->Present(1, 0);
	}

	ImGui_ImplDX11_Shutdown();
	ImGui_ImplWin32_Shutdown();
	ImGui::DestroyContext();

	CleanupDeviceD3D();
	::DestroyWindow(hwnd);
	::UnregisterClassW(wc.lpszClassName, wc.hInstance);

	return 0;
}

bool CreateDeviceD3D(HWND hWnd)
{
	DXGI_SWAP_CHAIN_DESC sd;
	ZeroMemory(&sd, sizeof(sd));
	sd.BufferCount = 2;
	sd.BufferDesc.Width = 0;
	sd.BufferDesc.Height = 0;
	sd.BufferDesc.Format = DXGI_FORMAT_R8G8B8A8_UNORM;
	sd.BufferDesc.RefreshRate.Numerator = 60;
	sd.BufferDesc.RefreshRate.Denominator = 1;
	sd.Flags = DXGI_SWAP_CHAIN_FLAG_ALLOW_MODE_SWITCH;
	sd.BufferUsage = DXGI_USAGE_RENDER_TARGET_OUTPUT;
	sd.OutputWindow = hWnd;
	sd.SampleDesc.Count = 1;
	sd.SampleDesc.Quality = 0;
	sd.Windowed = TRUE;
	sd.SwapEffect = DXGI_SWAP_EFFECT_DISCARD;

	UINT createDeviceFlags = 0;
	//createDeviceFlags |= D3D11_CREATE_DEVICE_DEBUG;
	D3D_FEATURE_LEVEL featureLevel;
	const D3D_FEATURE_LEVEL featureLevelArray[2] = { D3D_FEATURE_LEVEL_11_0, D3D_FEATURE_LEVEL_10_0, };
	if (D3D11CreateDeviceAndSwapChain(NULL, D3D_DRIVER_TYPE_HARDWARE, NULL, createDeviceFlags, featureLevelArray, 2, D3D11_SDK_VERSION, &sd, &g_pSwapChain, &g_pd3dDevice, &featureLevel, &g_pd3dDeviceContext) != S_OK)
		return false;

	CreateRenderTarget();
	return true;
}

void CleanupDeviceD3D()
{
	CleanupRenderTarget();
	if (g_pSwapChain) {
		g_pSwapChain->Release();
		g_pSwapChain = NULL;
	}

	if (g_pd3dDeviceContext) {
		g_pd3dDeviceContext->Release();
		g_pd3dDeviceContext = NULL;
	}

	if (g_pd3dDevice) {
		g_pd3dDevice->Release();
		g_pd3dDevice = NULL;
	}
}

void CreateRenderTarget()
{
	ID3D11Texture2D* pBackBuffer;
	g_pSwapChain->GetBuffer(0, IID_PPV_ARGS(&pBackBuffer));
	g_pd3dDevice->CreateRenderTargetView(pBackBuffer, NULL, &g_mainRenderTargetView);
	pBackBuffer->Release();
}

void CleanupRenderTarget()
{
	if (g_mainRenderTargetView) {
		g_mainRenderTargetView->Release();
		g_mainRenderTargetView = NULL;
	}
}

extern IMGUI_IMPL_API LRESULT ImGui_ImplWin32_WndProcHandler(HWND hWnd, UINT msg, WPARAM wParam, LPARAM lParam);
LRESULT WINAPI WndProc(HWND hWnd, UINT msg, WPARAM wParam, LPARAM lParam)
{
	if (ImGui_ImplWin32_WndProcHandler(hWnd, msg, wParam, lParam))
		return true;

	switch (msg)
	{
	case WM_SIZE:
		if (g_pd3dDevice != NULL && wParam != SIZE_MINIMIZED)
		{
			CleanupRenderTarget();
			g_pSwapChain->ResizeBuffers(0, (UINT)LOWORD(lParam), (UINT)HIWORD(lParam), DXGI_FORMAT_UNKNOWN, 0);
			CreateRenderTarget();
		}
		return 0;
	case WM_SYSCOMMAND:
		if ((wParam & 0xfff0) == SC_KEYMENU) // Disable ALT application menu
			return 0;
		break;
	case WM_DESTROY:
		::PostQuitMessage(0);
		return 0;
	}
	return ::DefWindowProc(hWnd, msg, wParam, lParam);
}







std::string hwid;