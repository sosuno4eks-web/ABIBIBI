package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.BuilderInference;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class CollectionsKt__CollectionsKt extends CollectionsKt__CollectionsJVMKt {
   @NotNull
   public static final <T> Collection<T> asCollection(@NotNull T[] $this$asCollection, boolean isVarargs) {
      Intrinsics.checkNotNullParameter($this$asCollection, "<this>");
      return (Collection)(new ArrayAsCollection($this$asCollection, isVarargs));
   }

   // $FF: synthetic method
   public static Collection asCollection$default(Object[] var0, boolean var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = false;
      }

      return CollectionsKt.asCollection(var0, var1);
   }

   @NotNull
   public static final <T> List<T> emptyList() {
      return (List)EmptyList.INSTANCE;
   }

   @NotNull
   public static final <T> List<T> listOf(@NotNull T... elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      return elements.length > 0 ? ArraysKt.asList(elements) : CollectionsKt.emptyList();
   }

   @InlineOnly
   private static final <T> List<T> listOf() {
      return CollectionsKt.emptyList();
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final <T> List<T> mutableListOf() {
      return (List)(new ArrayList());
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final <T> ArrayList<T> arrayListOf() {
      return new ArrayList();
   }

   @NotNull
   public static final <T> List<T> mutableListOf(@NotNull T... elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      return elements.length == 0 ? (List)(new ArrayList()) : (List)(new ArrayList(CollectionsKt.asCollection(elements, true)));
   }

   @NotNull
   public static final <T> ArrayList<T> arrayListOf(@NotNull T... elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      return elements.length == 0 ? new ArrayList() : new ArrayList(CollectionsKt.asCollection(elements, true));
   }

   @NotNull
   public static final <T> List<T> listOfNotNull(@Nullable T element) {
      return element != null ? CollectionsKt.listOf(element) : CollectionsKt.emptyList();
   }

   @NotNull
   public static final <T> List<T> listOfNotNull(@NotNull T... elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      return ArraysKt.filterNotNull(elements);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final <T> List<T> List(int size, Function1<? super Integer, ? extends T> init) {
      Intrinsics.checkNotNullParameter(init, "init");
      ArrayList var2 = new ArrayList(size);

      for(int var3 = 0; var3 < size; ++var3) {
         var2.add(init.invoke(var3));
      }

      return (List)var2;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final <T> List<T> MutableList(int size, Function1<? super Integer, ? extends T> init) {
      Intrinsics.checkNotNullParameter(init, "init");
      ArrayList list = new ArrayList(size);

      for(int var3 = 0; var3 < size; ++var3) {
         int var5 = false;
         list.add(init.invoke(var3));
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.6"
   )
   @InlineOnly
   private static final <E> List<E> buildList(@BuilderInference Function1<? super List<E>, Unit> builderAction) {
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      List var1 = CollectionsKt.createListBuilder();
      builderAction.invoke(var1);
      return CollectionsKt.build(var1);
   }

   @SinceKotlin(
      version = "1.6"
   )
   @InlineOnly
   private static final <E> List<E> buildList(int capacity, @BuilderInference Function1<? super List<E>, Unit> builderAction) {
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      List var2 = CollectionsKt.createListBuilder(capacity);
      builderAction.invoke(var2);
      return CollectionsKt.build(var2);
   }

   @NotNull
   public static final IntRange getIndices(@NotNull Collection<?> $this$indices) {
      Intrinsics.checkNotNullParameter($this$indices, "<this>");
      return new IntRange(0, $this$indices.size() - 1);
   }

   public static final <T> int getLastIndex(@NotNull List<? extends T> $this$lastIndex) {
      Intrinsics.checkNotNullParameter($this$lastIndex, "<this>");
      return $this$lastIndex.size() - 1;
   }

   @InlineOnly
   private static final <T> boolean isNotEmpty(Collection<? extends T> $this$isNotEmpty) {
      Intrinsics.checkNotNullParameter($this$isNotEmpty, "<this>");
      return !$this$isNotEmpty.isEmpty();
   }

   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <T> boolean isNullOrEmpty(Collection<? extends T> $this$isNullOrEmpty) {
      return $this$isNullOrEmpty == null || $this$isNullOrEmpty.isEmpty();
   }

   @InlineOnly
   private static final <T> Collection<T> orEmpty(Collection<? extends T> $this$orEmpty) {
      Collection var10000 = $this$orEmpty;
      if ($this$orEmpty == null) {
         var10000 = (Collection)CollectionsKt.emptyList();
      }

      return var10000;
   }

   @InlineOnly
   private static final <T> List<T> orEmpty(List<? extends T> $this$orEmpty) {
      List var10000 = $this$orEmpty;
      if ($this$orEmpty == null) {
         var10000 = CollectionsKt.emptyList();
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <C extends Collection<?> & R, R> R ifEmpty(C $this$ifEmpty, Function0<? extends R> defaultValue) {
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      return $this$ifEmpty.isEmpty() ? defaultValue.invoke() : $this$ifEmpty;
   }

   @InlineOnly
   private static final <T> boolean containsAll(Collection<? extends T> $this$containsAll, Collection<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$containsAll, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      return $this$containsAll.containsAll(elements);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <T> List<T> shuffled(@NotNull Iterable<? extends T> $this$shuffled, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$shuffled, "<this>");
      Intrinsics.checkNotNullParameter(random, "random");
      List var2 = CollectionsKt.toMutableList($this$shuffled);
      int var4 = false;
      CollectionsKt.shuffle(var2, random);
      return var2;
   }

   @NotNull
   public static final <T> List<T> optimizeReadOnlyList(@NotNull List<? extends T> $this$optimizeReadOnlyList) {
      Intrinsics.checkNotNullParameter($this$optimizeReadOnlyList, "<this>");
      List var10000;
      switch($this$optimizeReadOnlyList.size()) {
      case 0:
         var10000 = CollectionsKt.emptyList();
         break;
      case 1:
         var10000 = CollectionsKt.listOf($this$optimizeReadOnlyList.get(0));
         break;
      default:
         var10000 = $this$optimizeReadOnlyList;
      }

      return var10000;
   }

   public static final <T extends Comparable<? super T>> int binarySearch(@NotNull List<? extends T> $this$binarySearch, @Nullable T element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
      rangeCheck$CollectionsKt__CollectionsKt($this$binarySearch.size(), fromIndex, toIndex);
      int low = fromIndex;
      int high = toIndex - 1;

      while(low <= high) {
         int mid = low + high >>> 1;
         Comparable midVal = (Comparable)$this$binarySearch.get(mid);
         int cmp = ComparisonsKt.compareValues(midVal, element);
         if (cmp < 0) {
            low = mid + 1;
         } else {
            if (cmp <= 0) {
               return mid;
            }

            high = mid - 1;
         }
      }

      return -(low + 1);
   }

   // $FF: synthetic method
   public static int binarySearch$default(List var0, Comparable var1, int var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.size();
      }

      return CollectionsKt.binarySearch(var0, var1, var2, var3);
   }

   public static final <T> int binarySearch(@NotNull List<? extends T> $this$binarySearch, T element, @NotNull Comparator<? super T> comparator, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      rangeCheck$CollectionsKt__CollectionsKt($this$binarySearch.size(), fromIndex, toIndex);
      int low = fromIndex;
      int high = toIndex - 1;

      while(low <= high) {
         int mid = low + high >>> 1;
         Object midVal = $this$binarySearch.get(mid);
         int cmp = comparator.compare(midVal, element);
         if (cmp < 0) {
            low = mid + 1;
         } else {
            if (cmp <= 0) {
               return mid;
            }

            high = mid - 1;
         }
      }

      return -(low + 1);
   }

   // $FF: synthetic method
   public static int binarySearch$default(List var0, Object var1, Comparator var2, int var3, int var4, int var5, Object var6) {
      if ((var5 & 4) != 0) {
         var3 = 0;
      }

      if ((var5 & 8) != 0) {
         var4 = var0.size();
      }

      return CollectionsKt.binarySearch(var0, var1, var2, var3, var4);
   }

   public static final <T, K extends Comparable<? super K>> int binarySearchBy(@NotNull List<? extends T> $this$binarySearchBy, @Nullable K key, int fromIndex, int toIndex, @NotNull Function1<? super T, ? extends K> selector) {
      Intrinsics.checkNotNullParameter($this$binarySearchBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$binarySearchBy = false;
      return CollectionsKt.binarySearch($this$binarySearchBy, fromIndex, toIndex, (Function1)(new Function1<T, Integer>() {
         public final Integer invoke(T it) {
            return ComparisonsKt.compareValues((Comparable)selector.invoke(it), key);
         }
      }));
   }

   // $FF: synthetic method
   public static int binarySearchBy$default(List $this$binarySearchBy_u24default, final Comparable key, int fromIndex, int toIndex, final Function1 selector, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         fromIndex = 0;
      }

      if ((var5 & 4) != 0) {
         toIndex = $this$binarySearchBy_u24default.size();
      }

      Intrinsics.checkNotNullParameter($this$binarySearchBy_u24default, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$binarySearchBy = false;
      return CollectionsKt.binarySearch($this$binarySearchBy_u24default, fromIndex, toIndex, (Function1)(new Function1<T, Integer>() {
         public final Integer invoke(T it) {
            return ComparisonsKt.compareValues((Comparable)selector.invoke(it), key);
         }
      }));
   }

   public static final <T> int binarySearch(@NotNull List<? extends T> $this$binarySearch, int fromIndex, int toIndex, @NotNull Function1<? super T, Integer> comparison) {
      Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
      Intrinsics.checkNotNullParameter(comparison, "comparison");
      rangeCheck$CollectionsKt__CollectionsKt($this$binarySearch.size(), fromIndex, toIndex);
      int low = fromIndex;
      int high = toIndex - 1;

      while(low <= high) {
         int mid = low + high >>> 1;
         Object midVal = $this$binarySearch.get(mid);
         int cmp = ((Number)comparison.invoke(midVal)).intValue();
         if (cmp < 0) {
            low = mid + 1;
         } else {
            if (cmp <= 0) {
               return mid;
            }

            high = mid - 1;
         }
      }

      return -(low + 1);
   }

   // $FF: synthetic method
   public static int binarySearch$default(List var0, int var1, int var2, Function1 var3, int var4, Object var5) {
      if ((var4 & 1) != 0) {
         var1 = 0;
      }

      if ((var4 & 2) != 0) {
         var2 = var0.size();
      }

      return CollectionsKt.binarySearch(var0, var1, var2, var3);
   }

   private static final void rangeCheck$CollectionsKt__CollectionsKt(int size, int fromIndex, int toIndex) {
      if (fromIndex > toIndex) {
         throw new IllegalArgumentException("fromIndex (" + fromIndex + ") is greater than toIndex (" + toIndex + ").");
      } else if (fromIndex < 0) {
         throw new IndexOutOfBoundsException("fromIndex (" + fromIndex + ") is less than zero.");
      } else if (toIndex > size) {
         throw new IndexOutOfBoundsException("toIndex (" + toIndex + ") is greater than size (" + size + ").");
      }
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   public static final void throwIndexOverflow() {
      throw new ArithmeticException("Index overflow has happened.");
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   public static final void throwCountOverflow() {
      throw new ArithmeticException("Count overflow has happened.");
   }

   @NotNull
   public static final Object[] collectionToArrayCommonImpl(@NotNull Collection<?> collection) {
      Intrinsics.checkNotNullParameter(collection, "collection");
      if (collection.isEmpty()) {
         return new Object[0];
      } else {
         Object[] destination = new Object[collection.size()];
         Iterator iterator = collection.iterator();

         for(int var3 = 0; iterator.hasNext(); destination[var3++] = iterator.next()) {
         }

         return destination;
      }
   }

   @NotNull
   public static final <T> T[] collectionToArrayCommonImpl(@NotNull Collection<?> collection, @NotNull T[] array) {
      Intrinsics.checkNotNullParameter(collection, "collection");
      Intrinsics.checkNotNullParameter(array, "array");
      if (collection.isEmpty()) {
         return CollectionsKt.terminateCollectionToArray(0, array);
      } else {
         Object[] destination = array.length < collection.size() ? ArraysKt.arrayOfNulls(array, collection.size()) : array;
         Iterator iterator = collection.iterator();

         for(int var4 = 0; iterator.hasNext(); destination[var4++] = iterator.next()) {
         }

         return CollectionsKt.terminateCollectionToArray(collection.size(), destination);
      }
   }

   public CollectionsKt__CollectionsKt() {
   }
}
