package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ULongRange;
import kotlin.ranges.URangesKt;
import org.jetbrains.annotations.NotNull;

@JvmInline
@SinceKotlin(
   version = "1.5"
)
public final class ULong implements Comparable<ULong> {
   @NotNull
   public static final ULong.Companion Companion = new ULong.Companion((DefaultConstructorMarker)null);
   private final long data;
   public static final long MIN_VALUE = 0L;
   public static final long MAX_VALUE = -1L;
   public static final int SIZE_BYTES = 8;
   public static final int SIZE_BITS = 64;

   /** @deprecated */
   // $FF: synthetic method
   @PublishedApi
   public static void getData$annotations() {
   }

   @InlineOnly
   private static final int compareTo_7apg3OU/* $FF was: compareTo-7apg3OU*/(long arg0, byte other) {
      return Long.compareUnsigned(arg0, constructor-impl((long)other & 255L));
   }

   @InlineOnly
   private static final int compareTo_xj2QHRw/* $FF was: compareTo-xj2QHRw*/(long arg0, short other) {
      return Long.compareUnsigned(arg0, constructor-impl((long)other & 65535L));
   }

   @InlineOnly
   private static final int compareTo_WZ4Q5Ns/* $FF was: compareTo-WZ4Q5Ns*/(long arg0, int other) {
      return Long.compareUnsigned(arg0, constructor-impl((long)other & 4294967295L));
   }

   @InlineOnly
   private static int compareTo_VKZWuLQ/* $FF was: compareTo-VKZWuLQ*/(long arg0, long other) {
      return UnsignedKt.ulongCompare(arg0, other);
   }

   @InlineOnly
   private int compareTo_VKZWuLQ/* $FF was: compareTo-VKZWuLQ*/(long other) {
      return UnsignedKt.ulongCompare(this.unbox-impl(), other);
   }

   @InlineOnly
   private static final long plus_7apg3OU/* $FF was: plus-7apg3OU*/(long arg0, byte other) {
      return constructor-impl(arg0 + constructor-impl((long)other & 255L));
   }

   @InlineOnly
   private static final long plus_xj2QHRw/* $FF was: plus-xj2QHRw*/(long arg0, short other) {
      return constructor-impl(arg0 + constructor-impl((long)other & 65535L));
   }

   @InlineOnly
   private static final long plus_WZ4Q5Ns/* $FF was: plus-WZ4Q5Ns*/(long arg0, int other) {
      return constructor-impl(arg0 + constructor-impl((long)other & 4294967295L));
   }

   @InlineOnly
   private static final long plus_VKZWuLQ/* $FF was: plus-VKZWuLQ*/(long arg0, long other) {
      return constructor-impl(arg0 + other);
   }

   @InlineOnly
   private static final long minus_7apg3OU/* $FF was: minus-7apg3OU*/(long arg0, byte other) {
      return constructor-impl(arg0 - constructor-impl((long)other & 255L));
   }

   @InlineOnly
   private static final long minus_xj2QHRw/* $FF was: minus-xj2QHRw*/(long arg0, short other) {
      return constructor-impl(arg0 - constructor-impl((long)other & 65535L));
   }

   @InlineOnly
   private static final long minus_WZ4Q5Ns/* $FF was: minus-WZ4Q5Ns*/(long arg0, int other) {
      return constructor-impl(arg0 - constructor-impl((long)other & 4294967295L));
   }

   @InlineOnly
   private static final long minus_VKZWuLQ/* $FF was: minus-VKZWuLQ*/(long arg0, long other) {
      return constructor-impl(arg0 - other);
   }

   @InlineOnly
   private static final long times_7apg3OU/* $FF was: times-7apg3OU*/(long arg0, byte other) {
      return constructor-impl(arg0 * constructor-impl((long)other & 255L));
   }

   @InlineOnly
   private static final long times_xj2QHRw/* $FF was: times-xj2QHRw*/(long arg0, short other) {
      return constructor-impl(arg0 * constructor-impl((long)other & 65535L));
   }

   @InlineOnly
   private static final long times_WZ4Q5Ns/* $FF was: times-WZ4Q5Ns*/(long arg0, int other) {
      return constructor-impl(arg0 * constructor-impl((long)other & 4294967295L));
   }

   @InlineOnly
   private static final long times_VKZWuLQ/* $FF was: times-VKZWuLQ*/(long arg0, long other) {
      return constructor-impl(arg0 * other);
   }

