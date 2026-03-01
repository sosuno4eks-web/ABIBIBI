package kotlin.coroutines;

import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.3"
)
public interface ContinuationInterceptor extends CoroutineContext.Element {
   @NotNull
   ContinuationInterceptor.Key Key = ContinuationInterceptor.Key.$$INSTANCE;

   @NotNull
   <T> Continuation<T> interceptContinuation(@NotNull Continuation<? super T> var1);

   void releaseInterceptedContinuation(@NotNull Continuation<?> var1);

   @Nullable
   <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> var1);

   @NotNull
   CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> var1);

   public static final class DefaultImpls {
      public static void releaseInterceptedContinuation(@NotNull ContinuationInterceptor $this, @NotNull Continuation<?> continuation) {
         Intrinsics.checkNotNullParameter(continuation, "continuation");
      }

      @Nullable
      public static <E extends CoroutineContext.Element> E get(@NotNull ContinuationInterceptor $this, @NotNull CoroutineContext.Key<E> key) {
         Intrinsics.checkNotNullParameter(key, "key");
         CoroutineContext.Element var10000;
         if (key instanceof AbstractCoroutineContextKey) {
            if (((AbstractCoroutineContextKey)key).isSubKey$kotlin_stdlib($this.getKey())) {
               CoroutineContext.Element var2 = ((AbstractCoroutineContextKey)key).tryCast$kotlin_stdlib((CoroutineContext.Element)$this);
               var10000 = var2 instanceof CoroutineContext.Element ? var2 : null;
            } else {
               var10000 = null;
            }

            return var10000;
         } else {
            if (ContinuationInterceptor.Key == key) {
               Intrinsics.checkNotNull($this, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
               var10000 = (CoroutineContext.Element)$this;
            } else {
               var10000 = null;
            }

            return var10000;
         }
      }

      @NotNull
      public static CoroutineContext minusKey(@NotNull ContinuationInterceptor $this, @NotNull CoroutineContext.Key<?> key) {
         Intrinsics.checkNotNullParameter(key, "key");
         if (!(key instanceof AbstractCoroutineContextKey)) {
            return ContinuationInterceptor.Key == key ? (CoroutineContext)EmptyCoroutineContext.INSTANCE : (CoroutineContext)$this;
         } else {
            return ((AbstractCoroutineContextKey)key).isSubKey$kotlin_stdlib($this.getKey()) && ((AbstractCoroutineContextKey)key).tryCast$kotlin_stdlib((CoroutineContext.Element)$this) != null ? (CoroutineContext)EmptyCoroutineContext.INSTANCE : (CoroutineContext)$this;
         }
      }

      public static <R> R fold(@NotNull ContinuationInterceptor $this, R initial, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
         Intrinsics.checkNotNullParameter(operation, "operation");
         return CoroutineContext.Element.DefaultImpls.fold((CoroutineContext.Element)$this, initial, operation);
      }

      @NotNull
      public static CoroutineContext plus(@NotNull ContinuationInterceptor $this, @NotNull CoroutineContext context) {
         Intrinsics.checkNotNullParameter(context, "context");
         return CoroutineContext.Element.DefaultImpls.plus((CoroutineContext.Element)$this, context);
      }
   }

   public static final class Key implements CoroutineContext.Key<ContinuationInterceptor> {
      // $FF: synthetic field
      static final ContinuationInterceptor.Key $$INSTANCE = new ContinuationInterceptor.Key();

      private Key() {
      }
   }
}
