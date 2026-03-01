package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import net.minecraft.class_243;

public final class qh implements Comparator {
   private static int C;
   private static final long a = j0.a(4269656107029991229L, 6274688453943471652L, MethodHandles.lookup().lookupClass()).a(141833730622029L);

   public final int compare(Object a, Object b) {
      long var3 = a ^ 55953142870606L;
      long var5 = var3 ^ 25937646854809L;
      long var7 = var3 ^ 50688754560395L;
      class_1297 var10 = (class_1297)var1;
      int var10000 = 2425013079124272751L.A<invokedynamic>(2425013079124272751L, var3);
      boolean var11 = false;
      int var9 = var10000;
      class_243 var14 = s8.f(var5).method_33571();
      yz var10001 = yz.s;
      Intrinsics.checkNotNull(var10);
      Comparable var15 = (Comparable)var14.method_1025(var10001.W(var7, var10));
      var10 = (class_1297)var2;
      Comparable var12 = var15;
      var11 = false;

      try {
         var14 = s8.f(var5).method_33571();
         var10001 = yz.s;
         Intrinsics.checkNotNull(var10);
         var10000 = ComparisonsKt.compareValues(var12, (Comparable)var14.method_1025(var10001.W(var7, var10)));
         if (var9 == 0) {
            (new int[2]).A<invokedynamic>(new int[2], 2431923172843184644L, var3);
         }

         return var10000;
      } catch (NumberFormatException var13) {
         throw var13.A<invokedynamic>(var13, 2426833995603419102L, var3);
      }
   }

   public static void i(int var0) {
      C = var0;
   }

   public static int P() {
      return C;
   }

   public static int F() {
      int var0 = P();

      try {
         return var0 == 0 ? 35 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   static {
      long var0 = a ^ 124986217144342L;
      if (8358438754130048055L.A<invokedynamic>(8358438754130048055L, var0) == 0) {
         35.A<invokedynamic>(35, 8303342484577689378L, var0);
      }

   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
