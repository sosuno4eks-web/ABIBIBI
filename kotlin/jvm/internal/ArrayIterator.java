package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

final class ArrayIterator<T> implements Iterator<T>, KMappedMarker {
   @NotNull
   private final T[] array;
   private int index;

   public ArrayIterator(@NotNull T[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      super();
      this.array = array;
   }

   @NotNull
   public final T[] getArray() {
      return this.array;
   }

   public boolean hasNext() {
      return this.index < this.array.length;
   }

   public T next() {
      try {
         Object[] var10000 = this.array;
         int var1 = this.index++;
         Object var4 = var10000[var1];
         return var4;
      } catch (ArrayIndexOutOfBoundsException var3) {
         --this.index;
         throw new NoSuchElementException(var3.getMessage());
      }
   }

   public void remove() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }
}
