package kotlin.coroutines.jvm.internal;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class RunSuspend implements Continuation<Unit> {
   @Nullable
   private Result<Unit> result;

   public RunSuspend() {
   }

   @NotNull
   public CoroutineContext getContext() {
      return (CoroutineContext)EmptyCoroutineContext.INSTANCE;
   }

   @Nullable
   public final Result<Unit> getResult_xLWZpok/* $FF was: getResult-xLWZpok*/() {
      return this.result;
   }

   public final void setResult(@Nullable Result<Unit> <set-?>) {
      this.result = var1;
   }

   public void resumeWith(@NotNull Object result) {
      synchronized(this) {
         int var3 = false;
         this.result = Result.box-impl(result);
         Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
         ((Object)this).notifyAll();
         Unit var6 = Unit.INSTANCE;
      }
   }

   public final void await() {
      // $FF: Couldn't be decompiled
   }
}
