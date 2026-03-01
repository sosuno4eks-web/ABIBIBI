package kotlin.collections;

import java.util.Iterator;
import kotlin.sequences.Sequence;

public final class CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1 implements Sequence<T> {
   // $FF: synthetic field
   final Iterable $this_asSequence$inlined;

   public CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1(Iterable var1) {
      this.$this_asSequence$inlined = var1;
   }

   public Iterator<T> iterator() {
      int var1 = false;
      return this.$this_asSequence$inlined.iterator();
   }
}
