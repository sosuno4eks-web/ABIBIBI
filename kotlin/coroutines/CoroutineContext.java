package kotlin.coroutines;

import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.3"
)
public interface CoroutineContext {
   @Nullable
   <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> var1);

   <R> R fold(R var1, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> var2);

   @NotNull
   CoroutineContext plus(@NotNull CoroutineContext var1);

   @NotNull
   CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> var1);

   public static final class DefaultImpls {
      @NotNull
      public static CoroutineContext plus(@NotNull CoroutineContext $this, @NotNull CoroutineContext context) {
         Intrinsics.checkNotNullParameter(context, "context");
         return context == EmptyCoroutineContext.INSTANCE ? $this : (CoroutineContext)context.fold($this, CoroutineContext.DefaultImpls::plus$lambda$0);
      }

      private static CoroutineContext plus$lambda$0(CoroutineContext acc, CoroutineContext.Element element) {
         Intrinsics.checkNotNullParameter(acc, "acc");
         Intrinsics.checkNotNullParameter(element, "element");
         CoroutineContext removed = acc.minusKey(element.getKey());
         CoroutineContext var10000;
         if (removed == EmptyCoroutineContext.INSTANCE) {
            var10000 = (CoroutineContext)element;
         } else {
            ContinuationInterceptor interceptor = (ContinuationInterceptor)removed.get((CoroutineContext.Key)ContinuationInterceptor.Key);
            CombinedContext var5;
            if (interceptor == null) {
               var5 = new CombinedContext(removed, element);
            } else {
               CoroutineContext left = removed.minusKey((CoroutineContext.Key)ContinuationInterceptor.Key);
               var5 = left == EmptyCoroutineContext.INSTANCE ? new CombinedContext((CoroutineContext)element, (CoroutineContext.Element)interceptor) : new CombinedContext((CoroutineContext)(new CombinedContext(left, element)), (CoroutineContext.Element)interceptor);
            }

            var10000 = (CoroutineContext)var5;
         }

         return var10000;
      }
   }

   public interface Element extends CoroutineContext {
      @NotNull
      CoroutineContext.Key<?> getKey();

      @Nullable
      <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> var1);

      <R> R fold(R var1, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> var2);

      @NotNull
      CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> var1);

      public static final class DefaultImpls {
         @Nullable
         public static <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Element $this, @NotNull CoroutineContext.Key<E> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            CoroutineContext.Element var10000;
            if (Intrinsics.areEqual((Object)$this.getKey(), (Object)key)) {
               Intrinsics.checkNotNull($this, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
               var10000 = $this;
            } else {
               var10000 = null;
            }

            return var10000;
         }

         public static <R> R fold(@NotNull CoroutineContext.Element $this, R initial, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return operation.invoke(initial, $this);
         }

         @NotNull
         public static CoroutineContext minusKey(@NotNull CoroutineContext.Element $this, @NotNull CoroutineContext.Key<?> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return Intrinsics.areEqual((Object)$this.getKey(), (Object)key) ? (CoroutineContext)EmptyCoroutineContext.INSTANCE : (CoroutineContext)$this;
         }

         @NotNull
         public static CoroutineContext plus(@NotNull CoroutineContext.Element $this, @NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return CoroutineContext.DefaultImpls.plus((CoroutineContext)$this, context);
         }
      }
   }

   public interface Key<E extends CoroutineContext.Element> {
   }
}
