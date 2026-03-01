package kotlin.text;

import java.util.Arrays;
import kotlin.ExperimentalStdlibApi;
import kotlin.KotlinNothingValueException;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

public final class HexExtensionsKt {
   @NotNull
   private static final String LOWER_CASE_HEX_DIGITS = "0123456789abcdef";
   @NotNull
   private static final String UPPER_CASE_HEX_DIGITS = "0123456789ABCDEF";
   @NotNull
   private static final int[] BYTE_TO_LOWER_CASE_HEX_DIGITS;
   @NotNull
   private static final int[] BYTE_TO_UPPER_CASE_HEX_DIGITS;
   @NotNull
   private static final int[] HEX_DIGITS_TO_DECIMAL;
   @NotNull
   private static final long[] HEX_DIGITS_TO_LONG_DECIMAL;

   @NotNull
   public static final int[] getBYTE_TO_LOWER_CASE_HEX_DIGITS() {
      return BYTE_TO_LOWER_CASE_HEX_DIGITS;
   }

   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @SinceKotlin(
      version = "2.2"
   )
   @NotNull
   public static final String toHexString(@NotNull byte[] $this$toHexString, @NotNull HexFormat format) {
      Intrinsics.checkNotNullParameter($this$toHexString, "<this>");
      Intrinsics.checkNotNullParameter(format, "format");
      return toHexString($this$toHexString, 0, $this$toHexString.length, format);
   }

   // $FF: synthetic method
   public static String toHexString$default(byte[] var0, HexFormat var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = HexFormat.Companion.getDefault();
      }

