package kotlin.text;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.internal.InlineOnly;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class StringsKt__StringsJVMKt extends StringsKt__StringNumberConversionsKt {
   @InlineOnly
   private static final int nativeIndexOf(String $this$nativeIndexOf, char ch, int fromIndex) {
      Intrinsics.checkNotNullParameter($this$nativeIndexOf, "<this>");
      return $this$nativeIndexOf.indexOf(ch, fromIndex);
   }

   @InlineOnly
   private static final int nativeIndexOf(String $this$nativeIndexOf, String str, int fromIndex) {
      Intrinsics.checkNotNullParameter($this$nativeIndexOf, "<this>");
      Intrinsics.checkNotNullParameter(str, "str");
      return $this$nativeIndexOf.indexOf(str, fromIndex);
   }

   @InlineOnly
   private static final int nativeLastIndexOf(String $this$nativeLastIndexOf, char ch, int fromIndex) {
      Intrinsics.checkNotNullParameter($this$nativeLastIndexOf, "<this>");
      return $this$nativeLastIndexOf.lastIndexOf(ch, fromIndex);
   }

   @InlineOnly
   private static final int nativeLastIndexOf(String $this$nativeLastIndexOf, String str, int fromIndex) {
      Intrinsics.checkNotNullParameter($this$nativeLastIndexOf, "<this>");
      Intrinsics.checkNotNullParameter(str, "str");
      return $this$nativeLastIndexOf.lastIndexOf(str, fromIndex);
   }

   public static final boolean equals(@Nullable String $this$equals, @Nullable String other, boolean ignoreCase) {
      if ($this$equals == null) {
         return other == null;
      } else {
         return !ignoreCase ? $this$equals.equals(other) : $this$equals.equalsIgnoreCase(other);
      }
   }

   // $FF: synthetic method
   public static boolean equals$default(String var0, String var1, boolean var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = false;
      }

      return StringsKt.equals(var0, var1, var2);
   }

   @NotNull
   public static final String replace(@NotNull String $this$replace, char oldChar, char newChar, boolean ignoreCase) {
      Intrinsics.checkNotNullParameter($this$replace, "<this>");
      if (!ignoreCase) {
         String var10000 = $this$replace.replace(oldChar, newChar);
         Intrinsics.checkNotNullExpressionValue(var10000, "replace(...)");
         return var10000;
      } else {
         int var4 = $this$replace.length();
         StringBuilder var5 = new StringBuilder(var4);
         StringBuilder $this$replace_u24lambda_u241 = var5;
         int var7 = false;
         CharSequence $this$forEach$iv = (CharSequence)$this$replace;
         int $i$f$forEach = false;

         for(int var10 = 0; var10 < $this$forEach$iv.length(); ++var10) {
            char element$iv = $this$forEach$iv.charAt(var10);
            int var13 = false;
            $this$replace_u24lambda_u241.append(CharsKt.equals(element$iv, oldChar, ignoreCase) ? newChar : element$iv);
         }

         return var5.toString();
      }
   }

   // $FF: synthetic method
   public static String replace$default(String var0, char var1, char var2, boolean var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = false;
      }

      return StringsKt.replace(var0, var1, var2, var3);
   }

   @NotNull
   public static final String replace(@NotNull String $this$replace, @NotNull String oldValue, @NotNull String newValue, boolean ignoreCase) {
      Intrinsics.checkNotNullParameter($this$replace, "<this>");
      Intrinsics.checkNotNullParameter(oldValue, "oldValue");
      Intrinsics.checkNotNullParameter(newValue, "newValue");
      String $this$replace_u24lambda_u242 = $this$replace;
      int var5 = false;
      int occurrenceIndex = StringsKt.indexOf((CharSequence)$this$replace, oldValue, 0, ignoreCase);
      if (occurrenceIndex < 0) {
         return $this$replace;
      } else {
         int oldValueLength = oldValue.length();
         int searchStep = RangesKt.coerceAtLeast(oldValueLength, 1);
         int newLengthHint = $this$replace.length() - oldValueLength + newValue.length();
         if (newLengthHint < 0) {
            throw new OutOfMemoryError();
         } else {
            StringBuilder stringBuilder = new StringBuilder(newLengthHint);
            int i = 0;

            do {
               stringBuilder.append((CharSequence)$this$replace_u24lambda_u242, i, occurrenceIndex).append(newValue);
               i = occurrenceIndex + oldValueLength;
               if (occurrenceIndex >= $this$replace_u24lambda_u242.length()) {
                  break;
               }

               occurrenceIndex = StringsKt.indexOf((CharSequence)$this$replace_u24lambda_u242, oldValue, occurrenceIndex + searchStep, ignoreCase);
            } while(occurrenceIndex > 0);

            String var10000 = stringBuilder.append((CharSequence)$this$replace_u24lambda_u242, i, $this$replace_u24lambda_u242.length()).toString();
            Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
            return var10000;
         }
      }
   }

   // $FF: synthetic method
   public static String replace$default(String var0, String var1, String var2, boolean var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = false;
      }

      return StringsKt.replace(var0, var1, var2, var3);
   }

   @NotNull
   public static final String replaceFirst(@NotNull String $this$replaceFirst, char oldChar, char newChar, boolean ignoreCase) {
      Intrinsics.checkNotNullParameter($this$replaceFirst, "<this>");
      int index = StringsKt.indexOf$default((CharSequence)$this$replaceFirst, oldChar, 0, ignoreCase, 2, (Object)null);
      String var10000;
      if (index < 0) {
         var10000 = $this$replaceFirst;
      } else {
         int var6 = index + 1;
         CharSequence var7 = (CharSequence)String.valueOf(newChar);
         var10000 = StringsKt.replaceRange((CharSequence)$this$replaceFirst, index, var6, var7).toString();
      }

      return var10000;
   }

   // $FF: synthetic method
   public static String replaceFirst$default(String var0, char var1, char var2, boolean var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = false;
      }

      return StringsKt.replaceFirst(var0, var1, var2, var3);
   }

   @NotNull
   public static final String replaceFirst(@NotNull String $this$replaceFirst, @NotNull String oldValue, @NotNull String newValue, boolean ignoreCase) {
      Intrinsics.checkNotNullParameter($this$replaceFirst, "<this>");
      Intrinsics.checkNotNullParameter(oldValue, "oldValue");
      Intrinsics.checkNotNullParameter(newValue, "newValue");
      int index = StringsKt.indexOf$default((CharSequence)$this$replaceFirst, oldValue, 0, ignoreCase, 2, (Object)null);
      String var10000;
      if (index < 0) {
         var10000 = $this$replaceFirst;
      } else {
         int var6 = index + oldValue.length();
         var10000 = StringsKt.replaceRange((CharSequence)$this$replaceFirst, index, var6, (CharSequence)newValue).toString();
      }

      return var10000;
   }

   // $FF: synthetic method
   public static String replaceFirst$default(String var0, String var1, String var2, boolean var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = false;
      }

      return StringsKt.replaceFirst(var0, var1, var2, var3);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use uppercase() instead.",
      replaceWith = @ReplaceWith(
   expression = "uppercase(Locale.getDefault())",
   imports = {"java.util.Locale"}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final String toUpperCase(String $this$toUpperCase) {
      Intrinsics.checkNotNullParameter($this$toUpperCase, "<this>");
      String var10000 = $this$toUpperCase.toUpperCase();
      Intrinsics.checkNotNullExpressionValue(var10000, "toUpperCase(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final String uppercase(String $this$uppercase) {
      Intrinsics.checkNotNullParameter($this$uppercase, "<this>");
      String var10000 = $this$uppercase.toUpperCase(Locale.ROOT);
      Intrinsics.checkNotNullExpressionValue(var10000, "toUpperCase(...)");
      return var10000;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use lowercase() instead.",
      replaceWith = @ReplaceWith(
   expression = "lowercase(Locale.getDefault())",
   imports = {"java.util.Locale"}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final String toLowerCase(String $this$toLowerCase) {
      Intrinsics.checkNotNullParameter($this$toLowerCase, "<this>");
      String var10000 = $this$toLowerCase.toLowerCase();
      Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final String lowercase(String $this$lowercase) {
      Intrinsics.checkNotNullParameter($this$lowercase, "<this>");
      String var10000 = $this$lowercase.toLowerCase(Locale.ROOT);
      Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final String concatToString(@NotNull char[] $this$concatToString) {
      Intrinsics.checkNotNullParameter($this$concatToString, "<this>");
      return new String($this$concatToString);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final String concatToString(@NotNull char[] $this$concatToString, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$concatToString, "<this>");
      AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$concatToString.length);
      return new String($this$concatToString, startIndex, endIndex - startIndex);
   }

   // $FF: synthetic method
   public static String concatToString$default(char[] var0, int var1, int var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = 0;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.length;
      }

      return StringsKt.concatToString(var0, var1, var2);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final char[] toCharArray(@NotNull String $this$toCharArray, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$toCharArray, "<this>");
      AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$toCharArray.length());
      char[] var4 = new char[endIndex - startIndex];
      byte var5 = 0;
      $this$toCharArray.getChars(startIndex, endIndex, var4, var5);
      return var4;
   }

   // $FF: synthetic method
   public static char[] toCharArray$default(String var0, int var1, int var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = 0;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.length();
      }

      return StringsKt.toCharArray(var0, var1, var2);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final String decodeToString(@NotNull byte[] $this$decodeToString) {
      Intrinsics.checkNotNullParameter($this$decodeToString, "<this>");
      return new String($this$decodeToString, Charsets.UTF_8);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final String decodeToString(@NotNull byte[] $this$decodeToString, int startIndex, int endIndex, boolean throwOnInvalidSequence) {
      Intrinsics.checkNotNullParameter($this$decodeToString, "<this>");
      AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$decodeToString.length);
      if (!throwOnInvalidSequence) {
         return new String($this$decodeToString, startIndex, endIndex - startIndex, Charsets.UTF_8);
      } else {
         CharsetDecoder decoder = Charsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
         String var10000 = decoder.decode(ByteBuffer.wrap($this$decodeToString, startIndex, endIndex - startIndex)).toString();
         Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
         return var10000;
      }
   }

   // $FF: synthetic method
   public static String decodeToString$default(byte[] var0, int var1, int var2, boolean var3, int var4, Object var5) {
      if ((var4 & 1) != 0) {
         var1 = 0;
      }

      if ((var4 & 2) != 0) {
         var2 = var0.length;
      }

      if ((var4 & 4) != 0) {
         var3 = false;
      }

      return StringsKt.decodeToString(var0, var1, var2, var3);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final byte[] encodeToByteArray(@NotNull String $this$encodeToByteArray) {
      Intrinsics.checkNotNullParameter($this$encodeToByteArray, "<this>");
      byte[] var10000 = $this$encodeToByteArray.getBytes(Charsets.UTF_8);
      Intrinsics.checkNotNullExpressionValue(var10000, "getBytes(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final byte[] encodeToByteArray(@NotNull String $this$encodeToByteArray, int startIndex, int endIndex, boolean throwOnInvalidSequence) {
      Intrinsics.checkNotNullParameter($this$encodeToByteArray, "<this>");
      AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$encodeToByteArray.length());
      byte[] var11;
      if (!throwOnInvalidSequence) {
         String var12 = $this$encodeToByteArray.substring(startIndex, endIndex);
         Intrinsics.checkNotNullExpressionValue(var12, "substring(...)");
         String var9 = var12;
         Charset var10 = Charsets.UTF_8;
         Intrinsics.checkNotNull(var9, "null cannot be cast to non-null type java.lang.String");
         var11 = var9.getBytes(var10);
         Intrinsics.checkNotNullExpressionValue(var11, "getBytes(...)");
         return var11;
      } else {
         CharsetEncoder encoder = Charsets.UTF_8.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
         ByteBuffer byteBuffer = encoder.encode(CharBuffer.wrap((CharSequence)$this$encodeToByteArray, startIndex, endIndex));
         byte[] var6;
         if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            int var10000 = byteBuffer.remaining();
            byte[] var10001 = byteBuffer.array();
            Intrinsics.checkNotNull(var10001);
            if (var10000 == var10001.length) {
               var6 = byteBuffer.array();
               Intrinsics.checkNotNull(var6);
               var11 = var6;
               return var11;
            }
         }

         var6 = new byte[byteBuffer.remaining()];
         int var8 = false;
         byteBuffer.get(var6);
         var11 = var6;
         return var11;
      }
   }

   // $FF: synthetic method
   public static byte[] encodeToByteArray$default(String var0, int var1, int var2, boolean var3, int var4, Object var5) {
      if ((var4 & 1) != 0) {
         var1 = 0;
      }

      if ((var4 & 2) != 0) {
         var2 = var0.length();
      }

      if ((var4 & 4) != 0) {
         var3 = false;
      }

      return StringsKt.encodeToByteArray(var0, var1, var2, var3);
   }

   @InlineOnly
   private static final char[] toCharArray(String $this$toCharArray) {
      Intrinsics.checkNotNullParameter($this$toCharArray, "<this>");
      char[] var10000 = $this$toCharArray.toCharArray();
      Intrinsics.checkNotNullExpressionValue(var10000, "toCharArray(...)");
      return var10000;
   }

   @InlineOnly
   private static final char[] toCharArray(String $this$toCharArray, char[] destination, int destinationOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$toCharArray, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      $this$toCharArray.getChars(startIndex, endIndex, destination, destinationOffset);
      return destination;
   }

   // $FF: synthetic method
   static char[] toCharArray$default(String $this$toCharArray_u24default, char[] destination, int destinationOffset, int startIndex, int endIndex, int var5, Object var6) {
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
      return destination;
   }

   @InlineOnly
   private static final String format(String $this$format, Object... args) {
      Intrinsics.checkNotNullParameter($this$format, "<this>");
      Intrinsics.checkNotNullParameter(args, "args");
      String var10000 = String.format($this$format, Arrays.copyOf(args, args.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "format(...)");
      return var10000;
   }

   @InlineOnly
   private static final String format(StringCompanionObject $this$format, String format, Object... args) {
      Intrinsics.checkNotNullParameter($this$format, "<this>");
      Intrinsics.checkNotNullParameter(format, "format");
      Intrinsics.checkNotNullParameter(args, "args");
      String var10000 = String.format(format, Arrays.copyOf(args, args.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "format(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final String format(String $this$format, Locale locale, Object... args) {
      Intrinsics.checkNotNullParameter($this$format, "<this>");
      Intrinsics.checkNotNullParameter(args, "args");
      String var10000 = String.format(locale, $this$format, Arrays.copyOf(args, args.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "format(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final String format(StringCompanionObject $this$format, Locale locale, String format, Object... args) {
      Intrinsics.checkNotNullParameter($this$format, "<this>");
      Intrinsics.checkNotNullParameter(format, "format");
      Intrinsics.checkNotNullParameter(args, "args");
      String var10000 = String.format(locale, format, Arrays.copyOf(args, args.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "format(...)");
      return var10000;
   }

   @NotNull
   public static final List<String> split(@NotNull CharSequence $this$split, @NotNull Pattern regex, int limit) {
      Intrinsics.checkNotNullParameter($this$split, "<this>");
      Intrinsics.checkNotNullParameter(regex, "regex");
      StringsKt.requireNonNegativeLimit(limit);
      String[] var10000 = regex.split($this$split, limit == 0 ? -1 : limit);
      Intrinsics.checkNotNullExpressionValue(var10000, "split(...)");
      return ArraysKt.asList((Object[])var10000);
   }

   // $FF: synthetic method
   public static List split$default(CharSequence var0, Pattern var1, int var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = 0;
      }

      return StringsKt.split(var0, var1, var2);
   }

   @InlineOnly
   private static final String substring(String $this$substring, int startIndex) {
      Intrinsics.checkNotNullParameter($this$substring, "<this>");
      String var10000 = $this$substring.substring(startIndex);
      Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
      return var10000;
   }

   @InlineOnly
   private static final String substring(String $this$substring, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$substring, "<this>");
      String var10000 = $this$substring.substring(startIndex, endIndex);
      Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
      return var10000;
   }

   public static final boolean startsWith(@NotNull String $this$startsWith, @NotNull String prefix, boolean ignoreCase) {
      Intrinsics.checkNotNullParameter($this$startsWith, "<this>");
      Intrinsics.checkNotNullParameter(prefix, "prefix");
      return !ignoreCase ? $this$startsWith.startsWith(prefix) : StringsKt.regionMatches($this$startsWith, 0, prefix, 0, prefix.length(), ignoreCase);
   }

   // $FF: synthetic method
   public static boolean startsWith$default(String var0, String var1, boolean var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = false;
      }

      return StringsKt.startsWith(var0, var1, var2);
   }

   public static final boolean startsWith(@NotNull String $this$startsWith, @NotNull String prefix, int startIndex, boolean ignoreCase) {
      Intrinsics.checkNotNullParameter($this$startsWith, "<this>");
      Intrinsics.checkNotNullParameter(prefix, "prefix");
      return !ignoreCase ? $this$startsWith.startsWith(prefix, startIndex) : StringsKt.regionMatches($this$startsWith, startIndex, prefix, 0, prefix.length(), ignoreCase);
   }

   // $FF: synthetic method
   public static boolean startsWith$default(String var0, String var1, int var2, boolean var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = false;
      }

      return StringsKt.startsWith(var0, var1, var2, var3);
   }

   public static final boolean endsWith(@NotNull String $this$endsWith, @NotNull String suffix, boolean ignoreCase) {
      Intrinsics.checkNotNullParameter($this$endsWith, "<this>");
      Intrinsics.checkNotNullParameter(suffix, "suffix");
      return !ignoreCase ? $this$endsWith.endsWith(suffix) : StringsKt.regionMatches($this$endsWith, $this$endsWith.length() - suffix.length(), suffix, 0, suffix.length(), true);
   }

   // $FF: synthetic method
   public static boolean endsWith$default(String var0, String var1, boolean var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = false;
      }

      return StringsKt.endsWith(var0, var1, var2);
   }

   @InlineOnly
   private static final String String(byte[] bytes, int offset, int length, Charset charset) {
      Intrinsics.checkNotNullParameter(bytes, "bytes");
      Intrinsics.checkNotNullParameter(charset, "charset");
      return new String(bytes, offset, length, charset);
   }

   @InlineOnly
   private static final String String(byte[] bytes, Charset charset) {
      Intrinsics.checkNotNullParameter(bytes, "bytes");
      Intrinsics.checkNotNullParameter(charset, "charset");
      return new String(bytes, charset);
   }

   @InlineOnly
   private static final String String(byte[] bytes, int offset, int length) {
      Intrinsics.checkNotNullParameter(bytes, "bytes");
      return new String(bytes, offset, length, Charsets.UTF_8);
   }

   @InlineOnly
   private static final String String(byte[] bytes) {
      Intrinsics.checkNotNullParameter(bytes, "bytes");
      return new String(bytes, Charsets.UTF_8);
   }

   @InlineOnly
   private static final String String(char[] chars) {
      Intrinsics.checkNotNullParameter(chars, "chars");
      return new String(chars);
   }

   @InlineOnly
   private static final String String(char[] chars, int offset, int length) {
      Intrinsics.checkNotNullParameter(chars, "chars");
      return new String(chars, offset, length);
   }

   @InlineOnly
   private static final String String(int[] codePoints, int offset, int length) {
      Intrinsics.checkNotNullParameter(codePoints, "codePoints");
      return new String(codePoints, offset, length);
   }

   @InlineOnly
   private static final String String(StringBuffer stringBuffer) {
      Intrinsics.checkNotNullParameter(stringBuffer, "stringBuffer");
      return new String(stringBuffer);
   }

   @InlineOnly
   private static final String String(StringBuilder stringBuilder) {
      Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
      return new String(stringBuilder);
   }

   @InlineOnly
   private static final int codePointAt(String $this$codePointAt, int index) {
      Intrinsics.checkNotNullParameter($this$codePointAt, "<this>");
      return $this$codePointAt.codePointAt(index);
   }

   @InlineOnly
   private static final int codePointBefore(String $this$codePointBefore, int index) {
      Intrinsics.checkNotNullParameter($this$codePointBefore, "<this>");
      return $this$codePointBefore.codePointBefore(index);
   }

   @InlineOnly
   private static final int codePointCount(String $this$codePointCount, int beginIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$codePointCount, "<this>");
      return $this$codePointCount.codePointCount(beginIndex, endIndex);
   }

   public static final int compareTo(@NotNull String $this$compareTo, @NotNull String other, boolean ignoreCase) {
      Intrinsics.checkNotNullParameter($this$compareTo, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      return ignoreCase ? $this$compareTo.compareToIgnoreCase(other) : $this$compareTo.compareTo(other);
   }

   // $FF: synthetic method
   public static int compareTo$default(String var0, String var1, boolean var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = false;
      }

      return StringsKt.compareTo(var0, var1, var2);
   }

   @InlineOnly
   private static final boolean contentEquals(String $this$contentEquals, CharSequence charSequence) {
      Intrinsics.checkNotNullParameter($this$contentEquals, "<this>");
      Intrinsics.checkNotNullParameter(charSequence, "charSequence");
      return $this$contentEquals.contentEquals(charSequence);
   }

   @InlineOnly
   private static final boolean contentEquals(String $this$contentEquals, StringBuffer stringBuilder) {
      Intrinsics.checkNotNullParameter($this$contentEquals, "<this>");
      Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
      return $this$contentEquals.contentEquals(stringBuilder);
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final boolean contentEquals(@Nullable CharSequence $this$contentEquals, @Nullable CharSequence other) {
      return $this$contentEquals instanceof String && other != null ? ((String)$this$contentEquals).contentEquals(other) : StringsKt.contentEqualsImpl($this$contentEquals, other);
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final boolean contentEquals(@Nullable CharSequence $this$contentEquals, @Nullable CharSequence other, boolean ignoreCase) {
      return ignoreCase ? StringsKt.contentEqualsIgnoreCaseImpl($this$contentEquals, other) : StringsKt.contentEquals($this$contentEquals, other);
   }

   @InlineOnly
   private static final String intern(String $this$intern) {
      Intrinsics.checkNotNullParameter($this$intern, "<this>");
      String var10000 = $this$intern.intern();
      Intrinsics.checkNotNullExpressionValue(var10000, "intern(...)");
      return var10000;
   }

   @InlineOnly
   private static final int offsetByCodePoints(String $this$offsetByCodePoints, int index, int codePointOffset) {
      Intrinsics.checkNotNullParameter($this$offsetByCodePoints, "<this>");
      return $this$offsetByCodePoints.offsetByCodePoints(index, codePointOffset);
   }

   public static final boolean regionMatches(@NotNull CharSequence $this$regionMatches, int thisOffset, @NotNull CharSequence other, int otherOffset, int length, boolean ignoreCase) {
      Intrinsics.checkNotNullParameter($this$regionMatches, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      return $this$regionMatches instanceof String && other instanceof String ? StringsKt.regionMatches((String)$this$regionMatches, thisOffset, (String)other, otherOffset, length, ignoreCase) : StringsKt.regionMatchesImpl($this$regionMatches, thisOffset, other, otherOffset, length, ignoreCase);
   }

   // $FF: synthetic method
   public static boolean regionMatches$default(CharSequence var0, int var1, CharSequence var2, int var3, int var4, boolean var5, int var6, Object var7) {
      if ((var6 & 16) != 0) {
         var5 = false;
      }

      return StringsKt.regionMatches(var0, var1, var2, var3, var4, var5);
   }

   public static final boolean regionMatches(@NotNull String $this$regionMatches, int thisOffset, @NotNull String other, int otherOffset, int length, boolean ignoreCase) {
      Intrinsics.checkNotNullParameter($this$regionMatches, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      return !ignoreCase ? $this$regionMatches.regionMatches(thisOffset, other, otherOffset, length) : $this$regionMatches.regionMatches(ignoreCase, thisOffset, other, otherOffset, length);
   }

   // $FF: synthetic method
   public static boolean regionMatches$default(String var0, int var1, String var2, int var3, int var4, boolean var5, int var6, Object var7) {
      if ((var6 & 16) != 0) {
         var5 = false;
      }

      return StringsKt.regionMatches(var0, var1, var2, var3, var4, var5);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use lowercase() instead.",
      replaceWith = @ReplaceWith(
   expression = "lowercase(locale)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final String toLowerCase(String $this$toLowerCase, Locale locale) {
      Intrinsics.checkNotNullParameter($this$toLowerCase, "<this>");
      Intrinsics.checkNotNullParameter(locale, "locale");
      String var10000 = $this$toLowerCase.toLowerCase(locale);
      Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final String lowercase(String $this$lowercase, Locale locale) {
      Intrinsics.checkNotNullParameter($this$lowercase, "<this>");
      Intrinsics.checkNotNullParameter(locale, "locale");
      String var10000 = $this$lowercase.toLowerCase(locale);
      Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
      return var10000;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use uppercase() instead.",
      replaceWith = @ReplaceWith(
   expression = "uppercase(locale)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5",
      errorSince = "2.1"
   )
   @InlineOnly
   private static final String toUpperCase(String $this$toUpperCase, Locale locale) {
      Intrinsics.checkNotNullParameter($this$toUpperCase, "<this>");
      Intrinsics.checkNotNullParameter(locale, "locale");
      String var10000 = $this$toUpperCase.toUpperCase(locale);
      Intrinsics.checkNotNullExpressionValue(var10000, "toUpperCase(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final String uppercase(String $this$uppercase, Locale locale) {
      Intrinsics.checkNotNullParameter($this$uppercase, "<this>");
      Intrinsics.checkNotNullParameter(locale, "locale");
      String var10000 = $this$uppercase.toUpperCase(locale);
      Intrinsics.checkNotNullExpressionValue(var10000, "toUpperCase(...)");
      return var10000;
   }

   @InlineOnly
   private static final byte[] toByteArray(String $this$toByteArray, Charset charset) {
      Intrinsics.checkNotNullParameter($this$toByteArray, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      byte[] var10000 = $this$toByteArray.getBytes(charset);
      Intrinsics.checkNotNullExpressionValue(var10000, "getBytes(...)");
      return var10000;
   }

   // $FF: synthetic method
   static byte[] toByteArray$default(String $this$toByteArray_u24default, Charset charset, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         charset = Charsets.UTF_8;
      }

      Intrinsics.checkNotNullParameter($this$toByteArray_u24default, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      byte[] var10000 = $this$toByteArray_u24default.getBytes(charset);
      Intrinsics.checkNotNullExpressionValue(var10000, "getBytes(...)");
      return var10000;
   }

   @InlineOnly
   private static final Pattern toPattern(String $this$toPattern, int flags) {
      Intrinsics.checkNotNullParameter($this$toPattern, "<this>");
      Pattern var10000 = Pattern.compile($this$toPattern, flags);
      Intrinsics.checkNotNullExpressionValue(var10000, "compile(...)");
      return var10000;
   }

   // $FF: synthetic method
   static Pattern toPattern$default(String $this$toPattern_u24default, int flags, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         flags = 0;
      }

      Intrinsics.checkNotNullParameter($this$toPattern_u24default, "<this>");
      Pattern var10000 = Pattern.compile($this$toPattern_u24default, flags);
      Intrinsics.checkNotNullExpressionValue(var10000, "compile(...)");
      return var10000;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use replaceFirstChar instead.",
      replaceWith = @ReplaceWith(
   expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }",
   imports = {"java.util.Locale"}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5"
   )
   @NotNull
   public static final String capitalize(@NotNull String $this$capitalize) {
      Intrinsics.checkNotNullParameter($this$capitalize, "<this>");
      Locale var10001 = Locale.getDefault();
      Intrinsics.checkNotNullExpressionValue(var10001, "getDefault(...)");
      return StringsKt.capitalize($this$capitalize, var10001);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use replaceFirstChar instead.",
      replaceWith = @ReplaceWith(
   expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5"
   )
   @SinceKotlin(
      version = "1.4"
   )
   @LowPriorityInOverloadResolution
   @NotNull
   public static final String capitalize(@NotNull String $this$capitalize, @NotNull Locale locale) {
      Intrinsics.checkNotNullParameter($this$capitalize, "<this>");
      Intrinsics.checkNotNullParameter(locale, "locale");
      if (((CharSequence)$this$capitalize).length() > 0) {
         char firstChar = $this$capitalize.charAt(0);
         if (Character.isLowerCase(firstChar)) {
            StringBuilder var3 = new StringBuilder();
            int var5 = false;
            char titleChar = Character.toTitleCase(firstChar);
            String var10001;
            byte var8;
            if (titleChar != Character.toUpperCase(firstChar)) {
               var3.append(titleChar);
            } else {
               var8 = 0;
               byte var9 = 1;
               var10001 = $this$capitalize.substring(var8, var9);
               Intrinsics.checkNotNullExpressionValue(var10001, "substring(...)");
               String var7 = var10001;
               Intrinsics.checkNotNull(var7, "null cannot be cast to non-null type java.lang.String");
               var10001 = var7.toUpperCase(locale);
               Intrinsics.checkNotNullExpressionValue(var10001, "toUpperCase(...)");
               var3.append(var10001);
            }

            var8 = 1;
            var10001 = $this$capitalize.substring(var8);
            Intrinsics.checkNotNullExpressionValue(var10001, "substring(...)");
            var3.append(var10001);
            return var3.toString();
         }
      }

      return $this$capitalize;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use replaceFirstChar instead.",
      replaceWith = @ReplaceWith(
   expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }",
   imports = {"java.util.Locale"}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5"
   )
   @NotNull
   public static final String decapitalize(@NotNull String $this$decapitalize) {
      Intrinsics.checkNotNullParameter($this$decapitalize, "<this>");
      String var10000;
      if (((CharSequence)$this$decapitalize).length() > 0 && !Character.isLowerCase($this$decapitalize.charAt(0))) {
         StringBuilder var5 = new StringBuilder();
         byte var2 = 0;
         byte var3 = 1;
         String var10001 = $this$decapitalize.substring(var2, var3);
         Intrinsics.checkNotNullExpressionValue(var10001, "substring(...)");
         String var1 = var10001;
         Locale var6 = Locale.getDefault();
         Intrinsics.checkNotNullExpressionValue(var6, "getDefault(...)");
         Locale var4 = var6;
         Intrinsics.checkNotNull(var1, "null cannot be cast to non-null type java.lang.String");
         var10001 = var1.toLowerCase(var4);
         Intrinsics.checkNotNullExpressionValue(var10001, "toLowerCase(...)");
         var5 = var5.append(var10001);
         var2 = 1;
         var10001 = $this$decapitalize.substring(var2);
         Intrinsics.checkNotNullExpressionValue(var10001, "substring(...)");
         var10000 = var5.append(var10001).toString();
      } else {
         var10000 = $this$decapitalize;
      }

      return var10000;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use replaceFirstChar instead.",
      replaceWith = @ReplaceWith(
   expression = "replaceFirstChar { it.lowercase(locale) }",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5"
   )
   @SinceKotlin(
      version = "1.4"
   )
   @LowPriorityInOverloadResolution
   @NotNull
   public static final String decapitalize(@NotNull String $this$decapitalize, @NotNull Locale locale) {
      Intrinsics.checkNotNullParameter($this$decapitalize, "<this>");
      Intrinsics.checkNotNullParameter(locale, "locale");
      String var10000;
      if (((CharSequence)$this$decapitalize).length() > 0 && !Character.isLowerCase($this$decapitalize.charAt(0))) {
         StringBuilder var5 = new StringBuilder();
         byte var3 = 0;
         byte var4 = 1;
         String var10001 = $this$decapitalize.substring(var3, var4);
         Intrinsics.checkNotNullExpressionValue(var10001, "substring(...)");
         String var2 = var10001;
         Intrinsics.checkNotNull(var2, "null cannot be cast to non-null type java.lang.String");
         var10001 = var2.toLowerCase(locale);
         Intrinsics.checkNotNullExpressionValue(var10001, "toLowerCase(...)");
         var5 = var5.append(var10001);
         var3 = 1;
         var10001 = $this$decapitalize.substring(var3);
         Intrinsics.checkNotNullExpressionValue(var10001, "substring(...)");
         var10000 = var5.append(var10001).toString();
      } else {
         var10000 = $this$decapitalize;
      }

      return var10000;
   }

   @NotNull
   public static final String repeat(@NotNull CharSequence $this$repeat, int n) {
      Intrinsics.checkNotNullParameter($this$repeat, "<this>");
      if (n < 0) {
         int var2 = false;
         String var9 = "Count 'n' must be non-negative, but was " + n + '.';
         throw new IllegalArgumentException(var9.toString());
      } else {
         String var10000;
         switch(n) {
         case 0:
            var10000 = "";
            break;
         case 1:
            var10000 = $this$repeat.toString();
            break;
         default:
            switch($this$repeat.length()) {
            case 0:
               var10000 = "";
               break;
            case 1:
               char var4 = $this$repeat.charAt(0);
               int var5 = false;
               int var6 = 0;

               char[] var7;
               for(var7 = new char[n]; var6 < n; ++var6) {
                  var7[var6] = var4;
               }

               var10000 = new String(var7);
               break;
            default:
               StringBuilder sb = new StringBuilder(n * $this$repeat.length());
               int i = 1;
               if (i <= n) {
                  while(true) {
                     sb.append($this$repeat);
                     if (i == n) {
                        break;
                     }

                     ++i;
                  }
               }

               String var3 = sb.toString();
               Intrinsics.checkNotNull(var3);
               var10000 = var3;
            }
         }

         return var10000;
      }
   }

   @NotNull
   public static final Comparator<String> getCASE_INSENSITIVE_ORDER(@NotNull StringCompanionObject $this$CASE_INSENSITIVE_ORDER) {
      Intrinsics.checkNotNullParameter($this$CASE_INSENSITIVE_ORDER, "<this>");
      Comparator var10000 = String.CASE_INSENSITIVE_ORDER;
      Intrinsics.checkNotNullExpressionValue(var10000, "CASE_INSENSITIVE_ORDER");
      return var10000;
   }

   public StringsKt__StringsJVMKt() {
   }
}
