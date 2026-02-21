/*
 * overlay.hpp - Stealth Overlay with Anti-Screenshot Protection
 * 
 * DirectX overlay for ESP rendering with WDA_EXCLUDEFROMCAPTURE
 * to prevent screenshot detection by anti-cheat
 */

#pragma once

#include <Windows.h>
#include <d3d11.h>
#include <dxgi.h>
#include <iostream>

#pragma comment(lib, "d3d11.lib")
#pragma comment(lib, "dxgi.lib")

namespace overlay {
    // Overlay window handle
    inline HWND g_OverlayWindow = nullptr;
    
    // DirectX resources
    inline ID3D11Device* g_Device = nullptr;
    inline ID3D11DeviceContext* g_Context = nullptr;
    inline IDXGISwapChain* g_SwapChain = nullptr;
    inline ID3D11RenderTargetView* g_RenderTargetView = nullptr;
    
    // Overlay state
    inline bool g_Running = false;
    inline int g_Width = 1920;
    inline int g_Height = 1080;
    
    /*
     * Window procedure for overlay
     */
    LRESULT CALLBACK OverlayWndProc(HWND hwnd, UINT msg, WPARAM wParam, LPARAM lParam) {
        switch (msg) {
            case WM_DESTROY:
                g_Running = false;
                PostQuitMessage(0);
                return 0;
                
            case WM_PAINT: {
                PAINTSTRUCT ps;
                HDC hdc = BeginPaint(hwnd, &ps);
                EndPaint(hwnd, &ps);
                return 0;
            }
        }
        
        return DefWindowProcW(hwnd, msg, wParam, lParam);
    }
    
    /*
     * CreateOverlayWindow
     * 
     * Creates transparent overlay window with anti-screenshot protection
     */
    bool CreateOverlayWindow() {
        // Get screen dimensions
        g_Width = GetSystemMetrics(SM_CXSCREEN);
        g_Height = GetSystemMetrics(SM_CYSCREEN);
        
        // Register window class
        WNDCLASSEXW wc = { 0 };
        wc.cbSize = sizeof(WNDCLASSEXW);
        wc.style = CS_HREDRAW | CS_VREDRAW;
        wc.lpfnWndProc = OverlayWndProc;
        wc.hInstance = GetModuleHandleW(nullptr);
        wc.hCursor = LoadCursor(nullptr, IDC_ARROW);
        wc.lpszClassName = L"ABIOverlay";
        
        if (!RegisterClassExW(&wc)) {
            std::println("Failed to register window class");
            return false;
        }
        
        // Create overlay window
        g_OverlayWindow = CreateWindowExW(
            WS_EX_TOPMOST | WS_EX_TRANSPARENT | WS_EX_LAYERED | WS_EX_NOACTIVATE,
            L"ABIOverlay",
            L"ABI Overlay",
            WS_POPUP,
            0, 0,
            g_Width, g_Height,
            nullptr,
            nullptr,
            wc.hInstance,
            nullptr
        );
        
        if (!g_OverlayWindow) {
            std::println("Failed to create overlay window");
            return false;
        }
        
        // CRITICAL: Apply anti-screenshot protection
        // This prevents the overlay from being captured by screenshots/recordings
        // Essential for avoiding anti-cheat detection
        SetWindowDisplayAffinity(g_OverlayWindow, WDA_EXCLUDEFROMCAPTURE);
        
        // Make window transparent
        SetLayeredWindowAttributes(g_OverlayWindow, RGB(0, 0, 0), 255, LWA_ALPHA);
        
        // Show window
        ShowWindow(g_OverlayWindow, SW_SHOW);
        UpdateWindow(g_OverlayWindow);
        
        std::println("Overlay window created with anti-screenshot protection");
        return true;
    }
    
