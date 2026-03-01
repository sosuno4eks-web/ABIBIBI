package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

final class ArrayAsCollection<T> implements Collection<T>, KMappedMarker {
   @NotNull
   private final T[] values;
   private final boolean isVarargs;

   public ArrayAsCollection(@NotNull T[] values, boolean isVarargs) {
      Intrinsics.checkNotNullParameter(values, "values");
      super();
      this.values = values;
      this.isVarargs = isVarargs;
   }

   @NotNull
   public final T[] getValues() {
      return this.values;
   }

   public final boolean isVarargs() {
      return this.isVarargs;
   }

   public int getSize() {
      return this.values.length;
   }

   public boolean isEmpty() {
      return this.values.length == 0;
   }

   public boolean contains(Object element) {
      return ArraysKt.contains(this.values, element);
   }

   public boolean containsAll(@NotNull Collection<?> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      Iterable $this$all$iv = (Iterable)elements;
      int $i$f$all = false;
      boolean var10000;
      if (((Collection)$this$all$iv).isEmpty()) {
         var10000 = true;
      } else {
         Iterator var4 = $this$all$iv.iterator();

         while(true) {
            if (!var4.hasNext()) {
               var10000 = true;
               break;
            }

            Object element$iv = var4.next();
            int var7 = false;
            if (!this.contains(element$iv)) {
               var10000 = false;
               break;
            }
         }
      }

      return var10000;
   }

   @NotNull
   public Iterator<T> iterator() {
      return ArrayIteratorKt.iterator(this.values);
   }

   @NotNull
   public final Object[] toArray() {
      return CollectionsKt.copyToArrayOfAny(this.values, this.isVarargs);
   }

   public boolean add(T element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean remove(Object element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean addAll(Collection<? extends T> elements) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean removeAll(Collection<?> elements) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean retainAll(Collection<?> elements) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public void clear() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public <T> T[] toArray(T[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      return CollectionToArray.toArray((Collection)this, array);
   }
}
