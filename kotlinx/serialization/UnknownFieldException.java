package kotlinx.serialization;

import kotlin.PublishedApi;
import org.jetbrains.annotations.Nullable;

@PublishedApi
public final class UnknownFieldException extends SerializationException {
   public UnknownFieldException(@Nullable String message) {
      super(message);
   }

   public UnknownFieldException(int index) {
      this("An unknown field for index " + index);
   }
}
