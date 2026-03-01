package kotlin.text;

import java.nio.charset.Charset;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@JvmName(
   name = "CharsetsKt"
)
public final class CharsetsKt {
   @InlineOnly
   private static final Charset charset(String charsetName) {
      Intrinsics.checkNotNullParameter(charsetName, "charsetName");
      Charset var10000 = Charset.forName(charsetName);
      Intrinsics.checkNotNullExpressionValue(var10000, "forName(...)");
      return var10000;
   }
}
