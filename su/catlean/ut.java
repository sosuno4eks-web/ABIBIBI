package su.catlean;

import java.lang.invoke.MethodHandles;

// $FF: synthetic class
public final class ut {
   public static final int[] b;
   private static int[] x;

   static {
      long var0 = j0.a(1412826024889487775L, 2382900273965469498L, MethodHandles.lookup().lookupClass()).a(234488861097712L) ^ 89443202557387L;
      int[] var10000 = new int[3];
      int[] var2 = new int[up.values().length];
      var10000.A<invokedynamic>(var10000, -270030946796703232L, var0);

      try {
         var2[up.GLOBAL.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         var2[up.LOCAL.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      try {
         var2[up.WHISPERS.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var2[up.SILENT.ordinal()] = 4;
      } catch (NoSuchFieldError var4) {
      }

      b = var2;
   }

   public static void z(int[] var0) {
      x = var0;
   }

   public static int[] w() {
      return x;
   }
}
