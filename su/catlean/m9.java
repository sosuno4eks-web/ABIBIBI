package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_3965;

public final class m9 implements Comparator {
   private static k9[] j;
   private static final long a = j0.a(8214287374555266212L, 2283519006373280953L, MethodHandles.lookup().lookupClass()).a(189432807722338L);

   public final int compare(Object a, Object b) {
      long var3 = a ^ 60193455514943L;
      long var5 = var3 ^ 128892114323339L;
      k9[] var10000 = 4962289936577471535L.A<invokedynamic>(4962289936577471535L, var3);
      class_3965 var8 = (class_3965)var1;
      boolean var9 = false;
      k9[] var7 = var10000;
      Comparable var12 = (Comparable)s8.f(var5).method_33571().method_1025(var8.method_17784());
      var8 = (class_3965)var2;
      Comparable var10 = var12;
      var9 = false;

      try {
         int var13 = ComparisonsKt.compareValues(var10, (Comparable)s8.f(var5).method_33571().method_1025(var8.method_17784()));
         if (var7 == null) {
            (new int[3]).A<invokedynamic>(new int[3], 4948769417322399510L, var3);
         }

         return var13;
      } catch (NumberFormatException var11) {
         throw var11.A<invokedynamic>(var11, 4971171317051924346L, var3);
      }
   }

   public static void w(k9[] var0) {
      j = var0;
   }

   public static k9[] q() {
      return j;
   }

   static {
      long var0 = a ^ 13724869969226L;
      if (2641540000776537178L.A<invokedynamic>(2641540000776537178L, var0) == null) {
         (new k9[4]).A<invokedynamic>(new k9[4], 2594690464933497609L, var0);
      }

   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
