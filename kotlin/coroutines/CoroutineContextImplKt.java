package kotlin.coroutines;

import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class CoroutineContextImplKt {
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalStdlibApi
   @Nullable
   public static final <E extends CoroutineContext.Element> E getPolymorphicElement(@NotNull CoroutineContext.Element $this$getPolymorphicElement, @NotNull CoroutineContext.Key<E> key) {
      Intrinsics.checkNotNullParameter($this$getPolymorphicElement, "<this>");
      Intrinsics.checkNotNullParameter(key, "key");
      if (key instanceof AbstractCoroutineContextKey) {
         CoroutineContext.Element var10000;
         if (((AbstractCoroutineContextKey)key).isSubKey$kotlin_stdlib($this$getPolymorphicElement.getKey())) {
            CoroutineContext.Element var2 = ((AbstractCoroutineContextKey)key).tryCast$kotlin_stdlib($this$getPolymorphicElement);
            var10000 = var2 instanceof CoroutineContext.Element ? var2 : null;
         } else {
            var10000 = null;
         }

         return var10000;
      } else {
         return $this$getPolymorphicElement.getKey() == key ? $this$getPolymorphicElement : null;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalStdlibApi
   @NotNull
   public static final CoroutineContext minusPolymorphicKey(@NotNull CoroutineContext.Element $this$minusPolymorphicKey, @NotNull CoroutineContext.Key<?> key) {
      Intrinsics.checkNotNullParameter($this$minusPolymorphicKey, "<this>");
      Intrinsics.checkNotNullParameter(key, "key");
      if (!(key instanceof AbstractCoroutineContextKey)) {
         return $this$minusPolymorphicKey.getKey() == key ? (CoroutineContext)EmptyCoroutineContext.INSTANCE : (CoroutineContext)$this$minusPolymorphicKey;
      } else {
         return ((AbstractCoroutineContextKey)key).isSubKey$kotlin_stdlib($this$minusPolymorphicKey.getKey()) && ((AbstractCoroutineContextKey)key).tryCast$kotlin_stdlib($this$minusPolymorphicKey) != null ? (CoroutineContext)EmptyCoroutineContext.INSTANCE : (CoroutineContext)$this$minusPolymorphicKey;
      }
   }
}
