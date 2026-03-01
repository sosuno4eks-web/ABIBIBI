package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_2338;

public final class re implements Comparator {
   private static int f;
   private static final long a = j0.a(8431461898767476420L, 5302618509037263943L, MethodHandles.lookup().lookupClass()).a(46377864826835L);

   public final int compare(Object a, Object b) {
      long var3 = a ^ 121805411745682L;
      long var5 = var3 ^ 33237614777888L;
      int var10000 = -3058582802633303297L.A<invokedynamic>(-3058582802633303297L, var3);
      class_2338 var8 = (class_2338)var1;
      int var7 = var10000;
      boolean var9 = false;
      Comparable var12 = (Comparable)s8.f(var5).method_5707(var8.method_46558());
      var8 = (class_2338)var2;
      Comparable var10 = var12;
      var9 = false;

      try {
         var10000 = ComparisonsKt.compareValues(var10, (Comparable)s8.f(var5).method_5707(var8.method_46558()));
         if (var7 != 0) {
            (new int[1]).A<invokedynamic>(new int[1], -3096536386403494211L, var3);
         }

         return var10000;
      } catch (NumberFormatException var11) {
         throw var11.A<invokedynamic>(var11, -3073458806754804272L, var3);
      }
   }

   public static void g(int var0) {
      f = var0;
   }

   public static int N() {
      return f;
   }

   public static int w() {
      int var0 = N();

      try {
         return var0 == 0 ? 118 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   static {
      long var0 = a ^ 91003852864445L;
      if (1270726655319645904L.A<invokedynamic>(1270726655319645904L, var0) != 0) {
         60.A<invokedynamic>(60, 1239417145548722525L, var0);
      }

   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
