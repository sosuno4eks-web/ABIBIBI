package kotlin.collections;

import java.util.List;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

class CollectionsKt__ReversedViewsKt extends CollectionsKt__MutableCollectionsKt {
   private static final int reverseElementIndex$CollectionsKt__ReversedViewsKt(List<?> $this$reverseElementIndex, int index) {
      if (0 <= index ? index <= CollectionsKt.getLastIndex($this$reverseElementIndex) : false) {
         return CollectionsKt.getLastIndex($this$reverseElementIndex) - index;
      } else {
         throw new IndexOutOfBoundsException("Element index " + index + " must be in range [" + new IntRange(0, CollectionsKt.getLastIndex($this$reverseElementIndex)) + "].");
      }
   }

   private static final int reversePositionIndex$CollectionsKt__ReversedViewsKt(List<?> $this$reversePositionIndex, int index) {
      if (0 <= index ? index <= $this$reversePositionIndex.size() : false) {
         return $this$reversePositionIndex.size() - index;
      } else {
         throw new IndexOutOfBoundsException("Position index " + index + " must be in range [" + new IntRange(0, $this$reversePositionIndex.size()) + "].");
      }
   }

   private static final int reverseIteratorIndex$CollectionsKt__ReversedViewsKt(List<?> $this$reverseIteratorIndex, int index) {
      return CollectionsKt.getLastIndex($this$reverseIteratorIndex) - index;
   }

   @NotNull
   public static final <T> List<T> asReversed(@NotNull List<? extends T> $this$asReversed) {
      Intrinsics.checkNotNullParameter($this$asReversed, "<this>");
      return (List)(new ReversedListReadOnly($this$asReversed));
   }

   @JvmName(
      name = "asReversedMutable"
   )
   @NotNull
   public static final <T> List<T> asReversedMutable(@NotNull List<T> $this$asReversed) {
      Intrinsics.checkNotNullParameter($this$asReversed, "<this>");
      return (List)(new ReversedList($this$asReversed));
   }

   // $FF: synthetic method
   public static final int access$reverseElementIndex(List $receiver, int index) {
      return reverseElementIndex$CollectionsKt__ReversedViewsKt($receiver, index);
   }

   // $FF: synthetic method
   public static final int access$reversePositionIndex(List $receiver, int index) {
      return reversePositionIndex$CollectionsKt__ReversedViewsKt($receiver, index);
   }

   // $FF: synthetic method
   public static final int access$reverseIteratorIndex(List $receiver, int index) {
      return reverseIteratorIndex$CollectionsKt__ReversedViewsKt($receiver, index);
   }

   public CollectionsKt__ReversedViewsKt() {
   }
}
