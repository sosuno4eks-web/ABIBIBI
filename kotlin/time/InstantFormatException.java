package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

final class InstantFormatException extends IllegalArgumentException {
   public InstantFormatException(@NotNull String message) {
      Intrinsics.checkNotNullParameter(message, "message");
      super(message);
   }
}
