package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

public final class ShortCompanionObject {
   @NotNull
   public static final ShortCompanionObject INSTANCE = new ShortCompanionObject();
   public static final short MIN_VALUE = -32768;
   public static final short MAX_VALUE = 32767;
   public static final int SIZE_BYTES = 2;
   public static final int SIZE_BITS = 16;

   private ShortCompanionObject() {
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.3"
   )
   public static void getSIZE_BYTES$annotations() {
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.3"
   )
   public static void getSIZE_BITS$annotations() {
   }
}
