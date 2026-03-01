package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

final class ReversedList<T> extends AbstractMutableList<T> {
   @NotNull
   private final List<T> delegate;

   public ReversedList(@NotNull List<T> delegate) {
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

   public void clear() {
      this.delegate.clear();
   }

   public T removeAt(int index) {
      return this.delegate.remove(CollectionsKt__ReversedViewsKt.access$reverseElementIndex((List)this, index));
   }

   public T set(int index, T element) {
      return this.delegate.set(CollectionsKt__ReversedViewsKt.access$reverseElementIndex((List)this, index), element);
   }

   public void add(int index, T element) {
      this.delegate.add(CollectionsKt__ReversedViewsKt.access$reversePositionIndex((List)this, index), element);
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
            this.delegateIterator = ReversedList.this.delegate.listIterator(CollectionsKt__ReversedViewsKt.access$reversePositionIndex((List)ReversedList.this, $index));
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
            return CollectionsKt__ReversedViewsKt.access$reverseIteratorIndex((List)ReversedList.this, this.delegateIterator.previousIndex());
         }

         public T previous() {
            return this.delegateIterator.next();
         }

         public int previousIndex() {
            return CollectionsKt__ReversedViewsKt.access$reverseIteratorIndex((List)ReversedList.this, this.delegateIterator.nextIndex());
         }

         public void add(T element) {
            this.delegateIterator.add(element);
            this.delegateIterator.previous();
         }

         public void remove() {
            this.delegateIterator.remove();
         }

         public void set(T element) {
            this.delegateIterator.set(element);
         }
      });
   }
}
