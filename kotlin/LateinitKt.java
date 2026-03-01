package kotlin;

import kotlin.internal.AccessibleLateinitPropertyLiteral;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty0;

@JvmName(
   name = "LateinitKt"
)
public final class LateinitKt {
   private static final boolean isInitialized(@AccessibleLateinitPropertyLiteral KProperty0<?> $this$isInitialized) {
      Intrinsics.checkNotNullParameter($this$isInitialized, "<this>");
      throw new NotImplementedError("Implementation is intrinsic");
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   public static void isInitialized$annotations(KProperty0 <this>) {
   }
}
