package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1 implements Iterable<T>, KMappedMarker {
   // $FF: synthetic field
   final Object[] $this_asIterable$inlined;

   public ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1(Object[] var1) {
      this.$this_asIterable$inlined = var1;
   }

   public Iterator<T> iterator() {
      int var1 = false;
      return ArrayIteratorKt.iterator(this.$this_asIterable$inlined);
   }
}
