package su.catlean;

import java.lang.invoke.MethodHandles;

// $FF: synthetic class
public final class cn {
   public static final int[] a;
   public static final int[] f;
   private static int R;

   static {
      long var0 = j0.a(2794587540947827298L, 2121438797747952449L, MethodHandles.lookup().lookupClass()).a(77727927158130L) ^ 65508408016112L;
      int[] var2 = new int[pp.values().length];
      74.A<invokedynamic>(74, -6035583992680999630L, var0);

      try {
         var2[pp.SEQUENTIAL.ordinal()] = 1;
      } catch (NoSuchFieldError var9) {
      }

      try {
         var2[pp.VANILLA.ordinal()] = 2;
      } catch (NoSuchFieldError var8) {
      }

      try {
         var2[pp.GRIM.ordinal()] = 3;
      } catch (NoSuchFieldError var7) {
      }

      a = var2;
      var2 = new int[c.values().length];

      try {
         var2[c.Inventory.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         var2[c.Normal.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var2[c.Silent.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      f = var2;
   }

   public static void t(int var0) {
      R = var0;
   }

   public static int R() {
      return R;
   }

   public static int k() {
      int var0 = R();

      try {
         return var0 == 0 ? 111 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
