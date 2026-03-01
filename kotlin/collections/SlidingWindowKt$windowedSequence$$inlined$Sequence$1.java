package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.sequences.Sequence;

public final class SlidingWindowKt$windowedSequence$$inlined$Sequence$1 implements Sequence<List<? extends T>> {
   // $FF: synthetic field
   final Sequence $this_windowedSequence$inlined;
   // $FF: synthetic field
   final int $size$inlined;
   // $FF: synthetic field
   final int $step$inlined;
   // $FF: synthetic field
   final boolean $partialWindows$inlined;
   // $FF: synthetic field
   final boolean $reuseBuffer$inlined;

   public SlidingWindowKt$windowedSequence$$inlined$Sequence$1(Sequence var1, int var2, int var3, boolean var4, boolean var5) {
      this.$this_windowedSequence$inlined = var1;
      this.$size$inlined = var2;
      this.$step$inlined = var3;
      this.$partialWindows$inlined = var4;
      this.$reuseBuffer$inlined = var5;
   }

   public Iterator<List<? extends T>> iterator() {
      int var1 = false;
      return SlidingWindowKt.windowedIterator(this.$this_windowedSequence$inlined.iterator(), this.$size$inlined, this.$step$inlined, this.$partialWindows$inlined, this.$reuseBuffer$inlined);
   }
}
