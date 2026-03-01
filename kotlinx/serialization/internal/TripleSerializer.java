package kotlinx.serialization.internal;

import java.util.List;
import kotlin.PublishedApi;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class TripleSerializer<A, B, C> implements KSerializer<Triple<? extends A, ? extends B, ? extends C>> {
   @NotNull
   private final KSerializer<A> aSerializer;
   @NotNull
   private final KSerializer<B> bSerializer;
   @NotNull
   private final KSerializer<C> cSerializer;
   @NotNull
   private final SerialDescriptor descriptor;

   public TripleSerializer(@NotNull KSerializer<A> aSerializer, @NotNull KSerializer<B> bSerializer, @NotNull KSerializer<C> cSerializer) {
      Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
      Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
      Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
      super();
      this.aSerializer = aSerializer;
      this.bSerializer = bSerializer;
      this.cSerializer = cSerializer;
      this.descriptor = SerialDescriptorsKt.buildClassSerialDescriptor("kotlin.Triple", new SerialDescriptor[0], TripleSerializer::descriptor$lambda$0);
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return this.descriptor;
   }

   public void serialize(@NotNull Encoder encoder, @NotNull Triple<? extends A, ? extends B, ? extends C> value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(value, "value");
      CompositeEncoder structuredEncoder = encoder.beginStructure(this.getDescriptor());
      structuredEncoder.encodeSerializableElement(this.getDescriptor(), 0, (SerializationStrategy)this.aSerializer, value.getFirst());
      structuredEncoder.encodeSerializableElement(this.getDescriptor(), 1, (SerializationStrategy)this.bSerializer, value.getSecond());
      structuredEncoder.encodeSerializableElement(this.getDescriptor(), 2, (SerializationStrategy)this.cSerializer, value.getThird());
      structuredEncoder.endStructure(this.getDescriptor());
   }

   @NotNull
   public Triple<A, B, C> deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      CompositeDecoder composite = decoder.beginStructure(this.getDescriptor());
      return composite.decodeSequentially() ? this.decodeSequentially(composite) : this.decodeStructure(composite);
   }

   private final Triple<A, B, C> decodeSequentially(CompositeDecoder composite) {
      Object a = CompositeDecoder.decodeSerializableElement$default(composite, this.getDescriptor(), 0, (DeserializationStrategy)this.aSerializer, (Object)null, 8, (Object)null);
      Object b = CompositeDecoder.decodeSerializableElement$default(composite, this.getDescriptor(), 1, (DeserializationStrategy)this.bSerializer, (Object)null, 8, (Object)null);
      Object c = CompositeDecoder.decodeSerializableElement$default(composite, this.getDescriptor(), 2, (DeserializationStrategy)this.cSerializer, (Object)null, 8, (Object)null);
      composite.endStructure(this.getDescriptor());
      return new Triple(a, b, c);
   }

   private final Triple<A, B, C> decodeStructure(CompositeDecoder composite) {
      Object a = TuplesKt.access$getNULL$p();
      Object b = TuplesKt.access$getNULL$p();
      Object c = TuplesKt.access$getNULL$p();

      while(true) {
         int index = composite.decodeElementIndex(this.getDescriptor());
         switch(index) {
         case -1:
            composite.endStructure(this.getDescriptor());
            if (a == TuplesKt.access$getNULL$p()) {
               throw new SerializationException("Element 'first' is missing");
            }

            if (b == TuplesKt.access$getNULL$p()) {
               throw new SerializationException("Element 'second' is missing");
            }

            if (c == TuplesKt.access$getNULL$p()) {
               throw new SerializationException("Element 'third' is missing");
            }

            return new Triple(a, b, c);
         case 0:
            a = CompositeDecoder.decodeSerializableElement$default(composite, this.getDescriptor(), 0, (DeserializationStrategy)this.aSerializer, (Object)null, 8, (Object)null);
            break;
         case 1:
            b = CompositeDecoder.decodeSerializableElement$default(composite, this.getDescriptor(), 1, (DeserializationStrategy)this.bSerializer, (Object)null, 8, (Object)null);
            break;
         case 2:
            c = CompositeDecoder.decodeSerializableElement$default(composite, this.getDescriptor(), 2, (DeserializationStrategy)this.cSerializer, (Object)null, 8, (Object)null);
            break;
         default:
            throw new SerializationException("Unexpected index " + index);
         }
      }
   }

   private static final Unit descriptor$lambda$0(TripleSerializer this$0, ClassSerialDescriptorBuilder $this$buildClassSerialDescriptor) {
      Intrinsics.checkNotNullParameter($this$buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
      ClassSerialDescriptorBuilder.element$default($this$buildClassSerialDescriptor, "first", this$0.aSerializer.getDescriptor(), (List)null, false, 12, (Object)null);
      ClassSerialDescriptorBuilder.element$default($this$buildClassSerialDescriptor, "second", this$0.bSerializer.getDescriptor(), (List)null, false, 12, (Object)null);
      ClassSerialDescriptorBuilder.element$default($this$buildClassSerialDescriptor, "third", this$0.cSerializer.getDescriptor(), (List)null, false, 12, (Object)null);
      return Unit.INSTANCE;
   }
}
