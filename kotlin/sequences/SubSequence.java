package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class SubSequence<T> implements Sequence<T>, DropTakeSequence<T> {
   @NotNull
   private final Sequence<T> sequence;
   private final int startIndex;
   private final int endIndex;

   public SubSequence(@NotNull Sequence<? extends T> sequence, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter(sequence, "sequence");
      super();
      this.sequence = sequence;
      this.startIndex = startIndex;
      this.endIndex = endIndex;
      boolean var4;
      String var5;
      if (this.startIndex < 0) {
         var4 = false;
         var5 = "startIndex should be non-negative, but is " + this.startIndex;
         throw new IllegalArgumentException(var5.toString());
      } else if (this.endIndex < 0) {
         var4 = false;
         var5 = "endIndex should be non-negative, but is " + this.endIndex;
         throw new IllegalArgumentException(var5.toString());
      } else if (this.endIndex < this.startIndex) {
         var4 = false;
         var5 = "endIndex should be not less than startIndex, but was " + this.endIndex + " < " + this.startIndex;
         throw new IllegalArgumentException(var5.toString());
      }
   }

   private final int getCount() {
      return this.endIndex - this.startIndex;
   }

   @NotNull
   public Sequence<T> drop(int n) {
      return n >= this.getCount() ? SequencesKt.emptySequence() : (Sequence)(new SubSequence(this.sequence, this.startIndex + n, this.endIndex));
   }

   @NotNull
   public Sequence<T> take(int n) {
      return n >= this.getCount() ? (Sequence)this : (Sequence)(new SubSequence(this.sequence, this.startIndex, this.startIndex + n));
   }

   @NotNull
   public Iterator<T> iterator() {
      return (Iterator)(new Iterator<T>() {
         private final Iterator<T> iterator;
         private int position;

         {
            this.iterator = SubSequence.this.sequence.iterator();
         }

         public final Iterator<T> getIterator() {
            return this.iterator;
         }

         public final int getPosition() {
            return this.position;
         }

         public final void setPosition(int <set-?>) {
            this.position = var1;
         }

         private final void drop() {
            while(this.position < SubSequence.this.startIndex && this.iterator.hasNext()) {
               this.iterator.next();
               int var1 = this.position++;
            }

         }

         public boolean hasNext() {
            this.drop();
            return this.position < SubSequence.this.endIndex && this.iterator.hasNext();
         }

         public T next() {
            this.drop();
            if (this.position >= SubSequence.this.endIndex) {
               throw new NoSuchElementException();
            } else {
               int var1 = this.position++;
               return this.iterator.next();
            }
         }

         public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
         }
      });
   }
}
