package kotlin.time;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/** @deprecated */
@Deprecated(
   message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.",
   level = DeprecationLevel.ERROR
)
@SinceKotlin(
   version = "1.3"
)
@ExperimentalTime
public abstract class AbstractDoubleTimeSource implements TimeSource.WithComparableMarks {
   @NotNull
   private final DurationUnit unit;

   public AbstractDoubleTimeSource(@NotNull DurationUnit unit) {
      Intrinsics.checkNotNullParameter(unit, "unit");
      super();
      this.unit = unit;
   }

   @NotNull
   protected final DurationUnit getUnit() {
      return this.unit;
   }

   protected abstract double read();

   @NotNull
   public ComparableTimeMark markNow() {
      return (ComparableTimeMark)(new AbstractDoubleTimeSource.DoubleTimeMark(this.read(), this, Duration.Companion.getZERO-UwyO8pc(), (DefaultConstructorMarker)null));
   }

   private static final class DoubleTimeMark implements ComparableTimeMark {
      private final double startedAt;
      @NotNull
      private final AbstractDoubleTimeSource timeSource;
      private final long offset;

      private DoubleTimeMark(double startedAt, AbstractDoubleTimeSource timeSource, long offset) {
         Intrinsics.checkNotNullParameter(timeSource, "timeSource");
         super();
         this.startedAt = startedAt;
         this.timeSource = timeSource;
         this.offset = offset;
      }

      public long elapsedNow_UwyO8pc/* $FF was: elapsedNow-UwyO8pc*/() {
         return Duration.minus-LRDsOJo(DurationKt.toDuration(this.timeSource.read() - this.startedAt, this.timeSource.getUnit()), this.offset);
      }

      @NotNull
      public ComparableTimeMark plus_LRDsOJo/* $FF was: plus-LRDsOJo*/(long duration) {
         return (ComparableTimeMark)(new AbstractDoubleTimeSource.DoubleTimeMark(this.startedAt, this.timeSource, Duration.plus-LRDsOJo(this.offset, duration), (DefaultConstructorMarker)null));
      }

      public long minus_UwyO8pc/* $FF was: minus-UwyO8pc*/(@NotNull ComparableTimeMark other) {
         Intrinsics.checkNotNullParameter(other, "other");
         if (other instanceof AbstractDoubleTimeSource.DoubleTimeMark && Intrinsics.areEqual((Object)this.timeSource, (Object)((AbstractDoubleTimeSource.DoubleTimeMark)other).timeSource)) {
            if (Duration.equals-impl0(this.offset, ((AbstractDoubleTimeSource.DoubleTimeMark)other).offset) && Duration.isInfinite-impl(this.offset)) {
               return Duration.Companion.getZERO-UwyO8pc();
            } else {
               long offsetDiff = Duration.minus-LRDsOJo(this.offset, ((AbstractDoubleTimeSource.DoubleTimeMark)other).offset);
               long startedAtDiff = DurationKt.toDuration(this.startedAt - ((AbstractDoubleTimeSource.DoubleTimeMark)other).startedAt, this.timeSource.getUnit());
               return Duration.equals-impl0(startedAtDiff, Duration.unaryMinus-UwyO8pc(offsetDiff)) ? Duration.Companion.getZERO-UwyO8pc() : Duration.plus-LRDsOJo(startedAtDiff, offsetDiff);
            }
         } else {
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
         }
      }

      public boolean equals(@Nullable Object other) {
         return other instanceof AbstractDoubleTimeSource.DoubleTimeMark && Intrinsics.areEqual((Object)this.timeSource, (Object)((AbstractDoubleTimeSource.DoubleTimeMark)other).timeSource) && Duration.equals-impl0(this.minus-UwyO8pc((ComparableTimeMark)other), Duration.Companion.getZERO-UwyO8pc());
      }

      public int hashCode() {
         return Duration.hashCode-impl(Duration.plus-LRDsOJo(DurationKt.toDuration(this.startedAt, this.timeSource.getUnit()), this.offset));
      }

      @NotNull
      public String toString() {
         return "DoubleTimeMark(" + this.startedAt + DurationUnitKt.shortName(this.timeSource.getUnit()) + " + " + Duration.toString-impl(this.offset) + ", " + this.timeSource + ')';
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
      public DoubleTimeMark(double startedAt, AbstractDoubleTimeSource timeSource, long offset, DefaultConstructorMarker $constructor_marker) {
         this(startedAt, timeSource, offset);
      }
   }
}
