package kotlin.uuid;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.HexExtensionsKt;
import kotlin.text.HexFormat;
import org.jetbrains.annotations.NotNull;

class UuidKt__UuidKt extends UuidKt__UuidJVMKt {
   @ExperimentalUuidApi
   @NotNull
   public static final Uuid uuidFromRandomBytes(@NotNull byte[] randomBytes) {
      Intrinsics.checkNotNullParameter(randomBytes, "randomBytes");
      randomBytes[6] = (byte)(randomBytes[6] & 15);
      randomBytes[6] = (byte)(randomBytes[6] | 64);
      randomBytes[8] = (byte)(randomBytes[8] & 63);
      randomBytes[8] = (byte)(randomBytes[8] | 128);
      return Uuid.Companion.fromByteArray(randomBytes);
   }

   public static final long getLongAtCommonImpl(@NotNull byte[] $this$getLongAtCommonImpl, int index) {
      Intrinsics.checkNotNullParameter($this$getLongAtCommonImpl, "<this>");
      return ((long)$this$getLongAtCommonImpl[index + 0] & 255L) << 56 | ((long)$this$getLongAtCommonImpl[index + 1] & 255L) << 48 | ((long)$this$getLongAtCommonImpl[index + 2] & 255L) << 40 | ((long)$this$getLongAtCommonImpl[index + 3] & 255L) << 32 | ((long)$this$getLongAtCommonImpl[index + 4] & 255L) << 24 | ((long)$this$getLongAtCommonImpl[index + 5] & 255L) << 16 | ((long)$this$getLongAtCommonImpl[index + 6] & 255L) << 8 | (long)$this$getLongAtCommonImpl[index + 7] & 255L;
   }

   @ExperimentalUuidApi
   public static final void formatBytesIntoCommonImpl(long $this$formatBytesIntoCommonImpl, @NotNull byte[] dst, int dstOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter(dst, "dst");
      int dstIndex = dstOffset;
      int reversedIndex = 7 - startIndex;
      int var8 = 8 - endIndex;
      if (var8 <= reversedIndex) {
         while(true) {
            int shift = reversedIndex << 3;
            int var10 = (int)($this$formatBytesIntoCommonImpl >> shift & 255L);
            int byteDigits = HexExtensionsKt.getBYTE_TO_LOWER_CASE_HEX_DIGITS()[var10];
            dst[dstIndex++] = (byte)(byteDigits >> 8);
            dst[dstIndex++] = (byte)byteDigits;
            if (reversedIndex == var8) {
               break;
            }

            --reversedIndex;
         }
      }

   }

   public static final void checkHyphenAt(@NotNull String $this$checkHyphenAt, int index) {
      Intrinsics.checkNotNullParameter($this$checkHyphenAt, "<this>");
      if ($this$checkHyphenAt.charAt(index) != '-') {
         int var2 = false;
         String var3 = "Expected '-' (hyphen) at index " + index + ", but was '" + $this$checkHyphenAt.charAt(index) + '\'';
         throw new IllegalArgumentException(var3.toString());
      }
   }

   public static final void setLongAtCommonImpl(@NotNull byte[] $this$setLongAtCommonImpl, int index, long value) {
      Intrinsics.checkNotNullParameter($this$setLongAtCommonImpl, "<this>");
      int i = index;

      for(int reversedIndex = 7; -1 < reversedIndex; --reversedIndex) {
         int shift = reversedIndex << 3;
         $this$setLongAtCommonImpl[i++] = (byte)((int)(value >> shift));
      }

   }

   @ExperimentalUuidApi
   @NotNull
   public static final Uuid uuidParseHexDashCommonImpl(@NotNull String hexDashString) {
      Intrinsics.checkNotNullParameter(hexDashString, "hexDashString");
      long part1 = HexExtensionsKt.hexToLong$default(hexDashString, 0, 8, (HexFormat)null, 4, (Object)null);
      UuidKt.checkHyphenAt(hexDashString, 8);
      long part2 = HexExtensionsKt.hexToLong$default(hexDashString, 9, 13, (HexFormat)null, 4, (Object)null);
      UuidKt.checkHyphenAt(hexDashString, 13);
      long part3 = HexExtensionsKt.hexToLong$default(hexDashString, 14, 18, (HexFormat)null, 4, (Object)null);
      UuidKt.checkHyphenAt(hexDashString, 18);
      long part4 = HexExtensionsKt.hexToLong$default(hexDashString, 19, 23, (HexFormat)null, 4, (Object)null);
      UuidKt.checkHyphenAt(hexDashString, 23);
      long part5 = HexExtensionsKt.hexToLong$default(hexDashString, 24, 36, (HexFormat)null, 4, (Object)null);
      long msb = part1 << 32 | part2 << 16 | part3;
      long lsb = part4 << 48 | part5;
      return Uuid.Companion.fromLongs(msb, lsb);
   }

   @ExperimentalUuidApi
   @NotNull
   public static final Uuid uuidParseHexCommonImpl(@NotNull String hexString) {
      Intrinsics.checkNotNullParameter(hexString, "hexString");
      long msb = HexExtensionsKt.hexToLong$default(hexString, 0, 16, (HexFormat)null, 4, (Object)null);
      long lsb = HexExtensionsKt.hexToLong$default(hexString, 16, 32, (HexFormat)null, 4, (Object)null);
      return Uuid.Companion.fromLongs(msb, lsb);
   }

   private static final String truncateForErrorMessage$UuidKt__UuidKt(String $this$truncateForErrorMessage, int maxLength) {
      String var10000;
      if ($this$truncateForErrorMessage.length() <= maxLength) {
         var10000 = $this$truncateForErrorMessage;
      } else {
         StringBuilder var4 = new StringBuilder();
         byte var3 = 0;
         Intrinsics.checkNotNull($this$truncateForErrorMessage, "null cannot be cast to non-null type java.lang.String");
         String var10001 = $this$truncateForErrorMessage.substring(var3, maxLength);
         Intrinsics.checkNotNullExpressionValue(var10001, "substring(...)");
         var10000 = var4.append(var10001).append("...").toString();
      }

      return var10000;
   }

   private static final String truncateForErrorMessage$UuidKt__UuidKt(byte[] $this$truncateForErrorMessage, int maxSize) {
      return ArraysKt.joinToString$default($this$truncateForErrorMessage, (CharSequence)null, (CharSequence)"[", (CharSequence)"]", maxSize, (CharSequence)null, (Function1)null, 49, (Object)null);
   }

   // $FF: synthetic method
   public static final String access$truncateForErrorMessage(String $receiver, int maxLength) {
      return truncateForErrorMessage$UuidKt__UuidKt($receiver, maxLength);
   }

   // $FF: synthetic method
   public static final String access$truncateForErrorMessage(byte[] $receiver, int maxSize) {
      return truncateForErrorMessage$UuidKt__UuidKt($receiver, maxSize);
   }

   public UuidKt__UuidKt() {
   }
}
