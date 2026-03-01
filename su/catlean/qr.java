package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;

public final class qr {
   @NotNull
   public static final qr j;
   public static final int D;
   public static final int l;
   public static final int T;
   public static final int f;
   public static final int a;
   public static final int t = 0;

   private qr() {
   }

   static {
      long var1 = j0.a(7699994023536539908L, 3835616303789867455L, MethodHandles.lookup().lookupClass()).a(237969438462857L) ^ 44149301407412L;
      Cipher var3;
      Cipher var10000 = var3 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var1 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var4 = 1; var4 < 8; ++var4) {
         var10003[var4] = (byte)((int)(var1 << var4 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[5];
      int var6 = 0;
      String var7 = "\u0011*'+C\u0010¼f°\u0004¢\u001fg0}õ\u009b 0C§Ä*1";
      int var8 = "\u0011*'+C\u0010¼f°\u0004¢\u001fg0}õ\u009b 0C§Ä*1".length();
      int var5 = 0;

      label23:
      while(true) {
         int var10001 = var5;
         var5 += 8;
         byte[] var9 = var7.substring(var10001, var5).getBytes("ISO-8859-1");
         long[] var13 = var0;
         var10001 = var6++;
         long var14 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
         byte var16 = -1;

         while(true) {
            long var10 = var14;
            byte[] var12 = var3.doFinal(new byte[]{(byte)((int)(var10 >>> 56)), (byte)((int)(var10 >>> 48)), (byte)((int)(var10 >>> 40)), (byte)((int)(var10 >>> 32)), (byte)((int)(var10 >>> 24)), (byte)((int)(var10 >>> 16)), (byte)((int)(var10 >>> 8)), (byte)((int)var10)});
            long var18 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
            switch(var16) {
            case 0:
               var13[var10001] = var18;
               if (var5 >= var8) {
                  a = (int)var0[1];
                  T = (int)var0[4];
                  f = (int)var0[2];
                  l = (int)var0[0];
                  D = (int)var0[3];
                  j = new qr();
                  return;
               }
               break;
            default:
               var13[var10001] = var18;
               if (var5 < var8) {
                  continue label23;
               }

               var7 = "r\u0093¸\u009d\u0089Ü\\$sà&¬j{UÕ";
               var8 = "r\u0093¸\u009d\u0089Ü\\$sà&¬j{UÕ".length();
               var5 = 0;
            }

            var10001 = var5;
            var5 += 8;
            var9 = var7.substring(var10001, var5).getBytes("ISO-8859-1");
            var13 = var0;
            var10001 = var6++;
            var14 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
            var16 = 0;
         }
      }
   }
}
