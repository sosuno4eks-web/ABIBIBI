package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

public final class LongCompanionObject {
   @NotNull
   public static final LongCompanionObject INSTANCE = new LongCompanionObject();
   public static final long MIN_VALUE = Long.MIN_VALUE;
   public static final long MAX_VALUE = Long.MAX_VALUE;
   public static final int SIZE_BYTES = 8;
   public static final int SIZE_BITS = 64;

   private LongCompanionObject() {
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
