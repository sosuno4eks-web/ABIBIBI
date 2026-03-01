package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.LongIterator;
import org.jetbrains.annotations.NotNull;

final class ArrayLongIterator extends LongIterator {
   @NotNull
   private final long[] array;
   private int index;

   public ArrayLongIterator(@NotNull long[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      super();
      this.array = array;
   }

   public boolean hasNext() {
      return this.index < this.array.length;
   }

   public long nextLong() {
      try {
         long[] var10000 = this.array;
         int var1 = this.index++;
         long var5 = var10000[var1];
         return var5;
      } catch (ArrayIndexOutOfBoundsException var4) {
         --this.index;
         throw new NoSuchElementException(var4.getMessage());
      }
   }
}
