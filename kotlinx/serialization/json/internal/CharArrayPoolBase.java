package kotlinx.serialization.json.internal;

import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class CharArrayPoolBase {
   @NotNull
   private final ArrayDeque<char[]> arrays = new ArrayDeque();
   private int charsTotal;

   @NotNull
   protected final char[] take(int size) {
      // $FF: Couldn't be decompiled
   }

   protected final void releaseImpl(@NotNull char[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      synchronized(this) {
         int var3 = false;
         if (this.charsTotal + array.length < ArrayPoolsKt.access$getMAX_CHARS_IN_POOL$p()) {
            this.charsTotal += array.length;
            this.arrays.addLast(array);
         }

         Unit var6 = Unit.INSTANCE;
      }
   }
}
