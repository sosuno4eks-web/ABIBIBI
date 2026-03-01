package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;

public final class p1 {
   private final float m;
   private final float k;
   private final float U;
   private final float a;
   private final float E;
   private final float A;
   private final int K;
   private final int e;
   private final int n;
   private final int x;
   private final int X;
   private final int S;
   private final float L;
   @NotNull
   private final Matrix3x2f r;
   private static final long b = j0.a(8589984820375964657L, 8091694933702518082L, MethodHandles.lookup().lookupClass()).a(51999351004694L);
   private static final String c;

   public p1(short a, float atX, float atY, long a, float r, float g, float b, float a, int w, int h, int ow, int oh, int u, int v, float z, @NotNull Matrix3x2f matrix) {
      long var18 = ((long)var1 << 48 | var4 << 16 >>> 16) ^ b;
      Intrinsics.checkNotNullParameter(var17, c);
      super();
      this.m = var2;
      this.k = var3;
      this.U = var6;
      this.a = var7;
      this.E = var8;
      this.A = var9;
      this.K = var10;
      this.e = var11;
      this.n = var12;
      this.x = var13;
      this.X = var14;
      this.S = var15;
      this.L = var16;
      this.r = var17;
   }

   public final float a() {
      return this.m;
   }

   public final float Q() {
      return this.k;
   }

   public final float k() {
      return this.U;
   }

   public final float A() {
      return this.a;
   }

   public final float M() {
      return this.E;
   }

   public final float q() {
      return this.A;
   }

   public final int e() {
      return this.K;
   }

   public final int Y() {
      return this.e;
   }

   public final int l() {
      return this.n;
   }

   public final int g() {
      return this.x;
   }

   public final int S() {
      return this.X;
   }

   public final int i() {
      return this.S;
   }

   public final float P() {
      return this.L;
   }

   @NotNull
   public final Matrix3x2f s() {
      return this.r;
   }

   static {
      long var0 = b ^ 49313685836475L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\t\u000bõÇÿ\u009az\u0016".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      boolean var10001 = true;
      c = var5;
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
