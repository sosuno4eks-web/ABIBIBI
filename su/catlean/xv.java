package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum xv {
   public static final xv Timer;
   public static final xv Motion;
   private static final xv[] A;
   private static final EnumEntries e;
   private static boolean G;

   @NotNull
   public static EnumEntries d() {
      return e;
   }

   private static final xv[] a() {
      xv[] var0 = new xv[]{Timer, Motion};
      return var0;
   }

   static {
      long var9 = j0.a(8892344888017924147L, 1252031736996825587L, MethodHandles.lookup().lookupClass()).a(196872766502827L) ^ 126534558276853L;
      if (-949454978303584442L.A<invokedynamic>(-949454978303584442L, var9)) {
         true.A<invokedynamic>(true, -961200101085307200L, var9);
      }

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
      String var5 = "=b?ÃÐë\u0081ë\b{bÑ\u008a\u0098së\u001d";
      int var7 = "=b?ÃÐë\u0081ë\b{bÑ\u008a\u0098së\u001d".length();
      char var4 = '\b';
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            Timer = new xv(var0[1], 0);
            Motion = new xv(var0[0], 1);
            A = a();
            e = EnumEntriesKt.enumEntries((Enum[])A);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void V(boolean var0) {
      G = var0;
   }

   public static boolean W() {
      return G;
   }

   public static boolean j() {
      boolean var0 = W();

      try {
         return !var0;
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
