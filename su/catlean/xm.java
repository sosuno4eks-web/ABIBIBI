package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_2338;

public final class xm implements Comparator {
   final double[] y;
   private static final long a = j0.a(7418749683798114672L, 1434983308183541940L, MethodHandles.lookup().lookupClass()).a(226091073505275L);

   public xm(double[] var1) {
      this.y = var1;
   }

   public final int compare(Object a, Object b) {
      long var3 = a ^ 15802141321116L;
      long var5 = var3 ^ 109679202373272L;
      String var10000 = -8226022627279867341L.A<invokedynamic>(-8226022627279867341L, var3);
      class_2338 var8 = (class_2338)var1;
      boolean var9 = false;
      String var7 = var10000;
      Comparable var12 = (Comparable)var8.method_46558().method_1028(s8.f(var5).method_23317() + this.y[0], s8.f(var5).method_23318(), s8.f(var5).method_23321() + this.y[1]);
      var8 = (class_2338)var2;
      Comparable var10 = var12;
      var9 = false;

      try {
         int var13 = ComparisonsKt.compareValues(var10, (Comparable)var8.method_46558().method_1028(s8.f(var5).method_23317() + this.y[0], s8.f(var5).method_23318(), s8.f(var5).method_23321() + this.y[1]));
         if (var7 != null) {
            (new int[3]).A<invokedynamic>(new int[3], -8232974387712340475L, var3);
         }

         return var13;
      } catch (NumberFormatException var11) {
         throw var11.A<invokedynamic>(var11, -8219973815484719516L, var3);
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
