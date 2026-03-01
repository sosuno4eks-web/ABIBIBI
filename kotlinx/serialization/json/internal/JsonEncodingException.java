package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class JsonEncodingException extends JsonException {
   public JsonEncodingException(@NotNull String message) {
      Intrinsics.checkNotNullParameter(message, "message");
      super(message);
   }
}
