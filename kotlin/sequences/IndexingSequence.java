package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class IndexingSequence<T> implements Sequence<IndexedValue<? extends T>> {
   @NotNull
   private final Sequence<T> sequence;

   public IndexingSequence(@NotNull Sequence<? extends T> sequence) {
      Intrinsics.checkNotNullParameter(sequence, "sequence");
      super();
      this.sequence = sequence;
   }

   @NotNull
   public Iterator<IndexedValue<T>> iterator() {
      return (Iterator)(new Iterator<IndexedValue<? extends T>>(this) {
         private final Iterator<T> iterator;
         private int index;

         {
            this.iterator = $receiver.sequence.iterator();
         }

         public final Iterator<T> getIterator() {
            return this.iterator;
         }

         public final int getIndex() {
            return this.index;
         }

         public final void setIndex(int <set-?>) {
            this.index = var1;
         }

         public IndexedValue<T> next() {
            IndexedValue var10000 = new IndexedValue;
            int var1 = this.index++;
            if (var1 < 0) {
               CollectionsKt.throwIndexOverflow();
            }

            var10000.<init>(var1, this.iterator.next());
            return var10000;
         }

         public boolean hasNext() {
            return this.iterator.hasNext();
         }

         public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
         }
      });
   }
}
