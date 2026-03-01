package kotlin.collections.builders;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ListBuilder<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {
   @NotNull
   private static final ListBuilder.Companion Companion = new ListBuilder.Companion((DefaultConstructorMarker)null);
   @NotNull
   private E[] backing;
   private int length;
   private boolean isReadOnly;
   @NotNull
   private static final ListBuilder Empty;

   public ListBuilder(int initialCapacity) {
      this.backing = ListBuilderKt.arrayOfUninitializedElements(initialCapacity);
   }

   // $FF: synthetic method
   public ListBuilder(int var1, int var2, DefaultConstructorMarker var3) {
      if ((var2 & 1) != 0) {
         var1 = 10;
      }

      this(var1);
   }

   @NotNull
   public final List<E> build() {
      this.checkIsMutable();
      this.isReadOnly = true;
      return this.length > 0 ? (List)this : (List)Empty;
   }

   private final Object writeReplace() {
      if (this.isReadOnly) {
         return new SerializedCollection((Collection)this, 0);
      } else {
         throw new NotSerializableException("The list cannot be serialized while it is being built.");
      }
   }

   public int getSize() {
      return this.length;
   }

   public boolean isEmpty() {
      return this.length == 0;
   }

   public E get(int index) {
      AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
      return this.backing[index];
   }

   public E set(int index, E element) {
      this.checkIsMutable();
      AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
      Object old = this.backing[index];
      this.backing[index] = element;
      return old;
   }

   public int indexOf(Object element) {
      for(int i = 0; i < this.length; ++i) {
         if (Intrinsics.areEqual(this.backing[i], element)) {
            return i;
         }
      }

      return -1;
   }

   public int lastIndexOf(Object element) {
      for(int i = this.length - 1; i >= 0; --i) {
         if (Intrinsics.areEqual(this.backing[i], element)) {
            return i;
         }
      }

      return -1;
   }

   @NotNull
   public Iterator<E> iterator() {
      return (Iterator)this.listIterator(0);
   }

   @NotNull
   public ListIterator<E> listIterator() {
      return this.listIterator(0);
   }

   @NotNull
   public ListIterator<E> listIterator(int index) {
      AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
      return (ListIterator)(new ListBuilder.Itr(this, index));
   }

   public boolean add(E element) {
      this.checkIsMutable();
      this.addAtInternal(this.length, element);
      return true;
   }

   public void add(int index, E element) {
      this.checkIsMutable();
      AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
      this.addAtInternal(index, element);
   }

   public boolean addAll(@NotNull Collection<? extends E> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      this.checkIsMutable();
      int n = elements.size();
      this.addAllInternal(this.length, elements, n);
      return n > 0;
   }

   public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      this.checkIsMutable();
      AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
      int n = elements.size();
      this.addAllInternal(index, elements, n);
      return n > 0;
   }

   public void clear() {
      this.checkIsMutable();
      this.removeRangeInternal(0, this.length);
   }

   public E removeAt(int index) {
      this.checkIsMutable();
      AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
      return this.removeAtInternal(index);
   }

   public boolean remove(Object element) {
      this.checkIsMutable();
      int i = this.indexOf(element);
      if (i >= 0) {
         this.removeAt(i);
      }

      return i >= 0;
   }

   public boolean removeAll(@NotNull Collection<?> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      this.checkIsMutable();
      return this.retainOrRemoveAllInternal(0, this.length, elements, false) > 0;
   }

   public boolean retainAll(@NotNull Collection<?> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      this.checkIsMutable();
      return this.retainOrRemoveAllInternal(0, this.length, elements, true) > 0;
   }

   @NotNull
   public List<E> subList(int fromIndex, int toIndex) {
      AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, this.length);
      return (List)(new ListBuilder.BuilderSubList(this.backing, fromIndex, toIndex - fromIndex, (ListBuilder.BuilderSubList)null, this));
   }

   @NotNull
   public <T> T[] toArray(@NotNull T[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      if (array.length < this.length) {
         Object[] var10000 = Arrays.copyOfRange(this.backing, 0, this.length, array.getClass());
         Intrinsics.checkNotNullExpressionValue(var10000, "copyOfRange(...)");
         return var10000;
      } else {
         ArraysKt.copyInto(this.backing, array, 0, 0, this.length);
         return CollectionsKt.terminateCollectionToArray(this.length, array);
      }
   }

   @NotNull
   public Object[] toArray() {
      return ArraysKt.copyOfRange(this.backing, 0, this.length);
   }

   public boolean equals(@Nullable Object other) {
      return other == this || other instanceof List && this.contentEquals((List)other);
   }

   public int hashCode() {
      return ListBuilderKt.access$subarrayContentHashCode(this.backing, 0, this.length);
   }

   @NotNull
   public String toString() {
      return ListBuilderKt.access$subarrayContentToString(this.backing, 0, this.length, (Collection)this);
   }

   private final void registerModification() {
      ++this.modCount;
   }

   private final void checkIsMutable() {
      if (this.isReadOnly) {
         throw new UnsupportedOperationException();
      }
   }

   private final void ensureExtraCapacity(int n) {
      this.ensureCapacityInternal(this.length + n);
   }

   private final void ensureCapacityInternal(int minCapacity) {
      if (minCapacity < 0) {
         throw new OutOfMemoryError();
      } else {
         if (minCapacity > this.backing.length) {
            int newSize = AbstractList.Companion.newCapacity$kotlin_stdlib(this.backing.length, minCapacity);
            this.backing = ListBuilderKt.copyOfUninitializedElements(this.backing, newSize);
         }

      }
   }

   private final boolean contentEquals(List<?> other) {
      return ListBuilderKt.access$subarrayContentEquals(this.backing, 0, this.length, other);
   }

   private final void insertAtInternal(int i, int n) {
      this.ensureExtraCapacity(n);
      Object[] var3 = this.backing;
      Object[] var4 = this.backing;
      int var5 = this.length;
      int var6 = i + n;
      ArraysKt.copyInto(var3, var4, var6, i, var5);
      this.length += n;
   }

   private final void addAtInternal(int i, E element) {
      this.registerModification();
      this.insertAtInternal(i, 1);
      this.backing[i] = element;
   }

   private final void addAllInternal(int i, Collection<? extends E> elements, int n) {
      this.registerModification();
      this.insertAtInternal(i, n);
      int j = 0;

      for(Iterator it = elements.iterator(); j < n; ++j) {
         this.backing[i + j] = it.next();
      }

   }

   private final E removeAtInternal(int i) {
      this.registerModification();
      Object old = this.backing[i];
      Object[] var3 = this.backing;
      Object[] var4 = this.backing;
      int var5 = i + 1;
      int var6 = this.length;
      ArraysKt.copyInto(var3, var4, i, var5, var6);
      ListBuilderKt.resetAt(this.backing, this.length - 1);
      int var7 = this.length;
      this.length = var7 + -1;
      return old;
   }

   private final void removeRangeInternal(int rangeOffset, int rangeLength) {
      if (rangeLength > 0) {
         this.registerModification();
      }

      Object[] var3 = this.backing;
      Object[] var4 = this.backing;
      int var5 = rangeOffset + rangeLength;
      int var6 = this.length;
      ArraysKt.copyInto(var3, var4, rangeOffset, var5, var6);
      ListBuilderKt.resetRange(this.backing, this.length - rangeLength, this.length);
      this.length -= rangeLength;
   }

   private final int retainOrRemoveAllInternal(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
      int i = 0;
      int j = 0;

      while(i < rangeLength) {
         if (elements.contains(this.backing[rangeOffset + i]) == retain) {
            this.backing[rangeOffset + j++] = this.backing[rangeOffset + i++];
         } else {
            ++i;
         }
      }

      int removed = rangeLength - j;
      Object[] var8 = this.backing;
      Object[] var9 = this.backing;
      int var10 = rangeOffset + rangeLength;
      int var11 = this.length;
      int var12 = rangeOffset + j;
      ArraysKt.copyInto(var8, var9, var12, var10, var11);
      ListBuilderKt.resetRange(this.backing, this.length - removed, this.length);
      if (removed > 0) {
         this.registerModification();
      }

      this.length -= removed;
      return removed;
   }

   public ListBuilder() {
      this(0, 1, (DefaultConstructorMarker)null);
   }

   static {
      ListBuilder var0 = new ListBuilder(0);
      int var2 = false;
      var0.isReadOnly = true;
      Empty = var0;
   }

   public static final class BuilderSubList<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {
      @NotNull
      private E[] backing;
      private final int offset;
      private int length;
      @Nullable
      private final ListBuilder.BuilderSubList<E> parent;
      @NotNull
      private final ListBuilder<E> root;

      public BuilderSubList(@NotNull E[] backing, int offset, int length, @Nullable ListBuilder.BuilderSubList<E> parent, @NotNull ListBuilder<E> root) {
         Intrinsics.checkNotNullParameter(backing, "backing");
         Intrinsics.checkNotNullParameter(root, "root");
         super();
         this.backing = backing;
         this.offset = offset;
         this.length = length;
         this.parent = parent;
         this.root = root;
         this.modCount = this.root.modCount;
      }

      private final Object writeReplace() {
         if (this.isReadOnly()) {
            return new SerializedCollection((Collection)this, 0);
         } else {
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
         }
      }

      private final void readObject(ObjectInputStream input) {
         throw new InvalidObjectException("Deserialization is supported via proxy only");
      }

      public int getSize() {
         this.checkForComodification();
         return this.length;
      }

      public boolean isEmpty() {
         this.checkForComodification();
         return this.length == 0;
      }

      public E get(int index) {
         this.checkForComodification();
         AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
         return this.backing[this.offset + index];
      }

      public E set(int index, E element) {
         this.checkIsMutable();
         this.checkForComodification();
         AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
         Object old = this.backing[this.offset + index];
         this.backing[this.offset + index] = element;
         return old;
      }

      public int indexOf(Object element) {
         this.checkForComodification();

         for(int i = 0; i < this.length; ++i) {
            if (Intrinsics.areEqual(this.backing[this.offset + i], element)) {
               return i;
            }
         }

         return -1;
      }

      public int lastIndexOf(Object element) {
         this.checkForComodification();

         for(int i = this.length - 1; i >= 0; --i) {
            if (Intrinsics.areEqual(this.backing[this.offset + i], element)) {
               return i;
            }
         }

         return -1;
      }

      @NotNull
      public Iterator<E> iterator() {
         return (Iterator)this.listIterator(0);
      }

      @NotNull
      public ListIterator<E> listIterator() {
         return this.listIterator(0);
      }

      @NotNull
      public ListIterator<E> listIterator(int index) {
         this.checkForComodification();
         AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
         return (ListIterator)(new ListBuilder.BuilderSubList.Itr(this, index));
      }

      public boolean add(E element) {
         this.checkIsMutable();
         this.checkForComodification();
         this.addAtInternal(this.offset + this.length, element);
         return true;
      }

      public void add(int index, E element) {
         this.checkIsMutable();
         this.checkForComodification();
         AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
         this.addAtInternal(this.offset + index, element);
      }

      public boolean addAll(@NotNull Collection<? extends E> elements) {
         Intrinsics.checkNotNullParameter(elements, "elements");
         this.checkIsMutable();
         this.checkForComodification();
         int n = elements.size();
         this.addAllInternal(this.offset + this.length, elements, n);
         return n > 0;
      }

      public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
         Intrinsics.checkNotNullParameter(elements, "elements");
         this.checkIsMutable();
         this.checkForComodification();
         AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
         int n = elements.size();
         this.addAllInternal(this.offset + index, elements, n);
         return n > 0;
      }

      public void clear() {
         this.checkIsMutable();
         this.checkForComodification();
         this.removeRangeInternal(this.offset, this.length);
      }

      public E removeAt(int index) {
         this.checkIsMutable();
         this.checkForComodification();
         AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
         return this.removeAtInternal(this.offset + index);
      }

      public boolean remove(Object element) {
         this.checkIsMutable();
         this.checkForComodification();
         int i = this.indexOf(element);
         if (i >= 0) {
            this.removeAt(i);
         }

         return i >= 0;
      }

      public boolean removeAll(@NotNull Collection<?> elements) {
         Intrinsics.checkNotNullParameter(elements, "elements");
         this.checkIsMutable();
         this.checkForComodification();
         return this.retainOrRemoveAllInternal(this.offset, this.length, elements, false) > 0;
      }

      public boolean retainAll(@NotNull Collection<?> elements) {
         Intrinsics.checkNotNullParameter(elements, "elements");
         this.checkIsMutable();
         this.checkForComodification();
         return this.retainOrRemoveAllInternal(this.offset, this.length, elements, true) > 0;
      }

      @NotNull
      public List<E> subList(int fromIndex, int toIndex) {
         AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, this.length);
         return (List)(new ListBuilder.BuilderSubList(this.backing, this.offset + fromIndex, toIndex - fromIndex, this, this.root));
      }

      @NotNull
      public <T> T[] toArray(@NotNull T[] array) {
         Intrinsics.checkNotNullParameter(array, "array");
         this.checkForComodification();
         if (array.length < this.length) {
            Object[] var10000 = Arrays.copyOfRange(this.backing, this.offset, this.offset + this.length, array.getClass());
            Intrinsics.checkNotNullExpressionValue(var10000, "copyOfRange(...)");
            return var10000;
         } else {
            ArraysKt.copyInto(this.backing, array, 0, this.offset, this.offset + this.length);
            return CollectionsKt.terminateCollectionToArray(this.length, array);
         }
      }

      @NotNull
      public Object[] toArray() {
         this.checkForComodification();
         return ArraysKt.copyOfRange(this.backing, this.offset, this.offset + this.length);
      }

      public boolean equals(@Nullable Object other) {
         this.checkForComodification();
         return other == this || other instanceof List && this.contentEquals((List)other);
      }

      public int hashCode() {
         this.checkForComodification();
         return ListBuilderKt.access$subarrayContentHashCode(this.backing, this.offset, this.length);
      }

      @NotNull
      public String toString() {
         this.checkForComodification();
         return ListBuilderKt.access$subarrayContentToString(this.backing, this.offset, this.length, (Collection)this);
      }

      private final void registerModification() {
         ++this.modCount;
      }

      private final void checkForComodification() {
         if (this.root.modCount != this.modCount) {
            throw new ConcurrentModificationException();
         }
      }

      private final void checkIsMutable() {
         if (this.isReadOnly()) {
            throw new UnsupportedOperationException();
         }
      }

      private final boolean isReadOnly() {
         return this.root.isReadOnly;
      }

      private final boolean contentEquals(List<?> other) {
         return ListBuilderKt.access$subarrayContentEquals(this.backing, this.offset, this.length, other);
      }

      private final void addAtInternal(int i, E element) {
         this.registerModification();
         if (this.parent != null) {
            this.parent.addAtInternal(i, element);
         } else {
            this.root.addAtInternal(i, element);
         }

         this.backing = this.root.backing;
         int var3 = this.length++;
      }

      private final void addAllInternal(int i, Collection<? extends E> elements, int n) {
         this.registerModification();
         if (this.parent != null) {
            this.parent.addAllInternal(i, elements, n);
         } else {
            this.root.addAllInternal(i, elements, n);
         }

         this.backing = this.root.backing;
         this.length += n;
      }

      private final E removeAtInternal(int i) {
         this.registerModification();
         Object old = this.parent != null ? this.parent.removeAtInternal(i) : this.root.removeAtInternal(i);
         int var3 = this.length;
         this.length = var3 + -1;
         return old;
      }

      private final void removeRangeInternal(int rangeOffset, int rangeLength) {
         if (rangeLength > 0) {
            this.registerModification();
         }

         if (this.parent != null) {
            this.parent.removeRangeInternal(rangeOffset, rangeLength);
         } else {
            this.root.removeRangeInternal(rangeOffset, rangeLength);
         }

         this.length -= rangeLength;
      }

      private final int retainOrRemoveAllInternal(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
         int removed = this.parent != null ? this.parent.retainOrRemoveAllInternal(rangeOffset, rangeLength, elements, retain) : this.root.retainOrRemoveAllInternal(rangeOffset, rangeLength, elements, retain);
         if (removed > 0) {
            this.registerModification();
         }

         this.length -= removed;
         return removed;
      }

      private static final class Itr<E> implements ListIterator<E>, KMutableListIterator {
         @NotNull
         private final ListBuilder.BuilderSubList<E> list;
         private int index;
         private int lastIndex;
         private int expectedModCount;

         public Itr(@NotNull ListBuilder.BuilderSubList<E> list, int index) {
            Intrinsics.checkNotNullParameter(list, "list");
            super();
            this.list = list;
            this.index = index;
            this.lastIndex = -1;
            this.expectedModCount = this.list.modCount;
         }

         public boolean hasPrevious() {
            return this.index > 0;
         }

         public boolean hasNext() {
            return this.index < this.list.length;
         }

         public int previousIndex() {
            return this.index - 1;
         }

         public int nextIndex() {
            return this.index;
         }

         public E previous() {
            this.checkForComodification();
            if (this.index <= 0) {
               throw new NoSuchElementException();
            } else {
               this.index += -1;
               this.lastIndex = this.index;
               return this.list.backing[this.list.offset + this.lastIndex];
            }
         }

         public E next() {
            this.checkForComodification();
            if (this.index >= this.list.length) {
               throw new NoSuchElementException();
            } else {
               int var1 = this.index++;
               this.lastIndex = var1;
               return this.list.backing[this.list.offset + this.lastIndex];
            }
         }

         public void set(E element) {
            this.checkForComodification();
            if (this.lastIndex == -1) {
               int var2 = false;
               String var3 = "Call next() or previous() before replacing element from the iterator.";
               throw new IllegalStateException(var3.toString());
            } else {
               this.list.set(this.lastIndex, element);
            }
         }

         public void add(E element) {
            this.checkForComodification();
            ListBuilder.BuilderSubList var10000 = this.list;
            int var2 = this.index++;
            var10000.add(var2, element);
            this.lastIndex = -1;
            this.expectedModCount = this.list.modCount;
         }

         public void remove() {
            this.checkForComodification();
            if (this.lastIndex == -1) {
               int var1 = false;
               String var2 = "Call next() or previous() before removing element from the iterator.";
               throw new IllegalStateException(var2.toString());
            } else {
               this.list.removeAt(this.lastIndex);
               this.index = this.lastIndex;
               this.lastIndex = -1;
               this.expectedModCount = this.list.modCount;
            }
         }

         private final void checkForComodification() {
            if (this.list.root.modCount != this.expectedModCount) {
               throw new ConcurrentModificationException();
            }
         }
      }
   }

   private static final class Companion {
      private Companion() {
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }

   private static final class Itr<E> implements ListIterator<E>, KMutableListIterator {
      @NotNull
      private final ListBuilder<E> list;
      private int index;
      private int lastIndex;
      private int expectedModCount;

      public Itr(@NotNull ListBuilder<E> list, int index) {
         Intrinsics.checkNotNullParameter(list, "list");
         super();
         this.list = list;
         this.index = index;
         this.lastIndex = -1;
         this.expectedModCount = this.list.modCount;
      }

      public boolean hasPrevious() {
         return this.index > 0;
      }

      public boolean hasNext() {
         return this.index < this.list.length;
      }

      public int previousIndex() {
         return this.index - 1;
      }

      public int nextIndex() {
         return this.index;
      }

      public E previous() {
         this.checkForComodification();
         if (this.index <= 0) {
            throw new NoSuchElementException();
         } else {
            this.index += -1;
            this.lastIndex = this.index;
            return this.list.backing[this.lastIndex];
         }
      }

      public E next() {
         this.checkForComodification();
         if (this.index >= this.list.length) {
            throw new NoSuchElementException();
         } else {
            int var1 = this.index++;
            this.lastIndex = var1;
            return this.list.backing[this.lastIndex];
         }
      }

      public void set(E element) {
         this.checkForComodification();
         if (this.lastIndex == -1) {
            int var2 = false;
            String var3 = "Call next() or previous() before replacing element from the iterator.";
            throw new IllegalStateException(var3.toString());
         } else {
            this.list.set(this.lastIndex, element);
         }
      }

      public void add(E element) {
         this.checkForComodification();
         ListBuilder var10000 = this.list;
         int var2 = this.index++;
         var10000.add(var2, element);
         this.lastIndex = -1;
         this.expectedModCount = this.list.modCount;
      }

      public void remove() {
         this.checkForComodification();
         if (this.lastIndex == -1) {
            int var1 = false;
            String var2 = "Call next() or previous() before removing element from the iterator.";
            throw new IllegalStateException(var2.toString());
         } else {
            this.list.removeAt(this.lastIndex);
            this.index = this.lastIndex;
            this.lastIndex = -1;
            this.expectedModCount = this.list.modCount;
         }
      }

      private final void checkForComodification() {
         if (this.list.modCount != this.expectedModCount) {
            throw new ConcurrentModificationException();
         }
      }
   }
}
