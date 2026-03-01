package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_1657;
import net.minecraft.class_2338;

public final class ei implements Comparator {
   final class_1657 k;
   private static boolean F;
   private static final long a = j0.a(3581913497079539846L, 7384688629722354694L, MethodHandles.lookup().lookupClass()).a(166961700393957L);

   public ei(class_1657 var1) {
      this.k = var1;
   }

   public final int compare(Object a, Object b) {
      long var3 = a ^ 101537304913167L;
      boolean var10000 = 5603201266128798491L.A<invokedynamic>(5603201266128798491L, var3);
      class_2338 var6 = (class_2338)var1;
      boolean var7 = false;
      Comparable var10001 = (Comparable)this.k.method_33571().method_1022(var6.method_46558());
      var6 = (class_2338)var2;
      Comparable var8 = var10001;
      boolean var5 = var10000;
      var7 = false;

      try {
         int var10 = ComparisonsKt.compareValues(var8, (Comparable)this.k.method_33571().method_1022(var6.method_46558()));
         if (var5) {
            (new int[3]).A<invokedynamic>(new int[3], 5595063374916521502L, var3);
         }

         return var10;
      } catch (NumberFormatException var9) {
         throw var9.A<invokedynamic>(var9, 5595395747944951984L, var3);
      }
   }

   public static void n(boolean var0) {
      F = var0;
   }

   public static boolean L() {
      return F;
   }

   public static boolean X() {
      boolean var0 = L();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   static {
      long var0 = a ^ 65566804570544L;
      if (!-7382264369832978647L.A<invokedynamic>(-7382264369832978647L, var0)) {
         true.A<invokedynamic>(true, -7394020212507339468L, var0);
      }

   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
