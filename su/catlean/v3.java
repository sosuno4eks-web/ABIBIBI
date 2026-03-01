package su.catlean;

// $FF: synthetic class
public final class v3 {
   public static final int[] y;

   static {
      int[] var0 = new int[mx.values().length];

      try {
         var0[mx.Distance.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         var0[mx.FOV.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         var0[mx.Health.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      y = var0;
   }
}
