package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.class_1297;
import org.jetbrains.annotations.NotNull;

final class m2 {
   @NotNull
   private final class_1297 T;
   private final float y;
   private final double D;
   private final double m;
   private final double K;
   private int b;
   private static final long a = j0.a(1152286790050992047L, 8791464011594756683L, MethodHandles.lookup().lookupClass()).a(110694992355561L);
   private static final String c;
   private static final long d;

   public m2(long a, @NotNull class_1297 entity, float hp, double posX, double posY, double posZ, int ticks) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, c);
      String var10000 = -8015441022235198830L.A<invokedynamic>(-8015441022235198830L, var1);
      super();
      String var12 = var10000;

      try {
         this.T = var3;
         this.y = var4;
         this.D = var5;
         this.m = var7;
         this.K = var9;
         this.b = var11;
         if (var12 != null) {
            (new int[5]).A<invokedynamic>(new int[5], -8054734055613312116L, var1);
         }

      } catch (NumberFormatException var13) {
         throw var13.A<invokedynamic>(var13, -8008138679466608497L, var1);
      }
   }

   public m2(class_1297 var1, float var2, double var3, double var5, double var7, int var9, long var10, int var12, DefaultConstructorMarker var13) {
      var10 ^= a;
      long var14 = var10 ^ 111342804517094L;
      if ((var12 & (int)d) != 0) {
         var9 = 0;
      }

      this(var14, var1, var2, var3, var5, var7, var9);
   }

   @NotNull
   public final class_1297 Q() {
      return this.T;
   }

   public final float J() {
      return this.y;
   }

   public final double w() {
      return this.D;
   }

   public final double Z() {
      return this.m;
   }

   public final double C() {
      return this.K;
   }

   public final int I() {
      return this.b;
   }

   public final void T(int <set-?>) {
      this.b = var1;
   }

   public final float c(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 65796246803133L;
      String var5 = 3435765649315333631L.A<invokedynamic>(3435765649315333631L, var1);

      try {
         float var10000 = gk.E.j(var3, RangesKt.coerceAtLeast((float)this.b - 1.0F, 0.0F), (float)this.b);
         if (3432166290029292235L.A<invokedynamic>(3432166290029292235L, var1) == null) {
            "lli03b".A<invokedynamic>("lli03b", 3409605362936100895L, var1);
         }

         return var10000;
      } catch (NumberFormatException var6) {
         throw var6.A<invokedynamic>(var6, 3436321491974490082L, var1);
      }
   }

   static {
      long var5 = a ^ 61637041312875L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var9 = var7.doFinal(":\u008e\u0090\u001eÚ¨]ü".getBytes("ISO-8859-1"));
      String var10 = a(var9).intern();
      boolean var10001 = true;
      c = var10;
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = 2381460537807009028L;
      byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
      long var11 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
      var10001 = true;
      d = var11;
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
