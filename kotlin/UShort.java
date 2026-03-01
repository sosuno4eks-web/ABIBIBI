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
public final class UShort implements Comparable<UShort> {
   @NotNull
   public static final UShort.Companion Companion = new UShort.Companion((DefaultConstructorMarker)null);
   private final short data;
   public static final short MIN_VALUE = 0;
   public static final short MAX_VALUE = -1;
   public static final int SIZE_BYTES = 2;
   public static final int SIZE_BITS = 16;

   /** @deprecated */
   // $FF: synthetic method
   @PublishedApi
   public static void getData$annotations() {
   }

   @InlineOnly
   private static final int compareTo_7apg3OU/* $FF was: compareTo-7apg3OU*/(short arg0, byte other) {
      return Intrinsics.compare(arg0 & '\uffff', other & 255);
   }

   @InlineOnly
   private static int compareTo_xj2QHRw/* $FF was: compareTo-xj2QHRw*/(short arg0, short other) {
      return Intrinsics.compare(arg0 & '\uffff', other & '\uffff');
   }

   @InlineOnly
   private int compareTo_xj2QHRw/* $FF was: compareTo-xj2QHRw*/(short other) {
      return Intrinsics.compare(this.unbox-impl() & '\uffff', other & '\uffff');
   }

   @InlineOnly
   private static final int compareTo_WZ4Q5Ns/* $FF was: compareTo-WZ4Q5Ns*/(short arg0, int other) {
      return Integer.compareUnsigned(UInt.constructor-impl(arg0 & '\uffff'), other);
   }

   @InlineOnly
   private static final int compareTo_VKZWuLQ/* $FF was: compareTo-VKZWuLQ*/(short arg0, long other) {
      return Long.compareUnsigned(ULong.constructor-impl((long)arg0 & 65535L), other);
   }

   @InlineOnly
   private static final int plus_7apg3OU/* $FF was: plus-7apg3OU*/(short arg0, byte other) {
      return UInt.constructor-impl(UInt.constructor-impl(arg0 & '\uffff') + UInt.constructor-impl(other & 255));
   }

   @InlineOnly
   private static final int plus_xj2QHRw/* $FF was: plus-xj2QHRw*/(short arg0, short other) {
      return UInt.constructor-impl(UInt.constructor-impl(arg0 & '\uffff') + UInt.constructor-impl(other & '\uffff'));
   }

   @InlineOnly
   private static final int plus_WZ4Q5Ns/* $FF was: plus-WZ4Q5Ns*/(short arg0, int other) {
      return UInt.constructor-impl(UInt.constructor-impl(arg0 & '\uffff') + other);
   }

   @InlineOnly
   private static final long plus_VKZWuLQ/* $FF was: plus-VKZWuLQ*/(short arg0, long other) {
      return ULong.constructor-impl(ULong.constructor-impl((long)arg0 & 65535L) + other);
   }

   @InlineOnly
   private static final int minus_7apg3OU/* $FF was: minus-7apg3OU*/(short arg0, byte other) {
      return UInt.constructor-impl(UInt.constructor-impl(arg0 & '\uffff') - UInt.constructor-impl(other & 255));
   }

   @InlineOnly
   private static final int minus_xj2QHRw/* $FF was: minus-xj2QHRw*/(short arg0, short other) {
      return UInt.constructor-impl(UInt.constructor-impl(arg0 & '\uffff') - UInt.constructor-impl(other & '\uffff'));
   }

   @InlineOnly
   private static final int minus_WZ4Q5Ns/* $FF was: minus-WZ4Q5Ns*/(short arg0, int other) {
      return UInt.constructor-impl(UInt.constructor-impl(arg0 & '\uffff') - other);
   }

   @InlineOnly
   private static final long minus_VKZWuLQ/* $FF was: minus-VKZWuLQ*/(short arg0, long other) {
      return ULong.constructor-impl(ULong.constructor-impl((long)arg0 & 65535L) - other);
   }

   @InlineOnly
   private static final int times_7apg3OU/* $FF was: times-7apg3OU*/(short arg0, byte other) {
      return UInt.constructor-impl(UInt.constructor-impl(arg0 & '\uffff') * UInt.constructor-impl(other & 255));
   }

   @InlineOnly
   private static final int times_xj2QHRw/* $FF was: times-xj2QHRw*/(short arg0, short other) {
      return UInt.constructor-impl(UInt.constructor-impl(arg0 & '\uffff') * UInt.constructor-impl(other & '\uffff'));
   }

   @InlineOnly
   private static final int times_WZ4Q5Ns/* $FF was: times-WZ4Q5Ns*/(short arg0, int other) {
      return UInt.constructor-impl(UInt.constructor-impl(arg0 & '\uffff') * other);
   }

