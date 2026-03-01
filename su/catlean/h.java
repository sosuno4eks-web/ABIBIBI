package su.catlean;

// $FF: synthetic class
public final class h {
   public static final int[] g;

   static {
      int[] var0 = new int[h3.values().length];

      try {
         var0[h3.MIRROR.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         var0[h3.DEFAULT.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var0[h3.BLOOM.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         var0[h3.DOUBLE.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }

      try {
         var0[h3.CAMOUFLAGE.ordinal()] = 5;
      } catch (NoSuchFieldError var2) {
      }

      g = var0;
   }
}
