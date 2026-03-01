package kotlin.io.encoding;

import java.nio.charset.Charset;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.AbstractList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(
   version = "2.2"
)
@WasExperimental(
   markerClass = {ExperimentalEncodingApi.class}
)
public class Base64 {
   @NotNull
   public static final Base64.Default Default = new Base64.Default((DefaultConstructorMarker)null);
   private final boolean isUrlSafe;
   private final boolean isMimeScheme;
   private final int mimeLineLength;
   @NotNull
   private final Base64.PaddingOption paddingOption;
   private final int mimeGroupsPerLine;
   private static final int bitsPerByte = 8;
   private static final int bitsPerSymbol = 6;
   public static final int bytesPerGroup = 3;
   public static final int symbolsPerGroup = 4;
   public static final byte padSymbol = 61;
   private static final int lineLengthMime = 76;
   private static final int lineLengthPem = 64;
   @NotNull
   private static final byte[] mimeLineSeparatorSymbols;
   @NotNull
   private static final Base64 UrlSafe;
   @NotNull
   private static final Base64 Mime;
   @NotNull
   private static final Base64 Pem;

   private Base64(boolean isUrlSafe, boolean isMimeScheme, int mimeLineLength, Base64.PaddingOption paddingOption) {
      this.isUrlSafe = isUrlSafe;
      this.isMimeScheme = isMimeScheme;
      this.mimeLineLength = mimeLineLength;
      this.paddingOption = paddingOption;
      if (this.isUrlSafe && this.isMimeScheme) {
         String var5 = "Failed requirement.";
         throw new IllegalArgumentException(var5.toString());
      } else {
         this.mimeGroupsPerLine = this.mimeLineLength / 4;
      }
   }

   public final boolean isUrlSafe$kotlin_stdlib() {
      return this.isUrlSafe;
   }

   public final boolean isMimeScheme$kotlin_stdlib() {
      return this.isMimeScheme;
   }

   public final int getMimeLineLength$kotlin_stdlib() {
      return this.mimeLineLength;
   }

   @NotNull
   public final Base64.PaddingOption getPaddingOption$kotlin_stdlib() {
      return this.paddingOption;
   }

   @SinceKotlin(
      version = "2.0"
   )
   @NotNull
   public final Base64 withPadding(@NotNull Base64.PaddingOption option) {
      Intrinsics.checkNotNullParameter(option, "option");
      return this.paddingOption == option ? this : new Base64(this.isUrlSafe, this.isMimeScheme, this.mimeLineLength, option);
   }

