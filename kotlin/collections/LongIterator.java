package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

public abstract class LongIterator implements Iterator<Long>, KMappedMarker {
   @NotNull
   public final Long next() {
      return this.nextLong();
   }

   public abstract long nextLong();

   public void remove() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }
}
