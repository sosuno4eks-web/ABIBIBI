package kotlin;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class _Assertions {
   @NotNull
   public static final _Assertions INSTANCE = new _Assertions();
   @JvmField
   public static final boolean ENABLED;

   private _Assertions() {
   }

   /** @deprecated */
   // $FF: synthetic method
   @PublishedApi
   public static void getENABLED$annotations() {
   }

   static {
      ENABLED = INSTANCE.getClass().desiredAssertionStatus();
   }
}
