package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class CharArrayPool extends CharArrayPoolBase {
   @NotNull
   public static final CharArrayPool INSTANCE = new CharArrayPool();

   private CharArrayPool() {
   }

   @NotNull
   public final char[] take() {
      return super.take(128);
   }

   public final void release(@NotNull char[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      this.releaseImpl(array);
   }
}
