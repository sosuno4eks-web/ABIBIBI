package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class _j {
   private static String[] g;
   private static final long a = j0.a(8591450556875811491L, 7111659369040307068L, MethodHandles.lookup().lookupClass()).a(41257398861002L);
   private static final long b;

   public static final boolean O(int key, long a) {
      // $FF: Couldn't be decompiled
   }

   public static void J(String[] var0) {
      g = var0;
   }

   public static String[] A() {
      return g;
   }

   static {
      long var5 = a ^ 70695197829978L;
      if (-2254750870943990871L.A<invokedynamic>(-2254750870943990871L, var5) != null) {
         (new String[4]).A<invokedynamic>(new String[4], -2280711246673228214L, var5);
      }

      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = 6929927821077275214L;
      byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
      long var7 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
      boolean var10001 = true;
      b = var7;
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
