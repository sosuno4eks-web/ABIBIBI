package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

public final class IndexingIterable<T> implements Iterable<IndexedValue<? extends T>>, KMappedMarker {
   @NotNull
   private final Function0<Iterator<T>> iteratorFactory;

   public IndexingIterable(@NotNull Function0<? extends Iterator<? extends T>> iteratorFactory) {
      Intrinsics.checkNotNullParameter(iteratorFactory, "iteratorFactory");
      super();
      this.iteratorFactory = iteratorFactory;
   }

   @NotNull
   public Iterator<IndexedValue<T>> iterator() {
      return (Iterator)(new IndexingIterator((Iterator)this.iteratorFactory.invoke()));
   }
}
