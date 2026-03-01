package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

class NumbersKt__NumbersJVMKt extends NumbersKt__FloorDivModKt {
   @InlineOnly
   private static final boolean isNaN(double $this$isNaN) {
      return Double.isNaN($this$isNaN);
   }

   @InlineOnly
   private static final boolean isNaN(float $this$isNaN) {
      return Float.isNaN($this$isNaN);
   }

   @InlineOnly
   private static final boolean isInfinite(double $this$isInfinite) {
      return Double.isInfinite($this$isInfinite);
   }

   @InlineOnly
   private static final boolean isInfinite(float $this$isInfinite) {
      return Float.isInfinite($this$isInfinite);
   }

   @InlineOnly
   private static final boolean isFinite(double $this$isFinite) {
      return Math.abs($this$isFinite) <= Double.MAX_VALUE;
   }

   @InlineOnly
   private static final boolean isFinite(float $this$isFinite) {
      return Math.abs($this$isFinite) <= Float.MAX_VALUE;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final long toBits(double $this$toBits) {
      return Double.doubleToLongBits($this$toBits);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final long toRawBits(double $this$toRawBits) {
      return Double.doubleToRawLongBits($this$toRawBits);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final double fromBits(DoubleCompanionObject $this$fromBits, long bits) {
      Intrinsics.checkNotNullParameter($this$fromBits, "<this>");
      return Double.longBitsToDouble(bits);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final int toBits(float $this$toBits) {
      return Float.floatToIntBits($this$toBits);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final int toRawBits(float $this$toRawBits) {
      return Float.floatToRawIntBits($this$toRawBits);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final float fromBits(FloatCompanionObject $this$fromBits, int bits) {
      Intrinsics.checkNotNullParameter($this$fromBits, "<this>");
      return Float.intBitsToFloat(bits);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int countOneBits(int $this$countOneBits) {
      return Integer.bitCount($this$countOneBits);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int countLeadingZeroBits(int $this$countLeadingZeroBits) {
      return Integer.numberOfLeadingZeros($this$countLeadingZeroBits);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int countTrailingZeroBits(int $this$countTrailingZeroBits) {
      return Integer.numberOfTrailingZeros($this$countTrailingZeroBits);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int takeHighestOneBit(int $this$takeHighestOneBit) {
      return Integer.highestOneBit($this$takeHighestOneBit);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int takeLowestOneBit(int $this$takeLowestOneBit) {
      return Integer.lowestOneBit($this$takeLowestOneBit);
   }

   @SinceKotlin(
      version = "1.6"
   )
   @InlineOnly
   private static final int rotateLeft(int $this$rotateLeft, int bitCount) {
      return Integer.rotateLeft($this$rotateLeft, bitCount);
   }

   @SinceKotlin(
      version = "1.6"
   )
   @InlineOnly
   private static final int rotateRight(int $this$rotateRight, int bitCount) {
      return Integer.rotateRight($this$rotateRight, bitCount);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int countOneBits(long $this$countOneBits) {
      return Long.bitCount($this$countOneBits);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int countLeadingZeroBits(long $this$countLeadingZeroBits) {
      return Long.numberOfLeadingZeros($this$countLeadingZeroBits);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int countTrailingZeroBits(long $this$countTrailingZeroBits) {
      return Long.numberOfTrailingZeros($this$countTrailingZeroBits);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final long takeHighestOneBit(long $this$takeHighestOneBit) {
      return Long.highestOneBit($this$takeHighestOneBit);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final long takeLowestOneBit(long $this$takeLowestOneBit) {
      return Long.lowestOneBit($this$takeLowestOneBit);
   }

   @SinceKotlin(
      version = "1.6"
   )
   @InlineOnly
   private static final long rotateLeft(long $this$rotateLeft, int bitCount) {
      return Long.rotateLeft($this$rotateLeft, bitCount);
   }

   @SinceKotlin(
      version = "1.6"
   )
   @InlineOnly
   private static final long rotateRight(long $this$rotateRight, int bitCount) {
      return Long.rotateRight($this$rotateRight, bitCount);
   }

   public NumbersKt__NumbersJVMKt() {
   }
}
