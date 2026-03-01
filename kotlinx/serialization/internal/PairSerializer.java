package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class PairSerializer<K, V> extends KeyValueSerializer<K, V, Pair<? extends K, ? extends V>> {
   @NotNull
   private final SerialDescriptor descriptor;

   public PairSerializer(@NotNull KSerializer<K> keySerializer, @NotNull KSerializer<V> valueSerializer) {
      Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
      Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
      super(keySerializer, valueSerializer, (DefaultConstructorMarker)null);
      this.descriptor = SerialDescriptorsKt.buildClassSerialDescriptor("kotlin.Pair", new SerialDescriptor[0], PairSerializer::descriptor$lambda$0);
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return this.descriptor;
   }

   protected K getKey(@NotNull Pair<? extends K, ? extends V> $this$key) {
      Intrinsics.checkNotNullParameter($this$key, "<this>");
      return $this$key.getFirst();
   }

   protected V getValue(@NotNull Pair<? extends K, ? extends V> $this$value) {
      Intrinsics.checkNotNullParameter($this$value, "<this>");
      return $this$value.getSecond();
   }

   @NotNull
   protected Pair<K, V> toResult(K key, V value) {
      return kotlin.TuplesKt.to(key, value);
   }

   private static final Unit descriptor$lambda$0(KSerializer $keySerializer, KSerializer $valueSerializer, ClassSerialDescriptorBuilder $this$buildClassSerialDescriptor) {
      Intrinsics.checkNotNullParameter($this$buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
      ClassSerialDescriptorBuilder.element$default($this$buildClassSerialDescriptor, "first", $keySerializer.getDescriptor(), (List)null, false, 12, (Object)null);
      ClassSerialDescriptorBuilder.element$default($this$buildClassSerialDescriptor, "second", $valueSerializer.getDescriptor(), (List)null, false, 12, (Object)null);
      return Unit.INSTANCE;
   }
}
