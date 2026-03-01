package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class TransformingSequence<T, R> implements Sequence<R> {
   @NotNull
   private final Sequence<T> sequence;
   @NotNull
   private final Function1<T, R> transformer;

   public TransformingSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> transformer) {
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

         {
            this.iterator = TransformingSequence.this.sequence.iterator();
         }

         public final Iterator<T> getIterator() {
            return this.iterator;
         }

         public R next() {
            return TransformingSequence.this.transformer.invoke(this.iterator.next());
         }

         public boolean hasNext() {
            return this.iterator.hasNext();
         }

         public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
         }
      });
   }

   @NotNull
   public final <E> Sequence<E> flatten$kotlin_stdlib(@NotNull Function1<? super R, ? extends Iterator<? extends E>> iterator) {
      Intrinsics.checkNotNullParameter(iterator, "iterator");
      return (Sequence)(new FlatteningSequence(this.sequence, this.transformer, iterator));
   }
}
