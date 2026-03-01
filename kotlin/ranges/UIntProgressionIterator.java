package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin(
   version = "1.3"
)
final class UIntProgressionIterator implements Iterator<UInt>, KMappedMarker {
   private final int finalElement;
   private boolean hasNext;
   private final int step;
   private int next;

   private UIntProgressionIterator(int first, int last, int step) {
      this.finalElement = last;
      this.hasNext = step > 0 ? Integer.compareUnsigned(first, last) <= 0 : Integer.compareUnsigned(first, last) >= 0;
      this.step = UInt.constructor-impl(step);
      this.next = this.hasNext ? first : this.finalElement;
   }

   public boolean hasNext() {
      return this.hasNext;
   }

   public int next_pVg5ArA/* $FF was: next-pVg5ArA*/() {
      int value = this.next;
      if (value == this.finalElement) {
         if (!this.hasNext) {
            throw new NoSuchElementException();
         }

         this.hasNext = false;
      } else {
         this.next = UInt.constructor-impl(this.next + this.step);
      }

      return value;
   }

   public void remove() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   // $FF: synthetic method
   public UIntProgressionIterator(int first, int last, int step, DefaultConstructorMarker $constructor_marker) {
      this(first, last, step);
   }
}
