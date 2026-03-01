package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@PublishedApi
public final class NullableSerializer<T> implements KSerializer<T> {
   @NotNull
   private final KSerializer<T> serializer;
   @NotNull
   private final SerialDescriptor descriptor;

   public NullableSerializer(@NotNull KSerializer<T> serializer) {
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      super();
      this.serializer = serializer;
      this.descriptor = (SerialDescriptor)(new SerialDescriptorForNullable(this.serializer.getDescriptor()));
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return this.descriptor;
   }

   public void serialize(@NotNull Encoder encoder, @Nullable T value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      if (value != null) {
         encoder.encodeNotNullMark();
         encoder.encodeSerializableValue((SerializationStrategy)this.serializer, value);
      } else {
         encoder.encodeNull();
      }

   }

   @Nullable
   public T deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return decoder.decodeNotNullMark() ? decoder.decodeSerializableValue((DeserializationStrategy)this.serializer) : decoder.decodeNull();
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (other != null && this.getClass() == other.getClass()) {
         NullableSerializer var10000 = (NullableSerializer)other;
         return Intrinsics.areEqual((Object)this.serializer, (Object)((NullableSerializer)other).serializer);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.serializer.hashCode();
   }
}
