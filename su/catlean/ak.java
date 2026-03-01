package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.IPasteable;

public final class ak {
   private static int t;
   private static final long a = j0.a(1197063816700048793L, 2676280641335646189L, MethodHandles.lookup().lookupClass()).a(242810017978073L);
   private static final String b;

   public static final void S(@NotNull IPasteable $this$hooks, char a, char a, int a) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      int var10000 = 4213818793079203881L.A<invokedynamic>(4213818793079203881L, var4);
      Intrinsics.checkNotNullParameter(var0, b);
      int var6 = var10000;

      try {
         Runtime.getRuntime().addShutdownHook((Thread)(new un()));
         if (var6 != 0) {
            (new int[4]).A<invokedynamic>(new int[4], 4217009392696293694L, var4);
         }

      } catch (NumberFormatException var7) {
         throw var7.A<invokedynamic>(var7, 4189006075205865841L, var4);
      }
   }

   public static void k(int var0) {
      t = var0;
   }

   public static int v() {
      return t;
   }

   public static int Q() {
      int var0 = v();

      try {
         return var0 == 0 ? 44 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   static {
      long var3 = a ^ 135070365665554L;
      if (1365289354012131863L.A<invokedynamic>(1365289354012131863L, var3) == 0) {
         105.A<invokedynamic>(105, 1308005845902988447L, var3);
      }

      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var3 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var3 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var2 = var0.doFinal("9VæØk}¨c".getBytes("ISO-8859-1"));
      String var5 = a(var2).intern();
      boolean var10001 = true;
      b = var5;
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
