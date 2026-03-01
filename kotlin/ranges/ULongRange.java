package kotlin.ranges;

import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.5"
)
public final class ULongRange extends ULongProgression implements ClosedRange<ULong>, OpenEndRange<ULong> {
   @NotNull
   public static final ULongRange.Companion Companion = new ULongRange.Companion((DefaultConstructorMarker)null);
   @NotNull
   private static final ULongRange EMPTY = new ULongRange(-1L, 0L, (DefaultConstructorMarker)null);

   private ULongRange(long start, long endInclusive) {
      super(start, endInclusive, 1L, (DefaultConstructorMarker)null);
   }

   public long getStart_s_VKNKU/* $FF was: getStart-s-VKNKU*/() {
      return this.getFirst-s-VKNKU();
   }

   public long getEndInclusive_s_VKNKU/* $FF was: getEndInclusive-s-VKNKU*/() {
      return this.getLast-s-VKNKU();
   }

   /** @deprecated */
   public long getEndExclusive_s_VKNKU/* $FF was: getEndExclusive-s-VKNKU*/() {
      if (this.getLast-s-VKNKU() == -1L) {
         throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
      } else {
         long var1 = this.getLast-s-VKNKU();
         byte var3 = 1;
         return ULong.constructor-impl(var1 + ULong.constructor-impl((long)var3 & 4294967295L));
      }
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw."
   )
   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static void getEndExclusive_s_VKNKU$annotations/* $FF was: getEndExclusive-s-VKNKU$annotations*/() {
   }

   public boolean contains_VKZWuLQ/* $FF was: contains-VKZWuLQ*/(long value) {
      return Long.compareUnsigned(this.getFirst-s-VKNKU(), value) <= 0 && Long.compareUnsigned(value, this.getLast-s-VKNKU()) <= 0;
   }

   public boolean isEmpty() {
      return Long.compareUnsigned(this.getFirst-s-VKNKU(), this.getLast-s-VKNKU()) > 0;
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof ULongRange && (this.isEmpty() && ((ULongRange)other).isEmpty() || this.getFirst-s-VKNKU() == ((ULongRange)other).getFirst-s-VKNKU() && this.getLast-s-VKNKU() == ((ULongRange)other).getLast-s-VKNKU());
   }

   public int hashCode() {
      return this.isEmpty() ? -1 : 31 * (int)ULong.constructor-impl(this.getFirst-s-VKNKU() ^ ULong.constructor-impl(this.getFirst-s-VKNKU() >>> 32)) + (int)ULong.constructor-impl(this.getLast-s-VKNKU() ^ ULong.constructor-impl(this.getLast-s-VKNKU() >>> 32));
   }

   @NotNull
   public String toString() {
      return ULong.toString-impl(this.getFirst-s-VKNKU()) + ".." + ULong.toString-impl(this.getLast-s-VKNKU());
   }

   // $FF: synthetic method
   public ULongRange(long start, long endInclusive, DefaultConstructorMarker $constructor_marker) {
      this(start, endInclusive);
   }

   public static final class Companion {
      private Companion() {
      }

      @NotNull
      public final ULongRange getEMPTY() {
         return ULongRange.EMPTY;
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
