package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

class PreconditionsKt__AssertionsJVMKt {
   @InlineOnly
   private static final void assert(boolean value) {
      if (_Assertions.ENABLED && !value) {
         int var1 = false;
         String var2 = "Assertion failed";
         throw new AssertionError(var2);
      }
   }

   @InlineOnly
   private static final void assert(boolean value, Function0<? extends Object> lazyMessage) {
      Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
      if (_Assertions.ENABLED && !value) {
         Object message = lazyMessage.invoke();
         throw new AssertionError(message);
      }
   }

   public PreconditionsKt__AssertionsJVMKt() {
   }
}
