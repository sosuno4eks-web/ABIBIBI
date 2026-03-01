package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public abstract class a_ {
   @NotNull
   private final zf T;
   private float f;
   private float D;
   private float G;
   private float d;
   private static boolean u;
   private static final long b = j0.a(3515238246440725893L, 8995510002278126496L, MethodHandles.lookup().lookupClass()).a(58700946180249L);
   private static final String e;

   public a_(long a, @NotNull zf setting) {
      long var10000 = b ^ var1;
      Intrinsics.checkNotNullParameter(var3, e);
      super();
      this.T = var3;
      this.G = 116.0F;
      this.d = 13.0F;
   }

   @NotNull
   public zf t() {
      return this.T;
   }

   public final float i() {
      return this.f;
   }

   public final void T(float <set-?>) {
      this.f = var1;
   }

   public final float R() {
      return this.D;
   }

   public final void K(float <set-?>) {
      this.D = var1;
   }

   public final float L() {
      return this.G;
   }

   public final void u(float <set-?>) {
      this.G = var1;
   }

   public final float l() {
      return this.d;
   }

   public final void H(float <set-?>) {
      this.d = var1;
   }

   public abstract void v(@NotNull class_332 var1, long var2, char var4, int var5, int var6, float var7);

   public abstract void d(double var1, double var3, long var5, int var7);

   public abstract void x(double var1, double var3, int var5);

   public abstract void Z(long var1, int var3);

   public abstract void G(long var1, char var3);

   public abstract boolean i(int var1, int var2, int var3, double var4, double var6, double var8);

   public abstract void e();

   public static void J(boolean var0) {
      u = var0;
   }

   public static boolean K() {
      return u;
   }

   public static boolean M() {
      boolean var0 = K();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw b(var1);
      }
   }

   static {
      long var3 = b ^ 128481567774076L;
      if (!-2430386706415939518L.A<invokedynamic>(-2430386706415939518L, var3)) {
         true.A<invokedynamic>(true, -2420603829974308860L, var3);
      }

      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var3 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var3 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var2 = var0.doFinal("\u001e\u0004\u0086ÃæÏ-\u001f".getBytes("ISO-8859-1"));
      String var5 = a(var2).intern();
      boolean var10001 = true;
      e = var5;
   }

   private static NumberFormatException b(NumberFormatException var0) {
      return var0;
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
