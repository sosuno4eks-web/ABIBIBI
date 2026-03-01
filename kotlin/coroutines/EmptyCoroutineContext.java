package kotlin.coroutines;

import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.3"
)
public final class EmptyCoroutineContext implements CoroutineContext, Serializable {
   @NotNull
   public static final EmptyCoroutineContext INSTANCE = new EmptyCoroutineContext();
   private static final long serialVersionUID = 0L;

   private EmptyCoroutineContext() {
   }

   private final Object readResolve() {
      return INSTANCE;
   }

   @Nullable
   public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
      Intrinsics.checkNotNullParameter(key, "key");
      return null;
   }

   public <R> R fold(R initial, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
      Intrinsics.checkNotNullParameter(operation, "operation");
      return initial;
   }

   @NotNull
   public CoroutineContext plus(@NotNull CoroutineContext context) {
      Intrinsics.checkNotNullParameter(context, "context");
      return context;
   }

   @NotNull
   public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
      Intrinsics.checkNotNullParameter(key, "key");
      return (CoroutineContext)this;
   }

   public int hashCode() {
      return 0;
   }

   @NotNull
   public String toString() {
      return "EmptyCoroutineContext";
   }
}
