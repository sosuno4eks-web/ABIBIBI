package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class FilteringSequence<T> implements Sequence<T> {
   @NotNull
   private final Sequence<T> sequence;
   private final boolean sendWhen;
   @NotNull
   private final Function1<T, Boolean> predicate;

   public FilteringSequence(@NotNull Sequence<? extends T> sequence, boolean sendWhen, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter(sequence, "sequence");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      super();
      this.sequence = sequence;
      this.sendWhen = sendWhen;
      this.predicate = predicate;
   }

   // $FF: synthetic method
   public FilteringSequence(Sequence var1, boolean var2, Function1 var3, int var4, DefaultConstructorMarker var5) {
      if ((var4 & 2) != 0) {
         var2 = true;
      }

      this(var1, var2, var3);
   }

   @NotNull
   public Iterator<T> iterator() {
      return (Iterator)(new Iterator<T>() {
         private final Iterator<T> iterator;
         private int nextState;
         private T nextItem;

         {
            this.iterator = FilteringSequence.this.sequence.iterator();
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
            while(true) {
               if (this.iterator.hasNext()) {
                  Object item = this.iterator.next();
                  if ((Boolean)FilteringSequence.this.predicate.invoke(item) != FilteringSequence.this.sendWhen) {
                     continue;
                  }

                  this.nextItem = item;
                  this.nextState = 1;
                  return;
               }

               this.nextState = 0;
               return;
            }
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
