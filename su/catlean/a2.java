package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum a2 {
   public static final a2 DROP;
   public static final a2 FLY;
   public static final a2 FALLING_STARS;
   public static final a2 RAIN;
   private static final a2[] K;
   private static final EnumEntries y;

   @NotNull
   public static EnumEntries E() {
      return y;
   }

   private static final a2[] b() {
      a2[] var0 = new a2[]{DROP, FLY, FALLING_STARS, RAIN};
      return var0;
   }

   static {
      long var9 = j0.a(2017360694211983663L, 8309519672408081390L, MethodHandles.lookup().lookupClass()).a(263578234387971L) ^ 100258652384288L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[4];
      int var6 = 0;
      String var5 = "÷5R\u0013¤\u0000¼*\bÜX<\u0082»»ï ";
      int var7 = "÷5R\u0013¤\u0000¼*\bÜX<\u0082»»ï ".length();
      char var4 = '\b';
      int var3 = -1;

      label28:
      while(true) {
         ++var3;
         String var11 = var5.substring(var3, var3 + var4);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var1.doFinal(var11.getBytes("ISO-8859-1"));
            String var15 = a(var8).intern();
            switch(var10001) {
            case 0:
               var0[var6++] = var15;
               if ((var3 += var4) >= var7) {
                  DROP = new a2(var0[3], 0);
                  FLY = new a2(var0[0], 1);
                  FALLING_STARS = new a2(var0[2], 2);
                  RAIN = new a2(var0[1], 3);
                  K = b();
                  y = EnumEntriesKt.enumEntries((Enum[])K);
                  return;
               }

               var4 = var5.charAt(var3);
               break;
            default:
               var0[var6++] = var15;
               if ((var3 += var4) < var7) {
                  var4 = var5.charAt(var3);
                  continue label28;
               }

               var5 = "\u0019¨¤c>¼4ä®Ä\u000f|&\u0099»&\b¬{y\u008f§k/Ã";
               var7 = "\u0019¨¤c>¼4ä®Ä\u000f|&\u0099»&\b¬{y\u008f§k/Ã".length();
               var4 = 16;
               var3 = -1;
            }

            ++var3;
            var11 = var5.substring(var3, var3 + var4);
            var10001 = 0;
         }
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
