package kotlinx.serialization.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressAnimalSniffer
final class ClassValueReferences<T> extends ClassValue<MutableSoftReference<T>> {
   public ClassValueReferences() {
   }

   @NotNull
   protected MutableSoftReference<T> computeValue(@NotNull Class<?> type) {
      Intrinsics.checkNotNullParameter(type, "type");
      return new MutableSoftReference();
   }

   public final T getOrSet(@NotNull Class<?> key, @NotNull Function0<? extends T> factory) {
      Intrinsics.checkNotNullParameter(key, "key");
      Intrinsics.checkNotNullParameter(factory, "factory");
      int $i$f$getOrSet = false;
      Object var10000 = this.get(key);
      Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
      MutableSoftReference ref = (MutableSoftReference)var10000;
      var10000 = ref.reference.get();
      if (var10000 != null) {
         Object it = var10000;
         int var6 = false;
         return it;
      } else {
         return ref.getOrSetWithLock((Function0)(new Function0<T>() {
            public final T invoke() {
               return factory.invoke();
            }
         }));
      }
   }

   public final boolean isStored(@NotNull Class<?> key) {
      Intrinsics.checkNotNullParameter(key, "key");
      MutableSoftReference ref = (MutableSoftReference)this.get(key);
      return ref.reference.get() != null;
   }
}
