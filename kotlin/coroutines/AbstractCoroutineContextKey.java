package kotlin.coroutines;

import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.3"
)
@ExperimentalStdlibApi
public abstract class AbstractCoroutineContextKey<B extends CoroutineContext.Element, E extends B> implements CoroutineContext.Key<E> {
   @NotNull
   private final Function1<CoroutineContext.Element, E> safeCast;
   @NotNull
   private final CoroutineContext.Key<?> topmostKey;

   public AbstractCoroutineContextKey(@NotNull CoroutineContext.Key<B> baseKey, @NotNull Function1<? super CoroutineContext.Element, ? extends E> safeCast) {
      Intrinsics.checkNotNullParameter(baseKey, "baseKey");
      Intrinsics.checkNotNullParameter(safeCast, "safeCast");
      super();
      this.safeCast = safeCast;
      this.topmostKey = baseKey instanceof AbstractCoroutineContextKey ? ((AbstractCoroutineContextKey)baseKey).topmostKey : baseKey;
   }

   @Nullable
   public final E tryCast$kotlin_stdlib(@NotNull CoroutineContext.Element element) {
      Intrinsics.checkNotNullParameter(element, "element");
      return (CoroutineContext.Element)this.safeCast.invoke(element);
   }

   public final boolean isSubKey$kotlin_stdlib(@NotNull CoroutineContext.Key<?> key) {
      Intrinsics.checkNotNullParameter(key, "key");
      return key == this || this.topmostKey == key;
   }
}
