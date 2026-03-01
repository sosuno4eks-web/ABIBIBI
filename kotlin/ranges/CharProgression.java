package kotlin.ranges;

import kotlin.collections.CharIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CharProgression implements Iterable<Character>, KMappedMarker {
   @NotNull
   public static final CharProgression.Companion Companion = new CharProgression.Companion((DefaultConstructorMarker)null);
   private final char first;
   private final char last;
   private final int step;

   public CharProgression(char start, char endInclusive, int step) {
      if (step == 0) {
         throw new IllegalArgumentException("Step must be non-zero.");
      } else if (step == Integer.MIN_VALUE) {
         throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
      } else {
         this.first = start;
         this.last = (char)ProgressionUtilKt.getProgressionLastElement(start, endInclusive, step);
         this.step = step;
      }
   }

   public final char getFirst() {
      return this.first;
   }

   public final char getLast() {
      return this.last;
   }

   public final int getStep() {
      return this.step;
   }

   @NotNull
   public CharIterator iterator() {
      return (CharIterator)(new CharProgressionIterator(this.first, this.last, this.step));
   }

   public boolean isEmpty() {
      return this.step > 0 ? Intrinsics.compare(this.first, this.last) > 0 : Intrinsics.compare(this.first, this.last) < 0;
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof CharProgression && (this.isEmpty() && ((CharProgression)other).isEmpty() || this.first == ((CharProgression)other).first && this.last == ((CharProgression)other).last && this.step == ((CharProgression)other).step);
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
      public final CharProgression fromClosedRange(char rangeStart, char rangeEnd, int step) {
         return new CharProgression(rangeStart, rangeEnd, step);
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