   @InlineOnly
   private static final long div_7apg3OU/* $FF was: div-7apg3OU*/(long arg0, byte other) {
      return Long.divideUnsigned(arg0, constructor-impl((long)other & 255L));
   }

   @InlineOnly
   private static final long div_xj2QHRw/* $FF was: div-xj2QHRw*/(long arg0, short other) {
      return Long.divideUnsigned(arg0, constructor-impl((long)other & 65535L));
   }

   @InlineOnly
   private static final long div_WZ4Q5Ns/* $FF was: div-WZ4Q5Ns*/(long arg0, int other) {
      return Long.divideUnsigned(arg0, constructor-impl((long)other & 4294967295L));
   }

   @InlineOnly
   private static final long div_VKZWuLQ/* $FF was: div-VKZWuLQ*/(long arg0, long other) {
      return UnsignedKt.ulongDivide-eb3DHEI(arg0, other);
   }

   @InlineOnly
   private static final long rem_7apg3OU/* $FF was: rem-7apg3OU*/(long arg0, byte other) {
      return Long.remainderUnsigned(arg0, constructor-impl((long)other & 255L));
   }

   @InlineOnly
   private static final long rem_xj2QHRw/* $FF was: rem-xj2QHRw*/(long arg0, short other) {
      return Long.remainderUnsigned(arg0, constructor-impl((long)other & 65535L));
   }

   @InlineOnly
   private static final long rem_WZ4Q5Ns/* $FF was: rem-WZ4Q5Ns*/(long arg0, int other) {
      return Long.remainderUnsigned(arg0, constructor-impl((long)other & 4294967295L));
   }

   @InlineOnly
   private static final long rem_VKZWuLQ/* $FF was: rem-VKZWuLQ*/(long arg0, long other) {
      return UnsignedKt.ulongRemainder-eb3DHEI(arg0, other);
   }

   @InlineOnly
   private static final long floorDiv_7apg3OU/* $FF was: floorDiv-7apg3OU*/(long arg0, byte other) {
      return Long.divideUnsigned(arg0, constructor-impl((long)other & 255L));
   }

   @InlineOnly
   private static final long floorDiv_xj2QHRw/* $FF was: floorDiv-xj2QHRw*/(long arg0, short other) {
      return Long.divideUnsigned(arg0, constructor-impl((long)other & 65535L));
   }

   @InlineOnly
   private static final long floorDiv_WZ4Q5Ns/* $FF was: floorDiv-WZ4Q5Ns*/(long arg0, int other) {
      return Long.divideUnsigned(arg0, constructor-impl((long)other & 4294967295L));
   }

   @InlineOnly
   private static final long floorDiv_VKZWuLQ/* $FF was: floorDiv-VKZWuLQ*/(long arg0, long other) {
      return Long.divideUnsigned(arg0, other);
   }

   @InlineOnly
   private static final byte mod_7apg3OU/* $FF was: mod-7apg3OU*/(long arg0, byte other) {
      return UByte.constructor-impl((byte)((int)Long.remainderUnsigned(arg0, constructor-impl((long)other & 255L))));
   }

   @InlineOnly
   private static final short mod_xj2QHRw/* $FF was: mod-xj2QHRw*/(long arg0, short other) {
      return UShort.constructor-impl((short)((int)Long.remainderUnsigned(arg0, constructor-impl((long)other & 65535L))));
   }

   @InlineOnly
   private static final int mod_WZ4Q5Ns/* $FF was: mod-WZ4Q5Ns*/(long arg0, int other) {
      return UInt.constructor-impl((int)Long.remainderUnsigned(arg0, constructor-impl((long)other & 4294967295L)));
   }

   @InlineOnly
   private static final long mod_VKZWuLQ/* $FF was: mod-VKZWuLQ*/(long arg0, long other) {
      return Long.remainderUnsigned(arg0, other);
   }

   @InlineOnly
   private static final long inc_s_VKNKU/* $FF was: inc-s-VKNKU*/(long arg0) {
      return constructor-impl(arg0 + 1L);
   }

   @InlineOnly
   private static final long dec_s_VKNKU/* $FF was: dec-s-VKNKU*/(long arg0) {
      return constructor-impl(arg0 + -1L);
   }

   @InlineOnly
   private static final ULongRange rangeTo_VKZWuLQ/* $FF was: rangeTo-VKZWuLQ*/(long arg0, long other) {
      return new ULongRange(arg0, other, (DefaultConstructorMarker)null);
   }

   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @InlineOnly
   private static final ULongRange rangeUntil_VKZWuLQ/* $FF was: rangeUntil-VKZWuLQ*/(long arg0, long other) {
      return URangesKt.until-eb3DHEI(arg0, other);
   }

