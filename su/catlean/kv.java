package su.catlean;

// $FF: synthetic class
public final class kv {
   public static final int[] x;

   static {
      int[] var0 = new int[cd.values().length];

      try {
         var0[cd.STRICT_NCP.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         var0[cd.STRICT_NCP_2.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var0[cd.MATRIX_NCP.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         var0[cd.LEGIT.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }

      try {
         var0[cd.DISABLE_CLICKS.ordinal()] = 5;
      } catch (NoSuchFieldError var2) {
      }

      x = var0;
   }
}
