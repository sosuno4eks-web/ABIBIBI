package kotlin.ranges;

import kotlin.collections.LongIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LongProgression implements Iterable<Long>, KMappedMarker {
   @NotNull
   public static final LongProgression.Companion Companion = new LongProgression.Companion((DefaultConstructorMarker)null);
   private final long first;
   private final long last;
   private final long step;

   public LongProgression(long start, long endInclusive, long step) {
      if (step == 0L) {
         throw new IllegalArgumentException("Step must be non-zero.");
      } else if (step == Long.MIN_VALUE) {
         throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
      } else {
         this.first = start;
         this.last = ProgressionUtilKt.getProgressionLastElement(start, endInclusive, step);
         this.step = step;
      }
   }

   public final long getFirst() {
      return this.first;
   }

   public final long getLast() {
      return this.last;
   }

   public final long getStep() {
      return this.step;
   }

   @NotNull
   public LongIterator iterator() {
      return (LongIterator)(new LongProgressionIterator(this.first, this.last, this.step));
   }

   public boolean isEmpty() {
      return this.step > 0L ? this.first > this.last : this.first < this.last;
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof LongProgression && (this.isEmpty() && ((LongProgression)other).isEmpty() || this.first == ((LongProgression)other).first && this.last == ((LongProgression)other).last && this.step == ((LongProgression)other).step);
   }

   public int hashCode() {
      return this.isEmpty() ? -1 : (int)((long)31 * ((long)31 * (this.first ^ this.first >>> 32) + (this.last ^ this.last >>> 32)) + (this.step ^ this.step >>> 32));
   }

   @NotNull
   public String toString() {
      return this.step > 0L ? this.first + ".." + this.last + " step " + this.step : this.first + " downTo " + this.last + " step " + -this.step;
   }

   public static final class Companion {
      private Companion() {
      }

      @NotNull
      public final LongProgression fromClosedRange(long rangeStart, long rangeEnd, long step) {
         return new LongProgression(rangeStart, rangeEnd, step);
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
