package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

public final class CompletedContinuation implements Continuation<Object> {
   @NotNull
   public static final CompletedContinuation INSTANCE = new CompletedContinuation();

   private CompletedContinuation() {
   }

   @NotNull
   public CoroutineContext getContext() {
      throw new IllegalStateException("This continuation is already complete".toString());
   }

   public void resumeWith(@NotNull Object result) {
      throw new IllegalStateException("This continuation is already complete".toString());
   }

   @NotNull
   public String toString() {
      return "This continuation is already complete";
   }
}
