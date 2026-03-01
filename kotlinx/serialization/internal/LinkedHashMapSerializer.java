package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class LinkedHashMapSerializer<K, V> extends MapLikeSerializer<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {
   @NotNull
   private final SerialDescriptor descriptor;

   public LinkedHashMapSerializer(@NotNull KSerializer<K> kSerializer, @NotNull KSerializer<V> vSerializer) {
      Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
      Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
      super(kSerializer, vSerializer, (DefaultConstructorMarker)null);
      this.descriptor = (SerialDescriptor)(new LinkedHashMapClassDesc(kSerializer.getDescriptor(), vSerializer.getDescriptor()));
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return this.descriptor;
   }

   protected int collectionSize(@NotNull Map<K, ? extends V> $this$collectionSize) {
      Intrinsics.checkNotNullParameter($this$collectionSize, "<this>");
      return $this$collectionSize.size();
   }

   @NotNull
   protected Iterator<Entry<K, V>> collectionIterator(@NotNull Map<K, ? extends V> $this$collectionIterator) {
      Intrinsics.checkNotNullParameter($this$collectionIterator, "<this>");
      return $this$collectionIterator.entrySet().iterator();
   }

   @NotNull
   protected LinkedHashMap<K, V> builder() {
      return new LinkedHashMap();
   }

   protected int builderSize(@NotNull LinkedHashMap<K, V> $this$builderSize) {
      Intrinsics.checkNotNullParameter($this$builderSize, "<this>");
      return $this$builderSize.size() * 2;
   }

   @NotNull
   protected Map<K, V> toResult(@NotNull LinkedHashMap<K, V> $this$toResult) {
      Intrinsics.checkNotNullParameter($this$toResult, "<this>");
      return (Map)$this$toResult;
   }

   @NotNull
   protected LinkedHashMap<K, V> toBuilder(@NotNull Map<K, ? extends V> $this$toBuilder) {
      Intrinsics.checkNotNullParameter($this$toBuilder, "<this>");
      LinkedHashMap var10000 = $this$toBuilder instanceof LinkedHashMap ? (LinkedHashMap)$this$toBuilder : null;
      if (($this$toBuilder instanceof LinkedHashMap ? (LinkedHashMap)$this$toBuilder : null) == null) {
         var10000 = new LinkedHashMap($this$toBuilder);
      }

      return var10000;
   }

   protected void checkCapacity(@NotNull LinkedHashMap<K, V> $this$checkCapacity, int size) {
      Intrinsics.checkNotNullParameter($this$checkCapacity, "<this>");
   }

   protected void insertKeyValuePair(@NotNull LinkedHashMap<K, V> $this$insertKeyValuePair, int index, K key, V value) {
      Intrinsics.checkNotNullParameter($this$insertKeyValuePair, "<this>");
      ((Map)$this$insertKeyValuePair).put(key, value);
   }
}
