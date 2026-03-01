package kotlin.io;

import java.io.Closeable;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@JvmName(
   name = "CloseableKt"
)
public final class CloseableKt {
   @InlineOnly
   private static final <T extends Closeable, R> R use(T $this$use, Function1<? super T, ? extends R> block) {
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
      version = "1.1"
   )
   @PublishedApi
   public static final void closeFinally(@Nullable Closeable $this$closeFinally, @Nullable Throwable cause) {
      if ($this$closeFinally != null) {
         if (cause == null) {
            $this$closeFinally.close();
         } else {
            try {
               $this$closeFinally.close();
            } catch (Throwable var3) {
               kotlin.ExceptionsKt.addSuppressed(cause, var3);
            }
         }
      }

   }
}
