package kotlinx.serialization.json;

import kotlin.PublishedApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.JsonExceptionsKt;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class JsonPrimitiveSerializer implements KSerializer<JsonPrimitive> {
   @NotNull
   public static final JsonPrimitiveSerializer INSTANCE = new JsonPrimitiveSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private JsonPrimitiveSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize(@NotNull Encoder encoder, @NotNull JsonPrimitive value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(value, "value");
      JsonElementSerializersKt.access$verify(encoder);
      if (value instanceof JsonNull) {
         encoder.encodeSerializableValue((SerializationStrategy)JsonNullSerializer.INSTANCE, JsonNull.INSTANCE);
      } else {
         encoder.encodeSerializableValue((SerializationStrategy)JsonLiteralSerializer.INSTANCE, (JsonLiteral)value);
      }

   }

   @NotNull
   public JsonPrimitive deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      JsonElement result = JsonElementSerializersKt.asJsonDecoder(decoder).decodeJsonElement();
      if (!(result instanceof JsonPrimitive)) {
         throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected JSON element, expected JsonPrimitive, had " + Reflection.getOrCreateKotlinClass(result.getClass()), (CharSequence)result.toString());
      } else {
         return (JsonPrimitive)result;
      }
   }

   static {
      descriptor = SerialDescriptorsKt.buildSerialDescriptor$default("kotlinx.serialization.json.JsonPrimitive", (SerialKind)PrimitiveKind.STRING.INSTANCE, new SerialDescriptor[0], (Function1)null, 8, (Object)null);
   }
}
