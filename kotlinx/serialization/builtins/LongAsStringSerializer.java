package kotlinx.serialization.builtins;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

public final class LongAsStringSerializer implements KSerializer<Long> {
   @NotNull
   public static final LongAsStringSerializer INSTANCE = new LongAsStringSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private LongAsStringSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize(@NotNull Encoder encoder, long value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      encoder.encodeString(String.valueOf(value));
   }

   @NotNull
   public Long deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return Long.parseLong(decoder.decodeString());
   }

   static {
      descriptor = SerialDescriptorsKt.PrimitiveSerialDescriptor("kotlinx.serialization.LongAsStringSerializer", (PrimitiveKind)PrimitiveKind.STRING.INSTANCE);
   }
}
