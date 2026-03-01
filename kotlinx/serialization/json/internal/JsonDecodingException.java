package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class JsonDecodingException extends JsonException {
   public JsonDecodingException(@NotNull String message) {
      Intrinsics.checkNotNullParameter(message, "message");
      super(message);
   }
}
