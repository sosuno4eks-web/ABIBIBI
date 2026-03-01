package kotlinx.serialization.json.internal;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

public final class JavaStreamSerialReader implements InternalJsonReader {
   @NotNull
   private final CharsetReader reader;

   public JavaStreamSerialReader(@NotNull InputStream stream) {
      Intrinsics.checkNotNullParameter(stream, "stream");
      super();
      this.reader = new CharsetReader(stream, Charsets.UTF_8);
   }

   public int read(@NotNull char[] buffer, int bufferOffset, int count) {
      Intrinsics.checkNotNullParameter(buffer, "buffer");
      return this.reader.read(buffer, bufferOffset, count);
   }

   public final void release() {
      this.reader.release();
   }
}
