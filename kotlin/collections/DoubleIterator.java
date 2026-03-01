package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

public abstract class DoubleIterator implements Iterator<Double>, KMappedMarker {
   @NotNull
   public final Double next() {
      return this.nextDouble();
   }

   public abstract double nextDouble();

   public void remove() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }
}
