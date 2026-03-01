package kotlinx.serialization.json.internal;

import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class ByteArrayPoolBase {
   @NotNull
   private final ArrayDeque<byte[]> arrays = new ArrayDeque();
   private int bytesTotal;

   @NotNull
   protected final byte[] take(int size) {
      // $FF: Couldn't be decompiled
   }

   protected final void releaseImpl(@NotNull byte[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      synchronized(this) {
         int var3 = false;
         if (this.bytesTotal + array.length < ArrayPoolsKt.access$getMAX_CHARS_IN_POOL$p()) {
            this.bytesTotal += array.length / 2;
            this.arrays.addLast(array);
         }

         Unit var6 = Unit.INSTANCE;
      }
   }
}
