package kotlin.text;

import java.util.Iterator;
import kotlin.sequences.Sequence;

public final class StringsKt___StringsKt$asSequence$$inlined$Sequence$1 implements Sequence<Character> {
   // $FF: synthetic field
   final CharSequence $this_asSequence$inlined;

   public StringsKt___StringsKt$asSequence$$inlined$Sequence$1(CharSequence var1) {
      this.$this_asSequence$inlined = var1;
   }

   public Iterator<Character> iterator() {
      int var1 = false;
      return (Iterator)StringsKt.iterator(this.$this_asSequence$inlined);
   }
}
