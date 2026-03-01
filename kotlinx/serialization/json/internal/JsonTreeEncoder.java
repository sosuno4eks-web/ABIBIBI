package kotlinx.serialization.json.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class JsonTreeEncoder extends AbstractJsonTreeEncoder {
   @NotNull
   private final Map<String, JsonElement> content;

   public JsonTreeEncoder(@NotNull Json json, @NotNull Function1<? super JsonElement, Unit> nodeConsumer) {
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
      super(json, nodeConsumer, (DefaultConstructorMarker)null);
      this.content = (Map)(new LinkedHashMap());
   }

   @NotNull
   protected final Map<String, JsonElement> getContent() {
      return this.content;
   }

   public void putElement(@NotNull String key, @NotNull JsonElement element) {
      Intrinsics.checkNotNullParameter(key, "key");
      Intrinsics.checkNotNullParameter(element, "element");
      this.content.put(key, element);
   }

   public <T> void encodeNullableSerializableElement(@NotNull SerialDescriptor descriptor, int index, @NotNull SerializationStrategy<? super T> serializer, @Nullable T value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      if (value != null || this.configuration.getExplicitNulls()) {
         super.encodeNullableSerializableElement(descriptor, index, serializer, value);
      }

   }

   @NotNull
   public JsonElement getCurrent() {
      return (JsonElement)(new JsonObject(this.content));
   }
}
