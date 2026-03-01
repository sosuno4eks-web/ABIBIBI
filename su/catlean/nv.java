package su.catlean;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

public final class nv implements Comparator {
   public final int compare(Object a, Object b) {
      String var3 = (String)var1;
      boolean var4 = false;
      Comparable var10000 = (Comparable)var3;
      var3 = (String)var2;
      Comparable var5 = var10000;
      var4 = false;
      return ComparisonsKt.compareValues(var5, (Comparable)var3);
   }
}
