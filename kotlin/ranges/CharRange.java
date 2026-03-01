package kotlin.ranges;

import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class CharRange extends CharProgression implements ClosedRange<Character>, OpenEndRange<Character> {
   @NotNull
   public static final CharRange.Companion Companion = new CharRange.Companion((DefaultConstructorMarker)null);
   @NotNull
   private static final CharRange EMPTY = new CharRange('\u0001', '\u0000');

   public CharRange(char start, char endInclusive) {
      super(start, endInclusive, 1);
   }

   @NotNull
   public Character getStart() {
      return this.getFirst();
   }

   @NotNull
   public Character getEndInclusive() {
      return this.getLast();
   }

   /** @deprecated */
   @NotNull
   public Character getEndExclusive() {
      if (this.getLast() == '\uffff') {
         throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
      } else {
         return (char)(this.getLast() + 1);
      }
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw."
   )
   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static void getEndExclusive$annotations() {
   }

   public boolean contains(char value) {
      return Intrinsics.compare(this.getFirst(), value) <= 0 && Intrinsics.compare(value, this.getLast()) <= 0;
   }

   public boolean isEmpty() {
      return Intrinsics.compare(this.getFirst(), this.getLast()) > 0;
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof CharRange && (this.isEmpty() && ((CharRange)other).isEmpty() || this.getFirst() == ((CharRange)other).getFirst() && this.getLast() == ((CharRange)other).getLast());
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
      public final CharRange getEMPTY() {
         return CharRange.EMPTY;
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
