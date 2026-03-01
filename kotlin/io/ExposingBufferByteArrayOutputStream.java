package kotlin.io;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

final class ExposingBufferByteArrayOutputStream extends ByteArrayOutputStream {
   public ExposingBufferByteArrayOutputStream(int size) {
      super(size);
   }

   @NotNull
   public final byte[] getBuffer() {
      byte[] var10000 = this.buf;
      Intrinsics.checkNotNullExpressionValue(var10000, "buf");
      return var10000;
   }
}
