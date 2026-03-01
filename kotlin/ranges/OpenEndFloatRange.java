package kotlin.ranges;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class OpenEndFloatRange implements OpenEndRange<Float> {
   private final float _start;
   private final float _endExclusive;

   public OpenEndFloatRange(float start, float endExclusive) {
      this._start = start;
      this._endExclusive = endExclusive;
   }

   @NotNull
   public Float getStart() {
      return this._start;
   }

   @NotNull
   public Float getEndExclusive() {
      return this._endExclusive;
   }

   private final boolean lessThanOrEquals(float a, float b) {
      return a <= b;
   }

   public boolean contains(float value) {
      return value >= this._start && value < this._endExclusive;
   }

   public boolean isEmpty() {
      return !(this._start < this._endExclusive);
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof OpenEndFloatRange && (this.isEmpty() && ((OpenEndFloatRange)other).isEmpty() || this._start == ((OpenEndFloatRange)other)._start && this._endExclusive == ((OpenEndFloatRange)other)._endExclusive);
   }

   public int hashCode() {
      return this.isEmpty() ? -1 : 31 * Float.hashCode(this._start) + Float.hashCode(this._endExclusive);
   }

   @NotNull
   public String toString() {
      return this._start + "..<" + this._endExclusive;
   }
}
