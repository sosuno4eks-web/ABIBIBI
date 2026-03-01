package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $FF: synthetic class
public final class me {
   public static final int[] C;

   static {
      long var11 = j0.a(5886445253942317612L, 1720308715814345598L, MethodHandles.lookup().lookupClass()).a(18549144908748L) ^ 108026431629746L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var11 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[4];
      int var4 = 0;
      String var5 = "*{-M«Fkë\fI\u0007GqC^¸";
      int var6 = "*{-M«Fkë\fI\u0007GqC^¸".length();
      int var3 = 0;

      label81:
      while(true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         long[] var24 = var0;
         var10001 = var4++;
         long var25 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
         byte var27 = -1;

         while(true) {
            long var8 = var25;
            byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
            long var29 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
            switch(var27) {
            case 0:
               var24[var10001] = var29;
               if (var3 >= var6) {
                  int[] var13 = new int[py.values().length];

                  try {
                     var13[py.Static.ordinal()] = 1;
                  } catch (NoSuchFieldError var23) {
                  }

                  try {
                     var13[py.Decrease.ordinal()] = 2;
                  } catch (NoSuchFieldError var22) {
                  }

                  try {
                     var13[py.Fade.ordinal()] = 3;
                  } catch (NoSuchFieldError var21) {
                  }

                  try {
                     var13[py.FILL.ordinal()] = 4;
                  } catch (NoSuchFieldError var20) {
                  }

                  try {
                     var13[py.Flash.ordinal()] = 5;
                  } catch (NoSuchFieldError var19) {
                  }

                  try {
                     var13[py.Grow.ordinal()] = (int)var0[0];
                  } catch (NoSuchFieldError var18) {
                  }

                  try {
                     var13[py.TNT.ordinal()] = (int)var0[2];
                  } catch (NoSuchFieldError var17) {
                  }

                  try {
                     var13[py.Pull.ordinal()] = (int)var0[1];
                  } catch (NoSuchFieldError var16) {
                  }

                  try {
                     var13[py.Hover.ordinal()] = (int)var0[3];
                  } catch (NoSuchFieldError var15) {
                  }

                  C = var13;
                  return;
               }
               break;
            default:
               var24[var10001] = var29;
               if (var3 < var6) {
                  continue label81;
               }

               var5 = "{ÐóU\u001f7ñJäÉú!\u000eª®¿";
               var6 = "{ÐóU\u001f7ñJäÉú!\u000eª®¿".length();
               var3 = 0;
            }

            var10001 = var3;
            var3 += 8;
            var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
            var24 = var0;
            var10001 = var4++;
            var25 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
            var27 = 0;
         }
      }
   }
}
