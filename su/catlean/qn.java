package su.catlean;

// $FF: synthetic class
public final class qn {
   public static final int[] W;
   public static final int[] z;

   static {
      int[] var0 = new int[kh.values().length];

      try {
         var0[kh.BOX.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var0[kh.OUTLINE.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      W = var0;
      var0 = new int[eh.values().length];

      try {
         var0[eh.NONE.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         var0[eh.WHITE_LIST.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      z = var0;
   }
}