   @InlineOnly
   private static final long shl_s_VKNKU/* $FF was: shl-s-VKNKU*/(long arg0, int bitCount) {
      return constructor-impl(arg0 << bitCount);
   }

   @InlineOnly
   private static final long shr_s_VKNKU/* $FF was: shr-s-VKNKU*/(long arg0, int bitCount) {
      return constructor-impl(arg0 >>> bitCount);
   }

   @InlineOnly
   private static final long and_VKZWuLQ/* $FF was: and-VKZWuLQ*/(long arg0, long other) {
      return constructor-impl(arg0 & other);
   }

   @InlineOnly
   private static final long or_VKZWuLQ/* $FF was: or-VKZWuLQ*/(long arg0, long other) {
      return constructor-impl(arg0 | other);
   }

   @InlineOnly
   private static final long xor_VKZWuLQ/* $FF was: xor-VKZWuLQ*/(long arg0, long other) {
      return constructor-impl(arg0 ^ other);
   }

   @InlineOnly
   private static final long inv_s_VKNKU/* $FF was: inv-s-VKNKU*/(long arg0) {
      return constructor-impl(~arg0);
   }

   @InlineOnly
   private static final byte toByte_impl/* $FF was: toByte-impl*/(long arg0) {
      return (byte)((int)arg0);
   }

   @InlineOnly
   private static final short toShort_impl/* $FF was: toShort-impl*/(long arg0) {
      return (short)((int)arg0);
   }

   @InlineOnly
   private static final int toInt_impl/* $FF was: toInt-impl*/(long arg0) {
      return (int)arg0;
   }

   @InlineOnly
   private static final long toLong_impl/* $FF was: toLong-impl*/(long arg0) {
      return arg0;
   }

   @InlineOnly
   private static final byte toUByte_w2LRezQ/* $FF was: toUByte-w2LRezQ*/(long arg0) {
      return UByte.constructor-impl((byte)((int)arg0));
   }

   @InlineOnly
   private static final short toUShort_Mh2AYeg/* $FF was: toUShort-Mh2AYeg*/(long arg0) {
      return UShort.constructor-impl((short)((int)arg0));
   }

   @InlineOnly
   private static final int toUInt_pVg5ArA/* $FF was: toUInt-pVg5ArA*/(long arg0) {
      return UInt.constructor-impl((int)arg0);
   }

   @InlineOnly
   private static final long toULong_s_VKNKU/* $FF was: toULong-s-VKNKU*/(long arg0) {
      return arg0;
   }

   @InlineOnly
   private static final float toFloat_impl/* $FF was: toFloat-impl*/(long arg0) {
      return (float)UnsignedKt.ulongToDouble(arg0);
   }

   @InlineOnly
   private static final double toDouble_impl/* $FF was: toDouble-impl*/(long arg0) {
      return UnsignedKt.ulongToDouble(arg0);
   }

   @NotNull
   public static String toString_impl/* $FF was: toString-impl*/(long arg0) {
      return UnsignedKt.ulongToString(arg0, 10);
   }

   @NotNull
   public String toString() {
      return toString-impl(this.data);
   }

   public static int hashCode_impl/* $FF was: hashCode-impl*/(long arg0) {
      return Long.hashCode(arg0);
   }

   public int hashCode() {
      return hashCode-impl(this.data);
   }

   public static boolean equals_impl/* $FF was: equals-impl*/(long arg0, Object other) {
      if (!(other instanceof ULong)) {
         return false;
      } else {
         long var3 = ((ULong)other).unbox-impl();
         return arg0 == var3;
      }
   }

   public boolean equals(Object other) {
      return equals-impl(this.data, other);
   }

   // $FF: synthetic method
   @IntrinsicConstEvaluation
   @PublishedApi
   private ULong(long data) {
      this.data = data;
   }

   @IntrinsicConstEvaluation
   @PublishedApi
   public static long constructor_impl/* $FF was: constructor-impl*/(long data) {
      return data;
   }

   // $FF: synthetic method
   public static final ULong box_impl/* $FF was: box-impl*/(long v) {
      return new ULong(v);
   }

   // $FF: synthetic method
   public final long unbox_impl/* $FF was: unbox-impl*/() {
      return this.data;
   }

   public static final boolean equals_impl0/* $FF was: equals-impl0*/(long p1, long p2) {
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
