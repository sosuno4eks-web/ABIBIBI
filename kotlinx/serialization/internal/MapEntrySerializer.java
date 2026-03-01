package kotlinx.serialization.internal;

import java.util.List;
import java.util.Map.Entry;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@PublishedApi
public final class MapEntrySerializer<K, V> extends KeyValueSerializer<K, V, Entry<? extends K, ? extends V>> {
   @NotNull
   private final SerialDescriptor descriptor;

   public MapEntrySerializer(@NotNull KSerializer<K> keySerializer, @NotNull KSerializer<V> valueSerializer) {
      Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
      Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
      super(keySerializer, valueSerializer, (DefaultConstructorMarker)null);
      this.descriptor = SerialDescriptorsKt.buildSerialDescriptor("kotlin.collections.Map.Entry", (SerialKind)StructureKind.MAP.INSTANCE, new SerialDescriptor[0], MapEntrySerializer::descriptor$lambda$0);
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return this.descriptor;
   }

   protected K getKey(@NotNull Entry<? extends K, ? extends V> $this$key) {
      Intrinsics.checkNotNullParameter($this$key, "<this>");
      return $this$key.getKey();
   }

   protected V getValue(@NotNull Entry<? extends K, ? extends V> $this$value) {
      Intrinsics.checkNotNullParameter($this$value, "<this>");
      return $this$value.getValue();
   }

   @NotNull
   protected Entry<K, V> toResult(K key, V value) {
      return (Entry)(new MapEntrySerializer.MapEntry(key, value));
   }

   private static final Unit descriptor$lambda$0(KSerializer $keySerializer, KSerializer $valueSerializer, ClassSerialDescriptorBuilder $this$buildSerialDescriptor) {
      Intrinsics.checkNotNullParameter($this$buildSerialDescriptor, "$this$buildSerialDescriptor");
      ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "key", $keySerializer.getDescriptor(), (List)null, false, 12, (Object)null);
      ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "value", $valueSerializer.getDescriptor(), (List)null, false, 12, (Object)null);
      return Unit.INSTANCE;
   }

   private static final class MapEntry<K, V> implements Entry<K, V>, KMappedMarker {
      private final K key;
      private final V value;

      public MapEntry(K key, V value) {
         this.key = key;
         this.value = value;
      }

      public K getKey() {
         return this.key;
      }

      public V getValue() {
         return this.value;
      }

      public final K component1() {
         return this.key;
      }

      public final V component2() {
         return this.value;
      }

      @NotNull
      public final MapEntrySerializer.MapEntry<K, V> copy(K key, V value) {
         return new MapEntrySerializer.MapEntry(key, value);
      }

      // $FF: synthetic method
      public static MapEntrySerializer.MapEntry copy$default(MapEntrySerializer.MapEntry var0, Object var1, Object var2, int var3, Object var4) {
         if ((var3 & 1) != 0) {
            var1 = var0.key;
         }

         if ((var3 & 2) != 0) {
            var2 = var0.value;
         }

         return var0.copy(var1, var2);
      }

      @NotNull
      public String toString() {
         return "MapEntry(key=" + this.key + ", value=" + this.value + ')';
      }

      public int hashCode() {
         int result = this.key == null ? 0 : this.key.hashCode();
         result = result * 31 + (this.value == null ? 0 : this.value.hashCode());
         return result;
      }

      public boolean equals(@Nullable Object other) {
         if (this == other) {
            return true;
         } else if (!(other instanceof MapEntrySerializer.MapEntry)) {
            return false;
         } else {
            MapEntrySerializer.MapEntry var2 = (MapEntrySerializer.MapEntry)other;
            if (!Intrinsics.areEqual(this.key, var2.key)) {
               return false;
            } else {
               return Intrinsics.areEqual(this.value, var2.value);
            }
         }
      }

      public V setValue(V newValue) {
         throw new UnsupportedOperationException("Operation is not supported for read-only collection");
      }
   }
}
