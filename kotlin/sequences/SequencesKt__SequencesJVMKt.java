package kotlin.sequences;

import java.util.Enumeration;
import kotlin.collections.CollectionsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

class SequencesKt__SequencesJVMKt extends SequencesKt__SequenceBuilderKt {
   @InlineOnly
   private static final <T> Sequence<T> asSequence(Enumeration<T> $this$asSequence) {
      Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
      return SequencesKt.asSequence(CollectionsKt.iterator($this$asSequence));
   }

   public SequencesKt__SequencesJVMKt() {
   }
}
