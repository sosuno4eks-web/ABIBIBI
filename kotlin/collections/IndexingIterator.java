package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

public final class IndexingIterator<T> implements Iterator<IndexedValue<? extends T>>, KMappedMarker {
   @NotNull
   private final Iterator<T> iterator;
   private int index;

   public IndexingIterator(@NotNull Iterator<? extends T> iterator) {
      Intrinsics.checkNotNullParameter(iterator, "iterator");
      super();
      this.iterator = iterator;
   }

   public final boolean hasNext() {
      return this.iterator.hasNext();
   }

   @NotNull
   public final IndexedValue<T> next() {
      IndexedValue var10000 = new IndexedValue;
      int var1 = this.index++;
      if (var1 < 0) {
         CollectionsKt.throwIndexOverflow();
      }

      var10000.<init>(var1, this.iterator.next());
      return var10000;
   }

   public void remove() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }
}
