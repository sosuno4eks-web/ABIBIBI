package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ByteArrayPool extends ByteArrayPoolBase {
   @NotNull
   public static final ByteArrayPool INSTANCE = new ByteArrayPool();

   private ByteArrayPool() {
   }

   @NotNull
   public final byte[] take() {
      return super.take(512);
   }

   public final void release(@NotNull byte[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      this.releaseImpl(array);
   }
}
