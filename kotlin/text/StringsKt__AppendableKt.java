package kotlin.text;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class StringsKt__AppendableKt {
   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <T extends Appendable> T appendRange(@NotNull T $this$appendRange, @NotNull CharSequence value, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$appendRange, "<this>");
      Intrinsics.checkNotNullParameter(value, "value");
      Appendable var10000 = $this$appendRange.append(value, startIndex, endIndex);
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
      return var10000;
   }

   @NotNull
   public static final <T extends Appendable> T append(@NotNull T $this$append, @NotNull CharSequence... value) {
      Intrinsics.checkNotNullParameter($this$append, "<this>");
      Intrinsics.checkNotNullParameter(value, "value");
      int var2 = 0;

      for(int var3 = value.length; var2 < var3; ++var2) {
         CharSequence item = value[var2];
         $this$append.append(item);
      }

      return $this$append;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final Appendable appendLine(Appendable $this$appendLine) {
      Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
      return $this$appendLine.append('\n');
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final Appendable appendLine(Appendable $this$appendLine, CharSequence value) {
      Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
      return $this$appendLine.append(value).append('\n');
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final Appendable appendLine(Appendable $this$appendLine, char value) {
      Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
      return $this$appendLine.append(value).append('\n');
   }

   public static final <T> void appendElement(@NotNull Appendable $this$appendElement, T element, @Nullable Function1<? super T, ? extends CharSequence> transform) {
      Intrinsics.checkNotNullParameter($this$appendElement, "<this>");
      if (transform != null) {
         $this$appendElement.append((CharSequence)transform.invoke(element));
      } else if (element == null ? true : element instanceof CharSequence) {
         $this$appendElement.append((CharSequence)element);
      } else if (element instanceof Character) {
         $this$appendElement.append((Character)element);
      } else {
         $this$appendElement.append((CharSequence)element.toString());
      }

   }

   public StringsKt__AppendableKt() {
   }
}
