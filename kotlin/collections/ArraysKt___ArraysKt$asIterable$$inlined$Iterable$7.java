package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class ArraysKt___ArraysKt$asIterable$$inlined$Iterable$7 implements Iterable<Double>, KMappedMarker {
   // $FF: synthetic field
   final double[] $this_asIterable$inlined;

   public ArraysKt___ArraysKt$asIterable$$inlined$Iterable$7(double[] var1) {
      this.$this_asIterable$inlined = var1;
   }

   public Iterator<Double> iterator() {
      int var1 = false;
      return (Iterator)ArrayIteratorsKt.iterator(this.$this_asIterable$inlined);
   }
}
