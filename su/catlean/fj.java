package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2350;

// $FF: synthetic class
public final class fj {
   public static final int[] m;
   private static k9[] K;

   static {
      long var7 = j0.a(496582086561418383L, 1554855776905719889L, MethodHandles.lookup().lookupClass()).a(249551943796496L) ^ 73404060383787L;
      if (-6357792010752521122L.A<invokedynamic>(-6357792010752521122L, var7) == null) {
         (new k9[1]).A<invokedynamic>(new k9[1], -6341635643338047858L, var7);
      }

      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var7 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var7 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -1372288246724554563L;
      byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
      long var17 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
      boolean var10001 = true;
      long var0 = var17;
      int[] var9 = new int[class_2350.values().length];

      try {
         var9[class_2350.field_11043.ordinal()] = 1;
      } catch (NoSuchFieldError var16) {
      }

      try {
         var9[class_2350.field_11035.ordinal()] = 2;
      } catch (NoSuchFieldError var15) {
      }

      try {
         var9[class_2350.field_11034.ordinal()] = 3;
      } catch (NoSuchFieldError var14) {
      }

      try {
         var9[class_2350.field_11039.ordinal()] = 4;
      } catch (NoSuchFieldError var13) {
      }

      try {
         var9[class_2350.field_11036.ordinal()] = 5;
      } catch (NoSuchFieldError var12) {
      }

      try {
         var9[class_2350.field_11033.ordinal()] = (int)var0;
      } catch (NoSuchFieldError var11) {
      }

      m = var9;
   }

   public static void g(k9[] var0) {
      K = var0;
   }

   public static k9[] S() {
      return K;
   }
}
