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
public final class ShortSerializer implements KSerializer<Short> {
   @NotNull
   public static final ShortSerializer INSTANCE = new ShortSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private ShortSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize(@NotNull Encoder encoder, short value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      encoder.encodeShort(value);
   }

   @NotNull
   public Short deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return decoder.decodeShort();
   }

   static {
      descriptor = (SerialDescriptor)(new PrimitiveSerialDescriptor("kotlin.Short", (PrimitiveKind)PrimitiveKind.SHORT.INSTANCE));
   }
}
