package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class LongSaturatedMathKt {
   public static final long saturatingAdd_NuflL3o/* $FF was: saturatingAdd-NuflL3o*/(long value, @NotNull DurationUnit unit, long duration) {
      Intrinsics.checkNotNullParameter(unit, "unit");
      long durationInUnit = Duration.toLong-impl(duration, unit);
      int $i$f$isSaturated = false;
      if ((value - 1L | 1L) == Long.MAX_VALUE) {
         return checkInfiniteSumDefined-PjuGub4(value, duration, durationInUnit);
      } else {
         $i$f$isSaturated = false;
         if ((durationInUnit - 1L | 1L) == Long.MAX_VALUE) {
            return saturatingAddInHalves-NuflL3o(value, unit, duration);
         } else {
            long result = value + durationInUnit;
            if (((value ^ result) & (durationInUnit ^ result)) < 0L) {
               return value < 0L ? Long.MIN_VALUE : Long.MAX_VALUE;
            } else {
               return result;
            }
         }
      }
   }

   private static final long checkInfiniteSumDefined_PjuGub4/* $FF was: checkInfiniteSumDefined-PjuGub4*/(long value, long duration, long durationInUnit) {
      if (Duration.isInfinite-impl(duration) && (value ^ durationInUnit) < 0L) {
         throw new IllegalArgumentException("Summing infinities of different signs");
      } else {
         return value;
      }
   }

   private static final long saturatingAddInHalves_NuflL3o/* $FF was: saturatingAddInHalves-NuflL3o*/(long value, DurationUnit unit, long duration) {
      long half = Duration.div-UwyO8pc(duration, 2);
      long halfInUnit = Duration.toLong-impl(half, unit);
      int $i$f$isSaturated = false;
      return (halfInUnit - 1L | 1L) == Long.MAX_VALUE ? halfInUnit : saturatingAdd-NuflL3o(saturatingAdd-NuflL3o(value, unit, half), unit, Duration.minus-LRDsOJo(duration, half));
   }

   private static final long infinityOfSign(long value) {
      return value < 0L ? Duration.Companion.getNEG_INFINITE-UwyO8pc$kotlin_stdlib() : Duration.Companion.getINFINITE-UwyO8pc();
   }

   public static final long saturatingDiff(long valueNs, long origin, @NotNull DurationUnit unit) {
      Intrinsics.checkNotNullParameter(unit, "unit");
      int $i$f$isSaturated = false;
      return (origin - 1L | 1L) == Long.MAX_VALUE ? Duration.unaryMinus-UwyO8pc(infinityOfSign(origin)) : saturatingFiniteDiff(valueNs, origin, unit);
   }

   public static final long saturatingOriginsDiff(long origin1, long origin2, @NotNull DurationUnit unit) {
      Intrinsics.checkNotNullParameter(unit, "unit");
      int $i$f$isSaturated = false;
      if ((origin2 - 1L | 1L) == Long.MAX_VALUE) {
         return origin1 == origin2 ? Duration.Companion.getZERO-UwyO8pc() : Duration.unaryMinus-UwyO8pc(infinityOfSign(origin2));
      } else {
         $i$f$isSaturated = false;
         return (origin1 - 1L | 1L) == Long.MAX_VALUE ? infinityOfSign(origin1) : saturatingFiniteDiff(origin1, origin2, unit);
      }
   }

   private static final long saturatingFiniteDiff(long value1, long value2, DurationUnit unit) {
      long result = value1 - value2;
      if (((result ^ value1) & ~(result ^ value2)) < 0L) {
         if (unit.compareTo((Enum)DurationUnit.MILLISECONDS) < 0) {
            long unitsInMilli = DurationUnitKt.convertDurationUnit(1L, DurationUnit.MILLISECONDS, unit);
            long resultMs = value1 / unitsInMilli - value2 / unitsInMilli;
            long resultUnit = value1 % unitsInMilli - value2 % unitsInMilli;
            Duration.Companion var10000 = Duration.Companion;
            return Duration.plus-LRDsOJo(DurationKt.toDuration(resultMs, DurationUnit.MILLISECONDS), DurationKt.toDuration(resultUnit, unit));
         } else {
            return Duration.unaryMinus-UwyO8pc(infinityOfSign(result));
         }
      } else {
         return DurationKt.toDuration(result, unit);
      }
   }

   public static final boolean isSaturated(long $this$isSaturated) {
      int $i$f$isSaturated = false;
      return ($this$isSaturated - 1L | 1L) == Long.MAX_VALUE;
   }
}
