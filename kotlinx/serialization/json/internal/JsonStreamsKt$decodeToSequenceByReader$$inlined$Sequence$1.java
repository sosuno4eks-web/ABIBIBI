package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.sequences.Sequence;

public final class JsonStreamsKt$decodeToSequenceByReader$$inlined$Sequence$1 implements Sequence<T> {
   // $FF: synthetic field
   final Iterator $iter$inlined;

   public JsonStreamsKt$decodeToSequenceByReader$$inlined$Sequence$1(Iterator var1) {
      this.$iter$inlined = var1;
   }

   public Iterator<T> iterator() {
      int var1 = false;
      return this.$iter$inlined;
   }
}
