package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.sequences.Sequence;

public final class ArraysKt___ArraysKt$asSequence$$inlined$Sequence$5 implements Sequence<Long> {
   // $FF: synthetic field
   final long[] $this_asSequence$inlined;

   public ArraysKt___ArraysKt$asSequence$$inlined$Sequence$5(long[] var1) {
      this.$this_asSequence$inlined = var1;
   }

   public Iterator<Long> iterator() {
      int var1 = false;
      return (Iterator)ArrayIteratorsKt.iterator(this.$this_asSequence$inlined);
   }
}
