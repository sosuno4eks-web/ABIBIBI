package kotlin.text;

import java.util.regex.Pattern;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

class StringsKt__RegexExtensionsJVMKt extends StringsKt__IndentKt {
   @InlineOnly
   private static final Regex toRegex(Pattern $this$toRegex) {
      Intrinsics.checkNotNullParameter($this$toRegex, "<this>");
      return new Regex($this$toRegex);
   }

   public StringsKt__RegexExtensionsJVMKt() {
   }
}
