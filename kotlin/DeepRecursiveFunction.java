package kotlin;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(
   version = "1.7"
)
@WasExperimental(
   markerClass = {ExperimentalStdlibApi.class}
)
public final class DeepRecursiveFunction<T, R> {
   @NotNull
   private final Function3<DeepRecursiveScope<T, R>, T, Continuation<? super R>, Object> block;

   public DeepRecursiveFunction(@NotNull Function3<? super DeepRecursiveScope<T, R>, ? super T, ? super Continuation<? super R>, ? extends Object> block) {
      Intrinsics.checkNotNullParameter(block, "block");
      super();
      this.block = block;
   }

   @NotNull
   public final Function3<DeepRecursiveScope<T, R>, T, Continuation<? super R>, Object> getBlock$kotlin_stdlib() {
      return this.block;
   }
}
