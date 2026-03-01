package kotlin.ranges;

import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IntRange extends IntProgression implements ClosedRange<Integer>, OpenEndRange<Integer> {
   @NotNull
   public static final IntRange.Companion Companion = new IntRange.Companion((DefaultConstructorMarker)null);
   @NotNull
   private static final IntRange EMPTY = new IntRange(1, 0);

   public IntRange(int start, int endInclusive) {
      super(start, endInclusive, 1);
   }

   @NotNull
   public Integer getStart() {
      return this.getFirst();
   }

   @NotNull
   public Integer getEndInclusive() {
      return this.getLast();
   }

   /** @deprecated */
   @NotNull
   public Integer getEndExclusive() {
      if (this.getLast() == Integer.MAX_VALUE) {
         throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
      } else {
         return this.getLast() + 1;
      }
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw."
   )
   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static void getEndExclusive$annotations() {
   }

   public boolean contains(int value) {
      return this.getFirst() <= value && value <= this.getLast();
   }

   public boolean isEmpty() {
      return this.getFirst() > this.getLast();
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof IntRange && (this.isEmpty() && ((IntRange)other).isEmpty() || this.getFirst() == ((IntRange)other).getFirst() && this.getLast() == ((IntRange)other).getLast());
   }

   public int hashCode() {
      return this.isEmpty() ? -1 : 31 * this.getFirst() + this.getLast();
   }

   @NotNull
   public String toString() {
      return this.getFirst() + ".." + this.getLast();
   }

   public static final class Companion {
      private Companion() {
      }

      @NotNull
      public final IntRange getEMPTY() {
         return IntRange.EMPTY;
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
