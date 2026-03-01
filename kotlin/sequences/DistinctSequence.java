package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class DistinctSequence<T, K> implements Sequence<T> {
   @NotNull
   private final Sequence<T> source;
   @NotNull
   private final Function1<T, K> keySelector;

   public DistinctSequence(@NotNull Sequence<? extends T> source, @NotNull Function1<? super T, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter(source, "source");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      super();
      this.source = source;
      this.keySelector = keySelector;
   }

   @NotNull
   public Iterator<T> iterator() {
      return (Iterator)(new DistinctIterator(this.source.iterator(), this.keySelector));
   }
}
