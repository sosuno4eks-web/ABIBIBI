package kotlinx.serialization.json;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

@Serializable(
   with = JsonNullSerializer.class
)
public final class JsonNull extends JsonPrimitive {
   @NotNull
   public static final JsonNull INSTANCE = new JsonNull();
   @NotNull
   private static final String content = "null";

   private JsonNull() {
      super((DefaultConstructorMarker)null);
   }

   public boolean isString() {
      return false;
   }

   @NotNull
   public String getContent() {
      return content;
   }

   @NotNull
   public final KSerializer<JsonNull> serializer() {
      return (KSerializer)JsonNullSerializer.INSTANCE;
   }
}