    /*
     * InitializeDirectX
     * 
     * Sets up DirectX 11 for rendering
     */
    bool InitializeDirectX() {
        // Swap chain description
        DXGI_SWAP_CHAIN_DESC scd = { 0 };
        scd.BufferCount = 2;
        scd.BufferDesc.Width = g_Width;
        scd.BufferDesc.Height = g_Height;
        scd.BufferDesc.Format = DXGI_FORMAT_R8G8B8A8_UNORM;
        scd.BufferDesc.RefreshRate.Numerator = 60;
        scd.BufferDesc.RefreshRate.Denominator = 1;
        scd.BufferUsage = DXGI_USAGE_RENDER_TARGET_OUTPUT;
        scd.OutputWindow = g_OverlayWindow;
        scd.SampleDesc.Count = 1;
        scd.SampleDesc.Quality = 0;
        scd.Windowed = TRUE;
        scd.SwapEffect = DXGI_SWAP_EFFECT_DISCARD;
        scd.Flags = DXGI_SWAP_CHAIN_FLAG_ALLOW_MODE_SWITCH;
        
        // Create device and swap chain
        D3D_FEATURE_LEVEL featureLevel;
        HRESULT hr = D3D11CreateDeviceAndSwapChain(
            nullptr,
            D3D_DRIVER_TYPE_HARDWARE,
            nullptr,
            0,
            nullptr,
            0,
            D3D11_SDK_VERSION,
            &scd,
            &g_SwapChain,
            &g_Device,
            &featureLevel,
            &g_Context
        );
        
        if (FAILED(hr)) {
            std::println("Failed to create DirectX device");
            return false;
        }
        
        // Create render target view
        ID3D11Texture2D* backBuffer = nullptr;
        g_SwapChain->GetBuffer(0, __uuidof(ID3D11Texture2D), (void**)&backBuffer);
        
        if (backBuffer) {
            g_Device->CreateRenderTargetView(backBuffer, nullptr, &g_RenderTargetView);
            backBuffer->Release();
        }
        
        std::println("DirectX initialized successfully");
        return true;
    }
    
    /*
     * InitializeOverlay
     * 
     * Main initialization function
     */
    bool InitializeOverlay() {
        std::println("Initializing overlay...");
        
        if (!CreateOverlayWindow()) {
            return false;
        }
        
        if (!InitializeDirectX()) {
            return false;
        }
        
        g_Running = true;
        std::println("Overlay initialized successfully");
        return true;
    }
    
    /*
     * CleanupOverlay
     * 
     * Releases DirectX resources
     */
    void CleanupOverlay() {
        if (g_RenderTargetView) {
            g_RenderTargetView->Release();
            g_RenderTargetView = nullptr;
        }
        
        if (g_SwapChain) {
            g_SwapChain->Release();
            g_SwapChain = nullptr;
        }
        
        if (g_Context) {
            g_Context->Release();
            g_Context = nullptr;
        }
        
        if (g_Device) {
            g_Device->Release();
            g_Device = nullptr;
        }
        
        if (g_OverlayWindow) {
            DestroyWindow(g_OverlayWindow);
            g_OverlayWindow = nullptr;
        }
        
        std::println("Overlay cleaned up");
    }
    
    /*
     * BeginFrame
     * 
     * Starts rendering frame
     */
    void BeginFrame() {
        if (!g_Context || !g_RenderTargetView) {
            return;
        }
        
        // Clear render target
        float clearColor[4] = { 0.0f, 0.0f, 0.0f, 0.0f };
        g_Context->ClearRenderTargetView(g_RenderTargetView, clearColor);
        g_Context->OMSetRenderTargets(1, &g_RenderTargetView, nullptr);
    }
    
    /*
     * EndFrame
     * 
     * Presents rendered frame
     */
    void EndFrame() {
        if (!g_SwapChain) {
            return;
        }
        
        g_SwapChain->Present(1, 0);
    }
    
    /*
     * ProcessMessages
     * 
     * Handles window messages
     */
    void ProcessMessages() {
        MSG msg;
        while (PeekMessageW(&msg, nullptr, 0, 0, PM_REMOVE)) {
            TranslateMessage(&msg);
            DispatchMessageW(&msg);
        }
    }
}
