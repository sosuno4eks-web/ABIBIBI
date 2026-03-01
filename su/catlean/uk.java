package su.catlean;

// $FF: synthetic class
public final class uk {
   public static final int[] R;
   public static final int[] c;
   public static final int[] J;

   static {
      int[] var0 = new int[gr.values().length];

      try {
         var0[gr.COMETS.ordinal()] = 1;
      } catch (NoSuchFieldError var9) {
      }

      try {
         var0[gr.SELECTION.ordinal()] = 2;
      } catch (NoSuchFieldError var8) {
      }

      R = var0;
      var0 = new int[n9.values().length];

      try {
         var0[n9.INVENTORY.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         var0[n9.SILENT.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      try {
         var0[n9.NORMAL.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
      }

      c = var0;
      var0 = new int[ui.values().length];

      try {
         var0[ui.AUTO.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         var0[ui.CUSTOM.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         var0[ui.OFF.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      J = var0;
   }
}
