package kotlin.io.encoding;

import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;

public final class Base64Kt {
   @NotNull
   private static final byte[] base64EncodeMap;
   @NotNull
   private static final int[] base64DecodeMap;
   @NotNull
   private static final byte[] base64UrlEncodeMap;
   @NotNull
   private static final int[] base64UrlDecodeMap;

   @SinceKotlin(
      version = "1.8"
   )
   public static final boolean isInMimeAlphabet(int symbol) {
      return (0 <= symbol ? symbol < base64DecodeMap.length : false) && base64DecodeMap[symbol] != -1;
   }

   // $FF: synthetic method
   public static final byte[] access$getBase64UrlEncodeMap$p() {
      return base64UrlEncodeMap;
   }

   // $FF: synthetic method
   public static final byte[] access$getBase64EncodeMap$p() {
      return base64EncodeMap;
   }

   // $FF: synthetic method
   public static final int[] access$getBase64UrlDecodeMap$p() {
      return base64UrlDecodeMap;
   }

   // $FF: synthetic method
   public static final int[] access$getBase64DecodeMap$p() {
      return base64DecodeMap;
   }

   static {
      byte[] var0 = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
      base64EncodeMap = var0;
      int[] var12 = new int[256];
      int[] $this$base64UrlDecodeMap_u24lambda_u243 = var12;
      int var2 = false;
      ArraysKt.fill$default(var12, -1, 0, 0, 6, (Object)null);
      var12[61] = -2;
      byte[] $this$forEachIndexed$iv = base64EncodeMap;
      int $i$f$forEachIndexed = false;
      int index$iv = 0;
      int var6 = 0;

      int var7;
      byte item$iv;
      int index;
      boolean var11;
      for(var7 = $this$forEachIndexed$iv.length; var6 < var7; ++var6) {
         item$iv = $this$forEachIndexed$iv[var6];
         index = index$iv++;
         var11 = false;
         $this$base64UrlDecodeMap_u24lambda_u243[item$iv] = index;
      }

      base64DecodeMap = var12;
      var0 = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
      base64UrlEncodeMap = var0;
      var12 = new int[256];
      $this$base64UrlDecodeMap_u24lambda_u243 = var12;
      var2 = false;
      ArraysKt.fill$default(var12, -1, 0, 0, 6, (Object)null);
      var12[61] = -2;
      $this$forEachIndexed$iv = base64UrlEncodeMap;
      $i$f$forEachIndexed = false;
      index$iv = 0;
      var6 = 0;

      for(var7 = $this$forEachIndexed$iv.length; var6 < var7; ++var6) {
         item$iv = $this$forEachIndexed$iv[var6];
         index = index$iv++;
         var11 = false;
         $this$base64UrlDecodeMap_u24lambda_u243[item$iv] = index;
      }

      base64UrlDecodeMap = var12;
   }
}
