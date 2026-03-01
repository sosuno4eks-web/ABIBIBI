package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class za {
   @NotNull
   private final String Y;
   @Nullable
   private Object Z;
   private static boolean V;
   private static final long a = j0.a(5355167969036144977L, 7169054988494261658L, MethodHandles.lookup().lookupClass()).a(129741562313253L);
   private static final String b;

   public za(long a, @NotNull String name) {
      var1 ^= a;
      boolean var10000 = -3731314514690702152L.A<invokedynamic>(-3731314514690702152L, var1);
      Intrinsics.checkNotNullParameter(var3, b);
      boolean var4 = var10000;
      super();
      this.Y = var3;
      if (!var4) {
         (new int[2]).A<invokedynamic>(new int[2], -3723686618791145495L, var1);
      }

   }

   @NotNull
   public final String K() {
      return this.Y;
   }

   @Nullable
   public final Object M() {
      return this.Z;
   }

   public final void B(@Nullable Object <set-?>) {
      this.Z = var1;
   }

   public static void g(boolean var0) {
      V = var0;
   }

   public static boolean U() {
      return V;
   }

   public static boolean a() {
      boolean var0 = U();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   static {
      long var3 = a ^ 132684644679615L;
      if (!-5014327480258628890L.A<invokedynamic>(-5014327480258628890L, var3)) {
         true.A<invokedynamic>(true, -4999221047495681195L, var3);
      }

      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var3 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var3 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var2 = var0.doFinal("\u0094\u001da:\u0080ò\u0010ÿ".getBytes("ISO-8859-1"));
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
