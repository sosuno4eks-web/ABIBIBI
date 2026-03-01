package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ExperimentalTime;
import kotlin.time.Instant;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
@ExperimentalTime
public final class InstantSerializer implements KSerializer<Instant> {
   @NotNull
   public static final InstantSerializer INSTANCE = new InstantSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private InstantSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize(@NotNull Encoder encoder, @NotNull Instant value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(value, "value");
      encoder.encodeString(value.toString());
   }

   @NotNull
   public Instant deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return Instant.Companion.parse((CharSequence)decoder.decodeString());
   }

   static {
      descriptor = (SerialDescriptor)(new PrimitiveSerialDescriptor("kotlin.time.Instant", (PrimitiveKind)PrimitiveKind.STRING.INSTANCE));
   }
}
