package kotlin.reflect;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

public interface KMutableProperty1<T, V> extends KProperty1<T, V>, KMutableProperty<V> {
   void set(T var1, V var2);

   @NotNull
   KMutableProperty1.Setter<T, V> getSetter();

   public interface Setter<T, V> extends KMutableProperty.Setter<V>, Function2<T, V, Unit> {
   }
}
