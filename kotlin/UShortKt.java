package kotlin;

import kotlin.internal.InlineOnly;

public final class UShortKt {
   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final short toUShort(byte $this$toUShort) {
      return UShort.constructor-impl((short)$this$toUShort);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final short toUShort(short $this$toUShort) {
      return UShort.constructor-impl($this$toUShort);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final short toUShort(int $this$toUShort) {
      return UShort.constructor-impl((short)$this$toUShort);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final short toUShort(long $this$toUShort) {
      return UShort.constructor-impl((short)((int)$this$toUShort));
   }
}