   @InlineOnly
   private static final long times_VKZWuLQ/* $FF was: times-VKZWuLQ*/(short arg0, long other) {
      return ULong.constructor-impl(ULong.constructor-impl((long)arg0 & 65535L) * other);
   }

   @InlineOnly
   private static final int div_7apg3OU/* $FF was: div-7apg3OU*/(short arg0, byte other) {
      return Integer.divideUnsigned(UInt.constructor-impl(arg0 & '\uffff'), UInt.constructor-impl(other & 255));
   }

   @InlineOnly
   private static final int div_xj2QHRw/* $FF was: div-xj2QHRw*/(short arg0, short other) {
      return Integer.divideUnsigned(UInt.constructor-impl(arg0 & '\uffff'), UInt.constructor-impl(other & '\uffff'));
   }

   @InlineOnly
   private static final int div_WZ4Q5Ns/* $FF was: div-WZ4Q5Ns*/(short arg0, int other) {
      return Integer.divideUnsigned(UInt.constructor-impl(arg0 & '\uffff'), other);
   }

   @InlineOnly
   private static final long div_VKZWuLQ/* $FF was: div-VKZWuLQ*/(short arg0, long other) {
      return Long.divideUnsigned(ULong.constructor-impl((long)arg0 & 65535L), other);
   }

   @InlineOnly
   private static final int rem_7apg3OU/* $FF was: rem-7apg3OU*/(short arg0, byte other) {
      return Integer.remainderUnsigned(UInt.constructor-impl(arg0 & '\uffff'), UInt.constructor-impl(other & 255));
   }

   @InlineOnly
   private static final int rem_xj2QHRw/* $FF was: rem-xj2QHRw*/(short arg0, short other) {
      return Integer.remainderUnsigned(UInt.constructor-impl(arg0 & '\uffff'), UInt.constructor-impl(other & '\uffff'));
   }

   @InlineOnly
   private static final int rem_WZ4Q5Ns/* $FF was: rem-WZ4Q5Ns*/(short arg0, int other) {
      return Integer.remainderUnsigned(UInt.constructor-impl(arg0 & '\uffff'), other);
   }

   @InlineOnly
   private static final long rem_VKZWuLQ/* $FF was: rem-VKZWuLQ*/(short arg0, long other) {
      return Long.remainderUnsigned(ULong.constructor-impl((long)arg0 & 65535L), other);
   }

   @InlineOnly
   private static final int floorDiv_7apg3OU/* $FF was: floorDiv-7apg3OU*/(short arg0, byte other) {
      return Integer.divideUnsigned(UInt.constructor-impl(arg0 & '\uffff'), UInt.constructor-impl(other & 255));
   }

   @InlineOnly
   private static final int floorDiv_xj2QHRw/* $FF was: floorDiv-xj2QHRw*/(short arg0, short other) {
      return Integer.divideUnsigned(UInt.constructor-impl(arg0 & '\uffff'), UInt.constructor-impl(other & '\uffff'));
   }

   @InlineOnly
   private static final int floorDiv_WZ4Q5Ns/* $FF was: floorDiv-WZ4Q5Ns*/(short arg0, int other) {
      return Integer.divideUnsigned(UInt.constructor-impl(arg0 & '\uffff'), other);
   }

   @InlineOnly
   private static final long floorDiv_VKZWuLQ/* $FF was: floorDiv-VKZWuLQ*/(short arg0, long other) {
      return Long.divideUnsigned(ULong.constructor-impl((long)arg0 & 65535L), other);
   }

   @InlineOnly
   private static final byte mod_7apg3OU/* $FF was: mod-7apg3OU*/(short arg0, byte other) {
      return UByte.constructor-impl((byte)Integer.remainderUnsigned(UInt.constructor-impl(arg0 & '\uffff'), UInt.constructor-impl(other & 255)));
   }

   @InlineOnly
   private static final short mod_xj2QHRw/* $FF was: mod-xj2QHRw*/(short arg0, short other) {
      return constructor-impl((short)Integer.remainderUnsigned(UInt.constructor-impl(arg0 & '\uffff'), UInt.constructor-impl(other & '\uffff')));
   }

   @InlineOnly
   private static final int mod_WZ4Q5Ns/* $FF was: mod-WZ4Q5Ns*/(short arg0, int other) {
      return Integer.remainderUnsigned(UInt.constructor-impl(arg0 & '\uffff'), other);
   }

   @InlineOnly
   private static final long mod_VKZWuLQ/* $FF was: mod-VKZWuLQ*/(short arg0, long other) {
      return Long.remainderUnsigned(ULong.constructor-impl((long)arg0 & 65535L), other);
   }

   @InlineOnly
   private static final short inc_Mh2AYeg/* $FF was: inc-Mh2AYeg*/(short arg0) {
      return constructor-impl((short)(arg0 + 1));
   }

