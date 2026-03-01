package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class MapsKt__MapWithDefaultKt {
   @JvmName(
      name = "getOrImplicitDefaultNullable"
   )
   @PublishedApi
   public static final <K, V> V getOrImplicitDefaultNullable(@NotNull Map<K, ? extends V> $this$getOrImplicitDefault, K key) {
      Intrinsics.checkNotNullParameter($this$getOrImplicitDefault, "<this>");
      if ($this$getOrImplicitDefault instanceof MapWithDefault) {
         return ((MapWithDefault)$this$getOrImplicitDefault).getOrImplicitDefault(key);
      } else {
         int $i$f$getOrElseNullable = false;
         Object value$iv = $this$getOrImplicitDefault.get(key);
         if (value$iv == null && !$this$getOrImplicitDefault.containsKey(key)) {
            int var5 = false;
            throw new NoSuchElementException("Key " + key + " is missing in the map.");
         } else {
            return value$iv;
         }
      }
   }

   @NotNull
   public static final <K, V> Map<K, V> withDefault(@NotNull Map<K, ? extends V> $this$withDefault, @NotNull Function1<? super K, ? extends V> defaultValue) {
      Intrinsics.checkNotNullParameter($this$withDefault, "<this>");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      return $this$withDefault instanceof MapWithDefault ? MapsKt.withDefault(((MapWithDefault)$this$withDefault).getMap(), defaultValue) : (Map)(new MapWithDefaultImpl($this$withDefault, defaultValue));
   }

   @JvmName(
      name = "withDefaultMutable"
   )
   @NotNull
   public static final <K, V> Map<K, V> withDefaultMutable(@NotNull Map<K, V> $this$withDefault, @NotNull Function1<? super K, ? extends V> defaultValue) {
      Intrinsics.checkNotNullParameter($this$withDefault, "<this>");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      return $this$withDefault instanceof MutableMapWithDefault ? MapsKt.withDefaultMutable(((MutableMapWithDefault)$this$withDefault).getMap(), defaultValue) : (Map)(new MutableMapWithDefaultImpl($this$withDefault, defaultValue));
   }

   public MapsKt__MapWithDefaultKt() {
   }
}
