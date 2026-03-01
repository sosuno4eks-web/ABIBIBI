package kotlin.text;

import java.util.Set;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

class StringsKt__RegexExtensionsKt extends StringsKt__RegexExtensionsJVMKt {
   @InlineOnly
   private static final Regex toRegex(String $this$toRegex) {
      Intrinsics.checkNotNullParameter($this$toRegex, "<this>");
      return new Regex($this$toRegex);
   }

   @InlineOnly
   private static final Regex toRegex(String $this$toRegex, RegexOption option) {
      Intrinsics.checkNotNullParameter($this$toRegex, "<this>");
      Intrinsics.checkNotNullParameter(option, "option");
      return new Regex($this$toRegex, option);
   }

   @InlineOnly
   private static final Regex toRegex(String $this$toRegex, Set<? extends RegexOption> options) {
      Intrinsics.checkNotNullParameter($this$toRegex, "<this>");
      Intrinsics.checkNotNullParameter(options, "options");
      return new Regex($this$toRegex, options);
   }

   public StringsKt__RegexExtensionsKt() {
   }
}
