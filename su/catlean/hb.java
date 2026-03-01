package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_3965;

public final class hb implements Comparator {
   private static final long a = j0.a(4367394223288713996L, 3162200587881079708L, MethodHandles.lookup().lookupClass()).a(39454918608741L);

   public final int compare(Object a, Object b) {
      long var3 = a ^ 32112315964080L;
      long var5 = var3 ^ 65778542996230L;
      7534389885224091111L.A<invokedynamic>(7534389885224091111L, var3);
      class_3965 var8 = (class_3965)var1;
      boolean var9 = false;
      Comparable var10000 = (Comparable)s8.f(var5).method_33571().method_1025(var8.method_17784());
      var8 = (class_3965)var2;
      Comparable var10 = var10000;
      var9 = false;

      try {
         int var12 = ComparisonsKt.compareValues(var10, (Comparable)s8.f(var5).method_33571().method_1025(var8.method_17784()));
         if (7555828542106594737L.A<invokedynamic>(7555828542106594737L, var3) == null) {
            "VwGj9".A<invokedynamic>("VwGj9", 7552375224899611263L, var3);
         }

         return var12;
      } catch (NumberFormatException var11) {
         throw var11.A<invokedynamic>(var11, 7501077308178392137L, var3);
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
