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
public final class ByteSerializer implements KSerializer<Byte> {
   @NotNull
   public static final ByteSerializer INSTANCE = new ByteSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private ByteSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize(@NotNull Encoder encoder, byte value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      encoder.encodeByte(value);
   }

   @NotNull
   public Byte deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return decoder.decodeByte();
   }

   static {
      descriptor = (SerialDescriptor)(new PrimitiveSerialDescriptor("kotlin.Byte", (PrimitiveKind)PrimitiveKind.BYTE.INSTANCE));
   }
}
