package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.ShortIterator;
import org.jetbrains.annotations.NotNull;

final class ArrayShortIterator extends ShortIterator {
   @NotNull
   private final short[] array;
   private int index;

   public ArrayShortIterator(@NotNull short[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      super();
      this.array = array;
   }

   public boolean hasNext() {
      return this.index < this.array.length;
   }

   public short nextShort() {
      try {
         short[] var10000 = this.array;
         int var1 = this.index++;
         short var4 = var10000[var1];
         return var4;
      } catch (ArrayIndexOutOfBoundsException var3) {
         --this.index;
         throw new NoSuchElementException(var3.getMessage());
      }
   }
}
