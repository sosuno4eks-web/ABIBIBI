package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1 implements Iterable<T>, KMappedMarker {
   // $FF: synthetic field
   final Sequence $this_asIterable$inlined;

   public SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(Sequence var1) {
      this.$this_asIterable$inlined = var1;
   }

   public Iterator<T> iterator() {
      int var1 = false;
      return this.$this_asIterable$inlined.iterator();
   }
}
