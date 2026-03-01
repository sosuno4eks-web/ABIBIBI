package kotlin.reflect;

import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface KProperty0<V> extends KProperty<V>, Function0<V> {
   V get();

   @SinceKotlin(
      version = "1.1"
   )
   @Nullable
   Object getDelegate();

   @NotNull
   KProperty0.Getter<V> getGetter();

   public interface Getter<V> extends KProperty.Getter<V>, Function0<V> {
   }
}
