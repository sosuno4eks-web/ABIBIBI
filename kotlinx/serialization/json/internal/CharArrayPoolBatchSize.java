package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class CharArrayPoolBatchSize extends CharArrayPoolBase {
   @NotNull
   public static final CharArrayPoolBatchSize INSTANCE = new CharArrayPoolBatchSize();

   private CharArrayPoolBatchSize() {
   }

   @NotNull
   public final char[] take() {
      return super.take(16384);
   }

   public final void release(@NotNull char[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      if (array.length != 16384) {
         int var2 = false;
         String var3 = "Inconsistent internal invariant: unexpected array size " + array.length;
         throw new IllegalArgumentException(var3.toString());
      } else {
         this.releaseImpl(array);
      }
   }
}
