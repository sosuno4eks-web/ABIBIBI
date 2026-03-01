package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class kk extends kc {
   @NotNull
   public static final kk V;
   private static final long m = j0.a(800291054507451416L, 776255758032493117L, MethodHandles.lookup().lookupClass()).a(164528648021650L);
   private static final String y;
   private static final long B;

   private kk(long var1) {
      var1 ^= m;
      long var10001 = var1 ^ 10355711645940L;
      int var3 = (int)((var1 ^ 10355711645940L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      super((char)var3, y, var4, pa.Q(), var5);
   }

   @Flow
   private final void O(PlayerUpdateEvent var1) {
      long var2 = m ^ 123526541706140L;
      long var4 = var2 ^ 80951346369324L;
      long var6 = var2 ^ 34901781778833L;
      long var8 = var2 ^ 37993636854266L;
      this.W(var6, um.q(um.c, this.G(var8), rw.FOV, false, false, (int)B, (Object)null, var4));
   }

   static {
      long var8 = m ^ 103420165175372L;
      long var10 = var8 ^ 5473312858538L;
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var8 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var8 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var7 = var5.doFinal("\u0010nKìµH¬\u0096".getBytes("ISO-8859-1"));
      String var12 = d(var7).intern();
      boolean var10001 = true;
      y = var12;
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var8 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var8 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = 5560257436594363952L;
      byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
      long var13 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
      var10001 = true;
      B = var13;
      V = new kk(var10);
   }

   private static String d(byte[] var0) {
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
