package kotlin.text;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.NotImplementedError;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class StringsKt__StringBuilderKt extends StringsKt__StringBuilderJVMKt {
   /** @deprecated */
   @Deprecated(
      message = "Use append(value: Any?) instead",
      replaceWith = @ReplaceWith(
   expression = "append(value = obj)",
   imports = {}
),
      level = DeprecationLevel.WARNING
   )
   @InlineOnly
   private static final StringBuilder append(StringBuilder $this$append, Object obj) {
      Intrinsics.checkNotNullParameter($this$append, "<this>");
      return $this$append.append(obj);
   }

   @InlineOnly
   private static final String buildString(Function1<? super StringBuilder, Unit> builderAction) {
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      StringBuilder var1 = new StringBuilder();
      builderAction.invoke(var1);
      return var1.toString();
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final String buildString(int capacity, Function1<? super StringBuilder, Unit> builderAction) {
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      StringBuilder var2 = new StringBuilder(capacity);
      builderAction.invoke(var2);
      return var2.toString();
   }

   @NotNull
   public static final StringBuilder append(@NotNull StringBuilder $this$append, @NotNull String... value) {
      Intrinsics.checkNotNullParameter($this$append, "<this>");
      Intrinsics.checkNotNullParameter(value, "value");
      int var2 = 0;

      for(int var3 = value.length; var2 < var3; ++var2) {
         String item = value[var2];
         $this$append.append(item);
      }

      return $this$append;
   }

   @NotNull
   public static final StringBuilder append(@NotNull StringBuilder $this$append, @NotNull Object... value) {
      Intrinsics.checkNotNullParameter($this$append, "<this>");
      Intrinsics.checkNotNullParameter(value, "value");
      int var2 = 0;

      for(int var3 = value.length; var2 < var3; ++var2) {
         Object item = value[var2];
         $this$append.append(item);
      }

      return $this$append;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use appendRange instead.",
      replaceWith = @ReplaceWith(
   expression = "this.appendRange(str, offset, offset + len)",
   imports = {}
),
      level = DeprecationLevel.ERROR
   )
   @InlineOnly
   private static final StringBuilder append(StringBuilder $this$append, char[] str, int offset, int len) {
      Intrinsics.checkNotNullParameter($this$append, "<this>");
      Intrinsics.checkNotNullParameter(str, "str");
      throw new NotImplementedError((String)null, 1, (DefaultConstructorMarker)null);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder appendLine(StringBuilder $this$appendLine) {
      Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
      return $this$appendLine.append('\n');
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder appendLine(StringBuilder $this$appendLine, CharSequence value) {
      Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
      return $this$appendLine.append(value).append('\n');
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder appendLine(StringBuilder $this$appendLine, String value) {
      Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
      return $this$appendLine.append(value).append('\n');
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder appendLine(StringBuilder $this$appendLine, Object value) {
      Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
      return $this$appendLine.append(value).append('\n');
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder appendLine(StringBuilder $this$appendLine, char[] value) {
      Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
      Intrinsics.checkNotNullParameter(value, "value");
      return $this$appendLine.append(value).append('\n');
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder appendLine(StringBuilder $this$appendLine, char value) {
      Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
      return $this$appendLine.append(value).append('\n');
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final StringBuilder appendLine(StringBuilder $this$appendLine, boolean value) {
      Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
      return $this$appendLine.append(value).append('\n');
   }

   public StringsKt__StringBuilderKt() {
   }
}
