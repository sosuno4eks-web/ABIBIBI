package su.catlean;

// $FF: synthetic class
public final class ql {
   public static final int[] a;

   static {
      int[] var0 = new int[v6.values().length];

      try {
         var0[v6.DISABLED.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         var0[v6.ENABLED.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      a = var0;
   }
}
