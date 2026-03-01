package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_742;

public final class rg implements Comparator {
   private static final long a = j0.a(8978015916661514193L, 8859119777609947529L, MethodHandles.lookup().lookupClass()).a(37865359816680L);

   public final int compare(Object a, Object b) {
      long var3 = a ^ 28200422770775L;
      long var5 = var3 ^ 40971346741677L;
      long var7 = var3 ^ 31669270480575L;
      class_742 var10 = (class_742)var2;
      int[] var10000 = -8501911238671268876L.A<invokedynamic>(-8501911238671268876L, var3);
      boolean var11 = false;
      class_243 var10001 = lg.t.W(var7, (class_1297)s8.f(var5));
      lg var10002 = lg.t;
      Intrinsics.checkNotNull(var10);
      Comparable var16 = (Comparable)var10001.method_1025(var10002.W(var7, (class_1297)var10));
      var10 = (class_742)var1;
      Comparable var12 = var16;
      int[] var9 = var10000;
      var11 = false;

      try {
         class_243 var14 = lg.t.W(var7, (class_1297)s8.f(var5));
         lg var17 = lg.t;
         Intrinsics.checkNotNull(var10);
         int var15 = ComparisonsKt.compareValues(var12, (Comparable)var14.method_1025(var17.W(var7, (class_1297)var10)));
         if (var9 != null) {
            (new int[3]).A<invokedynamic>(new int[3], -8463424879386932944L, var3);
         }

         return var15;
      } catch (NumberFormatException var13) {
         throw var13.A<invokedynamic>(var13, -8466774701874308376L, var3);
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
