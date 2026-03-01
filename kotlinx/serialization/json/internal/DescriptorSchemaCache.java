package kotlinx.serialization.json.internal;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DescriptorSchemaCache {
   @NotNull
   private final Map<SerialDescriptor, Map<DescriptorSchemaCache.Key<Object>, Object>> map = CreateMapForCacheKt.createMapForCache(16);

   public final <T> void set(@NotNull SerialDescriptor descriptor, @NotNull DescriptorSchemaCache.Key<T> key, @NotNull T value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(key, "key");
      Intrinsics.checkNotNullParameter(value, "value");
      Map $this$getOrPut$iv = this.map;
      int $i$f$getOrPut = false;
      Object value$iv = $this$getOrPut$iv.get(descriptor);
      Object var10000;
      if (value$iv == null) {
         int var8 = false;
         Object answer$iv = CreateMapForCacheKt.createMapForCache(2);
         $this$getOrPut$iv.put(descriptor, answer$iv);
         var10000 = answer$iv;
      } else {
         var10000 = value$iv;
      }

      $this$getOrPut$iv = (Map)var10000;
      $this$getOrPut$iv.put(key, value);
   }

   @NotNull
   public final <T> T getOrPut(@NotNull SerialDescriptor descriptor, @NotNull DescriptorSchemaCache.Key<T> key, @NotNull Function0<? extends T> defaultValue) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(key, "key");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      Object var10000 = this.get(descriptor, key);
      if (var10000 != null) {
         Object it = var10000;
         int var6 = false;
         return it;
      } else {
         Object value = defaultValue.invoke();
         this.set(descriptor, key, value);
         return value;
      }
   }

   @Nullable
   public final <T> T get(@NotNull SerialDescriptor descriptor, @NotNull DescriptorSchemaCache.Key<T> key) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(key, "key");
      Map var10000 = (Map)this.map.get(descriptor);
      Object var3 = var10000 != null ? var10000.get(key) : null;
      if (var3 == null) {
         var3 = null;
      }

      return var3;
   }

   public static final class Key<T> {
   }
}
