package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_1297;
import net.minecraft.class_742;

public final class uh implements Comparator {
   private static final long a = j0.a(8600851348069506845L, 6942683434878431557L, MethodHandles.lookup().lookupClass()).a(163242468662483L);

   public final int compare(Object a, Object b) {
      long var3 = a ^ 13200836531957L;
      long var5 = var3 ^ 47418147806686L;
      class_742 var7 = (class_742)var1;
      boolean var8 = false;
      Comparable var10000 = (Comparable)s8.f(var5).method_5739((class_1297)var7);
      var7 = (class_742)var2;
      Comparable var9 = var10000;
      var8 = false;
      return ComparisonsKt.compareValues(var9, (Comparable)s8.f(var5).method_5739((class_1297)var7));
   }
}
