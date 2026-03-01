package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum h_ {
   public static final h_ BEFORE_RANDOM;
   public static final h_ AFTER_RANDOM;
   private static final h_[] p;
   private static final EnumEntries a;

   @NotNull
   public static EnumEntries o() {
      return a;
   }

   private static final h_[] f() {
      h_[] var0 = new h_[]{BEFORE_RANDOM, AFTER_RANDOM};
      return var0;
   }

   static {
      long var9 = j0.a(7713212481355775056L, 7792973211494078189L, MethodHandles.lookup().lookupClass()).a(131600893586775L) ^ 107680857241606L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[2];
      int var6 = 0;
      String var5 = "\u001dÝ\u0088@ºóvu\u008dã]ýCÂ1W\u0010ð\u008a·#(é\u0012ú\u0088¿:O\u0013Í£ÿ";
      int var7 = "\u001dÝ\u0088@ºóvu\u008dã]ýCÂ1W\u0010ð\u008a·#(é\u0012ú\u0088¿:O\u0013Í£ÿ".length();
      char var4 = 16;
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            BEFORE_RANDOM = new h_(var0[0], 0);
            AFTER_RANDOM = new h_(var0[1], 1);
            p = f();
            a = EnumEntriesKt.enumEntries((Enum[])p);
            return;
         }

         var4 = var5.charAt(var3);
      }
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
