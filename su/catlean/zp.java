package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;

final class zp {
   @NotNull
   private final class_2338 p;
   private float w;
   private float I;
   private static final long a = j0.a(9068765998346740268L, 5449084275279480559L, MethodHandles.lookup().lookupClass()).a(117423255724906L);
   private static final String b;

   public zp(@NotNull class_2338 pos, float progress, long a, float prevProgress) {
      long var10000 = a ^ var3;
      Intrinsics.checkNotNullParameter(var1, b);
      super();
      this.p = var1;
      this.w = var2;
      this.I = var5;
   }

   public zp(long var1, class_2338 var3, float var4, float var5, int var6, DefaultConstructorMarker var7) {
      var1 ^= a;
      long var8 = var1 ^ 28935514408082L;
      if ((var6 & 2) != 0) {
         var4 = 0.0F;
      }

      if ((var6 & 4) != 0) {
         var5 = 0.0F;
      }

      this(var3, var4, var8, var5);
   }

   @NotNull
   public final class_2338 f() {
      return this.p;
   }

   public final float q() {
      return this.w;
   }

   public final void a(float <set-?>) {
      this.w = var1;
   }

   public final float b() {
      return this.I;
   }

   public final void T(float <set-?>) {
      this.I = var1;
   }

   public final boolean w(long param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = a ^ 140578246686331L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("F\u0082»\u0094\u0085\u0085²³".getBytes("ISO-8859-1"));
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
