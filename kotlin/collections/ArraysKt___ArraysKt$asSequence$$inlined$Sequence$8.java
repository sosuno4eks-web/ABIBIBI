package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.sequences.Sequence;

public final class ArraysKt___ArraysKt$asSequence$$inlined$Sequence$8 implements Sequence<Boolean> {
   // $FF: synthetic field
   final boolean[] $this_asSequence$inlined;

   public ArraysKt___ArraysKt$asSequence$$inlined$Sequence$8(boolean[] var1) {
      this.$this_asSequence$inlined = var1;
   }

   public Iterator<Boolean> iterator() {
      int var1 = false;
      return (Iterator)ArrayIteratorsKt.iterator(this.$this_asSequence$inlined);
   }
}
