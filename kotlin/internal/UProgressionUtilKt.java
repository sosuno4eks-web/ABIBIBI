package kotlin.internal;

import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;

public final class UProgressionUtilKt {
   private static final int differenceModulo_WZ9TVnA/* $FF was: differenceModulo-WZ9TVnA*/(int a, int b, int c) {
      int ac = Integer.remainderUnsigned(a, c);
      int bc = Integer.remainderUnsigned(b, c);
      return Integer.compareUnsigned(ac, bc) >= 0 ? UInt.constructor-impl(ac - bc) : UInt.constructor-impl(UInt.constructor-impl(ac - bc) + c);
   }

   private static final long differenceModulo_sambcqE/* $FF was: differenceModulo-sambcqE*/(long a, long b, long c) {
      long ac = Long.remainderUnsigned(a, c);
      long bc = Long.remainderUnsigned(b, c);
      return Long.compareUnsigned(ac, bc) >= 0 ? ULong.constructor-impl(ac - bc) : ULong.constructor-impl(ULong.constructor-impl(ac - bc) + c);
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   public static final int getProgressionLastElement_Nkh28Cs/* $FF was: getProgressionLastElement-Nkh28Cs*/(int start, int end, int step) {
      int var10000;
      if (step > 0) {
         var10000 = Integer.compareUnsigned(start, end) >= 0 ? end : UInt.constructor-impl(end - differenceModulo-WZ9TVnA(end, start, UInt.constructor-impl(step)));
      } else {
         if (step >= 0) {
            throw new IllegalArgumentException("Step is zero.");
         }

         var10000 = Integer.compareUnsigned(start, end) <= 0 ? end : UInt.constructor-impl(end + differenceModulo-WZ9TVnA(start, end, UInt.constructor-impl(-step)));
      }

      return var10000;
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   public static final long getProgressionLastElement_7ftBX0g/* $FF was: getProgressionLastElement-7ftBX0g*/(long start, long end, long step) {
      long var10000;
      if (step > 0L) {
         var10000 = Long.compareUnsigned(start, end) >= 0 ? end : ULong.constructor-impl(end - differenceModulo-sambcqE(end, start, ULong.constructor-impl(step)));
      } else {
         if (step >= 0L) {
            throw new IllegalArgumentException("Step is zero.");
         }

         var10000 = Long.compareUnsigned(start, end) <= 0 ? end : ULong.constructor-impl(end + differenceModulo-sambcqE(start, end, ULong.constructor-impl(-step)));
      }

      return var10000;
   }
}
