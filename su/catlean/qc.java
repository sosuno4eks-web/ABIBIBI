package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

public final class qc implements Comparator {
   private static final long a = j0.a(8801757665734541950L, 3524024994207294832L, MethodHandles.lookup().lookupClass()).a(161715230575167L);

   public final int compare(Object a, Object b) {
      long var3 = a ^ 115152688147686L;
      long var5 = var3 ^ 53778696069695L;
      r7 var7 = (r7)var1;
      boolean var8 = false;
      ez var10000 = ez.N;
      Intrinsics.checkNotNull(var7);
      Comparable var10 = (Comparable)ez.A(var10000, var5, var7);
      var7 = (r7)var2;
      Comparable var9 = var10;
      var8 = false;
      var10000 = ez.N;
      Intrinsics.checkNotNull(var7);
      return ComparisonsKt.compareValues(var9, (Comparable)ez.A(var10000, var5, var7));
   }
}
