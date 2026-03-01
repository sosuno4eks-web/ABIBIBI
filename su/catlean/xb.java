package su.catlean;

// $FF: synthetic class
public final class xb {
   public static final int[] s;

   static {
      int[] var0 = new int[rw.values().length];

      try {
         var0[rw.FOV.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         var0[rw.HEALTH.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         var0[rw.DISTANCE.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      s = var0;
   }
}
