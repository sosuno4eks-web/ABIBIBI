package kotlinx.serialization.json.internal;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

final class JsonTreeMapDecoder extends JsonTreeDecoder {
   @NotNull
   private final JsonObject value;
   @NotNull
   private final List<String> keys;
   private final int size;
   private int position;

   public JsonTreeMapDecoder(@NotNull Json json, @NotNull JsonObject value) {
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(value, "value");
      super(json, value, (String)null, (SerialDescriptor)null, 12, (DefaultConstructorMarker)null);
      this.value = value;
      this.keys = CollectionsKt.toList((Iterable)this.getValue().keySet());
      this.size = this.keys.size() * 2;
      this.position = -1;
   }

   @NotNull
   public JsonObject getValue() {
      return this.value;
   }

   @NotNull
   protected String elementName(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      int i = index / 2;
      return (String)this.keys.get(i);
   }

   public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      if (this.position < this.size - 1) {
         int var2 = this.position++;
         return this.position;
      } else {
         return -1;
      }
   }

   @NotNull
   protected JsonElement currentElement(@NotNull String tag) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      return this.position % 2 == 0 ? (JsonElement)JsonElementKt.JsonPrimitive(tag) : (JsonElement)MapsKt.getValue((Map)this.getValue(), tag);
   }

   public void endStructure(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
   }
}
