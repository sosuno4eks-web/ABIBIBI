package su.catlean;

import java.lang.invoke.MethodHandles;

public final class _n implements Runnable {
   final int c;
   private static boolean J;
   private static final long a = j0.a(4938901638994008550L, 4604968903032278862L, MethodHandles.lookup().lookupClass()).a(77539338752423L);

   public _n(int $delay) {
      this.c = var1;
   }

   public final void run() {
      long var1 = a ^ 19806224871100L;
      long var10001 = var1 ^ 49915500739676L;
      int var3 = (int)((var1 ^ 49915500739676L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      Thread.sleep((long)this.c);
      boolean var10000 = -3487147961579012178L.A<invokedynamic>(-3487147961579012178L, var1);
      boolean var7 = false;
      boolean var6 = var10000;

      try {
         s8.H((short)var3, (short)var4, var5).method_40000((Runnable)bn.E);
         if (!var6) {
            (new int[1]).A<invokedynamic>(new int[1], -3482983053202289646L, var1);
         }

      } catch (NumberFormatException var8) {
         throw var8.A<invokedynamic>(var8, -3570990295595658374L, var1);
      }
   }

   public static void S(boolean var0) {
      J = var0;
   }

   public static boolean M() {
      return J;
   }

   public static boolean C() {
      boolean var0 = M();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   static {
      long var0 = a ^ 131481835035234L;
      if (-381602811484847878L.A<invokedynamic>(-381602811484847878L, var0)) {
         true.A<invokedynamic>(true, -302224437703196331L, var0);
      }

   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
