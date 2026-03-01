package kotlin.jdk7;

import kotlin.ExceptionsKt;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@JvmName(
   name = "AutoCloseableKt"
)
public final class AutoCloseableKt {
   @SinceKotlin(
      version = "2.0"
   )
   @InlineOnly
   private static final AutoCloseable AutoCloseable(Function0<Unit> closeAction) {
      Intrinsics.checkNotNullParameter(closeAction, "closeAction");
      return (AutoCloseable)(new AutoCloseable() {
         public final void close() {
            closeAction.invoke();
         }
      });
   }

   @SinceKotlin(
      version = "1.2"
   )
   @InlineOnly
   private static final <T extends AutoCloseable, R> R use(T $this$use, Function1<? super T, ? extends R> block) {
      Intrinsics.checkNotNullParameter(block, "block");
      Throwable exception = null;

      Object var3;
      try {
         var3 = block.invoke($this$use);
      } catch (Throwable var7) {
         exception = var7;
         throw var7;
      } finally {
         InlineMarker.finallyStart(1);
         closeFinally($this$use, exception);
         InlineMarker.finallyEnd(1);
      }

      return var3;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @PublishedApi
   public static final void closeFinally(@Nullable AutoCloseable $this$closeFinally, @Nullable Throwable cause) {
      if ($this$closeFinally != null) {
         if (cause == null) {
            $this$closeFinally.close();
         } else {
            try {
               $this$closeFinally.close();
            } catch (Throwable var3) {
               ExceptionsKt.addSuppressed(cause, var3);
            }
         }
      }

   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "2.0"
   )
   public static void AutoCloseable$annotations() {
   }
}
