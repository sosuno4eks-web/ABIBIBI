package su.catlean;

import java.lang.invoke.MethodHandles;

// $FF: synthetic class
public final class sx {
   public static final int[] P;
   private static int y;

   static {
      long var0 = j0.a(5524547192722206694L, 5717332869085337229L, MethodHandles.lookup().lookupClass()).a(119758827892435L) ^ 133619231865487L;
      int[] var2 = new int[ms.values().length];
      0.A<invokedynamic>(0, 2843213452075957404L, var0);

      try {
         var2[ms.FLAT.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         var2[ms.BOX.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      try {
         var2[ms.WIRE_FRAME.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var2[ms.CROSS.ordinal()] = 4;
      } catch (NoSuchFieldError var4) {
      }

      P = var2;
   }

   public static void V(int var0) {
      y = var0;
   }

   public static int V() {
      return y;
   }

   public static int h() {
      int var0 = V();

      try {
         return var0 == 0 ? 16 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
