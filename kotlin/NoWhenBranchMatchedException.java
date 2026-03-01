package kotlin;

import org.jetbrains.annotations.Nullable;

public class NoWhenBranchMatchedException extends RuntimeException {
   public NoWhenBranchMatchedException() {
   }

   public NoWhenBranchMatchedException(@Nullable String message) {
      super(message);
   }

   public NoWhenBranchMatchedException(@Nullable String message, @Nullable Throwable cause) {
      super(message, cause);
   }

   public NoWhenBranchMatchedException(@Nullable Throwable cause) {
      super(cause);
   }
}
