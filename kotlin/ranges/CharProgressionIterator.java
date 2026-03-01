package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;

public final class CharProgressionIterator extends CharIterator {
   private final int step;
   private final int finalElement;
   private boolean hasNext;
   private int next;

   public CharProgressionIterator(char first, char last, int step) {
      this.step = step;
      this.finalElement = last;
      this.hasNext = this.step > 0 ? Intrinsics.compare(first, last) <= 0 : Intrinsics.compare(first, last) >= 0;
      this.next = this.hasNext ? first : this.finalElement;
   }

   public final int getStep() {
      return this.step;
   }

   public boolean hasNext() {
      return this.hasNext;
   }

   public char nextChar() {
      int value = this.next;
      if (value == this.finalElement) {
         if (!this.hasNext) {
            throw new NoSuchElementException();
         }

         this.hasNext = false;
      } else {
         this.next += this.step;
      }

      return (char)value;
   }
}
