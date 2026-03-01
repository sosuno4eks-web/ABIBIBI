package kotlin.properties;

import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

public interface ReadWriteProperty<T, V> extends ReadOnlyProperty<T, V> {
   V getValue(T var1, @NotNull KProperty<?> var2);

   void setValue(T var1, @NotNull KProperty<?> var2, V var3);
}
