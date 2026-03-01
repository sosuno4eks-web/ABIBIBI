package kotlin.ranges;

import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LongRange extends LongProgression implements ClosedRange<Long>, OpenEndRange<Long> {
   @NotNull
   public static final LongRange.Companion Companion = new LongRange.Companion((DefaultConstructorMarker)null);
   @NotNull
   private static final LongRange EMPTY = new LongRange(1L, 0L);

   public LongRange(long start, long endInclusive) {
      super(start, endInclusive, 1L);
   }

   @NotNull
   public Long getStart() {
      return this.getFirst();
   }

   @NotNull
   public Long getEndInclusive() {
      return this.getLast();
   }

   /** @deprecated */
   @NotNull
   public Long getEndExclusive() {
      if (this.getLast() == Long.MAX_VALUE) {
         throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
      } else {
         return this.getLast() + 1L;
      }
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Can throw an exception when it's impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw."
   )
   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static void getEndExclusive$annotations() {
   }

   public boolean contains(long value) {
      return this.getFirst() <= value && value <= this.getLast();
   }

   public boolean isEmpty() {
      return this.getFirst() > this.getLast();
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof LongRange && (this.isEmpty() && ((LongRange)other).isEmpty() || this.getFirst() == ((LongRange)other).getFirst() && this.getLast() == ((LongRange)other).getLast());
   }

   public int hashCode() {
      return this.isEmpty() ? -1 : (int)((long)31 * (this.getFirst() ^ this.getFirst() >>> 32) + (this.getLast() ^ this.getLast() >>> 32));
   }

   @NotNull
   public String toString() {
      return this.getFirst() + ".." + this.getLast();
   }

   public static final class Companion {
      private Companion() {
      }

      @NotNull
      public final LongRange getEMPTY() {
         return LongRange.EMPTY;
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
