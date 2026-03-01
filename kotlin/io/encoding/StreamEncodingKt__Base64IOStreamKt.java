package kotlin.io.encoding;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class StreamEncodingKt__Base64IOStreamKt {
   @SinceKotlin(
      version = "1.8"
   )
   @ExperimentalEncodingApi
   @NotNull
   public static final InputStream decodingWith(@NotNull InputStream $this$decodingWith, @NotNull Base64 base64) {
      Intrinsics.checkNotNullParameter($this$decodingWith, "<this>");
      Intrinsics.checkNotNullParameter(base64, "base64");
      return (InputStream)(new DecodeInputStream($this$decodingWith, base64));
   }

   @SinceKotlin(
      version = "1.8"
   )
   @ExperimentalEncodingApi
   @NotNull
   public static final OutputStream encodingWith(@NotNull OutputStream $this$encodingWith, @NotNull Base64 base64) {
      Intrinsics.checkNotNullParameter($this$encodingWith, "<this>");
      Intrinsics.checkNotNullParameter(base64, "base64");
      return (OutputStream)(new EncodeOutputStream($this$encodingWith, base64));
   }

   public StreamEncodingKt__Base64IOStreamKt() {
   }
}
