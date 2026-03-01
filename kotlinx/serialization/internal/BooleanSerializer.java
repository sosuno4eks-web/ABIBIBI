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
public final class BooleanSerializer implements KSerializer<Boolean> {
   @NotNull
   public static final BooleanSerializer INSTANCE = new BooleanSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private BooleanSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize(@NotNull Encoder encoder, boolean value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      encoder.encodeBoolean(value);
   }

   @NotNull
   public Boolean deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return decoder.decodeBoolean();
   }

   static {
      descriptor = (SerialDescriptor)(new PrimitiveSerialDescriptor("kotlin.Boolean", (PrimitiveKind)PrimitiveKind.BOOLEAN.INSTANCE));
   }
}
