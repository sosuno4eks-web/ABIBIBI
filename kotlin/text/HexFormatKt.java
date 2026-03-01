package kotlin.text;

import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class HexFormatKt {
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @SinceKotlin(
      version = "2.2"
   )
   @InlineOnly
   private static final HexFormat HexFormat(Function1<? super HexFormat.Builder, Unit> builderAction) {
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      HexFormat.Builder var1 = new HexFormat.Builder();
      builderAction.invoke(var1);
      return var1.build();
   }

   private static final boolean isCaseSensitive(String $this$isCaseSensitive) {
      CharSequence $this$any$iv = (CharSequence)$this$isCaseSensitive;
      int $i$f$any = false;
      int var3 = 0;

      boolean var10000;
      while(true) {
         if (var3 >= $this$any$iv.length()) {
            var10000 = false;
            break;
         }

         char element$iv = $this$any$iv.charAt(var3);
         int var6 = false;
         if (Intrinsics.compare(element$iv, 128) >= 0 || Character.isLetter(element$iv)) {
            var10000 = true;
            break;
         }

         ++var3;
      }

      return var10000;
   }

   // $FF: synthetic method
   public static final boolean access$isCaseSensitive(String $receiver) {
      return isCaseSensitive($receiver);
   }
}
