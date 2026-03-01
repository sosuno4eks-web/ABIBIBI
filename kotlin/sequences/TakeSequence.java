package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class TakeSequence<T> implements Sequence<T>, DropTakeSequence<T> {
   @NotNull
   private final Sequence<T> sequence;
   private final int count;

   public TakeSequence(@NotNull Sequence<? extends T> sequence, int count) {
      Intrinsics.checkNotNullParameter(sequence, "sequence");
      super();
      this.sequence = sequence;
      this.count = count;
      if (this.count < 0) {
         int var3 = false;
         String var4 = "count must be non-negative, but was " + this.count + '.';
         throw new IllegalArgumentException(var4.toString());
      }
   }

   @NotNull
   public Sequence<T> drop(int n) {
      return n >= this.count ? SequencesKt.emptySequence() : (Sequence)(new SubSequence(this.sequence, n, this.count));
   }

   @NotNull
   public Sequence<T> take(int n) {
      return n >= this.count ? (Sequence)this : (Sequence)(new TakeSequence(this.sequence, n));
   }

   @NotNull
   public Iterator<T> iterator() {
      return (Iterator)(new Iterator<T>(this) {
         private int left;
         private final Iterator<T> iterator;

         {
            this.left = $receiver.count;
            this.iterator = $receiver.sequence.iterator();
         }

         public final int getLeft() {
            return this.left;
         }

         public final void setLeft(int <set-?>) {
            this.left = var1;
         }

         public final Iterator<T> getIterator() {
            return this.iterator;
         }

         public T next() {
            if (this.left == 0) {
               throw new NoSuchElementException();
            } else {
               int var1 = this.left;
               this.left = var1 + -1;
               return this.iterator.next();
            }
         }

         public boolean hasNext() {
            return this.left > 0 && this.iterator.hasNext();
         }

         public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
         }
      });
   }
}
