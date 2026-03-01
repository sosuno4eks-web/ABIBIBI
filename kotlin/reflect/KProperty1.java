package kotlin.reflect;

import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface KProperty1<T, V> extends KProperty<V>, Function1<T, V> {
   V get(T var1);

   @SinceKotlin(
      version = "1.1"
   )
   @Nullable
   Object getDelegate(T var1);

   @NotNull
   KProperty1.Getter<T, V> getGetter();

   public interface Getter<T, V> extends KProperty.Getter<V>, Function1<T, V> {
   }
}
