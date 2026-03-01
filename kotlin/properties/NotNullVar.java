package kotlin.properties;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class NotNullVar<T> implements ReadWriteProperty<Object, T> {
   @Nullable
   private T value;

   public NotNullVar() {
   }

   @NotNull
   public T getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
      Intrinsics.checkNotNullParameter(property, "property");
      return this.value;
   }

   public void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, @NotNull T value) {
      Intrinsics.checkNotNullParameter(property, "property");
      Intrinsics.checkNotNullParameter(value, "value");
      this.value = value;
   }

   @NotNull
   public String toString() {
      return "NotNullProperty(" + (this.value != null ? "value=" + this.value : "value not initialized yet") + ')';
   }
}
