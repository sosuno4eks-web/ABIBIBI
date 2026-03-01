package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

final class JsonTreeListEncoder extends AbstractJsonTreeEncoder {
   @NotNull
   private final ArrayList<JsonElement> array;

   public JsonTreeListEncoder(@NotNull Json json, @NotNull Function1<? super JsonElement, Unit> nodeConsumer) {
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
      super(json, nodeConsumer, (DefaultConstructorMarker)null);
      this.array = new ArrayList();
   }

   @NotNull
   protected String elementName(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return String.valueOf(index);
   }

   public void putElement(@NotNull String key, @NotNull JsonElement element) {
      Intrinsics.checkNotNullParameter(key, "key");
      Intrinsics.checkNotNullParameter(element, "element");
      int idx = Integer.parseInt(key);
      this.array.add(idx, element);
   }

   @NotNull
   public JsonElement getCurrent() {
      return (JsonElement)(new JsonArray((List)this.array));
   }
}
