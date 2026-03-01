package kotlin.coroutines;

import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ContinuationKt {
   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <T> void resume(Continuation<? super T> $this$resume, T value) {
      Intrinsics.checkNotNullParameter($this$resume, "<this>");
      Result.Companion var10001 = Result.Companion;
      $this$resume.resumeWith(Result.constructor-impl(value));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <T> void resumeWithException(Continuation<? super T> $this$resumeWithException, Throwable exception) {
      Intrinsics.checkNotNullParameter($this$resumeWithException, "<this>");
      Intrinsics.checkNotNullParameter(exception, "exception");
      Result.Companion var10001 = Result.Companion;
      $this$resumeWithException.resumeWith(Result.constructor-impl(ResultKt.createFailure(exception)));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <T> Continuation<T> Continuation(CoroutineContext context, Function1<? super Result<? extends T>, Unit> resumeWith) {
      Intrinsics.checkNotNullParameter(context, "context");
      Intrinsics.checkNotNullParameter(resumeWith, "resumeWith");
      return (Continuation)(new Continuation<T>() {
         public CoroutineContext getContext() {
            return context;
         }

         public void resumeWith(Object result) {
            resumeWith.invoke(Result.box-impl(result));
         }
      });
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <T> Continuation<Unit> createCoroutine(@NotNull Function1<? super Continuation<? super T>, ? extends Object> $this$createCoroutine, @NotNull Continuation<? super T> completion) {
      Intrinsics.checkNotNullParameter($this$createCoroutine, "<this>");
      Intrinsics.checkNotNullParameter(completion, "completion");
      return (Continuation)(new SafeContinuation(IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted($this$createCoroutine, completion)), IntrinsicsKt.getCOROUTINE_SUSPENDED()));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <R, T> Continuation<Unit> createCoroutine(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> $this$createCoroutine, R receiver, @NotNull Continuation<? super T> completion) {
      Intrinsics.checkNotNullParameter($this$createCoroutine, "<this>");
      Intrinsics.checkNotNullParameter(completion, "completion");
      return (Continuation)(new SafeContinuation(IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted($this$createCoroutine, receiver, completion)), IntrinsicsKt.getCOROUTINE_SUSPENDED()));
   }

   @SinceKotlin(
      version = "1.3"
   )
   public static final <T> void startCoroutine(@NotNull Function1<? super Continuation<? super T>, ? extends Object> $this$startCoroutine, @NotNull Continuation<? super T> completion) {
      Intrinsics.checkNotNullParameter($this$startCoroutine, "<this>");
      Intrinsics.checkNotNullParameter(completion, "completion");
      Continuation var2 = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted($this$startCoroutine, completion));
      Unit var3 = Unit.INSTANCE;
      Result.Companion var10001 = Result.Companion;
      var2.resumeWith(Result.constructor-impl(var3));
   }

   @SinceKotlin(
      version = "1.3"
   )
   public static final <R, T> void startCoroutine(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> $this$startCoroutine, R receiver, @NotNull Continuation<? super T> completion) {
      Intrinsics.checkNotNullParameter($this$startCoroutine, "<this>");
      Intrinsics.checkNotNullParameter(completion, "completion");
      Continuation var3 = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted($this$startCoroutine, receiver, completion));
      Unit var4 = Unit.INSTANCE;
      Result.Companion var10001 = Result.Companion;
      var3.resumeWith(Result.constructor-impl(var4));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <T> Object suspendCoroutine(Function1<? super Continuation<? super T>, Unit> block, Continuation<? super T> $completion) {
      InlineMarker.mark(0);
      Continuation c = (Continuation)$completion;
      int var3 = false;
      SafeContinuation safe = new SafeContinuation(IntrinsicsKt.intercepted(c));
      block.invoke(safe);
      Object var10000 = safe.getOrThrow();
      if (var10000 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
         DebugProbesKt.probeCoroutineSuspended((Continuation)$completion);
      }

      InlineMarker.mark(1);
      return var10000;
   }

   private static final CoroutineContext getCoroutineContext() {
      throw new NotImplementedError("Implemented as intrinsic");
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   public static void getCoroutineContext$annotations() {
   }
}
