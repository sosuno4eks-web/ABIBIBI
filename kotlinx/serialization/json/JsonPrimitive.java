package kotlinx.serialization.json;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

@Serializable(
   with = JsonPrimitiveSerializer.class
)
public abstract class JsonPrimitive extends JsonElement {
   @NotNull
   public static final JsonPrimitive.Companion Companion = new JsonPrimitive.Companion((DefaultConstructorMarker)null);

   private JsonPrimitive() {
      super((DefaultConstructorMarker)null);
   }

   public abstract boolean isString();

   @NotNull
   public abstract String getContent();

   @NotNull
   public String toString() {
      return this.getContent();
   }

   // $FF: synthetic method
   public JsonPrimitive(DefaultConstructorMarker $constructor_marker) {
      this();
   }

   public static final class Companion {
      private Companion() {
      }

      @NotNull
      public final KSerializer<JsonPrimitive> serializer() {
         return (KSerializer)JsonPrimitiveSerializer.INSTANCE;
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
