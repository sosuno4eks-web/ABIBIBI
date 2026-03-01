package su.catlean;

import java.lang.invoke.MethodHandles;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.TickFactorEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class x2 implements zh {
   @NotNull
   public static final x2 E;
   private static float C;
   private static k9[] w;
   private static final long a = j0.a(7998657642879881849L, 6392913708877163249L, MethodHandles.lookup().lookupClass()).a(234895209956660L);

   private x2() {
   }

   public final float g() {
      return C;
   }

   public final void Q(float <set-?>) {
      C = var1;
   }

   public final void a(float t) {
      C = var1;
   }

   @Flow(
      priority = 20
   )
   private final void j(PlayerUpdateEvent var1) {
      this.a(1.0F);
   }

   @Flow
   private final void O(TickFactorEvent var1) {
      long var2 = a ^ 12787104923185L;
      k9[] var4 = -6161652582206288984L.A<invokedynamic>(-6161652582206288984L, var2);

      int var10000;
      label26: {
         label25: {
            try {
               float var6;
               var10000 = (var6 = C - 1.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
               if (var4 == null) {
                  break label26;
               }

               if (var10000 == 0) {
                  break label25;
               }
            } catch (NumberFormatException var5) {
               throw var5.A<invokedynamic>(var5, -6096694592567198145L, var2);
            }

            var10000 = 0;
            break label26;
         }

         var10000 = 1;
      }

      if (var10000 == 0) {
         var1.setFactor(C);
         var1.cancel();
      }
   }

   static {
      long var0 = a ^ 90937954079487L;
      k9[] var10000 = new k9[3];
      E = new x2();
      C = 1.0F;
      var10000.A<invokedynamic>(var10000, 556774230093513310L, var0);
   }

   public static void x(k9[] var0) {
      w = var0;
   }

   public static k9[] V() {
      return w;
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