   @InlineOnly
   private static final short dec_Mh2AYeg/* $FF was: dec-Mh2AYeg*/(short arg0) {
      return constructor-impl((short)(arg0 + -1));
   }

   @InlineOnly
   private static final UIntRange rangeTo_xj2QHRw/* $FF was: rangeTo-xj2QHRw*/(short arg0, short other) {
      return new UIntRange(UInt.constructor-impl(arg0 & '\uffff'), UInt.constructor-impl(other & '\uffff'), (DefaultConstructorMarker)null);
   }

   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @InlineOnly
   private static final UIntRange rangeUntil_xj2QHRw/* $FF was: rangeUntil-xj2QHRw*/(short arg0, short other) {
      return URangesKt.until-J1ME1BU(UInt.constructor-impl(arg0 & '\uffff'), UInt.constructor-impl(other & '\uffff'));
   }

   @InlineOnly
   private static final short and_xj2QHRw/* $FF was: and-xj2QHRw*/(short arg0, short other) {
      return constructor-impl((short)(arg0 & other));
   }

   @InlineOnly
   private static final short or_xj2QHRw/* $FF was: or-xj2QHRw*/(short arg0, short other) {
      return constructor-impl((short)(arg0 | other));
   }

   @InlineOnly
   private static final short xor_xj2QHRw/* $FF was: xor-xj2QHRw*/(short arg0, short other) {
      return constructor-impl((short)(arg0 ^ other));
   }

   @InlineOnly
   private static final short inv_Mh2AYeg/* $FF was: inv-Mh2AYeg*/(short arg0) {
      return constructor-impl((short)(~arg0));
   }

   @InlineOnly
   private static final byte toByte_impl/* $FF was: toByte-impl*/(short arg0) {
      return (byte)arg0;
   }

   @InlineOnly
   private static final short toShort_impl/* $FF was: toShort-impl*/(short arg0) {
      return arg0;
   }

   @InlineOnly
   private static final int toInt_impl/* $FF was: toInt-impl*/(short arg0) {
      return arg0 & '\uffff';
   }

   @InlineOnly
   private static final long toLong_impl/* $FF was: toLong-impl*/(short arg0) {
      return (long)arg0 & 65535L;
   }

   @InlineOnly
   private static final byte toUByte_w2LRezQ/* $FF was: toUByte-w2LRezQ*/(short arg0) {
      return UByte.constructor-impl((byte)arg0);
   }

   @InlineOnly
   private static final short toUShort_Mh2AYeg/* $FF was: toUShort-Mh2AYeg*/(short arg0) {
      return arg0;
   }

   @InlineOnly
   private static final int toUInt_pVg5ArA/* $FF was: toUInt-pVg5ArA*/(short arg0) {
      return UInt.constructor-impl(arg0 & '\uffff');
   }

   @InlineOnly
   private static final long toULong_s_VKNKU/* $FF was: toULong-s-VKNKU*/(short arg0) {
      return ULong.constructor-impl((long)arg0 & 65535L);
   }

   @InlineOnly
   private static final float toFloat_impl/* $FF was: toFloat-impl*/(short arg0) {
      return (float)UnsignedKt.uintToDouble(arg0 & '\uffff');
   }

   @InlineOnly
   private static final double toDouble_impl/* $FF was: toDouble-impl*/(short arg0) {
      return UnsignedKt.uintToDouble(arg0 & '\uffff');
   }

   @NotNull
   public static String toString_impl/* $FF was: toString-impl*/(short arg0) {
      return String.valueOf(arg0 & '\uffff');
   }

   @NotNull
   public String toString() {
      return toString-impl(this.data);
   }

   public static int hashCode_impl/* $FF was: hashCode-impl*/(short arg0) {
      return Short.hashCode(arg0);
   }

   public int hashCode() {
      return hashCode-impl(this.data);
   }

   public static boolean equals_impl/* $FF was: equals-impl*/(short arg0, Object other) {
      if (!(other instanceof UShort)) {
         return false;
      } else {
         short var2 = ((UShort)other).unbox-impl();
         return arg0 == var2;
      }
   }

   public boolean equals(Object other) {
      return equals-impl(this.data, other);
   }

   // $FF: synthetic method
   @IntrinsicConstEvaluation
   @PublishedApi
   private UShort(short data) {
      this.data = data;
   }

   @IntrinsicConstEvaluation
   @PublishedApi
   public static short constructor_impl/* $FF was: constructor-impl*/(short data) {
      return data;
   }

   // $FF: synthetic method
   public static final UShort box_impl/* $FF was: box-impl*/(short v) {
      return new UShort(v);
   }

   // $FF: synthetic method
   public final short unbox_impl/* $FF was: unbox-impl*/() {
      return this.data;
   }

   public static final boolean equals_impl0/* $FF was: equals-impl0*/(short p1, short p2) {
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
