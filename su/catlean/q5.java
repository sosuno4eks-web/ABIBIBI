package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_2338;

public final class q5 implements Comparator {
   final double[] I;
   private static final long a = j0.a(1415075926647649047L, 7653700884184586992L, MethodHandles.lookup().lookupClass()).a(173424868331988L);

   public q5(double[] var1) {
      this.I = var1;
   }

   public final int compare(Object a, Object b) {
      long var3 = a ^ 73445306272910L;
      long var5 = var3 ^ 2851015885844L;
      class_2338 var7 = (class_2338)var1;
      boolean var8 = false;
      Comparable var10000 = (Comparable)var7.method_46558().method_1028(s8.f(var5).method_23317() + this.I[0], s8.f(var5).method_23318(), s8.f(var5).method_23321() + this.I[1]);
      var7 = (class_2338)var2;
      Comparable var9 = var10000;
      var8 = false;
      return ComparisonsKt.compareValues(var9, (Comparable)var7.method_46558().method_1028(s8.f(var5).method_23317() + this.I[0], s8.f(var5).method_23318(), s8.f(var5).method_23321() + this.I[1]));
   }
}
