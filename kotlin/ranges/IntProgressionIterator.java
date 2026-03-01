package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.IntIterator;

public final class IntProgressionIterator extends IntIterator {
   private final int step;
   private final int finalElement;
   private boolean hasNext;
   private int next;

   public IntProgressionIterator(int first, int last, int step) {
      this.step = step;
      this.finalElement = last;
      this.hasNext = this.step > 0 ? first <= last : first >= last;
      this.next = this.hasNext ? first : this.finalElement;
   }

   public final int getStep() {
      return this.step;
   }

   public boolean hasNext() {
      return this.hasNext;
   }

   public int nextInt() {
      int value = this.next;
      if (value == this.finalElement) {
         if (!this.hasNext) {
            throw new NoSuchElementException();
         }

         this.hasNext = false;
      } else {
         this.next += this.step;
      }

      return value;
   }
}
