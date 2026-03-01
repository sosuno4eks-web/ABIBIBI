package kotlin.ranges;

import java.util.Iterator;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.5"
)
public class ULongProgression implements Iterable<ULong>, KMappedMarker {
   @NotNull
   public static final ULongProgression.Companion Companion = new ULongProgression.Companion((DefaultConstructorMarker)null);
   private final long first;
   private final long last;
   private final long step;

   private ULongProgression(long start, long endInclusive, long step) {
      if (step == 0L) {
         throw new IllegalArgumentException("Step must be non-zero.");
      } else if (step == Long.MIN_VALUE) {
         throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
      } else {
         this.first = start;
         this.last = UProgressionUtilKt.getProgressionLastElement-7ftBX0g(start, endInclusive, step);
         this.step = step;
      }
   }

   public final long getFirst_s_VKNKU/* $FF was: getFirst-s-VKNKU*/() {
      return this.first;
   }

   public final long getLast_s_VKNKU/* $FF was: getLast-s-VKNKU*/() {
      return this.last;
   }

   public final long getStep() {
      return this.step;
   }

   @NotNull
   public final Iterator<ULong> iterator() {
      return (Iterator)(new ULongProgressionIterator(this.first, this.last, this.step, (DefaultConstructorMarker)null));
   }

   public boolean isEmpty() {
      return this.step > 0L ? Long.compareUnsigned(this.first, this.last) > 0 : Long.compareUnsigned(this.first, this.last) < 0;
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof ULongProgression && (this.isEmpty() && ((ULongProgression)other).isEmpty() || this.first == ((ULongProgression)other).first && this.last == ((ULongProgression)other).last && this.step == ((ULongProgression)other).step);
   }

   public int hashCode() {
      return this.isEmpty() ? -1 : 31 * (31 * (int)ULong.constructor-impl(this.first ^ ULong.constructor-impl(this.first >>> 32)) + (int)ULong.constructor-impl(this.last ^ ULong.constructor-impl(this.last >>> 32))) + (int)(this.step ^ this.step >>> 32);
   }

   @NotNull
   public String toString() {
      return this.step > 0L ? ULong.toString-impl(this.first) + ".." + ULong.toString-impl(this.last) + " step " + this.step : ULong.toString-impl(this.first) + " downTo " + ULong.toString-impl(this.last) + " step " + -this.step;
   }

   // $FF: synthetic method
   public ULongProgression(long start, long endInclusive, long step, DefaultConstructorMarker $constructor_marker) {
      this(start, endInclusive, step);
   }

   public static final class Companion {
      private Companion() {
      }

      @NotNull
      public final ULongProgression fromClosedRange_7ftBX0g/* $FF was: fromClosedRange-7ftBX0g*/(long rangeStart, long rangeEnd, long step) {
         return new ULongProgression(rangeStart, rangeEnd, step, (DefaultConstructorMarker)null);
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
