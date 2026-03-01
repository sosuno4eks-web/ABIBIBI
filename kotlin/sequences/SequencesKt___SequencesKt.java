package kotlin.sequences;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.IndexedValue;
import kotlin.collections.SetsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class SequencesKt___SequencesKt extends SequencesKt___SequencesJvmKt {
   public static final <T> boolean contains(@NotNull Sequence<? extends T> $this$contains, T element) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return SequencesKt.indexOf($this$contains, element) >= 0;
   }

   public static final <T> T elementAt(@NotNull Sequence<? extends T> $this$elementAt, int index) {
      Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
      return SequencesKt.elementAtOrElse($this$elementAt, index, SequencesKt___SequencesKt::elementAt$lambda$0$SequencesKt___SequencesKt);
   }

   public static final <T> T elementAtOrElse(@NotNull Sequence<? extends T> $this$elementAtOrElse, int index, @NotNull Function1<? super Integer, ? extends T> defaultValue) {
      Intrinsics.checkNotNullParameter($this$elementAtOrElse, "<this>");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      if (index < 0) {
         return defaultValue.invoke(index);
      } else {
         Iterator iterator = $this$elementAtOrElse.iterator();
         int var4 = 0;

         Object element;
         do {
            if (!iterator.hasNext()) {
               return defaultValue.invoke(index);
            }

            element = iterator.next();
         } while(index != var4++);

         return element;
      }
   }

   @Nullable
   public static final <T> T elementAtOrNull(@NotNull Sequence<? extends T> $this$elementAtOrNull, int index) {
      Intrinsics.checkNotNullParameter($this$elementAtOrNull, "<this>");
      if (index < 0) {
         return null;
      } else {
         Iterator iterator = $this$elementAtOrNull.iterator();
         int var3 = 0;

         Object element;
         do {
            if (!iterator.hasNext()) {
               return null;
            }

            element = iterator.next();
         } while(index != var3++);

         return element;
      }
   }

   @InlineOnly
   private static final <T> T find(Sequence<? extends T> $this$find, Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$find, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$firstOrNull = false;
      Iterator var4 = $this$find.iterator();

      Object var10000;
      while(true) {
         if (var4.hasNext()) {
            Object element$iv = var4.next();
            if (!(Boolean)predicate.invoke(element$iv)) {
               continue;
            }

            var10000 = element$iv;
            break;
         }

         var10000 = null;
         break;
      }

      return var10000;
   }

   @InlineOnly
   private static final <T> T findLast(Sequence<? extends T> $this$findLast, Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$findLast, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$lastOrNull = false;
      Object last$iv = null;
      Iterator var5 = $this$findLast.iterator();

      while(var5.hasNext()) {
         Object element$iv = var5.next();
         if ((Boolean)predicate.invoke(element$iv)) {
            last$iv = element$iv;
         }
      }

      return last$iv;
   }

   public static final <T> T first(@NotNull Sequence<? extends T> $this$first) {
      Intrinsics.checkNotNullParameter($this$first, "<this>");
      Iterator iterator = $this$first.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException("Sequence is empty.");
      } else {
         return iterator.next();
      }
   }

   public static final <T> T first(@NotNull Sequence<? extends T> $this$first, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$first, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$first = false;
      Iterator var3 = $this$first.iterator();

      Object element;
      do {
         if (!var3.hasNext()) {
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
         }

         element = var3.next();
      } while(!(Boolean)predicate.invoke(element));

      return element;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final <T, R> R firstNotNullOf(Sequence<? extends T> $this$firstNotNullOf, Function1<? super T, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$firstNotNullOf, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      Iterator var2 = $this$firstNotNullOf.iterator();

      Object var10000;
      do {
         if (!var2.hasNext()) {
            var10000 = null;
            break;
         }

         var10000 = transform.invoke(var2.next());
      } while(var10000 == null);

      if (var10000 == null) {
         throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
      } else {
         return var10000;
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final <T, R> R firstNotNullOfOrNull(Sequence<? extends T> $this$firstNotNullOfOrNull, Function1<? super T, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$firstNotNullOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      Iterator var2 = $this$firstNotNullOfOrNull.iterator();

      Object result;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         Object element = var2.next();
         result = transform.invoke(element);
      } while(result == null);

      return result;
   }

   @Nullable
   public static final <T> T firstOrNull(@NotNull Sequence<? extends T> $this$firstOrNull) {
      Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
      Iterator iterator = $this$firstOrNull.iterator();
      return !iterator.hasNext() ? null : iterator.next();
   }

   @Nullable
   public static final <T> T firstOrNull(@NotNull Sequence<? extends T> $this$firstOrNull, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$firstOrNull = false;
      Iterator var3 = $this$firstOrNull.iterator();

      Object element;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         element = var3.next();
      } while(!(Boolean)predicate.invoke(element));

      return element;
   }

   public static final <T> int indexOf(@NotNull Sequence<? extends T> $this$indexOf, T element) {
      Intrinsics.checkNotNullParameter($this$indexOf, "<this>");
      int index = 0;

      for(Iterator var3 = $this$indexOf.iterator(); var3.hasNext(); ++index) {
         Object item = var3.next();
         if (index < 0) {
            CollectionsKt.throwIndexOverflow();
         }

         if (Intrinsics.areEqual(element, item)) {
            return index;
         }
      }

      return -1;
   }

   public static final <T> int indexOfFirst(@NotNull Sequence<? extends T> $this$indexOfFirst, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$indexOfFirst, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$indexOfFirst = false;
      int index = 0;

      for(Iterator var4 = $this$indexOfFirst.iterator(); var4.hasNext(); ++index) {
         Object item = var4.next();
         if (index < 0) {
            CollectionsKt.throwIndexOverflow();
         }

         if ((Boolean)predicate.invoke(item)) {
            return index;
         }
      }

      return -1;
   }

   public static final <T> int indexOfLast(@NotNull Sequence<? extends T> $this$indexOfLast, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$indexOfLast, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$indexOfLast = false;
      int lastIndex = -1;
      int index = 0;

      for(Iterator var5 = $this$indexOfLast.iterator(); var5.hasNext(); ++index) {
         Object item = var5.next();
         if (index < 0) {
            CollectionsKt.throwIndexOverflow();
         }

         if ((Boolean)predicate.invoke(item)) {
            lastIndex = index;
         }
      }

      return lastIndex;
   }

   public static final <T> T last(@NotNull Sequence<? extends T> $this$last) {
      Intrinsics.checkNotNullParameter($this$last, "<this>");
      Iterator iterator = $this$last.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException("Sequence is empty.");
      } else {
         Object last;
         for(last = iterator.next(); iterator.hasNext(); last = iterator.next()) {
         }

         return last;
      }
   }

   public static final <T> T last(@NotNull Sequence<? extends T> $this$last, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$last, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$last = false;
      Object last = null;
      boolean found = false;
      Iterator var5 = $this$last.iterator();

      while(var5.hasNext()) {
         Object element = var5.next();
         if ((Boolean)predicate.invoke(element)) {
            last = element;
            found = true;
         }
      }

      if (!found) {
         throw new NoSuchElementException("Sequence contains no element matching the predicate.");
      } else {
         return last;
      }
   }

   public static final <T> int lastIndexOf(@NotNull Sequence<? extends T> $this$lastIndexOf, T element) {
      Intrinsics.checkNotNullParameter($this$lastIndexOf, "<this>");
      int lastIndex = -1;
      int index = 0;

      for(Iterator var4 = $this$lastIndexOf.iterator(); var4.hasNext(); ++index) {
         Object item = var4.next();
         if (index < 0) {
            CollectionsKt.throwIndexOverflow();
         }

         if (Intrinsics.areEqual(element, item)) {
            lastIndex = index;
         }
      }

      return lastIndex;
   }

   @Nullable
   public static final <T> T lastOrNull(@NotNull Sequence<? extends T> $this$lastOrNull) {
      Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
      Iterator iterator = $this$lastOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         Object last;
         for(last = iterator.next(); iterator.hasNext(); last = iterator.next()) {
         }

         return last;
      }
   }

   @Nullable
   public static final <T> T lastOrNull(@NotNull Sequence<? extends T> $this$lastOrNull, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$lastOrNull = false;
      Object last = null;
      Iterator var4 = $this$lastOrNull.iterator();

      while(var4.hasNext()) {
         Object element = var4.next();
         if ((Boolean)predicate.invoke(element)) {
            last = element;
         }
      }

      return last;
   }

   public static final <T> T single(@NotNull Sequence<? extends T> $this$single) {
      Intrinsics.checkNotNullParameter($this$single, "<this>");
      Iterator iterator = $this$single.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException("Sequence is empty.");
      } else {
         Object single = iterator.next();
         if (iterator.hasNext()) {
            throw new IllegalArgumentException("Sequence has more than one element.");
         } else {
            return single;
         }
      }
   }

   public static final <T> T single(@NotNull Sequence<? extends T> $this$single, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$single, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$single = false;
      Object single = null;
      boolean found = false;
      Iterator var5 = $this$single.iterator();

      while(var5.hasNext()) {
         Object element = var5.next();
         if ((Boolean)predicate.invoke(element)) {
            if (found) {
               throw new IllegalArgumentException("Sequence contains more than one matching element.");
            }

            single = element;
            found = true;
         }
      }

      if (!found) {
         throw new NoSuchElementException("Sequence contains no element matching the predicate.");
      } else {
         return single;
      }
   }

   @Nullable
   public static final <T> T singleOrNull(@NotNull Sequence<? extends T> $this$singleOrNull) {
      Intrinsics.checkNotNullParameter($this$singleOrNull, "<this>");
      Iterator iterator = $this$singleOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         Object single = iterator.next();
         return iterator.hasNext() ? null : single;
      }
   }

   @Nullable
   public static final <T> T singleOrNull(@NotNull Sequence<? extends T> $this$singleOrNull, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$singleOrNull, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$singleOrNull = false;
      Object single = null;
      boolean found = false;
      Iterator var5 = $this$singleOrNull.iterator();

      while(var5.hasNext()) {
         Object element = var5.next();
         if ((Boolean)predicate.invoke(element)) {
            if (found) {
               return null;
            }

            single = element;
            found = true;
         }
      }

      if (!found) {
         return null;
      } else {
         return single;
      }
   }

   @NotNull
   public static final <T> Sequence<T> drop(@NotNull Sequence<? extends T> $this$drop, int n) {
      Intrinsics.checkNotNullParameter($this$drop, "<this>");
      if (n < 0) {
         int var2 = false;
         String var3 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var3.toString());
      } else {
         return n == 0 ? $this$drop : ($this$drop instanceof DropTakeSequence ? ((DropTakeSequence)$this$drop).drop(n) : (Sequence)(new DropSequence($this$drop, n)));
      }
   }

   @NotNull
   public static final <T> Sequence<T> dropWhile(@NotNull Sequence<? extends T> $this$dropWhile, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$dropWhile, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      return (Sequence)(new DropWhileSequence($this$dropWhile, predicate));
   }

   @NotNull
   public static final <T> Sequence<T> filter(@NotNull Sequence<? extends T> $this$filter, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filter, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      return (Sequence)(new FilteringSequence($this$filter, true, predicate));
   }

   @NotNull
   public static final <T> Sequence<T> filterIndexed(@NotNull Sequence<? extends T> $this$filterIndexed, @NotNull Function2<? super Integer, ? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterIndexed, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      return (Sequence)(new TransformingSequence((Sequence)(new FilteringSequence((Sequence)(new IndexingSequence($this$filterIndexed)), true, SequencesKt___SequencesKt::filterIndexed$lambda$2$SequencesKt___SequencesKt)), SequencesKt___SequencesKt::filterIndexed$lambda$3$SequencesKt___SequencesKt));
   }

   @NotNull
   public static final <T, C extends Collection<? super T>> C filterIndexedTo(@NotNull Sequence<? extends T> $this$filterIndexedTo, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterIndexedTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filterIndexedTo = false;
      int $i$f$forEachIndexed = false;
      int index$iv = 0;
      Iterator var7 = $this$filterIndexedTo.iterator();

      while(var7.hasNext()) {
         Object item$iv = var7.next();
         int var9 = index$iv++;
         if (var9 < 0) {
            CollectionsKt.throwIndexOverflow();
         }

         int var12 = false;
         if ((Boolean)predicate.invoke(var9, item$iv)) {
            destination.add(item$iv);
         }
      }

      return destination;
   }

   // $FF: synthetic method
   public static final <R> Sequence<R> filterIsInstance(Sequence<?> $this$filterIsInstance) {
      Intrinsics.checkNotNullParameter($this$filterIsInstance, "<this>");
      int $i$f$filterIsInstance = false;
      Intrinsics.needClassReification();
      Sequence var10000 = SequencesKt.filter($this$filterIsInstance, (Function1)null.INSTANCE);
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
      return var10000;
   }

   // $FF: synthetic method
   public static final <R, C extends Collection<? super R>> C filterIsInstanceTo(Sequence<?> $this$filterIsInstanceTo, C destination) {
      Intrinsics.checkNotNullParameter($this$filterIsInstanceTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      int $i$f$filterIsInstanceTo = false;
      Iterator var3 = $this$filterIsInstanceTo.iterator();

      while(var3.hasNext()) {
         Object element = var3.next();
         Intrinsics.reifiedOperationMarker(3, "R");
         if (element instanceof Object) {
            destination.add(element);
         }
      }

      return destination;
   }

   @NotNull
   public static final <T> Sequence<T> filterNot(@NotNull Sequence<? extends T> $this$filterNot, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterNot, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      return (Sequence)(new FilteringSequence($this$filterNot, false, predicate));
   }

   @NotNull
   public static final <T> Sequence<T> filterNotNull(@NotNull Sequence<? extends T> $this$filterNotNull) {
      Intrinsics.checkNotNullParameter($this$filterNotNull, "<this>");
      Sequence var10000 = SequencesKt.filterNot($this$filterNotNull, SequencesKt___SequencesKt::filterNotNull$lambda$5$SequencesKt___SequencesKt);
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
      return var10000;
   }

   @NotNull
   public static final <C extends Collection<? super T>, T> C filterNotNullTo(@NotNull Sequence<? extends T> $this$filterNotNullTo, @NotNull C destination) {
      Intrinsics.checkNotNullParameter($this$filterNotNullTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Iterator var2 = $this$filterNotNullTo.iterator();

      while(var2.hasNext()) {
         Object element = var2.next();
         if (element != null) {
            destination.add(element);
         }
      }

      return destination;
   }

   @NotNull
   public static final <T, C extends Collection<? super T>> C filterNotTo(@NotNull Sequence<? extends T> $this$filterNotTo, @NotNull C destination, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterNotTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filterNotTo = false;
      Iterator var4 = $this$filterNotTo.iterator();

      while(var4.hasNext()) {
         Object element = var4.next();
         if (!(Boolean)predicate.invoke(element)) {
            destination.add(element);
         }
      }

      return destination;
   }

   @NotNull
   public static final <T, C extends Collection<? super T>> C filterTo(@NotNull Sequence<? extends T> $this$filterTo, @NotNull C destination, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filterTo = false;
      Iterator var4 = $this$filterTo.iterator();

      while(var4.hasNext()) {
         Object element = var4.next();
         if ((Boolean)predicate.invoke(element)) {
            destination.add(element);
         }
      }

      return destination;
   }

   @NotNull
   public static final <T> Sequence<T> take(@NotNull Sequence<? extends T> $this$take, int n) {
      Intrinsics.checkNotNullParameter($this$take, "<this>");
      if (n < 0) {
         int var2 = false;
         String var3 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var3.toString());
      } else {
         return n == 0 ? SequencesKt.emptySequence() : ($this$take instanceof DropTakeSequence ? ((DropTakeSequence)$this$take).take(n) : (Sequence)(new TakeSequence($this$take, n)));
      }
   }

   @NotNull
   public static final <T> Sequence<T> takeWhile(@NotNull Sequence<? extends T> $this$takeWhile, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$takeWhile, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      return (Sequence)(new TakeWhileSequence($this$takeWhile, predicate));
   }

   @NotNull
   public static final <T extends Comparable<? super T>> Sequence<T> sorted(@NotNull Sequence<? extends T> $this$sorted) {
      Intrinsics.checkNotNullParameter($this$sorted, "<this>");
      return (Sequence)(new Sequence<T>() {
         public Iterator<T> iterator() {
            List sortedList = SequencesKt.toMutableList($this$sorted);
            CollectionsKt.sort(sortedList);
            return sortedList.iterator();
         }
      });
   }

   @NotNull
   public static final <T, R extends Comparable<? super R>> Sequence<T> sortedBy(@NotNull Sequence<? extends T> $this$sortedBy, @NotNull Function1<? super T, ? extends R> selector) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public static final <T, R extends Comparable<? super R>> Sequence<T> sortedByDescending(@NotNull Sequence<? extends T> $this$sortedByDescending, @NotNull Function1<? super T, ? extends R> selector) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public static final <T extends Comparable<? super T>> Sequence<T> sortedDescending(@NotNull Sequence<? extends T> $this$sortedDescending) {
      Intrinsics.checkNotNullParameter($this$sortedDescending, "<this>");
      return SequencesKt.sortedWith($this$sortedDescending, ComparisonsKt.reverseOrder());
   }

   @NotNull
   public static final <T> Sequence<T> sortedWith(@NotNull Sequence<? extends T> $this$sortedWith, @NotNull Comparator<? super T> comparator) {
      Intrinsics.checkNotNullParameter($this$sortedWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return (Sequence)(new Sequence<T>() {
         public Iterator<T> iterator() {
            List sortedList = SequencesKt.toMutableList($this$sortedWith);
            CollectionsKt.sortWith(sortedList, comparator);
            return sortedList.iterator();
         }
      });
   }

   @NotNull
   public static final <T, K, V> Map<K, V> associate(@NotNull Sequence<? extends T> $this$associate, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
      Intrinsics.checkNotNullParameter($this$associate, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$associate = false;
      Map destination$iv = (Map)(new LinkedHashMap());
      int $i$f$associateTo = false;
      Iterator var6 = $this$associate.iterator();

      while(var6.hasNext()) {
         Object element$iv = var6.next();
         Pair var9 = (Pair)transform.invoke(element$iv);
         destination$iv.put(var9.getFirst(), var9.getSecond());
      }

      return destination$iv;
   }

   @NotNull
   public static final <T, K> Map<K, T> associateBy(@NotNull Sequence<? extends T> $this$associateBy, @NotNull Function1<? super T, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter($this$associateBy, "<this>");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      int $i$f$associateBy = false;
      Map destination$iv = (Map)(new LinkedHashMap());
      int $i$f$associateByTo = false;
      Iterator var6 = $this$associateBy.iterator();

      while(var6.hasNext()) {
         Object element$iv = var6.next();
         destination$iv.put(keySelector.invoke(element$iv), element$iv);
      }

      return destination$iv;
   }

   @NotNull
   public static final <T, K, V> Map<K, V> associateBy(@NotNull Sequence<? extends T> $this$associateBy, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
      Intrinsics.checkNotNullParameter($this$associateBy, "<this>");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
      int $i$f$associateBy = false;
      Map destination$iv = (Map)(new LinkedHashMap());
      int $i$f$associateByTo = false;
      Iterator var7 = $this$associateBy.iterator();

      while(var7.hasNext()) {
         Object element$iv = var7.next();
         destination$iv.put(keySelector.invoke(element$iv), valueTransform.invoke(element$iv));
      }

      return destination$iv;
   }

   @NotNull
   public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(@NotNull Sequence<? extends T> $this$associateByTo, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter($this$associateByTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      int $i$f$associateByTo = false;
      Iterator var4 = $this$associateByTo.iterator();

      while(var4.hasNext()) {
         Object element = var4.next();
         destination.put(keySelector.invoke(element), element);
      }

      return destination;
   }

   @NotNull
   public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull Sequence<? extends T> $this$associateByTo, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
      Intrinsics.checkNotNullParameter($this$associateByTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
      int $i$f$associateByTo = false;
      Iterator var5 = $this$associateByTo.iterator();

      while(var5.hasNext()) {
         Object element = var5.next();
         destination.put(keySelector.invoke(element), valueTransform.invoke(element));
      }

      return destination;
   }

   @NotNull
   public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull Sequence<? extends T> $this$associateTo, @NotNull M destination, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
      Intrinsics.checkNotNullParameter($this$associateTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$associateTo = false;
      Iterator var4 = $this$associateTo.iterator();

      while(var4.hasNext()) {
         Object element = var4.next();
         Pair var7 = (Pair)transform.invoke(element);
         destination.put(var7.getFirst(), var7.getSecond());
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <K, V> Map<K, V> associateWith(@NotNull Sequence<? extends K> $this$associateWith, @NotNull Function1<? super K, ? extends V> valueSelector) {
      Intrinsics.checkNotNullParameter($this$associateWith, "<this>");
      Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
      int $i$f$associateWith = false;
      LinkedHashMap result = new LinkedHashMap();
      int $i$f$associateWithTo = false;
      Iterator var6 = $this$associateWith.iterator();

      while(var6.hasNext()) {
         Object element$iv = var6.next();
         ((Map)result).put(element$iv, valueSelector.invoke(element$iv));
      }

      return (Map)result;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(@NotNull Sequence<? extends K> $this$associateWithTo, @NotNull M destination, @NotNull Function1<? super K, ? extends V> valueSelector) {
      Intrinsics.checkNotNullParameter($this$associateWithTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
      int $i$f$associateWithTo = false;
      Iterator var4 = $this$associateWithTo.iterator();

      while(var4.hasNext()) {
         Object element = var4.next();
         destination.put(element, valueSelector.invoke(element));
      }

      return destination;
   }

   @NotNull
   public static final <T, C extends Collection<? super T>> C toCollection(@NotNull Sequence<? extends T> $this$toCollection, @NotNull C destination) {
      Intrinsics.checkNotNullParameter($this$toCollection, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Iterator var2 = $this$toCollection.iterator();

      while(var2.hasNext()) {
         Object item = var2.next();
         destination.add(item);
      }

      return destination;
   }

   @NotNull
   public static final <T> HashSet<T> toHashSet(@NotNull Sequence<? extends T> $this$toHashSet) {
      Intrinsics.checkNotNullParameter($this$toHashSet, "<this>");
      return (HashSet)SequencesKt.toCollection($this$toHashSet, (Collection)(new HashSet()));
   }

   @NotNull
   public static final <T> List<T> toList(@NotNull Sequence<? extends T> $this$toList) {
      Intrinsics.checkNotNullParameter($this$toList, "<this>");
      Iterator it = $this$toList.iterator();
      if (!it.hasNext()) {
         return CollectionsKt.emptyList();
      } else {
         Object element = it.next();
         if (!it.hasNext()) {
            return CollectionsKt.listOf(element);
         } else {
            ArrayList dst = new ArrayList();
            dst.add(element);

            while(it.hasNext()) {
               dst.add(it.next());
            }

            return (List)dst;
         }
      }
   }

   @NotNull
   public static final <T> List<T> toMutableList(@NotNull Sequence<? extends T> $this$toMutableList) {
      Intrinsics.checkNotNullParameter($this$toMutableList, "<this>");
      return (List)SequencesKt.toCollection($this$toMutableList, (Collection)(new ArrayList()));
   }

   @NotNull
   public static final <T> Set<T> toSet(@NotNull Sequence<? extends T> $this$toSet) {
      Intrinsics.checkNotNullParameter($this$toSet, "<this>");
      Iterator it = $this$toSet.iterator();
      if (!it.hasNext()) {
         return SetsKt.emptySet();
      } else {
         Object element = it.next();
         if (!it.hasNext()) {
            return SetsKt.setOf(element);
         } else {
            LinkedHashSet dst = new LinkedHashSet();
            dst.add(element);

            while(it.hasNext()) {
               dst.add(it.next());
            }

            return (Set)dst;
         }
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "flatMapIterable"
   )
   @NotNull
   public static final <T, R> Sequence<R> flatMapIterable(@NotNull Sequence<? extends T> $this$flatMap, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMap, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      return (Sequence)(new FlatteningSequence($this$flatMap, transform, (Function1)null.INSTANCE));
   }

   @NotNull
   public static final <T, R> Sequence<R> flatMap(@NotNull Sequence<? extends T> $this$flatMap, @NotNull Function1<? super T, ? extends Sequence<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMap, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      return (Sequence)(new FlatteningSequence($this$flatMap, transform, (Function1)null.INSTANCE));
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "flatMapIndexedIterable"
   )
   @NotNull
   public static final <T, R> Sequence<R> flatMapIndexedIterable(@NotNull Sequence<? extends T> $this$flatMapIndexed, @NotNull Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapIndexed, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      return SequencesKt.flatMapIndexed($this$flatMapIndexed, transform, (Function1)null.INSTANCE);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "flatMapIndexedSequence"
   )
   @NotNull
   public static final <T, R> Sequence<R> flatMapIndexedSequence(@NotNull Sequence<? extends T> $this$flatMapIndexed, @NotNull Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapIndexed, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      return SequencesKt.flatMapIndexed($this$flatMapIndexed, transform, (Function1)null.INSTANCE);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "flatMapIndexedIterableTo"
   )
   @InlineOnly
   private static final <T, R, C extends Collection<? super R>> C flatMapIndexedIterableTo(Sequence<? extends T> $this$flatMapIndexedTo, C destination, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapIndexedTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int index = 0;
      Iterator var4 = $this$flatMapIndexedTo.iterator();

      while(var4.hasNext()) {
         Object element = var4.next();
         int var7 = index++;
         if (var7 < 0) {
            CollectionsKt.throwIndexOverflow();
         }

         Iterable list = (Iterable)transform.invoke(var7, element);
         CollectionsKt.addAll(destination, list);
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "flatMapIndexedSequenceTo"
   )
   @InlineOnly
   private static final <T, R, C extends Collection<? super R>> C flatMapIndexedSequenceTo(Sequence<? extends T> $this$flatMapIndexedTo, C destination, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapIndexedTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int index = 0;
      Iterator var4 = $this$flatMapIndexedTo.iterator();

      while(var4.hasNext()) {
         Object element = var4.next();
         int var7 = index++;
         if (var7 < 0) {
            CollectionsKt.throwIndexOverflow();
         }

         Sequence list = (Sequence)transform.invoke(var7, element);
         CollectionsKt.addAll(destination, list);
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "flatMapIterableTo"
   )
   @NotNull
   public static final <T, R, C extends Collection<? super R>> C flatMapIterableTo(@NotNull Sequence<? extends T> $this$flatMapTo, @NotNull C destination, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$flatMapIterableTo = false;
      Iterator var4 = $this$flatMapTo.iterator();

      while(var4.hasNext()) {
         Object element = var4.next();
         Iterable list = (Iterable)transform.invoke(element);
         CollectionsKt.addAll(destination, list);
      }

      return destination;
   }

   @NotNull
   public static final <T, R, C extends Collection<? super R>> C flatMapTo(@NotNull Sequence<? extends T> $this$flatMapTo, @NotNull C destination, @NotNull Function1<? super T, ? extends Sequence<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$flatMapTo = false;
      Iterator var4 = $this$flatMapTo.iterator();

      while(var4.hasNext()) {
         Object element = var4.next();
         Sequence list = (Sequence)transform.invoke(element);
         CollectionsKt.addAll(destination, list);
      }

      return destination;
   }

   @NotNull
   public static final <T, K> Map<K, List<T>> groupBy(@NotNull Sequence<? extends T> $this$groupBy, @NotNull Function1<? super T, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter($this$groupBy, "<this>");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      int $i$f$groupBy = false;
      Map destination$iv = (Map)(new LinkedHashMap());
      int $i$f$groupByTo = false;
      Iterator var6 = $this$groupBy.iterator();

      while(var6.hasNext()) {
         Object element$iv = var6.next();
         Object key$iv = keySelector.invoke(element$iv);
         int $i$f$getOrPut = false;
         Object value$iv$iv = destination$iv.get(key$iv);
         Object var10000;
         if (value$iv$iv == null) {
            int var12 = false;
            Object answer$iv$iv = (List)(new ArrayList());
            destination$iv.put(key$iv, answer$iv$iv);
            var10000 = answer$iv$iv;
         } else {
            var10000 = value$iv$iv;
         }

         List list$iv = (List)var10000;
         list$iv.add(element$iv);
      }

      return destination$iv;
   }

   @NotNull
   public static final <T, K, V> Map<K, List<V>> groupBy(@NotNull Sequence<? extends T> $this$groupBy, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
      Intrinsics.checkNotNullParameter($this$groupBy, "<this>");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
      int $i$f$groupBy = false;
      Map destination$iv = (Map)(new LinkedHashMap());
      int $i$f$groupByTo = false;
      Iterator var7 = $this$groupBy.iterator();

      while(var7.hasNext()) {
         Object element$iv = var7.next();
         Object key$iv = keySelector.invoke(element$iv);
         int $i$f$getOrPut = false;
         Object value$iv$iv = destination$iv.get(key$iv);
         Object var10000;
         if (value$iv$iv == null) {
            int var13 = false;
            Object answer$iv$iv = (List)(new ArrayList());
            destination$iv.put(key$iv, answer$iv$iv);
            var10000 = answer$iv$iv;
         } else {
            var10000 = value$iv$iv;
         }

         List list$iv = (List)var10000;
         list$iv.add(valueTransform.invoke(element$iv));
      }

      return destination$iv;
   }

   @NotNull
   public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(@NotNull Sequence<? extends T> $this$groupByTo, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter($this$groupByTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      int $i$f$groupByTo = false;
      Iterator var4 = $this$groupByTo.iterator();

      while(var4.hasNext()) {
         Object element = var4.next();
         Object key = keySelector.invoke(element);
         int $i$f$getOrPut = false;
         Object value$iv = destination.get(key);
         Object var10000;
         if (value$iv == null) {
            int var11 = false;
            Object answer$iv = (List)(new ArrayList());
            destination.put(key, answer$iv);
            var10000 = answer$iv;
         } else {
            var10000 = value$iv;
         }

         List list = (List)var10000;
         list.add(element);
      }

      return destination;
   }

   @NotNull
   public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull Sequence<? extends T> $this$groupByTo, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
      Intrinsics.checkNotNullParameter($this$groupByTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
      int $i$f$groupByTo = false;
      Iterator var5 = $this$groupByTo.iterator();

      while(var5.hasNext()) {
         Object element = var5.next();
         Object key = keySelector.invoke(element);
         int $i$f$getOrPut = false;
         Object value$iv = destination.get(key);
         Object var10000;
         if (value$iv == null) {
            int var12 = false;
            Object answer$iv = (List)(new ArrayList());
            destination.put(key, answer$iv);
            var10000 = answer$iv;
         } else {
            var10000 = value$iv;
         }

         List list = (List)var10000;
         list.add(valueTransform.invoke(element));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <T, K> Grouping<T, K> groupingBy(@NotNull Sequence<? extends T> $this$groupingBy, @NotNull Function1<? super T, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter($this$groupingBy, "<this>");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      int $i$f$groupingBy = false;
      return (Grouping)(new Grouping<T, K>() {
         public Iterator<T> sourceIterator() {
            return $this$groupingBy.iterator();
         }

         public K keyOf(T element) {
            return keySelector.invoke(element);
         }
      });
   }

   @NotNull
   public static final <T, R> Sequence<R> map(@NotNull Sequence<? extends T> $this$map, @NotNull Function1<? super T, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$map, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      return (Sequence)(new TransformingSequence($this$map, transform));
   }

   @NotNull
   public static final <T, R> Sequence<R> mapIndexed(@NotNull Sequence<? extends T> $this$mapIndexed, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapIndexed, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      return (Sequence)(new TransformingIndexedSequence($this$mapIndexed, transform));
   }

   @NotNull
   public static final <T, R> Sequence<R> mapIndexedNotNull(@NotNull Sequence<? extends T> $this$mapIndexedNotNull, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapIndexedNotNull, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      return SequencesKt.filterNotNull((Sequence)(new TransformingIndexedSequence($this$mapIndexedNotNull, transform)));
   }

   @NotNull
   public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(@NotNull Sequence<? extends T> $this$mapIndexedNotNullTo, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapIndexedNotNullTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapIndexedNotNullTo = false;
      int $i$f$forEachIndexed = false;
      int index$iv = 0;
      Iterator var7 = $this$mapIndexedNotNullTo.iterator();

      while(var7.hasNext()) {
         Object item$iv = var7.next();
         int var9 = index$iv++;
         if (var9 < 0) {
            CollectionsKt.throwIndexOverflow();
         }

         int var12 = false;
         Object var15 = transform.invoke(var9, item$iv);
         if (var15 != null) {
            Object it = var15;
            int var14 = false;
            destination.add(it);
         }
      }

      return destination;
   }

   @NotNull
   public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(@NotNull Sequence<? extends T> $this$mapIndexedTo, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapIndexedTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapIndexedTo = false;
      int index = 0;

      Object item;
      int var7;
      for(Iterator var5 = $this$mapIndexedTo.iterator(); var5.hasNext(); destination.add(transform.invoke(var7, item))) {
         item = var5.next();
         var7 = index++;
         if (var7 < 0) {
            CollectionsKt.throwIndexOverflow();
         }
      }

      return destination;
   }

   @NotNull
   public static final <T, R> Sequence<R> mapNotNull(@NotNull Sequence<? extends T> $this$mapNotNull, @NotNull Function1<? super T, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapNotNull, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      return SequencesKt.filterNotNull((Sequence)(new TransformingSequence($this$mapNotNull, transform)));
   }

   @NotNull
   public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(@NotNull Sequence<? extends T> $this$mapNotNullTo, @NotNull C destination, @NotNull Function1<? super T, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapNotNullTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapNotNullTo = false;
      int $i$f$forEach = false;
      Iterator var6 = $this$mapNotNullTo.iterator();

      while(var6.hasNext()) {
         Object element$iv = var6.next();
         int var9 = false;
         Object var10000 = transform.invoke(element$iv);
         if (var10000 != null) {
            Object it = var10000;
            int var11 = false;
            destination.add(it);
         }
      }

      return destination;
   }

   @NotNull
   public static final <T, R, C extends Collection<? super R>> C mapTo(@NotNull Sequence<? extends T> $this$mapTo, @NotNull C destination, @NotNull Function1<? super T, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapTo = false;
      Iterator var4 = $this$mapTo.iterator();

      while(var4.hasNext()) {
         Object item = var4.next();
         destination.add(transform.invoke(item));
      }

      return destination;
   }

   @NotNull
   public static final <T> Sequence<IndexedValue<T>> withIndex(@NotNull Sequence<? extends T> $this$withIndex) {
      Intrinsics.checkNotNullParameter($this$withIndex, "<this>");
      return (Sequence)(new IndexingSequence($this$withIndex));
   }

   @NotNull
   public static final <T> Sequence<T> distinct(@NotNull Sequence<? extends T> $this$distinct) {
      Intrinsics.checkNotNullParameter($this$distinct, "<this>");
      return SequencesKt.distinctBy($this$distinct, SequencesKt___SequencesKt::distinct$lambda$13$SequencesKt___SequencesKt);
   }

   @NotNull
   public static final <T, K> Sequence<T> distinctBy(@NotNull Sequence<? extends T> $this$distinctBy, @NotNull Function1<? super T, ? extends K> selector) {
      Intrinsics.checkNotNullParameter($this$distinctBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      return (Sequence)(new DistinctSequence($this$distinctBy, selector));
   }

   @NotNull
   public static final <T> Set<T> toMutableSet(@NotNull Sequence<? extends T> $this$toMutableSet) {
      Intrinsics.checkNotNullParameter($this$toMutableSet, "<this>");
      LinkedHashSet set = new LinkedHashSet();
      Iterator var2 = $this$toMutableSet.iterator();

      while(var2.hasNext()) {
         Object item = var2.next();
         set.add(item);
      }

      return (Set)set;
   }

   public static final <T> boolean all(@NotNull Sequence<? extends T> $this$all, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$all, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$all = false;
      Iterator var3 = $this$all.iterator();

      Object element;
      do {
         if (!var3.hasNext()) {
            return true;
         }

         element = var3.next();
      } while((Boolean)predicate.invoke(element));

      return false;
   }

   public static final <T> boolean any(@NotNull Sequence<? extends T> $this$any) {
      Intrinsics.checkNotNullParameter($this$any, "<this>");
      return $this$any.iterator().hasNext();
   }

   public static final <T> boolean any(@NotNull Sequence<? extends T> $this$any, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$any, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$any = false;
      Iterator var3 = $this$any.iterator();

      Object element;
      do {
         if (!var3.hasNext()) {
            return false;
         }

         element = var3.next();
      } while(!(Boolean)predicate.invoke(element));

      return true;
   }

   public static final <T> int count(@NotNull Sequence<? extends T> $this$count) {
      Intrinsics.checkNotNullParameter($this$count, "<this>");
      int count = 0;
      Iterator var2 = $this$count.iterator();

      while(var2.hasNext()) {
         Object element = var2.next();
         ++count;
         if (count < 0) {
            CollectionsKt.throwCountOverflow();
         }
      }

      return count;
   }

   public static final <T> int count(@NotNull Sequence<? extends T> $this$count, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$count, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$count = false;
      int count = 0;
      Iterator var4 = $this$count.iterator();

      while(var4.hasNext()) {
         Object element = var4.next();
         if ((Boolean)predicate.invoke(element)) {
            ++count;
            if (count < 0) {
               CollectionsKt.throwCountOverflow();
            }
         }
      }

      return count;
   }

   public static final <T, R> R fold(@NotNull Sequence<? extends T> $this$fold, R initial, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$fold, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$fold = false;
      Object accumulator = initial;

      Object element;
      for(Iterator var5 = $this$fold.iterator(); var5.hasNext(); accumulator = operation.invoke(accumulator, element)) {
         element = var5.next();
      }

      return accumulator;
   }

   public static final <T, R> R foldIndexed(@NotNull Sequence<? extends T> $this$foldIndexed, R initial, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$foldIndexed, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$foldIndexed = false;
      int index = 0;
      Object accumulator = initial;

      Object element;
      int var8;
      for(Iterator var6 = $this$foldIndexed.iterator(); var6.hasNext(); accumulator = operation.invoke(var8, accumulator, element)) {
         element = var6.next();
         var8 = index++;
         if (var8 < 0) {
            CollectionsKt.throwIndexOverflow();
         }
      }

      return accumulator;
   }

   public static final <T> void forEach(@NotNull Sequence<? extends T> $this$forEach, @NotNull Function1<? super T, Unit> action) {
      Intrinsics.checkNotNullParameter($this$forEach, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      int $i$f$forEach = false;
      Iterator var3 = $this$forEach.iterator();

      while(var3.hasNext()) {
         Object element = var3.next();
         action.invoke(element);
      }

   }

   public static final <T> void forEachIndexed(@NotNull Sequence<? extends T> $this$forEachIndexed, @NotNull Function2<? super Integer, ? super T, Unit> action) {
      Intrinsics.checkNotNullParameter($this$forEachIndexed, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      int $i$f$forEachIndexed = false;
      int index = 0;

      Object item;
      int var6;
      for(Iterator var4 = $this$forEachIndexed.iterator(); var4.hasNext(); action.invoke(var6, item)) {
         item = var4.next();
         var6 = index++;
         if (var6 < 0) {
            CollectionsKt.throwIndexOverflow();
         }
      }

   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxOrThrow"
   )
   public static final double maxOrThrow(@NotNull Sequence<Double> $this$max) {
      Intrinsics.checkNotNullParameter($this$max, "<this>");
      Iterator iterator = $this$max.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException();
      } else {
         double max;
         double e;
         for(max = ((Number)iterator.next()).doubleValue(); iterator.hasNext(); max = Math.max(max, e)) {
            e = ((Number)iterator.next()).doubleValue();
         }

         return max;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxOrThrow"
   )
   public static final float maxOrThrow(@NotNull Sequence<Float> $this$max) {
      Intrinsics.checkNotNullParameter($this$max, "<this>");
      Iterator iterator = $this$max.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException();
      } else {
         float max;
         float e;
         for(max = ((Number)iterator.next()).floatValue(); iterator.hasNext(); max = Math.max(max, e)) {
            e = ((Number)iterator.next()).floatValue();
         }

         return max;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxOrThrow"
   )
   @NotNull
   public static final <T extends Comparable<? super T>> T maxOrThrow(@NotNull Sequence<? extends T> $this$max) {
      Intrinsics.checkNotNullParameter($this$max, "<this>");
      Iterator iterator = $this$max.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException();
      } else {
         Comparable max = (Comparable)iterator.next();

         while(iterator.hasNext()) {
            Comparable e = (Comparable)iterator.next();
            if (max.compareTo(e) < 0) {
               max = e;
            }
         }

         return max;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxByOrThrow"
   )
   public static final <T, R extends Comparable<? super R>> T maxByOrThrow(@NotNull Sequence<? extends T> $this$maxBy, @NotNull Function1<? super T, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$maxByOrThrow = false;
      Iterator iterator = $this$maxBy.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException();
      } else {
         Object maxElem = iterator.next();
         if (!iterator.hasNext()) {
            return maxElem;
         } else {
            Comparable maxValue = (Comparable)selector.invoke(maxElem);

            do {
               Object e = iterator.next();
               Comparable v = (Comparable)selector.invoke(e);
               if (maxValue.compareTo(v) < 0) {
                  maxElem = e;
                  maxValue = v;
               }
            } while(iterator.hasNext());

            return maxElem;
         }
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final <T, R extends Comparable<? super R>> T maxByOrNull(@NotNull Sequence<? extends T> $this$maxByOrNull, @NotNull Function1<? super T, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxByOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$maxByOrNull = false;
      Iterator iterator = $this$maxByOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         Object maxElem = iterator.next();
         if (!iterator.hasNext()) {
            return maxElem;
         } else {
            Comparable maxValue = (Comparable)selector.invoke(maxElem);

            do {
               Object e = iterator.next();
               Comparable v = (Comparable)selector.invoke(e);
               if (maxValue.compareTo(v) < 0) {
                  maxElem = e;
                  maxValue = v;
               }
            } while(iterator.hasNext());

            return maxElem;
         }
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <T> double maxOf(Sequence<? extends T> $this$maxOf, Function1<? super T, Double> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator iterator = $this$maxOf.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException();
      } else {
         double maxValue;
         double v;
         for(maxValue = ((Number)selector.invoke(iterator.next())).doubleValue(); iterator.hasNext(); maxValue = Math.max(maxValue, v)) {
            v = ((Number)selector.invoke(iterator.next())).doubleValue();
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <T> float maxOf(Sequence<? extends T> $this$maxOf, Function1<? super T, Float> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator iterator = $this$maxOf.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException();
      } else {
         float maxValue;
         float v;
         for(maxValue = ((Number)selector.invoke(iterator.next())).floatValue(); iterator.hasNext(); maxValue = Math.max(maxValue, v)) {
            v = ((Number)selector.invoke(iterator.next())).floatValue();
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <T, R extends Comparable<? super R>> R maxOf(Sequence<? extends T> $this$maxOf, Function1<? super T, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator iterator = $this$maxOf.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException();
      } else {
         Comparable maxValue = (Comparable)selector.invoke(iterator.next());

         while(iterator.hasNext()) {
            Comparable v = (Comparable)selector.invoke(iterator.next());
            if (maxValue.compareTo(v) < 0) {
               maxValue = v;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <T> Double maxOfOrNull(Sequence<? extends T> $this$maxOfOrNull, Function1<? super T, Double> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator iterator = $this$maxOfOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         double maxValue;
         double v;
         for(maxValue = ((Number)selector.invoke(iterator.next())).doubleValue(); iterator.hasNext(); maxValue = Math.max(maxValue, v)) {
            v = ((Number)selector.invoke(iterator.next())).doubleValue();
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <T> Float maxOfOrNull(Sequence<? extends T> $this$maxOfOrNull, Function1<? super T, Float> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator iterator = $this$maxOfOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         float maxValue;
         float v;
         for(maxValue = ((Number)selector.invoke(iterator.next())).floatValue(); iterator.hasNext(); maxValue = Math.max(maxValue, v)) {
            v = ((Number)selector.invoke(iterator.next())).floatValue();
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <T, R extends Comparable<? super R>> R maxOfOrNull(Sequence<? extends T> $this$maxOfOrNull, Function1<? super T, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator iterator = $this$maxOfOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         Comparable maxValue = (Comparable)selector.invoke(iterator.next());

         while(iterator.hasNext()) {
            Comparable v = (Comparable)selector.invoke(iterator.next());
            if (maxValue.compareTo(v) < 0) {
               maxValue = v;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <T, R> R maxOfWith(Sequence<? extends T> $this$maxOfWith, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator iterator = $this$maxOfWith.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException();
      } else {
         Object maxValue = selector.invoke(iterator.next());

         while(iterator.hasNext()) {
            Object v = selector.invoke(iterator.next());
            if (comparator.compare(maxValue, v) < 0) {
               maxValue = v;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <T, R> R maxOfWithOrNull(Sequence<? extends T> $this$maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfWithOrNull, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator iterator = $this$maxOfWithOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         Object maxValue = selector.invoke(iterator.next());

         while(iterator.hasNext()) {
            Object v = selector.invoke(iterator.next());
            if (comparator.compare(maxValue, v) < 0) {
               maxValue = v;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final Double maxOrNull(@NotNull Sequence<Double> $this$maxOrNull) {
      Intrinsics.checkNotNullParameter($this$maxOrNull, "<this>");
      Iterator iterator = $this$maxOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         double max;
         double e;
         for(max = ((Number)iterator.next()).doubleValue(); iterator.hasNext(); max = Math.max(max, e)) {
            e = ((Number)iterator.next()).doubleValue();
         }

         return max;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final Float maxOrNull(@NotNull Sequence<Float> $this$maxOrNull) {
      Intrinsics.checkNotNullParameter($this$maxOrNull, "<this>");
      Iterator iterator = $this$maxOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         float max;
         float e;
         for(max = ((Number)iterator.next()).floatValue(); iterator.hasNext(); max = Math.max(max, e)) {
            e = ((Number)iterator.next()).floatValue();
         }

         return max;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final <T extends Comparable<? super T>> T maxOrNull(@NotNull Sequence<? extends T> $this$maxOrNull) {
      Intrinsics.checkNotNullParameter($this$maxOrNull, "<this>");
      Iterator iterator = $this$maxOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         Comparable max = (Comparable)iterator.next();

         while(iterator.hasNext()) {
            Comparable e = (Comparable)iterator.next();
            if (max.compareTo(e) < 0) {
               max = e;
            }
         }

         return max;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxWithOrThrow"
   )
   public static final <T> T maxWithOrThrow(@NotNull Sequence<? extends T> $this$maxWith, @NotNull Comparator<? super T> comparator) {
      Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Iterator iterator = $this$maxWith.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException();
      } else {
         Object max = iterator.next();

         while(iterator.hasNext()) {
            Object e = iterator.next();
            if (comparator.compare(max, e) < 0) {
               max = e;
            }
         }

         return max;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final <T> T maxWithOrNull(@NotNull Sequence<? extends T> $this$maxWithOrNull, @NotNull Comparator<? super T> comparator) {
      Intrinsics.checkNotNullParameter($this$maxWithOrNull, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Iterator iterator = $this$maxWithOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         Object max = iterator.next();

         while(iterator.hasNext()) {
            Object e = iterator.next();
            if (comparator.compare(max, e) < 0) {
               max = e;
            }
         }

         return max;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minOrThrow"
   )
   public static final double minOrThrow(@NotNull Sequence<Double> $this$min) {
      Intrinsics.checkNotNullParameter($this$min, "<this>");
      Iterator iterator = $this$min.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException();
      } else {
         double min;
         double e;
         for(min = ((Number)iterator.next()).doubleValue(); iterator.hasNext(); min = Math.min(min, e)) {
            e = ((Number)iterator.next()).doubleValue();
         }

         return min;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minOrThrow"
   )
   public static final float minOrThrow(@NotNull Sequence<Float> $this$min) {
      Intrinsics.checkNotNullParameter($this$min, "<this>");
      Iterator iterator = $this$min.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException();
      } else {
         float min;
         float e;
         for(min = ((Number)iterator.next()).floatValue(); iterator.hasNext(); min = Math.min(min, e)) {
            e = ((Number)iterator.next()).floatValue();
         }

         return min;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minOrThrow"
   )
   @NotNull
   public static final <T extends Comparable<? super T>> T minOrThrow(@NotNull Sequence<? extends T> $this$min) {
      Intrinsics.checkNotNullParameter($this$min, "<this>");
      Iterator iterator = $this$min.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException();
      } else {
         Comparable min = (Comparable)iterator.next();

         while(iterator.hasNext()) {
            Comparable e = (Comparable)iterator.next();
            if (min.compareTo(e) > 0) {
               min = e;
            }
         }

         return min;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minByOrThrow"
   )
   public static final <T, R extends Comparable<? super R>> T minByOrThrow(@NotNull Sequence<? extends T> $this$minBy, @NotNull Function1<? super T, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$minByOrThrow = false;
      Iterator iterator = $this$minBy.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException();
      } else {
         Object minElem = iterator.next();
         if (!iterator.hasNext()) {
            return minElem;
         } else {
            Comparable minValue = (Comparable)selector.invoke(minElem);

            do {
               Object e = iterator.next();
               Comparable v = (Comparable)selector.invoke(e);
               if (minValue.compareTo(v) > 0) {
                  minElem = e;
                  minValue = v;
               }
            } while(iterator.hasNext());

            return minElem;
         }
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final <T, R extends Comparable<? super R>> T minByOrNull(@NotNull Sequence<? extends T> $this$minByOrNull, @NotNull Function1<? super T, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minByOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$minByOrNull = false;
      Iterator iterator = $this$minByOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         Object minElem = iterator.next();
         if (!iterator.hasNext()) {
            return minElem;
         } else {
            Comparable minValue = (Comparable)selector.invoke(minElem);

            do {
               Object e = iterator.next();
               Comparable v = (Comparable)selector.invoke(e);
               if (minValue.compareTo(v) > 0) {
                  minElem = e;
                  minValue = v;
               }
            } while(iterator.hasNext());

            return minElem;
         }
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <T> double minOf(Sequence<? extends T> $this$minOf, Function1<? super T, Double> selector) {
      Intrinsics.checkNotNullParameter($this$minOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator iterator = $this$minOf.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException();
      } else {
         double minValue;
         double v;
         for(minValue = ((Number)selector.invoke(iterator.next())).doubleValue(); iterator.hasNext(); minValue = Math.min(minValue, v)) {
            v = ((Number)selector.invoke(iterator.next())).doubleValue();
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <T> float minOf(Sequence<? extends T> $this$minOf, Function1<? super T, Float> selector) {
      Intrinsics.checkNotNullParameter($this$minOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator iterator = $this$minOf.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException();
      } else {
         float minValue;
         float v;
         for(minValue = ((Number)selector.invoke(iterator.next())).floatValue(); iterator.hasNext(); minValue = Math.min(minValue, v)) {
            v = ((Number)selector.invoke(iterator.next())).floatValue();
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <T, R extends Comparable<? super R>> R minOf(Sequence<? extends T> $this$minOf, Function1<? super T, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator iterator = $this$minOf.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException();
      } else {
         Comparable minValue = (Comparable)selector.invoke(iterator.next());

         while(iterator.hasNext()) {
            Comparable v = (Comparable)selector.invoke(iterator.next());
            if (minValue.compareTo(v) > 0) {
               minValue = v;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <T> Double minOfOrNull(Sequence<? extends T> $this$minOfOrNull, Function1<? super T, Double> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator iterator = $this$minOfOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         double minValue;
         double v;
         for(minValue = ((Number)selector.invoke(iterator.next())).doubleValue(); iterator.hasNext(); minValue = Math.min(minValue, v)) {
            v = ((Number)selector.invoke(iterator.next())).doubleValue();
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <T> Float minOfOrNull(Sequence<? extends T> $this$minOfOrNull, Function1<? super T, Float> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator iterator = $this$minOfOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         float minValue;
         float v;
         for(minValue = ((Number)selector.invoke(iterator.next())).floatValue(); iterator.hasNext(); minValue = Math.min(minValue, v)) {
            v = ((Number)selector.invoke(iterator.next())).floatValue();
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <T, R extends Comparable<? super R>> R minOfOrNull(Sequence<? extends T> $this$minOfOrNull, Function1<? super T, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator iterator = $this$minOfOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         Comparable minValue = (Comparable)selector.invoke(iterator.next());

         while(iterator.hasNext()) {
            Comparable v = (Comparable)selector.invoke(iterator.next());
            if (minValue.compareTo(v) > 0) {
               minValue = v;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <T, R> R minOfWith(Sequence<? extends T> $this$minOfWith, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator iterator = $this$minOfWith.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException();
      } else {
         Object minValue = selector.invoke(iterator.next());

         while(iterator.hasNext()) {
            Object v = selector.invoke(iterator.next());
            if (comparator.compare(minValue, v) > 0) {
               minValue = v;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <T, R> R minOfWithOrNull(Sequence<? extends T> $this$minOfWithOrNull, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfWithOrNull, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator iterator = $this$minOfWithOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         Object minValue = selector.invoke(iterator.next());

         while(iterator.hasNext()) {
            Object v = selector.invoke(iterator.next());
            if (comparator.compare(minValue, v) > 0) {
               minValue = v;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final Double minOrNull(@NotNull Sequence<Double> $this$minOrNull) {
      Intrinsics.checkNotNullParameter($this$minOrNull, "<this>");
      Iterator iterator = $this$minOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         double min;
         double e;
         for(min = ((Number)iterator.next()).doubleValue(); iterator.hasNext(); min = Math.min(min, e)) {
            e = ((Number)iterator.next()).doubleValue();
         }

         return min;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final Float minOrNull(@NotNull Sequence<Float> $this$minOrNull) {
      Intrinsics.checkNotNullParameter($this$minOrNull, "<this>");
      Iterator iterator = $this$minOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         float min;
         float e;
         for(min = ((Number)iterator.next()).floatValue(); iterator.hasNext(); min = Math.min(min, e)) {
            e = ((Number)iterator.next()).floatValue();
         }

         return min;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final <T extends Comparable<? super T>> T minOrNull(@NotNull Sequence<? extends T> $this$minOrNull) {
      Intrinsics.checkNotNullParameter($this$minOrNull, "<this>");
      Iterator iterator = $this$minOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         Comparable min = (Comparable)iterator.next();

         while(iterator.hasNext()) {
            Comparable e = (Comparable)iterator.next();
            if (min.compareTo(e) > 0) {
               min = e;
            }
         }

         return min;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minWithOrThrow"
   )
   public static final <T> T minWithOrThrow(@NotNull Sequence<? extends T> $this$minWith, @NotNull Comparator<? super T> comparator) {
      Intrinsics.checkNotNullParameter($this$minWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Iterator iterator = $this$minWith.iterator();
      if (!iterator.hasNext()) {
         throw new NoSuchElementException();
      } else {
         Object min = iterator.next();

         while(iterator.hasNext()) {
            Object e = iterator.next();
            if (comparator.compare(min, e) > 0) {
               min = e;
            }
         }

         return min;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final <T> T minWithOrNull(@NotNull Sequence<? extends T> $this$minWithOrNull, @NotNull Comparator<? super T> comparator) {
      Intrinsics.checkNotNullParameter($this$minWithOrNull, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Iterator iterator = $this$minWithOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         Object min = iterator.next();

         while(iterator.hasNext()) {
            Object e = iterator.next();
            if (comparator.compare(min, e) > 0) {
               min = e;
            }
         }

         return min;
      }
   }

   public static final <T> boolean none(@NotNull Sequence<? extends T> $this$none) {
      Intrinsics.checkNotNullParameter($this$none, "<this>");
      return !$this$none.iterator().hasNext();
   }

   public static final <T> boolean none(@NotNull Sequence<? extends T> $this$none, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$none, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$none = false;
      Iterator var3 = $this$none.iterator();

      Object element;
      do {
         if (!var3.hasNext()) {
            return true;
         }

         element = var3.next();
      } while(!(Boolean)predicate.invoke(element));

      return false;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <T> Sequence<T> onEach(@NotNull Sequence<? extends T> $this$onEach, @NotNull Function1<? super T, Unit> action) {
      Intrinsics.checkNotNullParameter($this$onEach, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      return SequencesKt.map($this$onEach, SequencesKt___SequencesKt::onEach$lambda$14$SequencesKt___SequencesKt);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <T> Sequence<T> onEachIndexed(@NotNull Sequence<? extends T> $this$onEachIndexed, @NotNull Function2<? super Integer, ? super T, Unit> action) {
      Intrinsics.checkNotNullParameter($this$onEachIndexed, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      return SequencesKt.mapIndexed($this$onEachIndexed, SequencesKt___SequencesKt::onEachIndexed$lambda$15$SequencesKt___SequencesKt);
   }

   public static final <S, T extends S> S reduce(@NotNull Sequence<? extends T> $this$reduce, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
      Intrinsics.checkNotNullParameter($this$reduce, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$reduce = false;
      Iterator iterator = $this$reduce.iterator();
      if (!iterator.hasNext()) {
         throw new UnsupportedOperationException("Empty sequence can't be reduced.");
      } else {
         Object accumulator;
         for(accumulator = iterator.next(); iterator.hasNext(); accumulator = operation.invoke(accumulator, iterator.next())) {
         }

         return accumulator;
      }
   }

   public static final <S, T extends S> S reduceIndexed(@NotNull Sequence<? extends T> $this$reduceIndexed, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
      Intrinsics.checkNotNullParameter($this$reduceIndexed, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$reduceIndexed = false;
      Iterator iterator = $this$reduceIndexed.iterator();
      if (!iterator.hasNext()) {
         throw new UnsupportedOperationException("Empty sequence can't be reduced.");
      } else {
         int index = 1;

         Object accumulator;
         int var6;
         for(accumulator = iterator.next(); iterator.hasNext(); accumulator = operation.invoke(var6, accumulator, iterator.next())) {
            var6 = index++;
            if (var6 < 0) {
               CollectionsKt.throwIndexOverflow();
            }
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final <S, T extends S> S reduceIndexedOrNull(@NotNull Sequence<? extends T> $this$reduceIndexedOrNull, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
      Intrinsics.checkNotNullParameter($this$reduceIndexedOrNull, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$reduceIndexedOrNull = false;
      Iterator iterator = $this$reduceIndexedOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         int index = 1;

         Object accumulator;
         int var6;
         for(accumulator = iterator.next(); iterator.hasNext(); accumulator = operation.invoke(var6, accumulator, iterator.next())) {
            var6 = index++;
            if (var6 < 0) {
               CollectionsKt.throwIndexOverflow();
            }
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final <S, T extends S> S reduceOrNull(@NotNull Sequence<? extends T> $this$reduceOrNull, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
      Intrinsics.checkNotNullParameter($this$reduceOrNull, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$reduceOrNull = false;
      Iterator iterator = $this$reduceOrNull.iterator();
      if (!iterator.hasNext()) {
         return null;
      } else {
         Object accumulator;
         for(accumulator = iterator.next(); iterator.hasNext(); accumulator = operation.invoke(accumulator, iterator.next())) {
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <T, R> Sequence<R> runningFold(@NotNull Sequence<? extends T> $this$runningFold, R initial, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$runningFold, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      return SequencesKt.sequence((Function2)(new Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object>((Continuation)null) {
         Object L$1;
         Object L$2;
         Object L$3;
         int label;
         // $FF: synthetic field
         private Object L$0;

         public final Object invokeSuspend(Object $result) {
            SequenceScope $this$sequence;
            Continuation var10002;
            Object accumulator;
            Iterator var4;
            Object element;
            Object var6;
            label30: {
               $this$sequence = (SequenceScope)this.L$0;
               var6 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
               switch(this.label) {
               case 0:
                  ResultKt.throwOnFailure($result);
                  Object var10001 = initial;
                  var10002 = (Continuation)this;
                  this.L$0 = $this$sequence;
                  this.label = 1;
                  if ($this$sequence.yield(var10001, var10002) == var6) {
                     return var6;
                  }
                  break;
               case 1:
                  ResultKt.throwOnFailure($result);
                  break;
               case 2:
                  element = this.L$3;
                  var4 = (Iterator)this.L$2;
                  accumulator = this.L$1;
                  ResultKt.throwOnFailure($result);
                  break label30;
               default:
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               accumulator = initial;
               var4 = $this$runningFold.iterator();
            }

            do {
               if (!var4.hasNext()) {
                  return Unit.INSTANCE;
               }

               element = var4.next();
               accumulator = operation.invoke(accumulator, element);
               var10002 = (Continuation)this;
               this.L$0 = $this$sequence;
               this.L$1 = accumulator;
               this.L$2 = var4;
               this.L$3 = SpillingKt.nullOutSpilledVariable(element);
               this.label = 2;
            } while($this$sequence.yield(accumulator, var10002) != var6);

            return var6;
         }

         public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            Function2 var3 = new <anonymous constructor>($completion);
            var3.L$0 = value;
            return (Continuation)var3;
         }

         public final Object invoke(SequenceScope<? super R> p1, Continuation<? super Unit> p2) {
            return ((<undefinedtype>)this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
         }
      }));
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <T, R> Sequence<R> runningFoldIndexed(@NotNull Sequence<? extends T> $this$runningFoldIndexed, R initial, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$runningFoldIndexed, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      return SequencesKt.sequence((Function2)(new Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object>((Continuation)null) {
         Object L$1;
         Object L$2;
         Object L$3;
         int I$0;
         int label;
         // $FF: synthetic field
         private Object L$0;

         public final Object invokeSuspend(Object $result) {
            SequenceScope $this$sequence;
            Continuation var10002;
            int index;
            Object accumulator;
            Iterator var5;
            Object element;
            Object var8;
            label34: {
               $this$sequence = (SequenceScope)this.L$0;
               var8 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
               switch(this.label) {
               case 0:
                  ResultKt.throwOnFailure($result);
                  Object var10001 = initial;
                  var10002 = (Continuation)this;
                  this.L$0 = $this$sequence;
                  this.label = 1;
                  if ($this$sequence.yield(var10001, var10002) == var8) {
                     return var8;
                  }
                  break;
               case 1:
                  ResultKt.throwOnFailure($result);
                  break;
               case 2:
                  index = this.I$0;
                  element = this.L$3;
                  var5 = (Iterator)this.L$2;
                  accumulator = this.L$1;
                  ResultKt.throwOnFailure($result);
                  break label34;
               default:
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               index = 0;
               accumulator = initial;
               var5 = $this$runningFoldIndexed.iterator();
            }

            do {
               if (!var5.hasNext()) {
                  return Unit.INSTANCE;
               }

               element = var5.next();
               Function3 var10000 = operation;
               int var7 = index++;
               if (var7 < 0) {
                  CollectionsKt.throwIndexOverflow();
               }

               accumulator = var10000.invoke(Boxing.boxInt(var7), accumulator, element);
               var10002 = (Continuation)this;
               this.L$0 = $this$sequence;
               this.L$1 = accumulator;
               this.L$2 = var5;
               this.L$3 = SpillingKt.nullOutSpilledVariable(element);
               this.I$0 = index;
               this.label = 2;
            } while($this$sequence.yield(accumulator, var10002) != var8);

            return var8;
         }

         public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            Function2 var3 = new <anonymous constructor>($completion);
            var3.L$0 = value;
            return (Continuation)var3;
         }

         public final Object invoke(SequenceScope<? super R> p1, Continuation<? super Unit> p2) {
            return ((<undefinedtype>)this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
         }
      }));
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <S, T extends S> Sequence<S> runningReduce(@NotNull Sequence<? extends T> $this$runningReduce, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
      Intrinsics.checkNotNullParameter($this$runningReduce, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      return SequencesKt.sequence((Function2)(new Function2<SequenceScope<? super S>, Continuation<? super Unit>, Object>((Continuation)null) {
         Object L$1;
         Object L$2;
         int label;
         // $FF: synthetic field
         private Object L$0;

         public final Object invokeSuspend(Object $result) {
            SequenceScope $this$sequence = (SequenceScope)this.L$0;
            Object var5 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            Continuation var10002;
            Iterator iterator;
            Object accumulator;
            switch(this.label) {
            case 0:
               ResultKt.throwOnFailure($result);
               iterator = $this$runningReduce.iterator();
               if (!iterator.hasNext()) {
                  return Unit.INSTANCE;
               }

               accumulator = iterator.next();
               var10002 = (Continuation)this;
               this.L$0 = $this$sequence;
               this.L$1 = iterator;
               this.L$2 = accumulator;
               this.label = 1;
               if ($this$sequence.yield(accumulator, var10002) == var5) {
                  return var5;
               }
               break;
            case 1:
               accumulator = this.L$2;
               iterator = (Iterator)this.L$1;
               ResultKt.throwOnFailure($result);
               break;
            case 2:
               accumulator = this.L$2;
               iterator = (Iterator)this.L$1;
               ResultKt.throwOnFailure($result);
               break;
            default:
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            do {
               if (!iterator.hasNext()) {
                  return Unit.INSTANCE;
               }

               accumulator = operation.invoke(accumulator, iterator.next());
               var10002 = (Continuation)this;
               this.L$0 = $this$sequence;
               this.L$1 = iterator;
               this.L$2 = accumulator;
               this.label = 2;
            } while($this$sequence.yield(accumulator, var10002) != var5);

            return var5;
         }

         public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            Function2 var3 = new <anonymous constructor>($completion);
            var3.L$0 = value;
            return (Continuation)var3;
         }

         public final Object invoke(SequenceScope<? super S> p1, Continuation<? super Unit> p2) {
            return ((<undefinedtype>)this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
         }
      }));
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <S, T extends S> Sequence<S> runningReduceIndexed(@NotNull Sequence<? extends T> $this$runningReduceIndexed, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
      Intrinsics.checkNotNullParameter($this$runningReduceIndexed, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      return SequencesKt.sequence((Function2)(new Function2<SequenceScope<? super S>, Continuation<? super Unit>, Object>((Continuation)null) {
         Object L$1;
         Object L$2;
         int I$0;
         int label;
         // $FF: synthetic field
         private Object L$0;

         public final Object invokeSuspend(Object $result) {
            SequenceScope $this$sequence;
            Continuation var10002;
            Iterator iterator;
            Object accumulator;
            int index;
            Object var7;
            label38: {
               $this$sequence = (SequenceScope)this.L$0;
               var7 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
               switch(this.label) {
               case 0:
                  ResultKt.throwOnFailure($result);
                  iterator = $this$runningReduceIndexed.iterator();
                  if (!iterator.hasNext()) {
                     return Unit.INSTANCE;
                  }

                  accumulator = iterator.next();
                  var10002 = (Continuation)this;
                  this.L$0 = $this$sequence;
                  this.L$1 = iterator;
                  this.L$2 = accumulator;
                  this.label = 1;
                  if ($this$sequence.yield(accumulator, var10002) == var7) {
                     return var7;
                  }
                  break;
               case 1:
                  accumulator = this.L$2;
                  iterator = (Iterator)this.L$1;
                  ResultKt.throwOnFailure($result);
                  break;
               case 2:
                  index = this.I$0;
                  accumulator = this.L$2;
                  iterator = (Iterator)this.L$1;
                  ResultKt.throwOnFailure($result);
                  break label38;
               default:
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               index = 1;
            }

            do {
               if (!iterator.hasNext()) {
                  return Unit.INSTANCE;
               }

               Function3 var10000 = operation;
               int var6 = index++;
               if (var6 < 0) {
                  CollectionsKt.throwIndexOverflow();
               }

               accumulator = var10000.invoke(Boxing.boxInt(var6), accumulator, iterator.next());
               var10002 = (Continuation)this;
               this.L$0 = $this$sequence;
               this.L$1 = iterator;
               this.L$2 = accumulator;
               this.I$0 = index;
               this.label = 2;
            } while($this$sequence.yield(accumulator, var10002) != var7);

            return var7;
         }

         public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            Function2 var3 = new <anonymous constructor>($completion);
            var3.L$0 = value;
            return (Continuation)var3;
         }

         public final Object invoke(SequenceScope<? super S> p1, Continuation<? super Unit> p2) {
            return ((<undefinedtype>)this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
         }
      }));
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <T, R> Sequence<R> scan(@NotNull Sequence<? extends T> $this$scan, R initial, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$scan, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      return SequencesKt.runningFold($this$scan, initial, operation);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <T, R> Sequence<R> scanIndexed(@NotNull Sequence<? extends T> $this$scanIndexed, R initial, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$scanIndexed, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      return SequencesKt.runningFoldIndexed($this$scanIndexed, initial, operation);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use sumOf instead.",
      replaceWith = @ReplaceWith(
   expression = "this.sumOf(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5"
   )
   public static final <T> int sumBy(@NotNull Sequence<? extends T> $this$sumBy, @NotNull Function1<? super T, Integer> selector) {
      Intrinsics.checkNotNullParameter($this$sumBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$sumBy = false;
      int sum = 0;

      Object element;
      for(Iterator var4 = $this$sumBy.iterator(); var4.hasNext(); sum += ((Number)selector.invoke(element)).intValue()) {
         element = var4.next();
      }

      return sum;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use sumOf instead.",
      replaceWith = @ReplaceWith(
   expression = "this.sumOf(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5"
   )
   public static final <T> double sumByDouble(@NotNull Sequence<? extends T> $this$sumByDouble, @NotNull Function1<? super T, Double> selector) {
      Intrinsics.checkNotNullParameter($this$sumByDouble, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$sumByDouble = false;
      double sum = 0.0D;

      Object element;
      for(Iterator var5 = $this$sumByDouble.iterator(); var5.hasNext(); sum += ((Number)selector.invoke(element)).doubleValue()) {
         element = var5.next();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfDouble"
   )
   @InlineOnly
   private static final <T> double sumOfDouble(Sequence<? extends T> $this$sumOf, Function1<? super T, Double> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      double sum = 0.0D;

      Object element;
      for(Iterator var4 = $this$sumOf.iterator(); var4.hasNext(); sum += ((Number)selector.invoke(element)).doubleValue()) {
         element = var4.next();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @JvmName(
      name = "sumOfInt"
   )
   @InlineOnly
   private static final <T> int sumOfInt(Sequence<? extends T> $this$sumOf, Function1<? super T, Integer> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int sum = 0;

      Object element;
      for(Iterator var3 = $this$sumOf.iterator(); var3.hasNext(); sum += ((Number)selector.invoke(element)).intValue()) {
         element = var3.next();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfLong"
   )
   @InlineOnly
   private static final <T> long sumOfLong(Sequence<? extends T> $this$sumOf, Function1<? super T, Long> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      long sum = 0L;

      Object element;
      for(Iterator var4 = $this$sumOf.iterator(); var4.hasNext(); sum += ((Number)selector.invoke(element)).longValue()) {
         element = var4.next();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @JvmName(
      name = "sumOfUInt"
   )
   @InlineOnly
   private static final <T> int sumOfUInt(Sequence<? extends T> $this$sumOf, Function1<? super T, UInt> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int sum = UInt.constructor-impl(0);

      Object element;
      for(Iterator var3 = $this$sumOf.iterator(); var3.hasNext(); sum = UInt.constructor-impl(sum + ((UInt)selector.invoke(element)).unbox-impl())) {
         element = var3.next();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfULong"
   )
   @InlineOnly
   private static final <T> long sumOfULong(Sequence<? extends T> $this$sumOf, Function1<? super T, ULong> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      long sum = ULong.constructor-impl(0L);

      Object element;
      for(Iterator var4 = $this$sumOf.iterator(); var4.hasNext(); sum = ULong.constructor-impl(sum + ((ULong)selector.invoke(element)).unbox-impl())) {
         element = var4.next();
      }

      return sum;
   }

   @NotNull
   public static final <T> Sequence<T> requireNoNulls(@NotNull Sequence<? extends T> $this$requireNoNulls) {
      Intrinsics.checkNotNullParameter($this$requireNoNulls, "<this>");
      return SequencesKt.map($this$requireNoNulls, SequencesKt___SequencesKt::requireNoNulls$lambda$16$SequencesKt___SequencesKt);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <T> Sequence<List<T>> chunked(@NotNull Sequence<? extends T> $this$chunked, int size) {
      Intrinsics.checkNotNullParameter($this$chunked, "<this>");
      return SequencesKt.windowed($this$chunked, size, size, true);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <T, R> Sequence<R> chunked(@NotNull Sequence<? extends T> $this$chunked, int size, @NotNull Function1<? super List<? extends T>, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$chunked, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      return SequencesKt.windowed($this$chunked, size, size, true, transform);
   }

   @NotNull
   public static final <T> Sequence<T> minus(@NotNull Sequence<? extends T> $this$minus, T element) {
      Intrinsics.checkNotNullParameter($this$minus, "<this>");
      return (Sequence)(new Sequence<T>() {
         public Iterator<T> iterator() {
            Ref.BooleanRef removed = new Ref.BooleanRef();
            return SequencesKt.filter($this$minus, <undefinedtype>::iterator$lambda$0).iterator();
         }

         private static final boolean iterator$lambda$0(Ref.BooleanRef $removed, Object $element, Object it) {
            boolean var10000;
            if (!$removed.element && Intrinsics.areEqual(it, $element)) {
               $removed.element = true;
               var10000 = false;
            } else {
               var10000 = true;
            }

            return var10000;
         }
      });
   }

   @NotNull
   public static final <T> Sequence<T> minus(@NotNull Sequence<? extends T> $this$minus, @NotNull T[] elements) {
      Intrinsics.checkNotNullParameter($this$minus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      return elements.length == 0 ? $this$minus : (Sequence)(new Sequence<T>() {
         public Iterator<T> iterator() {
            return SequencesKt.filterNot($this$minus, <undefinedtype>::iterator$lambda$0).iterator();
         }

         private static final boolean iterator$lambda$0(Object[] $elements, Object it) {
            return ArraysKt.contains($elements, it);
         }
      });
   }

   @NotNull
   public static final <T> Sequence<T> minus(@NotNull Sequence<? extends T> $this$minus, @NotNull Iterable<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$minus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      return (Sequence)(new Sequence<T>() {
         public Iterator<T> iterator() {
            Collection other = CollectionsKt.convertToListIfNotCollection(elements);
            return other.isEmpty() ? $this$minus.iterator() : SequencesKt.filterNot($this$minus, <undefinedtype>::iterator$lambda$0).iterator();
         }

         private static final boolean iterator$lambda$0(Collection $other, Object it) {
            return $other.contains(it);
         }
      });
   }

   @NotNull
   public static final <T> Sequence<T> minus(@NotNull Sequence<? extends T> $this$minus, @NotNull Sequence<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$minus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      return (Sequence)(new Sequence<T>() {
         public Iterator<T> iterator() {
            List other = SequencesKt.toList(elements);
            return other.isEmpty() ? $this$minus.iterator() : SequencesKt.filterNot($this$minus, <undefinedtype>::iterator$lambda$0).iterator();
         }

         private static final boolean iterator$lambda$0(List $other, Object it) {
            return $other.contains(it);
         }
      });
   }

   @InlineOnly
   private static final <T> Sequence<T> minusElement(Sequence<? extends T> $this$minusElement, T element) {
      Intrinsics.checkNotNullParameter($this$minusElement, "<this>");
      return SequencesKt.minus($this$minusElement, element);
   }

   @NotNull
   public static final <T> Pair<List<T>, List<T>> partition(@NotNull Sequence<? extends T> $this$partition, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$partition, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$partition = false;
      ArrayList first = new ArrayList();
      ArrayList second = new ArrayList();
      Iterator var5 = $this$partition.iterator();

      while(var5.hasNext()) {
         Object element = var5.next();
         if ((Boolean)predicate.invoke(element)) {
            first.add(element);
         } else {
            second.add(element);
         }
      }

      return new Pair(first, second);
   }

   @NotNull
   public static final <T> Sequence<T> plus(@NotNull Sequence<? extends T> $this$plus, T element) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Sequence[] var2 = new Sequence[]{$this$plus, SequencesKt.sequenceOf(element)};
      return SequencesKt.flatten(SequencesKt.sequenceOf(var2));
   }

   @NotNull
   public static final <T> Sequence<T> plus(@NotNull Sequence<? extends T> $this$plus, @NotNull T[] elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      return SequencesKt.plus($this$plus, (Iterable)ArraysKt.asList(elements));
   }

   @NotNull
   public static final <T> Sequence<T> plus(@NotNull Sequence<? extends T> $this$plus, @NotNull Iterable<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      Sequence[] var2 = new Sequence[]{$this$plus, CollectionsKt.asSequence(elements)};
      return SequencesKt.flatten(SequencesKt.sequenceOf(var2));
   }

   @NotNull
   public static final <T> Sequence<T> plus(@NotNull Sequence<? extends T> $this$plus, @NotNull Sequence<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      Sequence[] var2 = new Sequence[]{$this$plus, elements};
      return SequencesKt.flatten(SequencesKt.sequenceOf(var2));
   }

   @InlineOnly
   private static final <T> Sequence<T> plusElement(Sequence<? extends T> $this$plusElement, T element) {
      Intrinsics.checkNotNullParameter($this$plusElement, "<this>");
      return SequencesKt.plus($this$plusElement, element);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <T> Sequence<List<T>> windowed(@NotNull Sequence<? extends T> $this$windowed, int size, int step, boolean partialWindows) {
      Intrinsics.checkNotNullParameter($this$windowed, "<this>");
      return SlidingWindowKt.windowedSequence($this$windowed, size, step, partialWindows, false);
   }

   // $FF: synthetic method
   public static Sequence windowed$default(Sequence var0, int var1, int var2, boolean var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 1;
      }

      if ((var4 & 4) != 0) {
         var3 = false;
      }

      return SequencesKt.windowed(var0, var1, var2, var3);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <T, R> Sequence<R> windowed(@NotNull Sequence<? extends T> $this$windowed, int size, int step, boolean partialWindows, @NotNull Function1<? super List<? extends T>, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$windowed, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      return SequencesKt.map(SlidingWindowKt.windowedSequence($this$windowed, size, step, partialWindows, true), transform);
   }

   // $FF: synthetic method
   public static Sequence windowed$default(Sequence var0, int var1, int var2, boolean var3, Function1 var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var2 = 1;
      }

      if ((var5 & 4) != 0) {
         var3 = false;
      }

      return SequencesKt.windowed(var0, var1, var2, var3, var4);
   }

   @NotNull
   public static final <T, R> Sequence<Pair<T, R>> zip(@NotNull Sequence<? extends T> $this$zip, @NotNull Sequence<? extends R> other) {
      Intrinsics.checkNotNullParameter($this$zip, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      return (Sequence)(new MergingSequence($this$zip, other, SequencesKt___SequencesKt::zip$lambda$17$SequencesKt___SequencesKt));
   }

   @NotNull
   public static final <T, R, V> Sequence<V> zip(@NotNull Sequence<? extends T> $this$zip, @NotNull Sequence<? extends R> other, @NotNull Function2<? super T, ? super R, ? extends V> transform) {
      Intrinsics.checkNotNullParameter($this$zip, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      Intrinsics.checkNotNullParameter(transform, "transform");
      return (Sequence)(new MergingSequence($this$zip, other, transform));
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <T> Sequence<Pair<T, T>> zipWithNext(@NotNull Sequence<? extends T> $this$zipWithNext) {
      Intrinsics.checkNotNullParameter($this$zipWithNext, "<this>");
      return SequencesKt.zipWithNext($this$zipWithNext, SequencesKt___SequencesKt::zipWithNext$lambda$18$SequencesKt___SequencesKt);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <T, R> Sequence<R> zipWithNext(@NotNull Sequence<? extends T> $this$zipWithNext, @NotNull Function2<? super T, ? super T, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$zipWithNext, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      return SequencesKt.sequence((Function2)(new Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object>((Continuation)null) {
         Object L$1;
         Object L$2;
         Object L$3;
         int label;
         // $FF: synthetic field
         private Object L$0;

         public final Object invokeSuspend(Object $result) {
            SequenceScope $this$result = (SequenceScope)this.L$0;
            Object var6 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            Iterator iterator;
            Object current;
            Object next;
            switch(this.label) {
            case 0:
               ResultKt.throwOnFailure($result);
               iterator = $this$zipWithNext.iterator();
               if (!iterator.hasNext()) {
                  return Unit.INSTANCE;
               }

               current = iterator.next();
               break;
            case 1:
               next = this.L$3;
               current = this.L$2;
               iterator = (Iterator)this.L$1;
               ResultKt.throwOnFailure($result);
               current = next;
               break;
            default:
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            while(iterator.hasNext()) {
               next = iterator.next();
               Object var10001 = transform.invoke(current, next);
               Continuation var10002 = (Continuation)this;
               this.L$0 = $this$result;
               this.L$1 = iterator;
               this.L$2 = SpillingKt.nullOutSpilledVariable(current);
               this.L$3 = next;
               this.label = 1;
               if ($this$result.yield(var10001, var10002) == var6) {
                  return var6;
               }

               current = next;
            }

            return Unit.INSTANCE;
         }

         public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            Function2 var3 = new <anonymous constructor>($completion);
            var3.L$0 = value;
            return (Continuation)var3;
         }

         public final Object invoke(SequenceScope<? super R> p1, Continuation<? super Unit> p2) {
            return ((<undefinedtype>)this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
         }
      }));
   }

   @NotNull
   public static final <T, A extends Appendable> A joinTo(@NotNull Sequence<? extends T> $this$joinTo, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> transform) {
      Intrinsics.checkNotNullParameter($this$joinTo, "<this>");
      Intrinsics.checkNotNullParameter(buffer, "buffer");
      Intrinsics.checkNotNullParameter(separator, "separator");
      Intrinsics.checkNotNullParameter(prefix, "prefix");
      Intrinsics.checkNotNullParameter(postfix, "postfix");
      Intrinsics.checkNotNullParameter(truncated, "truncated");
      buffer.append(prefix);
      int count = 0;
      Iterator var9 = $this$joinTo.iterator();

      while(var9.hasNext()) {
         Object element = var9.next();
         ++count;
         if (count > 1) {
            buffer.append(separator);
         }

         if (limit >= 0 && count > limit) {
            break;
         }

         StringsKt.appendElement(buffer, element, transform);
      }

      if (limit >= 0 && count > limit) {
         buffer.append(truncated);
      }

      buffer.append(postfix);
      return buffer;
   }

   // $FF: synthetic method
   public static Appendable joinTo$default(Sequence var0, Appendable var1, CharSequence var2, CharSequence var3, CharSequence var4, int var5, CharSequence var6, Function1 var7, int var8, Object var9) {
      if ((var8 & 2) != 0) {
         var2 = (CharSequence)", ";
      }

      if ((var8 & 4) != 0) {
         var3 = (CharSequence)"";
      }

      if ((var8 & 8) != 0) {
         var4 = (CharSequence)"";
      }

      if ((var8 & 16) != 0) {
         var5 = -1;
      }

      if ((var8 & 32) != 0) {
         var6 = (CharSequence)"...";
      }

      if ((var8 & 64) != 0) {
         var7 = null;
      }

      return SequencesKt.joinTo(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   @NotNull
   public static final <T> String joinToString(@NotNull Sequence<? extends T> $this$joinToString, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> transform) {
      Intrinsics.checkNotNullParameter($this$joinToString, "<this>");
      Intrinsics.checkNotNullParameter(separator, "separator");
      Intrinsics.checkNotNullParameter(prefix, "prefix");
      Intrinsics.checkNotNullParameter(postfix, "postfix");
      Intrinsics.checkNotNullParameter(truncated, "truncated");
      return ((StringBuilder)SequencesKt.joinTo($this$joinToString, (Appendable)(new StringBuilder()), separator, prefix, postfix, limit, truncated, transform)).toString();
   }

   // $FF: synthetic method
   public static String joinToString$default(Sequence var0, CharSequence var1, CharSequence var2, CharSequence var3, int var4, CharSequence var5, Function1 var6, int var7, Object var8) {
      if ((var7 & 1) != 0) {
         var1 = (CharSequence)", ";
      }

      if ((var7 & 2) != 0) {
         var2 = (CharSequence)"";
      }

      if ((var7 & 4) != 0) {
         var3 = (CharSequence)"";
      }

      if ((var7 & 8) != 0) {
         var4 = -1;
      }

      if ((var7 & 16) != 0) {
         var5 = (CharSequence)"...";
      }

      if ((var7 & 32) != 0) {
         var6 = null;
      }

      return SequencesKt.joinToString(var0, var1, var2, var3, var4, var5, var6);
   }

   @NotNull
   public static final <T> Iterable<T> asIterable(@NotNull Sequence<? extends T> $this$asIterable) {
      Intrinsics.checkNotNullParameter($this$asIterable, "<this>");
      return (Iterable)(new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1($this$asIterable));
   }

   @InlineOnly
   private static final <T> Sequence<T> asSequence(Sequence<? extends T> $this$asSequence) {
      Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
      return $this$asSequence;
   }

   @JvmName(
      name = "averageOfByte"
   )
   public static final double averageOfByte(@NotNull Sequence<Byte> $this$average) {
      Intrinsics.checkNotNullParameter($this$average, "<this>");
      double sum = 0.0D;
      int count = 0;
      Iterator var4 = $this$average.iterator();

      while(var4.hasNext()) {
         byte element = ((Number)var4.next()).byteValue();
         sum += (double)element;
         ++count;
         if (count < 0) {
            CollectionsKt.throwCountOverflow();
         }
      }

      return count == 0 ? Double.NaN : sum / (double)count;
   }

   @JvmName(
      name = "averageOfShort"
   )
   public static final double averageOfShort(@NotNull Sequence<Short> $this$average) {
      Intrinsics.checkNotNullParameter($this$average, "<this>");
      double sum = 0.0D;
      int count = 0;
      Iterator var4 = $this$average.iterator();

      while(var4.hasNext()) {
         short element = ((Number)var4.next()).shortValue();
         sum += (double)element;
         ++count;
         if (count < 0) {
            CollectionsKt.throwCountOverflow();
         }
      }

      return count == 0 ? Double.NaN : sum / (double)count;
   }

   @JvmName(
      name = "averageOfInt"
   )
   public static final double averageOfInt(@NotNull Sequence<Integer> $this$average) {
      Intrinsics.checkNotNullParameter($this$average, "<this>");
      double sum = 0.0D;
      int count = 0;
      Iterator var4 = $this$average.iterator();

      while(var4.hasNext()) {
         int element = ((Number)var4.next()).intValue();
         sum += (double)element;
         ++count;
         if (count < 0) {
            CollectionsKt.throwCountOverflow();
         }
      }

      return count == 0 ? Double.NaN : sum / (double)count;
   }

   @JvmName(
      name = "averageOfLong"
   )
   public static final double averageOfLong(@NotNull Sequence<Long> $this$average) {
      Intrinsics.checkNotNullParameter($this$average, "<this>");
      double sum = 0.0D;
      int count = 0;
      Iterator var4 = $this$average.iterator();

      while(var4.hasNext()) {
         long element = ((Number)var4.next()).longValue();
         sum += (double)element;
         ++count;
         if (count < 0) {
            CollectionsKt.throwCountOverflow();
         }
      }

      return count == 0 ? Double.NaN : sum / (double)count;
   }

   @JvmName(
      name = "averageOfFloat"
   )
   public static final double averageOfFloat(@NotNull Sequence<Float> $this$average) {
      Intrinsics.checkNotNullParameter($this$average, "<this>");
      double sum = 0.0D;
      int count = 0;
      Iterator var4 = $this$average.iterator();

      while(var4.hasNext()) {
         float element = ((Number)var4.next()).floatValue();
         sum += (double)element;
         ++count;
         if (count < 0) {
            CollectionsKt.throwCountOverflow();
         }
      }

      return count == 0 ? Double.NaN : sum / (double)count;
   }

   @JvmName(
      name = "averageOfDouble"
   )
   public static final double averageOfDouble(@NotNull Sequence<Double> $this$average) {
      Intrinsics.checkNotNullParameter($this$average, "<this>");
      double sum = 0.0D;
      int count = 0;
      Iterator var4 = $this$average.iterator();

      while(var4.hasNext()) {
         double element = ((Number)var4.next()).doubleValue();
         sum += element;
         ++count;
         if (count < 0) {
            CollectionsKt.throwCountOverflow();
         }
      }

      return count == 0 ? Double.NaN : sum / (double)count;
   }

   @JvmName(
      name = "sumOfByte"
   )
   public static final int sumOfByte(@NotNull Sequence<Byte> $this$sum) {
      Intrinsics.checkNotNullParameter($this$sum, "<this>");
      int sum = 0;

      byte element;
      for(Iterator var2 = $this$sum.iterator(); var2.hasNext(); sum += element) {
         element = ((Number)var2.next()).byteValue();
      }

      return sum;
   }

   @JvmName(
      name = "sumOfShort"
   )
   public static final int sumOfShort(@NotNull Sequence<Short> $this$sum) {
      Intrinsics.checkNotNullParameter($this$sum, "<this>");
      int sum = 0;

      short element;
      for(Iterator var2 = $this$sum.iterator(); var2.hasNext(); sum += element) {
         element = ((Number)var2.next()).shortValue();
      }

      return sum;
   }

   @JvmName(
      name = "sumOfInt"
   )
   public static final int sumOfInt(@NotNull Sequence<Integer> $this$sum) {
      Intrinsics.checkNotNullParameter($this$sum, "<this>");
      int sum = 0;

      int element;
      for(Iterator var2 = $this$sum.iterator(); var2.hasNext(); sum += element) {
         element = ((Number)var2.next()).intValue();
      }

      return sum;
   }

   @JvmName(
      name = "sumOfLong"
   )
   public static final long sumOfLong(@NotNull Sequence<Long> $this$sum) {
      Intrinsics.checkNotNullParameter($this$sum, "<this>");
      long sum = 0L;

      long element;
      for(Iterator var3 = $this$sum.iterator(); var3.hasNext(); sum += element) {
         element = ((Number)var3.next()).longValue();
      }

      return sum;
   }

   @JvmName(
      name = "sumOfFloat"
   )
   public static final float sumOfFloat(@NotNull Sequence<Float> $this$sum) {
      Intrinsics.checkNotNullParameter($this$sum, "<this>");
      float sum = 0.0F;

      float element;
      for(Iterator var2 = $this$sum.iterator(); var2.hasNext(); sum += element) {
         element = ((Number)var2.next()).floatValue();
      }

      return sum;
   }

   @JvmName(
      name = "sumOfDouble"
   )
   public static final double sumOfDouble(@NotNull Sequence<Double> $this$sum) {
      Intrinsics.checkNotNullParameter($this$sum, "<this>");
      double sum = 0.0D;

      double element;
      for(Iterator var3 = $this$sum.iterator(); var3.hasNext(); sum += element) {
         element = ((Number)var3.next()).doubleValue();
      }

      return sum;
   }

   private static final Object elementAt$lambda$0$SequencesKt___SequencesKt(int $index, int it) {
      throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + $index + '.');
   }

   private static final boolean filterIndexed$lambda$2$SequencesKt___SequencesKt(Function2 $predicate, IndexedValue it) {
      Intrinsics.checkNotNullParameter(it, "it");
      return (Boolean)$predicate.invoke(it.getIndex(), it.getValue());
   }

   private static final Object filterIndexed$lambda$3$SequencesKt___SequencesKt(IndexedValue it) {
      Intrinsics.checkNotNullParameter(it, "it");
      return it.getValue();
   }

   private static final boolean filterNotNull$lambda$5$SequencesKt___SequencesKt(Object it) {
      return it == null;
   }

   private static final Object distinct$lambda$13$SequencesKt___SequencesKt(Object it) {
      return it;
   }

   private static final Object onEach$lambda$14$SequencesKt___SequencesKt(Function1 $action, Object it) {
      $action.invoke(it);
      return it;
   }

   private static final Object onEachIndexed$lambda$15$SequencesKt___SequencesKt(Function2 $action, int index, Object element) {
      $action.invoke(index, element);
      return element;
   }

   private static final Object requireNoNulls$lambda$16$SequencesKt___SequencesKt(Sequence $this_requireNoNulls, Object it) {
      if (it == null) {
         throw new IllegalArgumentException("null element found in " + $this_requireNoNulls + '.');
      } else {
         return it;
      }
   }

   private static final Pair zip$lambda$17$SequencesKt___SequencesKt(Object t1, Object t2) {
      return TuplesKt.to(t1, t2);
   }

   private static final Pair zipWithNext$lambda$18$SequencesKt___SequencesKt(Object a, Object b) {
      return TuplesKt.to(a, b);
   }

   public SequencesKt___SequencesKt() {
   }
}
