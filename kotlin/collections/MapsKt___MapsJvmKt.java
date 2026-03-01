package kotlin.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ReplaceWith;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

class MapsKt___MapsJvmKt extends MapsKt__MapsKt {
   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxByOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxByOrNull(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   @InlineOnly
   private static final <K, V, R extends Comparable<? super R>> Entry<K, V> maxBy(Map<? extends K, ? extends V> $this$maxBy, Function1<? super Entry<? extends K, ? extends V>, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterable var2 = (Iterable)$this$maxBy.entrySet();
      Iterator var3 = var2.iterator();
      Object var10000;
      if (!var3.hasNext()) {
         var10000 = null;
      } else {
         Object var4 = var3.next();
         if (!var3.hasNext()) {
            var10000 = var4;
         } else {
            Comparable var5 = (Comparable)selector.invoke(var4);

            do {
               Object var6 = var3.next();
               Comparable var7 = (Comparable)selector.invoke(var6);
               if (var5.compareTo(var7) < 0) {
                  var4 = var6;
                  var5 = var7;
               }
            } while(var3.hasNext());

            var10000 = var4;
         }
      }

      return (Entry)var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxWithOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxWithOrNull(comparator)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   @InlineOnly
   private static final <K, V> Entry<K, V> maxWith(Map<? extends K, ? extends V> $this$maxWith, Comparator<? super Entry<? extends K, ? extends V>> comparator) {
      Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return (Entry)CollectionsKt.maxWithOrNull((Iterable)$this$maxWith.entrySet(), comparator);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minByOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minByOrNull(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final <K, V, R extends Comparable<? super R>> Entry<K, V> minBy(Map<? extends K, ? extends V> $this$minBy, Function1<? super Entry<? extends K, ? extends V>, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$minBy = false;
      Iterable var3 = (Iterable)$this$minBy.entrySet();
      Iterator var4 = var3.iterator();
      Object var10000;
      if (!var4.hasNext()) {
         var10000 = null;
      } else {
         Object var5 = var4.next();
         if (!var4.hasNext()) {
            var10000 = var5;
         } else {
            Comparable var6 = (Comparable)selector.invoke(var5);

            do {
               Object var7 = var4.next();
               Comparable var8 = (Comparable)selector.invoke(var7);
               if (var6.compareTo(var8) > 0) {
                  var5 = var7;
                  var6 = var8;
               }
            } while(var4.hasNext());

            var10000 = var5;
         }
      }

      return (Entry)var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minWithOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minWithOrNull(comparator)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Entry minWith(Map $this$minWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$minWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return (Entry)CollectionsKt.minWithOrNull((Iterable)$this$minWith.entrySet(), comparator);
   }

   public MapsKt___MapsJvmKt() {
   }
}
