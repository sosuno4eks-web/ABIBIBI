package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class UIntArrayKt {
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int[] UIntArray(int size, Function1<? super Integer, UInt> init) {
      Intrinsics.checkNotNullParameter(init, "init");
      int var2 = 0;

      int[] var3;
      for(var3 = new int[size]; var2 < size; ++var2) {
         var3[var2] = ((UInt)init.invoke(var2)).unbox-impl();
      }

      return UIntArray.constructor-impl(var3);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int[] uintArrayOf__ajY_9A/* $FF was: uintArrayOf--ajY-9A*/(int... elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      return elements;
   }
}
