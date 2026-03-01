package su.catlean;

import net.minecraft.class_1934;

// $FF: synthetic class
public final class f2 {
   public static final int[] u;
   public static final int[] w;
   public static final int[] E;

   static {
      int[] var0 = new int[c8.values().length];

      try {
         var0[c8.FULL.ordinal()] = 1;
      } catch (NoSuchFieldError var10) {
      }

      try {
         var0[c8.SEMI.ordinal()] = 2;
      } catch (NoSuchFieldError var9) {
      }

      try {
         var0[c8.DEFAULT.ordinal()] = 3;
      } catch (NoSuchFieldError var8) {
      }

      u = var0;
      var0 = new int[class_1934.values().length];

      try {
         var0[class_1934.field_9215.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         var0[class_1934.field_9220.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      try {
         var0[class_1934.field_9219.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var0[class_1934.field_9216.ordinal()] = 4;
      } catch (NoSuchFieldError var4) {
      }

      w = var0;
      var0 = new int[r_.values().length];

      try {
         var0[r_.ScoreBoard.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         var0[r_.PlayerList.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      E = var0;
   }
}
