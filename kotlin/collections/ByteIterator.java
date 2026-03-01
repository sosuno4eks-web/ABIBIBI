package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

public abstract class ByteIterator implements Iterator<Byte>, KMappedMarker {
   @NotNull
   public final Byte next() {
      return this.nextByte();
   }

   public abstract byte nextByte();

   public void remove() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }
}
