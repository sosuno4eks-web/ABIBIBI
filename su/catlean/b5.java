package su.catlean;

// $FF: synthetic class
public final class b5 {
   public static final int[] R;

   static {
      int[] var0 = new int[b2.values().length];

      try {
         var0[b2.DEFAULT.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         var0[b2.VULCAN.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      R = var0;
   }
}
