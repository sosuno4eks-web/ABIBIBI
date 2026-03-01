package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.sequences.Sequence;

public final class ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1 implements Sequence<T> {
   // $FF: synthetic field
   final Object[] $this_asSequence$inlined;

   public ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1(Object[] var1) {
      this.$this_asSequence$inlined = var1;
   }

   public Iterator<T> iterator() {
      int var1 = false;
      return ArrayIteratorKt.iterator(this.$this_asSequence$inlined);
   }
}
