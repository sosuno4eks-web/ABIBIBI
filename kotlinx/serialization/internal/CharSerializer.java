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
public final class CharSerializer implements KSerializer<Character> {
   @NotNull
   public static final CharSerializer INSTANCE = new CharSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private CharSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize(@NotNull Encoder encoder, char value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      encoder.encodeChar(value);
   }

   @NotNull
   public Character deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return decoder.decodeChar();
   }

   static {
      descriptor = (SerialDescriptor)(new PrimitiveSerialDescriptor("kotlin.Char", (PrimitiveKind)PrimitiveKind.CHAR.INSTANCE));
   }
}
