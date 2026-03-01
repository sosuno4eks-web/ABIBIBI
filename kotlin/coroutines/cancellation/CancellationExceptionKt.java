package kotlin.coroutines.cancellation;

import java.util.concurrent.CancellationException;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

public final class CancellationExceptionKt {
   @InlineOnly
   @SinceKotlin(
      version = "1.4"
   )
   private static final CancellationException CancellationException(String message, Throwable cause) {
      CancellationException var2 = new CancellationException(message);
      int var4 = false;
      var2.initCause(cause);
      return var2;
   }

   @InlineOnly
   @SinceKotlin(
      version = "1.4"
   )
   private static final CancellationException CancellationException(Throwable cause) {
      CancellationException var1 = new CancellationException(cause != null ? String.valueOf(cause) : null);
      int var3 = false;
      var1.initCause(cause);
      return var1;
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.4"
   )
   public static void CancellationException$annotations() {
   }
}
