package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class UShortArrayKt {
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short[] UShortArray(int size, Function1<? super Integer, UShort> init) {
      Intrinsics.checkNotNullParameter(init, "init");
      int var2 = 0;

      short[] var3;
      for(var3 = new short[size]; var2 < size; ++var2) {
         var3[var2] = ((UShort)init.invoke(var2)).unbox-impl();
      }

      return UShortArray.constructor-impl(var3);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short[] ushortArrayOf_rL5Bavg/* $FF was: ushortArrayOf-rL5Bavg*/(short... elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      return elements;
   }
}
