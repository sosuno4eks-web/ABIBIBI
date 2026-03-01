package kotlin;

import kotlin.internal.InlineOnly;

public final class UIntKt {
   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final int toUInt(byte $this$toUInt) {
      return UInt.constructor-impl($this$toUInt);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final int toUInt(short $this$toUInt) {
      return UInt.constructor-impl($this$toUInt);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final int toUInt(int $this$toUInt) {
      return UInt.constructor-impl($this$toUInt);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final int toUInt(long $this$toUInt) {
      return UInt.constructor-impl((int)$this$toUInt);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final int toUInt(float $this$toUInt) {
      return UnsignedKt.doubleToUInt((double)$this$toUInt);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final int toUInt(double $this$toUInt) {
      return UnsignedKt.doubleToUInt($this$toUInt);
   }
}
