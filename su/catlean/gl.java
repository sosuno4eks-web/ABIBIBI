package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_3965;

public final class gl implements Comparator {
   private static int G;
   private static final long a = j0.a(2396228761752162678L, 5541476378350651459L, MethodHandles.lookup().lookupClass()).a(102260496085020L);

   public final int compare(Object a, Object b) {
      long var3 = a ^ 87757153576227L;
      long var5 = var3 ^ 2151595959605L;
      int var10000 = -1837498301208576831L.A<invokedynamic>(-1837498301208576831L, var3);
      class_3965 var8 = (class_3965)var1;
      boolean var9 = false;
      Comparable var10001 = (Comparable)s8.f(var5).method_33571().method_1025(var8.method_17784());
      var8 = (class_3965)var2;
      Comparable var10 = var10001;
      var9 = false;
      int var7 = var10000;

      try {
         var10000 = ComparisonsKt.compareValues(var10, (Comparable)s8.f(var5).method_33571().method_1025(var8.method_17784()));
         if (var7 != 0) {
            (new int[3]).A<invokedynamic>(new int[3], -1867873038083742296L, var3);
         }

         return var10000;
      } catch (NumberFormatException var11) {
         throw var11.A<invokedynamic>(var11, -1820294554399266965L, var3);
      }
   }

   public static void h(int var0) {
      G = var0;
   }

   public static int e() {
      return G;
   }

   public static int E() {
      int var0 = e();

      try {
         return var0 == 0 ? 20 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   static {
      long var0 = a ^ 44731336861881L;
      if (7741491995559043609L.A<invokedynamic>(7741491995559043609L, var0) == 0) {
         18.A<invokedynamic>(18, 7760507823872618171L, var0);
      }

   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
