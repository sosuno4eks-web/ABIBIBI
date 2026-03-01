package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public final class ExceptionsKt {
   private static final String constructMessage(File file, File other, String reason) {
      StringBuilder sb = new StringBuilder(file.toString());
      if (other != null) {
         sb.append(" -> " + other);
      }

      if (reason != null) {
         sb.append(": " + reason);
      }

      String var10000 = sb.toString();
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   // $FF: synthetic method
   public static final String access$constructMessage(File file, File other, String reason) {
      return constructMessage(file, other, reason);
   }
}
