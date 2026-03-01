package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@InternalSerializationApi
public abstract class MapLikeSerializer<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractCollectionSerializer<Entry<? extends Key, ? extends Value>, Collection, Builder> {
   @NotNull
   private final KSerializer<Key> keySerializer;
   @NotNull
   private final KSerializer<Value> valueSerializer;

   private MapLikeSerializer(KSerializer<Key> keySerializer, KSerializer<Value> valueSerializer) {
      super((DefaultConstructorMarker)null);
      this.keySerializer = keySerializer;
      this.valueSerializer = valueSerializer;
   }

   @NotNull
   public final KSerializer<Key> getKeySerializer() {
      return this.keySerializer;
   }

   @NotNull
   public final KSerializer<Value> getValueSerializer() {
      return this.valueSerializer;
   }

   protected abstract void insertKeyValuePair(@NotNull Builder var1, int var2, Key var3, Value var4);

   @NotNull
   public abstract SerialDescriptor getDescriptor();

   protected final void readAll(@NotNull CompositeDecoder decoder, @NotNull Builder builder, int startIndex, int size) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      Intrinsics.checkNotNullParameter(builder, "builder");
      if (size < 0) {
         int var9 = false;
         String var10 = "Size must be known in advance when using READ_ALL";
         throw new IllegalArgumentException(var10.toString());
      } else {
         IntProgression var5 = RangesKt.step((IntProgression)RangesKt.until(0, size * 2), 2);
         int index = var5.getFirst();
         int var7 = var5.getLast();
         int var8 = var5.getStep();
         if (var8 > 0 && index <= var7 || var8 < 0 && var7 <= index) {
            while(true) {
               this.readElement(decoder, startIndex + index, builder, false);
               if (index == var7) {
                  break;
               }

               index += var8;
            }
         }

      }
   }

   protected final void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull Builder builder, boolean checkIndex) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      Intrinsics.checkNotNullParameter(builder, "builder");
      Object key = CompositeDecoder.decodeSerializableElement$default(decoder, this.getDescriptor(), index, (DeserializationStrategy)this.keySerializer, (Object)null, 8, (Object)null);
      int var10000;
      if (checkIndex) {
         int var7 = decoder.decodeElementIndex(this.getDescriptor());
         int var9 = false;
         if (var7 != index + 1) {
            int var10 = false;
            String var12 = "Value must follow key in a map, index for key: " + index + ", returned index for value: " + var7;
            throw new IllegalArgumentException(var12.toString());
         }

         var10000 = var7;
      } else {
         var10000 = index + 1;
      }

      int vIndex = var10000;
      Object value = builder.containsKey(key) && !(this.valueSerializer.getDescriptor().getKind() instanceof PrimitiveKind) ? decoder.decodeSerializableElement(this.getDescriptor(), vIndex, (DeserializationStrategy)this.valueSerializer, MapsKt.getValue(builder, key)) : CompositeDecoder.decodeSerializableElement$default(decoder, this.getDescriptor(), vIndex, (DeserializationStrategy)this.valueSerializer, (Object)null, 8, (Object)null);
      builder.put(key, value);
   }

   public void serialize(@NotNull Encoder encoder, Collection value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      int size = this.collectionSize(value);
      SerialDescriptor descriptor$iv = this.getDescriptor();
      int $i$f$encodeCollection = false;
      CompositeEncoder composite$iv = encoder.beginCollection(descriptor$iv, size);
      CompositeEncoder $this$serialize_u24lambda_u244 = composite$iv;
      int var10 = false;
      Iterator iterator = this.collectionIterator(value);
      int index = 0;
      int $i$f$forEach = false;
      Iterator var15 = iterator;

      while(var15.hasNext()) {
         Object element$iv = var15.next();
         Entry var17 = (Entry)element$iv;
         int var18 = false;
         Object k = var17.getKey();
         Object v = var17.getValue();
         SerialDescriptor var10001 = this.getDescriptor();
         int var21 = index++;
         $this$serialize_u24lambda_u244.encodeSerializableElement(var10001, var21, (SerializationStrategy)this.getKeySerializer(), k);
         var10001 = this.getDescriptor();
         var21 = index++;
         $this$serialize_u24lambda_u244.encodeSerializableElement(var10001, var21, (SerializationStrategy)this.getValueSerializer(), v);
      }

      composite$iv.endStructure(descriptor$iv);
   }

   // $FF: synthetic method
   public MapLikeSerializer(KSerializer keySerializer, KSerializer valueSerializer, DefaultConstructorMarker $constructor_marker) {
      this(keySerializer, valueSerializer);
   }
}
