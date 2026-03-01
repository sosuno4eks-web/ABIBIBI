package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class EmptyList implements List, Serializable, RandomAccess, KMappedMarker {
   @NotNull
   public static final EmptyList INSTANCE = new EmptyList();
   private static final long serialVersionUID = -7390468764508069838L;

   private EmptyList() {
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof List && ((List)other).isEmpty();
   }

   public int hashCode() {
      return 1;
   }

   @NotNull
   public String toString() {
      return "[]";
   }

   public int getSize() {
      return 0;
   }

   public boolean isEmpty() {
      return true;
   }

   public boolean contains(@NotNull Void element) {
      Intrinsics.checkNotNullParameter(element, "element");
      return false;
   }

   public boolean containsAll(@NotNull Collection elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      return elements.isEmpty();
   }

   @NotNull
   public Void get(int index) {
      throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + index + '.');
   }

   public int indexOf(@NotNull Void element) {
      Intrinsics.checkNotNullParameter(element, "element");
      return -1;
   }

   public int lastIndexOf(@NotNull Void element) {
      Intrinsics.checkNotNullParameter(element, "element");
      return -1;
   }

   @NotNull
   public Iterator iterator() {
      return (Iterator)EmptyIterator.INSTANCE;
   }

   @NotNull
   public ListIterator listIterator() {
      return (ListIterator)EmptyIterator.INSTANCE;
   }

   @NotNull
   public ListIterator listIterator(int index) {
      if (index != 0) {
         throw new IndexOutOfBoundsException("Index: " + index);
      } else {
         return (ListIterator)EmptyIterator.INSTANCE;
      }
   }

   @NotNull
   public List subList(int fromIndex, int toIndex) {
      if (fromIndex == 0 && toIndex == 0) {
         return (List)this;
      } else {
         throw new IndexOutOfBoundsException("fromIndex: " + fromIndex + ", toIndex: " + toIndex);
      }
   }

   private final Object readResolve() {
      return INSTANCE;
   }

   public boolean add(Void element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean remove(Object element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean addAll(Collection elements) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean addAll(int index, Collection elements) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean removeAll(Collection elements) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean retainAll(Collection elements) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public void clear() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public Void set(int index, Void element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public void add(int index, Void element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public Void remove(int index) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public <T> T[] toArray(T[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      return CollectionToArray.toArray((Collection)this, array);
   }

   public Object[] toArray() {
      return CollectionToArray.toArray((Collection)this);
   }
}
