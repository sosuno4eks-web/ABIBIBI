package kotlinx.serialization.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class ConcurrentHashMapCache<T> implements SerializerCache<T> {
   @NotNull
   private final Function1<KClass<?>, KSerializer<T>> compute;
   @NotNull
   private final ConcurrentHashMap<Class<?>, CacheEntry<T>> cache;

   public ConcurrentHashMapCache(@NotNull Function1<? super KClass<?>, ? extends KSerializer<T>> compute) {
      Intrinsics.checkNotNullParameter(compute, "compute");
      super();
      this.compute = compute;
      this.cache = new ConcurrentHashMap();
   }

   @Nullable
   public KSerializer<T> get(@NotNull KClass<Object> key) {
      Intrinsics.checkNotNullParameter(key, "key");
      ConcurrentMap $this$getOrPut$iv = (ConcurrentMap)this.cache;
      Object key$iv = JvmClassMappingKt.getJavaClass(key);
      int $i$f$getOrPut = false;
      Object var10000 = $this$getOrPut$iv.get(key$iv);
      if (var10000 == null) {
         int var5 = false;
         Object default$iv = new CacheEntry((KSerializer)this.compute.invoke(key));
         int var7 = false;
         var10000 = $this$getOrPut$iv.putIfAbsent(key$iv, default$iv);
         if (var10000 == null) {
            var10000 = default$iv;
         }
      }

      return ((CacheEntry)var10000).serializer;
   }

   public boolean isStored(@NotNull KClass<?> key) {
      Intrinsics.checkNotNullParameter(key, "key");
      return this.cache.containsKey(JvmClassMappingKt.getJavaClass(key));
   }
}
