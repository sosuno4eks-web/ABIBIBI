package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

public final class xi implements Comparator {
   private static final long a = j0.a(2153370339194859853L, 2209776698308319670L, MethodHandles.lookup().lookupClass()).a(281388878456478L);

   public final int compare(Object a, Object b) {
      long var3 = a ^ 53189620891179L;
      long var5 = var3 ^ 49667420020280L;
      6760943360315235213L.A<invokedynamic>(6760943360315235213L, var3);
      mo var8 = (mo)var1;
      boolean var9 = false;
      Comparable var10001 = (Comparable)s8.f(var5).method_5707(var8.W().method_46558());
      var8 = (mo)var2;
      Comparable var10 = var10001;
      var9 = false;

      try {
         int var10000 = ComparisonsKt.compareValues(var10, (Comparable)s8.f(var5).method_5707(var8.W().method_46558()));
         if (6765995407070222479L.A<invokedynamic>(6765995407070222479L, var3) == null) {
            (new String[5]).A<invokedynamic>(new String[5], 6717204520363496669L, var3);
         }

         return var10000;
      } catch (NumberFormatException var11) {
         throw var11.A<invokedynamic>(var11, 6720666333234678371L, var3);
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
