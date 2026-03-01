package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class ULongArrayKt {
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long[] ULongArray(int size, Function1<? super Integer, ULong> init) {
      Intrinsics.checkNotNullParameter(init, "init");
      int var2 = 0;

      long[] var3;
      for(var3 = new long[size]; var2 < size; ++var2) {
         var3[var2] = ((ULong)init.invoke(var2)).unbox-impl();
      }

      return ULongArray.constructor-impl(var3);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long[] ulongArrayOf_QwZRm1k/* $FF was: ulongArrayOf-QwZRm1k*/(long... elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      return elements;
   }
}
