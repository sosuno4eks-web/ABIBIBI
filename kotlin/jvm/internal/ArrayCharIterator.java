package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.CharIterator;
import org.jetbrains.annotations.NotNull;

final class ArrayCharIterator extends CharIterator {
   @NotNull
   private final char[] array;
   private int index;

   public ArrayCharIterator(@NotNull char[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      super();
      this.array = array;
   }

   public boolean hasNext() {
      return this.index < this.array.length;
   }

   public char nextChar() {
      try {
         char[] var10000 = this.array;
         int var1 = this.index++;
         char var4 = var10000[var1];
         return var4;
      } catch (ArrayIndexOutOfBoundsException var3) {
         --this.index;
         throw new NoSuchElementException(var3.getMessage());
      }
   }
}
