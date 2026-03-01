package kotlin.reflect;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

public interface KMutableProperty2<D, E, V> extends KProperty2<D, E, V>, KMutableProperty<V> {
   void set(D var1, E var2, V var3);

   @NotNull
   KMutableProperty2.Setter<D, E, V> getSetter();

   public interface Setter<D, E, V> extends KMutableProperty.Setter<V>, Function3<D, E, V, Unit> {
   }
}
