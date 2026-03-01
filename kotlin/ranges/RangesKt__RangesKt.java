package kotlin.ranges;

import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class RangesKt__RangesKt {
   @NotNull
   public static final <T extends Comparable<? super T>> ClosedRange<T> rangeTo(@NotNull T $this$rangeTo, @NotNull T that) {
      Intrinsics.checkNotNullParameter($this$rangeTo, "<this>");
      Intrinsics.checkNotNullParameter(that, "that");
      return (ClosedRange)(new ComparableRange($this$rangeTo, that));
   }

   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @NotNull
   public static final <T extends Comparable<? super T>> OpenEndRange<T> rangeUntil(@NotNull T $this$rangeUntil, @NotNull T that) {
      Intrinsics.checkNotNullParameter($this$rangeUntil, "<this>");
      Intrinsics.checkNotNullParameter(that, "that");
      return (OpenEndRange)(new ComparableOpenEndRange($this$rangeUntil, that));
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final ClosedFloatingPointRange<Double> rangeTo(double $this$rangeTo, double that) {
      return (ClosedFloatingPointRange)(new ClosedDoubleRange($this$rangeTo, that));
   }

   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @NotNull
   public static final OpenEndRange<Double> rangeUntil(double $this$rangeUntil, double that) {
      return (OpenEndRange)(new OpenEndDoubleRange($this$rangeUntil, that));
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final ClosedFloatingPointRange<Float> rangeTo(float $this$rangeTo, float that) {
      return (ClosedFloatingPointRange)(new ClosedFloatRange($this$rangeTo, that));
   }

   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @NotNull
   public static final OpenEndRange<Float> rangeUntil(float $this$rangeUntil, float that) {
      return (OpenEndRange)(new OpenEndFloatRange($this$rangeUntil, that));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <T, R extends ClosedRange<T> & Iterable<? extends T>> boolean contains(R $this$contains, T element) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return element != null && $this$contains.contains((Comparable)element);
   }

   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @InlineOnly
   private static final <T, R extends OpenEndRange<T> & Iterable<? extends T>> boolean contains(R $this$contains, T element) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return element != null && $this$contains.contains((Comparable)element);
   }

   public static final void checkStepIsPositive(boolean isPositive, @NotNull Number step) {
      Intrinsics.checkNotNullParameter(step, "step");
      if (!isPositive) {
         throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
      }
   }

   public RangesKt__RangesKt() {
   }
}
