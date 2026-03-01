package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class RangesKt___RangesKt extends RangesKt__RangesKt {
   @SinceKotlin(
      version = "1.7"
   )
   public static final int first(@NotNull IntProgression $this$first) {
      Intrinsics.checkNotNullParameter($this$first, "<this>");
      if ($this$first.isEmpty()) {
         throw new NoSuchElementException("Progression " + $this$first + " is empty.");
      } else {
         return $this$first.getFirst();
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   public static final long first(@NotNull LongProgression $this$first) {
      Intrinsics.checkNotNullParameter($this$first, "<this>");
      if ($this$first.isEmpty()) {
         throw new NoSuchElementException("Progression " + $this$first + " is empty.");
      } else {
         return $this$first.getFirst();
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   public static final char first(@NotNull CharProgression $this$first) {
      Intrinsics.checkNotNullParameter($this$first, "<this>");
      if ($this$first.isEmpty()) {
         throw new NoSuchElementException("Progression " + $this$first + " is empty.");
      } else {
         return $this$first.getFirst();
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @Nullable
   public static final Integer firstOrNull(@NotNull IntProgression $this$firstOrNull) {
      Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
      return $this$firstOrNull.isEmpty() ? null : $this$firstOrNull.getFirst();
   }

   @SinceKotlin(
      version = "1.7"
   )
   @Nullable
   public static final Long firstOrNull(@NotNull LongProgression $this$firstOrNull) {
      Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
      return $this$firstOrNull.isEmpty() ? null : $this$firstOrNull.getFirst();
   }

   @SinceKotlin(
      version = "1.7"
   )
   @Nullable
   public static final Character firstOrNull(@NotNull CharProgression $this$firstOrNull) {
      Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
      return $this$firstOrNull.isEmpty() ? null : $this$firstOrNull.getFirst();
   }

   @SinceKotlin(
      version = "1.7"
   )
   public static final int last(@NotNull IntProgression $this$last) {
      Intrinsics.checkNotNullParameter($this$last, "<this>");
      if ($this$last.isEmpty()) {
         throw new NoSuchElementException("Progression " + $this$last + " is empty.");
      } else {
         return $this$last.getLast();
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   public static final long last(@NotNull LongProgression $this$last) {
      Intrinsics.checkNotNullParameter($this$last, "<this>");
      if ($this$last.isEmpty()) {
         throw new NoSuchElementException("Progression " + $this$last + " is empty.");
      } else {
         return $this$last.getLast();
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   public static final char last(@NotNull CharProgression $this$last) {
      Intrinsics.checkNotNullParameter($this$last, "<this>");
      if ($this$last.isEmpty()) {
         throw new NoSuchElementException("Progression " + $this$last + " is empty.");
      } else {
         return $this$last.getLast();
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @Nullable
   public static final Integer lastOrNull(@NotNull IntProgression $this$lastOrNull) {
      Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
      return $this$lastOrNull.isEmpty() ? null : $this$lastOrNull.getLast();
   }

   @SinceKotlin(
      version = "1.7"
   )
   @Nullable
   public static final Long lastOrNull(@NotNull LongProgression $this$lastOrNull) {
      Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
      return $this$lastOrNull.isEmpty() ? null : $this$lastOrNull.getLast();
   }

   @SinceKotlin(
      version = "1.7"
   )
   @Nullable
   public static final Character lastOrNull(@NotNull CharProgression $this$lastOrNull) {
      Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
      return $this$lastOrNull.isEmpty() ? null : $this$lastOrNull.getLast();
   }

   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final int random(IntRange $this$random) {
      Intrinsics.checkNotNullParameter($this$random, "<this>");
      return RangesKt.random($this$random, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final long random(LongRange $this$random) {
      Intrinsics.checkNotNullParameter($this$random, "<this>");
      return RangesKt.random($this$random, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final char random(CharRange $this$random) {
      Intrinsics.checkNotNullParameter($this$random, "<this>");
      return RangesKt.random($this$random, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.3"
   )
   public static final int random(@NotNull IntRange $this$random, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$random, "<this>");
      Intrinsics.checkNotNullParameter(random, "random");

      try {
         return RandomKt.nextInt(random, $this$random);
      } catch (IllegalArgumentException var3) {
         throw new NoSuchElementException(var3.getMessage());
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   public static final long random(@NotNull LongRange $this$random, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$random, "<this>");
      Intrinsics.checkNotNullParameter(random, "random");

      try {
         return RandomKt.nextLong(random, $this$random);
      } catch (IllegalArgumentException var3) {
         throw new NoSuchElementException(var3.getMessage());
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   public static final char random(@NotNull CharRange $this$random, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$random, "<this>");
      Intrinsics.checkNotNullParameter(random, "random");

      try {
         return (char)random.nextInt($this$random.getFirst(), $this$random.getLast() + 1);
      } catch (IllegalArgumentException var3) {
         throw new NoSuchElementException(var3.getMessage());
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final Integer randomOrNull(IntRange $this$randomOrNull) {
      Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
      return RangesKt.randomOrNull($this$randomOrNull, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final Long randomOrNull(LongRange $this$randomOrNull) {
      Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
      return RangesKt.randomOrNull($this$randomOrNull, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final Character randomOrNull(CharRange $this$randomOrNull) {
      Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
      return RangesKt.randomOrNull($this$randomOrNull, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final Integer randomOrNull(@NotNull IntRange $this$randomOrNull, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
      Intrinsics.checkNotNullParameter(random, "random");
      return $this$randomOrNull.isEmpty() ? null : RandomKt.nextInt(random, $this$randomOrNull);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final Long randomOrNull(@NotNull LongRange $this$randomOrNull, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
      Intrinsics.checkNotNullParameter(random, "random");
      return $this$randomOrNull.isEmpty() ? null : RandomKt.nextLong(random, $this$randomOrNull);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final Character randomOrNull(@NotNull CharRange $this$randomOrNull, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
      Intrinsics.checkNotNullParameter(random, "random");
      return $this$randomOrNull.isEmpty() ? null : (char)random.nextInt($this$randomOrNull.getFirst(), $this$randomOrNull.getLast() + 1);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final boolean contains(IntRange $this$contains, Integer element) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return element != null && $this$contains.contains(element);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final boolean contains(LongRange $this$contains, Long element) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return element != null && $this$contains.contains(element);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final boolean contains(CharRange $this$contains, Character element) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return element != null && $this$contains.contains(element);
   }

   @JvmName(
      name = "intRangeContains"
   )
   public static final boolean intRangeContains(@NotNull ClosedRange<Integer> $this$contains, byte value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)Integer.valueOf(value));
   }

   @JvmName(
      name = "longRangeContains"
   )
   public static final boolean longRangeContains(@NotNull ClosedRange<Long> $this$contains, byte value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)(long)value);
   }

   @JvmName(
      name = "shortRangeContains"
   )
   public static final boolean shortRangeContains(@NotNull ClosedRange<Short> $this$contains, byte value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)(short)value);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.3",
      errorSince = "1.4",
      hiddenSince = "1.5"
   )
   @JvmName(
      name = "doubleRangeContains"
   )
   public static final boolean doubleRangeContains(ClosedRange $this$contains, byte value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)(double)value);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.3",
      errorSince = "1.4",
      hiddenSince = "1.5"
   )
   @JvmName(
      name = "floatRangeContains"
   )
   public static final boolean floatRangeContains(ClosedRange $this$contains, byte value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)(float)value);
   }

   @JvmName(
      name = "intRangeContains"
   )
   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static final boolean intRangeContains(@NotNull OpenEndRange<Integer> $this$contains, byte value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)Integer.valueOf(value));
   }

   @JvmName(
      name = "longRangeContains"
   )
   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static final boolean longRangeContains(@NotNull OpenEndRange<Long> $this$contains, byte value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)(long)value);
   }

   @JvmName(
      name = "shortRangeContains"
   )
   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static final boolean shortRangeContains(@NotNull OpenEndRange<Short> $this$contains, byte value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)(short)value);
   }

   @InlineOnly
   private static final boolean contains(IntRange $this$contains, byte value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return RangesKt.intRangeContains((ClosedRange)$this$contains, value);
   }

   @InlineOnly
   private static final boolean contains(LongRange $this$contains, byte value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return RangesKt.longRangeContains((ClosedRange)$this$contains, value);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.3",
      errorSince = "1.4",
      hiddenSince = "1.5"
   )
   @JvmName(
      name = "intRangeContains"
   )
   public static final boolean intRangeContains(ClosedRange $this$contains, double value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      Integer it = RangesKt.toIntExactOrNull(value);
      int var4 = false;
      return it != null ? $this$contains.contains((Comparable)it) : false;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.3",
      errorSince = "1.4",
      hiddenSince = "1.5"
   )
   @JvmName(
      name = "longRangeContains"
   )
   public static final boolean longRangeContains(ClosedRange $this$contains, double value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      Long it = RangesKt.toLongExactOrNull(value);
      int var4 = false;
      return it != null ? $this$contains.contains((Comparable)it) : false;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.3",
      errorSince = "1.4",
      hiddenSince = "1.5"
   )
   @JvmName(
      name = "byteRangeContains"
   )
   public static final boolean byteRangeContains(ClosedRange $this$contains, double value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      Byte it = RangesKt.toByteExactOrNull(value);
      int var4 = false;
      return it != null ? $this$contains.contains((Comparable)it) : false;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.3",
      errorSince = "1.4",
      hiddenSince = "1.5"
   )
   @JvmName(
      name = "shortRangeContains"
   )
   public static final boolean shortRangeContains(ClosedRange $this$contains, double value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      Short it = RangesKt.toShortExactOrNull(value);
      int var4 = false;
      return it != null ? $this$contains.contains((Comparable)it) : false;
   }

   @JvmName(
      name = "floatRangeContains"
   )
   public static final boolean floatRangeContains(@NotNull ClosedRange<Float> $this$contains, double value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)(float)value);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.3",
      errorSince = "1.4",
      hiddenSince = "1.5"
   )
   @JvmName(
      name = "intRangeContains"
   )
   public static final boolean intRangeContains(ClosedRange $this$contains, float value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      Integer it = RangesKt.toIntExactOrNull(value);
      int var3 = false;
      return it != null ? $this$contains.contains((Comparable)it) : false;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.3",
      errorSince = "1.4",
      hiddenSince = "1.5"
   )
   @JvmName(
      name = "longRangeContains"
   )
   public static final boolean longRangeContains(ClosedRange $this$contains, float value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      Long it = RangesKt.toLongExactOrNull(value);
      int var3 = false;
      return it != null ? $this$contains.contains((Comparable)it) : false;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.3",
      errorSince = "1.4",
      hiddenSince = "1.5"
   )
   @JvmName(
      name = "byteRangeContains"
   )
   public static final boolean byteRangeContains(ClosedRange $this$contains, float value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      Byte it = RangesKt.toByteExactOrNull(value);
      int var3 = false;
      return it != null ? $this$contains.contains((Comparable)it) : false;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.3",
      errorSince = "1.4",
      hiddenSince = "1.5"
   )
   @JvmName(
      name = "shortRangeContains"
   )
   public static final boolean shortRangeContains(ClosedRange $this$contains, float value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      Short it = RangesKt.toShortExactOrNull(value);
      int var3 = false;
      return it != null ? $this$contains.contains((Comparable)it) : false;
   }

   @JvmName(
      name = "doubleRangeContains"
   )
   public static final boolean doubleRangeContains(@NotNull ClosedRange<Double> $this$contains, float value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)(double)value);
   }

   @JvmName(
      name = "doubleRangeContains"
   )
   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static final boolean doubleRangeContains(@NotNull OpenEndRange<Double> $this$contains, float value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)(double)value);
   }

   @JvmName(
      name = "longRangeContains"
   )
   public static final boolean longRangeContains(@NotNull ClosedRange<Long> $this$contains, int value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)(long)value);
   }

   @JvmName(
      name = "byteRangeContains"
   )
   public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> $this$contains, int value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      Byte it = RangesKt.toByteExactOrNull(value);
      int var3 = false;
      return it != null ? $this$contains.contains((Comparable)it) : false;
   }

   @JvmName(
      name = "shortRangeContains"
   )
   public static final boolean shortRangeContains(@NotNull ClosedRange<Short> $this$contains, int value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      Short it = RangesKt.toShortExactOrNull(value);
      int var3 = false;
      return it != null ? $this$contains.contains((Comparable)it) : false;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.3",
      errorSince = "1.4",
      hiddenSince = "1.5"
   )
   @JvmName(
      name = "doubleRangeContains"
   )
   public static final boolean doubleRangeContains(ClosedRange $this$contains, int value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)(double)value);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.3",
      errorSince = "1.4",
      hiddenSince = "1.5"
   )
   @JvmName(
      name = "floatRangeContains"
   )
   public static final boolean floatRangeContains(ClosedRange $this$contains, int value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)(float)value);
   }

   @JvmName(
      name = "longRangeContains"
   )
   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static final boolean longRangeContains(@NotNull OpenEndRange<Long> $this$contains, int value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)(long)value);
   }

   @JvmName(
      name = "byteRangeContains"
   )
   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static final boolean byteRangeContains(@NotNull OpenEndRange<Byte> $this$contains, int value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      Byte it = RangesKt.toByteExactOrNull(value);
      int var3 = false;
      return it != null ? $this$contains.contains((Comparable)it) : false;
   }

   @JvmName(
      name = "shortRangeContains"
   )
   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static final boolean shortRangeContains(@NotNull OpenEndRange<Short> $this$contains, int value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      Short it = RangesKt.toShortExactOrNull(value);
      int var3 = false;
      return it != null ? $this$contains.contains((Comparable)it) : false;
   }

   @InlineOnly
   private static final boolean contains(LongRange $this$contains, int value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return RangesKt.longRangeContains((ClosedRange)$this$contains, value);
   }

   @JvmName(
      name = "intRangeContains"
   )
   public static final boolean intRangeContains(@NotNull ClosedRange<Integer> $this$contains, long value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      Integer it = RangesKt.toIntExactOrNull(value);
      int var4 = false;
      return it != null ? $this$contains.contains((Comparable)it) : false;
   }

   @JvmName(
      name = "byteRangeContains"
   )
   public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> $this$contains, long value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      Byte it = RangesKt.toByteExactOrNull(value);
      int var4 = false;
      return it != null ? $this$contains.contains((Comparable)it) : false;
   }

   @JvmName(
      name = "shortRangeContains"
   )
   public static final boolean shortRangeContains(@NotNull ClosedRange<Short> $this$contains, long value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      Short it = RangesKt.toShortExactOrNull(value);
      int var4 = false;
      return it != null ? $this$contains.contains((Comparable)it) : false;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.3",
      errorSince = "1.4",
      hiddenSince = "1.5"
   )
   @JvmName(
      name = "doubleRangeContains"
   )
   public static final boolean doubleRangeContains(ClosedRange $this$contains, long value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)(double)value);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.3",
      errorSince = "1.4",
      hiddenSince = "1.5"
   )
   @JvmName(
      name = "floatRangeContains"
   )
   public static final boolean floatRangeContains(ClosedRange $this$contains, long value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)(float)value);
   }

   @JvmName(
      name = "intRangeContains"
   )
   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static final boolean intRangeContains(@NotNull OpenEndRange<Integer> $this$contains, long value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      Integer it = RangesKt.toIntExactOrNull(value);
      int var4 = false;
      return it != null ? $this$contains.contains((Comparable)it) : false;
   }

   @JvmName(
      name = "byteRangeContains"
   )
   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static final boolean byteRangeContains(@NotNull OpenEndRange<Byte> $this$contains, long value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      Byte it = RangesKt.toByteExactOrNull(value);
      int var4 = false;
      return it != null ? $this$contains.contains((Comparable)it) : false;
   }

   @JvmName(
      name = "shortRangeContains"
   )
   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static final boolean shortRangeContains(@NotNull OpenEndRange<Short> $this$contains, long value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      Short it = RangesKt.toShortExactOrNull(value);
      int var4 = false;
      return it != null ? $this$contains.contains((Comparable)it) : false;
   }

   @InlineOnly
   private static final boolean contains(IntRange $this$contains, long value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return RangesKt.intRangeContains((ClosedRange)$this$contains, value);
   }

   @JvmName(
      name = "intRangeContains"
   )
   public static final boolean intRangeContains(@NotNull ClosedRange<Integer> $this$contains, short value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)Integer.valueOf(value));
   }

   @JvmName(
      name = "longRangeContains"
   )
   public static final boolean longRangeContains(@NotNull ClosedRange<Long> $this$contains, short value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)(long)value);
   }

   @JvmName(
      name = "byteRangeContains"
   )
   public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> $this$contains, short value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      Byte it = RangesKt.toByteExactOrNull(value);
      int var3 = false;
      return it != null ? $this$contains.contains((Comparable)it) : false;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.3",
      errorSince = "1.4",
      hiddenSince = "1.5"
   )
   @JvmName(
      name = "doubleRangeContains"
   )
   public static final boolean doubleRangeContains(ClosedRange $this$contains, short value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)(double)value);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.3",
      errorSince = "1.4",
      hiddenSince = "1.5"
   )
   @JvmName(
      name = "floatRangeContains"
   )
   public static final boolean floatRangeContains(ClosedRange $this$contains, short value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)(float)value);
   }

   @JvmName(
      name = "intRangeContains"
   )
   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static final boolean intRangeContains(@NotNull OpenEndRange<Integer> $this$contains, short value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)Integer.valueOf(value));
   }

   @JvmName(
      name = "longRangeContains"
   )
   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static final boolean longRangeContains(@NotNull OpenEndRange<Long> $this$contains, short value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.contains((Comparable)(long)value);
   }

   @JvmName(
      name = "byteRangeContains"
   )
   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static final boolean byteRangeContains(@NotNull OpenEndRange<Byte> $this$contains, short value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      Byte it = RangesKt.toByteExactOrNull(value);
      int var3 = false;
      return it != null ? $this$contains.contains((Comparable)it) : false;
   }

   @InlineOnly
   private static final boolean contains(IntRange $this$contains, short value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return RangesKt.intRangeContains((ClosedRange)$this$contains, value);
   }

   @InlineOnly
   private static final boolean contains(LongRange $this$contains, short value) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return RangesKt.longRangeContains((ClosedRange)$this$contains, value);
   }

   @NotNull
   public static final IntProgression downTo(int $this$downTo, byte to) {
      return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
   }

   @NotNull
   public static final LongProgression downTo(long $this$downTo, byte to) {
      return LongProgression.Companion.fromClosedRange($this$downTo, (long)to, -1L);
   }

   @NotNull
   public static final IntProgression downTo(byte $this$downTo, byte to) {
      return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
   }

   @NotNull
   public static final IntProgression downTo(short $this$downTo, byte to) {
      return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
   }

   @NotNull
   public static final CharProgression downTo(char $this$downTo, char to) {
      return CharProgression.Companion.fromClosedRange($this$downTo, to, -1);
   }

   @NotNull
   public static final IntProgression downTo(int $this$downTo, int to) {
      return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
   }

   @NotNull
   public static final LongProgression downTo(long $this$downTo, int to) {
      return LongProgression.Companion.fromClosedRange($this$downTo, (long)to, -1L);
   }

   @NotNull
   public static final IntProgression downTo(byte $this$downTo, int to) {
      return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
   }

   @NotNull
   public static final IntProgression downTo(short $this$downTo, int to) {
      return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
   }

   @NotNull
   public static final LongProgression downTo(int $this$downTo, long to) {
      return LongProgression.Companion.fromClosedRange((long)$this$downTo, to, -1L);
   }

   @NotNull
   public static final LongProgression downTo(long $this$downTo, long to) {
      return LongProgression.Companion.fromClosedRange($this$downTo, to, -1L);
   }

   @NotNull
   public static final LongProgression downTo(byte $this$downTo, long to) {
      return LongProgression.Companion.fromClosedRange((long)$this$downTo, to, -1L);
   }

   @NotNull
   public static final LongProgression downTo(short $this$downTo, long to) {
      return LongProgression.Companion.fromClosedRange((long)$this$downTo, to, -1L);
   }

   @NotNull
   public static final IntProgression downTo(int $this$downTo, short to) {
      return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
   }

   @NotNull
   public static final LongProgression downTo(long $this$downTo, short to) {
      return LongProgression.Companion.fromClosedRange($this$downTo, (long)to, -1L);
   }

   @NotNull
   public static final IntProgression downTo(byte $this$downTo, short to) {
      return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
   }

   @NotNull
   public static final IntProgression downTo(short $this$downTo, short to) {
      return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
   }

   @NotNull
   public static final IntProgression reversed(@NotNull IntProgression $this$reversed) {
      Intrinsics.checkNotNullParameter($this$reversed, "<this>");
      return IntProgression.Companion.fromClosedRange($this$reversed.getLast(), $this$reversed.getFirst(), -$this$reversed.getStep());
   }

   @NotNull
   public static final LongProgression reversed(@NotNull LongProgression $this$reversed) {
      Intrinsics.checkNotNullParameter($this$reversed, "<this>");
      return LongProgression.Companion.fromClosedRange($this$reversed.getLast(), $this$reversed.getFirst(), -$this$reversed.getStep());
   }

   @NotNull
   public static final CharProgression reversed(@NotNull CharProgression $this$reversed) {
      Intrinsics.checkNotNullParameter($this$reversed, "<this>");
      return CharProgression.Companion.fromClosedRange($this$reversed.getLast(), $this$reversed.getFirst(), -$this$reversed.getStep());
   }

   @NotNull
   public static final IntProgression step(@NotNull IntProgression $this$step, int step) {
      Intrinsics.checkNotNullParameter($this$step, "<this>");
      RangesKt.checkStepIsPositive(step > 0, (Number)step);
      return IntProgression.Companion.fromClosedRange($this$step.getFirst(), $this$step.getLast(), $this$step.getStep() > 0 ? step : -step);
   }

   @NotNull
   public static final LongProgression step(@NotNull LongProgression $this$step, long step) {
      Intrinsics.checkNotNullParameter($this$step, "<this>");
      RangesKt.checkStepIsPositive(step > 0L, (Number)step);
      return LongProgression.Companion.fromClosedRange($this$step.getFirst(), $this$step.getLast(), $this$step.getStep() > 0L ? step : -step);
   }

   @NotNull
   public static final CharProgression step(@NotNull CharProgression $this$step, int step) {
      Intrinsics.checkNotNullParameter($this$step, "<this>");
      RangesKt.checkStepIsPositive(step > 0, (Number)step);
      return CharProgression.Companion.fromClosedRange($this$step.getFirst(), $this$step.getLast(), $this$step.getStep() > 0 ? step : -step);
   }

   @Nullable
   public static final Byte toByteExactOrNull(int $this$toByteExactOrNull) {
      return (-128 <= $this$toByteExactOrNull ? $this$toByteExactOrNull < 128 : false) ? (byte)$this$toByteExactOrNull : null;
   }

   @Nullable
   public static final Byte toByteExactOrNull(long $this$toByteExactOrNull) {
      return (-128L <= $this$toByteExactOrNull ? $this$toByteExactOrNull < 128L : false) ? (byte)((int)$this$toByteExactOrNull) : null;
   }

   @Nullable
   public static final Byte toByteExactOrNull(short $this$toByteExactOrNull) {
      return (-128 <= $this$toByteExactOrNull ? $this$toByteExactOrNull < 128 : false) ? (byte)$this$toByteExactOrNull : null;
   }

   @Nullable
   public static final Byte toByteExactOrNull(double $this$toByteExactOrNull) {
      return (-128.0D <= $this$toByteExactOrNull ? $this$toByteExactOrNull <= 127.0D : false) ? (byte)((int)$this$toByteExactOrNull) : null;
   }

   @Nullable
   public static final Byte toByteExactOrNull(float $this$toByteExactOrNull) {
      return (-128.0F <= $this$toByteExactOrNull ? $this$toByteExactOrNull <= 127.0F : false) ? (byte)((int)$this$toByteExactOrNull) : null;
   }

   @Nullable
   public static final Integer toIntExactOrNull(long $this$toIntExactOrNull) {
      return (-2147483648L <= $this$toIntExactOrNull ? $this$toIntExactOrNull < 2147483648L : false) ? (int)$this$toIntExactOrNull : null;
   }

   @Nullable
   public static final Integer toIntExactOrNull(double $this$toIntExactOrNull) {
      return (-2.147483648E9D <= $this$toIntExactOrNull ? $this$toIntExactOrNull <= 2.147483647E9D : false) ? (int)$this$toIntExactOrNull : null;
   }

   @Nullable
   public static final Integer toIntExactOrNull(float $this$toIntExactOrNull) {
      return (-2.14748365E9F <= $this$toIntExactOrNull ? $this$toIntExactOrNull <= 2.14748365E9F : false) ? (int)$this$toIntExactOrNull : null;
   }

   @Nullable
   public static final Long toLongExactOrNull(double $this$toLongExactOrNull) {
      return (-9.223372036854776E18D <= $this$toLongExactOrNull ? $this$toLongExactOrNull <= 9.223372036854776E18D : false) ? (long)$this$toLongExactOrNull : null;
   }

   @Nullable
   public static final Long toLongExactOrNull(float $this$toLongExactOrNull) {
      return (-9.223372E18F <= $this$toLongExactOrNull ? $this$toLongExactOrNull <= 9.223372E18F : false) ? (long)$this$toLongExactOrNull : null;
   }

   @Nullable
   public static final Short toShortExactOrNull(int $this$toShortExactOrNull) {
      return (-32768 <= $this$toShortExactOrNull ? $this$toShortExactOrNull < 32768 : false) ? (short)$this$toShortExactOrNull : null;
   }

   @Nullable
   public static final Short toShortExactOrNull(long $this$toShortExactOrNull) {
      return (-32768L <= $this$toShortExactOrNull ? $this$toShortExactOrNull < 32768L : false) ? (short)((int)$this$toShortExactOrNull) : null;
   }

   @Nullable
   public static final Short toShortExactOrNull(double $this$toShortExactOrNull) {
      return (-32768.0D <= $this$toShortExactOrNull ? $this$toShortExactOrNull <= 32767.0D : false) ? (short)((int)$this$toShortExactOrNull) : null;
   }

   @Nullable
   public static final Short toShortExactOrNull(float $this$toShortExactOrNull) {
      return (-32768.0F <= $this$toShortExactOrNull ? $this$toShortExactOrNull <= 32767.0F : false) ? (short)((int)$this$toShortExactOrNull) : null;
   }

   @NotNull
   public static final IntRange until(int $this$until, byte to) {
      return new IntRange($this$until, to - 1);
   }

   @NotNull
   public static final LongRange until(long $this$until, byte to) {
      return new LongRange($this$until, (long)to - 1L);
   }

   @NotNull
   public static final IntRange until(byte $this$until, byte to) {
      return new IntRange($this$until, to - 1);
   }

   @NotNull
   public static final IntRange until(short $this$until, byte to) {
      return new IntRange($this$until, to - 1);
   }

   @NotNull
   public static final CharRange until(char $this$until, char to) {
      return Intrinsics.compare(to, 0) <= 0 ? CharRange.Companion.getEMPTY() : new CharRange($this$until, (char)(to - 1));
   }

   @NotNull
   public static final IntRange until(int $this$until, int to) {
      return to <= Integer.MIN_VALUE ? IntRange.Companion.getEMPTY() : new IntRange($this$until, to - 1);
   }

   @NotNull
   public static final LongRange until(long $this$until, int to) {
      return new LongRange($this$until, (long)to - 1L);
   }

   @NotNull
   public static final IntRange until(byte $this$until, int to) {
      return to <= Integer.MIN_VALUE ? IntRange.Companion.getEMPTY() : new IntRange($this$until, to - 1);
   }

   @NotNull
   public static final IntRange until(short $this$until, int to) {
      return to <= Integer.MIN_VALUE ? IntRange.Companion.getEMPTY() : new IntRange($this$until, to - 1);
   }

   @NotNull
   public static final LongRange until(int $this$until, long to) {
      return to <= Long.MIN_VALUE ? LongRange.Companion.getEMPTY() : new LongRange((long)$this$until, to - 1L);
   }

   @NotNull
   public static final LongRange until(long $this$until, long to) {
      return to <= Long.MIN_VALUE ? LongRange.Companion.getEMPTY() : new LongRange($this$until, to - 1L);
   }

   @NotNull
   public static final LongRange until(byte $this$until, long to) {
      return to <= Long.MIN_VALUE ? LongRange.Companion.getEMPTY() : new LongRange((long)$this$until, to - 1L);
   }

   @NotNull
   public static final LongRange until(short $this$until, long to) {
      return to <= Long.MIN_VALUE ? LongRange.Companion.getEMPTY() : new LongRange((long)$this$until, to - 1L);
   }

   @NotNull
   public static final IntRange until(int $this$until, short to) {
      return new IntRange($this$until, to - 1);
   }

   @NotNull
   public static final LongRange until(long $this$until, short to) {
      return new LongRange($this$until, (long)to - 1L);
   }

   @NotNull
   public static final IntRange until(byte $this$until, short to) {
      return new IntRange($this$until, to - 1);
   }

   @NotNull
   public static final IntRange until(short $this$until, short to) {
      return new IntRange($this$until, to - 1);
   }

   @NotNull
   public static final <T extends Comparable<? super T>> T coerceAtLeast(@NotNull T $this$coerceAtLeast, @NotNull T minimumValue) {
      Intrinsics.checkNotNullParameter($this$coerceAtLeast, "<this>");
      Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
      return $this$coerceAtLeast.compareTo(minimumValue) < 0 ? minimumValue : $this$coerceAtLeast;
   }

   public static final byte coerceAtLeast(byte $this$coerceAtLeast, byte minimumValue) {
      return $this$coerceAtLeast < minimumValue ? minimumValue : $this$coerceAtLeast;
   }

   public static final short coerceAtLeast(short $this$coerceAtLeast, short minimumValue) {
      return $this$coerceAtLeast < minimumValue ? minimumValue : $this$coerceAtLeast;
   }

   public static final int coerceAtLeast(int $this$coerceAtLeast, int minimumValue) {
      return $this$coerceAtLeast < minimumValue ? minimumValue : $this$coerceAtLeast;
   }

   public static final long coerceAtLeast(long $this$coerceAtLeast, long minimumValue) {
      return $this$coerceAtLeast < minimumValue ? minimumValue : $this$coerceAtLeast;
   }

   public static final float coerceAtLeast(float $this$coerceAtLeast, float minimumValue) {
      return $this$coerceAtLeast < minimumValue ? minimumValue : $this$coerceAtLeast;
   }

   public static final double coerceAtLeast(double $this$coerceAtLeast, double minimumValue) {
      return $this$coerceAtLeast < minimumValue ? minimumValue : $this$coerceAtLeast;
   }

   @NotNull
   public static final <T extends Comparable<? super T>> T coerceAtMost(@NotNull T $this$coerceAtMost, @NotNull T maximumValue) {
      Intrinsics.checkNotNullParameter($this$coerceAtMost, "<this>");
      Intrinsics.checkNotNullParameter(maximumValue, "maximumValue");
      return $this$coerceAtMost.compareTo(maximumValue) > 0 ? maximumValue : $this$coerceAtMost;
   }

   public static final byte coerceAtMost(byte $this$coerceAtMost, byte maximumValue) {
      return $this$coerceAtMost > maximumValue ? maximumValue : $this$coerceAtMost;
   }

   public static final short coerceAtMost(short $this$coerceAtMost, short maximumValue) {
      return $this$coerceAtMost > maximumValue ? maximumValue : $this$coerceAtMost;
   }

   public static final int coerceAtMost(int $this$coerceAtMost, int maximumValue) {
      return $this$coerceAtMost > maximumValue ? maximumValue : $this$coerceAtMost;
   }

   public static final long coerceAtMost(long $this$coerceAtMost, long maximumValue) {
      return $this$coerceAtMost > maximumValue ? maximumValue : $this$coerceAtMost;
   }

   public static final float coerceAtMost(float $this$coerceAtMost, float maximumValue) {
      return $this$coerceAtMost > maximumValue ? maximumValue : $this$coerceAtMost;
   }

   public static final double coerceAtMost(double $this$coerceAtMost, double maximumValue) {
      return $this$coerceAtMost > maximumValue ? maximumValue : $this$coerceAtMost;
   }

   @NotNull
   public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T $this$coerceIn, @Nullable T minimumValue, @Nullable T maximumValue) {
      Intrinsics.checkNotNullParameter($this$coerceIn, "<this>");
      if (minimumValue != null && maximumValue != null) {
         if (minimumValue.compareTo(maximumValue) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
         }

         if ($this$coerceIn.compareTo(minimumValue) < 0) {
            return minimumValue;
         }

         if ($this$coerceIn.compareTo(maximumValue) > 0) {
            return maximumValue;
         }
      } else {
         if (minimumValue != null && $this$coerceIn.compareTo(minimumValue) < 0) {
            return minimumValue;
         }

         if (maximumValue != null && $this$coerceIn.compareTo(maximumValue) > 0) {
            return maximumValue;
         }
      }

      return $this$coerceIn;
   }

   public static final byte coerceIn(byte $this$coerceIn, byte minimumValue, byte maximumValue) {
      if (minimumValue > maximumValue) {
         throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
      } else if ($this$coerceIn < minimumValue) {
         return minimumValue;
      } else {
         return $this$coerceIn > maximumValue ? maximumValue : $this$coerceIn;
      }
   }

   public static final short coerceIn(short $this$coerceIn, short minimumValue, short maximumValue) {
      if (minimumValue > maximumValue) {
         throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
      } else if ($this$coerceIn < minimumValue) {
         return minimumValue;
      } else {
         return $this$coerceIn > maximumValue ? maximumValue : $this$coerceIn;
      }
   }

   public static final int coerceIn(int $this$coerceIn, int minimumValue, int maximumValue) {
      if (minimumValue > maximumValue) {
         throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
      } else if ($this$coerceIn < minimumValue) {
         return minimumValue;
      } else {
         return $this$coerceIn > maximumValue ? maximumValue : $this$coerceIn;
      }
   }

   public static final long coerceIn(long $this$coerceIn, long minimumValue, long maximumValue) {
      if (minimumValue > maximumValue) {
         throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
      } else if ($this$coerceIn < minimumValue) {
         return minimumValue;
      } else {
         return $this$coerceIn > maximumValue ? maximumValue : $this$coerceIn;
      }
   }

   public static final float coerceIn(float $this$coerceIn, float minimumValue, float maximumValue) {
      if (minimumValue > maximumValue) {
         throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
      } else if ($this$coerceIn < minimumValue) {
         return minimumValue;
      } else {
         return $this$coerceIn > maximumValue ? maximumValue : $this$coerceIn;
      }
   }

   public static final double coerceIn(double $this$coerceIn, double minimumValue, double maximumValue) {
      if (minimumValue > maximumValue) {
         throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
      } else if ($this$coerceIn < minimumValue) {
         return minimumValue;
      } else {
         return $this$coerceIn > maximumValue ? maximumValue : $this$coerceIn;
      }
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T $this$coerceIn, @NotNull ClosedFloatingPointRange<T> range) {
      Intrinsics.checkNotNullParameter($this$coerceIn, "<this>");
      Intrinsics.checkNotNullParameter(range, "range");
      if (range.isEmpty()) {
         throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
      } else {
         return range.lessThanOrEquals($this$coerceIn, range.getStart()) && !range.lessThanOrEquals(range.getStart(), $this$coerceIn) ? range.getStart() : (range.lessThanOrEquals(range.getEndInclusive(), $this$coerceIn) && !range.lessThanOrEquals($this$coerceIn, range.getEndInclusive()) ? range.getEndInclusive() : $this$coerceIn);
      }
   }

   @NotNull
   public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T $this$coerceIn, @NotNull ClosedRange<T> range) {
      Intrinsics.checkNotNullParameter($this$coerceIn, "<this>");
      Intrinsics.checkNotNullParameter(range, "range");
      if (range instanceof ClosedFloatingPointRange) {
         return RangesKt.coerceIn($this$coerceIn, (ClosedFloatingPointRange)range);
      } else if (range.isEmpty()) {
         throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
      } else {
         return $this$coerceIn.compareTo(range.getStart()) < 0 ? range.getStart() : ($this$coerceIn.compareTo(range.getEndInclusive()) > 0 ? range.getEndInclusive() : $this$coerceIn);
      }
   }

   public static final int coerceIn(int $this$coerceIn, @NotNull ClosedRange<Integer> range) {
      Intrinsics.checkNotNullParameter(range, "range");
      if (range instanceof ClosedFloatingPointRange) {
         return ((Number)RangesKt.coerceIn((Comparable)$this$coerceIn, (ClosedFloatingPointRange)range)).intValue();
      } else if (range.isEmpty()) {
         throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
      } else {
         return $this$coerceIn < ((Number)range.getStart()).intValue() ? ((Number)range.getStart()).intValue() : ($this$coerceIn > ((Number)range.getEndInclusive()).intValue() ? ((Number)range.getEndInclusive()).intValue() : $this$coerceIn);
      }
   }

   public static final long coerceIn(long $this$coerceIn, @NotNull ClosedRange<Long> range) {
      Intrinsics.checkNotNullParameter(range, "range");
      if (range instanceof ClosedFloatingPointRange) {
         return ((Number)RangesKt.coerceIn((Comparable)$this$coerceIn, (ClosedFloatingPointRange)range)).longValue();
      } else if (range.isEmpty()) {
         throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
      } else {
         return $this$coerceIn < ((Number)range.getStart()).longValue() ? ((Number)range.getStart()).longValue() : ($this$coerceIn > ((Number)range.getEndInclusive()).longValue() ? ((Number)range.getEndInclusive()).longValue() : $this$coerceIn);
      }
   }

   public RangesKt___RangesKt() {
   }
}
