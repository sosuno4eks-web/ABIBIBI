package ru.noxium.config;

/**
 * GUI Integration Example for ConfigSystem
 * 
 * This class shows how to integrate the config system with your GUI.
 * Add these methods to your existing GUI class.
 */
public class ConfigGUI {
    
    private ConfigSystem configSystem;
    
    public void initConfig() {
        // Initialize config system (pass null since we don't use gameDir anymore)
        configSystem = new ConfigSystem(null);
        configSystem.loadConfig();
    }
    
    /**
     * Call this method when the user clicks the "Save" button in your GUI
     */
    public void onSaveButtonClick() {
        if (configSystem != null) {
            // Save all current settings to win.dat
            configSystem.saveConfig();
        }
    }
    
    /**
     * Call this method when the user clicks the "Reset" button in your GUI
     */
    public void onResetButtonClick() {
        if (configSystem != null) {
            // Delete win.dat and clear all settings from memory
            configSystem.resetConfig();
        }
    }
    
    /**
     * Example: Saving module states
     */
    public void saveModuleState(String moduleName, boolean enabled) {
        if (configSystem != null) {
            configSystem.set("module." + moduleName, enabled);
        }
    }
    
    /**
     * Example: Loading module states
     */
    public boolean loadModuleState(String moduleName) {
        if (configSystem != null) {
            return configSystem.getBoolean("module." + moduleName, false);
        }
        return false;
    }
    
    /**
     * Call this when the game closes
     */
    public void onGameClose() {
        if (configSystem != null) {
            configSystem.shutdown();
        }
    }
}
