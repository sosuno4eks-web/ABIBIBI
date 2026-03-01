package kotlin.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class GroupingKt__GroupingKt extends GroupingKt__GroupingJVMKt {
   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <T, K, R> Map<K, R> aggregate(@NotNull Grouping<T, ? extends K> $this$aggregate, @NotNull Function4<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$aggregate, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$aggregate = false;
      Grouping $this$aggregateTo$iv = $this$aggregate;
      Map destination$iv = (Map)(new LinkedHashMap());
      int $i$f$aggregateTo = false;
      Iterator var6 = $this$aggregate.sourceIterator();

      while(var6.hasNext()) {
         Object e$iv = var6.next();
         Object key$iv = $this$aggregateTo$iv.keyOf(e$iv);
         Object accumulator$iv = destination$iv.get(key$iv);
         destination$iv.put(key$iv, operation.invoke(key$iv, accumulator$iv, e$iv, accumulator$iv == null && !destination$iv.containsKey(key$iv)));
      }

      return destination$iv;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <T, K, R, M extends Map<? super K, R>> M aggregateTo(@NotNull Grouping<T, ? extends K> $this$aggregateTo, @NotNull M destination, @NotNull Function4<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$aggregateTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$aggregateTo = false;
      Iterator var4 = $this$aggregateTo.sourceIterator();

      while(var4.hasNext()) {
         Object e = var4.next();
         Object key = $this$aggregateTo.keyOf(e);
         Object accumulator = destination.get(key);
         destination.put(key, operation.invoke(key, accumulator, e, accumulator == null && !destination.containsKey(key)));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <T, K, R> Map<K, R> fold(@NotNull Grouping<T, ? extends K> $this$fold, @NotNull Function2<? super K, ? super T, ? extends R> initialValueSelector, @NotNull Function3<? super K, ? super R, ? super T, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$fold, "<this>");
      Intrinsics.checkNotNullParameter(initialValueSelector, "initialValueSelector");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$fold = false;
      int $i$f$aggregate = false;
      Grouping $this$aggregateTo$iv$iv = $this$fold;
      Map destination$iv$iv = (Map)(new LinkedHashMap());
      int $i$f$aggregateTo = false;
      Iterator var9 = $this$fold.sourceIterator();

      while(var9.hasNext()) {
         Object e$iv$iv = var9.next();
         Object key$iv$iv = $this$aggregateTo$iv$iv.keyOf(e$iv$iv);
         Object accumulator$iv$iv = destination$iv$iv.get(key$iv$iv);
         boolean first = accumulator$iv$iv == null && !destination$iv$iv.containsKey(key$iv$iv);
         int var17 = false;
         Object var20 = operation.invoke(key$iv$iv, first ? initialValueSelector.invoke(key$iv$iv, e$iv$iv) : accumulator$iv$iv, e$iv$iv);
         destination$iv$iv.put(key$iv$iv, var20);
      }

      return destination$iv$iv;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <T, K, R, M extends Map<? super K, R>> M foldTo(@NotNull Grouping<T, ? extends K> $this$foldTo, @NotNull M destination, @NotNull Function2<? super K, ? super T, ? extends R> initialValueSelector, @NotNull Function3<? super K, ? super R, ? super T, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$foldTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(initialValueSelector, "initialValueSelector");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$foldTo = false;
      Grouping $this$aggregateTo$iv = $this$foldTo;
      int $i$f$aggregateTo = false;
      Iterator var7 = $this$foldTo.sourceIterator();

      while(var7.hasNext()) {
         Object e$iv = var7.next();
         Object key$iv = $this$aggregateTo$iv.keyOf(e$iv);
         Object accumulator$iv = destination.get(key$iv);
         boolean first = accumulator$iv == null && !destination.containsKey(key$iv);
         int var15 = false;
         Object var18 = operation.invoke(key$iv, first ? initialValueSelector.invoke(key$iv, e$iv) : accumulator$iv, e$iv);
         destination.put(key$iv, var18);
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <T, K, R> Map<K, R> fold(@NotNull Grouping<T, ? extends K> $this$fold, R initialValue, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$fold, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$fold = false;
      int $i$f$aggregate = false;
      Grouping $this$aggregateTo$iv$iv = $this$fold;
      Map destination$iv$iv = (Map)(new LinkedHashMap());
      int $i$f$aggregateTo = false;
      Iterator var9 = $this$fold.sourceIterator();

      while(var9.hasNext()) {
         Object e$iv$iv = var9.next();
         Object key$iv$iv = $this$aggregateTo$iv$iv.keyOf(e$iv$iv);
         Object accumulator$iv$iv = destination$iv$iv.get(key$iv$iv);
         boolean first = accumulator$iv$iv == null && !destination$iv$iv.containsKey(key$iv$iv);
         int var16 = false;
         Object var19 = operation.invoke(first ? initialValue : accumulator$iv$iv, e$iv$iv);
         destination$iv$iv.put(key$iv$iv, var19);
      }

      return destination$iv$iv;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <T, K, R, M extends Map<? super K, R>> M foldTo(@NotNull Grouping<T, ? extends K> $this$foldTo, @NotNull M destination, R initialValue, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$foldTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$foldTo = false;
      Grouping $this$aggregateTo$iv = $this$foldTo;
      int $i$f$aggregateTo = false;
      Iterator var7 = $this$foldTo.sourceIterator();

      while(var7.hasNext()) {
         Object e$iv = var7.next();
         Object key$iv = $this$aggregateTo$iv.keyOf(e$iv);
         Object accumulator$iv = destination.get(key$iv);
         boolean first = accumulator$iv == null && !destination.containsKey(key$iv);
         int var14 = false;
         Object var17 = operation.invoke(first ? initialValue : accumulator$iv, e$iv);
         destination.put(key$iv, var17);
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <S, T extends S, K> Map<K, S> reduce(@NotNull Grouping<T, ? extends K> $this$reduce, @NotNull Function3<? super K, ? super S, ? super T, ? extends S> operation) {
      Intrinsics.checkNotNullParameter($this$reduce, "<this>");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$reduce = false;
      int $i$f$aggregate = false;
      Grouping $this$aggregateTo$iv$iv = $this$reduce;
      Map destination$iv$iv = (Map)(new LinkedHashMap());
      int $i$f$aggregateTo = false;
      Iterator var8 = $this$reduce.sourceIterator();

      while(var8.hasNext()) {
         Object e$iv$iv = var8.next();
         Object key$iv$iv = $this$aggregateTo$iv$iv.keyOf(e$iv$iv);
         Object accumulator$iv$iv = destination$iv$iv.get(key$iv$iv);
         boolean first = accumulator$iv$iv == null && !destination$iv$iv.containsKey(key$iv$iv);
         int var16 = false;
         Object var19 = first ? e$iv$iv : operation.invoke(key$iv$iv, accumulator$iv$iv, e$iv$iv);
         destination$iv$iv.put(key$iv$iv, var19);
      }

      return destination$iv$iv;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <S, T extends S, K, M extends Map<? super K, S>> M reduceTo(@NotNull Grouping<T, ? extends K> $this$reduceTo, @NotNull M destination, @NotNull Function3<? super K, ? super S, ? super T, ? extends S> operation) {
      Intrinsics.checkNotNullParameter($this$reduceTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int $i$f$reduceTo = false;
      Grouping $this$aggregateTo$iv = $this$reduceTo;
      int $i$f$aggregateTo = false;
      Iterator var6 = $this$reduceTo.sourceIterator();

      while(var6.hasNext()) {
         Object e$iv = var6.next();
         Object key$iv = $this$aggregateTo$iv.keyOf(e$iv);
         Object accumulator$iv = destination.get(key$iv);
         boolean first = accumulator$iv == null && !destination.containsKey(key$iv);
         int var14 = false;
         Object var17 = first ? e$iv : operation.invoke(key$iv, accumulator$iv, e$iv);
         destination.put(key$iv, var17);
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <T, K, M extends Map<? super K, Integer>> M eachCountTo(@NotNull Grouping<T, ? extends K> $this$eachCountTo, @NotNull M destination) {
      Intrinsics.checkNotNullParameter($this$eachCountTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Object initialValue$iv = 0;
      int $i$f$foldTo = false;
      Grouping $this$aggregateTo$iv$iv = $this$eachCountTo;
      int $i$f$aggregateTo = false;
      Iterator var7 = $this$eachCountTo.sourceIterator();

      while(var7.hasNext()) {
         Object e$iv$iv = var7.next();
         Object key$iv$iv = $this$aggregateTo$iv$iv.keyOf(e$iv$iv);
         Object accumulator$iv$iv = destination.get(key$iv$iv);
         boolean first$iv = accumulator$iv$iv == null && !destination.containsKey(key$iv$iv);
         int var16 = false;
         int acc = ((Number)(first$iv ? initialValue$iv : accumulator$iv$iv)).intValue();
         int var18 = false;
         Integer var19 = acc + 1;
         destination.put(key$iv$iv, var19);
      }

      return destination;
   }

   public GroupingKt__GroupingKt() {
   }
}
