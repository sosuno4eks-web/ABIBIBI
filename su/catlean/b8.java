package su.catlean;

// $FF: synthetic class
public final class b8 {
   public static final int[] K;

   static {
      int[] var0 = new int[is.values().length];

      try {
         var0[is.VANILLA.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         var0[is.SEQUENTIAL.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         var0[is.GRIM.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      K = var0;
   }
}
