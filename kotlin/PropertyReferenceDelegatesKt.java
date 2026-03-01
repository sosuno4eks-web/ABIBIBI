package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;

public final class PropertyReferenceDelegatesKt {
   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final <V> V getValue(KProperty0<? extends V> $this$getValue, Object thisRef, KProperty<?> property) {
      Intrinsics.checkNotNullParameter($this$getValue, "<this>");
      Intrinsics.checkNotNullParameter(property, "property");
      return $this$getValue.get();
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final <V> void setValue(KMutableProperty0<V> $this$setValue, Object thisRef, KProperty<?> property, V value) {
      Intrinsics.checkNotNullParameter($this$setValue, "<this>");
      Intrinsics.checkNotNullParameter(property, "property");
      $this$setValue.set(value);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final <T, V> V getValue(KProperty1<T, ? extends V> $this$getValue, T thisRef, KProperty<?> property) {
      Intrinsics.checkNotNullParameter($this$getValue, "<this>");
      Intrinsics.checkNotNullParameter(property, "property");
      return $this$getValue.get(thisRef);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final <T, V> void setValue(KMutableProperty1<T, V> $this$setValue, T thisRef, KProperty<?> property, V value) {
      Intrinsics.checkNotNullParameter($this$setValue, "<this>");
      Intrinsics.checkNotNullParameter(property, "property");
      $this$setValue.set(thisRef, value);
   }
}
