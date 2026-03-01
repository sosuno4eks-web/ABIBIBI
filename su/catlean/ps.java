package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ps {
   private final int R;
   private final int W;
   private final int U;
   private final int K;
   private final char F;
   @NotNull
   private final a P;
   private static final long a = j0.a(7226434392403877489L, 4980865751424312241L, MethodHandles.lookup().lookupClass()).a(114338657215532L);
   private static final String b;

   public ps(int u, long a, int v, int width, int height, char value, @NotNull a owner) {
      long var10000 = a ^ var2;
      Intrinsics.checkNotNullParameter(var8, b);
      super();
      this.R = var1;
      this.W = var4;
      this.U = var5;
      this.K = var6;
      this.F = var7;
      this.P = var8;
   }

   public final int I() {
      return this.R;
   }

   public final int e() {
      return this.W;
   }

   public final int K() {
      return this.U;
   }

   public final int X() {
      return this.K;
   }

   public final char E() {
      return this.F;
   }

   @NotNull
   public final a S() {
      return this.P;
   }

   static {
      long var0 = a ^ 35121095036063L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u008d©¾Íå5ò\u0000".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      boolean var10001 = true;
      b = var5;
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
