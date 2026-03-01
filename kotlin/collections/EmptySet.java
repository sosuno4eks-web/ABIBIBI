package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class EmptySet implements Set, Serializable, KMappedMarker {
   @NotNull
   public static final EmptySet INSTANCE = new EmptySet();
   private static final long serialVersionUID = 3406603774387020532L;

   private EmptySet() {
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof Set && ((Set)other).isEmpty();
   }

   public int hashCode() {
      return 0;
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
   public Iterator iterator() {
      return (Iterator)EmptyIterator.INSTANCE;
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

   public boolean removeAll(Collection elements) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean retainAll(Collection elements) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public void clear() {
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
