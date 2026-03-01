package kotlinx.serialization.json;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

@Serializable(
   with = JsonElementSerializer.class
)
public abstract class JsonElement {
   @NotNull
   public static final JsonElement.Companion Companion = new JsonElement.Companion((DefaultConstructorMarker)null);

   private JsonElement() {
   }

   // $FF: synthetic method
   public JsonElement(DefaultConstructorMarker $constructor_marker) {
      this();
   }

   public static final class Companion {
      private Companion() {
      }

      @NotNull
      public final KSerializer<JsonElement> serializer() {
         return (KSerializer)JsonElementSerializer.INSTANCE;
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
