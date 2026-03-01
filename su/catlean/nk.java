package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_3965;

public final class nk implements Comparator {
   private static String l;
   private static final long a = j0.a(3728423296149597951L, 5059592131721529824L, MethodHandles.lookup().lookupClass()).a(276518842872225L);

   public final int compare(Object a, Object b) {
      long var3 = a ^ 88673542526805L;
      long var5 = var3 ^ 49514319760380L;
      class_3965 var7 = (class_3965)var1;
      boolean var8 = false;
      Comparable var10000 = (Comparable)s8.f(var5).method_33571().method_1025(var7.method_17784());
      var7 = (class_3965)var2;
      Comparable var9 = var10000;
      var8 = false;
      return ComparisonsKt.compareValues(var9, (Comparable)s8.f(var5).method_33571().method_1025(var7.method_17784()));
   }

   public static void D(String var0) {
      l = var0;
   }

   public static String k() {
      return l;
   }

   static {
      long var0 = a ^ 9103732361501L;
      if (-3009027321368132779L.A<invokedynamic>(-3009027321368132779L, var0) == null) {
         "ODEWc".A<invokedynamic>("ODEWc", -2991195571670117171L, var0);
      }

   }
}
