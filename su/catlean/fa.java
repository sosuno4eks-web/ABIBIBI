package su.catlean;

import java.lang.invoke.MethodHandles;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

final class fa {
   private float S;
   private float P;
   private static final long a = j0.a(429876657815689137L, 9076638801551741859L, MethodHandles.lookup().lookupClass()).a(170150580179822L);

   public fa(float value, float velocity) {
      this.S = var1;
      this.P = var2;
   }

   public fa(long var1, float var3, float var4, int var5, DefaultConstructorMarker var6) {
      long var10000 = a ^ var1;
      if ((var5 & 1) != 0) {
         var3 = 0.0F;
      }

      if ((var5 & 2) != 0) {
         var4 = 0.0F;
      }

      this(var3, var4);
   }

   public final float z() {
      return this.S;
   }

   public final void O(float <set-?>) {
      this.S = var1;
   }

   public final float Q() {
      return this.P;
   }

   public final void m(float <set-?>) {
      this.P = var1;
   }

   public final float U(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 33086970291956L;
      long var10001 = var1 ^ 104331371848150L;
      int var5 = (int)((var1 ^ 104331371848150L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      this.P = gw.Y(-0.1F, (short)var5, 0.1F, false, (char)var6, 4, var7, (Object)null);
      this.S += this.P;
      this.S = c3.s.e(this.S, RangesKt.rangeTo(-1.0F, 1.0F), var3);
      return this.S;
   }

   public fa(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 87485856532826L;
      this(var3, 0.0F, 0.0F, 3, (DefaultConstructorMarker)null);
   }
}
