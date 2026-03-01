package kotlinx.serialization.json.internal;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

final class JsonTreeMapEncoder extends JsonTreeEncoder {
   private String tag;
   private boolean isKey;

   public JsonTreeMapEncoder(@NotNull Json json, @NotNull Function1<? super JsonElement, Unit> nodeConsumer) {
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
      super(json, nodeConsumer);
      this.isKey = true;
   }

   public void putElement(@NotNull String key, @NotNull JsonElement element) {
      Intrinsics.checkNotNullParameter(key, "key");
      Intrinsics.checkNotNullParameter(element, "element");
      if (this.isKey) {
         if (!(element instanceof JsonPrimitive)) {
            if (element instanceof JsonObject) {
               throw JsonExceptionsKt.InvalidKeyKindException(JsonObjectSerializer.INSTANCE.getDescriptor());
            }

            if (element instanceof JsonArray) {
               throw JsonExceptionsKt.InvalidKeyKindException(JsonArraySerializer.INSTANCE.getDescriptor());
            }

            throw new NoWhenBranchMatchedException();
         }

         this.tag = ((JsonPrimitive)element).getContent();
         this.isKey = false;
      } else {
         Map var3 = this.getContent();
         String var10000 = this.tag;
         if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tag");
            var10000 = null;
         }

         var3.put(var10000, element);
         this.isKey = true;
      }

   }

   @NotNull
   public JsonElement getCurrent() {
      return (JsonElement)(new JsonObject(this.getContent()));
   }
}
