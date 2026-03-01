package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class DropWhileSequence<T> implements Sequence<T> {
   @NotNull
   private final Sequence<T> sequence;
   @NotNull
   private final Function1<T, Boolean> predicate;

   public DropWhileSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
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
         private int dropState;
         private T nextItem;

         {
            this.iterator = DropWhileSequence.this.sequence.iterator();
            this.dropState = -1;
         }

         public final Iterator<T> getIterator() {
            return this.iterator;
         }

         public final int getDropState() {
            return this.dropState;
         }

         public final void setDropState(int <set-?>) {
            this.dropState = var1;
         }

         public final T getNextItem() {
            return this.nextItem;
         }

         public final void setNextItem(T <set-?>) {
            this.nextItem = var1;
         }

         private final void drop() {
            while(true) {
               if (this.iterator.hasNext()) {
                  Object item = this.iterator.next();
                  if ((Boolean)DropWhileSequence.this.predicate.invoke(item)) {
                     continue;
                  }

                  this.nextItem = item;
                  this.dropState = 1;
                  return;
               }

               this.dropState = 0;
               return;
            }
         }

         public T next() {
            if (this.dropState == -1) {
               this.drop();
            }

            if (this.dropState == 1) {
               Object result = this.nextItem;
               this.nextItem = null;
               this.dropState = 0;
               return result;
            } else {
               return this.iterator.next();
            }
         }

         public boolean hasNext() {
            if (this.dropState == -1) {
               this.drop();
            }

            return this.dropState == 1 || this.iterator.hasNext();
         }

         public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
         }
      });
   }
}
