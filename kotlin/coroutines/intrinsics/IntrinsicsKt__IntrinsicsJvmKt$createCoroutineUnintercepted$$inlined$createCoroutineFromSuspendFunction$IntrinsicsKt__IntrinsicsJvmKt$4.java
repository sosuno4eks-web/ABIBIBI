package kotlin.coroutines.intrinsics;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4 extends ContinuationImpl {
   private int label;
   // $FF: synthetic field
   final Function2 $this_createCoroutineUnintercepted$inlined;
   // $FF: synthetic field
   final Object $receiver$inlined;

   public IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4(Continuation $completion, CoroutineContext $context, Function2 var3, Object var4) {
      this.$this_createCoroutineUnintercepted$inlined = var3;
      this.$receiver$inlined = var4;
      Intrinsics.checkNotNull($completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
      super($completion, $context);
   }

   protected Object invokeSuspend(Object result) {
      Object var10000;
      switch(this.label) {
      case 0:
         this.label = 1;
         ResultKt.throwOnFailure(result);
         Continuation it = (Continuation)this;
         int var3 = false;
         Intrinsics.checkNotNull(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
         var10000 = ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, it);
         break;
      case 1:
         this.label = 2;
         ResultKt.throwOnFailure(result);
         var10000 = result;
         break;
      default:
         throw new IllegalStateException("This coroutine had already completed".toString());
      }

      return var10000;
   }
}
