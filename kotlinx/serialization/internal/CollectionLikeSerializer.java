package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public abstract class CollectionLikeSerializer<Element, Collection, Builder> extends AbstractCollectionSerializer<Element, Collection, Builder> {
   @NotNull
   private final KSerializer<Element> elementSerializer;

   private CollectionLikeSerializer(KSerializer<Element> elementSerializer) {
      super((DefaultConstructorMarker)null);
      this.elementSerializer = elementSerializer;
   }

   protected abstract void insert(Builder var1, int var2, Element var3);

   @NotNull
   public abstract SerialDescriptor getDescriptor();

   public void serialize(@NotNull Encoder encoder, Collection value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      int size = this.collectionSize(value);
      SerialDescriptor descriptor$iv = this.getDescriptor();
      int $i$f$encodeCollection = false;
      CompositeEncoder composite$iv = encoder.beginCollection(descriptor$iv, size);
      CompositeEncoder $this$serialize_u24lambda_u240 = composite$iv;
      int var10 = false;
      Iterator iterator = this.collectionIterator(value);

      for(int index = 0; index < size; ++index) {
         $this$serialize_u24lambda_u240.encodeSerializableElement(this.getDescriptor(), index, (SerializationStrategy)access$getElementSerializer$p(this), iterator.next());
      }

      composite$iv.endStructure(descriptor$iv);
   }

   protected final void readAll(@NotNull CompositeDecoder decoder, Builder builder, int startIndex, int size) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      if (size < 0) {
         int var6 = false;
         String var7 = "Size must be known in advance when using READ_ALL";
         throw new IllegalArgumentException(var7.toString());
      } else {
         for(int index = 0; index < size; ++index) {
            this.readElement(decoder, startIndex + index, builder, false);
         }

      }
   }

   protected void readElement(@NotNull CompositeDecoder decoder, int index, Builder builder, boolean checkIndex) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      this.insert(builder, index, CompositeDecoder.decodeSerializableElement$default(decoder, this.getDescriptor(), index, (DeserializationStrategy)this.elementSerializer, (Object)null, 8, (Object)null));
   }

   // $FF: synthetic method
   public CollectionLikeSerializer(KSerializer elementSerializer, DefaultConstructorMarker $constructor_marker) {
      this(elementSerializer);
   }

   // $FF: synthetic method
   public static final KSerializer access$getElementSerializer$p(CollectionLikeSerializer $this) {
      return $this.elementSerializer;
   }
}
