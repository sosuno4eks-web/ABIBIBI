package kotlin.time;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(
   version = "1.3"
)
public final class MonotonicTimeSource implements TimeSource.WithComparableMarks {
   @NotNull
   public static final MonotonicTimeSource INSTANCE = new MonotonicTimeSource();
   private static final long zero = System.nanoTime();

   private MonotonicTimeSource() {
   }

   private final long read() {
      return System.nanoTime() - zero;
   }

   @NotNull
   public String toString() {
      return "TimeSource(System.nanoTime())";
   }

   public long markNow_z9LOYto/* $FF was: markNow-z9LOYto*/() {
      return TimeSource.Monotonic.ValueTimeMark.constructor-impl(this.read());
   }

   public final long elapsedFrom_6eNON_k/* $FF was: elapsedFrom-6eNON_k*/(long timeMark) {
      return LongSaturatedMathKt.saturatingDiff(this.read(), timeMark, DurationUnit.NANOSECONDS);
   }

   public final long differenceBetween_fRLX17w/* $FF was: differenceBetween-fRLX17w*/(long one, long another) {
      return LongSaturatedMathKt.saturatingOriginsDiff(one, another, DurationUnit.NANOSECONDS);
   }

   public final long adjustReading_6QKq23U/* $FF was: adjustReading-6QKq23U*/(long timeMark, long duration) {
      return TimeSource.Monotonic.ValueTimeMark.constructor-impl(LongSaturatedMathKt.saturatingAdd-NuflL3o(timeMark, DurationUnit.NANOSECONDS, duration));
   }
}
