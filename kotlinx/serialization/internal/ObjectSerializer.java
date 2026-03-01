package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class ObjectSerializer<T> implements KSerializer<T> {
   @NotNull
   private final T objectInstance;
   @NotNull
   private List<? extends Annotation> _annotations;
   @NotNull
   private final Lazy descriptor$delegate;

   public ObjectSerializer(@NotNull String serialName, @NotNull T objectInstance) {
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
      super();
      this.objectInstance = objectInstance;
      this._annotations = CollectionsKt.emptyList();
      this.descriptor$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, ObjectSerializer::descriptor_delegate$lambda$1);
   }

   @PublishedApi
   public ObjectSerializer(@NotNull String serialName, @NotNull T objectInstance, @NotNull Annotation[] classAnnotations) {
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
      Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
      this(serialName, objectInstance);
      this._annotations = ArraysKt.asList(classAnnotations);
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      Lazy var1 = this.descriptor$delegate;
      return (SerialDescriptor)var1.getValue();
   }

   public void serialize(@NotNull Encoder encoder, @NotNull T value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(value, "value");
      encoder.beginStructure(this.getDescriptor()).endStructure(this.getDescriptor());
   }

   @NotNull
   public T deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      SerialDescriptor descriptor$iv = this.getDescriptor();
      int $i$f$decodeStructure = false;
      CompositeDecoder composite$iv = decoder.beginStructure(descriptor$iv);
      int var7 = false;
      if (!composite$iv.decodeSequentially()) {
         int index = composite$iv.decodeElementIndex(this.getDescriptor());
         if (index != -1) {
            throw new SerializationException("Unexpected index " + index);
         }
      }

      Object result$iv = Unit.INSTANCE;
      composite$iv.endStructure(descriptor$iv);
      return this.objectInstance;
   }

   private static final Unit descriptor_delegate$lambda$1$lambda$0(ObjectSerializer this$0, ClassSerialDescriptorBuilder $this$buildSerialDescriptor) {
      Intrinsics.checkNotNullParameter($this$buildSerialDescriptor, "$this$buildSerialDescriptor");
      $this$buildSerialDescriptor.setAnnotations(this$0._annotations);
      return Unit.INSTANCE;
   }

   private static final SerialDescriptor descriptor_delegate$lambda$1(String $serialName, ObjectSerializer this$0) {
      return SerialDescriptorsKt.buildSerialDescriptor($serialName, (SerialKind)StructureKind.OBJECT.INSTANCE, new SerialDescriptor[0], ObjectSerializer::descriptor_delegate$lambda$1$lambda$0);
   }
}
