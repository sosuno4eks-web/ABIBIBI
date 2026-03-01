package kotlin.coroutines.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.3"
)
public abstract class ContinuationImpl extends BaseContinuationImpl {
   @Nullable
   private final CoroutineContext _context;
   @Nullable
   private transient Continuation<Object> intercepted;

   public ContinuationImpl(@Nullable Continuation<Object> completion, @Nullable CoroutineContext _context) {
      super(completion);
      this._context = _context;
   }

   public ContinuationImpl(@Nullable Continuation<Object> completion) {
      this(completion, completion != null ? completion.getContext() : null);
   }

   @NotNull
   public CoroutineContext getContext() {
      CoroutineContext var10000 = this._context;
      Intrinsics.checkNotNull(var10000);
      return var10000;
   }

   @NotNull
   public final Continuation<Object> intercepted() {
      Continuation var10000 = this.intercepted;
      if (var10000 == null) {
         label13: {
            ContinuationInterceptor var4 = (ContinuationInterceptor)this.getContext().get((CoroutineContext.Key)ContinuationInterceptor.Key);
            if (var4 != null) {
               var10000 = var4.interceptContinuation((Continuation)this);
               if (var10000 != null) {
                  break label13;
               }
            }

            var10000 = (Continuation)this;
         }

         Continuation var1 = var10000;
         int var3 = false;
         this.intercepted = var1;
         var10000 = var1;
      }

      return var10000;
   }

   protected void releaseIntercepted() {
      Continuation intercepted = this.intercepted;
      if (intercepted != null && intercepted != this) {
         CoroutineContext.Element var10000 = this.getContext().get((CoroutineContext.Key)ContinuationInterceptor.Key);
         Intrinsics.checkNotNull(var10000);
         ((ContinuationInterceptor)var10000).releaseInterceptedContinuation(intercepted);
      }

      this.intercepted = (Continuation)CompletedContinuation.INSTANCE;
   }
}
