package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class DropSequence<T> implements Sequence<T>, DropTakeSequence<T> {
   @NotNull
   private final Sequence<T> sequence;
   private final int count;

   public DropSequence(@NotNull Sequence<? extends T> sequence, int count) {
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
      int n1 = this.count + n;
      int var3 = false;
      return (Sequence)(n1 < 0 ? new DropSequence((Sequence)this, n) : new DropSequence(this.sequence, n1));
   }

   @NotNull
   public Sequence<T> take(int n) {
      int n1 = this.count + n;
      int var3 = false;
      return (Sequence)(n1 < 0 ? (DropTakeSequence)(new TakeSequence((Sequence)this, n)) : (DropTakeSequence)(new SubSequence(this.sequence, this.count, n1)));
   }

   @NotNull
   public Iterator<T> iterator() {
      return (Iterator)(new Iterator<T>(this) {
         private final Iterator<T> iterator;
         private int left;

         {
            this.iterator = $receiver.sequence.iterator();
            this.left = $receiver.count;
         }

         public final Iterator<T> getIterator() {
            return this.iterator;
         }

         public final int getLeft() {
            return this.left;
         }

         public final void setLeft(int <set-?>) {
            this.left = var1;
         }

         private final void drop() {
            while(this.left > 0 && this.iterator.hasNext()) {
               this.iterator.next();
               int var1 = this.left;
               this.left = var1 + -1;
            }

         }

         public T next() {
            this.drop();
            return this.iterator.next();
         }

         public boolean hasNext() {
            this.drop();
            return this.iterator.hasNext();
         }

         public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
         }
      });
   }
}
