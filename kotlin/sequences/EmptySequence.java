package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.EmptyIterator;
import org.jetbrains.annotations.NotNull;

final class EmptySequence implements Sequence, DropTakeSequence {
   @NotNull
   public static final EmptySequence INSTANCE = new EmptySequence();

   private EmptySequence() {
   }

   @NotNull
   public Iterator iterator() {
      return (Iterator)EmptyIterator.INSTANCE;
   }

   @NotNull
   public EmptySequence drop(int n) {
      return INSTANCE;
   }

   @NotNull
   public EmptySequence take(int n) {
      return INSTANCE;
   }
}
