package su.catlean;

import java.lang.invoke.MethodHandles;

// $FF: synthetic class
public final class rz {
   public static final int[] V;
   private static k9[] k;

   static {
      long var0 = j0.a(8812894176523784888L, 7614420131169434427L, MethodHandles.lookup().lookupClass()).a(63661356186471L) ^ 90660957917308L;
      int[] var2 = new int[gb.values().length];
      null.A<invokedynamic>((Object)null, -8686846884494194191L, var0);

      try {
         var2[gb.Command.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         var2[gb.Leave.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var2[gb.None.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      V = var2;
   }

   public static void H(k9[] var0) {
      k = var0;
   }

   public static k9[] P() {
      return k;
   }
}
