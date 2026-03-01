package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;

public final class CharCodeKt {
   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final char Char(int code) {
      if (code >= 0 && code <= 65535) {
         return (char)code;
      } else {
         throw new IllegalArgumentException("Invalid Char code: " + code);
      }
   }

   private static final int getCode(char $this$code) {
      return $this$code;
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   @IntrinsicConstEvaluation
   public static void getCode$annotations(char <this>) {
   }
}
