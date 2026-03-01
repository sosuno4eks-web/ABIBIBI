package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum rw {
   public static final rw DISTANCE;
   public static final rw FOV;
   public static final rw HEALTH;
   private static final rw[] l;
   private static final EnumEntries e;
   private static String[] X;

   @NotNull
   public static EnumEntries m() {
      return e;
   }

   private static final rw[] x() {
      rw[] var0 = new rw[]{DISTANCE, FOV, HEALTH};
      return var0;
   }

   static {
      long var9 = j0.a(1221359661541761237L, 5557603746869907785L, MethodHandles.lookup().lookupClass()).a(82154523806651L) ^ 130680549952480L;
      if (-7514795077482068249L.A<invokedynamic>(-7514795077482068249L, var9) != null) {
         (new String[2]).A<invokedynamic>(new String[2], -7497665068690811589L, var9);
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
      String var5 = "\u0093\u0007\u001f\u008aÍ\r\u0002\"âä\u0090\u0001³å\u0004^\bS\u0000\u008e¾rëlº\b\u0082JÅËs¨â²";
      int var7 = "\u0093\u0007\u001f\u008aÍ\r\u0002\"âä\u0090\u0001³å\u0004^\bS\u0000\u008e¾rëlº\b\u0082JÅËs¨â²".length();
      char var4 = 16;
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            DISTANCE = new rw(var0[0], 0);
            FOV = new rw(var0[2], 1);
            HEALTH = new rw(var0[1], 2);
            l = x();
            e = EnumEntriesKt.enumEntries((Enum[])l);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void K(String[] var0) {
      X = var0;
   }

   public static String[] H() {
      return X;
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
