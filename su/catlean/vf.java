package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

enum vf {
   public static final vf NONE;
   public static final vf ALWAYS;
   public static final vf ELYTRA_PLUS;
   public static final vf IGNORE;
   private static final vf[] l;
   private static final EnumEntries x;

   @NotNull
   public static EnumEntries s() {
      return x;
   }

   private static final vf[] R() {
      vf[] var0 = new vf[]{NONE, ALWAYS, ELYTRA_PLUS, IGNORE};
      return var0;
   }

   static {
      long var9 = j0.a(4096440859816752609L, 9118711324325679853L, MethodHandles.lookup().lookupClass()).a(68330626551992L) ^ 139406344520530L;
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
      String var5 = "gtÜ\u0007òæ³Ã\b&Â\u008f0}EçU";
      int var7 = "gtÜ\u0007òæ³Ã\b&Â\u008f0}EçU".length();
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
                  NONE = new vf(var0[3], 0);
                  ALWAYS = new vf(var0[1], 1);
                  ELYTRA_PLUS = new vf(var0[2], 2);
                  IGNORE = new vf(var0[0], 3);
                  l = R();
                  x = EnumEntriesKt.enumEntries((Enum[])l);
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

               var5 = "°&'\u0081nÆ)²\u0016k+\u008bñ\u009bz¾\b,ï[AÑ\u0004·7";
               var7 = "°&'\u0081nÆ)²\u0016k+\u008bñ\u009bz¾\b,ï[AÑ\u0004·7".length();
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
