package su.catlean;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_243;

public final class _f implements Comparator {
   final class_243 q;

   public _f(class_243 var1) {
      this.q = var1;
   }

   public final int compare(Object a, Object b) {
      class_243 var3 = (class_243)var1;
      boolean var4 = false;
      Comparable var10000 = (Comparable)this.q.method_1022(var3);
      var3 = (class_243)var2;
      Comparable var5 = var10000;
      var4 = false;
      return ComparisonsKt.compareValues(var5, (Comparable)this.q.method_1022(var3));
   }
}
