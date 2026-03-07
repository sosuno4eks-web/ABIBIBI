public class GetHash {
    public static void main(String[] args) {
        String key = "LevkinFFn1Xfortnite123455";
        int hash = key.hashCode();
        System.out.println("Secret key hash: " + hash);
        
        // Test encoding/decoding
        String test = "Horizontal Speed";
        int[] encoded = new int[test.length()];
        for (int i = 0; i < test.length(); i++) {
            encoded[i] = test.charAt(i) ^ hash;
        }
        
        System.out.print("Encoded array: new int[]{");
        for (int i = 0; i < encoded.length; i++) {
            System.out.print(encoded[i]);
            if (i < encoded.length - 1) System.out.print(", ");
        }
        System.out.println("};");
        
        // Test decode
        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < encoded.length; i++) {
            decoded.append((char)(encoded[i] ^ hash));
        }
        System.out.println("Decoded: " + decoded.toString());
    }
}
