package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.SplashOverlayEvent;
import su.catlean.gofra.Flow;

public final class ux {
   @NotNull
   public static final ux F;
   @NotNull
   private static final fs H;
   @NotNull
   private static final aa e;

   private ux() {
   }

   @Flow
   private final void R(SplashOverlayEvent var1) {
   }

   static {
      long var22 = j0.a(9143945666992862686L, 2422238716388891554L, MethodHandles.lookup().lookupClass()).a(190030711104420L) ^ 36631651060634L;
      long var24 = var22 ^ 34081230060072L;
      long var10001 = var22 ^ 114597912044362L;
      int var26 = (int)((var22 ^ 114597912044362L) >>> 48);
      int var27 = (int)(var10001 << 16 >>> 48);
      int var28 = (int)(var10001 << 32 >>> 32);
      Cipher var19;
      Cipher var10000 = var19 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var20 = 1; var20 < 8; ++var20) {
         var10003[var20] = (byte)((int)(var22 << var20 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var21 = var19.doFinal("\u008f~Ê\f\u00111\u0005Õ".getBytes("ISO-8859-1"));
      String var31 = a(var21).intern();
      boolean var29 = true;
      String var18 = var31;
      Cipher var8;
      var10000 = var8 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var9 = 1; var9 < 8; ++var9) {
         var10003[var9] = (byte)((int)(var22 << var9 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var7 = new long[2];
      int var11 = 0;
      String var12 = "\u001a¶Déî¶Åi\u0097óê©^f\u0097ä";
      int var13 = "\u001a¶Déî¶Åi\u0097óê©^f\u0097ä".length();
      int var10 = 0;

      do {
         int var30 = var10;
         var10 += 8;
         byte[] var14 = var12.substring(var30, var10).getBytes("ISO-8859-1");
         var30 = var11++;
         long var15 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
         byte[] var17 = var8.doFinal(new byte[]{(byte)((int)(var15 >>> 56)), (byte)((int)(var15 >>> 48)), (byte)((int)(var15 >>> 40)), (byte)((int)(var15 >>> 32)), (byte)((int)(var15 >>> 24)), (byte)((int)(var15 >>> 16)), (byte)((int)(var15 >>> 8)), (byte)((int)var15)});
         long var10004 = ((long)var17[0] & 255L) << 56 | ((long)var17[1] & 255L) << 48 | ((long)var17[2] & 255L) << 40 | ((long)var17[3] & 255L) << 32 | ((long)var17[4] & 255L) << 24 | ((long)var17[5] & 255L) << 16 | ((long)var17[6] & 255L) << 8 | (long)var17[7] & 255L;
         boolean var33 = true;
         var7[var30] = var10004;
      } while(var10 < var13);

      Cipher var2;
      var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var22 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 4203707537171831756L;
      byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
      long var32 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
      var29 = true;
      long var0 = var32;
      F = new ux();
      H = new fs(var18, var24, (int)var7[0], (int)var7[1]);
      e = new aa(sa.OUT_QUINT, var0, (short)var26, (short)var27, var28);
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
