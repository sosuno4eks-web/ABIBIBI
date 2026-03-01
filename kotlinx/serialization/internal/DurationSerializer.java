package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class DurationSerializer implements KSerializer<Duration> {
   @NotNull
   public static final DurationSerializer INSTANCE = new DurationSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private DurationSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize_HG0u8IE/* $FF was: serialize-HG0u8IE*/(@NotNull Encoder encoder, long value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      encoder.encodeString(Duration.toIsoString-impl(value));
   }

   public long deserialize_5sfh64U/* $FF was: deserialize-5sfh64U*/(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return Duration.Companion.parseIsoString-UwyO8pc(decoder.decodeString());
   }

   static {
      descriptor = (SerialDescriptor)(new PrimitiveSerialDescriptor("kotlin.time.Duration", (PrimitiveKind)PrimitiveKind.STRING.INSTANCE));
   }
}
