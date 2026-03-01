package kotlin.ranges;

import kotlin.collections.IntIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class IntProgression implements Iterable<Integer>, KMappedMarker {
   @NotNull
   public static final IntProgression.Companion Companion = new IntProgression.Companion((DefaultConstructorMarker)null);
   private final int first;
   private final int last;
   private final int step;

   public IntProgression(int start, int endInclusive, int step) {
      if (step == 0) {
         throw new IllegalArgumentException("Step must be non-zero.");
      } else if (step == Integer.MIN_VALUE) {
         throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
      } else {
         this.first = start;
         this.last = ProgressionUtilKt.getProgressionLastElement(start, endInclusive, step);
         this.step = step;
      }
   }

   public final int getFirst() {
      return this.first;
   }

   public final int getLast() {
      return this.last;
   }

   public final int getStep() {
      return this.step;
   }

   @NotNull
   public IntIterator iterator() {
      return (IntIterator)(new IntProgressionIterator(this.first, this.last, this.step));
   }

   public boolean isEmpty() {
      return this.step > 0 ? this.first > this.last : this.first < this.last;
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof IntProgression && (this.isEmpty() && ((IntProgression)other).isEmpty() || this.first == ((IntProgression)other).first && this.last == ((IntProgression)other).last && this.step == ((IntProgression)other).step);
   }

   public int hashCode() {
      return this.isEmpty() ? -1 : 31 * (31 * this.first + this.last) + this.step;
   }

   @NotNull
   public String toString() {
      return this.step > 0 ? this.first + ".." + this.last + " step " + this.step : this.first + " downTo " + this.last + " step " + -this.step;
   }

   public static final class Companion {
      private Companion() {
      }

      @NotNull
      public final IntProgression fromClosedRange(int rangeStart, int rangeEnd, int step) {
         return new IntProgression(rangeStart, rangeEnd, step);
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
