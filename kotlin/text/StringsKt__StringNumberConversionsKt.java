package kotlin.text;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class StringsKt__StringNumberConversionsKt extends StringsKt__StringNumberConversionsJVMKt {
   @SinceKotlin(
      version = "1.1"
   )
   @Nullable
   public static final Byte toByteOrNull(@NotNull String $this$toByteOrNull) {
      Intrinsics.checkNotNullParameter($this$toByteOrNull, "<this>");
      return StringsKt.toByteOrNull($this$toByteOrNull, 10);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @Nullable
   public static final Byte toByteOrNull(@NotNull String $this$toByteOrNull, int radix) {
      Intrinsics.checkNotNullParameter($this$toByteOrNull, "<this>");
      Integer var10000 = StringsKt.toIntOrNull($this$toByteOrNull, radix);
      if (var10000 != null) {
         int var2 = var10000;
         return var2 >= -128 && var2 <= 127 ? (byte)var2 : null;
      } else {
         return null;
      }
   }

   @SinceKotlin(
      version = "1.1"
   )
   @Nullable
   public static final Short toShortOrNull(@NotNull String $this$toShortOrNull) {
      Intrinsics.checkNotNullParameter($this$toShortOrNull, "<this>");
      return StringsKt.toShortOrNull($this$toShortOrNull, 10);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @Nullable
   public static final Short toShortOrNull(@NotNull String $this$toShortOrNull, int radix) {
      Intrinsics.checkNotNullParameter($this$toShortOrNull, "<this>");
      Integer var10000 = StringsKt.toIntOrNull($this$toShortOrNull, radix);
      if (var10000 != null) {
         int var2 = var10000;
         return var2 >= -32768 && var2 <= 32767 ? (short)var2 : null;
      } else {
         return null;
      }
   }

   @SinceKotlin(
      version = "1.1"
   )
   @Nullable
   public static final Integer toIntOrNull(@NotNull String $this$toIntOrNull) {
      Intrinsics.checkNotNullParameter($this$toIntOrNull, "<this>");
      return StringsKt.toIntOrNull($this$toIntOrNull, 10);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @Nullable
   public static final Integer toIntOrNull(@NotNull String $this$toIntOrNull, int radix) {
      Intrinsics.checkNotNullParameter($this$toIntOrNull, "<this>");
      CharsKt.checkRadix(radix);
      int length = $this$toIntOrNull.length();
      if (length == 0) {
         return null;
      } else {
         int start = false;
         boolean isNegative = false;
         int limit = false;
         char firstChar = $this$toIntOrNull.charAt(0);
         byte start;
         int limit;
         if (Intrinsics.compare(firstChar, 48) < 0) {
            if (length == 1) {
               return null;
            }

            start = 1;
            switch(firstChar) {
            case '+':
               isNegative = false;
               limit = -2147483647;
               break;
            case ',':
            default:
               return null;
            case '-':
               isNegative = true;
               limit = Integer.MIN_VALUE;
            }
         } else {
            start = 0;
            isNegative = false;
            limit = -2147483647;
         }

         int limitForMaxRadix = -59652323;
         int limitBeforeMul = limitForMaxRadix;
         int result = 0;

         for(int i = start; i < length; ++i) {
            int digit = CharsKt.digitOf($this$toIntOrNull.charAt(i), radix);
            if (digit < 0) {
               return null;
            }

            if (result < limitBeforeMul) {
               if (limitBeforeMul != limitForMaxRadix) {
                  return null;
               }

               limitBeforeMul = limit / radix;
               if (result < limitBeforeMul) {
                  return null;
               }
            }

            result *= radix;
            if (result < limit + digit) {
               return null;
            }

            result -= digit;
         }

         return isNegative ? result : -result;
      }
   }

   @SinceKotlin(
      version = "1.1"
   )
   @Nullable
   public static final Long toLongOrNull(@NotNull String $this$toLongOrNull) {
      Intrinsics.checkNotNullParameter($this$toLongOrNull, "<this>");
      return StringsKt.toLongOrNull($this$toLongOrNull, 10);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @Nullable
   public static final Long toLongOrNull(@NotNull String $this$toLongOrNull, int radix) {
      Intrinsics.checkNotNullParameter($this$toLongOrNull, "<this>");
      CharsKt.checkRadix(radix);
      int length = $this$toLongOrNull.length();
      if (length == 0) {
         return null;
      } else {
         int start = false;
         boolean isNegative = false;
         long limit = 0L;
         char firstChar = $this$toLongOrNull.charAt(0);
         byte start;
         if (Intrinsics.compare(firstChar, 48) < 0) {
            if (length == 1) {
               return null;
            }

            start = 1;
            switch(firstChar) {
            case '+':
               isNegative = false;
               limit = -9223372036854775807L;
               break;
            case ',':
            default:
               return null;
            case '-':
               isNegative = true;
               limit = Long.MIN_VALUE;
            }
         } else {
            start = 0;
            isNegative = false;
            limit = -9223372036854775807L;
         }

         long limitForMaxRadix = -256204778801521550L;
         long limitBeforeMul = limitForMaxRadix;
         long result = 0L;

         for(int i = start; i < length; ++i) {
            int digit = CharsKt.digitOf($this$toLongOrNull.charAt(i), radix);
            if (digit < 0) {
               return null;
            }

            if (result < limitBeforeMul) {
               if (limitBeforeMul != limitForMaxRadix) {
                  return null;
               }

               limitBeforeMul = limit / (long)radix;
               if (result < limitBeforeMul) {
                  return null;
               }
            }

            result *= (long)radix;
            if (result < limit + (long)digit) {
               return null;
            }

            result -= (long)digit;
         }

         return isNegative ? result : -result;
      }
   }

   @NotNull
   public static final Void numberFormatError(@NotNull String input) {
      Intrinsics.checkNotNullParameter(input, "input");
      throw new NumberFormatException("Invalid number format: '" + input + '\'');
   }

   public StringsKt__StringNumberConversionsKt() {
   }
}
