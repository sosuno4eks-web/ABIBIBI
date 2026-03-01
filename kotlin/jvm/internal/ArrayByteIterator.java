package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.ByteIterator;
import org.jetbrains.annotations.NotNull;

final class ArrayByteIterator extends ByteIterator {
   @NotNull
   private final byte[] array;
   private int index;

   public ArrayByteIterator(@NotNull byte[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      super();
      this.array = array;
   }

   public boolean hasNext() {
      return this.index < this.array.length;
   }

   public byte nextByte() {
      try {
         byte[] var10000 = this.array;
         int var1 = this.index++;
         byte var4 = var10000[var1];
         return var4;
      } catch (ArrayIndexOutOfBoundsException var3) {
         --this.index;
         throw new NoSuchElementException(var3.getMessage());
      }
   }
}
