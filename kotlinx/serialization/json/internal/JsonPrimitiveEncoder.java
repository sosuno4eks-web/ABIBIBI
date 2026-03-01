package kotlinx.serialization.json.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class JsonPrimitiveEncoder extends AbstractJsonTreeEncoder {
   @Nullable
   private JsonElement content;

   public JsonPrimitiveEncoder(@NotNull Json json, @NotNull Function1<? super JsonElement, Unit> nodeConsumer) {
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
      super(json, nodeConsumer, (DefaultConstructorMarker)null);
      this.pushTag("primitive");
   }

   public void putElement(@NotNull String key, @NotNull JsonElement element) {
      Intrinsics.checkNotNullParameter(key, "key");
      Intrinsics.checkNotNullParameter(element, "element");
      boolean var3;
      String var4;
      if (key != "primitive") {
         var3 = false;
         var4 = "This output can only consume primitives with 'primitive' tag";
         throw new IllegalArgumentException(var4.toString());
      } else if (this.content != null) {
         var3 = false;
         var4 = "Primitive element was already recorded. Does call to .encodeXxx happen more than once?";
         throw new IllegalArgumentException(var4.toString());
      } else {
         this.content = element;
         this.getNodeConsumer().invoke(element);
      }
   }

   @NotNull
   public JsonElement getCurrent() {
      JsonElement var10000 = this.content;
      if (var10000 == null) {
         int var1 = false;
         String var2 = "Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?";
         throw new IllegalArgumentException(var2.toString());
      } else {
         return var10000;
      }
   }
}
