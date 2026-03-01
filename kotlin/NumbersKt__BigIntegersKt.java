package kotlin;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

class NumbersKt__BigIntegersKt extends NumbersKt__BigDecimalsKt {
   @InlineOnly
   private static final BigInteger plus(BigInteger $this$plus, BigInteger other) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      BigInteger var10000 = $this$plus.add(other);
      Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
      return var10000;
   }

   @InlineOnly
   private static final BigInteger minus(BigInteger $this$minus, BigInteger other) {
      Intrinsics.checkNotNullParameter($this$minus, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      BigInteger var10000 = $this$minus.subtract(other);
      Intrinsics.checkNotNullExpressionValue(var10000, "subtract(...)");
      return var10000;
   }

   @InlineOnly
   private static final BigInteger times(BigInteger $this$times, BigInteger other) {
      Intrinsics.checkNotNullParameter($this$times, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      BigInteger var10000 = $this$times.multiply(other);
      Intrinsics.checkNotNullExpressionValue(var10000, "multiply(...)");
      return var10000;
   }

   @InlineOnly
   private static final BigInteger div(BigInteger $this$div, BigInteger other) {
      Intrinsics.checkNotNullParameter($this$div, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      BigInteger var10000 = $this$div.divide(other);
      Intrinsics.checkNotNullExpressionValue(var10000, "divide(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final BigInteger rem(BigInteger $this$rem, BigInteger other) {
      Intrinsics.checkNotNullParameter($this$rem, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      BigInteger var10000 = $this$rem.remainder(other);
      Intrinsics.checkNotNullExpressionValue(var10000, "remainder(...)");
      return var10000;
   }

   @InlineOnly
   private static final BigInteger unaryMinus(BigInteger $this$unaryMinus) {
      Intrinsics.checkNotNullParameter($this$unaryMinus, "<this>");
      BigInteger var10000 = $this$unaryMinus.negate();
      Intrinsics.checkNotNullExpressionValue(var10000, "negate(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigInteger inc(BigInteger $this$inc) {
      Intrinsics.checkNotNullParameter($this$inc, "<this>");
      BigInteger var10000 = $this$inc.add(BigInteger.ONE);
      Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigInteger dec(BigInteger $this$dec) {
      Intrinsics.checkNotNullParameter($this$dec, "<this>");
      BigInteger var10000 = $this$dec.subtract(BigInteger.ONE);
      Intrinsics.checkNotNullExpressionValue(var10000, "subtract(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigInteger inv(BigInteger $this$inv) {
      Intrinsics.checkNotNullParameter($this$inv, "<this>");
      BigInteger var10000 = $this$inv.not();
      Intrinsics.checkNotNullExpressionValue(var10000, "not(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigInteger and(BigInteger $this$and, BigInteger other) {
      Intrinsics.checkNotNullParameter($this$and, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      BigInteger var10000 = $this$and.and(other);
      Intrinsics.checkNotNullExpressionValue(var10000, "and(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigInteger or(BigInteger $this$or, BigInteger other) {
      Intrinsics.checkNotNullParameter($this$or, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      BigInteger var10000 = $this$or.or(other);
      Intrinsics.checkNotNullExpressionValue(var10000, "or(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigInteger xor(BigInteger $this$xor, BigInteger other) {
      Intrinsics.checkNotNullParameter($this$xor, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      BigInteger var10000 = $this$xor.xor(other);
      Intrinsics.checkNotNullExpressionValue(var10000, "xor(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigInteger shl(BigInteger $this$shl, int n) {
      Intrinsics.checkNotNullParameter($this$shl, "<this>");
      BigInteger var10000 = $this$shl.shiftLeft(n);
      Intrinsics.checkNotNullExpressionValue(var10000, "shiftLeft(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigInteger shr(BigInteger $this$shr, int n) {
      Intrinsics.checkNotNullParameter($this$shr, "<this>");
      BigInteger var10000 = $this$shr.shiftRight(n);
      Intrinsics.checkNotNullExpressionValue(var10000, "shiftRight(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigInteger toBigInteger(int $this$toBigInteger) {
      BigInteger var10000 = BigInteger.valueOf((long)$this$toBigInteger);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigInteger toBigInteger(long $this$toBigInteger) {
      BigInteger var10000 = BigInteger.valueOf($this$toBigInteger);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigDecimal toBigDecimal(BigInteger $this$toBigDecimal) {
      Intrinsics.checkNotNullParameter($this$toBigDecimal, "<this>");
      return new BigDecimal($this$toBigDecimal);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigDecimal toBigDecimal(BigInteger $this$toBigDecimal, int scale, MathContext mathContext) {
      Intrinsics.checkNotNullParameter($this$toBigDecimal, "<this>");
      Intrinsics.checkNotNullParameter(mathContext, "mathContext");
      return new BigDecimal($this$toBigDecimal, scale, mathContext);
   }

   // $FF: synthetic method
   static BigDecimal toBigDecimal$default(BigInteger $this$toBigDecimal_u24default, int scale, MathContext mathContext, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         scale = 0;
      }

      if ((var3 & 2) != 0) {
         MathContext var10000 = MathContext.UNLIMITED;
         Intrinsics.checkNotNullExpressionValue(var10000, "UNLIMITED");
         mathContext = var10000;
      }

      Intrinsics.checkNotNullParameter($this$toBigDecimal_u24default, "<this>");
      Intrinsics.checkNotNullParameter(mathContext, "mathContext");
      return new BigDecimal($this$toBigDecimal_u24default, scale, mathContext);
   }

   public NumbersKt__BigIntegersKt() {
   }
}
