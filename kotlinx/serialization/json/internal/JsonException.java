package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.NotNull;

public class JsonException extends SerializationException {
   public JsonException(@NotNull String message) {
      Intrinsics.checkNotNullParameter(message, "message");
      super(message);
   }
}
