package kotlin.properties;

import kotlin.SinceKotlin;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(
   version = "1.4"
)
public interface PropertyDelegateProvider<T, D> {
   D provideDelegate(T var1, @NotNull KProperty<?> var2);
}
