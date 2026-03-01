package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class ReversedListReadOnly<T> extends AbstractList<T> {
   @NotNull
   private final List<T> delegate;

   public ReversedListReadOnly(@NotNull List<? extends T> delegate) {
      Intrinsics.checkNotNullParameter(delegate, "delegate");
      super();
      this.delegate = delegate;
   }

   public int getSize() {
      return this.delegate.size();
   }

   public T get(int index) {
      return this.delegate.get(CollectionsKt__ReversedViewsKt.access$reverseElementIndex((List)this, index));
   }

   @NotNull
   public Iterator<T> iterator() {
      return (Iterator)this.listIterator(0);
   }

   @NotNull
   public ListIterator<T> listIterator() {
      return this.listIterator(0);
   }

   @NotNull
   public ListIterator<T> listIterator(int index) {
      return (ListIterator)(new ListIterator<T>(index) {
         private final ListIterator<T> delegateIterator;

         {
            this.delegateIterator = ReversedListReadOnly.this.delegate.listIterator(CollectionsKt__ReversedViewsKt.access$reversePositionIndex((List)ReversedListReadOnly.this, $index));
         }

         public final ListIterator<T> getDelegateIterator() {
            return this.delegateIterator;
         }

         public boolean hasNext() {
            return this.delegateIterator.hasPrevious();
         }

         public boolean hasPrevious() {
            return this.delegateIterator.hasNext();
         }

         public T next() {
            return this.delegateIterator.previous();
         }

         public int nextIndex() {
            return CollectionsKt__ReversedViewsKt.access$reverseIteratorIndex((List)ReversedListReadOnly.this, this.delegateIterator.previousIndex());
         }

         public T previous() {
            return this.delegateIterator.next();
         }

         public int previousIndex() {
            return CollectionsKt__ReversedViewsKt.access$reverseIteratorIndex((List)ReversedListReadOnly.this, this.delegateIterator.nextIndex());
         }

         public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
         }

         public void set(T element) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
         }

         public void add(T element) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
         }
      });
   }
}
