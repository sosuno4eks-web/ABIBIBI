package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public abstract class KeyValueSerializer<K, V, R> implements KSerializer<R> {
   @NotNull
   private final KSerializer<K> keySerializer;
   @NotNull
   private final KSerializer<V> valueSerializer;

   private KeyValueSerializer(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
      this.keySerializer = keySerializer;
      this.valueSerializer = valueSerializer;
   }

   @NotNull
   protected final KSerializer<K> getKeySerializer() {
      return this.keySerializer;
   }

   @NotNull
   protected final KSerializer<V> getValueSerializer() {
      return this.valueSerializer;
   }

   protected abstract K getKey(R var1);

   protected abstract V getValue(R var1);

   protected abstract R toResult(K var1, V var2);

   public void serialize(@NotNull Encoder encoder, R value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      CompositeEncoder structuredEncoder = encoder.beginStructure(this.getDescriptor());
      structuredEncoder.encodeSerializableElement(this.getDescriptor(), 0, (SerializationStrategy)this.keySerializer, this.getKey(value));
      structuredEncoder.encodeSerializableElement(this.getDescriptor(), 1, (SerializationStrategy)this.valueSerializer, this.getValue(value));
      structuredEncoder.endStructure(this.getDescriptor());
   }

   public R deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      SerialDescriptor descriptor$iv = this.getDescriptor();
      int $i$f$decodeStructure = false;
      CompositeDecoder composite$iv = decoder.beginStructure(descriptor$iv);
      CompositeDecoder $this$deserialize_u24lambda_u240 = composite$iv;
      int var7 = false;
      Object var10000;
      Object key;
      Object value;
      if (composite$iv.decodeSequentially()) {
         key = CompositeDecoder.decodeSerializableElement$default(composite$iv, this.getDescriptor(), 0, (DeserializationStrategy)this.getKeySerializer(), (Object)null, 8, (Object)null);
         value = CompositeDecoder.decodeSerializableElement$default(composite$iv, this.getDescriptor(), 1, (DeserializationStrategy)this.getValueSerializer(), (Object)null, 8, (Object)null);
         var10000 = this.toResult(key, value);
      } else {
         key = TuplesKt.access$getNULL$p();
         value = TuplesKt.access$getNULL$p();

         label30:
         while(true) {
            int idx = $this$deserialize_u24lambda_u240.decodeElementIndex(this.getDescriptor());
            switch(idx) {
            case -1:
               if (key == TuplesKt.access$getNULL$p()) {
                  throw new SerializationException("Element 'key' is missing");
               }

               if (value == TuplesKt.access$getNULL$p()) {
                  throw new SerializationException("Element 'value' is missing");
               }

               var10000 = this.toResult(key, value);
               break label30;
            case 0:
               key = CompositeDecoder.decodeSerializableElement$default($this$deserialize_u24lambda_u240, this.getDescriptor(), 0, (DeserializationStrategy)this.getKeySerializer(), (Object)null, 8, (Object)null);
               break;
            case 1:
               value = CompositeDecoder.decodeSerializableElement$default($this$deserialize_u24lambda_u240, this.getDescriptor(), 1, (DeserializationStrategy)this.getValueSerializer(), (Object)null, 8, (Object)null);
               break;
            default:
               throw new SerializationException("Invalid index: " + idx);
            }
         }
      }

      Object result$iv = var10000;
      composite$iv.endStructure(descriptor$iv);
      return result$iv;
   }

   // $FF: synthetic method
   public KeyValueSerializer(KSerializer keySerializer, KSerializer valueSerializer, DefaultConstructorMarker $constructor_marker) {
      this(keySerializer, valueSerializer);
   }
}
