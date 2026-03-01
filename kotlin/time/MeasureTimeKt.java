package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class MeasureTimeKt {
   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalTime.class}
   )
   public static final long measureTime(@NotNull Function0<Unit> block) {
      Intrinsics.checkNotNullParameter(block, "block");
      int $i$f$measureTime = false;
      TimeSource.Monotonic $this$measureTime$iv = TimeSource.Monotonic.INSTANCE;
      int $i$f$measureTime = false;
      long mark$iv = $this$measureTime$iv.markNow-z9LOYto();
      block.invoke();
      return TimeSource.Monotonic.ValueTimeMark.elapsedNow-UwyO8pc(mark$iv);
   }

   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalTime.class}
   )
   public static final long measureTime(@NotNull TimeSource $this$measureTime, @NotNull Function0<Unit> block) {
      Intrinsics.checkNotNullParameter($this$measureTime, "<this>");
      Intrinsics.checkNotNullParameter(block, "block");
      int $i$f$measureTime = false;
      TimeMark mark = $this$measureTime.markNow();
      block.invoke();
      return mark.elapsedNow-UwyO8pc();
   }

   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalTime.class}
   )
   public static final long measureTime(@NotNull TimeSource.Monotonic $this$measureTime, @NotNull Function0<Unit> block) {
      Intrinsics.checkNotNullParameter($this$measureTime, "<this>");
      Intrinsics.checkNotNullParameter(block, "block");
      int $i$f$measureTime = false;
      long mark = $this$measureTime.markNow-z9LOYto();
      block.invoke();
      return TimeSource.Monotonic.ValueTimeMark.elapsedNow-UwyO8pc(mark);
   }

   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalTime.class}
   )
   @NotNull
   public static final <T> TimedValue<T> measureTimedValue(@NotNull Function0<? extends T> block) {
      Intrinsics.checkNotNullParameter(block, "block");
      int $i$f$measureTimedValue = false;
      TimeSource.Monotonic $this$measureTimedValue$iv = TimeSource.Monotonic.INSTANCE;
      int $i$f$measureTimedValue = false;
      long mark$iv = $this$measureTimedValue$iv.markNow-z9LOYto();
      Object result$iv = block.invoke();
      return new TimedValue(result$iv, TimeSource.Monotonic.ValueTimeMark.elapsedNow-UwyO8pc(mark$iv), (DefaultConstructorMarker)null);
   }

   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalTime.class}
   )
   @NotNull
   public static final <T> TimedValue<T> measureTimedValue(@NotNull TimeSource $this$measureTimedValue, @NotNull Function0<? extends T> block) {
      Intrinsics.checkNotNullParameter($this$measureTimedValue, "<this>");
      Intrinsics.checkNotNullParameter(block, "block");
      int $i$f$measureTimedValue = false;
      TimeMark mark = $this$measureTimedValue.markNow();
      Object result = block.invoke();
      return new TimedValue(result, mark.elapsedNow-UwyO8pc(), (DefaultConstructorMarker)null);
   }

   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalTime.class}
   )
   @NotNull
   public static final <T> TimedValue<T> measureTimedValue(@NotNull TimeSource.Monotonic $this$measureTimedValue, @NotNull Function0<? extends T> block) {
      Intrinsics.checkNotNullParameter($this$measureTimedValue, "<this>");
      Intrinsics.checkNotNullParameter(block, "block");
      int $i$f$measureTimedValue = false;
      long mark = $this$measureTimedValue.markNow-z9LOYto();
      Object result = block.invoke();
      return new TimedValue(result, TimeSource.Monotonic.ValueTimeMark.elapsedNow-UwyO8pc(mark), (DefaultConstructorMarker)null);
   }
}
