package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {
   @NotNull
   private final Object[] buffer;
   private final int capacity;
   private int startIndex;
   private int size;

   public RingBuffer(@NotNull Object[] buffer, int filledSize) {
      Intrinsics.checkNotNullParameter(buffer, "buffer");
      super();
      this.buffer = buffer;
      boolean var3;
      String var4;
      if (filledSize < 0) {
         var3 = false;
         var4 = "ring buffer filled size should not be negative but it is " + filledSize;
         throw new IllegalArgumentException(var4.toString());
      } else if (filledSize > this.buffer.length) {
         var3 = false;
         var4 = "ring buffer filled size: " + filledSize + " cannot be larger than the buffer size: " + this.buffer.length;
         throw new IllegalArgumentException(var4.toString());
      } else {
         this.capacity = this.buffer.length;
         this.size = filledSize;
      }
   }

   public RingBuffer(int capacity) {
      this(new Object[capacity], 0);
   }

   public int getSize() {
      return this.size;
   }

   public T get(int index) {
      AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.size());
      int $this$forward$iv = this.startIndex;
      int $i$f$forward = false;
      return this.buffer[($this$forward$iv + index) % access$getCapacity$p(this)];
   }

   public final boolean isFull() {
      return this.size() == this.capacity;
   }

   @NotNull
   public Iterator<T> iterator() {
      return (Iterator)(new AbstractIterator<T>() {
         private int count = RingBuffer.this.size();
         private int index;

         {
            this.index = RingBuffer.this.startIndex;
         }

         protected void computeNext() {
            if (this.count == 0) {
               this.done();
            } else {
               this.setNext(RingBuffer.this.buffer[this.index]);
               RingBuffer this_$iv = RingBuffer.this;
               int $this$forward$iv = this.index;
               int n$iv = 1;
               int $i$f$forward = false;
               this.index = ($this$forward$iv + n$iv) % this_$iv.capacity;
               int var5 = this.count;
               this.count = var5 + -1;
            }

         }
      });
   }

   @NotNull
   public <T> T[] toArray(@NotNull T[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      Object[] var10000;
      if (array.length < this.size()) {
         var10000 = Arrays.copyOf(array, this.size());
         Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      } else {
         var10000 = array;
      }

      Object[] result = var10000;
      int size = this.size();
      int widx = 0;

      int idx;
      for(idx = this.startIndex; widx < size && idx < this.capacity; ++idx) {
         result[widx] = this.buffer[idx];
         ++widx;
      }

      for(idx = 0; widx < size; ++idx) {
         result[widx] = this.buffer[idx];
         ++widx;
      }

      return CollectionsKt.terminateCollectionToArray(size, result);
   }

   @NotNull
   public Object[] toArray() {
      return this.toArray(new Object[this.size()]);
   }

   @NotNull
   public final RingBuffer<T> expanded(int maxCapacity) {
      int newCapacity = RangesKt.coerceAtMost(this.capacity + (this.capacity >> 1) + 1, maxCapacity);
      Object[] var10000;
      if (this.startIndex == 0) {
         var10000 = Arrays.copyOf(this.buffer, newCapacity);
         Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      } else {
         var10000 = this.toArray(new Object[newCapacity]);
      }

      Object[] newBuffer = var10000;
      return new RingBuffer(newBuffer, this.size());
   }

   public final void add(T element) {
      if (this.isFull()) {
         throw new IllegalStateException("ring buffer is full");
      } else {
         Object[] var10000 = this.buffer;
         int $this$forward$iv = this.startIndex;
         int n$iv = this.size();
         int $i$f$forward = false;
         var10000[($this$forward$iv + n$iv) % access$getCapacity$p(this)] = element;
         int var2 = this.size();
         this.size = var2 + 1;
      }
   }

   public final void removeFirst(int n) {
      boolean var7;
      String var8;
      if (n < 0) {
         var7 = false;
         var8 = "n shouldn't be negative but it is " + n;
         throw new IllegalArgumentException(var8.toString());
      } else if (n > this.size()) {
         var7 = false;
         var8 = "n shouldn't be greater than the buffer size: n = " + n + ", size = " + this.size();
         throw new IllegalArgumentException(var8.toString());
      } else {
         if (n > 0) {
            int start = this.startIndex;
            int $i$f$forward = false;
            int end = (start + n) % access$getCapacity$p(this);
            if (start > end) {
               ArraysKt.fill(this.buffer, (Object)null, start, this.capacity);
               ArraysKt.fill(this.buffer, (Object)null, 0, end);
            } else {
               ArraysKt.fill(this.buffer, (Object)null, start, end);
            }

            this.startIndex = end;
            this.size = this.size() - n;
         }

      }
   }

   private final int forward(int $this$forward, int n) {
      int $i$f$forward = false;
      return ($this$forward + n) % access$getCapacity$p(this);
   }
}
