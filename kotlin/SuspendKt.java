package kotlin;

import kotlin.coroutines.Continuation;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class SuspendKt {
   @InlineOnly
   @SinceKotlin(
      version = "1.2"
   )
   private static final <R> Function1<Continuation<? super R>, Object> suspend(Function1<? super Continuation<? super R>, ? extends Object> block) {
      Intrinsics.checkNotNullParameter(block, "block");
      return block;
   }
}
