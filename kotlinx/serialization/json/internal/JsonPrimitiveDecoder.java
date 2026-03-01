package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class JsonPrimitiveDecoder extends AbstractJsonTreeDecoder {
   @NotNull
   private final JsonElement value;

   public JsonPrimitiveDecoder(@NotNull Json json, @NotNull JsonElement value, @Nullable String polymorphicDiscriminator) {
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(value, "value");
      super(json, value, polymorphicDiscriminator, (DefaultConstructorMarker)null);
      this.value = value;
      this.pushTag("primitive");
   }

   // $FF: synthetic method
   public JsonPrimitiveDecoder(Json var1, JsonElement var2, String var3, int var4, DefaultConstructorMarker var5) {
      if ((var4 & 4) != 0) {
         var3 = null;
      }

      this(var1, var2, var3);
   }

   @NotNull
   public JsonElement getValue() {
      return this.value;
   }

   public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return 0;
   }

   @NotNull
   protected JsonElement currentElement(@NotNull String tag) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      if (tag != "primitive") {
         int var2 = false;
         String var3 = "This input can only handle primitives with 'primitive' tag";
         throw new IllegalArgumentException(var3.toString());
      } else {
         return this.getValue();
      }
   }
}
