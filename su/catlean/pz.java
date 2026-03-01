package su.catlean;

import java.io.File;
import java.lang.invoke.MethodHandles;

public final class pz implements Runnable {
   final int s;
   private static final long a = j0.a(8141331249364975120L, 6807579968528323001L, MethodHandles.lookup().lookupClass()).a(233804694343877L);

   public pz(int $delay) {
      this.s = var1;
   }

   public final void run() {
      long var1 = a ^ 117232569514071L;
      long var3 = var1 ^ 80011947049456L;
      long var5 = var1 ^ 80011947049456L;
      long var7 = var1 ^ 128161874867956L;
      Thread.sleep((long)this.s);
      boolean var10 = false;
      c0.S.x(var7);
      File[] var11 = kf.R();
      boolean var12 = false;
      int var13 = 0;
      int var10000 = -9150319864330199799L.A<invokedynamic>(-9150319864330199799L, var1);
      int var14 = var11.length;
      int var9 = var10000;

      while(true) {
         if (var13 < var14) {
            File var15 = var11[var13];
            File var16 = var15;
            boolean var17 = false;

            try {
               var16.mkdirs();
               ++var13;
               if (var9 != 0) {
                  break;
               }

               if (var9 == 0) {
                  continue;
               }
            } catch (NumberFormatException var18) {
               throw var18.A<invokedynamic>(var18, -9128427087560779135L, var1);
            }
         }

         c0.S.H().N(var5);
         c0.S.A().N(var3);
         sh.P.J();
         break;
      }

   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
