package su.catlean;

// $FF: synthetic class
public final class rn {
   public static final int[] s;

   static {
      int[] var0 = new int[nq.values().length];

      try {
         var0[nq.SERVER.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         var0[nq.CLIENT.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         var0[nq.PREDICT.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      s = var0;
   }
}
