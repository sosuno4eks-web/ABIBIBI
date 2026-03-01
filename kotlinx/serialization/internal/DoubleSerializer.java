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
public final class DoubleSerializer implements KSerializer<Double> {
   @NotNull
   public static final DoubleSerializer INSTANCE = new DoubleSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private DoubleSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize(@NotNull Encoder encoder, double value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      encoder.encodeDouble(value);
   }

   @NotNull
   public Double deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return decoder.decodeDouble();
   }

   static {
      descriptor = (SerialDescriptor)(new PrimitiveSerialDescriptor("kotlin.Double", (PrimitiveKind)PrimitiveKind.DOUBLE.INSTANCE));
   }
}
