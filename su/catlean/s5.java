package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;

final class s5 {
   private int s;
   private static final long a = j0.a(3821150623585890762L, 3921493525104528229L, MethodHandles.lookup().lookupClass()).a(101934982749304L);
   private static final long b;

   public s5(int age) {
      this.s = var1;
   }

   public s5(int var1, int var2, long var3, DefaultConstructorMarker var5) {
      long var10000 = a ^ var3;
      if ((var2 & 1) != 0) {
         var1 = (int)b;
      }

      this(var1);
   }

   public final int K() {
      return this.s;
   }

   public final void A(int <set-?>) {
      this.s = var1;
   }

   public s5(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 7489528593428L;
      this(0, 1, var3, (DefaultConstructorMarker)null);
   }

   static {
      long var0 = a ^ 32942905718208L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 7695423218159595944L;
      byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
      long var7 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
      boolean var10001 = true;
      b = var7;
   }
}
