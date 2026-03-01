package kotlin.ranges;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class ClosedFloatRange implements ClosedFloatingPointRange<Float> {
   private final float _start;
   private final float _endInclusive;

   public ClosedFloatRange(float start, float endInclusive) {
      this._start = start;
      this._endInclusive = endInclusive;
   }

   @NotNull
   public Float getStart() {
      return this._start;
   }

   @NotNull
   public Float getEndInclusive() {
      return this._endInclusive;
   }

   public boolean lessThanOrEquals(float a, float b) {
      return a <= b;
   }

   public boolean contains(float value) {
      return value >= this._start && value <= this._endInclusive;
   }

   public boolean isEmpty() {
      return !(this._start <= this._endInclusive);
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof ClosedFloatRange && (this.isEmpty() && ((ClosedFloatRange)other).isEmpty() || this._start == ((ClosedFloatRange)other)._start && this._endInclusive == ((ClosedFloatRange)other)._endInclusive);
   }

   public int hashCode() {
      return this.isEmpty() ? -1 : 31 * Float.hashCode(this._start) + Float.hashCode(this._endInclusive);
   }

   @NotNull
   public String toString() {
      return this._start + ".." + this._endInclusive;
   }
}
