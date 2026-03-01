package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class StringsKt__StringNumberConversionsJVMKt extends StringsKt__StringBuilderKt {
   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final String toString(byte $this$toString, int radix) {
      String var10000 = Integer.toString($this$toString, CharsKt.checkRadix(radix));
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final String toString(short $this$toString, int radix) {
      String var10000 = Integer.toString($this$toString, CharsKt.checkRadix(radix));
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final String toString(int $this$toString, int radix) {
      String var10000 = Integer.toString($this$toString, CharsKt.checkRadix(radix));
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final String toString(long $this$toString, int radix) {
      String var10000 = Long.toString($this$toString, CharsKt.checkRadix(radix));
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final boolean toBoolean(String $this$toBoolean) {
      return Boolean.parseBoolean($this$toBoolean);
   }

   @InlineOnly
   private static final byte toByte(String $this$toByte) {
      Intrinsics.checkNotNullParameter($this$toByte, "<this>");
      return Byte.parseByte($this$toByte);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final byte toByte(String $this$toByte, int radix) {
      Intrinsics.checkNotNullParameter($this$toByte, "<this>");
      return Byte.parseByte($this$toByte, CharsKt.checkRadix(radix));
   }

   @InlineOnly
   private static final short toShort(String $this$toShort) {
      Intrinsics.checkNotNullParameter($this$toShort, "<this>");
      return Short.parseShort($this$toShort);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final short toShort(String $this$toShort, int radix) {
      Intrinsics.checkNotNullParameter($this$toShort, "<this>");
      return Short.parseShort($this$toShort, CharsKt.checkRadix(radix));
   }

   @InlineOnly
   private static final int toInt(String $this$toInt) {
      Intrinsics.checkNotNullParameter($this$toInt, "<this>");
      return Integer.parseInt($this$toInt);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final int toInt(String $this$toInt, int radix) {
      Intrinsics.checkNotNullParameter($this$toInt, "<this>");
      return Integer.parseInt($this$toInt, CharsKt.checkRadix(radix));
   }

   @InlineOnly
   private static final long toLong(String $this$toLong) {
      Intrinsics.checkNotNullParameter($this$toLong, "<this>");
      return Long.parseLong($this$toLong);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final long toLong(String $this$toLong, int radix) {
      Intrinsics.checkNotNullParameter($this$toLong, "<this>");
      return Long.parseLong($this$toLong, CharsKt.checkRadix(radix));
   }

   @InlineOnly
   private static final float toFloat(String $this$toFloat) {
      Intrinsics.checkNotNullParameter($this$toFloat, "<this>");
      return Float.parseFloat($this$toFloat);
   }

   @InlineOnly
   private static final double toDouble(String $this$toDouble) {
      Intrinsics.checkNotNullParameter($this$toDouble, "<this>");
      return Double.parseDouble($this$toDouble);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @Nullable
   public static final Float toFloatOrNull(@NotNull String $this$toFloatOrNull) {
      Intrinsics.checkNotNullParameter($this$toFloatOrNull, "<this>");
      boolean var1 = false;

      Float var2;
      try {
         Float var10000;
         if (isValidFloat$StringsKt__StringNumberConversionsJVMKt($this$toFloatOrNull)) {
            int var3 = false;
            var10000 = Float.parseFloat($this$toFloatOrNull);
         } else {
            var10000 = null;
         }

         var2 = var10000;
      } catch (NumberFormatException var4) {
         var2 = null;
      }

      return var2;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @Nullable
   public static final Double toDoubleOrNull(@NotNull String $this$toDoubleOrNull) {
      Intrinsics.checkNotNullParameter($this$toDoubleOrNull, "<this>");
      boolean var1 = false;

      Double var2;
      try {
         Double var10000;
         if (isValidFloat$StringsKt__StringNumberConversionsJVMKt($this$toDoubleOrNull)) {
            int var3 = false;
            var10000 = Double.parseDouble($this$toDoubleOrNull);
         } else {
            var10000 = null;
         }

         var2 = var10000;
      } catch (NumberFormatException var4) {
         var2 = null;
      }

      return var2;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigInteger toBigInteger(String $this$toBigInteger) {
      Intrinsics.checkNotNullParameter($this$toBigInteger, "<this>");
      return new BigInteger($this$toBigInteger);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigInteger toBigInteger(String $this$toBigInteger, int radix) {
      Intrinsics.checkNotNullParameter($this$toBigInteger, "<this>");
      return new BigInteger($this$toBigInteger, CharsKt.checkRadix(radix));
   }

   @SinceKotlin(
      version = "1.2"
   )
   @Nullable
   public static final BigInteger toBigIntegerOrNull(@NotNull String $this$toBigIntegerOrNull) {
      Intrinsics.checkNotNullParameter($this$toBigIntegerOrNull, "<this>");
      return StringsKt.toBigIntegerOrNull($this$toBigIntegerOrNull, 10);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @Nullable
   public static final BigInteger toBigIntegerOrNull(@NotNull String $this$toBigIntegerOrNull, int radix) {
      Intrinsics.checkNotNullParameter($this$toBigIntegerOrNull, "<this>");
      CharsKt.checkRadix(radix);
      int length = $this$toBigIntegerOrNull.length();
      switch(length) {
      case 0:
         return null;
      case 1:
         if (CharsKt.digitOf($this$toBigIntegerOrNull.charAt(0), radix) < 0) {
            return null;
         }
         break;
      default:
         int start = $this$toBigIntegerOrNull.charAt(0) == '-' ? 1 : 0;

         for(int index = start; index < length; ++index) {
            if (CharsKt.digitOf($this$toBigIntegerOrNull.charAt(index), radix) < 0) {
               return null;
            }
         }
      }

      return new BigInteger($this$toBigIntegerOrNull, CharsKt.checkRadix(radix));
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigDecimal toBigDecimal(String $this$toBigDecimal) {
      Intrinsics.checkNotNullParameter($this$toBigDecimal, "<this>");
      return new BigDecimal($this$toBigDecimal);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final BigDecimal toBigDecimal(String $this$toBigDecimal, MathContext mathContext) {
      Intrinsics.checkNotNullParameter($this$toBigDecimal, "<this>");
      Intrinsics.checkNotNullParameter(mathContext, "mathContext");
      return new BigDecimal($this$toBigDecimal, mathContext);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @Nullable
   public static final BigDecimal toBigDecimalOrNull(@NotNull String $this$toBigDecimalOrNull) {
      Intrinsics.checkNotNullParameter($this$toBigDecimalOrNull, "<this>");
      boolean var1 = false;

      BigDecimal var2;
      try {
         BigDecimal var10000;
         if (isValidFloat$StringsKt__StringNumberConversionsJVMKt($this$toBigDecimalOrNull)) {
            int var3 = false;
            var10000 = new BigDecimal($this$toBigDecimalOrNull);
         } else {
            var10000 = null;
         }

         var2 = var10000;
      } catch (NumberFormatException var4) {
         var2 = null;
      }

      return var2;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @Nullable
   public static final BigDecimal toBigDecimalOrNull(@NotNull String $this$toBigDecimalOrNull, @NotNull MathContext mathContext) {
      Intrinsics.checkNotNullParameter($this$toBigDecimalOrNull, "<this>");
      Intrinsics.checkNotNullParameter(mathContext, "mathContext");
      boolean var2 = false;

      BigDecimal var5;
      try {
         BigDecimal var10000;
         if (isValidFloat$StringsKt__StringNumberConversionsJVMKt($this$toBigDecimalOrNull)) {
            int var4 = false;
            var10000 = new BigDecimal($this$toBigDecimalOrNull, mathContext);
         } else {
            var10000 = null;
         }

         var5 = var10000;
      } catch (NumberFormatException var6) {
         var5 = null;
      }

      return var5;
   }

   private static final <T> T screenFloatValue$StringsKt__StringNumberConversionsJVMKt(String str, Function1<? super String, ? extends T> parse) {
      boolean var2 = false;

      Object var3;
      try {
         var3 = isValidFloat$StringsKt__StringNumberConversionsJVMKt(str) ? parse.invoke(str) : null;
      } catch (NumberFormatException var5) {
         var3 = null;
      }

      return var3;
   }

   private static final boolean isValidFloat$StringsKt__StringNumberConversionsJVMKt(String s) {
      int start = 0;
      int endInclusive = s.length() - 1;
      String var3 = s;

      int l;
      char it;
      boolean var6;
      for(l = start; l <= endInclusive; ++l) {
         it = var3.charAt(l);
         var6 = false;
         if (it > ' ') {
            break;
         }
      }

      int start = l;
      if (l > endInclusive) {
         return false;
      } else {
         var3 = s;

         for(l = endInclusive; l > start; --l) {
            it = var3.charAt(l);
            var6 = false;
            if (it > ' ') {
               break;
            }
         }

         endInclusive = l;
         if (s.charAt(start) == '+' || s.charAt(start) == '-') {
            ++start;
         }

         if (start > l) {
            return false;
         } else {
            boolean isHex = false;
            int var7;
            String var8;
            int var9;
            char it;
            boolean var11;
            char it;
            boolean var13;
            int var10000;
            int var17;
            boolean var19;
            boolean var20;
            String var21;
            int var22;
            if (s.charAt(start) == '0') {
               ++start;
               if (start > l) {
                  return true;
               }

               if ((s.charAt(start) | 32) == 120) {
                  ++start;
                  var8 = s;

                  for(var9 = start; var9 <= endInclusive; ++var9) {
                     it = var8.charAt(var9);
                     var11 = false;
                     if ((it - 48 & '\uffff') >= 10 && ((it | 32) - 97 & '\uffff') >= 6) {
                        break;
                     }
                  }

                  var17 = var9;
                  var19 = start != var9;
                  if (var9 > endInclusive) {
                     var10000 = -1;
                  } else {
                     var20 = false;
                     if (s.charAt(var9) == '.') {
                        ++var17;
                        var7 = var17;
                        var21 = s;

                        for(var22 = var17; var22 <= endInclusive; ++var22) {
                           it = var21.charAt(var22);
                           var13 = false;
                           if ((it - 48 & '\uffff') >= 10 && ((it | 32) - 97 & '\uffff') >= 6) {
                              break;
                           }
                        }

                        var17 = var22;
                        var20 = var7 != var22;
                     }

                     var10000 = !var19 && !var20 ? -1 : var17;
                  }

                  start = var10000;
                  if (start == -1 || start > endInclusive) {
                     return false;
                  }

                  isHex = true;
               } else {
                  --start;
               }
            }

            if (!isHex) {
               var8 = s;

               for(var9 = start; var9 <= endInclusive; ++var9) {
                  it = var8.charAt(var9);
                  var11 = false;
                  if ((it - 48 & '\uffff') >= 10) {
                     break;
                  }
               }

               var17 = var9;
               var19 = start != var9;
               if (var9 > endInclusive) {
                  var10000 = var9;
               } else {
                  var20 = false;
                  if (s.charAt(var9) == '.') {
                     ++var17;
                     var7 = var17;
                     var21 = s;

                     for(var22 = var17; var22 <= endInclusive; ++var22) {
                        it = var21.charAt(var22);
                        var13 = false;
                        if ((it - 48 & '\uffff') >= 10) {
                           break;
                        }
                     }

                     var17 = var22;
                     var20 = var7 != var22;
                  }

                  if (!var19 && !var20) {
                     var21 = endInclusive == var17 + 3 - 1 ? "NaN" : (endInclusive == var17 + 8 - 1 ? "Infinity" : null);
                     var10000 = var21 == null ? -1 : (StringsKt.indexOf((CharSequence)s, var21, var17, false) == var17 ? endInclusive + 1 : -1);
                  } else {
                     var10000 = var17;
                  }
               }

               start = var10000;
               if (start == -1) {
                  return false;
               }

               if (start > endInclusive) {
                  return true;
               }
            }

            l = s.charAt(start++) | 32;
            if (l != (isHex ? 112 : 101)) {
               return !isHex && (l == 102 || l == 100) && start > endInclusive;
            } else if (start > endInclusive) {
               return false;
            } else {
               if (s.charAt(start) == '+' || s.charAt(start) == '-') {
                  ++start;
                  if (start > endInclusive) {
                     return false;
                  }
               }

               String var16 = s;

               for(var17 = start; var17 <= endInclusive; ++var17) {
                  char it = var16.charAt(var17);
                  var19 = false;
                  if ((it - 48 & '\uffff') >= 10) {
                     break;
                  }
               }

               if (var17 > endInclusive) {
                  return true;
               } else if (var17 != endInclusive) {
                  return false;
               } else {
                  l = s.charAt(var17) | 32;
                  return l == 102 || l == 100;
               }
            }
         }
      }
   }

   @InlineOnly
   private static final String guessNamedFloatConstant$StringsKt__StringNumberConversionsJVMKt(int start, int endInclusive) {
      return endInclusive == start + 3 - 1 ? "NaN" : (endInclusive == start + 8 - 1 ? "Infinity" : null);
   }

   @InlineOnly
   private static final boolean isAsciiDigit$StringsKt__StringNumberConversionsJVMKt(char $this$isAsciiDigit) {
      return ($this$isAsciiDigit - 48 & '\uffff') < 10;
   }

   @InlineOnly
   private static final boolean isHexLetter$StringsKt__StringNumberConversionsJVMKt(char $this$isHexLetter) {
      return (($this$isHexLetter | 32) - 97 & '\uffff') < 6;
   }

   @InlineOnly
   private static final int asciiLetterToLowerCaseCode$StringsKt__StringNumberConversionsJVMKt(char $this$asciiLetterToLowerCaseCode) {
      return $this$asciiLetterToLowerCaseCode | 32;
   }

   @InlineOnly
   private static final int advanceWhile$StringsKt__StringNumberConversionsJVMKt(String $this$advanceWhile, int start, int endInclusive, Function1<? super Character, Boolean> predicate) {
      int start;
      for(start = start; start <= endInclusive && (Boolean)predicate.invoke($this$advanceWhile.charAt(start)); ++start) {
      }

      return start;
   }

   @InlineOnly
   private static final int backtrackWhile$StringsKt__StringNumberConversionsJVMKt(String $this$backtrackWhile, int start, int endInclusive, Function1<? super Character, Boolean> predicate) {
      int endInclusive;
      for(endInclusive = endInclusive; endInclusive > start && (Boolean)predicate.invoke($this$backtrackWhile.charAt(endInclusive)); --endInclusive) {
      }

      return endInclusive;
   }

   @InlineOnly
   private static final int advanceAndValidateMantissa$StringsKt__StringNumberConversionsJVMKt(String $this$advanceAndValidateMantissa, int start, int endInclusive, boolean hexFormat, Function1<? super Character, Boolean> predicate) {
      String var7 = $this$advanceAndValidateMantissa;

      int var8;
      for(var8 = start; var8 <= endInclusive && (Boolean)predicate.invoke(var7.charAt(var8)); ++var8) {
      }

      int start = var8;
      boolean hasIntegerPart = start != var8;
      if (var8 > endInclusive) {
         return hexFormat ? -1 : var8;
      } else {
         boolean hasFractionalPart = false;
         String constant;
         if ($this$advanceAndValidateMantissa.charAt(var8) == '.') {
            ++start;
            int checkpoint = start;
            constant = $this$advanceAndValidateMantissa;

            int var10;
            for(var10 = start; var10 <= endInclusive && (Boolean)predicate.invoke(constant.charAt(var10)); ++var10) {
            }

            start = var10;
            hasFractionalPart = checkpoint != var10;
         }

         if (!hasIntegerPart && !hasFractionalPart) {
            if (hexFormat) {
               return -1;
            } else {
               constant = endInclusive == start + 3 - 1 ? "NaN" : (endInclusive == start + 8 - 1 ? "Infinity" : null);
               if (constant == null) {
                  return -1;
               } else {
                  return StringsKt.indexOf((CharSequence)$this$advanceAndValidateMantissa, constant, start, false) == start ? endInclusive + 1 : -1;
               }
            }
         } else {
            return start;
         }
      }
   }

   public StringsKt__StringNumberConversionsJVMKt() {
   }
}
