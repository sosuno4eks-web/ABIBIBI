package su.catlean;

// $FF: synthetic class
public final class e7 {
   public static final int[] I;

   static {
      int[] var0 = new int[x8.values().length];

      try {
         var0[x8.MATRIX.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         var0[x8.DEFAULT.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var0[x8.WATER_BUCKET.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         var0[x8.MATRIX_2.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }

      try {
         var0[x8.FT_FENCE.ordinal()] = 5;
      } catch (NoSuchFieldError var2) {
      }

      I = var0;
   }
}
