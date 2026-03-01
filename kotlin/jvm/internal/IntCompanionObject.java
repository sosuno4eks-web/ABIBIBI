package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

public final class IntCompanionObject {
   @NotNull
   public static final IntCompanionObject INSTANCE = new IntCompanionObject();
   public static final int MIN_VALUE = Integer.MIN_VALUE;
   public static final int MAX_VALUE = Integer.MAX_VALUE;
   public static final int SIZE_BYTES = 4;
   public static final int SIZE_BITS = 32;

   private IntCompanionObject() {
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
