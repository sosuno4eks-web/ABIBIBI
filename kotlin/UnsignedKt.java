package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

@JvmName(
   name = "UnsignedKt"
)
public final class UnsignedKt {
   @PublishedApi
   public static final int uintRemainder_J1ME1BU/* $FF was: uintRemainder-J1ME1BU*/(int v1, int v2) {
      return UInt.constructor-impl((int)(((long)v1 & 4294967295L) % ((long)v2 & 4294967295L)));
   }

   @PublishedApi
   public static final int uintDivide_J1ME1BU/* $FF was: uintDivide-J1ME1BU*/(int v1, int v2) {
      return UInt.constructor-impl((int)(((long)v1 & 4294967295L) / ((long)v2 & 4294967295L)));
   }

   @PublishedApi
   public static final long ulongDivide_eb3DHEI/* $FF was: ulongDivide-eb3DHEI*/(long v1, long v2) {
      if (v2 < 0L) {
         return Long.compareUnsigned(v1, v2) < 0 ? ULong.constructor-impl(0L) : ULong.constructor-impl(1L);
      } else if (v1 >= 0L) {
         return ULong.constructor-impl(v1 / v2);
      } else {
         long quotient = (v1 >>> 1) / v2 << 1;
         long rem = v1 - quotient * v2;
         return ULong.constructor-impl(quotient + (long)(Long.compareUnsigned(ULong.constructor-impl(rem), ULong.constructor-impl(v2)) >= 0 ? 1 : 0));
      }
   }

   @PublishedApi
   public static final long ulongRemainder_eb3DHEI/* $FF was: ulongRemainder-eb3DHEI*/(long v1, long v2) {
      if (v2 < 0L) {
         return Long.compareUnsigned(v1, v2) < 0 ? v1 : ULong.constructor-impl(v1 - v2);
      } else if (v1 >= 0L) {
         return ULong.constructor-impl(v1 % v2);
      } else {
         long quotient = (v1 >>> 1) / v2 << 1;
         long rem = v1 - quotient * v2;
         return ULong.constructor-impl(rem - (Long.compareUnsigned(ULong.constructor-impl(rem), ULong.constructor-impl(v2)) >= 0 ? v2 : 0L));
      }
   }

   @PublishedApi
   public static final int uintCompare(int v1, int v2) {
      return Intrinsics.compare(v1 ^ Integer.MIN_VALUE, v2 ^ Integer.MIN_VALUE);
   }

   @PublishedApi
   public static final int ulongCompare(long v1, long v2) {
      return Intrinsics.compare(v1 ^ Long.MIN_VALUE, v2 ^ Long.MIN_VALUE);
   }

   @PublishedApi
   @InlineOnly
   private static final long uintToULong(int value) {
      return ULong.constructor-impl((long)value & 4294967295L);
   }

   @PublishedApi
   @InlineOnly
   private static final long uintToLong(int value) {
      return (long)value & 4294967295L;
   }

   @PublishedApi
   @InlineOnly
   private static final float uintToFloat(int value) {
      return (float)uintToDouble(value);
   }

   @PublishedApi
   @InlineOnly
   private static final int floatToUInt(float value) {
      return doubleToUInt((double)value);
   }

   @PublishedApi
   public static final double uintToDouble(int value) {
      return (double)(value & Integer.MAX_VALUE) + (double)(value >>> 31 << 30) * (double)2;
   }

   @PublishedApi
   public static final int doubleToUInt(double value) {
      return Double.isNaN(value) ? 0 : (value <= uintToDouble(0) ? 0 : (value >= uintToDouble(-1) ? -1 : (value <= 2.147483647E9D ? UInt.constructor-impl((int)value) : UInt.constructor-impl(UInt.constructor-impl((int)(value - (double)Integer.MAX_VALUE)) + UInt.constructor-impl(Integer.MAX_VALUE)))));
   }

   @PublishedApi
   @InlineOnly
   private static final float ulongToFloat(long value) {
      return (float)ulongToDouble(value);
   }

   @PublishedApi
   @InlineOnly
   private static final long floatToULong(float value) {
      return doubleToULong((double)value);
   }

   @PublishedApi
   public static final double ulongToDouble(long value) {
      return (double)(value >>> 11) * (double)2048 + (double)(value & 2047L);
   }

   @PublishedApi
   public static final long doubleToULong(double value) {
      return Double.isNaN(value) ? 0L : (value <= ulongToDouble(0L) ? 0L : (value >= ulongToDouble(-1L) ? -1L : (value < 9.223372036854776E18D ? ULong.constructor-impl((long)value) : ULong.constructor-impl(ULong.constructor-impl((long)(value - 9.223372036854776E18D)) + Long.MIN_VALUE))));
   }

   @InlineOnly
   private static final String uintToString(int value) {
      return String.valueOf((long)value & 4294967295L);
   }

   @InlineOnly
   private static final String uintToString(int value, int base) {
      return ulongToString((long)value & 4294967295L, base);
   }

   @InlineOnly
   private static final String ulongToString(long value) {
      return ulongToString(value, 10);
   }

   @NotNull
   public static final String ulongToString(long value, int base) {
      if (value >= 0L) {
         String var7 = Long.toString(value, CharsKt.checkRadix(base));
         Intrinsics.checkNotNullExpressionValue(var7, "toString(...)");
         return var7;
      } else {
         long quotient = (value >>> 1) / (long)base << 1;
         long rem = value - quotient * (long)base;
         if (rem >= (long)base) {
            rem -= (long)base;
            ++quotient;
         }

         StringBuilder var10000 = new StringBuilder();
         String var10001 = Long.toString(quotient, CharsKt.checkRadix(base));
         Intrinsics.checkNotNullExpressionValue(var10001, "toString(...)");
         var10000 = var10000.append(var10001);
         var10001 = Long.toString(rem, CharsKt.checkRadix(base));
         Intrinsics.checkNotNullExpressionValue(var10001, "toString(...)");
         return var10000.append(var10001).toString();
      }
   }
}
