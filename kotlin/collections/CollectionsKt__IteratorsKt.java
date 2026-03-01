package kotlin.collections;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class CollectionsKt__IteratorsKt extends CollectionsKt__IteratorsJVMKt {
   @InlineOnly
   private static final <T> Iterator<T> iterator(Iterator<? extends T> $this$iterator) {
      Intrinsics.checkNotNullParameter($this$iterator, "<this>");
      return $this$iterator;
   }

   @NotNull
   public static final <T> Iterator<IndexedValue<T>> withIndex(@NotNull Iterator<? extends T> $this$withIndex) {
      Intrinsics.checkNotNullParameter($this$withIndex, "<this>");
      return (Iterator)(new IndexingIterator($this$withIndex));
   }

   public static final <T> void forEach(@NotNull Iterator<? extends T> $this$forEach, @NotNull Function1<? super T, Unit> operation) {
      Intrinsics.checkNotNullParameter($this$forEach, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$forEach = false;
      Iterator var3 = $this$forEach;

      while(var3.hasNext()) {
         Object element = var3.next();
         operation.invoke(element);
      }

   }

   public CollectionsKt__IteratorsKt() {
   }
}
