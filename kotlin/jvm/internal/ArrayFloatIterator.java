package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.FloatIterator;
import org.jetbrains.annotations.NotNull;

final class ArrayFloatIterator extends FloatIterator {
   @NotNull
   private final float[] array;
   private int index;

   public ArrayFloatIterator(@NotNull float[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      super();
      this.array = array;
   }

   public boolean hasNext() {
      return this.index < this.array.length;
   }

   public float nextFloat() {
      try {
         float[] var10000 = this.array;
         int var1 = this.index++;
         float var4 = var10000[var1];
         return var4;
      } catch (ArrayIndexOutOfBoundsException var3) {
         --this.index;
         throw new NoSuchElementException(var3.getMessage());
      }
   }
}
