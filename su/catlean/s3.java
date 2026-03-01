package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum s3 {
   public static final s3 CUSTOM;
   public static final s3 SYNC;
   public static final s3 RGB;
   public static final s3 SKY;
   public static final s3 LIGHT_RGB;
   private static final s3[] K;
   private static final EnumEntries B;
   private static String[] A;

   @NotNull
   public static EnumEntries D() {
      return B;
   }

   private static final s3[] b() {
      s3[] var0 = new s3[]{CUSTOM, SYNC, RGB, SKY, LIGHT_RGB};
      return var0;
   }

   static {
      long var9 = j0.a(7865685795574249070L, 2837313508693082052L, MethodHandles.lookup().lookupClass()).a(55241736136645L) ^ 130217592858610L;
      if (5625118628961184111L.A<invokedynamic>(5625118628961184111L, var9) != null) {
         (new String[4]).A<invokedynamic>(new String[4], 5686701818516318277L, var9);
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
      String var5 = "\u0091ð\u001dÚTy9\u0095\b\u001c\u0095¯é\u009eò\u0007j\b\u0015K_ÓÄ\u008a\n2";
      int var7 = "\u0091ð\u001dÚTy9\u0095\b\u001c\u0095¯é\u009eò\u0007j\b\u0015K_ÓÄ\u008a\n2".length();
      char var4 = '\b';
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
                  CUSTOM = new s3(var0[2], 0);
                  SYNC = new s3(var0[4], 1);
                  RGB = new s3(var0[0], 2);
                  SKY = new s3(var0[1], 3);
                  LIGHT_RGB = new s3(var0[3], 4);
                  K = b();
                  B = EnumEntriesKt.enumEntries((Enum[])K);
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

               var5 = "\rÉ\u0089\fwnO\u008e\u0017¡\u007f5z^f\u0090\b\u009aäJÌÔ{ý<";
               var7 = "\rÉ\u0089\fwnO\u008e\u0017¡\u007f5z^f\u0090\b\u009aäJÌÔ{ý<".length();
               var4 = 16;
               var3 = -1;
            }

            ++var3;
            var11 = var5.substring(var3, var3 + var4);
            var10001 = 0;
         }
      }
   }

   public static void P(String[] var0) {
      A = var0;
   }

   public static String[] p() {
      return A;
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
