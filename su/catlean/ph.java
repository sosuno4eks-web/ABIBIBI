package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

public final class ph implements Comparator {
   private static final long a = j0.a(6828355320232571784L, 2555990243528759003L, MethodHandles.lookup().lookupClass()).a(275005749673848L);

   public final int compare(Object a, Object b) {
      long var3 = a ^ 22769237805357L;
      long var5 = var3 ^ 232425852419L;
      long var7 = var3 ^ 129843270800226L;
      cf var10 = (cf)var2;
      boolean var11 = false;
      945773331914692454L.A<invokedynamic>(945773331914692454L, var3);
      Comparable var10001 = (Comparable)s8.f(var5).method_5707(var10.G(var7));
      var10 = (cf)var1;
      Comparable var12 = var10001;
      var11 = false;

      try {
         int var10000 = ComparisonsKt.compareValues(var12, (Comparable)s8.f(var5).method_5707(var10.G(var7)));
         if (999387777841498292L.A<invokedynamic>(999387777841498292L, var3) == null) {
            "DPHU6b".A<invokedynamic>("DPHU6b", 965448103483702429L, var3);
         }

         return var10000;
      } catch (NumberFormatException var13) {
         throw var13.A<invokedynamic>(var13, 989070326523021865L, var3);
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
