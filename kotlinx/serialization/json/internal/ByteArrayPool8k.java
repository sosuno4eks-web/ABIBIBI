package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ByteArrayPool8k extends ByteArrayPoolBase {
   @NotNull
   public static final ByteArrayPool8k INSTANCE = new ByteArrayPool8k();

   private ByteArrayPool8k() {
   }

   @NotNull
   public final byte[] take() {
      return super.take(8196);
   }

   public final void release(@NotNull byte[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      this.releaseImpl(array);
   }
}
