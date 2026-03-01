package kotlin.text;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

final class SystemProperties {
   @NotNull
   public static final SystemProperties INSTANCE = new SystemProperties();
   @JvmField
   @NotNull
   public static final String LINE_SEPARATOR;

   private SystemProperties() {
   }

   static {
      String var10000 = System.getProperty("line.separator");
      Intrinsics.checkNotNull(var10000);
      LINE_SEPARATOR = var10000;
   }
}
