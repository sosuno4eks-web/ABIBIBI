package kotlin.text;

import kotlin.KotlinNothingValueException;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.UnsignedKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmName(
   name = "UStringsKt"
)
public final class UStringsKt {
   @SinceKotlin(
      version = "1.5"
   )
   @NotNull
   public static final String toString_LxnNnR4/* $FF was: toString-LxnNnR4*/(byte $this$toString_u2dLxnNnR4, int radix) {
      String var10000 = Integer.toString($this$toString_u2dLxnNnR4 & 255, CharsKt.checkRadix(radix));
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @NotNull
   public static final String toString_olVBNx4/* $FF was: toString-olVBNx4*/(short $this$toString_u2dolVBNx4, int radix) {
      String var10000 = Integer.toString($this$toString_u2dolVBNx4 & '\uffff', CharsKt.checkRadix(radix));
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @NotNull
   public static final String toString_V7xB4Y4/* $FF was: toString-V7xB4Y4*/(int $this$toString_u2dV7xB4Y4, int radix) {
      int var3 = CharsKt.checkRadix(radix);
      return UnsignedKt.ulongToString((long)$this$toString_u2dV7xB4Y4 & 4294967295L, var3);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @NotNull
   public static final String toString_JSWoG40/* $FF was: toString-JSWoG40*/(long $this$toString_u2dJSWoG40, int radix) {
      return UnsignedKt.ulongToString($this$toString_u2dJSWoG40, CharsKt.checkRadix(radix));
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final byte toUByte(@NotNull String $this$toUByte) {
      Intrinsics.checkNotNullParameter($this$toUByte, "<this>");
      UByte var10000 = toUByteOrNull($this$toUByte);
      if (var10000 != null) {
         return var10000.unbox-impl();
      } else {
         StringsKt.numberFormatError($this$toUByte);
         throw new KotlinNothingValueException();
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final byte toUByte(@NotNull String $this$toUByte, int radix) {
      Intrinsics.checkNotNullParameter($this$toUByte, "<this>");
      UByte var10000 = toUByteOrNull($this$toUByte, radix);
      if (var10000 != null) {
         return var10000.unbox-impl();
      } else {
         StringsKt.numberFormatError($this$toUByte);
         throw new KotlinNothingValueException();
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final short toUShort(@NotNull String $this$toUShort) {
      Intrinsics.checkNotNullParameter($this$toUShort, "<this>");
      UShort var10000 = toUShortOrNull($this$toUShort);
      if (var10000 != null) {
         return var10000.unbox-impl();
      } else {
         StringsKt.numberFormatError($this$toUShort);
         throw new KotlinNothingValueException();
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final short toUShort(@NotNull String $this$toUShort, int radix) {
      Intrinsics.checkNotNullParameter($this$toUShort, "<this>");
      UShort var10000 = toUShortOrNull($this$toUShort, radix);
      if (var10000 != null) {
         return var10000.unbox-impl();
      } else {
         StringsKt.numberFormatError($this$toUShort);
         throw new KotlinNothingValueException();
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final int toUInt(@NotNull String $this$toUInt) {
      Intrinsics.checkNotNullParameter($this$toUInt, "<this>");
      UInt var10000 = toUIntOrNull($this$toUInt);
      if (var10000 != null) {
         return var10000.unbox-impl();
      } else {
         StringsKt.numberFormatError($this$toUInt);
         throw new KotlinNothingValueException();
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final int toUInt(@NotNull String $this$toUInt, int radix) {
      Intrinsics.checkNotNullParameter($this$toUInt, "<this>");
      UInt var10000 = toUIntOrNull($this$toUInt, radix);
      if (var10000 != null) {
         return var10000.unbox-impl();
      } else {
         StringsKt.numberFormatError($this$toUInt);
         throw new KotlinNothingValueException();
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final long toULong(@NotNull String $this$toULong) {
      Intrinsics.checkNotNullParameter($this$toULong, "<this>");
      ULong var10000 = toULongOrNull($this$toULong);
      if (var10000 != null) {
         return var10000.unbox-impl();
      } else {
         StringsKt.numberFormatError($this$toULong);
         throw new KotlinNothingValueException();
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final long toULong(@NotNull String $this$toULong, int radix) {
      Intrinsics.checkNotNullParameter($this$toULong, "<this>");
      ULong var10000 = toULongOrNull($this$toULong, radix);
      if (var10000 != null) {
         return var10000.unbox-impl();
      } else {
         StringsKt.numberFormatError($this$toULong);
         throw new KotlinNothingValueException();
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   @Nullable
   public static final UByte toUByteOrNull(@NotNull String $this$toUByteOrNull) {
      Intrinsics.checkNotNullParameter($this$toUByteOrNull, "<this>");
      return toUByteOrNull($this$toUByteOrNull, 10);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @Nullable
   public static final UByte toUByteOrNull(@NotNull String $this$toUByteOrNull, int radix) {
      Intrinsics.checkNotNullParameter($this$toUByteOrNull, "<this>");
      UInt var10000 = toUIntOrNull($this$toUByteOrNull, radix);
      if (var10000 != null) {
         int var2 = var10000.unbox-impl();
         byte var3 = -1;
         return Integer.compareUnsigned(var2, UInt.constructor-impl(var3 & 255)) > 0 ? null : UByte.box-impl(UByte.constructor-impl((byte)var2));
      } else {
         return null;
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   @Nullable
   public static final UShort toUShortOrNull(@NotNull String $this$toUShortOrNull) {
      Intrinsics.checkNotNullParameter($this$toUShortOrNull, "<this>");
      return toUShortOrNull($this$toUShortOrNull, 10);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @Nullable
   public static final UShort toUShortOrNull(@NotNull String $this$toUShortOrNull, int radix) {
      Intrinsics.checkNotNullParameter($this$toUShortOrNull, "<this>");
      UInt var10000 = toUIntOrNull($this$toUShortOrNull, radix);
      if (var10000 != null) {
         int var2 = var10000.unbox-impl();
         byte var3 = -1;
         return Integer.compareUnsigned(var2, UInt.constructor-impl(var3 & '\uffff')) > 0 ? null : UShort.box-impl(UShort.constructor-impl((short)var2));
      } else {
         return null;
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   @Nullable
   public static final UInt toUIntOrNull(@NotNull String $this$toUIntOrNull) {
      Intrinsics.checkNotNullParameter($this$toUIntOrNull, "<this>");
      return toUIntOrNull($this$toUIntOrNull, 10);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @Nullable
   public static final UInt toUIntOrNull(@NotNull String $this$toUIntOrNull, int radix) {
      Intrinsics.checkNotNullParameter($this$toUIntOrNull, "<this>");
      CharsKt.checkRadix(radix);
      int length = $this$toUIntOrNull.length();
      if (length == 0) {
         return null;
      } else {
         int limit = -1;
         int start = false;
         char firstChar = $this$toUIntOrNull.charAt(0);
         byte start;
         if (Intrinsics.compare(firstChar, 48) < 0) {
            if (length == 1 || firstChar != '+') {
               return null;
            }

            start = 1;
         } else {
            start = 0;
         }

         int limitForMaxRadix = 119304647;
         int limitBeforeMul = limitForMaxRadix;
         int uradix = UInt.constructor-impl(radix);
         int result = 0;

         for(int i = start; i < length; ++i) {
            int digit = CharsKt.digitOf($this$toUIntOrNull.charAt(i), radix);
            if (digit < 0) {
               return null;
            }

            if (Integer.compareUnsigned(result, limitBeforeMul) > 0) {
               if (limitBeforeMul != limitForMaxRadix) {
                  return null;
               }

               limitBeforeMul = Integer.divideUnsigned(limit, uradix);
               if (Integer.compareUnsigned(result, limitBeforeMul) > 0) {
                  return null;
               }
            }

            result = UInt.constructor-impl(result * uradix);
            int beforeAdding = result;
            result = UInt.constructor-impl(result + UInt.constructor-impl(digit));
            if (Integer.compareUnsigned(result, beforeAdding) < 0) {
               return null;
            }
         }

         return UInt.box-impl(result);
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   @Nullable
   public static final ULong toULongOrNull(@NotNull String $this$toULongOrNull) {
      Intrinsics.checkNotNullParameter($this$toULongOrNull, "<this>");
      return toULongOrNull($this$toULongOrNull, 10);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @Nullable
   public static final ULong toULongOrNull(@NotNull String $this$toULongOrNull, int radix) {
      Intrinsics.checkNotNullParameter($this$toULongOrNull, "<this>");
      CharsKt.checkRadix(radix);
      int length = $this$toULongOrNull.length();
      if (length == 0) {
         return null;
      } else {
         long limit = -1L;
         int start = false;
         char firstChar = $this$toULongOrNull.charAt(0);
         byte start;
         if (Intrinsics.compare(firstChar, 48) < 0) {
            if (length == 1 || firstChar != '+') {
               return null;
            }

            start = 1;
         } else {
            start = 0;
         }

         long limitForMaxRadix = 512409557603043100L;
         long limitBeforeMul = limitForMaxRadix;
         long uradix = ULong.constructor-impl((long)radix);
         long result = 0L;

         for(int i = start; i < length; ++i) {
            int digit = CharsKt.digitOf($this$toULongOrNull.charAt(i), radix);
            if (digit < 0) {
               return null;
            }

            if (Long.compareUnsigned(result, limitBeforeMul) > 0) {
               if (limitBeforeMul != limitForMaxRadix) {
                  return null;
               }

               limitBeforeMul = Long.divideUnsigned(limit, uradix);
               if (Long.compareUnsigned(result, limitBeforeMul) > 0) {
                  return null;
               }
            }

            result = ULong.constructor-impl(result * uradix);
            long beforeAdding = result;
            int var19 = UInt.constructor-impl(digit);
            result = ULong.constructor-impl(result + ULong.constructor-impl((long)var19 & 4294967295L));
            if (Long.compareUnsigned(result, beforeAdding) < 0) {
               return null;
            }
         }

         return ULong.box-impl(result);
      }
   }
}
