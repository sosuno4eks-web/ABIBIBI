package kotlin;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictsSuspension
@SinceKotlin(
   version = "1.7"
)
@WasExperimental(
   markerClass = {ExperimentalStdlibApi.class}
)
public abstract class DeepRecursiveScope<T, R> {
   private DeepRecursiveScope() {
   }

   @Nullable
   public abstract Object callRecursive(T var1, @NotNull Continuation<? super R> var2);

   @Nullable
   public abstract <U, S> Object callRecursive(@NotNull DeepRecursiveFunction<U, S> var1, U var2, @NotNull Continuation<? super S> var3);

   /** @deprecated */
   @Deprecated(
      message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.",
      replaceWith = @ReplaceWith(
   expression = "this.callRecursive(value)",
   imports = {}
),
      level = DeprecationLevel.ERROR
   )
   @NotNull
   public final Void invoke(@NotNull DeepRecursiveFunction<?, ?> $this$invoke, @Nullable Object value) {
      Intrinsics.checkNotNullParameter($this$invoke, "<this>");
      throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
   }

   // $FF: synthetic method
   public DeepRecursiveScope(DefaultConstructorMarker $constructor_marker) {
      this();
   }
}
