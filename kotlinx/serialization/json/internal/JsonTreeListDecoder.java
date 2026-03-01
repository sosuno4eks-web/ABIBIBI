package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

final class JsonTreeListDecoder extends AbstractJsonTreeDecoder {
   @NotNull
   private final JsonArray value;
   private final int size;
   private int currentIndex;

   public JsonTreeListDecoder(@NotNull Json json, @NotNull JsonArray value) {
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(value, "value");
      super(json, (JsonElement)value, (String)null, 4, (DefaultConstructorMarker)null);
      this.value = value;
      this.size = this.getValue().size();
      this.currentIndex = -1;
   }

   @NotNull
   public JsonArray getValue() {
      return this.value;
   }

   @NotNull
   protected String elementName(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return String.valueOf(index);
   }

   @NotNull
   protected JsonElement currentElement(@NotNull String tag) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      return this.getValue().get(Integer.parseInt(tag));
   }

   public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      if (this.currentIndex < this.size - 1) {
         int var2 = this.currentIndex++;
         return this.currentIndex;
      } else {
         return -1;
      }
   }
}
