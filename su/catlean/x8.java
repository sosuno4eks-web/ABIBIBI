package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum x8 {
   public static final x8 DEFAULT;
   public static final x8 MATRIX;
   public static final x8 MATRIX_2;
   public static final x8 WATER_BUCKET;
   public static final x8 FT_FENCE;
   private static final x8[] b;
   private static final EnumEntries G;
   private static int P;

   @NotNull
   public static EnumEntries a() {
      return G;
   }

   private static final x8[] y() {
      x8[] var0 = new x8[]{DEFAULT, MATRIX, MATRIX_2, WATER_BUCKET, FT_FENCE};
      return var0;
   }

   static {
      long var9 = j0.a(7178377100586950479L, 4362323857736917188L, MethodHandles.lookup().lookupClass()).a(5555673143034L) ^ 121229984729377L;
      if (-5632930673797942352L.A<invokedynamic>(-5632930673797942352L, var9) != 0) {
         42.A<invokedynamic>(42, -5666600097862941222L, var9);
      }

      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[5];
      int var6 = 0;
      String var5 = "LªW¢\u009a^\u001c»\u0093<)(,¶ôµ\u0010D}u\u0088aR»\b\u0013\u0084Ç|o\u0003µg\bÖ\u00adFÌ\u009d_\u00ad»";
      int var7 = "LªW¢\u009a^\u001c»\u0093<)(,¶ôµ\u0010D}u\u0088aR»\b\u0013\u0084Ç|o\u0003µg\bÖ\u00adFÌ\u009d_\u00ad»".length();
      char var4 = 16;
      int var3 = -1;

      label32:
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
                  DEFAULT = new x8(var0[2], 0);
                  MATRIX = new x8(var0[4], 1);
                  MATRIX_2 = new x8(var0[0], 2);
                  WATER_BUCKET = new x8(var0[3], 3);
                  FT_FENCE = new x8(var0[1], 4);
                  b = y();
                  G = EnumEntriesKt.enumEntries((Enum[])b);
                  return;
               }

               var4 = var5.charAt(var3);
               break;
            default:
               var0[var6++] = var15;
               if ((var3 += var4) < var7) {
                  var4 = var5.charAt(var3);
                  continue label32;
               }

               var5 = "´\u0012E9\u0097¢r\u0092\u0005ÑË[4Æ\u0019\u0082\b\u0013Õ`\u008e&x\u0090É";
               var7 = "´\u0012E9\u0097¢r\u0092\u0005ÑË[4Æ\u0019\u0082\b\u0013Õ`\u008e&x\u0090É".length();
               var4 = 16;
               var3 = -1;
            }

            ++var3;
            var11 = var5.substring(var3, var3 + var4);
            var10001 = 0;
         }
      }
   }

   public static void k(int var0) {
      P = var0;
   }

   public static int A() {
      return P;
   }

   public static int i() {
      int var0 = A();

      try {
         return var0 == 0 ? 99 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
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
