package su.catlean;

import java.lang.invoke.MethodHandles;

// $FF: synthetic class
public final class u6 {
   public static final int[] G;
   public static final int[] u;
   private static k9[] l;

   static {
      long var0 = j0.a(7966739859475310494L, 446992729846172457L, MethodHandles.lookup().lookupClass()).a(202992738813599L) ^ 129116740179963L;
      int[] var2 = new int[mv.values().length];
      null.A<invokedynamic>((Object)null, 5335987481472118726L, var0);

      try {
         var2[mv.OFF.ordinal()] = 1;
      } catch (NoSuchFieldError var11) {
      }

      try {
         var2[mv.CRYSTAL.ordinal()] = 2;
      } catch (NoSuchFieldError var10) {
      }

      try {
         var2[mv.GAPPLE.ordinal()] = 3;
      } catch (NoSuchFieldError var9) {
      }

      G = var2;
      var2 = new int[u0.values().length];

      try {
         var2[u0.BALL_SHIELD.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      try {
         var2[u0.GAPPLE_BALL.ordinal()] = 2;
      } catch (NoSuchFieldError var7) {
      }

      try {
         var2[u0.GAPPLE_SHIELD.ordinal()] = 3;
      } catch (NoSuchFieldError var6) {
      }

      try {
         var2[u0.BALL_TOTEM.ordinal()] = 4;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var2[u0.TOTEM_TOTEM.ordinal()] = 5;
      } catch (NoSuchFieldError var4) {
      }

      u = var2;
   }

   public static void C(k9[] var0) {
      l = var0;
   }

   public static k9[] h() {
      return l;
   }
}
