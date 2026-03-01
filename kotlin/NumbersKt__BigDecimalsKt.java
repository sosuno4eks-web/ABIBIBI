package kotlin;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

class NumbersKt__BigDecimalsKt {
   @InlineOnly
   private static final BigDecimal plus(BigDecimal $this$plus, BigDecimal other) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      BigDecimal var10000 = $this$plus.add(other);
      Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
      return var10000;
   }

   @InlineOnly
   private static final BigDecimal minus(BigDecimal $this$minus, BigDecimal other) {
      Intrinsics.checkNotNullParameter($this$minus, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      BigDecimal var10000 = $this$minus.subtract(other);
      Intrinsics.checkNotNullExpressionValue(var10000, "subtract(...)");
      return var10000;
   }

   @InlineOnly
   private static final BigDecimal times(BigDecimal $this$times, BigDecimal other) {
      Intrinsics.checkNotNullParameter($this$times, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      BigDecimal var10000 = $this$times.multiply(other);
      Intrinsics.checkNotNullExpressionValue(var10000, "multiply(...)");
      return var10000;
   }

   @InlineOnly
   private static final BigDecimal div(BigDecimal $this$div, BigDecimal other) {
      Intrinsics.checkNotNullParameter($this$div, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      BigDecimal var10000 = $this$div.divide(other, RoundingMode.HALF_EVEN);
      Intrinsics.checkNotNullExpressionValue(var10000, "divide(...)");
      return var10000;
   }

   @InlineOnly
   private static final BigDecimal rem(BigDecimal $this$rem, BigDecimal other) {
      Intrinsics.checkNotNullParameter($this$rem, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      BigDecimal var10000 = $this$rem.remainder(other);
      Intrinsics.checkNotNullExpressionValue(var10000, "remainder(...)");
      return var10000;
   }

   @InlineOnly
   private static final BigDecimal unaryMinus(BigDecimal $this$unaryMinus) {
      Intrinsics.checkNotNullParameter($this$unaryMinus, "<this>");
      BigDecimal var10000 = $this$unaryMinus.negate();
      Intrinsics.checkNotNullExpressionValue(var10000, "negate(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigDecimal inc(BigDecimal $this$inc) {
      Intrinsics.checkNotNullParameter($this$inc, "<this>");
      BigDecimal var10000 = $this$inc.add(BigDecimal.ONE);
      Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigDecimal dec(BigDecimal $this$dec) {
      Intrinsics.checkNotNullParameter($this$dec, "<this>");
      BigDecimal var10000 = $this$dec.subtract(BigDecimal.ONE);
      Intrinsics.checkNotNullExpressionValue(var10000, "subtract(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigDecimal toBigDecimal(int $this$toBigDecimal) {
      BigDecimal var10000 = BigDecimal.valueOf((long)$this$toBigDecimal);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigDecimal toBigDecimal(int $this$toBigDecimal, MathContext mathContext) {
      Intrinsics.checkNotNullParameter(mathContext, "mathContext");
      return new BigDecimal($this$toBigDecimal, mathContext);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigDecimal toBigDecimal(long $this$toBigDecimal) {
      BigDecimal var10000 = BigDecimal.valueOf($this$toBigDecimal);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigDecimal toBigDecimal(long $this$toBigDecimal, MathContext mathContext) {
      Intrinsics.checkNotNullParameter(mathContext, "mathContext");
      return new BigDecimal($this$toBigDecimal, mathContext);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigDecimal toBigDecimal(float $this$toBigDecimal) {
      return new BigDecimal(String.valueOf($this$toBigDecimal));
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigDecimal toBigDecimal(float $this$toBigDecimal, MathContext mathContext) {
      Intrinsics.checkNotNullParameter(mathContext, "mathContext");
      return new BigDecimal(String.valueOf($this$toBigDecimal), mathContext);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigDecimal toBigDecimal(double $this$toBigDecimal) {
      return new BigDecimal(String.valueOf($this$toBigDecimal));
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigDecimal toBigDecimal(double $this$toBigDecimal, MathContext mathContext) {
      Intrinsics.checkNotNullParameter(mathContext, "mathContext");
      return new BigDecimal(String.valueOf($this$toBigDecimal), mathContext);
   }

   public NumbersKt__BigDecimalsKt() {
   }
}
