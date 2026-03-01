package kotlin.io.encoding;

import java.nio.charset.Charset;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public final class Base64JVMKt {
   @SinceKotlin(
      version = "1.8"
   )
   @InlineOnly
   private static final byte[] platformCharsToBytes(Base64 $this$platformCharsToBytes, CharSequence source, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$platformCharsToBytes, "<this>");
      Intrinsics.checkNotNullParameter(source, "source");
      byte[] var6;
      if (source instanceof String) {
         $this$platformCharsToBytes.checkSourceBounds$kotlin_stdlib(((String)source).length(), startIndex, endIndex);
         String var10000 = ((String)source).substring(startIndex, endIndex);
         Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
         String var4 = var10000;
         Charset var5 = Charsets.ISO_8859_1;
         Intrinsics.checkNotNull(var4, "null cannot be cast to non-null type java.lang.String");
         var6 = var4.getBytes(var5);
         Intrinsics.checkNotNullExpressionValue(var6, "getBytes(...)");
      } else {
         var6 = $this$platformCharsToBytes.charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
      }

      return var6;
   }

   @SinceKotlin(
      version = "1.8"
   )
   @InlineOnly
   private static final String platformEncodeToString(Base64 $this$platformEncodeToString, byte[] source, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$platformEncodeToString, "<this>");
      Intrinsics.checkNotNullParameter(source, "source");
      byte[] byteResult = $this$platformEncodeToString.encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex);
      return new String(byteResult, Charsets.ISO_8859_1);
   }

   @SinceKotlin(
      version = "1.8"
   )
   @InlineOnly
   private static final int platformEncodeIntoByteArray(Base64 $this$platformEncodeIntoByteArray, byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$platformEncodeIntoByteArray, "<this>");
      Intrinsics.checkNotNullParameter(source, "source");
      Intrinsics.checkNotNullParameter(destination, "destination");
      return $this$platformEncodeIntoByteArray.encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, destinationOffset, startIndex, endIndex);
   }

   @SinceKotlin(
      version = "1.8"
   )
   @InlineOnly
   private static final byte[] platformEncodeToByteArray(Base64 $this$platformEncodeToByteArray, byte[] source, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$platformEncodeToByteArray, "<this>");
      Intrinsics.checkNotNullParameter(source, "source");
      return $this$platformEncodeToByteArray.encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex);
   }
}
