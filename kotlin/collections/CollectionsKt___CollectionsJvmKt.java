package kotlin.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class CollectionsKt___CollectionsJvmKt extends CollectionsKt__ReversedViewsKt {
   @NotNull
   public static final <R> List<R> filterIsInstance(@NotNull Iterable<?> $this$filterIsInstance, @NotNull Class<R> klass) {
      Intrinsics.checkNotNullParameter($this$filterIsInstance, "<this>");
      Intrinsics.checkNotNullParameter(klass, "klass");
      return (List)CollectionsKt.filterIsInstanceTo($this$filterIsInstance, (Collection)(new ArrayList()), klass);
   }

   @NotNull
   public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(@NotNull Iterable<?> $this$filterIsInstanceTo, @NotNull C destination, @NotNull Class<R> klass) {
      Intrinsics.checkNotNullParameter($this$filterIsInstanceTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(klass, "klass");
      Iterator var3 = $this$filterIsInstanceTo.iterator();

      while(var3.hasNext()) {
         Object element = var3.next();
         if (klass.isInstance(element)) {
            destination.add(element);
         }
      }

      return destination;
   }

   public static final <T> void reverse(@NotNull List<T> $this$reverse) {
      Intrinsics.checkNotNullParameter($this$reverse, "<this>");
      Collections.reverse($this$reverse);
   }

   @NotNull
   public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(@NotNull Iterable<? extends T> $this$toSortedSet) {
      Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
      return (SortedSet)CollectionsKt.toCollection($this$toSortedSet, (Collection)(new TreeSet()));
   }

   @NotNull
   public static final <T> SortedSet<T> toSortedSet(@NotNull Iterable<? extends T> $this$toSortedSet, @NotNull Comparator<? super T> comparator) {
      Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return (SortedSet)CollectionsKt.toCollection($this$toSortedSet, (Collection)(new TreeSet(comparator)));
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   @SinceKotlin(
      version = "1.1"
   )
   public static final Double max(Iterable $this$max) {
      Intrinsics.checkNotNullParameter($this$max, "<this>");
      return CollectionsKt.maxOrNull($this$max);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   @SinceKotlin(
      version = "1.1"
   )
   public static final Float max(Iterable $this$max) {
      Intrinsics.checkNotNullParameter($this$max, "<this>");
      return CollectionsKt.maxOrNull($this$max);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Comparable max(Iterable $this$max) {
      Intrinsics.checkNotNullParameter($this$max, "<this>");
      return CollectionsKt.maxOrNull($this$max);
   }

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
   public static final <T, R extends Comparable<? super R>> T maxBy(Iterable<? extends T> $this$maxBy, Function1<? super T, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$maxBy = false;
      int $i$f$maxByOrNull = false;
      Iterator iterator$iv = $this$maxBy.iterator();
      Object var10000;
      if (!iterator$iv.hasNext()) {
         var10000 = null;
      } else {
         Object maxElem$iv = iterator$iv.next();
         if (!iterator$iv.hasNext()) {
            var10000 = maxElem$iv;
         } else {
            Comparable maxValue$iv = (Comparable)selector.invoke(maxElem$iv);

            do {
               Object e$iv = iterator$iv.next();
               Comparable v$iv = (Comparable)selector.invoke(e$iv);
               if (maxValue$iv.compareTo(v$iv) < 0) {
                  maxElem$iv = e$iv;
                  maxValue$iv = v$iv;
               }
            } while(iterator$iv.hasNext());

            var10000 = maxElem$iv;
         }
      }

      return var10000;
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
   public static final Object maxWith(Iterable $this$maxWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return CollectionsKt.maxWithOrNull($this$maxWith, comparator);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   @SinceKotlin(
      version = "1.1"
   )
   public static final Double min(Iterable $this$min) {
      Intrinsics.checkNotNullParameter($this$min, "<this>");
      return CollectionsKt.minOrNull($this$min);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   @SinceKotlin(
      version = "1.1"
   )
   public static final Float min(Iterable $this$min) {
      Intrinsics.checkNotNullParameter($this$min, "<this>");
      return CollectionsKt.minOrNull($this$min);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Comparable min(Iterable $this$min) {
      Intrinsics.checkNotNullParameter($this$min, "<this>");
      return CollectionsKt.minOrNull($this$min);
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
   public static final <T, R extends Comparable<? super R>> T minBy(Iterable<? extends T> $this$minBy, Function1<? super T, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$minBy = false;
      int $i$f$minByOrNull = false;
      Iterator iterator$iv = $this$minBy.iterator();
      Object var10000;
      if (!iterator$iv.hasNext()) {
         var10000 = null;
      } else {
         Object minElem$iv = iterator$iv.next();
         if (!iterator$iv.hasNext()) {
            var10000 = minElem$iv;
         } else {
            Comparable minValue$iv = (Comparable)selector.invoke(minElem$iv);

            do {
               Object e$iv = iterator$iv.next();
               Comparable v$iv = (Comparable)selector.invoke(e$iv);
               if (minValue$iv.compareTo(v$iv) > 0) {
                  minElem$iv = e$iv;
                  minValue$iv = v$iv;
               }
            } while(iterator$iv.hasNext());

            var10000 = minElem$iv;
         }
      }

      return var10000;
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
   public static final Object minWith(Iterable $this$minWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$minWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return CollectionsKt.minWithOrNull($this$minWith, comparator);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigDecimal"
   )
   @InlineOnly
   private static final <T> BigDecimal sumOfBigDecimal(Iterable<? extends T> $this$sumOf, Function1<? super T, ? extends BigDecimal> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigDecimal var10000 = BigDecimal.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigDecimal sum = var10000;

      for(Iterator var3 = $this$sumOf.iterator(); var3.hasNext(); sum = var10000) {
         Object element = var3.next();
         var10000 = sum.add((BigDecimal)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigInteger"
   )
   @InlineOnly
   private static final <T> BigInteger sumOfBigInteger(Iterable<? extends T> $this$sumOf, Function1<? super T, ? extends BigInteger> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigInteger var10000 = BigInteger.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigInteger sum = var10000;

      for(Iterator var3 = $this$sumOf.iterator(); var3.hasNext(); sum = var10000) {
         Object element = var3.next();
         var10000 = sum.add((BigInteger)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
      }

      return sum;
   }

   public CollectionsKt___CollectionsJvmKt() {
   }
}
