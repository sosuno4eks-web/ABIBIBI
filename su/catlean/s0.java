package su.catlean;

import java.lang.invoke.MethodHandles;

// $FF: synthetic class
public final class s0 {
   public static final int[] f;
   private static boolean U;

   static {
      long var0 = j0.a(8318039993117646324L, 1836088483156092323L, MethodHandles.lookup().lookupClass()).a(111496489537161L) ^ 36890558510694L;
      int[] var2 = new int[b.values().length];
      true.A<invokedynamic>(true, 8391948381294044863L, var0);

      try {
         var2[b.SMART.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         var2[b.CUSTOM.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var2[b.OFF.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      f = var2;
   }

   public static void l(boolean var0) {
      U = var0;
   }

   public static boolean x() {
      return U;
   }

   public static boolean D() {
      boolean var0 = x();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
