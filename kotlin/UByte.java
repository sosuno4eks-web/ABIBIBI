package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;
import org.jetbrains.annotations.NotNull;

@JvmInline
@SinceKotlin(
   version = "1.5"
)
public final class UByte implements Comparable<UByte> {
   @NotNull
   public static final UByte.Companion Companion = new UByte.Companion((DefaultConstructorMarker)null);
   private final byte data;
   public static final byte MIN_VALUE = 0;
   public static final byte MAX_VALUE = -1;
   public static final int SIZE_BYTES = 1;
   public static final int SIZE_BITS = 8;

   /** @deprecated */
   // $FF: synthetic method
   @PublishedApi
   public static void getData$annotations() {
   }

   @InlineOnly
   private static int compareTo_7apg3OU/* $FF was: compareTo-7apg3OU*/(byte arg0, byte other) {
      return Intrinsics.compare(arg0 & 255, other & 255);
   }

   @InlineOnly
   private int compareTo_7apg3OU/* $FF was: compareTo-7apg3OU*/(byte other) {
      return Intrinsics.compare(this.unbox-impl() & 255, other & 255);
   }

   @InlineOnly
   private static final int compareTo_xj2QHRw/* $FF was: compareTo-xj2QHRw*/(byte arg0, short other) {
      return Intrinsics.compare(arg0 & 255, other & '\uffff');
   }

   @InlineOnly
   private static final int compareTo_WZ4Q5Ns/* $FF was: compareTo-WZ4Q5Ns*/(byte arg0, int other) {
      return Integer.compareUnsigned(UInt.constructor-impl(arg0 & 255), other);
   }

   @InlineOnly
   private static final int compareTo_VKZWuLQ/* $FF was: compareTo-VKZWuLQ*/(byte arg0, long other) {
      return Long.compareUnsigned(ULong.constructor-impl((long)arg0 & 255L), other);
   }

   @InlineOnly
   private static final int plus_7apg3OU/* $FF was: plus-7apg3OU*/(byte arg0, byte other) {
      return UInt.constructor-impl(UInt.constructor-impl(arg0 & 255) + UInt.constructor-impl(other & 255));
   }

   @InlineOnly
   private static final int plus_xj2QHRw/* $FF was: plus-xj2QHRw*/(byte arg0, short other) {
      return UInt.constructor-impl(UInt.constructor-impl(arg0 & 255) + UInt.constructor-impl(other & '\uffff'));
   }

   @InlineOnly
   private static final int plus_WZ4Q5Ns/* $FF was: plus-WZ4Q5Ns*/(byte arg0, int other) {
      return UInt.constructor-impl(UInt.constructor-impl(arg0 & 255) + other);
   }

   @InlineOnly
   private static final long plus_VKZWuLQ/* $FF was: plus-VKZWuLQ*/(byte arg0, long other) {
      return ULong.constructor-impl(ULong.constructor-impl((long)arg0 & 255L) + other);
   }

   @InlineOnly
   private static final int minus_7apg3OU/* $FF was: minus-7apg3OU*/(byte arg0, byte other) {
      return UInt.constructor-impl(UInt.constructor-impl(arg0 & 255) - UInt.constructor-impl(other & 255));
   }

   @InlineOnly
   private static final int minus_xj2QHRw/* $FF was: minus-xj2QHRw*/(byte arg0, short other) {
      return UInt.constructor-impl(UInt.constructor-impl(arg0 & 255) - UInt.constructor-impl(other & '\uffff'));
   }

   @InlineOnly
   private static final int minus_WZ4Q5Ns/* $FF was: minus-WZ4Q5Ns*/(byte arg0, int other) {
      return UInt.constructor-impl(UInt.constructor-impl(arg0 & 255) - other);
   }

   @InlineOnly
   private static final long minus_VKZWuLQ/* $FF was: minus-VKZWuLQ*/(byte arg0, long other) {
      return ULong.constructor-impl(ULong.constructor-impl((long)arg0 & 255L) - other);
   }

   @InlineOnly
   private static final int times_7apg3OU/* $FF was: times-7apg3OU*/(byte arg0, byte other) {
      return UInt.constructor-impl(UInt.constructor-impl(arg0 & 255) * UInt.constructor-impl(other & 255));
   }

   @InlineOnly
   private static final int times_xj2QHRw/* $FF was: times-xj2QHRw*/(byte arg0, short other) {
      return UInt.constructor-impl(UInt.constructor-impl(arg0 & 255) * UInt.constructor-impl(other & '\uffff'));
   }

   @InlineOnly
   private static final int times_WZ4Q5Ns/* $FF was: times-WZ4Q5Ns*/(byte arg0, int other) {
      return UInt.constructor-impl(UInt.constructor-impl(arg0 & 255) * other);
   }

