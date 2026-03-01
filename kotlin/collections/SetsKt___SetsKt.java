package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

class SetsKt___SetsKt extends SetsKt__SetsKt {
   @NotNull
   public static final <T> Set<T> minus(@NotNull Set<? extends T> $this$minus, T element) {
      Intrinsics.checkNotNullParameter($this$minus, "<this>");
      LinkedHashSet result = new LinkedHashSet(MapsKt.mapCapacity($this$minus.size()));
      boolean removed = false;
      Iterable $this$filterTo$iv = (Iterable)$this$minus;
      int $i$f$filterTo = false;
      Iterator var6 = $this$filterTo$iv.iterator();

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

      return (Set)((Collection)result);
   }

   @NotNull
   public static final <T> Set<T> minus(@NotNull Set<? extends T> $this$minus, @NotNull T[] elements) {
      Intrinsics.checkNotNullParameter($this$minus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      LinkedHashSet result = new LinkedHashSet((Collection)$this$minus);
      CollectionsKt.removeAll((Collection)result, elements);
      return (Set)result;
   }

   @NotNull
   public static final <T> Set<T> minus(@NotNull Set<? extends T> $this$minus, @NotNull Iterable<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$minus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      Collection other = CollectionsKt.convertToListIfNotCollection(elements);
      if (other.isEmpty()) {
         return CollectionsKt.toSet((Iterable)$this$minus);
      } else if (other instanceof Set) {
         Iterable $this$filterNotTo$iv = (Iterable)$this$minus;
         Collection destination$iv = (Collection)(new LinkedHashSet());
         int $i$f$filterNotTo = false;
         Iterator var6 = $this$filterNotTo$iv.iterator();

         while(var6.hasNext()) {
            Object element$iv = var6.next();
            int var9 = false;
            if (!((Set)other).contains(element$iv)) {
               destination$iv.add(element$iv);
            }
         }

         return (Set)destination$iv;
      } else {
         LinkedHashSet result = new LinkedHashSet((Collection)$this$minus);
         result.removeAll(other);
         return (Set)result;
      }
   }

   @NotNull
   public static final <T> Set<T> minus(@NotNull Set<? extends T> $this$minus, @NotNull Sequence<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$minus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      LinkedHashSet result = new LinkedHashSet((Collection)$this$minus);
      CollectionsKt.removeAll((Collection)result, elements);
      return (Set)result;
   }

   @InlineOnly
   private static final <T> Set<T> minusElement(Set<? extends T> $this$minusElement, T element) {
      Intrinsics.checkNotNullParameter($this$minusElement, "<this>");
      return SetsKt.minus($this$minusElement, element);
   }

   @NotNull
   public static final <T> Set<T> plus(@NotNull Set<? extends T> $this$plus, T element) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      LinkedHashSet result = new LinkedHashSet(MapsKt.mapCapacity($this$plus.size() + 1));
      result.addAll((Collection)$this$plus);
      result.add(element);
      return (Set)result;
   }

   @NotNull
   public static final <T> Set<T> plus(@NotNull Set<? extends T> $this$plus, @NotNull T[] elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      LinkedHashSet result = new LinkedHashSet(MapsKt.mapCapacity($this$plus.size() + elements.length));
      result.addAll((Collection)$this$plus);
      CollectionsKt.addAll((Collection)result, elements);
      return (Set)result;
   }

   @NotNull
   public static final <T> Set<T> plus(@NotNull Set<? extends T> $this$plus, @NotNull Iterable<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      Integer var10000 = CollectionsKt.collectionSizeOrNull(elements);
      int var6;
      if (var10000 != null) {
         int it = ((Number)var10000).intValue();
         int var4 = false;
         var6 = $this$plus.size() + it;
      } else {
         var6 = $this$plus.size() * 2;
      }

      int var5 = MapsKt.mapCapacity(var6);
      LinkedHashSet result = new LinkedHashSet(var5);
      result.addAll((Collection)$this$plus);
      CollectionsKt.addAll((Collection)result, elements);
      return (Set)result;
   }

   @NotNull
   public static final <T> Set<T> plus(@NotNull Set<? extends T> $this$plus, @NotNull Sequence<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      LinkedHashSet result = new LinkedHashSet(MapsKt.mapCapacity($this$plus.size() * 2));
      result.addAll((Collection)$this$plus);
      CollectionsKt.addAll((Collection)result, elements);
      return (Set)result;
   }

   @InlineOnly
   private static final <T> Set<T> plusElement(Set<? extends T> $this$plusElement, T element) {
      Intrinsics.checkNotNullParameter($this$plusElement, "<this>");
      return SetsKt.plus($this$plusElement, element);
   }

   public SetsKt___SetsKt() {
   }
}
