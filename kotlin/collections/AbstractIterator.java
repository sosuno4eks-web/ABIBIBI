package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractIterator<T> implements Iterator<T>, KMappedMarker {
   private int state;
   @Nullable
   private T nextValue;

   public boolean hasNext() {
      boolean var10000;
      switch(this.state) {
      case 0:
         var10000 = this.tryToComputeNext();
         break;
      case 1:
         var10000 = true;
         break;
      case 2:
         var10000 = false;
         break;
      default:
         throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
      }

      return var10000;
   }

   public T next() {
      if (this.state == 1) {
         this.state = 0;
         return this.nextValue;
      } else if (this.state != 2 && this.tryToComputeNext()) {
         this.state = 0;
         return this.nextValue;
      } else {
         throw new NoSuchElementException();
      }
   }

   private final boolean tryToComputeNext() {
      this.state = 3;
      this.computeNext();
      return this.state == 1;
   }

   protected abstract void computeNext();

   protected final void setNext(T value) {
      this.nextValue = value;
      this.state = 1;
   }

   protected final void done() {
      this.state = 2;
   }

   public void remove() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }
}
