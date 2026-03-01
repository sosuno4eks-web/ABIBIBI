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
public final class IntSerializer implements KSerializer<Integer> {
   @NotNull
   public static final IntSerializer INSTANCE = new IntSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private IntSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize(@NotNull Encoder encoder, int value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      encoder.encodeInt(value);
   }

   @NotNull
   public Integer deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return decoder.decodeInt();
   }

   static {
      descriptor = (SerialDescriptor)(new PrimitiveSerialDescriptor("kotlin.Int", (PrimitiveKind)PrimitiveKind.INT.INSTANCE));
   }
}
