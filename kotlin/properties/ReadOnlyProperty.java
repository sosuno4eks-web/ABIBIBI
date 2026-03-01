package kotlin.properties;

import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

public interface ReadOnlyProperty<T, V> {
   V getValue(T var1, @NotNull KProperty<?> var2);
}
