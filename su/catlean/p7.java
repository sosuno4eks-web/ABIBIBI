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

public final class p7 implements class_4588 {
   @NotNull
   private final ib o;
   @NotNull
   private final Color V;
   private static final long a = j0.a(6998356961038582965L, 8745813335500554890L, MethodHandles.lookup().lookupClass()).a(218324983706900L);
   private static final String b;

   public p7(@NotNull ib polygon, long a, @NotNull Color c) {
      var2 ^= a;
      String[] var10000 = 3329601195698431884L.A<invokedynamic>(3329601195698431884L, var2);
      Intrinsics.checkNotNullParameter(var1, b);
      String[] var5 = var10000;
      Intrinsics.checkNotNullParameter(var4, "c");
      super();
      this.o = var1;
      this.V = var4;
      if (var5 != null) {
         (new int[3]).A<invokedynamic>(new int[3], 3357110688566013229L, var2);
      }

   }

   @NotNull
   public final ib v() {
      return this.o;
   }

   @NotNull
   public final Color m() {
      return this.V;
   }

   @NotNull
   public class_4588 method_22912(float x, float y, float z) {
      long var4 = a ^ 120637098646147L;
      long var6 = var4 ^ 66133425496651L;
      this.o.s(var1, var6, var2, var3);
      return (class_4588)this;
   }

   @NotNull
   public p7 p(int red, int green, int blue, int alpha) {
      return this;
   }

   @NotNull
   public class_4588 method_39415(int argb) {
      return (class_4588)this;
   }

   @NotNull
   public class_4588 method_22913(float u, float v) {
      long var3 = a ^ 136904608659409L;
      long var5 = var3 ^ 104071398547458L;
      long var10001 = var3 ^ 109301096850855L;
      int var7 = (int)((var3 ^ 109301096850855L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      539389768534724293L.A<invokedynamic>(539389768534724293L, var3);
      this.o.k(var7, var1, var2, (short)var8, (char)var9).N(this.V, var5);

      try {
         class_4588 var10000 = (class_4588)this;
         if (514812897056784974L.A<invokedynamic>(514812897056784974L, var3) == null) {
            (new String[1]).A<invokedynamic>(new String[1], 555410703833429672L, var3);
         }

         return var10000;
      } catch (NumberFormatException var11) {
         throw var11.A<invokedynamic>(var11, 515322323778703743L, var3);
      }
   }

   @NotNull
   public p7 a(int u, int v) {
      return this;
   }

   @NotNull
   public p7 h(int u, int v) {
      return this;
   }

   @NotNull
   public p7 H(float x, float y, float z) {
      return this;
   }

   @NotNull
   public p7 z(float width) {
      return this;
   }

   public class_4588 method_1336(int i, int j, int k, int l) {
      return (class_4588)this.p(var1, var2, var3, var4);
   }

   public class_4588 method_60796(int i, int j) {
      return (class_4588)this.a(var1, var2);
   }

   public class_4588 method_22921(int i, int j) {
      return (class_4588)this.h(var1, var2);
   }

   public class_4588 method_22914(float f, float g, float h) {
      return (class_4588)this.H(var1, var2, var3);
   }

   public class_4588 method_75298(float f) {
      return (class_4588)this.z(var1);
   }

   static {
      long var0 = a ^ 131538050506912L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ÅÑ\u0088mñ$¼\u001b".getBytes("ISO-8859-1"));
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
