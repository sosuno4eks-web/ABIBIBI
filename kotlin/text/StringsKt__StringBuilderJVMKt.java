package kotlin.text;

import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class StringsKt__StringBuilderJVMKt extends StringsKt__RegexExtensionsKt {
   @SinceKotlin(
      version = "1.9"
   )
   @InlineOnly
   private static final StringBuilder append(StringBuilder $this$append, byte value) {
      Intrinsics.checkNotNullParameter($this$append, "<this>");
      StringBuilder var10000 = $this$append.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.9"
   )
   @InlineOnly
   private static final StringBuilder append(StringBuilder $this$append, short value) {
      Intrinsics.checkNotNullParameter($this$append, "<this>");
      StringBuilder var10000 = $this$append.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.9"
   )
   @InlineOnly
   private static final StringBuilder insert(StringBuilder $this$insert, int index, byte value) {
      Intrinsics.checkNotNullParameter($this$insert, "<this>");
      StringBuilder var10000 = $this$insert.insert(index, value);
      Intrinsics.checkNotNullExpressionValue(var10000, "insert(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.9"
   )
   @InlineOnly
   private static final StringBuilder insert(StringBuilder $this$insert, int index, short value) {
      Intrinsics.checkNotNullParameter($this$insert, "<this>");
      StringBuilder var10000 = $this$insert.insert(index, value);
      Intrinsics.checkNotNullExpressionValue(var10000, "insert(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final StringBuilder clear(@NotNull StringBuilder $this$clear) {
      Intrinsics.checkNotNullParameter($this$clear, "<this>");
      int var3 = false;
      $this$clear.setLength(0);
      return $this$clear;
   }

   @InlineOnly
   private static final void set(StringBuilder $this$set, int index, char value) {
      Intrinsics.checkNotNullParameter($this$set, "<this>");
      $this$set.setCharAt(index, value);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder setRange(StringBuilder $this$setRange, int startIndex, int endIndex, String value) {
      Intrinsics.checkNotNullParameter($this$setRange, "<this>");
      Intrinsics.checkNotNullParameter(value, "value");
      StringBuilder var10000 = $this$setRange.replace(startIndex, endIndex, value);
      Intrinsics.checkNotNullExpressionValue(var10000, "replace(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder deleteAt(StringBuilder $this$deleteAt, int index) {
      Intrinsics.checkNotNullParameter($this$deleteAt, "<this>");
      StringBuilder var10000 = $this$deleteAt.deleteCharAt(index);
      Intrinsics.checkNotNullExpressionValue(var10000, "deleteCharAt(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder deleteRange(StringBuilder $this$deleteRange, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$deleteRange, "<this>");
      StringBuilder var10000 = $this$deleteRange.delete(startIndex, endIndex);
      Intrinsics.checkNotNullExpressionValue(var10000, "delete(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final void toCharArray(StringBuilder $this$toCharArray, char[] destination, int destinationOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$toCharArray, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      $this$toCharArray.getChars(startIndex, endIndex, destination, destinationOffset);
   }

   // $FF: synthetic method
   static void toCharArray$default(StringBuilder $this$toCharArray_u24default, char[] destination, int destinationOffset, int startIndex, int endIndex, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         destinationOffset = 0;
      }

      if ((var5 & 4) != 0) {
         startIndex = 0;
      }

      if ((var5 & 8) != 0) {
         endIndex = $this$toCharArray_u24default.length();
      }

      Intrinsics.checkNotNullParameter($this$toCharArray_u24default, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      $this$toCharArray_u24default.getChars(startIndex, endIndex, destination, destinationOffset);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder appendRange(StringBuilder $this$appendRange, char[] value, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$appendRange, "<this>");
      Intrinsics.checkNotNullParameter(value, "value");
      StringBuilder var10000 = $this$appendRange.append(value, startIndex, endIndex - startIndex);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder appendRange(StringBuilder $this$appendRange, CharSequence value, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$appendRange, "<this>");
      Intrinsics.checkNotNullParameter(value, "value");
      StringBuilder var10000 = $this$appendRange.append(value, startIndex, endIndex);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder insertRange(StringBuilder $this$insertRange, int index, char[] value, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$insertRange, "<this>");
      Intrinsics.checkNotNullParameter(value, "value");
      StringBuilder var10000 = $this$insertRange.insert(index, value, startIndex, endIndex - startIndex);
      Intrinsics.checkNotNullExpressionValue(var10000, "insert(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder insertRange(StringBuilder $this$insertRange, int index, CharSequence value, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$insertRange, "<this>");
      Intrinsics.checkNotNullParameter(value, "value");
      StringBuilder var10000 = $this$insertRange.insert(index, value, startIndex, endIndex);
      Intrinsics.checkNotNullExpressionValue(var10000, "insert(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder appendLine(StringBuilder $this$appendLine, StringBuffer value) {
      Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
      StringBuilder var10000 = $this$appendLine.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return var10000.append('\n');
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder appendLine(StringBuilder $this$appendLine, StringBuilder value) {
      Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
      StringBuilder var10000 = $this$appendLine.append((CharSequence)value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return var10000.append('\n');
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder appendLine(StringBuilder $this$appendLine, int value) {
      Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
      StringBuilder var10000 = $this$appendLine.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return var10000.append('\n');
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder appendLine(StringBuilder $this$appendLine, short value) {
      Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
      StringBuilder var10000 = $this$appendLine.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return var10000.append('\n');
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder appendLine(StringBuilder $this$appendLine, byte value) {
      Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
      StringBuilder var10000 = $this$appendLine.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return var10000.append('\n');
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder appendLine(StringBuilder $this$appendLine, long value) {
      Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
      StringBuilder var10000 = $this$appendLine.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return var10000.append('\n');
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder appendLine(StringBuilder $this$appendLine, float value) {
      Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
      StringBuilder var10000 = $this$appendLine.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return var10000.append('\n');
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder appendLine(StringBuilder $this$appendLine, double value) {
      Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
      StringBuilder var10000 = $this$appendLine.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return var10000.append('\n');
   }

   /** @deprecated */
   @Deprecated(
      message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.",
      replaceWith = @ReplaceWith(
   expression = "appendLine()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "2.1"
   )
   @NotNull
   public static final Appendable appendln(@NotNull Appendable $this$appendln) {
      Intrinsics.checkNotNullParameter($this$appendln, "<this>");
      Appendable var10000 = $this$appendln.append((CharSequence)SystemProperties.LINE_SEPARATOR);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return var10000;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.",
      replaceWith = @ReplaceWith(
   expression = "appendLine(value)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final Appendable appendln(Appendable $this$appendln, CharSequence value) {
      Intrinsics.checkNotNullParameter($this$appendln, "<this>");
      Appendable var10000 = $this$appendln.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return StringsKt.appendln(var10000);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.",
      replaceWith = @ReplaceWith(
   expression = "appendLine(value)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final Appendable appendln(Appendable $this$appendln, char value) {
      Intrinsics.checkNotNullParameter($this$appendln, "<this>");
      Appendable var10000 = $this$appendln.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return StringsKt.appendln(var10000);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.",
      replaceWith = @ReplaceWith(
   expression = "appendLine()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "2.1"
   )
   @NotNull
   public static final StringBuilder appendln(@NotNull StringBuilder $this$appendln) {
      Intrinsics.checkNotNullParameter($this$appendln, "<this>");
      StringBuilder var10000 = $this$appendln.append(SystemProperties.LINE_SEPARATOR);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return var10000;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.",
      replaceWith = @ReplaceWith(
   expression = "appendLine(value)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final StringBuilder appendln(StringBuilder $this$appendln, StringBuffer value) {
      Intrinsics.checkNotNullParameter($this$appendln, "<this>");
      StringBuilder var10000 = $this$appendln.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return StringsKt.appendln(var10000);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.",
      replaceWith = @ReplaceWith(
   expression = "appendLine(value)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final StringBuilder appendln(StringBuilder $this$appendln, CharSequence value) {
      Intrinsics.checkNotNullParameter($this$appendln, "<this>");
      StringBuilder var10000 = $this$appendln.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return StringsKt.appendln(var10000);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.",
      replaceWith = @ReplaceWith(
   expression = "appendLine(value)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final StringBuilder appendln(StringBuilder $this$appendln, String value) {
      Intrinsics.checkNotNullParameter($this$appendln, "<this>");
      StringBuilder var10000 = $this$appendln.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return StringsKt.appendln(var10000);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.",
      replaceWith = @ReplaceWith(
   expression = "appendLine(value)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final StringBuilder appendln(StringBuilder $this$appendln, Object value) {
      Intrinsics.checkNotNullParameter($this$appendln, "<this>");
      StringBuilder var10000 = $this$appendln.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return StringsKt.appendln(var10000);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.",
      replaceWith = @ReplaceWith(
   expression = "appendLine(value)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final StringBuilder appendln(StringBuilder $this$appendln, StringBuilder value) {
      Intrinsics.checkNotNullParameter($this$appendln, "<this>");
      StringBuilder var10000 = $this$appendln.append((CharSequence)value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return StringsKt.appendln(var10000);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.",
      replaceWith = @ReplaceWith(
   expression = "appendLine(value)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final StringBuilder appendln(StringBuilder $this$appendln, char[] value) {
      Intrinsics.checkNotNullParameter($this$appendln, "<this>");
      Intrinsics.checkNotNullParameter(value, "value");
      StringBuilder var10000 = $this$appendln.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return StringsKt.appendln(var10000);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.",
      replaceWith = @ReplaceWith(
   expression = "appendLine(value)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final StringBuilder appendln(StringBuilder $this$appendln, char value) {
      Intrinsics.checkNotNullParameter($this$appendln, "<this>");
      StringBuilder var10000 = $this$appendln.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return StringsKt.appendln(var10000);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.",
      replaceWith = @ReplaceWith(
   expression = "appendLine(value)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final StringBuilder appendln(StringBuilder $this$appendln, boolean value) {
      Intrinsics.checkNotNullParameter($this$appendln, "<this>");
      StringBuilder var10000 = $this$appendln.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return StringsKt.appendln(var10000);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.",
      replaceWith = @ReplaceWith(
   expression = "appendLine(value)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final StringBuilder appendln(StringBuilder $this$appendln, int value) {
      Intrinsics.checkNotNullParameter($this$appendln, "<this>");
      StringBuilder var10000 = $this$appendln.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return StringsKt.appendln(var10000);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.",
      replaceWith = @ReplaceWith(
   expression = "appendLine(value)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final StringBuilder appendln(StringBuilder $this$appendln, short value) {
      Intrinsics.checkNotNullParameter($this$appendln, "<this>");
      StringBuilder var10000 = $this$appendln.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return StringsKt.appendln(var10000);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.",
      replaceWith = @ReplaceWith(
   expression = "appendLine(value)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final StringBuilder appendln(StringBuilder $this$appendln, byte value) {
      Intrinsics.checkNotNullParameter($this$appendln, "<this>");
      StringBuilder var10000 = $this$appendln.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return StringsKt.appendln(var10000);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.",
      replaceWith = @ReplaceWith(
   expression = "appendLine(value)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final StringBuilder appendln(StringBuilder $this$appendln, long value) {
      Intrinsics.checkNotNullParameter($this$appendln, "<this>");
      StringBuilder var10000 = $this$appendln.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return StringsKt.appendln(var10000);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.",
      replaceWith = @ReplaceWith(
   expression = "appendLine(value)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final StringBuilder appendln(StringBuilder $this$appendln, float value) {
      Intrinsics.checkNotNullParameter($this$appendln, "<this>");
      StringBuilder var10000 = $this$appendln.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return StringsKt.appendln(var10000);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.",
      replaceWith = @ReplaceWith(
   expression = "appendLine(value)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final StringBuilder appendln(StringBuilder $this$appendln, double value) {
      Intrinsics.checkNotNullParameter($this$appendln, "<this>");
      StringBuilder var10000 = $this$appendln.append(value);
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return StringsKt.appendln(var10000);
   }

   public StringsKt__StringBuilderJVMKt() {
   }
}
