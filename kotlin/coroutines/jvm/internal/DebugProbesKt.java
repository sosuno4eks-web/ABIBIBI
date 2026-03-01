package kotlin.coroutines.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class DebugProbesKt {
   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <T> Continuation<T> probeCoroutineCreated(@NotNull Continuation<? super T> completion) {
      Intrinsics.checkNotNullParameter(completion, "completion");
      return completion;
   }

   @SinceKotlin(
      version = "1.3"
   )
   public static final void probeCoroutineResumed(@NotNull Continuation<?> frame) {
      Intrinsics.checkNotNullParameter(frame, "frame");
   }

   @SinceKotlin(
      version = "1.3"
   )
   public static final void probeCoroutineSuspended(@NotNull Continuation<?> frame) {
      Intrinsics.checkNotNullParameter(frame, "frame");
   }
}
