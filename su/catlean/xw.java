package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_2338;

public final class xw implements Comparator {
   private static final long a = j0.a(360025832819336416L, 7367586714107509459L, MethodHandles.lookup().lookupClass()).a(44818282962111L);

   public final int compare(Object a, Object b) {
      long var3 = a ^ 64355207005603L;
      long var5 = var3 ^ 92410032546026L;
      class_2338 var7 = (class_2338)var2;
      boolean var8 = false;
      Comparable var10000 = (Comparable)s8.f(var5).method_33571().method_1022(var7.method_46558());
      var7 = (class_2338)var1;
      Comparable var9 = var10000;
      var8 = false;
      return ComparisonsKt.compareValues(var9, (Comparable)s8.f(var5).method_33571().method_1022(var7.method_46558()));
   }
}
