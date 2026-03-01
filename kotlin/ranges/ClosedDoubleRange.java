package kotlin.ranges;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class ClosedDoubleRange implements ClosedFloatingPointRange<Double> {
   private final double _start;
   private final double _endInclusive;

   public ClosedDoubleRange(double start, double endInclusive) {
      this._start = start;
      this._endInclusive = endInclusive;
   }

   @NotNull
   public Double getStart() {
      return this._start;
   }

   @NotNull
   public Double getEndInclusive() {
      return this._endInclusive;
   }

   public boolean lessThanOrEquals(double a, double b) {
      return a <= b;
   }

   public boolean contains(double value) {
      return value >= this._start && value <= this._endInclusive;
   }

   public boolean isEmpty() {
      return !(this._start <= this._endInclusive);
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof ClosedDoubleRange && (this.isEmpty() && ((ClosedDoubleRange)other).isEmpty() || this._start == ((ClosedDoubleRange)other)._start && this._endInclusive == ((ClosedDoubleRange)other)._endInclusive);
   }

   public int hashCode() {
      return this.isEmpty() ? -1 : 31 * Double.hashCode(this._start) + Double.hashCode(this._endInclusive);
   }

   @NotNull
   public String toString() {
      return this._start + ".." + this._endInclusive;
   }
}
