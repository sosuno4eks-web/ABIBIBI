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

public final class mr implements class_4588 {
   @NotNull
   private final ib u;
   @NotNull
   private final ic V;
   @NotNull
   private final Color k;
   @NotNull
   private final float[] W;
   @NotNull
   private final float[] z;
   @NotNull
   private final float[] q;
   private int U;
   private static final long a = j0.a(424226076671123189L, 5971856816528407243L, MethodHandles.lookup().lookupClass()).a(119711757245431L);
   private static final String b;

   public mr(int a, @NotNull ib polygon, short a, @NotNull ic m, short a, @NotNull Color c) {
      long var7 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var2, b);
      Intrinsics.checkNotNullParameter(var4, "m");
      Intrinsics.checkNotNullParameter(var6, "c");
      super();
      this.u = var2;
      this.V = var4;
      this.k = var6;
      this.W = new float[4];
      this.z = new float[4];
      this.q = new float[4];
   }

   @NotNull
   public final ib l() {
      return this.u;
   }

   @NotNull
   public final ic N() {
      return this.V;
   }

   @NotNull
   public final Color z() {
      return this.k;
   }

   @NotNull
   public class_4588 method_22912(float x, float y, float z) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public mr j(int red, int green, int blue, int alpha) {
      return this;
   }

   @NotNull
   public mr y(int argb) {
      return this;
   }

   @NotNull
   public mr d(float u, float v) {
      return this;
   }

   @NotNull
   public mr v(int u, int v) {
      return this;
   }

   @NotNull
   public mr s(int u, int v) {
      return this;
   }

   @NotNull
   public mr S(float x, float y, float z) {
      return this;
   }

   @NotNull
   public mr L(float width) {
      return this;
   }

   public class_4588 method_1336(int i, int j, int k, int l) {
      return (class_4588)this.j(var1, var2, var3, var4);
   }

   public class_4588 method_39415(int i) {
      return (class_4588)this.y(var1);
   }

   public class_4588 method_22913(float f, float g) {
      return (class_4588)this.d(var1, var2);
   }

   public class_4588 method_60796(int i, int j) {
      return (class_4588)this.v(var1, var2);
   }

   public class_4588 method_22921(int i, int j) {
      return (class_4588)this.s(var1, var2);
   }

   public class_4588 method_22914(float f, float g, float h) {
      return (class_4588)this.S(var1, var2, var3);
   }

   public class_4588 method_75298(float f) {
      return (class_4588)this.L(var1);
   }

   static {
      long var0 = a ^ 138179346134146L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\\KX}@\u00ad\u0090j".getBytes("ISO-8859-1"));
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
