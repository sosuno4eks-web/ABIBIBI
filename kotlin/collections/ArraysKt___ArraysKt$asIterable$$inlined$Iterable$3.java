package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class ArraysKt___ArraysKt$asIterable$$inlined$Iterable$3 implements Iterable<Short>, KMappedMarker {
   // $FF: synthetic field
   final short[] $this_asIterable$inlined;

   public ArraysKt___ArraysKt$asIterable$$inlined$Iterable$3(short[] var1) {
      this.$this_asIterable$inlined = var1;
   }

   public Iterator<Short> iterator() {
      int var1 = false;
      return (Iterator)ArrayIteratorsKt.iterator(this.$this_asIterable$inlined);
   }
}
