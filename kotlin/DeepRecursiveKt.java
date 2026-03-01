package kotlin;

import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class DeepRecursiveKt {
   @NotNull
   private static final Object UNDEFINED_RESULT;

   @SinceKotlin(
      version = "1.7"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static final <T, R> R invoke(@NotNull DeepRecursiveFunction<T, R> $this$invoke, T value) {
      Intrinsics.checkNotNullParameter($this$invoke, "<this>");
      return (new DeepRecursiveScopeImpl($this$invoke.getBlock$kotlin_stdlib(), value)).runCallLoop();
   }

   // $FF: synthetic method
   public static final Object access$getUNDEFINED_RESULT$p() {
      return UNDEFINED_RESULT;
   }

   static {
      Result.Companion var10000 = Result.Companion;
      UNDEFINED_RESULT = Result.constructor-impl(IntrinsicsKt.getCOROUTINE_SUSPENDED());
   }
}
