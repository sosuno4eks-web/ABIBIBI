package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;

public final class SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1 implements Sequence<T> {
   // $FF: synthetic field
   final Function2 $block$inlined;

   public SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1(Function2 var1) {
      this.$block$inlined = var1;
   }

   public Iterator<T> iterator() {
      int var1 = false;
      return SequencesKt.iterator(this.$block$inlined);
   }
}
