package kotlin.time;

import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.comparisons.ComparisonsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmInline
@SinceKotlin(
   version = "1.6"
)
public final class Duration implements Comparable<Duration> {
   @NotNull
   public static final Duration.Companion Companion = new Duration.Companion((DefaultConstructorMarker)null);
   private final long rawValue;
   private static final long ZERO = constructor-impl(0L);
   private static final long INFINITE = DurationKt.access$durationOfMillis(4611686018427387903L);
   private static final long NEG_INFINITE = DurationKt.access$durationOfMillis(-4611686018427387903L);

   private static final long getValue_impl/* $FF was: getValue-impl*/(long arg0) {
      return arg0 >> 1;
   }

   private static final int getUnitDiscriminator_impl/* $FF was: getUnitDiscriminator-impl*/(long arg0) {
      int var2 = false;
      return (int)arg0 & 1;
   }

   private static final boolean isInNanos_impl/* $FF was: isInNanos-impl*/(long arg0) {
      int var2 = false;
      return ((int)arg0 & 1) == 0;
   }

   private static final boolean isInMillis_impl/* $FF was: isInMillis-impl*/(long arg0) {
      int var2 = false;
      return ((int)arg0 & 1) == 1;
   }

   private static final DurationUnit getStorageUnit_impl/* $FF was: getStorageUnit-impl*/(long arg0) {
      return isInNanos-impl(arg0) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
   }

   public static final long unaryMinus_UwyO8pc/* $FF was: unaryMinus-UwyO8pc*/(long arg0) {
      long var10000 = -getValue-impl(arg0);
      int var2 = false;
      return DurationKt.access$durationOf(var10000, (int)arg0 & 1);
   }

   public static final long plus_LRDsOJo/* $FF was: plus-LRDsOJo*/(long arg0, long other) {
      if (isInfinite-impl(arg0)) {
         if (!isFinite-impl(other) && (arg0 ^ other) < 0L) {
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
         } else {
            return arg0;
         }
      } else if (isInfinite-impl(other)) {
         return other;
      } else {
         int var4 = false;
         int var10000 = (int)arg0 & 1;
         var4 = false;
         long var7;
         if (var10000 == ((int)other & 1)) {
            long result = getValue-impl(arg0) + getValue-impl(other);
            var7 = isInNanos-impl(arg0) ? DurationKt.access$durationOfNanosNormalized(result) : DurationKt.access$durationOfMillisNormalized(result);
         } else {
            var7 = isInMillis-impl(arg0) ? addValuesMixedRanges-UwyO8pc(arg0, getValue-impl(arg0), getValue-impl(other)) : addValuesMixedRanges-UwyO8pc(arg0, getValue-impl(other), getValue-impl(arg0));
         }

         return var7;
      }
   }

   private static final long addValuesMixedRanges_UwyO8pc/* $FF was: addValuesMixedRanges-UwyO8pc*/(long arg0, long thisMillis, long otherNanos) {
      long otherMillis = DurationKt.access$nanosToMillis(otherNanos);
      long resultMillis = thisMillis + otherMillis;
      long var10000;
      if (-4611686018426L <= resultMillis ? resultMillis < 4611686018427L : false) {
         long otherNanoRemainder = otherNanos - DurationKt.access$millisToNanos(otherMillis);
         var10000 = DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(resultMillis) + otherNanoRemainder);
      } else {
         var10000 = DurationKt.access$durationOfMillis(RangesKt.coerceIn(resultMillis, -4611686018427387903L, 4611686018427387903L));
      }

