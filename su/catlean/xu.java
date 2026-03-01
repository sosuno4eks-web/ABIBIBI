package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum xu {
   public static final xu SINGLE;
   public static final xu DOUBLE_X;
   public static final xu DOUBLE_Z;
   public static final xu QUAD;
   // $FF: synthetic field
   private static final EnumEntries w;

   @NotNull
   public static EnumEntries c() {
      return w;
   }

   // $FF: synthetic method
   private static final xu[] S() {
      xu[] var0 = new xu[]{SINGLE, DOUBLE_X, DOUBLE_Z, QUAD};
      return var0;
   }

   static {
      long var9 = j0.a(6628405991737152595L, 7836992947419673655L, MethodHandles.lookup().lookupClass()).a(51728020621973L) ^ 14079712954153L;
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
      String var5 = ":ÅÜ\u001fÈ:öUÑùC\u0096mËÔÝ\u0010Ñ¨¡;ø[\u0011 Cx$|\u008e«ÄØ";
      int var7 = ":ÅÜ\u001fÈ:öUÑùC\u0096mËÔÝ\u0010Ñ¨¡;ø[\u0011 Cx$|\u008e«ÄØ".length();
      char var4 = 16;
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
                  SINGLE = new xu(var0[3], 0);
                  DOUBLE_X = new xu(var0[1], 1);
                  DOUBLE_Z = new xu(var0[0], 2);
                  QUAD = new xu(var0[2], 3);
                  w = EnumEntriesKt.enumEntries((Enum[])n);
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

               var5 = "v&W¢ª\u0001\u0017®\b\u009aµì\u001e<Ù|\u0090";
               var7 = "v&W¢ª\u0001\u0017®\b\u009aµì\u001e<Ù|\u0090".length();
               var4 = '\b';
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
