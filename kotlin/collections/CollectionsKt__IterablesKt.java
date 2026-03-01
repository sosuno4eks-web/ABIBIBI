package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.TuplesKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class CollectionsKt__IterablesKt extends CollectionsKt__CollectionsKt {
   @InlineOnly
   private static final <T> Iterable<T> Iterable(Function0<? extends Iterator<? extends T>> iterator) {
      Intrinsics.checkNotNullParameter(iterator, "iterator");
      return (Iterable)(new Iterable<T>() {
         public Iterator<T> iterator() {
            return (Iterator)iterator.invoke();
         }
      });
   }

   @PublishedApi
   @Nullable
   public static final <T> Integer collectionSizeOrNull(@NotNull Iterable<? extends T> $this$collectionSizeOrNull) {
      Intrinsics.checkNotNullParameter($this$collectionSizeOrNull, "<this>");
      return $this$collectionSizeOrNull instanceof Collection ? ((Collection)$this$collectionSizeOrNull).size() : null;
   }

   @PublishedApi
   public static final <T> int collectionSizeOrDefault(@NotNull Iterable<? extends T> $this$collectionSizeOrDefault, int default) {
      Intrinsics.checkNotNullParameter($this$collectionSizeOrDefault, "<this>");
      return $this$collectionSizeOrDefault instanceof Collection ? ((Collection)$this$collectionSizeOrDefault).size() : var1;
   }

   @NotNull
   public static final <T> List<T> flatten(@NotNull Iterable<? extends Iterable<? extends T>> $this$flatten) {
      Intrinsics.checkNotNullParameter($this$flatten, "<this>");
      ArrayList result = new ArrayList();
      Iterator var2 = $this$flatten.iterator();

      while(var2.hasNext()) {
         Iterable element = (Iterable)var2.next();
         CollectionsKt.addAll((Collection)result, element);
      }

      return (List)result;
   }

   @NotNull
   public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Iterable<? extends Pair<? extends T, ? extends R>> $this$unzip) {
      Intrinsics.checkNotNullParameter($this$unzip, "<this>");
      int expectedSize = CollectionsKt.collectionSizeOrDefault($this$unzip, 10);
      ArrayList listT = new ArrayList(expectedSize);
      ArrayList listR = new ArrayList(expectedSize);
      Iterator var4 = $this$unzip.iterator();

      while(var4.hasNext()) {
         Pair pair = (Pair)var4.next();
         listT.add(pair.getFirst());
         listR.add(pair.getSecond());
      }

      return TuplesKt.to(listT, listR);
   }

   public CollectionsKt__IterablesKt() {
   }
}
