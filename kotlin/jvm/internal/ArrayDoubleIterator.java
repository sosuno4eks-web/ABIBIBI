package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.DoubleIterator;
import org.jetbrains.annotations.NotNull;

final class ArrayDoubleIterator extends DoubleIterator {
   @NotNull
   private final double[] array;
   private int index;

   public ArrayDoubleIterator(@NotNull double[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      super();
      this.array = array;
   }

   public boolean hasNext() {
      return this.index < this.array.length;
   }

   public double nextDouble() {
      try {
         double[] var10000 = this.array;
         int var1 = this.index++;
         double var5 = var10000[var1];
         return var5;
      } catch (ArrayIndexOutOfBoundsException var4) {
         --this.index;
         throw new NoSuchElementException(var4.getMessage());
      }
   }
}
