package kotlinx.serialization.internal;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class InternalHexConverter {
   @NotNull
   public static final InternalHexConverter INSTANCE = new InternalHexConverter();
   @NotNull
   private static final String hexCode = "0123456789ABCDEF";

   private InternalHexConverter() {
   }

   @NotNull
   public final byte[] parseHexBinary(@NotNull String s) {
      Intrinsics.checkNotNullParameter(s, "s");
      int len = s.length();
      if (len % 2 != 0) {
         int var8 = false;
         String var9 = "HexBinary string must be even length";
         throw new IllegalArgumentException(var9.toString());
      } else {
         byte[] bytes = new byte[len / 2];

         for(int i = 0; i < len; i += 2) {
            int h = this.hexToInt(s.charAt(i));
            int l = this.hexToInt(s.charAt(i + 1));
            if (h == -1 || l == -1) {
               int var7 = false;
               String var10 = "Invalid hex chars: " + s.charAt(i) + s.charAt(i + 1);
               throw new IllegalArgumentException(var10.toString());
            }

            bytes[i / 2] = (byte)((h << 4) + l);
         }

         return bytes;
      }
   }

   private final int hexToInt(char ch) {
      return ('0' <= ch ? ch < ':' : false) ? ch - 48 : (('A' <= ch ? ch < 'G' : false) ? ch - 65 + 10 : (('a' <= ch ? ch < 'g' : false) ? ch - 97 + 10 : -1));
   }

   @NotNull
   public final String printHexBinary(@NotNull byte[] data, boolean lowerCase) {
      Intrinsics.checkNotNullParameter(data, "data");
      StringBuilder r = new StringBuilder(data.length * 2);
      int var4 = 0;

      for(int var5 = data.length; var4 < var5; ++var4) {
         byte b = data[var4];
         r.append("0123456789ABCDEF".charAt(b >> 4 & 15));
         r.append("0123456789ABCDEF".charAt(b & 15));
      }

      String var10000;
      if (lowerCase) {
         var10000 = r.toString();
         Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
         var10000 = var10000.toLowerCase(Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
      } else {
         var10000 = r.toString();
         Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      }

      return var10000;
   }

   // $FF: synthetic method
   public static String printHexBinary$default(InternalHexConverter var0, byte[] var1, boolean var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = false;
      }

      return var0.printHexBinary(var1, var2);
   }

   @NotNull
   public final String toHexString(int n) {
      byte[] arr = new byte[4];

      for(int i = 0; i < 4; ++i) {
         arr[i] = (byte)(n >> 24 - i * 8);
      }

      String var10000 = this.printHexBinary(arr, true);
      char[] var4 = new char[]{'0'};
      String var7 = StringsKt.trimStart(var10000, var4);
      int var6 = false;
      var10000 = ((CharSequence)var7).length() > 0 ? var7 : null;
      if (var10000 == null) {
         var10000 = "0";
      }

      return var10000;
   }
}
