package kotlin;

import kotlin.internal.InlineOnly;

public final class UByteKt {
   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final byte toUByte(byte $this$toUByte) {
      return UByte.constructor-impl($this$toUByte);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final byte toUByte(short $this$toUByte) {
      return UByte.constructor-impl((byte)$this$toUByte);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final byte toUByte(int $this$toUByte) {
      return UByte.constructor-impl((byte)$this$toUByte);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final byte toUByte(long $this$toUByte) {
      return UByte.constructor-impl((byte)((int)$this$toUByte));
   }
}
