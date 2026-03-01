package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class TransformingIndexedSequence<T, R> implements Sequence<R> {
   @NotNull
   private final Sequence<T> sequence;
   @NotNull
   private final Function2<Integer, T, R> transformer;

   public TransformingIndexedSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, ? extends R> transformer) {
      Intrinsics.checkNotNullParameter(sequence, "sequence");
      Intrinsics.checkNotNullParameter(transformer, "transformer");
      super();
      this.sequence = sequence;
      this.transformer = transformer;
   }

   @NotNull
   public Iterator<R> iterator() {
      return (Iterator)(new Iterator<R>() {
         private final Iterator<T> iterator;
         private int index;

         {
            this.iterator = TransformingIndexedSequence.this.sequence.iterator();
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

         public R next() {
            Function2 var10000 = TransformingIndexedSequence.this.transformer;
            int var1 = this.index++;
            if (var1 < 0) {
               CollectionsKt.throwIndexOverflow();
            }

            return var10000.invoke(var1, this.iterator.next());
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
