package kotlin.properties;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ObservableProperty<V> implements ReadWriteProperty<Object, V> {
   private V value;

   public ObservableProperty(V initialValue) {
      this.value = initialValue;
   }

   protected boolean beforeChange(@NotNull KProperty<?> property, V oldValue, V newValue) {
      Intrinsics.checkNotNullParameter(property, "property");
      return true;
   }

   protected void afterChange(@NotNull KProperty<?> property, V oldValue, V newValue) {
      Intrinsics.checkNotNullParameter(property, "property");
   }

   public V getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
      Intrinsics.checkNotNullParameter(property, "property");
      return this.value;
   }

   public void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, V value) {
      Intrinsics.checkNotNullParameter(property, "property");
      Object oldValue = this.value;
      if (this.beforeChange(property, oldValue, value)) {
         this.value = value;
         this.afterChange(property, oldValue, value);
      }
   }

   @NotNull
   public String toString() {
      return "ObservableProperty(value=" + this.value + ')';
   }
}
