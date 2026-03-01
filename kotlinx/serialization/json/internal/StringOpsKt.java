package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class StringOpsKt {
   @NotNull
   private static final String[] ESCAPE_STRINGS;
   @NotNull
   private static final byte[] ESCAPE_MARKERS;

   private static final char toHexChar(int i) {
      int d = i & 15;
      return d < 10 ? (char)(d + 48) : (char)(d - 10 + 97);
   }

   @NotNull
   public static final String[] getESCAPE_STRINGS() {
      return ESCAPE_STRINGS;
   }

   /** @deprecated */
   // $FF: synthetic method
   @JsonFriendModuleApi
   public static void getESCAPE_STRINGS$annotations() {
   }

   @NotNull
   public static final byte[] getESCAPE_MARKERS() {
      return ESCAPE_MARKERS;
   }

   public static final void printQuoted(@NotNull StringBuilder $this$printQuoted, @NotNull String value) {
      Intrinsics.checkNotNullParameter($this$printQuoted, "<this>");
      Intrinsics.checkNotNullParameter(value, "value");
      $this$printQuoted.append('"');
      int lastPos = 0;
      int i = 0;

      for(int var4 = ((CharSequence)value).length(); i < var4; ++i) {
         int c = value.charAt(i);
         if (c < ESCAPE_STRINGS.length && ESCAPE_STRINGS[c] != null) {
            $this$printQuoted.append((CharSequence)value, lastPos, i);
            $this$printQuoted.append(ESCAPE_STRINGS[c]);
            lastPos = i + 1;
         }
      }

      if (lastPos != 0) {
         $this$printQuoted.append((CharSequence)value, lastPos, value.length());
      } else {
         $this$printQuoted.append(value);
      }

      $this$printQuoted.append('"');
   }

   @Nullable
   public static final Boolean toBooleanStrictOrNull(@NotNull String $this$toBooleanStrictOrNull) {
      Intrinsics.checkNotNullParameter($this$toBooleanStrictOrNull, "<this>");
      return StringsKt.equals($this$toBooleanStrictOrNull, "true", true) ? true : (StringsKt.equals($this$toBooleanStrictOrNull, "false", true) ? false : null);
   }

   static {
      String[] var0 = new String[93];
      String[] $this$ESCAPE_STRINGS_u24lambda_u240 = var0;
      int var2 = false;

      int c;
      for(c = 0; c < 32; ++c) {
         char c1 = toHexChar(c >> 12);
         char c2 = toHexChar(c >> 8);
         char c3 = toHexChar(c >> 4);
         char c4 = toHexChar(c);
         $this$ESCAPE_STRINGS_u24lambda_u240[c] = "\\u" + c1 + c2 + c3 + c4;
      }

      $this$ESCAPE_STRINGS_u24lambda_u240[34] = "\\\"";
      $this$ESCAPE_STRINGS_u24lambda_u240[92] = "\\\\";
      $this$ESCAPE_STRINGS_u24lambda_u240[9] = "\\t";
      $this$ESCAPE_STRINGS_u24lambda_u240[8] = "\\b";
      $this$ESCAPE_STRINGS_u24lambda_u240[10] = "\\n";
      $this$ESCAPE_STRINGS_u24lambda_u240[13] = "\\r";
      $this$ESCAPE_STRINGS_u24lambda_u240[12] = "\\f";
      ESCAPE_STRINGS = var0;
      byte[] var8 = new byte[93];
      byte[] $this$ESCAPE_MARKERS_u24lambda_u241 = var8;
      var2 = false;

      for(c = 0; c < 32; ++c) {
         $this$ESCAPE_MARKERS_u24lambda_u241[c] = 1;
      }

      $this$ESCAPE_MARKERS_u24lambda_u241[34] = 34;
      $this$ESCAPE_MARKERS_u24lambda_u241[92] = 92;
      $this$ESCAPE_MARKERS_u24lambda_u241[9] = 116;
      $this$ESCAPE_MARKERS_u24lambda_u241[8] = 98;
      $this$ESCAPE_MARKERS_u24lambda_u241[10] = 110;
      $this$ESCAPE_MARKERS_u24lambda_u241[13] = 114;
      $this$ESCAPE_MARKERS_u24lambda_u241[12] = 102;
      ESCAPE_MARKERS = var8;
   }
}
