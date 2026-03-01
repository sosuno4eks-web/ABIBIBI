package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;
import org.jetbrains.annotations.NotNull;

@JvmInline
@SinceKotlin(
   version = "1.5"
)
public final class UInt implements Comparable<UInt> {
   @NotNull
   public static final UInt.Companion Companion = new UInt.Companion((DefaultConstructorMarker)null);
   private final int data;
   public static final int MIN_VALUE = 0;
   public static final int MAX_VALUE = -1;
   public static final int SIZE_BYTES = 4;
   public static final int SIZE_BITS = 32;

   /** @deprecated */
   // $FF: synthetic method
   @PublishedApi
   public static void getData$annotations() {
   }

   @InlineOnly
   private static final int compareTo_7apg3OU/* $FF was: compareTo-7apg3OU*/(int arg0, byte other) {
      return Integer.compareUnsigned(arg0, constructor-impl(other & 255));
   }

   @InlineOnly
   private static final int compareTo_xj2QHRw/* $FF was: compareTo-xj2QHRw*/(int arg0, short other) {
      return Integer.compareUnsigned(arg0, constructor-impl(other & '\uffff'));
   }

   @InlineOnly
   private static int compareTo_WZ4Q5Ns/* $FF was: compareTo-WZ4Q5Ns*/(int arg0, int other) {
      return UnsignedKt.uintCompare(arg0, other);
   }

   @InlineOnly
   private int compareTo_WZ4Q5Ns/* $FF was: compareTo-WZ4Q5Ns*/(int other) {
      return UnsignedKt.uintCompare(this.unbox-impl(), other);
   }

   @InlineOnly
   private static final int compareTo_VKZWuLQ/* $FF was: compareTo-VKZWuLQ*/(int arg0, long other) {
      return Long.compareUnsigned(ULong.constructor-impl((long)arg0 & 4294967295L), other);
   }

   @InlineOnly
   private static final int plus_7apg3OU/* $FF was: plus-7apg3OU*/(int arg0, byte other) {
      return constructor-impl(arg0 + constructor-impl(other & 255));
   }

   @InlineOnly
   private static final int plus_xj2QHRw/* $FF was: plus-xj2QHRw*/(int arg0, short other) {
      return constructor-impl(arg0 + constructor-impl(other & '\uffff'));
   }

   @InlineOnly
   private static final int plus_WZ4Q5Ns/* $FF was: plus-WZ4Q5Ns*/(int arg0, int other) {
      return constructor-impl(arg0 + other);
   }

   @InlineOnly
   private static final long plus_VKZWuLQ/* $FF was: plus-VKZWuLQ*/(int arg0, long other) {
      return ULong.constructor-impl(ULong.constructor-impl((long)arg0 & 4294967295L) + other);
   }

   @InlineOnly
   private static final int minus_7apg3OU/* $FF was: minus-7apg3OU*/(int arg0, byte other) {
      return constructor-impl(arg0 - constructor-impl(other & 255));
   }

   @InlineOnly
   private static final int minus_xj2QHRw/* $FF was: minus-xj2QHRw*/(int arg0, short other) {
      return constructor-impl(arg0 - constructor-impl(other & '\uffff'));
   }

   @InlineOnly
   private static final int minus_WZ4Q5Ns/* $FF was: minus-WZ4Q5Ns*/(int arg0, int other) {
      return constructor-impl(arg0 - other);
   }

   @InlineOnly
   private static final long minus_VKZWuLQ/* $FF was: minus-VKZWuLQ*/(int arg0, long other) {
      return ULong.constructor-impl(ULong.constructor-impl((long)arg0 & 4294967295L) - other);
   }

   @InlineOnly
   private static final int times_7apg3OU/* $FF was: times-7apg3OU*/(int arg0, byte other) {
      return constructor-impl(arg0 * constructor-impl(other & 255));
   }

   @InlineOnly
   private static final int times_xj2QHRw/* $FF was: times-xj2QHRw*/(int arg0, short other) {
      return constructor-impl(arg0 * constructor-impl(other & '\uffff'));
   }

   @InlineOnly
   private static final int times_WZ4Q5Ns/* $FF was: times-WZ4Q5Ns*/(int arg0, int other) {
      return constructor-impl(arg0 * other);
   }

   @InlineOnly
   private static final long times_VKZWuLQ/* $FF was: times-VKZWuLQ*/(int arg0, long other) {
      return ULong.constructor-impl(ULong.constructor-impl((long)arg0 & 4294967295L) * other);
   }

