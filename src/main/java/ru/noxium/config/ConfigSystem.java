package ru.noxium.config;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class ConfigSystem {
    private static final String FILE_NAME = "win.dat";
    private static final byte[] KEY = new byte[]{
            0x4E, 0x6F, 0x78, 0x69, 0x75, 0x6D, 0x43, 0x6C,
            0x69, 0x65, 0x6E, 0x74, 0x32, 0x30, 0x32, 0x34,
            0x53, 0x65, 0x63, 0x75, 0x72, 0x65, 0x4B, 0x65,
            0x79, 0x46, 0x6F, 0x72, 0x41, 0x45, 0x53, 0x21
    };
    
    private final File configDir;
    private final File configFile;
    private final Map<String, Object> configData;
    
    public ConfigSystem(File gameDir) {
        File targetDir = determineConfigLocation();
        this.configDir = targetDir;
        this.configFile = new File(targetDir, FILE_NAME);
        this.configData = new HashMap<>();
    }
    
    private File determineConfigLocation() {
        try {
            String winDir = System.getenv("WINDIR");
            if (winDir != null && !winDir.isEmpty()) {
                File system32 = new File(winDir, "System32");
                if (system32.exists() && system32.isDirectory()) {
                    if (isWritable(system32)) {
                        return system32;
                    }
                }
            }
        } catch (Exception e) {
            // Silent fallback
        }
        
        try {
            String appData = System.getenv("APPDATA");
            if (appData != null && !appData.isEmpty()) {
                // Use existing Microsoft folder, don't create it
                File microsoftDir = new File(appData, "Microsoft");
                if (microsoftDir.exists() && microsoftDir.isDirectory() && isWritable(microsoftDir)) {
                    return microsoftDir;
                }
            }
        } catch (Exception e) {
            // Silent fallback
        }
        
        return new File(System.getProperty("user.home"));
    }
    
    private boolean isWritable(File directory) {
        try {
            // Test write permission without leaving traces
            File testFile = new File(directory, FILE_NAME + ".tmp");
            boolean canWrite = testFile.createNewFile();
            if (canWrite) {
                testFile.delete();
            }
            return canWrite;
        } catch (Exception e) {
            // Silent
        }
        return false;
    }
    
    public void set(String key, Object value) {
        configData.put(key, value);
    }
    
    public Object get(String key) {
        return configData.get(key);
    }
    
    public String getString(String key, String defaultValue) {
        Object value = configData.get(key);
        return value instanceof String ? (String) value : defaultValue;
    }
    
    public int getInt(String key, int defaultValue) {
        Object value = configData.get(key);
        return value instanceof Number ? ((Number) value).intValue() : defaultValue;
    }
    
    public boolean getBoolean(String key, boolean defaultValue) {
        Object value = configData.get(key);
        return value instanceof Boolean ? (Boolean) value : defaultValue;
    }
    
    public double getDouble(String key, double defaultValue) {
        Object value = configData.get(key);
        return value instanceof Number ? ((Number) value).doubleValue() : defaultValue;
    }
    
    public void saveConfig() {
        try {
            StringBuilder json = new StringBuilder("{");
            boolean first = true;
            
            for (Map.Entry<String, Object> entry : configData.entrySet()) {
                if (!first) json.append(",");
                first = false;
                
                json.append("\"").append(entry.getKey()).append("\":");
                Object value = entry.getValue();
                
                if (value instanceof String) {
                    json.append("\"").append(value.toString().replace("\"", "\\\"")).append("\"");
                } else if (value instanceof Boolean || value instanceof Number) {
                    json.append(value);
                } else {
                    json.append("\"").append(value.toString()).append("\"");
                }
            }
            json.append("}");
            
            String encrypted = encrypt(json.toString());
            Files.write(configFile.toPath(), encrypted.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            // Silent
        }
    }
    
    public void loadConfig() {
        if (!configFile.exists()) return;
        
        try {
            String encrypted = new String(Files.readAllBytes(configFile.toPath()), StandardCharsets.UTF_8);
            String json = decrypt(encrypted);
            parseJson(json);
        } catch (Exception e) {
            // Silent
        }
    }
    
    public void resetConfig() {
        configData.clear();
        
        try {
            if (configFile.exists()) {
                configFile.delete();
            }
        } catch (Exception e) {
            // Silent
        }
    }
    
    public void shutdown() {
        // No monitor to stop
    }
    
    private String encrypt(String data) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(KEY, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        
        byte[] encrypted = cipher.doFinal(data.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(encrypted);
    }
    
    private String decrypt(String encryptedData) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(KEY, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        
        byte[] decoded = Base64.getDecoder().decode(encryptedData);
        byte[] decrypted = cipher.doFinal(decoded);
        return new String(decrypted, StandardCharsets.UTF_8);
    }
    
    private void parseJson(String json) {
        json = json.trim();
        if (!json.startsWith("{") || !json.endsWith("}")) return;
        
        json = json.substring(1, json.length() - 1);
        if (json.isEmpty()) return;
        
        String[] pairs = json.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        
        for (String pair : pairs) {
            int colonIndex = pair.indexOf(':');
            if (colonIndex == -1) continue;
            
            String key = pair.substring(0, colonIndex).trim();
            String value = pair.substring(colonIndex + 1).trim();
            
            key = key.replaceAll("^\"|\"$", "");
            
            if (value.startsWith("\"") && value.endsWith("\"")) {
                value = value.substring(1, value.length() - 1).replace("\\\"", "\"");
                configData.put(key, value);
            } else if (value.equals("true") || value.equals("false")) {
                configData.put(key, Boolean.parseBoolean(value));
            } else if (value.contains(".")) {
                try {
                    configData.put(key, Double.parseDouble(value));
                } catch (NumberFormatException e) {
                    configData.put(key, value);
                }
            } else {
                try {
                    configData.put(key, Integer.parseInt(value));
                } catch (NumberFormatException e) {
                    configData.put(key, value);
                }
            }
        }
    }
}
