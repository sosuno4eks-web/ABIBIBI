package kotlin;

import org.jetbrains.annotations.Nullable;

public class TypeCastException extends ClassCastException {
   public TypeCastException() {
   }

   public TypeCastException(@Nullable String message) {
      super(message);
   }
}
