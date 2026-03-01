package kotlin.text;

import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

public final class Typography {
   @NotNull
   public static final Typography INSTANCE = new Typography();
   public static final char quote = '"';
   public static final char dollar = '$';
   public static final char amp = '&';
   public static final char less = '<';
   public static final char greater = '>';
   public static final char nbsp = ' ';
   public static final char times = '×';
   public static final char cent = '¢';
   public static final char pound = '£';
   public static final char section = '§';
   public static final char copyright = '©';
   public static final char leftGuillemet = '«';
   public static final char rightGuillemet = '»';
   public static final char registered = '®';
   public static final char degree = '°';
   public static final char plusMinus = '±';
   public static final char paragraph = '¶';
   public static final char middleDot = '·';
   public static final char half = '½';
   public static final char ndash = '–';
   public static final char mdash = '—';
   public static final char leftSingleQuote = '‘';
   public static final char rightSingleQuote = '’';
   public static final char lowSingleQuote = '‚';
   public static final char leftDoubleQuote = '“';
   public static final char rightDoubleQuote = '”';
   public static final char lowDoubleQuote = '„';
   public static final char dagger = '†';
   public static final char doubleDagger = '‡';
   public static final char bullet = '•';
   public static final char ellipsis = '…';
   public static final char prime = '′';
   public static final char doublePrime = '″';
   public static final char euro = '€';
   public static final char tm = '™';
   public static final char almostEqual = '≈';
   public static final char notEqual = '≠';
   public static final char lessOrEqual = '≤';
   public static final char greaterOrEqual = '≥';
   /** @deprecated */
   public static final char leftGuillemete = '«';
   /** @deprecated */
   public static final char rightGuillemete = '»';

   private Typography() {
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.6"
   )
   public static void getLeftGuillemet$annotations() {
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.6"
   )
   public static void getRightGuillemet$annotations() {
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "This constant has a typo in the name. Use leftGuillemet instead.",
      replaceWith = @ReplaceWith(
   expression = "Typography.leftGuillemet",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.6"
   )
   public static void getLeftGuillemete$annotations() {
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "This constant has a typo in the name. Use rightGuillemet instead.",
      replaceWith = @ReplaceWith(
   expression = "Typography.rightGuillemet",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.6"
   )
   public static void getRightGuillemete$annotations() {
   }
}
