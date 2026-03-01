package kotlinx.serialization.json;

import kotlin.PublishedApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.JsonDecodingException;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class JsonNullSerializer implements KSerializer<JsonNull> {
   @NotNull
   public static final JsonNullSerializer INSTANCE = new JsonNullSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private JsonNullSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize(@NotNull Encoder encoder, @NotNull JsonNull value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(value, "value");
      JsonElementSerializersKt.access$verify(encoder);
      encoder.encodeNull();
   }

   @NotNull
   public JsonNull deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      JsonElementSerializersKt.access$verify(decoder);
      if (decoder.decodeNotNullMark()) {
         throw new JsonDecodingException("Expected 'null' literal");
      } else {
         decoder.decodeNull();
         return JsonNull.INSTANCE;
      }
   }

   static {
      descriptor = SerialDescriptorsKt.buildSerialDescriptor$default("kotlinx.serialization.json.JsonNull", (SerialKind)SerialKind.ENUM.INSTANCE, new SerialDescriptor[0], (Function1)null, 8, (Object)null);
   }
}
