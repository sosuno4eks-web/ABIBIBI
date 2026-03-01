package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class aa {
   @NotNull
   private final sa s;
   private final long j;
   private float R;
   private long r;
   private float L;
   private float g;
   private boolean c;
   private static boolean I;
   private static final long a = j0.a(3605371781118494274L, 6823958688650636620L, MethodHandles.lookup().lookupClass()).a(223287722010100L);
   private static final String b;

   public aa(@NotNull sa easing, long ms, short a, short a, int a) {
      long var7 = ((long)var4 << 48 | (long)var5 << 48 >>> 16 | (long)var6 << 32 >>> 32) ^ a;
      Intrinsics.checkNotNullParameter(var1, b);
      super();
      this.s = var1;
      this.j = var2;
      this.r = s8.Z();
   }

   public final float a() {
      return this.R;
   }

   public final void V(float <set-?>) {
      this.R = var1;
   }

   public final boolean X() {
      return this.c;
   }

   public final void j(boolean <set-?>) {
      this.c = var1;
   }

   public final void j(float to, long a) {
      // $FF: Couldn't be decompiled
   }

   public final void T(float value) {
      this.r = s8.Z();
      this.L = var1;
      this.c = false;
   }

   public final void s() {
      this.T(this.R);
   }

   public static void b(boolean var0) {
      I = var0;
   }

   public static boolean W() {
      return I;
   }

   public static boolean R() {
      boolean var0 = W();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   static {
      long var3 = a ^ 6827946560144L;
      if (!4274549392147424847L.A<invokedynamic>(4274549392147424847L, var3)) {
         true.A<invokedynamic>(true, 4241318945941595451L, var3);
      }

      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var3 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var3 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var2 = var0.doFinal("ýR2òÔâÜ\u0006".getBytes("ISO-8859-1"));
      String var5 = a(var2).intern();
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
