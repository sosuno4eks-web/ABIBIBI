package kotlin.reflect;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

public interface KMutableProperty0<V> extends KProperty0<V>, KMutableProperty<V> {
   void set(V var1);

   @NotNull
   KMutableProperty0.Setter<V> getSetter();

   public interface Setter<V> extends KMutableProperty.Setter<V>, Function1<V, Unit> {
   }
}
