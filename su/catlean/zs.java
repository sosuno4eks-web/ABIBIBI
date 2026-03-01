package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_3965;

public final class zs implements Comparator {
   private static final long a = j0.a(1693134221514042990L, 5973867165083761219L, MethodHandles.lookup().lookupClass()).a(12526402395901L);

   public final int compare(Object a, Object b) {
      long var3 = a ^ 89049213370119L;
      long var5 = var3 ^ 97354103569806L;
      class_3965 var8 = (class_3965)var1;
      boolean var9 = false;
      String var10000 = -4753579133192033425L.A<invokedynamic>(-4753579133192033425L, var3);
      Comparable var10001 = (Comparable)s8.f(var5).method_33571().method_1025(var8.method_17784());
      var8 = (class_3965)var2;
      Comparable var10 = var10001;
      String var7 = var10000;
      var9 = false;

      try {
         int var12 = ComparisonsKt.compareValues(var10, (Comparable)s8.f(var5).method_33571().method_1025(var8.method_17784()));
         if (var7 == null) {
            (new int[3]).A<invokedynamic>(new int[3], -4708335144734065389L, var3);
         }

         return var12;
      } catch (NumberFormatException var11) {
         throw var11.A<invokedynamic>(var11, -4698750449082916264L, var3);
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
