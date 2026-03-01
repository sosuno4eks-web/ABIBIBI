package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.LongIterator;

public final class LongProgressionIterator extends LongIterator {
   private final long step;
   private final long finalElement;
   private boolean hasNext;
   private long next;

   public LongProgressionIterator(long first, long last, long step) {
      this.step = step;
      this.finalElement = last;
      this.hasNext = this.step > 0L ? first <= last : first >= last;
      this.next = this.hasNext ? first : this.finalElement;
   }

   public final long getStep() {
      return this.step;
   }

   public boolean hasNext() {
      return this.hasNext;
   }

   public long nextLong() {
      long value = this.next;
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
