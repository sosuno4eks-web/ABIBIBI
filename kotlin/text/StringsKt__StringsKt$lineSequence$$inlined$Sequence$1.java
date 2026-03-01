package kotlin.text;

import java.util.Iterator;
import kotlin.sequences.Sequence;

public final class StringsKt__StringsKt$lineSequence$$inlined$Sequence$1 implements Sequence<String> {
   // $FF: synthetic field
   final CharSequence $this_lineSequence$inlined;

   public StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(CharSequence var1) {
      this.$this_lineSequence$inlined = var1;
   }

   public Iterator<String> iterator() {
      int var1 = false;
      return (Iterator)(new LinesIterator(this.$this_lineSequence$inlined));
   }
}
