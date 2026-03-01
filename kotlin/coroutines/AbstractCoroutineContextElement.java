package kotlin.coroutines;

import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.3"
)
public abstract class AbstractCoroutineContextElement implements CoroutineContext.Element {
   @NotNull
   private final CoroutineContext.Key<?> key;

   public AbstractCoroutineContextElement(@NotNull CoroutineContext.Key<?> key) {
      Intrinsics.checkNotNullParameter(key, "key");
      super();
      this.key = key;
   }

   @NotNull
   public CoroutineContext.Key<?> getKey() {
      return this.key;
   }

   @Nullable
   public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
      return CoroutineContext.Element.DefaultImpls.get(this, key);
   }

   public <R> R fold(R initial, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
      return CoroutineContext.Element.DefaultImpls.fold(this, initial, operation);
   }

   @NotNull
   public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
      return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
   }

   @NotNull
   public CoroutineContext plus(@NotNull CoroutineContext context) {
      return CoroutineContext.Element.DefaultImpls.plus(this, context);
   }
}
