package kotlin;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;

public final class DeepRecursiveScopeImpl$crossFunctionCompletion$$inlined$Continuation$1 implements Continuation<Object> {
   // $FF: synthetic field
   final CoroutineContext $context;
   // $FF: synthetic field
   final DeepRecursiveScopeImpl this$0;
   // $FF: synthetic field
   final Function3 $currentFunction$inlined;
   // $FF: synthetic field
   final Continuation $cont$inlined;

   public DeepRecursiveScopeImpl$crossFunctionCompletion$$inlined$Continuation$1(CoroutineContext $context, DeepRecursiveScopeImpl var2, Function3 var3, Continuation var4) {
      this.$context = $context;
      this.this$0 = var2;
      this.$currentFunction$inlined = var3;
      this.$cont$inlined = var4;
   }

   public CoroutineContext getContext() {
      return this.$context;
   }

   public void resumeWith(Object result) {
      int var3 = false;
      DeepRecursiveScopeImpl.access$setFunction$p(this.this$0, this.$currentFunction$inlined);
      DeepRecursiveScopeImpl.access$setCont$p(this.this$0, this.$cont$inlined);
      DeepRecursiveScopeImpl.access$setResult$p(this.this$0, result);
   }
}
