package kotlin.streams.jdk8;

import java.util.Iterator;
import java.util.PrimitiveIterator.OfLong;
import java.util.stream.LongStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public final class StreamsKt$asSequence$$inlined$Sequence$3 implements Sequence<Long> {
   // $FF: synthetic field
   final LongStream $this_asSequence$inlined;

   public StreamsKt$asSequence$$inlined$Sequence$3(LongStream var1) {
      this.$this_asSequence$inlined = var1;
   }

   public Iterator<Long> iterator() {
      int var1 = false;
      OfLong var10000 = this.$this_asSequence$inlined.iterator();
      Intrinsics.checkNotNullExpressionValue(var10000, "iterator(...)");
      return (Iterator)var10000;
   }
}
