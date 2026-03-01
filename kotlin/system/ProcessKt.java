package kotlin.system;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;

@JvmName(
   name = "ProcessKt"
)
public final class ProcessKt {
   @InlineOnly
   private static final Void exitProcess(int status) {
      System.exit(status);
      throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
   }
}
