package su.catlean;

import java.lang.invoke.MethodHandles;

// $FF: synthetic class
public final class qg {
   public static final int[] J;
   private static int[] g;

   static {
      long var0 = j0.a(8458709442777439109L, 522020505915893852L, MethodHandles.lookup().lookupClass()).a(279244087677190L) ^ 114545184674204L;
      int[] var10000 = new int[4];
      int[] var2 = new int[ix.values().length];
      var10000.A<invokedynamic>(var10000, -5512485512301034749L, var0);

      try {
         var2[ix.GLOBAL.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         var2[ix.LOCAL.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var2[ix.WHISPERS.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      J = var2;
   }

   public static void R(int[] var0) {
      g = var0;
   }

   public static int[] g() {
      return g;
   }
}
