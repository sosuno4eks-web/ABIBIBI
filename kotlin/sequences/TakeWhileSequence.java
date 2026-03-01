package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class TakeWhileSequence<T> implements Sequence<T> {
   @NotNull
   private final Sequence<T> sequence;
   @NotNull
   private final Function1<T, Boolean> predicate;

   public TakeWhileSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter(sequence, "sequence");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      super();
      this.sequence = sequence;
      this.predicate = predicate;
   }

   @NotNull
   public Iterator<T> iterator() {
      return (Iterator)(new Iterator<T>() {
         private final Iterator<T> iterator;
         private int nextState;
         private T nextItem;

         {
            this.iterator = TakeWhileSequence.this.sequence.iterator();
            this.nextState = -1;
         }

         public final Iterator<T> getIterator() {
            return this.iterator;
         }

         public final int getNextState() {
            return this.nextState;
         }

         public final void setNextState(int <set-?>) {
            this.nextState = var1;
         }

         public final T getNextItem() {
            return this.nextItem;
         }

         public final void setNextItem(T <set-?>) {
            this.nextItem = var1;
         }

         private final void calcNext() {
            if (this.iterator.hasNext()) {
               Object item = this.iterator.next();
               if ((Boolean)TakeWhileSequence.this.predicate.invoke(item)) {
                  this.nextState = 1;
                  this.nextItem = item;
                  return;
               }
            }

            this.nextState = 0;
         }

         public T next() {
            if (this.nextState == -1) {
               this.calcNext();
            }

            if (this.nextState == 0) {
               throw new NoSuchElementException();
            } else {
               Object result = this.nextItem;
               this.nextItem = null;
               this.nextState = -1;
               return result;
            }
         }

         public boolean hasNext() {
            if (this.nextState == -1) {
               this.calcNext();
            }

            return this.nextState == 1;
         }

         public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
         }
      });
   }
}
