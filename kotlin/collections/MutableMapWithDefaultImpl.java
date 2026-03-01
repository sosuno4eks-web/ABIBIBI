package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class MutableMapWithDefaultImpl<K, V> implements MutableMapWithDefault<K, V> {
   @NotNull
   private final Map<K, V> map;
   @NotNull
   private final Function1<K, V> default;

   public MutableMapWithDefaultImpl(@NotNull Map<K, V> map, @NotNull Function1<? super K, ? extends V> default) {
      Intrinsics.checkNotNullParameter(map, "map");
      Intrinsics.checkNotNullParameter(var2, "default");
      super();
      this.map = map;
      this.default = var2;
   }

   @NotNull
   public Map<K, V> getMap() {
      return this.map;
   }

   public boolean equals(@Nullable Object other) {
      return this.getMap().equals(other);
   }

   public int hashCode() {
      return this.getMap().hashCode();
   }

   @NotNull
   public String toString() {
      return this.getMap().toString();
   }

   public int getSize() {
      return this.getMap().size();
   }

   public boolean isEmpty() {
      return this.getMap().isEmpty();
   }

   public boolean containsKey(Object key) {
      return this.getMap().containsKey(key);
   }

   public boolean containsValue(Object value) {
      return this.getMap().containsValue(value);
   }

   @Nullable
   public V get(Object key) {
      return this.getMap().get(key);
   }

   @NotNull
   public Set<K> getKeys() {
      return this.getMap().keySet();
   }

   @NotNull
   public Collection<V> getValues() {
      return this.getMap().values();
   }

   @NotNull
   public Set<java.util.Map.Entry<K, V>> getEntries() {
      return this.getMap().entrySet();
   }

   @Nullable
   public V put(K key, V value) {
      return this.getMap().put(key, value);
   }

   @Nullable
   public V remove(Object key) {
      return this.getMap().remove(key);
   }

   public void putAll(@NotNull Map<? extends K, ? extends V> from) {
      Intrinsics.checkNotNullParameter(from, "from");
      this.getMap().putAll(from);
   }

   public void clear() {
      this.getMap().clear();
   }

   public V getOrImplicitDefault(K key) {
      Map $this$getOrElseNullable$iv = this.getMap();
      int $i$f$getOrElseNullable = false;
      Object value$iv = $this$getOrElseNullable$iv.get(key);
      Object var10000;
      if (value$iv == null && !$this$getOrElseNullable$iv.containsKey(key)) {
         int var5 = false;
         var10000 = this.default.invoke(key);
      } else {
         var10000 = value$iv;
      }

      return var10000;
   }
}
