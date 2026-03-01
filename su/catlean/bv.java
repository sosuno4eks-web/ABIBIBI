package su.catlean;

// $FF: synthetic class
public final class bv {
   public static final int[] g;

   static {
      int[] var0 = new int[xt.values().length];

      try {
         var0[xt.Block.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         var0[xt.Grow.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         var0[xt.Shrink.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      g = var0;
   }
}
