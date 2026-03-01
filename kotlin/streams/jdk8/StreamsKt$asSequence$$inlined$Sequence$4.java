package kotlin.streams.jdk8;

import java.util.Iterator;
import java.util.PrimitiveIterator.OfDouble;
import java.util.stream.DoubleStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public final class StreamsKt$asSequence$$inlined$Sequence$4 implements Sequence<Double> {
   // $FF: synthetic field
   final DoubleStream $this_asSequence$inlined;

   public StreamsKt$asSequence$$inlined$Sequence$4(DoubleStream var1) {
      this.$this_asSequence$inlined = var1;
   }

   public Iterator<Double> iterator() {
      int var1 = false;
      OfDouble var10000 = this.$this_asSequence$inlined.iterator();
      Intrinsics.checkNotNullExpressionValue(var10000, "iterator(...)");
      return (Iterator)var10000;
   }
}
