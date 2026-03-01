package kotlin.coroutines.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.3"
)
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
   public RestrictedContinuationImpl(@Nullable Continuation<Object> completion) {
      super(completion);
      if (completion != null) {
         int var3 = false;
         if (completion.getContext() != EmptyCoroutineContext.INSTANCE) {
            int var4 = false;
            String var5 = "Coroutines with restricted suspension must have EmptyCoroutineContext";
            throw new IllegalArgumentException(var5.toString());
         }
      }

   }

   @NotNull
   public CoroutineContext getContext() {
      return (CoroutineContext)EmptyCoroutineContext.INSTANCE;
   }
}
