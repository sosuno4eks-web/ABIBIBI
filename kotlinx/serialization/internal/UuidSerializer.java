package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.ExperimentalUuidApi;
import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
@ExperimentalUuidApi
public final class UuidSerializer implements KSerializer<Uuid> {
   @NotNull
   public static final UuidSerializer INSTANCE = new UuidSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private UuidSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize(@NotNull Encoder encoder, @NotNull Uuid value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(value, "value");
      encoder.encodeString(value.toString());
   }

   @NotNull
   public Uuid deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return Uuid.Companion.parse(decoder.decodeString());
   }

   static {
      descriptor = (SerialDescriptor)(new PrimitiveSerialDescriptor("kotlin.uuid.Uuid", (PrimitiveKind)PrimitiveKind.STRING.INSTANCE));
   }
}
