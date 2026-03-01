package su.catlean;

import java.lang.invoke.MethodHandles;

// $FF: synthetic class
public final class av {
   public static final int[] Y;
   private static int G;

   static {
      long var0 = j0.a(6409825276344124041L, 5879231978013409601L, MethodHandles.lookup().lookupClass()).a(145228134951268L) ^ 14499638272226L;
      int[] var2 = new int[bx.values().length];
      66.A<invokedynamic>(66, -4032699096886956622L, var0);

      try {
         var2[bx.NONE.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var2[bx.WHITE_LIST.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      Y = var2;
   }

   public static void x(int var0) {
      G = var0;
   }

   public static int U() {
      return G;
   }

   public static int v() {
      int var0 = U();

      try {
         return var0 == 0 ? 38 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
