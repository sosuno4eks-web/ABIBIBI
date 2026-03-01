package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum e_ {
   public static final e_ Off;
   public static final e_ Old;
   public static final e_ New;
   public static final e_ Motion;
   private static final e_[] h;
   private static final EnumEntries V;
   private static String[] z;

   @NotNull
   public static EnumEntries O() {
      return V;
   }

   private static final e_[] x() {
      e_[] var0 = new e_[]{Off, Old, New, Motion};
      return var0;
   }

   static {
      long var9 = j0.a(3200446243263783657L, 1601275690748393411L, MethodHandles.lookup().lookupClass()).a(146455325714235L) ^ 97445460434363L;
      if (2563227989277651755L.A<invokedynamic>(2563227989277651755L, var9) == null) {
         (new String[3]).A<invokedynamic>(new String[3], 2594034964556942715L, var9);
      }

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
      String var5 = "ÒDÚ·Âxãß\bÔ\u008f_ßÁ\u0088]Ï";
      int var7 = "ÒDÚ·Âxãß\bÔ\u008f_ßÁ\u0088]Ï".length();
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
                  Off = new e_(var0[0], 0);
                  Old = new e_(var0[1], 1);
                  New = new e_(var0[2], 2);
                  Motion = new e_(var0[3], 3);
                  h = x();
                  V = EnumEntriesKt.enumEntries((Enum[])h);
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

               var5 = "\u0096.èGR\u001cx¼\bÝ\u000eézè\n\u0014Ñ";
               var7 = "\u0096.èGR\u001cx¼\bÝ\u000eézè\n\u0014Ñ".length();
               var4 = '\b';
               var3 = -1;
            }

            ++var3;
            var11 = var5.substring(var3, var3 + var4);
            var10001 = 0;
         }
      }
   }

   public static void b(String[] var0) {
      z = var0;
   }

   public static String[] P() {
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
