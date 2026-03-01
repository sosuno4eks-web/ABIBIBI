package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.BuilderInference;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

class MapsKt__MapsKt extends MapsKt__MapsJVMKt {
   @NotNull
   public static final <K, V> Map<K, V> emptyMap() {
      EmptyMap var10000 = EmptyMap.INSTANCE;
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
      return (Map)var10000;
   }

   @NotNull
   public static final <K, V> Map<K, V> mapOf(@NotNull Pair<? extends K, ? extends V>... pairs) {
      Intrinsics.checkNotNullParameter(pairs, "pairs");
      return pairs.length > 0 ? MapsKt.toMap(pairs, (Map)(new LinkedHashMap(MapsKt.mapCapacity(pairs.length)))) : MapsKt.emptyMap();
   }

   @InlineOnly
   private static final <K, V> Map<K, V> mapOf() {
      return MapsKt.emptyMap();
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final <K, V> Map<K, V> mutableMapOf() {
      return (Map)(new LinkedHashMap());
   }

   @NotNull
   public static final <K, V> Map<K, V> mutableMapOf(@NotNull Pair<? extends K, ? extends V>... pairs) {
      Intrinsics.checkNotNullParameter(pairs, "pairs");
      LinkedHashMap var1 = new LinkedHashMap(MapsKt.mapCapacity(pairs.length));
      int var3 = false;
      MapsKt.putAll((Map)var1, pairs);
      return (Map)var1;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final <K, V> HashMap<K, V> hashMapOf() {
      return new HashMap();
   }

   @NotNull
   public static final <K, V> HashMap<K, V> hashMapOf(@NotNull Pair<? extends K, ? extends V>... pairs) {
      Intrinsics.checkNotNullParameter(pairs, "pairs");
      HashMap var1 = new HashMap(MapsKt.mapCapacity(pairs.length));
      int var3 = false;
      MapsKt.putAll((Map)var1, pairs);
      return var1;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final <K, V> LinkedHashMap<K, V> linkedMapOf() {
      return new LinkedHashMap();
   }

   @NotNull
   public static final <K, V> LinkedHashMap<K, V> linkedMapOf(@NotNull Pair<? extends K, ? extends V>... pairs) {
      Intrinsics.checkNotNullParameter(pairs, "pairs");
      return (LinkedHashMap)MapsKt.toMap(pairs, (Map)(new LinkedHashMap(MapsKt.mapCapacity(pairs.length))));
   }

   @SinceKotlin(
      version = "1.6"
   )
   @InlineOnly
   private static final <K, V> Map<K, V> buildMap(@BuilderInference Function1<? super Map<K, V>, Unit> builderAction) {
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      Map var1 = MapsKt.createMapBuilder();
      builderAction.invoke(var1);
      return MapsKt.build(var1);
   }

   @SinceKotlin(
      version = "1.6"
   )
   @InlineOnly
   private static final <K, V> Map<K, V> buildMap(int capacity, @BuilderInference Function1<? super Map<K, V>, Unit> builderAction) {
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      Map var2 = MapsKt.createMapBuilder(capacity);
      builderAction.invoke(var2);
      return MapsKt.build(var2);
   }

   @InlineOnly
   private static final <K, V> boolean isNotEmpty(Map<? extends K, ? extends V> $this$isNotEmpty) {
      Intrinsics.checkNotNullParameter($this$isNotEmpty, "<this>");
      return !$this$isNotEmpty.isEmpty();
   }

   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <K, V> boolean isNullOrEmpty(Map<? extends K, ? extends V> $this$isNullOrEmpty) {
      return $this$isNullOrEmpty == null || $this$isNullOrEmpty.isEmpty();
   }

   @InlineOnly
   private static final <K, V> Map<K, V> orEmpty(Map<K, ? extends V> $this$orEmpty) {
      Map var10000 = $this$orEmpty;
      if ($this$orEmpty == null) {
         var10000 = MapsKt.emptyMap();
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <M extends Map<?, ?> & R, R> R ifEmpty(M $this$ifEmpty, Function0<? extends R> defaultValue) {
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      return $this$ifEmpty.isEmpty() ? defaultValue.invoke() : $this$ifEmpty;
   }

   @InlineOnly
   private static final <K, V> boolean contains(Map<? extends K, ? extends V> $this$contains, K key) {
      Intrinsics.checkNotNullParameter($this$contains, "<this>");
      return $this$contains.containsKey(key);
   }

   @InlineOnly
   private static final <K, V> V get(Map<? extends K, ? extends V> $this$get, K key) {
      Intrinsics.checkNotNullParameter($this$get, "<this>");
      return $this$get.get(key);
   }

   @InlineOnly
   private static final <K, V> void set(Map<K, V> $this$set, K key, V value) {
      Intrinsics.checkNotNullParameter($this$set, "<this>");
      $this$set.put(key, value);
   }

   @InlineOnly
   private static final <K> boolean containsKey(Map<? extends K, ?> $this$containsKey, K key) {
      Intrinsics.checkNotNullParameter($this$containsKey, "<this>");
      return $this$containsKey.containsKey(key);
   }

   @InlineOnly
   private static final <K, V> boolean containsValue(Map<K, ? extends V> $this$containsValue, V value) {
      Intrinsics.checkNotNullParameter($this$containsValue, "<this>");
      return $this$containsValue.containsValue(value);
   }

   @InlineOnly
   private static final <K, V> V remove(Map<? extends K, V> $this$remove, K key) {
      Intrinsics.checkNotNullParameter($this$remove, "<this>");
      return TypeIntrinsics.asMutableMap($this$remove).remove(key);
   }

   @InlineOnly
   private static final <K, V> K component1(Entry<? extends K, ? extends V> $this$component1) {
      Intrinsics.checkNotNullParameter($this$component1, "<this>");
      return $this$component1.getKey();
   }

   @InlineOnly
   private static final <K, V> V component2(Entry<? extends K, ? extends V> $this$component2) {
      Intrinsics.checkNotNullParameter($this$component2, "<this>");
      return $this$component2.getValue();
   }

   @InlineOnly
   private static final <K, V> Pair<K, V> toPair(Entry<? extends K, ? extends V> $this$toPair) {
      Intrinsics.checkNotNullParameter($this$toPair, "<this>");
      return new Pair($this$toPair.getKey(), $this$toPair.getValue());
   }

   @InlineOnly
   private static final <K, V> V getOrElse(Map<K, ? extends V> $this$getOrElse, K key, Function0<? extends V> defaultValue) {
      Intrinsics.checkNotNullParameter($this$getOrElse, "<this>");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      Object var10000 = $this$getOrElse.get(key);
      if (var10000 == null) {
         var10000 = defaultValue.invoke();
      }

      return var10000;
   }

   public static final <K, V> V getOrElseNullable(@NotNull Map<K, ? extends V> $this$getOrElseNullable, K key, @NotNull Function0<? extends V> defaultValue) {
      Intrinsics.checkNotNullParameter($this$getOrElseNullable, "<this>");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      int $i$f$getOrElseNullable = false;
      Object value = $this$getOrElseNullable.get(key);
      return value == null && !$this$getOrElseNullable.containsKey(key) ? defaultValue.invoke() : value;
   }

   @SinceKotlin(
      version = "1.1"
   )
   public static final <K, V> V getValue(@NotNull Map<K, ? extends V> $this$getValue, K key) {
      Intrinsics.checkNotNullParameter($this$getValue, "<this>");
      return MapsKt.getOrImplicitDefaultNullable($this$getValue, key);
   }

   public static final <K, V> V getOrPut(@NotNull Map<K, V> $this$getOrPut, K key, @NotNull Function0<? extends V> defaultValue) {
      Intrinsics.checkNotNullParameter($this$getOrPut, "<this>");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      int $i$f$getOrPut = false;
      Object value = $this$getOrPut.get(key);
      Object var10000;
      if (value == null) {
         Object answer = defaultValue.invoke();
         $this$getOrPut.put(key, answer);
         var10000 = answer;
      } else {
         var10000 = value;
      }

      return var10000;
   }

   @InlineOnly
   private static final <K, V> Iterator<Entry<K, V>> iterator(Map<? extends K, ? extends V> $this$iterator) {
      Intrinsics.checkNotNullParameter($this$iterator, "<this>");
      return $this$iterator.entrySet().iterator();
   }

   @JvmName(
      name = "mutableIterator"
   )
   @InlineOnly
   private static final <K, V> Iterator<Entry<K, V>> mutableIterator(Map<K, V> $this$iterator) {
      Intrinsics.checkNotNullParameter($this$iterator, "<this>");
      return $this$iterator.entrySet().iterator();
   }

   @NotNull
   public static final <K, V, R, M extends Map<? super K, ? super R>> M mapValuesTo(@NotNull Map<? extends K, ? extends V> $this$mapValuesTo, @NotNull M destination, @NotNull Function1<? super Entry<? extends K, ? extends V>, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapValuesTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapValuesTo = false;
      Iterable $this$associateByTo$iv = (Iterable)$this$mapValuesTo.entrySet();
      int $i$f$associateByTo = false;
      Iterator var6 = $this$associateByTo$iv.iterator();

      while(var6.hasNext()) {
         Object element$iv = var6.next();
         Entry it = (Entry)element$iv;
         int var9 = false;
         destination.put(it.getKey(), transform.invoke(element$iv));
      }

      return destination;
   }

   @NotNull
   public static final <K, V, R, M extends Map<? super R, ? super V>> M mapKeysTo(@NotNull Map<? extends K, ? extends V> $this$mapKeysTo, @NotNull M destination, @NotNull Function1<? super Entry<? extends K, ? extends V>, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapKeysTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapKeysTo = false;
      Iterable $this$associateByTo$iv = (Iterable)$this$mapKeysTo.entrySet();
      int $i$f$associateByTo = false;
      Iterator var6 = $this$associateByTo$iv.iterator();

      while(var6.hasNext()) {
         Object element$iv = var6.next();
         Object var10001 = transform.invoke(element$iv);
         Entry it = (Entry)element$iv;
         Object var11 = var10001;
         int var9 = false;
         Object var12 = it.getValue();
         destination.put(var11, var12);
      }

      return destination;
   }

   public static final <K, V> void putAll(@NotNull Map<? super K, ? super V> $this$putAll, @NotNull Pair<? extends K, ? extends V>[] pairs) {
      Intrinsics.checkNotNullParameter($this$putAll, "<this>");
      Intrinsics.checkNotNullParameter(pairs, "pairs");
      int var2 = 0;

      for(int var3 = pairs.length; var2 < var3; ++var2) {
         Pair var4 = pairs[var2];
         Object key = var4.component1();
         Object value = var4.component2();
         $this$putAll.put(key, value);
      }

   }

   public static final <K, V> void putAll(@NotNull Map<? super K, ? super V> $this$putAll, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
      Intrinsics.checkNotNullParameter($this$putAll, "<this>");
      Intrinsics.checkNotNullParameter(pairs, "pairs");
      Iterator var2 = pairs.iterator();

      while(var2.hasNext()) {
         Pair var3 = (Pair)var2.next();
         Object key = var3.component1();
         Object value = var3.component2();
         $this$putAll.put(key, value);
      }

   }

   public static final <K, V> void putAll(@NotNull Map<? super K, ? super V> $this$putAll, @NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
      Intrinsics.checkNotNullParameter($this$putAll, "<this>");
      Intrinsics.checkNotNullParameter(pairs, "pairs");
      Iterator var2 = pairs.iterator();

      while(var2.hasNext()) {
         Pair var3 = (Pair)var2.next();
         Object key = var3.component1();
         Object value = var3.component2();
         $this$putAll.put(key, value);
      }

   }

   @NotNull
   public static final <K, V, R> Map<K, R> mapValues(@NotNull Map<? extends K, ? extends V> $this$mapValues, @NotNull Function1<? super Entry<? extends K, ? extends V>, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapValues, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapValues = false;
      Map destination$iv = (Map)(new LinkedHashMap(MapsKt.mapCapacity($this$mapValues.size())));
      int $i$f$mapValuesTo = false;
      Iterable $this$associateByTo$iv$iv = (Iterable)$this$mapValues.entrySet();
      int $i$f$associateByTo = false;
      Iterator var8 = $this$associateByTo$iv$iv.iterator();

      while(var8.hasNext()) {
         Object element$iv$iv = var8.next();
         Entry it$iv = (Entry)element$iv$iv;
         int var12 = false;
         destination$iv.put(it$iv.getKey(), transform.invoke(element$iv$iv));
      }

      return destination$iv;
   }

   @NotNull
   public static final <K, V, R> Map<R, V> mapKeys(@NotNull Map<? extends K, ? extends V> $this$mapKeys, @NotNull Function1<? super Entry<? extends K, ? extends V>, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapKeys, "<this>");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int $i$f$mapKeys = false;
      Map destination$iv = (Map)(new LinkedHashMap(MapsKt.mapCapacity($this$mapKeys.size())));
      int $i$f$mapKeysTo = false;
      Iterable $this$associateByTo$iv$iv = (Iterable)$this$mapKeys.entrySet();
      int $i$f$associateByTo = false;
      Iterator var8 = $this$associateByTo$iv$iv.iterator();

      while(var8.hasNext()) {
         Object element$iv$iv = var8.next();
         Object var10001 = transform.invoke(element$iv$iv);
         Entry it$iv = (Entry)element$iv$iv;
         Object var11 = var10001;
         int var13 = false;
         Object var14 = it$iv.getValue();
         destination$iv.put(var11, var14);
      }

      return destination$iv;
   }

   @NotNull
   public static final <K, V> Map<K, V> filterKeys(@NotNull Map<? extends K, ? extends V> $this$filterKeys, @NotNull Function1<? super K, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterKeys, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filterKeys = false;
      LinkedHashMap result = new LinkedHashMap();
      Iterator var4 = $this$filterKeys.entrySet().iterator();

      while(var4.hasNext()) {
         Entry entry = (Entry)var4.next();
         if ((Boolean)predicate.invoke(entry.getKey())) {
            result.put(entry.getKey(), entry.getValue());
         }
      }

      return (Map)result;
   }

   @NotNull
   public static final <K, V> Map<K, V> filterValues(@NotNull Map<? extends K, ? extends V> $this$filterValues, @NotNull Function1<? super V, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterValues, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filterValues = false;
      LinkedHashMap result = new LinkedHashMap();
      Iterator var4 = $this$filterValues.entrySet().iterator();

      while(var4.hasNext()) {
         Entry entry = (Entry)var4.next();
         if ((Boolean)predicate.invoke(entry.getValue())) {
            result.put(entry.getKey(), entry.getValue());
         }
      }

      return (Map)result;
   }

   @NotNull
   public static final <K, V, M extends Map<? super K, ? super V>> M filterTo(@NotNull Map<? extends K, ? extends V> $this$filterTo, @NotNull M destination, @NotNull Function1<? super Entry<? extends K, ? extends V>, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filterTo = false;
      Iterator var4 = $this$filterTo.entrySet().iterator();

      while(var4.hasNext()) {
         Entry element = (Entry)var4.next();
         if ((Boolean)predicate.invoke(element)) {
            destination.put(element.getKey(), element.getValue());
         }
      }

      return destination;
   }

   @NotNull
   public static final <K, V> Map<K, V> filter(@NotNull Map<? extends K, ? extends V> $this$filter, @NotNull Function1<? super Entry<? extends K, ? extends V>, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filter, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filter = false;
      Map destination$iv = (Map)(new LinkedHashMap());
      int $i$f$filterTo = false;
      Iterator var6 = $this$filter.entrySet().iterator();

      while(var6.hasNext()) {
         Entry element$iv = (Entry)var6.next();
         if ((Boolean)predicate.invoke(element$iv)) {
            destination$iv.put(element$iv.getKey(), element$iv.getValue());
         }
      }

      return destination$iv;
   }

   @NotNull
   public static final <K, V, M extends Map<? super K, ? super V>> M filterNotTo(@NotNull Map<? extends K, ? extends V> $this$filterNotTo, @NotNull M destination, @NotNull Function1<? super Entry<? extends K, ? extends V>, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterNotTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filterNotTo = false;
      Iterator var4 = $this$filterNotTo.entrySet().iterator();

      while(var4.hasNext()) {
         Entry element = (Entry)var4.next();
         if (!(Boolean)predicate.invoke(element)) {
            destination.put(element.getKey(), element.getValue());
         }
      }

      return destination;
   }

   @NotNull
   public static final <K, V> Map<K, V> filterNot(@NotNull Map<? extends K, ? extends V> $this$filterNot, @NotNull Function1<? super Entry<? extends K, ? extends V>, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterNot, "<this>");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$filterNot = false;
      Map destination$iv = (Map)(new LinkedHashMap());
      int $i$f$filterNotTo = false;
      Iterator var6 = $this$filterNot.entrySet().iterator();

      while(var6.hasNext()) {
         Entry element$iv = (Entry)var6.next();
         if (!(Boolean)predicate.invoke(element$iv)) {
            destination$iv.put(element$iv.getKey(), element$iv.getValue());
         }
      }

      return destination$iv;
   }

   @NotNull
   public static final <K, V> Map<K, V> toMap(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> $this$toMap) {
      Intrinsics.checkNotNullParameter($this$toMap, "<this>");
      if ($this$toMap instanceof Collection) {
         Map var10000;
         switch(((Collection)$this$toMap).size()) {
         case 0:
            var10000 = MapsKt.emptyMap();
            break;
         case 1:
            var10000 = MapsKt.mapOf($this$toMap instanceof List ? (Pair)((List)$this$toMap).get(0) : (Pair)((Collection)$this$toMap).iterator().next());
            break;
         default:
            var10000 = MapsKt.toMap($this$toMap, (Map)(new LinkedHashMap(MapsKt.mapCapacity(((Collection)$this$toMap).size()))));
         }

         return var10000;
      } else {
         return MapsKt.optimizeReadOnlyMap(MapsKt.toMap($this$toMap, (Map)(new LinkedHashMap())));
      }
   }

   @NotNull
   public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> $this$toMap, @NotNull M destination) {
      Intrinsics.checkNotNullParameter($this$toMap, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      int var4 = false;
      MapsKt.putAll(destination, $this$toMap);
      return destination;
   }

   @NotNull
   public static final <K, V> Map<K, V> toMap(@NotNull Pair<? extends K, ? extends V>[] $this$toMap) {
      Intrinsics.checkNotNullParameter($this$toMap, "<this>");
      Map var10000;
      switch($this$toMap.length) {
      case 0:
         var10000 = MapsKt.emptyMap();
         break;
      case 1:
         var10000 = MapsKt.mapOf($this$toMap[0]);
         break;
      default:
         var10000 = MapsKt.toMap($this$toMap, (Map)(new LinkedHashMap(MapsKt.mapCapacity($this$toMap.length))));
      }

      return var10000;
   }

   @NotNull
   public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@NotNull Pair<? extends K, ? extends V>[] $this$toMap, @NotNull M destination) {
      Intrinsics.checkNotNullParameter($this$toMap, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      int var4 = false;
      MapsKt.putAll(destination, $this$toMap);
      return destination;
   }

   @NotNull
   public static final <K, V> Map<K, V> toMap(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> $this$toMap) {
      Intrinsics.checkNotNullParameter($this$toMap, "<this>");
      return MapsKt.optimizeReadOnlyMap(MapsKt.toMap($this$toMap, (Map)(new LinkedHashMap())));
   }

   @NotNull
   public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> $this$toMap, @NotNull M destination) {
      Intrinsics.checkNotNullParameter($this$toMap, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      int var4 = false;
      MapsKt.putAll(destination, $this$toMap);
      return destination;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <K, V> Map<K, V> toMap(@NotNull Map<? extends K, ? extends V> $this$toMap) {
      Intrinsics.checkNotNullParameter($this$toMap, "<this>");
      Map var10000;
      switch($this$toMap.size()) {
      case 0:
         var10000 = MapsKt.emptyMap();
         break;
      case 1:
         var10000 = MapsKt.toSingletonMap($this$toMap);
         break;
      default:
         var10000 = MapsKt.toMutableMap($this$toMap);
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <K, V> Map<K, V> toMutableMap(@NotNull Map<? extends K, ? extends V> $this$toMutableMap) {
      Intrinsics.checkNotNullParameter($this$toMutableMap, "<this>");
      return (Map)(new LinkedHashMap($this$toMutableMap));
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@NotNull Map<? extends K, ? extends V> $this$toMap, @NotNull M destination) {
      Intrinsics.checkNotNullParameter($this$toMap, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      int var4 = false;
      destination.putAll($this$toMap);
      return destination;
   }

   @NotNull
   public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> $this$plus, @NotNull Pair<? extends K, ? extends V> pair) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(pair, "pair");
      Map var10000;
      if ($this$plus.isEmpty()) {
         var10000 = MapsKt.mapOf(pair);
      } else {
         LinkedHashMap var2 = new LinkedHashMap($this$plus);
         int var4 = false;
         var2.put(pair.getFirst(), pair.getSecond());
         var10000 = (Map)var2;
      }

      return var10000;
   }

   @NotNull
   public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> $this$plus, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(pairs, "pairs");
      Map var10000;
      if ($this$plus.isEmpty()) {
         var10000 = MapsKt.toMap(pairs);
      } else {
         LinkedHashMap var2 = new LinkedHashMap($this$plus);
         int var4 = false;
         MapsKt.putAll((Map)var2, pairs);
         var10000 = (Map)var2;
      }

      return var10000;
   }

   @NotNull
   public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> $this$plus, @NotNull Pair<? extends K, ? extends V>[] pairs) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(pairs, "pairs");
      Map var10000;
      if ($this$plus.isEmpty()) {
         var10000 = MapsKt.toMap(pairs);
      } else {
         LinkedHashMap var2 = new LinkedHashMap($this$plus);
         int var4 = false;
         MapsKt.putAll((Map)var2, pairs);
         var10000 = (Map)var2;
      }

      return var10000;
   }

   @NotNull
   public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> $this$plus, @NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(pairs, "pairs");
      LinkedHashMap var2 = new LinkedHashMap($this$plus);
      int var4 = false;
      MapsKt.putAll((Map)var2, pairs);
      return MapsKt.optimizeReadOnlyMap((Map)var2);
   }

   @NotNull
   public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> $this$plus, @NotNull Map<? extends K, ? extends V> map) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(map, "map");
      LinkedHashMap var2 = new LinkedHashMap($this$plus);
      int var4 = false;
      var2.putAll(map);
      return (Map)var2;
   }

   @InlineOnly
   private static final <K, V> void plusAssign(Map<? super K, ? super V> $this$plusAssign, Pair<? extends K, ? extends V> pair) {
      Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
      Intrinsics.checkNotNullParameter(pair, "pair");
      $this$plusAssign.put(pair.getFirst(), pair.getSecond());
   }

   @InlineOnly
   private static final <K, V> void plusAssign(Map<? super K, ? super V> $this$plusAssign, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
      Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
      Intrinsics.checkNotNullParameter(pairs, "pairs");
      MapsKt.putAll($this$plusAssign, pairs);
   }

   @InlineOnly
   private static final <K, V> void plusAssign(Map<? super K, ? super V> $this$plusAssign, Pair<? extends K, ? extends V>[] pairs) {
      Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
      Intrinsics.checkNotNullParameter(pairs, "pairs");
      MapsKt.putAll($this$plusAssign, pairs);
   }

   @InlineOnly
   private static final <K, V> void plusAssign(Map<? super K, ? super V> $this$plusAssign, Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
      Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
      Intrinsics.checkNotNullParameter(pairs, "pairs");
      MapsKt.putAll($this$plusAssign, pairs);
   }

   @InlineOnly
   private static final <K, V> void plusAssign(Map<? super K, ? super V> $this$plusAssign, Map<K, ? extends V> map) {
      Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
      Intrinsics.checkNotNullParameter(map, "map");
      $this$plusAssign.putAll(map);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <K, V> Map<K, V> minus(@NotNull Map<? extends K, ? extends V> $this$minus, K key) {
      Intrinsics.checkNotNullParameter($this$minus, "<this>");
      Map var2 = MapsKt.toMutableMap($this$minus);
      int var4 = false;
      var2.remove(key);
      return MapsKt.optimizeReadOnlyMap(var2);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <K, V> Map<K, V> minus(@NotNull Map<? extends K, ? extends V> $this$minus, @NotNull Iterable<? extends K> keys) {
      Intrinsics.checkNotNullParameter($this$minus, "<this>");
      Intrinsics.checkNotNullParameter(keys, "keys");
      Map var2 = MapsKt.toMutableMap($this$minus);
      int var4 = false;
      CollectionsKt.removeAll((Collection)var2.keySet(), keys);
      return MapsKt.optimizeReadOnlyMap(var2);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <K, V> Map<K, V> minus(@NotNull Map<? extends K, ? extends V> $this$minus, @NotNull K[] keys) {
      Intrinsics.checkNotNullParameter($this$minus, "<this>");
      Intrinsics.checkNotNullParameter(keys, "keys");
      Map var2 = MapsKt.toMutableMap($this$minus);
      int var4 = false;
      CollectionsKt.removeAll((Collection)var2.keySet(), keys);
      return MapsKt.optimizeReadOnlyMap(var2);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <K, V> Map<K, V> minus(@NotNull Map<? extends K, ? extends V> $this$minus, @NotNull Sequence<? extends K> keys) {
      Intrinsics.checkNotNullParameter($this$minus, "<this>");
      Intrinsics.checkNotNullParameter(keys, "keys");
      Map var2 = MapsKt.toMutableMap($this$minus);
      int var4 = false;
      CollectionsKt.removeAll((Collection)var2.keySet(), keys);
      return MapsKt.optimizeReadOnlyMap(var2);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final <K, V> void minusAssign(Map<K, V> $this$minusAssign, K key) {
      Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
      $this$minusAssign.remove(key);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final <K, V> void minusAssign(Map<K, V> $this$minusAssign, Iterable<? extends K> keys) {
      Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
      Intrinsics.checkNotNullParameter(keys, "keys");
      CollectionsKt.removeAll((Collection)$this$minusAssign.keySet(), keys);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final <K, V> void minusAssign(Map<K, V> $this$minusAssign, K[] keys) {
      Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
      Intrinsics.checkNotNullParameter(keys, "keys");
      CollectionsKt.removeAll((Collection)$this$minusAssign.keySet(), keys);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final <K, V> void minusAssign(Map<K, V> $this$minusAssign, Sequence<? extends K> keys) {
      Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
      Intrinsics.checkNotNullParameter(keys, "keys");
      CollectionsKt.removeAll((Collection)$this$minusAssign.keySet(), keys);
   }

   @NotNull
   public static final <K, V> Map<K, V> optimizeReadOnlyMap(@NotNull Map<K, ? extends V> $this$optimizeReadOnlyMap) {
      Intrinsics.checkNotNullParameter($this$optimizeReadOnlyMap, "<this>");
      Map var10000;
      switch($this$optimizeReadOnlyMap.size()) {
      case 0:
         var10000 = MapsKt.emptyMap();
         break;
      case 1:
         var10000 = MapsKt.toSingletonMap($this$optimizeReadOnlyMap);
         break;
      default:
         var10000 = $this$optimizeReadOnlyMap;
      }

      return var10000;
   }

   public MapsKt__MapsKt() {
   }
}
