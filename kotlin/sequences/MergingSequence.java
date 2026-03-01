package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class MergingSequence<T1, T2, V> implements Sequence<V> {
   @NotNull
   private final Sequence<T1> sequence1;
   @NotNull
   private final Sequence<T2> sequence2;
   @NotNull
   private final Function2<T1, T2, V> transform;

   public MergingSequence(@NotNull Sequence<? extends T1> sequence1, @NotNull Sequence<? extends T2> sequence2, @NotNull Function2<? super T1, ? super T2, ? extends V> transform) {
      Intrinsics.checkNotNullParameter(sequence1, "sequence1");
      Intrinsics.checkNotNullParameter(sequence2, "sequence2");
      Intrinsics.checkNotNullParameter(transform, "transform");
      super();
      this.sequence1 = sequence1;
      this.sequence2 = sequence2;
      this.transform = transform;
   }

   @NotNull
   public Iterator<V> iterator() {
      return (Iterator)(new Iterator<V>() {
         private final Iterator<T1> iterator1;
         private final Iterator<T2> iterator2;

         {
            this.iterator1 = MergingSequence.this.sequence1.iterator();
            this.iterator2 = MergingSequence.this.sequence2.iterator();
         }

         public final Iterator<T1> getIterator1() {
            return this.iterator1;
         }

         public final Iterator<T2> getIterator2() {
            return this.iterator2;
         }

         public V next() {
            return MergingSequence.this.transform.invoke(this.iterator1.next(), this.iterator2.next());
         }

         public boolean hasNext() {
            return this.iterator1.hasNext() && this.iterator2.hasNext();
         }

         public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
         }
      });
   }
}
