package su.catlean;

import java.lang.invoke.MethodHandles;

public final class un extends Thread {
   private static int[] n;
   private static final long a = j0.a(749176224890999606L, 874010049128652547L, MethodHandles.lookup().lookupClass()).a(8516960877847L);

   public void run() {
      long var1 = a ^ 14347548856217L;
      long var3 = var1 ^ 56649505736634L;
      long var5 = var1 ^ 105183228284138L;
      c0.S.x(var5);
      int[] var10000 = -4970795591448417880L.A<invokedynamic>(-4970795591448417880L, var1);
      co.P.k(var3);
      int[] var7 = var10000;

      try {
         super.run();
         if (var7 == null) {
            (new int[3]).A<invokedynamic>(new int[3], -4900613564125317050L, var1);
         }

      } catch (NumberFormatException var8) {
         throw var8.A<invokedynamic>(var8, -4908422370389036646L, var1);
      }
   }

   public static void k(int[] var0) {
      n = var0;
   }

   public static int[] c() {
      return n;
   }

   static {
      long var0 = a ^ 105533421134496L;
      if (1602574795406967953L.A<invokedynamic>(1602574795406967953L, var0) == null) {
         (new int[3]).A<invokedynamic>(new int[3], 1645053397103835629L, var0);
      }

   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
