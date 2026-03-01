package kotlinx.serialization.json;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class JsonElementSerializer implements KSerializer<JsonElement> {
   @NotNull
   public static final JsonElementSerializer INSTANCE = new JsonElementSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private JsonElementSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize(@NotNull Encoder encoder, @NotNull JsonElement value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(value, "value");
      JsonElementSerializersKt.access$verify(encoder);
      if (value instanceof JsonPrimitive) {
         encoder.encodeSerializableValue((SerializationStrategy)JsonPrimitiveSerializer.INSTANCE, value);
      } else if (value instanceof JsonObject) {
         encoder.encodeSerializableValue((SerializationStrategy)JsonObjectSerializer.INSTANCE, value);
      } else {
         if (!(value instanceof JsonArray)) {
            throw new NoWhenBranchMatchedException();
         }

         encoder.encodeSerializableValue((SerializationStrategy)JsonArraySerializer.INSTANCE, value);
      }

   }

   @NotNull
   public JsonElement deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      JsonDecoder input = JsonElementSerializersKt.asJsonDecoder(decoder);
      return input.decodeJsonElement();
   }

   private static final SerialDescriptor descriptor$lambda$5$lambda$0() {
      return JsonPrimitiveSerializer.INSTANCE.getDescriptor();
   }

   private static final SerialDescriptor descriptor$lambda$5$lambda$1() {
      return JsonNullSerializer.INSTANCE.getDescriptor();
   }

   private static final SerialDescriptor descriptor$lambda$5$lambda$2() {
      return JsonLiteralSerializer.INSTANCE.getDescriptor();
   }

   private static final SerialDescriptor descriptor$lambda$5$lambda$3() {
      return JsonObjectSerializer.INSTANCE.getDescriptor();
   }

   private static final SerialDescriptor descriptor$lambda$5$lambda$4() {
      return JsonArraySerializer.INSTANCE.getDescriptor();
   }

   private static final Unit descriptor$lambda$5(ClassSerialDescriptorBuilder $this$buildSerialDescriptor) {
      Intrinsics.checkNotNullParameter($this$buildSerialDescriptor, "$this$buildSerialDescriptor");
      ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "JsonPrimitive", JsonElementSerializersKt.access$defer(JsonElementSerializer::descriptor$lambda$5$lambda$0), (List)null, false, 12, (Object)null);
      ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "JsonNull", JsonElementSerializersKt.access$defer(JsonElementSerializer::descriptor$lambda$5$lambda$1), (List)null, false, 12, (Object)null);
      ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "JsonLiteral", JsonElementSerializersKt.access$defer(JsonElementSerializer::descriptor$lambda$5$lambda$2), (List)null, false, 12, (Object)null);
      ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "JsonObject", JsonElementSerializersKt.access$defer(JsonElementSerializer::descriptor$lambda$5$lambda$3), (List)null, false, 12, (Object)null);
      ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "JsonArray", JsonElementSerializersKt.access$defer(JsonElementSerializer::descriptor$lambda$5$lambda$4), (List)null, false, 12, (Object)null);
      return Unit.INSTANCE;
   }

   static {
      descriptor = SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.json.JsonElement", (SerialKind)PolymorphicKind.SEALED.INSTANCE, new SerialDescriptor[0], JsonElementSerializer::descriptor$lambda$5);
   }
}
