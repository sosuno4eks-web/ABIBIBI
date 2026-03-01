package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $FF: synthetic class
public final class u3 {
   public static final int[] h;

   static {
      long var7 = j0.a(3654879131796361735L, 2131945793463079521L, MethodHandles.lookup().lookupClass()).a(5337574289916L) ^ 17297618039226L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var7 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var7 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -4064450954846103270L;
      byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
      long var17 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
      boolean var10001 = true;
      long var0 = var17;
      int[] var9 = new int[uw.values().length];

      try {
         var9[uw.NORMAL.ordinal()] = 1;
      } catch (NoSuchFieldError var16) {
      }

      try {
         var9[uw.SILENT.ordinal()] = 2;
      } catch (NoSuchFieldError var15) {
      }

      try {
         var9[uw.INVENTORY_NORMAL.ordinal()] = 3;
      } catch (NoSuchFieldError var14) {
      }

      try {
         var9[uw.INVENTORY_SILENT.ordinal()] = 4;
      } catch (NoSuchFieldError var13) {
      }

      try {
         var9[uw.NORMAL_FULL.ordinal()] = 5;
      } catch (NoSuchFieldError var12) {
      }

      try {
         var9[uw.SILENT_FULL.ordinal()] = (int)var0;
      } catch (NoSuchFieldError var11) {
      }

      h = var9;
   }
}
