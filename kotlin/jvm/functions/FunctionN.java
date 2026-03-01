package kotlin.jvm.functions;

import kotlin.Function;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.FunctionBase;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(
   version = "1.3"
)
public interface FunctionN<R> extends Function<R>, FunctionBase<R> {
   R invoke(@NotNull Object... var1);

   int getArity();
}
