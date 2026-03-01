package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.4"
)
public final class ArrayDeque<E> extends AbstractMutableList<E> {
   @NotNull
   public static final ArrayDeque.Companion Companion = new ArrayDeque.Companion((DefaultConstructorMarker)null);
   private int head;
   @NotNull
   private Object[] elementData;
   private int size;
   @NotNull
   private static final Object[] emptyElementData = new Object[0];
   private static final int defaultMinCapacity = 10;

   public int getSize() {
      return this.size;
   }

   public ArrayDeque(int initialCapacity) {
      Object[] var10001;
      if (initialCapacity == 0) {
         var10001 = emptyElementData;
      } else {
         if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
         }

         var10001 = new Object[initialCapacity];
      }

      this.elementData = var10001;
   }

   public ArrayDeque() {
      this.elementData = emptyElementData;
   }

   public ArrayDeque(@NotNull Collection<? extends E> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      super();
      int $i$f$toTypedArray = false;
      this.elementData = elements.toArray(new Object[0]);
      this.size = this.elementData.length;
      if (this.elementData.length == 0) {
         this.elementData = emptyElementData;
      }

   }

   private final void ensureCapacity(int minCapacity) {
      if (minCapacity < 0) {
         throw new IllegalStateException("Deque is too big.");
      } else if (minCapacity > this.elementData.length) {
         if (this.elementData == emptyElementData) {
            this.elementData = new Object[RangesKt.coerceAtLeast(minCapacity, 10)];
         } else {
            int newCapacity = AbstractList.Companion.newCapacity$kotlin_stdlib(this.elementData.length, minCapacity);
            this.copyElements(newCapacity);
         }
      }
   }

   private final void copyElements(int newCapacity) {
      Object[] newElements = new Object[newCapacity];
      ArraysKt.copyInto(this.elementData, newElements, 0, this.head, this.elementData.length);
      ArraysKt.copyInto(this.elementData, newElements, this.elementData.length - this.head, 0, this.head);
      this.head = 0;
      this.elementData = newElements;
   }

   @InlineOnly
   private final E internalGet(int internalIndex) {
      return this.elementData[internalIndex];
   }

   private final int positiveMod(int index) {
      return index >= this.elementData.length ? index - this.elementData.length : index;
   }

   private final int negativeMod(int index) {
      return index < 0 ? index + this.elementData.length : index;
   }

   @InlineOnly
   private final int internalIndex(int index) {
      return this.positiveMod(this.head + index);
   }

   private final int incremented(int index) {
      return index == ArraysKt.getLastIndex(this.elementData) ? 0 : index + 1;
   }

   private final int decremented(int index) {
      return index == 0 ? ArraysKt.getLastIndex(this.elementData) : index - 1;
   }

   public boolean isEmpty() {
      return this.size() == 0;
   }

   public final E first() {
      if (this.isEmpty()) {
         throw new NoSuchElementException("ArrayDeque is empty.");
      } else {
         return this.elementData[this.head];
      }
   }

   @Nullable
   public final E firstOrNull() {
      return this.isEmpty() ? null : this.elementData[this.head];
   }

   public final E last() {
      if (this.isEmpty()) {
         throw new NoSuchElementException("ArrayDeque is empty.");
      } else {
         return this.elementData[this.positiveMod(this.head + CollectionsKt.getLastIndex((List)this))];
      }
   }

   @Nullable
   public final E lastOrNull() {
      return this.isEmpty() ? null : this.elementData[this.positiveMod(this.head + CollectionsKt.getLastIndex((List)this))];
   }

   public final void addFirst(E element) {
      this.registerModification();
      this.ensureCapacity(this.size() + 1);
      this.head = this.decremented(this.head);
      this.elementData[this.head] = element;
      this.size = this.size() + 1;
   }

   public final void addLast(E element) {
      this.registerModification();
      this.ensureCapacity(this.size() + 1);
      this.elementData[this.positiveMod(this.head + this.size())] = element;
      this.size = this.size() + 1;
   }

   public final E removeFirst() {
      if (this.isEmpty()) {
         throw new NoSuchElementException("ArrayDeque is empty.");
      } else {
         this.registerModification();
         Object element = this.elementData[this.head];
         this.elementData[this.head] = null;
         this.head = this.incremented(this.head);
         this.size = this.size() - 1;
         return element;
      }
   }

   @Nullable
   public final E removeFirstOrNull() {
      return this.isEmpty() ? null : this.removeFirst();
   }

   public final E removeLast() {
      if (this.isEmpty()) {
         throw new NoSuchElementException("ArrayDeque is empty.");
      } else {
         this.registerModification();
         int internalLastIndex = this.positiveMod(this.head + CollectionsKt.getLastIndex((List)this));
         Object element = this.elementData[internalLastIndex];
         this.elementData[internalLastIndex] = null;
         this.size = this.size() - 1;
         return element;
      }
   }

   @Nullable
   public final E removeLastOrNull() {
      return this.isEmpty() ? null : this.removeLast();
   }

   public boolean add(E element) {
      this.addLast(element);
      return true;
   }

   public void add(int index, E element) {
      AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.size());
      if (index == this.size()) {
         this.addLast(element);
      } else if (index == 0) {
         this.addFirst(element);
      } else {
         this.registerModification();
         this.ensureCapacity(this.size() + 1);
         int internalIndex = this.positiveMod(this.head + index);
         int decrementedInternalIndex;
         if (index < this.size() + 1 >> 1) {
            decrementedInternalIndex = this.decremented(internalIndex);
            int decrementedHead = this.decremented(this.head);
            if (decrementedInternalIndex >= this.head) {
               this.elementData[decrementedHead] = this.elementData[this.head];
               ArraysKt.copyInto(this.elementData, this.elementData, this.head, this.head + 1, decrementedInternalIndex + 1);
            } else {
               ArraysKt.copyInto(this.elementData, this.elementData, this.head - 1, this.head, this.elementData.length);
               this.elementData[this.elementData.length - 1] = this.elementData[0];
               ArraysKt.copyInto(this.elementData, this.elementData, 0, 1, decrementedInternalIndex + 1);
            }

            this.elementData[decrementedInternalIndex] = element;
            this.head = decrementedHead;
         } else {
            decrementedInternalIndex = this.positiveMod(this.head + this.size());
            if (internalIndex < decrementedInternalIndex) {
               ArraysKt.copyInto(this.elementData, this.elementData, internalIndex + 1, internalIndex, decrementedInternalIndex);
            } else {
               ArraysKt.copyInto(this.elementData, this.elementData, 1, 0, decrementedInternalIndex);
               this.elementData[0] = this.elementData[this.elementData.length - 1];
               ArraysKt.copyInto(this.elementData, this.elementData, internalIndex + 1, internalIndex, this.elementData.length - 1);
            }

            this.elementData[internalIndex] = element;
         }

         this.size = this.size() + 1;
      }
   }

   private final void copyCollectionElements(int internalIndex, Collection<? extends E> elements) {
      Iterator iterator = elements.iterator();
      int index = internalIndex;

      int var5;
      for(var5 = this.elementData.length; index < var5 && iterator.hasNext(); ++index) {
         this.elementData[index] = iterator.next();
      }

      index = 0;

      for(var5 = this.head; index < var5 && iterator.hasNext(); ++index) {
         this.elementData[index] = iterator.next();
      }

      this.size = this.size() + elements.size();
   }

   public boolean addAll(@NotNull Collection<? extends E> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      if (elements.isEmpty()) {
         return false;
      } else {
         this.registerModification();
         this.ensureCapacity(this.size() + elements.size());
         this.copyCollectionElements(this.positiveMod(this.head + this.size()), elements);
         return true;
      }
   }

   public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.size());
      if (elements.isEmpty()) {
         return false;
      } else if (index == this.size()) {
         return this.addAll(elements);
      } else {
         this.registerModification();
         this.ensureCapacity(this.size() + elements.size());
         int tail = this.positiveMod(this.head + this.size());
         int internalIndex = this.positiveMod(this.head + index);
         int elementsSize = elements.size();
         int shiftedHead;
         int shiftToFront;
         if (index < this.size() + 1 >> 1) {
            shiftedHead = this.head - elementsSize;
            if (internalIndex >= this.head) {
               if (shiftedHead >= 0) {
                  ArraysKt.copyInto(this.elementData, this.elementData, shiftedHead, this.head, internalIndex);
               } else {
                  shiftedHead += this.elementData.length;
                  shiftToFront = internalIndex - this.head;
                  int shiftToBack = this.elementData.length - shiftedHead;
                  if (shiftToBack >= shiftToFront) {
                     ArraysKt.copyInto(this.elementData, this.elementData, shiftedHead, this.head, internalIndex);
                  } else {
                     ArraysKt.copyInto(this.elementData, this.elementData, shiftedHead, this.head, this.head + shiftToBack);
                     ArraysKt.copyInto(this.elementData, this.elementData, 0, this.head + shiftToBack, internalIndex);
                  }
               }
            } else {
               ArraysKt.copyInto(this.elementData, this.elementData, shiftedHead, this.head, this.elementData.length);
               if (elementsSize >= internalIndex) {
                  ArraysKt.copyInto(this.elementData, this.elementData, this.elementData.length - elementsSize, 0, internalIndex);
               } else {
                  ArraysKt.copyInto(this.elementData, this.elementData, this.elementData.length - elementsSize, 0, elementsSize);
                  ArraysKt.copyInto(this.elementData, this.elementData, 0, elementsSize, internalIndex);
               }
            }

            this.head = shiftedHead;
            this.copyCollectionElements(this.negativeMod(internalIndex - elementsSize), elements);
         } else {
            shiftedHead = internalIndex + elementsSize;
            if (internalIndex < tail) {
               if (tail + elementsSize <= this.elementData.length) {
                  ArraysKt.copyInto(this.elementData, this.elementData, shiftedHead, internalIndex, tail);
               } else if (shiftedHead >= this.elementData.length) {
                  ArraysKt.copyInto(this.elementData, this.elementData, shiftedHead - this.elementData.length, internalIndex, tail);
               } else {
                  shiftToFront = tail + elementsSize - this.elementData.length;
                  ArraysKt.copyInto(this.elementData, this.elementData, 0, tail - shiftToFront, tail);
                  ArraysKt.copyInto(this.elementData, this.elementData, shiftedHead, internalIndex, tail - shiftToFront);
               }
            } else {
               ArraysKt.copyInto(this.elementData, this.elementData, elementsSize, 0, tail);
               if (shiftedHead >= this.elementData.length) {
                  ArraysKt.copyInto(this.elementData, this.elementData, shiftedHead - this.elementData.length, internalIndex, this.elementData.length);
               } else {
                  ArraysKt.copyInto(this.elementData, this.elementData, 0, this.elementData.length - elementsSize, this.elementData.length);
                  ArraysKt.copyInto(this.elementData, this.elementData, shiftedHead, internalIndex, this.elementData.length - elementsSize);
               }
            }

            this.copyCollectionElements(internalIndex, elements);
         }

         return true;
      }
   }

   public E get(int index) {
      AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.size());
      return this.elementData[this.positiveMod(this.head + index)];
   }

   public E set(int index, E element) {
      AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.size());
      int internalIndex = this.positiveMod(this.head + index);
      Object oldElement = this.elementData[internalIndex];
      this.elementData[internalIndex] = element;
      return oldElement;
   }

   public boolean contains(Object element) {
      return this.indexOf(element) != -1;
   }

   public int indexOf(Object element) {
      int tail = this.positiveMod(this.head + this.size());
      int index;
      if (this.head < tail) {
         for(index = this.head; index < tail; ++index) {
            if (Intrinsics.areEqual(element, this.elementData[index])) {
               return index - this.head;
            }
         }
      } else if (this.head >= tail) {
         index = this.head;

         for(int var4 = this.elementData.length; index < var4; ++index) {
            if (Intrinsics.areEqual(element, this.elementData[index])) {
               return index - this.head;
            }
         }

         for(index = 0; index < tail; ++index) {
            if (Intrinsics.areEqual(element, this.elementData[index])) {
               return index + this.elementData.length - this.head;
            }
         }
      }

      return -1;
   }

   public int lastIndexOf(Object element) {
      int tail = this.positiveMod(this.head + this.size());
      int index;
      int var4;
      if (this.head < tail) {
         index = tail - 1;
         var4 = this.head;
         if (var4 <= index) {
            while(true) {
               if (Intrinsics.areEqual(element, this.elementData[index])) {
                  return index - this.head;
               }

               if (index == var4) {
                  break;
               }

               --index;
            }
         }
      } else if (this.head > tail) {
         for(index = tail - 1; -1 < index; --index) {
            if (Intrinsics.areEqual(element, this.elementData[index])) {
               return index + this.elementData.length - this.head;
            }
         }

         index = ArraysKt.getLastIndex(this.elementData);
         var4 = this.head;
         if (var4 <= index) {
            while(true) {
               if (Intrinsics.areEqual(element, this.elementData[index])) {
                  return index - this.head;
               }

               if (index == var4) {
                  break;
               }

               --index;
            }
         }
      }

      return -1;
   }

   public boolean remove(Object element) {
      int index = this.indexOf(element);
      if (index == -1) {
         return false;
      } else {
         this.removeAt(index);
         return true;
      }
   }

   public E removeAt(int index) {
      AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.size());
      if (index == CollectionsKt.getLastIndex((List)this)) {
         return this.removeLast();
      } else if (index == 0) {
         return this.removeFirst();
      } else {
         this.registerModification();
         int internalIndex = this.positiveMod(this.head + index);
         Object element = this.elementData[internalIndex];
         if (index < this.size() >> 1) {
            if (internalIndex >= this.head) {
               ArraysKt.copyInto(this.elementData, this.elementData, this.head + 1, this.head, internalIndex);
            } else {
               ArraysKt.copyInto(this.elementData, this.elementData, 1, 0, internalIndex);
               this.elementData[0] = this.elementData[this.elementData.length - 1];
               ArraysKt.copyInto(this.elementData, this.elementData, this.head + 1, this.head, this.elementData.length - 1);
            }

            this.elementData[this.head] = null;
            this.head = this.incremented(this.head);
         } else {
            int internalLastIndex = this.positiveMod(this.head + CollectionsKt.getLastIndex((List)this));
            if (internalIndex <= internalLastIndex) {
               ArraysKt.copyInto(this.elementData, this.elementData, internalIndex, internalIndex + 1, internalLastIndex + 1);
            } else {
               ArraysKt.copyInto(this.elementData, this.elementData, internalIndex, internalIndex + 1, this.elementData.length);
               this.elementData[this.elementData.length - 1] = this.elementData[0];
               ArraysKt.copyInto(this.elementData, this.elementData, 0, 1, internalLastIndex + 1);
            }

            this.elementData[internalLastIndex] = null;
         }

         this.size = this.size() - 1;
         return element;
      }
   }

   public boolean removeAll(@NotNull Collection<?> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      ArrayDeque this_$iv = this;
      int $i$f$filterInPlace = false;
      boolean var10000;
      if (!this.isEmpty() && this.elementData.length != 0) {
         int tail$iv = this.positiveMod(this.head + this.size());
         int newTail$iv = this.head;
         boolean modified$iv = false;
         int index$iv;
         Object element$iv;
         if (this.head < tail$iv) {
            for(index$iv = this.head; index$iv < tail$iv; ++index$iv) {
               element$iv = this_$iv.elementData[index$iv];
               int var10 = false;
               if (!elements.contains(element$iv)) {
                  this_$iv.elementData[newTail$iv++] = element$iv;
               } else {
                  modified$iv = true;
               }
            }

            ArraysKt.fill(this_$iv.elementData, (Object)null, newTail$iv, tail$iv);
         } else {
            index$iv = this.head;

            boolean var11;
            for(int var8 = this.elementData.length; index$iv < var8; ++index$iv) {
               Object element$iv = this_$iv.elementData[index$iv];
               this_$iv.elementData[index$iv] = null;
               var11 = false;
               if (!elements.contains(element$iv)) {
                  this_$iv.elementData[newTail$iv++] = element$iv;
               } else {
                  modified$iv = true;
               }
            }

            newTail$iv = this_$iv.positiveMod(newTail$iv);

            for(index$iv = 0; index$iv < tail$iv; ++index$iv) {
               element$iv = this_$iv.elementData[index$iv];
               this_$iv.elementData[index$iv] = null;
               var11 = false;
               if (!elements.contains(element$iv)) {
                  this_$iv.elementData[newTail$iv] = element$iv;
                  newTail$iv = this_$iv.incremented(newTail$iv);
               } else {
                  modified$iv = true;
               }
            }
         }

         if (modified$iv) {
            this_$iv.registerModification();
            this_$iv.size = this_$iv.negativeMod(newTail$iv - this_$iv.head);
         }

         var10000 = modified$iv;
      } else {
         var10000 = false;
      }

      return var10000;
   }

   public boolean retainAll(@NotNull Collection<?> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      ArrayDeque this_$iv = this;
      int $i$f$filterInPlace = false;
      boolean var10000;
      if (!this.isEmpty() && this.elementData.length != 0) {
         int tail$iv = this.positiveMod(this.head + this.size());
         int newTail$iv = this.head;
         boolean modified$iv = false;
         int index$iv;
         Object element$iv;
         if (this.head < tail$iv) {
            for(index$iv = this.head; index$iv < tail$iv; ++index$iv) {
               element$iv = this_$iv.elementData[index$iv];
               int var10 = false;
               if (elements.contains(element$iv)) {
                  this_$iv.elementData[newTail$iv++] = element$iv;
               } else {
                  modified$iv = true;
               }
            }

            ArraysKt.fill(this_$iv.elementData, (Object)null, newTail$iv, tail$iv);
         } else {
            index$iv = this.head;

            boolean var11;
            for(int var8 = this.elementData.length; index$iv < var8; ++index$iv) {
               Object element$iv = this_$iv.elementData[index$iv];
               this_$iv.elementData[index$iv] = null;
               var11 = false;
               if (elements.contains(element$iv)) {
                  this_$iv.elementData[newTail$iv++] = element$iv;
               } else {
                  modified$iv = true;
               }
            }

            newTail$iv = this_$iv.positiveMod(newTail$iv);

            for(index$iv = 0; index$iv < tail$iv; ++index$iv) {
               element$iv = this_$iv.elementData[index$iv];
               this_$iv.elementData[index$iv] = null;
               var11 = false;
               if (elements.contains(element$iv)) {
                  this_$iv.elementData[newTail$iv] = element$iv;
                  newTail$iv = this_$iv.incremented(newTail$iv);
               } else {
                  modified$iv = true;
               }
            }
         }

         if (modified$iv) {
            this_$iv.registerModification();
            this_$iv.size = this_$iv.negativeMod(newTail$iv - this_$iv.head);
         }

         var10000 = modified$iv;
      } else {
         var10000 = false;
      }

      return var10000;
   }

   private final boolean filterInPlace(Function1<? super E, Boolean> predicate) {
      int $i$f$filterInPlace = false;
      if (!this.isEmpty() && this.elementData.length != 0) {
         int tail = this.positiveMod(this.head + this.size());
         int newTail = this.head;
         boolean modified = false;
         int index;
         Object element;
         if (this.head < tail) {
            for(index = this.head; index < tail; ++index) {
               element = this.elementData[index];
               if ((Boolean)predicate.invoke(element)) {
                  this.elementData[newTail++] = element;
               } else {
                  modified = true;
               }
            }

            ArraysKt.fill(this.elementData, (Object)null, newTail, tail);
         } else {
            index = this.head;

            for(int var9 = this.elementData.length; index < var9; ++index) {
               Object element = this.elementData[index];
               this.elementData[index] = null;
               if ((Boolean)predicate.invoke(element)) {
                  this.elementData[newTail++] = element;
               } else {
                  modified = true;
               }
            }

            newTail = this.positiveMod(newTail);

            for(index = 0; index < tail; ++index) {
               element = this.elementData[index];
               this.elementData[index] = null;
               if ((Boolean)predicate.invoke(element)) {
                  this.elementData[newTail] = element;
                  newTail = this.incremented(newTail);
               } else {
                  modified = true;
               }
            }
         }

         if (modified) {
            this.registerModification();
            this.size = this.negativeMod(newTail - this.head);
         }

         return modified;
      } else {
         return false;
      }
   }

   public void clear() {
      if (!((Collection)this).isEmpty()) {
         this.registerModification();
         int tail = this.positiveMod(this.head + this.size());
         this.nullifyNonEmpty(this.head, tail);
      }

      this.head = 0;
      this.size = 0;
   }

   @NotNull
   public <T> T[] toArray(@NotNull T[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      Object[] dest = array.length >= this.size() ? array : ArraysKt.arrayOfNulls(array, this.size());
      int tail = this.positiveMod(this.head + this.size());
      if (this.head < tail) {
         ArraysKt.copyInto$default(this.elementData, dest, 0, this.head, tail, 2, (Object)null);
      } else if (!((Collection)this).isEmpty()) {
         ArraysKt.copyInto(this.elementData, dest, 0, this.head, this.elementData.length);
         ArraysKt.copyInto(this.elementData, dest, this.elementData.length - this.head, 0, tail);
      }

      return CollectionsKt.terminateCollectionToArray(this.size(), dest);
   }

   @NotNull
   public Object[] toArray() {
      return this.toArray(new Object[this.size()]);
   }

   protected void removeRange(int fromIndex, int toIndex) {
      AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, this.size());
      int length = toIndex - fromIndex;
      if (length != 0) {
         if (length == this.size()) {
            this.clear();
         } else if (length == 1) {
            this.removeAt(fromIndex);
         } else {
            this.registerModification();
            int newHead;
            if (fromIndex < this.size() - toIndex) {
               this.removeRangeShiftPreceding(fromIndex, toIndex);
               newHead = this.positiveMod(this.head + length);
               this.nullifyNonEmpty(this.head, newHead);
               this.head = newHead;
            } else {
               this.removeRangeShiftSucceeding(fromIndex, toIndex);
               newHead = this.positiveMod(this.head + this.size());
               this.nullifyNonEmpty(this.negativeMod(newHead - length), newHead);
            }

            this.size = this.size() - length;
         }
      }
   }

   private final void removeRangeShiftPreceding(int fromIndex, int toIndex) {
      int copyCount = fromIndex - 1;
      int copyFromIndex = this.positiveMod(this.head + copyCount);
      int segmentLength = toIndex - 1;
      int copyToIndex = this.positiveMod(this.head + segmentLength);

      for(copyCount = fromIndex; copyCount > 0; copyCount -= segmentLength) {
         int var7 = copyFromIndex + 1;
         int var8 = copyToIndex + 1;
         segmentLength = Math.min(copyCount, Math.min(var7, var8));
         ArraysKt.copyInto(this.elementData, this.elementData, copyToIndex - segmentLength + 1, copyFromIndex - segmentLength + 1, copyFromIndex + 1);
         copyFromIndex = this.negativeMod(copyFromIndex - segmentLength);
         copyToIndex = this.negativeMod(copyToIndex - segmentLength);
      }

   }

   private final void removeRangeShiftSucceeding(int fromIndex, int toIndex) {
      int copyFromIndex = this.positiveMod(this.head + toIndex);
      int copyToIndex = this.positiveMod(this.head + fromIndex);

      int segmentLength;
      for(int copyCount = this.size() - toIndex; copyCount > 0; copyCount -= segmentLength) {
         int var7 = this.elementData.length - copyFromIndex;
         int var8 = this.elementData.length - copyToIndex;
         segmentLength = Math.min(copyCount, Math.min(var7, var8));
         ArraysKt.copyInto(this.elementData, this.elementData, copyToIndex, copyFromIndex, copyFromIndex + segmentLength);
         copyFromIndex = this.positiveMod(copyFromIndex + segmentLength);
         copyToIndex = this.positiveMod(copyToIndex + segmentLength);
      }

   }

   private final void nullifyNonEmpty(int internalFromIndex, int internalToIndex) {
      if (internalFromIndex < internalToIndex) {
         ArraysKt.fill(this.elementData, (Object)null, internalFromIndex, internalToIndex);
      } else {
         ArraysKt.fill(this.elementData, (Object)null, internalFromIndex, this.elementData.length);
         ArraysKt.fill(this.elementData, (Object)null, 0, internalToIndex);
      }

   }

   private final void registerModification() {
      ++this.modCount;
   }

   @NotNull
   public final <T> T[] testToArray$kotlin_stdlib(@NotNull T[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      return this.toArray(array);
   }

   @NotNull
   public final Object[] testToArray$kotlin_stdlib() {
      return this.toArray();
   }

   public final void testRemoveRange$kotlin_stdlib(int fromIndex, int toIndex) {
      this.removeRange(fromIndex, toIndex);
   }

   public final void internalStructure$kotlin_stdlib(@NotNull Function2<? super Integer, ? super Object[], Unit> structure) {
      Intrinsics.checkNotNullParameter(structure, "structure");
      int tail = this.positiveMod(this.head + this.size());
      int head = !this.isEmpty() && this.head >= tail ? this.head - this.elementData.length : this.head;
      structure.invoke(head, this.toArray());
   }

   public static final class Companion {
      private Companion() {
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
