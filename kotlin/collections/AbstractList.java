package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.1"
)
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>, KMappedMarker {
   @NotNull
   public static final AbstractList.Companion Companion = new AbstractList.Companion((DefaultConstructorMarker)null);
   private static final int maxArraySize = 2147483639;

   protected AbstractList() {
   }

   public abstract int getSize();

   public abstract E get(int var1);

   @NotNull
   public Iterator<E> iterator() {
      return (Iterator)(new AbstractList.IteratorImpl());
   }

   public int indexOf(Object element) {
      List $this$indexOfFirst$iv = (List)this;
      int $i$f$indexOfFirst = false;
      int index$iv = 0;
      Iterator var5 = $this$indexOfFirst$iv.iterator();

      int var10000;
      while(true) {
         if (!var5.hasNext()) {
            var10000 = -1;
            break;
         }

         Object item$iv = var5.next();
         int var8 = false;
         if (Intrinsics.areEqual(item$iv, element)) {
            var10000 = index$iv;
            break;
         }

         ++index$iv;
      }

      return var10000;
   }

   public int lastIndexOf(Object element) {
      List $this$indexOfLast$iv = (List)this;
      int $i$f$indexOfLast = false;
      ListIterator iterator$iv = $this$indexOfLast$iv.listIterator($this$indexOfLast$iv.size());

      int var10000;
      while(true) {
         if (iterator$iv.hasPrevious()) {
            Object it = iterator$iv.previous();
            int var6 = false;
            if (!Intrinsics.areEqual(it, element)) {
               continue;
            }

            var10000 = iterator$iv.nextIndex();
            break;
         }

         var10000 = -1;
         break;
      }

      return var10000;
   }

   @NotNull
   public ListIterator<E> listIterator() {
      return (ListIterator)(new AbstractList.ListIteratorImpl(0));
   }

   @NotNull
   public ListIterator<E> listIterator(int index) {
      return (ListIterator)(new AbstractList.ListIteratorImpl(index));
   }

   @NotNull
   public List<E> subList(int fromIndex, int toIndex) {
      return (List)(new AbstractList.SubList(this, fromIndex, toIndex));
   }

   public boolean equals(@Nullable Object other) {
      if (other == this) {
         return true;
      } else {
         return !(other instanceof List) ? false : Companion.orderedEquals$kotlin_stdlib((Collection)this, (Collection)other);
      }
   }

   public int hashCode() {
      return Companion.orderedHashCode$kotlin_stdlib((Collection)this);
   }

   public boolean addAll(int index, Collection<? extends E> elements) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public E set(int index, E element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public void add(int index, E element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public E remove(int index) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public static final class Companion {
      private Companion() {
      }

      public final void checkElementIndex$kotlin_stdlib(int index, int size) {
         if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
         }
      }

      public final void checkPositionIndex$kotlin_stdlib(int index, int size) {
         if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
         }
      }

      public final void checkRangeIndexes$kotlin_stdlib(int fromIndex, int toIndex, int size) {
         if (fromIndex >= 0 && toIndex <= size) {
            if (fromIndex > toIndex) {
               throw new IllegalArgumentException("fromIndex: " + fromIndex + " > toIndex: " + toIndex);
            }
         } else {
            throw new IndexOutOfBoundsException("fromIndex: " + fromIndex + ", toIndex: " + toIndex + ", size: " + size);
         }
      }

      public final void checkBoundsIndexes$kotlin_stdlib(int startIndex, int endIndex, int size) {
         if (startIndex >= 0 && endIndex <= size) {
            if (startIndex > endIndex) {
               throw new IllegalArgumentException("startIndex: " + startIndex + " > endIndex: " + endIndex);
            }
         } else {
            throw new IndexOutOfBoundsException("startIndex: " + startIndex + ", endIndex: " + endIndex + ", size: " + size);
         }
      }

      public final int newCapacity$kotlin_stdlib(int oldCapacity, int minCapacity) {
         int newCapacity = oldCapacity + (oldCapacity >> 1);
         if (newCapacity - minCapacity < 0) {
            newCapacity = minCapacity;
         }

         if (newCapacity - 2147483639 > 0) {
            newCapacity = minCapacity > 2147483639 ? Integer.MAX_VALUE : 2147483639;
         }

         return newCapacity;
      }

      public final int orderedHashCode$kotlin_stdlib(@NotNull Collection<?> c) {
         Intrinsics.checkNotNullParameter(c, "c");
         int hashCode = 1;

         Object e;
         for(Iterator var3 = c.iterator(); var3.hasNext(); hashCode = 31 * hashCode + (e != null ? e.hashCode() : 0)) {
            e = var3.next();
         }

         return hashCode;
      }

      public final boolean orderedEquals$kotlin_stdlib(@NotNull Collection<?> c, @NotNull Collection<?> other) {
         Intrinsics.checkNotNullParameter(c, "c");
         Intrinsics.checkNotNullParameter(other, "other");
         if (c.size() != other.size()) {
            return false;
         } else {
            Iterator otherIterator = other.iterator();
            Iterator var4 = c.iterator();

            Object elem;
            Object elemOther;
            do {
               if (!var4.hasNext()) {
                  return true;
               }

               elem = var4.next();
               elemOther = otherIterator.next();
            } while(Intrinsics.areEqual(elem, elemOther));

            return false;
         }
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }

   private class IteratorImpl implements Iterator<E>, KMappedMarker {
      private int index;

      public IteratorImpl() {
      }

      protected final int getIndex() {
         return this.index;
      }

      protected final void setIndex(int <set-?>) {
         this.index = var1;
      }

      public boolean hasNext() {
         return this.index < AbstractList.this.size();
      }

      public E next() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         } else {
            AbstractList var10000 = AbstractList.this;
            int var1 = this.index++;
            return var10000.get(var1);
         }
      }

      public void remove() {
         throw new UnsupportedOperationException("Operation is not supported for read-only collection");
      }
   }

   private class ListIteratorImpl extends AbstractList<E>.IteratorImpl implements ListIterator<E>, KMappedMarker {
      public ListIteratorImpl(int index) {
         super();
         AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, AbstractList.this.size());
         this.setIndex(index);
      }

      public boolean hasPrevious() {
         return this.getIndex() > 0;
      }

      public int nextIndex() {
         return this.getIndex();
      }

      public E previous() {
         if (!this.hasPrevious()) {
            throw new NoSuchElementException();
         } else {
            AbstractList var10000 = AbstractList.this;
            this.setIndex(this.getIndex() + -1);
            return var10000.get(this.getIndex());
         }
      }

      public int previousIndex() {
         return this.getIndex() - 1;
      }

      public void set(E element) {
         throw new UnsupportedOperationException("Operation is not supported for read-only collection");
      }

      public void add(E element) {
         throw new UnsupportedOperationException("Operation is not supported for read-only collection");
      }
   }

   private static final class SubList<E> extends AbstractList<E> implements RandomAccess {
      @NotNull
      private final AbstractList<E> list;
      private final int fromIndex;
      private int _size;

      public SubList(@NotNull AbstractList<? extends E> list, int fromIndex, int toIndex) {
         Intrinsics.checkNotNullParameter(list, "list");
         super();
         this.list = list;
         this.fromIndex = fromIndex;
         AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(this.fromIndex, toIndex, this.list.size());
         this._size = toIndex - this.fromIndex;
      }

      public E get(int index) {
         AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this._size);
         return this.list.get(this.fromIndex + index);
      }

      public int getSize() {
         return this._size;
      }

      @NotNull
      public List<E> subList(int fromIndex, int toIndex) {
         AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, this._size);
         return (List)(new AbstractList.SubList(this.list, this.fromIndex + fromIndex, this.fromIndex + toIndex));
      }
   }
}
