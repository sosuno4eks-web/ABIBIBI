package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class StringsKt___StringsKt extends StringsKt___StringsJvmKt {
   @InlineOnly
   private static final char elementAtOrElse(CharSequence $this$elementAtOrElse, int index, Function1<? super Integer, Character> defaultValue) {
      Intrinsics.checkNotNullParameter($this$elementAtOrElse, "<this>");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      return (0 <= index ? index < $this$elementAtOrElse.length() : false) ? $this$elementAtOrElse.charAt(index) : (Character)defaultValue.invoke(index);
   }

   @InlineOnly
   private static final Character elementAtOrNull(CharSequence $this$elementAtOrNull, int index) {
      Intrinsics.checkNotNullParameter($this$elementAtOrNull, "<this>");
      return StringsKt.getOrNull($this$elementAtOrNull, index);
   }

   @InlineOnly
   private static final Character find(CharSequence $this$find, Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$find, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      CharSequence $this$firstOrNull$iv = $this$find;
      int $i$f$firstOrNull = false;
      int var4 = 0;

      Character var10000;
      while(true) {
         if (var4 >= $this$firstOrNull$iv.length()) {
            var10000 = null;
            break;
         }

         char element$iv = $this$firstOrNull$iv.charAt(var4);
         if ((Boolean)predicate.invoke(element$iv)) {
            var10000 = element$iv;
            break;
         }

         ++var4;
      }

      return var10000;
   }

   @InlineOnly
   private static final Character findLast(CharSequence $this$findLast, Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$findLast, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      CharSequence $this$lastOrNull$iv = $this$findLast;
      int $i$f$lastOrNull = false;
      int var4 = $this$findLast.length() + -1;
      Character var10000;
      if (0 <= var4) {
         do {
            int index$iv = var4--;
            char element$iv = $this$lastOrNull$iv.charAt(index$iv);
            if ((Boolean)predicate.invoke(element$iv)) {
               var10000 = element$iv;
               return var10000;
            }
         } while(0 <= var4);
      }

      var10000 = null;
      return var10000;
   }

   public static final char first(@NotNull CharSequence $this$first) {
      Intrinsics.checkNotNullParameter($this$first, "<this>");
      if ($this$first.length() == 0) {
         throw new NoSuchElementException("Char sequence is empty.");
      } else {
         return $this$first.charAt(0);
      }
   }

   public static final char first(@NotNull CharSequence $this$first, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$first, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$first = false;

      for(int var3 = 0; var3 < $this$first.length(); ++var3) {
         char element = $this$first.charAt(var3);
         if ((Boolean)predicate.invoke(element)) {
            return element;
         }
      }

      throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final <R> R firstNotNullOf(CharSequence $this$firstNotNullOf, Function1<? super Character, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$firstNotNullOf, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      CharSequence var2 = $this$firstNotNullOf;
      int var3 = 0;

      Object var10000;
      while(true) {
         if (var3 >= var2.length()) {
            var10000 = null;
            break;
         }

         char var4 = var2.charAt(var3);
         var10000 = transform.invoke(var4);
         if (var10000 != null) {
            break;
         }

         ++var3;
      }

      if (var10000 == null) {
         throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
      } else {
         return var10000;
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final <R> R firstNotNullOfOrNull(CharSequence $this$firstNotNullOfOrNull, Function1<? super Character, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$firstNotNullOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");

      for(int var2 = 0; var2 < $this$firstNotNullOfOrNull.length(); ++var2) {
         char element = $this$firstNotNullOfOrNull.charAt(var2);
         Object result = transform.invoke(element);
         if (result != null) {
            return result;
         }
      }

      return null;
   }

   @Nullable
   public static final Character firstOrNull(@NotNull CharSequence $this$firstOrNull) {
      Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
      return $this$firstOrNull.length() == 0 ? null : $this$firstOrNull.charAt(0);
   }

   @Nullable
   public static final Character firstOrNull(@NotNull CharSequence $this$firstOrNull, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$firstOrNull = false;

      for(int var3 = 0; var3 < $this$firstOrNull.length(); ++var3) {
         char element = $this$firstOrNull.charAt(var3);
         if ((Boolean)predicate.invoke(element)) {
            return element;
         }
      }

      return null;
   }

   @InlineOnly
   private static final char getOrElse(CharSequence $this$getOrElse, int index, Function1<? super Integer, Character> defaultValue) {
      Intrinsics.checkNotNullParameter($this$getOrElse, "<this>");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      return (0 <= index ? index < $this$getOrElse.length() : false) ? $this$getOrElse.charAt(index) : (Character)defaultValue.invoke(index);
   }

   @Nullable
   public static final Character getOrNull(@NotNull CharSequence $this$getOrNull, int index) {
      Intrinsics.checkNotNullParameter($this$getOrNull, "<this>");
      return (0 <= index ? index < $this$getOrNull.length() : false) ? $this$getOrNull.charAt(index) : null;
   }

   public static final int indexOfFirst(@NotNull CharSequence $this$indexOfFirst, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$indexOfFirst, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$indexOfFirst = false;
      int index = 0;

      for(int var4 = $this$indexOfFirst.length(); index < var4; ++index) {
         if ((Boolean)predicate.invoke($this$indexOfFirst.charAt(index))) {
            return index;
         }
      }

      return -1;
   }

   public static final int indexOfLast(@NotNull CharSequence $this$indexOfLast, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$indexOfLast, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$indexOfLast = false;
      int var3 = $this$indexOfLast.length() + -1;
      if (0 <= var3) {
         do {
            int index = var3--;
            if ((Boolean)predicate.invoke($this$indexOfLast.charAt(index))) {
               return index;
            }
         } while(0 <= var3);
      }

      return -1;
   }

   public static final char last(@NotNull CharSequence $this$last) {
      Intrinsics.checkNotNullParameter($this$last, "<this>");
      if ($this$last.length() == 0) {
         throw new NoSuchElementException("Char sequence is empty.");
      } else {
         return $this$last.charAt(StringsKt.getLastIndex($this$last));
      }
   }

   public static final char last(@NotNull CharSequence $this$last, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$last, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$last = false;
      int var3 = $this$last.length() + -1;
      if (0 <= var3) {
         do {
            int index = var3--;
            char element = $this$last.charAt(index);
            if ((Boolean)predicate.invoke(element)) {
               return element;
            }
         } while(0 <= var3);
      }

      throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
   }

   @Nullable
   public static final Character lastOrNull(@NotNull CharSequence $this$lastOrNull) {
      Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
      return $this$lastOrNull.length() == 0 ? null : $this$lastOrNull.charAt($this$lastOrNull.length() - 1);
   }

   @Nullable
   public static final Character lastOrNull(@NotNull CharSequence $this$lastOrNull, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$lastOrNull = false;
      int var3 = $this$lastOrNull.length() + -1;
      if (0 <= var3) {
         do {
            int index = var3--;
            char element = $this$lastOrNull.charAt(index);
            if ((Boolean)predicate.invoke(element)) {
               return element;
            }
         } while(0 <= var3);
      }

      return null;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final char random(CharSequence $this$random) {
      Intrinsics.checkNotNullParameter($this$random, "<this>");
      return StringsKt.random($this$random, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.3"
   )
   public static final char random(@NotNull CharSequence $this$random, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$random, "<this>");
      Intrinsics.checkNotNullParameter(random, "random");
      if ($this$random.length() == 0) {
         throw new NoSuchElementException("Char sequence is empty.");
      } else {
         return $this$random.charAt(random.nextInt($this$random.length()));
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final Character randomOrNull(CharSequence $this$randomOrNull) {
      Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
      return StringsKt.randomOrNull($this$randomOrNull, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final Character randomOrNull(@NotNull CharSequence $this$randomOrNull, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
      Intrinsics.checkNotNullParameter(random, "random");
      return $this$randomOrNull.length() == 0 ? null : $this$randomOrNull.charAt(random.nextInt($this$randomOrNull.length()));
   }

   public static final char single(@NotNull CharSequence $this$single) {
      Intrinsics.checkNotNullParameter($this$single, "<this>");
      switch($this$single.length()) {
      case 0:
         throw new NoSuchElementException("Char sequence is empty.");
      case 1:
         return $this$single.charAt(0);
      default:
         throw new IllegalArgumentException("Char sequence has more than one element.");
      }
   }

   public static final char single(@NotNull CharSequence $this$single, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$single, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$single = false;
      Character single = null;
      boolean found = false;

      for(int var5 = 0; var5 < $this$single.length(); ++var5) {
         char element = $this$single.charAt(var5);
         if ((Boolean)predicate.invoke(element)) {
            if (found) {
               throw new IllegalArgumentException("Char sequence contains more than one matching element.");
            }

            single = element;
            found = true;
         }
      }

      if (!found) {
         throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
      } else {
         Intrinsics.checkNotNull(single, "null cannot be cast to non-null type kotlin.Char");
         return single;
      }
   }

   @Nullable
   public static final Character singleOrNull(@NotNull CharSequence $this$singleOrNull) {
      Intrinsics.checkNotNullParameter($this$singleOrNull, "<this>");
      return $this$singleOrNull.length() == 1 ? $this$singleOrNull.charAt(0) : null;
   }

   @Nullable
   public static final Character singleOrNull(@NotNull CharSequence $this$singleOrNull, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$singleOrNull, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$singleOrNull = false;
      Character single = null;
      boolean found = false;

      for(int var5 = 0; var5 < $this$singleOrNull.length(); ++var5) {
         char element = $this$singleOrNull.charAt(var5);
         if ((Boolean)predicate.invoke(element)) {
            if (found) {
               return null;
            }

            single = element;
            found = true;
         }
      }

      if (!found) {
         return null;
      } else {
         return single;
      }
   }

   @NotNull
   public static final CharSequence drop(@NotNull CharSequence $this$drop, int n) {
      Intrinsics.checkNotNullParameter($this$drop, "<this>");
      if (n < 0) {
         int var2 = false;
         String var3 = "Requested character count " + n + " is less than zero.";
         throw new IllegalArgumentException(var3.toString());
      } else {
         return $this$drop.subSequence(RangesKt.coerceAtMost(n, $this$drop.length()), $this$drop.length());
      }
   }

   @NotNull
   public static final String drop(@NotNull String $this$drop, int n) {
      Intrinsics.checkNotNullParameter($this$drop, "<this>");
      if (n < 0) {
         int var4 = false;
         String var5 = "Requested character count " + n + " is less than zero.";
         throw new IllegalArgumentException(var5.toString());
      } else {
         int var3 = RangesKt.coerceAtMost(n, $this$drop.length());
         String var10000 = $this$drop.substring(var3);
         Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
         return var10000;
      }
   }

   @NotNull
   public static final CharSequence dropLast(@NotNull CharSequence $this$dropLast, int n) {
      Intrinsics.checkNotNullParameter($this$dropLast, "<this>");
      if (n < 0) {
         int var2 = false;
         String var3 = "Requested character count " + n + " is less than zero.";
         throw new IllegalArgumentException(var3.toString());
      } else {
         return StringsKt.take($this$dropLast, RangesKt.coerceAtLeast($this$dropLast.length() - n, 0));
      }
   }

   @NotNull
   public static final String dropLast(@NotNull String $this$dropLast, int n) {
      Intrinsics.checkNotNullParameter($this$dropLast, "<this>");
      if (n < 0) {
         int var2 = false;
         String var3 = "Requested character count " + n + " is less than zero.";
         throw new IllegalArgumentException(var3.toString());
      } else {
         return StringsKt.take($this$dropLast, RangesKt.coerceAtLeast($this$dropLast.length() - n, 0));
      }
   }

   @NotNull
   public static final CharSequence dropLastWhile(@NotNull CharSequence $this$dropLastWhile, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$dropLastWhile, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$dropLastWhile = false;

      for(int index = StringsKt.getLastIndex($this$dropLastWhile); -1 < index; --index) {
         if (!(Boolean)predicate.invoke($this$dropLastWhile.charAt(index))) {
            return $this$dropLastWhile.subSequence(0, index + 1);
         }
      }

      return (CharSequence)"";
   }

   @NotNull
   public static final String dropLastWhile(@NotNull String $this$dropLastWhile, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$dropLastWhile, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$dropLastWhile = false;

      for(int index = StringsKt.getLastIndex((CharSequence)$this$dropLastWhile); -1 < index; --index) {
         if (!(Boolean)predicate.invoke($this$dropLastWhile.charAt(index))) {
            byte var5 = 0;
            int var6 = index + 1;
            String var10000 = $this$dropLastWhile.substring(var5, var6);
            Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
            return var10000;
         }
      }

      return "";
   }

   @NotNull
   public static final CharSequence dropWhile(@NotNull CharSequence $this$dropWhile, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$dropWhile, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$dropWhile = false;
      int index = 0;

      for(int var4 = $this$dropWhile.length(); index < var4; ++index) {
         if (!(Boolean)predicate.invoke($this$dropWhile.charAt(index))) {
            return $this$dropWhile.subSequence(index, $this$dropWhile.length());
         }
      }

      return (CharSequence)"";
   }

   @NotNull
   public static final String dropWhile(@NotNull String $this$dropWhile, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$dropWhile, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$dropWhile = false;
      int index = 0;

      for(int var4 = ((CharSequence)$this$dropWhile).length(); index < var4; ++index) {
         if (!(Boolean)predicate.invoke($this$dropWhile.charAt(index))) {
            String var10000 = $this$dropWhile.substring(index);
            Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
            return var10000;
         }
      }

      return "";
   }

   @NotNull
   public static final CharSequence filter(@NotNull CharSequence $this$filter, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filter, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filter = false;
      CharSequence $this$filterTo$iv = $this$filter;
      Appendable destination$iv = (Appendable)(new StringBuilder());
      int $i$f$filterTo = false;
      int index$iv = 0;

      for(int var7 = $this$filter.length(); index$iv < var7; ++index$iv) {
         char element$iv = $this$filterTo$iv.charAt(index$iv);
         if ((Boolean)predicate.invoke(element$iv)) {
            destination$iv.append(element$iv);
         }
      }

      return (CharSequence)destination$iv;
   }

   @NotNull
   public static final String filter(@NotNull String $this$filter, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filter, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filter = false;
      CharSequence $this$filterTo$iv = (CharSequence)$this$filter;
      Appendable destination$iv = (Appendable)(new StringBuilder());
      int $i$f$filterTo = false;
      int index$iv = 0;

      for(int var7 = $this$filterTo$iv.length(); index$iv < var7; ++index$iv) {
         char element$iv = $this$filterTo$iv.charAt(index$iv);
         if ((Boolean)predicate.invoke(element$iv)) {
            destination$iv.append(element$iv);
         }
      }

      return ((StringBuilder)destination$iv).toString();
   }

   @NotNull
   public static final CharSequence filterIndexed(@NotNull CharSequence $this$filterIndexed, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterIndexed, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filterIndexed = false;
      Appendable destination$iv = (Appendable)(new StringBuilder());
      int $i$f$filterIndexedTo = false;
      CharSequence $this$forEachIndexed$iv$iv = $this$filterIndexed;
      int $i$f$forEachIndexed = false;
      int index$iv$iv = 0;

      for(int var9 = 0; var9 < $this$forEachIndexed$iv$iv.length(); ++var9) {
         char item$iv$iv = $this$forEachIndexed$iv$iv.charAt(var9);
         int index$iv = index$iv$iv++;
         int var13 = false;
         if ((Boolean)predicate.invoke(index$iv, item$iv$iv)) {
            destination$iv.append(item$iv$iv);
         }
      }

      return (CharSequence)destination$iv;
   }

   @NotNull
   public static final String filterIndexed(@NotNull String $this$filterIndexed, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterIndexed, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filterIndexed = false;
      CharSequence $this$filterIndexedTo$iv = (CharSequence)$this$filterIndexed;
      Appendable destination$iv = (Appendable)(new StringBuilder());
      int $i$f$filterIndexedTo = false;
      CharSequence $this$forEachIndexed$iv$iv = $this$filterIndexedTo$iv;
      int $i$f$forEachIndexed = false;
      int index$iv$iv = 0;

      for(int var9 = 0; var9 < $this$forEachIndexed$iv$iv.length(); ++var9) {
         char item$iv$iv = $this$forEachIndexed$iv$iv.charAt(var9);
         int index$iv = index$iv$iv++;
         int var13 = false;
         if ((Boolean)predicate.invoke(index$iv, item$iv$iv)) {
            destination$iv.append(item$iv$iv);
         }
      }

      return ((StringBuilder)destination$iv).toString();
   }

   @NotNull
   public static final <C extends Appendable> C filterIndexedTo(@NotNull CharSequence $this$filterIndexedTo, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterIndexedTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filterIndexedTo = false;
      CharSequence $this$forEachIndexed$iv = $this$filterIndexedTo;
      int $i$f$forEachIndexed = false;
      int index$iv = 0;

      for(int var7 = 0; var7 < $this$forEachIndexed$iv.length(); ++var7) {
         char item$iv = $this$forEachIndexed$iv.charAt(var7);
         int index = index$iv++;
         int var11 = false;
         if ((Boolean)predicate.invoke(index, item$iv)) {
            destination.append(item$iv);
         }
      }

      return destination;
   }

   @NotNull
   public static final CharSequence filterNot(@NotNull CharSequence $this$filterNot, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterNot, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filterNot = false;
      CharSequence $this$filterNotTo$iv = $this$filterNot;
      Appendable destination$iv = (Appendable)(new StringBuilder());
      int $i$f$filterNotTo = false;

      for(int var6 = 0; var6 < $this$filterNotTo$iv.length(); ++var6) {
         char element$iv = $this$filterNotTo$iv.charAt(var6);
         if (!(Boolean)predicate.invoke(element$iv)) {
            destination$iv.append(element$iv);
         }
      }

      return (CharSequence)destination$iv;
   }

   @NotNull
   public static final String filterNot(@NotNull String $this$filterNot, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterNot, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filterNot = false;
      CharSequence $this$filterNotTo$iv = (CharSequence)$this$filterNot;
      Appendable destination$iv = (Appendable)(new StringBuilder());
      int $i$f$filterNotTo = false;

      for(int var6 = 0; var6 < $this$filterNotTo$iv.length(); ++var6) {
         char element$iv = $this$filterNotTo$iv.charAt(var6);
         if (!(Boolean)predicate.invoke(element$iv)) {
            destination$iv.append(element$iv);
         }
      }

      return ((StringBuilder)destination$iv).toString();
   }

   @NotNull
   public static final <C extends Appendable> C filterNotTo(@NotNull CharSequence $this$filterNotTo, @NotNull C destination, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterNotTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filterNotTo = false;

      for(int var4 = 0; var4 < $this$filterNotTo.length(); ++var4) {
         char element = $this$filterNotTo.charAt(var4);
         if (!(Boolean)predicate.invoke(element)) {
            destination.append(element);
         }
      }

      return destination;
   }

   @NotNull
   public static final <C extends Appendable> C filterTo(@NotNull CharSequence $this$filterTo, @NotNull C destination, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filterTo = false;
      int index = 0;

      for(int var5 = $this$filterTo.length(); index < var5; ++index) {
         char element = $this$filterTo.charAt(index);
         if ((Boolean)predicate.invoke(element)) {
            destination.append(element);
         }
      }

      return destination;
   }

   @NotNull
   public static final CharSequence slice(@NotNull CharSequence $this$slice, @NotNull IntRange indices) {
      Intrinsics.checkNotNullParameter($this$slice, "<this>");
      Intrinsics.checkNotNullParameter(indices, "indices");
      return indices.isEmpty() ? (CharSequence)"" : StringsKt.subSequence($this$slice, indices);
   }

   @NotNull
   public static final String slice(@NotNull String $this$slice, @NotNull IntRange indices) {
      Intrinsics.checkNotNullParameter($this$slice, "<this>");
      Intrinsics.checkNotNullParameter(indices, "indices");
      return indices.isEmpty() ? "" : StringsKt.substring($this$slice, indices);
   }

   @NotNull
   public static final CharSequence slice(@NotNull CharSequence $this$slice, @NotNull Iterable<Integer> indices) {
      Intrinsics.checkNotNullParameter($this$slice, "<this>");
      Intrinsics.checkNotNullParameter(indices, "indices");
      int size = CollectionsKt.collectionSizeOrDefault(indices, 10);
      if (size == 0) {
         return (CharSequence)"";
      } else {
         StringBuilder result = new StringBuilder(size);
         Iterator var4 = indices.iterator();

         while(var4.hasNext()) {
            int i = ((Number)var4.next()).intValue();
            result.append($this$slice.charAt(i));
         }

         return (CharSequence)result;
      }
   }

   @InlineOnly
   private static final String slice(String $this$slice, Iterable<Integer> indices) {
      Intrinsics.checkNotNullParameter($this$slice, "<this>");
      Intrinsics.checkNotNullParameter(indices, "indices");
      return StringsKt.slice((CharSequence)$this$slice, indices).toString();
   }

   @NotNull
   public static final CharSequence take(@NotNull CharSequence $this$take, int n) {
      Intrinsics.checkNotNullParameter($this$take, "<this>");
      if (n < 0) {
         int var2 = false;
         String var3 = "Requested character count " + n + " is less than zero.";
         throw new IllegalArgumentException(var3.toString());
      } else {
         return $this$take.subSequence(0, RangesKt.coerceAtMost(n, $this$take.length()));
      }
   }

   @NotNull
   public static final String take(@NotNull String $this$take, int n) {
      Intrinsics.checkNotNullParameter($this$take, "<this>");
      if (n < 0) {
         int var5 = false;
         String var6 = "Requested character count " + n + " is less than zero.";
         throw new IllegalArgumentException(var6.toString());
      } else {
         byte var3 = 0;
         int var4 = RangesKt.coerceAtMost(n, $this$take.length());
         String var10000 = $this$take.substring(var3, var4);
         Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
         return var10000;
      }
   }

   @NotNull
   public static final CharSequence takeLast(@NotNull CharSequence $this$takeLast, int n) {
      Intrinsics.checkNotNullParameter($this$takeLast, "<this>");
      if (n < 0) {
         int var3 = false;
         String var4 = "Requested character count " + n + " is less than zero.";
         throw new IllegalArgumentException(var4.toString());
      } else {
         int length = $this$takeLast.length();
         return $this$takeLast.subSequence(length - RangesKt.coerceAtMost(n, length), length);
      }
   }

   @NotNull
   public static final String takeLast(@NotNull String $this$takeLast, int n) {
      Intrinsics.checkNotNullParameter($this$takeLast, "<this>");
      if (n < 0) {
         int var3 = false;
         String var5 = "Requested character count " + n + " is less than zero.";
         throw new IllegalArgumentException(var5.toString());
      } else {
         int length = $this$takeLast.length();
         int var4 = length - RangesKt.coerceAtMost(n, length);
         String var10000 = $this$takeLast.substring(var4);
         Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
         return var10000;
      }
   }

   @NotNull
   public static final CharSequence takeLastWhile(@NotNull CharSequence $this$takeLastWhile, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$takeLastWhile, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$takeLastWhile = false;

      for(int index = StringsKt.getLastIndex($this$takeLastWhile); -1 < index; --index) {
         if (!(Boolean)predicate.invoke($this$takeLastWhile.charAt(index))) {
            return $this$takeLastWhile.subSequence(index + 1, $this$takeLastWhile.length());
         }
      }

      return $this$takeLastWhile.subSequence(0, $this$takeLastWhile.length());
   }

   @NotNull
   public static final String takeLastWhile(@NotNull String $this$takeLastWhile, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$takeLastWhile, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$takeLastWhile = false;

      for(int index = StringsKt.getLastIndex((CharSequence)$this$takeLastWhile); -1 < index; --index) {
         if (!(Boolean)predicate.invoke($this$takeLastWhile.charAt(index))) {
            int var5 = index + 1;
            String var10000 = $this$takeLastWhile.substring(var5);
            Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
            return var10000;
         }
      }

      return $this$takeLastWhile;
   }

   @NotNull
   public static final CharSequence takeWhile(@NotNull CharSequence $this$takeWhile, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$takeWhile, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$takeWhile = false;
      int index = 0;

      for(int var4 = $this$takeWhile.length(); index < var4; ++index) {
         if (!(Boolean)predicate.invoke($this$takeWhile.charAt(index))) {
            return $this$takeWhile.subSequence(0, index);
         }
      }

      return $this$takeWhile.subSequence(0, $this$takeWhile.length());
   }

   @NotNull
   public static final String takeWhile(@NotNull String $this$takeWhile, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$takeWhile, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$takeWhile = false;
      int index = 0;

      for(int var4 = $this$takeWhile.length(); index < var4; ++index) {
         if (!(Boolean)predicate.invoke($this$takeWhile.charAt(index))) {
            byte var6 = 0;
            String var10000 = $this$takeWhile.substring(var6, index);
            Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
            return var10000;
         }
      }

      return $this$takeWhile;
   }

   @NotNull
   public static final CharSequence reversed(@NotNull CharSequence $this$reversed) {
      Intrinsics.checkNotNullParameter($this$reversed, "<this>");
      return (CharSequence)(new StringBuilder($this$reversed)).reverse();
   }

   @InlineOnly
   private static final String reversed(String $this$reversed) {
      Intrinsics.checkNotNullParameter($this$reversed, "<this>");
      return StringsKt.reversed((CharSequence)$this$reversed).toString();
   }

   @NotNull
   public static final <K, V> Map<K, V> associate(@NotNull CharSequence $this$associate, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
      Intrinsics.checkNotNullParameter($this$associate, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$associate = false;
      int capacity = RangesKt.coerceAtLeast(MapsKt.mapCapacity($this$associate.length()), 16);
      CharSequence $this$associateTo$iv = $this$associate;
      Map destination$iv = (Map)(new LinkedHashMap(capacity));
      int $i$f$associateTo = false;

      for(int var7 = 0; var7 < $this$associateTo$iv.length(); ++var7) {
         char element$iv = $this$associateTo$iv.charAt(var7);
         Pair var10 = (Pair)transform.invoke(element$iv);
         destination$iv.put(var10.getFirst(), var10.getSecond());
      }

      return destination$iv;
   }

   @NotNull
   public static final <K> Map<K, Character> associateBy(@NotNull CharSequence $this$associateBy, @NotNull Function1<? super Character, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter($this$associateBy, "<this>");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      int $i$f$associateBy = false;
      int capacity = RangesKt.coerceAtLeast(MapsKt.mapCapacity($this$associateBy.length()), 16);
      CharSequence $this$associateByTo$iv = $this$associateBy;
      Map destination$iv = (Map)(new LinkedHashMap(capacity));
      int $i$f$associateByTo = false;

      for(int var7 = 0; var7 < $this$associateByTo$iv.length(); ++var7) {
         char element$iv = $this$associateByTo$iv.charAt(var7);
         destination$iv.put(keySelector.invoke(element$iv), element$iv);
      }

      return destination$iv;
   }

   @NotNull
   public static final <K, V> Map<K, V> associateBy(@NotNull CharSequence $this$associateBy, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
      Intrinsics.checkNotNullParameter($this$associateBy, "<this>");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
      int $i$f$associateBy = false;
      int capacity = RangesKt.coerceAtLeast(MapsKt.mapCapacity($this$associateBy.length()), 16);
      CharSequence $this$associateByTo$iv = $this$associateBy;
      Map destination$iv = (Map)(new LinkedHashMap(capacity));
      int $i$f$associateByTo = false;

      for(int var8 = 0; var8 < $this$associateByTo$iv.length(); ++var8) {
         char element$iv = $this$associateByTo$iv.charAt(var8);
         destination$iv.put(keySelector.invoke(element$iv), valueTransform.invoke(element$iv));
      }

      return destination$iv;
   }

   @NotNull
   public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(@NotNull CharSequence $this$associateByTo, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter($this$associateByTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      int $i$f$associateByTo = false;

      for(int var4 = 0; var4 < $this$associateByTo.length(); ++var4) {
         char element = $this$associateByTo.charAt(var4);
         destination.put(keySelector.invoke(element), element);
      }

      return destination;
   }

   @NotNull
   public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull CharSequence $this$associateByTo, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
      Intrinsics.checkNotNullParameter($this$associateByTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
      int $i$f$associateByTo = false;

      for(int var5 = 0; var5 < $this$associateByTo.length(); ++var5) {
         char element = $this$associateByTo.charAt(var5);
         destination.put(keySelector.invoke(element), valueTransform.invoke(element));
      }

      return destination;
   }

   @NotNull
   public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull CharSequence $this$associateTo, @NotNull M destination, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
      Intrinsics.checkNotNullParameter($this$associateTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$associateTo = false;

      for(int var4 = 0; var4 < $this$associateTo.length(); ++var4) {
         char element = $this$associateTo.charAt(var4);
         Pair var7 = (Pair)transform.invoke(element);
         destination.put(var7.getFirst(), var7.getSecond());
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <V> Map<Character, V> associateWith(@NotNull CharSequence $this$associateWith, @NotNull Function1<? super Character, ? extends V> valueSelector) {
      Intrinsics.checkNotNullParameter($this$associateWith, "<this>");
      Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
      int $i$f$associateWith = false;
      LinkedHashMap result = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(RangesKt.coerceAtMost($this$associateWith.length(), 128)), 16));
      CharSequence $this$associateWithTo$iv = $this$associateWith;
      int $i$f$associateWithTo = false;

      for(int var6 = 0; var6 < $this$associateWithTo$iv.length(); ++var6) {
         char element$iv = $this$associateWithTo$iv.charAt(var6);
         ((Map)result).put(element$iv, valueSelector.invoke(element$iv));
      }

      return (Map)result;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <V, M extends Map<? super Character, ? super V>> M associateWithTo(@NotNull CharSequence $this$associateWithTo, @NotNull M destination, @NotNull Function1<? super Character, ? extends V> valueSelector) {
      Intrinsics.checkNotNullParameter($this$associateWithTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
      int $i$f$associateWithTo = false;

      for(int var4 = 0; var4 < $this$associateWithTo.length(); ++var4) {
         char element = $this$associateWithTo.charAt(var4);
         destination.put(element, valueSelector.invoke(element));
      }

      return destination;
   }

   @NotNull
   public static final <C extends Collection<? super Character>> C toCollection(@NotNull CharSequence $this$toCollection, @NotNull C destination) {
      Intrinsics.checkNotNullParameter($this$toCollection, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");

      for(int var2 = 0; var2 < $this$toCollection.length(); ++var2) {
         char item = $this$toCollection.charAt(var2);
         destination.add(item);
      }

      return destination;
   }

   @NotNull
   public static final HashSet<Character> toHashSet(@NotNull CharSequence $this$toHashSet) {
      Intrinsics.checkNotNullParameter($this$toHashSet, "<this>");
      return (HashSet)StringsKt.toCollection($this$toHashSet, (Collection)(new HashSet(MapsKt.mapCapacity(RangesKt.coerceAtMost($this$toHashSet.length(), 128)))));
   }

   @NotNull
   public static final List<Character> toList(@NotNull CharSequence $this$toList) {
      Intrinsics.checkNotNullParameter($this$toList, "<this>");
      List var10000;
      switch($this$toList.length()) {
      case 0:
         var10000 = CollectionsKt.emptyList();
         break;
      case 1:
         var10000 = CollectionsKt.listOf($this$toList.charAt(0));
         break;
      default:
         var10000 = StringsKt.toMutableList($this$toList);
      }

      return var10000;
   }

   @NotNull
   public static final List<Character> toMutableList(@NotNull CharSequence $this$toMutableList) {
      Intrinsics.checkNotNullParameter($this$toMutableList, "<this>");
      return (List)StringsKt.toCollection($this$toMutableList, (Collection)(new ArrayList($this$toMutableList.length())));
   }

   @NotNull
   public static final Set<Character> toSet(@NotNull CharSequence $this$toSet) {
      Intrinsics.checkNotNullParameter($this$toSet, "<this>");
      Set var10000;
      switch($this$toSet.length()) {
      case 0:
         var10000 = SetsKt.emptySet();
         break;
      case 1:
         var10000 = SetsKt.setOf($this$toSet.charAt(0));
         break;
      default:
         var10000 = (Set)StringsKt.toCollection($this$toSet, (Collection)(new LinkedHashSet(MapsKt.mapCapacity(RangesKt.coerceAtMost($this$toSet.length(), 128)))));
      }

      return var10000;
   }

   @NotNull
   public static final <R> List<R> flatMap(@NotNull CharSequence $this$flatMap, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMap, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$flatMap = false;
      CharSequence $this$flatMapTo$iv = $this$flatMap;
      Collection destination$iv = (Collection)(new ArrayList());
      int $i$f$flatMapTo = false;

      for(int var6 = 0; var6 < $this$flatMapTo$iv.length(); ++var6) {
         char element$iv = $this$flatMapTo$iv.charAt(var6);
         Iterable list$iv = (Iterable)transform.invoke(element$iv);
         CollectionsKt.addAll(destination$iv, list$iv);
      }

      return (List)destination$iv;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "flatMapIndexedIterable"
   )
   @InlineOnly
   private static final <R> List<R> flatMapIndexedIterable(CharSequence $this$flatMapIndexed, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapIndexed, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      CharSequence var2 = $this$flatMapIndexed;
      Collection var3 = (Collection)(new ArrayList());
      int var4 = 0;

      for(int var5 = 0; var5 < var2.length(); ++var5) {
         char var6 = var2.charAt(var5);
         CollectionsKt.addAll(var3, (Iterable)transform.invoke(var4++, var6));
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "flatMapIndexedIterableTo"
   )
   @InlineOnly
   private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(CharSequence $this$flatMapIndexedTo, C destination, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapIndexedTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int index = 0;

      for(int var4 = 0; var4 < $this$flatMapIndexedTo.length(); ++var4) {
         char element = $this$flatMapIndexedTo.charAt(var4);
         Iterable list = (Iterable)transform.invoke(index++, element);
         CollectionsKt.addAll(destination, list);
      }

      return destination;
   }

   @NotNull
   public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull CharSequence $this$flatMapTo, @NotNull C destination, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$flatMapTo = false;

      for(int var4 = 0; var4 < $this$flatMapTo.length(); ++var4) {
         char element = $this$flatMapTo.charAt(var4);
         Iterable list = (Iterable)transform.invoke(element);
         CollectionsKt.addAll(destination, list);
      }

      return destination;
   }

   @NotNull
   public static final <K> Map<K, List<Character>> groupBy(@NotNull CharSequence $this$groupBy, @NotNull Function1<? super Character, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter($this$groupBy, "<this>");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      int $i$f$groupBy = false;
      CharSequence $this$groupByTo$iv = $this$groupBy;
      Map destination$iv = (Map)(new LinkedHashMap());
      int $i$f$groupByTo = false;

      for(int var6 = 0; var6 < $this$groupByTo$iv.length(); ++var6) {
         char element$iv = $this$groupByTo$iv.charAt(var6);
         Object key$iv = keySelector.invoke(element$iv);
         int $i$f$getOrPut = false;
         Object value$iv$iv = destination$iv.get(key$iv);
         Object var10000;
         if (value$iv$iv == null) {
            int var12 = false;
            Object answer$iv$iv = (List)(new ArrayList());
            destination$iv.put(key$iv, answer$iv$iv);
            var10000 = answer$iv$iv;
         } else {
            var10000 = value$iv$iv;
         }

         List list$iv = (List)var10000;
         list$iv.add(element$iv);
      }

      return destination$iv;
   }

   @NotNull
   public static final <K, V> Map<K, List<V>> groupBy(@NotNull CharSequence $this$groupBy, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
      Intrinsics.checkNotNullParameter($this$groupBy, "<this>");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
      int $i$f$groupBy = false;
      CharSequence $this$groupByTo$iv = $this$groupBy;
      Map destination$iv = (Map)(new LinkedHashMap());
      int $i$f$groupByTo = false;

      for(int var7 = 0; var7 < $this$groupByTo$iv.length(); ++var7) {
         char element$iv = $this$groupByTo$iv.charAt(var7);
         Object key$iv = keySelector.invoke(element$iv);
         int $i$f$getOrPut = false;
         Object value$iv$iv = destination$iv.get(key$iv);
         Object var10000;
         if (value$iv$iv == null) {
            int var13 = false;
            Object answer$iv$iv = (List)(new ArrayList());
            destination$iv.put(key$iv, answer$iv$iv);
            var10000 = answer$iv$iv;
         } else {
            var10000 = value$iv$iv;
         }

         List list$iv = (List)var10000;
         list$iv.add(valueTransform.invoke(element$iv));
      }

      return destination$iv;
   }

   @NotNull
   public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(@NotNull CharSequence $this$groupByTo, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter($this$groupByTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      int $i$f$groupByTo = false;

      for(int var4 = 0; var4 < $this$groupByTo.length(); ++var4) {
         char element = $this$groupByTo.charAt(var4);
         Object key = keySelector.invoke(element);
         int $i$f$getOrPut = false;
         Object value$iv = destination.get(key);
         Object var10000;
         if (value$iv == null) {
            int var11 = false;
            Object answer$iv = (List)(new ArrayList());
            destination.put(key, answer$iv);
            var10000 = answer$iv;
         } else {
            var10000 = value$iv;
         }

         List list = (List)var10000;
         list.add(element);
      }

      return destination;
   }

   @NotNull
   public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull CharSequence $this$groupByTo, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
      Intrinsics.checkNotNullParameter($this$groupByTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
      int $i$f$groupByTo = false;

      for(int var5 = 0; var5 < $this$groupByTo.length(); ++var5) {
         char element = $this$groupByTo.charAt(var5);
         Object key = keySelector.invoke(element);
         int $i$f$getOrPut = false;
         Object value$iv = destination.get(key);
         Object var10000;
         if (value$iv == null) {
            int var12 = false;
            Object answer$iv = (List)(new ArrayList());
            destination.put(key, answer$iv);
            var10000 = answer$iv;
         } else {
            var10000 = value$iv;
         }

         List list = (List)var10000;
         list.add(valueTransform.invoke(element));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <K> Grouping<Character, K> groupingBy(@NotNull CharSequence $this$groupingBy, @NotNull Function1<? super Character, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter($this$groupingBy, "<this>");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      int $i$f$groupingBy = false;
      return (Grouping)(new Grouping<Character, K>() {
         public Iterator<Character> sourceIterator() {
            return (Iterator)StringsKt.iterator($this$groupingBy);
         }

         public K keyOf(char element) {
            return keySelector.invoke(element);
         }
      });
   }

   @NotNull
   public static final <R> List<R> map(@NotNull CharSequence $this$map, @NotNull Function1<? super Character, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$map, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$map = false;
      CharSequence $this$mapTo$iv = $this$map;
      Collection destination$iv = (Collection)(new ArrayList($this$map.length()));
      int $i$f$mapTo = false;

      for(int var6 = 0; var6 < $this$mapTo$iv.length(); ++var6) {
         char item$iv = $this$mapTo$iv.charAt(var6);
         destination$iv.add(transform.invoke(item$iv));
      }

      return (List)destination$iv;
   }

   @NotNull
   public static final <R> List<R> mapIndexed(@NotNull CharSequence $this$mapIndexed, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapIndexed, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapIndexed = false;
      CharSequence $this$mapIndexedTo$iv = $this$mapIndexed;
      Collection destination$iv = (Collection)(new ArrayList($this$mapIndexed.length()));
      int $i$f$mapIndexedTo = false;
      int index$iv = 0;

      for(int var7 = 0; var7 < $this$mapIndexedTo$iv.length(); ++var7) {
         char item$iv = $this$mapIndexedTo$iv.charAt(var7);
         destination$iv.add(transform.invoke(index$iv++, item$iv));
      }

      return (List)destination$iv;
   }

   @NotNull
   public static final <R> List<R> mapIndexedNotNull(@NotNull CharSequence $this$mapIndexedNotNull, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapIndexedNotNull, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapIndexedNotNull = false;
      Collection destination$iv = (Collection)(new ArrayList());
      int $i$f$mapIndexedNotNullTo = false;
      CharSequence $this$forEachIndexed$iv$iv = $this$mapIndexedNotNull;
      int $i$f$forEachIndexed = false;
      int index$iv$iv = 0;

      for(int var9 = 0; var9 < $this$forEachIndexed$iv$iv.length(); ++var9) {
         char item$iv$iv = $this$forEachIndexed$iv$iv.charAt(var9);
         int index$iv = index$iv$iv++;
         int var13 = false;
         Object var16 = transform.invoke(index$iv, item$iv$iv);
         if (var16 != null) {
            Object it$iv = var16;
            int var15 = false;
            destination$iv.add(it$iv);
         }
      }

      return (List)destination$iv;
   }

   @NotNull
   public static final <R, C extends Collection<? super R>> C mapIndexedNotNullTo(@NotNull CharSequence $this$mapIndexedNotNullTo, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapIndexedNotNullTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapIndexedNotNullTo = false;
      CharSequence $this$forEachIndexed$iv = $this$mapIndexedNotNullTo;
      int $i$f$forEachIndexed = false;
      int index$iv = 0;

      for(int var7 = 0; var7 < $this$forEachIndexed$iv.length(); ++var7) {
         char item$iv = $this$forEachIndexed$iv.charAt(var7);
         int index = index$iv++;
         int var11 = false;
         Object var14 = transform.invoke(index, item$iv);
         if (var14 != null) {
            Object it = var14;
            int var13 = false;
            destination.add(it);
         }
      }

      return destination;
   }

   @NotNull
   public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull CharSequence $this$mapIndexedTo, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapIndexedTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapIndexedTo = false;
      int index = 0;

      for(int var5 = 0; var5 < $this$mapIndexedTo.length(); ++var5) {
         char item = $this$mapIndexedTo.charAt(var5);
         destination.add(transform.invoke(index++, item));
      }

      return destination;
   }

   @NotNull
   public static final <R> List<R> mapNotNull(@NotNull CharSequence $this$mapNotNull, @NotNull Function1<? super Character, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapNotNull, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapNotNull = false;
      Collection destination$iv = (Collection)(new ArrayList());
      int $i$f$mapNotNullTo = false;
      CharSequence $this$forEach$iv$iv = $this$mapNotNull;
      int $i$f$forEach = false;

      for(int var8 = 0; var8 < $this$forEach$iv$iv.length(); ++var8) {
         char element$iv$iv = $this$forEach$iv$iv.charAt(var8);
         int var11 = false;
         Object var10000 = transform.invoke(element$iv$iv);
         if (var10000 != null) {
            Object it$iv = var10000;
            int var13 = false;
            destination$iv.add(it$iv);
         }
      }

      return (List)destination$iv;
   }

   @NotNull
   public static final <R, C extends Collection<? super R>> C mapNotNullTo(@NotNull CharSequence $this$mapNotNullTo, @NotNull C destination, @NotNull Function1<? super Character, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapNotNullTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapNotNullTo = false;
      CharSequence $this$forEach$iv = $this$mapNotNullTo;
      int $i$f$forEach = false;

      for(int var6 = 0; var6 < $this$forEach$iv.length(); ++var6) {
         char element$iv = $this$forEach$iv.charAt(var6);
         int var9 = false;
         Object var10000 = transform.invoke(element$iv);
         if (var10000 != null) {
            Object it = var10000;
            int var11 = false;
            destination.add(it);
         }
      }

      return destination;
   }

   @NotNull
   public static final <R, C extends Collection<? super R>> C mapTo(@NotNull CharSequence $this$mapTo, @NotNull C destination, @NotNull Function1<? super Character, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapTo = false;

      for(int var4 = 0; var4 < $this$mapTo.length(); ++var4) {
         char item = $this$mapTo.charAt(var4);
         destination.add(transform.invoke(item));
      }

      return destination;
   }

   @NotNull
   public static final Iterable<IndexedValue<Character>> withIndex(@NotNull CharSequence $this$withIndex) {
      Intrinsics.checkNotNullParameter($this$withIndex, "<this>");
      return (Iterable)(new IndexingIterable(StringsKt___StringsKt::withIndex$lambda$15$StringsKt___StringsKt));
   }

   public static final boolean all(@NotNull CharSequence $this$all, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$all, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$all = false;

      for(int var3 = 0; var3 < $this$all.length(); ++var3) {
         char element = $this$all.charAt(var3);
         if (!(Boolean)predicate.invoke(element)) {
            return false;
         }
      }

      return true;
   }

   public static final boolean any(@NotNull CharSequence $this$any) {
      Intrinsics.checkNotNullParameter($this$any, "<this>");
      return $this$any.length() != 0;
   }

   public static final boolean any(@NotNull CharSequence $this$any, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$any, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$any = false;

      for(int var3 = 0; var3 < $this$any.length(); ++var3) {
         char element = $this$any.charAt(var3);
         if ((Boolean)predicate.invoke(element)) {
            return true;
         }
      }

      return false;
   }

   @InlineOnly
   private static final int count(CharSequence $this$count) {
      Intrinsics.checkNotNullParameter($this$count, "<this>");
      return $this$count.length();
   }

   public static final int count(@NotNull CharSequence $this$count, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$count, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$count = false;
      int count = 0;

      for(int var4 = 0; var4 < $this$count.length(); ++var4) {
         char element = $this$count.charAt(var4);
         if ((Boolean)predicate.invoke(element)) {
            ++count;
         }
      }

      return count;
   }

   public static final <R> R fold(@NotNull CharSequence $this$fold, R initial, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$fold, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$fold = false;
      Object accumulator = initial;

      for(int var5 = 0; var5 < $this$fold.length(); ++var5) {
         char element = $this$fold.charAt(var5);
         accumulator = operation.invoke(accumulator, element);
      }

      return accumulator;
   }

   public static final <R> R foldIndexed(@NotNull CharSequence $this$foldIndexed, R initial, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$foldIndexed, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$foldIndexed = false;
      int index = 0;
      Object accumulator = initial;

      for(int var6 = 0; var6 < $this$foldIndexed.length(); ++var6) {
         char element = $this$foldIndexed.charAt(var6);
         accumulator = operation.invoke(index++, accumulator, element);
      }

      return accumulator;
   }

   public static final <R> R foldRight(@NotNull CharSequence $this$foldRight, R initial, @NotNull Function2<? super Character, ? super R, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$foldRight, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$foldRight = false;
      int index = StringsKt.getLastIndex($this$foldRight);

      Object accumulator;
      for(accumulator = initial; index >= 0; accumulator = operation.invoke($this$foldRight.charAt(index--), accumulator)) {
      }

      return accumulator;
   }

   public static final <R> R foldRightIndexed(@NotNull CharSequence $this$foldRightIndexed, R initial, @NotNull Function3<? super Integer, ? super Character, ? super R, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$foldRightIndexed, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$foldRightIndexed = false;
      int index = StringsKt.getLastIndex($this$foldRightIndexed);

      Object accumulator;
      for(accumulator = initial; index >= 0; --index) {
         accumulator = operation.invoke(index, $this$foldRightIndexed.charAt(index), accumulator);
      }

      return accumulator;
   }

   public static final void forEach(@NotNull CharSequence $this$forEach, @NotNull Function1<? super Character, Unit> action) {
      Intrinsics.checkNotNullParameter($this$forEach, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      int $i$f$forEach = false;

      for(int var3 = 0; var3 < $this$forEach.length(); ++var3) {
         char element = $this$forEach.charAt(var3);
         action.invoke(element);
      }

   }

   public static final void forEachIndexed(@NotNull CharSequence $this$forEachIndexed, @NotNull Function2<? super Integer, ? super Character, Unit> action) {
      Intrinsics.checkNotNullParameter($this$forEachIndexed, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      int $i$f$forEachIndexed = false;
      int index = 0;

      for(int var4 = 0; var4 < $this$forEachIndexed.length(); ++var4) {
         char item = $this$forEachIndexed.charAt(var4);
         action.invoke(index++, item);
      }

   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxOrThrow"
   )
   public static final char maxOrThrow(@NotNull CharSequence $this$max) {
      Intrinsics.checkNotNullParameter($this$max, "<this>");
      if ($this$max.length() == 0) {
         throw new NoSuchElementException();
      } else {
         char max = $this$max.charAt(0);
         int i = 1;
         int var3 = StringsKt.getLastIndex($this$max);
         if (i <= var3) {
            while(true) {
               char e = $this$max.charAt(i);
               if (Intrinsics.compare(max, e) < 0) {
                  max = e;
               }

               if (i == var3) {
                  break;
               }

               ++i;
            }
         }

         return max;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxByOrThrow"
   )
   public static final <R extends Comparable<? super R>> char maxByOrThrow(@NotNull CharSequence $this$maxBy, @NotNull Function1<? super Character, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$maxByOrThrow = false;
      if ($this$maxBy.length() == 0) {
         throw new NoSuchElementException();
      } else {
         char maxElem = $this$maxBy.charAt(0);
         int lastIndex = StringsKt.getLastIndex($this$maxBy);
         if (lastIndex == 0) {
            return maxElem;
         } else {
            Comparable maxValue = (Comparable)selector.invoke(maxElem);
            int i = 1;
            if (i <= lastIndex) {
               while(true) {
                  char e = $this$maxBy.charAt(i);
                  Comparable v = (Comparable)selector.invoke(e);
                  if (maxValue.compareTo(v) < 0) {
                     maxElem = e;
                     maxValue = v;
                  }

                  if (i == lastIndex) {
                     break;
                  }

                  ++i;
               }
            }

            return maxElem;
         }
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final <R extends Comparable<? super R>> Character maxByOrNull(@NotNull CharSequence $this$maxByOrNull, @NotNull Function1<? super Character, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxByOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$maxByOrNull = false;
      if ($this$maxByOrNull.length() == 0) {
         return null;
      } else {
         char maxElem = $this$maxByOrNull.charAt(0);
         int lastIndex = StringsKt.getLastIndex($this$maxByOrNull);
         if (lastIndex == 0) {
            return maxElem;
         } else {
            Comparable maxValue = (Comparable)selector.invoke(maxElem);
            int i = 1;
            if (i <= lastIndex) {
               while(true) {
                  char e = $this$maxByOrNull.charAt(i);
                  Comparable v = (Comparable)selector.invoke(e);
                  if (maxValue.compareTo(v) < 0) {
                     maxElem = e;
                     maxValue = v;
                  }

                  if (i == lastIndex) {
                     break;
                  }

                  ++i;
               }
            }

            return maxElem;
         }
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final double maxOf(CharSequence $this$maxOf, Function1<? super Character, Double> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if ($this$maxOf.length() == 0) {
         throw new NoSuchElementException();
      } else {
         double maxValue = ((Number)selector.invoke($this$maxOf.charAt(0))).doubleValue();
         int i = 1;
         int var5 = StringsKt.getLastIndex($this$maxOf);
         if (i <= var5) {
            while(true) {
               double v = ((Number)selector.invoke($this$maxOf.charAt(i))).doubleValue();
               maxValue = Math.max(maxValue, v);
               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final float maxOf(CharSequence $this$maxOf, Function1<? super Character, Float> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if ($this$maxOf.length() == 0) {
         throw new NoSuchElementException();
      } else {
         float maxValue = ((Number)selector.invoke($this$maxOf.charAt(0))).floatValue();
         int i = 1;
         int var4 = StringsKt.getLastIndex($this$maxOf);
         if (i <= var4) {
            while(true) {
               float v = ((Number)selector.invoke($this$maxOf.charAt(i))).floatValue();
               maxValue = Math.max(maxValue, v);
               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <R extends Comparable<? super R>> R maxOf(CharSequence $this$maxOf, Function1<? super Character, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if ($this$maxOf.length() == 0) {
         throw new NoSuchElementException();
      } else {
         Comparable maxValue = (Comparable)selector.invoke($this$maxOf.charAt(0));
         int i = 1;
         int var4 = StringsKt.getLastIndex($this$maxOf);
         if (i <= var4) {
            while(true) {
               Comparable v = (Comparable)selector.invoke($this$maxOf.charAt(i));
               if (maxValue.compareTo(v) < 0) {
                  maxValue = v;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final Double maxOfOrNull(CharSequence $this$maxOfOrNull, Function1<? super Character, Double> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if ($this$maxOfOrNull.length() == 0) {
         return null;
      } else {
         double maxValue = ((Number)selector.invoke($this$maxOfOrNull.charAt(0))).doubleValue();
         int i = 1;
         int var5 = StringsKt.getLastIndex($this$maxOfOrNull);
         if (i <= var5) {
            while(true) {
               double v = ((Number)selector.invoke($this$maxOfOrNull.charAt(i))).doubleValue();
               maxValue = Math.max(maxValue, v);
               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final Float maxOfOrNull(CharSequence $this$maxOfOrNull, Function1<? super Character, Float> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if ($this$maxOfOrNull.length() == 0) {
         return null;
      } else {
         float maxValue = ((Number)selector.invoke($this$maxOfOrNull.charAt(0))).floatValue();
         int i = 1;
         int var4 = StringsKt.getLastIndex($this$maxOfOrNull);
         if (i <= var4) {
            while(true) {
               float v = ((Number)selector.invoke($this$maxOfOrNull.charAt(i))).floatValue();
               maxValue = Math.max(maxValue, v);
               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <R extends Comparable<? super R>> R maxOfOrNull(CharSequence $this$maxOfOrNull, Function1<? super Character, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if ($this$maxOfOrNull.length() == 0) {
         return null;
      } else {
         Comparable maxValue = (Comparable)selector.invoke($this$maxOfOrNull.charAt(0));
         int i = 1;
         int var4 = StringsKt.getLastIndex($this$maxOfOrNull);
         if (i <= var4) {
            while(true) {
               Comparable v = (Comparable)selector.invoke($this$maxOfOrNull.charAt(i));
               if (maxValue.compareTo(v) < 0) {
                  maxValue = v;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <R> R maxOfWith(CharSequence $this$maxOfWith, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if ($this$maxOfWith.length() == 0) {
         throw new NoSuchElementException();
      } else {
         Object maxValue = selector.invoke($this$maxOfWith.charAt(0));
         int i = 1;
         int var5 = StringsKt.getLastIndex($this$maxOfWith);
         if (i <= var5) {
            while(true) {
               Object v = selector.invoke($this$maxOfWith.charAt(i));
               if (comparator.compare(maxValue, v) < 0) {
                  maxValue = v;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <R> R maxOfWithOrNull(CharSequence $this$maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfWithOrNull, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if ($this$maxOfWithOrNull.length() == 0) {
         return null;
      } else {
         Object maxValue = selector.invoke($this$maxOfWithOrNull.charAt(0));
         int i = 1;
         int var5 = StringsKt.getLastIndex($this$maxOfWithOrNull);
         if (i <= var5) {
            while(true) {
               Object v = selector.invoke($this$maxOfWithOrNull.charAt(i));
               if (comparator.compare(maxValue, v) < 0) {
                  maxValue = v;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final Character maxOrNull(@NotNull CharSequence $this$maxOrNull) {
      Intrinsics.checkNotNullParameter($this$maxOrNull, "<this>");
      if ($this$maxOrNull.length() == 0) {
         return null;
      } else {
         char max = $this$maxOrNull.charAt(0);
         int i = 1;
         int var3 = StringsKt.getLastIndex($this$maxOrNull);
         if (i <= var3) {
            while(true) {
               char e = $this$maxOrNull.charAt(i);
               if (Intrinsics.compare(max, e) < 0) {
                  max = e;
               }

               if (i == var3) {
                  break;
               }

               ++i;
            }
         }

         return max;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxWithOrThrow"
   )
   public static final char maxWithOrThrow(@NotNull CharSequence $this$maxWith, @NotNull Comparator<? super Character> comparator) {
      Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if ($this$maxWith.length() == 0) {
         throw new NoSuchElementException();
      } else {
         char max = $this$maxWith.charAt(0);
         int i = 1;
         int var4 = StringsKt.getLastIndex($this$maxWith);
         if (i <= var4) {
            while(true) {
               char e = $this$maxWith.charAt(i);
               if (comparator.compare(max, e) < 0) {
                  max = e;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return max;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final Character maxWithOrNull(@NotNull CharSequence $this$maxWithOrNull, @NotNull Comparator<? super Character> comparator) {
      Intrinsics.checkNotNullParameter($this$maxWithOrNull, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if ($this$maxWithOrNull.length() == 0) {
         return null;
      } else {
         char max = $this$maxWithOrNull.charAt(0);
         int i = 1;
         int var4 = StringsKt.getLastIndex($this$maxWithOrNull);
         if (i <= var4) {
            while(true) {
               char e = $this$maxWithOrNull.charAt(i);
               if (comparator.compare(max, e) < 0) {
                  max = e;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return max;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minOrThrow"
   )
   public static final char minOrThrow(@NotNull CharSequence $this$min) {
      Intrinsics.checkNotNullParameter($this$min, "<this>");
      if ($this$min.length() == 0) {
         throw new NoSuchElementException();
      } else {
         char min = $this$min.charAt(0);
         int i = 1;
         int var3 = StringsKt.getLastIndex($this$min);
         if (i <= var3) {
            while(true) {
               char e = $this$min.charAt(i);
               if (Intrinsics.compare(min, e) > 0) {
                  min = e;
               }

               if (i == var3) {
                  break;
               }

               ++i;
            }
         }

         return min;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minByOrThrow"
   )
   public static final <R extends Comparable<? super R>> char minByOrThrow(@NotNull CharSequence $this$minBy, @NotNull Function1<? super Character, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$minByOrThrow = false;
      if ($this$minBy.length() == 0) {
         throw new NoSuchElementException();
      } else {
         char minElem = $this$minBy.charAt(0);
         int lastIndex = StringsKt.getLastIndex($this$minBy);
         if (lastIndex == 0) {
            return minElem;
         } else {
            Comparable minValue = (Comparable)selector.invoke(minElem);
            int i = 1;
            if (i <= lastIndex) {
               while(true) {
                  char e = $this$minBy.charAt(i);
                  Comparable v = (Comparable)selector.invoke(e);
                  if (minValue.compareTo(v) > 0) {
                     minElem = e;
                     minValue = v;
                  }

                  if (i == lastIndex) {
                     break;
                  }

                  ++i;
               }
            }

            return minElem;
         }
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final <R extends Comparable<? super R>> Character minByOrNull(@NotNull CharSequence $this$minByOrNull, @NotNull Function1<? super Character, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minByOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$minByOrNull = false;
      if ($this$minByOrNull.length() == 0) {
         return null;
      } else {
         char minElem = $this$minByOrNull.charAt(0);
         int lastIndex = StringsKt.getLastIndex($this$minByOrNull);
         if (lastIndex == 0) {
            return minElem;
         } else {
            Comparable minValue = (Comparable)selector.invoke(minElem);
            int i = 1;
            if (i <= lastIndex) {
               while(true) {
                  char e = $this$minByOrNull.charAt(i);
                  Comparable v = (Comparable)selector.invoke(e);
                  if (minValue.compareTo(v) > 0) {
                     minElem = e;
                     minValue = v;
                  }

                  if (i == lastIndex) {
                     break;
                  }

                  ++i;
               }
            }

            return minElem;
         }
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final double minOf(CharSequence $this$minOf, Function1<? super Character, Double> selector) {
      Intrinsics.checkNotNullParameter($this$minOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if ($this$minOf.length() == 0) {
         throw new NoSuchElementException();
      } else {
         double minValue = ((Number)selector.invoke($this$minOf.charAt(0))).doubleValue();
         int i = 1;
         int var5 = StringsKt.getLastIndex($this$minOf);
         if (i <= var5) {
            while(true) {
               double v = ((Number)selector.invoke($this$minOf.charAt(i))).doubleValue();
               minValue = Math.min(minValue, v);
               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final float minOf(CharSequence $this$minOf, Function1<? super Character, Float> selector) {
      Intrinsics.checkNotNullParameter($this$minOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if ($this$minOf.length() == 0) {
         throw new NoSuchElementException();
      } else {
         float minValue = ((Number)selector.invoke($this$minOf.charAt(0))).floatValue();
         int i = 1;
         int var4 = StringsKt.getLastIndex($this$minOf);
         if (i <= var4) {
            while(true) {
               float v = ((Number)selector.invoke($this$minOf.charAt(i))).floatValue();
               minValue = Math.min(minValue, v);
               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <R extends Comparable<? super R>> R minOf(CharSequence $this$minOf, Function1<? super Character, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if ($this$minOf.length() == 0) {
         throw new NoSuchElementException();
      } else {
         Comparable minValue = (Comparable)selector.invoke($this$minOf.charAt(0));
         int i = 1;
         int var4 = StringsKt.getLastIndex($this$minOf);
         if (i <= var4) {
            while(true) {
               Comparable v = (Comparable)selector.invoke($this$minOf.charAt(i));
               if (minValue.compareTo(v) > 0) {
                  minValue = v;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final Double minOfOrNull(CharSequence $this$minOfOrNull, Function1<? super Character, Double> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if ($this$minOfOrNull.length() == 0) {
         return null;
      } else {
         double minValue = ((Number)selector.invoke($this$minOfOrNull.charAt(0))).doubleValue();
         int i = 1;
         int var5 = StringsKt.getLastIndex($this$minOfOrNull);
         if (i <= var5) {
            while(true) {
               double v = ((Number)selector.invoke($this$minOfOrNull.charAt(i))).doubleValue();
               minValue = Math.min(minValue, v);
               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final Float minOfOrNull(CharSequence $this$minOfOrNull, Function1<? super Character, Float> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if ($this$minOfOrNull.length() == 0) {
         return null;
      } else {
         float minValue = ((Number)selector.invoke($this$minOfOrNull.charAt(0))).floatValue();
         int i = 1;
         int var4 = StringsKt.getLastIndex($this$minOfOrNull);
         if (i <= var4) {
            while(true) {
               float v = ((Number)selector.invoke($this$minOfOrNull.charAt(i))).floatValue();
               minValue = Math.min(minValue, v);
               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <R extends Comparable<? super R>> R minOfOrNull(CharSequence $this$minOfOrNull, Function1<? super Character, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if ($this$minOfOrNull.length() == 0) {
         return null;
      } else {
         Comparable minValue = (Comparable)selector.invoke($this$minOfOrNull.charAt(0));
         int i = 1;
         int var4 = StringsKt.getLastIndex($this$minOfOrNull);
         if (i <= var4) {
            while(true) {
               Comparable v = (Comparable)selector.invoke($this$minOfOrNull.charAt(i));
               if (minValue.compareTo(v) > 0) {
                  minValue = v;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <R> R minOfWith(CharSequence $this$minOfWith, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if ($this$minOfWith.length() == 0) {
         throw new NoSuchElementException();
      } else {
         Object minValue = selector.invoke($this$minOfWith.charAt(0));
         int i = 1;
         int var5 = StringsKt.getLastIndex($this$minOfWith);
         if (i <= var5) {
            while(true) {
               Object v = selector.invoke($this$minOfWith.charAt(i));
               if (comparator.compare(minValue, v) > 0) {
                  minValue = v;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <R> R minOfWithOrNull(CharSequence $this$minOfWithOrNull, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfWithOrNull, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if ($this$minOfWithOrNull.length() == 0) {
         return null;
      } else {
         Object minValue = selector.invoke($this$minOfWithOrNull.charAt(0));
         int i = 1;
         int var5 = StringsKt.getLastIndex($this$minOfWithOrNull);
         if (i <= var5) {
            while(true) {
               Object v = selector.invoke($this$minOfWithOrNull.charAt(i));
               if (comparator.compare(minValue, v) > 0) {
                  minValue = v;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final Character minOrNull(@NotNull CharSequence $this$minOrNull) {
      Intrinsics.checkNotNullParameter($this$minOrNull, "<this>");
      if ($this$minOrNull.length() == 0) {
         return null;
      } else {
         char min = $this$minOrNull.charAt(0);
         int i = 1;
         int var3 = StringsKt.getLastIndex($this$minOrNull);
         if (i <= var3) {
            while(true) {
               char e = $this$minOrNull.charAt(i);
               if (Intrinsics.compare(min, e) > 0) {
                  min = e;
               }

               if (i == var3) {
                  break;
               }

               ++i;
            }
         }

         return min;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minWithOrThrow"
   )
   public static final char minWithOrThrow(@NotNull CharSequence $this$minWith, @NotNull Comparator<? super Character> comparator) {
      Intrinsics.checkNotNullParameter($this$minWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if ($this$minWith.length() == 0) {
         throw new NoSuchElementException();
      } else {
         char min = $this$minWith.charAt(0);
         int i = 1;
         int var4 = StringsKt.getLastIndex($this$minWith);
         if (i <= var4) {
            while(true) {
               char e = $this$minWith.charAt(i);
               if (comparator.compare(min, e) > 0) {
                  min = e;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return min;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final Character minWithOrNull(@NotNull CharSequence $this$minWithOrNull, @NotNull Comparator<? super Character> comparator) {
      Intrinsics.checkNotNullParameter($this$minWithOrNull, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if ($this$minWithOrNull.length() == 0) {
         return null;
      } else {
         char min = $this$minWithOrNull.charAt(0);
         int i = 1;
         int var4 = StringsKt.getLastIndex($this$minWithOrNull);
         if (i <= var4) {
            while(true) {
               char e = $this$minWithOrNull.charAt(i);
               if (comparator.compare(min, e) > 0) {
                  min = e;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return min;
      }
   }

   public static final boolean none(@NotNull CharSequence $this$none) {
      Intrinsics.checkNotNullParameter($this$none, "<this>");
      return $this$none.length() == 0;
   }

   public static final boolean none(@NotNull CharSequence $this$none, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$none, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$none = false;

      for(int var3 = 0; var3 < $this$none.length(); ++var3) {
         char element = $this$none.charAt(var3);
         if ((Boolean)predicate.invoke(element)) {
            return false;
         }
      }

      return true;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <S extends CharSequence> S onEach(@NotNull S $this$onEach, @NotNull Function1<? super Character, Unit> action) {
      Intrinsics.checkNotNullParameter($this$onEach, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      int $i$f$onEach = false;
      CharSequence $this$onEach_u24lambda_u2416 = $this$onEach;
      int var5 = false;

      for(int var6 = 0; var6 < $this$onEach_u24lambda_u2416.length(); ++var6) {
         char element = $this$onEach_u24lambda_u2416.charAt(var6);
         action.invoke(element);
      }

      return $this$onEach;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <S extends CharSequence> S onEachIndexed(@NotNull S $this$onEachIndexed, @NotNull Function2<? super Integer, ? super Character, Unit> action) {
      Intrinsics.checkNotNullParameter($this$onEachIndexed, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      int $i$f$onEachIndexed = false;
      int var5 = false;
      CharSequence $this$forEachIndexed$iv = $this$onEachIndexed;
      int $i$f$forEachIndexed = false;
      int index$iv = 0;

      for(int var9 = 0; var9 < $this$forEachIndexed$iv.length(); ++var9) {
         char item$iv = $this$forEachIndexed$iv.charAt(var9);
         action.invoke(index$iv++, item$iv);
      }

      return $this$onEachIndexed;
   }

   public static final char reduce(@NotNull CharSequence $this$reduce, @NotNull Function2<? super Character, ? super Character, Character> operation) {
      Intrinsics.checkNotNullParameter($this$reduce, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$reduce = false;
      if ($this$reduce.length() == 0) {
         throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
      } else {
         char accumulator = $this$reduce.charAt(0);
         int index = 1;
         int var5 = StringsKt.getLastIndex($this$reduce);
         if (index <= var5) {
            while(true) {
               accumulator = (Character)operation.invoke(accumulator, $this$reduce.charAt(index));
               if (index == var5) {
                  break;
               }

               ++index;
            }
         }

         return accumulator;
      }
   }

   public static final char reduceIndexed(@NotNull CharSequence $this$reduceIndexed, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
      Intrinsics.checkNotNullParameter($this$reduceIndexed, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$reduceIndexed = false;
      if ($this$reduceIndexed.length() == 0) {
         throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
      } else {
         char accumulator = $this$reduceIndexed.charAt(0);
         int index = 1;
         int var5 = StringsKt.getLastIndex($this$reduceIndexed);
         if (index <= var5) {
            while(true) {
               accumulator = (Character)operation.invoke(index, accumulator, $this$reduceIndexed.charAt(index));
               if (index == var5) {
                  break;
               }

               ++index;
            }
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final Character reduceIndexedOrNull(@NotNull CharSequence $this$reduceIndexedOrNull, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
      Intrinsics.checkNotNullParameter($this$reduceIndexedOrNull, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$reduceIndexedOrNull = false;
      if ($this$reduceIndexedOrNull.length() == 0) {
         return null;
      } else {
         char accumulator = $this$reduceIndexedOrNull.charAt(0);
         int index = 1;
         int var5 = StringsKt.getLastIndex($this$reduceIndexedOrNull);
         if (index <= var5) {
            while(true) {
               accumulator = (Character)operation.invoke(index, accumulator, $this$reduceIndexedOrNull.charAt(index));
               if (index == var5) {
                  break;
               }

               ++index;
            }
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final Character reduceOrNull(@NotNull CharSequence $this$reduceOrNull, @NotNull Function2<? super Character, ? super Character, Character> operation) {
      Intrinsics.checkNotNullParameter($this$reduceOrNull, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$reduceOrNull = false;
      if ($this$reduceOrNull.length() == 0) {
         return null;
      } else {
         char accumulator = $this$reduceOrNull.charAt(0);
         int index = 1;
         int var5 = StringsKt.getLastIndex($this$reduceOrNull);
         if (index <= var5) {
            while(true) {
               accumulator = (Character)operation.invoke(accumulator, $this$reduceOrNull.charAt(index));
               if (index == var5) {
                  break;
               }

               ++index;
            }
         }

         return accumulator;
      }
   }

   public static final char reduceRight(@NotNull CharSequence $this$reduceRight, @NotNull Function2<? super Character, ? super Character, Character> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRight, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$reduceRight = false;
      int index = StringsKt.getLastIndex($this$reduceRight);
      if (index < 0) {
         throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
      } else {
         char accumulator;
         for(accumulator = $this$reduceRight.charAt(index--); index >= 0; accumulator = (Character)operation.invoke($this$reduceRight.charAt(index--), accumulator)) {
         }

         return accumulator;
      }
   }

   public static final char reduceRightIndexed(@NotNull CharSequence $this$reduceRightIndexed, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRightIndexed, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$reduceRightIndexed = false;
      int index = StringsKt.getLastIndex($this$reduceRightIndexed);
      if (index < 0) {
         throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
      } else {
         char accumulator;
         for(accumulator = $this$reduceRightIndexed.charAt(index--); index >= 0; --index) {
            accumulator = (Character)operation.invoke(index, $this$reduceRightIndexed.charAt(index), accumulator);
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final Character reduceRightIndexedOrNull(@NotNull CharSequence $this$reduceRightIndexedOrNull, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRightIndexedOrNull, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$reduceRightIndexedOrNull = false;
      int index = StringsKt.getLastIndex($this$reduceRightIndexedOrNull);
      if (index < 0) {
         return null;
      } else {
         char accumulator;
         for(accumulator = $this$reduceRightIndexedOrNull.charAt(index--); index >= 0; --index) {
            accumulator = (Character)operation.invoke(index, $this$reduceRightIndexedOrNull.charAt(index), accumulator);
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final Character reduceRightOrNull(@NotNull CharSequence $this$reduceRightOrNull, @NotNull Function2<? super Character, ? super Character, Character> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRightOrNull, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$reduceRightOrNull = false;
      int index = StringsKt.getLastIndex($this$reduceRightOrNull);
      if (index < 0) {
         return null;
      } else {
         char accumulator;
         for(accumulator = $this$reduceRightOrNull.charAt(index--); index >= 0; accumulator = (Character)operation.invoke($this$reduceRightOrNull.charAt(index--), accumulator)) {
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <R> List<R> runningFold(@NotNull CharSequence $this$runningFold, R initial, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$runningFold, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$runningFold = false;
      if ($this$runningFold.length() == 0) {
         return CollectionsKt.listOf(initial);
      } else {
         ArrayList var5 = new ArrayList($this$runningFold.length() + 1);
         int var7 = false;
         var5.add(initial);
         ArrayList result = var5;
         Object accumulator = initial;

         for(int var6 = 0; var6 < $this$runningFold.length(); ++var6) {
            char element = $this$runningFold.charAt(var6);
            accumulator = operation.invoke(accumulator, element);
            result.add(accumulator);
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <R> List<R> runningFoldIndexed(@NotNull CharSequence $this$runningFoldIndexed, R initial, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$runningFoldIndexed, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$runningFoldIndexed = false;
      if ($this$runningFoldIndexed.length() == 0) {
         return CollectionsKt.listOf(initial);
      } else {
         ArrayList var5 = new ArrayList($this$runningFoldIndexed.length() + 1);
         int var7 = false;
         var5.add(initial);
         ArrayList result = var5;
         Object accumulator = initial;
         int index = 0;

         for(int var9 = $this$runningFoldIndexed.length(); index < var9; ++index) {
            accumulator = operation.invoke(index, accumulator, $this$runningFoldIndexed.charAt(index));
            result.add(accumulator);
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final List<Character> runningReduce(@NotNull CharSequence $this$runningReduce, @NotNull Function2<? super Character, ? super Character, Character> operation) {
      Intrinsics.checkNotNullParameter($this$runningReduce, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$runningReduce = false;
      if ($this$runningReduce.length() == 0) {
         return CollectionsKt.emptyList();
      } else {
         char accumulator = false;
         char accumulator = $this$runningReduce.charAt(0);
         ArrayList var5 = new ArrayList($this$runningReduce.length());
         int var7 = false;
         var5.add(accumulator);
         ArrayList result = var5;
         int index = 1;

         for(int var6 = $this$runningReduce.length(); index < var6; ++index) {
            accumulator = (Character)operation.invoke(accumulator, $this$runningReduce.charAt(index));
            result.add(accumulator);
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final List<Character> runningReduceIndexed(@NotNull CharSequence $this$runningReduceIndexed, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
      Intrinsics.checkNotNullParameter($this$runningReduceIndexed, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$runningReduceIndexed = false;
      if ($this$runningReduceIndexed.length() == 0) {
         return CollectionsKt.emptyList();
      } else {
         char accumulator = false;
         char accumulator = $this$runningReduceIndexed.charAt(0);
         ArrayList var5 = new ArrayList($this$runningReduceIndexed.length());
         int var7 = false;
         var5.add(accumulator);
         ArrayList result = var5;
         int index = 1;

         for(int var6 = $this$runningReduceIndexed.length(); index < var6; ++index) {
            accumulator = (Character)operation.invoke(index, accumulator, $this$runningReduceIndexed.charAt(index));
            result.add(accumulator);
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <R> List<R> scan(@NotNull CharSequence $this$scan, R initial, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$scan, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$scan = false;
      CharSequence $this$runningFold$iv = $this$scan;
      int $i$f$runningFold = false;
      List var10000;
      if ($this$scan.length() == 0) {
         var10000 = CollectionsKt.listOf(initial);
      } else {
         ArrayList var6 = new ArrayList($this$scan.length() + 1);
         int var8 = false;
         var6.add(initial);
         ArrayList result$iv = var6;
         Object accumulator$iv = initial;

         for(int var7 = 0; var7 < $this$runningFold$iv.length(); ++var7) {
            char element$iv = $this$runningFold$iv.charAt(var7);
            accumulator$iv = operation.invoke(accumulator$iv, element$iv);
            result$iv.add(accumulator$iv);
         }

         var10000 = (List)result$iv;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <R> List<R> scanIndexed(@NotNull CharSequence $this$scanIndexed, R initial, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$scanIndexed, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$scanIndexed = false;
      CharSequence $this$runningFoldIndexed$iv = $this$scanIndexed;
      int $i$f$runningFoldIndexed = false;
      List var10000;
      if ($this$scanIndexed.length() == 0) {
         var10000 = CollectionsKt.listOf(initial);
      } else {
         ArrayList var6 = new ArrayList($this$scanIndexed.length() + 1);
         int var8 = false;
         var6.add(initial);
         ArrayList result$iv = var6;
         Object accumulator$iv = initial;
         int index$iv = 0;

         for(int var11 = $this$scanIndexed.length(); index$iv < var11; ++index$iv) {
            accumulator$iv = operation.invoke(index$iv, accumulator$iv, $this$runningFoldIndexed$iv.charAt(index$iv));
            result$iv.add(accumulator$iv);
         }

         var10000 = (List)result$iv;
      }

      return var10000;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use sumOf instead.",
      replaceWith = @ReplaceWith(
   expression = "this.sumOf(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5"
   )
   public static final int sumBy(@NotNull CharSequence $this$sumBy, @NotNull Function1<? super Character, Integer> selector) {
      Intrinsics.checkNotNullParameter($this$sumBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$sumBy = false;
      int sum = 0;

      for(int var4 = 0; var4 < $this$sumBy.length(); ++var4) {
         char element = $this$sumBy.charAt(var4);
         sum += ((Number)selector.invoke(element)).intValue();
      }

      return sum;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use sumOf instead.",
      replaceWith = @ReplaceWith(
   expression = "this.sumOf(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5"
   )
   public static final double sumByDouble(@NotNull CharSequence $this$sumByDouble, @NotNull Function1<? super Character, Double> selector) {
      Intrinsics.checkNotNullParameter($this$sumByDouble, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$sumByDouble = false;
      double sum = 0.0D;

      for(int var5 = 0; var5 < $this$sumByDouble.length(); ++var5) {
         char element = $this$sumByDouble.charAt(var5);
         sum += ((Number)selector.invoke(element)).doubleValue();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfDouble"
   )
   @InlineOnly
   private static final double sumOfDouble(CharSequence $this$sumOf, Function1<? super Character, Double> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      double sum = 0.0D;

      for(int var4 = 0; var4 < $this$sumOf.length(); ++var4) {
         char element = $this$sumOf.charAt(var4);
         sum += ((Number)selector.invoke(element)).doubleValue();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @JvmName(
      name = "sumOfInt"
   )
   @InlineOnly
   private static final int sumOfInt(CharSequence $this$sumOf, Function1<? super Character, Integer> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int sum = 0;

      for(int var3 = 0; var3 < $this$sumOf.length(); ++var3) {
         char element = $this$sumOf.charAt(var3);
         sum += ((Number)selector.invoke(element)).intValue();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfLong"
   )
   @InlineOnly
   private static final long sumOfLong(CharSequence $this$sumOf, Function1<? super Character, Long> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      long sum = 0L;

      for(int var4 = 0; var4 < $this$sumOf.length(); ++var4) {
         char element = $this$sumOf.charAt(var4);
         sum += ((Number)selector.invoke(element)).longValue();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @JvmName(
      name = "sumOfUInt"
   )
   @InlineOnly
   private static final int sumOfUInt(CharSequence $this$sumOf, Function1<? super Character, UInt> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int sum = UInt.constructor-impl(0);

      for(int var3 = 0; var3 < $this$sumOf.length(); ++var3) {
         char element = $this$sumOf.charAt(var3);
         sum = UInt.constructor-impl(sum + ((UInt)selector.invoke(element)).unbox-impl());
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfULong"
   )
   @InlineOnly
   private static final long sumOfULong(CharSequence $this$sumOf, Function1<? super Character, ULong> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      long sum = ULong.constructor-impl(0L);

      for(int var4 = 0; var4 < $this$sumOf.length(); ++var4) {
         char element = $this$sumOf.charAt(var4);
         sum = ULong.constructor-impl(sum + ((ULong)selector.invoke(element)).unbox-impl());
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final List<String> chunked(@NotNull CharSequence $this$chunked, int size) {
      Intrinsics.checkNotNullParameter($this$chunked, "<this>");
      return StringsKt.windowed($this$chunked, size, size, true);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <R> List<R> chunked(@NotNull CharSequence $this$chunked, int size, @NotNull Function1<? super CharSequence, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$chunked, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      return StringsKt.windowed($this$chunked, size, size, true, transform);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final Sequence<String> chunkedSequence(@NotNull CharSequence $this$chunkedSequence, int size) {
      Intrinsics.checkNotNullParameter($this$chunkedSequence, "<this>");
      return StringsKt.chunkedSequence($this$chunkedSequence, size, StringsKt___StringsKt::chunkedSequence$lambda$22$StringsKt___StringsKt);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <R> Sequence<R> chunkedSequence(@NotNull CharSequence $this$chunkedSequence, int size, @NotNull Function1<? super CharSequence, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$chunkedSequence, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      return StringsKt.windowedSequence($this$chunkedSequence, size, size, true, transform);
   }

   @NotNull
   public static final Pair<CharSequence, CharSequence> partition(@NotNull CharSequence $this$partition, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$partition, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$partition = false;
      StringBuilder first = new StringBuilder();
      StringBuilder second = new StringBuilder();

      for(int var5 = 0; var5 < $this$partition.length(); ++var5) {
         char element = $this$partition.charAt(var5);
         if ((Boolean)predicate.invoke(element)) {
            first.append(element);
         } else {
            second.append(element);
         }
      }

      return new Pair(first, second);
   }

   @NotNull
   public static final Pair<String, String> partition(@NotNull String $this$partition, @NotNull Function1<? super Character, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$partition, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$partition = false;
      StringBuilder first = new StringBuilder();
      StringBuilder second = new StringBuilder();
      int var5 = 0;

      for(int var6 = $this$partition.length(); var5 < var6; ++var5) {
         char element = $this$partition.charAt(var5);
         if ((Boolean)predicate.invoke(element)) {
            first.append(element);
         } else {
            second.append(element);
         }
      }

      return new Pair(first.toString(), second.toString());
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final List<String> windowed(@NotNull CharSequence $this$windowed, int size, int step, boolean partialWindows) {
      Intrinsics.checkNotNullParameter($this$windowed, "<this>");
      return StringsKt.windowed($this$windowed, size, step, partialWindows, StringsKt___StringsKt::windowed$lambda$23$StringsKt___StringsKt);
   }

   // $FF: synthetic method
   public static List windowed$default(CharSequence var0, int var1, int var2, boolean var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 1;
      }

      if ((var4 & 4) != 0) {
         var3 = false;
      }

      return StringsKt.windowed(var0, var1, var2, var3);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <R> List<R> windowed(@NotNull CharSequence $this$windowed, int size, int step, boolean partialWindows, @NotNull Function1<? super CharSequence, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$windowed, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      SlidingWindowKt.checkWindowSizeStep(size, step);
      int thisSize = $this$windowed.length();
      int resultCapacity = thisSize / step + (thisSize % step == 0 ? 0 : 1);
      ArrayList result = new ArrayList(resultCapacity);

      for(int index = 0; 0 <= index ? index < thisSize : false; index += step) {
         int end = index + size;
         int var10000;
         if (end >= 0 && end <= thisSize) {
            var10000 = end;
         } else {
            if (!partialWindows) {
               break;
            }

            var10000 = thisSize;
         }

         int coercedEnd = var10000;
         result.add(transform.invoke($this$windowed.subSequence(index, coercedEnd)));
      }

      return (List)result;
   }

   // $FF: synthetic method
   public static List windowed$default(CharSequence var0, int var1, int var2, boolean var3, Function1 var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var2 = 1;
      }

      if ((var5 & 4) != 0) {
         var3 = false;
      }

      return StringsKt.windowed(var0, var1, var2, var3, var4);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final Sequence<String> windowedSequence(@NotNull CharSequence $this$windowedSequence, int size, int step, boolean partialWindows) {
      Intrinsics.checkNotNullParameter($this$windowedSequence, "<this>");
      return StringsKt.windowedSequence($this$windowedSequence, size, step, partialWindows, StringsKt___StringsKt::windowedSequence$lambda$24$StringsKt___StringsKt);
   }

   // $FF: synthetic method
   public static Sequence windowedSequence$default(CharSequence var0, int var1, int var2, boolean var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 1;
      }

      if ((var4 & 4) != 0) {
         var3 = false;
      }

      return StringsKt.windowedSequence(var0, var1, var2, var3);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <R> Sequence<R> windowedSequence(@NotNull CharSequence $this$windowedSequence, int size, int step, boolean partialWindows, @NotNull Function1<? super CharSequence, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$windowedSequence, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      SlidingWindowKt.checkWindowSizeStep(size, step);
      IntProgression windows = RangesKt.step((IntProgression)(partialWindows ? StringsKt.getIndices($this$windowedSequence) : RangesKt.until(0, $this$windowedSequence.length() - size + 1)), step);
      return SequencesKt.map(CollectionsKt.asSequence((Iterable)windows), StringsKt___StringsKt::windowedSequence$lambda$25$StringsKt___StringsKt);
   }

   // $FF: synthetic method
   public static Sequence windowedSequence$default(CharSequence var0, int var1, int var2, boolean var3, Function1 var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var2 = 1;
      }

      if ((var5 & 4) != 0) {
         var3 = false;
      }

      return StringsKt.windowedSequence(var0, var1, var2, var3, var4);
   }

   @NotNull
   public static final List<Pair<Character, Character>> zip(@NotNull CharSequence $this$zip, @NotNull CharSequence other) {
      Intrinsics.checkNotNullParameter($this$zip, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      CharSequence $this$zip$iv = $this$zip;
      int $i$f$zip = false;
      int length$iv = Math.min($this$zip.length(), other.length());
      ArrayList list$iv = new ArrayList(length$iv);

      for(int i$iv = 0; i$iv < length$iv; ++i$iv) {
         char var10001 = $this$zip$iv.charAt(i$iv);
         char c2 = other.charAt(i$iv);
         char c1 = var10001;
         int var9 = false;
         list$iv.add(TuplesKt.to(c1, c2));
      }

      return (List)list$iv;
   }

   @NotNull
   public static final <V> List<V> zip(@NotNull CharSequence $this$zip, @NotNull CharSequence other, @NotNull Function2<? super Character, ? super Character, ? extends V> transform) {
      Intrinsics.checkNotNullParameter($this$zip, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$zip = false;
      int length = Math.min($this$zip.length(), other.length());
      ArrayList list = new ArrayList(length);

      for(int i = 0; i < length; ++i) {
         list.add(transform.invoke($this$zip.charAt(i), other.charAt(i)));
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final List<Pair<Character, Character>> zipWithNext(@NotNull CharSequence $this$zipWithNext) {
      Intrinsics.checkNotNullParameter($this$zipWithNext, "<this>");
      CharSequence $this$zipWithNext$iv = $this$zipWithNext;
      int $i$f$zipWithNext = false;
      int size$iv = $this$zipWithNext.length() - 1;
      List var10000;
      if (size$iv < 1) {
         var10000 = CollectionsKt.emptyList();
      } else {
         ArrayList result$iv = new ArrayList(size$iv);

         for(int index$iv = 0; index$iv < size$iv; ++index$iv) {
            char var10001 = $this$zipWithNext$iv.charAt(index$iv);
            char b = $this$zipWithNext$iv.charAt(index$iv + 1);
            char a = var10001;
            int var8 = false;
            result$iv.add(TuplesKt.to(a, b));
         }

         var10000 = (List)result$iv;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <R> List<R> zipWithNext(@NotNull CharSequence $this$zipWithNext, @NotNull Function2<? super Character, ? super Character, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$zipWithNext, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$zipWithNext = false;
      int size = $this$zipWithNext.length() - 1;
      if (size < 1) {
         return CollectionsKt.emptyList();
      } else {
         ArrayList result = new ArrayList(size);

         for(int index = 0; index < size; ++index) {
            result.add(transform.invoke($this$zipWithNext.charAt(index), $this$zipWithNext.charAt(index + 1)));
         }

         return (List)result;
      }
   }

   @NotNull
   public static final Iterable<Character> asIterable(@NotNull CharSequence $this$asIterable) {
      Intrinsics.checkNotNullParameter($this$asIterable, "<this>");
      return $this$asIterable instanceof String && $this$asIterable.length() == 0 ? (Iterable)CollectionsKt.emptyList() : (Iterable)(new StringsKt___StringsKt$asIterable$$inlined$Iterable$1($this$asIterable));
   }

   @NotNull
   public static final Sequence<Character> asSequence(@NotNull CharSequence $this$asSequence) {
      Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
      return $this$asSequence instanceof String && $this$asSequence.length() == 0 ? SequencesKt.emptySequence() : (Sequence)(new StringsKt___StringsKt$asSequence$$inlined$Sequence$1($this$asSequence));
   }

   private static final Iterator withIndex$lambda$15$StringsKt___StringsKt(CharSequence $this_withIndex) {
      return (Iterator)StringsKt.iterator($this_withIndex);
   }

   private static final String chunkedSequence$lambda$22$StringsKt___StringsKt(CharSequence it) {
      Intrinsics.checkNotNullParameter(it, "it");
      return it.toString();
   }

   private static final String windowed$lambda$23$StringsKt___StringsKt(CharSequence it) {
      Intrinsics.checkNotNullParameter(it, "it");
      return it.toString();
   }

   private static final String windowedSequence$lambda$24$StringsKt___StringsKt(CharSequence it) {
      Intrinsics.checkNotNullParameter(it, "it");
      return it.toString();
   }

   private static final Object windowedSequence$lambda$25$StringsKt___StringsKt(int $size, CharSequence $this_windowedSequence, Function1 $transform, int index) {
      int end = index + $size;
      int coercedEnd = end >= 0 && end <= $this_windowedSequence.length() ? end : $this_windowedSequence.length();
      return $transform.invoke($this_windowedSequence.subSequence(index, coercedEnd));
   }

   public StringsKt___StringsKt() {
   }
}
