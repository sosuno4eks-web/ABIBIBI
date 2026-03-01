package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.sequences.Sequence;

public final class ArraysKt___ArraysKt$asSequence$$inlined$Sequence$3 implements Sequence<Short> {
   // $FF: synthetic field
   final short[] $this_asSequence$inlined;

   public ArraysKt___ArraysKt$asSequence$$inlined$Sequence$3(short[] var1) {
      this.$this_asSequence$inlined = var1;
   }

   public Iterator<Short> iterator() {
      int var1 = false;
      return (Iterator)ArrayIteratorsKt.iterator(this.$this_asSequence$inlined);
   }
}
