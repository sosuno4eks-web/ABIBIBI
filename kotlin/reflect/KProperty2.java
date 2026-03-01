package kotlin.reflect;

import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface KProperty2<D, E, V> extends KProperty<V>, Function2<D, E, V> {
   V get(D var1, E var2);

   @SinceKotlin(
      version = "1.1"
   )
   @Nullable
   Object getDelegate(D var1, E var2);

   @NotNull
   KProperty2.Getter<D, E, V> getGetter();

   public interface Getter<D, E, V> extends KProperty.Getter<V>, Function2<D, E, V> {
   }
}
