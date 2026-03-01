package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2350;

// $FF: synthetic class
public final class rl {
   public static final int[] D;
   public static final int[] b;

   static {
      long var7 = j0.a(941856381779469894L, 2759721866078897303L, MethodHandles.lookup().lookupClass()).a(146915442807266L) ^ 46055766359992L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var7 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var7 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -5055313924697486308L;
      byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
      long var20 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
      boolean var10001 = true;
      long var0 = var20;
      int[] var9 = new int[gt.values().length];

      try {
         var9[gt.Normal.ordinal()] = 1;
      } catch (NoSuchFieldError var19) {
      }

      try {
         var9[gt.Silent.ordinal()] = 2;
      } catch (NoSuchFieldError var18) {
      }

      try {
         var9[gt.Alternative.ordinal()] = 3;
      } catch (NoSuchFieldError var17) {
      }

      D = var9;
      var9 = new int[class_2350.values().length];

      try {
         var9[class_2350.field_11033.ordinal()] = 1;
      } catch (NoSuchFieldError var16) {
      }

      try {
         var9[class_2350.field_11036.ordinal()] = 2;
      } catch (NoSuchFieldError var15) {
      }

      try {
         var9[class_2350.field_11043.ordinal()] = 3;
      } catch (NoSuchFieldError var14) {
      }

      try {
         var9[class_2350.field_11035.ordinal()] = 4;
      } catch (NoSuchFieldError var13) {
      }

      try {
         var9[class_2350.field_11039.ordinal()] = 5;
      } catch (NoSuchFieldError var12) {
      }

      try {
         var9[class_2350.field_11034.ordinal()] = (int)var0;
      } catch (NoSuchFieldError var11) {
      }

      b = var9;
   }
}
