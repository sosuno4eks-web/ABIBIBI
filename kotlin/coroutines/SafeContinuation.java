package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.SinceKotlin;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@PublishedApi
@SinceKotlin(
   version = "1.3"
)
public final class SafeContinuation<T> implements Continuation<T>, CoroutineStackFrame {
   @NotNull
   private static final SafeContinuation.Companion Companion = new SafeContinuation.Companion((DefaultConstructorMarker)null);
   @NotNull
   private final Continuation<T> delegate;
   @Nullable
   private volatile Object result;
   private static final AtomicReferenceFieldUpdater<SafeContinuation<?>, Object> RESULT = AtomicReferenceFieldUpdater.newUpdater(SafeContinuation.class, Object.class, "result");

   public SafeContinuation(@NotNull Continuation<? super T> delegate, @Nullable Object initialResult) {
      Intrinsics.checkNotNullParameter(delegate, "delegate");
      super();
      this.delegate = delegate;
      this.result = initialResult;
   }

   @PublishedApi
   public SafeContinuation(@NotNull Continuation<? super T> delegate) {
      Intrinsics.checkNotNullParameter(delegate, "delegate");
      this(delegate, CoroutineSingletons.UNDECIDED);
   }

   @NotNull
   public CoroutineContext getContext() {
      return this.delegate.getContext();
   }

   public void resumeWith(@NotNull Object result) {
      while(true) {
         Object cur = this.result;
         if (cur == CoroutineSingletons.UNDECIDED) {
            if (RESULT.compareAndSet(this, CoroutineSingletons.UNDECIDED, result)) {
               return;
            }
         } else {
            if (cur == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
               if (!RESULT.compareAndSet(this, IntrinsicsKt.getCOROUTINE_SUSPENDED(), CoroutineSingletons.RESUMED)) {
                  continue;
               }

               this.delegate.resumeWith(result);
               return;
            }

            throw new IllegalStateException("Already resumed");
         }
      }
   }

   @PublishedApi
   @Nullable
   public final Object getOrThrow() {
      Object result = this.result;
      if (result == CoroutineSingletons.UNDECIDED) {
         if (RESULT.compareAndSet(this, CoroutineSingletons.UNDECIDED, IntrinsicsKt.getCOROUTINE_SUSPENDED())) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
         }

         result = this.result;
      }

      Object var10000;
      if (result == CoroutineSingletons.RESUMED) {
         var10000 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
      } else {
         if (result instanceof Result.Failure) {
            throw ((Result.Failure)result).exception;
         }

         var10000 = result;
      }

      return var10000;
   }

   @Nullable
   public CoroutineStackFrame getCallerFrame() {
      Continuation var1 = this.delegate;
      return var1 instanceof CoroutineStackFrame ? (CoroutineStackFrame)var1 : null;
   }

   @Nullable
   public StackTraceElement getStackTraceElement() {
      return null;
   }

   @NotNull
   public String toString() {
      return "SafeContinuation for " + this.delegate;
   }

   private static final class Companion {
      private Companion() {
      }

      /** @deprecated */
      // $FF: synthetic method
      private static void getRESULT$annotations() {
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
