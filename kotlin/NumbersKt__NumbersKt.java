package kotlin;

import kotlin.internal.InlineOnly;

class NumbersKt__NumbersKt extends NumbersKt__NumbersJVMKt {
   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int countOneBits(byte $this$countOneBits) {
      return Integer.bitCount($this$countOneBits & 255);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int countLeadingZeroBits(byte $this$countLeadingZeroBits) {
      return Integer.numberOfLeadingZeros($this$countLeadingZeroBits & 255) - 24;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int countTrailingZeroBits(byte $this$countTrailingZeroBits) {
      return Integer.numberOfTrailingZeros($this$countTrailingZeroBits | 256);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final byte takeHighestOneBit(byte $this$takeHighestOneBit) {
      return (byte)Integer.highestOneBit($this$takeHighestOneBit & 255);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final byte takeLowestOneBit(byte $this$takeLowestOneBit) {
      return (byte)Integer.lowestOneBit($this$takeLowestOneBit);
   }

   @SinceKotlin(
      version = "1.6"
   )
   public static final byte rotateLeft(byte $this$rotateLeft, int bitCount) {
      return (byte)($this$rotateLeft << (bitCount & 7) | ($this$rotateLeft & 255) >>> 8 - (bitCount & 7));
   }

   @SinceKotlin(
      version = "1.6"
   )
   public static final byte rotateRight(byte $this$rotateRight, int bitCount) {
      return (byte)($this$rotateRight << 8 - (bitCount & 7) | ($this$rotateRight & 255) >>> (bitCount & 7));
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int countOneBits(short $this$countOneBits) {
      return Integer.bitCount($this$countOneBits & '\uffff');
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int countLeadingZeroBits(short $this$countLeadingZeroBits) {
      return Integer.numberOfLeadingZeros($this$countLeadingZeroBits & '\uffff') - 16;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int countTrailingZeroBits(short $this$countTrailingZeroBits) {
      return Integer.numberOfTrailingZeros($this$countTrailingZeroBits | 65536);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final short takeHighestOneBit(short $this$takeHighestOneBit) {
      return (short)Integer.highestOneBit($this$takeHighestOneBit & '\uffff');
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final short takeLowestOneBit(short $this$takeLowestOneBit) {
      return (short)Integer.lowestOneBit($this$takeLowestOneBit);
   }

   @SinceKotlin(
      version = "1.6"
   )
   public static final short rotateLeft(short $this$rotateLeft, int bitCount) {
      return (short)($this$rotateLeft << (bitCount & 15) | ($this$rotateLeft & '\uffff') >>> 16 - (bitCount & 15));
   }

   @SinceKotlin(
      version = "1.6"
   )
   public static final short rotateRight(short $this$rotateRight, int bitCount) {
      return (short)($this$rotateRight << 16 - (bitCount & 15) | ($this$rotateRight & '\uffff') >>> (bitCount & 15));
   }

   public NumbersKt__NumbersKt() {
   }
}