   @InlineOnly
   private static final long times_VKZWuLQ/* $FF was: times-VKZWuLQ*/(byte arg0, long other) {
      return ULong.constructor-impl(ULong.constructor-impl((long)arg0 & 255L) * other);
   }

   @InlineOnly
   private static final int div_7apg3OU/* $FF was: div-7apg3OU*/(byte arg0, byte other) {
      return Integer.divideUnsigned(UInt.constructor-impl(arg0 & 255), UInt.constructor-impl(other & 255));
   }

   @InlineOnly
   private static final int div_xj2QHRw/* $FF was: div-xj2QHRw*/(byte arg0, short other) {
      return Integer.divideUnsigned(UInt.constructor-impl(arg0 & 255), UInt.constructor-impl(other & '\uffff'));
   }

   @InlineOnly
   private static final int div_WZ4Q5Ns/* $FF was: div-WZ4Q5Ns*/(byte arg0, int other) {
      return Integer.divideUnsigned(UInt.constructor-impl(arg0 & 255), other);
   }

   @InlineOnly
   private static final long div_VKZWuLQ/* $FF was: div-VKZWuLQ*/(byte arg0, long other) {
      return Long.divideUnsigned(ULong.constructor-impl((long)arg0 & 255L), other);
   }

   @InlineOnly
   private static final int rem_7apg3OU/* $FF was: rem-7apg3OU*/(byte arg0, byte other) {
      return Integer.remainderUnsigned(UInt.constructor-impl(arg0 & 255), UInt.constructor-impl(other & 255));
   }

   @InlineOnly
   private static final int rem_xj2QHRw/* $FF was: rem-xj2QHRw*/(byte arg0, short other) {
      return Integer.remainderUnsigned(UInt.constructor-impl(arg0 & 255), UInt.constructor-impl(other & '\uffff'));
   }

   @InlineOnly
   private static final int rem_WZ4Q5Ns/* $FF was: rem-WZ4Q5Ns*/(byte arg0, int other) {
      return Integer.remainderUnsigned(UInt.constructor-impl(arg0 & 255), other);
   }

   @InlineOnly
   private static final long rem_VKZWuLQ/* $FF was: rem-VKZWuLQ*/(byte arg0, long other) {
      return Long.remainderUnsigned(ULong.constructor-impl((long)arg0 & 255L), other);
   }

   @InlineOnly
   private static final int floorDiv_7apg3OU/* $FF was: floorDiv-7apg3OU*/(byte arg0, byte other) {
      return Integer.divideUnsigned(UInt.constructor-impl(arg0 & 255), UInt.constructor-impl(other & 255));
   }

   @InlineOnly
   private static final int floorDiv_xj2QHRw/* $FF was: floorDiv-xj2QHRw*/(byte arg0, short other) {
      return Integer.divideUnsigned(UInt.constructor-impl(arg0 & 255), UInt.constructor-impl(other & '\uffff'));
   }

   @InlineOnly
   private static final int floorDiv_WZ4Q5Ns/* $FF was: floorDiv-WZ4Q5Ns*/(byte arg0, int other) {
      return Integer.divideUnsigned(UInt.constructor-impl(arg0 & 255), other);
   }

   @InlineOnly
   private static final long floorDiv_VKZWuLQ/* $FF was: floorDiv-VKZWuLQ*/(byte arg0, long other) {
      return Long.divideUnsigned(ULong.constructor-impl((long)arg0 & 255L), other);
   }

   @InlineOnly
   private static final byte mod_7apg3OU/* $FF was: mod-7apg3OU*/(byte arg0, byte other) {
      return constructor-impl((byte)Integer.remainderUnsigned(UInt.constructor-impl(arg0 & 255), UInt.constructor-impl(other & 255)));
   }

   @InlineOnly
   private static final short mod_xj2QHRw/* $FF was: mod-xj2QHRw*/(byte arg0, short other) {
      return UShort.constructor-impl((short)Integer.remainderUnsigned(UInt.constructor-impl(arg0 & 255), UInt.constructor-impl(other & '\uffff')));
   }

   @InlineOnly
   private static final int mod_WZ4Q5Ns/* $FF was: mod-WZ4Q5Ns*/(byte arg0, int other) {
      return Integer.remainderUnsigned(UInt.constructor-impl(arg0 & 255), other);
   }

   @InlineOnly
   private static final long mod_VKZWuLQ/* $FF was: mod-VKZWuLQ*/(byte arg0, long other) {
      return Long.remainderUnsigned(ULong.constructor-impl((long)arg0 & 255L), other);
   }

   @InlineOnly
   private static final byte inc_w2LRezQ/* $FF was: inc-w2LRezQ*/(byte arg0) {
      return constructor-impl((byte)(arg0 + 1));
   }

   @InlineOnly
   private static final byte dec_w2LRezQ/* $FF was: dec-w2LRezQ*/(byte arg0) {
      return constructor-impl((byte)(arg0 + -1));
   }