      return toHexString(var0, var1);
   }

   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @SinceKotlin(
      version = "2.2"
   )
   @NotNull
   public static final String toHexString(@NotNull byte[] $this$toHexString, int startIndex, int endIndex, @NotNull HexFormat format) {
      Intrinsics.checkNotNullParameter($this$toHexString, "<this>");
      Intrinsics.checkNotNullParameter(format, "format");
      AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$toHexString.length);
      if (startIndex == endIndex) {
         return "";
      } else {
         int[] byteToDigits = format.getUpperCase() ? BYTE_TO_UPPER_CASE_HEX_DIGITS : BYTE_TO_LOWER_CASE_HEX_DIGITS;
         HexFormat.BytesHexFormat bytesFormat = format.getBytes();
         return bytesFormat.getNoLineAndGroupSeparator$kotlin_stdlib() ? toHexStringNoLineAndGroupSeparator($this$toHexString, startIndex, endIndex, bytesFormat, byteToDigits) : toHexStringSlowPath($this$toHexString, startIndex, endIndex, bytesFormat, byteToDigits);
      }
   }

   // $FF: synthetic method
   public static String toHexString$default(byte[] var0, int var1, int var2, HexFormat var3, int var4, Object var5) {
      if ((var4 & 1) != 0) {
         var1 = 0;
      }

      if ((var4 & 2) != 0) {
         var2 = var0.length;
      }

      if ((var4 & 4) != 0) {
         var3 = HexFormat.Companion.getDefault();
      }

      return toHexString(var0, var1, var2, var3);
   }

   private static final String toHexStringNoLineAndGroupSeparator(byte[] $this$toHexStringNoLineAndGroupSeparator, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat, int[] byteToDigits) {
      return bytesFormat.getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib() ? toHexStringShortByteSeparatorNoPrefixAndSuffix($this$toHexStringNoLineAndGroupSeparator, startIndex, endIndex, bytesFormat, byteToDigits) : toHexStringNoLineAndGroupSeparatorSlowPath($this$toHexStringNoLineAndGroupSeparator, startIndex, endIndex, bytesFormat, byteToDigits);
   }

   private static final String toHexStringShortByteSeparatorNoPrefixAndSuffix(byte[] $this$toHexStringShortByteSeparatorNoPrefixAndSuffix, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat, int[] byteToDigits) {
      int byteSeparatorLength = bytesFormat.getByteSeparator().length();
      if (byteSeparatorLength > 1) {
         String var11 = "Failed requirement.";
         throw new IllegalArgumentException(var11.toString());
      } else {
         int numberOfBytes = endIndex - startIndex;
         int charIndex = 0;
         char[] charArray;
         if (byteSeparatorLength == 0) {
            charArray = new char[checkFormatLength(2L * (long)numberOfBytes)];

            for(int byteIndex = startIndex; byteIndex < endIndex; ++byteIndex) {
               charIndex = formatByteAt($this$toHexStringShortByteSeparatorNoPrefixAndSuffix, byteIndex, byteToDigits, charArray, charIndex);
            }

            return StringsKt.concatToString(charArray);
         } else {
            charArray = new char[checkFormatLength(3L * (long)numberOfBytes - 1L)];
            char byteSeparatorChar = bytesFormat.getByteSeparator().charAt(0);
            charIndex = formatByteAt($this$toHexStringShortByteSeparatorNoPrefixAndSuffix, startIndex, byteToDigits, charArray, charIndex);

            for(int byteIndex = startIndex + 1; byteIndex < endIndex; ++byteIndex) {
               charArray[charIndex++] = byteSeparatorChar;
               charIndex = formatByteAt($this$toHexStringShortByteSeparatorNoPrefixAndSuffix, byteIndex, byteToDigits, charArray, charIndex);
            }

            return StringsKt.concatToString(charArray);
         }
      }
   }

   private static final String toHexStringNoLineAndGroupSeparatorSlowPath(byte[] $this$toHexStringNoLineAndGroupSeparatorSlowPath, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat, int[] byteToDigits) {
      String bytePrefix = bytesFormat.getBytePrefix();
      String byteSuffix = bytesFormat.getByteSuffix();
      String byteSeparator = bytesFormat.getByteSeparator();
      int formatLength = formattedStringLength(endIndex - startIndex, byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
      char[] charArray = new char[formatLength];
      int charIndex = 0;
      int charIndex = formatByteAt($this$toHexStringNoLineAndGroupSeparatorSlowPath, startIndex, bytePrefix, byteSuffix, byteToDigits, charArray, charIndex);

      for(int byteIndex = startIndex + 1; byteIndex < endIndex; ++byteIndex) {
         charIndex = toCharArrayIfNotEmpty(byteSeparator, charArray, charIndex);
         charIndex = formatByteAt($this$toHexStringNoLineAndGroupSeparatorSlowPath, byteIndex, bytePrefix, byteSuffix, byteToDigits, charArray, charIndex);
      }

      return StringsKt.concatToString(charArray);
   }

   private static final String toHexStringSlowPath(byte[] $this$toHexStringSlowPath, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat, int[] byteToDigits) {
      int bytesPerLine = bytesFormat.getBytesPerLine();
      int bytesPerGroup = bytesFormat.getBytesPerGroup();
      String bytePrefix = bytesFormat.getBytePrefix();
      String byteSuffix = bytesFormat.getByteSuffix();
      String byteSeparator = bytesFormat.getByteSeparator();
      String groupSeparator = bytesFormat.getGroupSeparator();
      int formatLength = formattedStringLength(endIndex - startIndex, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
      char[] charArray = new char[formatLength];
      int charIndex = 0;
      int indexInLine = 0;
      int indexInGroup = 0;

      for(int byteIndex = startIndex; byteIndex < endIndex; ++byteIndex) {
         if (indexInLine == bytesPerLine) {
            charArray[charIndex++] = '\n';
            indexInLine = 0;
            indexInGroup = 0;
         } else if (indexInGroup == bytesPerGroup) {
            charIndex = toCharArrayIfNotEmpty(groupSeparator, charArray, charIndex);
            indexInGroup = 0;
         }

         if (indexInGroup != 0) {
            charIndex = toCharArrayIfNotEmpty(byteSeparator, charArray, charIndex);
         }

         charIndex = formatByteAt($this$toHexStringSlowPath, byteIndex, bytePrefix, byteSuffix, byteToDigits, charArray, charIndex);
         ++indexInGroup;
         ++indexInLine;
      }

      if (charIndex != formatLength) {
         throw new IllegalStateException("Check failed.");
      } else {
         return StringsKt.concatToString(charArray);
      }
   }

   private static final int formatByteAt(byte[] $this$formatByteAt, int index, String bytePrefix, String byteSuffix, int[] byteToDigits, char[] destination, int destinationOffset) {
      int offset = toCharArrayIfNotEmpty(bytePrefix, destination, destinationOffset);
      offset = formatByteAt($this$formatByteAt, index, byteToDigits, destination, offset);
      return toCharArrayIfNotEmpty(byteSuffix, destination, offset);
   }

   private static final int formatByteAt(byte[] $this$formatByteAt, int index, int[] byteToDigits, char[] destination, int destinationOffset) {
      int var5 = $this$formatByteAt[index] & 255;
      int byteDigits = byteToDigits[var5];
      destination[destinationOffset] = (char)(byteDigits >> 8);
      destination[destinationOffset + 1] = (char)(byteDigits & 255);
      return destinationOffset + 2;
   }

   private static final int formattedStringLength(int numberOfBytes, int byteSeparatorLength, int bytePrefixLength, int byteSuffixLength) {
      if (numberOfBytes <= 0) {
         String var5 = "Failed requirement.";
         throw new IllegalArgumentException(var5.toString());
      } else {
         long charsPerByte = 2L + (long)bytePrefixLength + (long)byteSuffixLength + (long)byteSeparatorLength;
         long formatLength = (long)numberOfBytes * charsPerByte - (long)byteSeparatorLength;
         return checkFormatLength(formatLength);
      }
   }

   public static final int formattedStringLength(int numberOfBytes, int bytesPerLine, int bytesPerGroup, int groupSeparatorLength, int byteSeparatorLength, int bytePrefixLength, int byteSuffixLength) {
      if (numberOfBytes <= 0) {
         String var15 = "Failed requirement.";
         throw new IllegalArgumentException(var15.toString());
      } else {
         int lineSeparators = (numberOfBytes - 1) / bytesPerLine;
         int var9 = false;
         int groupSeparatorsPerLine = (bytesPerLine - 1) / bytesPerGroup;
         int it = numberOfBytes % bytesPerLine;
         int var12 = false;
         int bytesInLastLine = it == 0 ? bytesPerLine : it;
         int groupSeparatorsInLastLine = (bytesInLastLine - 1) / bytesPerGroup;
         int groupSeparators = lineSeparators * groupSeparatorsPerLine + groupSeparatorsInLastLine;
         int byteSeparators = numberOfBytes - 1 - lineSeparators - groupSeparators;
         long formatLength = (long)lineSeparators + (long)groupSeparators * (long)groupSeparatorLength + (long)byteSeparators * (long)byteSeparatorLength + (long)numberOfBytes * ((long)bytePrefixLength + 2L + (long)byteSuffixLength);
         return checkFormatLength(formatLength);
      }
   }

   private static final int checkFormatLength(long formatLength) {
      if (!(0L <= formatLength ? formatLength <= 2147483647L : false)) {
         throw new IllegalArgumentException("The resulting string length is too big: " + ULong.toString-impl(ULong.constructor-impl(formatLength)));
      } else {
         return (int)formatLength;
      }
   }

   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @SinceKotlin(
      version = "2.2"
   )
   @NotNull
   public static final byte[] hexToByteArray(@NotNull String $this$hexToByteArray, @NotNull HexFormat format) {
      Intrinsics.checkNotNullParameter($this$hexToByteArray, "<this>");
      Intrinsics.checkNotNullParameter(format, "format");
      return hexToByteArray($this$hexToByteArray, 0, $this$hexToByteArray.length(), format);
   }

   // $FF: synthetic method
   public static byte[] hexToByteArray$default(String var0, HexFormat var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = HexFormat.Companion.getDefault();
      }

      return hexToByteArray(var0, var1);
   }

   private static final byte[] hexToByteArray(String $this$hexToByteArray, int startIndex, int endIndex, HexFormat format) {
      AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$hexToByteArray.length());
      if (startIndex == endIndex) {
         return new byte[0];
      } else {
         HexFormat.BytesHexFormat bytesFormat = format.getBytes();
         if (bytesFormat.getNoLineAndGroupSeparator$kotlin_stdlib()) {
            byte[] var5 = hexToByteArrayNoLineAndGroupSeparator($this$hexToByteArray, startIndex, endIndex, bytesFormat);
            if (var5 != null) {
               int var7 = false;
               return var5;
            }
         }

         return hexToByteArraySlowPath($this$hexToByteArray, startIndex, endIndex, bytesFormat);
      }
   }

   // $FF: synthetic method
   static byte[] hexToByteArray$default(String var0, int var1, int var2, HexFormat var3, int var4, Object var5) {
      if ((var4 & 1) != 0) {
         var1 = 0;
      }

      if ((var4 & 2) != 0) {
         var2 = var0.length();
      }

      if ((var4 & 4) != 0) {
         var3 = HexFormat.Companion.getDefault();
      }

      return hexToByteArray(var0, var1, var2, var3);
   }

   private static final byte[] hexToByteArrayNoLineAndGroupSeparator(String $this$hexToByteArrayNoLineAndGroupSeparator, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat) {
      return bytesFormat.getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib() ? hexToByteArrayShortByteSeparatorNoPrefixAndSuffix($this$hexToByteArrayNoLineAndGroupSeparator, startIndex, endIndex, bytesFormat) : hexToByteArrayNoLineAndGroupSeparatorSlowPath($this$hexToByteArrayNoLineAndGroupSeparator, startIndex, endIndex, bytesFormat);
   }

   private static final byte[] hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(String $this$hexToByteArrayShortByteSeparatorNoPrefixAndSuffix, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat) {
      int byteSeparatorLength = bytesFormat.getByteSeparator().length();
      if (byteSeparatorLength > 1) {
         String var18 = "Failed requirement.";
         throw new IllegalArgumentException(var18.toString());
      } else {
         int numberOfChars = endIndex - startIndex;
         int charIndex = 0;
         int numberOfBytes;
         byte[] byteArray;
         if (byteSeparatorLength == 0) {
            if ((numberOfChars & 1) != 0) {
               return null;
            } else {
               numberOfBytes = numberOfChars >> 1;
               byteArray = new byte[numberOfBytes];

               for(int byteIndex = 0; byteIndex < numberOfBytes; ++byteIndex) {
                  byteArray[byteIndex] = parseByteAt($this$hexToByteArrayShortByteSeparatorNoPrefixAndSuffix, charIndex);
                  charIndex += 2;
               }

               return byteArray;
            }
         } else if (numberOfChars % 3 != 2) {
            return null;
         } else {
            numberOfBytes = numberOfChars / 3 + 1;
            byteArray = new byte[numberOfBytes];
            char byteSeparatorChar = bytesFormat.getByteSeparator().charAt(0);
            byteArray[0] = parseByteAt($this$hexToByteArrayShortByteSeparatorNoPrefixAndSuffix, charIndex);
            charIndex += 2;

            for(int byteIndex = 1; byteIndex < numberOfBytes; ++byteIndex) {
               if ($this$hexToByteArrayShortByteSeparatorNoPrefixAndSuffix.charAt(charIndex) != byteSeparatorChar) {
                  String $this$checkContainsAt$iv = $this$hexToByteArrayShortByteSeparatorNoPrefixAndSuffix;
                  String part$iv = bytesFormat.getByteSeparator();
                  boolean ignoreCase$iv = bytesFormat.getIgnoreCase$kotlin_stdlib();
                  String partName$iv = "byte separator";
                  int $i$f$checkContainsAt = false;
                  if (((CharSequence)part$iv).length() != 0) {
                     int i$iv = 0;

                     for(int var17 = ((CharSequence)part$iv).length(); i$iv < var17; ++i$iv) {
                        if (!CharsKt.equals(part$iv.charAt(i$iv), $this$checkContainsAt$iv.charAt(charIndex + i$iv), ignoreCase$iv)) {
                           throwNotContainedAt($this$checkContainsAt$iv, charIndex, endIndex, part$iv, partName$iv);
                        }
                     }

                     int var10000 = charIndex + part$iv.length();
                  }
               }

               byteArray[byteIndex] = parseByteAt($this$hexToByteArrayShortByteSeparatorNoPrefixAndSuffix, charIndex + 1);
               charIndex += 3;
            }

            return byteArray;
         }
      }
   }

   private static final byte[] hexToByteArrayNoLineAndGroupSeparatorSlowPath(String $this$hexToByteArrayNoLineAndGroupSeparatorSlowPath, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat) {
      String bytePrefix = bytesFormat.getBytePrefix();
      String byteSuffix = bytesFormat.getByteSuffix();
      String byteSeparator = bytesFormat.getByteSeparator();
      int byteSeparatorLength = byteSeparator.length();
      long charsPerByte = 2L + (long)bytePrefix.length() + (long)byteSuffix.length() + (long)byteSeparatorLength;
      long numberOfChars = (long)(endIndex - startIndex);
      int numberOfBytes = (int)((numberOfChars + (long)byteSeparatorLength) / charsPerByte);
      if ((long)numberOfBytes * charsPerByte - (long)byteSeparatorLength != numberOfChars) {
         return null;
      } else {
         boolean ignoreCase = bytesFormat.getIgnoreCase$kotlin_stdlib();
         byte[] byteArray = new byte[numberOfBytes];
         int charIndex = startIndex;
         String between = $this$hexToByteArrayNoLineAndGroupSeparatorSlowPath;
         String $this$checkContainsAt$iv = "byte prefix";
         int $i$f$checkContainsAt = false;
         int var10000;
         int index$iv;
         if (((CharSequence)bytePrefix).length() == 0) {
            var10000 = startIndex;
         } else {
            int i$iv = 0;

            for(index$iv = ((CharSequence)bytePrefix).length(); i$iv < index$iv; ++i$iv) {
               if (!CharsKt.equals(bytePrefix.charAt(i$iv), between.charAt(charIndex + i$iv), ignoreCase)) {
                  throwNotContainedAt(between, charIndex, endIndex, bytePrefix, $this$checkContainsAt$iv);
               }
            }

            var10000 = charIndex + bytePrefix.length();
         }

         charIndex = var10000;
         between = byteSuffix + byteSeparator + bytePrefix;
         int byteIndex = 0;

         int index$iv;
         String partName$iv;
         for(index$iv = numberOfBytes - 1; byteIndex < index$iv; ++byteIndex) {
            byteArray[byteIndex] = parseByteAt($this$hexToByteArrayNoLineAndGroupSeparatorSlowPath, charIndex);
            partName$iv = $this$hexToByteArrayNoLineAndGroupSeparatorSlowPath;
            index$iv = charIndex + 2;
            String partName$iv = "byte suffix + byte separator + byte prefix";
            int $i$f$checkContainsAt = false;
            if (((CharSequence)between).length() == 0) {
               var10000 = index$iv;
            } else {
               int i$iv = 0;

               for(int var24 = ((CharSequence)between).length(); i$iv < var24; ++i$iv) {
                  if (!CharsKt.equals(between.charAt(i$iv), partName$iv.charAt(index$iv + i$iv), ignoreCase)) {
                     throwNotContainedAt(partName$iv, index$iv, endIndex, between, partName$iv);
                  }
               }

               var10000 = index$iv + between.length();
            }

            charIndex = var10000;
         }

         byteArray[numberOfBytes - 1] = parseByteAt($this$hexToByteArrayNoLineAndGroupSeparatorSlowPath, charIndex);
         $this$checkContainsAt$iv = $this$hexToByteArrayNoLineAndGroupSeparatorSlowPath;
         index$iv = charIndex + 2;
         partName$iv = "byte suffix";
         int $i$f$checkContainsAt = false;
         if (((CharSequence)byteSuffix).length() != 0) {
            int i$iv = 0;

            for(int var30 = ((CharSequence)byteSuffix).length(); i$iv < var30; ++i$iv) {
               if (!CharsKt.equals(byteSuffix.charAt(i$iv), $this$checkContainsAt$iv.charAt(index$iv + i$iv), ignoreCase)) {
                  throwNotContainedAt($this$checkContainsAt$iv, index$iv, endIndex, byteSuffix, partName$iv);
               }
            }

            var10000 = index$iv + byteSuffix.length();
         }

         return byteArray;
      }
   }

   private static final byte[] hexToByteArraySlowPath(String $this$hexToByteArraySlowPath, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat) {
      int bytesPerLine = bytesFormat.getBytesPerLine();
      int bytesPerGroup = bytesFormat.getBytesPerGroup();
      String bytePrefix = bytesFormat.getBytePrefix();
      String byteSuffix = bytesFormat.getByteSuffix();
      String byteSeparator = bytesFormat.getByteSeparator();
      String groupSeparator = bytesFormat.getGroupSeparator();
      boolean ignoreCase = bytesFormat.getIgnoreCase$kotlin_stdlib();
      int parseMaxSize = parsedByteArrayMaxSize(endIndex - startIndex, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
      byte[] byteArray = new byte[parseMaxSize];
      int charIndex = startIndex;
      int byteIndex = 0;
      int indexInLine = 0;

      int var10000;
      for(int indexInGroup = 0; charIndex < endIndex; charIndex = var10000) {
         String $this$checkContainsAt$iv;
         String partName$iv;
         boolean $i$f$checkContainsAt;
         int i$iv;
         int i$iv;
         if (indexInLine == bytesPerLine) {
            charIndex = checkNewLineAt($this$hexToByteArraySlowPath, charIndex, endIndex);
            indexInLine = 0;
            indexInGroup = 0;
         } else if (indexInGroup == bytesPerGroup) {
            $this$checkContainsAt$iv = $this$hexToByteArraySlowPath;
            partName$iv = "group separator";
            $i$f$checkContainsAt = false;
            if (((CharSequence)groupSeparator).length() == 0) {
               var10000 = charIndex;
            } else {
               i$iv = 0;

               for(i$iv = ((CharSequence)groupSeparator).length(); i$iv < i$iv; ++i$iv) {
                  if (!CharsKt.equals(groupSeparator.charAt(i$iv), $this$checkContainsAt$iv.charAt(charIndex + i$iv), ignoreCase)) {
                     throwNotContainedAt($this$checkContainsAt$iv, charIndex, endIndex, groupSeparator, partName$iv);
                  }
               }

               var10000 = charIndex + groupSeparator.length();
            }

            charIndex = var10000;
            indexInGroup = 0;
         } else if (indexInGroup != 0) {
            $this$checkContainsAt$iv = $this$hexToByteArraySlowPath;
            partName$iv = "byte separator";
            $i$f$checkContainsAt = false;
            if (((CharSequence)byteSeparator).length() == 0) {
               var10000 = charIndex;
            } else {
               i$iv = 0;

               for(i$iv = ((CharSequence)byteSeparator).length(); i$iv < i$iv; ++i$iv) {
                  if (!CharsKt.equals(byteSeparator.charAt(i$iv), $this$checkContainsAt$iv.charAt(charIndex + i$iv), ignoreCase)) {
                     throwNotContainedAt($this$checkContainsAt$iv, charIndex, endIndex, byteSeparator, partName$iv);
                  }
               }

               var10000 = charIndex + byteSeparator.length();
            }

            charIndex = var10000;
         }

         ++indexInLine;
         ++indexInGroup;
         $this$checkContainsAt$iv = $this$hexToByteArraySlowPath;
         partName$iv = "byte prefix";
         $i$f$checkContainsAt = false;
         if (((CharSequence)bytePrefix).length() == 0) {
            var10000 = charIndex;
         } else {
            i$iv = 0;

            for(i$iv = ((CharSequence)bytePrefix).length(); i$iv < i$iv; ++i$iv) {
               if (!CharsKt.equals(bytePrefix.charAt(i$iv), $this$checkContainsAt$iv.charAt(charIndex + i$iv), ignoreCase)) {
                  throwNotContainedAt($this$checkContainsAt$iv, charIndex, endIndex, bytePrefix, partName$iv);
               }
            }

            var10000 = charIndex + bytePrefix.length();
         }

         charIndex = var10000;
         if (endIndex - 2 < charIndex) {
            throwInvalidNumberOfDigits($this$hexToByteArraySlowPath, charIndex, endIndex, "exactly", 2);
         }

         byteArray[byteIndex++] = parseByteAt($this$hexToByteArraySlowPath, charIndex);
         $this$checkContainsAt$iv = $this$hexToByteArraySlowPath;
         int index$iv = charIndex + 2;
         String partName$iv = "byte suffix";
         int $i$f$checkContainsAt = false;
         if (((CharSequence)byteSuffix).length() == 0) {
            var10000 = index$iv;
         } else {
            i$iv = 0;

            for(int var22 = ((CharSequence)byteSuffix).length(); i$iv < var22; ++i$iv) {
               if (!CharsKt.equals(byteSuffix.charAt(i$iv), $this$checkContainsAt$iv.charAt(index$iv + i$iv), ignoreCase)) {
                  throwNotContainedAt($this$checkContainsAt$iv, index$iv, endIndex, byteSuffix, partName$iv);
               }
            }

            var10000 = index$iv + byteSuffix.length();
         }
      }

      byte[] var24;
      if (byteIndex == byteArray.length) {
         var24 = byteArray;
      } else {
         var24 = Arrays.copyOf(byteArray, byteIndex);
         Intrinsics.checkNotNullExpressionValue(var24, "copyOf(...)");
      }

      return var24;
   }

   private static final byte parseByteAt(String $this$parseByteAt, int index) {
      int $i$f$decimalFromHexDigitAt = false;
      int code$iv = $this$parseByteAt.charAt(index);
      if (code$iv >>> 8 == 0 && HEX_DIGITS_TO_DECIMAL[code$iv] >= 0) {
         int high = HEX_DIGITS_TO_DECIMAL[code$iv];
         int index$iv = index + 1;
         boolean var6 = false;
         char code$iv = $this$parseByteAt.charAt(index$iv);
         if (code$iv >>> 8 == 0 && HEX_DIGITS_TO_DECIMAL[code$iv] >= 0) {
            int low = HEX_DIGITS_TO_DECIMAL[code$iv];
            return (byte)(high << 4 | low);
         } else {
            throwInvalidDigitAt($this$parseByteAt, index$iv);
            throw new KotlinNothingValueException();
         }
      } else {
         throwInvalidDigitAt($this$parseByteAt, index);
         throw new KotlinNothingValueException();
      }
   }

   public static final int parsedByteArrayMaxSize(int stringLength, int bytesPerLine, int bytesPerGroup, int groupSeparatorLength, int byteSeparatorLength, int bytePrefixLength, int byteSuffixLength) {
      if (stringLength <= 0) {
         String var8 = "Failed requirement.";
         throw new IllegalArgumentException(var8.toString());
      } else {
         long charsPerByte = (long)bytePrefixLength + 2L + (long)byteSuffixLength;
         long charsPerGroup = charsPerSet(charsPerByte, bytesPerGroup, byteSeparatorLength);
         long var10000;
         if (bytesPerLine <= bytesPerGroup) {
            var10000 = charsPerSet(charsPerByte, bytesPerLine, byteSeparatorLength);
         } else {
            int groupsPerLine = bytesPerLine / bytesPerGroup;
            long result = charsPerSet(charsPerGroup, groupsPerLine, groupSeparatorLength);
            int bytesPerLastGroupInLine = bytesPerLine % bytesPerGroup;
            if (bytesPerLastGroupInLine != 0) {
               result += (long)groupSeparatorLength;
               result += charsPerSet(charsPerByte, bytesPerLastGroupInLine, byteSeparatorLength);
            }

            var10000 = result;
         }

         long charsPerLine = var10000;
         long numberOfChars = (long)stringLength;
         long wholeLines = wholeElementsPerSet(numberOfChars, charsPerLine, 1);
         numberOfChars -= wholeLines * (charsPerLine + 1L);
         long wholeGroupsInLastLine = wholeElementsPerSet(numberOfChars, charsPerGroup, groupSeparatorLength);
         numberOfChars -= wholeGroupsInLastLine * (charsPerGroup + (long)groupSeparatorLength);
         long wholeBytesInLastGroup = wholeElementsPerSet(numberOfChars, charsPerByte, byteSeparatorLength);
         numberOfChars -= wholeBytesInLastGroup * (charsPerByte + (long)byteSeparatorLength);
         int spare = numberOfChars > 0L ? 1 : 0;
         return (int)(wholeLines * (long)bytesPerLine + wholeGroupsInLastLine * (long)bytesPerGroup + wholeBytesInLastGroup + (long)spare);
      }
   }

   private static final long charsPerSet(long charsPerElement, int elementsPerSet, int elementSeparatorLength) {
      if (elementsPerSet <= 0) {
         String var4 = "Failed requirement.";
         throw new IllegalArgumentException(var4.toString());
      } else {
         return charsPerElement * (long)elementsPerSet + (long)elementSeparatorLength * ((long)elementsPerSet - 1L);
      }
   }

   private static final long wholeElementsPerSet(long charsPerSet, long charsPerElement, int elementSeparatorLength) {
      return charsPerSet > 0L && charsPerElement > 0L ? (charsPerSet + (long)elementSeparatorLength) / (charsPerElement + (long)elementSeparatorLength) : 0L;
   }

   private static final int checkNewLineAt(String $this$checkNewLineAt, int index, int endIndex) {
      int var10000;
      if ($this$checkNewLineAt.charAt(index) == '\r') {
         var10000 = index + 1 < endIndex && $this$checkNewLineAt.charAt(index + 1) == '\n' ? index + 2 : index + 1;
      } else {
         if ($this$checkNewLineAt.charAt(index) != '\n') {
            throw new NumberFormatException("Expected a new line at index " + index + ", but was " + $this$checkNewLineAt.charAt(index));
         }

         var10000 = index + 1;
      }

      return var10000;
   }

   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @SinceKotlin(
      version = "2.2"
   )
   @NotNull
   public static final String toHexString(byte $this$toHexString, @NotNull HexFormat format) {
      Intrinsics.checkNotNullParameter(format, "format");
      String digits = format.getUpperCase() ? "0123456789ABCDEF" : "0123456789abcdef";
      HexFormat.NumberHexFormat numberFormat = format.getNumber();
      if (numberFormat.isDigitsOnlyAndNoPadding$kotlin_stdlib()) {
         char[] charArray = new char[]{digits.charAt($this$toHexString >> 4 & 15), digits.charAt($this$toHexString & 15)};
         return numberFormat.getRemoveLeadingZeros() ? StringsKt.concatToString$default(charArray, RangesKt.coerceAtMost(Integer.numberOfLeadingZeros($this$toHexString & 255) - 24 >> 2, 1), 0, 2, (Object)null) : StringsKt.concatToString(charArray);
      } else {
         return toHexStringImpl((long)$this$toHexString, numberFormat, digits, 8);
      }
   }

   // $FF: synthetic method
   public static String toHexString$default(byte var0, HexFormat var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = HexFormat.Companion.getDefault();
      }

      return toHexString(var0, var1);
   }

   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @SinceKotlin(
      version = "2.2"
   )
   public static final byte hexToByte(@NotNull String $this$hexToByte, @NotNull HexFormat format) {
      Intrinsics.checkNotNullParameter($this$hexToByte, "<this>");
      Intrinsics.checkNotNullParameter(format, "format");
      return hexToByte($this$hexToByte, 0, $this$hexToByte.length(), format);
   }

   // $FF: synthetic method
   public static byte hexToByte$default(String var0, HexFormat var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = HexFormat.Companion.getDefault();
      }

      return hexToByte(var0, var1);
   }

   private static final byte hexToByte(String $this$hexToByte, int startIndex, int endIndex, HexFormat format) {
      return (byte)hexToIntImpl($this$hexToByte, startIndex, endIndex, format, 2);
   }

   // $FF: synthetic method
   static byte hexToByte$default(String var0, int var1, int var2, HexFormat var3, int var4, Object var5) {
      if ((var4 & 1) != 0) {
         var1 = 0;
      }

      if ((var4 & 2) != 0) {
         var2 = var0.length();
      }

      if ((var4 & 4) != 0) {
         var3 = HexFormat.Companion.getDefault();
      }

      return hexToByte(var0, var1, var2, var3);
   }

   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @SinceKotlin(
      version = "2.2"
   )
   @NotNull
   public static final String toHexString(short $this$toHexString, @NotNull HexFormat format) {
      Intrinsics.checkNotNullParameter(format, "format");
      String digits = format.getUpperCase() ? "0123456789ABCDEF" : "0123456789abcdef";
      HexFormat.NumberHexFormat numberFormat = format.getNumber();
      if (numberFormat.isDigitsOnlyAndNoPadding$kotlin_stdlib()) {
         char[] charArray = new char[]{digits.charAt($this$toHexString >> 12 & 15), digits.charAt($this$toHexString >> 8 & 15), digits.charAt($this$toHexString >> 4 & 15), digits.charAt($this$toHexString & 15)};
         return numberFormat.getRemoveLeadingZeros() ? StringsKt.concatToString$default(charArray, RangesKt.coerceAtMost(Integer.numberOfLeadingZeros($this$toHexString & '\uffff') - 16 >> 2, 3), 0, 2, (Object)null) : StringsKt.concatToString(charArray);
      } else {
         return toHexStringImpl((long)$this$toHexString, numberFormat, digits, 16);
      }
   }

   // $FF: synthetic method
   public static String toHexString$default(short var0, HexFormat var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = HexFormat.Companion.getDefault();
      }

      return toHexString(var0, var1);
   }

   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @SinceKotlin(
      version = "2.2"
   )
   public static final short hexToShort(@NotNull String $this$hexToShort, @NotNull HexFormat format) {
      Intrinsics.checkNotNullParameter($this$hexToShort, "<this>");
      Intrinsics.checkNotNullParameter(format, "format");
      return hexToShort($this$hexToShort, 0, $this$hexToShort.length(), format);
   }

   // $FF: synthetic method
   public static short hexToShort$default(String var0, HexFormat var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = HexFormat.Companion.getDefault();
      }

      return hexToShort(var0, var1);
   }

   private static final short hexToShort(String $this$hexToShort, int startIndex, int endIndex, HexFormat format) {
      return (short)hexToIntImpl($this$hexToShort, startIndex, endIndex, format, 4);
   }

   // $FF: synthetic method
   static short hexToShort$default(String var0, int var1, int var2, HexFormat var3, int var4, Object var5) {
      if ((var4 & 1) != 0) {
         var1 = 0;
      }

      if ((var4 & 2) != 0) {
         var2 = var0.length();
      }

      if ((var4 & 4) != 0) {
         var3 = HexFormat.Companion.getDefault();
      }

      return hexToShort(var0, var1, var2, var3);
   }

   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @SinceKotlin(
      version = "2.2"
   )
   @NotNull
   public static final String toHexString(int $this$toHexString, @NotNull HexFormat format) {
      Intrinsics.checkNotNullParameter(format, "format");
      String digits = format.getUpperCase() ? "0123456789ABCDEF" : "0123456789abcdef";
      HexFormat.NumberHexFormat numberFormat = format.getNumber();
      if (numberFormat.isDigitsOnlyAndNoPadding$kotlin_stdlib()) {
         char[] charArray = new char[]{digits.charAt($this$toHexString >> 28 & 15), digits.charAt($this$toHexString >> 24 & 15), digits.charAt($this$toHexString >> 20 & 15), digits.charAt($this$toHexString >> 16 & 15), digits.charAt($this$toHexString >> 12 & 15), digits.charAt($this$toHexString >> 8 & 15), digits.charAt($this$toHexString >> 4 & 15), digits.charAt($this$toHexString & 15)};
         return numberFormat.getRemoveLeadingZeros() ? StringsKt.concatToString$default(charArray, RangesKt.coerceAtMost(Integer.numberOfLeadingZeros($this$toHexString) >> 2, 7), 0, 2, (Object)null) : StringsKt.concatToString(charArray);
      } else {
         return toHexStringImpl((long)$this$toHexString, numberFormat, digits, 32);
      }
   }

   // $FF: synthetic method
   public static String toHexString$default(int var0, HexFormat var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = HexFormat.Companion.getDefault();
      }

      return toHexString(var0, var1);
   }

   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @SinceKotlin(
      version = "2.2"
   )
   public static final int hexToInt(@NotNull String $this$hexToInt, @NotNull HexFormat format) {
      Intrinsics.checkNotNullParameter($this$hexToInt, "<this>");
      Intrinsics.checkNotNullParameter(format, "format");
      return hexToInt($this$hexToInt, 0, $this$hexToInt.length(), format);
   }

   // $FF: synthetic method
   public static int hexToInt$default(String var0, HexFormat var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = HexFormat.Companion.getDefault();
      }

      return hexToInt(var0, var1);
   }

   public static final int hexToInt(@NotNull String $this$hexToInt, int startIndex, int endIndex, @NotNull HexFormat format) {
      Intrinsics.checkNotNullParameter($this$hexToInt, "<this>");
      Intrinsics.checkNotNullParameter(format, "format");
      return hexToIntImpl($this$hexToInt, startIndex, endIndex, format, 8);
   }

   // $FF: synthetic method
   public static int hexToInt$default(String var0, int var1, int var2, HexFormat var3, int var4, Object var5) {
      if ((var4 & 1) != 0) {
         var1 = 0;
      }

      if ((var4 & 2) != 0) {
         var2 = var0.length();
      }

      if ((var4 & 4) != 0) {
         var3 = HexFormat.Companion.getDefault();
      }

      return hexToInt(var0, var1, var2, var3);
   }

   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @SinceKotlin(
      version = "2.2"
   )
   @NotNull
   public static final String toHexString(long $this$toHexString, @NotNull HexFormat format) {
      Intrinsics.checkNotNullParameter(format, "format");
      String digits = format.getUpperCase() ? "0123456789ABCDEF" : "0123456789abcdef";
      HexFormat.NumberHexFormat numberFormat = format.getNumber();
      if (numberFormat.isDigitsOnlyAndNoPadding$kotlin_stdlib()) {
         char[] charArray = new char[]{digits.charAt((int)($this$toHexString >> 60 & 15L)), digits.charAt((int)($this$toHexString >> 56 & 15L)), digits.charAt((int)($this$toHexString >> 52 & 15L)), digits.charAt((int)($this$toHexString >> 48 & 15L)), digits.charAt((int)($this$toHexString >> 44 & 15L)), digits.charAt((int)($this$toHexString >> 40 & 15L)), digits.charAt((int)($this$toHexString >> 36 & 15L)), digits.charAt((int)($this$toHexString >> 32 & 15L)), digits.charAt((int)($this$toHexString >> 28 & 15L)), digits.charAt((int)($this$toHexString >> 24 & 15L)), digits.charAt((int)($this$toHexString >> 20 & 15L)), digits.charAt((int)($this$toHexString >> 16 & 15L)), digits.charAt((int)($this$toHexString >> 12 & 15L)), digits.charAt((int)($this$toHexString >> 8 & 15L)), digits.charAt((int)($this$toHexString >> 4 & 15L)), digits.charAt((int)($this$toHexString & 15L))};
         return numberFormat.getRemoveLeadingZeros() ? StringsKt.concatToString$default(charArray, RangesKt.coerceAtMost(Long.numberOfLeadingZeros($this$toHexString) >> 2, 15), 0, 2, (Object)null) : StringsKt.concatToString(charArray);
      } else {
         return toHexStringImpl($this$toHexString, numberFormat, digits, 64);
      }
   }

   // $FF: synthetic method
   public static String toHexString$default(long var0, HexFormat var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var2 = HexFormat.Companion.getDefault();
      }

      return toHexString(var0, var2);
   }

   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @SinceKotlin(
      version = "2.2"
   )
   public static final long hexToLong(@NotNull String $this$hexToLong, @NotNull HexFormat format) {
      Intrinsics.checkNotNullParameter($this$hexToLong, "<this>");
      Intrinsics.checkNotNullParameter(format, "format");
      return hexToLong($this$hexToLong, 0, $this$hexToLong.length(), format);
   }

   // $FF: synthetic method
   public static long hexToLong$default(String var0, HexFormat var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = HexFormat.Companion.getDefault();
      }

      return hexToLong(var0, var1);
   }

   public static final long hexToLong(@NotNull String $this$hexToLong, int startIndex, int endIndex, @NotNull HexFormat format) {
      Intrinsics.checkNotNullParameter($this$hexToLong, "<this>");
      Intrinsics.checkNotNullParameter(format, "format");
      return hexToLongImpl($this$hexToLong, startIndex, endIndex, format, 16);
   }

   // $FF: synthetic method
   public static long hexToLong$default(String var0, int var1, int var2, HexFormat var3, int var4, Object var5) {
      if ((var4 & 1) != 0) {
         var1 = 0;
      }

      if ((var4 & 2) != 0) {
         var2 = var0.length();
      }

      if ((var4 & 4) != 0) {
         var3 = HexFormat.Companion.getDefault();
      }

      return hexToLong(var0, var1, var2, var3);
   }

   private static final String toHexStringImpl(long $this$toHexStringImpl, HexFormat.NumberHexFormat numberFormat, String digits, int bits) {
      if ((bits & 3) != 0) {
         String var6 = "Failed requirement.";
         throw new IllegalArgumentException(var6.toString());
      } else {
         long value = $this$toHexStringImpl;
         int typeHexLength = bits >> 2;
         int minLength = numberFormat.getMinLength();
         int pads = RangesKt.coerceAtLeast(minLength - typeHexLength, 0);
         String prefix = numberFormat.getPrefix();
         String suffix = numberFormat.getSuffix();
         boolean removeZeros = false;
         removeZeros = numberFormat.getRemoveLeadingZeros();
         long formatLength = (long)prefix.length() + (long)pads + (long)typeHexLength + (long)suffix.length();
         char[] charArray = new char[checkFormatLength(formatLength)];
         int charIndex = false;
         int charIndex = toCharArrayIfNotEmpty(prefix, charArray, 0);
         if (pads > 0) {
            ArraysKt.fill(charArray, digits.charAt(0), charIndex, charIndex + pads);
            charIndex += pads;
         }

         int shift = false;
         int shift = bits;

         for(int var18 = 0; var18 < typeHexLength; ++var18) {
            int var20 = false;
            shift -= 4;
            int decimal = (int)(value >> shift & 15L);
            removeZeros = removeZeros && decimal == 0 && shift >> 2 >= minLength;
            if (!removeZeros) {
               int var22 = charIndex++;
               charArray[var22] = digits.charAt(decimal);
            }
         }

         charIndex = toCharArrayIfNotEmpty(suffix, charArray, charIndex);
         return charIndex == charArray.length ? StringsKt.concatToString(charArray) : StringsKt.concatToString$default(charArray, 0, charIndex, 1, (Object)null);
      }
   }

   private static final int toCharArrayIfNotEmpty(String $this$toCharArrayIfNotEmpty, char[] destination, int destinationOffset) {
      switch($this$toCharArrayIfNotEmpty.length()) {
      case 0:
         break;
      case 1:
         destination[destinationOffset] = $this$toCharArrayIfNotEmpty.charAt(0);
         break;
      default:
         byte var4 = 0;
         int var5 = $this$toCharArrayIfNotEmpty.length();
         Intrinsics.checkNotNull($this$toCharArrayIfNotEmpty, "null cannot be cast to non-null type java.lang.String");
         $this$toCharArrayIfNotEmpty.getChars(var4, var5, destination, destinationOffset);
      }

      return destinationOffset + $this$toCharArrayIfNotEmpty.length();
   }

   private static final int hexToIntImpl(String $this$hexToIntImpl, int startIndex, int endIndex, HexFormat format, int typeHexLength) {
      AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$hexToIntImpl.length());
      HexFormat.NumberHexFormat numberFormat = format.getNumber();
      if (numberFormat.isDigitsOnly$kotlin_stdlib()) {
         checkNumberOfDigits($this$hexToIntImpl, startIndex, endIndex, typeHexLength);
         return parseInt($this$hexToIntImpl, startIndex, endIndex);
      } else {
         String prefix = numberFormat.getPrefix();
         String suffix = numberFormat.getSuffix();
         checkPrefixSuffixNumberOfDigits($this$hexToIntImpl, startIndex, endIndex, prefix, suffix, numberFormat.getIgnoreCase$kotlin_stdlib(), typeHexLength);
         return parseInt($this$hexToIntImpl, startIndex + prefix.length(), endIndex - suffix.length());
      }
   }

   private static final long hexToLongImpl(String $this$hexToLongImpl, int startIndex, int endIndex, HexFormat format, int typeHexLength) {
      AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$hexToLongImpl.length());
      HexFormat.NumberHexFormat numberFormat = format.getNumber();
      if (numberFormat.isDigitsOnly$kotlin_stdlib()) {
         checkNumberOfDigits($this$hexToLongImpl, startIndex, endIndex, typeHexLength);
         return parseLong($this$hexToLongImpl, startIndex, endIndex);
      } else {
         String prefix = numberFormat.getPrefix();
         String suffix = numberFormat.getSuffix();
         checkPrefixSuffixNumberOfDigits($this$hexToLongImpl, startIndex, endIndex, prefix, suffix, numberFormat.getIgnoreCase$kotlin_stdlib(), typeHexLength);
         return parseLong($this$hexToLongImpl, startIndex + prefix.length(), endIndex - suffix.length());
      }
   }

   private static final void checkPrefixSuffixNumberOfDigits(String $this$checkPrefixSuffixNumberOfDigits, int startIndex, int endIndex, String prefix, String suffix, boolean ignoreCase, int typeHexLength) {
      if (endIndex - startIndex - prefix.length() <= suffix.length()) {
         throwInvalidPrefixSuffix($this$checkPrefixSuffixNumberOfDigits, startIndex, endIndex, prefix, suffix);
      }

      String $this$checkContainsAt$iv = $this$checkPrefixSuffixNumberOfDigits;
      String $this$checkContainsAt$iv = "prefix";
      int $i$f$checkContainsAt = false;
      int i$iv;
      int var10000;
      if (((CharSequence)prefix).length() == 0) {
         var10000 = startIndex;
      } else {
         int i$iv = 0;

         for(i$iv = ((CharSequence)prefix).length(); i$iv < i$iv; ++i$iv) {
            if (!CharsKt.equals(prefix.charAt(i$iv), $this$checkContainsAt$iv.charAt(startIndex + i$iv), ignoreCase)) {
               throwNotContainedAt($this$checkContainsAt$iv, startIndex, endIndex, prefix, $this$checkContainsAt$iv);
            }
         }

         var10000 = startIndex + prefix.length();
      }

      int digitsStartIndex = var10000;
      int digitsEndIndex = endIndex - suffix.length();
      $this$checkContainsAt$iv = $this$checkPrefixSuffixNumberOfDigits;
      String partName$iv = "suffix";
      int $i$f$checkContainsAt = false;
      if (((CharSequence)suffix).length() != 0) {
         i$iv = 0;

         for(int var13 = ((CharSequence)suffix).length(); i$iv < var13; ++i$iv) {
            if (!CharsKt.equals(suffix.charAt(i$iv), $this$checkContainsAt$iv.charAt(digitsEndIndex + i$iv), ignoreCase)) {
               throwNotContainedAt($this$checkContainsAt$iv, digitsEndIndex, endIndex, suffix, partName$iv);
            }
         }

         var10000 = digitsEndIndex + suffix.length();
      }

      checkNumberOfDigits($this$checkPrefixSuffixNumberOfDigits, digitsStartIndex, digitsEndIndex, typeHexLength);
   }

   private static final void checkNumberOfDigits(String $this$checkNumberOfDigits, int startIndex, int endIndex, int typeHexLength) {
      int digits = endIndex - startIndex;
      if (digits < 1) {
         throwInvalidNumberOfDigits($this$checkNumberOfDigits, startIndex, endIndex, "at least", 1);
      } else if (digits > typeHexLength) {
         checkZeroDigits($this$checkNumberOfDigits, startIndex, startIndex + digits - typeHexLength);
      }

   }

   private static final void checkZeroDigits(String $this$checkZeroDigits, int startIndex, int endIndex) {
      for(int index = startIndex; index < endIndex; ++index) {
         if ($this$checkZeroDigits.charAt(index) != '0') {
            throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + index + ", but was '" + $this$checkZeroDigits.charAt(index) + "'.\nThe result won't fit the type being parsed.");
         }
      }

   }

   private static final int parseInt(String $this$parseInt, int startIndex, int endIndex) {
      int result = 0;

      for(int i = startIndex; i < endIndex; ++i) {
         int var10000 = result << 4;
         int $i$f$decimalFromHexDigitAt = false;
         int code$iv = $this$parseInt.charAt(i);
         if (code$iv >>> 8 != 0 || HEX_DIGITS_TO_DECIMAL[code$iv] < 0) {
            throwInvalidDigitAt($this$parseInt, i);
            throw new KotlinNothingValueException();
         }

         result = var10000 | HEX_DIGITS_TO_DECIMAL[code$iv];
      }

      return result;
   }

   private static final long parseLong(String $this$parseLong, int startIndex, int endIndex) {
      long result = 0L;

      for(int i = startIndex; i < endIndex; ++i) {
         long var10000 = result << 4;
         int $i$f$longDecimalFromHexDigitAt = false;
         int code$iv = $this$parseLong.charAt(i);
         if (code$iv >>> 8 != 0 || HEX_DIGITS_TO_LONG_DECIMAL[code$iv] < 0L) {
            throwInvalidDigitAt($this$parseLong, i);
            throw new KotlinNothingValueException();
         }

         result = var10000 | HEX_DIGITS_TO_LONG_DECIMAL[code$iv];
      }

      return result;
   }

   private static final int checkContainsAt(String $this$checkContainsAt, int index, int endIndex, String part, boolean ignoreCase, String partName) {
      int $i$f$checkContainsAt = false;
      if (((CharSequence)part).length() == 0) {
         return index;
      } else {
         int i = 0;

         for(int var8 = ((CharSequence)part).length(); i < var8; ++i) {
            if (!CharsKt.equals(part.charAt(i), $this$checkContainsAt.charAt(index + i), ignoreCase)) {
               throwNotContainedAt($this$checkContainsAt, index, endIndex, part, partName);
            }
         }

         return index + part.length();
      }
   }

   private static final int decimalFromHexDigitAt(String $this$decimalFromHexDigitAt, int index) {
      int $i$f$decimalFromHexDigitAt = false;
      int code = $this$decimalFromHexDigitAt.charAt(index);
      if (code >>> 8 == 0 && HEX_DIGITS_TO_DECIMAL[code] >= 0) {
         return HEX_DIGITS_TO_DECIMAL[code];
      } else {
         throwInvalidDigitAt($this$decimalFromHexDigitAt, index);
         throw new KotlinNothingValueException();
      }
   }

   private static final long longDecimalFromHexDigitAt(String $this$longDecimalFromHexDigitAt, int index) {
      int $i$f$longDecimalFromHexDigitAt = false;
      int code = $this$longDecimalFromHexDigitAt.charAt(index);
      if (code >>> 8 == 0 && HEX_DIGITS_TO_LONG_DECIMAL[code] >= 0L) {
         return HEX_DIGITS_TO_LONG_DECIMAL[code];
      } else {
         throwInvalidDigitAt($this$longDecimalFromHexDigitAt, index);
         throw new KotlinNothingValueException();
      }
   }

   private static final void throwInvalidNumberOfDigits(String $this$throwInvalidNumberOfDigits, int startIndex, int endIndex, String specifier, int expected) {
      Intrinsics.checkNotNull($this$throwInvalidNumberOfDigits, "null cannot be cast to non-null type java.lang.String");
      String var10000 = $this$throwInvalidNumberOfDigits.substring(startIndex, endIndex);
      Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
      String substring = var10000;
      throw new NumberFormatException("Expected " + specifier + ' ' + expected + " hexadecimal digits at index " + startIndex + ", but was \"" + substring + "\" of length " + (endIndex - startIndex));
   }

   private static final void throwNotContainedAt(String $this$throwNotContainedAt, int index, int endIndex, String part, String partName) {
      int var7 = RangesKt.coerceAtMost(index + part.length(), endIndex);
      Intrinsics.checkNotNull($this$throwNotContainedAt, "null cannot be cast to non-null type java.lang.String");
      String var10000 = $this$throwNotContainedAt.substring(index, var7);
      Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
      String substring = var10000;
      throw new NumberFormatException("Expected " + partName + " \"" + part + "\" at index " + index + ", but was " + substring);
   }

   private static final void throwInvalidPrefixSuffix(String $this$throwInvalidPrefixSuffix, int startIndex, int endIndex, String prefix, String suffix) {
      Intrinsics.checkNotNull($this$throwInvalidPrefixSuffix, "null cannot be cast to non-null type java.lang.String");
      String var10000 = $this$throwInvalidPrefixSuffix.substring(startIndex, endIndex);
      Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
      String substring = var10000;
      throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + prefix + "\" and suffix \"" + suffix + "\", but was " + substring);
   }

   private static final Void throwInvalidDigitAt(String $this$throwInvalidDigitAt, int index) {
      throw new NumberFormatException("Expected a hexadecimal digit at index " + index + ", but was " + $this$throwInvalidDigitAt.charAt(index));
   }

   static {
      int var0 = 0;

      int[] $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242;
      for($this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242 = new int[256]; var0 < 256; ++var0) {
         $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242[var0] = "0123456789abcdef".charAt(var0 >> 4) << 8 | "0123456789abcdef".charAt(var0 & 15);
      }

      BYTE_TO_LOWER_CASE_HEX_DIGITS = $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242;
      var0 = 0;

      for($this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242 = new int[256]; var0 < 256; ++var0) {
         $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242[var0] = "0123456789ABCDEF".charAt(var0 >> 4) << 8 | "0123456789ABCDEF".charAt(var0 & 15);
      }

      BYTE_TO_UPPER_CASE_HEX_DIGITS = $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242;
      var0 = 0;

      for($this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242 = new int[256]; var0 < 256; ++var0) {
         $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242[var0] = -1;
      }

      int[] var11 = $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242;
      $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242 = $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242;
      int var2 = false;
      CharSequence $this$forEachIndexed$iv = (CharSequence)"0123456789abcdef";
      int $i$f$forEachIndexed = false;
      int index$iv = 0;

      int var6;
      char item$iv;
      int index;
      boolean var10;
      for(var6 = 0; var6 < $this$forEachIndexed$iv.length(); ++var6) {
         item$iv = $this$forEachIndexed$iv.charAt(var6);
         index = index$iv++;
         var10 = false;
         $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242[item$iv] = index;
      }

      $this$forEachIndexed$iv = (CharSequence)"0123456789ABCDEF";
      $i$f$forEachIndexed = false;
      index$iv = 0;

      for(var6 = 0; var6 < $this$forEachIndexed$iv.length(); ++var6) {
         item$iv = $this$forEachIndexed$iv.charAt(var6);
         index = index$iv++;
         var10 = false;
         $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242[item$iv] = index;
      }

      HEX_DIGITS_TO_DECIMAL = var11;
      var0 = 0;

      long[] $this$HEX_DIGITS_TO_LONG_DECIMAL_u24lambda_u245;
      for($this$HEX_DIGITS_TO_LONG_DECIMAL_u24lambda_u245 = new long[256]; var0 < 256; ++var0) {
         $this$HEX_DIGITS_TO_LONG_DECIMAL_u24lambda_u245[var0] = -1L;
      }

      long[] var13 = $this$HEX_DIGITS_TO_LONG_DECIMAL_u24lambda_u245;
      $this$HEX_DIGITS_TO_LONG_DECIMAL_u24lambda_u245 = $this$HEX_DIGITS_TO_LONG_DECIMAL_u24lambda_u245;
      var2 = false;
      $this$forEachIndexed$iv = (CharSequence)"0123456789abcdef";
      $i$f$forEachIndexed = false;
      index$iv = 0;

      for(var6 = 0; var6 < $this$forEachIndexed$iv.length(); ++var6) {
         item$iv = $this$forEachIndexed$iv.charAt(var6);
         index = index$iv++;
         var10 = false;
         $this$HEX_DIGITS_TO_LONG_DECIMAL_u24lambda_u245[item$iv] = (long)index;
      }

      $this$forEachIndexed$iv = (CharSequence)"0123456789ABCDEF";
      $i$f$forEachIndexed = false;
      index$iv = 0;

      for(var6 = 0; var6 < $this$forEachIndexed$iv.length(); ++var6) {
         item$iv = $this$forEachIndexed$iv.charAt(var6);
         index = index$iv++;
         var10 = false;
         $this$HEX_DIGITS_TO_LONG_DECIMAL_u24lambda_u245[item$iv] = (long)index;
      }

      HEX_DIGITS_TO_LONG_DECIMAL = var13;
   }
}
