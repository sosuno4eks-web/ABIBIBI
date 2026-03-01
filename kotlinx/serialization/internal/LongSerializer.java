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
public final class LongSerializer implements KSerializer<Long> {
   @NotNull
   public static final LongSerializer INSTANCE = new LongSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private LongSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize(@NotNull Encoder encoder, long value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      encoder.encodeLong(value);
   }

   @NotNull
   public Long deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return decoder.decodeLong();
   }

   static {
      descriptor = (SerialDescriptor)(new PrimitiveSerialDescriptor("kotlin.Long", (PrimitiveKind)PrimitiveKind.LONG.INSTANCE));
   }
}
