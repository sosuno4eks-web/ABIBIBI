package kotlinx.serialization.json;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@JsonDslMarker
public final class JsonArrayBuilder {
   @NotNull
   private final List<JsonElement> content = (List)(new ArrayList());

   public final boolean add(@NotNull JsonElement element) {
      Intrinsics.checkNotNullParameter(element, "element");
      ((Collection)this.content).add(element);
      return true;
   }

   @ExperimentalSerializationApi
   public final boolean addAll(@NotNull Collection<? extends JsonElement> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      return this.content.addAll(elements);
   }

   @PublishedApi
   @NotNull
   public final JsonArray build() {
      return new JsonArray(this.content);
   }
}