   @NotNull
   public final byte[] encodeToByteArray(@NotNull byte[] source, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter(source, "source");
      return this.encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex);
   }

   // $FF: synthetic method
   public static byte[] encodeToByteArray$default(Base64 var0, byte[] var1, int var2, int var3, int var4, Object var5) {
      if (var5 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
      } else {
         if ((var4 & 2) != 0) {
            var2 = 0;
         }

         if ((var4 & 4) != 0) {
            var3 = var1.length;
         }

         return var0.encodeToByteArray(var1, var2, var3);
      }
   }

   public final int encodeIntoByteArray(@NotNull byte[] source, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter(source, "source");
      Intrinsics.checkNotNullParameter(destination, "destination");
      return this.encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, destinationOffset, startIndex, endIndex);
   }

   // $FF: synthetic method
   public static int encodeIntoByteArray$default(Base64 var0, byte[] var1, byte[] var2, int var3, int var4, int var5, int var6, Object var7) {
      if (var7 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
      } else {
         if ((var6 & 4) != 0) {
            var3 = 0;
         }

         if ((var6 & 8) != 0) {
            var4 = 0;
         }

         if ((var6 & 16) != 0) {
            var5 = var1.length;
         }

         return var0.encodeIntoByteArray(var1, var2, var3, var4, var5);
      }
   }

   @NotNull
   public final String encode(@NotNull byte[] source, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter(source, "source");
      byte[] var4 = this.encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex);
      return new String(var4, Charsets.ISO_8859_1);
   }

   // $FF: synthetic method
   public static String encode$default(Base64 var0, byte[] var1, int var2, int var3, int var4, Object var5) {
      if (var5 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
      } else {
         if ((var4 & 2) != 0) {
            var2 = 0;
         }

         if ((var4 & 4) != 0) {
            var3 = var1.length;
         }

         return var0.encode(var1, var2, var3);
      }
   }

   @NotNull
   public final <A extends Appendable> A encodeToAppendable(@NotNull byte[] source, @NotNull A destination, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter(source, "source");
      Intrinsics.checkNotNullParameter(destination, "destination");
      byte[] var6 = this.encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex);
      String stringResult = new String(var6, Charsets.ISO_8859_1);
      destination.append((CharSequence)stringResult);
      return destination;
   }

   // $FF: synthetic method
   public static Appendable encodeToAppendable$default(Base64 var0, byte[] var1, Appendable var2, int var3, int var4, int var5, Object var6) {
      if (var6 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
      } else {
         if ((var5 & 4) != 0) {
            var3 = 0;
         }

         if ((var5 & 8) != 0) {
            var4 = var1.length;
         }

         return var0.encodeToAppendable(var1, var2, var3, var4);
      }
   }

   @NotNull
   public final byte[] decode(@NotNull byte[] source, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter(source, "source");
      this.checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
      int decodeSize = this.decodeSize$kotlin_stdlib(source, startIndex, endIndex);
      byte[] destination = new byte[decodeSize];
      int bytesWritten = this.decodeImpl(source, destination, 0, startIndex, endIndex);
      if (bytesWritten != destination.length) {
         throw new IllegalStateException("Check failed.");
      } else {
         return destination;
      }
   }

   // $FF: synthetic method
   public static byte[] decode$default(Base64 var0, byte[] var1, int var2, int var3, int var4, Object var5) {
      if (var5 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
      } else {
         if ((var4 & 2) != 0) {
            var2 = 0;
         }

         if ((var4 & 4) != 0) {
            var3 = var1.length;
         }

         return var0.decode(var1, var2, var3);
      }
   }

   public final int decodeIntoByteArray(@NotNull byte[] source, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter(source, "source");
      Intrinsics.checkNotNullParameter(destination, "destination");
      this.checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
      this.checkDestinationBounds(destination.length, destinationOffset, this.decodeSize$kotlin_stdlib(source, startIndex, endIndex));
      return this.decodeImpl(source, destination, destinationOffset, startIndex, endIndex);
   }

   // $FF: synthetic method
   public static int decodeIntoByteArray$default(Base64 var0, byte[] var1, byte[] var2, int var3, int var4, int var5, int var6, Object var7) {
      if (var7 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
      } else {
         if ((var6 & 4) != 0) {
            var3 = 0;
         }

         if ((var6 & 8) != 0) {
            var4 = 0;
         }

         if ((var6 & 16) != 0) {
            var5 = var1.length;
         }

         return var0.decodeIntoByteArray(var1, var2, var3, var4, var5);
      }
   }

   @NotNull
   public final byte[] decode(@NotNull CharSequence source, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter(source, "source");
      byte[] var8;
      if (source instanceof String) {
         this.checkSourceBounds$kotlin_stdlib(((String)source).length(), startIndex, endIndex);
         String var10000 = ((String)source).substring(startIndex, endIndex);
         Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
         String var6 = var10000;
         Charset var7 = Charsets.ISO_8859_1;
         Intrinsics.checkNotNull(var6, "null cannot be cast to non-null type java.lang.String");
         var8 = var6.getBytes(var7);
         Intrinsics.checkNotNullExpressionValue(var8, "getBytes(...)");
      } else {
         var8 = this.charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
      }

      byte[] byteSource = var8;
      return decode$default(this, (byte[])byteSource, 0, 0, 6, (Object)null);
   }

   // $FF: synthetic method
   public static byte[] decode$default(Base64 var0, CharSequence var1, int var2, int var3, int var4, Object var5) {
      if (var5 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
      } else {
         if ((var4 & 2) != 0) {
            var2 = 0;
         }

         if ((var4 & 4) != 0) {
            var3 = var1.length();
         }

         return var0.decode(var1, var2, var3);
      }
   }

   public final int decodeIntoByteArray(@NotNull CharSequence source, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter(source, "source");
      Intrinsics.checkNotNullParameter(destination, "destination");
      byte[] var10;
      if (source instanceof String) {
         this.checkSourceBounds$kotlin_stdlib(((String)source).length(), startIndex, endIndex);
         String var10000 = ((String)source).substring(startIndex, endIndex);
         Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
         String var8 = var10000;
         Charset var9 = Charsets.ISO_8859_1;
         Intrinsics.checkNotNull(var8, "null cannot be cast to non-null type java.lang.String");
         var10 = var8.getBytes(var9);
         Intrinsics.checkNotNullExpressionValue(var10, "getBytes(...)");
      } else {
         var10 = this.charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
      }

      byte[] byteSource = var10;
      return decodeIntoByteArray$default(this, (byte[])byteSource, destination, destinationOffset, 0, 0, 24, (Object)null);
   }

   // $FF: synthetic method
   public static int decodeIntoByteArray$default(Base64 var0, CharSequence var1, byte[] var2, int var3, int var4, int var5, int var6, Object var7) {
      if (var7 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
      } else {
         if ((var6 & 4) != 0) {
            var3 = 0;
         }

         if ((var6 & 8) != 0) {
            var4 = 0;
         }

         if ((var6 & 16) != 0) {
            var5 = var1.length();
         }

         return var0.decodeIntoByteArray(var1, var2, var3, var4, var5);
      }
   }

   @NotNull
   public final byte[] encodeToByteArrayImpl$kotlin_stdlib(@NotNull byte[] source, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter(source, "source");
      this.checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
      int encodeSize = this.encodeSize$kotlin_stdlib(endIndex - startIndex);
      byte[] destination = new byte[encodeSize];
      this.encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, 0, startIndex, endIndex);
      return destination;
   }

   public final int encodeIntoByteArrayImpl$kotlin_stdlib(@NotNull byte[] source, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter(source, "source");
      Intrinsics.checkNotNullParameter(destination, "destination");
      this.checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
      this.checkDestinationBounds(destination.length, destinationOffset, this.encodeSize$kotlin_stdlib(endIndex - startIndex));
      byte[] encodeMap = this.isUrlSafe ? Base64Kt.access$getBase64UrlEncodeMap$p() : Base64Kt.access$getBase64EncodeMap$p();
      int sourceIndex = startIndex;
      int destinationIndex = destinationOffset;
      int groupsPerLine = this.isMimeScheme ? this.mimeGroupsPerLine : Integer.MAX_VALUE;

      int byte1;
      int byte1;
      int byte2;
      while(sourceIndex + 2 < endIndex) {
         int groups = Math.min((endIndex - sourceIndex) / 3, groupsPerLine);

         for(byte1 = 0; byte1 < groups; ++byte1) {
            byte1 = source[sourceIndex++] & 255;
            byte2 = source[sourceIndex++] & 255;
            int byte3 = source[sourceIndex++] & 255;
            int bits = byte1 << 16 | byte2 << 8 | byte3;
            destination[destinationIndex++] = encodeMap[bits >>> 18];
            destination[destinationIndex++] = encodeMap[bits >>> 12 & 63];
            destination[destinationIndex++] = encodeMap[bits >>> 6 & 63];
            destination[destinationIndex++] = encodeMap[bits & 63];
         }

         if (groups == groupsPerLine && sourceIndex != endIndex) {
            destination[destinationIndex++] = mimeLineSeparatorSymbols[0];
            destination[destinationIndex++] = mimeLineSeparatorSymbols[1];
         }
      }

      switch(endIndex - sourceIndex) {
      case 1:
         byte1 = source[sourceIndex++] & 255;
         byte1 = byte1 << 4;
         destination[destinationIndex++] = encodeMap[byte1 >>> 6];
         destination[destinationIndex++] = encodeMap[byte1 & 63];
         if (this.shouldPadOnEncode()) {
            destination[destinationIndex++] = 61;
            destination[destinationIndex++] = 61;
         }
         break;
      case 2:
         byte1 = source[sourceIndex++] & 255;
         byte1 = source[sourceIndex++] & 255;
         byte2 = byte1 << 10 | byte1 << 2;
         destination[destinationIndex++] = encodeMap[byte2 >>> 12];
         destination[destinationIndex++] = encodeMap[byte2 >>> 6 & 63];
         destination[destinationIndex++] = encodeMap[byte2 & 63];
         if (this.shouldPadOnEncode()) {
            destination[destinationIndex++] = 61;
         }
      }

      if (sourceIndex != endIndex) {
         throw new IllegalStateException("Check failed.");
      } else {
         return destinationIndex - destinationOffset;
      }
   }

   public final int encodeSize$kotlin_stdlib(int sourceSize) {
      int groups = sourceSize / 3;
      int trailingBytes = sourceSize % 3;
      int size = groups * 4;
      if (trailingBytes != 0) {
         size += this.shouldPadOnEncode() ? 4 : trailingBytes + 1;
      }

      if (size < 0) {
         throw new IllegalArgumentException("Input is too big");
      } else {
         if (this.isMimeScheme) {
            size += (size - 1) / this.mimeLineLength * 2;
         }

         if (size < 0) {
            throw new IllegalArgumentException("Input is too big");
         } else {
            return size;
         }
      }
   }

   private final boolean shouldPadOnEncode() {
      return this.paddingOption == Base64.PaddingOption.PRESENT || this.paddingOption == Base64.PaddingOption.PRESENT_OPTIONAL;
   }

   private final int decodeImpl(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
      int[] decodeMap = this.isUrlSafe ? Base64Kt.access$getBase64UrlDecodeMap$p() : Base64Kt.access$getBase64DecodeMap$p();
      int payload = 0;
      int byteStart = -8;
      int sourceIndex = startIndex;
      int destinationIndex = destinationOffset;
      boolean hasPadding = false;

      int symbol;
      StringBuilder var17;
      String var10003;
      while(sourceIndex < endIndex) {
         int symbolBits;
         if (byteStart == -8 && sourceIndex + 3 < endIndex) {
            symbol = decodeMap[source[sourceIndex++] & 255];
            symbolBits = decodeMap[source[sourceIndex++] & 255];
            int symbol3 = decodeMap[source[sourceIndex++] & 255];
            int symbol4 = decodeMap[source[sourceIndex++] & 255];
            int bits = symbol << 18 | symbolBits << 12 | symbol3 << 6 | symbol4;
            if (bits >= 0) {
               destination[destinationIndex++] = (byte)(bits >> 16);
               destination[destinationIndex++] = (byte)(bits >> 8);
               destination[destinationIndex++] = (byte)bits;
               continue;
            }

            sourceIndex -= 4;
         }

         symbol = source[sourceIndex] & 255;
         symbolBits = decodeMap[symbol];
         if (symbolBits < 0) {
            if (symbolBits == -2) {
               hasPadding = true;
               sourceIndex = this.handlePaddingSymbol(source, sourceIndex, endIndex, byteStart);
               break;
            }

            if (!this.isMimeScheme) {
               var17 = (new StringBuilder()).append("Invalid symbol '").append((char)symbol).append("'(");
               var10003 = Integer.toString(symbol, CharsKt.checkRadix(8));
               Intrinsics.checkNotNullExpressionValue(var10003, "toString(...)");
               throw new IllegalArgumentException(var17.append(var10003).append(") at index ").append(sourceIndex).toString());
            }

            ++sourceIndex;
         } else {
            ++sourceIndex;
            payload = payload << 6 | symbolBits;
            byteStart += 6;
            if (byteStart >= 0) {
               destination[destinationIndex++] = (byte)(payload >>> byteStart);
               payload &= (1 << byteStart) - 1;
               byteStart -= 8;
            }
         }
      }

      if (byteStart == -2) {
         throw new IllegalArgumentException("The last unit of input does not have enough bits");
      } else if (byteStart != -8 && !hasPadding && this.paddingOption == Base64.PaddingOption.PRESENT) {
         throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
      } else if (payload != 0) {
         throw new IllegalArgumentException("The pad bits must be zeros");
      } else {
         sourceIndex = this.skipIllegalSymbolsIfMime(source, sourceIndex, endIndex);
         if (sourceIndex < endIndex) {
            symbol = source[sourceIndex] & 255;
            var17 = (new StringBuilder()).append("Symbol '").append((char)symbol).append("'(");
            var10003 = Integer.toString(symbol, CharsKt.checkRadix(8));
            Intrinsics.checkNotNullExpressionValue(var10003, "toString(...)");
            throw new IllegalArgumentException(var17.append(var10003).append(") at index ").append(sourceIndex - 1).append(" is prohibited after the pad character").toString());
         } else {
            return destinationIndex - destinationOffset;
         }
      }
   }

   public final int decodeSize$kotlin_stdlib(@NotNull byte[] source, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter(source, "source");
      int symbols = endIndex - startIndex;
      if (symbols == 0) {
         return 0;
      } else if (symbols == 1) {
         throw new IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + startIndex + ", endIndex: " + endIndex);
      } else {
         if (this.isMimeScheme) {
            for(int index = startIndex; index < endIndex; ++index) {
               int symbol = source[index] & 255;
               int symbolBits = Base64Kt.access$getBase64DecodeMap$p()[symbol];
               if (symbolBits < 0) {
                  if (symbolBits == -2) {
                     symbols -= endIndex - index;
                     break;
                  }

                  --symbols;
               }
            }
         } else if (source[endIndex - 1] == 61) {
            --symbols;
            if (source[endIndex - 2] == 61) {
               --symbols;
            }
         }

         return (int)((long)symbols * (long)6 / (long)8);
      }
   }

   @NotNull
   public final byte[] charsToBytesImpl$kotlin_stdlib(@NotNull CharSequence source, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter(source, "source");
      this.checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex);
      byte[] byteArray = new byte[endIndex - startIndex];
      int length = 0;

      for(int index = startIndex; index < endIndex; ++index) {
         int symbol = source.charAt(index);
         if (symbol <= 255) {
            byteArray[length++] = (byte)symbol;
         } else {
            byteArray[length++] = 63;
         }
      }

      return byteArray;
   }

   @NotNull
   public final String bytesToStringImpl$kotlin_stdlib(@NotNull byte[] source) {
      Intrinsics.checkNotNullParameter(source, "source");
      StringBuilder stringBuilder = new StringBuilder(source.length);
      int var3 = 0;

      for(int var4 = source.length; var3 < var4; ++var3) {
         byte var5 = source[var3];
         stringBuilder.append((char)var5);
      }

      return stringBuilder.toString();
   }

   private final int handlePaddingSymbol(byte[] source, int padIndex, int endIndex, int byteStart) {
      int var10000;
      switch(byteStart) {
      case -8:
         throw new IllegalArgumentException("Redundant pad character at index " + padIndex);
      case -7:
      case -5:
      case -3:
      default:
         throw new IllegalStateException("Unreachable".toString());
      case -6:
         this.checkPaddingIsAllowed(padIndex);
         var10000 = padIndex + 1;
         break;
      case -4:
         this.checkPaddingIsAllowed(padIndex);
         int secondPadIndex = this.skipIllegalSymbolsIfMime(source, padIndex + 1, endIndex);
         if (secondPadIndex == endIndex || source[secondPadIndex] != 61) {
            throw new IllegalArgumentException("Missing one pad character at index " + secondPadIndex);
         }

         var10000 = secondPadIndex + 1;
         break;
      case -2:
         var10000 = padIndex + 1;
      }

      return var10000;
   }

   private final void checkPaddingIsAllowed(int padIndex) {
      if (this.paddingOption == Base64.PaddingOption.ABSENT) {
         throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index " + padIndex);
      }
   }

   private final int skipIllegalSymbolsIfMime(byte[] source, int startIndex, int endIndex) {
      if (!this.isMimeScheme) {
         return startIndex;
      } else {
         int sourceIndex;
         for(sourceIndex = startIndex; sourceIndex < endIndex; ++sourceIndex) {
            int symbol = source[sourceIndex] & 255;
            if (Base64Kt.access$getBase64DecodeMap$p()[symbol] != -1) {
               return sourceIndex;
            }
         }

         return sourceIndex;
      }
   }

   public final void checkSourceBounds$kotlin_stdlib(int sourceSize, int startIndex, int endIndex) {
      AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, sourceSize);
   }

   private final void checkDestinationBounds(int destinationSize, int destinationOffset, int capacityNeeded) {
      if (destinationOffset >= 0 && destinationOffset <= destinationSize) {
         int destinationEndIndex = destinationOffset + capacityNeeded;
         if (destinationEndIndex < 0 || destinationEndIndex > destinationSize) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + destinationOffset + ", destination size: " + destinationSize + ", capacity needed: " + capacityNeeded);
         }
      } else {
         throw new IndexOutOfBoundsException("destination offset: " + destinationOffset + ", destination size: " + destinationSize);
      }
   }

   // $FF: synthetic method
   public Base64(boolean isUrlSafe, boolean isMimeScheme, int mimeLineLength, Base64.PaddingOption paddingOption, DefaultConstructorMarker $constructor_marker) {
      this(isUrlSafe, isMimeScheme, mimeLineLength, paddingOption);
   }

   static {
      byte[] var0 = new byte[]{13, 10};
      mimeLineSeparatorSymbols = var0;
      UrlSafe = new Base64(true, false, -1, Base64.PaddingOption.PRESENT);
      Mime = new Base64(false, true, 76, Base64.PaddingOption.PRESENT);
      Pem = new Base64(false, true, 64, Base64.PaddingOption.PRESENT);
   }

   public static final class Default extends Base64 {
      private Default() {
         super(false, false, -1, Base64.PaddingOption.PRESENT, (DefaultConstructorMarker)null);
      }

      @NotNull
      public final byte[] getMimeLineSeparatorSymbols$kotlin_stdlib() {
         return Base64.mimeLineSeparatorSymbols;
      }

      @NotNull
      public final Base64 getUrlSafe() {
         return Base64.UrlSafe;
      }

      @NotNull
      public final Base64 getMime() {
         return Base64.Mime;
      }

      @NotNull
      public final Base64 getPem() {
         return Base64.Pem;
      }

      // $FF: synthetic method
      public Default(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }

   @SinceKotlin(
      version = "2.0"
   )
   public static enum PaddingOption {
      PRESENT,
      ABSENT,
      PRESENT_OPTIONAL,
      ABSENT_OPTIONAL;

      // $FF: synthetic field
      private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

      @NotNull
      public static EnumEntries<Base64.PaddingOption> getEntries() {
         return $ENTRIES;
      }

      // $FF: synthetic method
      private static final Base64.PaddingOption[] $values() {
         Base64.PaddingOption[] var0 = new Base64.PaddingOption[]{PRESENT, ABSENT, PRESENT_OPTIONAL, ABSENT_OPTIONAL};
         return var0;
      }
   }
}
