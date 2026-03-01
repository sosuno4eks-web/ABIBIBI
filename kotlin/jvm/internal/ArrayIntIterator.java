package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.IntIterator;
import org.jetbrains.annotations.NotNull;

final class ArrayIntIterator extends IntIterator {
   @NotNull
   private final int[] array;
   private int index;

   public ArrayIntIterator(@NotNull int[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      super();
      this.array = array;
   }

   public boolean hasNext() {
      return this.index < this.array.length;
   }

   public int nextInt() {
      try {
         int[] var10000 = this.array;
         int var1 = this.index++;
         var1 = var10000[var1];
         return var1;
      } catch (ArrayIndexOutOfBoundsException var3) {
         --this.index;
         throw new NoSuchElementException(var3.getMessage());
      }
   }
}
