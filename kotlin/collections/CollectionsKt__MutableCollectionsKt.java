package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class CollectionsKt__MutableCollectionsKt extends CollectionsKt__MutableCollectionsJVMKt {
   @InlineOnly
   private static final <T> boolean remove(Collection<? extends T> $this$remove, T element) {
      Intrinsics.checkNotNullParameter($this$remove, "<this>");
      return TypeIntrinsics.asMutableCollection($this$remove).remove(element);
   }

   @InlineOnly
   private static final <T> boolean removeAll(Collection<? extends T> $this$removeAll, Collection<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$removeAll, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      return TypeIntrinsics.asMutableCollection($this$removeAll).removeAll(elements);
   }

   @InlineOnly
   private static final <T> boolean retainAll(Collection<? extends T> $this$retainAll, Collection<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$retainAll, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      return TypeIntrinsics.asMutableCollection($this$retainAll).retainAll(elements);
   }

   @InlineOnly
   private static final <T> void plusAssign(Collection<? super T> $this$plusAssign, T element) {
      Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
      $this$plusAssign.add(element);
   }

   @InlineOnly
   private static final <T> void plusAssign(Collection<? super T> $this$plusAssign, Iterable<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      CollectionsKt.addAll($this$plusAssign, elements);
   }

   @InlineOnly
   private static final <T> void plusAssign(Collection<? super T> $this$plusAssign, T[] elements) {
      Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      CollectionsKt.addAll($this$plusAssign, elements);
   }

   @InlineOnly
   private static final <T> void plusAssign(Collection<? super T> $this$plusAssign, Sequence<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      CollectionsKt.addAll($this$plusAssign, elements);
   }

   @InlineOnly
   private static final <T> void minusAssign(Collection<? super T> $this$minusAssign, T element) {
      Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
      $this$minusAssign.remove(element);
   }

   @InlineOnly
   private static final <T> void minusAssign(Collection<? super T> $this$minusAssign, Iterable<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      CollectionsKt.removeAll($this$minusAssign, elements);
   }

   @InlineOnly
   private static final <T> void minusAssign(Collection<? super T> $this$minusAssign, T[] elements) {
      Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      CollectionsKt.removeAll($this$minusAssign, elements);
   }

   @InlineOnly
   private static final <T> void minusAssign(Collection<? super T> $this$minusAssign, Sequence<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      CollectionsKt.removeAll($this$minusAssign, elements);
   }

   public static final <T> boolean addAll(@NotNull Collection<? super T> $this$addAll, @NotNull Iterable<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$addAll, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      if (elements instanceof Collection) {
         return $this$addAll.addAll((Collection)elements);
      } else {
         boolean result = false;
         Iterator var3 = elements.iterator();

         while(var3.hasNext()) {
            Object item = var3.next();
            if ($this$addAll.add(item)) {
               result = true;
            }
         }

         return result;
      }
   }

   public static final <T> boolean addAll(@NotNull Collection<? super T> $this$addAll, @NotNull Sequence<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$addAll, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      boolean result = false;
      Iterator var3 = elements.iterator();

      while(var3.hasNext()) {
         Object item = var3.next();
         if ($this$addAll.add(item)) {
            result = true;
         }
      }

      return result;
   }

   public static final <T> boolean addAll(@NotNull Collection<? super T> $this$addAll, @NotNull T[] elements) {
      Intrinsics.checkNotNullParameter($this$addAll, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      return $this$addAll.addAll((Collection)ArraysKt.asList(elements));
   }

   @NotNull
   public static final <T> Collection<T> convertToListIfNotCollection(@NotNull Iterable<? extends T> $this$convertToListIfNotCollection) {
      Intrinsics.checkNotNullParameter($this$convertToListIfNotCollection, "<this>");
      return $this$convertToListIfNotCollection instanceof Collection ? (Collection)$this$convertToListIfNotCollection : (Collection)CollectionsKt.toList($this$convertToListIfNotCollection);
   }

   public static final <T> boolean removeAll(@NotNull Collection<? super T> $this$removeAll, @NotNull Iterable<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$removeAll, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      return $this$removeAll.removeAll(CollectionsKt.convertToListIfNotCollection(elements));
   }

   public static final <T> boolean removeAll(@NotNull Collection<? super T> $this$removeAll, @NotNull Sequence<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$removeAll, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      List list = SequencesKt.toList(elements);
      return !((Collection)list).isEmpty() && $this$removeAll.removeAll((Collection)list);
   }

   public static final <T> boolean removeAll(@NotNull Collection<? super T> $this$removeAll, @NotNull T[] elements) {
      Intrinsics.checkNotNullParameter($this$removeAll, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      return elements.length != 0 && $this$removeAll.removeAll((Collection)ArraysKt.asList(elements));
   }

   public static final <T> boolean retainAll(@NotNull Collection<? super T> $this$retainAll, @NotNull Iterable<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$retainAll, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      return $this$retainAll.retainAll(CollectionsKt.convertToListIfNotCollection(elements));
   }

   public static final <T> boolean retainAll(@NotNull Collection<? super T> $this$retainAll, @NotNull T[] elements) {
      Intrinsics.checkNotNullParameter($this$retainAll, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      return elements.length != 0 ? $this$retainAll.retainAll((Collection)ArraysKt.asList(elements)) : retainNothing$CollectionsKt__MutableCollectionsKt($this$retainAll);
   }

   public static final <T> boolean retainAll(@NotNull Collection<? super T> $this$retainAll, @NotNull Sequence<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$retainAll, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      List list = SequencesKt.toList(elements);
      return !((Collection)list).isEmpty() ? $this$retainAll.retainAll((Collection)list) : retainNothing$CollectionsKt__MutableCollectionsKt($this$retainAll);
   }

   private static final boolean retainNothing$CollectionsKt__MutableCollectionsKt(Collection<?> $this$retainNothing) {
      boolean result = !$this$retainNothing.isEmpty();
      $this$retainNothing.clear();
      return result;
   }

   public static final <T> boolean removeAll(@NotNull Iterable<? extends T> $this$removeAll, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$removeAll, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      return filterInPlace$CollectionsKt__MutableCollectionsKt($this$removeAll, predicate, true);
   }

   public static final <T> boolean retainAll(@NotNull Iterable<? extends T> $this$retainAll, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$retainAll, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      return filterInPlace$CollectionsKt__MutableCollectionsKt($this$retainAll, predicate, false);
   }

   private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(Iterable<? extends T> $this$filterInPlace, Function1<? super T, Boolean> predicate, boolean predicateResultToRemove) {
      boolean result = false;
      Iterator $this$filterInPlace_u24lambda_u240 = $this$filterInPlace.iterator();
      boolean var5 = false;

      while($this$filterInPlace_u24lambda_u240.hasNext()) {
         if ((Boolean)predicate.invoke($this$filterInPlace_u24lambda_u240.next()) == predicateResultToRemove) {
            $this$filterInPlace_u24lambda_u240.remove();
            result = true;
         }
      }

      return result;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use removeAt(index) instead.",
      replaceWith = @ReplaceWith(
   expression = "removeAt(index)",
   imports = {}
),
      level = DeprecationLevel.ERROR
   )
   @InlineOnly
   private static final <T> T remove(List<T> $this$remove, int index) {
      Intrinsics.checkNotNullParameter($this$remove, "<this>");
      return $this$remove.remove(index);
   }

   @SinceKotlin(
      version = "1.4"
   )
   public static final <T> T removeFirst(@NotNull List<T> $this$removeFirst) {
      Intrinsics.checkNotNullParameter($this$removeFirst, "<this>");
      if ($this$removeFirst.isEmpty()) {
         throw new NoSuchElementException("List is empty.");
      } else {
         return $this$removeFirst.remove(0);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final <T> T removeFirstOrNull(@NotNull List<T> $this$removeFirstOrNull) {
      Intrinsics.checkNotNullParameter($this$removeFirstOrNull, "<this>");
      return $this$removeFirstOrNull.isEmpty() ? null : $this$removeFirstOrNull.remove(0);
   }

   @SinceKotlin(
      version = "1.4"
   )
   public static final <T> T removeLast(@NotNull List<T> $this$removeLast) {
      Intrinsics.checkNotNullParameter($this$removeLast, "<this>");
      if ($this$removeLast.isEmpty()) {
         throw new NoSuchElementException("List is empty.");
      } else {
         return $this$removeLast.remove(CollectionsKt.getLastIndex($this$removeLast));
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final <T> T removeLastOrNull(@NotNull List<T> $this$removeLastOrNull) {
      Intrinsics.checkNotNullParameter($this$removeLastOrNull, "<this>");
      return $this$removeLastOrNull.isEmpty() ? null : $this$removeLastOrNull.remove(CollectionsKt.getLastIndex($this$removeLastOrNull));
   }

   public static final <T> boolean removeAll(@NotNull List<T> $this$removeAll, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$removeAll, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      return filterInPlace$CollectionsKt__MutableCollectionsKt($this$removeAll, predicate, true);
   }

   public static final <T> boolean retainAll(@NotNull List<T> $this$retainAll, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$retainAll, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      return filterInPlace$CollectionsKt__MutableCollectionsKt($this$retainAll, predicate, false);
   }

   private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(List<T> $this$filterInPlace, Function1<? super T, Boolean> predicate, boolean predicateResultToRemove) {
      if (!($this$filterInPlace instanceof RandomAccess)) {
         Intrinsics.checkNotNull($this$filterInPlace, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
         return filterInPlace$CollectionsKt__MutableCollectionsKt(TypeIntrinsics.asMutableIterable($this$filterInPlace), predicate, predicateResultToRemove);
      } else {
         int writeIndex = 0;
         int removeIndex = 0;
         int var5 = CollectionsKt.getLastIndex($this$filterInPlace);
         if (removeIndex <= var5) {
            while(true) {
               Object element = $this$filterInPlace.get(removeIndex);
               if ((Boolean)predicate.invoke(element) != predicateResultToRemove) {
                  if (writeIndex != removeIndex) {
                     $this$filterInPlace.set(writeIndex, element);
                  }

                  ++writeIndex;
               }

               if (removeIndex == var5) {
                  break;
               }

               ++removeIndex;
            }
         }

         if (writeIndex >= $this$filterInPlace.size()) {
            return false;
         } else {
            removeIndex = CollectionsKt.getLastIndex($this$filterInPlace);
            var5 = writeIndex;
            if (writeIndex <= removeIndex) {
               while(true) {
                  $this$filterInPlace.remove(removeIndex);
                  if (removeIndex == var5) {
                     break;
                  }

                  --removeIndex;
               }
            }

            return true;
         }
      }
   }

   public CollectionsKt__MutableCollectionsKt() {
   }
}
