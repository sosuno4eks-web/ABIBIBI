package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

public final class ByteCompanionObject {
   @NotNull
   public static final ByteCompanionObject INSTANCE = new ByteCompanionObject();
   public static final byte MIN_VALUE = -128;
   public static final byte MAX_VALUE = 127;
   public static final int SIZE_BYTES = 1;
   public static final int SIZE_BITS = 8;

   private ByteCompanionObject() {
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
