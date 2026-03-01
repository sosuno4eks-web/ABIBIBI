package kotlin.collections;

import java.util.Map;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

@JvmName(
   name = "MapAccessorsKt"
)
public final class MapAccessorsKt {
   @InlineOnly
   private static final <V, V1 extends V> V1 getValue(Map<? super String, ? extends V> $this$getValue, Object thisRef, KProperty<?> property) {
      Intrinsics.checkNotNullParameter($this$getValue, "<this>");
      Intrinsics.checkNotNullParameter(property, "property");
      return MapsKt.getOrImplicitDefaultNullable($this$getValue, property.getName());
   }

   @JvmName(
      name = "getVar"
   )
   @InlineOnly
   private static final <V, V1 extends V> V1 getVar(Map<? super String, ? extends V> $this$getValue, Object thisRef, KProperty<?> property) {
      Intrinsics.checkNotNullParameter($this$getValue, "<this>");
      Intrinsics.checkNotNullParameter(property, "property");
      return MapsKt.getOrImplicitDefaultNullable($this$getValue, property.getName());
   }

   @InlineOnly
   private static final <V> void setValue(Map<? super String, ? super V> $this$setValue, Object thisRef, KProperty<?> property, V value) {
      Intrinsics.checkNotNullParameter($this$setValue, "<this>");
      Intrinsics.checkNotNullParameter(property, "property");
      $this$setValue.put(property.getName(), value);
   }
}
