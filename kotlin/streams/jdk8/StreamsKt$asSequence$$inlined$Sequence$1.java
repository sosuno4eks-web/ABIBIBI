package kotlin.streams.jdk8;

import java.util.Iterator;
import java.util.stream.Stream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public final class StreamsKt$asSequence$$inlined$Sequence$1 implements Sequence<T> {
   // $FF: synthetic field
   final Stream $this_asSequence$inlined;

   public StreamsKt$asSequence$$inlined$Sequence$1(Stream var1) {
      this.$this_asSequence$inlined = var1;
   }

   public Iterator<T> iterator() {
      int var1 = false;
      Iterator var10000 = this.$this_asSequence$inlined.iterator();
      Intrinsics.checkNotNullExpressionValue(var10000, "iterator(...)");
      return var10000;
   }
}
