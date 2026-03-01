package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.3"
)
public abstract class BaseContinuationImpl implements Continuation<Object>, CoroutineStackFrame, Serializable {
   @Nullable
   private final Continuation<Object> completion;

   public BaseContinuationImpl(@Nullable Continuation<Object> completion) {
      this.completion = completion;
   }

   @Nullable
   public final Continuation<Object> getCompletion() {
      return this.completion;
   }

   public final void resumeWith(@NotNull Object result) {
      Object current = null;
      current = this;
      Object param = null;
      param = result;

      while(true) {
         DebugProbesKt.probeCoroutineResumed((Continuation)current);
         BaseContinuationImpl $this$resumeWith_u24lambda_u240 = (BaseContinuationImpl)current;
         int var5 = false;
         Continuation var10000 = $this$resumeWith_u24lambda_u240.completion;
         Intrinsics.checkNotNull(var10000);
         Continuation completion = var10000;

         Object outcome;
         Result.Companion var11;
         try {
            outcome = $this$resumeWith_u24lambda_u240.invokeSuspend(param);
            if (outcome == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
               return;
            }

            var11 = Result.Companion;
            outcome = Result.constructor-impl(outcome);
         } catch (Throwable var10) {
            var11 = Result.Companion;
            outcome = Result.constructor-impl(ResultKt.createFailure(var10));
         }

         $this$resumeWith_u24lambda_u240.releaseIntercepted();
         if (!(completion instanceof BaseContinuationImpl)) {
            completion.resumeWith(outcome);
            return;
         }

         current = completion;
         param = outcome;
      }
   }

   @Nullable
   protected abstract Object invokeSuspend(@NotNull Object var1);

   protected void releaseIntercepted() {
   }

   @NotNull
   public Continuation<Unit> create(@NotNull Continuation<?> completion) {
      Intrinsics.checkNotNullParameter(completion, "completion");
      throw new UnsupportedOperationException("create(Continuation) has not been overridden");
   }

   @NotNull
   public Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<?> completion) {
      Intrinsics.checkNotNullParameter(completion, "completion");
      throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
   }

   @NotNull
   public String toString() {
      StringBuilder var10000 = (new StringBuilder()).append("Continuation at ");
      Object var10001 = this.getStackTraceElement();
      if (var10001 == null) {
         var10001 = this.getClass().getName();
      }

      return var10000.append(var10001).toString();
   }

   @Nullable
   public CoroutineStackFrame getCallerFrame() {
      Continuation var1 = this.completion;
      return var1 instanceof CoroutineStackFrame ? (CoroutineStackFrame)var1 : null;
   }

   @Nullable
   public StackTraceElement getStackTraceElement() {
      return DebugMetadataKt.getStackTraceElement(this);
   }
}
