package kotlinx.serialization;

import org.jetbrains.annotations.Nullable;

public class SerializationException extends IllegalArgumentException {
   public SerializationException() {
   }

   public SerializationException(@Nullable String message) {
      super(message);
   }

   public SerializationException(@Nullable String message, @Nullable Throwable cause) {
      super(message, cause);
   }

   public SerializationException(@Nullable Throwable cause) {
      super(cause);
   }
}