   @InlineOnly
   private static final int div_7apg3OU/* $FF was: div-7apg3OU*/(int arg0, byte other) {
      return Integer.divideUnsigned(arg0, constructor-impl(other & 255));
   }

   @InlineOnly
   private static final int div_xj2QHRw/* $FF was: div-xj2QHRw*/(int arg0, short other) {
      return Integer.divideUnsigned(arg0, constructor-impl(other & '\uffff'));
   }

   @InlineOnly
   private static final int div_WZ4Q5Ns/* $FF was: div-WZ4Q5Ns*/(int arg0, int other) {
      return UnsignedKt.uintDivide-J1ME1BU(arg0, other);
   }

   @InlineOnly
   private static final long div_VKZWuLQ/* $FF was: div-VKZWuLQ*/(int arg0, long other) {
      return Long.divideUnsigned(ULong.constructor-impl((long)arg0 & 4294967295L), other);
   }

   @InlineOnly
   private static final int rem_7apg3OU/* $FF was: rem-7apg3OU*/(int arg0, byte other) {
      return Integer.remainderUnsigned(arg0, constructor-impl(other & 255));
   }

   @InlineOnly
   private static final int rem_xj2QHRw/* $FF was: rem-xj2QHRw*/(int arg0, short other) {
      return Integer.remainderUnsigned(arg0, constructor-impl(other & '\uffff'));
   }

   @InlineOnly
   private static final int rem_WZ4Q5Ns/* $FF was: rem-WZ4Q5Ns*/(int arg0, int other) {
      return UnsignedKt.uintRemainder-J1ME1BU(arg0, other);
   }

   @InlineOnly
   private static final long rem_VKZWuLQ/* $FF was: rem-VKZWuLQ*/(int arg0, long other) {
      return Long.remainderUnsigned(ULong.constructor-impl((long)arg0 & 4294967295L), other);
   }

   @InlineOnly
   private static final int floorDiv_7apg3OU/* $FF was: floorDiv-7apg3OU*/(int arg0, byte other) {
      return Integer.divideUnsigned(arg0, constructor-impl(other & 255));
   }

   @InlineOnly
   private static final int floorDiv_xj2QHRw/* $FF was: floorDiv-xj2QHRw*/(int arg0, short other) {
      return Integer.divideUnsigned(arg0, constructor-impl(other & '\uffff'));
   }

   @InlineOnly
   private static final int floorDiv_WZ4Q5Ns/* $FF was: floorDiv-WZ4Q5Ns*/(int arg0, int other) {
      return Integer.divideUnsigned(arg0, other);
   }

   @InlineOnly
   private static final long floorDiv_VKZWuLQ/* $FF was: floorDiv-VKZWuLQ*/(int arg0, long other) {
      return Long.divideUnsigned(ULong.constructor-impl((long)arg0 & 4294967295L), other);
   }

   @InlineOnly
   private static final byte mod_7apg3OU/* $FF was: mod-7apg3OU*/(int arg0, byte other) {
      return UByte.constructor-impl((byte)Integer.remainderUnsigned(arg0, constructor-impl(other & 255)));
   }

   @InlineOnly
   private static final short mod_xj2QHRw/* $FF was: mod-xj2QHRw*/(int arg0, short other) {
      return UShort.constructor-impl((short)Integer.remainderUnsigned(arg0, constructor-impl(other & '\uffff')));
   }

   @InlineOnly
   private static final int mod_WZ4Q5Ns/* $FF was: mod-WZ4Q5Ns*/(int arg0, int other) {
      return Integer.remainderUnsigned(arg0, other);
   }

   @InlineOnly
   private static final long mod_VKZWuLQ/* $FF was: mod-VKZWuLQ*/(int arg0, long other) {
      return Long.remainderUnsigned(ULong.constructor-impl((long)arg0 & 4294967295L), other);
   }

   @InlineOnly
   private static final int inc_pVg5ArA/* $FF was: inc-pVg5ArA*/(int arg0) {
      return constructor-impl(arg0 + 1);
   }

   @InlineOnly
   private static final int dec_pVg5ArA/* $FF was: dec-pVg5ArA*/(int arg0) {
      return constructor-impl(arg0 + -1);
   }

   @InlineOnly
   private static final UIntRange rangeTo_WZ4Q5Ns/* $FF was: rangeTo-WZ4Q5Ns*/(int arg0, int other) {
      return new UIntRange(arg0, other, (DefaultConstructorMarker)null);
   }

   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @InlineOnly
   private static final UIntRange rangeUntil_WZ4Q5Ns/* $FF was: rangeUntil-WZ4Q5Ns*/(int arg0, int other) {
      return URangesKt.until-J1ME1BU(arg0, other);
   }

