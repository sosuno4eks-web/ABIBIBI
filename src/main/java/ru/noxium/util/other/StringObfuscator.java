package ru.noxium.util.other;

/**
 * Simple XOR-based string obfuscation utility for runtime decryption.
 * Use the main method to encrypt strings for storage in code.
 */
public class StringObfuscator {
    
    // Static XOR key - change this to your own value
    private static final int[] XOR_KEY = {0x4E, 0x6F, 0x78, 0x69, 0x75, 0x6D};
    
    /**
     * Decrypts an encrypted integer array back to the original string.
     * @param encrypted Array of encrypted integers
     * @return Decrypted string
     */
    public static String decrypt(int[] encrypted) {
        char[] decrypted = new char[encrypted.length];
        for (int i = 0; i < encrypted.length; i++) {
            decrypted[i] = (char) (encrypted[i] ^ XOR_KEY[i % XOR_KEY.length]);
        }
        return new String(decrypted);
    }
    
    /**
     * Decrypts a hex string back to the original string.
     * @param encrypted Hex string (e.g., "0A1B2C3D")
     * @return Decrypted string
     */
    public static String decrypt(String encrypted) {
        int[] values = hexToIntArray(encrypted);
        return decrypt(values);
    }
    
    /**
     * Encrypts a string into an integer array.
     * @param plaintext String to encrypt
     * @return Encrypted integer array
     */
    public static int[] encrypt(String plaintext) {
        int[] encrypted = new int[plaintext.length()];
        for (int i = 0; i < plaintext.length(); i++) {
            encrypted[i] = plaintext.charAt(i) ^ XOR_KEY[i % XOR_KEY.length];
        }
        return encrypted;
    }
    
    /**
     * Encrypts a string into a hex string.
     * @param plaintext String to encrypt
     * @return Hex string representation
     */
    public static String encryptToHex(String plaintext) {
        int[] encrypted = encrypt(plaintext);
        return intArrayToHex(encrypted);
    }
    
    // Helper methods
    private static String intArrayToHex(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int value : array) {
            sb.append(String.format("%02X", value));
        }
        return sb.toString();
    }
    
    private static int[] hexToIntArray(String hex) {
        int[] result = new int[hex.length() / 2];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(hex.substring(i * 2, i * 2 + 2), 16);
        }
        return result;
    }
    
    /**
     * Main method for encrypting strings during development.
     * Run this to generate encrypted versions of your strings.
     */
    public static void main(String[] args) {
        String[] stringsToEncrypt = {
            "AimAssist",
            "WardenESP",
            "TriggerBot",
            "ChestStealer",
            "MiddleClick"
        };
        
        System.out.println("=== String Obfuscation Tool ===\n");
        
        for (String str : stringsToEncrypt) {
            int[] encrypted = encrypt(str);
            String hexEncrypted = encryptToHex(str);
            
            System.out.println("Original: " + str);
            System.out.println("Encrypted (int array): new int[]{" + arrayToString(encrypted) + "}");
            System.out.println("Encrypted (hex): \"" + hexEncrypted + "\"");
            System.out.println("Decrypted test: " + decrypt(encrypted));
            System.out.println();
        }
    }
    
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append("0x").append(String.format("%02X", array[i]));
            if (i < array.length - 1) sb.append(", ");
        }
        return sb.toString();
    }
}
