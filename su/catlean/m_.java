package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $FF: synthetic class
public final class m_ {
   public static final int[] t;
   private static String[] W;

   static {
      long var7 = j0.a(5163767996337011141L, 3443877159052997548L, MethodHandles.lookup().lookupClass()).a(99751260637603L) ^ 37915021064969L;
      if (3273984417886292407L.A<invokedynamic>(3273984417886292407L, var7) == null) {
         (new String[2]).A<invokedynamic>(new String[2], 3279581111791555172L, var7);
      }

      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var7 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var7 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -6825844216397511787L;
      byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
      long var17 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
      boolean var10001 = true;
      long var0 = var17;
      int[] var9 = new int[pt.values().length];

      try {
         var9[pt.CubeFill.ordinal()] = 1;
      } catch (NoSuchFieldError var16) {
      }

      try {
         var9[pt.Shader.ordinal()] = 2;
      } catch (NoSuchFieldError var15) {
      }

      try {
         var9[pt.CubeOutline.ordinal()] = 3;
      } catch (NoSuchFieldError var14) {
      }

      try {
         var9[pt.CubeBoth.ordinal()] = 4;
      } catch (NoSuchFieldError var13) {
      }

      try {
         var9[pt.Fade.ordinal()] = 5;
      } catch (NoSuchFieldError var12) {
      }

      try {
         var9[pt.BLOOM.ordinal()] = (int)var0;
      } catch (NoSuchFieldError var11) {
      }

      t = var9;
   }

   public static void I(String[] var0) {
      W = var0;
   }

   public static String[] C() {
      return W;
   }
}
