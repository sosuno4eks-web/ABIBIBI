package kotlin;

import kotlin.internal.InlineOnly;

public final class ULongKt {
   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final long toULong(byte $this$toULong) {
      return ULong.constructor-impl((long)$this$toULong);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final long toULong(short $this$toULong) {
      return ULong.constructor-impl((long)$this$toULong);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final long toULong(int $this$toULong) {
      return ULong.constructor-impl((long)$this$toULong);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final long toULong(long $this$toULong) {
      return ULong.constructor-impl($this$toULong);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final long toULong(float $this$toULong) {
      return UnsignedKt.doubleToULong((double)$this$toULong);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final long toULong(double $this$toULong) {
      return UnsignedKt.doubleToULong($this$toULong);
   }
}
