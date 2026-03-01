package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.BooleanIterator;
import org.jetbrains.annotations.NotNull;

final class ArrayBooleanIterator extends BooleanIterator {
   @NotNull
   private final boolean[] array;
   private int index;

   public ArrayBooleanIterator(@NotNull boolean[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      super();
      this.array = array;
   }

   public boolean hasNext() {
      return this.index < this.array.length;
   }

   public boolean nextBoolean() {
      try {
         boolean[] var10000 = this.array;
         int var1 = this.index++;
         boolean var4 = var10000[var1];
         return var4;
      } catch (ArrayIndexOutOfBoundsException var3) {
         --this.index;
         throw new NoSuchElementException(var3.getMessage());
      }
   }
}
