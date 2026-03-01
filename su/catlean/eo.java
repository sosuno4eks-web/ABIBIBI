package su.catlean;

// $FF: synthetic class
public final class eo {
   public static final int[] p;

   static {
      int[] var0 = new int[s3.values().length];

      try {
         var0[s3.CUSTOM.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         var0[s3.SYNC.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var0[s3.SKY.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         var0[s3.LIGHT_RGB.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }

      try {
         var0[s3.RGB.ordinal()] = 5;
      } catch (NoSuchFieldError var2) {
      }

      p = var0;
   }
}
