package kotlinx.serialization.json;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonDslMarker
public final class JsonObjectBuilder {
   @NotNull
   private final Map<String, JsonElement> content = (Map)(new LinkedHashMap());

   @Nullable
   public final JsonElement put(@NotNull String key, @NotNull JsonElement element) {
      Intrinsics.checkNotNullParameter(key, "key");
      Intrinsics.checkNotNullParameter(element, "element");
      return (JsonElement)this.content.put(key, element);
   }

   @PublishedApi
   @NotNull
   public final JsonObject build() {
      return new JsonObject(this.content);
   }
}
