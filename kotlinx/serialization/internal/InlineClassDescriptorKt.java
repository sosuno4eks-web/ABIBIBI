package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

public final class InlineClassDescriptorKt {
   @InternalSerializationApi
   @NotNull
   public static final <T> SerialDescriptor InlinePrimitiveDescriptor(@NotNull String name, @NotNull KSerializer<T> primitiveSerializer) {
      Intrinsics.checkNotNullParameter(name, "name");
      Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
      return (SerialDescriptor)(new InlineClassDescriptor(name, (GeneratedSerializer)(new GeneratedSerializer<T>() {
         public KSerializer<?>[] childSerializers() {
            KSerializer[] var1 = new KSerializer[]{primitiveSerializer};
            return var1;
         }

         public SerialDescriptor getDescriptor() {
            throw new IllegalStateException("unsupported".toString());
         }

         public void serialize(Encoder encoder, T value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            throw new IllegalStateException("unsupported".toString());
         }

         public T deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            throw new IllegalStateException("unsupported".toString());
         }

         public KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.super.typeParametersSerializers();
         }
      })));
   }
}
