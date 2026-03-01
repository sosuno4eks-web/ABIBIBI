package kotlin.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

class GroupingKt__GroupingJVMKt {
   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <T, K> Map<K, Integer> eachCount(@NotNull Grouping<T, ? extends K> $this$eachCount) {
      Intrinsics.checkNotNullParameter($this$eachCount, "<this>");
      Map destination$iv = (Map)(new LinkedHashMap());
      int $i$f$foldTo = false;
      Grouping $this$aggregateTo$iv$iv = $this$eachCount;
      int $i$f$aggregateTo = false;
      Iterator var6 = $this$eachCount.sourceIterator();

      while(var6.hasNext()) {
         Object e$iv$iv = var6.next();
         Object key$iv$iv = $this$aggregateTo$iv$iv.keyOf(e$iv$iv);
         Object accumulator$iv$iv = destination$iv.get(key$iv$iv);
         boolean first$iv = accumulator$iv$iv == null && !destination$iv.containsKey(key$iv$iv);
         int var16 = false;
         Object var10001;
         if (first$iv) {
            int var19 = false;
            var10001 = new Ref.IntRef();
         } else {
            var10001 = accumulator$iv$iv;
         }

         Ref.IntRef acc = (Ref.IntRef)var10001;
         int var20 = false;
         int var23 = false;
         ++acc.element;
         destination$iv.put(key$iv$iv, acc);
      }

      Map var1 = destination$iv;
      Iterable var25 = (Iterable)destination$iv.entrySet();
      Iterator var26 = var25.iterator();

      while(var26.hasNext()) {
         Entry var27 = (Entry)var26.next();
         Intrinsics.checkNotNull(var27, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
         Entry var24 = TypeIntrinsics.asMutableMapEntry(var27);
         int var28 = false;
         var24.setValue(((Ref.IntRef)var27.getValue()).element);
      }

      return TypeIntrinsics.asMutableMap(var1);
   }

   @PublishedApi
   @InlineOnly
   private static final <K, V, R> Map<K, R> mapValuesInPlace(Map<K, V> $this$mapValuesInPlace, Function1<? super Entry<? extends K, ? extends V>, ? extends R> f) {
      Intrinsics.checkNotNullParameter($this$mapValuesInPlace, "<this>");
      Intrinsics.checkNotNullParameter(f, "f");
      Iterable $this$forEach$iv = (Iterable)$this$mapValuesInPlace.entrySet();
      int $i$f$forEach = false;
      Iterator var4 = $this$forEach$iv.iterator();

      while(var4.hasNext()) {
         Object element$iv = var4.next();
         Entry it = (Entry)element$iv;
         int var7 = false;
         Intrinsics.checkNotNull(it, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
         TypeIntrinsics.asMutableMapEntry(it).setValue(f.invoke(it));
      }

      return TypeIntrinsics.asMutableMap($this$mapValuesInPlace);
   }

   public GroupingKt__GroupingJVMKt() {
   }
}
