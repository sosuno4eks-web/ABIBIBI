package kotlin.ranges;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class OpenEndDoubleRange implements OpenEndRange<Double> {
   private final double _start;
   private final double _endExclusive;

   public OpenEndDoubleRange(double start, double endExclusive) {
      this._start = start;
      this._endExclusive = endExclusive;
   }

   @NotNull
   public Double getStart() {
      return this._start;
   }

   @NotNull
   public Double getEndExclusive() {
      return this._endExclusive;
   }

   private final boolean lessThanOrEquals(double a, double b) {
      return a <= b;
   }

   public boolean contains(double value) {
      return value >= this._start && value < this._endExclusive;
   }

   public boolean isEmpty() {
      return !(this._start < this._endExclusive);
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof OpenEndDoubleRange && (this.isEmpty() && ((OpenEndDoubleRange)other).isEmpty() || this._start == ((OpenEndDoubleRange)other)._start && this._endExclusive == ((OpenEndDoubleRange)other)._endExclusive);
   }

   public int hashCode() {
      return this.isEmpty() ? -1 : 31 * Double.hashCode(this._start) + Double.hashCode(this._endExclusive);
   }

   @NotNull
   public String toString() {
      return this._start + "..<" + this._endExclusive;
   }
}
