package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.sequences.Sequence;

public final class ArraysKt___ArraysKt$asSequence$$inlined$Sequence$9 implements Sequence<Character> {
   // $FF: synthetic field
   final char[] $this_asSequence$inlined;

   public ArraysKt___ArraysKt$asSequence$$inlined$Sequence$9(char[] var1) {
      this.$this_asSequence$inlined = var1;
   }

   public Iterator<Character> iterator() {
      int var1 = false;
      return (Iterator)ArrayIteratorsKt.iterator(this.$this_asSequence$inlined);
   }
}
