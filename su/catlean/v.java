package su.catlean;

import java.lang.invoke.MethodHandles;

// $FF: synthetic class
public final class v {
   public static final int[] R;
   private static int f;

   static {
      long var0 = j0.a(7189272306574524979L, 5066388238570573402L, MethodHandles.lookup().lookupClass()).a(222418733073841L) ^ 17845296206943L;
      int[] var2 = new int[gv.values().length];
      0.A<invokedynamic>(0, 1065947701986188102L, var0);

      try {
         var2[gv.BREACH.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var2[gv.DENSITY.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      R = var2;
   }

   public static void W(int var0) {
      f = var0;
   }

   public static int D() {
      return f;
   }

   public static int K() {
      int var0 = D();

      try {
         return var0 == 0 ? 94 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
