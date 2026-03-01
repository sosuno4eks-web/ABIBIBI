package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
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

class StringsKt___StringsJvmKt extends StringsKt__StringsKt {
   @InlineOnly
   private static final char elementAt(CharSequence $this$elementAt, int index) {
      Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
      return $this$elementAt.charAt(index);
   }

   @NotNull
   public static final SortedSet<Character> toSortedSet(@NotNull CharSequence $this$toSortedSet) {
      Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
      return (SortedSet)StringsKt.toCollection($this$toSortedSet, (Collection)(new TreeSet()));
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
   public static final Character max(CharSequence $this$max) {
      Intrinsics.checkNotNullParameter($this$max, "<this>");
      return StringsKt.maxOrNull($this$max);
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
   public static final <R extends Comparable<? super R>> Character maxBy(CharSequence $this$maxBy, Function1<? super Character, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$maxBy = false;
      CharSequence $this$maxByOrNull$iv = $this$maxBy;
      int $i$f$maxByOrNull = false;
      Character var10000;
      if ($this$maxBy.length() == 0) {
         var10000 = null;
      } else {
         char maxElem$iv = $this$maxBy.charAt(0);
         int lastIndex$iv = StringsKt.getLastIndex($this$maxBy);
         if (lastIndex$iv == 0) {
            var10000 = maxElem$iv;
         } else {
            Comparable maxValue$iv = (Comparable)selector.invoke(maxElem$iv);
            int i$iv = 1;
            if (i$iv <= lastIndex$iv) {
               while(true) {
                  char e$iv = $this$maxByOrNull$iv.charAt(i$iv);
                  Comparable v$iv = (Comparable)selector.invoke(e$iv);
                  if (maxValue$iv.compareTo(v$iv) < 0) {
                     maxElem$iv = e$iv;
                     maxValue$iv = v$iv;
                  }

                  if (i$iv == lastIndex$iv) {
                     break;
                  }

                  ++i$iv;
               }
            }

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
   public static final Character maxWith(CharSequence $this$maxWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return StringsKt.maxWithOrNull($this$maxWith, comparator);
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
   public static final Character min(CharSequence $this$min) {
      Intrinsics.checkNotNullParameter($this$min, "<this>");
      return StringsKt.minOrNull($this$min);
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
   public static final <R extends Comparable<? super R>> Character minBy(CharSequence $this$minBy, Function1<? super Character, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$minBy = false;
      CharSequence $this$minByOrNull$iv = $this$minBy;
      int $i$f$minByOrNull = false;
      Character var10000;
      if ($this$minBy.length() == 0) {
         var10000 = null;
      } else {
         char minElem$iv = $this$minBy.charAt(0);
         int lastIndex$iv = StringsKt.getLastIndex($this$minBy);
         if (lastIndex$iv == 0) {
            var10000 = minElem$iv;
         } else {
            Comparable minValue$iv = (Comparable)selector.invoke(minElem$iv);
            int i$iv = 1;
            if (i$iv <= lastIndex$iv) {
               while(true) {
                  char e$iv = $this$minByOrNull$iv.charAt(i$iv);
                  Comparable v$iv = (Comparable)selector.invoke(e$iv);
                  if (minValue$iv.compareTo(v$iv) > 0) {
                     minElem$iv = e$iv;
                     minValue$iv = v$iv;
                  }

                  if (i$iv == lastIndex$iv) {
                     break;
                  }

                  ++i$iv;
               }
            }

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
   public static final Character minWith(CharSequence $this$minWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$minWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return StringsKt.minWithOrNull($this$minWith, comparator);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigDecimal"
   )
   @InlineOnly
   private static final BigDecimal sumOfBigDecimal(CharSequence $this$sumOf, Function1<? super Character, ? extends BigDecimal> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigDecimal var10000 = BigDecimal.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigDecimal sum = var10000;

      for(int var3 = 0; var3 < $this$sumOf.length(); ++var3) {
         char element = $this$sumOf.charAt(var3);
         var10000 = sum.add((BigDecimal)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
         sum = var10000;
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
   private static final BigInteger sumOfBigInteger(CharSequence $this$sumOf, Function1<? super Character, ? extends BigInteger> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigInteger var10000 = BigInteger.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigInteger sum = var10000;

      for(int var3 = 0; var3 < $this$sumOf.length(); ++var3) {
         char element = $this$sumOf.charAt(var3);
         var10000 = sum.add((BigInteger)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
         sum = var10000;
      }

      return sum;
   }

   public StringsKt___StringsJvmKt() {
   }
}
