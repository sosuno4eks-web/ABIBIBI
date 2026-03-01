package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

class LazyKt__LazyKt extends LazyKt__LazyJVMKt {
   @NotNull
   public static final <T> Lazy<T> lazyOf(T value) {
      return (Lazy)(new InitializedLazyImpl(value));
   }

   @InlineOnly
   private static final <T> T getValue(Lazy<? extends T> $this$getValue, Object thisRef, KProperty<?> property) {
      Intrinsics.checkNotNullParameter($this$getValue, "<this>");
      Intrinsics.checkNotNullParameter(property, "property");
      return $this$getValue.getValue();
   }

   public LazyKt__LazyKt() {
   }
}
