package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ConstrainedOnceSequence<T> implements Sequence<T> {
   @NotNull
   private final AtomicReference<Sequence<T>> sequenceRef;

   public ConstrainedOnceSequence(@NotNull Sequence<? extends T> sequence) {
      Intrinsics.checkNotNullParameter(sequence, "sequence");
      super();
      this.sequenceRef = new AtomicReference(sequence);
   }

   @NotNull
   public Iterator<T> iterator() {
      Sequence var10000 = (Sequence)this.sequenceRef.getAndSet((Object)null);
      if (var10000 == null) {
         throw new IllegalStateException("This sequence can be consumed only once.");
      } else {
         Sequence sequence = var10000;
         return sequence.iterator();
      }
   }
}
