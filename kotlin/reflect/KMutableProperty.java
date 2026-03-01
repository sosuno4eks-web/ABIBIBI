package kotlin.reflect;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

public interface KMutableProperty<V> extends KProperty<V> {
   @NotNull
   KMutableProperty.Setter<V> getSetter();

   public interface Setter<V> extends KProperty.Accessor<V>, KFunction<Unit> {
   }
}
