package kotlin.coroutines.intrinsics;

import kotlin.NotImplementedError;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

class IntrinsicsKt__IntrinsicsKt extends IntrinsicsKt__IntrinsicsJvmKt {
   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <T> Object suspendCoroutineUninterceptedOrReturn(Function1<? super Continuation<? super T>, ? extends Object> block, Continuation<? super T> $completion) {
      throw new NotImplementedError("Implementation of suspendCoroutineUninterceptedOrReturn is intrinsic");
   }

   @NotNull
   public static final Object getCOROUTINE_SUSPENDED() {
      return CoroutineSingletons.COROUTINE_SUSPENDED;
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.3"
   )
   public static void getCOROUTINE_SUSPENDED$annotations() {
   }

   public IntrinsicsKt__IntrinsicsKt() {
   }
}
