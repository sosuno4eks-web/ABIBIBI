package kotlin.text;

import java.util.Locale;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

class CharsKt__CharJVMKt {
   @NotNull
   public static final CharCategory getCategory(char $this$category) {
      return CharCategory.Companion.valueOf(Character.getType($this$category));
   }

   @InlineOnly
   private static final boolean isDefined(char $this$isDefined) {
      return Character.isDefined($this$isDefined);
   }

   @InlineOnly
   private static final boolean isLetter(char $this$isLetter) {
      return Character.isLetter($this$isLetter);
   }

   @InlineOnly
   private static final boolean isLetterOrDigit(char $this$isLetterOrDigit) {
      return Character.isLetterOrDigit($this$isLetterOrDigit);
   }

   @InlineOnly
   private static final boolean isDigit(char $this$isDigit) {
      return Character.isDigit($this$isDigit);
   }

   @InlineOnly
   private static final boolean isIdentifierIgnorable(char $this$isIdentifierIgnorable) {
      return Character.isIdentifierIgnorable($this$isIdentifierIgnorable);
   }

   @InlineOnly
   private static final boolean isISOControl(char $this$isISOControl) {
      return Character.isISOControl($this$isISOControl);
   }

   @InlineOnly
   private static final boolean isJavaIdentifierPart(char $this$isJavaIdentifierPart) {
      return Character.isJavaIdentifierPart($this$isJavaIdentifierPart);
   }

   @InlineOnly
   private static final boolean isJavaIdentifierStart(char $this$isJavaIdentifierStart) {
      return Character.isJavaIdentifierStart($this$isJavaIdentifierStart);
   }

   public static final boolean isWhitespace(char $this$isWhitespace) {
      return Character.isWhitespace($this$isWhitespace) || Character.isSpaceChar($this$isWhitespace);
   }

   @InlineOnly
   private static final boolean isUpperCase(char $this$isUpperCase) {
      return Character.isUpperCase($this$isUpperCase);
   }

   @InlineOnly
   private static final boolean isLowerCase(char $this$isLowerCase) {
      return Character.isLowerCase($this$isLowerCase);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use uppercaseChar() instead.",
      replaceWith = @ReplaceWith(
   expression = "uppercaseChar()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final char toUpperCase(char $this$toUpperCase) {
      return Character.toUpperCase($this$toUpperCase);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final char uppercaseChar(char $this$uppercaseChar) {
      return Character.toUpperCase($this$uppercaseChar);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final String uppercase(char $this$uppercase) {
      String var10000 = String.valueOf($this$uppercase);
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type java.lang.String");
      var10000 = var10000.toUpperCase(Locale.ROOT);
      Intrinsics.checkNotNullExpressionValue(var10000, "toUpperCase(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @NotNull
   public static final String uppercase(char $this$uppercase, @NotNull Locale locale) {
      Intrinsics.checkNotNullParameter(locale, "locale");
      String var10000 = String.valueOf($this$uppercase);
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type java.lang.String");
      var10000 = var10000.toUpperCase(locale);
      Intrinsics.checkNotNullExpressionValue(var10000, "toUpperCase(...)");
      return var10000;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use lowercaseChar() instead.",
      replaceWith = @ReplaceWith(
   expression = "lowercaseChar()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final char toLowerCase(char $this$toLowerCase) {
      return Character.toLowerCase($this$toLowerCase);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final char lowercaseChar(char $this$lowercaseChar) {
      return Character.toLowerCase($this$lowercaseChar);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final String lowercase(char $this$lowercase) {
      String var10000 = String.valueOf($this$lowercase);
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type java.lang.String");
      var10000 = var10000.toLowerCase(Locale.ROOT);
      Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @NotNull
   public static final String lowercase(char $this$lowercase, @NotNull Locale locale) {
      Intrinsics.checkNotNullParameter(locale, "locale");
      String var10000 = String.valueOf($this$lowercase);
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type java.lang.String");
      var10000 = var10000.toLowerCase(locale);
      Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
      return var10000;
   }

   @InlineOnly
   private static final boolean isTitleCase(char $this$isTitleCase) {
      return Character.isTitleCase($this$isTitleCase);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use titlecaseChar() instead.",
      replaceWith = @ReplaceWith(
   expression = "titlecaseChar()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final char toTitleCase(char $this$toTitleCase) {
      return Character.toTitleCase($this$toTitleCase);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final char titlecaseChar(char $this$titlecaseChar) {
      return Character.toTitleCase($this$titlecaseChar);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @NotNull
   public static final String titlecase(char $this$titlecase, @NotNull Locale locale) {
      Intrinsics.checkNotNullParameter(locale, "locale");
      String localizedUppercase = CharsKt.uppercase($this$titlecase, locale);
      if (localizedUppercase.length() > 1) {
         String var10000;
         if ($this$titlecase == 329) {
            var10000 = localizedUppercase;
         } else {
            char var3 = localizedUppercase.charAt(0);
            byte var5 = 1;
            Intrinsics.checkNotNull(localizedUppercase, "null cannot be cast to non-null type java.lang.String");
            var10000 = localizedUppercase.substring(var5);
            Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
            String var4 = var10000;
            Intrinsics.checkNotNull(var4, "null cannot be cast to non-null type java.lang.String");
            var10000 = var4.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
            var4 = var10000;
            var10000 = var3 + var4;
         }

         return var10000;
      } else {
         String var10001 = String.valueOf($this$titlecase);
         Intrinsics.checkNotNull(var10001, "null cannot be cast to non-null type java.lang.String");
         var10001 = var10001.toUpperCase(Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(var10001, "toUpperCase(...)");
         return !Intrinsics.areEqual((Object)localizedUppercase, (Object)var10001) ? localizedUppercase : String.valueOf(Character.toTitleCase($this$titlecase));
      }
   }

   @NotNull
   public static final CharDirectionality getDirectionality(char $this$directionality) {
      return CharDirectionality.Companion.valueOf(Character.getDirectionality($this$directionality));
   }

   @InlineOnly
   private static final boolean isHighSurrogate(char $this$isHighSurrogate) {
      return Character.isHighSurrogate($this$isHighSurrogate);
   }

   @InlineOnly
   private static final boolean isLowSurrogate(char $this$isLowSurrogate) {
      return Character.isLowSurrogate($this$isLowSurrogate);
   }

   public static final int digitOf(char char, int radix) {
      return Character.digit(var0, radix);
   }

   @PublishedApi
   public static final int checkRadix(int radix) {
      if (!(2 <= radix ? radix < 37 : false)) {
         throw new IllegalArgumentException("radix " + radix + " was not in valid range " + new IntRange(2, 36));
      } else {
         return radix;
      }
   }

   public CharsKt__CharJVMKt() {
   }
}
