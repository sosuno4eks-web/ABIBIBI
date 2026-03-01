package kotlin.random;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.ULongRange;
import org.jetbrains.annotations.NotNull;

public final class URandomKt {
   @SinceKotlin(
      version = "1.5"
   )
   public static final int nextUInt(@NotNull Random $this$nextUInt) {
      Intrinsics.checkNotNullParameter($this$nextUInt, "<this>");
      return UInt.constructor-impl($this$nextUInt.nextInt());
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final int nextUInt_qCasIEU/* $FF was: nextUInt-qCasIEU*/(@NotNull Random $this$nextUInt_u2dqCasIEU, int until) {
      Intrinsics.checkNotNullParameter($this$nextUInt_u2dqCasIEU, "$this$nextUInt");
      return nextUInt-a8DCA5k($this$nextUInt_u2dqCasIEU, 0, until);
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final int nextUInt_a8DCA5k/* $FF was: nextUInt-a8DCA5k*/(@NotNull Random $this$nextUInt_u2da8DCA5k, int from, int until) {
      Intrinsics.checkNotNullParameter($this$nextUInt_u2da8DCA5k, "$this$nextUInt");
      checkUIntRangeBounds-J1ME1BU(from, until);
      int signedFrom = from ^ Integer.MIN_VALUE;
      int signedUntil = until ^ Integer.MIN_VALUE;
      int signedResult = $this$nextUInt_u2da8DCA5k.nextInt(signedFrom, signedUntil) ^ Integer.MIN_VALUE;
      return UInt.constructor-impl(signedResult);
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final int nextUInt(@NotNull Random $this$nextUInt, @NotNull UIntRange range) {
      Intrinsics.checkNotNullParameter($this$nextUInt, "<this>");
      Intrinsics.checkNotNullParameter(range, "range");
      if (range.isEmpty()) {
         throw new IllegalArgumentException("Cannot get random in empty range: " + range);
      } else {
         return Integer.compareUnsigned(range.getLast-pVg5ArA(), -1) < 0 ? nextUInt-a8DCA5k($this$nextUInt, range.getFirst-pVg5ArA(), UInt.constructor-impl(range.getLast-pVg5ArA() + 1)) : (Integer.compareUnsigned(range.getFirst-pVg5ArA(), 0) > 0 ? UInt.constructor-impl(nextUInt-a8DCA5k($this$nextUInt, UInt.constructor-impl(range.getFirst-pVg5ArA() - 1), range.getLast-pVg5ArA()) + 1) : nextUInt($this$nextUInt));
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final long nextULong(@NotNull Random $this$nextULong) {
      Intrinsics.checkNotNullParameter($this$nextULong, "<this>");
      return ULong.constructor-impl($this$nextULong.nextLong());
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final long nextULong_V1Xi4fY/* $FF was: nextULong-V1Xi4fY*/(@NotNull Random $this$nextULong_u2dV1Xi4fY, long until) {
      Intrinsics.checkNotNullParameter($this$nextULong_u2dV1Xi4fY, "$this$nextULong");
      return nextULong-jmpaW-c($this$nextULong_u2dV1Xi4fY, 0L, until);
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final long nextULong_jmpaW_c/* $FF was: nextULong-jmpaW-c*/(@NotNull Random $this$nextULong_u2djmpaW_u2dc, long from, long until) {
      Intrinsics.checkNotNullParameter($this$nextULong_u2djmpaW_u2dc, "$this$nextULong");
      checkULongRangeBounds-eb3DHEI(from, until);
      long signedFrom = from ^ Long.MIN_VALUE;
      long signedUntil = until ^ Long.MIN_VALUE;
      long signedResult = $this$nextULong_u2djmpaW_u2dc.nextLong(signedFrom, signedUntil) ^ Long.MIN_VALUE;
      return ULong.constructor-impl(signedResult);
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final long nextULong(@NotNull Random $this$nextULong, @NotNull ULongRange range) {
      Intrinsics.checkNotNullParameter($this$nextULong, "<this>");
      Intrinsics.checkNotNullParameter(range, "range");
      if (range.isEmpty()) {
         throw new IllegalArgumentException("Cannot get random in empty range: " + range);
      } else {
         long var10000;
         long var2;
         byte var4;
         if (Long.compareUnsigned(range.getLast-s-VKNKU(), -1L) < 0) {
            long var10001 = range.getFirst-s-VKNKU();
            var2 = range.getLast-s-VKNKU();
            var4 = 1;
            var10000 = nextULong-jmpaW-c($this$nextULong, var10001, ULong.constructor-impl(var2 + ULong.constructor-impl((long)var4 & 4294967295L)));
         } else if (Long.compareUnsigned(range.getFirst-s-VKNKU(), 0L) > 0) {
            var2 = range.getFirst-s-VKNKU();
            var4 = 1;
            var2 = nextULong-jmpaW-c($this$nextULong, ULong.constructor-impl(var2 - ULong.constructor-impl((long)var4 & 4294967295L)), range.getLast-s-VKNKU());
            var4 = 1;
            var10000 = ULong.constructor-impl(var2 + ULong.constructor-impl((long)var4 & 4294967295L));
         } else {
            var10000 = nextULong($this$nextULong);
         }

         return var10000;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final byte[] nextUBytes_EVgfTAA/* $FF was: nextUBytes-EVgfTAA*/(@NotNull Random $this$nextUBytes_u2dEVgfTAA, @NotNull byte[] array) {
      Intrinsics.checkNotNullParameter($this$nextUBytes_u2dEVgfTAA, "$this$nextUBytes");
      Intrinsics.checkNotNullParameter(array, "array");
      $this$nextUBytes_u2dEVgfTAA.nextBytes(array);
      return array;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final byte[] nextUBytes(@NotNull Random $this$nextUBytes, int size) {
      Intrinsics.checkNotNullParameter($this$nextUBytes, "<this>");
      return UByteArray.constructor-impl($this$nextUBytes.nextBytes(size));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final byte[] nextUBytes_Wvrt4B4/* $FF was: nextUBytes-Wvrt4B4*/(@NotNull Random $this$nextUBytes_u2dWvrt4B4, @NotNull byte[] array, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$nextUBytes_u2dWvrt4B4, "$this$nextUBytes");
      Intrinsics.checkNotNullParameter(array, "array");
      $this$nextUBytes_u2dWvrt4B4.nextBytes(array, fromIndex, toIndex);
      return array;
   }

   // $FF: synthetic method
   public static byte[] nextUBytes_Wvrt4B4$default/* $FF was: nextUBytes-Wvrt4B4$default*/(Random var0, byte[] var1, int var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = UByteArray.getSize-impl(var1);
      }

      return nextUBytes-Wvrt4B4(var0, var1, var2, var3);
   }

   public static final void checkUIntRangeBounds_J1ME1BU/* $FF was: checkUIntRangeBounds-J1ME1BU*/(int from, int until) {
      if (Integer.compareUnsigned(until, from) <= 0) {
         int var2 = false;
         String var3 = RandomKt.boundsErrorMessage(UInt.box-impl(from), UInt.box-impl(until));
         throw new IllegalArgumentException(var3.toString());
      }
   }

   public static final void checkULongRangeBounds_eb3DHEI/* $FF was: checkULongRangeBounds-eb3DHEI*/(long from, long until) {
      if (Long.compareUnsigned(until, from) <= 0) {
         int var4 = false;
         String var5 = RandomKt.boundsErrorMessage(ULong.box-impl(from), ULong.box-impl(until));
         throw new IllegalArgumentException(var5.toString());
      }
   }
}
