package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class UByteArrayKt {
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte[] UByteArray(int size, Function1<? super Integer, UByte> init) {
      Intrinsics.checkNotNullParameter(init, "init");
      int var2 = 0;

      byte[] var3;
      for(var3 = new byte[size]; var2 < size; ++var2) {
         var3[var2] = ((UByte)init.invoke(var2)).unbox-impl();
      }

      return UByteArray.constructor-impl(var3);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte[] ubyteArrayOf_GBYM_sE/* $FF was: ubyteArrayOf-GBYM_sE*/(byte... elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      return elements;
   }
}
