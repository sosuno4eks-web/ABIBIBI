package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class NotImplementedError extends Error {
   public NotImplementedError(@NotNull String message) {
      Intrinsics.checkNotNullParameter(message, "message");
      super(message);
   }

   // $FF: synthetic method
   public NotImplementedError(String var1, int var2, DefaultConstructorMarker var3) {
      if ((var2 & 1) != 0) {
         var1 = "An operation is not implemented.";
      }

      this(var1);
   }

   public NotImplementedError() {
      this((String)null, 1, (DefaultConstructorMarker)null);
   }
}
