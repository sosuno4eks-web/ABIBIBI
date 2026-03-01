package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class CollectionsKt__IteratorsJVMKt extends CollectionsKt__IterablesKt {
   @NotNull
   public static final <T> Iterator<T> iterator(@NotNull Enumeration<T> $this$iterator) {
      Intrinsics.checkNotNullParameter($this$iterator, "<this>");
      return (Iterator)(new Iterator<T>() {
         public boolean hasNext() {
            return $this$iterator.hasMoreElements();
         }

         public T next() {
            return $this$iterator.nextElement();
         }

         public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
         }
      });
   }

   public CollectionsKt__IteratorsJVMKt() {
   }
}
