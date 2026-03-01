package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class FloatSerializer implements KSerializer<Float> {
   @NotNull
   public static final FloatSerializer INSTANCE = new FloatSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private FloatSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize(@NotNull Encoder encoder, float value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      encoder.encodeFloat(value);
   }

   @NotNull
   public Float deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return decoder.decodeFloat();
   }

   static {
      descriptor = (SerialDescriptor)(new PrimitiveSerialDescriptor("kotlin.Float", (PrimitiveKind)PrimitiveKind.FLOAT.INSTANCE));
   }
}
