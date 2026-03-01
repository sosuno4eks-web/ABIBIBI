package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4588;
import org.jetbrains.annotations.NotNull;

public final class qv implements class_4588 {
   @NotNull
   private final ib v;
   @NotNull
   private final Color A;
   @NotNull
   private final float[] V;
   @NotNull
   private final float[] l;
   @NotNull
   private final float[] L;
   @NotNull
   private final float[] O;
   @NotNull
   private final float[] R;
   private int U;
   private static final long a = j0.a(3543064719020634682L, 5139173970521281839L, MethodHandles.lookup().lookupClass()).a(95976266575695L);
   private static final String b;

   public qv(long a, short a, @NotNull ib polygon, @NotNull Color c) {
      long var6 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var4, b);
      Intrinsics.checkNotNullParameter(var5, "c");
      super();
      this.v = var4;
      this.A = var5;
      this.V = new float[4];
      this.l = new float[4];
      this.L = new float[4];
      this.O = new float[4];
      this.R = new float[4];
   }

   @NotNull
   public final ib E() {
      return this.v;
   }

   @NotNull
   public final Color A() {
      return this.A;
   }

   @NotNull
   public class_4588 method_22912(float x, float y, float z) {
      this.V[this.U] = var1;
      this.l[this.U] = var2;
      this.L[this.U] = var3;
      return (class_4588)this;
   }

   @NotNull
   public qv q(int red, int green, int blue, int alpha) {
      return this;
   }

   @NotNull
   public qv Q(int argb) {
      return this;
   }

   @NotNull
   public class_4588 method_22913(float u, float v) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public qv H(int u, int v) {
      return this;
   }

   @NotNull
   public qv V(int u, int v) {
      return this;
   }

   @NotNull
   public qv Q(float x, float y, float z) {
      return this;
   }

   @NotNull
   public qv S(float width) {
      return this;
   }

   public class_4588 method_1336(int i, int j, int k, int l) {
      return (class_4588)this.q(var1, var2, var3, var4);
   }

   public class_4588 method_39415(int i) {
      return (class_4588)this.Q(var1);
   }

   public class_4588 method_60796(int i, int j) {
      return (class_4588)this.H(var1, var2);
   }

   public class_4588 method_22921(int i, int j) {
      return (class_4588)this.V(var1, var2);
   }

   public class_4588 method_22914(float f, float g, float h) {
      return (class_4588)this.Q(var1, var2, var3);
   }

   public class_4588 method_75298(float f) {
      return (class_4588)this.S(var1);
   }

   static {
      long var0 = a ^ 46448714481534L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("P÷\u0084kgAë:".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      boolean var10001 = true;
      b = var5;
   }

   private static NumberFormatException a(NumberFormatException var0) {
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
