package kotlin.ranges;

import java.util.Iterator;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.5"
)
public class UIntProgression implements Iterable<UInt>, KMappedMarker {
   @NotNull
   public static final UIntProgression.Companion Companion = new UIntProgression.Companion((DefaultConstructorMarker)null);
   private final int first;
   private final int last;
   private final int step;

   private UIntProgression(int start, int endInclusive, int step) {
      if (step == 0) {
         throw new IllegalArgumentException("Step must be non-zero.");
      } else if (step == Integer.MIN_VALUE) {
         throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
      } else {
         this.first = start;
         this.last = UProgressionUtilKt.getProgressionLastElement-Nkh28Cs(start, endInclusive, step);
         this.step = step;
      }
   }

   public final int getFirst_pVg5ArA/* $FF was: getFirst-pVg5ArA*/() {
      return this.first;
   }

   public final int getLast_pVg5ArA/* $FF was: getLast-pVg5ArA*/() {
      return this.last;
   }

   public final int getStep() {
      return this.step;
   }

   @NotNull
   public final Iterator<UInt> iterator() {
      return (Iterator)(new UIntProgressionIterator(this.first, this.last, this.step, (DefaultConstructorMarker)null));
   }

   public boolean isEmpty() {
      return this.step > 0 ? Integer.compareUnsigned(this.first, this.last) > 0 : Integer.compareUnsigned(this.first, this.last) < 0;
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof UIntProgression && (this.isEmpty() && ((UIntProgression)other).isEmpty() || this.first == ((UIntProgression)other).first && this.last == ((UIntProgression)other).last && this.step == ((UIntProgression)other).step);
   }

   public int hashCode() {
      return this.isEmpty() ? -1 : 31 * (31 * this.first + this.last) + this.step;
   }

   @NotNull
   public String toString() {
      return this.step > 0 ? UInt.toString-impl(this.first) + ".." + UInt.toString-impl(this.last) + " step " + this.step : UInt.toString-impl(this.first) + " downTo " + UInt.toString-impl(this.last) + " step " + -this.step;
   }

   // $FF: synthetic method
   public UIntProgression(int start, int endInclusive, int step, DefaultConstructorMarker $constructor_marker) {
      this(start, endInclusive, step);
   }

   public static final class Companion {
      private Companion() {
      }

      @NotNull
      public final UIntProgression fromClosedRange_Nkh28Cs/* $FF was: fromClosedRange-Nkh28Cs*/(int rangeStart, int rangeEnd, int step) {
         return new UIntProgression(rangeStart, rangeEnd, step, (DefaultConstructorMarker)null);
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
