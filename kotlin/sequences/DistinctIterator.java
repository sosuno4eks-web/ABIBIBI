package kotlin.sequences;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

final class DistinctIterator<T, K> extends AbstractIterator<T> {
   @NotNull
   private final Iterator<T> source;
   @NotNull
   private final Function1<T, K> keySelector;
   @NotNull
   private final HashSet<K> observed;

   public DistinctIterator(@NotNull Iterator<? extends T> source, @NotNull Function1<? super T, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter(source, "source");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      super();
      this.source = source;
      this.keySelector = keySelector;
      this.observed = new HashSet();
   }

   protected void computeNext() {
      while(true) {
         if (this.source.hasNext()) {
            Object next = this.source.next();
            Object key = this.keySelector.invoke(next);
            if (!this.observed.add(key)) {
               continue;
            }

            this.setNext(next);
            return;
         }

         this.done();
         return;
      }
   }
}
