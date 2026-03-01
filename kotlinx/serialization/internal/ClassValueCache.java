package kotlinx.serialization.internal;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class ClassValueCache<T> implements SerializerCache<T> {
   @NotNull
   private final Function1<KClass<?>, KSerializer<T>> compute;
   @NotNull
   private final ClassValueReferences<CacheEntry<T>> classValue;

   public ClassValueCache(@NotNull Function1<? super KClass<?>, ? extends KSerializer<T>> compute) {
      Intrinsics.checkNotNullParameter(compute, "compute");
      super();
      this.compute = compute;
      this.classValue = new ClassValueReferences();
   }

   @NotNull
   public final Function1<KClass<?>, KSerializer<T>> getCompute() {
      return this.compute;
   }

   @Nullable
   public KSerializer<T> get(@NotNull KClass<Object> key) {
      Intrinsics.checkNotNullParameter(key, "key");
      ClassValueReferences this_$iv = this.classValue;
      Class key$iv = JvmClassMappingKt.getJavaClass(key);
      int $i$f$getOrSet = false;
      Object var10000 = this_$iv.get(key$iv);
      Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
      MutableSoftReference ref$iv = (MutableSoftReference)var10000;
      var10000 = ref$iv.reference.get();
      if (var10000 != null) {
         Object it$iv = var10000;
         int var7 = false;
         var10000 = it$iv;
      } else {
         var10000 = ref$iv.getOrSetWithLock((Function0)(new ClassValueCache$get$$inlined$getOrSet$1(this, key)));
      }

      return ((CacheEntry)var10000).serializer;
   }

   public boolean isStored(@NotNull KClass<?> key) {
      Intrinsics.checkNotNullParameter(key, "key");
      return this.classValue.isStored(JvmClassMappingKt.getJavaClass(key));
   }
}
