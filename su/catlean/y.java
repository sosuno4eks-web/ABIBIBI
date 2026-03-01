package su.catlean;

import java.lang.invoke.MethodHandles;

// $FF: synthetic class
public final class y {
   public static final int[] R;
   private static String b;

   static {
      long var0 = j0.a(2631764205036119900L, 3203756749741640638L, MethodHandles.lookup().lookupClass()).a(53703713589665L) ^ 10246651584603L;
      int[] var2 = new int[pe.values().length];
      null.A<invokedynamic>((Object)null, 2385326696366048070L, var0);

      try {
         var2[pe.GHOST.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var2[pe.DEFAULT.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      R = var2;
   }

   public static void g(String var0) {
      b = var0;
   }

   public static String x() {
      return b;
   }
}
