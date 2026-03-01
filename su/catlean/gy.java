package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_2338;
import net.minecraft.class_243;

public final class gy implements Comparator {
   final class_243 o;
   private static String c;
   private static final long a = j0.a(7677944814656431941L, 5381337213130833875L, MethodHandles.lookup().lookupClass()).a(136361745073028L);

   public gy(class_243 var1) {
      this.o = var1;
   }

   public final int compare(Object a, Object b) {
      long var3 = a ^ 75597185724144L;
      class_2338 var6 = (class_2338)var1;
      5721875097873854604L.A<invokedynamic>(5721875097873854604L, var3);
      boolean var7 = false;
      Comparable var10000 = (Comparable)var6.method_46558().method_1022(this.o);
      var6 = (class_2338)var2;
      Comparable var8 = var10000;
      var7 = false;

      try {
         int var10 = ComparisonsKt.compareValues(var8, (Comparable)var6.method_46558().method_1022(this.o));
         if (5763069306939394704L.A<invokedynamic>(5763069306939394704L, var3) == null) {
            "y2c34b".A<invokedynamic>("y2c34b", 5745817732541596617L, var3);
         }

         return var10;
      } catch (NumberFormatException var9) {
         throw var9.A<invokedynamic>(var9, 5680288511925322397L, var3);
      }
   }

   public static void u(String var0) {
      c = var0;
   }

   public static String w() {
      return c;
   }

   static {
      long var0 = a ^ 72339076016778L;
      if (797746394053473526L.A<invokedynamic>(797746394053473526L, var0) != null) {
         "ygnBQc".A<invokedynamic>("ygnBQc", 848712765295232947L, var0);
      }

   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