   @InlineOnly
   private static final UIntRange rangeTo_7apg3OU/* $FF was: rangeTo-7apg3OU*/(byte arg0, byte other) {
      return new UIntRange(UInt.constructor-impl(arg0 & 255), UInt.constructor-impl(other & 255), (DefaultConstructorMarker)null);
   }

   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @InlineOnly
   private static final UIntRange rangeUntil_7apg3OU/* $FF was: rangeUntil-7apg3OU*/(byte arg0, byte other) {
      return URangesKt.until-J1ME1BU(UInt.constructor-impl(arg0 & 255), UInt.constructor-impl(other & 255));
   }

   @InlineOnly
   private static final byte and_7apg3OU/* $FF was: and-7apg3OU*/(byte arg0, byte other) {
      return constructor-impl((byte)(arg0 & other));
   }

   @InlineOnly
   private static final byte or_7apg3OU/* $FF was: or-7apg3OU*/(byte arg0, byte other) {
      return constructor-impl((byte)(arg0 | other));
   }

   @InlineOnly
   private static final byte xor_7apg3OU/* $FF was: xor-7apg3OU*/(byte arg0, byte other) {
      return constructor-impl((byte)(arg0 ^ other));
   }

   @InlineOnly
   private static final byte inv_w2LRezQ/* $FF was: inv-w2LRezQ*/(byte arg0) {
      return constructor-impl((byte)(~arg0));
   }

   @InlineOnly
   private static final byte toByte_impl/* $FF was: toByte-impl*/(byte arg0) {
      return arg0;
   }

   @InlineOnly
   private static final short toShort_impl/* $FF was: toShort-impl*/(byte arg0) {
      return (short)((short)arg0 & 255);
   }

   @InlineOnly
   private static final int toInt_impl/* $FF was: toInt-impl*/(byte arg0) {
      return arg0 & 255;
   }

   @InlineOnly
   private static final long toLong_impl/* $FF was: toLong-impl*/(byte arg0) {
      return (long)arg0 & 255L;
   }

   @InlineOnly
   private static final byte toUByte_w2LRezQ/* $FF was: toUByte-w2LRezQ*/(byte arg0) {
      return arg0;
   }

   @InlineOnly
   private static final short toUShort_Mh2AYeg/* $FF was: toUShort-Mh2AYeg*/(byte arg0) {
      return UShort.constructor-impl((short)((short)arg0 & 255));
   }

   @InlineOnly
   private static final int toUInt_pVg5ArA/* $FF was: toUInt-pVg5ArA*/(byte arg0) {
      return UInt.constructor-impl(arg0 & 255);
   }

   @InlineOnly
   private static final long toULong_s_VKNKU/* $FF was: toULong-s-VKNKU*/(byte arg0) {
      return ULong.constructor-impl((long)arg0 & 255L);
   }

   @InlineOnly
   private static final float toFloat_impl/* $FF was: toFloat-impl*/(byte arg0) {
      return (float)UnsignedKt.uintToDouble(arg0 & 255);
   }

   @InlineOnly
   private static final double toDouble_impl/* $FF was: toDouble-impl*/(byte arg0) {
      return UnsignedKt.uintToDouble(arg0 & 255);
   }

   @NotNull
   public static String toString_impl/* $FF was: toString-impl*/(byte arg0) {
      return String.valueOf(arg0 & 255);
   }

   @NotNull
   public String toString() {
      return toString-impl(this.data);
   }

   public static int hashCode_impl/* $FF was: hashCode-impl*/(byte arg0) {
      return Byte.hashCode(arg0);
   }

   public int hashCode() {
      return hashCode-impl(this.data);
   }

   public static boolean equals_impl/* $FF was: equals-impl*/(byte arg0, Object other) {
      if (!(other instanceof UByte)) {
         return false;
      } else {
         byte var2 = ((UByte)other).unbox-impl();
         return arg0 == var2;
      }
   }

   public boolean equals(Object other) {
      return equals-impl(this.data, other);
   }

   // $FF: synthetic method
   @IntrinsicConstEvaluation
   @PublishedApi
   private UByte(byte data) {
      this.data = data;
   }

   @IntrinsicConstEvaluation
   @PublishedApi
   public static byte constructor_impl/* $FF was: constructor-impl*/(byte data) {
      return data;
   }

   // $FF: synthetic method
   public static final UByte box_impl/* $FF was: box-impl*/(byte v) {
      return new UByte(v);
   }

   // $FF: synthetic method
   public final byte unbox_impl/* $FF was: unbox-impl*/() {
      return this.data;
   }

   public static final boolean equals_impl0/* $FF was: equals-impl0*/(byte p1, byte p2) {
      return p1 == p2;
   }

   public static final class Companion {
      private Companion() {
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
