package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

public final class EmptyIterator implements ListIterator, KMappedMarker {
   @NotNull
   public static final EmptyIterator INSTANCE = new EmptyIterator();

   private EmptyIterator() {
   }

   public boolean hasNext() {
      return false;
   }

   public boolean hasPrevious() {
      return false;
   }

   public int nextIndex() {
      return 0;
   }

   public int previousIndex() {
      return -1;
   }

   @NotNull
   public Void next() {
      throw new NoSuchElementException();
   }

   @NotNull
   public Void previous() {
      throw new NoSuchElementException();
   }

   public void remove() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public void set(Void element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public void add(Void element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }
}
