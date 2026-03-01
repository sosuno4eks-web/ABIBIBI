package kotlin.text;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class _OneToManyTitlecaseMappingsKt {
   @NotNull
   public static final String titlecaseImpl(char $this$titlecaseImpl) {
      String var10000 = String.valueOf($this$titlecaseImpl);
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type java.lang.String");
      var10000 = var10000.toUpperCase(Locale.ROOT);
      Intrinsics.checkNotNullExpressionValue(var10000, "toUpperCase(...)");
      String uppercase = var10000;
      if (uppercase.length() > 1) {
         if ($this$titlecaseImpl == 329) {
            var10000 = uppercase;
         } else {
            char var2 = uppercase.charAt(0);
            byte var4 = 1;
            Intrinsics.checkNotNull(uppercase, "null cannot be cast to non-null type java.lang.String");
            var10000 = uppercase.substring(var4);
            Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
            String var3 = var10000;
            Intrinsics.checkNotNull(var3, "null cannot be cast to non-null type java.lang.String");
            var10000 = var3.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
            var3 = var10000;
            var10000 = var2 + var3;
         }

         return var10000;
      } else {
         return String.valueOf(Character.toTitleCase($this$titlecaseImpl));
      }
   }
}
