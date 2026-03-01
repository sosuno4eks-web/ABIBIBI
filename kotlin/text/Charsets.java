package kotlin.text;

import java.nio.charset.Charset;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Charsets {
   @NotNull
   public static final Charsets INSTANCE = new Charsets();
   @JvmField
   @NotNull
   public static final Charset UTF_8;
   @JvmField
   @NotNull
   public static final Charset UTF_16;
   @JvmField
   @NotNull
   public static final Charset UTF_16BE;
   @JvmField
   @NotNull
   public static final Charset UTF_16LE;
   @JvmField
   @NotNull
   public static final Charset US_ASCII;
   @JvmField
   @NotNull
   public static final Charset ISO_8859_1;
   @Nullable
   private static volatile Charset utf_32;
   @Nullable
   private static volatile Charset utf_32le;
   @Nullable
   private static volatile Charset utf_32be;

   private Charsets() {
   }

   @JvmName(
      name = "UTF32"
   )
   @NotNull
   public final Charset UTF32() {
      Charset var10000 = utf_32;
      if (var10000 == null) {
         Charsets $this$_get_UTF_32__u24lambda_u240 = (Charsets)this;
         int var2 = false;
         var10000 = Charset.forName("UTF-32");
         Intrinsics.checkNotNullExpressionValue(var10000, "forName(...)");
         Charset charset = var10000;
         utf_32 = charset;
         var10000 = charset;
      }

      return var10000;
   }

   @JvmName(
      name = "UTF32_LE"
   )
   @NotNull
   public final Charset UTF32_LE() {
      Charset var10000 = utf_32le;
      if (var10000 == null) {
         Charsets $this$_get_UTF_32LE__u24lambda_u241 = (Charsets)this;
         int var2 = false;
         var10000 = Charset.forName("UTF-32LE");
         Intrinsics.checkNotNullExpressionValue(var10000, "forName(...)");
         Charset charset = var10000;
         utf_32le = charset;
         var10000 = charset;
      }

      return var10000;
   }

   @JvmName(
      name = "UTF32_BE"
   )
   @NotNull
   public final Charset UTF32_BE() {
      Charset var10000 = utf_32be;
      if (var10000 == null) {
         Charsets $this$_get_UTF_32BE__u24lambda_u242 = (Charsets)this;
         int var2 = false;
         var10000 = Charset.forName("UTF-32BE");
         Intrinsics.checkNotNullExpressionValue(var10000, "forName(...)");
         Charset charset = var10000;
         utf_32be = charset;
         var10000 = charset;
      }

      return var10000;
   }

   static {
      Charset var10000 = Charset.forName("UTF-8");
      Intrinsics.checkNotNullExpressionValue(var10000, "forName(...)");
      UTF_8 = var10000;
      var10000 = Charset.forName("UTF-16");
      Intrinsics.checkNotNullExpressionValue(var10000, "forName(...)");
      UTF_16 = var10000;
      var10000 = Charset.forName("UTF-16BE");
      Intrinsics.checkNotNullExpressionValue(var10000, "forName(...)");
      UTF_16BE = var10000;
      var10000 = Charset.forName("UTF-16LE");
      Intrinsics.checkNotNullExpressionValue(var10000, "forName(...)");
      UTF_16LE = var10000;
      var10000 = Charset.forName("US-ASCII");
      Intrinsics.checkNotNullExpressionValue(var10000, "forName(...)");
      US_ASCII = var10000;
      var10000 = Charset.forName("ISO-8859-1");
      Intrinsics.checkNotNullExpressionValue(var10000, "forName(...)");
      ISO_8859_1 = var10000;
   }
}
