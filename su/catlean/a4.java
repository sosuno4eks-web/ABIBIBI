package su.catlean;

// $FF: synthetic class
public final class a4 {
   public static final int[] L;
   public static final int[] u;

   static {
      int[] var0 = new int[z4.values().length];

      try {
         var0[z4.SINE.ordinal()] = 1;
      } catch (NoSuchFieldError var11) {
      }

      try {
         var0[z4.ROAMING.ordinal()] = 2;
      } catch (NoSuchFieldError var10) {
      }

      try {
         var0[z4.DRUNK_SINE.ordinal()] = 3;
      } catch (NoSuchFieldError var9) {
      }

      try {
         var0[z4.RANDOM.ordinal()] = 4;
      } catch (NoSuchFieldError var8) {
      }

      try {
         var0[z4.NONE.ordinal()] = 5;
      } catch (NoSuchFieldError var7) {
      }

      L = var0;
      var0 = new int[b_.values().length];

      try {
         var0[b_.CENTER.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         var0[b_.EYES.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var0[b_.ROAMING.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         var0[b_.RUST.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }

      try {
         var0[b_.CLOSEST.ordinal()] = 5;
      } catch (NoSuchFieldError var2) {
      }

      u = var0;
   }
}
