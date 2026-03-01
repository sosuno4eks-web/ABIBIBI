package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.internal.HidesMembers;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class CollectionsKt___CollectionsKt extends CollectionsKt___CollectionsJvmKt {
   @InlineOnly
   private static final <T> T component1(List<? extends T> $this$component1) {
      Intrinsics.checkNotNullParameter($this$component1, "<this>");
      return $this$component1.get(0);
   }

   @InlineOnly
   private static final <T> T component2(List<? extends T> $this$component2) {
      Intrinsics.checkNotNullParameter($this$component2, "<this>");
      return $this$component2.get(1);
   }

   @InlineOnly
   private static final <T> T component3(List<? extends T> $this$component3) {
      Intrinsics.checkNotNullParameter($this$component3, "<this>");
      return $this$component3.get(2);
   }

   @InlineOnly
   private static final <T> T component4(List<? extends T> $this$component4) {
      Intrinsics.checkNotNullParameter($this$component4, "<this>");
      return $this$component4.get(3);
   }

   @InlineOnly
   private static final <T> T component5(List<? extends T> $this$component5) {
      Intrinsics.checkNotNullParameter($this$component5, "<this>");
      return $this$component5.get(4);
   }

   public static final <T> boolean contains(@NotNull Iterable<? extends T> $this$contains, T element) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      if ($this$contains instanceof Collection) {
         return ((Collection)$this$contains).contains(element);
      } else {
         return CollectionsKt.indexOf($this$contains, element) >= 0;
      }
   }

   public static final <T> T elementAt(@NotNull Iterable<? extends T> $this$elementAt, int index) {
      Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
      return $this$elementAt instanceof List ? ((List)$this$elementAt).get(index) : CollectionsKt.elementAtOrElse($this$elementAt, index, CollectionsKt___CollectionsKt::elementAt$lambda$0$CollectionsKt___CollectionsKt);
   }

   @InlineOnly
   private static final <T> T elementAt(List<? extends T> $this$elementAt, int index) {
      Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
      return $this$elementAt.get(index);
   }

   public static final <T> T elementAtOrElse(@NotNull Iterable<? extends T> $this$elementAtOrElse, int index, @NotNull Function1<? super Integer, ? extends T> defaultValue) {
      Intrinsics.checkNotNullParameter($this$elementAtOrElse, "<this>");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      if ($this$elementAtOrElse instanceof List) {
         List var6 = (List)$this$elementAtOrElse;
         return (0 <= index ? index < var6.size() : false) ? var6.get(index) : defaultValue.invoke(index);
      } else if (index < 0) {
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

   @InlineOnly
   private static final <T> T elementAtOrElse(List<? extends T> $this$elementAtOrElse, int index, Function1<? super Integer, ? extends T> defaultValue) {
      Intrinsics.checkNotNullParameter($this$elementAtOrElse, "<this>");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      return (0 <= index ? index < $this$elementAtOrElse.size() : false) ? $this$elementAtOrElse.get(index) : defaultValue.invoke(index);
   }

   @Nullable
   public static final <T> T elementAtOrNull(@NotNull Iterable<? extends T> $this$elementAtOrNull, int index) {
      Intrinsics.checkNotNullParameter($this$elementAtOrNull, "<this>");
      if ($this$elementAtOrNull instanceof List) {
         return CollectionsKt.getOrNull((List)$this$elementAtOrNull, index);
      } else if (index < 0) {
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
   private static final <T> T elementAtOrNull(List<? extends T> $this$elementAtOrNull, int index) {
      Intrinsics.checkNotNullParameter($this$elementAtOrNull, "<this>");
      return CollectionsKt.getOrNull($this$elementAtOrNull, index);
   }

   @InlineOnly
   private static final <T> T find(Iterable<? extends T> $this$find, Function1<? super T, Boolean> predicate) {
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
   private static final <T> T findLast(Iterable<? extends T> $this$findLast, Function1<? super T, Boolean> predicate) {
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

   @InlineOnly
   private static final <T> T findLast(List<? extends T> $this$findLast, Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$findLast, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$lastOrNull = false;
      ListIterator iterator$iv = $this$findLast.listIterator($this$findLast.size());

      Object var10000;
      while(true) {
         if (iterator$iv.hasPrevious()) {
            Object element$iv = iterator$iv.previous();
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

   public static final <T> T first(@NotNull Iterable<? extends T> $this$first) {
      Intrinsics.checkNotNullParameter($this$first, "<this>");
      if ($this$first instanceof List) {
         return CollectionsKt.first((List)$this$first);
      } else {
         Iterator iterator = $this$first.iterator();
         if (!iterator.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
         } else {
            return iterator.next();
         }
      }
   }

   public static final <T> T first(@NotNull List<? extends T> $this$first) {
      Intrinsics.checkNotNullParameter($this$first, "<this>");
      if ($this$first.isEmpty()) {
         throw new NoSuchElementException("List is empty.");
      } else {
         return $this$first.get(0);
      }
   }

   public static final <T> T first(@NotNull Iterable<? extends T> $this$first, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$first, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$first = false;
      Iterator var3 = $this$first.iterator();

      Object element;
      do {
         if (!var3.hasNext()) {
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
         }

         element = var3.next();
      } while(!(Boolean)predicate.invoke(element));

      return element;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final <T, R> R firstNotNullOf(Iterable<? extends T> $this$firstNotNullOf, Function1<? super T, ? extends R> transform) {
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
         throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
      } else {
         return var10000;
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final <T, R> R firstNotNullOfOrNull(Iterable<? extends T> $this$firstNotNullOfOrNull, Function1<? super T, ? extends R> transform) {
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
   public static final <T> T firstOrNull(@NotNull Iterable<? extends T> $this$firstOrNull) {
      Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
      if ($this$firstOrNull instanceof List) {
         return ((List)$this$firstOrNull).isEmpty() ? null : ((List)$this$firstOrNull).get(0);
      } else {
         Iterator iterator = $this$firstOrNull.iterator();
         return !iterator.hasNext() ? null : iterator.next();
      }
   }

   @Nullable
   public static final <T> T firstOrNull(@NotNull List<? extends T> $this$firstOrNull) {
      Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
      return $this$firstOrNull.isEmpty() ? null : $this$firstOrNull.get(0);
   }

   @Nullable
   public static final <T> T firstOrNull(@NotNull Iterable<? extends T> $this$firstOrNull, @NotNull Function1<? super T, Boolean> predicate) {
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

   @InlineOnly
   private static final <T> T getOrElse(List<? extends T> $this$getOrElse, int index, Function1<? super Integer, ? extends T> defaultValue) {
      Intrinsics.checkNotNullParameter($this$getOrElse, "<this>");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      return (0 <= index ? index < $this$getOrElse.size() : false) ? $this$getOrElse.get(index) : defaultValue.invoke(index);
   }

   @Nullable
   public static final <T> T getOrNull(@NotNull List<? extends T> $this$getOrNull, int index) {
      Intrinsics.checkNotNullParameter($this$getOrNull, "<this>");
      return (0 <= index ? index < $this$getOrNull.size() : false) ? $this$getOrNull.get(index) : null;
   }

   public static final <T> int indexOf(@NotNull Iterable<? extends T> $this$indexOf, T element) {
      Intrinsics.checkNotNullParameter($this$indexOf, "<this>");
      if ($this$indexOf instanceof List) {
         return ((List)$this$indexOf).indexOf(element);
      } else {
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
   }

   public static final <T> int indexOf(@NotNull List<? extends T> $this$indexOf, T element) {
      Intrinsics.checkNotNullParameter($this$indexOf, "<this>");
      return $this$indexOf.indexOf(element);
   }

   public static final <T> int indexOfFirst(@NotNull Iterable<? extends T> $this$indexOfFirst, @NotNull Function1<? super T, Boolean> predicate) {
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

   public static final <T> int indexOfFirst(@NotNull List<? extends T> $this$indexOfFirst, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$indexOfFirst, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$indexOfFirst = false;
      int index = 0;

      for(Iterator var4 = $this$indexOfFirst.iterator(); var4.hasNext(); ++index) {
         Object item = var4.next();
         if ((Boolean)predicate.invoke(item)) {
            return index;
         }
      }

      return -1;
   }

   public static final <T> int indexOfLast(@NotNull Iterable<? extends T> $this$indexOfLast, @NotNull Function1<? super T, Boolean> predicate) {
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

   public static final <T> int indexOfLast(@NotNull List<? extends T> $this$indexOfLast, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$indexOfLast, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$indexOfLast = false;
      ListIterator iterator = $this$indexOfLast.listIterator($this$indexOfLast.size());

      do {
         if (!iterator.hasPrevious()) {
            return -1;
         }
      } while(!(Boolean)predicate.invoke(iterator.previous()));

      return iterator.nextIndex();
   }

   public static final <T> T last(@NotNull Iterable<? extends T> $this$last) {
      Intrinsics.checkNotNullParameter($this$last, "<this>");
      if ($this$last instanceof List) {
         return CollectionsKt.last((List)$this$last);
      } else {
         Iterator iterator = $this$last.iterator();
         if (!iterator.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
         } else {
            Object last;
            for(last = iterator.next(); iterator.hasNext(); last = iterator.next()) {
            }

            return last;
         }
      }
   }

   public static final <T> T last(@NotNull List<? extends T> $this$last) {
      Intrinsics.checkNotNullParameter($this$last, "<this>");
      if ($this$last.isEmpty()) {
         throw new NoSuchElementException("List is empty.");
      } else {
         return $this$last.get(CollectionsKt.getLastIndex($this$last));
      }
   }

   public static final <T> T last(@NotNull Iterable<? extends T> $this$last, @NotNull Function1<? super T, Boolean> predicate) {
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
         throw new NoSuchElementException("Collection contains no element matching the predicate.");
      } else {
         return last;
      }
   }

   public static final <T> T last(@NotNull List<? extends T> $this$last, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$last, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$last = false;
      ListIterator iterator = $this$last.listIterator($this$last.size());

      Object element;
      do {
         if (!iterator.hasPrevious()) {
            throw new NoSuchElementException("List contains no element matching the predicate.");
         }

         element = iterator.previous();
      } while(!(Boolean)predicate.invoke(element));

      return element;
   }

   public static final <T> int lastIndexOf(@NotNull Iterable<? extends T> $this$lastIndexOf, T element) {
      Intrinsics.checkNotNullParameter($this$lastIndexOf, "<this>");
      if ($this$lastIndexOf instanceof List) {
         return ((List)$this$lastIndexOf).lastIndexOf(element);
      } else {
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
   }

   public static final <T> int lastIndexOf(@NotNull List<? extends T> $this$lastIndexOf, T element) {
      Intrinsics.checkNotNullParameter($this$lastIndexOf, "<this>");
      return $this$lastIndexOf.lastIndexOf(element);
   }

   @Nullable
   public static final <T> T lastOrNull(@NotNull Iterable<? extends T> $this$lastOrNull) {
      Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
      if ($this$lastOrNull instanceof List) {
         return ((List)$this$lastOrNull).isEmpty() ? null : ((List)$this$lastOrNull).get(((List)$this$lastOrNull).size() - 1);
      } else {
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
   }

   @Nullable
   public static final <T> T lastOrNull(@NotNull List<? extends T> $this$lastOrNull) {
      Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
      return $this$lastOrNull.isEmpty() ? null : $this$lastOrNull.get($this$lastOrNull.size() - 1);
   }

   @Nullable
   public static final <T> T lastOrNull(@NotNull Iterable<? extends T> $this$lastOrNull, @NotNull Function1<? super T, Boolean> predicate) {
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

   @Nullable
   public static final <T> T lastOrNull(@NotNull List<? extends T> $this$lastOrNull, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$lastOrNull = false;
      ListIterator iterator = $this$lastOrNull.listIterator($this$lastOrNull.size());

      Object element;
      do {
         if (!iterator.hasPrevious()) {
            return null;
         }

         element = iterator.previous();
      } while(!(Boolean)predicate.invoke(element));

      return element;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <T> T random(Collection<? extends T> $this$random) {
      Intrinsics.checkNotNullParameter($this$random, "<this>");
      return CollectionsKt.random($this$random, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.3"
   )
   public static final <T> T random(@NotNull Collection<? extends T> $this$random, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$random, "<this>");
      Intrinsics.checkNotNullParameter(random, "random");
      if ($this$random.isEmpty()) {
         throw new NoSuchElementException("Collection is empty.");
      } else {
         return CollectionsKt.elementAt((Iterable)$this$random, random.nextInt($this$random.size()));
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final <T> T randomOrNull(Collection<? extends T> $this$randomOrNull) {
      Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
      return CollectionsKt.randomOrNull($this$randomOrNull, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final <T> T randomOrNull(@NotNull Collection<? extends T> $this$randomOrNull, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
      Intrinsics.checkNotNullParameter(random, "random");
      return $this$randomOrNull.isEmpty() ? null : CollectionsKt.elementAt((Iterable)$this$randomOrNull, random.nextInt($this$randomOrNull.size()));
   }

   public static final <T> T single(@NotNull Iterable<? extends T> $this$single) {
      Intrinsics.checkNotNullParameter($this$single, "<this>");
      if ($this$single instanceof List) {
         return CollectionsKt.single((List)$this$single);
      } else {
         Iterator iterator = $this$single.iterator();
         if (!iterator.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
         } else {
            Object single = iterator.next();
            if (iterator.hasNext()) {
               throw new IllegalArgumentException("Collection has more than one element.");
            } else {
               return single;
            }
         }
      }
   }

   public static final <T> T single(@NotNull List<? extends T> $this$single) {
      Intrinsics.checkNotNullParameter($this$single, "<this>");
      switch($this$single.size()) {
      case 0:
         throw new NoSuchElementException("List is empty.");
      case 1:
         return $this$single.get(0);
      default:
         throw new IllegalArgumentException("List has more than one element.");
      }
   }

   public static final <T> T single(@NotNull Iterable<? extends T> $this$single, @NotNull Function1<? super T, Boolean> predicate) {
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
               throw new IllegalArgumentException("Collection contains more than one matching element.");
            }

            single = element;
            found = true;
         }
      }

      if (!found) {
         throw new NoSuchElementException("Collection contains no element matching the predicate.");
      } else {
         return single;
      }
   }

   @Nullable
   public static final <T> T singleOrNull(@NotNull Iterable<? extends T> $this$singleOrNull) {
      Intrinsics.checkNotNullParameter($this$singleOrNull, "<this>");
      if ($this$singleOrNull instanceof List) {
         return ((List)$this$singleOrNull).size() == 1 ? ((List)$this$singleOrNull).get(0) : null;
      } else {
         Iterator iterator = $this$singleOrNull.iterator();
         if (!iterator.hasNext()) {
            return null;
         } else {
            Object single = iterator.next();
            return iterator.hasNext() ? null : single;
         }
      }
   }

   @Nullable
   public static final <T> T singleOrNull(@NotNull List<? extends T> $this$singleOrNull) {
      Intrinsics.checkNotNullParameter($this$singleOrNull, "<this>");
      return $this$singleOrNull.size() == 1 ? $this$singleOrNull.get(0) : null;
   }

   @Nullable
   public static final <T> T singleOrNull(@NotNull Iterable<? extends T> $this$singleOrNull, @NotNull Function1<? super T, Boolean> predicate) {
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
   public static final <T> List<T> drop(@NotNull Iterable<? extends T> $this$drop, int n) {
      Intrinsics.checkNotNullParameter($this$drop, "<this>");
      if (n < 0) {
         int var6 = false;
         String var7 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var7.toString());
      } else if (n == 0) {
         return CollectionsKt.toList($this$drop);
      } else {
         ArrayList list = null;
         int count;
         Iterator var8;
         Object item;
         if ($this$drop instanceof Collection) {
            count = ((Collection)$this$drop).size() - n;
            if (count <= 0) {
               return CollectionsKt.emptyList();
            }

            if (count == 1) {
               return CollectionsKt.listOf(CollectionsKt.last($this$drop));
            }

            list = new ArrayList(count);
            if ($this$drop instanceof List) {
               if ($this$drop instanceof RandomAccess) {
                  int index = n;

                  for(int var5 = ((List)$this$drop).size(); index < var5; ++index) {
                     list.add(((List)$this$drop).get(index));
                  }
               } else {
                  var8 = (Iterator)((List)$this$drop).listIterator(n);

                  while(var8.hasNext()) {
                     item = var8.next();
                     list.add(item);
                  }
               }

               return (List)list;
            }
         } else {
            list = new ArrayList();
         }

         count = 0;
         var8 = $this$drop.iterator();

         while(var8.hasNext()) {
            item = var8.next();
            Comparable var10000;
            if (count >= n) {
               var10000 = (Comparable)list.add(item);
            } else {
               ++count;
               var10000 = (Comparable)count;
            }
         }

         return CollectionsKt.optimizeReadOnlyList((List)list);
      }
   }

   @NotNull
   public static final <T> List<T> dropLast(@NotNull List<? extends T> $this$dropLast, int n) {
      Intrinsics.checkNotNullParameter($this$dropLast, "<this>");
      if (n < 0) {
         int var2 = false;
         String var3 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var3.toString());
      } else {
         return CollectionsKt.take((Iterable)$this$dropLast, RangesKt.coerceAtLeast($this$dropLast.size() - n, 0));
      }
   }

   @NotNull
   public static final <T> List<T> dropLastWhile(@NotNull List<? extends T> $this$dropLastWhile, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$dropLastWhile, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$dropLastWhile = false;
      if (!$this$dropLastWhile.isEmpty()) {
         ListIterator iterator = $this$dropLastWhile.listIterator($this$dropLastWhile.size());

         while(iterator.hasPrevious()) {
            if (!(Boolean)predicate.invoke(iterator.previous())) {
               return CollectionsKt.take((Iterable)$this$dropLastWhile, iterator.nextIndex() + 1);
            }
         }
      }

      return CollectionsKt.emptyList();
   }

   @NotNull
   public static final <T> List<T> dropWhile(@NotNull Iterable<? extends T> $this$dropWhile, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$dropWhile, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$dropWhile = false;
      boolean yielding = false;
      ArrayList list = new ArrayList();
      Iterator var5 = $this$dropWhile.iterator();

      while(var5.hasNext()) {
         Object item = var5.next();
         if (yielding) {
            list.add(item);
         } else if (!(Boolean)predicate.invoke(item)) {
            list.add(item);
            yielding = true;
         }
      }

      return (List)list;
   }

   @NotNull
   public static final <T> List<T> filter(@NotNull Iterable<? extends T> $this$filter, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filter, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filter = false;
      Collection destination$iv = (Collection)(new ArrayList());
      int $i$f$filterTo = false;
      Iterator var6 = $this$filter.iterator();

      while(var6.hasNext()) {
         Object element$iv = var6.next();
         if ((Boolean)predicate.invoke(element$iv)) {
            destination$iv.add(element$iv);
         }
      }

      return (List)destination$iv;
   }

   @NotNull
   public static final <T> List<T> filterIndexed(@NotNull Iterable<? extends T> $this$filterIndexed, @NotNull Function2<? super Integer, ? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterIndexed, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filterIndexed = false;
      Collection destination$iv = (Collection)(new ArrayList());
      int $i$f$filterIndexedTo = false;
      int $i$f$forEachIndexed = false;
      int index$iv$iv = 0;
      Iterator var9 = $this$filterIndexed.iterator();

      while(var9.hasNext()) {
         Object item$iv$iv = var9.next();
         int var11 = index$iv$iv++;
         if (var11 < 0) {
            CollectionsKt.throwIndexOverflow();
         }

         int var14 = false;
         if ((Boolean)predicate.invoke(var11, item$iv$iv)) {
            destination$iv.add(item$iv$iv);
         }
      }

      return (List)destination$iv;
   }

   @NotNull
   public static final <T, C extends Collection<? super T>> C filterIndexedTo(@NotNull Iterable<? extends T> $this$filterIndexedTo, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, Boolean> predicate) {
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
   public static final <R> List<R> filterIsInstance(Iterable<?> $this$filterIsInstance) {
      Intrinsics.checkNotNullParameter($this$filterIsInstance, "<this>");
      int $i$f$filterIsInstance = false;
      Collection destination$iv = (Collection)(new ArrayList());
      int $i$f$filterIsInstanceTo = false;
      Iterator var5 = $this$filterIsInstance.iterator();

      while(var5.hasNext()) {
         Object element$iv = var5.next();
         Intrinsics.reifiedOperationMarker(3, "R");
         if (element$iv instanceof Object) {
            destination$iv.add(element$iv);
         }
      }

      return (List)destination$iv;
   }

   // $FF: synthetic method
   public static final <R, C extends Collection<? super R>> C filterIsInstanceTo(Iterable<?> $this$filterIsInstanceTo, C destination) {
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
   public static final <T> List<T> filterNot(@NotNull Iterable<? extends T> $this$filterNot, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterNot, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filterNot = false;
      Collection destination$iv = (Collection)(new ArrayList());
      int $i$f$filterNotTo = false;
      Iterator var6 = $this$filterNot.iterator();

      while(var6.hasNext()) {
         Object element$iv = var6.next();
         if (!(Boolean)predicate.invoke(element$iv)) {
            destination$iv.add(element$iv);
         }
      }

      return (List)destination$iv;
   }

   @NotNull
   public static final <T> List<T> filterNotNull(@NotNull Iterable<? extends T> $this$filterNotNull) {
      Intrinsics.checkNotNullParameter($this$filterNotNull, "<this>");
      return (List)CollectionsKt.filterNotNullTo($this$filterNotNull, (Collection)(new ArrayList()));
   }

   @NotNull
   public static final <C extends Collection<? super T>, T> C filterNotNullTo(@NotNull Iterable<? extends T> $this$filterNotNullTo, @NotNull C destination) {
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
   public static final <T, C extends Collection<? super T>> C filterNotTo(@NotNull Iterable<? extends T> $this$filterNotTo, @NotNull C destination, @NotNull Function1<? super T, Boolean> predicate) {
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
   public static final <T, C extends Collection<? super T>> C filterTo(@NotNull Iterable<? extends T> $this$filterTo, @NotNull C destination, @NotNull Function1<? super T, Boolean> predicate) {
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
   public static final <T> List<T> slice(@NotNull List<? extends T> $this$slice, @NotNull IntRange indices) {
      Intrinsics.checkNotNullParameter($this$slice, "<this>");
      Intrinsics.checkNotNullParameter(indices, "indices");
      return indices.isEmpty() ? CollectionsKt.emptyList() : CollectionsKt.toList((Iterable)$this$slice.subList(indices.getStart(), indices.getEndInclusive() + 1));
   }

   @NotNull
   public static final <T> List<T> slice(@NotNull List<? extends T> $this$slice, @NotNull Iterable<Integer> indices) {
      Intrinsics.checkNotNullParameter($this$slice, "<this>");
      Intrinsics.checkNotNullParameter(indices, "indices");
      int size = CollectionsKt.collectionSizeOrDefault(indices, 10);
      if (size == 0) {
         return CollectionsKt.emptyList();
      } else {
         ArrayList list = new ArrayList(size);
         Iterator var4 = indices.iterator();

         while(var4.hasNext()) {
            int index = ((Number)var4.next()).intValue();
            list.add($this$slice.get(index));
         }

         return (List)list;
      }
   }

   @NotNull
   public static final <T> List<T> take(@NotNull Iterable<? extends T> $this$take, int n) {
      Intrinsics.checkNotNullParameter($this$take, "<this>");
      if (n < 0) {
         int var6 = false;
         String var7 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var7.toString());
      } else if (n == 0) {
         return CollectionsKt.emptyList();
      } else {
         if ($this$take instanceof Collection) {
            if (n >= ((Collection)$this$take).size()) {
               return CollectionsKt.toList($this$take);
            }

            if (n == 1) {
               return CollectionsKt.listOf(CollectionsKt.first($this$take));
            }
         }

         int count = 0;
         ArrayList list = new ArrayList(n);
         Iterator var4 = $this$take.iterator();

         while(var4.hasNext()) {
            Object item = var4.next();
            list.add(item);
            ++count;
            if (count == n) {
               break;
            }
         }

         return CollectionsKt.optimizeReadOnlyList((List)list);
      }
   }

   @NotNull
   public static final <T> List<T> takeLast(@NotNull List<? extends T> $this$takeLast, int n) {
      Intrinsics.checkNotNullParameter($this$takeLast, "<this>");
      if (n < 0) {
         int var6 = false;
         String var7 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var7.toString());
      } else if (n == 0) {
         return CollectionsKt.emptyList();
      } else {
         int size = $this$takeLast.size();
         if (n >= size) {
            return CollectionsKt.toList((Iterable)$this$takeLast);
         } else if (n == 1) {
            return CollectionsKt.listOf(CollectionsKt.last($this$takeLast));
         } else {
            ArrayList list = new ArrayList(n);
            if ($this$takeLast instanceof RandomAccess) {
               for(int index = size - n; index < size; ++index) {
                  list.add($this$takeLast.get(index));
               }
            } else {
               Iterator var8 = (Iterator)$this$takeLast.listIterator(size - n);

               while(var8.hasNext()) {
                  Object item = var8.next();
                  list.add(item);
               }
            }

            return (List)list;
         }
      }
   }

   @NotNull
   public static final <T> List<T> takeLastWhile(@NotNull List<? extends T> $this$takeLastWhile, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$takeLastWhile, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$takeLastWhile = false;
      if ($this$takeLastWhile.isEmpty()) {
         return CollectionsKt.emptyList();
      } else {
         ListIterator iterator = $this$takeLastWhile.listIterator($this$takeLastWhile.size());

         do {
            if (!iterator.hasPrevious()) {
               return CollectionsKt.toList((Iterable)$this$takeLastWhile);
            }
         } while((Boolean)predicate.invoke(iterator.previous()));

         iterator.next();
         int expectedSize = $this$takeLastWhile.size() - iterator.nextIndex();
         if (expectedSize == 0) {
            return CollectionsKt.emptyList();
         } else {
            ArrayList var5 = new ArrayList(expectedSize);
            ArrayList $this$takeLastWhile_u24lambda_u246 = var5;
            boolean var7 = false;

            while(iterator.hasNext()) {
               $this$takeLastWhile_u24lambda_u246.add(iterator.next());
            }

            return (List)var5;
         }
      }
   }

   @NotNull
   public static final <T> List<T> takeWhile(@NotNull Iterable<? extends T> $this$takeWhile, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$takeWhile, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$takeWhile = false;
      ArrayList list = new ArrayList();
      Iterator var4 = $this$takeWhile.iterator();

      while(var4.hasNext()) {
         Object item = var4.next();
         if (!(Boolean)predicate.invoke(item)) {
            break;
         }

         list.add(item);
      }

      return (List)list;
   }

   @NotNull
   public static final <T> List<T> reversed(@NotNull Iterable<? extends T> $this$reversed) {
      Intrinsics.checkNotNullParameter($this$reversed, "<this>");
      if ($this$reversed instanceof Collection && ((Collection)$this$reversed).size() <= 1) {
         return CollectionsKt.toList($this$reversed);
      } else {
         List list = CollectionsKt.toMutableList($this$reversed);
         CollectionsKt.reverse(list);
         return list;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   public static final <T> void shuffle(@NotNull List<T> $this$shuffle, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$shuffle, "<this>");
      Intrinsics.checkNotNullParameter(random, "random");

      for(int i = CollectionsKt.getLastIndex($this$shuffle); 0 < i; --i) {
         int j = random.nextInt(i + 1);
         $this$shuffle.set(j, $this$shuffle.set(i, $this$shuffle.get(j)));
      }

   }

   public static final <T, R extends Comparable<? super R>> void sortBy(@NotNull List<T> $this$sortBy, @NotNull Function1<? super T, ? extends R> selector) {
      // $FF: Couldn't be decompiled
   }

   public static final <T, R extends Comparable<? super R>> void sortByDescending(@NotNull List<T> $this$sortByDescending, @NotNull Function1<? super T, ? extends R> selector) {
      // $FF: Couldn't be decompiled
   }

   public static final <T extends Comparable<? super T>> void sortDescending(@NotNull List<T> $this$sortDescending) {
      Intrinsics.checkNotNullParameter($this$sortDescending, "<this>");
      CollectionsKt.sortWith($this$sortDescending, ComparisonsKt.reverseOrder());
   }

   @NotNull
   public static final <T extends Comparable<? super T>> List<T> sorted(@NotNull Iterable<? extends T> $this$sorted) {
      Intrinsics.checkNotNullParameter($this$sorted, "<this>");
      boolean var3;
      if ($this$sorted instanceof Collection) {
         if (((Collection)$this$sorted).size() <= 1) {
            return CollectionsKt.toList($this$sorted);
         } else {
            Collection $this$toTypedArray$iv = (Collection)$this$sorted;
            int $i$f$toTypedArray = false;
            Object[] var5 = $this$toTypedArray$iv.toArray(new Comparable[0]);
            Comparable[] $this$sorted_u24lambda_u247 = (Comparable[])var5;
            var3 = false;
            ArraysKt.sort($this$sorted_u24lambda_u247);
            return ArraysKt.asList(var5);
         }
      } else {
         List var1 = CollectionsKt.toMutableList($this$sorted);
         var3 = false;
         CollectionsKt.sort(var1);
         return var1;
      }
   }

   @NotNull
   public static final <T, R extends Comparable<? super R>> List<T> sortedBy(@NotNull Iterable<? extends T> $this$sortedBy, @NotNull Function1<? super T, ? extends R> selector) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public static final <T, R extends Comparable<? super R>> List<T> sortedByDescending(@NotNull Iterable<? extends T> $this$sortedByDescending, @NotNull Function1<? super T, ? extends R> selector) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public static final <T extends Comparable<? super T>> List<T> sortedDescending(@NotNull Iterable<? extends T> $this$sortedDescending) {
      Intrinsics.checkNotNullParameter($this$sortedDescending, "<this>");
      return CollectionsKt.sortedWith($this$sortedDescending, ComparisonsKt.reverseOrder());
   }

   @NotNull
   public static final <T> List<T> sortedWith(@NotNull Iterable<? extends T> $this$sortedWith, @NotNull Comparator<? super T> comparator) {
      Intrinsics.checkNotNullParameter($this$sortedWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      boolean var4;
      if ($this$sortedWith instanceof Collection) {
         if (((Collection)$this$sortedWith).size() <= 1) {
            return CollectionsKt.toList($this$sortedWith);
         } else {
            Collection $this$toTypedArray$iv = (Collection)$this$sortedWith;
            int $i$f$toTypedArray = false;
            Object[] var6 = $this$toTypedArray$iv.toArray(new Object[0]);
            var4 = false;
            ArraysKt.sortWith(var6, comparator);
            return ArraysKt.asList(var6);
         }
      } else {
         List var2 = CollectionsKt.toMutableList($this$sortedWith);
         var4 = false;
         CollectionsKt.sortWith(var2, comparator);
         return var2;
      }
   }

   @NotNull
   public static final boolean[] toBooleanArray(@NotNull Collection<Boolean> $this$toBooleanArray) {
      Intrinsics.checkNotNullParameter($this$toBooleanArray, "<this>");
      boolean[] result = new boolean[$this$toBooleanArray.size()];
      int index = 0;

      boolean element;
      for(Iterator var3 = $this$toBooleanArray.iterator(); var3.hasNext(); result[index++] = element) {
         element = (Boolean)var3.next();
      }

      return result;
   }

   @NotNull
   public static final byte[] toByteArray(@NotNull Collection<Byte> $this$toByteArray) {
      Intrinsics.checkNotNullParameter($this$toByteArray, "<this>");
      byte[] result = new byte[$this$toByteArray.size()];
      int index = 0;

      byte element;
      for(Iterator var3 = $this$toByteArray.iterator(); var3.hasNext(); result[index++] = element) {
         element = ((Number)var3.next()).byteValue();
      }

      return result;
   }

   @NotNull
   public static final char[] toCharArray(@NotNull Collection<Character> $this$toCharArray) {
      Intrinsics.checkNotNullParameter($this$toCharArray, "<this>");
      char[] result = new char[$this$toCharArray.size()];
      int index = 0;

      char element;
      for(Iterator var3 = $this$toCharArray.iterator(); var3.hasNext(); result[index++] = element) {
         element = (Character)var3.next();
      }

      return result;
   }

   @NotNull
   public static final double[] toDoubleArray(@NotNull Collection<Double> $this$toDoubleArray) {
      Intrinsics.checkNotNullParameter($this$toDoubleArray, "<this>");
      double[] result = new double[$this$toDoubleArray.size()];
      int index = 0;

      double element;
      for(Iterator var3 = $this$toDoubleArray.iterator(); var3.hasNext(); result[index++] = element) {
         element = ((Number)var3.next()).doubleValue();
      }

      return result;
   }

   @NotNull
   public static final float[] toFloatArray(@NotNull Collection<Float> $this$toFloatArray) {
      Intrinsics.checkNotNullParameter($this$toFloatArray, "<this>");
      float[] result = new float[$this$toFloatArray.size()];
      int index = 0;

      float element;
      for(Iterator var3 = $this$toFloatArray.iterator(); var3.hasNext(); result[index++] = element) {
         element = ((Number)var3.next()).floatValue();
      }

      return result;
   }

   @NotNull
   public static final int[] toIntArray(@NotNull Collection<Integer> $this$toIntArray) {
      Intrinsics.checkNotNullParameter($this$toIntArray, "<this>");
      int[] result = new int[$this$toIntArray.size()];
      int index = 0;

      int element;
      for(Iterator var3 = $this$toIntArray.iterator(); var3.hasNext(); result[index++] = element) {
         element = ((Number)var3.next()).intValue();
      }

      return result;
   }

   @NotNull
   public static final long[] toLongArray(@NotNull Collection<Long> $this$toLongArray) {
      Intrinsics.checkNotNullParameter($this$toLongArray, "<this>");
      long[] result = new long[$this$toLongArray.size()];
      int index = 0;

      long element;
      for(Iterator var3 = $this$toLongArray.iterator(); var3.hasNext(); result[index++] = element) {
         element = ((Number)var3.next()).longValue();
      }

      return result;
   }

   @NotNull
   public static final short[] toShortArray(@NotNull Collection<Short> $this$toShortArray) {
      Intrinsics.checkNotNullParameter($this$toShortArray, "<this>");
      short[] result = new short[$this$toShortArray.size()];
      int index = 0;

      short element;
      for(Iterator var3 = $this$toShortArray.iterator(); var3.hasNext(); result[index++] = element) {
         element = ((Number)var3.next()).shortValue();
      }

      return result;
   }

   @NotNull
   public static final <T, K, V> Map<K, V> associate(@NotNull Iterable<? extends T> $this$associate, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
      Intrinsics.checkNotNullParameter($this$associate, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$associate = false;
      int capacity = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associate, 10)), 16);
      Map destination$iv = (Map)(new LinkedHashMap(capacity));
      int $i$f$associateTo = false;
      Iterator var7 = $this$associate.iterator();

      while(var7.hasNext()) {
         Object element$iv = var7.next();
         Pair var10 = (Pair)transform.invoke(element$iv);
         destination$iv.put(var10.getFirst(), var10.getSecond());
      }

      return destination$iv;
   }

   @NotNull
   public static final <T, K> Map<K, T> associateBy(@NotNull Iterable<? extends T> $this$associateBy, @NotNull Function1<? super T, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter($this$associateBy, "<this>");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      int $i$f$associateBy = false;
      int capacity = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateBy, 10)), 16);
      Map destination$iv = (Map)(new LinkedHashMap(capacity));
      int $i$f$associateByTo = false;
      Iterator var7 = $this$associateBy.iterator();

      while(var7.hasNext()) {
         Object element$iv = var7.next();
         destination$iv.put(keySelector.invoke(element$iv), element$iv);
      }

      return destination$iv;
   }

   @NotNull
   public static final <T, K, V> Map<K, V> associateBy(@NotNull Iterable<? extends T> $this$associateBy, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
      Intrinsics.checkNotNullParameter($this$associateBy, "<this>");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
      int $i$f$associateBy = false;
      int capacity = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateBy, 10)), 16);
      Map destination$iv = (Map)(new LinkedHashMap(capacity));
      int $i$f$associateByTo = false;
      Iterator var8 = $this$associateBy.iterator();

      while(var8.hasNext()) {
         Object element$iv = var8.next();
         destination$iv.put(keySelector.invoke(element$iv), valueTransform.invoke(element$iv));
      }

      return destination$iv;
   }

   @NotNull
   public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(@NotNull Iterable<? extends T> $this$associateByTo, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector) {
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
   public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull Iterable<? extends T> $this$associateByTo, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
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
   public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull Iterable<? extends T> $this$associateTo, @NotNull M destination, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
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
   public static final <K, V> Map<K, V> associateWith(@NotNull Iterable<? extends K> $this$associateWith, @NotNull Function1<? super K, ? extends V> valueSelector) {
      Intrinsics.checkNotNullParameter($this$associateWith, "<this>");
      Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
      int $i$f$associateWith = false;
      LinkedHashMap result = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateWith, 10)), 16));
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
   public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(@NotNull Iterable<? extends K> $this$associateWithTo, @NotNull M destination, @NotNull Function1<? super K, ? extends V> valueSelector) {
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
   public static final <T, C extends Collection<? super T>> C toCollection(@NotNull Iterable<? extends T> $this$toCollection, @NotNull C destination) {
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
   public static final <T> HashSet<T> toHashSet(@NotNull Iterable<? extends T> $this$toHashSet) {
      Intrinsics.checkNotNullParameter($this$toHashSet, "<this>");
      return (HashSet)CollectionsKt.toCollection($this$toHashSet, (Collection)(new HashSet(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$toHashSet, 12)))));
   }

   @NotNull
   public static final <T> List<T> toList(@NotNull Iterable<? extends T> $this$toList) {
      Intrinsics.checkNotNullParameter($this$toList, "<this>");
      if ($this$toList instanceof Collection) {
         List var10000;
         switch(((Collection)$this$toList).size()) {
         case 0:
            var10000 = CollectionsKt.emptyList();
            break;
         case 1:
            var10000 = CollectionsKt.listOf($this$toList instanceof List ? ((List)$this$toList).get(0) : ((Collection)$this$toList).iterator().next());
            break;
         default:
            var10000 = CollectionsKt.toMutableList((Collection)$this$toList);
         }

         return var10000;
      } else {
         return CollectionsKt.optimizeReadOnlyList(CollectionsKt.toMutableList($this$toList));
      }
   }

   @NotNull
   public static final <T> List<T> toMutableList(@NotNull Iterable<? extends T> $this$toMutableList) {
      Intrinsics.checkNotNullParameter($this$toMutableList, "<this>");
      return $this$toMutableList instanceof Collection ? CollectionsKt.toMutableList((Collection)$this$toMutableList) : (List)CollectionsKt.toCollection($this$toMutableList, (Collection)(new ArrayList()));
   }

   @NotNull
   public static final <T> List<T> toMutableList(@NotNull Collection<? extends T> $this$toMutableList) {
      Intrinsics.checkNotNullParameter($this$toMutableList, "<this>");
      return (List)(new ArrayList($this$toMutableList));
   }

   @NotNull
   public static final <T> Set<T> toSet(@NotNull Iterable<? extends T> $this$toSet) {
      Intrinsics.checkNotNullParameter($this$toSet, "<this>");
      if ($this$toSet instanceof Collection) {
         Set var10000;
         switch(((Collection)$this$toSet).size()) {
         case 0:
            var10000 = SetsKt.emptySet();
            break;
         case 1:
            var10000 = SetsKt.setOf($this$toSet instanceof List ? ((List)$this$toSet).get(0) : ((Collection)$this$toSet).iterator().next());
            break;
         default:
            var10000 = (Set)CollectionsKt.toCollection($this$toSet, (Collection)(new LinkedHashSet(MapsKt.mapCapacity(((Collection)$this$toSet).size()))));
         }

         return var10000;
      } else {
         return SetsKt.optimizeReadOnlySet((Set)CollectionsKt.toCollection($this$toSet, (Collection)(new LinkedHashSet())));
      }
   }

   @NotNull
   public static final <T, R> List<R> flatMap(@NotNull Iterable<? extends T> $this$flatMap, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMap, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$flatMap = false;
      Collection destination$iv = (Collection)(new ArrayList());
      int $i$f$flatMapTo = false;
      Iterator var6 = $this$flatMap.iterator();

      while(var6.hasNext()) {
         Object element$iv = var6.next();
         Iterable list$iv = (Iterable)transform.invoke(element$iv);
         CollectionsKt.addAll(destination$iv, list$iv);
      }

      return (List)destination$iv;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "flatMapSequence"
   )
   @NotNull
   public static final <T, R> List<R> flatMapSequence(@NotNull Iterable<? extends T> $this$flatMap, @NotNull Function1<? super T, ? extends Sequence<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMap, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$flatMapSequence = false;
      Collection destination$iv = (Collection)(new ArrayList());
      int $i$f$flatMapSequenceTo = false;
      Iterator var6 = $this$flatMap.iterator();

      while(var6.hasNext()) {
         Object element$iv = var6.next();
         Sequence list$iv = (Sequence)transform.invoke(element$iv);
         CollectionsKt.addAll(destination$iv, list$iv);
      }

      return (List)destination$iv;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "flatMapIndexedIterable"
   )
   @InlineOnly
   private static final <T, R> List<R> flatMapIndexedIterable(Iterable<? extends T> $this$flatMapIndexed, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapIndexed, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      Collection var3 = (Collection)(new ArrayList());
      int var4 = 0;

      Object var6;
      int var7;
      for(Iterator var5 = $this$flatMapIndexed.iterator(); var5.hasNext(); CollectionsKt.addAll(var3, (Iterable)transform.invoke(var7, var6))) {
         var6 = var5.next();
         var7 = var4++;
         if (var7 < 0) {
            CollectionsKt.throwIndexOverflow();
         }
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "flatMapIndexedSequence"
   )
   @InlineOnly
   private static final <T, R> List<R> flatMapIndexedSequence(Iterable<? extends T> $this$flatMapIndexed, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapIndexed, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      Collection var3 = (Collection)(new ArrayList());
      int var4 = 0;

      Object var6;
      int var7;
      for(Iterator var5 = $this$flatMapIndexed.iterator(); var5.hasNext(); CollectionsKt.addAll(var3, (Sequence)transform.invoke(var7, var6))) {
         var6 = var5.next();
         var7 = var4++;
         if (var7 < 0) {
            CollectionsKt.throwIndexOverflow();
         }
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "flatMapIndexedIterableTo"
   )
   @InlineOnly
   private static final <T, R, C extends Collection<? super R>> C flatMapIndexedIterableTo(Iterable<? extends T> $this$flatMapIndexedTo, C destination, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
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
   private static final <T, R, C extends Collection<? super R>> C flatMapIndexedSequenceTo(Iterable<? extends T> $this$flatMapIndexedTo, C destination, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
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

   @NotNull
   public static final <T, R, C extends Collection<? super R>> C flatMapTo(@NotNull Iterable<? extends T> $this$flatMapTo, @NotNull C destination, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$flatMapTo = false;
      Iterator var4 = $this$flatMapTo.iterator();

      while(var4.hasNext()) {
         Object element = var4.next();
         Iterable list = (Iterable)transform.invoke(element);
         CollectionsKt.addAll(destination, list);
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "flatMapSequenceTo"
   )
   @NotNull
   public static final <T, R, C extends Collection<? super R>> C flatMapSequenceTo(@NotNull Iterable<? extends T> $this$flatMapTo, @NotNull C destination, @NotNull Function1<? super T, ? extends Sequence<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$flatMapSequenceTo = false;
      Iterator var4 = $this$flatMapTo.iterator();

      while(var4.hasNext()) {
         Object element = var4.next();
         Sequence list = (Sequence)transform.invoke(element);
         CollectionsKt.addAll(destination, list);
      }

      return destination;
   }

   @NotNull
   public static final <T, K> Map<K, List<T>> groupBy(@NotNull Iterable<? extends T> $this$groupBy, @NotNull Function1<? super T, ? extends K> keySelector) {
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
   public static final <T, K, V> Map<K, List<V>> groupBy(@NotNull Iterable<? extends T> $this$groupBy, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
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
   public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(@NotNull Iterable<? extends T> $this$groupByTo, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector) {
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
   public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull Iterable<? extends T> $this$groupByTo, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
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
   public static final <T, K> Grouping<T, K> groupingBy(@NotNull Iterable<? extends T> $this$groupingBy, @NotNull Function1<? super T, ? extends K> keySelector) {
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
   public static final <T, R> List<R> map(@NotNull Iterable<? extends T> $this$map, @NotNull Function1<? super T, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$map, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$map = false;
      Collection destination$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map, 10)));
      int $i$f$mapTo = false;
      Iterator var6 = $this$map.iterator();

      while(var6.hasNext()) {
         Object item$iv = var6.next();
         destination$iv.add(transform.invoke(item$iv));
      }

      return (List)destination$iv;
   }

   @NotNull
   public static final <T, R> List<R> mapIndexed(@NotNull Iterable<? extends T> $this$mapIndexed, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapIndexed, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapIndexed = false;
      Collection destination$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$mapIndexed, 10)));
      int $i$f$mapIndexedTo = false;
      int index$iv = 0;

      Object item$iv;
      int var9;
      for(Iterator var7 = $this$mapIndexed.iterator(); var7.hasNext(); destination$iv.add(transform.invoke(var9, item$iv))) {
         item$iv = var7.next();
         var9 = index$iv++;
         if (var9 < 0) {
            CollectionsKt.throwIndexOverflow();
         }
      }

      return (List)destination$iv;
   }

   @NotNull
   public static final <T, R> List<R> mapIndexedNotNull(@NotNull Iterable<? extends T> $this$mapIndexedNotNull, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapIndexedNotNull, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapIndexedNotNull = false;
      Collection destination$iv = (Collection)(new ArrayList());
      int $i$f$mapIndexedNotNullTo = false;
      int $i$f$forEachIndexed = false;
      int index$iv$iv = 0;
      Iterator var9 = $this$mapIndexedNotNull.iterator();

      while(var9.hasNext()) {
         Object item$iv$iv = var9.next();
         int var11 = index$iv$iv++;
         if (var11 < 0) {
            CollectionsKt.throwIndexOverflow();
         }

         int var14 = false;
         Object var17 = transform.invoke(var11, item$iv$iv);
         if (var17 != null) {
            Object it$iv = var17;
            int var16 = false;
            destination$iv.add(it$iv);
         }
      }

      return (List)destination$iv;
   }

   @NotNull
   public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(@NotNull Iterable<? extends T> $this$mapIndexedNotNullTo, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
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
   public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(@NotNull Iterable<? extends T> $this$mapIndexedTo, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
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
   public static final <T, R> List<R> mapNotNull(@NotNull Iterable<? extends T> $this$mapNotNull, @NotNull Function1<? super T, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapNotNull, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapNotNull = false;
      Collection destination$iv = (Collection)(new ArrayList());
      int $i$f$mapNotNullTo = false;
      int $i$f$forEach = false;
      Iterator var8 = $this$mapNotNull.iterator();

      while(var8.hasNext()) {
         Object element$iv$iv = var8.next();
         int var11 = false;
         Object var10000 = transform.invoke(element$iv$iv);
         if (var10000 != null) {
            Object it$iv = var10000;
            int var13 = false;
            destination$iv.add(it$iv);
         }
      }

      return (List)destination$iv;
   }

   @NotNull
   public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(@NotNull Iterable<? extends T> $this$mapNotNullTo, @NotNull C destination, @NotNull Function1<? super T, ? extends R> transform) {
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
   public static final <T, R, C extends Collection<? super R>> C mapTo(@NotNull Iterable<? extends T> $this$mapTo, @NotNull C destination, @NotNull Function1<? super T, ? extends R> transform) {
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
   public static final <T> Iterable<IndexedValue<T>> withIndex(@NotNull Iterable<? extends T> $this$withIndex) {
      Intrinsics.checkNotNullParameter($this$withIndex, "<this>");
      return (Iterable)(new IndexingIterable(CollectionsKt___CollectionsKt::withIndex$lambda$17$CollectionsKt___CollectionsKt));
   }

   @NotNull
   public static final <T> List<T> distinct(@NotNull Iterable<? extends T> $this$distinct) {
      Intrinsics.checkNotNullParameter($this$distinct, "<this>");
      return CollectionsKt.toList((Iterable)CollectionsKt.toMutableSet($this$distinct));
   }

   @NotNull
   public static final <T, K> List<T> distinctBy(@NotNull Iterable<? extends T> $this$distinctBy, @NotNull Function1<? super T, ? extends K> selector) {
      Intrinsics.checkNotNullParameter($this$distinctBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$distinctBy = false;
      HashSet set = new HashSet();
      ArrayList list = new ArrayList();
      Iterator var5 = $this$distinctBy.iterator();

      while(var5.hasNext()) {
         Object e = var5.next();
         Object key = selector.invoke(e);
         if (set.add(key)) {
            list.add(e);
         }
      }

      return (List)list;
   }

   @NotNull
   public static final <T> Set<T> intersect(@NotNull Iterable<? extends T> $this$intersect, @NotNull Iterable<? extends T> other) {
      Intrinsics.checkNotNullParameter($this$intersect, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      Set set = CollectionsKt.toMutableSet($this$intersect);
      CollectionsKt.retainAll((Collection)set, other);
      return set;
   }

   @NotNull
   public static final <T> Set<T> subtract(@NotNull Iterable<? extends T> $this$subtract, @NotNull Iterable<? extends T> other) {
      Intrinsics.checkNotNullParameter($this$subtract, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      Set set = CollectionsKt.toMutableSet($this$subtract);
      CollectionsKt.removeAll((Collection)set, other);
      return set;
   }

   @NotNull
   public static final <T> Set<T> toMutableSet(@NotNull Iterable<? extends T> $this$toMutableSet) {
      Intrinsics.checkNotNullParameter($this$toMutableSet, "<this>");
      return $this$toMutableSet instanceof Collection ? (Set)(new LinkedHashSet((Collection)$this$toMutableSet)) : (Set)CollectionsKt.toCollection($this$toMutableSet, (Collection)(new LinkedHashSet()));
   }

   @NotNull
   public static final <T> Set<T> union(@NotNull Iterable<? extends T> $this$union, @NotNull Iterable<? extends T> other) {
      Intrinsics.checkNotNullParameter($this$union, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      Set set = CollectionsKt.toMutableSet($this$union);
      CollectionsKt.addAll((Collection)set, other);
      return set;
   }

   public static final <T> boolean all(@NotNull Iterable<? extends T> $this$all, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$all, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$all = false;
      if ($this$all instanceof Collection && ((Collection)$this$all).isEmpty()) {
         return true;
      } else {
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
   }

   public static final <T> boolean any(@NotNull Iterable<? extends T> $this$any) {
      Intrinsics.checkNotNullParameter($this$any, "<this>");
      if ($this$any instanceof Collection) {
         return !((Collection)$this$any).isEmpty();
      } else {
         return $this$any.iterator().hasNext();
      }
   }

   public static final <T> boolean any(@NotNull Iterable<? extends T> $this$any, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$any, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$any = false;
      if ($this$any instanceof Collection && ((Collection)$this$any).isEmpty()) {
         return false;
      } else {
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
   }

   public static final <T> int count(@NotNull Iterable<? extends T> $this$count) {
      Intrinsics.checkNotNullParameter($this$count, "<this>");
      if ($this$count instanceof Collection) {
         return ((Collection)$this$count).size();
      } else {
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
   }

   @InlineOnly
   private static final <T> int count(Collection<? extends T> $this$count) {
      Intrinsics.checkNotNullParameter($this$count, "<this>");
      return $this$count.size();
   }

   public static final <T> int count(@NotNull Iterable<? extends T> $this$count, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$count, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$count = false;
      if ($this$count instanceof Collection && ((Collection)$this$count).isEmpty()) {
         return 0;
      } else {
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
   }

   public static final <T, R> R fold(@NotNull Iterable<? extends T> $this$fold, R initial, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
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

   public static final <T, R> R foldIndexed(@NotNull Iterable<? extends T> $this$foldIndexed, R initial, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
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

   public static final <T, R> R foldRight(@NotNull List<? extends T> $this$foldRight, R initial, @NotNull Function2<? super T, ? super R, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$foldRight, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$foldRight = false;
      Object accumulator = initial;
      if (!$this$foldRight.isEmpty()) {
         for(ListIterator iterator = $this$foldRight.listIterator($this$foldRight.size()); iterator.hasPrevious(); accumulator = operation.invoke(iterator.previous(), accumulator)) {
         }
      }

      return accumulator;
   }

   public static final <T, R> R foldRightIndexed(@NotNull List<? extends T> $this$foldRightIndexed, R initial, @NotNull Function3<? super Integer, ? super T, ? super R, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$foldRightIndexed, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$foldRightIndexed = false;
      Object accumulator = initial;
      int index;
      if (!$this$foldRightIndexed.isEmpty()) {
         for(ListIterator iterator = $this$foldRightIndexed.listIterator($this$foldRightIndexed.size()); iterator.hasPrevious(); accumulator = operation.invoke(index, iterator.previous(), accumulator)) {
            index = iterator.previousIndex();
         }
      }

      return accumulator;
   }

   @HidesMembers
   public static final <T> void forEach(@NotNull Iterable<? extends T> $this$forEach, @NotNull Function1<? super T, Unit> action) {
      Intrinsics.checkNotNullParameter($this$forEach, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      int $i$f$forEach = false;
      Iterator var3 = $this$forEach.iterator();

      while(var3.hasNext()) {
         Object element = var3.next();
         action.invoke(element);
      }

   }

   public static final <T> void forEachIndexed(@NotNull Iterable<? extends T> $this$forEachIndexed, @NotNull Function2<? super Integer, ? super T, Unit> action) {
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
   public static final double maxOrThrow(@NotNull Iterable<Double> $this$max) {
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
   public static final float maxOrThrow(@NotNull Iterable<Float> $this$max) {
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
   public static final <T extends Comparable<? super T>> T maxOrThrow(@NotNull Iterable<? extends T> $this$max) {
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
   public static final <T, R extends Comparable<? super R>> T maxByOrThrow(@NotNull Iterable<? extends T> $this$maxBy, @NotNull Function1<? super T, ? extends R> selector) {
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
   public static final <T, R extends Comparable<? super R>> T maxByOrNull(@NotNull Iterable<? extends T> $this$maxByOrNull, @NotNull Function1<? super T, ? extends R> selector) {
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
   private static final <T> double maxOf(Iterable<? extends T> $this$maxOf, Function1<? super T, Double> selector) {
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
   private static final <T> float maxOf(Iterable<? extends T> $this$maxOf, Function1<? super T, Float> selector) {
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
   private static final <T, R extends Comparable<? super R>> R maxOf(Iterable<? extends T> $this$maxOf, Function1<? super T, ? extends R> selector) {
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
   private static final <T> Double maxOfOrNull(Iterable<? extends T> $this$maxOfOrNull, Function1<? super T, Double> selector) {
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
   private static final <T> Float maxOfOrNull(Iterable<? extends T> $this$maxOfOrNull, Function1<? super T, Float> selector) {
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
   private static final <T, R extends Comparable<? super R>> R maxOfOrNull(Iterable<? extends T> $this$maxOfOrNull, Function1<? super T, ? extends R> selector) {
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
   private static final <T, R> R maxOfWith(Iterable<? extends T> $this$maxOfWith, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
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
   private static final <T, R> R maxOfWithOrNull(Iterable<? extends T> $this$maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
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
   public static final Double maxOrNull(@NotNull Iterable<Double> $this$maxOrNull) {
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
   public static final Float maxOrNull(@NotNull Iterable<Float> $this$maxOrNull) {
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
   public static final <T extends Comparable<? super T>> T maxOrNull(@NotNull Iterable<? extends T> $this$maxOrNull) {
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
   public static final <T> T maxWithOrThrow(@NotNull Iterable<? extends T> $this$maxWith, @NotNull Comparator<? super T> comparator) {
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
   public static final <T> T maxWithOrNull(@NotNull Iterable<? extends T> $this$maxWithOrNull, @NotNull Comparator<? super T> comparator) {
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
   public static final double minOrThrow(@NotNull Iterable<Double> $this$min) {
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
   public static final float minOrThrow(@NotNull Iterable<Float> $this$min) {
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
   public static final <T extends Comparable<? super T>> T minOrThrow(@NotNull Iterable<? extends T> $this$min) {
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
   public static final <T, R extends Comparable<? super R>> T minByOrThrow(@NotNull Iterable<? extends T> $this$minBy, @NotNull Function1<? super T, ? extends R> selector) {
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
   public static final <T, R extends Comparable<? super R>> T minByOrNull(@NotNull Iterable<? extends T> $this$minByOrNull, @NotNull Function1<? super T, ? extends R> selector) {
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
   private static final <T> double minOf(Iterable<? extends T> $this$minOf, Function1<? super T, Double> selector) {
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
   private static final <T> float minOf(Iterable<? extends T> $this$minOf, Function1<? super T, Float> selector) {
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
   private static final <T, R extends Comparable<? super R>> R minOf(Iterable<? extends T> $this$minOf, Function1<? super T, ? extends R> selector) {
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
   private static final <T> Double minOfOrNull(Iterable<? extends T> $this$minOfOrNull, Function1<? super T, Double> selector) {
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
   private static final <T> Float minOfOrNull(Iterable<? extends T> $this$minOfOrNull, Function1<? super T, Float> selector) {
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
   private static final <T, R extends Comparable<? super R>> R minOfOrNull(Iterable<? extends T> $this$minOfOrNull, Function1<? super T, ? extends R> selector) {
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
   private static final <T, R> R minOfWith(Iterable<? extends T> $this$minOfWith, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
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
   private static final <T, R> R minOfWithOrNull(Iterable<? extends T> $this$minOfWithOrNull, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
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
   public static final Double minOrNull(@NotNull Iterable<Double> $this$minOrNull) {
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
   public static final Float minOrNull(@NotNull Iterable<Float> $this$minOrNull) {
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
   public static final <T extends Comparable<? super T>> T minOrNull(@NotNull Iterable<? extends T> $this$minOrNull) {
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
   public static final <T> T minWithOrThrow(@NotNull Iterable<? extends T> $this$minWith, @NotNull Comparator<? super T> comparator) {
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
   public static final <T> T minWithOrNull(@NotNull Iterable<? extends T> $this$minWithOrNull, @NotNull Comparator<? super T> comparator) {
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

   public static final <T> boolean none(@NotNull Iterable<? extends T> $this$none) {
      Intrinsics.checkNotNullParameter($this$none, "<this>");
      if ($this$none instanceof Collection) {
         return ((Collection)$this$none).isEmpty();
      } else {
         return !$this$none.iterator().hasNext();
      }
   }

   public static final <T> boolean none(@NotNull Iterable<? extends T> $this$none, @NotNull Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$none, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$none = false;
      if ($this$none instanceof Collection && ((Collection)$this$none).isEmpty()) {
         return true;
      } else {
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
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <T, C extends Iterable<? extends T>> C onEach(@NotNull C $this$onEach, @NotNull Function1<? super T, Unit> action) {
      Intrinsics.checkNotNullParameter($this$onEach, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      int $i$f$onEach = false;
      int var5 = false;
      Iterator var6 = $this$onEach.iterator();

      while(var6.hasNext()) {
         Object element = var6.next();
         action.invoke(element);
      }

      return $this$onEach;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <T, C extends Iterable<? extends T>> C onEachIndexed(@NotNull C $this$onEachIndexed, @NotNull Function2<? super Integer, ? super T, Unit> action) {
      Intrinsics.checkNotNullParameter($this$onEachIndexed, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      int $i$f$onEachIndexed = false;
      int var5 = false;
      int $i$f$forEachIndexed = false;
      int index$iv = 0;

      Object item$iv;
      int var11;
      for(Iterator var9 = $this$onEachIndexed.iterator(); var9.hasNext(); action.invoke(var11, item$iv)) {
         item$iv = var9.next();
         var11 = index$iv++;
         if (var11 < 0) {
            CollectionsKt.throwIndexOverflow();
         }
      }

      return $this$onEachIndexed;
   }

   public static final <S, T extends S> S reduce(@NotNull Iterable<? extends T> $this$reduce, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
      Intrinsics.checkNotNullParameter($this$reduce, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$reduce = false;
      Iterator iterator = $this$reduce.iterator();
      if (!iterator.hasNext()) {
         throw new UnsupportedOperationException("Empty collection can't be reduced.");
      } else {
         Object accumulator;
         for(accumulator = iterator.next(); iterator.hasNext(); accumulator = operation.invoke(accumulator, iterator.next())) {
         }

         return accumulator;
      }
   }

   public static final <S, T extends S> S reduceIndexed(@NotNull Iterable<? extends T> $this$reduceIndexed, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
      Intrinsics.checkNotNullParameter($this$reduceIndexed, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$reduceIndexed = false;
      Iterator iterator = $this$reduceIndexed.iterator();
      if (!iterator.hasNext()) {
         throw new UnsupportedOperationException("Empty collection can't be reduced.");
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
   public static final <S, T extends S> S reduceIndexedOrNull(@NotNull Iterable<? extends T> $this$reduceIndexedOrNull, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
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
   public static final <S, T extends S> S reduceOrNull(@NotNull Iterable<? extends T> $this$reduceOrNull, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
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

   public static final <S, T extends S> S reduceRight(@NotNull List<? extends T> $this$reduceRight, @NotNull Function2<? super T, ? super S, ? extends S> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRight, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$reduceRight = false;
      ListIterator iterator = $this$reduceRight.listIterator($this$reduceRight.size());
      if (!iterator.hasPrevious()) {
         throw new UnsupportedOperationException("Empty list can't be reduced.");
      } else {
         Object accumulator;
         for(accumulator = iterator.previous(); iterator.hasPrevious(); accumulator = operation.invoke(iterator.previous(), accumulator)) {
         }

         return accumulator;
      }
   }

   public static final <S, T extends S> S reduceRightIndexed(@NotNull List<? extends T> $this$reduceRightIndexed, @NotNull Function3<? super Integer, ? super T, ? super S, ? extends S> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRightIndexed, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$reduceRightIndexed = false;
      ListIterator iterator = $this$reduceRightIndexed.listIterator($this$reduceRightIndexed.size());
      if (!iterator.hasPrevious()) {
         throw new UnsupportedOperationException("Empty list can't be reduced.");
      } else {
         Object accumulator;
         int index;
         for(accumulator = iterator.previous(); iterator.hasPrevious(); accumulator = operation.invoke(index, iterator.previous(), accumulator)) {
            index = iterator.previousIndex();
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final <S, T extends S> S reduceRightIndexedOrNull(@NotNull List<? extends T> $this$reduceRightIndexedOrNull, @NotNull Function3<? super Integer, ? super T, ? super S, ? extends S> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRightIndexedOrNull, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$reduceRightIndexedOrNull = false;
      ListIterator iterator = $this$reduceRightIndexedOrNull.listIterator($this$reduceRightIndexedOrNull.size());
      if (!iterator.hasPrevious()) {
         return null;
      } else {
         Object accumulator;
         int index;
         for(accumulator = iterator.previous(); iterator.hasPrevious(); accumulator = operation.invoke(index, iterator.previous(), accumulator)) {
            index = iterator.previousIndex();
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @Nullable
   public static final <S, T extends S> S reduceRightOrNull(@NotNull List<? extends T> $this$reduceRightOrNull, @NotNull Function2<? super T, ? super S, ? extends S> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRightOrNull, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$reduceRightOrNull = false;
      ListIterator iterator = $this$reduceRightOrNull.listIterator($this$reduceRightOrNull.size());
      if (!iterator.hasPrevious()) {
         return null;
      } else {
         Object accumulator;
         for(accumulator = iterator.previous(); iterator.hasPrevious(); accumulator = operation.invoke(iterator.previous(), accumulator)) {
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <T, R> List<R> runningFold(@NotNull Iterable<? extends T> $this$runningFold, R initial, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$runningFold, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$runningFold = false;
      int estimatedSize = CollectionsKt.collectionSizeOrDefault($this$runningFold, 9);
      if (estimatedSize == 0) {
         return CollectionsKt.listOf(initial);
      } else {
         ArrayList var6 = new ArrayList(estimatedSize + 1);
         int var8 = false;
         var6.add(initial);
         ArrayList result = var6;
         Object accumulator = initial;
         Iterator var7 = $this$runningFold.iterator();

         while(var7.hasNext()) {
            Object element = var7.next();
            accumulator = operation.invoke(accumulator, element);
            result.add(accumulator);
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <T, R> List<R> runningFoldIndexed(@NotNull Iterable<? extends T> $this$runningFoldIndexed, R initial, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$runningFoldIndexed, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$runningFoldIndexed = false;
      int estimatedSize = CollectionsKt.collectionSizeOrDefault($this$runningFoldIndexed, 9);
      if (estimatedSize == 0) {
         return CollectionsKt.listOf(initial);
      } else {
         ArrayList var6 = new ArrayList(estimatedSize + 1);
         int var8 = false;
         var6.add(initial);
         ArrayList result = var6;
         int index = 0;
         Object accumulator = initial;
         Iterator var11 = $this$runningFoldIndexed.iterator();

         while(var11.hasNext()) {
            Object element = var11.next();
            accumulator = operation.invoke(index++, accumulator, element);
            result.add(accumulator);
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <S, T extends S> List<S> runningReduce(@NotNull Iterable<? extends T> $this$runningReduce, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
      Intrinsics.checkNotNullParameter($this$runningReduce, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$runningReduce = false;
      Iterator iterator = $this$runningReduce.iterator();
      if (!iterator.hasNext()) {
         return CollectionsKt.emptyList();
      } else {
         Object accumulator = null;
         accumulator = iterator.next();
         ArrayList var6 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$runningReduce, 10));
         int var8 = false;
         var6.add(accumulator);
         ArrayList result = var6;

         while(iterator.hasNext()) {
            accumulator = operation.invoke(accumulator, iterator.next());
            result.add(accumulator);
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <S, T extends S> List<S> runningReduceIndexed(@NotNull Iterable<? extends T> $this$runningReduceIndexed, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
      Intrinsics.checkNotNullParameter($this$runningReduceIndexed, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$runningReduceIndexed = false;
      Iterator iterator = $this$runningReduceIndexed.iterator();
      if (!iterator.hasNext()) {
         return CollectionsKt.emptyList();
      } else {
         Object accumulator = null;
         accumulator = iterator.next();
         ArrayList var6 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$runningReduceIndexed, 10));
         int var8 = false;
         var6.add(accumulator);
         ArrayList result = var6;
         int var9 = 1;

         while(iterator.hasNext()) {
            accumulator = operation.invoke(var9++, accumulator, iterator.next());
            result.add(accumulator);
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <T, R> List<R> scan(@NotNull Iterable<? extends T> $this$scan, R initial, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$scan, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$scan = false;
      int $i$f$runningFold = false;
      int estimatedSize$iv = CollectionsKt.collectionSizeOrDefault($this$scan, 9);
      List var10000;
      if (estimatedSize$iv == 0) {
         var10000 = CollectionsKt.listOf(initial);
      } else {
         ArrayList var7 = new ArrayList(estimatedSize$iv + 1);
         int var9 = false;
         var7.add(initial);
         ArrayList result$iv = var7;
         Object accumulator$iv = initial;
         Iterator var8 = $this$scan.iterator();

         while(var8.hasNext()) {
            Object element$iv = var8.next();
            accumulator$iv = operation.invoke(accumulator$iv, element$iv);
            result$iv.add(accumulator$iv);
         }

         var10000 = (List)result$iv;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <T, R> List<R> scanIndexed(@NotNull Iterable<? extends T> $this$scanIndexed, R initial, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$scanIndexed, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$scanIndexed = false;
      int $i$f$runningFoldIndexed = false;
      int estimatedSize$iv = CollectionsKt.collectionSizeOrDefault($this$scanIndexed, 9);
      List var10000;
      if (estimatedSize$iv == 0) {
         var10000 = CollectionsKt.listOf(initial);
      } else {
         ArrayList var7 = new ArrayList(estimatedSize$iv + 1);
         int var9 = false;
         var7.add(initial);
         ArrayList result$iv = var7;
         int index$iv = 0;
         Object accumulator$iv = initial;
         Iterator var13 = $this$scanIndexed.iterator();

         while(var13.hasNext()) {
            Object element$iv = var13.next();
            accumulator$iv = operation.invoke(index$iv++, accumulator$iv, element$iv);
            result$iv.add(accumulator$iv);
         }

         var10000 = (List)result$iv;
      }

      return var10000;
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
   public static final <T> int sumBy(@NotNull Iterable<? extends T> $this$sumBy, @NotNull Function1<? super T, Integer> selector) {
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
   public static final <T> double sumByDouble(@NotNull Iterable<? extends T> $this$sumByDouble, @NotNull Function1<? super T, Double> selector) {
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
   private static final <T> double sumOfDouble(Iterable<? extends T> $this$sumOf, Function1<? super T, Double> selector) {
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
   private static final <T> int sumOfInt(Iterable<? extends T> $this$sumOf, Function1<? super T, Integer> selector) {
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
   private static final <T> long sumOfLong(Iterable<? extends T> $this$sumOf, Function1<? super T, Long> selector) {
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
   private static final <T> int sumOfUInt(Iterable<? extends T> $this$sumOf, Function1<? super T, UInt> selector) {
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
   private static final <T> long sumOfULong(Iterable<? extends T> $this$sumOf, Function1<? super T, ULong> selector) {
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
   public static final <T> Iterable<T> requireNoNulls(@NotNull Iterable<? extends T> $this$requireNoNulls) {
      Intrinsics.checkNotNullParameter($this$requireNoNulls, "<this>");
      Iterator var1 = $this$requireNoNulls.iterator();

      Object element;
      do {
         if (!var1.hasNext()) {
            return $this$requireNoNulls;
         }

         element = var1.next();
      } while(element != null);

      throw new IllegalArgumentException("null element found in " + $this$requireNoNulls + '.');
   }

   @NotNull
   public static final <T> List<T> requireNoNulls(@NotNull List<? extends T> $this$requireNoNulls) {
      Intrinsics.checkNotNullParameter($this$requireNoNulls, "<this>");
      Iterator var1 = $this$requireNoNulls.iterator();

      Object element;
      do {
         if (!var1.hasNext()) {
            return $this$requireNoNulls;
         }

         element = var1.next();
      } while(element != null);

      throw new IllegalArgumentException("null element found in " + $this$requireNoNulls + '.');
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <T> List<List<T>> chunked(@NotNull Iterable<? extends T> $this$chunked, int size) {
      Intrinsics.checkNotNullParameter($this$chunked, "<this>");
      return CollectionsKt.windowed($this$chunked, size, size, true);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <T, R> List<R> chunked(@NotNull Iterable<? extends T> $this$chunked, int size, @NotNull Function1<? super List<? extends T>, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$chunked, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      return CollectionsKt.windowed($this$chunked, size, size, true, transform);
   }

   @NotNull
   public static final <T> List<T> minus(@NotNull Iterable<? extends T> $this$minus, T element) {
      Intrinsics.checkNotNullParameter($this$minus, "<this>");
      ArrayList result = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$minus, 10));
      boolean removed = false;
      int $i$f$filterTo = false;
      Iterator var6 = $this$minus.iterator();

      while(var6.hasNext()) {
         Object element$iv = var6.next();
         int var9 = false;
         boolean var10000;
         if (!removed && Intrinsics.areEqual(element$iv, element)) {
            removed = true;
            var10000 = false;
         } else {
            var10000 = true;
         }

         if (var10000) {
            ((Collection)result).add(element$iv);
         }
      }

      return (List)((Collection)result);
   }

   @NotNull
   public static final <T> List<T> minus(@NotNull Iterable<? extends T> $this$minus, @NotNull T[] elements) {
      Intrinsics.checkNotNullParameter($this$minus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      if (elements.length == 0) {
         return CollectionsKt.toList($this$minus);
      } else {
         int $i$f$filterNot = false;
         Collection destination$iv$iv = (Collection)(new ArrayList());
         int $i$f$filterNotTo = false;
         Iterator var7 = $this$minus.iterator();

         while(var7.hasNext()) {
            Object element$iv$iv = var7.next();
            int var10 = false;
            if (!ArraysKt.contains(elements, element$iv$iv)) {
               destination$iv$iv.add(element$iv$iv);
            }
         }

         return (List)destination$iv$iv;
      }
   }

   @NotNull
   public static final <T> List<T> minus(@NotNull Iterable<? extends T> $this$minus, @NotNull Iterable<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$minus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      Collection other = CollectionsKt.convertToListIfNotCollection(elements);
      if (other.isEmpty()) {
         return CollectionsKt.toList($this$minus);
      } else {
         int $i$f$filterNot = false;
         Collection destination$iv$iv = (Collection)(new ArrayList());
         int $i$f$filterNotTo = false;
         Iterator var8 = $this$minus.iterator();

         while(var8.hasNext()) {
            Object element$iv$iv = var8.next();
            int var11 = false;
            if (!other.contains(element$iv$iv)) {
               destination$iv$iv.add(element$iv$iv);
            }
         }

         return (List)destination$iv$iv;
      }
   }

   @NotNull
   public static final <T> List<T> minus(@NotNull Iterable<? extends T> $this$minus, @NotNull Sequence<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$minus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      List other = SequencesKt.toList(elements);
      if (other.isEmpty()) {
         return CollectionsKt.toList($this$minus);
      } else {
         int $i$f$filterNot = false;
         Collection destination$iv$iv = (Collection)(new ArrayList());
         int $i$f$filterNotTo = false;
         Iterator var8 = $this$minus.iterator();

         while(var8.hasNext()) {
            Object element$iv$iv = var8.next();
            int var11 = false;
            if (!other.contains(element$iv$iv)) {
               destination$iv$iv.add(element$iv$iv);
            }
         }

         return (List)destination$iv$iv;
      }
   }

   @InlineOnly
   private static final <T> List<T> minusElement(Iterable<? extends T> $this$minusElement, T element) {
      Intrinsics.checkNotNullParameter($this$minusElement, "<this>");
      return CollectionsKt.minus($this$minusElement, element);
   }

   @NotNull
   public static final <T> Pair<List<T>, List<T>> partition(@NotNull Iterable<? extends T> $this$partition, @NotNull Function1<? super T, Boolean> predicate) {
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
   public static final <T> List<T> plus(@NotNull Iterable<? extends T> $this$plus, T element) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      if ($this$plus instanceof Collection) {
         return CollectionsKt.plus((Collection)$this$plus, element);
      } else {
         ArrayList result = new ArrayList();
         CollectionsKt.addAll((Collection)result, $this$plus);
         result.add(element);
         return (List)result;
      }
   }

   @NotNull
   public static final <T> List<T> plus(@NotNull Collection<? extends T> $this$plus, T element) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      ArrayList result = new ArrayList($this$plus.size() + 1);
      result.addAll($this$plus);
      result.add(element);
      return (List)result;
   }

   @NotNull
   public static final <T> List<T> plus(@NotNull Iterable<? extends T> $this$plus, @NotNull T[] elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      if ($this$plus instanceof Collection) {
         return CollectionsKt.plus((Collection)$this$plus, elements);
      } else {
         ArrayList result = new ArrayList();
         CollectionsKt.addAll((Collection)result, $this$plus);
         CollectionsKt.addAll((Collection)result, elements);
         return (List)result;
      }
   }

   @NotNull
   public static final <T> List<T> plus(@NotNull Collection<? extends T> $this$plus, @NotNull T[] elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      ArrayList result = new ArrayList($this$plus.size() + elements.length);
      result.addAll($this$plus);
      CollectionsKt.addAll((Collection)result, elements);
      return (List)result;
   }

   @NotNull
   public static final <T> List<T> plus(@NotNull Iterable<? extends T> $this$plus, @NotNull Iterable<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      if ($this$plus instanceof Collection) {
         return CollectionsKt.plus((Collection)$this$plus, elements);
      } else {
         ArrayList result = new ArrayList();
         CollectionsKt.addAll((Collection)result, $this$plus);
         CollectionsKt.addAll((Collection)result, elements);
         return (List)result;
      }
   }

   @NotNull
   public static final <T> List<T> plus(@NotNull Collection<? extends T> $this$plus, @NotNull Iterable<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      ArrayList result;
      if (elements instanceof Collection) {
         result = new ArrayList($this$plus.size() + ((Collection)elements).size());
         result.addAll($this$plus);
         result.addAll((Collection)elements);
         return (List)result;
      } else {
         result = new ArrayList($this$plus);
         CollectionsKt.addAll((Collection)result, elements);
         return (List)result;
      }
   }

   @NotNull
   public static final <T> List<T> plus(@NotNull Iterable<? extends T> $this$plus, @NotNull Sequence<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      ArrayList result = new ArrayList();
      CollectionsKt.addAll((Collection)result, $this$plus);
      CollectionsKt.addAll((Collection)result, elements);
      return (List)result;
   }

   @NotNull
   public static final <T> List<T> plus(@NotNull Collection<? extends T> $this$plus, @NotNull Sequence<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      ArrayList result = new ArrayList($this$plus.size() + 10);
      result.addAll($this$plus);
      CollectionsKt.addAll((Collection)result, elements);
      return (List)result;
   }

   @InlineOnly
   private static final <T> List<T> plusElement(Iterable<? extends T> $this$plusElement, T element) {
      Intrinsics.checkNotNullParameter($this$plusElement, "<this>");
      return CollectionsKt.plus($this$plusElement, element);
   }

   @InlineOnly
   private static final <T> List<T> plusElement(Collection<? extends T> $this$plusElement, T element) {
      Intrinsics.checkNotNullParameter($this$plusElement, "<this>");
      return CollectionsKt.plus($this$plusElement, element);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <T> List<List<T>> windowed(@NotNull Iterable<? extends T> $this$windowed, int size, int step, boolean partialWindows) {
      Intrinsics.checkNotNullParameter($this$windowed, "<this>");
      SlidingWindowKt.checkWindowSizeStep(size, step);
      if ($this$windowed instanceof RandomAccess && $this$windowed instanceof List) {
         int thisSize = ((List)$this$windowed).size();
         int resultCapacity = thisSize / step + (thisSize % step == 0 ? 0 : 1);
         ArrayList result = new ArrayList(resultCapacity);

         for(int index = 0; 0 <= index ? index < thisSize : false; index += step) {
            int windowSize = RangesKt.coerceAtMost(size, thisSize - index);
            if (windowSize < size && !partialWindows) {
               break;
            }

            ArrayList var21 = new ArrayList(windowSize);

            for(int var22 = 0; var22 < windowSize; ++var22) {
               int var13 = false;
               var21.add(((List)$this$windowed).get(var22 + index));
            }

            result.add((List)var21);
         }

         return (List)result;
      } else {
         ArrayList result = new ArrayList();
         Iterator $this$forEach$iv = SlidingWindowKt.windowedIterator($this$windowed.iterator(), size, step, partialWindows, false);
         int $i$f$forEach = false;
         Iterator var7 = $this$forEach$iv;

         while(var7.hasNext()) {
            Object element$iv = var7.next();
            List it = (List)element$iv;
            int var10 = false;
            result.add(it);
         }

         return (List)result;
      }
   }

   // $FF: synthetic method
   public static List windowed$default(Iterable var0, int var1, int var2, boolean var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 1;
      }

      if ((var4 & 4) != 0) {
         var3 = false;
      }

      return CollectionsKt.windowed(var0, var1, var2, var3);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <T, R> List<R> windowed(@NotNull Iterable<? extends T> $this$windowed, int size, int step, boolean partialWindows, @NotNull Function1<? super List<? extends T>, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$windowed, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      SlidingWindowKt.checkWindowSizeStep(size, step);
      if ($this$windowed instanceof RandomAccess && $this$windowed instanceof List) {
         int thisSize = ((List)$this$windowed).size();
         int resultCapacity = thisSize / step + (thisSize % step == 0 ? 0 : 1);
         ArrayList result = new ArrayList(resultCapacity);
         MovingSubList window = new MovingSubList((List)$this$windowed);

         for(int index = 0; 0 <= index ? index < thisSize : false; index += step) {
            int windowSize = RangesKt.coerceAtMost(size, thisSize - index);
            if (!partialWindows && windowSize < size) {
               break;
            }

            window.move(index, index + windowSize);
            result.add(transform.invoke(window));
         }

         return (List)result;
      } else {
         ArrayList result = new ArrayList();
         Iterator $this$forEach$iv = SlidingWindowKt.windowedIterator($this$windowed.iterator(), size, step, partialWindows, true);
         int $i$f$forEach = false;
         Iterator var8 = $this$forEach$iv;

         while(var8.hasNext()) {
            Object element$iv = var8.next();
            List it = (List)element$iv;
            int var11 = false;
            result.add(transform.invoke(it));
         }

         return (List)result;
      }
   }

   // $FF: synthetic method
   public static List windowed$default(Iterable var0, int var1, int var2, boolean var3, Function1 var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var2 = 1;
      }

      if ((var5 & 4) != 0) {
         var3 = false;
      }

      return CollectionsKt.windowed(var0, var1, var2, var3, var4);
   }

   @NotNull
   public static final <T, R> List<Pair<T, R>> zip(@NotNull Iterable<? extends T> $this$zip, @NotNull R[] other) {
      Intrinsics.checkNotNullParameter($this$zip, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      int $i$f$zip = false;
      int arraySize$iv = other.length;
      ArrayList list$iv = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault($this$zip, 10), arraySize$iv));
      int i$iv = 0;
      Iterator var7 = $this$zip.iterator();

      while(var7.hasNext()) {
         Object element$iv = var7.next();
         if (i$iv >= arraySize$iv) {
            break;
         }

         Object t2 = other[i$iv++];
         int var11 = false;
         list$iv.add(TuplesKt.to(element$iv, t2));
      }

      return (List)list$iv;
   }

   @NotNull
   public static final <T, R, V> List<V> zip(@NotNull Iterable<? extends T> $this$zip, @NotNull R[] other, @NotNull Function2<? super T, ? super R, ? extends V> transform) {
      Intrinsics.checkNotNullParameter($this$zip, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$zip = false;
      int arraySize = other.length;
      ArrayList list = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault($this$zip, 10), arraySize));
      int i = 0;
      Iterator var7 = $this$zip.iterator();

      while(var7.hasNext()) {
         Object element = var7.next();
         if (i >= arraySize) {
            break;
         }

         list.add(transform.invoke(element, other[i++]));
      }

      return (List)list;
   }

   @NotNull
   public static final <T, R> List<Pair<T, R>> zip(@NotNull Iterable<? extends T> $this$zip, @NotNull Iterable<? extends R> other) {
      Intrinsics.checkNotNullParameter($this$zip, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      int $i$f$zip = false;
      Iterator first$iv = $this$zip.iterator();
      Iterator second$iv = other.iterator();
      ArrayList list$iv = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault($this$zip, 10), CollectionsKt.collectionSizeOrDefault(other, 10)));

      while(first$iv.hasNext() && second$iv.hasNext()) {
         Object var10001 = first$iv.next();
         Object t2 = second$iv.next();
         Object t1 = var10001;
         int var9 = false;
         list$iv.add(TuplesKt.to(t1, t2));
      }

      return (List)list$iv;
   }

   @NotNull
   public static final <T, R, V> List<V> zip(@NotNull Iterable<? extends T> $this$zip, @NotNull Iterable<? extends R> other, @NotNull Function2<? super T, ? super R, ? extends V> transform) {
      Intrinsics.checkNotNullParameter($this$zip, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$zip = false;
      Iterator first = $this$zip.iterator();
      Iterator second = other.iterator();
      ArrayList list = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault($this$zip, 10), CollectionsKt.collectionSizeOrDefault(other, 10)));

      while(first.hasNext() && second.hasNext()) {
         list.add(transform.invoke(first.next(), second.next()));
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <T> List<Pair<T, T>> zipWithNext(@NotNull Iterable<? extends T> $this$zipWithNext) {
      Intrinsics.checkNotNullParameter($this$zipWithNext, "<this>");
      int $i$f$zipWithNext = false;
      Iterator iterator$iv = $this$zipWithNext.iterator();
      List var10000;
      if (!iterator$iv.hasNext()) {
         var10000 = CollectionsKt.emptyList();
      } else {
         List result$iv = (List)(new ArrayList());

         Object next$iv;
         for(Object current$iv = iterator$iv.next(); iterator$iv.hasNext(); current$iv = next$iv) {
            next$iv = iterator$iv.next();
            int var9 = false;
            result$iv.add(TuplesKt.to(current$iv, next$iv));
         }

         var10000 = result$iv;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <T, R> List<R> zipWithNext(@NotNull Iterable<? extends T> $this$zipWithNext, @NotNull Function2<? super T, ? super T, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$zipWithNext, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$zipWithNext = false;
      Iterator iterator = $this$zipWithNext.iterator();
      if (!iterator.hasNext()) {
         return CollectionsKt.emptyList();
      } else {
         List result = (List)(new ArrayList());

         Object next;
         for(Object current = iterator.next(); iterator.hasNext(); current = next) {
            next = iterator.next();
            result.add(transform.invoke(current, next));
         }

         return result;
      }
   }

   @NotNull
   public static final <T, A extends Appendable> A joinTo(@NotNull Iterable<? extends T> $this$joinTo, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> transform) {
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
   public static Appendable joinTo$default(Iterable var0, Appendable var1, CharSequence var2, CharSequence var3, CharSequence var4, int var5, CharSequence var6, Function1 var7, int var8, Object var9) {
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

      return CollectionsKt.joinTo(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   @NotNull
   public static final <T> String joinToString(@NotNull Iterable<? extends T> $this$joinToString, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> transform) {
      Intrinsics.checkNotNullParameter($this$joinToString, "<this>");
      Intrinsics.checkNotNullParameter(separator, "separator");
      Intrinsics.checkNotNullParameter(prefix, "prefix");
      Intrinsics.checkNotNullParameter(postfix, "postfix");
      Intrinsics.checkNotNullParameter(truncated, "truncated");
      return ((StringBuilder)CollectionsKt.joinTo($this$joinToString, (Appendable)(new StringBuilder()), separator, prefix, postfix, limit, truncated, transform)).toString();
   }

   // $FF: synthetic method
   public static String joinToString$default(Iterable var0, CharSequence var1, CharSequence var2, CharSequence var3, int var4, CharSequence var5, Function1 var6, int var7, Object var8) {
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

      return CollectionsKt.joinToString(var0, var1, var2, var3, var4, var5, var6);
   }

   @InlineOnly
   private static final <T> Iterable<T> asIterable(Iterable<? extends T> $this$asIterable) {
      Intrinsics.checkNotNullParameter($this$asIterable, "<this>");
      return $this$asIterable;
   }

   @NotNull
   public static final <T> Sequence<T> asSequence(@NotNull Iterable<? extends T> $this$asSequence) {
      Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
      return (Sequence)(new CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1($this$asSequence));
   }

   @JvmName(
      name = "averageOfByte"
   )
   public static final double averageOfByte(@NotNull Iterable<Byte> $this$average) {
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
   public static final double averageOfShort(@NotNull Iterable<Short> $this$average) {
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
   public static final double averageOfInt(@NotNull Iterable<Integer> $this$average) {
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
   public static final double averageOfLong(@NotNull Iterable<Long> $this$average) {
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
   public static final double averageOfFloat(@NotNull Iterable<Float> $this$average) {
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
   public static final double averageOfDouble(@NotNull Iterable<Double> $this$average) {
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
   public static final int sumOfByte(@NotNull Iterable<Byte> $this$sum) {
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
   public static final int sumOfShort(@NotNull Iterable<Short> $this$sum) {
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
   public static final int sumOfInt(@NotNull Iterable<Integer> $this$sum) {
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
   public static final long sumOfLong(@NotNull Iterable<Long> $this$sum) {
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
   public static final float sumOfFloat(@NotNull Iterable<Float> $this$sum) {
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
   public static final double sumOfDouble(@NotNull Iterable<Double> $this$sum) {
      Intrinsics.checkNotNullParameter($this$sum, "<this>");
      double sum = 0.0D;

      double element;
      for(Iterator var3 = $this$sum.iterator(); var3.hasNext(); sum += element) {
         element = ((Number)var3.next()).doubleValue();
      }

      return sum;
   }

   private static final Object elementAt$lambda$0$CollectionsKt___CollectionsKt(int $index, int it) {
      throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + $index + '.');
   }

   private static final Iterator withIndex$lambda$17$CollectionsKt___CollectionsKt(Iterable $this_withIndex) {
      return $this_withIndex.iterator();
   }

   public CollectionsKt___CollectionsKt() {
   }
}
