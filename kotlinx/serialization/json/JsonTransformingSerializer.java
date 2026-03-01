package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import org.jetbrains.annotations.NotNull;

public abstract class JsonTransformingSerializer<T> implements KSerializer<T> {
   @NotNull
   private final KSerializer<T> tSerializer;

   public JsonTransformingSerializer(@NotNull KSerializer<T> tSerializer) {
      Intrinsics.checkNotNullParameter(tSerializer, "tSerializer");
      super();
      this.tSerializer = tSerializer;
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return this.tSerializer.getDescriptor();
   }

   public final void serialize(@NotNull Encoder encoder, T value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      JsonEncoder output = JsonElementSerializersKt.asJsonEncoder(encoder);
      JsonElement element = TreeJsonEncoderKt.writeJson(output.getJson(), value, (SerializationStrategy)this.tSerializer);
      element = this.transformSerialize(element);
      output.encodeJsonElement(element);
   }

   public final T deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      JsonDecoder input = JsonElementSerializersKt.asJsonDecoder(decoder);
      JsonElement element = input.decodeJsonElement();
      return input.getJson().decodeFromJsonElement((DeserializationStrategy)this.tSerializer, this.transformDeserialize(element));
   }

   @NotNull
   protected JsonElement transformDeserialize(@NotNull JsonElement element) {
      Intrinsics.checkNotNullParameter(element, "element");
      return element;
   }

   @NotNull
   protected JsonElement transformSerialize(@NotNull JsonElement element) {
      Intrinsics.checkNotNullParameter(element, "element");
      return element;
   }
}
