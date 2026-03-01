package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin(
   version = "1.3"
)
final class ULongProgressionIterator implements Iterator<ULong>, KMappedMarker {
   private final long finalElement;
   private boolean hasNext;
   private final long step;
   private long next;

   private ULongProgressionIterator(long first, long last, long step) {
      this.finalElement = last;
      this.hasNext = step > 0L ? Long.compareUnsigned(first, last) <= 0 : Long.compareUnsigned(first, last) >= 0;
      this.step = ULong.constructor-impl(step);
      this.next = this.hasNext ? first : this.finalElement;
   }

   public boolean hasNext() {
      return this.hasNext;
   }

   public long next_s_VKNKU/* $FF was: next-s-VKNKU*/() {
      long value = this.next;
      if (value == this.finalElement) {
         if (!this.hasNext) {
            throw new NoSuchElementException();
         }

         this.hasNext = false;
      } else {
         this.next = ULong.constructor-impl(this.next + this.step);
      }

      return value;
   }

   public void remove() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   // $FF: synthetic method
   public ULongProgressionIterator(long first, long last, long step, DefaultConstructorMarker $constructor_marker) {
      this(first, last, step);
   }
}
