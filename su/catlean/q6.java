package su.catlean;

import java.lang.invoke.MethodHandles;

// $FF: synthetic class
public final class q6 {
   public static final int[] A;
   private static String[] x;

   static {
      long var0 = j0.a(7300676283971769053L, 8698242277955954132L, MethodHandles.lookup().lookupClass()).a(255626576702630L) ^ 21189627195312L;
      String[] var10000 = new String[1];
      int[] var2 = new int[i2.values().length];
      var10000.A<invokedynamic>(var10000, 2773357500781783608L, var0);

      try {
         var2[i2.DEFAULT.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      try {
         var2[i2.GROW.ordinal()] = 2;
      } catch (NoSuchFieldError var7) {
      }

      try {
         var2[i2.SHRINK.ordinal()] = 3;
      } catch (NoSuchFieldError var6) {
      }

      try {
         var2[i2.FILL.ordinal()] = 4;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var2[i2.EMPTY.ordinal()] = 5;
      } catch (NoSuchFieldError var4) {
      }

      A = var2;
   }

   public static void D(String[] var0) {
      x = var0;
   }

   public static String[] m() {
      return x;
   }
}
