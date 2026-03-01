package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Map.Entry;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.HidesMembers;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

class MapsKt___MapsKt extends MapsKt___MapsJvmKt {
   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final <K, V, R> R firstNotNullOf(Map<? extends K, ? extends V> $this$firstNotNullOf, Function1<? super Entry<? extends K, ? extends V>, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$firstNotNullOf, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      Iterator var2 = $this$firstNotNullOf.entrySet().iterator();

      Object var10000;
      do {
         if (!var2.hasNext()) {
            var10000 = null;
            break;
         }

         var10000 = transform.invoke((Entry)var2.next());
      } while(var10000 == null);

      if (var10000 == null) {
         throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
      } else {
         return var10000;
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final <K, V, R> R firstNotNullOfOrNull(Map<? extends K, ? extends V> $this$firstNotNullOfOrNull, Function1<? super Entry<? extends K, ? extends V>, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$firstNotNullOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      Iterator var2 = $this$firstNotNullOfOrNull.entrySet().iterator();

      Object result;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         Entry element = (Entry)var2.next();
         result = transform.invoke(element);
      } while(result == null);

      return result;
   }

   @NotNull
   public static final <K, V> List<Pair<K, V>> toList(@NotNull Map<? extends K, ? extends V> $this$toList) {
      Intrinsics.checkNotNullParameter($this$toList, "<this>");
      if ($this$toList.size() == 0) {
         return CollectionsKt.emptyList();
      } else {
         Iterator iterator = $this$toList.entrySet().iterator();
         if (!iterator.hasNext()) {
            return CollectionsKt.emptyList();
         } else {
            Entry first = (Entry)iterator.next();
            if (!iterator.hasNext()) {
               return CollectionsKt.listOf(new Pair(first.getKey(), first.getValue()));
            } else {
               ArrayList result = new ArrayList($this$toList.size());
               result.add(new Pair(first.getKey(), first.getValue()));

               do {
                  Entry var4 = (Entry)iterator.next();
                  result.add(new Pair(var4.getKey(), var4.getValue()));
               } while(iterator.hasNext());

               return (List)result;
            }
         }
      }
   }

   @NotNull
   public static final <K, V, R> List<R> flatMap(@NotNull Map<? extends K, ? extends V> $this$flatMap, @NotNull Function1<? super Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMap, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$flatMap = false;
      Collection destination$iv = (Collection)(new ArrayList());
      int $i$f$flatMapTo = false;
      Iterator var6 = $this$flatMap.entrySet().iterator();

      while(var6.hasNext()) {
         Entry element$iv = (Entry)var6.next();
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
   public static final <K, V, R> List<R> flatMapSequence(@NotNull Map<? extends K, ? extends V> $this$flatMap, @NotNull Function1<? super Entry<? extends K, ? extends V>, ? extends Sequence<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMap, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$flatMapSequence = false;
      Collection destination$iv = (Collection)(new ArrayList());
      int $i$f$flatMapSequenceTo = false;
      Iterator var6 = $this$flatMap.entrySet().iterator();

      while(var6.hasNext()) {
         Entry element$iv = (Entry)var6.next();
         Sequence list$iv = (Sequence)transform.invoke(element$iv);
         CollectionsKt.addAll(destination$iv, list$iv);
      }

      return (List)destination$iv;
   }

   @NotNull
   public static final <K, V, R, C extends Collection<? super R>> C flatMapTo(@NotNull Map<? extends K, ? extends V> $this$flatMapTo, @NotNull C destination, @NotNull Function1<? super Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$flatMapTo = false;
      Iterator var4 = $this$flatMapTo.entrySet().iterator();

      while(var4.hasNext()) {
         Entry element = (Entry)var4.next();
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
   public static final <K, V, R, C extends Collection<? super R>> C flatMapSequenceTo(@NotNull Map<? extends K, ? extends V> $this$flatMapTo, @NotNull C destination, @NotNull Function1<? super Entry<? extends K, ? extends V>, ? extends Sequence<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$flatMapSequenceTo = false;
      Iterator var4 = $this$flatMapTo.entrySet().iterator();

      while(var4.hasNext()) {
         Entry element = (Entry)var4.next();
         Sequence list = (Sequence)transform.invoke(element);
         CollectionsKt.addAll(destination, list);
      }

      return destination;
   }

   @NotNull
   public static final <K, V, R> List<R> map(@NotNull Map<? extends K, ? extends V> $this$map, @NotNull Function1<? super Entry<? extends K, ? extends V>, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$map, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$map = false;
      Collection destination$iv = (Collection)(new ArrayList($this$map.size()));
      int $i$f$mapTo = false;
      Iterator var6 = $this$map.entrySet().iterator();

      while(var6.hasNext()) {
         Entry item$iv = (Entry)var6.next();
         destination$iv.add(transform.invoke(item$iv));
      }

      return (List)destination$iv;
   }

   @NotNull
   public static final <K, V, R> List<R> mapNotNull(@NotNull Map<? extends K, ? extends V> $this$mapNotNull, @NotNull Function1<? super Entry<? extends K, ? extends V>, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapNotNull, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapNotNull = false;
      Collection destination$iv = (Collection)(new ArrayList());
      int $i$f$mapNotNullTo = false;
      int $i$f$forEach = false;
      Iterator var8 = $this$mapNotNull.entrySet().iterator();

      while(var8.hasNext()) {
         Entry element$iv$iv = (Entry)var8.next();
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
   public static final <K, V, R, C extends Collection<? super R>> C mapNotNullTo(@NotNull Map<? extends K, ? extends V> $this$mapNotNullTo, @NotNull C destination, @NotNull Function1<? super Entry<? extends K, ? extends V>, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapNotNullTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapNotNullTo = false;
      int $i$f$forEach = false;
      Iterator var6 = $this$mapNotNullTo.entrySet().iterator();

      while(var6.hasNext()) {
         Entry element$iv = (Entry)var6.next();
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
   public static final <K, V, R, C extends Collection<? super R>> C mapTo(@NotNull Map<? extends K, ? extends V> $this$mapTo, @NotNull C destination, @NotNull Function1<? super Entry<? extends K, ? extends V>, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapTo = false;
      Iterator var4 = $this$mapTo.entrySet().iterator();

      while(var4.hasNext()) {
         Entry item = (Entry)var4.next();
         destination.add(transform.invoke(item));
      }

      return destination;
   }

   public static final <K, V> boolean all(@NotNull Map<? extends K, ? extends V> $this$all, @NotNull Function1<? super Entry<? extends K, ? extends V>, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$all, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$all = false;
      if ($this$all.isEmpty()) {
         return true;
      } else {
         Iterator var3 = $this$all.entrySet().iterator();

         Entry element;
         do {
            if (!var3.hasNext()) {
               return true;
            }

            element = (Entry)var3.next();
         } while((Boolean)predicate.invoke(element));

         return false;
      }
   }

   public static final <K, V> boolean any(@NotNull Map<? extends K, ? extends V> $this$any) {
      Intrinsics.checkNotNullParameter($this$any, "<this>");
      return !$this$any.isEmpty();
   }

   public static final <K, V> boolean any(@NotNull Map<? extends K, ? extends V> $this$any, @NotNull Function1<? super Entry<? extends K, ? extends V>, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$any, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$any = false;
      if ($this$any.isEmpty()) {
         return false;
      } else {
         Iterator var3 = $this$any.entrySet().iterator();

         Entry element;
         do {
            if (!var3.hasNext()) {
               return false;
            }

            element = (Entry)var3.next();
         } while(!(Boolean)predicate.invoke(element));

         return true;
      }
   }

   @InlineOnly
   private static final <K, V> int count(Map<? extends K, ? extends V> $this$count) {
      Intrinsics.checkNotNullParameter($this$count, "<this>");
      return $this$count.size();
   }

   public static final <K, V> int count(@NotNull Map<? extends K, ? extends V> $this$count, @NotNull Function1<? super Entry<? extends K, ? extends V>, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$count, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$count = false;
      if ($this$count.isEmpty()) {
         return 0;
      } else {
         int count = 0;
         Iterator var4 = $this$count.entrySet().iterator();

         while(var4.hasNext()) {
            Entry element = (Entry)var4.next();
            if ((Boolean)predicate.invoke(element)) {
               ++count;
            }
         }

         return count;
      }
   }

   @HidesMembers
   public static final <K, V> void forEach(@NotNull Map<? extends K, ? extends V> $this$forEach, @NotNull Function1<? super Entry<? extends K, ? extends V>, Unit> action) {
      Intrinsics.checkNotNullParameter($this$forEach, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      int $i$f$forEach = false;
      Iterator var3 = $this$forEach.entrySet().iterator();

      while(var3.hasNext()) {
         Entry element = (Entry)var3.next();
         action.invoke(element);
      }

   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxByOrThrow"
   )
   @InlineOnly
   private static final <K, V, R extends Comparable<? super R>> Entry<K, V> maxByOrThrow(Map<? extends K, ? extends V> $this$maxBy, Function1<? super Entry<? extends K, ? extends V>, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterable $this$maxBy$iv = (Iterable)$this$maxBy.entrySet();
      int $i$f$maxByOrThrow = false;
      Iterator iterator$iv = $this$maxBy$iv.iterator();
      if (!iterator$iv.hasNext()) {
         throw new NoSuchElementException();
      } else {
         Object maxElem$iv = iterator$iv.next();
         Object var10000;
         if (!iterator$iv.hasNext()) {
            var10000 = maxElem$iv;
         } else {
            Comparable maxValue$iv = (Comparable)selector.invoke(maxElem$iv);

            do {
               Object e$iv = iterator$iv.next();
               Comparable v$iv = (Comparable)selector.invoke(e$iv);
               if (maxValue$iv.compareTo(v$iv) < 0) {
                  maxElem$iv = e$iv;
                  maxValue$iv = v$iv;
               }
            } while(iterator$iv.hasNext());

            var10000 = maxElem$iv;
         }

         return (Entry)var10000;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final <K, V, R extends Comparable<? super R>> Entry<K, V> maxByOrNull(Map<? extends K, ? extends V> $this$maxByOrNull, Function1<? super Entry<? extends K, ? extends V>, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxByOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterable $this$maxByOrNull$iv = (Iterable)$this$maxByOrNull.entrySet();
      int $i$f$maxByOrNull = false;
      Iterator iterator$iv = $this$maxByOrNull$iv.iterator();
      Object var10000;
      if (!iterator$iv.hasNext()) {
         var10000 = null;
      } else {
         Object maxElem$iv = iterator$iv.next();
         if (!iterator$iv.hasNext()) {
            var10000 = maxElem$iv;
         } else {
            Comparable maxValue$iv = (Comparable)selector.invoke(maxElem$iv);

            do {
               Object e$iv = iterator$iv.next();
               Comparable v$iv = (Comparable)selector.invoke(e$iv);
               if (maxValue$iv.compareTo(v$iv) < 0) {
                  maxElem$iv = e$iv;
                  maxValue$iv = v$iv;
               }
            } while(iterator$iv.hasNext());

            var10000 = maxElem$iv;
         }
      }

      return (Entry)var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <K, V> double maxOf(Map<? extends K, ? extends V> $this$maxOf, Function1<? super Entry<? extends K, ? extends V>, Double> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator var2 = ((Iterable)$this$maxOf.entrySet()).iterator();
      if (!var2.hasNext()) {
         throw new NoSuchElementException();
      } else {
         double var3;
         double var5;
         for(var3 = ((Number)selector.invoke(var2.next())).doubleValue(); var2.hasNext(); var3 = Math.max(var3, var5)) {
            var5 = ((Number)selector.invoke(var2.next())).doubleValue();
         }

         return var3;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <K, V> float maxOf(Map<? extends K, ? extends V> $this$maxOf, Function1<? super Entry<? extends K, ? extends V>, Float> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator var2 = ((Iterable)$this$maxOf.entrySet()).iterator();
      if (!var2.hasNext()) {
         throw new NoSuchElementException();
      } else {
         float var3;
         float var4;
         for(var3 = ((Number)selector.invoke(var2.next())).floatValue(); var2.hasNext(); var3 = Math.max(var3, var4)) {
            var4 = ((Number)selector.invoke(var2.next())).floatValue();
         }

         return var3;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <K, V, R extends Comparable<? super R>> R maxOf(Map<? extends K, ? extends V> $this$maxOf, Function1<? super Entry<? extends K, ? extends V>, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator var2 = ((Iterable)$this$maxOf.entrySet()).iterator();
      if (!var2.hasNext()) {
         throw new NoSuchElementException();
      } else {
         Comparable var3 = (Comparable)selector.invoke(var2.next());

         while(var2.hasNext()) {
            Comparable var4 = (Comparable)selector.invoke(var2.next());
            if (var3.compareTo(var4) < 0) {
               var3 = var4;
            }
         }

         return var3;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <K, V> Double maxOfOrNull(Map<? extends K, ? extends V> $this$maxOfOrNull, Function1<? super Entry<? extends K, ? extends V>, Double> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator var2 = ((Iterable)$this$maxOfOrNull.entrySet()).iterator();
      Double var10000;
      if (!var2.hasNext()) {
         var10000 = null;
      } else {
         double var3;
         double var5;
         for(var3 = ((Number)selector.invoke(var2.next())).doubleValue(); var2.hasNext(); var3 = Math.max(var3, var5)) {
            var5 = ((Number)selector.invoke(var2.next())).doubleValue();
         }

         var10000 = var3;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <K, V> Float maxOfOrNull(Map<? extends K, ? extends V> $this$maxOfOrNull, Function1<? super Entry<? extends K, ? extends V>, Float> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator var2 = ((Iterable)$this$maxOfOrNull.entrySet()).iterator();
      Float var10000;
      if (!var2.hasNext()) {
         var10000 = null;
      } else {
         float var3;
         float var4;
         for(var3 = ((Number)selector.invoke(var2.next())).floatValue(); var2.hasNext(); var3 = Math.max(var3, var4)) {
            var4 = ((Number)selector.invoke(var2.next())).floatValue();
         }

         var10000 = var3;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <K, V, R extends Comparable<? super R>> R maxOfOrNull(Map<? extends K, ? extends V> $this$maxOfOrNull, Function1<? super Entry<? extends K, ? extends V>, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator var2 = ((Iterable)$this$maxOfOrNull.entrySet()).iterator();
      Comparable var10000;
      if (!var2.hasNext()) {
         var10000 = null;
      } else {
         Comparable var3 = (Comparable)selector.invoke(var2.next());

         while(var2.hasNext()) {
            Comparable var4 = (Comparable)selector.invoke(var2.next());
            if (var3.compareTo(var4) < 0) {
               var3 = var4;
            }
         }

         var10000 = var3;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <K, V, R> R maxOfWith(Map<? extends K, ? extends V> $this$maxOfWith, Comparator<? super R> comparator, Function1<? super Entry<? extends K, ? extends V>, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator var3 = ((Iterable)$this$maxOfWith.entrySet()).iterator();
      if (!var3.hasNext()) {
         throw new NoSuchElementException();
      } else {
         Object var4 = selector.invoke(var3.next());

         while(var3.hasNext()) {
            Object var5 = selector.invoke(var3.next());
            if (comparator.compare(var4, var5) < 0) {
               var4 = var5;
            }
         }

         return var4;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <K, V, R> R maxOfWithOrNull(Map<? extends K, ? extends V> $this$maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super Entry<? extends K, ? extends V>, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfWithOrNull, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator var3 = ((Iterable)$this$maxOfWithOrNull.entrySet()).iterator();
      Object var10000;
      if (!var3.hasNext()) {
         var10000 = null;
      } else {
         Object var4 = selector.invoke(var3.next());

         while(var3.hasNext()) {
            Object var5 = selector.invoke(var3.next());
            if (comparator.compare(var4, var5) < 0) {
               var4 = var5;
            }
         }

         var10000 = var4;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxWithOrThrow"
   )
   @InlineOnly
   private static final <K, V> Entry<K, V> maxWithOrThrow(Map<? extends K, ? extends V> $this$maxWith, Comparator<? super Entry<? extends K, ? extends V>> comparator) {
      Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return (Entry)CollectionsKt.maxWithOrThrow((Iterable)$this$maxWith.entrySet(), comparator);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final <K, V> Entry<K, V> maxWithOrNull(Map<? extends K, ? extends V> $this$maxWithOrNull, Comparator<? super Entry<? extends K, ? extends V>> comparator) {
      Intrinsics.checkNotNullParameter($this$maxWithOrNull, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return (Entry)CollectionsKt.maxWithOrNull((Iterable)$this$maxWithOrNull.entrySet(), comparator);
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minByOrThrow"
   )
   @InlineOnly
   private static final <K, V, R extends Comparable<? super R>> Entry<K, V> minByOrThrow(Map<? extends K, ? extends V> $this$minBy, Function1<? super Entry<? extends K, ? extends V>, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterable $this$minBy$iv = (Iterable)$this$minBy.entrySet();
      int $i$f$minByOrThrow = false;
      Iterator iterator$iv = $this$minBy$iv.iterator();
      if (!iterator$iv.hasNext()) {
         throw new NoSuchElementException();
      } else {
         Object minElem$iv = iterator$iv.next();
         Object var10000;
         if (!iterator$iv.hasNext()) {
            var10000 = minElem$iv;
         } else {
            Comparable minValue$iv = (Comparable)selector.invoke(minElem$iv);

            do {
               Object e$iv = iterator$iv.next();
               Comparable v$iv = (Comparable)selector.invoke(e$iv);
               if (minValue$iv.compareTo(v$iv) > 0) {
                  minElem$iv = e$iv;
                  minValue$iv = v$iv;
               }
            } while(iterator$iv.hasNext());

            var10000 = minElem$iv;
         }

         return (Entry)var10000;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final <K, V, R extends Comparable<? super R>> Entry<K, V> minByOrNull(Map<? extends K, ? extends V> $this$minByOrNull, Function1<? super Entry<? extends K, ? extends V>, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minByOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterable $this$minByOrNull$iv = (Iterable)$this$minByOrNull.entrySet();
      int $i$f$minByOrNull = false;
      Iterator iterator$iv = $this$minByOrNull$iv.iterator();
      Object var10000;
      if (!iterator$iv.hasNext()) {
         var10000 = null;
      } else {
         Object minElem$iv = iterator$iv.next();
         if (!iterator$iv.hasNext()) {
            var10000 = minElem$iv;
         } else {
            Comparable minValue$iv = (Comparable)selector.invoke(minElem$iv);

            do {
               Object e$iv = iterator$iv.next();
               Comparable v$iv = (Comparable)selector.invoke(e$iv);
               if (minValue$iv.compareTo(v$iv) > 0) {
                  minElem$iv = e$iv;
                  minValue$iv = v$iv;
               }
            } while(iterator$iv.hasNext());

            var10000 = minElem$iv;
         }
      }

      return (Entry)var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <K, V> double minOf(Map<? extends K, ? extends V> $this$minOf, Function1<? super Entry<? extends K, ? extends V>, Double> selector) {
      Intrinsics.checkNotNullParameter($this$minOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator var2 = ((Iterable)$this$minOf.entrySet()).iterator();
      if (!var2.hasNext()) {
         throw new NoSuchElementException();
      } else {
         double var3;
         double var5;
         for(var3 = ((Number)selector.invoke(var2.next())).doubleValue(); var2.hasNext(); var3 = Math.min(var3, var5)) {
            var5 = ((Number)selector.invoke(var2.next())).doubleValue();
         }

         return var3;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <K, V> float minOf(Map<? extends K, ? extends V> $this$minOf, Function1<? super Entry<? extends K, ? extends V>, Float> selector) {
      Intrinsics.checkNotNullParameter($this$minOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator var2 = ((Iterable)$this$minOf.entrySet()).iterator();
      if (!var2.hasNext()) {
         throw new NoSuchElementException();
      } else {
         float var3;
         float var4;
         for(var3 = ((Number)selector.invoke(var2.next())).floatValue(); var2.hasNext(); var3 = Math.min(var3, var4)) {
            var4 = ((Number)selector.invoke(var2.next())).floatValue();
         }

         return var3;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <K, V, R extends Comparable<? super R>> R minOf(Map<? extends K, ? extends V> $this$minOf, Function1<? super Entry<? extends K, ? extends V>, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator var2 = ((Iterable)$this$minOf.entrySet()).iterator();
      if (!var2.hasNext()) {
         throw new NoSuchElementException();
      } else {
         Comparable var3 = (Comparable)selector.invoke(var2.next());

         while(var2.hasNext()) {
            Comparable var4 = (Comparable)selector.invoke(var2.next());
            if (var3.compareTo(var4) > 0) {
               var3 = var4;
            }
         }

         return var3;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <K, V> Double minOfOrNull(Map<? extends K, ? extends V> $this$minOfOrNull, Function1<? super Entry<? extends K, ? extends V>, Double> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator var2 = ((Iterable)$this$minOfOrNull.entrySet()).iterator();
      Double var10000;
      if (!var2.hasNext()) {
         var10000 = null;
      } else {
         double var3;
         double var5;
         for(var3 = ((Number)selector.invoke(var2.next())).doubleValue(); var2.hasNext(); var3 = Math.min(var3, var5)) {
            var5 = ((Number)selector.invoke(var2.next())).doubleValue();
         }

         var10000 = var3;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <K, V> Float minOfOrNull(Map<? extends K, ? extends V> $this$minOfOrNull, Function1<? super Entry<? extends K, ? extends V>, Float> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator var2 = ((Iterable)$this$minOfOrNull.entrySet()).iterator();
      Float var10000;
      if (!var2.hasNext()) {
         var10000 = null;
      } else {
         float var3;
         float var4;
         for(var3 = ((Number)selector.invoke(var2.next())).floatValue(); var2.hasNext(); var3 = Math.min(var3, var4)) {
            var4 = ((Number)selector.invoke(var2.next())).floatValue();
         }

         var10000 = var3;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <K, V, R extends Comparable<? super R>> R minOfOrNull(Map<? extends K, ? extends V> $this$minOfOrNull, Function1<? super Entry<? extends K, ? extends V>, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator var2 = ((Iterable)$this$minOfOrNull.entrySet()).iterator();
      Comparable var10000;
      if (!var2.hasNext()) {
         var10000 = null;
      } else {
         Comparable var3 = (Comparable)selector.invoke(var2.next());

         while(var2.hasNext()) {
            Comparable var4 = (Comparable)selector.invoke(var2.next());
            if (var3.compareTo(var4) > 0) {
               var3 = var4;
            }
         }

         var10000 = var3;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <K, V, R> R minOfWith(Map<? extends K, ? extends V> $this$minOfWith, Comparator<? super R> comparator, Function1<? super Entry<? extends K, ? extends V>, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator var3 = ((Iterable)$this$minOfWith.entrySet()).iterator();
      if (!var3.hasNext()) {
         throw new NoSuchElementException();
      } else {
         Object var4 = selector.invoke(var3.next());

         while(var3.hasNext()) {
            Object var5 = selector.invoke(var3.next());
            if (comparator.compare(var4, var5) > 0) {
               var4 = var5;
            }
         }

         return var4;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @InlineOnly
   private static final <K, V, R> R minOfWithOrNull(Map<? extends K, ? extends V> $this$minOfWithOrNull, Comparator<? super R> comparator, Function1<? super Entry<? extends K, ? extends V>, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfWithOrNull, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      Iterator var3 = ((Iterable)$this$minOfWithOrNull.entrySet()).iterator();
      Object var10000;
      if (!var3.hasNext()) {
         var10000 = null;
      } else {
         Object var4 = selector.invoke(var3.next());

         while(var3.hasNext()) {
            Object var5 = selector.invoke(var3.next());
            if (comparator.compare(var4, var5) > 0) {
               var4 = var5;
            }
         }

         var10000 = var4;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minWithOrThrow"
   )
   @InlineOnly
   private static final <K, V> Entry<K, V> minWithOrThrow(Map<? extends K, ? extends V> $this$minWith, Comparator<? super Entry<? extends K, ? extends V>> comparator) {
      Intrinsics.checkNotNullParameter($this$minWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return (Entry)CollectionsKt.minWithOrThrow((Iterable)$this$minWith.entrySet(), comparator);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final <K, V> Entry<K, V> minWithOrNull(Map<? extends K, ? extends V> $this$minWithOrNull, Comparator<? super Entry<? extends K, ? extends V>> comparator) {
      Intrinsics.checkNotNullParameter($this$minWithOrNull, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return (Entry)CollectionsKt.minWithOrNull((Iterable)$this$minWithOrNull.entrySet(), comparator);
   }

   public static final <K, V> boolean none(@NotNull Map<? extends K, ? extends V> $this$none) {
      Intrinsics.checkNotNullParameter($this$none, "<this>");
      return $this$none.isEmpty();
   }

   public static final <K, V> boolean none(@NotNull Map<? extends K, ? extends V> $this$none, @NotNull Function1<? super Entry<? extends K, ? extends V>, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$none, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$none = false;
      if ($this$none.isEmpty()) {
         return true;
      } else {
         Iterator var3 = $this$none.entrySet().iterator();

         Entry element;
         do {
            if (!var3.hasNext()) {
               return true;
            }

            element = (Entry)var3.next();
         } while(!(Boolean)predicate.invoke(element));

         return false;
      }
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <K, V, M extends Map<? extends K, ? extends V>> M onEach(@NotNull M $this$onEach, @NotNull Function1<? super Entry<? extends K, ? extends V>, Unit> action) {
      Intrinsics.checkNotNullParameter($this$onEach, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      int $i$f$onEach = false;
      int var5 = false;
      Iterator var6 = $this$onEach.entrySet().iterator();

      while(var6.hasNext()) {
         Entry element = (Entry)var6.next();
         action.invoke(element);
      }

      return $this$onEach;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <K, V, M extends Map<? extends K, ? extends V>> M onEachIndexed(@NotNull M $this$onEachIndexed, @NotNull Function2<? super Integer, ? super Entry<? extends K, ? extends V>, Unit> action) {
      Intrinsics.checkNotNullParameter($this$onEachIndexed, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      int $i$f$onEachIndexed = false;
      int var5 = false;
      Iterable $this$forEachIndexed$iv = (Iterable)$this$onEachIndexed.entrySet();
      int $i$f$forEachIndexed = false;
      int index$iv = 0;

      Object item$iv;
      int var11;
      for(Iterator var9 = $this$forEachIndexed$iv.iterator(); var9.hasNext(); action.invoke(var11, item$iv)) {
         item$iv = var9.next();
         var11 = index$iv++;
         if (var11 < 0) {
            CollectionsKt.throwIndexOverflow();
         }
      }

      return $this$onEachIndexed;
   }

   @InlineOnly
   private static final <K, V> Iterable<Entry<K, V>> asIterable(Map<? extends K, ? extends V> $this$asIterable) {
      Intrinsics.checkNotNullParameter($this$asIterable, "<this>");
      return (Iterable)$this$asIterable.entrySet();
   }

   @NotNull
   public static final <K, V> Sequence<Entry<K, V>> asSequence(@NotNull Map<? extends K, ? extends V> $this$asSequence) {
      Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
      return CollectionsKt.asSequence((Iterable)$this$asSequence.entrySet());
   }

   public MapsKt___MapsKt() {
   }
}