   @InlineOnly
   private static final int shl_pVg5ArA/* $FF was: shl-pVg5ArA*/(int arg0, int bitCount) {
      return constructor-impl(arg0 << bitCount);
   }

   @InlineOnly
   private static final int shr_pVg5ArA/* $FF was: shr-pVg5ArA*/(int arg0, int bitCount) {
      return constructor-impl(arg0 >>> bitCount);
   }

   @InlineOnly
   private static final int and_WZ4Q5Ns/* $FF was: and-WZ4Q5Ns*/(int arg0, int other) {
      return constructor-impl(arg0 & other);
   }

   @InlineOnly
   private static final int or_WZ4Q5Ns/* $FF was: or-WZ4Q5Ns*/(int arg0, int other) {
      return constructor-impl(arg0 | other);
   }

   @InlineOnly
   private static final int xor_WZ4Q5Ns/* $FF was: xor-WZ4Q5Ns*/(int arg0, int other) {
      return constructor-impl(arg0 ^ other);
   }

   @InlineOnly
   private static final int inv_pVg5ArA/* $FF was: inv-pVg5ArA*/(int arg0) {
      return constructor-impl(~arg0);
   }

   @InlineOnly
   private static final byte toByte_impl/* $FF was: toByte-impl*/(int arg0) {
      return (byte)arg0;
   }

   @InlineOnly
   private static final short toShort_impl/* $FF was: toShort-impl*/(int arg0) {
      return (short)arg0;
   }

   @InlineOnly
   private static final int toInt_impl/* $FF was: toInt-impl*/(int arg0) {
      return arg0;
   }

   @InlineOnly
   private static final long toLong_impl/* $FF was: toLong-impl*/(int arg0) {
      return (long)arg0 & 4294967295L;
   }

   @InlineOnly
   private static final byte toUByte_w2LRezQ/* $FF was: toUByte-w2LRezQ*/(int arg0) {
      return UByte.constructor-impl((byte)arg0);
   }

   @InlineOnly
   private static final short toUShort_Mh2AYeg/* $FF was: toUShort-Mh2AYeg*/(int arg0) {
      return UShort.constructor-impl((short)arg0);
   }

   @InlineOnly
   private static final int toUInt_pVg5ArA/* $FF was: toUInt-pVg5ArA*/(int arg0) {
      return arg0;
   }

   @InlineOnly
   private static final long toULong_s_VKNKU/* $FF was: toULong-s-VKNKU*/(int arg0) {
      return ULong.constructor-impl((long)arg0 & 4294967295L);
   }

   @InlineOnly
   private static final float toFloat_impl/* $FF was: toFloat-impl*/(int arg0) {
      return (float)UnsignedKt.uintToDouble(arg0);
   }

   @InlineOnly
   private static final double toDouble_impl/* $FF was: toDouble-impl*/(int arg0) {
      return UnsignedKt.uintToDouble(arg0);
   }

   @NotNull
   public static String toString_impl/* $FF was: toString-impl*/(int arg0) {
      return String.valueOf((long)arg0 & 4294967295L);
   }

   @NotNull
   public String toString() {
      return toString-impl(this.data);
   }

   public static int hashCode_impl/* $FF was: hashCode-impl*/(int arg0) {
      return Integer.hashCode(arg0);
   }

   public int hashCode() {
      return hashCode-impl(this.data);
   }

   public static boolean equals_impl/* $FF was: equals-impl*/(int arg0, Object other) {
      if (!(other instanceof UInt)) {
         return false;
      } else {
         int var2 = ((UInt)other).unbox-impl();
         return arg0 == var2;
      }
   }

   public boolean equals(Object other) {
      return equals-impl(this.data, other);
   }

   // $FF: synthetic method
   @IntrinsicConstEvaluation
   @PublishedApi
   private UInt(int data) {
      this.data = data;
   }

   @IntrinsicConstEvaluation
   @PublishedApi
   public static int constructor_impl/* $FF was: constructor-impl*/(int data) {
      return data;
   }

   // $FF: synthetic method
   public static final UInt box_impl/* $FF was: box-impl*/(int v) {
      return new UInt(v);
   }

   // $FF: synthetic method
   public final int unbox_impl/* $FF was: unbox-impl*/() {
      return this.data;
   }

   public static final boolean equals_impl0/* $FF was: equals-impl0*/(int p1, int p2) {
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
