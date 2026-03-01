package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class StringsKt___StringsKt$asIterable$$inlined$Iterable$1 implements Iterable<Character>, KMappedMarker {
   // $FF: synthetic field
   final CharSequence $this_asIterable$inlined;

   public StringsKt___StringsKt$asIterable$$inlined$Iterable$1(CharSequence var1) {
      this.$this_asIterable$inlined = var1;
   }

   public Iterator<Character> iterator() {
      int var1 = false;
      return (Iterator)StringsKt.iterator(this.$this_asIterable$inlined);
   }
}
