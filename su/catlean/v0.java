package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum v0 {
   public static final v0 NONE;
   public static final v0 ALL;
   public static final v0 ONLY_CRYSTALS;
   // $FF: synthetic field
   private static final EnumEntries m;
   private static int[] z;

   @NotNull
   public static EnumEntries t() {
      return m;
   }

   // $FF: synthetic method
   private static final v0[] K() {
      v0[] var0 = new v0[]{NONE, ALL, ONLY_CRYSTALS};
      return var0;
   }

   static {
      long var9 = j0.a(6723116787999559181L, 7133085437963977233L, MethodHandles.lookup().lookupClass()).a(49748568810635L) ^ 128475682907053L;
      if (-8826518315518515278L.A<invokedynamic>(-8826518315518515278L, var9) == null) {
         (new int[3]).A<invokedynamic>(new int[3], -8842767782262948401L, var9);
      }

      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[3];
      int var6 = 0;
      String var5 = "\\\u008cBá²Röð\n\u001b\n\u009a\u001eF*\u0099\bùðç}ä\u0000Ô¬\bí\u000f\u0003ZWÞÈÿ";
      int var7 = "\\\u008cBá²Röð\n\u001b\n\u009a\u001eF*\u0099\bùðç}ä\u0000Ô¬\bí\u000f\u0003ZWÞÈÿ".length();
      char var4 = 16;
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            NONE = new v0(var0[1], 0);
            ALL = new v0(var0[2], 1);
            ONLY_CRYSTALS = new v0(var0[0], 2);
            m = EnumEntriesKt.enumEntries((Enum[])T);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void i(int[] var0) {
      z = var0;
   }

   public static int[] z() {
      return z;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for(int var4 = 0; var4 < var2; ++var4) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else {
            char var6;
            byte var7;
            if (var5 < 224) {
               var6 = (char)((char)(var5 & 31) << 6);
               ++var4;
               var7 = var0[var4];
               var6 |= (char)(var7 & 63);
               var3[var1++] = var6;
            } else if (var4 < var2 - 2) {
               var6 = (char)((char)(var5 & 15) << 12);
               ++var4;
               var7 = var0[var4];
               var6 = (char)(var6 | (char)(var7 & 63) << 6);
               ++var4;
               var7 = var0[var4];
               var6 |= (char)(var7 & 63);
               var3[var1++] = var6;
            }
         }
      }

      return new String(var3, 0, var1);
   }
}
