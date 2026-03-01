package kotlin.streams.jdk8;

import java.util.Iterator;
import java.util.PrimitiveIterator.OfInt;
import java.util.stream.IntStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public final class StreamsKt$asSequence$$inlined$Sequence$2 implements Sequence<Integer> {
   // $FF: synthetic field
   final IntStream $this_asSequence$inlined;

   public StreamsKt$asSequence$$inlined$Sequence$2(IntStream var1) {
      this.$this_asSequence$inlined = var1;
   }

   public Iterator<Integer> iterator() {
      int var1 = false;
      OfInt var10000 = this.$this_asSequence$inlined.iterator();
      Intrinsics.checkNotNullExpressionValue(var10000, "iterator(...)");
      return (Iterator)var10000;
   }
}
