package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5 implements Iterable<Long>, KMappedMarker {
   // $FF: synthetic field
   final long[] $this_asIterable$inlined;

   public ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5(long[] var1) {
      this.$this_asIterable$inlined = var1;
   }

   public Iterator<Long> iterator() {
      int var1 = false;
      return (Iterator)ArrayIteratorsKt.iterator(this.$this_asIterable$inlined);
   }
}
