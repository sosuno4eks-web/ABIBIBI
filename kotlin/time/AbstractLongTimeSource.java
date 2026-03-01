package kotlin.time;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.9"
)
@WasExperimental(
   markerClass = {ExperimentalTime.class}
)
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {
   @NotNull
   private final DurationUnit unit;
   @NotNull
   private final Lazy zero$delegate;

   public AbstractLongTimeSource(@NotNull DurationUnit unit) {
      Intrinsics.checkNotNullParameter(unit, "unit");
      super();
      this.unit = unit;
      this.zero$delegate = LazyKt.lazy(AbstractLongTimeSource::zero_delegate$lambda$0);
   }

   @NotNull
   protected final DurationUnit getUnit() {
      return this.unit;
   }

   protected abstract long read();

   private final long getZero() {
      Lazy var1 = this.zero$delegate;
      return ((Number)var1.getValue()).longValue();
   }

   private final long adjustedRead() {
      return this.read() - this.getZero();
   }

   @NotNull
   public ComparableTimeMark markNow() {
      return (ComparableTimeMark)(new AbstractLongTimeSource.LongTimeMark(this.adjustedRead(), this, Duration.Companion.getZERO-UwyO8pc(), (DefaultConstructorMarker)null));
   }

   private static final long zero_delegate$lambda$0(AbstractLongTimeSource this$0) {
      return this$0.read();
   }

   private static final class LongTimeMark implements ComparableTimeMark {
      private final long startedAt;
      @NotNull
      private final AbstractLongTimeSource timeSource;
      private final long offset;

      private LongTimeMark(long startedAt, AbstractLongTimeSource timeSource, long offset) {
         Intrinsics.checkNotNullParameter(timeSource, "timeSource");
         super();
         this.startedAt = startedAt;
         this.timeSource = timeSource;
         this.offset = offset;
      }

      public long elapsedNow_UwyO8pc/* $FF was: elapsedNow-UwyO8pc*/() {
         return Duration.minus-LRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.timeSource.adjustedRead(), this.startedAt, this.timeSource.getUnit()), this.offset);
      }

      @NotNull
      public ComparableTimeMark plus_LRDsOJo/* $FF was: plus-LRDsOJo*/(long duration) {
         DurationUnit unit = this.timeSource.getUnit();
         long durationInUnit;
         if (Duration.isInfinite-impl(duration)) {
            durationInUnit = LongSaturatedMathKt.saturatingAdd-NuflL3o(this.startedAt, unit, duration);
            return (ComparableTimeMark)(new AbstractLongTimeSource.LongTimeMark(durationInUnit, this.timeSource, Duration.Companion.getZERO-UwyO8pc(), (DefaultConstructorMarker)null));
         } else {
            durationInUnit = Duration.truncateTo-UwyO8pc$kotlin_stdlib(duration, unit);
            long rest = Duration.plus-LRDsOJo(Duration.minus-LRDsOJo(duration, durationInUnit), this.offset);
            long sum = LongSaturatedMathKt.saturatingAdd-NuflL3o(this.startedAt, unit, durationInUnit);
            long restInUnit = Duration.truncateTo-UwyO8pc$kotlin_stdlib(rest, unit);
            sum = LongSaturatedMathKt.saturatingAdd-NuflL3o(sum, unit, restInUnit);
            long restUnderUnit = Duration.minus-LRDsOJo(rest, restInUnit);
            long restUnderUnitNs = Duration.getInWholeNanoseconds-impl(restUnderUnit);
            if (sum != 0L && restUnderUnitNs != 0L && (sum ^ restUnderUnitNs) < 0L) {
               long correction = DurationKt.toDuration(MathKt.getSign(restUnderUnitNs), unit);
               sum = LongSaturatedMathKt.saturatingAdd-NuflL3o(sum, unit, correction);
               restUnderUnit = Duration.minus-LRDsOJo(restUnderUnit, correction);
            }

            int $i$f$isSaturated = false;
            long newOffset = (sum - 1L | 1L) == Long.MAX_VALUE ? Duration.Companion.getZERO-UwyO8pc() : restUnderUnit;
            return (ComparableTimeMark)(new AbstractLongTimeSource.LongTimeMark(sum, this.timeSource, newOffset, (DefaultConstructorMarker)null));
         }
      }

      public long minus_UwyO8pc/* $FF was: minus-UwyO8pc*/(@NotNull ComparableTimeMark other) {
         Intrinsics.checkNotNullParameter(other, "other");
         if (other instanceof AbstractLongTimeSource.LongTimeMark && Intrinsics.areEqual((Object)this.timeSource, (Object)((AbstractLongTimeSource.LongTimeMark)other).timeSource)) {
            long startedAtDiff = LongSaturatedMathKt.saturatingOriginsDiff(this.startedAt, ((AbstractLongTimeSource.LongTimeMark)other).startedAt, this.timeSource.getUnit());
            return Duration.plus-LRDsOJo(startedAtDiff, Duration.minus-LRDsOJo(this.offset, ((AbstractLongTimeSource.LongTimeMark)other).offset));
         } else {
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
         }
      }

      public boolean equals(@Nullable Object other) {
         return other instanceof AbstractLongTimeSource.LongTimeMark && Intrinsics.areEqual((Object)this.timeSource, (Object)((AbstractLongTimeSource.LongTimeMark)other).timeSource) && Duration.equals-impl0(this.minus-UwyO8pc((ComparableTimeMark)other), Duration.Companion.getZERO-UwyO8pc());
      }

      public int hashCode() {
         return Duration.hashCode-impl(this.offset) * 37 + Long.hashCode(this.startedAt);
      }

      @NotNull
      public String toString() {
         return "LongTimeMark(" + this.startedAt + DurationUnitKt.shortName(this.timeSource.getUnit()) + " + " + Duration.toString-impl(this.offset) + ", " + this.timeSource + ')';
      }

      @NotNull
      public ComparableTimeMark minus_LRDsOJo/* $FF was: minus-LRDsOJo*/(long duration) {
         return ComparableTimeMark.DefaultImpls.minus-LRDsOJo(this, duration);
      }

      public int compareTo(@NotNull ComparableTimeMark other) {
         return ComparableTimeMark.DefaultImpls.compareTo(this, other);
      }

      public boolean hasPassedNow() {
         return ComparableTimeMark.DefaultImpls.hasPassedNow(this);
      }

      public boolean hasNotPassedNow() {
         return ComparableTimeMark.DefaultImpls.hasNotPassedNow(this);
      }

      // $FF: synthetic method
      public LongTimeMark(long startedAt, AbstractLongTimeSource timeSource, long offset, DefaultConstructorMarker $constructor_marker) {
         this(startedAt, timeSource, offset);
      }
   }
}
