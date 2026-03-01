package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $FF: synthetic class
public final class et {
   public static final int[] w;

   static {
      long var11 = j0.a(6572200854216216790L, 6160500984024063726L, MethodHandles.lookup().lookupClass()).a(182115957752413L) ^ 91215937984562L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var11 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[3];
      int var4 = 0;
      String var5 = "ò\u0014\u0094/w4Õ\u001b\u008f[î¶IÊaZHwwý8\u0097=µ";
      int var6 = "ò\u0014\u0094/w4Õ\u001b\u008f[î¶IÊaZHwwý8\u0097=µ".length();
      int var3 = 0;

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         var10001 = var4++;
         long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
         byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
         long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
         boolean var23 = true;
         var0[var10001] = var10004;
      } while(var3 < var6);

      int[] var13 = new int[gd.values().length];

      try {
         var13[gd.FadeOut.ordinal()] = 1;
      } catch (NoSuchFieldError var22) {
      }

      try {
         var13[gd.Size.ordinal()] = 2;
      } catch (NoSuchFieldError var21) {
      }

      try {
         var13[gd.Otkisuli.ordinal()] = 3;
      } catch (NoSuchFieldError var20) {
      }

      try {
         var13[gd.Insert.ordinal()] = 4;
      } catch (NoSuchFieldError var19) {
      }

      try {
         var13[gd.Fall.ordinal()] = 5;
      } catch (NoSuchFieldError var18) {
      }

      try {
         var13[gd.Rocket.ordinal()] = (int)var0[0];
      } catch (NoSuchFieldError var17) {
      }

      try {
         var13[gd.Roll.ordinal()] = (int)var0[2];
      } catch (NoSuchFieldError var16) {
      }

      try {
         var13[gd.Off.ordinal()] = (int)var0[1];
      } catch (NoSuchFieldError var15) {
      }

      w = var13;
   }
}
