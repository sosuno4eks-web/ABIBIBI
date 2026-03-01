package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentMap;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.collections.builders.MapBuilder;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class MapsKt__MapsJVMKt extends MapsKt__MapWithDefaultKt {
   private static final int INT_MAX_POWER_OF_TWO = 1073741824;

   @NotNull
   public static final <K, V> Map<K, V> mapOf(@NotNull Pair<? extends K, ? extends V> pair) {
      Intrinsics.checkNotNullParameter(pair, "pair");
      Map var10000 = Collections.singletonMap(pair.getFirst(), pair.getSecond());
      Intrinsics.checkNotNullExpressionValue(var10000, "singletonMap(...)");
      return var10000;
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <K, V> Map<K, V> buildMapInternal(Function1<? super Map<K, V>, Unit> builderAction) {
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      Map var1 = MapsKt.createMapBuilder();
      builderAction.invoke(var1);
      return MapsKt.build(var1);
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <K, V> Map<K, V> buildMapInternal(int capacity, Function1<? super Map<K, V>, Unit> builderAction) {
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      Map var2 = MapsKt.createMapBuilder(capacity);
      builderAction.invoke(var2);
      return MapsKt.build(var2);
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <K, V> Map<K, V> createMapBuilder() {
      return (Map)(new MapBuilder());
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <K, V> Map<K, V> createMapBuilder(int capacity) {
      return (Map)(new MapBuilder(capacity));
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <K, V> Map<K, V> build(@NotNull Map<K, V> builder) {
      Intrinsics.checkNotNullParameter(builder, "builder");
      return ((MapBuilder)builder).build();
   }

   public static final <K, V> V getOrPut(@NotNull ConcurrentMap<K, V> $this$getOrPut, K key, @NotNull Function0<? extends V> defaultValue) {
      Intrinsics.checkNotNullParameter($this$getOrPut, "<this>");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      int $i$f$getOrPut = false;
      Object var10000 = $this$getOrPut.get(key);
      if (var10000 == null) {
         Object var4 = defaultValue.invoke();
         int var5 = false;
         var10000 = $this$getOrPut.putIfAbsent(key, var4);
         if (var10000 == null) {
            var10000 = var4;
         }
      }

      return var10000;
   }

   @NotNull
   public static final <K extends Comparable<? super K>, V> SortedMap<K, V> toSortedMap(@NotNull Map<? extends K, ? extends V> $this$toSortedMap) {
      Intrinsics.checkNotNullParameter($this$toSortedMap, "<this>");
      return (SortedMap)(new TreeMap($this$toSortedMap));
   }

   @NotNull
   public static final <K, V> SortedMap<K, V> toSortedMap(@NotNull Map<? extends K, ? extends V> $this$toSortedMap, @NotNull Comparator<? super K> comparator) {
      Intrinsics.checkNotNullParameter($this$toSortedMap, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      TreeMap var2 = new TreeMap(comparator);
      int var4 = false;
      var2.putAll($this$toSortedMap);
      return (SortedMap)var2;
   }

   @NotNull
   public static final <K extends Comparable<? super K>, V> SortedMap<K, V> sortedMapOf(@NotNull Pair<? extends K, ? extends V>... pairs) {
      Intrinsics.checkNotNullParameter(pairs, "pairs");
      TreeMap var1 = new TreeMap();
      int var3 = false;
      MapsKt.putAll((Map)var1, pairs);
      return (SortedMap)var1;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <K, V> SortedMap<K, V> sortedMapOf(@NotNull Comparator<? super K> comparator, @NotNull Pair<? extends K, ? extends V>... pairs) {
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(pairs, "pairs");
      TreeMap var2 = new TreeMap(comparator);
      int var4 = false;
      MapsKt.putAll((Map)var2, pairs);
      return (SortedMap)var2;
   }

   @InlineOnly
   private static final Properties toProperties(Map<String, String> $this$toProperties) {
      Intrinsics.checkNotNullParameter($this$toProperties, "<this>");
      Properties var1 = new Properties();
      int var3 = false;
      var1.putAll($this$toProperties);
      return var1;
   }

   @InlineOnly
   private static final <K, V> Map<K, V> toSingletonMapOrSelf(Map<K, ? extends V> $this$toSingletonMapOrSelf) {
      Intrinsics.checkNotNullParameter($this$toSingletonMapOrSelf, "<this>");
      return MapsKt.toSingletonMap($this$toSingletonMapOrSelf);
   }

   @NotNull
   public static final <K, V> Map<K, V> toSingletonMap(@NotNull Map<? extends K, ? extends V> $this$toSingletonMap) {
      Intrinsics.checkNotNullParameter($this$toSingletonMap, "<this>");
      Entry $this$toSingletonMap_u24lambda_u245 = (Entry)$this$toSingletonMap.entrySet().iterator().next();
      int var2 = false;
      Map var10000 = Collections.singletonMap($this$toSingletonMap_u24lambda_u245.getKey(), $this$toSingletonMap_u24lambda_u245.getValue());
      Intrinsics.checkNotNullExpressionValue(var10000, "with(...)");
      return var10000;
   }

   @PublishedApi
   public static final int mapCapacity(int expectedSize) {
      return expectedSize < 0 ? expectedSize : (expectedSize < 3 ? expectedSize + 1 : (expectedSize < 1073741824 ? (int)((float)expectedSize / 0.75F + 1.0F) : Integer.MAX_VALUE));
   }

   public MapsKt__MapsJVMKt() {
   }
}
