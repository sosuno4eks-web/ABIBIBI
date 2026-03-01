package su.catlean;

import java.lang.invoke.MethodHandles;

// $FF: synthetic class
public final class fl {
   public static final int[] y;
   private static int[] v;

   static {
      long var0 = j0.a(3589242374257113013L, 1529917099467453600L, MethodHandles.lookup().lookupClass()).a(147854776948141L) ^ 66727108428721L;
      int[] var2 = new int[gu.values().length];
      null.A<invokedynamic>((Object)null, -2926257618270201399L, var0);

      try {
         var2[gu.Vanilla.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var2[gu.GRIM_GLIDE.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      y = var2;
   }

   public static void y(int[] var0) {
      v = var0;
   }

   public static int[] u() {
      return v;
   }
}
