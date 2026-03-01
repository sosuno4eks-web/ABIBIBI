package kotlin;

import org.jetbrains.annotations.Nullable;

public class KotlinNullPointerException extends NullPointerException {
   public KotlinNullPointerException() {
   }

   public KotlinNullPointerException(@Nullable String message) {
      super(message);
   }
}