      return var10000;
   }

   public static final long minus_LRDsOJo/* $FF was: minus-LRDsOJo*/(long arg0, long other) {
      return plus-LRDsOJo(arg0, unaryMinus-UwyO8pc(other));
   }

   public static final long times_UwyO8pc/* $FF was: times-UwyO8pc*/(long arg0, int scale) {
      if (isInfinite-impl(arg0)) {
         if (scale == 0) {
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
         } else {
            return scale > 0 ? arg0 : unaryMinus-UwyO8pc(arg0);
         }
      } else if (scale == 0) {
         return ZERO;
      } else {
         long value = getValue-impl(arg0);
         long result = value * (long)scale;
         long var10000;
         if (isInNanos-impl(arg0)) {
            if (-2147483647L <= value ? value < 2147483648L : false) {
               var10000 = DurationKt.access$durationOfNanos(result);
            } else if (result / (long)scale == value) {
               var10000 = DurationKt.access$durationOfNanosNormalized(result);
            } else {
               long millis = DurationKt.access$nanosToMillis(value);
               long remNanos = value - DurationKt.access$millisToNanos(millis);
               long resultMillis = millis * (long)scale;
               long totalMillis = resultMillis + DurationKt.access$nanosToMillis(remNanos * (long)scale);
               var10000 = resultMillis / (long)scale == millis && (totalMillis ^ resultMillis) >= 0L ? DurationKt.access$durationOfMillis(RangesKt.coerceIn(totalMillis, (ClosedRange)(new LongRange(-4611686018427387903L, 4611686018427387903L)))) : (MathKt.getSign(value) * MathKt.getSign(scale) > 0 ? INFINITE : NEG_INFINITE);
            }
         } else {
            var10000 = result / (long)scale == value ? DurationKt.access$durationOfMillis(RangesKt.coerceIn(result, (ClosedRange)(new LongRange(-4611686018427387903L, 4611686018427387903L)))) : (MathKt.getSign(value) * MathKt.getSign(scale) > 0 ? INFINITE : NEG_INFINITE);
         }

         return var10000;
      }
   }

   public static final long times_UwyO8pc/* $FF was: times-UwyO8pc*/(long arg0, double scale) {
      int intScale = MathKt.roundToInt(scale);
      if ((double)intScale == scale) {
         return times-UwyO8pc(arg0, intScale);
      } else {
         DurationUnit unit = getStorageUnit-impl(arg0);
         double result = toDouble-impl(arg0, unit) * scale;
         return DurationKt.toDuration(result, unit);
      }
   }

   public static final long div_UwyO8pc/* $FF was: div-UwyO8pc*/(long arg0, int scale) {
      if (scale == 0) {
         long var10000;
         if (isPositive-impl(arg0)) {
            var10000 = INFINITE;
         } else {
            if (!isNegative-impl(arg0)) {
               throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
            }

            var10000 = NEG_INFINITE;
         }

         return var10000;
      } else if (isInNanos-impl(arg0)) {
         return DurationKt.access$durationOfNanos(getValue-impl(arg0) / (long)scale);
      } else if (isInfinite-impl(arg0)) {
         return times-UwyO8pc(arg0, MathKt.getSign(scale));
      } else {
         long result = getValue-impl(arg0) / (long)scale;
         if (-4611686018426L <= result ? result < 4611686018427L : false) {
            long rem = DurationKt.access$millisToNanos(getValue-impl(arg0) - result * (long)scale) / (long)scale;
            return DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(result) + rem);
         } else {
            return DurationKt.access$durationOfMillis(result);
         }
      }
   }

   public static final long div_UwyO8pc/* $FF was: div-UwyO8pc*/(long arg0, double scale) {
      int intScale = MathKt.roundToInt(scale);
      if ((double)intScale == scale && intScale != 0) {
         return div-UwyO8pc(arg0, intScale);
      } else {
         DurationUnit unit = getStorageUnit-impl(arg0);
         double result = toDouble-impl(arg0, unit) / scale;
         return DurationKt.toDuration(result, unit);
      }
   }

   public static final double div_LRDsOJo/* $FF was: div-LRDsOJo*/(long arg0, long other) {
      DurationUnit coarserUnit = (DurationUnit)ComparisonsKt.maxOf((Comparable)getStorageUnit-impl(arg0), (Comparable)getStorageUnit-impl(other));
      return toDouble-impl(arg0, coarserUnit) / toDouble-impl(other, coarserUnit);
   }

   public static final long truncateTo_UwyO8pc$kotlin_stdlib/* $FF was: truncateTo-UwyO8pc$kotlin_stdlib*/(long arg0, @NotNull DurationUnit unit) {
      Intrinsics.checkNotNullParameter(unit, "unit");
      DurationUnit storageUnit = getStorageUnit-impl(arg0);
      if (unit.compareTo((Enum)storageUnit) > 0 && !isInfinite-impl(arg0)) {
         long scale = DurationUnitKt.convertDurationUnit(1L, unit, storageUnit);
         long result = getValue-impl(arg0) - getValue-impl(arg0) % scale;
         return DurationKt.toDuration(result, storageUnit);
      } else {
         return arg0;
      }
   }

   public static final boolean isNegative_impl/* $FF was: isNegative-impl*/(long arg0) {
      return arg0 < 0L;
   }

   public static final boolean isPositive_impl/* $FF was: isPositive-impl*/(long arg0) {
      return arg0 > 0L;
   }

   public static final boolean isInfinite_impl/* $FF was: isInfinite-impl*/(long arg0) {
      return arg0 == INFINITE || arg0 == NEG_INFINITE;
   }

   public static final boolean isFinite_impl/* $FF was: isFinite-impl*/(long arg0) {
      return !isInfinite-impl(arg0);
   }

   public static final long getAbsoluteValue_UwyO8pc/* $FF was: getAbsoluteValue-UwyO8pc*/(long arg0) {
      return isNegative-impl(arg0) ? unaryMinus-UwyO8pc(arg0) : arg0;
   }

   public static int compareTo_LRDsOJo/* $FF was: compareTo-LRDsOJo*/(long arg0, long other) {
      long compareBits = arg0 ^ other;
      if (compareBits >= 0L && ((int)compareBits & 1) != 0) {
         int var7 = false;
         int var10000 = (int)arg0 & 1;
         var7 = false;
         int r = var10000 - ((int)other & 1);
         return isNegative-impl(arg0) ? -r : r;
      } else {
         return Intrinsics.compare(arg0, other);
      }
   }

   public int compareTo_LRDsOJo/* $FF was: compareTo-LRDsOJo*/(long other) {
      return compareTo-LRDsOJo(this.rawValue, other);
   }

   public static final <T> T toComponents_impl/* $FF was: toComponents-impl*/(long arg0, @NotNull Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
      Intrinsics.checkNotNullParameter(action, "action");
      int var3 = false;
      return action.invoke(getInWholeDays-impl(arg0), getHoursComponent-impl(arg0), getMinutesComponent-impl(arg0), getSecondsComponent-impl(arg0), getNanosecondsComponent-impl(arg0));
   }

   public static final <T> T toComponents_impl/* $FF was: toComponents-impl*/(long arg0, @NotNull Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
      Intrinsics.checkNotNullParameter(action, "action");
      int var3 = false;
      return action.invoke(getInWholeHours-impl(arg0), getMinutesComponent-impl(arg0), getSecondsComponent-impl(arg0), getNanosecondsComponent-impl(arg0));
   }

   public static final <T> T toComponents_impl/* $FF was: toComponents-impl*/(long arg0, @NotNull Function3<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
      Intrinsics.checkNotNullParameter(action, "action");
      int var3 = false;
      return action.invoke(getInWholeMinutes-impl(arg0), getSecondsComponent-impl(arg0), getNanosecondsComponent-impl(arg0));
   }

   public static final <T> T toComponents_impl/* $FF was: toComponents-impl*/(long arg0, @NotNull Function2<? super Long, ? super Integer, ? extends T> action) {
      Intrinsics.checkNotNullParameter(action, "action");
      int var3 = false;
      return action.invoke(getInWholeSeconds-impl(arg0), getNanosecondsComponent-impl(arg0));
   }

   public static final int getHoursComponent_impl/* $FF was: getHoursComponent-impl*/(long arg0) {
      return isInfinite-impl(arg0) ? 0 : (int)(getInWholeHours-impl(arg0) % (long)24);
   }

   /** @deprecated */
   // $FF: synthetic method
   @PublishedApi
   public static void getHoursComponent$annotations() {
   }

   public static final int getMinutesComponent_impl/* $FF was: getMinutesComponent-impl*/(long arg0) {
      return isInfinite-impl(arg0) ? 0 : (int)(getInWholeMinutes-impl(arg0) % (long)60);
   }

   /** @deprecated */
   // $FF: synthetic method
   @PublishedApi
   public static void getMinutesComponent$annotations() {
   }

   public static final int getSecondsComponent_impl/* $FF was: getSecondsComponent-impl*/(long arg0) {
      return isInfinite-impl(arg0) ? 0 : (int)(getInWholeSeconds-impl(arg0) % (long)60);
   }

   /** @deprecated */
   // $FF: synthetic method
   @PublishedApi
   public static void getSecondsComponent$annotations() {
   }

   public static final int getNanosecondsComponent_impl/* $FF was: getNanosecondsComponent-impl*/(long arg0) {
      return isInfinite-impl(arg0) ? 0 : (isInMillis-impl(arg0) ? (int)DurationKt.access$millisToNanos(getValue-impl(arg0) % (long)1000) : (int)(getValue-impl(arg0) % (long)1000000000));
   }

   /** @deprecated */
   // $FF: synthetic method
   @PublishedApi
   public static void getNanosecondsComponent$annotations() {
   }

   public static final double toDouble_impl/* $FF was: toDouble-impl*/(long arg0, @NotNull DurationUnit unit) {
      Intrinsics.checkNotNullParameter(unit, "unit");
      return arg0 == INFINITE ? Double.POSITIVE_INFINITY : (arg0 == NEG_INFINITE ? Double.NEGATIVE_INFINITY : DurationUnitKt.convertDurationUnit((double)getValue-impl(arg0), getStorageUnit-impl(arg0), unit));
   }

   public static final long toLong_impl/* $FF was: toLong-impl*/(long arg0, @NotNull DurationUnit unit) {
      Intrinsics.checkNotNullParameter(unit, "unit");
      return arg0 == INFINITE ? Long.MAX_VALUE : (arg0 == NEG_INFINITE ? Long.MIN_VALUE : DurationUnitKt.convertDurationUnit(getValue-impl(arg0), getStorageUnit-impl(arg0), unit));
   }

   public static final int toInt_impl/* $FF was: toInt-impl*/(long arg0, @NotNull DurationUnit unit) {
      Intrinsics.checkNotNullParameter(unit, "unit");
      return (int)RangesKt.coerceIn(toLong-impl(arg0, unit), -2147483648L, 2147483647L);
   }

   public static final long getInWholeDays_impl/* $FF was: getInWholeDays-impl*/(long arg0) {
      return toLong-impl(arg0, DurationUnit.DAYS);
   }

   public static final long getInWholeHours_impl/* $FF was: getInWholeHours-impl*/(long arg0) {
      return toLong-impl(arg0, DurationUnit.HOURS);
   }

   public static final long getInWholeMinutes_impl/* $FF was: getInWholeMinutes-impl*/(long arg0) {
      return toLong-impl(arg0, DurationUnit.MINUTES);
   }

   public static final long getInWholeSeconds_impl/* $FF was: getInWholeSeconds-impl*/(long arg0) {
      return toLong-impl(arg0, DurationUnit.SECONDS);
   }

   public static final long getInWholeMilliseconds_impl/* $FF was: getInWholeMilliseconds-impl*/(long arg0) {
      return isInMillis-impl(arg0) && isFinite-impl(arg0) ? getValue-impl(arg0) : toLong-impl(arg0, DurationUnit.MILLISECONDS);
   }

   public static final long getInWholeMicroseconds_impl/* $FF was: getInWholeMicroseconds-impl*/(long arg0) {
      return toLong-impl(arg0, DurationUnit.MICROSECONDS);
   }

   public static final long getInWholeNanoseconds_impl/* $FF was: getInWholeNanoseconds-impl*/(long arg0) {
      long value = getValue-impl(arg0);
      return isInNanos-impl(arg0) ? value : (value > 9223372036854L ? Long.MAX_VALUE : (value < -9223372036854L ? Long.MIN_VALUE : DurationKt.access$millisToNanos(value)));
   }

   @NotNull
   public static String toString_impl/* $FF was: toString-impl*/(long arg0) {
      String var10000;
      if (arg0 == 0L) {
         var10000 = "0s";
      } else if (arg0 == INFINITE) {
         var10000 = "Infinity";
      } else if (arg0 == NEG_INFINITE) {
         var10000 = "-Infinity";
      } else {
         boolean isNegative = isNegative-impl(arg0);
         StringBuilder var5 = new StringBuilder();
         int var7 = false;
         if (isNegative) {
            var5.append('-');
         }

         long arg0$iv = getAbsoluteValue-UwyO8pc(arg0);
         int var10 = false;
         long var23 = getInWholeDays-impl(arg0$iv);
         int var10001 = getHoursComponent-impl(arg0$iv);
         int var10002 = getMinutesComponent-impl(arg0$iv);
         int var10003 = getSecondsComponent-impl(arg0$iv);
         int nanoseconds = getNanosecondsComponent-impl(arg0$iv);
         int seconds = var10003;
         int minutes = var10002;
         int hours = var10001;
         long days = var23;
         int var17 = false;
         boolean hasDays = days != 0L;
         boolean hasHours = hours != 0;
         boolean hasMinutes = minutes != 0;
         boolean hasSeconds = seconds != 0 || nanoseconds != 0;
         int components = 0;
         if (hasDays) {
            var5.append(days).append('d');
            ++components;
         }

         if (hasHours || hasDays && (hasMinutes || hasSeconds)) {
            if (components++ > 0) {
               var5.append(' ');
            }

            var5.append(hours).append('h');
         }

         if (hasMinutes || hasSeconds && (hasHours || hasDays)) {
            if (components++ > 0) {
               var5.append(' ');
            }

            var5.append(minutes).append('m');
         }

         if (hasSeconds) {
            if (components++ > 0) {
               var5.append(' ');
            }

            if (seconds == 0 && !hasDays && !hasHours && !hasMinutes) {
               if (nanoseconds >= 1000000) {
                  appendFractional-impl(arg0, var5, nanoseconds / 1000000, nanoseconds % 1000000, 6, "ms", false);
               } else if (nanoseconds >= 1000) {
                  appendFractional-impl(arg0, var5, nanoseconds / 1000, nanoseconds % 1000, 3, "us", false);
               } else {
                  var5.append(nanoseconds).append("ns");
               }
            } else {
               appendFractional-impl(arg0, var5, seconds, nanoseconds, 9, "s", false);
            }
         }

         if (isNegative && components > 1) {
            var5.insert(1, '(').append(')');
         }

         var10000 = var5.toString();
      }

      return var10000;
   }

   @NotNull
   public String toString() {
      return toString-impl(this.rawValue);
   }

   private static final void appendFractional_impl/* $FF was: appendFractional-impl*/(long arg0, StringBuilder $this$appendFractional, int whole, int fractional, int fractionalSize, String unit, boolean isoZeroes) {
      $this$appendFractional.append(whole);
      if (fractional != 0) {
         String fracString;
         int var10000;
         label33: {
            $this$appendFractional.append('.');
            fracString = StringsKt.padStart(String.valueOf(fractional), fractionalSize, '0');
            CharSequence $this$indexOfLast$iv = (CharSequence)fracString;
            int $i$f$indexOfLast = false;
            int var12 = $this$indexOfLast$iv.length() + -1;
            if (0 <= var12) {
               do {
                  int index$iv = var12--;
                  char it = $this$indexOfLast$iv.charAt(index$iv);
                  int var15 = false;
                  if (it != '0') {
                     var10000 = index$iv;
                     break label33;
                  }
               } while(0 <= var12);
            }

            var10000 = -1;
         }

         int nonZeroDigits = var10000 + 1;
         if (!isoZeroes && nonZeroDigits < 3) {
            Intrinsics.checkNotNullExpressionValue($this$appendFractional.append((CharSequence)fracString, 0, nonZeroDigits), "append(...)");
         } else {
            Intrinsics.checkNotNullExpressionValue($this$appendFractional.append((CharSequence)fracString, 0, (nonZeroDigits + 2) / 3 * 3), "append(...)");
         }
      }

      $this$appendFractional.append(unit);
   }

   @NotNull
   public static final String toString_impl/* $FF was: toString-impl*/(long arg0, @NotNull DurationUnit unit, int decimals) {
      Intrinsics.checkNotNullParameter(unit, "unit");
      if (decimals < 0) {
         int var5 = false;
         String var6 = "decimals must be not negative, but was " + decimals;
         throw new IllegalArgumentException(var6.toString());
      } else {
         double number = toDouble-impl(arg0, unit);
         return Double.isInfinite(number) ? String.valueOf(number) : DurationJvmKt.formatToExactDecimals(number, RangesKt.coerceAtMost(decimals, 12)) + DurationUnitKt.shortName(unit);
      }
   }

   // $FF: synthetic method
   public static String toString_impl$default/* $FF was: toString-impl$default*/(long var0, DurationUnit var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var3 = 0;
      }

      return toString-impl(var0, var2, var3);
   }

   @NotNull
   public static final String toIsoString_impl/* $FF was: toIsoString-impl*/(long arg0) {
      StringBuilder var2 = new StringBuilder();
      int var4 = false;
      if (isNegative-impl(arg0)) {
         var2.append('-');
      }

      var2.append("PT");
      long arg0$iv = getAbsoluteValue-UwyO8pc(arg0);
      int var7 = false;
      long var10000 = getInWholeHours-impl(arg0$iv);
      int var10001 = getMinutesComponent-impl(arg0$iv);
      int var10002 = getSecondsComponent-impl(arg0$iv);
      int nanoseconds = getNanosecondsComponent-impl(arg0$iv);
      int seconds = var10002;
      int minutes = var10001;
      long hours = var10000;
      int var13 = false;
      long hours = hours;
      if (isInfinite-impl(arg0)) {
         hours = 9999999999999L;
      }

      boolean hasHours = hours != 0L;
      boolean hasSeconds = seconds != 0 || nanoseconds != 0;
      boolean hasMinutes = minutes != 0 || hasSeconds && hasHours;
      if (hasHours) {
         var2.append(hours).append('H');
      }

      if (hasMinutes) {
         var2.append(minutes).append('M');
      }

      if (hasSeconds || !hasHours && !hasMinutes) {
         appendFractional-impl(arg0, var2, seconds, nanoseconds, 9, "S", true);
      }

      return var2.toString();
   }

   public static int hashCode_impl/* $FF was: hashCode-impl*/(long arg0) {
      return Long.hashCode(arg0);
   }

   public int hashCode() {
      return hashCode-impl(this.rawValue);
   }

   public static boolean equals_impl/* $FF was: equals-impl*/(long arg0, Object other) {
      if (!(other instanceof Duration)) {
         return false;
      } else {
         long var3 = ((Duration)other).unbox-impl();
         return arg0 == var3;
      }
   }

   public boolean equals(Object other) {
      return equals-impl(this.rawValue, other);
   }

   // $FF: synthetic method
   private Duration(long rawValue) {
      this.rawValue = rawValue;
   }

   public static long constructor_impl/* $FF was: constructor-impl*/(long rawValue) {
      if (DurationJvmKt.getDurationAssertionsEnabled()) {
         long var4;
         if (isInNanos-impl(rawValue)) {
            var4 = getValue-impl(rawValue);
            if (!(-4611686018426999999L <= var4 ? var4 < 4611686018427000000L : false)) {
               throw new AssertionError(getValue-impl(rawValue) + " ns is out of nanoseconds range");
            }
         } else {
            var4 = getValue-impl(rawValue);
            if (!(-4611686018427387903L <= var4 ? var4 < 4611686018427387904L : false)) {
               throw new AssertionError(getValue-impl(rawValue) + " ms is out of milliseconds range");
            }

            var4 = getValue-impl(rawValue);
            if (-4611686018426L <= var4 ? var4 < 4611686018427L : false) {
               throw new AssertionError(getValue-impl(rawValue) + " ms is denormalized");
            }
         }
      }

      return rawValue;
   }

   // $FF: synthetic method
   public static final Duration box_impl/* $FF was: box-impl*/(long v) {
      return new Duration(v);
   }

   // $FF: synthetic method
   public final long unbox_impl/* $FF was: unbox-impl*/() {
      return this.rawValue;
   }

   public static final boolean equals_impl0/* $FF was: equals-impl0*/(long p1, long p2) {
      return p1 == p2;
   }

   public static final class Companion {
      private Companion() {
      }

      public final long getZERO_UwyO8pc/* $FF was: getZERO-UwyO8pc*/() {
         return Duration.ZERO;
      }

      public final long getINFINITE_UwyO8pc/* $FF was: getINFINITE-UwyO8pc*/() {
         return Duration.INFINITE;
      }

      public final long getNEG_INFINITE_UwyO8pc$kotlin_stdlib/* $FF was: getNEG_INFINITE-UwyO8pc$kotlin_stdlib*/() {
         return Duration.NEG_INFINITE;
      }

      @ExperimentalTime
      public final double convert(double value, @NotNull DurationUnit sourceUnit, @NotNull DurationUnit targetUnit) {
         Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
         Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
         return DurationUnitKt.convertDurationUnit(value, sourceUnit, targetUnit);
      }

      private final long getNanoseconds_UwyO8pc/* $FF was: getNanoseconds-UwyO8pc*/(int $this$nanoseconds) {
         return DurationKt.toDuration($this$nanoseconds, DurationUnit.NANOSECONDS);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getNanoseconds_UwyO8pc$annotations/* $FF was: getNanoseconds-UwyO8pc$annotations*/(int <this>) {
      }

      private final long getNanoseconds_UwyO8pc/* $FF was: getNanoseconds-UwyO8pc*/(long $this$nanoseconds) {
         return DurationKt.toDuration($this$nanoseconds, DurationUnit.NANOSECONDS);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getNanoseconds_UwyO8pc$annotations/* $FF was: getNanoseconds-UwyO8pc$annotations*/(long <this>) {
      }

      private final long getNanoseconds_UwyO8pc/* $FF was: getNanoseconds-UwyO8pc*/(double $this$nanoseconds) {
         return DurationKt.toDuration($this$nanoseconds, DurationUnit.NANOSECONDS);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getNanoseconds_UwyO8pc$annotations/* $FF was: getNanoseconds-UwyO8pc$annotations*/(double <this>) {
      }

      private final long getMicroseconds_UwyO8pc/* $FF was: getMicroseconds-UwyO8pc*/(int $this$microseconds) {
         return DurationKt.toDuration($this$microseconds, DurationUnit.MICROSECONDS);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getMicroseconds_UwyO8pc$annotations/* $FF was: getMicroseconds-UwyO8pc$annotations*/(int <this>) {
      }

      private final long getMicroseconds_UwyO8pc/* $FF was: getMicroseconds-UwyO8pc*/(long $this$microseconds) {
         return DurationKt.toDuration($this$microseconds, DurationUnit.MICROSECONDS);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getMicroseconds_UwyO8pc$annotations/* $FF was: getMicroseconds-UwyO8pc$annotations*/(long <this>) {
      }

      private final long getMicroseconds_UwyO8pc/* $FF was: getMicroseconds-UwyO8pc*/(double $this$microseconds) {
         return DurationKt.toDuration($this$microseconds, DurationUnit.MICROSECONDS);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getMicroseconds_UwyO8pc$annotations/* $FF was: getMicroseconds-UwyO8pc$annotations*/(double <this>) {
      }

      private final long getMilliseconds_UwyO8pc/* $FF was: getMilliseconds-UwyO8pc*/(int $this$milliseconds) {
         return DurationKt.toDuration($this$milliseconds, DurationUnit.MILLISECONDS);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getMilliseconds_UwyO8pc$annotations/* $FF was: getMilliseconds-UwyO8pc$annotations*/(int <this>) {
      }

      private final long getMilliseconds_UwyO8pc/* $FF was: getMilliseconds-UwyO8pc*/(long $this$milliseconds) {
         return DurationKt.toDuration($this$milliseconds, DurationUnit.MILLISECONDS);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getMilliseconds_UwyO8pc$annotations/* $FF was: getMilliseconds-UwyO8pc$annotations*/(long <this>) {
      }

      private final long getMilliseconds_UwyO8pc/* $FF was: getMilliseconds-UwyO8pc*/(double $this$milliseconds) {
         return DurationKt.toDuration($this$milliseconds, DurationUnit.MILLISECONDS);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getMilliseconds_UwyO8pc$annotations/* $FF was: getMilliseconds-UwyO8pc$annotations*/(double <this>) {
      }

      private final long getSeconds_UwyO8pc/* $FF was: getSeconds-UwyO8pc*/(int $this$seconds) {
         return DurationKt.toDuration($this$seconds, DurationUnit.SECONDS);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getSeconds_UwyO8pc$annotations/* $FF was: getSeconds-UwyO8pc$annotations*/(int <this>) {
      }

      private final long getSeconds_UwyO8pc/* $FF was: getSeconds-UwyO8pc*/(long $this$seconds) {
         return DurationKt.toDuration($this$seconds, DurationUnit.SECONDS);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getSeconds_UwyO8pc$annotations/* $FF was: getSeconds-UwyO8pc$annotations*/(long <this>) {
      }

      private final long getSeconds_UwyO8pc/* $FF was: getSeconds-UwyO8pc*/(double $this$seconds) {
         return DurationKt.toDuration($this$seconds, DurationUnit.SECONDS);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getSeconds_UwyO8pc$annotations/* $FF was: getSeconds-UwyO8pc$annotations*/(double <this>) {
      }

      private final long getMinutes_UwyO8pc/* $FF was: getMinutes-UwyO8pc*/(int $this$minutes) {
         return DurationKt.toDuration($this$minutes, DurationUnit.MINUTES);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getMinutes_UwyO8pc$annotations/* $FF was: getMinutes-UwyO8pc$annotations*/(int <this>) {
      }

      private final long getMinutes_UwyO8pc/* $FF was: getMinutes-UwyO8pc*/(long $this$minutes) {
         return DurationKt.toDuration($this$minutes, DurationUnit.MINUTES);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getMinutes_UwyO8pc$annotations/* $FF was: getMinutes-UwyO8pc$annotations*/(long <this>) {
      }

      private final long getMinutes_UwyO8pc/* $FF was: getMinutes-UwyO8pc*/(double $this$minutes) {
         return DurationKt.toDuration($this$minutes, DurationUnit.MINUTES);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getMinutes_UwyO8pc$annotations/* $FF was: getMinutes-UwyO8pc$annotations*/(double <this>) {
      }

      private final long getHours_UwyO8pc/* $FF was: getHours-UwyO8pc*/(int $this$hours) {
         return DurationKt.toDuration($this$hours, DurationUnit.HOURS);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getHours_UwyO8pc$annotations/* $FF was: getHours-UwyO8pc$annotations*/(int <this>) {
      }

      private final long getHours_UwyO8pc/* $FF was: getHours-UwyO8pc*/(long $this$hours) {
         return DurationKt.toDuration($this$hours, DurationUnit.HOURS);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getHours_UwyO8pc$annotations/* $FF was: getHours-UwyO8pc$annotations*/(long <this>) {
      }

      private final long getHours_UwyO8pc/* $FF was: getHours-UwyO8pc*/(double $this$hours) {
         return DurationKt.toDuration($this$hours, DurationUnit.HOURS);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getHours_UwyO8pc$annotations/* $FF was: getHours-UwyO8pc$annotations*/(double <this>) {
      }

      private final long getDays_UwyO8pc/* $FF was: getDays-UwyO8pc*/(int $this$days) {
         return DurationKt.toDuration($this$days, DurationUnit.DAYS);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getDays_UwyO8pc$annotations/* $FF was: getDays-UwyO8pc$annotations*/(int <this>) {
      }

      private final long getDays_UwyO8pc/* $FF was: getDays-UwyO8pc*/(long $this$days) {
         return DurationKt.toDuration($this$days, DurationUnit.DAYS);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getDays_UwyO8pc$annotations/* $FF was: getDays-UwyO8pc$annotations*/(long <this>) {
      }

      private final long getDays_UwyO8pc/* $FF was: getDays-UwyO8pc*/(double $this$days) {
         return DurationKt.toDuration($this$days, DurationUnit.DAYS);
      }

      /** @deprecated */
      // $FF: synthetic method
      @InlineOnly
      public static void getDays_UwyO8pc$annotations/* $FF was: getDays-UwyO8pc$annotations*/(double <this>) {
      }

      public final long parse_UwyO8pc/* $FF was: parse-UwyO8pc*/(@NotNull String value) {
         Intrinsics.checkNotNullParameter(value, "value");

         try {
            long var2 = DurationKt.access$parseDuration(value, false);
            return var2;
         } catch (IllegalArgumentException var5) {
            throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", (Throwable)var5);
         }
      }

      public final long parseIsoString_UwyO8pc/* $FF was: parseIsoString-UwyO8pc*/(@NotNull String value) {
         Intrinsics.checkNotNullParameter(value, "value");

         try {
            long var2 = DurationKt.access$parseDuration(value, true);
            return var2;
         } catch (IllegalArgumentException var5) {
            throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", (Throwable)var5);
         }
      }

      @Nullable
      public final Duration parseOrNull_FghU774/* $FF was: parseOrNull-FghU774*/(@NotNull String value) {
         Intrinsics.checkNotNullParameter(value, "value");

         Duration var2;
         try {
            var2 = Duration.box-impl(DurationKt.access$parseDuration(value, false));
         } catch (IllegalArgumentException var4) {
            var2 = null;
         }

         return var2;
      }

      @Nullable
      public final Duration parseIsoStringOrNull_FghU774/* $FF was: parseIsoStringOrNull-FghU774*/(@NotNull String value) {
         Intrinsics.checkNotNullParameter(value, "value");

         Duration var2;
         try {
            var2 = Duration.box-impl(DurationKt.access$parseDuration(value, true));
         } catch (IllegalArgumentException var4) {
            var2 = null;
         }

         return var2;
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
