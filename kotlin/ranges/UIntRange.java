package kotlin.ranges;

import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.5"
)
public final class UIntRange extends UIntProgression implements ClosedRange<UInt>, OpenEndRange<UInt> {
   @NotNull
   public static final UIntRange.Companion Companion = new UIntRange.Companion((DefaultConstructorMarker)null);
   @NotNull
   private static final UIntRange EMPTY = new UIntRange(-1, 0, (DefaultConstructorMarker)null);

   private UIntRange(int start, int endInclusive) {
      super(start, endInclusive, 1, (DefaultConstructorMarker)null);
   }

   public int getStart_pVg5ArA/* $FF was: getStart-pVg5ArA*/() {
      return this.getFirst-pVg5ArA();
   }

   public int getEndInclusive_pVg5ArA/* $FF was: getEndInclusive-pVg5ArA*/() {
      return this.getLast-pVg5ArA();
   }

   /** @deprecated */
   public int getEndExclusive_pVg5ArA/* $FF was: getEndExclusive-pVg5ArA*/() {
      if (this.getLast-pVg5ArA() == -1) {
         throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
      } else {
         return UInt.constructor-impl(this.getLast-pVg5ArA() + 1);
      }
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw."
   )
   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static void getEndExclusive_pVg5ArA$annotations/* $FF was: getEndExclusive-pVg5ArA$annotations*/() {
   }

   public boolean contains_WZ4Q5Ns/* $FF was: contains-WZ4Q5Ns*/(int value) {
      return Integer.compareUnsigned(this.getFirst-pVg5ArA(), value) <= 0 && Integer.compareUnsigned(value, this.getLast-pVg5ArA()) <= 0;
   }

   public boolean isEmpty() {
      return Integer.compareUnsigned(this.getFirst-pVg5ArA(), this.getLast-pVg5ArA()) > 0;
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof UIntRange && (this.isEmpty() && ((UIntRange)other).isEmpty() || this.getFirst-pVg5ArA() == ((UIntRange)other).getFirst-pVg5ArA() && this.getLast-pVg5ArA() == ((UIntRange)other).getLast-pVg5ArA());
   }

   public int hashCode() {
      return this.isEmpty() ? -1 : 31 * this.getFirst-pVg5ArA() + this.getLast-pVg5ArA();
   }

   @NotNull
   public String toString() {
      return UInt.toString-impl(this.getFirst-pVg5ArA()) + ".." + UInt.toString-impl(this.getLast-pVg5ArA());
   }

   // $FF: synthetic method
   public UIntRange(int start, int endInclusive, DefaultConstructorMarker $constructor_marker) {
      this(start, endInclusive);
   }

   public static final class Companion {
      private Companion() {
      }

      @NotNull
      public final UIntRange getEMPTY() {
         return UIntRange.EMPTY;
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
