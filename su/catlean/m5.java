package su.catlean;

// $FF: synthetic class
public final class m5 {
   public static final int[] Q;
   public static final int[] C;

   static {
      int[] var0 = new int[mq.values().length];

      try {
         var0[mq.NCP.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         var0[mq.CUSTOM.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      Q = var0;
      var0 = new int[af.values().length];

      try {
         var0[af.OLD.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var0[af.NORMAL.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         var0[af.NEW.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }

      try {
         var0[af.STRICT.ordinal()] = 4;
      } catch (NoSuchFieldError var2) {
      }

      C = var0;
   }
}
